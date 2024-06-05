/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
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
import org.traccar.model.DeviceState;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.reports.ReportUtils;
import org.traccar.reports.model.TripsConfig;

public class MotionEventHandler extends BaseEventHandler {public static class __CLR4_5_239e39elwye3whr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,4292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private TripsConfig tripsConfig;

    public MotionEventHandler() {try{__CLR4_5_239e39elwye3whr.R.inc(4226);
        __CLR4_5_239e39elwye3whr.R.inc(4227);tripsConfig = ReportUtils.initTripsConfig();
    }finally{__CLR4_5_239e39elwye3whr.R.flushNeeded();}}

    public static Event updateMotionState(DeviceState deviceState, Position position, TripsConfig tripsConfig) {try{__CLR4_5_239e39elwye3whr.R.inc(4228);
        __CLR4_5_239e39elwye3whr.R.inc(4229);Event result = null;
        __CLR4_5_239e39elwye3whr.R.inc(4230);Boolean oldMotion = deviceState.getMotionState();

        __CLR4_5_239e39elwye3whr.R.inc(4231);long currentTime = position.getFixTime().getTime();
        __CLR4_5_239e39elwye3whr.R.inc(4232);boolean newMotion = position.getBoolean(Position.KEY_MOTION);
        __CLR4_5_239e39elwye3whr.R.inc(4233);if ((((newMotion != oldMotion)&&(__CLR4_5_239e39elwye3whr.R.iget(4234)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4235)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4236);if ((((deviceState.getMotionPosition() == null)&&(__CLR4_5_239e39elwye3whr.R.iget(4237)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4238)==0&false))) {{
                __CLR4_5_239e39elwye3whr.R.inc(4239);deviceState.setMotionPosition(position);
            }
        }} }else {{
            __CLR4_5_239e39elwye3whr.R.inc(4240);deviceState.setMotionPosition(null);
        }

        }__CLR4_5_239e39elwye3whr.R.inc(4241);Position motionPosition = deviceState.getMotionPosition();
        __CLR4_5_239e39elwye3whr.R.inc(4242);if ((((motionPosition != null)&&(__CLR4_5_239e39elwye3whr.R.iget(4243)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4244)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4245);long motionTime = motionPosition.getFixTime().getTime();
            __CLR4_5_239e39elwye3whr.R.inc(4246);double distance = ReportUtils.calculateDistance(motionPosition, position, false);
            __CLR4_5_239e39elwye3whr.R.inc(4247);if ((((newMotion)&&(__CLR4_5_239e39elwye3whr.R.iget(4248)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4249)==0&false))) {{
                __CLR4_5_239e39elwye3whr.R.inc(4250);if ((((motionTime + tripsConfig.getMinimalTripDuration() <= currentTime
                        || distance >= tripsConfig.getMinimalTripDistance())&&(__CLR4_5_239e39elwye3whr.R.iget(4251)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4252)==0&false))) {{
                    __CLR4_5_239e39elwye3whr.R.inc(4253);result = new Event(Event.TYPE_DEVICE_MOVING, motionPosition.getDeviceId(),
                            motionPosition.getId());
                    __CLR4_5_239e39elwye3whr.R.inc(4254);deviceState.setMotionState(true);
                    __CLR4_5_239e39elwye3whr.R.inc(4255);deviceState.setMotionPosition(null);
                }
            }} }else {{
                __CLR4_5_239e39elwye3whr.R.inc(4256);if ((((motionTime + tripsConfig.getMinimalParkingDuration() <= currentTime)&&(__CLR4_5_239e39elwye3whr.R.iget(4257)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4258)==0&false))) {{
                    __CLR4_5_239e39elwye3whr.R.inc(4259);result = new Event(Event.TYPE_DEVICE_STOPPED, motionPosition.getDeviceId(),
                            motionPosition.getId());
                    __CLR4_5_239e39elwye3whr.R.inc(4260);deviceState.setMotionState(false);
                    __CLR4_5_239e39elwye3whr.R.inc(4261);deviceState.setMotionPosition(null);
                }
            }}
        }}
        }__CLR4_5_239e39elwye3whr.R.inc(4262);return result;
    }finally{__CLR4_5_239e39elwye3whr.R.flushNeeded();}}

    @Override
    protected Collection<Event> analyzePosition(Position position) {try{__CLR4_5_239e39elwye3whr.R.inc(4263);

        __CLR4_5_239e39elwye3whr.R.inc(4264);Device device = Context.getIdentityManager().getById(position.getDeviceId());
        __CLR4_5_239e39elwye3whr.R.inc(4265);if ((((device == null)&&(__CLR4_5_239e39elwye3whr.R.iget(4266)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4267)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4268);return null;
        }
        }__CLR4_5_239e39elwye3whr.R.inc(4269);if ((((!Context.getIdentityManager().isLatestPosition(position) || !position.getValid())&&(__CLR4_5_239e39elwye3whr.R.iget(4270)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4271)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4272);return null;
        }

        }__CLR4_5_239e39elwye3whr.R.inc(4273);Event result = null;

        __CLR4_5_239e39elwye3whr.R.inc(4274);long deviceId = position.getDeviceId();
        __CLR4_5_239e39elwye3whr.R.inc(4275);DeviceState deviceState = Context.getDeviceManager().getDeviceState(deviceId);

        __CLR4_5_239e39elwye3whr.R.inc(4276);if ((((deviceState == null)&&(__CLR4_5_239e39elwye3whr.R.iget(4277)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4278)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4279);deviceState = new DeviceState();
            __CLR4_5_239e39elwye3whr.R.inc(4280);deviceState.setMotionState(position.getBoolean(Position.KEY_MOTION));
        } }else {__CLR4_5_239e39elwye3whr.R.inc(4281);if ((((deviceState.getMotionState() == null)&&(__CLR4_5_239e39elwye3whr.R.iget(4282)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4283)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4284);deviceState.setMotionState(position.getBoolean(Position.KEY_MOTION));
        } }else {{
            __CLR4_5_239e39elwye3whr.R.inc(4285);result = updateMotionState(deviceState, position, tripsConfig);
        }
        }}__CLR4_5_239e39elwye3whr.R.inc(4286);Context.getDeviceManager().setDeviceState(deviceId, deviceState);
        __CLR4_5_239e39elwye3whr.R.inc(4287);if ((((result != null)&&(__CLR4_5_239e39elwye3whr.R.iget(4288)!=0|true))||(__CLR4_5_239e39elwye3whr.R.iget(4289)==0&false))) {{
            __CLR4_5_239e39elwye3whr.R.inc(4290);return Collections.singleton(result);
        }
        }__CLR4_5_239e39elwye3whr.R.inc(4291);return null;
    }finally{__CLR4_5_239e39elwye3whr.R.flushNeeded();}}

}
