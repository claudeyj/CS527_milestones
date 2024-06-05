/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class QUICKSORT_TEST {static class __CLR4_5_23ri3rilwzs9t9z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,4930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23ri() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4878);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4879);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1,2,6,72,7,33,4)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4880);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4881);org.junit.Assert.assertEquals("[1,2,4,6,7,33,72]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3rm() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4882);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4883);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4884);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4885);org.junit.Assert.assertEquals("[1,1,2,3,3,3,4,5,5,5,6,7,8,9,9,9]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443rq() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4886);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4887);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,2,1)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4888);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4889);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3ru() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4890);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4891);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,1,2)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4892);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4893);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63ry() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4894);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4895);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,1,14,9,15,5,4,3,7,17,11,18,2,12,16,13,6,10)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4896);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4897);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3s2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3s2() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4898);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4899);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9,4,5,2,17,14,10,6,15,8,12,13,16,3,1,7,11)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4900);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4901);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83s6() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4902);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4903);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13,14,7,16,9,5,24,21,19,17,12,10,1,15,23,25,11,3,2,6,22,8,20,4,18)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4904);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4905);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3sa() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4906);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4907);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,5,15,7,9,14,11,12,10,6,2,4,13,1,3)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4908);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4909);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3se() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4910);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4911);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,7,6,5,2,1)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4912);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4913);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f73si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f73si() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4914);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4915);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,1,5,2)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4916);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4917);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x3sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x3sm() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4918);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4919);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,2,3,6,7,1)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4920);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4921);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg3sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg3sq() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4922);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4923);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18,17,12,3,11,8,13,5,7)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4924);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4925);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_5_23ri3rilwzs9t9z.R.globalSliceStart(getClass().getName(),4926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz3su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ri3rilwzs9t9z.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ri3rilwzs9t9z.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.QUICKSORT_TEST.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz3su() throws java.lang.Exception{try{__CLR4_5_23ri3rilwzs9t9z.R.inc(4926);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4927);java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18)));
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4928);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ri3rilwzs9t9z.R.inc(4929);org.junit.Assert.assertEquals("[1,2,4,6,9,10,14,15,16,18,19]", resultFormatted);
    }finally{__CLR4_5_23ri3rilwzs9t9z.R.flushNeeded();}}
}

