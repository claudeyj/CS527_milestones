/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.nio.charset.Charset;
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Jt600ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24qu4qulx1e800r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,6271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Jt600ProtocolDecoder(Jt600Protocol protocol) {
        super(protocol);__CLR4_5_24qu4qulx1e800r.R.inc(6151);try{__CLR4_5_24qu4qulx1e800r.R.inc(6150);
    }finally{__CLR4_5_24qu4qulx1e800r.R.flushNeeded();}}

    private Position decodeNormalMessage(ChannelBuffer buf, Channel channel) {try{__CLR4_5_24qu4qulx1e800r.R.inc(6152);

        __CLR4_5_24qu4qulx1e800r.R.inc(6153);Position position = new Position();
        __CLR4_5_24qu4qulx1e800r.R.inc(6154);position.setProtocol(getProtocolName());

        __CLR4_5_24qu4qulx1e800r.R.inc(6155);buf.readByte(); // header

        // Get device by identifier
        __CLR4_5_24qu4qulx1e800r.R.inc(6156);String id = Long.valueOf(ChannelBufferTools.readHexString(buf, 10)).toString();
        __CLR4_5_24qu4qulx1e800r.R.inc(6157);if ((((!identify(id, channel))&&(__CLR4_5_24qu4qulx1e800r.R.iget(6158)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6159)==0&false))) {{
            __CLR4_5_24qu4qulx1e800r.R.inc(6160);return null;
        }
        }__CLR4_5_24qu4qulx1e800r.R.inc(6161);position.setDeviceId(getDeviceId());

        // Protocol and type
        __CLR4_5_24qu4qulx1e800r.R.inc(6162);int version = ChannelBufferTools.readHexInteger(buf, 1);
        __CLR4_5_24qu4qulx1e800r.R.inc(6163);int type = buf.readUnsignedByte() & 0xf;

        __CLR4_5_24qu4qulx1e800r.R.inc(6164);buf.readBytes(2); // length

        // Time
        __CLR4_5_24qu4qulx1e800r.R.inc(6165);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24qu4qulx1e800r.R.inc(6166);time.clear();
        __CLR4_5_24qu4qulx1e800r.R.inc(6167);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24qu4qulx1e800r.R.inc(6168);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
        __CLR4_5_24qu4qulx1e800r.R.inc(6169);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24qu4qulx1e800r.R.inc(6170);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24qu4qulx1e800r.R.inc(6171);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24qu4qulx1e800r.R.inc(6172);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24qu4qulx1e800r.R.inc(6173);position.setTime(time.getTime());

        // Coordinates
        __CLR4_5_24qu4qulx1e800r.R.inc(6174);int temp = ChannelBufferTools.readHexInteger(buf, 8);
        __CLR4_5_24qu4qulx1e800r.R.inc(6175);double latitude = temp % 1000000;
        __CLR4_5_24qu4qulx1e800r.R.inc(6176);latitude /= 60 * 10000;
        __CLR4_5_24qu4qulx1e800r.R.inc(6177);latitude += temp / 1000000;
        __CLR4_5_24qu4qulx1e800r.R.inc(6178);temp = ChannelBufferTools.readHexInteger(buf, 9);
        __CLR4_5_24qu4qulx1e800r.R.inc(6179);double longitude = temp % 1000000;
        __CLR4_5_24qu4qulx1e800r.R.inc(6180);longitude /= 60 * 10000;
        __CLR4_5_24qu4qulx1e800r.R.inc(6181);longitude += temp / 1000000;

        // Flags
        __CLR4_5_24qu4qulx1e800r.R.inc(6182);byte flags = buf.readByte();
        __CLR4_5_24qu4qulx1e800r.R.inc(6183);position.setValid((flags & 0x1) == 0x1);
        __CLR4_5_24qu4qulx1e800r.R.inc(6184);if (((((flags & 0x2) == 0)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6185)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6186)==0&false))) {__CLR4_5_24qu4qulx1e800r.R.inc(6187);latitude = -latitude;
        }__CLR4_5_24qu4qulx1e800r.R.inc(6188);position.setLatitude(latitude);
        __CLR4_5_24qu4qulx1e800r.R.inc(6189);if (((((flags & 0x4) == 0)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6190)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6191)==0&false))) {__CLR4_5_24qu4qulx1e800r.R.inc(6192);longitude = -longitude;
        }__CLR4_5_24qu4qulx1e800r.R.inc(6193);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24qu4qulx1e800r.R.inc(6194);position.setSpeed(ChannelBufferTools.readHexInteger(buf, 2));

        // Course
        __CLR4_5_24qu4qulx1e800r.R.inc(6195);position.setCourse(buf.readUnsignedByte() * 2.0);
        
        __CLR4_5_24qu4qulx1e800r.R.inc(6196);if ((((version == 1)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6197)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6198)==0&false))) {{
            
            __CLR4_5_24qu4qulx1e800r.R.inc(6199);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());

            // Power
            __CLR4_5_24qu4qulx1e800r.R.inc(6200);position.set(Event.KEY_POWER, buf.readUnsignedByte());

            __CLR4_5_24qu4qulx1e800r.R.inc(6201);buf.readByte(); // other flags and sensors

            // Altitude
            __CLR4_5_24qu4qulx1e800r.R.inc(6202);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_24qu4qulx1e800r.R.inc(6203);position.set(Event.KEY_CELL, buf.readUnsignedShort());
            __CLR4_5_24qu4qulx1e800r.R.inc(6204);position.set(Event.KEY_LAC, buf.readUnsignedShort());
            __CLR4_5_24qu4qulx1e800r.R.inc(6205);position.set(Event.KEY_GSM, buf.readUnsignedByte());

        } }else {__CLR4_5_24qu4qulx1e800r.R.inc(6206);if ((((version == 2)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6207)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6208)==0&false))) {{

            __CLR4_5_24qu4qulx1e800r.R.inc(6209);int fuel = buf.readUnsignedByte() << 8;

            __CLR4_5_24qu4qulx1e800r.R.inc(6210);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_24qu4qulx1e800r.R.inc(6211);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_24qu4qulx1e800r.R.inc(6212);fuel += buf.readUnsignedByte();
            __CLR4_5_24qu4qulx1e800r.R.inc(6213);position.set(Event.KEY_FUEL, fuel);

        }
        }}__CLR4_5_24qu4qulx1e800r.R.inc(6214);return position;
    }finally{__CLR4_5_24qu4qulx1e800r.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\(" +
            "([\\d]+)," +                // Id
            "W01," +                     // Type
            "(\\d{3})(\\d{2}.\\d{4})," + // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d{2})(\\d{2}.\\d{4})," + // Latitude (DDMM.MMMM)
            "([NS])," +
            "([AV])," +                  // Validity
            "(\\d{2})(\\d{2})(\\d{2})," + // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2})," + // Time (HHMMSS)
            "(\\d+)," +                  // Speed (km/h)
            "(\\d+)," +                  // Course
            "(\\d+)," +                  // Power
            "(\\d+)," +                  // GPS signal
            "(\\d+)," +                  // GSM signal
            "(\\d+)," +                  // Alert Type
            ".*\\)");

    private Position decodeAlertMessage(ChannelBuffer buf, Channel channel) {try{__CLR4_5_24qu4qulx1e800r.R.inc(6215);

        __CLR4_5_24qu4qulx1e800r.R.inc(6216);String message = buf.toString(Charset.defaultCharset());

        // Parse message
        __CLR4_5_24qu4qulx1e800r.R.inc(6217);Matcher parser = pattern.matcher(message);
        __CLR4_5_24qu4qulx1e800r.R.inc(6218);if ((((!parser.matches())&&(__CLR4_5_24qu4qulx1e800r.R.iget(6219)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6220)==0&false))) {{
            __CLR4_5_24qu4qulx1e800r.R.inc(6221);return null;
        }

        // Create new position
        }__CLR4_5_24qu4qulx1e800r.R.inc(6222);Position position = new Position();
        __CLR4_5_24qu4qulx1e800r.R.inc(6223);position.setProtocol(getProtocolName());
        __CLR4_5_24qu4qulx1e800r.R.inc(6224);position.set(Event.KEY_ALARM, true);
        __CLR4_5_24qu4qulx1e800r.R.inc(6225);Integer index = 1;

        // Get device by identifier
        __CLR4_5_24qu4qulx1e800r.R.inc(6226);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24qu4qulx1e800r.R.iget(6227)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6228)==0&false))) {{
            __CLR4_5_24qu4qulx1e800r.R.inc(6229);return null;
        }
        }__CLR4_5_24qu4qulx1e800r.R.inc(6230);position.setDeviceId(getDeviceId());

        // Longitude
        __CLR4_5_24qu4qulx1e800r.R.inc(6231);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24qu4qulx1e800r.R.inc(6232);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24qu4qulx1e800r.R.inc(6233);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6234)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6235)==0&false))) {__CLR4_5_24qu4qulx1e800r.R.inc(6236);longitude = -longitude;
        }__CLR4_5_24qu4qulx1e800r.R.inc(6237);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_24qu4qulx1e800r.R.inc(6238);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24qu4qulx1e800r.R.inc(6239);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24qu4qulx1e800r.R.inc(6240);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24qu4qulx1e800r.R.iget(6241)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6242)==0&false))) {__CLR4_5_24qu4qulx1e800r.R.inc(6243);latitude = -latitude;
        }__CLR4_5_24qu4qulx1e800r.R.inc(6244);position.setLatitude(latitude);

        // Validity
        __CLR4_5_24qu4qulx1e800r.R.inc(6245);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Time
        __CLR4_5_24qu4qulx1e800r.R.inc(6246);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24qu4qulx1e800r.R.inc(6247);time.clear();
        __CLR4_5_24qu4qulx1e800r.R.inc(6248);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6249);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24qu4qulx1e800r.R.inc(6250);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6251);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6252);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6253);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6254);position.setTime(time.getTime());

        // Speed
        __CLR4_5_24qu4qulx1e800r.R.inc(6255);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_24qu4qulx1e800r.R.inc(6256);position.setCourse(Double.valueOf(parser.group(index++)));

        // Power
        __CLR4_5_24qu4qulx1e800r.R.inc(6257);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));
        __CLR4_5_24qu4qulx1e800r.R.inc(6258);return position;
    }finally{__CLR4_5_24qu4qulx1e800r.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24qu4qulx1e800r.R.inc(6259);

        __CLR4_5_24qu4qulx1e800r.R.inc(6260);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_24qu4qulx1e800r.R.inc(6261);char first = (char) buf.getByte(0);

        // Check message type
        __CLR4_5_24qu4qulx1e800r.R.inc(6262);if ((((first == '$')&&(__CLR4_5_24qu4qulx1e800r.R.iget(6263)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6264)==0&false))) {{
            __CLR4_5_24qu4qulx1e800r.R.inc(6265);return decodeNormalMessage(buf, channel);
        } }else {__CLR4_5_24qu4qulx1e800r.R.inc(6266);if ((((first == '(')&&(__CLR4_5_24qu4qulx1e800r.R.iget(6267)!=0|true))||(__CLR4_5_24qu4qulx1e800r.R.iget(6268)==0&false))) {{
            __CLR4_5_24qu4qulx1e800r.R.inc(6269);return decodeAlertMessage(buf, channel);
        }

        }}__CLR4_5_24qu4qulx1e800r.R.inc(6270);return null;
    }finally{__CLR4_5_24qu4qulx1e800r.R.flushNeeded();}}

}
