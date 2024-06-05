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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class MegastekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ahfahflx1dzbea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,13784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MegastekProtocolDecoder(MegastekProtocol protocol) {
        super(protocol);__CLR4_5_2ahfahflx1dzbea.R.inc(13588);try{__CLR4_5_2ahfahflx1dzbea.R.inc(13587);
    }finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).d+,")          // time
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()                               // checksum
            .compile();

    private static final Pattern PATTERN_SIMPLE = new PatternBuilder()
            .expression("[FL],")                 // flag
            .expression("([^,]*),")              // alarm
            .number("imei:(d+),")                // imei
            .number("(d+/?d*)?,")                // satellites
            .number("(d+.d+)?,")                 // altitude
            .number("Battery=(d+)%,,?")          // battery
            .number("(d)?,")                     // charger
            .number("(d+)?,")                    // mcc
            .number("(d+)?,")                    // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx);")                   // cid
            .any()                               // checksum
            .compile();

    private static final Pattern PATTERN_ALTERNATIVE = new PatternBuilder()
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx),")                   // cid
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // battery
            .number("(d+),")                     // flags
            .number("(d+),")                     // inputs
            .number("(?:(d+),)?")                // outputs
            .number("(d.?d*),")                  // adc 1
            .groupBegin()
            .number("(d.dd),")                   // adc 2
            .number("(d.dd),")                   // adc 3
            .groupEnd("?")
            .expression("([^;]+);")              // alarm
            .any()                               // checksum
            .compile();

    private boolean parseLocation(String location, Position position) {try{__CLR4_5_2ahfahflx1dzbea.R.inc(13589);

        __CLR4_5_2ahfahflx1dzbea.R.inc(13590);Parser parser = new Parser(PATTERN_GPRMC, location);
        __CLR4_5_2ahfahflx1dzbea.R.inc(13591);if ((((!parser.matches())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13592)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13593)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13594);return false;
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13595);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13596);position.setValid(parser.next().equals("A"));
        __CLR4_5_2ahfahflx1dzbea.R.inc(13597);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13598);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13599);position.setSpeed(parser.nextDouble());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13600);position.setCourse(parser.nextDouble());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13601);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13602);position.setTime(dateBuilder.getDate());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13603);return true;
    }finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

    private Position decodeOld(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2ahfahflx1dzbea.R.inc(13604);

        // Detect type
        __CLR4_5_2ahfahflx1dzbea.R.inc(13605);boolean simple = sentence.charAt(3) == ',' || sentence.charAt(6) == ',';

        // Split message
        __CLR4_5_2ahfahflx1dzbea.R.inc(13606);String id;
        __CLR4_5_2ahfahflx1dzbea.R.inc(13607);String location;
        __CLR4_5_2ahfahflx1dzbea.R.inc(13608);String status;
        __CLR4_5_2ahfahflx1dzbea.R.inc(13609);if ((((simple)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13610)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13611)==0&false))) {{

            __CLR4_5_2ahfahflx1dzbea.R.inc(13612);int beginIndex = sentence.indexOf(',') + 1;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13613);int endIndex = sentence.indexOf(',', beginIndex);
            __CLR4_5_2ahfahflx1dzbea.R.inc(13614);id = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2ahfahflx1dzbea.R.inc(13615);beginIndex = endIndex + 1;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13616);endIndex = sentence.indexOf('*', beginIndex);
            __CLR4_5_2ahfahflx1dzbea.R.inc(13617);if ((((endIndex != -1)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13618)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13619)==0&false))) {{
                __CLR4_5_2ahfahflx1dzbea.R.inc(13620);endIndex += 3;
            } }else {{
                __CLR4_5_2ahfahflx1dzbea.R.inc(13621);endIndex = sentence.length();
            }
            }__CLR4_5_2ahfahflx1dzbea.R.inc(13622);location = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2ahfahflx1dzbea.R.inc(13623);beginIndex = endIndex + 1;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13624);if ((((beginIndex > sentence.length())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13625)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13626)==0&false))) {{
                __CLR4_5_2ahfahflx1dzbea.R.inc(13627);beginIndex = endIndex;
            }
            }__CLR4_5_2ahfahflx1dzbea.R.inc(13628);status = sentence.substring(beginIndex);

        } }else {{

            __CLR4_5_2ahfahflx1dzbea.R.inc(13629);int beginIndex = 3;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13630);int endIndex = beginIndex + 16;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13631);id = sentence.substring(beginIndex, endIndex).trim();

            __CLR4_5_2ahfahflx1dzbea.R.inc(13632);beginIndex = endIndex + 2;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13633);endIndex = sentence.indexOf('*', beginIndex) + 3;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13634);location = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2ahfahflx1dzbea.R.inc(13635);beginIndex = endIndex + 1;
            __CLR4_5_2ahfahflx1dzbea.R.inc(13636);status = sentence.substring(beginIndex);

        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13637);Position position = new Position();
        __CLR4_5_2ahfahflx1dzbea.R.inc(13638);position.setProtocol(getProtocolName());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13639);if ((((!parseLocation(location, position))&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13640)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13641)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13642);return null;
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13643);if ((((simple)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13644)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13645)==0&false))) {{

            __CLR4_5_2ahfahflx1dzbea.R.inc(13646);Parser parser = new Parser(PATTERN_SIMPLE, status);
            __CLR4_5_2ahfahflx1dzbea.R.inc(13647);if ((((parser.matches())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13648)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13649)==0&false))) {{

                __CLR4_5_2ahfahflx1dzbea.R.inc(13650);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

                __CLR4_5_2ahfahflx1dzbea.R.inc(13651);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next(), id);
                __CLR4_5_2ahfahflx1dzbea.R.inc(13652);if ((((deviceSession == null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13653)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13654)==0&false))) {{
                    __CLR4_5_2ahfahflx1dzbea.R.inc(13655);return null;
                }
                }__CLR4_5_2ahfahflx1dzbea.R.inc(13656);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2ahfahflx1dzbea.R.inc(13657);position.set(Position.KEY_SATELLITES, parser.next());

                __CLR4_5_2ahfahflx1dzbea.R.inc(13658);position.setAltitude(parser.nextDouble());

                __CLR4_5_2ahfahflx1dzbea.R.inc(13659);position.set(Position.KEY_POWER, parser.nextDouble());

                __CLR4_5_2ahfahflx1dzbea.R.inc(13660);String charger = parser.next();
                __CLR4_5_2ahfahflx1dzbea.R.inc(13661);if ((((charger != null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13662)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13663)==0&false))) {{
                    __CLR4_5_2ahfahflx1dzbea.R.inc(13664);position.set(Position.KEY_CHARGE, Integer.parseInt(charger) == 1);
                }

                }__CLR4_5_2ahfahflx1dzbea.R.inc(13665);if ((((parser.hasNext(4))&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13666)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13667)==0&false))) {{
                    __CLR4_5_2ahfahflx1dzbea.R.inc(13668);position.setNetwork(new Network(CellTower.from(
                            parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));
                }

            }} }else {{

                __CLR4_5_2ahfahflx1dzbea.R.inc(13669);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
                __CLR4_5_2ahfahflx1dzbea.R.inc(13670);if ((((deviceSession == null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13671)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13672)==0&false))) {{
                    __CLR4_5_2ahfahflx1dzbea.R.inc(13673);return null;
                }
                }__CLR4_5_2ahfahflx1dzbea.R.inc(13674);position.setDeviceId(deviceSession.getDeviceId());

            }

        }} }else {{

            __CLR4_5_2ahfahflx1dzbea.R.inc(13675);Parser parser = new Parser(PATTERN_ALTERNATIVE, status);
            __CLR4_5_2ahfahflx1dzbea.R.inc(13676);if ((((parser.matches())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13677)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13678)==0&false))) {{

                __CLR4_5_2ahfahflx1dzbea.R.inc(13679);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
                __CLR4_5_2ahfahflx1dzbea.R.inc(13680);if ((((deviceSession == null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13681)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13682)==0&false))) {{
                    __CLR4_5_2ahfahflx1dzbea.R.inc(13683);return null;
                }
                }__CLR4_5_2ahfahflx1dzbea.R.inc(13684);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2ahfahflx1dzbea.R.inc(13685);position.setNetwork(new Network(CellTower.from(
                        parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16), parser.nextInt())));

                __CLR4_5_2ahfahflx1dzbea.R.inc(13686);position.set(Position.KEY_BATTERY, Double.parseDouble(parser.next()));

                __CLR4_5_2ahfahflx1dzbea.R.inc(13687);position.set(Position.KEY_FLAGS, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13688);position.set(Position.KEY_INPUT, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13689);position.set(Position.KEY_OUTPUT, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13690);position.set(Position.PREFIX_ADC + 1, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13691);position.set(Position.PREFIX_ADC + 2, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13692);position.set(Position.PREFIX_ADC + 3, parser.next());
                __CLR4_5_2ahfahflx1dzbea.R.inc(13693);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

            }
        }}

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13694);return position;
    }finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

    private static final Pattern PATTERN_NEW = new PatternBuilder()
            .number("dddd").optional()
            .text("$MGV")
            .number("ddd,")
            .number("(d+),")                     // imei
            .expression("[^,]*,")                // name
            .expression("([RS]),")
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("dd,")
            .number("(dd),")                     // satellites
            .number("dd,")
            .number("(d+.d+),")                  // hdop
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(-?d+.d+),")                // altitude
            .number("(d+.d+)?,")                 // odometer
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx),")                   // cid
            .number("(d+)?,")                    // gsm
            .expression("([01]+)?,")             // input
            .expression("([01]+)?,")             // output
            .number("(d+)?,")                    // adc1
            .number("(d+)?,")                    // adc2
            .number("(d+)?,")                    // adc3
            .groupBegin()
            .number("(-?d+.?d*)")                // temperature 1
            .or().text(" ")
            .groupEnd("?").text(",")
            .groupBegin()
            .number("(-?d+.?d*)")                // temperature 2
            .or().text(" ")
            .groupEnd("?").text(",")
            .number("(d+)?,")                    // rfid
            .number("d*,")
            .number("(d+)?,")                    // battery
            .expression("([^,]*);")              // alert
            .any()
            .compile();

    private Position decodeNew(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2ahfahflx1dzbea.R.inc(13695);

        __CLR4_5_2ahfahflx1dzbea.R.inc(13696);Parser parser = new Parser(PATTERN_NEW, sentence);
        __CLR4_5_2ahfahflx1dzbea.R.inc(13697);if ((((!parser.matches())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13698)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13699)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13700);return null;
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13701);Position position = new Position();
        __CLR4_5_2ahfahflx1dzbea.R.inc(13702);position.setProtocol(getProtocolName());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13703);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13704);if ((((deviceSession == null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13705)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13706)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13707);return null;
        }
        }__CLR4_5_2ahfahflx1dzbea.R.inc(13708);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13709);if ((((parser.next().equals("S"))&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13710)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13711)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13712);position.set(Position.KEY_ARCHIVE, true);
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13713);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13714);position.setTime(dateBuilder.getDate());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13715);position.setValid(parser.next().equals("A"));
        __CLR4_5_2ahfahflx1dzbea.R.inc(13716);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13717);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13718);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13719);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13720);position.setSpeed(parser.nextDouble());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13721);position.setCourse(parser.nextDouble());
        __CLR4_5_2ahfahflx1dzbea.R.inc(13722);position.setAltitude(parser.nextDouble());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13723);if ((((parser.hasNext())&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13724)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13725)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13726);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13727);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16), parser.nextInt())));

        __CLR4_5_2ahfahflx1dzbea.R.inc(13728);position.set(Position.KEY_INPUT, parser.nextInt(2));
        __CLR4_5_2ahfahflx1dzbea.R.inc(13729);position.set(Position.KEY_OUTPUT, parser.nextInt(2));

        __CLR4_5_2ahfahflx1dzbea.R.inc(13730);for (int i = 1; (((i <= 3)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13731)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13732)==0&false)); i++) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13733);position.set(Position.PREFIX_ADC + i, parser.nextInt());
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13734);for (int i = 1; (((i <= 2)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13735)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13736)==0&false)); i++) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13737);String adc = parser.next();
            __CLR4_5_2ahfahflx1dzbea.R.inc(13738);if ((((adc != null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13739)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13740)==0&false))) {{
                __CLR4_5_2ahfahflx1dzbea.R.inc(13741);position.set(Position.PREFIX_TEMP + i, Double.parseDouble(adc));
            }
        }}

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13742);position.set(Position.KEY_RFID, parser.next());

        __CLR4_5_2ahfahflx1dzbea.R.inc(13743);String battery = parser.next();
        __CLR4_5_2ahfahflx1dzbea.R.inc(13744);if ((((battery != null)&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13745)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13746)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13747);position.set(Position.KEY_BATTERY, Integer.parseInt(battery));
        }

        }__CLR4_5_2ahfahflx1dzbea.R.inc(13748);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

        __CLR4_5_2ahfahflx1dzbea.R.inc(13749);return position;
    }finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

    private String decodeAlarm(String value) {try{__CLR4_5_2ahfahflx1dzbea.R.inc(13750);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ahfahflx1dzbea.R.inc(13751);switch (value) {
            case "SOS":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13752);__CLB4_5_2_bool0=true;}
            case "Help":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13753);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13754);return Position.ALARM_SOS;
            case "Over Speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13755);__CLB4_5_2_bool0=true;}
            case "OverSpeed":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13756);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13757);return Position.ALARM_OVERSPEED;
            case "LowSpeed":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13758);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13759);return Position.ALARM_LOW_SPEED;
            case "Low Battery":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13760);__CLB4_5_2_bool0=true;}
            case "LowBattery":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13761);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13762);return Position.ALARM_LOW_BATTERY;
            case "VIB":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13763);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13764);return Position.ALARM_VIBRATION;
            case "Move in":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13765);__CLB4_5_2_bool0=true;}
            case "Geo in":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13766);__CLB4_5_2_bool0=true;}
            case "Geo1 in":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13767);__CLB4_5_2_bool0=true;}
            case "Geo2 in":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13768);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13769);return Position.ALARM_GEOFENCE_ENTER;
            case "Move out":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13770);__CLB4_5_2_bool0=true;}
            case "Geo out":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13771);__CLB4_5_2_bool0=true;}
            case "Geo1 out":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13772);__CLB4_5_2_bool0=true;}
            case "Geo2 out":if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13773);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13774);return Position.ALARM_GEOFENCE_EXIT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ahfahflx1dzbea.R.inc(13775);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ahfahflx1dzbea.R.inc(13776);return null;
        }
    }finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ahfahflx1dzbea.R.inc(13777);

        __CLR4_5_2ahfahflx1dzbea.R.inc(13778);String sentence = (String) msg;

        __CLR4_5_2ahfahflx1dzbea.R.inc(13779);if ((((sentence.contains("$MG"))&&(__CLR4_5_2ahfahflx1dzbea.R.iget(13780)!=0|true))||(__CLR4_5_2ahfahflx1dzbea.R.iget(13781)==0&false))) {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13782);return decodeNew(channel, remoteAddress, sentence);
        } }else {{
            __CLR4_5_2ahfahflx1dzbea.R.inc(13783);return decodeOld(channel, remoteAddress, sentence);
        }
    }}finally{__CLR4_5_2ahfahflx1dzbea.R.flushNeeded();}}

}
