import json
import re
import subprocess
import tempfile
import os
from multiprocessing import Pool, cpu_count

json_file_path_100 = '/Users/urjakhadilkar/Desktop/bugs.json'
json_file_path_1100 = '/Users/urjakhadilkar/Desktop/bugsLarge.json'
base_dir = '/Users/urjakhadilkar/Desktop/testRepo'
repo_dir = '/Users/urjakhadilkar/Desktop/CS527-team11/Bugs/ManySStuBs4J'
max_workers = cpu_count()

def run_command(command, cwd):
    process = subprocess.Popen(command, cwd=cwd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()

    return stdout.decode('utf-8', 'ignore'), stderr.decode('utf-8', 'ignore')

def clone_repository_for_bug(project_name, bug_id):
    with tempfile.TemporaryDirectory() as temp_dir:
        repo_url = f'https://github.com/{project_name.replace(".", "/")}.git'
        clone_dir = os.path.join(temp_dir, f'repo_{bug_id}')
        run_command(f'git clone {repo_url} {clone_dir}', temp_dir)
        return clone_dir

def clone_repository_parallel(project_name):
    project_dir_name = project_name.replace('/', '_')
    project_dir = os.path.join(base_dir, project_dir_name)
    if not os.path.exists(project_dir):
        # os.makedirs(project_dir, exist_ok=True)
        repo_url = f'https://github.com/{project_name.replace(".", "/")}.git'
        stdout, stderr = run_command(f'git clone {repo_url} {project_dir_name}', base_dir)
        if stderr:
            print(f"Error cloning {project_name}: {stderr}")
    return project_name, project_dir

def save_file(content, file_path):
    os.makedirs(os.path.dirname(file_path), exist_ok=True)
    with open(file_path, 'w') as file:
        file.write(content)

# def process_bug(params):
#     entry, bug_id, project_dir = params
#     project_dir_path = os.path.join(base_dir, project_dir)
#     bug_dir_path = os.path.join(repo_dir, f'sstubs_{bug_id}')
def process_bug(entry, bug_id):
    project_name = entry['projectName']
    # project_dir_path = clone_repository_for_bug(project_name, bug_id)
    project_dir_path = os.path.join(base_dir, project_name)
    print(project_dir_path)


    # if not os.path.exists(bug_dir_path):
        # try:
        #     buggy_version, _ = run_command(f'git show {entry["fixCommitParentSHA1"]}:{entry["bugFilePath"]}', project_dir)
        #     fixed_version, _ = run_command(f'git show {entry["fixCommitSHA1"]}:{entry["bugFilePath"]}', project_dir)
        #     diff, _ = run_command(f'git diff {entry["fixCommitParentSHA1"]} {entry["fixCommitSHA1"]} -- {entry["bugFilePath"]}', project_dir)

            
        #     os.makedirs(bug_dir_path, exist_ok=True)

        #     buggy_file_path = os.path.join(bug_dir_path, f'buggy.java')
        #     fixed_file_path = os.path.join(bug_dir_path, f'fixed.java')
        #     diff_file_path = os.path.join(bug_dir_path, f'diff.diff')

        #     save_file(buggy_version, buggy_file_path)
        #     save_file(fixed_version, fixed_file_path)
        #     save_file(diff, diff_file_path)
        
        # except Exception as e:
        #     print(e)

    # checkout_command = f'git checkout {entry["fixCommitParentSHA1"]}'
    # build_command = 'mvn compile'
    # test_command = 'mvn test'

    if os.path.exists(os.path.join(project_dir_path, 'pom.xml')):
        # try:
            # checked_output, _ = run_command(checkout_command, project_dir_path)
            # # print(f"Checked out to {entry['fixCommitParentSHA1']} for bug {bug_id} in project {project_dir}")

            # # Building and testing the project
            # # run_output, _ = run_command(build_command, project_dir_path)
            # test_output, _ = run_command(test_command, project_dir_path)

        checkout_command = f'git checkout {entry["fixCommitParentSHA1"]}'
        test_command = 'mvn test'
        checked_output, _ = run_command(checkout_command, project_dir_path)
        test_output, _ = run_command(test_command, project_dir_path)


        total_tests = 0
        failed_tests = 0
        passed_tests = 0

        test_summary_regex = re.compile(r'Tests run: (\d+), Failures: (\d+), Errors: (\d+), Skipped: (\d+)')

        for line in test_output.split('\n'):
            match = test_summary_regex.search(line)
            if match:
                total = int(match.group(1))
                failures = int(match.group(2))
                errors = int(match.group(3))

                total_tests += total
                failed_tests += failures + errors 
                passed_tests = total_tests - failed_tests

        # if total_tests > 0:
        print(f"| {bug_id} | {total_tests} | {passed_tests} | {failed_tests} |")

        reset_command = 'git checkout -'
        reset_output, _ = run_command(reset_command, project_dir_path)

        # except Exception as e:
        #     pass
            #  print(f"Error processing bug {bug_id} in project {project_dir}: {e}")

    


def main():
    with open(json_file_path_100, 'r') as json_file:
        bugs_100 = json.load(json_file)
        print(len(bugs_100))
    # with open(json_file_path_1100, 'r') as json_file:
    #     bugs_1100 = json.load(json_file)
    #     print(len(bugs_1100))

    # bugs = bugs_100 + bugs_1100
    bugs = [bug for bug in bugs_100 if bug['projectName'] == 'Alluxio.alluxio']
    print(len(bugs))

    # unique_projects = {entry['projectName'] for entry in bugs}
    # len_u = len(unique_projects)
    # print(len_u)
    # print(max_workers)
    # project_dir_map = {}
    # with Pool(processes=max_workers) as pool:
    #     results = pool.map(clone_repository_parallel, unique_projects)
    #     project_dir_map = dict(results)


    # params_list = [(entry, bug_id, project_dir_map[entry['projectName']]) for bug_id, entry in enumerate(bugs)]
    # params_list = [(entry, bug_id, entry['projectName']) for bug_id, entry in enumerate(bugs)]
    params_list = [(bug, bug_id) for bug_id, bug in enumerate(bugs[:20])]

    # with Pool(processes=max_workers) as pool:
    #     pool.map(process_bug, params_list)
    for bug, bug_id in params_list:
        process_bug(bug, bug_id)

if __name__ == '__main__':
    main()
