var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":2727,"methods":[{"el":31,"sc":5,"sl":29},{"el":41,"sc":13,"sl":36},{"el":43,"sc":5,"sl":33}],"name":"AquilaProtocol","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":29}],"name":"test1","pass":true,"statements":[{"sl":30}]},"test_21":{"methods":[{"sl":29}],"name":"test0","pass":true,"statements":[{"sl":30}]},"test_31":{"methods":[{"sl":29}],"name":"testDecode","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [21, 31, 0], [21, 31, 0], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
