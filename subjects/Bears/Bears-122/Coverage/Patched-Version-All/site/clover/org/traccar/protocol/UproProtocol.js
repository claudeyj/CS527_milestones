var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":22583,"methods":[{"el":31,"sc":5,"sl":29},{"el":41,"sc":13,"sl":36},{"el":43,"sc":5,"sl":33}],"name":"UproProtocol","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_192":{"methods":[{"sl":29}],"name":"testDecode","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [192], [192], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]