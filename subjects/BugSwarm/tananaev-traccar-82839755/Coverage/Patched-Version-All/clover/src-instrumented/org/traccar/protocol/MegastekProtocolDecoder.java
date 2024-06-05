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

public class MegastekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2558558lx1e803n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,6896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MegastekProtocolDecoder(MegastekProtocol protocol) {
        super(protocol);__CLR4_5_2558558lx1e803n.R.inc(6669);try{__CLR4_5_2558558lx1e803n.R.inc(6668);
    }finally{__CLR4_5_2558558lx1e803n.R.flushNeeded();}}

    private static final Pattern patternGPRMC = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.\\d+," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +     // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +     // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)?," +            // Speed
            "(\\d+\\.\\d+)?," +            // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".*");                         // Checksum

    private static final Pattern patternSimple = Pattern.compile(
            "[FL]," +                      // Flag
            "([^,]*)," +                   // Alarm
            "imei:(\\d+)," +               // IMEI
            "(\\d+/?\\d*)?," +             // Satellites
            "(\\d+\\.\\d+)?," +            // Altitude
            "Battery=(\\d+)%,," +          // Battery
            "(\\d)?," +                    // Charger
            "(\\d+)?," +                   // MCC
            "(\\d+)?," +                   // MNC
            "(\\p{XDigit}{4},\\p{XDigit}{4});" + // Location code
            ".+");                         // Checksum

    private static final Pattern patternAlternative = Pattern.compile(
            "(\\d+)," +                    // MCC
            "(\\d+)," +                    // MNC
            "(\\p{XDigit}{4},\\p{XDigit}{4})," + // Location code
            "(\\d+)," +                    // GSM signal
            "(\\d+)," +                    // Battery
            "(\\d+)," +                    // Flags
            "(\\d+)," +                    // Inputs
            "(?:(\\d+),)?" +               // Outputs
            "(\\d\\.?\\d*)," +             // ADC 1
            "(?:(\\d\\.\\d{2})," +         // ADC 2
            "(\\d\\.\\d{2}),)?" +          // ADC 3
            "([^;]+);" +                   // Alarm
            ".*");                         // Checksum

    private boolean parseGPRMC(String gprmc, Position position) {try{__CLR4_5_2558558lx1e803n.R.inc(6670);
        
        // Parse message
        __CLR4_5_2558558lx1e803n.R.inc(6671);Matcher parser = patternGPRMC.matcher(gprmc);
        __CLR4_5_2558558lx1e803n.R.inc(6672);if ((((!parser.matches())&&(__CLR4_5_2558558lx1e803n.R.iget(6673)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6674)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6675);return false;
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6676);int index = 1;

        // Time
        __CLR4_5_2558558lx1e803n.R.inc(6677);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2558558lx1e803n.R.inc(6678);time.clear();
        __CLR4_5_2558558lx1e803n.R.inc(6679);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6680);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6681);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_2558558lx1e803n.R.inc(6682);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_2558558lx1e803n.R.inc(6683);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2558558lx1e803n.R.inc(6684);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2558558lx1e803n.R.inc(6685);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2558558lx1e803n.R.iget(6686)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6687)==0&false))) {__CLR4_5_2558558lx1e803n.R.inc(6688);latitude = -latitude;
        }__CLR4_5_2558558lx1e803n.R.inc(6689);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2558558lx1e803n.R.inc(6690);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2558558lx1e803n.R.inc(6691);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2558558lx1e803n.R.inc(6692);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2558558lx1e803n.R.iget(6693)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6694)==0&false))) {__CLR4_5_2558558lx1e803n.R.inc(6695);longitude = -longitude;
        }__CLR4_5_2558558lx1e803n.R.inc(6696);position.setLongitude(longitude);

        // Speed
        __CLR4_5_2558558lx1e803n.R.inc(6697);String speed = parser.group(index++);
        __CLR4_5_2558558lx1e803n.R.inc(6698);if ((((speed != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6699)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6700)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6701);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_2558558lx1e803n.R.inc(6702);String course = parser.group(index++);
        __CLR4_5_2558558lx1e803n.R.inc(6703);if ((((course != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6704)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6705)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6706);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_2558558lx1e803n.R.inc(6707);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6708);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2558558lx1e803n.R.inc(6709);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6710);position.setTime(time.getTime());        

        __CLR4_5_2558558lx1e803n.R.inc(6711);return true;
    }finally{__CLR4_5_2558558lx1e803n.R.flushNeeded();}}

    private Position decodeOld(Channel channel, String sentence) {try{__CLR4_5_2558558lx1e803n.R.inc(6712);

        // Detect type
        __CLR4_5_2558558lx1e803n.R.inc(6713);boolean simple = (sentence.charAt(3) == ',' || sentence.charAt(6) == ',');

        // Split message
        __CLR4_5_2558558lx1e803n.R.inc(6714);String id;
        __CLR4_5_2558558lx1e803n.R.inc(6715);String gprmc;
        __CLR4_5_2558558lx1e803n.R.inc(6716);String status;
        __CLR4_5_2558558lx1e803n.R.inc(6717);if ((((simple)&&(__CLR4_5_2558558lx1e803n.R.iget(6718)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6719)==0&false))) {{

            __CLR4_5_2558558lx1e803n.R.inc(6720);int beginIndex = sentence.indexOf(',') + 1;
            __CLR4_5_2558558lx1e803n.R.inc(6721);int endIndex = sentence.indexOf(',', beginIndex);
            __CLR4_5_2558558lx1e803n.R.inc(6722);id = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2558558lx1e803n.R.inc(6723);beginIndex = endIndex + 1;
            __CLR4_5_2558558lx1e803n.R.inc(6724);endIndex = sentence.indexOf('*', beginIndex);
            __CLR4_5_2558558lx1e803n.R.inc(6725);if ((((endIndex != -1)&&(__CLR4_5_2558558lx1e803n.R.iget(6726)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6727)==0&false))) {{
                __CLR4_5_2558558lx1e803n.R.inc(6728);endIndex += 3;
            } }else {{
                __CLR4_5_2558558lx1e803n.R.inc(6729);endIndex = sentence.length();
            }
            }__CLR4_5_2558558lx1e803n.R.inc(6730);gprmc = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2558558lx1e803n.R.inc(6731);beginIndex = endIndex + 1;
            __CLR4_5_2558558lx1e803n.R.inc(6732);if ((((beginIndex > sentence.length())&&(__CLR4_5_2558558lx1e803n.R.iget(6733)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6734)==0&false))) {{
                __CLR4_5_2558558lx1e803n.R.inc(6735);beginIndex = endIndex;
            }
            }__CLR4_5_2558558lx1e803n.R.inc(6736);status = sentence.substring(beginIndex);

        } }else {{

            __CLR4_5_2558558lx1e803n.R.inc(6737);int beginIndex = 3;
            __CLR4_5_2558558lx1e803n.R.inc(6738);int endIndex = beginIndex + 16;
            __CLR4_5_2558558lx1e803n.R.inc(6739);id = sentence.substring(beginIndex, endIndex).trim();

            __CLR4_5_2558558lx1e803n.R.inc(6740);beginIndex = endIndex + 2;
            __CLR4_5_2558558lx1e803n.R.inc(6741);endIndex = sentence.indexOf('*', beginIndex) + 3;
            __CLR4_5_2558558lx1e803n.R.inc(6742);gprmc = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2558558lx1e803n.R.inc(6743);beginIndex = endIndex + 1;
            __CLR4_5_2558558lx1e803n.R.inc(6744);status = sentence.substring(beginIndex);

        }

        // Create new position
        }__CLR4_5_2558558lx1e803n.R.inc(6745);Position position = new Position();
        __CLR4_5_2558558lx1e803n.R.inc(6746);position.setProtocol(getProtocolName());

        // Parse location data
        __CLR4_5_2558558lx1e803n.R.inc(6747);if ((((!parseGPRMC(gprmc, position))&&(__CLR4_5_2558558lx1e803n.R.iget(6748)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6749)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6750);return null;
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6751);if ((((simple)&&(__CLR4_5_2558558lx1e803n.R.iget(6752)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6753)==0&false))) {{

            __CLR4_5_2558558lx1e803n.R.inc(6754);Matcher parser = patternSimple.matcher(status);
            __CLR4_5_2558558lx1e803n.R.inc(6755);if ((((parser.matches())&&(__CLR4_5_2558558lx1e803n.R.iget(6756)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6757)==0&false))) {{

                __CLR4_5_2558558lx1e803n.R.inc(6758);int index = 1;

                __CLR4_5_2558558lx1e803n.R.inc(6759);position.set(Event.KEY_ALARM, parser.group(index++));

                // IMEI
                __CLR4_5_2558558lx1e803n.R.inc(6760);if ((((!identify(parser.group(index++), channel, null, false))&&(__CLR4_5_2558558lx1e803n.R.iget(6761)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6762)==0&false))) {{
                    __CLR4_5_2558558lx1e803n.R.inc(6763);if ((((!identify(id, channel))&&(__CLR4_5_2558558lx1e803n.R.iget(6764)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6765)==0&false))) {{
                        __CLR4_5_2558558lx1e803n.R.inc(6766);return null;
                    }
                }}
                }__CLR4_5_2558558lx1e803n.R.inc(6767);position.setDeviceId(getDeviceId());

                __CLR4_5_2558558lx1e803n.R.inc(6768);position.set(Event.KEY_SATELLITES, parser.group(index++));

                __CLR4_5_2558558lx1e803n.R.inc(6769);String altitude = parser.group(index++);
                __CLR4_5_2558558lx1e803n.R.inc(6770);if ((((altitude != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6771)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6772)==0&false))) {{
                    __CLR4_5_2558558lx1e803n.R.inc(6773);position.setAltitude(Double.valueOf(altitude));
                }

                }__CLR4_5_2558558lx1e803n.R.inc(6774);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

                __CLR4_5_2558558lx1e803n.R.inc(6775);String charger = parser.group(index++);
                __CLR4_5_2558558lx1e803n.R.inc(6776);if ((((charger != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6777)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6778)==0&false))) {{
                    __CLR4_5_2558558lx1e803n.R.inc(6779);position.set(Event.KEY_CHARGE, Integer.valueOf(charger) == 1);
                }

                }__CLR4_5_2558558lx1e803n.R.inc(6780);position.set(Event.KEY_MCC, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6781);position.set(Event.KEY_MNC, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6782);position.set(Event.KEY_LAC, parser.group(index++));

            } }else {{

                __CLR4_5_2558558lx1e803n.R.inc(6783);if ((((!identify(id, channel))&&(__CLR4_5_2558558lx1e803n.R.iget(6784)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6785)==0&false))) {{
                    __CLR4_5_2558558lx1e803n.R.inc(6786);return null;
                }
                }__CLR4_5_2558558lx1e803n.R.inc(6787);position.setDeviceId(getDeviceId());
                
            }

        }} }else {{

            __CLR4_5_2558558lx1e803n.R.inc(6788);Matcher parser = patternAlternative.matcher(status);
            __CLR4_5_2558558lx1e803n.R.inc(6789);if ((((!parser.matches())&&(__CLR4_5_2558558lx1e803n.R.iget(6790)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6791)==0&false))) {{

                __CLR4_5_2558558lx1e803n.R.inc(6792);int index = 1;

                __CLR4_5_2558558lx1e803n.R.inc(6793);if ((((!identify(id, channel))&&(__CLR4_5_2558558lx1e803n.R.iget(6794)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6795)==0&false))) {{
                    __CLR4_5_2558558lx1e803n.R.inc(6796);return null;
                }
                }__CLR4_5_2558558lx1e803n.R.inc(6797);position.setDeviceId(getDeviceId());

                __CLR4_5_2558558lx1e803n.R.inc(6798);position.set(Event.KEY_MCC, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6799);position.set(Event.KEY_MNC, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6800);position.set(Event.KEY_LAC, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6801);position.set(Event.KEY_GSM, parser.group(index++));

                __CLR4_5_2558558lx1e803n.R.inc(6802);position.set(Event.KEY_BATTERY, Double.valueOf(parser.group(index++)));

                __CLR4_5_2558558lx1e803n.R.inc(6803);position.set(Event.KEY_FLAGS, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6804);position.set(Event.KEY_INPUT, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6805);position.set(Event.KEY_OUTPUT, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6806);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6807);position.set(Event.PREFIX_ADC + 2, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6808);position.set(Event.PREFIX_ADC + 3, parser.group(index++));
                __CLR4_5_2558558lx1e803n.R.inc(6809);position.set(Event.KEY_ALARM, parser.group(index++));
            }
        }}

        }__CLR4_5_2558558lx1e803n.R.inc(6810);return position;
    }finally{__CLR4_5_2558558lx1e803n.R.flushNeeded();}}

    private static final Pattern patternNew = Pattern.compile(
            "\\$MGV\\d{3}," +
            "(\\d+)," +                    // IMEI
            "[^,]*," +                     // Name
            "([RS])," +
            "(\\d{2})(\\d{2})(\\d{2})," +  // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([AV])," +                    // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +     // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +     // Longitude (DDDMM.MMMM)
            "([EW])," +
            "\\d{2}," +
            "(\\d{2})," +                  // Satellites
            "\\d{2}," +
            "(\\d+\\.\\d+)," +             // HDOP
            "(\\d+\\.\\d+)," +             // Speed
            "(\\d+\\.\\d+)," +             // Course
            "(\\d+\\.\\d+)," +             // Altitude
            "(\\d+\\.\\d+)," +             // Odometer
            "(\\d+)," +                    // MCC
            "(\\d+)," +                    // MNC
            "(\\p{XDigit}{4},\\p{XDigit}{4})," + // Cell
            "(\\d+)?," +                   // GSM
            "([01]+)," +                   // Input
            "([01]+)," +                   // Output
            "(\\d+)," +                    // ADC1
            "(\\d+)," +                    // ADC2
            "(\\d+)," +                    // ADC3
            "(?:(-?\\d+\\.?\\d*)| )," +    // Temperature 1
            "(?:(-?\\d+\\.?\\d*)| )," +    // Temperature 2
            "(\\d+)?,," +                  // RFID
            "(\\d+)?," +                   // Battery
            "([^,]*);" +                   // Alert
            ".*");

    private Position decodeNew(Channel channel, String sentence) {try{__CLR4_5_2558558lx1e803n.R.inc(6811);

        __CLR4_5_2558558lx1e803n.R.inc(6812);Matcher parser = patternNew.matcher(sentence);
        __CLR4_5_2558558lx1e803n.R.inc(6813);if ((((!parser.matches())&&(__CLR4_5_2558558lx1e803n.R.iget(6814)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6815)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6816);return null;
        }
        }__CLR4_5_2558558lx1e803n.R.inc(6817);int index = 1;

        __CLR4_5_2558558lx1e803n.R.inc(6818);Position position = new Position();
        __CLR4_5_2558558lx1e803n.R.inc(6819);position.setProtocol(getProtocolName());

        __CLR4_5_2558558lx1e803n.R.inc(6820);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_2558558lx1e803n.R.iget(6821)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6822)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6823);return null;
        }
        }__CLR4_5_2558558lx1e803n.R.inc(6824);position.setDeviceId(getDeviceId());

        __CLR4_5_2558558lx1e803n.R.inc(6825);if ((((parser.group(index++).equals("S"))&&(__CLR4_5_2558558lx1e803n.R.iget(6826)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6827)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6828);position.set(Event.KEY_ARCHIVE, true);
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6829);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2558558lx1e803n.R.inc(6830);time.clear();
        __CLR4_5_2558558lx1e803n.R.inc(6831);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6832);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2558558lx1e803n.R.inc(6833);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6834);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6835);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6836);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6837);position.setTime(time.getTime());

        __CLR4_5_2558558lx1e803n.R.inc(6838);position.setValid(parser.group(index++).equals("A"));

        // Latitude
        __CLR4_5_2558558lx1e803n.R.inc(6839);double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2558558lx1e803n.R.inc(6840);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2558558lx1e803n.R.inc(6841);if ((((parser.group(index++).equals("S"))&&(__CLR4_5_2558558lx1e803n.R.iget(6842)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6843)==0&false))) {__CLR4_5_2558558lx1e803n.R.inc(6844);latitude = -latitude;
        }__CLR4_5_2558558lx1e803n.R.inc(6845);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2558558lx1e803n.R.inc(6846);double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2558558lx1e803n.R.inc(6847);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2558558lx1e803n.R.inc(6848);if ((((parser.group(index++).equals("W"))&&(__CLR4_5_2558558lx1e803n.R.iget(6849)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6850)==0&false))) {__CLR4_5_2558558lx1e803n.R.inc(6851);longitude = -longitude;
        }__CLR4_5_2558558lx1e803n.R.inc(6852);position.setLongitude(longitude);

        __CLR4_5_2558558lx1e803n.R.inc(6853);position.set(Event.KEY_SATELLITES, Integer.parseInt(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6854);position.set(Event.KEY_HDOP, Double.parseDouble(parser.group(index++)));

        __CLR4_5_2558558lx1e803n.R.inc(6855);position.setSpeed(Double.parseDouble(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6856);position.setCourse(Double.parseDouble(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6857);position.setAltitude(Double.parseDouble(parser.group(index++)));

        __CLR4_5_2558558lx1e803n.R.inc(6858);position.set(Event.KEY_ODOMETER, Double.parseDouble(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6859);position.set(Event.KEY_MCC, Integer.parseInt(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6860);position.set(Event.KEY_MNC, Integer.parseInt(parser.group(index++)));
        __CLR4_5_2558558lx1e803n.R.inc(6861);position.set(Event.KEY_CELL, parser.group(index++));

        __CLR4_5_2558558lx1e803n.R.inc(6862);String gsm = parser.group(index++);
        __CLR4_5_2558558lx1e803n.R.inc(6863);if ((((gsm != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6864)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6865)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6866);position.set(Event.KEY_GSM, Integer.parseInt(gsm));
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6867);position.set(Event.KEY_INPUT, Integer.parseInt(parser.group(index++), 2));
        __CLR4_5_2558558lx1e803n.R.inc(6868);position.set(Event.KEY_OUTPUT, Integer.parseInt(parser.group(index++), 2));

        __CLR4_5_2558558lx1e803n.R.inc(6869);for (int i = 1; (((i <= 3)&&(__CLR4_5_2558558lx1e803n.R.iget(6870)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6871)==0&false)); i++) {{
            __CLR4_5_2558558lx1e803n.R.inc(6872);position.set(Event.PREFIX_ADC + i, Integer.parseInt(parser.group(index++)));
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6873);for (int i = 1; (((i <= 2)&&(__CLR4_5_2558558lx1e803n.R.iget(6874)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6875)==0&false)); i++) {{
            __CLR4_5_2558558lx1e803n.R.inc(6876);String adc = parser.group(index++);
            __CLR4_5_2558558lx1e803n.R.inc(6877);if ((((adc != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6878)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6879)==0&false))) {{
                __CLR4_5_2558558lx1e803n.R.inc(6880);position.set(Event.PREFIX_TEMP + i, Double.parseDouble(adc));
            }
        }}

        }__CLR4_5_2558558lx1e803n.R.inc(6881);position.set(Event.KEY_RFID, parser.group(index++));

        __CLR4_5_2558558lx1e803n.R.inc(6882);String battery = parser.group(index++);
        __CLR4_5_2558558lx1e803n.R.inc(6883);if ((((battery != null)&&(__CLR4_5_2558558lx1e803n.R.iget(6884)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6885)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6886);position.set(Event.KEY_BATTERY, Integer.parseInt(battery));
        }

        }__CLR4_5_2558558lx1e803n.R.inc(6887);position.set(Event.KEY_ALARM, parser.group(index++));

        __CLR4_5_2558558lx1e803n.R.inc(6888);return position;
    }finally{__CLR4_5_2558558lx1e803n.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_2558558lx1e803n.R.inc(6889);

        __CLR4_5_2558558lx1e803n.R.inc(6890);String sentence = (String) msg;

        __CLR4_5_2558558lx1e803n.R.inc(6891);if ((((sentence.startsWith("$MG"))&&(__CLR4_5_2558558lx1e803n.R.iget(6892)!=0|true))||(__CLR4_5_2558558lx1e803n.R.iget(6893)==0&false))) {{
            __CLR4_5_2558558lx1e803n.R.inc(6894);return decodeNew(channel, sentence);
        } }else {{
            __CLR4_5_2558558lx1e803n.R.inc(6895);return decodeOld(channel, sentence);
        }
    }}finally{__CLR4_5_2558558lx1e803n.R.flushNeeded();}}

}
