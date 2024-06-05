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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cencenlwydyjqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,16322,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeiligaoProtocolDecoder(MeiligaoProtocol protocol) {
        super(protocol);__CLR4_5_2cencenlwydyjqs.R.inc(16080);try{__CLR4_5_2cencenlwydyjqs.R.inc(16079);
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(dd)(dd)(dd).?d*,")         // time (hhmmss)
            .expression("([AV]),")               // validity
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .expression("([EW]),")
            .number("(d+.?d*)?,")                // speed
            .number("(d+.?d*)?,")                // course
            .number("(dd)(dd)(dd)")              // date (ddmmyy)
            .expression("[^\\|]*")
            .groupBegin()
            .number("|(d+.d+)?")                 // hdop
            .number("|(-?d+.?d*)?")              // altitude
            .number("|(xxxx)?")                  // state
            .groupBegin()
            .number("|(xxxx),(xxxx)")            // adc
            .number("(?:,(xxxx),(xxxx),(xxxx),(xxxx),(xxxx),(xxxx))?")
            .groupBegin()
            .number("|x{16}")                    // cell
            .number("|(xx)")                     // gsm
            .number("|(x{8})")                   // odometer
            .or()
            .number("|(x{9})")                   // odometer
            .groupBegin()
            .number("|(x{5,})")                  // rfid
            .groupEnd("?")
            .groupEnd("?")
            .groupEnd("?")
            .groupEnd("?")
            .any()
            .compile();

    private static final Pattern PATTERN_RFID = new PatternBuilder()
            .number("|(dd)(dd)(dd),")            // time (hhmmss)
            .number("(dd)(dd)(dd),")             // date (ddmmyy)
            .number("(d+)(dd.d+),")              // latitude
            .expression("([NS]),")
            .number("(d+)(dd.d+),")              // longitude
            .expression("([EW])")
            .compile();

    private static final Pattern PATTERN_OBD = new PatternBuilder()
            .number("(d+.d+),")                  // battery
            .number("(d+),")                     // rpm
            .number("(d+),")                     // speed
            .number("(d+.d+),")                  // throttle
            .number("(d+.d+),")                  // engine load
            .number("(-?d+),")                   // coolant temp
            .number("(d+.d+),")                  // instantaneous fuel
            .number("(d+.d+),")                  // average fuel
            .number("(d+.d+),")                  // driving range
            .number("(d+.?d*),")                 // odometer
            .number("(d+.d+),")                  // single fuel consumption
            .number("(d+.d+),")                  // total fuel consumption
            .number("(d+),")                     // error code count
            .number("(d+),")                     // harsh acceleration count
            .number("(d+)")                      // harsh break count
            .compile();

    private static final Pattern PATTERN_OBDA = new PatternBuilder()
            .number("(d+),")                     // total ignition
            .number("(d+.d+),")                  // total driving time
            .number("(d+.d+),")                  // total idling time
            .number("(d+),")                     // average hot start time
            .number("(d+),")                     // average speed
            .number("(d+),")                     // history highest speed
            .number("(d+),")                     // history highest rpm
            .number("(d+),")                     // total harsh acceleration
            .number("(d+)")                      // total harsh break n0
            .compile();

    public static final int MSG_HEARTBEAT = 0x0001;
    public static final int MSG_SERVER = 0x0002;
    public static final int MSG_LOGIN = 0x5000;
    public static final int MSG_LOGIN_RESPONSE = 0x4000;
    public static final int MSG_POSITION = 0x9955;
    public static final int MSG_POSITION_LOGGED = 0x9016;
    public static final int MSG_ALARM = 0x9999;
    public static final int MSG_RFID = 0x9966;

    public static final int MSG_OBD_RT = 0x9901;
    public static final int MSG_OBD_RTA = 0x9902;

    private DeviceSession identify(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16081);
        __CLR4_5_2cencenlwydyjqs.R.inc(16082);StringBuilder builder = new StringBuilder();

        __CLR4_5_2cencenlwydyjqs.R.inc(16083);for (int i = 0; (((i < 7)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16084)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16085)==0&false)); i++) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16086);int b = buf.readUnsignedByte();

            // First digit
            __CLR4_5_2cencenlwydyjqs.R.inc(16087);int d1 = (b & 0xf0) >> 4;
            __CLR4_5_2cencenlwydyjqs.R.inc(16088);if ((((d1 == 0xf)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16089)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16090)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16091);break;
            }
            }__CLR4_5_2cencenlwydyjqs.R.inc(16092);builder.append(d1);

            // Second digit
            __CLR4_5_2cencenlwydyjqs.R.inc(16093);int d2 = b & 0x0f;
            __CLR4_5_2cencenlwydyjqs.R.inc(16094);if ((((d2 == 0xf)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16095)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16096)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16097);break;
            }
            }__CLR4_5_2cencenlwydyjqs.R.inc(16098);builder.append(d2);
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16099);String id = builder.toString();

        __CLR4_5_2cencenlwydyjqs.R.inc(16100);if ((((id.length() == 14)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16101)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16102)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16103);return getDeviceSession(channel, remoteAddress, id, id + Checksum.luhn(Long.parseLong(id)));
        } }else {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16104);return getDeviceSession(channel, remoteAddress, id);
        }
    }}finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private static void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int type, ChannelBuffer msg) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16105);

        __CLR4_5_2cencenlwydyjqs.R.inc(16106);if ((((channel != null)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16107)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16108)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16109);ChannelBuffer buf = ChannelBuffers.buffer(
                    2 + 2 + id.readableBytes() + 2 + msg.readableBytes() + 2 + 2);

            __CLR4_5_2cencenlwydyjqs.R.inc(16110);buf.writeByte('@');
            __CLR4_5_2cencenlwydyjqs.R.inc(16111);buf.writeByte('@');
            __CLR4_5_2cencenlwydyjqs.R.inc(16112);buf.writeShort(buf.capacity());
            __CLR4_5_2cencenlwydyjqs.R.inc(16113);buf.writeBytes(id);
            __CLR4_5_2cencenlwydyjqs.R.inc(16114);buf.writeShort(type);
            __CLR4_5_2cencenlwydyjqs.R.inc(16115);buf.writeBytes(msg);
            __CLR4_5_2cencenlwydyjqs.R.inc(16116);buf.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, buf.toByteBuffer()));
            __CLR4_5_2cencenlwydyjqs.R.inc(16117);buf.writeByte('\r');
            __CLR4_5_2cencenlwydyjqs.R.inc(16118);buf.writeByte('\n');

            __CLR4_5_2cencenlwydyjqs.R.inc(16119);channel.write(buf, remoteAddress);
        }
    }}finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private String getServer(Channel channel) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16120);
        __CLR4_5_2cencenlwydyjqs.R.inc(16121);String server = Context.getConfig().getString(getProtocolName() + ".server");
        __CLR4_5_2cencenlwydyjqs.R.inc(16122);if ((((server == null)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16123)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16124)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16125);InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
            __CLR4_5_2cencenlwydyjqs.R.inc(16126);server = address.getAddress().getHostAddress() + ":" + address.getPort();
        }
        }__CLR4_5_2cencenlwydyjqs.R.inc(16127);return server;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16128);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2cencenlwydyjqs.R.inc(16129);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16130);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16131);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16132);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16133);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16134);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16135);return Position.ALARM_OVERSPEED;
            case 0x12:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16136);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16137);return Position.ALARM_MOVEMENT;
            case 0x13:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16138);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16139);return Position.ALARM_GEOFENCE_ENTER;
            case 0x50:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16140);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16141);return Position.ALARM_POWER_OFF;
            case 0x53:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16142);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16143);return Position.ALARM_GPS_ANTENNA_CUT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2cencenlwydyjqs.R.inc(16144);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cencenlwydyjqs.R.inc(16145);return null;
        }
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private Position decodeRegular(Position position, String sentence) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16146);
        __CLR4_5_2cencenlwydyjqs.R.inc(16147);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2cencenlwydyjqs.R.inc(16148);if ((((!parser.matches())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16149)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16150)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16151);return null;
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16152);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2cencenlwydyjqs.R.inc(16153);position.setValid(parser.next().equals("A"));
        __CLR4_5_2cencenlwydyjqs.R.inc(16154);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2cencenlwydyjqs.R.inc(16155);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2cencenlwydyjqs.R.inc(16156);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16157)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16158)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16159);position.setSpeed(parser.nextDouble(0));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16160);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16161)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16162)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16163);position.setCourse(parser.nextDouble(0));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16164);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16165);position.setTime(dateBuilder.getDate());

        __CLR4_5_2cencenlwydyjqs.R.inc(16166);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_2cencenlwydyjqs.R.inc(16167);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16168)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16169)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16170);position.setAltitude(parser.nextDouble(0));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16171);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2cencenlwydyjqs.R.inc(16172);for (int i = 1; (((i <= 8)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16173)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16174)==0&false)); i++) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16175);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16176)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16177)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16178);position.set(Position.PREFIX_ADC + i, parser.nextHexInt(0));
            }
        }}

        }__CLR4_5_2cencenlwydyjqs.R.inc(16179);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16180)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16181)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16182);position.set(Position.KEY_RSSI, parser.nextHexInt(0));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16183);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16184)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16185)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16186);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }
        }__CLR4_5_2cencenlwydyjqs.R.inc(16187);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16188)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16189)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16190);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16191);if ((((parser.hasNext())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16192)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16193)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16194);position.set(Position.KEY_DRIVER_UNIQUE_ID, String.valueOf(parser.nextHexInt(0)));
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16195);return position;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private Position decodeRfid(Position position, String sentence) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16196);
        __CLR4_5_2cencenlwydyjqs.R.inc(16197);Parser parser = new Parser(PATTERN_RFID, sentence);
        __CLR4_5_2cencenlwydyjqs.R.inc(16198);if ((((!parser.matches())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16199)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16200)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16201);return null;
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16202);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));

        __CLR4_5_2cencenlwydyjqs.R.inc(16203);position.setValid(true);
        __CLR4_5_2cencenlwydyjqs.R.inc(16204);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2cencenlwydyjqs.R.inc(16205);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2cencenlwydyjqs.R.inc(16206);return position;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private Position decodeObd(Position position, String sentence) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16207);
        __CLR4_5_2cencenlwydyjqs.R.inc(16208);Parser parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_2cencenlwydyjqs.R.inc(16209);if ((((!parser.matches())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16210)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16211)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16212);return null;
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16213);getLastLocation(position, null);

        __CLR4_5_2cencenlwydyjqs.R.inc(16214);position.set(Position.KEY_BATTERY, parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16215);position.set(Position.KEY_RPM, parser.nextInt());
        __CLR4_5_2cencenlwydyjqs.R.inc(16216);position.set(Position.KEY_OBD_SPEED, parser.nextInt());
        __CLR4_5_2cencenlwydyjqs.R.inc(16217);position.set(Position.KEY_THROTTLE, parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16218);position.set(Position.KEY_ENGINE_LOAD, parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16219);position.set(Position.KEY_COOLANT_TEMP, parser.nextInt());
        __CLR4_5_2cencenlwydyjqs.R.inc(16220);position.set(Position.KEY_FUEL_CONSUMPTION, parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16221);position.set("averageFuelConsumption", parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16222);position.set("drivingRange", parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16223);position.set(Position.KEY_ODOMETER, parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16224);position.set("singleFuelConsumption", parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16225);position.set("totalFuelConsumption", parser.nextDouble());
        __CLR4_5_2cencenlwydyjqs.R.inc(16226);position.set(Position.KEY_DTCS, parser.nextInt());
        __CLR4_5_2cencenlwydyjqs.R.inc(16227);position.set("harshAcelerationNo", parser.nextInt());
        __CLR4_5_2cencenlwydyjqs.R.inc(16228);position.set("harshBreakerNo", parser.nextInt());

        __CLR4_5_2cencenlwydyjqs.R.inc(16229);return position;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    private Position decodeObdA(Position position, String sentence) {try{__CLR4_5_2cencenlwydyjqs.R.inc(16230);
        __CLR4_5_2cencenlwydyjqs.R.inc(16231);Parser parser = new Parser(PATTERN_OBDA, sentence);
        __CLR4_5_2cencenlwydyjqs.R.inc(16232);if ((((!parser.matches())&&(__CLR4_5_2cencenlwydyjqs.R.iget(16233)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16234)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16235);return null;
        }

        }__CLR4_5_2cencenlwydyjqs.R.inc(16236);getLastLocation(position, null);

        __CLR4_5_2cencenlwydyjqs.R.inc(16237);position.set("totalIgnitionNo", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16238);position.set("totalDrivingTime", parser.nextDouble(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16239);position.set("totalIdlingTime", parser.nextDouble(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16240);position.set("averageHotStartTime", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16241);position.set("averageSpeed", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16242);position.set("historyHighestSpeed", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16243);position.set("historyHighestRpm", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16244);position.set("totalHarshAccerleration", parser.nextInt(0));
        __CLR4_5_2cencenlwydyjqs.R.inc(16245);position.set("totalHarshBrake", parser.nextInt(0));

        __CLR4_5_2cencenlwydyjqs.R.inc(16246);return position;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cencenlwydyjqs.R.inc(16247);

        __CLR4_5_2cencenlwydyjqs.R.inc(16248);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2cencenlwydyjqs.R.inc(16249);buf.skipBytes(2); // header
        __CLR4_5_2cencenlwydyjqs.R.inc(16250);buf.readShort(); // length
        __CLR4_5_2cencenlwydyjqs.R.inc(16251);ChannelBuffer id = buf.readBytes(7);
        __CLR4_5_2cencenlwydyjqs.R.inc(16252);int command = buf.readUnsignedShort();
        __CLR4_5_2cencenlwydyjqs.R.inc(16253);ChannelBuffer response;

        __CLR4_5_2cencenlwydyjqs.R.inc(16254);if ((((channel != null)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16255)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16256)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16257);if ((((command == MSG_LOGIN)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16258)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16259)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16260);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2cencenlwydyjqs.R.inc(16261);sendResponse(channel, remoteAddress, id, MSG_LOGIN_RESPONSE, response);
                __CLR4_5_2cencenlwydyjqs.R.inc(16262);return null;
            } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16263);if ((((command == MSG_HEARTBEAT)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16264)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16265)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16266);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2cencenlwydyjqs.R.inc(16267);sendResponse(channel, remoteAddress, id, MSG_HEARTBEAT, response);
                __CLR4_5_2cencenlwydyjqs.R.inc(16268);return null;
            } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16269);if ((((command == MSG_SERVER)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16270)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16271)==0&false))) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16272);response = ChannelBuffers.copiedBuffer(getServer(channel), StandardCharsets.US_ASCII);
                __CLR4_5_2cencenlwydyjqs.R.inc(16273);sendResponse(channel, remoteAddress, id, MSG_SERVER, response);
                __CLR4_5_2cencenlwydyjqs.R.inc(16274);return null;
            }
        }}}}

        }__CLR4_5_2cencenlwydyjqs.R.inc(16275);Position position = new Position();
        __CLR4_5_2cencenlwydyjqs.R.inc(16276);position.setProtocol(getProtocolName());

        __CLR4_5_2cencenlwydyjqs.R.inc(16277);if ((((command == MSG_ALARM)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16278)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16279)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16280);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
        } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16281);if ((((command == MSG_POSITION_LOGGED)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16282)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16283)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16284);buf.skipBytes(6);
        }

        }}__CLR4_5_2cencenlwydyjqs.R.inc(16285);DeviceSession deviceSession = identify(id, channel, remoteAddress);
        __CLR4_5_2cencenlwydyjqs.R.inc(16286);if ((((deviceSession == null)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16287)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16288)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16289);return null;
        }
        }__CLR4_5_2cencenlwydyjqs.R.inc(16290);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2cencenlwydyjqs.R.inc(16291);if ((((command == MSG_RFID)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16292)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16293)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16294);for (int i = 0; (((i < 15)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16295)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16296)==0&false)); i++) {{
                __CLR4_5_2cencenlwydyjqs.R.inc(16297);long rfid = buf.readUnsignedInt();
                __CLR4_5_2cencenlwydyjqs.R.inc(16298);if ((((rfid != 0)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16299)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16300)==0&false))) {{
                    __CLR4_5_2cencenlwydyjqs.R.inc(16301);String card = String.format("%010d", rfid);
                    __CLR4_5_2cencenlwydyjqs.R.inc(16302);position.set("card" + (i + 1), card);
                    __CLR4_5_2cencenlwydyjqs.R.inc(16303);position.set(Position.KEY_DRIVER_UNIQUE_ID, card);
                }
            }}
        }}

        }__CLR4_5_2cencenlwydyjqs.R.inc(16304);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 4, StandardCharsets.US_ASCII);

        __CLR4_5_2cencenlwydyjqs.R.inc(16305);if ((((command == MSG_POSITION || command == MSG_POSITION_LOGGED || command == MSG_ALARM)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16306)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16307)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16308);return decodeRegular(position, sentence);
        } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16309);if ((((command == MSG_RFID)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16310)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16311)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16312);return decodeRfid(position, sentence);
        } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16313);if ((((command == MSG_OBD_RT)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16314)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16315)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16316);return decodeObd(position, sentence);
        } }else {__CLR4_5_2cencenlwydyjqs.R.inc(16317);if ((((command == MSG_OBD_RTA)&&(__CLR4_5_2cencenlwydyjqs.R.iget(16318)!=0|true))||(__CLR4_5_2cencenlwydyjqs.R.iget(16319)==0&false))) {{
            __CLR4_5_2cencenlwydyjqs.R.inc(16320);return decodeObdA(position, sentence);
        }

        }}}}__CLR4_5_2cencenlwydyjqs.R.inc(16321);return null;
    }finally{__CLR4_5_2cencenlwydyjqs.R.flushNeeded();}}

}
