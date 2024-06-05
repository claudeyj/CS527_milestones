/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;


public class GpsMarkerProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2khqkhqlwye68uo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26565,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2khqkhqlwye68uo.R.globalSliceStart(getClass().getName(),26558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2khqkhqlwye68uo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2khqkhqlwye68uo.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GpsMarkerProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkhq() throws Exception{try{__CLR4_5_2khqkhqlwye68uo.R.inc(26558);

        __CLR4_5_2khqkhqlwye68uo.R.inc(26559);GpsMarkerProtocolDecoder decoder = new GpsMarkerProtocolDecoder(new GpsMarkerProtocol());

        __CLR4_5_2khqkhqlwye68uo.R.inc(26560);verifyPosition(decoder, text(
                "$GM23D863071014445404T260816142611N55441051E037325071033063C0530304#"));

        __CLR4_5_2khqkhqlwye68uo.R.inc(26561);verifyNull(decoder, text(
                "$GM300350123456789012T100511123300G25000001772F185200000000000000005230298#"));

        __CLR4_5_2khqkhqlwye68uo.R.inc(26562);verifyPosition(decoder, text(
                "$GM200350123456789012T100511123300N55516789E03756123400000035230298#"),
                position("2011-05-10 12:33:00.000", true, 55.86132, 37.93539));

        __CLR4_5_2khqkhqlwye68uo.R.inc(26563);verifyPosition(decoder, text(
                "$GM1350123456789012T1005111233N55516789E03756123400000035200298#"));

        __CLR4_5_2khqkhqlwye68uo.R.inc(26564);verifyPosition(decoder, text(
                "$GM203863071014445404T150715202258N55481576E03729275300000040530301#"));

    }finally{__CLR4_5_2khqkhqlwye68uo.R.flushNeeded();}}

}
