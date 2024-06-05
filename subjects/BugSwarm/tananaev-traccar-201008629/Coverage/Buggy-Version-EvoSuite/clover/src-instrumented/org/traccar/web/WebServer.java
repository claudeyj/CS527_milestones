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

@java.lang.SuppressWarnings({"fallthrough"}) public class WebServer {public static class __CLR4_5_2ge3ge3lx1dvfre{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,21321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Server server;
    private final Config config;
    private final DataSource dataSource;
    private final HandlerList handlers = new HandlerList();
    private final SessionManager sessionManager;

    private void initServer() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21243);

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21244);String address = config.getString("web.address");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21245);int port = config.getInteger("web.port", 8082);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21246);if ((((address == null)&&(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21247)!=0|true))||(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21248)==0&false))) {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21249);server = new Server(port);
        } }else {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21250);server = new Server(new InetSocketAddress(address, port));
        }
    }}finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    public WebServer(Config config, DataSource dataSource) {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21251);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21252);this.config = config;
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21253);this.dataSource = dataSource;

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21254);sessionManager = new HashSessionManager();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21255);int sessionTimeout = config.getInteger("web.sessionTimeout");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21256);if ((((sessionTimeout != 0)&&(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21257)!=0|true))||(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21258)==0&false))) {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21259);sessionManager.setMaxInactiveInterval(sessionTimeout);
        }

        }__CLR4_5_2ge3ge3lx1dvfre.R.inc(21260);initServer();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21261);initApi();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21262);if ((((config.getBoolean("web.console"))&&(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21263)!=0|true))||(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21264)==0&false))) {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21265);initConsole();
        }
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2ge3ge3lx1dvfre.R.inc(21266);switch (config.getString("web.type", "new")) {
            case "old":if (!__CLB4_5_2_bool0) {__CLR4_5_2ge3ge3lx1dvfre.R.inc(21267);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ge3ge3lx1dvfre.R.inc(21268);initOldWebApp();
                __CLR4_5_2ge3ge3lx1dvfre.R.inc(21269);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ge3ge3lx1dvfre.R.inc(21270);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ge3ge3lx1dvfre.R.inc(21271);initWebApp();
                __CLR4_5_2ge3ge3lx1dvfre.R.inc(21272);break;
        }
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21273);server.setHandler(handlers);

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21274);server.addBean(new ErrorHandler() {
            @Override
            protected void handleErrorPage(
                    HttpServletRequest request, Writer writer, int code, String message) throws IOException {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21275);
                __CLR4_5_2ge3ge3lx1dvfre.R.inc(21276);writer.write("<!DOCTYPE<html><head><title>Error</title></head><html><body>"
                        + code + " - " + HttpStatus.getMessage(code) + "</body></html>");
            }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}
        }, false);
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    private void initWebApp() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21277);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21278);ResourceHandler resourceHandler = new ResourceHandler();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21279);resourceHandler.setResourceBase(config.getString("web.path"));
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21280);if ((((config.getBoolean("web.debug"))&&(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21281)!=0|true))||(__CLR4_5_2ge3ge3lx1dvfre.R.iget(21282)==0&false))) {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21283);resourceHandler.setWelcomeFiles(new String[] {"debug.html", "index.html"});
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21284);resourceHandler.setMinMemoryMappedContentLength(-1); // avoid locking files on Windows
        } }else {{
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21285);resourceHandler.setWelcomeFiles(new String[] {"release.html", "index.html"});
        }
        }__CLR4_5_2ge3ge3lx1dvfre.R.inc(21286);handlers.addHandler(resourceHandler);
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    private void initOldWebApp() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21287);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21288);try {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21289);javax.naming.Context context = new InitialContext();
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21290);context.bind("java:/DefaultDS", dataSource);
        } catch (Exception error) {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21291);Log.warning(error);
        }

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21292);WebAppContext app = new WebAppContext();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21293);app.setContextPath("/");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21294);app.getSessionHandler().setSessionManager(sessionManager);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21295);app.setWar(config.getString("web.application"));
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21296);handlers.addHandler(app);
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    private void initApi() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21297);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21298);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21299);servletHandler.setContextPath("/api");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21300);servletHandler.getSessionHandler().setSessionManager(sessionManager);

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21301);servletHandler.addServlet(new ServletHolder(new AsyncSocketServlet()), "/socket");

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21302);ResourceConfig resourceConfig = new ResourceConfig();
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21303);resourceConfig.registerClasses(JacksonFeature.class, ObjectMapperProvider.class, ResourceErrorHandler.class);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21304);resourceConfig.registerClasses(SecurityRequestFilter.class, CorsResponseFilter.class);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21305);resourceConfig.packages(ServerResource.class.getPackage().getName());

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21306);servletHandler.addServlet(new ServletHolder(new ServletContainer(resourceConfig)), "/*");

        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21307);handlers.addHandler(servletHandler);
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    private void initConsole() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21308);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21309);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21310);servletHandler.setContextPath("/console");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21311);servletHandler.addServlet(new ServletHolder(new ConsoleServlet()), "/*");
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21312);handlers.addHandler(servletHandler);
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    public void start() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21313);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21314);try {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21315);server.start();
        } catch (Exception error) {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21316);Log.warning(error);
        }
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_2ge3ge3lx1dvfre.R.inc(21317);
        __CLR4_5_2ge3ge3lx1dvfre.R.inc(21318);try {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21319);server.stop();
        } catch (Exception error) {
            __CLR4_5_2ge3ge3lx1dvfre.R.inc(21320);Log.warning(error);
        }
    }finally{__CLR4_5_2ge3ge3lx1dvfre.R.flushNeeded();}}

}
