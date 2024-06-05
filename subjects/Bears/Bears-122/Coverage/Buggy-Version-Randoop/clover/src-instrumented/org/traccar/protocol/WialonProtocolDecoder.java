/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WialonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2i05i05lwydykw8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,23457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WialonProtocolDecoder(WialonProtocol protocol) {
        super(protocol);__CLR4_5_2i05i05lwydykw8.R.inc(23334);try{__CLR4_5_2i05i05lwydykw8.R.inc(23333);
    }finally{__CLR4_5_2i05i05lwydykw8.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(dd)(dd)(dd);")             // date (ddmmyy)
            .number("(dd)(dd)(dd);")             // time (hhmmss)
            .number("(dd)(dd.d+);")              // latitude
            .expression("([NS]);")
            .number("(ddd)(dd.d+);")             // longitude
            .expression("([EW]);")
            .number("(d+.?d*)?;")                // speed
            .number("(d+.?d*)?;")                // course
            .number("(?:NA|(d+.?d*));")          // altitude
            .number("(?:NA|(d+))")               // satellites
            .groupBegin().text(";")
            .number("(?:NA|(d+.?d*));")          // hdop
            .number("(?:NA|(d+));")              // inputs
            .number("(?:NA|(d+));")              // outputs
            .expression("(?:NA|([^;]*));")       // adc
            .expression("(?:NA|([^;]*));")       // ibutton
            .expression("(?:NA|(.*))")           // params
            .groupEnd("?")
            .compile();

    private void sendResponse(Channel channel, String prefix, Integer number) {try{__CLR4_5_2i05i05lwydykw8.R.inc(23335);
        __CLR4_5_2i05i05lwydykw8.R.inc(23336);if ((((channel != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23337)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23338)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23339);StringBuilder response = new StringBuilder(prefix);
            __CLR4_5_2i05i05lwydykw8.R.inc(23340);if ((((number != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23341)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23342)==0&false))) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23343);response.append(number);
            }
            }__CLR4_5_2i05i05lwydykw8.R.inc(23344);response.append("\r\n");
            __CLR4_5_2i05i05lwydykw8.R.inc(23345);channel.write(response.toString());
        }
    }}finally{__CLR4_5_2i05i05lwydykw8.R.flushNeeded();}}

    private Position decodePosition(Channel channel, SocketAddress remoteAddress, String substring) {try{__CLR4_5_2i05i05lwydykw8.R.inc(23346);

        __CLR4_5_2i05i05lwydykw8.R.inc(23347);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2i05i05lwydykw8.R.inc(23348);if ((((deviceSession == null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23349)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23350)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23351);return null;
        }

        }__CLR4_5_2i05i05lwydykw8.R.inc(23352);Parser parser = new Parser(PATTERN, substring);
        __CLR4_5_2i05i05lwydykw8.R.inc(23353);if ((((!parser.matches())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23354)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23355)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23356);return null;
        }

        }__CLR4_5_2i05i05lwydykw8.R.inc(23357);Position position = new Position();
        __CLR4_5_2i05i05lwydykw8.R.inc(23358);position.setProtocol(getProtocolName());
        __CLR4_5_2i05i05lwydykw8.R.inc(23359);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2i05i05lwydykw8.R.inc(23360);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2i05i05lwydykw8.R.inc(23361);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2i05i05lwydykw8.R.inc(23362);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2i05i05lwydykw8.R.inc(23363);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_2i05i05lwydykw8.R.inc(23364);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2i05i05lwydykw8.R.inc(23365);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2i05i05lwydykw8.R.inc(23366);if ((((parser.hasNext())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23367)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23368)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23369);int satellites = parser.nextInt(0);
            __CLR4_5_2i05i05lwydykw8.R.inc(23370);position.setValid(satellites >= 3);
            __CLR4_5_2i05i05lwydykw8.R.inc(23371);position.set(Position.KEY_SATELLITES, satellites);
        }

        }__CLR4_5_2i05i05lwydykw8.R.inc(23372);position.set(Position.KEY_HDOP, parser.nextDouble());
        __CLR4_5_2i05i05lwydykw8.R.inc(23373);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2i05i05lwydykw8.R.inc(23374);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_2i05i05lwydykw8.R.inc(23375);if ((((parser.hasNext())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23376)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23377)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23378);String[] values = parser.next().split(",");
            __CLR4_5_2i05i05lwydykw8.R.inc(23379);for (int i = 0; (((i < values.length)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23380)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23381)==0&false)); i++) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23382);position.set(Position.PREFIX_ADC + (i + 1), values[i]);
            }
        }}

        }__CLR4_5_2i05i05lwydykw8.R.inc(23383);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());

        __CLR4_5_2i05i05lwydykw8.R.inc(23384);if ((((parser.hasNext())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23385)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23386)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23387);String[] values = parser.next().split(",");
            __CLR4_5_2i05i05lwydykw8.R.inc(23388);for (String param : values) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23389);Matcher paramParser = Pattern.compile("(.*):[1-3]:(.*)").matcher(param);
                __CLR4_5_2i05i05lwydykw8.R.inc(23390);if ((((paramParser.matches())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23391)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23392)==0&false))) {{
                    __CLR4_5_2i05i05lwydykw8.R.inc(23393);try {
                        __CLR4_5_2i05i05lwydykw8.R.inc(23394);position.set(paramParser.group(1).toLowerCase(), Double.parseDouble(paramParser.group(2)));
                    } catch (NumberFormatException e) {
                        __CLR4_5_2i05i05lwydykw8.R.inc(23395);position.set(paramParser.group(1).toLowerCase(), paramParser.group(2));
                    }
                }
            }}
        }}

        }__CLR4_5_2i05i05lwydykw8.R.inc(23396);return position;
    }finally{__CLR4_5_2i05i05lwydykw8.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2i05i05lwydykw8.R.inc(23397);

        __CLR4_5_2i05i05lwydykw8.R.inc(23398);String sentence = (String) msg;

        __CLR4_5_2i05i05lwydykw8.R.inc(23399);if ((((sentence.startsWith("#L#"))&&(__CLR4_5_2i05i05lwydykw8.R.iget(23400)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23401)==0&false))) {{

            __CLR4_5_2i05i05lwydykw8.R.inc(23402);String[] values = sentence.substring(3).split(";");

            __CLR4_5_2i05i05lwydykw8.R.inc(23403);String imei = (((values[0].indexOf('.') >= 0 )&&(__CLR4_5_2i05i05lwydykw8.R.iget(23404)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23405)==0&false))? values[1] : values[0];
            __CLR4_5_2i05i05lwydykw8.R.inc(23406);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
            __CLR4_5_2i05i05lwydykw8.R.inc(23407);if ((((deviceSession != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23408)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23409)==0&false))) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23410);sendResponse(channel, "#AL#", 1);
            }

        }} }else {__CLR4_5_2i05i05lwydykw8.R.inc(23411);if ((((sentence.startsWith("#P#"))&&(__CLR4_5_2i05i05lwydykw8.R.iget(23412)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23413)==0&false))) {{

            __CLR4_5_2i05i05lwydykw8.R.inc(23414);sendResponse(channel, "#AP#", null); // heartbeat

        } }else {__CLR4_5_2i05i05lwydykw8.R.inc(23415);if ((((sentence.startsWith("#SD#") || sentence.startsWith("#D#"))&&(__CLR4_5_2i05i05lwydykw8.R.iget(23416)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23417)==0&false))) {{

            __CLR4_5_2i05i05lwydykw8.R.inc(23418);Position position = decodePosition(
                    channel, remoteAddress, sentence.substring(sentence.indexOf('#', 1) + 1));

            __CLR4_5_2i05i05lwydykw8.R.inc(23419);if ((((position != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23420)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23421)==0&false))) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23422);sendResponse(channel, "#AD#", 1);
                __CLR4_5_2i05i05lwydykw8.R.inc(23423);return position;
            }

        }} }else {__CLR4_5_2i05i05lwydykw8.R.inc(23424);if ((((sentence.startsWith("#B#"))&&(__CLR4_5_2i05i05lwydykw8.R.iget(23425)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23426)==0&false))) {{

            __CLR4_5_2i05i05lwydykw8.R.inc(23427);String[] messages = sentence.substring(sentence.indexOf('#', 1) + 1).split("\\|");
            __CLR4_5_2i05i05lwydykw8.R.inc(23428);List<Position> positions = new LinkedList<>();

            __CLR4_5_2i05i05lwydykw8.R.inc(23429);for (String message : messages) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23430);Position position = decodePosition(channel, remoteAddress, message);
                __CLR4_5_2i05i05lwydykw8.R.inc(23431);if ((((position != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23432)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23433)==0&false))) {{
                    __CLR4_5_2i05i05lwydykw8.R.inc(23434);position.set(Position.KEY_ARCHIVE, true);
                    __CLR4_5_2i05i05lwydykw8.R.inc(23435);positions.add(position);
                }
            }}

            }__CLR4_5_2i05i05lwydykw8.R.inc(23436);sendResponse(channel, "#AB#", messages.length);
            __CLR4_5_2i05i05lwydykw8.R.inc(23437);if ((((!positions.isEmpty())&&(__CLR4_5_2i05i05lwydykw8.R.iget(23438)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23439)==0&false))) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23440);return positions;
            }

        }} }else {__CLR4_5_2i05i05lwydykw8.R.inc(23441);if ((((sentence.startsWith("#M#"))&&(__CLR4_5_2i05i05lwydykw8.R.iget(23442)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23443)==0&false))) {{
            __CLR4_5_2i05i05lwydykw8.R.inc(23444);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2i05i05lwydykw8.R.inc(23445);if ((((deviceSession != null)&&(__CLR4_5_2i05i05lwydykw8.R.iget(23446)!=0|true))||(__CLR4_5_2i05i05lwydykw8.R.iget(23447)==0&false))) {{
                __CLR4_5_2i05i05lwydykw8.R.inc(23448);Position position = new Position();
                __CLR4_5_2i05i05lwydykw8.R.inc(23449);position.setProtocol(getProtocolName());
                __CLR4_5_2i05i05lwydykw8.R.inc(23450);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2i05i05lwydykw8.R.inc(23451);getLastLocation(position, new Date());
                __CLR4_5_2i05i05lwydykw8.R.inc(23452);position.setValid(false);
                __CLR4_5_2i05i05lwydykw8.R.inc(23453);position.set(Position.KEY_RESULT, sentence.substring(sentence.indexOf('#', 1) + 1));
                __CLR4_5_2i05i05lwydykw8.R.inc(23454);sendResponse(channel, "#AM#", 1);
                __CLR4_5_2i05i05lwydykw8.R.inc(23455);return position;
            }
        }}

        }}}}}__CLR4_5_2i05i05lwydykw8.R.inc(23456);return null;
    }finally{__CLR4_5_2i05i05lwydykw8.R.flushNeeded();}}

}
