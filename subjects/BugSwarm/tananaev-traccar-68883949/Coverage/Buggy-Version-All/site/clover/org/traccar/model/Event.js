var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":2287,"methods":[{"el":25,"sc":5,"sl":25},{"el":26,"sc":5,"sl":26},{"el":29,"sc":5,"sl":29},{"el":30,"sc":5,"sl":30},{"el":33,"sc":5,"sl":33},{"el":34,"sc":5,"sl":34},{"el":37,"sc":5,"sl":37},{"el":38,"sc":5,"sl":38},{"el":41,"sc":5,"sl":41},{"el":42,"sc":5,"sl":42},{"el":49,"sc":5,"sl":45},{"el":52,"sc":5,"sl":50}],"name":"Event","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_101":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_102":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_103":{"methods":[{"sl":30},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":46},{"sl":47}]},"test_104":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_105":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_106":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_108":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_109":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_112":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_14":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_15":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_17":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_18":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_19":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_21":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_24":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_25":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_26":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_27":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_28":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_29":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_3":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_30":{"methods":[{"sl":30},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":46},{"sl":47}]},"test_31":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_35":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_36":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_38":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_41":{"methods":[{"sl":30},{"sl":42},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":42},{"sl":46},{"sl":47}]},"test_42":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_44":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_45":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_46":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_48":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_5":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_50":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_51":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_52":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_54":{"methods":[{"sl":30},{"sl":42},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":42},{"sl":46}]},"test_55":{"methods":[{"sl":30},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":46},{"sl":47}]},"test_57":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_58":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_62":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_63":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_64":{"methods":[{"sl":33},{"sl":34},{"sl":42}],"name":"testFilterInvalid","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":42}]},"test_67":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_70":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_72":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_75":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_76":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_77":{"methods":[{"sl":45},{"sl":50}],"name":"testToString","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":51}]},"test_79":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_80":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_82":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_85":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_86":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_87":{"methods":[{"sl":30},{"sl":42},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":42},{"sl":46},{"sl":47}]},"test_9":{"methods":[{"sl":30},{"sl":45}],"name":"testDecode","pass":false,"statements":[{"sl":30},{"sl":46},{"sl":47}]},"test_94":{"methods":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":45},{"sl":50}],"name":"testDecode","pass":true,"statements":[{"sl":30},{"sl":33},{"sl":34},{"sl":42},{"sl":46},{"sl":47},{"sl":51}]},"test_96":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]},"test_97":{"methods":[{"sl":30}],"name":"testDecode","pass":false,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [52, 15, 24, 44, 35, 28, 5, 55, 112, 101, 21, 31, 70, 45, 108, 103, 75, 54, 41, 94, 76, 10, 29, 85, 109, 63, 82, 9, 46, 62, 104, 48, 67, 80, 26, 105, 58, 97, 3, 106, 38, 87, 27, 51, 14, 96, 42, 72, 25, 102, 19, 57, 79, 86, 17, 30, 18, 50, 36], [], [], [5, 101, 31, 94, 82, 64, 72], [5, 101, 31, 94, 82, 64, 72], [], [], [], [], [], [], [], [5, 101, 31, 54, 41, 94, 82, 87, 64, 72], [], [], [5, 55, 101, 31, 103, 54, 77, 41, 94, 82, 9, 87, 72, 30], [5, 55, 101, 31, 103, 54, 77, 41, 94, 82, 9, 87, 72, 30], [5, 55, 101, 31, 103, 77, 41, 94, 82, 9, 87, 72, 30], [], [], [5, 101, 31, 77, 94, 82, 72], [5, 101, 31, 77, 94, 82, 72], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
