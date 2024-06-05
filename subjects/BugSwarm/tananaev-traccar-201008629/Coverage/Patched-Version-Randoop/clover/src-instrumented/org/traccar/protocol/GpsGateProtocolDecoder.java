/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class GpsGateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28pb8pblx1e0h2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,11367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsGateProtocolDecoder(GpsGateProtocol protocol) {
        super(protocol);__CLR4_5_28pb8pblx1e0h2y.R.inc(11280);try{__CLR4_5_28pb8pblx1e0h2y.R.inc(11279);
    }finally{__CLR4_5_28pb8pblx1e0h2y.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).?(d+)?,")      // time
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),")
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()
            .compile();

    private static final Pattern PATTERN_FRCMD = new PatternBuilder()
            .text("$FRCMD,")
            .number("(d+),")                     // imei
            .expression("[^,]*,")                // command
            .expression("[^,]*,")
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .expression("([EW]),")
            .number("(d+.?d*),")                 // altitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd).?(d+)?,")      // time
            .expression("([01])")                // validity
            .any()
            .compile();

    private void send(Channel channel, String message) {try{__CLR4_5_28pb8pblx1e0h2y.R.inc(11281);
        __CLR4_5_28pb8pblx1e0h2y.R.inc(11282);if ((((channel != null)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11283)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11284)==0&false))) {{
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11285);channel.write(message + Checksum.nmea(message) + "\r\n");
        }
    }}finally{__CLR4_5_28pb8pblx1e0h2y.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28pb8pblx1e0h2y.R.inc(11286);

        __CLR4_5_28pb8pblx1e0h2y.R.inc(11287);String sentence = (String) msg;

        __CLR4_5_28pb8pblx1e0h2y.R.inc(11288);if ((((sentence.startsWith("$FRLIN,"))&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11289)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11290)==0&false))) {{

            // Login
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11291);int beginIndex = sentence.indexOf(',', 7);
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11292);if ((((beginIndex != -1)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11293)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11294)==0&false))) {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11295);beginIndex += 1;
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11296);int endIndex = sentence.indexOf(',', beginIndex);
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11297);if ((((endIndex != -1)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11298)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11299)==0&false))) {{
                    __CLR4_5_28pb8pblx1e0h2y.R.inc(11300);String imei = sentence.substring(beginIndex, endIndex);
                    __CLR4_5_28pb8pblx1e0h2y.R.inc(11301);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
                    __CLR4_5_28pb8pblx1e0h2y.R.inc(11302);if ((((deviceSession != null)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11303)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11304)==0&false))) {{
                        __CLR4_5_28pb8pblx1e0h2y.R.inc(11305);if ((((channel != null)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11306)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11307)==0&false))) {{
                            __CLR4_5_28pb8pblx1e0h2y.R.inc(11308);send(channel, "$FRSES," + channel.getId());
                        }
                    }} }else {{
                        __CLR4_5_28pb8pblx1e0h2y.R.inc(11309);send(channel, "$FRERR,AuthError,Unknown device");
                    }
                }} }else {{
                    __CLR4_5_28pb8pblx1e0h2y.R.inc(11310);send(channel, "$FRERR,AuthError,Parse error");
                }
            }} }else {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11311);send(channel, "$FRERR,AuthError,Parse error");
            }

        }} }else {__CLR4_5_28pb8pblx1e0h2y.R.inc(11312);if ((((sentence.startsWith("$FRVER,"))&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11313)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11314)==0&false))) {{

            // Version check
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11315);send(channel, "$FRVER,1,0,GpsGate Server 1.0");

        } }else {__CLR4_5_28pb8pblx1e0h2y.R.inc(11316);if ((((sentence.startsWith("$GPRMC,"))&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11317)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11318)==0&false))) {{

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11319);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11320);if ((((deviceSession == null)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11321)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11322)==0&false))) {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11323);return null;
            }

            }__CLR4_5_28pb8pblx1e0h2y.R.inc(11324);Parser parser = new Parser(PATTERN_GPRMC, sentence);
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11325);if ((((!parser.matches())&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11326)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11327)==0&false))) {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11328);return null;
            }

            }__CLR4_5_28pb8pblx1e0h2y.R.inc(11329);Position position = new Position();
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11330);position.setProtocol(getProtocolName());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11331);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11332);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11333);position.setValid(parser.next().equals("A"));
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11334);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11335);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11336);position.setSpeed(parser.nextDouble());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11337);position.setCourse(parser.nextDouble());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11338);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11339);position.setTime(dateBuilder.getDate());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11340);return position;

        } }else {__CLR4_5_28pb8pblx1e0h2y.R.inc(11341);if ((((sentence.startsWith("$FRCMD,"))&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11342)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11343)==0&false))) {{

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11344);Parser parser = new Parser(PATTERN_FRCMD, sentence);
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11345);if ((((!parser.matches())&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11346)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11347)==0&false))) {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11348);return null;
            }

            }__CLR4_5_28pb8pblx1e0h2y.R.inc(11349);Position position = new Position();
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11350);position.setProtocol(getProtocolName());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11351);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11352);if ((((deviceSession == null)&&(__CLR4_5_28pb8pblx1e0h2y.R.iget(11353)!=0|true))||(__CLR4_5_28pb8pblx1e0h2y.R.iget(11354)==0&false))) {{
                __CLR4_5_28pb8pblx1e0h2y.R.inc(11355);return null;
            }
            }__CLR4_5_28pb8pblx1e0h2y.R.inc(11356);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11357);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11358);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11359);position.setAltitude(parser.nextDouble());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11360);position.setSpeed(parser.nextDouble());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11361);position.setCourse(parser.nextDouble());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11362);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_28pb8pblx1e0h2y.R.inc(11363);position.setTime(dateBuilder.getDate());

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11364);position.setValid(parser.next().equals("1"));

            __CLR4_5_28pb8pblx1e0h2y.R.inc(11365);return position;

        }

        }}}}__CLR4_5_28pb8pblx1e0h2y.R.inc(11366);return null;
    }finally{__CLR4_5_28pb8pblx1e0h2y.R.flushNeeded();}}

}
