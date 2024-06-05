/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jboss.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class ConnectionManager {public static class __CLR4_5_2kdkdlx1e727w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<Long, ActiveDevice> activeDevices = new HashMap<>();
    private final Map<Long, Position> positions = new HashMap<>();
    private final Map<Long, Set<DataCacheListener>> listeners = new HashMap<>();
    
    public ConnectionManager(DataManager dataManager) {try{__CLR4_5_2kdkdlx1e727w.R.inc(733);
        __CLR4_5_2kdkdlx1e727w.R.inc(734);if ((((dataManager != null)&&(__CLR4_5_2kdkdlx1e727w.R.iget(735)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(736)==0&false))) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(737);try {
                __CLR4_5_2kdkdlx1e727w.R.inc(738);for (Position position : dataManager.getLatestPositions()) {{
                    __CLR4_5_2kdkdlx1e727w.R.inc(739);this.positions.put(position.getDeviceId(), position);
                }
            }} catch (SQLException error) {
                __CLR4_5_2kdkdlx1e727w.R.inc(740);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}

    public void setActiveDevice(long deviceId, Protocol protocol, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2kdkdlx1e727w.R.inc(741);
        __CLR4_5_2kdkdlx1e727w.R.inc(742);activeDevices.put(deviceId, new ActiveDevice(deviceId, protocol, channel, remoteAddress));
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public void removeActiveDevice(Channel channel) {try{__CLR4_5_2kdkdlx1e727w.R.inc(743);
        __CLR4_5_2kdkdlx1e727w.R.inc(744);for (ActiveDevice activeDevice : activeDevices.values()) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(745);if ((((activeDevice.getChannel() == channel)&&(__CLR4_5_2kdkdlx1e727w.R.iget(746)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(747)==0&false))) {{
                __CLR4_5_2kdkdlx1e727w.R.inc(748);activeDevices.remove(activeDevice.getDeviceId());
                __CLR4_5_2kdkdlx1e727w.R.inc(749);break;
            }
        }}
    }}finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}

    public ActiveDevice getActiveDevice(long deviceId) {try{__CLR4_5_2kdkdlx1e727w.R.inc(750);
        __CLR4_5_2kdkdlx1e727w.R.inc(751);return activeDevices.get(deviceId);
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}

    public synchronized void update(Position position) {try{__CLR4_5_2kdkdlx1e727w.R.inc(752);
        __CLR4_5_2kdkdlx1e727w.R.inc(753);long deviceId = position.getDeviceId();
        __CLR4_5_2kdkdlx1e727w.R.inc(754);positions.put(deviceId, position);
        __CLR4_5_2kdkdlx1e727w.R.inc(755);if ((((listeners.containsKey(deviceId))&&(__CLR4_5_2kdkdlx1e727w.R.iget(756)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(757)==0&false))) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(758);for (DataCacheListener listener : listeners.get(deviceId)) {{
                __CLR4_5_2kdkdlx1e727w.R.inc(759);listener.onUpdate(position);
            }
        }}
    }}finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public Position getLastPosition(long deviceId) {try{__CLR4_5_2kdkdlx1e727w.R.inc(760);
        __CLR4_5_2kdkdlx1e727w.R.inc(761);return positions.get(deviceId);
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public synchronized Collection<Position> getInitialState(Collection<Long> devices) {try{__CLR4_5_2kdkdlx1e727w.R.inc(762);
        
        __CLR4_5_2kdkdlx1e727w.R.inc(763);List<Position> result = new LinkedList<>();
        
        __CLR4_5_2kdkdlx1e727w.R.inc(764);for (long device : devices) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(765);if ((((positions.containsKey(device))&&(__CLR4_5_2kdkdlx1e727w.R.iget(766)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(767)==0&false))) {{
                __CLR4_5_2kdkdlx1e727w.R.inc(768);result.add(positions.get(device));
            }
        }}
        
        }__CLR4_5_2kdkdlx1e727w.R.inc(769);return result;
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public static interface DataCacheListener {
        public void onUpdate(Position position);
    }
    
    public void addListener(Collection<Long> devices, DataCacheListener listener) {try{__CLR4_5_2kdkdlx1e727w.R.inc(770);
        __CLR4_5_2kdkdlx1e727w.R.inc(771);for (long deviceId : devices) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(772);addListener(deviceId, listener);
        }
    }}finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public synchronized void addListener(long deviceId, DataCacheListener listener) {try{__CLR4_5_2kdkdlx1e727w.R.inc(773);
        __CLR4_5_2kdkdlx1e727w.R.inc(774);if ((((!listeners.containsKey(deviceId))&&(__CLR4_5_2kdkdlx1e727w.R.iget(775)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(776)==0&false))) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(777);listeners.put(deviceId, new HashSet<DataCacheListener>());
        }
        }__CLR4_5_2kdkdlx1e727w.R.inc(778);listeners.get(deviceId).add(listener);
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public void removeListener(Collection<Long> devices, DataCacheListener listener) {try{__CLR4_5_2kdkdlx1e727w.R.inc(779);
        __CLR4_5_2kdkdlx1e727w.R.inc(780);for (long deviceId : devices) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(781);removeListener(deviceId, listener);
        }
    }}finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
    public synchronized void removeListener(long deviceId, DataCacheListener listener) {try{__CLR4_5_2kdkdlx1e727w.R.inc(782);
        __CLR4_5_2kdkdlx1e727w.R.inc(783);if ((((!listeners.containsKey(deviceId))&&(__CLR4_5_2kdkdlx1e727w.R.iget(784)!=0|true))||(__CLR4_5_2kdkdlx1e727w.R.iget(785)==0&false))) {{
            __CLR4_5_2kdkdlx1e727w.R.inc(786);listeners.put(deviceId, new HashSet<DataCacheListener>());
        }
        }__CLR4_5_2kdkdlx1e727w.R.inc(787);listeners.get(deviceId).remove(listener);
    }finally{__CLR4_5_2kdkdlx1e727w.R.flushNeeded();}}
    
}
