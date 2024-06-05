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
package org.traccar.events;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.traccar.BaseEventHandler;
import org.traccar.Context;
import org.traccar.database.GeofenceManager;
import org.traccar.model.Calendar;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class GeofenceEventHandler extends BaseEventHandler {public static class __CLR4_5_236m36mlwye7b3v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,4172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private GeofenceManager geofenceManager;

    public GeofenceEventHandler() {try{__CLR4_5_236m36mlwye7b3v.R.inc(4126);
        __CLR4_5_236m36mlwye7b3v.R.inc(4127);geofenceManager = Context.getGeofenceManager();
    }finally{__CLR4_5_236m36mlwye7b3v.R.flushNeeded();}}

    @Override
    protected Collection<Event> analyzePosition(Position position) {try{__CLR4_5_236m36mlwye7b3v.R.inc(4128);
        __CLR4_5_236m36mlwye7b3v.R.inc(4129);Device device = Context.getIdentityManager().getById(position.getDeviceId());
        __CLR4_5_236m36mlwye7b3v.R.inc(4130);if ((((device == null)&&(__CLR4_5_236m36mlwye7b3v.R.iget(4131)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4132)==0&false))) {{
            __CLR4_5_236m36mlwye7b3v.R.inc(4133);return null;
        }
        }__CLR4_5_236m36mlwye7b3v.R.inc(4134);if ((((!Context.getIdentityManager().isLatestPosition(position) || !position.getValid())&&(__CLR4_5_236m36mlwye7b3v.R.iget(4135)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4136)==0&false))) {{
            __CLR4_5_236m36mlwye7b3v.R.inc(4137);return null;
        }

        }__CLR4_5_236m36mlwye7b3v.R.inc(4138);List<Long> currentGeofences = geofenceManager.getCurrentDeviceGeofences(position);
        __CLR4_5_236m36mlwye7b3v.R.inc(4139);List<Long> oldGeofences = new ArrayList<>();
        __CLR4_5_236m36mlwye7b3v.R.inc(4140);if ((((device.getGeofenceIds() != null)&&(__CLR4_5_236m36mlwye7b3v.R.iget(4141)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4142)==0&false))) {{
            __CLR4_5_236m36mlwye7b3v.R.inc(4143);oldGeofences.addAll(device.getGeofenceIds());
        }
        }__CLR4_5_236m36mlwye7b3v.R.inc(4144);List<Long> newGeofences = new ArrayList<>(currentGeofences);
        __CLR4_5_236m36mlwye7b3v.R.inc(4145);newGeofences.removeAll(oldGeofences);
        __CLR4_5_236m36mlwye7b3v.R.inc(4146);oldGeofences.removeAll(currentGeofences);

        __CLR4_5_236m36mlwye7b3v.R.inc(4147);device.setGeofenceIds(currentGeofences);

        __CLR4_5_236m36mlwye7b3v.R.inc(4148);Collection<Event> events = new ArrayList<>();
        __CLR4_5_236m36mlwye7b3v.R.inc(4149);for (long geofenceId : newGeofences) {{
            __CLR4_5_236m36mlwye7b3v.R.inc(4150);long calendarId = geofenceManager.getById(geofenceId).getCalendarId();
            __CLR4_5_236m36mlwye7b3v.R.inc(4151);Calendar calendar = (((calendarId != 0 )&&(__CLR4_5_236m36mlwye7b3v.R.iget(4152)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4153)==0&false))? Context.getCalendarManager().getById(calendarId) : null;
            __CLR4_5_236m36mlwye7b3v.R.inc(4154);if ((((calendar == null || calendar.checkMoment(position.getFixTime()))&&(__CLR4_5_236m36mlwye7b3v.R.iget(4155)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4156)==0&false))) {{
                __CLR4_5_236m36mlwye7b3v.R.inc(4157);Event event = new Event(Event.TYPE_GEOFENCE_ENTER, position.getDeviceId(), position.getId());
                __CLR4_5_236m36mlwye7b3v.R.inc(4158);event.setGeofenceId(geofenceId);
                __CLR4_5_236m36mlwye7b3v.R.inc(4159);events.add(event);
            }
        }}
        }__CLR4_5_236m36mlwye7b3v.R.inc(4160);for (long geofenceId : oldGeofences) {{
            __CLR4_5_236m36mlwye7b3v.R.inc(4161);long calendarId = geofenceManager.getById(geofenceId).getCalendarId();
            __CLR4_5_236m36mlwye7b3v.R.inc(4162);Calendar calendar = (((calendarId != 0 )&&(__CLR4_5_236m36mlwye7b3v.R.iget(4163)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4164)==0&false))? Context.getCalendarManager().getById(calendarId) : null;
            __CLR4_5_236m36mlwye7b3v.R.inc(4165);if ((((calendar == null || calendar.checkMoment(position.getFixTime()))&&(__CLR4_5_236m36mlwye7b3v.R.iget(4166)!=0|true))||(__CLR4_5_236m36mlwye7b3v.R.iget(4167)==0&false))) {{
                __CLR4_5_236m36mlwye7b3v.R.inc(4168);Event event = new Event(Event.TYPE_GEOFENCE_EXIT, position.getDeviceId(), position.getId());
                __CLR4_5_236m36mlwye7b3v.R.inc(4169);event.setGeofenceId(geofenceId);
                __CLR4_5_236m36mlwye7b3v.R.inc(4170);events.add(event);
            }
        }}
        }__CLR4_5_236m36mlwye7b3v.R.inc(4171);return events;
    }finally{__CLR4_5_236m36mlwye7b3v.R.flushNeeded();}}
}
