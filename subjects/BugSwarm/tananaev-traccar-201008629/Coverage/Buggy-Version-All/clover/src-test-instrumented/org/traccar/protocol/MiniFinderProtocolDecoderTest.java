/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class MiniFinderProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2j1yj1ylx1dxs64{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565139237L,8589935092L,24710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2j1yj1ylx1dxs64.R.globalSliceStart(getClass().getName(),24694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehj1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j1yj1ylx1dxs64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j1yj1ylx1dxs64.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MiniFinderProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehj1y() throws Exception{try{__CLR4_5_2j1yj1ylx1dxs64.R.inc(24694);

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24695);MiniFinderProtocolDecoder decoder = new MiniFinderProtocolDecoder(new MiniFinderProtocol());

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24696);verifyNothing(decoder, text(
                "!1,123456789012345"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24697);verifyNothing(decoder, text(
                "!5,17,V"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24698);verifyNothing(decoder, text(
                "!1,860719027585011"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24699);verifyPosition(decoder, text(
                "!D,28/11/16,00:04:09,42.926067,-85.747589,124,236,140001,179.8,60,11,16,0;"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24700);verifyPosition(decoder, text(
                "!C,30/1/16,1:1:6,31.259157,30.020910,0,0,100001,25.32,100,0.03,0.01,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24701);verifyPosition(decoder, text(
                "!A,26/10/12,00:28:41,7.770385,-72.215706,0.0,25101,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24702);verifyPosition(decoder, text(
                "!A,01/12/10,13:25:35,22.641724,114.023666,000.1,281.6,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24703);verifyPosition(decoder, text(
                "!D,08/07/15,04:01:32,40.428257,-3.704808,0,0,170001,701.7,22,5,14,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24704);verifyPosition(decoder, text(
                "!D,08/07/15,04:55:13,40.428257,-3.704932,0,0,180001,680.0,8,8,13,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24705);verifyPosition(decoder, text(
                "!D,08/07/15,02:01:32,40.428230,-3.704950,4,170,170001,682.7,43,6,13,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24706);verifyNothing(decoder, text(
                "!1,860719020212696"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24707);verifyPosition(decoder, text(
                "!D,22/2/14,13:40:58,56.899601,14.811541,0,0,1,176.0,98,5,16,0"),
                position("2014-02-22 13:40:58.000", true, 56.89960, 14.81154));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24708);verifyPosition(decoder, text(
                "!D,22/2/14,13:47:51,56.899517,14.811665,0,0,b0001,179.3,97,5,16,0"));

        __CLR4_5_2j1yj1ylx1dxs64.R.inc(24709);verifyPosition(decoder, text(
                "!D,3/7/13,6:35:30,22.645952,114.040436,0.0,225.8,1f0001,12.11,98,0,0,0"));

    }finally{__CLR4_5_2j1yj1ylx1dxs64.R.flushNeeded();}}

}
