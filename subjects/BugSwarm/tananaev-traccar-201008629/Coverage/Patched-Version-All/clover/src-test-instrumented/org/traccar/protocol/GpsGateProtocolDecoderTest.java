/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GpsGateProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ir0ir0lx1e1o3j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,24314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ir0ir0lx1e1o3j.R.globalSliceStart(getClass().getName(),24300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehir0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ir0ir0lx1e1o3j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ir0ir0lx1e1o3j.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GpsGateProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehir0() throws Exception{try{__CLR4_5_2ir0ir0lx1e1o3j.R.inc(24300);

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24301);GpsGateProtocolDecoder decoder = new GpsGateProtocolDecoder(new GpsGateProtocol());

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24302);verifyPosition(decoder, text(
                "$FRCMD,0097,_SendMessage,,7618.51990,S,4002.26182,E,350.0,1.08,0.0,250816,183522.000,0*7F"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24303);verifyPosition(decoder, text(
                "$FRCMD,356406061385182,_SendMessage,,5223.88542,N,11440.45866,W,951.2,0.027,,220716,153507.00,1*5F"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24304);verifyPosition(decoder, text(
                "$FRCMD,353067011068246,_SendMessage,,1918.1942,N,09906.3696,W,2246.5,000.0,295.9,150416,213147.00,1,Odometer=*70"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24305);verifyNothing(decoder, text(
                "$FRCMD,862950025974620,_Ping,voltage=4*4F"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24306);verifyPosition(decoder, text(
                "$FRCMD,862950025974620,_SendMessage, ,2721.5781,S,15259.145,E,61,0.00,61,080316,092612,1,SosButton=0,voltage=4*60"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24307);verifyNothing(decoder, text(
                "$FRLIN,,user1,8IVHF*7A"));
        
        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24308);verifyNothing(decoder, text(
                "$FRLIN,,354503026292842,VGZTHKT*0C"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24309);verifyNothing(decoder, text(
                "$FRLIN,IMEI,1234123412341234,*7B"));
        
        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24310);verifyNothing(decoder, text(
                "$FRLIN,,saab93_device,KLRFBGIVDJ*28"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24311);verifyPosition(decoder, text(
                "$GPRMC,154403.000,A,6311.64120,N,01438.02740,E,0.000,0.0,270707,,*0A"),
                position("2007-07-27 15:44:03.000", true, 63.19402, 14.63379));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24312);verifyPosition(decoder, text(
                "$GPRMC,074524,A,5553.73701,N,03728.90491,E,10.39,226.5,160614,0.0,E*75"));

        __CLR4_5_2ir0ir0lx1e1o3j.R.inc(24313);verifyPosition(decoder, text(
                "$GPRMC,154403.000,A,6311.64120,N,01438.02740,E,0.000,0.0,270707,,*0A"));

    }finally{__CLR4_5_2ir0ir0lx1e1o3j.R.flushNeeded();}}

}
