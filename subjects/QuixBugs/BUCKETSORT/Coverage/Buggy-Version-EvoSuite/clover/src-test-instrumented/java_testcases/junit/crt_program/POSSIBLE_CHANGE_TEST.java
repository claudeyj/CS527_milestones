/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class POSSIBLE_CHANGE_TEST {static class __CLR4_5_24r84r8lwzs9tvk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,6191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp24r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp24r8() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6164);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6165);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25},(int)11);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6166);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl4rb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl4rb() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6167);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6168);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25},(int)75);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6169);org.junit.Assert.assertEquals( (int) 121, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k444re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k444re() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6170);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6171);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25},(int)34);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6172);org.junit.Assert.assertEquals( (int) 18, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn4rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn4rh() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6173);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6174);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10},(int)34);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6175);org.junit.Assert.assertEquals( (int) 16, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj64rk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6176,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj64rk() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6176);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6177);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25},(int)140);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6178);org.junit.Assert.assertEquals( (int) 568, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp4rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp4rn() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6179);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6180);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25,50},(int)140);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6181);org.junit.Assert.assertEquals( (int) 786, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy84rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy84rq() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6182);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6183);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,5,10,25,50,100},(int)140);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6184);org.junit.Assert.assertEquals( (int) 817, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r4rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r4rt() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6185);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6186);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{1,3,7,42,78},(int)140);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6187);org.junit.Assert.assertEquals( (int) 981, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_24r84r8lwzs9tvk.R.globalSliceStart(getClass().getName(),6188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq4rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24r84r8lwzs9tvk.R.rethrow($CLV_t2$);}finally{__CLR4_5_24r84r8lwzs9tvk.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.POSSIBLE_CHANGE_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq4rw() throws java.lang.Exception{try{__CLR4_5_24r84r8lwzs9tvk.R.inc(6188);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6189);int result = correct_java_programs.POSSIBLE_CHANGE.possible_change(new int[]{3,7,42,78},(int)140);
        __CLR4_5_24r84r8lwzs9tvk.R.inc(6190);org.junit.Assert.assertEquals( (int) 20, result);
    }finally{__CLR4_5_24r84r8lwzs9tvk.R.flushNeeded();}}
}

