var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1425,"methods":[{"el":25,"sc":5,"sl":23},{"el":29,"sc":5,"sl":27},{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39}],"name":"BitUtil","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_17":{"methods":[{"sl":23},{"sl":35},{"sl":39}],"name":"testDecode","pass":true,"statements":[{"sl":24},{"sl":36},{"sl":40}]},"test_22":{"methods":[{"sl":23}],"name":"testCheck","pass":true,"statements":[{"sl":24}]},"test_52":{"methods":[{"sl":23}],"name":"testDecode","pass":true,"statements":[{"sl":24}]},"test_70":{"methods":[{"sl":31}],"name":"testRange","pass":true,"statements":[{"sl":32}]},"test_85":{"methods":[{"sl":23}],"name":"testDecode","pass":true,"statements":[{"sl":24}]},"test_92":{"methods":[{"sl":23}],"name":"testDecode","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [52, 17, 85, 92, 22], [52, 17, 85, 92, 22], [], [], [], [], [], [], [70], [70], [], [], [17], [17], [], [], [17], [17], [], [], []]
