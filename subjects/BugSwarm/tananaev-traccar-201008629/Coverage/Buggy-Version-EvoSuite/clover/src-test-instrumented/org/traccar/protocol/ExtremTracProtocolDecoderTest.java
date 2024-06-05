/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class ExtremTracProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ig4ig4lx1dvgxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,23916,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ig4ig4lx1dvgxu.R.globalSliceStart(getClass().getName(),23908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehig4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ig4ig4lx1dvgxu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ig4ig4lx1dvgxu.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.ExtremTracProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehig4() throws Exception{try{__CLR4_5_2ig4ig4lx1dvgxu.R.inc(23908);

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23909);ExtremTracProtocolDecoder decoder = new ExtremTracProtocolDecoder(new ExtremTracProtocol());

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23910);verifyPosition(decoder, text(
                "$GPRMC,862106020628733,050859.000,A,1404.8573,N,08710.9967,W,0.00,0,080117,0,,00C8,00218,99,,,,,,0.00"));

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23911);verifyPosition(decoder, text(
                "$GPRMC,10000000001,092313.299,A,2238.8947,N,11355.2253,E,0.00,311.19,010307,0,,"));

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23912);verifyPosition(decoder, text(
                "$GPRMC,00000000000,092244.000,A,0000.0000,S,00000.0000,E,0.00,0.00,101016,0,,8000,0"));

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23913);verifyNothing(decoder, text(
                "$GPRMC,092313.299,A,2238.8947,N,11355.2253,E,0.00,311.19,010307,0,,1111,1111"));

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23914);verifyNothing(decoder, text(
                "$GPRMC,092313.299,A,2238.8947,N,11355.2253,E,0.00,311.19,010307,0,,"));

        __CLR4_5_2ig4ig4lx1dvgxu.R.inc(23915);verifyNothing(decoder, text(
                "$GPRMC,100936.000,A,0000.0000,S,00000.0000,E,0.00,0.00,101016,0,,8000,0"));

    }finally{__CLR4_5_2ig4ig4lx1dvgxu.R.flushNeeded();}}

}
