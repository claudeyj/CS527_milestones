var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":25659,"methods":[{"el":23,"sc":5,"sl":12},{"el":29,"sc":5,"sl":25}],"name":"ChecksumTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":12}],"name":"testCrc16","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22}]},"test_245":{"methods":[{"sl":25}],"name":"testLuhn","pass":true,"statements":[{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [2], [], [2], [], [2], [2], [2], [2], [2], [2], [2], [], [], [245], [], [245], [245], [], [], []]
