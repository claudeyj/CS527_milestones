/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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

public class XirgoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fs3fs3lx1e0ize{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,20510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public XirgoProtocolDecoder(XirgoProtocol protocol) {
        super(protocol);__CLR4_5_2fs3fs3lx1e0ize.R.inc(20452);try{__CLR4_5_2fs3fs3lx1e0ize.R.inc(20451);
    }finally{__CLR4_5_2fs3fs3lx1e0ize.R.flushNeeded();}}

    private Boolean newFormat;

    private static final Pattern PATTERN_OLD = new PatternBuilder()
            .text("$$")
            .number("(d+),")                     // imei
            .number("(d+),")                     // event
            .number("(dddd)/(dd)/(dd),")         // date
            .number("(dd):(dd):(dd),")           // time
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
            .number("(dddd)/(dd)/(dd),")         // date
            .number("(dd):(dd):(dd),")           // time
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
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fs3fs3lx1e0ize.R.inc(20453);

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20454);String sentence = (String) msg;

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20455);Parser parser;
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20456);if ((((newFormat == null)&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20457)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20458)==0&false))) {{
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20459);parser = new Parser(PATTERN_NEW, sentence);
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20460);if ((((parser.matches())&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20461)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20462)==0&false))) {{
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20463);newFormat = true;
            } }else {{
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20464);parser = new Parser(PATTERN_OLD, sentence);
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20465);if ((((parser.matches())&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20466)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20467)==0&false))) {{
                    __CLR4_5_2fs3fs3lx1e0ize.R.inc(20468);newFormat = false;
                } }else {{
                    __CLR4_5_2fs3fs3lx1e0ize.R.inc(20469);return null;
                }
            }}
        }} }else {{
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20470);if ((((newFormat)&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20471)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20472)==0&false))) {{
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20473);parser = new Parser(PATTERN_NEW, sentence);
            } }else {{
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20474);parser = new Parser(PATTERN_OLD, sentence);
            }
            }__CLR4_5_2fs3fs3lx1e0ize.R.inc(20475);if ((((!parser.matches())&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20476)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20477)==0&false))) {{
                __CLR4_5_2fs3fs3lx1e0ize.R.inc(20478);return null;
            }
        }}

        }__CLR4_5_2fs3fs3lx1e0ize.R.inc(20479);Position position = new Position();
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20480);position.setProtocol(getProtocolName());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20481);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20482);if ((((deviceSession == null)&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20483)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20484)==0&false))) {{
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20485);return null;
        }
        }__CLR4_5_2fs3fs3lx1e0ize.R.inc(20486);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20487);position.set(Position.KEY_EVENT, parser.next());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20488);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20489);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20490);position.setLatitude(parser.nextDouble());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20491);position.setLongitude(parser.nextDouble());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20492);position.setAltitude(parser.nextDouble());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20493);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble()));
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20494);position.setCourse(parser.nextDouble());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20495);position.set(Position.KEY_SATELLITES, parser.next());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20496);position.set(Position.KEY_HDOP, parser.next());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20497);if ((((newFormat)&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20498)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20499)==0&false))) {{
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20500);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1609.34);
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20501);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
        }

        }__CLR4_5_2fs3fs3lx1e0ize.R.inc(20502);position.set(Position.KEY_BATTERY, parser.next());
        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20503);position.set(Position.KEY_RSSI, parser.next());

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20504);if ((((!newFormat)&&(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20505)!=0|true))||(__CLR4_5_2fs3fs3lx1e0ize.R.iget(20506)==0&false))) {{
            __CLR4_5_2fs3fs3lx1e0ize.R.inc(20507);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1609.34);
        }

        }__CLR4_5_2fs3fs3lx1e0ize.R.inc(20508);position.setValid(parser.nextInt() == 1);

        __CLR4_5_2fs3fs3lx1e0ize.R.inc(20509);return position;
    }finally{__CLR4_5_2fs3fs3lx1e0ize.R.flushNeeded();}}

}
