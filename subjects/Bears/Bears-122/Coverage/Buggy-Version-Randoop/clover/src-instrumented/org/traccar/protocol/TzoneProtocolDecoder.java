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

@java.lang.SuppressWarnings({"fallthrough"}) public class TzoneProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2h32h32lwydykrx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,22289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TzoneProtocolDecoder(TzoneProtocol protocol) {
        super(protocol);__CLR4_5_2h32h32lwydykrx.R.inc(22143);try{__CLR4_5_2h32h32lwydykrx.R.inc(22142);
    }finally{__CLR4_5_2h32h32lwydykrx.R.flushNeeded();}}

    private String decodeAlarm(Short value) {try{__CLR4_5_2h32h32lwydykrx.R.inc(22144);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2h32h32lwydykrx.R.inc(22145);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22146);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22147);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22148);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22149);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22150);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22151);return Position.ALARM_OVERSPEED;
            case 0x14:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22152);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22153);return Position.ALARM_BREAKING;
            case 0x15:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22154);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22155);return Position.ALARM_ACCELERATION;
            case 0x30:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22156);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22157);return Position.ALARM_PARKING;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22158);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22159);return Position.ALARM_GEOFENCE_EXIT;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22160);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22161);return Position.ALARM_GEOFENCE_ENTER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2h32h32lwydykrx.R.inc(22162);__CLB4_5_2_bool0=true;}
                __CLR4_5_2h32h32lwydykrx.R.inc(22163);return null;
        }
    }finally{__CLR4_5_2h32h32lwydykrx.R.flushNeeded();}}

    private void decodeCards(Position position, ChannelBuffer buf) {try{__CLR4_5_2h32h32lwydykrx.R.inc(22164);

        __CLR4_5_2h32h32lwydykrx.R.inc(22165);int index = 1;
        __CLR4_5_2h32h32lwydykrx.R.inc(22166);for (int i = 0; (((i < 4)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22167)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22168)==0&false)); i++) {{

            __CLR4_5_2h32h32lwydykrx.R.inc(22169);int blockLength = buf.readUnsignedShort();
            __CLR4_5_2h32h32lwydykrx.R.inc(22170);int blockEnd = buf.readerIndex() + blockLength;

            __CLR4_5_2h32h32lwydykrx.R.inc(22171);if ((((blockLength > 0)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22172)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22173)==0&false))) {{

                __CLR4_5_2h32h32lwydykrx.R.inc(22174);int count = buf.readUnsignedByte();
                __CLR4_5_2h32h32lwydykrx.R.inc(22175);for (int j = 0; (((j < count)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22176)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22177)==0&false)); j++) {{

                    __CLR4_5_2h32h32lwydykrx.R.inc(22178);int length = buf.readUnsignedByte();

                    __CLR4_5_2h32h32lwydykrx.R.inc(22179);boolean odd = length % 2 != 0;
                    __CLR4_5_2h32h32lwydykrx.R.inc(22180);if ((((odd)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22181)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22182)==0&false))) {{
                        __CLR4_5_2h32h32lwydykrx.R.inc(22183);length += 1;
                    }

                    }__CLR4_5_2h32h32lwydykrx.R.inc(22184);String num = ChannelBuffers.hexDump(buf.readBytes(length / 2));

                    __CLR4_5_2h32h32lwydykrx.R.inc(22185);if ((((odd)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22186)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22187)==0&false))) {{
                        __CLR4_5_2h32h32lwydykrx.R.inc(22188);num = num.substring(1);
                    }

                    }__CLR4_5_2h32h32lwydykrx.R.inc(22189);position.set("card" + index, num);
                }
            }}

            }__CLR4_5_2h32h32lwydykrx.R.inc(22190);buf.readerIndex(blockEnd);
        }

    }}finally{__CLR4_5_2h32h32lwydykrx.R.flushNeeded();}}

    private void decodePassengers(Position position, ChannelBuffer buf) {try{__CLR4_5_2h32h32lwydykrx.R.inc(22191);

        __CLR4_5_2h32h32lwydykrx.R.inc(22192);int blockLength = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22193);int blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2h32h32lwydykrx.R.inc(22194);if ((((blockLength > 0)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22195)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22196)==0&false))) {{

            __CLR4_5_2h32h32lwydykrx.R.inc(22197);position.set("passengersOn", buf.readUnsignedMedium());
            __CLR4_5_2h32h32lwydykrx.R.inc(22198);position.set("passengersOff", buf.readUnsignedMedium());

        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22199);buf.readerIndex(blockEnd);

    }finally{__CLR4_5_2h32h32lwydykrx.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2h32h32lwydykrx.R.inc(22200);

        __CLR4_5_2h32h32lwydykrx.R.inc(22201);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2h32h32lwydykrx.R.inc(22202);buf.skipBytes(2); // header
        __CLR4_5_2h32h32lwydykrx.R.inc(22203);buf.readUnsignedShort(); // length
        __CLR4_5_2h32h32lwydykrx.R.inc(22204);if ((((buf.readUnsignedShort() != 0x2424)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22205)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22206)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22207);return null;
        }
        }__CLR4_5_2h32h32lwydykrx.R.inc(22208);int hardware = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22209);long firmware = buf.readUnsignedInt();

        __CLR4_5_2h32h32lwydykrx.R.inc(22210);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
        __CLR4_5_2h32h32lwydykrx.R.inc(22211);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2h32h32lwydykrx.R.inc(22212);if ((((deviceSession == null)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22213)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22214)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22215);return null;
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22216);Position position = new Position();
        __CLR4_5_2h32h32lwydykrx.R.inc(22217);position.setProtocol(getProtocolName());
        __CLR4_5_2h32h32lwydykrx.R.inc(22218);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2h32h32lwydykrx.R.inc(22219);position.set(Position.KEY_VERSION_HW, hardware);
        __CLR4_5_2h32h32lwydykrx.R.inc(22220);position.set(Position.KEY_VERSION_FW, firmware);

        __CLR4_5_2h32h32lwydykrx.R.inc(22221);position.setDeviceTime(new DateBuilder()
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte()).getDate());

        // GPS info

        __CLR4_5_2h32h32lwydykrx.R.inc(22222);int blockLength = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22223);int blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2h32h32lwydykrx.R.inc(22224);if ((((blockLength < 22)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22225)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22226)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22227);return null;
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22228);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

        __CLR4_5_2h32h32lwydykrx.R.inc(22229);double lat;
        __CLR4_5_2h32h32lwydykrx.R.inc(22230);double lon;

        __CLR4_5_2h32h32lwydykrx.R.inc(22231);if ((((hardware == 0x10A || hardware == 0x10B)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22232)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22233)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22234);lat = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_2h32h32lwydykrx.R.inc(22235);lon = buf.readUnsignedInt() / 600000.0;
        } }else {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22236);lat = buf.readUnsignedInt() / 100000.0 / 60.0;
            __CLR4_5_2h32h32lwydykrx.R.inc(22237);lon = buf.readUnsignedInt() / 100000.0 / 60.0;
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22238);position.setFixTime(new DateBuilder()
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte()).getDate());

        __CLR4_5_2h32h32lwydykrx.R.inc(22239);position.setSpeed(buf.readUnsignedShort() * 0.01);

        __CLR4_5_2h32h32lwydykrx.R.inc(22240);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());

        __CLR4_5_2h32h32lwydykrx.R.inc(22241);int flags = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22242);position.setCourse(BitUtil.to(flags, 9));
        __CLR4_5_2h32h32lwydykrx.R.inc(22243);if ((((!BitUtil.check(flags, 10))&&(__CLR4_5_2h32h32lwydykrx.R.iget(22244)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22245)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22246);lat = -lat;
        }
        }__CLR4_5_2h32h32lwydykrx.R.inc(22247);position.setLatitude(lat);
        __CLR4_5_2h32h32lwydykrx.R.inc(22248);if ((((BitUtil.check(flags, 9))&&(__CLR4_5_2h32h32lwydykrx.R.iget(22249)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22250)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22251);lon = -lon;
        }
        }__CLR4_5_2h32h32lwydykrx.R.inc(22252);position.setLongitude(lon);
        __CLR4_5_2h32h32lwydykrx.R.inc(22253);position.setValid(BitUtil.check(flags, 11));

        __CLR4_5_2h32h32lwydykrx.R.inc(22254);buf.readerIndex(blockEnd);

        // LBS info

        __CLR4_5_2h32h32lwydykrx.R.inc(22255);blockLength = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22256);blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2h32h32lwydykrx.R.inc(22257);if ((((blockLength > 0 && (hardware == 0x10A || hardware == 0x10B))&&(__CLR4_5_2h32h32lwydykrx.R.iget(22258)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22259)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22260);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22261);buf.readerIndex(blockEnd);

        // Status info

        __CLR4_5_2h32h32lwydykrx.R.inc(22262);blockLength = buf.readUnsignedShort();
        __CLR4_5_2h32h32lwydykrx.R.inc(22263);blockEnd = buf.readerIndex() + blockLength;

        __CLR4_5_2h32h32lwydykrx.R.inc(22264);if ((((blockLength >= 13)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22265)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22266)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22267);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
            __CLR4_5_2h32h32lwydykrx.R.inc(22268);position.set("terminalInfo", buf.readUnsignedByte());
            __CLR4_5_2h32h32lwydykrx.R.inc(22269);position.set(Position.PREFIX_IO + 1, buf.readUnsignedShort());
            __CLR4_5_2h32h32lwydykrx.R.inc(22270);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
            __CLR4_5_2h32h32lwydykrx.R.inc(22271);position.set("gsmStatus", buf.readUnsignedByte());
            __CLR4_5_2h32h32lwydykrx.R.inc(22272);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
            __CLR4_5_2h32h32lwydykrx.R.inc(22273);position.set(Position.KEY_POWER, buf.readUnsignedShort());
            __CLR4_5_2h32h32lwydykrx.R.inc(22274);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2h32h32lwydykrx.R.inc(22275);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22276);if ((((blockLength >= 15)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22277)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22278)==0&false))) {{
            __CLR4_5_2h32h32lwydykrx.R.inc(22279);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedShort());
        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22280);buf.readerIndex(blockEnd);

        __CLR4_5_2h32h32lwydykrx.R.inc(22281);if ((((hardware == 0x10A || hardware == 0x10B)&&(__CLR4_5_2h32h32lwydykrx.R.iget(22282)!=0|true))||(__CLR4_5_2h32h32lwydykrx.R.iget(22283)==0&false))) {{

            __CLR4_5_2h32h32lwydykrx.R.inc(22284);decodeCards(position, buf);

            __CLR4_5_2h32h32lwydykrx.R.inc(22285);buf.skipBytes(buf.readUnsignedShort()); // temperature
            __CLR4_5_2h32h32lwydykrx.R.inc(22286);buf.skipBytes(buf.readUnsignedShort()); // lock

            __CLR4_5_2h32h32lwydykrx.R.inc(22287);decodePassengers(position, buf);

        }

        }__CLR4_5_2h32h32lwydykrx.R.inc(22288);return position;
    }finally{__CLR4_5_2h32h32lwydykrx.R.flushNeeded();}}

}
