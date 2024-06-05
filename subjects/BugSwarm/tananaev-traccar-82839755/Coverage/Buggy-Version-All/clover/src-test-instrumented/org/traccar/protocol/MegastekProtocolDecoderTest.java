/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class MegastekProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bb4bb4lx1e51yw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565479029L,8589935092L,14673,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bb4bb4lx1e51yw.R.globalSliceStart(getClass().getName(),14656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bb4bb4lx1e51yw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bb4bb4lx1e51yw.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MegastekProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbb4() throws Exception{try{__CLR4_5_2bb4bb4lx1e51yw.R.inc(14656);

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14657);MegastekProtocolDecoder decoder = new MegastekProtocolDecoder(new MegastekProtocol());

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14658);verify(decoder.decode(null, null,
                "$MGV002,860719020193193,DeviceName,R,240214,104742,A,2238.20471,N,11401.97967,E,00,03,00,1.20,0.462,356.23,137.9,1.5,460,07,262C,0F54,25,0000,0000,0,0,0,28.5,28.3,,,100,Timer;!"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14659);verify(decoder.decode(null, null,
                "STX2010101801      j$GPRMC,101053.000,A,2232.7607,N,11404.7669,E,0.00,,231110,,,A*7F,460,00,2795,0E6A,14,94,1000,0000,91,Timer;1D"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14660);verify(decoder.decode(null, null,
                "STX,861001005215757,$GPRMC,180118.000,A,4241.330116,N,2321.931251,E,0.00,182.19,130915,,E,A,F,Nil-Alarms,imei:861001005215757,8,577.0,Battery=38%,0,284,03,03E8,3139;7A"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14661);verify(decoder.decode(null, null,
                "STX,865067020439090,$GPRMC,171013.000,A,5919.1411,N,01804.1681,E,0.000,294.41,140815,,,A"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14662);verify(decoder.decode(null, null,
                "$MGV002,013777007536434,,R,010114,000057,V,0000.0000,N,00000.0000,E,00,00,00,99.9,0.000,0.00,0.0,80.263,510,89,2342,030B,,0000,0000,200,96,0, , ,,,,Timer;!"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14663);verify(decoder.decode(null, null,
                "STX,GerAL22,$GPRMC,174752.000,A,3637.060059,S,6416.2354,W,0.00,0.00,030812,,,A*55,F,,imei:861785000249353,05,180.6,Battery=100%,,1,722,310,0FA6,39D0;8F"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14664);verify(decoder.decode(null, null,
                "STX,GerAL22,$GPRMC,000051.000,A,3637.079590,S,6416.2148,W,1.72,332.98,010109,,,A*52,L,,imei:861785000249353,03,275.3,Battery=68%,,1,722,07,0515,1413;41"));
        
        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14665);verify(decoder.decode(null, null,
                "STX,,$GPRMC,001339.000,A,4710.85395,N,02733.58209,E,1.65,238.00,010109,,,A*67,L,Help,imei:013227009737796,0/8,137.1,Battery=100%,,0,226,01,2B9B,BBBF;8D"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14666);verify(decoder.decode(null, null,
                "STX,102110830074542,$GPRMC,114229.000,A,2238.2024,N,11401.9619,E,0.00,0.00,310811,,,A*64,F,LowBattery,imei:012207005553885,03,113.1,Battery=24%,,1,460,01,2531,647E;57"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14667);verify(decoder.decode(null, null,
                "STX863070014949464   $GPRMC,215942.290,A,4200.1831,N,02128.5904,E,003.1,079.8,090813,,,A*6E,294,02,0064,0F3D,18,17,0000,000000,0000,0.00,0.02,0.00,Store;D8"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14668);verify(decoder.decode(null, null,
                "STX123456            $GPRMC,063709.000,A,2238.1998,N,11401.9670,E,0.00,,250313,,,A*7F,460,01,2531,647E,11,87,1000,001001,0000,0.00,0.02,0.00,Timer;4A"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14669);verify(decoder.decode(null, null,
                "STX260475            $GPRMC,104032.001,A,4022.1119,N,01811.4081,E,000.0,000.0,060913,,,A*67,222,01,815A,D455,11,99,0000,0001,0,Timer;"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14670);verify(decoder.decode(null, null,
                "LOGSTX,123456789012345,$GPRMC,225419.000,A,3841.82201,N,09494.73357,W,12.46,135.33,270914,,,A*47,F,,imei:123456789012345,0/6,,Battery=100%,,0,,,5856,78A3;24"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14671);verify(decoder.decode(null, null,
                "LOGSTX,123456789012345,$GPRMC,230551.000,A,3841.81956,N,09494.45403,W,0.00,0.00,270914,,,A*7C,L,,imei:123456789012345,0/7,269.7,Battery=100%,,0,,,5856,78A3;83"));

        __CLR4_5_2bb4bb4lx1e51yw.R.inc(14672);verify(decoder.decode(null, null,
                "LOGSTX,123456789012345,$GPRMC,230739.000,A,3841.81895,N,09494.12409,W,0.00,0.00,270914,,,A*70,L,,imei:123456789012345,0/7,269.7,Battery=100%,,0,,,5856,78A3;78"));
        
    }finally{__CLR4_5_2bb4bb4lx1e51yw.R.flushNeeded();}}

}
