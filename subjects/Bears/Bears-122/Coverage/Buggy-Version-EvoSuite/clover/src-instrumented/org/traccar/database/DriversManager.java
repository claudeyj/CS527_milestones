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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.traccar.model.Driver;

public class DriversManager extends ExtendedObjectManager<Driver> {public static class __CLR4_5_226g26glwydw9fr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,2859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, Driver> driversByUniqueId;

    public DriversManager(DataManager dataManager) {
        super(dataManager, Driver.class);__CLR4_5_226g26glwydw9fr.R.inc(2825);try{__CLR4_5_226g26glwydw9fr.R.inc(2824);
        __CLR4_5_226g26glwydw9fr.R.inc(2826);if ((((driversByUniqueId == null)&&(__CLR4_5_226g26glwydw9fr.R.iget(2827)!=0|true))||(__CLR4_5_226g26glwydw9fr.R.iget(2828)==0&false))) {{
            __CLR4_5_226g26glwydw9fr.R.inc(2829);driversByUniqueId = new ConcurrentHashMap<>();
        }
    }}finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}

    private void putUniqueDriverId(Driver driver) {try{__CLR4_5_226g26glwydw9fr.R.inc(2830);
        __CLR4_5_226g26glwydw9fr.R.inc(2831);if ((((driversByUniqueId == null)&&(__CLR4_5_226g26glwydw9fr.R.iget(2832)!=0|true))||(__CLR4_5_226g26glwydw9fr.R.iget(2833)==0&false))) {{
            __CLR4_5_226g26glwydw9fr.R.inc(2834);driversByUniqueId = new ConcurrentHashMap<>(getAllItems().size());
        }
        }__CLR4_5_226g26glwydw9fr.R.inc(2835);driversByUniqueId.put(driver.getUniqueId(), driver);
    }finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}

    @Override
    protected void addNewItem(Driver driver) {try{__CLR4_5_226g26glwydw9fr.R.inc(2836);
        __CLR4_5_226g26glwydw9fr.R.inc(2837);super.addNewItem(driver);
        __CLR4_5_226g26glwydw9fr.R.inc(2838);putUniqueDriverId(driver);
    }finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}

    @Override
    protected void updateCachedItem(Driver driver) {try{__CLR4_5_226g26glwydw9fr.R.inc(2839);
        __CLR4_5_226g26glwydw9fr.R.inc(2840);Driver cachedDriver = getById(driver.getId());
        __CLR4_5_226g26glwydw9fr.R.inc(2841);cachedDriver.setName(driver.getName());
        __CLR4_5_226g26glwydw9fr.R.inc(2842);if ((((!driver.getUniqueId().equals(cachedDriver.getUniqueId()))&&(__CLR4_5_226g26glwydw9fr.R.iget(2843)!=0|true))||(__CLR4_5_226g26glwydw9fr.R.iget(2844)==0&false))) {{
            __CLR4_5_226g26glwydw9fr.R.inc(2845);driversByUniqueId.remove(cachedDriver.getUniqueId());
            __CLR4_5_226g26glwydw9fr.R.inc(2846);cachedDriver.setUniqueId(driver.getUniqueId());
            __CLR4_5_226g26glwydw9fr.R.inc(2847);putUniqueDriverId(cachedDriver);
        }
        }__CLR4_5_226g26glwydw9fr.R.inc(2848);cachedDriver.setAttributes(driver.getAttributes());
    }finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}

    @Override
    protected void removeCachedItem(long driverId) {try{__CLR4_5_226g26glwydw9fr.R.inc(2849);
        __CLR4_5_226g26glwydw9fr.R.inc(2850);Driver cachedDriver = getById(driverId);
        __CLR4_5_226g26glwydw9fr.R.inc(2851);if ((((cachedDriver != null)&&(__CLR4_5_226g26glwydw9fr.R.iget(2852)!=0|true))||(__CLR4_5_226g26glwydw9fr.R.iget(2853)==0&false))) {{
            __CLR4_5_226g26glwydw9fr.R.inc(2854);String driverUniqueId = cachedDriver.getUniqueId();
            __CLR4_5_226g26glwydw9fr.R.inc(2855);super.removeCachedItem(driverId);
            __CLR4_5_226g26glwydw9fr.R.inc(2856);driversByUniqueId.remove(driverUniqueId);
        }
    }}finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}

    public Driver getDriverByUniqueId(String uniqueId) {try{__CLR4_5_226g26glwydw9fr.R.inc(2857);
        __CLR4_5_226g26glwydw9fr.R.inc(2858);return driversByUniqueId.get(uniqueId);
    }finally{__CLR4_5_226g26glwydw9fr.R.flushNeeded();}}
}
