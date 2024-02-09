import os
import shutil

def find_source_path(bugs_base_path, version, project, bug_id, modified_class):
    # Potential source directories
    potential_dirs = ["src/main/java","src/main", "src/java", "src", "gson/src/main/java"]
    for dir in potential_dirs:
        source_path = os.path.join(bugs_base_path, version, project, f"{project}_{bug_id.split('.')[0]}", dir, modified_class)
        if os.path.isfile(source_path):
            return source_path
    return None

def copy_modified_files(project_base_path, bugs_base_path, output_base_path):
    projects = os.listdir(project_base_path)
    ignore_projects = ["Collections", "Chart"]
    for project in projects:
        if project in ignore_projects:
            continue
        print("PROJECT:", project)
        modified_classes_path = os.path.join(project_base_path, project, "modified_classes")
        if not os.path.exists(modified_classes_path):
            print(f"Modified classes path does not exist for project {project}")
            continue

        for bug_id in os.listdir(modified_classes_path):
            src_file_path = os.path.join(modified_classes_path, bug_id)
            if not os.path.isfile(src_file_path):
                print(f"No source file for {project} bug {bug_id}")
                continue

            with open(src_file_path, 'r') as file:
                modified_classes = file.readlines()

            for modified_class in modified_classes:
                modified_class = modified_class.strip().replace('.', os.sep) + ".java"
                for version in ["buggy", "fixed"]:
                    source_path = find_source_path(bugs_base_path, version, project, bug_id, modified_class)
                    if source_path:
                        output_dir = os.path.join(output_base_path, project, f"{project}_{bug_id.split('.')[0]}", version)
                        os.makedirs(output_dir, exist_ok=True)
                        shutil.copy(source_path, os.path.join(output_dir, os.path.basename(modified_class)))
                        print(f"Copied: {source_path} to {output_dir}")
                    else:
                        print(f"DOESNT EXIST: source_path for {modified_class}")

if __name__ == "__main__":
    project_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j/framework/projects"
    bugs_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j_bugs"
    output_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j_only_bug_files"
    copy_modified_files(project_base_path, bugs_base_path, output_base_path)
