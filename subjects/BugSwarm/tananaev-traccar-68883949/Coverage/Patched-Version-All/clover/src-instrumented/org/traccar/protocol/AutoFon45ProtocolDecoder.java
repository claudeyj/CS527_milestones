/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Vitaly Litvak (vitavaque@gmail.com)
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

import static org.traccar.protocol.AutoFon45FrameDecoder.MSG_LOGIN;
import static org.traccar.protocol.AutoFon45FrameDecoder.MSG_LOCATION;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.*;

public class AutoFon45ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22ao2aolx1dslmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,3050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static double convertCoordinate(short degrees, int raw) {try{__CLR4_5_22ao2aolx1dslmx.R.inc(2976);
        __CLR4_5_22ao2aolx1dslmx.R.inc(2977);double seconds = (raw >> 4 & 0xffffff) / 600000.0;
        __CLR4_5_22ao2aolx1dslmx.R.inc(2978);return (degrees + seconds) * (((((raw & 0x0f) == 0 )&&(__CLR4_5_22ao2aolx1dslmx.R.iget(2979)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(2980)==0&false))? -1 : 1);
    }finally{__CLR4_5_22ao2aolx1dslmx.R.flushNeeded();}}

    public AutoFon45ProtocolDecoder(AutoFon45Protocol protocol) {
        super(protocol);__CLR4_5_22ao2aolx1dslmx.R.inc(2982);try{__CLR4_5_22ao2aolx1dslmx.R.inc(2981);
    }finally{__CLR4_5_22ao2aolx1dslmx.R.flushNeeded();}}

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {try{__CLR4_5_22ao2aolx1dslmx.R.inc(2983);
        __CLR4_5_22ao2aolx1dslmx.R.inc(2984);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22ao2aolx1dslmx.R.inc(2985);int type = buf.getUnsignedByte(0);

        __CLR4_5_22ao2aolx1dslmx.R.inc(2986);if ((((type == MSG_LOGIN)&&(__CLR4_5_22ao2aolx1dslmx.R.iget(2987)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(2988)==0&false))) {{
            __CLR4_5_22ao2aolx1dslmx.R.inc(2989);byte[] bytes = new byte[19];
            __CLR4_5_22ao2aolx1dslmx.R.inc(2990);buf.readBytes(bytes);

            __CLR4_5_22ao2aolx1dslmx.R.inc(2991);String imei = ChannelBufferTools.readHexString(ChannelBuffers.wrappedBuffer(bytes, 1, 16), 16).substring(1);
            __CLR4_5_22ao2aolx1dslmx.R.inc(2992);if ((((!identify(imei, channel))&&(__CLR4_5_22ao2aolx1dslmx.R.iget(2993)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(2994)==0&false))) {{
                __CLR4_5_22ao2aolx1dslmx.R.inc(2995);return null;
            }

            // Send response (CRC)
            }__CLR4_5_22ao2aolx1dslmx.R.inc(2996);if ((((channel != null)&&(__CLR4_5_22ao2aolx1dslmx.R.iget(2997)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(2998)==0&false))) {{
                __CLR4_5_22ao2aolx1dslmx.R.inc(2999);byte[] response = "resp_crc=".getBytes("US-ASCII");
                __CLR4_5_22ao2aolx1dslmx.R.inc(3000);response = Arrays.copyOf(response, response.length + 1);
                __CLR4_5_22ao2aolx1dslmx.R.inc(3001);response[response.length - 1] = crc(bytes, 0, 18);
                __CLR4_5_22ao2aolx1dslmx.R.inc(3002);channel.write(ChannelBuffers.wrappedBuffer(response));
            }
        }} }else {__CLR4_5_22ao2aolx1dslmx.R.inc(3003);if ((((type == MSG_LOCATION)&&(__CLR4_5_22ao2aolx1dslmx.R.iget(3004)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(3005)==0&false))) {{
            __CLR4_5_22ao2aolx1dslmx.R.inc(3006);buf.readUnsignedByte();

            // Create new position
            __CLR4_5_22ao2aolx1dslmx.R.inc(3007);Position position = new Position();
            __CLR4_5_22ao2aolx1dslmx.R.inc(3008);position.setProtocol(getProtocolName());
            __CLR4_5_22ao2aolx1dslmx.R.inc(3009);position.setDeviceId(getDeviceId());

            __CLR4_5_22ao2aolx1dslmx.R.inc(3010);short status = buf.readUnsignedByte();
            __CLR4_5_22ao2aolx1dslmx.R.inc(3011);position.set(Event.KEY_ALARM, (status & 0x80) != 0);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3012);position.set(Event.KEY_BATTERY, status & 0x7F);

            __CLR4_5_22ao2aolx1dslmx.R.inc(3013);buf.skipBytes(2); // remaining time

            __CLR4_5_22ao2aolx1dslmx.R.inc(3014);position.set(Event.PREFIX_TEMP + 1, buf.readByte());

            __CLR4_5_22ao2aolx1dslmx.R.inc(3015);buf.skipBytes(2); // timer (interval and units)
            __CLR4_5_22ao2aolx1dslmx.R.inc(3016);buf.readByte(); // mode
            __CLR4_5_22ao2aolx1dslmx.R.inc(3017);buf.readByte(); // gprs sending interval

            __CLR4_5_22ao2aolx1dslmx.R.inc(3018);buf.skipBytes(6); // MCC, MNC, LAC, CID

            // GPS status
            __CLR4_5_22ao2aolx1dslmx.R.inc(3019);int valid = buf.readUnsignedByte();
            __CLR4_5_22ao2aolx1dslmx.R.inc(3020);position.setValid((valid & 0xc0) != 0);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3021);position.set(Event.KEY_SATELLITES, valid & 0x3f);

            // Date and time
            __CLR4_5_22ao2aolx1dslmx.R.inc(3022);int timeOfDay = buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte();
            __CLR4_5_22ao2aolx1dslmx.R.inc(3023);int date = buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte();

            __CLR4_5_22ao2aolx1dslmx.R.inc(3024);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22ao2aolx1dslmx.R.inc(3025);time.clear();
            __CLR4_5_22ao2aolx1dslmx.R.inc(3026);time.set(Calendar.HOUR_OF_DAY, timeOfDay / 10000);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3027);time.set(Calendar.MINUTE, (timeOfDay - time.get(Calendar.HOUR_OF_DAY) * 10000) / 100);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3028);time.set(Calendar.SECOND, (timeOfDay - time.get(Calendar.HOUR_OF_DAY) * 10000 - time.get(Calendar.MINUTE) * 100));
            __CLR4_5_22ao2aolx1dslmx.R.inc(3029);time.set(Calendar.DAY_OF_MONTH, date / 10000);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3030);time.set(Calendar.MONTH, (date - time.get(Calendar.DAY_OF_MONTH) * 10000) / 100 - 1);
            __CLR4_5_22ao2aolx1dslmx.R.inc(3031);time.set(Calendar.YEAR, 2000 + (date - time.get(Calendar.DAY_OF_MONTH) * 10000 - (time.get(Calendar.MONTH) + 1) * 100));
            __CLR4_5_22ao2aolx1dslmx.R.inc(3032);position.setTime(time.getTime());

            // Location
            __CLR4_5_22ao2aolx1dslmx.R.inc(3033);position.setLatitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte()));
            __CLR4_5_22ao2aolx1dslmx.R.inc(3034);position.setLongitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte()));
            __CLR4_5_22ao2aolx1dslmx.R.inc(3035);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_22ao2aolx1dslmx.R.inc(3036);position.setCourse(buf.readUnsignedByte() << 8 | buf.readUnsignedByte());

