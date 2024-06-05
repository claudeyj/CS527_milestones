from pathlib import Path
import json

scripts_dir = Path(__file__).resolve().parent.parent
root_dir = scripts_dir.parent.resolve()
lib_dir = root_dir / 'lib'
RANDOOP_JAR =  lib_dir / 'randoop-all-4.3.2.jar'
EVOSUITE_JAR = lib_dir / 'evosuite-1.2.0.jar'
EVOSUITE_STANDALONE_JAR = lib_dir / 'evosuite-standalone-runtime-1.2.0.jar'
evosuite_budget = 10
randoop_budget = 10
EVOSUITE_TESTS_DIR_NAME = 'evosuite-tests'
RANDOOP_TESTS_DIR_NAME = 'randoop-tests'
GEN_TESTS_DIR = root_dir / 'gen-tests'
bug_list_json = root_dir / 'metadata' / 'bug_list.json'

bug_dict = json.loads(bug_list_json.read_text())