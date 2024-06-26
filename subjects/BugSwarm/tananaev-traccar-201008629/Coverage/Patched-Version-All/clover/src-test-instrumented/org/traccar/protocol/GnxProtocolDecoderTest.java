/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GnxProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2inxinxlx1e1o2p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,24196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2inxinxlx1e1o2p.R.globalSliceStart(getClass().getName(),24189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehinx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2inxinxlx1e1o2p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2inxinxlx1e1o2p.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GnxProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehinx() throws Exception{try{__CLR4_5_2inxinxlx1e1o2p.R.inc(24189);

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24190);GnxProtocolDecoder decoder = new GnxProtocolDecoder(new GnxProtocol());

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24191);verifyPosition(decoder, text(
                "$GNX_MIF,865733022354161,143,0,172642,180316,172642,180316,1,13.034581,N,080.234521,E,0,05396274,ROUTE_2#########,Deo ############,GNX04008,B0*"));

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24192);verifyPosition(decoder, text(
                "$GNX_LOC,865733022352132,095,0,102134,280914,102134,280914,1,18.765432,N,073.752811,W,032,165.32,12,25,0,A,E,2,000099.9,000099.5,GNX01001,12*"));

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24193);verifyNothing(decoder, text(
                "$GNX_LOC,865733022354161,139,0,142838,160316,142825,160316,0,000000000,N,0000000000,E,000,0.00,00,48,0,e,C,2,000000.0,000000.0,GNX04008,BB*"));

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24194);verifyPosition(decoder, text(
                "$GNX_DIO,863071015071563,110,1,155627,121214,151244,121214,1,08.878321,N,076.643154,E,0,0,0,0,0,0,GNX01001,B1*"));

        __CLR4_5_2inxinxlx1e1o2p.R.inc(24195);verifyNothing(decoder, text(
                "$GNX_DIO,865733022354161,112,1,142849,160316,142714,160316,0,000000000,N,0000000000,E,0,0,0,0,0,0,0,GNX04008,1A*"));

    }finally{__CLR4_5_2inxinxlx1e1o2p.R.flushNeeded();}}

}
