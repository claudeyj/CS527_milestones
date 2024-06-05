var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":23466,"methods":[{"el":15,"sc":5,"sl":9},{"el":23,"sc":5,"sl":17}],"name":"BcdUtilTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_129":{"methods":[{"sl":9}],"name":"testReadInteger","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":14}]},"test_332":{"methods":[{"sl":17}],"name":"testReadCoordinate","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [129], [], [129], [129], [], [129], [], [], [332], [], [332], [332], [], [332], [], [], []]
