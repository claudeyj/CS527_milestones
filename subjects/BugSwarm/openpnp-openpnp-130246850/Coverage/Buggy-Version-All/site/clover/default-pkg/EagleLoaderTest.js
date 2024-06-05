var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":21952,"methods":[{"el":20,"sc":5,"sl":13},{"el":29,"sc":5,"sl":22}],"name":"EagleLoaderTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4":{"methods":[{"sl":22}],"name":"testLoadSchematic","pass":false,"statements":[{"sl":24}]},"test_5":{"methods":[{"sl":13}],"name":"testLoadBoard","pass":false,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [5], [], [5], [], [], [], [], [], [], [4], [], [4], [], [], [], [], [], []]
