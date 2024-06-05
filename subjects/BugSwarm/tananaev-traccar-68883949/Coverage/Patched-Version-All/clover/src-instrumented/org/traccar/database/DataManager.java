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
import java.util.Properties;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.traccar.Context;
import org.traccar.helper.DriverDelegate;
import org.traccar.helper.Log;
import org.traccar.http.AsyncServlet;
import org.traccar.http.JsonConverter;
import org.traccar.model.Device;
import org.traccar.model.Permission;
import org.traccar.model.Position;
import org.traccar.model.Server;
import org.traccar.model.User;

public class DataManager {public static class __CLR4_5_2kkkklx1dsjhb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long DEFAULT_REFRESH_DELAY = 300;
    
    private final Properties properties;
    
    private DataSource dataSource;
    
    private final Map<String, Device> devices = new HashMap<String, Device>();
    private long devicesLastUpdate;
    private long devicesRefreshDelay;

    public DataManager(Properties properties) throws Exception {try{__CLR4_5_2kkkklx1dsjhb.R.inc(740);
        __CLR4_5_2kkkklx1dsjhb.R.inc(741);this.properties = properties;
        __CLR4_5_2kkkklx1dsjhb.R.inc(742);if ((((properties != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(743)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(744)==0&false))) {{
            __CLR4_5_2kkkklx1dsjhb.R.inc(745);initDatabase(properties);
            
            // Refresh delay
            __CLR4_5_2kkkklx1dsjhb.R.inc(746);String refreshDelay = properties.getProperty("database.refreshDelay");
            __CLR4_5_2kkkklx1dsjhb.R.inc(747);if ((((refreshDelay != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(748)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(749)==0&false))) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(750);devicesRefreshDelay = Long.valueOf(refreshDelay) * 1000;
            } }else {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(751);devicesRefreshDelay = DEFAULT_REFRESH_DELAY * 1000;
            }
        }}
    }}finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public DataSource getDataSource() {try{__CLR4_5_2kkkklx1dsjhb.R.inc(752);
        __CLR4_5_2kkkklx1dsjhb.R.inc(753);return dataSource;
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    private void initDatabase(Properties properties) throws Exception {try{__CLR4_5_2kkkklx1dsjhb.R.inc(754);
        
        __CLR4_5_2kkkklx1dsjhb.R.inc(755);String jndiName = properties.getProperty("database.jndi");

        __CLR4_5_2kkkklx1dsjhb.R.inc(756);if ((((jndiName != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(757)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(758)==0&false))) {{

            __CLR4_5_2kkkklx1dsjhb.R.inc(759);dataSource = (DataSource) new InitialContext().lookup(jndiName);

        } }else {{

            // Load driver
            __CLR4_5_2kkkklx1dsjhb.R.inc(760);String driver = properties.getProperty("database.driver");
            __CLR4_5_2kkkklx1dsjhb.R.inc(761);if ((((driver != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(762)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(763)==0&false))) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(764);String driverFile = properties.getProperty("database.driverFile");

                __CLR4_5_2kkkklx1dsjhb.R.inc(765);if ((((driverFile != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(766)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(767)==0&false))) {{
                    __CLR4_5_2kkkklx1dsjhb.R.inc(768);URL url = new URL("jar:file:" + new File(driverFile).getAbsolutePath() + "!/");
                    __CLR4_5_2kkkklx1dsjhb.R.inc(769);URLClassLoader cl = new URLClassLoader(new URL[]{url});
                    __CLR4_5_2kkkklx1dsjhb.R.inc(770);Driver d = (Driver) Class.forName(driver, true, cl).newInstance();
                    __CLR4_5_2kkkklx1dsjhb.R.inc(771);DriverManager.registerDriver(new DriverDelegate(d));
                } }else {{
                    __CLR4_5_2kkkklx1dsjhb.R.inc(772);Class.forName(driver);
                }
            }}

            // Initialize data source
            }__CLR4_5_2kkkklx1dsjhb.R.inc(773);ComboPooledDataSource ds = new ComboPooledDataSource();
            __CLR4_5_2kkkklx1dsjhb.R.inc(774);ds.setDriverClass(properties.getProperty("database.driver"));
            __CLR4_5_2kkkklx1dsjhb.R.inc(775);ds.setJdbcUrl(properties.getProperty("database.url"));
            __CLR4_5_2kkkklx1dsjhb.R.inc(776);ds.setUser(properties.getProperty("database.user"));
            __CLR4_5_2kkkklx1dsjhb.R.inc(777);ds.setPassword(properties.getProperty("database.password"));
            __CLR4_5_2kkkklx1dsjhb.R.inc(778);ds.setIdleConnectionTestPeriod(600);
            __CLR4_5_2kkkklx1dsjhb.R.inc(779);ds.setTestConnectionOnCheckin(true);
            __CLR4_5_2kkkklx1dsjhb.R.inc(780);String maxPoolSize = properties.getProperty("database.maxPoolSize");
            __CLR4_5_2kkkklx1dsjhb.R.inc(781);if ((((maxPoolSize != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(782)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(783)==0&false))) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(784);ds.setMaxPoolSize(Integer.valueOf(maxPoolSize));
            }
            }__CLR4_5_2kkkklx1dsjhb.R.inc(785);dataSource = ds;
        }
    }}finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Device getDeviceByUniqueId(String uniqueId) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(786);

        __CLR4_5_2kkkklx1dsjhb.R.inc(787);if (((((new Date().getTime() - devicesLastUpdate > devicesRefreshDelay) || !devices.containsKey(uniqueId))&&(__CLR4_5_2kkkklx1dsjhb.R.iget(788)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(789)==0&false))) {{

            __CLR4_5_2kkkklx1dsjhb.R.inc(790);devices.clear();
            __CLR4_5_2kkkklx1dsjhb.R.inc(791);for (Device device : getAllDevices()) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(792);devices.put(device.getUniqueId(), device);
            }
            }__CLR4_5_2kkkklx1dsjhb.R.inc(793);devicesLastUpdate = new Date().getTime();
        }

        }__CLR4_5_2kkkklx1dsjhb.R.inc(794);return devices.get(uniqueId);
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    private String getQuery(String key) {try{__CLR4_5_2kkkklx1dsjhb.R.inc(795);
        __CLR4_5_2kkkklx1dsjhb.R.inc(796);String query = properties.getProperty(key);
        __CLR4_5_2kkkklx1dsjhb.R.inc(797);if ((((query == null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(798)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(799)==0&false))) {{
            __CLR4_5_2kkkklx1dsjhb.R.inc(800);Log.info("Query not provided: " + key);
        }
        }__CLR4_5_2kkkklx1dsjhb.R.inc(801);return query;
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public void initDatabaseSchema() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(802);

        __CLR4_5_2kkkklx1dsjhb.R.inc(803);if ((((!Boolean.valueOf(properties.getProperty("web.old")))&&(__CLR4_5_2kkkklx1dsjhb.R.iget(804)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(805)==0&false))) {{

            __CLR4_5_2kkkklx1dsjhb.R.inc(806);Connection connection = dataSource.getConnection();
            __CLR4_5_2kkkklx1dsjhb.R.inc(807);ResultSet result = connection.getMetaData().getTables(
                    connection.getCatalog(), null, null, null);

            __CLR4_5_2kkkklx1dsjhb.R.inc(808);boolean exist = false;
            __CLR4_5_2kkkklx1dsjhb.R.inc(809);String checkTable = properties.getProperty("database.checkTable");
            __CLR4_5_2kkkklx1dsjhb.R.inc(810);while ((((result.next())&&(__CLR4_5_2kkkklx1dsjhb.R.iget(811)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(812)==0&false))) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(813);if ((((result.getString("TABLE_NAME").equalsIgnoreCase(checkTable))&&(__CLR4_5_2kkkklx1dsjhb.R.iget(814)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(815)==0&false))) {{
                    __CLR4_5_2kkkklx1dsjhb.R.inc(816);exist = true;
                    __CLR4_5_2kkkklx1dsjhb.R.inc(817);break;
                }
            }}
            }__CLR4_5_2kkkklx1dsjhb.R.inc(818);if ((((exist)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(819)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(820)==0&false))) {{
                __CLR4_5_2kkkklx1dsjhb.R.inc(821);return;
            }

            }__CLR4_5_2kkkklx1dsjhb.R.inc(822);QueryBuilder.create(dataSource, getQuery("database.createSchema")).executeUpdate();

            __CLR4_5_2kkkklx1dsjhb.R.inc(823);User admin = new User();
            __CLR4_5_2kkkklx1dsjhb.R.inc(824);admin.setName("admin");
            __CLR4_5_2kkkklx1dsjhb.R.inc(825);admin.setEmail("admin");
            __CLR4_5_2kkkklx1dsjhb.R.inc(826);admin.setAdmin(true);
            __CLR4_5_2kkkklx1dsjhb.R.inc(827);admin.setPassword("admin");
            __CLR4_5_2kkkklx1dsjhb.R.inc(828);addUser(admin);

            __CLR4_5_2kkkklx1dsjhb.R.inc(829);Server server = new Server();
            __CLR4_5_2kkkklx1dsjhb.R.inc(830);server.setRegistration(true);
            __CLR4_5_2kkkklx1dsjhb.R.inc(831);QueryBuilder.create(dataSource, getQuery("database.insertServer"))
                    .setObject(server)
                    .executeUpdate();

            __CLR4_5_2kkkklx1dsjhb.R.inc(832);mockData(admin.getId());
        }
    }}finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    private void mockData(long userId) {try{__CLR4_5_2kkkklx1dsjhb.R.inc(833);
        __CLR4_5_2kkkklx1dsjhb.R.inc(834);if ((((Boolean.valueOf(Context.getProps().getProperty("database.mock")))&&(__CLR4_5_2kkkklx1dsjhb.R.iget(835)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(836)==0&false))) {{
            __CLR4_5_2kkkklx1dsjhb.R.inc(837);try {

                __CLR4_5_2kkkklx1dsjhb.R.inc(838);Device device = new Device();
                __CLR4_5_2kkkklx1dsjhb.R.inc(839);device.setName("test1");
                __CLR4_5_2kkkklx1dsjhb.R.inc(840);device.setUniqueId("123456789012345");
                __CLR4_5_2kkkklx1dsjhb.R.inc(841);addDevice(device);
                __CLR4_5_2kkkklx1dsjhb.R.inc(842);linkDevice(userId, device.getId());

                __CLR4_5_2kkkklx1dsjhb.R.inc(843);Position position = new Position();
                __CLR4_5_2kkkklx1dsjhb.R.inc(844);position.setDeviceId(device.getId());

                __CLR4_5_2kkkklx1dsjhb.R.inc(845);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:01"));
                __CLR4_5_2kkkklx1dsjhb.R.inc(846);position.setLatitude(-36.8785803);
                __CLR4_5_2kkkklx1dsjhb.R.inc(847);position.setLongitude(174.7281713);
                __CLR4_5_2kkkklx1dsjhb.R.inc(848);addPosition(position);

                __CLR4_5_2kkkklx1dsjhb.R.inc(849);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:02"));
                __CLR4_5_2kkkklx1dsjhb.R.inc(850);position.setLatitude(-36.8870932);
                __CLR4_5_2kkkklx1dsjhb.R.inc(851);position.setLongitude(174.7473116);
                __CLR4_5_2kkkklx1dsjhb.R.inc(852);addPosition(position);

                __CLR4_5_2kkkklx1dsjhb.R.inc(853);position.setTime(JsonConverter.parseDate("2015-05-22T12:00:03"));
                __CLR4_5_2kkkklx1dsjhb.R.inc(854);position.setLatitude(-36.8932371);
                __CLR4_5_2kkkklx1dsjhb.R.inc(855);position.setLongitude(174.7743053);
                __CLR4_5_2kkkklx1dsjhb.R.inc(856);addPosition(position);
                
                __CLR4_5_2kkkklx1dsjhb.R.inc(857);updateLatestPosition(position);

            } catch (SQLException error) {
                __CLR4_5_2kkkklx1dsjhb.R.inc(858);Log.warning(error);
            } catch (ParseException error) {
                __CLR4_5_2kkkklx1dsjhb.R.inc(859);Log.warning(error);
            }
        }
    }}finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(860);
        __CLR4_5_2kkkklx1dsjhb.R.inc(861);User user = QueryBuilder.create(dataSource, getQuery("database.loginUser"))
                .setString("email", email)
                .executeQuerySingle(new User());
        __CLR4_5_2kkkklx1dsjhb.R.inc(862);return (((user != null && user.isPasswordValid(password) )&&(__CLR4_5_2kkkklx1dsjhb.R.iget(863)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(864)==0&false))? user : null;
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<User> getUsers() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(865);
        __CLR4_5_2kkkklx1dsjhb.R.inc(866);return QueryBuilder.create(dataSource, getQuery("database.selectUsersAll"))
                .executeQuery(new User());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public void addUser(User user) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(867);
        __CLR4_5_2kkkklx1dsjhb.R.inc(868);user.setId(QueryBuilder.create(dataSource, getQuery("database.insertUser"), true)
                .setObject(user)
                .executeUpdate());
        __CLR4_5_2kkkklx1dsjhb.R.inc(869);Context.getPermissionsManager().refresh();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public void updateUser(User user) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(870);
        __CLR4_5_2kkkklx1dsjhb.R.inc(871);QueryBuilder.create(dataSource, getQuery("database.updateUser"))
                .setObject(user)
                .executeUpdate();
        __CLR4_5_2kkkklx1dsjhb.R.inc(872);if((((user.getHashedPassword() != null)&&(__CLR4_5_2kkkklx1dsjhb.R.iget(873)!=0|true))||(__CLR4_5_2kkkklx1dsjhb.R.iget(874)==0&false))) {{
            __CLR4_5_2kkkklx1dsjhb.R.inc(875);QueryBuilder.create(dataSource, getQuery("database.updateUserPassword"))
                .setObject(user)
                .executeUpdate();
        }
        }__CLR4_5_2kkkklx1dsjhb.R.inc(876);Context.getPermissionsManager().refresh();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public void removeUser(User user) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(877);
        __CLR4_5_2kkkklx1dsjhb.R.inc(878);QueryBuilder.create(dataSource, getQuery("database.deleteUser"))
                .setObject(user)
                .executeUpdate();
        __CLR4_5_2kkkklx1dsjhb.R.inc(879);Context.getPermissionsManager().refresh();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<Permission> getPermissions() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(880);
        __CLR4_5_2kkkklx1dsjhb.R.inc(881);return QueryBuilder.create(dataSource, getQuery("database.getPermissionsAll"))
                .executeQuery(new Permission());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<Device> getAllDevices() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(882);
        __CLR4_5_2kkkklx1dsjhb.R.inc(883);return QueryBuilder.create(dataSource, getQuery("database.selectDevicesAll"))
                .executeQuery(new Device());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<Device> getDevices(long userId) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(884);
        __CLR4_5_2kkkklx1dsjhb.R.inc(885);return QueryBuilder.create(dataSource, getQuery("database.selectDevices"))
                .setLong("userId", userId)
                .executeQuery(new Device());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public void addDevice(Device device) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(886);
        __CLR4_5_2kkkklx1dsjhb.R.inc(887);device.setId(QueryBuilder.create(dataSource, getQuery("database.insertDevice"), true)
                .setObject(device)
                .executeUpdate());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public void updateDevice(Device device) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(888);
        __CLR4_5_2kkkklx1dsjhb.R.inc(889);QueryBuilder.create(dataSource, getQuery("database.updateDevice"))
                .setObject(device)
                .executeUpdate();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public void removeDevice(Device device) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(890);
        __CLR4_5_2kkkklx1dsjhb.R.inc(891);QueryBuilder.create(dataSource, getQuery("database.deleteDevice"))
                .setObject(device)
                .executeUpdate();
        __CLR4_5_2kkkklx1dsjhb.R.inc(892);Context.getPermissionsManager().refresh();
        __CLR4_5_2kkkklx1dsjhb.R.inc(893);AsyncServlet.sessionRefreshDevice(device.getId());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}
    
    public void linkDevice(long userId, long deviceId) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(894);
        __CLR4_5_2kkkklx1dsjhb.R.inc(895);QueryBuilder.create(dataSource, getQuery("database.linkDevice"))
                .setLong("userId", userId)
                .setLong("deviceId", deviceId)
                .executeUpdate();
        __CLR4_5_2kkkklx1dsjhb.R.inc(896);Context.getPermissionsManager().refresh();
        __CLR4_5_2kkkklx1dsjhb.R.inc(897);AsyncServlet.sessionRefreshUser(userId);
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<Position> getPositions(long userId, long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(898);
        __CLR4_5_2kkkklx1dsjhb.R.inc(899);return QueryBuilder.create(dataSource, getQuery("database.selectPositions"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(new Position());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public void addPosition(Position position) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(900);
        __CLR4_5_2kkkklx1dsjhb.R.inc(901);position.setId(QueryBuilder.create(dataSource, getQuery("database.insertPosition"), true)
                .setObject(position)
                .setDate("time", position.getFixTime()) // tmp
                .setLong("device_id", position.getDeviceId()) // tmp
                .setLong("power", 0) // tmp
                .setString("extended_info", position.getOther()) // tmp
                .executeUpdate());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    // TODO: possibly remove this method
    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(902);
        __CLR4_5_2kkkklx1dsjhb.R.inc(903);QueryBuilder.create(dataSource, getQuery("database.updateLatestPosition"))
                .setObject(position)
                .setDate("time", position.getFixTime()) // tmp
                .setLong("device_id", position.getDeviceId()) // tmp
                .setLong("power", 0) // tmp
                .setString("extended_info", position.getOther()) // tmp
                .executeUpdate();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Collection<Position> getLatestPositions() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(904);
        __CLR4_5_2kkkklx1dsjhb.R.inc(905);return QueryBuilder.create(dataSource, getQuery("database.selectLatestPositions"))
                .executeQuery(new Position());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public Server getServer() throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(906);
        __CLR4_5_2kkkklx1dsjhb.R.inc(907);return QueryBuilder.create(dataSource, getQuery("database.selectServers"))
                .executeQuerySingle(new Server());
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

    public void updateServer(Server server) throws SQLException {try{__CLR4_5_2kkkklx1dsjhb.R.inc(908);
        __CLR4_5_2kkkklx1dsjhb.R.inc(909);QueryBuilder.create(dataSource, getQuery("database.updateServer"))
                .setObject(server)
                .executeUpdate();
    }finally{__CLR4_5_2kkkklx1dsjhb.R.flushNeeded();}}

}
