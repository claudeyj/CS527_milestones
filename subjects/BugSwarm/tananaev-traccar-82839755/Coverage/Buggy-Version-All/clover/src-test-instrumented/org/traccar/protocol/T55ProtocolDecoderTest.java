/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.protocol;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.traccar.helper.DecoderVerifier.verify;

public class T55ProtocolDecoderTest extends ProtocolDecoderTest {static class __CLR4_5_2bg8bg8lx1e520x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565479029L,8589935092L,14862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDecode() throws Exception {__CLR4_5_2bg8bg8lx1e520x.R.globalSliceStart(getClass().getName(),14840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s49ehbg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bg8bg8lx1e520x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bg8bg8lx1e520x.R.globalSliceEnd(getClass().getName(),"org.traccar.protocol.T55ProtocolDecoderTest.testDecode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s49ehbg8() throws Exception{try{__CLR4_5_2bg8bg8lx1e520x.R.inc(14840);

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14841);T55ProtocolDecoder decoder = new T55ProtocolDecoder(new T55Protocol());

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14842);assertNull(decoder.decode(null, null, "$GPFID,ID123456ABC"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14843);assertNull(decoder.decode(null, null, "$PGID,359853000144328*0F"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14844);assertNull(decoder.decode(null, null, "$PCPTI,CradlePoint Test,184453,184453.0,6F*57"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14845);assertNull(decoder.decode(null, null, "IMEI 351467108700000"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14846);verify(decoder.decode(null, null,
                "$GPRMC,012006,A,4828.10,N,1353.52,E,0.00,0.00,180915,020.3,E*42"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14847);verify(decoder.decode(null, null,
                "$GPRMC,094907.000,A,6000.5332,N,03020.5192,E,1.17,60.26,091111,,*33"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14848);verify(decoder.decode(null, null,
                "$GPRMC,115528.000,A,6000.5432,N,03020.4948,E,,,091111,,*06"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14849);verify(decoder.decode(null, null,
                "$GPRMC,064411.000,A,3717.240078,N,00603.046984,W,0.000,1,010313,,,A*6C"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14850);verify(decoder.decode(null, null,
                "$GPGGA,000000.0,4337.200755,N,11611.955704,W,1,05,3.5,825.5,M,-11.0,M,,*6F"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14851);verify(decoder.decode(null, null,
                "$GPGGA,000000,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14852);verify(decoder.decode(null, null,
                "$GPRMA,V,0000.00,S,00000.00,E,,,00.0,000.,11.,E*7"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14853);verify(decoder.decode(null, null,
                "$TRCCR,20140101001122.333,V,60.0,-100.0,1.1,2.2,3.3,4.4,*00"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14854);verify(decoder.decode(null, null,
                "$TRCCR,20140111000000.000,A,60.000000,60.000000,0.00,0.00,0.00,50,*3a"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14855);verify(decoder.decode(null, null,
                "$GPRMC,125735.000,A,6010.34349,N,02445.72838,E,1.0,101.7,050509,6.9,W,A*1F"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14856);verify(decoder.decode(null, null,
                "$GPGGA,000000.000,6010.34349,N,02445.72838,E,1,05,1.7,0.9,M,35.1,M,,*59"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14857);verify(decoder.decode(null, null,
                "123456789$GPGGA,000000.000,4610.1676,N,00606.4586,E,0,00,4.3,0.0,M,50.7,M,,0000*59"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14858);verify(decoder.decode(null, null,
                "123456789$GPRMC,155708.252,V,4610.1676,N,00606.4586,E,000.0,000.0,060214,,,N*76"));
        
        __CLR4_5_2bg8bg8lx1e520x.R.inc(14859);verify(decoder.decode(null, null,
                "990000561287964,$GPRMC,213516.0,A,4337.216791,N,11611.995877,W,0.0,335.4,181214,,,A * 72"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14860);verify(decoder.decode(null, null,
                "355096030432529$GPGGA,000000.00,3136.599,S,5213.981,W,1,7,2.13,250.00,M,-16.384,M,3550960304325290.0,1"));

        __CLR4_5_2bg8bg8lx1e520x.R.inc(14861);verify(decoder.decode(null, null,
                "355096030432529$GPGGA,000000.00,3136.628,S,5213.990,W,1,7,2.13,250.00,M,-16.384,M,0.0,1"));

    }finally{__CLR4_5_2bg8bg8lx1e520x.R.flushNeeded();}}

}
