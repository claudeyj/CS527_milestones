/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton@traccar.org)
 * Copyright 2014 Rohit
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

public class CarTrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27f17f1lwydzmgv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,9650,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CarTrackProtocolDecoder(CarTrackProtocol protocol) {
        super(protocol);__CLR4_5_27f17f1lwydzmgv.R.inc(9614);try{__CLR4_5_27f17f1lwydzmgv.R.inc(9613);
    }finally{__CLR4_5_27f17f1lwydzmgv.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$$")                          // header
            .number("(d+)")                      // device id
            .text("?").expression("*")
            .text("&A")
            .number("(dddd)")                    // command
            .text("&B")
            .number("(dd)(dd)(dd).(ddd),")       // time (hhmmss.sss)
            .expression("([AV]),")               // validity
            .number("(dd)(dd.dddd),")            // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.dddd),")           // longitude
            .expression("([EW]),")
            .number("(d+.d*)?,")                 // speed
            .number("(d+.d*)?,")                 // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .expression("&C([^&]*)")             // io
            .expression("&D([^&]*)")             // odometer
            .expression("&E([^&]*)")             // alarm
            .expression("&Y([^&]*)").optional()  // adc
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27f17f1lwydzmgv.R.inc(9615);

        __CLR4_5_27f17f1lwydzmgv.R.inc(9616);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_27f17f1lwydzmgv.R.inc(9617);if ((((!parser.matches())&&(__CLR4_5_27f17f1lwydzmgv.R.iget(9618)!=0|true))||(__CLR4_5_27f17f1lwydzmgv.R.iget(9619)==0&false))) {{
            __CLR4_5_27f17f1lwydzmgv.R.inc(9620);return null;
        }

        }__CLR4_5_27f17f1lwydzmgv.R.inc(9621);Position position = new Position();
        __CLR4_5_27f17f1lwydzmgv.R.inc(9622);position.setProtocol(getProtocolName());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9623);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27f17f1lwydzmgv.R.inc(9624);if ((((deviceSession == null)&&(__CLR4_5_27f17f1lwydzmgv.R.iget(9625)!=0|true))||(__CLR4_5_27f17f1lwydzmgv.R.iget(9626)==0&false))) {{
            __CLR4_5_27f17f1lwydzmgv.R.inc(9627);return null;
        }
        }__CLR4_5_27f17f1lwydzmgv.R.inc(9628);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9629);position.set(Position.KEY_COMMAND, parser.next());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9630);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_27f17f1lwydzmgv.R.inc(9631);position.setValid(parser.next().equals("A"));
        __CLR4_5_27f17f1lwydzmgv.R.inc(9632);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_27f17f1lwydzmgv.R.inc(9633);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_27f17f1lwydzmgv.R.inc(9634);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_27f17f1lwydzmgv.R.inc(9635);position.setCourse(parser.nextDouble(0));

        __CLR4_5_27f17f1lwydzmgv.R.inc(9636);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_27f17f1lwydzmgv.R.inc(9637);position.setTime(dateBuilder.getDate());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9638);position.set(Position.PREFIX_IO + 1, parser.next());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9639);String odometer = parser.next();
        __CLR4_5_27f17f1lwydzmgv.R.inc(9640);odometer = odometer.replace(":", "A");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9641);odometer = odometer.replace(";", "B");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9642);odometer = odometer.replace("<", "C");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9643);odometer = odometer.replace("=", "D");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9644);odometer = odometer.replace(">", "E");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9645);odometer = odometer.replace("?", "F");
        __CLR4_5_27f17f1lwydzmgv.R.inc(9646);position.set(Position.KEY_ODOMETER, Integer.parseInt(odometer, 16));

        __CLR4_5_27f17f1lwydzmgv.R.inc(9647);parser.next(); // there is no meaningful alarms
        __CLR4_5_27f17f1lwydzmgv.R.inc(9648);position.set(Position.PREFIX_ADC + 1, parser.next());

        __CLR4_5_27f17f1lwydzmgv.R.inc(9649);return position;
    }finally{__CLR4_5_27f17f1lwydzmgv.R.flushNeeded();}}

}