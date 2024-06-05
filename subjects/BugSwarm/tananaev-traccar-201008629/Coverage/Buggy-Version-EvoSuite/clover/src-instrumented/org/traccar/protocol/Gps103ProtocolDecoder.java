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

@java.lang.SuppressWarnings({"fallthrough"}) public class Gps103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28iv8ivlx1dvdn2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,11231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps103ProtocolDecoder(Gps103Protocol protocol) {
        super(protocol);__CLR4_5_28iv8ivlx1dvdn2.R.inc(11048);try{__CLR4_5_28iv8ivlx1dvdn2.R.inc(11047);
    }finally{__CLR4_5_28iv8ivlx1dvdn2.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("imei:")
            .number("(d+),")                     // imei
            .expression("([^,]+),")              // alarm
            .number("(dd)/?(dd)/?(dd) ?")        // local date
            .number("(dd):?(dd)(?:dd)?,")        // local time
            .expression("([^,]+)?,")             // rfid
            .expression("[FL],")                 // full / low
            .groupBegin()
            .number("(dd)(dd)(dd).(d+)")         // time utc (hhmmss.sss)
            .or()
            .number("(?:d{1,5}.d+)?")
            .groupEnd()
            .text(",")
            .expression("([AV]),")               // validity
            .expression("([NS]),").optional()
            .number("(d+)(dd.d+),")              // latitude (ddmm.mmmm)
            .expression("([NS]),").optional()
            .expression("([EW]),").optional()
            .number("(d+)(dd.d+),")              // longitude (dddmm.mmmm)
            .expression("([EW])?,").optional()
            .number("(d+.?d*)?,?")               // speed
            .number("(d+.?d*)?,?")               // course
            .number("(d+.?d*)?,?")               // altitude
            .expression("([^,;]+)?,?")
            .expression("([^,;]+)?,?")
            .expression("([^,;]+)?,?")
            .expression("([^,;]+)?,?")
            .expression("([^,;]+)?,?")
            .any()
            .compile();

    private static final Pattern PATTERN_NETWORK = new PatternBuilder()
            .text("imei:")
            .number("(d+),")                     // imei
            .expression("[^,]+,")                // alarm
            .number("d*,,")
            .text("L,,,")
            .number("(x+),,")                    // lac
            .number("(x+),,,")                   // cid
            .any()
            .compile();

    private static final Pattern PATTERN_HANDSHAKE = new PatternBuilder()
            .number("##,imei:(d+),A")
            .compile();

    private static final Pattern PATTERN_OBD = new PatternBuilder()
            .text("imei:")
            .number("(d+),")                     // imei
            .expression("OBD,")                  // type
            .number("(dd)(dd)(dd)")              // date
            .number("(dd)(dd)(dd),")             // time
            .number("(d+),")                     // odometer
            .number("(d+.d+)?,")                 // fuel instant
            .number("(d+.d+)?,")                 // fuel average
            .number("(d+),")                     // hours
            .number("(d+),")                     // speed
            .number("d+.?d*%,")                  // power load
            .number("(d+),")                     // temperature
            .number("(d+.?d*%),")                // throttle
            .number("(d+),")                     // rpm
            .number("(d+.d+),")                  // battery
            .number("([^;]*)")                   // dtcs
            .any()
            .compile();

    private String decodeAlarm(String value) {try{__CLR4_5_28iv8ivlx1dvdn2.R.inc(11049);
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11050);if ((((value.startsWith("T:"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11051)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11052)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11053);return Position.ALARM_TEMPERATURE;
        } }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11054);if ((((value.startsWith("oil"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11055)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11056)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11057);return Position.ALARM_OIL_LEAK;
        }
        }}boolean __CLB4_5_2_bool0=false;__CLR4_5_28iv8ivlx1dvdn2.R.inc(11058);switch (value) {
            case "tracker":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11059);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11060);return null;
            case "help me":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11061);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11062);return Position.ALARM_SOS;
            case "low battery":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11063);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11064);return Position.ALARM_LOW_BATTERY;
            case "stockade":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11065);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11066);return Position.ALARM_GEOFENCE;
            case "move":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11067);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11068);return Position.ALARM_MOVEMENT;
            case "speed":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11069);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11070);return Position.ALARM_OVERSPEED;
            case "acc on":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11071);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11072);return Position.ALARM_POWER_ON;
            case "acc off":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11073);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11074);return Position.ALARM_POWER_OFF;
            case "door alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11075);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11076);return Position.ALARM_DOOR;
            case "ac alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11077);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11078);return Position.ALARM_POWER_CUT;
            case "accident alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11079);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11080);return Position.ALARM_ACCIDENT;
            case "sensor alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11081);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11082);return Position.ALARM_SHOCK;
            case "bonnet alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11083);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11084);return Position.ALARM_BONNET;
            case "footbrake alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11085);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11086);return Position.ALARM_FOOT_BRAKE;
            case "DTC":if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11087);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11088);return Position.ALARM_FAULT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11089);__CLB4_5_2_bool0=true;}
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11090);return null;
        }
    }finally{__CLR4_5_28iv8ivlx1dvdn2.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28iv8ivlx1dvdn2.R.inc(11091);

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11092);String sentence = (String) msg;

        // Send response #1
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11093);if ((((sentence.contains("##"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11094)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11095)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11096);if ((((channel != null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11097)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11098)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11099);channel.write("LOAD", remoteAddress);
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11100);Parser handshakeParser = new Parser(PATTERN_HANDSHAKE, sentence);
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11101);if ((((handshakeParser.matches())&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11102)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11103)==0&false))) {{
                    __CLR4_5_28iv8ivlx1dvdn2.R.inc(11104);getDeviceSession(channel, remoteAddress, handshakeParser.next());
                }
            }}
            }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11105);return null;
        }

        // Send response #2
        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11106);if ((((!sentence.isEmpty() && Character.isDigit(sentence.charAt(0)))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11107)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11108)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11109);if ((((channel != null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11110)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11111)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11112);channel.write("ON", remoteAddress);
            }
            }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11113);int start = sentence.indexOf("imei:");
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11114);if ((((start >= 0)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11115)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11116)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11117);sentence = sentence.substring(start);
            } }else {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11118);return null;
            }
        }}

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11119);Position position = new Position();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11120);position.setProtocol(getProtocolName());

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11121);Parser parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11122);if ((((parser.matches())&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11123)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11124)==0&false))) {{

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11125);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11126);if ((((deviceSession == null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11127)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11128)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11129);return null;
            }
            }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11130);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11131);getLastLocation(position, null);

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11132);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11133);return position;

        }

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11134);parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11135);if ((((parser.matches())&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11136)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11137)==0&false))) {{

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11138);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11139);if ((((deviceSession == null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11140)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11141)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11142);return null;
            }
            }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11143);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11144);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11145);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11146);position.set(Position.KEY_ODOMETER, parser.nextInt());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11147);parser.next(); // instant fuel consumption
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11148);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11149);position.set(Position.KEY_HOURS, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11150);position.set(Position.KEY_OBD_SPEED, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11151);position.set(Position.PREFIX_TEMP + 1, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11152);position.set(Position.KEY_THROTTLE, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11153);position.set(Position.KEY_RPM, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11154);position.set(Position.KEY_BATTERY, parser.next());
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11155);position.set(Position.KEY_DTCS, parser.next().replace(',', ' ').trim());

            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11156);return position;

        }

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11157);parser = new Parser(PATTERN, sentence);
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11158);if ((((!parser.matches())&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11159)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11160)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11161);return null;
        }

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11162);String imei = parser.next();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11163);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11164);if ((((deviceSession == null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11165)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11166)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11167);return null;
        }
        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11168);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11169);String alarm = parser.next();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11170);position.set(Position.KEY_ALARM, decodeAlarm(alarm));
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11171);if ((((alarm.equals("help me"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11172)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11173)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11174);if ((((channel != null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11175)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11176)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11177);channel.write("**,imei:" + imei + ",E;", remoteAddress);
            }
        }} }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11178);if ((((alarm.equals("acc on"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11179)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11180)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11181);position.set(Position.KEY_IGNITION, true);
        } }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11182);if ((((alarm.equals("acc off"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11183)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11184)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11185);position.set(Position.KEY_IGNITION, false);
        } }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11186);if ((((alarm.startsWith("T:"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11187)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11188)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11189);position.set(Position.PREFIX_TEMP + 1, alarm.substring(2));
        } }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11190);if ((((alarm.startsWith("oil "))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11191)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11192)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11193);position.set("oil", alarm.substring(4));
        }

        }}}}}__CLR4_5_28iv8ivlx1dvdn2.R.inc(11194);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11195);int localHours = parser.nextInt();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11196);int localMinutes = parser.nextInt();

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11197);String rfid = parser.next();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11198);if ((((alarm.equals("rfid"))&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11199)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11200)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11201);position.set(Position.KEY_RFID, rfid);
        }

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11202);String utcHours = parser.next();
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11203);String utcMinutes = parser.next();

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11204);dateBuilder.setTime(localHours, localMinutes, parser.nextInt(), parser.nextInt());

        // Timezone calculation
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11205);if ((((utcHours != null && utcMinutes != null)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11206)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11207)==0&false))) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11208);int deltaMinutes = (localHours - Integer.parseInt(utcHours)) * 60;
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11209);deltaMinutes += localMinutes - Integer.parseInt(utcMinutes);
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11210);if ((((deltaMinutes <= -12 * 60)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11211)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11212)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11213);deltaMinutes += 24 * 60;
            } }else {__CLR4_5_28iv8ivlx1dvdn2.R.inc(11214);if ((((deltaMinutes > 12 * 60)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11215)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11216)==0&false))) {{
                __CLR4_5_28iv8ivlx1dvdn2.R.inc(11217);deltaMinutes -= 24 * 60;
            }
            }}__CLR4_5_28iv8ivlx1dvdn2.R.inc(11218);dateBuilder.addMinute(-deltaMinutes);
        }
        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11219);position.setTime(dateBuilder.getDate());

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11220);position.setValid(parser.next().equals("A"));
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11221);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11222);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11223);position.setSpeed(parser.nextDouble());
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11224);position.setCourse(parser.nextDouble());
        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11225);position.setAltitude(parser.nextDouble());

        __CLR4_5_28iv8ivlx1dvdn2.R.inc(11226);for (int i = 1; (((i <= 5)&&(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11227)!=0|true))||(__CLR4_5_28iv8ivlx1dvdn2.R.iget(11228)==0&false)); i++) {{
            __CLR4_5_28iv8ivlx1dvdn2.R.inc(11229);position.set(Position.PREFIX_IO + i, parser.next());
        }

        }__CLR4_5_28iv8ivlx1dvdn2.R.inc(11230);return position;
    }finally{__CLR4_5_28iv8ivlx1dvdn2.R.flushNeeded();}}

}
