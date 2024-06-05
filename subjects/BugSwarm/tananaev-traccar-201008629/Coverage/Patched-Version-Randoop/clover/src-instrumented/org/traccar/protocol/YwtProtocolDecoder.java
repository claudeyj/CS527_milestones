/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton@traccar.org)
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

public class YwtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fv1fv1lx1e0izv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,20607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public YwtProtocolDecoder(YwtProtocol protocol) {
        super(protocol);__CLR4_5_2fv1fv1lx1e0izv.R.inc(20558);try{__CLR4_5_2fv1fv1lx1e0izv.R.inc(20557);
    }finally{__CLR4_5_2fv1fv1lx1e0izv.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression("%(..),")                // type
            .number("(d+):")                     // unit identifier
            .number("d+,")                       // subtype
            .number("(dd)(dd)(dd)")              // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time
            .expression("([EW])")
            .number("(ddd.d{6}),")               // longitude
            .expression("([NS])")
            .number("(dd.d{6}),")                // latitude
            .number("(d+)?,")                    // altitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // satellite
            .expression("([^,]+),")              // report identifier
            .expression("([-0-9a-fA-F]+)")       // status
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fv1fv1lx1e0izv.R.inc(20559);

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20560);String sentence = (String) msg;

        // Synchronization
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20561);if ((((sentence.startsWith("%SN") && channel != null)&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20562)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20563)==0&false))) {{
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20564);int start = sentence.indexOf(':');
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20565);int end = start;
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20566);for (int i = 0; (((i < 4)&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20567)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20568)==0&false)); i++) {{
                __CLR4_5_2fv1fv1lx1e0izv.R.inc(20569);end = sentence.indexOf(',', end + 1);
            }
            }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20570);if ((((end == -1)&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20571)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20572)==0&false))) {{
                __CLR4_5_2fv1fv1lx1e0izv.R.inc(20573);end = sentence.length();
            }

            }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20574);channel.write("%AT+SN=" + sentence.substring(start, end));
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20575);return null;
        }

        }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20576);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20577);if ((((!parser.matches())&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20578)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20579)==0&false))) {{
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20580);return null;
        }

        }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20581);Position position = new Position();
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20582);position.setProtocol(getProtocolName());

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20583);String type = parser.next();

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20584);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20585);if ((((deviceSession == null)&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20586)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20587)==0&false))) {{
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20588);return null;
        }
        }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20589);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20590);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20591);position.setTime(dateBuilder.getDate());

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20592);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20593);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20594);position.setAltitude(parser.nextDouble());
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20595);position.setSpeed(parser.nextDouble());
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20596);position.setCourse(parser.nextDouble());

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20597);int satellites = parser.nextInt();
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20598);position.setValid(satellites >= 3);
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20599);position.set(Position.KEY_SATELLITES, satellites);

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20600);String reportId = parser.next();

        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20601);position.set(Position.KEY_STATUS, parser.next());

        // Send response
        __CLR4_5_2fv1fv1lx1e0izv.R.inc(20602);if (((((type.equals("KP") || type.equals("EP")) && channel != null)&&(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20603)!=0|true))||(__CLR4_5_2fv1fv1lx1e0izv.R.iget(20604)==0&false))) {{
            __CLR4_5_2fv1fv1lx1e0izv.R.inc(20605);channel.write("%AT+" + type + "=" + reportId + "\r\n");
        }

        }__CLR4_5_2fv1fv1lx1e0izv.R.inc(20606);return position;
    }finally{__CLR4_5_2fv1fv1lx1e0izv.R.flushNeeded();}}

}
