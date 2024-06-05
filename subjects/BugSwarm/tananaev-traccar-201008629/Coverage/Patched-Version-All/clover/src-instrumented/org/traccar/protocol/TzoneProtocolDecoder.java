/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;

@java.lang.SuppressWarnings({"fallthrough"}) public class TzoneProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2esuesulx1e1mdp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,19327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TzoneProtocolDecoder(TzoneProtocol protocol) {
        super(protocol);__CLR4_5_2esuesulx1e1mdp.R.inc(19183);try{__CLR4_5_2esuesulx1e1mdp.R.inc(19182);
    }finally{__CLR4_5_2esuesulx1e1mdp.R.flushNeeded();}}

    private String decodeAlarm(Short value) {try{__CLR4_5_2esuesulx1e1mdp.R.inc(19184);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2esuesulx1e1mdp.R.inc(19185);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19186);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19187);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19188);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19189);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19190);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19191);return Position.ALARM_OVERSPEED;
            case 0x14:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19192);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19193);return Position.ALARM_BREAKING;
            case 0x15:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19194);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19195);return Position.ALARM_ACCELETATION;
            case 0x30:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19196);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19197);return Position.ALARM_PARKING;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19198);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19199);return Position.ALARM_GEOFENCE_EXIT;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19200);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19201);return Position.ALARM_GEOFENCE_ENTER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2esuesulx1e1mdp.R.inc(19202);__CLB4_5_2_bool0=true;}
                __CLR4_5_2esuesulx1e1mdp.R.inc(19203);return null;
        }
    }finally{__CLR4_5_2esuesulx1e1mdp.R.flushNeeded();}}

    private void decodeCards(Position position, ChannelBuffer buf) {try{__CLR4_5_2esuesulx1e1mdp.R.inc(19204);

        __CLR4_5_2esuesulx1e1mdp.R.inc(19205);int index = 1;
        __CLR4_5_2esuesulx1e1mdp.R.inc(19206);for (int i = 0; (((i < 4)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19207)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19208)==0&false)); i++) {{

            __CLR4_5_2esuesulx1e1mdp.R.inc(19209);int blockLength = buf.readUnsignedShort();
            __CLR4_5_2esuesulx1e1mdp.R.inc(19210);int blockEnd = buf.readerIndex() + blockLength;

            __CLR4_5_2esuesulx1e1mdp.R.inc(19211);if ((((blockLength > 0)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19212)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19213)==0&false))) {{

                __CLR4_5_2esuesulx1e1mdp.R.inc(19214);int count = buf.readUnsignedByte();
                __CLR4_5_2esuesulx1e1mdp.R.inc(19215);for (int j = 0; (((j < count)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19216)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19217)==0&false)); j++) {{

                    __CLR4_5_2esuesulx1e1mdp.R.inc(19218);int length = buf.readUnsignedByte();

                    __CLR4_5_2esuesulx1e1mdp.R.inc(19219);boolean odd = length % 2 != 0;
                    __CLR4_5_2esuesulx1e1mdp.R.inc(19220);if ((((odd)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19221)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19222)==0&false))) {{
                        __CLR4_5_2esuesulx1e1mdp.R.inc(19223);length += 1;
                    }

                    }__CLR4_5_2esuesulx1e1mdp.R.inc(19224);String num = ChannelBuffers.hexDump(buf.readBytes(length / 2));

                    __CLR4_5_2esuesulx1e1mdp.R.inc(19225);if ((((odd)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19226)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19227)==0&false))) {{
                        __CLR4_5_2esuesulx1e1mdp.R.inc(19228);num = num.substring(1);
                    }

                    }__CLR4_5_2esuesulx1e1mdp.R.inc(19229);position.set("card" + index, num);
                }
            }}

            }__CLR4_5_2esuesulx1e1mdp.R.inc(19230);buf.readerIndex(blockEnd);
        }

    }}finally{__CLR4_5_2esuesulx1e1mdp.R.flushNeeded();}}

    private void decodePassengers(Position position, ChannelBuffer buf) {try{__CLR4_5_2esuesulx1e1mdp.R.inc(19231);

        __CLR4_5_2esuesulx1e1mdp.R.inc(19232);int blockLength = buf.readUnsignedShort();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19233);int blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19234);if ((((blockLength > 0)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19235)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19236)==0&false))) {{

            __CLR4_5_2esuesulx1e1mdp.R.inc(19237);position.set("passengersOn", buf.readUnsignedMedium());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19238);position.set("passengersOff", buf.readUnsignedMedium());

        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19239);buf.readerIndex(blockEnd);

    }finally{__CLR4_5_2esuesulx1e1mdp.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2esuesulx1e1mdp.R.inc(19240);

        __CLR4_5_2esuesulx1e1mdp.R.inc(19241);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19242);buf.skipBytes(2); // header
        __CLR4_5_2esuesulx1e1mdp.R.inc(19243);buf.readUnsignedShort(); // length
        __CLR4_5_2esuesulx1e1mdp.R.inc(19244);if ((((buf.readUnsignedShort() != 0x2424)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19245)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19246)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19247);return null;
        }
        }__CLR4_5_2esuesulx1e1mdp.R.inc(19248);int hardware = buf.readUnsignedShort(); // model
        __CLR4_5_2esuesulx1e1mdp.R.inc(19249);buf.readUnsignedInt(); // firmware

        __CLR4_5_2esuesulx1e1mdp.R.inc(19250);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
        __CLR4_5_2esuesulx1e1mdp.R.inc(19251);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2esuesulx1e1mdp.R.inc(19252);if ((((deviceSession == null)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19253)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19254)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19255);return null;
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19256);Position position = new Position();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19257);position.setProtocol(getProtocolName());
        __CLR4_5_2esuesulx1e1mdp.R.inc(19258);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2esuesulx1e1mdp.R.inc(19259);position.setDeviceTime(new DateBuilder()
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte()).getDate());

        // GPS info

        __CLR4_5_2esuesulx1e1mdp.R.inc(19260);int blockLength = buf.readUnsignedShort();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19261);int blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19262);if ((((blockLength < 22)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19263)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19264)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19265);return null;
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19266);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

        __CLR4_5_2esuesulx1e1mdp.R.inc(19267);double lat;
        __CLR4_5_2esuesulx1e1mdp.R.inc(19268);double lon;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19269);if ((((hardware == 0x10A || hardware == 0x10B)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19270)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19271)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19272);lat = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_2esuesulx1e1mdp.R.inc(19273);lon = buf.readUnsignedInt() / 600000.0;
        } }else {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19274);lat = buf.readUnsignedInt() / 100000.0 / 60.0;
            __CLR4_5_2esuesulx1e1mdp.R.inc(19275);lon = buf.readUnsignedInt() / 100000.0 / 60.0;
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19276);position.setFixTime(new DateBuilder()
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte()).getDate());

        __CLR4_5_2esuesulx1e1mdp.R.inc(19277);position.setSpeed(buf.readUnsignedShort() * 0.01);

        __CLR4_5_2esuesulx1e1mdp.R.inc(19278);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());

        __CLR4_5_2esuesulx1e1mdp.R.inc(19279);int flags = buf.readUnsignedShort();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19280);position.setCourse(BitUtil.to(flags, 9));
        __CLR4_5_2esuesulx1e1mdp.R.inc(19281);if ((((!BitUtil.check(flags, 10))&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19282)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19283)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19284);lat = -lat;
        }
        }__CLR4_5_2esuesulx1e1mdp.R.inc(19285);position.setLatitude(lat);
        __CLR4_5_2esuesulx1e1mdp.R.inc(19286);if ((((BitUtil.check(flags, 9))&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19287)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19288)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19289);lon = -lon;
        }
        }__CLR4_5_2esuesulx1e1mdp.R.inc(19290);position.setLongitude(lon);
        __CLR4_5_2esuesulx1e1mdp.R.inc(19291);position.setValid(BitUtil.check(flags, 11));

        __CLR4_5_2esuesulx1e1mdp.R.inc(19292);buf.readerIndex(blockEnd);

        // LBS info

        __CLR4_5_2esuesulx1e1mdp.R.inc(19293);blockLength = buf.readUnsignedShort();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19294);blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19295);if ((((blockLength > 0 && (hardware == 0x10A || hardware == 0x10B))&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19296)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19297)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19298);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19299);buf.readerIndex(blockEnd);

        // Status info

        __CLR4_5_2esuesulx1e1mdp.R.inc(19300);blockLength = buf.readUnsignedShort();
        __CLR4_5_2esuesulx1e1mdp.R.inc(19301);blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2esuesulx1e1mdp.R.inc(19302);if ((((blockLength >= 13)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19303)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19304)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19305);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
            __CLR4_5_2esuesulx1e1mdp.R.inc(19306);buf.readUnsignedByte(); // terminal info
            __CLR4_5_2esuesulx1e1mdp.R.inc(19307);position.set(Position.PREFIX_IO + 1, buf.readUnsignedShort());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19308);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19309);buf.readUnsignedByte(); // GSM status
            __CLR4_5_2esuesulx1e1mdp.R.inc(19310);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19311);position.set(Position.KEY_POWER, buf.readUnsignedShort());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19312);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2esuesulx1e1mdp.R.inc(19313);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19314);if ((((blockLength >= 15)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19315)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19316)==0&false))) {{
            __CLR4_5_2esuesulx1e1mdp.R.inc(19317);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedShort());
        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19318);buf.readerIndex(blockEnd);

        __CLR4_5_2esuesulx1e1mdp.R.inc(19319);if ((((hardware == 0x10A || hardware == 0x10B)&&(__CLR4_5_2esuesulx1e1mdp.R.iget(19320)!=0|true))||(__CLR4_5_2esuesulx1e1mdp.R.iget(19321)==0&false))) {{

            __CLR4_5_2esuesulx1e1mdp.R.inc(19322);decodeCards(position, buf);

            __CLR4_5_2esuesulx1e1mdp.R.inc(19323);buf.skipBytes(buf.readUnsignedShort()); // temperature
            __CLR4_5_2esuesulx1e1mdp.R.inc(19324);buf.skipBytes(buf.readUnsignedShort()); // lock

            __CLR4_5_2esuesulx1e1mdp.R.inc(19325);decodePassengers(position, buf);

        }

        }__CLR4_5_2esuesulx1e1mdp.R.inc(19326);return position;
    }finally{__CLR4_5_2esuesulx1e1mdp.R.flushNeeded();}}

}
