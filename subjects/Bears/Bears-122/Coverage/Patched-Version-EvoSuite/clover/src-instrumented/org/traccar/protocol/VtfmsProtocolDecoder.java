/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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

@java.lang.SuppressWarnings({"fallthrough"}) public class VtfmsProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2hozhozlwye41x0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,23001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String[] DIRECTIONS = new String[] {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

    public VtfmsProtocolDecoder(VtfmsProtocol protocol) {
        super(protocol);__CLR4_5_2hozhozlwye41x0.R.inc(22932);try{__CLR4_5_2hozhozlwye41x0.R.inc(22931);
    }finally{__CLR4_5_2hozhozlwye41x0.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("(")
            .number("(d{15}),")                  // imei
            .number("[0-9A-Z]{3}dd,")            // packet count
            .number("(dd),")                     // packet id
            .number("[^,]*,")                    // reserved
            .number("(d+)?,")                    // rssi
            .number("(?:d+)?,")                  // fix status
            .number("(d+)?,")                    // satellites
            .number("[^,]*,")                    // reserved
            .expression("([AV]),")               // validity
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(dd)(dd)(dd),")             // time (ddmmyy)
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(?:(d+)|([NESW]{1,2})),")   // course
            .number("(d+),")                     // speed
            .number("(d+),")                     // hours
            .number("(d+),")                     // idle hours
            .expression("[KNT],")                // antenna status
            .number("(d+),")                     // odometer
            .expression("([01]),")               // power status
            .number("(d+.d+),")                  // power voltage
            .number("[^,]*,")                    // reserved
            .number("(d+)?,")                    // fuel level
            .number("(d+.d+),")                  // adc 1
            .number("[^,]*,")                    // reserved
            .number("(d+.d+)?,")                 // adc 2
            .expression("([01]),")               // di 1
            .expression("([01]),")               // di 2
            .expression("([01]),")               // di 3
            .expression("([01]),")               // di 4
            .expression("([01]),")               // do 1
            .expression("([01]),")               // do 2
            .expression("([01]),")               // do 3
            .number("[^,]*,")                    // reserved
            .number("[^,]*")                     // reserved
            .text(")")
            .number("ddd")                       // checksum
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2hozhozlwye41x0.R.inc(22933);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2hozhozlwye41x0.R.inc(22934);switch (value) {
            case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22935);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22936);return Position.ALARM_OVERSPEED;
            case 14:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22937);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22938);return Position.ALARM_POWER_CUT;
            case 15:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22939);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22940);return Position.ALARM_POWER_RESTORED;
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22941);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22942);return Position.ALARM_BREAKING;
            case 33:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22943);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22944);return Position.ALARM_ACCELERATION;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2hozhozlwye41x0.R.inc(22945);__CLB4_5_2_bool0=true;}
                __CLR4_5_2hozhozlwye41x0.R.inc(22946);return null;
        }
    }finally{__CLR4_5_2hozhozlwye41x0.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2hozhozlwye41x0.R.inc(22947);

        __CLR4_5_2hozhozlwye41x0.R.inc(22948);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2hozhozlwye41x0.R.inc(22949);if ((((!parser.matches())&&(__CLR4_5_2hozhozlwye41x0.R.iget(22950)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22951)==0&false))) {{
            __CLR4_5_2hozhozlwye41x0.R.inc(22952);return null;
        }

        }__CLR4_5_2hozhozlwye41x0.R.inc(22953);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2hozhozlwye41x0.R.inc(22954);if ((((deviceSession == null)&&(__CLR4_5_2hozhozlwye41x0.R.iget(22955)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22956)==0&false))) {{
            __CLR4_5_2hozhozlwye41x0.R.inc(22957);return null;
        }

        }__CLR4_5_2hozhozlwye41x0.R.inc(22958);Position position = new Position();
        __CLR4_5_2hozhozlwye41x0.R.inc(22959);position.setProtocol(getProtocolName());
        __CLR4_5_2hozhozlwye41x0.R.inc(22960);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2hozhozlwye41x0.R.inc(22961);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextInt()));
        __CLR4_5_2hozhozlwye41x0.R.inc(22962);position.set(Position.KEY_RSSI, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22963);position.set(Position.KEY_SATELLITES, parser.nextInt());

        __CLR4_5_2hozhozlwye41x0.R.inc(22964);position.setValid(parser.next().equals("A"));
        __CLR4_5_2hozhozlwye41x0.R.inc(22965);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));
        __CLR4_5_2hozhozlwye41x0.R.inc(22966);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2hozhozlwye41x0.R.inc(22967);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_2hozhozlwye41x0.R.inc(22968);if ((((parser.hasNext())&&(__CLR4_5_2hozhozlwye41x0.R.iget(22969)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22970)==0&false))) {{
            __CLR4_5_2hozhozlwye41x0.R.inc(22971);position.setCourse(parser.nextDouble(0));
        }
        }__CLR4_5_2hozhozlwye41x0.R.inc(22972);if ((((parser.hasNext())&&(__CLR4_5_2hozhozlwye41x0.R.iget(22973)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22974)==0&false))) {{
            __CLR4_5_2hozhozlwye41x0.R.inc(22975);String direction = parser.next();
            __CLR4_5_2hozhozlwye41x0.R.inc(22976);for (int i = 0; (((i < DIRECTIONS.length)&&(__CLR4_5_2hozhozlwye41x0.R.iget(22977)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22978)==0&false)); i++) {{
                __CLR4_5_2hozhozlwye41x0.R.inc(22979);if ((((direction.equals(DIRECTIONS[i]))&&(__CLR4_5_2hozhozlwye41x0.R.iget(22980)!=0|true))||(__CLR4_5_2hozhozlwye41x0.R.iget(22981)==0&false))) {{
                    __CLR4_5_2hozhozlwye41x0.R.inc(22982);position.setCourse(i * 45.0);
                    __CLR4_5_2hozhozlwye41x0.R.inc(22983);break;
                }
            }}
        }}

        }__CLR4_5_2hozhozlwye41x0.R.inc(22984);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));

        __CLR4_5_2hozhozlwye41x0.R.inc(22985);position.set(Position.KEY_HOURS, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22986);position.set("idleHours", parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22987);position.set(Position.KEY_ODOMETER, parser.nextInt() * 100);
        __CLR4_5_2hozhozlwye41x0.R.inc(22988);position.set(Position.KEY_CHARGE, parser.next().equals("1"));
        __CLR4_5_2hozhozlwye41x0.R.inc(22989);position.set(Position.KEY_POWER, parser.nextDouble());
        __CLR4_5_2hozhozlwye41x0.R.inc(22990);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22991);position.set(Position.PREFIX_ADC + 1, parser.nextDouble());
        __CLR4_5_2hozhozlwye41x0.R.inc(22992);position.set(Position.PREFIX_ADC + 2, parser.nextDouble());
        __CLR4_5_2hozhozlwye41x0.R.inc(22993);position.set(Position.PREFIX_IN + 1, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22994);position.set(Position.PREFIX_IN + 2, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22995);position.set(Position.PREFIX_IN + 3, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22996);position.set(Position.PREFIX_IN + 4, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22997);position.set(Position.PREFIX_OUT + 1, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22998);position.set(Position.PREFIX_OUT + 2, parser.nextInt());
        __CLR4_5_2hozhozlwye41x0.R.inc(22999);position.set(Position.PREFIX_OUT + 3, parser.nextInt());

        __CLR4_5_2hozhozlwye41x0.R.inc(23000);return position;
    }finally{__CLR4_5_2hozhozlwye41x0.R.flushNeeded();}}

}
