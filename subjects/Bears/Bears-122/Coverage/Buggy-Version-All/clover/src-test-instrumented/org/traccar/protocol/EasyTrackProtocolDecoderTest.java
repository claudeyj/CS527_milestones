/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class EasyTrackProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k5nk5nlwydzsr0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,26138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k5nk5nlwydzsr0.R.globalSliceStart(getClass().getName(),26123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5nk5nlwydzsr0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5nk5nlwydzsr0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.EasyTrackProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk5n() throws Exception{try{__CLR4_5_2k5nk5nlwydzsr0.R.inc(26123);

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26124);EasyTrackProtocolDecoder decoder = new EasyTrackProtocolDecoder(new EasyTrackProtocol());

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26125);verifyPosition(decoder, text(
                "*ET,358155100054249,HB,A,100b06,053318,803a0b51,03d507c9,0017,0000,00400000,07,100,0000,1435,63"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26126);verifyNull(decoder, text(
                "*ET,358155100054249,MQ"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26127);verifyNull(decoder, text(
                "*ET,358155100054249,TX,A,100b06,053230"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26128);verifyPosition(decoder, text(
                "*ET,358155100054249,HB,A,100b06,053212,803a0b20,03d507a2,0054,0000,40400000,06,100,0000,1435,44"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26129);verifyNull(decoder, text(
                "*ET,135790246811221,GZ,0001,0005"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26130);verifyPosition(decoder, text(
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,0413FA4E,0000,0000,00000000,20,4,0000,00F123"),
                position("2010-09-13 16:28:13.000", true, 22.62689, 114.03021));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26131);verifyNull(decoder, text(
                "*ET,358155100048430,CC,0.0,V,100603,141817,80d77ae8,81ab1ffd,0000,6b08,40000000,19,99,0000,fa9,918"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26132);verifyPosition(decoder, text(
                "*ET,135790246811221,DW,A,050915,0C2A27,00CE5954,04132263,0000,0000,01000000,20,4,0000,001254"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26133);verifyPosition(decoder, text(
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,0413FA4E,0000,0000,00000000,20,4,0000,00F123,100"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26134);verifyPosition(decoder, text(
                "*ET,135790246811221,DW,A,0A090D,101C0D,00CF27C6,8413FA4E,0000,0000,00000000,20,4,0000,00F123,100"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26135);verifyPosition(decoder, text(
                "*ET,358155100003016,HB,A,0d081e,07381e,8038ee09,03d2e9be,004f,0000,40c00000,0f,100,0000,00037c,29"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26136);verifyPosition(decoder, text(
                "*ET,358155100003016,HB,A,0d081e,073900,8038ee2f,03d2e9fd,0114,0000,40c00000,12,100,0000,00037c,32"));

        __CLR4_5_2k5nk5nlwydzsr0.R.inc(26137);verifyPosition(decoder, text(
                "*ET,135790246811221,HB,A,050915,0C2A27,00CE5954,04132263,0000,0000,01000000,20,4,0000,00F123,100,200"));

    }finally{__CLR4_5_2k5nk5nlwydzsr0.R.flushNeeded();}}

}
