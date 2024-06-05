/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.eclipse.jetty.util.URIUtil;
import org.traccar.database.AliasesManager;
import org.traccar.database.CalendarManager;
import org.traccar.database.ConnectionManager;
import org.traccar.database.DataManager;
import org.traccar.database.DeviceManager;
import org.traccar.database.IdentityManager;
import org.traccar.database.NotificationManager;
import org.traccar.database.PermissionsManager;
import org.traccar.database.GeofenceManager;
import org.traccar.database.StatisticsManager;
import org.traccar.geocoder.BingMapsGeocoder;
import org.traccar.geocoder.FactualGeocoder;
import org.traccar.geocoder.GeocodeFarmGeocoder;
import org.traccar.geocoder.GisgraphyGeocoder;
import org.traccar.geocoder.GoogleGeocoder;
import org.traccar.geocoder.MapQuestGeocoder;
import org.traccar.geocoder.NominatimGeocoder;
import org.traccar.geocoder.OpenCageGeocoder;
import org.traccar.geocoder.Geocoder;
import org.traccar.helper.Log;
import org.traccar.geolocation.GoogleGeolocationProvider;
import org.traccar.geolocation.GeolocationProvider;
import org.traccar.geolocation.MozillaGeolocationProvider;
import org.traccar.geolocation.OpenCellIdGeolocationProvider;
import org.traccar.notification.EventForwarder;
import org.traccar.web.WebServer;

