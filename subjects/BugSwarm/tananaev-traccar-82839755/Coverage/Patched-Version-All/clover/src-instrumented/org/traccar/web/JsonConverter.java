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
package org.traccar.web;

import java.beans.Introspector;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonValue;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.traccar.model.Factory;
import org.traccar.model.MiscFormatter;

public class JsonConverter {public static class __CLR4_5_2957957lx1e81ft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,11957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeFormatter dateFormat = ISODateTimeFormat.dateTime();

    public static Date parseDate(String value) {try{__CLR4_5_2957957lx1e81ft.R.inc(11851);
        __CLR4_5_2957957lx1e81ft.R.inc(11852);return dateFormat.parseDateTime(value).toDate();
    }finally{__CLR4_5_2957957lx1e81ft.R.flushNeeded();}}

    public static <T extends Factory> T objectFromJson(Reader reader, T prototype) throws ParseException {try{__CLR4_5_2957957lx1e81ft.R.inc(11853);
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2957957lx1e81ft.R.inc(11854);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2957957lx1e81ft.R.inc(11855);}};JsonReader jsonReader = Json.createReader(reader)) {
            __CLR4_5_2957957lx1e81ft.R.inc(11856);return objectFromJson(jsonReader.readObject(), prototype);
        }
    }finally{__CLR4_5_2957957lx1e81ft.R.flushNeeded();}}

    public static <T extends Factory> T objectFromJson(JsonObject json, T prototype) {try{__CLR4_5_2957957lx1e81ft.R.inc(11857);
        __CLR4_5_2957957lx1e81ft.R.inc(11858);T object = (T) prototype.create();

        __CLR4_5_2957957lx1e81ft.R.inc(11859);Method[] methods = object.getClass().getMethods();

        __CLR4_5_2957957lx1e81ft.R.inc(11860);for (final Method method : methods) {{
            __CLR4_5_2957957lx1e81ft.R.inc(11861);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_2957957lx1e81ft.R.iget(11862)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11863)==0&false))) {{

                __CLR4_5_2957957lx1e81ft.R.inc(11864);final String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_2957957lx1e81ft.R.inc(11865);Class<?> parameterType = method.getParameterTypes()[0];

                __CLR4_5_2957957lx1e81ft.R.inc(11866);if ((((json.containsKey(name))&&(__CLR4_5_2957957lx1e81ft.R.iget(11867)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11868)==0&false))) {__CLR4_5_2957957lx1e81ft.R.inc(11869);try {
                    __CLR4_5_2957957lx1e81ft.R.inc(11870);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11871)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11872)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11873);method.invoke(object, json.getBoolean(name));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11874);if ((((parameterType.equals(int.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11875)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11876)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11877);method.invoke(object, json.getJsonNumber(name).intValue());
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11878);if ((((parameterType.equals(long.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11879)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11880)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11881);if ((((json.get(name).getValueType() == JsonValue.ValueType.NUMBER)&&(__CLR4_5_2957957lx1e81ft.R.iget(11882)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11883)==0&false))) {{
                            __CLR4_5_2957957lx1e81ft.R.inc(11884);method.invoke(object, json.getJsonNumber(name).longValue());
                        }
                    }} }else {__CLR4_5_2957957lx1e81ft.R.inc(11885);if ((((parameterType.equals(double.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11886)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11887)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11888);method.invoke(object, json.getJsonNumber(name).doubleValue());
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11889);if ((((parameterType.equals(String.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11890)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11891)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11892);method.invoke(object, json.getString(name));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11893);if ((((parameterType.equals(Date.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11894)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11895)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11896);method.invoke(object, dateFormat.parseDateTime(json.getString(name)).toDate());
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11897);if ((((parameterType.equals(Map.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11898)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11899)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11900);method.invoke(object, MiscFormatter.fromJson(json.getJsonObject(name)));
                    }
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException error) {
                }
            }}
        }}

        }__CLR4_5_2957957lx1e81ft.R.inc(11901);return object;
    }finally{__CLR4_5_2957957lx1e81ft.R.flushNeeded();}}

    public static <T> JsonObject objectToJson(T object) {try{__CLR4_5_2957957lx1e81ft.R.inc(11902);

        __CLR4_5_2957957lx1e81ft.R.inc(11903);JsonObjectBuilder json = Json.createObjectBuilder();

        __CLR4_5_2957957lx1e81ft.R.inc(11904);Method[] methods = object.getClass().getMethods();

        __CLR4_5_2957957lx1e81ft.R.inc(11905);for (Method method : methods) {{
            __CLR4_5_2957957lx1e81ft.R.inc(11906);if((((method.isAnnotationPresent(JsonIgnore.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11907)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11908)==0&false))) {{
                __CLR4_5_2957957lx1e81ft.R.inc(11909);continue;
            }
            }__CLR4_5_2957957lx1e81ft.R.inc(11910);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2957957lx1e81ft.R.iget(11911)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11912)==0&false))) {{
                __CLR4_5_2957957lx1e81ft.R.inc(11913);String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_2957957lx1e81ft.R.inc(11914);try {
                    __CLR4_5_2957957lx1e81ft.R.inc(11915);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11916)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11917)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11918);json.add(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11919);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11920)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11921)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11922);json.add(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11923);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11924)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11925)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11926);json.add(name, (Long) method.invoke(object));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11927);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11928)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11929)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11930);json.add(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_2957957lx1e81ft.R.inc(11931);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11932)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11933)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11934);String value = (String) method.invoke(object);
                        __CLR4_5_2957957lx1e81ft.R.inc(11935);if ((((value != null)&&(__CLR4_5_2957957lx1e81ft.R.iget(11936)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11937)==0&false))) {{
                            __CLR4_5_2957957lx1e81ft.R.inc(11938);json.add(name, value);
                        }
                    }} }else {__CLR4_5_2957957lx1e81ft.R.inc(11939);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11940)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11941)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11942);Date value = (Date) method.invoke(object);
                        __CLR4_5_2957957lx1e81ft.R.inc(11943);if ((((value != null)&&(__CLR4_5_2957957lx1e81ft.R.iget(11944)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11945)==0&false))) {{
                            __CLR4_5_2957957lx1e81ft.R.inc(11946);json.add(name, dateFormat.print(new DateTime(value)));
                        }
                    }} }else {__CLR4_5_2957957lx1e81ft.R.inc(11947);if ((((method.getReturnType().equals(Map.class))&&(__CLR4_5_2957957lx1e81ft.R.iget(11948)!=0|true))||(__CLR4_5_2957957lx1e81ft.R.iget(11949)==0&false))) {{
                        __CLR4_5_2957957lx1e81ft.R.inc(11950);json.add(name, MiscFormatter.toJson((Map) method.invoke(object)));
                    }
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException error) {
                }
            }
        }}

        }__CLR4_5_2957957lx1e81ft.R.inc(11951);return json.build();
    }finally{__CLR4_5_2957957lx1e81ft.R.flushNeeded();}}

    public static JsonArray arrayToJson(Collection<?> array) {try{__CLR4_5_2957957lx1e81ft.R.inc(11952);

        __CLR4_5_2957957lx1e81ft.R.inc(11953);JsonArrayBuilder json = Json.createArrayBuilder();

        __CLR4_5_2957957lx1e81ft.R.inc(11954);for (Object object : array) {{
            __CLR4_5_2957957lx1e81ft.R.inc(11955);json.add(objectToJson(object));
        }

        }__CLR4_5_2957957lx1e81ft.R.inc(11956);return json.build();
    }finally{__CLR4_5_2957957lx1e81ft.R.flushNeeded();}}

}
