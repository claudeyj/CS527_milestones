/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class SIEVE_TEST {static class __CLR4_5_24zw4zwlwzs9txq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,6500,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24zw() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6476);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6477);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)1);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6478);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6479);org.junit.Assert.assertEquals("[]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl500();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl500() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6480);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6481);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)2);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6482);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6483);org.junit.Assert.assertEquals("[2]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k44504();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k44504() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6484);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6485);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)4);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6486);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6487);org.junit.Assert.assertEquals("[2,3]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn508();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn508() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6488);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6489);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)7);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6490);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6491);org.junit.Assert.assertEquals("[2,3,5,7]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj650c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6492,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj650c() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6492);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6493);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)20);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6494);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6495);org.junit.Assert.assertEquals("[2,3,5,7,11,13,17,19]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24zw4zwlwzs9txq.R.globalSliceStart(getClass().getName(),6496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp50g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24zw4zwlwzs9txq.R.rethrow($CLV_t2$);}finally{__CLR4_5_24zw4zwlwzs9txq.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.SIEVE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp50g() throws java.lang.Exception{try{__CLR4_5_24zw4zwlwzs9txq.R.inc(6496);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6497);java.util.ArrayList result = correct_java_programs.SIEVE.sieve((java.lang.Integer)50);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6498);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24zw4zwlwzs9txq.R.inc(6499);org.junit.Assert.assertEquals("[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47]", resultFormatted);
    }finally{__CLR4_5_24zw4zwlwzs9txq.R.flushNeeded();}}
}
