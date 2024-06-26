/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class SiwiProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l3ll3llwye690g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,27354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l3ll3llwye690g.R.globalSliceStart(getClass().getName(),27345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l3ll3llwye690g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l3ll3llwye690g.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.SiwiProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl3l() throws Exception{try{__CLR4_5_2l3ll3llwye690g.R.inc(27345);

        __CLR4_5_2l3ll3llwye690g.R.inc(27346);SiwiProtocolDecoder decoder = new SiwiProtocolDecoder(new SiwiProtocol());

        __CLR4_5_2l3ll3llwye690g.R.inc(27347);verifyPosition(decoder, text(
                "$SIWI,9803932,23992,E,0,,0,1,1,0,5055,0,5,A,22.289887,70.807192,152,168,102922,090317,28,1,12,5,4098,1,0,13,0,0,0,1.0,3.1CHKS_4.82,0!"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27348);verifyPosition(decoder, text(
                "$SIWI,2845,1320,Q,10,airtelgprs.com,1,1,0,0,876578,43,9,A,19.0123456,72.65347,45,0,055929,071107,22,5,1,0,3700,1210,0,2500,1230,321,0,1.1,4.0,1!"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27349);verifyPosition(decoder, text(
                "$SIWI,9803849,953,R,9,,0,1,1,0,0,0,8,A,19.066145,73.002278,213,178,122738,210217,28,5,12,6,4066,1,0,2,0,0,0,1.0,3.1CHKS_4.82,0"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27350);verifyPosition(decoder, text(
                "$EIT,9803849,953,R,9,,0,1,1,0,0,0,8,A,19.066145,73.002278,213,178,122738,210217,28,5,12,6,4066,1,0,2,0,0,0,1.0,3.1CHKS_4.82,0"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27351);verifyPosition(decoder, text(
                "$SIWI,9803849,954,E,0,,0,1,1,0,0,0,0,V,0.000000,0.000000,0,0,122855,210217,29,5,12,5,4104,1,0,2,0,0,0,1.0,3.1CHKS_4.82,0"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27352);verifyPosition(decoder, text(
                "$SIWI,2845,1320,A,0,,1,1,0,0,876578,43,10,A,19.0123456,72.65347,45,0,055929,071107,22,5,1,0,3700,1210,0,2500,1230,321,0,1.1,4.0,1!"));

        __CLR4_5_2l3ll3llwye690g.R.inc(27353);verifyPosition(decoder, text(
                "$SIWI,9803849,956,E,0,,0,1,1,0,0,0,3,V,19.066935,73.003383,0,111,123037,210217,28,5,12,5,4071,1,0,2,0,0,0,1.0,3.1CHKS_4.82,0"));

    }finally{__CLR4_5_2l3ll3llwye690g.R.flushNeeded();}}

}
