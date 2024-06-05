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

public class V680ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2hithitlwydzr31{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,22773,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public V680ProtocolDecoder(V680Protocol protocol) {
        super(protocol);__CLR4_5_2hithitlwydzr31.R.inc(22710);try{__CLR4_5_2hithitlwydzr31.R.inc(22709);
    }finally{__CLR4_5_2hithitlwydzr31.R.flushNeeded();}}

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
            .number("(dd)(dd)(dd)#")             // date (ddmmyy)
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2hithitlwydzr31.R.inc(22711);

        __CLR4_5_2hithitlwydzr31.R.inc(22712);String sentence = (String) msg;
        __CLR4_5_2hithitlwydzr31.R.inc(22713);sentence = sentence.trim();

        __CLR4_5_2hithitlwydzr31.R.inc(22714);if ((((sentence.length() == 16)&&(__CLR4_5_2hithitlwydzr31.R.iget(22715)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22716)==0&false))) {{

            __CLR4_5_2hithitlwydzr31.R.inc(22717);getDeviceSession(channel, remoteAddress, sentence.substring(1, sentence.length()));

        } }else {{

            __CLR4_5_2hithitlwydzr31.R.inc(22718);Parser parser = new Parser(PATTERN, sentence);
            __CLR4_5_2hithitlwydzr31.R.inc(22719);if ((((!parser.matches())&&(__CLR4_5_2hithitlwydzr31.R.iget(22720)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22721)==0&false))) {{
                __CLR4_5_2hithitlwydzr31.R.inc(22722);return null;
            }

            }__CLR4_5_2hithitlwydzr31.R.inc(22723);Position position = new Position();
            __CLR4_5_2hithitlwydzr31.R.inc(22724);position.setProtocol(getProtocolName());

            __CLR4_5_2hithitlwydzr31.R.inc(22725);DeviceSession deviceSession;
            __CLR4_5_2hithitlwydzr31.R.inc(22726);if ((((parser.hasNext())&&(__CLR4_5_2hithitlwydzr31.R.iget(22727)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22728)==0&false))) {{
                __CLR4_5_2hithitlwydzr31.R.inc(22729);deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            } }else {{
                __CLR4_5_2hithitlwydzr31.R.inc(22730);deviceSession = getDeviceSession(channel, remoteAddress);
            }
            }__CLR4_5_2hithitlwydzr31.R.inc(22731);if ((((deviceSession == null)&&(__CLR4_5_2hithitlwydzr31.R.iget(22732)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22733)==0&false))) {{
                __CLR4_5_2hithitlwydzr31.R.inc(22734);return null;
            }
            }__CLR4_5_2hithitlwydzr31.R.inc(22735);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2hithitlwydzr31.R.inc(22736);position.set("user", parser.next());
            __CLR4_5_2hithitlwydzr31.R.inc(22737);position.setValid(parser.nextInt(0) > 0);
            __CLR4_5_2hithitlwydzr31.R.inc(22738);position.set("password", parser.next());
            __CLR4_5_2hithitlwydzr31.R.inc(22739);position.set(Position.KEY_EVENT, parser.next());
            __CLR4_5_2hithitlwydzr31.R.inc(22740);position.set("packet", parser.next());
            __CLR4_5_2hithitlwydzr31.R.inc(22741);position.set("lbsData", parser.next());

            __CLR4_5_2hithitlwydzr31.R.inc(22742);double lon = parser.nextDouble(0);
            __CLR4_5_2hithitlwydzr31.R.inc(22743);boolean west = parser.next().equals("W");
            __CLR4_5_2hithitlwydzr31.R.inc(22744);double lat = parser.nextDouble(0);
            __CLR4_5_2hithitlwydzr31.R.inc(22745);boolean south = parser.next().equals("S");

            __CLR4_5_2hithitlwydzr31.R.inc(22746);if ((((lat > 90 || lon > 180)&&(__CLR4_5_2hithitlwydzr31.R.iget(22747)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22748)==0&false))) {{
                __CLR4_5_2hithitlwydzr31.R.inc(22749);int lonDegrees = (int) (lon * 0.01);
                __CLR4_5_2hithitlwydzr31.R.inc(22750);lon = (lon - lonDegrees * 100) / 60.0;
                __CLR4_5_2hithitlwydzr31.R.inc(22751);lon += lonDegrees;

                __CLR4_5_2hithitlwydzr31.R.inc(22752);int latDegrees = (int) (lat * 0.01);
                __CLR4_5_2hithitlwydzr31.R.inc(22753);lat = (lat - latDegrees * 100) / 60.0;
                __CLR4_5_2hithitlwydzr31.R.inc(22754);lat += latDegrees;
            }

            }__CLR4_5_2hithitlwydzr31.R.inc(22755);position.setLongitude((((west )&&(__CLR4_5_2hithitlwydzr31.R.iget(22756)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22757)==0&false))? -lon : lon);
            __CLR4_5_2hithitlwydzr31.R.inc(22758);position.setLatitude((((south )&&(__CLR4_5_2hithitlwydzr31.R.iget(22759)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22760)==0&false))? -lat : lat);

            __CLR4_5_2hithitlwydzr31.R.inc(22761);position.setSpeed(parser.nextDouble(0));
            __CLR4_5_2hithitlwydzr31.R.inc(22762);position.setCourse(parser.nextDouble(0));

            __CLR4_5_2hithitlwydzr31.R.inc(22763);int day = parser.nextInt(0);
            __CLR4_5_2hithitlwydzr31.R.inc(22764);int month = parser.nextInt(0);
            __CLR4_5_2hithitlwydzr31.R.inc(22765);if ((((day == 0 && month == 0)&&(__CLR4_5_2hithitlwydzr31.R.iget(22766)!=0|true))||(__CLR4_5_2hithitlwydzr31.R.iget(22767)==0&false))) {{
                __CLR4_5_2hithitlwydzr31.R.inc(22768);return null; // invalid date
            }

            }__CLR4_5_2hithitlwydzr31.R.inc(22769);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(0), month, day)
                    .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2hithitlwydzr31.R.inc(22770);position.setTime(dateBuilder.getDate());

            __CLR4_5_2hithitlwydzr31.R.inc(22771);return position;
        }

        }__CLR4_5_2hithitlwydzr31.R.inc(22772);return null;
    }finally{__CLR4_5_2hithitlwydzr31.R.flushNeeded();}}

}
