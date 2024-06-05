/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TotemProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e6we6wlx1dvey5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,18536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TotemProtocolDecoder(TotemProtocol protocol) {
        super(protocol);__CLR4_5_2e6we6wlx1dvey5.R.inc(18393);try{__CLR4_5_2e6we6wlx1dvey5.R.inc(18392);
    }finally{__CLR4_5_2e6we6wlx1dvey5.R.flushNeeded();}}

    private static final Pattern PATTERN1 = new PatternBuilder()
            .text("$$")                          // header
            .number("xx")                        // length
            .number("(d+)|")                     // imei
            .expression("(..)")                  // alarm
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).d+,")          // time
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd)")              // date
            .expression("[^*]*").text("*")
            .number("xx|")                       // checksum
            .number("d+.d+|")                    // pdop
            .number("(d+.d+)|")                  // hdop
            .number("d+.d+|")                    // vdop
            .number("(d+)|")                     // io status
            .number("d+|")                       // time
            .number("d")                         // charged
            .number("(ddd)")                     // battery
            .number("(dddd)|")                   // power
            .number("(d+)|").optional()          // adc
            .number("x*(xxxx)")                  // lac
            .number("(xxxx)|")                   // cid
            .number("(d+)|")                     // temperature
            .number("(d+.d+)|")                  // odometer
            .number("d+|")                       // serial number
            .any()
            .number("xxxx")                      // checksum
            .any()
            .compile();

    private static final Pattern PATTERN2 = new PatternBuilder()
            .text("$$")                          // header
            .number("xx")                        // length
            .number("(d+)|")                     // imei
            .expression("(..)")                  // alarm type
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .number("(dd)(dd)(dd)|")             // time
            .expression("([AV])|")               // validity
            .number("(d+)(dd.d+)|")              // latitude
            .expression("([NS])|")
            .number("(d+)(dd.d+)|")              // longitude
            .expression("([EW])|")
            .number("(d+.d+)?|")                 // speed
            .number("(d+)?|")                    // course
            .number("(d+.d+)|")                  // hdop
            .number("(d+)|")                     // io status
            .number("d")                         // charged
            .number("(dd)")                      // battery
            .number("(dd)|")                     // external power
            .number("(d+)|")                     // adc
            .number("(xxxx)")                    // lac
            .number("(xxxx)|")                   // cid
            .number("(d+)|")                     // temperature
            .number("(d+.d+)|")                  // odometer
            .number("d+|")                       // serial number
            .number("xxxx")                      // checksum
            .any()
            .compile();

    private static final Pattern PATTERN3 = new PatternBuilder()
            .text("$$")                          // header
            .number("xx")                        // length
            .number("(d+)|")                     // imei
            .expression("(..)")                  // alarm type
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd)")              // time
            .number("(xxxx)")                    // io status
            .expression("[01]")                  // charging
            .number("(dd)")                      // battery
            .number("(dd)")                      // external power
            .number("(dddd)")                    // adc 1
            .number("(dddd)")                    // adc 2
            .number("(ddd)")                     // temperature 1
            .number("(ddd)")                     // temperature 2
            .number("(xxxx)")                    // lac
            .number("(xxxx)")                    // cid
            .expression("([AV])")                // validity
            .number("(dd)")                      // satellites
            .number("(ddd)")                     // course
            .number("(ddd)")                     // speed
            .number("(dd.d)")                    // pdop
            .number("(d{7})")                    // odometer
            .number("(dd)(dd.dddd)([NS])")       // latitude
            .number("(ddd)(dd.dddd)([EW])")      // longitude
            .number("dddd")                      // serial number
            .number("xxxx")                      // checksum
            .any()
            .compile();

    private static final Pattern PATTERN4 = new PatternBuilder()
            .text("$$")                          // header
            .number("dddd")                      // length
            .text("AA")                          // type
            .number("(d+)|")                     // imei
            .number("(x{8})")                    // status
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd)")              // time
            .number("(dd)")                      // battery
            .number("(dd)")                      // external power
            .number("(dddd)")                    // adc 1
            .groupBegin()
            .groupBegin()
            .number("(dddd)")                    // adc 2
            .number("(dddd)")                    // adc 3
            .number("(dddd)")                    // adc 4
            .groupEnd("?")
            .number("(dddd)")                    // temperature 1
            .number("(dddd)")                    // temperature 2
            .groupEnd("?")
            .number("(xxxx)")                    // lac
            .number("(xxxx)")                    // cid
            .number("(dd)")                      // satellites
            .number("(dd)")                      // gsm
            .number("(ddd)")                     // course
            .number("(ddd)")                     // speed
            .number("(dd.d)")                    // hdop
            .number("(d{7})")                    // odometer
            .number("(dd)(dd.dddd)([NS])")       // latitude
            .number("(ddd)(dd.dddd)([EW])")      // longitude
            .number("dddd")                      // serial number
            .number("xx")                        // checksum
            .any()
            .compile();

    private String decodeAlarm(Short value) {try{__CLR4_5_2e6we6wlx1dvey5.R.inc(18394);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2e6we6wlx1dvey5.R.inc(18395);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18396);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18397);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18398);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18399);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18400);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18401);return Position.ALARM_OVERSPEED;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18402);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18403);return Position.ALARM_GEOFENCE_EXIT;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18404);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18405);return Position.ALARM_GEOFENCE_ENTER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6we6wlx1dvey5.R.inc(18406);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18407);return null;
        }
    }finally{__CLR4_5_2e6we6wlx1dvey5.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e6we6wlx1dvey5.R.inc(18408);

        __CLR4_5_2e6we6wlx1dvey5.R.inc(18409);String sentence = (String) msg;

        // Determine format
        __CLR4_5_2e6we6wlx1dvey5.R.inc(18410);Pattern pattern = PATTERN3;
        __CLR4_5_2e6we6wlx1dvey5.R.inc(18411);if ((((sentence.indexOf("AA") == 6)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18412)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18413)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18414);pattern = PATTERN4;
        } }else {__CLR4_5_2e6we6wlx1dvey5.R.inc(18415);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18416)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18417)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18418);pattern = PATTERN1;
        } }else {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18419);int index = sentence.indexOf('|');
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18420);if ((((index != -1 && sentence.indexOf('|', index + 1) != -1)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18421)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18422)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18423);pattern = PATTERN2;
            }
        }}

        }}__CLR4_5_2e6we6wlx1dvey5.R.inc(18424);Parser parser = new Parser(pattern, sentence);
        __CLR4_5_2e6we6wlx1dvey5.R.inc(18425);if ((((!parser.matches())&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18426)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18427)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18428);return null;
        }

        }__CLR4_5_2e6we6wlx1dvey5.R.inc(18429);Position position = new Position();
        __CLR4_5_2e6we6wlx1dvey5.R.inc(18430);position.setProtocol(getProtocolName());

        __CLR4_5_2e6we6wlx1dvey5.R.inc(18431);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2e6we6wlx1dvey5.R.inc(18432);if ((((deviceSession == null)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18433)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18434)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18435);return null;
        }
        }__CLR4_5_2e6we6wlx1dvey5.R.inc(18436);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2e6we6wlx1dvey5.R.inc(18437);if ((((pattern == PATTERN1 || pattern == PATTERN2)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18438)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18439)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18440);if ((((parser.hasNext())&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18441)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18442)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18443);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }
            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18444);DateBuilder dateBuilder = new DateBuilder();
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18445);int year = 0;
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18446);if ((((pattern == PATTERN2)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18447)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18448)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18449);dateBuilder.setDay(parser.nextInt()).setMonth(parser.nextInt());
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18450);year = parser.nextInt();
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18451);dateBuilder.setYear(year);
            }
            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18452);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18453);position.setValid(parser.next().equals("A"));
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18454);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18455);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18456);position.setSpeed(parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18457);position.setCourse(parser.nextDouble());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18458);if ((((pattern == PATTERN1)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18459)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18460)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18461);dateBuilder.setDay(parser.nextInt()).setMonth(parser.nextInt());
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18462);year = parser.nextInt();
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18463);dateBuilder.setYear(year);
            }
            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18464);if ((((year == 0)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18465)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18466)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18467);return null; // ignore invalid data
            }
            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18468);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18469);position.set(Position.KEY_HDOP, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18470);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18471);position.set(Position.KEY_BATTERY, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18472);position.set(Position.KEY_POWER, parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18473);position.set(Position.PREFIX_ADC + 1, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18474);int lac = parser.nextInt(16);
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18475);int cid = parser.nextInt(16);
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18476);if ((((lac != 0 && cid != 0)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18477)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18478)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18479);position.setNetwork(new Network(CellTower.fromLacCid(lac, cid)));
            }

            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18480);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18481);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);

        } }else {__CLR4_5_2e6we6wlx1dvey5.R.inc(18482);if ((((pattern == PATTERN3)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18483)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18484)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18485);if ((((parser.hasNext())&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18486)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18487)==0&false))) {{
                __CLR4_5_2e6we6wlx1dvey5.R.inc(18488);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }
            }__CLR4_5_2e6we6wlx1dvey5.R.inc(18489);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18490);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18491);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18492);position.set(Position.KEY_BATTERY, parser.nextDouble() / 10);
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18493);position.set(Position.KEY_POWER, parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18494);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18495);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18496);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18497);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18498);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18499);position.setValid(parser.next().equals("A"));
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18500);position.set(Position.KEY_SATELLITES, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18501);position.setCourse(parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18502);position.setSpeed(parser.nextDouble());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18503);position.set("pdop", parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18504);position.set(Position.KEY_ODOMETER, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18505);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18506);position.setLongitude(parser.nextCoordinate());

        } }else {__CLR4_5_2e6we6wlx1dvey5.R.inc(18507);if ((((pattern == PATTERN4)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18508)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18509)==0&false))) {{

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18510);position.set(Position.KEY_STATUS, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18511);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18512);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18513);position.set(Position.KEY_BATTERY, parser.nextDouble() / 10);
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18514);position.set(Position.KEY_POWER, parser.nextDouble());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18515);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18516);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18517);position.set(Position.PREFIX_ADC + 3, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18518);position.set(Position.PREFIX_ADC + 4, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18519);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18520);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18521);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18522);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18523);position.set(Position.KEY_RSSI, parser.nextInt());

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18524);position.setCourse(parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18525);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18526);position.set(Position.KEY_HDOP, parser.nextDouble());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18527);position.set(Position.KEY_ODOMETER, parser.nextInt() * 1000);

            __CLR4_5_2e6we6wlx1dvey5.R.inc(18528);position.setValid(true);
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18529);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18530);position.setLongitude(parser.nextCoordinate());

        }
        }}}__CLR4_5_2e6we6wlx1dvey5.R.inc(18531);if ((((channel != null)&&(__CLR4_5_2e6we6wlx1dvey5.R.iget(18532)!=0|true))||(__CLR4_5_2e6we6wlx1dvey5.R.iget(18533)==0&false))) {{
            __CLR4_5_2e6we6wlx1dvey5.R.inc(18534);channel.write("ACK OK\r\n");
        }
        }__CLR4_5_2e6we6wlx1dvey5.R.inc(18535);return position;
    }finally{__CLR4_5_2e6we6wlx1dvey5.R.flushNeeded();}}

}
