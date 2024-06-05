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

public class CellocatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22zy2zylx1do928{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,3980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CellocatorProtocolDecoder(CellocatorProtocol protocol) {
        super(protocol);__CLR4_5_22zy2zylx1do928.R.inc(3887);try{__CLR4_5_22zy2zylx1do928.R.inc(3886);
    }finally{__CLR4_5_22zy2zylx1do928.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_22zy2zylx1do928.R.inc(3888);
        __CLR4_5_22zy2zylx1do928.R.inc(3889);int b = buf.readUnsignedByte();
        __CLR4_5_22zy2zylx1do928.R.inc(3890);StringBuilder imei = new StringBuilder();
        __CLR4_5_22zy2zylx1do928.R.inc(3891);imei.append(b & 0x0F);
        __CLR4_5_22zy2zylx1do928.R.inc(3892);for (int i = 0; (((i < 7)&&(__CLR4_5_22zy2zylx1do928.R.iget(3893)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3894)==0&false)); i++) {{
            __CLR4_5_22zy2zylx1do928.R.inc(3895);b = buf.readUnsignedByte();
            __CLR4_5_22zy2zylx1do928.R.inc(3896);imei.append((b & 0xF0) >> 4);
            __CLR4_5_22zy2zylx1do928.R.inc(3897);imei.append(b & 0x0F);
        }
        }__CLR4_5_22zy2zylx1do928.R.inc(3898);return imei.toString();
    }finally{__CLR4_5_22zy2zylx1do928.R.flushNeeded();}}
    
    static final int MSG_CLIENT_STATUS = 0;
    static final int MSG_CLIENT_PROGRAMMING = 3;
    static final int MSG_CLIENT_SERIAL_LOG = 7;
    static final int MSG_CLIENT_SERIAL = 8;
    static final int MSG_CLIENT_MODULAR = 9;

    private static final int MSG_SERVER_ACKNOWLEDGE = 4;
    
    private byte commandCount;
    
