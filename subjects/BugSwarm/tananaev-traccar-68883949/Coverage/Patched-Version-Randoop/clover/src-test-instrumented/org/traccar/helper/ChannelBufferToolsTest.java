/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import static org.junit.Assert.*;
import org.junit.Test;

public class ChannelBufferToolsTest {static class __CLR4_5_28m18m1lx1dp9pf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564743050L,8589935092L,11174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private ChannelBufferFactory factory = new HeapChannelBufferFactory();
    
    @Test
    public void testFind() {__CLR4_5_28m18m1lx1dp9pf.R.globalSliceStart(getClass().getName(),11161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6e5w28m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28m18m1lx1dp9pf.R.rethrow($CLV_t2$);}finally{__CLR4_5_28m18m1lx1dp9pf.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChannelBufferToolsTest.testFind",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6e5w28m1(){try{__CLR4_5_28m18m1lx1dp9pf.R.inc(11161);
    }finally{__CLR4_5_28m18m1lx1dp9pf.R.flushNeeded();}}

    @Test
    public void testReadHexInteger() {__CLR4_5_28m18m1lx1dp9pf.R.globalSliceStart(getClass().getName(),11162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rehfym8m2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28m18m1lx1dp9pf.R.rethrow($CLV_t2$);}finally{__CLR4_5_28m18m1lx1dp9pf.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChannelBufferToolsTest.testReadHexInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rehfym8m2(){try{__CLR4_5_28m18m1lx1dp9pf.R.inc(11162);
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11163);byte[] buf = {0x01,(byte)0x90,0x34};
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11164);int result = ChannelBufferTools.readHexInteger(
                factory.getBuffer(buf, 0, buf.length), 5);
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11165);assertEquals(1903, result);
    }finally{__CLR4_5_28m18m1lx1dp9pf.R.flushNeeded();}}
    
    @Test
    public void testReadHexString() {__CLR4_5_28m18m1lx1dp9pf.R.globalSliceStart(getClass().getName(),11166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hxwrjf8m6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28m18m1lx1dp9pf.R.rethrow($CLV_t2$);}finally{__CLR4_5_28m18m1lx1dp9pf.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChannelBufferToolsTest.testReadHexString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hxwrjf8m6(){try{__CLR4_5_28m18m1lx1dp9pf.R.inc(11166);
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11167);byte[] buf = {0x01,(byte)0x90,0x34};
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11168);String result = ChannelBufferTools.readHexString(
                factory.getBuffer(buf, 0, buf.length), 5);
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11169);assertEquals("01903", result);
        
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11170);result = Long.valueOf(result).toString();
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11171);assertEquals("1903", result);
    }finally{__CLR4_5_28m18m1lx1dp9pf.R.flushNeeded();}}

    @Test
    public void convertHexStringTest() {__CLR4_5_28m18m1lx1dp9pf.R.globalSliceStart(getClass().getName(),11172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlzb8y8mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28m18m1lx1dp9pf.R.rethrow($CLV_t2$);}finally{__CLR4_5_28m18m1lx1dp9pf.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChannelBufferToolsTest.convertHexStringTest",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlzb8y8mc(){try{__CLR4_5_28m18m1lx1dp9pf.R.inc(11172);
        __CLR4_5_28m18m1lx1dp9pf.R.inc(11173);assertArrayEquals(ChannelBufferTools.convertHexString("1234"), new byte[] {0x12,0x34});
    }finally{__CLR4_5_28m18m1lx1dp9pf.R.flushNeeded();}}

}
