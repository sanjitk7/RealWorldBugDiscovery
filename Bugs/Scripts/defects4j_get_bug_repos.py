import subprocess
import os

# Base directory for checking out bugs
base_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j_bugs"

# Project information extracted from the provided JSON
projects_info = [
    {"Identifier": "Chart", "NumberOfActiveBugs": 26},
    {"Identifier": "Cli", "NumberOfActiveBugs": 39},
    {"Identifier": "Closure", "NumberOfActiveBugs": 174},
    {"Identifier": "Codec", "NumberOfActiveBugs": 18},
    {"Identifier": "Collections", "NumberOfActiveBugs": 4},
    {"Identifier": "Compress", "NumberOfActiveBugs": 47},
    {"Identifier": "Csv", "NumberOfActiveBugs": 16},
    {"Identifier": "Gson", "NumberOfActiveBugs": 18},
    {"Identifier": "JacksonCore", "NumberOfActiveBugs": 26},
    {"Identifier": "JacksonDatabind", "NumberOfActiveBugs": 112},
    {"Identifier": "JacksonXml", "NumberOfActiveBugs": 6},
    {"Identifier": "Jsoup", "NumberOfActiveBugs": 93},
    {"Identifier": "JxPath", "NumberOfActiveBugs": 22},
    {"Identifier": "Lang", "NumberOfActiveBugs": 64},
    {"Identifier": "Math", "NumberOfActiveBugs": 106},
    {"Identifier": "Mockito", "NumberOfActiveBugs": 38},
    {"Identifier": "Time", "NumberOfActiveBugs": 26},
]

for project_info in projects_info:
    project_id = project_info["Identifier"]
    num_bugs = project_info["NumberOfActiveBugs"]
    for bug_id in range(1, num_bugs + 1):
        for version in ["b", "f"]:  # b for buggy, f for fixed
            # Construct the working directory path
            version_dir = "buggy" if version == "b" else "fixed"
            work_dir = os.path.join(base_dir, version_dir, project_id, f"{project_id}_{bug_id}")

            # Ensure the working directory exists
            os.makedirs(work_dir, exist_ok=True)

            # Construct the checkout command
            checkout_cmd = [
                "defects4j", "checkout",
                "-p", project_id,
                "-v", f"{bug_id}{version}",
                "-w", work_dir
            ]

            # Execute the checkout command
            print(f"Checking out {project_id} {bug_id} {version} to {work_dir}")
            try:
                subprocess.run(checkout_cmd, check=True)
            except subprocess.CalledProcessError as e:
                print(f"Failed to checkout {project_id}-{bug_id}{version}: {e}")

# Note: Adjust the number of bugs for each project as needed, especially if the Defects4J dataset updates.
