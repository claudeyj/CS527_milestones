/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.traccar.Config;
import org.traccar.helper.DriverDelegate;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.MiscFormatter;
import org.traccar.model.Permission;
import org.traccar.model.Position;
import org.traccar.model.Schema;
import org.traccar.model.Server;
import org.traccar.model.User;
import org.traccar.web.AsyncServlet;
import org.traccar.web.JsonConverter;

public class DataManager implements IdentityManager {public static class __CLR4_5_2lwlwlx1e7wvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long DEFAULT_REFRESH_DELAY = 300;
    
    private final Config config;
    
    private DataSource dataSource;
    
    private final Map<Long, Device> devicesById = new HashMap<>();
    private final Map<String, Device> devicesByUniqueId = new HashMap<>();
    private long devicesLastUpdate;
    private final long devicesRefreshDelay;

    public DataManager(Config config) throws Exception {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(788);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(789);this.config = config;

        __CLR4_5_2lwlwlx1e7wvd.R.inc(790);initDatabase();
        __CLR4_5_2lwlwlx1e7wvd.R.inc(791);initDatabaseSchema();

        __CLR4_5_2lwlwlx1e7wvd.R.inc(792);devicesRefreshDelay = config.getLong("database.refreshDelay", DEFAULT_REFRESH_DELAY) * 1000;
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public DataSource getDataSource() {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(793);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(794);return dataSource;
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    private void initDatabase() throws Exception {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(795);
        
        __CLR4_5_2lwlwlx1e7wvd.R.inc(796);String jndiName = config.getString("database.jndi");

        __CLR4_5_2lwlwlx1e7wvd.R.inc(797);if ((((jndiName != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(798)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(799)==0&false))) {{

            __CLR4_5_2lwlwlx1e7wvd.R.inc(800);dataSource = (DataSource) new InitialContext().lookup(jndiName);

        } }else {{

            // Load driver
            __CLR4_5_2lwlwlx1e7wvd.R.inc(801);String driver = config.getString("database.driver");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(802);if ((((driver != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(803)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(804)==0&false))) {{
                __CLR4_5_2lwlwlx1e7wvd.R.inc(805);String driverFile = config.getString("database.driverFile");

                __CLR4_5_2lwlwlx1e7wvd.R.inc(806);if ((((driverFile != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(807)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(808)==0&false))) {{
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(809);URL url = new URL("jar:file:" + new File(driverFile).getAbsolutePath() + "!/");
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(810);URLClassLoader cl = new URLClassLoader(new URL[]{url});
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(811);Driver d = (Driver) Class.forName(driver, true, cl).newInstance();
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(812);DriverManager.registerDriver(new DriverDelegate(d));
                } }else {{
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(813);Class.forName(driver);
                }
            }}

            // Initialize data source
            }__CLR4_5_2lwlwlx1e7wvd.R.inc(814);ComboPooledDataSource ds = new ComboPooledDataSource();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(815);ds.setDriverClass(config.getString("database.driver"));
            __CLR4_5_2lwlwlx1e7wvd.R.inc(816);ds.setJdbcUrl(config.getString("database.url"));
            __CLR4_5_2lwlwlx1e7wvd.R.inc(817);ds.setUser(config.getString("database.user"));
            __CLR4_5_2lwlwlx1e7wvd.R.inc(818);ds.setPassword(config.getString("database.password"));
            __CLR4_5_2lwlwlx1e7wvd.R.inc(819);ds.setIdleConnectionTestPeriod(600);
            __CLR4_5_2lwlwlx1e7wvd.R.inc(820);ds.setTestConnectionOnCheckin(true);
            __CLR4_5_2lwlwlx1e7wvd.R.inc(821);int maxPoolSize = config.getInteger("database.maxPoolSize");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(822);if ((((maxPoolSize != 0)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(823)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(824)==0&false))) {{
                __CLR4_5_2lwlwlx1e7wvd.R.inc(825);ds.setMaxPoolSize(maxPoolSize);
            }
            }__CLR4_5_2lwlwlx1e7wvd.R.inc(826);dataSource = ds;
        }
    }}finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    @Override
    public Device getDeviceById(long id) {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(827);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(828);return devicesById.get(id);
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    @Override
    public Device getDeviceByUniqueId(String uniqueId) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(829);

        __CLR4_5_2lwlwlx1e7wvd.R.inc(830);if (((((new Date().getTime() - devicesLastUpdate > devicesRefreshDelay) || !devicesByUniqueId.containsKey(uniqueId))&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(831)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(832)==0&false))) {{

            __CLR4_5_2lwlwlx1e7wvd.R.inc(833);devicesById.clear();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(834);devicesByUniqueId.clear();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(835);for (Device device : getAllDevices()) {{
                __CLR4_5_2lwlwlx1e7wvd.R.inc(836);devicesById.put(device.getId(), device);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(837);devicesByUniqueId.put(device.getUniqueId(), device);
            }
            }__CLR4_5_2lwlwlx1e7wvd.R.inc(838);devicesLastUpdate = new Date().getTime();
        }

        }__CLR4_5_2lwlwlx1e7wvd.R.inc(839);return devicesByUniqueId.get(uniqueId);
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    private String getQuery(String key) {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(840);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(841);String query = config.getString(key);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(842);if ((((query == null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(843)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(844)==0&false))) {{
            __CLR4_5_2lwlwlx1e7wvd.R.inc(845);Log.info("Query not provided: " + key);
        }
        }__CLR4_5_2lwlwlx1e7wvd.R.inc(846);return query;
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    private void initDatabaseSchema() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(847);

        __CLR4_5_2lwlwlx1e7wvd.R.inc(848);if ((((config.getString("web.type", "new").equals("new") || config.getString("web.type", "new").equals("api"))&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(849)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(850)==0&false))) {{

            __CLR4_5_2lwlwlx1e7wvd.R.inc(851);Connection connection = dataSource.getConnection();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(852);ResultSet result = connection.getMetaData().getTables(
                    connection.getCatalog(), null, null, null);

            __CLR4_5_2lwlwlx1e7wvd.R.inc(853);boolean exist = false;
            __CLR4_5_2lwlwlx1e7wvd.R.inc(854);String checkTable = config.getString("database.checkTable");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(855);while ((((result.next())&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(856)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(857)==0&false))) {{
                __CLR4_5_2lwlwlx1e7wvd.R.inc(858);if ((((result.getString("TABLE_NAME").equalsIgnoreCase(checkTable))&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(859)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(860)==0&false))) {{
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(861);exist = true;
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(862);break;
                }
            }}
            }__CLR4_5_2lwlwlx1e7wvd.R.inc(863);if ((((exist)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(864)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(865)==0&false))) {{
                
                __CLR4_5_2lwlwlx1e7wvd.R.inc(866);String schemaVersionQuery = getQuery("database.selectSchemaVersion");
                __CLR4_5_2lwlwlx1e7wvd.R.inc(867);if ((((schemaVersionQuery != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(868)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(869)==0&false))) {{
                
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(870);Schema schema = QueryBuilder.create(dataSource, schemaVersionQuery).executeQuerySingle(new Schema());

                    __CLR4_5_2lwlwlx1e7wvd.R.inc(871);int version = 0;
                    __CLR4_5_2lwlwlx1e7wvd.R.inc(872);if ((((schema != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(873)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(874)==0&false))) {{
                        __CLR4_5_2lwlwlx1e7wvd.R.inc(875);version = schema.getVersion();
                    }

                    }__CLR4_5_2lwlwlx1e7wvd.R.inc(876);if ((((version != 301)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(877)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(878)==0&false))) {{
                        __CLR4_5_2lwlwlx1e7wvd.R.inc(879);Log.error("Wrong database schema version (" + version + ")");
                        __CLR4_5_2lwlwlx1e7wvd.R.inc(880);throw new RuntimeException();
                    }
                }}
                
                }__CLR4_5_2lwlwlx1e7wvd.R.inc(881);return;
            }

            }__CLR4_5_2lwlwlx1e7wvd.R.inc(882);QueryBuilder.create(dataSource, getQuery("database.createSchema")).executeUpdate();

            __CLR4_5_2lwlwlx1e7wvd.R.inc(883);User admin = new User();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(884);admin.setName("admin");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(885);admin.setEmail("admin");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(886);admin.setAdmin(true);
            __CLR4_5_2lwlwlx1e7wvd.R.inc(887);admin.setPassword("admin");
            __CLR4_5_2lwlwlx1e7wvd.R.inc(888);addUser(admin);

            __CLR4_5_2lwlwlx1e7wvd.R.inc(889);Server server = new Server();
            __CLR4_5_2lwlwlx1e7wvd.R.inc(890);server.setRegistration(true);
            __CLR4_5_2lwlwlx1e7wvd.R.inc(891);QueryBuilder.create(dataSource, getQuery("database.insertServer"))
                    .setObject(server)
                    .executeUpdate();

            __CLR4_5_2lwlwlx1e7wvd.R.inc(892);mockData(admin.getId());
        }
    }}finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    private void mockData(long userId) {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(893);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(894);if ((((config.getBoolean("database.mock"))&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(895)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(896)==0&false))) {{
            __CLR4_5_2lwlwlx1e7wvd.R.inc(897);try {

                __CLR4_5_2lwlwlx1e7wvd.R.inc(898);Device device = new Device();
                __CLR4_5_2lwlwlx1e7wvd.R.inc(899);device.setName("test1");
                __CLR4_5_2lwlwlx1e7wvd.R.inc(900);device.setUniqueId("123456789012345");
                __CLR4_5_2lwlwlx1e7wvd.R.inc(901);addDevice(device);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(902);linkDevice(userId, device.getId());

                __CLR4_5_2lwlwlx1e7wvd.R.inc(903);Position position = new Position();
                __CLR4_5_2lwlwlx1e7wvd.R.inc(904);position.setDeviceId(device.getId());

                __CLR4_5_2lwlwlx1e7wvd.R.inc(905);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:01.000Z"));
                __CLR4_5_2lwlwlx1e7wvd.R.inc(906);position.setLatitude(-36.8785803);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(907);position.setLongitude(174.7281713);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(908);addPosition(position);

                __CLR4_5_2lwlwlx1e7wvd.R.inc(909);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:02.000Z"));
                __CLR4_5_2lwlwlx1e7wvd.R.inc(910);position.setLatitude(-36.8870932);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(911);position.setLongitude(174.7473116);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(912);addPosition(position);

                __CLR4_5_2lwlwlx1e7wvd.R.inc(913);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:03.000Z"));
                __CLR4_5_2lwlwlx1e7wvd.R.inc(914);position.setLatitude(-36.8932371);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(915);position.setLongitude(174.7743053);
                __CLR4_5_2lwlwlx1e7wvd.R.inc(916);addPosition(position);
                
                __CLR4_5_2lwlwlx1e7wvd.R.inc(917);updateLatestPosition(position);

            } catch (SQLException error) {
                __CLR4_5_2lwlwlx1e7wvd.R.inc(918);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(919);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(920);User user = QueryBuilder.create(dataSource, getQuery("database.loginUser"))
                .setString("email", email)
                .executeQuerySingle(new User());
        __CLR4_5_2lwlwlx1e7wvd.R.inc(921);return (((user != null && user.isPasswordValid(password) )&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(922)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(923)==0&false))? user : null;
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<User> getUsers() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(924);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(925);return QueryBuilder.create(dataSource, getQuery("database.selectUsersAll"))
                .executeQuery(new User());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public User getUser(long userId) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(926);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(927);return QueryBuilder.create(dataSource, getQuery("database.selectUser"))
                .setLong("id", userId)
                .executeQuerySingle(new User());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public void addUser(User user) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(928);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(929);user.setId(QueryBuilder.create(dataSource, getQuery("database.insertUser"), true)
                .setObject(user)
                .executeUpdate());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public void updateUser(User user) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(930);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(931);QueryBuilder.create(dataSource, getQuery("database.updateUser"))
                .setObject(user)
                .executeUpdate();
        __CLR4_5_2lwlwlx1e7wvd.R.inc(932);if ((((user.getHashedPassword() != null)&&(__CLR4_5_2lwlwlx1e7wvd.R.iget(933)!=0|true))||(__CLR4_5_2lwlwlx1e7wvd.R.iget(934)==0&false))) {{
            __CLR4_5_2lwlwlx1e7wvd.R.inc(935);QueryBuilder.create(dataSource, getQuery("database.updateUserPassword"))
                .setObject(user)
                .executeUpdate();
        }
    }}finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public void removeUser(User user) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(936);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(937);QueryBuilder.create(dataSource, getQuery("database.deleteUser"))
                .setObject(user)
                .executeUpdate();
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<Permission> getPermissions() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(938);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(939);return QueryBuilder.create(dataSource, getQuery("database.getPermissionsAll"))
                .executeQuery(new Permission());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<Device> getAllDevices() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(940);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(941);return QueryBuilder.create(dataSource, getQuery("database.selectDevicesAll"))
                .executeQuery(new Device());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<Device> getDevices(long userId) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(942);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(943);return QueryBuilder.create(dataSource, getQuery("database.selectDevices"))
                .setLong("userId", userId)
                .executeQuery(new Device());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public void addDevice(Device device) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(944);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(945);device.setId(QueryBuilder.create(dataSource, getQuery("database.insertDevice"), true)
                .setObject(device)
                .executeUpdate());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public void updateDevice(Device device) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(946);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(947);QueryBuilder.create(dataSource, getQuery("database.updateDevice"))
                .setObject(device)
                .executeUpdate();
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public void removeDevice(Device device) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(948);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(949);QueryBuilder.create(dataSource, getQuery("database.deleteDevice"))
                .setObject(device)
                .executeUpdate();
        __CLR4_5_2lwlwlx1e7wvd.R.inc(950);AsyncServlet.sessionRefreshDevice(device.getId());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}
    
    public void linkDevice(long userId, long deviceId) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(951);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(952);QueryBuilder.create(dataSource, getQuery("database.linkDevice"))
                .setLong("userId", userId)
                .setLong("deviceId", deviceId)
                .executeUpdate();
        __CLR4_5_2lwlwlx1e7wvd.R.inc(953);AsyncServlet.sessionRefreshUser(userId);
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<Position> getPositions(long userId, long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(954);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(955);return QueryBuilder.create(dataSource, getQuery("database.selectPositions"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(new Position());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public void addPosition(Position position) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(956);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(957);position.setId(QueryBuilder.create(dataSource, getQuery("database.insertPosition"), true)
                .setObject(position)
                .setDate("time", position.getFixTime()) // tmp
                .setLong("device_id", position.getDeviceId()) // tmp
                .setLong("power", 0) // tmp
                .setString("extended_info", MiscFormatter.toXmlString(position.getAttributes())) // tmp
                .setString("other", MiscFormatter.toXmlString(position.getAttributes())) // tmp
                .executeUpdate());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(958);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(959);QueryBuilder.create(dataSource, getQuery("database.updateLatestPosition"))
                .setObject(position)
                .setDate("time", position.getFixTime()) // tmp
                .setLong("device_id", position.getDeviceId()) // tmp
                .setLong("power", 0) // tmp
                .setString("extended_info", MiscFormatter.toXmlString(position.getAttributes())) // tmp
                .setString("other", MiscFormatter.toXmlString(position.getAttributes())) // tmp
                .executeUpdate();
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Collection<Position> getLatestPositions() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(960);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(961);return QueryBuilder.create(dataSource, getQuery("database.selectLatestPositions"))
                .executeQuery(new Position());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public Server getServer() throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(962);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(963);return QueryBuilder.create(dataSource, getQuery("database.selectServers"))
                .executeQuerySingle(new Server());
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

    public void updateServer(Server server) throws SQLException {try{__CLR4_5_2lwlwlx1e7wvd.R.inc(964);
        __CLR4_5_2lwlwlx1e7wvd.R.inc(965);QueryBuilder.create(dataSource, getQuery("database.updateServer"))
                .setObject(server)
                .executeUpdate();
    }finally{__CLR4_5_2lwlwlx1e7wvd.R.flushNeeded();}}

}
