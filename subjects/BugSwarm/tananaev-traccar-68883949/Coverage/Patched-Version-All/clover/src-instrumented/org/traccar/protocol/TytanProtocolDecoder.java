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
package org.traccar.protocol;

import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.*;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class TytanProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27q97q9lx1dsny6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,10204,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TytanProtocolDecoder(TytanProtocol protocol) {
        super(protocol);__CLR4_5_27q97q9lx1dsny6.R.inc(10018);try{__CLR4_5_27q97q9lx1dsny6.R.inc(10017);
    }finally{__CLR4_5_27q97q9lx1dsny6.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27q97q9lx1dsny6.R.inc(10019);

        __CLR4_5_27q97q9lx1dsny6.R.inc(10020);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_27q97q9lx1dsny6.R.inc(10021);buf.readUnsignedByte(); // protocol
        __CLR4_5_27q97q9lx1dsny6.R.inc(10022);int index = buf.readUnsignedByte() >> 3;
        
        __CLR4_5_27q97q9lx1dsny6.R.inc(10023);if ((((channel != null)&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10024)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10025)==0&false))) {{
            __CLR4_5_27q97q9lx1dsny6.R.inc(10026);ChannelBuffer response = ChannelBuffers.copiedBuffer(
                    "^" + index, Charset.defaultCharset());
            __CLR4_5_27q97q9lx1dsny6.R.inc(10027);channel.write(response, remoteAddress);
        }
        
        }__CLR4_5_27q97q9lx1dsny6.R.inc(10028);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_27q97q9lx1dsny6.R.inc(10029);if ((((!identify(id, channel, remoteAddress))&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10030)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10031)==0&false))) {{
            __CLR4_5_27q97q9lx1dsny6.R.inc(10032);return null;
        }

        }__CLR4_5_27q97q9lx1dsny6.R.inc(10033);List<Position> positions = new LinkedList<Position>();
        
        __CLR4_5_27q97q9lx1dsny6.R.inc(10034);while ((((buf.readable())&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10035)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10036)==0&false))) {{
            
            __CLR4_5_27q97q9lx1dsny6.R.inc(10037);Position position = new Position();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10038);position.setProtocol(getProtocolName());
            __CLR4_5_27q97q9lx1dsny6.R.inc(10039);position.setDeviceId(getDeviceId());
            
            __CLR4_5_27q97q9lx1dsny6.R.inc(10040);int end = buf.readerIndex() + buf.readUnsignedByte();
            
            __CLR4_5_27q97q9lx1dsny6.R.inc(10041);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            
            __CLR4_5_27q97q9lx1dsny6.R.inc(10042);int flags = buf.readUnsignedByte();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10043);position.set(Event.KEY_GPS, flags >> 5);
            __CLR4_5_27q97q9lx1dsny6.R.inc(10044);position.set(Event.KEY_GSM, flags & 0x07);
            __CLR4_5_27q97q9lx1dsny6.R.inc(10045);position.setValid(((flags & 0x08) != 0) ^ ((flags & 0x10) != 0));
            
            // Latitude
            __CLR4_5_27q97q9lx1dsny6.R.inc(10046);double lat = buf.readUnsignedMedium();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10047);lat = lat * -180 / 16777216 + 90;
            __CLR4_5_27q97q9lx1dsny6.R.inc(10048);position.setLatitude(lat);
            
            // Longitude
            __CLR4_5_27q97q9lx1dsny6.R.inc(10049);double lon = buf.readUnsignedMedium();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10050);lon = lon * 360 / 16777216 - 180;
            __CLR4_5_27q97q9lx1dsny6.R.inc(10051);position.setLongitude(lon);
            
            // Status
            __CLR4_5_27q97q9lx1dsny6.R.inc(10052);flags = buf.readUnsignedByte();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10053);position.set(Event.KEY_STATUS, flags & 0x1f);
            __CLR4_5_27q97q9lx1dsny6.R.inc(10054);int course = (flags >> 5) * 45;
            __CLR4_5_27q97q9lx1dsny6.R.inc(10055);course = (course + 180) % 360;
            __CLR4_5_27q97q9lx1dsny6.R.inc(10056);position.setCourse(course);
            
            // Speed
            __CLR4_5_27q97q9lx1dsny6.R.inc(10057);int speed = buf.readUnsignedByte();
            __CLR4_5_27q97q9lx1dsny6.R.inc(10058);if ((((speed < 250)&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10059)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10060)==0&false))) {{
                __CLR4_5_27q97q9lx1dsny6.R.inc(10061);position.setSpeed(UnitsConverter.knotsFromKph(speed));
            }
            
            }__CLR4_5_27q97q9lx1dsny6.R.inc(10062);while ((((buf.readerIndex() < end)&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10063)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10064)==0&false))) {{
                __CLR4_5_27q97q9lx1dsny6.R.inc(10065);int x = buf.getUnsignedByte(buf.readerIndex());
                boolean __CLB4_5_2_bool0=false;__CLR4_5_27q97q9lx1dsny6.R.inc(10066);switch (buf.readUnsignedByte()) {
                    case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10067);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10068);position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10069);break;
                    case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10070);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10071);buf.readUnsignedShort(); // device start
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10072);break;
                    case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10073);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10074);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10075);break;
                    case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10076);__CLB4_5_2_bool0=true;}
                        {
                            __CLR4_5_27q97q9lx1dsny6.R.inc(10077);int n = buf.readUnsignedByte() >> 4;
                            __CLR4_5_27q97q9lx1dsny6.R.inc(10078);if ((((n < 2)&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10079)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10080)==0&false))) {{
                                __CLR4_5_27q97q9lx1dsny6.R.inc(10081);position.set(Event.PREFIX_ADC + n, buf.readFloat());
                            } }else {{
                                __CLR4_5_27q97q9lx1dsny6.R.inc(10082);position.set("di" + (n - 2), buf.readFloat());
                            }
                        }}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10083);break;
                    case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10084);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10085);position.set(Event.KEY_ALARM, buf.readUnsignedShort());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10086);break;
                    case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10087);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10088);position.set("antihijack", buf.readUnsignedByte());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10089);break;
                    case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10090);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10091);position.set("authorized", ChannelBufferTools.readHexString(buf, 16));
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10092);break;
                    case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10093);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10094);position.set("unauthorized", ChannelBufferTools.readHexString(buf, 16));
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10095);break;
                    case 23:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10096);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10097);buf.skipBytes(9);
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10098);break;
                    case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10099);__CLB4_5_2_bool0=true;}
                        {
                            __CLR4_5_27q97q9lx1dsny6.R.inc(10100);Set<Integer> temps = new LinkedHashSet<Integer>();
                            __CLR4_5_27q97q9lx1dsny6.R.inc(10101);int temp = buf.readUnsignedByte();
                            __CLR4_5_27q97q9lx1dsny6.R.inc(10102);for (int i = 3; (((i >= 0)&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10103)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10104)==0&false)); i--) {{
                                __CLR4_5_27q97q9lx1dsny6.R.inc(10105);int n = (temp >> (2 * i)) & 0x03;
                                __CLR4_5_27q97q9lx1dsny6.R.inc(10106);if ((((!temps.contains(n))&&(__CLR4_5_27q97q9lx1dsny6.R.iget(10107)!=0|true))||(__CLR4_5_27q97q9lx1dsny6.R.iget(10108)==0&false))) {{
                                    __CLR4_5_27q97q9lx1dsny6.R.inc(10109);temps.add(n);
                                }
                            }}
                            }__CLR4_5_27q97q9lx1dsny6.R.inc(10110);for (int n : temps) {{
                                __CLR4_5_27q97q9lx1dsny6.R.inc(10111);position.set(Event.PREFIX_TEMP + n, buf.readUnsignedByte());
                            }
                        }}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10112);break;
                    case 25:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10113);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10114);buf.readUnsignedByte();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10115);buf.readUnsignedShort(); // fuel
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10116);break;
                    case 26:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10117);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10118);buf.skipBytes(buf.readUnsignedByte() * 2); // flowmeter
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10119);break;
                    case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10120);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10121);position.set("weight", buf.readUnsignedShort());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10122);buf.readUnsignedByte();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10123);break;
                    case 29:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10124);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10125);buf.readUnsignedByte(); // diagnostics
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10126);break;
                    case 30:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10127);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10128);buf.readUnsignedByte(); // vending machine
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10129);buf.readUnsignedInt();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10130);buf.readUnsignedInt();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10131);buf.readUnsignedInt();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10132);break;
                    case 31:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10133);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10134);buf.readUnsignedByte(); // antihijack
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10135);break;
                    case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10136);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10137);buf.readUnsignedByte(); // audio
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10138);break;
                    case 33:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10139);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10140);buf.readUnsignedByte(); // antihijack and authorization
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10141);break;
                    case 80:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10142);__CLB4_5_2_bool0=true;}
                    case 81:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10143);__CLB4_5_2_bool0=true;}
                    case 82:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10144);__CLB4_5_2_bool0=true;}
                    case 83:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10145);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10146);buf.readUnsignedInt(); // diagnostic
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10147);break;
                    case 90:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10148);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10149);position.set(Event.KEY_POWER, buf.readFloat());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10150);break;
                    case 99:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10151);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10152);buf.readUnsignedInt(); // tachograph
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10153);break;
                    case 101:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10154);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10155);buf.readUnsignedByte(); // speed
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10156);break;
                    case 102:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10157);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10158);buf.readUnsignedByte(); // engine rpm
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10159);break;
                    case 103:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10160);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10161);buf.readUnsignedByte(); // engine temperature
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10162);break;
                    case 104:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10163);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10164);buf.readUnsignedByte(); // pedal position
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10165);break;
                    case 105:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10166);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10167);buf.readUnsignedByte(); // engine load
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10168);break;
                    case 107:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10169);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10170);position.set(Event.KEY_FUEL, buf.readUnsignedShort() & 0x3fff);
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10171);break;
                    case 108:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10172);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10173);buf.readUnsignedInt(); // total distance
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10174);break;
                    case 109:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10175);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10176);buf.readUnsignedByte(); // ambient temperature
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10177);break;
                    case 122:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10178);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10179);buf.readUnsignedByte(); // power take-off state
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10180);break;
                    case 127:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10181);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10182);buf.readUnsignedInt(); // total fuel used
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10183);break;
                    case 129:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10184);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10185);buf.readUnsignedInt(); // engine total hours
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10186);break;
                    case 130:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10187);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10188);buf.readUnsignedShort(); // distance to service
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10189);break;
                    case 131:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10190);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10191);buf.readUnsignedShort(); // axle weight
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10192);buf.readUnsignedShort();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10193);buf.readUnsignedShort();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10194);buf.readUnsignedShort();
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10195);break;
                    case 136:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10196);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10197);buf.readUnsignedShort(); // fuel rate
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10198);break;
                    case 150:if (!__CLB4_5_2_bool0) {__CLR4_5_27q97q9lx1dsny6.R.inc(10199);__CLB4_5_2_bool0=true;}
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10200);position.set("door", buf.readUnsignedByte());
                        __CLR4_5_27q97q9lx1dsny6.R.inc(10201);break;
                }
            }
            }__CLR4_5_27q97q9lx1dsny6.R.inc(10202);positions.add(position);
        }
        
        }__CLR4_5_27q97q9lx1dsny6.R.inc(10203);return positions;
    }finally{__CLR4_5_27q97q9lx1dsny6.R.flushNeeded();}}

}
