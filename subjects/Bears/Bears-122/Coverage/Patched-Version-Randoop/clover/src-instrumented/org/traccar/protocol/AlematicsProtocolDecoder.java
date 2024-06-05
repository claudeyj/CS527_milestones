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

public class AlematicsProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25lm5lmlwye62w0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,7333,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AlematicsProtocolDecoder(AlematicsProtocol protocol) {
        super(protocol);__CLR4_5_25lm5lmlwye62w0.R.inc(7259);try{__CLR4_5_25lm5lmlwye62w0.R.inc(7258);
    }finally{__CLR4_5_25lm5lmlwye62w0.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$T,")
            .number("(d+),")                     // type
            .number("(d+),")                     // index
            .number("(d+),")                     // id
            .number("(dddd)(dd)(dd)")            // gps date
            .number("(dd)(dd)(dd),")             // gps time
            .number("(dddd)(dd)(dd)")            // device date
            .number("(dd)(dd)(dd),")             // device time
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(-?d+),")                   // altitude
            .number("(d+.d),")                   // hdop
            .number("(d+),")                     // satellites
            .number("(d+),")                     // input
            .number("(d+),")                     // output
            .number("(d+.d+),")                  // adc
            .number("(d+.d+),")                  // power
            .number("(d+),")                     // odometer
            .groupBegin()
            .text("0,$S,")
            .expression("(.*)")                  // text message
            .or()
            .number("(d+),")                     // extra mask
            .expression("(.*)")                  // extra data
            .groupEnd()
            .compile();

    private void decodeExtras(Position position, Parser parser) {try{__CLR4_5_25lm5lmlwye62w0.R.inc(7260);

        __CLR4_5_25lm5lmlwye62w0.R.inc(7261);int mask = parser.nextInt();
        __CLR4_5_25lm5lmlwye62w0.R.inc(7262);String[] data = parser.next().split(",");

        __CLR4_5_25lm5lmlwye62w0.R.inc(7263);int index = 0;

        __CLR4_5_25lm5lmlwye62w0.R.inc(7264);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7265)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7266)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7267);index++; // pulse counter 3
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7268);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7269)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7270)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7271);position.set(Position.KEY_POWER, Integer.parseInt(data[index++]));
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7272);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7273)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7274)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7275);position.set(Position.KEY_BATTERY, Integer.parseInt(data[index++]));
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7276);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7277)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7278)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7279);position.set(Position.KEY_OBD_SPEED, Integer.parseInt(data[index++]));
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7280);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7281)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7282)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7283);position.set(Position.KEY_RPM, Integer.parseInt(data[index++]));
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7284);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7285)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7286)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7287);position.set(Position.KEY_RSSI, Integer.parseInt(data[index++]));
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7288);if ((((BitUtil.check(mask, 6))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7289)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7290)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7291);index++; // pulse counter 2
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7292);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7293)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7294)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7295);index++; // magnetic rotation sensor rpm
        }

    }}finally{__CLR4_5_25lm5lmlwye62w0.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25lm5lmlwye62w0.R.inc(7296);

        __CLR4_5_25lm5lmlwye62w0.R.inc(7297);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_25lm5lmlwye62w0.R.inc(7298);if ((((!parser.matches())&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7299)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7300)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7301);return null;
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7302);Position position = new Position();
        __CLR4_5_25lm5lmlwye62w0.R.inc(7303);position.setProtocol(getProtocolName());

        __CLR4_5_25lm5lmlwye62w0.R.inc(7304);position.set(Position.KEY_TYPE, parser.nextInt());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7305);position.set(Position.KEY_INDEX, parser.nextInt());

        __CLR4_5_25lm5lmlwye62w0.R.inc(7306);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7307);if ((((deviceSession == null)&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7308)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7309)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7310);return null;
        }
        }__CLR4_5_25lm5lmlwye62w0.R.inc(7311);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_25lm5lmlwye62w0.R.inc(7312);position.setFixTime(parser.nextDateTime());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7313);position.setDeviceTime(parser.nextDateTime());

        __CLR4_5_25lm5lmlwye62w0.R.inc(7314);position.setValid(true);
        __CLR4_5_25lm5lmlwye62w0.R.inc(7315);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_25lm5lmlwye62w0.R.inc(7316);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_25lm5lmlwye62w0.R.inc(7317);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextInt(0)));
        __CLR4_5_25lm5lmlwye62w0.R.inc(7318);position.setCourse(parser.nextInt(0));
        __CLR4_5_25lm5lmlwye62w0.R.inc(7319);position.setAltitude(parser.nextInt(0));

        __CLR4_5_25lm5lmlwye62w0.R.inc(7320);position.set(Position.KEY_HDOP, parser.nextDouble());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7321);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7322);position.set(Position.KEY_INPUT, parser.nextInt());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7323);position.set(Position.KEY_OUTPUT, parser.nextInt());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7324);position.set(Position.PREFIX_ADC + 1, parser.nextDouble());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7325);position.set(Position.KEY_POWER, parser.nextDouble());
        __CLR4_5_25lm5lmlwye62w0.R.inc(7326);position.set(Position.KEY_ODOMETER, parser.nextInt());

        __CLR4_5_25lm5lmlwye62w0.R.inc(7327);if ((((parser.hasNext())&&(__CLR4_5_25lm5lmlwye62w0.R.iget(7328)!=0|true))||(__CLR4_5_25lm5lmlwye62w0.R.iget(7329)==0&false))) {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7330);position.set("text", parser.next());
        } }else {{
            __CLR4_5_25lm5lmlwye62w0.R.inc(7331);decodeExtras(position, parser);
        }

        }__CLR4_5_25lm5lmlwye62w0.R.inc(7332);return position;
    }finally{__CLR4_5_25lm5lmlwye62w0.R.flushNeeded();}}

}
