import os,sys
from pathlib import Path
import subprocess
from utils import *
from milestone3 import *

quix_ori_dir = root_dir / 'datasets' / 'QuixBugs'

def evosuite_gen(dataset_id:str, bug_id:str, cut:str, output_dir:Path, proj_dir:Path):
    if dataset_id == Dataset.QUIXBUGS.value:
        bin_dir = quix_ori_dir / 'build' / 'classes' / 'java' / 'main'
    else:
        try:
            bin_dir = find_bin_dir(proj_dir)
        except FileNotFoundError as e:
            print(e)
            print(f"{bug_id} not compiled!")
            return

    classpath_list = get_classpath_list(dataset_id, bug_id, proj_dir)
    classpath_list.append(bin_dir.as_posix())

    evosuite_cmd = f"java -jar {EVOSUITE_JAR} -projectCP {':'.join(classpath_list)} -class {cut} -Duse_separate_classloader=false -Dsandbox=false -Dsandbox_mode=OFF -Dsearch_budget={evosuite_budget} -Dtest_dir={output_dir.as_posix()}"

    subprocess.run(evosuite_cmd.split(), cwd=proj_dir)

def randoop_gen(dataset_id:str, bug_id:str, cut:str, output_dir:Path, proj_dir:Path):
    if dataset_id == Dataset.QUIXBUGS.value:
        bin_dir = quix_ori_dir / 'build' / 'classes' / 'java' / 'main'
    else:
        try:
            bin_dir = find_bin_dir(proj_dir)
        except FileNotFoundError as e:
            print(e)
            print(f"{bug_id} not compiled!")
            return

    classpath_list = get_classpath_list(dataset_id, bug_id, proj_dir)
    classpath_list.append(bin_dir.as_posix())

    randoop_cmd = f"java -classpath {RANDOOP_JAR}:{':'.join(classpath_list)} randoop.main.Main gentests --testclass={cut} --time-limit={randoop_budget} --junit-output-dir={output_dir.as_posix()} --stop-on-error-test=true"

    subprocess.run(randoop_cmd.split(), cwd=proj_dir)
