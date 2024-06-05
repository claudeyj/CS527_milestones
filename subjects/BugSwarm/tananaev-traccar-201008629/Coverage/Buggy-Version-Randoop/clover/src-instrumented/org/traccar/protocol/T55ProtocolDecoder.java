/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.socket.DatagramChannel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

public class T55ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2d8vd8vlx1dwkj6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,17325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T55ProtocolDecoder(T55Protocol protocol) {
        super(protocol);__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17168);try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17167);
    }finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).?d*,")         // time
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d{2,3})(dd.d+),")          // longitude
            .expression("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd),")             // date
            .expression("[^*]+")
            .text("*")
            .expression("[^,]+")
            .number(",(d+)")                     // satellites
            .number(",(d+)")                     // imei
            .number(",([01])")                   // ignition
            .number(",(d+)")                     // fuel
            .number(",(d+)").optional(5)         // battery
            .any()
            .compile();

    private static final Pattern PATTERN_GPGGA = new PatternBuilder()
            .text("$GPGGA,")
            .number("(dd)(dd)(dd).?d*,")         // time
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .expression("([EW]),")
            .any()
            .compile();

    private static final Pattern PATTERN_GPRMA = new PatternBuilder()
            .text("$GPRMA,")
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),,,")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .any()
            .compile();

    private static final Pattern PATTERN_TRCCR = new PatternBuilder()
            .text("$TRCCR,")
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd).?d*,")         // time
            .expression("([AV]),")               // validity
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(d+.d+),")                  // speed
            .number("(d+.d+),")                  // course
            .number("(-?d+.d+),")                // altitude
            .number("(d+.?d*),")                 // battery
            .any()
            .compile();

    private Position position = null;

    private Position decodeGprmc(
            DeviceSession deviceSession, String sentence, SocketAddress remoteAddress, Channel channel) {try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17169);

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17170);if ((((channel != null && !(channel instanceof DatagramChannel))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17171)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17172)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17173);channel.write("OK1\r\n");
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17174);Parser parser = new Parser(PATTERN_GPRMC, sentence);
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17175);if ((((!parser.matches())&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17176)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17177)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17178);return null;
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17179);Position position = new Position();
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17180);position.setProtocol(getProtocolName());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17181);if ((((deviceSession != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17182)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17183)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17184);position.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17185);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17186);position.setValid(parser.next().equals("A"));
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17187);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17188);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17189);position.setSpeed(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17190);position.setCourse(parser.nextDouble());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17191);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17192);position.setTime(dateBuilder.getDate());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17193);if ((((parser.hasNext(5))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17194)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17195)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17196);position.set(Position.KEY_SATELLITES, parser.next());

            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17197);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17198);if ((((deviceSession == null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17199)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17200)==0&false))) {{
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17201);return null;
            }
            }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17202);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17203);position.set(Position.KEY_IGNITION, parser.hasNext() && parser.next().equals("1"));
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17204);position.set(Position.KEY_FUEL, parser.nextInt());
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17205);position.set(Position.KEY_BATTERY, parser.nextInt());
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17206);if ((((deviceSession != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17207)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17208)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17209);return position;
        } }else {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17210);this.position = position; // save position
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17211);return null;
        }
    }}finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

    private Position decodeGpgga(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17212);

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17213);Parser parser = new Parser(PATTERN_GPGGA, sentence);
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17214);if ((((!parser.matches())&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17215)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17216)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17217);return null;
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17218);Position position = new Position();
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17219);position.setProtocol(getProtocolName());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17220);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17221);DateBuilder dateBuilder = new DateBuilder()
                .setCurrentDate()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17222);position.setTime(dateBuilder.getDate());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17223);position.setValid(true);
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17224);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17225);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17226);return position;
    }finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

    private Position decodeGprma(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17227);

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17228);Parser parser = new Parser(PATTERN_GPRMA, sentence);
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17229);if ((((!parser.matches())&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17230)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17231)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17232);return null;
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17233);Position position = new Position();
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17234);position.setProtocol(getProtocolName());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17235);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17236);position.setTime(new Date());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17237);position.setValid(parser.next().equals("A"));
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17238);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17239);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17240);position.setSpeed(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17241);position.setCourse(parser.nextDouble());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17242);return position;
    }finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

    private Position decodeTrccr(DeviceSession deviceSession, String sentence) {try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17243);

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17244);Parser parser = new Parser(PATTERN_TRCCR, sentence);
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17245);if ((((!parser.matches())&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17246)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17247)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17248);return null;
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17249);Position position = new Position();
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17250);position.setProtocol(getProtocolName());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17251);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17252);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17253);position.setTime(dateBuilder.getDate());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17254);position.setValid(parser.next().equals("A"));
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17255);position.setLatitude(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17256);position.setLongitude(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17257);position.setSpeed(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17258);position.setCourse(parser.nextDouble());
        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17259);position.setAltitude(parser.nextDouble());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17260);position.set(Position.KEY_BATTERY, parser.next());

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17261);return position;
    }finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17262);

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17263);String sentence = (String) msg;

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17264);DeviceSession deviceSession;

        __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17265);if ((((!sentence.startsWith("$") && sentence.contains("$"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17266)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17267)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17268);int index = sentence.indexOf("$");
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17269);String id = sentence.substring(0, index);
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17270);if ((((id.endsWith(","))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17271)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17272)==0&false))) {{
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17273);id = id.substring(0, id.length() - 1);
            } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17274);if ((((id.endsWith("/"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17275)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17276)==0&false))) {{
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17277);id = id.substring(id.indexOf('/') + 1, id.length() - 1);
            }
            }}__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17278);deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17279);sentence = sentence.substring(index);
        } }else {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17280);deviceSession = getDeviceSession(channel, remoteAddress);
        }

        }__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17281);if ((((sentence.startsWith("$PGID"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17282)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17283)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17284);getDeviceSession(channel, remoteAddress, sentence.substring(6, sentence.length() - 3));
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17285);if ((((sentence.startsWith("$PCPTI"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17286)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17287)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17288);getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.indexOf(",", 7)));
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17289);if ((((sentence.startsWith("IMEI"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17290)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17291)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17292);getDeviceSession(channel, remoteAddress, sentence.substring(5, sentence.length()));
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17293);if ((((sentence.startsWith("$GPFID"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17294)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17295)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17296);deviceSession = getDeviceSession(channel, remoteAddress, sentence.substring(7, sentence.length()));
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17297);if ((((deviceSession != null && position != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17298)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17299)==0&false))) {{
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17300);Position position = this.position;
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17301);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17302);this.position = null;
                __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17303);return position;
            }
        }} }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17304);if ((((sentence.matches("^[0-9A-F]+$"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17305)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17306)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17307);getDeviceSession(channel, remoteAddress, sentence);
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17308);if ((((sentence.startsWith("$GPRMC"))&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17309)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17310)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17311);return decodeGprmc(deviceSession, sentence, remoteAddress, channel);
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17312);if ((((sentence.startsWith("$GPGGA") && deviceSession != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17313)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17314)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17315);return decodeGpgga(deviceSession, sentence);
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17316);if ((((sentence.startsWith("$GPRMA") && deviceSession != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17317)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17318)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17319);return decodeGprma(deviceSession, sentence);
        } }else {__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17320);if ((((sentence.startsWith("$TRCCR") && deviceSession != null)&&(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17321)!=0|true))||(__CLR4_5_2d8vd8vlx1dwkj6.R.iget(17322)==0&false))) {{
            __CLR4_5_2d8vd8vlx1dwkj6.R.inc(17323);return decodeTrccr(deviceSession, sentence);
        }

        }}}}}}}}}__CLR4_5_2d8vd8vlx1dwkj6.R.inc(17324);return null;
    }finally{__CLR4_5_2d8vd8vlx1dwkj6.R.flushNeeded();}}

}
