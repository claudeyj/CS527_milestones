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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Device;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gt06ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2amcamclwydzo8q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,14180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean forceTimeZone = false;
    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    private int serverIndex;

    private final Map<Integer, ChannelBuffer> photos = new HashMap<>();

    public Gt06ProtocolDecoder(Gt06Protocol protocol) {
        super(protocol);__CLR4_5_2amcamclwydzo8q.R.inc(13765);try{__CLR4_5_2amcamclwydzo8q.R.inc(13764);

        __CLR4_5_2amcamclwydzo8q.R.inc(13766);if ((((Context.getConfig().hasKey(getProtocolName() + ".timezone"))&&(__CLR4_5_2amcamclwydzo8q.R.iget(13767)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13768)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13769);forceTimeZone = true;
            __CLR4_5_2amcamclwydzo8q.R.inc(13770);timeZone.setRawOffset(Context.getConfig().getInteger(getProtocolName() + ".timezone") * 1000);
        }
    }}finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x01;
    public static final int MSG_GPS = 0x10;
    public static final int MSG_LBS = 0x11;
    public static final int MSG_GPS_LBS_1 = 0x12;
    public static final int MSG_GPS_LBS_2 = 0x22;
    public static final int MSG_STATUS = 0x13;
    public static final int MSG_SATELLITE = 0x14;
    public static final int MSG_STRING = 0x15;
    public static final int MSG_GPS_LBS_STATUS_1 = 0x16;
    public static final int MSG_GPS_LBS_STATUS_2 = 0x26;
    public static final int MSG_GPS_LBS_STATUS_3 = 0x27;
    public static final int MSG_LBS_WIFI = 0x2C;
    public static final int MSG_LBS_PHONE = 0x17;
    public static final int MSG_LBS_EXTEND = 0x18;
    public static final int MSG_LBS_STATUS = 0x19;
    public static final int MSG_GPS_PHONE = 0x1A;
    public static final int MSG_GPS_LBS_EXTEND = 0x1E;
    public static final int MSG_AZ735_GPS = 0x32;
    public static final int MSG_AZ735_ALARM = 0x33;
    public static final int MSG_X1_GPS = 0x34;
    public static final int MSG_X1_PHOTO_INFO = 0x35;
    public static final int MSG_X1_PHOTO_DATA = 0x36;
    public static final int MSG_COMMAND_0 = 0x80;
    public static final int MSG_COMMAND_1 = 0x81;
    public static final int MSG_COMMAND_2 = 0x82;
    public static final int MSG_INFO = 0x94;
    public static final int MSG_STRING_INFO = 0x21;

    private static boolean isSupported(int type) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13771);
        __CLR4_5_2amcamclwydzo8q.R.inc(13772);return hasGps(type) || hasLbs(type) || hasStatus(type);
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private static boolean hasGps(int type) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13773);
        __CLR4_5_2amcamclwydzo8q.R.inc(13774);return type == MSG_GPS || type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2
                || type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3
                || type == MSG_GPS_PHONE || type == MSG_GPS_LBS_EXTEND;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private static boolean hasLbs(int type) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13775);
        __CLR4_5_2amcamclwydzo8q.R.inc(13776);return type == MSG_LBS || type == MSG_LBS_STATUS || type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2
                || type == MSG_GPS_LBS_STATUS_1 || type ==  MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private static boolean hasStatus(int type) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13777);
        __CLR4_5_2amcamclwydzo8q.R.inc(13778);return type == MSG_STATUS || type == MSG_LBS_STATUS
                || type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private void sendResponse(Channel channel, boolean extended, int type) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13779);
        __CLR4_5_2amcamclwydzo8q.R.inc(13780);if ((((channel != null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13781)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13782)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13783);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2amcamclwydzo8q.R.inc(13784);if ((((extended)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13785)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13786)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13787);response.writeShort(0x7979);
                __CLR4_5_2amcamclwydzo8q.R.inc(13788);response.writeShort(5);
            } }else {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13789);response.writeShort(0x7878);
                __CLR4_5_2amcamclwydzo8q.R.inc(13790);response.writeByte(5);
            }
            }__CLR4_5_2amcamclwydzo8q.R.inc(13791);response.writeByte(type);
            __CLR4_5_2amcamclwydzo8q.R.inc(13792);response.writeShort(++serverIndex);
            __CLR4_5_2amcamclwydzo8q.R.inc(13793);response.writeShort(Checksum.crc16(Checksum.CRC16_X25,
                    response.toByteBuffer(2, response.writerIndex() - 2)));
            __CLR4_5_2amcamclwydzo8q.R.inc(13794);response.writeByte('\r'); __CLR4_5_2amcamclwydzo8q.R.inc(13795);response.writeByte('\n'); // ending
            __CLR4_5_2amcamclwydzo8q.R.inc(13796);channel.write(response);
        }
    }}finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private void sendPhotoRequest(Channel channel, int pictureId) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13797);
        __CLR4_5_2amcamclwydzo8q.R.inc(13798);if ((((channel != null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13799)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13800)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13801);ChannelBuffer photo = photos.get(pictureId);
            __CLR4_5_2amcamclwydzo8q.R.inc(13802);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2amcamclwydzo8q.R.inc(13803);response.writeShort(0x7878); // header
            __CLR4_5_2amcamclwydzo8q.R.inc(13804);response.writeByte(15); // size
            __CLR4_5_2amcamclwydzo8q.R.inc(13805);response.writeByte(MSG_X1_PHOTO_DATA);
            __CLR4_5_2amcamclwydzo8q.R.inc(13806);response.writeInt(pictureId);
            __CLR4_5_2amcamclwydzo8q.R.inc(13807);response.writeInt(photo.writerIndex());
            __CLR4_5_2amcamclwydzo8q.R.inc(13808);response.writeShort(Math.min(photo.writableBytes(), 1024));
            __CLR4_5_2amcamclwydzo8q.R.inc(13809);response.writeShort(++serverIndex);
            __CLR4_5_2amcamclwydzo8q.R.inc(13810);response.writeShort(Checksum.crc16(Checksum.CRC16_X25,
                    response.toByteBuffer(2, response.writerIndex() - 2)));
            __CLR4_5_2amcamclwydzo8q.R.inc(13811);response.writeByte('\r'); __CLR4_5_2amcamclwydzo8q.R.inc(13812);response.writeByte('\n'); // ending
            __CLR4_5_2amcamclwydzo8q.R.inc(13813);channel.write(response);
        }
    }}finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private boolean decodeGps(Position position, ChannelBuffer buf, boolean hasLength) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13814);

        __CLR4_5_2amcamclwydzo8q.R.inc(13815);DateBuilder dateBuilder = new DateBuilder(timeZone)
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_2amcamclwydzo8q.R.inc(13816);position.setTime(dateBuilder.getDate());

        __CLR4_5_2amcamclwydzo8q.R.inc(13817);if ((((hasLength && buf.readUnsignedByte() == 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13818)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13819)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13820);return false;
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13821);int length = buf.readUnsignedByte();
        __CLR4_5_2amcamclwydzo8q.R.inc(13822);position.set(Position.KEY_SATELLITES, BitUtil.to(length, 4));
        __CLR4_5_2amcamclwydzo8q.R.inc(13823);length = BitUtil.from(length, 4);

        __CLR4_5_2amcamclwydzo8q.R.inc(13824);double latitude = buf.readUnsignedInt() / 60.0 / 30000.0;
        __CLR4_5_2amcamclwydzo8q.R.inc(13825);double longitude = buf.readUnsignedInt() / 60.0 / 30000.0;
        __CLR4_5_2amcamclwydzo8q.R.inc(13826);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

        __CLR4_5_2amcamclwydzo8q.R.inc(13827);int flags = buf.readUnsignedShort();
        __CLR4_5_2amcamclwydzo8q.R.inc(13828);position.setCourse(BitUtil.to(flags, 10));
        __CLR4_5_2amcamclwydzo8q.R.inc(13829);position.setValid(BitUtil.check(flags, 12));

        __CLR4_5_2amcamclwydzo8q.R.inc(13830);if ((((!BitUtil.check(flags, 10))&&(__CLR4_5_2amcamclwydzo8q.R.iget(13831)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13832)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13833);latitude = -latitude;
        }
        }__CLR4_5_2amcamclwydzo8q.R.inc(13834);if ((((BitUtil.check(flags, 11))&&(__CLR4_5_2amcamclwydzo8q.R.iget(13835)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13836)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13837);longitude = -longitude;
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13838);position.setLatitude(latitude);
        __CLR4_5_2amcamclwydzo8q.R.inc(13839);position.setLongitude(longitude);

        __CLR4_5_2amcamclwydzo8q.R.inc(13840);if ((((BitUtil.check(flags, 14))&&(__CLR4_5_2amcamclwydzo8q.R.iget(13841)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13842)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13843);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 15));
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13844);if ((((length > 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13845)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13846)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13847);buf.skipBytes(length - 12); // skip reserved
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13848);return true;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private boolean decodeLbs(Position position, ChannelBuffer buf, boolean hasLength) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13849);

        __CLR4_5_2amcamclwydzo8q.R.inc(13850);int length = 0;
        __CLR4_5_2amcamclwydzo8q.R.inc(13851);if ((((hasLength)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13852)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13853)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13854);length = buf.readUnsignedByte();
            __CLR4_5_2amcamclwydzo8q.R.inc(13855);if ((((length == 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13856)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13857)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13858);return false;
            }
        }}

        }__CLR4_5_2amcamclwydzo8q.R.inc(13859);position.setNetwork(new Network(CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedByte(), buf.readUnsignedShort(), buf.readUnsignedMedium())));

        __CLR4_5_2amcamclwydzo8q.R.inc(13860);if ((((length > 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13861)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13862)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13863);buf.skipBytes(length - 8);
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13864);return true;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private boolean decodeStatus(Position position, ChannelBuffer buf) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13865);

        __CLR4_5_2amcamclwydzo8q.R.inc(13866);int status = buf.readUnsignedByte();

        __CLR4_5_2amcamclwydzo8q.R.inc(13867);position.set(Position.KEY_STATUS, status);
        __CLR4_5_2amcamclwydzo8q.R.inc(13868);position.set(Position.KEY_IGNITION, BitUtil.check(status, 1));
        __CLR4_5_2amcamclwydzo8q.R.inc(13869);position.set(Position.KEY_CHARGE, BitUtil.check(status, 2));
        __CLR4_5_2amcamclwydzo8q.R.inc(13870);position.set(Position.KEY_BLOCKED, BitUtil.check(status, 7));

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2amcamclwydzo8q.R.inc(13871);switch (BitUtil.between(status, 3, 6)) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2amcamclwydzo8q.R.inc(13872);__CLB4_5_2_bool0=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13873);position.set(Position.KEY_ALARM, Position.ALARM_SHOCK);
                __CLR4_5_2amcamclwydzo8q.R.inc(13874);break;
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2amcamclwydzo8q.R.inc(13875);__CLB4_5_2_bool0=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13876);position.set(Position.KEY_ALARM, Position.ALARM_POWER_CUT);
                __CLR4_5_2amcamclwydzo8q.R.inc(13877);break;
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2amcamclwydzo8q.R.inc(13878);__CLB4_5_2_bool0=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13879);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                __CLR4_5_2amcamclwydzo8q.R.inc(13880);break;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2amcamclwydzo8q.R.inc(13881);__CLB4_5_2_bool0=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13882);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
                __CLR4_5_2amcamclwydzo8q.R.inc(13883);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2amcamclwydzo8q.R.inc(13884);__CLB4_5_2_bool0=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13885);break;
        }

        __CLR4_5_2amcamclwydzo8q.R.inc(13886);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
        __CLR4_5_2amcamclwydzo8q.R.inc(13887);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
        __CLR4_5_2amcamclwydzo8q.R.inc(13888);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));

        __CLR4_5_2amcamclwydzo8q.R.inc(13889);return true;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13890);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2amcamclwydzo8q.R.inc(13891);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13892);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13893);return Position.ALARM_SOS;
            case 0x02:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13894);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13895);return Position.ALARM_POWER_CUT;
            case 0x03:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13896);__CLB4_5_2_bool1=true;}
            case 0x09:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13897);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13898);return Position.ALARM_VIBRATION;
            case 0x04:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13899);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13900);return Position.ALARM_GEOFENCE_ENTER;
            case 0x05:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13901);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13902);return Position.ALARM_GEOFENCE_EXIT;
            case 0x06:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13903);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13904);return Position.ALARM_OVERSPEED;
            case 0x0E:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13905);__CLB4_5_2_bool1=true;}
            case 0x0F:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13906);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13907);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13908);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13909);return Position.ALARM_POWER_OFF;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2amcamclwydzo8q.R.inc(13910);__CLB4_5_2_bool1=true;}
                __CLR4_5_2amcamclwydzo8q.R.inc(13911);return null;
        }
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private static final Pattern PATTERN_FUEL = new PatternBuilder()
            .text("!AIOIL,")
            .number("d+,")                       // device address
            .number("d+.d+,")                    // output value
            .number("(d+.d+),")                  // temperature
            .expression("[^,]+,")                // version
            .number("dd")                        // back wave
            .number("d")                         // software status code
            .number("d,")                        // hardware status code
            .number("(d+.d+),")                  // measured value
            .expression("[01],")                 // movement status
            .number("d+,")                       // excited wave times
            .number("xx")                        // checksum
            .compile();

    private Position decodeFuelData(Position position, String sentence) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13912);
        __CLR4_5_2amcamclwydzo8q.R.inc(13913);Parser parser = new Parser(PATTERN_FUEL, sentence);
        __CLR4_5_2amcamclwydzo8q.R.inc(13914);if ((((!parser.matches())&&(__CLR4_5_2amcamclwydzo8q.R.iget(13915)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13916)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13917);return null;
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13918);position.set(Position.PREFIX_TEMP + 1, parser.nextDouble(0));
        __CLR4_5_2amcamclwydzo8q.R.inc(13919);position.set(Position.KEY_FUEL_LEVEL, parser.nextDouble(0));

        __CLR4_5_2amcamclwydzo8q.R.inc(13920);return position;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private static final Pattern PATTERN_LOCATION = new PatternBuilder()
            .text("Current position!")
            .number("Lat:([NS])(d+.d+),")        // latitude
            .number("Lon:([EW])(d+.d+),")        // longitude
            .text("Course:").number("(d+.d+),")  // course
            .text("Speed:").number("(d+.d+),")   // speed
            .text("DateTime:")
            .number("(dddd)-(dd)-(dd)  ")        // date
            .number("(dd):(dd):(dd)")            // time
            .compile();

    private Position decodeLocationString(Position position, String sentence) {try{__CLR4_5_2amcamclwydzo8q.R.inc(13921);
        __CLR4_5_2amcamclwydzo8q.R.inc(13922);Parser parser = new Parser(PATTERN_LOCATION, sentence);
        __CLR4_5_2amcamclwydzo8q.R.inc(13923);if ((((!parser.matches())&&(__CLR4_5_2amcamclwydzo8q.R.iget(13924)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13925)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13926);return null;
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(13927);position.setValid(true);
        __CLR4_5_2amcamclwydzo8q.R.inc(13928);position.setLatitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_2amcamclwydzo8q.R.inc(13929);position.setLongitude(parser.nextCoordinate(Parser.CoordinateFormat.HEM_DEG));
        __CLR4_5_2amcamclwydzo8q.R.inc(13930);position.setCourse(parser.nextDouble());
        __CLR4_5_2amcamclwydzo8q.R.inc(13931);position.setSpeed(parser.nextDouble());
        __CLR4_5_2amcamclwydzo8q.R.inc(13932);position.setTime(parser.nextDateTime(Parser.DateTimeFormat.YMD_HMS));

        __CLR4_5_2amcamclwydzo8q.R.inc(13933);return position;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private Object decodeBasic(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2amcamclwydzo8q.R.inc(13934);

        __CLR4_5_2amcamclwydzo8q.R.inc(13935);int length = buf.readUnsignedByte();
        __CLR4_5_2amcamclwydzo8q.R.inc(13936);int dataLength = length - 5;
        __CLR4_5_2amcamclwydzo8q.R.inc(13937);int type = buf.readUnsignedByte();

        __CLR4_5_2amcamclwydzo8q.R.inc(13938);DeviceSession deviceSession = null;
        __CLR4_5_2amcamclwydzo8q.R.inc(13939);if ((((type != MSG_LOGIN)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13940)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13941)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(13942);deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2amcamclwydzo8q.R.inc(13943);if ((((deviceSession == null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13944)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13945)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13946);return null;
            }
        }}

        }__CLR4_5_2amcamclwydzo8q.R.inc(13947);if ((((type == MSG_LOGIN)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13948)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13949)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(13950);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
            __CLR4_5_2amcamclwydzo8q.R.inc(13951);buf.readUnsignedShort(); // type

            __CLR4_5_2amcamclwydzo8q.R.inc(13952);if ((((dataLength > 10)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13953)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13954)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13955);int extensionBits = buf.readUnsignedShort();
                __CLR4_5_2amcamclwydzo8q.R.inc(13956);int hours = (extensionBits >> 4) / 100;
                __CLR4_5_2amcamclwydzo8q.R.inc(13957);int minutes = (extensionBits >> 4) % 100;
                __CLR4_5_2amcamclwydzo8q.R.inc(13958);int offset = (hours * 60 + minutes) * 60;
                __CLR4_5_2amcamclwydzo8q.R.inc(13959);if (((((extensionBits & 0x8) != 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13960)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13961)==0&false))) {{
                    __CLR4_5_2amcamclwydzo8q.R.inc(13962);offset = -offset;
                }
                }__CLR4_5_2amcamclwydzo8q.R.inc(13963);if ((((!forceTimeZone)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13964)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13965)==0&false))) {{
                    __CLR4_5_2amcamclwydzo8q.R.inc(13966);timeZone.setRawOffset(offset * 1000);
                }
            }}

            }__CLR4_5_2amcamclwydzo8q.R.inc(13967);if ((((getDeviceSession(channel, remoteAddress, imei) != null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13968)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13969)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(13970);sendResponse(channel, false, type);
            }

        }} }else {__CLR4_5_2amcamclwydzo8q.R.inc(13971);if ((((type == MSG_X1_GPS)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13972)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13973)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(13974);Position position = new Position();
            __CLR4_5_2amcamclwydzo8q.R.inc(13975);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_2amcamclwydzo8q.R.inc(13976);position.setProtocol(getProtocolName());

            __CLR4_5_2amcamclwydzo8q.R.inc(13977);buf.readUnsignedInt(); // data and alarm

            __CLR4_5_2amcamclwydzo8q.R.inc(13978);decodeGps(position, buf, false);

            __CLR4_5_2amcamclwydzo8q.R.inc(13979);buf.readUnsignedShort(); // terminal info

            __CLR4_5_2amcamclwydzo8q.R.inc(13980);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_2amcamclwydzo8q.R.inc(13981);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedByte(),
                    buf.readUnsignedShort(), buf.readUnsignedInt())));

            __CLR4_5_2amcamclwydzo8q.R.inc(13982);return position;

        } }else {__CLR4_5_2amcamclwydzo8q.R.inc(13983);if ((((type == MSG_X1_PHOTO_INFO)&&(__CLR4_5_2amcamclwydzo8q.R.iget(13984)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(13985)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(13986);buf.skipBytes(6); // time
            __CLR4_5_2amcamclwydzo8q.R.inc(13987);buf.readUnsignedByte(); // fix status
            __CLR4_5_2amcamclwydzo8q.R.inc(13988);buf.readUnsignedInt(); // latitude
            __CLR4_5_2amcamclwydzo8q.R.inc(13989);buf.readUnsignedInt(); // longitude
            __CLR4_5_2amcamclwydzo8q.R.inc(13990);buf.readUnsignedByte(); // camera id
            __CLR4_5_2amcamclwydzo8q.R.inc(13991);buf.readUnsignedByte(); // photo source
            __CLR4_5_2amcamclwydzo8q.R.inc(13992);buf.readUnsignedByte(); // picture format

            __CLR4_5_2amcamclwydzo8q.R.inc(13993);ChannelBuffer photo = ChannelBuffers.buffer(buf.readInt());
            __CLR4_5_2amcamclwydzo8q.R.inc(13994);int pictureId = buf.readInt();
            __CLR4_5_2amcamclwydzo8q.R.inc(13995);photos.put(pictureId, photo);
            __CLR4_5_2amcamclwydzo8q.R.inc(13996);sendPhotoRequest(channel, pictureId);

        } }else {{

            __CLR4_5_2amcamclwydzo8q.R.inc(13997);return decodeBasicOther(channel, buf, deviceSession, type, dataLength);

        }

        }}}__CLR4_5_2amcamclwydzo8q.R.inc(13998);return null;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private Object decodeBasicOther(Channel channel, ChannelBuffer buf,
            DeviceSession deviceSession, int type, int dataLength) throws Exception {try{__CLR4_5_2amcamclwydzo8q.R.inc(13999);

        __CLR4_5_2amcamclwydzo8q.R.inc(14000);Position position = new Position();
        __CLR4_5_2amcamclwydzo8q.R.inc(14001);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2amcamclwydzo8q.R.inc(14002);position.setProtocol(getProtocolName());

        __CLR4_5_2amcamclwydzo8q.R.inc(14003);if ((((type == MSG_LBS_EXTEND || type == MSG_LBS_WIFI)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14004)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14005)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14006);DateBuilder dateBuilder = new DateBuilder(timeZone)
                    .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());

            __CLR4_5_2amcamclwydzo8q.R.inc(14007);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_2amcamclwydzo8q.R.inc(14008);int mcc = buf.readUnsignedShort();
            __CLR4_5_2amcamclwydzo8q.R.inc(14009);int mnc = buf.readUnsignedByte();
            __CLR4_5_2amcamclwydzo8q.R.inc(14010);Network network = new Network();
            __CLR4_5_2amcamclwydzo8q.R.inc(14011);for (int i = 0; (((i < 7)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14012)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14013)==0&false)); i++) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14014);network.addCellTower(CellTower.from(
                        mcc, mnc, buf.readUnsignedShort(), buf.readUnsignedMedium(), -buf.readUnsignedByte()));
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14015);buf.readUnsignedByte(); // time leads

            __CLR4_5_2amcamclwydzo8q.R.inc(14016);int wifiCount = buf.readUnsignedByte();
            __CLR4_5_2amcamclwydzo8q.R.inc(14017);for (int i = 0; (((i < wifiCount)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14018)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14019)==0&false)); i++) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14020);String mac = ChannelBuffers.hexDump(buf.readBytes(6)).replaceAll("(..)", "$1:");
                __CLR4_5_2amcamclwydzo8q.R.inc(14021);network.addWifiAccessPoint(WifiAccessPoint.from(
                        mac.substring(0, mac.length() - 1), buf.readUnsignedByte()));
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14022);position.setNetwork(network);

        } }else {__CLR4_5_2amcamclwydzo8q.R.inc(14023);if ((((type == MSG_STRING)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14024)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14025)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14026);getLastLocation(position, null);

            __CLR4_5_2amcamclwydzo8q.R.inc(14027);int commandLength = buf.readUnsignedByte();

            __CLR4_5_2amcamclwydzo8q.R.inc(14028);if ((((commandLength > 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14029)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14030)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14031);buf.readUnsignedByte(); // server flag (reserved)
                __CLR4_5_2amcamclwydzo8q.R.inc(14032);position.set(Position.KEY_RESULT,
                        buf.readBytes(commandLength - 1).toString(StandardCharsets.US_ASCII));
            }

        }} }else {__CLR4_5_2amcamclwydzo8q.R.inc(14033);if ((((isSupported(type))&&(__CLR4_5_2amcamclwydzo8q.R.iget(14034)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14035)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14036);if ((((hasGps(type))&&(__CLR4_5_2amcamclwydzo8q.R.iget(14037)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14038)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14039);decodeGps(position, buf, false);
            } }else {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14040);getLastLocation(position, null);
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14041);if ((((hasLbs(type))&&(__CLR4_5_2amcamclwydzo8q.R.iget(14042)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14043)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14044);decodeLbs(position, buf, hasStatus(type));
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14045);if ((((hasStatus(type))&&(__CLR4_5_2amcamclwydzo8q.R.iget(14046)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14047)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14048);decodeStatus(position, buf);
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14049);if ((((type == MSG_GPS_LBS_1 && buf.readableBytes() >= 4 + 6)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14050)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14051)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14052);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14053);if ((((type == MSG_GPS_LBS_2 && buf.readableBytes() >= 3 + 6)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14054)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14055)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14056);position.set(Position.KEY_IGNITION, buf.readUnsignedByte() > 0);
                __CLR4_5_2amcamclwydzo8q.R.inc(14057);position.set(Position.KEY_EVENT, buf.readUnsignedByte()); // reason
                __CLR4_5_2amcamclwydzo8q.R.inc(14058);position.set(Position.KEY_ARCHIVE, buf.readUnsignedByte() > 0);
            }

        }} }else {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14059);buf.skipBytes(dataLength);
            __CLR4_5_2amcamclwydzo8q.R.inc(14060);if ((((type != MSG_COMMAND_0 && type != MSG_COMMAND_1 && type != MSG_COMMAND_2)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14061)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14062)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14063);sendResponse(channel, false, type);
            }
            }__CLR4_5_2amcamclwydzo8q.R.inc(14064);return null;

        }

        }}}__CLR4_5_2amcamclwydzo8q.R.inc(14065);sendResponse(channel, false, type);

        __CLR4_5_2amcamclwydzo8q.R.inc(14066);return position;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    private Object decodeExtended(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2amcamclwydzo8q.R.inc(14067);

        __CLR4_5_2amcamclwydzo8q.R.inc(14068);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2amcamclwydzo8q.R.inc(14069);if ((((deviceSession == null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14070)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14071)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(14072);return null;
        }

        }__CLR4_5_2amcamclwydzo8q.R.inc(14073);Position position = new Position();
        __CLR4_5_2amcamclwydzo8q.R.inc(14074);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2amcamclwydzo8q.R.inc(14075);position.setProtocol(getProtocolName());

        __CLR4_5_2amcamclwydzo8q.R.inc(14076);buf.readUnsignedShort(); // length
        __CLR4_5_2amcamclwydzo8q.R.inc(14077);int type = buf.readUnsignedByte();

        __CLR4_5_2amcamclwydzo8q.R.inc(14078);if ((((type == MSG_STRING_INFO)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14079)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14080)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14081);buf.readUnsignedInt(); // server flag
            __CLR4_5_2amcamclwydzo8q.R.inc(14082);String data;
            __CLR4_5_2amcamclwydzo8q.R.inc(14083);if ((((buf.readUnsignedByte() == 1)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14084)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14085)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14086);data = buf.readBytes(buf.readableBytes() - 6).toString(StandardCharsets.US_ASCII);
            } }else {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14087);data = buf.readBytes(buf.readableBytes() - 6).toString(StandardCharsets.UTF_16BE);
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14088);if ((((decodeLocationString(position, data) == null)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14089)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14090)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14091);getLastLocation(position, null);
                __CLR4_5_2amcamclwydzo8q.R.inc(14092);position.set(Position.KEY_RESULT, data);
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14093);return position;

        } }else {__CLR4_5_2amcamclwydzo8q.R.inc(14094);if ((((type == MSG_INFO)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14095)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14096)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14097);int subType = buf.readUnsignedByte();

            __CLR4_5_2amcamclwydzo8q.R.inc(14098);getLastLocation(position, null);

            __CLR4_5_2amcamclwydzo8q.R.inc(14099);if ((((subType == 0x00)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14100)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14101)==0&false))) {{

                __CLR4_5_2amcamclwydzo8q.R.inc(14102);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.01);
                __CLR4_5_2amcamclwydzo8q.R.inc(14103);return position;

            } }else {__CLR4_5_2amcamclwydzo8q.R.inc(14104);if ((((subType == 0x05)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14105)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14106)==0&false))) {{

                __CLR4_5_2amcamclwydzo8q.R.inc(14107);int flags = buf.readUnsignedByte();
                __CLR4_5_2amcamclwydzo8q.R.inc(14108);position.set("door", BitUtil.check(flags, 0));
                __CLR4_5_2amcamclwydzo8q.R.inc(14109);position.set(Position.PREFIX_IO + 1, BitUtil.check(flags, 2));
                __CLR4_5_2amcamclwydzo8q.R.inc(14110);return position;

            } }else {__CLR4_5_2amcamclwydzo8q.R.inc(14111);if ((((subType == 0x0d)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14112)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14113)==0&false))) {{

                __CLR4_5_2amcamclwydzo8q.R.inc(14114);buf.skipBytes(6);
                __CLR4_5_2amcamclwydzo8q.R.inc(14115);return decodeFuelData(position, buf.toString(
                        buf.readerIndex(), buf.readableBytes() - 4 - 2, StandardCharsets.US_ASCII));

            }

        }}}} }else {__CLR4_5_2amcamclwydzo8q.R.inc(14116);if ((((type == MSG_X1_PHOTO_DATA)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14117)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14118)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14119);int pictureId = buf.readInt();

            __CLR4_5_2amcamclwydzo8q.R.inc(14120);ChannelBuffer photo = photos.get(pictureId);

            __CLR4_5_2amcamclwydzo8q.R.inc(14121);buf.readUnsignedInt(); // offset
            __CLR4_5_2amcamclwydzo8q.R.inc(14122);buf.readBytes(photo, buf.readUnsignedShort());

            __CLR4_5_2amcamclwydzo8q.R.inc(14123);if ((((photo.writableBytes() > 0)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14124)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14125)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14126);sendPhotoRequest(channel, pictureId);
            } }else {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14127);Device device = Context.getDeviceManager().getById(deviceSession.getDeviceId());
                __CLR4_5_2amcamclwydzo8q.R.inc(14128);Context.getMediaManager().writeFile(device.getUniqueId(), photo, "jpg");
                __CLR4_5_2amcamclwydzo8q.R.inc(14129);photos.remove(pictureId);
            }

        }} }else {__CLR4_5_2amcamclwydzo8q.R.inc(14130);if ((((type == MSG_AZ735_GPS || type == MSG_AZ735_ALARM)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14131)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14132)==0&false))) {{

            __CLR4_5_2amcamclwydzo8q.R.inc(14133);if ((((!decodeGps(position, buf, true))&&(__CLR4_5_2amcamclwydzo8q.R.iget(14134)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14135)==0&false))) {{
                __CLR4_5_2amcamclwydzo8q.R.inc(14136);getLastLocation(position, position.getDeviceTime());
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14137);decodeLbs(position, buf, true);

            __CLR4_5_2amcamclwydzo8q.R.inc(14138);buf.skipBytes(buf.readUnsignedByte()); // additional cell towers
            __CLR4_5_2amcamclwydzo8q.R.inc(14139);buf.skipBytes(buf.readUnsignedByte()); // wifi access point

            __CLR4_5_2amcamclwydzo8q.R.inc(14140);int status = buf.readUnsignedByte();
            __CLR4_5_2amcamclwydzo8q.R.inc(14141);position.set(Position.KEY_STATUS, status);

            __CLR4_5_2amcamclwydzo8q.R.inc(14142);if ((((type == MSG_AZ735_ALARM)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14143)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14144)==0&false))) {{
                boolean __CLB4_5_2_bool2=false;__CLR4_5_2amcamclwydzo8q.R.inc(14145);switch (status) {
                    case 0xA0:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14146);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14147);position.set(Position.KEY_ARMED, true);
                        __CLR4_5_2amcamclwydzo8q.R.inc(14148);break;
                    case 0xA1:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14149);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14150);position.set(Position.KEY_ARMED, false);
                        __CLR4_5_2amcamclwydzo8q.R.inc(14151);break;
                    case 0xA2:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14152);__CLB4_5_2_bool2=true;}
                    case 0xA3:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14153);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14154);position.set(Position.KEY_ALARM, Position.ALARM_LOW_BATTERY);
                        __CLR4_5_2amcamclwydzo8q.R.inc(14155);break;
                    case 0xA4:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14156);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14157);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                        __CLR4_5_2amcamclwydzo8q.R.inc(14158);break;
                    case 0xA5:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14159);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14160);position.set(Position.KEY_ALARM, Position.ALARM_DOOR);
                        __CLR4_5_2amcamclwydzo8q.R.inc(14161);break;
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_2amcamclwydzo8q.R.inc(14162);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2amcamclwydzo8q.R.inc(14163);break;
                }
            }

            }__CLR4_5_2amcamclwydzo8q.R.inc(14164);buf.skipBytes(buf.readUnsignedByte()); // reserved extension

            __CLR4_5_2amcamclwydzo8q.R.inc(14165);sendResponse(channel, true, type);

            __CLR4_5_2amcamclwydzo8q.R.inc(14166);return position;

        }

        }}}}__CLR4_5_2amcamclwydzo8q.R.inc(14167);return null;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2amcamclwydzo8q.R.inc(14168);

        __CLR4_5_2amcamclwydzo8q.R.inc(14169);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2amcamclwydzo8q.R.inc(14170);int header = buf.readShort();

        __CLR4_5_2amcamclwydzo8q.R.inc(14171);if ((((header == 0x7878)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14172)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14173)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(14174);return decodeBasic(channel, remoteAddress, buf);
        } }else {__CLR4_5_2amcamclwydzo8q.R.inc(14175);if ((((header == 0x7979)&&(__CLR4_5_2amcamclwydzo8q.R.iget(14176)!=0|true))||(__CLR4_5_2amcamclwydzo8q.R.iget(14177)==0&false))) {{
            __CLR4_5_2amcamclwydzo8q.R.inc(14178);return decodeExtended(channel, remoteAddress, buf);
        }

        }}__CLR4_5_2amcamclwydzo8q.R.inc(14179);return null;
    }finally{__CLR4_5_2amcamclwydzo8q.R.flushNeeded();}}

}
