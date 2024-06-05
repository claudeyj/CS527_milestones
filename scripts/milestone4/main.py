from pathlib import Path
from utils import extract_line_trigger_tests
from milestone2.diffutils import extract_diff
from milestone2.grade_statistics import get_all_change_files
import sys
from milestone4 import *
from typing import Tuple, List, Dict

def get_all_tests_num(bug_dir:Path) -> int:
    buggy_version_test_log = bug_dir / 'Buggy-Version-All.log'
    with open(buggy_version_test_log, 'r') as f:
        lines = f.readlines()
        for line in lines[::-1]:
            if 'Tests run: ' in line:
                return int(line.split('Tests run: ')[1].split(',')[0])

    raise FileNotFoundError(f"Cannot find test number in {buggy_version_test_log}")

def get_failing_tests_num(bug_dir:Path) -> int:
    buggy_version_test_log = bug_dir / 'Buggy-Version-All.log'
    with open(buggy_version_test_log, 'r') as f:
        lines = f.readlines()
        for line in lines[::-1]:
            if 'Failures: ' in line:
                return int(line.split('Failures: ')[1].split(',')[0]) + int(line.split('Errors: ')[1].split(',')[0])

    raise FileNotFoundError(f"Cannot find failing test number in {buggy_version_test_log}")

def get_susp_score(location:Tuple[str, int], coverage_dict:Dict[str, Tuple]) -> float:
    file_path, line = location
    file_rela_path = get_rela_path(file_path)
    line_test_dict = coverage_dict[file_rela_path]["line_test_dict"]
    test_pass_dict = coverage_dict[file_rela_path]["test_pass_dict"]
    # line_test_dict is specifict to the "file_path" file
    if line not in line_test_dict:
        return 0.0
    covering_tests = line_test_dict[line]
    covering_passing_tests = [test for test in covering_tests if test_pass_dict[test]]
    covering_failing_tests = [test for test in covering_tests if not test_pass_dict[test]]
    covering_passing_tests_count = len(covering_passing_tests)
    covering_failing_tests_count = len(covering_failing_tests)
    all_failing_tests_count = get_failing_tests_num(bug_dir)
    all_tests_count = get_all_tests_num(bug_dir)
    passing_tests_count = all_tests_count - all_failing_tests_count
    
    return (covering_failing_tests_count / all_failing_tests_count) / ((covering_passing_tests_count / passing_tests_count) + (covering_failing_tests_count / all_failing_tests_count))

def get_buggy_locations(bug_dir:Path, diff_file:Path, dataset_id:str) -> Path:
    changed_files, added_files, deleted_files = get_all_change_files(bug_dir)
    if dataset_id == 'QuixBugs':
        changed_files = [(bug_dir / 'Buggy-Version' / 'java_programs' / (bug_dir.name + '.java')).as_posix()]
    print(f"Changed Files: {changed_files}")
    buggy_locations = []
    for file in changed_files:
        buggy_lines, patched_lines = extract_diff(diff_file, file)
        for buggy_line in buggy_lines:
            buggy_locations.append((file, buggy_line))

    return buggy_locations

def get_all_locations(bug_dir:Path, dataset_id:str) -> Path:
    changed_files, added_files, deleted_files = get_all_change_files(bug_dir)
    if dataset_id == 'QuixBugs':
        changed_files = [(bug_dir / 'Buggy-Version' / 'java_programs' / (bug_dir.name + '.java')).as_posix()]
    print(f"Changed Files: {changed_files}")
    all_locations = []
    for file in changed_files:
        with open(bug_dir / 'Buggy-Version' / file, 'r') as f:
            lines = f.readlines()
        for i in range(len(lines)):
            all_locations.append((file, i + 1))

    return all_locations

def get_rela_path(file:str) -> str:
    if "src/main/java" in file:
        file_rela_path = file.split("src/main/java/")[1]
    elif "src/java" in file:
        file_rela_path = file.split("src/java/")[1]
    elif "src" in file:
        file_rela_path = file.split("src/")[1]
    else:
        # for quixbugs
        file_rela_path = file.split("Buggy-Version/")[1]

    return file_rela_path

def get_all_coverage_info_of_changed(bug_dir:Path):
    # targeting buggy version
    changed_files, added_files, deleted_files = get_all_change_files(bug_dir)
    if dataset_id == 'QuixBugs':
        changed_files = [(bug_dir / 'Buggy-Version' / 'java_programs' / (bug_dir.name + '.java')).as_posix()]
    coverage_dict = {}
    for file in changed_files:
        file_rela_path = get_rela_path(file)
        coverage_js = bug_dir / 'Coverage' / 'Buggy-Version-All' / 'site' / 'clover' / (file_rela_path.replace('.java', '.js'))
        if not coverage_js.exists():
            raise FileNotFoundError(f"Cannot find coverage file {coverage_js}")
        classes, test_line_dict, test_pass_dict, line_test_dict = extract_line_trigger_tests(coverage_js)
        coverage_dict[file_rela_path] = {
            'classes': classes,
            'test_line_dict': test_line_dict,
            'test_pass_dict': test_pass_dict,
            'line_test_dict': line_test_dict
        }

    return coverage_dict

def get_susp_for_locations(locations:Tuple[str, int], coverage_dict:Dict[str, Tuple]) -> Dict[str, float]:
    susp_dict = {}
    for location in locations:
        susp_dict[location] = get_susp_score(location, coverage_dict)

    return susp_dict

def get_susp_ranking(susp_dict:Dict[str, float], location:Tuple[str, int]) -> int:
    ranking = 1
    for loc in susp_dict:
        if susp_dict[loc] > susp_dict[location]:
            ranking += 1

    return ranking

def get_AR(susp_dict:Dict[str, float], buggy_locations:List[Tuple[str, int]]) -> float:
    AR = 0
    for location in buggy_locations:
        AR += get_susp_ranking(susp_dict, location)

    return AR / len(buggy_locations)

def get_FR(susp_dict:Dict[str, float], buggy_locations:List[Tuple[str, int]]) -> float:
    # get the highest ranking of all buggy locations
    FR = 99999
    for location in buggy_locations:
        FR = min(FR, get_susp_ranking(susp_dict, location))

    return FR

if __name__ == '__main__':
    subjects_dir = scripts_dir / '..' / 'subjects'
    for dataset_id in bug_dict:
        if dataset_id != "QuixBugs":
            continue
        for bug_id in bug_dict[dataset_id]:
            bug_dir = subjects_dir / dataset_id / bug_id
            failing_tests_file = bug_dir / FAILING_TESTS
            diff_file = bug_dir / DIFF

            buggy_locations = get_buggy_locations(bug_dir, diff_file, dataset_id)
            all_locations = get_all_locations(bug_dir, dataset_id)

            coverage_dict = get_all_coverage_info_of_changed(bug_dir)
            print(f"Coverage Dict: {coverage_dict.keys()}")
            buggy_susp_dict = get_susp_for_locations(buggy_locations, coverage_dict)
            all_susp_dict = get_susp_for_locations(all_locations, coverage_dict)
            
            print(f"Bug: {bug_id}")
            # print(f"Buggy Locations: {buggy_susp_dict}")
            # print(f"All Locations: {all_susp_dict}")
            
            # sorted_all_susp_locations = sorted(all_susp_dict.keys(), key=lambda x: all_susp_dict[x], reverse=True)
            AR = get_AR(all_susp_dict, buggy_locations)
            FR = get_FR(all_susp_dict, buggy_locations)
            
            print(f"AR: {AR}")
            print(f"FR: {FR}")