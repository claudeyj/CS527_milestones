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

public class GpsGateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2a8ga8glwye7f5c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,13351,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsGateProtocolDecoder(GpsGateProtocol protocol) {
        super(protocol);__CLR4_5_2a8ga8glwye7f5c.R.inc(13265);try{__CLR4_5_2a8ga8glwye7f5c.R.inc(13264);
    }finally{__CLR4_5_2a8ga8glwye7f5c.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
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
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([01])")                // validity
            .any()
            .compile();

    private void send(Channel channel, String message) {try{__CLR4_5_2a8ga8glwye7f5c.R.inc(13266);
        __CLR4_5_2a8ga8glwye7f5c.R.inc(13267);if ((((channel != null)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13268)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13269)==0&false))) {{
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13270);channel.write(message + Checksum.nmea(message) + "\r\n");
        }
    }}finally{__CLR4_5_2a8ga8glwye7f5c.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2a8ga8glwye7f5c.R.inc(13271);

        __CLR4_5_2a8ga8glwye7f5c.R.inc(13272);String sentence = (String) msg;

        __CLR4_5_2a8ga8glwye7f5c.R.inc(13273);if ((((sentence.startsWith("$FRLIN,"))&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13274)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13275)==0&false))) {{

            // Login
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13276);int beginIndex = sentence.indexOf(',', 7);
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13277);if ((((beginIndex != -1)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13278)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13279)==0&false))) {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13280);beginIndex += 1;
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13281);int endIndex = sentence.indexOf(',', beginIndex);
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13282);if ((((endIndex != -1)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13283)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13284)==0&false))) {{
                    __CLR4_5_2a8ga8glwye7f5c.R.inc(13285);String imei = sentence.substring(beginIndex, endIndex);
                    __CLR4_5_2a8ga8glwye7f5c.R.inc(13286);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
                    __CLR4_5_2a8ga8glwye7f5c.R.inc(13287);if ((((deviceSession != null)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13288)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13289)==0&false))) {{
                        __CLR4_5_2a8ga8glwye7f5c.R.inc(13290);if ((((channel != null)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13291)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13292)==0&false))) {{
                            __CLR4_5_2a8ga8glwye7f5c.R.inc(13293);send(channel, "$FRSES," + channel.getId());
                        }
                    }} }else {{
                        __CLR4_5_2a8ga8glwye7f5c.R.inc(13294);send(channel, "$FRERR,AuthError,Unknown device");
                    }
                }} }else {{
                    __CLR4_5_2a8ga8glwye7f5c.R.inc(13295);send(channel, "$FRERR,AuthError,Parse error");
                }
            }} }else {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13296);send(channel, "$FRERR,AuthError,Parse error");
            }

        }} }else {__CLR4_5_2a8ga8glwye7f5c.R.inc(13297);if ((((sentence.startsWith("$FRVER,"))&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13298)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13299)==0&false))) {{

            // Version check
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13300);send(channel, "$FRVER,1,0,GpsGate Server 1.0");

        } }else {__CLR4_5_2a8ga8glwye7f5c.R.inc(13301);if ((((sentence.startsWith("$GPRMC,"))&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13302)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13303)==0&false))) {{

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13304);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13305);if ((((deviceSession == null)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13306)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13307)==0&false))) {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13308);return null;
            }

            }__CLR4_5_2a8ga8glwye7f5c.R.inc(13309);Parser parser = new Parser(PATTERN_GPRMC, sentence);
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13310);if ((((!parser.matches())&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13311)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13312)==0&false))) {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13313);return null;
            }

            }__CLR4_5_2a8ga8glwye7f5c.R.inc(13314);Position position = new Position();
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13315);position.setProtocol(getProtocolName());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13316);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13317);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13318);position.setValid(parser.next().equals("A"));
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13319);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13320);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13321);position.setSpeed(parser.nextDouble(0));
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13322);position.setCourse(parser.nextDouble(0));

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13323);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13324);position.setTime(dateBuilder.getDate());

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13325);return position;

        } }else {__CLR4_5_2a8ga8glwye7f5c.R.inc(13326);if ((((sentence.startsWith("$FRCMD,"))&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13327)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13328)==0&false))) {{

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13329);Parser parser = new Parser(PATTERN_FRCMD, sentence);
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13330);if ((((!parser.matches())&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13331)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13332)==0&false))) {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13333);return null;
            }

            }__CLR4_5_2a8ga8glwye7f5c.R.inc(13334);Position position = new Position();
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13335);position.setProtocol(getProtocolName());

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13336);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13337);if ((((deviceSession == null)&&(__CLR4_5_2a8ga8glwye7f5c.R.iget(13338)!=0|true))||(__CLR4_5_2a8ga8glwye7f5c.R.iget(13339)==0&false))) {{
                __CLR4_5_2a8ga8glwye7f5c.R.inc(13340);return null;
            }
            }__CLR4_5_2a8ga8glwye7f5c.R.inc(13341);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13342);position.setLatitude(parser.nextCoordinate());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13343);position.setLongitude(parser.nextCoordinate());
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13344);position.setAltitude(parser.nextDouble(0));
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13345);position.setSpeed(parser.nextDouble(0));
            __CLR4_5_2a8ga8glwye7f5c.R.inc(13346);position.setCourse(parser.nextDouble(0));

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13347);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13348);position.setValid(parser.next().equals("1"));

            __CLR4_5_2a8ga8glwye7f5c.R.inc(13349);return position;

        }

        }}}}__CLR4_5_2a8ga8glwye7f5c.R.inc(13350);return null;
    }finally{__CLR4_5_2a8ga8glwye7f5c.R.flushNeeded();}}

}