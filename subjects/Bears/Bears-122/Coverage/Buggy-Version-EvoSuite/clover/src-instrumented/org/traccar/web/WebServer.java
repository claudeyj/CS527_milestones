/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.SessionManager;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.HashSessionManager;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.traccar.Config;
import org.traccar.api.AsyncSocketServlet;
import org.traccar.api.CorsResponseFilter;
import org.traccar.api.ObjectMapperProvider;
import org.traccar.api.ResourceErrorHandler;
import org.traccar.api.SecurityRequestFilter;
import org.traccar.api.resource.ServerResource;
import org.traccar.helper.Log;

import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.Writer;
import java.net.InetSocketAddress;

@java.lang.SuppressWarnings({"fallthrough"}) public class WebServer {public static class __CLR4_5_2jafjaflwydwflr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,25078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Server server;
    private final Config config;
    private final DataSource dataSource;
    private final HandlerList handlers = new HandlerList();
    private final SessionManager sessionManager;

    private void initServer() {try{__CLR4_5_2jafjaflwydwflr.R.inc(24999);

        __CLR4_5_2jafjaflwydwflr.R.inc(25000);String address = config.getString("web.address");
        __CLR4_5_2jafjaflwydwflr.R.inc(25001);int port = config.getInteger("web.port", 8082);
        __CLR4_5_2jafjaflwydwflr.R.inc(25002);if ((((address == null)&&(__CLR4_5_2jafjaflwydwflr.R.iget(25003)!=0|true))||(__CLR4_5_2jafjaflwydwflr.R.iget(25004)==0&false))) {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25005);server = new Server(port);
        } }else {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25006);server = new Server(new InetSocketAddress(address, port));
        }
    }}finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    public WebServer(Config config, DataSource dataSource) {try{__CLR4_5_2jafjaflwydwflr.R.inc(25007);
        __CLR4_5_2jafjaflwydwflr.R.inc(25008);this.config = config;
        __CLR4_5_2jafjaflwydwflr.R.inc(25009);this.dataSource = dataSource;

        __CLR4_5_2jafjaflwydwflr.R.inc(25010);sessionManager = new HashSessionManager();
        __CLR4_5_2jafjaflwydwflr.R.inc(25011);int sessionTimeout = config.getInteger("web.sessionTimeout");
        __CLR4_5_2jafjaflwydwflr.R.inc(25012);if ((((sessionTimeout != 0)&&(__CLR4_5_2jafjaflwydwflr.R.iget(25013)!=0|true))||(__CLR4_5_2jafjaflwydwflr.R.iget(25014)==0&false))) {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25015);sessionManager.setMaxInactiveInterval(sessionTimeout);
        }

        }__CLR4_5_2jafjaflwydwflr.R.inc(25016);initServer();
        __CLR4_5_2jafjaflwydwflr.R.inc(25017);initApi();
        __CLR4_5_2jafjaflwydwflr.R.inc(25018);if ((((config.getBoolean("web.console"))&&(__CLR4_5_2jafjaflwydwflr.R.iget(25019)!=0|true))||(__CLR4_5_2jafjaflwydwflr.R.iget(25020)==0&false))) {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25021);initConsole();
        }
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2jafjaflwydwflr.R.inc(25022);switch (config.getString("web.type", "new")) {
            case "old":if (!__CLB4_5_2_bool0) {__CLR4_5_2jafjaflwydwflr.R.inc(25023);__CLB4_5_2_bool0=true;}
                __CLR4_5_2jafjaflwydwflr.R.inc(25024);initOldWebApp();
                __CLR4_5_2jafjaflwydwflr.R.inc(25025);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2jafjaflwydwflr.R.inc(25026);__CLB4_5_2_bool0=true;}
                __CLR4_5_2jafjaflwydwflr.R.inc(25027);initWebApp();
                __CLR4_5_2jafjaflwydwflr.R.inc(25028);break;
        }
        __CLR4_5_2jafjaflwydwflr.R.inc(25029);server.setHandler(handlers);

        __CLR4_5_2jafjaflwydwflr.R.inc(25030);server.addBean(new ErrorHandler() {
            @Override
            protected void handleErrorPage(
                    HttpServletRequest request, Writer writer, int code, String message) throws IOException {try{__CLR4_5_2jafjaflwydwflr.R.inc(25031);
                __CLR4_5_2jafjaflwydwflr.R.inc(25032);writer.write("<!DOCTYPE<html><head><title>Error</title></head><html><body>"
                        + code + " - " + HttpStatus.getMessage(code) + "</body></html>");
            }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}
        }, false);
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    private void initWebApp() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25033);
        __CLR4_5_2jafjaflwydwflr.R.inc(25034);ResourceHandler resourceHandler = new ResourceHandler();
        __CLR4_5_2jafjaflwydwflr.R.inc(25035);resourceHandler.setResourceBase(config.getString("web.path"));
        __CLR4_5_2jafjaflwydwflr.R.inc(25036);if ((((config.getBoolean("web.debug"))&&(__CLR4_5_2jafjaflwydwflr.R.iget(25037)!=0|true))||(__CLR4_5_2jafjaflwydwflr.R.iget(25038)==0&false))) {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25039);resourceHandler.setWelcomeFiles(new String[] {"debug.html", "index.html"});
            __CLR4_5_2jafjaflwydwflr.R.inc(25040);resourceHandler.setMinMemoryMappedContentLength(-1); // avoid locking files on Windows
        } }else {{
            __CLR4_5_2jafjaflwydwflr.R.inc(25041);resourceHandler.setCacheControl("max-age=3600,public");
            __CLR4_5_2jafjaflwydwflr.R.inc(25042);resourceHandler.setWelcomeFiles(new String[] {"release.html", "index.html"});
        }
        }__CLR4_5_2jafjaflwydwflr.R.inc(25043);handlers.addHandler(resourceHandler);
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    private void initOldWebApp() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25044);
        __CLR4_5_2jafjaflwydwflr.R.inc(25045);try {
            __CLR4_5_2jafjaflwydwflr.R.inc(25046);javax.naming.Context context = new InitialContext();
            __CLR4_5_2jafjaflwydwflr.R.inc(25047);context.bind("java:/DefaultDS", dataSource);
        } catch (Exception error) {
            __CLR4_5_2jafjaflwydwflr.R.inc(25048);Log.warning(error);
        }

        __CLR4_5_2jafjaflwydwflr.R.inc(25049);WebAppContext app = new WebAppContext();
        __CLR4_5_2jafjaflwydwflr.R.inc(25050);app.setContextPath("/");
        __CLR4_5_2jafjaflwydwflr.R.inc(25051);app.getSessionHandler().setSessionManager(sessionManager);
        __CLR4_5_2jafjaflwydwflr.R.inc(25052);app.setWar(config.getString("web.application"));
        __CLR4_5_2jafjaflwydwflr.R.inc(25053);handlers.addHandler(app);
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    private void initApi() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25054);
        __CLR4_5_2jafjaflwydwflr.R.inc(25055);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        __CLR4_5_2jafjaflwydwflr.R.inc(25056);servletHandler.setContextPath("/api");
        __CLR4_5_2jafjaflwydwflr.R.inc(25057);servletHandler.getSessionHandler().setSessionManager(sessionManager);

        __CLR4_5_2jafjaflwydwflr.R.inc(25058);servletHandler.addServlet(new ServletHolder(new AsyncSocketServlet()), "/socket");

        __CLR4_5_2jafjaflwydwflr.R.inc(25059);ResourceConfig resourceConfig = new ResourceConfig();
        __CLR4_5_2jafjaflwydwflr.R.inc(25060);resourceConfig.registerClasses(JacksonFeature.class, ObjectMapperProvider.class, ResourceErrorHandler.class);
        __CLR4_5_2jafjaflwydwflr.R.inc(25061);resourceConfig.registerClasses(SecurityRequestFilter.class, CorsResponseFilter.class);
        __CLR4_5_2jafjaflwydwflr.R.inc(25062);resourceConfig.packages(ServerResource.class.getPackage().getName());

        __CLR4_5_2jafjaflwydwflr.R.inc(25063);servletHandler.addServlet(new ServletHolder(new ServletContainer(resourceConfig)), "/*");

        __CLR4_5_2jafjaflwydwflr.R.inc(25064);handlers.addHandler(servletHandler);
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    private void initConsole() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25065);
        __CLR4_5_2jafjaflwydwflr.R.inc(25066);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        __CLR4_5_2jafjaflwydwflr.R.inc(25067);servletHandler.setContextPath("/console");
        __CLR4_5_2jafjaflwydwflr.R.inc(25068);servletHandler.addServlet(new ServletHolder(new ConsoleServlet()), "/*");
        __CLR4_5_2jafjaflwydwflr.R.inc(25069);handlers.addHandler(servletHandler);
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    public void start() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25070);
        __CLR4_5_2jafjaflwydwflr.R.inc(25071);try {
            __CLR4_5_2jafjaflwydwflr.R.inc(25072);server.start();
        } catch (Exception error) {
            __CLR4_5_2jafjaflwydwflr.R.inc(25073);Log.warning(error);
        }
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_2jafjaflwydwflr.R.inc(25074);
        __CLR4_5_2jafjaflwydwflr.R.inc(25075);try {
            __CLR4_5_2jafjaflwydwflr.R.inc(25076);server.stop();
        } catch (Exception error) {
            __CLR4_5_2jafjaflwydwflr.R.inc(25077);Log.warning(error);
        }
    }finally{__CLR4_5_2jafjaflwydwflr.R.flushNeeded();}}

}
