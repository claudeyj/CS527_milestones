/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class MaestroProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2iy8iy8lx1dvh4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,24567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iy8iy8lx1dvh4j.R.globalSliceStart(getClass().getName(),24560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iy8iy8lx1dvh4j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iy8iy8lx1dvh4j.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MaestroProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiy8() throws Exception{try{__CLR4_5_2iy8iy8lx1dvh4j.R.inc(24560);

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24561);MaestroProtocolDecoder decoder = new MaestroProtocolDecoder(new MaestroProtocol());

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24562);verifyPosition(decoder, text(
                "@353893040202807,705,UPV-02,1,13.2,17,0,0,16/09/11,11:42:49,0.352705,32.647918,1210.5,0.000000,35.33,11,0.8,0.000,0!\0"));

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24563);verifyPosition(decoder, text(
                "@353893040202807,705,UPV-02,1,13.4,18,0,0,16/09/11,11:43:30,0.352808,32.647990,1211.0,0.000000,80.96,11,0.8,0.000,0!\0"));

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24564);verifyPosition(decoder, text(
                "@353893040202807,601,UPV-02,0,13.4,10,0,0,16/11/04,17:21:14,0.352793,32.647927,0,0,0,0,99,0.000,0!\0"));

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24565);verifyPosition(decoder, text(
                "@123451234512345,531,M2MGTW,1,12.5,30,0,0,11/10/10,09:09:09,22.222222,114.141414,45.6,0.0,160.0,8,1,20!"));

        __CLR4_5_2iy8iy8lx1dvh4j.R.inc(24566);verifyPosition(decoder, text(
                "@123451234512345,702,M2MGTW,1,14.7,30,0,1,11/10/10,09:09:09,22.222222,114.141414,45.6,25.12,160.0,8,1,25!"));

    }finally{__CLR4_5_2iy8iy8lx1dvh4j.R.flushNeeded();}}

}
