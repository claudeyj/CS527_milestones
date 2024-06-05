/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.traccar.BaseProtocol;
import org.traccar.Config;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Command;
import org.traccar.model.CommandType;
import org.traccar.model.Device;
import org.traccar.model.DeviceState;
import org.traccar.model.DeviceTotalDistance;
import org.traccar.model.Group;
import org.traccar.model.Position;
import org.traccar.model.Server;

public class DeviceManager extends BaseObjectManager<Device> implements IdentityManager, ManagableObjects {public static class __CLR4_5_21yl1yllwye60c5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,2824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final long DEFAULT_REFRESH_DELAY = 300;

    private final Config config;
    private final long dataRefreshDelay;
    private boolean lookupGroupsAttribute;

    private Map<String, Device> devicesByUniqueId;
    private Map<String, Device> devicesByPhone;
    private AtomicLong devicesLastUpdate = new AtomicLong();

    private final Map<Long, Position> positions = new ConcurrentHashMap<>();

    private final Map<Long, DeviceState> deviceStates = new ConcurrentHashMap<>();

    private boolean fallbackToText;

    public DeviceManager(DataManager dataManager) {
        super(dataManager, Device.class);__CLR4_5_21yl1yllwye60c5.R.inc(2542);try{__CLR4_5_21yl1yllwye60c5.R.inc(2541);
        __CLR4_5_21yl1yllwye60c5.R.inc(2543);this.config = Context.getConfig();
        __CLR4_5_21yl1yllwye60c5.R.inc(2544);if ((((devicesByPhone == null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2545)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2546)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2547);devicesByPhone = new ConcurrentHashMap<>();
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2548);if ((((devicesByUniqueId == null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2549)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2550)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2551);devicesByUniqueId = new ConcurrentHashMap<>();
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2552);dataRefreshDelay = config.getLong("database.refreshDelay", DEFAULT_REFRESH_DELAY) * 1000;
        __CLR4_5_21yl1yllwye60c5.R.inc(2553);lookupGroupsAttribute = config.getBoolean("deviceManager.lookupGroupsAttribute");
        __CLR4_5_21yl1yllwye60c5.R.inc(2554);fallbackToText = config.getBoolean("command.fallbackToSms");
        __CLR4_5_21yl1yllwye60c5.R.inc(2555);refreshLastPositions();
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    private void updateDeviceCache(boolean force) throws SQLException {try{__CLR4_5_21yl1yllwye60c5.R.inc(2556);
        __CLR4_5_21yl1yllwye60c5.R.inc(2557);long lastUpdate = devicesLastUpdate.get();
        __CLR4_5_21yl1yllwye60c5.R.inc(2558);if (((((force || System.currentTimeMillis() - lastUpdate > dataRefreshDelay)
                && devicesLastUpdate.compareAndSet(lastUpdate, System.currentTimeMillis()))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2559)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2560)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2561);refreshItems();
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    public Device getByUniqueId(String uniqueId) throws SQLException {try{__CLR4_5_21yl1yllwye60c5.R.inc(2562);
        __CLR4_5_21yl1yllwye60c5.R.inc(2563);boolean forceUpdate = !devicesByUniqueId.containsKey(uniqueId) && !config.getBoolean("database.ignoreUnknown");

        __CLR4_5_21yl1yllwye60c5.R.inc(2564);updateDeviceCache(forceUpdate);

        __CLR4_5_21yl1yllwye60c5.R.inc(2565);return devicesByUniqueId.get(uniqueId);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public Device getDeviceByPhone(String phone) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2566);
        __CLR4_5_21yl1yllwye60c5.R.inc(2567);return devicesByPhone.get(phone);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    public Set<Long> getAllItems() {try{__CLR4_5_21yl1yllwye60c5.R.inc(2568);
        __CLR4_5_21yl1yllwye60c5.R.inc(2569);Set<Long> result = super.getAllItems();
        __CLR4_5_21yl1yllwye60c5.R.inc(2570);if ((((result.isEmpty())&&(__CLR4_5_21yl1yllwye60c5.R.iget(2571)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2572)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2573);try {
                __CLR4_5_21yl1yllwye60c5.R.inc(2574);updateDeviceCache(true);
            } catch (SQLException e) {
                __CLR4_5_21yl1yllwye60c5.R.inc(2575);Log.warning(e);
            }
            __CLR4_5_21yl1yllwye60c5.R.inc(2576);result = super.getAllItems();
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2577);return result;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public Collection<Device> getAllDevices() {try{__CLR4_5_21yl1yllwye60c5.R.inc(2578);
        __CLR4_5_21yl1yllwye60c5.R.inc(2579);return getItems(getAllItems());
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    public Set<Long> getUserItems(long userId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2580);
        __CLR4_5_21yl1yllwye60c5.R.inc(2581);if ((((Context.getPermissionsManager() != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2582)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2583)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2584);return Context.getPermissionsManager().getDevicePermissions(userId);
        } }else {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2585);return new HashSet<>();
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    public Set<Long> getManagedItems(long userId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2586);
        __CLR4_5_21yl1yllwye60c5.R.inc(2587);Set<Long> result = new HashSet<>();
        __CLR4_5_21yl1yllwye60c5.R.inc(2588);result.addAll(getUserItems(userId));
        __CLR4_5_21yl1yllwye60c5.R.inc(2589);for (long managedUserId : Context.getUsersManager().getUserItems(userId)) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2590);result.addAll(getUserItems(managedUserId));
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2591);return result;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    private void putUniqueDeviceId(Device device) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2592);
        __CLR4_5_21yl1yllwye60c5.R.inc(2593);if ((((devicesByUniqueId == null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2594)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2595)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2596);devicesByUniqueId = new ConcurrentHashMap<>(getAllItems().size());
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2597);devicesByUniqueId.put(device.getUniqueId(), device);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    private void putPhone(Device device) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2598);
        __CLR4_5_21yl1yllwye60c5.R.inc(2599);if ((((devicesByPhone == null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2600)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2601)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2602);devicesByPhone = new ConcurrentHashMap<>(getAllItems().size());
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2603);devicesByPhone.put(device.getPhone(), device);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    protected void addNewItem(Device device) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2604);
        __CLR4_5_21yl1yllwye60c5.R.inc(2605);super.addNewItem(device);
        __CLR4_5_21yl1yllwye60c5.R.inc(2606);putUniqueDeviceId(device);
        __CLR4_5_21yl1yllwye60c5.R.inc(2607);if ((((device.getPhone() != null  && !device.getPhone().isEmpty())&&(__CLR4_5_21yl1yllwye60c5.R.iget(2608)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2609)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2610);putPhone(device);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2611);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2612)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2613)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2614);Position lastPosition = getLastPosition(device.getId());
            __CLR4_5_21yl1yllwye60c5.R.inc(2615);if ((((lastPosition != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2616)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2617)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2618);device.setGeofenceIds(Context.getGeofenceManager().getCurrentDeviceGeofences(lastPosition));
            }
        }}
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    protected void updateCachedItem(Device device) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2619);
        __CLR4_5_21yl1yllwye60c5.R.inc(2620);Device cachedDevice = getById(device.getId());
        __CLR4_5_21yl1yllwye60c5.R.inc(2621);cachedDevice.setName(device.getName());
        __CLR4_5_21yl1yllwye60c5.R.inc(2622);cachedDevice.setGroupId(device.getGroupId());
        __CLR4_5_21yl1yllwye60c5.R.inc(2623);cachedDevice.setCategory(device.getCategory());
        __CLR4_5_21yl1yllwye60c5.R.inc(2624);cachedDevice.setContact(device.getContact());
        __CLR4_5_21yl1yllwye60c5.R.inc(2625);cachedDevice.setModel(device.getModel());
        __CLR4_5_21yl1yllwye60c5.R.inc(2626);cachedDevice.setAttributes(device.getAttributes());
        __CLR4_5_21yl1yllwye60c5.R.inc(2627);if ((((!device.getUniqueId().equals(cachedDevice.getUniqueId()))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2628)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2629)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2630);devicesByUniqueId.remove(cachedDevice.getUniqueId());
            __CLR4_5_21yl1yllwye60c5.R.inc(2631);cachedDevice.setUniqueId(device.getUniqueId());
            __CLR4_5_21yl1yllwye60c5.R.inc(2632);putUniqueDeviceId(cachedDevice);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2633);if ((((device.getPhone() != null && !device.getPhone().isEmpty()
                && !device.getPhone().equals(cachedDevice.getPhone()))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2634)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2635)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2636);devicesByPhone.remove(cachedDevice.getPhone());
            __CLR4_5_21yl1yllwye60c5.R.inc(2637);cachedDevice.setPhone(device.getPhone());
            __CLR4_5_21yl1yllwye60c5.R.inc(2638);putPhone(cachedDevice);
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    protected void removeCachedItem(long deviceId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2639);
        __CLR4_5_21yl1yllwye60c5.R.inc(2640);Device cachedDevice = getById(deviceId);
        __CLR4_5_21yl1yllwye60c5.R.inc(2641);if ((((cachedDevice != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2642)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2643)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2644);String deviceUniqueId = cachedDevice.getUniqueId();
            __CLR4_5_21yl1yllwye60c5.R.inc(2645);String phone = cachedDevice.getPhone();
            __CLR4_5_21yl1yllwye60c5.R.inc(2646);super.removeCachedItem(deviceId);
            __CLR4_5_21yl1yllwye60c5.R.inc(2647);devicesByUniqueId.remove(deviceUniqueId);
            __CLR4_5_21yl1yllwye60c5.R.inc(2648);if ((((phone != null && !phone.isEmpty())&&(__CLR4_5_21yl1yllwye60c5.R.iget(2649)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2650)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2651);devicesByPhone.remove(phone);
            }
        }}
        }__CLR4_5_21yl1yllwye60c5.R.inc(2652);positions.remove(deviceId);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public void updateDeviceStatus(Device device) throws SQLException {try{__CLR4_5_21yl1yllwye60c5.R.inc(2653);
        __CLR4_5_21yl1yllwye60c5.R.inc(2654);getDataManager().updateDeviceStatus(device);
        __CLR4_5_21yl1yllwye60c5.R.inc(2655);Device cachedDevice = getById(device.getId());
        __CLR4_5_21yl1yllwye60c5.R.inc(2656);if ((((cachedDevice != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2657)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2658)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2659);cachedDevice.setStatus(device.getStatus());
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    private void refreshLastPositions() {try{__CLR4_5_21yl1yllwye60c5.R.inc(2660);
        __CLR4_5_21yl1yllwye60c5.R.inc(2661);if ((((getDataManager() != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2662)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2663)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2664);try {
                __CLR4_5_21yl1yllwye60c5.R.inc(2665);for (Position position : getDataManager().getLatestPositions()) {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2666);positions.put(position.getDeviceId(), position);
                }
            }} catch (SQLException error) {
                __CLR4_5_21yl1yllwye60c5.R.inc(2667);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public boolean isLatestPosition(Position position) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2668);
        __CLR4_5_21yl1yllwye60c5.R.inc(2669);Position lastPosition = getLastPosition(position.getDeviceId());
        __CLR4_5_21yl1yllwye60c5.R.inc(2670);return lastPosition == null || position.getFixTime().compareTo(lastPosition.getFixTime()) >= 0;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_21yl1yllwye60c5.R.inc(2671);

        __CLR4_5_21yl1yllwye60c5.R.inc(2672);if ((((isLatestPosition(position))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2673)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2674)==0&false))) {{

            __CLR4_5_21yl1yllwye60c5.R.inc(2675);getDataManager().updateLatestPosition(position);

            __CLR4_5_21yl1yllwye60c5.R.inc(2676);Device device = getById(position.getDeviceId());
            __CLR4_5_21yl1yllwye60c5.R.inc(2677);if ((((device != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2678)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2679)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2680);device.setPositionId(position.getId());
            }

            }__CLR4_5_21yl1yllwye60c5.R.inc(2681);positions.put(position.getDeviceId(), position);

            __CLR4_5_21yl1yllwye60c5.R.inc(2682);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2683)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2684)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2685);Context.getConnectionManager().updatePosition(position);
            }
        }}
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    @Override
    public Position getLastPosition(long deviceId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2686);
        __CLR4_5_21yl1yllwye60c5.R.inc(2687);return positions.get(deviceId);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public Collection<Position> getInitialState(long userId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2688);

        __CLR4_5_21yl1yllwye60c5.R.inc(2689);List<Position> result = new LinkedList<>();

        __CLR4_5_21yl1yllwye60c5.R.inc(2690);if ((((Context.getPermissionsManager() != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2691)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2692)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2693);for (long deviceId : getUserItems(userId)) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2694);if ((((positions.containsKey(deviceId))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2695)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2696)==0&false))) {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2697);result.add(positions.get(deviceId));
                }
            }}
        }}

        }__CLR4_5_21yl1yllwye60c5.R.inc(2698);return result;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public boolean lookupAttributeBoolean(
            long deviceId, String attributeName, boolean defaultValue, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2699);
        __CLR4_5_21yl1yllwye60c5.R.inc(2700);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21yl1yllwye60c5.R.inc(2701);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2702)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2703)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2704);return Boolean.parseBoolean(result);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2705);return defaultValue;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public String lookupAttributeString(
            long deviceId, String attributeName, String defaultValue, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2706);
        __CLR4_5_21yl1yllwye60c5.R.inc(2707);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21yl1yllwye60c5.R.inc(2708);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2709)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2710)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2711);return result;
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2712);return defaultValue;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public int lookupAttributeInteger(long deviceId, String attributeName, int defaultValue, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2713);
        __CLR4_5_21yl1yllwye60c5.R.inc(2714);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21yl1yllwye60c5.R.inc(2715);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2716)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2717)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2718);return Integer.parseInt(result);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2719);return defaultValue;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public long lookupAttributeLong(
            long deviceId, String attributeName, long defaultValue, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2720);
        __CLR4_5_21yl1yllwye60c5.R.inc(2721);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21yl1yllwye60c5.R.inc(2722);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2723)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2724)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2725);return Long.parseLong(result);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2726);return defaultValue;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public double lookupAttributeDouble(
            long deviceId, String attributeName, double defaultValue, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2727);
        __CLR4_5_21yl1yllwye60c5.R.inc(2728);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21yl1yllwye60c5.R.inc(2729);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2730)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2731)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2732);return Double.parseDouble(result);
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2733);return defaultValue;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    private String lookupAttribute(long deviceId, String attributeName, boolean lookupConfig) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2734);
        __CLR4_5_21yl1yllwye60c5.R.inc(2735);String result = null;
        __CLR4_5_21yl1yllwye60c5.R.inc(2736);Device device = getById(deviceId);
        __CLR4_5_21yl1yllwye60c5.R.inc(2737);if ((((device != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2738)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2739)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2740);result = device.getString(attributeName);
            __CLR4_5_21yl1yllwye60c5.R.inc(2741);if ((((result == null && lookupGroupsAttribute)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2742)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2743)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2744);long groupId = device.getGroupId();
                __CLR4_5_21yl1yllwye60c5.R.inc(2745);while ((((groupId != 0)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2746)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2747)==0&false))) {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2748);Group group = Context.getGroupsManager().getById(groupId);
                    __CLR4_5_21yl1yllwye60c5.R.inc(2749);if ((((group != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2750)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2751)==0&false))) {{
                        __CLR4_5_21yl1yllwye60c5.R.inc(2752);result = group.getString(attributeName);
                        __CLR4_5_21yl1yllwye60c5.R.inc(2753);if ((((result != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2754)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2755)==0&false))) {{
                            __CLR4_5_21yl1yllwye60c5.R.inc(2756);break;
                        }
                        }__CLR4_5_21yl1yllwye60c5.R.inc(2757);groupId = group.getGroupId();
                    } }else {{
                        __CLR4_5_21yl1yllwye60c5.R.inc(2758);groupId = 0;
                    }
                }}
            }}
            }__CLR4_5_21yl1yllwye60c5.R.inc(2759);if ((((result == null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2760)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2761)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2762);if ((((lookupConfig)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2763)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2764)==0&false))) {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2765);result = Context.getConfig().getString(attributeName);
                } }else {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2766);Server server = Context.getPermissionsManager().getServer();
                    __CLR4_5_21yl1yllwye60c5.R.inc(2767);result = server.getString(attributeName);
                }
            }}
        }}
        }__CLR4_5_21yl1yllwye60c5.R.inc(2768);return result;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public void resetTotalDistance(DeviceTotalDistance deviceTotalDistance) throws SQLException {try{__CLR4_5_21yl1yllwye60c5.R.inc(2769);
        __CLR4_5_21yl1yllwye60c5.R.inc(2770);Position last = positions.get(deviceTotalDistance.getDeviceId());
        __CLR4_5_21yl1yllwye60c5.R.inc(2771);if ((((last != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2772)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2773)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2774);last.getAttributes().put(Position.KEY_TOTAL_DISTANCE, deviceTotalDistance.getTotalDistance());
            __CLR4_5_21yl1yllwye60c5.R.inc(2775);getDataManager().addPosition(last);
            __CLR4_5_21yl1yllwye60c5.R.inc(2776);updateLatestPosition(last);
        } }else {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2777);throw new IllegalArgumentException();
        }
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public void sendCommand(Command command) throws Exception {try{__CLR4_5_21yl1yllwye60c5.R.inc(2778);
        __CLR4_5_21yl1yllwye60c5.R.inc(2779);long deviceId = command.getDeviceId();
        __CLR4_5_21yl1yllwye60c5.R.inc(2780);if ((((command.getTextChannel())&&(__CLR4_5_21yl1yllwye60c5.R.iget(2781)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2782)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2783);Position lastPosition = getLastPosition(deviceId);
            __CLR4_5_21yl1yllwye60c5.R.inc(2784);if ((((lastPosition != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2785)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2786)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2787);BaseProtocol protocol = Context.getServerManager().getProtocol(lastPosition.getProtocol());
                __CLR4_5_21yl1yllwye60c5.R.inc(2788);protocol.sendTextCommand(getById(deviceId).getPhone(), command);
            } }else {__CLR4_5_21yl1yllwye60c5.R.inc(2789);if ((((command.getType().equals(Command.TYPE_CUSTOM))&&(__CLR4_5_21yl1yllwye60c5.R.iget(2790)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2791)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2792);Context.getSmppManager().sendMessageSync(getById(deviceId).getPhone(),
                        command.getString(Command.KEY_DATA), true);
            } }else {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2793);throw new RuntimeException("Command " + command.getType() + " is not supported");
            }
        }}} }else {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2794);ActiveDevice activeDevice = Context.getConnectionManager().getActiveDevice(deviceId);
            __CLR4_5_21yl1yllwye60c5.R.inc(2795);if ((((activeDevice != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2796)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2797)==0&false))) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2798);activeDevice.sendCommand(command);
            } }else {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2799);if ((((fallbackToText)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2800)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2801)==0&false))) {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2802);command.setTextChannel(true);
                    __CLR4_5_21yl1yllwye60c5.R.inc(2803);sendCommand(command);
                } }else {{
                    __CLR4_5_21yl1yllwye60c5.R.inc(2804);throw new RuntimeException("Device is not online");
                }
            }}
        }}
    }}finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public Collection<CommandType> getCommandTypes(long deviceId, boolean textChannel) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2805);
        __CLR4_5_21yl1yllwye60c5.R.inc(2806);List<CommandType> result = new ArrayList<>();
        __CLR4_5_21yl1yllwye60c5.R.inc(2807);Position lastPosition = Context.getDeviceManager().getLastPosition(deviceId);
        __CLR4_5_21yl1yllwye60c5.R.inc(2808);if ((((lastPosition != null)&&(__CLR4_5_21yl1yllwye60c5.R.iget(2809)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2810)==0&false))) {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2811);BaseProtocol protocol = Context.getServerManager().getProtocol(lastPosition.getProtocol());
            __CLR4_5_21yl1yllwye60c5.R.inc(2812);Collection<String> commands;
            __CLR4_5_21yl1yllwye60c5.R.inc(2813);commands = (((textChannel )&&(__CLR4_5_21yl1yllwye60c5.R.iget(2814)!=0|true))||(__CLR4_5_21yl1yllwye60c5.R.iget(2815)==0&false))? protocol.getSupportedTextCommands() : protocol.getSupportedDataCommands();
            __CLR4_5_21yl1yllwye60c5.R.inc(2816);for (String commandKey : commands) {{
                __CLR4_5_21yl1yllwye60c5.R.inc(2817);result.add(new CommandType(commandKey));
            }
        }} }else {{
            __CLR4_5_21yl1yllwye60c5.R.inc(2818);result.add(new CommandType(Command.TYPE_CUSTOM));
        }
        }__CLR4_5_21yl1yllwye60c5.R.inc(2819);return result;
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public DeviceState getDeviceState(long deviceId) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2820);
        __CLR4_5_21yl1yllwye60c5.R.inc(2821);return deviceStates.get(deviceId);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

    public void setDeviceState(long deviceId, DeviceState deviceState) {try{__CLR4_5_21yl1yllwye60c5.R.inc(2822);
        __CLR4_5_21yl1yllwye60c5.R.inc(2823);deviceStates.put(deviceId, deviceState);
    }finally{__CLR4_5_21yl1yllwye60c5.R.flushNeeded();}}

}
