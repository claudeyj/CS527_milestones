/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class Stl060ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f49f49lwye41ex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,19635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Stl060ProtocolDecoder(Stl060Protocol protocol) {
        super(protocol);__CLR4_5_2f49f49lwye41ex.R.inc(19594);try{__CLR4_5_2f49f49lwye41ex.R.inc(19593);
    }finally{__CLR4_5_2f49f49lwye41ex.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .any()
            .text("$1,")
            .number("(d+),")                     // imei
            .text("D001,")                       // type
            .expression("[^,]*,")                // vehicle
            .number("(dd)/(dd)/(dd),")           // date (dd/mm/yy)
            .number("(dd):(dd):(dd),")           // time (hh:mm:ss)
            .number("(dd)(dd).?(d+)([NS]),")     // latitude
            .number("(ddd)(dd).?(d+)([EW]),")    // longitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .groupBegin()
            .number("(d+),")                     // odometer
            .number("(d+),")                     // Ignition
            .number("(d+),")                     // di1
            .number("(d+),")                     // di2
            .number("(d+),")                     // fuel
            .or()
            .expression("([01]),")               // charging
            .expression("([01]),")               // ignition
            .expression("0,0,")                  // reserved
            .number("(d+),")                     // di
            .expression("([^,]+),")              // rfid
            .number("(d+),")                     // odometer
            .number("(d+),")                     // temperature
            .number("(d+),")                     // fuel
            .expression("([01]),")               // accelerometer
            .expression("([01]),")               // do1
            .expression("([01]),")               // do2
            .groupEnd()
            .expression("([AV])")                // validity
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f49f49lwye41ex.R.inc(19595);

        __CLR4_5_2f49f49lwye41ex.R.inc(19596);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2f49f49lwye41ex.R.inc(19597);if ((((!parser.matches())&&(__CLR4_5_2f49f49lwye41ex.R.iget(19598)!=0|true))||(__CLR4_5_2f49f49lwye41ex.R.iget(19599)==0&false))) {{
            __CLR4_5_2f49f49lwye41ex.R.inc(19600);return null;
        }

        }__CLR4_5_2f49f49lwye41ex.R.inc(19601);Position position = new Position();
        __CLR4_5_2f49f49lwye41ex.R.inc(19602);position.setProtocol(getProtocolName());

        __CLR4_5_2f49f49lwye41ex.R.inc(19603);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2f49f49lwye41ex.R.inc(19604);if ((((deviceSession == null)&&(__CLR4_5_2f49f49lwye41ex.R.iget(19605)!=0|true))||(__CLR4_5_2f49f49lwye41ex.R.iget(19606)==0&false))) {{
            __CLR4_5_2f49f49lwye41ex.R.inc(19607);return null;
        }
        }__CLR4_5_2f49f49lwye41ex.R.inc(19608);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f49f49lwye41ex.R.inc(19609);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2f49f49lwye41ex.R.inc(19610);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_2f49f49lwye41ex.R.inc(19611);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_MIN_MIN_HEM));
        __CLR4_5_2f49f49lwye41ex.R.inc(19612);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2f49f49lwye41ex.R.inc(19613);position.setCourse(parser.nextDouble(0));

        // Old format
        __CLR4_5_2f49f49lwye41ex.R.inc(19614);if ((((parser.hasNext(5))&&(__CLR4_5_2f49f49lwye41ex.R.iget(19615)!=0|true))||(__CLR4_5_2f49f49lwye41ex.R.iget(19616)==0&false))) {{
            __CLR4_5_2f49f49lwye41ex.R.inc(19617);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
            __CLR4_5_2f49f49lwye41ex.R.inc(19618);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
            __CLR4_5_2f49f49lwye41ex.R.inc(19619);position.set(Position.KEY_INPUT, parser.nextInt(0) + parser.nextInt(0) << 1);
            __CLR4_5_2f49f49lwye41ex.R.inc(19620);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt(0));
        }

        // New format
        }__CLR4_5_2f49f49lwye41ex.R.inc(19621);if ((((parser.hasNext(10))&&(__CLR4_5_2f49f49lwye41ex.R.iget(19622)!=0|true))||(__CLR4_5_2f49f49lwye41ex.R.iget(19623)==0&false))) {{
            __CLR4_5_2f49f49lwye41ex.R.inc(19624);position.set(Position.KEY_CHARGE, parser.nextInt(0) == 1);
            __CLR4_5_2f49f49lwye41ex.R.inc(19625);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
            __CLR4_5_2f49f49lwye41ex.R.inc(19626);position.set(Position.KEY_INPUT, parser.nextInt(0));
            __CLR4_5_2f49f49lwye41ex.R.inc(19627);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());
            __CLR4_5_2f49f49lwye41ex.R.inc(19628);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
            __CLR4_5_2f49f49lwye41ex.R.inc(19629);position.set(Position.PREFIX_TEMP + 1, parser.nextInt(0));
            __CLR4_5_2f49f49lwye41ex.R.inc(19630);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt(0));
            __CLR4_5_2f49f49lwye41ex.R.inc(19631);position.set(Position.KEY_ACCELERATION, parser.nextInt(0) == 1);
            __CLR4_5_2f49f49lwye41ex.R.inc(19632);position.set(Position.KEY_OUTPUT, parser.nextInt(0) + parser.nextInt(0) << 1);
        }

        }__CLR4_5_2f49f49lwye41ex.R.inc(19633);position.setValid(parser.next().equals("A"));

        __CLR4_5_2f49f49lwye41ex.R.inc(19634);return position;
    }finally{__CLR4_5_2f49f49lwye41ex.R.flushNeeded();}}

}
