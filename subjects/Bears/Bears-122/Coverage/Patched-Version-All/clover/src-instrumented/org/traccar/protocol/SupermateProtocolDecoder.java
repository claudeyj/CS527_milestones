/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.regex.Pattern;

public class SupermateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2f9qf9qlwye7gwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,19836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SupermateProtocolDecoder(SupermateProtocol protocol) {
        super(protocol);__CLR4_5_2f9qf9qlwye7gwf.R.inc(19791);try{__CLR4_5_2f9qf9qlwye7gwf.R.inc(19790);
    }finally{__CLR4_5_2f9qf9qlwye7gwf.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("d+:")                       // header
            .number("(d+):")                     // imei
            .number("d+:").text("*,")
            .number("(d+),")                     // command id
            .expression("([^,]{2}),")            // command
            .expression("([AV]),")               // validity
            .number("(xx)(xx)(xx),")             // date (yymmdd)
            .number("(xx)(xx)(xx),")             // time (hhmmss)
            .number("(x)(x{7}),")                // latitude
            .number("(x)(x{7}),")                // longitude
            .number("(x{4}),")                   // speed
            .number("(x{4}),")                   // course
            .number("(x{12}),")                  // status
            .number("(x+),")                     // signal
            .number("(d+),")                     // power
            .number("(x{4}),")                   // oil
            .number("(x+)?")                     // odometer
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2f9qf9qlwye7gwf.R.inc(19792);

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19793);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19794);if ((((!parser.matches())&&(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19795)!=0|true))||(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19796)==0&false))) {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19797);return null;
        }

        }__CLR4_5_2f9qf9qlwye7gwf.R.inc(19798);Position position = new Position();
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19799);position.setProtocol(getProtocolName());

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19800);String imei = parser.next();
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19801);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19802);if ((((deviceSession == null)&&(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19803)!=0|true))||(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19804)==0&false))) {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19805);return null;
        }
        }__CLR4_5_2f9qf9qlwye7gwf.R.inc(19806);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19807);position.set("commandId", parser.next());
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19808);position.set(Position.KEY_COMMAND, parser.next());

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19809);position.setValid(parser.next().equals("A"));

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19810);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextHexInt(0), parser.nextHexInt(0), parser.nextHexInt(0))
                .setTime(parser.nextHexInt(0), parser.nextHexInt(0), parser.nextHexInt(0));
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19811);position.setTime(dateBuilder.getDate());

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19812);if ((((parser.nextHexInt(0) == 8)&&(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19813)!=0|true))||(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19814)==0&false))) {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19815);position.setLatitude(-parser.nextHexInt(0) / 600000.0);
        } }else {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19816);position.setLatitude(parser.nextHexInt(0) / 600000.0);
        }

        }__CLR4_5_2f9qf9qlwye7gwf.R.inc(19817);if ((((parser.nextHexInt(0) == 8)&&(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19818)!=0|true))||(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19819)==0&false))) {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19820);position.setLongitude(-parser.nextHexInt(0) / 600000.0);
        } }else {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19821);position.setLongitude(parser.nextHexInt(0) / 600000.0);
        }

        }__CLR4_5_2f9qf9qlwye7gwf.R.inc(19822);position.setSpeed(parser.nextHexInt(0) / 100.0);
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19823);position.setCourse(parser.nextHexInt(0) / 100.0);

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19824);position.set(Position.KEY_STATUS, parser.next());
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19825);position.set("signal", parser.next());
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19826);position.set(Position.KEY_POWER, parser.nextDouble(0));
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19827);position.set("oil", parser.nextHexInt(0));
        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19828);position.set(Position.KEY_ODOMETER, parser.nextHexInt(0));

        __CLR4_5_2f9qf9qlwye7gwf.R.inc(19829);if ((((channel != null)&&(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19830)!=0|true))||(__CLR4_5_2f9qf9qlwye7gwf.R.iget(19831)==0&false))) {{
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19832);Calendar calendar = Calendar.getInstance();
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19833);String content = String.format("#1:%s:1:*,00000000,UP,%02x%02x%02x,%02x%02x%02x#", imei,
                    calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
            __CLR4_5_2f9qf9qlwye7gwf.R.inc(19834);channel.write(ChannelBuffers.copiedBuffer(content, StandardCharsets.US_ASCII));
        }

        }__CLR4_5_2f9qf9qlwye7gwf.R.inc(19835);return position;
    }finally{__CLR4_5_2f9qf9qlwye7gwf.R.flushNeeded();}}

}
