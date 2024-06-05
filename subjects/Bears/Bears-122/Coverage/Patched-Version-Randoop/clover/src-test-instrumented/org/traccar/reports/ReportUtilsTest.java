/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.reports;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.BaseTest;
import org.traccar.model.Position;
import org.traccar.reports.model.BaseReport;
import org.traccar.reports.model.StopReport;
import org.traccar.reports.model.TripReport;
import org.traccar.reports.model.TripsConfig;

public class ReportUtilsTest extends BaseTest {static class __CLR4_5_2logloglwye696g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384135952L,8589935092L,28210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Date date(String time) throws ParseException {try{__CLR4_5_2logloglwye696g.R.inc(28096);
        __CLR4_5_2logloglwye696g.R.inc(28097);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        __CLR4_5_2logloglwye696g.R.inc(28098);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2logloglwye696g.R.inc(28099);return dateFormat.parse(time);
    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    private Position position(String time, double speed, double totalDistance) throws ParseException {try{__CLR4_5_2logloglwye696g.R.inc(28100);

        __CLR4_5_2logloglwye696g.R.inc(28101);Position position = new Position();

        __CLR4_5_2logloglwye696g.R.inc(28102);if ((((time != null)&&(__CLR4_5_2logloglwye696g.R.iget(28103)!=0|true))||(__CLR4_5_2logloglwye696g.R.iget(28104)==0&false))) {{
            __CLR4_5_2logloglwye696g.R.inc(28105);position.setTime(date(time));
        }
        }__CLR4_5_2logloglwye696g.R.inc(28106);position.setValid(true);
        __CLR4_5_2logloglwye696g.R.inc(28107);position.setSpeed(speed);
        __CLR4_5_2logloglwye696g.R.inc(28108);position.set(Position.KEY_TOTAL_DISTANCE, totalDistance);

        __CLR4_5_2logloglwye696g.R.inc(28109);return position;
    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testCalculateDistance() {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0xnw0lou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testCalculateDistance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0xnw0lou(){try{__CLR4_5_2logloglwye696g.R.inc(28110);
        __CLR4_5_2logloglwye696g.R.inc(28111);Position startPosition = new Position();
        __CLR4_5_2logloglwye696g.R.inc(28112);startPosition.set(Position.KEY_TOTAL_DISTANCE, 500.0);
        __CLR4_5_2logloglwye696g.R.inc(28113);Position endPosition = new Position();
        __CLR4_5_2logloglwye696g.R.inc(28114);endPosition.set(Position.KEY_TOTAL_DISTANCE, 700.0);
        __CLR4_5_2logloglwye696g.R.inc(28115);Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 200.0, 10);
        __CLR4_5_2logloglwye696g.R.inc(28116);startPosition.set(Position.KEY_ODOMETER, 50000);
        __CLR4_5_2logloglwye696g.R.inc(28117);endPosition.set(Position.KEY_ODOMETER, 51000);
        __CLR4_5_2logloglwye696g.R.inc(28118);Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 1000.0, 10);
    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testCalculateSpentFuel() {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvgah5lp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testCalculateSpentFuel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvgah5lp3(){try{__CLR4_5_2logloglwye696g.R.inc(28119);
        __CLR4_5_2logloglwye696g.R.inc(28120);Position startPosition = new Position();
        __CLR4_5_2logloglwye696g.R.inc(28121);Position endPosition = new Position();
        __CLR4_5_2logloglwye696g.R.inc(28122);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), 0.0, 0.01);
        __CLR4_5_2logloglwye696g.R.inc(28123);startPosition.set(Position.KEY_FUEL_LEVEL, 0.7);
        __CLR4_5_2logloglwye696g.R.inc(28124);endPosition.set(Position.KEY_FUEL_LEVEL, 0.5);
        __CLR4_5_2logloglwye696g.R.inc(28125);Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), 0.2, 0.01);
    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testDetectTripsSimple() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28sih2mlpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectTripsSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28sih2mlpa() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28126);

        __CLR4_5_2logloglwye696g.R.inc(28127);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 0, 0),
                position("2016-01-01 00:01:00.000", 0, 0),
                position("2016-01-01 00:02:00.000", 10, 0),
                position("2016-01-01 00:03:00.000", 10, 1000),
                position("2016-01-01 00:04:00.000", 10, 2000),
                position("2016-01-01 00:05:00.000", 0, 3000),
                position("2016-01-01 00:06:00.000", 0, 3000),
                position("2016-01-01 00:07:00.000", 0, 3000));

