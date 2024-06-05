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

@java.lang.SuppressWarnings({"fallthrough"}) public class CastelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26r06r0lx1dza5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,9030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Map<Integer, Integer> PID_LENGTH_MAP = new HashMap<>();

    static {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8748);
        __CLR4_5_26r06r0lx1dza5o.R.inc(8749);int[] l1 = {
            0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0b, 0x0d,
            0x0e, 0x0f, 0x11, 0x12, 0x13, 0x1c, 0x1d, 0x1e, 0x2c,
            0x2d, 0x2e, 0x2f, 0x30, 0x33, 0x43, 0x45, 0x46,
            0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x51, 0x52,
            0x5a
        };
        __CLR4_5_26r06r0lx1dza5o.R.inc(8750);int[] l2 = {
            0x02, 0x03, 0x0a, 0x0c, 0x10, 0x14, 0x15, 0x16,
            0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1f, 0x21, 0x22,
            0x23, 0x31, 0x32, 0x3c, 0x3d, 0x3e, 0x3f, 0x42,
            0x44, 0x4d, 0x4e, 0x50, 0x53, 0x54, 0x55, 0x56,
            0x57, 0x58, 0x59
        };
        __CLR4_5_26r06r0lx1dza5o.R.inc(8751);int[] l4 = {
            0x00, 0x01, 0x20, 0x24, 0x25, 0x26, 0x27, 0x28,
            0x29, 0x2a, 0x2b, 0x34, 0x35, 0x36, 0x37, 0x38,
            0x39, 0x3a, 0x3b, 0x40, 0x41, 0x4f
        };
        __CLR4_5_26r06r0lx1dza5o.R.inc(8752);for (int i : l1) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8753);PID_LENGTH_MAP.put(i, 1);
        }
        }__CLR4_5_26r06r0lx1dza5o.R.inc(8754);for (int i : l2) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8755);PID_LENGTH_MAP.put(i, 2);
        }
        }__CLR4_5_26r06r0lx1dza5o.R.inc(8756);for (int i : l4) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8757);PID_LENGTH_MAP.put(i, 4);
        }
    }}finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    public CastelProtocolDecoder(CastelProtocol protocol) {
        super(protocol);__CLR4_5_26r06r0lx1dza5o.R.inc(8759);try{__CLR4_5_26r06r0lx1dza5o.R.inc(8758);
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

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

    private Position readPosition(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8760);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8761);Position position = new Position();
        __CLR4_5_26r06r0lx1dza5o.R.inc(8762);position.setProtocol(getProtocolName());
        __CLR4_5_26r06r0lx1dza5o.R.inc(8763);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_26r06r0lx1dza5o.R.inc(8764);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_26r06r0lx1dza5o.R.inc(8765);position.setTime(dateBuilder.getDate());

        __CLR4_5_26r06r0lx1dza5o.R.inc(8766);double lat = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_26r06r0lx1dza5o.R.inc(8767);double lon = buf.readUnsignedInt() / 3600000.0;
        __CLR4_5_26r06r0lx1dza5o.R.inc(8768);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedShort()));
        __CLR4_5_26r06r0lx1dza5o.R.inc(8769);position.setCourse(buf.readUnsignedShort() * 0.1);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8770);int flags = buf.readUnsignedByte();
        __CLR4_5_26r06r0lx1dza5o.R.inc(8771);if (((((flags & 0x02) == 0)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8772)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8773)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8774);lat = -lat;
        }
        }__CLR4_5_26r06r0lx1dza5o.R.inc(8775);if (((((flags & 0x01) == 0)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8776)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8777)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8778);lon = -lon;
        }
        }__CLR4_5_26r06r0lx1dza5o.R.inc(8779);position.setLatitude(lat);
        __CLR4_5_26r06r0lx1dza5o.R.inc(8780);position.setLongitude(lon);
        __CLR4_5_26r06r0lx1dza5o.R.inc(8781);position.setValid((flags & 0x0C) > 0);
        __CLR4_5_26r06r0lx1dza5o.R.inc(8782);position.set(Position.KEY_SATELLITES, flags >> 4);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8783);return position;
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private Position createPosition(DeviceSession deviceSession) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8784);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8785);Position position = new Position();
        __CLR4_5_26r06r0lx1dza5o.R.inc(8786);position.setProtocol(getProtocolName());
        __CLR4_5_26r06r0lx1dza5o.R.inc(8787);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_26r06r0lx1dza5o.R.inc(8788);getLastLocation(position, null);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8789);return position;
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private void decodeObd(Position position, ChannelBuffer buf, boolean groups) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8790);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8791);int count = buf.readUnsignedByte();

        __CLR4_5_26r06r0lx1dza5o.R.inc(8792);int[] pids = new int[count];
        __CLR4_5_26r06r0lx1dza5o.R.inc(8793);for (int i = 0; (((i < count)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8794)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8795)==0&false)); i++) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8796);pids[i] = buf.readUnsignedShort() & 0xff;
        }

        }__CLR4_5_26r06r0lx1dza5o.R.inc(8797);if ((((groups)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8798)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8799)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8800);buf.readUnsignedByte(); // group count
            __CLR4_5_26r06r0lx1dza5o.R.inc(8801);buf.readUnsignedByte(); // group size
        }

        }__CLR4_5_26r06r0lx1dza5o.R.inc(8802);for (int i = 0; (((i < count)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8803)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8804)==0&false)); i++) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8805);int value;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_26r06r0lx1dza5o.R.inc(8806);switch (PID_LENGTH_MAP.get(pids[i])) {
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_26r06r0lx1dza5o.R.inc(8807);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8808);value = buf.readUnsignedByte();
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8809);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_26r06r0lx1dza5o.R.inc(8810);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8811);value = buf.readUnsignedShort();
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8812);break;
                case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_26r06r0lx1dza5o.R.inc(8813);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8814);value = buf.readInt();
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8815);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_26r06r0lx1dza5o.R.inc(8816);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8817);value = 0;
                    __CLR4_5_26r06r0lx1dza5o.R.inc(8818);break;
            }
            __CLR4_5_26r06r0lx1dza5o.R.inc(8819);position.add(ObdDecoder.decodeData(pids[i], value, false));
        }
    }}finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private void decodeStat(Position position, ChannelBuffer buf) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8820);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8821);buf.readUnsignedInt(); // ACC ON time
        __CLR4_5_26r06r0lx1dza5o.R.inc(8822);buf.readUnsignedInt(); // UTC time
        __CLR4_5_26r06r0lx1dza5o.R.inc(8823);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
        __CLR4_5_26r06r0lx1dza5o.R.inc(8824);buf.readUnsignedInt(); // trip odometer
        __CLR4_5_26r06r0lx1dza5o.R.inc(8825);buf.readUnsignedInt(); // total fuel consumption
        __CLR4_5_26r06r0lx1dza5o.R.inc(8826);buf.readUnsignedShort(); // current fuel consumption
        __CLR4_5_26r06r0lx1dza5o.R.inc(8827);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
        __CLR4_5_26r06r0lx1dza5o.R.inc(8828);buf.skipBytes(8);
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private void sendResponse(
            Channel channel, SocketAddress remoteAddress,
            int version, ChannelBuffer id, short type, ChannelBuffer content) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8829);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8830);if ((((channel != null)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8831)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8832)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8833);int length = 2 + 2 + 1 + id.readableBytes() + 2 + 2 + 2;
            __CLR4_5_26r06r0lx1dza5o.R.inc(8834);if ((((content != null)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8835)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8836)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8837);length += content.readableBytes();
            }

            }__CLR4_5_26r06r0lx1dza5o.R.inc(8838);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, length);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8839);response.writeByte('@'); __CLR4_5_26r06r0lx1dza5o.R.inc(8840);response.writeByte('@');
            __CLR4_5_26r06r0lx1dza5o.R.inc(8841);response.writeShort(length);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8842);response.writeByte(version);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8843);response.writeBytes(id);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8844);response.writeShort(ChannelBuffers.swapShort(type));
            __CLR4_5_26r06r0lx1dza5o.R.inc(8845);if ((((content != null)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8846)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8847)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8848);response.writeBytes(content);
            }
            }__CLR4_5_26r06r0lx1dza5o.R.inc(8849);response.writeShort(
                    Checksum.crc16(Checksum.CRC16_X25, response.toByteBuffer(0, response.writerIndex())));
            __CLR4_5_26r06r0lx1dza5o.R.inc(8850);response.writeByte(0x0D); __CLR4_5_26r06r0lx1dza5o.R.inc(8851);response.writeByte(0x0A);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8852);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, short type) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8853);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8854);if ((((channel != null)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8855)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8856)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(8857);int length = 2 + 2 + id.readableBytes() + 2 + 4 + 8 + 2 + 2;

            __CLR4_5_26r06r0lx1dza5o.R.inc(8858);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, length);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8859);response.writeByte('@'); __CLR4_5_26r06r0lx1dza5o.R.inc(8860);response.writeByte('@');
            __CLR4_5_26r06r0lx1dza5o.R.inc(8861);response.writeShort(length);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8862);response.writeBytes(id);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8863);response.writeShort(ChannelBuffers.swapShort(type));
            __CLR4_5_26r06r0lx1dza5o.R.inc(8864);response.writeInt(0);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8865);for (int i = 0; (((i < 8)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8866)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8867)==0&false)); i++) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8868);response.writeByte(0xff);
            }
            }__CLR4_5_26r06r0lx1dza5o.R.inc(8869);response.writeShort(
                    Checksum.crc16(Checksum.CRC16_X25, response.toByteBuffer(0, response.writerIndex())));
            __CLR4_5_26r06r0lx1dza5o.R.inc(8870);response.writeByte(0x0D); __CLR4_5_26r06r0lx1dza5o.R.inc(8871);response.writeByte(0x0A);
            __CLR4_5_26r06r0lx1dza5o.R.inc(8872);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    private Object decodeSc(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf,
            int version, ChannelBuffer id, int type, DeviceSession deviceSession) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8873);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8874);if ((((type == MSG_SC_HEARTBEAT)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8875)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8876)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8877);sendResponse(channel, remoteAddress, version, id, MSG_SC_HEARTBEAT_RESPONSE, null);

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8878);if ((((type == MSG_SC_LOGIN || type == MSG_SC_LOGOUT || type == MSG_SC_GPS
                || type == MSG_SC_ALARM || type == MSG_SC_CURRENT_LOCATION)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8879)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8880)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8881);if ((((type == MSG_SC_LOGIN)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8882)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8883)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8884);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 10);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8885);response.writeInt(0xFFFFFFFF);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8886);response.writeShort(0);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8887);response.writeInt((int) (System.currentTimeMillis() / 1000));
                __CLR4_5_26r06r0lx1dza5o.R.inc(8888);sendResponse(channel, remoteAddress, version, id, MSG_SC_LOGIN_RESPONSE, response);
            }

            }__CLR4_5_26r06r0lx1dza5o.R.inc(8889);if ((((type == MSG_SC_GPS)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8890)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8891)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8892);buf.readUnsignedByte(); // historical
            } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8893);if ((((type == MSG_SC_ALARM)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8894)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8895)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8896);buf.readUnsignedInt(); // alarm
            } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8897);if ((((type == MSG_SC_CURRENT_LOCATION)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8898)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8899)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8900);buf.readUnsignedShort();
            }

            }}}__CLR4_5_26r06r0lx1dza5o.R.inc(8901);buf.readUnsignedInt(); // ACC ON time
            __CLR4_5_26r06r0lx1dza5o.R.inc(8902);buf.readUnsignedInt(); // UTC time
            __CLR4_5_26r06r0lx1dza5o.R.inc(8903);long odometer = buf.readUnsignedInt();
            __CLR4_5_26r06r0lx1dza5o.R.inc(8904);buf.readUnsignedInt(); // trip odometer
            __CLR4_5_26r06r0lx1dza5o.R.inc(8905);buf.readUnsignedInt(); // total fuel consumption
            __CLR4_5_26r06r0lx1dza5o.R.inc(8906);buf.readUnsignedShort(); // current fuel consumption
            __CLR4_5_26r06r0lx1dza5o.R.inc(8907);long status = buf.readUnsignedInt();
            __CLR4_5_26r06r0lx1dza5o.R.inc(8908);buf.skipBytes(8);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8909);int count = buf.readUnsignedByte();

            __CLR4_5_26r06r0lx1dza5o.R.inc(8910);List<Position> positions = new LinkedList<>();

            __CLR4_5_26r06r0lx1dza5o.R.inc(8911);for (int i = 0; (((i < count)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8912)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8913)==0&false)); i++) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8914);Position position = readPosition(deviceSession, buf);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8915);position.set(Position.KEY_ODOMETER, odometer);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8916);position.set(Position.KEY_STATUS, status);
                __CLR4_5_26r06r0lx1dza5o.R.inc(8917);positions.add(position);
            }

            }__CLR4_5_26r06r0lx1dza5o.R.inc(8918);if ((((!positions.isEmpty())&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8919)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8920)==0&false))) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8921);return positions;
            }

        }} }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8922);if ((((type == MSG_SC_GPS_SLEEP)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8923)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8924)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8925);buf.readUnsignedInt(); // device time

            __CLR4_5_26r06r0lx1dza5o.R.inc(8926);return readPosition(deviceSession, buf);

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8927);if ((((type == MSG_SC_AGPS_REQUEST)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8928)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8929)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8930);return readPosition(deviceSession, buf);

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8931);if ((((type == MSG_SC_PID_DATA)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8932)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8933)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8934);Position position = createPosition(deviceSession);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8935);decodeStat(position, buf);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8936);buf.readUnsignedShort(); // sample rate
            __CLR4_5_26r06r0lx1dza5o.R.inc(8937);decodeObd(position, buf, true);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8938);return position;

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8939);if ((((type == MSG_SC_DTCS_PASSENGER)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8940)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8941)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8942);Position position = createPosition(deviceSession);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8943);decodeStat(position, buf);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8944);buf.readUnsignedByte(); // flag
            __CLR4_5_26r06r0lx1dza5o.R.inc(8945);position.add(ObdDecoder.decodeCodes(ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedByte()))));

            __CLR4_5_26r06r0lx1dza5o.R.inc(8946);return position;

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8947);if ((((type == MSG_SC_OBD_DATA)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8948)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8949)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8950);Position position = createPosition(deviceSession);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8951);decodeStat(position, buf);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8952);buf.readUnsignedByte(); // flag
            __CLR4_5_26r06r0lx1dza5o.R.inc(8953);decodeObd(position, buf, false);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8954);return position;

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8955);if ((((type == MSG_SC_CELL)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8956)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8957)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8958);Position position = createPosition(deviceSession);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8959);decodeStat(position, buf);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8960);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));

            __CLR4_5_26r06r0lx1dza5o.R.inc(8961);return position;

        }

        }}}}}}}}__CLR4_5_26r06r0lx1dza5o.R.inc(8962);return null;
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}


    private Object decodeCc(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf,
            int version, ChannelBuffer id, int type, DeviceSession deviceSession) {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8963);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8964);if ((((type == MSG_CC_HEARTBEAT)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8965)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8966)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8967);sendResponse(channel, remoteAddress, version, id, MSG_CC_HEARTBEAT_RESPONSE, null);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8968);buf.readUnsignedByte(); // 0x01 for history
            __CLR4_5_26r06r0lx1dza5o.R.inc(8969);int count = buf.readUnsignedByte();

            __CLR4_5_26r06r0lx1dza5o.R.inc(8970);List<Position> positions = new LinkedList<>();

            __CLR4_5_26r06r0lx1dza5o.R.inc(8971);for (int i = 0; (((i < count)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8972)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8973)==0&false)); i++) {{
                __CLR4_5_26r06r0lx1dza5o.R.inc(8974);Position position = readPosition(deviceSession, buf);

                __CLR4_5_26r06r0lx1dza5o.R.inc(8975);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
                __CLR4_5_26r06r0lx1dza5o.R.inc(8976);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
                __CLR4_5_26r06r0lx1dza5o.R.inc(8977);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_26r06r0lx1dza5o.R.inc(8978);buf.readUnsignedByte(); // geo-fencing id
                __CLR4_5_26r06r0lx1dza5o.R.inc(8979);buf.readUnsignedByte(); // geo-fencing flags
                __CLR4_5_26r06r0lx1dza5o.R.inc(8980);buf.readUnsignedByte(); // additional flags

                __CLR4_5_26r06r0lx1dza5o.R.inc(8981);position.setNetwork(new Network(
                        CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));

                __CLR4_5_26r06r0lx1dza5o.R.inc(8982);positions.add(position);
            }

            }__CLR4_5_26r06r0lx1dza5o.R.inc(8983);return positions;

        } }else {__CLR4_5_26r06r0lx1dza5o.R.inc(8984);if ((((type == MSG_CC_LOGIN)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(8985)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(8986)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(8987);sendResponse(channel, remoteAddress, version, id, MSG_CC_LOGIN_RESPONSE, null);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8988);Position position = readPosition(deviceSession, buf);

            __CLR4_5_26r06r0lx1dza5o.R.inc(8989);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
            __CLR4_5_26r06r0lx1dza5o.R.inc(8990);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
            __CLR4_5_26r06r0lx1dza5o.R.inc(8991);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_26r06r0lx1dza5o.R.inc(8992);buf.readUnsignedByte(); // geo-fencing id
            __CLR4_5_26r06r0lx1dza5o.R.inc(8993);buf.readUnsignedByte(); // geo-fencing flags
            __CLR4_5_26r06r0lx1dza5o.R.inc(8994);buf.readUnsignedByte(); // additional flags

            // GSM_CELL_CODE
            // STR_Z - firmware version
            // STR_Z - hardware version

            __CLR4_5_26r06r0lx1dza5o.R.inc(8995);return position;

        }

        }}__CLR4_5_26r06r0lx1dza5o.R.inc(8996);return null;
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26r06r0lx1dza5o.R.inc(8997);

        __CLR4_5_26r06r0lx1dza5o.R.inc(8998);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26r06r0lx1dza5o.R.inc(8999);int header = buf.readUnsignedShort();
        __CLR4_5_26r06r0lx1dza5o.R.inc(9000);buf.readUnsignedShort(); // length

        __CLR4_5_26r06r0lx1dza5o.R.inc(9001);int version = -1;
        __CLR4_5_26r06r0lx1dza5o.R.inc(9002);if ((((header == 0x4040)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(9003)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(9004)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(9005);version = buf.readUnsignedByte();
        }

        }__CLR4_5_26r06r0lx1dza5o.R.inc(9006);ChannelBuffer id = buf.readBytes(20);
        __CLR4_5_26r06r0lx1dza5o.R.inc(9007);int type = ChannelBuffers.swapShort(buf.readShort());

        __CLR4_5_26r06r0lx1dza5o.R.inc(9008);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, id.toString(StandardCharsets.US_ASCII).trim());
        __CLR4_5_26r06r0lx1dza5o.R.inc(9009);if ((((deviceSession == null)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(9010)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(9011)==0&false))) {{
            __CLR4_5_26r06r0lx1dza5o.R.inc(9012);return null;
        }

        }__CLR4_5_26r06r0lx1dza5o.R.inc(9013);if ((((version == -1)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(9014)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(9015)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(9016);if ((((type == 0x2001)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(9017)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(9018)==0&false))) {{

                __CLR4_5_26r06r0lx1dza5o.R.inc(9019);sendResponse(channel, remoteAddress, id, (short) 0x1001);

                __CLR4_5_26r06r0lx1dza5o.R.inc(9020);buf.readUnsignedInt(); // index
                __CLR4_5_26r06r0lx1dza5o.R.inc(9021);buf.readUnsignedInt(); // unix time
                __CLR4_5_26r06r0lx1dza5o.R.inc(9022);buf.readUnsignedByte();

                __CLR4_5_26r06r0lx1dza5o.R.inc(9023);return readPosition(deviceSession, buf);

            }

        }} }else {__CLR4_5_26r06r0lx1dza5o.R.inc(9024);if ((((version == 4)&&(__CLR4_5_26r06r0lx1dza5o.R.iget(9025)!=0|true))||(__CLR4_5_26r06r0lx1dza5o.R.iget(9026)==0&false))) {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(9027);return decodeSc(channel, remoteAddress, buf, version, id, type, deviceSession);

        } }else {{

            __CLR4_5_26r06r0lx1dza5o.R.inc(9028);return decodeCc(channel, remoteAddress, buf, version, id, type, deviceSession);

        }

        }}__CLR4_5_26r06r0lx1dza5o.R.inc(9029);return null;
    }finally{__CLR4_5_26r06r0lx1dza5o.R.flushNeeded();}}

}
