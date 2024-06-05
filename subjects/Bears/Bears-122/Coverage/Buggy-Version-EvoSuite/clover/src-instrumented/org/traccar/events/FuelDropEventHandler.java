/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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

import org.traccar.BaseEventHandler;
import org.traccar.Context;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.Collection;
import java.util.Collections;

public class FuelDropEventHandler extends BaseEventHandler {public static class __CLR4_5_235w35wlwydw9xw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,4126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String ATTRIBUTE_FUEL_DROP_THRESHOLD = "fuelDropThreshold";

    @Override
    protected Collection<Event> analyzePosition(Position position) {try{__CLR4_5_235w35wlwydw9xw.R.inc(4100);

        __CLR4_5_235w35wlwydw9xw.R.inc(4101);Device device = Context.getIdentityManager().getById(position.getDeviceId());
        __CLR4_5_235w35wlwydw9xw.R.inc(4102);if ((((device == null)&&(__CLR4_5_235w35wlwydw9xw.R.iget(4103)!=0|true))||(__CLR4_5_235w35wlwydw9xw.R.iget(4104)==0&false))) {{
            __CLR4_5_235w35wlwydw9xw.R.inc(4105);return null;
        }
        }__CLR4_5_235w35wlwydw9xw.R.inc(4106);if ((((!Context.getIdentityManager().isLatestPosition(position) || !position.getValid())&&(__CLR4_5_235w35wlwydw9xw.R.iget(4107)!=0|true))||(__CLR4_5_235w35wlwydw9xw.R.iget(4108)==0&false))) {{
            __CLR4_5_235w35wlwydw9xw.R.inc(4109);return null;
        }

        }__CLR4_5_235w35wlwydw9xw.R.inc(4110);double fuelDropThreshold = Context.getDeviceManager()
                .lookupAttributeDouble(device.getId(), ATTRIBUTE_FUEL_DROP_THRESHOLD, 0, false);

        __CLR4_5_235w35wlwydw9xw.R.inc(4111);if ((((fuelDropThreshold > 0)&&(__CLR4_5_235w35wlwydw9xw.R.iget(4112)!=0|true))||(__CLR4_5_235w35wlwydw9xw.R.iget(4113)==0&false))) {{
            __CLR4_5_235w35wlwydw9xw.R.inc(4114);Position lastPosition = Context.getIdentityManager().getLastPosition(position.getDeviceId());
            __CLR4_5_235w35wlwydw9xw.R.inc(4115);if ((((position.getAttributes().containsKey(Position.KEY_FUEL_LEVEL)
                    && lastPosition != null && lastPosition.getAttributes().containsKey(Position.KEY_FUEL_LEVEL))&&(__CLR4_5_235w35wlwydw9xw.R.iget(4116)!=0|true))||(__CLR4_5_235w35wlwydw9xw.R.iget(4117)==0&false))) {{

                __CLR4_5_235w35wlwydw9xw.R.inc(4118);double drop = lastPosition.getDouble(Position.KEY_FUEL_LEVEL)
                        - position.getDouble(Position.KEY_FUEL_LEVEL);
                __CLR4_5_235w35wlwydw9xw.R.inc(4119);if ((((drop >= fuelDropThreshold)&&(__CLR4_5_235w35wlwydw9xw.R.iget(4120)!=0|true))||(__CLR4_5_235w35wlwydw9xw.R.iget(4121)==0&false))) {{
                    __CLR4_5_235w35wlwydw9xw.R.inc(4122);Event event = new Event(Event.TYPE_DEVICE_FUEL_DROP, position.getDeviceId(), position.getId());
                    __CLR4_5_235w35wlwydw9xw.R.inc(4123);event.set(ATTRIBUTE_FUEL_DROP_THRESHOLD, fuelDropThreshold);
                    __CLR4_5_235w35wlwydw9xw.R.inc(4124);return Collections.singleton(event);
                }
            }}
        }}

        }__CLR4_5_235w35wlwydw9xw.R.inc(4125);return null;
    }finally{__CLR4_5_235w35wlwydw9xw.R.flushNeeded();}}

}
