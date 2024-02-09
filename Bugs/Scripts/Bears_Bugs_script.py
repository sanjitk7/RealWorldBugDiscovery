
import json
import subprocess
import os
import re
import shutil

json_file_path = '/Users/SakshilVerma/Documents/git/CS_527_Software_Eng/bears-bugs.json'
base_dir = '/Users/SakshilVerma/Documents/git/CS_527_Software_Eng/NewBearsData_final'
temp_clone_dir = '/Users/SakshilVerma/Documents/git/CS_527_Software_Eng/temp'  
  

def run_command(command, cwd):
    process = subprocess.Popen(command, cwd=cwd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()

    return stdout.decode('utf-8', 'ignore'), stderr.decode('utf-8', 'ignore')

def clone_repository(repo_url, project_dir):
    
    stdout, stderr = run_command(f'git clone {repo_url}', project_dir)
    # handle errors if any

def get_changed_files(diff_string):
    # Regular expression pattern to match file paths in the diff
    file_pattern = re.compile(r'diff --git a/(.*?) b')

    # Find all matches in the diff string
    matches = file_pattern.findall(diff_string)

    # Convert the matches to a set to remove duplicates
    changed_files = set(matches)

    return changed_files

def write_string_to_file(file_path, content):
    with open(file_path, 'w') as file:
        file.write(content)

def write_git_show_output(file_path, commit_id, output_file_path):
    try:
        # Run the git show command
        command = f'git show {commit_id}:{file_path}'
        result = subprocess.run(command, shell=True, check=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)

        os.makedirs(os.path.dirname(output_file_path), exist_ok=True)
        # Write the output to the specified file
        with open(output_file_path, 'w') as output_file:
            output_file.write(result.stdout)

        print(f"Git show output written to {output_file_path}")
    except subprocess.CalledProcessError as e:
        print(f"Error running git show command: {e}")
    except Exception as ex:
        print(f"An unexpected error occurred: {ex}")

def process_bug(bug_data):
    bug_id = bug_data["bugId"]
    diff = bug_data["diff"]
    repo_url = bug_data["repository"]["url"]
    repo_name = repo_url.split('/')[-1]
    buggy_sha = bug_data["commits"]["buggyBuild"]["sha"]
    fixed_sha = bug_data["commits"]["fixerBuild"]["sha"]

    project_dir = os.path.join(temp_clone_dir, bug_id)
    os.makedirs(project_dir,exist_ok=True)
    clone_repository(repo_url, project_dir)


    os.chdir(project_dir+"/"+repo_name)

    changed_files = get_changed_files(diff)
    print("Changed files:",changed_files)

    destination_dir = os.path.join(base_dir,bug_id)
    os.makedirs(destination_dir+"/buggy/",exist_ok=True)
    os.makedirs(destination_dir+"/fixed/",exist_ok=True)
    write_string_to_file(destination_dir+"/src.patch", diff)



    for changed_file in changed_files:
        write_git_show_output(changed_file, buggy_sha, destination_dir+"/buggy/"+changed_file)
        write_git_show_output(changed_file, fixed_sha, destination_dir+"/fixed/"+changed_file)

    shutil.rmtree(project_dir)


def main():
    with open(json_file_path, 'r') as json_file:
        bugs_data = json.load(json_file)
    
    for bug_data in bugs_data:
        process_bug(bug_data)

if __name__ == '__main__':
    main()

