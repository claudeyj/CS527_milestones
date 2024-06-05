/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.nio.ByteOrder;
import java.util.Date;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class NavigilProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25jw5jwlx1dp8av{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,7370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NavigilProtocolDecoder(NavigilProtocol protocol) {
        super(protocol);__CLR4_5_25jw5jwlx1dp8av.R.inc(7197);try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7196);
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private static final int LEAP_SECONDS_DELTA = 25;

    private static final int MESSAGE_ERROR = 2;
    private static final int MESSAGE_INDICATION = 4;
    private static final int MESSAGE_CONN_OPEN = 5;
    private static final int MESSAGE_CONN_CLOSE = 6;
    private static final int MESSAGE_SYSTEM_REPORT = 7;
    private static final int MESSAGE_UNIT_REPORT = 8;
    private static final int MESSAGE_GEOFENCE_ALARM = 10;
    private static final int MESSAGE_INPUT_ALARM = 11;
    private static final int MESSAGE_TG2_REPORT = 12;
    private static final int MESSAGE_POSITION_REPORT = 13;
    private static final int MESSAGE_POSITION_REPORT_2 = 15;
    private static final int MESSAGE_SNAPSHOT4 = 17;
    private static final int MESSAGE_TRACKING_DATA = 18;
    private static final int MESSAGE_MOTION_ALARM = 19;
    private static final int MESSAGE_ACKNOWLEDGEMENT = 255;
    
    private static Date convertTimestamp(long timestamp) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7198);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7199);return new Date((timestamp - LEAP_SECONDS_DELTA) * 1000l);
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private int senderSequenceNumber = 1;
    
    private void sendAcknowledgment(Channel channel, int sequenceNumber) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7200);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7201);ChannelBuffer data = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 4);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7202);data.writeShort(sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7203);data.writeShort(0); // OK
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7204);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 20);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7205);header.writeByte(1); __CLR4_5_25jw5jwlx1dp8av.R.inc(7206);header.writeByte(0);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7207);header.writeShort(senderSequenceNumber++);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7208);header.writeShort(MESSAGE_ACKNOWLEDGEMENT);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7209);header.writeShort(header.capacity() + data.capacity());
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7210);header.writeShort(0);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7211);header.writeShort(Crc.crc16X25Ccitt(data.toByteBuffer()));
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7212);header.writeInt(0);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7213);header.writeInt((int) (new Date().getTime() / 1000) + LEAP_SECONDS_DELTA);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7214);if ((((channel != null)&&(__CLR4_5_25jw5jwlx1dp8av.R.iget(7215)!=0|true))||(__CLR4_5_25jw5jwlx1dp8av.R.iget(7216)==0&false))) {{
            __CLR4_5_25jw5jwlx1dp8av.R.inc(7217);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parseUnitReport(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7218);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7219);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7220);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7221);position.setValid(true);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7222);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7223);position.setDeviceId(getDeviceId());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7224);buf.readUnsignedShort(); // report trigger
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7225);buf.readUnsignedShort(); // flags
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7226);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7227);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7228);position.setAltitude( buf.readUnsignedShort());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7229);buf.readUnsignedShort(); // satellites in fix
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7230);buf.readUnsignedShort(); // satellites in track
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7231);buf.readUnsignedShort(); // GPS antenna state
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7232);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7233);position.setCourse(buf.readUnsignedShort());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7234);buf.readUnsignedInt(); // distance
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7235);buf.readUnsignedInt(); // delta distance

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7236);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7237);buf.readUnsignedShort(); // battery charger status
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7238);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        // TODO: a lot of other stuff
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7239);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parseTg2Report(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7240);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7241);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7242);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7243);position.setValid(true);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7244);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7245);position.setDeviceId(getDeviceId());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7246);buf.readUnsignedShort(); // report trigger
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7247);buf.readUnsignedByte(); // reserved
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7248);buf.readUnsignedByte(); // assisted GPS age
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7249);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7250);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7251);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7252);position.setAltitude(buf.readUnsignedShort());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7253);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7254);buf.readUnsignedByte(); // satellites in track
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7255);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7256);position.setCourse(buf.readUnsignedShort());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7257);buf.readUnsignedInt(); // distance
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7258);buf.readUnsignedShort(); // maximum speed
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7259);buf.readUnsignedShort(); // minimum speed

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7260);buf.readUnsignedShort(); // VSAUT1 voltage
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7261);buf.readUnsignedShort(); // VSAUT2 voltage
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7262);buf.readUnsignedShort(); // solar voltage
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7263);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        // TODO: a lot of other stuff
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7264);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parsePositionReport(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7265);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7266);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7267);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7268);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7269);position.setDeviceId(getDeviceId());
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7270);position.setTime(convertTimestamp(timestamp));
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7271);position.setLatitude(buf.readMedium() * 0.00002);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7272);position.setLongitude(buf.readMedium() * 0.00002);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7273);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7274);position.setCourse(buf.readUnsignedByte() * 2);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7275);short flags = buf.readUnsignedByte();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7276);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7277);buf.readUnsignedByte(); // reserved
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7278);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parsePositionReport2(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7279);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7280);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7281);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7282);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7283);position.setDeviceId(getDeviceId());
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7284);position.setTime(convertTimestamp(timestamp));
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7285);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7286);position.setLongitude(buf.readInt() * 0.0000001);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7287);buf.readUnsignedByte(); // report trigger

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7288);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7289);short flags = buf.readUnsignedByte();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7290);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7291);int x = buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7292);buf.readUnsignedInt(); // distance
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7293);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parseSnapshot4(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7294);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7295);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7296);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7297);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7298);position.setDeviceId(getDeviceId());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7299);buf.readUnsignedByte(); // report trigger
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7300);buf.readUnsignedByte(); // position fix source
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7301);buf.readUnsignedByte(); // GNSS fix quality
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7302);buf.readUnsignedByte(); // GNSS assistance age
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7303);long flags = buf.readUnsignedInt();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7304);position.setValid((flags & 0x0400) == 0x0400);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7305);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7306);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7307);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7308);position.setAltitude(buf.readUnsignedShort());
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7309);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7310);buf.readUnsignedByte(); // satellites in track
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7311);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7312);position.setCourse(buf.readUnsignedShort() * 0.1);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7313);buf.readUnsignedByte(); // maximum speed
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7314);buf.readUnsignedByte(); // minimum speed
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7315);buf.readUnsignedInt(); // distance

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7316);buf.readUnsignedByte(); // supply voltage 1
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7317);buf.readUnsignedByte(); // supply voltage 2
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7318);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        // TODO: a lot of other stuff
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7319);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    private Position parseTrackingData(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7320);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7321);Position position = new Position();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7322);position.setProtocol(getProtocolName());

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7323);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7324);position.setDeviceId(getDeviceId());
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7325);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7326);buf.readUnsignedByte(); // tracking mode
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7327);short flags = buf.readUnsignedByte();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7328);position.setValid((flags & 0x01) == 0x01);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7329);buf.readUnsignedShort(); // duration

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7330);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7331);position.setLongitude(buf.readInt() * 0.0000001);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7332);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7333);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_25jw5jwlx1dp8av.R.inc(7334);buf.readUnsignedByte(); // satellites in fix
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7335);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7336);buf.readUnsignedInt(); // distance
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7337);return position;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}
    
    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_25jw5jwlx1dp8av.R.inc(7338);
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7339);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7340);buf.readUnsignedByte(); // protocol version
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7341);buf.readUnsignedByte(); // version id
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7342);int sequenceNumber = buf.readUnsignedShort();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7343);int messageId = buf.readUnsignedShort();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7344);buf.readUnsignedShort(); // length
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7345);int flags = buf.readUnsignedShort();
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7346);buf.readUnsignedShort(); // checksum
        
        // Get device identifier
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7347);if ((((!identify(String.valueOf(buf.readUnsignedInt()), channel))&&(__CLR4_5_25jw5jwlx1dp8av.R.iget(7348)!=0|true))||(__CLR4_5_25jw5jwlx1dp8av.R.iget(7349)==0&false))) {{
            __CLR4_5_25jw5jwlx1dp8av.R.inc(7350);return null;
        }

        }__CLR4_5_25jw5jwlx1dp8av.R.inc(7351);long timestamp = buf.readUnsignedInt(); // message timestamp

        // Acknowledgment
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7352);if (((((flags & 0x1) == 0x0)&&(__CLR4_5_25jw5jwlx1dp8av.R.iget(7353)!=0|true))||(__CLR4_5_25jw5jwlx1dp8av.R.iget(7354)==0&false))) {{
            __CLR4_5_25jw5jwlx1dp8av.R.inc(7355);sendAcknowledgment(channel, sequenceNumber);
        }
        
        // Parse messages
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_25jw5jwlx1dp8av.R.inc(7356);switch (messageId) {
            case MESSAGE_UNIT_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7357);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7358);return parseUnitReport(buf, sequenceNumber);
            case MESSAGE_TG2_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7359);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7360);return parseTg2Report(buf, sequenceNumber);
            case MESSAGE_POSITION_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7361);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7362);return parsePositionReport(buf, sequenceNumber, timestamp);
            case MESSAGE_POSITION_REPORT_2:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7363);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7364);return parsePositionReport2(buf, sequenceNumber, timestamp);
            case MESSAGE_SNAPSHOT4:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7365);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7366);return parseSnapshot4(buf, sequenceNumber);
            case MESSAGE_TRACKING_DATA:if (!__CLB4_5_2_bool0) {__CLR4_5_25jw5jwlx1dp8av.R.inc(7367);__CLB4_5_2_bool0=true;}
                __CLR4_5_25jw5jwlx1dp8av.R.inc(7368);return parseTrackingData(buf, sequenceNumber, timestamp);
        }
        
        __CLR4_5_25jw5jwlx1dp8av.R.inc(7369);return null;
    }finally{__CLR4_5_25jw5jwlx1dp8av.R.flushNeeded();}}

}
