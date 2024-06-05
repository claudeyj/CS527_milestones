/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateBuilder;
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

public class WialonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fhzfhzlx1e0ixx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,20206,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WialonProtocolDecoder(WialonProtocol protocol) {
        super(protocol);__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20088);try{__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20087);
    }finally{__CLR4_5_2fhzfhzlx1e0ixx.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(dd)(dd)(dd);")             // date (ddmmyy)
            .number("(dd)(dd)(dd);")             // time
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

    private void sendResponse(Channel channel, String prefix, Integer number) {try{__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20089);
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20090);if ((((channel != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20091)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20092)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20093);StringBuilder response = new StringBuilder(prefix);
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20094);if ((((number != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20095)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20096)==0&false))) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20097);response.append(number);
            }
            }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20098);response.append("\r\n");
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20099);channel.write(response.toString());
        }
    }}finally{__CLR4_5_2fhzfhzlx1e0ixx.R.flushNeeded();}}

    private Position decodePosition(Channel channel, SocketAddress remoteAddress, String substring) {try{__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20100);

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20101);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20102);if ((((deviceSession == null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20103)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20104)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20105);return null;
        }

        }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20106);Parser parser = new Parser(PATTERN, substring);
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20107);if ((((!parser.matches())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20108)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20109)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20110);return null;
        }

        }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20111);Position position = new Position();
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20112);position.setProtocol(getProtocolName());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20113);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20114);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20115);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20116);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20117);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20118);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20119);position.setCourse(parser.nextDouble());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20120);position.setAltitude(parser.nextDouble());

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20121);if ((((parser.hasNext())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20122)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20123)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20124);int satellites = parser.nextInt();
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20125);position.setValid(satellites >= 3);
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20126);position.set(Position.KEY_SATELLITES, satellites);
        }

        }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20127);position.set(Position.KEY_HDOP, parser.next());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20128);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20129);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20130);if ((((parser.hasNext())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20131)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20132)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20133);String[] values = parser.next().split(",");
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20134);for (int i = 0; (((i < values.length)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20135)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20136)==0&false)); i++) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20137);position.set(Position.PREFIX_ADC + (i + 1), values[i]);
            }
        }}

        }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20138);position.set(Position.KEY_RFID, parser.next());

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20139);if ((((parser.hasNext())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20140)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20141)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20142);String[] values = parser.next().split(",");
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20143);for (String param : values) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20144);Matcher paramParser = Pattern.compile("(.*):[1-3]:(.*)").matcher(param);
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20145);if ((((paramParser.matches())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20146)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20147)==0&false))) {{
                    __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20148);position.set(paramParser.group(1).toLowerCase(), paramParser.group(2));
                }
            }}
        }}

        }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20149);return position;
    }finally{__CLR4_5_2fhzfhzlx1e0ixx.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20150);

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20151);String sentence = (String) msg;

        __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20152);if ((((sentence.startsWith("#L#"))&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20153)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20154)==0&false))) {{

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20155);String imei = sentence.substring(3, sentence.indexOf(';'));
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20156);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20157);if ((((deviceSession != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20158)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20159)==0&false))) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20160);sendResponse(channel, "#AL#", 1);
            }

        }} }else {__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20161);if ((((sentence.startsWith("#P#"))&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20162)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20163)==0&false))) {{

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20164);sendResponse(channel, "#AP#", null); // heartbeat

        } }else {__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20165);if ((((sentence.startsWith("#SD#") || sentence.startsWith("#D#"))&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20166)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20167)==0&false))) {{

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20168);Position position = decodePosition(
                    channel, remoteAddress, sentence.substring(sentence.indexOf('#', 1) + 1));

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20169);if ((((position != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20170)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20171)==0&false))) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20172);sendResponse(channel, "#AD#", 1);
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20173);return position;
            }

        }} }else {__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20174);if ((((sentence.startsWith("#B#"))&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20175)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20176)==0&false))) {{

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20177);String[] messages = sentence.substring(sentence.indexOf('#', 1) + 1).split("\\|");
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20178);List<Position> positions = new LinkedList<>();

            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20179);for (String message : messages) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20180);Position position = decodePosition(channel, remoteAddress, message);
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20181);if ((((position != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20182)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20183)==0&false))) {{
                    __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20184);positions.add(position);
                }
            }}

            }__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20185);sendResponse(channel, "#AB#", messages.length);
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20186);if ((((!positions.isEmpty())&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20187)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20188)==0&false))) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20189);return positions;
            }

        }} }else {__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20190);if ((((sentence.startsWith("#M#"))&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20191)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20192)==0&false))) {{
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20193);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20194);if ((((deviceSession != null)&&(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20195)!=0|true))||(__CLR4_5_2fhzfhzlx1e0ixx.R.iget(20196)==0&false))) {{
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20197);Position position = new Position();
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20198);position.setProtocol(getProtocolName());
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20199);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20200);getLastLocation(position, new Date());
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20201);position.setValid(false);
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20202);position.set(Position.KEY_RESULT, sentence.substring(sentence.indexOf('#', 1) + 1));
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20203);sendResponse(channel, "#AM#", 1);
                __CLR4_5_2fhzfhzlx1e0ixx.R.inc(20204);return position;
            }
        }}

        }}}}}__CLR4_5_2fhzfhzlx1e0ixx.R.inc(20205);return null;
    }finally{__CLR4_5_2fhzfhzlx1e0ixx.R.flushNeeded();}}

}
