var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":113,"id":12345,"methods":[{"el":34,"sc":5,"sl":32},{"el":111,"sc":5,"sl":57}],"name":"HaicomProtocolDecoder","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_54":{"methods":[{"sl":32},{"sl":57}],"name":"testDecode","pass":true,"statements":[{"sl":33},{"sl":61},{"sl":62},{"sl":66},{"sl":67},{"sl":69},{"sl":70},{"sl":73},{"sl":75},{"sl":77},{"sl":80},{"sl":82},{"sl":84},{"sl":86},{"sl":87},{"sl":88},{"sl":93},{"sl":94},{"sl":95},{"sl":97},{"sl":100},{"sl":101},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":110}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [54], [54], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [54], [], [], [], [54], [54], [], [], [], [54], [54], [], [54], [54], [], [], [54], [], [54], [], [54], [], [], [54], [], [54], [], [54], [], [54], [54], [54], [], [], [], [], [54], [54], [54], [], [54], [], [], [54], [54], [], [54], [54], [54], [54], [54], [54], [], [54], [], [], []]