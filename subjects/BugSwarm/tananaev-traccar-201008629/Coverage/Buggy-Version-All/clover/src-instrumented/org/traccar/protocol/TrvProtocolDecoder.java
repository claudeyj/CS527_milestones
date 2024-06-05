/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

public class TrvProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2elwelwlx1dxq4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,19000,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TrvProtocolDecoder(TrvProtocol protocol) {
        super(protocol);__CLR4_5_2elwelwlx1dxq4z.R.inc(18933);try{__CLR4_5_2elwelwlx1dxq4z.R.inc(18932);
    }finally{__CLR4_5_2elwelwlx1dxq4z.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("TRV")
            .number("APdd")
            .number("(dd)(dd)(dd)")              // date
            .expression("([AV])")                // validity
            .number("(dd)(dd.d+)")               // latitude
            .expression("([NS])")
            .number("(ddd)(dd.d+)")              // longitude
            .expression("([EW])")
            .number("(ddd.d)")                   // speed
            .number("(dd)(dd)(dd)")              // time
            .number("([d.]{6})")                 // course
            .number("(ddd)")                     // gsm
            .number("(ddd)")                     // satellites
            .number("(ddd)")                     // battery
            .number("(d)")                       // acc
            .number("dd")                        // arm status
            .number("dd,")                       // working mode
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(d+),")                     // lac
            .number("(d+)")                      // cell
            .any()
            .compile();

    private static final Pattern PATTERN_HEATRBEAT = new PatternBuilder()
            .text("TRV")
            .text("CP01,")
            .number("(ddd)")                     // gsm
            .number("(ddd)")                     // gps
            .number("(ddd)")                     // battery
            .number("(d)")                       // acc
            .number("(dd)")                      // arm status
            .number("(dd)")                      // working mode
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2elwelwlx1dxq4z.R.inc(18934);

        __CLR4_5_2elwelwlx1dxq4z.R.inc(18935);String sentence = (String) msg;

        __CLR4_5_2elwelwlx1dxq4z.R.inc(18936);String type = sentence.substring(3, 7);
        __CLR4_5_2elwelwlx1dxq4z.R.inc(18937);if ((((channel != null)&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18938)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18939)==0&false))) {{
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18940);channel.write("TRV" + (char) (type.charAt(0) + 1) + type.substring(1) + "#"); // response
        }

        }__CLR4_5_2elwelwlx1dxq4z.R.inc(18941);if ((((type.equals("AP00"))&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18942)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18943)==0&false))) {{
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18944);getDeviceSession(channel, remoteAddress, sentence.substring(7));
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18945);return null;
        }

        }__CLR4_5_2elwelwlx1dxq4z.R.inc(18946);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2elwelwlx1dxq4z.R.inc(18947);if ((((deviceSession == null)&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18948)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18949)==0&false))) {{
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18950);return null;
        }

        }__CLR4_5_2elwelwlx1dxq4z.R.inc(18951);if ((((type.equals("CP01"))&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18952)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18953)==0&false))) {{

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18954);Parser parser = new Parser(PATTERN_HEATRBEAT, sentence);
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18955);if ((((!parser.matches())&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18956)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18957)==0&false))) {{
                __CLR4_5_2elwelwlx1dxq4z.R.inc(18958);return null;
            }

            }__CLR4_5_2elwelwlx1dxq4z.R.inc(18959);Position position = new Position();
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18960);position.setProtocol(getProtocolName());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18961);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18962);getLastLocation(position, null);

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18963);position.set(Position.KEY_RSSI, parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18964);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18965);position.set(Position.KEY_BATTERY, parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18966);position.set(Position.KEY_IGNITION, parser.nextInt() != 0);

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18967);position.set("arm", parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18968);position.set("mode", parser.nextInt());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18969);return position;

        } }else {__CLR4_5_2elwelwlx1dxq4z.R.inc(18970);if ((((type.equals("AP01") || type.equals("AP10"))&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18971)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18972)==0&false))) {{

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18973);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18974);if ((((!parser.matches())&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18975)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18976)==0&false))) {{
                __CLR4_5_2elwelwlx1dxq4z.R.inc(18977);return null;
            }

            }__CLR4_5_2elwelwlx1dxq4z.R.inc(18978);Position position = new Position();
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18979);position.setProtocol(getProtocolName());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18980);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18981);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18982);position.setValid(parser.next().equals("A"));
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18983);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18984);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18985);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18986);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18987);position.setTime(dateBuilder.getDate());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18988);position.setCourse(parser.nextDouble());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18989);position.set(Position.KEY_RSSI, parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18990);position.set(Position.KEY_SATELLITES, parser.nextInt());
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18991);position.set(Position.KEY_BATTERY, parser.nextInt());

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18992);int acc = parser.nextInt();
            __CLR4_5_2elwelwlx1dxq4z.R.inc(18993);if ((((acc != 0)&&(__CLR4_5_2elwelwlx1dxq4z.R.iget(18994)!=0|true))||(__CLR4_5_2elwelwlx1dxq4z.R.iget(18995)==0&false))) {{
                __CLR4_5_2elwelwlx1dxq4z.R.inc(18996);position.set(Position.KEY_IGNITION, acc == 1);
            }

            }__CLR4_5_2elwelwlx1dxq4z.R.inc(18997);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(), parser.nextInt())));

            __CLR4_5_2elwelwlx1dxq4z.R.inc(18998);return position;
        }

        }}__CLR4_5_2elwelwlx1dxq4z.R.inc(18999);return null;
    }finally{__CLR4_5_2elwelwlx1dxq4z.R.flushNeeded();}}

}
