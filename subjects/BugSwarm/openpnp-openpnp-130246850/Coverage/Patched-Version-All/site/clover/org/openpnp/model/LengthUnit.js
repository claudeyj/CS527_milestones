var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":16036,"methods":[{"el":33,"sc":5,"sl":30},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39}],"name":"LengthUnit","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":30},{"sl":35}],"name":"testCalculateBoardPlacementLocation","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":36}]},"test_10":{"methods":[{"sl":35}],"name":"testSimpleJob","pass":true,"statements":[{"sl":36}]},"test_17":{"methods":[{"sl":35}],"name":"testCalculateAngleAndOffset","pass":true,"statements":[{"sl":36}]},"test_71":{"methods":[{"sl":35}],"name":"testSampleJob","pass":true,"statements":[{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0], [0], [0], [], [], [0, 10, 17, 71], [0, 10, 17, 71], [], [], [], [], [], []]
