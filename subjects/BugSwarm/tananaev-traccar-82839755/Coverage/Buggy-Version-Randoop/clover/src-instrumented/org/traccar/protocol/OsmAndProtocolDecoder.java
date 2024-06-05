/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class OsmAndProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26gs6gslx1e44wq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,8459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public OsmAndProtocolDecoder(OsmAndProtocol protocol) {
        super(protocol);__CLR4_5_26gs6gslx1e44wq.R.inc(8381);try{__CLR4_5_26gs6gslx1e44wq.R.inc(8380);
    }finally{__CLR4_5_26gs6gslx1e44wq.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_26gs6gslx1e44wq.R.inc(8382);
        
        __CLR4_5_26gs6gslx1e44wq.R.inc(8383);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_26gs6gslx1e44wq.R.inc(8384);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
        __CLR4_5_26gs6gslx1e44wq.R.inc(8385);Map<String, List<String>> params = decoder.getParameters();
        __CLR4_5_26gs6gslx1e44wq.R.inc(8386);if ((((params.isEmpty())&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8387)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8388)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8389);decoder = new QueryStringDecoder(
                    request.getContent().toString(Charset.defaultCharset()), false);
            __CLR4_5_26gs6gslx1e44wq.R.inc(8390);params = decoder.getParameters();
        }

        // Create new position
        }__CLR4_5_26gs6gslx1e44wq.R.inc(8391);Position position = new Position();
        __CLR4_5_26gs6gslx1e44wq.R.inc(8392);position.setProtocol(getProtocolName());

        // Identification
        __CLR4_5_26gs6gslx1e44wq.R.inc(8393);String id = params.get((((params.containsKey("id") )&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8394)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8395)==0&false))? "id" : "deviceid").get(0);
        __CLR4_5_26gs6gslx1e44wq.R.inc(8396);if ((((!identify(id, channel))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8397)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8398)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8399);return null;
        }
        }__CLR4_5_26gs6gslx1e44wq.R.inc(8400);position.setDeviceId(getDeviceId());

        // Decode position
        __CLR4_5_26gs6gslx1e44wq.R.inc(8401);position.setValid(true);
        __CLR4_5_26gs6gslx1e44wq.R.inc(8402);if ((((params.containsKey("timestamp"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8403)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8404)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8405);try {
                __CLR4_5_26gs6gslx1e44wq.R.inc(8406);long timestamp = Long.valueOf(params.get("timestamp").get(0));
                __CLR4_5_26gs6gslx1e44wq.R.inc(8407);if ((((timestamp < Integer.MAX_VALUE)&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8408)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8409)==0&false))) {{
                    __CLR4_5_26gs6gslx1e44wq.R.inc(8410);timestamp *= 1000;
                }
                }__CLR4_5_26gs6gslx1e44wq.R.inc(8411);position.setTime(new Date(timestamp));
            } catch (NumberFormatException error) {
                __CLR4_5_26gs6gslx1e44wq.R.inc(8412);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                __CLR4_5_26gs6gslx1e44wq.R.inc(8413);position.setTime(dateFormat.parse(params.get("timestamp").get(0)));
            }
        } }else {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8414);position.setTime(new Date());
        }
        }__CLR4_5_26gs6gslx1e44wq.R.inc(8415);position.setLatitude(Double.valueOf(params.get("lat").get(0)));
        __CLR4_5_26gs6gslx1e44wq.R.inc(8416);position.setLongitude(Double.valueOf(params.get("lon").get(0)));

        // Optional parameters
        __CLR4_5_26gs6gslx1e44wq.R.inc(8417);if ((((params.containsKey("speed"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8418)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8419)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8420);position.setSpeed(Double.valueOf(params.get("speed").get(0)));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8421);if ((((params.containsKey("bearing"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8422)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8423)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8424);position.setCourse(Double.valueOf(params.get("bearing").get(0)));
        } }else {__CLR4_5_26gs6gslx1e44wq.R.inc(8425);if ((((params.containsKey("heading"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8426)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8427)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8428);position.setCourse(Double.valueOf(params.get("heading").get(0)));
        }

        }}__CLR4_5_26gs6gslx1e44wq.R.inc(8429);if ((((params.containsKey("altitude"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8430)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8431)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8432);position.setAltitude(Double.valueOf(params.get("altitude").get(0)));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8433);if ((((params.containsKey("hdop"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8434)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8435)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8436);position.set(Event.KEY_HDOP, params.get("hdop").get(0));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8437);if ((((params.containsKey("vacc"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8438)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8439)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8440);position.set("vacc", params.get("vacc").get(0));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8441);if ((((params.containsKey("hacc"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8442)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8443)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8444);position.set("hacc", params.get("hacc").get(0));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8445);if ((((params.containsKey("batt"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8446)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8447)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8448);position.set(Event.KEY_BATTERY, params.get("batt").get(0));
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8449);if ((((params.containsKey("desc"))&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8450)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8451)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8452);position.set("description", params.get("desc").get(0));
        }

        // Send response
        }__CLR4_5_26gs6gslx1e44wq.R.inc(8453);if ((((channel != null)&&(__CLR4_5_26gs6gslx1e44wq.R.iget(8454)!=0|true))||(__CLR4_5_26gs6gslx1e44wq.R.iget(8455)==0&false))) {{
            __CLR4_5_26gs6gslx1e44wq.R.inc(8456);HttpResponse response = new DefaultHttpResponse(
                    HttpVersion.HTTP_1_1, HttpResponseStatus.OK);
            __CLR4_5_26gs6gslx1e44wq.R.inc(8457);channel.write(response).addListener(ChannelFutureListener.CLOSE);
        }

        }__CLR4_5_26gs6gslx1e44wq.R.inc(8458);return position;
    }finally{__CLR4_5_26gs6gslx1e44wq.R.flushNeeded();}}

}
