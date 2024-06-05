/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

public class Pt502FrameDecoderTest extends ProtocolTest {static class __CLR4_5_2l19l19lwye6901{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,27267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l19l19lwye6901.R.globalSliceStart(getClass().getName(),27261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l19l19lwye6901.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l19l19lwye6901.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Pt502FrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27261,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl19() throws Exception{try{__CLR4_5_2l19l19lwye6901.R.inc(27261);

        __CLR4_5_2l19l19lwye6901.R.inc(27262);Pt502FrameDecoder decoder = new Pt502FrameDecoder();

        __CLR4_5_2l19l19lwye6901.R.inc(27263);Assert.assertEquals(
                binary("244655533836353332383032363234333836342c3531302d56312e31322c4131312d56332e30"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "bffb192d00244655533836353332383032363234333836342c3531302d56312e31322c4131312d56332e300d0d")));

        __CLR4_5_2l19l19lwye6901.R.inc(27264);Assert.assertEquals(
                binary("24504f532c3836353332383032363234333836342c3134343733352e3030302c412c313333322e373038332c4e2c3230342e363833312c452c302e302c3233302e30302c3032303531372c2c2c412f30303030302c31302f312c302f3233342f2f4646392f"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "24504f532c3836353332383032363234333836342c3134343733352e3030302c412c313333322e373038332c4e2c3230342e363833312c452c302e302c3233302e30302c3032303531372c2c2c412f30303030302c31302f312c302f3233342f2f4646392f0d0a")));

        __CLR4_5_2l19l19lwye6901.R.inc(27265);Assert.assertEquals(
                binary("24504f532c3335333435313030303136342c3038323430352e3030302c412c313235342e383530312c4e2c31303035312e363735322c452c302e30302c3233372e39392c3136303531332c2c2c412f303030302c302f302f35353030302f2f6137312f"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "24504f532c3335333435313030303136342c3038323430352e3030302c412c313235342e383530312c4e2c31303035312e363735322c452c302e30302c3233372e39392c3136303531332c2c2c412f303030302c302f302f35353030302f2f6137312f0d0a")));

        __CLR4_5_2l19l19lwye6901.R.inc(27266);Assert.assertEquals(
                binary("24504f532c3335333435313030303136342c3038323430352e3030302c412c313235342e383530312c4e2c31303035312e363735322c452c302e30302c3233372e39392c3136303531332c2c2c412f303030302c302f302f35353030302f2f6137312f"),
                decoder.decode(null, null, binary(ByteOrder.LITTLE_ENDIAN, "bffb1b6a0024504f532c3335333435313030303136342c3038323430352e3030302c412c313235342e383530312c4e2c31303035312e363735322c452c302e30302c3233372e39392c3136303531332c2c2c412f303030302c302f302f35353030302f2f6137312f0d0a")));

    }finally{__CLR4_5_2l19l19lwye6901.R.flushNeeded();}}

}
