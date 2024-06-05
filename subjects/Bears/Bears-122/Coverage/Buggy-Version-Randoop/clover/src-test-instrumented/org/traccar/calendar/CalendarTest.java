/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.calendar;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Calendar;

import net.fortuna.ical4j.data.ParserException;

public class CalendarTest {static class __CLR4_5_2jkjjkjlwydylun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383780158L,8589935092L,25376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testCalendar() throws IOException, ParserException, ParseException, SQLException {__CLR4_5_2jkjjkjlwydylun.R.globalSliceStart(getClass().getName(),25363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2odnsqfjkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jkjjkjlwydylun.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jkjjkjlwydylun.R.globalSliceEnd(getClass().getName(),"org.traccar.calendar.CalendarTest.testCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2odnsqfjkj() throws IOException, ParserException, ParseException, SQLException{try{__CLR4_5_2jkjjkjlwydylun.R.inc(25363);
        __CLR4_5_2jkjjkjlwydylun.R.inc(25364);String calendarString = "BEGIN:VCALENDAR\n" + 
                "PRODID:-//Mozilla.org/NONSGML Mozilla Calendar V1.1//EN\n" + 
                "VERSION:2.0\n" + 
                "BEGIN:VTIMEZONE\n" + 
                "TZID:Asia/Yekaterinburg\n" + 
                "BEGIN:STANDARD\n" + 
                "TZOFFSETFROM:+0500\n" + 
                "TZOFFSETTO:+0500\n" + 
                "TZNAME:YEKT\n" + 
                "DTSTART:19700101T000000\n" + 
                "END:STANDARD\n" + 
                "END:VTIMEZONE\n" + 
                "BEGIN:VEVENT\n" + 
                "CREATED:20161213T045151Z\n" + 
                "LAST-MODIFIED:20161213T045242Z\n" + 
                "DTSTAMP:20161213T045242Z\n" + 
                "UID:9d000df0-6354-479d-a407-218dac62c7c9\n" + 
                "SUMMARY:Every night\n" + 
                "RRULE:FREQ=DAILY\n" + 
                "DTSTART;TZID=Asia/Yekaterinburg:20161130T230000\n" + 
                "DTEND;TZID=Asia/Yekaterinburg:20161201T070000\n" + 
                "TRANSP:OPAQUE\n" + 
                "END:VEVENT\n" + 
                "END:VCALENDAR";
        __CLR4_5_2jkjjkjlwydylun.R.inc(25365);Calendar calendar = new Calendar();
        __CLR4_5_2jkjjkjlwydylun.R.inc(25366);calendar.setData(calendarString.getBytes());
        __CLR4_5_2jkjjkjlwydylun.R.inc(25367);DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ssX");

        __CLR4_5_2jkjjkjlwydylun.R.inc(25368);Date date = format.parse("2016-12-13 22:59:59+05");
        __CLR4_5_2jkjjkjlwydylun.R.inc(25369);Assert.assertTrue(!calendar.checkMoment(date));
        __CLR4_5_2jkjjkjlwydylun.R.inc(25370);date = format.parse("2016-12-13 23:00:01+05");
        __CLR4_5_2jkjjkjlwydylun.R.inc(25371);Assert.assertTrue(calendar.checkMoment(date));

        __CLR4_5_2jkjjkjlwydylun.R.inc(25372);date = format.parse("2016-12-13 06:59:59+05");
        __CLR4_5_2jkjjkjlwydylun.R.inc(25373);Assert.assertTrue(calendar.checkMoment(date));
        __CLR4_5_2jkjjkjlwydylun.R.inc(25374);date = format.parse("2016-12-13 07:00:01+05");
        __CLR4_5_2jkjjkjlwydylun.R.inc(25375);Assert.assertTrue(!calendar.checkMoment(date));
    }finally{__CLR4_5_2jkjjkjlwydylun.R.flushNeeded();}}
}
