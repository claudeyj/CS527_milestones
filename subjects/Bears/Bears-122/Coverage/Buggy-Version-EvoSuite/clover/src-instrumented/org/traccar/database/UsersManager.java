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

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.model.User;

public class UsersManager extends SimpleObjectManager<User> {public static class __CLR4_5_233k33klwydw9vv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,4060,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, User> usersTokens;

    public UsersManager(DataManager dataManager) {
        super(dataManager, User.class);__CLR4_5_233k33klwydw9vv.R.inc(4017);try{__CLR4_5_233k33klwydw9vv.R.inc(4016);
        __CLR4_5_233k33klwydw9vv.R.inc(4018);if ((((usersTokens == null)&&(__CLR4_5_233k33klwydw9vv.R.iget(4019)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4020)==0&false))) {{
            __CLR4_5_233k33klwydw9vv.R.inc(4021);usersTokens = new ConcurrentHashMap<>();
        }
    }}finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    private void putToken(User user) {try{__CLR4_5_233k33klwydw9vv.R.inc(4022);
        __CLR4_5_233k33klwydw9vv.R.inc(4023);if ((((usersTokens == null)&&(__CLR4_5_233k33klwydw9vv.R.iget(4024)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4025)==0&false))) {{
            __CLR4_5_233k33klwydw9vv.R.inc(4026);usersTokens = new ConcurrentHashMap<>();
        }
        }__CLR4_5_233k33klwydw9vv.R.inc(4027);if ((((user.getToken() != null)&&(__CLR4_5_233k33klwydw9vv.R.iget(4028)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4029)==0&false))) {{
            __CLR4_5_233k33klwydw9vv.R.inc(4030);usersTokens.put(user.getToken(), user);
        }
    }}finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    @Override
    protected void addNewItem(User user) {try{__CLR4_5_233k33klwydw9vv.R.inc(4031);
        __CLR4_5_233k33klwydw9vv.R.inc(4032);super.addNewItem(user);
        __CLR4_5_233k33klwydw9vv.R.inc(4033);putToken(user);
    }finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    @Override
    protected void updateCachedItem(User user) {try{__CLR4_5_233k33klwydw9vv.R.inc(4034);
        __CLR4_5_233k33klwydw9vv.R.inc(4035);User cachedUser = getById(user.getId());
        __CLR4_5_233k33klwydw9vv.R.inc(4036);super.updateCachedItem(user);
        __CLR4_5_233k33klwydw9vv.R.inc(4037);putToken(user);
        __CLR4_5_233k33klwydw9vv.R.inc(4038);if ((((cachedUser.getToken() != null && !cachedUser.getToken().equals(user.getToken()))&&(__CLR4_5_233k33klwydw9vv.R.iget(4039)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4040)==0&false))) {{
            __CLR4_5_233k33klwydw9vv.R.inc(4041);usersTokens.remove(cachedUser.getToken());
        }
    }}finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    @Override
    protected void removeCachedItem(long userId) {try{__CLR4_5_233k33klwydw9vv.R.inc(4042);
        __CLR4_5_233k33klwydw9vv.R.inc(4043);User cachedUser = getById(userId);
        __CLR4_5_233k33klwydw9vv.R.inc(4044);if ((((cachedUser != null)&&(__CLR4_5_233k33klwydw9vv.R.iget(4045)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4046)==0&false))) {{
            __CLR4_5_233k33klwydw9vv.R.inc(4047);String userToken = cachedUser.getToken();
            __CLR4_5_233k33klwydw9vv.R.inc(4048);super.removeCachedItem(userId);
            __CLR4_5_233k33klwydw9vv.R.inc(4049);if ((((userToken != null)&&(__CLR4_5_233k33klwydw9vv.R.iget(4050)!=0|true))||(__CLR4_5_233k33klwydw9vv.R.iget(4051)==0&false))) {{
                __CLR4_5_233k33klwydw9vv.R.inc(4052);usersTokens.remove(userToken);
            }
        }}
    }}finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    @Override
    public Set<Long> getManagedItems(long userId) {try{__CLR4_5_233k33klwydw9vv.R.inc(4053);
        __CLR4_5_233k33klwydw9vv.R.inc(4054);Set<Long> result = new HashSet<>();
        __CLR4_5_233k33klwydw9vv.R.inc(4055);result.addAll(getUserItems(userId));
        __CLR4_5_233k33klwydw9vv.R.inc(4056);result.add(userId);
        __CLR4_5_233k33klwydw9vv.R.inc(4057);return result;
    }finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

    public User getUserByToken(String token) {try{__CLR4_5_233k33klwydw9vv.R.inc(4058);
        __CLR4_5_233k33klwydw9vv.R.inc(4059);return usersTokens.get(token);
    }finally{__CLR4_5_233k33klwydw9vv.R.flushNeeded();}}

}
