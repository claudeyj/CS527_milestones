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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class CguardProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27x77x7lwydyi93{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,10341,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CguardProtocolDecoder(CguardProtocol protocol) {
        super(protocol);__CLR4_5_27x77x7lwydyi93.R.inc(10268);try{__CLR4_5_27x77x7lwydyi93.R.inc(10267);
    }finally{__CLR4_5_27x77x7lwydyi93.R.flushNeeded();}}

    private static final Pattern PATTERN_NV = new PatternBuilder()
            .text("NV:")
            .number("(dd)(dd)(dd) ")             // date (yymmdd)
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .number(":(-?d+.d+)")                // longitude
            .number(":(-?d+.d+)")                // latitude
            .number(":(d+.?d*)")                 // speed
            .number(":(?:NAN|(d+.?d*))")         // accuracy
            .number(":(?:NAN|(d+.?d*))")         // course
            .number(":(?:NAN|(d+.?d*))").optional() // altitude
            .compile();

    private static final Pattern PATTERN_BC = new PatternBuilder()
            .text("BC:")
            .number("(dd)(dd)(dd) ")             // date (yymmdd)
            .number("(dd)(dd)(dd):")             // time (hhmmss)
            .expression("(.+)")                  // data
            .compile();

    private Position decodePosition(DeviceSession deviceSession, String sentence) {try{__CLR4_5_27x77x7lwydyi93.R.inc(10269);

        __CLR4_5_27x77x7lwydyi93.R.inc(10270);Parser parser = new Parser(PATTERN_NV, sentence);
        __CLR4_5_27x77x7lwydyi93.R.inc(10271);if ((((!parser.matches())&&(__CLR4_5_27x77x7lwydyi93.R.iget(10272)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10273)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10274);return null;
        }

        }__CLR4_5_27x77x7lwydyi93.R.inc(10275);Position position = new Position();
        __CLR4_5_27x77x7lwydyi93.R.inc(10276);position.setProtocol(getProtocolName());
        __CLR4_5_27x77x7lwydyi93.R.inc(10277);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27x77x7lwydyi93.R.inc(10278);position.setTime(parser.nextDateTime());

        __CLR4_5_27x77x7lwydyi93.R.inc(10279);position.setValid(true);
        __CLR4_5_27x77x7lwydyi93.R.inc(10280);position.setLatitude(parser.nextDouble(0));
        __CLR4_5_27x77x7lwydyi93.R.inc(10281);position.setLongitude(parser.nextDouble(0));
        __CLR4_5_27x77x7lwydyi93.R.inc(10282);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));

        __CLR4_5_27x77x7lwydyi93.R.inc(10283);position.setAccuracy(parser.nextDouble(0));

        __CLR4_5_27x77x7lwydyi93.R.inc(10284);position.setCourse(parser.nextDouble(0));
        __CLR4_5_27x77x7lwydyi93.R.inc(10285);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_27x77x7lwydyi93.R.inc(10286);return position;
    }finally{__CLR4_5_27x77x7lwydyi93.R.flushNeeded();}}

    private Position decodeStatus(DeviceSession deviceSession, String sentence) {try{__CLR4_5_27x77x7lwydyi93.R.inc(10287);

        __CLR4_5_27x77x7lwydyi93.R.inc(10288);Parser parser = new Parser(PATTERN_BC, sentence);
        __CLR4_5_27x77x7lwydyi93.R.inc(10289);if ((((!parser.matches())&&(__CLR4_5_27x77x7lwydyi93.R.iget(10290)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10291)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10292);return null;
        }

        }__CLR4_5_27x77x7lwydyi93.R.inc(10293);Position position = new Position();
        __CLR4_5_27x77x7lwydyi93.R.inc(10294);position.setProtocol(getProtocolName());
        __CLR4_5_27x77x7lwydyi93.R.inc(10295);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27x77x7lwydyi93.R.inc(10296);getLastLocation(position, parser.nextDateTime());

        __CLR4_5_27x77x7lwydyi93.R.inc(10297);String[] data = parser.next().split(":");
        __CLR4_5_27x77x7lwydyi93.R.inc(10298);for (int i = 0; (((i < data.length / 2)&&(__CLR4_5_27x77x7lwydyi93.R.iget(10299)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10300)==0&false)); i++) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10301);String key = data[i * 2];
            __CLR4_5_27x77x7lwydyi93.R.inc(10302);String value = data[i * 2 + 1];
            boolean __CLB4_5_2_bool0=false;__CLR4_5_27x77x7lwydyi93.R.inc(10303);switch (key) {
                case "CSQ1":if (!__CLB4_5_2_bool0) {__CLR4_5_27x77x7lwydyi93.R.inc(10304);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27x77x7lwydyi93.R.inc(10305);position.set(Position.KEY_RSSI, Integer.parseInt(value));
                    __CLR4_5_27x77x7lwydyi93.R.inc(10306);break;
                case "NSQ1":if (!__CLB4_5_2_bool0) {__CLR4_5_27x77x7lwydyi93.R.inc(10307);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27x77x7lwydyi93.R.inc(10308);position.set(Position.KEY_SATELLITES, Integer.parseInt(value));
                    __CLR4_5_27x77x7lwydyi93.R.inc(10309);break;
                case "BAT1":if (!__CLB4_5_2_bool0) {__CLR4_5_27x77x7lwydyi93.R.inc(10310);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27x77x7lwydyi93.R.inc(10311);position.set(Position.KEY_BATTERY_LEVEL, Integer.parseInt(value));
                    __CLR4_5_27x77x7lwydyi93.R.inc(10312);break;
                case "PWR1":if (!__CLB4_5_2_bool0) {__CLR4_5_27x77x7lwydyi93.R.inc(10313);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27x77x7lwydyi93.R.inc(10314);position.set(Position.KEY_POWER, Double.parseDouble(value));
                    __CLR4_5_27x77x7lwydyi93.R.inc(10315);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_27x77x7lwydyi93.R.inc(10316);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27x77x7lwydyi93.R.inc(10317);position.set(key.toLowerCase(), value);
                    __CLR4_5_27x77x7lwydyi93.R.inc(10318);break;
            }
        }

        }__CLR4_5_27x77x7lwydyi93.R.inc(10319);return position;
    }finally{__CLR4_5_27x77x7lwydyi93.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27x77x7lwydyi93.R.inc(10320);

        __CLR4_5_27x77x7lwydyi93.R.inc(10321);String sentence = (String) msg;

        __CLR4_5_27x77x7lwydyi93.R.inc(10322);if ((((sentence.startsWith("ID:") || sentence.startsWith("IDRO:"))&&(__CLR4_5_27x77x7lwydyi93.R.iget(10323)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10324)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10325);getDeviceSession(channel, remoteAddress, sentence.substring(sentence.indexOf(':') + 1));
            __CLR4_5_27x77x7lwydyi93.R.inc(10326);return null;
        }

        }__CLR4_5_27x77x7lwydyi93.R.inc(10327);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_27x77x7lwydyi93.R.inc(10328);if ((((deviceSession == null)&&(__CLR4_5_27x77x7lwydyi93.R.iget(10329)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10330)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10331);return null;
        }

        }__CLR4_5_27x77x7lwydyi93.R.inc(10332);if ((((sentence.startsWith("NV:"))&&(__CLR4_5_27x77x7lwydyi93.R.iget(10333)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10334)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10335);return decodePosition(deviceSession, sentence);
        } }else {__CLR4_5_27x77x7lwydyi93.R.inc(10336);if ((((sentence.startsWith("BC:"))&&(__CLR4_5_27x77x7lwydyi93.R.iget(10337)!=0|true))||(__CLR4_5_27x77x7lwydyi93.R.iget(10338)==0&false))) {{
            __CLR4_5_27x77x7lwydyi93.R.inc(10339);return decodeStatus(deviceSession, sentence);
        }

        }}__CLR4_5_27x77x7lwydyi93.R.inc(10340);return null;
    }finally{__CLR4_5_27x77x7lwydyi93.R.flushNeeded();}}

}
