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

public class GranitProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28us8uslx1dzast{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,11649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int HEADER_LENGTH = 6;

    private double adc1Ratio;
    private double adc2Ratio;
    private double adc3Ratio;
    private double adc4Ratio;

    public GranitProtocolDecoder(GranitProtocol protocol) {
        super(protocol);__CLR4_5_28us8uslx1dzast.R.inc(11477);try{__CLR4_5_28us8uslx1dzast.R.inc(11476);
        __CLR4_5_28us8uslx1dzast.R.inc(11478);adc1Ratio = Context.getConfig().getDouble("granit.adc1Ratio", 1);
        __CLR4_5_28us8uslx1dzast.R.inc(11479);adc2Ratio = Context.getConfig().getDouble("granit.adc2Ratio", 1);
        __CLR4_5_28us8uslx1dzast.R.inc(11480);adc3Ratio = Context.getConfig().getDouble("granit.adc3Ratio", 1);
        __CLR4_5_28us8uslx1dzast.R.inc(11481);adc4Ratio = Context.getConfig().getDouble("granit.adc4Ratio", 1);
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

    public static void appendChecksum(ChannelBuffer buffer, int length) {try{__CLR4_5_28us8uslx1dzast.R.inc(11482);
        __CLR4_5_28us8uslx1dzast.R.inc(11483);buffer.writeByte('*');
        __CLR4_5_28us8uslx1dzast.R.inc(11484);int checksum = Checksum.xor(buffer.toByteBuffer(0, length)) & 0xFF;
        __CLR4_5_28us8uslx1dzast.R.inc(11485);String checksumString = String.format("%02X", checksum);
        __CLR4_5_28us8uslx1dzast.R.inc(11486);buffer.writeBytes(checksumString.getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_28us8uslx1dzast.R.inc(11487);buffer.writeByte('\r'); __CLR4_5_28us8uslx1dzast.R.inc(11488);buffer.writeByte('\n');
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

    private static void sendResponseCurrent(Channel channel, int deviceId, long time) {try{__CLR4_5_28us8uslx1dzast.R.inc(11489);
        __CLR4_5_28us8uslx1dzast.R.inc(11490);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
        __CLR4_5_28us8uslx1dzast.R.inc(11491);response.writeBytes("BB+UGRC~".getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_28us8uslx1dzast.R.inc(11492);response.writeShort(6); // length
        __CLR4_5_28us8uslx1dzast.R.inc(11493);response.writeInt((int) time);
        __CLR4_5_28us8uslx1dzast.R.inc(11494);response.writeShort(deviceId);
        __CLR4_5_28us8uslx1dzast.R.inc(11495);appendChecksum(response, 16);
        __CLR4_5_28us8uslx1dzast.R.inc(11496);channel.write(response);
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

    private static void sendResponseArchive(Channel channel, int deviceId, int packNum) {try{__CLR4_5_28us8uslx1dzast.R.inc(11497);
        __CLR4_5_28us8uslx1dzast.R.inc(11498);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
        __CLR4_5_28us8uslx1dzast.R.inc(11499);response.writeBytes("BB+ARCF~".getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_28us8uslx1dzast.R.inc(11500);response.writeShort(4); // length
        __CLR4_5_28us8uslx1dzast.R.inc(11501);response.writeShort(packNum);
        __CLR4_5_28us8uslx1dzast.R.inc(11502);response.writeShort(deviceId);
        __CLR4_5_28us8uslx1dzast.R.inc(11503);appendChecksum(response, 14);
        __CLR4_5_28us8uslx1dzast.R.inc(11504);channel.write(response);
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

    private void decodeStructure(ChannelBuffer buf, Position position) {try{__CLR4_5_28us8uslx1dzast.R.inc(11505);
        __CLR4_5_28us8uslx1dzast.R.inc(11506);short flags = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11507);position.setValid(BitUtil.check(flags, 7));
        __CLR4_5_28us8uslx1dzast.R.inc(11508);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_28us8uslx1dzast.R.iget(11509)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11510)==0&false))) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11511);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }

        }__CLR4_5_28us8uslx1dzast.R.inc(11512);short satDel = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11513);position.set(Position.KEY_SATELLITES, BitUtil.from(satDel, 4));

        __CLR4_5_28us8uslx1dzast.R.inc(11514);int pdop = BitUtil.to(satDel, 4);
        __CLR4_5_28us8uslx1dzast.R.inc(11515);position.set("pdop", pdop);

        __CLR4_5_28us8uslx1dzast.R.inc(11516);int lonDegrees = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11517);int latDegrees = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11518);int lonMinutes = buf.readUnsignedShort();
        __CLR4_5_28us8uslx1dzast.R.inc(11519);int latMinutes = buf.readUnsignedShort();

        __CLR4_5_28us8uslx1dzast.R.inc(11520);double latitude = latDegrees + latMinutes / 60000.0;
        __CLR4_5_28us8uslx1dzast.R.inc(11521);double longitude = lonDegrees + lonMinutes / 60000.0;

        __CLR4_5_28us8uslx1dzast.R.inc(11522);if ((((position.getValid())&&(__CLR4_5_28us8uslx1dzast.R.iget(11523)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11524)==0&false))) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11525);if ((((!BitUtil.check(flags, 4))&&(__CLR4_5_28us8uslx1dzast.R.iget(11526)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11527)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11528);latitude = -latitude;
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11529);if ((((!BitUtil.check(flags, 5))&&(__CLR4_5_28us8uslx1dzast.R.iget(11530)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11531)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11532);longitude = -longitude;
            }
        }}

        }__CLR4_5_28us8uslx1dzast.R.inc(11533);position.setLongitude(longitude);
        __CLR4_5_28us8uslx1dzast.R.inc(11534);position.setLatitude(latitude);

