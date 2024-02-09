import os
import subprocess
from multiprocessing import Pool
import json
import shutil

def clone_repo(repo_url, repo_dir, commit_sha_bug, commit_sha_fix):
    if not os.path.exists(repo_dir):
        print(f"Cloning repository {repo_url}")
        subprocess.run(['git', 'clone', repo_url, repo_dir], check=True)
    subprocess.run(['git', 'fetch', 'origin', commit_sha_bug], cwd=repo_dir)
    subprocess.run(['git', 'fetch', 'origin', commit_sha_fix], cwd=repo_dir)


def get_changed_files(repo_dir, commit_sha_bug, commit_sha_fix):
    diff_output = subprocess.check_output(['git', 'diff', '--name-only', commit_sha_bug, commit_sha_fix], cwd=repo_dir)
    changed_files = diff_output.decode('utf-8').strip().split('\n')
    return [file for file in changed_files if file] 

def checkout_and_copy_files(repo_dir, commit_sha, target_dir, files):
    os.makedirs(target_dir, exist_ok=True)
    subprocess.run(['git', 'checkout', commit_sha], cwd=repo_dir, check=True)
    for file in files:
        file_path = os.path.join(repo_dir, file)
        if os.path.exists(file_path):
            target_file_path = os.path.join(target_dir, file)
            os.makedirs(os.path.dirname(target_file_path), exist_ok=True)
            shutil.copy(file_path, target_file_path)

def generate_diff(repo_dir, commit_sha_bug, commit_sha_fix, diff_file, files):
    with open(diff_file, 'w') as file:
        for changed_file in files:
            subprocess.run(['git', 'diff', commit_sha_bug, commit_sha_fix, '--', changed_file], cwd=repo_dir, stdout=file)

def process_bug(bug):
    repo_name = bug['repo'].split('/')[-1]
    repo_url = f"https://github.com/{bug['repo']}.git"
    bug_id = bug['image_tag']
    commit_sha_bug = bug['failed_job']['trigger_sha']
    commit_sha_fix = bug['passed_job']['trigger_sha']

    repo_dir = f"repos/{repo_name}"
    bug_dir = f"BugSwarm/{bug_id}"
    buggy_dir = f"{bug_dir}/buggy"
    fixed_dir = f"{bug_dir}/fixed"
    diff_file = f"{bug_dir}/{bug_id}_diff.txt"

    try:
        clone_repo(repo_url, repo_dir, commit_sha_bug, commit_sha_fix)

        changed_files = get_changed_files(repo_dir, commit_sha_bug, commit_sha_fix)

        print(f"Processing buggy version for bug ID {bug_id}")
        checkout_and_copy_files(repo_dir, commit_sha_bug, buggy_dir, changed_files)

        print(f"Processing fixed version for bug ID {bug_id}")
        checkout_and_copy_files(repo_dir, commit_sha_fix, fixed_dir, changed_files)

        print(f"Generating diff for bug ID {bug_id}")
        generate_diff(repo_dir, commit_sha_bug, commit_sha_fix, diff_file, changed_files)

        subprocess.run(['git', 'checkout', 'main'], cwd=repo_dir)

    except Exception as e:
        print(e)

def main(json_file):
    with open(json_file) as file:
        bugs = json.load(file)

    with Pool(processes=os.cpu_count()) as pool:
        pool.map(process_bug, bugs)

if __name__ == '__main__':
    json_file = 'Export.json'
    main(json_file)
