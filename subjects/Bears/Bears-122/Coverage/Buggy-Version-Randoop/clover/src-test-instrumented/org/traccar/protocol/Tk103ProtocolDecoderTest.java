/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Tk103ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l9tl9tlwydymip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,27619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l9tl9tlwydymip.R.globalSliceStart(getClass().getName(),27569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l9tl9tlwydymip.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l9tl9tlwydymip.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Tk103ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl9t() throws Exception{try{__CLR4_5_2l9tl9tlwydymip.R.inc(27569);

        __CLR4_5_2l9tl9tlwydymip.R.inc(27570);Tk103ProtocolDecoder decoder = new Tk103ProtocolDecoder(new Tk103Protocol());

        __CLR4_5_2l9tl9tlwydymip.R.inc(27571);verifyNull(decoder, text(
                "(027044702512BP00027044702512HSO01A4)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27572);verifyPosition(decoder, text(
                "(864768011069660,ZC11,250517,V,0000.0000N,00000.0000E,000.0,114725,000.0,0.00,11)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27573);verifyPosition(decoder, text(
                "(864768011069660,ZC17,250517,A,3211.7118N,03452.8086E,0.68,115525,208.19,64.50,9)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27574);verifyNull(decoder, text(
                "(357593060760397BP02,G,2,170304A6015.7466N01101.8460E001.609445591.048,7)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27575);verifyPosition(decoder, text(
                "(325031693849BR00170228A5750.8012N02700.7476E000.2154529000.0000000200L00000000,170228,194530)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27576);verifyPosition(decoder, text(
                "(087073803649BR00170221A6142.0334N02712.2197E000.3203149000.00,00000000L00000000)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27577);verifyPosition(decoder, text(
                "(864768010869060,DW30,050117,A,5135.82713N,00001.17918E,0.089,154745,000.0,43.40,12)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27578);verifyNotNull(decoder, text(
                "(087073104337BZ00,740,000,3bf7,0425,3bf7,0bf5,3bf7,09e7,3bf7,cbad,3bf7,0dcf,3bf7,c7b2,01000000)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27579);verifyNull(decoder, text(
                "(087073005534BP00HSO"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27580);verifyNull(decoder, text(
                "(027028258309BQ86,0,05550c21b10d1d0f431008bd114c0ea5078400010007a100423932,161117005322,01000001)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27581);verifyNull(decoder, text(
                "(027028258309BQ86,0,05470c0eb20d040f4410022911360e92077e00010007a1004237c7,161117005232,01000001)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27582);verifyPosition(decoder, text(
                "(01602009983BR00160830V1855.7022S4817.8731W000.0002729000.0010000000L00000000)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27583);verifyPosition(decoder, text(
                "(088046338039BR00160727A3354.7768N03540.7258E000.0140832068.4700000000L00BEB0D4+017.7)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27584);verifyPosition(decoder, text(
                "(088046338039BP05000088046338039160727A3354.7768N03540.7258E000.0140309065.1000000000L00BEB0D4+017.3)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27585);verifyAttributes(decoder, text(
                "(013632651491,ZC20,180716,144222,6,392,65535,255"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27586);verifyAttributes(decoder, text(
                "(087072009461BR00000007V0000.0000N00000.0000E000.00014039900000000L00000000"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27587);verifyPosition(decoder, text(
                "(013612345678BO012061830A2934.0133N10627.2544E040.0080331309.6200000000L000770AD"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27588);verifyNotNull(decoder, text(
                "(088047194605BZ00,510,010,36e6,932c,43,36e6,766b,36,36e6,7668,32"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27589);verifyAttributes(decoder, text(
                "(013632651491,ZC20,040613,040137,6,421,112,0"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27590);verifyAttributes(decoder, text(
                "(864768010159785,ZC20,291015,030413,3,362,65535,255"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27591);verifyPosition(decoder, text(
                "(088047365460BR00151024A2555.3531S02855.3329E004.7055148276.1701000000L00009AA3)"),
                position("2015-10-24 05:51:48.000", true, -25.92255, 28.92222));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27592);verifyPosition(decoder, text(
                "(088047365460BP05354188047365460150929A3258.1754S02755.4323E009.4193927301.9000000000L00000000)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27593);verifyPosition(decoder, text(
                "(088048003342BP05354188048003342150917A1352.9801N10030.9050E000.0103115265.5600010000L000003F9)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27594);verifyPosition(decoder, text(
                "(088048003342BR00150917A1352.9801N10030.9050E000.0103224000.0000010000L000003F9)"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27595);verifyPosition(decoder, text(
                "(088048003342BR00150807A1352.9871N10030.9084E000.0110718000.0001010000L00000000)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27596);verifyNull(decoder, text(
                "(090411121854BP0000001234567890HSO"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27597);verifyPosition(decoder, text(
                "(01029131573BR00150428A3801.6382N02351.0159E000.0080729278.7800000000LEF9ECB9C)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27598);verifyPosition(decoder, text(
                "(035988863964BP05000035988863964110524A4241.7977N02318.7561E000.0123536356.5100000000L000946BB"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27599);verifyPosition(decoder, text(
                "(013632782450BP05000013632782450120803V0000.0000N00000.0000E000.0174654000.0000000000L00000000"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27600);verifyPosition(decoder, text(
                "(013666666666BP05000013666666666110925A1234.5678N01234.5678W000.002033490.00000000000L000024DE"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27601);verifyPosition(decoder, text(
                "(013666666666BO012110925A1234.5678N01234.5678W000.0025948118.7200000000L000024DE"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27602);verifyPosition(decoder, text(
                "\n\n\n(088045133878BR00130228A5124.5526N00117.7152W000.0233614352.2200000000L01B0CF1C"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27603);verifyPosition(decoder, text(
                "(008600410203BP05000008600410203130721A4152.5790N01239.2770E000.0145238173.870100000AL0000000"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27604);verifyPosition(decoder, text(
                "(013012345678BR00130515A4843.9703N01907.6211E000.019232800000000000000L00009239"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27605);verifyPosition(decoder, text(
                "(012345678901BP05000012345678901130520A3439.9629S05826.3504W000.1175622323.8700000000L000450AC"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27606);verifyPosition(decoder, text(
                "(012345678901BR00130520A3439.9629S05826.3504W000.1175622323.8700000000L000450AC"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27607);verifyPosition(decoder, text(
                "(352606090042050,BP05,240414,V,0000.0000N,00000.0000E,000.0,193133,000.0"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27608);verifyPosition(decoder, text(
                "(352606090042050,BP05,240414,A,4527.3513N,00909.9758E,4.80,112825,155.49"),
                position("2014-04-24 11:28:25.000", true, 45.45586, 9.16626));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27609);verifyPosition(decoder, text(
                "(013632782450,BP05,101201,A,2234.0297N,11405.9101E,000.0,040137,178.48,00000000,L00000000"));
        
        __CLR4_5_2l9tl9tlwydymip.R.inc(27610);verifyPosition(decoder, text(
                "(864768010009188,BP05,271114,V,4012.19376N,00824.05638E,000.0,154436,000.0"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27611);verifyPosition(decoder, text(
                "(013632651491,BP05,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27612);verifyPosition(decoder, text(
                "(013632651491,ZC07,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27613);verifyPosition(decoder, text(
                "(013632651491,ZC11,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27614);verifyPosition(decoder, text(
                "(013632651491,ZC12,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27615);verifyPosition(decoder, text(
                "(013632651491,ZC13,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27616);verifyPosition(decoder, text(
                "(013632651491,ZC17,040613,A,2234.0297N,11405.9101E,000.0,040137,178.48)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27617);verifyNull(decoder, text(
                "(013632651491,ZC20,040613,040137,6,42,112,0)"));

        __CLR4_5_2l9tl9tlwydymip.R.inc(27618);verifyPosition(decoder, text(
                "(094050000111BP05000094050000111150808A3804.2418N04616.7468E000.0201447133.3501000011L0028019DT000)"));

    }finally{__CLR4_5_2l9tl9tlwydymip.R.flushNeeded();}}

}
