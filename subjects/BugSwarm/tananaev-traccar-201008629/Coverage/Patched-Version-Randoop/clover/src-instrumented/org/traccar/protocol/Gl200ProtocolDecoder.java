/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gl200ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27vz7vzlx1e0gvj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,10647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gl200ProtocolDecoder(Gl200Protocol protocol) {
        super(protocol);__CLR4_5_27vz7vzlx1e0gvj.R.inc(10224);try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10223);
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private static final Pattern PATTERN_ACK = new PatternBuilder()
            .text("+ACK:GT")
            .expression("...,")                  // type
            .number("([0-9A-Z]{2}xxxx),")        // protocol version
            .number("(d{15}|x{14}),")            // imei
            .any().text(",")
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("(xxxx)")                    // counter
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_INF = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GTINF,")
            .number("[0-9A-Z]{2}xxxx,")          // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("(?:[0-9A-Z]{17},)?")    // vin
            .expression("(?:[^,]+)?,")           // device name
            .number("(xx),")                     // state
            .expression("(?:[0-9F]{20})?,")      // iccid
            .number("d{1,2},")
            .number("d{1,2},")
            .expression("[01],")                 // external power
            .number("([d.]+)?,")                 // odometer or external power
            .number("d*,")                       // backup battery or lightness
            .number("(d+.d+),")                  // battery
            .expression("([01]),")               // charging
            .number("(?:d),")                    // led
            .number("(?:d)?,")                   // gps on need
            .number("(?:d)?,")                   // gps antenna type
            .number("(?:d),").optional()         // gps antenna state
            .number("d{14},")                    // last fix time
            .groupBegin()
            .number("(d+),")                     // battery percentage
            .expression("[01]?,")                // flash type
            .number("(-?[d.]+)?,,,")             // temperature
            .or()
            .expression("(?:[01])?,").optional() // pin15 mode
            .number("(d+)?,")                    // adc1
            .number("(d+)?,").optional()         // adc2
            .number("(xx)?,")                    // digital input
            .number("(xx)?,")                    // digital output
            .number("[-+]dddd,")                 // timezone
            .expression("[01],")                 // daylight saving
            .groupEnd()
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("(xxxx)")                    // counter
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_VER = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GTVER,")
            .number("[0-9A-Z]{2}xxxx,")          // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,")                // device name
            .expression("([^,]*),")              // device type
            .number("(xxxx),")                   // firmware version
            .number("(xxxx),")                   // hardware version
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("(xxxx)")                    // counter
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_LOCATION = new PatternBuilder()
            .number("(?:d{1,2})?,")              // gps accuracy
            .number("(d{1,3}.d)?,")              // speed
            .number("(d{1,3})?,")                // course
            .number("(-?d{1,5}.d)?,")            // altitude
            .number("(-?d{1,3}.d{6})?,")         // longitude
            .number("(-?d{1,2}.d{6})?,")         // latitude
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .groupBegin()
            .number("(0ddd)?,")                  // mcc
            .number("(0ddd)?,")                  // mnc
            .number("(xxxx)?,")                  // lac
            .number("(xxxx)?,")                  // cell
            .or()
            .number("(d+)?,")                    // mcc
            .number("(d+)?,")                    // mnc
            .number("(d+)?,")                    // lac
            .number("(d+)?,")                    // cell
            .groupEnd()
            .number("(?:d+|(d+.d))?,")           // odometer
            .compile();

    private static final Pattern PATTERN_OBD = new PatternBuilder()
            .text("+RESP:GTOBD,")
            .number("[0-9A-Z]{2}xxxx,")          // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("(?:[0-9A-Z]{17})?,")    // vin
            .expression("[^,]{0,20},")           // device name
            .expression("[01],")                 // report type
            .number("x{1,8},")                   // report mask
            .expression("(?:[0-9A-Z]{17})?,")    // vin
            .number("[01],")                     // obd connect
            .number("(?:d{1,5})?,")              // obd voltage
            .number("(?:x{8})?,")                // support pids
            .number("(d{1,5})?,")                // engine rpm
            .number("(d{1,3})?,")                // speed
            .number("(-?d{1,3})?,")              // coolant temp
            .number("(d+.?d*|Inf|NaN)?,")        // fuel consumption
            .number("(d{1,5})?,")                // dtcs cleared distance
            .number("(?:d{1,5})?,")
            .expression("([01])?,")              // obd connect
            .number("(d{1,3})?,")                // number of dtcs
            .number("(x*),")                     // dtcs
            .number("(d{1,3})?,")                // throttle
            .number("(?:d{1,3})?,")              // engine load
            .number("(d{1,3})?,")                // fuel level
            .expression("(?:[0-9A],)?")          // obd protocol
            .number("(d+),")                     // odometer
            .expression(PATTERN_LOCATION.pattern())
            .number("(d{1,7}.d)?,")              // odometer
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_FRI = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GTFRI,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("(?:([0-9A-Z]{17}),)?")  // vin
            .expression("[^,]*,")                // device name
            .number("(d+)?,")                    // power
            .number("d{1,2},")                   // report type
            .number("d{1,2},")                   // count
            .expression("((?:")
            .expression(PATTERN_LOCATION.pattern())
            .expression(")+)")
            .groupBegin()
            .number("(d{1,7}.d)?,").optional()   // odometer
            .number("(d{1,3})?,")                // battery
            .or()
            .number("(d{1,7}.d)?,")              // odometer
            .number("(d{5}:dd:dd)?,")            // hour meter
            .number("(x+)?,")                    // adc 1
            .number("(x+)?,")                    // adc 2
            .number("(d{1,3})?,")                // battery
            .number("(?:(xx)(xx)(xx))?,")        // device status
            .number("(d+)?,")                    // rpm
            .number("(?:d+.?d*|Inf|NaN)?,")      // fuel consumption
            .number("(d+)?,")                    // fuel level
            .groupEnd()
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_IGN = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GTIG[NF],")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,")                // device name
            .number("d+,")                       // ignition off duration
            .expression(PATTERN_LOCATION.pattern())
            .number("(d{5}:dd:dd)?,")            // hour meter
            .number("(d{1,7}.d)?,")              // odometer
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_IDA = new PatternBuilder()
            .text("+RESP:GTIDA,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,,")               // device name
            .number("([^,]+),")                  // rfid
            .expression("[01],")                 // report type
            .number("1,")                        // count
            .expression(PATTERN_LOCATION.pattern())
            .number("(d+.d),")                   // odometer
            .text(",,,,")
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_WIF = new PatternBuilder()
            .text("+RESP:GTWIF,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,")                // device name
            .number("(d+),")                     // count
            .number("((?:x{12},-?d+,,,,)+),,,,") // wifi
            .number("(d{1,3}),")                 // battery
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GT...,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,")                // device name
            .number("d*,")
            .number("(d{1,2}),")                 // report type
            .number("d{1,2},")                   // count
            .expression(PATTERN_LOCATION.pattern())
            .groupBegin()
            .number("(d{1,7}.d)?,").optional()   // odometer
            .number("(d{1,3})?,")                // battery
            .or()
            .number("(d{1,7}.d)?,")              // odometer
            .groupEnd()
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_BASIC = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF)").text(":")
            .expression("GT...,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .any()
            .number("(d{1,3}.d)?,")              // speed
            .number("(d{1,3})?,")                // course
            .number("(-?d{1,5}.d)?,")            // altitude
            .number("(-?d{1,3}.d{6})?,")         // longitude
            .number("(-?d{1,2}.d{6})?,")         // latitude
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(0ddd),")                   // mcc
            .number("(0ddd),")                   // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx),").optional(4)       // cell
            .any()
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd)").optional(2)  // time
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private Object decodeAck(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10225);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10226);Parser parser = new Parser(PATTERN_ACK, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10227);if ((((parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10228)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10229)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10230);String protocolVersion = parser.next();
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10231);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10232);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10233)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10234)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10235);return null;
            }
            }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10236);if ((((type.equals("HBD"))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10237)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10238)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10239);if ((((channel != null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10240)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10241)==0&false))) {{
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10242);parser.skip(6);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10243);channel.write("+SACK:GTHBD," + protocolVersion + "," + parser.next() + "$", remoteAddress);
                }
            }} }else {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10244);Position position = new Position();
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10245);position.setProtocol(getProtocolName());
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10246);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10247);DateBuilder dateBuilder = new DateBuilder()
                        .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                        .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10248);getLastLocation(position, dateBuilder.getDate());
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10249);position.setValid(false);
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10250);position.set(Position.KEY_RESULT, "Command " + type + " accepted");
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10251);return position;
            }
        }}
        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10252);return null;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeInf(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10253);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10254);Parser parser = new Parser(PATTERN_INF, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10255);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10256)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10257)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10258);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10259);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10260);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10261)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10262)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10263);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10264);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10265);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10266);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10267);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10268);parser.next(); // odometer or external power

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10269);position.set(Position.KEY_BATTERY, parser.nextDouble());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10270);position.set(Position.KEY_CHARGE, parser.nextInt() == 1);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10271);if ((((parser.hasNext())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10272)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10273)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10274);position.set(Position.KEY_BATTERY, parser.next() + "%");
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10275);position.set(Position.PREFIX_TEMP + 1, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10276);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10277);position.set(Position.PREFIX_ADC + 2, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10278);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10279);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10280);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10281);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10282);position.set(Position.KEY_INDEX, parser.nextInt(16));

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10283);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeVer(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10284);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10285);Parser parser = new Parser(PATTERN_VER, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10286);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10287)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10288)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10289);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10290);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10291);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10292)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10293)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10294);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10295);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10296);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10297);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10298);position.set("deviceType", parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10299);position.set("firmwareVersion", parser.nextInt(16));
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10300);position.set("hardwareVersion", parser.nextInt(16));

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10301);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10302);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10303);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private void decodeLocation(Position position, Parser parser) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10304);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10305);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10306);position.setCourse(parser.nextDouble());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10307);position.setAltitude(parser.nextDouble());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10308);if ((((parser.hasNext(8))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10309)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10310)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10311);position.setValid(true);
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10312);position.setLongitude(parser.nextDouble());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10313);position.setLatitude(parser.nextDouble());

            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10314);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10315);position.setTime(dateBuilder.getDate());
        } }else {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10316);getLastLocation(position, null);
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10317);if ((((parser.hasNext(4))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10318)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10319)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10320);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10321);parser.skip(4); // alternative networks

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10322);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeObd(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10323);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10324);Parser parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10325);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10326)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10327)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10328);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10329);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10330);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10331)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10332)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10333);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10334);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10335);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10336);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10337);position.set(Position.KEY_RPM, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10338);position.set(Position.KEY_OBD_SPEED, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10339);position.set(Position.PREFIX_TEMP + 1, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10340);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10341);position.set("dtcsClearedDistance", parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10342);position.set("odbConnect", parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10343);position.set("dtcsNumber", parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10344);position.set("dtcsCodes", parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10345);position.set(Position.KEY_THROTTLE, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10346);position.set(Position.KEY_FUEL, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10347);position.set(Position.KEY_OBD_ODOMETER, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10348);decodeLocation(position, parser);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10349);position.set(Position.KEY_ODOMETER, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10350);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10351)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10352)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10353);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10354);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10355)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10356)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10357);position.setTime(dateBuilder.getDate());
            }
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10358);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeFri(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10359);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10360);Parser parser = new Parser(PATTERN_FRI, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10361);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10362)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10363)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10364);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10365);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10366);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10367)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10368)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10369);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10370);LinkedList<Position> positions = new LinkedList<>();

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10371);String vin = parser.next();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10372);int power = parser.nextInt();

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10373);Parser itemParser = new Parser(PATTERN_LOCATION, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10374);while ((((itemParser.find())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10375)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10376)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10377);Position position = new Position();
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10378);position.setProtocol(getProtocolName());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10379);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10380);position.set(Position.KEY_VIN, vin);

            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10381);decodeLocation(position, itemParser);

            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10382);positions.add(position);
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10383);Position position = positions.getLast();

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10384);decodeLocation(position, parser);

        // power value only on some devices
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10385);if ((((power > 10)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10386)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10387)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10388);position.set(Position.KEY_POWER, power);
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10389);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10390);position.set(Position.KEY_BATTERY, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10391);position.set(Position.KEY_ODOMETER, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10392);position.set(Position.KEY_HOURS, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10393);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10394);position.set(Position.PREFIX_ADC + 2, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10395);position.set(Position.KEY_BATTERY, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10396);if ((((parser.hasNext(3))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10397)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10398)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10399);int ignition = parser.nextInt(16);
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10400);if ((((BitUtil.check(ignition, 4))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10401)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10402)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10403);position.set(Position.KEY_IGNITION, false);
            } }else {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10404);if ((((BitUtil.check(ignition, 5))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10405)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10406)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10407);position.set(Position.KEY_IGNITION, true);
            }
            }}__CLR4_5_27vz7vzlx1e0gvj.R.inc(10408);position.set(Position.KEY_INPUT, parser.nextInt(16));
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10409);position.set(Position.KEY_OUTPUT, parser.nextInt(16));
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10410);position.set(Position.KEY_RPM, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10411);position.set(Position.KEY_FUEL, parser.next());

        // workaround for wrong location time
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10412);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10413)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10414)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10415);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10416);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10417)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10418)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10419);position.setTime(dateBuilder.getDate());
            }
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10420);return positions;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeIgn(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10421);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10422);Parser parser = new Parser(PATTERN_IGN, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10423);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10424)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10425)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10426);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10427);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10428);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10429)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10430)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10431);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10432);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10433);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10434);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10435);decodeLocation(position, parser);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10436);position.set(Position.KEY_HOURS, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10437);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10438);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10439)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10440)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10441);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10442);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10443)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10444)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10445);position.setTime(dateBuilder.getDate());
            }
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10446);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeIda(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10447);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10448);Parser parser = new Parser(PATTERN_IDA, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10449);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10450)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10451)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10452);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10453);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10454);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10455)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10456)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10457);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10458);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10459);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10460);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10461);position.set(Position.KEY_RFID, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10462);decodeLocation(position, parser);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10463);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10464);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10465)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10466)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10467);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10468);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10469)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10470)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10471);position.setTime(dateBuilder.getDate());
            }
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10472);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeWif(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10473);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10474);Parser parser = new Parser(PATTERN_WIF, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10475);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10476)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10477)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10478);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10479);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10480);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10481)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10482)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10483);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10484);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10485);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10486);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10487);getLastLocation(position, null);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10488);Network network = new Network();

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10489);parser.nextInt(); // count
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10490);Matcher matcher = Pattern.compile("([0-9a-fA-F]{12}),(-?\\d+),,,,").matcher(parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10491);while ((((matcher.find())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10492)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10493)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10494);String mac = matcher.group(1).replaceAll("(..)", "$1:");
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10495);network.addWifiAccessPoint(WifiAccessPoint.from(
                    mac.substring(0, mac.length() - 1), Integer.parseInt(matcher.group(2))));
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10496);position.setNetwork(network);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10497);position.set(Position.KEY_BATTERY, parser.nextInt());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10498);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeOther(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10499);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10500);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10501);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10502)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10503)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10504);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10505);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10506);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10507)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10508)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10509);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10510);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10511);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10512);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10513);int reportType = parser.nextInt();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10514);if ((((type.equals("NMR"))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10515)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10516)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10517);position.set(Position.KEY_MOTION, reportType);
        } }else {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10518);if ((((type.equals("SOS"))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10519)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10520)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10521);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }

        }}__CLR4_5_27vz7vzlx1e0gvj.R.inc(10522);decodeLocation(position, parser);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10523);position.set(Position.KEY_ODOMETER, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10524);position.set(Position.KEY_BATTERY, parser.next());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10525);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);

        // workaround for wrong location time
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10526);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10527)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10528)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10529);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10530);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10531)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10532)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10533);position.setTime(dateBuilder.getDate());
            }
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10534);if ((((Context.getConfig().getBoolean(getProtocolName() + ".ack") && channel != null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10535)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10536)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10537);channel.write("+SACK:" + parser.next() + "$", remoteAddress);
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10538);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    private Object decodeBasic(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10539);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10540);Parser parser = new Parser(PATTERN_BASIC, sentence);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10541);if ((((!parser.matches())&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10542)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10543)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10544);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10545);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10546);if ((((deviceSession == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10547)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10548)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10549);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10550);Position position = new Position();
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10551);position.setProtocol(getProtocolName());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10552);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10553);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10554);position.setCourse(parser.nextDouble());
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10555);position.setAltitude(parser.nextDouble());

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10556);if ((((parser.hasNext(2))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10557)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10558)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10559);position.setValid(true);
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10560);position.setLongitude(parser.nextDouble());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10561);position.setLatitude(parser.nextDouble());
        } }else {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10562);getLastLocation(position, null);
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10563);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10564)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10565)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10566);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10567);position.setTime(dateBuilder.getDate());
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10568);if ((((parser.hasNext(4))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10569)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10570)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10571);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10572);if ((((parser.hasNext(6))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10573)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10574)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10575);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10576);if ((((!position.getOutdated() && position.getFixTime().after(dateBuilder.getDate()))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10577)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10578)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10579);position.setTime(dateBuilder.getDate());
            }
        }}

        }boolean __CLB4_5_2_bool0=false;__CLR4_5_27vz7vzlx1e0gvj.R.inc(10580);switch (type) {
            case "BPL":if (!__CLB4_5_2_bool0) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10581);__CLB4_5_2_bool0=true;}
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10582);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10583);break;
            case "TEM":if (!__CLB4_5_2_bool0) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10584);__CLB4_5_2_bool0=true;}
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10585);position.set(Position.KEY_ALARM, Position.ALARM_TEMPERATURE);
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10586);break;
            case "JDR":if (!__CLB4_5_2_bool0) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10587);__CLB4_5_2_bool0=true;}
            case "JDS":if (!__CLB4_5_2_bool0) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10588);__CLB4_5_2_bool0=true;}
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10589);position.set(Position.KEY_ALARM, Position.ALARM_JAMMING);
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10590);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10591);__CLB4_5_2_bool0=true;}
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10592);break;
        }

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10593);return position;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27vz7vzlx1e0gvj.R.inc(10594);

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10595);String sentence = (String) msg;

        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10596);int typeIndex = sentence.indexOf(":GT");
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10597);if ((((typeIndex < 0)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10598)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10599)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10600);return null;
        }

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10601);Object result;
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10602);String type = sentence.substring(typeIndex + 3, typeIndex + 6);
        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10603);if ((((sentence.startsWith("+ACK"))&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10604)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10605)==0&false))) {{
            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10606);result = decodeAck(channel, remoteAddress, sentence, type);
        } }else {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_27vz7vzlx1e0gvj.R.inc(10607);switch (type) {
                case "INF":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10608);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10609);result = decodeInf(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10610);break;
                case "OBD":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10611);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10612);result = decodeObd(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10613);break;
                case "FRI":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10614);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10615);result = decodeFri(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10616);break;
                case "IGN":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10617);__CLB4_5_2_bool1=true;}
                case "IGF":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10618);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10619);result = decodeIgn(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10620);break;
                case "IDA":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10621);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10622);result = decodeIda(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10623);break;
                case "WIF":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10624);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10625);result = decodeWif(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10626);break;
                case "VER":if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10627);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10628);result = decodeVer(channel, remoteAddress, sentence);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10629);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_27vz7vzlx1e0gvj.R.inc(10630);__CLB4_5_2_bool1=true;}
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10631);result = decodeOther(channel, remoteAddress, sentence, type);
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10632);break;
            }

            __CLR4_5_27vz7vzlx1e0gvj.R.inc(10633);if ((((result == null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10634)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10635)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10636);result = decodeBasic(channel, remoteAddress, sentence, type);
            }

            }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10637);if ((((result != null)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10638)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10639)==0&false))) {{
                __CLR4_5_27vz7vzlx1e0gvj.R.inc(10640);if ((((result instanceof Position)&&(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10641)!=0|true))||(__CLR4_5_27vz7vzlx1e0gvj.R.iget(10642)==0&false))) {{
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10643);((Position) result).set(Position.KEY_TYPE, type);
                } }else {{
                    __CLR4_5_27vz7vzlx1e0gvj.R.inc(10644);for (Position p : (List<Position>) result) {{
                        __CLR4_5_27vz7vzlx1e0gvj.R.inc(10645);p.set(Position.KEY_TYPE, type);
                    }
                }}
            }}
        }}

        }__CLR4_5_27vz7vzlx1e0gvj.R.inc(10646);return result;
    }finally{__CLR4_5_27vz7vzlx1e0gvj.R.flushNeeded();}}

}
