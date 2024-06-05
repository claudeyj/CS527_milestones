/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class TotemProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27vd7vdlx1e45aj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,10335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TotemProtocolDecoder(TotemProtocol protocol) {
        super(protocol);__CLR4_5_27vd7vdlx1e45aj.R.inc(10202);try{__CLR4_5_27vd7vdlx1e45aj.R.inc(10201);
    }finally{__CLR4_5_27vd7vdlx1e45aj.R.flushNeeded();}}

    private static final Pattern pattern1 = Pattern.compile(
            "\\$\\$" +                          // Header
            "\\p{XDigit}{2}" +                  // Length
            "(\\d+)\\|" +                       // IMEI
            "(..)" +                            // Alarm Type
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.\\d+," + // Time (HHMMSS.SS)
            "([AV])," +                         // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +                // Speed
            "(\\d+\\.?\\d*)?," +                // Course
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (DDMMYY)
            "[^\\*]+\\*\\p{XDigit}{2}\\|" +     // Checksum
            "\\d+\\.\\d+\\|" +                  // PDOP
            "(\\d+\\.\\d+)\\|" +                // HDOP
            "\\d+\\.\\d+\\|" +                  // VDOP
            "(\\d+)\\|" +                       // IO Status
            "\\d+\\|" +                         // Time
            "\\d" +                             // Charged
            "(\\d{3})" +                        // Battery
            "(\\d{4})\\|" +                     // External Power
            "(?:(\\d+)\\|)?" +                  // ADC
            "(\\p{XDigit}+)\\|" +               // Location Code
            "(\\d+)\\|" +                       // Temperature
            "(\\d+.\\d+)\\|" +                  // Odometer
            "\\d+\\|" +                         // Serial Number
            ".*\\|?" +
            "\\p{XDigit}{4}" +                  // Checksum
            "\r?\n?");

    private static final Pattern pattern2 = Pattern.compile(
            "\\$\\$" +                          // Header
            "\\p{XDigit}{2}" +                  // Length
            "(\\d+)\\|" +                       // IMEI
            "(..)" +                            // Alarm Type
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2})\\|" +     // Time (HHMMSS)
            "([AV])\\|" +                       // Validity
            "(\\d+)(\\d{2}\\.\\d+)\\|" +        // Latitude (DDMM.MMMM)
            "([NS])\\|" +
            "(\\d+)(\\d{2}\\.\\d+)\\|" +        // Longitude (DDDMM.MMMM)
            "([EW])\\|" +
            "(\\d+\\.\\d+)?\\|" +               // Speed
            "(\\d+)?\\|" +                      // Course
            "(\\d+\\.\\d+)\\|" +                // HDOP
            "(\\d+)\\|" +                       // IO Status
            "\\d" +                             // Charged
            "(\\d{2})" +                        // Battery
            "(\\d{2})\\|" +                     // External Power
            "(\\d+)\\|" +                       // ADC
            "(\\p{XDigit}{8})\\|" +             // Location Code
            "(\\d+)\\|" +                       // Temperature
            "(\\d+.\\d+)\\|" +                  // Odometer
            "\\d+\\|" +                         // Serial Number
            "\\p{XDigit}{4}" +                  // Checksum
            "\r?\n?");

    private static final Pattern pattern3 = Pattern.compile(
            "\\$\\$" +                          // Header
            "\\p{XDigit}{2}" +                  // Length
            "(\\d+)\\|" +                       // IMEI
            "(..)" +                            // Alarm Type
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})" +        // Time (HHMMSS)
            "(\\p{XDigit}{4})" +                // IO Status
            "[01]" +                            // Charging
            "(\\d{2})" +                        // Battery
            "(\\d{2})" +                        // External Power
            "(\\d{4})" +                        // ADC 1
            "(\\d{4})" +                        // ADC 2
            "(\\d{3})" +                        // Temperature 1
            "(\\d{3})" +                        // Temperature 2
            "(\\p{XDigit}{8})" +                // Location Code
            "([AV])" +                          // Validity
            "(\\d{2})" +                        // Satellites
            "(\\d{3})" +                        // Course
            "(\\d{3})" +                        // Speed
            "(\\d{2}\\.\\d)" +                  // PDOP
            "(\\d{7})" +                        // Odometer
            "(\\d{2})(\\d{2}\\.\\d{4})" +       // Latitude (DDMM.MMMM)
            "([NS])" +
            "(\\d{3})(\\d{2}\\.\\d{4})" +       // Longitude (DDDMM.MMMM)
            "([EW])" +
            "\\d{4}" +                          // Serial Number
            "\\p{XDigit}{4}" +                  // Checksum
            "\r?\n?");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27vd7vdlx1e45aj.R.inc(10203);

        __CLR4_5_27vd7vdlx1e45aj.R.inc(10204);String sentence = (String) msg;

        // Determine format
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10205);Pattern pattern = pattern3;
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10206);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10207)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10208)==0&false))) {{
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10209);pattern = pattern1;
        } }else {{
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10210);int index = sentence.indexOf('|');
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10211);if ((((index != -1 && sentence.indexOf('|', index + 1) != -1)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10212)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10213)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10214);pattern = pattern2;
            }
        }}

        // Parse message
        }__CLR4_5_27vd7vdlx1e45aj.R.inc(10215);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10216);if ((((!parser.matches())&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10217)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10218)==0&false))) {{
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10219);return null;
        }

        // Create new position
        }__CLR4_5_27vd7vdlx1e45aj.R.inc(10220);Position position = new Position();
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10221);position.setProtocol(getProtocolName());

        __CLR4_5_27vd7vdlx1e45aj.R.inc(10222);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10223);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10224)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10225)==0&false))) {{
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10226);return null;
        }
        }__CLR4_5_27vd7vdlx1e45aj.R.inc(10227);position.setDeviceId(getDeviceId());
        
        // Alarm type
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10228);position.set(Event.KEY_ALARM, parser.group(index++));
        
        __CLR4_5_27vd7vdlx1e45aj.R.inc(10229);if ((((pattern == pattern1 || pattern == pattern2)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10230)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10231)==0&false))) {{

            // Time
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10232);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10233);time.clear();
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10234);int year = 0;
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10235);if ((((pattern == pattern2)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10236)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10237)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10238);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10239);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10240);year = Integer.valueOf(parser.group(index++));
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10241);time.set(Calendar.YEAR, 2000 + year);
            }
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10242);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10243);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10244);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

            // Validity
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10245);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10246);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10247);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10248);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10249)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10250)==0&false))) {__CLR4_5_27vd7vdlx1e45aj.R.inc(10251);latitude = -latitude;
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10252);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10253);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10254);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10255);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10256)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10257)==0&false))) {__CLR4_5_27vd7vdlx1e45aj.R.inc(10258);longitude = -longitude;
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10259);position.setLongitude(longitude);

            // Speed
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10260);String speed = parser.group(index++);
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10261);if ((((speed != null)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10262)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10263)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10264);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10265);String course = parser.group(index++);
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10266);if ((((course != null)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10267)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10268)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10269);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10270);if ((((pattern == pattern1)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10271)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10272)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10273);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10274);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10275);year = Integer.valueOf(parser.group(index++));
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10276);time.set(Calendar.YEAR, 2000 + year);
            }
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10277);if ((((year == 0)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10278)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10279)==0&false))) {{
                __CLR4_5_27vd7vdlx1e45aj.R.inc(10280);return null; // ignore invalid data
            }
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10281);position.setTime(time.getTime());

            // Accuracy
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10282);position.set(Event.KEY_HDOP, parser.group(index++));

            // IO Status
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10283);position.set(Event.PREFIX_IO + 1, parser.group(index++));

            // Power
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10284);position.set(Event.KEY_BATTERY, parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10285);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

            // ADC
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10286);position.set(Event.PREFIX_ADC + 1, parser.group(index++));

            // Location Code
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10287);position.set(Event.KEY_LAC, parser.group(index++));

            // Temperature
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10288);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));

            // Odometer
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10289);position.set(Event.KEY_ODOMETER, parser.group(index++));
        
        } }else {__CLR4_5_27vd7vdlx1e45aj.R.inc(10290);if ((((pattern == pattern3)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10291)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10292)==0&false))) {{

            // Time
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10293);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10294);time.clear();
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10295);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10296);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10297);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10298);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10299);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10300);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10301);position.setTime(time.getTime());
            
            // IO Status
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10302);position.set(Event.PREFIX_IO + 1, parser.group(index++));

            // Power
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10303);position.set(Event.KEY_BATTERY, Double.valueOf(parser.group(index++)) / 10);
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10304);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

            // ADC
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10305);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10306);position.set(Event.PREFIX_ADC + 2, parser.group(index++));

            // Temperature
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10307);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10308);position.set(Event.PREFIX_TEMP + 2, parser.group(index++));

            // Location Code
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10309);position.set(Event.KEY_LAC, parser.group(index++));

            // Validity
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10310);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Satellites
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10311);position.set(Event.KEY_SATELLITES, parser.group(index++));

            // Course
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10312);position.setCourse(Double.valueOf(parser.group(index++)));

            // Speed
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10313);position.setSpeed(Double.valueOf(parser.group(index++)));

            // PDOP
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10314);position.set("pdop", parser.group(index++));

            // Odometer
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10315);position.set(Event.KEY_ODOMETER, parser.group(index++));

            // Latitude
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10316);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10317);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10318);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10319)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10320)==0&false))) {__CLR4_5_27vd7vdlx1e45aj.R.inc(10321);latitude = -latitude;
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10322);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10323);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10324);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10325);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10326)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10327)==0&false))) {__CLR4_5_27vd7vdlx1e45aj.R.inc(10328);longitude = -longitude;
            }__CLR4_5_27vd7vdlx1e45aj.R.inc(10329);position.setLongitude(longitude);
        
        }
        
        }}__CLR4_5_27vd7vdlx1e45aj.R.inc(10330);if ((((channel != null)&&(__CLR4_5_27vd7vdlx1e45aj.R.iget(10331)!=0|true))||(__CLR4_5_27vd7vdlx1e45aj.R.iget(10332)==0&false))) {{
            __CLR4_5_27vd7vdlx1e45aj.R.inc(10333);channel.write("ACK OK\r\n");
        }

        }__CLR4_5_27vd7vdlx1e45aj.R.inc(10334);return position;
    }finally{__CLR4_5_27vd7vdlx1e45aj.R.flushNeeded();}}

}
