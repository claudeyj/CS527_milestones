/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.util.Date;

@java.lang.SuppressWarnings({"fallthrough"}) public class NavigilProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2daidailwydzpq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,17404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NavigilProtocolDecoder(NavigilProtocol protocol) {
        super(protocol);__CLR4_5_2daidailwydzpq6.R.inc(17227);try{__CLR4_5_2daidailwydzpq6.R.inc(17226);
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private static final int LEAP_SECONDS_DELTA = 25;

    public static final int MSG_ERROR = 2;
    public static final int MSG_INDICATION = 4;
    public static final int MSG_CONN_OPEN = 5;
    public static final int MSG_CONN_CLOSE = 6;
    public static final int MSG_SYSTEM_REPORT = 7;
    public static final int MSG_UNIT_REPORT = 8;
    public static final int MSG_GEOFENCE_ALARM = 10;
    public static final int MSG_INPUT_ALARM = 11;
    public static final int MSG_TG2_REPORT = 12;
    public static final int MSG_POSITION_REPORT = 13;
    public static final int MSG_POSITION_REPORT_2 = 15;
    public static final int MSG_SNAPSHOT4 = 17;
    public static final int MSG_TRACKING_DATA = 18;
    public static final int MSG_MOTION_ALARM = 19;
    public static final int MSG_ACKNOWLEDGEMENT = 255;

    private static Date convertTimestamp(long timestamp) {try{__CLR4_5_2daidailwydzpq6.R.inc(17228);
        __CLR4_5_2daidailwydzpq6.R.inc(17229);return new Date((timestamp - LEAP_SECONDS_DELTA) * 1000);
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private int senderSequenceNumber = 1;

    private void sendAcknowledgment(Channel channel, int sequenceNumber) {try{__CLR4_5_2daidailwydzpq6.R.inc(17230);
        __CLR4_5_2daidailwydzpq6.R.inc(17231);ChannelBuffer data = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 4);
        __CLR4_5_2daidailwydzpq6.R.inc(17232);data.writeShort(sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17233);data.writeShort(0); // OK

        __CLR4_5_2daidailwydzpq6.R.inc(17234);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 20);
        __CLR4_5_2daidailwydzpq6.R.inc(17235);header.writeByte(1); __CLR4_5_2daidailwydzpq6.R.inc(17236);header.writeByte(0);
        __CLR4_5_2daidailwydzpq6.R.inc(17237);header.writeShort(senderSequenceNumber++);
        __CLR4_5_2daidailwydzpq6.R.inc(17238);header.writeShort(MSG_ACKNOWLEDGEMENT);
        __CLR4_5_2daidailwydzpq6.R.inc(17239);header.writeShort(header.capacity() + data.capacity());
        __CLR4_5_2daidailwydzpq6.R.inc(17240);header.writeShort(0);
        __CLR4_5_2daidailwydzpq6.R.inc(17241);header.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, data.toByteBuffer()));
        __CLR4_5_2daidailwydzpq6.R.inc(17242);header.writeInt(0);
        __CLR4_5_2daidailwydzpq6.R.inc(17243);header.writeInt((int) (System.currentTimeMillis() / 1000) + LEAP_SECONDS_DELTA);

        __CLR4_5_2daidailwydzpq6.R.inc(17244);if ((((channel != null)&&(__CLR4_5_2daidailwydzpq6.R.iget(17245)!=0|true))||(__CLR4_5_2daidailwydzpq6.R.iget(17246)==0&false))) {{
            __CLR4_5_2daidailwydzpq6.R.inc(17247);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parseUnitReport(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2daidailwydzpq6.R.inc(17248);
        __CLR4_5_2daidailwydzpq6.R.inc(17249);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17250);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17251);position.setValid(true);
        __CLR4_5_2daidailwydzpq6.R.inc(17252);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17253);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2daidailwydzpq6.R.inc(17254);buf.readUnsignedShort(); // report trigger
        __CLR4_5_2daidailwydzpq6.R.inc(17255);position.set(Position.KEY_FLAGS, buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17256);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17257);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17258);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17259);position.set(Position.KEY_SATELLITES, buf.readUnsignedShort());
        __CLR4_5_2daidailwydzpq6.R.inc(17260);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedShort());
        __CLR4_5_2daidailwydzpq6.R.inc(17261);position.set("gpsAntennaState", buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17262);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2daidailwydzpq6.R.inc(17263);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17264);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
        __CLR4_5_2daidailwydzpq6.R.inc(17265);position.set(Position.KEY_DISTANCE, buf.readUnsignedInt());

        __CLR4_5_2daidailwydzpq6.R.inc(17266);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2daidailwydzpq6.R.inc(17267);position.set(Position.KEY_CHARGE, buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17268);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2daidailwydzpq6.R.inc(17269);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parseTg2Report(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2daidailwydzpq6.R.inc(17270);
        __CLR4_5_2daidailwydzpq6.R.inc(17271);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17272);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17273);position.setValid(true);
        __CLR4_5_2daidailwydzpq6.R.inc(17274);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17275);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2daidailwydzpq6.R.inc(17276);buf.readUnsignedShort(); // report trigger
        __CLR4_5_2daidailwydzpq6.R.inc(17277);buf.readUnsignedByte(); // reserved
        __CLR4_5_2daidailwydzpq6.R.inc(17278);buf.readUnsignedByte(); // assisted GPS age

        __CLR4_5_2daidailwydzpq6.R.inc(17279);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2daidailwydzpq6.R.inc(17280);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17281);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17282);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17283);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17284);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedByte());

        __CLR4_5_2daidailwydzpq6.R.inc(17285);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2daidailwydzpq6.R.inc(17286);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17287);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
        __CLR4_5_2daidailwydzpq6.R.inc(17288);position.set("maximumSpeed", buf.readUnsignedShort());
        __CLR4_5_2daidailwydzpq6.R.inc(17289);position.set("minimumSpeed", buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17290);position.set(Position.PREFIX_IO + 1, buf.readUnsignedShort()); // VSAUT1 voltage
        __CLR4_5_2daidailwydzpq6.R.inc(17291);position.set(Position.PREFIX_IO + 2, buf.readUnsignedShort()); // VSAUT2 voltage
        __CLR4_5_2daidailwydzpq6.R.inc(17292);position.set(Position.PREFIX_IO + 3, buf.readUnsignedShort()); // solar voltage

        __CLR4_5_2daidailwydzpq6.R.inc(17293);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2daidailwydzpq6.R.inc(17294);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parsePositionReport(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2daidailwydzpq6.R.inc(17295);
        __CLR4_5_2daidailwydzpq6.R.inc(17296);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17297);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17298);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17299);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2daidailwydzpq6.R.inc(17300);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2daidailwydzpq6.R.inc(17301);position.setLatitude(buf.readMedium() * 0.00002);
        __CLR4_5_2daidailwydzpq6.R.inc(17302);position.setLongitude(buf.readMedium() * 0.00002);

        __CLR4_5_2daidailwydzpq6.R.inc(17303);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_2daidailwydzpq6.R.inc(17304);position.setCourse(buf.readUnsignedByte() * 2);

        __CLR4_5_2daidailwydzpq6.R.inc(17305);short flags = buf.readUnsignedByte();
        __CLR4_5_2daidailwydzpq6.R.inc(17306);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);

        __CLR4_5_2daidailwydzpq6.R.inc(17307);buf.readUnsignedByte(); // reserved

        __CLR4_5_2daidailwydzpq6.R.inc(17308);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parsePositionReport2(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2daidailwydzpq6.R.inc(17309);
        __CLR4_5_2daidailwydzpq6.R.inc(17310);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17311);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17312);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17313);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2daidailwydzpq6.R.inc(17314);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2daidailwydzpq6.R.inc(17315);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17316);position.setLongitude(buf.readInt() * 0.0000001);

        __CLR4_5_2daidailwydzpq6.R.inc(17317);buf.readUnsignedByte(); // report trigger

        __CLR4_5_2daidailwydzpq6.R.inc(17318);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

        __CLR4_5_2daidailwydzpq6.R.inc(17319);short flags = buf.readUnsignedByte();
        __CLR4_5_2daidailwydzpq6.R.inc(17320);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);

        __CLR4_5_2daidailwydzpq6.R.inc(17321);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17322);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

        __CLR4_5_2daidailwydzpq6.R.inc(17323);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parseSnapshot4(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2daidailwydzpq6.R.inc(17324);
        __CLR4_5_2daidailwydzpq6.R.inc(17325);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17326);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17327);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17328);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2daidailwydzpq6.R.inc(17329);buf.readUnsignedByte(); // report trigger
        __CLR4_5_2daidailwydzpq6.R.inc(17330);buf.readUnsignedByte(); // position fix source
        __CLR4_5_2daidailwydzpq6.R.inc(17331);buf.readUnsignedByte(); // GNSS fix quality
        __CLR4_5_2daidailwydzpq6.R.inc(17332);buf.readUnsignedByte(); // GNSS assistance age

        __CLR4_5_2daidailwydzpq6.R.inc(17333);long flags = buf.readUnsignedInt();
        __CLR4_5_2daidailwydzpq6.R.inc(17334);position.setValid((flags & 0x0400) == 0x0400);

        __CLR4_5_2daidailwydzpq6.R.inc(17335);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2daidailwydzpq6.R.inc(17336);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17337);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17338);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2daidailwydzpq6.R.inc(17339);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17340);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedByte());

        __CLR4_5_2daidailwydzpq6.R.inc(17341);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2daidailwydzpq6.R.inc(17342);position.setCourse(buf.readUnsignedShort() * 0.1);

        __CLR4_5_2daidailwydzpq6.R.inc(17343);position.set("maximumSpeed", buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17344);position.set("minimumSpeed", buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17345);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

        __CLR4_5_2daidailwydzpq6.R.inc(17346);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte()); // supply voltage 1
        __CLR4_5_2daidailwydzpq6.R.inc(17347);position.set(Position.PREFIX_IO + 2, buf.readUnsignedByte()); // supply voltage 2
        __CLR4_5_2daidailwydzpq6.R.inc(17348);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2daidailwydzpq6.R.inc(17349);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    private Position parseTrackingData(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2daidailwydzpq6.R.inc(17350);
        __CLR4_5_2daidailwydzpq6.R.inc(17351);Position position = new Position();
        __CLR4_5_2daidailwydzpq6.R.inc(17352);position.setProtocol(getProtocolName());

        __CLR4_5_2daidailwydzpq6.R.inc(17353);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2daidailwydzpq6.R.inc(17354);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2daidailwydzpq6.R.inc(17355);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2daidailwydzpq6.R.inc(17356);buf.readUnsignedByte(); // tracking mode

        __CLR4_5_2daidailwydzpq6.R.inc(17357);short flags = buf.readUnsignedByte();
        __CLR4_5_2daidailwydzpq6.R.inc(17358);position.setValid((flags & 0x01) == 0x01);

        __CLR4_5_2daidailwydzpq6.R.inc(17359);buf.readUnsignedShort(); // duration

        __CLR4_5_2daidailwydzpq6.R.inc(17360);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2daidailwydzpq6.R.inc(17361);position.setLongitude(buf.readInt() * 0.0000001);

        __CLR4_5_2daidailwydzpq6.R.inc(17362);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_2daidailwydzpq6.R.inc(17363);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_2daidailwydzpq6.R.inc(17364);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2daidailwydzpq6.R.inc(17365);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        __CLR4_5_2daidailwydzpq6.R.inc(17366);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

        __CLR4_5_2daidailwydzpq6.R.inc(17367);return position;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2daidailwydzpq6.R.inc(17368);

        __CLR4_5_2daidailwydzpq6.R.inc(17369);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2daidailwydzpq6.R.inc(17370);buf.readUnsignedByte(); // protocol version
        __CLR4_5_2daidailwydzpq6.R.inc(17371);buf.readUnsignedByte(); // version id
        __CLR4_5_2daidailwydzpq6.R.inc(17372);int sequenceNumber = buf.readUnsignedShort();
        __CLR4_5_2daidailwydzpq6.R.inc(17373);int messageId = buf.readUnsignedShort();
        __CLR4_5_2daidailwydzpq6.R.inc(17374);buf.readUnsignedShort(); // length
        __CLR4_5_2daidailwydzpq6.R.inc(17375);int flags = buf.readUnsignedShort();
        __CLR4_5_2daidailwydzpq6.R.inc(17376);buf.readUnsignedShort(); // checksum

        __CLR4_5_2daidailwydzpq6.R.inc(17377);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(buf.readUnsignedInt()));
        __CLR4_5_2daidailwydzpq6.R.inc(17378);if ((((deviceSession == null)&&(__CLR4_5_2daidailwydzpq6.R.iget(17379)!=0|true))||(__CLR4_5_2daidailwydzpq6.R.iget(17380)==0&false))) {{
            __CLR4_5_2daidailwydzpq6.R.inc(17381);return null;
        }

        }__CLR4_5_2daidailwydzpq6.R.inc(17382);long timestamp = buf.readUnsignedInt();

        __CLR4_5_2daidailwydzpq6.R.inc(17383);if (((((flags & 0x1) == 0x0)&&(__CLR4_5_2daidailwydzpq6.R.iget(17384)!=0|true))||(__CLR4_5_2daidailwydzpq6.R.iget(17385)==0&false))) {{
            __CLR4_5_2daidailwydzpq6.R.inc(17386);sendAcknowledgment(channel, sequenceNumber);
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2daidailwydzpq6.R.inc(17387);switch (messageId) {
            case MSG_UNIT_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17388);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17389);return parseUnitReport(deviceSession, buf, sequenceNumber);
            case MSG_TG2_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17390);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17391);return parseTg2Report(deviceSession, buf, sequenceNumber);
            case MSG_POSITION_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17392);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17393);return parsePositionReport(deviceSession, buf, sequenceNumber, timestamp);
            case MSG_POSITION_REPORT_2:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17394);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17395);return parsePositionReport2(deviceSession, buf, sequenceNumber, timestamp);
            case MSG_SNAPSHOT4:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17396);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17397);return parseSnapshot4(deviceSession, buf, sequenceNumber);
            case MSG_TRACKING_DATA:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17398);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17399);return parseTrackingData(deviceSession, buf, sequenceNumber, timestamp);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2daidailwydzpq6.R.inc(17400);__CLB4_5_2_bool0=true;}
                __CLR4_5_2daidailwydzpq6.R.inc(17401);Log.warning(new UnsupportedOperationException(String.valueOf(messageId)));
                __CLR4_5_2daidailwydzpq6.R.inc(17402);break;
        }

        __CLR4_5_2daidailwydzpq6.R.inc(17403);return null;
    }finally{__CLR4_5_2daidailwydzpq6.R.flushNeeded();}}

}
