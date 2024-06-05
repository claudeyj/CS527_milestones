/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class H02FrameDecoderTest extends ProtocolTest {static class __CLR4_5_2iqkiqklx1dvh12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,24299,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecodeShort() throws Exception {__CLR4_5_2iqkiqklx1dvh12.R.globalSliceStart(getClass().getName(),24284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26q81z1iqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iqkiqklx1dvh12.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iqkiqklx1dvh12.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02FrameDecoderTest.testDecodeShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26q81z1iqk() throws Exception{try{__CLR4_5_2iqkiqklx1dvh12.R.inc(24284);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24285);H02FrameDecoder decoder = new H02FrameDecoder(0);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24286);Assert.assertEquals(
                binary("2441060116601245431311165035313006004318210e000000fffffbffff0024"),
                decoder.decode(null, null, binary("2441060116601245431311165035313006004318210e000000fffffbffff0024")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24287);Assert.assertEquals(
                binary("2441060116601245431311165035313006004318210e000000fffffbffff0024"),
                decoder.decode(null, null, binary("2441060116601245431311165035313006004318210e000000fffffbffff00242a48512c343130363031313636302c56312c3132343535322c412c353033352e333132392c4e2c30303433312e383231312c452c3030302e32302c3030302c3133313131362c464646464642464623")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24288);Assert.assertEquals(
                binary("2a48512c3335333538383036303031353536382c56312c3139333530352c412c3830392e303031302c532c333435342e383939372c572c302e30302c302e30302c3239313031332c65666666666266662c3030303264342c3030303030622c3030353338352c3030353261612c323523"),
                decoder.decode(null, null, binary("2a48512c3335333538383036303031353536382c56312c3139333530352c412c3830392e303031302c532c333435342e383939372c572c302e30302c302e30302c3239313031332c65666666666266662c3030303264342c3030303030622c3030353338352c3030353261612c323523")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24289);Assert.assertEquals(
                binary("24430025645511183817091319355128000465632432000100ffe7fbffff0000"),
                decoder.decode(null, null, binary("24430025645511183817091319355128000465632432000100ffe7fbffff0000")));

    }finally{__CLR4_5_2iqkiqklx1dvh12.R.flushNeeded();}}

    @Test
    public void testDecodeLong() throws Exception {__CLR4_5_2iqkiqklx1dvh12.R.globalSliceStart(getClass().getName(),24290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25f3b7niqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iqkiqklx1dvh12.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iqkiqklx1dvh12.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02FrameDecoderTest.testDecodeLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25f3b7niqq() throws Exception{try{__CLR4_5_2iqkiqklx1dvh12.R.inc(24290);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24291);H02FrameDecoder decoder = new H02FrameDecoder(0);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24292);Assert.assertEquals(
                binary("24410600082621532131081504419390060740418306000000fffffbfdff0015060000002c02dc0c000000001f"),
                decoder.decode(null, null, binary("24410600082621532131081504419390060740418306000000fffffbfdff0015060000002c02dc0c000000001f")));

    }finally{__CLR4_5_2iqkiqklx1dvh12.R.flushNeeded();}}

    @Test
    public void testDecodeAlternative() throws Exception {__CLR4_5_2iqkiqklx1dvh12.R.globalSliceStart(getClass().getName(),24293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kppedwiqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iqkiqklx1dvh12.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iqkiqklx1dvh12.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.H02FrameDecoderTest.testDecodeAlternative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kppedwiqt() throws Exception{try{__CLR4_5_2iqkiqklx1dvh12.R.inc(24293);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24294);H02FrameDecoder decoder = new H02FrameDecoder(0);

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24295);Assert.assertEquals(
                binary("2a48512c343230363131393133302c4e42522c3130323430332c3233382c312c302c372c313131312c323236342c36332c313131312c323236352c35382c313131312c323236362c35302c313131312c333133352c33372c313131312c3630352c33332c313131312c343932302c33302c313131312c3630372c32382c3131303131372c46464646444646462c3623"),
                decoder.decode(null, null, binary("2a48512c343230363131393133302c4e42522c3130323430332c3233382c312c302c372c313131312c323236342c36332c313131312c323236352c35382c313131312c323236362c35302c313131312c333133352c33372c313131312c3630352c33332c313131312c343932302c33302c313131312c3630372c32382c3131303131372c46464646444646462c3623")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24296);Assert.assertEquals(
                binary("2442061191301024031101175540227006012321670c000095fffffbffff001f00000001f800ee010000000032"),
                decoder.decode(null, null, binary("2442061191301024031101175540227006012321670c000095fffffbffff001f00000001f800ee010000000032")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24297);Assert.assertEquals(
                binary("5800009814991024031101175540227006012321670c000095fffffbffff0033"),
                decoder.decode(null, null, binary("5800009814991024031101175540227006012321670c000095fffffbffff0033")));

        __CLR4_5_2iqkiqklx1dvh12.R.inc(24298);Assert.assertEquals(
                binary("2a48512c343230363131393133302c4e42522c3130323431362c3233382c312c302c372c313131312c323236342c35332c313131312c323236352c36302c313131312c323236362c34342c313131312c333133352c34332c313131312c3630352c33392c313131312c343932302c32392c313131312c3630372c32342c3131303131372c46464646464246462c3623"),
                decoder.decode(null, null, binary("2a48512c343230363131393133302c4e42522c3130323431362c3233382c312c302c372c313131312c323236342c35332c313131312c323236352c36302c313131312c323236362c34342c313131312c333133352c34332c313131312c3630352c33392c313131312c343932302c32392c313131312c3630372c32342c3131303131372c46464646464246462c3623")));

    }finally{__CLR4_5_2iqkiqklx1dvh12.R.flushNeeded();}}

}
