/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 - 2017 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.database;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Calendar;
import org.traccar.model.CalendarPermission;

public class CalendarManager {public static class __CLR4_5_21m91m9lx1dva43{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,2152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private final Map<Long, Calendar> calendars = new ConcurrentHashMap<>();
    private final Map<Long, Set<Long>> userCalendars = new ConcurrentHashMap<>();

    public CalendarManager(DataManager dataManager) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2097);
        __CLR4_5_21m91m9lx1dva43.R.inc(2098);this.dataManager = dataManager;
        __CLR4_5_21m91m9lx1dva43.R.inc(2099);refreshCalendars();
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public final void refreshCalendars() {try{__CLR4_5_21m91m9lx1dva43.R.inc(2100);
        __CLR4_5_21m91m9lx1dva43.R.inc(2101);if ((((dataManager != null)&&(__CLR4_5_21m91m9lx1dva43.R.iget(2102)!=0|true))||(__CLR4_5_21m91m9lx1dva43.R.iget(2103)==0&false))) {{
            __CLR4_5_21m91m9lx1dva43.R.inc(2104);try {
                __CLR4_5_21m91m9lx1dva43.R.inc(2105);calendars.clear();
                __CLR4_5_21m91m9lx1dva43.R.inc(2106);for (Calendar calendar : dataManager.getCalendars()) {{
                    __CLR4_5_21m91m9lx1dva43.R.inc(2107);calendars.put(calendar.getId(), calendar);
                }
            }} catch (SQLException error) {
                __CLR4_5_21m91m9lx1dva43.R.inc(2108);Log.warning(error);
            }
        }
        }__CLR4_5_21m91m9lx1dva43.R.inc(2109);refreshUserCalendars();
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    private Set<Long> getUserCalendarIds(long userId) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2110);
        __CLR4_5_21m91m9lx1dva43.R.inc(2111);if ((((!userCalendars.containsKey(userId))&&(__CLR4_5_21m91m9lx1dva43.R.iget(2112)!=0|true))||(__CLR4_5_21m91m9lx1dva43.R.iget(2113)==0&false))) {{
            __CLR4_5_21m91m9lx1dva43.R.inc(2114);userCalendars.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_21m91m9lx1dva43.R.inc(2115);return userCalendars.get(userId);
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public Collection<Calendar> getUserCalendars(long userId) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2116);
        __CLR4_5_21m91m9lx1dva43.R.inc(2117);ArrayList<Calendar> result = new ArrayList<>();
        __CLR4_5_21m91m9lx1dva43.R.inc(2118);for (long calendarId : getUserCalendarIds(userId)) {{
            __CLR4_5_21m91m9lx1dva43.R.inc(2119);result.add(calendars.get(calendarId));
        }
        }__CLR4_5_21m91m9lx1dva43.R.inc(2120);return result;
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public Collection<Calendar> getManagedCalendars(long userId) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2121);
        __CLR4_5_21m91m9lx1dva43.R.inc(2122);ArrayList<Calendar> result = new ArrayList<>();
        __CLR4_5_21m91m9lx1dva43.R.inc(2123);result.addAll(getUserCalendars(userId));
        __CLR4_5_21m91m9lx1dva43.R.inc(2124);for (long managedUserId : Context.getPermissionsManager().getUserPermissions(userId)) {{
            __CLR4_5_21m91m9lx1dva43.R.inc(2125);result.addAll(getUserCalendars(managedUserId));
        }
        }__CLR4_5_21m91m9lx1dva43.R.inc(2126);return result;
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public final void refreshUserCalendars() {try{__CLR4_5_21m91m9lx1dva43.R.inc(2127);
        __CLR4_5_21m91m9lx1dva43.R.inc(2128);if ((((dataManager != null)&&(__CLR4_5_21m91m9lx1dva43.R.iget(2129)!=0|true))||(__CLR4_5_21m91m9lx1dva43.R.iget(2130)==0&false))) {{
            __CLR4_5_21m91m9lx1dva43.R.inc(2131);try {
                __CLR4_5_21m91m9lx1dva43.R.inc(2132);userCalendars.clear();
                __CLR4_5_21m91m9lx1dva43.R.inc(2133);for (CalendarPermission calendarsPermission : dataManager.getCalendarPermissions()) {{
                    __CLR4_5_21m91m9lx1dva43.R.inc(2134);getUserCalendarIds(calendarsPermission.getUserId()).add(calendarsPermission.getCalendarId());
                }
            }} catch (SQLException error) {
                __CLR4_5_21m91m9lx1dva43.R.inc(2135);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public Calendar getCalendar(long calendarId) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2136);
        __CLR4_5_21m91m9lx1dva43.R.inc(2137);return calendars.get(calendarId);
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public final void addCalendar(Calendar calendar) throws SQLException {try{__CLR4_5_21m91m9lx1dva43.R.inc(2138);
        __CLR4_5_21m91m9lx1dva43.R.inc(2139);dataManager.addCalendar(calendar);
        __CLR4_5_21m91m9lx1dva43.R.inc(2140);calendars.put(calendar.getId(), calendar);
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public final void updateCalendar(Calendar calendar) throws SQLException {try{__CLR4_5_21m91m9lx1dva43.R.inc(2141);
        __CLR4_5_21m91m9lx1dva43.R.inc(2142);dataManager.updateCalendar(calendar);
        __CLR4_5_21m91m9lx1dva43.R.inc(2143);calendars.put(calendar.getId(), calendar);
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public final void removeCalendar(long calendarId) throws SQLException {try{__CLR4_5_21m91m9lx1dva43.R.inc(2144);
        __CLR4_5_21m91m9lx1dva43.R.inc(2145);dataManager.removeCalendar(calendarId);
        __CLR4_5_21m91m9lx1dva43.R.inc(2146);calendars.remove(calendarId);
        __CLR4_5_21m91m9lx1dva43.R.inc(2147);refreshUserCalendars();
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public Collection<Calendar> getAllCalendars() {try{__CLR4_5_21m91m9lx1dva43.R.inc(2148);
        __CLR4_5_21m91m9lx1dva43.R.inc(2149);return calendars.values();
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}

    public boolean checkCalendar(long userId, long calendarId) {try{__CLR4_5_21m91m9lx1dva43.R.inc(2150);
        __CLR4_5_21m91m9lx1dva43.R.inc(2151);return getUserCalendarIds(userId).contains(calendarId);
    }finally{__CLR4_5_21m91m9lx1dva43.R.flushNeeded();}}
}
