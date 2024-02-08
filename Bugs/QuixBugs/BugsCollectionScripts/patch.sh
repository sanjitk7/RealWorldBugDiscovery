#!/bin/bash


source_directory="/Bugs/QuixBugs/Java"

# Check if source directory exists
if [ ! -d "$source_directory" ]; then
    echo "Source directory '$source_directory' not found."
    exit 1
fi

# Create a patch file for the changes
patch_file="src.patch"

# Loop through each subdirectory in the source directory
for subdirectory in "$source_directory"/*/; do
    if [ -d "$subdirectory" ]; then
        # Get the folder name (excluding the trailing slash)
        folder_name=$(basename "$subdirectory")

        # Check if 'buggy' and 'fixed' folders exist
        buggy_folder="$subdirectory/buggy"
        fixed_folder="$subdirectory/fixed"

        if [ -d "$buggy_folder" ] && [ -d "$fixed_folder" ]; then
            # Change to the directory
            cd "$subdirectory"

            # Execute 'diff' between the files in 'buggy' and 'fixed' folders
            diff --color -ur  "buggy/$folder_name.java" "fixed/$folder_name.java" > "$patch_file"
            echo "Diff for $folder_name executed and saved to $patch_file"

            # Change back to the original directory
            cd -
        else
            echo "Skipping '$folder_name' - 'buggy' or 'fixed' folder not found."
        fi
    fi
done

echo "Script completed successfully."

