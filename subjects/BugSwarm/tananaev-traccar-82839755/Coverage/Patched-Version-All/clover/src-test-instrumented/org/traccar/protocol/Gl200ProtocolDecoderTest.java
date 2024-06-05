/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class Gl200ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b52b52lx1e827v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565619500L,8589935092L,14482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b52b52lx1e827v.R.globalSliceStart(getClass().getName(),14438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b52b52lx1e827v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b52b52lx1e827v.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gl200ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb52() throws Exception{try{__CLR4_5_2b52b52lx1e827v.R.inc(14438);

        __CLR4_5_2b52b52lx1e827v.R.inc(14439);Gl200ProtocolDecoder decoder = new Gl200ProtocolDecoder(new Gl200Protocol());
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14440);verify(decoder.decode(null, null,
                "+RESP:GTFRI,0F0106,862193020451183,,,10,1,1,0.0,163,,-57.513617,-25.368191,20150918182145,,,,,,21235.0,,,,0,210100,,,,20150918182149,00B8$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14441);verify(decoder.decode(null, null,
                "+RESP:GTOBD,1F0109,864251020135483,,gv500,0,78FFFF,,1,12613,,,,,,,,,,,,,,1286,0,0.0,0,17.1,3.379630,6.529701,20150813074639,0621,0030,51C0,A2B3,00,0.0,20150813074641,A7E6$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14442);verify(decoder.decode(null, null,
                "+RESP:GTOBD,1F0109,864251020135483,4T1BE46KX7U018210,gv500,0,78FFFF,4T1BE46KX7U018210,1,13411,981B81C0,787,3,43,,921,463,1,10,0300030103030304001200310351035203530354,20,55,,1286,0,6.5,74,21.6,3.379710,6.529714,20150813074824,0621,0030,51C0,A2B3,00,0.0,20150813074828,A7E9$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14443);verify(decoder.decode(null, null,
                "+RESP:GTSTT,1A0401,860599000508846,,41,0,0.0,84,107.5,-76.657998,39.497203,20150623160622,0310,0260,B435,3B81,,20150623160622,0F54$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14444);verify(decoder.decode(null, null,
                "+RESP:GTFRI,1A0401,860599000508846,,0,0,1,1,134.8,154,278.7,-76.671089,39.778885,20150623154301,0310,0260,043F,7761,,99,20150623154314,0F24$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14445);verify(decoder.decode(null, null,
                "+RESP:GTFRI,1A0200,860599000165464,CRI001,0,0,1,2,,41,,-71.153137,42.301634,20150328020301,,,,,280.3,55,20150327220351,320C"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14446);verify(decoder.decode(null, null,
                "+RESP:GTFRI,02010D,867844001675407,,0,0,1,2,0.0,0,28.9,8.591011,56.476397,20140915213209,0238,0001,03CB,2871,,97,20140915213459,009A"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14447);assertNull(decoder.decode(null, null,
                "+RESP:GTINF,359464030073766,8938003990320469804f,18,99,100,1,0,+2.00,0,20131018084015,00EE,0103090402"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14448);verify(decoder.decode(null, null,
                "+RESP:GTFRI,04040C,359231038939904,,,10,1,2,0.0,117,346.0,8.924243,50.798077,20130618122040,0262,0002,0299,109C,00,0.0,,,,,,,,,20130618122045,00F6"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14449);verify(decoder.decode(null, null,
                "+RESP:GTSTT,04040C,359231038939904,,42,0,0.0,117,346.0,8.924243,50.798077,20130618125152,0262,0002,0299,109C,00,20130618125154,017A"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14450);verify(decoder.decode(null, null,
                "+RESP:GTFRI,020102,000035988863964,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14451);verify(decoder.decode(null, null,
                "+RESP:GTFRI,020102,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14452);verify(decoder.decode(null, null,
                "+RESP:GTFRI,020102,135790246811220,,0,0,2,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,0,4.3,92,70.0,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14453);verify(decoder.decode(null, null,
                "+RESP:GTDOG,020102,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14454);verify(decoder.decode(null, null,
                "+RESP:GTLBC,020102,135790246811220,,+8613800000000,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,,20090214093254,11F0"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14455);verify(decoder.decode(null, null,
                "+RESP:GTGCR,020102,135790246811220,,3,50,180,2,0.4,296,-5.4,121.391055,31.164473,20100714104934,0460,0000,1878,0873,00,,20100714104934,000C"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14456);verify(decoder.decode(null, null,
                "+RESP:GTFRI,07000D,868487001005941,,0,0,1,1,0.0,0,46.3,-77.039627,38.907573,20120731175232,0310,0260,B44B,EBC9,0015e96913a7,-58,,100,20120731175244,0114"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14457);verify(decoder.decode(null, null,
                "+RESP:GTTOW,0F0100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14458);verify(decoder.decode(null, null,
                "+RESP:GTDIS,0F0100,135790246811220,,,20,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14459);verify(decoder.decode(null, null,
                "+RESP:GTIOB,0F0100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14460);verify(decoder.decode(null, null,
                "+RESP:GTGEO,0F0100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14461);verify(decoder.decode(null, null,
                "+RESP:GTSPD,0F0100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14462);verify(decoder.decode(null, null,
                "+RESP:GTSOS,0F0100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14463);verify(decoder.decode(null, null,
                "+RESP:GTRTL,0F0100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14464);verify(decoder.decode(null, null,
                "+RESP:GTDOG,0F0100,135790246811220,,,01,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14465);verify(decoder.decode(null, null,
                "+RESP:GTIGL,0F0100,135790246811220,,,00,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14466);verify(decoder.decode(null, null,
                "+RESP:GTHBM,0F0100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14467);verify(decoder.decode(null, null,
                "+RESP:GTHBM,0F0100,135790246811220,,,11,1,1,24.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,20090214093254,11F0$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14468);verify(decoder.decode(null, null,
                "+RESP:GTFRI,02010C,867844001274144,,0,0,1,1,18.0,233,118.1,7.615551,51.515600,20140106130516,0262,0007,79E6,B956,,72,20140106140524,09CE$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14469);verify(decoder.decode(null, null,
                "+RESP:GTFRI,02010C,867844001274649,,0,0,1,1,0.0,0,122.5,7.684216,51.524512,20140106233722,0262,0007,79EE,1D22,,93,20140107003805,03C4$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14470);verify(decoder.decode(null, null,
                "+BUFF:GTFRI,210101,863286020016706,,,10,1,1,,,,49.903915,40.391669,20140818105815,,,,,,,,,,,210100,,,,,000C$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14471);verify(decoder.decode(null, null,
                "+RESP:GTFRI,240100,135790246811220,,,10,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,2000.0,12345:12:34,,80,,,,,,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14472);verify(decoder.decode(null, null,
                "+RESP:GTFRI,240100,135790246811220,,,10,2,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,00,0,4.3,92,70.0,121.354335,31.222073,20090101000000,0460,0000,18d8,6141,00,2000.0,12345:12:34,,,80,,,,,,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14473);verify(decoder.decode(null, null,
                "\u0000,005F,0,GTFRI,020100,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,90,20090214093254,11F0$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14474);verify(decoder.decode(null, null,
                "\u0000,005F,0,GTGEO,020100,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,90,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14475);verify(decoder.decode(null, null,
                "\u0000,005F,0,GTNMR,020100,135790246811220,,0,0,1,1,4.3,92,70.0,121.354335,31.222073,20090214013254,0460,0000,18d8,6141,90,20090214093254,11F0$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14476);verify(decoder.decode(null, null,
                "\u0000,0017,0,GTNMR,,867844000400914,,0,41,1,2,0.0,0,1504.2,-75.569202,6.242850,20150404162835,,,,,97,20150404162836,05EF$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14477);assertNull(decoder.decode(null, null,
                "\u0000,0017,0,GTPNA,,867844000400914,,0,0,1,0,,,,0,0,,,,,,99,20150404190153,0601$"));
        
        __CLR4_5_2b52b52lx1e827v.R.inc(14478);verify(decoder.decode(null, null,
                "\u0000,0017,0,GTEPN,,867844000400914,,0,0,1,0,0.0,0,1717.4,-75.598445,6.278578,20150405003116,,,,,95,20150405003358,0607$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14479);verify(decoder.decode(null, null,
                "+RESP:GTSTT,280100,A1000043D20139,,42,0,0.1,321,228.6,-76.660884,39.832552,20150615120628,0310,0484,00600019,0A52,,20150615085741,0320$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14480);verify(decoder.decode(null, null,
                "+RESP:GTRTL,280100,A1000043D20139,,0,0,1,1,0.1,321,239.1,-76.661047,39.832501,20150615114455,0310,0484,00600019,0A52,,87,20150615074456,031E$"));

        __CLR4_5_2b52b52lx1e827v.R.inc(14481);assertNull(decoder.decode(null, null,
                "+ACK:GTHBD,1A0401,135790246811220,,20100214093254,11F0"));

    }finally{__CLR4_5_2b52b52lx1e827v.R.flushNeeded();}}

}
