/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class CarscopProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ic9ic9lx1dxrvt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,23778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ic9ic9lx1dxrvt.R.globalSliceStart(getClass().getName(),23769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehic9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ic9ic9lx1dxrvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ic9ic9lx1dxrvt.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CarscopProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehic9() throws Exception{try{__CLR4_5_2ic9ic9lx1dxrvt.R.inc(23769);

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23770);CarscopProtocolDecoder decoder = new CarscopProtocolDecoder(new CarscopProtocol());

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23771);verifyNothing(decoder, text(
                "*160618233129UB00HSO"));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23772);verifyNothing(decoder, text(
                "*160618232614UD00232614A5009.1747N01910.3829E0.000160618298.2811000000L000000"));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23773);verifyNothing(decoder, text(
                "*160618232529UB05CW9999C00000538232529A5009.1747N01910.3829E0.000160618298.2811000000L000000"));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23774);verifyPosition(decoder, text(
                "*040331141830UB05123456789012345061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"),
                position("2004-03-31 06:18:25.000", true, 29.56689, 106.45424));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23775);verifyPosition(decoder, text(
                "*040331141830UB04999999984061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23776);verifyPosition(decoder, text(
                "*040331141830UA012Hi-jack061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"));

        __CLR4_5_2ic9ic9lx1dxrvt.R.inc(23777);verifyPosition(decoder, text(
                "*150817160254UB05CC8011400042499160254A2106.8799S14910.2583E000.0150817158.3511111111L000000"));

    }finally{__CLR4_5_2ic9ic9lx1dxrvt.R.flushNeeded();}}

}
