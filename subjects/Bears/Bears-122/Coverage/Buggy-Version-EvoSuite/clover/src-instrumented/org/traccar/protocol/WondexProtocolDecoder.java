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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

public class WondexProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2i51i51lwydwf9e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,23562,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WondexProtocolDecoder(WondexProtocol protocol) {
        super(protocol);__CLR4_5_2i51i51lwydwf9e.R.inc(23510);try{__CLR4_5_2i51i51lwydwf9e.R.inc(23509);
    }finally{__CLR4_5_2i51i51lwydwf9e.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("[^d]*")                     // header
            .number("(d+),")                     // device identifier
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2i51i51lwydwf9e.R.inc(23511);

        __CLR4_5_2i51i51lwydwf9e.R.inc(23512);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2i51i51lwydwf9e.R.inc(23513);if ((((buf.getUnsignedByte(0) == 0xD0)&&(__CLR4_5_2i51i51lwydwf9e.R.iget(23514)!=0|true))||(__CLR4_5_2i51i51lwydwf9e.R.iget(23515)==0&false))) {{

            __CLR4_5_2i51i51lwydwf9e.R.inc(23516);long deviceId = ((Long.reverseBytes(buf.getLong(0))) >> 32) & 0xFFFFFFFFL;
            __CLR4_5_2i51i51lwydwf9e.R.inc(23517);getDeviceSession(channel, remoteAddress, String.valueOf(deviceId));

            __CLR4_5_2i51i51lwydwf9e.R.inc(23518);return null;
        } }else {__CLR4_5_2i51i51lwydwf9e.R.inc(23519);if ((((buf.toString(StandardCharsets.US_ASCII).startsWith("$OK:")
                || buf.toString(StandardCharsets.US_ASCII).startsWith("$ERR:")
                  || buf.toString(StandardCharsets.US_ASCII).startsWith("$MSG:"))&&(__CLR4_5_2i51i51lwydwf9e.R.iget(23520)!=0|true))||(__CLR4_5_2i51i51lwydwf9e.R.iget(23521)==0&false))) {{

            __CLR4_5_2i51i51lwydwf9e.R.inc(23522);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);

            __CLR4_5_2i51i51lwydwf9e.R.inc(23523);Position position = new Position();
            __CLR4_5_2i51i51lwydwf9e.R.inc(23524);position.setProtocol(getProtocolName());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23525);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23526);getLastLocation(position, new Date());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23527);position.set(Position.KEY_RESULT, buf.toString(StandardCharsets.US_ASCII));

            __CLR4_5_2i51i51lwydwf9e.R.inc(23528);return position;
        } }else {{

            __CLR4_5_2i51i51lwydwf9e.R.inc(23529);Parser parser = new Parser(PATTERN, buf.toString(StandardCharsets.US_ASCII));
            __CLR4_5_2i51i51lwydwf9e.R.inc(23530);if ((((!parser.matches())&&(__CLR4_5_2i51i51lwydwf9e.R.iget(23531)!=0|true))||(__CLR4_5_2i51i51lwydwf9e.R.iget(23532)==0&false))) {{
                __CLR4_5_2i51i51lwydwf9e.R.inc(23533);return null;
            }

            }__CLR4_5_2i51i51lwydwf9e.R.inc(23534);Position position = new Position();
            __CLR4_5_2i51i51lwydwf9e.R.inc(23535);position.setProtocol(getProtocolName());

            __CLR4_5_2i51i51lwydwf9e.R.inc(23536);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23537);if ((((deviceSession == null)&&(__CLR4_5_2i51i51lwydwf9e.R.iget(23538)!=0|true))||(__CLR4_5_2i51i51lwydwf9e.R.iget(23539)==0&false))) {{
                __CLR4_5_2i51i51lwydwf9e.R.inc(23540);return null;
            }
            }__CLR4_5_2i51i51lwydwf9e.R.inc(23541);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2i51i51lwydwf9e.R.inc(23542);position.setTime(parser.nextDateTime());

            __CLR4_5_2i51i51lwydwf9e.R.inc(23543);position.setLongitude(parser.nextDouble(0));
            __CLR4_5_2i51i51lwydwf9e.R.inc(23544);position.setLatitude(parser.nextDouble(0));
            __CLR4_5_2i51i51lwydwf9e.R.inc(23545);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
            __CLR4_5_2i51i51lwydwf9e.R.inc(23546);position.setCourse(parser.nextDouble(0));
            __CLR4_5_2i51i51lwydwf9e.R.inc(23547);position.setAltitude(parser.nextDouble(0));

            __CLR4_5_2i51i51lwydwf9e.R.inc(23548);int satellites = parser.nextInt(0);
            __CLR4_5_2i51i51lwydwf9e.R.inc(23549);position.setValid(satellites != 0);
            __CLR4_5_2i51i51lwydwf9e.R.inc(23550);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2i51i51lwydwf9e.R.inc(23551);position.set(Position.KEY_EVENT, parser.next());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23552);position.set(Position.KEY_BATTERY, parser.nextDouble());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23553);if ((((parser.hasNext())&&(__CLR4_5_2i51i51lwydwf9e.R.iget(23554)!=0|true))||(__CLR4_5_2i51i51lwydwf9e.R.iget(23555)==0&false))) {{
                __CLR4_5_2i51i51lwydwf9e.R.inc(23556);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
            }
            }__CLR4_5_2i51i51lwydwf9e.R.inc(23557);position.set(Position.KEY_INPUT, parser.next());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23558);position.set(Position.PREFIX_ADC + 1, parser.next());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23559);position.set(Position.PREFIX_ADC + 2, parser.next());
            __CLR4_5_2i51i51lwydwf9e.R.inc(23560);position.set(Position.KEY_OUTPUT, parser.next());

            __CLR4_5_2i51i51lwydwf9e.R.inc(23561);return position;
        }

    }}}finally{__CLR4_5_2i51i51lwydwf9e.R.flushNeeded();}}

}
