import subprocess, os, sys
from pathlib import Path
import json, shutil
from typing import List, Tuple
import glob
import javalang
import Levenshtein
import lizard
import codebleu
from milestone2.diffutils import extract_diff

BUGGY_VERSION = "Buggy-Version"
PATCHED_VERSION = "Patched-Version"
DIFF = "Diff"
FAILING_TESTS = "test.txt"

def get_method_start_end_lines(method_decl_node:javalang.ast.Node) -> Tuple[int, int]:
    # Initialize start and end line numbers to None
    start_line_no = None
    end_line_no = None
    
    # Check if the node has a position attribute for the start line
    if hasattr(method_decl_node, 'position') and method_decl_node.position:
        start_line_no = method_decl_node.position.line
        
    # Check if the method has a body with statements to determine the end line
    if method_decl_node.body:
        # Look at the position of the last statement in the method body for the end line
        last_statement = method_decl_node.body[-1]
        if hasattr(last_statement, 'position') and last_statement.position:
            end_line_no = last_statement.position.line
            
            # Adjust for multi-line statements by checking the end position if available
            if hasattr(last_statement, 'end_position') and last_statement.end_position:
                end_line_no = last_statement.end_position.line
    else:
        # For methods without a body (e.g., abstract or interface methods),
        # we may consider the method declaration's line as both start and end,
        # or leave the end line as None or use a different logic based on requirements
        end_line_no = start_line_no + 1
        pass
    
    if start_line_no is None or end_line_no is None:
        print(method_decl_node)
        print(f"Could not determine start and end lines for method: {method_decl_node.name}")
        print(f"Start line: {start_line_no}, End line: {end_line_no}")
        raise ValueError("Could not determine start and end lines for method")

    return start_line_no, end_line_no

def count_methods_in_java_file(file_path:Path) -> int:
    with open(file_path, 'r') as file:
        file_content = file.read()

    tree = javalang.parse.parse(file_content)

    method_count = 0
    for _, node in tree.filter(javalang.tree.MethodDeclaration):
        method_count += 1
    return method_count

def count_changed_methods_in_java_file(buggy_file_path:Path, patched_file_path:Path, deleted_lines_in_buggy:List[int], added_lines_in_patched:List[int]) -> int:
    print(buggy_file_path, patched_file_path, deleted_lines_in_buggy, added_lines_in_patched)
    modified_methods = set()
    with open(buggy_file_path, 'r') as file:
        buggy_file_content = file.read()
    with open(patched_file_path, 'r') as file:
        patched_file_content = file.read()

    buggy_tree = javalang.parse.parse(buggy_file_content)
    for _, buggy_node in buggy_tree.filter(javalang.tree.MethodDeclaration):
        begin_line, end_line = get_method_start_end_lines(buggy_node)
        for line in deleted_lines_in_buggy:
            if begin_line <= line and line <= end_line:
                modified_methods.add(__get_declaring_class__(buggy_node, buggy_tree) + "." + __get_func_signature__(buggy_node))
                break

    patched_tree = javalang.parse.parse(patched_file_content)
    for _, patched_node in javalang.parse.parse(patched_file_content).filter(javalang.tree.MethodDeclaration):
        begin_line, end_line = get_method_start_end_lines(patched_node)
        # check whether this method is added
        for line in added_lines_in_patched:
            if begin_line <= line and line <= end_line:
                modified_methods.add(__get_declaring_class__(patched_node, patched_tree) + "." + __get_func_signature__(patched_node))
                break

    return len(modified_methods)

def __get_func_signature__(node:javalang.tree.MethodDeclaration) -> str:
    return f"{node.name}({','.join([param.type.name for param in node.parameters])})"

def __get_declaring_class__(node:javalang.tree.MethodDeclaration, tree:javalang.tree.CompilationUnit) -> str:
    for path, parent in tree.filter(javalang.tree.ClassDeclaration):
        for method in parent.methods:
            if __get_func_signature__(method) == __get_func_signature__(node) and method.position == node.position:
                return parent.name
    
    return tree.package.name + "." + tree.types[0].name
    # raise ValueError(f"Could not find declaring class for method: {node.name} in {tree.package.name}.{tree.types[0].name}")
    

def get_all_change_files(bug_dir:str) -> Tuple[List[str], List[str], List[str]]:
    # CChange: Number of classes changed/added/deleted to patch the bug
    buggy_version_dir = Path(bug_dir) / BUGGY_VERSION
    patched_version_dir = Path(bug_dir) / PATCHED_VERSION
    diff_result = subprocess.run(['diff', '-qr', buggy_version_dir.absolute(), patched_version_dir.absolute()], capture_output=True, text=True, cwd=bug_dir).stdout
    changed_files, added_files, deleted_files = [], [], []
    for line in diff_result.split('\n'):
        if line.startswith('Files'):
            file_abs_path = Path(line.split()[1])
            file_rela_path = file_abs_path.relative_to(buggy_version_dir).as_posix()
            if file_rela_path.endswith('.java'):
                changed_files.append(file_rela_path)
        elif line.startswith('Only in'):
            line = line.strip()
            if line.endswith('.java'):
                dir_path = line.split()[2]
                file_name = line.split()[3]
                if dir_path.startswith(buggy_version_dir.absolute().as_posix()):
                    rela_path = Path(dir_path).relative_to(buggy_version_dir).as_posix()[:-1]
                    deleted_files.append(rela_path + '/' + file_name)
                else:
                    rela_path = Path(dir_path).relative_to(patched_version_dir).as_posix()[:-1]
                    added_files.append(rela_path + '/' + file_name)
    
    return changed_files, added_files, deleted_files

