/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class LONGEST_COMMON_SUBSEQUENCE_TEST {static class __CLR4_5_23j73j7lwzsangj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,4619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23j7() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4579);
        __CLR4_5_23j73j7lwzsangj.R.inc(4580);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"headache",(java.lang.String)"pentadactyl");
        __CLR4_5_23j73j7lwzsangj.R.inc(4581);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4582);org.junit.Assert.assertEquals("eadac", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3jb() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4583);
        __CLR4_5_23j73j7lwzsangj.R.inc(4584);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"daenarys",(java.lang.String)"targaryen");
        __CLR4_5_23j73j7lwzsangj.R.inc(4585);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4586);org.junit.Assert.assertEquals("aary", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443jf() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4587);
        __CLR4_5_23j73j7lwzsangj.R.inc(4588);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"XMJYAUZ",(java.lang.String)"MZJAWXU");
        __CLR4_5_23j73j7lwzsangj.R.inc(4589);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4590);org.junit.Assert.assertEquals("MJAU", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3jj() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4591);
        __CLR4_5_23j73j7lwzsangj.R.inc(4592);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"thisisatest",(java.lang.String)"testing123testing");
        __CLR4_5_23j73j7lwzsangj.R.inc(4593);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4594);org.junit.Assert.assertEquals("tsitest", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63jn() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4595);
        __CLR4_5_23j73j7lwzsangj.R.inc(4596);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"1234",(java.lang.String)"1224533324");
        __CLR4_5_23j73j7lwzsangj.R.inc(4597);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4598);org.junit.Assert.assertEquals("1234", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3jr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3jr() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4599);
        __CLR4_5_23j73j7lwzsangj.R.inc(4600);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"abcbdab",(java.lang.String)"bdcaba");
        __CLR4_5_23j73j7lwzsangj.R.inc(4601);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4602);org.junit.Assert.assertEquals("bcba", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83jv() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4603);
        __CLR4_5_23j73j7lwzsangj.R.inc(4604);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"TATAGC",(java.lang.String)"TAGCAG");
        __CLR4_5_23j73j7lwzsangj.R.inc(4605);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4606);org.junit.Assert.assertEquals("TAAG", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3jz() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4607);
        __CLR4_5_23j73j7lwzsangj.R.inc(4608);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"ABCBDAB",(java.lang.String)"BDCABA");
        __CLR4_5_23j73j7lwzsangj.R.inc(4609);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4610);org.junit.Assert.assertEquals("BCBA", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3k3() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4611);
        __CLR4_5_23j73j7lwzsangj.R.inc(4612);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"ABCD",(java.lang.String)"XBCYDQ");
        __CLR4_5_23j73j7lwzsangj.R.inc(4613);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4614);org.junit.Assert.assertEquals("BCD", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_23j73j7lwzsangj.R.globalSliceStart(getClass().getName(),4615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f73k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23j73j7lwzsangj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23j73j7lwzsangj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LONGEST_COMMON_SUBSEQUENCE_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f73k7() throws java.lang.Exception{try{__CLR4_5_23j73j7lwzsangj.R.inc(4615);
        __CLR4_5_23j73j7lwzsangj.R.inc(4616);java.lang.String result = java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"acbdegcedbg",(java.lang.String)"begcfeubk");
        __CLR4_5_23j73j7lwzsangj.R.inc(4617);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23j73j7lwzsangj.R.inc(4618);org.junit.Assert.assertEquals("begceb", resultFormatted);
    }finally{__CLR4_5_23j73j7lwzsangj.R.flushNeeded();}}
}

