/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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

public class ExtendedModel extends BaseModel {public static class __CLR4_5_24sx4sxlwye7cw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,6301,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, Object> attributes = new LinkedHashMap<>();

    public Map<String, Object> getAttributes() {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6225);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6226);return attributes;
    }finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void setAttributes(Map<String, Object> attributes) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6227);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6228);this.attributes = attributes;
    }finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Boolean value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6229);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6230);attributes.put(key, value);
    }finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Byte value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6231);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6232);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6233)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6234)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6235);attributes.put(key, value.intValue());
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Short value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6236);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6237);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6238)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6239)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6240);attributes.put(key, value.intValue());
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Integer value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6241);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6242);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6243)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6244)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6245);attributes.put(key, value);
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Long value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6246);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6247);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6248)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6249)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6250);attributes.put(key, value);
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Float value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6251);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6252);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6253)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6254)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6255);attributes.put(key, value.doubleValue());
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, Double value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6256);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6257);if ((((value != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6258)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6259)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6260);attributes.put(key, value);
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void set(String key, String value) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6261);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6262);if ((((value != null && !value.isEmpty())&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6263)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6264)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6265);attributes.put(key, value);
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public void add(Map.Entry<String, Object> entry) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6266);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6267);if ((((entry != null && entry.getValue() != null)&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6268)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6269)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6270);attributes.put(entry.getKey(), entry.getValue());
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public String getString(String key) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6271);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6272);if ((((attributes.containsKey(key))&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6273)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6274)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6275);return (String) attributes.get(key);
        } }else {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6276);return null;
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public double getDouble(String key) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6277);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6278);if ((((attributes.containsKey(key))&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6279)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6280)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6281);return ((Number) attributes.get(key)).doubleValue();
        } }else {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6282);return 0.0;
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public boolean getBoolean(String key) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6283);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6284);if ((((attributes.containsKey(key))&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6285)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6286)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6287);return Boolean.parseBoolean(attributes.get(key).toString());
        } }else {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6288);return false;
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public int getInteger(String key) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6289);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6290);if ((((attributes.containsKey(key))&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6291)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6292)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6293);return ((Number) attributes.get(key)).intValue();
        } }else {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6294);return 0;
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

    public long getLong(String key) {try{__CLR4_5_24sx4sxlwye7cw6.R.inc(6295);
        __CLR4_5_24sx4sxlwye7cw6.R.inc(6296);if ((((attributes.containsKey(key))&&(__CLR4_5_24sx4sxlwye7cw6.R.iget(6297)!=0|true))||(__CLR4_5_24sx4sxlwye7cw6.R.iget(6298)==0&false))) {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6299);return ((Number) attributes.get(key)).longValue();
        } }else {{
            __CLR4_5_24sx4sxlwye7cw6.R.inc(6300);return 0;
        }
    }}finally{__CLR4_5_24sx4sxlwye7cw6.R.flushNeeded();}}

}