def get_c_change(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    return len(changed_files) + len(added_files) + len(deleted_files)
    
def get_m_change(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # MChange: Number of methods changed/added/deleted to patch the bug
    method_count = 0
    for file in deleted_files:
        file_path = Path(bug_dir) / BUGGY_VERSION / file
        method_count += count_methods_in_java_file(file_path)
    for file in added_files:
        file_path = Path(bug_dir) / PATCHED_VERSION / file
        method_count += count_methods_in_java_file(file_path)
    for file in changed_files:
        deleted_buggy_lines, added_patched_lines = extract_diff(Path(bug_dir) / DIFF, file)
        method_count += count_changed_methods_in_java_file(Path(bug_dir) / BUGGY_VERSION / file, Path(bug_dir) / PATCHED_VERSION / file, deleted_buggy_lines, added_patched_lines)

    return method_count

def get_l_change(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # LChange: Number of lines changed/added/deleted to patch the bug
    changed_lines, added_lines, deleted_lines = 0, 0, 0
    diff_file = Path(bug_dir) / DIFF
    with open(diff_file, 'r') as f:
        for line in f:
            if line.startswith('+') and not line.startswith('+++'):
                added_lines += 1
            elif line.startswith('-') and not line.startswith('---'):
                deleted_lines += 1
            
    return changed_lines + added_lines + deleted_lines

def get_ld(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # LD: Levenshtein edit distance between buggy and patched files
    ld = 0
    for file in changed_files:
        buggy_file = Path(bug_dir) / BUGGY_VERSION / file
        patched_file = Path(bug_dir) / PATCHED_VERSION / file
        with open(buggy_file, 'r') as f:
            buggy_content = f.read()
        with open(patched_file, 'r') as f:
            patched_content = f.read()
        ld += Levenshtein.distance(buggy_content, patched_content)
    return ld

def get_cb_old(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # CB: Cyclomatic complexity of buggy files
    cb = 0
    for file in changed_files:
        buggy_file = Path(bug_dir) / BUGGY_VERSION / file
        cb += lizard.analyze_file(str(buggy_file)).average_cyclomatic_complexity

    return cb

def get_cp_old(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # CP: Cyclomatic complexity of patched files
    cp = 0
    for file in changed_files:
        patched_file = Path(bug_dir) / PATCHED_VERSION / file
        cp += lizard.analyze_file(str(patched_file)).average_cyclomatic_complexity

    return cp

def get_cb(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # CB: Cyclomatic complexity of buggy files
    cb = 0
    for file in changed_files:
        buggy_file = Path(bug_dir) / BUGGY_VERSION / file
        analysis = lizard.analyze_file(str(buggy_file))
        for func in analysis.function_list:
            cb += func.cyclomatic_complexity

    return cb

def get_cp(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # CP: Cyclomatic complexity of patched files
    cp = 0
    for file in changed_files:
        patched_file = Path(bug_dir) / PATCHED_VERSION / file
        analysis = lizard.analyze_file(str(patched_file))
        for func in analysis.function_list:
            cp += func.cyclomatic_complexity

    return cp

def get_cc(CB:int, CP:int) -> int:
    # CC: Complexity change: |CB-CP|
    return abs(CB-CP)

def get_codebleu(bug_dir:str, changed_files:List[str], added_files:List[str], deleted_files:List[str]) -> int:
    # CodeBLEU: between buggy and patched files
    buggy_content_list, patched_content_list = [], []
    for file in changed_files:
        buggy_file = Path(bug_dir) / BUGGY_VERSION / file
        patched_file = Path(bug_dir) / PATCHED_VERSION / file
        with open(buggy_file, 'r') as f:
            buggy_content = f.read()
        with open(patched_file, 'r') as f:
            patched_content = f.read()
        buggy_content_list.append(buggy_content)
        patched_content_list.append(patched_content)
    
    try:
        return codebleu.calc_codebleu(buggy_content_list, patched_content_list, lang='java')['codebleu']
    except ZeroDivisionError:
        print("ZeroDivisionError occurred while calculating CodeBLEU for " + bug_dir)
        return None

def get_gt_stats(bug_dir:str):
    changed_files, added_files, deleted_files = get_all_change_files(bug_dir)
    print(changed_files, added_files, deleted_files)
    
    c_change = get_c_change(bug_dir, changed_files, added_files, deleted_files)
    m_change = get_m_change(bug_dir, changed_files, added_files, deleted_files)
    l_change = get_l_change(bug_dir, changed_files, added_files, deleted_files)
    ld = get_ld(bug_dir, changed_files, added_files, deleted_files)
    cb = get_cb(bug_dir, changed_files, added_files, deleted_files)
    cp = get_cp(bug_dir, changed_files, added_files, deleted_files)
    cc = get_cc(cb, cp)
    codebleu = get_codebleu(bug_dir, changed_files, added_files, deleted_files)
    return c_change, m_change, l_change, ld, cb, cp, cc, codebleu

def display_stats(c_change:int, m_change:int, l_change:int, ld:int, cb:int, cp:int, cc:int, codebleu:int):
    print(f"CChange: {c_change}")
    print(f"MChange: {m_change}")
    print(f"LChange: {l_change}")
    print(f"LD: {ld}")
    print(f"CB: {cb}")
    print(f"CP: {cp}")
    print(f"CC: {cc}")
    print(f"CodeBLEU: {codebleu}")

if __name__ == '__main__':
    # example usage:
    # python grade_statistics.py /path/to/bug/root/dir/Bears/Bears-1
    bug_dir = sys.argv[1]
    c_change, m_change, l_change, ld, cb, cp, cc, codebleu = get_gt_stats(bug_dir)
    display_stats(c_change, m_change, l_change, ld, cb, cp, cc, codebleu)