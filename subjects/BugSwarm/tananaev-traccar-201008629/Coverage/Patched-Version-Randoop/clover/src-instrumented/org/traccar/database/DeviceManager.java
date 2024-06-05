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

import org.traccar.Config;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DeviceTotalDistance;
import org.traccar.model.Group;
import org.traccar.model.Position;
import org.traccar.model.Server;

public class DeviceManager implements IdentityManager {public static class __CLR4_5_21vv1vvlx1e0dnx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,2735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final long DEFAULT_REFRESH_DELAY = 300;

    private final Config config;
    private final DataManager dataManager;
    private final long dataRefreshDelay;
    private boolean lookupGroupsAttribute;

    private Map<Long, Device> devicesById;
    private Map<String, Device> devicesByUniqueId;
    private AtomicLong devicesLastUpdate = new AtomicLong();

    private Map<Long, Group> groupsById;
    private AtomicLong groupsLastUpdate = new AtomicLong();

    private final Map<Long, Position> positions = new ConcurrentHashMap<>();

    public DeviceManager(DataManager dataManager) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2443);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2444);this.dataManager = dataManager;
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2445);this.config = Context.getConfig();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2446);dataRefreshDelay = config.getLong("database.refreshDelay", DEFAULT_REFRESH_DELAY) * 1000;
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2447);lookupGroupsAttribute = config.getBoolean("deviceManager.lookupGroupsAttribute");
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2448);if ((((dataManager != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2449)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2450)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2451);try {
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2452);updateGroupCache(true);
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2453);updateDeviceCache(true);
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2454);for (Position position : dataManager.getLatestPositions()) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2455);positions.put(position.getDeviceId(), position);
                }
            }} catch (SQLException error) {
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2456);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    private void updateDeviceCache(boolean force) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2457);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2458);long lastUpdate = devicesLastUpdate.get();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2459);if (((((force || System.currentTimeMillis() - lastUpdate > dataRefreshDelay)
                && devicesLastUpdate.compareAndSet(lastUpdate, System.currentTimeMillis()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2460)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2461)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2462);GeofenceManager geofenceManager = Context.getGeofenceManager();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2463);Collection<Device> databaseDevices = dataManager.getAllDevices();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2464);if ((((devicesById == null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2465)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2466)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2467);devicesById = new ConcurrentHashMap<>(databaseDevices.size());
            }
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2468);if ((((devicesByUniqueId == null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2469)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2470)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2471);devicesByUniqueId = new ConcurrentHashMap<>(databaseDevices.size());
            }
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2472);Set<Long> databaseDevicesIds = new HashSet<>();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2473);Set<String> databaseDevicesUniqueIds = new HashSet<>();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2474);for (Device device : databaseDevices) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2475);databaseDevicesIds.add(device.getId());
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2476);databaseDevicesUniqueIds.add(device.getUniqueId());
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2477);if ((((devicesById.containsKey(device.getId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2478)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2479)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2480);Device cachedDevice = devicesById.get(device.getId());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2481);cachedDevice.setName(device.getName());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2482);cachedDevice.setGroupId(device.getGroupId());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2483);cachedDevice.setAttributes(device.getAttributes());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2484);if ((((!device.getUniqueId().equals(cachedDevice.getUniqueId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2485)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2486)==0&false))) {{
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2487);devicesByUniqueId.remove(cachedDevice.getUniqueId());
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2488);devicesByUniqueId.put(device.getUniqueId(), cachedDevice);
                    }
                    }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2489);cachedDevice.setUniqueId(device.getUniqueId());
                } }else {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2490);devicesById.put(device.getId(), device);
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2491);devicesByUniqueId.put(device.getUniqueId(), device);
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2492);if ((((geofenceManager != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2493)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2494)==0&false))) {{
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2495);Position lastPosition = getLastPosition(device.getId());
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2496);if ((((lastPosition != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2497)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2498)==0&false))) {{
                            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2499);device.setGeofenceIds(geofenceManager.getCurrentDeviceGeofences(lastPosition));
                        }
                    }}
                    }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2500);device.setStatus(Device.STATUS_OFFLINE);
                }
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2501);for (Long cachedDeviceId : devicesById.keySet()) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2502);if ((((!databaseDevicesIds.contains(cachedDeviceId))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2503)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2504)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2505);devicesById.remove(cachedDeviceId);
                }
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2506);for (String cachedDeviceUniqId : devicesByUniqueId.keySet()) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2507);if ((((!databaseDevicesUniqueIds.contains(cachedDeviceUniqId))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2508)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2509)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2510);devicesByUniqueId.remove(cachedDeviceUniqId);
                }
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2511);databaseDevicesIds.clear();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2512);databaseDevicesUniqueIds.clear();
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    @Override
    public Device getDeviceById(long id) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2513);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2514);return devicesById.get(id);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    @Override
    public Device getDeviceByUniqueId(String uniqueId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2515);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2516);boolean forceUpdate = !devicesByUniqueId.containsKey(uniqueId) && !config.getBoolean("database.ignoreUnknown");

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2517);updateDeviceCache(forceUpdate);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2518);return devicesByUniqueId.get(uniqueId);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Device> getAllDevices() {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2519);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2520);boolean forceUpdate = devicesById.isEmpty();

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2521);try {
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2522);updateDeviceCache(forceUpdate);
        } catch (SQLException e) {
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2523);Log.warning(e);
        }

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2524);return devicesById.values();
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Device> getDevices(long userId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2525);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2526);Collection<Device> devices = new ArrayList<>();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2527);for (long id : Context.getPermissionsManager().getDevicePermissions(userId)) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2528);devices.add(devicesById.get(id));
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2529);return devices;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Device> getManagedDevices(long userId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2530);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2531);Collection<Device> devices = new ArrayList<>();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2532);devices.addAll(getDevices(userId));
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2533);for (long managedUserId : Context.getPermissionsManager().getUserPermissions(userId)) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2534);devices.addAll(getDevices(managedUserId));
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2535);return devices;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void addDevice(Device device) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2536);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2537);dataManager.addDevice(device);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2538);devicesById.put(device.getId(), device);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2539);devicesByUniqueId.put(device.getUniqueId(), device);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void updateDevice(Device device) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2540);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2541);dataManager.updateDevice(device);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2542);devicesById.put(device.getId(), device);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2543);devicesByUniqueId.put(device.getUniqueId(), device);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void updateDeviceStatus(Device device) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2544);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2545);dataManager.updateDeviceStatus(device);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2546);if ((((devicesById.containsKey(device.getId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2547)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2548)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2549);Device cachedDevice = devicesById.get(device.getId());
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2550);cachedDevice.setStatus(device.getStatus());
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void removeDevice(long deviceId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2551);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2552);dataManager.removeDevice(deviceId);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2553);if ((((devicesById.containsKey(deviceId))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2554)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2555)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2556);String deviceUniqueId = devicesById.get(deviceId).getUniqueId();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2557);devicesById.remove(deviceId);
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2558);devicesByUniqueId.remove(deviceUniqueId);
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2559);positions.remove(deviceId);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public boolean isLatestPosition(Position position) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2560);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2561);Position lastPosition = getLastPosition(position.getDeviceId());
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2562);return lastPosition == null || position.getFixTime().compareTo(lastPosition.getFixTime()) >= 0;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2563);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2564);if ((((isLatestPosition(position))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2565)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2566)==0&false))) {{

            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2567);dataManager.updateLatestPosition(position);

            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2568);if ((((devicesById.containsKey(position.getDeviceId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2569)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2570)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2571);devicesById.get(position.getDeviceId()).setPositionId(position.getId());
            }

            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2572);positions.put(position.getDeviceId(), position);

            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2573);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2574)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2575)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2576);Context.getConnectionManager().updatePosition(position);
            }
        }}
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    @Override
    public Position getLastPosition(long deviceId) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2577);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2578);return positions.get(deviceId);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Position> getInitialState(long userId) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2579);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2580);List<Position> result = new LinkedList<>();

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2581);if ((((Context.getPermissionsManager() != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2582)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2583)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2584);for (long deviceId : Context.getPermissionsManager().getDevicePermissions(userId)) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2585);if ((((positions.containsKey(deviceId))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2586)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2587)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2588);result.add(positions.get(deviceId));
                }
            }}
        }}

        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2589);return result;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    private void updateGroupCache(boolean force) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2590);

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2591);long lastUpdate = groupsLastUpdate.get();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2592);if (((((force || System.currentTimeMillis() - lastUpdate > dataRefreshDelay)
                && groupsLastUpdate.compareAndSet(lastUpdate, System.currentTimeMillis()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2593)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2594)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2595);Collection<Group> databaseGroups = dataManager.getAllGroups();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2596);if ((((groupsById == null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2597)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2598)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2599);groupsById = new ConcurrentHashMap<>(databaseGroups.size());
            }
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2600);Set<Long> databaseGroupsIds = new HashSet<>();
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2601);for (Group group : databaseGroups) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2602);databaseGroupsIds.add(group.getId());
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2603);if ((((groupsById.containsKey(group.getId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2604)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2605)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2606);Group cachedGroup = groupsById.get(group.getId());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2607);cachedGroup.setName(group.getName());
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2608);cachedGroup.setGroupId(group.getGroupId());
                } }else {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2609);groupsById.put(group.getId(), group);
                }
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2610);for (Long cachedGroupId : groupsById.keySet()) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2611);if ((((!databaseGroupsIds.contains(cachedGroupId))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2612)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2613)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2614);devicesById.remove(cachedGroupId);
                }
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2615);databaseGroupsIds.clear();
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Group getGroupById(long id) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2616);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2617);return groupsById.get(id);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Group> getAllGroups() {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2618);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2619);boolean forceUpdate = groupsById.isEmpty();

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2620);try {
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2621);updateGroupCache(forceUpdate);
        } catch (SQLException e) {
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2622);Log.warning(e);
        }

        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2623);return groupsById.values();
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Group> getGroups(long userId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2624);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2625);Collection<Group> groups = new ArrayList<>();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2626);for (long id : Context.getPermissionsManager().getGroupPermissions(userId)) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2627);groups.add(getGroupById(id));
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2628);return groups;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public Collection<Group> getManagedGroups(long userId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2629);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2630);Collection<Group> groups = new ArrayList<>();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2631);groups.addAll(getGroups(userId));
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2632);for (long managedUserId : Context.getPermissionsManager().getUserPermissions(userId)) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2633);groups.addAll(getGroups(managedUserId));
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2634);return groups;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    private void checkGroupCycles(Group group) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2635);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2636);Set<Long> groups = new HashSet<>();
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2637);while ((((group != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2638)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2639)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2640);if ((((groups.contains(group.getId()))&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2641)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2642)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2643);throw new IllegalArgumentException("Cycle in group hierarchy");
            }
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2644);groups.add(group.getId());
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2645);group = groupsById.get(group.getGroupId());
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void addGroup(Group group) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2646);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2647);checkGroupCycles(group);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2648);dataManager.addGroup(group);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2649);groupsById.put(group.getId(), group);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void updateGroup(Group group) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2650);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2651);checkGroupCycles(group);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2652);dataManager.updateGroup(group);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2653);groupsById.put(group.getId(), group);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void removeGroup(long groupId) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2654);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2655);dataManager.removeGroup(groupId);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2656);groupsById.remove(groupId);
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public boolean lookupAttributeBoolean(
            long deviceId, String attributeName, boolean defaultValue, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2657);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2658);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2659);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2660)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2661)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2662);return Boolean.parseBoolean(result);
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2663);return defaultValue;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public String lookupAttributeString(
            long deviceId, String attributeName, String defaultValue, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2664);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2665);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2666);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2667)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2668)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2669);return result;
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2670);return defaultValue;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public int lookupAttributeInteger(long deviceId, String attributeName, int defaultValue, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2671);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2672);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2673);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2674)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2675)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2676);return Integer.parseInt(result);
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2677);return defaultValue;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public long lookupAttributeLong(
            long deviceId, String attributeName, long defaultValue, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2678);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2679);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2680);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2681)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2682)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2683);return Long.parseLong(result);
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2684);return defaultValue;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public double lookupAttributeDouble(
            long deviceId, String attributeName, double defaultValue, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2685);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2686);String result = lookupAttribute(deviceId, attributeName, lookupConfig);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2687);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2688)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2689)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2690);return Double.parseDouble(result);
        }
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2691);return defaultValue;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    private String lookupAttribute(long deviceId, String attributeName, boolean lookupConfig) {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2692);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2693);String result = null;
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2694);Device device = getDeviceById(deviceId);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2695);if ((((device != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2696)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2697)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2698);result = device.getString(attributeName);
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2699);if ((((result == null && lookupGroupsAttribute)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2700)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2701)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2702);long groupId = device.getGroupId();
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2703);while ((((groupId != 0)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2704)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2705)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2706);if ((((getGroupById(groupId) != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2707)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2708)==0&false))) {{
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2709);result = getGroupById(groupId).getString(attributeName);
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2710);if ((((result != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2711)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2712)==0&false))) {{
                            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2713);break;
                        }
                        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2714);groupId = getGroupById(groupId).getGroupId();
                    } }else {{
                        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2715);groupId = 0;
                    }
                }}
            }}
            }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2716);if ((((result == null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2717)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2718)==0&false))) {{
                __CLR4_5_21vv1vvlx1e0dnx.R.inc(2719);if ((((lookupConfig)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2720)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2721)==0&false))) {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2722);result = Context.getConfig().getString(attributeName);
                } }else {{
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2723);Server server = Context.getPermissionsManager().getServer();
                    __CLR4_5_21vv1vvlx1e0dnx.R.inc(2724);result = server.getString(attributeName);
                }
            }}
        }}
        }__CLR4_5_21vv1vvlx1e0dnx.R.inc(2725);return result;
    }finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}

    public void resetTotalDistance(DeviceTotalDistance deviceTotalDistance) throws SQLException {try{__CLR4_5_21vv1vvlx1e0dnx.R.inc(2726);
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2727);Position last = positions.get(deviceTotalDistance.getDeviceId());
        __CLR4_5_21vv1vvlx1e0dnx.R.inc(2728);if ((((last != null)&&(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2729)!=0|true))||(__CLR4_5_21vv1vvlx1e0dnx.R.iget(2730)==0&false))) {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2731);last.getAttributes().put(Position.KEY_TOTAL_DISTANCE, deviceTotalDistance.getTotalDistance());
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2732);dataManager.addPosition(last);
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2733);updateLatestPosition(last);
        } }else {{
            __CLR4_5_21vv1vvlx1e0dnx.R.inc(2734);throw new IllegalArgumentException();
        }
    }}finally{__CLR4_5_21vv1vvlx1e0dnx.R.flushNeeded();}}
}
