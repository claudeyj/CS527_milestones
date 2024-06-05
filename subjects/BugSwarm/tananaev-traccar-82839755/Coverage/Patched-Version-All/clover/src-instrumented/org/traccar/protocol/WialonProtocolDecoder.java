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
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class WialonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28lm8lmlx1e8176{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,11279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WialonProtocolDecoder(WialonProtocol protocol) {
        super(protocol);__CLR4_5_28lm8lmlx1e8176.R.inc(11147);try{__CLR4_5_28lm8lmlx1e8176.R.inc(11146);
    }finally{__CLR4_5_28lm8lmlx1e8176.R.flushNeeded();}}

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

    private void sendResponse(Channel channel, String prefix, Integer number) {try{__CLR4_5_28lm8lmlx1e8176.R.inc(11148);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11149);if ((((channel != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11150)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11151)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11152);StringBuilder response = new StringBuilder(prefix);
            __CLR4_5_28lm8lmlx1e8176.R.inc(11153);if ((((number != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11154)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11155)==0&false))) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11156);response.append(number);
            }
            }__CLR4_5_28lm8lmlx1e8176.R.inc(11157);response.append("\r\n");
            __CLR4_5_28lm8lmlx1e8176.R.inc(11158);channel.write(response.toString());
        }
    }}finally{__CLR4_5_28lm8lmlx1e8176.R.flushNeeded();}}
    
    private Position decodePosition(String substring) {try{__CLR4_5_28lm8lmlx1e8176.R.inc(11159);
        
        // Parse message
        __CLR4_5_28lm8lmlx1e8176.R.inc(11160);Matcher parser = pattern.matcher(substring);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11161);if ((((!hasDeviceId() || !parser.matches())&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11162)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11163)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11164);return null;
        }

        // Create new position
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11165);Position position = new Position();
        __CLR4_5_28lm8lmlx1e8176.R.inc(11166);position.setProtocol(getProtocolName());
        __CLR4_5_28lm8lmlx1e8176.R.inc(11167);position.setDeviceId(getDeviceId());

        __CLR4_5_28lm8lmlx1e8176.R.inc(11168);Integer index = 1;

        // Date and Time
        __CLR4_5_28lm8lmlx1e8176.R.inc(11169);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11170);time.clear();
        __CLR4_5_28lm8lmlx1e8176.R.inc(11171);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11172);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11173);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11174);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11175);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11176);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11177);position.setTime(time.getTime());

        // Latitude
        __CLR4_5_28lm8lmlx1e8176.R.inc(11178);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11179);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_28lm8lmlx1e8176.R.inc(11180);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11181)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11182)==0&false))) {__CLR4_5_28lm8lmlx1e8176.R.inc(11183);latitude = -latitude;
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11184);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_28lm8lmlx1e8176.R.inc(11185);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11186);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_28lm8lmlx1e8176.R.inc(11187);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11188)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11189)==0&false))) {__CLR4_5_28lm8lmlx1e8176.R.inc(11190);longitude = -longitude;
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11191);position.setLongitude(longitude);

        // Speed
        __CLR4_5_28lm8lmlx1e8176.R.inc(11192);String speed = parser.group(index++);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11193);if ((((speed != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11194)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11195)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11196);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(speed)));
        }

        // Course
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11197);String course = parser.group(index++);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11198);if ((((course != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11199)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11200)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11201);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11202);String altitude = parser.group(index++);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11203);if ((((altitude != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11204)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11205)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11206);position.setAltitude(Double.valueOf(altitude));
        }

        // Satellites
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11207);String satellites = parser.group(index++);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11208);if ((((satellites != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11209)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11210)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11211);position.setValid(Integer.valueOf(satellites) >= 3);
            __CLR4_5_28lm8lmlx1e8176.R.inc(11212);position.set(Event.KEY_SATELLITES, satellites);
        } }else {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11213);position.setValid(false);
        }

        // Other
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11214);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11215);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_28lm8lmlx1e8176.R.inc(11216);position.set(Event.KEY_OUTPUT, parser.group(index++));

        // ADC
        __CLR4_5_28lm8lmlx1e8176.R.inc(11217);String adc = parser.group(index++);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11218);if ((((adc != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11219)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11220)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11221);String[] values = adc.split(",");
            __CLR4_5_28lm8lmlx1e8176.R.inc(11222);for (int i = 0; (((i < values.length)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11223)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11224)==0&false)); i++) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11225);position.set(Event.PREFIX_ADC + (i + 1), values[i]);
            }
        }}

        // iButton
        }__CLR4_5_28lm8lmlx1e8176.R.inc(11226);position.set(Event.KEY_RFID, parser.group(index++));

        // Params
        __CLR4_5_28lm8lmlx1e8176.R.inc(11227);String params = parser.group(index);
        __CLR4_5_28lm8lmlx1e8176.R.inc(11228);if ((((params != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11229)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11230)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11231);String[] values = params.split(",");
            __CLR4_5_28lm8lmlx1e8176.R.inc(11232);for (String param : values) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11233);Matcher paramParser = Pattern.compile( "(.*):[1-3]:(.*)").matcher(param);
                __CLR4_5_28lm8lmlx1e8176.R.inc(11234);if ((((paramParser.matches())&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11235)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11236)==0&false))) {{
                    __CLR4_5_28lm8lmlx1e8176.R.inc(11237);position.set(paramParser.group(1).toLowerCase(), paramParser.group(2));
                }
            }}
        }}

        }__CLR4_5_28lm8lmlx1e8176.R.inc(11238);return position;
    }finally{__CLR4_5_28lm8lmlx1e8176.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28lm8lmlx1e8176.R.inc(11239);

        __CLR4_5_28lm8lmlx1e8176.R.inc(11240);String sentence = (String) msg;

        // Detect device ID
        __CLR4_5_28lm8lmlx1e8176.R.inc(11241);if ((((sentence.startsWith("#L#"))&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11242)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11243)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11244);String imei = sentence.substring(3, sentence.indexOf(';'));
            __CLR4_5_28lm8lmlx1e8176.R.inc(11245);if ((((identify(imei, channel))&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11246)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11247)==0&false))) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11248);sendResponse(channel, "#AL#", 1);
            }
        }}

        // Heartbeat
        }else {__CLR4_5_28lm8lmlx1e8176.R.inc(11249);if ((((sentence.startsWith("#P#"))&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11250)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11251)==0&false))) {{
            __CLR4_5_28lm8lmlx1e8176.R.inc(11252);sendResponse(channel, "#AP#", null);
        }
        
        // Parse message
        }else {__CLR4_5_28lm8lmlx1e8176.R.inc(11253);if ((((sentence.startsWith("#SD#") || sentence.startsWith("#D#"))&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11254)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11255)==0&false))) {{

            __CLR4_5_28lm8lmlx1e8176.R.inc(11256);Position position = decodePosition(
                    sentence.substring(sentence.indexOf('#', 1) + 1));

            __CLR4_5_28lm8lmlx1e8176.R.inc(11257);if ((((position != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11258)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11259)==0&false))) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11260);sendResponse(channel, "#AD#", 1);
                __CLR4_5_28lm8lmlx1e8176.R.inc(11261);return position;
            }
        }}
        
        }else {__CLR4_5_28lm8lmlx1e8176.R.inc(11262);if ((((sentence.startsWith("#B#"))&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11263)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11264)==0&false))) {{
            
            __CLR4_5_28lm8lmlx1e8176.R.inc(11265);String[] messages = sentence.substring(sentence.indexOf('#', 1) + 1).split("\\|");
            __CLR4_5_28lm8lmlx1e8176.R.inc(11266);List<Position> positions = new LinkedList<>();

            __CLR4_5_28lm8lmlx1e8176.R.inc(11267);for (String message : messages) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11268);Position position = decodePosition(message);
                __CLR4_5_28lm8lmlx1e8176.R.inc(11269);if ((((position != null)&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11270)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11271)==0&false))) {{
                    __CLR4_5_28lm8lmlx1e8176.R.inc(11272);positions.add(position);
                }
            }}

            }__CLR4_5_28lm8lmlx1e8176.R.inc(11273);sendResponse(channel, "#AB#", messages.length);
            __CLR4_5_28lm8lmlx1e8176.R.inc(11274);if ((((!positions.isEmpty())&&(__CLR4_5_28lm8lmlx1e8176.R.iget(11275)!=0|true))||(__CLR4_5_28lm8lmlx1e8176.R.iget(11276)==0&false))) {{
                __CLR4_5_28lm8lmlx1e8176.R.inc(11277);return positions;
            }
        }}

        }}}}__CLR4_5_28lm8lmlx1e8176.R.inc(11278);return null;
    }finally{__CLR4_5_28lm8lmlx1e8176.R.flushNeeded();}}

}
