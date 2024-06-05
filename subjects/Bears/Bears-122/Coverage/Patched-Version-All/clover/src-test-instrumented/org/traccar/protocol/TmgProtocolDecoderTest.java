/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TmgProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2lculculwye7j9l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,27690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2lculculwye7j9l.R.globalSliceStart(getClass().getName(),27678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehlcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2lculculwye7j9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2lculculwye7j9l.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.TmgProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehlcu() throws Exception{try{__CLR4_5_2lculculwye7j9l.R.inc(27678);

        __CLR4_5_2lculculwye7j9l.R.inc(27679);TmgProtocolDecoder decoder = new TmgProtocolDecoder(new TmgProtocol());

        __CLR4_5_2lculculwye7j9l.R.inc(27680);verifyPosition(decoder, text(
                "$nor,L,868325023006341,14022017,103947,1,2836.6542,N,07706.2504,E,0.0,0.0,0.0,0.0,0,22,VODAFONE - DELH,15,49B7,1,2.57,13.2,00000010,00000000,0111,00.0,00.0,0.0,SW10.12,NA,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27681);verifyPosition(decoder, text(
                "$rid,L,868325023006341,14022017,103706,1,2836.6542,N,07706.2504,E,0.0,0.0,0.0,0.0,0,22,VODAFONE - DELH,15,49B7,1,2.57,13.2,00000011,00000000,0111,00.0,00.0,0.0,SW10.12,0004909463,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27682);verifyPosition(decoder, text(
                "$ion,H,868324023777431,27012017,101057,4,2830.2952,N,07705.2532,E,0.0,202.38,225.9,1.22,8,20,N.A,0,N.A,1,4.09,00.0,00000111,00000000,1101,00.0-00.0,00.0-0.0,4.42,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27683);verifyPosition(decoder, text(
                "$iof,H,868324023777431,27012017,101111,4,2830.2952,N,07705.2532,E,0.0,202.38,225.9,0.87,11,21,N.A,25,N.A,0,4.09,00.0,00000111,00000000,1110,00.0-00.0,00.0-0.0,4.42,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27684);verifyPosition(decoder, text(
                "$rmv,L,868324023777431,27012017,101141,4,2830.2952,N,07705.2532,E,0.0,202.38,225.9,0.86,12,21,VODAFONE - DELH,24,3220,0,4.11,00.0,00000111,00000000,1110,00.0-00.0,00.0-0.0,4.42,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27685);verifyPosition(decoder, text(
                "$rnc,H,868324023777431,27012017,101013,4,2830.2923,N,07705.2551,E,0.0,9.65,226.0,0.88,12,21,VODAFONE - DELH,28,3220,0,4.14,07.4,00000111,00000000,1111,00.0-00.0,00.0-0.0,4.42,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27686);verifyPosition(decoder, text(
                "$ebl,H,868324023777431,27012017,101046,4,2830.2923,N,07705.2551,E,0.0,9.65,226.0,0.97,11,21,VODAFONE - DELH,25,3220,0,4.11,00.0,00000111,00000000,1110,00.0-00.0,00.0-0.0,4.42,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27687);verifyPosition(decoder, text(
                "$nor,L,868324023777431,17012017,001023,4,2830.2977,N,07705.2478,E,0.0,207.07,229.2,0.97,11,22,IDEA CELLULAR L,18,DCDE,0,4.09,12.9,00000111,00000000,1111,00.0-00.0,00.0-0.0,3.59,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27688);verifyPosition(decoder, text(
                "$nor,L,868324023777431,17012017,001523,4,2830.2939,N,07705.2527,E,0.0,50.96,236.5,1.05,11,21,IDEA CELLULAR L,18,DCDE,0,4.09,12.8,00000111,00000000,1111,00.0-00.0,00.0-0.0,3.59,01.02,#"));

        __CLR4_5_2lculculwye7j9l.R.inc(27689);verifyPosition(decoder, text(
                "$nor,L,869309999985699,24062015,094459,4,2826.1956,N,07659.7690,E,67.5,2.5,167,0.82,15,22,airtel,31,4441,1,4.1,12.7,00000011,00000011,1111,0.0,0.0,21.3,SW00.01,#"));

    }finally{__CLR4_5_2lculculwye7j9l.R.flushNeeded();}}

}
