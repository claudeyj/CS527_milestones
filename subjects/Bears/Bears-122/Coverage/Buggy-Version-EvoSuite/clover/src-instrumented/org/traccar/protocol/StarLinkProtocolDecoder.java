/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class StarLinkProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ezpezplwydwems{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,19570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String[] dataTags;
    private DateFormat dateFormat;

    public StarLinkProtocolDecoder(StarLinkProtocol protocol) {
        super(protocol);__CLR4_5_2ezpezplwydwems.R.inc(19430);try{__CLR4_5_2ezpezplwydwems.R.inc(19429);

        __CLR4_5_2ezpezplwydwems.R.inc(19431);String format = Context.getConfig().getString(
                getProtocolName() + ".format", "#EDT#,#EID#,#PDT#,#LAT#,#LONG#,#SPD#,#HEAD#,#ODO#,"
                + "#IN1#,#IN2#,#IN3#,#IN4#,#OUT1#,#OUT2#,#OUT3#,#OUT4#,#LAC#,#CID#,#VIN#,#VBAT#,#DEST#,#IGN#,#ENG#");
        __CLR4_5_2ezpezplwydwems.R.inc(19432);dataTags = format.split(",");

        __CLR4_5_2ezpezplwydwems.R.inc(19433);dateFormat = new SimpleDateFormat(
                Context.getConfig().getString(getProtocolName() + ".dateFormat", "yyMMddHHmmss"));
        __CLR4_5_2ezpezplwydwems.R.inc(19434);dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }finally{__CLR4_5_2ezpezplwydwems.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .expression(".")                     // protocol head
            .text("SLU")                         // message head
            .number("(x{6}|d{15}),")             // id
            .number("(d+),")                     // type
            .number("(d+),")                     // index
            .expression("(.+)")                  // data
            .text("*")
            .number("xx")                        // checksum
            .compile();

    public static final int MSG_EVENT_REPORT = 6;

    private double parseCoordinate(String value) {try{__CLR4_5_2ezpezplwydwems.R.inc(19435);
        __CLR4_5_2ezpezplwydwems.R.inc(19436);int minutesIndex = value.indexOf('.') - 2;
        __CLR4_5_2ezpezplwydwems.R.inc(19437);double result = Double.parseDouble(value.substring(1, minutesIndex));
        __CLR4_5_2ezpezplwydwems.R.inc(19438);result += Double.parseDouble(value.substring(minutesIndex)) / 60;
        __CLR4_5_2ezpezplwydwems.R.inc(19439);return (((value.charAt(0) == '+' )&&(__CLR4_5_2ezpezplwydwems.R.iget(19440)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19441)==0&false))? result : -result;
    }finally{__CLR4_5_2ezpezplwydwems.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ezpezplwydwems.R.inc(19442);

        __CLR4_5_2ezpezplwydwems.R.inc(19443);Parser parser = new Parser(PATTERN, (String) msg);
        __CLR4_5_2ezpezplwydwems.R.inc(19444);if ((((!parser.matches())&&(__CLR4_5_2ezpezplwydwems.R.iget(19445)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19446)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19447);return null;
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19448);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2ezpezplwydwems.R.inc(19449);if ((((deviceSession == null)&&(__CLR4_5_2ezpezplwydwems.R.iget(19450)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19451)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19452);return null;
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19453);int type = parser.nextInt(0);
        __CLR4_5_2ezpezplwydwems.R.inc(19454);if ((((type != MSG_EVENT_REPORT)&&(__CLR4_5_2ezpezplwydwems.R.iget(19455)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19456)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19457);return null;
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19458);Position position = new Position();
        __CLR4_5_2ezpezplwydwems.R.inc(19459);position.setProtocol(getProtocolName());
        __CLR4_5_2ezpezplwydwems.R.inc(19460);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2ezpezplwydwems.R.inc(19461);position.setValid(true);

        __CLR4_5_2ezpezplwydwems.R.inc(19462);position.set(Position.KEY_INDEX, parser.nextInt(0));

        __CLR4_5_2ezpezplwydwems.R.inc(19463);String[] data = parser.next().split(",");
        __CLR4_5_2ezpezplwydwems.R.inc(19464);Integer lac = null, cid = null;
        __CLR4_5_2ezpezplwydwems.R.inc(19465);int event = 0;

        __CLR4_5_2ezpezplwydwems.R.inc(19466);for (int i = 0; (((i < Math.min(data.length, dataTags.length))&&(__CLR4_5_2ezpezplwydwems.R.iget(19467)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19468)==0&false)); i++) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19469);if ((((data[i].isEmpty())&&(__CLR4_5_2ezpezplwydwems.R.iget(19470)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19471)==0&false))) {{
                __CLR4_5_2ezpezplwydwems.R.inc(19472);continue;
            }
            }boolean __CLB4_5_2_bool0=false;__CLR4_5_2ezpezplwydwems.R.inc(19473);switch (dataTags[i]) {
                case "#EDT#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19474);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19475);position.setDeviceTime(dateFormat.parse(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19476);break;
                case "#EID#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19477);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19478);event = Integer.parseInt(data[i]);
                    __CLR4_5_2ezpezplwydwems.R.inc(19479);position.set(Position.KEY_EVENT, event);
                    __CLR4_5_2ezpezplwydwems.R.inc(19480);break;
                case "#PDT#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19481);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19482);position.setFixTime(dateFormat.parse(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19483);break;
                case "#LAT#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19484);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19485);position.setLatitude(parseCoordinate(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19486);break;
                case "#LONG#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19487);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19488);position.setLongitude(parseCoordinate(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19489);break;
                case "#SPD#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19490);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19491);position.setSpeed(Double.parseDouble(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19492);break;
                case "#HEAD#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19493);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19494);position.setCourse(Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19495);break;
                case "#ODO#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19496);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19497);position.set(Position.KEY_ODOMETER, Long.parseLong(data[i]) * 1000);
                    __CLR4_5_2ezpezplwydwems.R.inc(19498);break;
                case "#IN1#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19499);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19500);position.set(Position.PREFIX_IN + 1, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19501);break;
                case "#IN2#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19502);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19503);position.set(Position.PREFIX_IN + 2, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19504);break;
                case "#IN3#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19505);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19506);position.set(Position.PREFIX_IN + 3, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19507);break;
                case "#IN4#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19508);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19509);position.set(Position.PREFIX_IN + 4, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19510);break;
                case "#OUT1#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19511);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19512);position.set(Position.PREFIX_OUT + 1, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19513);break;
                case "#OUT2#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19514);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19515);position.set(Position.PREFIX_OUT + 2, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19516);break;
                case "#OUT3#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19517);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19518);position.set(Position.PREFIX_OUT + 3, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19519);break;
                case "#OUT4#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19520);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19521);position.set(Position.PREFIX_OUT + 4, Integer.parseInt(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19522);break;
                case "#LAC#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19523);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19524);if ((((!data[i].isEmpty())&&(__CLR4_5_2ezpezplwydwems.R.iget(19525)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19526)==0&false))) {{
                        __CLR4_5_2ezpezplwydwems.R.inc(19527);lac = Integer.parseInt(data[i]);
                    }
                    }__CLR4_5_2ezpezplwydwems.R.inc(19528);break;
                case "#CID#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19529);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19530);if ((((!data[i].isEmpty())&&(__CLR4_5_2ezpezplwydwems.R.iget(19531)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19532)==0&false))) {{
                        __CLR4_5_2ezpezplwydwems.R.inc(19533);cid = Integer.parseInt(data[i]);
                    }
                    }__CLR4_5_2ezpezplwydwems.R.inc(19534);break;
                case "#VIN#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19535);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19536);position.set(Position.KEY_POWER, Double.parseDouble(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19537);break;
                case "#VBAT#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19538);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19539);position.set(Position.KEY_BATTERY, Double.parseDouble(data[i]));
                    __CLR4_5_2ezpezplwydwems.R.inc(19540);break;
                case "#DEST#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19541);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19542);position.set("destination", data[i]);
                    __CLR4_5_2ezpezplwydwems.R.inc(19543);break;
                case "#IGN#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19544);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19545);position.set(Position.KEY_IGNITION, data[i].equals("1"));
                    __CLR4_5_2ezpezplwydwems.R.inc(19546);break;
                case "#ENG#":if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19547);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19548);position.set("engine", data[i].equals("1"));
                    __CLR4_5_2ezpezplwydwems.R.inc(19549);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ezpezplwydwems.R.inc(19550);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ezpezplwydwems.R.inc(19551);break;
            }
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19552);if ((((position.getFixTime() == null)&&(__CLR4_5_2ezpezplwydwems.R.iget(19553)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19554)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19555);getLastLocation(position, null);
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19556);if ((((lac != null && cid != null)&&(__CLR4_5_2ezpezplwydwems.R.iget(19557)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19558)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19559);position.setNetwork(new Network(CellTower.fromLacCid(lac, cid)));
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19560);if ((((event == 20)&&(__CLR4_5_2ezpezplwydwems.R.iget(19561)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19562)==0&false))) {{
            __CLR4_5_2ezpezplwydwems.R.inc(19563);String rfid = data[data.length - 1];
            __CLR4_5_2ezpezplwydwems.R.inc(19564);if ((((rfid.matches("0+"))&&(__CLR4_5_2ezpezplwydwems.R.iget(19565)!=0|true))||(__CLR4_5_2ezpezplwydwems.R.iget(19566)==0&false))) {{
                __CLR4_5_2ezpezplwydwems.R.inc(19567);rfid = data[data.length - 2];
            }
            }__CLR4_5_2ezpezplwydwems.R.inc(19568);position.set(Position.KEY_DRIVER_UNIQUE_ID, rfid);
        }

        }__CLR4_5_2ezpezplwydwems.R.inc(19569);return position;
    }finally{__CLR4_5_2ezpezplwydwems.R.flushNeeded();}}

}
