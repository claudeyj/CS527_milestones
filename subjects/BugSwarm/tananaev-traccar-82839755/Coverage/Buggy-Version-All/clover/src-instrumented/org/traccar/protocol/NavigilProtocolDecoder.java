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

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.util.Date;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class NavigilProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_260h60hlx1e502n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,7967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NavigilProtocolDecoder(NavigilProtocol protocol) {
        super(protocol);__CLR4_5_260h60hlx1e502n.R.inc(7794);try{__CLR4_5_260h60hlx1e502n.R.inc(7793);
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
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
    
    private static Date convertTimestamp(long timestamp) {try{__CLR4_5_260h60hlx1e502n.R.inc(7795);
        __CLR4_5_260h60hlx1e502n.R.inc(7796);return new Date((timestamp - LEAP_SECONDS_DELTA) * 1000l);
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private int senderSequenceNumber = 1;
    
    private void sendAcknowledgment(Channel channel, int sequenceNumber) {try{__CLR4_5_260h60hlx1e502n.R.inc(7797);
        __CLR4_5_260h60hlx1e502n.R.inc(7798);ChannelBuffer data = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 4);
        __CLR4_5_260h60hlx1e502n.R.inc(7799);data.writeShort(sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7800);data.writeShort(0); // OK
        
        __CLR4_5_260h60hlx1e502n.R.inc(7801);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 20);
        __CLR4_5_260h60hlx1e502n.R.inc(7802);header.writeByte(1); __CLR4_5_260h60hlx1e502n.R.inc(7803);header.writeByte(0);
        __CLR4_5_260h60hlx1e502n.R.inc(7804);header.writeShort(senderSequenceNumber++);
        __CLR4_5_260h60hlx1e502n.R.inc(7805);header.writeShort(MESSAGE_ACKNOWLEDGEMENT);
        __CLR4_5_260h60hlx1e502n.R.inc(7806);header.writeShort(header.capacity() + data.capacity());
        __CLR4_5_260h60hlx1e502n.R.inc(7807);header.writeShort(0);
        __CLR4_5_260h60hlx1e502n.R.inc(7808);header.writeShort(Crc.crc16X25Ccitt(data.toByteBuffer()));
        __CLR4_5_260h60hlx1e502n.R.inc(7809);header.writeInt(0);
        __CLR4_5_260h60hlx1e502n.R.inc(7810);header.writeInt((int) (new Date().getTime() / 1000) + LEAP_SECONDS_DELTA);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7811);if ((((channel != null)&&(__CLR4_5_260h60hlx1e502n.R.iget(7812)!=0|true))||(__CLR4_5_260h60hlx1e502n.R.iget(7813)==0&false))) {{
            __CLR4_5_260h60hlx1e502n.R.inc(7814);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parseUnitReport(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_260h60hlx1e502n.R.inc(7815);
        __CLR4_5_260h60hlx1e502n.R.inc(7816);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7817);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7818);position.setValid(true);
        __CLR4_5_260h60hlx1e502n.R.inc(7819);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7820);position.setDeviceId(getDeviceId());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7821);buf.readUnsignedShort(); // report trigger
        __CLR4_5_260h60hlx1e502n.R.inc(7822);buf.readUnsignedShort(); // flags
        
        __CLR4_5_260h60hlx1e502n.R.inc(7823);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7824);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7825);position.setAltitude( buf.readUnsignedShort());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7826);buf.readUnsignedShort(); // satellites in fix
        __CLR4_5_260h60hlx1e502n.R.inc(7827);buf.readUnsignedShort(); // satellites in track
        __CLR4_5_260h60hlx1e502n.R.inc(7828);buf.readUnsignedShort(); // GPS antenna state
        
        __CLR4_5_260h60hlx1e502n.R.inc(7829);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_260h60hlx1e502n.R.inc(7830);position.setCourse(buf.readUnsignedShort());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7831);buf.readUnsignedInt(); // distance
        __CLR4_5_260h60hlx1e502n.R.inc(7832);buf.readUnsignedInt(); // delta distance

        __CLR4_5_260h60hlx1e502n.R.inc(7833);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7834);buf.readUnsignedShort(); // battery charger status
        
        __CLR4_5_260h60hlx1e502n.R.inc(7835);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        // TODO: a lot of other stuff
        __CLR4_5_260h60hlx1e502n.R.inc(7836);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parseTg2Report(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_260h60hlx1e502n.R.inc(7837);
        __CLR4_5_260h60hlx1e502n.R.inc(7838);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7839);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7840);position.setValid(true);
        __CLR4_5_260h60hlx1e502n.R.inc(7841);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7842);position.setDeviceId(getDeviceId());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7843);buf.readUnsignedShort(); // report trigger
        __CLR4_5_260h60hlx1e502n.R.inc(7844);buf.readUnsignedByte(); // reserved
        __CLR4_5_260h60hlx1e502n.R.inc(7845);buf.readUnsignedByte(); // assisted GPS age
        
        __CLR4_5_260h60hlx1e502n.R.inc(7846);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        __CLR4_5_260h60hlx1e502n.R.inc(7847);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7848);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7849);position.setAltitude(buf.readUnsignedShort());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7850);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_260h60hlx1e502n.R.inc(7851);buf.readUnsignedByte(); // satellites in track
        
        __CLR4_5_260h60hlx1e502n.R.inc(7852);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_260h60hlx1e502n.R.inc(7853);position.setCourse(buf.readUnsignedShort());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7854);buf.readUnsignedInt(); // distance
        __CLR4_5_260h60hlx1e502n.R.inc(7855);buf.readUnsignedShort(); // maximum speed
        __CLR4_5_260h60hlx1e502n.R.inc(7856);buf.readUnsignedShort(); // minimum speed

        __CLR4_5_260h60hlx1e502n.R.inc(7857);buf.readUnsignedShort(); // VSAUT1 voltage
        __CLR4_5_260h60hlx1e502n.R.inc(7858);buf.readUnsignedShort(); // VSAUT2 voltage
        __CLR4_5_260h60hlx1e502n.R.inc(7859);buf.readUnsignedShort(); // solar voltage
        __CLR4_5_260h60hlx1e502n.R.inc(7860);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        // TODO: a lot of other stuff
        __CLR4_5_260h60hlx1e502n.R.inc(7861);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parsePositionReport(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_260h60hlx1e502n.R.inc(7862);
        __CLR4_5_260h60hlx1e502n.R.inc(7863);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7864);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7865);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7866);position.setDeviceId(getDeviceId());
        __CLR4_5_260h60hlx1e502n.R.inc(7867);position.setTime(convertTimestamp(timestamp));
        
        __CLR4_5_260h60hlx1e502n.R.inc(7868);position.setLatitude(buf.readMedium() * 0.00002);
        __CLR4_5_260h60hlx1e502n.R.inc(7869);position.setLongitude(buf.readMedium() * 0.00002);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7870);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_260h60hlx1e502n.R.inc(7871);position.setCourse(buf.readUnsignedByte() * 2);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7872);short flags = buf.readUnsignedByte();
        __CLR4_5_260h60hlx1e502n.R.inc(7873);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7874);buf.readUnsignedByte(); // reserved
        __CLR4_5_260h60hlx1e502n.R.inc(7875);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parsePositionReport2(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_260h60hlx1e502n.R.inc(7876);
        __CLR4_5_260h60hlx1e502n.R.inc(7877);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7878);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7879);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7880);position.setDeviceId(getDeviceId());
        __CLR4_5_260h60hlx1e502n.R.inc(7881);position.setTime(convertTimestamp(timestamp));
        
        __CLR4_5_260h60hlx1e502n.R.inc(7882);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7883);position.setLongitude(buf.readInt() * 0.0000001);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7884);buf.readUnsignedByte(); // report trigger

        __CLR4_5_260h60hlx1e502n.R.inc(7885);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        
        __CLR4_5_260h60hlx1e502n.R.inc(7886);short flags = buf.readUnsignedByte();
        __CLR4_5_260h60hlx1e502n.R.inc(7887);position.setValid((flags & 0x80) == 0x80 && (flags & 0x40) == 0x40);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7888);int x = buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_260h60hlx1e502n.R.inc(7889);buf.readUnsignedInt(); // distance
        __CLR4_5_260h60hlx1e502n.R.inc(7890);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parseSnapshot4(ChannelBuffer buf, int sequenceNumber) {try{__CLR4_5_260h60hlx1e502n.R.inc(7891);
        __CLR4_5_260h60hlx1e502n.R.inc(7892);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7893);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7894);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7895);position.setDeviceId(getDeviceId());

        __CLR4_5_260h60hlx1e502n.R.inc(7896);buf.readUnsignedByte(); // report trigger
        __CLR4_5_260h60hlx1e502n.R.inc(7897);buf.readUnsignedByte(); // position fix source
        __CLR4_5_260h60hlx1e502n.R.inc(7898);buf.readUnsignedByte(); // GNSS fix quality
        __CLR4_5_260h60hlx1e502n.R.inc(7899);buf.readUnsignedByte(); // GNSS assistance age
        
        __CLR4_5_260h60hlx1e502n.R.inc(7900);long flags = buf.readUnsignedInt();
        __CLR4_5_260h60hlx1e502n.R.inc(7901);position.setValid((flags & 0x0400) == 0x0400);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7902);position.setTime(convertTimestamp(buf.readUnsignedInt()));
        
        __CLR4_5_260h60hlx1e502n.R.inc(7903);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7904);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7905);position.setAltitude(buf.readUnsignedShort());
        
        __CLR4_5_260h60hlx1e502n.R.inc(7906);buf.readUnsignedByte(); // satellites in fix
        __CLR4_5_260h60hlx1e502n.R.inc(7907);buf.readUnsignedByte(); // satellites in track
        
        __CLR4_5_260h60hlx1e502n.R.inc(7908);position.setSpeed(buf.readUnsignedShort() * 0.194384);
        __CLR4_5_260h60hlx1e502n.R.inc(7909);position.setCourse(buf.readUnsignedShort() * 0.1);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7910);buf.readUnsignedByte(); // maximum speed
        __CLR4_5_260h60hlx1e502n.R.inc(7911);buf.readUnsignedByte(); // minimum speed
        __CLR4_5_260h60hlx1e502n.R.inc(7912);buf.readUnsignedInt(); // distance

        __CLR4_5_260h60hlx1e502n.R.inc(7913);buf.readUnsignedByte(); // supply voltage 1
        __CLR4_5_260h60hlx1e502n.R.inc(7914);buf.readUnsignedByte(); // supply voltage 2
        __CLR4_5_260h60hlx1e502n.R.inc(7915);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

        // TODO: a lot of other stuff
        __CLR4_5_260h60hlx1e502n.R.inc(7916);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    private Position parseTrackingData(ChannelBuffer buf, int sequenceNumber, long timestamp) {try{__CLR4_5_260h60hlx1e502n.R.inc(7917);
        __CLR4_5_260h60hlx1e502n.R.inc(7918);Position position = new Position();
        __CLR4_5_260h60hlx1e502n.R.inc(7919);position.setProtocol(getProtocolName());

        __CLR4_5_260h60hlx1e502n.R.inc(7920);position.set(Event.KEY_INDEX, sequenceNumber);
        __CLR4_5_260h60hlx1e502n.R.inc(7921);position.setDeviceId(getDeviceId());
        __CLR4_5_260h60hlx1e502n.R.inc(7922);position.setTime(convertTimestamp(timestamp));

        __CLR4_5_260h60hlx1e502n.R.inc(7923);buf.readUnsignedByte(); // tracking mode
        
        __CLR4_5_260h60hlx1e502n.R.inc(7924);short flags = buf.readUnsignedByte();
        __CLR4_5_260h60hlx1e502n.R.inc(7925);position.setValid((flags & 0x01) == 0x01);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7926);buf.readUnsignedShort(); // duration

        __CLR4_5_260h60hlx1e502n.R.inc(7927);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_260h60hlx1e502n.R.inc(7928);position.setLongitude(buf.readInt() * 0.0000001);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7929);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_260h60hlx1e502n.R.inc(7930);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_260h60hlx1e502n.R.inc(7931);buf.readUnsignedByte(); // satellites in fix
        
        __CLR4_5_260h60hlx1e502n.R.inc(7932);position.set(Event.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7933);buf.readUnsignedInt(); // distance
        __CLR4_5_260h60hlx1e502n.R.inc(7934);return position;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_260h60hlx1e502n.R.inc(7935);
        
        __CLR4_5_260h60hlx1e502n.R.inc(7936);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_260h60hlx1e502n.R.inc(7937);buf.readUnsignedByte(); // protocol version
        __CLR4_5_260h60hlx1e502n.R.inc(7938);buf.readUnsignedByte(); // version id
        __CLR4_5_260h60hlx1e502n.R.inc(7939);int sequenceNumber = buf.readUnsignedShort();
        __CLR4_5_260h60hlx1e502n.R.inc(7940);int messageId = buf.readUnsignedShort();
        __CLR4_5_260h60hlx1e502n.R.inc(7941);buf.readUnsignedShort(); // length
        __CLR4_5_260h60hlx1e502n.R.inc(7942);int flags = buf.readUnsignedShort();
        __CLR4_5_260h60hlx1e502n.R.inc(7943);buf.readUnsignedShort(); // checksum
        
        // Get device identifier
        __CLR4_5_260h60hlx1e502n.R.inc(7944);if ((((!identify(String.valueOf(buf.readUnsignedInt()), channel))&&(__CLR4_5_260h60hlx1e502n.R.iget(7945)!=0|true))||(__CLR4_5_260h60hlx1e502n.R.iget(7946)==0&false))) {{
            __CLR4_5_260h60hlx1e502n.R.inc(7947);return null;
        }

        }__CLR4_5_260h60hlx1e502n.R.inc(7948);long timestamp = buf.readUnsignedInt(); // message timestamp

        // Acknowledgment
        __CLR4_5_260h60hlx1e502n.R.inc(7949);if (((((flags & 0x1) == 0x0)&&(__CLR4_5_260h60hlx1e502n.R.iget(7950)!=0|true))||(__CLR4_5_260h60hlx1e502n.R.iget(7951)==0&false))) {{
            __CLR4_5_260h60hlx1e502n.R.inc(7952);sendAcknowledgment(channel, sequenceNumber);
        }
        
        // Parse messages
        }boolean __CLB4_5_2_bool0=false;__CLR4_5_260h60hlx1e502n.R.inc(7953);switch (messageId) {
            case MESSAGE_UNIT_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7954);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7955);return parseUnitReport(buf, sequenceNumber);
            case MESSAGE_TG2_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7956);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7957);return parseTg2Report(buf, sequenceNumber);
            case MESSAGE_POSITION_REPORT:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7958);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7959);return parsePositionReport(buf, sequenceNumber, timestamp);
            case MESSAGE_POSITION_REPORT_2:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7960);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7961);return parsePositionReport2(buf, sequenceNumber, timestamp);
            case MESSAGE_SNAPSHOT4:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7962);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7963);return parseSnapshot4(buf, sequenceNumber);
            case MESSAGE_TRACKING_DATA:if (!__CLB4_5_2_bool0) {__CLR4_5_260h60hlx1e502n.R.inc(7964);__CLB4_5_2_bool0=true;}
                __CLR4_5_260h60hlx1e502n.R.inc(7965);return parseTrackingData(buf, sequenceNumber, timestamp);
        }
        
        __CLR4_5_260h60hlx1e502n.R.inc(7966);return null;
    }finally{__CLR4_5_260h60hlx1e502n.R.flushNeeded();}}

}
