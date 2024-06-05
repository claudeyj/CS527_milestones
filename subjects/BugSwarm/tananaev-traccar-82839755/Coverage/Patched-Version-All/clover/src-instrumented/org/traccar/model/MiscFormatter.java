/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import org.traccar.web.JsonConverter;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonString;
import javax.json.JsonValue;

/**
 * Format extended tracker status
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class MiscFormatter {public static class __CLR4_5_21m51m5lx1e7y8a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,2161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String xmlRootNode = "info";

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private static String format(Object value) {try{__CLR4_5_21m51m5lx1e7y8a.R.inc(2093);
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2094);if ((((value instanceof Double || value instanceof Float)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2095)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2096)==0&false))) {{
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2097);return decimalFormat.format(value);
        } }else {{
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2098);return value.toString();
        }
    }}finally{__CLR4_5_21m51m5lx1e7y8a.R.flushNeeded();}}

    public static String toXmlString(Map<String, Object> attributes) {try{__CLR4_5_21m51m5lx1e7y8a.R.inc(2099);
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2100);StringBuilder result = new StringBuilder();
        
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2101);result.append("<").append(xmlRootNode).append(">");
        
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2102);for (Map.Entry<String, Object> entry : attributes.entrySet()) {{
         
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2103);result.append("<").append(entry.getKey()).append(">");
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2104);result.append(format(entry.getValue()));
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2105);result.append("</").append(entry.getKey()).append(">");
        }

        }__CLR4_5_21m51m5lx1e7y8a.R.inc(2106);result.append("</").append(xmlRootNode).append(">");
        
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2107);return result.toString();
    }finally{__CLR4_5_21m51m5lx1e7y8a.R.flushNeeded();}}

    public static JsonObject toJson(Map<String, Object> attributes) {try{__CLR4_5_21m51m5lx1e7y8a.R.inc(2108);
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2109);JsonObjectBuilder json = Json.createObjectBuilder();

        __CLR4_5_21m51m5lx1e7y8a.R.inc(2110);for (Map.Entry<String, Object> entry : attributes.entrySet()) {{
            __CLR4_5_21m51m5lx1e7y8a.R.inc(2111);if ((((entry.getValue() instanceof String)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2112)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2113)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2114);json.add(entry.getKey(), (String) entry.getValue());
            } }else {__CLR4_5_21m51m5lx1e7y8a.R.inc(2115);if ((((entry.getValue() instanceof Integer)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2116)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2117)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2118);json.add(entry.getKey(), (Integer) entry.getValue());
            } }else {__CLR4_5_21m51m5lx1e7y8a.R.inc(2119);if ((((entry.getValue() instanceof Long)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2120)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2121)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2122);json.add(entry.getKey(), (Long) entry.getValue());
            } }else {__CLR4_5_21m51m5lx1e7y8a.R.inc(2123);if ((((entry.getValue() instanceof Double)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2124)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2125)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2126);json.add(entry.getKey(), (Double) entry.getValue());
            } }else {__CLR4_5_21m51m5lx1e7y8a.R.inc(2127);if ((((entry.getValue() instanceof Boolean)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2128)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2129)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2130);json.add(entry.getKey(), (Boolean) entry.getValue());
            } }else {__CLR4_5_21m51m5lx1e7y8a.R.inc(2131);if ((((entry.getValue() == null)&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2132)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2133)==0&false))) {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2134);json.add(entry.getKey(), JsonValue.NULL);
            } }else {{
                __CLR4_5_21m51m5lx1e7y8a.R.inc(2135);json.add(entry.getKey(), JsonConverter.objectToJson(entry.getValue()));
            }
        }}}}}}}

        }__CLR4_5_21m51m5lx1e7y8a.R.inc(2136);return json.build();
    }finally{__CLR4_5_21m51m5lx1e7y8a.R.flushNeeded();}}
    
    public static Map<String, Object> fromJson(JsonObject json) {try{__CLR4_5_21m51m5lx1e7y8a.R.inc(2137);
        
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2138);Map<String, Object> attributes = new LinkedHashMap<>();
        
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2139);for (Map.Entry<String, JsonValue> entry : json.entrySet()) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21m51m5lx1e7y8a.R.inc(2140);switch (entry.getValue().getValueType()) {
                case STRING:if (!__CLB4_5_2_bool0) {__CLR4_5_21m51m5lx1e7y8a.R.inc(2141);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2142);attributes.put(entry.getKey(), ((JsonString) entry.getValue()).getString());
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2143);break;
                case NUMBER:if (!__CLB4_5_2_bool0) {__CLR4_5_21m51m5lx1e7y8a.R.inc(2144);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2145);JsonNumber number = (JsonNumber) entry.getValue();
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2146);if ((((number.isIntegral())&&(__CLR4_5_21m51m5lx1e7y8a.R.iget(2147)!=0|true))||(__CLR4_5_21m51m5lx1e7y8a.R.iget(2148)==0&false))) {{
                        __CLR4_5_21m51m5lx1e7y8a.R.inc(2149);attributes.put(entry.getKey(), number.longValue());
                    } }else {{
                        __CLR4_5_21m51m5lx1e7y8a.R.inc(2150);attributes.put(entry.getKey(), number.doubleValue());
                    }
                    }__CLR4_5_21m51m5lx1e7y8a.R.inc(2151);break;
                case TRUE:if (!__CLB4_5_2_bool0) {__CLR4_5_21m51m5lx1e7y8a.R.inc(2152);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2153);attributes.put(entry.getKey(), true);
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2154);break;
                case FALSE:if (!__CLB4_5_2_bool0) {__CLR4_5_21m51m5lx1e7y8a.R.inc(2155);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2156);attributes.put(entry.getKey(), false);
                    __CLR4_5_21m51m5lx1e7y8a.R.inc(2157);break;
            }
        }
        
        }__CLR4_5_21m51m5lx1e7y8a.R.inc(2158);return attributes;
    }finally{__CLR4_5_21m51m5lx1e7y8a.R.flushNeeded();}}
    
    public static String toJsonString(Map<String, Object> attributes) {try{__CLR4_5_21m51m5lx1e7y8a.R.inc(2159);
        __CLR4_5_21m51m5lx1e7y8a.R.inc(2160);return toJson(attributes).toString();
    }finally{__CLR4_5_21m51m5lx1e7y8a.R.flushNeeded();}}

}
