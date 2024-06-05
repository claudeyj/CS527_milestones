/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
import org.joda.time.format.ISODateTimeFormat;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@java.lang.SuppressWarnings({"fallthrough"}) public class OsmAndProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e12e12lwye416i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,18283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OsmAndProtocolDecoder(OsmAndProtocol protocol) {
        super(protocol);__CLR4_5_2e12e12lwye416i.R.inc(18183);try{__CLR4_5_2e12e12lwye416i.R.inc(18182);
    }finally{__CLR4_5_2e12e12lwye416i.R.flushNeeded();}}

    private void sendResponse(Channel channel, HttpResponseStatus status) {try{__CLR4_5_2e12e12lwye416i.R.inc(18184);
        __CLR4_5_2e12e12lwye416i.R.inc(18185);if ((((channel != null)&&(__CLR4_5_2e12e12lwye416i.R.iget(18186)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18187)==0&false))) {{
            __CLR4_5_2e12e12lwye416i.R.inc(18188);HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, status);
            __CLR4_5_2e12e12lwye416i.R.inc(18189);response.headers().add(HttpHeaders.Names.CONTENT_LENGTH, 0);
            __CLR4_5_2e12e12lwye416i.R.inc(18190);channel.write(response);
        }
    }}finally{__CLR4_5_2e12e12lwye416i.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e12e12lwye416i.R.inc(18191);

        __CLR4_5_2e12e12lwye416i.R.inc(18192);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2e12e12lwye416i.R.inc(18193);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
        __CLR4_5_2e12e12lwye416i.R.inc(18194);Map<String, List<String>> params = decoder.getParameters();
        __CLR4_5_2e12e12lwye416i.R.inc(18195);if ((((params.isEmpty())&&(__CLR4_5_2e12e12lwye416i.R.iget(18196)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18197)==0&false))) {{
            __CLR4_5_2e12e12lwye416i.R.inc(18198);decoder = new QueryStringDecoder(request.getContent().toString(StandardCharsets.US_ASCII), false);
            __CLR4_5_2e12e12lwye416i.R.inc(18199);params = decoder.getParameters();
        }

        }__CLR4_5_2e12e12lwye416i.R.inc(18200);Position position = new Position();
        __CLR4_5_2e12e12lwye416i.R.inc(18201);position.setProtocol(getProtocolName());
        __CLR4_5_2e12e12lwye416i.R.inc(18202);position.setValid(true);

        __CLR4_5_2e12e12lwye416i.R.inc(18203);for (Map.Entry<String, List<String>> entry : params.entrySet()) {{
            __CLR4_5_2e12e12lwye416i.R.inc(18204);String value = entry.getValue().get(0);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2e12e12lwye416i.R.inc(18205);switch (entry.getKey()) {
                case "id":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18206);__CLB4_5_2_bool0=true;}
                case "deviceid":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18207);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18208);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, value);
                    __CLR4_5_2e12e12lwye416i.R.inc(18209);if ((((deviceSession == null)&&(__CLR4_5_2e12e12lwye416i.R.iget(18210)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18211)==0&false))) {{
                        __CLR4_5_2e12e12lwye416i.R.inc(18212);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
                        __CLR4_5_2e12e12lwye416i.R.inc(18213);return null;
                    }
                    }__CLR4_5_2e12e12lwye416i.R.inc(18214);position.setDeviceId(deviceSession.getDeviceId());
                    __CLR4_5_2e12e12lwye416i.R.inc(18215);break;
                case "valid":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18216);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18217);position.setValid(Boolean.parseBoolean(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18218);break;
                case "timestamp":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18219);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18220);try {
                        __CLR4_5_2e12e12lwye416i.R.inc(18221);long timestamp = Long.parseLong(value);
                        __CLR4_5_2e12e12lwye416i.R.inc(18222);if ((((timestamp < Integer.MAX_VALUE)&&(__CLR4_5_2e12e12lwye416i.R.iget(18223)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18224)==0&false))) {{
                            __CLR4_5_2e12e12lwye416i.R.inc(18225);timestamp *= 1000;
                        }
                        }__CLR4_5_2e12e12lwye416i.R.inc(18226);position.setTime(new Date(timestamp));
                    } catch (NumberFormatException error) {
                        __CLR4_5_2e12e12lwye416i.R.inc(18227);if ((((value.contains("T"))&&(__CLR4_5_2e12e12lwye416i.R.iget(18228)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18229)==0&false))) {{
                            __CLR4_5_2e12e12lwye416i.R.inc(18230);position.setTime(new Date(
                                    ISODateTimeFormat.dateTimeParser().parseMillis(value)));
                        } }else {{
                            __CLR4_5_2e12e12lwye416i.R.inc(18231);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            __CLR4_5_2e12e12lwye416i.R.inc(18232);position.setTime(dateFormat.parse(value));
                        }
                    }}
                    __CLR4_5_2e12e12lwye416i.R.inc(18233);break;
                case "lat":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18234);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18235);position.setLatitude(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18236);break;
                case "lon":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18237);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18238);position.setLongitude(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18239);break;
                case "location":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18240);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18241);String[] location = value.split(",");
                    __CLR4_5_2e12e12lwye416i.R.inc(18242);position.setLatitude(Double.parseDouble(location[0]));
                    __CLR4_5_2e12e12lwye416i.R.inc(18243);position.setLongitude(Double.parseDouble(location[1]));
                    __CLR4_5_2e12e12lwye416i.R.inc(18244);break;
                case "speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18245);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18246);position.setSpeed(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18247);break;
                case "bearing":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18248);__CLB4_5_2_bool0=true;}
                case "heading":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18249);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18250);position.setCourse(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18251);break;
                case "altitude":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18252);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18253);position.setAltitude(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18254);break;
                case "accuracy":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18255);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18256);position.setAccuracy(Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18257);break;
                case "hdop":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18258);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18259);position.set(Position.KEY_HDOP, Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18260);break;
                case "batt":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18261);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18262);position.set(Position.KEY_BATTERY_LEVEL, Double.parseDouble(value));
                    __CLR4_5_2e12e12lwye416i.R.inc(18263);break;
                case "driverUniqueId":if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18264);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18265);position.set(Position.KEY_DRIVER_UNIQUE_ID, value);
                    __CLR4_5_2e12e12lwye416i.R.inc(18266);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2e12e12lwye416i.R.inc(18267);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2e12e12lwye416i.R.inc(18268);try {
                        __CLR4_5_2e12e12lwye416i.R.inc(18269);position.set(entry.getKey(), Double.parseDouble(value));
                    } catch (NumberFormatException e) {
                        __CLR4_5_2e12e12lwye416i.R.inc(18270);position.set(entry.getKey(), value);
                    }
                    __CLR4_5_2e12e12lwye416i.R.inc(18271);break;
            }
        }

        }__CLR4_5_2e12e12lwye416i.R.inc(18272);if ((((position.getFixTime() == null)&&(__CLR4_5_2e12e12lwye416i.R.iget(18273)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18274)==0&false))) {{
            __CLR4_5_2e12e12lwye416i.R.inc(18275);position.setTime(new Date());
        }

        }__CLR4_5_2e12e12lwye416i.R.inc(18276);if ((((position.getDeviceId() != 0)&&(__CLR4_5_2e12e12lwye416i.R.iget(18277)!=0|true))||(__CLR4_5_2e12e12lwye416i.R.iget(18278)==0&false))) {{
            __CLR4_5_2e12e12lwye416i.R.inc(18279);sendResponse(channel, HttpResponseStatus.OK);
            __CLR4_5_2e12e12lwye416i.R.inc(18280);return position;
        } }else {{
            __CLR4_5_2e12e12lwye416i.R.inc(18281);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
            __CLR4_5_2e12e12lwye416i.R.inc(18282);return null;
        }
    }}finally{__CLR4_5_2e12e12lwye416i.R.flushNeeded();}}

}
