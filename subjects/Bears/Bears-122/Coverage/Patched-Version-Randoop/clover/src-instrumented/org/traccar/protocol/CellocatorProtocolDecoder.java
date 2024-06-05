/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;

@java.lang.SuppressWarnings({"fallthrough"}) public class CellocatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27tl7tllwye63yz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,10225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CellocatorProtocolDecoder(CellocatorProtocol protocol) {
        super(protocol);__CLR4_5_27tl7tllwye63yz.R.inc(10138);try{__CLR4_5_27tl7tllwye63yz.R.inc(10137);
    }finally{__CLR4_5_27tl7tllwye63yz.R.flushNeeded();}}

    static final int MSG_CLIENT_STATUS = 0;
    static final int MSG_CLIENT_PROGRAMMING = 3;
    static final int MSG_CLIENT_SERIAL_LOG = 7;
    static final int MSG_CLIENT_SERIAL = 8;
    static final int MSG_CLIENT_MODULAR = 9;

    public static final int MSG_SERVER_ACKNOWLEDGE = 4;

    private byte commandCount;

    private void sendReply(Channel channel, SocketAddress remoteAddress, long deviceId, byte packetNumber) {try{__CLR4_5_27tl7tllwye63yz.R.inc(10139);
        __CLR4_5_27tl7tllwye63yz.R.inc(10140);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
        __CLR4_5_27tl7tllwye63yz.R.inc(10141);reply.writeByte('M');
        __CLR4_5_27tl7tllwye63yz.R.inc(10142);reply.writeByte('C');
        __CLR4_5_27tl7tllwye63yz.R.inc(10143);reply.writeByte('G');
        __CLR4_5_27tl7tllwye63yz.R.inc(10144);reply.writeByte('P');
        __CLR4_5_27tl7tllwye63yz.R.inc(10145);reply.writeByte(MSG_SERVER_ACKNOWLEDGE);
        __CLR4_5_27tl7tllwye63yz.R.inc(10146);reply.writeInt((int) deviceId);
        __CLR4_5_27tl7tllwye63yz.R.inc(10147);reply.writeByte(commandCount++);
        __CLR4_5_27tl7tllwye63yz.R.inc(10148);reply.writeInt(0); // authentication code
        __CLR4_5_27tl7tllwye63yz.R.inc(10149);reply.writeByte(0);
        __CLR4_5_27tl7tllwye63yz.R.inc(10150);reply.writeByte(packetNumber);
        __CLR4_5_27tl7tllwye63yz.R.inc(10151);reply.writeZero(11);

        __CLR4_5_27tl7tllwye63yz.R.inc(10152);byte checksum = 0;
        __CLR4_5_27tl7tllwye63yz.R.inc(10153);for (int i = 4; (((i < 27)&&(__CLR4_5_27tl7tllwye63yz.R.iget(10154)!=0|true))||(__CLR4_5_27tl7tllwye63yz.R.iget(10155)==0&false)); i++) {{
            __CLR4_5_27tl7tllwye63yz.R.inc(10156);checksum += reply.getByte(i);
        }
        }__CLR4_5_27tl7tllwye63yz.R.inc(10157);reply.writeByte(checksum);

        __CLR4_5_27tl7tllwye63yz.R.inc(10158);if ((((channel != null)&&(__CLR4_5_27tl7tllwye63yz.R.iget(10159)!=0|true))||(__CLR4_5_27tl7tllwye63yz.R.iget(10160)==0&false))) {{
            __CLR4_5_27tl7tllwye63yz.R.inc(10161);channel.write(reply, remoteAddress);
        }
    }}finally{__CLR4_5_27tl7tllwye63yz.R.flushNeeded();}}

    private String decodeAlarm(short reason) {try{__CLR4_5_27tl7tllwye63yz.R.inc(10162);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_27tl7tllwye63yz.R.inc(10163);switch (reason) {
            case 70:if (!__CLB4_5_2_bool0) {__CLR4_5_27tl7tllwye63yz.R.inc(10164);__CLB4_5_2_bool0=true;}
                __CLR4_5_27tl7tllwye63yz.R.inc(10165);return Position.ALARM_SOS;
            case 80:if (!__CLB4_5_2_bool0) {__CLR4_5_27tl7tllwye63yz.R.inc(10166);__CLB4_5_2_bool0=true;}
                __CLR4_5_27tl7tllwye63yz.R.inc(10167);return Position.ALARM_POWER_CUT;
            case 81:if (!__CLB4_5_2_bool0) {__CLR4_5_27tl7tllwye63yz.R.inc(10168);__CLB4_5_2_bool0=true;}
                __CLR4_5_27tl7tllwye63yz.R.inc(10169);return Position.ALARM_LOW_POWER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_27tl7tllwye63yz.R.inc(10170);__CLB4_5_2_bool0=true;}
                __CLR4_5_27tl7tllwye63yz.R.inc(10171);return null;
        }
    }finally{__CLR4_5_27tl7tllwye63yz.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27tl7tllwye63yz.R.inc(10172);

        __CLR4_5_27tl7tllwye63yz.R.inc(10173);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27tl7tllwye63yz.R.inc(10174);buf.skipBytes(4); // system code
        __CLR4_5_27tl7tllwye63yz.R.inc(10175);int type = buf.readUnsignedByte();
        __CLR4_5_27tl7tllwye63yz.R.inc(10176);long deviceUniqueId = buf.readUnsignedInt();

        __CLR4_5_27tl7tllwye63yz.R.inc(10177);if ((((type != MSG_CLIENT_SERIAL)&&(__CLR4_5_27tl7tllwye63yz.R.iget(10178)!=0|true))||(__CLR4_5_27tl7tllwye63yz.R.iget(10179)==0&false))) {{
            __CLR4_5_27tl7tllwye63yz.R.inc(10180);buf.readUnsignedShort(); // communication control
        }
        }__CLR4_5_27tl7tllwye63yz.R.inc(10181);byte packetNumber = buf.readByte();

        __CLR4_5_27tl7tllwye63yz.R.inc(10182);sendReply(channel, remoteAddress, deviceUniqueId, packetNumber);

        __CLR4_5_27tl7tllwye63yz.R.inc(10183);if ((((type == MSG_CLIENT_STATUS)&&(__CLR4_5_27tl7tllwye63yz.R.iget(10184)!=0|true))||(__CLR4_5_27tl7tllwye63yz.R.iget(10185)==0&false))) {{

            __CLR4_5_27tl7tllwye63yz.R.inc(10186);Position position = new Position();
            __CLR4_5_27tl7tllwye63yz.R.inc(10187);position.setProtocol(getProtocolName());

            __CLR4_5_27tl7tllwye63yz.R.inc(10188);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceUniqueId));
            __CLR4_5_27tl7tllwye63yz.R.inc(10189);if ((((deviceSession == null)&&(__CLR4_5_27tl7tllwye63yz.R.iget(10190)!=0|true))||(__CLR4_5_27tl7tllwye63yz.R.iget(10191)==0&false))) {{
                __CLR4_5_27tl7tllwye63yz.R.inc(10192);return null;
            }
            }__CLR4_5_27tl7tllwye63yz.R.inc(10193);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_27tl7tllwye63yz.R.inc(10194);position.set(Position.KEY_VERSION_HW, buf.readUnsignedByte());
            __CLR4_5_27tl7tllwye63yz.R.inc(10195);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
            __CLR4_5_27tl7tllwye63yz.R.inc(10196);position.set("protocolVersion", buf.readUnsignedByte());

            __CLR4_5_27tl7tllwye63yz.R.inc(10197);position.set(Position.KEY_STATUS, buf.getUnsignedByte(buf.readerIndex()) & 0x0f);

            __CLR4_5_27tl7tllwye63yz.R.inc(10198);int operator = (buf.readUnsignedByte() & 0xf0) << 4;
            __CLR4_5_27tl7tllwye63yz.R.inc(10199);operator += buf.readUnsignedByte();

            __CLR4_5_27tl7tllwye63yz.R.inc(10200);buf.readUnsignedByte(); // reason data
            __CLR4_5_27tl7tllwye63yz.R.inc(10201);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));

            __CLR4_5_27tl7tllwye63yz.R.inc(10202);position.set("mode", buf.readUnsignedByte());
            __CLR4_5_27tl7tllwye63yz.R.inc(10203);position.set(Position.PREFIX_IO + 1, buf.readUnsignedInt());

            __CLR4_5_27tl7tllwye63yz.R.inc(10204);operator <<= 8;
            __CLR4_5_27tl7tllwye63yz.R.inc(10205);operator += buf.readUnsignedByte();
            __CLR4_5_27tl7tllwye63yz.R.inc(10206);position.set(Position.KEY_OPERATOR, operator);

            __CLR4_5_27tl7tllwye63yz.R.inc(10207);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedInt());
            __CLR4_5_27tl7tllwye63yz.R.inc(10208);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());
            __CLR4_5_27tl7tllwye63yz.R.inc(10209);buf.skipBytes(6); // multi-purpose data

            __CLR4_5_27tl7tllwye63yz.R.inc(10210);position.set(Position.KEY_GPS, buf.readUnsignedShort());
            __CLR4_5_27tl7tllwye63yz.R.inc(10211);position.set("locationStatus", buf.readUnsignedByte());
            __CLR4_5_27tl7tllwye63yz.R.inc(10212);position.set("mode1", buf.readUnsignedByte());
            __CLR4_5_27tl7tllwye63yz.R.inc(10213);position.set("mode2", buf.readUnsignedByte());

            __CLR4_5_27tl7tllwye63yz.R.inc(10214);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

            __CLR4_5_27tl7tllwye63yz.R.inc(10215);position.setValid(true);
            __CLR4_5_27tl7tllwye63yz.R.inc(10216);position.setLongitude(buf.readInt() / Math.PI * 180 / 100000000);
            __CLR4_5_27tl7tllwye63yz.R.inc(10217);position.setLatitude(buf.readInt() / Math.PI * 180 / 100000000.0);
            __CLR4_5_27tl7tllwye63yz.R.inc(10218);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_27tl7tllwye63yz.R.inc(10219);position.setSpeed(UnitsConverter.knotsFromMps(buf.readInt() * 0.01));
            __CLR4_5_27tl7tllwye63yz.R.inc(10220);position.setCourse(buf.readUnsignedShort() / Math.PI * 180.0 / 1000.0);

            __CLR4_5_27tl7tllwye63yz.R.inc(10221);DateBuilder dateBuilder = new DateBuilder()
                    .setTimeReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedShort());
            __CLR4_5_27tl7tllwye63yz.R.inc(10222);position.setTime(dateBuilder.getDate());

            __CLR4_5_27tl7tllwye63yz.R.inc(10223);return position;
        }

        }__CLR4_5_27tl7tllwye63yz.R.inc(10224);return null;
    }finally{__CLR4_5_27tl7tllwye63yz.R.flushNeeded();}}

}
