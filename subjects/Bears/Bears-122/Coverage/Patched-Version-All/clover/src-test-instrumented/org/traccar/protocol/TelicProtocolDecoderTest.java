/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TelicProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l7rl7rlwye7j8q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,27519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l7rl7rlwye7j8q.R.globalSliceStart(getClass().getName(),27495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l7rl7rlwye7j8q.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l7rl7rlwye7j8q.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TelicProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl7r() throws Exception{try{__CLR4_5_2l7rl7rlwye7j8q.R.inc(27495);

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27496);TelicProtocolDecoder decoder = new TelicProtocolDecoder(new TelicProtocol());

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27497);verifyPosition(decoder, text(
                "442045993198,290317131935,0,290317131935,269158,465748,3,26,183,,,,184,85316567,226,01,00,68,218"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27498);verifyPosition(decoder, text(
                "673091036017,290317131801,0,290317131801,262214,450536,3,40,199,8,,,154,19969553,,0011,00,59,240,0,0406"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27499);verifyPosition(decoder, text(
                "092020621198,280317084155,0,280317084156,259762,444356,3,42,278,9,,,89,56793311,,0110,00,67,0,,0400"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27500);verifyPosition(decoder, text(
                "502091227598,280317084149,0,280317084149,261756,444358,3,33,286,9,,,77,3143031,,0010,00,171,240,0,0406"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27501);verifyPosition(decoder, text(
                "232027997498,230317083900,0,230317083900,260105,444112,3,22,259,,,,111,61110817,226,01,00,255,218,00000000000000"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27502);verifyPosition(decoder, text(
                "072027997498,230317082635,0,230317082635,260332,444265,3,28,165,,,,124,61107582,226,01,00,255,219,00000000000000"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27503);verifyNull(decoder, text(
                "0026203393|226|10|002004010"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27504);verifyPosition(decoder, text(
                "003020339325,190317083052,0,180317103127,259924,445133,3,0,0,9,,,93,12210141,,0010,00,40,240,0,0406"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27505);verifyNull(decoder, text(
                "0026296218SCCE01_SCCE|226|10|0267"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27506);verifyNull(decoder, text(
                "1242022592TTUV0100,0201,351266000022592,170403114305,0115859,480323,3,30,5,9,3,4,650,250000000,26202,1001,0001,211,233,111,0"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27507);verifyPosition(decoder, text(
                "123002259213,170403114305,1234,170403114305,0115859,480323,3,30,5,9,3,4,650,250000000,26202,1001,0001,211,233,111,0,600"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27508);verifyNull(decoder, text(
                "0044296218TLOC0267,00,011009000296218,190317083036,255178,445072,3,0,82,,,,168,14741296,,00,00,0,217"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27509);verifyPosition(decoder, text(
                "003097061325,220616044200,0,220616044200,247169,593911,3,48,248,8,,,50,1024846,,1111,00,48,0,51,0406"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27510);verifyPosition(decoder, text(
                "003097061325,210216112630,0,210216001405,246985,594078,3,0,283,12,,,23,4418669,,0010,00,117,0,0,0108"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27511);verifyPosition(decoder, text(
                "592078222222,010100030200,0,240516133500,222222,222222,3,0,0,5,,,37,324,,1010,00,48,0,0,0406"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27512);verifyPosition(decoder, text(
                "002017297899,220216111100,0,220216111059,014306446,46626713,3,7,137,7,,,448,266643,,0000,00,0,206,0,0407"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27513);verifyPosition(decoder, text(
                "003097061325,210216112630,0,210216001405,246985,594078,3,0,283,12,,,23,4418669,,0010,00,117,0,0,0108"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27514);verifyNull(decoder, text(
                "0026970613|248|01|004006011"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27515);verifyPosition(decoder, text(
                "032097061399,210216112800,0,210216112759,246912,594076,3,47,291,10,,,46,4419290,,0010,00,100,0,0,0108"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27516);verifyPosition(decoder, text(
                "002017297899,190216202500,0,190216202459,014221890,46492170,3,0,0,6,,,1034,43841,,0000,00,0,209,0,0407"));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27517);verifyPosition(decoder, text(
                "182043672999,010100001301,0,270613041652,166653,475341,3,0,355,6,2,1,231,8112432,23201,01,00,217,0,0,0,0,7"),
                position("2013-06-27 04:16:52.000", true, 47.53410, 16.66530));

        __CLR4_5_2l7rl7rlwye7j8q.R.inc(27518);verifyPosition(decoder, text(
                "182043672999,010100001301,0,270613041652,166653,475341,3,0,355,6,2,1,231,8112432,23201,01,00,217,0,0,0,0,7"));

    }finally{__CLR4_5_2l7rl7rlwye7j8q.R.flushNeeded();}}

}
