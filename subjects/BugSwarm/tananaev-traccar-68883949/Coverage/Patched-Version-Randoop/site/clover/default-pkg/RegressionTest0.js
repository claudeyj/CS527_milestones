var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":11008,"methods":[{"el":16,"sc":5,"sl":10},{"el":24,"sc":5,"sl":18},{"el":39,"sc":5,"sl":26}],"name":"RegressionTest0","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":26}],"name":"test3","pass":true,"statements":[{"sl":28},{"sl":30},{"sl":32},{"sl":33},{"sl":38}]},"test_1":{"methods":[{"sl":10}],"name":"test1","pass":false,"statements":[{"sl":12},{"sl":14},{"sl":15}]},"test_2":{"methods":[{"sl":18}],"name":"test2","pass":false,"statements":[{"sl":20},{"sl":22},{"sl":23}]},"test_3":{"methods":[{"sl":10}],"name":"test1","pass":true,"statements":[{"sl":12},{"sl":14},{"sl":15}]},"test_4":{"methods":[{"sl":26}],"name":"test3","pass":true,"statements":[{"sl":28},{"sl":30},{"sl":32},{"sl":33},{"sl":38}]},"test_5":{"methods":[{"sl":18}],"name":"test2","pass":true,"statements":[{"sl":20},{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1, 3], [], [1, 3], [], [1, 3], [1, 3], [], [], [5, 2], [], [5, 2], [], [5, 2], [5, 2], [], [], [0, 4], [], [0, 4], [], [0, 4], [], [0, 4], [0, 4], [], [], [], [], [0, 4], [], [], []]
