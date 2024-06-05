/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class GoSafeProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28em8emlx1e0gzr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,10996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GoSafeProtocolDecoder(GoSafeProtocol protocol) {
        super(protocol);__CLR4_5_28em8emlx1e0gzr.R.inc(10895);try{__CLR4_5_28em8emlx1e0gzr.R.inc(10894);
    }finally{__CLR4_5_28em8emlx1e0gzr.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*GS")                         // header
            .number("d+,")                       // protocol version
            .number("(d+),")                     // imei
            .number("(dd)(dd)(dd)")              // time
            .number("(dd)(dd)(dd),")             // date
            .expression("(.*)#?")                // data
            .compile();

    private static final Pattern PATTERN_ITEM = new PatternBuilder()
            .number("(x+)?,").optional()         // event
            .groupBegin()
            .text("SYS:")
            .expression("[^,]*,")
            .groupEnd("?")
            .groupBegin()
            .text("GPS:")
            .expression("([AV]);")               // validity
            .number("(d+);")                     // satellites
            .number("([NS])(d+.d+);")            // latitude
            .number("([EW])(d+.d+);")            // longitude
            .number("(d+)?;")                    // speed
            .number("(d+);")                     // course
            .number("(d+);")                     // altitude
            .number("(d+.d+)")                   // hdop
            .number("(?:;d+.d+)?")               // vdop
            .expression(",?")
            .groupEnd()
            .groupBegin()
            .text("GSM:")
            .number("d*;")                       // registration
            .number("d*;")                       // gsm signal
            .number("(d+);")                     // mcc
            .number("(d+);")                     // mnc
            .number("(x+);")                     // lac
            .number("(x+);")                     // cid
            .number("(-d+)")                     // rssi
            .expression("[^,]*,?")
            .groupEnd("?")
            .groupBegin()
            .text("COT:")
            .number("(d+)")                      // odometer
            .number("(?:;d+:d+:d+)?")            // engine hours
            .expression(",?")
            .groupEnd("?")
            .groupBegin()
            .text("ADC:")
            .number("(d+.d+)")                   // power
            .number("(?:;(d+.d+))?,?")           // battery
            .groupEnd("?")
            .groupBegin()
            .text("DTT:")
            .number("(x+);")                     // status
            .number("(x+)?;")                    // io
            .number("(x+);")                     // geo-fence 0-119
            .number("(x+);")                     // geo-fence 120-155
            .number("(x+)")                      // event status
            .number("(?:;(x+))?,?")              // packet type
            .groupEnd("?")
            .groupBegin()
            .text("ETD:").expression("([^,]+),?")
            .groupEnd("?")
            .groupBegin()
            .text("OBD:")
            .number("(x+),?")
            .groupEnd("?")
            .groupBegin()
            .text("FUL:").expression("[^,]*,?")
            .groupEnd("?")
            .groupBegin()
            .text("TRU:").expression("[^,]*,?")
            .groupEnd("?")
            .groupBegin()
            .text("TAG:").expression("([^,]+),?")
            .groupEnd("?")
            .compile();

    private static final Pattern PATTERN_OLD = new PatternBuilder()
            .text("*GS")                         // header
            .number("d+,")                       // protocol version
            .number("(d+),")                     // imei
            .text("GPS:")
            .number("(dd)(dd)(dd);")             // time
            .number("d;").optional()             // fix type
            .expression("([AV]);")               // validity
            .number("([NS])(d+.d+);")            // latitude
            .number("([EW])(d+.d+);")            // longitude
            .number("(d+)?;")                    // speed
            .number("(d+);")                     // course
            .number("(d+.?d*)").optional()       // hdop
            .number("(dd)(dd)(dd)")              // date
            .any()
            .compile();

    private Position decodePosition(DeviceSession deviceSession, Parser parser, Date time) {try{__CLR4_5_28em8emlx1e0gzr.R.inc(10896);

        __CLR4_5_28em8emlx1e0gzr.R.inc(10897);Position position = new Position();
        __CLR4_5_28em8emlx1e0gzr.R.inc(10898);position.setProtocol(getProtocolName());
        __CLR4_5_28em8emlx1e0gzr.R.inc(10899);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10900);if ((((time != null)&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10901)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10902)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10903);position.setTime(time);
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10904);position.set(Position.KEY_EVENT, parser.next());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10905);position.setValid(parser.next().equals("A"));
        __CLR4_5_28em8emlx1e0gzr.R.inc(10906);position.set(Position.KEY_SATELLITES, parser.next());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10907);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_28em8emlx1e0gzr.R.inc(10908);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_28em8emlx1e0gzr.R.inc(10909);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_28em8emlx1e0gzr.R.inc(10910);position.setCourse(parser.nextDouble());
        __CLR4_5_28em8emlx1e0gzr.R.inc(10911);position.setAltitude(parser.nextDouble());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10912);position.set(Position.KEY_HDOP, parser.next());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10913);if ((((parser.hasNext(5))&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10914)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10915)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10916);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16), parser.nextInt())));
        }
        }__CLR4_5_28em8emlx1e0gzr.R.inc(10917);if ((((parser.hasNext())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10918)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10919)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10920);position.set(Position.KEY_ODOMETER, parser.nextInt());
        }
        }__CLR4_5_28em8emlx1e0gzr.R.inc(10921);position.set(Position.KEY_POWER, parser.next());
        __CLR4_5_28em8emlx1e0gzr.R.inc(10922);position.set(Position.KEY_BATTERY, parser.next());

        __CLR4_5_28em8emlx1e0gzr.R.inc(10923);if ((((parser.hasNext(6))&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10924)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10925)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10926);long status = parser.nextLong(16);
            __CLR4_5_28em8emlx1e0gzr.R.inc(10927);position.set(Position.KEY_IGNITION, BitUtil.check(status, 13));
            __CLR4_5_28em8emlx1e0gzr.R.inc(10928);position.set(Position.KEY_STATUS, status);
            __CLR4_5_28em8emlx1e0gzr.R.inc(10929);position.set("ioStatus", parser.next());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10930);position.set(Position.KEY_GEOFENCE, parser.next() + parser.next());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10931);position.set("eventStatus", parser.next());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10932);position.set("packetType", parser.next());
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10933);if ((((parser.hasNext())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10934)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10935)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10936);position.set("eventData", parser.next());
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10937);if ((((parser.hasNext())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10938)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10939)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10940);position.set("obd", parser.next());
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10941);if ((((parser.hasNext())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10942)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10943)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10944);position.set("tagData", parser.next());
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10945);return position;
    }finally{__CLR4_5_28em8emlx1e0gzr.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28em8emlx1e0gzr.R.inc(10946);

        __CLR4_5_28em8emlx1e0gzr.R.inc(10947);if ((((channel != null)&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10948)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10949)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10950);channel.write("1234");
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10951);String sentence = (String) msg;
        __CLR4_5_28em8emlx1e0gzr.R.inc(10952);Pattern pattern = PATTERN;
        __CLR4_5_28em8emlx1e0gzr.R.inc(10953);if ((((sentence.startsWith("*GS02"))&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10954)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10955)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10956);pattern = PATTERN_OLD;
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10957);Parser parser = new Parser(pattern, (String) msg);
        __CLR4_5_28em8emlx1e0gzr.R.inc(10958);if ((((!parser.matches())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10959)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10960)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10961);return null;
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10962);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_28em8emlx1e0gzr.R.inc(10963);if ((((deviceSession == null)&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10964)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10965)==0&false))) {{
            __CLR4_5_28em8emlx1e0gzr.R.inc(10966);return null;
        }

        }__CLR4_5_28em8emlx1e0gzr.R.inc(10967);if ((((pattern == PATTERN_OLD)&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10968)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10969)==0&false))) {{

            __CLR4_5_28em8emlx1e0gzr.R.inc(10970);Position position = new Position();
            __CLR4_5_28em8emlx1e0gzr.R.inc(10971);position.setProtocol(getProtocolName());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10972);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28em8emlx1e0gzr.R.inc(10973);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_28em8emlx1e0gzr.R.inc(10974);position.setValid(parser.next().equals("A"));
            __CLR4_5_28em8emlx1e0gzr.R.inc(10975);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
            __CLR4_5_28em8emlx1e0gzr.R.inc(10976);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
            __CLR4_5_28em8emlx1e0gzr.R.inc(10977);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
            __CLR4_5_28em8emlx1e0gzr.R.inc(10978);position.setCourse(parser.nextDouble());

            __CLR4_5_28em8emlx1e0gzr.R.inc(10979);position.set(Position.KEY_HDOP, parser.next());

            __CLR4_5_28em8emlx1e0gzr.R.inc(10980);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10981);position.setTime(dateBuilder.getDate());

            __CLR4_5_28em8emlx1e0gzr.R.inc(10982);return position;

        } }else {{

            __CLR4_5_28em8emlx1e0gzr.R.inc(10983);Date time = null;
            __CLR4_5_28em8emlx1e0gzr.R.inc(10984);if ((((parser.hasNext(6))&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10985)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10986)==0&false))) {{
                __CLR4_5_28em8emlx1e0gzr.R.inc(10987);DateBuilder dateBuilder = new DateBuilder()
                        .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                        .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
                __CLR4_5_28em8emlx1e0gzr.R.inc(10988);time = dateBuilder.getDate();
            }

            }__CLR4_5_28em8emlx1e0gzr.R.inc(10989);List<Position> positions = new LinkedList<>();
            __CLR4_5_28em8emlx1e0gzr.R.inc(10990);Parser itemParser = new Parser(PATTERN_ITEM, parser.next());
            __CLR4_5_28em8emlx1e0gzr.R.inc(10991);while ((((itemParser.find())&&(__CLR4_5_28em8emlx1e0gzr.R.iget(10992)!=0|true))||(__CLR4_5_28em8emlx1e0gzr.R.iget(10993)==0&false))) {{
                __CLR4_5_28em8emlx1e0gzr.R.inc(10994);positions.add(decodePosition(deviceSession, itemParser, time));
            }

            }__CLR4_5_28em8emlx1e0gzr.R.inc(10995);return positions;

        }
    }}finally{__CLR4_5_28em8emlx1e0gzr.R.flushNeeded();}}

}
