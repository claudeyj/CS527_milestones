/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TaipProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jdmjdmlx1e1oax{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,25125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jdmjdmlx1e1oax.R.globalSliceStart(getClass().getName(),25114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jdmjdmlx1e1oax.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jdmjdmlx1e1oax.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TaipProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjdm() throws Exception{try{__CLR4_5_2jdmjdmlx1e1oax.R.inc(25114);

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25115);TaipProtocolDecoder decoder = new TaipProtocolDecoder(new TaipProtocol(), false);

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25116);verifyPosition(decoder, text(
                ">REV451891352379+0307152+1016143700000012;SV=8;BL=4416;VO=8055;ID=356612026322000<"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25117);verifyPosition(decoder, text(
                ">RGP230615010248-2682523-065236820000003007F4101;ID=0005;#0002;*2A<"),
                position("2015-06-23 01:02:48.000", true, -26.82523, -65.23682));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25118);verifyPosition(decoder, text(
                ">RGP190805211932-3457215-058493640000000FFBF0300;ID=8251;#2122;*54<"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25119);verifyPosition(decoder, text(
                ">RPV00000+3739438-1220384601512612;ID=1234;*7F"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25120);verifyPosition(decoder, text(
                "\r\n>REV691615354941+3570173+1397742703203212;ID=Test"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25121);verifyPosition(decoder, text(
                ">REV481599462982+2578391-0802945201228512;ID=Test"),
                position("2010-09-02 17:29:42.000", true, 25.78391, -80.29452));
        
        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25122);verifyPosition(decoder, text(
                ">REV131756153215+3359479-0075299001031332;VO=10568798;IO=310;SV=10;BL=4190;CV09=0;AD=0;AL=+47;ID=356612021059680"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25123);verifyPosition(decoder, text(
                ">RPV02138+4555512-0735478000000032;ID=1005;*76<"));

        __CLR4_5_2jdmjdmlx1e1oax.R.inc(25124);verifyPosition(decoder, text(
                ">RPV19105+4538405-0739518900000012;ID=9999;*7A<\r\n"));

    }finally{__CLR4_5_2jdmjdmlx1e1oax.R.flushNeeded();}}

}
