

import os 
import sys

cut_path = sys.argv[1]
out_path = sys.argv[2]

with open(cut_path, 'r') as file:
    filenames = [line.strip().split('.') for line in file.readlines()]


filenames = ["/".join(line) for line in filenames]

with open(out_path, 'w') as output_file:
    for path in filenames:
        output_file.write(f"{path}.java\n")
    # output_file.write("**/ViewMessageFactoryTest.java\n")
    output_file.write("**/*Test*.java\n")