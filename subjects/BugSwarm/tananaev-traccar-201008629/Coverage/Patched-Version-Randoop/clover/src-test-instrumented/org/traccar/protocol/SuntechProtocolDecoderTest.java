/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class SuntechProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jbljbllx1e0kmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,25061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jbljbllx1e0kmx.R.globalSliceStart(getClass().getName(),25041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbljbllx1e0kmx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbljbllx1e0kmx.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.SuntechProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjbl() throws Exception{try{__CLR4_5_2jbljbllx1e0kmx.R.inc(25041);

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25042);SuntechProtocolDecoder decoder = new SuntechProtocolDecoder(new SuntechProtocol());

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25043);verifyPosition(decoder, text(
                "SA200STT;638947;803;20170117;07:40:44;5d309;-01.287213;-047.917462;000.035;000.00;10;1;2036194;12.57;000000;1;0376;010360;4.2;1"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25044);verifyPosition(decoder, text(
                "ST300ALT;205174410;14;712;20110101;00:00:07;00000;+20.593923;-100.336716;000.000;000.00;0;0;0;16.57;000000;81;000000;4.0;0;0.00;0000;0000;0;0"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25045);verifyNothing(decoder, text(
                "SA200ALV;317652"));
        
        __CLR4_5_2jbljbllx1e0kmx.R.inc(25046);verifyPosition(decoder, text(
                "ST910;Alert;123456;410;20141018;18:30:12;+37.478774;+126.889690;000.000;000.00;0;4.0;1;6002"),
                position("2014-10-18 18:30:12.000", false, 37.47877, 126.88969));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25047);verifyPosition(decoder, text(
                "ST910;Alert;123456;410;20141018;18:30:12;+37.478774;+126.889690;000.000;000.00;0;4.0;1;6002;02;0;0310000100;450;01;-282;70;255;3;0"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25048);verifyPosition(decoder, text(
                "SA200STT;317652;042;20120718;15:37:12;16d41;-15.618755;-056.083241;000.024;000.00;8;1;41548;12.17;100000;2;1979"),
                position("2012-07-18 15:37:12.000", true, -15.61876, -56.08324));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25049);verifyPosition(decoder, text(
                "SA200STT;317652;042;20120721;19:04:30;16d41;-15.618743;-056.083221;000.001;000.00;12;1;41557;12.21;000000;1;3125"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25050);verifyPosition(decoder, text(
                "SA200STT;317652;042;20120722;00:24:23;4f310;-15.618767;-056.083214;000.011;000.00;11;1;41557;12.21;000000;1;3205"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25051);verifyPosition(decoder, text(
                "SA200STT;315198;042;20120808;20:37:34;3fac25;-15.618731;-056.083216;000.007;000.00;12;1;48;0.00;000000;1;0127"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25052);verifyPosition(decoder, text(
                "SA200STT;315198;042;20120809;13:43:34;4f310;-15.618709;-056.083223;000.025;000.00;8;1;49;12.10;100000;2;0231"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25053);verifyPosition(decoder, text(
                "SA200EMG;317652;042;20120718;15:35:41;16d41;-15.618740;-056.083252;000.034;000.00;8;1;41548;12.17;110000;1"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25054);verifyPosition(decoder, text(
                "SA200ALT;317652;042;20120829;14:25:58;16d41;-15.618770;-056.083242;000.029;000.00;0;0;2404240;0.00;000000;10"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25055);verifyPosition(decoder, text(
                "SA200STT;430070;133;20130615;22:22:32;151347;+02.860514;-060.653351;000.003;000.00;12;1;0;12.39;000000;1;0208"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25056);verifyPosition(decoder, text(
                "ST910;Location;344506;017;20130727;14:10:00;-25.398714;-049.296818;000.187;000.00;1;4.32;1;1;0001"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25057);verifyPosition(decoder, text(
                "ST300STT;205027329;03;374;20150108;17:54:42;177b38;-23.566052;-046.477588;000.000;000.00;0;0;0;12.11;000000;1;0312"));
        
        __CLR4_5_2jbljbllx1e0kmx.R.inc(25058);verifyPosition(decoder, text(
                "ST910;Emergency;205283272;500;20150716;19:12:01;-23.659019;-046.695403;000.602;000.00;0;4.2;1;1;02;10820;2fdb090736;724;05;0;2311;255;0;100"));

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25059);decoder.setProtocolType(1);

        __CLR4_5_2jbljbllx1e0kmx.R.inc(25060);verifyPosition(decoder, text(
                "ST910;Location;560266;500;20161207;21:33:11;af910be101;-25.504234;-049.278003;000.080;000.00;1;10054889;70;1;1;1311;02;724;06;-317;3041;2;10;92"));

    }finally{__CLR4_5_2jbljbllx1e0kmx.R.flushNeeded();}}

}
