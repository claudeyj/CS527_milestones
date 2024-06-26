/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;

public class XexunProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bmbbmblx1e46u0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565438542L,8589935092L,15087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bmbbmblx1e46u0.R.globalSliceStart(getClass().getName(),15059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bmbbmblx1e46u0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bmbbmblx1e46u0.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.XexunProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbmb() throws Exception{try{__CLR4_5_2bmbbmblx1e46u0.R.inc(15059);

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15060);XexunProtocolDecoder decoder = new XexunProtocolDecoder(new XexunProtocol(), false);

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15061);verify(decoder.decode(null, null,
                "GPRMC,150120.000,A,3346.4463,S,15057.3083,E,0.0,117.4,010911,,,A*76,F,imei:351525010943661,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15062);verify(decoder.decode(null, null,
                "GPRMC,010203.000,A,0102.0003,N,00102.0003,E,1.02,1.02,010203,,,A*00,F,,imei:10000000000000,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15063);verify(decoder.decode(null, null,
                "GPRMC,233842.000,A,5001.3060,N,01429.3243,E,0.00,,210211,,,A*74,F,imei:354776030495631,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15064);verify(decoder.decode(null, null,
                "GPRMC,080303.000,A,5546.7313,N,03738.6005,E,0.56,160.13,100311,,,A*6A,L,imei:354778030461167,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15065);verify(decoder.decode(null, null,
                "GPRMC,220828.678,A,5206.1446,N,02038.2403,,0,0,160912,,,E*23,L,imei:358948012501019,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15066);verify(decoder.decode(null, null,
                "GNRMC,134418.000,A,5533.8973,N,03745.4398,E,0.00,308.85,160215,,,A*7A,F,, imei:864244028033115,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15067);verify(decoder.decode(null, null,
                "GPRMC,093341.000,A,1344.5716,N,10033.6648,E,0.00,0.00,240215,,,A*68,F,,imei:865328028306149,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15068);verify(decoder.decode(null, null,
                "GPRMC,103731.636,A,4545.5266,N,00448.8259,E,21.12,276.01,150615,,,A*57,L,, imei:013949002026675,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15069);verify(decoder.decode(null, null,
                "GPRMC,014623.000,A,4710.8260,N,1948.1220,E,0.11,105.40,111212,00,0000.0,A*49,F,,imei:357713002048962,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15070);verify(decoder.decode(null, null,
                "GPRMC,043435.000,A,811.299200,S,11339.9500,E,0.93,29.52,160313,00,0000.0,A*65,F,,imei:359585014597923,"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15071);decoder = new XexunProtocolDecoder(new XexunProtocol(), true);
        
        __CLR4_5_2bmbbmblx1e46u0.R.inc(15072);assertNull(decoder.decode(null, null,
                ",+48606717068,,L,, imei:012207005047292,,,F:4.28V,1,52,11565,247,01,000E,1FC5"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15073);verify(decoder.decode(null, null,
                "130302125349,+79604870506,GPRMC,085349.000,A,4503.2392,N,03858.5660,E,6.95,154.65,020313,,,A*6C,F,, imei:012207007744243,03,-1.5,F:4.15V,1,139,28048,250,01,278A,5072"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15074);verify(decoder.decode(null, null,
                "111111120009,+436763737552,GPRMC,120009.590,A,4639.6774,N,01418.5737,E,0.00,0.00,111111,,,A*68,F,, imei:359853000144328,04,481.2,F:4.15V,0,139,2689,232,03,2725,0576"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15075);verify(decoder.decode(null, null,
                "111111120009,+436763737552,GPRMC,120600.000,A,6000.0000,N,13000.0000,E,0.00,0.00,010112,,,A*68,F,help me!, imei:123456789012345,04,481.2,F:4.15V,0,139,2689,232,03,2725,0576"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15076);verify(decoder.decode(null, null,
                "111111120009,+436763737552,GPRMC,120600.000,A,6000.0000,N,13000.0000,E,0.00,0.00,010112,,,A*68,F,help me!, imei:123456789012345,04,481.2,L:3.5V,0,139,2689,232,03,2725,0576"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15077);verify(decoder.decode(null, null,
                "111111120009,436763737552,GPRMC,120600.000,A,6000.0000,N,13000.0000,E,0.00,0.00,010112,,,A*68,F,help me!, imei:123456789012345,04,481.2,L:3.5V,0,139,2689,232,03,2725,0576"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15078);verify(decoder.decode(null, null,
                "111111120009,+1234,GPRMC,204530.4,A,6000.0000,N,13000.0000,E,0.0,,010112,0.0,E,A*68,F,imei:123456789012345,04,123.5,F:3.55V,0,139,,232,03,272CE1,0576"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15079);verify(decoder.decode(null, null,
                "111111120009,+1234,GPRMC,204530.4,A,6000.000,N,01000.6288,E,0.0,0.00,230713,0.0,E,A*3C,F,imei:123456789012345,00,,F:3.88V,0,125,,262,01,224CE1,379B"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15080);verify(decoder.decode(null, null,
                "111111120009,+1234,GPRMC,215840.7,A,6000.000,N,01000.6253,E,0.0,0.00,230713,0.0,E,A*34,F,imei:123456789012345,00,,F:3.9V,0,124,,262,01,224CE1,379B"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15081);verify(decoder.decode(null, null,
                "130725134142,,GPRMC,134142.591,A,3845.6283,N,00909.8876,W,2.08,287.33,250713,,,A*71,F,, imei:013227000526784,03,-50.7,L:3.69V,0,128,65337,268,03,177A,119F"));
        
        __CLR4_5_2bmbbmblx1e46u0.R.inc(15082);verify(decoder.decode(null, null,
                "140602152533,TESCO_INFO,GPRMC,152533.000,A,5145.4275,N,00000.3448,E,0.00,0.00,020614,,,A*66,F,, imei:013227002781643,06,35.1,F:4.15V,1,135,38950,234,10,10B4,5235"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15083);verify(decoder.decode(null, null,
                "150216154418,5277,GNRMC,134418.000,A,5533.8973,N,03745.4398,E,0.00,308.85,160215,,,A*7A,F,, imei:864244028033115,10,169.8,F:4.28V,1,132,48269,250,99,6D0D,8572"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15084);verify(decoder.decode(null, null,
                "150224173341,+66961544651,GPRMC,093341.000,A,1344.5716,N,10033.6648,E,0.00,0.00,240215,,,A*68,F,,imei:865328028306149,05,106.4,F:4.01V/ADC1=0.20V/ADC2=0.00V,0,159,955,520,01,5DE8,0399,6.21km"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15085);verify(decoder.decode(null, null,
                "150316182840,07872167745,GPRMC,182840.000,A,5126.1310,N,00055.5573,W,0.00,0.00,160315,,,A*7C,F,,imei:865328023469306,06,54.3,F:4.10V/ADC1=0.76V/ADC2=0.00V,0,157,38486,234,10,34DC,48A6,3.70km"));

        __CLR4_5_2bmbbmblx1e46u0.R.inc(15086);verify(decoder.decode(null, null,
                "150615123731,+33647384611,GPRMC,103731.636,A,4545.5266,N,00448.8259,E,21.12,276.01,150615,,,A*57,L,, imei:013949002026675,04,3522.9,F:3.72V,0,142,21744,208,01,0702,9C8C"));

    }finally{__CLR4_5_2bmbbmblx1e46u0.R.flushNeeded();}}

}
