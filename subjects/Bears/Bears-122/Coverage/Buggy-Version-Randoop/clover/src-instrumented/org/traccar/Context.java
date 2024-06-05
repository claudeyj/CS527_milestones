/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ning.http.client.AsyncHttpClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.eclipse.jetty.util.URIUtil;
import org.traccar.database.AliasesManager;
import org.traccar.database.CalendarManager;
import org.traccar.database.AttributesManager;
import org.traccar.database.BaseObjectManager;
import org.traccar.database.ConnectionManager;
import org.traccar.database.DataManager;
import org.traccar.database.DeviceManager;
import org.traccar.database.DriversManager;
import org.traccar.database.IdentityManager;
import org.traccar.database.MediaManager;
import org.traccar.database.NotificationManager;
import org.traccar.database.PermissionsManager;
import org.traccar.database.GeofenceManager;
import org.traccar.database.GroupsManager;
import org.traccar.database.StatisticsManager;
import org.traccar.database.UsersManager;
import org.traccar.geocoder.BingMapsGeocoder;
import org.traccar.geocoder.FactualGeocoder;
import org.traccar.geocoder.GeocodeFarmGeocoder;
import org.traccar.geocoder.GisgraphyGeocoder;
import org.traccar.geocoder.GoogleGeocoder;
import org.traccar.geocoder.MapQuestGeocoder;
import org.traccar.geocoder.NominatimGeocoder;
import org.traccar.geocoder.OpenCageGeocoder;
import org.traccar.geocoder.Geocoder;
import org.traccar.geolocation.UnwiredGeolocationProvider;
import org.traccar.helper.Log;
import org.traccar.model.Attribute;
import org.traccar.model.BaseModel;
import org.traccar.model.Calendar;
import org.traccar.model.Device;
import org.traccar.model.Driver;
import org.traccar.model.Geofence;
import org.traccar.model.Group;
import org.traccar.model.User;
import org.traccar.geolocation.GoogleGeolocationProvider;
import org.traccar.geolocation.GeolocationProvider;
import org.traccar.geolocation.MozillaGeolocationProvider;
import org.traccar.geolocation.OpenCellIdGeolocationProvider;
import org.traccar.notification.EventForwarder;
import org.traccar.smpp.SmppClient;
import org.traccar.web.WebServer;

