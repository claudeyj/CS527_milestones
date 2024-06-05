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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class AutoFonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_261h61hlx1e0g4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,7959,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AutoFonProtocolDecoder(AutoFonProtocol protocol) {
        super(protocol);__CLR4_5_261h61hlx1e0g4f.R.inc(7830);try{__CLR4_5_261h61hlx1e0g4f.R.inc(7829);
    }finally{__CLR4_5_261h61hlx1e0g4f.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x10;
    public static final int MSG_LOCATION = 0x11;
    public static final int MSG_HISTORY = 0x12;

    public static final int MSG_45_LOGIN = 0x41;
    public static final int MSG_45_LOCATION = 0x02;

    private static double convertCoordinate(int raw) {try{__CLR4_5_261h61hlx1e0g4f.R.inc(7831);
        __CLR4_5_261h61hlx1e0g4f.R.inc(7832);int degrees = raw / 1000000;
        __CLR4_5_261h61hlx1e0g4f.R.inc(7833);double minutes = (raw % 1000000) / 10000.0;
        __CLR4_5_261h61hlx1e0g4f.R.inc(7834);return degrees + minutes / 60;
    }finally{__CLR4_5_261h61hlx1e0g4f.R.flushNeeded();}}

    private static double convertCoordinate(short degrees, int minutes) {try{__CLR4_5_261h61hlx1e0g4f.R.inc(7835);
        __CLR4_5_261h61hlx1e0g4f.R.inc(7836);double value = degrees + BitUtil.from(minutes, 4) / 600000.0;
        __CLR4_5_261h61hlx1e0g4f.R.inc(7837);if ((((BitUtil.check(minutes, 0))&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7838)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7839)==0&false))) {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7840);return value;
        } }else {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7841);return -value;
        }
    }}finally{__CLR4_5_261h61hlx1e0g4f.R.flushNeeded();}}

    private Position decodePosition(DeviceSession deviceSession, ChannelBuffer buf, boolean history) {try{__CLR4_5_261h61hlx1e0g4f.R.inc(7842);

        __CLR4_5_261h61hlx1e0g4f.R.inc(7843);Position position = new Position();
        __CLR4_5_261h61hlx1e0g4f.R.inc(7844);position.setProtocol(getProtocolName());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7845);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_261h61hlx1e0g4f.R.inc(7846);if ((((!history)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7847)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7848)==0&false))) {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7849);buf.readUnsignedByte(); // interval
            __CLR4_5_261h61hlx1e0g4f.R.inc(7850);buf.skipBytes(8); // settings
        }
        }__CLR4_5_261h61hlx1e0g4f.R.inc(7851);buf.readUnsignedByte(); // status
        __CLR4_5_261h61hlx1e0g4f.R.inc(7852);if ((((!history)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7853)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7854)==0&false))) {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7855);buf.readUnsignedShort();
        }
        }__CLR4_5_261h61hlx1e0g4f.R.inc(7856);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7857);buf.skipBytes(6); // time

        __CLR4_5_261h61hlx1e0g4f.R.inc(7858);if ((((!history)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7859)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7860)==0&false))) {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7861);for (int i = 0; (((i < 2)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7862)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7863)==0&false)); i++) {{
                __CLR4_5_261h61hlx1e0g4f.R.inc(7864);buf.skipBytes(5); // time
                __CLR4_5_261h61hlx1e0g4f.R.inc(7865);buf.readUnsignedShort(); // interval
                __CLR4_5_261h61hlx1e0g4f.R.inc(7866);buf.skipBytes(5); // mode
            }
        }}

        }__CLR4_5_261h61hlx1e0g4f.R.inc(7867);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7868);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7869);buf.readUnsignedShort(); // mcc
        __CLR4_5_261h61hlx1e0g4f.R.inc(7870);buf.readUnsignedShort(); // mnc
        __CLR4_5_261h61hlx1e0g4f.R.inc(7871);buf.readUnsignedShort(); // lac
        __CLR4_5_261h61hlx1e0g4f.R.inc(7872);buf.readUnsignedShort(); // cid

        __CLR4_5_261h61hlx1e0g4f.R.inc(7873);int valid = buf.readUnsignedByte();
        __CLR4_5_261h61hlx1e0g4f.R.inc(7874);position.setValid((valid & 0xc0) != 0);
        __CLR4_5_261h61hlx1e0g4f.R.inc(7875);position.set(Position.KEY_SATELLITES, valid & 0x3f);

        __CLR4_5_261h61hlx1e0g4f.R.inc(7876);DateBuilder dateBuilder = new DateBuilder()
                .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7877);position.setTime(dateBuilder.getDate());

        __CLR4_5_261h61hlx1e0g4f.R.inc(7878);position.setLatitude(convertCoordinate(buf.readInt()));
        __CLR4_5_261h61hlx1e0g4f.R.inc(7879);position.setLongitude(convertCoordinate(buf.readInt()));
        __CLR4_5_261h61hlx1e0g4f.R.inc(7880);position.setAltitude(buf.readShort());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7881);position.setSpeed(buf.readUnsignedByte());
        __CLR4_5_261h61hlx1e0g4f.R.inc(7882);position.setCourse(buf.readUnsignedByte() * 2.0);

        __CLR4_5_261h61hlx1e0g4f.R.inc(7883);position.set(Position.KEY_HDOP, buf.readUnsignedShort());

        __CLR4_5_261h61hlx1e0g4f.R.inc(7884);buf.readUnsignedShort(); // reserved
        __CLR4_5_261h61hlx1e0g4f.R.inc(7885);buf.readUnsignedByte(); // checksum
        __CLR4_5_261h61hlx1e0g4f.R.inc(7886);return position;
    }finally{__CLR4_5_261h61hlx1e0g4f.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_261h61hlx1e0g4f.R.inc(7887);

        __CLR4_5_261h61hlx1e0g4f.R.inc(7888);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_261h61hlx1e0g4f.R.inc(7889);int type = buf.readUnsignedByte();

        __CLR4_5_261h61hlx1e0g4f.R.inc(7890);if ((((type == MSG_LOGIN || type == MSG_45_LOGIN)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7891)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7892)==0&false))) {{

            __CLR4_5_261h61hlx1e0g4f.R.inc(7893);if ((((type == MSG_LOGIN)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7894)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7895)==0&false))) {{
                __CLR4_5_261h61hlx1e0g4f.R.inc(7896);buf.readUnsignedByte(); // hardware version
                __CLR4_5_261h61hlx1e0g4f.R.inc(7897);buf.readUnsignedByte(); // software version
            }

            }__CLR4_5_261h61hlx1e0g4f.R.inc(7898);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
            __CLR4_5_261h61hlx1e0g4f.R.inc(7899);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

            __CLR4_5_261h61hlx1e0g4f.R.inc(7900);if ((((deviceSession != null && channel != null)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7901)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7902)==0&false))) {{
                __CLR4_5_261h61hlx1e0g4f.R.inc(7903);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_261h61hlx1e0g4f.R.inc(7904);response.writeBytes("resp_crc=".getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_261h61hlx1e0g4f.R.inc(7905);response.writeByte(buf.getByte(buf.writerIndex() - 1));
                __CLR4_5_261h61hlx1e0g4f.R.inc(7906);channel.write(response);
            }

            }__CLR4_5_261h61hlx1e0g4f.R.inc(7907);return null;

        }

        }__CLR4_5_261h61hlx1e0g4f.R.inc(7908);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_261h61hlx1e0g4f.R.inc(7909);if ((((deviceSession == null)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7910)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7911)==0&false))) {{
            __CLR4_5_261h61hlx1e0g4f.R.inc(7912);return null;
        }

        }__CLR4_5_261h61hlx1e0g4f.R.inc(7913);if ((((type == MSG_LOCATION)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7914)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7915)==0&false))) {{

            __CLR4_5_261h61hlx1e0g4f.R.inc(7916);return decodePosition(deviceSession, buf, false);

        } }else {__CLR4_5_261h61hlx1e0g4f.R.inc(7917);if ((((type == MSG_HISTORY)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7918)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7919)==0&false))) {{

            __CLR4_5_261h61hlx1e0g4f.R.inc(7920);int count = buf.readUnsignedByte() & 0x0f;
            __CLR4_5_261h61hlx1e0g4f.R.inc(7921);buf.readUnsignedShort(); // total count
            __CLR4_5_261h61hlx1e0g4f.R.inc(7922);List<Position> positions = new LinkedList<>();

            __CLR4_5_261h61hlx1e0g4f.R.inc(7923);for (int i = 0; (((i < count)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7924)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7925)==0&false)); i++) {{
                __CLR4_5_261h61hlx1e0g4f.R.inc(7926);positions.add(decodePosition(deviceSession, buf, true));
            }

            }__CLR4_5_261h61hlx1e0g4f.R.inc(7927);return positions;

        } }else {__CLR4_5_261h61hlx1e0g4f.R.inc(7928);if ((((type == MSG_45_LOCATION)&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7929)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7930)==0&false))) {{

            __CLR4_5_261h61hlx1e0g4f.R.inc(7931);Position position = new Position();
            __CLR4_5_261h61hlx1e0g4f.R.inc(7932);position.setProtocol(getProtocolName());
            __CLR4_5_261h61hlx1e0g4f.R.inc(7933);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_261h61hlx1e0g4f.R.inc(7934);short status = buf.readUnsignedByte();
            __CLR4_5_261h61hlx1e0g4f.R.inc(7935);if ((((BitUtil.check(status, 7))&&(__CLR4_5_261h61hlx1e0g4f.R.iget(7936)!=0|true))||(__CLR4_5_261h61hlx1e0g4f.R.iget(7937)==0&false))) {{
                __CLR4_5_261h61hlx1e0g4f.R.inc(7938);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            }
            }__CLR4_5_261h61hlx1e0g4f.R.inc(7939);position.set(Position.KEY_BATTERY, BitUtil.to(status, 7));

            __CLR4_5_261h61hlx1e0g4f.R.inc(7940);buf.skipBytes(2); // remaining time

            __CLR4_5_261h61hlx1e0g4f.R.inc(7941);position.set(Position.PREFIX_TEMP + 1, buf.readByte());

            __CLR4_5_261h61hlx1e0g4f.R.inc(7942);buf.skipBytes(2); // timer (interval and units)
            __CLR4_5_261h61hlx1e0g4f.R.inc(7943);buf.readByte(); // mode
            __CLR4_5_261h61hlx1e0g4f.R.inc(7944);buf.readByte(); // gprs sending interval

            __CLR4_5_261h61hlx1e0g4f.R.inc(7945);buf.skipBytes(6); // mcc, mnc, lac, cid

            __CLR4_5_261h61hlx1e0g4f.R.inc(7946);int valid = buf.readUnsignedByte();
            __CLR4_5_261h61hlx1e0g4f.R.inc(7947);position.setValid(BitUtil.from(valid, 6) != 0);
            __CLR4_5_261h61hlx1e0g4f.R.inc(7948);position.set(Position.KEY_SATELLITES, BitUtil.from(valid, 6));

            __CLR4_5_261h61hlx1e0g4f.R.inc(7949);int time = buf.readUnsignedMedium();
            __CLR4_5_261h61hlx1e0g4f.R.inc(7950);int date = buf.readUnsignedMedium();

            __CLR4_5_261h61hlx1e0g4f.R.inc(7951);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(time / 10000, time / 100 % 100, time % 100)
                    .setDateReverse(date / 10000, date / 100 % 100, date % 100);
            __CLR4_5_261h61hlx1e0g4f.R.inc(7952);position.setTime(dateBuilder.getDate());

            __CLR4_5_261h61hlx1e0g4f.R.inc(7953);position.setLatitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedMedium()));
            __CLR4_5_261h61hlx1e0g4f.R.inc(7954);position.setLongitude(convertCoordinate(buf.readUnsignedByte(), buf.readUnsignedMedium()));
            __CLR4_5_261h61hlx1e0g4f.R.inc(7955);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_261h61hlx1e0g4f.R.inc(7956);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_261h61hlx1e0g4f.R.inc(7957);return position;

        }

        }}}__CLR4_5_261h61hlx1e0g4f.R.inc(7958);return null;
    }finally{__CLR4_5_261h61hlx1e0g4f.R.flushNeeded();}}

}
