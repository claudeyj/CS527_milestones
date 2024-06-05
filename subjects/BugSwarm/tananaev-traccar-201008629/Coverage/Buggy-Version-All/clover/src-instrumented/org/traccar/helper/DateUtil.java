/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class DateUtil {public static class __CLR4_5_23rc3rclx1dxmiq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,4904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeFormatter DATE_FORMAT = ISODateTimeFormat.dateTimeParser();

    private DateUtil() {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4872);
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    public static Date correctDay(Date guess) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4873);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4874);return correctDate(new Date(), guess, Calendar.DAY_OF_MONTH);
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    public static Date correctYear(Date guess) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4875);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4876);return correctDate(new Date(), guess, Calendar.YEAR);
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    public static Date correctDate(Date now, Date guess, int field) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4877);

        __CLR4_5_23rc3rclx1dxmiq.R.inc(4878);if ((((guess.getTime() > now.getTime())&&(__CLR4_5_23rc3rclx1dxmiq.R.iget(4879)!=0|true))||(__CLR4_5_23rc3rclx1dxmiq.R.iget(4880)==0&false))) {{
            __CLR4_5_23rc3rclx1dxmiq.R.inc(4881);Date previous = dateAdd(guess, field, -1);
            __CLR4_5_23rc3rclx1dxmiq.R.inc(4882);if ((((now.getTime() - previous.getTime() < guess.getTime() - now.getTime())&&(__CLR4_5_23rc3rclx1dxmiq.R.iget(4883)!=0|true))||(__CLR4_5_23rc3rclx1dxmiq.R.iget(4884)==0&false))) {{
                __CLR4_5_23rc3rclx1dxmiq.R.inc(4885);return previous;
            }
        }} }else {__CLR4_5_23rc3rclx1dxmiq.R.inc(4886);if ((((guess.getTime() < now.getTime())&&(__CLR4_5_23rc3rclx1dxmiq.R.iget(4887)!=0|true))||(__CLR4_5_23rc3rclx1dxmiq.R.iget(4888)==0&false))) {{
            __CLR4_5_23rc3rclx1dxmiq.R.inc(4889);Date next = dateAdd(guess, field, 1);
            __CLR4_5_23rc3rclx1dxmiq.R.inc(4890);if ((((next.getTime() - now.getTime() < now.getTime() - guess.getTime())&&(__CLR4_5_23rc3rclx1dxmiq.R.iget(4891)!=0|true))||(__CLR4_5_23rc3rclx1dxmiq.R.iget(4892)==0&false))) {{
                __CLR4_5_23rc3rclx1dxmiq.R.inc(4893);return next;
            }
        }}

        }}__CLR4_5_23rc3rclx1dxmiq.R.inc(4894);return guess;
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    private static Date dateAdd(Date guess, int field, int amount) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4895);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4896);Calendar calendar = Calendar.getInstance();
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4897);calendar.setTime(guess);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4898);calendar.add(field, amount);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4899);return calendar.getTime();
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    public static Date parseDate(String value) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4900);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4901);return DATE_FORMAT.parseDateTime(value).toDate();
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

    public static DateTime parseDateTime(String value) {try{__CLR4_5_23rc3rclx1dxmiq.R.inc(4902);
        __CLR4_5_23rc3rclx1dxmiq.R.inc(4903);return DATE_FORMAT.withOffsetParsed().parseDateTime(value);
    }finally{__CLR4_5_23rc3rclx1dxmiq.R.flushNeeded();}}

}
