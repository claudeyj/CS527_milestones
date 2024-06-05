/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Vt200ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lj0lj0lwydwgzo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383679559L,8589935092L,27915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2lj0lj0lwydwgzo.R.globalSliceStart(getClass().getName(),27900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehlj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lj0lj0lwydwgzo.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lj0lj0lwydwgzo.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.Vt200ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehlj0() throws Exception{try{__CLR4_5_2lj0lj0lwydwgzo.R.inc(27900);

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27901);Vt200ProtocolDecoder decoder = new Vt200ProtocolDecoder(new Vt200Protocol());

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27902);verifyNull(decoder, binary(
                "286310373094563082002701033d010817143327c68a14841e00c27f550e9a000000000c000000084700200120007d01af260b29"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27903);verifyPosition(decoder, binary(
                "286310373094562086002101033d010817143328441790420114817637207d090a00000847002001207f00d6f229"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27904);verifyPosition(decoder, binary(
                "286310373094562086002101033d0108171433354417932101148139772c9d080a00000847002001207f00dc6729"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27905);verifyNull(decoder, binary(
                "2863103730945600880012180108171433004418103801148375470000dd29"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27906);verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27907);verifyNull(decoder, binary(
                "2863103730945630880062033c862631037309456f222014604362936f01081713365601081713571904c800001b2c000034f66827f0840000000000000000000000000047000006e7000001b9022a000023ff000007f2018a00000a10000003f300cd00000d8d0300000302002729"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27908);verifyNull(decoder, binary(
                "28631037309456008e000801042307171804584229"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27909);verifyNull(decoder, binary(
                "28631037309456108800002e29"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27910);verifyPosition(decoder, binary(
                "28631037309456208200210103302307171805444417097301147188170198090f0000073a002000007e00074429"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27911);verifyNull(decoder, binary(
                "286310373094563089001200032f2107171740144417075001147188872c29"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27912);verifyNull(decoder, binary(
                "2863103730945630880062032f862631037309456f222014604362936f21071717373221071717401400a100000cd700000004020d3c8e0000000000000000000000000000000000000000000000000000000000000000000a000000040000000e009700000cc9000000000000e929"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27913);verifyPosition(decoder, binary(
                "28631037309456208400340102dc0906171616454415760201144494473f920a0c0000030500200100417c1f383a9d1090510000006a00007000000e00180ee129"));

        __CLR4_5_2lj0lj0lwydwgzo.R.inc(27914);verifyPosition(decoder, binary(
                "28631037309456208400340102dc090617161654441577230114439597368c0a0c0000030500200100417c1baa349d3290510000006a00007000003d15004c11c629"));

    }finally{__CLR4_5_2lj0lj0lwydwgzo.R.flushNeeded();}}

}
