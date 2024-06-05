/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.StringReader;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

@java.lang.SuppressWarnings({"fallthrough"}) public class DmtHttpProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_283y83ylwydyial{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,10594,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DmtHttpProtocolDecoder(DmtHttpProtocol protocol) {
        super(protocol);__CLR4_5_283y83ylwydyial.R.inc(10511);try{__CLR4_5_283y83ylwydyial.R.inc(10510);
    }finally{__CLR4_5_283y83ylwydyial.R.flushNeeded();}}

    private void sendResponse(Channel channel, HttpResponseStatus status) {try{__CLR4_5_283y83ylwydyial.R.inc(10512);
        __CLR4_5_283y83ylwydyial.R.inc(10513);if ((((channel != null)&&(__CLR4_5_283y83ylwydyial.R.iget(10514)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10515)==0&false))) {{
            __CLR4_5_283y83ylwydyial.R.inc(10516);HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, status);
            __CLR4_5_283y83ylwydyial.R.inc(10517);response.headers().add(HttpHeaders.Names.CONTENT_LENGTH, 0);
            __CLR4_5_283y83ylwydyial.R.inc(10518);channel.write(response);
        }
    }}finally{__CLR4_5_283y83ylwydyial.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_283y83ylwydyial.R.inc(10519);

        __CLR4_5_283y83ylwydyial.R.inc(10520);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_283y83ylwydyial.R.inc(10521);JsonObject root = Json.createReader(
                new StringReader(request.getContent().toString(StandardCharsets.US_ASCII))).readObject();

        __CLR4_5_283y83ylwydyial.R.inc(10522);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        __CLR4_5_283y83ylwydyial.R.inc(10523);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        __CLR4_5_283y83ylwydyial.R.inc(10524);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, root.getString("IMEI"));
        __CLR4_5_283y83ylwydyial.R.inc(10525);if ((((deviceSession == null)&&(__CLR4_5_283y83ylwydyial.R.iget(10526)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10527)==0&false))) {{
            __CLR4_5_283y83ylwydyial.R.inc(10528);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
            __CLR4_5_283y83ylwydyial.R.inc(10529);return null;
        }

        }__CLR4_5_283y83ylwydyial.R.inc(10530);List<Position> positions = new LinkedList<>();

        __CLR4_5_283y83ylwydyial.R.inc(10531);JsonArray records = root.getJsonArray("Records");

        __CLR4_5_283y83ylwydyial.R.inc(10532);for (int i = 0; (((i < records.size())&&(__CLR4_5_283y83ylwydyial.R.iget(10533)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10534)==0&false)); i++) {{
            __CLR4_5_283y83ylwydyial.R.inc(10535);Position position = new Position();
            __CLR4_5_283y83ylwydyial.R.inc(10536);position.setProtocol(getProtocolName());
            __CLR4_5_283y83ylwydyial.R.inc(10537);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_283y83ylwydyial.R.inc(10538);JsonObject record = records.getJsonObject(i);

            __CLR4_5_283y83ylwydyial.R.inc(10539);position.set(Position.KEY_INDEX, record.getInt("SeqNo"));
            __CLR4_5_283y83ylwydyial.R.inc(10540);position.set(Position.KEY_EVENT, record.getInt("Reason"));

            __CLR4_5_283y83ylwydyial.R.inc(10541);position.setDeviceTime(dateFormat.parse(record.getString("DateUTC")));

            __CLR4_5_283y83ylwydyial.R.inc(10542);JsonArray fields = record.getJsonArray("Fields");

            __CLR4_5_283y83ylwydyial.R.inc(10543);for (int j = 0; (((j < fields.size())&&(__CLR4_5_283y83ylwydyial.R.iget(10544)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10545)==0&false)); j++) {{
                __CLR4_5_283y83ylwydyial.R.inc(10546);JsonObject field = fields.getJsonObject(j);
                boolean __CLB4_5_2_bool0=false;__CLR4_5_283y83ylwydyial.R.inc(10547);switch (field.getInt("FType")) {
                    case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_283y83ylwydyial.R.inc(10548);__CLB4_5_2_bool0=true;}
                        __CLR4_5_283y83ylwydyial.R.inc(10549);position.setFixTime(dateFormat.parse(field.getString("GpsUTC")));
                        __CLR4_5_283y83ylwydyial.R.inc(10550);position.setLatitude(field.getJsonNumber("Lat").doubleValue());
                        __CLR4_5_283y83ylwydyial.R.inc(10551);position.setLongitude(field.getJsonNumber("Long").doubleValue());
                        __CLR4_5_283y83ylwydyial.R.inc(10552);position.setAltitude(field.getInt("Alt"));
                        __CLR4_5_283y83ylwydyial.R.inc(10553);position.setSpeed(UnitsConverter.knotsFromCps(field.getInt("Spd")));
                        __CLR4_5_283y83ylwydyial.R.inc(10554);position.setCourse(field.getInt("Head"));
                        __CLR4_5_283y83ylwydyial.R.inc(10555);position.setAccuracy(field.getInt("PosAcc"));
                        __CLR4_5_283y83ylwydyial.R.inc(10556);position.setValid(field.getInt("GpsStat") > 0);
                        __CLR4_5_283y83ylwydyial.R.inc(10557);break;
                    case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_283y83ylwydyial.R.inc(10558);__CLB4_5_2_bool0=true;}
                        __CLR4_5_283y83ylwydyial.R.inc(10559);int input = field.getInt("DIn");
                        __CLR4_5_283y83ylwydyial.R.inc(10560);int output = field.getInt("DOut");

                        __CLR4_5_283y83ylwydyial.R.inc(10561);position.set(Position.KEY_IGNITION, BitUtil.check(input, 0));

                        __CLR4_5_283y83ylwydyial.R.inc(10562);position.set(Position.KEY_INPUT, input);
                        __CLR4_5_283y83ylwydyial.R.inc(10563);position.set(Position.KEY_OUTPUT, output);
                        __CLR4_5_283y83ylwydyial.R.inc(10564);position.set(Position.KEY_STATUS, field.getInt("DevStat"));
                        __CLR4_5_283y83ylwydyial.R.inc(10565);break;
                    case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_283y83ylwydyial.R.inc(10566);__CLB4_5_2_bool0=true;}
                        __CLR4_5_283y83ylwydyial.R.inc(10567);JsonObject adc = field.getJsonObject("AnalogueData");
                        __CLR4_5_283y83ylwydyial.R.inc(10568);if ((((adc.containsKey("1"))&&(__CLR4_5_283y83ylwydyial.R.iget(10569)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10570)==0&false))) {{
                            __CLR4_5_283y83ylwydyial.R.inc(10571);position.set(Position.KEY_BATTERY, adc.getInt("1") * 0.001);
                        }
                        }__CLR4_5_283y83ylwydyial.R.inc(10572);if ((((adc.containsKey("2"))&&(__CLR4_5_283y83ylwydyial.R.iget(10573)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10574)==0&false))) {{
                            __CLR4_5_283y83ylwydyial.R.inc(10575);position.set(Position.KEY_POWER, adc.getInt("2") * 0.01);
                        }
                        }__CLR4_5_283y83ylwydyial.R.inc(10576);if ((((adc.containsKey("3"))&&(__CLR4_5_283y83ylwydyial.R.iget(10577)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10578)==0&false))) {{
                            __CLR4_5_283y83ylwydyial.R.inc(10579);position.set(Position.KEY_DEVICE_TEMP, adc.getInt("3") * 0.01);
                        }
                        }__CLR4_5_283y83ylwydyial.R.inc(10580);if ((((adc.containsKey("4"))&&(__CLR4_5_283y83ylwydyial.R.iget(10581)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10582)==0&false))) {{
                            __CLR4_5_283y83ylwydyial.R.inc(10583);position.set(Position.KEY_RSSI, adc.getInt("4"));
                        }
                        }__CLR4_5_283y83ylwydyial.R.inc(10584);if ((((adc.containsKey("5"))&&(__CLR4_5_283y83ylwydyial.R.iget(10585)!=0|true))||(__CLR4_5_283y83ylwydyial.R.iget(10586)==0&false))) {{
                            __CLR4_5_283y83ylwydyial.R.inc(10587);position.set("solarPower", adc.getInt("5") * 0.001);
                        }
                        }__CLR4_5_283y83ylwydyial.R.inc(10588);break;
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_283y83ylwydyial.R.inc(10589);__CLB4_5_2_bool0=true;}
                        __CLR4_5_283y83ylwydyial.R.inc(10590);break;
                }
            }

            }__CLR4_5_283y83ylwydyial.R.inc(10591);positions.add(position);
        }

        }__CLR4_5_283y83ylwydyial.R.inc(10592);sendResponse(channel, HttpResponseStatus.OK);
        __CLR4_5_283y83ylwydyial.R.inc(10593);return positions;
    }finally{__CLR4_5_283y83ylwydyial.R.flushNeeded();}}

}
