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
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Jt600ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24f44f4lx1dh45i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,5849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Jt600ProtocolDecoder(Jt600Protocol protocol) {
        super(protocol);__CLR4_5_24f44f4lx1dh45i.R.inc(5729);try{__CLR4_5_24f44f4lx1dh45i.R.inc(5728);
    }finally{__CLR4_5_24f44f4lx1dh45i.R.flushNeeded();}}

    private Position decodeNormalMessage(ChannelBuffer buf, Channel channel) throws Exception {try{__CLR4_5_24f44f4lx1dh45i.R.inc(5730);

        __CLR4_5_24f44f4lx1dh45i.R.inc(5731);Position position = new Position();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5732);position.setProtocol(getProtocolName());

        __CLR4_5_24f44f4lx1dh45i.R.inc(5733);buf.readByte(); // header

        // Get device by identifier
        __CLR4_5_24f44f4lx1dh45i.R.inc(5734);String id = Long.valueOf(ChannelBufferTools.readHexString(buf, 10)).toString();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5735);if ((((!identify(id, channel))&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5736)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5737)==0&false))) {{
            __CLR4_5_24f44f4lx1dh45i.R.inc(5738);return null;
        }
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5739);position.setDeviceId(getDeviceId());

        // Protocol and type
        __CLR4_5_24f44f4lx1dh45i.R.inc(5740);int version = ChannelBufferTools.readHexInteger(buf, 1);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5741);int type = buf.readUnsignedByte() & 0xf;

        __CLR4_5_24f44f4lx1dh45i.R.inc(5742);buf.readBytes(2); // length

        // Time
        __CLR4_5_24f44f4lx1dh45i.R.inc(5743);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5744);time.clear();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5745);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5746);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5747);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5748);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5749);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5750);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5751);position.setTime(time.getTime());

        // Coordinates
        __CLR4_5_24f44f4lx1dh45i.R.inc(5752);int temp = ChannelBufferTools.readHexInteger(buf, 8);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5753);double latitude = temp % 1000000;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5754);latitude /= 60 * 10000;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5755);latitude += temp / 1000000;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5756);temp = ChannelBufferTools.readHexInteger(buf, 9);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5757);double longitude = temp % 1000000;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5758);longitude /= 60 * 10000;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5759);longitude += temp / 1000000;

        // Flags
        __CLR4_5_24f44f4lx1dh45i.R.inc(5760);byte flags = buf.readByte();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5761);position.setValid((flags & 0x1) == 0x1);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5762);if (((((flags & 0x2) == 0)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5763)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5764)==0&false))) {__CLR4_5_24f44f4lx1dh45i.R.inc(5765);latitude = -latitude;
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5766);position.setLatitude(latitude);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5767);if (((((flags & 0x4) == 0)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5768)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5769)==0&false))) {__CLR4_5_24f44f4lx1dh45i.R.inc(5770);longitude = -longitude;
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5771);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24f44f4lx1dh45i.R.inc(5772);position.setSpeed(ChannelBufferTools.readHexInteger(buf, 2));

        // Course
        __CLR4_5_24f44f4lx1dh45i.R.inc(5773);position.setCourse(buf.readUnsignedByte() * 2.0);
        
        __CLR4_5_24f44f4lx1dh45i.R.inc(5774);if ((((version == 1)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5775)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5776)==0&false))) {{
            
            __CLR4_5_24f44f4lx1dh45i.R.inc(5777);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());

            // Power
            __CLR4_5_24f44f4lx1dh45i.R.inc(5778);position.set(Event.KEY_POWER, buf.readUnsignedByte());

            __CLR4_5_24f44f4lx1dh45i.R.inc(5779);buf.readByte(); // other flags and sensors

            // Altitude
            __CLR4_5_24f44f4lx1dh45i.R.inc(5780);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_24f44f4lx1dh45i.R.inc(5781);position.set(Event.KEY_CELL, buf.readUnsignedShort());
            __CLR4_5_24f44f4lx1dh45i.R.inc(5782);position.set(Event.KEY_LAC, buf.readUnsignedShort());
            __CLR4_5_24f44f4lx1dh45i.R.inc(5783);position.set(Event.KEY_GSM, buf.readUnsignedByte());

        } }else {__CLR4_5_24f44f4lx1dh45i.R.inc(5784);if ((((version == 2)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5785)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5786)==0&false))) {{

            __CLR4_5_24f44f4lx1dh45i.R.inc(5787);int fuel = buf.readUnsignedByte() << 8;

            __CLR4_5_24f44f4lx1dh45i.R.inc(5788);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_24f44f4lx1dh45i.R.inc(5789);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_24f44f4lx1dh45i.R.inc(5790);fuel += buf.readUnsignedByte();
            __CLR4_5_24f44f4lx1dh45i.R.inc(5791);position.set(Event.KEY_FUEL, fuel);

        }
        }}__CLR4_5_24f44f4lx1dh45i.R.inc(5792);return position;
    }finally{__CLR4_5_24f44f4lx1dh45i.R.flushNeeded();}}

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

    private Position decodeAlertMessage(ChannelBuffer buf, Channel channel) throws Exception {try{__CLR4_5_24f44f4lx1dh45i.R.inc(5793);

        __CLR4_5_24f44f4lx1dh45i.R.inc(5794);String message = buf.toString(Charset.defaultCharset());

        // Parse message
        __CLR4_5_24f44f4lx1dh45i.R.inc(5795);Matcher parser = pattern.matcher(message);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5796);if ((((!parser.matches())&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5797)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5798)==0&false))) {{
            __CLR4_5_24f44f4lx1dh45i.R.inc(5799);return null;
        }

        // Create new position
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5800);Position position = new Position();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5801);position.setProtocol(getProtocolName());
        __CLR4_5_24f44f4lx1dh45i.R.inc(5802);position.set(Event.KEY_ALARM, true);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5803);Integer index = 1;

        // Get device by identifier
        __CLR4_5_24f44f4lx1dh45i.R.inc(5804);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5805)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5806)==0&false))) {{
            __CLR4_5_24f44f4lx1dh45i.R.inc(5807);return null;
        }
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5808);position.setDeviceId(getDeviceId());

        // Longitude
        __CLR4_5_24f44f4lx1dh45i.R.inc(5809);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5810);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5811);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5812)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5813)==0&false))) {__CLR4_5_24f44f4lx1dh45i.R.inc(5814);longitude = -longitude;
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5815);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_24f44f4lx1dh45i.R.inc(5816);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5817);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5818);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5819)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5820)==0&false))) {__CLR4_5_24f44f4lx1dh45i.R.inc(5821);latitude = -latitude;
        }__CLR4_5_24f44f4lx1dh45i.R.inc(5822);position.setLatitude(latitude);

        // Validity
        __CLR4_5_24f44f4lx1dh45i.R.inc(5823);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Time
        __CLR4_5_24f44f4lx1dh45i.R.inc(5824);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5825);time.clear();
        __CLR4_5_24f44f4lx1dh45i.R.inc(5826);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5827);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24f44f4lx1dh45i.R.inc(5828);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5829);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5830);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5831);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5832);position.setTime(time.getTime());

        // Speed
        __CLR4_5_24f44f4lx1dh45i.R.inc(5833);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_24f44f4lx1dh45i.R.inc(5834);position.setCourse(Double.valueOf(parser.group(index++)));

        // Power
        __CLR4_5_24f44f4lx1dh45i.R.inc(5835);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));
        __CLR4_5_24f44f4lx1dh45i.R.inc(5836);return position;
    }finally{__CLR4_5_24f44f4lx1dh45i.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24f44f4lx1dh45i.R.inc(5837);

        __CLR4_5_24f44f4lx1dh45i.R.inc(5838);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_24f44f4lx1dh45i.R.inc(5839);char first = (char) buf.getByte(0);

        // Check message type
        __CLR4_5_24f44f4lx1dh45i.R.inc(5840);if ((((first == '$')&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5841)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5842)==0&false))) {{
            __CLR4_5_24f44f4lx1dh45i.R.inc(5843);return decodeNormalMessage(buf, channel);
        } }else {__CLR4_5_24f44f4lx1dh45i.R.inc(5844);if ((((first == '(')&&(__CLR4_5_24f44f4lx1dh45i.R.iget(5845)!=0|true))||(__CLR4_5_24f44f4lx1dh45i.R.iget(5846)==0&false))) {{
            __CLR4_5_24f44f4lx1dh45i.R.inc(5847);return decodeAlertMessage(buf, channel);
        }

        }}__CLR4_5_24f44f4lx1dh45i.R.inc(5848);return null;
    }finally{__CLR4_5_24f44f4lx1dh45i.R.flushNeeded();}}

}
