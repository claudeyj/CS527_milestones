/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class GalileoProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b2sb2slx1e46kf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b2sb2slx1e46kf.R.globalSliceStart(getClass().getName(),14356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b2sb2slx1e46kf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b2sb2slx1e46kf.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.GalileoProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb2s() throws Exception{try{__CLR4_5_2b2sb2slx1e46kf.R.inc(14356);

        __CLR4_5_2b2sb2slx1e46kf.R.inc(14357);GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());

        __CLR4_5_2b2sb2slx1e46kf.R.inc(14358);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "011380033836383230343030313534393038370432008590"))));
        
        __CLR4_5_2b2sb2slx1e46kf.R.inc(14359);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01cf030446ba10630320a7054c533008f86c8e0310062c043347049e02344000350940013241506b428f10432244aeea572045f9004604a0500000510000529a6b5300000446ba10712420ce1c4b533009b4f06703043df4033381037b0a343800350a40093241db6b428f10432544c05ef81f45f9004604a050000051000052886b5300000446ba10702420c11c4b53300a54f16703c450f403336e034e0a343900350840093241dd6b428f1043254491eaf71f45f9004604a050000051000052c26b5300000446ba106f2420b31c4b53300cecf267033865f403336a03300a343800350740093241e66b429010432544b446582045f9004604a050000051000052f76b5300000446ba106e2420a61c4b53300c9cf467038878f403337b03370a343800350740093241b56b428f10432544ba46f81f45f9004604a050000051000052c66b5300000446ba106d2420991c4b53300bc8f56703508cf403338d036e0a343700350840093241d66b428f10432544b4ea572045f9004604a050000051000052846b5300000446ba106c24208c1c4b533008c8f5670370a0f403338703920a343a00350e40093241c76b428f10432544c0fef71f45f9004604a0500000510000528d6b5300000446ba106b24207f1c4b533009a4f5670338b4f403337603920a343c00350a40093241d06b428f104325449146a81f45f9004604a0500000510000528a6b5300000446ba106a2420721c4b53300b9cf56703ecc7f403337103810a343a00350840093241ca6b428f10432544d12e582045f9004604a050000051000052996b5300000446ba10692420651c4b53300a64f6670358dbf403337a03490a343900350840093241e56b429010432544aed2f71f45f9004604a050000051000052b26b5300000446ba10682420581c4b5330094cf86703e0eef4033381030c0a343a00350940093241f96b428f10432544cb2e182145f9004604a050000051000052926b5300000446ba106724204b1c4b533009f8fa67032802f503337b03fc09343b00350a40093241d86b428f10432544c0ea772145f9004604a0500000510000529e6b5300000446ba106624203e1c4b533009a0fd67036815f503338403fd09343c00350a40093241a86b428f10432544ae2e582045f9004604a050000051000052a86b5300000446ba10652420311c4b53300944006803b028f503338003ff09343d00350940093241dc6b428e10432544a8fea71f45f9004604a050000051000052e26b5300000446ba10642420241c4b533008f0026803083cf503338b03f909343c00350d40093241d36b428f10432544c0eaa71f45f9004604a050000051000052ab6b530000ff3f"))));
        
        __CLR4_5_2b2sb2slx1e46kf.R.inc(14360);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "011e8304320010270220dbd2f051300a90cf740328ac59033300000000347600351240012a41e92e42500f431f440006c814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f30000000004320010260220bdd2f051300590cf740328ac59033300000000347600351440090a41f02e427b0f431f44ff0db814450f00460000500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d471020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000043200102502208ed2f051300ed8d0740304ac5903330000000034a500350a40012a41ec2e422d0f431f440016b814450f00460020500000510000520000530000540000550000560000570000580000600000610000620000a000a100a200a300a400a500a600a700a800a900aa00ab00ac00ad00ae00af00b00000b10000b20000b30000b40000b50000b60000b70000b80000b90000c000000000c100000000c200000000c300000000c400c500c600c700c800c900ca00cb00cc00cd00ce00cf00d000d100d200d44d020000d60000d70000d80000d90000da0000db00000000dc00000000dd00000000de00000000df00000000f000000000f100000000f200000000f300000000622e"))));

    }finally{__CLR4_5_2b2sb2slx1e46kf.R.flushNeeded();}}

}
