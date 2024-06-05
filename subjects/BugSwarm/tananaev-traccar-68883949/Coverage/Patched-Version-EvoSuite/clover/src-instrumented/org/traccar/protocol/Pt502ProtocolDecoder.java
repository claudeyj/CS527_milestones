/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
 *                       Luis Parada (luis.parada@gmail.com)
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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Pt502ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26be6belx1doald{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,8260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Pt502ProtocolDecoder(Pt502Protocol protocol) {
        super(protocol);__CLR4_5_26be6belx1doald.R.inc(8187);try{__CLR4_5_26be6belx1doald.R.inc(8186);
    }finally{__CLR4_5_26be6belx1doald.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            ".*" +
            "\\$[A-Z]{3}\\d?," +                // Type
            "(\\d+)," +                         // Id
            "(\\d{2})(\\d{2})(\\d{2})\\.(\\d{3})," + // Time (HHMMSS.SSS)
            "([AV])," +                         // Validity
            "(\\d{2})(\\d{2}\\.\\d{4})," +      // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d{4})," +      // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)?," +                 // Speed
            "(\\d+\\.\\d+)?," +                 // Course
            "(\\d{2})(\\d{2})(\\d{2}),,," +     // Date
            "./" +
            "([01])+," +                        // Input
            "([01])+/" +                        // Output
            "([^/]+)/" +                        // ADC
            "(\\d+)" +                          // Odometer
            "(?:/([^/]+)?/" +                   // RFID
            "(\\p{XDigit}{3}))?" +              // State
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26be6belx1doald.R.inc(8188);

        __CLR4_5_26be6belx1doald.R.inc(8189);String sentence = (String) msg;

        // Parse message
        __CLR4_5_26be6belx1doald.R.inc(8190);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_26be6belx1doald.R.inc(8191);if ((((!parser.matches())&&(__CLR4_5_26be6belx1doald.R.iget(8192)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8193)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8194);return null;
        }

        // Create new position
        }__CLR4_5_26be6belx1doald.R.inc(8195);Position position = new Position();
        __CLR4_5_26be6belx1doald.R.inc(8196);position.setProtocol(getProtocolName());

        __CLR4_5_26be6belx1doald.R.inc(8197);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_26be6belx1doald.R.inc(8198);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_26be6belx1doald.R.iget(8199)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8200)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8201);return null;
        }
        }__CLR4_5_26be6belx1doald.R.inc(8202);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_26be6belx1doald.R.inc(8203);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26be6belx1doald.R.inc(8204);time.clear();
        __CLR4_5_26be6belx1doald.R.inc(8205);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26be6belx1doald.R.inc(8206);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26be6belx1doald.R.inc(8207);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26be6belx1doald.R.inc(8208);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_26be6belx1doald.R.inc(8209);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_26be6belx1doald.R.inc(8210);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26be6belx1doald.R.inc(8211);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26be6belx1doald.R.inc(8212);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26be6belx1doald.R.iget(8213)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8214)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8215);latitude = -latitude;
        }
        }__CLR4_5_26be6belx1doald.R.inc(8216);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_26be6belx1doald.R.inc(8217);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26be6belx1doald.R.inc(8218);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26be6belx1doald.R.inc(8219);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26be6belx1doald.R.iget(8220)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8221)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8222);longitude = -longitude;
        }
        }__CLR4_5_26be6belx1doald.R.inc(8223);position.setLongitude(longitude);

        // Speed
        __CLR4_5_26be6belx1doald.R.inc(8224);String speed = parser.group(index++);
        __CLR4_5_26be6belx1doald.R.inc(8225);if ((((speed != null)&&(__CLR4_5_26be6belx1doald.R.iget(8226)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8227)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8228);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_26be6belx1doald.R.inc(8229);String course = parser.group(index++);
        __CLR4_5_26be6belx1doald.R.inc(8230);if ((((course != null)&&(__CLR4_5_26be6belx1doald.R.iget(8231)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8232)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8233);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_26be6belx1doald.R.inc(8234);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26be6belx1doald.R.inc(8235);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_26be6belx1doald.R.inc(8236);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_26be6belx1doald.R.inc(8237);position.setTime(time.getTime());

        // IO
        __CLR4_5_26be6belx1doald.R.inc(8238);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_26be6belx1doald.R.inc(8239);position.set(Event.KEY_OUTPUT, parser.group(index++));

        // ADC
        __CLR4_5_26be6belx1doald.R.inc(8240);String adc = parser.group(index++);
        __CLR4_5_26be6belx1doald.R.inc(8241);if ((((adc != null)&&(__CLR4_5_26be6belx1doald.R.iget(8242)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8243)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8244);String[] values = adc.split(",");
            __CLR4_5_26be6belx1doald.R.inc(8245);for (int i = 0; (((i < values.length)&&(__CLR4_5_26be6belx1doald.R.iget(8246)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8247)==0&false)); i++) {{
                __CLR4_5_26be6belx1doald.R.inc(8248);position.set(Event.PREFIX_ADC + (i + 1), Integer.parseInt(values[i], 16));
            }
        }}

        }__CLR4_5_26be6belx1doald.R.inc(8249);position.set(Event.KEY_ODOMETER, parser.group(index++));

        // Driver
        __CLR4_5_26be6belx1doald.R.inc(8250);position.set(Event.KEY_RFID, parser.group(index++));

        // Other
        __CLR4_5_26be6belx1doald.R.inc(8251);String status = parser.group(index++);
        __CLR4_5_26be6belx1doald.R.inc(8252);if ((((status != null)&&(__CLR4_5_26be6belx1doald.R.iget(8253)!=0|true))||(__CLR4_5_26be6belx1doald.R.iget(8254)==0&false))) {{
            __CLR4_5_26be6belx1doald.R.inc(8255);int value = Integer.parseInt(status, 16);
            __CLR4_5_26be6belx1doald.R.inc(8256);position.set(Event.KEY_BATTERY, value >> 8);
            __CLR4_5_26be6belx1doald.R.inc(8257);position.set(Event.KEY_GSM, (value >> 4) & 0xf);
            __CLR4_5_26be6belx1doald.R.inc(8258);position.set(Event.KEY_SATELLITES, value & 0xf);
        }

        }__CLR4_5_26be6belx1doald.R.inc(8259);return position;
    }finally{__CLR4_5_26be6belx1doald.R.flushNeeded();}}
}
