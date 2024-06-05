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

public class QueryBuilder {public static class __CLR4_5_2q7q7lx1dh0j4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,1234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final Map<String, List<Integer>> indexMap;
    private final Connection connection;
    private PreparedStatement statement;
    private final String query;
    
    private QueryBuilder(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(943);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(944);indexMap = new HashMap<String, List<Integer>>();
        __CLR4_5_2q7q7lx1dh0j4.R.inc(945);connection = dataSource.getConnection();
        __CLR4_5_2q7q7lx1dh0j4.R.inc(946);this.query = query;
        __CLR4_5_2q7q7lx1dh0j4.R.inc(947);if ((((query != null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(948)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(949)==0&false))) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(950);String parsedQuery = parse(query.trim(), indexMap);
            __CLR4_5_2q7q7lx1dh0j4.R.inc(951);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(952);if ((((returnGeneratedKeys)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(953)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(954)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(955);statement = connection.prepareStatement(parsedQuery, Statement.RETURN_GENERATED_KEYS);
                } }else {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(956);statement = connection.prepareStatement(parsedQuery);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(957);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(958);throw error;
            }
        }
    }}finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    private static String parse(String query, Map<String, List<Integer>> paramMap) {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(959);

        __CLR4_5_2q7q7lx1dh0j4.R.inc(960);int length = query.length();
        __CLR4_5_2q7q7lx1dh0j4.R.inc(961);StringBuilder parsedQuery = new StringBuilder(length);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(962);boolean inSingleQuote = false;
        __CLR4_5_2q7q7lx1dh0j4.R.inc(963);boolean inDoubleQuote = false;
        __CLR4_5_2q7q7lx1dh0j4.R.inc(964);int index = 1;

        __CLR4_5_2q7q7lx1dh0j4.R.inc(965);for (int i = 0; (((i < length)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(966)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(967)==0&false)); i++) {{

            __CLR4_5_2q7q7lx1dh0j4.R.inc(968);char c = query.charAt(i);

            // String end
            __CLR4_5_2q7q7lx1dh0j4.R.inc(969);if ((((inSingleQuote)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(970)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(971)==0&false))) {{
                __CLR4_5_2q7q7lx1dh0j4.R.inc(972);if ((((c == '\'')&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(973)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(974)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(975);inSingleQuote = false;
                }
            }} }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(976);if ((((inDoubleQuote)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(977)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(978)==0&false))) {{
                __CLR4_5_2q7q7lx1dh0j4.R.inc(979);if ((((c == '"')&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(980)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(981)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(982);inDoubleQuote = false;
                }
            }} }else {{

                // String begin
                __CLR4_5_2q7q7lx1dh0j4.R.inc(983);if ((((c == '\'')&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(984)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(985)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(986);inSingleQuote = true;
                } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(987);if ((((c == '"')&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(988)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(989)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(990);inDoubleQuote = true;
                } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(991);if ((((c == ':' && i + 1 < length
                        && Character.isJavaIdentifierStart(query.charAt(i + 1)))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(992)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(993)==0&false))) {{

                    // Identifier name
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(994);int j = i + 2;
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(995);while ((((j < length && Character.isJavaIdentifierPart(query.charAt(j)))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(996)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(997)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(998);j++;
                    }

                    }__CLR4_5_2q7q7lx1dh0j4.R.inc(999);String name = query.substring(i + 1, j);
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1000);c = '?';
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1001);i += name.length();
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1002);name = name.toLowerCase();

                    // Add to list
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1003);List<Integer> indexList = paramMap.get(name);
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1004);if ((((indexList == null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1005)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1006)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1007);indexList = new LinkedList<Integer>();
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1008);paramMap.put(name, indexList);
                    }
                    }__CLR4_5_2q7q7lx1dh0j4.R.inc(1009);indexList.add(index);

                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1010);index++;
                }
            }}}}

            }}__CLR4_5_2q7q7lx1dh0j4.R.inc(1011);parsedQuery.append(c);
        }

        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1012);return parsedQuery.toString();
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1013);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1014);return new QueryBuilder(dataSource, query, false);
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1015);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1016);return new QueryBuilder(dataSource, query, returnGeneratedKeys);
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    private List<Integer> indexes(String name) {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1017);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1018);name = name.toLowerCase();
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1019);List<Integer> result = indexMap.get(name);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1020);if ((((result == null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1021)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1022)==0&false))) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1023);result = new LinkedList<Integer>();
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1024);return result;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setBoolean(String name, boolean value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1025);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1026);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1027);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1028);statement.setBoolean(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1029);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1030);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1031);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1032);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setInteger(String name, int value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1033);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1034);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1035);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1036);statement.setInt(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1037);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1038);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1039);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1040);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setLong(String name, long value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1041);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1042);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1043);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1044);statement.setLong(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1045);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1046);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1047);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1048);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setDouble(String name, double value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1049);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1050);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1051);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1052);statement.setDouble(i, value);
            } catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1053);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1054);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1055);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1056);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setString(String name, String value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1057);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1058);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1059);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1060);if ((((value == null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1061)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1062)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1063);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1064);statement.setString(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1065);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1066);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1067);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1068);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setDate(String name, Date value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1069);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1070);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1071);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1072);if ((((value == null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1073)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1074)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1075);statement.setNull(i, Types.TIMESTAMP);
                } }else {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1076);statement.setTimestamp(i, new Timestamp(value.getTime()));
                }
            }} catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1077);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1078);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1079);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1080);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setBytes(String name, byte[] value) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1081);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1082);for (int i : indexes(name)) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1083);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1084);if ((((value == null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1085)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1086)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1087);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1088);statement.setBytes(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1089);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1090);connection.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1091);throw error;
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1092);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public QueryBuilder setObject(Object object) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1093);
        
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1094);Method[] methods = object.getClass().getMethods();
        
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1095);for (Method method : methods) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1096);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1097)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1098)==0&false))) {{
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1099);String name = method.getName().substring(3);
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1100);try {
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1101);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1102)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1103)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1104);setBoolean(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1105);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1106)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1107)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1108);setInteger(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1109);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1110)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1111)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1112);setLong(name, (Long) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1113);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1114)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1115)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1116);setDouble(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1117);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1118)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1119)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1120);setString(name, (String) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1121);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1122)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1123)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1124);setDate(name, (Date) method.invoke(object));
                    } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1125);if ((((method.getReturnType().equals(byte[].class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1126)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1127)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1128);setBytes(name, (byte[]) method.invoke(object));
                    }
                }}}}}}}} catch (IllegalAccessException error) {
                } catch (InvocationTargetException error) {
                }
            }
        }}
        
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1129);return this;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    private interface ResultSetProcessor<T> {
        public void process(T object, ResultSet resultSet) throws SQLException;
    }
    
    public <T extends Factory> T executeQuerySingle(T prototype) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1130);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1131);Collection<T> result = executeQuery(prototype);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1132);if ((((!result.isEmpty())&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1133)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1134)==0&false))) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1135);return result.iterator().next();
        } }else {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1136);return null;
        }
    }}finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
    public <T extends Factory> Collection<T> executeQuery(T prototype) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1137);
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1138);List<T> result = new LinkedList<T>();
        
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1139);if ((((query != null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1140)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1141)==0&false))) {{
        
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1142);try {

                __CLR4_5_2q7q7lx1dh0j4.R.inc(1143);ResultSet resultSet = statement.executeQuery();

                __CLR4_5_2q7q7lx1dh0j4.R.inc(1144);try {

                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1145);ResultSetMetaData resultMetaData = resultSet.getMetaData();

                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1146);List<ResultSetProcessor<T>> processors = new LinkedList<ResultSetProcessor<T>>();

                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1147);Method[] methods = prototype.getClass().getMethods();

                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1148);for (final Method method : methods) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1149);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1150)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1151)==0&false))) {{

                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1152);final String name = method.getName().substring(3);

                            // Check if column exists
                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1153);boolean column = false;
                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1154);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1155)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1156)==0&false)); i++) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1157);if ((((name.equalsIgnoreCase(resultMetaData.getColumnLabel(i)))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1158)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1159)==0&false))) {{
                                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1160);column = true;
                                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1161);break;
                                }
                            }}
                            }__CLR4_5_2q7q7lx1dh0j4.R.inc(1162);if ((((!column)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1163)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1164)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1165);continue;
                            }

                            }__CLR4_5_2q7q7lx1dh0j4.R.inc(1166);Class<?> parameterType = method.getParameterTypes()[0];

                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1167);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1168)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1169)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1170);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1171);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1172);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1173);method.invoke(object, resultSet.getBoolean(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1174);if ((((parameterType.equals(int.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1175)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1176)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1177);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1178);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1179);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1180);method.invoke(object, resultSet.getInt(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1181);if ((((parameterType.equals(long.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1182)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1183)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1184);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1185);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1186);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1187);method.invoke(object, resultSet.getLong(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1188);if ((((parameterType.equals(double.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1189)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1190)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1191);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1192);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1193);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1194);method.invoke(object, resultSet.getDouble(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1195);if ((((parameterType.equals(String.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1196)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1197)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1198);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1199);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1200);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1201);method.invoke(object, resultSet.getString(name));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            } }else {__CLR4_5_2q7q7lx1dh0j4.R.inc(1202);if ((((parameterType.equals(Date.class))&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1203)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1204)==0&false))) {{
                                __CLR4_5_2q7q7lx1dh0j4.R.inc(1205);processors.add(new ResultSetProcessor<T>() {
                                    @Override
                                    public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1206);
                                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1207);try {
                                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1208);method.invoke(object, new Date(resultSet.getTimestamp(name).getTime()));
                                        } catch (IllegalAccessException error) {
                                        } catch (InvocationTargetException error) {
                                        }
                                    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
                                });
                            }
                        }}}}}}}
                    }}

                    }__CLR4_5_2q7q7lx1dh0j4.R.inc(1209);while ((((resultSet.next())&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1210)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1211)==0&false))) {{
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1212);T object = (T) prototype.create();
                        __CLR4_5_2q7q7lx1dh0j4.R.inc(1213);for (ResultSetProcessor<T> processor : processors) {{
                            __CLR4_5_2q7q7lx1dh0j4.R.inc(1214);processor.process(object, resultSet);
                        }
                        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1215);result.add(object);
                    }

                }} finally {
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1216);resultSet.close();
                }

            } finally {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1217);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1218);connection.close();
            }
        }

        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1219);return result;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}

    public long executeUpdate() throws SQLException {try{__CLR4_5_2q7q7lx1dh0j4.R.inc(1220);
        
        __CLR4_5_2q7q7lx1dh0j4.R.inc(1221);if ((((query != null)&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1222)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1223)==0&false))) {{
            __CLR4_5_2q7q7lx1dh0j4.R.inc(1224);try {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1225);statement.executeUpdate();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1226);ResultSet resultSet = statement.getGeneratedKeys();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1227);if ((((resultSet.next())&&(__CLR4_5_2q7q7lx1dh0j4.R.iget(1228)!=0|true))||(__CLR4_5_2q7q7lx1dh0j4.R.iget(1229)==0&false))) {{
                    __CLR4_5_2q7q7lx1dh0j4.R.inc(1230);return resultSet.getLong(1);
                }
            }} finally {
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1231);statement.close();
                __CLR4_5_2q7q7lx1dh0j4.R.inc(1232);connection.close();
            }
        }
        }__CLR4_5_2q7q7lx1dh0j4.R.inc(1233);return 0;
    }finally{__CLR4_5_2q7q7lx1dh0j4.R.flushNeeded();}}
    
}
