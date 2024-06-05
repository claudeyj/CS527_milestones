/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

import com.fasterxml.jackson.core.JsonProcessingException;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.MiscFormatter;
import org.traccar.model.Permission;

import javax.sql.DataSource;
import java.io.IOException;
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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class QueryBuilder {public static class __CLR4_5_22qv2qvlwydyffb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,3916,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, List<Integer>> indexMap = new HashMap<>();
    private Connection connection;
    private PreparedStatement statement;
    private final String query;
    private final boolean returnGeneratedKeys;

    private QueryBuilder(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3559);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3560);this.query = query;
        __CLR4_5_22qv2qvlwydyffb.R.inc(3561);this.returnGeneratedKeys = returnGeneratedKeys;
        __CLR4_5_22qv2qvlwydyffb.R.inc(3562);if ((((query != null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3563)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3564)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3565);connection = dataSource.getConnection();
            __CLR4_5_22qv2qvlwydyffb.R.inc(3566);String parsedQuery = parse(query.trim(), indexMap);
            __CLR4_5_22qv2qvlwydyffb.R.inc(3567);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3568);if ((((returnGeneratedKeys)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3569)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3570)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3571);statement = connection.prepareStatement(parsedQuery, Statement.RETURN_GENERATED_KEYS);
                } }else {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3572);statement = connection.prepareStatement(parsedQuery);
                }
            }} catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3573);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3574);throw error;
            }
        }
    }}finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    private static String parse(String query, Map<String, List<Integer>> paramMap) {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3575);

        __CLR4_5_22qv2qvlwydyffb.R.inc(3576);int length = query.length();
        __CLR4_5_22qv2qvlwydyffb.R.inc(3577);StringBuilder parsedQuery = new StringBuilder(length);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3578);boolean inSingleQuote = false;
        __CLR4_5_22qv2qvlwydyffb.R.inc(3579);boolean inDoubleQuote = false;
        __CLR4_5_22qv2qvlwydyffb.R.inc(3580);int index = 1;

        __CLR4_5_22qv2qvlwydyffb.R.inc(3581);for (int i = 0; (((i < length)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3582)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3583)==0&false)); i++) {{

            __CLR4_5_22qv2qvlwydyffb.R.inc(3584);char c = query.charAt(i);

            // String end
            __CLR4_5_22qv2qvlwydyffb.R.inc(3585);if ((((inSingleQuote)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3586)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3587)==0&false))) {{
                __CLR4_5_22qv2qvlwydyffb.R.inc(3588);if ((((c == '\'')&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3589)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3590)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3591);inSingleQuote = false;
                }
            }} }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3592);if ((((inDoubleQuote)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3593)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3594)==0&false))) {{
                __CLR4_5_22qv2qvlwydyffb.R.inc(3595);if ((((c == '"')&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3596)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3597)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3598);inDoubleQuote = false;
                }
            }} }else {{

                // String begin
                __CLR4_5_22qv2qvlwydyffb.R.inc(3599);if ((((c == '\'')&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3600)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3601)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3602);inSingleQuote = true;
                } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3603);if ((((c == '"')&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3604)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3605)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3606);inDoubleQuote = true;
                } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3607);if ((((c == ':' && i + 1 < length
                        && Character.isJavaIdentifierStart(query.charAt(i + 1)))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3608)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3609)==0&false))) {{

                    // Identifier name
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3610);int j = i + 2;
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3611);while ((((j < length && Character.isJavaIdentifierPart(query.charAt(j)))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3612)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3613)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3614);j++;
                    }

                    }__CLR4_5_22qv2qvlwydyffb.R.inc(3615);String name = query.substring(i + 1, j);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3616);c = '?';
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3617);i += name.length();
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3618);name = name.toLowerCase();

                    // Add to list
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3619);List<Integer> indexList = paramMap.get(name);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3620);if ((((indexList == null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3621)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3622)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3623);indexList = new LinkedList<>();
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3624);paramMap.put(name, indexList);
                    }
                    }__CLR4_5_22qv2qvlwydyffb.R.inc(3625);indexList.add(index);

                    __CLR4_5_22qv2qvlwydyffb.R.inc(3626);index++;
                }
            }}}}

            }}__CLR4_5_22qv2qvlwydyffb.R.inc(3627);parsedQuery.append(c);
        }

        }__CLR4_5_22qv2qvlwydyffb.R.inc(3628);return parsedQuery.toString();
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3629);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3630);return new QueryBuilder(dataSource, query, false);
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public static QueryBuilder create(
            DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3631);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3632);return new QueryBuilder(dataSource, query, returnGeneratedKeys);
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    private List<Integer> indexes(String name) {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3633);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3634);name = name.toLowerCase();
        __CLR4_5_22qv2qvlwydyffb.R.inc(3635);List<Integer> result = indexMap.get(name);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3636);if ((((result == null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3637)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3638)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3639);result = new LinkedList<>();
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3640);return result;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setBoolean(String name, boolean value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3641);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3642);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3643);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3644);statement.setBoolean(i, value);
            } catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3645);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3646);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3647);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3648);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setInteger(String name, int value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3649);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3650);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3651);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3652);statement.setInt(i, value);
            } catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3653);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3654);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3655);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3656);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setLong(String name, long value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3657);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3658);return setLong(name, value, false);
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setLong(String name, long value, boolean nullIfZero) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3659);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3660);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3661);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3662);if ((((value == 0 && nullIfZero)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3663)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3664)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3665);statement.setNull(i, Types.INTEGER);
                } }else {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3666);statement.setLong(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3667);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3668);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3669);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3670);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setDouble(String name, double value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3671);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3672);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3673);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3674);statement.setDouble(i, value);
            } catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3675);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3676);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3677);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3678);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setString(String name, String value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3679);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3680);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3681);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3682);if ((((value == null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3683)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3684)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3685);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3686);statement.setString(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3687);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3688);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3689);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3690);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setDate(String name, Date value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3691);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3692);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3693);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3694);if ((((value == null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3695)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3696)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3697);statement.setNull(i, Types.TIMESTAMP);
                } }else {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3698);statement.setTimestamp(i, new Timestamp(value.getTime()));
                }
            }} catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3699);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3700);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3701);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3702);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setBlob(String name, byte[] value) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3703);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3704);for (int i : indexes(name)) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3705);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3706);if ((((value == null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3707)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3708)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3709);statement.setNull(i, Types.BLOB);
                } }else {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3710);statement.setBytes(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3711);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3712);connection.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3713);throw error;
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3714);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public QueryBuilder setObject(Object object) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3715);

        __CLR4_5_22qv2qvlwydyffb.R.inc(3716);Method[] methods = object.getClass().getMethods();

        __CLR4_5_22qv2qvlwydyffb.R.inc(3717);for (Method method : methods) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3718);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0
                    && !method.isAnnotationPresent(QueryIgnore.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3719)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3720)==0&false))) {{
                __CLR4_5_22qv2qvlwydyffb.R.inc(3721);String name = method.getName().substring(3);
                __CLR4_5_22qv2qvlwydyffb.R.inc(3722);try {
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3723);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3724)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3725)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3726);setBoolean(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3727);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3728)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3729)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3730);setInteger(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3731);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3732)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3733)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3734);setLong(name, (Long) method.invoke(object), name.endsWith("Id"));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3735);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3736)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3737)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3738);setDouble(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3739);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3740)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3741)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3742);setString(name, (String) method.invoke(object));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3743);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3744)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3745)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3746);setDate(name, (Date) method.invoke(object));
                    } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3747);if ((((method.getReturnType().equals(byte[].class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3748)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3749)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3750);setBlob(name, (byte[]) method.invoke(object));
                    } }else {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3751);if ((((method.getReturnType().equals(Map.class)
                                && Context.getConfig().getBoolean("database.xml"))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3752)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3753)==0&false))) {{
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3754);setString(name, MiscFormatter.toXmlString((Map) method.invoke(object)));
                        } }else {{
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3755);setString(name, Context.getObjectMapper().writeValueAsString(method.invoke(object)));
                        }
                    }}
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException | JsonProcessingException error) {
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3756);Log.warning(error);
                }
            }
        }}

        }__CLR4_5_22qv2qvlwydyffb.R.inc(3757);return this;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    private interface ResultSetProcessor<T> {
        void process(T object, ResultSet resultSet) throws SQLException;
    }

    public <T> T executeQuerySingle(Class<T> clazz) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3758);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3759);Collection<T> result = executeQuery(clazz);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3760);if ((((!result.isEmpty())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3761)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3762)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3763);return result.iterator().next();
        } }else {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3764);return null;
        }
    }}finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    private <T> void addProcessors(
            List<ResultSetProcessor<T>> processors,
            final Class<?> parameterType, final Method method, final String name) {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3765);

        __CLR4_5_22qv2qvlwydyffb.R.inc(3766);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3767)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3768)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3769);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3770);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3771);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3772);method.invoke(object, resultSet.getBoolean(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3773);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3774);if ((((parameterType.equals(int.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3775)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3776)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3777);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3778);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3779);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3780);method.invoke(object, resultSet.getInt(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3781);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3782);if ((((parameterType.equals(long.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3783)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3784)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3785);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3786);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3787);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3788);method.invoke(object, resultSet.getLong(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3789);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3790);if ((((parameterType.equals(double.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3791)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3792)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3793);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3794);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3795);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3796);method.invoke(object, resultSet.getDouble(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3797);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3798);if ((((parameterType.equals(String.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3799)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3800)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3801);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3802);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3803);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3804);method.invoke(object, resultSet.getString(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3805);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3806);if ((((parameterType.equals(Date.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3807)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3808)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3809);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3810);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3811);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3812);Timestamp timestamp = resultSet.getTimestamp(name);
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3813);if ((((timestamp != null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3814)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3815)==0&false))) {{
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3816);method.invoke(object, new Date(timestamp.getTime()));
                        }
                    }} catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3817);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22qv2qvlwydyffb.R.inc(3818);if ((((parameterType.equals(byte[].class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3819)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3820)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3821);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3822);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3823);try {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3824);method.invoke(object, resultSet.getBytes(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3825);Log.warning(error);
                    }
                }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        } }else {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3826);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3827);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3828);String value = resultSet.getString(name);
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3829);if ((((value != null && !value.isEmpty())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3830)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3831)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3832);try {
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3833);method.invoke(object, Context.getObjectMapper().readValue(value, parameterType));
                        } catch (InvocationTargetException | IllegalAccessException | IOException error) {
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3834);Log.warning(error);
                        }
                    }
                }}finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}
            });
        }
    }}}}}}}}finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public <T> Collection<T> executeQuery(Class<T> clazz) throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3835);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3836);List<T> result = new LinkedList<>();

        __CLR4_5_22qv2qvlwydyffb.R.inc(3837);if ((((query != null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3838)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3839)==0&false))) {{

            __CLR4_5_22qv2qvlwydyffb.R.inc(3840);try {

                class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_22qv2qvlwydyffb.R.inc(3841);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_22qv2qvlwydyffb.R.inc(3842);}};ResultSet resultSet = statement.executeQuery()) {

                    __CLR4_5_22qv2qvlwydyffb.R.inc(3843);ResultSetMetaData resultMetaData = resultSet.getMetaData();

                    __CLR4_5_22qv2qvlwydyffb.R.inc(3844);List<ResultSetProcessor<T>> processors = new LinkedList<>();

                    __CLR4_5_22qv2qvlwydyffb.R.inc(3845);Method[] methods = clazz.getMethods();

                    __CLR4_5_22qv2qvlwydyffb.R.inc(3846);for (final Method method : methods) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3847);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1
                                && !method.isAnnotationPresent(QueryIgnore.class))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3848)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3849)==0&false))) {{

                            __CLR4_5_22qv2qvlwydyffb.R.inc(3850);final String name = method.getName().substring(3);

                            // Check if column exists
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3851);boolean column = false;
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3852);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3853)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3854)==0&false)); i++) {{
                                __CLR4_5_22qv2qvlwydyffb.R.inc(3855);if ((((name.equalsIgnoreCase(resultMetaData.getColumnLabel(i)))&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3856)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3857)==0&false))) {{
                                    __CLR4_5_22qv2qvlwydyffb.R.inc(3858);column = true;
                                    __CLR4_5_22qv2qvlwydyffb.R.inc(3859);break;
                                }
                            }}
                            }__CLR4_5_22qv2qvlwydyffb.R.inc(3860);if ((((!column)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3861)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3862)==0&false))) {{
                                __CLR4_5_22qv2qvlwydyffb.R.inc(3863);continue;
                            }

                            }__CLR4_5_22qv2qvlwydyffb.R.inc(3864);addProcessors(processors, method.getParameterTypes()[0], method, name);
                        }
                    }}

                    }__CLR4_5_22qv2qvlwydyffb.R.inc(3865);while ((((resultSet.next())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3866)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3867)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3868);try {
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3869);T object = clazz.newInstance();
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3870);for (ResultSetProcessor<T> processor : processors) {{
                                __CLR4_5_22qv2qvlwydyffb.R.inc(3871);processor.process(object, resultSet);
                            }
                            }__CLR4_5_22qv2qvlwydyffb.R.inc(3872);result.add(object);
                        } catch (InstantiationException | IllegalAccessException e) {
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3873);throw new IllegalArgumentException();
                        }
                    }
                }}

            } finally {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3874);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3875);connection.close();
            }
        }

        }__CLR4_5_22qv2qvlwydyffb.R.inc(3876);return result;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public long executeUpdate() throws SQLException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3877);

        __CLR4_5_22qv2qvlwydyffb.R.inc(3878);if ((((query != null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3879)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3880)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3881);try {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3882);statement.execute();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3883);if ((((returnGeneratedKeys)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3884)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3885)==0&false))) {{
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3886);ResultSet resultSet = statement.getGeneratedKeys();
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3887);if ((((resultSet.next())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3888)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3889)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3890);return resultSet.getLong(1);
                    }
                }}
            }} finally {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3891);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3892);connection.close();
            }
        }
        }__CLR4_5_22qv2qvlwydyffb.R.inc(3893);return 0;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

    public Collection<Permission> executePermissionsQuery() throws SQLException, ClassNotFoundException {try{__CLR4_5_22qv2qvlwydyffb.R.inc(3894);
        __CLR4_5_22qv2qvlwydyffb.R.inc(3895);List<Permission> result = new LinkedList<>();
        __CLR4_5_22qv2qvlwydyffb.R.inc(3896);if ((((query != null)&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3897)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3898)==0&false))) {{
            __CLR4_5_22qv2qvlwydyffb.R.inc(3899);try {
                class __CLR4_5_2$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_22qv2qvlwydyffb.R.inc(3900);try (__CLR4_5_2$AC1 __CLR$ACI1=new __CLR4_5_2$AC1(){{__CLR4_5_22qv2qvlwydyffb.R.inc(3901);}};ResultSet resultSet = statement.executeQuery()) {
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3902);ResultSetMetaData resultMetaData = resultSet.getMetaData();
                    __CLR4_5_22qv2qvlwydyffb.R.inc(3903);while ((((resultSet.next())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3904)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3905)==0&false))) {{
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3906);LinkedHashMap<String, Long> map = new LinkedHashMap<>();
                        __CLR4_5_22qv2qvlwydyffb.R.inc(3907);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_22qv2qvlwydyffb.R.iget(3908)!=0|true))||(__CLR4_5_22qv2qvlwydyffb.R.iget(3909)==0&false)); i++) {{
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3910);String label = resultMetaData.getColumnLabel(i);
                            __CLR4_5_22qv2qvlwydyffb.R.inc(3911);map.put(label, resultSet.getLong(label));
                        }
                        }__CLR4_5_22qv2qvlwydyffb.R.inc(3912);result.add(new Permission(map));
                    }
                }}
            } finally {
                __CLR4_5_22qv2qvlwydyffb.R.inc(3913);statement.close();
                __CLR4_5_22qv2qvlwydyffb.R.inc(3914);connection.close();
            }
        }

        }__CLR4_5_22qv2qvlwydyffb.R.inc(3915);return result;
    }finally{__CLR4_5_22qv2qvlwydyffb.R.flushNeeded();}}

}
