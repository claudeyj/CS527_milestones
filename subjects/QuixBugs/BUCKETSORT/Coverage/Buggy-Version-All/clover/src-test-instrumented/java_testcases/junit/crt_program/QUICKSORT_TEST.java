/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class QUICKSORT_TEST {static class __CLR4_5_24sj4sjlwzsbg44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,6263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24sj() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6211);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6212);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1,2,6,72,7,33,4)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6213);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6214);org.junit.Assert.assertEquals("[1,2,4,6,7,33,72]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4sn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4sn() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6215);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6216);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6217);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6218);org.junit.Assert.assertEquals("[1,1,2,3,3,3,4,5,5,5,6,7,8,9,9,9]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444sr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444sr() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6219);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6220);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,2,1)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6221);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6222);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4sv() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6223);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6224);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,3,1,2)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6225);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6226);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64sz() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6227);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6228);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,1,14,9,15,5,4,3,7,17,11,18,2,12,16,13,6,10)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6229);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6230);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4t3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4t3() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6231);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6232);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9,4,5,2,17,14,10,6,15,8,12,13,16,3,1,7,11)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6233);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6234);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84t7() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6235);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6236);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13,14,7,16,9,5,24,21,19,17,12,10,1,15,23,25,11,3,2,6,22,8,20,4,18)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6237);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6238);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4tb() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6239);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6240);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8,5,15,7,9,14,11,12,10,6,2,4,13,1,3)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6241);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6242);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq4tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq4tf() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6243);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6244);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,7,6,5,2,1)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6245);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6246);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f74tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f74tj() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6247);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6248);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4,3,1,5,2)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6249);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6250);org.junit.Assert.assertEquals("[1,2,3,4,5]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x4tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x4tn() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6251);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6252);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5,4,2,3,6,7,1)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6253);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6254);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg4tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg4tr() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6255);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6256);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18,17,12,3,11,8,13,5,7)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6257);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6258);org.junit.Assert.assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_5_24sj4sjlwzsbg44.R.globalSliceStart(getClass().getName(),6259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz4tv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24sj4sjlwzsbg44.R.rethrow($CLV_t2$);}finally{__CLR4_5_24sj4sjlwzsbg44.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.QUICKSORT_TEST.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz4tv() throws java.lang.Exception{try{__CLR4_5_24sj4sjlwzsbg44.R.inc(6259);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6260);java.util.ArrayList result = correct_java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10,16,6,1,14,19,15,2,9,4,18)));
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6261);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24sj4sjlwzsbg44.R.inc(6262);org.junit.Assert.assertEquals("[1,2,4,6,9,10,14,15,16,18,19]", resultFormatted);
    }finally{__CLR4_5_24sj4sjlwzsbg44.R.flushNeeded();}}
}

