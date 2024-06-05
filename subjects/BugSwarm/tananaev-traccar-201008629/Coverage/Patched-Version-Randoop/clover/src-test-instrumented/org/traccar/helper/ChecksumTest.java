/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.helper;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class ChecksumTest {static class __CLR4_5_2i84i84lx1e0k58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565269350L,8589935092L,23632,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCrc16() {__CLR4_5_2i84i84lx1e0k58.R.globalSliceStart(getClass().getName(),23620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25swbv6i84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i84i84lx1e0k58.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i84i84lx1e0k58.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChecksumTest.testCrc16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25swbv6i84(){try{__CLR4_5_2i84i84lx1e0k58.R.inc(23620);
        __CLR4_5_2i84i84lx1e0k58.R.inc(23621);ChannelBuffer buf = ChannelBuffers.copiedBuffer("123456789", StandardCharsets.US_ASCII);

        __CLR4_5_2i84i84lx1e0k58.R.inc(23622);Assert.assertEquals(0x906e, Checksum.crc16(Checksum.CRC16_X25, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23623);Assert.assertEquals(0x29b1, Checksum.crc16(Checksum.CRC16_CCITT_FALSE, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23624);Assert.assertEquals(0x2189, Checksum.crc16(Checksum.CRC16_KERMIT, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23625);Assert.assertEquals(0x31c3, Checksum.crc16(Checksum.CRC16_XMODEM, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23626);Assert.assertEquals(0xe5cc, Checksum.crc16(Checksum.CRC16_AUG_CCITT, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23627);Assert.assertEquals(0xd64e, Checksum.crc16(Checksum.CRC16_GENIBUS, buf.toByteBuffer()));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23628);Assert.assertEquals(0x6f91, Checksum.crc16(Checksum.CRC16_MCRF4XX, buf.toByteBuffer()));
    }finally{__CLR4_5_2i84i84lx1e0k58.R.flushNeeded();}}
    
    @Test
    public void testLuhn() {__CLR4_5_2i84i84lx1e0k58.R.globalSliceStart(getClass().getName(),23629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2axc3e0i8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i84i84lx1e0k58.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i84i84lx1e0k58.R.globalSliceEnd(getClass().getName(),"org.traccar.helper.ChecksumTest.testLuhn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2axc3e0i8d(){try{__CLR4_5_2i84i84lx1e0k58.R.inc(23629);
        __CLR4_5_2i84i84lx1e0k58.R.inc(23630);Assert.assertEquals(7, Checksum.luhn(12345678901234L));
        __CLR4_5_2i84i84lx1e0k58.R.inc(23631);Assert.assertEquals(0, Checksum.luhn(63070019470771L));
    }finally{__CLR4_5_2i84i84lx1e0k58.R.flushNeeded();}}

}
