/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import javax.xml.bind.DatatypeConverter;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class RuptelaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2emeemelwye7gre{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,19078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RuptelaProtocolDecoder(RuptelaProtocol protocol) {
        super(protocol);__CLR4_5_2emeemelwye7gre.R.inc(18951);try{__CLR4_5_2emeemelwye7gre.R.inc(18950);
    }finally{__CLR4_5_2emeemelwye7gre.R.flushNeeded();}}

    public static final int MSG_RECORDS = 1;
    public static final int MSG_DEVICE_CONFIGURATION = 2;
    public static final int MSG_DEVICE_VERSION = 3;
    public static final int MSG_FIRMWARE_UPDATE = 4;
    public static final int MSG_SET_CONNECTION = 5;
    public static final int MSG_SET_ODOMETER = 6;
    public static final int MSG_SMS_VIA_GPRS_RESPONSE = 7;
    public static final int MSG_SMS_VIA_GPRS = 8;
    public static final int MSG_DTCS = 9;
    public static final int MSG_SET_IO = 17;
    public static final int MSG_EXTENDED_RECORDS = 68;

    private Position decodeCommandResponse(DeviceSession deviceSession, int type, ChannelBuffer buf) {try{__CLR4_5_2emeemelwye7gre.R.inc(18952);
        __CLR4_5_2emeemelwye7gre.R.inc(18953);Position position = new Position();
        __CLR4_5_2emeemelwye7gre.R.inc(18954);position.setProtocol(getProtocolName());
        __CLR4_5_2emeemelwye7gre.R.inc(18955);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2emeemelwye7gre.R.inc(18956);getLastLocation(position, null);

        __CLR4_5_2emeemelwye7gre.R.inc(18957);position.set(Position.KEY_TYPE, type);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2emeemelwye7gre.R.inc(18958);switch (type) {
            case MSG_DEVICE_CONFIGURATION:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18959);__CLB4_5_2_bool0=true;}
            case MSG_DEVICE_VERSION:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18960);__CLB4_5_2_bool0=true;}
            case MSG_FIRMWARE_UPDATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18961);__CLB4_5_2_bool0=true;}
            case MSG_SMS_VIA_GPRS_RESPONSE:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18962);__CLB4_5_2_bool0=true;}
                __CLR4_5_2emeemelwye7gre.R.inc(18963);position.set(Position.KEY_RESULT,
                        buf.toString(buf.readerIndex(), buf.readableBytes() - 2, StandardCharsets.US_ASCII).trim());
                __CLR4_5_2emeemelwye7gre.R.inc(18964);return position;
            case MSG_SET_IO:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18965);__CLB4_5_2_bool0=true;}
                __CLR4_5_2emeemelwye7gre.R.inc(18966);position.set(Position.KEY_RESULT,
                        String.valueOf(buf.readUnsignedByte()));
                __CLR4_5_2emeemelwye7gre.R.inc(18967);return position;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2emeemelwye7gre.R.inc(18968);__CLB4_5_2_bool0=true;}
                __CLR4_5_2emeemelwye7gre.R.inc(18969);return null;
        }
    }finally{__CLR4_5_2emeemelwye7gre.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2emeemelwye7gre.R.inc(18970);

        __CLR4_5_2emeemelwye7gre.R.inc(18971);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2emeemelwye7gre.R.inc(18972);buf.readUnsignedShort(); // data length

        __CLR4_5_2emeemelwye7gre.R.inc(18973);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_2emeemelwye7gre.R.inc(18974);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2emeemelwye7gre.R.inc(18975);if ((((deviceSession == null)&&(__CLR4_5_2emeemelwye7gre.R.iget(18976)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(18977)==0&false))) {{
            __CLR4_5_2emeemelwye7gre.R.inc(18978);return null;
        }

        }__CLR4_5_2emeemelwye7gre.R.inc(18979);int type = buf.readUnsignedByte();

        __CLR4_5_2emeemelwye7gre.R.inc(18980);if ((((type == MSG_RECORDS || type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2emeemelwye7gre.R.iget(18981)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(18982)==0&false))) {{

            __CLR4_5_2emeemelwye7gre.R.inc(18983);List<Position> positions = new LinkedList<>();

            __CLR4_5_2emeemelwye7gre.R.inc(18984);buf.readUnsignedByte(); // records left
            __CLR4_5_2emeemelwye7gre.R.inc(18985);int count = buf.readUnsignedByte();

            __CLR4_5_2emeemelwye7gre.R.inc(18986);for (int i = 0; (((i < count)&&(__CLR4_5_2emeemelwye7gre.R.iget(18987)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(18988)==0&false)); i++) {{
                __CLR4_5_2emeemelwye7gre.R.inc(18989);Position position = new Position();
                __CLR4_5_2emeemelwye7gre.R.inc(18990);position.setProtocol(getProtocolName());
                __CLR4_5_2emeemelwye7gre.R.inc(18991);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2emeemelwye7gre.R.inc(18992);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_2emeemelwye7gre.R.inc(18993);buf.readUnsignedByte(); // timestamp extension

                __CLR4_5_2emeemelwye7gre.R.inc(18994);if ((((type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2emeemelwye7gre.R.iget(18995)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(18996)==0&false))) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(18997);buf.readUnsignedByte(); // record extension
                }

                }__CLR4_5_2emeemelwye7gre.R.inc(18998);buf.readUnsignedByte(); // priority (reserved)

                __CLR4_5_2emeemelwye7gre.R.inc(18999);position.setValid(true);
                __CLR4_5_2emeemelwye7gre.R.inc(19000);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2emeemelwye7gre.R.inc(19001);position.setLatitude(buf.readInt() / 10000000.0);
                __CLR4_5_2emeemelwye7gre.R.inc(19002);position.setAltitude(buf.readUnsignedShort() / 10.0);
                __CLR4_5_2emeemelwye7gre.R.inc(19003);position.setCourse(buf.readUnsignedShort() / 100.0);

                __CLR4_5_2emeemelwye7gre.R.inc(19004);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2emeemelwye7gre.R.inc(19005);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

                __CLR4_5_2emeemelwye7gre.R.inc(19006);position.set(Position.KEY_HDOP, buf.readUnsignedByte() / 10.0);

                __CLR4_5_2emeemelwye7gre.R.inc(19007);if ((((type == MSG_EXTENDED_RECORDS)&&(__CLR4_5_2emeemelwye7gre.R.iget(19008)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19009)==0&false))) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19010);position.set(Position.KEY_EVENT, buf.readUnsignedShort());
                } }else {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19011);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
                }

                // Read 1 byte data
                }__CLR4_5_2emeemelwye7gre.R.inc(19012);int cnt = buf.readUnsignedByte();
                __CLR4_5_2emeemelwye7gre.R.inc(19013);for (int j = 0; (((j < cnt)&&(__CLR4_5_2emeemelwye7gre.R.iget(19014)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19015)==0&false)); j++) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19016);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2emeemelwye7gre.R.iget(19017)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19018)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2emeemelwye7gre.R.inc(19019);position.set(Position.PREFIX_IO + id, buf.readUnsignedByte());
                }

                // Read 2 byte data
                }__CLR4_5_2emeemelwye7gre.R.inc(19020);cnt = buf.readUnsignedByte();
                __CLR4_5_2emeemelwye7gre.R.inc(19021);for (int j = 0; (((j < cnt)&&(__CLR4_5_2emeemelwye7gre.R.iget(19022)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19023)==0&false)); j++) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19024);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2emeemelwye7gre.R.iget(19025)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19026)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2emeemelwye7gre.R.inc(19027);position.set(Position.PREFIX_IO + id, buf.readUnsignedShort());
                }

                // Read 4 byte data
                }__CLR4_5_2emeemelwye7gre.R.inc(19028);cnt = buf.readUnsignedByte();
                __CLR4_5_2emeemelwye7gre.R.inc(19029);for (int j = 0; (((j < cnt)&&(__CLR4_5_2emeemelwye7gre.R.iget(19030)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19031)==0&false)); j++) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19032);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2emeemelwye7gre.R.iget(19033)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19034)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2emeemelwye7gre.R.inc(19035);position.set(Position.PREFIX_IO + id, buf.readUnsignedInt());
                }

                // Read 8 byte data
                }__CLR4_5_2emeemelwye7gre.R.inc(19036);cnt = buf.readUnsignedByte();
                __CLR4_5_2emeemelwye7gre.R.inc(19037);for (int j = 0; (((j < cnt)&&(__CLR4_5_2emeemelwye7gre.R.iget(19038)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19039)==0&false)); j++) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19040);int id = (((type == MSG_EXTENDED_RECORDS )&&(__CLR4_5_2emeemelwye7gre.R.iget(19041)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19042)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();
                    __CLR4_5_2emeemelwye7gre.R.inc(19043);position.set(Position.PREFIX_IO + id, buf.readLong());
                }

                }__CLR4_5_2emeemelwye7gre.R.inc(19044);positions.add(position);
            }

            }__CLR4_5_2emeemelwye7gre.R.inc(19045);if ((((channel != null)&&(__CLR4_5_2emeemelwye7gre.R.iget(19046)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19047)==0&false))) {{
                __CLR4_5_2emeemelwye7gre.R.inc(19048);channel.write(ChannelBuffers.wrappedBuffer(DatatypeConverter.parseHexBinary("0002640113bc")));
            }

            }__CLR4_5_2emeemelwye7gre.R.inc(19049);return positions;

        } }else {__CLR4_5_2emeemelwye7gre.R.inc(19050);if ((((type == MSG_DTCS)&&(__CLR4_5_2emeemelwye7gre.R.iget(19051)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19052)==0&false))) {{

            __CLR4_5_2emeemelwye7gre.R.inc(19053);List<Position> positions = new LinkedList<>();

            __CLR4_5_2emeemelwye7gre.R.inc(19054);int count = buf.readUnsignedByte();

            __CLR4_5_2emeemelwye7gre.R.inc(19055);for (int i = 0; (((i < count)&&(__CLR4_5_2emeemelwye7gre.R.iget(19056)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19057)==0&false)); i++) {{
                __CLR4_5_2emeemelwye7gre.R.inc(19058);Position position = new Position();
                __CLR4_5_2emeemelwye7gre.R.inc(19059);position.setProtocol(getProtocolName());
                __CLR4_5_2emeemelwye7gre.R.inc(19060);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2emeemelwye7gre.R.inc(19061);buf.readUnsignedByte(); // reserved

                __CLR4_5_2emeemelwye7gre.R.inc(19062);position.setTime(new Date(buf.readUnsignedInt() * 1000));

                __CLR4_5_2emeemelwye7gre.R.inc(19063);position.setValid(true);
                __CLR4_5_2emeemelwye7gre.R.inc(19064);position.setLongitude(buf.readInt() / 10000000.0);
                __CLR4_5_2emeemelwye7gre.R.inc(19065);position.setLatitude(buf.readInt() / 10000000.0);

                __CLR4_5_2emeemelwye7gre.R.inc(19066);if ((((buf.readUnsignedByte() == 2)&&(__CLR4_5_2emeemelwye7gre.R.iget(19067)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19068)==0&false))) {{
                    __CLR4_5_2emeemelwye7gre.R.inc(19069);position.set(Position.KEY_ARCHIVE, true);
                }

                }__CLR4_5_2emeemelwye7gre.R.inc(19070);position.set(Position.KEY_DTCS, buf.readBytes(5).toString(StandardCharsets.US_ASCII));

                __CLR4_5_2emeemelwye7gre.R.inc(19071);positions.add(position);
            }

            }__CLR4_5_2emeemelwye7gre.R.inc(19072);if ((((channel != null)&&(__CLR4_5_2emeemelwye7gre.R.iget(19073)!=0|true))||(__CLR4_5_2emeemelwye7gre.R.iget(19074)==0&false))) {{
                __CLR4_5_2emeemelwye7gre.R.inc(19075);channel.write(ChannelBuffers.wrappedBuffer(DatatypeConverter.parseHexBinary("00026d01c4a4")));
            }

            }__CLR4_5_2emeemelwye7gre.R.inc(19076);return positions;

        } }else {{

            __CLR4_5_2emeemelwye7gre.R.inc(19077);return decodeCommandResponse(deviceSession, type, buf);

        }
    }}}finally{__CLR4_5_2emeemelwye7gre.R.flushNeeded();}}

}
