/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class WRAP_TEST {static class __CLR4_5_2449449lwzsanyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,5357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_2449449lwzsanyl.R.globalSliceStart(getClass().getName(),5337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2449();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2449449lwzsanyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2449449lwzsanyl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.WRAP_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2449() throws java.lang.Exception{try{__CLR4_5_2449449lwzsanyl.R.inc(5337);
        __CLR4_5_2449449lwzsanyl.R.inc(5338);java.util.ArrayList result = java_programs.WRAP.wrap((java.lang.String)"The leaves did not stir on the trees, grasshoppers chirruped, and the monotonous hollow sound of the sea rising up from below, spoke of the peace, of the eternal sleep awaiting us. So it must have sounded when there was no Yalta, no Oreanda here; so it sounds now, and it will sound as indifferently and monotonously when we are all no more. And in this constancy, in this complete indifference to the life and death of each of us, there lies hid, perhaps, a pledge of our eternal salvation, of the unceasing movement of life upon earth, of unceasing progress towards perfection. Sitting beside a young woman who in the dawn seemed so lovely, soothed and spellbound in these magical surroundings - the sea, mountains, clouds, the open sky - Gurov thought how in reality everything is beautiful in this world when one reflects: everything except what we think or do ourselves when we forget our human dignity and the higher aims of our existence.",(int)50);
        __CLR4_5_2449449lwzsanyl.R.inc(5339);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2449449lwzsanyl.R.inc(5340);org.junit.Assert.assertEquals("[Theleavesdidnotstironthetrees,grasshoppers,chirruped,andthemonotonoushollowsoundofthe,searisingupfrombelow,spokeofthepeace,of,theeternalsleepawaitingus.Soitmusthave,soundedwhentherewasnoYalta,noOreandahere;,soitsoundsnow,anditwillsoundas,indifferentlyandmonotonouslywhenweareallno,more.Andinthisconstancy,inthiscomplete,indifferencetothelifeanddeathofeachofus,,therelieshid,perhaps,apledgeofoureternal,salvation,oftheunceasingmovementoflifeupon,earth,ofunceasingprogresstowardsperfection.,Sittingbesideayoungwomanwhointhedawn,seemedsolovely,soothedandspellboundinthese,magicalsurroundings-thesea,mountains,,clouds,theopensky-Gurovthoughthowin,realityeverythingisbeautifulinthisworld,whenonereflects:everythingexceptwhatwe,thinkordoourselveswhenweforgetourhuman,dignityandthehigheraimsofourexistence.]", resultFormatted);
    }finally{__CLR4_5_2449449lwzsanyl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_2449449lwzsanyl.R.globalSliceStart(getClass().getName(),5341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl44d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2449449lwzsanyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2449449lwzsanyl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.WRAP_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl44d() throws java.lang.Exception{try{__CLR4_5_2449449lwzsanyl.R.inc(5341);
        __CLR4_5_2449449lwzsanyl.R.inc(5342);java.util.ArrayList result = java_programs.WRAP.wrap((java.lang.String)"The leaves did not stir on the trees, grasshoppers chirruped, and the monotonous hollow sound of the sea rising up from below, spoke of the peace, of the eternal sleep awaiting us. So it must have sounded when there was no Yalta, no Oreanda here; so it sounds now, and it will sound as indifferently and monotonously when we are all no more. And in this constancy, in this complete indifference to the life and death of each of us, there lies hid, perhaps, a pledge of our eternal salvation, of the unceasing movement of life upon earth, of unceasing progress towards perfection. Sitting beside a young woman who in the dawn seemed so lovely, soothed and spellbound in these magical surroundings - the sea, mountains, clouds, the open sky - Gurov thought how in reality everything is beautiful in this world when one reflects: everything except what we think or do ourselves when we forget our human dignity and the higher aims of our existence.",(int)20);
        __CLR4_5_2449449lwzsanyl.R.inc(5343);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2449449lwzsanyl.R.inc(5344);org.junit.Assert.assertEquals("[Theleavesdidnot,stironthetrees,,grasshoppers,chirruped,andthe,monotonoushollow,soundofthesea,risingupfrom,below,spokeofthe,peace,ofthe,eternalsleep,awaitingus.Soit,musthavesounded,whentherewasno,Yalta,noOreanda,here;soitsounds,now,anditwill,soundas,indifferentlyand,monotonouslywhen,weareallnomore.,Andinthis,constancy,inthis,complete,indifferencetothe,lifeanddeathof,eachofus,there,lieshid,perhaps,,apledgeofour,eternalsalvation,,oftheunceasing,movementoflife,uponearth,of,unceasingprogress,towardsperfection.,Sittingbesidea,youngwomanwhoin,thedawnseemedso,lovely,soothedand,spellboundinthese,magical,surroundings-the,sea,mountains,,clouds,theopen,sky-Gurovthought,howinreality,everythingis,beautifulinthis,worldwhenone,reflects:,everythingexcept,whatwethinkordo,ourselveswhenwe,forgetourhuman,dignityandthe,higheraimsofour,existence.]", resultFormatted);
    }finally{__CLR4_5_2449449lwzsanyl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_2449449lwzsanyl.R.globalSliceStart(getClass().getName(),5345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4444h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2449449lwzsanyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2449449lwzsanyl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.WRAP_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4444h() throws java.lang.Exception{try{__CLR4_5_2449449lwzsanyl.R.inc(5345);
        __CLR4_5_2449449lwzsanyl.R.inc(5346);java.util.ArrayList result = java_programs.WRAP.wrap((java.lang.String)"The leaves did not stir on the trees, grasshoppers chirruped, and the monotonous hollow sound of the sea rising up from below, spoke of the peace, of the eternal sleep awaiting us. So it must have sounded when there was no Yalta, no Oreanda here; so it sounds now, and it will sound as indifferently and monotonously when we are all no more. And in this constancy, in this complete indifference to the life and death of each of us, there lies hid, perhaps, a pledge of our eternal salvation, of the unceasing movement of life upon earth, of unceasing progress towards perfection. Sitting beside a young woman who in the dawn seemed so lovely, soothed and spellbound in these magical surroundings - the sea, mountains, clouds, the open sky - Gurov thought how in reality everything is beautiful in this world when one reflects: everything except what we think or do ourselves when we forget our human dignity and the higher aims of our existence.",(int)80);
        __CLR4_5_2449449lwzsanyl.R.inc(5347);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2449449lwzsanyl.R.inc(5348);org.junit.Assert.assertEquals("[Theleavesdidnotstironthetrees,grasshopperschirruped,andthemonotonous,hollowsoundofthesearisingupfrombelow,spokeofthepeace,ofthe,eternalsleepawaitingus.SoitmusthavesoundedwhentherewasnoYalta,no,Oreandahere;soitsoundsnow,anditwillsoundasindifferentlyand,monotonouslywhenweareallnomore.Andinthisconstancy,inthiscomplete,indifferencetothelifeanddeathofeachofus,therelieshid,perhaps,a,pledgeofoureternalsalvation,oftheunceasingmovementoflifeuponearth,,ofunceasingprogresstowardsperfection.Sittingbesideayoungwomanwhoin,thedawnseemedsolovely,soothedandspellboundinthesemagicalsurroundings,-thesea,mountains,clouds,theopensky-Gurovthoughthowinreality,everythingisbeautifulinthisworldwhenonereflects:everythingexceptwhat,wethinkordoourselveswhenweforgetourhumandignityandthehigheraims,ofourexistence.]", resultFormatted);
    }finally{__CLR4_5_2449449lwzsanyl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_2449449lwzsanyl.R.globalSliceStart(getClass().getName(),5349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn44l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2449449lwzsanyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2449449lwzsanyl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.WRAP_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn44l() throws java.lang.Exception{try{__CLR4_5_2449449lwzsanyl.R.inc(5349);
        __CLR4_5_2449449lwzsanyl.R.inc(5350);java.util.ArrayList result = java_programs.WRAP.wrap((java.lang.String)"The leaves did not stir on the trees, grasshoppers chirruped, and the monotonous hollow sound of the sea rising up from below, spoke of the peace, of the eternal sleep awaiting us. So it must have sounded when there was no Yalta, no Oreanda here; so it sounds now, and it will sound as indifferently and monotonously when we are all no more. And in this constancy, in this complete indifference to the life and death of each of us, there lies hid, perhaps, a pledge of our eternal salvation, of the unceasing movement of life upon earth, of unceasing progress towards perfection. Sitting beside a young woman who in the dawn seemed so lovely, soothed and spellbound in these magical surroundings - the sea, mountains, clouds, the open sky - Gurov thought how in reality everything is beautiful in this world when one reflects: everything except what we think or do ourselves when we forget our human dignity and the higher aims of our existence.",(int)77);
        __CLR4_5_2449449lwzsanyl.R.inc(5351);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2449449lwzsanyl.R.inc(5352);org.junit.Assert.assertEquals("[Theleavesdidnotstironthetrees,grasshopperschirruped,andthe,monotonoushollowsoundofthesearisingupfrombelow,spokeofthepeace,,oftheeternalsleepawaitingus.Soitmusthavesoundedwhentherewasno,Yalta,noOreandahere;soitsoundsnow,anditwillsoundasindifferently,andmonotonouslywhenweareallnomore.Andinthisconstancy,inthis,completeindifferencetothelifeanddeathofeachofus,therelieshid,,perhaps,apledgeofoureternalsalvation,oftheunceasingmovementof,lifeuponearth,ofunceasingprogresstowardsperfection.Sittingbesidea,youngwomanwhointhedawnseemedsolovely,soothedandspellboundin,thesemagicalsurroundings-thesea,mountains,clouds,theopensky-,Gurovthoughthowinrealityeverythingisbeautifulinthisworldwhenone,reflects:everythingexceptwhatwethinkordoourselveswhenweforgetour,humandignityandthehigheraimsofourexistence.]", resultFormatted);
    }finally{__CLR4_5_2449449lwzsanyl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_2449449lwzsanyl.R.globalSliceStart(getClass().getName(),5353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj644p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2449449lwzsanyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2449449lwzsanyl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.WRAP_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj644p() throws java.lang.Exception{try{__CLR4_5_2449449lwzsanyl.R.inc(5353);
        __CLR4_5_2449449lwzsanyl.R.inc(5354);java.util.ArrayList result = java_programs.WRAP.wrap((java.lang.String)"The leaves did not stir on the trees, grasshoppers chirruped, and the monotonous hollow sound of the sea rising up from below, spoke of the peace, of the eternal sleep awaiting us. So it must have sounded when there was no Yalta, no Oreanda here; so it sounds now, and it will sound as indifferently and monotonously when we are all no more. And in this constancy, in this complete indifference to the life and death of each of us, there lies hid, perhaps, a pledge of our eternal salvation, of the unceasing movement of life upon earth, of unceasing progress towards perfection. Sitting beside a young woman who in the dawn seemed so lovely, soothed and spellbound in these magical surroundings - the sea, mountains, clouds, the open sky - Gurov thought how in reality everything is beautiful in this world when one reflects: everything except what we think or do ourselves when we forget our human dignity and the higher aims of our existence.",(int)140);
        __CLR4_5_2449449lwzsanyl.R.inc(5355);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2449449lwzsanyl.R.inc(5356);org.junit.Assert.assertEquals("[Theleavesdidnotstironthetrees,grasshopperschirruped,andthemonotonoushollowsoundofthesearisingupfrombelow,spokeofthe,peace,oftheeternalsleepawaitingus.SoitmusthavesoundedwhentherewasnoYalta,noOreandahere;soitsoundsnow,anditwill,soundasindifferentlyandmonotonouslywhenweareallnomore.Andinthisconstancy,inthiscompleteindifferencetothelifeanddeath,ofeachofus,therelieshid,perhaps,apledgeofoureternalsalvation,oftheunceasingmovementoflifeuponearth,ofunceasing,progresstowardsperfection.Sittingbesideayoungwomanwhointhedawnseemedsolovely,soothedandspellboundinthesemagical,surroundings-thesea,mountains,clouds,theopensky-Gurovthoughthowinrealityeverythingisbeautifulinthisworldwhenone,reflects:everythingexceptwhatwethinkordoourselveswhenweforgetourhumandignityandthehigheraimsofourexistence.]", resultFormatted);
    }finally{__CLR4_5_2449449lwzsanyl.R.flushNeeded();}}
}

