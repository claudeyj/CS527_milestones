/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class AquilaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_269f69flwydzluq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,8175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AquilaProtocolDecoder(AquilaProtocol protocol) {
        super(protocol);__CLR4_5_269f69flwydzluq.R.inc(8116);try{__CLR4_5_269f69flwydzluq.R.inc(8115);
    }finally{__CLR4_5_269f69flwydzluq.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$$")
            .expression("[^,]*,")                // client
            .number("(d+),")                     // device serial number
            .number("(d+),")                     // event
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(d+),")                     // gsm
            .number("(d+),")                     // speed
            .number("(d+),")                     // distance
            .groupBegin()
            .number("d+,")                       // driver code
            .number("(d+),")                     // fuel
            .number("([01]),")                   // io 1
            .number("[01],")                     // case open switch
            .number("[01],")                     // over speed start
            .number("[01],")                     // over speed end
            .number("(?:d+,){3}")                // reserved
            .number("([01]),")                   // power status
            .number("([01]),")                   // io 2
            .number("d+,")                       // reserved
            .number("([01]),")                   // ignition
            .number("[01],")                     // ignition off event
            .number("(?:d+,){7}")                // reserved
            .number("[01],")                     // corner packet
            .number("(?:d+,){8}")                // reserved
            .number("([01]),")                   // course bit 0
            .number("([01]),")                   // course bit 1
            .number("([01]),")                   // course bit 2
            .number("([01]),")                   // course bit 3
            .or()
            .number("(d+),")                     // course
            .number("(?:d+,){3}")                // reserved
            .number("[01],")                     // over speed start
            .number("[01],")                     // over speed end
            .number("(?:d+,){3}")                // reserved
            .number("([01]),")                   // power status
            .number("(?:d+,){2}")                // reserved
            .number("[01],")                     // ignition on event
            .number("([01]),")                   // ignition
            .number("[01],")                     // ignition off event
            .number("(?:d+,){5}")                // reserved
            .number("[01],")                     // low battery
            .number("[01],")                     // corner packet
            .number("(?:d+,){6}")                // reserved
            .number("[01],")                     // hard acceleration
            .number("[01],")                     // hard breaking
            .number("[01],[01],[01],[01],")      // course bits
            .number("(d+),")                     // external voltage
            .number("(d+),")                     // internal voltage
            .number("(?:d+,){6}")                // reserved
            .expression("P([^,]+),")             // obd
            .expression("D([^,]+),")             // dtcs
            .number("-?d+,")                     // accelerometer x
            .number("-?d+,")                     // accelerometer y
            .number("-?d+,")                     // accelerometer z
            .number("d+,")                       // delta distance
            .or()
            .number("(d+),")                     // course
            .number("(d+),")                     // satellites
            .number("(d+.d+),")                  // hdop
            .number("(?:d+,){2}")                // reserved
            .number("(d+),")                     // adc 1
            .number("([01]),")                   // di 1
            .number("[01],")                     // case open
            .number("[01],")                     // over speed start
            .number("[01],")                     // over speed end
            .number("(?:[01],){2}")              // reserved
            .number("[01],")                     // immobilizer
            .number("([01]),")                   // power status
            .number("([01]),")                   // di 2
            .number("(?:[01],){2}")              // reserved
            .number("([01]),")                   // ignition
            .number("(?:[01],){6}")              // reserved
            .number("[01],")                     // low battery
            .number("[01],")                     // corner packet
            .number("(?:[01],){4}")              // reserved
            .number("[01],")                     // do 1
            .number("[01],")                     // reserved
            .number("[01],")                     // hard acceleration
            .number("[01],")                     // hard breaking
            .number("(?:[01],){4}")              // reserved
            .number("(d+),")                     // external voltage
            .number("(d+),")                     // internal voltage
            .groupEnd()
            .text("*")
            .number("xx")                        // checksum
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_269f69flwydzluq.R.inc(8117);

        __CLR4_5_269f69flwydzluq.R.inc(8118);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_269f69flwydzluq.R.inc(8119);if ((((!parser.matches())&&(__CLR4_5_269f69flwydzluq.R.iget(8120)!=0|true))||(__CLR4_5_269f69flwydzluq.R.iget(8121)==0&false))) {{
            __CLR4_5_269f69flwydzluq.R.inc(8122);return null;
        }

        }__CLR4_5_269f69flwydzluq.R.inc(8123);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_269f69flwydzluq.R.inc(8124);if ((((deviceSession == null)&&(__CLR4_5_269f69flwydzluq.R.iget(8125)!=0|true))||(__CLR4_5_269f69flwydzluq.R.iget(8126)==0&false))) {{
            __CLR4_5_269f69flwydzluq.R.inc(8127);return null;
        }

        }__CLR4_5_269f69flwydzluq.R.inc(8128);Position position = new Position();
        __CLR4_5_269f69flwydzluq.R.inc(8129);position.setProtocol(getProtocolName());
        __CLR4_5_269f69flwydzluq.R.inc(8130);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_269f69flwydzluq.R.inc(8131);position.set(Position.KEY_EVENT, parser.nextInt(0));

        __CLR4_5_269f69flwydzluq.R.inc(8132);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_269f69flwydzluq.R.inc(8133);position.setLongitude(parser.nextDouble(0));

        __CLR4_5_269f69flwydzluq.R.inc(8134);position.setTime(parser.nextDateTime());

        __CLR4_5_269f69flwydzluq.R.inc(8135);position.setValid(parser.next().equals("A"));

        __CLR4_5_269f69flwydzluq.R.inc(8136);position.set(Position.KEY_RSSI, parser.nextInt(0));

        __CLR4_5_269f69flwydzluq.R.inc(8137);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));

        __CLR4_5_269f69flwydzluq.R.inc(8138);position.set(Position.KEY_ODOMETER, parser.nextInt(0));

        __CLR4_5_269f69flwydzluq.R.inc(8139);if ((((parser.hasNext(9))&&(__CLR4_5_269f69flwydzluq.R.iget(8140)!=0|true))||(__CLR4_5_269f69flwydzluq.R.iget(8141)==0&false))) {{

            __CLR4_5_269f69flwydzluq.R.inc(8142);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt());
            __CLR4_5_269f69flwydzluq.R.inc(8143);position.set(Position.PREFIX_IN + 1, parser.next());
            __CLR4_5_269f69flwydzluq.R.inc(8144);position.set(Position.KEY_CHARGE, parser.next().equals("1"));
            __CLR4_5_269f69flwydzluq.R.inc(8145);position.set(Position.PREFIX_IN + 2, parser.next());

            __CLR4_5_269f69flwydzluq.R.inc(8146);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);

            __CLR4_5_269f69flwydzluq.R.inc(8147);int course = (parser.nextInt(0) << 3) + (parser.nextInt(0) << 2)
                    + (parser.nextInt(0) << 1) + parser.nextInt(0);
            __CLR4_5_269f69flwydzluq.R.inc(8148);if ((((course > 0 && course <= 8)&&(__CLR4_5_269f69flwydzluq.R.iget(8149)!=0|true))||(__CLR4_5_269f69flwydzluq.R.iget(8150)==0&false))) {{
                __CLR4_5_269f69flwydzluq.R.inc(8151);position.setCourse((course - 1) * 45);
            }

        }} }else {__CLR4_5_269f69flwydzluq.R.inc(8152);if ((((parser.hasNext(7))&&(__CLR4_5_269f69flwydzluq.R.iget(8153)!=0|true))||(__CLR4_5_269f69flwydzluq.R.iget(8154)==0&false))) {{

            __CLR4_5_269f69flwydzluq.R.inc(8155);position.setCourse(parser.nextInt(0));

            __CLR4_5_269f69flwydzluq.R.inc(8156);position.set(Position.KEY_CHARGE, parser.next().equals("1"));
            __CLR4_5_269f69flwydzluq.R.inc(8157);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
            __CLR4_5_269f69flwydzluq.R.inc(8158);position.set(Position.KEY_POWER, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8159);position.set(Position.KEY_BATTERY, parser.nextInt(0));

            __CLR4_5_269f69flwydzluq.R.inc(8160);String obd = parser.next();
            __CLR4_5_269f69flwydzluq.R.inc(8161);position.set("obd", obd.substring(1, obd.length() - 1));

            __CLR4_5_269f69flwydzluq.R.inc(8162);String dtcs = parser.next();
            __CLR4_5_269f69flwydzluq.R.inc(8163);position.set(Position.KEY_DTCS, dtcs.substring(1, dtcs.length() - 1).replace('|', ' '));

        } }else {{

            __CLR4_5_269f69flwydzluq.R.inc(8164);position.setCourse(parser.nextInt(0));

            __CLR4_5_269f69flwydzluq.R.inc(8165);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8166);position.set(Position.KEY_HDOP, parser.nextDouble(0));
            __CLR4_5_269f69flwydzluq.R.inc(8167);position.set(Position.PREFIX_ADC + 1, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8168);position.set(Position.PREFIX_IN + 1, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8169);position.set(Position.KEY_CHARGE, parser.next().equals("1"));
            __CLR4_5_269f69flwydzluq.R.inc(8170);position.set(Position.PREFIX_IN + 2, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8171);position.set(Position.KEY_IGNITION, parser.nextInt(0) == 1);
            __CLR4_5_269f69flwydzluq.R.inc(8172);position.set(Position.KEY_POWER, parser.nextInt(0));
            __CLR4_5_269f69flwydzluq.R.inc(8173);position.set(Position.KEY_BATTERY, parser.nextInt(0));

        }

        }}__CLR4_5_269f69flwydzluq.R.inc(8174);return position;
    }finally{__CLR4_5_269f69flwydzluq.R.flushNeeded();}}

}
