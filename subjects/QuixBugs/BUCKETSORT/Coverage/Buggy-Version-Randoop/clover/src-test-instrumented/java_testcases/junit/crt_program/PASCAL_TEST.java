/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class PASCAL_TEST {static class __CLR4_5_24qo4qolwzsao7k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468321276L,8589935092L,6164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24qo4qolwzsao7k.R.globalSliceStart(getClass().getName(),6144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24qo4qolwzsao7k.R.rethrow($CLV_t2$);}finally{__CLR4_5_24qo4qolwzsao7k.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.PASCAL_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24qo() throws java.lang.Exception{try{__CLR4_5_24qo4qolwzsao7k.R.inc(6144);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6145);java.util.ArrayList result = correct_java_programs.PASCAL.pascal((int)1);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6146);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6147);org.junit.Assert.assertEquals("[[1]]", resultFormatted);
    }finally{__CLR4_5_24qo4qolwzsao7k.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24qo4qolwzsao7k.R.globalSliceStart(getClass().getName(),6148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24qo4qolwzsao7k.R.rethrow($CLV_t2$);}finally{__CLR4_5_24qo4qolwzsao7k.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.PASCAL_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4qs() throws java.lang.Exception{try{__CLR4_5_24qo4qolwzsao7k.R.inc(6148);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6149);java.util.ArrayList result = correct_java_programs.PASCAL.pascal((int)2);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6150);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6151);org.junit.Assert.assertEquals("[[1],[1,1]]", resultFormatted);
    }finally{__CLR4_5_24qo4qolwzsao7k.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24qo4qolwzsao7k.R.globalSliceStart(getClass().getName(),6152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24qo4qolwzsao7k.R.rethrow($CLV_t2$);}finally{__CLR4_5_24qo4qolwzsao7k.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.PASCAL_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6152,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444qw() throws java.lang.Exception{try{__CLR4_5_24qo4qolwzsao7k.R.inc(6152);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6153);java.util.ArrayList result = correct_java_programs.PASCAL.pascal((int)3);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6154);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6155);org.junit.Assert.assertEquals("[[1],[1,1],[1,2,1]]", resultFormatted);
    }finally{__CLR4_5_24qo4qolwzsao7k.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24qo4qolwzsao7k.R.globalSliceStart(getClass().getName(),6156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24qo4qolwzsao7k.R.rethrow($CLV_t2$);}finally{__CLR4_5_24qo4qolwzsao7k.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.PASCAL_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4r0() throws java.lang.Exception{try{__CLR4_5_24qo4qolwzsao7k.R.inc(6156);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6157);java.util.ArrayList result = correct_java_programs.PASCAL.pascal((int)4);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6158);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6159);org.junit.Assert.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1]]", resultFormatted);
    }finally{__CLR4_5_24qo4qolwzsao7k.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24qo4qolwzsao7k.R.globalSliceStart(getClass().getName(),6160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24qo4qolwzsao7k.R.rethrow($CLV_t2$);}finally{__CLR4_5_24qo4qolwzsao7k.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.PASCAL_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64r4() throws java.lang.Exception{try{__CLR4_5_24qo4qolwzsao7k.R.inc(6160);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6161);java.util.ArrayList result = correct_java_programs.PASCAL.pascal((int)5);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6162);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24qo4qolwzsao7k.R.inc(6163);org.junit.Assert.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", resultFormatted);
    }finally{__CLR4_5_24qo4qolwzsao7k.R.flushNeeded();}}
}