        __CLR4_5_28us8uslx1dzast.R.inc(11535);position.setSpeed(buf.readUnsignedByte());

        __CLR4_5_28us8uslx1dzast.R.inc(11536);int course = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11537);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_28us8uslx1dzast.R.iget(11538)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11539)==0&false))) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11540);course = course | 0x100;
        }
        }__CLR4_5_28us8uslx1dzast.R.inc(11541);position.setCourse(course);

        __CLR4_5_28us8uslx1dzast.R.inc(11542);position.set(Position.KEY_DISTANCE, buf.readShort());

        __CLR4_5_28us8uslx1dzast.R.inc(11543);int analogIn1 = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11544);int analogIn2 = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11545);int analogIn3 = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11546);int analogIn4 = buf.readUnsignedByte();

        __CLR4_5_28us8uslx1dzast.R.inc(11547);int analogInHi = buf.readUnsignedByte();

        __CLR4_5_28us8uslx1dzast.R.inc(11548);analogIn1 = analogInHi << 8 & 0x300 | analogIn1;
        __CLR4_5_28us8uslx1dzast.R.inc(11549);analogIn2 = analogInHi << 6 & 0x300 | analogIn2;
        __CLR4_5_28us8uslx1dzast.R.inc(11550);analogIn3 = analogInHi << 4 & 0x300 | analogIn3;
        __CLR4_5_28us8uslx1dzast.R.inc(11551);analogIn4 = analogInHi << 2 & 0x300 | analogIn4;

        __CLR4_5_28us8uslx1dzast.R.inc(11552);position.set(Position.PREFIX_ADC + 1, analogIn1 * adc1Ratio);
        __CLR4_5_28us8uslx1dzast.R.inc(11553);position.set(Position.PREFIX_ADC + 2, analogIn2 * adc2Ratio);
        __CLR4_5_28us8uslx1dzast.R.inc(11554);position.set(Position.PREFIX_ADC + 3, analogIn3 * adc3Ratio);
        __CLR4_5_28us8uslx1dzast.R.inc(11555);position.set(Position.PREFIX_ADC + 4, analogIn4 * adc4Ratio);

        __CLR4_5_28us8uslx1dzast.R.inc(11556);position.setAltitude(buf.readUnsignedByte() * 10);

        __CLR4_5_28us8uslx1dzast.R.inc(11557);int output = buf.readUnsignedByte();
        __CLR4_5_28us8uslx1dzast.R.inc(11558);for (int i = 0; (((i < 8)&&(__CLR4_5_28us8uslx1dzast.R.iget(11559)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11560)==0&false)); i++) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11561);position.set(Position.PREFIX_IO + (i + 1), BitUtil.check(output, i));
        }
        }__CLR4_5_28us8uslx1dzast.R.inc(11562);buf.readUnsignedByte(); // status message buffer
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28us8uslx1dzast.R.inc(11563);

        __CLR4_5_28us8uslx1dzast.R.inc(11564);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28us8uslx1dzast.R.inc(11565);int indexTilde = buf.indexOf(buf.readerIndex(), buf.writerIndex(), new StringFinder("~"));

        __CLR4_5_28us8uslx1dzast.R.inc(11566);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);

        __CLR4_5_28us8uslx1dzast.R.inc(11567);if ((((deviceSession != null && indexTilde == -1)&&(__CLR4_5_28us8uslx1dzast.R.iget(11568)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11569)==0&false))) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11570);String bufString = buf.toString(StandardCharsets.US_ASCII);
            __CLR4_5_28us8uslx1dzast.R.inc(11571);Position position = new Position();
            __CLR4_5_28us8uslx1dzast.R.inc(11572);position.setProtocol(getProtocolName());
            __CLR4_5_28us8uslx1dzast.R.inc(11573);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28us8uslx1dzast.R.inc(11574);position.setTime(new Date());
            __CLR4_5_28us8uslx1dzast.R.inc(11575);getLastLocation(position, new Date());
            __CLR4_5_28us8uslx1dzast.R.inc(11576);position.setValid(false);
            __CLR4_5_28us8uslx1dzast.R.inc(11577);position.set(Position.KEY_RESULT, bufString);
            __CLR4_5_28us8uslx1dzast.R.inc(11578);return position;
        }

        }__CLR4_5_28us8uslx1dzast.R.inc(11579);if ((((buf.readableBytes() < HEADER_LENGTH)&&(__CLR4_5_28us8uslx1dzast.R.iget(11580)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11581)==0&false))) {{
            __CLR4_5_28us8uslx1dzast.R.inc(11582);return null;
        }
        }__CLR4_5_28us8uslx1dzast.R.inc(11583);String header = buf.readBytes(HEADER_LENGTH).toString(StandardCharsets.US_ASCII);

        __CLR4_5_28us8uslx1dzast.R.inc(11584);if ((((header.equals("+RRCB~"))&&(__CLR4_5_28us8uslx1dzast.R.iget(11585)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11586)==0&false))) {{

            __CLR4_5_28us8uslx1dzast.R.inc(11587);buf.skipBytes(2); //binary length 26
            __CLR4_5_28us8uslx1dzast.R.inc(11588);int deviceId = buf.readUnsignedShort();
            __CLR4_5_28us8uslx1dzast.R.inc(11589);deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));
            __CLR4_5_28us8uslx1dzast.R.inc(11590);if ((((deviceSession == null)&&(__CLR4_5_28us8uslx1dzast.R.iget(11591)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11592)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11593);return null;
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11594);long unixTime = buf.readUnsignedInt();
            __CLR4_5_28us8uslx1dzast.R.inc(11595);if ((((channel != null)&&(__CLR4_5_28us8uslx1dzast.R.iget(11596)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11597)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11598);sendResponseCurrent(channel, deviceId, unixTime);
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11599);Position position = new Position();
            __CLR4_5_28us8uslx1dzast.R.inc(11600);position.setProtocol(getProtocolName());
            __CLR4_5_28us8uslx1dzast.R.inc(11601);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28us8uslx1dzast.R.inc(11602);position.setTime(new Date(unixTime * 1000));

            __CLR4_5_28us8uslx1dzast.R.inc(11603);decodeStructure(buf, position);
            __CLR4_5_28us8uslx1dzast.R.inc(11604);return position;

        } }else {__CLR4_5_28us8uslx1dzast.R.inc(11605);if ((((header.equals("+DDAT~"))&&(__CLR4_5_28us8uslx1dzast.R.iget(11606)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11607)==0&false))) {{

            __CLR4_5_28us8uslx1dzast.R.inc(11608);buf.skipBytes(2); //binary length
            __CLR4_5_28us8uslx1dzast.R.inc(11609);int deviceId = buf.readUnsignedShort();
            __CLR4_5_28us8uslx1dzast.R.inc(11610);deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));
            __CLR4_5_28us8uslx1dzast.R.inc(11611);if ((((deviceSession == null)&&(__CLR4_5_28us8uslx1dzast.R.iget(11612)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11613)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11614);return null;
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11615);byte format = buf.readByte();
            __CLR4_5_28us8uslx1dzast.R.inc(11616);if ((((format != 4)&&(__CLR4_5_28us8uslx1dzast.R.iget(11617)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11618)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11619);return null;
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11620);byte nblocks = buf.readByte();
            __CLR4_5_28us8uslx1dzast.R.inc(11621);int packNum = buf.readUnsignedShort();
            __CLR4_5_28us8uslx1dzast.R.inc(11622);if ((((channel != null)&&(__CLR4_5_28us8uslx1dzast.R.iget(11623)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11624)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11625);sendResponseArchive(channel, deviceId, packNum);
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11626);List<Position> positions = new ArrayList<>();
            __CLR4_5_28us8uslx1dzast.R.inc(11627);while ((((nblocks > 0)&&(__CLR4_5_28us8uslx1dzast.R.iget(11628)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11629)==0&false))) {{
                __CLR4_5_28us8uslx1dzast.R.inc(11630);nblocks--;
                __CLR4_5_28us8uslx1dzast.R.inc(11631);long unixTime = buf.readUnsignedInt();
                __CLR4_5_28us8uslx1dzast.R.inc(11632);int timeIncrement = buf.getUnsignedShort(buf.readerIndex() + 120);
                __CLR4_5_28us8uslx1dzast.R.inc(11633);for (int i = 0; (((i < 6)&&(__CLR4_5_28us8uslx1dzast.R.iget(11634)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11635)==0&false)); i++) {{
                    __CLR4_5_28us8uslx1dzast.R.inc(11636);if ((((buf.getUnsignedByte(buf.readerIndex()) != 0xFE)&&(__CLR4_5_28us8uslx1dzast.R.iget(11637)!=0|true))||(__CLR4_5_28us8uslx1dzast.R.iget(11638)==0&false))) {{
                        __CLR4_5_28us8uslx1dzast.R.inc(11639);Position position = new Position();
                        __CLR4_5_28us8uslx1dzast.R.inc(11640);position.setProtocol(getProtocolName());
                        __CLR4_5_28us8uslx1dzast.R.inc(11641);position.setDeviceId(deviceSession.getDeviceId());
                        __CLR4_5_28us8uslx1dzast.R.inc(11642);position.setTime(new Date((unixTime + i * timeIncrement) * 1000));
                        __CLR4_5_28us8uslx1dzast.R.inc(11643);decodeStructure(buf, position);
                        __CLR4_5_28us8uslx1dzast.R.inc(11644);positions.add(position);
                    } }else {{
                        __CLR4_5_28us8uslx1dzast.R.inc(11645);buf.skipBytes(20); // skip filled 0xFE structure
                    }
                }}
                }__CLR4_5_28us8uslx1dzast.R.inc(11646);buf.skipBytes(2); // increment
            }
            }__CLR4_5_28us8uslx1dzast.R.inc(11647);return positions;

        }

        }}__CLR4_5_28us8uslx1dzast.R.inc(11648);return null;
    }finally{__CLR4_5_28us8uslx1dzast.R.flushNeeded();}}

}
