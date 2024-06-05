var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1424,"methods":[{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39}],"name":"BitUtil","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_55":{"methods":[{"sl":23}],"name":"testDecode","pass":false,"statements":[{"sl":24}]},"test_56":{"methods":[{"sl":23}],"name":"testCheck","pass":true,"statements":[{"sl":24}]},"test_65":{"methods":[{"sl":31}],"name":"testRange","pass":true,"statements":[{"sl":32}]},"test_82":{"methods":[{"sl":23}],"name":"testDecode","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [55, 56, 82], [55, 56, 82], [], [], [], [], [], [], [65], [65], [], [], [], [], [], [], [], [], [], [], []]
