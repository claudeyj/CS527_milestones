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
import org.traccar.helper.BitUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TmgProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gcrgcrlwye41ov{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,21263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TmgProtocolDecoder(TmgProtocol protocol) {
        super(protocol);__CLR4_5_2gcrgcrlwye41ov.R.inc(21196);try{__CLR4_5_2gcrgcrlwye41ov.R.inc(21195);
    }finally{__CLR4_5_2gcrgcrlwye41ov.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$")
            .expression("(...),")                // type
            .expression("[LH],")                 // history
            .number("(d+),")                     // imei
            .number("(dd)(dd)(dddd),")           // date (ddmmyyyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d),")                      // status
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),")
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .number("(-?d+.?d*),")               // altitude
            .number("(d+.d+),")                  // hdop
            .number("(d+),")                     // satellites
            .number("(d+),")                     // visible satellites
            .number("([^,]*),")                  // operator
            .number("(d+),")                     // rssi
            .number("[^,]*,")                    // cid
            .expression("([01]),")               // ignition
            .number("(d+.?d*),")                 // battery
            .number("(d+.?d*),")                 // power
            .expression("([01]+),")              // input
            .expression("([01]+),")              // output
            .expression("[01]+,")                // temper status
            .number("(d+.?d*)[^,]*,")            // adc1
            .number("(d+.?d*)[^,]*,")            // adc2
            .number("d+.?d*,")                   // trip meter
            .expression("([^,]*),")              // software version
            .expression("([^,]*),").optional()   // rfid
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gcrgcrlwye41ov.R.inc(21197);

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21198);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21199);if ((((!parser.matches())&&(__CLR4_5_2gcrgcrlwye41ov.R.iget(21200)!=0|true))||(__CLR4_5_2gcrgcrlwye41ov.R.iget(21201)==0&false))) {{
            __CLR4_5_2gcrgcrlwye41ov.R.inc(21202);return null;
        }

        }__CLR4_5_2gcrgcrlwye41ov.R.inc(21203);String type = parser.next();

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21204);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21205);if ((((deviceSession == null)&&(__CLR4_5_2gcrgcrlwye41ov.R.iget(21206)!=0|true))||(__CLR4_5_2gcrgcrlwye41ov.R.iget(21207)==0&false))) {{
            __CLR4_5_2gcrgcrlwye41ov.R.inc(21208);return null;
        }

        }__CLR4_5_2gcrgcrlwye41ov.R.inc(21209);Position position = new Position();
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21210);position.setProtocol(getProtocolName());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21211);position.setDeviceId(deviceSession.getDeviceId());

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2gcrgcrlwye41ov.R.inc(21212);switch (type) {
            case "rmv":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21213);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21214);position.set(Position.KEY_ALARM, Position.ALARM_POWER_CUT);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21215);break;
            case "ebl":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21216);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21217);position.set(Position.KEY_ALARM, Position.ALARM_LOW_POWER);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21218);break;
            case "ibl":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21219);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21220);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21221);break;
            case "tmp":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21222);__CLB4_5_2_bool0=true;}
            case "smt":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21223);__CLB4_5_2_bool0=true;}
            case "btt":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21224);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21225);position.set(Position.KEY_ALARM, Position.ALARM_TAMPERING);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21226);break;
            case "ion":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21227);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21228);position.set(Position.KEY_IGNITION, true);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21229);break;
            case "iof":if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21230);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21231);position.set(Position.KEY_IGNITION, false);
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21232);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2gcrgcrlwye41ov.R.inc(21233);__CLB4_5_2_bool0=true;}
                __CLR4_5_2gcrgcrlwye41ov.R.inc(21234);break;
        }

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21235);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21236);position.setValid(parser.nextInt(0) > 0);
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21237);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21238);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21239);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21240);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21241);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21242);position.set(Position.KEY_HDOP, parser.nextDouble(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21243);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21244);position.set(Position.KEY_SATELLITES_VISIBLE, parser.nextInt(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21245);position.set(Position.KEY_OPERATOR, parser.next());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21246);position.set(Position.KEY_RSSI, parser.nextInt(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21247);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21248);position.set(Position.KEY_BATTERY, parser.nextDouble(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21249);position.set(Position.KEY_POWER, parser.nextDouble(0));

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21250);int input = parser.nextBinInt(0);
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21251);int output = parser.nextBinInt(0);

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21252);if ((((!BitUtil.check(input, 0))&&(__CLR4_5_2gcrgcrlwye41ov.R.iget(21253)!=0|true))||(__CLR4_5_2gcrgcrlwye41ov.R.iget(21254)==0&false))) {{
            __CLR4_5_2gcrgcrlwye41ov.R.inc(21255);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }

        }__CLR4_5_2gcrgcrlwye41ov.R.inc(21256);position.set(Position.KEY_INPUT, input);
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21257);position.set(Position.KEY_OUTPUT, output);

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21258);position.set(Position.PREFIX_ADC + 1, parser.nextDouble(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21259);position.set(Position.PREFIX_ADC + 2, parser.nextDouble(0));
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21260);position.set(Position.KEY_VERSION_FW, parser.next());
        __CLR4_5_2gcrgcrlwye41ov.R.inc(21261);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());

        __CLR4_5_2gcrgcrlwye41ov.R.inc(21262);return position;
    }finally{__CLR4_5_2gcrgcrlwye41ov.R.flushNeeded();}}

}
