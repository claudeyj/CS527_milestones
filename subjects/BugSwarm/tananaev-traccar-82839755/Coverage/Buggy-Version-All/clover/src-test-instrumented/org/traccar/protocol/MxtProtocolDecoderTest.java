/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class MxtProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bd3bd3lx1e51zr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565479029L,8589935092L,14738,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bd3bd3lx1e51zr.R.globalSliceStart(getClass().getName(),14727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bd3bd3lx1e51zr.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bd3bd3lx1e51zr.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MxtProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbd3() throws Exception{try{__CLR4_5_2bd3bd3lx1e51zr.R.inc(14727);

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14728);MxtProtocolDecoder decoder = new MxtProtocolDecoder(new MxtProtocol());

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14729);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a631361e7a00082471418b052a2c46b587ffc01ae3fd000008800000000000003345422203000000f000f00000000000ea1e04"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14730);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a63118787d00086440628d226e2bc26a97feac8a3afd10210010308000000000000018003d2b10240000005e2f0000f427f21031feff0000593804"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14731);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a631bd777d0008646e319e17292ce86798fed4cd3afd102110211030800000102403001f15003e2b102400000034300000f4271021007b175535a7be04"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14732);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a631e3f97e00087cf40a98151c2cc46898fee0ce3afd1021001030c0000006102116072e003829bb00000036102100001024000000062b0000f42730004b06a6384b4304"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14733);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a63118787d00086468457a466a2bc26a97feac8a3afd10212010308000000000001fe1053d291024000000922f0000f4271021007b17553599bb04"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14734);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a63118787d0008648645ec486a2bc26a97feac8a3afd1021001030c0000000001419eb05372b1024000000982a0000f4271021007b17000010308c04"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14735);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a631e3f97e00087cfa0af3151c2c126798febace3afd1021801030c0000006102122082f003e29bb00000037102100001024000000ab2f0000f42730004b060000488c04"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14736);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a631e3f97e00087cfe0a4b161c2c126798febace3afd1021801030800000071021240731003e2abb00000038102100001024000000c12f0000f42730004b06a638633104"))));

        __CLR4_5_2bd3bd3lx1e51zr.R.inc(14737);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, ChannelBufferTools.convertHexString(
                "01a63118787d0008648645ec486a2bc26a97feac8a3afd1021001030c0000000001419eb05372b1024000000982a0000f4271021007b17000010308c04"))));

    }finally{__CLR4_5_2bd3bd3lx1e51zr.R.flushNeeded();}}

}
