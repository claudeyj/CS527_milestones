var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":23498,"methods":[{"el":23,"sc":5,"sl":12},{"el":29,"sc":5,"sl":25}],"name":"ChecksumTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_170":{"methods":[{"sl":12}],"name":"testCrc16","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]},"test_211":{"methods":[{"sl":25}],"name":"testLuhn","pass":true,"statements":[{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [170], [], [170], [], [170], [170], [170], [170], [170], [170], [170], [], [], [211], [], [211], [211], [], [], []]
