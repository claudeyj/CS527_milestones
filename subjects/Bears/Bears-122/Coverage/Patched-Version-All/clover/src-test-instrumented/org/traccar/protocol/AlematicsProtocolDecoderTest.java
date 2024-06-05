/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AlematicsProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jwljwllwye7isc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,25806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jwljwllwye7isc.R.globalSliceStart(getClass().getName(),25797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jwljwllwye7isc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jwljwllwye7isc.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AlematicsProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjwl() throws Exception{try{__CLR4_5_2jwljwllwye7isc.R.inc(25797);

        __CLR4_5_2jwljwllwye7isc.R.inc(25798);AlematicsProtocolDecoder decoder = new AlematicsProtocolDecoder(new AlematicsProtocol());

        __CLR4_5_2jwljwllwye7isc.R.inc(25799);verifyPosition(decoder, text(
                "$T,2,552,868259020159698,20170515060949,20170515060949,25.035277,121.561986,0,202,78,1.0,8,1,0,0.000,12.768,1629,38,12770,4109,9"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25800);verifyPosition(decoder, text(
                "$T,2,553,868259020159698,20170515061019,20170515061019,25.035295,121.561981,0,202,79,1.0,8,1,0,0.000,12.768,1629,38,12772,4109,8"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25801);verifyPosition(decoder, text(
                "$T,4,4,868259020159698,20170515061033,20170515061033,25.035303,121.561975,0,202,81,1.7,6,1,0,0.000,12.770,1629,0,$S,A1,1,,12345.67,88.4,301.5,,2593.25,12.4,89.2,,5999.44,789.572,2345.67,,10763,1024,5,"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25802);verifyPosition(decoder, text(
                "$T,2,554,868259020159698,20170515061049,20170515061049,25.035309,121.561976,0,202,82,1.1,7,1,0,0.000,12.768,1629,38,12770,4109,9"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25803);verifyPosition(decoder, text(
                "$T,4,5,868259020159698,20170515061058,20170515061058,25.035308,121.561976,0,202,82,1.2,7,1,0,0.000,12.772,1629,0,$S,A1,1,,12345.67,88.4,301.5,,2593.25,12.4,89.2,,5999.44,789.572,2345.67,,10763,1024,5,"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25804);verifyPosition(decoder, text(
                "$T,50,592,868259020159698,20170515062915,20170515062915,25.035005,121.561555,0,31,89,3.7,5,1,0,0.000,12.752,1629,38,12752,4203,6"));

        __CLR4_5_2jwljwllwye7isc.R.inc(25805);verifyPosition(decoder, text(
                "$T,50,594,868259020159698,20170515062928,20170515062928,25.035151,121.561671,0,31,93,1.8,5,0,0,0.000,12.752,1629,38,12756,4205,6"));

    }finally{__CLR4_5_2jwljwllwye7isc.R.flushNeeded();}}

}
