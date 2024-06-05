/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class TO_BASE_TEST {static class __CLR4_5_2412412lwzsccti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468399691L,8589935092L,5250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2412();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2412() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5222);
        __CLR4_5_2412412lwzsccti.R.inc(5223);java.lang.String result = java_programs.TO_BASE.to_base((int)31,(int)16);
        __CLR4_5_2412412lwzsccti.R.inc(5224);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5225);org.junit.Assert.assertEquals("1F", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl416();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl416() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5226);
        __CLR4_5_2412412lwzsccti.R.inc(5227);java.lang.String result = java_programs.TO_BASE.to_base((int)41,(int)2);
        __CLR4_5_2412412lwzsccti.R.inc(5228);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5229);org.junit.Assert.assertEquals("101001", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4441a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4441a() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5230);
        __CLR4_5_2412412lwzsccti.R.inc(5231);java.lang.String result = java_programs.TO_BASE.to_base((int)44,(int)5);
        __CLR4_5_2412412lwzsccti.R.inc(5232);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5233);org.junit.Assert.assertEquals("134", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn41e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn41e() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5234);
        __CLR4_5_2412412lwzsccti.R.inc(5235);java.lang.String result = java_programs.TO_BASE.to_base((int)27,(int)23);
        __CLR4_5_2412412lwzsccti.R.inc(5236);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5237);org.junit.Assert.assertEquals("14", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj641i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj641i() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5238);
        __CLR4_5_2412412lwzsccti.R.inc(5239);java.lang.String result = java_programs.TO_BASE.to_base((int)56,(int)23);
        __CLR4_5_2412412lwzsccti.R.inc(5240);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5241);org.junit.Assert.assertEquals("2A", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp41m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp41m() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5242);
        __CLR4_5_2412412lwzsccti.R.inc(5243);java.lang.String result = java_programs.TO_BASE.to_base((int)8237,(int)24);
        __CLR4_5_2412412lwzsccti.R.inc(5244);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5245);org.junit.Assert.assertEquals("E75", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_2412412lwzsccti.R.globalSliceStart(getClass().getName(),5246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy841q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2412412lwzsccti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2412412lwzsccti.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.TO_BASE_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy841q() throws java.lang.Exception{try{__CLR4_5_2412412lwzsccti.R.inc(5246);
        __CLR4_5_2412412lwzsccti.R.inc(5247);java.lang.String result = java_programs.TO_BASE.to_base((int)8237,(int)34);
        __CLR4_5_2412412lwzsccti.R.inc(5248);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_2412412lwzsccti.R.inc(5249);org.junit.Assert.assertEquals("749", resultFormatted);
    }finally{__CLR4_5_2412412lwzsccti.R.flushNeeded();}}
}

