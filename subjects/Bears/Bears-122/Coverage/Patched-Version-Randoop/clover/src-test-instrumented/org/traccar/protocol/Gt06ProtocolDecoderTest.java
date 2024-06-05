/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gt06ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kj5kj5lwye68v5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,26660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kj5kj5lwye68v5.R.globalSliceStart(getClass().getName(),26609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kj5kj5lwye68v5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kj5kj5lwye68v5.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gt06ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkj5() throws Exception{try{__CLR4_5_2kj5kj5lwye68v5.R.inc(26609);

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26610);Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26611);verifyNull(decoder, binary(
                "787805120099abec0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26612);verifyNull(decoder, binary(
                "78780D01086471700328358100093F040D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26613);verifyNotNull(decoder, binary(
                "7878412c11030b011c1f013604cb8a00b17754cb8a00bef357cb8a00b73f5fcb8900b0e25fcb8900b6655fcb8a00b74960cb8a00b178620701001801eb40393800bbbde10d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26614);verifyNotNull(decoder, binary(
                "7878412c11030b012629013604cb8a00b17757cb8a00b73f5bcb8a00b7495ecb8900b0e25fcb8a00b1b9620000000000ff0000000000ffff01001801eb40393e00c0e6340d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26615);verifyPosition(decoder, binary(
                "787822221106160a1016c60278019407c7783800040001940504700046fc01030100065f570d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26616);verifyAttributes(decoder, binary(
                "797900143311070609020b00000000a0030046000109e4610d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26617);verifyAttributes(decoder, binary(
                "7979003e32110707083819000901fe0a060f006a1e3f24000000000000000000000000000000000000000000000000000000000000000000000000000000012116ba0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26618);verifyAttributes(decoder, binary(
                "7979007632110706090217000901fe0a060f006a1c2024060f0053a429060f006a1d21060f0053a720060f006f151d0000000000000000000000003844d9e7f7e1773d60e327a9e442405cf28628b9c640a42bb0fc0d0244d855a38c220a4c802aa8da7dab50b0e235ef32dd5348ee0ce77a52540000010a205a0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26619);verifyAttributes(decoder, binary(
                "7979006f210000000001426174746572793a352e3536562c4e4f524d414c3b20475052532a4c696e6b2055702047534d205369676e616c204c6576656c3a5374726f6e673b204750533a4f46463b2020204c4f434b3a4f46463b204254204d41433a4234413832383034343436323b007260880d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26620);verifyPosition(decoder, binary(
                "7979004a321106170c1b180cc900a875580b7ab4f00010350901fe0a007c0009112424007c000912240081004efe2100c500100f1200000000000000000000000000000000000000000000bc7c900d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26621);verifyNotNull(decoder, binary(
                "79790045321106170c1b13000901fe0a007c0009112424007c000912230081004efe1e00c500100f120000000000000000000000000000000000000710bef565574e37000000b26f140d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26622);verifyNull(decoder, binary(
                "787811010863586038760942a0010000010aa4000d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26623);verifyNull(decoder, binary(
                "78781f3511061a0b24330503107d06084889cb01000100000cfa20e3acd301333fcb0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26624);verifyPosition(decoder, binary(
                "78783c340000000011061809130c0903107d2408488a5800144c00000000000001940b00b1000047ff000000000500018f42210000000100050003010b69450d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26625);verifyPosition(decoder, binary(
                "78783c34000000001106190336070903107d51084889b900152e0000000043b101940b00b10000480100000000050001a3422100000001000300011bdc7b5f0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26626);verifyAttributes(decoder, binary(
                "78780a13c40604000201298f5b0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26627);verifyNotNull(decoder, binary(
                "78781f12110616091835d0024bb93007d3fb783dd4c501940500f2006c8504a6e0370d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26628);verifyPosition(decoder, binary(
                "787822221106160a1016c60278019407c7783800040001940504700046fc01030100065f570d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26629);verifyNotNull(decoder, binary(
                "7878661500000000004459443d537563636573732100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010009e82b0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26630);verifyAttributes(decoder, binary(
                "7979000894000000000338ba0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26631);verifyNull(decoder, binary(
                "79790020940a03516080825457290502194200448892980691312079088572f50004d4350d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26632);verifyPosition(decoder, binary(
                "7979007121000000000143757272656e7420706f736974696f6e214c61743a4e35342e3733393333322c4c6f6e3a4532352e3237333237302c436f757273653a3132362e35332c53706565643a302e303030302c4461746554696d653a323031372d30352d3236202031303a32373a3437000bbee30d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26633);verifyAttributes(decoder, binary(
                "7979003F940D110315102A202141494F494C2C30322C3030382E3239302C3032392E3630302C3531394A2C303430302C3030382E3433302C302C30302C4142001678EA0D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26634);verifyNull(decoder, binary(
                "79790005840016BB1A0D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26635);verifyAttributes(decoder, binary(
                "797900089400000002e852d70d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26636);verifyAttributes(decoder, binary(
                "7979000794050000c9b63e0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26637);verifyNotNull(decoder, binary(
                "78783b18100c0f1201010195271784005ab63617840002fa47178400ff8f4817840019f3491784005ab54b178400ff8e4c17840019f24cff0002012287c80d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26638);verifyPosition(decoder, binary(
                "7878251610051b0f1c34c5022515d504b5dcd20738080902d4022bdf009cba5006640201006759680d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26639);verifyNotNull(decoder, binary(
                "787866150000000000416c726561647920696e20746865207374617465206f66206675656c20737570706c7920746f20726573756d652c74686520636f6d6d616e64206973206e6f742072756e6e696e672100000000000000000000000000000000000001001981e50d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26640);verifyAttributes(decoder, binary(
                "78782d152500000000437574206f666620746865206675656c20737570706c793a2053756363657373210002013b898a0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26641);verifyAttributes(decoder, binary(
                "787829152100000000526573746f7265206675656c20737570706c793a2053756363657373210002014077ce0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26642);verifyNull(decoder, binary(
                "78780D01012345678901234500018CDD0D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26643);verifyNull(decoder, binary(
                "78780d0103534190360660610003c3df0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26644);verifyAttributes(decoder, binary(
                "78780a13440604000201baaf540d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26645);verifyAttributes(decoder, binary(
                "787825160F0C1D0A2B21C8027AC8040C46581000146F0901CC00287D001F714804040301001C84CF0D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26646);verifyPosition(decoder, binary(
                "78781f120f0a140e150bc505e51e780293a9e800540000f601006e0055da00035f240d0a"),
                position("2015-10-20 14:21:11.000", true, 54.94535, 24.01762));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26647);verifyPosition(decoder, binary(
                "787823120f081b121d37cb01c8e2cc08afd3c020d50201940701d600a1190041ee100576d1470d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26648);verifyPosition(decoder, binary(
                "78781F120B081D112E10CC027AC7EB0C46584900148F01CC00287D001FB8000380810D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26649);verifyPosition(decoder, binary(
                "787819100B031A0B1B31CC027AC7FD0C4657BF0115210001001CC6070D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26650);verifyPosition(decoder, binary(
                "787821120C010C0F151FCF027AC8840C4657EC00140001CC00287D001F720001000F53A00D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26651);verifyPosition(decoder, binary(
                "787825160B051B093523CF027AC8360C4657B30014000901CC00266A001E1740050400020008D7B10D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26652);verifyPosition(decoder, binary(
                "787819100e010903230ec803ae32a60653cded00180000020072feb70d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26653);verifyPosition(decoder, binary(
                "7878471e0e03110b0511c501c664fd074db73f0218a602e003433a002fed40433a0056e14e433a0056104e433a0056fd53433a002eed55433a007e4b57433a002ee25aff00020120f6720d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26654);verifyNull(decoder, binary(
                "7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002a3b240d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002d4f9b0d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234003084ff0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26655);verifyNull(decoder, binary(
                "78788b818300000000534545464e2626004f04220045042626262b37393035343031353534362626262626260410041b0415041a04210415041926262b373930363433333031313526260410043d044f26262b373936303437383430363426260412043e0432043026262b373932383834373738383126262626262626262626262626262626232300020022155d0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26656);verifyPosition(decoder, binary(
                "787822220e0914160f07c9021a362805090a7800d8b802d402c30e00a98a0105010213f4bb0d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26657);verifyNull(decoder, binary(
                "787811010864717003664467100f190a0002c6d20d0a"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26658);verifyNull(decoder, binary(
                "787811010123456789012345100B3201000171930D0A"));

        __CLR4_5_2kj5kj5lwye68v5.R.inc(26659);verifyNull(decoder, binary(
                "78780d1f000000000000000200b196a20d0a"));

    }finally{__CLR4_5_2kj5kj5lwye68v5.R.flushNeeded();}}

}
