/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import java.util.Date;
import java.util.regex.Pattern;

public class WatchProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2hschsclwydzr4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,23241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WatchProtocolDecoder(WatchProtocol protocol) {
        super(protocol);__CLR4_5_2hschsclwydzr4z.R.inc(23053);try{__CLR4_5_2hschsclwydzr4z.R.inc(23052);
    }finally{__CLR4_5_2hschsclwydzr4z.R.flushNeeded();}}

    private static final Pattern PATTERN_POSITION = new PatternBuilder()
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .expression("([AV]),")               // validity
            .number(" *(-?d+.d+),")              // latitude
            .expression("([NS]),")
            .number(" *(-?d+.d+),")              // longitude
            .expression("([EW])?,")
            .number("(d+.d+),")                  // speed
            .number("(d+.?d*),")                 // course
            .number("(d+.?d*),")                 // altitude
            .number("(d+),")                     // satellites
            .number("(d+),")                     // rssi
            .number("(d+),")                     // battery
            .number("(d+),")                     // steps
            .number("d+,")                       // tumbles
            .number("(x+),")                     // status
            .expression("(.*)")                  // cell and wifi
            .compile();

    private void sendResponse(Channel channel, String manufacturer, String id, String content) {try{__CLR4_5_2hschsclwydzr4z.R.inc(23054);
        __CLR4_5_2hschsclwydzr4z.R.inc(23055);if ((((channel != null)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23056)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23057)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23058);channel.write(String.format(
                    "[%s*%s*%04x*%s]", manufacturer, id, content.length(), content));
        }
    }}finally{__CLR4_5_2hschsclwydzr4z.R.flushNeeded();}}

    private String decodeAlarm(int status) {try{__CLR4_5_2hschsclwydzr4z.R.inc(23059);
        __CLR4_5_2hschsclwydzr4z.R.inc(23060);if ((((BitUtil.check(status, 0))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23061)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23062)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23063);return Position.ALARM_LOW_BATTERY;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23064);if ((((BitUtil.check(status, 1))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23065)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23066)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23067);return Position.ALARM_GEOFENCE_EXIT;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23068);if ((((BitUtil.check(status, 2))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23069)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23070)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23071);return Position.ALARM_GEOFENCE_ENTER;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23072);if ((((BitUtil.check(status, 3))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23073)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23074)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23075);return Position.ALARM_OVERSPEED;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23076);if ((((BitUtil.check(status, 4))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23077)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23078)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23079);return Position.ALARM_MOVEMENT;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23080);if ((((BitUtil.check(status, 16))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23081)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23082)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23083);return Position.ALARM_SOS;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23084);if ((((BitUtil.check(status, 17))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23085)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23086)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23087);return Position.ALARM_LOW_BATTERY;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23088);if ((((BitUtil.check(status, 18))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23089)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23090)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23091);return Position.ALARM_GEOFENCE_EXIT;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23092);if ((((BitUtil.check(status, 19))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23093)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23094)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23095);return Position.ALARM_GEOFENCE_ENTER;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23096);if ((((BitUtil.check(status, 20))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23097)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23098)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23099);return Position.ALARM_REMOVING;
        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23100);if ((((BitUtil.check(status, 21))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23101)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23102)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23103);return Position.ALARM_FALL_DOWN;
        }
        }}}}}}}}}}}__CLR4_5_2hschsclwydzr4z.R.inc(23104);return null;
    }finally{__CLR4_5_2hschsclwydzr4z.R.flushNeeded();}}

    private void decodeTail(Position position, String data) {try{__CLR4_5_2hschsclwydzr4z.R.inc(23105);
        __CLR4_5_2hschsclwydzr4z.R.inc(23106);String[] values = data.split(",");
        __CLR4_5_2hschsclwydzr4z.R.inc(23107);int index = 0;

        __CLR4_5_2hschsclwydzr4z.R.inc(23108);Network network = new Network();

        __CLR4_5_2hschsclwydzr4z.R.inc(23109);int cellCount = Integer.parseInt(values[index++]);
        __CLR4_5_2hschsclwydzr4z.R.inc(23110);index += 1; // timing advance
        __CLR4_5_2hschsclwydzr4z.R.inc(23111);int mcc = Integer.parseInt(values[index++]);
        __CLR4_5_2hschsclwydzr4z.R.inc(23112);int mnc = Integer.parseInt(values[index++]);

        __CLR4_5_2hschsclwydzr4z.R.inc(23113);for (int i = 0; (((i < cellCount)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23114)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23115)==0&false)); i++) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23116);network.addCellTower(CellTower.from(mcc, mnc,
                    Integer.parseInt(values[index++]), Integer.parseInt(values[index++]),
                    Integer.parseInt(values[index++])));
        }

        }__CLR4_5_2hschsclwydzr4z.R.inc(23117);if ((((index < values.length && !values[index].isEmpty())&&(__CLR4_5_2hschsclwydzr4z.R.iget(23118)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23119)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23120);int wifiCount = Integer.parseInt(values[index++]);

            __CLR4_5_2hschsclwydzr4z.R.inc(23121);for (int i = 0; (((i < wifiCount)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23122)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23123)==0&false)); i++) {{
                __CLR4_5_2hschsclwydzr4z.R.inc(23124);index += 1; // wifi name
                __CLR4_5_2hschsclwydzr4z.R.inc(23125);network.addWifiAccessPoint(WifiAccessPoint.from(
                        values[index++], Integer.parseInt(values[index++])));
            }
        }}

        }__CLR4_5_2hschsclwydzr4z.R.inc(23126);if ((((network.getCellTowers() != null || network.getWifiAccessPoints() != null)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23127)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23128)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23129);position.setNetwork(network);
        }
    }}finally{__CLR4_5_2hschsclwydzr4z.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2hschsclwydzr4z.R.inc(23130);

        __CLR4_5_2hschsclwydzr4z.R.inc(23131);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2hschsclwydzr4z.R.inc(23132);buf.skipBytes(1); // header
        __CLR4_5_2hschsclwydzr4z.R.inc(23133);String manufacturer = buf.readBytes(2).toString(StandardCharsets.US_ASCII);
        __CLR4_5_2hschsclwydzr4z.R.inc(23134);buf.skipBytes(1); // delimiter

        __CLR4_5_2hschsclwydzr4z.R.inc(23135);String id = buf.readBytes(10).toString(StandardCharsets.US_ASCII);
        __CLR4_5_2hschsclwydzr4z.R.inc(23136);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2hschsclwydzr4z.R.inc(23137);if ((((deviceSession == null)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23138)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23139)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23140);return null;
        }

        }__CLR4_5_2hschsclwydzr4z.R.inc(23141);buf.skipBytes(1); // delimiter
        __CLR4_5_2hschsclwydzr4z.R.inc(23142);buf.skipBytes(4); // length
        __CLR4_5_2hschsclwydzr4z.R.inc(23143);buf.skipBytes(1); // delimiter

        __CLR4_5_2hschsclwydzr4z.R.inc(23144);buf.writerIndex(buf.writerIndex() - 1); // ignore ending

        __CLR4_5_2hschsclwydzr4z.R.inc(23145);int contentIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');
        __CLR4_5_2hschsclwydzr4z.R.inc(23146);if ((((contentIndex < 0)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23147)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23148)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23149);contentIndex = buf.writerIndex();
        }

        }__CLR4_5_2hschsclwydzr4z.R.inc(23150);String type = buf.readBytes(contentIndex - buf.readerIndex()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2hschsclwydzr4z.R.inc(23151);if ((((contentIndex < buf.writerIndex())&&(__CLR4_5_2hschsclwydzr4z.R.iget(23152)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23153)==0&false))) {{
            __CLR4_5_2hschsclwydzr4z.R.inc(23154);buf.readerIndex(contentIndex + 1);
        }

        }__CLR4_5_2hschsclwydzr4z.R.inc(23155);if ((((type.equals("LK"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23156)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23157)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23158);sendResponse(channel, manufacturer, id, "LK");

            __CLR4_5_2hschsclwydzr4z.R.inc(23159);if ((((buf.readable())&&(__CLR4_5_2hschsclwydzr4z.R.iget(23160)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23161)==0&false))) {{
                __CLR4_5_2hschsclwydzr4z.R.inc(23162);String[] values = buf.toString(StandardCharsets.US_ASCII).split(",");
                __CLR4_5_2hschsclwydzr4z.R.inc(23163);if ((((values.length >= 3)&&(__CLR4_5_2hschsclwydzr4z.R.iget(23164)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23165)==0&false))) {{
                    __CLR4_5_2hschsclwydzr4z.R.inc(23166);Position position = new Position();
                    __CLR4_5_2hschsclwydzr4z.R.inc(23167);position.setProtocol(getProtocolName());
                    __CLR4_5_2hschsclwydzr4z.R.inc(23168);position.setDeviceId(deviceSession.getDeviceId());

                    __CLR4_5_2hschsclwydzr4z.R.inc(23169);getLastLocation(position, null);

                    __CLR4_5_2hschsclwydzr4z.R.inc(23170);position.set(Position.KEY_BATTERY_LEVEL, Integer.parseInt(values[2]));

                    __CLR4_5_2hschsclwydzr4z.R.inc(23171);return position;
                }
            }}

        }} }else {__CLR4_5_2hschsclwydzr4z.R.inc(23172);if ((((type.equals("UD") || type.equals("UD2") || type.equals("UD3")
                || type.equals("AL") || type.equals("WT"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23173)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23174)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23175);if ((((type.equals("AL"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23176)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23177)==0&false))) {{
                __CLR4_5_2hschsclwydzr4z.R.inc(23178);sendResponse(channel, manufacturer, id, "AL");
            }

            }__CLR4_5_2hschsclwydzr4z.R.inc(23179);Parser parser = new Parser(PATTERN_POSITION, buf.toString(StandardCharsets.US_ASCII));
            __CLR4_5_2hschsclwydzr4z.R.inc(23180);if ((((!parser.matches())&&(__CLR4_5_2hschsclwydzr4z.R.iget(23181)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23182)==0&false))) {{
                __CLR4_5_2hschsclwydzr4z.R.inc(23183);return null;
            }

            }__CLR4_5_2hschsclwydzr4z.R.inc(23184);Position position = new Position();
            __CLR4_5_2hschsclwydzr4z.R.inc(23185);position.setProtocol(getProtocolName());
            __CLR4_5_2hschsclwydzr4z.R.inc(23186);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2hschsclwydzr4z.R.inc(23187);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

            __CLR4_5_2hschsclwydzr4z.R.inc(23188);position.setValid(parser.next().equals("A"));
            __CLR4_5_2hschsclwydzr4z.R.inc(23189);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
            __CLR4_5_2hschsclwydzr4z.R.inc(23190);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
            __CLR4_5_2hschsclwydzr4z.R.inc(23191);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
            __CLR4_5_2hschsclwydzr4z.R.inc(23192);position.setCourse(parser.nextDouble(0));
            __CLR4_5_2hschsclwydzr4z.R.inc(23193);position.setAltitude(parser.nextDouble(0));

            __CLR4_5_2hschsclwydzr4z.R.inc(23194);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_2hschsclwydzr4z.R.inc(23195);position.set(Position.KEY_RSSI, parser.nextInt(0));
            __CLR4_5_2hschsclwydzr4z.R.inc(23196);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt(0));

            __CLR4_5_2hschsclwydzr4z.R.inc(23197);position.set("steps", parser.nextInt(0));

            __CLR4_5_2hschsclwydzr4z.R.inc(23198);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextHexInt(0)));

            __CLR4_5_2hschsclwydzr4z.R.inc(23199);decodeTail(position, parser.next());

            __CLR4_5_2hschsclwydzr4z.R.inc(23200);return position;

        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23201);if ((((type.equals("TKQ"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23202)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23203)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23204);sendResponse(channel, manufacturer, id, "TKQ");

        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23205);if ((((type.equals("PULSE") || type.equals("heart"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23206)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23207)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23208);if ((((buf.readable())&&(__CLR4_5_2hschsclwydzr4z.R.iget(23209)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23210)==0&false))) {{

                __CLR4_5_2hschsclwydzr4z.R.inc(23211);Position position = new Position();
                __CLR4_5_2hschsclwydzr4z.R.inc(23212);position.setProtocol(getProtocolName());
                __CLR4_5_2hschsclwydzr4z.R.inc(23213);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2hschsclwydzr4z.R.inc(23214);getLastLocation(position, new Date());

                __CLR4_5_2hschsclwydzr4z.R.inc(23215);position.setValid(false);
                __CLR4_5_2hschsclwydzr4z.R.inc(23216);String pulse = buf.toString(StandardCharsets.US_ASCII);
                __CLR4_5_2hschsclwydzr4z.R.inc(23217);position.set("pulse", pulse);
                __CLR4_5_2hschsclwydzr4z.R.inc(23218);position.set(Position.KEY_RESULT, pulse);

                __CLR4_5_2hschsclwydzr4z.R.inc(23219);return position;

            }

        }} }else {__CLR4_5_2hschsclwydzr4z.R.inc(23220);if ((((type.equals("img"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23221)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23222)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23223);Position position = new Position();
            __CLR4_5_2hschsclwydzr4z.R.inc(23224);position.setProtocol(getProtocolName());
            __CLR4_5_2hschsclwydzr4z.R.inc(23225);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2hschsclwydzr4z.R.inc(23226);getLastLocation(position, null);

            __CLR4_5_2hschsclwydzr4z.R.inc(23227);int timeIndex = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');
            __CLR4_5_2hschsclwydzr4z.R.inc(23228);buf.readerIndex(timeIndex + 12 + 2);
            __CLR4_5_2hschsclwydzr4z.R.inc(23229);position.set(Position.KEY_IMAGE, Context.getMediaManager().writeFile(id, buf, "jpg"));

            __CLR4_5_2hschsclwydzr4z.R.inc(23230);return position;

        } }else {__CLR4_5_2hschsclwydzr4z.R.inc(23231);if ((((type.equals("TK"))&&(__CLR4_5_2hschsclwydzr4z.R.iget(23232)!=0|true))||(__CLR4_5_2hschsclwydzr4z.R.iget(23233)==0&false))) {{

            __CLR4_5_2hschsclwydzr4z.R.inc(23234);Position position = new Position();
            __CLR4_5_2hschsclwydzr4z.R.inc(23235);position.setProtocol(getProtocolName());
            __CLR4_5_2hschsclwydzr4z.R.inc(23236);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2hschsclwydzr4z.R.inc(23237);getLastLocation(position, null);

            __CLR4_5_2hschsclwydzr4z.R.inc(23238);position.set(Position.KEY_AUDIO, Context.getMediaManager().writeFile(id, buf, "amr"));

            __CLR4_5_2hschsclwydzr4z.R.inc(23239);return position;

        }

        }}}}}}__CLR4_5_2hschsclwydzr4z.R.inc(23240);return null;
    }finally{__CLR4_5_2hschsclwydzr4z.R.flushNeeded();}}

}
