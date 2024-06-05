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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class CguardProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_272l72llx1dvd58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,9241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CguardProtocolDecoder(CguardProtocol protocol) {
        super(protocol);__CLR4_5_272l72llx1dvd58.R.inc(9166);try{__CLR4_5_272l72llx1dvd58.R.inc(9165);
    }finally{__CLR4_5_272l72llx1dvd58.R.flushNeeded();}}

    private static final Pattern PATTERN_NV = new PatternBuilder()
            .text("NV:")
            .number("(dd)(dd)(dd) ")             // date
            .number("(dd)(dd)(dd):")             // time
            .number("(-?d+.d+):")                // longitude
            .number("(-?d+.d+):")                // latitude
            .number("(d+.?d*):")                 // speed
            .number("(?:NAN|(d+.?d*)):")         // accuracy
            .number("(?:NAN|(d+.?d*)):")         // course
            .number("(?:NAN|(d+.?d*))")          // altitude
            .compile();

    private static final Pattern PATTERN_BC = new PatternBuilder()
            .text("BC:")
            .number("(dd)(dd)(dd) ")             // date
            .number("(dd)(dd)(dd):")             // time
            .expression("(.+)")                  // data
            .compile();

    private Position decodePosition(DeviceSession deviceSession, String sentence) {try{__CLR4_5_272l72llx1dvd58.R.inc(9167);

        __CLR4_5_272l72llx1dvd58.R.inc(9168);Parser parser = new Parser(PATTERN_NV, sentence);
        __CLR4_5_272l72llx1dvd58.R.inc(9169);if ((((!parser.matches())&&(__CLR4_5_272l72llx1dvd58.R.iget(9170)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9171)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9172);return null;
        }

        }__CLR4_5_272l72llx1dvd58.R.inc(9173);Position position = new Position();
        __CLR4_5_272l72llx1dvd58.R.inc(9174);position.setProtocol(getProtocolName());
        __CLR4_5_272l72llx1dvd58.R.inc(9175);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_272l72llx1dvd58.R.inc(9176);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_272l72llx1dvd58.R.inc(9177);position.setTime(dateBuilder.getDate());

        __CLR4_5_272l72llx1dvd58.R.inc(9178);position.setValid(true);
        __CLR4_5_272l72llx1dvd58.R.inc(9179);position.setLatitude(parser.nextDouble());
        __CLR4_5_272l72llx1dvd58.R.inc(9180);position.setLongitude(parser.nextDouble());
        __CLR4_5_272l72llx1dvd58.R.inc(9181);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));

        __CLR4_5_272l72llx1dvd58.R.inc(9182);position.set(Position.KEY_ACCURACY, parser.nextDouble());

        __CLR4_5_272l72llx1dvd58.R.inc(9183);position.setCourse(parser.nextDouble());
        __CLR4_5_272l72llx1dvd58.R.inc(9184);position.setAltitude(parser.nextDouble());

        __CLR4_5_272l72llx1dvd58.R.inc(9185);return position;
    }finally{__CLR4_5_272l72llx1dvd58.R.flushNeeded();}}

    private Position decodeStatus(DeviceSession deviceSession, String sentence) {try{__CLR4_5_272l72llx1dvd58.R.inc(9186);

        __CLR4_5_272l72llx1dvd58.R.inc(9187);Parser parser = new Parser(PATTERN_BC, sentence);
        __CLR4_5_272l72llx1dvd58.R.inc(9188);if ((((!parser.matches())&&(__CLR4_5_272l72llx1dvd58.R.iget(9189)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9190)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9191);return null;
        }

        }__CLR4_5_272l72llx1dvd58.R.inc(9192);Position position = new Position();
        __CLR4_5_272l72llx1dvd58.R.inc(9193);position.setProtocol(getProtocolName());
        __CLR4_5_272l72llx1dvd58.R.inc(9194);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_272l72llx1dvd58.R.inc(9195);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

        __CLR4_5_272l72llx1dvd58.R.inc(9196);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_272l72llx1dvd58.R.inc(9197);String[] data = parser.next().split(":");
        __CLR4_5_272l72llx1dvd58.R.inc(9198);for (int i = 0; (((i < data.length / 2)&&(__CLR4_5_272l72llx1dvd58.R.iget(9199)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9200)==0&false)); i++) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9201);String key = data[i * 2];
            __CLR4_5_272l72llx1dvd58.R.inc(9202);String value = data[i * 2 + 1];
            boolean __CLB4_5_2_bool0=false;__CLR4_5_272l72llx1dvd58.R.inc(9203);switch (key) {
                case "CSQ1":if (!__CLB4_5_2_bool0) {__CLR4_5_272l72llx1dvd58.R.inc(9204);__CLB4_5_2_bool0=true;}
                    __CLR4_5_272l72llx1dvd58.R.inc(9205);position.set(Position.KEY_RSSI, Integer.parseInt(value));
                    __CLR4_5_272l72llx1dvd58.R.inc(9206);break;
                case "NSQ1":if (!__CLB4_5_2_bool0) {__CLR4_5_272l72llx1dvd58.R.inc(9207);__CLB4_5_2_bool0=true;}
                    __CLR4_5_272l72llx1dvd58.R.inc(9208);position.set(Position.KEY_SATELLITES, Integer.parseInt(value));
                    __CLR4_5_272l72llx1dvd58.R.inc(9209);break;
                case "BAT1":if (!__CLB4_5_2_bool0) {__CLR4_5_272l72llx1dvd58.R.inc(9210);__CLB4_5_2_bool0=true;}
                    __CLR4_5_272l72llx1dvd58.R.inc(9211);position.set(Position.KEY_BATTERY, Integer.parseInt(value) + "%");
                    __CLR4_5_272l72llx1dvd58.R.inc(9212);break;
                case "PWR1":if (!__CLB4_5_2_bool0) {__CLR4_5_272l72llx1dvd58.R.inc(9213);__CLB4_5_2_bool0=true;}
                    __CLR4_5_272l72llx1dvd58.R.inc(9214);position.set(Position.KEY_POWER, Double.parseDouble(value));
                    __CLR4_5_272l72llx1dvd58.R.inc(9215);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_272l72llx1dvd58.R.inc(9216);__CLB4_5_2_bool0=true;}
                    __CLR4_5_272l72llx1dvd58.R.inc(9217);position.set(key.toLowerCase(), value);
                    __CLR4_5_272l72llx1dvd58.R.inc(9218);break;
            }
        }

        }__CLR4_5_272l72llx1dvd58.R.inc(9219);return position;
    }finally{__CLR4_5_272l72llx1dvd58.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_272l72llx1dvd58.R.inc(9220);

        __CLR4_5_272l72llx1dvd58.R.inc(9221);String sentence = (String) msg;

        __CLR4_5_272l72llx1dvd58.R.inc(9222);if ((((sentence.startsWith("ID:") || sentence.startsWith("IDRO:"))&&(__CLR4_5_272l72llx1dvd58.R.iget(9223)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9224)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9225);getDeviceSession(channel, remoteAddress, sentence.substring(sentence.indexOf(':') + 1));
            __CLR4_5_272l72llx1dvd58.R.inc(9226);return null;
        }

        }__CLR4_5_272l72llx1dvd58.R.inc(9227);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_272l72llx1dvd58.R.inc(9228);if ((((deviceSession == null)&&(__CLR4_5_272l72llx1dvd58.R.iget(9229)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9230)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9231);return null;
        }

        }__CLR4_5_272l72llx1dvd58.R.inc(9232);if ((((sentence.startsWith("NV:"))&&(__CLR4_5_272l72llx1dvd58.R.iget(9233)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9234)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9235);return decodePosition(deviceSession, sentence);
        } }else {__CLR4_5_272l72llx1dvd58.R.inc(9236);if ((((sentence.startsWith("BC:"))&&(__CLR4_5_272l72llx1dvd58.R.iget(9237)!=0|true))||(__CLR4_5_272l72llx1dvd58.R.iget(9238)==0&false))) {{
            __CLR4_5_272l72llx1dvd58.R.inc(9239);return decodeStatus(deviceSession, sentence);
        }

        }}__CLR4_5_272l72llx1dvd58.R.inc(9240);return null;
    }finally{__CLR4_5_272l72llx1dvd58.R.flushNeeded();}}

}
