var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":2013,"methods":[{"el":11,"sc":5,"sl":8},{"el":14,"sc":5,"sl":14},{"el":15,"sc":5,"sl":15},{"el":18,"sc":5,"sl":18},{"el":19,"sc":5,"sl":19},{"el":22,"sc":5,"sl":22},{"el":23,"sc":5,"sl":23},{"el":25,"sc":5,"sl":25},{"el":26,"sc":5,"sl":26},{"el":27,"sc":5,"sl":27},{"el":28,"sc":5,"sl":28},{"el":29,"sc":5,"sl":29}],"name":"Command","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":15},{"sl":18},{"sl":19}],"name":"testEncode","pass":true,"statements":[{"sl":15},{"sl":18},{"sl":19}]},"test_114":{"methods":[{"sl":14},{"sl":15},{"sl":18},{"sl":19},{"sl":22},{"sl":29}],"name":"testEncode","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":18},{"sl":19},{"sl":22},{"sl":29}]},"test_119":{"methods":[{"sl":15},{"sl":18},{"sl":19}],"name":"testEncode","pass":true,"statements":[{"sl":15},{"sl":18},{"sl":19}]},"test_97":{"methods":[{"sl":14},{"sl":15},{"sl":18},{"sl":19},{"sl":22},{"sl":26}],"name":"testEncode","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":18},{"sl":19},{"sl":22},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [114, 97], [107, 119, 114, 97], [], [], [107, 119, 114, 97], [107, 119, 114, 97], [], [], [114, 97], [], [], [], [97], [], [], [114], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
