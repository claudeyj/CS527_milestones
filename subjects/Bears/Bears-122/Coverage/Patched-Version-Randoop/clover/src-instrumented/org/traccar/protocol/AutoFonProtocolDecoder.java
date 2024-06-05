/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2015 Vitaly Litvak (vitavaque@gmail.com)
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
import org.traccar.helper.DateBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class AutoFonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26ut6utlwye63gt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,9013,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AutoFonProtocolDecoder(AutoFonProtocol protocol) {
        super(protocol);__CLR4_5_26ut6utlwye63gt.R.inc(8886);try{__CLR4_5_26ut6utlwye63gt.R.inc(8885);
    }finally{__CLR4_5_26ut6utlwye63gt.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x10;
    public static final int MSG_LOCATION = 0x11;
    public static final int MSG_HISTORY = 0x12;

    public static final int MSG_45_LOGIN = 0x41;
    public static final int MSG_45_LOCATION = 0x02;

    private static double convertCoordinate(int raw) {try{__CLR4_5_26ut6utlwye63gt.R.inc(8887);
        __CLR4_5_26ut6utlwye63gt.R.inc(8888);int degrees = raw / 1000000;
        __CLR4_5_26ut6utlwye63gt.R.inc(8889);double minutes = (raw % 1000000) / 10000.0;
        __CLR4_5_26ut6utlwye63gt.R.inc(8890);return degrees + minutes / 60;
    }finally{__CLR4_5_26ut6utlwye63gt.R.flushNeeded();}}

    private static double convertCoordinate(short degrees, int minutes) {try{__CLR4_5_26ut6utlwye63gt.R.inc(8891);
        __CLR4_5_26ut6utlwye63gt.R.inc(8892);double value = degrees + BitUtil.from(minutes, 4) / 600000.0;
        __CLR4_5_26ut6utlwye63gt.R.inc(8893);if ((((BitUtil.check(minutes, 0))&&(__CLR4_5_26ut6utlwye63gt.R.iget(8894)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8895)==0&false))) {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8896);return value;
        } }else {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8897);return -value;
        }
    }}finally{__CLR4_5_26ut6utlwye63gt.R.flushNeeded();}}

    private Position decodePosition(DeviceSession deviceSession, ChannelBuffer buf, boolean history) {try{__CLR4_5_26ut6utlwye63gt.R.inc(8898);

        __CLR4_5_26ut6utlwye63gt.R.inc(8899);Position position = new Position();
        __CLR4_5_26ut6utlwye63gt.R.inc(8900);position.setProtocol(getProtocolName());
        __CLR4_5_26ut6utlwye63gt.R.inc(8901);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_26ut6utlwye63gt.R.inc(8902);if ((((!history)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8903)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8904)==0&false))) {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8905);buf.readUnsignedByte(); // interval
            __CLR4_5_26ut6utlwye63gt.R.inc(8906);buf.skipBytes(8); // settings
        }
        }__CLR4_5_26ut6utlwye63gt.R.inc(8907);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
        __CLR4_5_26ut6utlwye63gt.R.inc(8908);if ((((!history)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8909)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8910)==0&false))) {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8911);buf.readUnsignedShort();
        }
        }__CLR4_5_26ut6utlwye63gt.R.inc(8912);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
        __CLR4_5_26ut6utlwye63gt.R.inc(8913);buf.skipBytes(6); // time

        __CLR4_5_26ut6utlwye63gt.R.inc(8914);if ((((!history)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8915)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8916)==0&false))) {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8917);for (int i = 0; (((i < 2)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8918)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8919)==0&false)); i++) {{
                __CLR4_5_26ut6utlwye63gt.R.inc(8920);buf.skipBytes(5); // time
                __CLR4_5_26ut6utlwye63gt.R.inc(8921);buf.readUnsignedShort(); // interval
                __CLR4_5_26ut6utlwye63gt.R.inc(8922);buf.skipBytes(5); // mode
            }
        }}

        }__CLR4_5_26ut6utlwye63gt.R.inc(8923);position.set(Position.PREFIX_TEMP + 1, buf.readByte());

        __CLR4_5_26ut6utlwye63gt.R.inc(8924);int rssi = buf.readUnsignedByte();
        __CLR4_5_26ut6utlwye63gt.R.inc(8925);CellTower cellTower = CellTower.from(
                buf.readUnsignedShort(), buf.readUnsignedShort(),
                buf.readUnsignedShort(), buf.readUnsignedShort(), rssi);
        __CLR4_5_26ut6utlwye63gt.R.inc(8926);position.setNetwork(new Network(cellTower));

        __CLR4_5_26ut6utlwye63gt.R.inc(8927);int valid = buf.readUnsignedByte();
        __CLR4_5_26ut6utlwye63gt.R.inc(8928);position.setValid((valid & 0xc0) != 0);
        __CLR4_5_26ut6utlwye63gt.R.inc(8929);position.set(Position.KEY_SATELLITES, valid & 0x3f);

        __CLR4_5_26ut6utlwye63gt.R.inc(8930);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_26ut6utlwye63gt.R.inc(8931);position.setTime(dateBuilder.getDate());

        __CLR4_5_26ut6utlwye63gt.R.inc(8932);position.setLatitude(convertCoordinate(buf.readInt()));
        __CLR4_5_26ut6utlwye63gt.R.inc(8933);position.setLongitude(convertCoordinate(buf.readInt()));
        __CLR4_5_26ut6utlwye63gt.R.inc(8934);position.setAltitude(buf.readShort());
        __CLR4_5_26ut6utlwye63gt.R.inc(8935);position.setSpeed(buf.readUnsignedByte());
        __CLR4_5_26ut6utlwye63gt.R.inc(8936);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_26ut6utlwye63gt.R.inc(8937);position.set(Position.KEY_HDOP, buf.readUnsignedShort());

        __CLR4_5_26ut6utlwye63gt.R.inc(8938);buf.readUnsignedShort(); // reserved
        __CLR4_5_26ut6utlwye63gt.R.inc(8939);buf.readUnsignedByte(); // checksum
        __CLR4_5_26ut6utlwye63gt.R.inc(8940);return position;
    }finally{__CLR4_5_26ut6utlwye63gt.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26ut6utlwye63gt.R.inc(8941);

        __CLR4_5_26ut6utlwye63gt.R.inc(8942);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26ut6utlwye63gt.R.inc(8943);int type = buf.readUnsignedByte();

        __CLR4_5_26ut6utlwye63gt.R.inc(8944);if ((((type == MSG_LOGIN || type == MSG_45_LOGIN)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8945)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8946)==0&false))) {{

            __CLR4_5_26ut6utlwye63gt.R.inc(8947);if ((((type == MSG_LOGIN)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8948)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8949)==0&false))) {{
                __CLR4_5_26ut6utlwye63gt.R.inc(8950);buf.readUnsignedByte(); // hardware version
                __CLR4_5_26ut6utlwye63gt.R.inc(8951);buf.readUnsignedByte(); // software version
            }

            }__CLR4_5_26ut6utlwye63gt.R.inc(8952);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
            __CLR4_5_26ut6utlwye63gt.R.inc(8953);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

            __CLR4_5_26ut6utlwye63gt.R.inc(8954);if ((((deviceSession != null && channel != null)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8955)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8956)==0&false))) {{
                __CLR4_5_26ut6utlwye63gt.R.inc(8957);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_26ut6utlwye63gt.R.inc(8958);response.writeBytes("resp_crc=".getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_26ut6utlwye63gt.R.inc(8959);response.writeByte(buf.getByte(buf.writerIndex() - 1));
                __CLR4_5_26ut6utlwye63gt.R.inc(8960);channel.write(response);
            }

            }__CLR4_5_26ut6utlwye63gt.R.inc(8961);return null;

        }

        }__CLR4_5_26ut6utlwye63gt.R.inc(8962);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_26ut6utlwye63gt.R.inc(8963);if ((((deviceSession == null)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8964)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8965)==0&false))) {{
            __CLR4_5_26ut6utlwye63gt.R.inc(8966);return null;
        }

        }__CLR4_5_26ut6utlwye63gt.R.inc(8967);if ((((type == MSG_LOCATION)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8968)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8969)==0&false))) {{

            __CLR4_5_26ut6utlwye63gt.R.inc(8970);return decodePosition(deviceSession, buf, false);

        } }else {__CLR4_5_26ut6utlwye63gt.R.inc(8971);if ((((type == MSG_HISTORY)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8972)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8973)==0&false))) {{

            __CLR4_5_26ut6utlwye63gt.R.inc(8974);int count = buf.readUnsignedByte() & 0x0f;
            __CLR4_5_26ut6utlwye63gt.R.inc(8975);buf.readUnsignedShort(); // total count
            __CLR4_5_26ut6utlwye63gt.R.inc(8976);List<Position> positions = new LinkedList<>();

            __CLR4_5_26ut6utlwye63gt.R.inc(8977);for (int i = 0; (((i < count)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8978)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8979)==0&false)); i++) {{
                __CLR4_5_26ut6utlwye63gt.R.inc(8980);positions.add(decodePosition(deviceSession, buf, true));
            }

            }__CLR4_5_26ut6utlwye63gt.R.inc(8981);return positions;

        } }else {__CLR4_5_26ut6utlwye63gt.R.inc(8982);if ((((type == MSG_45_LOCATION)&&(__CLR4_5_26ut6utlwye63gt.R.iget(8983)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8984)==0&false))) {{

            __CLR4_5_26ut6utlwye63gt.R.inc(8985);Position position = new Position();
            __CLR4_5_26ut6utlwye63gt.R.inc(8986);position.setProtocol(getProtocolName());
            __CLR4_5_26ut6utlwye63gt.R.inc(8987);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_26ut6utlwye63gt.R.inc(8988);short status = buf.readUnsignedByte();
            __CLR4_5_26ut6utlwye63gt.R.inc(8989);if ((((BitUtil.check(status, 7))&&(__CLR4_5_26ut6utlwye63gt.R.iget(8990)!=0|true))||(__CLR4_5_26ut6utlwye63gt.R.iget(8991)==0&false))) {{
                __CLR4_5_26ut6utlwye63gt.R.inc(8992);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_26ut6utlwye63gt.R.inc(8993);position.set(Position.KEY_BATTERY, BitUtil.to(status, 7));

            __CLR4_5_26ut6utlwye63gt.R.inc(8994);buf.skipBytes(2); // remaining time

            __CLR4_5_26ut6utlwye63gt.R.inc(8995);position.set(Position.PREFIX_TEMP + 1, buf.readByte());

            __CLR4_5_26ut6utlwye63gt.R.inc(8996);buf.skipBytes(2); // timer (interval and units)
            __CLR4_5_26ut6utlwye63gt.R.inc(8997);buf.readByte(); // mode
            __CLR4_5_26ut6utlwye63gt.R.inc(8998);buf.readByte(); // gprs sending interval

            __CLR4_5_26ut6utlwye63gt.R.inc(8999);buf.skipBytes(6); // mcc, mnc, lac, cid

            __CLR4_5_26ut6utlwye63gt.R.inc(9000);int valid = buf.readUnsignedByte();
            __CLR4_5_26ut6utlwye63gt.R.inc(9001);position.setValid(BitUtil.from(valid, 6) != 0);
            __CLR4_5_26ut6utlwye63gt.R.inc(9002);position.set(Position.KEY_SATELLITES, BitUtil.from(valid, 6));

            __CLR4_5_26ut6utlwye63gt.R.inc(9003);int time = buf.readUnsignedMedium();
            __CLR4_5_26ut6utlwye63gt.R.inc(9004);int date = buf.readUnsignedMedium();

            __CLR4_5_26ut6utlwye63gt.R.inc(9005);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(time / 10000, time / 100 % 100, time % 100)
                    .setDateReverse(date / 10000, date / 100 % 100, date % 100);
            __CLR4_5_26ut6utlwye63gt.R.inc(9006);position.setTime(dateBuilder.getDate());

            __CLR4_5_26ut6utlwye63gt.R.inc(9007);position.setLatitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedMedium()));
            __CLR4_5_26ut6utlwye63gt.R.inc(9008);position.setLongitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedMedium()));
            __CLR4_5_26ut6utlwye63gt.R.inc(9009);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_26ut6utlwye63gt.R.inc(9010);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_26ut6utlwye63gt.R.inc(9011);return position;

        }

        }}}__CLR4_5_26ut6utlwye63gt.R.inc(9012);return null;
    }finally{__CLR4_5_26ut6utlwye63gt.R.flushNeeded();}}

}
