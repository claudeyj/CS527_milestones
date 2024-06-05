/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class GalileoProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ikiikilx1dze1v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,24073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ikiikilx1dze1v.R.globalSliceStart(getClass().getName(),24066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ikiikilx1dze1v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ikiikilx1dze1v.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GalileoProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiki() throws Exception{try{__CLR4_5_2ikiikilx1dze1v.R.inc(24066);

        __CLR4_5_2ikiikilx1dze1v.R.inc(24067);GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());

        __CLR4_5_2ikiikilx1dze1v.R.inc(24068);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0144030338363832303430303132363939333404320010ee0f20f5a86c57300570172f03bc7dfd023363002604343e00351c40092a414a6842af0e432445000046030050246b51666a524c055300000338363832303430303132363939333404320010ed0f20f4a86c57300570172f03b47dfd023363000d05343e00351140090a41c56742a60e432445000046030050b56a514f6a521b045300000338363832303430303132363939333404320010ec0f20e6a86c57300b34172f03287efd023300000000344900350d40290a41562742030b43234500004603205023455190445295005300000338363832303430303132363939333404320010eb0f20e4a86c57300b34172f03287efd023300000000344900350d40290b41000042bd0b432345000046032050dc31518c315200005300000338363832303430303132363939333404320010ea0f20c7a86c57300b34172f03287efd023300000000344900350d40a90b41000042050d43234500004600205000005100005200005300000338363832303430303132363939333404320010e90f204fa86c57300b34172f03287efd023300000000344900350d40a90b41000042ff0c43244500004600205000005100005200005300000338363832303430303132363939333404320010e80f20d7a76c57300b34172f03287efd023300000000344900350d40a90b41000042fd0c43244500004600205000005100005200005300000338363832303430303132363939333404320010e70f205fa76c57300b34172f03287efd023300000000344900350d40a90b41000042fd0c43254500004600205000005100005200005300000338363832303430303132363939333404320010e60f20e7a66c57300b34172f03287efd023300000000344900350d40a90b41000042fd0c43264500004600205000005100005200005300000338363832303430303132363939333404320010e50f206fa66c57300468172f03907cfd023300007a0a343600352b40a90b41000042030d43274500004600205000005100005200005300000338363832303430303132363939333404320010e40f2051a66c5730048c172f03ac7cfd02335300980a341600352b40a12b41000042040d43274500004600e0500000510000520000530000abde"));

        __CLR4_5_2ikiikilx1dze1v.R.inc(24069);verifyNothing(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "011380033836383230343030313534393038370432008590"));
        
        __CLR4_5_2ikiikilx1dze1v.R.inc(24070);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01cf030446ba10630320a7054c533008f86c8e0310062c043347049e02344000350940013241506b428f10432244aeea572045f9004604a0500000510000529a6b5300000446ba10712420ce1c4b533009b4f06703043df4033381037b0a343800350a40093241db6b428f10432544c05ef81f45f9004604a050000051000052886b5300000446ba10702420c11c4b53300a54f16703c450f403336e034e0a343900350840093241dd6b428f1043254491eaf71f45f9004604a050000051000052c26b5300000446ba106f2420b31c4b53300cecf267033865f403336a03300a343800350740093241e66b429010432544b446582045f9004604a050000051000052f76b5300000446ba106e2420a61c4b53300c9cf467038878f403337b03370a343800350740093241b56b428f10432544ba46f81f45f9004604a050000051000052c66b5300000446ba106d2420991c4b53300bc8f56703508cf403338d036e0a343700350840093241d66b428f10432544b4ea572045f9004604a050000051000052846b5300000446ba106c24208c1c4b533008c8f5670370a0f403338703920a343a00350e40093241c76b428f10432544c0fef71f45f9004604a0500000510000528d6b5300000446ba106b24207f1c4b533009a4f5670338b4f403337603920a343c00350a40093241d06b428f104325449146a81f45f9004604a0500000510000528a6b5300000446ba106a2420721c4b53300b9cf56703ecc7f403337103810a343a00350840093241ca6b428f10432544d12e582045f9004604a050000051000052996b5300000446ba10692420651c4b53300a64f6670358dbf403337a03490a343900350840093241e56b429010432544aed2f71f45f9004604a050000051000052b26b5300000446ba10682420581c4b5330094cf86703e0eef4033381030c0a343a00350940093241f96b428f10432544cb2e182145f9004604a050000051000052926b5300000446ba106724204b1c4b533009f8fa67032802f503337b03fc09343b00350a40093241d86b428f10432544c0ea772145f9004604a0500000510000529e6b5300000446ba106624203e1c4b533009a0fd67036815f503338403fd09343c00350a40093241a86b428f10432544ae2e582045f9004604a050000051000052a86b5300000446ba10652420311c4b53300944006803b028f503338003ff09343d00350940093241dc6b428e10432544a8fea71f45f9004604a050000051000052e26b5300000446ba10642420241c4b533008f0026803083cf503338b03f909343c00350d40093241d36b428f10432544c0eaa71f45f9004604a050000051000052ab6b530000ff3f"));
        
        __CLR4_5_2ikiikilx1dze1v.R.inc(24071);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "011e8304320010270220dbd2f051300a90cf740328ac59033300000000347600351240012a41e92e42500f431f440006c814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f30000000004320010260220bdd2f051300590cf740328ac59033300000000347600351440090a41f02e427b0f431f44ff0db814450f00460000500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000043200102502208ed2f051300ed8d0740304ac5903330000000034a500350a40012a41ec2e422d0f431f440016b814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d44d020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000622e"));

        __CLR4_5_2ikiikilx1dze1v.R.inc(24072);verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "01d48304320010020520a5829f58300f50dc8a024c0965013300000000344102350740003a41e14b426610431b4459fa672a4500004601a050364c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e293000000043200100105202d829f58300f50dc8a024c0965013300000000344102350740003a41d04b426110431b445702882a4500004601a050374c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29400000004320010000520b5819f58300f50dc8a024c0965013300000000344102350740003a419e4b426a10431c4456fab72a4500004601a050434c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29500000004320010ff04203d819f58300f50dc8a024c0965013300000000344102350740003a41874b426310431c4454fe572a4500004601a050334c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29600000004320010fe0420c5809f58300f50dc8a024c0965013300000000344102350840003a41a24b426710431c4457fea72a4500004601a050214c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29700000004320010fd04204d809f58300f50dc8a024c0965013300000000344102350840003a41a34b426310431c4455f6772a4500004601a0502e4c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29900000004320010fc0420d57f9f58300f50dc8a024c0965013300000000344102350840003a41bd4b426510431d4458fe672a4500004601a0501f4c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29700000004320010fb04205d7f9f58300f50dc8a024c0965013300000000344102350840003a41b54b426310431d4456fa772a4500004601a0502d4c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29500000004320010fa0420e57e9f58300f50dc8a024c0965013300000000344102350840003a41b24b426210431e4454fa872a4500004601a050fe4b510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e29000000004320010f904206d7e9f58300f50dc8a024c0965013300000000344102350a40003a41af4b426710431f4458fea72a4500004601a0500a4c510000520000530000c000000000c100000000c200000000c300000000d80000dd00000000e28900000067c5"));

    }finally{__CLR4_5_2ikiikilx1dze1v.R.flushNeeded();}}

}
