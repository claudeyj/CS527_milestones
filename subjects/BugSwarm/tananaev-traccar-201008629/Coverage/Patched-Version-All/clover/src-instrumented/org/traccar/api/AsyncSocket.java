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
package org.traccar.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.traccar.Context;
import org.traccar.database.ConnectionManager;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AsyncSocket extends WebSocketAdapter implements ConnectionManager.UpdateListener {public static class __CLR4_5_210h10hlx1e1gss{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,1343,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String KEY_DEVICES = "devices";
    private static final String KEY_POSITIONS = "positions";
    private static final String KEY_EVENTS = "events";

    private long userId;

    public AsyncSocket(long userId) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1313);
        __CLR4_5_210h10hlx1e1gss.R.inc(1314);this.userId = userId;
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    @Override
    public void onWebSocketConnect(Session session) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1315);
        __CLR4_5_210h10hlx1e1gss.R.inc(1316);super.onWebSocketConnect(session);

        __CLR4_5_210h10hlx1e1gss.R.inc(1317);Map<String, Collection<?>> data = new HashMap<>();
        __CLR4_5_210h10hlx1e1gss.R.inc(1318);data.put(KEY_POSITIONS, Context.getDeviceManager().getInitialState(userId));
        __CLR4_5_210h10hlx1e1gss.R.inc(1319);sendData(data);

        __CLR4_5_210h10hlx1e1gss.R.inc(1320);Context.getConnectionManager().addListener(userId, this);
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    @Override
    public void onWebSocketClose(int statusCode, String reason) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1321);
        __CLR4_5_210h10hlx1e1gss.R.inc(1322);super.onWebSocketClose(statusCode, reason);

        __CLR4_5_210h10hlx1e1gss.R.inc(1323);Context.getConnectionManager().removeListener(userId, this);
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    @Override
    public void onUpdateDevice(Device device) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1324);
        __CLR4_5_210h10hlx1e1gss.R.inc(1325);Map<String, Collection<?>> data = new HashMap<>();
        __CLR4_5_210h10hlx1e1gss.R.inc(1326);data.put(KEY_DEVICES, Collections.singletonList(device));
        __CLR4_5_210h10hlx1e1gss.R.inc(1327);sendData(data);
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    @Override
    public void onUpdatePosition(Position position) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1328);
        __CLR4_5_210h10hlx1e1gss.R.inc(1329);Map<String, Collection<?>> data = new HashMap<>();
        __CLR4_5_210h10hlx1e1gss.R.inc(1330);data.put(KEY_POSITIONS, Collections.singletonList(position));
        __CLR4_5_210h10hlx1e1gss.R.inc(1331);sendData(data);
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    @Override
    public void onUpdateEvent(Event event) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1332);
        __CLR4_5_210h10hlx1e1gss.R.inc(1333);Map<String, Collection<?>> data = new HashMap<>();
        __CLR4_5_210h10hlx1e1gss.R.inc(1334);data.put(KEY_EVENTS, Collections.singletonList(event));
        __CLR4_5_210h10hlx1e1gss.R.inc(1335);sendData(data);
    }finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}

    private void sendData(Map<String, Collection<?>> data) {try{__CLR4_5_210h10hlx1e1gss.R.inc(1336);
        __CLR4_5_210h10hlx1e1gss.R.inc(1337);if ((((!data.isEmpty() && isConnected())&&(__CLR4_5_210h10hlx1e1gss.R.iget(1338)!=0|true))||(__CLR4_5_210h10hlx1e1gss.R.iget(1339)==0&false))) {{
            __CLR4_5_210h10hlx1e1gss.R.inc(1340);try {
                __CLR4_5_210h10hlx1e1gss.R.inc(1341);getRemote().sendString(Context.getObjectMapper().writeValueAsString(data), null);
            } catch (JsonProcessingException e) {
                __CLR4_5_210h10hlx1e1gss.R.inc(1342);Log.warning(e);
            }
        }
    }}finally{__CLR4_5_210h10hlx1e1gss.R.flushNeeded();}}
}
