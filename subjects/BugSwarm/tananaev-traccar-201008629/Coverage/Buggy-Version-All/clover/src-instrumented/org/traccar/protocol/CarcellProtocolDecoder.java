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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.Parser.CoordinateFormat;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class CarcellProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26n36n3lx1dxnpz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,8680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CarcellProtocolDecoder(CarcellProtocol protocol) {
        super(protocol);__CLR4_5_26n36n3lx1dxnpz.R.inc(8608);try{__CLR4_5_26n36n3lx1dxnpz.R.inc(8607);
    }finally{__CLR4_5_26n36n3lx1dxnpz.R.flushNeeded();}}

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
            .number("([-+]ddd)([-+]ddd)([-+]ddd),")       // x,y,z
            .or()
            .number("(d+),")                     // accel
            .groupEnd()
            .number("(d+),")                     // battery
            .number("(d+),")                     // csq
            .number("(d),")                      // jamming
            .number("(d+),")                     // hdop
            .expression("([CG]),?")                // clock type
            .number("(dd)(dd)(dd),")             // date
            .number("(dd)(dd)(dd),")             // time
            .number("(d),")                      // block
            .number("(d),")                      // ignition
            .groupBegin()
            .number("(d),")                      // cloned
            .expression("([AF])")                // panic
            .number("(d),")                      // painel
            .number("(d+),")                     // battery voltage
            .or()
            .number("(dd),")                     // time
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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26n36n3lx1dxnpz.R.inc(8609);

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8610);Parser parser = new Parser(PATTERN, (String) msg);

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8611);if ((((!parser.matches())&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8612)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8613)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8614);return null;
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8615);Position position = new Position();
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8616);position.setProtocol(getProtocolName());
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8617);position.set(Position.KEY_ARCHIVE, parser.next().equals("%"));
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8618);position.setValid(true);

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8619);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8620);if ((((deviceSession == null)&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8621)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8622)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8623);return null;
        }
        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8624);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8625);if ((((parser.hasNext(8))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8626)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8627)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8628);position.setLatitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG_MIN_MIN));
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8629);position.setLongitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG_MIN_MIN));
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8630);if ((((parser.hasNext(4))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8631)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8632)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8633);position.setLatitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG));
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8634);position.setLongitude(parser.nextCoordinate(CoordinateFormat.HEM_DEG));
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8635);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt()));
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8636);position.setCourse(parser.nextInt());

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8637);if ((((parser.hasNext(3))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8638)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8639)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8640);position.set("x", parser.nextInt());
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8641);position.set("y", parser.nextInt());
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8642);position.set("z", parser.nextInt());
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8643);if ((((parser.hasNext(1))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8644)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8645)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8646);position.set("accel", parser.nextInt());
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8647);Double internalBattery = (parser.nextDouble() + 100d) * 0.0294d;
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8648);position.set(Position.KEY_BATTERY, internalBattery);
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8649);position.set(Position.KEY_RSSI, parser.nextInt());
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8650);position.set("jamming", parser.next().equals("1"));
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8651);position.set(Position.KEY_GPS, parser.nextInt());

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8652);parser.next(); // clock type

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8653);DateBuilder dateBuilder = new DateBuilder().
                setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8654);position.setTime(dateBuilder.getDate());

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8655);position.set("blocked", parser.next().equals("1"));
        __CLR4_5_26n36n3lx1dxnpz.R.inc(8656);position.set(Position.KEY_IGNITION, parser.next().equals("1"));

        __CLR4_5_26n36n3lx1dxnpz.R.inc(8657);if ((((parser.hasNext(4))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8658)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8659)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8660);position.set("cloned", parser.next().equals("1"));

            __CLR4_5_26n36n3lx1dxnpz.R.inc(8661);parser.next(); // panic button status

            __CLR4_5_26n36n3lx1dxnpz.R.inc(8662);String painelStatus = parser.next();
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8663);if ((((painelStatus.equals("1"))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8664)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8665)==0&false))) {{
                __CLR4_5_26n36n3lx1dxnpz.R.inc(8666);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_26n36n3lx1dxnpz.R.inc(8667);position.set("painel", painelStatus.equals("2"));

            __CLR4_5_26n36n3lx1dxnpz.R.inc(8668);Double mainVoltage = parser.nextDouble() / 100d;
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8669);position.set(Position.KEY_POWER, mainVoltage);
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8670);if ((((parser.hasNext(5))&&(__CLR4_5_26n36n3lx1dxnpz.R.iget(8671)!=0|true))||(__CLR4_5_26n36n3lx1dxnpz.R.iget(8672)==0&false))) {{
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8673);position.set("timeUntilDelivery", parser.nextInt());
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8674);parser.next(); // panic button status
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8675);parser.next(); // aux

            __CLR4_5_26n36n3lx1dxnpz.R.inc(8676);Double mainVoltage = parser.nextDouble() / 100d;
            __CLR4_5_26n36n3lx1dxnpz.R.inc(8677);position.set(Position.KEY_POWER, mainVoltage);

            __CLR4_5_26n36n3lx1dxnpz.R.inc(8678);position.set("iccid", parser.next());
        }

        }__CLR4_5_26n36n3lx1dxnpz.R.inc(8679);return position;
    }finally{__CLR4_5_26n36n3lx1dxnpz.R.flushNeeded();}}

}
