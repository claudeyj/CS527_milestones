/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class GET_FACTORS_TEST {static class __CLR4_5_23dc3dclwzs9t0t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,4412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4368,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23dc() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4368);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4369);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)1);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4370);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4371);org.junit.Assert.assertEquals("[]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3dg() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4372);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4373);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)100);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4374);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4375);org.junit.Assert.assertEquals("[2,2,5,5]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443dk() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4376);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4377);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)101);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4378);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4379);org.junit.Assert.assertEquals("[101]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3do();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3do() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4380);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4381);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)104);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4382);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4383);org.junit.Assert.assertEquals("[2,2,2,13]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63ds() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4384);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4385);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)2);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4386);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4387);org.junit.Assert.assertEquals("[2]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3dw() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4388);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4389);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4390);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4391);org.junit.Assert.assertEquals("[3]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83e0() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4392);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4393);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4394);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4395);org.junit.Assert.assertEquals("[17]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3e4() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4396);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4397);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)63);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4398);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4399);org.junit.Assert.assertEquals("[3,3,7]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3e8() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4400);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4401);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)74);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4402);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4403);org.junit.Assert.assertEquals("[2,37]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f73ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f73ec() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4404);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4405);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)73);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4406);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4407);org.junit.Assert.assertEquals("[73]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_23dc3dclwzs9t0t.R.globalSliceStart(getClass().getName(),4408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x3eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23dc3dclwzs9t0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_23dc3dclwzs9t0t.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x3eg() throws java.lang.Exception{try{__CLR4_5_23dc3dclwzs9t0t.R.inc(4408);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4409);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9837);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4410);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23dc3dclwzs9t0t.R.inc(4411);org.junit.Assert.assertEquals("[3,3,1093]", resultFormatted);
    }finally{__CLR4_5_23dc3dclwzs9t0t.R.flushNeeded();}}
}

