var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":14131,"methods":[{"el":13,"sc":5,"sl":8},{"el":21,"sc":5,"sl":15}],"name":"BitUtilTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_83":{"methods":[{"sl":15}],"name":"testRange","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_96":{"methods":[{"sl":8}],"name":"testCheck","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [96], [], [96], [96], [96], [], [], [83], [], [83], [83], [83], [83], [], [], []]
