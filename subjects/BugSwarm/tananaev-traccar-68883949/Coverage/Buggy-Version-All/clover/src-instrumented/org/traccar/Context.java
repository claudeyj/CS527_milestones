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

import java.io.FileInputStream;
import java.util.Properties;
import org.traccar.database.ConnectionManager;
import org.traccar.database.DataManager;
import org.traccar.database.PermissionsManager;
import org.traccar.geocode.GisgraphyReverseGeocoder;
import org.traccar.geocode.GoogleReverseGeocoder;
import org.traccar.geocode.NominatimReverseGeocoder;
import org.traccar.geocode.ReverseGeocoder;
import org.traccar.helper.Log;
import org.traccar.http.WebServer;

public class Context {public static class __CLR4_5_23q3qlx1dllbc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Properties properties;

    public static Properties getProps() {try{__CLR4_5_23q3qlx1dllbc.R.inc(134);
        __CLR4_5_23q3qlx1dllbc.R.inc(135);return properties;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static boolean loggerEnabled;

    public static boolean isLoggerEnabled() {try{__CLR4_5_23q3qlx1dllbc.R.inc(136);
        __CLR4_5_23q3qlx1dllbc.R.inc(137);return loggerEnabled;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static DataManager dataManager;

    public static DataManager getDataManager() {try{__CLR4_5_23q3qlx1dllbc.R.inc(138);
        __CLR4_5_23q3qlx1dllbc.R.inc(139);return dataManager;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static ConnectionManager connectionManager;

    public static ConnectionManager getConnectionManager() {try{__CLR4_5_23q3qlx1dllbc.R.inc(140);
        __CLR4_5_23q3qlx1dllbc.R.inc(141);return connectionManager;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static PermissionsManager permissionsManager;

    public static PermissionsManager getPermissionsManager() {try{__CLR4_5_23q3qlx1dllbc.R.inc(142);
        __CLR4_5_23q3qlx1dllbc.R.inc(143);return permissionsManager;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static ReverseGeocoder reverseGeocoder;

    public static ReverseGeocoder getReverseGeocoder() {try{__CLR4_5_23q3qlx1dllbc.R.inc(144);
        __CLR4_5_23q3qlx1dllbc.R.inc(145);return reverseGeocoder;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static WebServer webServer;

    public static WebServer getWebServer() {try{__CLR4_5_23q3qlx1dllbc.R.inc(146);
        __CLR4_5_23q3qlx1dllbc.R.inc(147);return webServer;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    private static ServerManager serverManager;

    public static ServerManager getServerManager() {try{__CLR4_5_23q3qlx1dllbc.R.inc(148);
        __CLR4_5_23q3qlx1dllbc.R.inc(149);return serverManager;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    public static void init(String[] arguments) throws Exception {try{__CLR4_5_23q3qlx1dllbc.R.inc(150);

        __CLR4_5_23q3qlx1dllbc.R.inc(151);properties = new Properties();
        __CLR4_5_23q3qlx1dllbc.R.inc(152);if ((((arguments.length > 0)&&(__CLR4_5_23q3qlx1dllbc.R.iget(153)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(154)==0&false))) {{
            __CLR4_5_23q3qlx1dllbc.R.inc(155);properties.loadFromXML(new FileInputStream(arguments[0]));
        }

        }__CLR4_5_23q3qlx1dllbc.R.inc(156);loggerEnabled = Boolean.valueOf(properties.getProperty("logger.enable"));
        __CLR4_5_23q3qlx1dllbc.R.inc(157);if ((((loggerEnabled)&&(__CLR4_5_23q3qlx1dllbc.R.iget(158)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(159)==0&false))) {{
            __CLR4_5_23q3qlx1dllbc.R.inc(160);Log.setupLogger(properties);
        }

        }__CLR4_5_23q3qlx1dllbc.R.inc(161);dataManager = new DataManager(properties);
        __CLR4_5_23q3qlx1dllbc.R.inc(162);connectionManager = new ConnectionManager();
        __CLR4_5_23q3qlx1dllbc.R.inc(163);if ((((!Boolean.valueOf(properties.getProperty("web.old")))&&(__CLR4_5_23q3qlx1dllbc.R.iget(164)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(165)==0&false))) {{
            __CLR4_5_23q3qlx1dllbc.R.inc(166);permissionsManager = new PermissionsManager();
        }

        }__CLR4_5_23q3qlx1dllbc.R.inc(167);if ((((Boolean.parseBoolean(properties.getProperty("geocoder.enable")))&&(__CLR4_5_23q3qlx1dllbc.R.iget(168)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(169)==0&false))) {{
            __CLR4_5_23q3qlx1dllbc.R.inc(170);String type = properties.getProperty("geocoder.type");
            __CLR4_5_23q3qlx1dllbc.R.inc(171);if ((((type != null && type.equals("nominatim"))&&(__CLR4_5_23q3qlx1dllbc.R.iget(172)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(173)==0&false))) {{
                __CLR4_5_23q3qlx1dllbc.R.inc(174);reverseGeocoder = new NominatimReverseGeocoder(properties.getProperty("geocoder.url"));
            } }else {__CLR4_5_23q3qlx1dllbc.R.inc(175);if ((((type != null && type.equals("gisgraphy"))&&(__CLR4_5_23q3qlx1dllbc.R.iget(176)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(177)==0&false))) {{
                __CLR4_5_23q3qlx1dllbc.R.inc(178);reverseGeocoder = new GisgraphyReverseGeocoder(properties.getProperty("geocoder.url"));
            } }else {{
                __CLR4_5_23q3qlx1dllbc.R.inc(179);reverseGeocoder = new GoogleReverseGeocoder();
            }
        }}}

        }__CLR4_5_23q3qlx1dllbc.R.inc(180);if ((((Boolean.valueOf(properties.getProperty("web.enable")))&&(__CLR4_5_23q3qlx1dllbc.R.iget(181)!=0|true))||(__CLR4_5_23q3qlx1dllbc.R.iget(182)==0&false))) {{
            __CLR4_5_23q3qlx1dllbc.R.inc(183);webServer = new WebServer();
        }

        }__CLR4_5_23q3qlx1dllbc.R.inc(184);serverManager = new ServerManager();

        __CLR4_5_23q3qlx1dllbc.R.inc(185);dataManager.initDatabaseSchema();
        __CLR4_5_23q3qlx1dllbc.R.inc(186);connectionManager.init(dataManager);
        __CLR4_5_23q3qlx1dllbc.R.inc(187);serverManager.init();
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

    /**
     * Initialize context for unit testing
     */
    public static void init(DataManager dataManager) {try{__CLR4_5_23q3qlx1dllbc.R.inc(188);
        __CLR4_5_23q3qlx1dllbc.R.inc(189);properties = new Properties();
        __CLR4_5_23q3qlx1dllbc.R.inc(190);Context.dataManager = dataManager;
    }finally{__CLR4_5_23q3qlx1dllbc.R.flushNeeded();}}

}