@java.lang.SuppressWarnings({"fallthrough"}) public final class Context {public static class __CLR4_5_2ehehlwydydbf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Context() {try{__CLR4_5_2ehehlwydydbf.R.inc(521);
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static Config config;

    public static Config getConfig() {try{__CLR4_5_2ehehlwydydbf.R.inc(522);
        __CLR4_5_2ehehlwydydbf.R.inc(523);return config;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static boolean loggerEnabled;

    public static boolean isLoggerEnabled() {try{__CLR4_5_2ehehlwydydbf.R.inc(524);
        __CLR4_5_2ehehlwydydbf.R.inc(525);return loggerEnabled;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static ObjectMapper objectMapper;

    public static ObjectMapper getObjectMapper() {try{__CLR4_5_2ehehlwydydbf.R.inc(526);
        __CLR4_5_2ehehlwydydbf.R.inc(527);return objectMapper;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static IdentityManager identityManager;

    public static IdentityManager getIdentityManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(528);
        __CLR4_5_2ehehlwydydbf.R.inc(529);return identityManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static DataManager dataManager;

    public static DataManager getDataManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(530);
        __CLR4_5_2ehehlwydydbf.R.inc(531);return dataManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static MediaManager mediaManager;

    public static MediaManager getMediaManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(532);
        __CLR4_5_2ehehlwydydbf.R.inc(533);return mediaManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static UsersManager usersManager;

    public static UsersManager getUsersManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(534);
        __CLR4_5_2ehehlwydydbf.R.inc(535);return usersManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static GroupsManager groupsManager;

    public static GroupsManager getGroupsManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(536);
        __CLR4_5_2ehehlwydydbf.R.inc(537);return groupsManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static DeviceManager deviceManager;

    public static DeviceManager getDeviceManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(538);
        __CLR4_5_2ehehlwydydbf.R.inc(539);return deviceManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static ConnectionManager connectionManager;

    public static ConnectionManager getConnectionManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(540);
        __CLR4_5_2ehehlwydydbf.R.inc(541);return connectionManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static PermissionsManager permissionsManager;

    public static PermissionsManager getPermissionsManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(542);
        __CLR4_5_2ehehlwydydbf.R.inc(543);return permissionsManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static Geocoder geocoder;

    public static Geocoder getGeocoder() {try{__CLR4_5_2ehehlwydydbf.R.inc(544);
        __CLR4_5_2ehehlwydydbf.R.inc(545);return geocoder;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static GeolocationProvider geolocationProvider;

    public static GeolocationProvider getGeolocationProvider() {try{__CLR4_5_2ehehlwydydbf.R.inc(546);
        __CLR4_5_2ehehlwydydbf.R.inc(547);return geolocationProvider;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static WebServer webServer;

    public static WebServer getWebServer() {try{__CLR4_5_2ehehlwydydbf.R.inc(548);
        __CLR4_5_2ehehlwydydbf.R.inc(549);return webServer;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static ServerManager serverManager;

    public static ServerManager getServerManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(550);
        __CLR4_5_2ehehlwydydbf.R.inc(551);return serverManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static GeofenceManager geofenceManager;

    public static GeofenceManager getGeofenceManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(552);
        __CLR4_5_2ehehlwydydbf.R.inc(553);return geofenceManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static CalendarManager calendarManager;

    public static CalendarManager getCalendarManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(554);
        __CLR4_5_2ehehlwydydbf.R.inc(555);return calendarManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static NotificationManager notificationManager;

    public static NotificationManager getNotificationManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(556);
        __CLR4_5_2ehehlwydydbf.R.inc(557);return notificationManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static VelocityEngine velocityEngine;

    public static VelocityEngine getVelocityEngine() {try{__CLR4_5_2ehehlwydydbf.R.inc(558);
        __CLR4_5_2ehehlwydydbf.R.inc(559);return velocityEngine;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static final AsyncHttpClient ASYNC_HTTP_CLIENT = new AsyncHttpClient();

    public static AsyncHttpClient getAsyncHttpClient() {try{__CLR4_5_2ehehlwydydbf.R.inc(560);
        __CLR4_5_2ehehlwydydbf.R.inc(561);return ASYNC_HTTP_CLIENT;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static EventForwarder eventForwarder;

    public static EventForwarder getEventForwarder() {try{__CLR4_5_2ehehlwydydbf.R.inc(562);
        __CLR4_5_2ehehlwydydbf.R.inc(563);return eventForwarder;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static AliasesManager aliasesManager;

    public static AliasesManager getAliasesManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(564);
        __CLR4_5_2ehehlwydydbf.R.inc(565);return aliasesManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static AttributesManager attributesManager;

    public static AttributesManager getAttributesManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(566);
        __CLR4_5_2ehehlwydydbf.R.inc(567);return attributesManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static DriversManager driversManager;

    public static DriversManager getDriversManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(568);
        __CLR4_5_2ehehlwydydbf.R.inc(569);return driversManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static StatisticsManager statisticsManager;

    public static StatisticsManager getStatisticsManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(570);
        __CLR4_5_2ehehlwydydbf.R.inc(571);return statisticsManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    private static SmppClient smppClient;

    public static SmppClient getSmppManager() {try{__CLR4_5_2ehehlwydydbf.R.inc(572);
        __CLR4_5_2ehehlwydydbf.R.inc(573);return smppClient;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    public static void init(String[] arguments) throws Exception {try{__CLR4_5_2ehehlwydydbf.R.inc(574);

        __CLR4_5_2ehehlwydydbf.R.inc(575);config = new Config();
        __CLR4_5_2ehehlwydydbf.R.inc(576);if ((((arguments.length <= 0)&&(__CLR4_5_2ehehlwydydbf.R.iget(577)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(578)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(579);throw new RuntimeException("Configuration file is not provided");
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(580);config.load(arguments[0]);

        __CLR4_5_2ehehlwydydbf.R.inc(581);loggerEnabled = config.getBoolean("logger.enable");
        __CLR4_5_2ehehlwydydbf.R.inc(582);if ((((loggerEnabled)&&(__CLR4_5_2ehehlwydydbf.R.iget(583)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(584)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(585);Log.setupLogger(config);
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(586);objectMapper = new ObjectMapper();
        __CLR4_5_2ehehlwydydbf.R.inc(587);objectMapper.setConfig(
                objectMapper.getSerializationConfig().without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        __CLR4_5_2ehehlwydydbf.R.inc(588);if ((((config.hasKey("database.url"))&&(__CLR4_5_2ehehlwydydbf.R.iget(589)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(590)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(591);dataManager = new DataManager(config);
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(592);if ((((config.hasKey("media.path"))&&(__CLR4_5_2ehehlwydydbf.R.iget(593)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(594)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(595);mediaManager = new MediaManager(config);
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(596);if ((((dataManager != null)&&(__CLR4_5_2ehehlwydydbf.R.iget(597)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(598)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(599);usersManager = new UsersManager(dataManager);
            __CLR4_5_2ehehlwydydbf.R.inc(600);groupsManager = new GroupsManager(dataManager);
            __CLR4_5_2ehehlwydydbf.R.inc(601);deviceManager = new DeviceManager(dataManager);
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(602);identityManager = deviceManager;

        __CLR4_5_2ehehlwydydbf.R.inc(603);if ((((config.getBoolean("geocoder.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(604)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(605)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(606);String type = config.getString("geocoder.type", "google");
            __CLR4_5_2ehehlwydydbf.R.inc(607);String url = config.getString("geocoder.url");
            __CLR4_5_2ehehlwydydbf.R.inc(608);String key = config.getString("geocoder.key");
            __CLR4_5_2ehehlwydydbf.R.inc(609);String language = config.getString("geocoder.language");

            __CLR4_5_2ehehlwydydbf.R.inc(610);int cacheSize = config.getInteger("geocoder.cacheSize");
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ehehlwydydbf.R.inc(611);switch (type) {
                case "nominatim":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(612);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(613);geocoder = new NominatimGeocoder(url, key, language, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(614);break;
                case "gisgraphy":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(615);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(616);geocoder = new GisgraphyGeocoder(url, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(617);break;
                case "mapquest":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(618);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(619);geocoder = new MapQuestGeocoder(url, key, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(620);break;
                case "opencage":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(621);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(622);geocoder = new OpenCageGeocoder(url, key, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(623);break;
                case "bingmaps":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(624);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(625);geocoder = new BingMapsGeocoder(url, key, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(626);break;
                case "factual":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(627);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(628);geocoder = new FactualGeocoder(url, key, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(629);break;
                case "geocodefarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(630);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(631);geocoder = new GeocodeFarmGeocoder(key, language, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(632);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ehehlwydydbf.R.inc(633);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(634);geocoder = new GoogleGeocoder(key, language, cacheSize);
                    __CLR4_5_2ehehlwydydbf.R.inc(635);break;
            }
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(636);if ((((config.getBoolean("geolocation.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(637)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(638)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(639);String type = config.getString("geolocation.type", "mozilla");
            __CLR4_5_2ehehlwydydbf.R.inc(640);String url = config.getString("geolocation.url");
            __CLR4_5_2ehehlwydydbf.R.inc(641);String key = config.getString("geolocation.key");

            boolean __CLB4_5_2_bool1=false;__CLR4_5_2ehehlwydydbf.R.inc(642);switch (type) {
                case "google":if (!__CLB4_5_2_bool1) {__CLR4_5_2ehehlwydydbf.R.inc(643);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(644);geolocationProvider = new GoogleGeolocationProvider(key);
                    __CLR4_5_2ehehlwydydbf.R.inc(645);break;
                case "opencellid":if (!__CLB4_5_2_bool1) {__CLR4_5_2ehehlwydydbf.R.inc(646);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(647);geolocationProvider = new OpenCellIdGeolocationProvider(key);
                    __CLR4_5_2ehehlwydydbf.R.inc(648);break;
                case "unwired":if (!__CLB4_5_2_bool1) {__CLR4_5_2ehehlwydydbf.R.inc(649);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(650);geolocationProvider = new UnwiredGeolocationProvider(url, key);
                    __CLR4_5_2ehehlwydydbf.R.inc(651);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2ehehlwydydbf.R.inc(652);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ehehlwydydbf.R.inc(653);geolocationProvider = new MozillaGeolocationProvider(key);
                    __CLR4_5_2ehehlwydydbf.R.inc(654);break;
            }
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(655);if ((((config.getBoolean("web.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(656)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(657)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(658);webServer = new WebServer(config, dataManager.getDataSource());
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(659);permissionsManager = new PermissionsManager(dataManager, usersManager);

        __CLR4_5_2ehehlwydydbf.R.inc(660);connectionManager = new ConnectionManager();

        __CLR4_5_2ehehlwydydbf.R.inc(661);if ((((config.getBoolean("event.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(662)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(663)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(664);geofenceManager = new GeofenceManager(dataManager);
            __CLR4_5_2ehehlwydydbf.R.inc(665);calendarManager = new CalendarManager(dataManager);
            __CLR4_5_2ehehlwydydbf.R.inc(666);notificationManager = new NotificationManager(dataManager);
            __CLR4_5_2ehehlwydydbf.R.inc(667);Properties velocityProperties = new Properties();
            __CLR4_5_2ehehlwydydbf.R.inc(668);velocityProperties.setProperty("file.resource.loader.path",
                    Context.getConfig().getString("templates.rootPath", "templates") + "/");
            __CLR4_5_2ehehlwydydbf.R.inc(669);velocityProperties.setProperty("runtime.log.logsystem.class",
                    "org.apache.velocity.runtime.log.NullLogChute");

            __CLR4_5_2ehehlwydydbf.R.inc(670);String address;
            __CLR4_5_2ehehlwydydbf.R.inc(671);try {
                __CLR4_5_2ehehlwydydbf.R.inc(672);address = config.getString("web.address", InetAddress.getLocalHost().getHostAddress());
            } catch (UnknownHostException e) {
                __CLR4_5_2ehehlwydydbf.R.inc(673);address = "localhost";
            }

            __CLR4_5_2ehehlwydydbf.R.inc(674);String webUrl = URIUtil.newURI("http", address, config.getInteger("web.port", 8082), "", "");
            __CLR4_5_2ehehlwydydbf.R.inc(675);webUrl = Context.getConfig().getString("web.url", webUrl);
            __CLR4_5_2ehehlwydydbf.R.inc(676);velocityProperties.setProperty("web.url", webUrl);

            __CLR4_5_2ehehlwydydbf.R.inc(677);velocityEngine = new VelocityEngine();
            __CLR4_5_2ehehlwydydbf.R.inc(678);velocityEngine.init(velocityProperties);
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(679);serverManager = new ServerManager();

        __CLR4_5_2ehehlwydydbf.R.inc(680);if ((((config.getBoolean("event.forward.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(681)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(682)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(683);eventForwarder = new EventForwarder();
        }

        }__CLR4_5_2ehehlwydydbf.R.inc(684);aliasesManager = new AliasesManager(dataManager);

        __CLR4_5_2ehehlwydydbf.R.inc(685);attributesManager = new AttributesManager(dataManager);

        __CLR4_5_2ehehlwydydbf.R.inc(686);driversManager = new DriversManager(dataManager);

        __CLR4_5_2ehehlwydydbf.R.inc(687);statisticsManager = new StatisticsManager();

        __CLR4_5_2ehehlwydydbf.R.inc(688);if ((((config.getBoolean("sms.smpp.enable"))&&(__CLR4_5_2ehehlwydydbf.R.iget(689)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(690)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(691);smppClient = new SmppClient();
        }

    }}finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    public static void init(IdentityManager testIdentityManager) {try{__CLR4_5_2ehehlwydydbf.R.inc(692);
        __CLR4_5_2ehehlwydydbf.R.inc(693);config = new Config();
        __CLR4_5_2ehehlwydydbf.R.inc(694);objectMapper = new ObjectMapper();
        __CLR4_5_2ehehlwydydbf.R.inc(695);identityManager = testIdentityManager;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

    public static <T extends BaseModel> BaseObjectManager<T> getManager(Class<T> clazz) {try{__CLR4_5_2ehehlwydydbf.R.inc(696);
        __CLR4_5_2ehehlwydydbf.R.inc(697);if ((((clazz.equals(Device.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(698)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(699)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(700);return (BaseObjectManager<T>) deviceManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(701);if ((((clazz.equals(Group.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(702)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(703)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(704);return (BaseObjectManager<T>) groupsManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(705);if ((((clazz.equals(User.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(706)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(707)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(708);return (BaseObjectManager<T>) usersManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(709);if ((((clazz.equals(Calendar.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(710)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(711)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(712);return (BaseObjectManager<T>) calendarManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(713);if ((((clazz.equals(Attribute.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(714)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(715)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(716);return (BaseObjectManager<T>) attributesManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(717);if ((((clazz.equals(Geofence.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(718)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(719)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(720);return (BaseObjectManager<T>) geofenceManager;
        } }else {__CLR4_5_2ehehlwydydbf.R.inc(721);if ((((clazz.equals(Driver.class))&&(__CLR4_5_2ehehlwydydbf.R.iget(722)!=0|true))||(__CLR4_5_2ehehlwydydbf.R.iget(723)==0&false))) {{
            __CLR4_5_2ehehlwydydbf.R.inc(724);return (BaseObjectManager<T>) driversManager;
        }
        }}}}}}}__CLR4_5_2ehehlwydydbf.R.inc(725);return null;
    }finally{__CLR4_5_2ehehlwydydbf.R.flushNeeded();}}

}
