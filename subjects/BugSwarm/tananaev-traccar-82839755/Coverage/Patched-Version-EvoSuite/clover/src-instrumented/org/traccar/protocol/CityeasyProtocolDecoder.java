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
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.Crc;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CityeasyProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_235y35ylx1e67fh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,4164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CityeasyProtocolDecoder(CityeasyProtocol protocol) {
        super(protocol);__CLR4_5_235y35ylx1e67fh.R.inc(4103);try{__CLR4_5_235y35ylx1e67fh.R.inc(4102);
    }finally{__CLR4_5_235y35ylx1e67fh.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(\\d{4})(\\d{2})(\\d{2})" +        // Date
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time
            "([AV])," +                         // Validity
            "(\\d+)," +                         // Satellites
            "([NS]),(\\d+\\.\\d+)," +           // Latitude
            "([EW]),(\\d+\\.\\d+)," +           // Longitude
            "(\\d+\\.\\d)," +                   // Speed
            "(\\d+\\.\\d)," +                   // HDOP
            "(\\d+\\.\\d);" +                   // Altitude
            "(\\d+)," +                         // MCC
            "(\\d+)," +                         // MNC
            "(\\d+)," +                         // LAC
            "(\\d+)" +                          // Cell
            ".*");

    private static final int MSG_LOCATION_REPORT = 0x0003;
    private static final int MSG_LOCATION_INQUIRY_RESPONSE = 0x0004;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_235y35ylx1e67fh.R.inc(4104);

        __CLR4_5_235y35ylx1e67fh.R.inc(4105);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_235y35ylx1e67fh.R.inc(4106);buf.skipBytes(2); // header
        __CLR4_5_235y35ylx1e67fh.R.inc(4107);buf.readUnsignedShort(); // length

        __CLR4_5_235y35ylx1e67fh.R.inc(4108);String imei = ChannelBufferTools.readHexString(buf, 14);
        __CLR4_5_235y35ylx1e67fh.R.inc(4109);if ((((!identify(imei, channel, null, false))&&(__CLR4_5_235y35ylx1e67fh.R.iget(4110)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4111)==0&false))) {{
            __CLR4_5_235y35ylx1e67fh.R.inc(4112);if ((((!identify(imei + Crc.luhnChecksum(Long.valueOf(imei)), channel))&&(__CLR4_5_235y35ylx1e67fh.R.iget(4113)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4114)==0&false))) {{
                __CLR4_5_235y35ylx1e67fh.R.inc(4115);return null;
            }
        }}

        }__CLR4_5_235y35ylx1e67fh.R.inc(4116);int type = buf.readUnsignedShort();

        __CLR4_5_235y35ylx1e67fh.R.inc(4117);if ((((type == MSG_LOCATION_REPORT || type == MSG_LOCATION_INQUIRY_RESPONSE)&&(__CLR4_5_235y35ylx1e67fh.R.iget(4118)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4119)==0&false))) {{

            __CLR4_5_235y35ylx1e67fh.R.inc(4120);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 8, Charset.defaultCharset());
            __CLR4_5_235y35ylx1e67fh.R.inc(4121);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_235y35ylx1e67fh.R.inc(4122);if ((((!parser.matches())&&(__CLR4_5_235y35ylx1e67fh.R.iget(4123)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4124)==0&false))) {{
                __CLR4_5_235y35ylx1e67fh.R.inc(4125);return null;
            }

            }__CLR4_5_235y35ylx1e67fh.R.inc(4126);Position position = new Position();
            __CLR4_5_235y35ylx1e67fh.R.inc(4127);position.setProtocol(getProtocolName());
            __CLR4_5_235y35ylx1e67fh.R.inc(4128);position.setDeviceId(getDeviceId());

            __CLR4_5_235y35ylx1e67fh.R.inc(4129);Integer index = 1;

            // Date and time
            __CLR4_5_235y35ylx1e67fh.R.inc(4130);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_235y35ylx1e67fh.R.inc(4131);time.clear();
            __CLR4_5_235y35ylx1e67fh.R.inc(4132);time.set(Calendar.YEAR, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4133);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
            __CLR4_5_235y35ylx1e67fh.R.inc(4134);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4135);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4136);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4137);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4138);position.setTime(time.getTime());

            __CLR4_5_235y35ylx1e67fh.R.inc(4139);position.setValid(parser.group(index++).equals("A"));
            __CLR4_5_235y35ylx1e67fh.R.inc(4140);position.set(Event.KEY_SATELLITES, parser.group(index++));

            // Latitude
            __CLR4_5_235y35ylx1e67fh.R.inc(4141);String hemisphere = parser.group(index++);
            __CLR4_5_235y35ylx1e67fh.R.inc(4142);double latitude = Double.parseDouble(parser.group(index++));
            __CLR4_5_235y35ylx1e67fh.R.inc(4143);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_235y35ylx1e67fh.R.iget(4144)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4145)==0&false))) {{
                __CLR4_5_235y35ylx1e67fh.R.inc(4146);latitude = -latitude;
            }
            }__CLR4_5_235y35ylx1e67fh.R.inc(4147);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_235y35ylx1e67fh.R.inc(4148);hemisphere = parser.group(index++);
            __CLR4_5_235y35ylx1e67fh.R.inc(4149);double longitude = Double.parseDouble(parser.group(index++));
            __CLR4_5_235y35ylx1e67fh.R.inc(4150);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_235y35ylx1e67fh.R.iget(4151)!=0|true))||(__CLR4_5_235y35ylx1e67fh.R.iget(4152)==0&false))) {{
                __CLR4_5_235y35ylx1e67fh.R.inc(4153);longitude = -longitude;
            }
            }__CLR4_5_235y35ylx1e67fh.R.inc(4154);position.setLongitude(longitude);

            __CLR4_5_235y35ylx1e67fh.R.inc(4155);position.setSpeed(Double.parseDouble(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4156);position.set(Event.KEY_HDOP, Double.parseDouble(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4157);position.setAltitude(Double.parseDouble(parser.group(index++)));

            __CLR4_5_235y35ylx1e67fh.R.inc(4158);position.set(Event.KEY_MCC, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4159);position.set(Event.KEY_MNC, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4160);position.set(Event.KEY_LAC, Integer.parseInt(parser.group(index++)));
            __CLR4_5_235y35ylx1e67fh.R.inc(4161);position.set(Event.KEY_CELL, Integer.parseInt(parser.group(index++)));

            __CLR4_5_235y35ylx1e67fh.R.inc(4162);return position;
        }

        }__CLR4_5_235y35ylx1e67fh.R.inc(4163);return null;
    }finally{__CLR4_5_235y35ylx1e67fh.R.flushNeeded();}}

}
