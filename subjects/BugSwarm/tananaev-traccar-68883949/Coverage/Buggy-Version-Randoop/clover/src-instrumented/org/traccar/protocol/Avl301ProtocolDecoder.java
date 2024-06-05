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
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.Calendar;
import java.util.TimeZone;

public class Avl301ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22g72g7lx1di67y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,3263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Avl301ProtocolDecoder(Avl301Protocol protocol) {
        super(protocol);__CLR4_5_22g72g7lx1di67y.R.inc(3176);try{__CLR4_5_22g72g7lx1di67y.R.inc(3175);
    }finally{__CLR4_5_22g72g7lx1di67y.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_22g72g7lx1di67y.R.inc(3177);
        __CLR4_5_22g72g7lx1di67y.R.inc(3178);int b = buf.readUnsignedByte();
        __CLR4_5_22g72g7lx1di67y.R.inc(3179);StringBuilder imei = new StringBuilder();
        __CLR4_5_22g72g7lx1di67y.R.inc(3180);imei.append(b & 0x0F);
        __CLR4_5_22g72g7lx1di67y.R.inc(3181);for (int i = 0; (((i < 7)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3182)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3183)==0&false)); i++) {{
            __CLR4_5_22g72g7lx1di67y.R.inc(3184);b = buf.readUnsignedByte();
            __CLR4_5_22g72g7lx1di67y.R.inc(3185);imei.append((b & 0xF0) >> 4);
            __CLR4_5_22g72g7lx1di67y.R.inc(3186);imei.append(b & 0x0F);
        }
        }__CLR4_5_22g72g7lx1di67y.R.inc(3187);return imei.toString();
    }finally{__CLR4_5_22g72g7lx1di67y.R.flushNeeded();}}

    private static final int MSG_LOGIN = 'L';
    private static final int MSG_STATUS = 'H';
    private static final int MSG_GPS_LBS_STATUS = '$';

    private static void sendResponse(Channel channel, int type) {try{__CLR4_5_22g72g7lx1di67y.R.inc(3188);
        __CLR4_5_22g72g7lx1di67y.R.inc(3189);if ((((channel != null)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3190)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3191)==0&false))) {{
            __CLR4_5_22g72g7lx1di67y.R.inc(3192);ChannelBuffer response = ChannelBuffers.directBuffer(5);
            __CLR4_5_22g72g7lx1di67y.R.inc(3193);response.writeByte('$');
            __CLR4_5_22g72g7lx1di67y.R.inc(3194);response.writeByte(type);
            __CLR4_5_22g72g7lx1di67y.R.inc(3195);response.writeByte('#');
            __CLR4_5_22g72g7lx1di67y.R.inc(3196);response.writeByte('\r'); __CLR4_5_22g72g7lx1di67y.R.inc(3197);response.writeByte('\n');
            __CLR4_5_22g72g7lx1di67y.R.inc(3198);channel.write(response);
        }
    }}finally{__CLR4_5_22g72g7lx1di67y.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22g72g7lx1di67y.R.inc(3199);

        __CLR4_5_22g72g7lx1di67y.R.inc(3200);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_22g72g7lx1di67y.R.inc(3201);buf.skipBytes(1); // header
        __CLR4_5_22g72g7lx1di67y.R.inc(3202);int type = buf.readUnsignedByte();
        __CLR4_5_22g72g7lx1di67y.R.inc(3203);buf.readUnsignedByte(); // length

        __CLR4_5_22g72g7lx1di67y.R.inc(3204);if ((((type == MSG_LOGIN)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3205)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3206)==0&false))) {{

            __CLR4_5_22g72g7lx1di67y.R.inc(3207);if ((((identify(readImei(buf), channel))&&(__CLR4_5_22g72g7lx1di67y.R.iget(3208)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3209)==0&false))) {{
                __CLR4_5_22g72g7lx1di67y.R.inc(3210);sendResponse(channel, type);
            }

        }} }else {__CLR4_5_22g72g7lx1di67y.R.inc(3211);if ((((hasDeviceId() && type == MSG_STATUS)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3212)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3213)==0&false))) {{

            __CLR4_5_22g72g7lx1di67y.R.inc(3214);sendResponse(channel, type);

        } }else {__CLR4_5_22g72g7lx1di67y.R.inc(3215);if ((((hasDeviceId() && type == MSG_GPS_LBS_STATUS)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3216)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3217)==0&false))) {{

            // Create new position
            __CLR4_5_22g72g7lx1di67y.R.inc(3218);Position position = new Position();
            __CLR4_5_22g72g7lx1di67y.R.inc(3219);position.setDeviceId(getDeviceId());
            __CLR4_5_22g72g7lx1di67y.R.inc(3220);position.setProtocol(getProtocolName());

            // Date and time(6)
            __CLR4_5_22g72g7lx1di67y.R.inc(3221);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22g72g7lx1di67y.R.inc(3222);time.clear();
            __CLR4_5_22g72g7lx1di67y.R.inc(3223);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3224);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_22g72g7lx1di67y.R.inc(3225);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3226);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3227);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3228);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3229);position.setTime(time.getTime());

            // GPS length and Satellites count
            __CLR4_5_22g72g7lx1di67y.R.inc(3230);int gpsLength = buf.readUnsignedByte();
            __CLR4_5_22g72g7lx1di67y.R.inc(3231);position.set(Event.KEY_SATELLITES, gpsLength & 0xf);
            __CLR4_5_22g72g7lx1di67y.R.inc(3232);gpsLength >>= 4;

            //Skip Satellite numbers
            __CLR4_5_22g72g7lx1di67y.R.inc(3233);buf.skipBytes(1);

            // Location
            __CLR4_5_22g72g7lx1di67y.R.inc(3234);double latitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_22g72g7lx1di67y.R.inc(3235);double longitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_22g72g7lx1di67y.R.inc(3236);position.setSpeed(buf.readUnsignedByte() * 1.0); // kph?

            // Course and flags
            __CLR4_5_22g72g7lx1di67y.R.inc(3237);int union = buf.readUnsignedShort();
            __CLR4_5_22g72g7lx1di67y.R.inc(3238);position.setCourse(union & 0x03FF);
            __CLR4_5_22g72g7lx1di67y.R.inc(3239);position.setValid((union & 0x1000) != 0);
            __CLR4_5_22g72g7lx1di67y.R.inc(3240);if (((((union & 0x0400) != 0)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3241)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3242)==0&false))) {__CLR4_5_22g72g7lx1di67y.R.inc(3243);latitude = -latitude;
            }__CLR4_5_22g72g7lx1di67y.R.inc(3244);if (((((union & 0x0800) != 0)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3245)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3246)==0&false))) {__CLR4_5_22g72g7lx1di67y.R.inc(3247);longitude = -longitude;

            }__CLR4_5_22g72g7lx1di67y.R.inc(3248);position.setLatitude(latitude);
            __CLR4_5_22g72g7lx1di67y.R.inc(3249);position.setLongitude(longitude);

            __CLR4_5_22g72g7lx1di67y.R.inc(3250);if (((((union & 0x4000) != 0)&&(__CLR4_5_22g72g7lx1di67y.R.iget(3251)!=0|true))||(__CLR4_5_22g72g7lx1di67y.R.iget(3252)==0&false))) {{
                __CLR4_5_22g72g7lx1di67y.R.inc(3253);position.set("acc", (union & 0x8000) != 0);
            }

            }__CLR4_5_22g72g7lx1di67y.R.inc(3254);position.set(Event.KEY_LAC, buf.readUnsignedShort());
            __CLR4_5_22g72g7lx1di67y.R.inc(3255);position.set(Event.KEY_CELL, buf.readUnsignedMedium());
            __CLR4_5_22g72g7lx1di67y.R.inc(3256);position.set(Event.KEY_ALARM, true);
            __CLR4_5_22g72g7lx1di67y.R.inc(3257);int flags = buf.readUnsignedByte();
            __CLR4_5_22g72g7lx1di67y.R.inc(3258);position.set("acc", (flags & 0x2) != 0);

            // TODO parse other flags

            __CLR4_5_22g72g7lx1di67y.R.inc(3259);position.set(Event.KEY_POWER, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3260);position.set(Event.KEY_GSM, buf.readUnsignedByte());
            __CLR4_5_22g72g7lx1di67y.R.inc(3261);return position;
        }

        }}}__CLR4_5_22g72g7lx1di67y.R.inc(3262);return null;
    }finally{__CLR4_5_22g72g7lx1di67y.R.flushNeeded();}}

}
