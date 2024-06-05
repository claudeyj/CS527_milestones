var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":530,"id":15460,"methods":[{"el":83,"sc":5,"sl":78},{"el":88,"sc":5,"sl":85},{"el":93,"sc":5,"sl":90},{"el":97,"sc":5,"sl":95},{"el":101,"sc":5,"sl":99},{"el":105,"sc":5,"sl":103},{"el":109,"sc":5,"sl":107},{"el":113,"sc":5,"sl":111},{"el":118,"sc":5,"sl":115},{"el":122,"sc":5,"sl":120},{"el":127,"sc":5,"sl":124},{"el":131,"sc":5,"sl":129},{"el":147,"sc":5,"sl":141},{"el":159,"sc":5,"sl":157},{"el":182,"sc":5,"sl":174},{"el":196,"sc":5,"sl":184},{"el":200,"sc":5,"sl":198},{"el":277,"sc":5,"sl":202},{"el":298,"sc":5,"sl":279},{"el":305,"sc":5,"sl":300},{"el":309,"sc":5,"sl":307},{"el":317,"sc":5,"sl":311},{"el":322,"sc":5,"sl":319},{"el":329,"sc":5,"sl":324},{"el":333,"sc":5,"sl":331},{"el":341,"sc":5,"sl":335},{"el":346,"sc":5,"sl":343},{"el":350,"sc":5,"sl":348},{"el":354,"sc":5,"sl":352},{"el":371,"sc":5,"sl":356},{"el":377,"sc":5,"sl":373},{"el":385,"sc":5,"sl":379},{"el":394,"sc":5,"sl":387},{"el":402,"sc":5,"sl":396},{"el":410,"sc":5,"sl":404},{"el":418,"sc":5,"sl":412},{"el":448,"sc":5,"sl":420},{"el":475,"sc":5,"sl":450},{"el":482,"sc":5,"sl":477},{"el":490,"sc":5,"sl":484},{"el":498,"sc":5,"sl":492},{"el":502,"sc":5,"sl":500}],"name":"Configuration","sl":50},{"el":511,"id":15733,"methods":[],"name":"Configuration.MachineConfigurationHolder","sl":508},{"el":520,"id":15733,"methods":[],"name":"Configuration.PackagesConfigurationHolder","sl":517},{"el":529,"id":15733,"methods":[],"name":"Configuration.PartsConfigurationHolder","sl":526}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_22":{"methods":[{"sl":78},{"sl":184},{"sl":324},{"sl":500}],"name":"test04","pass":true,"statements":[{"sl":79},{"sl":82},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":325},{"sl":326},{"sl":501}]},"test_46":{"methods":[{"sl":78},{"sl":85},{"sl":90},{"sl":120},{"sl":184},{"sl":202},{"sl":279},{"sl":300},{"sl":311},{"sl":324},{"sl":335},{"sl":352},{"sl":356},{"sl":373},{"sl":379},{"sl":387},{"sl":396},{"sl":404},{"sl":412},{"sl":420},{"sl":484},{"sl":492},{"sl":500}],"name":"testSampleJob","pass":false,"statements":[{"sl":79},{"sl":82},{"sl":86},{"sl":87},{"sl":91},{"sl":92},{"sl":121},{"sl":185},{"sl":186},{"sl":203},{"sl":204},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":214},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":233},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":252},{"sl":262},{"sl":264},{"sl":265},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":274},{"sl":275},{"sl":280},{"sl":281},{"sl":286},{"sl":287},{"sl":292},{"sl":293},{"sl":301},{"sl":304},{"sl":312},{"sl":315},{"sl":316},{"sl":325},{"sl":328},{"sl":336},{"sl":339},{"sl":340},{"sl":353},{"sl":357},{"sl":363},{"sl":364},{"sl":365},{"sl":367},{"sl":368},{"sl":369},{"sl":370},{"sl":374},{"sl":375},{"sl":376},{"sl":380},{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":388},{"sl":389},{"sl":391},{"sl":392},{"sl":397},{"sl":398},{"sl":399},{"sl":400},{"sl":401},{"sl":405},{"sl":406},{"sl":407},{"sl":408},{"sl":413},{"sl":414},{"sl":415},{"sl":416},{"sl":417},{"sl":421},{"sl":422},{"sl":423},{"sl":427},{"sl":428},{"sl":432},{"sl":433},{"sl":436},{"sl":438},{"sl":441},{"sl":442},{"sl":445},{"sl":447},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":489},{"sl":493},{"sl":494},{"sl":495},{"sl":496},{"sl":497},{"sl":501}]},"test_53":{"methods":[{"sl":78},{"sl":184},{"sl":324},{"sl":500}],"name":"test1","pass":false,"statements":[{"sl":79},{"sl":82},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":325},{"sl":326},{"sl":501}]},"test_7":{"methods":[{"sl":78},{"sl":85},{"sl":90},{"sl":120},{"sl":184},{"sl":202},{"sl":300},{"sl":311},{"sl":324},{"sl":335},{"sl":352},{"sl":373},{"sl":387},{"sl":404},{"sl":492},{"sl":500}],"name":"testSimpleJob","pass":true,"statements":[{"sl":79},{"sl":82},{"sl":86},{"sl":87},{"sl":91},{"sl":92},{"sl":121},{"sl":185},{"sl":186},{"sl":203},{"sl":204},{"sl":206},{"sl":207},{"sl":208},{"sl":214},{"sl":225},{"sl":226},{"sl":227},{"sl":233},{"sl":244},{"sl":245},{"sl":246},{"sl":252},{"sl":262},{"sl":264},{"sl":265},{"sl":268},{"sl":274},{"sl":275},{"sl":301},{"sl":304},{"sl":312},{"sl":315},{"sl":316},{"sl":325},{"sl":328},{"sl":336},{"sl":339},{"sl":340},{"sl":353},{"sl":374},{"sl":375},{"sl":376},{"sl":388},{"sl":389},{"sl":391},{"sl":392},{"sl":405},{"sl":406},{"sl":407},{"sl":408},{"sl":493},{"sl":494},{"sl":495},{"sl":496},{"sl":497},{"sl":501}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [53, 7, 46, 22], [53, 7, 46, 22], [], [], [53, 7, 46, 22], [], [], [7, 46], [7, 46], [7, 46], [], [], [7, 46], [7, 46], [7, 46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7, 46], [7, 46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [53, 7, 46, 22], [53, 7, 46, 22], [53, 7, 46, 22], [53, 22], [53, 22], [53, 22], [], [], [], [], [], [], [], [], [], [], [], [], [7, 46], [7, 46], [7, 46], [], [7, 46], [7, 46], [7, 46], [46], [46], [46], [46], [], [7, 46], [], [], [], [], [], [], [], [], [], [], [7, 46], [7, 46], [7, 46], [46], [46], [46], [46], [], [7, 46], [], [], [], [], [], [], [], [], [], [], [7, 46], [7, 46], [7, 46], [46], [46], [46], [46], [], [7, 46], [], [], [], [], [], [], [], [], [], [7, 46], [], [7, 46], [7, 46], [], [], [7, 46], [46], [46], [46], [], [], [7, 46], [7, 46], [], [], [], [46], [46], [46], [], [], [], [], [46], [46], [], [], [], [], [46], [46], [], [], [], [], [], [], [7, 46], [7, 46], [], [], [7, 46], [], [], [], [], [], [], [7, 46], [7, 46], [], [], [7, 46], [7, 46], [], [], [], [], [], [], [], [53, 7, 46, 22], [53, 7, 46, 22], [53, 22], [], [7, 46], [], [], [], [], [], [], [7, 46], [7, 46], [], [], [7, 46], [7, 46], [], [], [], [], [], [], [], [], [], [], [], [7, 46], [7, 46], [], [], [46], [46], [], [], [], [], [], [46], [46], [46], [], [46], [46], [46], [46], [], [], [7, 46], [7, 46], [7, 46], [7, 46], [], [], [46], [46], [46], [46], [46], [46], [], [], [7, 46], [7, 46], [7, 46], [], [7, 46], [7, 46], [], [], [], [46], [46], [46], [46], [46], [46], [], [], [7, 46], [7, 46], [7, 46], [7, 46], [7, 46], [], [], [], [46], [46], [46], [46], [46], [46], [], [], [46], [46], [46], [46], [], [], [], [46], [46], [], [], [], [46], [46], [], [], [46], [], [46], [], [], [46], [46], [], [], [46], [], [46], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [46], [46], [46], [46], [46], [46], [], [], [7, 46], [7, 46], [7, 46], [7, 46], [7, 46], [7, 46], [], [], [53, 7, 46, 22], [53, 7, 46, 22], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
