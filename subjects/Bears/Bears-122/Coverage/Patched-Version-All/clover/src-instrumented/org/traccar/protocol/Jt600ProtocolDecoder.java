/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Jt600ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bpkbpklwye7g48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,15349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Jt600ProtocolDecoder(Jt600Protocol protocol) {
        super(protocol);__CLR4_5_2bpkbpklwye7g48.R.inc(15177);try{__CLR4_5_2bpkbpklwye7g48.R.inc(15176);
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

    private static double convertCoordinate(int raw) {try{__CLR4_5_2bpkbpklwye7g48.R.inc(15178);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15179);int degrees = raw / 1000000;
        __CLR4_5_2bpkbpklwye7g48.R.inc(15180);double minutes = (raw % 1000000) / 10000.0;
        __CLR4_5_2bpkbpklwye7g48.R.inc(15181);return degrees + minutes / 60;
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

    private List<Position> decodeBinary(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2bpkbpklwye7g48.R.inc(15182);

        __CLR4_5_2bpkbpklwye7g48.R.inc(15183);List<Position> positions = new LinkedList<>();

        __CLR4_5_2bpkbpklwye7g48.R.inc(15184);buf.readByte(); // header

        __CLR4_5_2bpkbpklwye7g48.R.inc(15185);boolean longFormat = buf.getUnsignedByte(buf.readerIndex()) == 0x75;

        __CLR4_5_2bpkbpklwye7g48.R.inc(15186);String id = String.valueOf(Long.parseLong(ChannelBuffers.hexDump(buf.readBytes(5))));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15187);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15188);if ((((deviceSession == null)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15189)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15190)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15191);return null;
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15192);if ((((longFormat)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15193)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15194)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15195);buf.readUnsignedByte(); // protocol
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15196);int version = BitUtil.from(buf.readUnsignedByte(), 4);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15197);buf.readUnsignedShort(); // length

        __CLR4_5_2bpkbpklwye7g48.R.inc(15198);while ((((buf.readableBytes() > 1)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15199)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15200)==0&false))) {{

            __CLR4_5_2bpkbpklwye7g48.R.inc(15201);Position position = new Position();
            __CLR4_5_2bpkbpklwye7g48.R.inc(15202);position.setProtocol(getProtocolName());
            __CLR4_5_2bpkbpklwye7g48.R.inc(15203);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2bpkbpklwye7g48.R.inc(15204);DateBuilder dateBuilder = new DateBuilder()
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));
            __CLR4_5_2bpkbpklwye7g48.R.inc(15205);position.setTime(dateBuilder.getDate());

            __CLR4_5_2bpkbpklwye7g48.R.inc(15206);double latitude = convertCoordinate(BcdUtil.readInteger(buf, 8));
            __CLR4_5_2bpkbpklwye7g48.R.inc(15207);double longitude = convertCoordinate(BcdUtil.readInteger(buf, 9));

            __CLR4_5_2bpkbpklwye7g48.R.inc(15208);byte flags = buf.readByte();
            __CLR4_5_2bpkbpklwye7g48.R.inc(15209);position.setValid((flags & 0x1) == 0x1);
            __CLR4_5_2bpkbpklwye7g48.R.inc(15210);if (((((flags & 0x2) == 0)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15211)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15212)==0&false))) {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15213);latitude = -latitude;
            }
            }__CLR4_5_2bpkbpklwye7g48.R.inc(15214);position.setLatitude(latitude);
            __CLR4_5_2bpkbpklwye7g48.R.inc(15215);if (((((flags & 0x4) == 0)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15216)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15217)==0&false))) {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15218);longitude = -longitude;
            }
            }__CLR4_5_2bpkbpklwye7g48.R.inc(15219);position.setLongitude(longitude);

            __CLR4_5_2bpkbpklwye7g48.R.inc(15220);position.setSpeed(BcdUtil.readInteger(buf, 2));
            __CLR4_5_2bpkbpklwye7g48.R.inc(15221);position.setCourse(buf.readUnsignedByte() * 2.0);

            __CLR4_5_2bpkbpklwye7g48.R.inc(15222);if ((((longFormat)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15223)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15224)==0&false))) {{

                __CLR4_5_2bpkbpklwye7g48.R.inc(15225);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);
                __CLR4_5_2bpkbpklwye7g48.R.inc(15226);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2bpkbpklwye7g48.R.inc(15227);buf.readUnsignedInt(); // vehicle id combined

                __CLR4_5_2bpkbpklwye7g48.R.inc(15228);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

                __CLR4_5_2bpkbpklwye7g48.R.inc(15229);int battery = buf.readUnsignedByte();
                __CLR4_5_2bpkbpklwye7g48.R.inc(15230);if ((((battery == 0xff)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15231)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15232)==0&false))) {{
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15233);position.set(Position.KEY_CHARGE, true);
                } }else {{
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15234);position.set(Position.KEY_BATTERY_LEVEL, battery);
                }

                }__CLR4_5_2bpkbpklwye7g48.R.inc(15235);CellTower cellTower = CellTower.fromCidLac(buf.readUnsignedShort(), buf.readUnsignedShort());
                __CLR4_5_2bpkbpklwye7g48.R.inc(15236);cellTower.setSignalStrength((int) buf.readUnsignedByte());
                __CLR4_5_2bpkbpklwye7g48.R.inc(15237);position.setNetwork(new Network(cellTower));

            } }else {__CLR4_5_2bpkbpklwye7g48.R.inc(15238);if ((((version == 1)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15239)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15240)==0&false))) {{

                __CLR4_5_2bpkbpklwye7g48.R.inc(15241);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_2bpkbpklwye7g48.R.inc(15242);position.set(Position.KEY_POWER, buf.readUnsignedByte());

                __CLR4_5_2bpkbpklwye7g48.R.inc(15243);buf.readByte(); // other flags and sensors

                __CLR4_5_2bpkbpklwye7g48.R.inc(15244);position.setAltitude(buf.readUnsignedShort());

                __CLR4_5_2bpkbpklwye7g48.R.inc(15245);int cid = buf.readUnsignedShort();
                __CLR4_5_2bpkbpklwye7g48.R.inc(15246);int lac = buf.readUnsignedShort();
                __CLR4_5_2bpkbpklwye7g48.R.inc(15247);int rssi = buf.readUnsignedByte();

                __CLR4_5_2bpkbpklwye7g48.R.inc(15248);if ((((cid != 0 && lac != 0)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15249)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15250)==0&false))) {{
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15251);CellTower cellTower = CellTower.fromCidLac(cid, lac);
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15252);cellTower.setSignalStrength(rssi);
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15253);position.setNetwork(new Network(cellTower));
                } }else {{
                    __CLR4_5_2bpkbpklwye7g48.R.inc(15254);position.set(Position.KEY_RSSI, rssi);
                }

            }} }else {__CLR4_5_2bpkbpklwye7g48.R.inc(15255);if ((((version == 2)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15256)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15257)==0&false))) {{

                __CLR4_5_2bpkbpklwye7g48.R.inc(15258);int fuel = buf.readUnsignedByte() << 8;

                __CLR4_5_2bpkbpklwye7g48.R.inc(15259);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
                __CLR4_5_2bpkbpklwye7g48.R.inc(15260);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);

                __CLR4_5_2bpkbpklwye7g48.R.inc(15261);fuel += buf.readUnsignedByte();
                __CLR4_5_2bpkbpklwye7g48.R.inc(15262);position.set(Position.KEY_FUEL_LEVEL, fuel);

            }

            }}}__CLR4_5_2bpkbpklwye7g48.R.inc(15263);positions.add(position);

        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15264);buf.readUnsignedByte(); // index

        __CLR4_5_2bpkbpklwye7g48.R.inc(15265);return positions;
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

    private static final Pattern PATTERN_W01 = new PatternBuilder()
            .text("(")
            .number("(d+),")                     // id
            .text("W01,")                        // type
            .number("(ddd)(dd.dddd),")           // longitude
            .expression("([EW]),")
            .number("(dd)(dd.dddd),")            // latitude
            .expression("([NS]),")
            .expression("([AV]),")               // validity
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // power
            .number("(d+),")                     // gps signal
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // alert type
            .any()
            .compile();

    private Position decodeW01(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2bpkbpklwye7g48.R.inc(15266);

        __CLR4_5_2bpkbpklwye7g48.R.inc(15267);Parser parser = new Parser(PATTERN_W01, sentence);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15268);if ((((!parser.matches())&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15269)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15270)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15271);return null;
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15272);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15273);if ((((deviceSession == null)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15274)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15275)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15276);return null;
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15277);Position position = new Position();
        __CLR4_5_2bpkbpklwye7g48.R.inc(15278);position.setProtocol(getProtocolName());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15279);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bpkbpklwye7g48.R.inc(15280);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15281);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15282);position.setValid(parser.next().equals("A"));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15283);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15284);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble(0)));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15285);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15286);position.set(Position.KEY_POWER, parser.nextDouble(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15287);position.set(Position.KEY_GPS, parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15288);position.set(Position.KEY_RSSI, parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15289);position.set("alertType", parser.nextInt(0));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15290);return position;
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

    private static final Pattern PATTERN_U01 = new PatternBuilder()
            .text("(")
            .number("(d+),")                     // id
            .number("(Udd),")                    // type
            .number("d+,").optional()            // alarm
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time (hhmmss)
            .expression("([TF]),")               // validity
            .number("(d+.d+),([NS]),")           // latitude
            .number("(d+.d+),([EW]),")           // longitude
            .number("(d+.?d*),")                 // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // satellites
            .number("(d+)%,")                    // battery
            .expression("([01]+),")              // status
            .number("(d+),")                     // cid
            .number("(d+),")                     // lac
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // odometer
            .number("(d+)")                      // serial number
            .number(",(xx)").optional()          // checksum
            .any()
            .compile();

    private Position decodeU01(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2bpkbpklwye7g48.R.inc(15291);

        __CLR4_5_2bpkbpklwye7g48.R.inc(15292);Parser parser = new Parser(PATTERN_U01, sentence);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15293);if ((((!parser.matches())&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15294)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15295)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15296);return null;
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15297);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15298);if ((((deviceSession == null)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15299)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15300)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15301);return null;
        }

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15302);String type = parser.next();

        __CLR4_5_2bpkbpklwye7g48.R.inc(15303);Position position = new Position();
        __CLR4_5_2bpkbpklwye7g48.R.inc(15304);position.setProtocol(getProtocolName());
        __CLR4_5_2bpkbpklwye7g48.R.inc(15305);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bpkbpklwye7g48.R.inc(15306);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.DMY_HMS));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15307);position.setValid(parser.next().equals("T"));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15308);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15309);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15310);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble(0)));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15311);position.setCourse(parser.nextDouble(0));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15312);position.set(Position.KEY_SATELLITES, parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15313);position.set(Position.KEY_BATTERY_LEVEL, parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15314);position.set(Position.KEY_STATUS, parser.nextBinInt(0));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15315);CellTower cellTower = CellTower.fromCidLac(parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15316);cellTower.setSignalStrength(parser.nextInt(0));
        __CLR4_5_2bpkbpklwye7g48.R.inc(15317);position.setNetwork(new Network(cellTower));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15318);position.set(Position.KEY_ODOMETER, parser.nextLong(0) * 1000);
        __CLR4_5_2bpkbpklwye7g48.R.inc(15319);position.set(Position.KEY_INDEX, parser.nextInt(0));

        __CLR4_5_2bpkbpklwye7g48.R.inc(15320);if ((((channel != null)&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15321)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15322)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15323);if ((((type.equals("U01") || type.equals("U02") || type.equals("U03"))&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15324)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15325)==0&false))) {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15326);channel.write("(S39)");
            } }else {__CLR4_5_2bpkbpklwye7g48.R.inc(15327);if ((((type.equals("U06"))&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15328)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15329)==0&false))) {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15330);channel.write("(S20)");
            }
        }}}

        }__CLR4_5_2bpkbpklwye7g48.R.inc(15331);return position;
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bpkbpklwye7g48.R.inc(15332);

        __CLR4_5_2bpkbpklwye7g48.R.inc(15333);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2bpkbpklwye7g48.R.inc(15334);char first = (char) buf.getByte(0);

        __CLR4_5_2bpkbpklwye7g48.R.inc(15335);if ((((first == '$')&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15336)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15337)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15338);return decodeBinary(buf, channel, remoteAddress);
        } }else {__CLR4_5_2bpkbpklwye7g48.R.inc(15339);if ((((first == '(')&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15340)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15341)==0&false))) {{
            __CLR4_5_2bpkbpklwye7g48.R.inc(15342);String sentence = buf.toString(StandardCharsets.US_ASCII);
            __CLR4_5_2bpkbpklwye7g48.R.inc(15343);if ((((sentence.contains("W01"))&&(__CLR4_5_2bpkbpklwye7g48.R.iget(15344)!=0|true))||(__CLR4_5_2bpkbpklwye7g48.R.iget(15345)==0&false))) {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15346);return decodeW01(sentence, channel, remoteAddress);
            } }else {{
                __CLR4_5_2bpkbpklwye7g48.R.inc(15347);return decodeU01(sentence, channel, remoteAddress);
            }
        }}

        }}__CLR4_5_2bpkbpklwye7g48.R.inc(15348);return null;
    }finally{__CLR4_5_2bpkbpklwye7g48.R.flushNeeded();}}

}
