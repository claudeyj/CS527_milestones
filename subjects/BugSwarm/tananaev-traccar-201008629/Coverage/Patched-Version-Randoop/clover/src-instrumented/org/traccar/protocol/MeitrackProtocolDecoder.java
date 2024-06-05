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
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeitrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2awkawklx1e0hpn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,14268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeitrackProtocolDecoder(MeitrackProtocol protocol) {
        super(protocol);__CLR4_5_2awkawklx1e0hpn.R.inc(14133);try{__CLR4_5_2awkawklx1e0hpn.R.inc(14132);
    }finally{__CLR4_5_2awkawklx1e0hpn.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("$$").expression(".")          // flag
            .number("d+,")                       // length
            .number("(d+),")                     // imei
            .number("xxx,")                      // command
            .number("d+,").optional()
            .number("(d+),")                     // event
            .number("(-?d+.d+),")                // latitude
            .number("(-?d+.d+),")                // longitude
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .number("(dd)(dd)(dd),")             // time
            .number("([AV]),")                   // validity
            .number("(d+),")                     // satellites
            .number("(d+),")                     // gsm signal
            .number("(d+.?d*),")                 // speed
            .number("(d+),")                     // course
            .number("(d+.?d*),")                 // hdop
            .number("(-?d+),")                   // altitude
            .number("(d+),")                     // odometer
            .number("(d+),")                     // runtime
            .number("(d+)|")                     // mcc
            .number("(d+)|")                     // mnc
            .number("(x+)|")                     // lac
            .number("(x+),")                     // cell
            .number("(x+),")                     // state
            .number("(x+)?|")                    // adc1
            .number("(x+)?|")                    // adc2
            .number("(x+)?|")                    // adc3
            .number("(x+)|")                     // battery
            .number("(x+),")                     // power
            .groupBegin()
            .expression("([^,]+)?,")             // event specific
            .expression("[^,]*,")                // reserved
            .number("d*,")                       // protocol
            .number("(x{4})?")                   // fuel
            .number("(?:,(x{6}(?:|x{6})*))?")    // temperature
            .or()
            .any()
            .groupEnd()
            .text("*")
            .number("xx")
            .text("\r\n").optional()
            .compile();

    private Position decodeRegularMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2awkawklx1e0hpn.R.inc(14134);

        __CLR4_5_2awkawklx1e0hpn.R.inc(14135);Parser parser = new Parser(PATTERN, buf.toString(StandardCharsets.US_ASCII));
        __CLR4_5_2awkawklx1e0hpn.R.inc(14136);if ((((!parser.matches())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14137)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14138)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14139);return null;
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14140);Position position = new Position();
        __CLR4_5_2awkawklx1e0hpn.R.inc(14141);position.setProtocol(getProtocolName());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14142);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2awkawklx1e0hpn.R.inc(14143);if ((((deviceSession == null)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14144)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14145)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14146);return null;
        }
        }__CLR4_5_2awkawklx1e0hpn.R.inc(14147);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14148);int event = parser.nextInt();
        __CLR4_5_2awkawklx1e0hpn.R.inc(14149);position.set(Position.KEY_EVENT, event);

        __CLR4_5_2awkawklx1e0hpn.R.inc(14150);position.setLatitude(parser.nextDouble());
        __CLR4_5_2awkawklx1e0hpn.R.inc(14151);position.setLongitude(parser.nextDouble());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14152);DateBuilder dateBuilder = new DateBuilder()
                .setDate(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2awkawklx1e0hpn.R.inc(14153);position.setTime(dateBuilder.getDate());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14154);position.setValid(parser.next().equals("A"));

        __CLR4_5_2awkawklx1e0hpn.R.inc(14155);position.set(Position.KEY_SATELLITES, parser.next());
        __CLR4_5_2awkawklx1e0hpn.R.inc(14156);position.set(Position.KEY_RSSI, parser.next());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14157);position.setSpeed(UnitsConverter.knotsFromKph(parser.nextDouble()));
        __CLR4_5_2awkawklx1e0hpn.R.inc(14158);position.setCourse(parser.nextDouble());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14159);position.set(Position.KEY_HDOP, parser.next());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14160);position.setAltitude(parser.nextDouble());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14161);position.set(Position.KEY_ODOMETER, parser.next());
        __CLR4_5_2awkawklx1e0hpn.R.inc(14162);position.set("runtime", parser.next());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14163);position.setNetwork(new Network(
                CellTower.from(parser.nextInt(), parser.nextInt(), parser.nextInt(16), parser.nextInt(16))));

        __CLR4_5_2awkawklx1e0hpn.R.inc(14164);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2awkawklx1e0hpn.R.inc(14165);for (int i = 1; (((i <= 3)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14166)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14167)==0&false)); i++) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14168);if ((((parser.hasNext())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14169)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14170)==0&false))) {{
                __CLR4_5_2awkawklx1e0hpn.R.inc(14171);position.set(Position.PREFIX_ADC + i, parser.nextInt(16));
            }
        }}

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14172);position.set(Position.KEY_BATTERY, parser.nextInt(16));
        __CLR4_5_2awkawklx1e0hpn.R.inc(14173);position.set(Position.KEY_POWER, parser.nextInt(16));

        __CLR4_5_2awkawklx1e0hpn.R.inc(14174);String eventData = parser.next();
        __CLR4_5_2awkawklx1e0hpn.R.inc(14175);if ((((eventData != null && !eventData.isEmpty())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14176)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14177)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2awkawklx1e0hpn.R.inc(14178);switch (event) {
                case 37:if (!__CLB4_5_2_bool0) {__CLR4_5_2awkawklx1e0hpn.R.inc(14179);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14180);position.set(Position.KEY_RFID, eventData);
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14181);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2awkawklx1e0hpn.R.inc(14182);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14183);position.set("eventData", eventData);
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14184);break;
            }
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14185);if ((((parser.hasNext())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14186)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14187)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14188);String fuel = parser.next();
            __CLR4_5_2awkawklx1e0hpn.R.inc(14189);position.set(Position.KEY_FUEL,
                    Integer.parseInt(fuel.substring(0, 2), 16) + Integer.parseInt(fuel.substring(2), 16) * 0.01);
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14190);if ((((parser.hasNext())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14191)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14192)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14193);for (String temp : parser.next().split("\\|")) {{
                __CLR4_5_2awkawklx1e0hpn.R.inc(14194);int index = Integer.valueOf(temp.substring(0, 2), 16);
                __CLR4_5_2awkawklx1e0hpn.R.inc(14195);int value = Integer.valueOf(temp.substring(2), 16);
                __CLR4_5_2awkawklx1e0hpn.R.inc(14196);position.set(Position.PREFIX_TEMP + index, value);
            }
        }}

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14197);return position;
    }finally{__CLR4_5_2awkawklx1e0hpn.R.flushNeeded();}}

    private List<Position> decodeBinaryMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2awkawklx1e0hpn.R.inc(14198);
        __CLR4_5_2awkawklx1e0hpn.R.inc(14199);List<Position> positions = new LinkedList<>();

        __CLR4_5_2awkawklx1e0hpn.R.inc(14200);String flag = buf.toString(2, 1, StandardCharsets.US_ASCII);
        __CLR4_5_2awkawklx1e0hpn.R.inc(14201);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');

        __CLR4_5_2awkawklx1e0hpn.R.inc(14202);String imei = buf.toString(index + 1, 15, StandardCharsets.US_ASCII);
        __CLR4_5_2awkawklx1e0hpn.R.inc(14203);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2awkawklx1e0hpn.R.inc(14204);if ((((deviceSession == null)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14205)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14206)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14207);return null;
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14208);buf.skipBytes(index + 1 + 15 + 1 + 3 + 1 + 2 + 2 + 4);

        __CLR4_5_2awkawklx1e0hpn.R.inc(14209);while ((((buf.readableBytes() >= 0x34)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14210)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14211)==0&false))) {{

            __CLR4_5_2awkawklx1e0hpn.R.inc(14212);Position position = new Position();
            __CLR4_5_2awkawklx1e0hpn.R.inc(14213);position.setProtocol(getProtocolName());
            __CLR4_5_2awkawklx1e0hpn.R.inc(14214);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14215);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14216);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_2awkawklx1e0hpn.R.inc(14217);position.setLongitude(buf.readInt() * 0.000001);

            __CLR4_5_2awkawklx1e0hpn.R.inc(14218);position.setTime(new Date((946684800 + buf.readUnsignedInt()) * 1000)); // 946684800 = 2000-01-01

            __CLR4_5_2awkawklx1e0hpn.R.inc(14219);position.setValid(buf.readUnsignedByte() == 1);

            __CLR4_5_2awkawklx1e0hpn.R.inc(14220);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_2awkawklx1e0hpn.R.inc(14221);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14222);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_2awkawklx1e0hpn.R.inc(14223);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14224);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);

            __CLR4_5_2awkawklx1e0hpn.R.inc(14225);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14226);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_2awkawklx1e0hpn.R.inc(14227);position.set("runtime", buf.readUnsignedInt());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14228);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    buf.readUnsignedShort(), buf.readUnsignedShort())));

            __CLR4_5_2awkawklx1e0hpn.R.inc(14229);position.set(Position.KEY_STATUS, buf.readUnsignedShort());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14230);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2awkawklx1e0hpn.R.inc(14231);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.01);
            __CLR4_5_2awkawklx1e0hpn.R.inc(14232);position.set(Position.KEY_POWER, buf.readUnsignedShort());

            __CLR4_5_2awkawklx1e0hpn.R.inc(14233);buf.readUnsignedInt(); // geo-fence

            __CLR4_5_2awkawklx1e0hpn.R.inc(14234);positions.add(position);
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14235);if ((((channel != null)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14236)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14237)==0&false))) {{
            __CLR4_5_2awkawklx1e0hpn.R.inc(14238);StringBuilder command = new StringBuilder("@@");
            __CLR4_5_2awkawklx1e0hpn.R.inc(14239);command.append(flag).append(27 + positions.size() / 10).append(",");
            __CLR4_5_2awkawklx1e0hpn.R.inc(14240);command.append(imei).append(",CCC,").append(positions.size()).append("*");
            __CLR4_5_2awkawklx1e0hpn.R.inc(14241);int checksum = 0;
            __CLR4_5_2awkawklx1e0hpn.R.inc(14242);for (int i = 0; (((i < command.length())&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14243)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14244)==0&false)); i += 1) {{
                __CLR4_5_2awkawklx1e0hpn.R.inc(14245);checksum += command.charAt(i);
            }
            }__CLR4_5_2awkawklx1e0hpn.R.inc(14246);command.append(String.format("%02x", checksum & 0xff).toUpperCase());
            __CLR4_5_2awkawklx1e0hpn.R.inc(14247);command.append("\r\n");
            __CLR4_5_2awkawklx1e0hpn.R.inc(14248);channel.write(command.toString()); // delete processed data
        }

        }__CLR4_5_2awkawklx1e0hpn.R.inc(14249);return positions;
    }finally{__CLR4_5_2awkawklx1e0hpn.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2awkawklx1e0hpn.R.inc(14250);

        __CLR4_5_2awkawklx1e0hpn.R.inc(14251);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find type
        __CLR4_5_2awkawklx1e0hpn.R.inc(14252);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) ',');
        __CLR4_5_2awkawklx1e0hpn.R.inc(14253);index = buf.indexOf(index + 1, buf.writerIndex(), (byte) ',');

        __CLR4_5_2awkawklx1e0hpn.R.inc(14254);String type = buf.toString(index + 1, 3, StandardCharsets.US_ASCII);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2awkawklx1e0hpn.R.inc(14255);switch (type) {
            case "D03":if (!__CLB4_5_2_bool1) {__CLR4_5_2awkawklx1e0hpn.R.inc(14256);__CLB4_5_2_bool1=true;}
                __CLR4_5_2awkawklx1e0hpn.R.inc(14257);if ((((channel != null)&&(__CLR4_5_2awkawklx1e0hpn.R.iget(14258)!=0|true))||(__CLR4_5_2awkawklx1e0hpn.R.iget(14259)==0&false))) {{
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14260);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14261);String imei = Context.getIdentityManager().getDeviceById(deviceSession.getDeviceId()).getUniqueId();
                    __CLR4_5_2awkawklx1e0hpn.R.inc(14262);channel.write("@@O46," + imei + ",D00,camera_picture.jpg,0*00\r\n");
                }
                }__CLR4_5_2awkawklx1e0hpn.R.inc(14263);return null;
            case "CCC":if (!__CLB4_5_2_bool1) {__CLR4_5_2awkawklx1e0hpn.R.inc(14264);__CLB4_5_2_bool1=true;}
                __CLR4_5_2awkawklx1e0hpn.R.inc(14265);return decodeBinaryMessage(channel, remoteAddress, buf);
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2awkawklx1e0hpn.R.inc(14266);__CLB4_5_2_bool1=true;}
                __CLR4_5_2awkawklx1e0hpn.R.inc(14267);return decodeRegularMessage(channel, remoteAddress, buf);
        }
    }finally{__CLR4_5_2awkawklx1e0hpn.R.flushNeeded();}}

}
