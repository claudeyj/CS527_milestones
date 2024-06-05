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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class TotemProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27dp7dplx1dlpy2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,9707,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TotemProtocolDecoder(TotemProtocol protocol) {
        super(protocol);__CLR4_5_27dp7dplx1dlpy2.R.inc(9566);try{__CLR4_5_27dp7dplx1dlpy2.R.inc(9565);
    }finally{__CLR4_5_27dp7dplx1dlpy2.R.flushNeeded();}}

    private static final Pattern patternFirst = Pattern.compile(
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
            "(\\p{XDigit}{8})\\|" +             // Location Code
            "(\\d+)\\|" +                       // Temperature
            "(\\d+.\\d+)\\|" +                  // Odometer
            "\\d+\\|" +                         // Serial Number
            ".*\\|?" +
            "\\p{XDigit}{4}");                  // Checksum
            
    private static final Pattern patternSecond = Pattern.compile(
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
            "\\p{XDigit}{4}");                  // Checksum

    private static final Pattern patternThird = Pattern.compile(
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
            "\\p{XDigit}{4}");                  // Checksum

    private enum MessageFormat {
        first,
        second,
        third
    }
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_27dp7dplx1dlpy2.R.inc(9567);
        
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9568);String sentence = (String) msg;

        // Determine format
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9569);MessageFormat format = MessageFormat.third;
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9570);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9571)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9572)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9573);format = MessageFormat.first;
        } }else {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9574);int index = sentence.indexOf('|');
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9575);if ((((index != -1 && sentence.indexOf('|', index + 1) != -1)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9576)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9577)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9578);format = MessageFormat.second;
            }
        }}

        // Parse message
        }__CLR4_5_27dp7dplx1dlpy2.R.inc(9579);Matcher parser = null;
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9580);if ((((format == MessageFormat.first)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9581)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9582)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9583);parser = patternFirst.matcher(sentence);
        } }else {__CLR4_5_27dp7dplx1dlpy2.R.inc(9584);if ((((format == MessageFormat.second)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9585)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9586)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9587);parser = patternSecond.matcher(sentence);
        } }else {__CLR4_5_27dp7dplx1dlpy2.R.inc(9588);if ((((format == MessageFormat.third)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9589)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9590)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9591);parser = patternThird.matcher(sentence);
        }
        }}}__CLR4_5_27dp7dplx1dlpy2.R.inc(9592);if ((((!parser.matches())&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9593)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9594)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9595);return null;
        }

        // Create new position
        }__CLR4_5_27dp7dplx1dlpy2.R.inc(9596);Position position = new Position();
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9597);position.setProtocol(getProtocolName());

        __CLR4_5_27dp7dplx1dlpy2.R.inc(9598);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9599);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9600)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9601)==0&false))) {{
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9602);return null;
        }
        }__CLR4_5_27dp7dplx1dlpy2.R.inc(9603);position.setDeviceId(getDeviceId());
        
        // Alarm type
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9604);position.set(Event.KEY_ALARM, parser.group(index++));
        
        __CLR4_5_27dp7dplx1dlpy2.R.inc(9605);if ((((format == MessageFormat.first || format == MessageFormat.second)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9606)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9607)==0&false))) {{

            // Time
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9608);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9609);time.clear();
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9610);int year = 0;
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9611);if ((((format == MessageFormat.second)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9612)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9613)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9614);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9615);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9616);year = Integer.valueOf(parser.group(index++));
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9617);time.set(Calendar.YEAR, 2000 + year);
            }
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9618);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9619);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9620);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

            // Validity
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9621);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9622);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9623);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9624);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9625)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9626)==0&false))) {__CLR4_5_27dp7dplx1dlpy2.R.inc(9627);latitude = -latitude;
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9628);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9629);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9630);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9631);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9632)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9633)==0&false))) {__CLR4_5_27dp7dplx1dlpy2.R.inc(9634);longitude = -longitude;
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9635);position.setLongitude(longitude);

            // Speed
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9636);String speed = parser.group(index++);
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9637);if ((((speed != null)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9638)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9639)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9640);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9641);String course = parser.group(index++);
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9642);if ((((course != null)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9643)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9644)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9645);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9646);if ((((format == MessageFormat.first)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9647)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9648)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9649);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9650);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9651);year = Integer.valueOf(parser.group(index++));
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9652);time.set(Calendar.YEAR, 2000 + year);
            }
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9653);if ((((year == 0)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9654)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9655)==0&false))) {{
                __CLR4_5_27dp7dplx1dlpy2.R.inc(9656);return null; // ignore invalid data
            }
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9657);position.setTime(time.getTime());

            // Accuracy
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9658);position.set(Event.KEY_HDOP, parser.group(index++));

            // IO Status
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9659);position.set(Event.PREFIX_IO + 1, parser.group(index++));

            // Power
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9660);position.set(Event.KEY_BATTERY, parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9661);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

            // ADC
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9662);position.set(Event.PREFIX_ADC + 1, parser.group(index++));

            // Location Code
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9663);position.set(Event.KEY_LAC, parser.group(index++));

            // Temperature
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9664);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));

            // Odometer
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9665);position.set(Event.KEY_ODOMETER, parser.group(index++));
        
        } }else {__CLR4_5_27dp7dplx1dlpy2.R.inc(9666);if ((((format == MessageFormat.third)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9667)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9668)==0&false))) {{

            // Time
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9669);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9670);time.clear();
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9671);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9672);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9673);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9674);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9675);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9676);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9677);position.setTime(time.getTime());
            
            // IO Status
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9678);position.set(Event.PREFIX_IO + 1, parser.group(index++));

            // Power
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9679);position.set(Event.KEY_BATTERY, Double.valueOf(parser.group(index++)) / 10);
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9680);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

            // ADC
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9681);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9682);position.set(Event.PREFIX_ADC + 2, parser.group(index++));

            // Temperature
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9683);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9684);position.set(Event.PREFIX_TEMP + 2, parser.group(index++));

            // Location Code
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9685);position.set(Event.KEY_LAC, parser.group(index++));

            // Validity
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9686);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Satellites
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9687);position.set(Event.KEY_SATELLITES, parser.group(index++));

            // Course
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9688);position.setCourse(Double.valueOf(parser.group(index++)));

            // Speed
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9689);position.setSpeed(Double.valueOf(parser.group(index++)));

            // PDOP
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9690);position.set("pdop", parser.group(index++));

            // Odometer
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9691);position.set(Event.KEY_ODOMETER, parser.group(index++));

            // Latitude
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9692);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9693);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9694);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9695)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9696)==0&false))) {__CLR4_5_27dp7dplx1dlpy2.R.inc(9697);latitude = -latitude;
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9698);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9699);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9700);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27dp7dplx1dlpy2.R.inc(9701);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27dp7dplx1dlpy2.R.iget(9702)!=0|true))||(__CLR4_5_27dp7dplx1dlpy2.R.iget(9703)==0&false))) {__CLR4_5_27dp7dplx1dlpy2.R.inc(9704);longitude = -longitude;
            }__CLR4_5_27dp7dplx1dlpy2.R.inc(9705);position.setLongitude(longitude);
        
        }

        }}__CLR4_5_27dp7dplx1dlpy2.R.inc(9706);return position;
    }finally{__CLR4_5_27dp7dplx1dlpy2.R.flushNeeded();}}

}
