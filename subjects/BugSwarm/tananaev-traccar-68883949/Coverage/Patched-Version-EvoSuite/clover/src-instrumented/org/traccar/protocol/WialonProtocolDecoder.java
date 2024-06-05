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
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class WialonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2824824lx1dob18{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,10577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WialonProtocolDecoder(WialonProtocol protocol) {
        super(protocol);__CLR4_5_2824824lx1dob18.R.inc(10445);try{__CLR4_5_2824824lx1dob18.R.inc(10444);
    }finally{__CLR4_5_2824824lx1dob18.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(\\d{2})(\\d{2})(\\d{2});" +  // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2});" +  // Time (HHMMSS)
            "(\\d{2})(\\d{2}\\.\\d+);" +   // Latitude (DDMM.MMMM)
            "([NS]);" +
            "(\\d{3})(\\d{2}\\.\\d+);" +   // Longitude (DDDMM.MMMM)
            "([EW]);" +
            "(\\d+\\.?\\d*)?;" +           // Speed
            "(\\d+\\.?\\d*)?;" +           // Course
            "(?:NA|(\\d+\\.?\\d*));" +     // Altitude
            "(?:NA|(\\d+))" +              // Satellites
            "(?:;" +
            "(?:NA|(\\d+\\.?\\d*));" +     // hdop
            "(?:NA|(\\d+));" +             // inputs
            "(?:NA|(\\d+));" +             // outputs
            "(?:NA|([^;]*));" +            // adc
            "(?:NA|([^;]*));" +            // ibutton
            "(?:NA|(.*))" +                // params
            ")?");

    private void sendResponse(Channel channel, String prefix, Integer number) {try{__CLR4_5_2824824lx1dob18.R.inc(10446);
        __CLR4_5_2824824lx1dob18.R.inc(10447);if ((((channel != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10448)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10449)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10450);StringBuilder response = new StringBuilder(prefix);
            __CLR4_5_2824824lx1dob18.R.inc(10451);if ((((number != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10452)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10453)==0&false))) {{
                __CLR4_5_2824824lx1dob18.R.inc(10454);response.append(number);
            }
            }__CLR4_5_2824824lx1dob18.R.inc(10455);response.append("\r\n");
            __CLR4_5_2824824lx1dob18.R.inc(10456);channel.write(response.toString());
        }
    }}finally{__CLR4_5_2824824lx1dob18.R.flushNeeded();}}
    
    private Position decodePosition(String substring) {try{__CLR4_5_2824824lx1dob18.R.inc(10457);
        
        // Parse message
        __CLR4_5_2824824lx1dob18.R.inc(10458);Matcher parser = pattern.matcher(substring);
        __CLR4_5_2824824lx1dob18.R.inc(10459);if ((((!hasDeviceId() || !parser.matches())&&(__CLR4_5_2824824lx1dob18.R.iget(10460)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10461)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10462);return null;
        }

        // Create new position
        }__CLR4_5_2824824lx1dob18.R.inc(10463);Position position = new Position();
        __CLR4_5_2824824lx1dob18.R.inc(10464);position.setProtocol(getProtocolName());
        __CLR4_5_2824824lx1dob18.R.inc(10465);position.setDeviceId(getDeviceId());

        __CLR4_5_2824824lx1dob18.R.inc(10466);Integer index = 1;

        // Date and Time
        __CLR4_5_2824824lx1dob18.R.inc(10467);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2824824lx1dob18.R.inc(10468);time.clear();
        __CLR4_5_2824824lx1dob18.R.inc(10469);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2824824lx1dob18.R.inc(10470);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2824824lx1dob18.R.inc(10471);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2824824lx1dob18.R.inc(10472);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2824824lx1dob18.R.inc(10473);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2824824lx1dob18.R.inc(10474);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2824824lx1dob18.R.inc(10475);position.setTime(time.getTime());

        // Latitude
        __CLR4_5_2824824lx1dob18.R.inc(10476);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2824824lx1dob18.R.inc(10477);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2824824lx1dob18.R.inc(10478);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2824824lx1dob18.R.iget(10479)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10480)==0&false))) {__CLR4_5_2824824lx1dob18.R.inc(10481);latitude = -latitude;
        }__CLR4_5_2824824lx1dob18.R.inc(10482);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2824824lx1dob18.R.inc(10483);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2824824lx1dob18.R.inc(10484);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2824824lx1dob18.R.inc(10485);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2824824lx1dob18.R.iget(10486)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10487)==0&false))) {__CLR4_5_2824824lx1dob18.R.inc(10488);longitude = -longitude;
        }__CLR4_5_2824824lx1dob18.R.inc(10489);position.setLongitude(longitude);

        // Speed
        __CLR4_5_2824824lx1dob18.R.inc(10490);String speed = parser.group(index++);
        __CLR4_5_2824824lx1dob18.R.inc(10491);if ((((speed != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10492)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10493)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10494);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(speed)));
        }

        // Course
        }__CLR4_5_2824824lx1dob18.R.inc(10495);String course = parser.group(index++);
        __CLR4_5_2824824lx1dob18.R.inc(10496);if ((((course != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10497)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10498)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10499);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_2824824lx1dob18.R.inc(10500);String altitude = parser.group(index++);
        __CLR4_5_2824824lx1dob18.R.inc(10501);if ((((altitude != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10502)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10503)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10504);position.setAltitude(Double.valueOf(altitude));
        }

        // Satellites
        }__CLR4_5_2824824lx1dob18.R.inc(10505);String satellites = parser.group(index++);
        __CLR4_5_2824824lx1dob18.R.inc(10506);if ((((satellites != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10507)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10508)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10509);position.setValid(Integer.valueOf(satellites) >= 3);
            __CLR4_5_2824824lx1dob18.R.inc(10510);position.set(Event.KEY_SATELLITES, satellites);
        } }else {{
            __CLR4_5_2824824lx1dob18.R.inc(10511);position.setValid(false);
        }

        // Other
        }__CLR4_5_2824824lx1dob18.R.inc(10512);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_2824824lx1dob18.R.inc(10513);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_2824824lx1dob18.R.inc(10514);position.set(Event.KEY_OUTPUT, parser.group(index++));

        // ADC
        __CLR4_5_2824824lx1dob18.R.inc(10515);String adc = parser.group(index++);
        __CLR4_5_2824824lx1dob18.R.inc(10516);if ((((adc != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10517)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10518)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10519);String[] values = adc.split(",");
            __CLR4_5_2824824lx1dob18.R.inc(10520);for (int i = 0; (((i < values.length)&&(__CLR4_5_2824824lx1dob18.R.iget(10521)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10522)==0&false)); i++) {{
                __CLR4_5_2824824lx1dob18.R.inc(10523);position.set(Event.PREFIX_ADC + (i + 1), values[i]);
            }
        }}

        // iButton
        }__CLR4_5_2824824lx1dob18.R.inc(10524);position.set(Event.KEY_RFID, parser.group(index++));

        // Params
        __CLR4_5_2824824lx1dob18.R.inc(10525);String params = parser.group(index);
        __CLR4_5_2824824lx1dob18.R.inc(10526);if ((((params != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10527)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10528)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10529);String[] values = params.split(",");
            __CLR4_5_2824824lx1dob18.R.inc(10530);for (String param : values) {{
                __CLR4_5_2824824lx1dob18.R.inc(10531);Matcher paramParser = Pattern.compile( "(.*):[1-3]:(.*)").matcher(param);
                __CLR4_5_2824824lx1dob18.R.inc(10532);if ((((paramParser.matches())&&(__CLR4_5_2824824lx1dob18.R.iget(10533)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10534)==0&false))) {{
                    __CLR4_5_2824824lx1dob18.R.inc(10535);position.set(paramParser.group(1).toLowerCase(), paramParser.group(2));
                }
            }}
        }}

        }__CLR4_5_2824824lx1dob18.R.inc(10536);return position;
    }finally{__CLR4_5_2824824lx1dob18.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2824824lx1dob18.R.inc(10537);

        __CLR4_5_2824824lx1dob18.R.inc(10538);String sentence = (String) msg;

        // Detect device ID
        __CLR4_5_2824824lx1dob18.R.inc(10539);if ((((sentence.startsWith("#L#"))&&(__CLR4_5_2824824lx1dob18.R.iget(10540)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10541)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10542);String imei = sentence.substring(3, sentence.indexOf(';'));
            __CLR4_5_2824824lx1dob18.R.inc(10543);if ((((identify(imei, channel))&&(__CLR4_5_2824824lx1dob18.R.iget(10544)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10545)==0&false))) {{
                __CLR4_5_2824824lx1dob18.R.inc(10546);sendResponse(channel, "#AL#", 1);
            }
        }}

        // Heartbeat
        }else {__CLR4_5_2824824lx1dob18.R.inc(10547);if ((((sentence.startsWith("#P#"))&&(__CLR4_5_2824824lx1dob18.R.iget(10548)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10549)==0&false))) {{
            __CLR4_5_2824824lx1dob18.R.inc(10550);sendResponse(channel, "#AP#", null);
        }
        
        // Parse message
        }else {__CLR4_5_2824824lx1dob18.R.inc(10551);if ((((sentence.startsWith("#SD#") || sentence.startsWith("#D#"))&&(__CLR4_5_2824824lx1dob18.R.iget(10552)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10553)==0&false))) {{

            __CLR4_5_2824824lx1dob18.R.inc(10554);Position position = decodePosition(
                    sentence.substring(sentence.indexOf('#', 1) + 1));

            __CLR4_5_2824824lx1dob18.R.inc(10555);if ((((position != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10556)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10557)==0&false))) {{
                __CLR4_5_2824824lx1dob18.R.inc(10558);sendResponse(channel, "#AD#", 1);
                __CLR4_5_2824824lx1dob18.R.inc(10559);return position;
            }
        }}
        
        }else {__CLR4_5_2824824lx1dob18.R.inc(10560);if ((((sentence.startsWith("#B#"))&&(__CLR4_5_2824824lx1dob18.R.iget(10561)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10562)==0&false))) {{
            
            __CLR4_5_2824824lx1dob18.R.inc(10563);String[] messages = sentence.substring(sentence.indexOf('#', 1) + 1).split("\\|");
            __CLR4_5_2824824lx1dob18.R.inc(10564);List<Position> positions = new LinkedList<Position>();

            __CLR4_5_2824824lx1dob18.R.inc(10565);for (String message : messages) {{
                __CLR4_5_2824824lx1dob18.R.inc(10566);Position position = decodePosition(message);
                __CLR4_5_2824824lx1dob18.R.inc(10567);if ((((position != null)&&(__CLR4_5_2824824lx1dob18.R.iget(10568)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10569)==0&false))) {{
                    __CLR4_5_2824824lx1dob18.R.inc(10570);positions.add(position);
                }
            }}

            }__CLR4_5_2824824lx1dob18.R.inc(10571);sendResponse(channel, "#AB#", messages.length);
            __CLR4_5_2824824lx1dob18.R.inc(10572);if ((((!positions.isEmpty())&&(__CLR4_5_2824824lx1dob18.R.iget(10573)!=0|true))||(__CLR4_5_2824824lx1dob18.R.iget(10574)==0&false))) {{
                __CLR4_5_2824824lx1dob18.R.inc(10575);return positions;
            }
        }}

        }}}}__CLR4_5_2824824lx1dob18.R.inc(10576);return null;
    }finally{__CLR4_5_2824824lx1dob18.R.flushNeeded();}}

}
