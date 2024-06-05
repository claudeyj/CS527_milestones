var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":23,"id":11210,"methods":[{"el":13,"sc":5,"sl":11},{"el":21,"sc":5,"sl":15}],"name":"TestDataManager","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_1":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_10":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_100":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_101":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_102":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_103":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_104":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_105":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_106":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_108":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_109":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_11":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_111":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_112":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_13":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_14":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_15":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_17":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_18":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_19":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_2":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_20":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_21":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_22":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_23":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_24":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_25":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_26":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_27":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_28":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_29":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_3":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_30":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_31":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_32":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_35":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_36":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_38":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_41":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_42":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_44":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_45":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_46":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_48":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_5":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_50":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_51":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_52":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_54":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_55":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_57":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_58":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_62":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_63":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_67":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_68":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_7":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_70":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_71":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_72":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_74":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_75":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_76":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_78":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_79":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_80":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_81":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_82":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_83":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_84":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_85":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_86":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_87":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_89":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_9":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_92":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_94":{"methods":[{"sl":15}],"name":"testDecode","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_95":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_96":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_97":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_99":{"methods":[{"sl":15}],"name":"testDecode","pass":false,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [52, 15, 24, 44, 35, 5, 28, 55, 7, 112, 0, 101, 21, 84, 68, 31, 11, 81, 70, 45, 92, 103, 108, 75, 54, 41, 94, 1, 76, 10, 29, 85, 109, 63, 78, 82, 9, 46, 20, 104, 83, 62, 48, 2, 89, 67, 100, 23, 80, 13, 26, 105, 95, 58, 97, 3, 38, 106, 87, 27, 111, 32, 51, 99, 14, 96, 72, 42, 25, 102, 57, 19, 74, 22, 86, 79, 17, 30, 18, 50, 71, 36], [], [52, 15, 24, 44, 35, 5, 28, 55, 7, 112, 0, 101, 21, 84, 68, 31, 11, 81, 70, 45, 92, 103, 108, 75, 54, 41, 94, 1, 76, 10, 29, 85, 109, 63, 78, 82, 9, 46, 20, 104, 83, 62, 48, 2, 89, 67, 100, 23, 80, 13, 26, 105, 95, 58, 97, 3, 38, 106, 87, 27, 111, 32, 51, 99, 14, 96, 72, 42, 25, 102, 57, 19, 74, 22, 86, 79, 17, 30, 18, 50, 71, 36], [52, 15, 24, 44, 35, 5, 28, 55, 7, 112, 0, 101, 21, 84, 68, 31, 11, 81, 70, 45, 92, 103, 108, 75, 54, 41, 94, 1, 76, 10, 29, 85, 109, 63, 78, 82, 9, 46, 20, 104, 83, 62, 48, 2, 89, 67, 100, 23, 80, 13, 26, 105, 95, 58, 97, 3, 38, 106, 87, 27, 111, 32, 51, 99, 14, 96, 72, 42, 25, 102, 57, 19, 74, 22, 86, 79, 17, 30, 18, 50, 71, 36], [52, 15, 24, 44, 35, 5, 28, 55, 7, 112, 0, 101, 21, 84, 68, 31, 11, 81, 70, 45, 92, 103, 108, 75, 54, 41, 94, 1, 76, 10, 29, 85, 109, 63, 78, 82, 9, 46, 20, 104, 83, 62, 48, 2, 89, 67, 100, 23, 80, 13, 26, 105, 95, 58, 97, 3, 38, 106, 87, 27, 111, 32, 51, 99, 14, 96, 72, 42, 25, 102, 57, 19, 74, 22, 86, 79, 17, 30, 18, 50, 71, 36], [52, 15, 24, 44, 35, 5, 28, 55, 7, 112, 0, 101, 21, 84, 68, 31, 11, 81, 70, 45, 92, 103, 108, 75, 54, 41, 94, 1, 76, 10, 29, 85, 109, 63, 78, 82, 9, 46, 20, 104, 83, 62, 48, 2, 89, 67, 100, 23, 80, 13, 26, 105, 95, 58, 97, 3, 38, 106, 87, 27, 111, 32, 51, 99, 14, 96, 72, 42, 25, 102, 57, 19, 74, 22, 86, 79, 17, 30, 18, 50, 71, 36], [], [], []]
