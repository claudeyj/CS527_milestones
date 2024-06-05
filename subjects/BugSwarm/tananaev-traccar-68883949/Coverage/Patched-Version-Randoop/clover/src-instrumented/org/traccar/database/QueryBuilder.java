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
import javax.sql.DataSource;
import org.traccar.model.Factory;

public class QueryBuilder {public static class __CLR4_5_2q8q8lx1dp57b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,1235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final Map<String, List<Integer>> indexMap;
    private final Connection connection;
    private PreparedStatement statement;
    private final String query;
    
    private QueryBuilder(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(944);
        __CLR4_5_2q8q8lx1dp57b.R.inc(945);indexMap = new HashMap<String, List<Integer>>();
        __CLR4_5_2q8q8lx1dp57b.R.inc(946);connection = dataSource.getConnection();
        __CLR4_5_2q8q8lx1dp57b.R.inc(947);this.query = query;
        __CLR4_5_2q8q8lx1dp57b.R.inc(948);if ((((query != null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(949)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(950)==0&false))) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(951);String parsedQuery = parse(query.trim(), indexMap);
            __CLR4_5_2q8q8lx1dp57b.R.inc(952);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(953);if ((((returnGeneratedKeys)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(954)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(955)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(956);statement = connection.prepareStatement(parsedQuery, Statement.RETURN_GENERATED_KEYS);
                } }else {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(957);statement = connection.prepareStatement(parsedQuery);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(958);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(959);throw error;
            }
        }
    }}finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    private static String parse(String query, Map<String, List<Integer>> paramMap) {try{__CLR4_5_2q8q8lx1dp57b.R.inc(960);

        __CLR4_5_2q8q8lx1dp57b.R.inc(961);int length = query.length();
        __CLR4_5_2q8q8lx1dp57b.R.inc(962);StringBuilder parsedQuery = new StringBuilder(length);
        __CLR4_5_2q8q8lx1dp57b.R.inc(963);boolean inSingleQuote = false;
        __CLR4_5_2q8q8lx1dp57b.R.inc(964);boolean inDoubleQuote = false;
        __CLR4_5_2q8q8lx1dp57b.R.inc(965);int index = 1;

        __CLR4_5_2q8q8lx1dp57b.R.inc(966);for (int i = 0; (((i < length)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(967)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(968)==0&false)); i++) {{

            __CLR4_5_2q8q8lx1dp57b.R.inc(969);char c = query.charAt(i);

            // String end
            __CLR4_5_2q8q8lx1dp57b.R.inc(970);if ((((inSingleQuote)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(971)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(972)==0&false))) {{
                __CLR4_5_2q8q8lx1dp57b.R.inc(973);if ((((c == '\'')&&(__CLR4_5_2q8q8lx1dp57b.R.iget(974)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(975)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(976);inSingleQuote = false;
                }
            }} }else {__CLR4_5_2q8q8lx1dp57b.R.inc(977);if ((((inDoubleQuote)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(978)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(979)==0&false))) {{
                __CLR4_5_2q8q8lx1dp57b.R.inc(980);if ((((c == '"')&&(__CLR4_5_2q8q8lx1dp57b.R.iget(981)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(982)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(983);inDoubleQuote = false;
                }
            }} }else {{

                // String begin
                __CLR4_5_2q8q8lx1dp57b.R.inc(984);if ((((c == '\'')&&(__CLR4_5_2q8q8lx1dp57b.R.iget(985)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(986)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(987);inSingleQuote = true;
                } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(988);if ((((c == '"')&&(__CLR4_5_2q8q8lx1dp57b.R.iget(989)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(990)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(991);inDoubleQuote = true;
                } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(992);if ((((c == ':' && i + 1 < length
                        && Character.isJavaIdentifierStart(query.charAt(i + 1)))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(993)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(994)==0&false))) {{

                    // Identifier name
                    __CLR4_5_2q8q8lx1dp57b.R.inc(995);int j = i + 2;
                    __CLR4_5_2q8q8lx1dp57b.R.inc(996);while ((((j < length && Character.isJavaIdentifierPart(query.charAt(j)))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(997)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(998)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(999);j++;
                    }

                    }__CLR4_5_2q8q8lx1dp57b.R.inc(1000);String name = query.substring(i + 1, j);
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1001);c = '?';
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1002);i += name.length();
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1003);name = name.toLowerCase();

                    // Add to list
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1004);List<Integer> indexList = paramMap.get(name);
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1005);if ((((indexList == null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1006)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1007)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1008);indexList = new LinkedList<Integer>();
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1009);paramMap.put(name, indexList);
                    }
                    }__CLR4_5_2q8q8lx1dp57b.R.inc(1010);indexList.add(index);

                    __CLR4_5_2q8q8lx1dp57b.R.inc(1011);index++;
                }
            }}}}

            }}__CLR4_5_2q8q8lx1dp57b.R.inc(1012);parsedQuery.append(c);
        }

        }__CLR4_5_2q8q8lx1dp57b.R.inc(1013);return parsedQuery.toString();
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1014);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1015);return new QueryBuilder(dataSource, query, false);
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1016);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1017);return new QueryBuilder(dataSource, query, returnGeneratedKeys);
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    private List<Integer> indexes(String name) {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1018);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1019);name = name.toLowerCase();
        __CLR4_5_2q8q8lx1dp57b.R.inc(1020);List<Integer> result = indexMap.get(name);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1021);if ((((result == null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1022)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1023)==0&false))) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1024);result = new LinkedList<Integer>();
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1025);return result;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setBoolean(String name, boolean value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1026);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1027);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1028);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1029);statement.setBoolean(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1030);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1031);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1032);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1033);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setInteger(String name, int value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1034);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1035);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1036);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1037);statement.setInt(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1038);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1039);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1040);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1041);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setLong(String name, long value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1042);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1043);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1044);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1045);statement.setLong(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1046);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1047);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1048);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1049);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setDouble(String name, double value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1050);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1051);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1052);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1053);statement.setDouble(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1054);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1055);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1056);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1057);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setString(String name, String value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1058);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1059);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1060);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1061);if ((((value == null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1062)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1063)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1064);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1065);statement.setString(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1066);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1067);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1068);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1069);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setDate(String name, Date value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1070);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1071);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1072);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1073);if ((((value == null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1074)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1075)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1076);statement.setNull(i, Types.TIMESTAMP);
                } }else {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1077);statement.setTimestamp(i, new Timestamp(value.getTime()));
                }
            }} catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1078);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1079);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1080);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1081);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setBytes(String name, byte[] value) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1082);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1083);for (int i : indexes(name)) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1084);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1085);if ((((value == null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1086)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1087)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1088);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1089);statement.setBytes(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1090);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1091);connection.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1092);throw error;
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1093);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public QueryBuilder setObject(Object object) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1094);
        
        __CLR4_5_2q8q8lx1dp57b.R.inc(1095);Method[] methods = object.getClass().getMethods();
        
        __CLR4_5_2q8q8lx1dp57b.R.inc(1096);for (Method method : methods) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1097);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1098)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1099)==0&false))) {{
                __CLR4_5_2q8q8lx1dp57b.R.inc(1100);String name = method.getName().substring(3);
                __CLR4_5_2q8q8lx1dp57b.R.inc(1101);try {
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1102);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1103)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1104)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1105);setBoolean(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1106);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1107)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1108)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1109);setInteger(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1110);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1111)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1112)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1113);setLong(name, (Long) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1114);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1115)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1116)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1117);setDouble(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1118);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1119)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1120)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1121);setString(name, (String) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1122);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1123)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1124)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1125);setDate(name, (Date) method.invoke(object));
                    } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1126);if ((((method.getReturnType().equals(byte[].class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1127)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1128)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1129);setBytes(name, (byte[]) method.invoke(object));
                    }
                }}}}}}}} catch (IllegalAccessException error) {
                } catch (InvocationTargetException error) {
                }
            }
        }}
        
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1130);return this;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    private interface ResultSetProcessor<T> {
        public void process(T object, ResultSet resultSet) throws SQLException;
    }
    
    public <T extends Factory> T executeQuerySingle(T prototype) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1131);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1132);Collection<T> result = executeQuery(prototype);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1133);if ((((!result.isEmpty())&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1134)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1135)==0&false))) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1136);return result.iterator().next();
        } }else {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1137);return null;
        }
    }}finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
    public <T extends Factory> Collection<T> executeQuery(T prototype) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1138);
        __CLR4_5_2q8q8lx1dp57b.R.inc(1139);List<T> result = new LinkedList<T>();
        
        __CLR4_5_2q8q8lx1dp57b.R.inc(1140);if ((((query != null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1141)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1142)==0&false))) {{
        
            __CLR4_5_2q8q8lx1dp57b.R.inc(1143);try {

                __CLR4_5_2q8q8lx1dp57b.R.inc(1144);ResultSet resultSet = statement.executeQuery();

                __CLR4_5_2q8q8lx1dp57b.R.inc(1145);try {

                    __CLR4_5_2q8q8lx1dp57b.R.inc(1146);ResultSetMetaData resultMetaData = resultSet.getMetaData();

                    __CLR4_5_2q8q8lx1dp57b.R.inc(1147);List<ResultSetProcessor<T>> processors = new LinkedList<ResultSetProcessor<T>>();

                    __CLR4_5_2q8q8lx1dp57b.R.inc(1148);Method[] methods = prototype.getClass().getMethods();

                    __CLR4_5_2q8q8lx1dp57b.R.inc(1149);for (final Method method : methods) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1150);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1151)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1152)==0&false))) {{

                            __CLR4_5_2q8q8lx1dp57b.R.inc(1153);final String name = method.getName().substring(3);

                            // Check if column exists
                            __CLR4_5_2q8q8lx1dp57b.R.inc(1154);boolean column = false;
                            __CLR4_5_2q8q8lx1dp57b.R.inc(1155);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1156)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1157)==0&false)); i++) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1158);if ((((name.equalsIgnoreCase(resultMetaData.getColumnLabel(i)))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1159)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1160)==0&false))) {{
                                    __CLR4_5_2q8q8lx1dp57b.R.inc(1161);column = true;
                                    __CLR4_5_2q8q8lx1dp57b.R.inc(1162);break;
                                }
                            }}
                            }__CLR4_5_2q8q8lx1dp57b.R.inc(1163);if ((((!column)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1164)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1165)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1166);continue;
                            }

                            }__CLR4_5_2q8q8lx1dp57b.R.inc(1167);Class<?> parameterType = method.getParameterTypes()[0];

                            __CLR4_5_2q8q8lx1dp57b.R.inc(1168);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1169)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1170)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1171);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1172);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1173);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1174);method.invoke(object, resultSet.getBoolean(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1175);if ((((parameterType.equals(int.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1176)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1177)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1178);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1179);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1180);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1181);method.invoke(object, resultSet.getInt(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1182);if ((((parameterType.equals(long.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1183)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1184)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1185);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1186);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1187);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1188);method.invoke(object, resultSet.getLong(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1189);if ((((parameterType.equals(double.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1190)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1191)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1192);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1193);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1194);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1195);method.invoke(object, resultSet.getDouble(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1196);if ((((parameterType.equals(String.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1197)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1198)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1199);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1200);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1201);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1202);method.invoke(object, resultSet.getString(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q8q8lx1dp57b.R.inc(1203);if ((((parameterType.equals(Date.class))&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1204)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1205)==0&false))) {{
                                __CLR4_5_2q8q8lx1dp57b.R.inc(1206);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1207);
                                        __CLR4_5_2q8q8lx1dp57b.R.inc(1208);try {
                                            __CLR4_5_2q8q8lx1dp57b.R.inc(1209);method.invoke(object, new Date(resultSet.getTimestamp(name).getTime()));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
                                });
                            }
                        }}}}}}}
                    }}

                    }__CLR4_5_2q8q8lx1dp57b.R.inc(1210);while ((((resultSet.next())&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1211)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1212)==0&false))) {{
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1213);T object = (T) prototype.create();
                        __CLR4_5_2q8q8lx1dp57b.R.inc(1214);for (ResultSetProcessor<T> processor : processors) {{
                            __CLR4_5_2q8q8lx1dp57b.R.inc(1215);processor.process(object, resultSet);
                        }
                        }__CLR4_5_2q8q8lx1dp57b.R.inc(1216);result.add(object);
                    }

                }} finally {
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1217);resultSet.close();
                }

            } finally {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1218);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1219);connection.close();
            }
        }

        }__CLR4_5_2q8q8lx1dp57b.R.inc(1220);return result;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}

    public long executeUpdate() throws SQLException {try{__CLR4_5_2q8q8lx1dp57b.R.inc(1221);
        
        __CLR4_5_2q8q8lx1dp57b.R.inc(1222);if ((((query != null)&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1223)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1224)==0&false))) {{
            __CLR4_5_2q8q8lx1dp57b.R.inc(1225);try {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1226);statement.executeUpdate();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1227);ResultSet resultSet = statement.getGeneratedKeys();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1228);if ((((resultSet.next())&&(__CLR4_5_2q8q8lx1dp57b.R.iget(1229)!=0|true))||(__CLR4_5_2q8q8lx1dp57b.R.iget(1230)==0&false))) {{
                    __CLR4_5_2q8q8lx1dp57b.R.inc(1231);return resultSet.getLong(1);
                }
            }} finally {
                __CLR4_5_2q8q8lx1dp57b.R.inc(1232);statement.close();
                __CLR4_5_2q8q8lx1dp57b.R.inc(1233);connection.close();
            }
        }
        }__CLR4_5_2q8q8lx1dp57b.R.inc(1234);return 0;
    }finally{__CLR4_5_2q8q8lx1dp57b.R.flushNeeded();}}
    
}
