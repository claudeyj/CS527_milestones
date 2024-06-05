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
package org.traccar.http;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.netty.util.Timeout;
import org.jboss.netty.util.TimerTask;
import org.traccar.Context;
import org.traccar.GlobalTimer;
import org.traccar.database.ConnectionManager;
import org.traccar.helper.Log;
import org.traccar.model.Position;
import org.traccar.model.User;

public class AsyncServlet extends HttpServlet {public static class __CLR4_5_21dp1dplx1dp5t4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,1893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long ASYNC_TIMEOUT = 120000;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1789);
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1790);async(req.startAsync());
    }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
    
    public class AsyncSession {
        
        private static final boolean DEBUG_ASYNC = false;
        
        private static final long SESSION_TIMEOUT = 30;
        private static final long REQUEST_TIMEOUT = 20;
        
        private boolean destroyed;
        private final long userId;
        private final Set<Long> devices = new HashSet<Long>();
        private Timeout sessionTimeout;
        private Timeout requestTimeout;
        private final Map<Long, Position> positions = new HashMap<Long, Position>();
        private AsyncContext activeContext;
        
        private void logEvent(String message) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1791);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1792);if ((((DEBUG_ASYNC)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1793)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1794)==0&false))) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1795);Log.debug("AsyncSession: " + this.hashCode() + " destroyed: " + destroyed + " " + message);
            }
        }}finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        
        public AsyncSession(long userId, Collection<Long> devices) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1796);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1797);logEvent("create userId: " + userId + " devices: " + devices.size());
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1798);this.userId = userId;
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1799);this.devices.addAll(devices);

            __CLR4_5_21dp1dplx1dp5t4.R.inc(1800);Collection<Position> initialPositions = Context.getConnectionManager().getInitialState(devices);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1801);for (Position position : initialPositions) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1802);positions.put(position.getDeviceId(), position);
            }
            
            }__CLR4_5_21dp1dplx1dp5t4.R.inc(1803);Context.getConnectionManager().addListener(devices, dataListener);
        }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        
        public boolean hasDevice(long deviceId) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1804);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1805);return devices.contains(deviceId);
        }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        
        private final ConnectionManager.DataCacheListener dataListener = new ConnectionManager.DataCacheListener() {
            @Override
            public void onUpdate(Position position) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1806);
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1807);synchronized (AsyncSession.this) {
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1808);logEvent("onUpdate deviceId: " + position.getDeviceId());
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1809);if ((((!destroyed)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1810)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1811)==0&false))) {{
                        __CLR4_5_21dp1dplx1dp5t4.R.inc(1812);if ((((requestTimeout != null)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1813)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1814)==0&false))) {{
                            __CLR4_5_21dp1dplx1dp5t4.R.inc(1815);requestTimeout.cancel();
                            __CLR4_5_21dp1dplx1dp5t4.R.inc(1816);requestTimeout = null;
                        }
                        }__CLR4_5_21dp1dplx1dp5t4.R.inc(1817);positions.put(position.getDeviceId(), position);
                        __CLR4_5_21dp1dplx1dp5t4.R.inc(1818);if ((((activeContext != null)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1819)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1820)==0&false))) {{
                            __CLR4_5_21dp1dplx1dp5t4.R.inc(1821);response();
                        }
                    }}
                }}
            }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        };
        
        private final TimerTask sessionTimer = new TimerTask() {
            @Override
            public void run(Timeout tmt) throws Exception {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1822);
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1823);synchronized (AsyncSession.this) {
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1824);logEvent("sessionTimeout");
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1825);Context.getConnectionManager().removeListener(devices, dataListener);
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1826);synchronized (asyncSessions) {
                        __CLR4_5_21dp1dplx1dp5t4.R.inc(1827);asyncSessions.remove(userId);
                    }
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1828);destroyed = true;
                }
            }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        };
                
        private final TimerTask requestTimer = new TimerTask() {
            @Override
            public void run(Timeout tmt) throws Exception {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1829);
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1830);synchronized (AsyncSession.this) {
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1831);logEvent("requestTimeout");
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1832);if ((((!destroyed)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1833)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1834)==0&false))) {{
                        __CLR4_5_21dp1dplx1dp5t4.R.inc(1835);if ((((activeContext != null)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1836)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1837)==0&false))) {{
                            __CLR4_5_21dp1dplx1dp5t4.R.inc(1838);response();
                        }
                    }}
                }}
            }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        };
        
        public synchronized void request(AsyncContext context) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1839);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1840);logEvent("request context: " + context.hashCode());
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1841);if ((((!destroyed)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1842)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1843)==0&false))) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1844);activeContext = context;
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1845);if ((((sessionTimeout != null)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1846)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1847)==0&false))) {{
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1848);sessionTimeout.cancel();
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1849);sessionTimeout = null;
                }

                }__CLR4_5_21dp1dplx1dp5t4.R.inc(1850);if ((((!positions.isEmpty())&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1851)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1852)==0&false))) {{
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1853);response();
                } }else {{
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1854);requestTimeout = GlobalTimer.getTimer().newTimeout(
                            requestTimer, REQUEST_TIMEOUT, TimeUnit.SECONDS);
                }
            }}
        }}finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        
        private synchronized void response() {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1855);
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1856);logEvent("response context: " + activeContext.hashCode());
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1857);if ((((!destroyed)&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1858)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1859)==0&false))) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1860);ServletResponse response = activeContext.getResponse();

                __CLR4_5_21dp1dplx1dp5t4.R.inc(1861);JsonObjectBuilder result = Json.createObjectBuilder();
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1862);result.add("success", true);
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1863);result.add("data", JsonConverter.arrayToJson(positions.values()));
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1864);positions.clear();

                __CLR4_5_21dp1dplx1dp5t4.R.inc(1865);try {
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1866);response.getWriter().println(result.build().toString());
                } catch (IOException error) {
                    __CLR4_5_21dp1dplx1dp5t4.R.inc(1867);Log.warning(error);
                }

                __CLR4_5_21dp1dplx1dp5t4.R.inc(1868);activeContext.complete();
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1869);activeContext = null;

                __CLR4_5_21dp1dplx1dp5t4.R.inc(1870);sessionTimeout = GlobalTimer.getTimer().newTimeout(
                        sessionTimer, SESSION_TIMEOUT, TimeUnit.SECONDS);
            }
        }}finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
        
    }
    
    private static final Map<Long, AsyncSession> asyncSessions = new HashMap<Long, AsyncSession>();
    
    public static void sessionRefreshUser(long userId) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1871);
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1872);asyncSessions.remove(userId);
    }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
    
    public static void sessionRefreshDevice(long deviceId) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1873);
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1874);Iterator<Entry<Long, AsyncSession>> iterator = asyncSessions.entrySet().iterator();
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1875);while ((((iterator.hasNext())&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1876)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1877)==0&false))) {{
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1878);if ((((iterator.next().getValue().hasDevice(deviceId))&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1879)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1880)==0&false))) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1881);iterator.remove();
            }
        }}
    }}finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}
    
    private void async(final AsyncContext context) {try{__CLR4_5_21dp1dplx1dp5t4.R.inc(1882);
        
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1883);context.setTimeout(ASYNC_TIMEOUT);
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1884);HttpServletRequest req = (HttpServletRequest) context.getRequest();
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1885);User user = (User) req.getSession().getAttribute(MainServlet.USER_KEY);
        
        __CLR4_5_21dp1dplx1dp5t4.R.inc(1886);synchronized (asyncSessions) {
            
            __CLR4_5_21dp1dplx1dp5t4.R.inc(1887);if ((((Boolean.valueOf(req.getParameter("first")) || !asyncSessions.containsKey(user.getId()))&&(__CLR4_5_21dp1dplx1dp5t4.R.iget(1888)!=0|true))||(__CLR4_5_21dp1dplx1dp5t4.R.iget(1889)==0&false))) {{
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1890);Collection<Long> devices = Context.getPermissionsManager().allowedDevices(user.getId());
                __CLR4_5_21dp1dplx1dp5t4.R.inc(1891);asyncSessions.put(user.getId(), new AsyncSession(user.getId(), devices));
            }
            
            }__CLR4_5_21dp1dplx1dp5t4.R.inc(1892);asyncSessions.get(user.getId()).request(context);
        }
    }finally{__CLR4_5_21dp1dplx1dp5t4.R.flushNeeded();}}

}
