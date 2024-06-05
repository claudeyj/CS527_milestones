/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geofence;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

public class GeofencePolygonTest {static class __CLR4_5_2jq7jq7lwye433x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384035522L,8589935092L,25592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPolygonWkt() throws ParseException {__CLR4_5_2jq7jq7lwye433x.R.globalSliceStart(getClass().getName(),25567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r5g9ohjq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jq7jq7lwye433x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jq7jq7lwye433x.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolygonTest.testPolygonWkt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r5g9ohjq7() throws ParseException{try{__CLR4_5_2jq7jq7lwye433x.R.inc(25567);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25568);String test = "POLYGON ((55.75474 37.61823, 55.75513 37.61888, 55.7535 37.6222, 55.75315 37.62165))";
        __CLR4_5_2jq7jq7lwye433x.R.inc(25569);GeofenceGeometry geofenceGeometry = new GeofencePolygon();
        __CLR4_5_2jq7jq7lwye433x.R.inc(25570);geofenceGeometry.fromWkt(test);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25571);Assert.assertEquals(geofenceGeometry.toWkt(), test);
    }finally{__CLR4_5_2jq7jq7lwye433x.R.flushNeeded();}}

    @Test
    public void testContainsPolygon() throws ParseException {__CLR4_5_2jq7jq7lwye433x.R.globalSliceStart(getClass().getName(),25572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2chlrgwjqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jq7jq7lwye433x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jq7jq7lwye433x.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolygonTest.testContainsPolygon",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2chlrgwjqc() throws ParseException{try{__CLR4_5_2jq7jq7lwye433x.R.inc(25572);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25573);String test = "POLYGON ((55.75474 37.61823, 55.75513 37.61888, 55.7535 37.6222, 55.75315 37.62165))";
        __CLR4_5_2jq7jq7lwye433x.R.inc(25574);GeofenceGeometry geofenceGeometry = new GeofencePolygon();
        __CLR4_5_2jq7jq7lwye433x.R.inc(25575);geofenceGeometry.fromWkt(test);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25576);Assert.assertTrue(geofenceGeometry.containsPoint(55.75476, 37.61915));
        __CLR4_5_2jq7jq7lwye433x.R.inc(25577);Assert.assertTrue(!geofenceGeometry.containsPoint(55.75545, 37.61921));

    }finally{__CLR4_5_2jq7jq7lwye433x.R.flushNeeded();}}
    
    @Test
    public void testContainsPolygon180() throws ParseException {__CLR4_5_2jq7jq7lwye433x.R.globalSliceStart(getClass().getName(),25578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi81axjqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jq7jq7lwye433x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jq7jq7lwye433x.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolygonTest.testContainsPolygon180",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi81axjqi() throws ParseException{try{__CLR4_5_2jq7jq7lwye433x.R.inc(25578);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25579);String test = "POLYGON ((66.9494 179.838, 66.9508 -179.8496, 66.8406 -180.0014))";
        __CLR4_5_2jq7jq7lwye433x.R.inc(25580);GeofenceGeometry geofenceGeometry = new GeofencePolygon();
        __CLR4_5_2jq7jq7lwye433x.R.inc(25581);geofenceGeometry.fromWkt(test);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25582);Assert.assertTrue(geofenceGeometry.containsPoint(66.9015, -180.0096));
        __CLR4_5_2jq7jq7lwye433x.R.inc(25583);Assert.assertTrue(geofenceGeometry.containsPoint(66.9015, 179.991));
        __CLR4_5_2jq7jq7lwye433x.R.inc(25584);Assert.assertTrue(!geofenceGeometry.containsPoint(66.8368, -179.8792));

    }finally{__CLR4_5_2jq7jq7lwye433x.R.flushNeeded();}}
    
    @Test
    public void testContainsPolygon0() throws ParseException {__CLR4_5_2jq7jq7lwye433x.R.globalSliceStart(getClass().getName(),25585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qhd9ujqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jq7jq7lwye433x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jq7jq7lwye433x.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolygonTest.testContainsPolygon0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qhd9ujqp() throws ParseException{try{__CLR4_5_2jq7jq7lwye433x.R.inc(25585);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25586);String test = "POLYGON ((51.1966 -0.6207, 51.1897 0.4147, 50.9377 0.5136, 50.8675 -0.6082))";
        __CLR4_5_2jq7jq7lwye433x.R.inc(25587);GeofenceGeometry geofenceGeometry = new GeofencePolygon();
        __CLR4_5_2jq7jq7lwye433x.R.inc(25588);geofenceGeometry.fromWkt(test);
        __CLR4_5_2jq7jq7lwye433x.R.inc(25589);Assert.assertTrue(geofenceGeometry.containsPoint(51.0466, -0.0165));
        __CLR4_5_2jq7jq7lwye433x.R.inc(25590);Assert.assertTrue(geofenceGeometry.containsPoint(51.0466, 0.018));
        __CLR4_5_2jq7jq7lwye433x.R.inc(25591);Assert.assertTrue(!geofenceGeometry.containsPoint(50.9477, 0.5836));

    }finally{__CLR4_5_2jq7jq7lwye433x.R.flushNeeded();}}

}