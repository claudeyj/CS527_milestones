/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class GlobalSatProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29ox9oxlwydwd5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,12726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String format0;
    private String format1;

    public GlobalSatProtocolDecoder(GlobalSatProtocol protocol) {
        super(protocol);__CLR4_5_29ox9oxlwydwd5w.R.inc(12562);try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12561);

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12563);format0 = Context.getConfig().getString(getProtocolName() + ".format0", "TSPRXAB27GHKLMnaicz*U!");
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12564);format1 = Context.getConfig().getString(getProtocolName() + ".format1", "SARY*U!");
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

    public void setFormat0(String format) {try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12565);
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12566);format0 = format;
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

    public void setFormat1(String format) {try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12567);
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12568);format1 = format;
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

    private Position decodeOriginal(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12569);

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12570);if ((((channel != null)&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12571)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12572)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12573);channel.write("ACK\r");
        }

        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12574);String format;
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12575);if ((((sentence.startsWith("GSr"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12576)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12577)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12578);format = format0;
        } }else {__CLR4_5_29ox9oxlwydwd5w.R.inc(12579);if ((((sentence.startsWith("GSh"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12580)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12581)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12582);format = format1;
        } }else {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12583);return null;
        }

        // Check that message contains required parameters
        }}__CLR4_5_29ox9oxlwydwd5w.R.inc(12584);if ((((!format.contains("B") || !format.contains("S") || !(format.contains("1")
                || format.contains("2") || format.contains("3")) || !(format.contains("6")
                || format.contains("7") || format.contains("8")))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12585)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12586)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12587);return null;
        }

        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12588);if ((((format.contains("*"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12589)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12590)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12591);format = format.substring(0, format.indexOf('*'));
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12592);sentence = sentence.substring(0, sentence.indexOf('*'));
        }
        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12593);String[] values = sentence.split(",");

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12594);Position position = new Position();
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12595);position.setProtocol(getProtocolName());

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12596);for (int formatIndex = 0, valueIndex = 1; (((formatIndex < format.length()
                && valueIndex < values.length)&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12597)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12598)==0&false)); formatIndex++) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12599);String value = values[valueIndex];

            boolean __CLB4_5_2_bool0=false;__CLR4_5_29ox9oxlwydwd5w.R.inc(12600);switch (format.charAt(formatIndex)) {
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12601);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12602);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, value);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12603);if ((((deviceSession == null)&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12604)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12605)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12606);return null;
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12607);position.setDeviceId(deviceSession.getDeviceId());
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12608);break;
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12609);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12610);if ((((value.isEmpty())&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12611)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12612)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12613);position.setValid(false);
                    } }else {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12614);position.setValid(Integer.parseInt(value) != 1);
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12615);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12616);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12617);DateBuilder dateBuilder = new DateBuilder()
                            .setDay(Integer.parseInt(value.substring(0, 2)))
                            .setMonth(Integer.parseInt(value.substring(2, 4)))
                            .setYear(Integer.parseInt(value.substring(4)));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12618);value = values[++valueIndex];
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12619);dateBuilder
                            .setHour(Integer.parseInt(value.substring(0, 2)))
                            .setMinute(Integer.parseInt(value.substring(2, 4)))
                            .setSecond(Integer.parseInt(value.substring(4)));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12620);position.setTime(dateBuilder.getDate());
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12621);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12622);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12623);valueIndex += 1;
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12624);break;
                case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12625);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12626);double longitude = Double.parseDouble(value.substring(1));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12627);if ((((value.charAt(0) == 'W')&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12628)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12629)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12630);longitude = -longitude;
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12631);position.setLongitude(longitude);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12632);break;
                case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12633);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12634);longitude = Double.parseDouble(value.substring(4)) / 60;
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12635);longitude += Integer.parseInt(value.substring(1, 4));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12636);if ((((value.charAt(0) == 'W')&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12637)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12638)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12639);longitude = -longitude;
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12640);position.setLongitude(longitude);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12641);break;
                case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12642);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12643);position.setLongitude(Double.parseDouble(value) * 0.000001);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12644);break;
                case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12645);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12646);double latitude = Double.parseDouble(value.substring(1));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12647);if ((((value.charAt(0) == 'S')&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12648)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12649)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12650);latitude = -latitude;
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12651);position.setLatitude(latitude);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12652);break;
                case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12653);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12654);latitude = Double.parseDouble(value.substring(3)) / 60;
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12655);latitude += Integer.parseInt(value.substring(1, 3));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12656);if ((((value.charAt(0) == 'S')&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12657)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12658)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12659);latitude = -latitude;
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12660);position.setLatitude(latitude);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12661);break;
                case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12662);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12663);position.setLatitude(Double.parseDouble(value) * 0.000001);
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12664);break;
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12665);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12666);position.setAltitude(Double.parseDouble(value));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12667);break;
                case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12668);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12669);position.setSpeed(Double.parseDouble(value));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12670);break;
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12671);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12672);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(value)));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12673);break;
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12674);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12675);position.setSpeed(UnitsConverter.knotsFromMph(Double.parseDouble(value)));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12676);break;
                case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12677);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12678);position.setCourse(Double.parseDouble(value));
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12679);break;
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12680);__CLB4_5_2_bool0=true;}
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12681);if ((((value.endsWith("mV"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12682)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12683)==0&false))) {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12684);position.set(Position.KEY_BATTERY,
                                Integer.parseInt(value.substring(0, value.length() - 2)) / 1000.0);
                    } }else {{
                        __CLR4_5_29ox9oxlwydwd5w.R.inc(12685);position.set(Position.KEY_BATTERY_LEVEL, Integer.parseInt(value));
                    }
                    }__CLR4_5_29ox9oxlwydwd5w.R.inc(12686);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_29ox9oxlwydwd5w.R.inc(12687);__CLB4_5_2_bool0=true;}
                    // Unsupported
                    __CLR4_5_29ox9oxlwydwd5w.R.inc(12688);break;
            }

            __CLR4_5_29ox9oxlwydwd5w.R.inc(12689);valueIndex += 1;
        }
        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12690);return position;
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$")
            .number("(d+),")                     // imei
            .number("d+,")                       // mode
            .number("(d+),")                     // fix
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .expression("([EW])")
            .number("(ddd)(dd.d+),")             // longitude (dddmm.mmmm)
            .expression("([NS])")
            .number("(dd)(dd.d+),")              // latitude (ddmm.mmmm)
            .number("(d+.?d*),")                 // altitude
            .number("(d+.?d*),")                 // speed
            .number("(d+.?d*)?,")                // course
            .number("(d+)[,*]")                  // satellites
            .number("(d+.?d*)")                  // hdop
            .compile();

    private Position decodeAlternative(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12691);

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12692);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12693);if ((((!parser.matches())&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12694)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12695)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12696);return null;
        }

        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12697);Position position = new Position();
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12698);position.setProtocol(getProtocolName());

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12699);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12700);if ((((deviceSession == null)&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12701)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12702)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12703);return null;
        }
        }__CLR4_5_29ox9oxlwydwd5w.R.inc(12704);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12705);position.setValid(!parser.next().equals("1"));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12706);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12707);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12708);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12709);position.setAltitude(parser.nextDouble(0));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12710);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12711);position.setCourse(parser.nextDouble(0));

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12712);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        __CLR4_5_29ox9oxlwydwd5w.R.inc(12713);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12714);return position;
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29ox9oxlwydwd5w.R.inc(12715);

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12716);String sentence = (String) msg;

        __CLR4_5_29ox9oxlwydwd5w.R.inc(12717);if ((((sentence.startsWith("GS"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12718)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12719)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12720);return decodeOriginal(channel, remoteAddress, sentence);
        } }else {__CLR4_5_29ox9oxlwydwd5w.R.inc(12721);if ((((sentence.startsWith("$"))&&(__CLR4_5_29ox9oxlwydwd5w.R.iget(12722)!=0|true))||(__CLR4_5_29ox9oxlwydwd5w.R.iget(12723)==0&false))) {{
            __CLR4_5_29ox9oxlwydwd5w.R.inc(12724);return decodeAlternative(channel, remoteAddress, sentence);
        }

        }}__CLR4_5_29ox9oxlwydwd5w.R.inc(12725);return null;
    }finally{__CLR4_5_29ox9oxlwydwd5w.R.flushNeeded();}}

}
