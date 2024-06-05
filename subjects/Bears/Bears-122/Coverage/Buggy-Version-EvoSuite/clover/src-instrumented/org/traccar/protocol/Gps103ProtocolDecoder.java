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
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gps103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2a1xa1xlwydwdav{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,13217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps103ProtocolDecoder(Gps103Protocol protocol) {
        super(protocol);__CLR4_5_2a1xa1xlwydwdav.R.inc(13030);try{__CLR4_5_2a1xa1xlwydwdav.R.inc(13029);
    }finally{__CLR4_5_2a1xa1xlwydwdav.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("imei:")
            .number("(d+),")                     // imei
            .expression("([^,]+),")              // alarm
            .number("(dd)/?(dd)/?(dd) ?")        // local date (yymmdd)
            .number("(dd):?(dd)(?:dd)?,")        // local time (hhmmss)
            .expression("([^,]+)?,")             // rfid
            .expression("[FL],")                 // full / low
            .groupBegin()
            .number("(dd)(dd)(dd).d+")           // time utc (hhmmss)
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
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d+),")                     // odometer
            .number("(d+.d+)?,")                 // fuel instant
            .number("(d+.d+)?,")                 // fuel average
            .number("(d+)?,")                    // hours
            .number("(d+),")                     // speed
            .number("(d+.?d*%),")                // power load
            .number("(?:([-+]?d+)|[-+]?),")      // temperature
            .number("(d+.?d*%),")                // throttle
            .number("(d+),")                     // rpm
            .number("(d+.d+),")                  // battery
            .number("([^;]*)")                   // dtcs
            .any()
            .compile();

    private String decodeAlarm(String value) {try{__CLR4_5_2a1xa1xlwydwdav.R.inc(13031);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13032);if ((((value.startsWith("T:"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13033)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13034)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13035);return Position.ALARM_TEMPERATURE;
        } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13036);if ((((value.startsWith("oil"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13037)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13038)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13039);return Position.ALARM_OIL_LEAK;
        }
        }}boolean __CLB4_5_2_bool0=false;__CLR4_5_2a1xa1xlwydwdav.R.inc(13040);switch (value) {
            case "tracker":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13041);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13042);return null;
            case "help me":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13043);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13044);return Position.ALARM_SOS;
            case "low battery":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13045);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13046);return Position.ALARM_LOW_BATTERY;
            case "stockade":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13047);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13048);return Position.ALARM_GEOFENCE;
            case "move":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13049);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13050);return Position.ALARM_MOVEMENT;
            case "speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13051);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13052);return Position.ALARM_OVERSPEED;
            case "acc on":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13053);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13054);return Position.ALARM_POWER_ON;
            case "acc off":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13055);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13056);return Position.ALARM_POWER_OFF;
            case "door alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13057);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13058);return Position.ALARM_DOOR;
            case "ac alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13059);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13060);return Position.ALARM_POWER_CUT;
            case "accident alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13061);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13062);return Position.ALARM_ACCIDENT;
            case "sensor alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13063);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13064);return Position.ALARM_SHOCK;
            case "bonnet alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13065);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13066);return Position.ALARM_BONNET;
            case "footbrake alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13067);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13068);return Position.ALARM_FOOT_BRAKE;
            case "DTC":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13069);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13070);return Position.ALARM_FAULT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2a1xa1xlwydwdav.R.inc(13071);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13072);return null;
        }
    }finally{__CLR4_5_2a1xa1xlwydwdav.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2a1xa1xlwydwdav.R.inc(13073);

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13074);String sentence = (String) msg;

        // Send response #1
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13075);if ((((sentence.contains("##"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13076)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13077)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13078);if ((((channel != null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13079)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13080)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13081);channel.write("LOAD", remoteAddress);
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13082);Parser handshakeParser = new Parser(PATTERN_HANDSHAKE, sentence);
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13083);if ((((handshakeParser.matches())&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13084)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13085)==0&false))) {{
                    __CLR4_5_2a1xa1xlwydwdav.R.inc(13086);getDeviceSession(channel, remoteAddress, handshakeParser.next());
                }
            }}
            }__CLR4_5_2a1xa1xlwydwdav.R.inc(13087);return null;
        }

        // Send response #2
        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13088);if ((((!sentence.isEmpty() && Character.isDigit(sentence.charAt(0)))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13089)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13090)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13091);if ((((channel != null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13092)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13093)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13094);channel.write("ON", remoteAddress);
            }
            }__CLR4_5_2a1xa1xlwydwdav.R.inc(13095);int start = sentence.indexOf("imei:");
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13096);if ((((start >= 0)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13097)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13098)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13099);sentence = sentence.substring(start);
            } }else {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13100);return null;
            }
        }}

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13101);Position position = new Position();
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13102);position.setProtocol(getProtocolName());

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13103);Parser parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13104);if ((((parser.matches())&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13105)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13106)==0&false))) {{

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13107);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13108);if ((((deviceSession == null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13109)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13110)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13111);return null;
            }
            }__CLR4_5_2a1xa1xlwydwdav.R.inc(13112);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13113);getLastLocation(position, null);

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13114);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextHexInt(0), parser.nextHexInt(0))));

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13115);return position;

        }

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13116);parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13117);if ((((parser.matches())&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13118)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13119)==0&false))) {{

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13120);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13121);if ((((deviceSession == null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13122)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13123)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13124);return null;
            }
            }__CLR4_5_2a1xa1xlwydwdav.R.inc(13125);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13126);getLastLocation(position, parser.nextDateTime());

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13127);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13128);parser.nextDouble(0); // instant fuel consumption
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13129);position.set(Position.KEY_FUEL_CONSUMPTION, parser.nextDouble(0));
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13130);position.set(Position.KEY_HOURS, parser.nextInt());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13131);position.set(Position.KEY_OBD_SPEED, parser.nextInt(0));
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13132);position.set(Position.KEY_ENGINE_LOAD, parser.next());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13133);position.set(Position.KEY_COOLANT_TEMP, parser.nextInt());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13134);position.set(Position.KEY_THROTTLE, parser.next());
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13135);position.set(Position.KEY_RPM, parser.nextInt(0));
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13136);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13137);position.set(Position.KEY_DTCS, parser.next().replace(',', ' ').trim());

            __CLR4_5_2a1xa1xlwydwdav.R.inc(13138);return position;

        }

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13139);parser = new Parser(PATTERN, sentence);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13140);if ((((!parser.matches())&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13141)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13142)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13143);return null;
        }

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13144);String imei = parser.next();
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13145);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13146);if ((((deviceSession == null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13147)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13148)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13149);return null;
        }
        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13150);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13151);String alarm = parser.next();
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13152);position.set(Position.KEY_ALARM, decodeAlarm(alarm));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13153);if ((((alarm.equals("help me"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13154)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13155)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13156);if ((((channel != null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13157)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13158)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13159);channel.write("**,imei:" + imei + ",E;", remoteAddress);
            }
        }} }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13160);if ((((alarm.equals("acc on"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13161)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13162)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13163);position.set(Position.KEY_IGNITION, true);
        } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13164);if ((((alarm.equals("acc off"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13165)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13166)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13167);position.set(Position.KEY_IGNITION, false);
        } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13168);if ((((alarm.startsWith("T:"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13169)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13170)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13171);position.set(Position.PREFIX_TEMP + 1, alarm.substring(2));
        } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13172);if ((((alarm.startsWith("oil "))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13173)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13174)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13175);position.set("oil", alarm.substring(4));
        } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13176);if ((((!position.getAttributes().containsKey(Position.KEY_ALARM) && !alarm.equals("tracker"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13177)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13178)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13179);position.set(Position.KEY_EVENT, alarm);
        }

        }}}}}}__CLR4_5_2a1xa1xlwydwdav.R.inc(13180);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13181);int localHours = parser.nextInt(0);
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13182);int localMinutes = parser.nextInt(0);

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13183);String rfid = parser.next();
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13184);if ((((alarm.equals("rfid"))&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13185)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13186)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13187);position.set(Position.KEY_DRIVER_UNIQUE_ID, rfid);
        }

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13188);String utcHours = parser.next();
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13189);String utcMinutes = parser.next();

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13190);dateBuilder.setTime(localHours, localMinutes, parser.nextInt(0));

        // Timezone calculation
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13191);if ((((utcHours != null && utcMinutes != null)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13192)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13193)==0&false))) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13194);int deltaMinutes = (localHours - Integer.parseInt(utcHours)) * 60;
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13195);deltaMinutes += localMinutes - Integer.parseInt(utcMinutes);
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13196);if ((((deltaMinutes <= -12 * 60)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13197)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13198)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13199);deltaMinutes += 24 * 60;
            } }else {__CLR4_5_2a1xa1xlwydwdav.R.inc(13200);if ((((deltaMinutes > 12 * 60)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13201)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13202)==0&false))) {{
                __CLR4_5_2a1xa1xlwydwdav.R.inc(13203);deltaMinutes -= 24 * 60;
            }
            }}__CLR4_5_2a1xa1xlwydwdav.R.inc(13204);dateBuilder.addMinute(-deltaMinutes);
        }
        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13205);position.setTime(dateBuilder.getDate());

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13206);position.setValid(parser.next().equals("A"));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13207);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13208);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13209);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13210);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2a1xa1xlwydwdav.R.inc(13211);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2a1xa1xlwydwdav.R.inc(13212);for (int i = 1; (((i <= 5)&&(__CLR4_5_2a1xa1xlwydwdav.R.iget(13213)!=0|true))||(__CLR4_5_2a1xa1xlwydwdav.R.iget(13214)==0&false)); i++) {{
            __CLR4_5_2a1xa1xlwydwdav.R.inc(13215);position.set(Position.PREFIX_IO + i, parser.next());
        }

        }__CLR4_5_2a1xa1xlwydwdav.R.inc(13216);return position;
    }finally{__CLR4_5_2a1xa1xlwydwdav.R.flushNeeded();}}

}
