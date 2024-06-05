import subprocess, os, sys
from pathlib import Path
from typing import List
import tempfile

root_dir = Path(__file__).absolute().parent.parent.parent
subjects_dir = root_dir / 'subjects'
d4j_tool_dir_str = os.getenv('DEFECTS4J_HOME')

FAILING_TESTS = "test.txt"
BUGGY_VERSION = "Buggy-Version"
PATCHED_VERSION = "Patched-Version"

d4j_dir = subjects_dir / 'Defects4J'
bugswarm_dir = subjects_dir / 'BugSwarm'
bears_dir = subjects_dir / 'Bears'
quix_dir = subjects_dir / 'QuixBugs'

if d4j_tool_dir_str is None:
    raise ValueError('Please set the environment variable DEFECTS4J_HOME to the directory of the Defects4J tool')

def write_failing_d4j(bug_id:str, bug_dir:Path):
    failing_tests_file = bug_dir / FAILING_TESTS
    
    if failing_tests_file.exists() and os.path.getsize(failing_tests_file) > 0:
        return
    else:
        print(f'Writing failing tests for {bug_id}')
        # return
    subject_name, id = bug_id.split('_')
    failing_test_meta_file = f'{d4j_tool_dir_str}/framework/projects/{subject_name}/trigger_tests/{id}'
    failing_tests = []
    with open(failing_test_meta_file, 'r') as f:
        for line in f:
            if line.startswith('--- '):
                failing_tests.append(line.split()[1].replace('::', '.'))

    failing_tests = sorted(failing_tests)
    with open(failing_tests_file, 'w') as f:
        for test in failing_tests:
            f.write(test + '\n')

def write_failing_bugswarm(image_tag:str, bug_dir:Path):
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    failing_tests_file = bug_dir / FAILING_TESTS
    
    if failing_tests_file.exists() and os.path.getsize(failing_tests_file) > 0:
        return
    else:
        print(f'Writing failing tests for {image_tag}')
        # return
    
    if (buggy_version_dir / 'pom.xml').exists():
        with tempfile.NamedTemporaryFile() as temp_f:
            subprocess.run(['mvn', 'test'], cwd=buggy_version_dir, stdout=temp_f, stderr=temp_f)
            temp_f.seek(0)  # Reset the file pointer to the beginning of the file
            buggy_failing_tests = __extract_failing_tests_from_mvn_log__(temp_f.name)
        
        with tempfile.NamedTemporaryFile() as temp_f:
            subprocess.run(['mvn', 'test'], cwd=patched_version_dir, stdout=temp_f, stderr=temp_f)
            temp_f.seek(0)
            patched_failing_tests = __extract_failing_tests_from_mvn_log__(temp_f.name)
    elif (buggy_version_dir / 'build.gradle').exists() or (buggy_version_dir / 'gradlew').exists():
        with tempfile.NamedTemporaryFile() as temp_f:
            subprocess.run(['gradle', 'test'], cwd=buggy_version_dir, stdout=temp_f, stderr=temp_f)
            temp_f.seek(0)
            buggy_failing_tests = __extract_failing_tests_from_gradle_log__(Path(temp_f.name))
        
        with tempfile.NamedTemporaryFile() as temp_f:
            subprocess.run(['gradle', 'test'], cwd=patched_version_dir, stdout=temp_f, stderr=temp_f)
            temp_f.seek(0)
            patched_failing_tests = __extract_failing_tests_from_gradle_log__(Path(temp_f.name))
    else:
        raise ValueError('No build file found')
    failing_tests = list(set(buggy_failing_tests) - set(patched_failing_tests))
    
    if len(failing_tests) == 0:
        print(f'No failing tests found for {bug_dir}')
    with open(failing_tests_file, 'w') as f:
        for test in failing_tests:
            f.write(test + '\n')

def write_failing_bears(bug_id:str, bug_dir:Path):
    buggy_version_dir = bug_dir / BUGGY_VERSION
    patched_version_dir = bug_dir / PATCHED_VERSION
    failing_tests_file = bug_dir / FAILING_TESTS
    
    if failing_tests_file.exists() and os.path.getsize(failing_tests_file) > 0:
        return
    else:
        print(f'Writing failing tests for {bug_id}')
        # return
    
    failing_tests = []
    buggy_version_test_log = buggy_version_dir / 'repairnator.maven.testproject.log'
    patched_version_test_log = patched_version_dir / 'repairnator.maven.testproject.log'
    buggy_failing_tests = __extract_failing_tests_from_mvn_log__(buggy_version_test_log)
    patched_failing_tests = __extract_failing_tests_from_mvn_log__(patched_version_test_log)
    failing_tests = list(set(buggy_failing_tests) - set(patched_failing_tests))
    
    if len(failing_tests) == 0:
        print(f'No failing tests found for {bug_id}')
    with open(failing_tests_file, 'w') as f:
        for test in failing_tests:
            f.write(test + '\n')

