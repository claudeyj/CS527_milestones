/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class Gps103ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b5fb5flx1e46m5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b5fb5flx1e46m5.R.globalSliceStart(getClass().getName(),14451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b5fb5flx1e46m5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b5fb5flx1e46m5.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gps103ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb5f() throws Exception{try{__CLR4_5_2b5fb5flx1e46m5.R.inc(14451);

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14452);Gps103ProtocolDecoder decoder = new Gps103ProtocolDecoder(new Gps103Protocol());

        // Log on request
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14453);assertNull(decoder.decode(null, null, "##,imei:359586015829802,A"));

        // Heartbeat package
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14454);assertNull(decoder.decode(null, null, "359586015829802"));

        // No GPS signal
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14455);assertNull(decoder.decode(null, null, "imei:359586015829802,tracker,000000000,13554900601,L,;"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14456);verify(decoder.decode(null, null,
                "imei:869039001186913,tracker,1308282156,0,F,215630.000,A,5602.11015,N,9246.30767,E,1.4,,175.9,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14457);verify(decoder.decode(null, null,
                "imei:359710040656622,tracker,13/02/27 23:40,,F,125952.000,A,3450.9430,S,13828.6753,E,0.00,0"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14458);verify(decoder.decode(null, null,
                "imei:359710040565419,tracker,13/05/25 14:23,,F,062209.000,A,0626.0411,N,10149.3904,E,0.00,0"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14459);verify(decoder.decode(null, null,
                "imei:353451047570260,tracker,1302110948,,F,144807.000,A,0805.6615,S,07859.9763,W,0.00,,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14460);verify(decoder.decode(null, null,
                "imei:359587016817564,tracker,1301251602,,F,080251.000,A,3223.5832,N,11058.9449,W,0.03,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14461);verify(decoder.decode(null, null,
                "imei:359587016817564,tracker,1301251602,,F,080251.000,A,3223.5832,N,11058.9449,W,,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14462);verify(decoder.decode(null, null,
                "imei:012497000208821,tracker,1301080525,,F,212511.000,A,2228.5279,S,06855.6328,W,18.62,268.98,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14463);verify(decoder.decode(null, null,
                "imei:012497000208821,tracker,1301072224,,F,142411.077,A,2227.0739,S,06855.2912,,0,0,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14464);verify(decoder.decode(null, null,
                "imei:012497000431811,tracker,1210260609,,F,220925.000,A,0845.5500,N,07024.7673,W,0.00,,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14465);verify(decoder.decode(null, null,
                "imei:100000000000000,help me,1004171910,,F,010203.000,A,0102.0003,N,00102.0003,E,1.02,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14466);verify(decoder.decode(null, null,
                "imei:353451040164707,tracker,1105182344,+36304665439,F,214418.000,A,4804.2222,N,01916.7593,E,0.37,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14467);verify(decoder.decode(null, null,
                "imei:353451042861763,tracker,1106132241,,F,144114.000,A,2301.9052,S,04909.3676,W,0.13,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14468);verify(decoder.decode(null, null,
                "imei:359587010124900,tracker,0809231929,13554900601,F,112909.397,A,2234.4669,N,11354.3287,E,0.11,321.53,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14469);verify(decoder.decode(null, null,
                "imei:353451049926460,tracker,1208042043,123456 99008026,F,124336.000,A,3509.8668,N,03322.7636,E,0.00,,"));

        // SOS alarm
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14470);verify(decoder.decode(null, null,
                "imei:359586015829802,help me,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Low battery alarm
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14471);verify(decoder.decode(null, null,
                "imei:359586015829802,low battery,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Geo-fence alarm
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14472);verify(decoder.decode(null, null,
                "imei:359586015829802,stockade,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Move alarm
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14473);verify(decoder.decode(null, null,
                "imei:359586015829802,move,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        // Over speed alarm
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14474);verify(decoder.decode(null, null,
                "imei:359586015829802,speed,0809231429,13554900601,F,062947.294,A,2234.4026,N,11354.3277,E,0.00,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14475);verify(decoder.decode(null, null,
                "imei:863070010423167,tracker,1211051840,,F,104000.000,A,2220.6483,N,11407.6377,,0,0,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14476);verify(decoder.decode(null, null,
                "imei:863070010423167,tracker,1211051951,63360926,F,115123.000,A,2220.6322,N,11407.5313,E,0.00,,"));

        __CLR4_5_2b5fb5flx1e46m5.R.inc(14477);verify(decoder.decode(null, null,
                "imei:863070010423167,tracker,1211060621,,F,062152.000,A,2220.6914,N,11407.5506,E,15.85,347.84,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14478);verify(decoder.decode(null, null,
                "imei:863070012698733,tracker,1303092334,,F,193427.000,A,5139.0369,N,03907.2791,E,0.00,,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14479);verify(decoder.decode(null, null,
                "imei:869039001186913,tracker,130925065533,0,F,065533.000,A,5604.11015,N,9232.12238,E,0.0,,329.0,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14480);verify(decoder.decode(null, null,
                "imei:359710041641581,acc alarm,1402231159,,F,065907.000,A,2456.2591,N,06708.8335,E,7.53,76.10,,1,0,0.03%,,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14481);verify(decoder.decode(null, null,
                "imei:359710041641581,acc alarm,1402231159,,F,065907.000,A,2456.2591,N,06708.8335,E,7.53,76.10,,1,0,0.03%,,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14482);verify(decoder.decode(null, null,
                "imei:313009071131684,tracker,1403211928,,F,112817.000,A,0610.1133,N,00116.5840,E,0.00,,,0,0,0.0,0.0,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14483);verify(decoder.decode(null, null,
                "imei:866989771979791,tracker,140527055653,,F,215653.00,A,5050.33113,N,00336.98783,E,0.066,0"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14484);verify(decoder.decode(null, null,
                "imei:353552045375005,tracker,150401165832,61.0,F,31.0,A,1050.73696,N,10636.49489,E,8.0,,22.0,"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14485);verify(decoder.decode(null, null,
                "imei:353552045403597,tracker,150420050648,53.0,F,0.0,A,N,5306.64155,E,00700.77848,0.0,,1.0,;"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14486);verify(decoder.decode(null, null,
                "imei:353552045403597,tracker,150420051153,53.0,F,0.0,A,5306.64155,N,00700.77848,E,0.0,,1.0,;"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14487);verify(decoder.decode(null, null,
                "imei:359710047424644,tracker,150506224036,,F,154037.000,A,0335.2785,N,09841.1543,E,3.03,337.54,,0,0,45.16%,,;"));
        
        __CLR4_5_2b5fb5flx1e46m5.R.inc(14488);verify(decoder.decode(null, null,
                "imei:865328023776874,acc off,150619152221,,F,072218.000,A,5439.8489,N,02518.5945,E,0.00,,,1,1,0.0,0.0,23.0,;"));

    }finally{__CLR4_5_2b5fb5flx1e46m5.R.flushNeeded();}}

}
