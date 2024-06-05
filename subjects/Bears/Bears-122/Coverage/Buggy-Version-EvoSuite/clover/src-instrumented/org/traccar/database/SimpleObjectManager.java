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
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.BaseModel;
import org.traccar.model.Permission;
import org.traccar.model.User;

public abstract class SimpleObjectManager<T extends BaseModel> extends BaseObjectManager<T>
        implements ManagableObjects {public static class __CLR4_5_230s30slwydw9ua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,3951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<Long, Set<Long>> userItems;

    protected SimpleObjectManager(DataManager dataManager, Class<T> baseClass) {
        super(dataManager, baseClass);__CLR4_5_230s30slwydw9ua.R.inc(3917);try{__CLR4_5_230s30slwydw9ua.R.inc(3916);
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    @Override
    public final Set<Long> getUserItems(long userId) {try{__CLR4_5_230s30slwydw9ua.R.inc(3918);
        __CLR4_5_230s30slwydw9ua.R.inc(3919);if ((((!userItems.containsKey(userId))&&(__CLR4_5_230s30slwydw9ua.R.iget(3920)!=0|true))||(__CLR4_5_230s30slwydw9ua.R.iget(3921)==0&false))) {{
            __CLR4_5_230s30slwydw9ua.R.inc(3922);userItems.put(userId, new HashSet<Long>());
        }
        }__CLR4_5_230s30slwydw9ua.R.inc(3923);return userItems.get(userId);
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    @Override
    public Set<Long> getManagedItems(long userId) {try{__CLR4_5_230s30slwydw9ua.R.inc(3924);
        __CLR4_5_230s30slwydw9ua.R.inc(3925);Set<Long> result = new HashSet<>();
        __CLR4_5_230s30slwydw9ua.R.inc(3926);result.addAll(getUserItems(userId));
        __CLR4_5_230s30slwydw9ua.R.inc(3927);for (long managedUserId : Context.getUsersManager().getUserItems(userId)) {{
            __CLR4_5_230s30slwydw9ua.R.inc(3928);result.addAll(getUserItems(managedUserId));
        }
        }__CLR4_5_230s30slwydw9ua.R.inc(3929);return result;
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    public final boolean checkItemPermission(long userId, long itemId) {try{__CLR4_5_230s30slwydw9ua.R.inc(3930);
        __CLR4_5_230s30slwydw9ua.R.inc(3931);return getUserItems(userId).contains(itemId);
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    @Override
    public void refreshItems() {try{__CLR4_5_230s30slwydw9ua.R.inc(3932);
        __CLR4_5_230s30slwydw9ua.R.inc(3933);super.refreshItems();
        __CLR4_5_230s30slwydw9ua.R.inc(3934);refreshUserItems();
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    public final void refreshUserItems() {try{__CLR4_5_230s30slwydw9ua.R.inc(3935);
        __CLR4_5_230s30slwydw9ua.R.inc(3936);if ((((getDataManager() != null)&&(__CLR4_5_230s30slwydw9ua.R.iget(3937)!=0|true))||(__CLR4_5_230s30slwydw9ua.R.iget(3938)==0&false))) {{
            __CLR4_5_230s30slwydw9ua.R.inc(3939);try {
                __CLR4_5_230s30slwydw9ua.R.inc(3940);if ((((userItems != null)&&(__CLR4_5_230s30slwydw9ua.R.iget(3941)!=0|true))||(__CLR4_5_230s30slwydw9ua.R.iget(3942)==0&false))) {{
                    __CLR4_5_230s30slwydw9ua.R.inc(3943);userItems.clear();
                } }else {{
                    __CLR4_5_230s30slwydw9ua.R.inc(3944);userItems = new ConcurrentHashMap<>();
                }
                }__CLR4_5_230s30slwydw9ua.R.inc(3945);for (Permission permission : getDataManager().getPermissions(User.class, getBaseClass())) {{
                    __CLR4_5_230s30slwydw9ua.R.inc(3946);getUserItems(permission.getOwnerId()).add(permission.getPropertyId());
                }
            }} catch (SQLException | ClassNotFoundException error) {
                __CLR4_5_230s30slwydw9ua.R.inc(3947);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

    @Override
    public void removeItem(long itemId) throws SQLException {try{__CLR4_5_230s30slwydw9ua.R.inc(3948);
        __CLR4_5_230s30slwydw9ua.R.inc(3949);super.removeItem(itemId);
        __CLR4_5_230s30slwydw9ua.R.inc(3950);refreshUserItems();
    }finally{__CLR4_5_230s30slwydw9ua.R.flushNeeded();}}

}
