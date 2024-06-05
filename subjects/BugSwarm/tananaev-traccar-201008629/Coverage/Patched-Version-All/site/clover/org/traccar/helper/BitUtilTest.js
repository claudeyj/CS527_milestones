var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":23605,"methods":[{"el":13,"sc":5,"sl":8},{"el":21,"sc":5,"sl":15},{"el":27,"sc":5,"sl":23},{"el":33,"sc":5,"sl":29}],"name":"BitUtilTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_234":{"methods":[{"sl":23}],"name":"testFrom","pass":true,"statements":[{"sl":25},{"sl":26}]},"test_261":{"methods":[{"sl":29}],"name":"testTo","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_329":{"methods":[{"sl":8}],"name":"testCheck","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":12}]},"test_91":{"methods":[{"sl":15}],"name":"testBetween","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [329], [], [329], [329], [329], [], [], [91], [], [91], [91], [91], [91], [], [], [234], [], [234], [234], [], [], [261], [], [261], [261], [], [], []]
