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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DeviceGeofence;
import org.traccar.model.Geofence;
import org.traccar.model.GeofencePermission;
import org.traccar.model.GroupGeofence;
import org.traccar.model.Position;

public class GeofenceManager {public static class __CLR4_5_223z23zlx1e1hjo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,2902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private final Map<Long, Geofence> geofences = new HashMap<>();
    private final Map<Long, Set<Long>> userGeofences = new HashMap<>();
    private final Map<Long, Set<Long>> groupGeofences = new HashMap<>();

    private final Map<Long, Set<Long>> deviceGeofencesWithGroups = new HashMap<>();
    private final Map<Long, Set<Long>> deviceGeofences = new HashMap<>();

    private final ReadWriteLock deviceGeofencesLock = new ReentrantReadWriteLock();
    private final ReadWriteLock geofencesLock = new ReentrantReadWriteLock();
    private final ReadWriteLock groupGeofencesLock = new ReentrantReadWriteLock();
    private final ReadWriteLock userGeofencesLock = new ReentrantReadWriteLock();

    public GeofenceManager(DataManager dataManager) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2735);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2736);this.dataManager = dataManager;
        __CLR4_5_223z23zlx1e1hjo.R.inc(2737);refreshGeofences();
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    private Set<Long> getUserGeofences(long userId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2738);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2739);if ((((!userGeofences.containsKey(userId))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2740)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2741)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2742);userGeofences.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2743);return userGeofences.get(userId);
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public Set<Long> getUserGeofencesIds(long userId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2744);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2745);userGeofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2746);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2747);return getUserGeofences(userId);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2748);userGeofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    private Set<Long> getGroupGeofences(long groupId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2749);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2750);if ((((!groupGeofences.containsKey(groupId))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2751)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2752)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2753);groupGeofences.put(groupId, new HashSet<Long>());
        }
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2754);return groupGeofences.get(groupId);
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public Set<Long> getGroupGeofencesIds(long groupId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2755);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2756);groupGeofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2757);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2758);return getGroupGeofences(groupId);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2759);groupGeofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public Set<Long> getAllDeviceGeofences(long deviceId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2760);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2761);deviceGeofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2762);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2763);return getDeviceGeofences(deviceGeofencesWithGroups, deviceId);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2764);deviceGeofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public Set<Long> getDeviceGeofencesIds(long deviceId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2765);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2766);deviceGeofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2767);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2768);return getDeviceGeofences(deviceGeofences, deviceId);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2769);deviceGeofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    private Set<Long> getDeviceGeofences(Map<Long, Set<Long>> deviceGeofences, long deviceId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2770);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2771);if ((((!deviceGeofences.containsKey(deviceId))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2772)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2773)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2774);deviceGeofences.put(deviceId, new HashSet<Long>());
        }
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2775);return deviceGeofences.get(deviceId);
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final void refreshGeofences() {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2776);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2777);if ((((dataManager != null)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2778)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2779)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2780);try {
                __CLR4_5_223z23zlx1e1hjo.R.inc(2781);geofencesLock.writeLock().lock();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2782);try {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2783);geofences.clear();
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2784);for (Geofence geofence : dataManager.getGeofences()) {{
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2785);geofences.put(geofence.getId(), geofence);
                    }
                }} finally {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2786);geofencesLock.writeLock().unlock();
                }
            } catch (SQLException error) {
                __CLR4_5_223z23zlx1e1hjo.R.inc(2787);Log.warning(error);
            }
        }
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2788);refreshUserGeofences();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2789);refresh();
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final void refreshUserGeofences() {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2790);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2791);if ((((dataManager != null)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2792)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2793)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2794);try {
                __CLR4_5_223z23zlx1e1hjo.R.inc(2795);userGeofencesLock.writeLock().lock();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2796);try {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2797);userGeofences.clear();
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2798);for (GeofencePermission geofencePermission : dataManager.getGeofencePermissions()) {{
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2799);getUserGeofences(geofencePermission.getUserId()).add(geofencePermission.getGeofenceId());
                    }
                }} finally {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2800);userGeofencesLock.writeLock().unlock();
                }
            } catch (SQLException error) {
                __CLR4_5_223z23zlx1e1hjo.R.inc(2801);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final void refresh() {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2802);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2803);if ((((dataManager != null)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2804)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2805)==0&false))) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2806);try {

                __CLR4_5_223z23zlx1e1hjo.R.inc(2807);Collection<GroupGeofence> databaseGroupGeofences = dataManager.getGroupGeofences();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2808);groupGeofencesLock.writeLock().lock();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2809);try {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2810);groupGeofences.clear();
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2811);for (GroupGeofence groupGeofence : databaseGroupGeofences) {{
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2812);getGroupGeofences(groupGeofence.getGroupId()).add(groupGeofence.getGeofenceId());
                    }
                }} finally {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2813);groupGeofencesLock.writeLock().unlock();
                }

                __CLR4_5_223z23zlx1e1hjo.R.inc(2814);Collection<DeviceGeofence> databaseDeviceGeofences = dataManager.getDeviceGeofences();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2815);Collection<Device> allDevices = Context.getDeviceManager().getAllDevices();

                __CLR4_5_223z23zlx1e1hjo.R.inc(2816);groupGeofencesLock.readLock().lock();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2817);deviceGeofencesLock.writeLock().lock();
                __CLR4_5_223z23zlx1e1hjo.R.inc(2818);try {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2819);deviceGeofences.clear();
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2820);deviceGeofencesWithGroups.clear();

                    __CLR4_5_223z23zlx1e1hjo.R.inc(2821);for (DeviceGeofence deviceGeofence : databaseDeviceGeofences) {{
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2822);getDeviceGeofences(deviceGeofences, deviceGeofence.getDeviceId())
                            .add(deviceGeofence.getGeofenceId());
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2823);getDeviceGeofences(deviceGeofencesWithGroups, deviceGeofence.getDeviceId())
                            .add(deviceGeofence.getGeofenceId());
                    }

                    }__CLR4_5_223z23zlx1e1hjo.R.inc(2824);for (Device device : allDevices) {{
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2825);long groupId = device.getGroupId();
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2826);while ((((groupId != 0)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2827)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2828)==0&false))) {{
                            __CLR4_5_223z23zlx1e1hjo.R.inc(2829);getDeviceGeofences(deviceGeofencesWithGroups,
                                    device.getId()).addAll(getGroupGeofences(groupId));
                            __CLR4_5_223z23zlx1e1hjo.R.inc(2830);if ((((Context.getDeviceManager().getGroupById(groupId) != null)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2831)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2832)==0&false))) {{
                                __CLR4_5_223z23zlx1e1hjo.R.inc(2833);groupId = Context.getDeviceManager().getGroupById(groupId).getGroupId();
                            } }else {{
                                __CLR4_5_223z23zlx1e1hjo.R.inc(2834);groupId = 0;
                            }
                        }}
                        }__CLR4_5_223z23zlx1e1hjo.R.inc(2835);List<Long> deviceGeofenceIds = device.getGeofenceIds();
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2836);if ((((deviceGeofenceIds == null)&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2837)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2838)==0&false))) {{
                            __CLR4_5_223z23zlx1e1hjo.R.inc(2839);deviceGeofenceIds = new ArrayList<>();
                        } }else {{
                            __CLR4_5_223z23zlx1e1hjo.R.inc(2840);deviceGeofenceIds.clear();
                        }
                        }__CLR4_5_223z23zlx1e1hjo.R.inc(2841);Position lastPosition = Context.getIdentityManager().getLastPosition(device.getId());
                        __CLR4_5_223z23zlx1e1hjo.R.inc(2842);if ((((lastPosition != null && deviceGeofencesWithGroups.containsKey(device.getId()))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2843)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2844)==0&false))) {{
                            __CLR4_5_223z23zlx1e1hjo.R.inc(2845);for (long geofenceId : deviceGeofencesWithGroups.get(device.getId())) {{
                                __CLR4_5_223z23zlx1e1hjo.R.inc(2846);Geofence geofence = getGeofence(geofenceId);
                                __CLR4_5_223z23zlx1e1hjo.R.inc(2847);if ((((geofence != null && geofence.getGeometry()
                                        .containsPoint(lastPosition.getLatitude(), lastPosition.getLongitude()))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2848)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2849)==0&false))) {{
                                    __CLR4_5_223z23zlx1e1hjo.R.inc(2850);deviceGeofenceIds.add(geofenceId);
                                }
                            }}
                        }}
                        }__CLR4_5_223z23zlx1e1hjo.R.inc(2851);device.setGeofenceIds(deviceGeofenceIds);
                    }

                }} finally {
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2852);deviceGeofencesLock.writeLock().unlock();
                    __CLR4_5_223z23zlx1e1hjo.R.inc(2853);groupGeofencesLock.readLock().unlock();
                }

            } catch (SQLException error) {
                __CLR4_5_223z23zlx1e1hjo.R.inc(2854);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final Collection<Geofence> getAllGeofences() {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2855);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2856);geofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2857);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2858);return geofences.values();
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2859);geofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final Set<Long> getAllGeofencesIds() {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2860);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2861);geofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2862);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2863);return geofences.keySet();
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2864);geofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final Set<Long> getManagedGeofencesIds(long userId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2865);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2866);Set<Long> geofences = new HashSet<>();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2867);geofences.addAll(getUserGeofencesIds(userId));
        __CLR4_5_223z23zlx1e1hjo.R.inc(2868);for (long managedUserId : Context.getPermissionsManager().getUserPermissions(userId)) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2869);geofences.addAll(getUserGeofencesIds(managedUserId));
        }
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2870);return geofences;
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final Collection<Geofence> getGeofences(Set<Long> geofencesIds) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2871);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2872);geofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2873);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2874);Collection<Geofence> result = new LinkedList<>();
            __CLR4_5_223z23zlx1e1hjo.R.inc(2875);for (long geofenceId : geofencesIds) {{
                __CLR4_5_223z23zlx1e1hjo.R.inc(2876);result.add(getGeofence(geofenceId));
            }
            }__CLR4_5_223z23zlx1e1hjo.R.inc(2877);return result;
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2878);geofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final Geofence getGeofence(long geofenceId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2879);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2880);geofencesLock.readLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2881);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2882);return geofences.get(geofenceId);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2883);geofencesLock.readLock().unlock();
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public final void updateGeofence(Geofence geofence) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2884);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2885);geofencesLock.writeLock().lock();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2886);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2887);geofences.put(geofence.getId(), geofence);
        } finally {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2888);geofencesLock.writeLock().unlock();
        }
        __CLR4_5_223z23zlx1e1hjo.R.inc(2889);try {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2890);dataManager.updateGeofence(geofence);
        } catch (SQLException error) {
            __CLR4_5_223z23zlx1e1hjo.R.inc(2891);Log.warning(error);
        }
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public boolean checkGeofence(long userId, long geofenceId) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2892);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2893);return getUserGeofencesIds(userId).contains(geofenceId);
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

    public List<Long> getCurrentDeviceGeofences(Position position) {try{__CLR4_5_223z23zlx1e1hjo.R.inc(2894);
        __CLR4_5_223z23zlx1e1hjo.R.inc(2895);List<Long> result = new ArrayList<>();
        __CLR4_5_223z23zlx1e1hjo.R.inc(2896);for (long geofenceId : getAllDeviceGeofences(position.getDeviceId())) {{
            __CLR4_5_223z23zlx1e1hjo.R.inc(2897);if ((((getGeofence(geofenceId).getGeometry().containsPoint(position.getLatitude(), position.getLongitude()))&&(__CLR4_5_223z23zlx1e1hjo.R.iget(2898)!=0|true))||(__CLR4_5_223z23zlx1e1hjo.R.iget(2899)==0&false))) {{
                __CLR4_5_223z23zlx1e1hjo.R.inc(2900);result.add(geofenceId);
            }
        }}
        }__CLR4_5_223z23zlx1e1hjo.R.inc(2901);return result;
    }finally{__CLR4_5_223z23zlx1e1hjo.R.flushNeeded();}}

}
