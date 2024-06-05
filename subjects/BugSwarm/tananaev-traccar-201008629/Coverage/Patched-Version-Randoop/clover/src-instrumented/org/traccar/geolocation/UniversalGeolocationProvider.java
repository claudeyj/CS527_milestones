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
package org.traccar.geolocation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.Response;
import org.traccar.Context;
import org.traccar.model.Network;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class UniversalGeolocationProvider implements GeolocationProvider {public static class __CLR4_5_23jz3jzlx1e0ett{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,4627,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String url;

    public UniversalGeolocationProvider(String url, String key) {try{__CLR4_5_23jz3jzlx1e0ett.R.inc(4607);
        __CLR4_5_23jz3jzlx1e0ett.R.inc(4608);this.url = url + "?key=" + key;
    }finally{__CLR4_5_23jz3jzlx1e0ett.R.flushNeeded();}}

    @Override
    public void getLocation(Network network, final LocationProviderCallback callback) {try{__CLR4_5_23jz3jzlx1e0ett.R.inc(4609);
        __CLR4_5_23jz3jzlx1e0ett.R.inc(4610);try {
            __CLR4_5_23jz3jzlx1e0ett.R.inc(4611);String request = Context.getObjectMapper().writeValueAsString(network);
            __CLR4_5_23jz3jzlx1e0ett.R.inc(4612);Context.getAsyncHttpClient().preparePost(url)
                    .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                    .setHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(request.length()))
                    .setBody(request).execute(new AsyncCompletionHandler() {
                @Override
                public Object onCompleted(Response response) throws Exception {try{__CLR4_5_23jz3jzlx1e0ett.R.inc(4613);
                    class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_23jz3jzlx1e0ett.R.inc(4614);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_23jz3jzlx1e0ett.R.inc(4615);}};JsonReader reader = Json.createReader(response.getResponseBodyAsStream())) {
                        __CLR4_5_23jz3jzlx1e0ett.R.inc(4616);JsonObject json = reader.readObject();
                        __CLR4_5_23jz3jzlx1e0ett.R.inc(4617);if ((((json.containsKey("error"))&&(__CLR4_5_23jz3jzlx1e0ett.R.iget(4618)!=0|true))||(__CLR4_5_23jz3jzlx1e0ett.R.iget(4619)==0&false))) {{
                            __CLR4_5_23jz3jzlx1e0ett.R.inc(4620);callback.onFailure(
                                    new GeolocationException(json.getJsonObject("error").getString("message")));
                        } }else {{
                            __CLR4_5_23jz3jzlx1e0ett.R.inc(4621);JsonObject location = json.getJsonObject("location");
                            __CLR4_5_23jz3jzlx1e0ett.R.inc(4622);callback.onSuccess(
                                    location.getJsonNumber("lat").doubleValue(),
                                    location.getJsonNumber("lng").doubleValue(),
                                    json.getJsonNumber("accuracy").doubleValue());
                        }
                    }}
                    __CLR4_5_23jz3jzlx1e0ett.R.inc(4623);return null;
                }finally{__CLR4_5_23jz3jzlx1e0ett.R.flushNeeded();}}

                @Override
                public void onThrowable(Throwable t) {try{__CLR4_5_23jz3jzlx1e0ett.R.inc(4624);
                    __CLR4_5_23jz3jzlx1e0ett.R.inc(4625);callback.onFailure(t);
                }finally{__CLR4_5_23jz3jzlx1e0ett.R.flushNeeded();}}
            });
        } catch (JsonProcessingException e) {
            __CLR4_5_23jz3jzlx1e0ett.R.inc(4626);callback.onFailure(e);
        }
    }finally{__CLR4_5_23jz3jzlx1e0ett.R.flushNeeded();}}

}
