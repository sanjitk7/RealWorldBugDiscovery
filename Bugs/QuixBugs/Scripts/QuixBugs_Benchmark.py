import os
import sys
import lizard
import Levenshtein
from codebleu import calc_codebleu

valid_datasets = ["QuixBugs"]
valid_metrics = ["CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"]

def get_buggy_file_path(bug_name):
    return f"./Bugs/{bug_name}/Buggy-Version/{bug_name}.java"

def get_patched_file_path(bug_name):
    return f"./Bugs/{bug_name}/Patched-Version/{bug_name}.java"

def read_file(bug_name):
    with open(get_buggy_file_path(bug_name), "r") as b_file:
        buggy = b_file.read()

    with open(get_patched_file_path(bug_name), "r") as p_file:
        patched = p_file.read()

    return buggy, patched

def read_diff(bug_name):
    with open(f"./Bugs/{bug_name}/Diff", "r") as diff_file:
        diff = diff_file.read()
    return diff

def get_classes_changed(bug):
    return 10

def get_methods_changed(bug):
    return 10

def get_lines_changed(bug):
    diff = read_diff(bug)
    changed_lines = 0
    for line in diff.split("\n"):
        if len(line) == 0:
            continue
        if line[0] == '+':
            changed_lines += 1
        elif line[0] == '-':
            changed_lines += 1
            
    return changed_lines - 2
    

def get_levenshtein_distance(bug):
    buggy_file, patched_file = read_file(bug)
    return Levenshtein.distance(buggy_file, patched_file)

def get_buggy_cyclomatic(bug):
    i = lizard.analyze_file(get_buggy_file_path(bug))
    cyclomatic_complexity = 0
    for f in i.function_list:
        cyclomatic_complexity += f.cyclomatic_complexity
    return cyclomatic_complexity

def get_patched_cyclomatic(bug):
    i = lizard.analyze_file(get_patched_file_path(bug))
    cyclomatic_complexity = 0
    for f in i.function_list:
        cyclomatic_complexity += f.cyclomatic_complexity
    return cyclomatic_complexity

def get_cyclomatic_change(bug):
    return abs(get_patched_cyclomatic(bug) - get_buggy_cyclomatic(bug))

def get_codebleu(bug):
    buggy, patched= read_file(bug)

    result = calc_codebleu([buggy], [patched], lang="java", weights=(0.25, 0.25, 0.25, 0.25), tokenizer=None)
    return result

def get_metric(dataset, bug, metric):

    function_map = {
        'CChange': get_classes_changed,
        'MChange': get_methods_changed,
        'LChange': get_lines_changed,
        'LD': get_levenshtein_distance,
        'CB': get_buggy_cyclomatic,
        'CP': get_patched_cyclomatic,
        'CC': get_cyclomatic_change,
        'CodeBLEU': get_codebleu
    }

    if metric in function_map:
        return function_map[metric](bug)
    else:
        print("Invalid metric")
        exit(1)


if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Usage: python Scripts/QuixBugs_Benchmark.py [bug-dataset] [bug-name] [metric]")
        exit(1)
   
    arg1 = sys.argv[1]
    arg2 = sys.argv[2]
    arg3 = sys.argv[3]

    if arg1 not in valid_datasets:
        print(f"Invalid dataset: {arg1}, valid datasets: {valid_datasets}")
        exit(1)

    if arg2 not in os.listdir('./Bugs/'):
        print(f'''Invalid bug name: {arg2}, valid bug names: {os.listdir("./Bugs/")}''')
        exit(1)

    if arg3 not in valid_metrics:
        print(f"Invalid metric: {arg3}, valid metrics: {valid_metrics}")
        exit(1)

    metric = get_metric(arg1, arg2, arg3)
    print(metric)

