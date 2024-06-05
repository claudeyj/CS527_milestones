/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class IntellitracProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2kpmkpmlwye7j4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,26860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2kpmkpmlwye7j4z.R.globalSliceStart(getClass().getName(),26842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehkpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2kpmkpmlwye7j4z.R.rethrow($CLV_t2$);}finally{__CLR4_5_2kpmkpmlwye7j4z.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.IntellitracProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehkpm() throws Exception{try{__CLR4_5_2kpmkpmlwye7j4z.R.inc(26842);

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26843);IntellitracProtocolDecoder decoder = new IntellitracProtocolDecoder(new IntellitracProtocol());

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26844);verifyNull(decoder, text(
                "$OK:TRACKING"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26845);verifyPosition(decoder, text(
                "101000001,20100304075545,121.64547,25.06200,0,0,61,7,2,1,0,0.046,0.000,20100304075546,0"),
                position("2010-03-04 07:55:45.000", true, 25.06200, 121.64547));

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26846);verifyPosition(decoder, text(
                "1010000002,20030217132813,121.646060,25.061725,20,157,133,7,0,11,15,0.096,0.000"));

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26847);verifyPosition(decoder, text(
                "1010000002,20030217132813,121.646060,25.061725,20,157,-133,7,0,11,15,0.096,0.000"));

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26848);verifyPosition(decoder, text(
                "1001070919,20130405084206,37.903730,48.011377,0,0,235,10,2,2,0,20.211,0.153"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26849);verifyPosition(decoder, text(
                "1010000002,20030217144230,121.646102,25.061398,0,0,139,0,0,0,0,0.093,0.000"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26850);verifyPosition(decoder, text(
                "1010000004,20050513153524,121.646075,25.063675,0,166,50,6,1,0,0,0.118,0.000"));

        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26851);verifyPosition(decoder, text(
                "1010000004,20050513154001,121.646075,25.063675,0,166,55,7,1,0,0,0.096,0.000"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26852);verifyPosition(decoder, text(
                "1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26853);verifyPosition(decoder, text(
                "12345,1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26854);verifyPosition(decoder, text(
                "1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26855);verifyPosition(decoder, text(
                "$RP:12345,1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26856);verifyPosition(decoder, text(
                "1010000001,20030105092129,121.651598,25.052325,0,0,33,0,1,0,0"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26857);verifyPosition(decoder, text(
                "1010000001,20030105092129,-121.651598,-25.052325,0,0,33,0,1,0,0"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26858);verifyPosition(decoder, text(
                "1015210962,20131010144712,-77.070037,-12.097935,0,0,77,7,2,2,0,0,139446.8,2095,20131010144712,,0.103,0.000"));
        
        __CLR4_5_2kpmkpmlwye7j4z.R.inc(26859);verifyPosition(decoder, text(
                "1003269480,20131126100258,10.32989,49.93836,0,304,217,6,2,0,0,0.000,0.000,20131126100258,0,0,0,-40,0,0,-273,0,0,0,0"));

    }finally{__CLR4_5_2kpmkpmlwye7j4z.R.flushNeeded();}}

}
