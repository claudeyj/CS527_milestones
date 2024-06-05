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

public class KenjiProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2a4ka4klx1dve6e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,13171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public KenjiProtocolDecoder(KenjiProtocol protocol) {
        super(protocol);__CLR4_5_2a4ka4klx1dve6e.R.inc(13125);try{__CLR4_5_2a4ka4klx1dve6e.R.inc(13124);
    }finally{__CLR4_5_2a4ka4klx1dve6e.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text(">")
            .number("C(d{6}),")                  // device id
            .number("M(x{6}),")                  // alarm
            .number("O(x{4}),")                  // output
            .number("I(x{4}),")                  // input
            .number("D(dd)(dd)(dd),")            // time
            .expression("([AV]),")               // valid
            .number("([NS])(dd)(dd.d+),")        // latitude
            .number("([EW])(ddd)(dd.d+),")       // longitude
            .number("T(d+.d+),")                 // speed
            .number("H(d+.d+),")                 // course
            .number("Y(dd)(dd)(dd),")            // date
            .number("G(d+)")                     // satellites
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2a4ka4klx1dve6e.R.inc(13126);
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13127);if ((((BitUtil.check(value, 2))&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13128)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13129)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13130);return Position.ALARM_SOS;
        }
        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13131);if ((((BitUtil.check(value, 4))&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13132)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13133)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13134);return Position.ALARM_LOW_BATTERY;
        }
        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13135);if ((((BitUtil.check(value, 6))&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13136)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13137)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13138);return Position.ALARM_MOVEMENT;
        }
        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13139);if ((((BitUtil.check(value, 1) || BitUtil.check(value, 10) || BitUtil.check(value, 11))&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13140)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13141)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13142);return Position.ALARM_VIBRATION;
        }

        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13143);return null;
    }finally{__CLR4_5_2a4ka4klx1dve6e.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2a4ka4klx1dve6e.R.inc(13144);

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13145);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13146);if ((((!parser.matches())&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13147)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13148)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13149);return null;
        }

        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13150);Position position = new Position();
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13151);position.setProtocol(getProtocolName());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13152);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13153);if ((((deviceSession == null)&&(__CLR4_5_2a4ka4klx1dve6e.R.iget(13154)!=0|true))||(__CLR4_5_2a4ka4klx1dve6e.R.iget(13155)==0&false))) {{
            __CLR4_5_2a4ka4klx1dve6e.R.inc(13156);return null;
        }
        }__CLR4_5_2a4ka4klx1dve6e.R.inc(13157);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13158);position.set(Position.KEY_ALARM, decodeAlarm(parser.nextInt(16)));
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13159);position.set(Position.KEY_OUTPUT, parser.nextInt(16));
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13160);position.set(Position.KEY_INPUT, parser.nextInt(16));

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13161);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13162);position.setValid(parser.next().equals("A"));

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13163);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13164);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13165);position.setSpeed(parser.nextDouble());
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13166);position.setCourse(parser.nextDouble());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13167);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2a4ka4klx1dve6e.R.inc(13168);position.setTime(dateBuilder.getDate());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13169);position.set(Position.KEY_SATELLITES, parser.nextInt());

        __CLR4_5_2a4ka4klx1dve6e.R.inc(13170);return position;
    }finally{__CLR4_5_2a4ka4klx1dve6e.R.flushNeeded();}}

}
