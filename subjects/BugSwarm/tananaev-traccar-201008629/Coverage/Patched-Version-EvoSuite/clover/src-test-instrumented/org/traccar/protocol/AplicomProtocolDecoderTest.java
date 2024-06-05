/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AplicomProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2iaziazlx1dzdwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iaziazlx1dzdwx.R.globalSliceStart(getClass().getName(),23723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iaziazlx1dzdwx.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iaziazlx1dzdwx.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AplicomProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiaz() throws Exception{try{__CLR4_5_2iaziazlx1dzdwx.R.inc(23723);

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23724);AplicomProtocolDecoder decoder = new AplicomProtocolDecoder(new AplicomProtocol());

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23725);verifyAttributes(decoder, binary(
                "48C1014143B4493145004900203F6D014B5557C20003000015060110FF00C800000000000000003D01141E283C500100260404010200000000000000000000000000C8000000000000010200110019001E0064019003E8"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23726);verifyAttributes(decoder, binary(
                "48c10144b9de54e6b2008700205f710a57d23ec957d23b8d00000000300d0106ff00000000000000000000000000000000000000000000000000000000000000010a141e28323c46505a646e7801000f020104ff000000000000000000010102000f020104ff000000000000000000010103000f020104ff000000000000000000010105000f020104ff0000000000000000000101"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23727);verifyAttributes(decoder, binary(
                "45c20145931876ffb2007100ffff6d00000057c6dd1970230d087b1f7d7f0000d0c1000000003580000035801f40ffff5001574442393036363035533132333435363700014142432d333435202020202020000000000000000000000000000000000000000000000001123130343632343639373030303030303100000000"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23728);verifyAttributes(decoder, binary(
                "45c20145931876ffb2007100ffff6d00000057c6dd9170250d087b1f7d7f0000d0c1000000003580000035801f40ffff5001574442393036363035533132333435363700014142432d333435202020202020000000000000000000000000000000000000000000000001123130343632343639373030303030303100000000"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23729);verifyAttributes(decoder, binary(
                "45c20145931876ffb2007100ffff6d00000057c6de0970270d087b1f7d7f0000d0c1000000003580000035801f40ffff5001574442393036363035533132333435363700014142432d333435202020202020000000000000000000000000000000000000000000000001123130343632343639373030303030303100000000"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23730);verifyAttributes(decoder, binary(
                "44c3014645e8ecff3c00ea03ffffbc00f457d68a6557d68a6303bb55fa018843da1100009881000000000000000000000000000000000000000000000000000000000000000000000000000000ff0056007600000000000000014542016d0001010095070e14014645e8ecff3c57d68a6403bb55fa018843dac0010d14ff050102030405060708090a0b0c0d0e0f10112a01010730343f3c1ff5cf01020700007d007d23010103022f2e01060c67452301efcdab8967452301010b10000000007d007d007d7dffffffffffff010a2400000000000000010000000000000000ffffffffffffffff00010001ffff00000000ffff010c02fec6"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23731);verifyPosition(decoder, binary(
                "44c3014645e8e91b66002300a21f0b01f056d3e62856d3e626031f845f00c6ee440800000000000000000017bd1cb30000"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23732);verifyPosition(decoder, binary(
                "44c3014645e8e91b66002300a21f0b00f056d3e64756d3e646031f845f00c6ee440800000000000000000017bd1cb30001"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23733);verifyPosition(decoder, binary(
                "44c3014645e8e91b66001f00221f0b01f456ba1e0d56ba1e0b031f842200c6ef550c000000000017bd1cb30004"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23734);verifyAttributes(decoder, binary(
                "44c3014645e8e9bada003e03fff7070055a4f24200000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff00000001000000000000000044c3014645e8e9bada003e03fff77bff55a4f24300000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff00300002000000000000000044c3014645e8e9bada003e03fff7690655a4f24500000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff003000030000000000000000"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23735);verifyPosition(decoder, binary(
                "44c3014645e8e9d29a002d0022ff6d00f455893b4d55893b4c027a7e1500189d710800009e0000000000000000000000023300000000000000009d"));
        
        __CLR4_5_2iaziazlx1dzdwx.R.inc(23736);verifyPosition(decoder, binary(
                "44C20146B710C158DA002100B09F0700C054CA0EA254CA0E9C03BE0BF6015D7069070000142A600000000000000001"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23737);verifyPosition(decoder, binary(
                "44C20143720729D6840043031fff7191C0450ef906450ef90603b20b8003b20b80066465b3870ce30f010ce30ce3003200001520000000030aa200003b13000000320300000bcb17acff0099000186a002"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23738);verifyPosition(decoder, binary(
                "440129D684002b0700C0450ef906450ef90603b20b8003b20b80066465b3870ce30f010ce30ce300003b130300000bcb170a"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23739);verifyPosition(decoder, binary(
                "44c3014645e8e9152e008900b09f7700f4558c07e8558c07e703be0bd8015d6faf0e0000003240000000000000000f4349460107010007558c07e70000000000000002d209df028f05fffe00000000000000002eff13fe11fe1a00011000000000000010ff11ff3cff11008c00080060f41b0043502015000000000000020d0000030d0000040c0000040d0000050c0000050d0000058c"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23740);verifyPosition(decoder, binary(
                "44c20144563508385a009500b09f7700c0555ea99e555ea9b103bb569f01883ff50b00002a30f000000000000013074349460108010007555ea99e000000000000003f0000ae017605b3ff00000000010000006700d900d500000003000000000000006700d900d500000087002500c4ff0000435020150000000040512001000000000000020d0000030d0000040c0000040d0000050c0000050d0000058c0000060c"));

        __CLR4_5_2iaziazlx1dzdwx.R.inc(23741);verifyPosition(decoder, binary(
                "44C20146B710C158DA009500B09F7700C054CA0EA454CA0EA403BE0BF6015D706B070000142A600000000000000002434946010801000754CA0EA4000000000000008400000000000000000000000000000000300000FE00FE0000000000000000000000000000000000000000000000000000000000000000000040502035000000000000020D0000030D0000040C0000040D0000050C0000050D0000058C0000060C"));

    }finally{__CLR4_5_2iaziazlx1dzdwx.R.flushNeeded();}}

}
