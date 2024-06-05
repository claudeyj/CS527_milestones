var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":14061,"methods":[{"el":13,"sc":5,"sl":8},{"el":21,"sc":5,"sl":15}],"name":"BitUtilTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_131":{"methods":[{"sl":8}],"name":"testCheck","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12}]},"test_135":{"methods":[{"sl":15}],"name":"testRange","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [131], [], [131], [131], [131], [], [], [135], [], [135], [135], [135], [135], [], [], []]
