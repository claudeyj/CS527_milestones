/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class GET_FACTORS_TEST {static class __CLR4_5_24by4bylwzsd8al{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,5658,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24by() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5614);
        __CLR4_5_24by4bylwzsd8al.R.inc(5615);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)1);
        __CLR4_5_24by4bylwzsd8al.R.inc(5616);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5617);org.junit.Assert.assertEquals("[]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5618,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4c2() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5618);
        __CLR4_5_24by4bylwzsd8al.R.inc(5619);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)100);
        __CLR4_5_24by4bylwzsd8al.R.inc(5620);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5621);org.junit.Assert.assertEquals("[2,2,5,5]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444c6() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5622);
        __CLR4_5_24by4bylwzsd8al.R.inc(5623);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)101);
        __CLR4_5_24by4bylwzsd8al.R.inc(5624);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5625);org.junit.Assert.assertEquals("[101]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4ca() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5626);
        __CLR4_5_24by4bylwzsd8al.R.inc(5627);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)104);
        __CLR4_5_24by4bylwzsd8al.R.inc(5628);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5629);org.junit.Assert.assertEquals("[2,2,2,13]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64ce() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5630);
        __CLR4_5_24by4bylwzsd8al.R.inc(5631);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)2);
        __CLR4_5_24by4bylwzsd8al.R.inc(5632);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5633);org.junit.Assert.assertEquals("[2]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4ci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4ci() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5634);
        __CLR4_5_24by4bylwzsd8al.R.inc(5635);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)3);
        __CLR4_5_24by4bylwzsd8al.R.inc(5636);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5637);org.junit.Assert.assertEquals("[3]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84cm() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5638);
        __CLR4_5_24by4bylwzsd8al.R.inc(5639);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)17);
        __CLR4_5_24by4bylwzsd8al.R.inc(5640);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5641);org.junit.Assert.assertEquals("[17]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4cq() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5642);
        __CLR4_5_24by4bylwzsd8al.R.inc(5643);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)63);
        __CLR4_5_24by4bylwzsd8al.R.inc(5644);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5645);org.junit.Assert.assertEquals("[3,3,7]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq4cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq4cu() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5646);
        __CLR4_5_24by4bylwzsd8al.R.inc(5647);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)74);
        __CLR4_5_24by4bylwzsd8al.R.inc(5648);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5649);org.junit.Assert.assertEquals("[2,37]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f74cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f74cy() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5650);
        __CLR4_5_24by4bylwzsd8al.R.inc(5651);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)73);
        __CLR4_5_24by4bylwzsd8al.R.inc(5652);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5653);org.junit.Assert.assertEquals("[73]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_24by4bylwzsd8al.R.globalSliceStart(getClass().getName(),5654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x4d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24by4bylwzsd8al.R.rethrow($CLV_t2$);}finally{__CLR4_5_24by4bylwzsd8al.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.GET_FACTORS_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x4d2() throws java.lang.Exception{try{__CLR4_5_24by4bylwzsd8al.R.inc(5654);
        __CLR4_5_24by4bylwzsd8al.R.inc(5655);java.util.ArrayList result = correct_java_programs.GET_FACTORS.get_factors((int)9837);
        __CLR4_5_24by4bylwzsd8al.R.inc(5656);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24by4bylwzsd8al.R.inc(5657);org.junit.Assert.assertEquals("[3,3,1093]", resultFormatted);
    }finally{__CLR4_5_24by4bylwzsd8al.R.flushNeeded();}}
}

