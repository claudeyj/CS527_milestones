/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.ObdDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@java.lang.SuppressWarnings({"fallthrough"}) public class CastelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27k97k9lwye7e3u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,10085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Map<Integer, Integer> PID_LENGTH_MAP = new HashMap<>();

    static {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9801);
        __CLR4_5_27k97k9lwye7e3u.R.inc(9802);int[] l1 = {
            0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0b, 0x0d,
            0x0e, 0x0f, 0x11, 0x12, 0x13, 0x1c, 0x1d, 0x1e, 0x2c,
            0x2d, 0x2e, 0x2f, 0x30, 0x33, 0x43, 0x45, 0x46,
            0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x51, 0x52,
            0x5a
        };
        __CLR4_5_27k97k9lwye7e3u.R.inc(9803);int[] l2 = {
            0x02, 0x03, 0x0a, 0x0c, 0x10, 0x14, 0x15, 0x16,
            0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1f, 0x21, 0x22,
            0x23, 0x31, 0x32, 0x3c, 0x3d, 0x3e, 0x3f, 0x42,
            0x44, 0x4d, 0x4e, 0x50, 0x53, 0x54, 0x55, 0x56,
            0x57, 0x58, 0x59
        };
        __CLR4_5_27k97k9lwye7e3u.R.inc(9804);int[] l4 = {
            0x00, 0x01, 0x20, 0x24, 0x25, 0x26, 0x27, 0x28,
            0x29, 0x2a, 0x2b, 0x34, 0x35, 0x36, 0x37, 0x38,
            0x39, 0x3a, 0x3b, 0x40, 0x41, 0x4f
        };
        __CLR4_5_27k97k9lwye7e3u.R.inc(9805);for (int i : l1) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9806);PID_LENGTH_MAP.put(i, 1);
        }
        }__CLR4_5_27k97k9lwye7e3u.R.inc(9807);for (int i : l2) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9808);PID_LENGTH_MAP.put(i, 2);
        }
        }__CLR4_5_27k97k9lwye7e3u.R.inc(9809);for (int i : l4) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9810);PID_LENGTH_MAP.put(i, 4);
        }
    }}finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    public CastelProtocolDecoder(CastelProtocol protocol) {
        super(protocol);__CLR4_5_27k97k9lwye7e3u.R.inc(9812);try{__CLR4_5_27k97k9lwye7e3u.R.inc(9811);
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    public static final short MSG_SC_LOGIN = 0x1001;
    public static final short MSG_SC_LOGIN_RESPONSE = (short) 0x9001;
    public static final short MSG_SC_LOGOUT = 0x1002;
    public static final short MSG_SC_HEARTBEAT = 0x1003;
    public static final short MSG_SC_HEARTBEAT_RESPONSE = (short) 0x9003;
    public static final short MSG_SC_GPS = 0x4001;
    public static final short MSG_SC_PID_DATA = 0x4002;
    public static final short MSG_SC_SUPPORTED_PID = 0x4004;
    public static final short MSG_SC_OBD_DATA = 0x4005;
    public static final short MSG_SC_DTCS_PASSENGER = 0x4006;
    public static final short MSG_SC_DTCS_COMMERCIAL = 0x400B;
    public static final short MSG_SC_ALARM = 0x4007;
    public static final short MSG_SC_CELL = 0x4008;
    public static final short MSG_SC_GPS_SLEEP = 0x4009;
    public static final short MSG_SC_AGPS_REQUEST = 0x5101;
    public static final short MSG_SC_CURRENT_LOCATION = (short) 0xB001;

    public static final short MSG_CC_LOGIN = 0x4001;
    public static final short MSG_CC_LOGIN_RESPONSE = (short) 0x8001;
    public static final short MSG_CC_HEARTBEAT = 0x4206;
    public static final short MSG_CC_HEARTBEAT_RESPONSE = (short) 0x8206;

    private Position readPosition(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9813);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9814);Position position = new Position();
        __CLR4_5_27k97k9lwye7e3u.R.inc(9815);position.setProtocol(getProtocolName());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9816);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27k97k9lwye7e3u.R.inc(9817);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9818);position.setTime(dateBuilder.getDate());

        __CLR4_5_27k97k9lwye7e3u.R.inc(9819);double lat = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_27k97k9lwye7e3u.R.inc(9820);double lon = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_27k97k9lwye7e3u.R.inc(9821);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedShort()));
        __CLR4_5_27k97k9lwye7e3u.R.inc(9822);position.setCourse(buf.readUnsignedShort() * 0.1);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9823);int flags = buf.readUnsignedByte();
        __CLR4_5_27k97k9lwye7e3u.R.inc(9824);if (((((flags & 0x02) == 0)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9825)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9826)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9827);lat = -lat;
        }
        }__CLR4_5_27k97k9lwye7e3u.R.inc(9828);if (((((flags & 0x01) == 0)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9829)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9830)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9831);lon = -lon;
        }
        }__CLR4_5_27k97k9lwye7e3u.R.inc(9832);position.setLatitude(lat);
        __CLR4_5_27k97k9lwye7e3u.R.inc(9833);position.setLongitude(lon);
        __CLR4_5_27k97k9lwye7e3u.R.inc(9834);position.setValid((flags & 0x0C) > 0);
        __CLR4_5_27k97k9lwye7e3u.R.inc(9835);position.set(Position.KEY_SATELLITES, flags >> 4);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9836);return position;
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private Position createPosition(DeviceSession deviceSession) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9837);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9838);Position position = new Position();
        __CLR4_5_27k97k9lwye7e3u.R.inc(9839);position.setProtocol(getProtocolName());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9840);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_27k97k9lwye7e3u.R.inc(9841);getLastLocation(position, null);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9842);return position;
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private void decodeObd(Position position, ChannelBuffer buf, boolean groups) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9843);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9844);int count = buf.readUnsignedByte();

        __CLR4_5_27k97k9lwye7e3u.R.inc(9845);int[] pids = new int[count];
        __CLR4_5_27k97k9lwye7e3u.R.inc(9846);for (int i = 0; (((i < count)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9847)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9848)==0&false)); i++) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9849);pids[i] = buf.readUnsignedShort() & 0xff;
        }

        }__CLR4_5_27k97k9lwye7e3u.R.inc(9850);if ((((groups)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9851)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9852)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9853);buf.readUnsignedByte(); // group count
            __CLR4_5_27k97k9lwye7e3u.R.inc(9854);buf.readUnsignedByte(); // group size
        }

        }__CLR4_5_27k97k9lwye7e3u.R.inc(9855);for (int i = 0; (((i < count)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9856)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9857)==0&false)); i++) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9858);int value;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_27k97k9lwye7e3u.R.inc(9859);switch (PID_LENGTH_MAP.get(pids[i])) {
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_27k97k9lwye7e3u.R.inc(9860);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9861);value = buf.readUnsignedByte();
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9862);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_27k97k9lwye7e3u.R.inc(9863);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9864);value = buf.readUnsignedShort();
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9865);break;
                case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_27k97k9lwye7e3u.R.inc(9866);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9867);value = buf.readInt();
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9868);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_27k97k9lwye7e3u.R.inc(9869);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9870);value = 0;
                    __CLR4_5_27k97k9lwye7e3u.R.inc(9871);break;
            }
            __CLR4_5_27k97k9lwye7e3u.R.inc(9872);position.add(ObdDecoder.decodeData(pids[i], value, false));
        }
    }}finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private void decodeStat(Position position, ChannelBuffer buf) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9873);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9874);buf.readUnsignedInt(); // ACC ON time
        __CLR4_5_27k97k9lwye7e3u.R.inc(9875);buf.readUnsignedInt(); // UTC time
        __CLR4_5_27k97k9lwye7e3u.R.inc(9876);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9877);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9878);position.set(Position.KEY_FUEL_CONSUMPTION, buf.readUnsignedInt());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9879);buf.readUnsignedShort(); // current fuel consumption
        __CLR4_5_27k97k9lwye7e3u.R.inc(9880);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
        __CLR4_5_27k97k9lwye7e3u.R.inc(9881);buf.skipBytes(8);
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private void sendResponse(
            Channel channel, SocketAddress remoteAddress,
            int version, ChannelBuffer id, short type, ChannelBuffer content) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9882);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9883);if ((((channel != null)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9884)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9885)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9886);int length = 2 + 2 + 1 + id.readableBytes() + 2 + 2 + 2;
            __CLR4_5_27k97k9lwye7e3u.R.inc(9887);if ((((content != null)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9888)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9889)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9890);length += content.readableBytes();
            }

            }__CLR4_5_27k97k9lwye7e3u.R.inc(9891);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, length);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9892);response.writeByte('@'); __CLR4_5_27k97k9lwye7e3u.R.inc(9893);response.writeByte('@');
            __CLR4_5_27k97k9lwye7e3u.R.inc(9894);response.writeShort(length);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9895);response.writeByte(version);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9896);response.writeBytes(id);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9897);response.writeShort(ChannelBuffers.swapShort(type));
            __CLR4_5_27k97k9lwye7e3u.R.inc(9898);if ((((content != null)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9899)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9900)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9901);response.writeBytes(content);
            }
            }__CLR4_5_27k97k9lwye7e3u.R.inc(9902);response.writeShort(
                    Checksum.crc16(Checksum.CRC16_X25, response.toByteBuffer(0, response.writerIndex())));
            __CLR4_5_27k97k9lwye7e3u.R.inc(9903);response.writeByte(0x0D); __CLR4_5_27k97k9lwye7e3u.R.inc(9904);response.writeByte(0x0A);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9905);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, short type) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9906);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9907);if ((((channel != null)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9908)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9909)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(9910);int length = 2 + 2 + id.readableBytes() + 2 + 4 + 8 + 2 + 2;

            __CLR4_5_27k97k9lwye7e3u.R.inc(9911);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, length);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9912);response.writeByte('@'); __CLR4_5_27k97k9lwye7e3u.R.inc(9913);response.writeByte('@');
            __CLR4_5_27k97k9lwye7e3u.R.inc(9914);response.writeShort(length);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9915);response.writeBytes(id);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9916);response.writeShort(ChannelBuffers.swapShort(type));
            __CLR4_5_27k97k9lwye7e3u.R.inc(9917);response.writeInt(0);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9918);for (int i = 0; (((i < 8)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9919)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9920)==0&false)); i++) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9921);response.writeByte(0xff);
            }
            }__CLR4_5_27k97k9lwye7e3u.R.inc(9922);response.writeShort(
                    Checksum.crc16(Checksum.CRC16_X25, response.toByteBuffer(0, response.writerIndex())));
            __CLR4_5_27k97k9lwye7e3u.R.inc(9923);response.writeByte(0x0D); __CLR4_5_27k97k9lwye7e3u.R.inc(9924);response.writeByte(0x0A);
            __CLR4_5_27k97k9lwye7e3u.R.inc(9925);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    private Object decodeSc(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf,
            int version, ChannelBuffer id, int type, DeviceSession deviceSession) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(9926);

        __CLR4_5_27k97k9lwye7e3u.R.inc(9927);if ((((type == MSG_SC_HEARTBEAT)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9928)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9929)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9930);sendResponse(channel, remoteAddress, version, id, MSG_SC_HEARTBEAT_RESPONSE, null);

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9931);if ((((type == MSG_SC_LOGIN || type == MSG_SC_LOGOUT || type == MSG_SC_GPS
                || type == MSG_SC_ALARM || type == MSG_SC_CURRENT_LOCATION)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9932)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9933)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9934);if ((((type == MSG_SC_LOGIN)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9935)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9936)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9937);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 10);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9938);response.writeInt(0xFFFFFFFF);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9939);response.writeShort(0);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9940);response.writeInt((int) (System.currentTimeMillis() / 1000));
                __CLR4_5_27k97k9lwye7e3u.R.inc(9941);sendResponse(channel, remoteAddress, version, id, MSG_SC_LOGIN_RESPONSE, response);
            }

            }__CLR4_5_27k97k9lwye7e3u.R.inc(9942);if ((((type == MSG_SC_GPS)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9943)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9944)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9945);buf.readUnsignedByte(); // historical
            } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9946);if ((((type == MSG_SC_ALARM)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9947)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9948)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9949);buf.readUnsignedInt(); // alarm
            } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9950);if ((((type == MSG_SC_CURRENT_LOCATION)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9951)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9952)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9953);buf.readUnsignedShort();
            }

            }}}__CLR4_5_27k97k9lwye7e3u.R.inc(9954);buf.readUnsignedInt(); // ACC ON time
            __CLR4_5_27k97k9lwye7e3u.R.inc(9955);buf.readUnsignedInt(); // UTC time
            __CLR4_5_27k97k9lwye7e3u.R.inc(9956);long odometer = buf.readUnsignedInt();
            __CLR4_5_27k97k9lwye7e3u.R.inc(9957);long tripOdometer = buf.readUnsignedInt();
            __CLR4_5_27k97k9lwye7e3u.R.inc(9958);long fuelConsumption = buf.readUnsignedInt();
            __CLR4_5_27k97k9lwye7e3u.R.inc(9959);buf.readUnsignedShort(); // current fuel consumption
            __CLR4_5_27k97k9lwye7e3u.R.inc(9960);long status = buf.readUnsignedInt();
            __CLR4_5_27k97k9lwye7e3u.R.inc(9961);buf.skipBytes(8);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9962);int count = buf.readUnsignedByte();

            __CLR4_5_27k97k9lwye7e3u.R.inc(9963);List<Position> positions = new LinkedList<>();

            __CLR4_5_27k97k9lwye7e3u.R.inc(9964);for (int i = 0; (((i < count)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9965)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9966)==0&false)); i++) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9967);Position position = readPosition(deviceSession, buf);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9968);position.set(Position.KEY_ODOMETER, odometer);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9969);position.set(Position.KEY_ODOMETER_TRIP, tripOdometer);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9970);position.set(Position.KEY_FUEL_CONSUMPTION, fuelConsumption);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9971);position.set(Position.KEY_STATUS, status);
                __CLR4_5_27k97k9lwye7e3u.R.inc(9972);positions.add(position);
            }

            }__CLR4_5_27k97k9lwye7e3u.R.inc(9973);if ((((!positions.isEmpty())&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9974)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9975)==0&false))) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(9976);return positions;
            }

        }} }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9977);if ((((type == MSG_SC_GPS_SLEEP)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9978)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9979)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9980);buf.readUnsignedInt(); // device time

            __CLR4_5_27k97k9lwye7e3u.R.inc(9981);return readPosition(deviceSession, buf);

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9982);if ((((type == MSG_SC_AGPS_REQUEST)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9983)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9984)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9985);return readPosition(deviceSession, buf);

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9986);if ((((type == MSG_SC_PID_DATA)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9987)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9988)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9989);Position position = createPosition(deviceSession);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9990);decodeStat(position, buf);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9991);buf.readUnsignedShort(); // sample rate
            __CLR4_5_27k97k9lwye7e3u.R.inc(9992);decodeObd(position, buf, true);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9993);return position;

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(9994);if ((((type == MSG_SC_DTCS_PASSENGER)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(9995)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(9996)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(9997);Position position = createPosition(deviceSession);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9998);decodeStat(position, buf);

            __CLR4_5_27k97k9lwye7e3u.R.inc(9999);buf.readUnsignedByte(); // flag
            __CLR4_5_27k97k9lwye7e3u.R.inc(10000);position.add(ObdDecoder.decodeCodes(ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedByte()))));

            __CLR4_5_27k97k9lwye7e3u.R.inc(10001);return position;

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(10002);if ((((type == MSG_SC_OBD_DATA)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10003)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10004)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10005);Position position = createPosition(deviceSession);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10006);decodeStat(position, buf);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10007);buf.readUnsignedByte(); // flag
            __CLR4_5_27k97k9lwye7e3u.R.inc(10008);decodeObd(position, buf, false);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10009);return position;

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(10010);if ((((type == MSG_SC_CELL)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10011)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10012)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10013);Position position = createPosition(deviceSession);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10014);decodeStat(position, buf);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10015);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));

            __CLR4_5_27k97k9lwye7e3u.R.inc(10016);return position;

        }

        }}}}}}}}__CLR4_5_27k97k9lwye7e3u.R.inc(10017);return null;
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}


    private Object decodeCc(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf,
            int version, ChannelBuffer id, int type, DeviceSession deviceSession) {try{__CLR4_5_27k97k9lwye7e3u.R.inc(10018);

        __CLR4_5_27k97k9lwye7e3u.R.inc(10019);if ((((type == MSG_CC_HEARTBEAT)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10020)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10021)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10022);sendResponse(channel, remoteAddress, version, id, MSG_CC_HEARTBEAT_RESPONSE, null);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10023);buf.readUnsignedByte(); // 0x01 for history
            __CLR4_5_27k97k9lwye7e3u.R.inc(10024);int count = buf.readUnsignedByte();

            __CLR4_5_27k97k9lwye7e3u.R.inc(10025);List<Position> positions = new LinkedList<>();

            __CLR4_5_27k97k9lwye7e3u.R.inc(10026);for (int i = 0; (((i < count)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10027)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10028)==0&false)); i++) {{
                __CLR4_5_27k97k9lwye7e3u.R.inc(10029);Position position = readPosition(deviceSession, buf);

                __CLR4_5_27k97k9lwye7e3u.R.inc(10030);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
                __CLR4_5_27k97k9lwye7e3u.R.inc(10031);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
                __CLR4_5_27k97k9lwye7e3u.R.inc(10032);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_27k97k9lwye7e3u.R.inc(10033);buf.readUnsignedByte(); // geo-fencing id
                __CLR4_5_27k97k9lwye7e3u.R.inc(10034);buf.readUnsignedByte(); // geo-fencing flags
                __CLR4_5_27k97k9lwye7e3u.R.inc(10035);buf.readUnsignedByte(); // additional flags

                __CLR4_5_27k97k9lwye7e3u.R.inc(10036);position.setNetwork(new Network(
                        CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));

                __CLR4_5_27k97k9lwye7e3u.R.inc(10037);positions.add(position);
            }

            }__CLR4_5_27k97k9lwye7e3u.R.inc(10038);return positions;

        } }else {__CLR4_5_27k97k9lwye7e3u.R.inc(10039);if ((((type == MSG_CC_LOGIN)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10040)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10041)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10042);sendResponse(channel, remoteAddress, version, id, MSG_CC_LOGIN_RESPONSE, null);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10043);Position position = readPosition(deviceSession, buf);

            __CLR4_5_27k97k9lwye7e3u.R.inc(10044);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_27k97k9lwye7e3u.R.inc(10045);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
            __CLR4_5_27k97k9lwye7e3u.R.inc(10046);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_27k97k9lwye7e3u.R.inc(10047);buf.readUnsignedByte(); // geo-fencing id
            __CLR4_5_27k97k9lwye7e3u.R.inc(10048);buf.readUnsignedByte(); // geo-fencing flags
            __CLR4_5_27k97k9lwye7e3u.R.inc(10049);buf.readUnsignedByte(); // additional flags

            // GSM_CELL_CODE
            // STR_Z - firmware version
            // STR_Z - hardware version

            __CLR4_5_27k97k9lwye7e3u.R.inc(10050);return position;

        }

        }}__CLR4_5_27k97k9lwye7e3u.R.inc(10051);return null;
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27k97k9lwye7e3u.R.inc(10052);

        __CLR4_5_27k97k9lwye7e3u.R.inc(10053);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27k97k9lwye7e3u.R.inc(10054);int header = buf.readUnsignedShort();
        __CLR4_5_27k97k9lwye7e3u.R.inc(10055);buf.readUnsignedShort(); // length

        __CLR4_5_27k97k9lwye7e3u.R.inc(10056);int version = -1;
        __CLR4_5_27k97k9lwye7e3u.R.inc(10057);if ((((header == 0x4040)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10058)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10059)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(10060);version = buf.readUnsignedByte();
        }

        }__CLR4_5_27k97k9lwye7e3u.R.inc(10061);ChannelBuffer id = buf.readBytes(20);
        __CLR4_5_27k97k9lwye7e3u.R.inc(10062);int type = ChannelBuffers.swapShort(buf.readShort());

        __CLR4_5_27k97k9lwye7e3u.R.inc(10063);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, id.toString(StandardCharsets.US_ASCII).trim());
        __CLR4_5_27k97k9lwye7e3u.R.inc(10064);if ((((deviceSession == null)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10065)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10066)==0&false))) {{
            __CLR4_5_27k97k9lwye7e3u.R.inc(10067);return null;
        }

        }__CLR4_5_27k97k9lwye7e3u.R.inc(10068);if ((((version == -1)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10069)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10070)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10071);if ((((type == 0x2001)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10072)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10073)==0&false))) {{

                __CLR4_5_27k97k9lwye7e3u.R.inc(10074);sendResponse(channel, remoteAddress, id, (short) 0x1001);

                __CLR4_5_27k97k9lwye7e3u.R.inc(10075);buf.readUnsignedInt(); // index
                __CLR4_5_27k97k9lwye7e3u.R.inc(10076);buf.readUnsignedInt(); // unix time
                __CLR4_5_27k97k9lwye7e3u.R.inc(10077);buf.readUnsignedByte();

                __CLR4_5_27k97k9lwye7e3u.R.inc(10078);return readPosition(deviceSession, buf);

            }

        }} }else {__CLR4_5_27k97k9lwye7e3u.R.inc(10079);if ((((version == 3 || version == 4)&&(__CLR4_5_27k97k9lwye7e3u.R.iget(10080)!=0|true))||(__CLR4_5_27k97k9lwye7e3u.R.iget(10081)==0&false))) {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10082);return decodeSc(channel, remoteAddress, buf, version, id, type, deviceSession);

        } }else {{

            __CLR4_5_27k97k9lwye7e3u.R.inc(10083);return decodeCc(channel, remoteAddress, buf, version, id, type, deviceSession);

        }

        }}__CLR4_5_27k97k9lwye7e3u.R.inc(10084);return null;
    }finally{__CLR4_5_27k97k9lwye7e3u.R.flushNeeded();}}

}