def write_failing_quix(bug_id:str, bug_dir:Path):
    quix_ori_dir = root_dir / 'datasets' / 'QuixBugs'
    
    failing_tests_file = bug_dir / FAILING_TESTS
    
    if failing_tests_file.exists() and os.path.getsize(failing_tests_file) > 0:
        return
    else:
        print(f'Writing failing tests for {bug_id}')
        # return
    
    test_result = subprocess.run(['gradle', 'test', '--tests', bug_id + '_TEST'], cwd=quix_ori_dir, capture_output=True, text=True).stdout
    failing_tests = []
    for line in test_result.split('\n'):
        if line.strip().endswith('FAILED') and line.strip().startswith('java_testcases.junit'):
            failing_tests.append(line.split()[0] + '.' + line.split()[2])
    
    failing_tests = sorted(failing_tests)
    with open(failing_tests_file, 'w') as f:
        for test in failing_tests:
            f.write(test + '\n')

def __extract_failing_tests_from_gradle_log__(log_file:Path):
    failing_tests = []
    for line in log_file.read_text().split('\n'):
        if line.strip().endswith('FAILED') and ' > ' in line:
            failing_tests.append(line.split()[0] + '.' + line.split()[2])
    
    failing_tests = sorted(failing_tests)
    return failing_tests

def __extract_failing_tests_from_mvn_log__(log_file:Path):
    failing_tests = []
    # for surefire 2.17
    with open(log_file, 'r') as f:
        lines = f.readlines()
        for i in range(len(lines)):
            line = lines[i].strip()
            if line.endswith('<<< ERROR!') or line.endswith('<<< FAILURE!'):
                if line.startswith('Tests run: '): continue
                if line.startswith('[ERROR] '):
                    line = line[len('[ERROR] '):]
                failing_test_full_name = line.split()[0]
                if '(' in failing_test_full_name and ')' in failing_test_full_name:
                    failing_test_method_name = failing_test_full_name.split('(')[0]
                    failing_test_class_name = failing_test_full_name.split('(')[1].split(')')[0]
                    failing_tests.append(failing_test_class_name + '.' + failing_test_method_name)
                elif '.' not in failing_test_full_name and failing_test_full_name[0].islower():
                    for j in range(i-1, -1, -1):
                        if "Running " in lines[j]:
                            failing_test_class_name = lines[j].split()[-1]
                            if "." in failing_test_class_name and failing_test_class_name.endswith("Test"):
                                failing_tests.append(failing_test_class_name + '.' + failing_test_full_name)
                                break                            
                else:
                    failing_tests.append(failing_test_full_name)
    
    failing_tests = sorted(failing_tests)
    
    return failing_tests

def __get_fine_grained_failing_tests__(failing_tests:List[str], test_result:str):
    fine_grained_failing_tests = []
    failing_test_class_list = [test for test in failing_tests if test.split('.')[-1][0].isupper()]
    for test_class_name in failing_test_class_list:
        for line in test_result.split('\n'):
            if line.strip().startswith('at ' + test_class_name):
                fine_grained_failing_test = line.split()[1]
                if '(' in fine_grained_failing_test and ')' in fine_grained_failing_test:
                    fine_grained_failing_test = fine_grained_failing_test.split('(')[0]
                fine_grained_failing_tests.append(fine_grained_failing_test)
                
    fine_grained_failing_tests += [test for test in failing_tests if test.split('.')[-1][0].islower()]

if __name__ == '__main__':
    # for dataset_dir in [d4j_dir, bugswarm_dir, bears_dir, quix_dir]:
    for dataset_dir in [bears_dir, bugswarm_dir]:
        for bug_id in os.listdir(dataset_dir):
            print(bug_id)
            bug_dir = dataset_dir / bug_id
            # if bug_dir != 'raphw-byte-buddy-140517154': continue
            if bug_id == 'results': continue
            if dataset_dir == d4j_dir:
                write_failing_d4j(bug_id, bug_dir)
            elif dataset_dir == bugswarm_dir:
                write_failing_bugswarm(bug_id, bug_dir)
            elif dataset_dir == bears_dir:
                write_failing_bears(bug_id, bug_dir)
            elif dataset_dir == quix_dir:
                write_failing_quix(bug_id, bug_dir)