/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class BITCOUNT_TEST {static class __CLR4_5_231d31dlwzsdy47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468475478L,8589935092L,3964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp231d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp231d() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3937);
        __CLR4_5_231d31dlwzsdy47.R.inc(3938);int result = java_programs.BITCOUNT.bitcount((int)127);
        __CLR4_5_231d31dlwzsdy47.R.inc(3939);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl31g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl31g() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3940);
        __CLR4_5_231d31dlwzsdy47.R.inc(3941);int result = java_programs.BITCOUNT.bitcount((int)128);
        __CLR4_5_231d31dlwzsdy47.R.inc(3942);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4431j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4431j() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3943);
        __CLR4_5_231d31dlwzsdy47.R.inc(3944);int result = java_programs.BITCOUNT.bitcount((int)3005);
        __CLR4_5_231d31dlwzsdy47.R.inc(3945);org.junit.Assert.assertEquals( (int) 9, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn31m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn31m() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3946);
        __CLR4_5_231d31dlwzsdy47.R.inc(3947);int result = java_programs.BITCOUNT.bitcount((int)13);
        __CLR4_5_231d31dlwzsdy47.R.inc(3948);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj631p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj631p() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3949);
        __CLR4_5_231d31dlwzsdy47.R.inc(3950);int result = java_programs.BITCOUNT.bitcount((int)14);
        __CLR4_5_231d31dlwzsdy47.R.inc(3951);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp31s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp31s() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3952);
        __CLR4_5_231d31dlwzsdy47.R.inc(3953);int result = java_programs.BITCOUNT.bitcount((int)27);
        __CLR4_5_231d31dlwzsdy47.R.inc(3954);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy831v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy831v() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3955);
        __CLR4_5_231d31dlwzsdy47.R.inc(3956);int result = java_programs.BITCOUNT.bitcount((int)834);
        __CLR4_5_231d31dlwzsdy47.R.inc(3957);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r31y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r31y() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3958);
        __CLR4_5_231d31dlwzsdy47.R.inc(3959);int result = java_programs.BITCOUNT.bitcount((int)254);
        __CLR4_5_231d31dlwzsdy47.R.inc(3960);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_231d31dlwzsdy47.R.globalSliceStart(getClass().getName(),3961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq321();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231d31dlwzsdy47.R.rethrow($CLV_t2$);}finally{__CLR4_5_231d31dlwzsdy47.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.BITCOUNT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq321() throws java.lang.Exception{try{__CLR4_5_231d31dlwzsdy47.R.inc(3961);
        __CLR4_5_231d31dlwzsdy47.R.inc(3962);int result = java_programs.BITCOUNT.bitcount((int)256);
        __CLR4_5_231d31dlwzsdy47.R.inc(3963);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_231d31dlwzsdy47.R.flushNeeded();}}
}

