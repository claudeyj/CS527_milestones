from pathlib import Path
import json

scripts_dir = Path(__file__).resolve().parent.parent
root_dir = scripts_dir.parent.resolve()
bug_list_json = root_dir / 'metadata' / 'bug_list.json'

bug_dict = json.loads(bug_list_json.read_text())
FAILING_TESTS = 'test.txt'
DIFF = 'Diff'