var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":11473,"methods":[{"el":21,"sc":5,"sl":10}],"name":"GoSafeProtocolDecoderTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_25":{"methods":[{"sl":10}],"name":"testDecode","pass":true,"statements":[{"sl":13},{"sl":15},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [25], [], [], [25], [], [25], [], [], [25], [], [], [], [], []]