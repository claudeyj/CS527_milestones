/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class NEXT_PERMUTATION_TEST {static class __CLR4_5_24nd4ndlwzsd8fg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,6057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24nd() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6025);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6026);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,2,4,1)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6027);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6028);org.junit.Assert.assertEquals("[3,4,1,2]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4nh() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6029);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6030);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,5,6,2,1)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6031);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6032);org.junit.Assert.assertEquals("[3,6,1,2,5]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444nl() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6033);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6034);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,5,6,2)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6035);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6036);org.junit.Assert.assertEquals("[3,6,2,5]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4np() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6037);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6038);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4,5,1,7,9)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6039);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6040);org.junit.Assert.assertEquals("[4,5,1,9,7]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64nt() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6041);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6042);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4,5,8,7,1)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6043);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6044);org.junit.Assert.assertEquals("[4,7,1,5,8]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4nx() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6045);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6046);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9,5,2,6,1)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6047);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6048);org.junit.Assert.assertEquals("[9,5,6,1,2]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84o1() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6049);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6050);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(44,5,1,7,9)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6051);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6052);org.junit.Assert.assertEquals("[44,5,1,9,7]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceStart(getClass().getName(),6053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24nd4ndlwzsd8fg.R.rethrow($CLV_t2$);}finally{__CLR4_5_24nd4ndlwzsd8fg.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PERMUTATION_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4o5() throws java.lang.Exception{try{__CLR4_5_24nd4ndlwzsd8fg.R.inc(6053);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6054);java.util.ArrayList result = correct_java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3,4,5)));
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6055);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24nd4ndlwzsd8fg.R.inc(6056);org.junit.Assert.assertEquals("[3,5,4]", resultFormatted);
    }finally{__CLR4_5_24nd4ndlwzsd8fg.R.flushNeeded();}}
}
