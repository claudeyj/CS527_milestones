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

@java.lang.SuppressWarnings({"fallthrough"}) public class TotemProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2e6se6slx1e1m12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,18532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TotemProtocolDecoder(TotemProtocol protocol) {
        super(protocol);__CLR4_5_2e6se6slx1e1m12.R.inc(18389);try{__CLR4_5_2e6se6slx1e1m12.R.inc(18388);
    }finally{__CLR4_5_2e6se6slx1e1m12.R.flushNeeded();}}

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

    private String decodeAlarm(Short value) {try{__CLR4_5_2e6se6slx1e1m12.R.inc(18390);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2e6se6slx1e1m12.R.inc(18391);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18392);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18393);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18394);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18395);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18396);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18397);return Position.ALARM_OVERSPEED;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18398);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18399);return Position.ALARM_GEOFENCE_EXIT;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18400);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18401);return Position.ALARM_GEOFENCE_ENTER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2e6se6slx1e1m12.R.inc(18402);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e6se6slx1e1m12.R.inc(18403);return null;
        }
    }finally{__CLR4_5_2e6se6slx1e1m12.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2e6se6slx1e1m12.R.inc(18404);

        __CLR4_5_2e6se6slx1e1m12.R.inc(18405);String sentence = (String) msg;

        // Determine format
        __CLR4_5_2e6se6slx1e1m12.R.inc(18406);Pattern pattern = PATTERN3;
        __CLR4_5_2e6se6slx1e1m12.R.inc(18407);if ((((sentence.indexOf("AA") == 6)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18408)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18409)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18410);pattern = PATTERN4;
        } }else {__CLR4_5_2e6se6slx1e1m12.R.inc(18411);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18412)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18413)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18414);pattern = PATTERN1;
        } }else {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18415);int index = sentence.indexOf('|');
            __CLR4_5_2e6se6slx1e1m12.R.inc(18416);if ((((index != -1 && sentence.indexOf('|', index + 1) != -1)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18417)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18418)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18419);pattern = PATTERN2;
            }
        }}

        }}__CLR4_5_2e6se6slx1e1m12.R.inc(18420);Parser parser = new Parser(pattern, sentence);
        __CLR4_5_2e6se6slx1e1m12.R.inc(18421);if ((((!parser.matches())&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18422)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18423)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18424);return null;
        }

        }__CLR4_5_2e6se6slx1e1m12.R.inc(18425);Position position = new Position();
        __CLR4_5_2e6se6slx1e1m12.R.inc(18426);position.setProtocol(getProtocolName());

        __CLR4_5_2e6se6slx1e1m12.R.inc(18427);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2e6se6slx1e1m12.R.inc(18428);if ((((deviceSession == null)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18429)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18430)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18431);return null;
        }
        }__CLR4_5_2e6se6slx1e1m12.R.inc(18432);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2e6se6slx1e1m12.R.inc(18433);if ((((pattern == PATTERN1 || pattern == PATTERN2)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18434)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18435)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18436);if ((((parser.hasNext())&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18437)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18438)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18439);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }
            }__CLR4_5_2e6se6slx1e1m12.R.inc(18440);DateBuilder dateBuilder = new DateBuilder();
            __CLR4_5_2e6se6slx1e1m12.R.inc(18441);int year = 0;
            __CLR4_5_2e6se6slx1e1m12.R.inc(18442);if ((((pattern == PATTERN2)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18443)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18444)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18445);dateBuilder.setDay(parser.nextInt()).setMonth(parser.nextInt());
                __CLR4_5_2e6se6slx1e1m12.R.inc(18446);year = parser.nextInt();
                __CLR4_5_2e6se6slx1e1m12.R.inc(18447);dateBuilder.setYear(year);
            }
            }__CLR4_5_2e6se6slx1e1m12.R.inc(18448);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18449);position.setValid(parser.next().equals("A"));
            __CLR4_5_2e6se6slx1e1m12.R.inc(18450);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18451);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18452);position.setSpeed(parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18453);position.setCourse(parser.nextDouble());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18454);if ((((pattern == PATTERN1)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18455)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18456)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18457);dateBuilder.setDay(parser.nextInt()).setMonth(parser.nextInt());
                __CLR4_5_2e6se6slx1e1m12.R.inc(18458);year = parser.nextInt();
                __CLR4_5_2e6se6slx1e1m12.R.inc(18459);dateBuilder.setYear(year);
            }
            }__CLR4_5_2e6se6slx1e1m12.R.inc(18460);if ((((year == 0)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18461)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18462)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18463);return null; // ignore invalid data
            }
            }__CLR4_5_2e6se6slx1e1m12.R.inc(18464);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18465);position.set(Position.KEY_HDOP, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18466);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18467);position.set(Position.KEY_BATTERY, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18468);position.set(Position.KEY_POWER, parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18469);position.set(Position.PREFIX_ADC + 1, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18470);int lac = parser.nextInt(16);
            __CLR4_5_2e6se6slx1e1m12.R.inc(18471);int cid = parser.nextInt(16);
            __CLR4_5_2e6se6slx1e1m12.R.inc(18472);if ((((lac != 0 && cid != 0)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18473)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18474)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18475);position.setNetwork(new Network(CellTower.fromLacCid(lac, cid)));
            }

            }__CLR4_5_2e6se6slx1e1m12.R.inc(18476);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18477);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);

        } }else {__CLR4_5_2e6se6slx1e1m12.R.inc(18478);if ((((pattern == PATTERN3)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18479)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18480)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18481);if ((((parser.hasNext())&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18482)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18483)==0&false))) {{
                __CLR4_5_2e6se6slx1e1m12.R.inc(18484);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }
            }__CLR4_5_2e6se6slx1e1m12.R.inc(18485);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18486);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18487);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18488);position.set(Position.KEY_BATTERY, parser.nextDouble() / 10);
            __CLR4_5_2e6se6slx1e1m12.R.inc(18489);position.set(Position.KEY_POWER, parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18490);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18491);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18492);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18493);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18494);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2e6se6slx1e1m12.R.inc(18495);position.setValid(parser.next().equals("A"));
            __CLR4_5_2e6se6slx1e1m12.R.inc(18496);position.set(Position.KEY_SATELLITES, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18497);position.setCourse(parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18498);position.setSpeed(parser.nextDouble());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18499);position.set("pdop", parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18500);position.set(Position.KEY_ODOMETER, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18501);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18502);position.setLongitude(parser.nextCoordinate());

        } }else {__CLR4_5_2e6se6slx1e1m12.R.inc(18503);if ((((pattern == PATTERN4)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18504)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18505)==0&false))) {{

            __CLR4_5_2e6se6slx1e1m12.R.inc(18506);position.set(Position.KEY_STATUS, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18507);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18508);position.setTime(dateBuilder.getDate());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18509);position.set(Position.KEY_BATTERY, parser.nextDouble() / 10);
            __CLR4_5_2e6se6slx1e1m12.R.inc(18510);position.set(Position.KEY_POWER, parser.nextDouble());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18511);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18512);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18513);position.set(Position.PREFIX_ADC + 3, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18514);position.set(Position.PREFIX_ADC + 4, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18515);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18516);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18517);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2e6se6slx1e1m12.R.inc(18518);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18519);position.set(Position.KEY_RSSI, parser.nextInt());

            __CLR4_5_2e6se6slx1e1m12.R.inc(18520);position.setCourse(parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18521);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));

            __CLR4_5_2e6se6slx1e1m12.R.inc(18522);position.set(Position.KEY_HDOP, parser.nextDouble());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18523);position.set(Position.KEY_ODOMETER, parser.nextInt() * 1000);

            __CLR4_5_2e6se6slx1e1m12.R.inc(18524);position.setValid(true);
            __CLR4_5_2e6se6slx1e1m12.R.inc(18525);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2e6se6slx1e1m12.R.inc(18526);position.setLongitude(parser.nextCoordinate());

        }
        }}}__CLR4_5_2e6se6slx1e1m12.R.inc(18527);if ((((channel != null)&&(__CLR4_5_2e6se6slx1e1m12.R.iget(18528)!=0|true))||(__CLR4_5_2e6se6slx1e1m12.R.iget(18529)==0&false))) {{
            __CLR4_5_2e6se6slx1e1m12.R.inc(18530);channel.write("ACK OK\r\n");
        }
        }__CLR4_5_2e6se6slx1e1m12.R.inc(18531);return position;
    }finally{__CLR4_5_2e6se6slx1e1m12.R.flushNeeded();}}

}
