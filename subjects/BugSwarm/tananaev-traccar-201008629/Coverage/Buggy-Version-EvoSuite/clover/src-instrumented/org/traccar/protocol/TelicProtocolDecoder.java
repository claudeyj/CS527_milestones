/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TelicProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dktdktlx1dveua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,17653,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TelicProtocolDecoder(TelicProtocol protocol) {
        super(protocol);__CLR4_5_2dktdktlx1dveua.R.inc(17598);try{__CLR4_5_2dktdktlx1dveua.R.inc(17597);
    }finally{__CLR4_5_2dktdktlx1dveua.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("dddd")
            .number("(d{6})")                    // device id
            .number("(d+),")                     // type
            .number("d{12},")                    // event time
            .number("d+,")
            .number("(dd)(dd)(dd)")              // date
            .number("(dd)(dd)(dd),")             // time
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
            .number("(d+),")                     // satellites
            .expression("(?:[^,]*,){7}")
            .number("(d+),")                     // battery
            .expression("[^,]*,")
            .number("(d+),")                     // external
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dktdktlx1dveua.R.inc(17599);

        __CLR4_5_2dktdktlx1dveua.R.inc(17600);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2dktdktlx1dveua.R.inc(17601);if ((((!parser.matches())&&(__CLR4_5_2dktdktlx1dveua.R.iget(17602)!=0|true))||(__CLR4_5_2dktdktlx1dveua.R.iget(17603)==0&false))) {{
            __CLR4_5_2dktdktlx1dveua.R.inc(17604);return null;
        }

        }__CLR4_5_2dktdktlx1dveua.R.inc(17605);Position position = new Position();
        __CLR4_5_2dktdktlx1dveua.R.inc(17606);position.setProtocol(getProtocolName());

        __CLR4_5_2dktdktlx1dveua.R.inc(17607);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2dktdktlx1dveua.R.inc(17608);if ((((deviceSession == null)&&(__CLR4_5_2dktdktlx1dveua.R.iget(17609)!=0|true))||(__CLR4_5_2dktdktlx1dveua.R.iget(17610)==0&false))) {{
            __CLR4_5_2dktdktlx1dveua.R.inc(17611);return null;
        }
        }__CLR4_5_2dktdktlx1dveua.R.inc(17612);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dktdktlx1dveua.R.inc(17613);int event = parser.nextInt();
        __CLR4_5_2dktdktlx1dveua.R.inc(17614);position.set(Position.KEY_TYPE, event);

        __CLR4_5_2dktdktlx1dveua.R.inc(17615);position.set(Position.KEY_ALARM, decodeAlarm(event));

        __CLR4_5_2dktdktlx1dveua.R.inc(17616);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2dktdktlx1dveua.R.inc(17617);position.setTime(dateBuilder.getDate());

        __CLR4_5_2dktdktlx1dveua.R.inc(17618);if ((((parser.hasNext(6))&&(__CLR4_5_2dktdktlx1dveua.R.iget(17619)!=0|true))||(__CLR4_5_2dktdktlx1dveua.R.iget(17620)==0&false))) {{
            __CLR4_5_2dktdktlx1dveua.R.inc(17621);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
            __CLR4_5_2dktdktlx1dveua.R.inc(17622);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN));
        }

        }__CLR4_5_2dktdktlx1dveua.R.inc(17623);if ((((parser.hasNext(2))&&(__CLR4_5_2dktdktlx1dveua.R.iget(17624)!=0|true))||(__CLR4_5_2dktdktlx1dveua.R.iget(17625)==0&false))) {{
            __CLR4_5_2dktdktlx1dveua.R.inc(17626);position.setLongitude(parser.nextDouble() / 10000);
            __CLR4_5_2dktdktlx1dveua.R.inc(17627);position.setLatitude(parser.nextDouble() / 10000);
        }

        }__CLR4_5_2dktdktlx1dveua.R.inc(17628);position.setValid(parser.nextInt() != 1);
        __CLR4_5_2dktdktlx1dveua.R.inc(17629);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_2dktdktlx1dveua.R.inc(17630);position.setCourse(parser.nextDouble());

        __CLR4_5_2dktdktlx1dveua.R.inc(17631);position.set(Position.KEY_SATELLITES, parser.next());
        __CLR4_5_2dktdktlx1dveua.R.inc(17632);position.set(Position.KEY_BATTERY, 3.4 + parser.nextInt() * 0.00345);
        __CLR4_5_2dktdktlx1dveua.R.inc(17633);position.set(Position.KEY_POWER, 6.0 + parser.nextInt() * 0.125);

        __CLR4_5_2dktdktlx1dveua.R.inc(17634);return position;
    }finally{__CLR4_5_2dktdktlx1dveua.R.flushNeeded();}}

    private String decodeAlarm(int eventId) {try{__CLR4_5_2dktdktlx1dveua.R.inc(17635);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dktdktlx1dveua.R.inc(17636);switch (eventId) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17637);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17638);return Position.ALARM_POWER_ON;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17639);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17640);return Position.ALARM_SOS;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17641);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17642);return Position.ALARM_POWER_OFF;
            case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17643);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17644);return Position.ALARM_GEOFENCE_ENTER;
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17645);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17646);return Position.ALARM_GEOFENCE_EXIT;
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17647);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17648);return Position.ALARM_LOW_BATTERY;
            case 25:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17649);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17650);return Position.ALARM_MOVEMENT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dktdktlx1dveua.R.inc(17651);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dktdktlx1dveua.R.inc(17652);return null;
        }
    }finally{__CLR4_5_2dktdktlx1dveua.R.flushNeeded();}}
}
