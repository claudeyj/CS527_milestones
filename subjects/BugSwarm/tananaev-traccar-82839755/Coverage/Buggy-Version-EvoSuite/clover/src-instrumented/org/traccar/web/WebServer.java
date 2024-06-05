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
package org.traccar.web;

import java.net.InetSocketAddress;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.traccar.Config;
import org.traccar.helper.Log;

/**
 * Integrated HTTP server
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class WebServer {public static class __CLR4_5_29bk9bklx1e38oq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,12145,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Server server;
    private final Config config;
    private final DataSource dataSource;
    private final HandlerList handlers = new HandlerList();
    
    private void initServer() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12080);

        __CLR4_5_29bk9bklx1e38oq.R.inc(12081);String address = config.getString("web.address");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12082);int port = config.getInteger("web.port", 8082);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12083);if ((((address == null)&&(__CLR4_5_29bk9bklx1e38oq.R.iget(12084)!=0|true))||(__CLR4_5_29bk9bklx1e38oq.R.iget(12085)==0&false))) {{
            __CLR4_5_29bk9bklx1e38oq.R.inc(12086);server = new Server(port);
        } }else {{
            __CLR4_5_29bk9bklx1e38oq.R.inc(12087);server = new Server(new InetSocketAddress(address, port));
        }
    }}finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}
    
    public WebServer(Config config, DataSource dataSource) {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12088);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12089);this.config = config;
        __CLR4_5_29bk9bklx1e38oq.R.inc(12090);this.dataSource = dataSource;

        __CLR4_5_29bk9bklx1e38oq.R.inc(12091);initServer();
        boolean __CLB4_5_2_bool0=false;__CLR4_5_29bk9bklx1e38oq.R.inc(12092);switch (config.getString("web.type", "new")) {
            case "api":if (!__CLB4_5_2_bool0) {__CLR4_5_29bk9bklx1e38oq.R.inc(12093);__CLB4_5_2_bool0=true;}
                __CLR4_5_29bk9bklx1e38oq.R.inc(12094);initApi();
                __CLR4_5_29bk9bklx1e38oq.R.inc(12095);break;
            case "new":if (!__CLB4_5_2_bool0) {__CLR4_5_29bk9bklx1e38oq.R.inc(12096);__CLB4_5_2_bool0=true;}
                __CLR4_5_29bk9bklx1e38oq.R.inc(12097);initApi();
                __CLR4_5_29bk9bklx1e38oq.R.inc(12098);initWebApp();
                __CLR4_5_29bk9bklx1e38oq.R.inc(12099);break;
            case "old":if (!__CLB4_5_2_bool0) {__CLR4_5_29bk9bklx1e38oq.R.inc(12100);__CLB4_5_2_bool0=true;}
                __CLR4_5_29bk9bklx1e38oq.R.inc(12101);initApi();
                __CLR4_5_29bk9bklx1e38oq.R.inc(12102);initOldWebApp();
                __CLR4_5_29bk9bklx1e38oq.R.inc(12103);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_29bk9bklx1e38oq.R.inc(12104);__CLB4_5_2_bool0=true;}
                __CLR4_5_29bk9bklx1e38oq.R.inc(12105);Log.error("Unsupported web application type: " + config.getString("web.type"));
                __CLR4_5_29bk9bklx1e38oq.R.inc(12106);break;
        }
        __CLR4_5_29bk9bklx1e38oq.R.inc(12107);server.setHandler(handlers);
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

    private void initWebApp() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12108);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12109);ResourceHandler resourceHandler = new ResourceHandler();
        __CLR4_5_29bk9bklx1e38oq.R.inc(12110);resourceHandler.setResourceBase(config.getString("web.path"));
        __CLR4_5_29bk9bklx1e38oq.R.inc(12111);if ((((config.getBoolean("web.debug"))&&(__CLR4_5_29bk9bklx1e38oq.R.iget(12112)!=0|true))||(__CLR4_5_29bk9bklx1e38oq.R.iget(12113)==0&false))) {{
            __CLR4_5_29bk9bklx1e38oq.R.inc(12114);resourceHandler.setWelcomeFiles(new String[] { "debug.html" });
        } }else {{
            __CLR4_5_29bk9bklx1e38oq.R.inc(12115);resourceHandler.setWelcomeFiles(new String[] { "release.html", "index.html" });
        }
        }__CLR4_5_29bk9bklx1e38oq.R.inc(12116);handlers.addHandler(resourceHandler);
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

    private void initOldWebApp() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12117);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12118);try {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12119);javax.naming.Context context = new InitialContext();
            __CLR4_5_29bk9bklx1e38oq.R.inc(12120);context.bind("java:/DefaultDS", dataSource);
        } catch (Exception error) {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12121);Log.warning(error);
        }

        __CLR4_5_29bk9bklx1e38oq.R.inc(12122);WebAppContext webapp = new WebAppContext();
        __CLR4_5_29bk9bklx1e38oq.R.inc(12123);webapp.setContextPath("/");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12124);webapp.setWar(config.getString("web.application"));
        __CLR4_5_29bk9bklx1e38oq.R.inc(12125);handlers.addHandler(webapp);
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

    private void initApi() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12126);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12127);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12128);servletHandler.setContextPath("/api");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12129);servletHandler.addServlet(new ServletHolder(new AsyncServlet()), "/async/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12130);servletHandler.addServlet(new ServletHolder(new ServerServlet()), "/server/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12131);servletHandler.addServlet(new ServletHolder(new UserServlet()), "/user/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12132);servletHandler.addServlet(new ServletHolder(new DeviceServlet()), "/device/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12133);servletHandler.addServlet(new ServletHolder(new PositionServlet()), "/position/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12134);servletHandler.addServlet(new ServletHolder(new CommandServlet()), "/command/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12135);servletHandler.addServlet(new ServletHolder(new MainServlet()), "/*");
        __CLR4_5_29bk9bklx1e38oq.R.inc(12136);handlers.addHandler(servletHandler);
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

    public void start() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12137);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12138);try {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12139);server.start();
        } catch (Exception error) {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12140);Log.warning(error);
        }
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_29bk9bklx1e38oq.R.inc(12141);
        __CLR4_5_29bk9bklx1e38oq.R.inc(12142);try {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12143);server.stop();
        } catch (Exception error) {
            __CLR4_5_29bk9bklx1e38oq.R.inc(12144);Log.warning(error);
        }
    }finally{__CLR4_5_29bk9bklx1e38oq.R.flushNeeded();}}

}
