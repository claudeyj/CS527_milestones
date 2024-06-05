/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class MegastekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c89c89lwye667m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,16051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MegastekProtocolDecoder(MegastekProtocol protocol) {
        super(protocol);__CLR4_5_2c89c89lwye667m.R.inc(15850);try{__CLR4_5_2c89c89lwye667m.R.inc(15849);
    }finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

    private static final Pattern PATTERN_GPRMC = new PatternBuilder()
            .text("$GPRMC,")
            .number("(dd)(dd)(dd).(ddd),")       // time (hhmmss.sss)
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .any()                               // checksum
            .compile();

    private static final Pattern PATTERN_SIMPLE = new PatternBuilder()
            .expression("[FL],")                 // flag
            .expression("([^,]*),")              // alarm
            .number("imei:(d+),")                // imei
            .number("(d+/?d*)?,")                // satellites
            .number("(d+.d+)?,")                 // altitude
            .number("Battery=(d+)%,,?")          // battery
            .number("(d)?,")                     // charger
            .number("(d+)?,")                    // mcc
            .number("(d+)?,")                    // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx);")                   // cid
            .any()                               // checksum
            .compile();

    private static final Pattern PATTERN_ALTERNATIVE = new PatternBuilder()
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx),")                   // cid
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // battery
            .number("(d+),")                     // flags
            .number("(d+),")                     // inputs
            .number("(?:(d+),)?")                // outputs
            .number("(d.?d*),")                  // adc 1
            .groupBegin()
            .number("(d.dd),")                   // adc 2
            .number("(d.dd),")                   // adc 3
            .groupEnd("?")
            .expression("([^;]+);")              // alarm
            .any()                               // checksum
            .compile();

    private boolean parseLocation(String location, Position position) {try{__CLR4_5_2c89c89lwye667m.R.inc(15851);

        __CLR4_5_2c89c89lwye667m.R.inc(15852);Parser parser = new Parser(PATTERN_GPRMC, location);
        __CLR4_5_2c89c89lwye667m.R.inc(15853);if ((((!parser.matches())&&(__CLR4_5_2c89c89lwye667m.R.iget(15854)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15855)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15856);return false;
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15857);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2c89c89lwye667m.R.inc(15858);position.setValid(parser.next().equals("A"));
        __CLR4_5_2c89c89lwye667m.R.inc(15859);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2c89c89lwye667m.R.inc(15860);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2c89c89lwye667m.R.inc(15861);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15862);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2c89c89lwye667m.R.inc(15863);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15864);position.setTime(dateBuilder.getDate());

        __CLR4_5_2c89c89lwye667m.R.inc(15865);return true;
    }finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

    private Position decodeOld(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2c89c89lwye667m.R.inc(15866);

        // Detect type
        __CLR4_5_2c89c89lwye667m.R.inc(15867);boolean simple = sentence.charAt(3) == ',' || sentence.charAt(6) == ',';

        // Split message
        __CLR4_5_2c89c89lwye667m.R.inc(15868);String id;
        __CLR4_5_2c89c89lwye667m.R.inc(15869);String location;
        __CLR4_5_2c89c89lwye667m.R.inc(15870);String status;
        __CLR4_5_2c89c89lwye667m.R.inc(15871);if ((((simple)&&(__CLR4_5_2c89c89lwye667m.R.iget(15872)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15873)==0&false))) {{

            __CLR4_5_2c89c89lwye667m.R.inc(15874);int beginIndex = sentence.indexOf(',') + 1;
            __CLR4_5_2c89c89lwye667m.R.inc(15875);int endIndex = sentence.indexOf(',', beginIndex);
            __CLR4_5_2c89c89lwye667m.R.inc(15876);id = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2c89c89lwye667m.R.inc(15877);beginIndex = endIndex + 1;
            __CLR4_5_2c89c89lwye667m.R.inc(15878);endIndex = sentence.indexOf('*', beginIndex);
            __CLR4_5_2c89c89lwye667m.R.inc(15879);if ((((endIndex != -1)&&(__CLR4_5_2c89c89lwye667m.R.iget(15880)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15881)==0&false))) {{
                __CLR4_5_2c89c89lwye667m.R.inc(15882);endIndex += 3;
            } }else {{
                __CLR4_5_2c89c89lwye667m.R.inc(15883);endIndex = sentence.length();
            }
            }__CLR4_5_2c89c89lwye667m.R.inc(15884);location = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2c89c89lwye667m.R.inc(15885);beginIndex = endIndex + 1;
            __CLR4_5_2c89c89lwye667m.R.inc(15886);if ((((beginIndex > sentence.length())&&(__CLR4_5_2c89c89lwye667m.R.iget(15887)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15888)==0&false))) {{
                __CLR4_5_2c89c89lwye667m.R.inc(15889);beginIndex = endIndex;
            }
            }__CLR4_5_2c89c89lwye667m.R.inc(15890);status = sentence.substring(beginIndex);

        } }else {{

            __CLR4_5_2c89c89lwye667m.R.inc(15891);int beginIndex = 3;
            __CLR4_5_2c89c89lwye667m.R.inc(15892);int endIndex = beginIndex + 16;
            __CLR4_5_2c89c89lwye667m.R.inc(15893);id = sentence.substring(beginIndex, endIndex).trim();

            __CLR4_5_2c89c89lwye667m.R.inc(15894);beginIndex = endIndex + 2;
            __CLR4_5_2c89c89lwye667m.R.inc(15895);endIndex = sentence.indexOf('*', beginIndex) + 3;
            __CLR4_5_2c89c89lwye667m.R.inc(15896);location = sentence.substring(beginIndex, endIndex);

            __CLR4_5_2c89c89lwye667m.R.inc(15897);beginIndex = endIndex + 1;
            __CLR4_5_2c89c89lwye667m.R.inc(15898);status = sentence.substring(beginIndex);

        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15899);Position position = new Position();
        __CLR4_5_2c89c89lwye667m.R.inc(15900);position.setProtocol(getProtocolName());
        __CLR4_5_2c89c89lwye667m.R.inc(15901);if ((((!parseLocation(location, position))&&(__CLR4_5_2c89c89lwye667m.R.iget(15902)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15903)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15904);return null;
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15905);if ((((simple)&&(__CLR4_5_2c89c89lwye667m.R.iget(15906)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15907)==0&false))) {{

            __CLR4_5_2c89c89lwye667m.R.inc(15908);Parser parser = new Parser(PATTERN_SIMPLE, status);
            __CLR4_5_2c89c89lwye667m.R.inc(15909);if ((((parser.matches())&&(__CLR4_5_2c89c89lwye667m.R.iget(15910)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15911)==0&false))) {{

                __CLR4_5_2c89c89lwye667m.R.inc(15912);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

                __CLR4_5_2c89c89lwye667m.R.inc(15913);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next(), id);
                __CLR4_5_2c89c89lwye667m.R.inc(15914);if ((((deviceSession == null)&&(__CLR4_5_2c89c89lwye667m.R.iget(15915)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15916)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15917);return null;
                }
                }__CLR4_5_2c89c89lwye667m.R.inc(15918);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2c89c89lwye667m.R.inc(15919);String sat = parser.next();
                __CLR4_5_2c89c89lwye667m.R.inc(15920);if ((((sat.contains("/"))&&(__CLR4_5_2c89c89lwye667m.R.iget(15921)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15922)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15923);position.set(Position.KEY_SATELLITES, Integer.parseInt(sat.split("/")[0]));
                    __CLR4_5_2c89c89lwye667m.R.inc(15924);position.set(Position.KEY_SATELLITES_VISIBLE, Integer.parseInt(sat.split("/")[1]));
                } }else {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15925);position.set(Position.KEY_SATELLITES, Integer.parseInt(sat));
                }

                }__CLR4_5_2c89c89lwye667m.R.inc(15926);position.setAltitude(parser.nextDouble(0));

                __CLR4_5_2c89c89lwye667m.R.inc(15927);position.set(Position.KEY_BATTERY_LEVEL, parser.nextDouble(0));

                __CLR4_5_2c89c89lwye667m.R.inc(15928);String charger = parser.next();
                __CLR4_5_2c89c89lwye667m.R.inc(15929);if ((((charger != null)&&(__CLR4_5_2c89c89lwye667m.R.iget(15930)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15931)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15932);position.set(Position.KEY_CHARGE, Integer.parseInt(charger) == 1);
                }

                }__CLR4_5_2c89c89lwye667m.R.inc(15933);if ((((parser.hasNext(4))&&(__CLR4_5_2c89c89lwye667m.R.iget(15934)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15935)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15936);position.setNetwork(new Network(CellTower.from(
                            parser.nextInt(0), parser.nextInt(0), parser.nextHexInt(0), parser.nextHexInt(0))));
                }

            }} }else {{

                __CLR4_5_2c89c89lwye667m.R.inc(15937);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
                __CLR4_5_2c89c89lwye667m.R.inc(15938);if ((((deviceSession == null)&&(__CLR4_5_2c89c89lwye667m.R.iget(15939)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15940)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15941);return null;
                }
                }__CLR4_5_2c89c89lwye667m.R.inc(15942);position.setDeviceId(deviceSession.getDeviceId());

            }

        }} }else {{

            __CLR4_5_2c89c89lwye667m.R.inc(15943);Parser parser = new Parser(PATTERN_ALTERNATIVE, status);
            __CLR4_5_2c89c89lwye667m.R.inc(15944);if ((((parser.matches())&&(__CLR4_5_2c89c89lwye667m.R.iget(15945)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15946)==0&false))) {{

                __CLR4_5_2c89c89lwye667m.R.inc(15947);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
                __CLR4_5_2c89c89lwye667m.R.inc(15948);if ((((deviceSession == null)&&(__CLR4_5_2c89c89lwye667m.R.iget(15949)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15950)==0&false))) {{
                    __CLR4_5_2c89c89lwye667m.R.inc(15951);return null;
                }
                }__CLR4_5_2c89c89lwye667m.R.inc(15952);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2c89c89lwye667m.R.inc(15953);position.setNetwork(new Network(CellTower.from(parser.nextInt(0), parser.nextInt(0),
                        parser.nextHexInt(0), parser.nextHexInt(0), parser.nextInt(0))));

                __CLR4_5_2c89c89lwye667m.R.inc(15954);position.set(Position.KEY_BATTERY_LEVEL, parser.nextDouble());

                __CLR4_5_2c89c89lwye667m.R.inc(15955);position.set(Position.KEY_FLAGS, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15956);position.set(Position.KEY_INPUT, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15957);position.set(Position.KEY_OUTPUT, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15958);position.set(Position.PREFIX_ADC + 1, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15959);position.set(Position.PREFIX_ADC + 2, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15960);position.set(Position.PREFIX_ADC + 3, parser.next());
                __CLR4_5_2c89c89lwye667m.R.inc(15961);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

            }
        }}

        }__CLR4_5_2c89c89lwye667m.R.inc(15962);return position;
    }finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

    private static final Pattern PATTERN_NEW = new PatternBuilder()
            .number("dddd").optional()
            .text("$MGV")
            .number("ddd,")
            .number("(d+),")                     // imei
            .expression("[^,]*,")                // name
            .expression("([RS]),")
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),([NS]),")       // latitude
            .number("(d+)(dd.d+),([EW]),")       // longitude
            .number("dd,")
            .number("(dd),")                     // satellites
            .number("dd,")
            .number("(d+.d+),")                  // hdop
            .number("(d+.d+)?,")                 // speed
            .number("(d+.d+)?,")                 // course
            .number("(-?d+.d+),")                // altitude
            .number("(d+.d+)?,")                 // odometer
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(xxxx),")                   // lac
            .number("(xxxx),")                   // cid
            .number("(d+)?,")                    // gsm
            .expression("([01]+)?,")             // input
            .expression("([01]+)?,")             // output
            .number("(d+)?,")                    // adc1
            .number("(d+)?,")                    // adc2
            .number("(d+)?,")                    // adc3
            .groupBegin()
            .number("(-?d+.?d*)")                // temperature 1
            .or().text(" ")
            .groupEnd("?").text(",")
            .groupBegin()
            .number("(-?d+.?d*)")                // temperature 2
            .or().text(" ")
            .groupEnd("?").text(",")
            .number("(d+)?,")                    // rfid
            .number("d*,")
            .number("(d+)?,")                    // battery
            .expression("([^,]*);")              // alert
            .any()
            .compile();

    private Position decodeNew(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2c89c89lwye667m.R.inc(15963);

        __CLR4_5_2c89c89lwye667m.R.inc(15964);Parser parser = new Parser(PATTERN_NEW, sentence);
        __CLR4_5_2c89c89lwye667m.R.inc(15965);if ((((!parser.matches())&&(__CLR4_5_2c89c89lwye667m.R.iget(15966)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15967)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15968);return null;
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15969);Position position = new Position();
        __CLR4_5_2c89c89lwye667m.R.inc(15970);position.setProtocol(getProtocolName());

        __CLR4_5_2c89c89lwye667m.R.inc(15971);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2c89c89lwye667m.R.inc(15972);if ((((deviceSession == null)&&(__CLR4_5_2c89c89lwye667m.R.iget(15973)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15974)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15975);return null;
        }
        }__CLR4_5_2c89c89lwye667m.R.inc(15976);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2c89c89lwye667m.R.inc(15977);if ((((parser.next().equals("S"))&&(__CLR4_5_2c89c89lwye667m.R.iget(15978)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15979)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15980);position.set(Position.KEY_ARCHIVE, true);
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15981);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2c89c89lwye667m.R.inc(15982);position.setValid(parser.next().equals("A"));
        __CLR4_5_2c89c89lwye667m.R.inc(15983);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2c89c89lwye667m.R.inc(15984);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2c89c89lwye667m.R.inc(15985);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15986);position.set(Position.KEY_HDOP, parser.nextDouble(0));

        __CLR4_5_2c89c89lwye667m.R.inc(15987);position.setSpeed(parser.nextDouble(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15988);position.setCourse(parser.nextDouble(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15989);position.setAltitude(parser.nextDouble(0));

        __CLR4_5_2c89c89lwye667m.R.inc(15990);if ((((parser.hasNext())&&(__CLR4_5_2c89c89lwye667m.R.iget(15991)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15992)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(15993);position.set(Position.KEY_ODOMETER, parser.nextDouble(0) * 1000);
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(15994);position.setNetwork(new Network(CellTower.from(
                parser.nextInt(0), parser.nextInt(0), parser.nextHexInt(0), parser.nextHexInt(0), parser.nextInt(0))));

        __CLR4_5_2c89c89lwye667m.R.inc(15995);position.set(Position.KEY_INPUT, parser.nextBinInt(0));
        __CLR4_5_2c89c89lwye667m.R.inc(15996);position.set(Position.KEY_OUTPUT, parser.nextBinInt(0));

        __CLR4_5_2c89c89lwye667m.R.inc(15997);for (int i = 1; (((i <= 3)&&(__CLR4_5_2c89c89lwye667m.R.iget(15998)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(15999)==0&false)); i++) {{
            __CLR4_5_2c89c89lwye667m.R.inc(16000);position.set(Position.PREFIX_ADC + i, parser.nextInt(0));
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(16001);for (int i = 1; (((i <= 2)&&(__CLR4_5_2c89c89lwye667m.R.iget(16002)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(16003)==0&false)); i++) {{
            __CLR4_5_2c89c89lwye667m.R.inc(16004);String adc = parser.next();
            __CLR4_5_2c89c89lwye667m.R.inc(16005);if ((((adc != null)&&(__CLR4_5_2c89c89lwye667m.R.iget(16006)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(16007)==0&false))) {{
                __CLR4_5_2c89c89lwye667m.R.inc(16008);position.set(Position.PREFIX_TEMP + i, Double.parseDouble(adc));
            }
        }}

        }__CLR4_5_2c89c89lwye667m.R.inc(16009);position.set(Position.KEY_DRIVER_UNIQUE_ID, parser.next());

        __CLR4_5_2c89c89lwye667m.R.inc(16010);String battery = parser.next();
        __CLR4_5_2c89c89lwye667m.R.inc(16011);if ((((battery != null)&&(__CLR4_5_2c89c89lwye667m.R.iget(16012)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(16013)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(16014);position.set(Position.KEY_BATTERY, Integer.parseInt(battery));
        }

        }__CLR4_5_2c89c89lwye667m.R.inc(16015);position.set(Position.KEY_ALARM, decodeAlarm(parser.next()));

        __CLR4_5_2c89c89lwye667m.R.inc(16016);return position;
    }finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

    private String decodeAlarm(String value) {try{__CLR4_5_2c89c89lwye667m.R.inc(16017);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2c89c89lwye667m.R.inc(16018);switch (value) {
            case "SOS":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16019);__CLB4_5_2_bool0=true;}
            case "Help":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16020);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16021);return Position.ALARM_SOS;
            case "Over Speed":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16022);__CLB4_5_2_bool0=true;}
            case "OverSpeed":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16023);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16024);return Position.ALARM_OVERSPEED;
            case "LowSpeed":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16025);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16026);return Position.ALARM_LOW_SPEED;
            case "Low Battery":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16027);__CLB4_5_2_bool0=true;}
            case "LowBattery":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16028);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16029);return Position.ALARM_LOW_BATTERY;
            case "VIB":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16030);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16031);return Position.ALARM_VIBRATION;
            case "Move in":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16032);__CLB4_5_2_bool0=true;}
            case "Geo in":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16033);__CLB4_5_2_bool0=true;}
            case "Geo1 in":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16034);__CLB4_5_2_bool0=true;}
            case "Geo2 in":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16035);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16036);return Position.ALARM_GEOFENCE_ENTER;
            case "Move out":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16037);__CLB4_5_2_bool0=true;}
            case "Geo out":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16038);__CLB4_5_2_bool0=true;}
            case "Geo1 out":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16039);__CLB4_5_2_bool0=true;}
            case "Geo2 out":if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16040);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16041);return Position.ALARM_GEOFENCE_EXIT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c89c89lwye667m.R.inc(16042);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c89c89lwye667m.R.inc(16043);return null;
        }
    }finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c89c89lwye667m.R.inc(16044);

        __CLR4_5_2c89c89lwye667m.R.inc(16045);String sentence = (String) msg;

        __CLR4_5_2c89c89lwye667m.R.inc(16046);if ((((sentence.contains("$MG"))&&(__CLR4_5_2c89c89lwye667m.R.iget(16047)!=0|true))||(__CLR4_5_2c89c89lwye667m.R.iget(16048)==0&false))) {{
            __CLR4_5_2c89c89lwye667m.R.inc(16049);return decodeNew(channel, remoteAddress, sentence);
        } }else {{
            __CLR4_5_2c89c89lwye667m.R.inc(16050);return decodeOld(channel, remoteAddress, sentence);
        }
    }}finally{__CLR4_5_2c89c89lwye667m.R.flushNeeded();}}

}
