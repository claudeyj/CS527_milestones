/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@java.lang.SuppressWarnings({"fallthrough"}) public class GalileoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27op7oplx1dzaet{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,10091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GalileoProtocolDecoder(GalileoProtocol protocol) {
        super(protocol);__CLR4_5_27op7oplx1dzaet.R.inc(9962);try{__CLR4_5_27op7oplx1dzaet.R.inc(9961);
    }finally{__CLR4_5_27op7oplx1dzaet.R.flushNeeded();}}

    private static final int TAG_IMEI = 0x03;
    private static final int TAG_DATE = 0x20;
    private static final int TAG_COORDINATES = 0x30;
    private static final int TAG_SPEED_COURSE = 0x33;
    private static final int TAG_ALTITUDE = 0x34;
    private static final int TAG_STATUS = 0x40;
    private static final int TAG_POWER = 0x41;
    private static final int TAG_BATTERY = 0x42;
    private static final int TAG_ODOMETER = 0xd4;
    private static final int TAG_REFRIGERATOR = 0x5b;
    private static final int TAG_PRESSURE = 0x5c;
    private static final int TAG_CAN = 0xc1;
    private static final int TAG_ADC0 = 0x50;
    private static final int TAG_ADC1 = 0x51;
    private static final int TAG_ADC2 = 0x52;
    private static final int TAG_ADC3 = 0x53;
    private static final int TAG_ARRAY = 0xea;

    private static final Map<Integer, Integer> TAG_LENGTH_MAP = new HashMap<>();

    static {try{__CLR4_5_27op7oplx1dzaet.R.inc(9963);
        __CLR4_5_27op7oplx1dzaet.R.inc(9964);int[] l1 = {
            0x01, 0x02, 0x35, 0x43, 0xc4, 0xc5, 0xc6, 0xc7,
            0xc8, 0xc9, 0xca, 0xcb, 0xcc, 0xcd, 0xce, 0xcf,
            0xd0, 0xd1, 0xd2, 0xd5, 0x88, 0x8a, 0x8b, 0x8c,
            0xa0, 0xaf, 0xa1, 0xa2, 0xa3, 0xa4, 0xa5, 0xa6,
            0xa7, 0xa8, 0xa9, 0xaa, 0xab, 0xac, 0xad, 0xae
        };
        __CLR4_5_27op7oplx1dzaet.R.inc(9965);int[] l2 = {
            0x04, 0x10, 0x34, 0x40, 0x41, 0x42, 0x45, 0x46,
            0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x60, 0x61,
            0x62, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76,
            0x77, 0xb0, 0xb1, 0xb2, 0xb3, 0xb4, 0xb5, 0xb6,
            0xb7, 0xb8, 0xb9, 0xd6, 0xd7, 0xd8, 0xd9, 0xda
        };
        __CLR4_5_27op7oplx1dzaet.R.inc(9966);int[] l3 = {
            0x63, 0x64, 0x6f, 0x5d, 0x65, 0x66, 0x67, 0x68,
            0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e
        };
        __CLR4_5_27op7oplx1dzaet.R.inc(9967);int[] l4 = {
            0x20, 0x33, 0x44, 0x90, 0xc0, 0xc2, 0xc3, 0xd3,
            0xd4, 0xdb, 0xdc, 0xdd, 0xde, 0xdf, 0xf0, 0xf9,
            0x5a, 0x47, 0xf1, 0xf2, 0xf3, 0xf4, 0xf5, 0xf6,
            0xf7, 0xf8, 0xe2, 0xe9
        };
        __CLR4_5_27op7oplx1dzaet.R.inc(9968);for (int i : l1) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9969);TAG_LENGTH_MAP.put(i, 1);
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(9970);for (int i : l2) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9971);TAG_LENGTH_MAP.put(i, 2);
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(9972);for (int i : l3) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9973);TAG_LENGTH_MAP.put(i, 3);
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(9974);for (int i : l4) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9975);TAG_LENGTH_MAP.put(i, 4);
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(9976);TAG_LENGTH_MAP.put(TAG_COORDINATES, 9);
        __CLR4_5_27op7oplx1dzaet.R.inc(9977);TAG_LENGTH_MAP.put(TAG_IMEI, 15);
        __CLR4_5_27op7oplx1dzaet.R.inc(9978);TAG_LENGTH_MAP.put(TAG_REFRIGERATOR, 7); // variable length
        __CLR4_5_27op7oplx1dzaet.R.inc(9979);TAG_LENGTH_MAP.put(TAG_PRESSURE, 68);
    }finally{__CLR4_5_27op7oplx1dzaet.R.flushNeeded();}}

    private static int getTagLength(int tag) {try{__CLR4_5_27op7oplx1dzaet.R.inc(9980);
        __CLR4_5_27op7oplx1dzaet.R.inc(9981);Integer length = TAG_LENGTH_MAP.get(tag);
        __CLR4_5_27op7oplx1dzaet.R.inc(9982);if ((((length == null)&&(__CLR4_5_27op7oplx1dzaet.R.iget(9983)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(9984)==0&false))) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9985);throw new IllegalArgumentException("Unknown tag: " + tag);
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(9986);return length;
    }finally{__CLR4_5_27op7oplx1dzaet.R.flushNeeded();}}

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_27op7oplx1dzaet.R.inc(9987);
        __CLR4_5_27op7oplx1dzaet.R.inc(9988);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_27op7oplx1dzaet.R.inc(9989);reply.writeByte(0x02);
        __CLR4_5_27op7oplx1dzaet.R.inc(9990);reply.writeShort((short) checksum);
        __CLR4_5_27op7oplx1dzaet.R.inc(9991);if ((((channel != null)&&(__CLR4_5_27op7oplx1dzaet.R.iget(9992)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(9993)==0&false))) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(9994);channel.write(reply);
        }
    }}finally{__CLR4_5_27op7oplx1dzaet.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27op7oplx1dzaet.R.inc(9995);

        __CLR4_5_27op7oplx1dzaet.R.inc(9996);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27op7oplx1dzaet.R.inc(9997);buf.readUnsignedByte(); // header
        __CLR4_5_27op7oplx1dzaet.R.inc(9998);int length = (buf.readUnsignedShort() & 0x7fff) + 3;

        __CLR4_5_27op7oplx1dzaet.R.inc(9999);List<Position> positions = new LinkedList<>();
        __CLR4_5_27op7oplx1dzaet.R.inc(10000);Set<Integer> tags = new HashSet<>();
        __CLR4_5_27op7oplx1dzaet.R.inc(10001);boolean hasLocation = false;

        __CLR4_5_27op7oplx1dzaet.R.inc(10002);Position position = new Position();

        __CLR4_5_27op7oplx1dzaet.R.inc(10003);while ((((buf.readerIndex() < length)&&(__CLR4_5_27op7oplx1dzaet.R.iget(10004)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10005)==0&false))) {{

            // Check if new message started
            __CLR4_5_27op7oplx1dzaet.R.inc(10006);int tag = buf.readUnsignedByte();
            __CLR4_5_27op7oplx1dzaet.R.inc(10007);if ((((tags.contains(tag))&&(__CLR4_5_27op7oplx1dzaet.R.iget(10008)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10009)==0&false))) {{
                __CLR4_5_27op7oplx1dzaet.R.inc(10010);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_27op7oplx1dzaet.R.iget(10011)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10012)==0&false))) {{
                    __CLR4_5_27op7oplx1dzaet.R.inc(10013);positions.add(position);
                }
                }__CLR4_5_27op7oplx1dzaet.R.inc(10014);tags.clear();
                __CLR4_5_27op7oplx1dzaet.R.inc(10015);hasLocation = false;
                __CLR4_5_27op7oplx1dzaet.R.inc(10016);position = new Position();
            }
            }__CLR4_5_27op7oplx1dzaet.R.inc(10017);tags.add(tag);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_27op7oplx1dzaet.R.inc(10018);switch (tag) {

                case TAG_IMEI:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10019);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10020);getDeviceSession(channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_27op7oplx1dzaet.R.inc(10021);break;

                case TAG_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10022);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10023);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_27op7oplx1dzaet.R.inc(10024);break;

                case TAG_COORDINATES:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10025);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10026);hasLocation = true;
                    __CLR4_5_27op7oplx1dzaet.R.inc(10027);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10028);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10029);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10030);break;

                case TAG_SPEED_COURSE:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10031);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10032);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10033);position.setCourse(buf.readUnsignedShort() * 0.1);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10034);break;

                case TAG_ALTITUDE:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10035);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10036);position.setAltitude(buf.readShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10037);break;

                case TAG_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10038);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10039);position.set(Position.KEY_STATUS, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10040);break;

                case TAG_POWER:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10041);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10042);position.set(Position.KEY_POWER, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10043);break;

                case TAG_BATTERY:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10044);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10045);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10046);break;

                case TAG_ODOMETER:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10047);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10048);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10049);break;

                case TAG_CAN:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10050);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10051);position.set(Position.KEY_FUEL, buf.readUnsignedByte() * 0.4);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10052);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10053);position.set(Position.KEY_RPM, buf.readUnsignedShort() * 0.125);
                    __CLR4_5_27op7oplx1dzaet.R.inc(10054);break;

                case TAG_ADC0:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10055);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10056);position.set(Position.PREFIX_ADC + 0, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10057);break;

                case TAG_ADC1:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10058);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10059);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10060);break;

                case TAG_ADC2:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10061);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10062);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10063);break;

                case TAG_ADC3:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10064);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10065);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10066);break;

                case TAG_ARRAY:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10067);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10068);buf.skipBytes(buf.readUnsignedByte());
                    __CLR4_5_27op7oplx1dzaet.R.inc(10069);break;

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_27op7oplx1dzaet.R.inc(10070);__CLB4_5_2_bool0=true;}
                    __CLR4_5_27op7oplx1dzaet.R.inc(10071);buf.skipBytes(getTagLength(tag));
                    __CLR4_5_27op7oplx1dzaet.R.inc(10072);break;

            }
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(10073);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_27op7oplx1dzaet.R.iget(10074)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10075)==0&false))) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(10076);positions.add(position);
        }

        }__CLR4_5_27op7oplx1dzaet.R.inc(10077);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_27op7oplx1dzaet.R.inc(10078);if ((((deviceSession == null)&&(__CLR4_5_27op7oplx1dzaet.R.iget(10079)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10080)==0&false))) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(10081);return null;
        }

        }__CLR4_5_27op7oplx1dzaet.R.inc(10082);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_27op7oplx1dzaet.R.inc(10083);for (Position p : positions) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(10084);p.setProtocol(getProtocolName());
            __CLR4_5_27op7oplx1dzaet.R.inc(10085);p.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_27op7oplx1dzaet.R.inc(10086);if ((((positions.isEmpty())&&(__CLR4_5_27op7oplx1dzaet.R.iget(10087)!=0|true))||(__CLR4_5_27op7oplx1dzaet.R.iget(10088)==0&false))) {{
            __CLR4_5_27op7oplx1dzaet.R.inc(10089);return null;
        }
        }__CLR4_5_27op7oplx1dzaet.R.inc(10090);return positions;
    }finally{__CLR4_5_27op7oplx1dzaet.R.flushNeeded();}}

}
