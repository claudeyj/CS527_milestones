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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;

public class CellocatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2707707lx1e0gk1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,9156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CellocatorProtocolDecoder(CellocatorProtocol protocol) {
        super(protocol);__CLR4_5_2707707lx1e0gk1.R.inc(9080);try{__CLR4_5_2707707lx1e0gk1.R.inc(9079);
    }finally{__CLR4_5_2707707lx1e0gk1.R.flushNeeded();}}

    static final int MSG_CLIENT_STATUS = 0;
    static final int MSG_CLIENT_PROGRAMMING = 3;
    static final int MSG_CLIENT_SERIAL_LOG = 7;
    static final int MSG_CLIENT_SERIAL = 8;
    static final int MSG_CLIENT_MODULAR = 9;

    public static final int MSG_SERVER_ACKNOWLEDGE = 4;

    private byte commandCount;

    private void sendReply(Channel channel, long deviceId, byte packetNumber) {try{__CLR4_5_2707707lx1e0gk1.R.inc(9081);
        __CLR4_5_2707707lx1e0gk1.R.inc(9082);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
        __CLR4_5_2707707lx1e0gk1.R.inc(9083);reply.writeByte('M');
        __CLR4_5_2707707lx1e0gk1.R.inc(9084);reply.writeByte('C');
        __CLR4_5_2707707lx1e0gk1.R.inc(9085);reply.writeByte('G');
        __CLR4_5_2707707lx1e0gk1.R.inc(9086);reply.writeByte('P');
        __CLR4_5_2707707lx1e0gk1.R.inc(9087);reply.writeByte(MSG_SERVER_ACKNOWLEDGE);
        __CLR4_5_2707707lx1e0gk1.R.inc(9088);reply.writeInt((int) deviceId);
        __CLR4_5_2707707lx1e0gk1.R.inc(9089);reply.writeByte(commandCount++);
        __CLR4_5_2707707lx1e0gk1.R.inc(9090);reply.writeInt(0); // authentication code
        __CLR4_5_2707707lx1e0gk1.R.inc(9091);reply.writeByte(0);
        __CLR4_5_2707707lx1e0gk1.R.inc(9092);reply.writeByte(packetNumber);
        __CLR4_5_2707707lx1e0gk1.R.inc(9093);reply.writeZero(11);

        __CLR4_5_2707707lx1e0gk1.R.inc(9094);byte checksum = 0;
        __CLR4_5_2707707lx1e0gk1.R.inc(9095);for (int i = 4; (((i < 27)&&(__CLR4_5_2707707lx1e0gk1.R.iget(9096)!=0|true))||(__CLR4_5_2707707lx1e0gk1.R.iget(9097)==0&false)); i++) {{
            __CLR4_5_2707707lx1e0gk1.R.inc(9098);checksum += reply.getByte(i);
        }
        }__CLR4_5_2707707lx1e0gk1.R.inc(9099);reply.writeByte(checksum);

        __CLR4_5_2707707lx1e0gk1.R.inc(9100);if ((((channel != null)&&(__CLR4_5_2707707lx1e0gk1.R.iget(9101)!=0|true))||(__CLR4_5_2707707lx1e0gk1.R.iget(9102)==0&false))) {{
            __CLR4_5_2707707lx1e0gk1.R.inc(9103);channel.write(reply);
        }
    }}finally{__CLR4_5_2707707lx1e0gk1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2707707lx1e0gk1.R.inc(9104);

        __CLR4_5_2707707lx1e0gk1.R.inc(9105);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2707707lx1e0gk1.R.inc(9106);buf.skipBytes(4); // system code
        __CLR4_5_2707707lx1e0gk1.R.inc(9107);int type = buf.readUnsignedByte();
        __CLR4_5_2707707lx1e0gk1.R.inc(9108);long deviceUniqueId = buf.readUnsignedInt();

        __CLR4_5_2707707lx1e0gk1.R.inc(9109);if ((((type != MSG_CLIENT_SERIAL)&&(__CLR4_5_2707707lx1e0gk1.R.iget(9110)!=0|true))||(__CLR4_5_2707707lx1e0gk1.R.iget(9111)==0&false))) {{
            __CLR4_5_2707707lx1e0gk1.R.inc(9112);buf.readUnsignedShort(); // communication control
        }
        }__CLR4_5_2707707lx1e0gk1.R.inc(9113);byte packetNumber = buf.readByte();

        __CLR4_5_2707707lx1e0gk1.R.inc(9114);sendReply(channel, deviceUniqueId, packetNumber);

        __CLR4_5_2707707lx1e0gk1.R.inc(9115);if ((((type == MSG_CLIENT_STATUS)&&(__CLR4_5_2707707lx1e0gk1.R.iget(9116)!=0|true))||(__CLR4_5_2707707lx1e0gk1.R.iget(9117)==0&false))) {{

            __CLR4_5_2707707lx1e0gk1.R.inc(9118);Position position = new Position();
            __CLR4_5_2707707lx1e0gk1.R.inc(9119);position.setProtocol(getProtocolName());

            __CLR4_5_2707707lx1e0gk1.R.inc(9120);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, String.valueOf(deviceUniqueId));
            __CLR4_5_2707707lx1e0gk1.R.inc(9121);if ((((deviceSession == null)&&(__CLR4_5_2707707lx1e0gk1.R.iget(9122)!=0|true))||(__CLR4_5_2707707lx1e0gk1.R.iget(9123)==0&false))) {{
                __CLR4_5_2707707lx1e0gk1.R.inc(9124);return null;
            }
            }__CLR4_5_2707707lx1e0gk1.R.inc(9125);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2707707lx1e0gk1.R.inc(9126);buf.readUnsignedByte(); // hardware version
            __CLR4_5_2707707lx1e0gk1.R.inc(9127);buf.readUnsignedByte(); // software version
            __CLR4_5_2707707lx1e0gk1.R.inc(9128);buf.readUnsignedByte(); // protocol version

            __CLR4_5_2707707lx1e0gk1.R.inc(9129);position.set(Position.KEY_STATUS, buf.getUnsignedByte(buf.readerIndex()) & 0x0f);

            __CLR4_5_2707707lx1e0gk1.R.inc(9130);int operator = (buf.readUnsignedByte() & 0xf0) << 4;
            __CLR4_5_2707707lx1e0gk1.R.inc(9131);operator += buf.readUnsignedByte();

            __CLR4_5_2707707lx1e0gk1.R.inc(9132);buf.readUnsignedByte(); // reason data
            __CLR4_5_2707707lx1e0gk1.R.inc(9133);buf.readUnsignedByte(); // reason
            __CLR4_5_2707707lx1e0gk1.R.inc(9134);buf.readUnsignedByte(); // mode
            __CLR4_5_2707707lx1e0gk1.R.inc(9135);buf.readUnsignedInt(); // IO

            __CLR4_5_2707707lx1e0gk1.R.inc(9136);operator <<= 8;
            __CLR4_5_2707707lx1e0gk1.R.inc(9137);operator += buf.readUnsignedByte();
            __CLR4_5_2707707lx1e0gk1.R.inc(9138);position.set("operator", operator);

            __CLR4_5_2707707lx1e0gk1.R.inc(9139);buf.readUnsignedInt(); // ADC
            __CLR4_5_2707707lx1e0gk1.R.inc(9140);buf.readUnsignedMedium(); // Odometer
            __CLR4_5_2707707lx1e0gk1.R.inc(9141);buf.skipBytes(6); // multi-purpose data

            __CLR4_5_2707707lx1e0gk1.R.inc(9142);buf.readUnsignedShort(); // gps fix
            __CLR4_5_2707707lx1e0gk1.R.inc(9143);buf.readUnsignedByte(); // location status
            __CLR4_5_2707707lx1e0gk1.R.inc(9144);buf.readUnsignedByte(); // mode 1
            __CLR4_5_2707707lx1e0gk1.R.inc(9145);buf.readUnsignedByte(); // mode 2

            __CLR4_5_2707707lx1e0gk1.R.inc(9146);position.setValid(buf.readUnsignedByte() >= 3); // satellites

            __CLR4_5_2707707lx1e0gk1.R.inc(9147);position.setLongitude(buf.readInt() / Math.PI * 180 / 100000000);
            __CLR4_5_2707707lx1e0gk1.R.inc(9148);position.setLatitude(buf.readInt() / Math.PI * 180 / 100000000.0);
            __CLR4_5_2707707lx1e0gk1.R.inc(9149);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_2707707lx1e0gk1.R.inc(9150);position.setSpeed(UnitsConverter.knotsFromMps(buf.readInt() * 0.01));
            __CLR4_5_2707707lx1e0gk1.R.inc(9151);position.setCourse(buf.readUnsignedShort() / Math.PI * 180.0 / 1000.0);

            __CLR4_5_2707707lx1e0gk1.R.inc(9152);DateBuilder dateBuilder = new DateBuilder()
                    .setTimeReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedShort());
            __CLR4_5_2707707lx1e0gk1.R.inc(9153);position.setTime(dateBuilder.getDate());

            __CLR4_5_2707707lx1e0gk1.R.inc(9154);return position;
        }

        }__CLR4_5_2707707lx1e0gk1.R.inc(9155);return null;
    }finally{__CLR4_5_2707707lx1e0gk1.R.flushNeeded();}}

}
