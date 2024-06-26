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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;

public class MxtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2d6kd6klwydwe78{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,17196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MxtProtocolDecoder(MxtProtocol protocol) {
        super(protocol);__CLR4_5_2d6kd6klwydwe78.R.inc(17085);try{__CLR4_5_2d6kd6klwydwe78.R.inc(17084);
    }finally{__CLR4_5_2d6kd6klwydwe78.R.flushNeeded();}}

    public static final int MSG_ACK = 0x02;
    public static final int MSG_NACK = 0x03;
    public static final int MSG_POSITION = 0x31;

    private static void sendResponse(Channel channel, int device, long id, int crc) {try{__CLR4_5_2d6kd6klwydwe78.R.inc(17086);
        __CLR4_5_2d6kd6klwydwe78.R.inc(17087);if ((((channel != null)&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17088)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17089)==0&false))) {{
            __CLR4_5_2d6kd6klwydwe78.R.inc(17090);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17091);response.writeByte(device);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17092);response.writeByte(MSG_ACK);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17093);response.writeInt((int) id);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17094);response.writeShort(crc);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17095);response.writeShort(Checksum.crc16(
                    Checksum.CRC16_XMODEM, response.toByteBuffer()));

            __CLR4_5_2d6kd6klwydwe78.R.inc(17096);ChannelBuffer encoded = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2d6kd6klwydwe78.R.inc(17097);encoded.writeByte(0x01); // header
            __CLR4_5_2d6kd6klwydwe78.R.inc(17098);while ((((response.readable())&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17099)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17100)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17101);int b = response.readByte();
                __CLR4_5_2d6kd6klwydwe78.R.inc(17102);if ((((b == 0x01 || b == 0x04 || b == 0x10 || b == 0x11 || b == 0x13)&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17103)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17104)==0&false))) {{
                    __CLR4_5_2d6kd6klwydwe78.R.inc(17105);encoded.writeByte(0x10);
                    __CLR4_5_2d6kd6klwydwe78.R.inc(17106);b += 0x20;
                }
                }__CLR4_5_2d6kd6klwydwe78.R.inc(17107);encoded.writeByte(b);
            }
            }__CLR4_5_2d6kd6klwydwe78.R.inc(17108);encoded.writeByte(0x04); // ending
            __CLR4_5_2d6kd6klwydwe78.R.inc(17109);channel.write(encoded);
        }
    }}finally{__CLR4_5_2d6kd6klwydwe78.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2d6kd6klwydwe78.R.inc(17110);

        __CLR4_5_2d6kd6klwydwe78.R.inc(17111);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2d6kd6klwydwe78.R.inc(17112);buf.readUnsignedByte(); // start
        __CLR4_5_2d6kd6klwydwe78.R.inc(17113);int device = buf.readUnsignedByte(); // device descriptor
        __CLR4_5_2d6kd6klwydwe78.R.inc(17114);int type = buf.readUnsignedByte();

        __CLR4_5_2d6kd6klwydwe78.R.inc(17115);long id = buf.readUnsignedInt();
        __CLR4_5_2d6kd6klwydwe78.R.inc(17116);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_2d6kd6klwydwe78.R.inc(17117);if ((((deviceSession == null)&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17118)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17119)==0&false))) {{
            __CLR4_5_2d6kd6klwydwe78.R.inc(17120);return null;
        }

        }__CLR4_5_2d6kd6klwydwe78.R.inc(17121);if ((((type == MSG_POSITION)&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17122)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17123)==0&false))) {{

            __CLR4_5_2d6kd6klwydwe78.R.inc(17124);Position position = new Position();
            __CLR4_5_2d6kd6klwydwe78.R.inc(17125);position.setProtocol(getProtocolName());
            __CLR4_5_2d6kd6klwydwe78.R.inc(17126);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2d6kd6klwydwe78.R.inc(17127);buf.readUnsignedByte(); // protocol
            __CLR4_5_2d6kd6klwydwe78.R.inc(17128);int infoGroups = buf.readUnsignedByte();

            __CLR4_5_2d6kd6klwydwe78.R.inc(17129);position.set(Position.KEY_INDEX, buf.readUnsignedShort());

            __CLR4_5_2d6kd6klwydwe78.R.inc(17130);DateBuilder dateBuilder = new DateBuilder().setDate(2000, 1, 1);

            __CLR4_5_2d6kd6klwydwe78.R.inc(17131);long date = buf.readUnsignedInt();

            __CLR4_5_2d6kd6klwydwe78.R.inc(17132);long days = BitUtil.from(date, 6 + 6 + 5);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17133);long hours = BitUtil.between(date, 6 + 6, 6 + 6 + 5);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17134);long minutes = BitUtil.between(date, 6, 6 + 6);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17135);long seconds = BitUtil.to(date, 6);

            __CLR4_5_2d6kd6klwydwe78.R.inc(17136);dateBuilder.addMillis((((days * 24 + hours) * 60 + minutes) * 60 + seconds) * 1000);

            __CLR4_5_2d6kd6klwydwe78.R.inc(17137);position.setTime(dateBuilder.getDate());

            __CLR4_5_2d6kd6klwydwe78.R.inc(17138);position.setValid(true);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17139);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17140);position.setLongitude(buf.readInt() / 1000000.0);

            __CLR4_5_2d6kd6klwydwe78.R.inc(17141);long flags = buf.readUnsignedInt();
            __CLR4_5_2d6kd6klwydwe78.R.inc(17142);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_2d6kd6klwydwe78.R.inc(17143);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17144)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17145)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17146);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_2d6kd6klwydwe78.R.inc(17147);position.set(Position.KEY_INPUT, BitUtil.between(flags, 2, 7));
            __CLR4_5_2d6kd6klwydwe78.R.inc(17148);position.set(Position.KEY_OUTPUT, BitUtil.between(flags, 7, 10));
            __CLR4_5_2d6kd6klwydwe78.R.inc(17149);position.setCourse(BitUtil.between(flags, 10, 13) * 45);
            //position.setValid(BitUtil.check(flags, 15));
            __CLR4_5_2d6kd6klwydwe78.R.inc(17150);position.set(Position.KEY_CHARGE, BitUtil.check(flags, 20));

            __CLR4_5_2d6kd6klwydwe78.R.inc(17151);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            __CLR4_5_2d6kd6klwydwe78.R.inc(17152);buf.readUnsignedByte(); // input mask

            __CLR4_5_2d6kd6klwydwe78.R.inc(17153);if ((((BitUtil.check(infoGroups, 0))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17154)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17155)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17156);buf.skipBytes(8); // waypoints
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17157);if ((((BitUtil.check(infoGroups, 1))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17158)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17159)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17160);buf.skipBytes(8); // wireless accessory
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17161);if ((((BitUtil.check(infoGroups, 2))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17162)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17163)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17164);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_2d6kd6klwydwe78.R.inc(17165);position.set(Position.KEY_HDOP, buf.readUnsignedByte());
                __CLR4_5_2d6kd6klwydwe78.R.inc(17166);position.setAccuracy(buf.readUnsignedByte());
                __CLR4_5_2d6kd6klwydwe78.R.inc(17167);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                __CLR4_5_2d6kd6klwydwe78.R.inc(17168);buf.readUnsignedShort(); // time since boot
                __CLR4_5_2d6kd6klwydwe78.R.inc(17169);position.set(Position.KEY_POWER, buf.readUnsignedByte());
                __CLR4_5_2d6kd6klwydwe78.R.inc(17170);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17171);if ((((BitUtil.check(infoGroups, 3))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17172)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17173)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17174);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17175);if ((((BitUtil.check(infoGroups, 4))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17176)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17177)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17178);position.set(Position.KEY_HOURS, buf.readUnsignedInt());
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17179);if ((((BitUtil.check(infoGroups, 5))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17180)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17181)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17182);buf.readUnsignedInt(); // reason
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17183);if ((((BitUtil.check(infoGroups, 6))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17184)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17185)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17186);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
                __CLR4_5_2d6kd6klwydwe78.R.inc(17187);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17188);if ((((BitUtil.check(infoGroups, 7))&&(__CLR4_5_2d6kd6klwydwe78.R.iget(17189)!=0|true))||(__CLR4_5_2d6kd6klwydwe78.R.iget(17190)==0&false))) {{
                __CLR4_5_2d6kd6klwydwe78.R.inc(17191);position.set(Position.KEY_DRIVER_UNIQUE_ID, String.valueOf(buf.readUnsignedInt()));
            }

            }__CLR4_5_2d6kd6klwydwe78.R.inc(17192);buf.readerIndex(buf.writerIndex() - 3);
            __CLR4_5_2d6kd6klwydwe78.R.inc(17193);sendResponse(channel, device, id, buf.readUnsignedShort());

            __CLR4_5_2d6kd6klwydwe78.R.inc(17194);return position;
        }

        }__CLR4_5_2d6kd6klwydwe78.R.inc(17195);return null;
    }finally{__CLR4_5_2d6kd6klwydwe78.R.flushNeeded();}}

}
