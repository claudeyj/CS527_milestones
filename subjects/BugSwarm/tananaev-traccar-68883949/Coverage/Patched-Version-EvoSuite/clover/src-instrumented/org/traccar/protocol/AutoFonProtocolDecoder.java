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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.*;

public class AutoFonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22di2dilx1do8n8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,3169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AutoFonProtocolDecoder(AutoFonProtocol protocol) {
        super(protocol);__CLR4_5_22di2dilx1do8n8.R.inc(3079);try{__CLR4_5_22di2dilx1do8n8.R.inc(3078);
    }finally{__CLR4_5_22di2dilx1do8n8.R.flushNeeded();}}

    private static final int MSG_LOGIN = 0x10;
    private static final int MSG_LOCATION = 0x11;
    private static final int MSG_HISTORY = 0x12;

    private static double convertCoordinate(int raw) {try{__CLR4_5_22di2dilx1do8n8.R.inc(3080);
        __CLR4_5_22di2dilx1do8n8.R.inc(3081);double result = raw / 1000000;
        __CLR4_5_22di2dilx1do8n8.R.inc(3082);result += (raw % 1000000) / 600000.0;
        __CLR4_5_22di2dilx1do8n8.R.inc(3083);return result;
    }finally{__CLR4_5_22di2dilx1do8n8.R.flushNeeded();}}

    private Position decodePosition(ChannelBuffer buf, boolean history) {try{__CLR4_5_22di2dilx1do8n8.R.inc(3084);

        // Create new position
        __CLR4_5_22di2dilx1do8n8.R.inc(3085);Position position = new Position();
        __CLR4_5_22di2dilx1do8n8.R.inc(3086);position.setProtocol(getProtocolName());
        __CLR4_5_22di2dilx1do8n8.R.inc(3087);position.setDeviceId(getDeviceId());

        __CLR4_5_22di2dilx1do8n8.R.inc(3088);if ((((!history)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3089)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3090)==0&false))) {{
            __CLR4_5_22di2dilx1do8n8.R.inc(3091);buf.readUnsignedByte(); // interval
            __CLR4_5_22di2dilx1do8n8.R.inc(3092);buf.skipBytes(8); // settings
        }
        }__CLR4_5_22di2dilx1do8n8.R.inc(3093);buf.readUnsignedByte(); // status
        __CLR4_5_22di2dilx1do8n8.R.inc(3094);if ((((!history)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3095)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3096)==0&false))) {{
            __CLR4_5_22di2dilx1do8n8.R.inc(3097);buf.readUnsignedShort();
        }
        }__CLR4_5_22di2dilx1do8n8.R.inc(3098);position.set(Event.KEY_BATTERY, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3099);buf.skipBytes(6); // time

        // Timers
        __CLR4_5_22di2dilx1do8n8.R.inc(3100);if ((((!history)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3101)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3102)==0&false))) {{
            __CLR4_5_22di2dilx1do8n8.R.inc(3103);for (int i = 0; (((i < 2)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3104)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3105)==0&false)); i++) {{
                __CLR4_5_22di2dilx1do8n8.R.inc(3106);buf.skipBytes(5); // time
                __CLR4_5_22di2dilx1do8n8.R.inc(3107);buf.readUnsignedShort(); // interval
                __CLR4_5_22di2dilx1do8n8.R.inc(3108);buf.skipBytes(5); // mode
            }
        }}

        }__CLR4_5_22di2dilx1do8n8.R.inc(3109);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3110);position.set(Event.KEY_GSM, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3111);buf.readUnsignedShort(); // mcc
        __CLR4_5_22di2dilx1do8n8.R.inc(3112);buf.readUnsignedShort(); // mnc
        __CLR4_5_22di2dilx1do8n8.R.inc(3113);buf.readUnsignedShort(); // lac
        __CLR4_5_22di2dilx1do8n8.R.inc(3114);buf.readUnsignedShort(); // cid

        // GPS status
        __CLR4_5_22di2dilx1do8n8.R.inc(3115);int valid = buf.readUnsignedByte();
        __CLR4_5_22di2dilx1do8n8.R.inc(3116);position.setValid((valid & 0xc0) != 0);
        __CLR4_5_22di2dilx1do8n8.R.inc(3117);position.set(Event.KEY_SATELLITES, valid & 0x3f);

        // Date and time
        __CLR4_5_22di2dilx1do8n8.R.inc(3118);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_22di2dilx1do8n8.R.inc(3119);time.clear();
        __CLR4_5_22di2dilx1do8n8.R.inc(3120);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3121);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
        __CLR4_5_22di2dilx1do8n8.R.inc(3122);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3123);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3124);time.set(Calendar.MINUTE, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3125);time.set(Calendar.SECOND, buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3126);position.setTime(time.getTime());

        // Location
        __CLR4_5_22di2dilx1do8n8.R.inc(3127);position.setLatitude(convertCoordinate(buf.readInt()));
        __CLR4_5_22di2dilx1do8n8.R.inc(3128);position.setLongitude(convertCoordinate(buf.readInt()));
        __CLR4_5_22di2dilx1do8n8.R.inc(3129);position.setAltitude(buf.readShort());
        __CLR4_5_22di2dilx1do8n8.R.inc(3130);position.setSpeed(buf.readUnsignedByte());
        __CLR4_5_22di2dilx1do8n8.R.inc(3131);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_22di2dilx1do8n8.R.inc(3132);position.set(Event.KEY_HDOP, buf.readUnsignedShort());

        __CLR4_5_22di2dilx1do8n8.R.inc(3133);buf.readUnsignedShort(); // reserved
        __CLR4_5_22di2dilx1do8n8.R.inc(3134);buf.readUnsignedByte(); // checksum
        __CLR4_5_22di2dilx1do8n8.R.inc(3135);return position;
    }finally{__CLR4_5_22di2dilx1do8n8.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22di2dilx1do8n8.R.inc(3136);

        __CLR4_5_22di2dilx1do8n8.R.inc(3137);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22di2dilx1do8n8.R.inc(3138);int type = buf.readUnsignedByte();

        __CLR4_5_22di2dilx1do8n8.R.inc(3139);if ((((type == MSG_LOGIN)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3140)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3141)==0&false))) {{

            __CLR4_5_22di2dilx1do8n8.R.inc(3142);buf.readUnsignedByte(); // hardware version
            __CLR4_5_22di2dilx1do8n8.R.inc(3143);buf.readUnsignedByte(); // software version

            __CLR4_5_22di2dilx1do8n8.R.inc(3144);String imei = ChannelBufferTools.readHexString(buf, 16).substring(1);
            __CLR4_5_22di2dilx1do8n8.R.inc(3145);if ((((!identify(imei, channel))&&(__CLR4_5_22di2dilx1do8n8.R.iget(3146)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3147)==0&false))) {{
                __CLR4_5_22di2dilx1do8n8.R.inc(3148);return null;
            }

            // Send response
            }__CLR4_5_22di2dilx1do8n8.R.inc(3149);if ((((channel != null)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3150)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3151)==0&false))) {{
                __CLR4_5_22di2dilx1do8n8.R.inc(3152);channel.write(ChannelBuffers.wrappedBuffer(new byte[] { buf.readByte() }));
            }

        }} }else {__CLR4_5_22di2dilx1do8n8.R.inc(3153);if ((((type == MSG_LOCATION)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3154)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3155)==0&false))) {{

            __CLR4_5_22di2dilx1do8n8.R.inc(3156);return decodePosition(buf, false);

        } }else {__CLR4_5_22di2dilx1do8n8.R.inc(3157);if ((((type == MSG_HISTORY)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3158)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3159)==0&false))) {{

            __CLR4_5_22di2dilx1do8n8.R.inc(3160);int count = buf.readUnsignedByte() & 0x0f;
            __CLR4_5_22di2dilx1do8n8.R.inc(3161);buf.readUnsignedShort(); // total count
            __CLR4_5_22di2dilx1do8n8.R.inc(3162);List<Position> positions = new LinkedList<Position>();

            __CLR4_5_22di2dilx1do8n8.R.inc(3163);for (int i = 0; (((i < count)&&(__CLR4_5_22di2dilx1do8n8.R.iget(3164)!=0|true))||(__CLR4_5_22di2dilx1do8n8.R.iget(3165)==0&false)); i++) {{
                __CLR4_5_22di2dilx1do8n8.R.inc(3166);positions.add(decodePosition(buf, true));
            }

            }__CLR4_5_22di2dilx1do8n8.R.inc(3167);return positions;

        }

        }}}__CLR4_5_22di2dilx1do8n8.R.inc(3168);return null;
    }finally{__CLR4_5_22di2dilx1do8n8.R.flushNeeded();}}

}