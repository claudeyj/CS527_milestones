/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.filter.Filter;
import net.fortuna.ical4j.filter.PeriodRule;
import net.fortuna.ical4j.filter.Rule;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Period;
import net.fortuna.ical4j.model.component.CalendarComponent;

public class Calendar extends Extensible {public static class __CLR4_5_246y46ylx1dwh5b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,5459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String name;

    public String getName() {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5434);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5435);return name;
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5436);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5437);this.name = name;
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}

    private byte[] data;

    public byte[] getData() {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5438);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5439);return data.clone();
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}

    public void setData(byte[] data) throws IOException, ParserException {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5440);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5441);CalendarBuilder builder = new CalendarBuilder();
        __CLR4_5_246y46ylx1dwh5b.R.inc(5442);calendar = builder.build(new ByteArrayInputStream(data));
        __CLR4_5_246y46ylx1dwh5b.R.inc(5443);this.data = data.clone();
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}

    private net.fortuna.ical4j.model.Calendar calendar;

    @JsonIgnore
    public net.fortuna.ical4j.model.Calendar getCalendar() {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5444);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5445);return calendar;
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}

    public boolean checkMoment(Date date) {try{__CLR4_5_246y46ylx1dwh5b.R.inc(5446);
        __CLR4_5_246y46ylx1dwh5b.R.inc(5447);if ((((calendar != null)&&(__CLR4_5_246y46ylx1dwh5b.R.iget(5448)!=0|true))||(__CLR4_5_246y46ylx1dwh5b.R.iget(5449)==0&false))) {{
            __CLR4_5_246y46ylx1dwh5b.R.inc(5450);Period period = new Period(new DateTime(date), new Dur(0, 0, 0, 0));
            __CLR4_5_246y46ylx1dwh5b.R.inc(5451);Rule<CalendarComponent> periodRule = new PeriodRule<>(period);
            __CLR4_5_246y46ylx1dwh5b.R.inc(5452);Filter<CalendarComponent> filter = new Filter<>(new Rule[] {periodRule}, Filter.MATCH_ANY);
            __CLR4_5_246y46ylx1dwh5b.R.inc(5453);Collection<CalendarComponent> events = filter.filter(calendar.getComponents(CalendarComponent.VEVENT));
            __CLR4_5_246y46ylx1dwh5b.R.inc(5454);if ((((events != null && !events.isEmpty())&&(__CLR4_5_246y46ylx1dwh5b.R.iget(5455)!=0|true))||(__CLR4_5_246y46ylx1dwh5b.R.iget(5456)==0&false))) {{
                __CLR4_5_246y46ylx1dwh5b.R.inc(5457);return true;
            }
        }}
        }__CLR4_5_246y46ylx1dwh5b.R.inc(5458);return false;
    }finally{__CLR4_5_246y46ylx1dwh5b.R.flushNeeded();}}
}