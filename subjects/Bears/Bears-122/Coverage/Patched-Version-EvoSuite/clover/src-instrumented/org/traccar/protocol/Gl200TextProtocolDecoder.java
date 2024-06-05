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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gl200TextProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29c59c5lwye3zq4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,12551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean ignoreFixTime;

    public Gl200TextProtocolDecoder(Gl200Protocol protocol) {
        super(protocol);__CLR4_5_29c59c5lwye3zq4.R.inc(12102);try{__CLR4_5_29c59c5lwye3zq4.R.inc(12101);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12103);ignoreFixTime = Context.getConfig().getBoolean(getProtocolName() + ".ignoreFixTime");
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private static final Pattern PATTERN_ACK = new PatternBuilder()
            .text("+ACK:GT")
            .expression("...,")                  // type
            .number("([0-9A-Z]{2}xxxx),")        // protocol version
            .number("(d{15}|x{14}),")            // imei
            .any().text(",")
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
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
            .number("(d{1,2}),")                 // rssi
            .number("d{1,2},")
            .expression("[01],")                 // external power
            .number("([d.]+)?,")                 // odometer or external power
            .number("d*,")                       // backup battery or lightness
            .number("(d+.d+),")                  // battery
            .expression("([01]),")               // charging
            .number("(?:d),")                    // led
            .number("(?:d)?,")                   // gps on need
            .number("(?:d)?,")                   // gps antenna type
            .number("(?:d)?,").optional()        // gps antenna state
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(xxxx)")                    // counter
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_LOCATION = new PatternBuilder()
            .number("(d{1,2})?,")                // hdop
            .number("(d{1,3}.d)?,")              // speed
            .number("(d{1,3})?,")                // course
            .number("(-?d{1,5}.d)?,")            // altitude
            .number("(-?d{1,3}.d{6})?,")         // longitude
            .number("(-?d{1,2}.d{6})?,")         // latitude
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
            .text(",")
            .number("(d+)?,")                    // mcc
            .number("(d+)?,")                    // mnc
            .groupBegin()
            .number("(d+),")                     // lac
            .number("(d+),")                     // cid
            .or()
            .number("(x+)?,")                    // lac
            .number("(x+)?,")                    // cid
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_ERI = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF):GTERI,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("[^,]*,")                // device name
            .number("x{8},")                     // mask
            .number("(d+)?,")                    // power
            .number("d{1,2},")                   // report type
            .number("d{1,2},")                   // count
            .expression("((?:")
            .expression(PATTERN_LOCATION.pattern())
            .expression(")+)")
            .number("(d{1,7}.d)?,")              // odometer
            .number("(d{5}:dd:dd)?,")            // hour meter
            .number("(x+)?,")                    // adc 1
            .number("(x+)?,")                    // adc 2
            .number("(d{1,3})?,")                // battery
            .number("(?:(xx)(xx)(xx))?,")        // device status
            .expression("(.*)")                  // additional data
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_GSM = new PatternBuilder()
            .text("+RESP:GTGSM,")
            .number("(?:[0-9A-Z]{2}xxxx)?,")     // protocol version
            .number("(d{15}|x{14}),")            // imei
            .expression("(?:STR|CTN|NMR|RTL),")  // fix type
            .expression("(.*)")                  // cells
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
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
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)")  // time (hhmmss)
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private static final Pattern PATTERN_BASIC = new PatternBuilder()
            .text("+").expression("(?:RESP|BUFF)").text(":")
            .expression("GT...,")
            .number("(?:[0-9A-Z]{2}xxxx)?,").optional() // protocol version
            .number("(d{15}|x{14}),")            // imei
            .any()
            .number("(d{1,2})?,")                // hdop
            .number("(d{1,3}.d)?,")              // speed
            .number("(d{1,3})?,")                // course
            .number("(-?d{1,5}.d)?,")            // altitude
            .number("(-?d{1,3}.d{6})?,")         // longitude
            .number("(-?d{1,2}.d{6})?,")         // latitude
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
            .text(",")
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(x+),")                     // lac
            .number("(x+),").optional(4)         // cell
            .any()
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)").optional(2)  // time (hhmmss)
            .text(",")
            .number("(xxxx)")                    // count number
            .text("$").optional()
            .compile();

    private Object decodeAck(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12104);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12105);Parser parser = new Parser(PATTERN_ACK, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12106);if ((((parser.matches())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12107)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12108)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12109);String protocolVersion = parser.next();
            __CLR4_5_29c59c5lwye3zq4.R.inc(12110);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_29c59c5lwye3zq4.R.inc(12111);if ((((deviceSession == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12112)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12113)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12114);return null;
            }
            }__CLR4_5_29c59c5lwye3zq4.R.inc(12115);if ((((type.equals("HBD"))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12116)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12117)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12118);if ((((channel != null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12119)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12120)==0&false))) {{
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12121);parser.skip(6);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12122);channel.write("+SACK:GTHBD," + protocolVersion + "," + parser.next() + "$", remoteAddress);
                }
            }} }else {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12123);Position position = new Position();
                __CLR4_5_29c59c5lwye3zq4.R.inc(12124);position.setProtocol(getProtocolName());
                __CLR4_5_29c59c5lwye3zq4.R.inc(12125);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_29c59c5lwye3zq4.R.inc(12126);getLastLocation(position, parser.nextDateTime());
                __CLR4_5_29c59c5lwye3zq4.R.inc(12127);position.setValid(false);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12128);position.set(Position.KEY_RESULT, "Command " + type + " accepted");
                __CLR4_5_29c59c5lwye3zq4.R.inc(12129);return position;
            }
        }}
        }__CLR4_5_29c59c5lwye3zq4.R.inc(12130);return null;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Position initPosition(Parser parser, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12131);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12132);if ((((parser.matches())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12133)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12134)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12135);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_29c59c5lwye3zq4.R.inc(12136);if ((((deviceSession != null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12137)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12138)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12139);Position position = new Position();
                __CLR4_5_29c59c5lwye3zq4.R.inc(12140);position.setProtocol(getProtocolName());
                __CLR4_5_29c59c5lwye3zq4.R.inc(12141);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_29c59c5lwye3zq4.R.inc(12142);return position;
            }
        }}
        }__CLR4_5_29c59c5lwye3zq4.R.inc(12143);return null;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private void decodeDeviceTime(Position position, Parser parser) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12144);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12145);if ((((parser.hasNext(6))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12146)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12147)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12148);if ((((ignoreFixTime)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12149)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12150)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12151);position.setTime(parser.nextDateTime());
            } }else {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12152);position.setDeviceTime(parser.nextDateTime());
            }
        }}
    }}finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeInf(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12153);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12154);Parser parser = new Parser(PATTERN_INF, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12155);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12156);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12157)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12158)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12159);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12160);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12161);position.set(Position.KEY_RSSI, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12162);parser.next(); // odometer or external power

        __CLR4_5_29c59c5lwye3zq4.R.inc(12163);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12164);position.set(Position.KEY_CHARGE, parser.nextInt(0) == 1);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12165);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12166);position.set(Position.PREFIX_TEMP + 1, parser.next());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12167);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12168);position.set(Position.PREFIX_ADC + 2, parser.next());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12169);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12170);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12171);getLastLocation(position, parser.nextDateTime());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12172);position.set(Position.KEY_INDEX, parser.nextHexInt(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12173);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeVer(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12174);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12175);Parser parser = new Parser(PATTERN_VER, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12176);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12177);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12178)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12179)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12180);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12181);position.set("deviceType", parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12182);position.set(Position.KEY_VERSION_FW, parser.nextHexInt(0));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12183);position.set(Position.KEY_VERSION_HW, parser.nextHexInt(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12184);getLastLocation(position, parser.nextDateTime());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12185);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private void decodeLocation(Position position, Parser parser) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12186);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12187);int hdop = parser.nextInt(0);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12188);position.setValid(hdop > 0);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12189);position.set(Position.KEY_HDOP, hdop);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12190);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12191);position.setCourse(parser.nextDouble(0));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12192);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12193);if ((((parser.hasNext(8))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12194)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12195)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12196);position.setValid(true);
            __CLR4_5_29c59c5lwye3zq4.R.inc(12197);position.setLongitude(parser.nextDouble(0));
            __CLR4_5_29c59c5lwye3zq4.R.inc(12198);position.setLatitude(parser.nextDouble(0));
            __CLR4_5_29c59c5lwye3zq4.R.inc(12199);position.setTime(parser.nextDateTime());
        } }else {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12200);getLastLocation(position, null);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12201);if ((((parser.hasNext(6))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12202)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12203)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12204);int mcc = parser.nextInt(0);
            __CLR4_5_29c59c5lwye3zq4.R.inc(12205);int mnc = parser.nextInt(0);
            __CLR4_5_29c59c5lwye3zq4.R.inc(12206);if ((((parser.hasNext(2))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12207)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12208)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12209);position.setNetwork(new Network(CellTower.from(mcc, mnc, parser.nextInt(0), parser.nextInt(0))));
            }
            }__CLR4_5_29c59c5lwye3zq4.R.inc(12210);if ((((parser.hasNext(2))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12211)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12212)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12213);position.setNetwork(new Network(CellTower.from(mcc, mnc, parser.nextHexInt(0), parser.nextHexInt(0))));
            }
        }}

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12214);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeObd(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12215);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12216);Parser parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12217);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12218);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12219)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12220)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12221);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12222);position.set(Position.KEY_RPM, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12223);position.set(Position.KEY_OBD_SPEED, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12224);position.set(Position.PREFIX_TEMP + 1, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12225);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12226);position.set("dtcsClearedDistance", parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12227);position.set("odbConnect", parser.nextInt(0) == 1);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12228);position.set("dtcsNumber", parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12229);position.set("dtcsCodes", parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12230);position.set(Position.KEY_THROTTLE, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12231);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12232);position.set(Position.KEY_OBD_ODOMETER, parser.nextInt(0) * 1000);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12233);decodeLocation(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12234);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12235);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12236);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private void decodeStatus(Position position, Parser parser) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12237);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12238);if ((((parser.hasNext(3))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12239)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12240)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12241);int ignition = parser.nextHexInt(0);
            __CLR4_5_29c59c5lwye3zq4.R.inc(12242);if ((((BitUtil.check(ignition, 4))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12243)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12244)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12245);position.set(Position.KEY_IGNITION, false);
            } }else {__CLR4_5_29c59c5lwye3zq4.R.inc(12246);if ((((BitUtil.check(ignition, 5))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12247)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12248)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12249);position.set(Position.KEY_IGNITION, true);
            }
            }}__CLR4_5_29c59c5lwye3zq4.R.inc(12250);position.set(Position.KEY_INPUT, parser.nextHexInt(0));
            __CLR4_5_29c59c5lwye3zq4.R.inc(12251);position.set(Position.KEY_OUTPUT, parser.nextHexInt(0));
        }
    }}finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeFri(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12252);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12253);Parser parser = new Parser(PATTERN_FRI, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12254);if ((((!parser.matches())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12255)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12256)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12257);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12258);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12259);if ((((deviceSession == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12260)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12261)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12262);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12263);LinkedList<Position> positions = new LinkedList<>();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12264);String vin = parser.next();
        __CLR4_5_29c59c5lwye3zq4.R.inc(12265);int power = parser.nextInt(0);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12266);Parser itemParser = new Parser(PATTERN_LOCATION, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12267);while ((((itemParser.find())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12268)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12269)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12270);Position position = new Position();
            __CLR4_5_29c59c5lwye3zq4.R.inc(12271);position.setProtocol(getProtocolName());
            __CLR4_5_29c59c5lwye3zq4.R.inc(12272);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29c59c5lwye3zq4.R.inc(12273);position.set(Position.KEY_VIN, vin);

            __CLR4_5_29c59c5lwye3zq4.R.inc(12274);decodeLocation(position, itemParser);

            __CLR4_5_29c59c5lwye3zq4.R.inc(12275);positions.add(position);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12276);Position position = positions.getLast();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12277);decodeLocation(position, parser);

        // power value only on some devices
        __CLR4_5_29c59c5lwye3zq4.R.inc(12278);if ((((power > 10)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12279)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12280)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12281);position.set(Position.KEY_POWER, power);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12282);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12283);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12284);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12285);position.set(Position.KEY_HOURS, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12286);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12287);position.set(Position.PREFIX_ADC + 2, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12288);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12289);decodeStatus(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12290);position.set(Position.KEY_RPM, parser.nextInt());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12291);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12292);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12293);return positions;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeEri(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12294);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12295);Parser parser = new Parser(PATTERN_ERI, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12296);if ((((!parser.matches())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12297)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12298)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12299);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12300);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12301);if ((((deviceSession == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12302)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12303)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12304);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12305);LinkedList<Position> positions = new LinkedList<>();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12306);int power = parser.nextInt(0);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12307);Parser itemParser = new Parser(PATTERN_LOCATION, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12308);while ((((itemParser.find())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12309)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12310)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12311);Position position = new Position();
            __CLR4_5_29c59c5lwye3zq4.R.inc(12312);position.setProtocol(getProtocolName());
            __CLR4_5_29c59c5lwye3zq4.R.inc(12313);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29c59c5lwye3zq4.R.inc(12314);decodeLocation(position, itemParser);

            __CLR4_5_29c59c5lwye3zq4.R.inc(12315);positions.add(position);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12316);Position position = positions.getLast();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12317);decodeLocation(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12318);position.set(Position.KEY_POWER, power);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12319);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12320);position.set(Position.KEY_HOURS, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12321);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12322);position.set(Position.PREFIX_ADC + 2, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12323);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12324);decodeStatus(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12325);int index = 0;
        __CLR4_5_29c59c5lwye3zq4.R.inc(12326);String[] data = parser.next().split(",");
        __CLR4_5_29c59c5lwye3zq4.R.inc(12327);if ((((data.length > 1)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12328)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12329)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12330);int deviceType = Integer.parseInt(data[index++]);
            __CLR4_5_29c59c5lwye3zq4.R.inc(12331);if ((((deviceType == 2)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12332)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12333)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12334);int deviceCount = Integer.parseInt(data[index++]);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12335);for (int i = 1; (((i <= deviceCount)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12336)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12337)==0&false)); i++) {{
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12338);index++; // id
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12339);index++; // type
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12340);position.set(Position.PREFIX_TEMP + i, Short.parseShort(data[index++], 16) * 0.0625);
                }
            }}
        }}

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12341);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12342);return positions;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeIgn(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12343);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12344);Parser parser = new Parser(PATTERN_IGN, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12345);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12346);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12347)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12348)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12349);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12350);decodeLocation(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12351);position.set(Position.KEY_HOURS, parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12352);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12353);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12354);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeIda(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12355);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12356);Parser parser = new Parser(PATTERN_IDA, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12357);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12358);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12359)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12360)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12361);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12362);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());

        __CLR4_5_29c59c5lwye3zq4.R.inc(12363);decodeLocation(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12364);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12365);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12366);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeWif(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12367);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12368);Parser parser = new Parser(PATTERN_WIF, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12369);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12370);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12371)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12372)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12373);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12374);getLastLocation(position, null);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12375);Network network = new Network();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12376);parser.nextInt(0); // count
        __CLR4_5_29c59c5lwye3zq4.R.inc(12377);Matcher matcher = Pattern.compile("([0-9a-fA-F]{12}),(-?\\d+),,,,").matcher(parser.next());
        __CLR4_5_29c59c5lwye3zq4.R.inc(12378);while ((((matcher.find())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12379)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12380)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12381);String mac = matcher.group(1).replaceAll("(..)", "$1:");
            __CLR4_5_29c59c5lwye3zq4.R.inc(12382);network.addWifiAccessPoint(WifiAccessPoint.from(
                    mac.substring(0, mac.length() - 1), Integer.parseInt(matcher.group(2))));
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12383);position.setNetwork(network);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12384);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12385);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeGsm(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12386);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12387);Parser parser = new Parser(PATTERN_GSM, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12388);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12389);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12390)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12391)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12392);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12393);getLastLocation(position, null);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12394);Network network = new Network();

        __CLR4_5_29c59c5lwye3zq4.R.inc(12395);String[] data = parser.next().split(",");
        __CLR4_5_29c59c5lwye3zq4.R.inc(12396);for (int i = 0; (((i < 6)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12397)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12398)==0&false)); i++) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12399);if ((((!data[i * 6].isEmpty())&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12400)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12401)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12402);network.addCellTower(CellTower.from(
                        Integer.parseInt(data[i * 6]), Integer.parseInt(data[i * 6 + 1]),
                        Integer.parseInt(data[i * 6 + 2], 16), Integer.parseInt(data[i * 6 + 3], 16),
                        Integer.parseInt(data[i * 6 + 4])));
            }
        }}

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12403);position.setNetwork(network);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12404);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeOther(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12405);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12406);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12407);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12408);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12409)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12410)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12411);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12412);int reportType = parser.nextInt(0);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12413);if ((((type.equals("NMR"))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12414)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12415)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12416);position.set(Position.KEY_MOTION, reportType == 1);
        } }else {__CLR4_5_29c59c5lwye3zq4.R.inc(12417);if ((((type.equals("SOS"))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12418)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12419)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12420);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }

        }}__CLR4_5_29c59c5lwye3zq4.R.inc(12421);decodeLocation(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12422);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12423);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12424);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12425);decodeDeviceTime(position, parser);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12426);if ((((Context.getConfig().getBoolean(getProtocolName() + ".ack") && channel != null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12427)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12428)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12429);channel.write("+SACK:" + parser.next() + "$", remoteAddress);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12430);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    private Object decodeBasic(Channel channel, SocketAddress remoteAddress, String sentence, String type) {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12431);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12432);Parser parser = new Parser(PATTERN_BASIC, sentence);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12433);Position position = initPosition(parser, channel, remoteAddress);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12434);if ((((position == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12435)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12436)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12437);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12438);int hdop = parser.nextInt(0);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12439);position.setValid(hdop > 0);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12440);position.set(Position.KEY_HDOP, hdop);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12441);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12442);position.setCourse(parser.nextDouble(0));
        __CLR4_5_29c59c5lwye3zq4.R.inc(12443);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_29c59c5lwye3zq4.R.inc(12444);if ((((parser.hasNext(2))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12445)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12446)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12447);position.setLongitude(parser.nextDouble(0));
            __CLR4_5_29c59c5lwye3zq4.R.inc(12448);position.setLatitude(parser.nextDouble(0));
        } }else {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12449);getLastLocation(position, null);
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12450);if ((((parser.hasNext(6))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12451)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12452)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12453);position.setTime(parser.nextDateTime());
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12454);if ((((parser.hasNext(4))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12455)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12456)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12457);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(0), parser.nextInt(0), parser.nextHexInt(0), parser.nextHexInt(0))));
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12458);decodeDeviceTime(position, parser);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_29c59c5lwye3zq4.R.inc(12459);switch (type) {
            case "PNA":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12460);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12461);position.set(Position.KEY_ALARM, Position.ALARM_POWER_ON);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12462);break;
            case "PFA":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12463);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12464);position.set(Position.KEY_ALARM, Position.ALARM_POWER_OFF);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12465);break;
            case "EPN":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12466);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12467);position.set(Position.KEY_ALARM, Position.ALARM_POWER_RESTORED);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12468);break;
            case "EPF":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12469);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12470);position.set(Position.KEY_ALARM, Position.ALARM_POWER_CUT);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12471);break;
            case "BPL":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12472);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12473);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12474);break;
            case "STT":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12475);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12476);position.set(Position.KEY_ALARM, Position.ALARM_MOVEMENT);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12477);break;
            case "SWG":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12478);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12479);position.set(Position.KEY_ALARM, Position.ALARM_GEOFENCE);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12480);break;
            case "TMP":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12481);__CLB4_5_2_bool0=true;}
            case "TEM":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12482);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12483);position.set(Position.KEY_ALARM, Position.ALARM_TEMPERATURE);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12484);break;
            case "JDR":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12485);__CLB4_5_2_bool0=true;}
            case "JDS":if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12486);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12487);position.set(Position.KEY_ALARM, Position.ALARM_JAMMING);
                __CLR4_5_29c59c5lwye3zq4.R.inc(12488);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_29c59c5lwye3zq4.R.inc(12489);__CLB4_5_2_bool0=true;}
                __CLR4_5_29c59c5lwye3zq4.R.inc(12490);break;
        }

        __CLR4_5_29c59c5lwye3zq4.R.inc(12491);return position;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29c59c5lwye3zq4.R.inc(12492);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12493);String sentence = ((ChannelBuffer) msg).toString(StandardCharsets.US_ASCII);

        __CLR4_5_29c59c5lwye3zq4.R.inc(12494);int typeIndex = sentence.indexOf(":GT");
        __CLR4_5_29c59c5lwye3zq4.R.inc(12495);if ((((typeIndex < 0)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12496)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12497)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12498);return null;
        }

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12499);Object result;
        __CLR4_5_29c59c5lwye3zq4.R.inc(12500);String type = sentence.substring(typeIndex + 3, typeIndex + 6);
        __CLR4_5_29c59c5lwye3zq4.R.inc(12501);if ((((sentence.startsWith("+ACK"))&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12502)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12503)==0&false))) {{
            __CLR4_5_29c59c5lwye3zq4.R.inc(12504);result = decodeAck(channel, remoteAddress, sentence, type);
        } }else {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_29c59c5lwye3zq4.R.inc(12505);switch (type) {
                case "INF":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12506);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12507);result = decodeInf(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12508);break;
                case "OBD":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12509);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12510);result = decodeObd(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12511);break;
                case "FRI":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12512);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12513);result = decodeFri(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12514);break;
                case "ERI":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12515);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12516);result = decodeEri(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12517);break;
                case "IGN":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12518);__CLB4_5_2_bool1=true;}
                case "IGF":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12519);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12520);result = decodeIgn(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12521);break;
                case "IDA":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12522);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12523);result = decodeIda(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12524);break;
                case "WIF":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12525);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12526);result = decodeWif(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12527);break;
                case "GSM":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12528);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12529);result = decodeGsm(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12530);break;
                case "VER":if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12531);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12532);result = decodeVer(channel, remoteAddress, sentence);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12533);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_29c59c5lwye3zq4.R.inc(12534);__CLB4_5_2_bool1=true;}
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12535);result = decodeOther(channel, remoteAddress, sentence, type);
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12536);break;
            }

            __CLR4_5_29c59c5lwye3zq4.R.inc(12537);if ((((result == null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12538)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12539)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12540);result = decodeBasic(channel, remoteAddress, sentence, type);
            }

            }__CLR4_5_29c59c5lwye3zq4.R.inc(12541);if ((((result != null)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12542)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12543)==0&false))) {{
                __CLR4_5_29c59c5lwye3zq4.R.inc(12544);if ((((result instanceof Position)&&(__CLR4_5_29c59c5lwye3zq4.R.iget(12545)!=0|true))||(__CLR4_5_29c59c5lwye3zq4.R.iget(12546)==0&false))) {{
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12547);((Position) result).set(Position.KEY_TYPE, type);
                } }else {{
                    __CLR4_5_29c59c5lwye3zq4.R.inc(12548);for (Position p : (List<Position>) result) {{
                        __CLR4_5_29c59c5lwye3zq4.R.inc(12549);p.set(Position.KEY_TYPE, type);
                    }
                }}
            }}
        }}

        }__CLR4_5_29c59c5lwye3zq4.R.inc(12550);return result;
    }finally{__CLR4_5_29c59c5lwye3zq4.R.flushNeeded();}}

}
