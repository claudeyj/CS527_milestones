/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;
import static org.traccar.helper.DecoderVerifier.verify;

public class TzoneProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bm4bm4lx1e788a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565580367L,8589935092L,15059,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bm4bm4lx1e788a.R.globalSliceStart(getClass().getName(),15052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bm4bm4lx1e788a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bm4bm4lx1e788a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TzoneProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbm4() throws Exception{try{__CLR4_5_2bm4bm4lx1e788a.R.inc(15052);

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15053);TzoneProtocolDecoder decoder = new TzoneProtocolDecoder(new TzoneProtocol());

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15054);assertNotNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "545a00582424010b021e000008637710239476270f080b0a3228001600000000000000000000000000000000000000000000000401a00822001088c00020183701a6053800000000800000000000000000000000000000000077c9860d0a"))));

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15055);verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "545A00912424010B021E000008661040203754350F061807083800160400CE5ADC041447620F0618070838000A0000060C7C0004253378370010AAC000000C37018504E500000000800000000000000000390B0A0014061113000000051200140610600014061220001000133800140610070010001473001000151100101500640010000920001000148400000000000000F2EF570D0A"))));

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15056);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "545A009E2424010A0205000008637710225481290F010F081E33000000000010A0C000310E35000005840000000000000000000000000066140A00140612200010001511001406101000140612490014061308001015006400051400170014061012000000050200140612470000000504001406100700140612510014061260001015012000000005080014061252001406130900101501410000000506000853A40D0A"))));

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15057);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "545A00992424010A0205000008637710225481290F010F082634000000000010A0C000311035000005870000000000000000000000000061130A000000050800101500640014061251001406130800051400170010150141001406101000140612200014061309000000050200140610070014061260001406124900140612470014061012001406125200100015110010150120000000050400183E8A0D0A"))));

        __CLR4_5_2bm4bm4lx1e788a.R.inc(15058);assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertHexString(
                "545A00942424010A0205000008637710225481290F010F091C1F000000000010A1C000310F3500000586000000000000000000000000005C120A001406101000140612490014061012001406125200000005040000000502001015012000000005080010001511001406122000140612600014061247001406130900140610070010150141000514001700140612510010150064007A907C0D0A"))));

    }finally{__CLR4_5_2bm4bm4lx1e788a.R.flushNeeded();}}

}
