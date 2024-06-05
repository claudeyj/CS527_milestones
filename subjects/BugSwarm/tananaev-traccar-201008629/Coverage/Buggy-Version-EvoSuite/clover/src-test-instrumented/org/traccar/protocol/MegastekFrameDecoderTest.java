/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class MegastekFrameDecoderTest extends ProtocolTest {static class __CLR4_5_2iykiyklx1dvh4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,24577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iykiyklx1dvh4n.R.globalSliceStart(getClass().getName(),24572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iykiyklx1dvh4n.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iykiyklx1dvh4n.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.MegastekFrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiyk() throws Exception{try{__CLR4_5_2iykiyklx1dvh4n.R.inc(24572);

        __CLR4_5_2iykiyklx1dvh4n.R.inc(24573);MegastekFrameDecoder decoder = new MegastekFrameDecoder();

        __CLR4_5_2iykiyklx1dvh4n.R.inc(24574);Assert.assertEquals(
                binary("30313337244d47563030322c3335343535303035303239323636392c4756543930302c522c3134313231352c3033313830342c412c2c532c2c452c30302c30332c30302c332e36372c302e3030302c302e30302c3131372e312c302e302c3531302c31302c2c2c2c303030302c303030302c32322c31322c302c202c202c2c312d312c39382c5057204f4e3b21"),
                decoder.decode(null, null, binary("30313337244d47563030322c3335343535303035303239323636392c4756543930302c522c3134313231352c3033313830342c412c2c532c2c452c30302c30332c30302c332e36372c302e3030302c302e30302c3131372e312c302e302c3531302c31302c2c2c2c303030302c303030302c32322c31322c302c202c202c2c312d312c39382c5057204f4e3b21")));

        __CLR4_5_2iykiyklx1dvh4n.R.inc(24575);Assert.assertEquals(
                binary("244d47563030322c3031333737373030373533363433342c2c522c3031303131342c3030303035372c562c303030302e303030302c4e2c30303030302e303030302c452c30302c30302c30302c39392e392c302e3030302c302e30302c302e302c38302e3236332c3531302c38392c323334322c303330422c2c303030302c303030302c3230302c39362c302c202c202c2c2c2c54696d65723b21"),
                decoder.decode(null, null, binary("244d47563030322c3031333737373030373533363433342c2c522c3031303131342c3030303035372c562c303030302e303030302c4e2c30303030302e303030302c452c30302c30302c30302c39392e392c302e3030302c302e30302c302e302c38302e3236332c3531302c38392c323334322c303330422c2c303030302c303030302c3230302c39362c302c202c202c2c2c2c54696d65723b210d0a")));

        __CLR4_5_2iykiyklx1dvh4n.R.inc(24576);Assert.assertEquals(
                binary("53545832363034373520202020202020202020024f244750524d432c3133313131302e30302c562c2c2c2c2c2c2c3036303931332c2c2c4e2a37362c3232322c30312c383135412c443435352c31312c39372c303030302c303030312c302c54696d65723b3735"),
                decoder.decode(null, null, binary("53545832363034373520202020202020202020024f244750524d432c3133313131302e30302c562c2c2c2c2c2c2c3036303931332c2c2c4e2a37362c3232322c30312c383135412c443435352c31312c39372c303030302c303030312c302c54696d65723b37350d0a")));

    }finally{__CLR4_5_2iykiyklx1dvh4n.R.flushNeeded();}}

}
