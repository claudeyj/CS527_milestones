/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class IntellitracProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_28xw8xwlx1dsoxb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564902470L,8589935092L,11605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_28xw8xwlx1dsoxb.R.globalSliceStart(getClass().getName(),11588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49eh8xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28xw8xwlx1dsoxb.R.rethrow($CLV_t2$);}finally{__CLR4_5_28xw8xwlx1dsoxb.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.IntellitracProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49eh8xw() throws Exception{try{__CLR4_5_28xw8xwlx1dsoxb.R.inc(11588);

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11589);IntellitracProtocolDecoder decoder = new IntellitracProtocolDecoder(new IntellitracProtocol());

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11590);assertNull(decoder.decode(null, null, "$OK:TRACKING"));

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11591);verify(decoder.decode(null, null,
                "1010000002,20030217132813,121.646060,25.061725,20,157,133,7,0,11,15,0.096,0.000"));

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11592);verify(decoder.decode(null, null,
                "1010000002,20030217132813,121.646060,25.061725,20,157,-133,7,0,11,15,0.096,0.000"));

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11593);verify(decoder.decode(null, null,
                "1001070919,20130405084206,37.903730,48.011377,0,0,235,10,2,2,0,20.211,0.153"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11594);verify(decoder.decode(null, null,
                "1010000002,20030217144230,121.646102,25.061398,0,0,139,0,0,0,0,0.093,0.000"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11595);verify(decoder.decode(null, null,
                "1010000004,20050513153524,121.646075,25.063675,0,166,50,6,1,0,0,0.118,0.000"));

        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11596);verify(decoder.decode(null, null,
                "1010000004,20050513154001,121.646075,25.063675,0,166,55,7,1,0,0,0.096,0.000"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11597);verify(decoder.decode(null, null,
                "1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11598);verify(decoder.decode(null, null,
                "12345,1010000002,20030217132813,121.646060,25.061725,20,157,0,7,0,11,15"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11599);verify(decoder.decode(null, null,
                "1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11600);verify(decoder.decode(null, null,
                "$RP:12345,1010000002,20030217144230,121.646102,25.061398,0,0,0,7,2,0,0"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11601);verify(decoder.decode(null, null,
                "1010000001,20030105092129,121.651598,25.052325,0,0,33,0,1,0,0"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11602);verify(decoder.decode(null, null,
                "1010000001,20030105092129,-121.651598,-25.052325,0,0,33,0,1,0,0"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11603);verify(decoder.decode(null, null,
                "1015210962,20131010144712,-77.070037,-12.097935,0,0,77,7,2,2,0,0,139446.8,2095,20131010144712,,0.103,0.000"));
        
        __CLR4_5_28xw8xwlx1dsoxb.R.inc(11604);verify(decoder.decode(null, null,
                "1003269480,20131126100258,10.32989,49.93836,0,304,217,6,2,0,0,0.000,0.000,20131126100258,0,0,0,-40,0,0,-273,0,0,0,0"));

    }finally{__CLR4_5_28xw8xwlx1dsoxb.R.flushNeeded();}}

}
