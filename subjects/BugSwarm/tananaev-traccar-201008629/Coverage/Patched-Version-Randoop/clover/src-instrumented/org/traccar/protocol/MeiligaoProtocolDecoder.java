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

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2annannlx1e0hor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,14059,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MeiligaoProtocolDecoder(MeiligaoProtocol protocol) {
        super(protocol);__CLR4_5_2annannlx1e0hor.R.inc(13812);try{__CLR4_5_2annannlx1e0hor.R.inc(13811);
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .number("(dd)(dd)(dd).?(d+)?,")      // time
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
            .number("|(dd)(dd)(dd),")            // time
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

    private DeviceSession identify(ChannelBuffer buf, Channel channel, SocketAddress remoteAddress) {try{__CLR4_5_2annannlx1e0hor.R.inc(13813);
        __CLR4_5_2annannlx1e0hor.R.inc(13814);StringBuilder builder = new StringBuilder();

        __CLR4_5_2annannlx1e0hor.R.inc(13815);for (int i = 0; (((i < 7)&&(__CLR4_5_2annannlx1e0hor.R.iget(13816)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13817)==0&false)); i++) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13818);int b = buf.readUnsignedByte();

            // First digit
            __CLR4_5_2annannlx1e0hor.R.inc(13819);int d1 = (b & 0xf0) >> 4;
            __CLR4_5_2annannlx1e0hor.R.inc(13820);if ((((d1 == 0xf)&&(__CLR4_5_2annannlx1e0hor.R.iget(13821)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13822)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(13823);break;
            }
            }__CLR4_5_2annannlx1e0hor.R.inc(13824);builder.append(d1);

            // Second digit
            __CLR4_5_2annannlx1e0hor.R.inc(13825);int d2 = b & 0x0f;
            __CLR4_5_2annannlx1e0hor.R.inc(13826);if ((((d2 == 0xf)&&(__CLR4_5_2annannlx1e0hor.R.iget(13827)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13828)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(13829);break;
            }
            }__CLR4_5_2annannlx1e0hor.R.inc(13830);builder.append(d2);
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13831);String id = builder.toString();

        __CLR4_5_2annannlx1e0hor.R.inc(13832);if ((((id.length() == 14)&&(__CLR4_5_2annannlx1e0hor.R.iget(13833)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13834)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13835);return getDeviceSession(channel, remoteAddress, id, id + Checksum.luhn(Long.parseLong(id)));
        } }else {{
            __CLR4_5_2annannlx1e0hor.R.inc(13836);return getDeviceSession(channel, remoteAddress, id);
        }
    }}finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private static void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int type, ChannelBuffer msg) {try{__CLR4_5_2annannlx1e0hor.R.inc(13837);

        __CLR4_5_2annannlx1e0hor.R.inc(13838);if ((((channel != null)&&(__CLR4_5_2annannlx1e0hor.R.iget(13839)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13840)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13841);ChannelBuffer buf = ChannelBuffers.buffer(
                    2 + 2 + id.readableBytes() + 2 + msg.readableBytes() + 2 + 2);

            __CLR4_5_2annannlx1e0hor.R.inc(13842);buf.writeByte('@');
            __CLR4_5_2annannlx1e0hor.R.inc(13843);buf.writeByte('@');
            __CLR4_5_2annannlx1e0hor.R.inc(13844);buf.writeShort(buf.capacity());
            __CLR4_5_2annannlx1e0hor.R.inc(13845);buf.writeBytes(id);
            __CLR4_5_2annannlx1e0hor.R.inc(13846);buf.writeShort(type);
            __CLR4_5_2annannlx1e0hor.R.inc(13847);buf.writeBytes(msg);
            __CLR4_5_2annannlx1e0hor.R.inc(13848);buf.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, buf.toByteBuffer()));
            __CLR4_5_2annannlx1e0hor.R.inc(13849);buf.writeByte('\r');
            __CLR4_5_2annannlx1e0hor.R.inc(13850);buf.writeByte('\n');

            __CLR4_5_2annannlx1e0hor.R.inc(13851);channel.write(buf, remoteAddress);
        }
    }}finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private String getServer(Channel channel) {try{__CLR4_5_2annannlx1e0hor.R.inc(13852);
        __CLR4_5_2annannlx1e0hor.R.inc(13853);String server = Context.getConfig().getString(getProtocolName() + ".server");
        __CLR4_5_2annannlx1e0hor.R.inc(13854);if ((((server == null)&&(__CLR4_5_2annannlx1e0hor.R.iget(13855)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13856)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13857);InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
            __CLR4_5_2annannlx1e0hor.R.inc(13858);server = address.getAddress().getHostAddress() + ":" + address.getPort();
        }
        }__CLR4_5_2annannlx1e0hor.R.inc(13859);return server;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_2annannlx1e0hor.R.inc(13860);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2annannlx1e0hor.R.inc(13861);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13862);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13863);return Position.ALARM_SOS;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13864);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13865);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13866);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13867);return Position.ALARM_OVERSPEED;
            case 0x12:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13868);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13869);return Position.ALARM_MOVEMENT;
            case 0x13:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13870);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13871);return Position.ALARM_GEOFENCE_ENTER;
            case 0x50:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13872);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13873);return Position.ALARM_POWER_OFF;
            case 0x53:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13874);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13875);return Position.ALARM_GPS_ANTENNA_CUT;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2annannlx1e0hor.R.inc(13876);__CLB4_5_2_bool0=true;}
                __CLR4_5_2annannlx1e0hor.R.inc(13877);return null;
        }
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private Position decodeRegular(Position position, String sentence) {try{__CLR4_5_2annannlx1e0hor.R.inc(13878);
        __CLR4_5_2annannlx1e0hor.R.inc(13879);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2annannlx1e0hor.R.inc(13880);if ((((!parser.matches())&&(__CLR4_5_2annannlx1e0hor.R.iget(13881)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13882)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13883);return null;
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13884);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13885);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13886)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13887)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13888);dateBuilder.setMillis(parser.nextInt());
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13889);position.setValid(parser.next().equals("A"));
        __CLR4_5_2annannlx1e0hor.R.inc(13890);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2annannlx1e0hor.R.inc(13891);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2annannlx1e0hor.R.inc(13892);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13893)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13894)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13895);position.setSpeed(parser.nextDouble());
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13896);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13897)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13898)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13899);position.setCourse(parser.nextDouble());
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13900);dateBuilder.setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13901);position.setTime(dateBuilder.getDate());

        __CLR4_5_2annannlx1e0hor.R.inc(13902);position.set(Position.KEY_HDOP, parser.next());

        __CLR4_5_2annannlx1e0hor.R.inc(13903);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13904)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13905)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13906);position.setAltitude(parser.nextDouble());
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13907);position.set(Position.KEY_STATUS, parser.next());

        __CLR4_5_2annannlx1e0hor.R.inc(13908);for (int i = 1; (((i <= 8)&&(__CLR4_5_2annannlx1e0hor.R.iget(13909)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13910)==0&false)); i++) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13911);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13912)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13913)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(13914);position.set(Position.PREFIX_ADC + i, parser.nextInt(16));
            }
        }}

        }__CLR4_5_2annannlx1e0hor.R.inc(13915);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13916)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13917)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13918);position.set(Position.KEY_RSSI, parser.nextInt(16));
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13919);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13920)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13921)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13922);position.set(Position.KEY_ODOMETER, parser.nextLong(16));
        }
        }__CLR4_5_2annannlx1e0hor.R.inc(13923);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13924)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13925)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13926);position.set(Position.KEY_ODOMETER, parser.nextLong(16));
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13927);if ((((parser.hasNext())&&(__CLR4_5_2annannlx1e0hor.R.iget(13928)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13929)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13930);position.set(Position.KEY_RFID, parser.nextInt(16));
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13931);return position;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private Position decodeRfid(Position position, String sentence) {try{__CLR4_5_2annannlx1e0hor.R.inc(13932);
        __CLR4_5_2annannlx1e0hor.R.inc(13933);Parser parser = new Parser(PATTERN_RFID, sentence);
        __CLR4_5_2annannlx1e0hor.R.inc(13934);if ((((!parser.matches())&&(__CLR4_5_2annannlx1e0hor.R.iget(13935)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13936)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13937);return null;
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13938);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(), parser.nextInt(), parser.nextInt())
                .setDateReverse(parser.nextInt(), parser.nextInt(), parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13939);position.setTime(dateBuilder.getDate());

        __CLR4_5_2annannlx1e0hor.R.inc(13940);position.setValid(true);
        __CLR4_5_2annannlx1e0hor.R.inc(13941);position.setLatitude(parser.nextCoordinate());
        __CLR4_5_2annannlx1e0hor.R.inc(13942);position.setLongitude(parser.nextCoordinate());

        __CLR4_5_2annannlx1e0hor.R.inc(13943);return position;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private Position decodeObd(Position position, String sentence) {try{__CLR4_5_2annannlx1e0hor.R.inc(13944);
        __CLR4_5_2annannlx1e0hor.R.inc(13945);Parser parser = new Parser(PATTERN_OBD, sentence);
        __CLR4_5_2annannlx1e0hor.R.inc(13946);if ((((!parser.matches())&&(__CLR4_5_2annannlx1e0hor.R.iget(13947)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13948)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13949);return null;
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13950);getLastLocation(position, null);

        __CLR4_5_2annannlx1e0hor.R.inc(13951);position.set(Position.KEY_BATTERY, parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13952);position.set(Position.KEY_RPM, parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13953);position.set(Position.KEY_OBD_SPEED, parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13954);position.set(Position.KEY_THROTTLE, parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13955);position.set("engineLoad", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13956);position.set(Position.PREFIX_TEMP + 1, parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13957);position.set(Position.KEY_FUEL_CONSUMPTION, parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13958);position.set("averageFuelConsumition", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13959);position.set("drivingRange", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13960);position.set(Position.KEY_ODOMETER, parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13961);position.set("singleFuelConsumption", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13962);position.set("totalFuelConsumption", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13963);position.set(Position.KEY_DTCS, parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13964);position.set("harshAcelerationNo", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13965);position.set("harshBreakerNo", parser.nextInt());

        __CLR4_5_2annannlx1e0hor.R.inc(13966);return position;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    private Position decodeObdA(Position position, String sentence) {try{__CLR4_5_2annannlx1e0hor.R.inc(13967);
        __CLR4_5_2annannlx1e0hor.R.inc(13968);Parser parser = new Parser(PATTERN_OBDA, sentence);
        __CLR4_5_2annannlx1e0hor.R.inc(13969);if ((((!parser.matches())&&(__CLR4_5_2annannlx1e0hor.R.iget(13970)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13971)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13972);return null;
        }

        }__CLR4_5_2annannlx1e0hor.R.inc(13973);getLastLocation(position, null);

        __CLR4_5_2annannlx1e0hor.R.inc(13974);position.set("totalIgnitionNo", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13975);position.set("totalDrivingTime", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13976);position.set("totalIdlingTime", parser.nextDouble());
        __CLR4_5_2annannlx1e0hor.R.inc(13977);position.set("averageHotStartTime", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13978);position.set("averageSpeed", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13979);position.set("historyHighestSpeed", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13980);position.set("historyHighestRpm", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13981);position.set("totalHarshAccerleration", parser.nextInt());
        __CLR4_5_2annannlx1e0hor.R.inc(13982);position.set("totalHarshBrake", parser.nextInt());

        __CLR4_5_2annannlx1e0hor.R.inc(13983);return position;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2annannlx1e0hor.R.inc(13984);

        __CLR4_5_2annannlx1e0hor.R.inc(13985);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2annannlx1e0hor.R.inc(13986);buf.skipBytes(2); // header
        __CLR4_5_2annannlx1e0hor.R.inc(13987);buf.readShort(); // length
        __CLR4_5_2annannlx1e0hor.R.inc(13988);ChannelBuffer id = buf.readBytes(7);
        __CLR4_5_2annannlx1e0hor.R.inc(13989);int command = buf.readUnsignedShort();
        __CLR4_5_2annannlx1e0hor.R.inc(13990);ChannelBuffer response;

        __CLR4_5_2annannlx1e0hor.R.inc(13991);if ((((channel != null)&&(__CLR4_5_2annannlx1e0hor.R.iget(13992)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13993)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(13994);if ((((command == MSG_LOGIN)&&(__CLR4_5_2annannlx1e0hor.R.iget(13995)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(13996)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(13997);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2annannlx1e0hor.R.inc(13998);sendResponse(channel, remoteAddress, id, MSG_LOGIN_RESPONSE, response);
                __CLR4_5_2annannlx1e0hor.R.inc(13999);return null;
            } }else {__CLR4_5_2annannlx1e0hor.R.inc(14000);if ((((command == MSG_HEARTBEAT)&&(__CLR4_5_2annannlx1e0hor.R.iget(14001)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14002)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(14003);response = ChannelBuffers.wrappedBuffer(new byte[]{0x01});
                __CLR4_5_2annannlx1e0hor.R.inc(14004);sendResponse(channel, remoteAddress, id, MSG_HEARTBEAT, response);
                __CLR4_5_2annannlx1e0hor.R.inc(14005);return null;
            } }else {__CLR4_5_2annannlx1e0hor.R.inc(14006);if ((((command == MSG_SERVER)&&(__CLR4_5_2annannlx1e0hor.R.iget(14007)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14008)==0&false))) {{
                __CLR4_5_2annannlx1e0hor.R.inc(14009);response = ChannelBuffers.copiedBuffer(getServer(channel), StandardCharsets.US_ASCII);
                __CLR4_5_2annannlx1e0hor.R.inc(14010);sendResponse(channel, remoteAddress, id, MSG_SERVER, response);
                __CLR4_5_2annannlx1e0hor.R.inc(14011);return null;
            }
        }}}}

        }__CLR4_5_2annannlx1e0hor.R.inc(14012);Position position = new Position();
        __CLR4_5_2annannlx1e0hor.R.inc(14013);position.setProtocol(getProtocolName());

        __CLR4_5_2annannlx1e0hor.R.inc(14014);if ((((command == MSG_ALARM)&&(__CLR4_5_2annannlx1e0hor.R.iget(14015)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14016)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14017);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
        } }else {__CLR4_5_2annannlx1e0hor.R.inc(14018);if ((((command == MSG_POSITION_LOGGED)&&(__CLR4_5_2annannlx1e0hor.R.iget(14019)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14020)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14021);buf.skipBytes(6);
        }

        }}__CLR4_5_2annannlx1e0hor.R.inc(14022);DeviceSession deviceSession = identify(id, channel, remoteAddress);
        __CLR4_5_2annannlx1e0hor.R.inc(14023);if ((((deviceSession == null)&&(__CLR4_5_2annannlx1e0hor.R.iget(14024)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14025)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14026);return null;
        }
        }__CLR4_5_2annannlx1e0hor.R.inc(14027);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2annannlx1e0hor.R.inc(14028);if ((((command == MSG_RFID)&&(__CLR4_5_2annannlx1e0hor.R.iget(14029)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14030)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14031);for (int i = 0; (((i < 15)&&(__CLR4_5_2annannlx1e0hor.R.iget(14032)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14033)==0&false)); i++) {{
                __CLR4_5_2annannlx1e0hor.R.inc(14034);long rfid = buf.readUnsignedInt();
                __CLR4_5_2annannlx1e0hor.R.inc(14035);if ((((rfid != 0)&&(__CLR4_5_2annannlx1e0hor.R.iget(14036)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14037)==0&false))) {{
                    __CLR4_5_2annannlx1e0hor.R.inc(14038);String card = String.format("%010d", rfid);
                    __CLR4_5_2annannlx1e0hor.R.inc(14039);position.set("card" + (i + 1), card);
                    __CLR4_5_2annannlx1e0hor.R.inc(14040);position.set(Position.KEY_RFID, card);
                }
            }}
        }}

        }__CLR4_5_2annannlx1e0hor.R.inc(14041);String sentence = buf.toString(buf.readerIndex(), buf.readableBytes() - 4, StandardCharsets.US_ASCII);

        __CLR4_5_2annannlx1e0hor.R.inc(14042);if ((((command == MSG_POSITION || command == MSG_POSITION_LOGGED || command == MSG_ALARM)&&(__CLR4_5_2annannlx1e0hor.R.iget(14043)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14044)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14045);return decodeRegular(position, sentence);
        } }else {__CLR4_5_2annannlx1e0hor.R.inc(14046);if ((((command == MSG_RFID)&&(__CLR4_5_2annannlx1e0hor.R.iget(14047)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14048)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14049);return decodeRfid(position, sentence);
        } }else {__CLR4_5_2annannlx1e0hor.R.inc(14050);if ((((command == MSG_OBD_RT)&&(__CLR4_5_2annannlx1e0hor.R.iget(14051)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14052)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14053);return decodeObd(position, sentence);
        } }else {__CLR4_5_2annannlx1e0hor.R.inc(14054);if ((((command == MSG_OBD_RTA)&&(__CLR4_5_2annannlx1e0hor.R.iget(14055)!=0|true))||(__CLR4_5_2annannlx1e0hor.R.iget(14056)==0&false))) {{
            __CLR4_5_2annannlx1e0hor.R.inc(14057);return decodeObdA(position, sentence);
        }

        }}}}__CLR4_5_2annannlx1e0hor.R.inc(14058);return null;
    }finally{__CLR4_5_2annannlx1e0hor.R.flushNeeded();}}

}
