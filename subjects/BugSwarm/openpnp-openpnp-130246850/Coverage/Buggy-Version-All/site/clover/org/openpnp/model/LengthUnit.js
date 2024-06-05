var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":16035,"methods":[{"el":33,"sc":5,"sl":30},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39}],"name":"LengthUnit","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":35}],"name":"testCalculateAngleAndOffset","pass":true,"statements":[{"sl":36}]},"test_11":{"methods":[{"sl":30},{"sl":35}],"name":"testCalculateBoardPlacementLocation","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":36}]},"test_46":{"methods":[{"sl":35}],"name":"testSampleJob","pass":false,"statements":[{"sl":36}]},"test_7":{"methods":[{"sl":35}],"name":"testSimpleJob","pass":true,"statements":[{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11], [11], [11], [], [], [10, 7, 46, 11], [10, 7, 46, 11], [], [], [], [], [], []]
