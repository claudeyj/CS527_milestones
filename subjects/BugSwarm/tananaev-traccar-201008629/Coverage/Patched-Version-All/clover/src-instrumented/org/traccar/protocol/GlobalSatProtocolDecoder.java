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

@java.lang.SuppressWarnings({"fallthrough"}) public class GlobalSatProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_288h88hlx1e1km8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,10835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String format0;
    private String format1;

    public GlobalSatProtocolDecoder(GlobalSatProtocol protocol) {
        super(protocol);__CLR4_5_288h88hlx1e1km8.R.inc(10674);try{__CLR4_5_288h88hlx1e1km8.R.inc(10673);

        __CLR4_5_288h88hlx1e1km8.R.inc(10675);format0 = Context.getConfig().getString(getProtocolName() + ".format0", "TSPRXAB27GHKLMnaicz*U!");
        __CLR4_5_288h88hlx1e1km8.R.inc(10676);format1 = Context.getConfig().getString(getProtocolName() + ".format1", "SARY*U!");
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

    public void setFormat0(String format) {try{__CLR4_5_288h88hlx1e1km8.R.inc(10677);
        __CLR4_5_288h88hlx1e1km8.R.inc(10678);format0 = format;
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

    public void setFormat1(String format) {try{__CLR4_5_288h88hlx1e1km8.R.inc(10679);
        __CLR4_5_288h88hlx1e1km8.R.inc(10680);format1 = format;
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

    private Position decodeOriginal(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_288h88hlx1e1km8.R.inc(10681);

        __CLR4_5_288h88hlx1e1km8.R.inc(10682);if ((((channel != null)&&(__CLR4_5_288h88hlx1e1km8.R.iget(10683)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10684)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10685);channel.write("ACK\r");
        }

        }__CLR4_5_288h88hlx1e1km8.R.inc(10686);String format;
        __CLR4_5_288h88hlx1e1km8.R.inc(10687);if ((((sentence.startsWith("GSr"))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10688)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10689)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10690);format = format0;
        } }else {__CLR4_5_288h88hlx1e1km8.R.inc(10691);if ((((sentence.startsWith("GSh"))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10692)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10693)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10694);format = format1;
        } }else {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10695);return null;
        }

        // Check that message contains required parameters
        }}__CLR4_5_288h88hlx1e1km8.R.inc(10696);if ((((!format.contains("B") || !format.contains("S") || !(format.contains("1")
                || format.contains("2") || format.contains("3")) || !(format.contains("6")
                || format.contains("7") || format.contains("8")))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10697)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10698)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10699);return null;
        }

        }__CLR4_5_288h88hlx1e1km8.R.inc(10700);if ((((format.contains("*"))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10701)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10702)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10703);format = format.substring(0, format.indexOf('*'));
            __CLR4_5_288h88hlx1e1km8.R.inc(10704);sentence = sentence.substring(0, sentence.indexOf('*'));
        }
        }__CLR4_5_288h88hlx1e1km8.R.inc(10705);String[] values = sentence.split(",");

        __CLR4_5_288h88hlx1e1km8.R.inc(10706);Position position = new Position();
        __CLR4_5_288h88hlx1e1km8.R.inc(10707);position.setProtocol(getProtocolName());

        __CLR4_5_288h88hlx1e1km8.R.inc(10708);for (int formatIndex = 0, valueIndex = 1; (((formatIndex < format.length()
                && valueIndex < values.length)&&(__CLR4_5_288h88hlx1e1km8.R.iget(10709)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10710)==0&false)); formatIndex++) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10711);String value = values[valueIndex];

            boolean __CLB4_5_2_bool0=false;__CLR4_5_288h88hlx1e1km8.R.inc(10712);switch (format.charAt(formatIndex)) {
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10713);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10714);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, value);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10715);if ((((deviceSession == null)&&(__CLR4_5_288h88hlx1e1km8.R.iget(10716)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10717)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10718);return null;
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10719);position.setDeviceId(deviceSession.getDeviceId());
                    __CLR4_5_288h88hlx1e1km8.R.inc(10720);break;
                case 'A':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10721);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10722);if ((((value.isEmpty())&&(__CLR4_5_288h88hlx1e1km8.R.iget(10723)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10724)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10725);position.setValid(false);
                    } }else {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10726);position.setValid(Integer.parseInt(value) != 1);
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10727);break;
                case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10728);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10729);DateBuilder dateBuilder = new DateBuilder()
                            .setDay(Integer.parseInt(value.substring(0, 2)))
                            .setMonth(Integer.parseInt(value.substring(2, 4)))
                            .setYear(Integer.parseInt(value.substring(4)));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10730);value = values[++valueIndex];
                    __CLR4_5_288h88hlx1e1km8.R.inc(10731);dateBuilder
                            .setHour(Integer.parseInt(value.substring(0, 2)))
                            .setMinute(Integer.parseInt(value.substring(2, 4)))
                            .setSecond(Integer.parseInt(value.substring(4)));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10732);position.setTime(dateBuilder.getDate());
                    __CLR4_5_288h88hlx1e1km8.R.inc(10733);break;
                case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10734);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10735);valueIndex += 1;
                    __CLR4_5_288h88hlx1e1km8.R.inc(10736);break;
                case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10737);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10738);double longitude = Double.parseDouble(value.substring(1));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10739);if ((((value.charAt(0) == 'W')&&(__CLR4_5_288h88hlx1e1km8.R.iget(10740)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10741)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10742);longitude = -longitude;
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10743);position.setLongitude(longitude);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10744);break;
                case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10745);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10746);longitude = Double.parseDouble(value.substring(4)) / 60;
                    __CLR4_5_288h88hlx1e1km8.R.inc(10747);longitude += Integer.parseInt(value.substring(1, 4));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10748);if ((((value.charAt(0) == 'W')&&(__CLR4_5_288h88hlx1e1km8.R.iget(10749)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10750)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10751);longitude = -longitude;
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10752);position.setLongitude(longitude);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10753);break;
                case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10754);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10755);position.setLongitude(Double.parseDouble(value) * 0.000001);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10756);break;
                case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10757);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10758);double latitude = Double.parseDouble(value.substring(1));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10759);if ((((value.charAt(0) == 'S')&&(__CLR4_5_288h88hlx1e1km8.R.iget(10760)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10761)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10762);latitude = -latitude;
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10763);position.setLatitude(latitude);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10764);break;
                case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10765);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10766);latitude = Double.parseDouble(value.substring(3)) / 60;
                    __CLR4_5_288h88hlx1e1km8.R.inc(10767);latitude += Integer.parseInt(value.substring(1, 3));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10768);if ((((value.charAt(0) == 'S')&&(__CLR4_5_288h88hlx1e1km8.R.iget(10769)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10770)==0&false))) {{
                        __CLR4_5_288h88hlx1e1km8.R.inc(10771);latitude = -latitude;
                    }
                    }__CLR4_5_288h88hlx1e1km8.R.inc(10772);position.setLatitude(latitude);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10773);break;
                case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10774);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10775);position.setLatitude(Double.parseDouble(value) * 0.000001);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10776);break;
                case 'G':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10777);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10778);position.setAltitude(Double.parseDouble(value));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10779);break;
                case 'H':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10780);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10781);position.setSpeed(Double.parseDouble(value));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10782);break;
                case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10783);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10784);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(value)));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10785);break;
                case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10786);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10787);position.setSpeed(UnitsConverter.knotsFromMph(Double.parseDouble(value)));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10788);break;
                case 'K':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10789);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10790);position.setCourse(Double.parseDouble(value));
                    __CLR4_5_288h88hlx1e1km8.R.inc(10791);break;
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10792);__CLB4_5_2_bool0=true;}
                    __CLR4_5_288h88hlx1e1km8.R.inc(10793);position.set(Position.KEY_BATTERY, value);
                    __CLR4_5_288h88hlx1e1km8.R.inc(10794);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_288h88hlx1e1km8.R.inc(10795);__CLB4_5_2_bool0=true;}
                    // Unsupported
                    __CLR4_5_288h88hlx1e1km8.R.inc(10796);break;
            }

            __CLR4_5_288h88hlx1e1km8.R.inc(10797);valueIndex += 1;
        }
        }__CLR4_5_288h88hlx1e1km8.R.inc(10798);return position;
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

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

    private Position decodeAlternative(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_288h88hlx1e1km8.R.inc(10799);

        __CLR4_5_288h88hlx1e1km8.R.inc(10800);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_288h88hlx1e1km8.R.inc(10801);if ((((!parser.matches())&&(__CLR4_5_288h88hlx1e1km8.R.iget(10802)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10803)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10804);return null;
        }

        }__CLR4_5_288h88hlx1e1km8.R.inc(10805);Position position = new Position();
        __CLR4_5_288h88hlx1e1km8.R.inc(10806);position.setProtocol(getProtocolName());

        __CLR4_5_288h88hlx1e1km8.R.inc(10807);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_288h88hlx1e1km8.R.inc(10808);if ((((deviceSession == null)&&(__CLR4_5_288h88hlx1e1km8.R.iget(10809)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10810)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10811);return null;
        }
        }__CLR4_5_288h88hlx1e1km8.R.inc(10812);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_288h88hlx1e1km8.R.inc(10813);position.setValid(!parser.next().equals("1"));

        __CLR4_5_288h88hlx1e1km8.R.inc(10814);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_288h88hlx1e1km8.R.inc(10815);position.setTime(dateBuilder.getDate());

        __CLR4_5_288h88hlx1e1km8.R.inc(10816);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_288h88hlx1e1km8.R.inc(10817);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG_MIN));
        __CLR4_5_288h88hlx1e1km8.R.inc(10818);position.setAltitude(parser.nextDouble());
        __CLR4_5_288h88hlx1e1km8.R.inc(10819);position.setSpeed(parser.nextDouble());
        __CLR4_5_288h88hlx1e1km8.R.inc(10820);position.setCourse(parser.nextDouble());

        __CLR4_5_288h88hlx1e1km8.R.inc(10821);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_288h88hlx1e1km8.R.inc(10822);position.set(Position.KEY_HDOP, parser.next());

        __CLR4_5_288h88hlx1e1km8.R.inc(10823);return position;
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_288h88hlx1e1km8.R.inc(10824);

        __CLR4_5_288h88hlx1e1km8.R.inc(10825);String sentence = (String) msg;

        __CLR4_5_288h88hlx1e1km8.R.inc(10826);if ((((sentence.startsWith("GS"))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10827)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10828)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10829);return decodeOriginal(channel, remoteAddress, sentence);
        } }else {__CLR4_5_288h88hlx1e1km8.R.inc(10830);if ((((sentence.startsWith("$"))&&(__CLR4_5_288h88hlx1e1km8.R.iget(10831)!=0|true))||(__CLR4_5_288h88hlx1e1km8.R.iget(10832)==0&false))) {{
            __CLR4_5_288h88hlx1e1km8.R.inc(10833);return decodeAlternative(channel, remoteAddress, sentence);
        }

        }}__CLR4_5_288h88hlx1e1km8.R.inc(10834);return null;
    }finally{__CLR4_5_288h88hlx1e1km8.R.flushNeeded();}}

}
