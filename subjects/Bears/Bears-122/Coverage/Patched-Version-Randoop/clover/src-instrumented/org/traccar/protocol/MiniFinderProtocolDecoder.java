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
import org.traccar.helper.BitUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class MiniFinderProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ctvctvlwye66ap{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,16732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MiniFinderProtocolDecoder(MiniFinderProtocol protocol) {
        super(protocol);__CLR4_5_2ctvctvlwye66ap.R.inc(16628);try{__CLR4_5_2ctvctvlwye66ap.R.inc(16627);
    }finally{__CLR4_5_2ctvctvlwye66ap.R.flushNeeded();}}

    private static final Pattern PATTERN_FIX = new PatternBuilder()
            .number("(d+)/(d+)/(d+),")           // date (dd/mm/yy)
            .number("(d+):(d+):(d+),")           // time (hh:mm:ss)
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .compile();

    private static final Pattern PATTERN_STATE = new PatternBuilder()
            .number("(d+.?d*),")                 // speed (km/h)
            .number("(d+.?d*),")                 // course
            .number("(x+),")                     // flags
            .number("(-?d+.d+),")                // altitude (meters)
            .number("(d+),")                     // battery (percentage)
            .compile();

    private static final Pattern PATTERN_A = new PatternBuilder()
            .text("!A,")
            .expression(PATTERN_FIX.pattern())
            .any()                               // unknown 3 fields
            .compile();

   private static final Pattern PATTERN_C = new PatternBuilder()
            .text("!C,")
            .expression(PATTERN_FIX.pattern())
            .expression(PATTERN_STATE.pattern())
            .any()                               // unknown 3 fields
            .compile();

    private static final Pattern PATTERN_BD = new PatternBuilder()
            .expression("![BD],")                // B - buffered, D - live
            .expression(PATTERN_FIX.pattern())
            .expression(PATTERN_STATE.pattern())
            .number("(d+),")                     // satellites in use
            .number("(d+),")                     // satellites in view
            .number("(d+.?d*)")                  // hdop
            .compile();

    private void decodeFix(Position position, Parser parser) {try{__CLR4_5_2ctvctvlwye66ap.R.inc(16629);

        __CLR4_5_2ctvctvlwye66ap.R.inc(16630);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));
        __CLR4_5_2ctvctvlwye66ap.R.inc(16631);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2ctvctvlwye66ap.R.inc(16632);position.setLongitude(parser.nextDouble(0));
    }finally{__CLR4_5_2ctvctvlwye66ap.R.flushNeeded();}}

    private void decodeFlags(Position position, int flags) {try{__CLR4_5_2ctvctvlwye66ap.R.inc(16633);

        __CLR4_5_2ctvctvlwye66ap.R.inc(16634);position.setValid(BitUtil.to(flags, 2) > 0);
        __CLR4_5_2ctvctvlwye66ap.R.inc(16635);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16636)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16637)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16638);position.set(Position.KEY_APPROXIMATE, true);
        }

        }__CLR4_5_2ctvctvlwye66ap.R.inc(16639);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16640)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16641)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16642);position.set(Position.KEY_ALARM, Position.ALARM_FAULT);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16643);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16644)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16645)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16646);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16647);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16648)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16649)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16650);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16651);if ((((BitUtil.check(flags, 8))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16652)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16653)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16654);position.set(Position.KEY_ALARM, Position.ALARM_FALL_DOWN);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16655);if ((((BitUtil.check(flags, 9) || BitUtil.check(flags, 10) || BitUtil.check(flags, 11))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16656)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16657)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16658);position.set(Position.KEY_ALARM, Position.ALARM_GEOFENCE);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16659);if ((((BitUtil.check(flags, 12))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16660)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16661)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16662);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
        }
        }__CLR4_5_2ctvctvlwye66ap.R.inc(16663);if ((((BitUtil.check(flags, 15) || BitUtil.check(flags, 14))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16664)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16665)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16666);position.set(Position.KEY_ALARM, Position.ALARM_MOVEMENT);
        }

        }__CLR4_5_2ctvctvlwye66ap.R.inc(16667);position.set(Position.KEY_RSSI, BitUtil.between(flags, 16, 21));
        __CLR4_5_2ctvctvlwye66ap.R.inc(16668);position.set(Position.KEY_CHARGE, BitUtil.check(flags, 22));
    }finally{__CLR4_5_2ctvctvlwye66ap.R.flushNeeded();}}

    private void decodeState(Position position, Parser parser) {try{__CLR4_5_2ctvctvlwye66ap.R.inc(16669);

        __CLR4_5_2ctvctvlwye66ap.R.inc(16670);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));

        __CLR4_5_2ctvctvlwye66ap.R.inc(16671);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2ctvctvlwye66ap.R.inc(16672);if ((((position.getCourse() > 360)&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16673)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16674)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16675);position.setCourse(0);
        }

        }__CLR4_5_2ctvctvlwye66ap.R.inc(16676);decodeFlags(position, parser.nextHexInt(0));

        __CLR4_5_2ctvctvlwye66ap.R.inc(16677);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2ctvctvlwye66ap.R.inc(16678);position.set(Position.KEY_BATTERY, parser.nextInt(0));
    }finally{__CLR4_5_2ctvctvlwye66ap.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ctvctvlwye66ap.R.inc(16679);

        __CLR4_5_2ctvctvlwye66ap.R.inc(16680);String sentence = (String) msg;

        __CLR4_5_2ctvctvlwye66ap.R.inc(16681);if ((((sentence.startsWith("!1,"))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16682)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16683)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16684);getDeviceSession(channel, remoteAddress, sentence.substring(3, sentence.length()));
            __CLR4_5_2ctvctvlwye66ap.R.inc(16685);return null;
        }

        }__CLR4_5_2ctvctvlwye66ap.R.inc(16686);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2ctvctvlwye66ap.R.inc(16687);if ((((deviceSession == null || !sentence.matches("![A-D],.*"))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16688)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16689)==0&false))) {{
            __CLR4_5_2ctvctvlwye66ap.R.inc(16690);return null;
        }

        }__CLR4_5_2ctvctvlwye66ap.R.inc(16691);Position position = new Position();
        __CLR4_5_2ctvctvlwye66ap.R.inc(16692);position.setProtocol(getProtocolName());
        __CLR4_5_2ctvctvlwye66ap.R.inc(16693);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ctvctvlwye66ap.R.inc(16694);String type = sentence.substring(1, 2);
        __CLR4_5_2ctvctvlwye66ap.R.inc(16695);position.set(Position.KEY_TYPE, type);

        __CLR4_5_2ctvctvlwye66ap.R.inc(16696);if ((((type.equals("B") || type.equals("D"))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16697)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16698)==0&false))) {{

            __CLR4_5_2ctvctvlwye66ap.R.inc(16699);Parser parser = new Parser(PATTERN_BD, sentence);
            __CLR4_5_2ctvctvlwye66ap.R.inc(16700);if ((((!parser.matches())&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16701)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16702)==0&false))) {{
                __CLR4_5_2ctvctvlwye66ap.R.inc(16703);return null;
            }

            }__CLR4_5_2ctvctvlwye66ap.R.inc(16704);decodeFix(position, parser);
            __CLR4_5_2ctvctvlwye66ap.R.inc(16705);decodeState(position, parser);

            __CLR4_5_2ctvctvlwye66ap.R.inc(16706);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_2ctvctvlwye66ap.R.inc(16707);position.set(Position.KEY_SATELLITES_VISIBLE, parser.nextInt(0));
            __CLR4_5_2ctvctvlwye66ap.R.inc(16708);position.set(Position.KEY_HDOP, parser.nextDouble(0));

            __CLR4_5_2ctvctvlwye66ap.R.inc(16709);return position;

        } }else {__CLR4_5_2ctvctvlwye66ap.R.inc(16710);if ((((type.equals("C"))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16711)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16712)==0&false))) {{

            __CLR4_5_2ctvctvlwye66ap.R.inc(16713);Parser parser = new Parser(PATTERN_C, sentence);
            __CLR4_5_2ctvctvlwye66ap.R.inc(16714);if ((((!parser.matches())&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16715)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16716)==0&false))) {{
                __CLR4_5_2ctvctvlwye66ap.R.inc(16717);return null;
            }

            }__CLR4_5_2ctvctvlwye66ap.R.inc(16718);decodeFix(position, parser);
            __CLR4_5_2ctvctvlwye66ap.R.inc(16719);decodeState(position, parser);

            __CLR4_5_2ctvctvlwye66ap.R.inc(16720);return position;

        } }else {__CLR4_5_2ctvctvlwye66ap.R.inc(16721);if ((((type.equals("A"))&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16722)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16723)==0&false))) {{

            __CLR4_5_2ctvctvlwye66ap.R.inc(16724);Parser parser = new Parser(PATTERN_A, sentence);
            __CLR4_5_2ctvctvlwye66ap.R.inc(16725);if ((((!parser.matches())&&(__CLR4_5_2ctvctvlwye66ap.R.iget(16726)!=0|true))||(__CLR4_5_2ctvctvlwye66ap.R.iget(16727)==0&false))) {{
                __CLR4_5_2ctvctvlwye66ap.R.inc(16728);return null;
            }

            }__CLR4_5_2ctvctvlwye66ap.R.inc(16729);decodeFix(position, parser);

            __CLR4_5_2ctvctvlwye66ap.R.inc(16730);return position;

        }

        }}}__CLR4_5_2ctvctvlwye66ap.R.inc(16731);return null;
    }finally{__CLR4_5_2ctvctvlwye66ap.R.flushNeeded();}}

}
