/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class WialonProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2blnblnlx1e524a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565479029L,8589935092L,15050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2blnblnlx1e524a.R.globalSliceStart(getClass().getName(),15035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2blnblnlx1e524a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2blnblnlx1e524a.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.WialonProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbln() throws Exception{try{__CLR4_5_2blnblnlx1e524a.R.inc(15035);

        __CLR4_5_2blnblnlx1e524a.R.inc(15036);WialonProtocolDecoder decoder = new WialonProtocolDecoder(new WialonProtocol());

        __CLR4_5_2blnblnlx1e524a.R.inc(15037);assertNull(decoder.decode(null, null, "#L#123456789012345;test"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15038);assertNull(decoder.decode(null, null, "#L#2002;NA"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15039);assertNull(decoder.decode(null, null, "#P#"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15040);verify(decoder.decode(null, null,
                "#SD#270413;205601;5544.6025;N;03739.6834;E;1;2;3;4"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15041);verify(decoder.decode(null, null,
                "#SD#021214;065947;2237.7552;N;11404.8851;E;0.000;;170.9;5"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15042);verify(decoder.decode(null, null,
                "#D#270413;205601;5544.6025;N;03739.6834;E;1;2;3;4;0.0;0;0;14.77,0.02,3.6;NA;count1:1:564,fuel:2:45.8,hw:3:V4.5"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15043);verify(decoder.decode(null, null,
                "#D#190114;051312;4459.6956;N;04105.9930;E;35;306;204.000000;12;NA;452986639;NA;106.000000;NA;sats_gps:1:9,sats_glonass:1:3,balance:2:12123.000000,stay_balance:1:0"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15044);verify(decoder.decode(null, null,
                "#D#021214;065947;2237.7552;N;11404.8851;E;0.000;;170.9;5;1.74;NA;NA;NA;NA;NA"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15045);verify(decoder.decode(null, null,
                "#D#021214;065947;2237.7552;N;11404.8851;E;0.000;;170.9;5;1.74;NA;NA;;NA;NA"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15046);verify(decoder.decode(null, null,
                "#B#080914;073235;5027.50625;N;03026.19321;E;0.700;0.000;NA;4;NA;NA;NA;;NA;\u0411\u0430\u0442\u0430\u0440\u0435\u044f:3:100 %|080914;073420;5027.50845;N;03026.18854;E;1.996;292.540;NA;4;NA;NA;NA;;NA;\u0411\u0430\u0442\u0430\u0440\u0435\u044f:3:100 %"));
        
        __CLR4_5_2blnblnlx1e524a.R.inc(15047);verify(decoder.decode(null, null,
                "#B#110914;102132;5027.50728;N;03026.20369;E;1.979;288.170;NA;NA;NA;NA;NA;;NA;\u0411\u0430\u0442\u0430\u0440\u0435\u044f:3:100 %"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15048);verify(decoder.decode(null, null,
                "#B#110315;045857;5364.0167;N;06127.8262;E;0;155;965;7;2.40;4;0;;NA;Uacc:2:3.4,Iacc:2:0.000,Uext:2:13.2,Tcpu:2:14.4,Balance:2:167.65,GPS:3:Off"));

        __CLR4_5_2blnblnlx1e524a.R.inc(15049);verify(decoder.decode(null, null,
                "#B#110315;045857;5364.0167;N;06127.8262;E;0;155;965;7;2.40;4;0;14.77,0.02,3.6;AB45DF01145;"));

    }finally{__CLR4_5_2blnblnlx1e524a.R.flushNeeded();}}

}
