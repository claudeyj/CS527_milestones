/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton@traccar.org)
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

public class IntellitracProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29vt9vtlx1dve41{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,12851,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IntellitracProtocolDecoder(IntellitracProtocol protocol) {
        super(protocol);__CLR4_5_29vt9vtlx1dve41.R.inc(12810);try{__CLR4_5_29vt9vtlx1dve41.R.inc(12809);
    }finally{__CLR4_5_29vt9vtlx1dve41.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression(".+,").optional()
            .number("(d+),")                     // identifier
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("(-?d+.d+),")                // longitude
            .number("(-?d+.d+),")                // latitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .number("(-?d+.?d*),")               // altitude
            .number("(d+),")                     // satellites
            .number("(d+),")                     // index
            .number("(d+),")                     // input
            .number("(d+),?")                    // output
            .number("(d+.d+)?,?")                // adc1
            .number("(d+.d+)?,?")                // adc2
            .groupBegin()
            .number("d{14},d+,")
            .number("(d+),")                     // vss
            .number("(d+),")                     // rpm
            .number("(-?d+),")                   // coolant
            .number("(d+),")                     // fuel
            .number("(d+),")                     // fuel consumption
            .number("(-?d+),")                   // fuel temperature
            .number("(d+),")                     // charger pressure
            .number("(d+),")                     // tpl
            .number("(d+),")                     // axle weight
            .number("(d+)")                      // odometer
            .groupEnd("?")
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29vt9vtlx1dve41.R.inc(12811);

        __CLR4_5_29vt9vtlx1dve41.R.inc(12812);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_29vt9vtlx1dve41.R.inc(12813);if ((((!parser.matches())&&(__CLR4_5_29vt9vtlx1dve41.R.iget(12814)!=0|true))||(__CLR4_5_29vt9vtlx1dve41.R.iget(12815)==0&false))) {{
            __CLR4_5_29vt9vtlx1dve41.R.inc(12816);return null;
        }

        }__CLR4_5_29vt9vtlx1dve41.R.inc(12817);Position position = new Position();
        __CLR4_5_29vt9vtlx1dve41.R.inc(12818);position.setProtocol(getProtocolName());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12819);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12820);if ((((deviceSession == null)&&(__CLR4_5_29vt9vtlx1dve41.R.iget(12821)!=0|true))||(__CLR4_5_29vt9vtlx1dve41.R.iget(12822)==0&false))) {{
            __CLR4_5_29vt9vtlx1dve41.R.inc(12823);return null;
        }
        }__CLR4_5_29vt9vtlx1dve41.R.inc(12824);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12825);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12826);position.setTime(dateBuilder.getDate());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12827);position.setLongitude(parser.nextDouble());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12828);position.setLatitude(parser.nextDouble());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12829);position.setSpeed(parser.nextDouble());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12830);position.setCourse(parser.nextDouble());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12831);position.setAltitude(parser.nextDouble());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12832);int satellites = parser.nextInt();
        __CLR4_5_29vt9vtlx1dve41.R.inc(12833);position.setValid(satellites >= 3);
        __CLR4_5_29vt9vtlx1dve41.R.inc(12834);position.set(Position.KEY_SATELLITES, satellites);

        __CLR4_5_29vt9vtlx1dve41.R.inc(12835);position.set(Position.KEY_INDEX, parser.nextLong());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12836);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12837);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12838);position.set(Position.PREFIX_ADC + 1, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12839);position.set(Position.PREFIX_ADC + 2, parser.next());

        // J1939 data
        __CLR4_5_29vt9vtlx1dve41.R.inc(12840);position.set(Position.KEY_OBD_SPEED, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12841);position.set(Position.KEY_RPM, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12842);position.set("coolant", parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12843);position.set(Position.KEY_FUEL, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12844);position.set(Position.KEY_FUEL_CONSUMPTION, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12845);position.set(Position.PREFIX_TEMP + 1, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12846);position.set(Position.KEY_CHARGE, parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12847);position.set("tpl", parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12848);position.set("axle", parser.next());
        __CLR4_5_29vt9vtlx1dve41.R.inc(12849);position.set(Position.KEY_OBD_ODOMETER, parser.next());

        __CLR4_5_29vt9vtlx1dve41.R.inc(12850);return position;
    }finally{__CLR4_5_29vt9vtlx1dve41.R.flushNeeded();}}

}
