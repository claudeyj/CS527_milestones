/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class LCS_LENGTH_TEST {static class __CLR4_5_24ik4iklwzsao51{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,5879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24ik() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5852);
        __CLR4_5_24ik4iklwzsao51.R.inc(5853);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"witch",(java.lang.String)"sandwich");
        __CLR4_5_24ik4iklwzsao51.R.inc(5854);org.junit.Assert.assertEquals( (java.lang.Integer) 2, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4in() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5855);
        __CLR4_5_24ik4iklwzsao51.R.inc(5856);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"meow",(java.lang.String)"homeowner");
        __CLR4_5_24ik4iklwzsao51.R.inc(5857);org.junit.Assert.assertEquals( (java.lang.Integer) 4, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444iq() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5858);
        __CLR4_5_24ik4iklwzsao51.R.inc(5859);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"");
        __CLR4_5_24ik4iklwzsao51.R.inc(5860);org.junit.Assert.assertEquals( (java.lang.Integer) 0, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4it() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5861);
        __CLR4_5_24ik4iklwzsao51.R.inc(5862);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"function");
        __CLR4_5_24ik4iklwzsao51.R.inc(5863);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64iw() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5864);
        __CLR4_5_24ik4iklwzsao51.R.inc(5865);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"cyborg",(java.lang.String)"cyber");
        __CLR4_5_24ik4iklwzsao51.R.inc(5866);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4iz() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5867);
        __CLR4_5_24ik4iklwzsao51.R.inc(5868);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"physics",(java.lang.String)"physics");
        __CLR4_5_24ik4iklwzsao51.R.inc(5869);org.junit.Assert.assertEquals( (java.lang.Integer) 7, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84j2() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5870);
        __CLR4_5_24ik4iklwzsao51.R.inc(5871);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"space age",(java.lang.String)"pace a");
        __CLR4_5_24ik4iklwzsao51.R.inc(5872);org.junit.Assert.assertEquals( (java.lang.Integer) 6, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4j5() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5873);
        __CLR4_5_24ik4iklwzsao51.R.inc(5874);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"flippy",(java.lang.String)"floppy");
        __CLR4_5_24ik4iklwzsao51.R.inc(5875);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_24ik4iklwzsao51.R.globalSliceStart(getClass().getName(),5876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq4j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24ik4iklwzsao51.R.rethrow($CLV_t2$);}finally{__CLR4_5_24ik4iklwzsao51.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.LCS_LENGTH_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq4j8() throws java.lang.Exception{try{__CLR4_5_24ik4iklwzsao51.R.inc(5876);
        __CLR4_5_24ik4iklwzsao51.R.inc(5877);java.lang.Integer result = correct_java_programs.LCS_LENGTH.lcs_length((java.lang.String)"acbdegcedbg",(java.lang.String)"begcfeubk");
        __CLR4_5_24ik4iklwzsao51.R.inc(5878);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_24ik4iklwzsao51.R.flushNeeded();}}
}

