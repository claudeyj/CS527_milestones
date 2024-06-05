/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

public class TelicFrameDecoderTest extends ProtocolTest {static class __CLR4_5_2jdxjdxlx1e0kn9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,25130,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jdxjdxlx1e0kn9.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jdxjdxlx1e0kn9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jdxjdxlx1e0kn9.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TelicFrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjdx() throws Exception{try{__CLR4_5_2jdxjdxlx1e0kn9.R.inc(25125);

        __CLR4_5_2jdxjdxlx1e0kn9.R.inc(25126);TelicFrameDecoder decoder = new TelicFrameDecoder();

        __CLR4_5_2jdxjdxlx1e0kn9.R.inc(25127);Assert.assertNull(
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "00303032363937393238317c3233327c30337c30303230303430313000")));

        __CLR4_5_2jdxjdxlx1e0kn9.R.inc(25128);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "303032363937393238317c3233327c30337c303032303034303130"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "303032363937393238317c3233327c30337c30303230303430313000")));

        __CLR4_5_2jdxjdxlx1e0kn9.R.inc(25129);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "3030323039373932383139392c3231303231363038313930302c302c3231303231363038313835392c3031333839333338352c34363635383639352c332c302c302c382c2c2c3534312c36313239382c2c303030302c30302c302c3139362c302c30343037"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "650000003030323039373932383139392c3231303231363038313930302c302c3231303231363038313835392c3031333839333338352c34363635383639352c332c302c302c382c2c2c3534312c36313239382c2c303030302c30302c302c3139362c302c3034303700")));

    }finally{__CLR4_5_2jdxjdxlx1e0kn9.R.flushNeeded();}}

}
