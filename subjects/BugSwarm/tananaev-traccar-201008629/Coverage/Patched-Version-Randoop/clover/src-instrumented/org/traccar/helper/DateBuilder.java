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

public class DateBuilder {public static class __CLR4_5_23pp3pplx1e0f6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,4872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Calendar calendar;

    public DateBuilder() {
        this(TimeZone.getTimeZone("UTC"));__CLR4_5_23pp3pplx1e0f6m.R.inc(4814);try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4813);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder(Date time) {
        this(time, TimeZone.getTimeZone("UTC"));__CLR4_5_23pp3pplx1e0f6m.R.inc(4816);try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4815);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder(TimeZone timeZone) {
        this(new Date(0), timeZone);__CLR4_5_23pp3pplx1e0f6m.R.inc(4818);try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4817);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder(Date time, TimeZone timeZone) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4819);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4820);calendar = Calendar.getInstance(timeZone);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4821);calendar.clear();
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4822);calendar.setTimeInMillis(time.getTime());
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setYear(int year) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4823);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4824);if ((((year < 100)&&(__CLR4_5_23pp3pplx1e0f6m.R.iget(4825)!=0|true))||(__CLR4_5_23pp3pplx1e0f6m.R.iget(4826)==0&false))) {{
            __CLR4_5_23pp3pplx1e0f6m.R.inc(4827);year += 2000;
        }
        }__CLR4_5_23pp3pplx1e0f6m.R.inc(4828);calendar.set(Calendar.YEAR, year);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4829);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setMonth(int month) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4830);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4831);calendar.set(Calendar.MONTH, month - 1);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4832);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setDay(int day) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4833);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4834);calendar.set(Calendar.DAY_OF_MONTH, day);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4835);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setDate(int year, int month, int day) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4836);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4837);return setYear(year).setMonth(month).setDay(day);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setDateReverse(int day, int month, int year) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4838);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4839);return setDate(year, month, day);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setCurrentDate() {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4840);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4841);Calendar now = Calendar.getInstance(calendar.getTimeZone());
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4842);return setYear(now.get(Calendar.YEAR)).setMonth(now.get(Calendar.MONTH)).setDay(now.get(Calendar.DAY_OF_MONTH));
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setHour(int hour) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4843);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4844);calendar.set(Calendar.HOUR_OF_DAY, hour);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4845);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setMinute(int minute) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4846);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4847);calendar.set(Calendar.MINUTE, minute);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4848);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder addMinute(int minute) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4849);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4850);calendar.add(Calendar.MINUTE, minute);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4851);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setSecond(int second) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4852);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4853);calendar.set(Calendar.SECOND, second);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4854);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder addSeconds(long seconds) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4855);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4856);calendar.setTimeInMillis(calendar.getTimeInMillis() + seconds * 1000);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4857);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setMillis(int millis) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4858);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4859);calendar.set(Calendar.MILLISECOND, millis);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4860);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder addMillis(long millis) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4861);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4862);calendar.setTimeInMillis(calendar.getTimeInMillis() + millis);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4863);return this;
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setTime(int hour, int minute, int second) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4864);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4865);return setHour(hour).setMinute(minute).setSecond(second);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setTimeReverse(int second, int minute, int hour) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4866);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4867);return setHour(hour).setMinute(minute).setSecond(second);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public DateBuilder setTime(int hour, int minute, int second, int millis) {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4868);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4869);return setHour(hour).setMinute(minute).setSecond(second).setMillis(millis);
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

    public Date getDate() {try{__CLR4_5_23pp3pplx1e0f6m.R.inc(4870);
        __CLR4_5_23pp3pplx1e0f6m.R.inc(4871);return calendar.getTime();
    }finally{__CLR4_5_23pp3pplx1e0f6m.R.flushNeeded();}}

}
