/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class HuabaoProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2itxitxlx1dwn15{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565085882L,8589935092L,24418,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2itxitxlx1dwn15.R.globalSliceStart(getClass().getName(),24405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehitx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2itxitxlx1dwn15.R.rethrow($CLV_t2$);}finally{__CLR4_5_2itxitxlx1dwn15.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.HuabaoProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehitx() throws Exception{try{__CLR4_5_2itxitxlx1dwn15.R.inc(24405);

        __CLR4_5_2itxitxlx1dwn15.R.inc(24406);HuabaoProtocolDecoder decoder = new HuabaoProtocolDecoder(new HuabaoProtocol());

        __CLR4_5_2itxitxlx1dwn15.R.inc(24407);verifyPosition(decoder, binary(
                "7e0200002c00160128561400020000000000040001005de1f7065c6cef00000000000017011710044201040000a9002a02000030011b3101030c7e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24408);verifyPosition(decoder, binary(
                "7e0200002c00160128561400030000000000040007005de13c065c6cdb00160000000017011710054201040000a9002a02000030011b310104e47e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24409);verifyNothing(decoder, binary(
                "7e0100002d0141305678720024002c012f373031313142534a2d41362d424400000000000000000000003035363738373201d4c14238383838386d7e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24410);verifyNothing(decoder, binary(
                "7E0100002D013511221122000500000000373031303748422D52303347424400000000000000000000003233363631303402CBD5424136383630387E"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24411);verifyNothing(decoder, binary(
                "7e0100002d007089994489002800000000000000000048422d523033474244000000000000000000000031393036373531024142433030303030d17e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24412);verifyNothing(decoder, binary(
                "7E0102000E013511221122000661757468656E7469636174696F6E3F7E"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24413);verifyPosition(decoder, binary(
                "7E02000032013511221122000700000000000C000301578CC006CA3A5C00470000000014072317201501040000000030011631010BD07E"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24414);verifyNothing(decoder, binary(
                "7E010200100940278494700084323031313131303831313333323139369F7E"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24415);verifyNothing(decoder, binary(
                "7e010000190940278494700012000000000000000000000000000000000000094027849470000a7e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24416);verifyPosition(decoder, binary(
                "7e0200002e094027587492000a000000010000000a03083db7001329f3000000140000130412164952010400000012360a0002341502cb0c20085c107e"));

        __CLR4_5_2itxitxlx1dwn15.R.inc(24417);verifyPosition(decoder, binary(
                "7e020000220014012499170007000000000000400e012af16f02cbd2ba000000000000150101194257010400000077a97e"));

    }finally{__CLR4_5_2itxitxlx1dwn15.R.flushNeeded();}}

}
