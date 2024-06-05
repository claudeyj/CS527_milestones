/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.channel.Channel;
import org.jboss.netty.util.Timeout;
import org.jboss.netty.util.TimerTask;
import org.traccar.Context;
import org.traccar.GlobalTimer;
import org.traccar.Protocol;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DeviceState;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.reports.ReportUtils;
import org.traccar.reports.model.TripsConfig;

import java.net.SocketAddress;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@java.lang.SuppressWarnings({"fallthrough"}) public class ConnectionManager {public static class __CLR4_5_21nj1njlwydyet6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,2282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long DEFAULT_TIMEOUT = 600;

    private final long deviceTimeout;
    private final boolean enableStatusEvents;
    private TripsConfig tripsConfig = null;

    private final Map<Long, ActiveDevice> activeDevices = new ConcurrentHashMap<>();
    private final Map<Long, Set<UpdateListener>> listeners = new ConcurrentHashMap<>();
    private final Map<Long, Timeout> timeouts = new ConcurrentHashMap<>();

    public ConnectionManager() {try{__CLR4_5_21nj1njlwydyet6.R.inc(2143);
        __CLR4_5_21nj1njlwydyet6.R.inc(2144);deviceTimeout = Context.getConfig().getLong("status.timeout", DEFAULT_TIMEOUT) * 1000;
        __CLR4_5_21nj1njlwydyet6.R.inc(2145);enableStatusEvents = Context.getConfig().getBoolean("event.enable");
        __CLR4_5_21nj1njlwydyet6.R.inc(2146);if ((((Context.getConfig().getBoolean("status.updateDeviceState"))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2147)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2148)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2149);tripsConfig = ReportUtils.initTripsConfig();
        }
    }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public void addActiveDevice(long deviceId, Protocol protocol, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2150);
        __CLR4_5_21nj1njlwydyet6.R.inc(2151);activeDevices.put(deviceId, new ActiveDevice(deviceId, protocol, channel, remoteAddress));
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public void removeActiveDevice(Channel channel) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2152);
        __CLR4_5_21nj1njlwydyet6.R.inc(2153);for (ActiveDevice activeDevice : activeDevices.values()) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2154);if ((((activeDevice.getChannel() == channel)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2155)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2156)==0&false))) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2157);updateDevice(activeDevice.getDeviceId(), Device.STATUS_OFFLINE, null);
                __CLR4_5_21nj1njlwydyet6.R.inc(2158);activeDevices.remove(activeDevice.getDeviceId());
                __CLR4_5_21nj1njlwydyet6.R.inc(2159);break;
            }
        }}
    }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public ActiveDevice getActiveDevice(long deviceId) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2160);
        __CLR4_5_21nj1njlwydyet6.R.inc(2161);return activeDevices.get(deviceId);
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public void updateDevice(final long deviceId, String status, Date time) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2162);
        __CLR4_5_21nj1njlwydyet6.R.inc(2163);Device device = Context.getIdentityManager().getById(deviceId);
        __CLR4_5_21nj1njlwydyet6.R.inc(2164);if ((((device == null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2165)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2166)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2167);return;
        }

        }__CLR4_5_21nj1njlwydyet6.R.inc(2168);String oldStatus = device.getStatus();
        __CLR4_5_21nj1njlwydyet6.R.inc(2169);device.setStatus(status);

        __CLR4_5_21nj1njlwydyet6.R.inc(2170);if ((((enableStatusEvents && !status.equals(oldStatus))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2171)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2172)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2173);String eventType;
            __CLR4_5_21nj1njlwydyet6.R.inc(2174);Event stateEvent = null;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21nj1njlwydyet6.R.inc(2175);switch (status) {
                case Device.STATUS_ONLINE:if (!__CLB4_5_2_bool0) {__CLR4_5_21nj1njlwydyet6.R.inc(2176);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21nj1njlwydyet6.R.inc(2177);eventType = Event.TYPE_DEVICE_ONLINE;
                    __CLR4_5_21nj1njlwydyet6.R.inc(2178);break;
                case Device.STATUS_UNKNOWN:if (!__CLB4_5_2_bool0) {__CLR4_5_21nj1njlwydyet6.R.inc(2179);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21nj1njlwydyet6.R.inc(2180);eventType = Event.TYPE_DEVICE_UNKNOWN;
                    __CLR4_5_21nj1njlwydyet6.R.inc(2181);if ((((tripsConfig != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2182)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2183)==0&false))) {{
                        __CLR4_5_21nj1njlwydyet6.R.inc(2184);stateEvent = updateDeviceState(deviceId);
                    }
                    }__CLR4_5_21nj1njlwydyet6.R.inc(2185);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_21nj1njlwydyet6.R.inc(2186);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21nj1njlwydyet6.R.inc(2187);eventType = Event.TYPE_DEVICE_OFFLINE;
                    __CLR4_5_21nj1njlwydyet6.R.inc(2188);if ((((tripsConfig != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2189)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2190)==0&false))) {{
                        __CLR4_5_21nj1njlwydyet6.R.inc(2191);stateEvent = updateDeviceState(deviceId);
                    }
                    }__CLR4_5_21nj1njlwydyet6.R.inc(2192);break;
            }
            __CLR4_5_21nj1njlwydyet6.R.inc(2193);Set<Event> events = new HashSet<>();
            __CLR4_5_21nj1njlwydyet6.R.inc(2194);if ((((stateEvent != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2195)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2196)==0&false))) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2197);events.add(stateEvent);
            }
            }__CLR4_5_21nj1njlwydyet6.R.inc(2198);events.add(new Event(eventType, deviceId));
            __CLR4_5_21nj1njlwydyet6.R.inc(2199);Context.getNotificationManager().updateEvents(events, null);
        }

        }__CLR4_5_21nj1njlwydyet6.R.inc(2200);Timeout timeout = timeouts.remove(deviceId);
        __CLR4_5_21nj1njlwydyet6.R.inc(2201);if ((((timeout != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2202)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2203)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2204);timeout.cancel();
        }

        }__CLR4_5_21nj1njlwydyet6.R.inc(2205);if ((((time != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2206)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2207)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2208);device.setLastUpdate(time);
        }

        }__CLR4_5_21nj1njlwydyet6.R.inc(2209);if ((((status.equals(Device.STATUS_ONLINE))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2210)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2211)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2212);timeouts.put(deviceId, GlobalTimer.getTimer().newTimeout(new TimerTask() {
                @Override
                public void run(Timeout timeout) throws Exception {try{__CLR4_5_21nj1njlwydyet6.R.inc(2213);
                    __CLR4_5_21nj1njlwydyet6.R.inc(2214);if ((((!timeout.isCancelled())&&(__CLR4_5_21nj1njlwydyet6.R.iget(2215)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2216)==0&false))) {{
                        __CLR4_5_21nj1njlwydyet6.R.inc(2217);updateDevice(deviceId, Device.STATUS_UNKNOWN, null);
                    }
                }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}
            }, deviceTimeout, TimeUnit.MILLISECONDS));
        }

        }__CLR4_5_21nj1njlwydyet6.R.inc(2218);try {
            __CLR4_5_21nj1njlwydyet6.R.inc(2219);Context.getDeviceManager().updateDeviceStatus(device);
        } catch (SQLException error) {
            __CLR4_5_21nj1njlwydyet6.R.inc(2220);Log.warning(error);
        }

        __CLR4_5_21nj1njlwydyet6.R.inc(2221);updateDevice(device);
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public Event updateDeviceState(long deviceId) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2222);
        __CLR4_5_21nj1njlwydyet6.R.inc(2223);DeviceState deviceState = Context.getDeviceManager().getDeviceState(deviceId);
        __CLR4_5_21nj1njlwydyet6.R.inc(2224);if ((((deviceState == null || deviceState.getMotionState() == null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2225)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2226)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2227);return null;
        }
        }__CLR4_5_21nj1njlwydyet6.R.inc(2228);Event result = null;
        __CLR4_5_21nj1njlwydyet6.R.inc(2229);Boolean oldMotion = deviceState.getMotionState();
        __CLR4_5_21nj1njlwydyet6.R.inc(2230);long currentTime = System.currentTimeMillis();
        __CLR4_5_21nj1njlwydyet6.R.inc(2231);boolean newMotion = !oldMotion;
        __CLR4_5_21nj1njlwydyet6.R.inc(2232);Position motionPosition = deviceState.getMotionPosition();
        __CLR4_5_21nj1njlwydyet6.R.inc(2233);if ((((motionPosition != null)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2234)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2235)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2236);long motionTime = motionPosition.getFixTime().getTime()
                    + ((((newMotion )&&(__CLR4_5_21nj1njlwydyet6.R.iget(2237)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2238)==0&false))? tripsConfig.getMinimalTripDuration() : tripsConfig.getMinimalParkingDuration());
            __CLR4_5_21nj1njlwydyet6.R.inc(2239);if ((((motionTime <= currentTime)&&(__CLR4_5_21nj1njlwydyet6.R.iget(2240)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2241)==0&false))) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2242);String eventType = (((newMotion )&&(__CLR4_5_21nj1njlwydyet6.R.iget(2243)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2244)==0&false))? Event.TYPE_DEVICE_MOVING : Event.TYPE_DEVICE_STOPPED;
                __CLR4_5_21nj1njlwydyet6.R.inc(2245);result = new Event(eventType, motionPosition.getDeviceId(), motionPosition.getId());
                __CLR4_5_21nj1njlwydyet6.R.inc(2246);deviceState.setMotionState(newMotion);
                __CLR4_5_21nj1njlwydyet6.R.inc(2247);deviceState.setMotionPosition(null);
            }
        }}
        }__CLR4_5_21nj1njlwydyet6.R.inc(2248);return result;
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public synchronized void updateDevice(Device device) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2249);
        __CLR4_5_21nj1njlwydyet6.R.inc(2250);for (long userId : Context.getPermissionsManager().getDeviceUsers(device.getId())) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2251);if ((((listeners.containsKey(userId))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2252)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2253)==0&false))) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2254);for (UpdateListener listener : listeners.get(userId)) {{
                    __CLR4_5_21nj1njlwydyet6.R.inc(2255);listener.onUpdateDevice(device);
                }
            }}
        }}
    }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public synchronized void updatePosition(Position position) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2256);
        __CLR4_5_21nj1njlwydyet6.R.inc(2257);long deviceId = position.getDeviceId();

        __CLR4_5_21nj1njlwydyet6.R.inc(2258);for (long userId : Context.getPermissionsManager().getDeviceUsers(deviceId)) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2259);if ((((listeners.containsKey(userId))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2260)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2261)==0&false))) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2262);for (UpdateListener listener : listeners.get(userId)) {{
                    __CLR4_5_21nj1njlwydyet6.R.inc(2263);listener.onUpdatePosition(position);
                }
            }}
        }}
    }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public synchronized void updateEvent(long userId, Event event) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2264);
        __CLR4_5_21nj1njlwydyet6.R.inc(2265);if ((((listeners.containsKey(userId))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2266)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2267)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2268);for (UpdateListener listener : listeners.get(userId)) {{
                __CLR4_5_21nj1njlwydyet6.R.inc(2269);listener.onUpdateEvent(event);
            }
        }}
    }}finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public interface UpdateListener {
        void onUpdateDevice(Device device);
        void onUpdatePosition(Position position);
        void onUpdateEvent(Event event);
    }

    public synchronized void addListener(long userId, UpdateListener listener) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2270);
        __CLR4_5_21nj1njlwydyet6.R.inc(2271);if ((((!listeners.containsKey(userId))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2272)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2273)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2274);listeners.put(userId, new HashSet<UpdateListener>());
        }
        }__CLR4_5_21nj1njlwydyet6.R.inc(2275);listeners.get(userId).add(listener);
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

    public synchronized void removeListener(long userId, UpdateListener listener) {try{__CLR4_5_21nj1njlwydyet6.R.inc(2276);
        __CLR4_5_21nj1njlwydyet6.R.inc(2277);if ((((!listeners.containsKey(userId))&&(__CLR4_5_21nj1njlwydyet6.R.iget(2278)!=0|true))||(__CLR4_5_21nj1njlwydyet6.R.iget(2279)==0&false))) {{
            __CLR4_5_21nj1njlwydyet6.R.inc(2280);listeners.put(userId, new HashSet<UpdateListener>());
        }
        }__CLR4_5_21nj1njlwydyet6.R.inc(2281);listeners.get(userId).remove(listener);
    }finally{__CLR4_5_21nj1njlwydyet6.R.flushNeeded();}}

}
