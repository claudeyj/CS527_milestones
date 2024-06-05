/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;


import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gl100ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k8uk8ulwye7iyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,26253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k8uk8ulwye7iyy.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k8uk8ulwye7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k8uk8ulwye7iyy.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gl100ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk8u() throws Exception{try{__CLR4_5_2k8uk8ulwye7iyy.R.inc(26238);

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26239);Gl100ProtocolDecoder decoder = new Gl100ProtocolDecoder(new Gl100Protocol());

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26240);verifyPosition(decoder, text(
                "+RESP:GTLGL,359464030492644,1,2,1,0,0.4,0,299.7,1,5.455551,51.449776,20160311083229,0204,0016,03EC,BD94,00,0036,0102090501"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26241);verifyPosition(decoder, text(
                "+RESP:GTTRI,359464030439249,1,0,61,1,0.0,346,-2.7,2,-80.392825,26.122424,20151214000354,0310,0260,72BC,35F5,00,04B6,0102070407"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26242);verifyPosition(decoder, text(
                "+RESP:GTTRI,135790246811220,1,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102070202"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26243);verifyPosition(decoder, text(
                "+RESP:GTTRI,135790246811220,2,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,1,-3.6,145,30.0,2,121.354442,31.221940,20090101000100,0460,0000,18d8,6141,00,11F0,0102070202"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26244);verifyNull(decoder, text(
                "AT+GTHBD=HeartBeat,359231030000010,20090101000000,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26245);verifyPosition(decoder, text(
                "+RESP:GTSOS,359231030000010,0,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"),
                position("2009-01-01 00:00:00.000", false, 31.22207, 121.35434));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26246);verifyPosition(decoder, text(
                "+RESP:GTRTL,359231030000010,0,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26247);verifyPosition(decoder, text(
                "+RESP:GTEST,359231030000010,0,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26248);verifyPosition(decoder, text(
                "+RESP:GTSZI,359231030000010,0,3,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26249);verifyPosition(decoder, text(
                "+RESP:GTLBC,359231030000010,02132523415,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26250);verifyPosition(decoder, text(
                "+RESP:GTTRI,359231030000010,1,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26251);verifyPosition(decoder, text(
                "+RESP:GTTRI,359231030000010,2,0,0,1,4.3,92,70.0,1,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,0,0,1,-3.6,145,30.0,2,121.354442,31.221940,20090101000100,0460,0000,18d8,6141,00,11F0,0102120204"));

        __CLR4_5_2k8uk8ulwye7iyy.R.inc(26252);verifyPosition(decoder, text(
                "+RESP:GTTRI,359464030073766,1,0,0,0,1.7,254,-27.8,3,30.474475,50.488383,20131107155511,0255,0003,6995,4761,00,0071,0103090402"));

    }finally{__CLR4_5_2k8uk8ulwye7iyy.R.flushNeeded();}}

}
