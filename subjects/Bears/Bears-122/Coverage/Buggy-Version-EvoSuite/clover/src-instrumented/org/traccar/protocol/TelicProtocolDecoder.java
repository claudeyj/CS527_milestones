/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TelicProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fpcfpclwydweu0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,20417,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TelicProtocolDecoder(TelicProtocol protocol) {
        super(protocol);__CLR4_5_2fpcfpclwydweu0.R.inc(20353);try{__CLR4_5_2fpcfpclwydweu0.R.inc(20352);
    }finally{__CLR4_5_2fpcfpclwydweu0.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("dddd")
            .number("(d{6})")                    // device id
            .number("(d+),")                     // type
            .number("d{12},")                    // event time
            .number("d+,")
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .groupBegin()
            .number("(ddd)(dd)(dddd),")          // longitude
            .number("(dd)(dd)(dddd),")           // latitude
            .or()
            .number("(-?d+),")                   // longitude
            .number("(-?d+),")                   // latitude
            .groupEnd()
            .number("(d),")                      // validity
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+)?,")                    // satellites
            .expression("(?:[^,]*,){7}")
            .number("(d+),")                     // battery
            .any()
            .compile();

    private String decodeAlarm(int eventId) {try{__CLR4_5_2fpcfpclwydweu0.R.inc(20354);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2fpcfpclwydweu0.R.inc(20355);switch (eventId) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20356);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20357);return Position.ALARM_POWER_ON;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20358);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20359);return Position.ALARM_SOS;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20360);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20361);return Position.ALARM_POWER_OFF;
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20362);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20363);return Position.ALARM_GEOFENCE_ENTER;
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20364);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20365);return Position.ALARM_GEOFENCE_EXIT;
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20366);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20367);return Position.ALARM_LOW_BATTERY;
            case 25:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20368);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20369);return Position.ALARM_MOVEMENT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fpcfpclwydweu0.R.inc(20370);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fpcfpclwydweu0.R.inc(20371);return null;
        }
    }finally{__CLR4_5_2fpcfpclwydweu0.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fpcfpclwydweu0.R.inc(20372);

        __CLR4_5_2fpcfpclwydweu0.R.inc(20373);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2fpcfpclwydweu0.R.inc(20374);if ((((!parser.matches())&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20375)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20376)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20377);return null;
        }

        }__CLR4_5_2fpcfpclwydweu0.R.inc(20378);Position position = new Position();
        __CLR4_5_2fpcfpclwydweu0.R.inc(20379);position.setProtocol(getProtocolName());

        __CLR4_5_2fpcfpclwydweu0.R.inc(20380);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2fpcfpclwydweu0.R.inc(20381);if ((((deviceSession == null)&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20382)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20383)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20384);return null;
        }
        }__CLR4_5_2fpcfpclwydweu0.R.inc(20385);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fpcfpclwydweu0.R.inc(20386);int event = parser.nextInt(0);
        __CLR4_5_2fpcfpclwydweu0.R.inc(20387);position.set(Position.KEY_EVENT, event);

        __CLR4_5_2fpcfpclwydweu0.R.inc(20388);position.set(Position.KEY_ALARM, decodeAlarm(event));

        __CLR4_5_2fpcfpclwydweu0.R.inc(20389);if ((((event == 11)&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20390)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20391)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20392);position.set(Position.KEY_IGNITION, true);
        } }else {__CLR4_5_2fpcfpclwydweu0.R.inc(20393);if ((((event == 12)&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20394)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20395)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20396);position.set(Position.KEY_IGNITION, false);
        }

        }}__CLR4_5_2fpcfpclwydweu0.R.inc(20397);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2fpcfpclwydweu0.R.inc(20398);if ((((parser.hasNext(6))&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20399)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20400)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20401);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
            __CLR4_5_2fpcfpclwydweu0.R.inc(20402);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
        }

        }__CLR4_5_2fpcfpclwydweu0.R.inc(20403);if ((((parser.hasNext(2))&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20404)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20405)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20406);position.setLongitude(parser.nextDouble(0) / 10000);
            __CLR4_5_2fpcfpclwydweu0.R.inc(20407);position.setLatitude(parser.nextDouble(0) / 10000);
        }

        }__CLR4_5_2fpcfpclwydweu0.R.inc(20408);position.setValid(parser.nextInt(0) != 1);
        __CLR4_5_2fpcfpclwydweu0.R.inc(20409);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_2fpcfpclwydweu0.R.inc(20410);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fpcfpclwydweu0.R.inc(20411);if ((((parser.hasNext())&&(__CLR4_5_2fpcfpclwydweu0.R.iget(20412)!=0|true))||(__CLR4_5_2fpcfpclwydweu0.R.iget(20413)==0&false))) {{
            __CLR4_5_2fpcfpclwydweu0.R.inc(20414);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        }

        }__CLR4_5_2fpcfpclwydweu0.R.inc(20415);position.set(Position.KEY_BATTERY, parser.nextInt(0));

        __CLR4_5_2fpcfpclwydweu0.R.inc(20416);return position;
    }finally{__CLR4_5_2fpcfpclwydweu0.R.flushNeeded();}}

}
