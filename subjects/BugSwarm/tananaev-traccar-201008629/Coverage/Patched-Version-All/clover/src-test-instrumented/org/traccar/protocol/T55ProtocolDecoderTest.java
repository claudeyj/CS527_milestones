/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class T55ProtocolDecoderTest extends ProtocolTest {static class __CLR4_5_2jcajcalx1e1oas{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565320688L,8589935092L,25097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2jcajcalx1e1oas.R.globalSliceStart(getClass().getName(),25066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehjca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jcajcalx1e1oas.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jcajcalx1e1oas.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.T55ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehjca() throws Exception{try{__CLR4_5_2jcajcalx1e1oas.R.inc(25066);

        __CLR4_5_2jcajcalx1e1oas.R.inc(25067);T55ProtocolDecoder decoder = new T55ProtocolDecoder(new T55Protocol());

        __CLR4_5_2jcajcalx1e1oas.R.inc(25068);verifyNothing(decoder, text(
                "086415031C20"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25069);verifyNothing(decoder, text(
                "358244017671308"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25070);verifyNotNull(decoder, text(
                "$GPRMC,161223.000,A,2517.0545,S,05739.1788,W,0.0,0.0,011196,,,A*61"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25071);verifyPosition(decoder, text(
                "4711/022789000688081/$GPRMC,133343,A,5308.56325,N,1029.12850,E,0.000000,0.000000,290316,,*2A"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25072);verifyPosition(decoder, text(
                "$GPRMC,073446.000,A,1255.5125,N,07738.2948,E,0.00,0.53,080316,D*71,11,865733027593268,1,090,086"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25073);verifyNothing(decoder, text(
                "$GPFID,ID123456ABC"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25074);verifyNothing(decoder, text(
                "$PGID,359853000144328*0F"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25075);verifyNothing(decoder, text(
                "$PCPTI,CradlePoint Test,184453,184453.0,6F*57"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25076);verifyNothing(decoder, text(
                "IMEI 351467108700000"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25077);verifyPosition(decoder, text(
                "$GPRMC,012006,A,4828.10,N,1353.52,E,0.00,0.00,180915,020.3,E*42"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25078);verifyPosition(decoder, text(
                "$GPRMC,094907.000,A,6000.5332,N,03020.5192,E,1.17,60.26,091111,,*33"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25079);verifyPosition(decoder, text(
                "$GPRMC,115528.000,A,6000.5432,N,03020.4948,E,,,091111,,*06"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25080);verifyPosition(decoder, text(
                "$GPRMC,064411.000,A,3717.240078,N,00603.046984,W,0.000,1,010313,,,A*6C"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25081);verifyPosition(decoder, text(
                "$GPGGA,000000.0,4337.200755,N,11611.955704,W,1,05,3.5,825.5,M,-11.0,M,,*6F"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25082);verifyPosition(decoder, text(
                "$GPGGA,000000,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25083);verifyPosition(decoder, text(
                "$GPRMA,V,0000.00,S,00000.00,E,,,00.0,000.,11.,E*7"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25084);verifyPosition(decoder, text(
                "$TRCCR,20140101001122.333,V,60.0,-100.0,1.1,2.2,3.3,4.4,*00"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25085);verifyPosition(decoder, text(
                "$TRCCR,20140111000000.000,A,60.000000,60.000000,0.00,0.00,0.00,50,*3a"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25086);verifyPosition(decoder, text(
                "$GPRMC,125735.000,A,6010.34349,N,02445.72838,E,1.0,101.7,050509,6.9,W,A*1F"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25087);verifyPosition(decoder, text(
                "$GPGGA,000000.000,6010.34349,N,02445.72838,E,1,05,1.7,0.9,M,35.1,M,,*59"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25088);verifyPosition(decoder, text(
                "123456789$GPGGA,000000.000,4610.1676,N,00606.4586,E,0,00,4.3,0.0,M,50.7,M,,0000*59"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25089);verifyPosition(decoder, text(
                "123456789$GPRMC,155708.252,V,4610.1676,N,00606.4586,E,000.0,000.0,060214,,,N*76"));
        
        __CLR4_5_2jcajcalx1e1oas.R.inc(25090);verifyPosition(decoder, text(
                "990000561287964,$GPRMC,213516.0,A,4337.216791,N,11611.995877,W,0.0,335.4,181214,,,A * 72"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25091);verifyPosition(decoder, text(
                "355096030432529$GPGGA,000000.00,3136.599,S,5213.981,W,1,7,2.13,250.00,M,-16.384,M,3550960304325290.0,1"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25092);verifyPosition(decoder, text(
                "355096030432529$GPGGA,000000.00,3136.628,S,5213.990,W,1,7,2.13,250.00,M,-16.384,M,0.0,1"));

    }finally{__CLR4_5_2jcajcalx1e1oas.R.flushNeeded();}}

    @Test
    public void testMaxonDecode() throws Exception {__CLR4_5_2jcajcalx1e1oas.R.globalSliceStart(getClass().getName(),25093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a8ezcqjd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jcajcalx1e1oas.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jcajcalx1e1oas.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.T55ProtocolDecoderTest.testMaxonDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a8ezcqjd1() throws Exception{try{__CLR4_5_2jcajcalx1e1oas.R.inc(25093);

        // Maxon devices can send NMEA before identification

        __CLR4_5_2jcajcalx1e1oas.R.inc(25094);T55ProtocolDecoder decoder = new T55ProtocolDecoder(new T55Protocol());

        __CLR4_5_2jcajcalx1e1oas.R.inc(25095);verifyNothing(decoder, text(
                "$GPRMC,012006,A,4828.10,N,1353.52,E,0.00,0.00,180915,020.3,E*42"));

        __CLR4_5_2jcajcalx1e1oas.R.inc(25096);verifyPosition(decoder, text(
                "$GPFID,ID123456ABC"));

    }finally{__CLR4_5_2jcajcalx1e1oas.R.flushNeeded();}}

}
