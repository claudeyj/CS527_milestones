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
import org.traccar.helper.BitUtil;
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gt06ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_292w92wlx1e0hak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,11993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean forceTimeZone = false;
    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    public Gt06ProtocolDecoder(Gt06Protocol protocol) {
        super(protocol);__CLR4_5_292w92wlx1e0hak.R.inc(11769);try{__CLR4_5_292w92wlx1e0hak.R.inc(11768);

        __CLR4_5_292w92wlx1e0hak.R.inc(11770);if ((((Context.getConfig().hasKey(getProtocolName() + ".timezone"))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11771)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11772)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11773);forceTimeZone = true;
            __CLR4_5_292w92wlx1e0hak.R.inc(11774);timeZone.setRawOffset(Context.getConfig().getInteger(getProtocolName() + ".timezone") * 1000);
        }
    }}finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

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
    public static final int MSG_LBS_PHONE = 0x17;
    public static final int MSG_LBS_EXTEND = 0x18;
    public static final int MSG_LBS_STATUS = 0x19;
    public static final int MSG_GPS_PHONE = 0x1A;
    public static final int MSG_GPS_LBS_EXTEND = 0x1E;
    public static final int MSG_COMMAND_0 = 0x80;
    public static final int MSG_COMMAND_1 = 0x81;
    public static final int MSG_COMMAND_2 = 0x82;
    public static final int MSG_INFO = 0x94;

    private static boolean isSupported(int type) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11775);
        __CLR4_5_292w92wlx1e0hak.R.inc(11776);return hasGps(type) || hasLbs(type) || hasStatus(type);
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private static boolean hasGps(int type) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11777);
        __CLR4_5_292w92wlx1e0hak.R.inc(11778);return type == MSG_GPS || type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2
                || type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3
                || type == MSG_GPS_PHONE || type == MSG_GPS_LBS_EXTEND;
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private static boolean hasLbs(int type) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11779);
        __CLR4_5_292w92wlx1e0hak.R.inc(11780);return type == MSG_LBS || type == MSG_LBS_STATUS || type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2
                || type == MSG_GPS_LBS_STATUS_1 || type ==  MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3;
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private static boolean hasStatus(int type) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11781);
        __CLR4_5_292w92wlx1e0hak.R.inc(11782);return type == MSG_STATUS || type == MSG_LBS_STATUS
                || type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3;
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private static void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11783);
        __CLR4_5_292w92wlx1e0hak.R.inc(11784);if ((((channel != null)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11785)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11786)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11787);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_292w92wlx1e0hak.R.inc(11788);response.writeByte(0x78); __CLR4_5_292w92wlx1e0hak.R.inc(11789);response.writeByte(0x78); // header
            __CLR4_5_292w92wlx1e0hak.R.inc(11790);response.writeByte(5); // size
            __CLR4_5_292w92wlx1e0hak.R.inc(11791);response.writeByte(type);
            __CLR4_5_292w92wlx1e0hak.R.inc(11792);response.writeShort(index);
            __CLR4_5_292w92wlx1e0hak.R.inc(11793);response.writeShort(Checksum.crc16(Checksum.CRC16_X25, response.toByteBuffer(2, 4)));
            __CLR4_5_292w92wlx1e0hak.R.inc(11794);response.writeByte(0x0D); __CLR4_5_292w92wlx1e0hak.R.inc(11795);response.writeByte(0x0A); // ending
            __CLR4_5_292w92wlx1e0hak.R.inc(11796);channel.write(response);
        }
    }}finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private void decodeGps(Position position, ChannelBuffer buf) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11797);

        __CLR4_5_292w92wlx1e0hak.R.inc(11798);DateBuilder dateBuilder = new DateBuilder(timeZone)
                .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_292w92wlx1e0hak.R.inc(11799);position.setTime(dateBuilder.getDate());

        __CLR4_5_292w92wlx1e0hak.R.inc(11800);int length = buf.readUnsignedByte();
        __CLR4_5_292w92wlx1e0hak.R.inc(11801);position.set(Position.KEY_SATELLITES, BitUtil.to(length, 4));
        __CLR4_5_292w92wlx1e0hak.R.inc(11802);length = BitUtil.from(length, 4);

        __CLR4_5_292w92wlx1e0hak.R.inc(11803);double latitude = buf.readUnsignedInt() / 60.0 / 30000.0;
        __CLR4_5_292w92wlx1e0hak.R.inc(11804);double longitude = buf.readUnsignedInt() / 60.0 / 30000.0;
        __CLR4_5_292w92wlx1e0hak.R.inc(11805);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

        __CLR4_5_292w92wlx1e0hak.R.inc(11806);int flags = buf.readUnsignedShort();
        __CLR4_5_292w92wlx1e0hak.R.inc(11807);position.setCourse(BitUtil.to(flags, 10));
        __CLR4_5_292w92wlx1e0hak.R.inc(11808);position.setValid(BitUtil.check(flags, 12));

        __CLR4_5_292w92wlx1e0hak.R.inc(11809);if ((((!BitUtil.check(flags, 10))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11810)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11811)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11812);latitude = -latitude;
        }
        }__CLR4_5_292w92wlx1e0hak.R.inc(11813);if ((((BitUtil.check(flags, 11))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11814)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11815)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11816);longitude = -longitude;
        }

        }__CLR4_5_292w92wlx1e0hak.R.inc(11817);position.setLatitude(latitude);
        __CLR4_5_292w92wlx1e0hak.R.inc(11818);position.setLongitude(longitude);

        __CLR4_5_292w92wlx1e0hak.R.inc(11819);if ((((BitUtil.check(flags, 14))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11820)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11821)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11822);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 15));
        }

        }__CLR4_5_292w92wlx1e0hak.R.inc(11823);buf.skipBytes(length - 12); // skip reserved
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private void decodeLbs(Position position, ChannelBuffer buf, boolean hasLength) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11824);

        __CLR4_5_292w92wlx1e0hak.R.inc(11825);int lbsLength = 0;
        __CLR4_5_292w92wlx1e0hak.R.inc(11826);if ((((hasLength)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11827)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11828)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11829);lbsLength = buf.readUnsignedByte();
        }

        }__CLR4_5_292w92wlx1e0hak.R.inc(11830);position.setNetwork(new Network(CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedByte(), buf.readUnsignedShort(), buf.readUnsignedMedium())));

        __CLR4_5_292w92wlx1e0hak.R.inc(11831);if ((((lbsLength > 0)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11832)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11833)==0&false))) {{
            __CLR4_5_292w92wlx1e0hak.R.inc(11834);buf.skipBytes(lbsLength - 9);
        }
    }}finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private void decodeStatus(Position position, ChannelBuffer buf) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11835);

        __CLR4_5_292w92wlx1e0hak.R.inc(11836);int flags = buf.readUnsignedByte();

        __CLR4_5_292w92wlx1e0hak.R.inc(11837);position.set(Position.KEY_IGNITION, BitUtil.check(flags, 1));
        __CLR4_5_292w92wlx1e0hak.R.inc(11838);position.set(Position.KEY_STATUS, flags);
        __CLR4_5_292w92wlx1e0hak.R.inc(11839);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
        __CLR4_5_292w92wlx1e0hak.R.inc(11840);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
        __CLR4_5_292w92wlx1e0hak.R.inc(11841);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_292w92wlx1e0hak.R.inc(11842);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_292w92wlx1e0hak.R.inc(11843);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11844);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11845);return Position.ALARM_SOS;
            case 0x02:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11846);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11847);return Position.ALARM_POWER_CUT;
            case 0x03:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11848);__CLB4_5_2_bool0=true;}
            case 0x09:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11849);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11850);return Position.ALARM_VIBRATION;
            case 0x04:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11851);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11852);return Position.ALARM_GEOFENCE_ENTER;
            case 0x05:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11853);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11854);return Position.ALARM_GEOFENCE_EXIT;
            case 0x06:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11855);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11856);return Position.ALARM_OVERSPEED;
            case 0x0E:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11857);__CLB4_5_2_bool0=true;}
            case 0x0F:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11858);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11859);return Position.ALARM_LOW_BATTERY;
            case 0x11:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11860);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11861);return Position.ALARM_POWER_OFF;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_292w92wlx1e0hak.R.inc(11862);__CLB4_5_2_bool0=true;}
                __CLR4_5_292w92wlx1e0hak.R.inc(11863);break;
        }
        __CLR4_5_292w92wlx1e0hak.R.inc(11864);return null;
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_292w92wlx1e0hak.R.inc(11865);

        __CLR4_5_292w92wlx1e0hak.R.inc(11866);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_292w92wlx1e0hak.R.inc(11867);int header = buf.readShort();

        __CLR4_5_292w92wlx1e0hak.R.inc(11868);if ((((header == 0x7878)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11869)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11870)==0&false))) {{

            __CLR4_5_292w92wlx1e0hak.R.inc(11871);int length = buf.readUnsignedByte();
            __CLR4_5_292w92wlx1e0hak.R.inc(11872);int dataLength = length - 5;
            __CLR4_5_292w92wlx1e0hak.R.inc(11873);int type = buf.readUnsignedByte();

            __CLR4_5_292w92wlx1e0hak.R.inc(11874);if ((((type == MSG_LOGIN)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11875)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11876)==0&false))) {{

                __CLR4_5_292w92wlx1e0hak.R.inc(11877);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
                __CLR4_5_292w92wlx1e0hak.R.inc(11878);buf.readUnsignedShort(); // type

                // Timezone offset
                __CLR4_5_292w92wlx1e0hak.R.inc(11879);if ((((dataLength > 10)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11880)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11881)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11882);int extensionBits = buf.readUnsignedShort();
                    __CLR4_5_292w92wlx1e0hak.R.inc(11883);int hours = (extensionBits >> 4) / 100;
                    __CLR4_5_292w92wlx1e0hak.R.inc(11884);int minutes = (extensionBits >> 4) % 100;
                    __CLR4_5_292w92wlx1e0hak.R.inc(11885);int offset = (hours * 60 + minutes) * 60;
                    __CLR4_5_292w92wlx1e0hak.R.inc(11886);if (((((extensionBits & 0x8) != 0)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11887)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11888)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11889);offset = -offset;
                    }
                    }__CLR4_5_292w92wlx1e0hak.R.inc(11890);if ((((!forceTimeZone)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11891)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11892)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11893);timeZone.setRawOffset(offset * 1000);
                    }
                }}

                }__CLR4_5_292w92wlx1e0hak.R.inc(11894);if ((((getDeviceSession(channel, remoteAddress, imei) != null)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11895)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11896)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11897);buf.skipBytes(buf.readableBytes() - 6);
                    __CLR4_5_292w92wlx1e0hak.R.inc(11898);sendResponse(channel, type, buf.readUnsignedShort());
                }

            }} }else {{

                __CLR4_5_292w92wlx1e0hak.R.inc(11899);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
                __CLR4_5_292w92wlx1e0hak.R.inc(11900);if ((((deviceSession == null)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11901)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11902)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11903);return null;
                }

                }__CLR4_5_292w92wlx1e0hak.R.inc(11904);Position position = new Position();
                __CLR4_5_292w92wlx1e0hak.R.inc(11905);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_292w92wlx1e0hak.R.inc(11906);position.setProtocol(getProtocolName());

                __CLR4_5_292w92wlx1e0hak.R.inc(11907);if ((((type == MSG_LBS_EXTEND)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11908)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11909)==0&false))) {{

                    __CLR4_5_292w92wlx1e0hak.R.inc(11910);DateBuilder dateBuilder = new DateBuilder(timeZone)
                            .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                            .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());

                    __CLR4_5_292w92wlx1e0hak.R.inc(11911);getLastLocation(position, dateBuilder.getDate());

                    __CLR4_5_292w92wlx1e0hak.R.inc(11912);int mcc = buf.readUnsignedShort();
                    __CLR4_5_292w92wlx1e0hak.R.inc(11913);int mnc = buf.readUnsignedByte();

                    __CLR4_5_292w92wlx1e0hak.R.inc(11914);Network network = new Network();
                    __CLR4_5_292w92wlx1e0hak.R.inc(11915);for (int i = 0; (((i < 7)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11916)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11917)==0&false)); i++) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11918);network.addCellTower(CellTower.from(
                                mcc, mnc, buf.readUnsignedShort(), buf.readUnsignedMedium(), -buf.readUnsignedByte()));
                    }
                    }__CLR4_5_292w92wlx1e0hak.R.inc(11919);position.setNetwork(network);

                } }else {__CLR4_5_292w92wlx1e0hak.R.inc(11920);if ((((type == MSG_STRING)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11921)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11922)==0&false))) {{

                    __CLR4_5_292w92wlx1e0hak.R.inc(11923);getLastLocation(position, null);

                    __CLR4_5_292w92wlx1e0hak.R.inc(11924);int commandLength = buf.readUnsignedByte();

                    __CLR4_5_292w92wlx1e0hak.R.inc(11925);if ((((commandLength > 0)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11926)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11927)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11928);buf.readUnsignedByte(); // server flag (reserved)
                        __CLR4_5_292w92wlx1e0hak.R.inc(11929);position.set("command", buf.readBytes(commandLength - 1).toString(StandardCharsets.US_ASCII));
                    }

                }} }else {__CLR4_5_292w92wlx1e0hak.R.inc(11930);if ((((isSupported(type))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11931)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11932)==0&false))) {{

                    __CLR4_5_292w92wlx1e0hak.R.inc(11933);if ((((hasGps(type))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11934)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11935)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11936);decodeGps(position, buf);
                    } }else {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11937);getLastLocation(position, null);
                    }

                    }__CLR4_5_292w92wlx1e0hak.R.inc(11938);if ((((hasLbs(type))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11939)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11940)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11941);decodeLbs(position, buf, hasStatus(type));
                    }

                    }__CLR4_5_292w92wlx1e0hak.R.inc(11942);if ((((hasStatus(type))&&(__CLR4_5_292w92wlx1e0hak.R.iget(11943)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11944)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11945);decodeStatus(position, buf);
                    }

                    }__CLR4_5_292w92wlx1e0hak.R.inc(11946);if ((((type == MSG_GPS_LBS_1 && buf.readableBytes() == 4 + 6)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11947)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11948)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11949);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    }

                }} }else {{

                    __CLR4_5_292w92wlx1e0hak.R.inc(11950);buf.skipBytes(dataLength);
                    __CLR4_5_292w92wlx1e0hak.R.inc(11951);if ((((type != MSG_COMMAND_0 && type != MSG_COMMAND_1 && type != MSG_COMMAND_2)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11952)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11953)==0&false))) {{
                        __CLR4_5_292w92wlx1e0hak.R.inc(11954);sendResponse(channel, type, buf.readUnsignedShort());
                    }
                    }__CLR4_5_292w92wlx1e0hak.R.inc(11955);return null;

                }

                }}}__CLR4_5_292w92wlx1e0hak.R.inc(11956);if ((((buf.readableBytes() > 6)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11957)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11958)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11959);buf.skipBytes(buf.readableBytes() - 6);
                }
                }__CLR4_5_292w92wlx1e0hak.R.inc(11960);sendResponse(channel, type, buf.readUnsignedShort());

                __CLR4_5_292w92wlx1e0hak.R.inc(11961);return position;

            }

        }} }else {__CLR4_5_292w92wlx1e0hak.R.inc(11962);if ((((header == 0x7979)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11963)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11964)==0&false))) {{

            __CLR4_5_292w92wlx1e0hak.R.inc(11965);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_292w92wlx1e0hak.R.inc(11966);if ((((deviceSession == null)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11967)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11968)==0&false))) {{
                __CLR4_5_292w92wlx1e0hak.R.inc(11969);return null;
            }

            }__CLR4_5_292w92wlx1e0hak.R.inc(11970);buf.readUnsignedShort(); // length
            __CLR4_5_292w92wlx1e0hak.R.inc(11971);int type = buf.readUnsignedByte();

            __CLR4_5_292w92wlx1e0hak.R.inc(11972);if ((((type == MSG_INFO)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11973)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11974)==0&false))) {{
                __CLR4_5_292w92wlx1e0hak.R.inc(11975);int subType = buf.readUnsignedByte();

                __CLR4_5_292w92wlx1e0hak.R.inc(11976);Position position = new Position();
                __CLR4_5_292w92wlx1e0hak.R.inc(11977);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_292w92wlx1e0hak.R.inc(11978);position.setProtocol(getProtocolName());

                __CLR4_5_292w92wlx1e0hak.R.inc(11979);getLastLocation(position, null);

                __CLR4_5_292w92wlx1e0hak.R.inc(11980);if ((((subType == 0x00)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11981)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11982)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11983);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.01);
                    __CLR4_5_292w92wlx1e0hak.R.inc(11984);return position;
                } }else {__CLR4_5_292w92wlx1e0hak.R.inc(11985);if ((((subType == 0x05)&&(__CLR4_5_292w92wlx1e0hak.R.iget(11986)!=0|true))||(__CLR4_5_292w92wlx1e0hak.R.iget(11987)==0&false))) {{
                    __CLR4_5_292w92wlx1e0hak.R.inc(11988);int flags = buf.readUnsignedByte();
                    __CLR4_5_292w92wlx1e0hak.R.inc(11989);position.set("door", BitUtil.check(flags, 0));
                    __CLR4_5_292w92wlx1e0hak.R.inc(11990);position.set(Position.PREFIX_IO + 1, BitUtil.check(flags, 2));
                    __CLR4_5_292w92wlx1e0hak.R.inc(11991);return position;
                }
            }}}

        }}

        }}__CLR4_5_292w92wlx1e0hak.R.inc(11992);return null;
    }finally{__CLR4_5_292w92wlx1e0hak.R.flushNeeded();}}

}
