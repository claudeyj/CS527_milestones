/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Extensible {public static class __CLR4_5_24c24c2lx1dz91y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,5674,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long id;

    public long getId() {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5618);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5619);return id;
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void setId(long id) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5620);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5621);this.id = id;
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    private Map<String, Object> attributes = new LinkedHashMap<>();

    public Map<String, Object> getAttributes() {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5622);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5623);return attributes;
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void setAttributes(Map<String, Object> attributes) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5624);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5625);this.attributes = attributes;
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void set(String key, boolean value) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5626);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5627);attributes.put(key, value);
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void set(String key, int value) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5628);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5629);attributes.put(key, value);
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void set(String key, long value) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5630);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5631);attributes.put(key, value);
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void set(String key, double value) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5632);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5633);attributes.put(key, value);
    }finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void set(String key, String value) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5634);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5635);if ((((value != null && !value.isEmpty())&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5636)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5637)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5638);attributes.put(key, value);
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public void add(Map.Entry<String, Object> entry) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5639);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5640);if ((((entry != null && entry.getValue() != null)&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5641)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5642)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5643);attributes.put(entry.getKey(), entry.getValue());
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public String getString(String key) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5644);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5645);if ((((attributes.containsKey(key))&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5646)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5647)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5648);return (String) attributes.get(key);
        } }else {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5649);return null;
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public double getDouble(String key) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5650);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5651);if ((((attributes.containsKey(key))&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5652)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5653)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5654);return ((Number) attributes.get(key)).doubleValue();
        } }else {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5655);return 0.0;
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public boolean getBoolean(String key) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5656);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5657);if ((((attributes.containsKey(key))&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5658)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5659)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5660);return Boolean.parseBoolean(attributes.get(key).toString());
        } }else {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5661);return false;
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public int getInteger(String key) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5662);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5663);if ((((attributes.containsKey(key))&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5664)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5665)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5666);return ((Number) attributes.get(key)).intValue();
        } }else {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5667);return 0;
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

    public long getLong(String key) {try{__CLR4_5_24c24c2lx1dz91y.R.inc(5668);
        __CLR4_5_24c24c2lx1dz91y.R.inc(5669);if ((((attributes.containsKey(key))&&(__CLR4_5_24c24c2lx1dz91y.R.iget(5670)!=0|true))||(__CLR4_5_24c24c2lx1dz91y.R.iget(5671)==0&false))) {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5672);return ((Number) attributes.get(key)).longValue();
        } }else {{
            __CLR4_5_24c24c2lx1dz91y.R.inc(5673);return 0;
        }
    }}finally{__CLR4_5_24c24c2lx1dz91y.R.flushNeeded();}}

}
