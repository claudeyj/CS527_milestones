/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class LONGEST_COMMON_SUBSEQUENCE_TEST {static class __CLR4_5_24k84k8lwzsbfz6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,5952,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24k8() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5912);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5913);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"headache",(java.lang.String)"pentadactyl");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5914);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5915);org.junit.Assert.assertEquals("eadac", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4kc() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5916);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5917);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"daenarys",(java.lang.String)"targaryen");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5918);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5919);org.junit.Assert.assertEquals("aary", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444kg() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5920);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5921);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"XMJYAUZ",(java.lang.String)"MZJAWXU");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5922);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5923);org.junit.Assert.assertEquals("MJAU", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5924,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4kk() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5924);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5925);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"thisisatest",(java.lang.String)"testing123testing");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5926);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5927);org.junit.Assert.assertEquals("tsitest", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64ko() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5928);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5929);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"1234",(java.lang.String)"1224533324");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5930);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5931);org.junit.Assert.assertEquals("1234", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4ks() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5932);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5933);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"abcbdab",(java.lang.String)"bdcaba");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5934);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5935);org.junit.Assert.assertEquals("bcba", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84kw() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5936);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5937);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"TATAGC",(java.lang.String)"TAGCAG");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5938);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5939);org.junit.Assert.assertEquals("TAAG", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4l0() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5940);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5941);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"ABCBDAB",(java.lang.String)"BDCABA");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5942);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5943);org.junit.Assert.assertEquals("BCBA", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq4l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq4l4() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5944);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5945);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"ABCD",(java.lang.String)"XBCYDQ");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5946);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5947);org.junit.Assert.assertEquals("BCD", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_24k84k8lwzsbfz6.R.globalSliceStart(getClass().getName(),5948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f74l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24k84k8lwzsbfz6.R.rethrow($CLV_t2$);}finally{__CLR4_5_24k84k8lwzsbfz6.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LONGEST_COMMON_SUBSEQUENCE_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f74l8() throws java.lang.Exception{try{__CLR4_5_24k84k8lwzsbfz6.R.inc(5948);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5949);java.lang.String result = correct_java_programs.LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((java.lang.String)"acbdegcedbg",(java.lang.String)"begcfeubk");
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5950);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24k84k8lwzsbfz6.R.inc(5951);org.junit.Assert.assertEquals("begceb", resultFormatted);
    }finally{__CLR4_5_24k84k8lwzsbfz6.R.flushNeeded();}}
}

