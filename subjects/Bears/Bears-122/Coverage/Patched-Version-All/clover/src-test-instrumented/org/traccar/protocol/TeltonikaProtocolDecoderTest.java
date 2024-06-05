/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Ignore;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class TeltonikaProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l8fl8flwye7j8t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,27543,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l8fl8flwye7j8t.R.globalSliceStart(getClass().getName(),27519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l8fl8flwye7j8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l8fl8flwye7j8t.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TeltonikaProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl8f() throws Exception{try{__CLR4_5_2l8fl8flwye7j8t.R.inc(27519);

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27520);TeltonikaProtocolDecoder decoder = new TeltonikaProtocolDecoder(new TeltonikaProtocol(), false);

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27521);verifyNull(decoder, binary(
                "000F313233343536373839303132333435"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27522);verifyPositions(decoder, false, binary(
                "0000000000000401080e0000015d12cc211000fadaf627186742f5000d0048080006000a040100f001500515000342318a430fe344000003c700000000f1000068b61000001b05000000015d12c6683800fadaf72118673f82000000000000000007030100f00050040342318a430fe344000001f1000068b6000000015d12bd407800fadaf72118673f82000000000000000007030100f000500403423179430fe144000001f1000068b6000000015d12b414d000fadaf72118673f82000400900c0000fa120a0100f00050051502080007010552090e6f4bfa000542316a430fe14400000600006202b203c700002328f1000068b61000001b05000000015d12b3074800fadaf2821867436a000400890d00170011090100f00150011502081007010553090e6f4d054231fb430fe14400000603ae6202a003c700002328f1000068b61000001b05000000015d12b2ff7800fadaee89186747c60005009a0d001d0011090100f00150011502081b07010553090e6f4d05423125430fe144000006050862029e03c700002328f1000068b61000001b05000000015d12b2e42000fadae8cf18675e0a000300a60d00210011090101f00150011502082407030554090e6f4d0542310a430fe14400000606cf62029703c700002328f1000068b61000001b05000000015d12b2d48000fadae05818676a16000400930c00240011090100f00150011502082207010554090e6f4e05423738430fe144000006066a62029303c700002328f1000068b61000001b05000000015d12b2a1b800fadac33e18678e48000600940d00150011090101f00150051500081907030553090e6f4e054239cc430fe14400000607c662028603c700002328f1000000001000001b05000000015d12b29dd000fadac19d18678fc8000700820d00110011090100f00150051500081607030553090e6f4e054238c8430fe14400000606d962028503c700002328f1000000001000001b05000000015d12b299e800fadabfa9186790e3000700670d00110011090101f00150051500081407030553090e6f4e054231e5430fe144000006060a62028403c700002328f1000000001000001b05000000015d12b2960000fadabd4018679104000600510d00120011090101f00150051500081207030553090e6f4e054231ce430fe144000006057062028303c700002328f1000000001000001b05000000015d12b27aa800fadaa96518678b7c000600470d00120011090101f00150051500081807030551090e6f4e05423a70430fe144000006074462027c03c700002328f1000000001000001b05000000015d12b276c000fadaa73f18678ae60006003b0d000e0011090101f00150051500081607030551090e6f4e05423a5a430fe14400000606b762027b03c700002328f1000000001000001b05000e000007a4"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27523);verifyPositions(decoder, false, binary(
                "00000000000002cb08080000015a71ccbec00002fc9bfc1e53a1e00016004cf80005001914150216056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d20003480100c6000ac500ce02c80000654ec700004ee8000000015a725aaac80002fc933c1e539d4000150049f80000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f4c6000ac500ce02c80000654ec700004ee8000000015a75a42c900002fc97d01e539640001d0008020000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80006ba5ac700004ee8000000015a75a440180002fc931c1e539b60001d00b9020001001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800fac6000ac500ce02c80006ba5ac700004ee8000000015a75a453a00002fc93601e539cc0001d015d0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a467280002fc93801e539cc0001d013c0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a47ab00002fc92cc1e539c80001d00b00c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c60004c5000a02c800003085c70006ba5a000000015a75a48e380002fc92ec1e539c40001d00410c0000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80000c83dc700004ee800080000e0b2"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27524);verifyPositions(decoder, false, binary(
                "0000000000000000080100000113fc208dff00209cca800f14f650006f00d60400040004030101150316030001460000015d000100000000")); // invalid length and checksum

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27525);verifyPositions(decoder, false, binary(
                "000000000000009f080400000159738f76b8012e13b796110ab27600d700000b00004e01000000014e000000000000000000000159738f6ee8012e13b796110ab27600d700000a00004e01000000014e01000b00791c179300000159738f6b00012e13b796110ab27600d700000a00004e01000000014e000000000000000000000159738f5f48012e13b796110ab27600d700000b00004e01000000014e01000b00791c17930400009671"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27526);verifyPositions(decoder, false, binary(
                "00000000000000710c0106000000694154244d5347534e443d342c225354474234302c50522c3335363630313036303236353035302c313630343232313531372c313630343232313531382c432c2b3032332e332c302c2b3032332e312c302c4445414354492c302c4445414354492c302c312c30220d0a010000d8db"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27527);verifyPositions(decoder, false, binary(
                "0000000000000055070450aa14320201f00150aa17f3031f42332a4c4193d68c008d00020901f00150aa1b6a031f423383f54193624f009d00000a01f00150aa1c230fc01a0000552b040164f400dd00f0010143100c0105000000050400006846"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27528);verifyPositions(decoder, binary(
                "000000000000003508010000014f8e016420002141bbaf0f4e96a7fffa0000120000000602010047030242669c92000002c7000000009100000000000100002df3"));
        
        __CLR4_5_2l8fl8flwye7j8t.R.inc(27529);verifyPositions(decoder, binary(
                "00000000000000A7080400000113fc208dff000f14f650209cca80006f00d60400040004030101150316030001460000015d0000000113fc17610b000f14ffe0209cc580006e00c00500010004030101150316010001460000015e0000000113fc284945000f150f00209cd200009501080400000004030101150016030001460000015d0000000113fc267c5b000f150a50209cccc0009300680400000004030101150016030001460000015b00040000"));
        
        __CLR4_5_2l8fl8flwye7j8t.R.inc(27530);verifyPositions(decoder, binary(
                "000000000000014708060000013e5a60a4cb003fa7b780fc424518004200000a000000090501010200b300b400f000034268a746011818000001c700000000000000013e5dc8ba28003fa7c080fc4246040001000005000000090501010200b300b400f001034268b44600ef18000001c700000000000000013e5dc90455003fa7b640fc424388003a0000070000f0090501010200b300b400f000034268dc4600f718000001c70000001d000000013e5dc9d368003fa7b800fc4244300049000004000000090501010200b300b400f001034267de46010718000001c700000000000000013e5dca311d003fa7b680fc4243cc00420000070000f0090501010200b300b400f0000342685346010b18000001c700000000000000013e5dcfafe9003fa7b600fc4242f0003d000008000000090501010200b300b400f0000342685246011918000001c700000000000600000275"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27531);verifyPositions(decoder, binary(
                "000000000000002c08010000013eff8d6f9800173295002111f400008100ae0b0000000401010003090016432980422f7200000100007a5d"));
        
        __CLR4_5_2l8fl8flwye7j8t.R.inc(27532);verifyPositions(decoder, binary(
                "00000000000000c7070441bf9db00fff425adbd741ca6e1e009e1205070001030b160000601a02015e02000314006615000a160067010500000ce441bf9d920fff425adbb141ca6fc900a2b218070001030b160000601a02015e02000314006615000a160067010500000cc641bf9d740fff425adbee41ca739200b6c91e070001030b1f0000601a02015f02000314006615000a160066010500000ca841bf9cfc0fff425adba041ca70c100b93813070001030b1f0000601a02015f02000314002315000a160025010500000c3004000000"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27533);verifyPositions(decoder, binary(
                "000000000000003107024c61410b013f4231c2c141d0beb9003d000005006483ff4c6140eb013f4231c2c141d0beb9003d000005006483ff02000041df"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27534);verifyPositions(decoder, binary(
                "000000000000002b080100000140d4e3ec6e000cc661d01674a5e0fffc00000900000004020100f0000242322318000000000100007a04"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27535);verifyPositions(decoder, false, binary(
                "000000000000002d0c01060000002523464d323d3236323033323736313732313339362c32363230332c30372e30322e30350d0a0100009a2e"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27536);verifyPositions(decoder, binary(
                "00000000000000a608010000013f14a1d1ce000f0eb790209a778000ab010c0500000000000000000100003390"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27537);decoder.setExtended(true);

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27538);verifyPositions(decoder, false, binary(
                "0000000000000158080b0000015d4b4dc07a00d5dbd13eec04324e020e0000120000000000000000000000015d4b4cd5e800d5dbd13eec04324e020e0000120000000000000000000000015d4b4beb8800d5dbd13eec04324e020e0000130000000000000000000000015d4b4b012800d5dbd13eec04324e020e0000120000000000000000000000015d4b4a16c800d5dbd13eec04324e020f0000110000000000000000000000015d4b492c6800d5dbd13eec04324e020f0000110000000000000000000000015d4b48420800d5dbd13eec04324e020f0000120000000000000000000000015d4b4757a800d5dbd13eec04324e020f00000f0000000000000000000000015d4b466d4800d5dbd13eec04324e020f0000100000000000000000000000015d4b4582e800d5dbd13eec04324e020f0000110000000000000000000000015d4b44988800d5dbd13eec04324e020f0000110000000000000000000b0000ec10"));

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27539);verifyPositions(decoder, false, binary(
                "00000000000003b5080b0000015ab5642a8800d5db1769ec01d70a020a00e3040004000e0501010200030004006000060900100a00010b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab5642e7000d5db178aec01d6d6020a0070040003000e0501010200030004006000060900100a00000b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab567050000d5db1805ec01da3c02060101040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000046f7000000000001cb000000000000000000000000000000000000015ab56708e800d5db1723ec01d9ec020600e5040006000e05010102000300040060000609000f0a00010b0000130000422f1018000502c700000003f7000000000001cb000000000000000000000000000000000000015ab5685cc000d5db20f7ec01d8fa02080033050007000e05010102000300040060000609000f0a00010b0000130000422f0a18000502c700000030f7000000000001cb000000000000000000000000000000000000015ab5693b6800d5db2367ec01d9430211011b040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000027f7000000000001cb000000000000000000000000000000000000015ab569433800d5db1fb2ec01d9310211008b040006000e0501010200030004006000060900110a00000b0000130000422f1318000402c700000009f7000000000001cb000000000000000000000000000000000000015ab56a0e5800d5db22a2ec01da5502100041050007000e05010102000300040060000609000f0a00000b0000130000422f1118000602c70000000ef7000000000001cb000000000000000000000000000000000000015ab56a700000d5db2afcec01ddb2020a0012050008000e05010102000300040060000609000e0a00000b0000130000422f0918000502c700000026f7000000000001cb000000000000000000000000000000000000015ab56a73e800d5db2ad8ec01de65020a014e050008000e05010102000300040060000609000f0a00010b0000130000422f0818000702c700000002f7000000000001cb000000000000000000000000000000000000015ab56a7bb800d5db2971ec01e00e020a013f040008000e0501010200030004006000060900100a00020b0000130000422f0b18000802c700000004f7000000000001cb000000000000000000000000000000000b00007c5f"));

    }finally{__CLR4_5_2l8fl8flwye7j8t.R.flushNeeded();}}

    @Ignore
    @Test
    public void testDecodeConnectionless() throws Exception {__CLR4_5_2l8fl8flwye7j8t.R.globalSliceStart(getClass().getName(),27540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yeww6al90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l8fl8flwye7j8t.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l8fl8flwye7j8t.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TeltonikaProtocolDecoderTest.testDecodeConnectionless",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yeww6al90() throws Exception{try{__CLR4_5_2l8fl8flwye7j8t.R.inc(27540);

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27541);TeltonikaProtocolDecoder decoder = new TeltonikaProtocolDecoder(new TeltonikaProtocol(), true);

        __CLR4_5_2l8fl8flwye7j8t.R.inc(27542);verifyPositions(decoder, false, binary(
                "0049cafe0122000f33353734353430373237313339373508010000015d3766f6a800003eef961ec6215e0063006d09003100070401000200f001c8000242381c18003201c7000000e10001"));

    }finally{__CLR4_5_2l8fl8flwye7j8t.R.flushNeeded();}}

}
