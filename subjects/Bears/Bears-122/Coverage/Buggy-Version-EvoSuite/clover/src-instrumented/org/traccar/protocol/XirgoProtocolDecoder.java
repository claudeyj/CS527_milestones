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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class XirgoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2iayiaylwydwfa6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,23796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public XirgoProtocolDecoder(XirgoProtocol protocol) {
        super(protocol);__CLR4_5_2iayiaylwydwfa6.R.inc(23723);try{__CLR4_5_2iayiaylwydwfa6.R.inc(23722);
    }finally{__CLR4_5_2iayiaylwydwfa6.R.flushNeeded();}}

    private Boolean newFormat;

    private static final Pattern PATTERN_OLD = new PatternBuilder()
            .text("$$")
            .number("(d+),")                     // imei
            .number("(d+),")                     // event
            .number("(dddd)/(dd)/(dd),")         // date (yyyy/mm/dd)
            .number("(dd):(dd):(dd),")           // time (hh:mm:ss)
            .number("(-?d+.?d*),")               // latitude
            .number("(-?d+.?d*),")               // longitude
            .number("(-?d+.?d*),")               // altitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .number("(d+),")                     // satellites
            .number("(d+.?d*),")                 // hdop
            .number("(d+.d+),")                  // battery
            .number("(d+),")                     // gsm
            .number("(d+.?d*),")                 // odometer
            .number("(d+),")                     // gps
            .any()
            .compile();

    private static final Pattern PATTERN_NEW = new PatternBuilder()
            .text("$$")
            .number("(d+),")                     // imei
            .number("(d+),")                     // event
            .number("(dddd)/(dd)/(dd),")         // date (yyyy/mm/dd)
            .number("(dd):(dd):(dd),")           // time (hh:mm:ss)
            .number("(-?d+.?d*),")               // latitude
            .number("(-?d+.?d*),")               // longitude
            .number("(-?d+.?d*),")               // altitude
            .number("(d+.?d*),")                 // speed
            .number("d+.?d*,")                   // acceleration
            .number("d+.?d*,")                   // deceleration
            .number("d+,")
            .number("(d+.?d*),")                 // course
            .number("(d+),")                     // satellites
            .number("(d+.?d*),")                 // hdop
            .number("(d+.?d*),")                 // odometer
            .number("(d+.?d*),")                 // fuel consumption
            .number("(d+.d+),")                  // battery
            .number("(d+),")                     // gsm
            .number("(d+),")                     // gps
            .groupBegin()
            .number("d,")                        // reset mode
            .expression("([01])")                // input 1
            .expression("([01])")                // input 1
            .expression("([01])")                // input 1
            .expression("([01]),")               // output 1
            .number("(d+.?d*),")                 // adc 1
            .number("(d+.?d*),")                 // fuel level
            .number("d+,")                       // engine load
            .number("(d+),")                     // engine hours
            .number("(d+),")                     // oil pressure
            .number("(d+),")                     // oil level
            .number("(-?d+),")                   // oil temperature
            .number("(d+),")                     // coolant pressure
            .number("(d+),")                     // coolant level
            .number("(-?d+)")                    // coolant temperature
            .groupEnd("?")
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2iayiaylwydwfa6.R.inc(23724);

        __CLR4_5_2iayiaylwydwfa6.R.inc(23725);String sentence = (String) msg;

        __CLR4_5_2iayiaylwydwfa6.R.inc(23726);Parser parser;
        __CLR4_5_2iayiaylwydwfa6.R.inc(23727);if ((((newFormat == null)&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23728)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23729)==0&false))) {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23730);parser = new Parser(PATTERN_NEW, sentence);
            __CLR4_5_2iayiaylwydwfa6.R.inc(23731);if ((((parser.matches())&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23732)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23733)==0&false))) {{
                __CLR4_5_2iayiaylwydwfa6.R.inc(23734);newFormat = true;
            } }else {{
                __CLR4_5_2iayiaylwydwfa6.R.inc(23735);parser = new Parser(PATTERN_OLD, sentence);
                __CLR4_5_2iayiaylwydwfa6.R.inc(23736);if ((((parser.matches())&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23737)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23738)==0&false))) {{
                    __CLR4_5_2iayiaylwydwfa6.R.inc(23739);newFormat = false;
                } }else {{
                    __CLR4_5_2iayiaylwydwfa6.R.inc(23740);return null;
                }
            }}
        }} }else {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23741);if ((((newFormat)&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23742)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23743)==0&false))) {{
                __CLR4_5_2iayiaylwydwfa6.R.inc(23744);parser = new Parser(PATTERN_NEW, sentence);
            } }else {{
                __CLR4_5_2iayiaylwydwfa6.R.inc(23745);parser = new Parser(PATTERN_OLD, sentence);
            }
            }__CLR4_5_2iayiaylwydwfa6.R.inc(23746);if ((((!parser.matches())&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23747)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23748)==0&false))) {{
                __CLR4_5_2iayiaylwydwfa6.R.inc(23749);return null;
            }
        }}

        }__CLR4_5_2iayiaylwydwfa6.R.inc(23750);Position position = new Position();
        __CLR4_5_2iayiaylwydwfa6.R.inc(23751);position.setProtocol(getProtocolName());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23752);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2iayiaylwydwfa6.R.inc(23753);if ((((deviceSession == null)&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23754)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23755)==0&false))) {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23756);return null;
        }
        }__CLR4_5_2iayiaylwydwfa6.R.inc(23757);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23758);position.set(Position.KEY_EVENT, parser.next());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23759);position.setTime(parser.nextDateTime());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23760);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2iayiaylwydwfa6.R.inc(23761);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_2iayiaylwydwfa6.R.inc(23762);position.setAltitude(parser.nextDouble(0));
        __CLR4_5_2iayiaylwydwfa6.R.inc(23763);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble(0)));
        __CLR4_5_2iayiaylwydwfa6.R.inc(23764);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2iayiaylwydwfa6.R.inc(23765);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_2iayiaylwydwfa6.R.inc(23766);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23767);if ((((newFormat)&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23768)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23769)==0&false))) {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23770);position.set(Position.KEY_ODOMETER, UnitsConverter.metersFromMiles(parser.nextDouble(0)));
            __CLR4_5_2iayiaylwydwfa6.R.inc(23771);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
        }

        }__CLR4_5_2iayiaylwydwfa6.R.inc(23772);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
        __CLR4_5_2iayiaylwydwfa6.R.inc(23773);position.set(Position.KEY_RSSI, parser.nextDouble());

        __CLR4_5_2iayiaylwydwfa6.R.inc(23774);if ((((!newFormat)&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23775)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23776)==0&false))) {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23777);position.set(Position.KEY_ODOMETER, UnitsConverter.metersFromMiles(parser.nextDouble(0)));
        }

        }__CLR4_5_2iayiaylwydwfa6.R.inc(23778);position.setValid(parser.nextInt(0) == 1);

        __CLR4_5_2iayiaylwydwfa6.R.inc(23779);if ((((newFormat && parser.hasNext(13))&&(__CLR4_5_2iayiaylwydwfa6.R.iget(23780)!=0|true))||(__CLR4_5_2iayiaylwydwfa6.R.iget(23781)==0&false))) {{
            __CLR4_5_2iayiaylwydwfa6.R.inc(23782);position.set(Position.PREFIX_IN + 1, parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23783);position.set(Position.PREFIX_IN + 2, parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23784);position.set(Position.PREFIX_IN + 3, parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23785);position.set(Position.PREFIX_OUT + 1, parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23786);position.set(Position.PREFIX_ADC + 1, parser.nextDouble());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23787);position.set(Position.KEY_FUEL_LEVEL, parser.nextDouble());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23788);position.set(Position.KEY_HOURS, parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23789);position.set("oilPressure", parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23790);position.set("oilLevel", parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23791);position.set("oilTemp", parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23792);position.set("coolantPressure", parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23793);position.set("coolantLevel", parser.nextInt());
            __CLR4_5_2iayiaylwydwfa6.R.inc(23794);position.set("coolantTemp", parser.nextInt());
        }

        }__CLR4_5_2iayiaylwydwfa6.R.inc(23795);return position;
    }finally{__CLR4_5_2iayiaylwydwfa6.R.flushNeeded();}}

}
