/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class SHUNTING_YARD_TEST {static class __CLR4_5_23w03w0lwzsd80y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,5056,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23w03w0lwzsd80y.R.globalSliceStart(getClass().getName(),5040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23w03w0lwzsd80y.R.rethrow($CLV_t2$);}finally{__CLR4_5_23w03w0lwzsd80y.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHUNTING_YARD_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23w0() throws java.lang.Exception{try{__CLR4_5_23w03w0lwzsd80y.R.inc(5040);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5041);java.util.List result = java_programs.SHUNTING_YARD.shunting_yard(new java.util.ArrayList(java.util.Arrays.asList(10,"-",5,"-",2)));
        __CLR4_5_23w03w0lwzsd80y.R.inc(5042);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5043);org.junit.Assert.assertEquals("[10,5,-,2,-]", resultFormatted);
    }finally{__CLR4_5_23w03w0lwzsd80y.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23w03w0lwzsd80y.R.globalSliceStart(getClass().getName(),5044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23w03w0lwzsd80y.R.rethrow($CLV_t2$);}finally{__CLR4_5_23w03w0lwzsd80y.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHUNTING_YARD_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3w4() throws java.lang.Exception{try{__CLR4_5_23w03w0lwzsd80y.R.inc(5044);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5045);java.util.List result = java_programs.SHUNTING_YARD.shunting_yard(new java.util.ArrayList(java.util.Arrays.asList(34,"-",12,"/",5)));
        __CLR4_5_23w03w0lwzsd80y.R.inc(5046);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5047);org.junit.Assert.assertEquals("[34,12,5,/,-]", resultFormatted);
    }finally{__CLR4_5_23w03w0lwzsd80y.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23w03w0lwzsd80y.R.globalSliceStart(getClass().getName(),5048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23w03w0lwzsd80y.R.rethrow($CLV_t2$);}finally{__CLR4_5_23w03w0lwzsd80y.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHUNTING_YARD_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443w8() throws java.lang.Exception{try{__CLR4_5_23w03w0lwzsd80y.R.inc(5048);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5049);java.util.List result = java_programs.SHUNTING_YARD.shunting_yard(new java.util.ArrayList(java.util.Arrays.asList(4,"+",9,"*",9,"-",10,"+",13)));
        __CLR4_5_23w03w0lwzsd80y.R.inc(5050);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5051);org.junit.Assert.assertEquals("[4,9,9,*,+,10,-,13,+]", resultFormatted);
    }finally{__CLR4_5_23w03w0lwzsd80y.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23w03w0lwzsd80y.R.globalSliceStart(getClass().getName(),5052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23w03w0lwzsd80y.R.rethrow($CLV_t2$);}finally{__CLR4_5_23w03w0lwzsd80y.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.SHUNTING_YARD_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3wc() throws java.lang.Exception{try{__CLR4_5_23w03w0lwzsd80y.R.inc(5052);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5053);java.util.List result = java_programs.SHUNTING_YARD.shunting_yard(new java.util.ArrayList(java.util.Arrays.asList(7,"*",43,"-",7,"+",13,"/",7)));
        __CLR4_5_23w03w0lwzsd80y.R.inc(5054);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23w03w0lwzsd80y.R.inc(5055);org.junit.Assert.assertEquals("[7,43,*,7,-,13,7,/,+]", resultFormatted);
    }finally{__CLR4_5_23w03w0lwzsd80y.R.flushNeeded();}}
}

