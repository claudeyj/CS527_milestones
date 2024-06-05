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

@java.lang.SuppressWarnings({"fallthrough"}) public class Tk103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dyfdyflx1e1lya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,18228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk103ProtocolDecoder(Tk103Protocol protocol) {
        super(protocol);__CLR4_5_2dyfdyflx1e1lya.R.inc(18088);try{__CLR4_5_2dyfdyflx1e1lya.R.inc(18087);
    }finally{__CLR4_5_2dyfdyflx1e1lya.R.flushNeeded();}}

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

    private String decodeAlarm(int value) {try{__CLR4_5_2dyfdyflx1e1lya.R.inc(18089);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dyfdyflx1e1lya.R.inc(18090);switch (value) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18091);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18092);return Position.ALARM_ACCIDENT;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18093);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18094);return Position.ALARM_SOS;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18095);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18096);return Position.ALARM_VIBRATION;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18097);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18098);return Position.ALARM_LOW_SPEED;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18099);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18100);return Position.ALARM_OVERSPEED;
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18101);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18102);return Position.ALARM_GEOFENCE_EXIT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18103);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18104);return null;
        }
    }finally{__CLR4_5_2dyfdyflx1e1lya.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dyfdyflx1e1lya.R.inc(18105);

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18106);String sentence = (String) msg;

        // Find message start
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18107);int beginIndex = sentence.indexOf('(');
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18108);if ((((beginIndex != -1)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18109)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18110)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18111);sentence = sentence.substring(beginIndex + 1);
        }

        // Send response
        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18112);if ((((channel != null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18113)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18114)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18115);String id = sentence.substring(0, 12);
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18116);String type = sentence.substring(12, 16);
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18117);if ((((type.equals("BP00") || type.equals("BP05"))&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18118)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18119)==0&false))) {{
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18120);String content = sentence.substring(16);
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18121);if ((((content.length() >= 15)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18122)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18123)==0&false))) {{
                    __CLR4_5_2dyfdyflx1e1lya.R.inc(18124);getDeviceSession(channel, remoteAddress, content.substring(0, 15));
                }
                }__CLR4_5_2dyfdyflx1e1lya.R.inc(18125);if ((((type.equals("BP00"))&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18126)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18127)==0&false))) {{
                    __CLR4_5_2dyfdyflx1e1lya.R.inc(18128);channel.write("(" + id + "AP01HSO)");
                    __CLR4_5_2dyfdyflx1e1lya.R.inc(18129);return null;
                } }else {__CLR4_5_2dyfdyflx1e1lya.R.inc(18130);if ((((type.equals("BP05"))&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18131)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18132)==0&false))) {{
                    __CLR4_5_2dyfdyflx1e1lya.R.inc(18133);channel.write("(" + id + "AP05)");
                }
            }}}
        }}

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18134);Position position = new Position();
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18135);position.setProtocol(getProtocolName());

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18136);Parser parser = new Parser(PATTERN_BATTERY, sentence);
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18137);if ((((parser.matches())&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18138)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18139)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18140);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18141);if ((((deviceSession == null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18142)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18143)==0&false))) {{
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18144);return null;
            }
            }__CLR4_5_2dyfdyflx1e1lya.R.inc(18145);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18146);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                    .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18147);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18148);int battery = parser.nextInt();
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18149);if ((((battery != 65535)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18150)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18151)==0&false))) {{
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18152);position.set(Position.KEY_BATTERY, battery * 0.01);
            }

            }__CLR4_5_2dyfdyflx1e1lya.R.inc(18153);int power = parser.nextInt();
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18154);if ((((power != 65535)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18155)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18156)==0&false))) {{
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18157);position.set(Position.KEY_POWER, power * 0.1);
            }

            }__CLR4_5_2dyfdyflx1e1lya.R.inc(18158);return position;
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18159);parser = new Parser(PATTERN_NETWORK, sentence);
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18160);if ((((parser.matches())&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18161)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18162)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18163);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18164);if ((((deviceSession == null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18165)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18166)==0&false))) {{
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18167);return null;
            }
            }__CLR4_5_2dyfdyflx1e1lya.R.inc(18168);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18169);getLastLocation(position, null);

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18170);position.setNetwork(new Network(CellTower.from(
                    parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18171);return position;
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18172);parser = new Parser(PATTERN, sentence);
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18173);if ((((!parser.matches())&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18174)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18175)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18176);return null;
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18177);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18178);if ((((deviceSession == null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18179)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18180)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18181);return null;
        }
        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18182);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18183);int alarm = sentence.indexOf("BO01");
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18184);if ((((alarm != -1)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18185)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18186)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18187);position.set(Position.KEY_ALARM, decodeAlarm(Integer.parseInt(sentence.substring(alarm + 4, alarm + 5))));
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18188);DateBuilder dateBuilder = new DateBuilder();
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18189);if ((((parser.next() == null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18190)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18191)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18192);dateBuilder.setDate(parser.nextInt(), parser.nextInt(), parser.nextInt());
        } }else {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18193);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18194);position.setValid(parser.next().equals("A"));
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18195);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18196);position.setLongitude(parser.nextCoordinate());

        boolean __CLB4_5_2_bool1=false;__CLR4_5_2dyfdyflx1e1lya.R.inc(18197);switch (Context.getConfig().getString(getProtocolName() + ".speed", "kmh")) {
            case "kn":if (!__CLB4_5_2_bool1) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18198);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18199);position.setSpeed(parser.nextDouble());
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18200);break;
            case "mph":if (!__CLB4_5_2_bool1) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18201);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18202);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble()));
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18203);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2dyfdyflx1e1lya.R.inc(18204);__CLB4_5_2_bool1=true;}
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18205);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
                __CLR4_5_2dyfdyflx1e1lya.R.inc(18206);break;
        }

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18207);dateBuilder.setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18208);position.setTime(dateBuilder.getDate());

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18209);position.setCourse(parser.nextDouble());

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18210);String status = parser.next();
        __CLR4_5_2dyfdyflx1e1lya.R.inc(18211);if ((((status != null)&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18212)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18213)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18214);position.set(Position.KEY_STATUS, status); // binary status

            __CLR4_5_2dyfdyflx1e1lya.R.inc(18215);int value = Integer.parseInt(new StringBuilder(status).reverse().toString(), 2);
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18216);position.set(Position.KEY_CHARGE, !BitUtil.check(value, 0));
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18217);position.set(Position.KEY_IGNITION, BitUtil.check(value, 1));
        }
        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18218);position.set(Position.KEY_STATUS, parser.next()); // hex status

        __CLR4_5_2dyfdyflx1e1lya.R.inc(18219);if ((((parser.hasNext())&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18220)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18221)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18222);position.set(Position.KEY_ODOMETER, parser.nextLong(16));
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18223);if ((((parser.hasNext())&&(__CLR4_5_2dyfdyflx1e1lya.R.iget(18224)!=0|true))||(__CLR4_5_2dyfdyflx1e1lya.R.iget(18225)==0&false))) {{
            __CLR4_5_2dyfdyflx1e1lya.R.inc(18226);position.set(Position.PREFIX_TEMP + 1, parser.nextDouble());
        }

        }__CLR4_5_2dyfdyflx1e1lya.R.inc(18227);return position;
    }finally{__CLR4_5_2dyfdyflx1e1lya.R.flushNeeded();}}

}
