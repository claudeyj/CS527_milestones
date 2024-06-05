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

@java.lang.SuppressWarnings({"fallthrough"}) public class CsvBuilder {public static class __CLR4_5_2ganganlx1dwlhc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,21229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String LINE_ENDING = "\r\n";
    private static final String SEPARATOR = ";";
    private static final DateTimeFormatter DATE_FORMAT = ISODateTimeFormat.dateTime();

    private StringBuilder builder = new StringBuilder();

    private void addLineEnding() {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21119);
        __CLR4_5_2ganganlx1dwlhc.R.inc(21120);builder.append(LINE_ENDING);
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}
    private void addSeparator() {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21121);
        __CLR4_5_2ganganlx1dwlhc.R.inc(21122);builder.append(SEPARATOR);
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}

    private SortedSet<Method> getSortedMethods(Object object) {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21123);
        __CLR4_5_2ganganlx1dwlhc.R.inc(21124);Method[] methodArray = object.getClass().getMethods();
        __CLR4_5_2ganganlx1dwlhc.R.inc(21125);SortedSet<Method> methods = new TreeSet<Method>(new Comparator<Method>() {
            @Override
            public int compare(Method m1, Method m2) {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21126);
                __CLR4_5_2ganganlx1dwlhc.R.inc(21127);if ((((m1.getName().equals("getAttributes") && !m1.getName().equals(m2.getName()))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21128)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21129)==0&false))) {{
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21130);return 1;
                }
                }__CLR4_5_2ganganlx1dwlhc.R.inc(21131);if ((((m2.getName().equals("getAttributes") && !m1.getName().equals(m2.getName()))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21132)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21133)==0&false))) {{
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21134);return -1;
                }
                }__CLR4_5_2ganganlx1dwlhc.R.inc(21135);return m1.getName().compareTo(m2.getName());
            }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}
        });
        __CLR4_5_2ganganlx1dwlhc.R.inc(21136);methods.addAll(Arrays.asList(methodArray));
        __CLR4_5_2ganganlx1dwlhc.R.inc(21137);return methods;
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}

    public void addLine(Object object) {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21138);

        __CLR4_5_2ganganlx1dwlhc.R.inc(21139);SortedSet<Method> methods = getSortedMethods(object);

        __CLR4_5_2ganganlx1dwlhc.R.inc(21140);for (Method method : methods) {{
            __CLR4_5_2ganganlx1dwlhc.R.inc(21141);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21142)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21143)==0&false))) {{
                __CLR4_5_2ganganlx1dwlhc.R.inc(21144);try {
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21145);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21146)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21147)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21148);builder.append((Boolean) method.invoke(object));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21149);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21150);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21151)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21152)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21153);builder.append((Integer) method.invoke(object));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21154);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21155);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21156)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21157)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21158);builder.append((Long) method.invoke(object));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21159);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21160);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21161)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21162)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21163);builder.append((Double) method.invoke(object));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21164);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21165);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21166)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21167)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21168);builder.append((String) method.invoke(object));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21169);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21170);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21171)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21172)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21173);Date value = (Date) method.invoke(object);
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21174);builder.append(DATE_FORMAT.print(new DateTime(value)));
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21175);addSeparator();
                    } }else {__CLR4_5_2ganganlx1dwlhc.R.inc(21176);if ((((method.getReturnType().equals(Map.class))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21177)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21178)==0&false))) {{
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21179);Map value = (Map) method.invoke(object);
                        __CLR4_5_2ganganlx1dwlhc.R.inc(21180);if ((((value != null)&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21181)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21182)==0&false))) {{
                            __CLR4_5_2ganganlx1dwlhc.R.inc(21183);try {
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21184);String map = Context.getObjectMapper().writeValueAsString(value);
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21185);map = map.replaceAll("[\\{\\}\"]", "");
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21186);map = map.replaceAll(",", " ");
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21187);builder.append(map);
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21188);addSeparator();
                            } catch (JsonProcessingException e) {
                                __CLR4_5_2ganganlx1dwlhc.R.inc(21189);Log.warning(e);
                            }
                        }
                    }}
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException error) {
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21190);Log.warning(error);
                }
            }
        }}
        }__CLR4_5_2ganganlx1dwlhc.R.inc(21191);addLineEnding();
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}

    public void addHeaderLine(Object object) {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21192);

        __CLR4_5_2ganganlx1dwlhc.R.inc(21193);SortedSet<Method> methods = getSortedMethods(object);

        __CLR4_5_2ganganlx1dwlhc.R.inc(21194);for (Method method : methods) {{
            __CLR4_5_2ganganlx1dwlhc.R.inc(21195);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21196)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21197)==0&false))) {{
                __CLR4_5_2ganganlx1dwlhc.R.inc(21198);String name = Introspector.decapitalize(method.getName().substring(3));
                __CLR4_5_2ganganlx1dwlhc.R.inc(21199);if ((((!name.equals("class"))&&(__CLR4_5_2ganganlx1dwlhc.R.iget(21200)!=0|true))||(__CLR4_5_2ganganlx1dwlhc.R.iget(21201)==0&false))) {{
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21202);builder.append(name);
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21203);addSeparator();
                }
            }}
        }}
        }__CLR4_5_2ganganlx1dwlhc.R.inc(21204);addLineEnding();
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}

    public void addArray(Collection<?> array) {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21205);
        __CLR4_5_2ganganlx1dwlhc.R.inc(21206);for (Object object : array) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ganganlx1dwlhc.R.inc(21207);switch (object.getClass().getSimpleName().toLowerCase()) {
                case "string":if (!__CLB4_5_2_bool0) {__CLR4_5_2ganganlx1dwlhc.R.inc(21208);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21209);builder.append(object.toString());
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21210);addLineEnding();
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21211);break;
                case "long":if (!__CLB4_5_2_bool0) {__CLR4_5_2ganganlx1dwlhc.R.inc(21212);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21213);builder.append((long) object);
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21214);addLineEnding();
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21215);break;
                case "double":if (!__CLB4_5_2_bool0) {__CLR4_5_2ganganlx1dwlhc.R.inc(21216);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21217);builder.append((double) object);
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21218);addLineEnding();
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21219);break;
                case "boolean":if (!__CLB4_5_2_bool0) {__CLR4_5_2ganganlx1dwlhc.R.inc(21220);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21221);builder.append((boolean) object);
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21222);addLineEnding();
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21223);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ganganlx1dwlhc.R.inc(21224);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21225);addLine(object);
                    __CLR4_5_2ganganlx1dwlhc.R.inc(21226);break;
            }
        }
    }}finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}

    public String build() {try{__CLR4_5_2ganganlx1dwlhc.R.inc(21227);
        __CLR4_5_2ganganlx1dwlhc.R.inc(21228);return builder.toString();
    }finally{__CLR4_5_2ganganlx1dwlhc.R.flushNeeded();}}
}
