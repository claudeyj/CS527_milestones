/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class TytanProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2984984lx1doc0n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564698931L,8589935092L,11969,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2984984lx1doc0n.R.globalSliceStart(getClass().getName(),11956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49eh984();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2984984lx1doc0n.R.rethrow($CLV_t2$);}finally{__CLR4_5_2984984lx1doc0n.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TytanProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49eh984() throws Exception{try{__CLR4_5_2984984lx1doc0n.R.inc(11956);

        __CLR4_5_2984984lx1doc0n.R.inc(11957);TytanProtocolDecoder decoder = new TytanProtocolDecoder(new TytanProtocol());
        
        __CLR4_5_2984984lx1doc0n.R.inc(11958);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "d5300000689d65556877fbd437a09d8ea89360005a23124e410201213704000907000009ffffffffffffffff0affffffffffffffff18ff63ff7f7fff65ff66ff67ff68ff69ff6b00ff6cffffffff6dff7fffffffff81ffffffff82ffff83ffffffffffffffff88ffff9600"))));
        
        __CLR4_5_2984984lx1doc0n.R.inc(11959);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "d7700000689d205544713bd3378f2c8e9fe181005affdf9041020000000602a1b7563b0700002055447159d3378f2d8e9fe281005affdf9041020000000602a1b7563b0700002055447177d3378f2e8e9fe181005a861a9141020000000602a1b7563b0700002055447195f3378f2d8e9fe281005a1ce78d41020000000602a1b7563b07000020554471b3d3378f2b8e9fe281005a58d88b41020000000602a1b7563b07000020554471d1f3378f2b8e9fe281005a58d88b41020000000602a1b7563b07000020554471efd3378f2a8e9fe381005a94ac8d41020000000602a1b7563b070000205544720df3378f2c8e9fe281005a1ce78d41020000000602a1b7563b070000205544722bd3378f2d8e9fe281005a48638b41020000000602a1b7563b0700002055447249f3378f308e9fe181005adf128c41020000000602a1b7563b070000"))));

        __CLR4_5_2984984lx1doc0n.R.inc(11960);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D5F0FF00001032552F9121D5325FCB8D11AFA0000205396504004C0602FB5B434118001765006603676B68006B80426C02E2C8206D2F9600"))));
        
        __CLR4_5_2984984lx1doc0n.R.inc(11961);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF20E4FA7C77AFF3282C68D2F890800"))));

        __CLR4_5_2984984lx1doc0n.R.inc(11962);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF20e552e248007375bee8c02b3c002"))));

        __CLR4_5_2984984lx1doc0n.R.inc(11963);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D5C0FF00013D21552F9148D3325E8F8D11A80800060228816541061245FF674107C0001810130D21552F9148D3325E8F8D11A8080006022881654106121C46694107C0001810130D21552F9182D3325E8F8D11A8080006022881654106121C46694107C0001810140C"))));
        
        __CLR4_5_2984984lx1doc0n.R.inc(11964);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF221552e31f4d3325e908d11a7c8000602d60e68410612cd74694107c00018100f0b"))));
                
        __CLR4_5_2984984lx1doc0n.R.inc(11965);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF232552e0322d332603f8d1199a1100204bda204004c06024dea454118000e6515661b677068626b80486c02e2ae586d319600"))));
                
        __CLR4_5_2984984lx1doc0n.R.inc(11966);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF20e552e259707375bee8c02b3c002"))));
                        
        __CLR4_5_2984984lx1doc0n.R.inc(11967);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "D56000000AF20e552e259707375bee8c02b3c002"))));
        
        __CLR4_5_2984984lx1doc0n.R.inc(11968);verify(decoder.decode(null, null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "d7680000689d2055447267d3378f308e9fe181005ad1808f41020000000602a1b7563b0700002055447285f3378f308e9fe281005aee878c41020000000602a1b7563b07000020554472a3f3378f2e8e9fe381005ab3968e41020000000602a1b7563b07000020554472c1f3378f308e9fe281005ab3968e41020000000602a1b7563b07000020554472dff3378f2e8e9fe481005adf128c41020000000602a1b7563b07000020554472fdd3378f2e8e9fe481005a84548941020000000602a1b7563b070000205544731bd3378f2e8e9fe481005a49468f41020000000602a1b7563b0700002055447339f3378f2e8e9fe481005a3ad18e41020000000602a1b7563b0700002055447358f3378f308e9fe381005ab3968e41020000000602b909a13b0700002055447376f3378f308e9fe481005ac20b8f41020000000602b909a13b070000"))));

    }finally{__CLR4_5_2984984lx1doc0n.R.flushNeeded();}}

}
