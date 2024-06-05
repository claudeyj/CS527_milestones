/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.helper.ChannelBufferTools;

import java.nio.charset.Charset;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;

public class Jt600ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bb4bb4lx1e783k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565580367L,8589935092L,14664,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bb4bb4lx1e783k.R.globalSliceStart(getClass().getName(),14656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bb4bb4lx1e783k.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bb4bb4lx1e783k.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Jt600ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbb4() throws Exception{try{__CLR4_5_2bb4bb4lx1e783k.R.inc(14656);

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14657);Jt600ProtocolDecoder decoder = new Jt600ProtocolDecoder(new Jt600Protocol());

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14658);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24311021600111001B16021105591022329862114046227B0598095080012327951435161F"))));

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14659);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24312082002911001B171012052831243810120255336425001907190003FD2B91044D1FA0"))));

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14660);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24312082002911001B1710120533052438099702553358450004061E0003EE000000000C00"))));

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14661);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "24608111888821001B09060908045322564025113242329F0598000001003F0000002D00AB"))));

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14662);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "(3110312099,W01,11404.6204,E,2232.9961,N,A,040511,063736,4,7,100,4,17,1,1,company)", Charset.defaultCharset())));

        __CLR4_5_2bb4bb4lx1e783k.R.inc(14663);verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "(3120820029,W01,02553.3555,E,2438.0997,S,A,171012,053339,0,8,20,6,31,5,20,20)", Charset.defaultCharset())));

        /*verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "(3330104377,U01,010100,010228,F,00.000000,N,000.000000,E,0,0,0,0%,00001000000000,741,14,22,0,206)", Charset.defaultCharset())));

        verify(decoder.decode(null, null, ChannelBuffers.copiedBuffer(
                "(6221107674,2,U09,129,2,A,280513113036,E,02711.0500,S,1721.0876,A,030613171243,E,02756.7618,S,2300.0325,3491,538200,14400,1)", Charset.defaultCharset())));*/

    }finally{__CLR4_5_2bb4bb4lx1e783k.R.flushNeeded();}}

}
