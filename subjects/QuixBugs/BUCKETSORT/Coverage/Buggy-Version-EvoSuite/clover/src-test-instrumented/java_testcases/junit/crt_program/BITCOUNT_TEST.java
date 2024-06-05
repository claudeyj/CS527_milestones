/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit.crt_program;


public class BITCOUNT_TEST {static class __CLR4_5_244t44tlwzs9tnl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468282045L,8589935092L,5384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp244t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp244t() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5357);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5358);int result = correct_java_programs.BITCOUNT.bitcount((int)127);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5359);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl44w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl44w() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5360);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5361);int result = correct_java_programs.BITCOUNT.bitcount((int)128);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5362);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4444z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4444z() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5363);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5364);int result = correct_java_programs.BITCOUNT.bitcount((int)3005);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5365);org.junit.Assert.assertEquals( (int) 9, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn452();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn452() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5366);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5367);int result = correct_java_programs.BITCOUNT.bitcount((int)13);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5368);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj6455();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj6455() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5369);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5370);int result = correct_java_programs.BITCOUNT.bitcount((int)14);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5371);org.junit.Assert.assertEquals( (int) 3, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp458();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp458() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5372);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5373);int result = correct_java_programs.BITCOUNT.bitcount((int)27);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5374);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy845b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy845b() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5375);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5376);int result = correct_java_programs.BITCOUNT.bitcount((int)834);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5377);org.junit.Assert.assertEquals( (int) 4, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r45e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r45e() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5378);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5379);int result = correct_java_programs.BITCOUNT.bitcount((int)254);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5380);org.junit.Assert.assertEquals( (int) 7, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_244t44tlwzs9tnl.R.globalSliceStart(getClass().getName(),5381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq45h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_244t44tlwzs9tnl.R.rethrow($CLV_t2$);}finally{__CLR4_5_244t44tlwzs9tnl.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.crt_program.BITCOUNT_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),5381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq45h() throws java.lang.Exception{try{__CLR4_5_244t44tlwzs9tnl.R.inc(5381);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5382);int result = correct_java_programs.BITCOUNT.bitcount((int)256);
        __CLR4_5_244t44tlwzs9tnl.R.inc(5383);org.junit.Assert.assertEquals( (int) 1, result);
    }finally{__CLR4_5_244t44tlwzs9tnl.R.flushNeeded();}}
}

