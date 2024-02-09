import pandas as pd
import matplotlib.pyplot as plt
import json
from math import ceil

# Load the JSON data
with open('tests_per_bug.json', 'r') as file:
    data = json.load(file)

# Parameters for plotting
projects_per_window = 3  # Number of charts per window
num_projects = len(data)
num_windows = ceil(num_projects / projects_per_window)

# Function to determine tick frequency
def determine_tick_frequency(num_items):
    if num_items <= 10:
        return 1  # Show every tick
    elif num_items <= 20:
        return 2  # Show every 2nd tick
    elif num_items <= 50:
        return 5  # Show every 5th tick
    else:
        return 10  # Show every 10th tick

# Iterate through each window
for window in range(num_windows):
    plt.figure(figsize=(18, 12))  # Adjust the figure size as needed
    start_index = window * projects_per_window
    end_index = start_index + projects_per_window
    projects_in_window = list(data.keys())[start_index:end_index]

    # Plot each project in the current window
    for i, project_name in enumerate(projects_in_window, start=1):
        project_data = pd.DataFrame(list(data[project_name].items()), columns=['Bug ID', 'Number of Tests'])
        project_data['Bug ID'] = pd.to_numeric(project_data['Bug ID'])
        project_data.sort_values('Bug ID', inplace=True)

        # Create subplot for each project
        ax = plt.subplot(2, 3, i)
        ax.bar(project_data['Bug ID'].astype(str), project_data['Number of Tests'], color='skyblue')
        ax.set_title(f'{project_name}')
        ax.set_xlabel('Bug ID')
        ax.set_ylabel('Number of Tests')
        
        # Determine tick frequency and set ticks
        tick_frequency = determine_tick_frequency(len(project_data))
        ax.set_xticks(ax.get_xticks()[::tick_frequency])  # Set custom tick frequency

        plt.xticks(rotation=90)

    plt.tight_layout()
    plt.show()
