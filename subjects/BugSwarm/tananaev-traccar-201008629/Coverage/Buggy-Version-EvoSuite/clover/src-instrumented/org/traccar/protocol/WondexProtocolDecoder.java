/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

public class WondexProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fmtfmtlx1dvfhe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,20316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WondexProtocolDecoder(WondexProtocol protocol) {
        super(protocol);__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20262);try{__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20261);
    }finally{__CLR4_5_2fmtfmtlx1dvfhe.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("[^d]*")                     // deader
            .number("(d+),")                     // device identifier
            .number("(dddd)(dd)(dd)")            // date
            .number("(dd)(dd)(dd),")             // time
            .number("(-?d+.d+),")                // longitude
            .number("(-?d+.d+),")                // latitude
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(-?d+.?d*),")               // altitude
            .number("(d+),")                     // satellites
            .number("(d+),?")                    // event
            .number("(d+.d+)V,").optional()      // battery
            .number("(d+.d+)?,?")                // odometer
            .number("(d+)?,?")                   // input
            .number("(d+.d+)?,?")                // adc1
            .number("(d+.d+)?,?")                // adc2
            .number("(d+)?")                     // output
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20263);

        __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20264);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20265);if ((((buf.getUnsignedByte(0) == 0xD0)&&(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20266)!=0|true))||(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20267)==0&false))) {{

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20268);long deviceId = ((Long.reverseBytes(buf.getLong(0))) >> 32) & 0xFFFFFFFFL;
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20269);getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20270);return null;
        } }else {__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20271);if ((((buf.toString(StandardCharsets.US_ASCII).startsWith("$OK:")
                || buf.toString(StandardCharsets.US_ASCII).startsWith("$ERR:"))&&(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20272)!=0|true))||(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20273)==0&false))) {{

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20274);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20275);Position position = new Position();
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20276);position.setProtocol(getProtocolName());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20277);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20278);getLastLocation(position, new Date());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20279);position.setValid(false);
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20280);position.set(Position.KEY_RESULT, buf.toString(StandardCharsets.US_ASCII));

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20281);return position;
        } }else {{

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20282);Parser parser = new Parser(PATTERN, buf.toString(StandardCharsets.US_ASCII));
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20283);if ((((!parser.matches())&&(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20284)!=0|true))||(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20285)==0&false))) {{
                __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20286);return null;
            }

            }__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20287);Position position = new Position();
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20288);position.setProtocol(getProtocolName());

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20289);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20290);if ((((deviceSession == null)&&(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20291)!=0|true))||(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20292)==0&false))) {{
                __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20293);return null;
            }
            }__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20294);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20295);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20296);position.setTime(dateBuilder.getDate());

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20297);position.setLongitude(parser.nextDouble());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20298);position.setLatitude(parser.nextDouble());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20299);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20300);position.setCourse(parser.nextDouble());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20301);position.setAltitude(parser.nextDouble());

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20302);int satellites = parser.nextInt();
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20303);position.setValid(satellites >= 3);
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20304);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20305);position.set(Position.KEY_EVENT, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20306);position.set(Position.KEY_BATTERY, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20307);if ((((parser.hasNext())&&(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20308)!=0|true))||(__CLR4_5_2fmtfmtlx1dvfhe.R.iget(20309)==0&false))) {{
                __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20310);position.set(Position.KEY_ODOMETER, parser.nextDouble() * 1000);
            }
            }__CLR4_5_2fmtfmtlx1dvfhe.R.inc(20311);position.set(Position.KEY_INPUT, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20312);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20313);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20314);position.set(Position.KEY_OUTPUT, parser.next());

            __CLR4_5_2fmtfmtlx1dvfhe.R.inc(20315);return position;
        }

    }}}finally{__CLR4_5_2fmtfmtlx1dvfhe.R.flushNeeded();}}

}