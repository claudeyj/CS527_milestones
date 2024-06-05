var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":25078,"methods":[{"el":22,"sc":5,"sl":10},{"el":31,"sc":5,"sl":24}],"name":"RegressionTest0","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":24}],"name":"test2","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":29},{"sl":30}]},"test_1":{"methods":[{"sl":10}],"name":"test1","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":16},{"sl":17}]},"test_2":{"methods":[{"sl":10}],"name":"test1","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":16},{"sl":17}]},"test_3":{"methods":[{"sl":24}],"name":"test2","pass":true,"statements":[{"sl":26},{"sl":28},{"sl":29},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2, 1], [], [2, 1], [], [2, 1], [], [2, 1], [2, 1], [], [], [], [], [], [], [0, 3], [], [0, 3], [], [0, 3], [0, 3], [0, 3], [], [], []]
