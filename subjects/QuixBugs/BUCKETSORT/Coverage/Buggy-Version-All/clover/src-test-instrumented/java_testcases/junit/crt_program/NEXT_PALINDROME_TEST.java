/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class NEXT_PALINDROME_TEST {static class __CLR4_5_24p84p8lwzsbg1u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468356450L,8589935092L,6112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24p84p8lwzsbg1u.R.globalSliceStart(getClass().getName(),6092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24p84p8lwzsbg1u.R.rethrow($CLV_t2$);}finally{__CLR4_5_24p84p8lwzsbg1u.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PALINDROME_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24p8() throws java.lang.Exception{try{__CLR4_5_24p84p8lwzsbg1u.R.inc(6092);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6093);java.lang.String result = correct_java_programs.NEXT_PALINDROME.next_palindrome(new int[]{1,4,9,4,1});
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6094);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6095);org.junit.Assert.assertEquals("[1,5,0,5,1]", resultFormatted);
    }finally{__CLR4_5_24p84p8lwzsbg1u.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24p84p8lwzsbg1u.R.globalSliceStart(getClass().getName(),6096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24p84p8lwzsbg1u.R.rethrow($CLV_t2$);}finally{__CLR4_5_24p84p8lwzsbg1u.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PALINDROME_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4pc() throws java.lang.Exception{try{__CLR4_5_24p84p8lwzsbg1u.R.inc(6096);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6097);java.lang.String result = correct_java_programs.NEXT_PALINDROME.next_palindrome(new int[]{1,3,1});
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6098);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6099);org.junit.Assert.assertEquals("[1,4,1]", resultFormatted);
    }finally{__CLR4_5_24p84p8lwzsbg1u.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24p84p8lwzsbg1u.R.globalSliceStart(getClass().getName(),6100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24p84p8lwzsbg1u.R.rethrow($CLV_t2$);}finally{__CLR4_5_24p84p8lwzsbg1u.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PALINDROME_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444pg() throws java.lang.Exception{try{__CLR4_5_24p84p8lwzsbg1u.R.inc(6100);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6101);java.lang.String result = correct_java_programs.NEXT_PALINDROME.next_palindrome(new int[]{4,7,2,5,5,2,7,4});
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6102);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6103);org.junit.Assert.assertEquals("[4,7,2,6,6,2,7,4]", resultFormatted);
    }finally{__CLR4_5_24p84p8lwzsbg1u.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24p84p8lwzsbg1u.R.globalSliceStart(getClass().getName(),6104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24p84p8lwzsbg1u.R.rethrow($CLV_t2$);}finally{__CLR4_5_24p84p8lwzsbg1u.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PALINDROME_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4pk() throws java.lang.Exception{try{__CLR4_5_24p84p8lwzsbg1u.R.inc(6104);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6105);java.lang.String result = correct_java_programs.NEXT_PALINDROME.next_palindrome(new int[]{4,7,2,5,2,7,4});
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6106);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6107);org.junit.Assert.assertEquals("[4,7,2,6,2,7,4]", resultFormatted);
    }finally{__CLR4_5_24p84p8lwzsbg1u.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24p84p8lwzsbg1u.R.globalSliceStart(getClass().getName(),6108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64po();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24p84p8lwzsbg1u.R.rethrow($CLV_t2$);}finally{__CLR4_5_24p84p8lwzsbg1u.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.NEXT_PALINDROME_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64po() throws java.lang.Exception{try{__CLR4_5_24p84p8lwzsbg1u.R.inc(6108);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6109);java.lang.String result = correct_java_programs.NEXT_PALINDROME.next_palindrome(new int[]{9,9,9});
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6110);String resultFormatted = java_testcases.junit.crt_program.QuixFixOracleHelper.format(result,true);
        __CLR4_5_24p84p8lwzsbg1u.R.inc(6111);org.junit.Assert.assertEquals("[1,0,0,1]", resultFormatted);
    }finally{__CLR4_5_24p84p8lwzsbg1u.R.flushNeeded();}}
}

