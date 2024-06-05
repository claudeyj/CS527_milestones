var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":25699,"methods":[{"el":17,"sc":5,"sl":8},{"el":23,"sc":5,"sl":19}],"name":"ObdDecoderTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":8}],"name":"testDecode","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]},"test_137":{"methods":[{"sl":19}],"name":"testDecodeCodes","pass":true,"statements":[{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [121], [], [], [121], [121], [121], [121], [121], [], [], [], [137], [], [137], [137], [], [], []]
