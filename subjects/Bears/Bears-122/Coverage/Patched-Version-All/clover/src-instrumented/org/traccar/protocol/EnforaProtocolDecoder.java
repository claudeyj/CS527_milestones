/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferIndexFinder;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.StringFinder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class EnforaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28gy8gylwye7efd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,11029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EnforaProtocolDecoder(EnforaProtocol protocol) {
        super(protocol);__CLR4_5_28gy8gylwye7efd.R.inc(10979);try{__CLR4_5_28gy8gylwye7efd.R.inc(10978);
    }finally{__CLR4_5_28gy8gylwye7efd.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("GPRMC,")
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(dd)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([EW]),")
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .any()
            .compile();

    public static final int IMEI_LENGTH = 15;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28gy8gylwye7efd.R.inc(10980);

        __CLR4_5_28gy8gylwye7efd.R.inc(10981);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find IMEI number
        __CLR4_5_28gy8gylwye7efd.R.inc(10982);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), new ChannelBufferIndexFinder() {
            @Override
            public boolean find(ChannelBuffer buffer, int guessedIndex) {try{__CLR4_5_28gy8gylwye7efd.R.inc(10983);
                __CLR4_5_28gy8gylwye7efd.R.inc(10984);if ((((buffer.writerIndex() - guessedIndex >= IMEI_LENGTH)&&(__CLR4_5_28gy8gylwye7efd.R.iget(10985)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(10986)==0&false))) {{
                    __CLR4_5_28gy8gylwye7efd.R.inc(10987);for (int i = 0; (((i < IMEI_LENGTH)&&(__CLR4_5_28gy8gylwye7efd.R.iget(10988)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(10989)==0&false)); i++) {{
                        __CLR4_5_28gy8gylwye7efd.R.inc(10990);if ((((!Character.isDigit((char) buffer.getByte(guessedIndex + i)))&&(__CLR4_5_28gy8gylwye7efd.R.iget(10991)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(10992)==0&false))) {{
                            __CLR4_5_28gy8gylwye7efd.R.inc(10993);return false;
                        }
                    }}
                    }__CLR4_5_28gy8gylwye7efd.R.inc(10994);return true;
                }
                }__CLR4_5_28gy8gylwye7efd.R.inc(10995);return false;
            }finally{__CLR4_5_28gy8gylwye7efd.R.flushNeeded();}}
        });
        __CLR4_5_28gy8gylwye7efd.R.inc(10996);if ((((index == -1)&&(__CLR4_5_28gy8gylwye7efd.R.iget(10997)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(10998)==0&false))) {{
            __CLR4_5_28gy8gylwye7efd.R.inc(10999);return null;
        }

        }__CLR4_5_28gy8gylwye7efd.R.inc(11000);String imei = buf.toString(index, IMEI_LENGTH, StandardCharsets.US_ASCII);
        __CLR4_5_28gy8gylwye7efd.R.inc(11001);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_28gy8gylwye7efd.R.inc(11002);if ((((deviceSession == null)&&(__CLR4_5_28gy8gylwye7efd.R.iget(11003)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(11004)==0&false))) {{
            __CLR4_5_28gy8gylwye7efd.R.inc(11005);return null;
        }

        // Find NMEA sentence
        }__CLR4_5_28gy8gylwye7efd.R.inc(11006);int start = buf.indexOf(buf.readerIndex(), buf.writerIndex(), new StringFinder("GPRMC"));
        __CLR4_5_28gy8gylwye7efd.R.inc(11007);if ((((start == -1)&&(__CLR4_5_28gy8gylwye7efd.R.iget(11008)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(11009)==0&false))) {{
            __CLR4_5_28gy8gylwye7efd.R.inc(11010);return null;
        }

        }__CLR4_5_28gy8gylwye7efd.R.inc(11011);String sentence = buf.toString(start, buf.readableBytes() - start, StandardCharsets.US_ASCII);
        __CLR4_5_28gy8gylwye7efd.R.inc(11012);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_28gy8gylwye7efd.R.inc(11013);if ((((!parser.matches())&&(__CLR4_5_28gy8gylwye7efd.R.iget(11014)!=0|true))||(__CLR4_5_28gy8gylwye7efd.R.iget(11015)==0&false))) {{
            __CLR4_5_28gy8gylwye7efd.R.inc(11016);return null;
        }

        }__CLR4_5_28gy8gylwye7efd.R.inc(11017);Position position = new Position();
        __CLR4_5_28gy8gylwye7efd.R.inc(11018);position.setProtocol(getProtocolName());
        __CLR4_5_28gy8gylwye7efd.R.inc(11019);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_28gy8gylwye7efd.R.inc(11020);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_28gy8gylwye7efd.R.inc(11021);position.setValid(parser.next().equals("A"));
        __CLR4_5_28gy8gylwye7efd.R.inc(11022);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_28gy8gylwye7efd.R.inc(11023);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_28gy8gylwye7efd.R.inc(11024);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_28gy8gylwye7efd.R.inc(11025);position.setCourse(parser.nextDouble(0));

        __CLR4_5_28gy8gylwye7efd.R.inc(11026);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_28gy8gylwye7efd.R.inc(11027);position.setTime(dateBuilder.getDate());

        __CLR4_5_28gy8gylwye7efd.R.inc(11028);return position;
    }finally{__CLR4_5_28gy8gylwye7efd.R.flushNeeded();}}

}
