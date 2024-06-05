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
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Group;

public class GroupsManager extends BaseObjectManager<Group> implements ManagableObjects {public static class __CLR4_5_22by2bylwye3vr1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,3070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private AtomicLong groupsLastUpdate = new AtomicLong();
    private final long dataRefreshDelay;

    public GroupsManager(DataManager dataManager) {
        super(dataManager, Group.class);__CLR4_5_22by2bylwye3vr1.R.inc(3023);try{__CLR4_5_22by2bylwye3vr1.R.inc(3022);
        __CLR4_5_22by2bylwye3vr1.R.inc(3024);dataRefreshDelay = Context.getConfig().getLong("database.refreshDelay",
                DeviceManager.DEFAULT_REFRESH_DELAY) * 1000;
    }finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    private void checkGroupCycles(Group group) {try{__CLR4_5_22by2bylwye3vr1.R.inc(3025);
        __CLR4_5_22by2bylwye3vr1.R.inc(3026);Set<Long> groups = new HashSet<>();
        __CLR4_5_22by2bylwye3vr1.R.inc(3027);while ((((group != null)&&(__CLR4_5_22by2bylwye3vr1.R.iget(3028)!=0|true))||(__CLR4_5_22by2bylwye3vr1.R.iget(3029)==0&false))) {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3030);if ((((groups.contains(group.getId()))&&(__CLR4_5_22by2bylwye3vr1.R.iget(3031)!=0|true))||(__CLR4_5_22by2bylwye3vr1.R.iget(3032)==0&false))) {{
                __CLR4_5_22by2bylwye3vr1.R.inc(3033);throw new IllegalArgumentException("Cycle in group hierarchy");
            }
            }__CLR4_5_22by2bylwye3vr1.R.inc(3034);groups.add(group.getId());
            __CLR4_5_22by2bylwye3vr1.R.inc(3035);group = getById(group.getGroupId());
        }
    }}finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    private void updateGroupCache(boolean force) throws SQLException {try{__CLR4_5_22by2bylwye3vr1.R.inc(3036);
        __CLR4_5_22by2bylwye3vr1.R.inc(3037);long lastUpdate = groupsLastUpdate.get();
        __CLR4_5_22by2bylwye3vr1.R.inc(3038);if (((((force || System.currentTimeMillis() - lastUpdate > dataRefreshDelay)
                && groupsLastUpdate.compareAndSet(lastUpdate, System.currentTimeMillis()))&&(__CLR4_5_22by2bylwye3vr1.R.iget(3039)!=0|true))||(__CLR4_5_22by2bylwye3vr1.R.iget(3040)==0&false))) {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3041);refreshItems();
        }
    }}finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    @Override
    public Set<Long> getAllItems() {try{__CLR4_5_22by2bylwye3vr1.R.inc(3042);
        __CLR4_5_22by2bylwye3vr1.R.inc(3043);Set<Long> result = super.getAllItems();
        __CLR4_5_22by2bylwye3vr1.R.inc(3044);if ((((result.isEmpty())&&(__CLR4_5_22by2bylwye3vr1.R.iget(3045)!=0|true))||(__CLR4_5_22by2bylwye3vr1.R.iget(3046)==0&false))) {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3047);try {
                __CLR4_5_22by2bylwye3vr1.R.inc(3048);updateGroupCache(true);
            } catch (SQLException e) {
                __CLR4_5_22by2bylwye3vr1.R.inc(3049);Log.warning(e);
            }
            __CLR4_5_22by2bylwye3vr1.R.inc(3050);result = super.getAllItems();
        }
        }__CLR4_5_22by2bylwye3vr1.R.inc(3051);return result;
    }finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    @Override
    protected void addNewItem(Group group) {try{__CLR4_5_22by2bylwye3vr1.R.inc(3052);
        __CLR4_5_22by2bylwye3vr1.R.inc(3053);checkGroupCycles(group);
        __CLR4_5_22by2bylwye3vr1.R.inc(3054);super.addNewItem(group);
    }finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    @Override
    protected void updateCachedItem(Group group) {try{__CLR4_5_22by2bylwye3vr1.R.inc(3055);
        __CLR4_5_22by2bylwye3vr1.R.inc(3056);checkGroupCycles(group);
        __CLR4_5_22by2bylwye3vr1.R.inc(3057);super.updateCachedItem(group);
    }finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    @Override
    public Set<Long> getUserItems(long userId) {try{__CLR4_5_22by2bylwye3vr1.R.inc(3058);
        __CLR4_5_22by2bylwye3vr1.R.inc(3059);if ((((Context.getPermissionsManager() != null)&&(__CLR4_5_22by2bylwye3vr1.R.iget(3060)!=0|true))||(__CLR4_5_22by2bylwye3vr1.R.iget(3061)==0&false))) {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3062);return Context.getPermissionsManager().getGroupPermissions(userId);
        } }else {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3063);return new HashSet<>();
        }
    }}finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

    @Override
    public Set<Long> getManagedItems(long userId) {try{__CLR4_5_22by2bylwye3vr1.R.inc(3064);
        __CLR4_5_22by2bylwye3vr1.R.inc(3065);Set<Long> result = new HashSet<>();
        __CLR4_5_22by2bylwye3vr1.R.inc(3066);result.addAll(getUserItems(userId));
        __CLR4_5_22by2bylwye3vr1.R.inc(3067);for (long managedUserId : Context.getUsersManager().getUserItems(userId)) {{
            __CLR4_5_22by2bylwye3vr1.R.inc(3068);result.addAll(getUserItems(managedUserId));
        }
        }__CLR4_5_22by2bylwye3vr1.R.inc(3069);return result;
    }finally{__CLR4_5_22by2bylwye3vr1.R.flushNeeded();}}

}
