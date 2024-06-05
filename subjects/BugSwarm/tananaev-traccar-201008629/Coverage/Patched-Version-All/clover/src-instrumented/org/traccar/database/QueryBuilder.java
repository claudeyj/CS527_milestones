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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class QueryBuilder {public static class __CLR4_5_22lx2lxlx1e1i08{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,3716,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, List<Integer>> indexMap = new HashMap<>();
    private Connection connection;
    private PreparedStatement statement;
    private final String query;
    private final boolean returnGeneratedKeys;

    private QueryBuilder(DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3381);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3382);this.query = query;
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3383);this.returnGeneratedKeys = returnGeneratedKeys;
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3384);if ((((query != null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3385)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3386)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3387);connection = dataSource.getConnection();
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3388);String parsedQuery = parse(query.trim(), indexMap);
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3389);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3390);if ((((returnGeneratedKeys)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3391)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3392)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3393);statement = connection.prepareStatement(parsedQuery, Statement.RETURN_GENERATED_KEYS);
                } }else {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3394);statement = connection.prepareStatement(parsedQuery);
                }
            }} catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3395);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3396);throw error;
            }
        }
    }}finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    private static String parse(String query, Map<String, List<Integer>> paramMap) {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3397);

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3398);int length = query.length();
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3399);StringBuilder parsedQuery = new StringBuilder(length);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3400);boolean inSingleQuote = false;
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3401);boolean inDoubleQuote = false;
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3402);int index = 1;

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3403);for (int i = 0; (((i < length)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3404)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3405)==0&false)); i++) {{

            __CLR4_5_22lx2lxlx1e1i08.R.inc(3406);char c = query.charAt(i);

            // String end
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3407);if ((((inSingleQuote)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3408)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3409)==0&false))) {{
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3410);if ((((c == '\'')&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3411)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3412)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3413);inSingleQuote = false;
                }
            }} }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3414);if ((((inDoubleQuote)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3415)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3416)==0&false))) {{
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3417);if ((((c == '"')&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3418)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3419)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3420);inDoubleQuote = false;
                }
            }} }else {{

                // String begin
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3421);if ((((c == '\'')&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3422)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3423)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3424);inSingleQuote = true;
                } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3425);if ((((c == '"')&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3426)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3427)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3428);inDoubleQuote = true;
                } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3429);if ((((c == ':' && i + 1 < length
                        && Character.isJavaIdentifierStart(query.charAt(i + 1)))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3430)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3431)==0&false))) {{

                    // Identifier name
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3432);int j = i + 2;
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3433);while ((((j < length && Character.isJavaIdentifierPart(query.charAt(j)))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3434)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3435)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3436);j++;
                    }

                    }__CLR4_5_22lx2lxlx1e1i08.R.inc(3437);String name = query.substring(i + 1, j);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3438);c = '?';
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3439);i += name.length();
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3440);name = name.toLowerCase();

                    // Add to list
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3441);List<Integer> indexList = paramMap.get(name);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3442);if ((((indexList == null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3443)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3444)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3445);indexList = new LinkedList<>();
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3446);paramMap.put(name, indexList);
                    }
                    }__CLR4_5_22lx2lxlx1e1i08.R.inc(3447);indexList.add(index);

                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3448);index++;
                }
            }}}}

            }}__CLR4_5_22lx2lxlx1e1i08.R.inc(3449);parsedQuery.append(c);
        }

        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3450);return parsedQuery.toString();
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public static QueryBuilder create(DataSource dataSource, String query) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3451);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3452);return new QueryBuilder(dataSource, query, false);
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public static QueryBuilder create(
            DataSource dataSource, String query, boolean returnGeneratedKeys) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3453);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3454);return new QueryBuilder(dataSource, query, returnGeneratedKeys);
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    private List<Integer> indexes(String name) {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3455);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3456);name = name.toLowerCase();
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3457);List<Integer> result = indexMap.get(name);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3458);if ((((result == null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3459)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3460)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3461);result = new LinkedList<>();
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3462);return result;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setBoolean(String name, boolean value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3463);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3464);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3465);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3466);statement.setBoolean(i, value);
            } catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3467);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3468);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3469);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3470);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setInteger(String name, int value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3471);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3472);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3473);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3474);statement.setInt(i, value);
            } catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3475);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3476);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3477);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3478);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setLong(String name, long value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3479);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3480);return setLong(name, value, false);
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setLong(String name, long value, boolean nullIfZero) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3481);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3482);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3483);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3484);if ((((value == 0 && nullIfZero)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3485)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3486)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3487);statement.setNull(i, Types.INTEGER);
                } }else {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3488);statement.setLong(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3489);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3490);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3491);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3492);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setDouble(String name, double value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3493);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3494);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3495);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3496);statement.setDouble(i, value);
            } catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3497);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3498);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3499);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3500);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setString(String name, String value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3501);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3502);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3503);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3504);if ((((value == null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3505)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3506)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3507);statement.setNull(i, Types.VARCHAR);
                } }else {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3508);statement.setString(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3509);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3510);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3511);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3512);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setDate(String name, Date value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3513);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3514);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3515);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3516);if ((((value == null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3517)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3518)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3519);statement.setNull(i, Types.TIMESTAMP);
                } }else {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3520);statement.setTimestamp(i, new Timestamp(value.getTime()));
                }
            }} catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3521);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3522);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3523);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3524);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setBlob(String name, byte[] value) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3525);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3526);for (int i : indexes(name)) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3527);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3528);if ((((value == null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3529)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3530)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3531);statement.setNull(i, Types.BLOB);
                } }else {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3532);statement.setBytes(i, value);
                }
            }} catch (SQLException error) {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3533);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3534);connection.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3535);throw error;
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3536);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public QueryBuilder setObject(Object object) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3537);

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3538);Method[] methods = object.getClass().getMethods();

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3539);for (Method method : methods) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3540);if ((((method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3541)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3542)==0&false))) {{
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3543);String name = method.getName().substring(3);
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3544);try {
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3545);if ((((method.getReturnType().equals(boolean.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3546)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3547)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3548);setBoolean(name, (Boolean) method.invoke(object));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3549);if ((((method.getReturnType().equals(int.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3550)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3551)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3552);setInteger(name, (Integer) method.invoke(object));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3553);if ((((method.getReturnType().equals(long.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3554)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3555)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3556);setLong(name, (Long) method.invoke(object), name.endsWith("Id"));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3557);if ((((method.getReturnType().equals(double.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3558)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3559)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3560);setDouble(name, (Double) method.invoke(object));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3561);if ((((method.getReturnType().equals(String.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3562)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3563)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3564);setString(name, (String) method.invoke(object));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3565);if ((((method.getReturnType().equals(Date.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3566)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3567)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3568);setDate(name, (Date) method.invoke(object));
                    } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3569);if ((((method.getReturnType().equals(byte[].class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3570)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3571)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3572);setBlob(name, (byte[]) method.invoke(object));
                    } }else {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3573);if ((((method.getReturnType().equals(Map.class)
                                && Context.getConfig().getBoolean("database.xml"))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3574)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3575)==0&false))) {{
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3576);setString(name, MiscFormatter.toXmlString((Map) method.invoke(object)));
                        } }else {{
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3577);setString(name, Context.getObjectMapper().writeValueAsString(method.invoke(object)));
                        }
                    }}
                }}}}}}}} catch (IllegalAccessException | InvocationTargetException | JsonProcessingException error) {
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3578);Log.warning(error);
                }
            }
        }}

        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3579);return this;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    private interface ResultSetProcessor<T> {
        void process(T object, ResultSet resultSet) throws SQLException;
    }

    public <T> T executeQuerySingle(Class<T> clazz) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3580);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3581);Collection<T> result = executeQuery(clazz);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3582);if ((((!result.isEmpty())&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3583)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3584)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3585);return result.iterator().next();
        } }else {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3586);return null;
        }
    }}finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    private <T> void addProcessors(
            List<ResultSetProcessor<T>> processors,
            final Class<?> parameterType, final Method method, final String name) {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3587);

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3588);if ((((parameterType.equals(boolean.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3589)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3590)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3591);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3592);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3593);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3594);method.invoke(object, resultSet.getBoolean(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3595);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3596);if ((((parameterType.equals(int.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3597)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3598)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3599);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3600);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3601);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3602);method.invoke(object, resultSet.getInt(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3603);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3604);if ((((parameterType.equals(long.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3605)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3606)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3607);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3608);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3609);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3610);method.invoke(object, resultSet.getLong(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3611);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3612);if ((((parameterType.equals(double.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3613)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3614)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3615);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3616);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3617);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3618);method.invoke(object, resultSet.getDouble(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3619);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3620);if ((((parameterType.equals(String.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3621)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3622)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3623);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3624);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3625);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3626);method.invoke(object, resultSet.getString(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3627);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3628);if ((((parameterType.equals(Date.class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3629)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3630)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3631);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3632);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3633);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3634);Timestamp timestamp = resultSet.getTimestamp(name);
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3635);if ((((timestamp != null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3636)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3637)==0&false))) {{
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3638);method.invoke(object, new Date(timestamp.getTime()));
                        }
                    }} catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3639);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {__CLR4_5_22lx2lxlx1e1i08.R.inc(3640);if ((((parameterType.equals(byte[].class))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3641)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3642)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3643);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3644);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3645);try {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3646);method.invoke(object, resultSet.getBytes(name));
                    } catch (IllegalAccessException | InvocationTargetException error) {
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3647);Log.warning(error);
                    }
                }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        } }else {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3648);processors.add(new ResultSetProcessor<T>() {
                @Override
                public void process(T object, ResultSet resultSet) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3649);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3650);String value = resultSet.getString(name);
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3651);if ((((value != null && !value.isEmpty())&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3652)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3653)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3654);try {
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3655);method.invoke(object, Context.getObjectMapper().readValue(value, parameterType));
                        } catch (InvocationTargetException | IllegalAccessException | IOException error) {
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3656);Log.warning(error);
                        }
                    }
                }}finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}
            });
        }
    }}}}}}}}finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public <T> Collection<T> executeQuery(Class<T> clazz) throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3657);
        __CLR4_5_22lx2lxlx1e1i08.R.inc(3658);List<T> result = new LinkedList<>();

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3659);if ((((query != null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3660)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3661)==0&false))) {{

            __CLR4_5_22lx2lxlx1e1i08.R.inc(3662);try {

                class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_22lx2lxlx1e1i08.R.inc(3663);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_22lx2lxlx1e1i08.R.inc(3664);}};ResultSet resultSet = statement.executeQuery()) {

                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3665);ResultSetMetaData resultMetaData = resultSet.getMetaData();

                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3666);List<ResultSetProcessor<T>> processors = new LinkedList<>();

                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3667);Method[] methods = clazz.getMethods();

                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3668);for (final Method method : methods) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3669);if ((((method.getName().startsWith("set") && method.getParameterTypes().length == 1)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3670)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3671)==0&false))) {{

                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3672);final String name = method.getName().substring(3);

                            // Check if column exists
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3673);boolean column = false;
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3674);for (int i = 1; (((i <= resultMetaData.getColumnCount())&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3675)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3676)==0&false)); i++) {{
                                __CLR4_5_22lx2lxlx1e1i08.R.inc(3677);if ((((name.equalsIgnoreCase(resultMetaData.getColumnLabel(i)))&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3678)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3679)==0&false))) {{
                                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3680);column = true;
                                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3681);break;
                                }
                            }}
                            }__CLR4_5_22lx2lxlx1e1i08.R.inc(3682);if ((((!column)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3683)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3684)==0&false))) {{
                                __CLR4_5_22lx2lxlx1e1i08.R.inc(3685);continue;
                            }

                            }__CLR4_5_22lx2lxlx1e1i08.R.inc(3686);addProcessors(processors, method.getParameterTypes()[0], method, name);
                        }
                    }}

                    }__CLR4_5_22lx2lxlx1e1i08.R.inc(3687);while ((((resultSet.next())&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3688)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3689)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3690);try {
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3691);T object = clazz.newInstance();
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3692);for (ResultSetProcessor<T> processor : processors) {{
                                __CLR4_5_22lx2lxlx1e1i08.R.inc(3693);processor.process(object, resultSet);
                            }
                            }__CLR4_5_22lx2lxlx1e1i08.R.inc(3694);result.add(object);
                        } catch (InstantiationException | IllegalAccessException e) {
                            __CLR4_5_22lx2lxlx1e1i08.R.inc(3695);throw new IllegalArgumentException();
                        }
                    }
                }}

            } finally {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3696);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3697);connection.close();
            }
        }

        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3698);return result;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

    public long executeUpdate() throws SQLException {try{__CLR4_5_22lx2lxlx1e1i08.R.inc(3699);

        __CLR4_5_22lx2lxlx1e1i08.R.inc(3700);if ((((query != null)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3701)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3702)==0&false))) {{
            __CLR4_5_22lx2lxlx1e1i08.R.inc(3703);try {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3704);statement.execute();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3705);if ((((returnGeneratedKeys)&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3706)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3707)==0&false))) {{
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3708);ResultSet resultSet = statement.getGeneratedKeys();
                    __CLR4_5_22lx2lxlx1e1i08.R.inc(3709);if ((((resultSet.next())&&(__CLR4_5_22lx2lxlx1e1i08.R.iget(3710)!=0|true))||(__CLR4_5_22lx2lxlx1e1i08.R.iget(3711)==0&false))) {{
                        __CLR4_5_22lx2lxlx1e1i08.R.inc(3712);return resultSet.getLong(1);
                    }
                }}
            }} finally {
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3713);statement.close();
                __CLR4_5_22lx2lxlx1e1i08.R.inc(3714);connection.close();
            }
        }
        }__CLR4_5_22lx2lxlx1e1i08.R.inc(3715);return 0;
    }finally{__CLR4_5_22lx2lxlx1e1i08.R.flushNeeded();}}

}
