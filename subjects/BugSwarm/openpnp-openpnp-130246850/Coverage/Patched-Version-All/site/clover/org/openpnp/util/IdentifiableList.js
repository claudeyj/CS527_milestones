var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":19238,"methods":[{"el":26,"sc":5,"sl":19}],"name":"IdentifiableList","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":19}],"name":"testSimpleJob","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]},"test_71":{"methods":[{"sl":19}],"name":"testSampleJob","pass":true,"statements":[{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10, 71], [10, 71], [10, 71], [10, 71], [], [], [], [], []]
