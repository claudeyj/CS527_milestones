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

@java.lang.SuppressWarnings({"fallthrough"}) public class Gps103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2a1wa1wlwye7f4e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,13216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps103ProtocolDecoder(Gps103Protocol protocol) {
        super(protocol);__CLR4_5_2a1wa1wlwye7f4e.R.inc(13029);try{__CLR4_5_2a1wa1wlwye7f4e.R.inc(13028);
    }finally{__CLR4_5_2a1wa1wlwye7f4e.R.flushNeeded();}}

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

    private String decodeAlarm(String value) {try{__CLR4_5_2a1wa1wlwye7f4e.R.inc(13030);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13031);if ((((value.startsWith("T:"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13032)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13033)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13034);return Position.ALARM_TEMPERATURE;
        } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13035);if ((((value.startsWith("oil"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13036)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13037)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13038);return Position.ALARM_OIL_LEAK;
        }
        }}boolean __CLB4_5_2_bool0=false;__CLR4_5_2a1wa1wlwye7f4e.R.inc(13039);switch (value) {
            case "tracker":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13040);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13041);return null;
            case "help me":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13042);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13043);return Position.ALARM_SOS;
            case "low battery":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13044);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13045);return Position.ALARM_LOW_BATTERY;
            case "stockade":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13046);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13047);return Position.ALARM_GEOFENCE;
            case "move":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13048);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13049);return Position.ALARM_MOVEMENT;
            case "speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13050);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13051);return Position.ALARM_OVERSPEED;
            case "acc on":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13052);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13053);return Position.ALARM_POWER_ON;
            case "acc off":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13054);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13055);return Position.ALARM_POWER_OFF;
            case "door alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13056);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13057);return Position.ALARM_DOOR;
            case "ac alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13058);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13059);return Position.ALARM_POWER_CUT;
            case "accident alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13060);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13061);return Position.ALARM_ACCIDENT;
            case "sensor alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13062);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13063);return Position.ALARM_SHOCK;
            case "bonnet alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13064);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13065);return Position.ALARM_BONNET;
            case "footbrake alarm":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13066);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13067);return Position.ALARM_FOOT_BRAKE;
            case "DTC":if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13068);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13069);return Position.ALARM_FAULT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13070);__CLB4_5_2_bool0=true;}
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13071);return null;
        }
    }finally{__CLR4_5_2a1wa1wlwye7f4e.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2a1wa1wlwye7f4e.R.inc(13072);

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13073);String sentence = (String) msg;

        // Send response #1
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13074);if ((((sentence.contains("##"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13075)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13076)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13077);if ((((channel != null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13078)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13079)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13080);channel.write("LOAD", remoteAddress);
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13081);Parser handshakeParser = new Parser(PATTERN_HANDSHAKE, sentence);
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13082);if ((((handshakeParser.matches())&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13083)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13084)==0&false))) {{
                    __CLR4_5_2a1wa1wlwye7f4e.R.inc(13085);getDeviceSession(channel, remoteAddress, handshakeParser.next());
                }
            }}
            }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13086);return null;
        }

        // Send response #2
        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13087);if ((((!sentence.isEmpty() && Character.isDigit(sentence.charAt(0)))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13088)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13089)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13090);if ((((channel != null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13091)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13092)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13093);channel.write("ON", remoteAddress);
            }
            }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13094);int start = sentence.indexOf("imei:");
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13095);if ((((start >= 0)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13096)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13097)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13098);sentence = sentence.substring(start);
            } }else {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13099);return null;
            }
        }}

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13100);Position position = new Position();
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13101);position.setProtocol(getProtocolName());

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13102);Parser parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13103);if ((((parser.matches())&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13104)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13105)==0&false))) {{

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13106);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13107);if ((((deviceSession == null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13108)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13109)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13110);return null;
            }
            }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13111);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13112);getLastLocation(position, null);

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13113);position.setNetwork(new Network(
                    CellTower.fromLacCid(parser.nextHexInt(0), parser.nextHexInt(0))));

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13114);return position;

        }

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13115);parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13116);if ((((parser.matches())&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13117)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13118)==0&false))) {{

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13119);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13120);if ((((deviceSession == null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13121)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13122)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13123);return null;
            }
            }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13124);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13125);getLastLocation(position, parser.nextDateTime());

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13126);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13127);parser.nextDouble(0); // instant fuel consumption
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13128);position.set(Position.KEY_FUEL_CONSUMPTION, parser.nextDouble(0));
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13129);position.set(Position.KEY_HOURS, parser.nextInt());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13130);position.set(Position.KEY_OBD_SPEED, parser.nextInt(0));
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13131);position.set(Position.KEY_ENGINE_LOAD, parser.next());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13132);position.set(Position.KEY_COOLANT_TEMP, parser.nextInt());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13133);position.set(Position.KEY_THROTTLE, parser.next());
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13134);position.set(Position.KEY_RPM, parser.nextInt(0));
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13135);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13136);position.set(Position.KEY_DTCS, parser.next().replace(',', ' ').trim());

            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13137);return position;

        }

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13138);parser = new Parser(PATTERN, sentence);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13139);if ((((!parser.matches())&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13140)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13141)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13142);return null;
        }

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13143);String imei = parser.next();
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13144);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13145);if ((((deviceSession == null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13146)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13147)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13148);return null;
        }
        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13149);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13150);String alarm = parser.next();
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13151);position.set(Position.KEY_ALARM, decodeAlarm(alarm));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13152);if ((((alarm.equals("help me"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13153)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13154)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13155);if ((((channel != null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13156)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13157)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13158);channel.write("**,imei:" + imei + ",E;", remoteAddress);
            }
        }} }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13159);if ((((alarm.equals("acc on"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13160)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13161)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13162);position.set(Position.KEY_IGNITION, true);
        } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13163);if ((((alarm.equals("acc off"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13164)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13165)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13166);position.set(Position.KEY_IGNITION, false);
        } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13167);if ((((alarm.startsWith("T:"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13168)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13169)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13170);position.set(Position.PREFIX_TEMP + 1, alarm.substring(2));
        } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13171);if ((((alarm.startsWith("oil "))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13172)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13173)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13174);position.set("oil", alarm.substring(4));
        } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13175);if ((((!position.getAttributes().containsKey(Position.KEY_ALARM) && !alarm.equals("tracker"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13176)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13177)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13178);position.set(Position.KEY_EVENT, alarm);
        }

        }}}}}}__CLR4_5_2a1wa1wlwye7f4e.R.inc(13179);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13180);int localHours = parser.nextInt(0);
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13181);int localMinutes = parser.nextInt(0);

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13182);String rfid = parser.next();
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13183);if ((((alarm.equals("rfid"))&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13184)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13185)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13186);position.set(Position.KEY_DRIVER_UNIQUE_ID, rfid);
        }

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13187);String utcHours = parser.next();
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13188);String utcMinutes = parser.next();

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13189);dateBuilder.setTime(localHours, localMinutes, parser.nextInt(0));

        // Timezone calculation
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13190);if ((((utcHours != null && utcMinutes != null)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13191)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13192)==0&false))) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13193);int deltaMinutes = (localHours - Integer.parseInt(utcHours)) * 60;
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13194);deltaMinutes += localMinutes - Integer.parseInt(utcMinutes);
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13195);if ((((deltaMinutes <= -12 * 60)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13196)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13197)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13198);deltaMinutes += 24 * 60;
            } }else {__CLR4_5_2a1wa1wlwye7f4e.R.inc(13199);if ((((deltaMinutes > 12 * 60)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13200)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13201)==0&false))) {{
                __CLR4_5_2a1wa1wlwye7f4e.R.inc(13202);deltaMinutes -= 24 * 60;
            }
            }}__CLR4_5_2a1wa1wlwye7f4e.R.inc(13203);dateBuilder.addMinute(-deltaMinutes);
        }
        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13204);position.setTime(dateBuilder.getDate());

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13205);position.setValid(parser.next().equals("A"));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13206);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13207);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN_HEM));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13208);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13209);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13210);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2a1wa1wlwye7f4e.R.inc(13211);for (int i = 1; (((i <= 5)&&(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13212)!=0|true))||(__CLR4_5_2a1wa1wlwye7f4e.R.iget(13213)==0&false)); i++) {{
            __CLR4_5_2a1wa1wlwye7f4e.R.inc(13214);position.set(Position.PREFIX_IO + i, parser.next());
        }

        }__CLR4_5_2a1wa1wlwye7f4e.R.inc(13215);return position;
    }finally{__CLR4_5_2a1wa1wlwye7f4e.R.flushNeeded();}}

}