            __CLR4_5_22ao2aolx1dslmx.R.inc(3037);buf.readUnsignedByte(); // checksum
            __CLR4_5_22ao2aolx1dslmx.R.inc(3038);return position;
        }

        }}__CLR4_5_22ao2aolx1dslmx.R.inc(3039);return null;
    }finally{__CLR4_5_22ao2aolx1dslmx.R.flushNeeded();}}

    private byte crc(byte[] bytes, int offset, int len) {try{__CLR4_5_22ao2aolx1dslmx.R.inc(3040);
        __CLR4_5_22ao2aolx1dslmx.R.inc(3041);byte GPRS_CRC = 0x3B;
        __CLR4_5_22ao2aolx1dslmx.R.inc(3042);for (int i = offset; (((i < offset + len)&&(__CLR4_5_22ao2aolx1dslmx.R.iget(3043)!=0|true))||(__CLR4_5_22ao2aolx1dslmx.R.iget(3044)==0&false)); i++) {{
            __CLR4_5_22ao2aolx1dslmx.R.inc(3045);GPRS_CRC += 0x56 ^ bytes[i];
            __CLR4_5_22ao2aolx1dslmx.R.inc(3046);GPRS_CRC++;
            __CLR4_5_22ao2aolx1dslmx.R.inc(3047);GPRS_CRC ^= 0xC5 + bytes[i];
            __CLR4_5_22ao2aolx1dslmx.R.inc(3048);GPRS_CRC--;
        }
        }__CLR4_5_22ao2aolx1dslmx.R.inc(3049);return GPRS_CRC;
    }finally{__CLR4_5_22ao2aolx1dslmx.R.flushNeeded();}}
}
