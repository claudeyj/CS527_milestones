/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ProgressProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ch6ch6lx1dwkd4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,16279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ProgressProtocolDecoder(ProgressProtocol protocol) {
        super(protocol);__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16171);try{__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16170);
    }finally{__CLR4_5_2ch6ch6lx1dwkd4.R.flushNeeded();}}

    public static final int MSG_NULL = 0;
    public static final int MSG_IDENT = 1;
    public static final int MSG_IDENT_FULL = 2;
    public static final int MSG_POINT = 10;
    public static final int MSG_LOG_SYNC = 100;
    public static final int MSG_LOGMSG = 101;
    public static final int MSG_TEXT = 102;
    public static final int MSG_ALARM = 200;
    public static final int MSG_ALARM_RECIEVED = 201;

    private void requestArchive(Channel channel) {try{__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16172);
        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16173);if ((((lastIndex == 0)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16174)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16175)==0&false))) {{
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16176);lastIndex = newIndex;
        } }else {__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16177);if ((((newIndex > lastIndex)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16178)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16179)==0&false))) {{
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16180);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 12);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16181);request.writeShort(MSG_LOG_SYNC);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16182);request.writeShort(4);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16183);request.writeInt((int) lastIndex);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16184);request.writeInt(0);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16185);channel.write(request);
        }
    }}}finally{__CLR4_5_2ch6ch6lx1dwkd4.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16186);

        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16187);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16188);int type = buf.readUnsignedShort();
        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16189);buf.readUnsignedShort(); // length

        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16190);if ((((type == MSG_IDENT || type == MSG_IDENT_FULL)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16191)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16192)==0&false))) {{

            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16193);buf.readUnsignedInt(); // id
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16194);int length = buf.readUnsignedShort();
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16195);buf.skipBytes(length);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16196);length = buf.readUnsignedShort();
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16197);buf.skipBytes(length);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16198);length = buf.readUnsignedShort();
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16199);String imei = buf.readBytes(length).toString(StandardCharsets.US_ASCII);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16200);getDeviceSession(channel, remoteAddress, imei);

        } }else {__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16201);if ((((type == MSG_POINT || type == MSG_ALARM || type == MSG_LOGMSG)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16202)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16203)==0&false))) {{

            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16204);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16205);if ((((deviceSession == null)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16206)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16207)==0&false))) {{
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16208);return null;
            }

            }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16209);List<Position> positions = new LinkedList<>();

            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16210);int recordCount = 1;
            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16211);if ((((type == MSG_LOGMSG)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16212)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16213)==0&false))) {{
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16214);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16215);for (int j = 0; (((j < recordCount)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16216)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16217)==0&false)); j++) {{
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16218);Position position = new Position();
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16219);position.setProtocol(getProtocolName());
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16220);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16221);if ((((type == MSG_LOGMSG)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16222)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16223)==0&false))) {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16224);position.set(Position.KEY_ARCHIVE, true);
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16225);int subtype = buf.readUnsignedShort();
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16226);if ((((subtype == MSG_ALARM)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16227)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16228)==0&false))) {{
                        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16229);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16230);if ((((buf.readUnsignedShort() > buf.readableBytes())&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16231)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16232)==0&false))) {{
                        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16233);lastIndex += 1;
                        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16234);break; // workaround for device bug
                    }
                    }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16235);lastIndex = buf.readUnsignedInt();
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16236);position.set(Position.KEY_INDEX, lastIndex);
                } }else {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16237);newIndex = buf.readUnsignedInt();
                }

                }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16238);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16239);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16240);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16241);position.setSpeed(buf.readUnsignedInt() * 0.01);
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16242);position.setCourse(buf.readUnsignedShort() * 0.01);
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16243);position.setAltitude(buf.readUnsignedShort() * 0.01);

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16244);int satellites = buf.readUnsignedByte();
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16245);position.setValid(satellites >= 3);
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16246);position.set(Position.KEY_SATELLITES, satellites);

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16247);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16248);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16249);long extraFlags = buf.readLong();

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16250);if ((((BitUtil.check(extraFlags, 0))&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16251)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16252)==0&false))) {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16253);int count = buf.readUnsignedShort();
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16254);for (int i = 1; (((i <= count)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16255)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16256)==0&false)); i++) {{
                        __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16257);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                }}

                }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16258);if ((((BitUtil.check(extraFlags, 1))&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16259)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16260)==0&false))) {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16261);int size = buf.readUnsignedShort();
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16262);position.set("can", buf.toString(buf.readerIndex(), size, StandardCharsets.US_ASCII));
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16263);buf.skipBytes(size);
                }

                }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16264);if ((((BitUtil.check(extraFlags, 2))&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16265)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16266)==0&false))) {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16267);position.set("passenger",
                            ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedShort())));
                }

                }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16268);if ((((type == MSG_ALARM)&&(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16269)!=0|true))||(__CLR4_5_2ch6ch6lx1dwkd4.R.iget(16270)==0&false))) {{
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16271);position.set(Position.KEY_ALARM, true);
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16272);byte[] response = {(byte) 0xC9, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
                    __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16273);channel.write(ChannelBuffers.wrappedBuffer(response));
                }

                }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16274);buf.readUnsignedInt(); // crc

                __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16275);positions.add(position);
            }

            }__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16276);requestArchive(channel);

            __CLR4_5_2ch6ch6lx1dwkd4.R.inc(16277);return positions;
        }

        }}__CLR4_5_2ch6ch6lx1dwkd4.R.inc(16278);return null;
    }finally{__CLR4_5_2ch6ch6lx1dwkd4.R.flushNeeded();}}

}
