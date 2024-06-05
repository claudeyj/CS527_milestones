var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":243,"id":4728,"methods":[{"el":25,"sc":5,"sl":24},{"el":148,"sc":5,"sl":142},{"el":156,"sc":5,"sl":150},{"el":179,"sc":5,"sl":158},{"el":187,"sc":5,"sl":181},{"el":195,"sc":5,"sl":189},{"el":203,"sc":5,"sl":197},{"el":212,"sc":5,"sl":205},{"el":220,"sc":5,"sl":214},{"el":241,"sc":5,"sl":222}],"name":"Checksum","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_112":{"methods":[{"sl":222}],"name":"testDecode","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":236},{"sl":237},{"sl":240}]},"test_113":{"methods":[{"sl":189}],"name":"testEncode","pass":true,"statements":[{"sl":190},{"sl":191},{"sl":192},{"sl":194}]},"test_121":{"methods":[{"sl":222}],"name":"testDecode","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":236},{"sl":237},{"sl":240}]},"test_132":{"methods":[{"sl":214}],"name":"testEncode","pass":true,"statements":[{"sl":215},{"sl":216},{"sl":217},{"sl":219}]},"test_170":{"methods":[{"sl":142},{"sl":150},{"sl":158}],"name":"testCrc16","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":159},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_181":{"methods":[{"sl":142},{"sl":158}],"name":"testEncode","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":159},{"sl":164},{"sl":165}]},"test_191":{"methods":[{"sl":150},{"sl":158}],"name":"testEncode","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":159},{"sl":162},{"sl":163}]},"test_206":{"methods":[{"sl":150},{"sl":158}],"name":"testEncode","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":159},{"sl":166},{"sl":167}]},"test_208":{"methods":[{"sl":150},{"sl":158}],"name":"testEncode","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":159},{"sl":160},{"sl":161}]},"test_211":{"methods":[{"sl":222}],"name":"testLuhn","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":236},{"sl":237},{"sl":240}]},"test_215":{"methods":[{"sl":142},{"sl":158}],"name":"testDecode","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":159},{"sl":164},{"sl":165}]},"test_258":{"methods":[{"sl":150},{"sl":158}],"name":"testEncode","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":159},{"sl":166},{"sl":167}]},"test_282":{"methods":[{"sl":222}],"name":"testDecode","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":236},{"sl":237},{"sl":240}]},"test_334":{"methods":[{"sl":205}],"name":"testDecode","pass":true,"statements":[{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":211}]},"test_97":{"methods":[{"sl":205}],"name":"testFormatRequest","pass":true,"statements":[{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":211}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [215, 170, 181], [215, 170, 181], [215, 170, 181], [215, 170, 181], [], [215, 170, 181], [], [], [258, 170, 206, 208, 191], [258, 170, 206, 208, 191], [258, 170, 206, 208, 191], [258, 170, 206, 208, 191], [], [258, 170, 206, 208, 191], [], [], [215, 258, 170, 206, 181, 208, 191], [215, 258, 170, 206, 181, 208, 191], [208], [208], [170, 191], [170, 191], [215, 170, 181], [215, 170, 181], [258, 170, 206], [258, 170, 206], [170], [170], [170], [170], [170], [170], [170], [170], [], [], [], [], [], [], [], [], [], [], [], [], [], [113], [113], [113], [113], [], [113], [], [], [], [], [], [], [], [], [], [], [334, 97], [334, 97], [334, 97], [334, 97], [334, 97], [], [334, 97], [], [], [132], [132], [132], [132], [], [132], [], [], [121, 282, 112, 211], [121, 282, 112, 211], [121, 282, 112, 211], [], [121, 282, 112, 211], [121, 282, 112, 211], [], [121, 282, 112, 211], [121, 282, 112, 211], [121, 282, 112, 211], [121, 282, 112, 211], [], [], [], [121, 282, 112, 211], [121, 282, 112, 211], [], [], [121, 282, 112, 211], [], [], []]
