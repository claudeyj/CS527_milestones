/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;

@java.lang.SuppressWarnings({"fallthrough"}) public class EelinkProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28bg8bglwydyid6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,10944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EelinkProtocolDecoder(EelinkProtocol protocol) {
        super(protocol);__CLR4_5_28bg8bglwydyid6.R.inc(10781);try{__CLR4_5_28bg8bglwydyid6.R.inc(10780);
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x01;
    public static final int MSG_GPS = 0x02;
    public static final int MSG_HEARTBEAT = 0x03;
    public static final int MSG_ALARM = 0x04;
    public static final int MSG_STATE = 0x05;
    public static final int MSG_SMS = 0x06;
    public static final int MSG_OBD = 0x07;
    public static final int MSG_DOWNLINK = 0x80;
    public static final int MSG_DATA = 0x81;

    public static final int MSG_NORMAL = 0x12;
    public static final int MSG_WARNING = 0x14;
    public static final int MSG_REPORT = 0x15;
    public static final int MSG_COMMAND = 0x16;
    public static final int MSG_OBD_DATA = 0x17;
    public static final int MSG_OBD_BODY = 0x18;
    public static final int MSG_OBD_CODE = 0x19;
    public static final int MSG_CAMERA_INFO = 0x1E;
    public static final int MSG_CAMERA_DATA = 0x1F;

    private void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_28bg8bglwydyid6.R.inc(10782);
        __CLR4_5_28bg8bglwydyid6.R.inc(10783);if ((((channel != null)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10784)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10785)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10786);ChannelBuffer response = ChannelBuffers.buffer(7);
            __CLR4_5_28bg8bglwydyid6.R.inc(10787);response.writeByte(0x67); __CLR4_5_28bg8bglwydyid6.R.inc(10788);response.writeByte(0x67); // header
            __CLR4_5_28bg8bglwydyid6.R.inc(10789);response.writeByte(type);
            __CLR4_5_28bg8bglwydyid6.R.inc(10790);response.writeShort(2); // length
            __CLR4_5_28bg8bglwydyid6.R.inc(10791);response.writeShort(index);
            __CLR4_5_28bg8bglwydyid6.R.inc(10792);channel.write(response);
        }
    }}finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    private String decodeAlarm(Short value) {try{__CLR4_5_28bg8bglwydyid6.R.inc(10793);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_28bg8bglwydyid6.R.inc(10794);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10795);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10796);return Position.ALARM_POWER_OFF;
            case 0x02:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10797);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10798);return Position.ALARM_SOS;
            case 0x03:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10799);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10800);return Position.ALARM_LOW_BATTERY;
            case 0x04:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10801);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10802);return Position.ALARM_VIBRATION;
            case 0x08:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10803);__CLB4_5_2_bool0=true;}
            case 0x09:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10804);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10805);return Position.ALARM_GPS_ANTENNA_CUT;
            case 0x81:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10806);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10807);return Position.ALARM_LOW_SPEED;
            case 0x82:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10808);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10809);return Position.ALARM_OVERSPEED;
            case 0x83:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10810);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10811);return Position.ALARM_GEOFENCE_ENTER;
            case 0x84:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10812);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10813);return Position.ALARM_GEOFENCE_EXIT;
            case 0x85:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10814);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10815);return Position.ALARM_ACCIDENT;
            case 0x86:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10816);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10817);return Position.ALARM_FALL_DOWN;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_28bg8bglwydyid6.R.inc(10818);__CLB4_5_2_bool0=true;}
                __CLR4_5_28bg8bglwydyid6.R.inc(10819);return null;
        }
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    private void decodeStatus(Position position, int status) {try{__CLR4_5_28bg8bglwydyid6.R.inc(10820);
        __CLR4_5_28bg8bglwydyid6.R.inc(10821);if ((((BitUtil.check(status, 1))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10822)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10823)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10824);position.set(Position.KEY_IGNITION, BitUtil.check(status, 2));
        }
        }__CLR4_5_28bg8bglwydyid6.R.inc(10825);if ((((BitUtil.check(status, 3))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10826)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10827)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10828);position.set(Position.KEY_ARMED, BitUtil.check(status, 4));
        }
        }__CLR4_5_28bg8bglwydyid6.R.inc(10829);if ((((BitUtil.check(status, 5))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10830)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10831)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10832);position.set(Position.KEY_BLOCKED, !BitUtil.check(status, 6));
        }
        }__CLR4_5_28bg8bglwydyid6.R.inc(10833);if ((((BitUtil.check(status, 7))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10834)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10835)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10836);position.set(Position.KEY_CHARGE, BitUtil.check(status, 8));
        }
        }__CLR4_5_28bg8bglwydyid6.R.inc(10837);position.set(Position.KEY_STATUS, status);
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    private Position decodeOld(DeviceSession deviceSession, ChannelBuffer buf, int type, int index) {try{__CLR4_5_28bg8bglwydyid6.R.inc(10838);

        __CLR4_5_28bg8bglwydyid6.R.inc(10839);Position position = new Position();
        __CLR4_5_28bg8bglwydyid6.R.inc(10840);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_28bg8bglwydyid6.R.inc(10841);position.setProtocol(getProtocolName());

        __CLR4_5_28bg8bglwydyid6.R.inc(10842);position.set(Position.KEY_INDEX, index);

        __CLR4_5_28bg8bglwydyid6.R.inc(10843);position.setTime(new Date(buf.readUnsignedInt() * 1000));
        __CLR4_5_28bg8bglwydyid6.R.inc(10844);position.setLatitude(buf.readInt() / 1800000.0);
        __CLR4_5_28bg8bglwydyid6.R.inc(10845);position.setLongitude(buf.readInt() / 1800000.0);
        __CLR4_5_28bg8bglwydyid6.R.inc(10846);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_28bg8bglwydyid6.R.inc(10847);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_28bg8bglwydyid6.R.inc(10848);position.setNetwork(new Network(CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedShort(), buf.readUnsignedShort(), buf.readUnsignedMedium())));

        __CLR4_5_28bg8bglwydyid6.R.inc(10849);position.setValid((buf.readUnsignedByte() & 0x01) != 0);

        __CLR4_5_28bg8bglwydyid6.R.inc(10850);if ((((type == MSG_ALARM)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10851)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10852)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10853);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10854);if ((((buf.readableBytes() >= 2)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10855)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10856)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10857);decodeStatus(position, buf.readUnsignedShort());
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10858);if ((((buf.readableBytes() >= 2 * 4)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10859)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10860)==0&false))) {{

            __CLR4_5_28bg8bglwydyid6.R.inc(10861);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);

            __CLR4_5_28bg8bglwydyid6.R.inc(10862);position.set(Position.KEY_RSSI, buf.readUnsignedShort());

            __CLR4_5_28bg8bglwydyid6.R.inc(10863);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_28bg8bglwydyid6.R.inc(10864);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());

        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10865);return position;
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    private Position decodeNew(DeviceSession deviceSession, ChannelBuffer buf, int index) {try{__CLR4_5_28bg8bglwydyid6.R.inc(10866);

        __CLR4_5_28bg8bglwydyid6.R.inc(10867);Position position = new Position();
        __CLR4_5_28bg8bglwydyid6.R.inc(10868);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_28bg8bglwydyid6.R.inc(10869);position.setProtocol(getProtocolName());

        __CLR4_5_28bg8bglwydyid6.R.inc(10870);position.set(Position.KEY_INDEX, index);

        __CLR4_5_28bg8bglwydyid6.R.inc(10871);position.setTime(new Date(buf.readUnsignedInt() * 1000));

        __CLR4_5_28bg8bglwydyid6.R.inc(10872);int flags = buf.readUnsignedByte();

        __CLR4_5_28bg8bglwydyid6.R.inc(10873);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10874)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10875)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10876);position.setLatitude(buf.readInt() / 1800000.0);
            __CLR4_5_28bg8bglwydyid6.R.inc(10877);position.setLongitude(buf.readInt() / 1800000.0);
            __CLR4_5_28bg8bglwydyid6.R.inc(10878);position.setAltitude(buf.readShort());
            __CLR4_5_28bg8bglwydyid6.R.inc(10879);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_28bg8bglwydyid6.R.inc(10880);position.setCourse(buf.readUnsignedShort());
            __CLR4_5_28bg8bglwydyid6.R.inc(10881);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10882);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10883)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10884)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10885);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    buf.readUnsignedShort(), buf.readUnsignedInt(), buf.readUnsignedByte())));
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10886);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10887)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10888)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10889);buf.skipBytes(7); // bsid1
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10890);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10891)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10892)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10893);buf.skipBytes(7); // bsid2
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10894);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10895)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10896)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10897);buf.skipBytes(7); // bss0
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10898);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10899)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10900)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10901);buf.skipBytes(7); // bss1
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10902);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_28bg8bglwydyid6.R.iget(10903)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10904)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10905);buf.skipBytes(7); // bss2
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10906);return position;
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28bg8bglwydyid6.R.inc(10907);

        __CLR4_5_28bg8bglwydyid6.R.inc(10908);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28bg8bglwydyid6.R.inc(10909);buf.skipBytes(2); // header
        __CLR4_5_28bg8bglwydyid6.R.inc(10910);int type = buf.readUnsignedByte();
        __CLR4_5_28bg8bglwydyid6.R.inc(10911);buf.readShort(); // length
        __CLR4_5_28bg8bglwydyid6.R.inc(10912);int index = buf.readUnsignedShort();

        __CLR4_5_28bg8bglwydyid6.R.inc(10913);if ((((type != MSG_GPS && type != MSG_DATA)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10914)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10915)==0&false))) {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10916);sendResponse(channel, type, index);
        }

        }__CLR4_5_28bg8bglwydyid6.R.inc(10917);if ((((type == MSG_LOGIN)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10918)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10919)==0&false))) {{

            __CLR4_5_28bg8bglwydyid6.R.inc(10920);getDeviceSession(channel, remoteAddress, ChannelBuffers.hexDump(buf.readBytes(8)).substring(1));

        } }else {{
            __CLR4_5_28bg8bglwydyid6.R.inc(10921);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_28bg8bglwydyid6.R.inc(10922);if ((((deviceSession == null)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10923)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10924)==0&false))) {{
                __CLR4_5_28bg8bglwydyid6.R.inc(10925);return null;
            }

            }__CLR4_5_28bg8bglwydyid6.R.inc(10926);if ((((type == MSG_GPS || type == MSG_ALARM || type == MSG_STATE || type == MSG_SMS)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10927)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10928)==0&false))) {{
                __CLR4_5_28bg8bglwydyid6.R.inc(10929);return decodeOld(deviceSession, buf, type, index);
            } }else {__CLR4_5_28bg8bglwydyid6.R.inc(10930);if ((((type >= MSG_NORMAL && type <= MSG_OBD_CODE)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10931)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10932)==0&false))) {{
                __CLR4_5_28bg8bglwydyid6.R.inc(10933);return decodeNew(deviceSession, buf, index);
            } }else {__CLR4_5_28bg8bglwydyid6.R.inc(10934);if ((((type == MSG_HEARTBEAT && buf.readableBytes() >= 2)&&(__CLR4_5_28bg8bglwydyid6.R.iget(10935)!=0|true))||(__CLR4_5_28bg8bglwydyid6.R.iget(10936)==0&false))) {{

                __CLR4_5_28bg8bglwydyid6.R.inc(10937);Position position = new Position();
                __CLR4_5_28bg8bglwydyid6.R.inc(10938);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_28bg8bglwydyid6.R.inc(10939);position.setProtocol(getProtocolName());

                __CLR4_5_28bg8bglwydyid6.R.inc(10940);getLastLocation(position, null);

                __CLR4_5_28bg8bglwydyid6.R.inc(10941);decodeStatus(position, buf.readUnsignedShort());

                __CLR4_5_28bg8bglwydyid6.R.inc(10942);return position;

            }
        }}}}

        }__CLR4_5_28bg8bglwydyid6.R.inc(10943);return null;
    }finally{__CLR4_5_28bg8bglwydyid6.R.flushNeeded();}}

}
