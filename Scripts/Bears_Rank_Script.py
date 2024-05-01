import csv
import xml.etree.ElementTree as ET


# Parse the XML file
tree = ET.parse("/Users/rahul/Documents/UIUC SEM 2/527/Milestone 4/CS527-team11/Bears/bears-101/Buggy-Version/target/site/jacoco/jacoco.xml")
root = tree.getroot()

# Open the CSV file for writing
with open('coverage.csv', 'w', newline='') as file:
    writer = csv.writer(file)
    writer.writerow(["Line", "Hits"])  # Write the header

    # Iterate over all sourcefile elements
    for sourcefile in root.iter('sourcefile'):
        # Check if the name attribute is 'StdKeySerializers.java'
        if sourcefile.get('name') == 'Gl200ProtocolDecoder.java':
            # Iterate over all line elements of this sourcefile
            for line in sourcefile.iter('line'):
                # Write the nr and ci attributes to the CSV
                writer.writerow([line.get('nr'), line.get('ci')])
