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
import org.traccar.model.Attribute;
import org.traccar.model.BaseModel;
import org.traccar.model.Calendar;
import org.traccar.model.Device;
import org.traccar.model.Driver;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.model.ManagedUser;
import org.traccar.model.Permission;
import org.traccar.model.Server;
import org.traccar.model.User;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PermissionsManager {public static class __CLR4_5_22hm2hmlwydyf7t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,3559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;
    private final UsersManager usersManager;

    private volatile Server server;

    private final Map<Long, Set<Long>> groupPermissions = new HashMap<>();
    private final Map<Long, Set<Long>> devicePermissions = new HashMap<>();
    private final Map<Long, Set<Long>> deviceUsers = new HashMap<>();
    private final Map<Long, Set<Long>> groupDevices = new HashMap<>();

    public PermissionsManager(DataManager dataManager, UsersManager usersManager) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3226);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3227);this.dataManager = dataManager;
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3228);this.usersManager = usersManager;
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3229);refreshServer();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3230);refreshDeviceAndGroupPermissions();
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public User getUser(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3231);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3232);return (User) usersManager.getById(userId);
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Set<Long> getGroupPermissions(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3233);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3234);if ((((!groupPermissions.containsKey(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3235)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3236)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3237);groupPermissions.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3238);return groupPermissions.get(userId);
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Set<Long> getDevicePermissions(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3239);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3240);if ((((!devicePermissions.containsKey(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3241)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3242)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3243);devicePermissions.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3244);return devicePermissions.get(userId);
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Set<Long> getDeviceUsers(long deviceId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3245);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3246);if ((((!deviceUsers.containsKey(deviceId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3247)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3248)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3249);deviceUsers.put(deviceId, new HashSet<Long>());
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3250);return deviceUsers.get(deviceId);
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Set<Long> getGroupDevices(long groupId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3251);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3252);if ((((!groupDevices.containsKey(groupId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3253)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3254)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3255);groupDevices.put(groupId, new HashSet<Long>());
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3256);return groupDevices.get(groupId);
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void refreshServer() {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3257);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3258);try {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3259);server = dataManager.getServer();
        } catch (SQLException error) {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3260);Log.warning(error);
        }
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public final void refreshDeviceAndGroupPermissions() {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3261);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3262);groupPermissions.clear();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3263);devicePermissions.clear();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3264);try {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3265);GroupTree groupTree = new GroupTree(Context.getGroupsManager().getItems(
                    Context.getGroupsManager().getAllItems()),
                    Context.getDeviceManager().getAllDevices());
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3266);for (Permission groupPermission : dataManager.getPermissions(User.class, Group.class)) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3267);Set<Long> userGroupPermissions = getGroupPermissions(groupPermission.getOwnerId());
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3268);Set<Long> userDevicePermissions = getDevicePermissions(groupPermission.getOwnerId());
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3269);userGroupPermissions.add(groupPermission.getPropertyId());
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3270);for (Group group : groupTree.getGroups(groupPermission.getPropertyId())) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3271);userGroupPermissions.add(group.getId());
                }
                }__CLR4_5_22hm2hmlwydyf7t.R.inc(3272);for (Device device : groupTree.getDevices(groupPermission.getPropertyId())) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3273);userDevicePermissions.add(device.getId());
                }
            }}

            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3274);for (Permission devicePermission : dataManager.getPermissions(User.class, Device.class)) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3275);getDevicePermissions(devicePermission.getOwnerId()).add(devicePermission.getPropertyId());
            }

            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3276);groupDevices.clear();
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3277);for (long groupId : Context.getGroupsManager().getAllItems()) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3278);for (Device device : groupTree.getDevices(groupId)) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3279);getGroupDevices(groupId).add(device.getId());
                }
            }}

        }} catch (SQLException | ClassNotFoundException error) {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3280);Log.warning(error);
        }

        __CLR4_5_22hm2hmlwydyf7t.R.inc(3281);deviceUsers.clear();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3282);for (Map.Entry<Long, Set<Long>> entry : devicePermissions.entrySet()) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3283);for (long deviceId : entry.getValue()) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3284);getDeviceUsers(deviceId).add(entry.getKey());
            }
        }}
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public boolean isAdmin(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3285);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3286);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3287);return user != null && user.getAdmin();
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkAdmin(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3288);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3289);if ((((!isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3290)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3291)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3292);throw new SecurityException("Admin access required");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public boolean isManager(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3293);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3294);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3295);return user != null && user.getUserLimit() != 0;
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkManager(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3296);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3297);if ((((!isManager(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3298)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3299)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3300);throw new SecurityException("Manager access required");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkManager(long userId, long managedUserId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3301);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3302);checkManager(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3303);if ((((!usersManager.getUserItems(userId).contains(managedUserId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3304)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3305)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3306);throw new SecurityException("User access denied");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkUserLimit(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3307);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3308);int userLimit = getUser(userId).getUserLimit();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3309);if ((((userLimit != -1 && usersManager.getUserItems(userId).size() >= userLimit)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3310)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3311)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3312);throw new SecurityException("Manager user limit reached");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkDeviceLimit(long userId) throws SecurityException, SQLException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3313);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3314);int deviceLimit = getUser(userId).getDeviceLimit();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3315);if ((((deviceLimit != -1)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3316)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3317)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3318);int deviceCount = 0;
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3319);if ((((isManager(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3320)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3321)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3322);deviceCount = Context.getDeviceManager().getManagedItems(userId).size();
            } }else {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3323);deviceCount = Context.getDeviceManager().getUserItems(userId).size();
            }
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3324);if ((((deviceCount >= deviceLimit)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3325)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3326)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3327);throw new SecurityException("User device limit reached");
            }
        }}
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public boolean isReadonly(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3328);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3329);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3330);return user != null && user.getReadonly();
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public boolean isDeviceReadonly(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3331);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3332);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3333);return user != null && user.getDeviceReadonly();
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkReadonly(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3334);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3335);if ((((!isAdmin(userId) && (server.getReadonly() || isReadonly(userId)))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3336)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3337)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3338);throw new SecurityException("Account is readonly");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkDeviceReadonly(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3339);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3340);if ((((!isAdmin(userId) && (server.getDeviceReadonly() || isDeviceReadonly(userId)))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3341)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3342)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3343);throw new SecurityException("Account is device readonly");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkUserEnabled(long userId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3344);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3345);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3346);if ((((user == null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3347)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3348)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3349);throw new SecurityException("Unknown account");
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3350);if ((((user.getDisabled())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3351)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3352)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3353);throw new SecurityException("Account is disabled");
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3354);if ((((user.getExpirationTime() != null && System.currentTimeMillis() > user.getExpirationTime().getTime())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3355)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3356)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3357);throw new SecurityException("Account has expired");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkUserUpdate(long userId, User before, User after) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3358);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3359);if ((((before.getAdmin() != after.getAdmin()
                || before.getDeviceLimit() != after.getDeviceLimit()
                || before.getUserLimit() != after.getUserLimit())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3360)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3361)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3362);checkAdmin(userId);
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3363);User user = getUser(userId);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3364);if ((((user != null && user.getExpirationTime() != null
                && (after.getExpirationTime() == null
                || user.getExpirationTime().compareTo(after.getExpirationTime()) < 0))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3365)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3366)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3367);checkAdmin(userId);
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3368);if ((((before.getReadonly() != after.getReadonly()
                || before.getDeviceReadonly() != after.getDeviceReadonly()
                || before.getDisabled() != after.getDisabled())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3369)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3370)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3371);if ((((userId == after.getId())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3372)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3373)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3374);checkAdmin(userId);
            }
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3375);if ((((!isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3376)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3377)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3378);checkManager(userId);
            }
        }}
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkUser(long userId, long managedUserId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3379);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3380);if ((((userId != managedUserId && !isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3381)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3382)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3383);checkManager(userId, managedUserId);
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkGroup(long userId, long groupId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3384);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3385);if ((((!getGroupPermissions(userId).contains(groupId) && !isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3386)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3387)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3388);checkManager(userId);
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3389);for (long managedUserId : usersManager.getUserItems(userId)) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3390);if ((((getGroupPermissions(managedUserId).contains(groupId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3391)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3392)==0&false))) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3393);return;
                }
            }}
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3394);throw new SecurityException("Group access denied");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkDevice(long userId, long deviceId) throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3395);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3396);if ((((!Context.getDeviceManager().getUserItems(userId).contains(deviceId) && !isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3397)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3398)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3399);checkManager(userId);
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3400);for (long managedUserId : usersManager.getUserItems(userId)) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3401);if ((((Context.getDeviceManager().getUserItems(managedUserId).contains(deviceId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3402)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3403)==0&false))) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3404);return;
                }
            }}
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3405);throw new SecurityException("Device access denied");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkRegistration(long userId) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3406);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3407);if ((((!server.getRegistration() && !isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3408)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3409)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3410);throw new SecurityException("Registration disabled");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void checkPermission(Class<?> object, long userId, long objectId)
            throws SecurityException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3411);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3412);SimpleObjectManager<? extends BaseModel> manager = null;

        __CLR4_5_22hm2hmlwydyf7t.R.inc(3413);if ((((object.equals(Device.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3414)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3415)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3416);checkDevice(userId, objectId);
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3417);if ((((object.equals(Group.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3418)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3419)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3420);checkGroup(userId, objectId);
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3421);if ((((object.equals(User.class) || object.equals(ManagedUser.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3422)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3423)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3424);checkUser(userId, objectId);
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3425);if ((((object.equals(Geofence.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3426)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3427)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3428);manager = Context.getGeofenceManager();
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3429);if ((((object.equals(Attribute.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3430)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3431)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3432);manager = Context.getAttributesManager();
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3433);if ((((object.equals(Driver.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3434)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3435)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3436);manager = Context.getDriversManager();
        } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3437);if ((((object.equals(Calendar.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3438)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3439)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3440);manager = Context.getCalendarManager();
        } }else {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3441);throw new IllegalArgumentException("Unknown object type");
        }

        }}}}}}}__CLR4_5_22hm2hmlwydyf7t.R.inc(3442);if ((((manager != null && !manager.checkItemPermission(userId, objectId) && !isAdmin(userId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3443)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3444)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3445);checkManager(userId);
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3446);for (long managedUserId : usersManager.getManagedItems(userId)) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3447);if ((((manager.checkItemPermission(managedUserId, objectId))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3448)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3449)==0&false))) {{
                    __CLR4_5_22hm2hmlwydyf7t.R.inc(3450);return;
                }
            }}
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3451);throw new SecurityException("Type " + object + " access denied");
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void refreshAllUsersPermissions() {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3452);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3453);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3454)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3455)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3456);Context.getGeofenceManager().refreshUserItems();
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3457);Context.getCalendarManager().refreshUserItems();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3458);Context.getDriversManager().refreshUserItems();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3459);Context.getAttributesManager().refreshUserItems();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3460);if ((((Context.getNotificationManager() != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3461)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3462)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3463);Context.getNotificationManager().refresh();
        }
    }}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void refreshAllExtendedPermissions() {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3464);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3465);if ((((Context.getGeofenceManager() != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3466)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3467)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3468);Context.getGeofenceManager().refreshExtendedPermissions();
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3469);Context.getDriversManager().refreshExtendedPermissions();
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3470);Context.getAttributesManager().refreshExtendedPermissions();
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void refreshPermissions(Permission permission) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3471);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3472);if ((((permission.getOwnerClass().equals(User.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3473)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3474)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3475);if ((((permission.getPropertyClass().equals(Device.class)
                    || permission.getPropertyClass().equals(Group.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3476)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3477)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3478);refreshDeviceAndGroupPermissions();
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3479);refreshAllExtendedPermissions();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3480);if ((((permission.getPropertyClass().equals(ManagedUser.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3481)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3482)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3483);usersManager.refreshUserItems();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3484);if ((((permission.getPropertyClass().equals(Geofence.class) && Context.getGeofenceManager() != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3485)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3486)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3487);Context.getGeofenceManager().refreshUserItems();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3488);if ((((permission.getPropertyClass().equals(Driver.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3489)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3490)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3491);Context.getDriversManager().refreshUserItems();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3492);if ((((permission.getPropertyClass().equals(Attribute.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3493)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3494)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3495);Context.getAttributesManager().refreshUserItems();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3496);if ((((permission.getPropertyClass().equals(Calendar.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3497)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3498)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3499);Context.getCalendarManager().refreshUserItems();
            }
        }}}}}}} }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3500);if ((((permission.getOwnerClass().equals(Device.class) || permission.getOwnerClass().equals(Group.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3501)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3502)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3503);if ((((permission.getPropertyClass().equals(Geofence.class) && Context.getGeofenceManager() != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3504)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3505)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3506);Context.getGeofenceManager().refreshExtendedPermissions();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3507);if ((((permission.getPropertyClass().equals(Driver.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3508)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3509)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3510);Context.getDriversManager().refreshExtendedPermissions();
            } }else {__CLR4_5_22hm2hmlwydyf7t.R.inc(3511);if ((((permission.getPropertyClass().equals(Attribute.class))&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3512)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3513)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3514);Context.getAttributesManager().refreshExtendedPermissions();
            }
        }}}}
    }}}finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Server getServer() {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3515);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3516);return server;
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public void updateServer(Server server) throws SQLException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3517);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3518);dataManager.updateObject(server);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3519);this.server = server;
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3520);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3521);User user = dataManager.login(email, password);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3522);if ((((user != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3523)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3524)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3525);checkUserEnabled(user.getId());
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3526);return getUser(user.getId());
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3527);return null;
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

    public Object lookupPreference(long userId, String key, Object defaultValue) {try{__CLR4_5_22hm2hmlwydyf7t.R.inc(3528);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3529);String methodName = "get" + key.substring(0, 1).toUpperCase() + key.substring(1);
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3530);Object preference;
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3531);Object serverPreference = null;
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3532);Object userPreference = null;
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3533);try {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3534);Method method = null;
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3535);method = User.class.getMethod(methodName, (Class<?>[]) null);
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3536);if ((((method != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3537)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3538)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3539);userPreference = method.invoke(getUser(userId), (Object[]) null);
            }
            }__CLR4_5_22hm2hmlwydyf7t.R.inc(3540);method = null;
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3541);method = Server.class.getMethod(methodName, (Class<?>[]) null);
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3542);if ((((method != null)&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3543)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3544)==0&false))) {{
                __CLR4_5_22hm2hmlwydyf7t.R.inc(3545);serverPreference = method.invoke(server, (Object[]) null);
            }
        }} catch (ReflectiveOperationException | SecurityException | IllegalArgumentException exception) {
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3546);return defaultValue;
        }
        __CLR4_5_22hm2hmlwydyf7t.R.inc(3547);if ((((server.getForceSettings())&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3548)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3549)==0&false))) {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3550);preference = (((serverPreference != null )&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3551)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3552)==0&false))? serverPreference : userPreference;
        } }else {{
            __CLR4_5_22hm2hmlwydyf7t.R.inc(3553);preference = (((userPreference != null )&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3554)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3555)==0&false))? userPreference : serverPreference;
        }
        }__CLR4_5_22hm2hmlwydyf7t.R.inc(3556);return (((preference != null )&&(__CLR4_5_22hm2hmlwydyf7t.R.iget(3557)!=0|true))||(__CLR4_5_22hm2hmlwydyf7t.R.iget(3558)==0&false))? preference : defaultValue;
    }finally{__CLR4_5_22hm2hmlwydyf7t.R.flushNeeded();}}

}
