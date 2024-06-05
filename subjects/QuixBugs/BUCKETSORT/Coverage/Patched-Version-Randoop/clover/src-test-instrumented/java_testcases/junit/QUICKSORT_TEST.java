/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class QUICKSORT_TEST {static class __CLR4_5_23p33p3lwzsd7sr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,4843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23p3() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4791);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4792);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1,2,6,72,7,33,4)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4793);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4794);org.junit.Assert.assertEquals("[1,2,4,6,7,33,72]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3p7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3p7() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4795);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4796);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4797);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4798);org.junit.Assert.assertEquals("[1,1,2,3,3,3,4,5,5,5,6,7,8,9,9,9]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443pb() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4799);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4800);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,2,1)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4801);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4802);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3pf() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4803);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4804);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,1,2)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4805);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4806);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63pj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63pj() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4807);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4808);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,1,14,9,15,5,4,3,7,17,11,18,2,12,16,13,6,10)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4809);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4810);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3pn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3pn() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4811);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4812);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9,4,5,2,17,14,10,6,15,8,12,13,16,3,1,7,11)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4813);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4814);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83pr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83pr() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4815);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4816);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13,14,7,16,9,5,24,21,19,17,12,10,1,15,23,25,11,3,2,6,22,8,20,4,18)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4817);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4818);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4819,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3pv() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4819);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4820);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,5,15,7,9,14,11,12,10,6,2,4,13,1,3)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4821);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4822);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3pz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3pz() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4823);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4824);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,7,6,5,2,1)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4825);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4826);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f73q3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4827,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f73q3() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4827);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4828);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,1,5,2)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4829);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4830);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x3q7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x3q7() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4831);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4832);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,2,3,6,7,1)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4833);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4834);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg3qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg3qb() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4835);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4836);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18,17,12,3,11,8,13,5,7)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4837);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4838);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_5_23p33p3lwzsd7sr.R.globalSliceStart(getClass().getName(),4839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz3qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23p33p3lwzsd7sr.R.rethrow($CLV_t2$);}finally{__CLR4_5_23p33p3lwzsd7sr.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz3qf() throws java.lang.Exception{try{__CLR4_5_23p33p3lwzsd7sr.R.inc(4839);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4840);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18)));
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4841);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23p33p3lwzsd7sr.R.inc(4842);org.junit.Assert.assertEquals("[1,2,4,6,9,10,14,15,16,18,19]", resultFormatted);
    }finally{__CLR4_5_23p33p3lwzsd7sr.R.flushNeeded();}}
}

