/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@java.lang.SuppressWarnings({"fallthrough"}) public class ConnectionManager {public static class __CLR4_5_21ns1nslx1e0djm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,2248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long DEFAULT_TIMEOUT = 600;

    private final long deviceTimeout;
    private final boolean enableStatusEvents;

    private final Map<Long, ActiveDevice> activeDevices = new ConcurrentHashMap<>();
    private final Map<Long, Set<UpdateListener>> listeners = new ConcurrentHashMap<>();
    private final Map<Long, Timeout> timeouts = new ConcurrentHashMap<>();

    public ConnectionManager() {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2152);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2153);deviceTimeout = Context.getConfig().getLong("status.timeout", DEFAULT_TIMEOUT) * 1000;
        __CLR4_5_21ns1nslx1e0djm.R.inc(2154);enableStatusEvents = Context.getConfig().getBoolean("event.statusHandler");
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public void addActiveDevice(long deviceId, Protocol protocol, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2155);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2156);activeDevices.put(deviceId, new ActiveDevice(deviceId, protocol, channel, remoteAddress));
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public void removeActiveDevice(Channel channel) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2157);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2158);for (ActiveDevice activeDevice : activeDevices.values()) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2159);if ((((activeDevice.getChannel() == channel)&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2160)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2161)==0&false))) {{
                __CLR4_5_21ns1nslx1e0djm.R.inc(2162);updateDevice(activeDevice.getDeviceId(), Device.STATUS_OFFLINE, null);
                __CLR4_5_21ns1nslx1e0djm.R.inc(2163);activeDevices.remove(activeDevice.getDeviceId());
                __CLR4_5_21ns1nslx1e0djm.R.inc(2164);break;
            }
        }}
    }}finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public ActiveDevice getActiveDevice(long deviceId) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2165);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2166);return activeDevices.get(deviceId);
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public void updateDevice(final long deviceId, String status, Date time) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2167);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2168);Device device = Context.getIdentityManager().getDeviceById(deviceId);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2169);if ((((device == null)&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2170)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2171)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2172);return;
        }

        }__CLR4_5_21ns1nslx1e0djm.R.inc(2173);if ((((enableStatusEvents && !status.equals(device.getStatus()))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2174)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2175)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2176);String eventType;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21ns1nslx1e0djm.R.inc(2177);switch (status) {
                case Device.STATUS_ONLINE:if (!__CLB4_5_2_bool0) {__CLR4_5_21ns1nslx1e0djm.R.inc(2178);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2179);eventType = Event.TYPE_DEVICE_ONLINE;
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2180);break;
                case Device.STATUS_UNKNOWN:if (!__CLB4_5_2_bool0) {__CLR4_5_21ns1nslx1e0djm.R.inc(2181);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2182);eventType = Event.TYPE_DEVICE_UNKNOWN;
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2183);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_21ns1nslx1e0djm.R.inc(2184);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2185);eventType = Event.TYPE_DEVICE_OFFLINE;
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2186);break;
            }
            __CLR4_5_21ns1nslx1e0djm.R.inc(2187);Event event = new Event(eventType, deviceId);
            __CLR4_5_21ns1nslx1e0djm.R.inc(2188);if ((((Context.getNotificationManager() != null)&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2189)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2190)==0&false))) {{
                __CLR4_5_21ns1nslx1e0djm.R.inc(2191);Context.getNotificationManager().updateEvent(event, null);
            }
        }}
        }__CLR4_5_21ns1nslx1e0djm.R.inc(2192);device.setStatus(status);

        __CLR4_5_21ns1nslx1e0djm.R.inc(2193);Timeout timeout = timeouts.remove(deviceId);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2194);if ((((timeout != null)&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2195)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2196)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2197);timeout.cancel();
        }

        }__CLR4_5_21ns1nslx1e0djm.R.inc(2198);if ((((time != null)&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2199)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2200)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2201);device.setLastUpdate(time);
        }

        }__CLR4_5_21ns1nslx1e0djm.R.inc(2202);if ((((status.equals(Device.STATUS_ONLINE))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2203)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2204)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2205);timeouts.put(deviceId, GlobalTimer.getTimer().newTimeout(new TimerTask() {
                @Override
                public void run(Timeout timeout) throws Exception {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2206);
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2207);if ((((!timeout.isCancelled())&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2208)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2209)==0&false))) {{
                        __CLR4_5_21ns1nslx1e0djm.R.inc(2210);updateDevice(deviceId, Device.STATUS_UNKNOWN, null);
                    }
                }}finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}
            }, deviceTimeout, TimeUnit.MILLISECONDS));
        }

        }__CLR4_5_21ns1nslx1e0djm.R.inc(2211);try {
            __CLR4_5_21ns1nslx1e0djm.R.inc(2212);Context.getDeviceManager().updateDeviceStatus(device);
        } catch (SQLException error) {
            __CLR4_5_21ns1nslx1e0djm.R.inc(2213);Log.warning(error);
        }

        __CLR4_5_21ns1nslx1e0djm.R.inc(2214);updateDevice(device);
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public synchronized void updateDevice(Device device) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2215);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2216);for (long userId : Context.getPermissionsManager().getDeviceUsers(device.getId())) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2217);if ((((listeners.containsKey(userId))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2218)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2219)==0&false))) {{
                __CLR4_5_21ns1nslx1e0djm.R.inc(2220);for (UpdateListener listener : listeners.get(userId)) {{
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2221);listener.onUpdateDevice(device);
                }
            }}
        }}
    }}finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public synchronized void updatePosition(Position position) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2222);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2223);long deviceId = position.getDeviceId();

        __CLR4_5_21ns1nslx1e0djm.R.inc(2224);for (long userId : Context.getPermissionsManager().getDeviceUsers(deviceId)) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2225);if ((((listeners.containsKey(userId))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2226)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2227)==0&false))) {{
                __CLR4_5_21ns1nslx1e0djm.R.inc(2228);for (UpdateListener listener : listeners.get(userId)) {{
                    __CLR4_5_21ns1nslx1e0djm.R.inc(2229);listener.onUpdatePosition(position);
                }
            }}
        }}
    }}finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public synchronized void updateEvent(long userId, Event event) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2230);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2231);if ((((listeners.containsKey(userId))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2232)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2233)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2234);for (UpdateListener listener : listeners.get(userId)) {{
                __CLR4_5_21ns1nslx1e0djm.R.inc(2235);listener.onUpdateEvent(event);
            }
        }}
    }}finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public interface UpdateListener {
        void onUpdateDevice(Device device);
        void onUpdatePosition(Position position);
        void onUpdateEvent(Event event);
    }

    public synchronized void addListener(long userId, UpdateListener listener) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2236);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2237);if ((((!listeners.containsKey(userId))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2238)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2239)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2240);listeners.put(userId, new HashSet<UpdateListener>());
        }
        }__CLR4_5_21ns1nslx1e0djm.R.inc(2241);listeners.get(userId).add(listener);
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

    public synchronized void removeListener(long userId, UpdateListener listener) {try{__CLR4_5_21ns1nslx1e0djm.R.inc(2242);
        __CLR4_5_21ns1nslx1e0djm.R.inc(2243);if ((((!listeners.containsKey(userId))&&(__CLR4_5_21ns1nslx1e0djm.R.iget(2244)!=0|true))||(__CLR4_5_21ns1nslx1e0djm.R.iget(2245)==0&false))) {{
            __CLR4_5_21ns1nslx1e0djm.R.inc(2246);listeners.put(userId, new HashSet<UpdateListener>());
        }
        }__CLR4_5_21ns1nslx1e0djm.R.inc(2247);listeners.get(userId).remove(listener);
    }finally{__CLR4_5_21ns1nslx1e0djm.R.flushNeeded();}}

}
