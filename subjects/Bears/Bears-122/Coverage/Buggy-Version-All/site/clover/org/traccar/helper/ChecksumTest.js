var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":25660,"methods":[{"el":23,"sc":5,"sl":12},{"el":29,"sc":5,"sl":25}],"name":"ChecksumTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_6":{"methods":[{"sl":25}],"name":"testLuhn","pass":true,"statements":[{"sl":27},{"sl":28}]},"test_73":{"methods":[{"sl":12}],"name":"testCrc16","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [73], [], [73], [], [73], [73], [73], [73], [73], [73], [73], [], [], [6], [], [6], [6], [], [], []]
