var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":300,"id":15831,"methods":[{"el":40,"sc":5,"sl":38},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47},{"el":55,"sc":5,"sl":52},{"el":60,"sc":5,"sl":57},{"el":64,"sc":5,"sl":62},{"el":68,"sc":5,"sl":66},{"el":72,"sc":5,"sl":70},{"el":76,"sc":5,"sl":74},{"el":80,"sc":5,"sl":78},{"el":84,"sc":5,"sl":82},{"el":88,"sc":5,"sl":86},{"el":133,"sc":5,"sl":90},{"el":137,"sc":5,"sl":135},{"el":141,"sc":5,"sl":139},{"el":195,"sc":5,"sl":148},{"el":200,"sc":5,"sl":197},{"el":215,"sc":5,"sl":210},{"el":226,"sc":5,"sl":217},{"el":242,"sc":5,"sl":228},{"el":280,"sc":5,"sl":244},{"el":298,"sc":5,"sl":295}],"name":"Length","sl":28},{"el":31,"id":15831,"methods":[],"name":"Length.Field","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":42},{"sl":74},{"sl":90}],"name":"testCalculateBoardPlacementLocation","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":75},{"sl":91},{"sl":92}]},"test_10":{"methods":[{"sl":42},{"sl":74},{"sl":90}],"name":"testSimpleJob","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":75},{"sl":91},{"sl":92},{"sl":94},{"sl":95},{"sl":98},{"sl":101},{"sl":104},{"sl":105},{"sl":114},{"sl":115}]},"test_17":{"methods":[{"sl":42},{"sl":74},{"sl":90}],"name":"testCalculateAngleAndOffset","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":75},{"sl":91},{"sl":92}]},"test_25":{"methods":[{"sl":42}],"name":"test2","pass":false,"statements":[{"sl":43},{"sl":44}]},"test_33":{"methods":[{"sl":42},{"sl":74},{"sl":90}],"name":"testOffsets","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":75},{"sl":91},{"sl":92}]},"test_41":{"methods":[{"sl":42}],"name":"test04","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_71":{"methods":[{"sl":38},{"sl":42},{"sl":70},{"sl":74},{"sl":82},{"sl":90}],"name":"testSampleJob","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":71},{"sl":75},{"sl":83},{"sl":91},{"sl":92}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [71], [], [], [], [0, 33, 10, 17, 71, 25, 41], [0, 33, 10, 17, 71, 25, 41], [0, 33, 10, 17, 71, 25, 41], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [71], [71], [], [], [0, 33, 10, 17, 71], [0, 33, 10, 17, 71], [], [], [], [], [], [], [71], [71], [], [], [], [], [], [], [0, 33, 10, 17, 71], [0, 33, 10, 17, 71], [0, 33, 10, 17, 71], [], [10], [10], [], [], [10], [], [], [10], [], [], [10], [10], [], [], [], [], [], [], [], [], [10], [10], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
