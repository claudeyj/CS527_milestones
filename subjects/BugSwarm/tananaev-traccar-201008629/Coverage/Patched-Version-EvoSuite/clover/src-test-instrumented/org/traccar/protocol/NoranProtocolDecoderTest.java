/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class NoranProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2j6wj6wlx1dze8o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,24884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2j6wj6wlx1dze8o.R.globalSliceStart(getClass().getName(),24872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehj6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j6wj6wlx1dze8o.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j6wj6wlx1dze8o.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.NoranProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehj6w() throws Exception{try{__CLR4_5_2j6wj6wlx1dze8o.R.inc(24872);

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24873);NoranProtocolDecoder decoder = new NoranProtocolDecoder(new NoranProtocol());

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24874);verifyNothing(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0d0a2a4b57000d000080010d0a"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24875);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "34000800010b0000000000003f43bb8da6c2ebe229424e523039423233343439000031362d30392d31352030373a30303a303700"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24876);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "28003200c380000000469458408c4ad340ad381e3f4e52303947313336303900000001ff00002041"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24877);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "28003200c38000d900fcc97a416b1a7a42b43eef3d4e523039473034383737000000000092fcda4a"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24878);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "3400080001090000000000001D43A29BE842E62520424E523039423036363932000031322D30332D30352031313A34373A343300"));
        
        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24879);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "34000800010c000000000080a3438e20944149bd07c24e523039423139323832000031352d30342d32362030383a34333a353300"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24880);verifyNothing(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0f0000004e52303946303431353500"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24881);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "22000800010c008a007e9daa42317bdd41a7f3e2384e523039463034313535000000"));

        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24882);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "34000800010c0000000000001c4291251143388d17c24e523039423131303930000031342d31322d32352030303a33333a303700"));
        
        __CLR4_5_2j6wj6wlx1dze8o.R.inc(24883);verifyPosition(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "34000800010c00000000000000006520944141bd07c24e523039423139323832000031352d30342d32352030303a30333a323200"));

    }finally{__CLR4_5_2j6wj6wlx1dze8o.R.flushNeeded();}}

}
