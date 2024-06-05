/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GotopProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ionionlx1e1o2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,24224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ionionlx1e1o2v.R.globalSliceStart(getClass().getName(),24215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehion();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ionionlx1e1o2v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ionionlx1e1o2v.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GotopProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehion() throws Exception{try{__CLR4_5_2ionionlx1e1o2v.R.inc(24215);

        __CLR4_5_2ionionlx1e1o2v.R.inc(24216);GotopProtocolDecoder decoder = new GotopProtocolDecoder(new GotopProtocol());

        __CLR4_5_2ionionlx1e1o2v.R.inc(24217);verifyNothing(decoder, text(
                ""));
        
        __CLR4_5_2ionionlx1e1o2v.R.inc(24218);verifyNothing(decoder, text(
                "353327020412763,CMD-X"));

        __CLR4_5_2ionionlx1e1o2v.R.inc(24219);verifyPosition(decoder, text(
                "013226009991924,CMD-T,A,DATE:130802,TIME:153721,LAT:25.9757433S,LOT:028.1087816E,Speed:000.0,X-X-X-X-81-26,000,65501-00A0-4B8E"));

        __CLR4_5_2ionionlx1e1o2v.R.inc(24220);verifyPosition(decoder, text(
                "353327020115804,CMD-T,A,DATE:090329,TIME:223252,LAT:22.7634066N,LOT:114.3964783E,Speed:000.0,84-20,000"),
                position("2009-03-29 22:32:52.000", true, 22.76341, 114.39648));

        __CLR4_5_2ionionlx1e1o2v.R.inc(24221);verifyPosition(decoder, text(
                "353327020115804,CMD-T,A,DATE:090329,TIME:223252,LAT:22.7634066N,LOT:114.3964783E,Speed:000.0,1-1-0-84-20,000"));
        
        __CLR4_5_2ionionlx1e1o2v.R.inc(24222);verifyPosition(decoder, text(
                "353327020412763,CMD-F,V,DATE:140125,TIME:183636,LAT:51.6384466N,LOT:000.2863866E,Speed:000.0,61-19,"));

        __CLR4_5_2ionionlx1e1o2v.R.inc(24223);verifyPosition(decoder, text(
                "013949008891817,CMD-F,A,DATE:150225,TIME:175441,LAT:50.000000N,LOT:008.000000E,Speed:085.9,0-0-0-0-52-31,000,26201-1073-1DF5"));

    }finally{__CLR4_5_2ionionlx1e1o2v.R.flushNeeded();}}

}
