/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GoSafeProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ikqikqlx1dxrzi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,24093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ikqikqlx1dxrzi.R.globalSliceStart(getClass().getName(),24074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehikq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ikqikqlx1dxrzi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ikqikqlx1dxrzi.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GoSafeProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehikq() throws Exception{try{__CLR4_5_2ikqikqlx1dxrzi.R.inc(24074);

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24075);GoSafeProtocolDecoder decoder = new GoSafeProtocolDecoder(new GoSafeProtocol());

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24076);verifyPositions(decoder, text(
                "*GS26,356449061046586,082522030117,,SYS:G737IC;V1.13;V1.0.5,GPS:V;5;N42.594136;W70.723832;0;0;8;2.06,GSM:;;310;260;C76D;9F1D;-85,ADC:3.86,DTT:3918C;;0;0;0;1,#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24077);verifyPositions(decoder, text(
                "*GS56,357330051092344,123918301116,10,GPS:L;9;N47.582920;W122.238720;0;0;102;0.99,GSM:0;0;310;410;A7DB;385C;-86,COT:76506,ADC:0.82;3.77,DTT:2184;;0;0;10000;0$000000000000,86,GPS:A;6;N47.582912;W122.238840;0;0;88;2.20,COT:76506,ADC:0.00;3.75,DTT:0;;0;0;40;0$000000000000,86,GPS:A;6;N47.582912;W122.238840;0;0;88;2.20,COT:76506,ADC:0.00;3.74,DTT:0;;0;0;40;0$000000000000,93,GPS:A;6;N47.582912;W122.238840;0;0;88;2.20,COT:76506,ADC:0.00;3.73,DTT:8000;;0;0;80000;0$000000000000,13,GPS:L;6;N47.582912;W122.238840;0;0;88;2.20,COT:76506,ADC:11.09;3.79,DTT:2004;;0;0;80000;0$000000000000,90,GPS:L;6;N47.582912;W122.238840;0;0;88;2.20,COT:76506,ADC:11.13;3.79,DTT:23004;;0;0;10000;0$000000000000,,GPS:L;6;N47.582912;W122.238840;0;0;88;2.20,GSM:5;2;310;410;A7DB;385C;-89,COT:76506,ADC:14.12;3.81,DTT:23184;;0;0;0;6#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24078);verifyPositions(decoder, text(
                "*GS26,356449061139936,022918011216,,SYS:G737IC;V1.13;V1.0.5,GPS:A;9;N42.651728;W70.623520;0;0;48;1.50,ADC:4.08,DTT:3900C;;0;0;0;1,#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24079);verifyNotNull(decoder, text(
                "*GS56,356449063230915,052339180916,,SYS:G7S;V1.08;V1.2,GPS:V;4;N24.730006;E46.637816;14;0;630,GSM:;;420;4;5655;507A;-70,COT:75242;2-8-17,ADC:13.22;0.08,DTT:23004;;0;0;0;1#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24080);verifyNotNull(decoder, text(
                "*GS56,356449063230915,052349180916,,SYS:G7S;V1.08;V1.2,GPS:V;6;N24.730384;E46.637620;47;56;607,GSM:;;420;4;5655;507A;-70,COT:75290;2-8-27,ADC:13.24;0.08,DTT:23004;;0;0;0;1#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24081);verifyNotNull(decoder, text(
                "*GS56,356449063230915,052444180916,,SYS:G7S;V1.08;V1.2,GPS:V;6;N24.730384;E46.637620;47;56;607,GSM:;;420;4;5655;F319;-102,COT:75290;2-9-27,ADC:13.00;0.08,DTT:23004;;0;0;0;1$052449180916,,SYS:G7S;V1.08;V1.2,GPS:V;6;N24.730384;E46.637620;47;56;607,GSM:;;420;4;5655;F319;-102,COT:75290;2-9-27,ADC:13.13;0.08,DTT:23004;;0;0;0;1#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24082);verifyPositions(decoder, text(
                "*GS16,356449062643845,141224290316,,SYS:G79;V1.13;V1.0.2,GPS:V;5;N24.694972;E46.680736;46;334;606;1.43,GSM:;;420;4;5655;4EB8;-57,COT:330034,ADC:13.31;3.83,DTT:27004;;0;0;0;1,OBD:064101000400000341057E04410304000341510104411001C203410F4B0341112904411F01AB0641010004000014490201FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF03410D21,FUL:28260"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24083);verifyPositions(decoder, text(
                "*GS16,351535059439208,145425130316,,GPS:V;0;N0.000000;E0.000000;0;0;0;0.00;0.00,GSM:1;3;416;3;A8C;2820;-81;416;3;A8C;281F;-83;416;3;A8C;368A;-87;416;3;A8C;368B;-89;416;3;A8C;2C26;-103;416;3;A8C;3689;-107;416;3;A8C;2D83;-107"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24084);verifyPosition(decoder, text(
                "*GS02,358696043774648,GPS:230040;A;S1.166829;E36.934287;0;0;170116,STT:20;0,MGR:32755204,ADC:0;11.2;1;28.3;2;4.1,GFS:0;0"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24085);verifyNothing(decoder, text(
                "*GS02,358696043774648"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24086);verifyPositions(decoder, text(
                "*GS16,351535058709775,100356130215,,SYS:G79W;V1.06;V1.0.2,GPS:A;6;N24.802700;E46.616828;0;0;684;1.35,COT:60,ADC:4.31;0.10,DTT:20000;;0;0;0;1"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24087);verifyPositions(decoder, text(
                "*GS16,351535059439208,074558291015,,GPS:A;9;N31.935942;E35.867092;;345;921;1.03;1.59,GSM:1;3;416;3;A8C;368B;-78;416;3;A8C;2820;-73;416;3;BB8;2CBE;-76;416;3;A8C;368A;-76;416;3;A8C;2C26;-79,OBD:04410C122003410D0F03411C0103410547037F011203411100"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24088);verifyPositions(decoder, text(
                "*GS16,351535059439208,083515281015,,GPS:A;9;N31.959502;E35.908316;;108;890;1.05;1.79,GSM:1;4;416;3;AF0;A3A6;-59;416;3;AF0;A3A3;-50;416;3;AF0;A3A4;-56;416;3;AF0;A3A5;-62;416;3;AF0;B195;-76,OBD:04410C194603410D2303411C0103410583037F011203411115"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24089);verifyNothing(decoder, text(
                "*GS16,351535058709775"));
        
        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24090);verifyPositions(decoder, text(
                "*GS16,351535059439208,103441131015,,GPS:A;8;N31.960122;E35.921652;27;99;847;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-61;416;3;AF0;9C89;-68,OBD:04410C0DA403410D0B03411C010341057A037F011203411100$103453131015,,GPS:A;8;N31.959976;E35.922144;6;0;835;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D8E03410D0B03411C010341057D037F011203411100$103503131015,,GPS:A;9;N31.959870;E35.922284;11;127;830;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D8E03410D0B03411C010341057D037F011203411100$103513131015,,GPS:A;9;N31.959742;E35.922516;10;106;830;1.37;2.91,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D1003410D0603411C010341057E037F011203411100$103553131015,,GPS:A;8;N31.959564;E35.923308;6;0;836;1.41;2.43,GSM:1;4;416;3;AF0;9C73;-65;416;3;AF0;B389;-71;416;3;AF0;9C89;-74,OBD:04410C0DAE03410D0403411C010341057C037F011203411100#"));

        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24091);verifyPositions(decoder, text(
                "*GS16,351535059439208,155750220815,,SYS:G79;V1.10;V1.0.2,GPS:A;4;N31.944198;E35.846644;0;0;923;9.47;1.00,COT:155133,ADC:12.21;0.10,DTT:20002;;0;0;0;1#"));
        
        __CLR4_5_2ikqikqlx1dxrzi.R.inc(24092);verifyPositions(decoder, text(
                "*GS16,351535059439208,070034220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945970;E35.859848;29;65;922;1.14;1.68,COT:147528,ADC:14.07;0.11,DTT:27006;;0;0;0;3,OBD:04410C1ECD03410D2D03411C010341057A037F011203411107$070035220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945934;E35.859908;29;86;922;1.14;1.68,COT:147528,ADC:13.94;0.15,DTT:27006;;0;0;0;3,OBD:04410C1ECD03410D2D03411C010341057A037F011203411107$070037220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945844;E35.859952;29;123;922;1.14;1.68,COT:147625,ADC:13.75;0.11,DTT:27006;;0;0;0;3,OBD:04410C0FE803410D1803411C010341057C037F011203411100$070038220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945808;E35.859940;29;145;923;1.14;1.68,COT:147625,ADC:14.00;0.11,DTT:27006;;0;0;0;3,OBD:04410C0FE803410D1803411C010341057C037F011203411100#"));

    }finally{__CLR4_5_2ikqikqlx1dxrzi.R.flushNeeded();}}

}
