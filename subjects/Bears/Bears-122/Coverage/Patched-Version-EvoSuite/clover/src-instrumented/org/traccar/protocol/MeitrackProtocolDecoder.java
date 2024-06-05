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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeitrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cnecnelwye40v1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,16589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeitrackProtocolDecoder(MeitrackProtocol protocol) {
        super(protocol);__CLR4_5_2cnecnelwye40v1.R.inc(16395);try{__CLR4_5_2cnecnelwye40v1.R.inc(16394);
    }finally{__CLR4_5_2cnecnelwye40v1.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$$").expression(".")          // flag
            .number("d+,")                       // length
            .number("(d+),")                     // imei
            .number("xxx,")                      // command
            .number("d+,").optional()
            .number("(d+),")                     // event
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("([AV]),")                   // validity
            .number("(d+),")                     // satellites
            .number("(d+),")                     // rssi
            .number("(d+.?d*),")                 // speed
            .number("(d+),")                     // course
            .number("(d+.?d*),")                 // hdop
            .number("(-?d+),")                   // altitude
            .number("(d+),")                     // odometer
            .number("(d+),")                     // runtime
            .number("(d+)|")                     // mcc
            .number("(d+)|")                     // mnc
            .number("(x+)|")                     // lac
            .number("(x+),")                     // cid
            .number("(x+),")                     // state
            .number("(x+)?|")                    // adc1
            .number("(x+)?|")                    // adc2
            .number("(x+)?|")                    // adc3
            .number("(x+)|")                     // battery
            .number("(x+),")                     // power
            .groupBegin()
            .expression("([^,]+)?,")             // event specific
            .expression("[^,]*,")                // reserved
            .number("d*,")                       // protocol
            .number("(x{4})?")                   // fuel
            .number("(?:,(x{6}(?:|x{6})*))?")    // temperature
            .or()
            .any()
            .groupEnd()
            .text("*")
            .number("xx")
            .text("\r\n").optional()
            .compile();

    private String decodeAlarm(int event) {try{__CLR4_5_2cnecnelwye40v1.R.inc(16396);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2cnecnelwye40v1.R.inc(16397);switch (event) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16398);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16399);return Position.ALARM_SOS;
            case 17:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16400);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16401);return Position.ALARM_LOW_BATTERY;
            case 18:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16402);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16403);return Position.ALARM_LOW_POWER;
            case 19:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16404);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16405);return Position.ALARM_OVERSPEED;
            case 20:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16406);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16407);return Position.ALARM_GEOFENCE_ENTER;
            case 21:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16408);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16409);return Position.ALARM_GEOFENCE_EXIT;
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16410);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16411);return Position.ALARM_POWER_RESTORED;
            case 23:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16412);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16413);return Position.ALARM_POWER_CUT;
            case 36:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16414);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16415);return Position.ALARM_TOW;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2cnecnelwye40v1.R.inc(16416);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16417);return null;
        }
    }finally{__CLR4_5_2cnecnelwye40v1.R.flushNeeded();}}

    private Position decodeRegularMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2cnecnelwye40v1.R.inc(16418);

        __CLR4_5_2cnecnelwye40v1.R.inc(16419);Parser parser = new Parser(PATTERN, buf.toString(StandardCharsets.US_ASCII));
        __CLR4_5_2cnecnelwye40v1.R.inc(16420);if ((((!parser.matches())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16421)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16422)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16423);return null;
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16424);Position position = new Position();
        __CLR4_5_2cnecnelwye40v1.R.inc(16425);position.setProtocol(getProtocolName());

        __CLR4_5_2cnecnelwye40v1.R.inc(16426);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2cnecnelwye40v1.R.inc(16427);if ((((deviceSession == null)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16428)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16429)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16430);return null;
        }
        }__CLR4_5_2cnecnelwye40v1.R.inc(16431);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2cnecnelwye40v1.R.inc(16432);int event = parser.nextInt(0);
        __CLR4_5_2cnecnelwye40v1.R.inc(16433);position.set(Position.KEY_EVENT, event);
        __CLR4_5_2cnecnelwye40v1.R.inc(16434);position.set(Position.KEY_ALARM, decodeAlarm(event));

        __CLR4_5_2cnecnelwye40v1.R.inc(16435);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2cnecnelwye40v1.R.inc(16436);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_2cnecnelwye40v1.R.inc(16437);position.setTime(parser.nextDateTime());

        __CLR4_5_2cnecnelwye40v1.R.inc(16438);position.setValid(parser.next().equals("A"));

        __CLR4_5_2cnecnelwye40v1.R.inc(16439);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_2cnecnelwye40v1.R.inc(16440);int rssi = parser.nextInt(0);

        __CLR4_5_2cnecnelwye40v1.R.inc(16441);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_2cnecnelwye40v1.R.inc(16442);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2cnecnelwye40v1.R.inc(16443);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_2cnecnelwye40v1.R.inc(16444);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2cnecnelwye40v1.R.inc(16445);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
        __CLR4_5_2cnecnelwye40v1.R.inc(16446);position.set("runtime", parser.next());

        __CLR4_5_2cnecnelwye40v1.R.inc(16447);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(0), parser.nextInt(0), parser.nextHexInt(0), parser.nextHexInt(0), rssi)));

        __CLR4_5_2cnecnelwye40v1.R.inc(16448);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2cnecnelwye40v1.R.inc(16449);for (int i = 1; (((i <= 3)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16450)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16451)==0&false)); i++) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16452);if ((((parser.hasNext())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16453)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16454)==0&false))) {{
                __CLR4_5_2cnecnelwye40v1.R.inc(16455);position.set(Position.PREFIX_ADC + i, parser.nextHexInt(0));
            }
        }}

        }__CLR4_5_2cnecnelwye40v1.R.inc(16456);String deviceModel = Context.getIdentityManager().getById(deviceSession.getDeviceId()).getModel();
        __CLR4_5_2cnecnelwye40v1.R.inc(16457);if ((((deviceModel == null)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16458)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16459)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16460);deviceModel = "";
        }
        }boolean __CLB4_5_2_bool1=false;__CLR4_5_2cnecnelwye40v1.R.inc(16461);switch (deviceModel.toUpperCase()) {
            case "MVT340":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16462);__CLB4_5_2_bool1=true;}
            case "MVT380":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16463);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16464);position.set(Position.KEY_BATTERY, parser.nextHexInt(0) * 3.0 * 2.0 / 1024.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16465);position.set(Position.KEY_POWER, parser.nextHexInt(0) * 3.0 * 16.0 / 1024.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16466);break;
            case "MT90":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16467);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16468);position.set(Position.KEY_BATTERY, parser.nextHexInt(0) * 3.3 * 2.0 / 4096.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16469);position.set(Position.KEY_POWER, parser.nextHexInt(0));
                __CLR4_5_2cnecnelwye40v1.R.inc(16470);break;
            case "T1":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16471);__CLB4_5_2_bool1=true;}
            case "T3":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16472);__CLB4_5_2_bool1=true;}
            case "MVT100":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16473);__CLB4_5_2_bool1=true;}
            case "MVT600":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16474);__CLB4_5_2_bool1=true;}
            case "MVT800":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16475);__CLB4_5_2_bool1=true;}
            case "TC68":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16476);__CLB4_5_2_bool1=true;}
            case "TC68S":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16477);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16478);position.set(Position.KEY_BATTERY, parser.nextHexInt(0) * 3.3 * 2.0 / 4096.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16479);position.set(Position.KEY_POWER, parser.nextHexInt(0) * 3.3 * 16.0 / 4096.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16480);break;
            case "T311":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16481);__CLB4_5_2_bool1=true;}
            case "T322X":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16482);__CLB4_5_2_bool1=true;}
            case "T333":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16483);__CLB4_5_2_bool1=true;}
            case "T355":if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16484);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16485);position.set(Position.KEY_BATTERY, parser.nextHexInt(0) / 100.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16486);position.set(Position.KEY_POWER, parser.nextHexInt(0) / 100.0);
                __CLR4_5_2cnecnelwye40v1.R.inc(16487);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2cnecnelwye40v1.R.inc(16488);__CLB4_5_2_bool1=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16489);position.set(Position.KEY_BATTERY, parser.nextHexInt(0));
                __CLR4_5_2cnecnelwye40v1.R.inc(16490);position.set(Position.KEY_POWER, parser.nextHexInt(0));
                __CLR4_5_2cnecnelwye40v1.R.inc(16491);break;
        }

        __CLR4_5_2cnecnelwye40v1.R.inc(16492);String eventData = parser.next();
        __CLR4_5_2cnecnelwye40v1.R.inc(16493);if ((((eventData != null && !eventData.isEmpty())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16494)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16495)==0&false))) {{
            boolean __CLB4_5_2_bool2=false;__CLR4_5_2cnecnelwye40v1.R.inc(16496);switch (event) {
                case 37:if (!__CLB4_5_2_bool2) {__CLR4_5_2cnecnelwye40v1.R.inc(16497);__CLB4_5_2_bool2=true;}
                    __CLR4_5_2cnecnelwye40v1.R.inc(16498);position.set(Position.KEY_DRIVER_UNIQUE_ID, eventData);
                    __CLR4_5_2cnecnelwye40v1.R.inc(16499);break;
                default:if (!__CLB4_5_2_bool2) {__CLR4_5_2cnecnelwye40v1.R.inc(16500);__CLB4_5_2_bool2=true;}
                    __CLR4_5_2cnecnelwye40v1.R.inc(16501);position.set("eventData", eventData);
                    __CLR4_5_2cnecnelwye40v1.R.inc(16502);break;
            }
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16503);if ((((parser.hasNext())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16504)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16505)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16506);String fuel = parser.next();
            __CLR4_5_2cnecnelwye40v1.R.inc(16507);position.set(Position.KEY_FUEL_LEVEL,
                    Integer.parseInt(fuel.substring(0, 2), 16) + Integer.parseInt(fuel.substring(2), 16) * 0.01);
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16508);if ((((parser.hasNext())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16509)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16510)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16511);for (String temp : parser.next().split("\\|")) {{
                __CLR4_5_2cnecnelwye40v1.R.inc(16512);int index = Integer.valueOf(temp.substring(0, 2), 16);
                __CLR4_5_2cnecnelwye40v1.R.inc(16513);double value = Byte.valueOf(temp.substring(2, 4), 16);
                __CLR4_5_2cnecnelwye40v1.R.inc(16514);value += ((((value < 0 )&&(__CLR4_5_2cnecnelwye40v1.R.iget(16515)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16516)==0&false))? -0.01 : 0.01) * Integer.valueOf(temp.substring(4), 16);
                __CLR4_5_2cnecnelwye40v1.R.inc(16517);position.set(Position.PREFIX_TEMP + index, value);
            }
        }}

        }__CLR4_5_2cnecnelwye40v1.R.inc(16518);return position;
    }finally{__CLR4_5_2cnecnelwye40v1.R.flushNeeded();}}

    private List<Position> decodeBinaryMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2cnecnelwye40v1.R.inc(16519);
        __CLR4_5_2cnecnelwye40v1.R.inc(16520);List<Position> positions = new LinkedList<>();

        __CLR4_5_2cnecnelwye40v1.R.inc(16521);String flag = buf.toString(2, 1, StandardCharsets.US_ASCII);
        __CLR4_5_2cnecnelwye40v1.R.inc(16522);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');

        __CLR4_5_2cnecnelwye40v1.R.inc(16523);String imei = buf.toString(index + 1, 15, StandardCharsets.US_ASCII);
        __CLR4_5_2cnecnelwye40v1.R.inc(16524);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2cnecnelwye40v1.R.inc(16525);if ((((deviceSession == null)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16526)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16527)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16528);return null;
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16529);buf.skipBytes(index + 1 + 15 + 1 + 3 + 1 + 2 + 2 + 4);

        __CLR4_5_2cnecnelwye40v1.R.inc(16530);while ((((buf.readableBytes() >= 0x34)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16531)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16532)==0&false))) {{

            __CLR4_5_2cnecnelwye40v1.R.inc(16533);Position position = new Position();
            __CLR4_5_2cnecnelwye40v1.R.inc(16534);position.setProtocol(getProtocolName());
            __CLR4_5_2cnecnelwye40v1.R.inc(16535);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2cnecnelwye40v1.R.inc(16536);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2cnecnelwye40v1.R.inc(16537);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_2cnecnelwye40v1.R.inc(16538);position.setLongitude(buf.readInt() * 0.000001);

            __CLR4_5_2cnecnelwye40v1.R.inc(16539);position.setTime(new Date((946684800 + buf.readUnsignedInt()) * 1000)); // 946684800 = 2000-01-01

            __CLR4_5_2cnecnelwye40v1.R.inc(16540);position.setValid(buf.readUnsignedByte() == 1);

            __CLR4_5_2cnecnelwye40v1.R.inc(16541);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_2cnecnelwye40v1.R.inc(16542);int rssi = buf.readUnsignedByte();

            __CLR4_5_2cnecnelwye40v1.R.inc(16543);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_2cnecnelwye40v1.R.inc(16544);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2cnecnelwye40v1.R.inc(16545);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);

            __CLR4_5_2cnecnelwye40v1.R.inc(16546);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_2cnecnelwye40v1.R.inc(16547);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_2cnecnelwye40v1.R.inc(16548);position.set("runtime", buf.readUnsignedInt());

            __CLR4_5_2cnecnelwye40v1.R.inc(16549);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    rssi)));

            __CLR4_5_2cnecnelwye40v1.R.inc(16550);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

            __CLR4_5_2cnecnelwye40v1.R.inc(16551);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2cnecnelwye40v1.R.inc(16552);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.01);
            __CLR4_5_2cnecnelwye40v1.R.inc(16553);position.set(Position.KEY_POWER, buf.readUnsignedShort());

            __CLR4_5_2cnecnelwye40v1.R.inc(16554);buf.readUnsignedInt(); // geo-fence

            __CLR4_5_2cnecnelwye40v1.R.inc(16555);positions.add(position);
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16556);if ((((channel != null)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16557)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16558)==0&false))) {{
            __CLR4_5_2cnecnelwye40v1.R.inc(16559);StringBuilder command = new StringBuilder("@@");
            __CLR4_5_2cnecnelwye40v1.R.inc(16560);command.append(flag).append(27 + positions.size() / 10).append(",");
            __CLR4_5_2cnecnelwye40v1.R.inc(16561);command.append(imei).append(",CCC,").append(positions.size()).append("*");
            __CLR4_5_2cnecnelwye40v1.R.inc(16562);int checksum = 0;
            __CLR4_5_2cnecnelwye40v1.R.inc(16563);for (int i = 0; (((i < command.length())&&(__CLR4_5_2cnecnelwye40v1.R.iget(16564)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16565)==0&false)); i += 1) {{
                __CLR4_5_2cnecnelwye40v1.R.inc(16566);checksum += command.charAt(i);
            }
            }__CLR4_5_2cnecnelwye40v1.R.inc(16567);command.append(String.format("%02x", checksum & 0xff).toUpperCase());
            __CLR4_5_2cnecnelwye40v1.R.inc(16568);command.append("\r\n");
            __CLR4_5_2cnecnelwye40v1.R.inc(16569);channel.write(command.toString()); // delete processed data
        }

        }__CLR4_5_2cnecnelwye40v1.R.inc(16570);return positions;
    }finally{__CLR4_5_2cnecnelwye40v1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cnecnelwye40v1.R.inc(16571);

        __CLR4_5_2cnecnelwye40v1.R.inc(16572);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find type
        __CLR4_5_2cnecnelwye40v1.R.inc(16573);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');
        __CLR4_5_2cnecnelwye40v1.R.inc(16574);index = buf.indexOf(index + 1, buf.writerIndex(), (byte) ',');

        __CLR4_5_2cnecnelwye40v1.R.inc(16575);String type = buf.toString(index + 1, 3, StandardCharsets.US_ASCII);
        boolean __CLB4_5_2_bool3=false;__CLR4_5_2cnecnelwye40v1.R.inc(16576);switch (type) {
            case "D03":if (!__CLB4_5_2_bool3) {__CLR4_5_2cnecnelwye40v1.R.inc(16577);__CLB4_5_2_bool3=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16578);if ((((channel != null)&&(__CLR4_5_2cnecnelwye40v1.R.iget(16579)!=0|true))||(__CLR4_5_2cnecnelwye40v1.R.iget(16580)==0&false))) {{
                    __CLR4_5_2cnecnelwye40v1.R.inc(16581);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
                    __CLR4_5_2cnecnelwye40v1.R.inc(16582);String imei = Context.getIdentityManager().getById(deviceSession.getDeviceId()).getUniqueId();
                    __CLR4_5_2cnecnelwye40v1.R.inc(16583);channel.write("@@O46," + imei + ",D00,camera_picture.jpg,0*00\r\n");
                }
                }__CLR4_5_2cnecnelwye40v1.R.inc(16584);return null;
            case "CCC":if (!__CLB4_5_2_bool3) {__CLR4_5_2cnecnelwye40v1.R.inc(16585);__CLB4_5_2_bool3=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16586);return decodeBinaryMessage(channel, remoteAddress, buf);
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2cnecnelwye40v1.R.inc(16587);__CLB4_5_2_bool3=true;}
                __CLR4_5_2cnecnelwye40v1.R.inc(16588);return decodeRegularMessage(channel, remoteAddress, buf);
        }
    }finally{__CLR4_5_2cnecnelwye40v1.R.flushNeeded();}}

}
