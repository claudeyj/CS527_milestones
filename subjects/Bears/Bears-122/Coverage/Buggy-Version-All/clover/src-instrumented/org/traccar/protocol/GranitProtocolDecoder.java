/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.StringFinder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GranitProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2adyadylwydzns4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,13636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int HEADER_LENGTH = 6;

    private double adc1Ratio;
    private double adc2Ratio;
    private double adc3Ratio;
    private double adc4Ratio;

    public GranitProtocolDecoder(GranitProtocol protocol) {
        super(protocol);__CLR4_5_2adyadylwydzns4.R.inc(13463);try{__CLR4_5_2adyadylwydzns4.R.inc(13462);
        __CLR4_5_2adyadylwydzns4.R.inc(13464);adc1Ratio = Context.getConfig().getDouble("granit.adc1Ratio", 1);
        __CLR4_5_2adyadylwydzns4.R.inc(13465);adc2Ratio = Context.getConfig().getDouble("granit.adc2Ratio", 1);
        __CLR4_5_2adyadylwydzns4.R.inc(13466);adc3Ratio = Context.getConfig().getDouble("granit.adc3Ratio", 1);
        __CLR4_5_2adyadylwydzns4.R.inc(13467);adc4Ratio = Context.getConfig().getDouble("granit.adc4Ratio", 1);
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

    public static void appendChecksum(ChannelBuffer buffer, int length) {try{__CLR4_5_2adyadylwydzns4.R.inc(13468);
        __CLR4_5_2adyadylwydzns4.R.inc(13469);buffer.writeByte('*');
        __CLR4_5_2adyadylwydzns4.R.inc(13470);int checksum = Checksum.xor(buffer.toByteBuffer(0, length)) & 0xFF;
        __CLR4_5_2adyadylwydzns4.R.inc(13471);String checksumString = String.format("%02X", checksum);
        __CLR4_5_2adyadylwydzns4.R.inc(13472);buffer.writeBytes(checksumString.getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_2adyadylwydzns4.R.inc(13473);buffer.writeByte('\r'); __CLR4_5_2adyadylwydzns4.R.inc(13474);buffer.writeByte('\n');
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

    private static void sendResponseCurrent(Channel channel, int deviceId, long time) {try{__CLR4_5_2adyadylwydzns4.R.inc(13475);
        __CLR4_5_2adyadylwydzns4.R.inc(13476);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
        __CLR4_5_2adyadylwydzns4.R.inc(13477);response.writeBytes("BB+UGRC~".getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_2adyadylwydzns4.R.inc(13478);response.writeShort(6); // length
        __CLR4_5_2adyadylwydzns4.R.inc(13479);response.writeInt((int) time);
        __CLR4_5_2adyadylwydzns4.R.inc(13480);response.writeShort(deviceId);
        __CLR4_5_2adyadylwydzns4.R.inc(13481);appendChecksum(response, 16);
        __CLR4_5_2adyadylwydzns4.R.inc(13482);channel.write(response);
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

    private static void sendResponseArchive(Channel channel, int deviceId, int packNum) {try{__CLR4_5_2adyadylwydzns4.R.inc(13483);
        __CLR4_5_2adyadylwydzns4.R.inc(13484);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
        __CLR4_5_2adyadylwydzns4.R.inc(13485);response.writeBytes("BB+ARCF~".getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_2adyadylwydzns4.R.inc(13486);response.writeShort(4); // length
        __CLR4_5_2adyadylwydzns4.R.inc(13487);response.writeShort(packNum);
        __CLR4_5_2adyadylwydzns4.R.inc(13488);response.writeShort(deviceId);
        __CLR4_5_2adyadylwydzns4.R.inc(13489);appendChecksum(response, 14);
        __CLR4_5_2adyadylwydzns4.R.inc(13490);channel.write(response);
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

    private void decodeStructure(ChannelBuffer buf, Position position) {try{__CLR4_5_2adyadylwydzns4.R.inc(13491);
        __CLR4_5_2adyadylwydzns4.R.inc(13492);short flags = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13493);position.setValid(BitUtil.check(flags, 7));
        __CLR4_5_2adyadylwydzns4.R.inc(13494);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2adyadylwydzns4.R.iget(13495)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13496)==0&false))) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13497);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_2adyadylwydzns4.R.inc(13498);short satDel = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13499);position.set(Position.KEY_SATELLITES, BitUtil.from(satDel, 4));

        __CLR4_5_2adyadylwydzns4.R.inc(13500);int pdop = BitUtil.to(satDel, 4);
        __CLR4_5_2adyadylwydzns4.R.inc(13501);position.set(Position.KEY_PDOP, pdop);

        __CLR4_5_2adyadylwydzns4.R.inc(13502);int lonDegrees = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13503);int latDegrees = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13504);int lonMinutes = buf.readUnsignedShort();
        __CLR4_5_2adyadylwydzns4.R.inc(13505);int latMinutes = buf.readUnsignedShort();

        __CLR4_5_2adyadylwydzns4.R.inc(13506);double latitude = latDegrees + latMinutes / 60000.0;
        __CLR4_5_2adyadylwydzns4.R.inc(13507);double longitude = lonDegrees + lonMinutes / 60000.0;

        __CLR4_5_2adyadylwydzns4.R.inc(13508);if ((((position.getValid())&&(__CLR4_5_2adyadylwydzns4.R.iget(13509)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13510)==0&false))) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13511);if ((((!BitUtil.check(flags, 4))&&(__CLR4_5_2adyadylwydzns4.R.iget(13512)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13513)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13514);latitude = -latitude;
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13515);if ((((!BitUtil.check(flags, 5))&&(__CLR4_5_2adyadylwydzns4.R.iget(13516)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13517)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13518);longitude = -longitude;
            }
        }}

        }__CLR4_5_2adyadylwydzns4.R.inc(13519);position.setLongitude(longitude);
        __CLR4_5_2adyadylwydzns4.R.inc(13520);position.setLatitude(latitude);

        __CLR4_5_2adyadylwydzns4.R.inc(13521);position.setSpeed(buf.readUnsignedByte());

        __CLR4_5_2adyadylwydzns4.R.inc(13522);int course = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13523);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2adyadylwydzns4.R.iget(13524)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13525)==0&false))) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13526);course = course | 0x100;
        }
        }__CLR4_5_2adyadylwydzns4.R.inc(13527);position.setCourse(course);

        __CLR4_5_2adyadylwydzns4.R.inc(13528);position.set(Position.KEY_DISTANCE, buf.readShort());

        __CLR4_5_2adyadylwydzns4.R.inc(13529);int analogIn1 = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13530);int analogIn2 = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13531);int analogIn3 = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13532);int analogIn4 = buf.readUnsignedByte();

        __CLR4_5_2adyadylwydzns4.R.inc(13533);int analogInHi = buf.readUnsignedByte();

        __CLR4_5_2adyadylwydzns4.R.inc(13534);analogIn1 = analogInHi << 8 & 0x300 | analogIn1;
        __CLR4_5_2adyadylwydzns4.R.inc(13535);analogIn2 = analogInHi << 6 & 0x300 | analogIn2;
        __CLR4_5_2adyadylwydzns4.R.inc(13536);analogIn3 = analogInHi << 4 & 0x300 | analogIn3;
        __CLR4_5_2adyadylwydzns4.R.inc(13537);analogIn4 = analogInHi << 2 & 0x300 | analogIn4;

        __CLR4_5_2adyadylwydzns4.R.inc(13538);position.set(Position.PREFIX_ADC + 1, analogIn1 * adc1Ratio);
        __CLR4_5_2adyadylwydzns4.R.inc(13539);position.set(Position.PREFIX_ADC + 2, analogIn2 * adc2Ratio);
        __CLR4_5_2adyadylwydzns4.R.inc(13540);position.set(Position.PREFIX_ADC + 3, analogIn3 * adc3Ratio);
        __CLR4_5_2adyadylwydzns4.R.inc(13541);position.set(Position.PREFIX_ADC + 4, analogIn4 * adc4Ratio);

        __CLR4_5_2adyadylwydzns4.R.inc(13542);position.setAltitude(buf.readUnsignedByte() * 10);

        __CLR4_5_2adyadylwydzns4.R.inc(13543);int output = buf.readUnsignedByte();
        __CLR4_5_2adyadylwydzns4.R.inc(13544);for (int i = 0; (((i < 8)&&(__CLR4_5_2adyadylwydzns4.R.iget(13545)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13546)==0&false)); i++) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13547);position.set(Position.PREFIX_IO + (i + 1), BitUtil.check(output, i));
        }
        }__CLR4_5_2adyadylwydzns4.R.inc(13548);buf.readUnsignedByte(); // status message buffer
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2adyadylwydzns4.R.inc(13549);

        __CLR4_5_2adyadylwydzns4.R.inc(13550);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2adyadylwydzns4.R.inc(13551);int indexTilde = buf.indexOf(buf.readerIndex(), buf.writerIndex(), new StringFinder("~"));

        __CLR4_5_2adyadylwydzns4.R.inc(13552);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);

        __CLR4_5_2adyadylwydzns4.R.inc(13553);if ((((deviceSession != null && indexTilde == -1)&&(__CLR4_5_2adyadylwydzns4.R.iget(13554)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13555)==0&false))) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13556);String bufString = buf.toString(StandardCharsets.US_ASCII);
            __CLR4_5_2adyadylwydzns4.R.inc(13557);Position position = new Position();
            __CLR4_5_2adyadylwydzns4.R.inc(13558);position.setProtocol(getProtocolName());
            __CLR4_5_2adyadylwydzns4.R.inc(13559);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2adyadylwydzns4.R.inc(13560);position.setTime(new Date());
            __CLR4_5_2adyadylwydzns4.R.inc(13561);getLastLocation(position, new Date());
            __CLR4_5_2adyadylwydzns4.R.inc(13562);position.setValid(false);
            __CLR4_5_2adyadylwydzns4.R.inc(13563);position.set(Position.KEY_RESULT, bufString);
            __CLR4_5_2adyadylwydzns4.R.inc(13564);return position;
        }

        }__CLR4_5_2adyadylwydzns4.R.inc(13565);if ((((buf.readableBytes() < HEADER_LENGTH)&&(__CLR4_5_2adyadylwydzns4.R.iget(13566)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13567)==0&false))) {{
            __CLR4_5_2adyadylwydzns4.R.inc(13568);return null;
        }
        }__CLR4_5_2adyadylwydzns4.R.inc(13569);String header = buf.readBytes(HEADER_LENGTH).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2adyadylwydzns4.R.inc(13570);if ((((header.equals("+RRCB~"))&&(__CLR4_5_2adyadylwydzns4.R.iget(13571)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13572)==0&false))) {{

            __CLR4_5_2adyadylwydzns4.R.inc(13573);buf.skipBytes(2); //binary length 26
            __CLR4_5_2adyadylwydzns4.R.inc(13574);int deviceId = buf.readUnsignedShort();
            __CLR4_5_2adyadylwydzns4.R.inc(13575);deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));
            __CLR4_5_2adyadylwydzns4.R.inc(13576);if ((((deviceSession == null)&&(__CLR4_5_2adyadylwydzns4.R.iget(13577)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13578)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13579);return null;
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13580);long unixTime = buf.readUnsignedInt();
            __CLR4_5_2adyadylwydzns4.R.inc(13581);if ((((channel != null)&&(__CLR4_5_2adyadylwydzns4.R.iget(13582)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13583)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13584);sendResponseCurrent(channel, deviceId, unixTime);
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13585);Position position = new Position();
            __CLR4_5_2adyadylwydzns4.R.inc(13586);position.setProtocol(getProtocolName());
            __CLR4_5_2adyadylwydzns4.R.inc(13587);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2adyadylwydzns4.R.inc(13588);position.setTime(new Date(unixTime * 1000));

            __CLR4_5_2adyadylwydzns4.R.inc(13589);decodeStructure(buf, position);
            __CLR4_5_2adyadylwydzns4.R.inc(13590);return position;

        } }else {__CLR4_5_2adyadylwydzns4.R.inc(13591);if ((((header.equals("+DDAT~"))&&(__CLR4_5_2adyadylwydzns4.R.iget(13592)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13593)==0&false))) {{

            __CLR4_5_2adyadylwydzns4.R.inc(13594);buf.skipBytes(2); //binary length
            __CLR4_5_2adyadylwydzns4.R.inc(13595);int deviceId = buf.readUnsignedShort();
            __CLR4_5_2adyadylwydzns4.R.inc(13596);deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));
            __CLR4_5_2adyadylwydzns4.R.inc(13597);if ((((deviceSession == null)&&(__CLR4_5_2adyadylwydzns4.R.iget(13598)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13599)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13600);return null;
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13601);byte format = buf.readByte();
            __CLR4_5_2adyadylwydzns4.R.inc(13602);if ((((format != 4)&&(__CLR4_5_2adyadylwydzns4.R.iget(13603)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13604)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13605);return null;
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13606);byte nblocks = buf.readByte();
            __CLR4_5_2adyadylwydzns4.R.inc(13607);int packNum = buf.readUnsignedShort();
            __CLR4_5_2adyadylwydzns4.R.inc(13608);if ((((channel != null)&&(__CLR4_5_2adyadylwydzns4.R.iget(13609)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13610)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13611);sendResponseArchive(channel, deviceId, packNum);
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13612);List<Position> positions = new ArrayList<>();
            __CLR4_5_2adyadylwydzns4.R.inc(13613);while ((((nblocks > 0)&&(__CLR4_5_2adyadylwydzns4.R.iget(13614)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13615)==0&false))) {{
                __CLR4_5_2adyadylwydzns4.R.inc(13616);nblocks--;
                __CLR4_5_2adyadylwydzns4.R.inc(13617);long unixTime = buf.readUnsignedInt();
                __CLR4_5_2adyadylwydzns4.R.inc(13618);int timeIncrement = buf.getUnsignedShort(buf.readerIndex() + 120);
                __CLR4_5_2adyadylwydzns4.R.inc(13619);for (int i = 0; (((i < 6)&&(__CLR4_5_2adyadylwydzns4.R.iget(13620)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13621)==0&false)); i++) {{
                    __CLR4_5_2adyadylwydzns4.R.inc(13622);if ((((buf.getUnsignedByte(buf.readerIndex()) != 0xFE)&&(__CLR4_5_2adyadylwydzns4.R.iget(13623)!=0|true))||(__CLR4_5_2adyadylwydzns4.R.iget(13624)==0&false))) {{
                        __CLR4_5_2adyadylwydzns4.R.inc(13625);Position position = new Position();
                        __CLR4_5_2adyadylwydzns4.R.inc(13626);position.setProtocol(getProtocolName());
                        __CLR4_5_2adyadylwydzns4.R.inc(13627);position.setDeviceId(deviceSession.getDeviceId());
                        __CLR4_5_2adyadylwydzns4.R.inc(13628);position.setTime(new Date((unixTime + i * timeIncrement) * 1000));
                        __CLR4_5_2adyadylwydzns4.R.inc(13629);decodeStructure(buf, position);
                        __CLR4_5_2adyadylwydzns4.R.inc(13630);position.set(Position.KEY_ARCHIVE, true);
                        __CLR4_5_2adyadylwydzns4.R.inc(13631);positions.add(position);
                    } }else {{
                        __CLR4_5_2adyadylwydzns4.R.inc(13632);buf.skipBytes(20); // skip filled 0xFE structure
                    }
                }}
                }__CLR4_5_2adyadylwydzns4.R.inc(13633);buf.skipBytes(2); // increment
            }
            }__CLR4_5_2adyadylwydzns4.R.inc(13634);return positions;

        }

        }}__CLR4_5_2adyadylwydzns4.R.inc(13635);return null;
    }finally{__CLR4_5_2adyadylwydzns4.R.flushNeeded();}}

}
