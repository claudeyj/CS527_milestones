/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Assert;
import org.junit.Test;

public class BcdUtilTest {static class __CLR4_5_2i78i78lx1dzdsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testReadInteger() {__CLR4_5_2i78i78lx1dzdsz.R.globalSliceStart(getClass().getName(),23588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ii6kppi78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i78i78lx1dzdsz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i78i78lx1dzdsz.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.BcdUtilTest.testReadInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ii6kppi78(){try{__CLR4_5_2i78i78lx1dzdsz.R.inc(23588);
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23589);byte[] buf = {0x01, (byte) 0x90, 0x34};
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23590);int result = BcdUtil.readInteger(
                ChannelBuffers.wrappedBuffer(buf), 5);
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23591);Assert.assertEquals(1903, result);
    }finally{__CLR4_5_2i78i78lx1dzdsz.R.flushNeeded();}}

    @Test
    public void testReadCoordinate() {__CLR4_5_2i78i78lx1dzdsz.R.globalSliceStart(getClass().getName(),23592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3neavi7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i78i78lx1dzdsz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i78i78lx1dzdsz.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.BcdUtilTest.testReadCoordinate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3neavi7c(){try{__CLR4_5_2i78i78lx1dzdsz.R.inc(23592);
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23593);byte[] buf = {0x03, (byte) 0x85, 0x22, 0x59, 0x34};
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23594);double result = BcdUtil.readCoordinate(
                ChannelBuffers.wrappedBuffer(buf));
        __CLR4_5_2i78i78lx1dzdsz.R.inc(23595);Assert.assertEquals(38.870989, result, 0.00001);
    }finally{__CLR4_5_2i78i78lx1dzdsz.R.flushNeeded();}}

}
