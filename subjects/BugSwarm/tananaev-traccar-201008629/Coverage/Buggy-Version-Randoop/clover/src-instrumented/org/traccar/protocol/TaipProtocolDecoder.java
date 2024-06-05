/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class TaipProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dh7dh7lx1dwkkb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,17561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean sendResponse;

    public TaipProtocolDecoder(TaipProtocol protocol, boolean sendResponse) {
        super(protocol);__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17468);try{__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17467);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17469);this.sendResponse = sendResponse;
    }finally{__CLR4_5_2dh7dh7lx1dwkkb.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .groupBegin()
            .expression("R[EP]V")                // type
            .groupBegin()
            .number("dd")                        // event index
            .number("(dddd)")                    // week
            .number("(d)")                       // day
            .groupEnd("?")
            .number("(d{5})")                    // seconds
            .or()
            .text("RGP")                         // type
            .number("(dd)(dd)(dd)")              // date
            .number("(dd)(dd)(dd)")              // time
            .groupEnd()
            .number("([-+]dd)(d{5})")            // latitude
            .number("([-+]ddd)(d{5})")           // longitude
            .number("(ddd)")                     // speed
            .number("(ddd)")                     // course
            .number("(d)")                       // fix mode
            .any()
            .compile();

    private Date getTime(long week, long day, long seconds) {try{__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17470);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17471);DateBuilder dateBuilder = new DateBuilder()
                .setDate(1980, 1, 6)
                .addMillis(((week * 7 + day) * 24 * 60 * 60 + seconds) * 1000);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17472);return dateBuilder.getDate();
    }finally{__CLR4_5_2dh7dh7lx1dwkkb.R.flushNeeded();}}

    private Date getTime(long seconds) {try{__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17473);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17474);DateBuilder dateBuilder = new DateBuilder(new Date())
                .setTime(0, 0, 0, 0)
                .addMillis(seconds * 1000);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17475);return DateUtil.correctDay(dateBuilder.getDate());
    }finally{__CLR4_5_2dh7dh7lx1dwkkb.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17476);

        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17477);String sentence = (String) msg;

        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17478);int beginIndex = sentence.indexOf('>');
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17479);if ((((beginIndex != -1)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17480)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17481)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17482);sentence = sentence.substring(beginIndex + 1);
        }

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17483);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17484);if ((((!parser.matches())&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17485)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17486)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17487);return null;
        }

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17488);Position position = new Position();
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17489);position.setProtocol(getProtocolName());

        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17490);String week = parser.next();
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17491);String day = parser.next();
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17492);String seconds = parser.next();
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17493);if ((((seconds != null)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17494)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17495)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17496);if ((((week != null && day != null)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17497)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17498)==0&false))) {{
                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17499);position.setTime(getTime(Integer.parseInt(week), Integer.parseInt(day), Integer.parseInt(seconds)));
            } }else {{
                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17500);position.setTime(getTime(Integer.parseInt(seconds)));
            }
        }}

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17501);if ((((parser.hasNext(6))&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17502)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17503)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17504);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17505);position.setTime(dateBuilder.getDate());
        }

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17506);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_DEG));
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17507);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_DEG));
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17508);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble()));
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17509);position.setCourse(parser.nextDouble());
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17510);position.setValid(parser.nextInt() != 0);

        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17511);String[] attributes = null;
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17512);beginIndex = sentence.indexOf(';');
        __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17513);if ((((beginIndex != -1)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17514)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17515)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17516);int endIndex = sentence.indexOf('<', beginIndex);
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17517);if ((((endIndex == -1)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17518)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17519)==0&false))) {{
                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17520);endIndex = sentence.length();
            }
            }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17521);attributes = sentence.substring(beginIndex, endIndex).split(";");
        }

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17522);if ((((attributes != null)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17523)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17524)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17525);for (String attribute : attributes) {{
                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17526);int index = attribute.indexOf('=');
                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17527);if ((((index != -1)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17528)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17529)==0&false))) {{
                    __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17530);String key = attribute.substring(0, index).toLowerCase();
                    __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17531);String value = attribute.substring(index + 1);
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17532);switch (key) {

                        case "id":if (!__CLB4_5_2_bool0) {__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17533);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17534);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, value);
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17535);if ((((deviceSession != null)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17536)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17537)==0&false))) {{
                                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17538);position.setDeviceId(deviceSession.getDeviceId());
                            }
                            }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17539);if ((((sendResponse && channel != null)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17540)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17541)==0&false))) {{
                                __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17542);channel.write(value);
                            }
                            }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17543);break;

                        case "sv":if (!__CLB4_5_2_bool0) {__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17544);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17545);position.set(Position.KEY_SATELLITES, value);
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17546);break;

                        case "bl":if (!__CLB4_5_2_bool0) {__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17547);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17548);position.set(Position.KEY_BATTERY, value);
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17549);break;

                        case "vo":if (!__CLB4_5_2_bool0) {__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17550);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17551);position.set(Position.KEY_ODOMETER, Long.parseLong(value));
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17552);break;

                        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17553);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17554);position.set(key, value);
                            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17555);break;

                    }
                }
            }}
        }}

        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17556);if ((((position.getDeviceId() != 0)&&(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17557)!=0|true))||(__CLR4_5_2dh7dh7lx1dwkkb.R.iget(17558)==0&false))) {{
            __CLR4_5_2dh7dh7lx1dwkkb.R.inc(17559);return position;
        }
        }__CLR4_5_2dh7dh7lx1dwkkb.R.inc(17560);return null;
    }finally{__CLR4_5_2dh7dh7lx1dwkkb.R.flushNeeded();}}

}
