import os
import json

def count_relevant_tests(project_base_path):
    # Dictionary to hold the count of relevant tests for each project and bug
    test_counts = {}

    # List all projects within the base path
    projects = [name for name in os.listdir(project_base_path) if os.path.isdir(os.path.join(project_base_path, name))]

    for project in projects:
        print(f"Processing project: {project}")
        relevant_tests_dir = os.path.join(project_base_path, project, "relevant_tests")
        if not os.path.exists(relevant_tests_dir):
            print(f"No relevant_tests directory found for project {project}. Skipping...")
            continue

        # Initialize the dictionary for the current project
        test_counts[project] = {}

        # Iterate through all files in the relevant_tests directory
        for test_file in os.listdir(relevant_tests_dir):
            with open(os.path.join(relevant_tests_dir, test_file), 'r') as file:
                # Assuming each line in the file corresponds to one relevant test
                test_count = sum(1 for _ in file)
                # Extract bug_id from the filename (e.g., "1" from "1.src")
                bug_id = test_file.split('.')[0]
                test_counts[project][bug_id] = test_count

    return test_counts

if __name__ == "__main__":
    project_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/defects4j/framework/projects"
    test_counts = count_relevant_tests(project_base_path)
    
    # Print the counts for each project and bug
    for project, bugs in test_counts.items():
        print(f"Project: {project}")
        for bug_id, count in bugs.items():
            print(f"  Bug {bug_id}: {count} relevant tests")
    
    # Output the dictionary as a JSON file
    output_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/tests_per_bug.json"  # Adjust this path as needed
    with open(output_path, 'w') as json_file:
        json.dump(test_counts, json_file, indent=4)

