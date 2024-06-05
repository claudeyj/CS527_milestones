var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":78,"methods":[{"el":31,"sc":5,"sl":29},{"el":36,"sc":5,"sl":33},{"el":40,"sc":5,"sl":38},{"el":48,"sc":5,"sl":42}],"name":"BaseProtocol","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":29}],"name":"test0","pass":true,"statements":[{"sl":30}]},"test_1":{"methods":[{"sl":29}],"name":"test1","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 1], [0, 1], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
