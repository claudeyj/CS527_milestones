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
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CastelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22w82w8lx1dh2xf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,3845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CastelProtocolDecoder(CastelProtocol protocol) {
        super(protocol);__CLR4_5_22w82w8lx1dh2xf.R.inc(3753);try{__CLR4_5_22w82w8lx1dh2xf.R.inc(3752);
    }finally{__CLR4_5_22w82w8lx1dh2xf.R.flushNeeded();}}

    private static final short MSG_LOGIN = 0x1001;
    private static final short MSG_LOGIN_RESPONSE = (short) 0x9001;
    private static final short MSG_HEARTBEAT = 0x1003;
    private static final short MSG_HEARTBEAT_RESPONSE = (short) 0x9003;
    private static final short MSG_GPS = 0x4001;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22w82w8lx1dh2xf.R.inc(3754);

        __CLR4_5_22w82w8lx1dh2xf.R.inc(3755);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22w82w8lx1dh2xf.R.inc(3756);buf.skipBytes(2); // header
        __CLR4_5_22w82w8lx1dh2xf.R.inc(3757);buf.readUnsignedShort(); // length
        __CLR4_5_22w82w8lx1dh2xf.R.inc(3758);int version = buf.readUnsignedByte();
        __CLR4_5_22w82w8lx1dh2xf.R.inc(3759);ChannelBuffer id = buf.readBytes(20);
        __CLR4_5_22w82w8lx1dh2xf.R.inc(3760);int type = ChannelBuffers.swapShort(buf.readShort());
        
        __CLR4_5_22w82w8lx1dh2xf.R.inc(3761);if ((((type == MSG_HEARTBEAT)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3762)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3763)==0&false))) {{
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3764);if ((((channel != null)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3765)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3766)==0&false))) {{
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3767);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 31);
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3768);response.writeByte(0x40); __CLR4_5_22w82w8lx1dh2xf.R.inc(3769);response.writeByte(0x40);
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3770);response.writeShort(response.capacity());
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3771);response.writeByte(version);
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3772);response.writeBytes(id);
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3773);response.writeShort(ChannelBuffers.swapShort(MSG_HEARTBEAT_RESPONSE));
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3774);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(0, response.writerIndex())));
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3775);response.writeByte(0x0D); __CLR4_5_22w82w8lx1dh2xf.R.inc(3776);response.writeByte(0x0A);
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3777);channel.write(response, remoteAddress);
            }

        }} }else {__CLR4_5_22w82w8lx1dh2xf.R.inc(3778);if ((((type == MSG_LOGIN || type == MSG_GPS)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3779)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3780)==0&false))) {{
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3781);Position position = new Position();
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3782);position.setProtocol(getProtocolName());
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3783);if ((((!identify(id.toString(Charset.defaultCharset()).trim(), channel, remoteAddress))&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3784)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3785)==0&false))) {{
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3786);return null;
            } }else {__CLR4_5_22w82w8lx1dh2xf.R.inc(3787);if ((((type == MSG_LOGIN)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3788)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3789)==0&false))) {{

                __CLR4_5_22w82w8lx1dh2xf.R.inc(3790);if ((((channel != null)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3791)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3792)==0&false))) {{
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3793);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 41);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3794);response.writeByte(0x40); __CLR4_5_22w82w8lx1dh2xf.R.inc(3795);response.writeByte(0x40);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3796);response.writeShort(response.capacity());
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3797);response.writeByte(version);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3798);response.writeBytes(id);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3799);response.writeShort(ChannelBuffers.swapShort(MSG_LOGIN_RESPONSE));
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3800);response.writeInt(0xFFFFFFFF);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3801);response.writeShort(0);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3802);response.writeInt((int) (new Date().getTime() / 1000));
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3803);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(0, response.writerIndex())));
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3804);response.writeByte(0x0D); __CLR4_5_22w82w8lx1dh2xf.R.inc(3805);response.writeByte(0x0A);
                    __CLR4_5_22w82w8lx1dh2xf.R.inc(3806);channel.write(response, remoteAddress);
                }
            
            }}

            }}__CLR4_5_22w82w8lx1dh2xf.R.inc(3807);position.setDeviceId(getDeviceId());
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3808);if ((((type == MSG_GPS)&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3809)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3810)==0&false))) {{
                __CLR4_5_22w82w8lx1dh2xf.R.inc(3811);buf.readUnsignedByte(); // historical
            }
            
            }__CLR4_5_22w82w8lx1dh2xf.R.inc(3812);buf.readUnsignedInt(); // ACC ON time
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3813);buf.readUnsignedInt(); // UTC time
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3814);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3815);buf.readUnsignedInt(); // trip odometer
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3816);buf.readUnsignedInt(); // total fuel consumption
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3817);buf.readUnsignedShort(); // current fuel consumption
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3818);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3819);buf.skipBytes(8);
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3820);buf.readUnsignedByte(); // count
            
            // Date and time
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3821);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3822);time.clear();
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3823);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3824);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3825);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3826);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3827);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3828);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3829);position.setTime(time.getTime());
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3830);double lat = buf.readUnsignedInt() / 3600000.0;
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3831);double lon = buf.readUnsignedInt() / 3600000.0;
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3832);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3833);position.setCourse(buf.readUnsignedShort() % 360);
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3834);int flags = buf.readUnsignedByte();
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3835);position.setLatitude(((((flags & 0x02) == 0 )&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3836)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3837)==0&false))? -lat : lat);
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3838);position.setLongitude(((((flags & 0x01) == 0 )&&(__CLR4_5_22w82w8lx1dh2xf.R.iget(3839)!=0|true))||(__CLR4_5_22w82w8lx1dh2xf.R.iget(3840)==0&false))? -lon : lon);
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3841);position.setValid((flags & 0x0C) > 0);
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3842);position.set(Event.KEY_SATELLITES, flags >> 4);
            
            __CLR4_5_22w82w8lx1dh2xf.R.inc(3843);return position;
        }
        
        }}__CLR4_5_22w82w8lx1dh2xf.R.inc(3844);return null;
    }finally{__CLR4_5_22w82w8lx1dh2xf.R.flushNeeded();}}

}
