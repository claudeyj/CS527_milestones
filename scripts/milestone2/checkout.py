import subprocess, os, sys
from pathlib import Path
import json, shutil
from calculate_failing_test import *
from milestone3 import *
from milestone3.dataset import Dataset

root_dir = Path(__file__).absolute().parent.parent.parent
subjects_dir = root_dir / 'subjects'
d4j_tool_dir_str = os.getenv('DEFECTS4J_HOME')

if d4j_tool_dir_str is None:
    raise ValueError('Please set the environment variable DEFECTS4J_HOME to the directory of the Defects4J tool')

BUGGY_VERSION = "Buggy-Version"
PATCHED_VERSION = "Patched-Version"
DIFF = "Diff"
FAILING_TESTS = "test.txt"

MVN_ARGS = "-Denforcer.skip=true -Dcheckstyle.skip=true -Dcobertura.skip=true -DskipITs=true -Drat.skip=true -Dlicense.skip=true -Dfindbugs.skip=true -Dgpg.skip=true -Dskip.npm=true -Dskip.gulp=true -Dskip.bower=true -Danimal.sniffer.skip=true".split()

def checkout_d4j(bug_id:str):
    subject_name, id = bug_id.split('_')
    d4j_dir = subjects_dir / 'Defects4J'
    bug_dir = d4j_dir / bug_id
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    diff_file = bug_dir / DIFF
    failing_tests_file = bug_dir / FAILING_TESTS

    os.makedirs(bug_dir, exist_ok=True)
    subprocess.run(['defects4j', 'checkout', '-p', subject_name, '-v', id + 'b', '-w', buggy_version_dir.absolute()])
    subprocess.run(['defects4j', 'checkout', '-p', subject_name, '-v', id + 'f', '-w', patched_version_dir.absolute()])

    subprocess.run(['diff', '-x', '\".*\"', '-x', '.git', '-x', '.defects4j.config', '-ruw', buggy_version_dir.absolute(), patched_version_dir.absolute()], stdout=diff_file.open('w'))

    write_failing_d4j(bug_id, bug_dir)

def checkout_bugswarm(image_tag:str):
    metadata_file = root_dir / 'metadata' / 'Export.json'
    print("metadata_file:", metadata_file.absolute())
    if not metadata_file.exists():
        metadata_file = root_dir / 'Export.json'
        print('The metadata file Export.json does not exist in the submission directory, trying to find it in the root directory of the project.')
        # raise FileNotFoundError('The metadata file Export.json does not exist, please download it from the BugSwarm website and put it in the root directory of the project.')
    with open(metadata_file, 'r') as f:
        metadata = json.load(f)
    bug_info = None
    for bug in metadata:
        if bug['image_tag'] == image_tag:
            bug_info = bug
            break
    if bug_info is None:
        raise ValueError(f'No bug with image tag {image_tag} found in the metadata file')
    buggy_sha = bug_info['failed_job']['trigger_sha']
    fixed_sha = bug_info['passed_job']['trigger_sha']
    repo_link = 'https://github.com/' + bug_info['repo'] + '.git'

    bugswarm_dir = subjects_dir / 'BugSwarm'
    bug_dir = bugswarm_dir / image_tag
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    diff_file = bug_dir / DIFF
    failing_tests_file = bug_dir / FAILING_TESTS

    os.makedirs(bug_dir, exist_ok=True)

    if not buggy_version_dir.exists():
        subprocess.run(['git', 'clone', repo_link, buggy_version_dir.absolute()])
        subprocess.run(['git', 'checkout', buggy_sha], cwd=buggy_version_dir)
    else:
        print(f'{buggy_version_dir} already exists, skipping cloning')
    if not patched_version_dir.exists():
        if buggy_version_dir.exists():
            shutil.copytree(buggy_version_dir, patched_version_dir)
        else:
            subprocess.run(['git', 'clone', repo_link, patched_version_dir.absolute()])
        subprocess.run(['git', 'checkout', fixed_sha], cwd=patched_version_dir)
    else:
        print(f'{patched_version_dir} already exists, skipping cloning')

    subprocess.run(['diff', '-x', '\".*\"', '-x', '.git', '-ruw', buggy_version_dir.absolute(), patched_version_dir.absolute()], stdout=diff_file.open('w'))

    write_failing_bugswarm(image_tag, bug_dir)

