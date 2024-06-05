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
package org.traccar.web;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.traccar.Context;
import org.traccar.helper.Log;

@java.lang.SuppressWarnings({"fallthrough"}) public class CsvBuilder {public static class __CLR4_5_2j6zj6zlwydzrhz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,24985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String LINE_ENDING = "\r\n";
    private static final String SEPARATOR = ";";
    private static final DateTimeFormatter DATE_FORMAT = ISODateTimeFormat.dateTime();

    private StringBuilder builder = new StringBuilder();

    private void addLineEnding() {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24875);
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24876);builder.append(LINE_ENDING);
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}
    private void addSeparator() {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24877);
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24878);builder.append(SEPARATOR);
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}

    private SortedSet<Method> getSortedMethods(Object object) {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24879);
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24880);Method[] methodArray = object.getClass().getMethods();
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24881);SortedSet<Method> methods = new TreeSet<Method>(new Comparator<Method>() {
            @Override
            public int compare(Method m1, Method m2) {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24882);
                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24883);if ((((m1.getName().equals("getAttributes") && !m1.getName().equals(m2.getName()))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24884)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24885)==0&false))) {{
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24886);return 1;
                }
                }__CLR4_5_2j6zj6zlwydzrhz.R.inc(24887);if ((((m2.getName().equals("getAttributes") && !m1.getName().equals(m2.getName()))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24888)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24889)==0&false))) {{
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24890);return -1;
                }
                }__CLR4_5_2j6zj6zlwydzrhz.R.inc(24891);return m1.getName().compareTo(m2.getName());
            }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}
        });
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24892);methods.addAll(Arrays.asList(methodArray));
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24893);return methods;
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}

    public void addLine(Object object) {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24894);

        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24895);SortedSet<Method> methods = getSortedMethods(object);

        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24896);for (Method method : methods) {{
            __CLR4_5_2j6zj6zlwydzrhz.R.inc(24897);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24898)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24899)==0&false))) {{
                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24900);try {
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24901);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24902)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24903)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24904);builder.append((Boolean) method.invoke(object));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24905);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24906);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24907)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24908)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24909);builder.append((Integer) method.invoke(object));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24910);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24911);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24912)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24913)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24914);builder.append((Long) method.invoke(object));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24915);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24916);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24917)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24918)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24919);builder.append((Double) method.invoke(object));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24920);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24921);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24922)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24923)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24924);builder.append((String) method.invoke(object));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24925);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24926);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24927)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24928)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24929);Date value = (Date) method.invoke(object);
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24930);builder.append(DATE_FORMAT.print(new DateTime(value)));
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24931);addSeparator();
                    } }else {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24932);if ((((method.getReturnType().equals(Map.class))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24933)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24934)==0&false))) {{
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24935);Map value = (Map) method.invoke(object);
                        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24936);if ((((value != null)&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24937)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24938)==0&false))) {{
                            __CLR4_5_2j6zj6zlwydzrhz.R.inc(24939);try {
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24940);String map = Context.getObjectMapper().writeValueAsString(value);
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24941);map = map.replaceAll("[\\{\\}\"]", "");
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24942);map = map.replaceAll(",", " ");
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24943);builder.append(map);
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24944);addSeparator();
                            } catch (JsonProcessingException e) {
                                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24945);Log.warning(e);
                            }
                        }
                    }}
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException error) {
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24946);Log.warning(error);
                }
            }
        }}
        }__CLR4_5_2j6zj6zlwydzrhz.R.inc(24947);addLineEnding();
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}

    public void addHeaderLine(Object object) {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24948);

        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24949);SortedSet<Method> methods = getSortedMethods(object);

        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24950);for (Method method : methods) {{
            __CLR4_5_2j6zj6zlwydzrhz.R.inc(24951);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24952)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24953)==0&false))) {{
                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24954);String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_2j6zj6zlwydzrhz.R.inc(24955);if ((((!name.equals("class"))&&(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24956)!=0|true))||(__CLR4_5_2j6zj6zlwydzrhz.R.iget(24957)==0&false))) {{
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24958);builder.append(name);
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24959);addSeparator();
                }
            }}
        }}
        }__CLR4_5_2j6zj6zlwydzrhz.R.inc(24960);addLineEnding();
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}

    public void addArray(Collection<?> array) {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24961);
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24962);for (Object object : array) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2j6zj6zlwydzrhz.R.inc(24963);switch (object.getClass().getSimpleName().toLowerCase()) {
                case "string":if (!__CLB4_5_2_bool0) {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24964);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24965);builder.append(object.toString());
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24966);addLineEnding();
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24967);break;
                case "long":if (!__CLB4_5_2_bool0) {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24968);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24969);builder.append((long) object);
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24970);addLineEnding();
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24971);break;
                case "double":if (!__CLB4_5_2_bool0) {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24972);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24973);builder.append((double) object);
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24974);addLineEnding();
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24975);break;
                case "boolean":if (!__CLB4_5_2_bool0) {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24976);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24977);builder.append((boolean) object);
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24978);addLineEnding();
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24979);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2j6zj6zlwydzrhz.R.inc(24980);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24981);addLine(object);
                    __CLR4_5_2j6zj6zlwydzrhz.R.inc(24982);break;
            }
        }
    }}finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}

    public String build() {try{__CLR4_5_2j6zj6zlwydzrhz.R.inc(24983);
        __CLR4_5_2j6zj6zlwydzrhz.R.inc(24984);return builder.toString();
    }finally{__CLR4_5_2j6zj6zlwydzrhz.R.flushNeeded();}}
}
