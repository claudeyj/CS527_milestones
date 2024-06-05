/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class CguardProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k42k42lwye68pa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k42k42lwye68pa.R.globalSliceStart(getClass().getName(),26066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k42k42lwye68pa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k42k42lwye68pa.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CguardProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk42() throws Exception{try{__CLR4_5_2k42k42lwye68pa.R.inc(26066);

        __CLR4_5_2k42k42lwye68pa.R.inc(26067);CguardProtocolDecoder decoder = new CguardProtocolDecoder(new CguardProtocol());

        __CLR4_5_2k42k42lwye68pa.R.inc(26068);verifyNull(decoder, text(
                "IDRO:354868050655283"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26069);verifyPosition(decoder, text(
                "NV:170409 031456:56.808553:60.595476:0:NAN:0"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26070);verifyAttributes(decoder, text(
                "BC:170409 031456:CSQ1:64:NSQ1:17:PWR1:0"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26071);verifyPosition(decoder, text(
                "NV:161007 122043:55.812730:37.733689:3.62:NAN:244.05:143.4"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26072);verifyPosition(decoder, text(
                "NV:161007 122044:55.812732:37.733670:3.97:NAN:260.95:143.9"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26073);verifyAttributes(decoder, text(
                "BC:161007 122044:CSQ1:77:NSQ1:18:BAT1:100"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26074);verifyPosition(decoder, text(
                "NV:160711 044023:54.342907:48.582590:0:NAN:0:110.1"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26075);verifyPosition(decoder, text(
                "NV:160711 044023:54.342907:-148.582590:0:NAN:0:110.1"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26076);verifyAttributes(decoder, text(
                "BC:160711 044023:CSQ1:48:NSQ1:7:NSQ2:1:BAT1:98:PWR1:11.7:CLG1:NAN"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26077);verifyAttributes(decoder, text(
                "BC:160711 044524:CSQ1:61:NSQ1:18:BAT1:98:PWR1:11.7:CLG1:NAN"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26078);verifyNull(decoder, text(
                "VERSION:3.3"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26079);verifyPosition(decoder, text(
                "NV:160420 101902:55.799425:37.674033:0.94:NAN:213.59:156.6"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26080);verifyAttributes(decoder, text(
                "BC:160628 081024:CSQ1:32:NSQ1:10:BAT1:100"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26081);verifyAttributes(decoder, text(
                "BC:160628 081033:NSQ2:0"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26082);verifyPosition(decoder, text(
                "NV:160630 151537:55.799913:37.674267:0.7:NAN:10.21:174.9"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26083);verifyAttributes(decoder, text(
                "BC:160630 153316:BAT1:76"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26084);verifyAttributes(decoder, text(
                "BC:160630 153543:NSQ2:0"));

        __CLR4_5_2k42k42lwye68pa.R.inc(26085);verifyNull(decoder, text(
                "PING"));

    }finally{__CLR4_5_2k42k42lwye68pa.R.flushNeeded();}}

}
