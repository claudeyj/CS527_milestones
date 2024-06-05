/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class Jt600FrameDecoderTest extends ProtocolTest {static class __CLR4_5_2iyoiyolx1e1o6q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,24583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iyoiyolx1e1o6q.R.globalSliceStart(getClass().getName(),24576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iyoiyolx1e1o6q.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iyoiyolx1e1o6q.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Jt600FrameDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiyo() throws Exception{try{__CLR4_5_2iyoiyolx1e1o6q.R.inc(24576);

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24577);Jt600FrameDecoder decoder = new Jt600FrameDecoder();

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24578);Assert.assertEquals(
                binary("2475604055531611002311111600311326144436028210791d016c0000001f070000000020c03c4f6d07d80ccf"),
                decoder.decode(null, null, binary("2475604055531611002311111600311326144436028210791d016c0000001f070000000020c03c4f6d07d80ccf")));

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24579);Assert.assertEquals(
                binary("2475605035891613002328091601152806086750106533350c00000000000a000000000000e1ff4f97007f1607"),
                decoder.decode(null, null, binary("2475605035891613002328091601152806086750106533350c00000000000a000000000000e1ff4f97007f1607")));

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24580);Assert.assertEquals(
                binary("28333132303832303032392C5730312C30323535332E333535352C452C323433382E303939372C532C412C3137313031322C3035333333392C302C382C32302C362C33312C352C32302C323029"),
                decoder.decode(null, null, binary("28333132303832303032392C5730312C30323535332E333535352C452C323433382E303939372C532C412C3137313031322C3035333333392C302C382C32302C362C33312C352C32302C323029")));

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24581);Assert.assertEquals(
                binary("24312082002911001B171012053405243809970255335555000406140003EE2B91044D1F02"),
                decoder.decode(null, null, binary("24312082002911001B171012053405243809970255335555000406140003EE2B91044D1F02")));

        __CLR4_5_2iyoiyolx1e1o6q.R.inc(24582);Assert.assertEquals(
                binary("28373536303430353535332c404a5429"),
                decoder.decode(null, null, binary("28373536303430353535332c404a5429")));

    }finally{__CLR4_5_2iyoiyolx1e1o6q.R.flushNeeded();}}

}
