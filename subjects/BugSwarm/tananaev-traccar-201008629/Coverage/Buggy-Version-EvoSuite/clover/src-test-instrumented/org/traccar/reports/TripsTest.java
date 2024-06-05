/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.reports;

import org.junit.Test;
import org.traccar.BaseTest;
import org.traccar.model.Position;
import org.traccar.reports.model.TripReport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TripsTest extends BaseTest {static class __CLR4_5_2jphjphlx1dvhbl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565031597L,8589935092L,25567,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Date date(String time) throws ParseException {try{__CLR4_5_2jphjphlx1dvhbl.R.inc(25541);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25542);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25543);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25544);return dateFormat.parse(time);
    }finally{__CLR4_5_2jphjphlx1dvhbl.R.flushNeeded();}}

    private Position position(String time, double speed, double totalDistance) throws ParseException {try{__CLR4_5_2jphjphlx1dvhbl.R.inc(25545);

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25546);Position position = new Position();

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25547);if ((((time != null)&&(__CLR4_5_2jphjphlx1dvhbl.R.iget(25548)!=0|true))||(__CLR4_5_2jphjphlx1dvhbl.R.iget(25549)==0&false))) {{
            __CLR4_5_2jphjphlx1dvhbl.R.inc(25550);position.setTime(date(time));
        }
        }__CLR4_5_2jphjphlx1dvhbl.R.inc(25551);position.setValid(true);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25552);position.setSpeed(speed);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25553);position.set(Position.KEY_TOTAL_DISTANCE, totalDistance);

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25554);return position;
    }finally{__CLR4_5_2jphjphlx1dvhbl.R.flushNeeded();}}

    @Test
    public void testDetectTripsSimple() throws ParseException {__CLR4_5_2jphjphlx1dvhbl.R.globalSliceStart(getClass().getName(),25555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28sih2mjpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jphjphlx1dvhbl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jphjphlx1dvhbl.R.globalSliceEnd(getClass().getName(),"org.traccar.reports.TripsTest.testDetectTripsSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28sih2mjpv() throws ParseException{try{__CLR4_5_2jphjphlx1dvhbl.R.inc(25555);

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25556);Collection<Position> data = Arrays.asList(
                position("2016-01-01 00:00:00.000", 0, 0),
                position("2016-01-01 00:01:00.000", 0, 0),
                position("2016-01-01 00:02:00.000", 10, 0),
                position("2016-01-01 00:03:00.000", 10, 1000),
                position("2016-01-01 00:04:00.000", 10, 2000),
                position("2016-01-01 00:05:00.000", 0, 3000),
                position("2016-01-01 00:06:00.000", 0, 3000));

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25557);Collection<TripReport> result = Trips.detectTrips(0.01, 500, 300000, 300000, false, false, data);

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25558);assertNotNull(result);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25559);assertFalse(result.isEmpty());

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25560);TripReport item = result.iterator().next();

        __CLR4_5_2jphjphlx1dvhbl.R.inc(25561);assertEquals(date("2016-01-01 00:02:00.000"), item.getStartTime());
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25562);assertEquals(date("2016-01-01 00:05:00.000"), item.getEndTime());
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25563);assertEquals(180000, item.getDuration());
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25564);assertEquals(10, item.getAverageSpeed(), 0.01);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25565);assertEquals(10, item.getMaxSpeed(), 0.01);
        __CLR4_5_2jphjphlx1dvhbl.R.inc(25566);assertEquals(3000, item.getDistance(), 0.01);

    }finally{__CLR4_5_2jphjphlx1dvhbl.R.flushNeeded();}}

}
