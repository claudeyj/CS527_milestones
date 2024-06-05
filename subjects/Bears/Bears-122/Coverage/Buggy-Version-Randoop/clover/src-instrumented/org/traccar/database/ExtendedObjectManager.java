/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.database;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Group;
import org.traccar.model.Permission;
import org.traccar.model.BaseModel;

public abstract class ExtendedObjectManager<T extends BaseModel> extends SimpleObjectManager<T> {public static class __CLR4_5_227f27flwydyezt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,2911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<Long, Set<Long>> deviceItems = new ConcurrentHashMap<>();
    private final Map<Long, Set<Long>> deviceItemsWithGroups = new ConcurrentHashMap<>();
    private final Map<Long, Set<Long>> groupItems = new ConcurrentHashMap<>();

    protected ExtendedObjectManager(DataManager dataManager, Class<T> baseClass) {
        super(dataManager, baseClass);__CLR4_5_227f27flwydyezt.R.inc(2860);try{__CLR4_5_227f27flwydyezt.R.inc(2859);
        __CLR4_5_227f27flwydyezt.R.inc(2861);refreshExtendedPermissions();
    }finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}

    public final Set<Long> getGroupItems(long groupId) {try{__CLR4_5_227f27flwydyezt.R.inc(2862);
        __CLR4_5_227f27flwydyezt.R.inc(2863);if ((((!groupItems.containsKey(groupId))&&(__CLR4_5_227f27flwydyezt.R.iget(2864)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2865)==0&false))) {{
            __CLR4_5_227f27flwydyezt.R.inc(2866);groupItems.put(groupId, new HashSet<Long>());
        }
        }__CLR4_5_227f27flwydyezt.R.inc(2867);return groupItems.get(groupId);
    }finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}

    public final Set<Long> getDeviceItems(long deviceId) {try{__CLR4_5_227f27flwydyezt.R.inc(2868);
        __CLR4_5_227f27flwydyezt.R.inc(2869);if ((((!deviceItems.containsKey(deviceId))&&(__CLR4_5_227f27flwydyezt.R.iget(2870)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2871)==0&false))) {{
            __CLR4_5_227f27flwydyezt.R.inc(2872);deviceItems.put(deviceId, new HashSet<Long>());
        }
        }__CLR4_5_227f27flwydyezt.R.inc(2873);return deviceItems.get(deviceId);
    }finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}

    public Set<Long> getAllDeviceItems(long deviceId) {try{__CLR4_5_227f27flwydyezt.R.inc(2874);
        __CLR4_5_227f27flwydyezt.R.inc(2875);if ((((!deviceItemsWithGroups.containsKey(deviceId))&&(__CLR4_5_227f27flwydyezt.R.iget(2876)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2877)==0&false))) {{
            __CLR4_5_227f27flwydyezt.R.inc(2878);deviceItemsWithGroups.put(deviceId, new HashSet<Long>());
        }
        }__CLR4_5_227f27flwydyezt.R.inc(2879);return deviceItemsWithGroups.get(deviceId);
    }finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}

    @Override
    public void removeItem(long itemId) throws SQLException {try{__CLR4_5_227f27flwydyezt.R.inc(2880);
        __CLR4_5_227f27flwydyezt.R.inc(2881);super.removeItem(itemId);
        __CLR4_5_227f27flwydyezt.R.inc(2882);refreshExtendedPermissions();
    }finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}

    public void refreshExtendedPermissions() {try{__CLR4_5_227f27flwydyezt.R.inc(2883);
        __CLR4_5_227f27flwydyezt.R.inc(2884);if ((((getDataManager() != null)&&(__CLR4_5_227f27flwydyezt.R.iget(2885)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2886)==0&false))) {{
            __CLR4_5_227f27flwydyezt.R.inc(2887);try {

                __CLR4_5_227f27flwydyezt.R.inc(2888);Collection<Permission> databaseGroupPermissions =
                        getDataManager().getPermissions(Group.class, getBaseClass());

                __CLR4_5_227f27flwydyezt.R.inc(2889);groupItems.clear();
                __CLR4_5_227f27flwydyezt.R.inc(2890);for (Permission groupPermission : databaseGroupPermissions) {{
                    __CLR4_5_227f27flwydyezt.R.inc(2891);getGroupItems(groupPermission.getOwnerId()).add(groupPermission.getPropertyId());
                }

                }__CLR4_5_227f27flwydyezt.R.inc(2892);Collection<Permission> databaseDevicePermissions =
                        getDataManager().getPermissions(Device.class, getBaseClass());

                __CLR4_5_227f27flwydyezt.R.inc(2893);deviceItems.clear();
                __CLR4_5_227f27flwydyezt.R.inc(2894);deviceItemsWithGroups.clear();

                __CLR4_5_227f27flwydyezt.R.inc(2895);for (Permission devicePermission : databaseDevicePermissions) {{
                    __CLR4_5_227f27flwydyezt.R.inc(2896);getDeviceItems(devicePermission.getOwnerId()).add(devicePermission.getPropertyId());
                    __CLR4_5_227f27flwydyezt.R.inc(2897);getAllDeviceItems(devicePermission.getOwnerId()).add(devicePermission.getPropertyId());
                }

                }__CLR4_5_227f27flwydyezt.R.inc(2898);for (Device device : Context.getDeviceManager().getAllDevices()) {{
                    __CLR4_5_227f27flwydyezt.R.inc(2899);long groupId = device.getGroupId();
                    __CLR4_5_227f27flwydyezt.R.inc(2900);while ((((groupId != 0)&&(__CLR4_5_227f27flwydyezt.R.iget(2901)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2902)==0&false))) {{
                        __CLR4_5_227f27flwydyezt.R.inc(2903);getAllDeviceItems(device.getId()).addAll(getGroupItems(groupId));
                        __CLR4_5_227f27flwydyezt.R.inc(2904);Group group = (Group) Context.getGroupsManager().getById(groupId);
                        __CLR4_5_227f27flwydyezt.R.inc(2905);if ((((group != null)&&(__CLR4_5_227f27flwydyezt.R.iget(2906)!=0|true))||(__CLR4_5_227f27flwydyezt.R.iget(2907)==0&false))) {{
                            __CLR4_5_227f27flwydyezt.R.inc(2908);groupId = group.getGroupId();
                        } }else {{
                            __CLR4_5_227f27flwydyezt.R.inc(2909);groupId = 0;
                        }
                    }}
                }}

            }} catch (SQLException | ClassNotFoundException error) {
                __CLR4_5_227f27flwydyezt.R.inc(2910);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_227f27flwydyezt.R.flushNeeded();}}
}