    private void sendReply(Channel channel, long deviceId, byte packetNumber) {try{__CLR4_5_22zy2zylx1do928.R.inc(3899);
        __CLR4_5_22zy2zylx1do928.R.inc(3900);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 28);
        __CLR4_5_22zy2zylx1do928.R.inc(3901);reply.writeByte('M');
        __CLR4_5_22zy2zylx1do928.R.inc(3902);reply.writeByte('C');
        __CLR4_5_22zy2zylx1do928.R.inc(3903);reply.writeByte('G');
        __CLR4_5_22zy2zylx1do928.R.inc(3904);reply.writeByte('P');
        __CLR4_5_22zy2zylx1do928.R.inc(3905);reply.writeByte(MSG_SERVER_ACKNOWLEDGE);
        __CLR4_5_22zy2zylx1do928.R.inc(3906);reply.writeInt((int) deviceId);
        __CLR4_5_22zy2zylx1do928.R.inc(3907);reply.writeByte(commandCount++);
        __CLR4_5_22zy2zylx1do928.R.inc(3908);reply.writeInt(0); // authentication code
        __CLR4_5_22zy2zylx1do928.R.inc(3909);reply.writeByte(0);
        __CLR4_5_22zy2zylx1do928.R.inc(3910);reply.writeByte(packetNumber);
        __CLR4_5_22zy2zylx1do928.R.inc(3911);reply.writeZero(11);

        __CLR4_5_22zy2zylx1do928.R.inc(3912);byte checksum = 0;
        __CLR4_5_22zy2zylx1do928.R.inc(3913);for (int i = 4; (((i < 27)&&(__CLR4_5_22zy2zylx1do928.R.iget(3914)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3915)==0&false)); i++) {{
            __CLR4_5_22zy2zylx1do928.R.inc(3916);checksum += reply.getByte(i);
        }
        }__CLR4_5_22zy2zylx1do928.R.inc(3917);reply.writeByte(checksum);

        __CLR4_5_22zy2zylx1do928.R.inc(3918);if ((((channel != null)&&(__CLR4_5_22zy2zylx1do928.R.iget(3919)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3920)==0&false))) {{
            __CLR4_5_22zy2zylx1do928.R.inc(3921);channel.write(reply);
        }
    }}finally{__CLR4_5_22zy2zylx1do928.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22zy2zylx1do928.R.inc(3922);

        __CLR4_5_22zy2zylx1do928.R.inc(3923);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22zy2zylx1do928.R.inc(3924);buf.skipBytes(4); // system code
        __CLR4_5_22zy2zylx1do928.R.inc(3925);int type = buf.readUnsignedByte();
        __CLR4_5_22zy2zylx1do928.R.inc(3926);long deviceUniqueId = buf.readUnsignedInt();
        
        __CLR4_5_22zy2zylx1do928.R.inc(3927);if ((((type != MSG_CLIENT_SERIAL)&&(__CLR4_5_22zy2zylx1do928.R.iget(3928)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3929)==0&false))) {{
            __CLR4_5_22zy2zylx1do928.R.inc(3930);buf.readUnsignedShort(); // communication control
        }
        }__CLR4_5_22zy2zylx1do928.R.inc(3931);byte packetNumber = buf.readByte();

        // Send reply
        __CLR4_5_22zy2zylx1do928.R.inc(3932);sendReply(channel, deviceUniqueId, packetNumber);

        // Parse location
        __CLR4_5_22zy2zylx1do928.R.inc(3933);if ((((type == MSG_CLIENT_STATUS)&&(__CLR4_5_22zy2zylx1do928.R.iget(3934)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3935)==0&false))) {{
            __CLR4_5_22zy2zylx1do928.R.inc(3936);Position position = new Position();
            __CLR4_5_22zy2zylx1do928.R.inc(3937);position.setProtocol(getProtocolName());
            
            // Device identifier
            __CLR4_5_22zy2zylx1do928.R.inc(3938);if ((((!identify(String.valueOf(deviceUniqueId), channel))&&(__CLR4_5_22zy2zylx1do928.R.iget(3939)!=0|true))||(__CLR4_5_22zy2zylx1do928.R.iget(3940)==0&false))) {{
                __CLR4_5_22zy2zylx1do928.R.inc(3941);return null;
            }
            }__CLR4_5_22zy2zylx1do928.R.inc(3942);position.setDeviceId(getDeviceId());

            __CLR4_5_22zy2zylx1do928.R.inc(3943);buf.readUnsignedByte(); // hardware version
            __CLR4_5_22zy2zylx1do928.R.inc(3944);buf.readUnsignedByte(); // software version
            __CLR4_5_22zy2zylx1do928.R.inc(3945);buf.readUnsignedByte(); // protocol version

            // Status
            __CLR4_5_22zy2zylx1do928.R.inc(3946);position.set(Event.KEY_STATUS, buf.getUnsignedByte(buf.readerIndex()) & 0x0f);
            
            __CLR4_5_22zy2zylx1do928.R.inc(3947);int operator = (buf.readUnsignedByte() & 0xf0) << 4;
            __CLR4_5_22zy2zylx1do928.R.inc(3948);operator += buf.readUnsignedByte();
            
            __CLR4_5_22zy2zylx1do928.R.inc(3949);buf.readUnsignedByte(); // reason data
            __CLR4_5_22zy2zylx1do928.R.inc(3950);buf.readUnsignedByte(); // reason
            __CLR4_5_22zy2zylx1do928.R.inc(3951);buf.readUnsignedByte(); // mode
            __CLR4_5_22zy2zylx1do928.R.inc(3952);buf.readUnsignedInt(); // IO
            
            __CLR4_5_22zy2zylx1do928.R.inc(3953);operator <<= 8;
            __CLR4_5_22zy2zylx1do928.R.inc(3954);operator += buf.readUnsignedByte();
            __CLR4_5_22zy2zylx1do928.R.inc(3955);position.set("operator", operator);
            
            __CLR4_5_22zy2zylx1do928.R.inc(3956);buf.readUnsignedInt(); // ADC
            __CLR4_5_22zy2zylx1do928.R.inc(3957);buf.readUnsignedMedium(); // Odometer
            __CLR4_5_22zy2zylx1do928.R.inc(3958);buf.skipBytes(6); // multi-purpose data
            
            __CLR4_5_22zy2zylx1do928.R.inc(3959);buf.readUnsignedShort(); // gps fix
            __CLR4_5_22zy2zylx1do928.R.inc(3960);buf.readUnsignedByte(); // location status
            __CLR4_5_22zy2zylx1do928.R.inc(3961);buf.readUnsignedByte(); // mode 1
            __CLR4_5_22zy2zylx1do928.R.inc(3962);buf.readUnsignedByte(); // mode 2

            __CLR4_5_22zy2zylx1do928.R.inc(3963);position.setValid(buf.readUnsignedByte() >= 3); // satellites

            // Location data
            __CLR4_5_22zy2zylx1do928.R.inc(3964);position.setLongitude(buf.readInt() / Math.PI * 180 / 100000000);
            __CLR4_5_22zy2zylx1do928.R.inc(3965);position.setLatitude(buf.readInt() / Math.PI * 180 / 100000000.0);
            __CLR4_5_22zy2zylx1do928.R.inc(3966);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_22zy2zylx1do928.R.inc(3967);position.setSpeed(UnitsConverter.knotsFromMps(buf.readInt() * 0.01));
            __CLR4_5_22zy2zylx1do928.R.inc(3968);position.setCourse(buf.readUnsignedShort() / Math.PI * 180.0 / 1000.0);
            
            // Time
            __CLR4_5_22zy2zylx1do928.R.inc(3969);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22zy2zylx1do928.R.inc(3970);time.clear();
            __CLR4_5_22zy2zylx1do928.R.inc(3971);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_22zy2zylx1do928.R.inc(3972);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_22zy2zylx1do928.R.inc(3973);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_22zy2zylx1do928.R.inc(3974);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_22zy2zylx1do928.R.inc(3975);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_22zy2zylx1do928.R.inc(3976);time.set(Calendar.YEAR, buf.readUnsignedShort());
            __CLR4_5_22zy2zylx1do928.R.inc(3977);position.setTime(time.getTime());
            __CLR4_5_22zy2zylx1do928.R.inc(3978);return position;
        }

        }__CLR4_5_22zy2zylx1do928.R.inc(3979);return null;
    }finally{__CLR4_5_22zy2zylx1do928.R.flushNeeded();}}

}
