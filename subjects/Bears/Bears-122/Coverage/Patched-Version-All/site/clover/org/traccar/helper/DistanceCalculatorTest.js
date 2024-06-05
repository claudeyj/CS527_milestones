var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":25681,"methods":[{"el":12,"sc":5,"sl":8},{"el":21,"sc":5,"sl":14}],"name":"DistanceCalculatorTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":14}],"name":"testDistanceToLine","pass":true,"statements":[{"sl":16},{"sl":19}]},"test_35":{"methods":[{"sl":8}],"name":"testDistance","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [35], [], [35], [], [], [], [125], [], [125], [], [], [125], [], [], [], []]
