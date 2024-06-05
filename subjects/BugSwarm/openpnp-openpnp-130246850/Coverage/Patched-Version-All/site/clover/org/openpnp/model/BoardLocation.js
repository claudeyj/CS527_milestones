var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":121,"id":15383,"methods":[{"el":45,"sc":5,"sl":43},{"el":50,"sc":5,"sl":47},{"el":57,"sc":5,"sl":52},{"el":61,"sc":5,"sl":59},{"el":67,"sc":5,"sl":63},{"el":71,"sc":5,"sl":69},{"el":77,"sc":5,"sl":73},{"el":81,"sc":5,"sl":79},{"el":87,"sc":5,"sl":83},{"el":91,"sc":5,"sl":89},{"el":95,"sc":5,"sl":93},{"el":99,"sc":5,"sl":97},{"el":105,"sc":5,"sl":101},{"el":109,"sc":5,"sl":107},{"el":115,"sc":5,"sl":111},{"el":120,"sc":5,"sl":117}],"name":"BoardLocation","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":43},{"sl":47},{"sl":59},{"sl":63},{"sl":69},{"sl":73},{"sl":79},{"sl":83},{"sl":97},{"sl":107}],"name":"testSimpleJob","pass":true,"statements":[{"sl":44},{"sl":48},{"sl":49},{"sl":60},{"sl":64},{"sl":65},{"sl":66},{"sl":70},{"sl":74},{"sl":75},{"sl":76},{"sl":80},{"sl":84},{"sl":85},{"sl":86},{"sl":98},{"sl":108}]},"test_15":{"methods":[{"sl":43},{"sl":47},{"sl":59},{"sl":63},{"sl":83}],"name":"test0","pass":true,"statements":[{"sl":44},{"sl":48},{"sl":49},{"sl":60},{"sl":64},{"sl":65},{"sl":66},{"sl":84},{"sl":85},{"sl":86}]},"test_71":{"methods":[{"sl":43},{"sl":52},{"sl":59},{"sl":63},{"sl":69},{"sl":79},{"sl":83},{"sl":89},{"sl":97},{"sl":107}],"name":"testSampleJob","pass":true,"statements":[{"sl":44},{"sl":55},{"sl":56},{"sl":60},{"sl":64},{"sl":65},{"sl":66},{"sl":70},{"sl":80},{"sl":84},{"sl":85},{"sl":86},{"sl":90},{"sl":98},{"sl":108}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15, 10, 71], [15, 10, 71], [], [], [15, 10], [15, 10], [15, 10], [], [], [71], [], [], [71], [71], [], [], [15, 10, 71], [15, 10, 71], [], [], [15, 10, 71], [15, 10, 71], [15, 10, 71], [15, 10, 71], [], [], [10, 71], [10, 71], [], [], [10], [10], [10], [10], [], [], [10, 71], [10, 71], [], [], [15, 10, 71], [15, 10, 71], [15, 10, 71], [15, 10, 71], [], [], [71], [71], [], [], [], [], [], [], [10, 71], [10, 71], [], [], [], [], [], [], [], [], [10, 71], [10, 71], [], [], [], [], [], [], [], [], [], [], [], [], []]