#!/bin/bash

# Randoop settings
RANDOOP_JAR_PATH="randoop-all-4.3.2.jar"

# Project classpath should include all compiled classes, not just a specific package
PROJECT_CLASSPATH="Closure_5/Buggy-Version/build/classes"

# Output directory should be under src/test/java or a similar source location
OUTPUT_DIR="Closure_5/Buggy-Version/test/com/google/javascript/Randoop"




#Buggy-Version

TEST_CLASS="com.google.javascript"

#Patched-Version


# Create the directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

java -classpath $PROJECT_CLASSPATH:$RANDOOP_JAR_PATH randoop.main.Main gentests \
    --testclass="$TEST_CLASS" \
    --stop-on-error-test=true \
    --junit-output-dir="$OUTPUT_DIR"\
    --time-limit=100

echo "Randoop test generation complete. Check the $OUTPUT_DIR directory for results."
