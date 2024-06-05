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
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class MiniFinderProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2b1eb1elx1dwjzy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,14380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MiniFinderProtocolDecoder(MiniFinderProtocol protocol) {
        super(protocol);__CLR4_5_2b1eb1elx1dwjzy.R.inc(14307);try{__CLR4_5_2b1eb1elx1dwjzy.R.inc(14306);
    }finally{__CLR4_5_2b1eb1elx1dwjzy.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression("![A-D],")
            .number("(d+)/(d+)/(d+),")           // date
            .number("(d+):(d+):(d+),")           // time
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .groupBegin()
            .number("(x+),")                     // flags
            .number("(-?d+.d+),")                // altitude
            .number("(d+),")                     // battery
            .number("(d+),")                     // satellites in use
            .number("(d+),")                     // satellites in view
            .text("0")
            .or()
            .any()
            .groupEnd()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2b1eb1elx1dwjzy.R.inc(14308);

        __CLR4_5_2b1eb1elx1dwjzy.R.inc(14309);String sentence = (String) msg;

        __CLR4_5_2b1eb1elx1dwjzy.R.inc(14310);if ((((sentence.startsWith("!1"))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14311)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14312)==0&false))) {{

            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14313);getDeviceSession(channel, remoteAddress, sentence.substring(3, sentence.length()));

        } }else {__CLR4_5_2b1eb1elx1dwjzy.R.inc(14314);if ((((sentence.matches("![A-D].*"))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14315)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14316)==0&false))) {{

            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14317);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14318);if ((((deviceSession == null)&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14319)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14320)==0&false))) {{
                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14321);return null;
            }

            }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14322);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14323);if ((((!parser.matches())&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14324)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14325)==0&false))) {{
                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14326);return null;
            }

            }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14327);Position position = new Position();
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14328);position.setProtocol(getProtocolName());
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14329);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14330);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14331);position.setTime(dateBuilder.getDate());

            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14332);position.setLatitude(parser.nextDouble());
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14333);position.setLongitude(parser.nextDouble());
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14334);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));

            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14335);position.setCourse(parser.nextDouble());
            __CLR4_5_2b1eb1elx1dwjzy.R.inc(14336);if ((((position.getCourse() > 360)&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14337)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14338)==0&false))) {{
                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14339);position.setCourse(0);
            }

            }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14340);if ((((parser.hasNext(5))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14341)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14342)==0&false))) {{

                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14343);int flags = parser.nextInt(16);

                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14344);position.setValid(BitUtil.check(flags, 0));

                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14345);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14346)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14347)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14348);position.set(Position.KEY_ALARM, Position.ALARM_FAULT);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14349);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14350)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14351)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14352);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14353);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14354)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14355)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14356);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14357);if ((((BitUtil.check(flags, 8))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14358)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14359)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14360);position.set(Position.KEY_ALARM, Position.ALARM_FALL_DOWN);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14361);if ((((BitUtil.check(flags, 9) || BitUtil.check(flags, 10) || BitUtil.check(flags, 11))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14362)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14363)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14364);position.set(Position.KEY_ALARM, Position.ALARM_GEOFENCE);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14365);if ((((BitUtil.check(flags, 12))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14366)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14367)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14368);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                }
                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14369);if ((((BitUtil.check(flags, 15) || BitUtil.check(flags, 14))&&(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14370)!=0|true))||(__CLR4_5_2b1eb1elx1dwjzy.R.iget(14371)==0&false))) {{
                    __CLR4_5_2b1eb1elx1dwjzy.R.inc(14372);position.set(Position.KEY_ALARM, Position.ALARM_MOVEMENT);
                }

                }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14373);position.set(Position.KEY_RSSI, BitUtil.between(flags, 16, 20));
                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14374);position.set(Position.KEY_CHARGE, BitUtil.check(flags, 22));

                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14375);position.setAltitude(parser.nextDouble());

                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14376);position.set(Position.KEY_BATTERY, parser.next());
                __CLR4_5_2b1eb1elx1dwjzy.R.inc(14377);position.set(Position.KEY_SATELLITES, parser.next());

            }

            }__CLR4_5_2b1eb1elx1dwjzy.R.inc(14378);return position;

        }

        }}__CLR4_5_2b1eb1elx1dwjzy.R.inc(14379);return null;
    }finally{__CLR4_5_2b1eb1elx1dwjzy.R.flushNeeded();}}

}
