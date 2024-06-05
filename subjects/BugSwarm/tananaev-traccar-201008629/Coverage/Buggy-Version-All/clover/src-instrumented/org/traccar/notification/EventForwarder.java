/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.notification;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder;
import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Geofence;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public final class EventForwarder {public static class __CLR4_5_24q94q9lx1dxmwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,6174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String url;
    private String header;

    public EventForwarder() {try{__CLR4_5_24q94q9lx1dxmwm.R.inc(6129);
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6130);url = Context.getConfig().getString("event.forward.url", "http://localhost/");
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6131);header = Context.getConfig().getString("event.forward.header", "");
    }finally{__CLR4_5_24q94q9lx1dxmwm.R.flushNeeded();}}

    private static final String KEY_POSITION = "position";
    private static final String KEY_EVENT = "event";
    private static final String KEY_GEOFENCE = "geofence";
    private static final String KEY_DEVICE = "device";

    public void forwardEvent(Event event, Position position) {try{__CLR4_5_24q94q9lx1dxmwm.R.inc(6132);

        __CLR4_5_24q94q9lx1dxmwm.R.inc(6133);BoundRequestBuilder requestBuilder = Context.getAsyncHttpClient().preparePost(url);

        __CLR4_5_24q94q9lx1dxmwm.R.inc(6134);requestBuilder.addHeader("Content-Type", "application/json; charset=utf-8");
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6135);if ((((!header.equals(""))&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6136)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6137)==0&false))) {{
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6138);String[] headerLines = header.split("\\r?\\n");
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6139);for (String headerLine: headerLines) {{
                __CLR4_5_24q94q9lx1dxmwm.R.inc(6140);String[] splitedLine = headerLine.split(":", 2);
                __CLR4_5_24q94q9lx1dxmwm.R.inc(6141);if ((((splitedLine.length == 2)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6142)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6143)==0&false))) {{
                    __CLR4_5_24q94q9lx1dxmwm.R.inc(6144);requestBuilder.setHeader(splitedLine[0].trim(), splitedLine[1].trim());
                }
            }}
        }}

        }__CLR4_5_24q94q9lx1dxmwm.R.inc(6145);requestBuilder.setBody(preparePayload(event, position));
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6146);requestBuilder.execute();
    }finally{__CLR4_5_24q94q9lx1dxmwm.R.flushNeeded();}}

    private byte[] preparePayload(Event event, Position position) {try{__CLR4_5_24q94q9lx1dxmwm.R.inc(6147);
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6148);Map<String, Object> data = new HashMap<>();
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6149);data.put(KEY_EVENT, event);
        __CLR4_5_24q94q9lx1dxmwm.R.inc(6150);if ((((position != null)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6151)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6152)==0&false))) {{
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6153);data.put(KEY_POSITION, position);
        }
        }__CLR4_5_24q94q9lx1dxmwm.R.inc(6154);if ((((event.getDeviceId() != 0)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6155)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6156)==0&false))) {{
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6157);Device device = Context.getIdentityManager().getDeviceById(event.getDeviceId());
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6158);if ((((device != null)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6159)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6160)==0&false))) {{
                __CLR4_5_24q94q9lx1dxmwm.R.inc(6161);data.put(KEY_DEVICE, device);
            }
        }}
        }__CLR4_5_24q94q9lx1dxmwm.R.inc(6162);if ((((event.getGeofenceId() != 0)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6163)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6164)==0&false))) {{
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6165);Geofence geofence = Context.getGeofenceManager().getGeofence(event.getGeofenceId());
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6166);if ((((geofence != null)&&(__CLR4_5_24q94q9lx1dxmwm.R.iget(6167)!=0|true))||(__CLR4_5_24q94q9lx1dxmwm.R.iget(6168)==0&false))) {{
                __CLR4_5_24q94q9lx1dxmwm.R.inc(6169);data.put(KEY_GEOFENCE, geofence);
            }
        }}
        }__CLR4_5_24q94q9lx1dxmwm.R.inc(6170);try {
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6171);return Context.getObjectMapper().writeValueAsString(data).getBytes(StandardCharsets.UTF_8);
        } catch (JsonProcessingException e) {
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6172);Log.warning(e);
            __CLR4_5_24q94q9lx1dxmwm.R.inc(6173);return null;
        }
    }finally{__CLR4_5_24q94q9lx1dxmwm.R.flushNeeded();}}

}
