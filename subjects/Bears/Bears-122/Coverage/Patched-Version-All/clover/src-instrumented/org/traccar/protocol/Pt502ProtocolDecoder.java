/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2012 Luis Parada (luis.parada@gmail.com)
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

@java.lang.SuppressWarnings({"fallthrough"}) public class Pt502ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ehiehilwye7gq9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,18841,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int MAX_CHUNK_SIZE = 960;

    private byte[] photo;

    public Pt502ProtocolDecoder(Pt502Protocol protocol) {
        super(protocol);__CLR4_5_2ehiehilwye7gq9.R.inc(18775);try{__CLR4_5_2ehiehilwye7gq9.R.inc(18774);
    }finally{__CLR4_5_2ehiehilwye7gq9.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .any().text("$")
            .expression("([^,]+),")              // type
            .number("(d+),")                     // id
            .number("(dd)(dd)(dd).(ddd),")       // time (hhmmss.sss)
            .expression("([AV]),")               // validity
            .number("(d+)(dd.dddd),")            // latitude
            .expression("([NS]),")
            .number("(d+)(dd.dddd),")            // longitude
            .expression("([EW]),")
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(dd)(dd)(dd),,,")           // date (ddmmyy)
            .expression("./")
            .expression("([01])+,")              // input
            .expression("([01])+/")              // output
            .expression("([^/]+)?/")             // adc
            .number("(d+)")                      // odometer
            .expression("/([^/]+)?/")            // rfid
            .number("(xxx)").optional(2)         // state
            .any()
            .compile();

    private String decodeAlarm(String value) {try{__CLR4_5_2ehiehilwye7gq9.R.inc(18776);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ehiehilwye7gq9.R.inc(18777);switch (value) {
            case "TOW":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18778);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18779);return Position.ALARM_TOW;
            case "HDA":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18780);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18781);return Position.ALARM_ACCELERATION;
            case "HDB":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18782);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18783);return Position.ALARM_BREAKING;
            case "FDA":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18784);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18785);return Position.ALARM_FATIGUE_DRIVING;
            case "SKA":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18786);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18787);return Position.ALARM_VIBRATION;
            case "PMA":if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18788);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18789);return Position.ALARM_MOVEMENT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ehiehilwye7gq9.R.inc(18790);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ehiehilwye7gq9.R.inc(18791);return null;
        }
    }finally{__CLR4_5_2ehiehilwye7gq9.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ehiehilwye7gq9.R.inc(18792);

        __CLR4_5_2ehiehilwye7gq9.R.inc(18793);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2ehiehilwye7gq9.R.inc(18794);if ((((!parser.matches())&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18795)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18796)==0&false))) {{
            __CLR4_5_2ehiehilwye7gq9.R.inc(18797);return null;
        }

        }__CLR4_5_2ehiehilwye7gq9.R.inc(18798);Position position = new Position();
        __CLR4_5_2ehiehilwye7gq9.R.inc(18799);position.setProtocol(getProtocolName());

        __CLR4_5_2ehiehilwye7gq9.R.inc(18800);String type = parser.next();

        __CLR4_5_2ehiehilwye7gq9.R.inc(18801);if ((((type.startsWith("PHO") && channel != null)&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18802)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18803)==0&false))) {{
            __CLR4_5_2ehiehilwye7gq9.R.inc(18804);photo = new byte[Integer.parseInt(type.substring(3))];
            __CLR4_5_2ehiehilwye7gq9.R.inc(18805);channel.write("#PHD0," + Math.min(photo.length, MAX_CHUNK_SIZE) + "\r\n");
        }

        }__CLR4_5_2ehiehilwye7gq9.R.inc(18806);position.set(Position.KEY_ALARM, decodeAlarm(type));

        __CLR4_5_2ehiehilwye7gq9.R.inc(18807);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2ehiehilwye7gq9.R.inc(18808);if ((((deviceSession == null)&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18809)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18810)==0&false))) {{
            __CLR4_5_2ehiehilwye7gq9.R.inc(18811);return null;
        }
        }__CLR4_5_2ehiehilwye7gq9.R.inc(18812);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ehiehilwye7gq9.R.inc(18813);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2ehiehilwye7gq9.R.inc(18814);position.setValid(parser.next().equals("A"));
        __CLR4_5_2ehiehilwye7gq9.R.inc(18815);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2ehiehilwye7gq9.R.inc(18816);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2ehiehilwye7gq9.R.inc(18817);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2ehiehilwye7gq9.R.inc(18818);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2ehiehilwye7gq9.R.inc(18819);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2ehiehilwye7gq9.R.inc(18820);position.setTime(dateBuilder.getDate());

        __CLR4_5_2ehiehilwye7gq9.R.inc(18821);position.set(Position.KEY_INPUT, parser.next());
        __CLR4_5_2ehiehilwye7gq9.R.inc(18822);position.set(Position.KEY_OUTPUT, parser.next());

        __CLR4_5_2ehiehilwye7gq9.R.inc(18823);if ((((parser.hasNext())&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18824)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18825)==0&false))) {{
            __CLR4_5_2ehiehilwye7gq9.R.inc(18826);String[] values = parser.next().split(",");
            __CLR4_5_2ehiehilwye7gq9.R.inc(18827);for (int i = 0; (((i < values.length)&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18828)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18829)==0&false)); i++) {{
                __CLR4_5_2ehiehilwye7gq9.R.inc(18830);position.set(Position.PREFIX_ADC + (i + 1), Integer.parseInt(values[i], 16));
            }
        }}

        }__CLR4_5_2ehiehilwye7gq9.R.inc(18831);position.set(Position.KEY_ODOMETER, parser.nextInt(0));
        __CLR4_5_2ehiehilwye7gq9.R.inc(18832);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());

        __CLR4_5_2ehiehilwye7gq9.R.inc(18833);if ((((parser.hasNext())&&(__CLR4_5_2ehiehilwye7gq9.R.iget(18834)!=0|true))||(__CLR4_5_2ehiehilwye7gq9.R.iget(18835)==0&false))) {{
            __CLR4_5_2ehiehilwye7gq9.R.inc(18836);int value = parser.nextHexInt(0);
            __CLR4_5_2ehiehilwye7gq9.R.inc(18837);position.set(Position.KEY_BATTERY, value >> 8);
            __CLR4_5_2ehiehilwye7gq9.R.inc(18838);position.set(Position.KEY_RSSI, (value >> 4) & 0xf);
            __CLR4_5_2ehiehilwye7gq9.R.inc(18839);position.set(Position.KEY_SATELLITES, value & 0xf);
        }

        }__CLR4_5_2ehiehilwye7gq9.R.inc(18840);return position;
    }finally{__CLR4_5_2ehiehilwye7gq9.R.flushNeeded();}}

}