def checkout_bears(bug_id:str):
    bears_dir = subjects_dir / 'Bears'
    bears_ori_dir = root_dir / 'datasets' / 'bears-benchmark'
    if not bears_ori_dir.exists():
        raise FileNotFoundError('The Bears benchmark repository does not exist, please download it from the Bears website and put it in the root directory of the project.')
    # branch_json_file = bears_ori_dir / 'scripts/data/bug_id_and_branch.json'
    branch_json_file = bears_ori_dir / 'scripts/data/bug_id_and_branch_2019.json'
    repo_link = 'https://github.com/bears-bugs/bears-benchmark.git'
    with open(branch_json_file, 'r') as f:
        branch_json = json.load(f)

    for item in branch_json:
        if item['bugId'] == bug_id:
            bug_branch = item['bugBranch']
            break

    bug_dir = bears_dir / bug_id
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    diff_file = bug_dir / DIFF
    failing_tests_file = bug_dir / FAILING_TESTS

    os.makedirs(bug_dir, exist_ok=True)
    clone_buggy_cmd = f"git clone -b {bug_branch} --single-branch {repo_link} {buggy_version_dir.absolute()}"
    clone_patched_cmd = f"git clone -b {bug_branch} --single-branch {repo_link} {patched_version_dir.absolute()}"
    
    if not buggy_version_dir.exists():
        subprocess.run(clone_buggy_cmd.split())
        subprocess.run(['git', 'checkout', 'HEAD^^'], cwd=buggy_version_dir)
    if not patched_version_dir.exists():
        subprocess.run(clone_patched_cmd.split())
        subprocess.run(['git', 'checkout', 'HEAD^'], cwd=patched_version_dir)

    cmd = f'diff -x \".*\" -x .git -x \"repairnator.maven.*.log\" -x target -ruw {buggy_version_dir.absolute()} {patched_version_dir.absolute()}'
    subprocess.run(cmd, shell=True, stdout=diff_file.open('w'))

    write_failing_bears(bug_id, bug_dir)

def checkout_quixbugs(bug_id:str):
    # bug_id is the buggy class name
    quix_ori_dir = root_dir / 'datasets' / 'QuixBugs'
    if not quix_ori_dir.exists():
        raise FileNotFoundError('The QuixBugs repository does not exist, please download it from the QuixBugs website and put it in the root directory of the project.')

    # quix_dir = subjects_dir / 'QuixBugs'
    # bug_dir = quix_dir / bug_id
    # buggy_version_dir = bug_dir / BUGGY_VERSION
    # patched_version_dir = bug_dir / PATCHED_VERSION
    # diff_file = bug_dir / DIFF
    # failing_tests_file = bug_dir / FAILING_TESTS

    # os.makedirs(bug_dir, exist_ok=True)
    # buggy_version_dir.mkdir(exist_ok=True)
    # patched_version_dir.mkdir(exist_ok=True)
    # shutil.copy(quix_ori_dir / 'java_programs' / (bug_id + '.java'), buggy_version_dir)
    # shutil.copy(quix_ori_dir / 'correct_java_programs' / (bug_id + '.java'), patched_version_dir)
    # subprocess.run(['diff', '-ruw', buggy_version_dir.absolute(), patched_version_dir.absolute()], stdout=diff_file.open('w'))
    
    copy_quixbugs_files_and_run_diff(bug_id)

    write_failing_quix(bug_id, quix_dir / bug_id)

def copy_quixbugs_files_and_run_diff(bug_id:str):
    quix_ori_dir = root_dir / 'datasets' / 'QuixBugs'
    quix_dir = subjects_dir / 'QuixBugs'
    bug_dir = quix_dir / bug_id
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    os.makedirs(buggy_version_dir / 'java_programs', exist_ok=True)
    os.makedirs(patched_version_dir / 'correct_java_programs', exist_ok=True)
    shutil.copy(quix_ori_dir / 'java_programs' / (bug_id + '.java'), buggy_version_dir / 'java_programs')
    shutil.copy(quix_ori_dir / 'correct_java_programs' / (bug_id + '.java'), patched_version_dir / 'correct_java_programs')
    # shutil.copy(quix_ori_dir / 'java_programs' / (bug_id + '.class'), buggy_version_dir / 'java_programs')
    # shutil.copy(quix_ori_dir / 'correct_java_programs' / (bug_id + '.class'), patched_version_dir / 'correct_java_programs')
    
    subprocess.run(['diff', '-x', '\"*.class\"', '-ruw', (buggy_version_dir / 'java_programs' / (bug_id + '.java')).absolute(), (patched_version_dir / 'correct_java_programs' / (bug_id + '.java')).absolute()], stdout=(bug_dir / DIFF).open('w'))
    
if __name__ == '__main__':
    # example usage:
    # python checkout.py Defects4J Chart_3
    # python checkout.py BugSwarm bobocode-projects-java-fundamentals-exercises-7068728014
    # python checkout.py Bears Bears-3
    # python checkout.py QuixBugs KNAPSACK
    
    if len(sys.argv) == 3:
        dataset = sys.argv[1]
        bug_id = sys.argv[2]
        
        if dataset == 'Defects4J':
            checkout_d4j(bug_id)
        elif dataset == 'BugSwarm':
            checkout_bugswarm(bug_id)
        elif dataset == 'Bears':
            checkout_bears(bug_id)
        elif dataset == 'QuixBugs':
            checkout_quixbugs(bug_id)
        else:
            raise ValueError(f'Unknown dataset {dataset}')
    elif len(sys.argv) == 2 and sys.argv[1] == 'all':
        for dataset_id in bug_dict:
            for bug_id in bug_dict[dataset_id]:
                if dataset_id == Dataset.DEFECTS4J.value:
                    checkout_d4j(bug_id)
                elif dataset_id == Dataset.BUGSWARM.value:
                    checkout_bugswarm(bug_id)
                elif dataset_id == Dataset.BEARS.value:
                    checkout_bears(bug_id)
                elif dataset_id == Dataset.QUIXBUGS.value:
                    checkout_quixbugs(bug_id)
                else:
                    raise ValueError(f'Unknown dataset {dataset_id}')