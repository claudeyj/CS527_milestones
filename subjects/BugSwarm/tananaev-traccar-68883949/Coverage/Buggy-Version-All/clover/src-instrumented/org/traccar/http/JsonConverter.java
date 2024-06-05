/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
package org.traccar.http;

import java.beans.Introspector;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

import org.traccar.helper.IgnoreOnSerialization;
import org.traccar.model.Factory;

public class JsonConverter {public static class __CLR4_5_21jo1jolx1dln28{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,2114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static Date parseDate(String value) throws ParseException {try{__CLR4_5_21jo1jolx1dln28.R.inc(2004);
        __CLR4_5_21jo1jolx1dln28.R.inc(2005);return dateFormat.parse(value);
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    public static <T extends Factory> T objectFromJson(Reader reader, T prototype) throws ParseException {try{__CLR4_5_21jo1jolx1dln28.R.inc(2006);
        __CLR4_5_21jo1jolx1dln28.R.inc(2007);return objectFromJson(Json.createReader(reader).readObject(), prototype);
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    public static <T> T enumObjectFromJson(Reader reader, EnumFactory<? extends Enum<?>> factory) throws ParseException {try{__CLR4_5_21jo1jolx1dln28.R.inc(2008);
        __CLR4_5_21jo1jolx1dln28.R.inc(2009);JsonObject json = Json.createReader(reader).readObject();
        __CLR4_5_21jo1jolx1dln28.R.inc(2010);T object = factory.<T>create(json);
        __CLR4_5_21jo1jolx1dln28.R.inc(2011);populateObject(json, object);
        __CLR4_5_21jo1jolx1dln28.R.inc(2012);return object;
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    public static <T extends Factory> T objectFromJson(JsonObject json, T prototype) throws ParseException {try{__CLR4_5_21jo1jolx1dln28.R.inc(2013);
        __CLR4_5_21jo1jolx1dln28.R.inc(2014);T object = (T) prototype.create();
        __CLR4_5_21jo1jolx1dln28.R.inc(2015);populateObject(json, object);
        __CLR4_5_21jo1jolx1dln28.R.inc(2016);return object;
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    private static void populateObject(JsonObject json, Object object) throws ParseException {try{__CLR4_5_21jo1jolx1dln28.R.inc(2017);
        __CLR4_5_21jo1jolx1dln28.R.inc(2018);Method[] methods = object.getClass().getMethods();

        __CLR4_5_21jo1jolx1dln28.R.inc(2019);for (final Method method : methods) {{
            __CLR4_5_21jo1jolx1dln28.R.inc(2020);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_21jo1jolx1dln28.R.iget(2021)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2022)==0&false))) {{

                __CLR4_5_21jo1jolx1dln28.R.inc(2023);final String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_21jo1jolx1dln28.R.inc(2024);Class<?> parameterType = method.getParameterTypes()[0];

                __CLR4_5_21jo1jolx1dln28.R.inc(2025);if ((((json.containsKey(name))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2026)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2027)==0&false))) {__CLR4_5_21jo1jolx1dln28.R.inc(2028);try {
                    __CLR4_5_21jo1jolx1dln28.R.inc(2029);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2030)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2031)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2032);method.invoke(object, json.getBoolean(name));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2033);if ((((parameterType.equals(int.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2034)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2035)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2036);method.invoke(object, json.getJsonNumber(name).intValue());
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2037);if ((((parameterType.equals(long.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2038)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2039)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2040);if ((((json.get(name).getValueType() == JsonValue.ValueType.NUMBER)&&(__CLR4_5_21jo1jolx1dln28.R.iget(2041)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2042)==0&false))) {{
                            __CLR4_5_21jo1jolx1dln28.R.inc(2043);method.invoke(object, json.getJsonNumber(name).longValue());
                        }
                    }} }else {__CLR4_5_21jo1jolx1dln28.R.inc(2044);if ((((parameterType.equals(double.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2045)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2046)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2047);method.invoke(object, json.getJsonNumber(name).doubleValue());
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2048);if ((((parameterType.equals(String.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2049)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2050)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2051);method.invoke(object, json.getString(name));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2052);if ((((parameterType.equals(Date.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2053)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2054)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2055);method.invoke(object, dateFormat.parse(json.getString(name)));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2056);if ((((parameterType.isEnum())&&(__CLR4_5_21jo1jolx1dln28.R.iget(2057)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2058)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2059);method.invoke(object, Enum.valueOf((Class<? extends Enum>) parameterType, json.getString(name)));
                    } }else {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2060);Object nestedObject = parameterType.newInstance();
                        __CLR4_5_21jo1jolx1dln28.R.inc(2061);populateObject(json.getJsonObject(name), nestedObject);
                        __CLR4_5_21jo1jolx1dln28.R.inc(2062);method.invoke(object, nestedObject);
                    }
                }}}}}}}} catch (IllegalAccessException error) {
                } catch (InvocationTargetException error) {
                } catch (InstantiationException e) {
                }
            }}
        }}

    }}finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    public static <T> JsonObject objectToJson(T object) {try{__CLR4_5_21jo1jolx1dln28.R.inc(2063);

        __CLR4_5_21jo1jolx1dln28.R.inc(2064);JsonObjectBuilder json = Json.createObjectBuilder();

        __CLR4_5_21jo1jolx1dln28.R.inc(2065);Method[] methods = object.getClass().getMethods();

        __CLR4_5_21jo1jolx1dln28.R.inc(2066);for (Method method : methods) {{
            __CLR4_5_21jo1jolx1dln28.R.inc(2067);if((((method.isAnnotationPresent(IgnoreOnSerialization.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2068)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2069)==0&false))) {{
                __CLR4_5_21jo1jolx1dln28.R.inc(2070);continue;
            }
            }__CLR4_5_21jo1jolx1dln28.R.inc(2071);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_21jo1jolx1dln28.R.iget(2072)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2073)==0&false))) {{
                __CLR4_5_21jo1jolx1dln28.R.inc(2074);String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_21jo1jolx1dln28.R.inc(2075);try {
                    __CLR4_5_21jo1jolx1dln28.R.inc(2076);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2077)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2078)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2079);json.add(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2080);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2081)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2082)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2083);json.add(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2084);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2085)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2086)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2087);json.add(name, (Long) method.invoke(object));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2088);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2089)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2090)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2091);json.add(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_21jo1jolx1dln28.R.inc(2092);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2093)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2094)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2095);String value = (String) method.invoke(object);
                        __CLR4_5_21jo1jolx1dln28.R.inc(2096);if ((((value != null)&&(__CLR4_5_21jo1jolx1dln28.R.iget(2097)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2098)==0&false))) {{
                            __CLR4_5_21jo1jolx1dln28.R.inc(2099);json.add(name, value);
                        }
                    }} }else {__CLR4_5_21jo1jolx1dln28.R.inc(2100);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_21jo1jolx1dln28.R.iget(2101)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2102)==0&false))) {{
                        __CLR4_5_21jo1jolx1dln28.R.inc(2103);Date value = (Date) method.invoke(object);
                        __CLR4_5_21jo1jolx1dln28.R.inc(2104);if ((((value != null)&&(__CLR4_5_21jo1jolx1dln28.R.iget(2105)!=0|true))||(__CLR4_5_21jo1jolx1dln28.R.iget(2106)==0&false))) {{
                            __CLR4_5_21jo1jolx1dln28.R.inc(2107);json.add(name, dateFormat.format(value));
                        }
                    }}
                }}}}}}} catch (IllegalAccessException error) {
                } catch (InvocationTargetException error) {
                }
            }
        }}

        }__CLR4_5_21jo1jolx1dln28.R.inc(2108);return json.build();
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

    public static JsonArray arrayToJson(Collection<?> array) {try{__CLR4_5_21jo1jolx1dln28.R.inc(2109);

        __CLR4_5_21jo1jolx1dln28.R.inc(2110);JsonArrayBuilder json = Json.createArrayBuilder();

        __CLR4_5_21jo1jolx1dln28.R.inc(2111);for (Object object : array) {{
            __CLR4_5_21jo1jolx1dln28.R.inc(2112);json.add(objectToJson(object));
        }

        }__CLR4_5_21jo1jolx1dln28.R.inc(2113);return json.build();
    }finally{__CLR4_5_21jo1jolx1dln28.R.flushNeeded();}}

}
