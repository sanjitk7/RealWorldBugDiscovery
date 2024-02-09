import os
import shutil

def move_patch_files(project_base_path, output_base_path):
    projects = [name for name in os.listdir(project_base_path) if os.path.isdir(os.path.join(project_base_path, name))]

    for project in projects:
        print(f"Processing project: {project}")
        patches_dir = os.path.join(project_base_path, project, "patches")
        if not os.path.exists(patches_dir):
            print(f"No patches directory found for project {project}. Skipping...")
            continue

        for patch_file in os.listdir(patches_dir):
            if patch_file.endswith(".src.patch"):
                src_patch_path = os.path.join(patches_dir, patch_file)
                bug_id = patch_file.split('.')[0]
                output_dir = os.path.join(output_base_path, project, f"{project}_{bug_id}")
                os.makedirs(output_dir, exist_ok=True)
                output_patch_path = os.path.join(output_dir, patch_file)

                # Check if the file already exists to avoid overwriting
                if not os.path.exists(output_patch_path):
                    shutil.copy(src_patch_path, output_patch_path)
                    print(f"Copied: {src_patch_path} to {output_patch_path}")
                else:
                    print(f"File already exists: {output_patch_path}, skipping.")

if __name__ == "__main__":
    project_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j/framework/projects"
    output_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j_only_bug_files"
    move_patch_files(project_base_path, output_base_path)
