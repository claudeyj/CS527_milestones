/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

import java.net.SocketAddress;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.Parser;
import org.traccar.helper.Parser.CoordinateFormat;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class CarcellProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27gd7gdlwydwccz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,9733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CarcellProtocolDecoder(CarcellProtocol protocol) {
        super(protocol);__CLR4_5_27gd7gdlwydwccz.R.inc(9662);try{__CLR4_5_27gd7gdlwydwccz.R.inc(9661);
    }finally{__CLR4_5_27gd7gdlwydwccz.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression("([$%])")                // memory flag
            .number("(d+),")                     // imei
            .groupBegin()
            .number("([NS])(dd)(dd).(dddd),")    // latitude
            .number("([EW])(ddd)(dd).(dddd),")   // longitude
            .or()
            .text("CEL,")
            .number("([NS])(d+.d+),")            // latitude
            .number("([EW])(d+.d+),")            // longitude
            .groupEnd()
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .groupBegin()
            .number("([-+]ddd)([-+]ddd)([-+]ddd),") // x,y,z
            .or()
            .number("(d+),")                     // accel
            .groupEnd()
            .number("(d+),")                     // battery
            .number("(d+),")                     // csq
            .number("(d),")                      // jamming
            .number("(d+),")                     // hdop
            .expression("([CG]),?")              // clock type
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d),")                      // block
            .number("(d),")                      // ignition
            .groupBegin()
            .number("(d),")                      // cloned
            .expression("([AF])")                // panic
            .number("(d),")                      // painel
            .number("(d+),")                     // battery voltage
            .or()
            .number("(dd),")                     // time until delivery
            .expression("([AF])")                // panic
            .number("(d),")                      // aux
            .number("(d{2,4}),")                 // battery voltage
            .number("(d{20}),")                  // ccid
            .groupEnd()
            .number("(xx)")                      // crc
            .any()                               // full format
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27gd7gdlwydwccz.R.inc(9663);

        __CLR4_5_27gd7gdlwydwccz.R.inc(9664);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_27gd7gdlwydwccz.R.inc(9665);if ((((!parser.matches())&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9666)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9667)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9668);return null;
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9669);Position position = new Position();
        __CLR4_5_27gd7gdlwydwccz.R.inc(9670);position.setProtocol(getProtocolName());
        __CLR4_5_27gd7gdlwydwccz.R.inc(9671);position.set(Position.KEY_ARCHIVE, parser.next().equals("%"));
        __CLR4_5_27gd7gdlwydwccz.R.inc(9672);position.setValid(true);

        __CLR4_5_27gd7gdlwydwccz.R.inc(9673);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27gd7gdlwydwccz.R.inc(9674);if ((((deviceSession == null)&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9675)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9676)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9677);return null;
        }
        }__CLR4_5_27gd7gdlwydwccz.R.inc(9678);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27gd7gdlwydwccz.R.inc(9679);if ((((parser.hasNext(8))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9680)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9681)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9682);position.setLatitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG_MIN_MIN));
            __CLR4_5_27gd7gdlwydwccz.R.inc(9683);position.setLongitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG_MIN_MIN));
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9684);if ((((parser.hasNext(4))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9685)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9686)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9687);position.setLatitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG));
            __CLR4_5_27gd7gdlwydwccz.R.inc(9688);position.setLongitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG));
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9689);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt(0)));
        __CLR4_5_27gd7gdlwydwccz.R.inc(9690);position.setCourse(parser.nextInt(0));

        __CLR4_5_27gd7gdlwydwccz.R.inc(9691);if ((((parser.hasNext(3))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9692)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9693)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9694);position.set("x", parser.nextInt(0));
            __CLR4_5_27gd7gdlwydwccz.R.inc(9695);position.set("y", parser.nextInt(0));
            __CLR4_5_27gd7gdlwydwccz.R.inc(9696);position.set("z", parser.nextInt(0));
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9697);if ((((parser.hasNext(1))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9698)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9699)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9700);position.set(Position.KEY_ACCELERATION, parser.nextInt(0));
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9701);Double internalBattery = (parser.nextDouble(0) + 100d) * 0.0294d;
        __CLR4_5_27gd7gdlwydwccz.R.inc(9702);position.set(Position.KEY_BATTERY, internalBattery);
        __CLR4_5_27gd7gdlwydwccz.R.inc(9703);position.set(Position.KEY_RSSI, parser.nextInt(0));
        __CLR4_5_27gd7gdlwydwccz.R.inc(9704);position.set("jamming", parser.next().equals("1"));
        __CLR4_5_27gd7gdlwydwccz.R.inc(9705);position.set(Position.KEY_GPS, parser.nextInt(0));

        __CLR4_5_27gd7gdlwydwccz.R.inc(9706);position.set("clockType", parser.next());

        __CLR4_5_27gd7gdlwydwccz.R.inc(9707);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_27gd7gdlwydwccz.R.inc(9708);position.set("blocked", parser.next().equals("1"));
        __CLR4_5_27gd7gdlwydwccz.R.inc(9709);position.set(Position.KEY_IGNITION, parser.next().equals("1"));

        __CLR4_5_27gd7gdlwydwccz.R.inc(9710);if ((((parser.hasNext(4))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9711)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9712)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9713);position.set("cloned", parser.next().equals("1"));

            __CLR4_5_27gd7gdlwydwccz.R.inc(9714);parser.next(); // panic button status

            __CLR4_5_27gd7gdlwydwccz.R.inc(9715);String painelStatus = parser.next();
            __CLR4_5_27gd7gdlwydwccz.R.inc(9716);if ((((painelStatus.equals("1"))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9717)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9718)==0&false))) {{
                __CLR4_5_27gd7gdlwydwccz.R.inc(9719);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_27gd7gdlwydwccz.R.inc(9720);position.set("painel", painelStatus.equals("2"));

            __CLR4_5_27gd7gdlwydwccz.R.inc(9721);Double mainVoltage = parser.nextDouble(0) / 100d;
            __CLR4_5_27gd7gdlwydwccz.R.inc(9722);position.set(Position.KEY_POWER, mainVoltage);
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9723);if ((((parser.hasNext(5))&&(__CLR4_5_27gd7gdlwydwccz.R.iget(9724)!=0|true))||(__CLR4_5_27gd7gdlwydwccz.R.iget(9725)==0&false))) {{
            __CLR4_5_27gd7gdlwydwccz.R.inc(9726);position.set("timeUntilDelivery", parser.nextInt(0));
            __CLR4_5_27gd7gdlwydwccz.R.inc(9727);parser.next(); // panic button status
            __CLR4_5_27gd7gdlwydwccz.R.inc(9728);position.set(Position.KEY_INPUT, parser.next());

            __CLR4_5_27gd7gdlwydwccz.R.inc(9729);Double mainVoltage = parser.nextDouble(0) / 100d;
            __CLR4_5_27gd7gdlwydwccz.R.inc(9730);position.set(Position.KEY_POWER, mainVoltage);

            __CLR4_5_27gd7gdlwydwccz.R.inc(9731);position.set("iccid", parser.next());
        }

        }__CLR4_5_27gd7gdlwydwccz.R.inc(9732);return position;
    }finally{__CLR4_5_27gd7gdlwydwccz.R.flushNeeded();}}

}
