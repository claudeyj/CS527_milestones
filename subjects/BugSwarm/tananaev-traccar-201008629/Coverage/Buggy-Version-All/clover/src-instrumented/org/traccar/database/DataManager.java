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

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

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
import org.traccar.model.AttributeAlias;
import org.traccar.model.Calendar;
import org.traccar.model.CalendarPermission;
import org.traccar.model.Device;
import org.traccar.model.DevicePermission;
import org.traccar.model.Event;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.model.GroupGeofence;
import org.traccar.model.GroupPermission;
import org.traccar.model.Notification;
import org.traccar.model.Position;
import org.traccar.model.Server;
import org.traccar.model.Statistics;
import org.traccar.model.User;
import org.traccar.model.UserPermission;
import org.traccar.model.DeviceGeofence;
import org.traccar.model.GeofencePermission;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataManager {public static class __CLR4_5_21qg1qglx1dxku8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,2443,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Config config;

    private DataSource dataSource;

    public DataManager(Config config) throws Exception {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2248);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2249);this.config = config;

        __CLR4_5_21qg1qglx1dxku8.R.inc(2250);initDatabase();
        __CLR4_5_21qg1qglx1dxku8.R.inc(2251);initDatabaseSchema();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public DataSource getDataSource() {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2252);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2253);return dataSource;
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    private void initDatabase() throws Exception {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2254);

        __CLR4_5_21qg1qglx1dxku8.R.inc(2255);String jndiName = config.getString("database.jndi");

        __CLR4_5_21qg1qglx1dxku8.R.inc(2256);if ((((jndiName != null)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2257)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2258)==0&false))) {{

            __CLR4_5_21qg1qglx1dxku8.R.inc(2259);dataSource = (DataSource) new InitialContext().lookup(jndiName);

        } }else {{

            __CLR4_5_21qg1qglx1dxku8.R.inc(2260);String driverFile = config.getString("database.driverFile");
            __CLR4_5_21qg1qglx1dxku8.R.inc(2261);if ((((driverFile != null)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2262)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2263)==0&false))) {{
                __CLR4_5_21qg1qglx1dxku8.R.inc(2264);URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
                __CLR4_5_21qg1qglx1dxku8.R.inc(2265);Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                __CLR4_5_21qg1qglx1dxku8.R.inc(2266);method.setAccessible(true);
                __CLR4_5_21qg1qglx1dxku8.R.inc(2267);method.invoke(classLoader, new File(driverFile).toURI().toURL());
            }

            }__CLR4_5_21qg1qglx1dxku8.R.inc(2268);String driver = config.getString("database.driver");
            __CLR4_5_21qg1qglx1dxku8.R.inc(2269);if ((((driver != null)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2270)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2271)==0&false))) {{
                __CLR4_5_21qg1qglx1dxku8.R.inc(2272);Class.forName(driver);
            }

            }__CLR4_5_21qg1qglx1dxku8.R.inc(2273);HikariConfig hikariConfig = new HikariConfig();
            __CLR4_5_21qg1qglx1dxku8.R.inc(2274);hikariConfig.setDriverClassName(config.getString("database.driver"));
            __CLR4_5_21qg1qglx1dxku8.R.inc(2275);hikariConfig.setJdbcUrl(config.getString("database.url"));
            __CLR4_5_21qg1qglx1dxku8.R.inc(2276);hikariConfig.setUsername(config.getString("database.user"));
            __CLR4_5_21qg1qglx1dxku8.R.inc(2277);hikariConfig.setPassword(config.getString("database.password"));
            __CLR4_5_21qg1qglx1dxku8.R.inc(2278);hikariConfig.setConnectionInitSql(config.getString("database.checkConnection", "SELECT 1"));
            __CLR4_5_21qg1qglx1dxku8.R.inc(2279);hikariConfig.setIdleTimeout(600000);

            __CLR4_5_21qg1qglx1dxku8.R.inc(2280);int maxPoolSize = config.getInteger("database.maxPoolSize");

            __CLR4_5_21qg1qglx1dxku8.R.inc(2281);if ((((maxPoolSize != 0)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2282)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2283)==0&false))) {{
                __CLR4_5_21qg1qglx1dxku8.R.inc(2284);hikariConfig.setMaximumPoolSize(maxPoolSize);
            }

            }__CLR4_5_21qg1qglx1dxku8.R.inc(2285);dataSource = new HikariDataSource(hikariConfig);

        }
    }}finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    private String getQuery(String key) {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2286);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2287);String query = config.getString(key);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2288);if ((((query == null)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2289)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2290)==0&false))) {{
            __CLR4_5_21qg1qglx1dxku8.R.inc(2291);Log.info("Query not provided: " + key);
        }
        }__CLR4_5_21qg1qglx1dxku8.R.inc(2292);return query;
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    private void initDatabaseSchema() throws SQLException, LiquibaseException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2293);

        __CLR4_5_21qg1qglx1dxku8.R.inc(2294);if ((((config.hasKey("database.changelog"))&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2295)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2296)==0&false))) {{

            __CLR4_5_21qg1qglx1dxku8.R.inc(2297);ResourceAccessor resourceAccessor = new FileSystemResourceAccessor();

            __CLR4_5_21qg1qglx1dxku8.R.inc(2298);Database database = DatabaseFactory.getInstance().openDatabase(
                    config.getString("database.url"),
                    config.getString("database.user"),
                    config.getString("database.password"),
                    null, resourceAccessor);

            __CLR4_5_21qg1qglx1dxku8.R.inc(2299);Liquibase liquibase = new Liquibase(
                    config.getString("database.changelog"), resourceAccessor, database);

            __CLR4_5_21qg1qglx1dxku8.R.inc(2300);liquibase.clearCheckSums();

            __CLR4_5_21qg1qglx1dxku8.R.inc(2301);liquibase.update(new Contexts());
        }
    }}finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public User login(String email, String password) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2302);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2303);User user = QueryBuilder.create(dataSource, getQuery("database.loginUser"))
                .setString("email", email)
                .executeQuerySingle(User.class);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2304);if ((((user != null && user.isPasswordValid(password))&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2305)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2306)==0&false))) {{
            __CLR4_5_21qg1qglx1dxku8.R.inc(2307);return user;
        } }else {{
            __CLR4_5_21qg1qglx1dxku8.R.inc(2308);return null;
        }
    }}finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<User> getUsers() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2309);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2310);return QueryBuilder.create(dataSource, getQuery("database.selectUsersAll"))
                .executeQuery(User.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addUser(User user) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2311);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2312);user.setId(QueryBuilder.create(dataSource, getQuery("database.insertUser"), true)
                .setObject(user)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateUser(User user) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2313);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2314);QueryBuilder.create(dataSource, getQuery("database.updateUser"))
                .setObject(user)
                .executeUpdate();
        __CLR4_5_21qg1qglx1dxku8.R.inc(2315);if ((((user.getHashedPassword() != null)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2316)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2317)==0&false))) {{
            __CLR4_5_21qg1qglx1dxku8.R.inc(2318);QueryBuilder.create(dataSource, getQuery("database.updateUserPassword"))
                .setObject(user)
                .executeUpdate();
        }
    }}finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeUser(long userId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2319);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2320);QueryBuilder.create(dataSource, getQuery("database.deleteUser"))
                .setLong("id", userId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<DevicePermission> getDevicePermissions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2321);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2322);return QueryBuilder.create(dataSource, getQuery("database.selectDevicePermissions"))
                .executeQuery(DevicePermission.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<GroupPermission> getGroupPermissions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2323);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2324);return QueryBuilder.create(dataSource, getQuery("database.selectGroupPermissions"))
                .executeQuery(GroupPermission.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Device> getAllDevices() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2325);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2326);return QueryBuilder.create(dataSource, getQuery("database.selectDevicesAll"))
                .executeQuery(Device.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addDevice(Device device) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2327);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2328);device.setId(QueryBuilder.create(dataSource, getQuery("database.insertDevice"), true)
                .setObject(device)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateDevice(Device device) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2329);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2330);QueryBuilder.create(dataSource, getQuery("database.updateDevice"))
                .setObject(device)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateDeviceStatus(Device device) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2331);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2332);QueryBuilder.create(dataSource, getQuery("database.updateDeviceStatus"))
                .setObject(device)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeDevice(long deviceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2333);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2334);QueryBuilder.create(dataSource, getQuery("database.deleteDevice"))
                .setLong("id", deviceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkDevice(long userId, long deviceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2335);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2336);QueryBuilder.create(dataSource, getQuery("database.linkDevice"))
                .setLong("userId", userId)
                .setLong("deviceId", deviceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkDevice(long userId, long deviceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2337);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2338);QueryBuilder.create(dataSource, getQuery("database.unlinkDevice"))
                .setLong("userId", userId)
                .setLong("deviceId", deviceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Group> getAllGroups() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2339);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2340);return QueryBuilder.create(dataSource, getQuery("database.selectGroupsAll"))
                .executeQuery(Group.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addGroup(Group group) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2341);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2342);group.setId(QueryBuilder.create(dataSource, getQuery("database.insertGroup"), true)
                .setObject(group)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateGroup(Group group) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2343);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2344);QueryBuilder.create(dataSource, getQuery("database.updateGroup"))
                .setObject(group)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeGroup(long groupId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2345);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2346);QueryBuilder.create(dataSource, getQuery("database.deleteGroup"))
                .setLong("id", groupId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkGroup(long userId, long groupId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2347);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2348);QueryBuilder.create(dataSource, getQuery("database.linkGroup"))
                .setLong("userId", userId)
                .setLong("groupId", groupId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkGroup(long userId, long groupId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2349);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2350);QueryBuilder.create(dataSource, getQuery("database.unlinkGroup"))
                .setLong("userId", userId)
                .setLong("groupId", groupId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Position> getPositions(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2351);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2352);return QueryBuilder.create(dataSource, getQuery("database.selectPositions"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Position.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Position getPosition(long positionId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2353);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2354);return QueryBuilder.create(dataSource, getQuery("database.selectPosition"))
                .setLong("id", positionId)
                .executeQuerySingle(Position.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addPosition(Position position) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2355);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2356);position.setId(QueryBuilder.create(dataSource, getQuery("database.insertPosition"), true)
                .setDate("now", new Date())
                .setObject(position)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateLatestPosition(Position position) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2357);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2358);QueryBuilder.create(dataSource, getQuery("database.updateLatestPosition"))
                .setDate("now", new Date())
                .setObject(position)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Position> getLatestPositions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2359);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2360);return QueryBuilder.create(dataSource, getQuery("database.selectLatestPositions"))
                .executeQuery(Position.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void clearPositionsHistory() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2361);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2362);long historyDays = config.getInteger("database.positionsHistoryDays");
        __CLR4_5_21qg1qglx1dxku8.R.inc(2363);if ((((historyDays != 0)&&(__CLR4_5_21qg1qglx1dxku8.R.iget(2364)!=0|true))||(__CLR4_5_21qg1qglx1dxku8.R.iget(2365)==0&false))) {{
            __CLR4_5_21qg1qglx1dxku8.R.inc(2366);QueryBuilder.create(dataSource, getQuery("database.deletePositions"))
                    .setDate("serverTime", new Date(System.currentTimeMillis() - historyDays * 24 * 3600 * 1000))
                    .executeUpdate();
        }
    }}finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Server getServer() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2367);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2368);return QueryBuilder.create(dataSource, getQuery("database.selectServers"))
                .executeQuerySingle(Server.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateServer(Server server) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2369);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2370);QueryBuilder.create(dataSource, getQuery("database.updateServer"))
                .setObject(server)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Event getEvent(long eventId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2371);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2372);return QueryBuilder.create(dataSource, getQuery("database.selectEvent"))
                .setLong("id", eventId)
                .executeQuerySingle(Event.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addEvent(Event event) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2373);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2374);event.setId(QueryBuilder.create(dataSource, getQuery("database.insertEvent"), true)
                .setObject(event)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Event> getEvents(long deviceId, Date from, Date to) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2375);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2376);return QueryBuilder.create(dataSource, getQuery("database.selectEvents"))
                .setLong("deviceId", deviceId)
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Event.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Geofence> getGeofences() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2377);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2378);return QueryBuilder.create(dataSource, getQuery("database.selectGeofencesAll"))
                .executeQuery(Geofence.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addGeofence(Geofence geofence) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2379);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2380);geofence.setId(QueryBuilder.create(dataSource, getQuery("database.insertGeofence"), true)
                .setObject(geofence)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateGeofence(Geofence geofence) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2381);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2382);QueryBuilder.create(dataSource, getQuery("database.updateGeofence"))
                .setObject(geofence)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeGeofence(long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2383);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2384);QueryBuilder.create(dataSource, getQuery("database.deleteGeofence"))
                .setLong("id", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<GeofencePermission> getGeofencePermissions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2385);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2386);return QueryBuilder.create(dataSource, getQuery("database.selectGeofencePermissions"))
                .executeQuery(GeofencePermission.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkGeofence(long userId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2387);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2388);QueryBuilder.create(dataSource, getQuery("database.linkGeofence"))
                .setLong("userId", userId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkGeofence(long userId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2389);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2390);QueryBuilder.create(dataSource, getQuery("database.unlinkGeofence"))
                .setLong("userId", userId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<GroupGeofence> getGroupGeofences() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2391);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2392);return QueryBuilder.create(dataSource, getQuery("database.selectGroupGeofences"))
                .executeQuery(GroupGeofence.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkGroupGeofence(long groupId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2393);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2394);QueryBuilder.create(dataSource, getQuery("database.linkGroupGeofence"))
                .setLong("groupId", groupId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkGroupGeofence(long groupId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2395);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2396);QueryBuilder.create(dataSource, getQuery("database.unlinkGroupGeofence"))
                .setLong("groupId", groupId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<DeviceGeofence> getDeviceGeofences() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2397);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2398);return QueryBuilder.create(dataSource, getQuery("database.selectDeviceGeofences"))
                .executeQuery(DeviceGeofence.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkDeviceGeofence(long deviceId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2399);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2400);QueryBuilder.create(dataSource, getQuery("database.linkDeviceGeofence"))
                .setLong("deviceId", deviceId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkDeviceGeofence(long deviceId, long geofenceId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2401);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2402);QueryBuilder.create(dataSource, getQuery("database.unlinkDeviceGeofence"))
                .setLong("deviceId", deviceId)
                .setLong("geofenceId", geofenceId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Notification> getNotifications() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2403);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2404);return QueryBuilder.create(dataSource, getQuery("database.selectNotifications"))
                .executeQuery(Notification.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addNotification(Notification notification) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2405);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2406);notification.setId(QueryBuilder.create(dataSource, getQuery("database.insertNotification"), true)
                .setObject(notification)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateNotification(Notification notification) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2407);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2408);QueryBuilder.create(dataSource, getQuery("database.updateNotification"))
                .setObject(notification)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeNotification(Notification notification) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2409);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2410);QueryBuilder.create(dataSource, getQuery("database.deleteNotification"))
                .setLong("id", notification.getId())
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<AttributeAlias> getAttributeAliases() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2411);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2412);return QueryBuilder.create(dataSource, getQuery("database.selectAttributeAliases"))
                .executeQuery(AttributeAlias.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2413);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2414);attributeAlias.setId(QueryBuilder.create(dataSource, getQuery("database.insertAttributeAlias"), true)
                .setObject(attributeAlias)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateAttributeAlias(AttributeAlias attributeAlias) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2415);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2416);QueryBuilder.create(dataSource, getQuery("database.updateAttributeAlias"))
                .setObject(attributeAlias)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeAttributeAlias(long attributeAliasId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2417);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2418);QueryBuilder.create(dataSource, getQuery("database.deleteAttributeAlias"))
                .setLong("id", attributeAliasId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Statistics> getStatistics(Date from, Date to) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2419);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2420);return QueryBuilder.create(dataSource, getQuery("database.selectStatistics"))
                .setDate("from", from)
                .setDate("to", to)
                .executeQuery(Statistics.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addStatistics(Statistics statistics) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2421);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2422);statistics.setId(QueryBuilder.create(dataSource, getQuery("database.insertStatistics"), true)
                .setObject(statistics)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<Calendar> getCalendars() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2423);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2424);return QueryBuilder.create(dataSource, getQuery("database.selectCalendarsAll"))
                .executeQuery(Calendar.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void addCalendar(Calendar calendar) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2425);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2426);calendar.setId(QueryBuilder.create(dataSource, getQuery("database.insertCalendar"), true)
                .setObject(calendar)
                .executeUpdate());
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void updateCalendar(Calendar calendar) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2427);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2428);QueryBuilder.create(dataSource, getQuery("database.updateCalendar"))
                .setObject(calendar)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void removeCalendar(long calendarId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2429);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2430);QueryBuilder.create(dataSource, getQuery("database.deleteCalendar"))
                .setLong("id", calendarId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<CalendarPermission> getCalendarPermissions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2431);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2432);return QueryBuilder.create(dataSource, getQuery("database.selectCalendarPermissions"))
                .executeQuery(CalendarPermission.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkCalendar(long userId, long calendarId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2433);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2434);QueryBuilder.create(dataSource, getQuery("database.linkCalendar"))
                .setLong("userId", userId)
                .setLong("calendarId", calendarId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkCalendar(long userId, long calendarId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2435);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2436);QueryBuilder.create(dataSource, getQuery("database.unlinkCalendar"))
                .setLong("userId", userId)
                .setLong("calendarId", calendarId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public Collection<UserPermission> getUserPermissions() throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2437);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2438);return QueryBuilder.create(dataSource, getQuery("database.selectUserPermissions"))
                .executeQuery(UserPermission.class);
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void linkUser(long userId, long managedUserId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2439);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2440);QueryBuilder.create(dataSource, getQuery("database.linkUser"))
                .setLong("userId", userId)
                .setLong("managedUserId", managedUserId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}

    public void unlinkUser(long userId, long managedUserId) throws SQLException {try{__CLR4_5_21qg1qglx1dxku8.R.inc(2441);
        __CLR4_5_21qg1qglx1dxku8.R.inc(2442);QueryBuilder.create(dataSource, getQuery("database.unlinkUser"))
                .setLong("userId", userId)
                .setLong("managedUserId", managedUserId)
                .executeUpdate();
    }finally{__CLR4_5_21qg1qglx1dxku8.R.flushNeeded();}}
}
