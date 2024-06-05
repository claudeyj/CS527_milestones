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

public class MxtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bd8bd8lx1e1lhv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,14844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MxtProtocolDecoder(MxtProtocol protocol) {
        super(protocol);__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14733);try{__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14732);
    }finally{__CLR4_5_2bd8bd8lx1e1lhv.R.flushNeeded();}}

    public static final int MSG_ACK = 0x02;
    public static final int MSG_NACK = 0x03;
    public static final int MSG_POSITION = 0x31;

    private static void sendResponse(Channel channel, int device, long id, int crc) {try{__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14734);
        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14735);if ((((channel != null)&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14736)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14737)==0&false))) {{
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14738);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14739);response.writeByte(device);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14740);response.writeByte(MSG_ACK);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14741);response.writeInt((int) id);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14742);response.writeShort(crc);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14743);response.writeShort(Checksum.crc16(
                    Checksum.CRC16_XMODEM, response.toByteBuffer()));

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14744);ChannelBuffer encoded = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14745);encoded.writeByte(0x01); // header
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14746);while ((((response.readable())&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14747)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14748)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14749);int b = response.readByte();
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14750);if ((((b == 0x01 || b == 0x04 || b == 0x10 || b == 0x11 || b == 0x13)&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14751)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14752)==0&false))) {{
                    __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14753);encoded.writeByte(0x10);
                    __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14754);b += 0x20;
                }
                }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14755);encoded.writeByte(b);
            }
            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14756);encoded.writeByte(0x04); // ending
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14757);channel.write(encoded);
        }
    }}finally{__CLR4_5_2bd8bd8lx1e1lhv.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14758);

        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14759);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14760);buf.readUnsignedByte(); // start
        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14761);int device = buf.readUnsignedByte(); // device descriptor
        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14762);int type = buf.readUnsignedByte();

        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14763);long id = buf.readUnsignedInt();
        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14764);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(id));
        __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14765);if ((((deviceSession == null)&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14766)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14767)==0&false))) {{
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14768);return null;
        }

        }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14769);if ((((type == MSG_POSITION)&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14770)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14771)==0&false))) {{

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14772);Position position = new Position();
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14773);position.setProtocol(getProtocolName());
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14774);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14775);buf.readUnsignedByte(); // protocol
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14776);int infoGroups = buf.readUnsignedByte();

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14777);position.set(Position.KEY_INDEX, buf.readUnsignedShort());

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14778);DateBuilder dateBuilder = new DateBuilder().setDate(2000, 1, 1);

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14779);long date = buf.readUnsignedInt();

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14780);long days = BitUtil.from(date, 6 + 6 + 5);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14781);long hours = BitUtil.between(date, 6 + 6, 6 + 6 + 5);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14782);long minutes = BitUtil.between(date, 6, 6 + 6);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14783);long seconds = BitUtil.to(date, 6);

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14784);dateBuilder.addMillis((((days * 24 + hours) * 60 + minutes) * 60 + seconds) * 1000);

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14785);position.setTime(dateBuilder.getDate());

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14786);position.setValid(true);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14787);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14788);position.setLongitude(buf.readInt() / 1000000.0);

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14789);long flags = buf.readUnsignedInt();
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14790);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14791);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14792)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14793)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14794);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14795);position.set(Position.KEY_INPUT, BitUtil.between(flags, 2, 7));
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14796);position.set(Position.KEY_OUTPUT, BitUtil.between(flags, 7, 10));
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14797);position.setCourse(BitUtil.between(flags, 10, 13) * 45);
            //position.setValid(BitUtil.check(flags, 15));
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14798);position.set(Position.KEY_CHARGE, BitUtil.check(flags, 20));

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14799);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14800);buf.readUnsignedByte(); // input mask

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14801);if ((((BitUtil.check(infoGroups, 0))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14802)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14803)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14804);buf.skipBytes(8); // waypoints
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14805);if ((((BitUtil.check(infoGroups, 1))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14806)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14807)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14808);buf.skipBytes(8); // wireless accessory
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14809);if ((((BitUtil.check(infoGroups, 2))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14810)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14811)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14812);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14813);position.set(Position.KEY_HDOP, buf.readUnsignedByte());
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14814);buf.readUnsignedByte(); // GPS accuracy
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14815);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14816);buf.readUnsignedShort(); // time since boot
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14817);buf.readUnsignedByte(); // input voltage
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14818);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14819);if ((((BitUtil.check(infoGroups, 3))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14820)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14821)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14822);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14823);if ((((BitUtil.check(infoGroups, 4))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14824)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14825)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14826);position.set(Position.KEY_HOURS, buf.readUnsignedInt());
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14827);if ((((BitUtil.check(infoGroups, 5))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14828)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14829)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14830);buf.readUnsignedInt(); // reason
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14831);if ((((BitUtil.check(infoGroups, 6))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14832)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14833)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14834);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14835);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14836);if ((((BitUtil.check(infoGroups, 7))&&(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14837)!=0|true))||(__CLR4_5_2bd8bd8lx1e1lhv.R.iget(14838)==0&false))) {{
                __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14839);position.set(Position.KEY_RFID, buf.readUnsignedInt());
            }

            }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14840);buf.readerIndex(buf.writerIndex() - 3);
            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14841);sendResponse(channel, device, id, buf.readUnsignedShort());

            __CLR4_5_2bd8bd8lx1e1lhv.R.inc(14842);return position;
        }

        }__CLR4_5_2bd8bd8lx1e1lhv.R.inc(14843);return null;
    }finally{__CLR4_5_2bd8bd8lx1e1lhv.R.flushNeeded();}}

}
