/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AtrackProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jzrjzrlwye7iu0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,25927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jzrjzrlwye7iu0.R.globalSliceStart(getClass().getName(),25911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jzrjzrlwye7iu0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jzrjzrlwye7iu0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AtrackProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjzr() throws Exception{try{__CLR4_5_2jzrjzrlwye7iu0.R.inc(25911);

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25912);AtrackProtocolDecoder decoder = new AtrackProtocolDecoder(new AtrackProtocol());

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25913);verifyAttributes(decoder, buffer(
                "$INFO=358683066267395,AX7,Rev.0.61 Build.1624,358683066267395,466924131626767,89886920041316267670,144,0,9,1,12,1,0\r\n"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25914);decoder.setLongDate(true);

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25915);verifyPositions(decoder, binary(
                "0203b494003c00eb00014104d8dd3a3e07de011b0b1f0307de011b0b1f0307de011b0b1f0300307f28030574d30000020000000600160100020000000007d007d000"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25916);decoder.setLongDate(false);

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25917);decoder.setCustom(true);

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25918);verifyPositions(decoder, binary(
                "405025e30096eb730001452efaf6a7d6562fe4f8562fe4f7562fe52c02a006d902273f810064650000e0f5000a0100000000000007d007d000254349255341254d5625425625475125415400090083002a1a000001a8562fe4f8562fe4f7562fe52c02a006d902273f810064020000e0f5000a0100000000000007d007d000254349255341254d5625425625475125415400090083002a1a000001a8"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25919);decoder.setCustom(false);

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25920);verifyNull(decoder, binary(
                "fe0200014104d8f196820001"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25921);verifyPositions(decoder, binary(
                "40503835003300070001441c3d8ed1c400000000000000c9000000c900000000000000000000020000000003de0100000000000007d007d000"),
                position("1970-01-01 00:00:00.000", true, 0.00000, 0.00000));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25922);verifyPositions(decoder, binary(
                "4050993f005c000200014104d8f19682525666c252568c3c52568c63ffc8338402698885000002000009cf03de0100000000000007d007d000525666c252568c5a52568c63ffc8338402698885000002000009cf03de0100000000000007d007d000"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25923);verifyPositions(decoder, binary(
                "40501e58003301e000014104d8f19682525ecd5d525ee344525ee35effc88815026ab4d70000020000104403de01000b0000000007d007d000"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25924);verifyPositions(decoder, binary(
                "40501e58003301e000014104d8f19682525ecd5d525ee344525ee35effc88815026ab4d70000020000104403de01000b0000000007d007d000000000000000"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25925);verifyAttributes(decoder, buffer(
                "$OK\r\n"));

        __CLR4_5_2jzrjzrlwye7iu0.R.inc(25926);verifyAttributes(decoder, buffer(
                "$ERROR=101\r\n"));

    }finally{__CLR4_5_2jzrjzrlwye7iu0.R.flushNeeded();}}

}
