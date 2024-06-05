var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":18468,"methods":[{"el":12,"sc":5,"sl":9}],"name":"AbstractJobPlanner","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":9}],"name":"testSimpleJob","pass":true,"statements":[{"sl":11}]},"test_71":{"methods":[{"sl":9}],"name":"testSampleJob","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [10, 71], [], [10, 71], [], []]
