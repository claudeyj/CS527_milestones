from pathlib import Path
from testgen import evosuite_gen, randoop_gen, quix_ori_dir
from typing import Dict
import json
from milestone3 import *
from utils import *
import shutil
from pom import *
from coverage import collect_coverage_for_mvn_proj, hack, get_test_cmd
import sys

def run_test(dataset_id:str, version:str, bug_dir:Path, bug_ori_dir:Path, evo_test_gen_dir:Path, randoop_test_gen_dir:Path, quix_workspace_dir:Path=None):
    proj_dir = bug_dir / version
    if dataset_id == Dataset.QUIXBUGS.value:
        if not quix_workspace_dir.exists():
            shutil.copytree(quix_ori_dir, quix_workspace_dir)
        proj_dir = quix_workspace_dir
    hack(bug_dir.name, proj_dir)
    ori_pom_file = proj_dir / 'pom.xml'
    # we don't use clover plugin but evosuite dependencies are required
    clover_pom_file = proj_dir / 'pom_for_clover.xml'
    make_clover_pom(ori_pom_file, clover_pom_file)

    # copy tests
    test_dir = get_default_test_dir(proj_dir)
    if test_dir is None:
        raise FileNotFoundError(f"Cannot find test directory in {bug_dir}")
    copy_subdirs(evo_test_gen_dir, test_dir)
    copy_subdirs(randoop_test_gen_dir, test_dir)

    # run tests
    evo_test_log = bug_ori_dir / (version + '-EvoSuite.log')
    randoop_test_log = bug_ori_dir / (version + '-Randoop.log')
    all_test_log = bug_ori_dir / (version + '-All.log')
    # run evosuite tests
    evo_test_cmd = get_test_cmd('evosuite', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=False)
    subprocess.run(evo_test_cmd.split(), cwd=proj_dir, stdout=evo_test_log.open('w'), stderr=subprocess.STDOUT)
    # run randoop tests
    randoop_test_cmd = get_test_cmd('randoop', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=False)
    subprocess.run(randoop_test_cmd.split(), cwd=proj_dir, stdout=randoop_test_log.open('w'), stderr=subprocess.STDOUT)
    # run all tests
    all_test_cmd = get_test_cmd('all', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=False)
    subprocess.run(all_test_cmd.split(), cwd=proj_dir, stdout=all_test_log.open('w'), stderr=subprocess.STDOUT)
    # clear tests
    patterns = ['*_ESTest*', 'RegressionTest*', 'ErrorTest*']
    for file in [file for pattern in patterns for file in test_dir.glob(pattern)]:
        file.unlink()

if __name__ == '__main__':
    mode = sys.argv[1]
    workspace = root_dir / 'workspace' / 'milestone3'
    reset_workspace(workspace)

    for dataset_id in bug_dict:
        for bug_id in bug_dict[dataset_id]:
            bug_ori_dir = scripts_dir / '..' / 'subjects' / dataset_id / bug_id
            bug_dir = workspace / bug_id
            shutil.copytree(bug_ori_dir, bug_dir)
            
            # test generation
            diff_file = bug_ori_dir / 'Diff'
            if dataset_id != 'QuixBugs':
                modified_java_files = get_modified_java_files_from_diff(diff_file)
                modified_classes = [get_class_name_from_path(dataset_id, Path(file), bug_ori_dir / 'Buggy-Version', bug_id) for file in modified_java_files]
            else:
                modified_classes = ['java_programs.' + bug_id]

            for version in ['Buggy-Version', 'Patched-Version']:
                proj_dir = bug_dir / version
                evo_test_gen_dir = GEN_TESTS_DIR / bug_id / version / EVOSUITE_TESTS_DIR_NAME
                randoop_test_gen_dir = GEN_TESTS_DIR / bug_id / version / RANDOOP_TESTS_DIR_NAME
                compile_proj(dataset_id, proj_dir) # for test generation
                if dataset_id == Dataset.QUIXBUGS.value:
                    if version == 'Patched-Version':
                        modified_classes = ['correct_java_programs.' + bug_id]
                    else:
                        modified_classes = ['java_programs.' + bug_id]
                for cut in modified_classes:
                    if not evo_test_gen_dir.exists():
                        print(f"Generating EvoSuite tests for {cut} in {bug_id}")
                        evo_test_gen_dir.mkdir(parents=True, exist_ok=True)
                        evosuite_gen(dataset_id, bug_id, cut, evo_test_gen_dir, proj_dir)
                    else:
                        print(f"EvoSuite tests for {cut} already exist in {bug_id}, skip")
                    if not randoop_test_gen_dir.exists():
                        print(f"Generating Randoop tests for {cut} in {bug_id}")
                        randoop_test_gen_dir.mkdir(parents=True, exist_ok=True)
                        randoop_gen(dataset_id, bug_id, cut, randoop_test_gen_dir, proj_dir)
                    else:
                        print(f"Randoop tests for {cut} already exist in {bug_id}, skip")

                if dataset_id in [Dataset.BEARS.value, Dataset.BUGSWARM.value, Dataset.DEFECTS4J.value, Dataset.QUIXBUGS.value]:
                    # make sure the D4J project is managed by Maven
                    # make sure the QuixBugs project has been translated to Maven
                    if mode == 'coverage':
                        collect_coverage_for_mvn_proj(dataset_id, version, bug_dir, bug_ori_dir, evo_test_gen_dir, randoop_test_gen_dir, quix_workspace_dir=workspace / 'QuixBugs')
                    elif mode == 'test':
                        run_test(dataset_id, version, bug_dir, bug_ori_dir, evo_test_gen_dir, randoop_test_gen_dir, quix_workspace_dir=workspace / 'QuixBugs')