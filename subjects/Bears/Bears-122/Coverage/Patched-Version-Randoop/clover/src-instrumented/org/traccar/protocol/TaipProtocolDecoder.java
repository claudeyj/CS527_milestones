/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.DateUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TaipProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fjxfjxlwye670c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,20315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TaipProtocolDecoder(TaipProtocol protocol) {
        super(protocol);__CLR4_5_2fjxfjxlwye670c.R.inc(20158);try{__CLR4_5_2fjxfjxlwye670c.R.inc(20157);
    }finally{__CLR4_5_2fjxfjxlwye670c.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .groupBegin()
            .expression("R[EP]V")                // type
            .groupBegin()
            .number("(dd)")                      // event
            .number("(dddd)")                    // week
            .number("(d)")                       // day
            .groupEnd("?")
            .number("(d{5})")                    // seconds
            .or()
            .expression("(?:RGP|RCQ|RBR)")       // type
            .number("(dd)?")                     // event
            .number("(dd)(dd)(dd)")              // date (mmddyy)
            .number("(dd)(dd)(dd)")              // time (hhmmss)
            .groupEnd()
            .groupBegin()
            .number("([-+]dd)(d{5})")            // latitude
            .number("([-+]ddd)(d{5})")           // longitude
            .or()
            .number("([-+])(dd)(dd.dddd)")       // latitude
            .number("([-+])(ddd)(dd.dddd)")      // longitude
            .groupEnd()
            .number("(ddd)")                     // speed
            .number("(ddd)")                     // course
            .groupBegin()
            .number("(xx)")                      // input
            .number("(xx)")                      // satellites
            .number("(ddd)")                     // battery
            .number("(x{8})")                    // odometer
            .number("[01]")                      // gps power
            .groupEnd("?")
            .number("(d)")                       // fix mode
            .any()
            .compile();

    private Date getTime(long week, long day, long seconds) {try{__CLR4_5_2fjxfjxlwye670c.R.inc(20159);
        __CLR4_5_2fjxfjxlwye670c.R.inc(20160);DateBuilder dateBuilder = new DateBuilder()
                .setDate(1980, 1, 6)
                .addMillis(((week * 7 + day) * 24 * 60 * 60 + seconds) * 1000);
        __CLR4_5_2fjxfjxlwye670c.R.inc(20161);return dateBuilder.getDate();
    }finally{__CLR4_5_2fjxfjxlwye670c.R.flushNeeded();}}

    private Date getTime(long seconds) {try{__CLR4_5_2fjxfjxlwye670c.R.inc(20162);
        __CLR4_5_2fjxfjxlwye670c.R.inc(20163);DateBuilder dateBuilder = new DateBuilder(new Date())
                .setTime(0, 0, 0, 0)
                .addMillis(seconds * 1000);
        __CLR4_5_2fjxfjxlwye670c.R.inc(20164);return DateUtil.correctDay(dateBuilder.getDate());
    }finally{__CLR4_5_2fjxfjxlwye670c.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fjxfjxlwye670c.R.inc(20165);

        __CLR4_5_2fjxfjxlwye670c.R.inc(20166);String sentence = (String) msg;

        __CLR4_5_2fjxfjxlwye670c.R.inc(20167);int beginIndex = sentence.indexOf('>');
        __CLR4_5_2fjxfjxlwye670c.R.inc(20168);if ((((beginIndex != -1)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20169)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20170)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20171);sentence = sentence.substring(beginIndex + 1);
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20172);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2fjxfjxlwye670c.R.inc(20173);if ((((!parser.matches())&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20174)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20175)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20176);return null;
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20177);Position position = new Position();
        __CLR4_5_2fjxfjxlwye670c.R.inc(20178);position.setProtocol(getProtocolName());

        __CLR4_5_2fjxfjxlwye670c.R.inc(20179);Integer event = null;

        __CLR4_5_2fjxfjxlwye670c.R.inc(20180);if ((((parser.hasNext(3))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20181)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20182)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20183);event = parser.nextInt();
            __CLR4_5_2fjxfjxlwye670c.R.inc(20184);position.setTime(getTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0)));
        } }else {__CLR4_5_2fjxfjxlwye670c.R.inc(20185);if ((((parser.hasNext())&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20186)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20187)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20188);position.setTime(getTime(parser.nextInt(0)));
        }

        }}__CLR4_5_2fjxfjxlwye670c.R.inc(20189);if ((((parser.hasNext())&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20190)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20191)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20192);event = parser.nextInt();
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20193);if ((((event != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20194)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20195)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2fjxfjxlwye670c.R.inc(20196);switch (event) {
                case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20197);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20198);position.set(Position.KEY_ALARM, Position.ALARM_ACCELERATION);
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20199);break;
                case 23:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20200);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20201);position.set(Position.KEY_ALARM, Position.ALARM_BREAKING);
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20202);break;
                case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20203);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20204);position.set(Position.KEY_ALARM, Position.ALARM_ACCIDENT);
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20205);break;
                case 26:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20206);__CLB4_5_2_bool0=true;}
                case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20207);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20208);position.set(Position.KEY_ALARM, Position.ALARM_CORNERING);
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20209);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fjxfjxlwye670c.R.inc(20210);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20211);position.set(Position.KEY_EVENT, event);
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20212);break;
            }
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20213);if ((((parser.hasNext(6))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20214)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20215)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20216);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20217);if ((((parser.hasNext(4))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20218)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20219)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20220);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_DEG));
            __CLR4_5_2fjxfjxlwye670c.R.inc(20221);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_DEG));
        }
        }__CLR4_5_2fjxfjxlwye670c.R.inc(20222);if ((((parser.hasNext(6))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20223)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20224)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20225);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
            __CLR4_5_2fjxfjxlwye670c.R.inc(20226);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20227);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble(0)));
        __CLR4_5_2fjxfjxlwye670c.R.inc(20228);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2fjxfjxlwye670c.R.inc(20229);if ((((parser.hasNext(4))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20230)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20231)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20232);position.set(Position.KEY_INPUT, parser.nextHexInt(0));
            __CLR4_5_2fjxfjxlwye670c.R.inc(20233);position.set(Position.KEY_SATELLITES, parser.nextHexInt(0));
            __CLR4_5_2fjxfjxlwye670c.R.inc(20234);position.set(Position.KEY_BATTERY, parser.nextInt(0));
            __CLR4_5_2fjxfjxlwye670c.R.inc(20235);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20236);position.setValid(parser.nextInt(0) != 0);

        __CLR4_5_2fjxfjxlwye670c.R.inc(20237);String[] attributes = null;
        __CLR4_5_2fjxfjxlwye670c.R.inc(20238);beginIndex = sentence.indexOf(';');
        __CLR4_5_2fjxfjxlwye670c.R.inc(20239);if ((((beginIndex != -1)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20240)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20241)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20242);int endIndex = sentence.indexOf('<', beginIndex);
            __CLR4_5_2fjxfjxlwye670c.R.inc(20243);if ((((endIndex == -1)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20244)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20245)==0&false))) {{
                __CLR4_5_2fjxfjxlwye670c.R.inc(20246);endIndex = sentence.length();
            }
            }__CLR4_5_2fjxfjxlwye670c.R.inc(20247);attributes = sentence.substring(beginIndex, endIndex).split(";");
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20248);return decodeAttributes(channel, remoteAddress, position, attributes);
    }finally{__CLR4_5_2fjxfjxlwye670c.R.flushNeeded();}}

    private Position decodeAttributes(
            Channel channel, SocketAddress remoteAddress, Position position, String[] attributes) {try{__CLR4_5_2fjxfjxlwye670c.R.inc(20249);

        __CLR4_5_2fjxfjxlwye670c.R.inc(20250);String uniqueId = null;
        __CLR4_5_2fjxfjxlwye670c.R.inc(20251);DeviceSession deviceSession = null;
        __CLR4_5_2fjxfjxlwye670c.R.inc(20252);String messageIndex = null;

        __CLR4_5_2fjxfjxlwye670c.R.inc(20253);if ((((attributes != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20254)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20255)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20256);for (String attribute : attributes) {{
                __CLR4_5_2fjxfjxlwye670c.R.inc(20257);int index = attribute.indexOf('=');
                __CLR4_5_2fjxfjxlwye670c.R.inc(20258);if ((((index != -1)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20259)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20260)==0&false))) {{
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20261);String key = attribute.substring(0, index).toLowerCase();
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20262);String value = attribute.substring(index + 1);
                    boolean __CLB4_5_2_bool1=false;__CLR4_5_2fjxfjxlwye670c.R.inc(20263);switch (key) {
                        case "id":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20264);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20265);uniqueId = value;
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20266);deviceSession = getDeviceSession(channel, remoteAddress, value);
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20267);if ((((deviceSession != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20268)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20269)==0&false))) {{
                                __CLR4_5_2fjxfjxlwye670c.R.inc(20270);position.setDeviceId(deviceSession.getDeviceId());
                            }
                            }__CLR4_5_2fjxfjxlwye670c.R.inc(20271);break;
                        case "io":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20272);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20273);position.set(Position.KEY_IGNITION, BitUtil.check(value.charAt(0) - '0', 0));
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20274);position.set(Position.KEY_CHARGE, BitUtil.check(value.charAt(0) - '0', 1));
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20275);position.set(Position.KEY_OUTPUT, value.charAt(1) - '0');
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20276);position.set(Position.KEY_INPUT, value.charAt(2) - '0');
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20277);break;
                        case "ix":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20278);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20279);position.set(Position.PREFIX_IO + 1, value);
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20280);break;
                        case "ad":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20281);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20282);position.set(Position.PREFIX_ADC + 1, Integer.parseInt(value));
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20283);break;
                        case "sv":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20284);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20285);position.set(Position.KEY_SATELLITES, Integer.parseInt(value));
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20286);break;
                        case "bl":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20287);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20288);position.set(Position.KEY_BATTERY, Integer.parseInt(value) * 0.001);
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20289);break;
                        case "vo":if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20290);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20291);position.set(Position.KEY_ODOMETER, Long.parseLong(value));
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20292);break;
                        default:if (!__CLB4_5_2_bool1) {__CLR4_5_2fjxfjxlwye670c.R.inc(20293);__CLB4_5_2_bool1=true;}
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20294);position.set(key, value);
                            __CLR4_5_2fjxfjxlwye670c.R.inc(20295);break;
                    }
                } }else {__CLR4_5_2fjxfjxlwye670c.R.inc(20296);if ((((attribute.startsWith("#"))&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20297)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20298)==0&false))) {{
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20299);messageIndex = attribute;
                }
            }}}
        }}

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20300);if ((((deviceSession != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20301)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20302)==0&false))) {{
            __CLR4_5_2fjxfjxlwye670c.R.inc(20303);if ((((channel != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20304)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20305)==0&false))) {{
                __CLR4_5_2fjxfjxlwye670c.R.inc(20306);if ((((messageIndex != null)&&(__CLR4_5_2fjxfjxlwye670c.R.iget(20307)!=0|true))||(__CLR4_5_2fjxfjxlwye670c.R.iget(20308)==0&false))) {{
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20309);String response = ">ACK;" + messageIndex + ";ID=" + uniqueId + ";*";
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20310);response += String.format("%02X", Checksum.xor(response)) + "<";
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20311);channel.write(response, remoteAddress);
                } }else {{
                    __CLR4_5_2fjxfjxlwye670c.R.inc(20312);channel.write(uniqueId, remoteAddress);
                }
            }}

            }__CLR4_5_2fjxfjxlwye670c.R.inc(20313);return position;
        }

        }__CLR4_5_2fjxfjxlwye670c.R.inc(20314);return null;
    }finally{__CLR4_5_2fjxfjxlwye670c.R.flushNeeded();}}

}
