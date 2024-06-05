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
package org.traccar.web;

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
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.netty.util.Timeout;
import org.jboss.netty.util.TimerTask;
import org.traccar.Context;
import org.traccar.GlobalTimer;
import org.traccar.database.ConnectionManager;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class AsyncServlet extends BaseServlet {public static class __CLR4_5_28zd8zdlx1e45q2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,11747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long ASYNC_TIMEOUT = 120000;
    
    @Override
    protected boolean handle(String command, HttpServletRequest req, HttpServletResponse resp) throws Exception {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11641);
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11642);async(req.startAsync(), getUserId(req));
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11643);return true;
    }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
    
    public class AsyncSession {
        
        private static final boolean DEBUG_ASYNC = false;
        
        private static final long SESSION_TIMEOUT = 30;
        private static final long REQUEST_TIMEOUT = 20;
        
        private boolean destroyed;
        private final long userId;
        private final Set<Long> devices = new HashSet<>();
        private Timeout sessionTimeout;
        private Timeout requestTimeout;
        private final Map<Long, Position> positions = new HashMap<>();
        private AsyncContext activeContext;
        
        private void logEvent(String message) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11644);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11645);if ((((DEBUG_ASYNC)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11646)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11647)==0&false))) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11648);Log.debug("AsyncSession: " + this.hashCode() + " destroyed: " + destroyed + " " + message);
            }
        }}finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        
        public AsyncSession(long userId, Collection<Long> devices) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11649);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11650);logEvent("create userId: " + userId + " devices: " + devices.size());
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11651);this.userId = userId;
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11652);this.devices.addAll(devices);

            __CLR4_5_28zd8zdlx1e45q2.R.inc(11653);Collection<Position> initialPositions = Context.getConnectionManager().getInitialState(devices);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11654);for (Position position : initialPositions) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11655);positions.put(position.getDeviceId(), position);
            }
            
            }__CLR4_5_28zd8zdlx1e45q2.R.inc(11656);Context.getConnectionManager().addListener(devices, dataListener);
        }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        
        public boolean hasDevice(long deviceId) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11657);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11658);return devices.contains(deviceId);
        }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        
        private final ConnectionManager.DataCacheListener dataListener = new ConnectionManager.DataCacheListener() {
            @Override
            public void onUpdate(Position position) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11659);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11660);synchronized (AsyncSession.this) {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11661);logEvent("onUpdate deviceId: " + position.getDeviceId());
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11662);if ((((!destroyed)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11663)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11664)==0&false))) {{
                        __CLR4_5_28zd8zdlx1e45q2.R.inc(11665);if ((((requestTimeout != null)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11666)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11667)==0&false))) {{
                            __CLR4_5_28zd8zdlx1e45q2.R.inc(11668);requestTimeout.cancel();
                            __CLR4_5_28zd8zdlx1e45q2.R.inc(11669);requestTimeout = null;
                        }
                        }__CLR4_5_28zd8zdlx1e45q2.R.inc(11670);positions.put(position.getDeviceId(), position);
                        __CLR4_5_28zd8zdlx1e45q2.R.inc(11671);if ((((activeContext != null)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11672)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11673)==0&false))) {{
                            __CLR4_5_28zd8zdlx1e45q2.R.inc(11674);response();
                        }
                    }}
                }}
            }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        };
        
        private final TimerTask sessionTimer = new TimerTask() {
            @Override
            public void run(Timeout tmt) throws Exception {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11675);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11676);synchronized (AsyncSession.this) {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11677);logEvent("sessionTimeout");
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11678);destroyed = true;
                }
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11679);Context.getConnectionManager().removeListener(devices, dataListener);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11680);synchronized (asyncSessions) {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11681);asyncSessions.remove(userId);
                }
            }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        };
                
        private final TimerTask requestTimer = new TimerTask() {
            @Override
            public void run(Timeout tmt) throws Exception {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11682);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11683);synchronized (AsyncSession.this) {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11684);logEvent("requestTimeout");
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11685);if ((((!destroyed)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11686)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11687)==0&false))) {{
                        __CLR4_5_28zd8zdlx1e45q2.R.inc(11688);if ((((activeContext != null)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11689)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11690)==0&false))) {{
                            __CLR4_5_28zd8zdlx1e45q2.R.inc(11691);response();
                        }
                    }}
                }}
            }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        };
        
        public synchronized void request(AsyncContext context) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11692);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11693);logEvent("request context: " + context.hashCode());
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11694);if ((((!destroyed)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11695)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11696)==0&false))) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11697);activeContext = context;
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11698);if ((((sessionTimeout != null)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11699)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11700)==0&false))) {{
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11701);sessionTimeout.cancel();
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11702);sessionTimeout = null;
                }

                }__CLR4_5_28zd8zdlx1e45q2.R.inc(11703);if ((((!positions.isEmpty())&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11704)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11705)==0&false))) {{
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11706);response();
                } }else {{
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11707);requestTimeout = GlobalTimer.getTimer().newTimeout(
                            requestTimer, REQUEST_TIMEOUT, TimeUnit.SECONDS);
                }
            }}
        }}finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        
        private synchronized void response() {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11708);
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11709);logEvent("response context: " + activeContext.hashCode());
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11710);if ((((!destroyed)&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11711)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11712)==0&false))) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11713);ServletResponse response = activeContext.getResponse();

                __CLR4_5_28zd8zdlx1e45q2.R.inc(11714);JsonObjectBuilder result = Json.createObjectBuilder();
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11715);result.add("success", true);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11716);result.add("data", JsonConverter.arrayToJson(positions.values()));
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11717);positions.clear();

                __CLR4_5_28zd8zdlx1e45q2.R.inc(11718);try {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11719);response.getWriter().println(result.build().toString());
                } catch (IOException error) {
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11720);Log.warning(error);
                }

                __CLR4_5_28zd8zdlx1e45q2.R.inc(11721);activeContext.complete();
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11722);activeContext = null;

                __CLR4_5_28zd8zdlx1e45q2.R.inc(11723);sessionTimeout = GlobalTimer.getTimer().newTimeout(
                        sessionTimer, SESSION_TIMEOUT, TimeUnit.SECONDS);
            }
        }}finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
        
    }
    
    private static final Map<Long, AsyncSession> asyncSessions = new HashMap<>();
    
    public static void sessionRefreshUser(long userId) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11724);
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11725);synchronized (asyncSessions) {
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11726);asyncSessions.remove(userId);
        }
    }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
    
    public static void sessionRefreshDevice(long deviceId) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11727);
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11728);synchronized (asyncSessions) {
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11729);Iterator<Entry<Long, AsyncSession>> iterator = asyncSessions.entrySet().iterator();
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11730);while ((((iterator.hasNext())&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11731)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11732)==0&false))) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11733);if ((((iterator.next().getValue().hasDevice(deviceId))&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11734)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11735)==0&false))) {{
                    __CLR4_5_28zd8zdlx1e45q2.R.inc(11736);iterator.remove();
                }
            }}
        }}
    }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}
    
    private void async(final AsyncContext context, long userId) {try{__CLR4_5_28zd8zdlx1e45q2.R.inc(11737);
        
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11738);context.setTimeout(ASYNC_TIMEOUT);
        __CLR4_5_28zd8zdlx1e45q2.R.inc(11739);HttpServletRequest req = (HttpServletRequest) context.getRequest();

        __CLR4_5_28zd8zdlx1e45q2.R.inc(11740);synchronized (asyncSessions) {
            
            __CLR4_5_28zd8zdlx1e45q2.R.inc(11741);if ((((Boolean.valueOf(req.getParameter("first")) || !asyncSessions.containsKey(userId))&&(__CLR4_5_28zd8zdlx1e45q2.R.iget(11742)!=0|true))||(__CLR4_5_28zd8zdlx1e45q2.R.iget(11743)==0&false))) {{
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11744);Collection<Long> devices = Context.getPermissionsManager().allowedDevices(userId);
                __CLR4_5_28zd8zdlx1e45q2.R.inc(11745);asyncSessions.put(userId, new AsyncSession(userId, devices));
            }
            
            }__CLR4_5_28zd8zdlx1e45q2.R.inc(11746);asyncSessions.get(userId).request(context);
        }
    }finally{__CLR4_5_28zd8zdlx1e45q2.R.flushNeeded();}}

}
