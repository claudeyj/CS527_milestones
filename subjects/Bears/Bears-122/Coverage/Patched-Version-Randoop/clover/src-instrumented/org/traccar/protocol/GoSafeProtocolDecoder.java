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

public class GoSafeProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29v19v1lwye64vv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,12883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GoSafeProtocolDecoder(GoSafeProtocol protocol) {
        super(protocol);__CLR4_5_29v19v1lwye64vv.R.inc(12782);try{__CLR4_5_29v19v1lwye64vv.R.inc(12781);
    }finally{__CLR4_5_29v19v1lwye64vv.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*GS")                         // header
            .number("d+,")                       // protocol version
            .number("(d+),")                     // imei
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
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
            .number(";(d+.d+)").optional()       // vdop
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
            .number("(dd)(dd)(dd);")             // time (hhmmss)
            .number("d;").optional()             // fix type
            .expression("([AV]);")               // validity
            .number("([NS])(d+.d+);")            // latitude
            .number("([EW])(d+.d+);")            // longitude
            .number("(d+)?;")                    // speed
            .number("(d+);")                     // course
            .number("(d+.?d*)").optional()       // hdop
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .compile();

    private Position decodePosition(DeviceSession deviceSession, Parser parser, Date time) {try{__CLR4_5_29v19v1lwye64vv.R.inc(12783);

        __CLR4_5_29v19v1lwye64vv.R.inc(12784);Position position = new Position();
        __CLR4_5_29v19v1lwye64vv.R.inc(12785);position.setProtocol(getProtocolName());
        __CLR4_5_29v19v1lwye64vv.R.inc(12786);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29v19v1lwye64vv.R.inc(12787);if ((((time != null)&&(__CLR4_5_29v19v1lwye64vv.R.iget(12788)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12789)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12790);position.setTime(time);
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12791);position.set(Position.KEY_EVENT, parser.next());

        __CLR4_5_29v19v1lwye64vv.R.inc(12792);position.setValid(parser.next().equals("A"));
        __CLR4_5_29v19v1lwye64vv.R.inc(12793);position.set(Position.KEY_SATELLITES, parser.nextInt());

        __CLR4_5_29v19v1lwye64vv.R.inc(12794);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_29v19v1lwye64vv.R.inc(12795);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_29v19v1lwye64vv.R.inc(12796);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_29v19v1lwye64vv.R.inc(12797);position.setCourse(parser.nextDouble(0));
        __CLR4_5_29v19v1lwye64vv.R.inc(12798);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_29v19v1lwye64vv.R.inc(12799);position.set(Position.KEY_HDOP, parser.nextDouble(0));
        __CLR4_5_29v19v1lwye64vv.R.inc(12800);position.set(Position.KEY_VDOP, parser.nextDouble(0));

        __CLR4_5_29v19v1lwye64vv.R.inc(12801);if ((((parser.hasNext(5))&&(__CLR4_5_29v19v1lwye64vv.R.iget(12802)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12803)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12804);position.setNetwork(new Network(CellTower.from(parser.nextInt(0), parser.nextInt(0),
                    parser.nextHexInt(0), parser.nextHexInt(0), parser.nextInt(0))));
        }
        }__CLR4_5_29v19v1lwye64vv.R.inc(12805);if ((((parser.hasNext())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12806)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12807)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12808);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
        }
        }__CLR4_5_29v19v1lwye64vv.R.inc(12809);position.set(Position.KEY_POWER, parser.nextDouble());
        __CLR4_5_29v19v1lwye64vv.R.inc(12810);position.set(Position.KEY_BATTERY, parser.nextDouble());

        __CLR4_5_29v19v1lwye64vv.R.inc(12811);if ((((parser.hasNext(6))&&(__CLR4_5_29v19v1lwye64vv.R.iget(12812)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12813)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12814);long status = parser.nextLong(16, 0);
            __CLR4_5_29v19v1lwye64vv.R.inc(12815);position.set(Position.KEY_IGNITION, BitUtil.check(status, 13));
            __CLR4_5_29v19v1lwye64vv.R.inc(12816);position.set(Position.KEY_STATUS, status);
            __CLR4_5_29v19v1lwye64vv.R.inc(12817);position.set("ioStatus", parser.next());
            __CLR4_5_29v19v1lwye64vv.R.inc(12818);position.set(Position.KEY_GEOFENCE, parser.next() + parser.next());
            __CLR4_5_29v19v1lwye64vv.R.inc(12819);position.set("eventStatus", parser.next());
            __CLR4_5_29v19v1lwye64vv.R.inc(12820);position.set("packetType", parser.next());
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12821);if ((((parser.hasNext())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12822)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12823)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12824);position.set("eventData", parser.next());
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12825);if ((((parser.hasNext())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12826)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12827)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12828);position.set("obd", parser.next());
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12829);if ((((parser.hasNext())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12830)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12831)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12832);position.set("tagData", parser.next());
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12833);return position;
    }finally{__CLR4_5_29v19v1lwye64vv.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29v19v1lwye64vv.R.inc(12834);

        __CLR4_5_29v19v1lwye64vv.R.inc(12835);if ((((channel != null)&&(__CLR4_5_29v19v1lwye64vv.R.iget(12836)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12837)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12838);channel.write("1234");
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12839);String sentence = (String) msg;
        __CLR4_5_29v19v1lwye64vv.R.inc(12840);Pattern pattern = PATTERN;
        __CLR4_5_29v19v1lwye64vv.R.inc(12841);if ((((sentence.startsWith("*GS02"))&&(__CLR4_5_29v19v1lwye64vv.R.iget(12842)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12843)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12844);pattern = PATTERN_OLD;
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12845);Parser parser = new Parser(pattern, (String) msg);
        __CLR4_5_29v19v1lwye64vv.R.inc(12846);if ((((!parser.matches())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12847)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12848)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12849);return null;
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12850);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29v19v1lwye64vv.R.inc(12851);if ((((deviceSession == null)&&(__CLR4_5_29v19v1lwye64vv.R.iget(12852)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12853)==0&false))) {{
            __CLR4_5_29v19v1lwye64vv.R.inc(12854);return null;
        }

        }__CLR4_5_29v19v1lwye64vv.R.inc(12855);if ((((pattern == PATTERN_OLD)&&(__CLR4_5_29v19v1lwye64vv.R.iget(12856)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12857)==0&false))) {{

            __CLR4_5_29v19v1lwye64vv.R.inc(12858);Position position = new Position();
            __CLR4_5_29v19v1lwye64vv.R.inc(12859);position.setProtocol(getProtocolName());
            __CLR4_5_29v19v1lwye64vv.R.inc(12860);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29v19v1lwye64vv.R.inc(12861);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_29v19v1lwye64vv.R.inc(12862);position.setValid(parser.next().equals("A"));
            __CLR4_5_29v19v1lwye64vv.R.inc(12863);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
            __CLR4_5_29v19v1lwye64vv.R.inc(12864);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
            __CLR4_5_29v19v1lwye64vv.R.inc(12865);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
            __CLR4_5_29v19v1lwye64vv.R.inc(12866);position.setCourse(parser.nextDouble(0));

            __CLR4_5_29v19v1lwye64vv.R.inc(12867);position.set(Position.KEY_HDOP, parser.next());

            __CLR4_5_29v19v1lwye64vv.R.inc(12868);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_29v19v1lwye64vv.R.inc(12869);position.setTime(dateBuilder.getDate());

            __CLR4_5_29v19v1lwye64vv.R.inc(12870);return position;

        } }else {{

            __CLR4_5_29v19v1lwye64vv.R.inc(12871);Date time = null;
            __CLR4_5_29v19v1lwye64vv.R.inc(12872);if ((((parser.hasNext(6))&&(__CLR4_5_29v19v1lwye64vv.R.iget(12873)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12874)==0&false))) {{
                __CLR4_5_29v19v1lwye64vv.R.inc(12875);time = parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY);
            }

            }__CLR4_5_29v19v1lwye64vv.R.inc(12876);List<Position> positions = new LinkedList<>();
            __CLR4_5_29v19v1lwye64vv.R.inc(12877);Parser itemParser = new Parser(PATTERN_ITEM, parser.next());
            __CLR4_5_29v19v1lwye64vv.R.inc(12878);while ((((itemParser.find())&&(__CLR4_5_29v19v1lwye64vv.R.iget(12879)!=0|true))||(__CLR4_5_29v19v1lwye64vv.R.iget(12880)==0&false))) {{
                __CLR4_5_29v19v1lwye64vv.R.inc(12881);positions.add(decodePosition(deviceSession, itemParser, time));
            }

            }__CLR4_5_29v19v1lwye64vv.R.inc(12882);return positions;

        }
    }}finally{__CLR4_5_29v19v1lwye64vv.R.flushNeeded();}}

}
