/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BceProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_269s69slx1e1jw0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,8234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BceProtocolDecoder(BceProtocol protocol) {
        super(protocol);__CLR4_5_269s69slx1e1jw0.R.inc(8129);try{__CLR4_5_269s69slx1e1jw0.R.inc(8128);
    }finally{__CLR4_5_269s69slx1e1jw0.R.flushNeeded();}}

    private static final int DATA_TYPE = 7;

    public static final int MSG_ASYNC_STACK = 0xA5;
    public static final int MSG_STACK_COFIRM = 0x19;
    public static final int MSG_TIME_TRIGGERED = 0xA0;
    public static final int MSG_OUTPUT_CONTROL = 0x41;
    public static final int MSG_OUTPUT_CONTROL_ACK = 0xC1;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_269s69slx1e1jw0.R.inc(8130);

        __CLR4_5_269s69slx1e1jw0.R.inc(8131);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_269s69slx1e1jw0.R.inc(8132);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_269s69slx1e1jw0.R.inc(8133);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_269s69slx1e1jw0.R.inc(8134);if ((((deviceSession == null)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8135)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8136)==0&false))) {{
            __CLR4_5_269s69slx1e1jw0.R.inc(8137);return null;
        }

        }__CLR4_5_269s69slx1e1jw0.R.inc(8138);List<Position> positions = new LinkedList<>();

        __CLR4_5_269s69slx1e1jw0.R.inc(8139);while ((((buf.readableBytes() > 1)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8140)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8141)==0&false))) {{

            __CLR4_5_269s69slx1e1jw0.R.inc(8142);int dataEnd = buf.readUnsignedShort() + buf.readerIndex();
            __CLR4_5_269s69slx1e1jw0.R.inc(8143);int type = buf.readUnsignedByte();
            __CLR4_5_269s69slx1e1jw0.R.inc(8144);int confirmKey = buf.readUnsignedByte() & 0x7F;

            __CLR4_5_269s69slx1e1jw0.R.inc(8145);while ((((buf.readerIndex() < dataEnd)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8146)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8147)==0&false))) {{

                __CLR4_5_269s69slx1e1jw0.R.inc(8148);Position position = new Position();
                __CLR4_5_269s69slx1e1jw0.R.inc(8149);position.setProtocol(getProtocolName());
                __CLR4_5_269s69slx1e1jw0.R.inc(8150);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_269s69slx1e1jw0.R.inc(8151);int structEnd = buf.readUnsignedByte() + buf.readerIndex();

                __CLR4_5_269s69slx1e1jw0.R.inc(8152);long time = buf.readUnsignedInt();
                __CLR4_5_269s69slx1e1jw0.R.inc(8153);if (((((time & 0x0f) == DATA_TYPE)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8154)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8155)==0&false))) {{

                    __CLR4_5_269s69slx1e1jw0.R.inc(8156);time = time >> 4 << 1;
                    __CLR4_5_269s69slx1e1jw0.R.inc(8157);time += 0x47798280; // 01/01/2008
                    __CLR4_5_269s69slx1e1jw0.R.inc(8158);position.setTime(new Date(time * 1000));

                    // Read masks
                    __CLR4_5_269s69slx1e1jw0.R.inc(8159);int mask;
                    __CLR4_5_269s69slx1e1jw0.R.inc(8160);List<Integer> masks = new LinkedList<>();
                    __CLR4_5_269s69slx1e1jw0.R.inc(8161);do {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8162);mask = buf.readUnsignedShort();
                        __CLR4_5_269s69slx1e1jw0.R.inc(8163);masks.add(mask);
                    } }while ((((BitUtil.check(mask, 15))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8164)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8165)==0&false)));

                    __CLR4_5_269s69slx1e1jw0.R.inc(8166);mask = masks.get(0);

                    __CLR4_5_269s69slx1e1jw0.R.inc(8167);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8168)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8169)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8170);position.setValid(true);
                        __CLR4_5_269s69slx1e1jw0.R.inc(8171);position.setLongitude(buf.readFloat());
                        __CLR4_5_269s69slx1e1jw0.R.inc(8172);position.setLatitude(buf.readFloat());
                        __CLR4_5_269s69slx1e1jw0.R.inc(8173);position.setSpeed(buf.readUnsignedByte());

                        __CLR4_5_269s69slx1e1jw0.R.inc(8174);int gps = buf.readUnsignedByte();
                        __CLR4_5_269s69slx1e1jw0.R.inc(8175);position.set(Position.KEY_SATELLITES, gps & 0xf);
                        __CLR4_5_269s69slx1e1jw0.R.inc(8176);position.set(Position.KEY_HDOP, gps >> 4);

                        __CLR4_5_269s69slx1e1jw0.R.inc(8177);position.setCourse(buf.readUnsignedByte());
                        __CLR4_5_269s69slx1e1jw0.R.inc(8178);position.setAltitude(buf.readUnsignedShort());

                        __CLR4_5_269s69slx1e1jw0.R.inc(8179);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    }

                    }__CLR4_5_269s69slx1e1jw0.R.inc(8180);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8181)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8182)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8183);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
                    }

                    }__CLR4_5_269s69slx1e1jw0.R.inc(8184);for (int i = 1; (((i <= 8)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8185)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8186)==0&false)); i++) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8187);if ((((BitUtil.check(mask, i + 1))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8188)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8189)==0&false))) {{
                            __CLR4_5_269s69slx1e1jw0.R.inc(8190);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                        }
                    }}

                    }__CLR4_5_269s69slx1e1jw0.R.inc(8191);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8192)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8193)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8194);buf.skipBytes(4);
                    }
                    }__CLR4_5_269s69slx1e1jw0.R.inc(8195);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8196)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8197)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8198);buf.skipBytes(4);
                    }
                    }__CLR4_5_269s69slx1e1jw0.R.inc(8199);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8200)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8201)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8202);buf.skipBytes(2);
                    }
                    }__CLR4_5_269s69slx1e1jw0.R.inc(8203);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8204)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8205)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8206);buf.skipBytes(2);
                    }

                    }__CLR4_5_269s69slx1e1jw0.R.inc(8207);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8208)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8209)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8210);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedByte(),
                                buf.readUnsignedShort(), buf.readUnsignedShort())));
                        __CLR4_5_269s69slx1e1jw0.R.inc(8211);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                        __CLR4_5_269s69slx1e1jw0.R.inc(8212);buf.readUnsignedByte();
                    }

                    }__CLR4_5_269s69slx1e1jw0.R.inc(8213);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_269s69slx1e1jw0.R.iget(8214)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8215)==0&false))) {{
                        __CLR4_5_269s69slx1e1jw0.R.inc(8216);positions.add(position);
                    }
                }}

                }__CLR4_5_269s69slx1e1jw0.R.inc(8217);buf.readerIndex(structEnd);
            }

            // Send response
            }__CLR4_5_269s69slx1e1jw0.R.inc(8218);if ((((type == MSG_ASYNC_STACK && channel != null)&&(__CLR4_5_269s69slx1e1jw0.R.iget(8219)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8220)==0&false))) {{
                __CLR4_5_269s69slx1e1jw0.R.inc(8221);ChannelBuffer response = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, 8 + 2 + 2 + 1);
                __CLR4_5_269s69slx1e1jw0.R.inc(8222);response.writeLong(Long.parseLong(imei));
                __CLR4_5_269s69slx1e1jw0.R.inc(8223);response.writeShort(2);
                __CLR4_5_269s69slx1e1jw0.R.inc(8224);response.writeByte(MSG_STACK_COFIRM);
                __CLR4_5_269s69slx1e1jw0.R.inc(8225);response.writeByte(confirmKey);

                __CLR4_5_269s69slx1e1jw0.R.inc(8226);int checksum = 0;
                __CLR4_5_269s69slx1e1jw0.R.inc(8227);for (int i = 0; (((i < response.writerIndex())&&(__CLR4_5_269s69slx1e1jw0.R.iget(8228)!=0|true))||(__CLR4_5_269s69slx1e1jw0.R.iget(8229)==0&false)); i++) {{
                    __CLR4_5_269s69slx1e1jw0.R.inc(8230);checksum += response.getUnsignedByte(i);
                }
                }__CLR4_5_269s69slx1e1jw0.R.inc(8231);response.writeByte(checksum);

                __CLR4_5_269s69slx1e1jw0.R.inc(8232);channel.write(response);
            }
        }}

        }__CLR4_5_269s69slx1e1jw0.R.inc(8233);return positions;
    }finally{__CLR4_5_269s69slx1e1jw0.R.flushNeeded();}}

}
