/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class KhdProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2iwniwnlx1dvh49{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,24514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2iwniwnlx1dvh49.R.globalSliceStart(getClass().getName(),24503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehiwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iwniwnlx1dvh49.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iwniwnlx1dvh49.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.KhdProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehiwn() throws Exception{try{__CLR4_5_2iwniwnlx1dvh49.R.inc(24503);

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24504);KhdProtocolDecoder decoder = new KhdProtocolDecoder(new KhdProtocol());

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24505);verifyNothing(decoder, binary(
                "2929b1000605162935b80d"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24506);verifyPosition(decoder, binary(
                "292980002805162935140108074727801129670365336900000103ffff000082fc0000001e78091b000000360d"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24507);verifyPosition(decoder, binary(
                "29298100280A9F9538081228160131022394301140372500000330FF0000007FFC0F00001E000000000034290D"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24508);verifyPosition(decoder, binary(
                "29298000280A81850A120310095750005281370061190800000232F848FFBBFFFF0000001E000000000000ED0D"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24509);verifyPosition(decoder, binary(
                "29298E00280F80815A121218203116022318461140227000720262FB00077C7FBF5600001E3C3200000000850D"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24510);verifyPosition(decoder, binary(
                "29298200230AA2CC391205030505220285947903109550008002078400000002000000000000750D"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24511);verifyPosition(decoder, binary(
                "29298500081DD08C22120312174026026545710312541700000000F819C839FFFF1D00001E00500000003AF90D"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24512);verifyPosition(decoder, binary(
                "292980002822836665140825142037045343770193879200000050ffff000082fc000004b0780b170000002a0d"));

        __CLR4_5_2iwniwnlx1dvh49.R.inc(24513);verifyPosition(decoder, binary(
                "292980002802425349120811032137022373011140211100000334FFFF000082FC0000001E780913000034DF0D"));

    }finally{__CLR4_5_2iwniwnlx1dvh49.R.flushNeeded();}}

}
