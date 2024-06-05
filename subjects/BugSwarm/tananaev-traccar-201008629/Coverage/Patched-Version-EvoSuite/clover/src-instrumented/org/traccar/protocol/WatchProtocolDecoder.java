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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
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
import java.util.Date;
import java.util.regex.Pattern;

public class WatchProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fbefbelx1dzchn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,19995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WatchProtocolDecoder(WatchProtocol protocol) {
        super(protocol);__CLR4_5_2fbefbelx1dzchn.R.inc(19851);try{__CLR4_5_2fbefbelx1dzchn.R.inc(19850);
    }finally{__CLR4_5_2fbefbelx1dzchn.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("[")
            .expression("(..)").text("*")        // manufacturer
            .number("(d+)").text("*")            // equipment id
            .number("xxxx").text("*")            // length
            .expression("([^,]+)")               // type
            .expression("(.*)")                  // content
            .compile();

    private static final Pattern PATTERN_POSITION = new PatternBuilder()
            .text(",")
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time
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
            .expression("([^\\]]*)")             // cell and wifi
            .text("]").optional()
            .compile();

    private void sendResponse(Channel channel, String manufacturer, String id, String content) {try{__CLR4_5_2fbefbelx1dzchn.R.inc(19852);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19853);if ((((channel != null)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19854)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19855)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19856);channel.write(String.format(
                    "[%s*%s*%04x*%s]", manufacturer, id, content.length(), content));
        }
    }}finally{__CLR4_5_2fbefbelx1dzchn.R.flushNeeded();}}

    private String decodeAlarm(int status) {try{__CLR4_5_2fbefbelx1dzchn.R.inc(19857);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19858);if ((((BitUtil.check(status, 0))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19859)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19860)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19861);return Position.ALARM_LOW_BATTERY;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19862);if ((((BitUtil.check(status, 1))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19863)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19864)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19865);return Position.ALARM_GEOFENCE_EXIT;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19866);if ((((BitUtil.check(status, 2))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19867)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19868)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19869);return Position.ALARM_GEOFENCE_ENTER;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19870);if ((((BitUtil.check(status, 3))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19871)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19872)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19873);return Position.ALARM_OVERSPEED;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19874);if ((((BitUtil.check(status, 16))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19875)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19876)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19877);return Position.ALARM_SOS;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19878);if ((((BitUtil.check(status, 17))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19879)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19880)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19881);return Position.ALARM_LOW_BATTERY;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19882);if ((((BitUtil.check(status, 18))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19883)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19884)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19885);return Position.ALARM_GEOFENCE_EXIT;
        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19886);if ((((BitUtil.check(status, 19))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19887)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19888)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19889);return Position.ALARM_GEOFENCE_ENTER;
        }
        }}}}}}}}__CLR4_5_2fbefbelx1dzchn.R.inc(19890);return null;
    }finally{__CLR4_5_2fbefbelx1dzchn.R.flushNeeded();}}

    private void decodeTail(Position position, String data) {try{__CLR4_5_2fbefbelx1dzchn.R.inc(19891);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19892);String[] values = data.split(",");
        __CLR4_5_2fbefbelx1dzchn.R.inc(19893);int index = 0;

        __CLR4_5_2fbefbelx1dzchn.R.inc(19894);Network network = new Network();

        __CLR4_5_2fbefbelx1dzchn.R.inc(19895);int cellCount = Integer.parseInt(values[index++]);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19896);index += 1; // timing advance
        __CLR4_5_2fbefbelx1dzchn.R.inc(19897);int mcc = Integer.parseInt(values[index++]);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19898);int mnc = Integer.parseInt(values[index++]);

        __CLR4_5_2fbefbelx1dzchn.R.inc(19899);for (int i = 0; (((i < cellCount)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19900)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19901)==0&false)); i++) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19902);network.addCellTower(CellTower.from(mcc, mnc,
                    Integer.parseInt(values[index++]), Integer.parseInt(values[index++]),
                    Integer.parseInt(values[index++])));
        }

        }__CLR4_5_2fbefbelx1dzchn.R.inc(19903);if ((((index < values.length && !values[index].isEmpty())&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19904)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19905)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19906);int wifiCount = Integer.parseInt(values[index++]);

            __CLR4_5_2fbefbelx1dzchn.R.inc(19907);for (int i = 0; (((i < wifiCount)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19908)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19909)==0&false)); i++) {{
                __CLR4_5_2fbefbelx1dzchn.R.inc(19910);index += 1; // wifi name
                __CLR4_5_2fbefbelx1dzchn.R.inc(19911);network.addWifiAccessPoint(WifiAccessPoint.from(
                        values[index++], Integer.parseInt(values[index++])));
            }
        }}

        }__CLR4_5_2fbefbelx1dzchn.R.inc(19912);if ((((network.getCellTowers() != null || network.getWifiAccessPoints() != null)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19913)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19914)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19915);position.setNetwork(network);
        }
    }}finally{__CLR4_5_2fbefbelx1dzchn.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fbefbelx1dzchn.R.inc(19916);

        __CLR4_5_2fbefbelx1dzchn.R.inc(19917);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19918);if ((((!parser.matches())&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19919)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19920)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19921);return null;
        }

        }__CLR4_5_2fbefbelx1dzchn.R.inc(19922);String manufacturer = parser.next();
        __CLR4_5_2fbefbelx1dzchn.R.inc(19923);String id = parser.next();
        __CLR4_5_2fbefbelx1dzchn.R.inc(19924);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2fbefbelx1dzchn.R.inc(19925);if ((((deviceSession == null)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19926)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19927)==0&false))) {{
            __CLR4_5_2fbefbelx1dzchn.R.inc(19928);return null;
        }

        }__CLR4_5_2fbefbelx1dzchn.R.inc(19929);String type = parser.next();
        __CLR4_5_2fbefbelx1dzchn.R.inc(19930);String content = parser.next();

        __CLR4_5_2fbefbelx1dzchn.R.inc(19931);if ((((type.equals("LK"))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19932)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19933)==0&false))) {{

            __CLR4_5_2fbefbelx1dzchn.R.inc(19934);sendResponse(channel, manufacturer, id, "LK");

            __CLR4_5_2fbefbelx1dzchn.R.inc(19935);if ((((!content.isEmpty())&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19936)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19937)==0&false))) {{
                __CLR4_5_2fbefbelx1dzchn.R.inc(19938);String[] values = content.split(",");
                __CLR4_5_2fbefbelx1dzchn.R.inc(19939);if ((((values.length >= 4)&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19940)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19941)==0&false))) {{
                    __CLR4_5_2fbefbelx1dzchn.R.inc(19942);Position position = new Position();
                    __CLR4_5_2fbefbelx1dzchn.R.inc(19943);position.setProtocol(getProtocolName());
                    __CLR4_5_2fbefbelx1dzchn.R.inc(19944);position.setDeviceId(deviceSession.getDeviceId());

                    __CLR4_5_2fbefbelx1dzchn.R.inc(19945);getLastLocation(position, null);

                    __CLR4_5_2fbefbelx1dzchn.R.inc(19946);position.set(Position.KEY_BATTERY, values[3]);

                    __CLR4_5_2fbefbelx1dzchn.R.inc(19947);return position;
                }
            }}

        }} }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19948);if ((((type.equals("UD") || type.equals("UD2") || type.equals("AL"))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19949)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19950)==0&false))) {{

            __CLR4_5_2fbefbelx1dzchn.R.inc(19951);if ((((type.equals("AL"))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19952)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19953)==0&false))) {{
                __CLR4_5_2fbefbelx1dzchn.R.inc(19954);sendResponse(channel, manufacturer, id, "AL");
            }

            }__CLR4_5_2fbefbelx1dzchn.R.inc(19955);parser = new Parser(PATTERN_POSITION, content);
            __CLR4_5_2fbefbelx1dzchn.R.inc(19956);if ((((!parser.matches())&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19957)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19958)==0&false))) {{
                __CLR4_5_2fbefbelx1dzchn.R.inc(19959);return null;
            }

            }__CLR4_5_2fbefbelx1dzchn.R.inc(19960);Position position = new Position();
            __CLR4_5_2fbefbelx1dzchn.R.inc(19961);position.setProtocol(getProtocolName());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19962);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19963);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19964);position.setTime(dateBuilder.getDate());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19965);position.setValid(parser.next().equals("A"));
            __CLR4_5_2fbefbelx1dzchn.R.inc(19966);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
            __CLR4_5_2fbefbelx1dzchn.R.inc(19967);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
            __CLR4_5_2fbefbelx1dzchn.R.inc(19968);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
            __CLR4_5_2fbefbelx1dzchn.R.inc(19969);position.setCourse(parser.nextDouble());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19970);position.setAltitude(parser.nextDouble());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19971);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19972);position.set(Position.KEY_RSSI, parser.nextInt());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19973);position.set(Position.KEY_BATTERY, parser.nextInt());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19974);position.set("steps", parser.nextInt());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19975);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextInt(16)));

            __CLR4_5_2fbefbelx1dzchn.R.inc(19976);decodeTail(position, parser.next());

            __CLR4_5_2fbefbelx1dzchn.R.inc(19977);return position;

        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19978);if ((((type.equals("TKQ"))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19979)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19980)==0&false))) {{

            __CLR4_5_2fbefbelx1dzchn.R.inc(19981);sendResponse(channel, manufacturer, id, "TKQ");

        } }else {__CLR4_5_2fbefbelx1dzchn.R.inc(19982);if ((((type.equals("PULSE"))&&(__CLR4_5_2fbefbelx1dzchn.R.iget(19983)!=0|true))||(__CLR4_5_2fbefbelx1dzchn.R.iget(19984)==0&false))) {{

            __CLR4_5_2fbefbelx1dzchn.R.inc(19985);Position position = new Position();
            __CLR4_5_2fbefbelx1dzchn.R.inc(19986);position.setProtocol(getProtocolName());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19987);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19988);getLastLocation(position, new Date());
            __CLR4_5_2fbefbelx1dzchn.R.inc(19989);position.setValid(false);
            __CLR4_5_2fbefbelx1dzchn.R.inc(19990);String pulse = content.substring(1);
            __CLR4_5_2fbefbelx1dzchn.R.inc(19991);position.set("pulse", pulse);
            __CLR4_5_2fbefbelx1dzchn.R.inc(19992);position.set(Position.KEY_RESULT, pulse);
            __CLR4_5_2fbefbelx1dzchn.R.inc(19993);return position;

        }

        }}}}__CLR4_5_2fbefbelx1dzchn.R.inc(19994);return null;
    }finally{__CLR4_5_2fbefbelx1dzchn.R.flushNeeded();}}

}
