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
package org.traccar.database;

import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.stream.JsonParsingException;
import javax.sql.DataSource;

import org.traccar.Context;
import org.traccar.model.Factory;
import org.traccar.model.MiscFormatter;

public class QueryBuilder {public static class __CLR4_5_2rtrtlx1e4wyo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,1294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final Map<String, List<Integer>> indexMap = new HashMap<>();
    private Connection connection;
    private PreparedStatement statement;
    private final String query;
    private final boolean returnGeneratedKeys;
    
    private QueryBuilder(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1001);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1002);this.query = query;
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1003);this.returnGeneratedKeys = returnGeneratedKeys;
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1004);if ((((query != null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1005)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1006)==0&false))) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1007);connection = dataSource.getConnection();
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1008);String parsedQuery = parse(query.trim(), indexMap);
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1009);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1010);if ((((returnGeneratedKeys)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1011)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1012)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1013);statement = connection.prepareStatement(parsedQuery, Statement.RETURN_GENERATED_KEYS);
                } }else {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1014);statement = connection.prepareStatement(parsedQuery);
                }
            }} catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1015);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1016);throw error;
            }
        }
    }}finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    private static String parse(String query, Map<String, List<Integer>> paramMap) {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1017);

        __CLR4_5_2rtrtlx1e4wyo.R.inc(1018);int length = query.length();
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1019);StringBuilder parsedQuery = new StringBuilder(length);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1020);boolean inSingleQuote = false;
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1021);boolean inDoubleQuote = false;
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1022);int index = 1;

        __CLR4_5_2rtrtlx1e4wyo.R.inc(1023);for (int i = 0; (((i < length)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1024)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1025)==0&false)); i++) {{

            __CLR4_5_2rtrtlx1e4wyo.R.inc(1026);char c = query.charAt(i);

            // String end
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1027);if ((((inSingleQuote)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1028)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1029)==0&false))) {{
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1030);if ((((c == '\'')&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1031)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1032)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1033);inSingleQuote = false;
                }
            }} }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1034);if ((((inDoubleQuote)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1035)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1036)==0&false))) {{
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1037);if ((((c == '"')&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1038)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1039)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1040);inDoubleQuote = false;
                }
            }} }else {{

                // String begin
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1041);if ((((c == '\'')&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1042)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1043)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1044);inSingleQuote = true;
                } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1045);if ((((c == '"')&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1046)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1047)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1048);inDoubleQuote = true;
                } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1049);if ((((c == ':' && i + 1 < length
                        && Character.isJavaIdentifierStart(query.charAt(i + 1)))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1050)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1051)==0&false))) {{

                    // Identifier name
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1052);int j = i + 2;
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1053);while ((((j < length && Character.isJavaIdentifierPart(query.charAt(j)))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1054)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1055)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1056);j++;
                    }

                    }__CLR4_5_2rtrtlx1e4wyo.R.inc(1057);String name = query.substring(i + 1, j);
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1058);c = '?';
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1059);i += name.length();
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1060);name = name.toLowerCase();

                    // Add to list
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1061);List<Integer> indexList = paramMap.get(name);
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1062);if ((((indexList == null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1063)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1064)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1065);indexList = new LinkedList<>();
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1066);paramMap.put(name, indexList);
                    }
                    }__CLR4_5_2rtrtlx1e4wyo.R.inc(1067);indexList.add(index);

                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1068);index++;
                }
            }}}}

            }}__CLR4_5_2rtrtlx1e4wyo.R.inc(1069);parsedQuery.append(c);
        }

        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1070);return parsedQuery.toString();
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1071);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1072);return new QueryBuilder(dataSource, query, false);
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1073);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1074);return new QueryBuilder(dataSource, query, returnGeneratedKeys);
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    private List<Integer> indexes(String name) {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1075);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1076);name = name.toLowerCase();
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1077);List<Integer> result = indexMap.get(name);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1078);if ((((result == null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1079)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1080)==0&false))) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1081);result = new LinkedList<>();
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1082);return result;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setBoolean(String name, boolean value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1083);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1084);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1085);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1086);statement.setBoolean(i, value);
            } catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1087);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1088);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1089);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1090);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setInteger(String name, int value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1091);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1092);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1093);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1094);statement.setInt(i, value);
            } catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1095);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1096);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1097);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1098);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setLong(String name, long value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1099);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1100);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1101);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1102);statement.setLong(i, value);
            } catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1103);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1104);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1105);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1106);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setDouble(String name, double value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1107);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1108);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1109);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1110);statement.setDouble(i, value);
            } catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1111);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1112);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1113);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1114);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setString(String name, String value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1115);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1116);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1117);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1118);if ((((value == null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1119)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1120)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1121);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1122);statement.setString(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1123);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1124);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1125);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1126);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setDate(String name, Date value) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1127);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1128);for (int i : indexes(name)) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1129);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1130);if ((((value == null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1131)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1132)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1133);statement.setNull(i, Types.TIMESTAMP);
                } }else {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1134);statement.setTimestamp(i, new Timestamp(value.getTime()));
                }
            }} catch (SQLException error) {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1135);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1136);connection.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1137);throw error;
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1138);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public QueryBuilder setObject(Object object) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1139);
        
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1140);Method[] methods = object.getClass().getMethods();
        
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1141);for (Method method : methods) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1142);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1143)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1144)==0&false))) {{
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1145);String name = method.getName().substring(3);
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1146);try {
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1147);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1148)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1149)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1150);setBoolean(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1151);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1152)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1153)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1154);setInteger(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1155);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1156)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1157)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1158);setLong(name, (Long) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1159);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1160)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1161)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1162);setDouble(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1163);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1164)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1165)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1166);setString(name, (String) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1167);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1168)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1169)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1170);setDate(name, (Date) method.invoke(object));
                    } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1171);if ((((method.getReturnType().equals(Map.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1172)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1173)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1174);if ((((Context.getConfig().getBoolean("database.xml"))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1175)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1176)==0&false))) {{
                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1177);setString(name, MiscFormatter.toXmlString((Map) method.invoke(object)));
                        } }else {{
                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1178);setString(name, MiscFormatter.toJsonString((Map) method.invoke(object)));
                        }
                    }}
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException error) {
                }
            }
        }}
        
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1179);return this;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    private interface ResultSetProcessor<T> {
        public void process(T object, ResultSet resultSet) throws SQLException;
    }
    
    public <T extends Factory> T executeQuerySingle(T prototype) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1180);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1181);Collection<T> result = executeQuery(prototype);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1182);if ((((!result.isEmpty())&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1183)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1184)==0&false))) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1185);return result.iterator().next();
        } }else {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1186);return null;
        }
    }}finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
    public <T extends Factory> Collection<T> executeQuery(T prototype) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1187);
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1188);List<T> result = new LinkedList<>();
        
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1189);if ((((query != null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1190)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1191)==0&false))) {{
        
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1192);try {

                class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2rtrtlx1e4wyo.R.inc(1193);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2rtrtlx1e4wyo.R.inc(1194);}};ResultSet resultSet = statement.executeQuery()) {

                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1195);ResultSetMetaData resultMetaData = resultSet.getMetaData();

                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1196);List<ResultSetProcessor<T>> processors = new LinkedList<>();

                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1197);Method[] methods = prototype.getClass().getMethods();

                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1198);for (final Method method : methods) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1199);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1200)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1201)==0&false))) {{

                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1202);final String name = method.getName().substring(3);

                            // Check if column exists
                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1203);boolean column = false;
                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1204);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1205)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1206)==0&false)); i++) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1207);if ((((name.equalsIgnoreCase(resultMetaData.getColumnLabel(i)))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1208)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1209)==0&false))) {{
                                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1210);column = true;
                                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1211);break;
                                }
                            }}
                            }__CLR4_5_2rtrtlx1e4wyo.R.inc(1212);if ((((!column)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1213)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1214)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1215);continue;
                            }

                            }__CLR4_5_2rtrtlx1e4wyo.R.inc(1216);Class<?> parameterType = method.getParameterTypes()[0];

                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1217);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1218)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1219)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1220);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1221);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1222);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1223);method.invoke(object, resultSet.getBoolean(name));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1224);if ((((parameterType.equals(int.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1225)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1226)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1227);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1228);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1229);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1230);method.invoke(object, resultSet.getInt(name));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1231);if ((((parameterType.equals(long.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1232)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1233)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1234);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1235);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1236);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1237);method.invoke(object, resultSet.getLong(name));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1238);if ((((parameterType.equals(double.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1239)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1240)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1241);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1242);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1243);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1244);method.invoke(object, resultSet.getDouble(name));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1245);if ((((parameterType.equals(String.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1246)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1247)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1248);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1249);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1250);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1251);method.invoke(object, resultSet.getString(name));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1252);if ((((parameterType.equals(Date.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1253)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1254)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1255);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1256);
                                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1257);try {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1258);method.invoke(object, new Date(resultSet.getTimestamp(name).getTime()));
                                        } catch (IllegalAccessException | InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2rtrtlx1e4wyo.R.inc(1259);if ((((parameterType.equals(Map.class))&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1260)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1261)==0&false))) {{
                                __CLR4_5_2rtrtlx1e4wyo.R.inc(1262);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1263);
                                        class __CLR4_5_2$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2rtrtlx1e4wyo.R.inc(1264);try (__CLR4_5_2$AC1 __CLR$ACI1=new __CLR4_5_2$AC1(){{__CLR4_5_2rtrtlx1e4wyo.R.inc(1265);}};JsonReader reader = Json.createReader(new StringReader(resultSet.getString(name)))) {
                                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1266);method.invoke(object, MiscFormatter.fromJson(reader.readObject()));
                                        } catch (IllegalAccessException | InvocationTargetException | JsonParsingException error) {
                                        }
                                    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
                                });
                            }
                        }}}}}}}}
                    }}

                    }__CLR4_5_2rtrtlx1e4wyo.R.inc(1267);while ((((resultSet.next())&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1268)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1269)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1270);T object = (T) prototype.create();
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1271);for (ResultSetProcessor<T> processor : processors) {{
                            __CLR4_5_2rtrtlx1e4wyo.R.inc(1272);processor.process(object, resultSet);
                        }
                        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1273);result.add(object);
                    }
                }}

            } finally {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1274);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1275);connection.close();
            }
        }

        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1276);return result;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}

    public long executeUpdate() throws SQLException {try{__CLR4_5_2rtrtlx1e4wyo.R.inc(1277);
        
        __CLR4_5_2rtrtlx1e4wyo.R.inc(1278);if ((((query != null)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1279)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1280)==0&false))) {{
            __CLR4_5_2rtrtlx1e4wyo.R.inc(1281);try {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1282);statement.executeUpdate();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1283);if ((((returnGeneratedKeys)&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1284)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1285)==0&false))) {{
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1286);ResultSet resultSet = statement.getGeneratedKeys();
                    __CLR4_5_2rtrtlx1e4wyo.R.inc(1287);if ((((resultSet.next())&&(__CLR4_5_2rtrtlx1e4wyo.R.iget(1288)!=0|true))||(__CLR4_5_2rtrtlx1e4wyo.R.iget(1289)==0&false))) {{
                        __CLR4_5_2rtrtlx1e4wyo.R.inc(1290);return resultSet.getLong(1);
                    }
                }}
            }} finally {
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1291);statement.close();
                __CLR4_5_2rtrtlx1e4wyo.R.inc(1292);connection.close();
            }
        }
        }__CLR4_5_2rtrtlx1e4wyo.R.inc(1293);return 0;
    }finally{__CLR4_5_2rtrtlx1e4wyo.R.flushNeeded();}}
    
}
