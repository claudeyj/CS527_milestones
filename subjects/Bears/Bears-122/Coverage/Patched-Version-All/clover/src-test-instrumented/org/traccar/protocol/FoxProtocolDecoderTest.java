/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class FoxProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k7ok7olwye7iyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,26203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k7ok7olwye7iyf.R.globalSliceStart(getClass().getName(),26196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k7ok7olwye7iyf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k7ok7olwye7iyf.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.FoxProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk7o() throws Exception{try{__CLR4_5_2k7ok7olwye7iyf.R.inc(26196);

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26197);FoxProtocolDecoder decoder = new FoxProtocolDecoder(new FoxProtocol());

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26198);verifyPosition(decoder, text(
                "<fox><gps id=\"10\" data=\"51,A,010416,085317,4444.4158,N,02025.4466,E,1,182,,1110111111110111 141 0 0 0 0 0 10010000 10142,018C81851800009B\"/></fox>"));

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26199);verifyPosition(decoder, text(
                "<fox><gps id=\"90\" data=\"1092,V,010101,000004,0000.0000,N,00000.0000,E,0,0,,1111111111111111 123 0 0 0 0 0 00000000 47664,47664\"/></fox>"));

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26200);verifyPosition(decoder, text(
                "<fox><gps id=\"90\" data=\"31,V,110316,125952,0000.0000,N,00000.0000,E,0,0,,1111111111111111 123 0 0 0 0 0 00000000 47664,65 60 60 60 60 60 60 60 65 65 55 55 60 60 60 60 60 60 60 60 55 55 60 55 65 60 60 60 60 60 60 55\"/></fox>"));

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26201);verifyPosition(decoder, text(
                "<fox><gps id=\"90\" data=\"0,V,110316,130154,0000.0000,N,00000.0000,E,0,0,,1111111111111111 123 0 0 0 0 0 00000000 47664,47664 0\"/></fox>"));

        __CLR4_5_2k7ok7olwye7iyf.R.inc(26202);verifyPosition(decoder, text(
                "<fox><gps id=\"90\" data=\"0,A,110316,131834,4448.8355,N,02028.2021,E,0,217,,1111111111111111 123 0 0 0 0 0 00000000 50020,50020 0\"/></fox>"));

    }finally{__CLR4_5_2k7ok7olwye7iyf.R.flushNeeded();}}

}
