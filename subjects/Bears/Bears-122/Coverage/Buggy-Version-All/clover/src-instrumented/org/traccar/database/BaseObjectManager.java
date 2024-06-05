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
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.helper.Log;
import org.traccar.model.BaseModel;

public class BaseObjectManager<T extends BaseModel> {public static class __CLR4_5_21lt1ltlwydzilm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,2141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private Map<Long, T> items;
    private Class<T> baseClass;

    protected BaseObjectManager(DataManager dataManager, Class<T> baseClass) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2081);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2082);this.dataManager = dataManager;
        __CLR4_5_21lt1ltlwydzilm.R.inc(2083);this.baseClass = baseClass;
        __CLR4_5_21lt1ltlwydzilm.R.inc(2084);refreshItems();
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    protected final DataManager getDataManager() {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2085);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2086);return dataManager;
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    protected final Class<T> getBaseClass() {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2087);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2088);return baseClass;
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public T getById(long itemId) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2089);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2090);return items.get(itemId);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public void refreshItems() {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2091);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2092);if ((((dataManager != null)&&(__CLR4_5_21lt1ltlwydzilm.R.iget(2093)!=0|true))||(__CLR4_5_21lt1ltlwydzilm.R.iget(2094)==0&false))) {{
            __CLR4_5_21lt1ltlwydzilm.R.inc(2095);try {
                __CLR4_5_21lt1ltlwydzilm.R.inc(2096);Collection<T> databaseItems = dataManager.getObjects(baseClass);
                __CLR4_5_21lt1ltlwydzilm.R.inc(2097);if ((((items == null)&&(__CLR4_5_21lt1ltlwydzilm.R.iget(2098)!=0|true))||(__CLR4_5_21lt1ltlwydzilm.R.iget(2099)==0&false))) {{
                    __CLR4_5_21lt1ltlwydzilm.R.inc(2100);items = new ConcurrentHashMap<>(databaseItems.size());
                }
                }__CLR4_5_21lt1ltlwydzilm.R.inc(2101);Set<Long> databaseItemIds = new HashSet<>();
                __CLR4_5_21lt1ltlwydzilm.R.inc(2102);for (T item : databaseItems) {{
                    __CLR4_5_21lt1ltlwydzilm.R.inc(2103);databaseItemIds.add(item.getId());
                    __CLR4_5_21lt1ltlwydzilm.R.inc(2104);if ((((items.containsKey(item.getId()))&&(__CLR4_5_21lt1ltlwydzilm.R.iget(2105)!=0|true))||(__CLR4_5_21lt1ltlwydzilm.R.iget(2106)==0&false))) {{
                        __CLR4_5_21lt1ltlwydzilm.R.inc(2107);updateCachedItem(item);
                    } }else {{
                        __CLR4_5_21lt1ltlwydzilm.R.inc(2108);addNewItem(item);
                    }
                }}
                }__CLR4_5_21lt1ltlwydzilm.R.inc(2109);for (Long cachedItemId : items.keySet()) {{
                    __CLR4_5_21lt1ltlwydzilm.R.inc(2110);if ((((!databaseItemIds.contains(cachedItemId))&&(__CLR4_5_21lt1ltlwydzilm.R.iget(2111)!=0|true))||(__CLR4_5_21lt1ltlwydzilm.R.iget(2112)==0&false))) {{
                        __CLR4_5_21lt1ltlwydzilm.R.inc(2113);removeCachedItem(cachedItemId);
                    }
                }}
            }} catch (SQLException error) {
                __CLR4_5_21lt1ltlwydzilm.R.inc(2114);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    protected void addNewItem(T item) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2115);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2116);items.put(item.getId(), item);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public void addItem(T item) throws SQLException {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2117);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2118);dataManager.addObject(item);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2119);addNewItem(item);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    protected void updateCachedItem(T item) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2120);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2121);items.put(item.getId(), item);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public void updateItem(T item) throws SQLException {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2122);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2123);dataManager.updateObject(item);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2124);updateCachedItem(item);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    protected void removeCachedItem(long itemId) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2125);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2126);items.remove(itemId);
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public void removeItem(long itemId) throws SQLException {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2127);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2128);BaseModel item = getById(itemId);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2129);if ((((item != null)&&(__CLR4_5_21lt1ltlwydzilm.R.iget(2130)!=0|true))||(__CLR4_5_21lt1ltlwydzilm.R.iget(2131)==0&false))) {{
            __CLR4_5_21lt1ltlwydzilm.R.inc(2132);dataManager.removeObject(baseClass, itemId);
            __CLR4_5_21lt1ltlwydzilm.R.inc(2133);removeCachedItem(itemId);
        }
    }}finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public final Collection<T> getItems(Set<Long> itemIds) {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2134);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2135);Collection<T> result = new LinkedList<>();
        __CLR4_5_21lt1ltlwydzilm.R.inc(2136);for (long itemId : itemIds) {{
            __CLR4_5_21lt1ltlwydzilm.R.inc(2137);result.add(getById(itemId));
        }
        }__CLR4_5_21lt1ltlwydzilm.R.inc(2138);return result;
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

    public Set<Long> getAllItems() {try{__CLR4_5_21lt1ltlwydzilm.R.inc(2139);
        __CLR4_5_21lt1ltlwydzilm.R.inc(2140);return items.keySet();
    }finally{__CLR4_5_21lt1ltlwydzilm.R.flushNeeded();}}

}
