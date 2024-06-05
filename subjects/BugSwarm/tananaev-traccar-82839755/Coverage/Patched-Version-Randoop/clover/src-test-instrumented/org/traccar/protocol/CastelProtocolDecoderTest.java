/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class CastelProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2b2mb2mlx1e77zm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565580367L,8589935092L,14362,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2b2mb2mlx1e77zm.R.globalSliceStart(getClass().getName(),14350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehb2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2b2mb2mlx1e77zm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2b2mb2mlx1e77zm.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.CastelProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehb2m() throws Exception{try{__CLR4_5_2b2mb2mlx1e77zm.R.inc(14350);

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14351);CastelProtocolDecoder decoder = new CastelProtocolDecoder(new CastelProtocol());

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14352);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "4040450004323132474c31313433303035303033000000000040082ca89b55a6a99b555c57000000000000c40200000b0000001400036401111f000302f5533bd653f10d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14353);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40404d0004323132474c3131343330303530303300000000004007120000002ca89b55cba99b555c57000000000000c40200000b0000000000036401111f000102000101170000000068850d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14354);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "4040420004323132474c31313433303035303033000000000010022ca89b55cca99b555c57000000000000cf0200000b0000000000036401111f0000020013be0d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14355);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "4040870004323132474c31313433303035303033000000000040052ca89b55e3a89b555c57000000000000c4020000040000001400036401111f0003000012042105210b210c210d210f211021112113211c2121212321242133213421422146214f212b50663603003ce9030dff060000600dffffc25865ffff9e02b43624000000003cbc0d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14356);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "4040d00004323132474c31313433303035303033000000000010013ec09b5596c29b555c57000000000000de0200000f0000000000036401111f000000004944445f3231334730325f532056322e322e36004944445f3231334730325f482056322e322e360032000110021003100410051006100710081009100a100b100c100d100e1011100111021103110411051106110711011202120312041201130213031301160216011701180218011b011c011d011e011f021f031f041f051f061f071f012102210126012701288a690d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14357);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40404d0004323132474c3131343330303530303300000000004007050000003ec09b5564c29b555c57000000000000de0200000f0000002000036401111f0000020001010e00000000237e0d0a"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14358);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40401F00043130303131313235323939383700000000000000100303320D0A"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14359);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40407F000431303031313132353239393837000000000000001001C1F06952FDF069529C91110000000000698300000C0000000000036401014C00030001190A0D04121A1480D60488C5721800000000AF4944445F3231364730325F532056312E322E31004944445F3231364730325F482056312E322E31000000DF640D0A"))));

        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14360);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40405900043130303131313235323939383700000000000000400101C1F06952E7F069529C9111000000000069830000070000000400036401014C00030001190A0D0412041480D60488C57218000000009F01E803ED9A0D0A"))));
        
        __CLR4_5_2b2mb2mlx1e77zm.R.inc(14361);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "40405900043335343034333035303834343134330000000000400100f61a7355c11b7355710000000b00000000000000000000000400000000240e0200020106060f100b2d5a78a7076ec0fb1d00008c065f010000ac220d0a"))));

    }finally{__CLR4_5_2b2mb2mlx1e77zm.R.flushNeeded();}}

}
