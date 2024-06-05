/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Jan-Piet Mens (jpmens@gmail.com)
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.protocol;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpHeaders;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.model.Position;
import org.traccar.helper.UnitsConverter;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;

public class OwnTracksProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e43e43lwye417e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,18357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OwnTracksProtocolDecoder(OwnTracksProtocol protocol) {
        super(protocol);__CLR4_5_2e43e43lwye417e.R.inc(18292);try{__CLR4_5_2e43e43lwye417e.R.inc(18291);
    }finally{__CLR4_5_2e43e43lwye417e.R.flushNeeded();}}

    private void sendResponse(Channel channel, HttpResponseStatus status) {try{__CLR4_5_2e43e43lwye417e.R.inc(18293);
        __CLR4_5_2e43e43lwye417e.R.inc(18294);if ((((channel != null)&&(__CLR4_5_2e43e43lwye417e.R.iget(18295)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18296)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18297);HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, status);
            __CLR4_5_2e43e43lwye417e.R.inc(18298);response.headers().add(HttpHeaders.Names.CONTENT_LENGTH, 0);
            __CLR4_5_2e43e43lwye417e.R.inc(18299);channel.write(response);
        }
    }}finally{__CLR4_5_2e43e43lwye417e.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e43e43lwye417e.R.inc(18300);

        __CLR4_5_2e43e43lwye417e.R.inc(18301);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2e43e43lwye417e.R.inc(18302);JsonObject root = Json.createReader(
                new StringReader(request.getContent().toString(StandardCharsets.US_ASCII))).readObject();

        __CLR4_5_2e43e43lwye417e.R.inc(18303);if ((((!root.containsKey("_type") || !root.getString("_type").equals("location"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18304)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18305)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18306);sendResponse(channel, HttpResponseStatus.OK);
            __CLR4_5_2e43e43lwye417e.R.inc(18307);return null;
        }

        }__CLR4_5_2e43e43lwye417e.R.inc(18308);Position position = new Position();
        __CLR4_5_2e43e43lwye417e.R.inc(18309);position.setProtocol(getProtocolName());
        __CLR4_5_2e43e43lwye417e.R.inc(18310);position.setValid(true);

        __CLR4_5_2e43e43lwye417e.R.inc(18311);position.setLatitude(root.getJsonNumber("lat").doubleValue());
        __CLR4_5_2e43e43lwye417e.R.inc(18312);position.setLongitude(root.getJsonNumber("lon").doubleValue());

        __CLR4_5_2e43e43lwye417e.R.inc(18313);if ((((root.containsKey("vel"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18314)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18315)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18316);position.setSpeed(UnitsConverter.knotsFromKph(root.getInt("vel")));
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18317);if ((((root.containsKey("alt"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18318)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18319)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18320);position.setAltitude(root.getInt("alt"));
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18321);if ((((root.containsKey("cog"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18322)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18323)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18324);position.setCourse(root.getInt("cog"));
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18325);if ((((root.containsKey("acc"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18326)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18327)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18328);position.setAccuracy(root.getInt("acc"));
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18329);if ((((root.containsKey("t"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18330)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18331)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18332);position.set("t", root.getString("t"));
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18333);if ((((root.containsKey("batt"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18334)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18335)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18336);position.set(Position.KEY_BATTERY, root.getInt("batt"));
        }

        }__CLR4_5_2e43e43lwye417e.R.inc(18337);position.setTime(new Date(root.getJsonNumber("tst").longValue() * 1000));

        __CLR4_5_2e43e43lwye417e.R.inc(18338);String uniqueId;

        __CLR4_5_2e43e43lwye417e.R.inc(18339);if ((((root.containsKey("topic"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18340)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18341)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18342);uniqueId = root.getString("topic");
            __CLR4_5_2e43e43lwye417e.R.inc(18343);if ((((root.containsKey("tid"))&&(__CLR4_5_2e43e43lwye417e.R.iget(18344)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18345)==0&false))) {{
                __CLR4_5_2e43e43lwye417e.R.inc(18346);position.set("tid", root.getString("tid"));
            }
        }} }else {{
            __CLR4_5_2e43e43lwye417e.R.inc(18347);uniqueId = root.getString("tid");
        }

        }__CLR4_5_2e43e43lwye417e.R.inc(18348);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, uniqueId);
        __CLR4_5_2e43e43lwye417e.R.inc(18349);if ((((deviceSession == null)&&(__CLR4_5_2e43e43lwye417e.R.iget(18350)!=0|true))||(__CLR4_5_2e43e43lwye417e.R.iget(18351)==0&false))) {{
            __CLR4_5_2e43e43lwye417e.R.inc(18352);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
            __CLR4_5_2e43e43lwye417e.R.inc(18353);return null;
        }
        }__CLR4_5_2e43e43lwye417e.R.inc(18354);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2e43e43lwye417e.R.inc(18355);sendResponse(channel, HttpResponseStatus.OK);
        __CLR4_5_2e43e43lwye417e.R.inc(18356);return position;
    }finally{__CLR4_5_2e43e43lwye417e.R.flushNeeded();}}
}
