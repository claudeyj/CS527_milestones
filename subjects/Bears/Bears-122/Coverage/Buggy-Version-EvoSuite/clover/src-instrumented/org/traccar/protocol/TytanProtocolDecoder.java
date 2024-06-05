/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class TytanProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gz4gz4lwydwf3b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,22135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TytanProtocolDecoder(TytanProtocol protocol) {
        super(protocol);__CLR4_5_2gz4gz4lwydwf3b.R.inc(22001);try{__CLR4_5_2gz4gz4lwydwf3b.R.inc(22000);
    }finally{__CLR4_5_2gz4gz4lwydwf3b.R.flushNeeded();}}

    private void decodeExtraData(Position position, ChannelBuffer buf, int end) {try{__CLR4_5_2gz4gz4lwydwf3b.R.inc(22002);
        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22003);while ((((buf.readerIndex() < end)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22004)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22005)==0&false))) {{

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22006);int type = buf.readUnsignedByte();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22007);int length = buf.readUnsignedByte();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22008);if ((((length == 255)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22009)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22010)==0&false))) {{
                __CLR4_5_2gz4gz4lwydwf3b.R.inc(22011);length += buf.readUnsignedByte();
            }

            }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22012);int n;

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2gz4gz4lwydwf3b.R.inc(22013);switch (type) {
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22014);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22015);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedMedium());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22016);break;
                case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22017);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22018);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22019);break;
                case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22020);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22021);n = buf.readUnsignedByte() >> 4;
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22022);if ((((n < 2)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22023)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22024)==0&false))) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22025);position.set(Position.PREFIX_ADC + n, buf.readFloat());
                    } }else {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22026);position.set("di" + (n - 2), buf.readFloat());
                    }
                    }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22027);break;
                case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22028);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22029);int alarm = buf.readUnsignedByte();
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22030);buf.readUnsignedByte();
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22031);if ((((BitUtil.check(alarm, 5))&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22032)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22033)==0&false))) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22034);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22035);break;
                case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22036);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22037);position.set("antihijack", buf.readUnsignedByte());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22038);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22039);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22040);position.set("unauthorized", ChannelBuffers.hexDump(buf.readBytes(8)));
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22041);break;
                case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22042);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22043);position.set("authorized", ChannelBuffers.hexDump(buf.readBytes(8)));
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22044);break;
                case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22045);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22046);for (int i = 0; (((i < length / 2)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22047)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22048)==0&false)); i++) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22049);position.set(Position.PREFIX_TEMP + buf.readUnsignedByte(), buf.readByte());
                    }
                    }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22050);break;
                case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22051);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22052);position.set("weight", buf.readUnsignedShort());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22053);buf.readUnsignedByte();
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22054);break;
                case 90:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22055);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22056);position.set(Position.KEY_POWER, buf.readFloat());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22057);break;
                case 101:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22058);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22059);position.set(Position.KEY_OBD_SPEED, buf.readUnsignedByte());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22060);break;
                case 102:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22061);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22062);position.set(Position.KEY_RPM, buf.readUnsignedByte() * 50);
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22063);break;
                case 107:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22064);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22065);int fuel = buf.readUnsignedShort();
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22066);int fuelFormat = fuel >> 14;
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22067);if ((((fuelFormat == 1)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22068)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22069)==0&false))) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22070);position.set("fuelValue", (fuel & 0x3fff) * 0.4 + "%");
                    } }else {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22071);if ((((fuelFormat == 2)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22072)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22073)==0&false))) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22074);position.set("fuelValue", (fuel & 0x3fff) * 0.5 + " l");
                    } }else {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22075);if ((((fuelFormat == 3)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22076)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22077)==0&false))) {{
                        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22078);position.set("fuelValue", (fuel & 0x3fff) * -0.5 + " l");
                    }
                    }}}__CLR4_5_2gz4gz4lwydwf3b.R.inc(22079);break;
                case 108:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22080);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22081);position.set(Position.KEY_OBD_ODOMETER, buf.readUnsignedInt() * 5);
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22082);break;
                case 150:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22083);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22084);position.set("door", buf.readUnsignedByte());
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22085);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gz4gz4lwydwf3b.R.inc(22086);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22087);buf.skipBytes(length);
                    __CLR4_5_2gz4gz4lwydwf3b.R.inc(22088);break;
            }
        }
    }}finally{__CLR4_5_2gz4gz4lwydwf3b.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gz4gz4lwydwf3b.R.inc(22089);

        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22090);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22091);buf.readUnsignedByte(); // protocol
        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22092);buf.readUnsignedShort(); // length
        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22093);int index = buf.readUnsignedByte() >> 3;

        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22094);if ((((channel != null)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22095)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22096)==0&false))) {{
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22097);ChannelBuffer response = ChannelBuffers.copiedBuffer(
                    "^" + index, StandardCharsets.US_ASCII);
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22098);channel.write(response, remoteAddress);
        }

        }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22099);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22100);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22101);if ((((deviceSession == null)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22102)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22103)==0&false))) {{
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22104);return null;
        }

        }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22105);List<Position> positions = new LinkedList<>();

        __CLR4_5_2gz4gz4lwydwf3b.R.inc(22106);while ((((buf.readableBytes() > 2)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22107)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22108)==0&false))) {{

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22109);Position position = new Position();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22110);position.setProtocol(getProtocolName());
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22111);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22112);int end = buf.readerIndex() + buf.readUnsignedByte();

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22113);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22114);int flags = buf.readUnsignedByte();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22115);position.set(Position.KEY_SATELLITES, BitUtil.from(flags, 2));
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22116);position.setValid(BitUtil.to(flags, 2) > 0);

            // Latitude
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22117);double lat = buf.readUnsignedMedium();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22118);lat = lat * -180 / 16777216 + 90;
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22119);position.setLatitude(lat);

            // Longitude
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22120);double lon = buf.readUnsignedMedium();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22121);lon = lon * 360 / 16777216 - 180;
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22122);position.setLongitude(lon);

            // Status
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22123);flags = buf.readUnsignedByte();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22124);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22125);position.set(Position.KEY_RSSI, BitUtil.between(flags, 2, 5));
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22126);position.setCourse((BitUtil.from(flags, 5) * 45 + 180) % 360);

            // Speed
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22127);int speed = buf.readUnsignedByte();
            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22128);if ((((speed < 250)&&(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22129)!=0|true))||(__CLR4_5_2gz4gz4lwydwf3b.R.iget(22130)==0&false))) {{
                __CLR4_5_2gz4gz4lwydwf3b.R.inc(22131);position.setSpeed(UnitsConverter.knotsFromKph(speed));
            }

            }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22132);decodeExtraData(position, buf, end);

            __CLR4_5_2gz4gz4lwydwf3b.R.inc(22133);positions.add(position);
        }

        }__CLR4_5_2gz4gz4lwydwf3b.R.inc(22134);return positions;
    }finally{__CLR4_5_2gz4gz4lwydwf3b.R.flushNeeded();}}

}
