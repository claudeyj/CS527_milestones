var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":12058,"methods":[{"el":38,"sc":5,"sl":30},{"el":49,"sc":13,"sl":43},{"el":57,"sc":13,"sl":52},{"el":59,"sc":5,"sl":40}],"name":"Gl200Protocol","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_14":{"methods":[{"sl":30}],"name":"test0","pass":false,"statements":[{"sl":31},{"sl":32}]},"test_28":{"methods":[{"sl":30}],"name":"testDecode","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_66":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 66, 14], [28, 66, 14], [28, 66, 14], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]