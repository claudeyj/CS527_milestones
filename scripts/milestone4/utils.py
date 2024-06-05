from pathlib import Path
import json
from typing import List, Dict, Tuple

def extract_line_trigger_tests(coverage_js:Path) -> Tuple[List[str], Dict[str, List[int]], Dict[str, bool], Dict[int, List[str]]]:
    test_line_dict = {}
    test_pass_dict = {}
    line_test_dict = {}
    classes = []
    with open(coverage_js, 'r') as f:
        lines = f.readlines()
    page_data_dict_str = lines[3].split('=')[1].strip()
    page_data_dict = json.loads(page_data_dict_str)
    classes = [class_item["name"] for class_item in page_data_dict['classes']]
    cov_dict_str = lines[6].split('=')[1].strip()
    cov_dict = json.loads(cov_dict_str)
    for test_id in cov_dict.keys():
        test_name = cov_dict[test_id]['name']
        test_pass = cov_dict[test_id]['pass']
        covered_stmts = [statement["sl"] for statement in cov_dict[test_id]['statements']]
        test_line_dict[test_name] = covered_stmts
        test_pass_dict[test_name] = test_pass
        for stmt in covered_stmts:
            if stmt not in line_test_dict:
                line_test_dict[stmt] = []
            if test_name not in line_test_dict[stmt]:
                line_test_dict[stmt].append(test_name)

    return classes, test_line_dict, test_pass_dict, line_test_dict

if __name__ == '__main__':
    coverage_js = Path('/Users/jun/Documents/TA/CS527/milestone_answer/tmp/Codec_12/Buggy-Version/target/site/clover/org/apache/commons/codec/binary/BaseNCodecInputStream.js')
    classes, test_line_dict, test_pass_dict, line_test_dict = extract_line_trigger_tests(coverage_js)
    print(classes)
    print(test_line_dict)
    print(test_pass_dict)
    print(line_test_dict)