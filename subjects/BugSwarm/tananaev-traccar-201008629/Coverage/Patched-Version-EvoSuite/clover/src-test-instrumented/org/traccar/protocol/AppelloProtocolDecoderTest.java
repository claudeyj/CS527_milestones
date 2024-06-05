/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class AppelloProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2ibiibilx1dzdx1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565214432L,8589935092L,23749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2ibiibilx1dzdx1.R.globalSliceStart(getClass().getName(),23742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehibi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ibiibilx1dzdx1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ibiibilx1dzdx1.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.AppelloProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehibi() throws Exception{try{__CLR4_5_2ibiibilx1dzdx1.R.inc(23742);

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23743);AppelloProtocolDecoder decoder = new AppelloProtocolDecoder(new AppelloProtocol());

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23744);verifyAttributes(decoder, text(
                "FOLLOWIT,867273024233699,UTCTIME,0.000000,0.000000,0,0,0,0,L,262:3:c703:4bf8:64:255|262:3:c703:9a18:45|262:3:c703:e838:33|262:3:c703:7190:20|262:3:c704:d896:17|,02,44,,31,,4.20,0,0,86/44/24,,,,26,02264DFF6E16:69|4C09D408554E:79|4C09D408554F:79|E0885DE705E5:81|E2885DE705E7:81|246511122CCC:83|,34925"));

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23745);verifyAttributes(decoder, text(
                "FOLLOWIT,867273024233699,UTCTIME,0.000000,0.000000,0,0,0,0,L,262:3:c703:4bf8:64:1|262:3:c703:9a18:44|262:3:c703:e838:33|262:3:c703:7190:21|262:3:c704:d896:18|262:3:c703:71a6:13|262:3:c703:253d:13|,02,44,,22,,4.20,0,0,86/44/24,,,,30,02264DFF6E16:67|E0885DE705E5:87|B4A5EF284B94:88|E2885DE705E7:85|4C09D408554E:78|3481C4D71B13:43|,24033"));

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23746);verifyAttributes(decoder, text(
                "FOLLOWIT,860719028336968,UTCTIME,-12.112660,-77.045189,0,0,3,-0,L,716,10,049C,2A47,23,,4.22,,53,999/00/00,,,,,,59826,"));

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23747);verifyPosition(decoder, text(
                "FOLLOWIT,860719028336968,160211221959,-12.112660,-77.045258,1,0,6,116,F,716,17,4E85,050C,29,,4.22,,39,999/00/00,,,,,,46206,"));

        __CLR4_5_2ibiibilx1dzdx1.R.inc(23748);verifyPosition(decoder, text(
                "FOLLOWIT,359586019278139,130809160321,22.340218,114.030737,60,120,05,152,F,460,01,2533,720B,31,out,3.90,1,192,20/00/00,12.5,100%,80,45,1CFA68BB754E:60|2CFA68BB754E:100|3CFA68BB754E:100|4CFA68BB754E:100|5CFA68BB754E:100|,46672"));

    }finally{__CLR4_5_2ibiibilx1dzdx1.R.flushNeeded();}}

}