@java.lang.SuppressWarnings({"fallthrough"}) public final class Context {public static class __CLR4_5_2djdjlx1dz5r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Context() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(487);
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static Config config;

    public static Config getConfig() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(488);
        __CLR4_5_2djdjlx1dz5r7.R.inc(489);return config;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static boolean loggerEnabled;

    public static boolean isLoggerEnabled() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(490);
        __CLR4_5_2djdjlx1dz5r7.R.inc(491);return loggerEnabled;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static ObjectMapper objectMapper;

    public static ObjectMapper getObjectMapper() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(492);
        __CLR4_5_2djdjlx1dz5r7.R.inc(493);return objectMapper;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static IdentityManager identityManager;

    public static IdentityManager getIdentityManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(494);
        __CLR4_5_2djdjlx1dz5r7.R.inc(495);return identityManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static DataManager dataManager;

    public static DataManager getDataManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(496);
        __CLR4_5_2djdjlx1dz5r7.R.inc(497);return dataManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static DeviceManager deviceManager;

    public static DeviceManager getDeviceManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(498);
        __CLR4_5_2djdjlx1dz5r7.R.inc(499);return deviceManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static ConnectionManager connectionManager;

    public static ConnectionManager getConnectionManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(500);
        __CLR4_5_2djdjlx1dz5r7.R.inc(501);return connectionManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static PermissionsManager permissionsManager;

    public static PermissionsManager getPermissionsManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(502);
        __CLR4_5_2djdjlx1dz5r7.R.inc(503);return permissionsManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static Geocoder geocoder;

    public static Geocoder getGeocoder() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(504);
        __CLR4_5_2djdjlx1dz5r7.R.inc(505);return geocoder;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static GeolocationProvider geolocationProvider;

    public static GeolocationProvider getGeolocationProvider() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(506);
        __CLR4_5_2djdjlx1dz5r7.R.inc(507);return geolocationProvider;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static WebServer webServer;

    public static WebServer getWebServer() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(508);
        __CLR4_5_2djdjlx1dz5r7.R.inc(509);return webServer;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static ServerManager serverManager;

    public static ServerManager getServerManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(510);
        __CLR4_5_2djdjlx1dz5r7.R.inc(511);return serverManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static GeofenceManager geofenceManager;

    public static GeofenceManager getGeofenceManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(512);
        __CLR4_5_2djdjlx1dz5r7.R.inc(513);return geofenceManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static CalendarManager calendarManager;

    public static CalendarManager getCalendarManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(514);
        __CLR4_5_2djdjlx1dz5r7.R.inc(515);return calendarManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static NotificationManager notificationManager;

    public static NotificationManager getNotificationManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(516);
        __CLR4_5_2djdjlx1dz5r7.R.inc(517);return notificationManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static VelocityEngine velocityEngine;

    public static VelocityEngine getVelocityEngine() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(518);
        __CLR4_5_2djdjlx1dz5r7.R.inc(519);return velocityEngine;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static final AsyncHttpClient ASYNC_HTTP_CLIENT = new AsyncHttpClient();

    public static AsyncHttpClient getAsyncHttpClient() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(520);
        __CLR4_5_2djdjlx1dz5r7.R.inc(521);return ASYNC_HTTP_CLIENT;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static EventForwarder eventForwarder;

    public static EventForwarder getEventForwarder() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(522);
        __CLR4_5_2djdjlx1dz5r7.R.inc(523);return eventForwarder;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static AliasesManager aliasesManager;

    public static AliasesManager getAliasesManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(524);
        __CLR4_5_2djdjlx1dz5r7.R.inc(525);return aliasesManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    private static StatisticsManager statisticsManager;

    public static StatisticsManager getStatisticsManager() {try{__CLR4_5_2djdjlx1dz5r7.R.inc(526);
        __CLR4_5_2djdjlx1dz5r7.R.inc(527);return statisticsManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    public static void init(String[] arguments) throws Exception {try{__CLR4_5_2djdjlx1dz5r7.R.inc(528);

        __CLR4_5_2djdjlx1dz5r7.R.inc(529);config = new Config();
        __CLR4_5_2djdjlx1dz5r7.R.inc(530);if ((((arguments.length <= 0)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(531)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(532)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(533);throw new RuntimeException("Configuration file is not provided");
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(534);config.load(arguments[0]);

        __CLR4_5_2djdjlx1dz5r7.R.inc(535);loggerEnabled = config.getBoolean("logger.enable");
        __CLR4_5_2djdjlx1dz5r7.R.inc(536);if ((((loggerEnabled)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(537)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(538)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(539);Log.setupLogger(config);
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(540);objectMapper = new ObjectMapper();
        __CLR4_5_2djdjlx1dz5r7.R.inc(541);objectMapper.setConfig(
                objectMapper.getSerializationConfig().without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        __CLR4_5_2djdjlx1dz5r7.R.inc(542);if ((((config.hasKey("database.url"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(543)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(544)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(545);dataManager = new DataManager(config);
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(546);if ((((dataManager != null)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(547)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(548)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(549);deviceManager = new DeviceManager(dataManager);
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(550);identityManager = deviceManager;

        __CLR4_5_2djdjlx1dz5r7.R.inc(551);if ((((config.getBoolean("geocoder.enable"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(552)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(553)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(554);String type = config.getString("geocoder.type", "google");
            __CLR4_5_2djdjlx1dz5r7.R.inc(555);String url = config.getString("geocoder.url");
            __CLR4_5_2djdjlx1dz5r7.R.inc(556);String key = config.getString("geocoder.key");

            __CLR4_5_2djdjlx1dz5r7.R.inc(557);int cacheSize = config.getInteger("geocoder.cacheSize");
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2djdjlx1dz5r7.R.inc(558);switch (type) {
                case "nominatim":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(559);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(560);if ((((key != null)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(561)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(562)==0&false))) {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(563);geocoder = new NominatimGeocoder(url, key, cacheSize);
                    } }else {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(564);geocoder = new NominatimGeocoder(url, cacheSize);
                    }
                    }__CLR4_5_2djdjlx1dz5r7.R.inc(565);break;
                case "gisgraphy":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(566);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(567);geocoder = new GisgraphyGeocoder(url, cacheSize);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(568);break;
                case "mapquest":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(569);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(570);geocoder = new MapQuestGeocoder(url, key, cacheSize);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(571);break;
                case "opencage":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(572);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(573);geocoder = new OpenCageGeocoder(url, key, cacheSize);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(574);break;
                case "bingmaps":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(575);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(576);geocoder = new BingMapsGeocoder(url, key, cacheSize);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(577);break;
                case "factual":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(578);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(579);geocoder = new FactualGeocoder(url, key, cacheSize);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(580);break;
                case "geocodefarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(581);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(582);if ((((key != null)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(583)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(584)==0&false))) {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(585);geocoder = new GeocodeFarmGeocoder(key, cacheSize);
                    } }else {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(586);geocoder = new GeocodeFarmGeocoder(cacheSize);
                    }
                }default:if (!__CLB4_5_2_bool0) {__CLR4_5_2djdjlx1dz5r7.R.inc(587);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(588);if ((((key != null)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(589)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(590)==0&false))) {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(591);geocoder = new GoogleGeocoder(key, cacheSize);
                    } }else {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(592);geocoder = new GoogleGeocoder(cacheSize);
                    }
                    }__CLR4_5_2djdjlx1dz5r7.R.inc(593);break;
            }
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(594);if ((((config.getBoolean("geolocation.enable"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(595)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(596)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(597);String type = config.getString("geolocation.type", "mozilla");
            __CLR4_5_2djdjlx1dz5r7.R.inc(598);String key = config.getString("geolocation.key");

            boolean __CLB4_5_2_bool1=false;__CLR4_5_2djdjlx1dz5r7.R.inc(599);switch (type) {
                case "google":if (!__CLB4_5_2_bool1) {__CLR4_5_2djdjlx1dz5r7.R.inc(600);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(601);geolocationProvider = new GoogleGeolocationProvider(key);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(602);break;
                case "opencellid":if (!__CLB4_5_2_bool1) {__CLR4_5_2djdjlx1dz5r7.R.inc(603);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(604);geolocationProvider = new OpenCellIdGeolocationProvider(key);
                    __CLR4_5_2djdjlx1dz5r7.R.inc(605);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2djdjlx1dz5r7.R.inc(606);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2djdjlx1dz5r7.R.inc(607);if ((((key != null)&&(__CLR4_5_2djdjlx1dz5r7.R.iget(608)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(609)==0&false))) {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(610);geolocationProvider = new MozillaGeolocationProvider(key);
                    } }else {{
                        __CLR4_5_2djdjlx1dz5r7.R.inc(611);geolocationProvider = new MozillaGeolocationProvider();
                    }
                    }__CLR4_5_2djdjlx1dz5r7.R.inc(612);break;
            }
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(613);if ((((config.getBoolean("web.enable"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(614)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(615)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(616);webServer = new WebServer(config, dataManager.getDataSource());
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(617);permissionsManager = new PermissionsManager(dataManager);

        __CLR4_5_2djdjlx1dz5r7.R.inc(618);connectionManager = new ConnectionManager();

        __CLR4_5_2djdjlx1dz5r7.R.inc(619);if ((((config.getBoolean("event.geofenceHandler"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(620)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(621)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(622);geofenceManager = new GeofenceManager(dataManager);
            __CLR4_5_2djdjlx1dz5r7.R.inc(623);calendarManager = new CalendarManager(dataManager);
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(624);if ((((config.getBoolean("event.enable"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(625)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(626)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(627);notificationManager = new NotificationManager(dataManager);
            __CLR4_5_2djdjlx1dz5r7.R.inc(628);Properties velocityProperties = new Properties();
            __CLR4_5_2djdjlx1dz5r7.R.inc(629);velocityProperties.setProperty("file.resource.loader.path",
                    Context.getConfig().getString("mail.templatesPath", "templates/mail") + "/");
            __CLR4_5_2djdjlx1dz5r7.R.inc(630);velocityProperties.setProperty("runtime.log.logsystem.class",
                    "org.apache.velocity.runtime.log.NullLogChute");

            __CLR4_5_2djdjlx1dz5r7.R.inc(631);String address = config.getString("web.address", InetAddress.getLocalHost().getHostAddress());
            __CLR4_5_2djdjlx1dz5r7.R.inc(632);int port = config.getInteger("web.port", 8082);
            __CLR4_5_2djdjlx1dz5r7.R.inc(633);String webUrl = URIUtil.newURI("http", address, port, "", "");
            __CLR4_5_2djdjlx1dz5r7.R.inc(634);webUrl = Context.getConfig().getString("web.url", webUrl);
            __CLR4_5_2djdjlx1dz5r7.R.inc(635);velocityProperties.setProperty("web.url", webUrl);

            __CLR4_5_2djdjlx1dz5r7.R.inc(636);velocityEngine = new VelocityEngine();
            __CLR4_5_2djdjlx1dz5r7.R.inc(637);velocityEngine.init(velocityProperties);
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(638);serverManager = new ServerManager();

        __CLR4_5_2djdjlx1dz5r7.R.inc(639);if ((((config.getBoolean("event.forward.enable"))&&(__CLR4_5_2djdjlx1dz5r7.R.iget(640)!=0|true))||(__CLR4_5_2djdjlx1dz5r7.R.iget(641)==0&false))) {{
            __CLR4_5_2djdjlx1dz5r7.R.inc(642);eventForwarder = new EventForwarder();
        }

        }__CLR4_5_2djdjlx1dz5r7.R.inc(643);aliasesManager = new AliasesManager(dataManager);

        __CLR4_5_2djdjlx1dz5r7.R.inc(644);statisticsManager = new StatisticsManager();

    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

    public static void init(IdentityManager testIdentityManager) {try{__CLR4_5_2djdjlx1dz5r7.R.inc(645);
        __CLR4_5_2djdjlx1dz5r7.R.inc(646);config = new Config();
        __CLR4_5_2djdjlx1dz5r7.R.inc(647);objectMapper = new ObjectMapper();
        __CLR4_5_2djdjlx1dz5r7.R.inc(648);identityManager = testIdentityManager;
    }finally{__CLR4_5_2djdjlx1dz5r7.R.flushNeeded();}}

}
