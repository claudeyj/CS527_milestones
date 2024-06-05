from pathlib import Path
from typing import List
import subprocess
from dataset import Dataset
import shutil

def get_d4j_property(proj_dir:Path, prop:str) -> str:
    prop_file = proj_dir / 'defects4j.build.properties'
    with open(prop_file, 'r') as file:
        for line in file:
            if line.startswith(prop + '='):
                return line.split('=')[1].strip()
    raise KeyError(f"Cannot find {prop} in {prop_file}")

def find_bin_dir(proj_dir:Path) -> Path:
    candidate_dirs = [
        proj_dir / 'target' / 'classes',
        proj_dir / 'build',
    ]
    
    for candidate in candidate_dirs:
        if candidate.exists():
            return candidate

    raise FileNotFoundError(f"Cannot find bin directory in {proj_dir}")

def get_mvn_classpath_list(proj_dir:Path) -> List[str]:
    # make sure there is a pom.xml in the project directory and it is compiled
    # mainly for Bears and BugSwarm
    if not (proj_dir / 'cp.txt').exists():
        subprocess.run('mvn dependency:build-classpath -Dmdep.outputFile=cp.txt'.split(), cwd=proj_dir)
    with open(proj_dir / 'cp.txt', 'r') as file:
        cp = file.read().strip()
    return cp.split(':')

def get_d4j_classpath_list(proj_dir:Path) -> List[str]:
    # for Defects4J
    return subprocess.run('defects4j export -p cp.test'.split(), cwd=proj_dir, capture_output=True).stdout.decode().strip().split(':')

def get_classpath_list(dataset_id:str, bug_id:str, proj_dir:Path) -> List[str]:
    if dataset_id == Dataset.DEFECTS4J.value:
        return get_d4j_classpath_list(proj_dir)
    elif dataset_id == Dataset.QUIXBUGS.value:
        return []
    elif dataset_id in [Dataset.BEARS.value, Dataset.BUGSWARM.value]:
        return get_mvn_classpath_list(proj_dir)

def compile_proj(dataset_id:str, proj_dir:Path, options:List[str]=[]):
    cmd = ''
    if dataset_id == Dataset.DEFECTS4J.value:
        cmd = 'defects4j compile'
    elif dataset_id == Dataset.QUIXBUGS.value:
        # make sure the project has been translated to Maven and compiled
        return
    elif dataset_id in [Dataset.BEARS.value, Dataset.BUGSWARM.value]:
        cmd = 'mvn compile -Dcheckstyle.skip -Denforcer.skip -Danimal.sniffer.skip'
    if len(options) > 0:
        cmd += ' ' + ' '.join(options)
    subprocess.run(cmd.split(), cwd=proj_dir)

def is_mvn_proj(bug_id:str, proj_dir:Path) -> bool:
    # TODO: to be fixed
    return (proj_dir / 'pom.xml').exists()

def reset_workspace(workspace:Path):
    if workspace.exists():
        shutil.rmtree(workspace)
    workspace.mkdir()

def get_default_src_dir(proj_dir:Path) -> Path:
    if (proj_dir / 'src' / 'main' / 'java').exists():
        return (proj_dir / 'src' / 'main' / 'java').resolve()
    elif (proj_dir / 'src' / 'java').exists():
        return (proj_dir / 'src' / 'java').resolve()
    elif (proj_dir / 'src').exists():
        return (proj_dir / 'src').resolve()
    else:
        return None

def get_default_test_dir(proj_dir:Path) -> Path:
    if (proj_dir / 'src' / 'test' / 'java').exists():
        return (proj_dir / 'src' / 'test' / 'java').resolve()
    elif (proj_dir / 'src' / 'test').exists():
        return (proj_dir / 'src' / 'test').resolve()
    elif (proj_dir / 'test').exists():
        return (proj_dir / 'test').resolve()
    else:
        return None

def get_class_name_from_path(dataset_id:str, java_file:Path, proj_dir:Path, bug_id:str) -> str:
    src_dir_dict = {
        
    }
    src_dir = get_default_src_dir(proj_dir)
    if src_dir is None:
        src_dir = src_dir_dict.get(bug_id, None)
    if dataset_id == 'QuixBugs':
        return bug_id
    if src_dir is None:
        raise FileNotFoundError(f"Cannot find src directory in {proj_dir}")
    return java_file.relative_to(src_dir).with_suffix('').as_posix().replace('/', '.')

def get_modified_java_files_from_diff(diff_file:Path) -> List[str]:
    with open(diff_file, 'r') as file:
        lines = file.readlines()
    modified_files = []
    for line in lines:
        if line.startswith('diff -x'):
            file_path = line.strip().split()[-2]
            if file_path.endswith('.java'):
                modified_files.append(file_path)
    return modified_files

def copy_subdirs(src_dir:Path, dest_dir:Path):
    for subdir in src_dir.iterdir():
        if subdir.is_dir():
            shutil.copytree(subdir, dest_dir / subdir.name, dirs_exist_ok=True)
        else:
            shutil.copy(subdir, dest_dir)