var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":15275,"methods":[{"el":30,"sc":5,"sl":28},{"el":34,"sc":5,"sl":32},{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44}],"name":"AbstractModelObject","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":28},{"sl":44}],"name":"test0","pass":true,"statements":[{"sl":29},{"sl":45}]},"test_2":{"methods":[{"sl":44}],"name":"test1","pass":true,"statements":[{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [1], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 2], [1, 2], [], []]