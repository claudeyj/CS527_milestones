/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class TO_BASE_TEST {static class __CLR4_5_254i54ilwzsaod7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,6670,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp254i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp254i() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6642);
        __CLR4_5_254i54ilwzsaod7.R.inc(6643);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)31,(int)16);
        __CLR4_5_254i54ilwzsaod7.R.inc(6644);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6645);org.junit.Assert.assertEquals("1F", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl54m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl54m() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6646);
        __CLR4_5_254i54ilwzsaod7.R.inc(6647);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)41,(int)2);
        __CLR4_5_254i54ilwzsaod7.R.inc(6648);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6649);org.junit.Assert.assertEquals("101001", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4454q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4454q() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6650);
        __CLR4_5_254i54ilwzsaod7.R.inc(6651);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)44,(int)5);
        __CLR4_5_254i54ilwzsaod7.R.inc(6652);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6653);org.junit.Assert.assertEquals("134", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn54u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn54u() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6654);
        __CLR4_5_254i54ilwzsaod7.R.inc(6655);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)27,(int)23);
        __CLR4_5_254i54ilwzsaod7.R.inc(6656);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6657);org.junit.Assert.assertEquals("14", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj654y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj654y() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6658);
        __CLR4_5_254i54ilwzsaod7.R.inc(6659);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)56,(int)23);
        __CLR4_5_254i54ilwzsaod7.R.inc(6660);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6661);org.junit.Assert.assertEquals("2A", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp552();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp552() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6662);
        __CLR4_5_254i54ilwzsaod7.R.inc(6663);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)8237,(int)24);
        __CLR4_5_254i54ilwzsaod7.R.inc(6664);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6665);org.junit.Assert.assertEquals("E75", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_254i54ilwzsaod7.R.globalSliceStart(getClass().getName(),6666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy8556();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_254i54ilwzsaod7.R.rethrow($CLV_t2$);}finally{__CLR4_5_254i54ilwzsaod7.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.TO_BASE_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy8556() throws java.lang.Exception{try{__CLR4_5_254i54ilwzsaod7.R.inc(6666);
        __CLR4_5_254i54ilwzsaod7.R.inc(6667);java.lang.String result = correct_java_programs.TO_BASE.to_base((int)8237,(int)34);
        __CLR4_5_254i54ilwzsaod7.R.inc(6668);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_254i54ilwzsaod7.R.inc(6669);org.junit.Assert.assertEquals("749", resultFormatted);
    }finally{__CLR4_5_254i54ilwzsaod7.R.flushNeeded();}}
}

