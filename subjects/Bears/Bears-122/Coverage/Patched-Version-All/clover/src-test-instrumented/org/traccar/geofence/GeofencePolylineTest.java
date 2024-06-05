/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.geofence;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

public class GeofencePolylineTest {static class __CLR4_5_2jqwjqwlwye7inl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384195687L,8589935092L,25615,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPolylineWkt() throws ParseException {__CLR4_5_2jqwjqwlwye7inl.R.globalSliceStart(getClass().getName(),25592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2itbtudjqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jqwjqwlwye7inl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jqwjqwlwye7inl.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolylineTest.testPolylineWkt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2itbtudjqw() throws ParseException{try{__CLR4_5_2jqwjqwlwye7inl.R.inc(25592);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25593);String test = "LINESTRING (55.75474 37.61823, 55.75513 37.61888, 55.7535 37.6222, 55.75315 37.62165)";
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25594);GeofenceGeometry geofenceGeometry = new GeofencePolyline();
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25595);geofenceGeometry.fromWkt(test);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25596);Assert.assertEquals(geofenceGeometry.toWkt(), test);
    }finally{__CLR4_5_2jqwjqwlwye7inl.R.flushNeeded();}}
    
    @Test
    public void testContainsPolyline1Interval() throws ParseException {__CLR4_5_2jqwjqwlwye7inl.R.globalSliceStart(getClass().getName(),25597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23wecdojr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jqwjqwlwye7inl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jqwjqwlwye7inl.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolylineTest.testContainsPolyline1Interval",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23wecdojr1() throws ParseException{try{__CLR4_5_2jqwjqwlwye7inl.R.inc(25597);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25598);String test = "LINESTRING (56.83777 60.59833, 56.83766 60.5968)";
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25599);GeofenceGeometry geofenceGeometry = new GeofencePolyline(test, 35);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25600);Assert.assertTrue(geofenceGeometry.containsPoint(56.83801, 60.59748));
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25601);((GeofencePolyline) geofenceGeometry).setDistance(15);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25602);Assert.assertTrue(!geofenceGeometry.containsPoint(56.83801, 60.59748));
    }finally{__CLR4_5_2jqwjqwlwye7inl.R.flushNeeded();}}

    @Test
    public void testContainsPolyline3Intervals() throws ParseException {__CLR4_5_2jqwjqwlwye7inl.R.globalSliceStart(getClass().getName(),25603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nbdoq5jr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jqwjqwlwye7inl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jqwjqwlwye7inl.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolylineTest.testContainsPolyline3Intervals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nbdoq5jr7() throws ParseException{try{__CLR4_5_2jqwjqwlwye7inl.R.inc(25603);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25604);String test = "LINESTRING (56.836 60.6126, 56.8393 60.6114, 56.83887 60.60811, 56.83782 60.5988)";
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25605);GeofenceGeometry geofenceGeometry = new GeofencePolyline(test, 15);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25606);Assert.assertTrue(geofenceGeometry.containsPoint(56.83847, 60.60458));
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25607);Assert.assertTrue(!geofenceGeometry.containsPoint(56.83764, 60.59725));
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25608);Assert.assertTrue(!geofenceGeometry.containsPoint(56.83861, 60.60822));

    }finally{__CLR4_5_2jqwjqwlwye7inl.R.flushNeeded();}}
    
    @Test
    public void testContainsPolylineNear180() throws ParseException {__CLR4_5_2jqwjqwlwye7inl.R.globalSliceStart(getClass().getName(),25609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296s4pjrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jqwjqwlwye7inl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jqwjqwlwye7inl.R.globalSliceEnd(getClass().getName(),"org.traccar.geofence.GeofencePolylineTest.testContainsPolylineNear180",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296s4pjrd() throws ParseException{try{__CLR4_5_2jqwjqwlwye7inl.R.inc(25609);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25610);String test = "LINESTRING (66.9494 179.838, 66.9508 -179.8496)";
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25611);GeofenceGeometry geofenceGeometry = new GeofencePolyline(test, 25);
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25612);Assert.assertTrue(geofenceGeometry.containsPoint(66.95, 180.0));
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25613);Assert.assertTrue(!geofenceGeometry.containsPoint(66.96, 180.0));
        __CLR4_5_2jqwjqwlwye7inl.R.inc(25614);Assert.assertTrue(!geofenceGeometry.containsPoint(66.9509, -179.83));
    }finally{__CLR4_5_2jqwjqwlwye7inl.R.flushNeeded();}}
}
