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

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cemcemlwye40to{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,16321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeiligaoProtocolDecoder(MeiligaoProtocol protocol) {
        super(protocol);__CLR4_5_2cemcemlwye40to.R.inc(16079);try{__CLR4_5_2cemcemlwye40to.R.inc(16078);
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

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

    private DeviceSession identify(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2cemcemlwye40to.R.inc(16080);
        __CLR4_5_2cemcemlwye40to.R.inc(16081);StringBuilder builder = new StringBuilder();

        __CLR4_5_2cemcemlwye40to.R.inc(16082);for (int i = 0; (((i < 7)&&(__CLR4_5_2cemcemlwye40to.R.iget(16083)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16084)==0&false)); i++) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16085);int b = buf.readUnsignedByte();

            // First digit
            __CLR4_5_2cemcemlwye40to.R.inc(16086);int d1 = (b & 0xf0) >> 4;
            __CLR4_5_2cemcemlwye40to.R.inc(16087);if ((((d1 == 0xf)&&(__CLR4_5_2cemcemlwye40to.R.iget(16088)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16089)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16090);break;
            }
            }__CLR4_5_2cemcemlwye40to.R.inc(16091);builder.append(d1);

            // Second digit
            __CLR4_5_2cemcemlwye40to.R.inc(16092);int d2 = b & 0x0f;
            __CLR4_5_2cemcemlwye40to.R.inc(16093);if ((((d2 == 0xf)&&(__CLR4_5_2cemcemlwye40to.R.iget(16094)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16095)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16096);break;
            }
            }__CLR4_5_2cemcemlwye40to.R.inc(16097);builder.append(d2);
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16098);String id = builder.toString();

        __CLR4_5_2cemcemlwye40to.R.inc(16099);if ((((id.length() == 14)&&(__CLR4_5_2cemcemlwye40to.R.iget(16100)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16101)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16102);return getDeviceSession(channel, remoteAddress, id, id + Checksum.luhn(Long.parseLong(id)));
        } }else {{
            __CLR4_5_2cemcemlwye40to.R.inc(16103);return getDeviceSession(channel, remoteAddress, id);
        }
    }}finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private static void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int type, ChannelBuffer msg) {try{__CLR4_5_2cemcemlwye40to.R.inc(16104);

        __CLR4_5_2cemcemlwye40to.R.inc(16105);if ((((channel != null)&&(__CLR4_5_2cemcemlwye40to.R.iget(16106)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16107)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16108);ChannelBuffer buf = ChannelBuffers.buffer(
                    2 + 2 + id.readableBytes() + 2 + msg.readableBytes() + 2 + 2);

            __CLR4_5_2cemcemlwye40to.R.inc(16109);buf.writeByte('@');
            __CLR4_5_2cemcemlwye40to.R.inc(16110);buf.writeByte('@');
            __CLR4_5_2cemcemlwye40to.R.inc(16111);buf.writeShort(buf.capacity());
            __CLR4_5_2cemcemlwye40to.R.inc(16112);buf.writeBytes(id);
            __CLR4_5_2cemcemlwye40to.R.inc(16113);buf.writeShort(type);
            __CLR4_5_2cemcemlwye40to.R.inc(16114);buf.writeBytes(msg);
            __CLR4_5_2cemcemlwye40to.R.inc(16115);buf.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, buf.toByteBuffer()));
            __CLR4_5_2cemcemlwye40to.R.inc(16116);buf.writeByte('\r');
            __CLR4_5_2cemcemlwye40to.R.inc(16117);buf.writeByte('\n');

            __CLR4_5_2cemcemlwye40to.R.inc(16118);channel.write(buf, remoteAddress);
        }
    }}finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private String getServer(Channel channel) {try{__CLR4_5_2cemcemlwye40to.R.inc(16119);
        __CLR4_5_2cemcemlwye40to.R.inc(16120);String server = Context.getConfig().getString(getProtocolName() + ".server");
        __CLR4_5_2cemcemlwye40to.R.inc(16121);if ((((server == null)&&(__CLR4_5_2cemcemlwye40to.R.iget(16122)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16123)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16124);InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
            __CLR4_5_2cemcemlwye40to.R.inc(16125);server = address.getAddress().getHostAddress() + ":" + address.getPort();
        }
        }__CLR4_5_2cemcemlwye40to.R.inc(16126);return server;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_2cemcemlwye40to.R.inc(16127);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2cemcemlwye40to.R.inc(16128);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16129);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16130);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16131);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16132);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16133);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16134);return Position.ALARM_OVERSPEED;
            case 0x12:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16135);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16136);return Position.ALARM_MOVEMENT;
            case 0x13:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16137);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16138);return Position.ALARM_GEOFENCE_ENTER;
            case 0x50:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16139);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16140);return Position.ALARM_POWER_OFF;
            case 0x53:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16141);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16142);return Position.ALARM_GPS_ANTENNA_CUT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2cemcemlwye40to.R.inc(16143);__CLB4_5_2_bool0=true;}
                __CLR4_5_2cemcemlwye40to.R.inc(16144);return null;
        }
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private Position decodeRegular(Position position, String sentence) {try{__CLR4_5_2cemcemlwye40to.R.inc(16145);
        __CLR4_5_2cemcemlwye40to.R.inc(16146);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2cemcemlwye40to.R.inc(16147);if ((((!parser.matches())&&(__CLR4_5_2cemcemlwye40to.R.iget(16148)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16149)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16150);return null;
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16151);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2cemcemlwye40to.R.inc(16152);position.setValid(parser.next().equals("A"));
        __CLR4_5_2cemcemlwye40to.R.inc(16153);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2cemcemlwye40to.R.inc(16154);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2cemcemlwye40to.R.inc(16155);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16156)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16157)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16158);position.setSpeed(parser.nextDouble(0));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16159);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16160)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16161)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16162);position.setCourse(parser.nextDouble(0));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16163);dateBuilder.setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16164);position.setTime(dateBuilder.getDate());

        __CLR4_5_2cemcemlwye40to.R.inc(16165);position.set(Position.KEY_HDOP, parser.nextDouble());

        __CLR4_5_2cemcemlwye40to.R.inc(16166);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16167)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16168)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16169);position.setAltitude(parser.nextDouble(0));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16170);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2cemcemlwye40to.R.inc(16171);for (int i = 1; (((i <= 8)&&(__CLR4_5_2cemcemlwye40to.R.iget(16172)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16173)==0&false)); i++) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16174);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16175)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16176)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16177);position.set(Position.PREFIX_ADC + i, parser.nextHexInt(0));
            }
        }}

        }__CLR4_5_2cemcemlwye40to.R.inc(16178);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16179)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16180)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16181);position.set(Position.KEY_RSSI, parser.nextHexInt(0));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16182);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16183)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16184)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16185);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }
        }__CLR4_5_2cemcemlwye40to.R.inc(16186);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16187)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16188)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16189);position.set(Position.KEY_ODOMETER, parser.nextLong(16, 0));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16190);if ((((parser.hasNext())&&(__CLR4_5_2cemcemlwye40to.R.iget(16191)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16192)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16193);position.set(Position.KEY_DRIVER_UNIQUE_ID, String.valueOf(parser.nextHexInt(0)));
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16194);return position;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private Position decodeRfid(Position position, String sentence) {try{__CLR4_5_2cemcemlwye40to.R.inc(16195);
        __CLR4_5_2cemcemlwye40to.R.inc(16196);Parser parser = new Parser(PATTERN_RFID, sentence);
        __CLR4_5_2cemcemlwye40to.R.inc(16197);if ((((!parser.matches())&&(__CLR4_5_2cemcemlwye40to.R.iget(16198)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16199)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16200);return null;
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16201);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.HMS_DMY));

        __CLR4_5_2cemcemlwye40to.R.inc(16202);position.setValid(true);
        __CLR4_5_2cemcemlwye40to.R.inc(16203);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2cemcemlwye40to.R.inc(16204);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2cemcemlwye40to.R.inc(16205);return position;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private Position decodeObd(Position position, String sentence) {try{__CLR4_5_2cemcemlwye40to.R.inc(16206);
        __CLR4_5_2cemcemlwye40to.R.inc(16207);Parser parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_2cemcemlwye40to.R.inc(16208);if ((((!parser.matches())&&(__CLR4_5_2cemcemlwye40to.R.iget(16209)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16210)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16211);return null;
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16212);getLastLocation(position, null);

        __CLR4_5_2cemcemlwye40to.R.inc(16213);position.set(Position.KEY_BATTERY, parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16214);position.set(Position.KEY_RPM, parser.nextInt());
        __CLR4_5_2cemcemlwye40to.R.inc(16215);position.set(Position.KEY_OBD_SPEED, parser.nextInt());
        __CLR4_5_2cemcemlwye40to.R.inc(16216);position.set(Position.KEY_THROTTLE, parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16217);position.set(Position.KEY_ENGINE_LOAD, parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16218);position.set(Position.KEY_COOLANT_TEMP, parser.nextInt());
        __CLR4_5_2cemcemlwye40to.R.inc(16219);position.set(Position.KEY_FUEL_CONSUMPTION, parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16220);position.set("averageFuelConsumption", parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16221);position.set("drivingRange", parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16222);position.set(Position.KEY_ODOMETER, parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16223);position.set("singleFuelConsumption", parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16224);position.set("totalFuelConsumption", parser.nextDouble());
        __CLR4_5_2cemcemlwye40to.R.inc(16225);position.set(Position.KEY_DTCS, parser.nextInt());
        __CLR4_5_2cemcemlwye40to.R.inc(16226);position.set("harshAcelerationNo", parser.nextInt());
        __CLR4_5_2cemcemlwye40to.R.inc(16227);position.set("harshBreakerNo", parser.nextInt());

        __CLR4_5_2cemcemlwye40to.R.inc(16228);return position;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    private Position decodeObdA(Position position, String sentence) {try{__CLR4_5_2cemcemlwye40to.R.inc(16229);
        __CLR4_5_2cemcemlwye40to.R.inc(16230);Parser parser = new Parser(PATTERN_OBDA, sentence);
        __CLR4_5_2cemcemlwye40to.R.inc(16231);if ((((!parser.matches())&&(__CLR4_5_2cemcemlwye40to.R.iget(16232)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16233)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16234);return null;
        }

        }__CLR4_5_2cemcemlwye40to.R.inc(16235);getLastLocation(position, null);

        __CLR4_5_2cemcemlwye40to.R.inc(16236);position.set("totalIgnitionNo", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16237);position.set("totalDrivingTime", parser.nextDouble(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16238);position.set("totalIdlingTime", parser.nextDouble(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16239);position.set("averageHotStartTime", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16240);position.set("averageSpeed", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16241);position.set("historyHighestSpeed", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16242);position.set("historyHighestRpm", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16243);position.set("totalHarshAccerleration", parser.nextInt(0));
        __CLR4_5_2cemcemlwye40to.R.inc(16244);position.set("totalHarshBrake", parser.nextInt(0));

        __CLR4_5_2cemcemlwye40to.R.inc(16245);return position;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cemcemlwye40to.R.inc(16246);

        __CLR4_5_2cemcemlwye40to.R.inc(16247);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2cemcemlwye40to.R.inc(16248);buf.skipBytes(2); // header
        __CLR4_5_2cemcemlwye40to.R.inc(16249);buf.readShort(); // length
        __CLR4_5_2cemcemlwye40to.R.inc(16250);ChannelBuffer id = buf.readBytes(7);
        __CLR4_5_2cemcemlwye40to.R.inc(16251);int command = buf.readUnsignedShort();
        __CLR4_5_2cemcemlwye40to.R.inc(16252);ChannelBuffer response;

        __CLR4_5_2cemcemlwye40to.R.inc(16253);if ((((channel != null)&&(__CLR4_5_2cemcemlwye40to.R.iget(16254)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16255)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16256);if ((((command == MSG_LOGIN)&&(__CLR4_5_2cemcemlwye40to.R.iget(16257)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16258)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16259);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2cemcemlwye40to.R.inc(16260);sendResponse(channel, remoteAddress, id, MSG_LOGIN_RESPONSE, response);
                __CLR4_5_2cemcemlwye40to.R.inc(16261);return null;
            } }else {__CLR4_5_2cemcemlwye40to.R.inc(16262);if ((((command == MSG_HEARTBEAT)&&(__CLR4_5_2cemcemlwye40to.R.iget(16263)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16264)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16265);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2cemcemlwye40to.R.inc(16266);sendResponse(channel, remoteAddress, id, MSG_HEARTBEAT, response);
                __CLR4_5_2cemcemlwye40to.R.inc(16267);return null;
            } }else {__CLR4_5_2cemcemlwye40to.R.inc(16268);if ((((command == MSG_SERVER)&&(__CLR4_5_2cemcemlwye40to.R.iget(16269)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16270)==0&false))) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16271);response = ChannelBuffers.copiedBuffer(getServer(channel), StandardCharsets.US_ASCII);
                __CLR4_5_2cemcemlwye40to.R.inc(16272);sendResponse(channel, remoteAddress, id, MSG_SERVER, response);
                __CLR4_5_2cemcemlwye40to.R.inc(16273);return null;
            }
        }}}}

        }__CLR4_5_2cemcemlwye40to.R.inc(16274);Position position = new Position();
        __CLR4_5_2cemcemlwye40to.R.inc(16275);position.setProtocol(getProtocolName());

        __CLR4_5_2cemcemlwye40to.R.inc(16276);if ((((command == MSG_ALARM)&&(__CLR4_5_2cemcemlwye40to.R.iget(16277)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16278)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16279);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
        } }else {__CLR4_5_2cemcemlwye40to.R.inc(16280);if ((((command == MSG_POSITION_LOGGED)&&(__CLR4_5_2cemcemlwye40to.R.iget(16281)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16282)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16283);buf.skipBytes(6);
        }

        }}__CLR4_5_2cemcemlwye40to.R.inc(16284);DeviceSession deviceSession = identify(id, channel, remoteAddress);
        __CLR4_5_2cemcemlwye40to.R.inc(16285);if ((((deviceSession == null)&&(__CLR4_5_2cemcemlwye40to.R.iget(16286)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16287)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16288);return null;
        }
        }__CLR4_5_2cemcemlwye40to.R.inc(16289);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2cemcemlwye40to.R.inc(16290);if ((((command == MSG_RFID)&&(__CLR4_5_2cemcemlwye40to.R.iget(16291)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16292)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16293);for (int i = 0; (((i < 15)&&(__CLR4_5_2cemcemlwye40to.R.iget(16294)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16295)==0&false)); i++) {{
                __CLR4_5_2cemcemlwye40to.R.inc(16296);long rfid = buf.readUnsignedInt();
                __CLR4_5_2cemcemlwye40to.R.inc(16297);if ((((rfid != 0)&&(__CLR4_5_2cemcemlwye40to.R.iget(16298)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16299)==0&false))) {{
                    __CLR4_5_2cemcemlwye40to.R.inc(16300);String card = String.format("%010d", rfid);
                    __CLR4_5_2cemcemlwye40to.R.inc(16301);position.set("card" + (i + 1), card);
                    __CLR4_5_2cemcemlwye40to.R.inc(16302);position.set(Position.KEY_DRIVER_UNIQUE_ID, card);
                }
            }}
        }}

        }__CLR4_5_2cemcemlwye40to.R.inc(16303);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 4, StandardCharsets.US_ASCII);

        __CLR4_5_2cemcemlwye40to.R.inc(16304);if ((((command == MSG_POSITION || command == MSG_POSITION_LOGGED || command == MSG_ALARM)&&(__CLR4_5_2cemcemlwye40to.R.iget(16305)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16306)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16307);return decodeRegular(position, sentence);
        } }else {__CLR4_5_2cemcemlwye40to.R.inc(16308);if ((((command == MSG_RFID)&&(__CLR4_5_2cemcemlwye40to.R.iget(16309)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16310)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16311);return decodeRfid(position, sentence);
        } }else {__CLR4_5_2cemcemlwye40to.R.inc(16312);if ((((command == MSG_OBD_RT)&&(__CLR4_5_2cemcemlwye40to.R.iget(16313)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16314)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16315);return decodeObd(position, sentence);
        } }else {__CLR4_5_2cemcemlwye40to.R.inc(16316);if ((((command == MSG_OBD_RTA)&&(__CLR4_5_2cemcemlwye40to.R.iget(16317)!=0|true))||(__CLR4_5_2cemcemlwye40to.R.iget(16318)==0&false))) {{
            __CLR4_5_2cemcemlwye40to.R.inc(16319);return decodeObdA(position, sentence);
        }

        }}}}__CLR4_5_2cemcemlwye40to.R.inc(16320);return null;
    }finally{__CLR4_5_2cemcemlwye40to.R.flushNeeded();}}

}
