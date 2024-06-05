/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class WondexProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2llullulwydzt71{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,28019,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2llullulwydzt71.R.globalSliceStart(getClass().getName(),28002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehllu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2llullulwydzt71.R.rethrow($CLV_t2$);}finally{__CLR4_5_2llullulwydzt71.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.WondexProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehllu() throws Exception{try{__CLR4_5_2llullulwydzt71.R.inc(28002);

        __CLR4_5_2llullulwydzt71.R.inc(28003);WondexProtocolDecoder decoder = new WondexProtocolDecoder(new WondexProtocol());

        __CLR4_5_2llullulwydzt71.R.inc(28004);verifyPosition(decoder, buffer(
                "2000000108,20151030145404,76.948633,43.354700,0,140,15,100,1,1325,125.4,10.5,0.0"),
                position("2015-10-30 14:54:04.000", true, 43.35470, 76.94863));

        __CLR4_5_2llullulwydzt71.R.inc(28005);verifyPosition(decoder, buffer(
                "2000000257,20151030145351,69.379976,53.283905,0,0,16,2,0,0,469.1,58.9,0.0"),
                position("2015-10-30 14:53:51.000", true, 53.28390, 69.37998));

        __CLR4_5_2llullulwydzt71.R.inc(28006);verifyPosition(decoder, buffer(
                "2000000232,20151030145206,51.166900,43.651353,0,132,11,2,0,0,0.0,0.0,0.0"));

        __CLR4_5_2llullulwydzt71.R.inc(28007);verifyPosition(decoder, buffer(
                "2000000259,20151030145653,69.380826,53.283890,9,10,15,2,1,695,1002.6,108.2,0.0"));

        __CLR4_5_2llullulwydzt71.R.inc(28008);verifyPosition(decoder, buffer(
                "1044989601,20130323074605,0.000000,90.000000,0,000,0,0,2"));

        __CLR4_5_2llullulwydzt71.R.inc(28009);verifyPosition(decoder, buffer(
                "123456789000001,20120101123200,130.000000,60.000000,0,000,0,0,0,0"));

        __CLR4_5_2llullulwydzt71.R.inc(28010);verifyPosition(decoder, buffer(
                "210000001,20070313170040,121.123456,12.654321,0,233,0,9,2,0.0,0,0.00,0.00,0"));

        __CLR4_5_2llullulwydzt71.R.inc(28011);verifyPosition(decoder, buffer(
                "1044989601,20130322172647,13.572583,52.401070,22,204,49,0,2"));

        __CLR4_5_2llullulwydzt71.R.inc(28012);verifyPosition(decoder, buffer(
                "1044989601,20130322172647,13.572583,52.401070,22,204,-49,0,2"));

        __CLR4_5_2llullulwydzt71.R.inc(28013);verifyPosition(decoder, buffer(
                "3997324533,20140326074908,28.797603,47.041635,0,48,0,6,2,3.90V,0"));

        __CLR4_5_2llullulwydzt71.R.inc(28014);verifyPosition(decoder, buffer(
                "2000000001,20140529213210,-63.179111,9.781493,0,0,54.0,8,2,0.0,0,0.01,0.01,0,0,0,0"));

        __CLR4_5_2llullulwydzt71.R.inc(28015);verifyNotNull(decoder, buffer(
                "$OK:VER=M7 2.003 DVB rev02c,V2"));

        __CLR4_5_2llullulwydzt71.R.inc(28016);verifyNotNull(decoder, buffer(
                "$OK:REBOOT"));

        __CLR4_5_2llullulwydzt71.R.inc(28017);verifyNotNull(decoder, buffer(
                "$ERR:GETLOCATION=1"));

        __CLR4_5_2llullulwydzt71.R.inc(28018);verifyNull(decoder, binary(
                "d0d70b0001ca9a3b"));

    }finally{__CLR4_5_2llullulwydzt71.R.flushNeeded();}}

}
