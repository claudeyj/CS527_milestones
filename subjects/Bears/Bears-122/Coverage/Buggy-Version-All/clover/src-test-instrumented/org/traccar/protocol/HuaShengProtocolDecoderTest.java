/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class HuaShengProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kojkojlwydzsxn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,26814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kojkojlwydzsxn.R.globalSliceStart(getClass().getName(),26803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kojkojlwydzsxn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kojkojlwydzsxn.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.HuaShengProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkoj() throws Exception{try{__CLR4_5_2kojkojlwydzsxn.R.inc(26803);

        __CLR4_5_2kojkojlwydzsxn.R.inc(26804);HuaShengProtocolDecoder decoder = new HuaShengProtocolDecoder(new HuaShengProtocol());

        __CLR4_5_2kojkojlwydzsxn.R.inc(26805);verifyNull(decoder, binary(
                "c000000077aa0200000000000e000100143347315f48312e315f56312e30372e54000300133335353835353035303434303635380004000b3531323030303000050005010006000400070004000800050000090018383936313032353431343533333239313833360d000a000f796573696e7465726e6574c0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26806);verifyPosition(decoder, binary(
                "c00000004baa0000000000000f8000000031363130323030373236333600e6d4f9ffcc78c700000022003600000001001500000000000000000000059bffffffffff0005000a040300000253c0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26807);verifyPosition(decoder, binary(
                "c00000004baa000000000000098000000031363130303732323236343700e6d4efffcc789f000000000026000000010015000000000000000000000488ffffffffff0005000a10060000008dc0"));

        /*verifyPosition(decoder, binary(
                "c00000004baa0000000000000aa5a5a55a3f008000000031363130303732333139343600e61e4fffcc33fe0000000000470000000100150000000000000000000004b4ffffffffff0005000ac0"));*/

        __CLR4_5_2kojkojlwydzsxn.R.inc(26808);verifyPosition(decoder, binary(
                "c00000004baa000000000000098000000031363130303732323236343700e6d4efffcc789f000000000026000000010015000000000000000000000488ffffffffff0005000a10060000008dc0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26809);verifyPosition(decoder, binary(
                "c00000004baa00000000000005c400000131363037303630323537303800e6c82effcc7cb0003900a30089000000010015000000000000000000f20559ff577ce3980005000a060500000087c0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26810);verifyNull(decoder, binary(
                "c0010c003e0002000000000010020012a0014f42445f3347315f56312e302e330013a0043335353835353035303434303635380006a08701000006a0a1035fc0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26811);verifyNull(decoder, binary(
                "c0010c00120060000000000004000600010100c0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26812);verifyNull(decoder, binary(
                "C00000007EAA020000000000010001001047315F48312E305F56312E3000030013383632393530303238353334333036000400144C342D56374C673979497A7A2D724A6D0005000501000600084341524400070008434152440008000500000900183839383630303530313931343436313130393134000A0009434D4E4554C0"));

        __CLR4_5_2kojkojlwydzsxn.R.inc(26813);verifyPosition(decoder, binary(
                "C000000041AA00000000000030C000000031353035323630373538323800ADDCC100226AEF0000000000120005000100151206EF0504E99975002903EB80556492CEC0"));

    }finally{__CLR4_5_2kojkojlwydzsxn.R.flushNeeded();}}

}
