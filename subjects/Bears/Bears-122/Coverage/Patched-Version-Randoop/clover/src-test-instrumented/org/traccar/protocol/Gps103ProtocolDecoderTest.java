/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gps103ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kf4kf4lwye68ui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kf4kf4lwye68ui.R.globalSliceStart(getClass().getName(),26464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kf4kf4lwye68ui.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kf4kf4lwye68ui.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gps103ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkf4() throws Exception{try{__CLR4_5_2kf4kf4lwye68ui.R.inc(26464);

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26465);Gps103ProtocolDecoder decoder = new Gps103ProtocolDecoder(new Gps103Protocol());

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26466);verifyAttributes(decoder, text(
                "imei:862106025092216,OBD,170605095949,195874,,370.8,808,066,30.0%,+87,13.0%,02444,14.3,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26467);verifyNull(decoder, text(
                "imei:868683027825532,OBD,170613203014,,,,0,0,0.00%,0,0.00%,0,0.00,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26468);verifyAttributes(decoder, text(
                "imei:862106025092216,OBD,170612165656,196043,,145803.9,,000,0.0%,+,0.0%,00000,12.6,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26469);verifyAttributes(decoder, text(
                "imei:862106025092216,OBD,170605095949,195874,,370.8,808,066,30.0%,+87,13.0%,02444,14.3,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26470);verifyPosition(decoder, text(
                "imei:353451044508750,DTC,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,30.1,,1,0,10.5%,P0021,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26471);verifyPosition(decoder, text(
                "imei:353451044508750,oil1,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,,,51.6,41.7,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26472);verifyPosition(decoder, text(
                "imei:353451044508750,oil2,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,,,51.6,41.7,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26473);verifyPosition(decoder, text(
                "imei:353451044508750,oil 51.67,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26474);verifyPosition(decoder, text(
                "imei:353451044508750,T:+28.0,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26475);verifyPosition(decoder, text(
                "imei:353451044508750,bonnet alarm,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26476);verifyPosition(decoder, text(
                "imei:353451044508750,footbrake alarm,0809231929,,F,055403.000,A,2233.1870,N,11354.3067,E,0.00,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26477);verifyPosition(decoder, text(
                "imei:862106021237716,ac alarm,1611291645,,F,204457.000,A,1010.2783,N,06441.0274,W,0.00,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26478);verifyAttributes(decoder, text(
                "imei:359710049057798,OBD,161003192752,1785,,,0,54,96.47%,75,20.00%,1892,0.00,P0134,P0571,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26479);verifyAttributes(decoder, text(
                "imei:359710049090138,OBD,160629022949,51442,0.00,15.88,5632,122,40.39%,95,0.00%,2101,13.80,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26480);verifyPosition(decoder, text(
                "imei:359710049090138,tracker,160629022948,,F,182949.000,A,4043.8839,N,11328.8029,W,65.26,271.82,,1,0,31.37%,51442,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26481);verifyAttributes(decoder, text(
                "imei:359710049042014,001,160615040011,,F,040011.000,A,2833.0957,N,07711.9465,E,0.01,215.33,,0,,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26482);verifyAttributes(decoder, text(
                "imei:359710049028435,OBD,160316053657,70430,,,0,49,60.00%,46,19.22%,859,0.00,U1108,,,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26483);verifyPosition(decoder, text(
                "359769031878322imei:359769031878322,tracker,1602160718,2,F,221811.000,A,1655.2193,S,14546.6722,E,0.00,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26484);verifyNull(decoder, text(
                "imei:865328021049167,OBD,141118115036,,,0.0,,000,0.0%,+,0.0%,00000,,,,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26485);verifyAttributes(decoder, text(
                "imei:359710049032874,OBD,160208152900,13555,,,45,0,24.71%,35,13.73%,1230,14.13,U1108,,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26486);verifyAttributes(decoder, text(
                "imei:359710049064398,OBD,160101035156,17887,0.00,17.06,0,0,0.00%,0,0.00%,16383,10.82,,,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26487);verifyPosition(decoder, text(
                "imei:868683020235846,rfid,160202091347,49121185,F,011344.000,A,0447.7273,N,07538.9934,W,0.00,0,,0,0,0.00%,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26488);verifyNotNull(decoder, text(
                "imei:359710049075097,help me,,,L,,,113b,,558f,,,,,0,0,,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26489);verifyNotNull(decoder, text(
                "imei:359710041100000,tracker,000000000,,L,,,fa8,,c9af,,,,,0,0,0.00%,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26490);verifyNotNull(decoder, text(
                "imei:863070016871385,tracker,0000000119,,L,,,0FB6,,CB5D,,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26491);verifyPosition(decoder, text(
                "imei:359710045559474,tracker,151030080103,,F,000101.000,A,5443.3834,N,02512.9071,E,0.00,0;"),
                position("2015-10-30 00:01:01.000", true, 54.72306, 25.21512));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26492);verifyPosition(decoder, text(
                "imei:359710049092324,tracker,151027025958,,F,235957.000,A,2429.5156,N,04424.5828,E,0.01,27.91,,0,0,,,;"),
                position("2015-10-26 23:59:57.000", true, 24.49193, 44.40971));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26493);verifyPosition(decoder, text(
                "imei:865328021058861,tracker,151027041419,,F,011531.000,A,6020.2979,N,02506.1940,E,0.49,113.30,,0,0,0.0%,,;"),
                position("2015-10-27 01:15:31.000", true, 60.33830, 25.10323));

        // Log on request
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26494);verifyNull(decoder, text(
                "##,imei:359586015829802,A"));

        // Heartbeat package
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26495);verifyNull(decoder, text(
                "359586015829802"));

        // No GPS signal
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26496);verifyNull(decoder, text(
                "imei:359586015829802,tracker,000000000,13554900601,L,;"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26497);verifyPosition(decoder, text(
                "imei:869039001186913,tracker,1308282156,0,F,215630.000,A,5602.11015,N,9246.30767,E,1.4,,175.9,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26498);verifyPosition(decoder, text(
                "imei:359710040656622,tracker,13/02/27 23:40,,F,125952.000,A,3450.9430,S,13828.6753,E,0.00,0"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26499);verifyPosition(decoder, text(
                "imei:359710040565419,tracker,13/05/25 14:23,,F,062209.000,A,0626.0411,N,10149.3904,E,0.00,0"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26500);verifyPosition(decoder, text(
                "imei:353451047570260,tracker,1302110948,,F,144807.000,A,0805.6615,S,07859.9763,W,0.00,,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26501);verifyPosition(decoder, text(
                "imei:359587016817564,tracker,1301251602,,F,080251.000,A,3223.5832,N,11058.9449,W,0.03,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26502);verifyPosition(decoder, text(
                "imei:359587016817564,tracker,1301251602,,F,080251.000,A,3223.5832,N,11058.9449,W,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26503);verifyPosition(decoder, text(
                "imei:012497000208821,tracker,1301080525,,F,212511.000,A,2228.5279,S,06855.6328,W,18.62,268.98,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26504);verifyPosition(decoder, text(
                "imei:012497000208821,tracker,1301072224,,F,142411.077,A,2227.0739,S,06855.2912,,0,0,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26505);verifyPosition(decoder, text(
                "imei:012497000431811,tracker,1210260609,,F,220925.000,A,0845.5500,N,07024.7673,W,0.00,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26506);verifyPosition(decoder, text(
                "imei:100000000000000,help me,1004171910,,F,010203.000,A,0102.0003,N,00102.0003,E,1.02,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26507);verifyPosition(decoder, text(
                "imei:353451040164707,tracker,1105182344,+36304665439,F,214418.000,A,4804.2222,N,01916.7593,E,0.37,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26508);verifyPosition(decoder, text(
                "imei:353451042861763,tracker,1106132241,,F,144114.000,A,2301.9052,S,04909.3676,W,0.13,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26509);verifyPosition(decoder, text(
                "imei:359587010124900,tracker,0809231929,13554900601,F,112909.397,A,2234.4669,N,11354.3287,E,0.11,321.53,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26510);verifyPosition(decoder, text(
                "imei:353451049926460,tracker,1208042043,123456 99008026,F,124336.000,A,3509.8668,N,03322.7636,E,0.00,,"));

        // SOS alarm
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26511);verifyPosition(decoder, text(
                "imei:359586015829802,help me,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Low battery alarm
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26512);verifyPosition(decoder, text(
                "imei:359586015829802,low battery,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Geo-fence alarm
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26513);verifyPosition(decoder, text(
                "imei:359586015829802,stockade,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Move alarm
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26514);verifyPosition(decoder, text(
                "imei:359586015829802,move,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Over speed alarm
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26515);verifyPosition(decoder, text(
                "imei:359586015829802,speed,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26516);verifyPosition(decoder, text(
                "imei:863070010423167,tracker,1211051840,,F,104000.000,A,2220.6483,N,11407.6377,,0,0,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26517);verifyPosition(decoder, text(
                "imei:863070010423167,tracker,1211051951,63360926,F,115123.000,A,2220.6322,N,11407.5313,E,0.00,,"));

        __CLR4_5_2kf4kf4lwye68ui.R.inc(26518);verifyPosition(decoder, text(
                "imei:863070010423167,tracker,1211060621,,F,062152.000,A,2220.6914,N,11407.5506,E,15.85,347.84,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26519);verifyPosition(decoder, text(
                "imei:863070012698733,tracker,1303092334,,F,193427.000,A,5139.0369,N,03907.2791,E,0.00,,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26520);verifyPosition(decoder, text(
                "imei:869039001186913,tracker,130925065533,0,F,065533.000,A,5604.11015,N,9232.12238,E,0.0,,329.0,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26521);verifyPosition(decoder, text(
                "imei:359710041641581,acc alarm,1402231159,,F,065907.000,A,2456.2591,N,06708.8335,E,7.53,76.10,,1,0,0.03%,,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26522);verifyPosition(decoder, text(
                "imei:359710041641581,acc alarm,1402231159,,F,065907.000,A,2456.2591,N,06708.8335,E,7.53,76.10,,1,0,0.03%,,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26523);verifyPosition(decoder, text(
                "imei:313009071131684,tracker,1403211928,,F,112817.000,A,0610.1133,N,00116.5840,E,0.00,,,0,0,0.0,0.0,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26524);verifyPosition(decoder, text(
                "imei:866989771979791,tracker,140527055653,,F,215653.00,A,5050.33113,N,00336.98783,E,0.066,0"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26525);verifyPosition(decoder, text(
                "imei:353552045375005,tracker,150401165832,61.0,F,31.0,A,1050.73696,N,10636.49489,E,8.0,,22.0,"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26526);verifyPosition(decoder, text(
                "imei:353552045403597,tracker,150420050648,53.0,F,0.0,A,N,5306.64155,E,00700.77848,0.0,,1.0,;"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26527);verifyPosition(decoder, text(
                "imei:353552045403597,tracker,150420051153,53.0,F,0.0,A,5306.64155,N,00700.77848,E,0.0,,1.0,;"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26528);verifyPosition(decoder, text(
                "imei:359710047424644,tracker,150506224036,,F,154037.000,A,0335.2785,N,09841.1543,E,3.03,337.54,,0,0,45.16%,,;"));
        
        __CLR4_5_2kf4kf4lwye68ui.R.inc(26529);verifyPosition(decoder, text(
                "imei:865328023776874,acc off,150619152221,,F,072218.000,A,5439.8489,N,02518.5945,E,0.00,,,1,1,0.0,0.0,23.0,;"));

    }finally{__CLR4_5_2kf4kf4lwye68ui.R.flushNeeded();}}

}
