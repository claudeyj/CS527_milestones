var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":18842,"methods":[{"el":42,"sc":5,"sl":24}],"name":"Pt502ProtocolEncoder","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_229":{"methods":[{"sl":24}],"name":"testEncodeTimezone","pass":true,"statements":[{"sl":27},{"sl":30},{"sl":31}]},"test_29":{"methods":[{"sl":24}],"name":"testEncodeOutputControl","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]},"test_41":{"methods":[{"sl":24}],"name":"testEncodeAlarmSpeed","pass":true,"statements":[{"sl":27},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [29, 41, 229], [], [], [29, 41, 229], [29], [29], [229], [229], [41], [41], [], [], [], [], [], [], [], [], [], [], []]