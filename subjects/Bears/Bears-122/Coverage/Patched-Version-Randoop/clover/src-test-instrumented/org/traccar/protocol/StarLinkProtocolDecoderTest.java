/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class StarLinkProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l46l46lwye690m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,27381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l46l46lwye690m.R.globalSliceStart(getClass().getName(),27366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l46l46lwye690m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l46l46lwye690m.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.StarLinkProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl46() throws Exception{try{__CLR4_5_2l46l46lwye690m.R.inc(27366);

        __CLR4_5_2l46l46lwye690m.R.inc(27367);StarLinkProtocolDecoder decoder = new StarLinkProtocolDecoder(new StarLinkProtocol());

        __CLR4_5_2l46l46lwye690m.R.inc(27368);verifyAttributes(decoder, text(
                "$SLU068328,06,55,170518122023,16,,,,,,000000,1,1,0,0,0,0,0,0,10443,32722,12.664,03.910,,0,0,,01000001FDB3A9*BF"));

        __CLR4_5_2l46l46lwye690m.R.inc(27369);verifyAttributes(decoder, text(
                "$SLU068328,06,56,170518122023,20,,,,,,000000,1,1,0,0,0,0,0,0,10443,32722,12.664,03.910,,0,0,2,01000001FDB3A9,00000000000000000000*D9"));

        __CLR4_5_2l46l46lwye690m.R.inc(27370);verifyAttributes(decoder, text(
                "$SLU068328,06,57,170518122038,01,,,,,,000000,1,1,0,0,1,0,0,0,10443,32722,12.669,03.910,,0,0,0,99*6E"));

        __CLR4_5_2l46l46lwye690m.R.inc(27371);verifyAttributes(decoder, text(
                "$SLU068328,06,58,170518122045,19,,,,,,000000,1,1,0,0,1,0,0,0,10443,32722,12.678,03.910,,0,0*7C"));

        __CLR4_5_2l46l46lwye690m.R.inc(27372);verifyAttributes(decoder, text(
                "$SLU068328,06,59,170518122054,16,,,,,,000000,1,1,0,0,0,0,0,0,10443,32723,12.678,03.910,,0,0,01000001FDB3A9,01000001ACE0A6*BF"));

        __CLR4_5_2l46l46lwye690m.R.inc(27373);verifyPosition(decoder, text(
                "$SLU031B2B,06,622,170329035057,01,170329035057,+3158.0018,+03446.6968,004.9,007,000099,1,1,0,0,0,0,0,0,,,14.176,03.826,,1,1,1,4*B0"));

        __CLR4_5_2l46l46lwye690m.R.inc(27374);verifyPosition(decoder, text(
                "$SLU031B2B,06,624,170329035143,01,170329035143,+3158.0171,+03446.6742,006.8,326,000099,1,1,0,0,0,0,0,0,10452,8723,14.212,03.827,,1,1,1,4*6D"));

        __CLR4_5_2l46l46lwye690m.R.inc(27375);verifyPosition(decoder, text(
                "$SLU0330D5,06,3556,170314063523,19,170314061634,+3211.7187,+03452.8106,000.0,332,015074,1,1,0,0,0,0,0,0,10443,32722,12.870,03.790,,0,0*FC"));

        __CLR4_5_2l46l46lwye690m.R.inc(27376);verifyPosition(decoder, text(
                "$SLU0330D5,06,3555,170314063453,20,170314061634,+3211.7187,+03452.8106,000.0,332,015074,1,1,0,0,0,0,0,0,10443,32722,12.838,03.790,,0,0,1,,1122*74"));

        __CLR4_5_2l46l46lwye690m.R.inc(27377);verifyPosition(decoder, text(
                "$SLU006968,06,375153,170117051824,01,170117051823,+3203.2073,+03448.1360,000.0,300,085725,1,1,0,0,0,0,0,0,10422,36201,12.655,04.085,,0,0,0,99*45"));

        __CLR4_5_2l46l46lwye690m.R.inc(27378);verifyPosition(decoder, text(
                "$SLU006968,06,375155,170117052615,24,170117052613,+3203.2079,+03448.1369,000.0,300,085725,1,1,0,0,0,0,0,0,10422,36201,14.290,04.083,,1,1*5B"));

        __CLR4_5_2l46l46lwye690m.R.inc(27379);verifyPosition(decoder, text(
                "$SLU006968,06,375156,170117052616,34,170117052614,+3203.2079,+03448.1369,000.0,300,085725,1,1,0,0,0,0,0,0,10422,36201,14.277,04.084,1,1,1,1*F3"));

        __CLR4_5_2l46l46lwye690m.R.inc(27380);verifyPosition(decoder, text(
                "$SLU006968,06,375154,170117052613,04,170117052612,+3203.2079,+03448.1369,000.0,300,085725,1,1,0,0,0,0,0,0,10422,36201,14.287,04.084,,1,0*5B"));

    }finally{__CLR4_5_2l46l46lwye690m.R.flushNeeded();}}

}
