from pathlib import Path
from milestone3 import *
from utils import *
import sys, os
from pom import make_clover_pom
from testgen import quix_ori_dir

def hack(bug_id:str, proj_dir:Path):
    if bug_id == 'Codec_12':
        os.remove(proj_dir / 'src/test/java/org/apache/commons/codec/binary/Base64Codec13Test.java')

def get_test_cmd(test_source:str, dataset_id:str, version:str, pom_file:Path, cut_base_name:str=None, coverage_collection:bool=False) -> str:
    if coverage_collection:
        cmd = 'mvn clean clover:setup test clover:aggregate clover:clover -Dcheckstyle.skip -Denforcer.skip -Danimal.sniffer.skip -fn'
    else:
        cmd = 'mvn clean test -Dcheckstyle.skip -Denforcer.skip -Danimal.sniffer.skip -fn'
    if test_source == 'evosuite':
        test_source_flag = ' -Dtest=*ESTest'
        if dataset_id == Dataset.QUIXBUGS.value:
            if cut_base_name is None:
                raise ValueError("cut_base_name must be provided for QuixBugs")
            if version == 'Buggy-Version':
                test_source_flag = f' -Dtest=java_programs.{cut_base_name}_ESTest'
            elif version == 'Patched-Version':
                test_source_flag = f' -Dtest=correct_java_programs.{cut_base_name}_ESTest'
    elif test_source == 'randoop':
        test_source_flag = ' -Dtest=RegressionTest*,ErrorTest*'
    elif test_source == 'all':
        test_source_flag = ''
        if dataset_id == Dataset.QUIXBUGS.value:
            if cut_base_name is None:
                raise ValueError("cut_base_name must be provided for QuixBugs")
            # assume the test is based on junit
            if version == 'Buggy-Version':
                test_source_flag = f' -Dtest=java_testcases.junit.{cut_base_name}_TEST,java_programs.{cut_base_name}_ESTest,RegressionTest*,ErrorTest*'
            elif version == 'Patched-Version':
                test_source_flag = f' -Dtest=java_testcases.junit.crt_program.{cut_base_name}_TEST,correct_java_programs.{cut_base_name}_ESTest,RegressionTest*,ErrorTest*'

    else:
        raise ValueError(f"Unknown test source: {test_source}")
    cmd += test_source_flag
    cmd += f' -f {pom_file.as_posix()}'

    return cmd

def collect_coverage_for_mvn_proj(dataset_id:str, version:str, bug_dir:Path, bug_ori_dir:Path, evo_test_gen_dir:Path, randoop_test_gen_dir:Path, quix_workspace_dir:Path=None):
    proj_dir = bug_dir / version
    if dataset_id == Dataset.QUIXBUGS.value:
        if not quix_workspace_dir.exists():
            shutil.copytree(quix_ori_dir, quix_workspace_dir)
        proj_dir = quix_workspace_dir
    hack(bug_dir.name, proj_dir)
    ori_pom_file = proj_dir / 'pom.xml'
    clover_pom_file = proj_dir / 'pom_for_clover.xml'
    make_clover_pom(ori_pom_file, clover_pom_file)

    # copy tests
    test_dir = get_default_test_dir(proj_dir)
    if test_dir is None:
        raise FileNotFoundError(f"Cannot find test directory in {bug_dir}")
    copy_subdirs(evo_test_gen_dir, test_dir)
    copy_subdirs(randoop_test_gen_dir, test_dir)

    # run tests
    evo_cov_dir = bug_ori_dir / 'Coverage' / (version + '-EvoSuite')
    randoop_cov_dir = bug_ori_dir / 'Coverage' / (version + '-Randoop')
    all_cov_dir = bug_ori_dir / 'Coverage' / (version + '-All')
    for cov_dir in [evo_cov_dir, randoop_cov_dir, all_cov_dir]:
        if cov_dir.exists():
            shutil.rmtree(cov_dir)
        cov_dir.mkdir(parents=True, exist_ok=True)
    # run evosuite tests
    evo_test_cmd = get_test_cmd('evosuite', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=True)
    subprocess.run(evo_test_cmd.split(), cwd=proj_dir)
    shutil.copytree(proj_dir / 'target' / 'site', evo_cov_dir / 'site')
    shutil.copytree(proj_dir / 'target' / 'clover', evo_cov_dir / 'clover')
    # run randoop tests
    randoop_test_cmd = get_test_cmd('randoop', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=True)
    subprocess.run(randoop_test_cmd.split(), cwd=proj_dir)
    shutil.copytree(proj_dir / 'target' / 'site', randoop_cov_dir / 'site')
    shutil.copytree(proj_dir / 'target' / 'clover', randoop_cov_dir / 'clover')
    # run all tests
    all_test_cmd = get_test_cmd('all', dataset_id, version, clover_pom_file, cut_base_name=bug_dir.name, coverage_collection=True)
    subprocess.run(all_test_cmd.split(), cwd=proj_dir)
    shutil.copytree(proj_dir / 'target' / 'site', all_cov_dir / 'site')
    shutil.copytree(proj_dir / 'target' / 'clover', all_cov_dir / 'clover')

# def collect_coverage_for_d4j_proj(bug_dir:Path, bug_ori_dir:Path, evo_test_gen_dir:Path, randoop_test_gen_dir:Path):
#     for version in ['Buggy-Version', 'Patched-Version']:
#         proj_dir = bug_dir / version
        
#         # copy tests
#         test_dir = get_default_test_dir(proj_dir)
#         if test_dir is None:
#             raise FileNotFoundError(f"Cannot find test directory in {bug_dir}")
#         copy_subdirs(evo_test_gen_dir, test_dir)
#         copy_subdirs(randoop_test_gen_dir, test_dir)

#         # run tests
#         evo_cov_dir = bug_ori_dir / 'Coverage' / (version + '-EvoSuite')
#         randoop_cov_dir = bug_ori_dir / 'Coverage' / (version + '-Randoop')
#         all_cov_dir = bug_ori_dir / 'Coverage' / (version + '-All')
#         for cov_dir in [evo_cov_dir, randoop_cov_dir, all_cov_dir]:
#             if cov_dir.exists():
#                 shutil.rmtree(cov_dir)
#             cov_dir.mkdir(parents=True, exist_ok=True)