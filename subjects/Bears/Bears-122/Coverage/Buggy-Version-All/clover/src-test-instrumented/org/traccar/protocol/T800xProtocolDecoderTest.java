/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class T800xProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2l6ll6llwydzt22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383835206L,8589935092L,27463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2l6ll6llwydzt22.R.globalSliceStart(getClass().getName(),27453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehl6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2l6ll6llwydzt22.R.rethrow($CLV_t2$);}finally{__CLR4_5_2l6ll6llwydzt22.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.T800xProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehl6l() throws Exception{try{__CLR4_5_2l6ll6llwydzt22.R.inc(27453);

        __CLR4_5_2l6ll6llwydzt22.R.inc(27454);T800xProtocolDecoder decoder = new T800xProtocolDecoder(new T800xProtocol());

        __CLR4_5_2l6ll6llwydzt22.R.inc(27455);verifyNull(decoder, binary(
                "232301001500000880316890202968140197625020"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27456);verifyNull(decoder, binary(
                "232303000f00000880316890202968"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27457);verifyAttributes(decoder, binary(
                "232302004200000880316890202968001e02582d00000000000000050000320000018901920000001dc1e2001601081154255d0202005a0053875a00a57e5a00af80"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27458);verifyNull(decoder, binary(
                "232301001500020357367031063979150208625010"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27459);verifyNull(decoder, binary(
                "232303000f00000357367031063979"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27460);verifyPosition(decoder, binary(
                "232304004200030357367031063979003c03842307d00000c80000050100008000008900890100000017b100151022121648b8ef0c4422969342cec5944100000110"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27461);verifyPosition(decoder, binary(
                "232302004200150357367031063979003c03842307d000004a0000050100004001009500940000000285ab001510281350477f710d4452819342d1ba944101160038"));

        __CLR4_5_2l6ll6llwydzt22.R.inc(27462);verifyAttributes(decoder, binary(
                "232302004200000357367031063979003c03842307d000008000000501000000010094009400000002a0b90015102814590694015a00620cf698620cf49e620cf498"));

    }finally{__CLR4_5_2l6ll6llwydzt22.R.flushNeeded();}}

}
