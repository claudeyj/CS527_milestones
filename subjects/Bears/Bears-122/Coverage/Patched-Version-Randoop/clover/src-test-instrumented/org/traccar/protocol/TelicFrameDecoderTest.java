/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

public class TelicFrameDecoderTest extends ProtocolTest {static class __CLR4_5_2l7il7ilwye6916{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,27495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l7il7ilwye6916.R.globalSliceStart(getClass().getName(),27486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l7il7ilwye6916.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l7il7ilwye6916.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TelicFrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl7i() throws Exception{try{__CLR4_5_2l7il7ilwye6916.R.inc(27486);

        __CLR4_5_2l7il7ilwye6916.R.inc(27487);TelicFrameDecoder decoder = new TelicFrameDecoder();

        __CLR4_5_2l7il7ilwye6916.R.inc(27488);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "303032363230333339337c3232367c31307c303032303034303130"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "303032363230333339337c3232367c31307c30303230303430313000")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27489);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "3030333032303333393332352c3139303331373038333035322c302c3138303331373130333132372c3235393932342c3434353133332c332c302c302c392c2c2c39332c31323231303134312c2c303031302c30302c34302c3234302c302c30343036"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "630000003030333032303333393332352c3139303331373038333035322c302c3138303331373130333132372c3235393932342c3434353133332c332c302c302c392c2c2c39332c31323231303134312c2c303031302c30302c34302c3234302c302c3034303600")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27490);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "303032363239363231385343434530315f534343457c3232367c31307c30323637"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "303032363239363231385343434530315f534343457c3232367c31307c3032363700")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27491);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "30303434323936323138544c4f43303236372c30302c3031313030393030303239363231382c3139303331373038333033362c3235353137382c3434353037322c332c302c38322c2c2c2c3136382c31343734313239362c2c30302c30302c302c323137"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "6400000030303434323936323138544c4f43303236372c30302c3031313030393030303239363231382c3139303331373038333033362c3235353137382c3434353037322c332c302c38322c2c2c2c3136382c31343734313239362c2c30302c30302c302c32313700")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27492);Assert.assertNull(
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "00303032363937393238317c3233327c30337c30303230303430313000")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27493);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "303032363937393238317c3233327c30337c303032303034303130"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "303032363937393238317c3233327c30337c30303230303430313000")));

        __CLR4_5_2l7il7ilwye6916.R.inc(27494);Assert.assertEquals(
                binary(ByteOrder.LITTLE_ENDIAN, "3030323039373932383139392c3231303231363038313930302c302c3231303231363038313835392c3031333839333338352c34363635383639352c332c302c302c382c2c2c3534312c36313239382c2c303030302c30302c302c3139362c302c30343037"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "650000003030323039373932383139392c3231303231363038313930302c302c3231303231363038313835392c3031333839333338352c34363635383639352c332c302c302c382c2c2c3534312c36313239382c2c303030302c30302c302c3139362c302c3034303700")));

    }finally{__CLR4_5_2l7il7ilwye6916.R.flushNeeded();}}

}
