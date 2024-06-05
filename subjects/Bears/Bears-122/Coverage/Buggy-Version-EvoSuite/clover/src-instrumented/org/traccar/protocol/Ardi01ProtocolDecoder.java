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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

public class Ardi01ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26bc6bclwydwbun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,8213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Ardi01ProtocolDecoder(Ardi01Protocol protocol) {
        super(protocol);__CLR4_5_26bc6bclwydwbun.R.inc(8185);try{__CLR4_5_26bc6bclwydwbun.R.inc(8184);
    }finally{__CLR4_5_26bc6bclwydwbun.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(d+),")                     // imei
            .number("(dddd)(dd)(dd)")            // date (yyyymmdd)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(-?d+.d+),")                // longitude
            .number("(-?d+.d+),")                // latitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*),")                 // course
            .number("(-?d+.?d*),")               // altitude
            .number("(d+),")                     // satellites
            .number("(d+),")                     // event
            .number("(d+),")                     // battery
            .number("(-?d+)")                    // temperature
            .compile();

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26bc6bclwydwbun.R.inc(8186);

        __CLR4_5_26bc6bclwydwbun.R.inc(8187);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_26bc6bclwydwbun.R.inc(8188);if ((((!parser.matches())&&(__CLR4_5_26bc6bclwydwbun.R.iget(8189)!=0|true))||(__CLR4_5_26bc6bclwydwbun.R.iget(8190)==0&false))) {{
            __CLR4_5_26bc6bclwydwbun.R.inc(8191);return null;
        }

        }__CLR4_5_26bc6bclwydwbun.R.inc(8192);Position position = new Position();
        __CLR4_5_26bc6bclwydwbun.R.inc(8193);position.setProtocol(getProtocolName());

        __CLR4_5_26bc6bclwydwbun.R.inc(8194);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_26bc6bclwydwbun.R.inc(8195);if ((((deviceSession == null)&&(__CLR4_5_26bc6bclwydwbun.R.iget(8196)!=0|true))||(__CLR4_5_26bc6bclwydwbun.R.iget(8197)==0&false))) {{
            __CLR4_5_26bc6bclwydwbun.R.inc(8198);return null;
        }
        }__CLR4_5_26bc6bclwydwbun.R.inc(8199);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_26bc6bclwydwbun.R.inc(8200);position.setTime(parser.nextDateTime());

        __CLR4_5_26bc6bclwydwbun.R.inc(8201);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_26bc6bclwydwbun.R.inc(8202);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_26bc6bclwydwbun.R.inc(8203);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_26bc6bclwydwbun.R.inc(8204);position.setCourse(parser.nextDouble(0));
        __CLR4_5_26bc6bclwydwbun.R.inc(8205);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_26bc6bclwydwbun.R.inc(8206);int satellites = parser.nextInt(0);
        __CLR4_5_26bc6bclwydwbun.R.inc(8207);position.setValid(satellites >= 3);
        __CLR4_5_26bc6bclwydwbun.R.inc(8208);position.set(Position.KEY_SATELLITES, satellites);

        __CLR4_5_26bc6bclwydwbun.R.inc(8209);position.set(Position.KEY_EVENT, parser.next());
        __CLR4_5_26bc6bclwydwbun.R.inc(8210);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt(0));
        __CLR4_5_26bc6bclwydwbun.R.inc(8211);position.set(Position.PREFIX_TEMP + 1, parser.next());

        __CLR4_5_26bc6bclwydwbun.R.inc(8212);return position;
    }finally{__CLR4_5_26bc6bclwydwbun.R.flushNeeded();}}

}
