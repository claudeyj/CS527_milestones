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
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class KenjiProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bv1bv1lwye7g4p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,15420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public KenjiProtocolDecoder(KenjiProtocol protocol) {
        super(protocol);__CLR4_5_2bv1bv1lwye7g4p.R.inc(15374);try{__CLR4_5_2bv1bv1lwye7g4p.R.inc(15373);
    }finally{__CLR4_5_2bv1bv1lwye7g4p.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text(">")
            .number("C(d{6}),")                  // device id
            .number("M(x{6}),")                  // alarm
            .number("O(x{4}),")                  // output
            .number("I(x{4}),")                  // input
            .number("D(dd)(dd)(dd),")            // time (hhmmss)
            .expression("([AV]),")               // valid
            .number("([NS])(dd)(dd.d+),")        // latitude
            .number("([EW])(ddd)(dd.d+),")       // longitude
            .number("T(d+.d+),")                 // speed
            .number("H(d+.d+),")                 // course
            .number("Y(dd)(dd)(dd),")            // date (ddmmyy)
            .number("G(d+)")                     // satellites
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2bv1bv1lwye7g4p.R.inc(15375);
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15376);if ((((BitUtil.check(value, 2))&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15377)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15378)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15379);return Position.ALARM_SOS;
        }
        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15380);if ((((BitUtil.check(value, 4))&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15381)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15382)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15383);return Position.ALARM_LOW_BATTERY;
        }
        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15384);if ((((BitUtil.check(value, 6))&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15385)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15386)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15387);return Position.ALARM_MOVEMENT;
        }
        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15388);if ((((BitUtil.check(value, 1) || BitUtil.check(value, 10) || BitUtil.check(value, 11))&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15389)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15390)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15391);return Position.ALARM_VIBRATION;
        }

        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15392);return null;
    }finally{__CLR4_5_2bv1bv1lwye7g4p.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bv1bv1lwye7g4p.R.inc(15393);

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15394);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15395);if ((((!parser.matches())&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15396)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15397)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15398);return null;
        }

        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15399);Position position = new Position();
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15400);position.setProtocol(getProtocolName());

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15401);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15402);if ((((deviceSession == null)&&(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15403)!=0|true))||(__CLR4_5_2bv1bv1lwye7g4p.R.iget(15404)==0&false))) {{
            __CLR4_5_2bv1bv1lwye7g4p.R.inc(15405);return null;
        }
        }__CLR4_5_2bv1bv1lwye7g4p.R.inc(15406);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15407);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextHexInt(0)));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15408);position.set(Position.KEY_OUTPUT, parser.nextHexInt(0));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15409);position.set(Position.KEY_INPUT, parser.nextHexInt(0));

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15410);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15411);position.setValid(parser.next().equals("A"));

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15412);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15413);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15414);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15415);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15416);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15417);position.setTime(dateBuilder.getDate());

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15418);position.set(Position.KEY_SATELLITES, parser.nextInt(0));

        __CLR4_5_2bv1bv1lwye7g4p.R.inc(15419);return position;
    }finally{__CLR4_5_2bv1bv1lwye7g4p.R.flushNeeded();}}

}
