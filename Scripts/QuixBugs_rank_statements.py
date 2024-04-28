import os
import shutil
import random
import subprocess
import xml.dom.minidom

Buggy_directory = '/Users/ajitesh/dev/CS527-team11/QuixBugs/{}/Buggy-Version'
xml_location = '/Users/ajitesh/dev/CS527-team11/QuixBugs/{}/Buggy-Version/build/reports/jacoco/test/jacocoTestReport.xml'
Bugs = ['LEVENSHTEIN']


def get_failing_and_passing_tests():
    failing_tests, passing_tests = [], []
    os.system("gradle clean")
    test_command = f"gradle -Dorg.gradle.jvmargs='-Xmx3g' allCoverage"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    tests_logs = [line for line in test_output.stdout.split("\n") if ">" in line and ("PASSED" in line or "FAILED" in line)]
    for log in tests_logs:
        words = log.split(" ")
        if '.' in words[2] or len(words)<4:
            continue
        test = words[0]+'.'+words[2]
        if words[3]=="FAILED":
            failing_tests.append(test)
        else:
            passing_tests.append(test)
    return failing_tests, passing_tests

def get_statement_pass_and_fail_count(failing_tests, passing_tests, bug):
    passed_test_count_per_statement = {}
    failed_test_count_per_statement = {}
    for test in failing_tests:
        os.system(f"gradle clean")
        test_command = f"gradle -Dorg.gradle.jvmargs='-Xmx3g' allCoverage --tests {test}"
        subprocess.run(test_command, shell=True, capture_output=True, text=True)
        xml_doc = xml.dom.minidom.parse(xml_location.format(bug))
        packages = xml_doc.getElementsByTagName("package")
        java_programs_package = [package for package in packages if package.getAttribute("name") == "java_programs"][0]
        classes = java_programs_package.getElementsByTagName("sourcefile")
        bug_class = [class_ for class_ in classes if class_.getAttribute("name") == f"{bug}.java"][0]
        for line in bug_class.getElementsByTagName("line"):
            line_number = int(line.getAttribute("nr"))
            covered = int(line.getAttribute("ci"))
            if line_number not in failed_test_count_per_statement:
                failed_test_count_per_statement[line_number] = 0
            if covered > 0:
                failed_test_count_per_statement[line_number] += 1

    for test in passing_tests:
        os.system(f"gradle clean")
        test_command = f"gradle -Dorg.gradle.jvmargs='-Xmx3g' allCoverage --tests {test}"
        subprocess.run(test_command, shell=True, capture_output=True, text=True)
        xml_doc = xml.dom.minidom.parse(xml_location.format(bug))
        packages = xml_doc.getElementsByTagName("package")
        java_programs_package = [package for package in packages if package.getAttribute("name") == "java_programs"][0]
        classes = java_programs_package.getElementsByTagName("sourcefile")
        bug_class = [class_ for class_ in classes if class_.getAttribute("name") == f"{bug}.java"][0]
        for line in bug_class.getElementsByTagName("line"):
            line_number = int(line.getAttribute("nr"))
            covered = int(line.getAttribute("ci"))
            if line_number not in passed_test_count_per_statement:
                passed_test_count_per_statement[line_number] = 0
            if covered > 0:
                passed_test_count_per_statement[line_number] += 1

    return passed_test_count_per_statement, failed_test_count_per_statement

def get_suspiciousness_per_statement(passed_test_count_per_statement, failed_test_count_per_statement, total_pass, total_fail):
    suspiciousness_per_statement = {}
    for line_number in passed_test_count_per_statement:
        suspiciousness_per_statement[line_number] = (failed_test_count_per_statement[line_number]/total_fail) / ((failed_test_count_per_statement[line_number]/total_fail) + (passed_test_count_per_statement[line_number]/total_pass))
    return suspiciousness_per_statement

def get_buggy_file_path(bug_name):
    return f"/Users/ajitesh/dev/CS527-team11/QuixBugs/{bug_name}/Buggy-Version/java_programs/{bug_name}.java"

def get_patched_file_path(bug_name):
    return f"/Users/ajitesh/dev/CS527-team11/QuixBugs/{bug_name}/Patched-Version/correct_java_programs/{bug_name}.java"

def read_file(bug_name):
    with open(get_buggy_file_path(bug_name), "r") as b_file:
        buggy = b_file.read()

    with open(get_patched_file_path(bug_name), "r") as p_file:
        patched = p_file.read()

    return buggy, patched

def get_involved_statements(bug):
    involved_statements = []
    buggy, patched = read_file(bug)
    buggy_lines = buggy.split("\n")
    patched_lines = patched.split("\n")
    for i in range(1,len(buggy_lines)):
        if buggy_lines[i] not in patched_lines:
            involved_statements.append(i+1)

    return involved_statements

def get_average_and_first_rank(involved_statements, ranked_suspiciousness_per_statement):
    
    first_rank = 999
    involved_ranks_sum = 0
    i = 1
    rank = i
    prev_rank = 0
    prev_score = -1
    for line_number, score in ranked_suspiciousness_per_statement.items():
        if score != prev_score:
            rank = i
        else:
            rank = prev_rank
        prev_score = score
        if line_number in involved_statements:
            involved_ranks_sum += rank
            if rank < first_rank:
                first_rank = rank
        i += 1

    average_rank = involved_ranks_sum / len(involved_statements)
    
    return first_rank, average_rank

def create_csv_if_not_exists():
    if not os.path.exists("/Users/ajitesh/dev/CS527-team11/BL-Results.csv"):
        with open("/Users/ajitesh/dev/CS527-team11/BL-Results.csv", "w") as f:
            f.write("Repo name, Bug ID, AR, FR\n")

    

if __name__ == "__main__":

    for bug in Bugs:
        source_buggy_directory = Buggy_directory.format(bug)

        print("Starting for ", bug)

        if not os.path.isdir(source_buggy_directory):
            print(f"Source directory '{source_buggy_directory}' not found.")
            exit(1)

        os.chdir(source_buggy_directory)

        failing_tests, passing_tests = get_failing_and_passing_tests()
        total_pass = len(passing_tests)
        total_fail = len(failing_tests)

        passed_test_count_per_statement, failed_test_count_per_statement = get_statement_pass_and_fail_count(failing_tests, passing_tests, bug)
        print("pass count", passed_test_count_per_statement)
        print("fail count", failed_test_count_per_statement)

        suspiciousness_per_statement = get_suspiciousness_per_statement(passed_test_count_per_statement, failed_test_count_per_statement, total_pass, total_fail)
        print("Suspiciousness per statement", suspiciousness_per_statement)
        ranked_suspiciousness_per_statement = dict(sorted(suspiciousness_per_statement.items(), key=lambda item: item[1], reverse=True))
        print("Ranked suspiciousness per statement", ranked_suspiciousness_per_statement)
        involved_statements = get_involved_statements(bug)
        print("Involved statements", involved_statements)

        first_rank, average_rank = get_average_and_first_rank(involved_statements, ranked_suspiciousness_per_statement)
        print("First rank", first_rank)
        print("Average rank", average_rank)

        create_csv_if_not_exists()

        with open("/Users/ajitesh/dev/CS527-team11/BL-Results.csv", "a") as f:
            f.write(f"QuixBugs, {bug}, {average_rank}, {first_rank}\n")











        print("Completed statement ranking for ", bug)


        



print("Script completed successfully.")
