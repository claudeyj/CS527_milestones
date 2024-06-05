/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Tk103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dyjdyjlx1dxpu5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,18232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk103ProtocolDecoder(Tk103Protocol protocol) {
        super(protocol);__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18092);try{__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18091);
    }finally{__CLR4_5_2dyjdyjlx1dxpu5.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(d+)(,)?")                  // device id
            .expression(".{4},?")                // command
            .number("d*")                        // imei?
            .number("(dd)(dd)(dd),?")            // date
            .expression("([AV]),?")              // validity
            .number("(d+)(dd.d+)")               // latitude
            .expression("([NS]),?")
            .number("(d+)(dd.d+)")               // longitude
            .expression("([EW]),?")
            .number("(d+.d)(?:d*,)?")            // speed
            .number("(dd)(dd)(dd),?")            // time
            .number("(d+.?d{1,2}),?")            // course
            .number("(?:([01]{8})|(x{8}))?,?")   // state
            .number("(?:L(x+))?")                // odometer
            .any()
            .number("([+-]ddd.d)?")              // temperature
            .text(")").optional()
            .compile();

    private static final Pattern PATTERN_BATTERY = new PatternBuilder()
            .number("(d+),")                     // device id
            .text("ZC20,")
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time
            .number("d+,")                       // battery level
            .number("(d+),")                     // battery voltage
            .number("(d+),")                     // power voltage
            .number("d+")                        // installed
            .compile();

    private static final Pattern PATTERN_NETWORK = new PatternBuilder()
            .number("(d{12})")                   // device id
            .text("BZ00,")
            .number("(d+),")                     // mcc
            .number("(d+),")                     // mnc
            .number("(x+),")                     // lac
            .number("(x+),")                     // cid
            .any()
            .compile();

    private String decodeAlarm(int value) {try{__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18093);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18094);switch (value) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18095);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18096);return Position.ALARM_ACCIDENT;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18097);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18098);return Position.ALARM_SOS;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18099);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18100);return Position.ALARM_VIBRATION;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18101);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18102);return Position.ALARM_LOW_SPEED;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18103);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18104);return Position.ALARM_OVERSPEED;
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18105);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18106);return Position.ALARM_GEOFENCE_EXIT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18107);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18108);return null;
        }
    }finally{__CLR4_5_2dyjdyjlx1dxpu5.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18109);

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18110);String sentence = (String) msg;

        // Find message start
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18111);int beginIndex = sentence.indexOf('(');
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18112);if ((((beginIndex != -1)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18113)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18114)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18115);sentence = sentence.substring(beginIndex + 1);
        }

        // Send response
        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18116);if ((((channel != null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18117)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18118)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18119);String id = sentence.substring(0, 12);
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18120);String type = sentence.substring(12, 16);
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18121);if ((((type.equals("BP00") || type.equals("BP05"))&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18122)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18123)==0&false))) {{
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18124);String content = sentence.substring(16);
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18125);if ((((content.length() >= 15)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18126)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18127)==0&false))) {{
                    __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18128);getDeviceSession(channel, remoteAddress, content.substring(0, 15));
                }
                }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18129);if ((((type.equals("BP00"))&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18130)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18131)==0&false))) {{
                    __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18132);channel.write("(" + id + "AP01HSO)");
                    __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18133);return null;
                } }else {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18134);if ((((type.equals("BP05"))&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18135)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18136)==0&false))) {{
                    __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18137);channel.write("(" + id + "AP05)");
                }
            }}}
        }}

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18138);Position position = new Position();
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18139);position.setProtocol(getProtocolName());

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18140);Parser parser = new Parser(PATTERN_BATTERY, sentence);
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18141);if ((((parser.matches())&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18142)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18143)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18144);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18145);if ((((deviceSession == null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18146)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18147)==0&false))) {{
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18148);return null;
            }
            }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18149);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18150);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18151);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18152);int battery = parser.nextInt();
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18153);if ((((battery != 65535)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18154)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18155)==0&false))) {{
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18156);position.set(Position.KEY_BATTERY, battery * 0.01);
            }

            }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18157);int power = parser.nextInt();
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18158);if ((((power != 65535)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18159)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18160)==0&false))) {{
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18161);position.set(Position.KEY_POWER, power * 0.1);
            }

            }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18162);return position;
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18163);parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18164);if ((((parser.matches())&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18165)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18166)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18167);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18168);if ((((deviceSession == null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18169)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18170)==0&false))) {{
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18171);return null;
            }
            }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18172);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18173);getLastLocation(position, null);

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18174);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18175);return position;
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18176);parser = new Parser(PATTERN, sentence);
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18177);if ((((!parser.matches())&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18178)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18179)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18180);return null;
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18181);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18182);if ((((deviceSession == null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18183)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18184)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18185);return null;
        }
        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18186);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18187);int alarm = sentence.indexOf("BO01");
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18188);if ((((alarm != -1)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18189)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18190)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18191);position.set(Position.KEY_ALARM, decodeAlarm(Integer.parseInt(sentence.substring(alarm + 4, alarm + 5))));
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18192);DateBuilder dateBuilder = new DateBuilder();
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18193);if ((((parser.next() == null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18194)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18195)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18196);dateBuilder.setDate(parser.nextInt(), parser.nextInt(), parser.nextInt());
        } }else {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18197);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18198);position.setValid(parser.next().equals("A"));
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18199);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18200);position.setLongitude(parser.nextCoordinate());

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18201);switch (Context.getConfig().getString(getProtocolName() + ".speed", "kmh")) {
            case "kn":if (!__CLB4_5_2_bool1) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18202);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18203);position.setSpeed(parser.nextDouble());
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18204);break;
            case "mph":if (!__CLB4_5_2_bool1) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18205);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18206);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble()));
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18207);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18208);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18209);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
                __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18210);break;
        }

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18211);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18212);position.setTime(dateBuilder.getDate());

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18213);position.setCourse(parser.nextDouble());

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18214);String status = parser.next();
        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18215);if ((((status != null)&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18216)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18217)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18218);position.set(Position.KEY_STATUS, status); // binary status

            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18219);int value = Integer.parseInt(new StringBuilder(status).reverse().toString(), 2);
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18220);position.set(Position.KEY_CHARGE, !BitUtil.check(value, 0));
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18221);position.set(Position.KEY_IGNITION, BitUtil.check(value, 1));
        }
        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18222);position.set(Position.KEY_STATUS, parser.next()); // hex status

        __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18223);if ((((parser.hasNext())&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18224)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18225)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18226);position.set(Position.KEY_ODOMETER, parser.nextLong(16));
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18227);if ((((parser.hasNext())&&(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18228)!=0|true))||(__CLR4_5_2dyjdyjlx1dxpu5.R.iget(18229)==0&false))) {{
            __CLR4_5_2dyjdyjlx1dxpu5.R.inc(18230);position.set(Position.PREFIX_TEMP + 1, parser.nextDouble());
        }

        }__CLR4_5_2dyjdyjlx1dxpu5.R.inc(18231);return position;
    }finally{__CLR4_5_2dyjdyjlx1dxpu5.R.flushNeeded();}}

}
