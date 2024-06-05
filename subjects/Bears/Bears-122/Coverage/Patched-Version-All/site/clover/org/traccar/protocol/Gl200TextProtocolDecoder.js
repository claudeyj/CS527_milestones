var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":882,"id":12101,"methods":[{"el":47,"sc":5,"sl":43},{"el":365,"sc":5,"sl":341},{"el":378,"sc":5,"sl":367},{"el":388,"sc":5,"sl":380},{"el":421,"sc":5,"sl":390},{"el":437,"sc":5,"sl":423},{"el":469,"sc":5,"sl":439},{"el":497,"sc":5,"sl":471},{"el":510,"sc":5,"sl":499},{"el":567,"sc":5,"sl":512},{"el":625,"sc":5,"sl":569},{"el":642,"sc":5,"sl":627},{"el":660,"sc":5,"sl":644},{"el":686,"sc":5,"sl":662},{"el":712,"sc":5,"sl":688},{"el":742,"sc":5,"sl":714},{"el":812,"sc":5,"sl":744},{"el":880,"sc":5,"sl":814}],"name":"Gl200TextProtocolDecoder","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_248":{"methods":[{"sl":43}],"name":"test0","pass":false,"statements":[{"sl":44},{"sl":46}]},"test_55":{"methods":[{"sl":43}],"name":"test1","pass":true,"statements":[{"sl":44},{"sl":46}]},"test_70":{"methods":[{"sl":43},{"sl":341},{"sl":367},{"sl":380},{"sl":390},{"sl":423},{"sl":439},{"sl":471},{"sl":499},{"sl":512},{"sl":569},{"sl":627},{"sl":644},{"sl":662},{"sl":688},{"sl":714},{"sl":744},{"sl":814}],"name":"testDecode","pass":true,"statements":[{"sl":44},{"sl":46},{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":349},{"sl":350},{"sl":355},{"sl":356},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":364},{"sl":368},{"sl":369},{"sl":370},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":377},{"sl":381},{"sl":382},{"sl":385},{"sl":391},{"sl":392},{"sl":393},{"sl":394},{"sl":397},{"sl":399},{"sl":401},{"sl":403},{"sl":404},{"sl":406},{"sl":408},{"sl":410},{"sl":411},{"sl":413},{"sl":414},{"sl":416},{"sl":418},{"sl":420},{"sl":424},{"sl":425},{"sl":426},{"sl":430},{"sl":431},{"sl":432},{"sl":434},{"sl":436},{"sl":440},{"sl":441},{"sl":442},{"sl":444},{"sl":445},{"sl":446},{"sl":448},{"sl":449},{"sl":450},{"sl":451},{"sl":452},{"sl":454},{"sl":457},{"sl":458},{"sl":459},{"sl":460},{"sl":461},{"sl":463},{"sl":464},{"sl":468},{"sl":472},{"sl":473},{"sl":474},{"sl":475},{"sl":478},{"sl":479},{"sl":480},{"sl":481},{"sl":482},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":490},{"sl":492},{"sl":494},{"sl":496},{"sl":500},{"sl":501},{"sl":502},{"sl":503},{"sl":504},{"sl":505},{"sl":507},{"sl":508},{"sl":513},{"sl":514},{"sl":515},{"sl":518},{"sl":519},{"sl":523},{"sl":525},{"sl":526},{"sl":528},{"sl":529},{"sl":530},{"sl":531},{"sl":532},{"sl":534},{"sl":536},{"sl":538},{"sl":541},{"sl":543},{"sl":546},{"sl":547},{"sl":550},{"sl":551},{"sl":553},{"sl":554},{"sl":555},{"sl":556},{"sl":557},{"sl":559},{"sl":561},{"sl":562},{"sl":564},{"sl":566},{"sl":570},{"sl":571},{"sl":575},{"sl":576},{"sl":580},{"sl":582},{"sl":584},{"sl":585},{"sl":586},{"sl":587},{"sl":588},{"sl":590},{"sl":592},{"sl":595},{"sl":597},{"sl":599},{"sl":600},{"sl":601},{"sl":602},{"sl":603},{"sl":604},{"sl":606},{"sl":608},{"sl":609},{"sl":610},{"sl":611},{"sl":612},{"sl":613},{"sl":614},{"sl":615},{"sl":616},{"sl":617},{"sl":622},{"sl":624},{"sl":628},{"sl":629},{"sl":630},{"sl":634},{"sl":636},{"sl":637},{"sl":639},{"sl":641},{"sl":645},{"sl":646},{"sl":647},{"sl":651},{"sl":653},{"sl":655},{"sl":657},{"sl":659},{"sl":663},{"sl":664},{"sl":665},{"sl":669},{"sl":671},{"sl":673},{"sl":674},{"sl":675},{"sl":676},{"sl":677},{"sl":681},{"sl":683},{"sl":685},{"sl":689},{"sl":690},{"sl":691},{"sl":695},{"sl":697},{"sl":699},{"sl":700},{"sl":701},{"sl":702},{"sl":709},{"sl":711},{"sl":715},{"sl":716},{"sl":717},{"sl":718},{"sl":721},{"sl":722},{"sl":723},{"sl":724},{"sl":725},{"sl":728},{"sl":730},{"sl":731},{"sl":733},{"sl":735},{"sl":737},{"sl":741},{"sl":745},{"sl":746},{"sl":747},{"sl":748},{"sl":751},{"sl":752},{"sl":753},{"sl":755},{"sl":756},{"sl":757},{"sl":759},{"sl":760},{"sl":761},{"sl":763},{"sl":766},{"sl":767},{"sl":770},{"sl":771},{"sl":775},{"sl":777},{"sl":790},{"sl":791},{"sl":792},{"sl":793},{"sl":794},{"sl":795},{"sl":796},{"sl":797},{"sl":798},{"sl":800},{"sl":801},{"sl":802},{"sl":803},{"sl":804},{"sl":805},{"sl":806},{"sl":807},{"sl":808},{"sl":811},{"sl":818},{"sl":820},{"sl":821},{"sl":825},{"sl":826},{"sl":827},{"sl":828},{"sl":830},{"sl":831},{"sl":832},{"sl":833},{"sl":834},{"sl":835},{"sl":836},{"sl":837},{"sl":838},{"sl":839},{"sl":840},{"sl":841},{"sl":842},{"sl":843},{"sl":844},{"sl":845},{"sl":846},{"sl":847},{"sl":848},{"sl":849},{"sl":850},{"sl":851},{"sl":852},{"sl":853},{"sl":854},{"sl":855},{"sl":856},{"sl":857},{"sl":858},{"sl":859},{"sl":860},{"sl":861},{"sl":864},{"sl":865},{"sl":868},{"sl":869},{"sl":870},{"sl":872},{"sl":873},{"sl":879}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [55, 248, 70], [55, 248, 70], [], [55, 248, 70], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [70], [70], [70], [70], [70], [70], [], [], [70], [70], [], [], [], [], [70], [70], [70], [70], [70], [70], [70], [], [], [70], [], [], [70], [70], [70], [70], [70], [70], [70], [70], [], [], [70], [], [], [70], [70], [70], [], [], [70], [], [], [], [], [70], [70], [70], [70], [70], [], [], [70], [], [70], [], [70], [], [70], [70], [], [70], [], [70], [], [70], [70], [], [70], [70], [], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [], [], [70], [70], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [70], [70], [70], [], [70], [70], [70], [70], [70], [], [70], [], [], [70], [70], [70], [70], [70], [], [70], [70], [], [], [], [70], [], [], [70], [70], [70], [70], [70], [], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [70], [], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [70], [70], [70], [], [70], [70], [], [], [], [70], [70], [70], [70], [], [], [70], [70], [], [], [], [70], [], [70], [70], [], [70], [70], [70], [70], [70], [], [70], [], [70], [], [70], [], [], [70], [], [70], [], [], [70], [70], [], [], [70], [70], [], [70], [70], [70], [70], [70], [], [70], [], [70], [70], [], [70], [], [70], [], [], [70], [70], [70], [], [], [], [70], [70], [], [], [], [70], [], [70], [], [70], [70], [70], [70], [70], [], [70], [], [70], [], [], [70], [], [70], [], [70], [70], [70], [70], [70], [70], [], [70], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [], [], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [], [], [70], [], [70], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [], [], [70], [], [70], [], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [], [], [70], [], [70], [], [70], [70], [70], [70], [70], [], [], [], [70], [], [70], [], [70], [], [], [70], [70], [70], [70], [], [], [], [70], [], [70], [], [70], [70], [70], [70], [], [], [], [], [], [], [70], [], [70], [], [], [70], [70], [70], [70], [70], [], [], [70], [70], [70], [70], [70], [], [], [70], [], [70], [70], [], [70], [], [70], [], [70], [], [], [], [70], [], [], [70], [70], [70], [70], [70], [], [], [70], [70], [70], [], [70], [70], [70], [], [70], [70], [70], [], [70], [], [], [70], [70], [], [], [70], [70], [], [], [], [70], [], [70], [], [], [], [], [], [], [], [], [], [], [], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [], [70], [], [], [70], [], [], [], [70], [], [70], [70], [], [], [], [70], [70], [70], [70], [], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [70], [], [], [70], [70], [], [], [70], [70], [70], [], [70], [70], [], [], [], [], [], [70], [], [], []]
