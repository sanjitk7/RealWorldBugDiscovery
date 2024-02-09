import json

input_json_file = '/Users/urjakhadilkar/Desktop/Export.json'

output_json_file = 'test_info.json'

def extract_test_info(input_json_file, output_json_file):
    with open(input_json_file, 'r') as file:
        bugs = json.load(file)

    test_info_list = []

    for bug in bugs:
        bug_id = bug['image_tag']
        failed_job = bug.get('failed_job', {})
        num_tests_run = failed_job.get('num_tests_run', 0)
        num_tests_failed = failed_job.get('num_tests_failed', 0)
        num_tests_passed = num_tests_run - num_tests_failed

        test_info = {
            'bug_id': bug_id,
            'num_tests_run': num_tests_run,
            'num_tests_failed': num_tests_failed,
            'num_tests_passed': num_tests_passed
        }

        test_info_list.append(test_info)

    with open(output_json_file, 'w') as outfile:
        json.dump(test_info_list, outfile, indent=4)

extract_test_info(input_json_file, output_json_file)
