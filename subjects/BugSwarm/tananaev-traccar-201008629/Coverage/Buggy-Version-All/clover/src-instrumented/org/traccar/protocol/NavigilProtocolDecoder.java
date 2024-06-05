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

@java.lang.SuppressWarnings({"fallthrough"}) public class NavigilProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bh6bh6lx1dxp9w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,15052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NavigilProtocolDecoder(NavigilProtocol protocol) {
        super(protocol);__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14875);try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14874);
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

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

    private static Date convertTimestamp(long timestamp) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14876);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14877);return new Date((timestamp - LEAP_SECONDS_DELTA) * 1000);
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private int senderSequenceNumber = 1;

    private void sendAcknowledgment(Channel channel, int sequenceNumber) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14878);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14879);ChannelBuffer data = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 4);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14880);data.writeShort(sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14881);data.writeShort(0); // OK

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14882);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 20);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14883);header.writeByte(1); __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14884);header.writeByte(0);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14885);header.writeShort(senderSequenceNumber++);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14886);header.writeShort(MSG_ACKNOWLEDGEMENT);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14887);header.writeShort(header.capacity() + data.capacity());
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14888);header.writeShort(0);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14889);header.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, data.toByteBuffer()));
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14890);header.writeInt(0);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14891);header.writeInt((int) (System.currentTimeMillis() / 1000) + LEAP_SECONDS_DELTA);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14892);if ((((channel != null)&&(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(14893)!=0|true))||(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(14894)==0&false))) {{
            __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14895);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parseUnitReport(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14896);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14897);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14898);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14899);position.setValid(true);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14900);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14901);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14902);buf.readUnsignedShort(); // report trigger
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14903);buf.readUnsignedShort(); // flags

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14904);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14905);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14906);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14907);buf.readUnsignedShort(); // satellites in fix
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14908);buf.readUnsignedShort(); // satellites in track
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14909);buf.readUnsignedShort(); // GPS antenna state

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14910);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14911);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14912);buf.readUnsignedInt(); // distance
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14913);buf.readUnsignedInt(); // delta distance

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14914);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14915);buf.readUnsignedShort(); // battery charger status

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14916);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14917);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parseTg2Report(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14918);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14919);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14920);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14921);position.setValid(true);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14922);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14923);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14924);buf.readUnsignedShort(); // report trigger
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14925);buf.readUnsignedByte(); // reserved
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14926);buf.readUnsignedByte(); // assisted GPS age

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14927);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14928);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14929);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14930);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14931);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14932);buf.readUnsignedByte(); // satellites in track

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14933);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14934);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14935);buf.readUnsignedInt(); // distance
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14936);buf.readUnsignedShort(); // maximum speed
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14937);buf.readUnsignedShort(); // minimum speed

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14938);buf.readUnsignedShort(); // VSAUT1 voltage
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14939);buf.readUnsignedShort(); // VSAUT2 voltage
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14940);buf.readUnsignedShort(); // solar voltage
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14941);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14942);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parsePositionReport(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14943);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14944);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14945);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14946);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14947);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14948);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14949);position.setLatitude(buf.readMedium() * 0.00002);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14950);position.setLongitude(buf.readMedium() * 0.00002);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14951);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14952);position.setCourse(buf.readUnsignedByte() * 2);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14953);short flags = buf.readUnsignedByte();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14954);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14955);buf.readUnsignedByte(); // reserved
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14956);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parsePositionReport2(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14957);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14958);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14959);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14960);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14961);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14962);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14963);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14964);position.setLongitude(buf.readInt() * 0.0000001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14965);buf.readUnsignedByte(); // report trigger

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14966);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14967);short flags = buf.readUnsignedByte();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14968);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14969);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14970);buf.readUnsignedInt(); // distance
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14971);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parseSnapshot4(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14972);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14973);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14974);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14975);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14976);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14977);buf.readUnsignedByte(); // report trigger
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14978);buf.readUnsignedByte(); // position fix source
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14979);buf.readUnsignedByte(); // GNSS fix quality
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14980);buf.readUnsignedByte(); // GNSS assistance age

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14981);long flags = buf.readUnsignedInt();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14982);position.setValid((flags & 0x0400) == 0x0400);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14983);position.setTime(convertTimestamp(buf.readUnsignedInt()));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14984);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14985);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14986);position.setAltitude(buf.readUnsignedShort());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14987);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14988);buf.readUnsignedByte(); // satellites in track

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14989);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14990);position.setCourse(buf.readUnsignedShort() * 0.1);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14991);buf.readUnsignedByte(); // maximum speed
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14992);buf.readUnsignedByte(); // minimum speed
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14993);buf.readUnsignedInt(); // distance

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14994);buf.readUnsignedByte(); // supply voltage 1
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14995);buf.readUnsignedByte(); // supply voltage 2
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14996);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14997);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    private Position parseTrackingData(
            DeviceSession deviceSession, ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(14998);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(14999);Position position = new Position();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15000);position.setProtocol(getProtocolName());

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15001);position.set(Position.KEY_INDEX, sequenceNumber);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15002);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15003);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15004);buf.readUnsignedByte(); // tracking mode

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15005);short flags = buf.readUnsignedByte();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15006);position.setValid((flags & 0x01) == 0x01);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15007);buf.readUnsignedShort(); // duration

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15008);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15009);position.setLongitude(buf.readInt() * 0.0000001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15010);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15011);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15012);buf.readUnsignedByte(); // satellites in fix

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15013);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15014);buf.readUnsignedInt(); // distance
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15015);return position;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15016);

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15017);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15018);buf.readUnsignedByte(); // protocol version
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15019);buf.readUnsignedByte(); // version id
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15020);int sequenceNumber = buf.readUnsignedShort();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15021);int messageId = buf.readUnsignedShort();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15022);buf.readUnsignedShort(); // length
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15023);int flags = buf.readUnsignedShort();
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15024);buf.readUnsignedShort(); // checksum

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15025);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(buf.readUnsignedInt()));
        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15026);if ((((deviceSession == null)&&(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(15027)!=0|true))||(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(15028)==0&false))) {{
            __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15029);return null;
        }

        }__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15030);long timestamp = buf.readUnsignedInt();

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15031);if (((((flags & 0x1) == 0x0)&&(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(15032)!=0|true))||(__CLR4_5_2bh6bh6lx1dxp9w.R.iget(15033)==0&false))) {{
            __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15034);sendAcknowledgment(channel, sequenceNumber);
        }

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15035);switch (messageId) {
            case MSG_UNIT_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15036);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15037);return parseUnitReport(deviceSession, buf, sequenceNumber);
            case MSG_TG2_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15038);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15039);return parseTg2Report(deviceSession, buf, sequenceNumber);
            case MSG_POSITION_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15040);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15041);return parsePositionReport(deviceSession, buf, sequenceNumber, timestamp);
            case MSG_POSITION_REPORT_2:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15042);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15043);return parsePositionReport2(deviceSession, buf, sequenceNumber, timestamp);
            case MSG_SNAPSHOT4:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15044);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15045);return parseSnapshot4(deviceSession, buf, sequenceNumber);
            case MSG_TRACKING_DATA:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15046);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15047);return parseTrackingData(deviceSession, buf, sequenceNumber, timestamp);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bh6bh6lx1dxp9w.R.inc(15048);__CLB4_5_2_bool0=true;}
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15049);Log.warning(new UnsupportedOperationException(String.valueOf(messageId)));
                __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15050);break;
        }

        __CLR4_5_2bh6bh6lx1dxp9w.R.inc(15051);return null;
    }finally{__CLR4_5_2bh6bh6lx1dxp9w.R.flushNeeded();}}

}
