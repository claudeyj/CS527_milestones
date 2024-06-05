/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;


public class AutoFonProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2k0ck0clwye43a8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384035522L,8589935092L,25941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k0ck0clwye43a8.R.globalSliceStart(getClass().getName(),25932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0ck0clwye43a8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0ck0clwye43a8.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AutoFonProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk0c() throws Exception{try{__CLR4_5_2k0ck0clwye43a8.R.inc(25932);

        __CLR4_5_2k0ck0clwye43a8.R.inc(25933);AutoFonProtocolDecoder decoder = new AutoFonProtocolDecoder(new AutoFonProtocol());

        __CLR4_5_2k0ck0clwye43a8.R.inc(25934);verifyNull(decoder, binary(
                "10556103592310314825728F"));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25935);verifyPosition(decoder, binary(
                "02080000251848470afa010262daa690013aa4046da83745f8812560df010001126a"));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25936);verifyPosition(decoder, binary(
                "111E00000000000000000100007101010B0C020302010B0C0005A053FFFFFFFF02010B0C00276047FFFFFFFF1F5600FA000176F218C7850C0B0B0C203A033DBD46035783EF009E00320014FFFF45"));

        //verifyPosition(decoder, binary(
        //        "12060000007501010B0C00089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF02007601010B0C00269CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF4A007601010B0C01089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF04007501010B0C01269CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFF80007601010B0C02089CFFFFFFFFFFFFFFFFFF0000000000000000000000000000000000000003E7FFFFA6007501010B0C02231F5600FA000176F218C70000000000000000000000000000000000000003E7FFFF9629"));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25937);verifyNull(decoder, binary(
                "41035151305289931441139602662095148807"));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25938);verifyNull(decoder, binary(
                "41032125656985547543619173484002123481"));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25939);verifyPosition(decoder, binary(
                "023E00001E004D411EFA01772F185285009C48041F1E366C2961380F26B10B00911C"),
                position("2010-01-27 04:00:08.000", true, 54.73838, 56.10343));

        __CLR4_5_2k0ck0clwye43a8.R.inc(25940);verifyPosition(decoder, binary(
                "023E00001E004D411EFA01772F185285009C48041F1E366C2961380F26B10B00911C"));

    }finally{__CLR4_5_2k0ck0clwye43a8.R.flushNeeded();}}

}
