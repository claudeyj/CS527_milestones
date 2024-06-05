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
import java.util.Calendar;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CellocatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22zx2zxlx1dlo6o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,3979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CellocatorProtocolDecoder(CellocatorProtocol protocol) {
        super(protocol);__CLR4_5_22zx2zxlx1dlo6o.R.inc(3886);try{__CLR4_5_22zx2zxlx1dlo6o.R.inc(3885);
    }finally{__CLR4_5_22zx2zxlx1dlo6o.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_22zx2zxlx1dlo6o.R.inc(3887);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3888);int b = buf.readUnsignedByte();
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3889);StringBuilder imei = new StringBuilder();
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3890);imei.append(b & 0x0F);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3891);for (int i = 0; (((i < 7)&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3892)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3893)==0&false)); i++) {{
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3894);b = buf.readUnsignedByte();
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3895);imei.append((b & 0xF0) >> 4);
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3896);imei.append(b & 0x0F);
        }
        }__CLR4_5_22zx2zxlx1dlo6o.R.inc(3897);return imei.toString();
    }finally{__CLR4_5_22zx2zxlx1dlo6o.R.flushNeeded();}}
    
    static final int MSG_CLIENT_STATUS = 0;
    static final int MSG_CLIENT_PROGRAMMING = 3;
    static final int MSG_CLIENT_SERIAL_LOG = 7;
    static final int MSG_CLIENT_SERIAL = 8;
    static final int MSG_CLIENT_MODULAR = 9;

    private static final int MSG_SERVER_ACKNOWLEDGE = 4;
    
    private byte commandCount;
    
    private void sendReply(Channel channel, long deviceId, byte packetNumber) {try{__CLR4_5_22zx2zxlx1dlo6o.R.inc(3898);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3899);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3900);reply.writeByte('M');
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3901);reply.writeByte('C');
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3902);reply.writeByte('G');
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3903);reply.writeByte('P');
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3904);reply.writeByte(MSG_SERVER_ACKNOWLEDGE);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3905);reply.writeInt((int) deviceId);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3906);reply.writeByte(commandCount++);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3907);reply.writeInt(0); // authentication code
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3908);reply.writeByte(0);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3909);reply.writeByte(packetNumber);
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3910);reply.writeZero(11);

        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3911);byte checksum = 0;
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3912);for (int i = 4; (((i < 27)&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3913)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3914)==0&false)); i++) {{
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3915);checksum += reply.getByte(i);
        }
        }__CLR4_5_22zx2zxlx1dlo6o.R.inc(3916);reply.writeByte(checksum);

        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3917);if ((((channel != null)&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3918)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3919)==0&false))) {{
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3920);channel.write(reply);
        }
    }}finally{__CLR4_5_22zx2zxlx1dlo6o.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22zx2zxlx1dlo6o.R.inc(3921);

        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3922);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3923);buf.skipBytes(4); // system code
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3924);int type = buf.readUnsignedByte();
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3925);long deviceUniqueId = buf.readUnsignedInt();
        
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3926);if ((((type != MSG_CLIENT_SERIAL)&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3927)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3928)==0&false))) {{
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3929);buf.readUnsignedShort(); // communication control
        }
        }__CLR4_5_22zx2zxlx1dlo6o.R.inc(3930);byte packetNumber = buf.readByte();

        // Send reply
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3931);sendReply(channel, deviceUniqueId, packetNumber);

        // Parse location
        __CLR4_5_22zx2zxlx1dlo6o.R.inc(3932);if ((((type == MSG_CLIENT_STATUS)&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3933)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3934)==0&false))) {{
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3935);Position position = new Position();
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3936);position.setProtocol(getProtocolName());
            
            // Device identifier
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3937);if ((((!identify(String.valueOf(deviceUniqueId), channel))&&(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3938)!=0|true))||(__CLR4_5_22zx2zxlx1dlo6o.R.iget(3939)==0&false))) {{
                __CLR4_5_22zx2zxlx1dlo6o.R.inc(3940);return null;
            }
            }__CLR4_5_22zx2zxlx1dlo6o.R.inc(3941);position.setDeviceId(getDeviceId());

            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3942);buf.readUnsignedByte(); // hardware version
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3943);buf.readUnsignedByte(); // software version
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3944);buf.readUnsignedByte(); // protocol version

            // Status
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3945);position.set(Event.KEY_STATUS, buf.getUnsignedByte(buf.readerIndex()) & 0x0f);
            
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3946);int operator = (buf.readUnsignedByte() & 0xf0) << 4;
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3947);operator += buf.readUnsignedByte();
            
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3948);buf.readUnsignedByte(); // reason data
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3949);buf.readUnsignedByte(); // reason
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3950);buf.readUnsignedByte(); // mode
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3951);buf.readUnsignedInt(); // IO
            
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3952);operator <<= 8;
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3953);operator += buf.readUnsignedByte();
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3954);position.set("operator", operator);
            
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3955);buf.readUnsignedInt(); // ADC
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3956);buf.readUnsignedMedium(); // Odometer
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3957);buf.skipBytes(6); // multi-purpose data
            
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3958);buf.readUnsignedShort(); // gps fix
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3959);buf.readUnsignedByte(); // location status
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3960);buf.readUnsignedByte(); // mode 1
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3961);buf.readUnsignedByte(); // mode 2

            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3962);position.setValid(buf.readUnsignedByte() >= 3); // satellites

            // Location data
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3963);position.setLongitude(buf.readInt() / Math.PI * 180 / 100000000);
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3964);position.setLatitude(buf.readInt() / Math.PI * 180 / 100000000.0);
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3965);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3966);position.setSpeed(UnitsConverter.knotsFromMps(buf.readInt() * 0.01));
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3967);position.setCourse(buf.readUnsignedShort() / Math.PI * 180.0 / 1000.0);
            
            // Time
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3968);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3969);time.clear();
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3970);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3971);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3972);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3973);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3974);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3975);time.set(Calendar.YEAR, buf.readUnsignedShort());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3976);position.setTime(time.getTime());
            __CLR4_5_22zx2zxlx1dlo6o.R.inc(3977);return position;
        }

        }__CLR4_5_22zx2zxlx1dlo6o.R.inc(3978);return null;
    }finally{__CLR4_5_22zx2zxlx1dlo6o.R.flushNeeded();}}

}
