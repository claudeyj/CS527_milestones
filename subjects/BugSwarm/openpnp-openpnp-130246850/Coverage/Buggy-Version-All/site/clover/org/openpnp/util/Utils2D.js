var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":211,"id":19458,"methods":[{"el":37,"sc":5,"sl":31},{"el":47,"sc":5,"sl":39},{"el":51,"sc":5,"sl":49},{"el":75,"sc":5,"sl":60},{"el":79,"sc":5,"sl":77},{"el":85,"sc":5,"sl":81},{"el":105,"sc":5,"sl":87},{"el":113,"sc":5,"sl":108},{"el":126,"sc":5,"sl":115},{"el":169,"sc":5,"sl":148},{"el":210,"sc":5,"sl":194}],"name":"Utils2D","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":87},{"sl":115},{"sl":148}],"name":"testCalculateAngleAndOffset","pass":true,"statements":[{"sl":91},{"sl":95},{"sl":96},{"sl":102},{"sl":104},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":125},{"sl":150},{"sl":151},{"sl":152},{"sl":154},{"sl":158},{"sl":160},{"sl":161},{"sl":164},{"sl":168}]},"test_11":{"methods":[{"sl":87},{"sl":115}],"name":"testCalculateBoardPlacementLocation","pass":true,"statements":[{"sl":91},{"sl":95},{"sl":96},{"sl":102},{"sl":104},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":125}]},"test_46":{"methods":[{"sl":81},{"sl":87},{"sl":194}],"name":"testSampleJob","pass":false,"statements":[{"sl":83},{"sl":91},{"sl":95},{"sl":96},{"sl":102},{"sl":104},{"sl":196},{"sl":197},{"sl":198},{"sl":200},{"sl":202},{"sl":205},{"sl":207},{"sl":209}]},"test_7":{"methods":[{"sl":81},{"sl":87}],"name":"testSimpleJob","pass":true,"statements":[{"sl":83},{"sl":91},{"sl":95},{"sl":102},{"sl":104}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7, 46], [], [7, 46], [], [], [], [10, 7, 46, 11], [], [], [], [10, 7, 46, 11], [], [], [], [10, 7, 46, 11], [10, 46, 11], [], [], [], [], [], [10, 7, 46, 11], [], [10, 7, 46, 11], [], [], [], [], [], [], [], [], [], [], [10, 11], [], [], [10, 11], [10, 11], [], [10, 11], [10, 11], [], [], [10, 11], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [], [10], [10], [10], [], [10], [], [], [], [10], [], [10], [10], [], [], [10], [], [], [], [10], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [46], [], [46], [46], [46], [], [46], [], [46], [], [], [46], [], [46], [], [46], [], []]