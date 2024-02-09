source_directory="/QuixBugs/correct_java_programs"
destination_directory="/Bugs/QuixBugs/Java"

# Check if source directory exists
if [ ! -d "$source_directory" ]; then
    echo "Source directory '$source_directory' not found."
    exit 1
fi

# Create destination directory if it doesn't exist
mkdir -p "$destination_directory"

# Loop through each .java file in the source directory
for java_file in "$source_directory"/*.java; do
    if [ -f "$java_file" ]; then
        # Extract the file name without extension
        file_name=$(basename -- "$java_file")
        file_name_no_ext="${file_name%.*}"

        # Create a folder in the destination directory
        destination_folder="$destination_directory/$file_name_no_ext/fixed"
        mkdir -p "$destination_folder"

        # Copy the .java file to the destination folder
        cp "$java_file" "$destination_folder/"
        echo "Copied $java_file to $destination_folder/"
    fi
done

echo "Script completed successfully."
