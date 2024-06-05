var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":287,"id":9787,"methods":[{"el":67,"sc":13,"sl":62},{"el":69,"sc":5,"sl":60},{"el":73,"sc":5,"sl":71},{"el":77,"sc":5,"sl":75},{"el":81,"sc":5,"sl":79},{"el":85,"sc":5,"sl":83},{"el":89,"sc":5,"sl":87},{"el":93,"sc":5,"sl":91},{"el":98,"sc":5,"sl":95},{"el":103,"sc":5,"sl":100},{"el":108,"sc":5,"sl":105},{"el":123,"sc":5,"sl":110},{"el":135,"sc":5,"sl":125},{"el":157,"sc":5,"sl":137},{"el":173,"sc":5,"sl":159},{"el":200,"sc":5,"sl":175},{"el":222,"sc":5,"sl":202},{"el":227,"sc":5,"sl":224},{"el":231,"sc":5,"sl":229},{"el":235,"sc":5,"sl":233},{"el":240,"sc":5,"sl":237},{"el":245,"sc":5,"sl":242},{"el":252,"sc":5,"sl":247},{"el":257,"sc":5,"sl":254},{"el":263,"sc":5,"sl":259},{"el":268,"sc":5,"sl":265},{"el":272,"sc":5,"sl":270},{"el":276,"sc":5,"sl":274},{"el":281,"sc":5,"sl":278},{"el":286,"sc":5,"sl":283}],"name":"ReferenceNozzle","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":60},{"sl":62},{"sl":95},{"sl":105},{"sl":110},{"sl":125},{"sl":137},{"sl":159},{"sl":175},{"sl":202},{"sl":224},{"sl":265},{"sl":278},{"sl":283}],"name":"testSimpleJob","pass":true,"statements":[{"sl":61},{"sl":64},{"sl":65},{"sl":66},{"sl":97},{"sl":107},{"sl":112},{"sl":113},{"sl":116},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":127},{"sl":128},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":142},{"sl":143},{"sl":145},{"sl":146},{"sl":155},{"sl":156},{"sl":164},{"sl":165},{"sl":167},{"sl":168},{"sl":169},{"sl":171},{"sl":172},{"sl":177},{"sl":180},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":188},{"sl":189},{"sl":191},{"sl":192},{"sl":194},{"sl":195},{"sl":196},{"sl":198},{"sl":199},{"sl":204},{"sl":205},{"sl":207},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":221},{"sl":226},{"sl":267},{"sl":280},{"sl":285}]},"test_71":{"methods":[{"sl":60},{"sl":62},{"sl":95},{"sl":105},{"sl":110},{"sl":125},{"sl":137},{"sl":159},{"sl":224},{"sl":278},{"sl":283}],"name":"testSampleJob","pass":true,"statements":[{"sl":61},{"sl":64},{"sl":65},{"sl":66},{"sl":97},{"sl":107},{"sl":112},{"sl":113},{"sl":116},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":127},{"sl":128},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":142},{"sl":143},{"sl":145},{"sl":146},{"sl":148},{"sl":152},{"sl":155},{"sl":156},{"sl":164},{"sl":165},{"sl":167},{"sl":168},{"sl":169},{"sl":171},{"sl":172},{"sl":226},{"sl":280},{"sl":285}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10, 71], [10, 71], [10, 71], [], [10, 71], [10, 71], [10, 71], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10, 71], [], [10, 71], [], [], [], [], [], [], [], [10, 71], [], [10, 71], [], [], [10, 71], [], [10, 71], [10, 71], [], [], [10, 71], [], [], [10, 71], [10, 71], [10, 71], [10, 71], [], [], [10, 71], [], [10, 71], [10, 71], [], [], [10, 71], [10, 71], [10, 71], [10, 71], [], [], [10, 71], [], [], [], [], [10, 71], [10, 71], [], [10, 71], [10, 71], [], [71], [], [], [], [71], [], [], [10, 71], [10, 71], [], [], [10, 71], [], [], [], [], [10, 71], [10, 71], [], [10, 71], [10, 71], [10, 71], [], [10, 71], [10, 71], [], [], [10], [], [10], [], [], [10], [], [], [10], [10], [10], [10], [], [10], [10], [], [10], [10], [], [10], [10], [10], [], [10], [10], [], [], [10], [], [10], [10], [], [10], [], [], [10], [10], [10], [10], [10], [10], [10], [10], [10], [10], [10], [10], [], [], [10, 71], [], [10, 71], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [], [10], [], [], [], [], [], [], [], [], [], [], [10, 71], [], [10, 71], [], [], [10, 71], [], [10, 71], [], []]