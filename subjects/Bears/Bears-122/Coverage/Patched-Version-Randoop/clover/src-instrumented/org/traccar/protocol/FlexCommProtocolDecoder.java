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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class FlexCommProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28lq8lqlwye64cm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,11202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FlexCommProtocolDecoder(FlexCommProtocol protocol) {
        super(protocol);__CLR4_5_28lq8lqlwye64cm.R.inc(11151);try{__CLR4_5_28lq8lqlwye64cm.R.inc(11150);
    }finally{__CLR4_5_28lq8lqlwye64cm.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("7E")
            .number("(dd)")                      // status
            .number("(d{15})")                   // imei
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .expression("([01])")                // valid
            .number("(d{9})")                    // latitude
            .number("(d{10})")                   // longitude
            .number("(d{4})")                    // altitude
            .number("(ddd)")                     // speed
            .number("(ddd)")                     // course
            .number("(dd)")                      // satellites view
            .number("(dd)")                      // satellites used
            .number("(dd)")                      // rssi
            .number("(ddd)")                     // mcc
            .number("(ddd)")                     // mnc
            .number("(x{6})")                    // lac
            .number("(x{6})")                    // cid
            .expression("([01])([01])([01])")    // input
            .expression("([01])([01])")          // output
            .number("(ddd)")                     // fuel
            .number("(d{4})")                    // temperature
            .number("(ddd)")                     // battery
            .number("(ddd)")                     // power
            .any()
            .compile();

    private static double parseSignedValue(Parser parser, int decimalPoints) {try{__CLR4_5_28lq8lqlwye64cm.R.inc(11152);
        __CLR4_5_28lq8lqlwye64cm.R.inc(11153);String stringValue = parser.next();
        __CLR4_5_28lq8lqlwye64cm.R.inc(11154);boolean negative = stringValue.charAt(0) == '1';
        __CLR4_5_28lq8lqlwye64cm.R.inc(11155);double value = Integer.parseInt(stringValue.substring(1)) * Math.pow(10, -decimalPoints);
        __CLR4_5_28lq8lqlwye64cm.R.inc(11156);return (((negative )&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11157)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11158)==0&false))? -value : value;
    }finally{__CLR4_5_28lq8lqlwye64cm.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28lq8lqlwye64cm.R.inc(11159);

        __CLR4_5_28lq8lqlwye64cm.R.inc(11160);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_28lq8lqlwye64cm.R.inc(11161);if ((((!parser.matches())&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11162)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11163)==0&false))) {{
            __CLR4_5_28lq8lqlwye64cm.R.inc(11164);return null;
        }

        }__CLR4_5_28lq8lqlwye64cm.R.inc(11165);Position position = new Position();
        __CLR4_5_28lq8lqlwye64cm.R.inc(11166);position.setProtocol(getProtocolName());

        __CLR4_5_28lq8lqlwye64cm.R.inc(11167);position.set(Position.KEY_STATUS, parser.nextInt());

        __CLR4_5_28lq8lqlwye64cm.R.inc(11168);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11169);if ((((deviceSession == null)&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11170)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11171)==0&false))) {{
            __CLR4_5_28lq8lqlwye64cm.R.inc(11172);return null;
        }
        }__CLR4_5_28lq8lqlwye64cm.R.inc(11173);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_28lq8lqlwye64cm.R.inc(11174);position.setTime(parser.nextDateTime());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11175);position.setValid(parser.next().equals("1"));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11176);position.setLatitude(parseSignedValue(parser, 6));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11177);position.setLongitude(parseSignedValue(parser, 6));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11178);position.setAltitude(parseSignedValue(parser, 0));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11179);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt()));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11180);position.setCourse(parser.nextDouble(0));

        __CLR4_5_28lq8lqlwye64cm.R.inc(11181);position.set(Position.KEY_SATELLITES_VISIBLE, parser.nextInt());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11182);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11183);position.set(Position.KEY_RSSI, parser.nextInt());

        __CLR4_5_28lq8lqlwye64cm.R.inc(11184);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(), parser.nextInt(), parser.nextHexInt(), parser.nextHexInt())));

        __CLR4_5_28lq8lqlwye64cm.R.inc(11185);for (int i = 1; (((i <= 3)&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11186)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11187)==0&false)); i++) {{
            __CLR4_5_28lq8lqlwye64cm.R.inc(11188);position.set(Position.PREFIX_IN + i, parser.nextInt());
        }

        }__CLR4_5_28lq8lqlwye64cm.R.inc(11189);for (int i = 1; (((i <= 2)&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11190)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11191)==0&false)); i++) {{
            __CLR4_5_28lq8lqlwye64cm.R.inc(11192);position.set(Position.PREFIX_OUT + i, parser.nextInt());
        }

        }__CLR4_5_28lq8lqlwye64cm.R.inc(11193);position.set(Position.KEY_FUEL_LEVEL, parser.nextInt());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11194);position.set(Position.PREFIX_TEMP + 1, parseSignedValue(parser, 0));
        __CLR4_5_28lq8lqlwye64cm.R.inc(11195);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt());
        __CLR4_5_28lq8lqlwye64cm.R.inc(11196);position.set(Position.KEY_POWER, parser.nextInt() * 0.1);

        __CLR4_5_28lq8lqlwye64cm.R.inc(11197);if ((((channel != null)&&(__CLR4_5_28lq8lqlwye64cm.R.iget(11198)!=0|true))||(__CLR4_5_28lq8lqlwye64cm.R.iget(11199)==0&false))) {{
            __CLR4_5_28lq8lqlwye64cm.R.inc(11200);channel.write("{01}");
        }

        }__CLR4_5_28lq8lqlwye64cm.R.inc(11201);return position;
    }finally{__CLR4_5_28lq8lqlwye64cm.R.flushNeeded();}}

}
