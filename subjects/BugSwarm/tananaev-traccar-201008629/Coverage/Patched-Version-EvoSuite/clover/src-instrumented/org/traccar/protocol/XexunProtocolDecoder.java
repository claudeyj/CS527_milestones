/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class XexunProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fprfprlx1dzckk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,20426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean full;

    public XexunProtocolDecoder(XexunProtocol protocol, boolean full) {
        super(protocol);__CLR4_5_2fprfprlx1dzckk.R.inc(20368);try{__CLR4_5_2fprfprlx1dzckk.R.inc(20367);
        __CLR4_5_2fprfprlx1dzckk.R.inc(20369);this.full = full;
    }finally{__CLR4_5_2fprfprlx1dzckk.R.flushNeeded();}}

    private static final Pattern PATTERN_BASIC = new PatternBuilder()
            .expression("G[PN]RMC,")
            .number("(?:(dd)(dd)(dd))?.(d+),")   // time
            .expression("([AV]),")               // validity
            .number("(d*?)(d?d.d+),([NS]),")     // latitude
            .number("(d*?)(d?d.d+),([EW])?,")    // longitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*)?,")                // course
            .number("(?:(dd)(dd)(dd))?,")        // date
            .expression("[^*]*").text("*")
            .number("xx")                        // checksum
            .expression("\\r\\n").optional()
            .expression(",([FL]),")              // signal
            .expression("([^,]*),").optional()   // alarm
            .any()
            .number("imei:(d+),")                // imei
            .compile();

    private static final Pattern PATTERN_FULL = new PatternBuilder()
            .any()
            .number("(d+),")                     // serial
            .expression("([^,]+)?,")             // phone number
            .expression(PATTERN_BASIC.pattern())
            .number("(d+),")                     // satellites
            .number("(-?d+.d+)?,")               // altitude
            .number("[FL]:(d+.d+)V")             // power
            .any()
            .compile();

    private String decodeAlarm(String value) {try{__CLR4_5_2fprfprlx1dzckk.R.inc(20370);
        __CLR4_5_2fprfprlx1dzckk.R.inc(20371);if ((((value != null)&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20372)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20373)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2fprfprlx1dzckk.R.inc(20374);switch (value) {
                case "help me!":if (!__CLB4_5_2_bool0) {__CLR4_5_2fprfprlx1dzckk.R.inc(20375);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fprfprlx1dzckk.R.inc(20376);return Position.ALARM_SOS;
                case "low battery":if (!__CLB4_5_2_bool0) {__CLR4_5_2fprfprlx1dzckk.R.inc(20377);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fprfprlx1dzckk.R.inc(20378);return Position.ALARM_LOW_BATTERY;
                case "move!":if (!__CLB4_5_2_bool0) {__CLR4_5_2fprfprlx1dzckk.R.inc(20379);__CLB4_5_2_bool0=true;}
                case "moved!":if (!__CLB4_5_2_bool0) {__CLR4_5_2fprfprlx1dzckk.R.inc(20380);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fprfprlx1dzckk.R.inc(20381);return Position.ALARM_MOVEMENT;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fprfprlx1dzckk.R.inc(20382);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fprfprlx1dzckk.R.inc(20383);break;
            }
        }
        }__CLR4_5_2fprfprlx1dzckk.R.inc(20384);return null;
    }finally{__CLR4_5_2fprfprlx1dzckk.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fprfprlx1dzckk.R.inc(20385);

        __CLR4_5_2fprfprlx1dzckk.R.inc(20386);Pattern pattern = PATTERN_BASIC;
        __CLR4_5_2fprfprlx1dzckk.R.inc(20387);if ((((full)&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20388)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20389)==0&false))) {{
            __CLR4_5_2fprfprlx1dzckk.R.inc(20390);pattern = PATTERN_FULL;
        }

        }__CLR4_5_2fprfprlx1dzckk.R.inc(20391);Parser parser = new Parser(pattern, (String) msg);
        __CLR4_5_2fprfprlx1dzckk.R.inc(20392);if ((((!parser.matches())&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20393)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20394)==0&false))) {{
            __CLR4_5_2fprfprlx1dzckk.R.inc(20395);return null;
        }

        }__CLR4_5_2fprfprlx1dzckk.R.inc(20396);Position position = new Position();
        __CLR4_5_2fprfprlx1dzckk.R.inc(20397);position.setProtocol(getProtocolName());

        __CLR4_5_2fprfprlx1dzckk.R.inc(20398);if ((((full)&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20399)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20400)==0&false))) {{
            __CLR4_5_2fprfprlx1dzckk.R.inc(20401);position.set("serial", parser.next());
            __CLR4_5_2fprfprlx1dzckk.R.inc(20402);position.set("number", parser.next());
        }

        }__CLR4_5_2fprfprlx1dzckk.R.inc(20403);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_2fprfprlx1dzckk.R.inc(20404);position.setValid(parser.next().equals("A"));
        __CLR4_5_2fprfprlx1dzckk.R.inc(20405);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20406);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20407);position.setSpeed(parser.nextDouble());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20408);position.setCourse(parser.nextDouble());

        __CLR4_5_2fprfprlx1dzckk.R.inc(20409);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20410);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fprfprlx1dzckk.R.inc(20411);position.set("signal", parser.next());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20412);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

        __CLR4_5_2fprfprlx1dzckk.R.inc(20413);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2fprfprlx1dzckk.R.inc(20414);if ((((deviceSession == null)&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20415)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20416)==0&false))) {{
            __CLR4_5_2fprfprlx1dzckk.R.inc(20417);return null;
        }
        }__CLR4_5_2fprfprlx1dzckk.R.inc(20418);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fprfprlx1dzckk.R.inc(20419);if ((((full)&&(__CLR4_5_2fprfprlx1dzckk.R.iget(20420)!=0|true))||(__CLR4_5_2fprfprlx1dzckk.R.iget(20421)==0&false))) {{
            __CLR4_5_2fprfprlx1dzckk.R.inc(20422);position.set(Position.KEY_SATELLITES, parser.next().replaceFirst("^0*(?![\\.$])", ""));

            __CLR4_5_2fprfprlx1dzckk.R.inc(20423);position.setAltitude(parser.nextDouble());

            __CLR4_5_2fprfprlx1dzckk.R.inc(20424);position.set(Position.KEY_POWER, parser.nextDouble());
        }

        }__CLR4_5_2fprfprlx1dzckk.R.inc(20425);return position;
    }finally{__CLR4_5_2fprfprlx1dzckk.R.flushNeeded();}}

}
