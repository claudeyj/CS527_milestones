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
package org.traccar.http;

import java.net.InetSocketAddress;
import java.util.Properties;
import javax.naming.InitialContext;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.traccar.Context;
import org.traccar.helper.Log;

/**
 * Integrated HTTP server
 */
public class WebServer {public static class __CLR4_5_21ps1pslx1di5el{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,2271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Server server;

    public WebServer() {try{__CLR4_5_21ps1pslx1di5el.R.inc(2224);
        __CLR4_5_21ps1pslx1di5el.R.inc(2225);Properties properties = Context.getProps();
        
        __CLR4_5_21ps1pslx1di5el.R.inc(2226);String address = properties.getProperty("web.address");
        __CLR4_5_21ps1pslx1di5el.R.inc(2227);Integer port = Integer.valueOf(properties.getProperty("web.port", "8082"));
        __CLR4_5_21ps1pslx1di5el.R.inc(2228);if ((((address == null)&&(__CLR4_5_21ps1pslx1di5el.R.iget(2229)!=0|true))||(__CLR4_5_21ps1pslx1di5el.R.iget(2230)==0&false))) {{
            __CLR4_5_21ps1pslx1di5el.R.inc(2231);server = new Server(port);
        } }else {{
            __CLR4_5_21ps1pslx1di5el.R.inc(2232);server = new Server(new InetSocketAddress(address, port));
        }

        }__CLR4_5_21ps1pslx1di5el.R.inc(2233);if ((((!Boolean.valueOf(properties.getProperty("web.old")))&&(__CLR4_5_21ps1pslx1di5el.R.iget(2234)!=0|true))||(__CLR4_5_21ps1pslx1di5el.R.iget(2235)==0&false))) {{

            __CLR4_5_21ps1pslx1di5el.R.inc(2236);ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
            __CLR4_5_21ps1pslx1di5el.R.inc(2237);servletHandler.setContextPath("/api");
            __CLR4_5_21ps1pslx1di5el.R.inc(2238);servletHandler.addServlet(new ServletHolder(new AsyncServlet()), "/async/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2239);servletHandler.addServlet(new ServletHolder(new ServerServlet()), "/server/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2240);servletHandler.addServlet(new ServletHolder(new UserServlet()), "/user/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2241);servletHandler.addServlet(new ServletHolder(new DeviceServlet()), "/device/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2242);servletHandler.addServlet(new ServletHolder(new PositionServlet()), "/position/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2243);servletHandler.addServlet(new ServletHolder(new CommandsServlet()), "/commands/*");
            __CLR4_5_21ps1pslx1di5el.R.inc(2244);servletHandler.addServlet(new ServletHolder(new MainServlet()), "/*");

            /*ResourceHandler mobileResourceHandler = new ResourceHandler();
            mobileResourceHandler.setResourceBase(properties.getProperty("web.mobile"));
            mobileResourceHandler.setWelcomeFiles(new String[] {"index.html"});
            ContextHandler mobileContext = new ContextHandler("/m");
            mobileContext.setHandler(mobileResourceHandler);*/

            __CLR4_5_21ps1pslx1di5el.R.inc(2245);ResourceHandler resourceHandler = new ResourceHandler();
            __CLR4_5_21ps1pslx1di5el.R.inc(2246);resourceHandler.setResourceBase(properties.getProperty("web.path"));
            __CLR4_5_21ps1pslx1di5el.R.inc(2247);if ((((Boolean.valueOf(properties.getProperty("web.debug")))&&(__CLR4_5_21ps1pslx1di5el.R.iget(2248)!=0|true))||(__CLR4_5_21ps1pslx1di5el.R.iget(2249)==0&false))) {{
                __CLR4_5_21ps1pslx1di5el.R.inc(2250);resourceHandler.setWelcomeFiles(new String[]{"debug.html"});
            } }else {{
                __CLR4_5_21ps1pslx1di5el.R.inc(2251);resourceHandler.setWelcomeFiles(new String[]{"release.html"});
            }

            }__CLR4_5_21ps1pslx1di5el.R.inc(2252);HandlerList handlerList = new HandlerList();
            __CLR4_5_21ps1pslx1di5el.R.inc(2253);handlerList.setHandlers(new Handler[] {servletHandler, resourceHandler});

            __CLR4_5_21ps1pslx1di5el.R.inc(2254);server.setHandler(handlerList);

        } }else {{

            __CLR4_5_21ps1pslx1di5el.R.inc(2255);try {
                __CLR4_5_21ps1pslx1di5el.R.inc(2256);javax.naming.Context context = new InitialContext();
                __CLR4_5_21ps1pslx1di5el.R.inc(2257);context.bind("java:/DefaultDS", Context.getDataManager().getDataSource());
            } catch (Exception error) {
                __CLR4_5_21ps1pslx1di5el.R.inc(2258);Log.warning(error);
            }

            __CLR4_5_21ps1pslx1di5el.R.inc(2259);WebAppContext webapp = new WebAppContext();
            __CLR4_5_21ps1pslx1di5el.R.inc(2260);webapp.setContextPath("/");
            __CLR4_5_21ps1pslx1di5el.R.inc(2261);webapp.setWar(properties.getProperty("web.application"));
            __CLR4_5_21ps1pslx1di5el.R.inc(2262);server.setHandler(webapp);

        }
    }}finally{__CLR4_5_21ps1pslx1di5el.R.flushNeeded();}}

    public void start() {try{__CLR4_5_21ps1pslx1di5el.R.inc(2263);
        __CLR4_5_21ps1pslx1di5el.R.inc(2264);try {
            __CLR4_5_21ps1pslx1di5el.R.inc(2265);server.start();
        } catch (Exception error) {
            __CLR4_5_21ps1pslx1di5el.R.inc(2266);Log.warning(error);
        }
    }finally{__CLR4_5_21ps1pslx1di5el.R.flushNeeded();}}

    public void stop() {try{__CLR4_5_21ps1pslx1di5el.R.inc(2267);
        __CLR4_5_21ps1pslx1di5el.R.inc(2268);try {
            __CLR4_5_21ps1pslx1di5el.R.inc(2269);server.stop();
        } catch (Exception error) {
            __CLR4_5_21ps1pslx1di5el.R.inc(2270);Log.warning(error);
        }
    }finally{__CLR4_5_21ps1pslx1di5el.R.flushNeeded();}}

}
