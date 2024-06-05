/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class XirgoProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lnklnklwydymmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,28079,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecodeNew() throws Exception {__CLR4_5_2lnklnklwydymmq.R.globalSliceStart(getClass().getName(),28064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d66d09lnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lnklnklwydymmq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lnklnklwydymmq.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.XirgoProtocolDecoderTest.testDecodeNew",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d66d09lnk() throws Exception{try{__CLR4_5_2lnklnklwydymmq.R.inc(28064);

        __CLR4_5_2lnklnklwydymmq.R.inc(28065);XirgoProtocolDecoder decoder = new XirgoProtocolDecoder(new XirgoProtocol());

        __CLR4_5_2lnklnklwydymmq.R.inc(28066);verifyPosition(decoder, text(
                "$$352054058132185,4001,2017/04/21,00:01:05,32.54659,-116.90670,143.2,0,0,0,598,0.0,12,0.9,765840,7.0,14.5,19,1,1,0011,8.5,63.2,5,21999,184,255,671,207,100,185##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28067);verifyPosition(decoder, text(
                "$$352054058132185,6011,2017/04/21,04:57:10,32.49658,-116.85957,250.9,0,0,0,602,0.0,12,0.8,765876,7.0,14.1,21,1,1,0011,10.1,0.0,5,170917890,280,255,627,0,100,167##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28068);verifyPosition(decoder, text(
                "$$355922061611345,6001,2016/08/25,20:10:51,51.13042,-114.22752,1197,44.7,0.0,0.0,2622,27,12,0.8,1,0.0,13.9,24,1,0,0.0,-70,-809,688##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28069);verifyPosition(decoder, text(
                "$$355922061611345,6001,2016/08/25,20:10:38,51.12948,-114.22637,1203,34.8,0.0,0.0,1377,215,12,0.8,1,0.0,13.8,28,1,0,0.0,-309,-566,754##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28070);verifyPosition(decoder, text(
                "$$354898045650537,6031,2015/02/26,15:47:26,33.42552,-112.30308,287.8,0,0,0,0,0.0,7,1.2,2,0.0,12.2,22,1,0,82.3"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28071);verifyPosition(decoder, text(
                "$$355922060162167,6015,2016/04/21,17:26:52,39.83267,-76.66139,230,0.0,0.0,0.0,779,0,8,1.2,0,0.0,13.0,19,1,1C4BJWDG4GL191009,X0z1-1137CD1,0402,3GATT,0,83.9,-70,-715,738##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28072);verifyPosition(decoder, text(
                "$$355922060162167,4002,2016/04/21,17:04:50,39.83253,-76.66102,232,0.0,0.0,0.0,0,0,12,1.2,0,0.0,9.2,15,1,0,0.0,35,-8,1059##"));

    }finally{__CLR4_5_2lnklnklwydymmq.R.flushNeeded();}}

    @Test
    public void testDecodeOld() throws Exception {__CLR4_5_2lnklnklwydymmq.R.globalSliceStart(getClass().getName(),28073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3871ulnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lnklnklwydymmq.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lnklnklwydymmq.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.XirgoProtocolDecoderTest.testDecodeOld",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3871ulnt() throws Exception{try{__CLR4_5_2lnklnklwydymmq.R.inc(28073);

        __CLR4_5_2lnklnklwydymmq.R.inc(28074);XirgoProtocolDecoder decoder = new XirgoProtocolDecoder(new XirgoProtocol());

        __CLR4_5_2lnklnklwydymmq.R.inc(28075);verifyPosition(decoder, text(
                "$$354660046140722,6001,2013/01/22,15:36:18,25.80907,-80.32531,7.1,19,165.2,11,0.8,11.1,17,1,1,3.9,2##"),
                position("2013-01-22 15:36:18.000", true, 25.80907, -80.32531));

        __CLR4_5_2lnklnklwydymmq.R.inc(28076);verifyPosition(decoder, text(
                "$$357207059646786,4003,2015/05/19,15:54:56,-20.21422,-70.14927,37.5,1.8,0.0,11,0.8,12.9,31,297,1,0,0.0,0.0,0,1,1,1##"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28077);verifyPosition(decoder, text(
                "$$354898045650537,6031,2015/02/26,15:47:26,33.42552,-112.30308,287.8,0,0,0,0,0.0,7,1.2,2,0.0,12.2,22,1,0,82.3"));

        __CLR4_5_2lnklnklwydymmq.R.inc(28078);verifyPosition(decoder, text(
                "$$357207059646786,4003,2015/05/19,15:55:27,-20.21421,-70.14920,33.6,0.4,0.0,11,0.8,12.9,31,297,1,0,0.0,0.0,0,1,1,1##"));

    }finally{__CLR4_5_2lnklnklwydymmq.R.flushNeeded();}}

}
