/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

public class Tr900ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ecnecnlx1dzc0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,18629,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tr900ProtocolDecoder(Tr900Protocol protocol) {
        super(protocol);__CLR4_5_2ecnecnlx1dzc0h.R.inc(18600);try{__CLR4_5_2ecnecnlx1dzc0h.R.inc(18599);
    }finally{__CLR4_5_2ecnecnlx1dzc0h.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number(">(d+),")                    // id
            .number("d+,")                       // period
            .number("(d),")                      // fix
            .number("(dd)(dd)(dd),")             // date (yymmdd)
            .number("(dd)(dd)(dd),")             // time
            .expression("([EW])")
            .number("(ddd)(dd.d+),")             // longitude
            .expression("([NS])")
            .number("(dd)(dd.d+),")              // latitude
            .expression("[^,]*,")                // command
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .number("(d+),")                     // gsm
            .number("(d+),")                     // event
            .number("(d+)-")                     // adc
            .number("(d+),")                     // battery
            .number("d+,")                       // impulses
            .number("(d+),")                     // input
            .number("(d+)")                      // status
            .any()
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ecnecnlx1dzc0h.R.inc(18601);

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18602);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18603);if ((((!parser.matches())&&(__CLR4_5_2ecnecnlx1dzc0h.R.iget(18604)!=0|true))||(__CLR4_5_2ecnecnlx1dzc0h.R.iget(18605)==0&false))) {{
            __CLR4_5_2ecnecnlx1dzc0h.R.inc(18606);return null;
        }

        }__CLR4_5_2ecnecnlx1dzc0h.R.inc(18607);Position position = new Position();
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18608);position.setProtocol(getProtocolName());

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18609);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18610);if ((((deviceSession == null)&&(__CLR4_5_2ecnecnlx1dzc0h.R.iget(18611)!=0|true))||(__CLR4_5_2ecnecnlx1dzc0h.R.iget(18612)==0&false))) {{
            __CLR4_5_2ecnecnlx1dzc0h.R.inc(18613);return null;
        }
        }__CLR4_5_2ecnecnlx1dzc0h.R.inc(18614);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18615);position.setValid(parser.nextInt() == 1);

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18616);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18617);position.setTime(dateBuilder.getDate());

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18618);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18619);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18620);position.setSpeed(parser.nextDouble());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18621);position.setCourse(parser.nextDouble());

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18622);position.set(Position.KEY_RSSI, parser.next());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18623);position.set(Position.KEY_EVENT, parser.nextInt());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18624);position.set(Position.PREFIX_ADC + 1, parser.nextInt());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18625);position.set(Position.KEY_BATTERY, parser.nextInt());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18626);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18627);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2ecnecnlx1dzc0h.R.inc(18628);return position;
    }finally{__CLR4_5_2ecnecnlx1dzc0h.R.flushNeeded();}}

}
