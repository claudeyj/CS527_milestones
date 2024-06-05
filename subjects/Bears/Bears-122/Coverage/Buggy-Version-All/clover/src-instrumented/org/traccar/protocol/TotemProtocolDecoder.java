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

@java.lang.SuppressWarnings({"fallthrough"}) public class TotemProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gglggllwydzqvv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,21487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TotemProtocolDecoder(TotemProtocol protocol) {
        super(protocol);__CLR4_5_2gglggllwydzqvv.R.inc(21334);try{__CLR4_5_2gglggllwydzqvv.R.inc(21333);
    }finally{__CLR4_5_2gglggllwydzqvv.R.flushNeeded();}}

    private static final Pattern PATTERN1 = new PatternBuilder()
            .text("$$")                          // header
            .number("xx")                        // length
            .number("(d+)|")                     // imei
            .expression("(..)")                  // alarm
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).d+,")          // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .expression("[^*]*").text("*")
            .number("xx|")                       // checksum
            .number("(d+.d+)|")                  // pdop
            .number("(d+.d+)|")                  // hdop
            .number("(d+.d+)|")                  // vdop
            .number("(d+)|")                     // io status
            .number("d+|")                       // battery time
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
            .number("(dd)(dd)(dd)|")             // time (hhmmss)
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
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .number("(dd)(dd)(dd)")              // time (hhmmss)
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
            .number("(dd)(dd)(dd)")              // time (hhmmss)
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
            .number("(dd)")                      // gsm (rssi)
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

    private String decodeAlarm(Short value) {try{__CLR4_5_2gglggllwydzqvv.R.inc(21335);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2gglggllwydzqvv.R.inc(21336);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21337);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21338);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21339);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21340);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21341);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21342);return Position.ALARM_OVERSPEED;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21343);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21344);return Position.ALARM_GEOFENCE_EXIT;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21345);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21346);return Position.ALARM_GEOFENCE_ENTER;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gglggllwydzqvv.R.inc(21347);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gglggllwydzqvv.R.inc(21348);return null;
        }
    }finally{__CLR4_5_2gglggllwydzqvv.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gglggllwydzqvv.R.inc(21349);

        __CLR4_5_2gglggllwydzqvv.R.inc(21350);String sentence = (String) msg;

        // Determine format
        __CLR4_5_2gglggllwydzqvv.R.inc(21351);Pattern pattern = PATTERN3;
        __CLR4_5_2gglggllwydzqvv.R.inc(21352);if ((((sentence.indexOf("AA") == 6)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21353)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21354)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21355);pattern = PATTERN4;
        } }else {__CLR4_5_2gglggllwydzqvv.R.inc(21356);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_2gglggllwydzqvv.R.iget(21357)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21358)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21359);pattern = PATTERN1;
        } }else {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21360);int index = sentence.indexOf('|');
            __CLR4_5_2gglggllwydzqvv.R.inc(21361);if ((((index != -1 && sentence.indexOf('|', index + 1) != -1)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21362)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21363)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21364);pattern = PATTERN2;
            }
        }}

        }}__CLR4_5_2gglggllwydzqvv.R.inc(21365);Parser parser = new Parser(pattern, sentence);
        __CLR4_5_2gglggllwydzqvv.R.inc(21366);if ((((!parser.matches())&&(__CLR4_5_2gglggllwydzqvv.R.iget(21367)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21368)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21369);return null;
        }

        }__CLR4_5_2gglggllwydzqvv.R.inc(21370);Position position = new Position();
        __CLR4_5_2gglggllwydzqvv.R.inc(21371);position.setProtocol(getProtocolName());

        __CLR4_5_2gglggllwydzqvv.R.inc(21372);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2gglggllwydzqvv.R.inc(21373);if ((((deviceSession == null)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21374)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21375)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21376);return null;
        }
        }__CLR4_5_2gglggllwydzqvv.R.inc(21377);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2gglggllwydzqvv.R.inc(21378);if ((((pattern == PATTERN1 || pattern == PATTERN2)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21379)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21380)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21381);if ((((parser.hasNext())&&(__CLR4_5_2gglggllwydzqvv.R.iget(21382)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21383)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21384);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }
            }__CLR4_5_2gglggllwydzqvv.R.inc(21385);DateBuilder dateBuilder = new DateBuilder();
            __CLR4_5_2gglggllwydzqvv.R.inc(21386);int year = 0, month = 0, day = 0;
            __CLR4_5_2gglggllwydzqvv.R.inc(21387);if ((((pattern == PATTERN2)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21388)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21389)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21390);day   = parser.nextInt(0);
                __CLR4_5_2gglggllwydzqvv.R.inc(21391);month = parser.nextInt(0);
                __CLR4_5_2gglggllwydzqvv.R.inc(21392);year  = parser.nextInt(0);
            }
            }__CLR4_5_2gglggllwydzqvv.R.inc(21393);dateBuilder.setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_2gglggllwydzqvv.R.inc(21394);position.setValid(parser.next().equals("A"));
            __CLR4_5_2gglggllwydzqvv.R.inc(21395);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2gglggllwydzqvv.R.inc(21396);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2gglggllwydzqvv.R.inc(21397);position.setSpeed(parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21398);position.setCourse(parser.nextDouble(0));

            __CLR4_5_2gglggllwydzqvv.R.inc(21399);if ((((pattern == PATTERN1)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21400)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21401)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21402);day   = parser.nextInt(0);
                __CLR4_5_2gglggllwydzqvv.R.inc(21403);month = parser.nextInt(0);
                __CLR4_5_2gglggllwydzqvv.R.inc(21404);year  = parser.nextInt(0);
            }
            }__CLR4_5_2gglggllwydzqvv.R.inc(21405);if ((((year == 0)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21406)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21407)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21408);return null; // ignore invalid data
            }
            }__CLR4_5_2gglggllwydzqvv.R.inc(21409);dateBuilder.setDate(year, month, day);
            __CLR4_5_2gglggllwydzqvv.R.inc(21410);position.setTime(dateBuilder.getDate());

            __CLR4_5_2gglggllwydzqvv.R.inc(21411);if ((((pattern == PATTERN1)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21412)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21413)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21414);position.set(Position.KEY_PDOP, parser.nextDouble());
                __CLR4_5_2gglggllwydzqvv.R.inc(21415);position.set(Position.KEY_HDOP, parser.nextDouble());
                __CLR4_5_2gglggllwydzqvv.R.inc(21416);position.set(Position.KEY_VDOP, parser.nextDouble());
            } }else {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21417);position.set(Position.KEY_HDOP, parser.nextDouble());
            }

            }__CLR4_5_2gglggllwydzqvv.R.inc(21418);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21419);if ((((pattern == PATTERN1)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21420)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21421)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21422);position.set(Position.KEY_BATTERY, parser.nextDouble(0) * 0.01);
            } }else {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21423);position.set(Position.KEY_BATTERY, parser.nextDouble(0) * 0.1);
            }
            }__CLR4_5_2gglggllwydzqvv.R.inc(21424);position.set(Position.KEY_POWER, parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21425);position.set(Position.PREFIX_ADC + 1, parser.next());

            __CLR4_5_2gglggllwydzqvv.R.inc(21426);int lac = parser.nextHexInt(0);
            __CLR4_5_2gglggllwydzqvv.R.inc(21427);int cid = parser.nextHexInt(0);
            __CLR4_5_2gglggllwydzqvv.R.inc(21428);if ((((lac != 0 && cid != 0)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21429)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21430)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21431);position.setNetwork(new Network(CellTower.fromLacCid(lac, cid)));
            }

            }__CLR4_5_2gglggllwydzqvv.R.inc(21432);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21433);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);

        } }else {__CLR4_5_2gglggllwydzqvv.R.inc(21434);if ((((pattern == PATTERN3)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21435)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21436)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21437);if ((((parser.hasNext())&&(__CLR4_5_2gglggllwydzqvv.R.iget(21438)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21439)==0&false))) {{
                __CLR4_5_2gglggllwydzqvv.R.inc(21440);position.set(Position.KEY_ALARM, decodeAlarm(Short.parseShort(parser.next(), 16)));
            }

            }__CLR4_5_2gglggllwydzqvv.R.inc(21441);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

            __CLR4_5_2gglggllwydzqvv.R.inc(21442);position.set(Position.PREFIX_IO + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21443);position.set(Position.KEY_BATTERY, parser.nextDouble(0) * 0.1);
            __CLR4_5_2gglggllwydzqvv.R.inc(21444);position.set(Position.KEY_POWER, parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21445);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21446);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21447);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21448);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2gglggllwydzqvv.R.inc(21449);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextHexInt(0), parser.nextHexInt(0))));

            __CLR4_5_2gglggllwydzqvv.R.inc(21450);position.setValid(parser.next().equals("A"));
            __CLR4_5_2gglggllwydzqvv.R.inc(21451);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2gglggllwydzqvv.R.inc(21452);position.setCourse(parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21453);position.setSpeed(parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21454);position.set(Position.KEY_PDOP, parser.nextDouble());
            __CLR4_5_2gglggllwydzqvv.R.inc(21455);position.set(Position.KEY_ODOMETER, parser.nextInt(0) * 1000);

            __CLR4_5_2gglggllwydzqvv.R.inc(21456);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2gglggllwydzqvv.R.inc(21457);position.setLongitude(parser.nextCoordinate());

        } }else {__CLR4_5_2gglggllwydzqvv.R.inc(21458);if ((((pattern == PATTERN4)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21459)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21460)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21461);position.set(Position.KEY_STATUS, parser.next());

            __CLR4_5_2gglggllwydzqvv.R.inc(21462);position.setTime(parser.nextDateTime());

            __CLR4_5_2gglggllwydzqvv.R.inc(21463);position.set(Position.KEY_BATTERY, parser.nextDouble(0) * 0.1);
            __CLR4_5_2gglggllwydzqvv.R.inc(21464);position.set(Position.KEY_POWER, parser.nextDouble(0));

            __CLR4_5_2gglggllwydzqvv.R.inc(21465);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21466);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21467);position.set(Position.PREFIX_ADC + 3, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21468);position.set(Position.PREFIX_ADC + 4, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21469);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_2gglggllwydzqvv.R.inc(21470);position.set(Position.PREFIX_TEMP + 2, parser.next());

            __CLR4_5_2gglggllwydzqvv.R.inc(21471);CellTower cellTower = CellTower.fromLacCid(parser.nextHexInt(0), parser.nextHexInt(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21472);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21473);cellTower.setSignalStrength(parser.nextInt(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21474);position.setNetwork(new Network(cellTower));

            __CLR4_5_2gglggllwydzqvv.R.inc(21475);position.setCourse(parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21476);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
            __CLR4_5_2gglggllwydzqvv.R.inc(21477);position.set(Position.KEY_HDOP, parser.nextDouble(0));
            __CLR4_5_2gglggllwydzqvv.R.inc(21478);position.set(Position.KEY_ODOMETER, parser.nextInt(0) * 1000);

            __CLR4_5_2gglggllwydzqvv.R.inc(21479);position.setValid(true);
            __CLR4_5_2gglggllwydzqvv.R.inc(21480);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2gglggllwydzqvv.R.inc(21481);position.setLongitude(parser.nextCoordinate());
        }
        }}}__CLR4_5_2gglggllwydzqvv.R.inc(21482);if ((((channel != null)&&(__CLR4_5_2gglggllwydzqvv.R.iget(21483)!=0|true))||(__CLR4_5_2gglggllwydzqvv.R.iget(21484)==0&false))) {{
            __CLR4_5_2gglggllwydzqvv.R.inc(21485);channel.write("ACK OK\r\n");
        }
        }__CLR4_5_2gglggllwydzqvv.R.inc(21486);return position;
    }finally{__CLR4_5_2gglggllwydzqvv.R.flushNeeded();}}

}
