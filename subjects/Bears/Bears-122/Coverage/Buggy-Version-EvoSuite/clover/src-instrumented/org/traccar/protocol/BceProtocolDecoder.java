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

public class BceProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2732732lwydwc6d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,9287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BceProtocolDecoder(BceProtocol protocol) {
        super(protocol);__CLR4_5_2732732lwydwc6d.R.inc(9183);try{__CLR4_5_2732732lwydwc6d.R.inc(9182);
    }finally{__CLR4_5_2732732lwydwc6d.R.flushNeeded();}}

    private static final int DATA_TYPE = 7;

    public static final int MSG_ASYNC_STACK = 0xA5;
    public static final int MSG_STACK_COFIRM = 0x19;
    public static final int MSG_TIME_TRIGGERED = 0xA0;
    public static final int MSG_OUTPUT_CONTROL = 0x41;
    public static final int MSG_OUTPUT_CONTROL_ACK = 0xC1;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2732732lwydwc6d.R.inc(9184);

        __CLR4_5_2732732lwydwc6d.R.inc(9185);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2732732lwydwc6d.R.inc(9186);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_2732732lwydwc6d.R.inc(9187);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2732732lwydwc6d.R.inc(9188);if ((((deviceSession == null)&&(__CLR4_5_2732732lwydwc6d.R.iget(9189)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9190)==0&false))) {{
            __CLR4_5_2732732lwydwc6d.R.inc(9191);return null;
        }

        }__CLR4_5_2732732lwydwc6d.R.inc(9192);List<Position> positions = new LinkedList<>();

        __CLR4_5_2732732lwydwc6d.R.inc(9193);while ((((buf.readableBytes() > 1)&&(__CLR4_5_2732732lwydwc6d.R.iget(9194)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9195)==0&false))) {{

            __CLR4_5_2732732lwydwc6d.R.inc(9196);int dataEnd = buf.readUnsignedShort() + buf.readerIndex();
            __CLR4_5_2732732lwydwc6d.R.inc(9197);int type = buf.readUnsignedByte();
            __CLR4_5_2732732lwydwc6d.R.inc(9198);int confirmKey = buf.readUnsignedByte() & 0x7F;

            __CLR4_5_2732732lwydwc6d.R.inc(9199);while ((((buf.readerIndex() < dataEnd)&&(__CLR4_5_2732732lwydwc6d.R.iget(9200)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9201)==0&false))) {{

                __CLR4_5_2732732lwydwc6d.R.inc(9202);Position position = new Position();
                __CLR4_5_2732732lwydwc6d.R.inc(9203);position.setProtocol(getProtocolName());
                __CLR4_5_2732732lwydwc6d.R.inc(9204);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2732732lwydwc6d.R.inc(9205);int structEnd = buf.readUnsignedByte() + buf.readerIndex();

                __CLR4_5_2732732lwydwc6d.R.inc(9206);long time = buf.readUnsignedInt();
                __CLR4_5_2732732lwydwc6d.R.inc(9207);if (((((time & 0x0f) == DATA_TYPE)&&(__CLR4_5_2732732lwydwc6d.R.iget(9208)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9209)==0&false))) {{

                    __CLR4_5_2732732lwydwc6d.R.inc(9210);time = time >> 4 << 1;
                    __CLR4_5_2732732lwydwc6d.R.inc(9211);time += 0x47798280; // 01/01/2008
                    __CLR4_5_2732732lwydwc6d.R.inc(9212);position.setTime(new Date(time * 1000));

                    // Read masks
                    __CLR4_5_2732732lwydwc6d.R.inc(9213);int mask;
                    __CLR4_5_2732732lwydwc6d.R.inc(9214);List<Integer> masks = new LinkedList<>();
                    __CLR4_5_2732732lwydwc6d.R.inc(9215);do {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9216);mask = buf.readUnsignedShort();
                        __CLR4_5_2732732lwydwc6d.R.inc(9217);masks.add(mask);
                    } }while ((((BitUtil.check(mask, 15))&&(__CLR4_5_2732732lwydwc6d.R.iget(9218)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9219)==0&false)));

                    __CLR4_5_2732732lwydwc6d.R.inc(9220);mask = masks.get(0);

                    __CLR4_5_2732732lwydwc6d.R.inc(9221);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_2732732lwydwc6d.R.iget(9222)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9223)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9224);position.setValid(true);
                        __CLR4_5_2732732lwydwc6d.R.inc(9225);position.setLongitude(buf.readFloat());
                        __CLR4_5_2732732lwydwc6d.R.inc(9226);position.setLatitude(buf.readFloat());
                        __CLR4_5_2732732lwydwc6d.R.inc(9227);position.setSpeed(buf.readUnsignedByte());

                        __CLR4_5_2732732lwydwc6d.R.inc(9228);int gps = buf.readUnsignedByte();
                        __CLR4_5_2732732lwydwc6d.R.inc(9229);position.set(Position.KEY_SATELLITES, gps & 0xf);
                        __CLR4_5_2732732lwydwc6d.R.inc(9230);position.set(Position.KEY_HDOP, gps >> 4);

                        __CLR4_5_2732732lwydwc6d.R.inc(9231);position.setCourse(buf.readUnsignedByte());
                        __CLR4_5_2732732lwydwc6d.R.inc(9232);position.setAltitude(buf.readUnsignedShort());

                        __CLR4_5_2732732lwydwc6d.R.inc(9233);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    }

                    }__CLR4_5_2732732lwydwc6d.R.inc(9234);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_2732732lwydwc6d.R.iget(9235)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9236)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9237);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
                    }

                    }__CLR4_5_2732732lwydwc6d.R.inc(9238);for (int i = 1; (((i <= 8)&&(__CLR4_5_2732732lwydwc6d.R.iget(9239)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9240)==0&false)); i++) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9241);if ((((BitUtil.check(mask, i + 1))&&(__CLR4_5_2732732lwydwc6d.R.iget(9242)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9243)==0&false))) {{
                            __CLR4_5_2732732lwydwc6d.R.inc(9244);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                        }
                    }}

                    }__CLR4_5_2732732lwydwc6d.R.inc(9245);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_2732732lwydwc6d.R.iget(9246)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9247)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9248);buf.skipBytes(4);
                    }
                    }__CLR4_5_2732732lwydwc6d.R.inc(9249);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_2732732lwydwc6d.R.iget(9250)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9251)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9252);buf.skipBytes(4);
                    }
                    }__CLR4_5_2732732lwydwc6d.R.inc(9253);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_2732732lwydwc6d.R.iget(9254)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9255)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9256);buf.skipBytes(2);
                    }
                    }__CLR4_5_2732732lwydwc6d.R.inc(9257);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_2732732lwydwc6d.R.iget(9258)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9259)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9260);buf.skipBytes(2);
                    }

                    }__CLR4_5_2732732lwydwc6d.R.inc(9261);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_2732732lwydwc6d.R.iget(9262)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9263)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9264);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedByte(),
                                buf.readUnsignedShort(), buf.readUnsignedShort(),
                                buf.readUnsignedByte())));
                        __CLR4_5_2732732lwydwc6d.R.inc(9265);buf.readUnsignedByte();
                    }

                    }__CLR4_5_2732732lwydwc6d.R.inc(9266);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_2732732lwydwc6d.R.iget(9267)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9268)==0&false))) {{
                        __CLR4_5_2732732lwydwc6d.R.inc(9269);positions.add(position);
                    }
                }}

                }__CLR4_5_2732732lwydwc6d.R.inc(9270);buf.readerIndex(structEnd);
            }

            // Send response
            }__CLR4_5_2732732lwydwc6d.R.inc(9271);if ((((type == MSG_ASYNC_STACK && channel != null)&&(__CLR4_5_2732732lwydwc6d.R.iget(9272)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9273)==0&false))) {{
                __CLR4_5_2732732lwydwc6d.R.inc(9274);ChannelBuffer response = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, 8 + 2 + 2 + 1);
                __CLR4_5_2732732lwydwc6d.R.inc(9275);response.writeLong(Long.parseLong(imei));
                __CLR4_5_2732732lwydwc6d.R.inc(9276);response.writeShort(2);
                __CLR4_5_2732732lwydwc6d.R.inc(9277);response.writeByte(MSG_STACK_COFIRM);
                __CLR4_5_2732732lwydwc6d.R.inc(9278);response.writeByte(confirmKey);

                __CLR4_5_2732732lwydwc6d.R.inc(9279);int checksum = 0;
                __CLR4_5_2732732lwydwc6d.R.inc(9280);for (int i = 0; (((i < response.writerIndex())&&(__CLR4_5_2732732lwydwc6d.R.iget(9281)!=0|true))||(__CLR4_5_2732732lwydwc6d.R.iget(9282)==0&false)); i++) {{
                    __CLR4_5_2732732lwydwc6d.R.inc(9283);checksum += response.getUnsignedByte(i);
                }
                }__CLR4_5_2732732lwydwc6d.R.inc(9284);response.writeByte(checksum);

                __CLR4_5_2732732lwydwc6d.R.inc(9285);channel.write(response);
            }
        }}

        }__CLR4_5_2732732lwydwc6d.R.inc(9286);return positions;
    }finally{__CLR4_5_2732732lwydwc6d.R.flushNeeded();}}

}
