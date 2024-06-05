/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class Gt06ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_28we8welx1dh68j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564364996L,8589935092L,11550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_28we8welx1dh68j.R.globalSliceStart(getClass().getName(),11534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49eh8we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28we8welx1dh68j.R.rethrow($CLV_t2$);}finally{__CLR4_5_28we8welx1dh68j.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gt06ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49eh8we() throws Exception{try{__CLR4_5_28we8welx1dh68j.R.inc(11534);

        __CLR4_5_28we8welx1dh68j.R.inc(11535);Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

        __CLR4_5_28we8welx1dh68j.R.inc(11536);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787811010123456789012345100B3201000171930D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11537);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "78781F120B081D112E10CC027AC7EB0C46584900148F01CC00287D001FB8000380810D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11538);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "78780D01086471700328358100093F040D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11539);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "78780D01012345678901234500018CDD0D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11540);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "78780d0103534190360660610003c3df0d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11541);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787819100B031A0B1B31CC027AC7FD0C4657BF0115210001001CC6070D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11542);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787821120C010C0F151FCF027AC8840C4657EC00140001CC00287D001F720001000F53A00D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11543);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787825160B051B093523CF027AC8360C4657B30014000901CC00266A001E1740050400020008D7B10D0A"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11544);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787811010864717003664467100f190a0002c6d20d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11545);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787819100e010903230ec803ae32a60653cded00180000020072feb70d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11546);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "7878471e0e03110b0511c501c664fd074db73f0218a602e003433a002fed40433a0056e14e433a0056104e433a0056fd53433a002eed55433a007e4b57433a002ee25aff00020120f6720d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11547);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002a3b240d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002d4f9b0d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234003084ff0d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11548);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "78788b818300000000534545464e2626004f04220045042626262b37393035343031353534362626262626260410041b0415041a04210415041926262b373930363433333031313526260410043d044f26262b373936303437383430363426260412043e0432043026262b373932383834373738383126262626262626262626262626262626232300020022155d0d0a"))));

        __CLR4_5_28we8welx1dh68j.R.inc(11549);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "787822220e0914160f07c9021a362805090a7800d8b802d402c30e00a98a0105010213f4bb0d0a"))));

    }finally{__CLR4_5_28we8welx1dh68j.R.flushNeeded();}}

}
