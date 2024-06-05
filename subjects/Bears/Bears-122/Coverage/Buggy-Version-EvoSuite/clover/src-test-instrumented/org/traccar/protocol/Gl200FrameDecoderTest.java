/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gl200FrameDecoderTest extends ProtocolTest {static class __CLR4_5_2k9jk9jlwydwgmn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,26268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2k9jk9jlwydwgmn.R.globalSliceStart(getClass().getName(),26263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehk9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k9jk9jlwydwgmn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k9jk9jlwydwgmn.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Gl200FrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehk9j() throws Exception{try{__CLR4_5_2k9jk9jlwydwgmn.R.inc(26263);

        __CLR4_5_2k9jk9jlwydwgmn.R.inc(26264);Gl200FrameDecoder decoder = new Gl200FrameDecoder();

        __CLR4_5_2k9jk9jlwydwgmn.R.inc(26265);Assert.assertEquals(
                binary("2b41434b017f244501010108676231303000000000ffff07e1070b03112d054dfe030d0a"),
                decoder.decode(null, null, binary("2b41434b017f244501010108676231303000000000ffff07e1070b03112d054dfe030d0a")));

        __CLR4_5_2k9jk9jlwydwgmn.R.inc(26266);Assert.assertEquals(
                binary("2b4556540c00fc1fbf005c4501010108563254030003430564312a41090100000000003f007dff75a11a025c6a7807e1070a14041202680003189c1ac500000000000000000000000000000000000007e1070b041134054e5c6e0d0a"),
                decoder.decode(null, null, binary("2b4556540c00fc1fbf005c4501010108563254030003430564312a41090100000000003f007dff75a11a025c6a7807e1070a14041202680003189c1ac500000000000000000000000000000000000007e1070b041134054e5c6e0d0a")));

        __CLR4_5_2k9jk9jlwydwgmn.R.inc(26267);Assert.assertEquals(
                binary("2b524553503a47545354522c3430303330302c3836323336353033303134323238392c474c3530302c302c302c302c33392e342c39332c312c302e332c31372c3130352e382c32352e3934343234302c34342e3430333733362c32303137303532393134303533302c303232362c303030312c353643322c373038342c2c2c2c32303137303532393136303533302c30324441"),
                decoder.decode(null, null, binary("2b524553503a47545354522c3430303330302c3836323336353033303134323238392c474c3530302c302c302c302c33392e342c39332c312c302e332c31372c3130352e382c32352e3934343234302c34342e3430333733362c32303137303532393134303533302c303232362c303030312c353643322c373038342c2c2c2c32303137303532393136303533302c3032444124")));

    }finally{__CLR4_5_2k9jk9jlwydwgmn.R.flushNeeded();}}

}
