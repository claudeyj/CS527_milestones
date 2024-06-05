/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

public class V680ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f7nf7nlx1dwl68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,19779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public V680ProtocolDecoder(V680Protocol protocol) {
        super(protocol);__CLR4_5_2f7nf7nlx1dwl68.R.inc(19716);try{__CLR4_5_2f7nf7nlx1dwl68.R.inc(19715);
    }finally{__CLR4_5_2f7nf7nlx1dwl68.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .groupBegin()
            .number("#(d+)#")                    // imei
            .expression("([^#]*)#")              // user
            .groupEnd("?")
            .number("(d+)#")                     // fix
            .expression("([^#]+)#")              // password
            .expression("([^#]+)#")              // event
            .number("(d+)#")                     // packet number
            .expression("([^#]+)?#?")            // gsm base station
            .expression("(?:[^#]+#)?")
            .number("(d+.d+),([EW]),")           // longitude
            .number("(d+.d+),([NS]),")           // latitude
            .number("(d+.d+),")                  // speed
            .number("(d+.?d*)?#")                // course
            .number("(dd)(dd)(dd)#")             // date
            .number("(dd)(dd)(dd)")              // time
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f7nf7nlx1dwl68.R.inc(19717);

        __CLR4_5_2f7nf7nlx1dwl68.R.inc(19718);String sentence = (String) msg;
        __CLR4_5_2f7nf7nlx1dwl68.R.inc(19719);sentence = sentence.trim();

        __CLR4_5_2f7nf7nlx1dwl68.R.inc(19720);if ((((sentence.length() == 16)&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19721)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19722)==0&false))) {{

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19723);getDeviceSession(channel, remoteAddress, sentence.substring(1, sentence.length()));

        } }else {{

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19724);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19725);if ((((!parser.matches())&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19726)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19727)==0&false))) {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19728);return null;
            }

            }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19729);Position position = new Position();
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19730);position.setProtocol(getProtocolName());

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19731);DeviceSession deviceSession;
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19732);if ((((parser.hasNext())&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19733)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19734)==0&false))) {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19735);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            } }else {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19736);deviceSession = getDeviceSession(channel, remoteAddress);
            }
            }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19737);if ((((deviceSession == null)&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19738)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19739)==0&false))) {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19740);return null;
            }
            }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19741);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19742);position.set("user", parser.next());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19743);position.setValid(parser.nextInt() > 0);
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19744);position.set("password", parser.next());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19745);position.set(Position.KEY_EVENT, parser.next());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19746);position.set("packet", parser.next());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19747);position.set(Position.KEY_RSSI, parser.next());

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19748);double lon = parser.nextDouble();
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19749);boolean west = parser.next().equals("W");
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19750);double lat = parser.nextDouble();
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19751);boolean south = parser.next().equals("S");

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19752);if ((((lat > 90 || lon > 180)&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19753)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19754)==0&false))) {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19755);int lonDegrees = (int) (lon * 0.01);
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19756);lon = (lon - lonDegrees * 100) / 60.0;
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19757);lon += lonDegrees;

                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19758);int latDegrees = (int) (lat * 0.01);
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19759);lat = (lat - latDegrees * 100) / 60.0;
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19760);lat += latDegrees;
            }

            }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19761);position.setLongitude((((west )&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19762)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19763)==0&false))? -lon : lon);
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19764);position.setLatitude((((south )&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19765)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19766)==0&false))? -lat : lat);

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19767);position.setSpeed(parser.nextDouble());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19768);position.setCourse(parser.nextDouble());

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19769);int day = parser.nextInt();
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19770);int month = parser.nextInt();
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19771);if ((((day == 0 && month == 0)&&(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19772)!=0|true))||(__CLR4_5_2f7nf7nlx1dwl68.R.iget(19773)==0&false))) {{
                __CLR4_5_2f7nf7nlx1dwl68.R.inc(19774);return null; // invalid date
            }

            }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19775);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), month, day)
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19776);position.setTime(dateBuilder.getDate());

            __CLR4_5_2f7nf7nlx1dwl68.R.inc(19777);return position;
        }

        }__CLR4_5_2f7nf7nlx1dwl68.R.inc(19778);return null;
    }finally{__CLR4_5_2f7nf7nlx1dwl68.R.flushNeeded();}}

}
