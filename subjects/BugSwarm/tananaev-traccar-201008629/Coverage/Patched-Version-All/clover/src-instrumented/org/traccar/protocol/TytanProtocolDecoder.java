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

@java.lang.SuppressWarnings({"fallthrough"}) public class TytanProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2eoweowlx1e1mct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,19175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TytanProtocolDecoder(TytanProtocol protocol) {
        super(protocol);__CLR4_5_2eoweowlx1e1mct.R.inc(19041);try{__CLR4_5_2eoweowlx1e1mct.R.inc(19040);
    }finally{__CLR4_5_2eoweowlx1e1mct.R.flushNeeded();}}

    private void decodeExtraData(Position position, ChannelBuffer buf, int end) {try{__CLR4_5_2eoweowlx1e1mct.R.inc(19042);
        __CLR4_5_2eoweowlx1e1mct.R.inc(19043);while ((((buf.readerIndex() < end)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19044)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19045)==0&false))) {{

            __CLR4_5_2eoweowlx1e1mct.R.inc(19046);int type = buf.readUnsignedByte();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19047);int length = buf.readUnsignedByte();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19048);if ((((length == 255)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19049)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19050)==0&false))) {{
                __CLR4_5_2eoweowlx1e1mct.R.inc(19051);length += buf.readUnsignedByte();
            }

            }__CLR4_5_2eoweowlx1e1mct.R.inc(19052);int n;

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2eoweowlx1e1mct.R.inc(19053);switch (type) {
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19054);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19055);position.set(Position.KEY_TRIP_ODOMETER, buf.readUnsignedMedium());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19056);break;
                case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19057);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19058);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19059);break;
                case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19060);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19061);n = buf.readUnsignedByte() >> 4;
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19062);if ((((n < 2)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19063)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19064)==0&false))) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19065);position.set(Position.PREFIX_ADC + n, buf.readFloat());
                    } }else {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19066);position.set("di" + (n - 2), buf.readFloat());
                    }
                    }__CLR4_5_2eoweowlx1e1mct.R.inc(19067);break;
                case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19068);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19069);int alarm = buf.readUnsignedByte();
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19070);buf.readUnsignedByte();
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19071);if ((((BitUtil.check(alarm, 5))&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19072)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19073)==0&false))) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19074);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_2eoweowlx1e1mct.R.inc(19075);break;
                case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19076);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19077);position.set("antihijack", buf.readUnsignedByte());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19078);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19079);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19080);position.set("unauthorized", ChannelBuffers.hexDump(buf.readBytes(8)));
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19081);break;
                case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19082);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19083);position.set("authorized", ChannelBuffers.hexDump(buf.readBytes(8)));
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19084);break;
                case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19085);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19086);for (int i = 0; (((i < length / 2)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19087)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19088)==0&false)); i++) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19089);position.set(Position.PREFIX_TEMP + buf.readUnsignedByte(), buf.readByte());
                    }
                    }__CLR4_5_2eoweowlx1e1mct.R.inc(19090);break;
                case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19091);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19092);position.set("weight", buf.readUnsignedShort());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19093);buf.readUnsignedByte();
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19094);break;
                case 90:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19095);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19096);position.set(Position.KEY_POWER, buf.readFloat());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19097);break;
                case 101:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19098);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19099);position.set(Position.KEY_OBD_SPEED, buf.readUnsignedByte());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19100);break;
                case 102:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19101);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19102);position.set(Position.KEY_RPM, buf.readUnsignedByte() * 50);
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19103);break;
                case 107:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19104);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19105);int fuel = buf.readUnsignedShort();
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19106);int fuelFormat = fuel >> 14;
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19107);if ((((fuelFormat == 1)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19108)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19109)==0&false))) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19110);position.set(Position.KEY_FUEL, (fuel & 0x3fff) * 0.4 + "%");
                    } }else {__CLR4_5_2eoweowlx1e1mct.R.inc(19111);if ((((fuelFormat == 2)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19112)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19113)==0&false))) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19114);position.set(Position.KEY_FUEL, (fuel & 0x3fff) * 0.5 + " l");
                    } }else {__CLR4_5_2eoweowlx1e1mct.R.inc(19115);if ((((fuelFormat == 3)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19116)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19117)==0&false))) {{
                        __CLR4_5_2eoweowlx1e1mct.R.inc(19118);position.set(Position.KEY_FUEL, (fuel & 0x3fff) * -0.5 + " l");
                    }
                    }}}__CLR4_5_2eoweowlx1e1mct.R.inc(19119);break;
                case 108:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19120);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19121);position.set(Position.KEY_OBD_ODOMETER, buf.readUnsignedInt() * 5);
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19122);break;
                case 150:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19123);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19124);position.set("door", buf.readUnsignedByte());
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19125);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2eoweowlx1e1mct.R.inc(19126);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19127);buf.skipBytes(length);
                    __CLR4_5_2eoweowlx1e1mct.R.inc(19128);break;
            }
        }
    }}finally{__CLR4_5_2eoweowlx1e1mct.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2eoweowlx1e1mct.R.inc(19129);

        __CLR4_5_2eoweowlx1e1mct.R.inc(19130);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2eoweowlx1e1mct.R.inc(19131);buf.readUnsignedByte(); // protocol
        __CLR4_5_2eoweowlx1e1mct.R.inc(19132);buf.readUnsignedShort(); // length
        __CLR4_5_2eoweowlx1e1mct.R.inc(19133);int index = buf.readUnsignedByte() >> 3;

        __CLR4_5_2eoweowlx1e1mct.R.inc(19134);if ((((channel != null)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19135)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19136)==0&false))) {{
            __CLR4_5_2eoweowlx1e1mct.R.inc(19137);ChannelBuffer response = ChannelBuffers.copiedBuffer(
                    "^" + index, StandardCharsets.US_ASCII);
            __CLR4_5_2eoweowlx1e1mct.R.inc(19138);channel.write(response, remoteAddress);
        }

        }__CLR4_5_2eoweowlx1e1mct.R.inc(19139);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_2eoweowlx1e1mct.R.inc(19140);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2eoweowlx1e1mct.R.inc(19141);if ((((deviceSession == null)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19142)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19143)==0&false))) {{
            __CLR4_5_2eoweowlx1e1mct.R.inc(19144);return null;
        }

        }__CLR4_5_2eoweowlx1e1mct.R.inc(19145);List<Position> positions = new LinkedList<>();

        __CLR4_5_2eoweowlx1e1mct.R.inc(19146);while ((((buf.readableBytes() > 2)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19147)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19148)==0&false))) {{

            __CLR4_5_2eoweowlx1e1mct.R.inc(19149);Position position = new Position();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19150);position.setProtocol(getProtocolName());
            __CLR4_5_2eoweowlx1e1mct.R.inc(19151);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2eoweowlx1e1mct.R.inc(19152);int end = buf.readerIndex() + buf.readUnsignedByte();

            __CLR4_5_2eoweowlx1e1mct.R.inc(19153);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_2eoweowlx1e1mct.R.inc(19154);int flags = buf.readUnsignedByte();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19155);position.set(Position.KEY_SATELLITES, BitUtil.from(flags, 2));
            __CLR4_5_2eoweowlx1e1mct.R.inc(19156);position.setValid(BitUtil.to(flags, 2) > 0);

            // Latitude
            __CLR4_5_2eoweowlx1e1mct.R.inc(19157);double lat = buf.readUnsignedMedium();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19158);lat = lat * -180 / 16777216 + 90;
            __CLR4_5_2eoweowlx1e1mct.R.inc(19159);position.setLatitude(lat);

            // Longitude
            __CLR4_5_2eoweowlx1e1mct.R.inc(19160);double lon = buf.readUnsignedMedium();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19161);lon = lon * 360 / 16777216 - 180;
            __CLR4_5_2eoweowlx1e1mct.R.inc(19162);position.setLongitude(lon);

            // Status
            __CLR4_5_2eoweowlx1e1mct.R.inc(19163);flags = buf.readUnsignedByte();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19164);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_2eoweowlx1e1mct.R.inc(19165);position.set(Position.KEY_RSSI, BitUtil.between(flags, 2, 5));
            __CLR4_5_2eoweowlx1e1mct.R.inc(19166);position.setCourse((BitUtil.from(flags, 5) * 45 + 180) % 360);

            // Speed
            __CLR4_5_2eoweowlx1e1mct.R.inc(19167);int speed = buf.readUnsignedByte();
            __CLR4_5_2eoweowlx1e1mct.R.inc(19168);if ((((speed < 250)&&(__CLR4_5_2eoweowlx1e1mct.R.iget(19169)!=0|true))||(__CLR4_5_2eoweowlx1e1mct.R.iget(19170)==0&false))) {{
                __CLR4_5_2eoweowlx1e1mct.R.inc(19171);position.setSpeed(UnitsConverter.knotsFromKph(speed));
            }

            }__CLR4_5_2eoweowlx1e1mct.R.inc(19172);decodeExtraData(position, buf, end);

            __CLR4_5_2eoweowlx1e1mct.R.inc(19173);positions.add(position);
        }

        }__CLR4_5_2eoweowlx1e1mct.R.inc(19174);return positions;
    }finally{__CLR4_5_2eoweowlx1e1mct.R.flushNeeded();}}

}
