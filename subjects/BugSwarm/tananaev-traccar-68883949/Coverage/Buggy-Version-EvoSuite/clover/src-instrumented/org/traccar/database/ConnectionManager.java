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

public class ConnectionManager {public static class __CLR4_5_2jbjblx1dgzre{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,739,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, ActiveDevice> activeDevices = new HashMap<String, ActiveDevice>();
    private final Map<Long, Position> positions = new HashMap<Long, Position>();
    private final Map<Long, Set<DataCacheListener>> listeners = new HashMap<Long, Set<DataCacheListener>>();
    
    public void init(DataManager dataManager) {try{__CLR4_5_2jbjblx1dgzre.R.inc(695);
        __CLR4_5_2jbjblx1dgzre.R.inc(696);try {
            __CLR4_5_2jbjblx1dgzre.R.inc(697);Collection<Position> positions = dataManager.getLatestPositions();
            __CLR4_5_2jbjblx1dgzre.R.inc(698);for (Position position : positions) {{
                __CLR4_5_2jbjblx1dgzre.R.inc(699);this.positions.put(position.getDeviceId(), position);
            }
        }} catch (SQLException error) {
            __CLR4_5_2jbjblx1dgzre.R.inc(700);Log.warning(error);
        }
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}

    public void setActiveDevice(String uniqueId, Protocol protocol, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2jbjblx1dgzre.R.inc(701);
        __CLR4_5_2jbjblx1dgzre.R.inc(702);activeDevices.put(uniqueId, new ActiveDevice(uniqueId, protocol, channel, remoteAddress));
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}

    public ActiveDevice getActiveDevice(String uniqueId) {try{__CLR4_5_2jbjblx1dgzre.R.inc(703);
        __CLR4_5_2jbjblx1dgzre.R.inc(704);return activeDevices.get(uniqueId);
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}

    public synchronized void update(Position position) {try{__CLR4_5_2jbjblx1dgzre.R.inc(705);
        __CLR4_5_2jbjblx1dgzre.R.inc(706);long deviceId = position.getDeviceId();
        __CLR4_5_2jbjblx1dgzre.R.inc(707);positions.put(deviceId, position);
        __CLR4_5_2jbjblx1dgzre.R.inc(708);if ((((listeners.containsKey(deviceId))&&(__CLR4_5_2jbjblx1dgzre.R.iget(709)!=0|true))||(__CLR4_5_2jbjblx1dgzre.R.iget(710)==0&false))) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(711);for (DataCacheListener listener : listeners.get(deviceId)) {{
                __CLR4_5_2jbjblx1dgzre.R.inc(712);listener.onUpdate(position);
            }
        }}
    }}finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
    public synchronized Collection<Position> getInitialState(Collection<Long> devices) {try{__CLR4_5_2jbjblx1dgzre.R.inc(713);
        
        __CLR4_5_2jbjblx1dgzre.R.inc(714);List<Position> result = new LinkedList<Position>();
        
        __CLR4_5_2jbjblx1dgzre.R.inc(715);for (long device : devices) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(716);if ((((positions.containsKey(device))&&(__CLR4_5_2jbjblx1dgzre.R.iget(717)!=0|true))||(__CLR4_5_2jbjblx1dgzre.R.iget(718)==0&false))) {{
                __CLR4_5_2jbjblx1dgzre.R.inc(719);result.add(positions.get(device));
            }
        }}
        
        }__CLR4_5_2jbjblx1dgzre.R.inc(720);return result;
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
    public static interface DataCacheListener {
        public void onUpdate(Position position);
    }
    
    public void addListener(Collection<Long> devices, DataCacheListener listener) {try{__CLR4_5_2jbjblx1dgzre.R.inc(721);
        __CLR4_5_2jbjblx1dgzre.R.inc(722);for (long deviceId : devices) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(723);addListener(deviceId, listener);
        }
    }}finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
    public synchronized void addListener(long deviceId, DataCacheListener listener) {try{__CLR4_5_2jbjblx1dgzre.R.inc(724);
        __CLR4_5_2jbjblx1dgzre.R.inc(725);if ((((!listeners.containsKey(deviceId))&&(__CLR4_5_2jbjblx1dgzre.R.iget(726)!=0|true))||(__CLR4_5_2jbjblx1dgzre.R.iget(727)==0&false))) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(728);listeners.put(deviceId, new HashSet<DataCacheListener>());
        }
        }__CLR4_5_2jbjblx1dgzre.R.inc(729);listeners.get(deviceId).add(listener);
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
    public void removeListener(Collection<Long> devices, DataCacheListener listener) {try{__CLR4_5_2jbjblx1dgzre.R.inc(730);
        __CLR4_5_2jbjblx1dgzre.R.inc(731);for (long deviceId : devices) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(732);removeListener(deviceId, listener);
        }
    }}finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
    public synchronized void removeListener(long deviceId, DataCacheListener listener) {try{__CLR4_5_2jbjblx1dgzre.R.inc(733);
        __CLR4_5_2jbjblx1dgzre.R.inc(734);if ((((!listeners.containsKey(deviceId))&&(__CLR4_5_2jbjblx1dgzre.R.iget(735)!=0|true))||(__CLR4_5_2jbjblx1dgzre.R.iget(736)==0&false))) {{
            __CLR4_5_2jbjblx1dgzre.R.inc(737);listeners.put(deviceId, new HashSet<DataCacheListener>());
        }
        }__CLR4_5_2jbjblx1dgzre.R.inc(738);listeners.get(deviceId).remove(listener);
    }finally{__CLR4_5_2jbjblx1dgzre.R.flushNeeded();}}
    
}
