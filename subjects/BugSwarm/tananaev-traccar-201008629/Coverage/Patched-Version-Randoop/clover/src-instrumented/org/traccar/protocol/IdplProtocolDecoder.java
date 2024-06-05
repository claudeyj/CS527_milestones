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

import java.net.SocketAddress;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.Protocol;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.Parser.CoordinateFormat;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

public class IdplProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29tx9txlx1e0hiq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,12784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IdplProtocolDecoder(Protocol protocol) {
        super(protocol);__CLR4_5_29tx9txlx1e0hiq.R.inc(12742);try{__CLR4_5_29tx9txlx1e0hiq.R.inc(12741);
    }finally{__CLR4_5_29tx9txlx1e0hiq.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*ID")                         // start of frame
            .number("(d+),")                     // command code
            .number("(d+),")                     // imei
            .number("(dd)(dd)(dd),")             // current date
            .number("(dd)(dd)(dd),")             // current time
            .expression("([A|V]),")              // gps fix
            .number("(dd)(dd).?(d+),([NS]),")    // latitude
            .number("(ddd)(dd).?(d+),([EW]),")   // longitude
            .number("(d{1,3}.dd),")              // speed
            .number("(d{1,3}.dd),")              // course
            .number("(d{1,2}),")                 // sats
            .number("(d{1,3}),")                 // gsm signal strength
            .expression("([A|N|S]),")            // vehicle status
            .expression("([0|1]),")              // main power status
            .number("(d.dd),")                   // internal battery voltage
            .expression("([0|1]),")              // sos alert
            .expression("([0|1]),")              // body tamper
            .expression("([0|1])([0|1]),")       // ac status + ign status
            .expression("([0|1|2]),")            // output1 status
            .number("(d{1,3}),")                 // adc1
            .number("(d{1,3}),")                 // adc2
            .expression("([0-9A-Z]{3}),")        // software version
            .expression("([L|R]),")              // message type
            .number("(x{4})#")                   // crc
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29tx9txlx1e0hiq.R.inc(12743);

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12744);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12745);if ((((!parser.matches())&&(__CLR4_5_29tx9txlx1e0hiq.R.iget(12746)!=0|true))||(__CLR4_5_29tx9txlx1e0hiq.R.iget(12747)==0&false))) {{
            __CLR4_5_29tx9txlx1e0hiq.R.inc(12748);return null;
        }

        }__CLR4_5_29tx9txlx1e0hiq.R.inc(12749);Position position = new Position();
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12750);position.setProtocol(getProtocolName());

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12751);position.set(Position.KEY_TYPE, parser.nextInt());

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12752);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12753);if ((((deviceSession == null)&&(__CLR4_5_29tx9txlx1e0hiq.R.iget(12754)!=0|true))||(__CLR4_5_29tx9txlx1e0hiq.R.iget(12755)==0&false))) {{
            __CLR4_5_29tx9txlx1e0hiq.R.inc(12756);return null;
        }
        }__CLR4_5_29tx9txlx1e0hiq.R.inc(12757);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12758);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12759);position.setTime(dateBuilder.getDate());

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12760);position.setValid(parser.next().equals("A"));
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12761);position.setLatitude(parser.nextCoordinate(CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12762);position.setLongitude(parser.nextCoordinate(CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12763);position.setSpeed(parser.nextDouble());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12764);position.setCourse(parser.nextDouble());

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12765);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12766);position.set(Position.KEY_RSSI, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12767);parser.next(); // vehicle status
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12768);position.set(Position.KEY_POWER, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12769);position.set(Position.KEY_BATTERY, parser.nextDouble());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12770);if ((((parser.nextInt() == 1)&&(__CLR4_5_29tx9txlx1e0hiq.R.iget(12771)!=0|true))||(__CLR4_5_29tx9txlx1e0hiq.R.iget(12772)==0&false))) {{
            __CLR4_5_29tx9txlx1e0hiq.R.inc(12773);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
        }
        }__CLR4_5_29tx9txlx1e0hiq.R.inc(12774);parser.nextInt(); // body tamper
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12775);parser.nextInt(); // ac status
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12776);position.set(Position.KEY_IGNITION, parser.nextInt() == 1);
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12777);position.set(Position.KEY_OUTPUT, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12778);position.set(Position.PREFIX_ADC + 1, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12779);position.set(Position.PREFIX_ADC + 2, parser.nextInt());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12780);position.set(Position.KEY_VERSION, parser.next());
        __CLR4_5_29tx9txlx1e0hiq.R.inc(12781);position.set(Position.KEY_ARCHIVE, parser.next().equals("R"));

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12782);parser.next(); // checksum

        __CLR4_5_29tx9txlx1e0hiq.R.inc(12783);return position;
    }finally{__CLR4_5_29tx9txlx1e0hiq.R.flushNeeded();}}

}
