/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CastelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22yk2yklx1e74og{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,3961,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CastelProtocolDecoder(CastelProtocol protocol) {
        super(protocol);__CLR4_5_22yk2yklx1e74og.R.inc(3837);try{__CLR4_5_22yk2yklx1e74og.R.inc(3836);
    }finally{__CLR4_5_22yk2yklx1e74og.R.flushNeeded();}}

    private static final short MSG_LOGIN = 0x1001;
    private static final short MSG_LOGIN_RESPONSE = (short) 0x9001;
    private static final short MSG_LOGOUT = 0x1002;
    private static final short MSG_HEARTBEAT = 0x1003;
    private static final short MSG_HEARTBEAT_RESPONSE = (short) 0x9003;
    private static final short MSG_GPS = 0x4001;
    private static final short MSG_ALARM = 0x4007;
    private static final short MSG_GPS_SLEEP = 0x4009;
    private static final short MSG_AGPS_REQUEST = 0x5101;
    private static final short MSG_CURRENT_LOCATION = (short) 0xB001;

    private static void readPosition(ChannelBuffer buf, Position position) {try{__CLR4_5_22yk2yklx1e74og.R.inc(3838);

        // Date and time
        __CLR4_5_22yk2yklx1e74og.R.inc(3839);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_22yk2yklx1e74og.R.inc(3840);time.clear();
        __CLR4_5_22yk2yklx1e74og.R.inc(3841);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
        __CLR4_5_22yk2yklx1e74og.R.inc(3842);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
        __CLR4_5_22yk2yklx1e74og.R.inc(3843);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
        __CLR4_5_22yk2yklx1e74og.R.inc(3844);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
        __CLR4_5_22yk2yklx1e74og.R.inc(3845);time.set(Calendar.MINUTE, buf.readUnsignedByte());
        __CLR4_5_22yk2yklx1e74og.R.inc(3846);time.set(Calendar.SECOND, buf.readUnsignedByte());
        __CLR4_5_22yk2yklx1e74og.R.inc(3847);position.setTime(time.getTime());

        __CLR4_5_22yk2yklx1e74og.R.inc(3848);double lat = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_22yk2yklx1e74og.R.inc(3849);double lon = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_22yk2yklx1e74og.R.inc(3850);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
        __CLR4_5_22yk2yklx1e74og.R.inc(3851);position.setCourse(buf.readUnsignedShort() % 360);

        __CLR4_5_22yk2yklx1e74og.R.inc(3852);int flags = buf.readUnsignedByte();
        __CLR4_5_22yk2yklx1e74og.R.inc(3853);position.setLatitude(((((flags & 0x02) == 0 )&&(__CLR4_5_22yk2yklx1e74og.R.iget(3854)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3855)==0&false))? -lat : lat);
        __CLR4_5_22yk2yklx1e74og.R.inc(3856);position.setLongitude(((((flags & 0x01) == 0 )&&(__CLR4_5_22yk2yklx1e74og.R.iget(3857)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3858)==0&false))? -lon : lon);
        __CLR4_5_22yk2yklx1e74og.R.inc(3859);position.setValid((flags & 0x0C) > 0);
        __CLR4_5_22yk2yklx1e74og.R.inc(3860);position.set(Event.KEY_SATELLITES, flags >> 4);
    }finally{__CLR4_5_22yk2yklx1e74og.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22yk2yklx1e74og.R.inc(3861);

        __CLR4_5_22yk2yklx1e74og.R.inc(3862);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22yk2yklx1e74og.R.inc(3863);buf.skipBytes(2); // header
        __CLR4_5_22yk2yklx1e74og.R.inc(3864);buf.readUnsignedShort(); // length
        __CLR4_5_22yk2yklx1e74og.R.inc(3865);int version = buf.readUnsignedByte();
        __CLR4_5_22yk2yklx1e74og.R.inc(3866);ChannelBuffer id = buf.readBytes(20);
        __CLR4_5_22yk2yklx1e74og.R.inc(3867);int type = ChannelBuffers.swapShort(buf.readShort());
        
        __CLR4_5_22yk2yklx1e74og.R.inc(3868);if ((((type == MSG_HEARTBEAT)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3869)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3870)==0&false))) {{
            
            __CLR4_5_22yk2yklx1e74og.R.inc(3871);if ((((channel != null)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3872)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3873)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3874);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 31);
                __CLR4_5_22yk2yklx1e74og.R.inc(3875);response.writeByte(0x40); __CLR4_5_22yk2yklx1e74og.R.inc(3876);response.writeByte(0x40);
                __CLR4_5_22yk2yklx1e74og.R.inc(3877);response.writeShort(response.capacity());
                __CLR4_5_22yk2yklx1e74og.R.inc(3878);response.writeByte(version);
                __CLR4_5_22yk2yklx1e74og.R.inc(3879);response.writeBytes(id);
                __CLR4_5_22yk2yklx1e74og.R.inc(3880);response.writeShort(ChannelBuffers.swapShort(MSG_HEARTBEAT_RESPONSE));
                __CLR4_5_22yk2yklx1e74og.R.inc(3881);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(0, response.writerIndex())));
                __CLR4_5_22yk2yklx1e74og.R.inc(3882);response.writeByte(0x0D); __CLR4_5_22yk2yklx1e74og.R.inc(3883);response.writeByte(0x0A);
                __CLR4_5_22yk2yklx1e74og.R.inc(3884);channel.write(response, remoteAddress);
            }

        }} }else {__CLR4_5_22yk2yklx1e74og.R.inc(3885);if (
                (((type == MSG_LOGIN ||
                type == MSG_LOGOUT ||
                type == MSG_GPS ||
                type == MSG_ALARM ||
                type == MSG_CURRENT_LOCATION)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3886)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3887)==0&false))) {{
            
            __CLR4_5_22yk2yklx1e74og.R.inc(3888);if ((((!identify(id.toString(Charset.defaultCharset()).trim(), channel, remoteAddress))&&(__CLR4_5_22yk2yklx1e74og.R.iget(3889)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3890)==0&false))) {{

                __CLR4_5_22yk2yklx1e74og.R.inc(3891);return null;

            } }else {__CLR4_5_22yk2yklx1e74og.R.inc(3892);if ((((type == MSG_LOGIN)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3893)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3894)==0&false))) {{

                __CLR4_5_22yk2yklx1e74og.R.inc(3895);if ((((channel != null)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3896)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3897)==0&false))) {{
                    __CLR4_5_22yk2yklx1e74og.R.inc(3898);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 41);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3899);response.writeByte(0x40); __CLR4_5_22yk2yklx1e74og.R.inc(3900);response.writeByte(0x40);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3901);response.writeShort(response.capacity());
                    __CLR4_5_22yk2yklx1e74og.R.inc(3902);response.writeByte(version);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3903);response.writeBytes(id);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3904);response.writeShort(ChannelBuffers.swapShort(MSG_LOGIN_RESPONSE));
                    __CLR4_5_22yk2yklx1e74og.R.inc(3905);response.writeInt(0xFFFFFFFF);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3906);response.writeShort(0);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3907);response.writeInt((int) (new Date().getTime() / 1000));
                    __CLR4_5_22yk2yklx1e74og.R.inc(3908);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(0, response.writerIndex())));
                    __CLR4_5_22yk2yklx1e74og.R.inc(3909);response.writeByte(0x0D); __CLR4_5_22yk2yklx1e74og.R.inc(3910);response.writeByte(0x0A);
                    __CLR4_5_22yk2yklx1e74og.R.inc(3911);channel.write(response, remoteAddress);
                }
            
            }}

            }}__CLR4_5_22yk2yklx1e74og.R.inc(3912);if ((((type == MSG_GPS)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3913)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3914)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3915);buf.readUnsignedByte(); // historical
            } }else {__CLR4_5_22yk2yklx1e74og.R.inc(3916);if ((((type == MSG_ALARM)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3917)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3918)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3919);buf.readUnsignedInt(); // alarm
            } }else {__CLR4_5_22yk2yklx1e74og.R.inc(3920);if ((((type == MSG_CURRENT_LOCATION)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3921)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3922)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3923);buf.readUnsignedShort();
            }
            
            }}}__CLR4_5_22yk2yklx1e74og.R.inc(3924);buf.readUnsignedInt(); // ACC ON time
            __CLR4_5_22yk2yklx1e74og.R.inc(3925);buf.readUnsignedInt(); // UTC time
            __CLR4_5_22yk2yklx1e74og.R.inc(3926);long odometer = buf.readUnsignedInt();
            __CLR4_5_22yk2yklx1e74og.R.inc(3927);buf.readUnsignedInt(); // trip odometer
            __CLR4_5_22yk2yklx1e74og.R.inc(3928);buf.readUnsignedInt(); // total fuel consumption
            __CLR4_5_22yk2yklx1e74og.R.inc(3929);buf.readUnsignedShort(); // current fuel consumption
            __CLR4_5_22yk2yklx1e74og.R.inc(3930);long status = buf.readUnsignedInt();
            __CLR4_5_22yk2yklx1e74og.R.inc(3931);buf.skipBytes(8);
            
            __CLR4_5_22yk2yklx1e74og.R.inc(3932);int count = buf.readUnsignedByte();

            __CLR4_5_22yk2yklx1e74og.R.inc(3933);List<Position> positions = new LinkedList<>();

            __CLR4_5_22yk2yklx1e74og.R.inc(3934);for (int i = 0; (((i < count)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3935)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3936)==0&false)); i++) {{

                __CLR4_5_22yk2yklx1e74og.R.inc(3937);Position position = new Position();
                __CLR4_5_22yk2yklx1e74og.R.inc(3938);position.setProtocol(getProtocolName());
                __CLR4_5_22yk2yklx1e74og.R.inc(3939);position.setDeviceId(getDeviceId());

                __CLR4_5_22yk2yklx1e74og.R.inc(3940);readPosition(buf, position);

                __CLR4_5_22yk2yklx1e74og.R.inc(3941);position.set(Event.KEY_ODOMETER, odometer);
                __CLR4_5_22yk2yklx1e74og.R.inc(3942);position.set(Event.KEY_STATUS, status);

                __CLR4_5_22yk2yklx1e74og.R.inc(3943);positions.add(position);
            }

            }__CLR4_5_22yk2yklx1e74og.R.inc(3944);if ((((!positions.isEmpty())&&(__CLR4_5_22yk2yklx1e74og.R.iget(3945)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3946)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3947);return positions;
            }

        }} }else {__CLR4_5_22yk2yklx1e74og.R.inc(3948);if ((((type == MSG_GPS_SLEEP || type == MSG_AGPS_REQUEST)&&(__CLR4_5_22yk2yklx1e74og.R.iget(3949)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3950)==0&false))) {{

            __CLR4_5_22yk2yklx1e74og.R.inc(3951);if ((((!identify(id.toString(Charset.defaultCharset()).trim(), channel, remoteAddress))&&(__CLR4_5_22yk2yklx1e74og.R.iget(3952)!=0|true))||(__CLR4_5_22yk2yklx1e74og.R.iget(3953)==0&false))) {{
                __CLR4_5_22yk2yklx1e74og.R.inc(3954);return null;
            }

            }__CLR4_5_22yk2yklx1e74og.R.inc(3955);Position position = new Position();
            __CLR4_5_22yk2yklx1e74og.R.inc(3956);position.setProtocol(getProtocolName());
            __CLR4_5_22yk2yklx1e74og.R.inc(3957);position.setDeviceId(getDeviceId());

            __CLR4_5_22yk2yklx1e74og.R.inc(3958);readPosition(buf, position);

            __CLR4_5_22yk2yklx1e74og.R.inc(3959);return position;
        }
        
        }}}__CLR4_5_22yk2yklx1e74og.R.inc(3960);return null;
    }finally{__CLR4_5_22yk2yklx1e74og.R.flushNeeded();}}

}
