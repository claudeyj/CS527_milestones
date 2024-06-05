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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class Jt600ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29ze9zelx1dxp1b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,13100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Jt600ProtocolDecoder(Jt600Protocol protocol) {
        super(protocol);__CLR4_5_29ze9zelx1dxp1b.R.inc(12939);try{__CLR4_5_29ze9zelx1dxp1b.R.inc(12938);
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

    private static double convertCoordinate(int raw) {try{__CLR4_5_29ze9zelx1dxp1b.R.inc(12940);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12941);int degrees = raw / 1000000;
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12942);double minutes = (raw % 1000000) / 10000.0;
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12943);return degrees + minutes / 60;
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

    private Position decodeBinary(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29ze9zelx1dxp1b.R.inc(12944);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12945);Position position = new Position();
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12946);position.setProtocol(getProtocolName());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12947);buf.readByte(); // header

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12948);boolean longFormat = buf.getUnsignedByte(buf.readerIndex()) == 0x75;

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12949);String id = String.valueOf(Long.parseLong(ChannelBuffers.hexDump(buf.readBytes(5))));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12950);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12951);if ((((deviceSession == null)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12952)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12953)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12954);return null;
        }
        }__CLR4_5_29ze9zelx1dxp1b.R.inc(12955);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12956);if ((((longFormat)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12957)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12958)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12959);buf.readUnsignedByte(); // protocol
        }

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(12960);int version = buf.readUnsignedByte() >> 4;
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12961);buf.readUnsignedShort(); // length

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12962);DateBuilder dateBuilder = new DateBuilder()
                .setDay(BcdUtil.readInteger(buf, 2))
                .setMonth(BcdUtil.readInteger(buf, 2))
                .setYear(BcdUtil.readInteger(buf, 2))
                .setHour(BcdUtil.readInteger(buf, 2))
                .setMinute(BcdUtil.readInteger(buf, 2))
                .setSecond(BcdUtil.readInteger(buf, 2));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12963);position.setTime(dateBuilder.getDate());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12964);double latitude = convertCoordinate(BcdUtil.readInteger(buf, 8));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12965);double longitude = convertCoordinate(BcdUtil.readInteger(buf, 9));

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12966);byte flags = buf.readByte();
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12967);position.setValid((flags & 0x1) == 0x1);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12968);if (((((flags & 0x2) == 0)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12969)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12970)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12971);latitude = -latitude;
        }
        }__CLR4_5_29ze9zelx1dxp1b.R.inc(12972);position.setLatitude(latitude);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12973);if (((((flags & 0x4) == 0)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12974)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12975)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12976);longitude = -longitude;
        }
        }__CLR4_5_29ze9zelx1dxp1b.R.inc(12977);position.setLongitude(longitude);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12978);position.setSpeed(BcdUtil.readInteger(buf, 2));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(12979);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(12980);if ((((longFormat)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12981)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12982)==0&false))) {{

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12983);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12984);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12985);buf.readUnsignedInt(); // vehicle id combined

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12986);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12987);int battery = buf.readUnsignedByte();
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12988);if ((((battery == 0xff)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12989)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12990)==0&false))) {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(12991);position.set(Position.KEY_CHARGE, true);
            } }else {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(12992);position.set(Position.KEY_BATTERY, battery + "%");
            }

            }__CLR4_5_29ze9zelx1dxp1b.R.inc(12993);position.setNetwork(new Network(
                    CellTower.fromCidLac(buf.readUnsignedShort(), buf.readUnsignedShort())));

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12994);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
            __CLR4_5_29ze9zelx1dxp1b.R.inc(12995);position.set(Position.KEY_INDEX, buf.readUnsignedByte());

        } }else {__CLR4_5_29ze9zelx1dxp1b.R.inc(12996);if ((((version == 1)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(12997)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(12998)==0&false))) {{

            __CLR4_5_29ze9zelx1dxp1b.R.inc(12999);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13000);position.set(Position.KEY_POWER, buf.readUnsignedByte());

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13001);buf.readByte(); // other flags and sensors

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13002);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13003);int cid = buf.readUnsignedShort();
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13004);int lac = buf.readUnsignedShort();
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13005);if ((((cid != 0 && lac != 0)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13006)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13007)==0&false))) {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(13008);position.setNetwork(new Network(CellTower.fromCidLac(cid, lac)));
            }

            }__CLR4_5_29ze9zelx1dxp1b.R.inc(13009);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

        } }else {__CLR4_5_29ze9zelx1dxp1b.R.inc(13010);if ((((version == 2)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13011)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13012)==0&false))) {{

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13013);int fuel = buf.readUnsignedByte() << 8;

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13014);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13015);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);

            __CLR4_5_29ze9zelx1dxp1b.R.inc(13016);fuel += buf.readUnsignedByte();
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13017);position.set(Position.KEY_FUEL, fuel);

        }

        }}}__CLR4_5_29ze9zelx1dxp1b.R.inc(13018);return position;
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

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
            .number("(dd)(dd)(dd),")             // time
            .number("(d+),")                     // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // power
            .number("(d+),")                     // gps signal
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // alert type
            .any()
            .compile();

    private Position decodeW01(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29ze9zelx1dxp1b.R.inc(13019);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13020);Parser parser = new Parser(PATTERN_W01, sentence);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13021);if ((((!parser.matches())&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13022)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13023)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13024);return null;
        }

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(13025);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13026);if ((((deviceSession == null)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13027)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13028)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13029);return null;
        }

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(13030);Position position = new Position();
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13031);position.setProtocol(getProtocolName());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13032);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13033);position.setLongitude(parser.nextCoordinate());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13034);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13035);position.setValid(parser.next().equals("A"));

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13036);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13037);position.setTime(dateBuilder.getDate());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13038);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13039);position.setCourse(parser.nextDouble());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13040);position.set(Position.KEY_POWER, parser.nextDouble());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13041);return position;
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

    private static final Pattern PATTERN_U01 = new PatternBuilder()
            .text("(")
            .number("(d+),")                     // id
            .number("(Udd),")                    // type
            .number("d+,").optional()            // alarm
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time
            .expression("([TF]),")               // validity
            .number("(d+.d+),([NS]),")           // latitude
            .number("(d+.d+),([EW]),")           // longitude
            .number("(d+.?d*),")                 // speed
            .number("(d+),")                     // course
            .number("(d+),")                     // satellites
            .number("(d+%),")                    // battery
            .expression("([01]+),")              // status
            .number("(d+),")                     // cid
            .number("(d+),")                     // lac
            .number("(d+),")                     // gsm signal
            .number("(d+),")                     // odometer
            .number("(d+)")                      // serial number
            .number(",(xx)").optional()          // checksum
            .any()
            .compile();

    private Position decodeU01(String sentence, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_29ze9zelx1dxp1b.R.inc(13042);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13043);Parser parser = new Parser(PATTERN_U01, sentence);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13044);if ((((!parser.matches())&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13045)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13046)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13047);return null;
        }

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(13048);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13049);if ((((deviceSession == null)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13050)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13051)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13052);return null;
        }

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(13053);String type = parser.next();

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13054);Position position = new Position();
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13055);position.setProtocol(getProtocolName());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13056);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13057);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13058);position.setTime(dateBuilder.getDate());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13059);position.setValid(parser.next().equals("T"));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13060);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13061);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.DEG_HEM));

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13062);position.setSpeed(UnitsConverter.knotsFromMph(parser.nextDouble()));
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13063);position.setCourse(parser.nextDouble());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13064);position.set(Position.KEY_SATELLITES, parser.nextInt());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13065);position.set(Position.KEY_BATTERY, parser.next());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13066);position.set(Position.KEY_STATUS, parser.nextInt(2));

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13067);position.setNetwork(new Network(CellTower.fromCidLac(parser.nextInt(), parser.nextInt())));

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13068);position.set(Position.KEY_RSSI, parser.nextInt());
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13069);position.set(Position.KEY_ODOMETER, parser.nextLong() * 1000);
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13070);position.set(Position.KEY_INDEX, parser.nextInt());

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13071);if ((((channel != null)&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13072)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13073)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13074);if ((((type.equals("U01") || type.equals("U02") || type.equals("U03"))&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13075)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13076)==0&false))) {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(13077);channel.write("(S39)");
            } }else {__CLR4_5_29ze9zelx1dxp1b.R.inc(13078);if ((((type.equals("U06"))&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13079)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13080)==0&false))) {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(13081);channel.write("(S20)");
            }
        }}}

        }__CLR4_5_29ze9zelx1dxp1b.R.inc(13082);return position;
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29ze9zelx1dxp1b.R.inc(13083);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13084);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_29ze9zelx1dxp1b.R.inc(13085);char first = (char) buf.getByte(0);

        __CLR4_5_29ze9zelx1dxp1b.R.inc(13086);if ((((first == '$')&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13087)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13088)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13089);return decodeBinary(buf, channel, remoteAddress);
        } }else {__CLR4_5_29ze9zelx1dxp1b.R.inc(13090);if ((((first == '(')&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13091)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13092)==0&false))) {{
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13093);String sentence = buf.toString(StandardCharsets.US_ASCII);
            __CLR4_5_29ze9zelx1dxp1b.R.inc(13094);if ((((sentence.contains("W01"))&&(__CLR4_5_29ze9zelx1dxp1b.R.iget(13095)!=0|true))||(__CLR4_5_29ze9zelx1dxp1b.R.iget(13096)==0&false))) {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(13097);return decodeW01(sentence, channel, remoteAddress);
            } }else {{
                __CLR4_5_29ze9zelx1dxp1b.R.inc(13098);return decodeU01(sentence, channel, remoteAddress);
            }
        }}

        }}__CLR4_5_29ze9zelx1dxp1b.R.inc(13099);return null;
    }finally{__CLR4_5_29ze9zelx1dxp1b.R.flushNeeded();}}

}
