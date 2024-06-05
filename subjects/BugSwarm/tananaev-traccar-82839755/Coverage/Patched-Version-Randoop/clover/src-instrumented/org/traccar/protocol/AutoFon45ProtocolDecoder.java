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

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;
import static org.traccar.protocol.AutoFon45FrameDecoder.MSG_LOCATION;
import static org.traccar.protocol.AutoFon45FrameDecoder.MSG_LOGIN;

public class AutoFon45ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_229p29plx1e746u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,3015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static double convertCoordinate(short degrees, int raw) {try{__CLR4_5_229p29plx1e746u.R.inc(2941);
        __CLR4_5_229p29plx1e746u.R.inc(2942);double seconds = (raw >> 4 & 0xffffff) / 600000.0;
        __CLR4_5_229p29plx1e746u.R.inc(2943);return (degrees + seconds) * (((((raw & 0x0f) == 0 )&&(__CLR4_5_229p29plx1e746u.R.iget(2944)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(2945)==0&false))? -1 : 1);
    }finally{__CLR4_5_229p29plx1e746u.R.flushNeeded();}}

    public AutoFon45ProtocolDecoder(AutoFon45Protocol protocol) {
        super(protocol);__CLR4_5_229p29plx1e746u.R.inc(2947);try{__CLR4_5_229p29plx1e746u.R.inc(2946);
    }finally{__CLR4_5_229p29plx1e746u.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_229p29plx1e746u.R.inc(2948);
        
        __CLR4_5_229p29plx1e746u.R.inc(2949);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_229p29plx1e746u.R.inc(2950);int type = buf.getUnsignedByte(0);

        __CLR4_5_229p29plx1e746u.R.inc(2951);if ((((type == MSG_LOGIN)&&(__CLR4_5_229p29plx1e746u.R.iget(2952)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(2953)==0&false))) {{
            __CLR4_5_229p29plx1e746u.R.inc(2954);byte[] bytes = new byte[19];
            __CLR4_5_229p29plx1e746u.R.inc(2955);buf.readBytes(bytes);

            __CLR4_5_229p29plx1e746u.R.inc(2956);String imei = ChannelBufferTools.readHexString(ChannelBuffers.wrappedBuffer(bytes, 1, 16), 16).substring(1);
            __CLR4_5_229p29plx1e746u.R.inc(2957);if ((((!identify(imei, channel))&&(__CLR4_5_229p29plx1e746u.R.iget(2958)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(2959)==0&false))) {{
                __CLR4_5_229p29plx1e746u.R.inc(2960);return null;
            }

            // Send response (CRC)
            }__CLR4_5_229p29plx1e746u.R.inc(2961);if ((((channel != null)&&(__CLR4_5_229p29plx1e746u.R.iget(2962)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(2963)==0&false))) {{
                __CLR4_5_229p29plx1e746u.R.inc(2964);byte[] response = "resp_crc=".getBytes("US-ASCII");
                __CLR4_5_229p29plx1e746u.R.inc(2965);response = Arrays.copyOf(response, response.length + 1);
                __CLR4_5_229p29plx1e746u.R.inc(2966);response[response.length - 1] = crc(bytes, 0, 18);
                __CLR4_5_229p29plx1e746u.R.inc(2967);channel.write(ChannelBuffers.wrappedBuffer(response));
            }
        }} }else {__CLR4_5_229p29plx1e746u.R.inc(2968);if ((((type == MSG_LOCATION)&&(__CLR4_5_229p29plx1e746u.R.iget(2969)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(2970)==0&false))) {{
            __CLR4_5_229p29plx1e746u.R.inc(2971);buf.readUnsignedByte();

            // Create new position
            __CLR4_5_229p29plx1e746u.R.inc(2972);Position position = new Position();
            __CLR4_5_229p29plx1e746u.R.inc(2973);position.setProtocol(getProtocolName());
            __CLR4_5_229p29plx1e746u.R.inc(2974);position.setDeviceId(getDeviceId());

            __CLR4_5_229p29plx1e746u.R.inc(2975);short status = buf.readUnsignedByte();
            __CLR4_5_229p29plx1e746u.R.inc(2976);position.set(Event.KEY_ALARM, (status & 0x80) != 0);
            __CLR4_5_229p29plx1e746u.R.inc(2977);position.set(Event.KEY_BATTERY, status & 0x7F);

            __CLR4_5_229p29plx1e746u.R.inc(2978);buf.skipBytes(2); // remaining time

            __CLR4_5_229p29plx1e746u.R.inc(2979);position.set(Event.PREFIX_TEMP + 1, buf.readByte());

            __CLR4_5_229p29plx1e746u.R.inc(2980);buf.skipBytes(2); // timer (interval and units)
            __CLR4_5_229p29plx1e746u.R.inc(2981);buf.readByte(); // mode
            __CLR4_5_229p29plx1e746u.R.inc(2982);buf.readByte(); // gprs sending interval

            __CLR4_5_229p29plx1e746u.R.inc(2983);buf.skipBytes(6); // MCC, MNC, LAC, CID

            // GPS status
            __CLR4_5_229p29plx1e746u.R.inc(2984);int valid = buf.readUnsignedByte();
            __CLR4_5_229p29plx1e746u.R.inc(2985);position.setValid((valid & 0xc0) != 0);
            __CLR4_5_229p29plx1e746u.R.inc(2986);position.set(Event.KEY_SATELLITES, valid & 0x3f);

            // Date and time
            __CLR4_5_229p29plx1e746u.R.inc(2987);int timeOfDay = buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte();
            __CLR4_5_229p29plx1e746u.R.inc(2988);int date = buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte();

            __CLR4_5_229p29plx1e746u.R.inc(2989);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_229p29plx1e746u.R.inc(2990);time.clear();
            __CLR4_5_229p29plx1e746u.R.inc(2991);time.set(Calendar.HOUR_OF_DAY, timeOfDay / 10000);
            __CLR4_5_229p29plx1e746u.R.inc(2992);time.set(Calendar.MINUTE, (timeOfDay - time.get(Calendar.HOUR_OF_DAY) * 10000) / 100);
            __CLR4_5_229p29plx1e746u.R.inc(2993);time.set(Calendar.SECOND, (timeOfDay - time.get(Calendar.HOUR_OF_DAY) * 10000 - time.get(Calendar.MINUTE) * 100));
            __CLR4_5_229p29plx1e746u.R.inc(2994);time.set(Calendar.DAY_OF_MONTH, date / 10000);
            __CLR4_5_229p29plx1e746u.R.inc(2995);time.set(Calendar.MONTH, (date - time.get(Calendar.DAY_OF_MONTH) * 10000) / 100 - 1);
            __CLR4_5_229p29plx1e746u.R.inc(2996);time.set(Calendar.YEAR, 2000 + (date - time.get(Calendar.DAY_OF_MONTH) * 10000 - (time.get(Calendar.MONTH) + 1) * 100));
            __CLR4_5_229p29plx1e746u.R.inc(2997);position.setTime(time.getTime());

            // Location
            __CLR4_5_229p29plx1e746u.R.inc(2998);position.setLatitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte()));
            __CLR4_5_229p29plx1e746u.R.inc(2999);position.setLongitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedByte() << 16 | buf.readUnsignedByte() << 8 | buf.readUnsignedByte()));
            __CLR4_5_229p29plx1e746u.R.inc(3000);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_229p29plx1e746u.R.inc(3001);position.setCourse(buf.readUnsignedByte() << 8 | buf.readUnsignedByte());

            __CLR4_5_229p29plx1e746u.R.inc(3002);buf.readUnsignedByte(); // checksum
            __CLR4_5_229p29plx1e746u.R.inc(3003);return position;
        }

        }}__CLR4_5_229p29plx1e746u.R.inc(3004);return null;
    }finally{__CLR4_5_229p29plx1e746u.R.flushNeeded();}}

    private byte crc(byte[] bytes, int offset, int len) {try{__CLR4_5_229p29plx1e746u.R.inc(3005);
        __CLR4_5_229p29plx1e746u.R.inc(3006);byte GPRS_CRC = 0x3B;
        __CLR4_5_229p29plx1e746u.R.inc(3007);for (int i = offset; (((i < offset + len)&&(__CLR4_5_229p29plx1e746u.R.iget(3008)!=0|true))||(__CLR4_5_229p29plx1e746u.R.iget(3009)==0&false)); i++) {{
            __CLR4_5_229p29plx1e746u.R.inc(3010);GPRS_CRC += 0x56 ^ bytes[i];
            __CLR4_5_229p29plx1e746u.R.inc(3011);GPRS_CRC++;
            __CLR4_5_229p29plx1e746u.R.inc(3012);GPRS_CRC ^= 0xC5 + bytes[i];
            __CLR4_5_229p29plx1e746u.R.inc(3013);GPRS_CRC--;
        }
        }__CLR4_5_229p29plx1e746u.R.inc(3014);return GPRS_CRC;
    }finally{__CLR4_5_229p29plx1e746u.R.flushNeeded();}}
}
