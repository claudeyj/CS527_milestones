var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":213,"id":20457,"methods":[{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":57,"sc":5,"sl":55},{"el":67,"sc":5,"sl":59},{"el":77,"sc":5,"sl":69},{"el":87,"sc":5,"sl":79},{"el":91,"sc":5,"sl":89}],"name":"CvStage","sl":19},{"el":153,"id":20482,"methods":[{"el":103,"sc":9,"sl":96},{"el":113,"sc":9,"sl":105},{"el":118,"sc":9,"sl":115},{"el":123,"sc":9,"sl":120},{"el":132,"sc":9,"sl":125},{"el":137,"sc":9,"sl":134},{"el":142,"sc":9,"sl":139},{"el":147,"sc":9,"sl":144},{"el":152,"sc":9,"sl":149}],"name":"CvStage.CvStageBeanInfo","sl":93},{"el":212,"id":20511,"methods":[{"el":164,"sc":9,"sl":160},{"el":168,"sc":9,"sl":166},{"el":172,"sc":9,"sl":170}],"name":"CvStage.Result","sl":155},{"el":189,"id":20519,"methods":[{"el":183,"sc":13,"sl":179},{"el":188,"sc":13,"sl":185}],"name":"CvStage.Result.Circle","sl":174},{"el":211,"id":20525,"methods":[{"el":204,"sc":13,"sl":198},{"el":210,"sc":13,"sl":206}],"name":"CvStage.Result.TemplateMatch","sl":191}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":43},{"sl":47}],"name":"testSimpleJob","pass":true,"statements":[{"sl":44},{"sl":48}]},"test_71":{"methods":[{"sl":43},{"sl":47}],"name":"testSampleJob","pass":true,"statements":[{"sl":44},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10, 71], [10, 71], [], [], [10, 71], [10, 71], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
