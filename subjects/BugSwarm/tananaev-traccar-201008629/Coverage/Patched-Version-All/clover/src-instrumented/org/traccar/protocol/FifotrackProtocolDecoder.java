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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class FifotrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27i97i9lx1e1kdv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,9780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FifotrackProtocolDecoder(FifotrackProtocol protocol) {
        super(protocol);__CLR4_5_27i97i9lx1e1kdv.R.inc(9730);try{__CLR4_5_27i97i9lx1e1kdv.R.inc(9729);
    }finally{__CLR4_5_27i97i9lx1e1kdv.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$$")
            .number("d+,")                       // length
            .number("(d+),")                     // imei
            .number("x+,")                       // index
            .expression("[^,]+,")                // type
            .number("(d+)?,")                    // alarm
            .number("(dd)(dd)(dd)")              // date
            .number("(dd)(dd)(dd),")             // time
            .number("([AV]),")                   // validity
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(-?d+),")                   // altitude
            .number("(d+),")                     // odometer
            .number("d+,")                       // runtime
            .number("(xxxx),")                   // status
            .number("(x+)?,")                    // input
            .number("(x+)?,")                    // output
            .number("(d+)|")                     // mcc
            .number("(d+)|")                     // mnc
            .number("(x+)|")                     // lac
            .number("(x+),")                     // cid
            .number("([x|]+)")                   // adc
            .expression(",([^,]+)")              // rfid
            .expression(",([^*]+)").optional(2)  // sensors
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27i97i9lx1e1kdv.R.inc(9731);

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9732);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9733);if ((((!parser.matches())&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9734)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9735)==0&false))) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9736);return null;
        }

        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9737);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9738);if ((((deviceSession == null)&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9739)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9740)==0&false))) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9741);return null;
        }

        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9742);Position position = new Position();
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9743);position.setProtocol(getProtocolName());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9744);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9745);parser.next(); // alarm

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9746);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9747);position.setTime(dateBuilder.getDate());

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9748);position.setValid(parser.next().equals("A"));
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9749);position.setLatitude(parser.nextDouble());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9750);position.setLongitude(parser.nextDouble());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9751);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt()));
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9752);position.setCourse(parser.nextInt());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9753);position.setAltitude(parser.nextInt());

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9754);position.set(Position.KEY_ODOMETER, parser.nextLong());
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9755);position.set(Position.KEY_STATUS, parser.nextInt(16));
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9756);if ((((parser.hasNext())&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9757)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9758)==0&false))) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9759);position.set(Position.KEY_INPUT, parser.nextInt(16));
        }
        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9760);if ((((parser.hasNext())&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9761)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9762)==0&false))) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9763);position.set(Position.KEY_OUTPUT, parser.nextInt(16));
        }

        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9764);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9765);String[] adc = parser.next().split("\\|");
        __CLR4_5_27i97i9lx1e1kdv.R.inc(9766);for (int i = 0; (((i < adc.length)&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9767)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9768)==0&false)); i++) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9769);position.set(Position.PREFIX_ADC + (i + 1), Integer.parseInt(adc[i], 16));
        }

        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9770);position.set(Position.KEY_RFID, parser.next());

        __CLR4_5_27i97i9lx1e1kdv.R.inc(9771);if ((((parser.hasNext())&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9772)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9773)==0&false))) {{
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9774);String[] sensors = parser.next().split("\\|");
            __CLR4_5_27i97i9lx1e1kdv.R.inc(9775);for (int i = 0; (((i < sensors.length)&&(__CLR4_5_27i97i9lx1e1kdv.R.iget(9776)!=0|true))||(__CLR4_5_27i97i9lx1e1kdv.R.iget(9777)==0&false)); i++) {{
                __CLR4_5_27i97i9lx1e1kdv.R.inc(9778);position.set(Position.PREFIX_IO + (i + 1), sensors[i]);
            }
        }}

        }__CLR4_5_27i97i9lx1e1kdv.R.inc(9779);return position;
    }finally{__CLR4_5_27i97i9lx1e1kdv.R.flushNeeded();}}

}
