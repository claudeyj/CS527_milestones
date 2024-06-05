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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.TimeZone;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TrakMateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gp9gp9lwye41r4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,21750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    public TrakMateProtocolDecoder(TrakMateProtocol protocol) {
        super(protocol);__CLR4_5_2gp9gp9lwye41r4.R.inc(21646);try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21645);
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21647);timeZone.setRawOffset(Context.getConfig().getInteger(getProtocolName() + ".timezone") * 1000);
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

    private static final Pattern PATTERN_SRT = new PatternBuilder()
            .text("^TMSRT|")
            .expression("([^ ]+)|")              // uid
            .number("(d+.d+)|")                  // latitude
            .number("(d+.d+)|")                  // longitude
            .number("(dd)(dd)(dd)|")             // time (hhmmss)
            .number("(dd)(dd)(dd)|")             // date (ddmmyy)
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
            .number("(dd)(dd)(dd)|")             // time (hhmmss)
            .number("(dd)(dd)(dd)|")             // date (ddmmyy)
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
            .number("(dd)(dd)(dd)|")             // time (hhmmss)
            .number("(dd)(dd)(dd)|")             // date (ddmmyy)
            .number("(d+.d+)|")                  // speed
            .number("(d+.d+)|")                  // heading
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21648);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2gp9gp9lwye41r4.R.inc(21649);switch (value) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21650);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21651);return Position.ALARM_SOS;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21652);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21653);return Position.ALARM_GEOFENCE;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21654);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21655);return Position.ALARM_POWER_CUT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21656);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21657);return null;
        }
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

    private Object decodeSrt(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21658);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21659);Parser parser = new Parser(PATTERN_SRT, sentence);
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21660);if ((((!parser.matches())&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21661)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21662)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21663);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21664);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21665);if ((((deviceSession == null)&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21666)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21667)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21668);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21669);Position position = new Position();
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21670);position.setProtocol(getProtocolName());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21671);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21672);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21673);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21674);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21675);position.set(Position.KEY_VERSION_FW, parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21676);position.set(Position.KEY_VERSION_HW, parser.next());

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21677);return position;
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

    private Object decodeAlt(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21678);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21679);Parser parser = new Parser(PATTERN_ALT, sentence);
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21680);if ((((!parser.matches())&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21681)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21682)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21683);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21684);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21685);if ((((deviceSession == null)&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21686)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21687)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21688);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21689);Position position = new Position();
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21690);position.setProtocol(getProtocolName());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21691);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21692);parser.next(); // seq
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21693);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextInt(0)));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21694);parser.next(); // alert status or data

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21695);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21696);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21697);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21698);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21699);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21700);return position;
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

    private Object decodePer(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21701);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21702);Parser parser = new Parser(PATTERN_PER, (String) msg);
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21703);if ((((!parser.matches())&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21704)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21705)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21706);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21707);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21708);if ((((deviceSession == null)&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21709)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21710)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21711);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21712);Position position = new Position();
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21713);position.setProtocol(getProtocolName());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21714);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21715);parser.next(); // seq

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21716);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21717);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21718);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21719);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21720);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21721);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21722);position.set("dop1", parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21723);position.set("dop2", parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21724);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21725);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21726);position.set(Position.KEY_POWER, parser.nextDouble());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21727);position.set(Position.KEY_ODOMETER, parser.nextDouble(0));
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21728);position.set("pulseOdometer", parser.next());
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21729);position.set(Position.KEY_STATUS, parser.nextInt(0));

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21730);position.setValid(parser.nextInt(0) != 0);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21731);position.set(Position.KEY_ARCHIVE, parser.nextInt(0) == 1);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21732);return position;
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gp9gp9lwye41r4.R.inc(21733);

        __CLR4_5_2gp9gp9lwye41r4.R.inc(21734);String sentence = (String) msg;
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21735);int typeIndex = sentence.indexOf("^TM");
        __CLR4_5_2gp9gp9lwye41r4.R.inc(21736);if ((((typeIndex < 0)&&(__CLR4_5_2gp9gp9lwye41r4.R.iget(21737)!=0|true))||(__CLR4_5_2gp9gp9lwye41r4.R.iget(21738)==0&false))) {{
            __CLR4_5_2gp9gp9lwye41r4.R.inc(21739);return null;
        }

        }__CLR4_5_2gp9gp9lwye41r4.R.inc(21740);String type = sentence.substring(typeIndex + 3, typeIndex + 6);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2gp9gp9lwye41r4.R.inc(21741);switch (type) {
            case "ALT":if (!__CLB4_5_2_bool1) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21742);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21743);return decodeAlt(channel, remoteAddress, sentence);
            case "SRT":if (!__CLB4_5_2_bool1) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21744);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21745);return decodeSrt(channel, remoteAddress, sentence);
            case "PER":if (!__CLB4_5_2_bool1) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21746);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21747);return decodePer(channel, remoteAddress, sentence);
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2gp9gp9lwye41r4.R.inc(21748);__CLB4_5_2_bool1=true;}
                __CLR4_5_2gp9gp9lwye41r4.R.inc(21749);return null;
        }
    }finally{__CLR4_5_2gp9gp9lwye41r4.R.flushNeeded();}}

}
