/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class LCS_LENGTH_TEST {static class __CLR4_5_23f43f4lwzsd7nq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,4459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23f4() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4432);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4433);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"witch",(java.lang.String)"sandwich");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4434);org.junit.Assert.assertEquals( (java.lang.Integer) 2, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3f7() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4435);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4436);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"meow",(java.lang.String)"homeowner");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4437);org.junit.Assert.assertEquals( (java.lang.Integer) 4, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443fa() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4438);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4439);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4440);org.junit.Assert.assertEquals( (java.lang.Integer) 0, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3fd() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4441);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4442);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"fun",(java.lang.String)"function");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4443);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63fg() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4444);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4445);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"cyborg",(java.lang.String)"cyber");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4446);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3fj() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4447);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4448);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"physics",(java.lang.String)"physics");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4449);org.junit.Assert.assertEquals( (java.lang.Integer) 7, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83fm() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4450);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4451);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"space age",(java.lang.String)"pace a");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4452);org.junit.Assert.assertEquals( (java.lang.Integer) 6, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3fp() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4453);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4454);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"flippy",(java.lang.String)"floppy");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4455);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23f43f4lwzsd7nq.R.globalSliceStart(getClass().getName(),4456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23f43f4lwzsd7nq.R.rethrow($CLV_t2$);}finally{__CLR4_5_23f43f4lwzsd7nq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.LCS_LENGTH_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3fs() throws java.lang.Exception{try{__CLR4_5_23f43f4lwzsd7nq.R.inc(4456);
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4457);java.lang.Integer result = java_programs.LCS_LENGTH.lcs_length((java.lang.String)"acbdegcedbg",(java.lang.String)"begcfeubk");
        __CLR4_5_23f43f4lwzsd7nq.R.inc(4458);org.junit.Assert.assertEquals( (java.lang.Integer) 3, result);
    }finally{__CLR4_5_23f43f4lwzsd7nq.R.flushNeeded();}}
}
