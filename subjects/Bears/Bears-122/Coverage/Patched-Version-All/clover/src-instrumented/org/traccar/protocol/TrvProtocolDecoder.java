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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class TrvProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2gvrgvrlwye7h9i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,21955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TrvProtocolDecoder(TrvProtocol protocol) {
        super(protocol);__CLR4_5_2gvrgvrlwye7h9i.R.inc(21880);try{__CLR4_5_2gvrgvrlwye7h9i.R.inc(21879);
    }finally{__CLR4_5_2gvrgvrlwye7h9i.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression("[A-Z]{2,3}")
            .number("APdd")
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .expression("([AV])")                // validity
            .number("(dd)(dd.d+)")               // latitude
            .expression("([NS])")
            .number("(ddd)(dd.d+)")              // longitude
            .expression("([EW])")
            .number("(ddd.d)")                   // speed
            .number("(dd)(dd)(dd)")              // time (hhmmss)
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
            .expression("[A-Z]{2,3}")
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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2gvrgvrlwye7h9i.R.inc(21881);

        __CLR4_5_2gvrgvrlwye7h9i.R.inc(21882);String sentence = (String) msg;

        __CLR4_5_2gvrgvrlwye7h9i.R.inc(21883);String id = (((sentence.startsWith("TRV") )&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21884)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21885)==0&false))? sentence.substring(0, 3) : sentence.substring(0, 2);
        __CLR4_5_2gvrgvrlwye7h9i.R.inc(21886);String type = sentence.substring(id.length(), id.length() + 4);

        __CLR4_5_2gvrgvrlwye7h9i.R.inc(21887);if ((((channel != null)&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21888)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21889)==0&false))) {{
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21890);if ((((type.equals("AP00") && id.equals("IW"))&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21891)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21892)==0&false))) {{
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21893);String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21894);channel.write(id + (char) (type.charAt(0) + 1) + type.substring(1) + "," + time + ",0#");
            } }else {{
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21895);channel.write(id + (char) (type.charAt(0) + 1) + type.substring(1) + "#");
            }
        }}

        }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21896);if ((((type.equals("AP00"))&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21897)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21898)==0&false))) {{
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21899);getDeviceSession(channel, remoteAddress, sentence.substring(id.length() + type.length()));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21900);return null;
        }

        }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21901);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2gvrgvrlwye7h9i.R.inc(21902);if ((((deviceSession == null)&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21903)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21904)==0&false))) {{
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21905);return null;
        }

        }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21906);if ((((type.equals("CP01"))&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21907)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21908)==0&false))) {{

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21909);Parser parser = new Parser(PATTERN_HEATRBEAT, sentence);
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21910);if ((((!parser.matches())&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21911)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21912)==0&false))) {{
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21913);return null;
            }

            }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21914);Position position = new Position();
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21915);position.setProtocol(getProtocolName());
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21916);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21917);getLastLocation(position, null);

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21918);position.set(Position.KEY_RSSI, parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21919);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21920);position.set(Position.KEY_BATTERY, parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21921);position.set(Position.KEY_IGNITION, parser.nextInt(0) != 0);

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21922);position.set("arm", parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21923);position.set("mode", parser.nextInt(0));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21924);return position;

        } }else {__CLR4_5_2gvrgvrlwye7h9i.R.inc(21925);if ((((type.equals("AP01") || type.equals("AP10"))&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21926)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21927)==0&false))) {{

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21928);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21929);if ((((!parser.matches())&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21930)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21931)==0&false))) {{
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21932);return null;
            }

            }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21933);Position position = new Position();
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21934);position.setProtocol(getProtocolName());
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21935);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21936);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21937);position.setValid(parser.next().equals("A"));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21938);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21939);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21940);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21941);dateBuilder.setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21942);position.setTime(dateBuilder.getDate());

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21943);position.setCourse(parser.nextDouble(0));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21944);int rssi = parser.nextInt(0);
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21945);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21946);position.set(Position.KEY_BATTERY, parser.nextInt(0));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21947);int acc = parser.nextInt(0);
            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21948);if ((((acc != 0)&&(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21949)!=0|true))||(__CLR4_5_2gvrgvrlwye7h9i.R.iget(21950)==0&false))) {{
                __CLR4_5_2gvrgvrlwye7h9i.R.inc(21951);position.set(Position.KEY_IGNITION, acc == 1);
            }

            }__CLR4_5_2gvrgvrlwye7h9i.R.inc(21952);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(0), parser.nextInt(0), parser.nextInt(0), parser.nextInt(0), rssi)));

            __CLR4_5_2gvrgvrlwye7h9i.R.inc(21953);return position;
        }

        }}__CLR4_5_2gvrgvrlwye7h9i.R.inc(21954);return null;
    }finally{__CLR4_5_2gvrgvrlwye7h9i.R.flushNeeded();}}

}
