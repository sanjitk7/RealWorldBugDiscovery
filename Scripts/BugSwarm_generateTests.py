import os
import sys
import subprocess
import multiprocessing

bugs_directory = (
    "/Users/urjakhadilkar/Desktop/CS527-team11/BugSwarm"
)

randoop_jar_path = "/Users/urjakhadilkar/Downloads/randoop-4.3.2/randoop-all-4.3.2.jar"
evosuite_jar_path = "/Users/urjakhadilkar/Downloads/evosuite-1.0.6.jar"

valid_tools = ["randoop", "evosuite"]


def get_all_bug_directories(directory):
    return [
        os.path.join(directory, d)
        for d in os.listdir(directory)
        if os.path.isdir(os.path.join(directory, d))
    ]

def construct_classpath(root_dir):
    classpath_elements = []
    
    for root, dirs, files in os.walk(root_dir):
        classpath_elements.append(root)
        
        for file in files:
            if file.endswith('.jar'):
                classpath_elements.append(os.path.join(root, file))

    classpath = os.pathsep.join(classpath_elements)
    return classpath


def generate_randoop_tests(bug_dir):
    for version in ["Buggy-Version", "Patched-Version"]:
        classpath_command = f"mvn dependency:build-classpath -Dmdep.outputFile=cp.txt"
        subprocess.run(classpath_command, shell=True)
        classpath = os.path.join(bug_dir, version)
        os.chdir(os.path.join(bug_dir, version))
        # classpath = f".:{randoop_jar_path}"
        output_dir = "randoop_tests"
        os.makedirs(output_dir, exist_ok=True)

        with open(os.path.join(bug_dir, "tests.txt"), "r") as file:
            classes_under_test = [line.strip() for line in file]

        for test_class in classes_under_test:
            randoop_command = f"java -classpath $(cat cp.txt):{randoop_jar_path} randoop.main.Main gentests --testclass={test_class} --time-limit=60 --output-limit=200 --junit-output-dir={output_dir}"
            print(randoop_command)
            subprocess.run(randoop_command, shell=True)

        print(f"Generated Randoop tests for {bug_dir} in {version}")


def generate_evosuite_tests(bug_dir):
    for version in ["Buggy-Version", "Patched-Version"]:
        os.chdir(os.path.join(bug_dir, version))
        classpath = "."
        output_dir = "evosuite_tests"
        os.makedirs(output_dir, exist_ok=True)

        with open(os.path.join(bug_dir, "tests.txt"), "r") as file:
            classes_under_test = [line.strip() for line in file]

        for test_class in classes_under_test:
            evosuite_command = f"java -jar {evosuite_jar_path} -class {test_class} -projectCP {classpath} -Doutput_dir={output_dir} -Dsearch_budget=60"
            print(evosuite_command)
            subprocess.run(evosuite_command, shell=True)

        print(f"Generated EvoSuite tests for {bug_dir} in {version}")


if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python generate_tests.py [randoop|evosuite]")
        sys.exit(1)

    tool = sys.argv[1].lower()

    if tool not in valid_tools:
        print(f"Invalid tool: {tool}, valid tools are: {valid_tools}")
        sys.exit(1)

    bug_directories = get_all_bug_directories(bugs_directory)

    if tool == "randoop":
        target_function = generate_randoop_tests
    elif tool == "evosuite":
        target_function = generate_evosuite_tests

    with multiprocessing.Pool() as pool:
        pool.map(target_function, bug_directories)

    print("Script completed successfully.")
