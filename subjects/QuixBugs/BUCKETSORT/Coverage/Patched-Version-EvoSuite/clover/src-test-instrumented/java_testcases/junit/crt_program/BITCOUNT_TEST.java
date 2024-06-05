/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class BITCOUNT_TEST {static class __CLR4_5_242e42elwzsccua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,5297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp242e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp242e() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5270);
        __CLR4_5_242e42elwzsccua.R.inc(5271);int result = correct_java_programs.BITCOUNT.bitcount((int)127);
        __CLR4_5_242e42elwzsccua.R.inc(5272);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl42h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl42h() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5273);
        __CLR4_5_242e42elwzsccua.R.inc(5274);int result = correct_java_programs.BITCOUNT.bitcount((int)128);
        __CLR4_5_242e42elwzsccua.R.inc(5275);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4442k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4442k() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5276);
        __CLR4_5_242e42elwzsccua.R.inc(5277);int result = correct_java_programs.BITCOUNT.bitcount((int)3005);
        __CLR4_5_242e42elwzsccua.R.inc(5278);org.junit.Assert.assertEquals( (int) 9, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn42n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn42n() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5279);
        __CLR4_5_242e42elwzsccua.R.inc(5280);int result = correct_java_programs.BITCOUNT.bitcount((int)13);
        __CLR4_5_242e42elwzsccua.R.inc(5281);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj642q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj642q() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5282);
        __CLR4_5_242e42elwzsccua.R.inc(5283);int result = correct_java_programs.BITCOUNT.bitcount((int)14);
        __CLR4_5_242e42elwzsccua.R.inc(5284);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp42t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp42t() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5285);
        __CLR4_5_242e42elwzsccua.R.inc(5286);int result = correct_java_programs.BITCOUNT.bitcount((int)27);
        __CLR4_5_242e42elwzsccua.R.inc(5287);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy842w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy842w() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5288);
        __CLR4_5_242e42elwzsccua.R.inc(5289);int result = correct_java_programs.BITCOUNT.bitcount((int)834);
        __CLR4_5_242e42elwzsccua.R.inc(5290);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r42z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r42z() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5291);
        __CLR4_5_242e42elwzsccua.R.inc(5292);int result = correct_java_programs.BITCOUNT.bitcount((int)254);
        __CLR4_5_242e42elwzsccua.R.inc(5293);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_242e42elwzsccua.R.globalSliceStart(getClass().getName(),5294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq432();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_242e42elwzsccua.R.rethrow($CLV_t2$);}finally{__CLR4_5_242e42elwzsccua.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq432() throws java.lang.Exception{try{__CLR4_5_242e42elwzsccua.R.inc(5294);
        __CLR4_5_242e42elwzsccua.R.inc(5295);int result = correct_java_programs.BITCOUNT.bitcount((int)256);
        __CLR4_5_242e42elwzsccua.R.inc(5296);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_242e42elwzsccua.R.flushNeeded();}}
}

