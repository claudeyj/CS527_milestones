/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.helper;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateBuilder {public static class __CLR4_5_242k42klwydygmv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,5335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Calendar calendar;

    public DateBuilder() {
        this(TimeZone.getTimeZone("UTC"));__CLR4_5_242k42klwydygmv.R.inc(5277);try{__CLR4_5_242k42klwydygmv.R.inc(5276);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder(Date time) {
        this(time, TimeZone.getTimeZone("UTC"));__CLR4_5_242k42klwydygmv.R.inc(5279);try{__CLR4_5_242k42klwydygmv.R.inc(5278);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder(TimeZone timeZone) {
        this(new Date(0), timeZone);__CLR4_5_242k42klwydygmv.R.inc(5281);try{__CLR4_5_242k42klwydygmv.R.inc(5280);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder(Date time, TimeZone timeZone) {try{__CLR4_5_242k42klwydygmv.R.inc(5282);
        __CLR4_5_242k42klwydygmv.R.inc(5283);calendar = Calendar.getInstance(timeZone);
        __CLR4_5_242k42klwydygmv.R.inc(5284);calendar.clear();
        __CLR4_5_242k42klwydygmv.R.inc(5285);calendar.setTimeInMillis(time.getTime());
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setYear(int year) {try{__CLR4_5_242k42klwydygmv.R.inc(5286);
        __CLR4_5_242k42klwydygmv.R.inc(5287);if ((((year < 100)&&(__CLR4_5_242k42klwydygmv.R.iget(5288)!=0|true))||(__CLR4_5_242k42klwydygmv.R.iget(5289)==0&false))) {{
            __CLR4_5_242k42klwydygmv.R.inc(5290);year += 2000;
        }
        }__CLR4_5_242k42klwydygmv.R.inc(5291);calendar.set(Calendar.YEAR, year);
        __CLR4_5_242k42klwydygmv.R.inc(5292);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setMonth(int month) {try{__CLR4_5_242k42klwydygmv.R.inc(5293);
        __CLR4_5_242k42klwydygmv.R.inc(5294);calendar.set(Calendar.MONTH, month - 1);
        __CLR4_5_242k42klwydygmv.R.inc(5295);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setDay(int day) {try{__CLR4_5_242k42klwydygmv.R.inc(5296);
        __CLR4_5_242k42klwydygmv.R.inc(5297);calendar.set(Calendar.DAY_OF_MONTH, day);
        __CLR4_5_242k42klwydygmv.R.inc(5298);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setDate(int year, int month, int day) {try{__CLR4_5_242k42klwydygmv.R.inc(5299);
        __CLR4_5_242k42klwydygmv.R.inc(5300);return setYear(year).setMonth(month).setDay(day);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setDateReverse(int day, int month, int year) {try{__CLR4_5_242k42klwydygmv.R.inc(5301);
        __CLR4_5_242k42klwydygmv.R.inc(5302);return setDate(year, month, day);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setCurrentDate() {try{__CLR4_5_242k42klwydygmv.R.inc(5303);
        __CLR4_5_242k42klwydygmv.R.inc(5304);Calendar now = Calendar.getInstance(calendar.getTimeZone());
        __CLR4_5_242k42klwydygmv.R.inc(5305);return setYear(now.get(Calendar.YEAR)).setMonth(now.get(Calendar.MONTH)).setDay(now.get(Calendar.DAY_OF_MONTH));
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setHour(int hour) {try{__CLR4_5_242k42klwydygmv.R.inc(5306);
        __CLR4_5_242k42klwydygmv.R.inc(5307);calendar.set(Calendar.HOUR_OF_DAY, hour);
        __CLR4_5_242k42klwydygmv.R.inc(5308);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setMinute(int minute) {try{__CLR4_5_242k42klwydygmv.R.inc(5309);
        __CLR4_5_242k42klwydygmv.R.inc(5310);calendar.set(Calendar.MINUTE, minute);
        __CLR4_5_242k42klwydygmv.R.inc(5311);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder addMinute(int minute) {try{__CLR4_5_242k42klwydygmv.R.inc(5312);
        __CLR4_5_242k42klwydygmv.R.inc(5313);calendar.add(Calendar.MINUTE, minute);
        __CLR4_5_242k42klwydygmv.R.inc(5314);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setSecond(int second) {try{__CLR4_5_242k42klwydygmv.R.inc(5315);
        __CLR4_5_242k42klwydygmv.R.inc(5316);calendar.set(Calendar.SECOND, second);
        __CLR4_5_242k42klwydygmv.R.inc(5317);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder addSeconds(long seconds) {try{__CLR4_5_242k42klwydygmv.R.inc(5318);
        __CLR4_5_242k42klwydygmv.R.inc(5319);calendar.setTimeInMillis(calendar.getTimeInMillis() + seconds * 1000);
        __CLR4_5_242k42klwydygmv.R.inc(5320);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setMillis(int millis) {try{__CLR4_5_242k42klwydygmv.R.inc(5321);
        __CLR4_5_242k42klwydygmv.R.inc(5322);calendar.set(Calendar.MILLISECOND, millis);
        __CLR4_5_242k42klwydygmv.R.inc(5323);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder addMillis(long millis) {try{__CLR4_5_242k42klwydygmv.R.inc(5324);
        __CLR4_5_242k42klwydygmv.R.inc(5325);calendar.setTimeInMillis(calendar.getTimeInMillis() + millis);
        __CLR4_5_242k42klwydygmv.R.inc(5326);return this;
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setTime(int hour, int minute, int second) {try{__CLR4_5_242k42klwydygmv.R.inc(5327);
        __CLR4_5_242k42klwydygmv.R.inc(5328);return setHour(hour).setMinute(minute).setSecond(second);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setTimeReverse(int second, int minute, int hour) {try{__CLR4_5_242k42klwydygmv.R.inc(5329);
        __CLR4_5_242k42klwydygmv.R.inc(5330);return setHour(hour).setMinute(minute).setSecond(second);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public DateBuilder setTime(int hour, int minute, int second, int millis) {try{__CLR4_5_242k42klwydygmv.R.inc(5331);
        __CLR4_5_242k42klwydygmv.R.inc(5332);return setHour(hour).setMinute(minute).setSecond(second).setMillis(millis);
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

    public Date getDate() {try{__CLR4_5_242k42klwydygmv.R.inc(5333);
        __CLR4_5_242k42klwydygmv.R.inc(5334);return calendar.getTime();
    }finally{__CLR4_5_242k42klwydygmv.R.flushNeeded();}}

}
