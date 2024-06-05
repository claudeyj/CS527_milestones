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

@java.lang.SuppressWarnings({"fallthrough"}) public class EelinkProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27at7atlx1e0go8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,9604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EelinkProtocolDecoder(EelinkProtocol protocol) {
        super(protocol);__CLR4_5_27at7atlx1e0go8.R.inc(9462);try{__CLR4_5_27at7atlx1e0go8.R.inc(9461);
    }finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

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

    private void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_27at7atlx1e0go8.R.inc(9463);
        __CLR4_5_27at7atlx1e0go8.R.inc(9464);if ((((channel != null)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9465)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9466)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9467);ChannelBuffer response = ChannelBuffers.buffer(7);
            __CLR4_5_27at7atlx1e0go8.R.inc(9468);response.writeByte(0x67); __CLR4_5_27at7atlx1e0go8.R.inc(9469);response.writeByte(0x67); // header
            __CLR4_5_27at7atlx1e0go8.R.inc(9470);response.writeByte(type);
            __CLR4_5_27at7atlx1e0go8.R.inc(9471);response.writeShort(2); // length
            __CLR4_5_27at7atlx1e0go8.R.inc(9472);response.writeShort(index);
            __CLR4_5_27at7atlx1e0go8.R.inc(9473);channel.write(response);
        }
    }}finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

    private String decodeAlarm(Short value) {try{__CLR4_5_27at7atlx1e0go8.R.inc(9474);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_27at7atlx1e0go8.R.inc(9475);switch (value) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9476);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9477);return Position.ALARM_POWER_OFF;
            case 0x02:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9478);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9479);return Position.ALARM_SOS;
            case 0x03:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9480);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9481);return Position.ALARM_LOW_BATTERY;
            case 0x04:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9482);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9483);return Position.ALARM_VIBRATION;
            case 0x08:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9484);__CLB4_5_2_bool0=true;}
            case 0x09:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9485);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9486);return Position.ALARM_GPS_ANTENNA_CUT;
            case 0x81:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9487);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9488);return Position.ALARM_LOW_SPEED;
            case 0x82:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9489);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9490);return Position.ALARM_OVERSPEED;
            case 0x83:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9491);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9492);return Position.ALARM_GEOFENCE_ENTER;
            case 0x84:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9493);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9494);return Position.ALARM_GEOFENCE_EXIT;
            case 0x85:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9495);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9496);return Position.ALARM_ACCIDENT;
            case 0x86:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9497);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9498);return Position.ALARM_FALL_DOWN;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_27at7atlx1e0go8.R.inc(9499);__CLB4_5_2_bool0=true;}
                __CLR4_5_27at7atlx1e0go8.R.inc(9500);return null;
        }
    }finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

    private Position decodeOld(DeviceSession deviceSession, ChannelBuffer buf, int type, int index) {try{__CLR4_5_27at7atlx1e0go8.R.inc(9501);

        __CLR4_5_27at7atlx1e0go8.R.inc(9502);Position position = new Position();
        __CLR4_5_27at7atlx1e0go8.R.inc(9503);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_27at7atlx1e0go8.R.inc(9504);position.setProtocol(getProtocolName());

        __CLR4_5_27at7atlx1e0go8.R.inc(9505);position.set(Position.KEY_INDEX, index);

        __CLR4_5_27at7atlx1e0go8.R.inc(9506);position.setTime(new Date(buf.readUnsignedInt() * 1000));
        __CLR4_5_27at7atlx1e0go8.R.inc(9507);position.setLatitude(buf.readInt() / 1800000.0);
        __CLR4_5_27at7atlx1e0go8.R.inc(9508);position.setLongitude(buf.readInt() / 1800000.0);
        __CLR4_5_27at7atlx1e0go8.R.inc(9509);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        __CLR4_5_27at7atlx1e0go8.R.inc(9510);position.setCourse(buf.readUnsignedShort());

        __CLR4_5_27at7atlx1e0go8.R.inc(9511);position.setNetwork(new Network(CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedShort(), buf.readUnsignedShort(), buf.readUnsignedMedium())));

        __CLR4_5_27at7atlx1e0go8.R.inc(9512);position.setValid((buf.readUnsignedByte() & 0x01) != 0);

        __CLR4_5_27at7atlx1e0go8.R.inc(9513);if ((((type == MSG_ALARM)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9514)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9515)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9516);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9517);if ((((buf.readableBytes() >= 2 * 5)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9518)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9519)==0&false))) {{

            __CLR4_5_27at7atlx1e0go8.R.inc(9520);int status = buf.readUnsignedShort();
            __CLR4_5_27at7atlx1e0go8.R.inc(9521);if ((((BitUtil.check(status, 1))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9522)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9523)==0&false))) {{
                __CLR4_5_27at7atlx1e0go8.R.inc(9524);position.set(Position.KEY_IGNITION, BitUtil.check(status, 2));
            }
            }__CLR4_5_27at7atlx1e0go8.R.inc(9525);if ((((BitUtil.check(status, 7))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9526)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9527)==0&false))) {{
                __CLR4_5_27at7atlx1e0go8.R.inc(9528);position.set(Position.KEY_CHARGE, BitUtil.check(status, 8));
            }
            }__CLR4_5_27at7atlx1e0go8.R.inc(9529);position.set(Position.KEY_STATUS, status);

            __CLR4_5_27at7atlx1e0go8.R.inc(9530);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() + "mV");

            __CLR4_5_27at7atlx1e0go8.R.inc(9531);buf.readUnsignedShort(); // signal strength

            __CLR4_5_27at7atlx1e0go8.R.inc(9532);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_27at7atlx1e0go8.R.inc(9533);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());

        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9534);return position;
    }finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

    private Position decodeNew(DeviceSession deviceSession, ChannelBuffer buf, int index) {try{__CLR4_5_27at7atlx1e0go8.R.inc(9535);

        __CLR4_5_27at7atlx1e0go8.R.inc(9536);Position position = new Position();
        __CLR4_5_27at7atlx1e0go8.R.inc(9537);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_27at7atlx1e0go8.R.inc(9538);position.setProtocol(getProtocolName());

        __CLR4_5_27at7atlx1e0go8.R.inc(9539);position.set(Position.KEY_INDEX, index);

        __CLR4_5_27at7atlx1e0go8.R.inc(9540);position.setTime(new Date(buf.readUnsignedInt() * 1000));

        __CLR4_5_27at7atlx1e0go8.R.inc(9541);int flags = buf.readUnsignedByte();

        __CLR4_5_27at7atlx1e0go8.R.inc(9542);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9543)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9544)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9545);position.setLatitude(buf.readInt() / 1800000.0);
            __CLR4_5_27at7atlx1e0go8.R.inc(9546);position.setLongitude(buf.readInt() / 1800000.0);
            __CLR4_5_27at7atlx1e0go8.R.inc(9547);position.setAltitude(buf.readShort());
            __CLR4_5_27at7atlx1e0go8.R.inc(9548);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_27at7atlx1e0go8.R.inc(9549);position.setCourse(buf.readUnsignedShort());
            __CLR4_5_27at7atlx1e0go8.R.inc(9550);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9551);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9552)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9553)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9554);position.setNetwork(new Network(CellTower.from(
                    buf.readUnsignedShort(), buf.readUnsignedShort(),
                    buf.readUnsignedShort(), buf.readUnsignedInt(), buf.readUnsignedByte())));
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9555);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9556)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9557)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9558);buf.skipBytes(7); // bsid1
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9559);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9560)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9561)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9562);buf.skipBytes(7); // bsid2
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9563);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9564)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9565)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9566);buf.skipBytes(7); // bss0
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9567);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9568)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9569)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9570);buf.skipBytes(7); // bss1
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9571);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_27at7atlx1e0go8.R.iget(9572)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9573)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9574);buf.skipBytes(7); // bss2
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9575);return position;
    }finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27at7atlx1e0go8.R.inc(9576);

        __CLR4_5_27at7atlx1e0go8.R.inc(9577);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27at7atlx1e0go8.R.inc(9578);buf.skipBytes(2); // header
        __CLR4_5_27at7atlx1e0go8.R.inc(9579);int type = buf.readUnsignedByte();
        __CLR4_5_27at7atlx1e0go8.R.inc(9580);buf.readShort(); // length
        __CLR4_5_27at7atlx1e0go8.R.inc(9581);int index = buf.readUnsignedShort();

        __CLR4_5_27at7atlx1e0go8.R.inc(9582);if ((((type != MSG_GPS && type != MSG_DATA)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9583)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9584)==0&false))) {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9585);sendResponse(channel, type, index);
        }

        }__CLR4_5_27at7atlx1e0go8.R.inc(9586);if ((((type == MSG_LOGIN)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9587)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9588)==0&false))) {{

            __CLR4_5_27at7atlx1e0go8.R.inc(9589);getDeviceSession(channel, remoteAddress, ChannelBuffers.hexDump(buf.readBytes(8)).substring(1));

        } }else {{
            __CLR4_5_27at7atlx1e0go8.R.inc(9590);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_27at7atlx1e0go8.R.inc(9591);if ((((deviceSession == null)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9592)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9593)==0&false))) {{
                __CLR4_5_27at7atlx1e0go8.R.inc(9594);return null;
            }

            }__CLR4_5_27at7atlx1e0go8.R.inc(9595);if ((((type == MSG_GPS || type == MSG_ALARM || type == MSG_STATE || type == MSG_SMS)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9596)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9597)==0&false))) {{
                __CLR4_5_27at7atlx1e0go8.R.inc(9598);return decodeOld(deviceSession, buf, type, index);
            } }else {__CLR4_5_27at7atlx1e0go8.R.inc(9599);if ((((type >= MSG_NORMAL && type <= MSG_OBD_CODE)&&(__CLR4_5_27at7atlx1e0go8.R.iget(9600)!=0|true))||(__CLR4_5_27at7atlx1e0go8.R.iget(9601)==0&false))) {{
                __CLR4_5_27at7atlx1e0go8.R.inc(9602);return decodeNew(deviceSession, buf, index);
            }
        }}}

        }__CLR4_5_27at7atlx1e0go8.R.inc(9603);return null;
    }finally{__CLR4_5_27at7atlx1e0go8.R.flushNeeded();}}

}
