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
package org.traccar;

import com.ning.http.client.AsyncHttpClient;
import org.traccar.database.ConnectionManager;
import org.traccar.database.DataManager;
import org.traccar.database.IdentityManager;
import org.traccar.database.PermissionsManager;
import org.traccar.geocode.BingMapsReverseGeocoder;
import org.traccar.geocode.FactualReverseGeocoder;
import org.traccar.geocode.GisgraphyReverseGeocoder;
import org.traccar.geocode.GoogleReverseGeocoder;
import org.traccar.geocode.MapQuestReverseGeocoder;
import org.traccar.geocode.NominatimReverseGeocoder;
import org.traccar.geocode.OpenCageReverseGeocoder;
import org.traccar.geocode.ReverseGeocoder;
import org.traccar.helper.Log;
import org.traccar.web.WebServer;

@java.lang.SuppressWarnings({"fallthrough"}) public class Context {public static class __CLR4_5_25151lx1e40px{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static Config config;
    
    public static Config getConfig() {try{__CLR4_5_25151lx1e40px.R.inc(181);
        __CLR4_5_25151lx1e40px.R.inc(182);return config;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static boolean loggerEnabled;

    public static boolean isLoggerEnabled() {try{__CLR4_5_25151lx1e40px.R.inc(183);
        __CLR4_5_25151lx1e40px.R.inc(184);return loggerEnabled;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}
    
    private static IdentityManager identityManager;
    
    public static IdentityManager getIdentityManager() {try{__CLR4_5_25151lx1e40px.R.inc(185);
        __CLR4_5_25151lx1e40px.R.inc(186);return identityManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static DataManager dataManager;

    public static DataManager getDataManager() {try{__CLR4_5_25151lx1e40px.R.inc(187);
        __CLR4_5_25151lx1e40px.R.inc(188);return dataManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static ConnectionManager connectionManager;

    public static ConnectionManager getConnectionManager() {try{__CLR4_5_25151lx1e40px.R.inc(189);
        __CLR4_5_25151lx1e40px.R.inc(190);return connectionManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static PermissionsManager permissionsManager;

    public static PermissionsManager getPermissionsManager() {try{__CLR4_5_25151lx1e40px.R.inc(191);
        __CLR4_5_25151lx1e40px.R.inc(192);return permissionsManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static ReverseGeocoder reverseGeocoder;

    public static ReverseGeocoder getReverseGeocoder() {try{__CLR4_5_25151lx1e40px.R.inc(193);
        __CLR4_5_25151lx1e40px.R.inc(194);return reverseGeocoder;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static WebServer webServer;

    public static WebServer getWebServer() {try{__CLR4_5_25151lx1e40px.R.inc(195);
        __CLR4_5_25151lx1e40px.R.inc(196);return webServer;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    private static ServerManager serverManager;

    public static ServerManager getServerManager() {try{__CLR4_5_25151lx1e40px.R.inc(197);
        __CLR4_5_25151lx1e40px.R.inc(198);return serverManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}
    
    private static final AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
    
    public static AsyncHttpClient getAsyncHttpClient() {try{__CLR4_5_25151lx1e40px.R.inc(199);
        __CLR4_5_25151lx1e40px.R.inc(200);return asyncHttpClient;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    public static void init(String[] arguments) throws Exception {try{__CLR4_5_25151lx1e40px.R.inc(201);

        __CLR4_5_25151lx1e40px.R.inc(202);config = new Config();
        __CLR4_5_25151lx1e40px.R.inc(203);if ((((arguments.length > 0)&&(__CLR4_5_25151lx1e40px.R.iget(204)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(205)==0&false))) {{
            __CLR4_5_25151lx1e40px.R.inc(206);config.load(arguments[0]);
        }

        }__CLR4_5_25151lx1e40px.R.inc(207);loggerEnabled = config.getBoolean("logger.enable");
        __CLR4_5_25151lx1e40px.R.inc(208);if ((((loggerEnabled)&&(__CLR4_5_25151lx1e40px.R.iget(209)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(210)==0&false))) {{
            __CLR4_5_25151lx1e40px.R.inc(211);Log.setupLogger(config);
        }

        }__CLR4_5_25151lx1e40px.R.inc(212);if ((((config.hasKey("database.url"))&&(__CLR4_5_25151lx1e40px.R.iget(213)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(214)==0&false))) {{
            __CLR4_5_25151lx1e40px.R.inc(215);dataManager = new DataManager(config);
        }
        }__CLR4_5_25151lx1e40px.R.inc(216);identityManager = dataManager;

        __CLR4_5_25151lx1e40px.R.inc(217);if ((((config.getBoolean("geocoder.enable"))&&(__CLR4_5_25151lx1e40px.R.iget(218)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(219)==0&false))) {{
            __CLR4_5_25151lx1e40px.R.inc(220);String type = config.getString("geocoder.type", "google");
            __CLR4_5_25151lx1e40px.R.inc(221);String url = config.getString("geocoder.url");
            __CLR4_5_25151lx1e40px.R.inc(222);String key = config.getString("geocoder.key");
            
            __CLR4_5_25151lx1e40px.R.inc(223);int cacheSize = config.getInteger("geocoder.cacheSize");
            boolean __CLB4_5_2_bool0=false;__CLR4_5_25151lx1e40px.R.inc(224);switch (type) {
                case "google":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(225);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(226);reverseGeocoder = new GoogleReverseGeocoder(cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(227);break;
                case "nominatim":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(228);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(229);reverseGeocoder = new NominatimReverseGeocoder(url, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(230);break;
                case "gisgraphy":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(231);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(232);reverseGeocoder = new GisgraphyReverseGeocoder(url, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(233);break;
                case "mapquest":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(234);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(235);reverseGeocoder = new MapQuestReverseGeocoder(url, key, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(236);break;
                case "opencage":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(237);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(238);reverseGeocoder = new OpenCageReverseGeocoder(url, key, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(239);break;
                case "bingmaps":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(240);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(241);reverseGeocoder = new BingMapsReverseGeocoder(url, key, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(242);break;
                case "factual":if (!__CLB4_5_2_bool0) {__CLR4_5_25151lx1e40px.R.inc(243);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25151lx1e40px.R.inc(244);reverseGeocoder = new FactualReverseGeocoder(url, key, cacheSize);
                    __CLR4_5_25151lx1e40px.R.inc(245);break;
            }
        }

        }__CLR4_5_25151lx1e40px.R.inc(246);if ((((config.getBoolean("web.enable"))&&(__CLR4_5_25151lx1e40px.R.iget(247)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(248)==0&false))) {{
            __CLR4_5_25151lx1e40px.R.inc(249);if ((((config.getString("web.type", "new").equals("new") || config.getString("web.type", "new").equals("api"))&&(__CLR4_5_25151lx1e40px.R.iget(250)!=0|true))||(__CLR4_5_25151lx1e40px.R.iget(251)==0&false))) {{
                __CLR4_5_25151lx1e40px.R.inc(252);permissionsManager = new PermissionsManager(dataManager);
            }
            }__CLR4_5_25151lx1e40px.R.inc(253);webServer = new WebServer(config, dataManager.getDataSource());
        }

        }__CLR4_5_25151lx1e40px.R.inc(254);connectionManager = new ConnectionManager(dataManager);

        __CLR4_5_25151lx1e40px.R.inc(255);serverManager = new ServerManager();
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

    public static void init(IdentityManager testIdentityManager) {try{__CLR4_5_25151lx1e40px.R.inc(256);
        __CLR4_5_25151lx1e40px.R.inc(257);config = new Config();
        __CLR4_5_25151lx1e40px.R.inc(258);connectionManager = new ConnectionManager(null);
        __CLR4_5_25151lx1e40px.R.inc(259);identityManager = testIdentityManager;
    }finally{__CLR4_5_25151lx1e40px.R.flushNeeded();}}

}
