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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.TimeZone;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TrakMateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2efdefdlx1dxpzr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,18805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    public TrakMateProtocolDecoder(TrakMateProtocol protocol) {
        super(protocol);__CLR4_5_2efdefdlx1dxpzr.R.inc(18698);try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18697);
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18699);timeZone.setRawOffset(Context.getConfig().getInteger(getProtocolName() + ".timezone") * 1000);
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

    private static final Pattern PATTERN_SRT = new PatternBuilder()
            .text("^TMSRT|")
            .expression("([^ ]+)|")              // uid
            .number("(d+.d+)|")                  // latitude
            .number("(d+.d+)|")                  // longitude
            .number("(dd)(dd)(dd)|")             // time
            .number("(dd)(dd)(dd)|")             // date
            .number("(d+.d+)|")                  // software ver
            .number("(d+.d+)|")                  // Hardware ver
            .any()
            .compile();

    private static final Pattern PATTERN_PER = new PatternBuilder()
            .text("^TMPER|")
            .expression("([^ ]+)|")              // uid
            .number("(d+)|")                     // seq
            .number("(d+.d+)|")                  // latitude
            .number("(d+.d+)|")                  // longitude
            .number("(dd)(dd)(dd)|")             // time
            .number("(dd)(dd)(dd)|")             // date
            .number("(d+.d+)|")                  // speed
            .number("(d+.d+)|")                  // heading
            .number("(d+)|")                     // ignition
            .number("(d+)|")                     // dop1
            .number("(d+)|")                     // dop2
            .number("(d+.d+)|")                  // analog
            .number("(d+.d+)|")                  // internal battery
            .number("(d+.d+)|")                  // vehicle battery
            .number("(d+.d+)|")                  // gps odometer
            .number("(d+.d+)|")                  // pulse odometer
            .number("(d+)|")                     // main power status
            .number("(d+)|")                     // gps data validity
            .number("(d+)|")                     // live or cache
            .any()
            .compile();

    private static final Pattern PATTERN_ALT = new PatternBuilder()
            .text("^TMALT|")
            .expression("([^ ]+)|")              // uid
            .number("(d+)|")                     // seq
            .number("(d+)|")                     // Alert type
            .number("(d+)|")                     // Alert status
            .number("(d+.d+)|")                  // latitude
            .number("(d+.d+)|")                  // longitude
            .number("(dd)(dd)(dd)|")             // time
            .number("(dd)(dd)(dd)|")             // date
            .number("(d+.d+)|")                  // speed
            .number("(d+.d+)|")                  // heading
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18700);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2efdefdlx1dxpzr.R.inc(18701);switch (value) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18702);__CLB4_5_2_bool0=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18703);return Position.ALARM_SOS;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18704);__CLB4_5_2_bool0=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18705);return Position.ALARM_GEOFENCE;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18706);__CLB4_5_2_bool0=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18707);return Position.ALARM_POWER_CUT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18708);__CLB4_5_2_bool0=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18709);return null;
        }
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

    private Object decodeSrt(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18710);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18711);Parser parser = new Parser(PATTERN_SRT, sentence);
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18712);if ((((!parser.matches())&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18713)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18714)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18715);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18716);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18717);if ((((deviceSession == null)&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18718)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18719)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18720);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18721);Position position = new Position();
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18722);position.setProtocol(getProtocolName());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18723);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18724);position.setLatitude(parser.nextDouble());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18725);position.setLongitude(parser.nextDouble());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18726);DateBuilder dateBuilder = new DateBuilder(timeZone)
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18727);position.setTime(dateBuilder.getDate());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18728);position.set(Position.KEY_VERSION, parser.next());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18729);parser.next(); // hardware version

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18730);return position;
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

    private Object decodeAlt(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18731);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18732);Parser parser = new Parser(PATTERN_ALT, sentence);
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18733);if ((((!parser.matches())&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18734)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18735)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18736);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18737);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18738);if ((((deviceSession == null)&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18739)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18740)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18741);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18742);Position position = new Position();
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18743);position.setProtocol(getProtocolName());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18744);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18745);parser.next(); // seq
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18746);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextInt()));
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18747);parser.next(); // alert status or data

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18748);position.setLatitude(parser.nextDouble());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18749);position.setLongitude(parser.nextDouble());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18750);DateBuilder dateBuilder = new DateBuilder(timeZone)
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18751);position.setTime(dateBuilder.getDate());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18752);position.setSpeed(parser.nextDouble());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18753);position.setCourse(parser.nextDouble());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18754);return position;
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

    private Object decodePer(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18755);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18756);Parser parser = new Parser(PATTERN_PER, (String) msg);
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18757);if ((((!parser.matches())&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18758)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18759)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18760);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18761);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18762);if ((((deviceSession == null)&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18763)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18764)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18765);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18766);Position position = new Position();
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18767);position.setProtocol(getProtocolName());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18768);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18769);parser.next(); // seq

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18770);position.setLatitude(parser.nextDouble());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18771);position.setLongitude(parser.nextDouble());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18772);DateBuilder dateBuilder = new DateBuilder(timeZone)
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18773);position.setTime(dateBuilder.getDate());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18774);position.setSpeed(parser.nextDouble());
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18775);position.setCourse(parser.nextDouble());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18776);position.set(Position.KEY_IGNITION, parser.nextInt() == 1);
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18777);parser.next(); // dop1
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18778);parser.next(); // dop2
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18779);parser.next(); // analog input
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18780);position.set(Position.KEY_BATTERY, parser.nextDouble()); // device battery voltage
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18781);parser.next(); // vehicle internal voltage
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18782);position.set(Position.KEY_ODOMETER, parser.nextDouble()); // gps odometer
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18783);parser.next(); // pulse odometer
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18784);position.set(Position.KEY_STATUS, parser.nextInt());

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18785);position.setValid(parser.nextInt() != 0);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18786);position.set(Position.KEY_ARCHIVE, parser.nextInt() == 1);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18787);return position;
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2efdefdlx1dxpzr.R.inc(18788);

        __CLR4_5_2efdefdlx1dxpzr.R.inc(18789);String sentence = (String) msg;
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18790);int typeIndex = sentence.indexOf("^TM");
        __CLR4_5_2efdefdlx1dxpzr.R.inc(18791);if ((((typeIndex < 0)&&(__CLR4_5_2efdefdlx1dxpzr.R.iget(18792)!=0|true))||(__CLR4_5_2efdefdlx1dxpzr.R.iget(18793)==0&false))) {{
            __CLR4_5_2efdefdlx1dxpzr.R.inc(18794);return null;
        }

        }__CLR4_5_2efdefdlx1dxpzr.R.inc(18795);String type = sentence.substring(typeIndex + 3, typeIndex + 6);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2efdefdlx1dxpzr.R.inc(18796);switch (type) {
            case "ALT":if (!__CLB4_5_2_bool1) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18797);__CLB4_5_2_bool1=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18798);return decodeAlt(channel, remoteAddress, sentence);
            case "SRT":if (!__CLB4_5_2_bool1) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18799);__CLB4_5_2_bool1=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18800);return decodeSrt(channel, remoteAddress, sentence);
            case "PER":if (!__CLB4_5_2_bool1) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18801);__CLB4_5_2_bool1=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18802);return decodePer(channel, remoteAddress, sentence);
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2efdefdlx1dxpzr.R.inc(18803);__CLB4_5_2_bool1=true;}
                __CLR4_5_2efdefdlx1dxpzr.R.inc(18804);return null;
        }
    }finally{__CLR4_5_2efdefdlx1dxpzr.R.flushNeeded();}}

}
