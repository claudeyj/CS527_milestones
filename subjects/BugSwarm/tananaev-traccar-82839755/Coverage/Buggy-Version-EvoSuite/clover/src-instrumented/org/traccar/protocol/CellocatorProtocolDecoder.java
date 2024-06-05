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
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CellocatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2335335lx1e369d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,4095,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CellocatorProtocolDecoder(CellocatorProtocol protocol) {
        super(protocol);__CLR4_5_2335335lx1e369d.R.inc(4002);try{__CLR4_5_2335335lx1e369d.R.inc(4001);
    }finally{__CLR4_5_2335335lx1e369d.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_2335335lx1e369d.R.inc(4003);
        __CLR4_5_2335335lx1e369d.R.inc(4004);int b = buf.readUnsignedByte();
        __CLR4_5_2335335lx1e369d.R.inc(4005);StringBuilder imei = new StringBuilder();
        __CLR4_5_2335335lx1e369d.R.inc(4006);imei.append(b & 0x0F);
        __CLR4_5_2335335lx1e369d.R.inc(4007);for (int i = 0; (((i < 7)&&(__CLR4_5_2335335lx1e369d.R.iget(4008)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4009)==0&false)); i++) {{
            __CLR4_5_2335335lx1e369d.R.inc(4010);b = buf.readUnsignedByte();
            __CLR4_5_2335335lx1e369d.R.inc(4011);imei.append((b & 0xF0) >> 4);
            __CLR4_5_2335335lx1e369d.R.inc(4012);imei.append(b & 0x0F);
        }
        }__CLR4_5_2335335lx1e369d.R.inc(4013);return imei.toString();
    }finally{__CLR4_5_2335335lx1e369d.R.flushNeeded();}}
    
    static final int MSG_CLIENT_STATUS = 0;
    static final int MSG_CLIENT_PROGRAMMING = 3;
    static final int MSG_CLIENT_SERIAL_LOG = 7;
    static final int MSG_CLIENT_SERIAL = 8;
    static final int MSG_CLIENT_MODULAR = 9;

    private static final int MSG_SERVER_ACKNOWLEDGE = 4;
    
    private byte commandCount;
    
    private void sendReply(Channel channel, long deviceId, byte packetNumber) {try{__CLR4_5_2335335lx1e369d.R.inc(4014);
        __CLR4_5_2335335lx1e369d.R.inc(4015);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
        __CLR4_5_2335335lx1e369d.R.inc(4016);reply.writeByte('M');
        __CLR4_5_2335335lx1e369d.R.inc(4017);reply.writeByte('C');
        __CLR4_5_2335335lx1e369d.R.inc(4018);reply.writeByte('G');
        __CLR4_5_2335335lx1e369d.R.inc(4019);reply.writeByte('P');
        __CLR4_5_2335335lx1e369d.R.inc(4020);reply.writeByte(MSG_SERVER_ACKNOWLEDGE);
        __CLR4_5_2335335lx1e369d.R.inc(4021);reply.writeInt((int) deviceId);
        __CLR4_5_2335335lx1e369d.R.inc(4022);reply.writeByte(commandCount++);
        __CLR4_5_2335335lx1e369d.R.inc(4023);reply.writeInt(0); // authentication code
        __CLR4_5_2335335lx1e369d.R.inc(4024);reply.writeByte(0);
        __CLR4_5_2335335lx1e369d.R.inc(4025);reply.writeByte(packetNumber);
        __CLR4_5_2335335lx1e369d.R.inc(4026);reply.writeZero(11);

        __CLR4_5_2335335lx1e369d.R.inc(4027);byte checksum = 0;
        __CLR4_5_2335335lx1e369d.R.inc(4028);for (int i = 4; (((i < 27)&&(__CLR4_5_2335335lx1e369d.R.iget(4029)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4030)==0&false)); i++) {{
            __CLR4_5_2335335lx1e369d.R.inc(4031);checksum += reply.getByte(i);
        }
        }__CLR4_5_2335335lx1e369d.R.inc(4032);reply.writeByte(checksum);

        __CLR4_5_2335335lx1e369d.R.inc(4033);if ((((channel != null)&&(__CLR4_5_2335335lx1e369d.R.iget(4034)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4035)==0&false))) {{
            __CLR4_5_2335335lx1e369d.R.inc(4036);channel.write(reply);
        }
    }}finally{__CLR4_5_2335335lx1e369d.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_2335335lx1e369d.R.inc(4037);

        __CLR4_5_2335335lx1e369d.R.inc(4038);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2335335lx1e369d.R.inc(4039);buf.skipBytes(4); // system code
        __CLR4_5_2335335lx1e369d.R.inc(4040);int type = buf.readUnsignedByte();
        __CLR4_5_2335335lx1e369d.R.inc(4041);long deviceUniqueId = buf.readUnsignedInt();
        
        __CLR4_5_2335335lx1e369d.R.inc(4042);if ((((type != MSG_CLIENT_SERIAL)&&(__CLR4_5_2335335lx1e369d.R.iget(4043)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4044)==0&false))) {{
            __CLR4_5_2335335lx1e369d.R.inc(4045);buf.readUnsignedShort(); // communication control
        }
        }__CLR4_5_2335335lx1e369d.R.inc(4046);byte packetNumber = buf.readByte();

        // Send reply
        __CLR4_5_2335335lx1e369d.R.inc(4047);sendReply(channel, deviceUniqueId, packetNumber);

        // Parse location
        __CLR4_5_2335335lx1e369d.R.inc(4048);if ((((type == MSG_CLIENT_STATUS)&&(__CLR4_5_2335335lx1e369d.R.iget(4049)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4050)==0&false))) {{
            __CLR4_5_2335335lx1e369d.R.inc(4051);Position position = new Position();
            __CLR4_5_2335335lx1e369d.R.inc(4052);position.setProtocol(getProtocolName());
            
            // Device identifier
            __CLR4_5_2335335lx1e369d.R.inc(4053);if ((((!identify(String.valueOf(deviceUniqueId), channel))&&(__CLR4_5_2335335lx1e369d.R.iget(4054)!=0|true))||(__CLR4_5_2335335lx1e369d.R.iget(4055)==0&false))) {{
                __CLR4_5_2335335lx1e369d.R.inc(4056);return null;
            }
            }__CLR4_5_2335335lx1e369d.R.inc(4057);position.setDeviceId(getDeviceId());

            __CLR4_5_2335335lx1e369d.R.inc(4058);buf.readUnsignedByte(); // hardware version
            __CLR4_5_2335335lx1e369d.R.inc(4059);buf.readUnsignedByte(); // software version
            __CLR4_5_2335335lx1e369d.R.inc(4060);buf.readUnsignedByte(); // protocol version

            // Status
            __CLR4_5_2335335lx1e369d.R.inc(4061);position.set(Event.KEY_STATUS, buf.getUnsignedByte(buf.readerIndex()) & 0x0f);
            
            __CLR4_5_2335335lx1e369d.R.inc(4062);int operator = (buf.readUnsignedByte() & 0xf0) << 4;
            __CLR4_5_2335335lx1e369d.R.inc(4063);operator += buf.readUnsignedByte();
            
            __CLR4_5_2335335lx1e369d.R.inc(4064);buf.readUnsignedByte(); // reason data
            __CLR4_5_2335335lx1e369d.R.inc(4065);buf.readUnsignedByte(); // reason
            __CLR4_5_2335335lx1e369d.R.inc(4066);buf.readUnsignedByte(); // mode
            __CLR4_5_2335335lx1e369d.R.inc(4067);buf.readUnsignedInt(); // IO
            
            __CLR4_5_2335335lx1e369d.R.inc(4068);operator <<= 8;
            __CLR4_5_2335335lx1e369d.R.inc(4069);operator += buf.readUnsignedByte();
            __CLR4_5_2335335lx1e369d.R.inc(4070);position.set("operator", operator);
            
            __CLR4_5_2335335lx1e369d.R.inc(4071);buf.readUnsignedInt(); // ADC
            __CLR4_5_2335335lx1e369d.R.inc(4072);buf.readUnsignedMedium(); // Odometer
            __CLR4_5_2335335lx1e369d.R.inc(4073);buf.skipBytes(6); // multi-purpose data
            
            __CLR4_5_2335335lx1e369d.R.inc(4074);buf.readUnsignedShort(); // gps fix
            __CLR4_5_2335335lx1e369d.R.inc(4075);buf.readUnsignedByte(); // location status
            __CLR4_5_2335335lx1e369d.R.inc(4076);buf.readUnsignedByte(); // mode 1
            __CLR4_5_2335335lx1e369d.R.inc(4077);buf.readUnsignedByte(); // mode 2

            __CLR4_5_2335335lx1e369d.R.inc(4078);position.setValid(buf.readUnsignedByte() >= 3); // satellites

            // Location data
            __CLR4_5_2335335lx1e369d.R.inc(4079);position.setLongitude(buf.readInt() / Math.PI * 180 / 100000000);
            __CLR4_5_2335335lx1e369d.R.inc(4080);position.setLatitude(buf.readInt() / Math.PI * 180 / 100000000.0);
            __CLR4_5_2335335lx1e369d.R.inc(4081);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_2335335lx1e369d.R.inc(4082);position.setSpeed(UnitsConverter.knotsFromMps(buf.readInt() * 0.01));
            __CLR4_5_2335335lx1e369d.R.inc(4083);position.setCourse(buf.readUnsignedShort() / Math.PI * 180.0 / 1000.0);
            
            // Time
            __CLR4_5_2335335lx1e369d.R.inc(4084);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2335335lx1e369d.R.inc(4085);time.clear();
            __CLR4_5_2335335lx1e369d.R.inc(4086);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_2335335lx1e369d.R.inc(4087);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_2335335lx1e369d.R.inc(4088);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_2335335lx1e369d.R.inc(4089);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_2335335lx1e369d.R.inc(4090);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_2335335lx1e369d.R.inc(4091);time.set(Calendar.YEAR, buf.readUnsignedShort());
            __CLR4_5_2335335lx1e369d.R.inc(4092);position.setTime(time.getTime());
            __CLR4_5_2335335lx1e369d.R.inc(4093);return position;
        }

        }__CLR4_5_2335335lx1e369d.R.inc(4094);return null;
    }finally{__CLR4_5_2335335lx1e369d.R.flushNeeded();}}

}
