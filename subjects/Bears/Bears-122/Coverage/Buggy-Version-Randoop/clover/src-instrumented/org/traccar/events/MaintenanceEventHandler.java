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
package org.traccar.events;

import java.util.Collection;
import java.util.Collections;

import org.traccar.BaseEventHandler;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class MaintenanceEventHandler extends BaseEventHandler {public static class __CLR4_5_238l38llwydyfk3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,4226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String ATTRIBUTE_MAINTENANCE_START = "maintenance.start";
    public static final String ATTRIBUTE_MAINTENANCE_INTERVAL = "maintenance.interval";

    @Override
    protected Collection<Event> analyzePosition(Position position) {try{__CLR4_5_238l38llwydyfk3.R.inc(4197);
        __CLR4_5_238l38llwydyfk3.R.inc(4198);Device device = Context.getIdentityManager().getById(position.getDeviceId());
        __CLR4_5_238l38llwydyfk3.R.inc(4199);if ((((device == null || !Context.getIdentityManager().isLatestPosition(position))&&(__CLR4_5_238l38llwydyfk3.R.iget(4200)!=0|true))||(__CLR4_5_238l38llwydyfk3.R.iget(4201)==0&false))) {{
            __CLR4_5_238l38llwydyfk3.R.inc(4202);return null;
        }

        }__CLR4_5_238l38llwydyfk3.R.inc(4203);double maintenanceInterval = Context.getDeviceManager()
                .lookupAttributeDouble(device.getId(), ATTRIBUTE_MAINTENANCE_INTERVAL, 0, false);
        __CLR4_5_238l38llwydyfk3.R.inc(4204);if ((((maintenanceInterval == 0)&&(__CLR4_5_238l38llwydyfk3.R.iget(4205)!=0|true))||(__CLR4_5_238l38llwydyfk3.R.iget(4206)==0&false))) {{
            __CLR4_5_238l38llwydyfk3.R.inc(4207);return null;
        }
        }__CLR4_5_238l38llwydyfk3.R.inc(4208);double maintenanceStart = Context.getDeviceManager()
                .lookupAttributeDouble(device.getId(), ATTRIBUTE_MAINTENANCE_START, 0, false);

        __CLR4_5_238l38llwydyfk3.R.inc(4209);double oldTotalDistance = 0.0;
        __CLR4_5_238l38llwydyfk3.R.inc(4210);double newTotalDistance = 0.0;

        __CLR4_5_238l38llwydyfk3.R.inc(4211);Position lastPosition = Context.getIdentityManager().getLastPosition(position.getDeviceId());
        __CLR4_5_238l38llwydyfk3.R.inc(4212);if ((((lastPosition != null)&&(__CLR4_5_238l38llwydyfk3.R.iget(4213)!=0|true))||(__CLR4_5_238l38llwydyfk3.R.iget(4214)==0&false))) {{
            __CLR4_5_238l38llwydyfk3.R.inc(4215);oldTotalDistance = lastPosition.getDouble(Position.KEY_TOTAL_DISTANCE);
        }
        }__CLR4_5_238l38llwydyfk3.R.inc(4216);newTotalDistance = position.getDouble(Position.KEY_TOTAL_DISTANCE);

        __CLR4_5_238l38llwydyfk3.R.inc(4217);oldTotalDistance -= maintenanceStart;
        __CLR4_5_238l38llwydyfk3.R.inc(4218);newTotalDistance -= maintenanceStart;

        __CLR4_5_238l38llwydyfk3.R.inc(4219);if (((((long) (oldTotalDistance / maintenanceInterval) < (long) (newTotalDistance / maintenanceInterval))&&(__CLR4_5_238l38llwydyfk3.R.iget(4220)!=0|true))||(__CLR4_5_238l38llwydyfk3.R.iget(4221)==0&false))) {{
            __CLR4_5_238l38llwydyfk3.R.inc(4222);Event event = new Event(Event.TYPE_MAINTENANCE, position.getDeviceId(), position.getId());
            __CLR4_5_238l38llwydyfk3.R.inc(4223);event.set(Position.KEY_TOTAL_DISTANCE, newTotalDistance);
            __CLR4_5_238l38llwydyfk3.R.inc(4224);return Collections.singleton(event);
        }

        }__CLR4_5_238l38llwydyfk3.R.inc(4225);return null;
    }finally{__CLR4_5_238l38llwydyfk3.R.flushNeeded();}}

}
