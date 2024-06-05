/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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

import java.beans.Introspector;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import liquibase.Contexts;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.exception.LiquibaseException;
import liquibase.resource.FileSystemResourceAccessor;
import liquibase.resource.ResourceAccessor;

import org.traccar.Config;
import org.traccar.helper.Log;
import org.traccar.model.Attribute;
import org.traccar.model.AttributeAlias;
import org.traccar.model.Device;
import org.traccar.model.Driver;
import org.traccar.model.Event;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.model.ManagedUser;
import org.traccar.model.Permission;
import org.traccar.model.BaseModel;
import org.traccar.model.Calendar;
import org.traccar.model.Position;
import org.traccar.model.Server;
import org.traccar.model.Statistics;
import org.traccar.model.User;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@java.lang.SuppressWarnings({"fallthrough"}) public class DataManager {public static class __CLR4_5_21re1relwydyewx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,2541,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String ACTION_SELECT_ALL = "selectAll";
    public static final String ACTION_SELECT = "select";
    public static final String ACTION_INSERT = "insert";
    public static final String ACTION_UPDATE = "update";
    public static final String ACTION_DELETE = "delete";

    private final Config config;

    private DataSource dataSource;

    private boolean generateQueries;

    public DataManager(Config config) throws Exception {try{__CLR4_5_21re1relwydyewx.R.inc(2282);
        __CLR4_5_21re1relwydyewx.R.inc(2283);this.config = config;

        __CLR4_5_21re1relwydyewx.R.inc(2284);initDatabase();
        __CLR4_5_21re1relwydyewx.R.inc(2285);initDatabaseSchema();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public DataSource getDataSource() {try{__CLR4_5_21re1relwydyewx.R.inc(2286);
        __CLR4_5_21re1relwydyewx.R.inc(2287);return dataSource;
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private void initDatabase() throws Exception {try{__CLR4_5_21re1relwydyewx.R.inc(2288);

        __CLR4_5_21re1relwydyewx.R.inc(2289);String jndiName = config.getString("database.jndi");

        __CLR4_5_21re1relwydyewx.R.inc(2290);if ((((jndiName != null)&&(__CLR4_5_21re1relwydyewx.R.iget(2291)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2292)==0&false))) {{

            __CLR4_5_21re1relwydyewx.R.inc(2293);dataSource = (DataSource) new InitialContext().lookup(jndiName);

        } }else {{

            __CLR4_5_21re1relwydyewx.R.inc(2294);String driverFile = config.getString("database.driverFile");
            __CLR4_5_21re1relwydyewx.R.inc(2295);if ((((driverFile != null)&&(__CLR4_5_21re1relwydyewx.R.iget(2296)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2297)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2298);URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
                __CLR4_5_21re1relwydyewx.R.inc(2299);Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                __CLR4_5_21re1relwydyewx.R.inc(2300);method.setAccessible(true);
                __CLR4_5_21re1relwydyewx.R.inc(2301);method.invoke(classLoader, new File(driverFile).toURI().toURL());
            }

            }__CLR4_5_21re1relwydyewx.R.inc(2302);String driver = config.getString("database.driver");
            __CLR4_5_21re1relwydyewx.R.inc(2303);if ((((driver != null)&&(__CLR4_5_21re1relwydyewx.R.iget(2304)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2305)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2306);Class.forName(driver);
            }

            }__CLR4_5_21re1relwydyewx.R.inc(2307);HikariConfig hikariConfig = new HikariConfig();
            __CLR4_5_21re1relwydyewx.R.inc(2308);hikariConfig.setDriverClassName(config.getString("database.driver"));
            __CLR4_5_21re1relwydyewx.R.inc(2309);hikariConfig.setJdbcUrl(config.getString("database.url"));
            __CLR4_5_21re1relwydyewx.R.inc(2310);hikariConfig.setUsername(config.getString("database.user"));
            __CLR4_5_21re1relwydyewx.R.inc(2311);hikariConfig.setPassword(config.getString("database.password"));
            __CLR4_5_21re1relwydyewx.R.inc(2312);hikariConfig.setConnectionInitSql(config.getString("database.checkConnection", "SELECT 1"));
            __CLR4_5_21re1relwydyewx.R.inc(2313);hikariConfig.setIdleTimeout(600000);

            __CLR4_5_21re1relwydyewx.R.inc(2314);int maxPoolSize = config.getInteger("database.maxPoolSize");

            __CLR4_5_21re1relwydyewx.R.inc(2315);if ((((maxPoolSize != 0)&&(__CLR4_5_21re1relwydyewx.R.iget(2316)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2317)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2318);hikariConfig.setMaximumPoolSize(maxPoolSize);
            }

            }__CLR4_5_21re1relwydyewx.R.inc(2319);generateQueries = config.getBoolean("database.generateQueries");

            __CLR4_5_21re1relwydyewx.R.inc(2320);dataSource = new HikariDataSource(hikariConfig);

        }
    }}finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public static String constructObjectQuery(String action, Class<?> clazz, boolean extended) {try{__CLR4_5_21re1relwydyewx.R.inc(2321);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_21re1relwydyewx.R.inc(2322);switch (action) {
            case ACTION_INSERT:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2323);__CLB4_5_2_bool0=true;}
            case ACTION_UPDATE:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2324);__CLB4_5_2_bool0=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2325);StringBuilder result = new StringBuilder();
                __CLR4_5_21re1relwydyewx.R.inc(2326);StringBuilder fields = new StringBuilder();
                __CLR4_5_21re1relwydyewx.R.inc(2327);StringBuilder values = new StringBuilder();

                __CLR4_5_21re1relwydyewx.R.inc(2328);Set<Method> methods = new HashSet<>(Arrays.asList(clazz.getMethods()));
                __CLR4_5_21re1relwydyewx.R.inc(2329);methods.removeAll(Arrays.asList(Object.class.getMethods()));
                __CLR4_5_21re1relwydyewx.R.inc(2330);methods.removeAll(Arrays.asList(BaseModel.class.getMethods()));
                __CLR4_5_21re1relwydyewx.R.inc(2331);for (Method method : methods) {{
                    __CLR4_5_21re1relwydyewx.R.inc(2332);boolean skip;
                    __CLR4_5_21re1relwydyewx.R.inc(2333);if ((((extended)&&(__CLR4_5_21re1relwydyewx.R.iget(2334)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2335)==0&false))) {{
                        __CLR4_5_21re1relwydyewx.R.inc(2336);skip = !method.isAnnotationPresent(QueryExtended.class);
                    } }else {{
                        __CLR4_5_21re1relwydyewx.R.inc(2337);skip = method.isAnnotationPresent(QueryIgnore.class)
                                || method.isAnnotationPresent(QueryExtended.class) && !action.equals(ACTION_INSERT);
                    }
                    }__CLR4_5_21re1relwydyewx.R.inc(2338);if ((((!skip && method.getName().startsWith("get") && method.getParameterTypes().length == 0)&&(__CLR4_5_21re1relwydyewx.R.iget(2339)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2340)==0&false))) {{
                        __CLR4_5_21re1relwydyewx.R.inc(2341);String name = Introspector.decapitalize(method.getName().substring(3));
                        __CLR4_5_21re1relwydyewx.R.inc(2342);if ((((action.equals(ACTION_INSERT))&&(__CLR4_5_21re1relwydyewx.R.iget(2343)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2344)==0&false))) {{
                            __CLR4_5_21re1relwydyewx.R.inc(2345);fields.append(name).append(", ");
                            __CLR4_5_21re1relwydyewx.R.inc(2346);values.append(":").append(name).append(", ");
                        } }else {{
                            __CLR4_5_21re1relwydyewx.R.inc(2347);fields.append(name).append(" = :").append(name).append(", ");
                        }
                    }}
                }}
                }__CLR4_5_21re1relwydyewx.R.inc(2348);fields.setLength(fields.length() - 2);
                __CLR4_5_21re1relwydyewx.R.inc(2349);if ((((action.equals(ACTION_INSERT))&&(__CLR4_5_21re1relwydyewx.R.iget(2350)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2351)==0&false))) {{
                    __CLR4_5_21re1relwydyewx.R.inc(2352);values.setLength(values.length() - 2);
                    __CLR4_5_21re1relwydyewx.R.inc(2353);result.append("INSERT INTO ").append(getObjectsTableName(clazz)).append(" (");
                    __CLR4_5_21re1relwydyewx.R.inc(2354);result.append(fields).append(") ");
                    __CLR4_5_21re1relwydyewx.R.inc(2355);result.append("VALUES (").append(values).append(")");
                } }else {{
                    __CLR4_5_21re1relwydyewx.R.inc(2356);result.append("UPDATE ").append(getObjectsTableName(clazz)).append(" SET ");
                    __CLR4_5_21re1relwydyewx.R.inc(2357);result.append(fields);
                    __CLR4_5_21re1relwydyewx.R.inc(2358);result.append(" WHERE id = :id");
                }
                }__CLR4_5_21re1relwydyewx.R.inc(2359);return result.toString();
            case ACTION_SELECT_ALL:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2360);__CLB4_5_2_bool0=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2361);return "SELECT * FROM " + getObjectsTableName(clazz);
            case ACTION_SELECT:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2362);__CLB4_5_2_bool0=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2363);return "SELECT * FROM " + getObjectsTableName(clazz) + " WHERE id = :id";
            case ACTION_DELETE:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2364);__CLB4_5_2_bool0=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2365);return "DELETE FROM " + getObjectsTableName(clazz) + " WHERE id = :id";
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_21re1relwydyewx.R.inc(2366);__CLB4_5_2_bool0=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2367);throw new IllegalArgumentException("Unknown action");
        }
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public static String constructPermissionQuery(String action, Class<?> owner, Class<?> property) {try{__CLR4_5_21re1relwydyewx.R.inc(2368);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_21re1relwydyewx.R.inc(2369);switch (action) {
        case ACTION_SELECT_ALL:if (!__CLB4_5_2_bool1) {__CLR4_5_21re1relwydyewx.R.inc(2370);__CLB4_5_2_bool1=true;}
            __CLR4_5_21re1relwydyewx.R.inc(2371);return "SELECT " + makeNameId(owner) + ", " + makeNameId(property) + " FROM "
                    + getPermissionsTableName(owner, property);
        case ACTION_INSERT:if (!__CLB4_5_2_bool1) {__CLR4_5_21re1relwydyewx.R.inc(2372);__CLB4_5_2_bool1=true;}
            __CLR4_5_21re1relwydyewx.R.inc(2373);return "INSERT INTO " + getPermissionsTableName(owner, property)
                    + " (" + makeNameId(owner) + ", " + makeNameId(property) + ") VALUES (:"
                    + makeNameId(owner) + ", :" + makeNameId(property) + ")";
        case ACTION_DELETE:if (!__CLB4_5_2_bool1) {__CLR4_5_21re1relwydyewx.R.inc(2374);__CLB4_5_2_bool1=true;}
            __CLR4_5_21re1relwydyewx.R.inc(2375);return "DELETE FROM " + getPermissionsTableName(owner, property)
                    + " WHERE " + makeNameId(owner) + " = :" + makeNameId(owner)
                    + " AND " + makeNameId(property) + " = :" + makeNameId(property);
        default:if (!__CLB4_5_2_bool1) {__CLR4_5_21re1relwydyewx.R.inc(2376);__CLB4_5_2_bool1=true;}
            __CLR4_5_21re1relwydyewx.R.inc(2377);throw new IllegalArgumentException("Unknown action");
        }
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private String getQuery(String key) {try{__CLR4_5_21re1relwydyewx.R.inc(2378);
        __CLR4_5_21re1relwydyewx.R.inc(2379);String query = config.getString(key);
        __CLR4_5_21re1relwydyewx.R.inc(2380);if ((((query == null)&&(__CLR4_5_21re1relwydyewx.R.iget(2381)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2382)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2383);Log.info("Query not provided: " + key);
        }
        }__CLR4_5_21re1relwydyewx.R.inc(2384);return query;
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public String getQuery(String action, Class<?> clazz) {try{__CLR4_5_21re1relwydyewx.R.inc(2385);
        __CLR4_5_21re1relwydyewx.R.inc(2386);return getQuery(action, clazz, false);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public String getQuery(String action, Class<?> clazz, boolean extended) {try{__CLR4_5_21re1relwydyewx.R.inc(2387);
        __CLR4_5_21re1relwydyewx.R.inc(2388);String queryName;
        __CLR4_5_21re1relwydyewx.R.inc(2389);if ((((action.equals(ACTION_SELECT_ALL))&&(__CLR4_5_21re1relwydyewx.R.iget(2390)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2391)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2392);queryName = "database.select" + clazz.getSimpleName() + "s";
        } }else {{
            __CLR4_5_21re1relwydyewx.R.inc(2393);queryName = "database." + action.toLowerCase() + clazz.getSimpleName();
            __CLR4_5_21re1relwydyewx.R.inc(2394);if ((((extended)&&(__CLR4_5_21re1relwydyewx.R.iget(2395)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2396)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2397);queryName += "Extended";
            }
        }}
        }__CLR4_5_21re1relwydyewx.R.inc(2398);String query = config.getString(queryName);
        __CLR4_5_21re1relwydyewx.R.inc(2399);if ((((query == null)&&(__CLR4_5_21re1relwydyewx.R.iget(2400)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2401)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2402);if ((((generateQueries)&&(__CLR4_5_21re1relwydyewx.R.iget(2403)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2404)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2405);query = constructObjectQuery(action, clazz, extended);
                __CLR4_5_21re1relwydyewx.R.inc(2406);config.setString(queryName, query);
            } }else {{
                __CLR4_5_21re1relwydyewx.R.inc(2407);Log.info("Query not provided: " + queryName);
            }
        }}

        }__CLR4_5_21re1relwydyewx.R.inc(2408);return query;
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public String getQuery(String action, Class<?> owner, Class<?> property) {try{__CLR4_5_21re1relwydyewx.R.inc(2409);
        __CLR4_5_21re1relwydyewx.R.inc(2410);String queryName;
        __CLR4_5_21re1relwydyewx.R.inc(2411);if ((((action.equals(ACTION_SELECT_ALL))&&(__CLR4_5_21re1relwydyewx.R.iget(2412)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2413)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2414);queryName = "database.select" + owner.getSimpleName() + property.getSimpleName() + "s";
        } }else {__CLR4_5_21re1relwydyewx.R.inc(2415);if ((((action.equals(ACTION_INSERT))&&(__CLR4_5_21re1relwydyewx.R.iget(2416)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2417)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2418);queryName = "database.link" + owner.getSimpleName() + property.getSimpleName();
        } }else {{
            __CLR4_5_21re1relwydyewx.R.inc(2419);queryName = "database.unlink" + owner.getSimpleName() + property.getSimpleName();
        }
        }}__CLR4_5_21re1relwydyewx.R.inc(2420);String query = config.getString(queryName);
        __CLR4_5_21re1relwydyewx.R.inc(2421);if ((((query == null)&&(__CLR4_5_21re1relwydyewx.R.iget(2422)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2423)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2424);if ((((generateQueries)&&(__CLR4_5_21re1relwydyewx.R.iget(2425)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2426)==0&false))) {{
                __CLR4_5_21re1relwydyewx.R.inc(2427);query = constructPermissionQuery(action, owner,
                        (((property.equals(User.class) )&&(__CLR4_5_21re1relwydyewx.R.iget(2428)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2429)==0&false))? ManagedUser.class : property);
                __CLR4_5_21re1relwydyewx.R.inc(2430);config.setString(queryName, query);
            } }else {{
                __CLR4_5_21re1relwydyewx.R.inc(2431);Log.info("Query not provided: " + queryName);
            }
        }}

        }__CLR4_5_21re1relwydyewx.R.inc(2432);return query;
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private static String getPermissionsTableName(Class<?> owner, Class<?> property) {try{__CLR4_5_21re1relwydyewx.R.inc(2433);
        __CLR4_5_21re1relwydyewx.R.inc(2434);String propertyName = property.getSimpleName();
        __CLR4_5_21re1relwydyewx.R.inc(2435);if ((((propertyName.equals("ManagedUser"))&&(__CLR4_5_21re1relwydyewx.R.iget(2436)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2437)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2438);propertyName = "User";
        }
        }__CLR4_5_21re1relwydyewx.R.inc(2439);return Introspector.decapitalize(owner.getSimpleName()) + "_" + Introspector.decapitalize(propertyName);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private static String getObjectsTableName(Class<?> clazz) {try{__CLR4_5_21re1relwydyewx.R.inc(2440);
        __CLR4_5_21re1relwydyewx.R.inc(2441);String result = Introspector.decapitalize(clazz.getSimpleName());
        // Add "s" ending if object name is not plural already
        __CLR4_5_21re1relwydyewx.R.inc(2442);if ((((!result.endsWith("s"))&&(__CLR4_5_21re1relwydyewx.R.iget(2443)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2444)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2445);result += "s";
        }
        }__CLR4_5_21re1relwydyewx.R.inc(2446);return result;
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private void initDatabaseSchema() throws SQLException, LiquibaseException {try{__CLR4_5_21re1relwydyewx.R.inc(2447);

        __CLR4_5_21re1relwydyewx.R.inc(2448);if ((((config.hasKey("database.changelog"))&&(__CLR4_5_21re1relwydyewx.R.iget(2449)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2450)==0&false))) {{

            __CLR4_5_21re1relwydyewx.R.inc(2451);ResourceAccessor resourceAccessor = new FileSystemResourceAccessor();

            __CLR4_5_21re1relwydyewx.R.inc(2452);Database database = DatabaseFactory.getInstance().openDatabase(
                    config.getString("database.url"),
                    config.getString("database.user"),
                    config.getString("database.password"),
                    null, resourceAccessor);

            __CLR4_5_21re1relwydyewx.R.inc(2453);Liquibase liquibase = new Liquibase(
                    config.getString("database.changelog"), resourceAccessor, database);

            __CLR4_5_21re1relwydyewx.R.inc(2454);liquibase.clearCheckSums();

            __CLR4_5_21re1relwydyewx.R.inc(2455);liquibase.update(new Contexts());
        }
    }}finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2456);
        __CLR4_5_21re1relwydyewx.R.inc(2457);User user = QueryBuilder.create(dataSource, getQuery("database.loginUser"))
                .setString("email", email)
                .executeQuerySingle(User.class);
        __CLR4_5_21re1relwydyewx.R.inc(2458);if ((((user != null && user.isPasswordValid(password))&&(__CLR4_5_21re1relwydyewx.R.iget(2459)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2460)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2461);return user;
        } }else {{
            __CLR4_5_21re1relwydyewx.R.inc(2462);return null;
        }
    }}finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void updateDeviceStatus(Device device) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2463);
        __CLR4_5_21re1relwydyewx.R.inc(2464);QueryBuilder.create(dataSource, getQuery(ACTION_UPDATE, Device.class, true))
                .setObject(device)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<Position> getPositions(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2465);
        __CLR4_5_21re1relwydyewx.R.inc(2466);return QueryBuilder.create(dataSource, getQuery("database.selectPositions"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Position.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void addPosition(Position position) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2467);
        __CLR4_5_21re1relwydyewx.R.inc(2468);position.setId(QueryBuilder.create(dataSource, getQuery(ACTION_INSERT, Position.class), true)
                .setObject(position)
                .setDate("serverTime", new Date())
                .executeUpdate());
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2469);
        __CLR4_5_21re1relwydyewx.R.inc(2470);QueryBuilder.create(dataSource, getQuery("database.updateLatestPosition"))
                .setDate("now", new Date())
                .setObject(position)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<Position> getLatestPositions() throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2471);
        __CLR4_5_21re1relwydyewx.R.inc(2472);return QueryBuilder.create(dataSource, getQuery("database.selectLatestPositions"))
                .executeQuery(Position.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void clearHistory() throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2473);
        __CLR4_5_21re1relwydyewx.R.inc(2474);long historyDays = config.getInteger("database.historyDays");
        __CLR4_5_21re1relwydyewx.R.inc(2475);if ((((historyDays != 0)&&(__CLR4_5_21re1relwydyewx.R.iget(2476)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2477)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2478);Date timeLimit = new Date(System.currentTimeMillis() - historyDays * 24 * 3600 * 1000);
            __CLR4_5_21re1relwydyewx.R.inc(2479);Log.debug("Clearing history earlier than " + new SimpleDateFormat(Log.DATE_FORMAT).format(timeLimit));
            __CLR4_5_21re1relwydyewx.R.inc(2480);QueryBuilder.create(dataSource, getQuery("database.deletePositions"))
                    .setDate("serverTime", timeLimit)
                    .executeUpdate();
            __CLR4_5_21re1relwydyewx.R.inc(2481);QueryBuilder.create(dataSource, getQuery("database.deleteEvents"))
                    .setDate("serverTime", timeLimit)
                    .executeUpdate();
        }
    }}finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Server getServer() throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2482);
        __CLR4_5_21re1relwydyewx.R.inc(2483);return QueryBuilder.create(dataSource, getQuery(ACTION_SELECT_ALL, Server.class))
                .executeQuerySingle(Server.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<Event> getEvents(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2484);
        __CLR4_5_21re1relwydyewx.R.inc(2485);return QueryBuilder.create(dataSource, getQuery("database.selectEvents"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Event.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<AttributeAlias> getAttributeAliases() throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2486);
        __CLR4_5_21re1relwydyewx.R.inc(2487);return QueryBuilder.create(dataSource, getQuery("database.selectAttributeAliases"))
                .executeQuery(AttributeAlias.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void addAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2488);
        __CLR4_5_21re1relwydyewx.R.inc(2489);attributeAlias.setId(QueryBuilder.create(dataSource, getQuery("database.insertAttributeAlias"), true)
                .setObject(attributeAlias)
                .executeUpdate());
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void updateAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2490);
        __CLR4_5_21re1relwydyewx.R.inc(2491);QueryBuilder.create(dataSource, getQuery("database.updateAttributeAlias"))
                .setObject(attributeAlias)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void removeAttributeAlias(long attributeAliasId) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2492);
        __CLR4_5_21re1relwydyewx.R.inc(2493);QueryBuilder.create(dataSource, getQuery("database.deleteAttributeAlias"))
                .setLong("id", attributeAliasId)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<Statistics> getStatistics(Date from, Date to) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2494);
        __CLR4_5_21re1relwydyewx.R.inc(2495);return QueryBuilder.create(dataSource, getQuery("database.selectStatistics"))
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Statistics.class);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public static Class<?> getClassByName(String name) throws ClassNotFoundException {try{__CLR4_5_21re1relwydyewx.R.inc(2496);
        boolean __CLB4_5_2_bool2=false;__CLR4_5_21re1relwydyewx.R.inc(2497);switch (name.toLowerCase().replace("id", "")) {
            case "device":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2498);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2499);return Device.class;
            case "group":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2500);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2501);return Group.class;
            case "user":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2502);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2503);return User.class;
            case "manageduser":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2504);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2505);return ManagedUser.class;
            case "geofence":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2506);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2507);return Geofence.class;
            case "driver":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2508);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2509);return Driver.class;
            case "attribute":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2510);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2511);return Attribute.class;
            case "calendar":if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2512);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2513);return Calendar.class;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_21re1relwydyewx.R.inc(2514);__CLB4_5_2_bool2=true;}
                __CLR4_5_21re1relwydyewx.R.inc(2515);throw new ClassNotFoundException();
        }
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    private static String makeNameId(Class<?> clazz) {try{__CLR4_5_21re1relwydyewx.R.inc(2516);
        __CLR4_5_21re1relwydyewx.R.inc(2517);String name = clazz.getSimpleName();
        __CLR4_5_21re1relwydyewx.R.inc(2518);return Introspector.decapitalize(name) + ((((!name.contains("Id") )&&(__CLR4_5_21re1relwydyewx.R.iget(2519)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2520)==0&false))? "Id" : "");
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public Collection<Permission> getPermissions(Class<? extends BaseModel> owner, Class<? extends BaseModel> property)
            throws SQLException, ClassNotFoundException {try{__CLR4_5_21re1relwydyewx.R.inc(2521);
        __CLR4_5_21re1relwydyewx.R.inc(2522);return QueryBuilder.create(dataSource, getQuery(ACTION_SELECT_ALL, owner, property))
                .executePermissionsQuery();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void linkObject(Class<?> owner, long ownerId, Class<?> property, long propertyId, boolean link)
            throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2523);
        __CLR4_5_21re1relwydyewx.R.inc(2524);QueryBuilder.create(dataSource, getQuery((((link )&&(__CLR4_5_21re1relwydyewx.R.iget(2525)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2526)==0&false))? ACTION_INSERT : ACTION_DELETE, owner, property))
                .setLong(makeNameId(owner), ownerId)
                .setLong(makeNameId(property), propertyId)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public <T extends BaseModel> T getObject(Class<T> clazz, long entityId) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2527);
        __CLR4_5_21re1relwydyewx.R.inc(2528);return QueryBuilder.create(dataSource, getQuery(ACTION_SELECT, clazz))
                .setLong("id", entityId)
                .executeQuerySingle(clazz);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public <T extends BaseModel> Collection<T> getObjects(Class<T> clazz) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2529);
        __CLR4_5_21re1relwydyewx.R.inc(2530);return QueryBuilder.create(dataSource, getQuery(ACTION_SELECT_ALL, clazz))
                .executeQuery(clazz);
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void addObject(BaseModel entity) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2531);
        __CLR4_5_21re1relwydyewx.R.inc(2532);entity.setId(QueryBuilder.create(dataSource, getQuery(ACTION_INSERT, entity.getClass()), true)
                .setObject(entity)
                .executeUpdate());
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void updateObject(BaseModel entity) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2533);
        __CLR4_5_21re1relwydyewx.R.inc(2534);QueryBuilder.create(dataSource, getQuery(ACTION_UPDATE, entity.getClass()))
                .setObject(entity)
                .executeUpdate();
        __CLR4_5_21re1relwydyewx.R.inc(2535);if ((((entity instanceof User && ((User) entity).getHashedPassword() != null)&&(__CLR4_5_21re1relwydyewx.R.iget(2536)!=0|true))||(__CLR4_5_21re1relwydyewx.R.iget(2537)==0&false))) {{
            __CLR4_5_21re1relwydyewx.R.inc(2538);QueryBuilder.create(dataSource, getQuery(ACTION_UPDATE, User.class, true))
                    .setObject(entity)
                    .executeUpdate();
        }
    }}finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

    public void removeObject(Class<? extends BaseModel> clazz, long entityId) throws SQLException {try{__CLR4_5_21re1relwydyewx.R.inc(2539);
        __CLR4_5_21re1relwydyewx.R.inc(2540);QueryBuilder.create(dataSource, getQuery(ACTION_DELETE, clazz))
                .setLong("id", entityId)
                .executeUpdate();
    }finally{__CLR4_5_21re1relwydyewx.R.flushNeeded();}}

}
