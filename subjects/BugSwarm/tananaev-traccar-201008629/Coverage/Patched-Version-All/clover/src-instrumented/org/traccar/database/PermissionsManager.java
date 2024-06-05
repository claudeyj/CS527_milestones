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

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DevicePermission;
import org.traccar.model.Group;
import org.traccar.model.GroupPermission;
import org.traccar.model.Server;
import org.traccar.model.User;
import org.traccar.model.UserPermission;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PermissionsManager {public static class __CLR4_5_22ee2eelx1e1hn8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,3381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private volatile Server server;

    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final Map<String, Long> usersTokens = new HashMap<>();

    private final Map<Long, Set<Long>> groupPermissions = new HashMap<>();
    private final Map<Long, Set<Long>> devicePermissions = new HashMap<>();
    private final Map<Long, Set<Long>> deviceUsers = new HashMap<>();
    private final Map<Long, Set<Long>> groupDevices = new HashMap<>();

    private final Map<Long, Set<Long>> userPermissions = new HashMap<>();

    public Set<Long> getGroupPermissions(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3110);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3111);if ((((!groupPermissions.containsKey(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3112)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3113)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3114);groupPermissions.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3115);return groupPermissions.get(userId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Set<Long> getDevicePermissions(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3116);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3117);if ((((!devicePermissions.containsKey(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3118)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3119)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3120);devicePermissions.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3121);return devicePermissions.get(userId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Set<Long> getDeviceUsers(long deviceId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3122);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3123);if ((((!deviceUsers.containsKey(deviceId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3124)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3125)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3126);deviceUsers.put(deviceId, new HashSet<Long>());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3127);return deviceUsers.get(deviceId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Set<Long> getGroupDevices(long groupId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3128);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3129);if ((((!groupDevices.containsKey(groupId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3130)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3131)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3132);groupDevices.put(groupId, new HashSet<Long>());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3133);return groupDevices.get(groupId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Set<Long> getUserPermissions(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3134);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3135);if ((((!userPermissions.containsKey(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3136)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3137)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3138);userPermissions.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3139);return userPermissions.get(userId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public PermissionsManager(DataManager dataManager) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3140);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3141);this.dataManager = dataManager;
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3142);refreshUsers();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3143);refreshPermissions();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3144);refreshUserPermissions();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public final void refreshUsers() {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3145);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3146);users.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3147);usersTokens.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3148);try {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3149);server = dataManager.getServer();
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3150);for (User user : dataManager.getUsers()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3151);users.put(user.getId(), user);
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3152);if ((((user.getToken() != null)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3153)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3154)==0&false))) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3155);usersTokens.put(user.getToken(), user.getId());
                }
            }}
        }} catch (SQLException error) {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3156);Log.warning(error);
        }
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public final void refreshUserPermissions() {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3157);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3158);userPermissions.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3159);try {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3160);for (UserPermission permission : dataManager.getUserPermissions()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3161);getUserPermissions(permission.getUserId()).add(permission.getManagedUserId());
            }
        }} catch (SQLException error) {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3162);Log.warning(error);
        }
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public final void refreshPermissions() {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3163);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3164);groupPermissions.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3165);devicePermissions.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3166);try {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3167);GroupTree groupTree = new GroupTree(Context.getDeviceManager().getAllGroups(),
                    Context.getDeviceManager().getAllDevices());
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3168);for (GroupPermission permission : dataManager.getGroupPermissions()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3169);Set<Long> userGroupPermissions = getGroupPermissions(permission.getUserId());
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3170);Set<Long> userDevicePermissions = getDevicePermissions(permission.getUserId());
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3171);userGroupPermissions.add(permission.getGroupId());
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3172);for (Group group : groupTree.getGroups(permission.getGroupId())) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3173);userGroupPermissions.add(group.getId());
                }
                }__CLR4_5_22ee2eelx1e1hn8.R.inc(3174);for (Device device : groupTree.getDevices(permission.getGroupId())) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3175);userDevicePermissions.add(device.getId());
                }
            }}
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3176);for (DevicePermission permission : dataManager.getDevicePermissions()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3177);getDevicePermissions(permission.getUserId()).add(permission.getDeviceId());
            }

            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3178);groupDevices.clear();
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3179);for (Group group : Context.getDeviceManager().getAllGroups()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3180);for (Device device : groupTree.getDevices(group.getId())) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3181);getGroupDevices(group.getId()).add(device.getId());
                }
            }}

        }} catch (SQLException error) {
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3182);Log.warning(error);
        }

        __CLR4_5_22ee2eelx1e1hn8.R.inc(3183);deviceUsers.clear();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3184);for (Map.Entry<Long, Set<Long>> entry : devicePermissions.entrySet()) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3185);for (long deviceId : entry.getValue()) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3186);getDeviceUsers(deviceId).add(entry.getKey());
            }
        }}
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public boolean isAdmin(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3187);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3188);return users.containsKey(userId) && users.get(userId).getAdmin();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkAdmin(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3189);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3190);if ((((!isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3191)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3192)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3193);throw new SecurityException("Admin access required");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public boolean isManager(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3194);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3195);return users.containsKey(userId) && users.get(userId).getUserLimit() != 0;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkManager(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3196);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3197);if ((((!isManager(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3198)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3199)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3200);throw new SecurityException("Manager access required");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkManager(long userId, long managedUserId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3201);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3202);checkManager(userId);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3203);if ((((!userPermissions.get(userId).contains(managedUserId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3204)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3205)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3206);throw new SecurityException("User access denied");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkUserLimit(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3207);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3208);int userLimit = users.get(userId).getUserLimit();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3209);if ((((userLimit != -1 && userPermissions.get(userId).size() >= userLimit)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3210)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3211)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3212);throw new SecurityException("Manager user limit reached");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkDeviceLimit(long userId) throws SecurityException, SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3213);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3214);int deviceLimit = users.get(userId).getDeviceLimit();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3215);if ((((deviceLimit != -1)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3216)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3217)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3218);int deviceCount = 0;
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3219);if ((((isManager(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3220)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3221)==0&false))) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3222);deviceCount = Context.getDeviceManager().getManagedDevices(userId).size();
            } }else {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3223);deviceCount = getDevicePermissions(userId).size();
            }
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3224);if ((((deviceCount >= deviceLimit)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3225)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3226)==0&false))) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3227);throw new SecurityException("User device limit reached");
            }
        }}
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public boolean isReadonly(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3228);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3229);return users.containsKey(userId) && users.get(userId).getReadonly();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public boolean isDeviceReadonly(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3230);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3231);return users.containsKey(userId) && users.get(userId).getDeviceReadonly();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkReadonly(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3232);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3233);if ((((!isAdmin(userId) && (server.getReadonly() || isReadonly(userId)))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3234)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3235)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3236);throw new SecurityException("Account is readonly");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkDeviceReadonly(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3237);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3238);if ((((!isAdmin(userId) && isDeviceReadonly(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3239)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3240)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3241);throw new SecurityException("Account is device readonly");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkUserEnabled(long userId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3242);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3243);User user = getUser(userId);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3244);if ((((user.getDisabled())&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3245)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3246)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3247);throw new SecurityException("Account is disabled");
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3248);if ((((user.getExpirationTime() != null && System.currentTimeMillis() > user.getExpirationTime().getTime())&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3249)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3250)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3251);throw new SecurityException("Account has expired");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkUserUpdate(long userId, User before, User after) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3252);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3253);if ((((before.getAdmin() != after.getAdmin()
                || before.getDeviceLimit() != after.getDeviceLimit()
                || before.getUserLimit() != after.getUserLimit())&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3254)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3255)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3256);checkAdmin(userId);
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3257);if ((((users.containsKey(userId) && users.get(userId).getExpirationTime() != null
                && (after.getExpirationTime() == null
                || users.get(userId).getExpirationTime().compareTo(after.getExpirationTime()) < 0))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3258)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3259)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3260);checkAdmin(userId);
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3261);if ((((before.getReadonly() != after.getReadonly()
                || before.getDeviceReadonly() != after.getDeviceReadonly()
                || before.getDisabled() != after.getDisabled())&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3262)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3263)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3264);if ((((userId == after.getId())&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3265)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3266)==0&false))) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3267);checkAdmin(userId);
            }
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3268);if ((((!isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3269)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3270)==0&false))) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3271);checkManager(userId);
            }
        }}
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkUser(long userId, long managedUserId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3272);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3273);if ((((userId != managedUserId && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3274)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3275)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3276);checkManager(userId, managedUserId);
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkGroup(long userId, long groupId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3277);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3278);if ((((!getGroupPermissions(userId).contains(groupId) && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3279)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3280)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3281);checkManager(userId);
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3282);for (long managedUserId : getUserPermissions(userId)) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3283);if ((((getGroupPermissions(managedUserId).contains(groupId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3284)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3285)==0&false))) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3286);return;
                }
            }}
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3287);throw new SecurityException("Group access denied");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkDevice(long userId, long deviceId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3288);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3289);if ((((!getDevicePermissions(userId).contains(deviceId) && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3290)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3291)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3292);checkManager(userId);
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3293);for (long managedUserId : getUserPermissions(userId)) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3294);if ((((getDevicePermissions(managedUserId).contains(deviceId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3295)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3296)==0&false))) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3297);return;
                }
            }}
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3298);throw new SecurityException("Device access denied");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkRegistration(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3299);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3300);if ((((!server.getRegistration() && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3301)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3302)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3303);throw new SecurityException("Registration disabled");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkGeofence(long userId, long geofenceId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3304);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3305);if ((((!Context.getGeofenceManager().checkGeofence(userId, geofenceId) && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3306)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3307)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3308);checkManager(userId);
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3309);for (long managedUserId : getUserPermissions(userId)) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3310);if ((((Context.getGeofenceManager().checkGeofence(managedUserId, geofenceId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3311)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3312)==0&false))) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3313);return;
                }
            }}
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3314);throw new SecurityException("Geofence access denied");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void checkCalendar(long userId, long calendarId) throws SecurityException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3315);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3316);if ((((!Context.getCalendarManager().checkCalendar(userId, calendarId) && !isAdmin(userId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3317)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3318)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3319);checkManager(userId);
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3320);for (long managedUserId : getUserPermissions(userId)) {{
                __CLR4_5_22ee2eelx1e1hn8.R.inc(3321);if ((((Context.getCalendarManager().checkCalendar(managedUserId, calendarId))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3322)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3323)==0&false))) {{
                    __CLR4_5_22ee2eelx1e1hn8.R.inc(3324);return;
                }
            }}
            }__CLR4_5_22ee2eelx1e1hn8.R.inc(3325);throw new SecurityException("Calendar access denied");
        }
    }}finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Server getServer() {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3326);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3327);return server;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void updateServer(Server server) throws SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3328);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3329);dataManager.updateServer(server);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3330);this.server = server;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Collection<User> getAllUsers() {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3331);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3332);return users.values();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Collection<User> getUsers(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3333);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3334);Collection<User> result = new ArrayList<>();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3335);for (long managedUserId : getUserPermissions(userId)) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3336);result.add(users.get(managedUserId));
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3337);return result;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public Collection<User> getManagedUsers(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3338);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3339);Collection<User> result = getUsers(userId);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3340);result.add(users.get(userId));
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3341);return result;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public User getUser(long userId) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3342);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3343);return users.get(userId);
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void addUser(User user) throws SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3344);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3345);dataManager.addUser(user);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3346);users.put(user.getId(), user);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3347);if ((((user.getToken() != null)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3348)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3349)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3350);usersTokens.put(user.getToken(), user.getId());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3351);refreshPermissions();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void updateUser(User user) throws SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3352);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3353);dataManager.updateUser(user);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3354);User old = users.get(user.getId());
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3355);users.put(user.getId(), user);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3356);if ((((user.getToken() != null)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3357)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3358)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3359);usersTokens.put(user.getToken(), user.getId());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3360);if ((((old.getToken() != null && !old.getToken().equals(user.getToken()))&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3361)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3362)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3363);usersTokens.remove(old.getToken());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3364);refreshPermissions();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public void removeUser(long userId) throws SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3365);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3366);dataManager.removeUser(userId);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3367);usersTokens.remove(users.get(userId).getToken());
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3368);users.remove(userId);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3369);refreshPermissions();
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3370);refreshUserPermissions();
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3371);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3372);User user = dataManager.login(email, password);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3373);if ((((user != null)&&(__CLR4_5_22ee2eelx1e1hn8.R.iget(3374)!=0|true))||(__CLR4_5_22ee2eelx1e1hn8.R.iget(3375)==0&false))) {{
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3376);checkUserEnabled(user.getId());
            __CLR4_5_22ee2eelx1e1hn8.R.inc(3377);return users.get(user.getId());
        }
        }__CLR4_5_22ee2eelx1e1hn8.R.inc(3378);return null;
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

    public User getUserByToken(String token) {try{__CLR4_5_22ee2eelx1e1hn8.R.inc(3379);
        __CLR4_5_22ee2eelx1e1hn8.R.inc(3380);return users.get(usersTokens.get(token));
    }finally{__CLR4_5_22ee2eelx1e1hn8.R.flushNeeded();}}

}
