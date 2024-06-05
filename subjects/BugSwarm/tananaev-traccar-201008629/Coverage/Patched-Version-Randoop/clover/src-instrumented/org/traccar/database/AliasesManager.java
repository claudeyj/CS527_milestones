/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.AttributeAlias;

public class AliasesManager {public static class __CLR4_5_21kr1krlx1e0dfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,2097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DataManager dataManager;

    private final Map<Long, Set<AttributeAlias>> deviceAliases = new ConcurrentHashMap<>();
    private final Map<Long, AttributeAlias> aliasesById = new ConcurrentHashMap<>();

    public AliasesManager(DataManager dataManager) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2043);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2044);this.dataManager = dataManager;
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2045);if ((((dataManager != null)&&(__CLR4_5_21kr1krlx1e0dfi.R.iget(2046)!=0|true))||(__CLR4_5_21kr1krlx1e0dfi.R.iget(2047)==0&false))) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2048);try {
                __CLR4_5_21kr1krlx1e0dfi.R.inc(2049);for (AttributeAlias attributeAlias : dataManager.getAttributeAliases()) {{
                    __CLR4_5_21kr1krlx1e0dfi.R.inc(2050);getAttributeAliases(attributeAlias.getDeviceId())
                            .add(attributeAlias);
                    __CLR4_5_21kr1krlx1e0dfi.R.inc(2051);aliasesById.put(attributeAlias.getId(), attributeAlias);
                }
            }} catch (SQLException error) {
                __CLR4_5_21kr1krlx1e0dfi.R.inc(2052);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public Set<AttributeAlias> getAttributeAliases(long deviceId) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2053);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2054);if ((((!deviceAliases.containsKey(deviceId))&&(__CLR4_5_21kr1krlx1e0dfi.R.iget(2055)!=0|true))||(__CLR4_5_21kr1krlx1e0dfi.R.iget(2056)==0&false))) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2057);deviceAliases.put(deviceId, new HashSet<AttributeAlias>());
        }
        }__CLR4_5_21kr1krlx1e0dfi.R.inc(2058);return deviceAliases.get(deviceId);
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public void removeDevice(long deviceId) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2059);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2060);for (AttributeAlias attributeAlias : getAttributeAliases(deviceId)) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2061);aliasesById.remove(attributeAlias.getId());
        }
        }__CLR4_5_21kr1krlx1e0dfi.R.inc(2062);deviceAliases.remove(deviceId);
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public void addAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2063);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2064);dataManager.addAttributeAlias(attributeAlias);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2065);aliasesById.put(attributeAlias.getId(), attributeAlias);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2066);getAttributeAliases(attributeAlias.getDeviceId()).add(attributeAlias);
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public void updateAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2067);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2068);dataManager.updateAttributeAlias(attributeAlias);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2069);AttributeAlias cachedAlias = aliasesById.get(attributeAlias.getId());
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2070);if ((((cachedAlias.getDeviceId() != attributeAlias.getDeviceId())&&(__CLR4_5_21kr1krlx1e0dfi.R.iget(2071)!=0|true))||(__CLR4_5_21kr1krlx1e0dfi.R.iget(2072)==0&false))) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2073);getAttributeAliases(cachedAlias.getDeviceId()).remove(cachedAlias);
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2074);cachedAlias.setDeviceId(attributeAlias.getDeviceId());
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2075);getAttributeAliases(cachedAlias.getDeviceId()).add(cachedAlias);
        }
        }__CLR4_5_21kr1krlx1e0dfi.R.inc(2076);cachedAlias.setAttribute(attributeAlias.getAttribute());
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2077);cachedAlias.setAlias(attributeAlias.getAlias());
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public void removeArrtibuteAlias(long attributeAliasId) throws SQLException {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2078);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2079);dataManager.removeAttributeAlias(attributeAliasId);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2080);AttributeAlias cachedAlias = aliasesById.get(attributeAliasId);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2081);getAttributeAliases(cachedAlias.getDeviceId()).remove(cachedAlias);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2082);aliasesById.remove(attributeAliasId);
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public AttributeAlias getAttributeAlias(long deviceId, String attribute) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2083);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2084);for (AttributeAlias alias : getAttributeAliases(deviceId)) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2085);if ((((alias.getAttribute().equals(attribute))&&(__CLR4_5_21kr1krlx1e0dfi.R.iget(2086)!=0|true))||(__CLR4_5_21kr1krlx1e0dfi.R.iget(2087)==0&false))) {{
                __CLR4_5_21kr1krlx1e0dfi.R.inc(2088);return alias;
            }
        }}
        }__CLR4_5_21kr1krlx1e0dfi.R.inc(2089);return null;
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public Collection<AttributeAlias> getAllAttributeAliases(long userId) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2090);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2091);Collection<AttributeAlias> userDevicesAliases = new ArrayList<>();
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2092);for (long deviceId : Context.getPermissionsManager().getDevicePermissions(userId)) {{
            __CLR4_5_21kr1krlx1e0dfi.R.inc(2093);userDevicesAliases.addAll(getAttributeAliases(deviceId));
        }
        }__CLR4_5_21kr1krlx1e0dfi.R.inc(2094);return userDevicesAliases;
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

    public AttributeAlias getAttributeAlias(long id) {try{__CLR4_5_21kr1krlx1e0dfi.R.inc(2095);
        __CLR4_5_21kr1krlx1e0dfi.R.inc(2096);return aliasesById.get(id);
    }finally{__CLR4_5_21kr1krlx1e0dfi.R.flushNeeded();}}

}
