/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

import static org.junit.Assert.assertNull;
import static org.traccar.helper.DecoderVerifier.verify;

public class AplicomProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2awvawvlx1e46gw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,14153,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2awvawvlx1e46gw.R.globalSliceStart(getClass().getName(),14143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehawv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2awvawvlx1e46gw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2awvawvlx1e46gw.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AplicomProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehawv() throws Exception{try{__CLR4_5_2awvawvlx1e46gw.R.inc(14143);

        __CLR4_5_2awvawvlx1e46gw.R.inc(14144);AplicomProtocolDecoder decoder = new AplicomProtocolDecoder(new AplicomProtocol());

        __CLR4_5_2awvawvlx1e46gw.R.inc(14145);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44c3014645e8e9bada003e03fff7070055a4f24200000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff00000001000000000000000044c3014645e8e9bada003e03fff77bff55a4f24300000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff00300002000000000000000044c3014645e8e9bada003e03fff7690655a4f24500000081000000000000000000000000000000000000000000000000000000000000000000000000000000ff003000030000000000000000"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14146);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44c3014645e8e9d29a002d0022ff6d00f455893b4d55893b4c027a7e1500189d710800009e0000000000000000000000023300000000000000009d"))));
        
        __CLR4_5_2awvawvlx1e46gw.R.inc(14147);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44C20146B710C158DA002100B09F0700C054CA0EA254CA0E9C03BE0BF6015D7069070000142A600000000000000001"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14148);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44C20143720729D6840043031fff7191C0450ef906450ef90603b20b8003b20b80066465b3870ce30f010ce30ce3003200001520000000030aa200003b13000000320300000bcb17acff0099000186a002"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14149);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "440129D684002b0700C0450ef906450ef90603b20b8003b20b80066465b3870ce30f010ce30ce300003b130300000bcb170a"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14150);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44c3014645e8e9152e008900b09f7700f4558c07e8558c07e703be0bd8015d6faf0e0000003240000000000000000f4349460107010007558c07e70000000000000002d209df028f05fffe00000000000000002eff13fe11fe1a00011000000000000010ff11ff3cff11008c00080060f41b0043502015000000000000020d0000030d0000040c0000040d0000050c0000050d0000058c"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14151);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44c20144563508385a009500b09f7700c0555ea99e555ea9b103bb569f01883ff50b00002a30f000000000000013074349460108010007555ea99e000000000000003f0000ae017605b3ff00000000010000006700d900d500000003000000000000006700d900d500000087002500c4ff0000435020150000000040512001000000000000020d0000030d0000040c0000040d0000050c0000050d0000058c0000060c"))));

        __CLR4_5_2awvawvlx1e46gw.R.inc(14152);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "44C20146B710C158DA009500B09F7700C054CA0EA454CA0EA403BE0BF6015D706B070000142A600000000000000002434946010801000754CA0EA4000000000000008400000000000000000000000000000000300000FE00FE0000000000000000000000000000000000000000000000000000000000000000000040502035000000000000020D0000030D0000040C0000040D0000050C0000050D0000058C0000060C"))));

    }finally{__CLR4_5_2awvawvlx1e46gw.R.flushNeeded();}}

}