        __CLR4_5_2logloglwye696g.R.inc(28128);TripsConfig tripsConfig = new TripsConfig(500, 300000, 180000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28129);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, true);

        __CLR4_5_2logloglwye696g.R.inc(28130);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28131);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28132);TripReport itemTrip = (TripReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28133);assertEquals(date("2016-01-01 00:02:00.000"), itemTrip.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28134);assertEquals(date("2016-01-01 00:05:00.000"), itemTrip.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28135);assertEquals(180000, itemTrip.getDuration());
        __CLR4_5_2logloglwye696g.R.inc(28136);assertEquals(10, itemTrip.getAverageSpeed(), 0.01);
        __CLR4_5_2logloglwye696g.R.inc(28137);assertEquals(10, itemTrip.getMaxSpeed(), 0.01);
        __CLR4_5_2logloglwye696g.R.inc(28138);assertEquals(3000, itemTrip.getDistance(), 0.01);

        __CLR4_5_2logloglwye696g.R.inc(28139);result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28140);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28141);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28142);StopReport itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28143);assertEquals(date("2016-01-01 00:05:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28144);assertEquals(date("2016-01-01 00:07:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28145);assertEquals(120000, itemStop.getDuration());

    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testDetectStopsOnly() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8hattlpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectStopsOnly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8hattlpu() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28146);

        __CLR4_5_2logloglwye696g.R.inc(28147);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 0, 0),
                position("2016-01-01 00:01:00.000", 0, 0),
                position("2016-01-01 00:02:00.000", 1, 0),
                position("2016-01-01 00:03:00.000", 0, 0),
                position("2016-01-01 00:04:00.000", 1, 0),
                position("2016-01-01 00:05:00.000", 0, 0));

        __CLR4_5_2logloglwye696g.R.inc(28148);TripsConfig tripsConfig = new TripsConfig(500, 300000, 200000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28149);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28150);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28151);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28152);StopReport itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28153);assertEquals(date("2016-01-01 00:00:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28154);assertEquals(date("2016-01-01 00:05:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28155);assertEquals(300000, itemStop.getDuration());

    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testDetectStopsWithTripCut() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ie9cpulq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectStopsWithTripCut",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ie9cpulq4() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28156);

        __CLR4_5_2logloglwye696g.R.inc(28157);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 0, 0),
                position("2016-01-01 00:01:00.000", 0, 0),
                position("2016-01-01 00:02:00.000", 0, 0),
                position("2016-01-01 00:03:00.000", 0, 0),
                position("2016-01-01 00:04:00.000", 1, 0),
                position("2016-01-01 00:05:00.000", 2, 0));

        __CLR4_5_2logloglwye696g.R.inc(28158);TripsConfig tripsConfig = new TripsConfig(500, 300000, 200000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28159);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28160);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28161);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28162);StopReport itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28163);assertEquals(date("2016-01-01 00:00:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28164);assertEquals(date("2016-01-01 00:04:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28165);assertEquals(240000, itemStop.getDuration());

        __CLR4_5_2logloglwye696g.R.inc(28166);tripsConfig.setGreedyParking(true);

        __CLR4_5_2logloglwye696g.R.inc(28167);result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28168);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28169);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28170);itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28171);assertEquals(date("2016-01-01 00:00:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28172);assertEquals(date("2016-01-01 00:05:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28173);assertEquals(300000, itemStop.getDuration());

    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}
    
    @Test
    public void testDetectStopsStartedFromTrip() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y980rlqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectStopsStartedFromTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y980rlqm() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28174);

        __CLR4_5_2logloglwye696g.R.inc(28175);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 2, 0),
                position("2016-01-01 00:01:00.000", 1, 0),
                position("2016-01-01 00:02:00.000", 0, 0),
                position("2016-01-01 00:03:00.000", 0, 0),
                position("2016-01-01 00:04:00.000", 0, 0),
                position("2016-01-01 00:05:00.000", 0, 0));

        __CLR4_5_2logloglwye696g.R.inc(28176);TripsConfig tripsConfig = new TripsConfig(500, 300000, 200000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28177);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28178);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28179);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28180);StopReport itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28181);assertEquals(date("2016-01-01 00:00:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28182);assertEquals(date("2016-01-01 00:05:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28183);assertEquals(300000, itemStop.getDuration());

    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testDetectStopsMoving() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29fwymplqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectStopsMoving",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29fwymplqw() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28184);

        __CLR4_5_2logloglwye696g.R.inc(28185);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 5, 0),
                position("2016-01-01 00:01:00.000", 5, 0),
                position("2016-01-01 00:02:00.000", 3, 0),
                position("2016-01-01 00:03:00.000", 5, 0),
                position("2016-01-01 00:04:00.000", 5, 0),
                position("2016-01-01 00:05:00.000", 5, 0));

        __CLR4_5_2logloglwye696g.R.inc(28186);TripsConfig tripsConfig = new TripsConfig(500, 300000, 200000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28187);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28188);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28189);assertTrue(result.isEmpty());

    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

    @Test
    public void testDetectTripAndStopByGap() throws ParseException {__CLR4_5_2logloglwye696g.R.globalSliceStart(getClass().getName(),28190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24aeiuxlr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2logloglwye696g.R.rethrow($CLV_t2$);}finally{__CLR4_5_2logloglwye696g.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.ReportUtilsTest.testDetectTripAndStopByGap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24aeiuxlr2() throws ParseException{try{__CLR4_5_2logloglwye696g.R.inc(28190);

        __CLR4_5_2logloglwye696g.R.inc(28191);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 7, 100),
                position("2016-01-01 00:01:00.000", 7, 300),
                position("2016-01-01 00:02:00.000", 5, 500),
                position("2016-01-01 00:03:00.000", 5, 600),
                position("2016-01-01 00:04:00.000", 3, 700),
                position("2016-01-01 00:23:00.000", 2, 700),
                position("2016-01-01 00:24:00.000", 5, 800),
                position("2016-01-01 00:25:00.000", 5, 900));

        __CLR4_5_2logloglwye696g.R.inc(28192);TripsConfig tripsConfig = new TripsConfig(500, 200000, 200000, false, 900000);

        __CLR4_5_2logloglwye696g.R.inc(28193);Collection<? extends BaseReport> result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, true);

        __CLR4_5_2logloglwye696g.R.inc(28194);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28195);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28196);TripReport itemTrip = (TripReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28197);assertEquals(date("2016-01-01 00:00:00.000"), itemTrip.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28198);assertEquals(date("2016-01-01 00:04:00.000"), itemTrip.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28199);assertEquals(240000, itemTrip.getDuration());
        __CLR4_5_2logloglwye696g.R.inc(28200);assertEquals(6.75, itemTrip.getAverageSpeed(), 0.01);
        __CLR4_5_2logloglwye696g.R.inc(28201);assertEquals(7, itemTrip.getMaxSpeed(), 0.01);
        __CLR4_5_2logloglwye696g.R.inc(28202);assertEquals(600, itemTrip.getDistance(), 0.01);

        __CLR4_5_2logloglwye696g.R.inc(28203);result = ReportUtils.detectTripsAndStops(tripsConfig, false, 0.01, data, false);

        __CLR4_5_2logloglwye696g.R.inc(28204);assertNotNull(result);
        __CLR4_5_2logloglwye696g.R.inc(28205);assertFalse(result.isEmpty());

        __CLR4_5_2logloglwye696g.R.inc(28206);StopReport itemStop = (StopReport) result.iterator().next();

        __CLR4_5_2logloglwye696g.R.inc(28207);assertEquals(date("2016-01-01 00:04:00.000"), itemStop.getStartTime());
        __CLR4_5_2logloglwye696g.R.inc(28208);assertEquals(date("2016-01-01 00:23:00.000"), itemStop.getEndTime());
        __CLR4_5_2logloglwye696g.R.inc(28209);assertEquals(1140000, itemStop.getDuration());
    }finally{__CLR4_5_2logloglwye696g.R.flushNeeded();}}

}
