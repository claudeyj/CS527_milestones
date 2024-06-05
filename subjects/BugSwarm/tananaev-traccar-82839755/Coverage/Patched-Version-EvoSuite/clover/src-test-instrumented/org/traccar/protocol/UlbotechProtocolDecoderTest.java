/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

import static org.junit.Assert.assertNull;
import static org.traccar.helper.DecoderVerifier.verify;

public class UlbotechProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bmbbmblx1e6aum{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565537071L,8589935092L,15070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bmbbmblx1e6aum.R.globalSliceStart(getClass().getName(),15059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bmbbmblx1e6aum.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bmbbmblx1e6aum.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.UlbotechProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbmb() throws Exception{try{__CLR4_5_2bmbbmblx1e6aum.R.inc(15059);

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15060);UlbotechProtocolDecoder decoder = new UlbotechProtocolDecoder(new UlbotechProtocol());
        
        __CLR4_5_2bmbbmblx1e6aum.R.inc(15061);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f8010103545500500179009ccb4b62010e00144db906310d3f0000000000cb0304000000000404000a8123050603211860221006080000000100000000ef97f8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15062);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "F80101035785203457289495D60235010E016175A506C2C838000000000064"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15063);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "F8010108621060211481299C4247FA010E015EE1D606BDE797000301370081030402420000040400523CAF050603921743220706080000000000000000071131058E410C0E30310D48312F8E4131046A080402C8F2545445F8"))));
        
        __CLR4_5_2bmbbmblx1e6aum.R.inc(15064);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "F8010108621060211481299C4249FA010E015EE27506BDE80900020000008F030402420000040400523CAF05060392173F220706080000000000000000071131058E410C0E40310D48312F8E41310884080402CA60E43872F8"))));

        //verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
        //        "F801010863070018987298729619022701CC0000285534BA4F28553AB14C2855BC9C572855BC9D5B28553AB25C2855445861285544586303040000000004040000076F0508033A18CF220D3DE6A638F8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15065);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f8010108653280262660481cdacf830209ffffffffffffffff780304000300000404000000030506017418a021f99697f8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15066);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f801010865328026266048fffeae800209ffffffffffffffff7803040200000004040000000005060375175421f3060800000000000000009c28f8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15067);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f8010108653280262660489ce260b4010e01e757bd022340d7002b010d01570304020200000404000000260506036a17d42200060800000000000000000a0101ab9ff8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15068);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f8010108653280262660489ce260df010e01e756f30223384a0003010a02a80304020200000404000001280506036217fe22010608000000000000000005aaf8"))));

        __CLR4_5_2bmbbmblx1e6aum.R.inc(15069);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "f8010108653280262660489ce26128010e01e769ac022336290014010300730304020200000404000003c905060371181c2201060800000000000000000a0140e471f8"))));

    }finally{__CLR4_5_2bmbbmblx1e6aum.R.flushNeeded();}}

}
