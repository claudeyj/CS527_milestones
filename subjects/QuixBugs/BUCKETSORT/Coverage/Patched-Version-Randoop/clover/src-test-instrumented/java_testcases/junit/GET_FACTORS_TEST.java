/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package java_testcases.junit;


public class GET_FACTORS_TEST {static class __CLR4_5_23ax3axlwzsd7jj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0051\u0075\u0069\u0078\u0042\u0075\u0067\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717468440378L,8589935092L,4325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp23ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp23ax() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4281);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4282);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)1);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4283);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4284);org.junit.Assert.assertEquals("[]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl3b1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl3b1() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4285);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4286);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)100);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4287);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4288);org.junit.Assert.assertEquals("[2,2,5,5]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k443b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k443b5() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4289);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4290);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)101);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4291);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4292);org.junit.Assert.assertEquals("[101]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn3b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn3b9() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4293);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4294);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)104);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4295);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4296);org.junit.Assert.assertEquals("[2,2,2,13]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj63bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj63bd() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4297);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4298);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)2);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4299);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4300);org.junit.Assert.assertEquals("[2]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp3bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp3bh() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4301);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4302);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4303);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4304);org.junit.Assert.assertEquals("[3]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy83bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy83bl() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4305);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4306);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4307);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4308);org.junit.Assert.assertEquals("[17]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r3bp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r3bp() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4309);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4310);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)63);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4311);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4312);org.junit.Assert.assertEquals("[3,3,7]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq3bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq3bt() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4313);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4314);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)74);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4315);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4316);org.junit.Assert.assertEquals("[2,37]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f73bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f73bx() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4317);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4318);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)73);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4319);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4320);org.junit.Assert.assertEquals("[73]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_5_23ax3axlwzsd7jj.R.globalSliceStart(getClass().getName(),4321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x3c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_23ax3axlwzsd7jj.R.rethrow($CLV_t2$);}finally{__CLR4_5_23ax3axlwzsd7jj.R.globalSliceEnd(getClass().getName(),"java_testcases.junit.GET_FACTORS_TEST.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x3c1() throws java.lang.Exception{try{__CLR4_5_23ax3axlwzsd7jj.R.inc(4321);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4322);java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9837);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4323);String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        __CLR4_5_23ax3axlwzsd7jj.R.inc(4324);org.junit.Assert.assertEquals("[3,3,1093]", resultFormatted);
    }finally{__CLR4_5_23ax3axlwzsd7jj.R.flushNeeded();}}
}

