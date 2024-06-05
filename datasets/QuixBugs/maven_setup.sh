option=$1

SRC_DIR=src/main/java
TEST_DIR=src/test/java
mkdir -p ${SRC_DIR}
mkdir -p ${TEST_DIR}

if [ "$option" == "clean" ]; then
    rm -rf src
    rm -rf target
fi

if [ "$option" == "setup" ]; then
    cp -r java_programs ${SRC_DIR}
    cp -r correct_java_programs ${SRC_DIR}
    cp -r java_testcases ${TEST_DIR}
fi

if [ "$option" == "compile" ]; then
    mvn clean compile test-compile
fi