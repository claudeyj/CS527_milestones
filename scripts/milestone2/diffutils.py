from pathlib import Path
from typing import List, Tuple

def diff_to_hunks(diff:str) -> List[str]:
    return diff.split('\n@@')

def get_hunk_info(hunk:str) -> Tuple[int, int]:
    head = hunk.split('\n')[0]
    buggy_start_line = int(head.split(' ')[1].split(',')[0][1:])
    patched_start_line = int(head.split(' ')[2].split(',')[0][1:])
    
    return buggy_start_line, patched_start_line

def extract_hunk(hunk:str) -> Tuple[List[int], List[int]]:
    buggy_start_line, patched_start_line = get_hunk_info(hunk)
    buggy_lines, patched_lines = [], []
    hunk_lines = hunk.split('\n')[1:]
    for i in range(len(hunk_lines)):
        if hunk_lines[i].startswith('-'):
            buggy_lines.append(i - len(patched_lines) + buggy_start_line)
        if hunk_lines[i].startswith('+'):
            patched_lines.append(i - len(buggy_lines) + patched_start_line)

    return buggy_lines, patched_lines

def extract_diff(diff_file:Path, file_name:str) -> Tuple[List[int], List[int]]:
    with open(diff_file, 'r') as file:
        diff_content = file.read()
    hunk_list = diff_to_hunks(extract_diff_content_of_file(diff_content, file_name))
    buggy_lines, patched_lines = [], []
    for hunk in hunk_list[1:]: # Skip the first element which is not a hunk
        hunk_buggy_lines, hunk_patched_lines = extract_hunk(hunk)
        buggy_lines.extend(hunk_buggy_lines)
        patched_lines.extend(hunk_patched_lines)
        
    return buggy_lines, patched_lines

def extract_diff_content_of_file(diff_content:str, file_name:str) -> str:
    lines = diff_content.split('\n')
    start, end = 0, len(lines)
    for i in range(len(lines)):
        line = lines[i]
        if line.startswith("diff -x") and line.endswith(file_name):
            start = i
            break
    for i in range(start + 1, len(lines)):
        line = lines[i]
        if line.startswith("diff -x") or line.startswith("Binary files"):
            end = i
            break
    
    res = '\n'.join(lines[start:end])
    return res