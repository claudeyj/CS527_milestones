var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":21222,"methods":[{"el":18,"sc":5,"sl":11},{"el":26,"sc":5,"sl":20}],"name":"ColorConverter","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":11},{"sl":20}],"name":"testSimpleJob","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25}]},"test_71":{"methods":[{"sl":11},{"sl":20}],"name":"testSampleJob","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [10, 71], [], [10, 71], [10, 71], [10, 71], [10, 71], [10, 71], [], [], [10, 71], [], [10, 71], [10, 71], [10, 71], [10, 71], [], []]
