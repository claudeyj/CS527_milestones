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

@java.lang.SuppressWarnings({"fallthrough"}) public class OsmAndProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c7rc7rlx1dwk8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,15927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OsmAndProtocolDecoder(OsmAndProtocol protocol) {
        super(protocol);__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15832);try{__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15831);
    }finally{__CLR4_5_2c7rc7rlx1dwk8m.R.flushNeeded();}}

    private void sendResponse(Channel channel, HttpResponseStatus status) {try{__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15833);
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15834);if ((((channel != null)&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15835)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15836)==0&false))) {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15837);HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, status);
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15838);response.headers().add(HttpHeaders.Names.CONTENT_LENGTH, 0);
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15839);channel.write(response);
        }
    }}finally{__CLR4_5_2c7rc7rlx1dwk8m.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15840);

        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15841);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15842);QueryStringDecoder decoder = new QueryStringDecoder(request.getUri());
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15843);Map<String, List<String>> params = decoder.getParameters();
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15844);if ((((params.isEmpty())&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15845)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15846)==0&false))) {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15847);decoder = new QueryStringDecoder(request.getContent().toString(StandardCharsets.US_ASCII), false);
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15848);params = decoder.getParameters();
        }

        }__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15849);Position position = new Position();
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15850);position.setProtocol(getProtocolName());
        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15851);position.setValid(true);

        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15852);for (Map.Entry<String, List<String>> entry : params.entrySet()) {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15853);String value = entry.getValue().get(0);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15854);switch (entry.getKey()) {
                case "id":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15855);__CLB4_5_2_bool0=true;}
                case "deviceid":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15856);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15857);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, value);
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15858);if ((((deviceSession == null)&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15859)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15860)==0&false))) {{
                        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15861);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
                        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15862);return null;
                    }
                    }__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15863);position.setDeviceId(deviceSession.getDeviceId());
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15864);break;
                case "valid":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15865);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15866);position.setValid(Boolean.parseBoolean(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15867);break;
                case "timestamp":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15868);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15869);try {
                        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15870);long timestamp = Long.parseLong(value);
                        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15871);if ((((timestamp < Integer.MAX_VALUE)&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15872)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15873)==0&false))) {{
                            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15874);timestamp *= 1000;
                        }
                        }__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15875);position.setTime(new Date(timestamp));
                    } catch (NumberFormatException error) {
                        __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15876);if ((((value.contains("T"))&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15877)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15878)==0&false))) {{
                            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15879);position.setTime(new Date(
                                    ISODateTimeFormat.dateTimeParser().parseMillis(value)));
                        } }else {{
                            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15880);DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15881);position.setTime(dateFormat.parse(value));
                        }
                    }}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15882);break;
                case "lat":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15883);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15884);position.setLatitude(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15885);break;
                case "lon":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15886);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15887);position.setLongitude(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15888);break;
                case "location":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15889);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15890);String[] location = value.split(",");
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15891);position.setLatitude(Double.parseDouble(location[0]));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15892);position.setLongitude(Double.parseDouble(location[1]));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15893);break;
                case "speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15894);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15895);position.setSpeed(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15896);break;
                case "bearing":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15897);__CLB4_5_2_bool0=true;}
                case "heading":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15898);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15899);position.setCourse(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15900);break;
                case "altitude":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15901);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15902);position.setAltitude(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15903);break;
                case "accuracy":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15904);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15905);position.setAccuracy(Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15906);break;
                case "hdop":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15907);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15908);position.set(Position.KEY_HDOP, Double.parseDouble(value));
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15909);break;
                case "batt":if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15910);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15911);position.set(Position.KEY_BATTERY, value);
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15912);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15913);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15914);position.set(entry.getKey(), value);
                    __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15915);break;
            }
        }

        }__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15916);if ((((position.getFixTime() == null)&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15917)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15918)==0&false))) {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15919);position.setTime(new Date());
        }

        }__CLR4_5_2c7rc7rlx1dwk8m.R.inc(15920);if ((((position.getDeviceId() != 0)&&(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15921)!=0|true))||(__CLR4_5_2c7rc7rlx1dwk8m.R.iget(15922)==0&false))) {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15923);sendResponse(channel, HttpResponseStatus.OK);
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15924);return position;
        } }else {{
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15925);sendResponse(channel, HttpResponseStatus.BAD_REQUEST);
            __CLR4_5_2c7rc7rlx1dwk8m.R.inc(15926);return null;
        }
    }}finally{__CLR4_5_2c7rc7rlx1dwk8m.R.flushNeeded();}}

}
