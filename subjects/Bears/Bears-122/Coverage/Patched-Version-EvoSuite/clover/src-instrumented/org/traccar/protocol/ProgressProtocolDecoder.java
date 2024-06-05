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

public class ProgressProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ecpecplwye418y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,18710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ProgressProtocolDecoder(ProgressProtocol protocol) {
        super(protocol);__CLR4_5_2ecpecplwye418y.R.inc(18602);try{__CLR4_5_2ecpecplwye418y.R.inc(18601);
    }finally{__CLR4_5_2ecpecplwye418y.R.flushNeeded();}}

    public static final int MSG_NULL = 0;
    public static final int MSG_IDENT = 1;
    public static final int MSG_IDENT_FULL = 2;
    public static final int MSG_POINT = 10;
    public static final int MSG_LOG_SYNC = 100;
    public static final int MSG_LOGMSG = 101;
    public static final int MSG_TEXT = 102;
    public static final int MSG_ALARM = 200;
    public static final int MSG_ALARM_RECIEVED = 201;

    private void requestArchive(Channel channel) {try{__CLR4_5_2ecpecplwye418y.R.inc(18603);
        __CLR4_5_2ecpecplwye418y.R.inc(18604);if ((((lastIndex == 0)&&(__CLR4_5_2ecpecplwye418y.R.iget(18605)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18606)==0&false))) {{
            __CLR4_5_2ecpecplwye418y.R.inc(18607);lastIndex = newIndex;
        } }else {__CLR4_5_2ecpecplwye418y.R.inc(18608);if ((((newIndex > lastIndex)&&(__CLR4_5_2ecpecplwye418y.R.iget(18609)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18610)==0&false))) {{
            __CLR4_5_2ecpecplwye418y.R.inc(18611);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 12);
            __CLR4_5_2ecpecplwye418y.R.inc(18612);request.writeShort(MSG_LOG_SYNC);
            __CLR4_5_2ecpecplwye418y.R.inc(18613);request.writeShort(4);
            __CLR4_5_2ecpecplwye418y.R.inc(18614);request.writeInt((int) lastIndex);
            __CLR4_5_2ecpecplwye418y.R.inc(18615);request.writeInt(0);
            __CLR4_5_2ecpecplwye418y.R.inc(18616);channel.write(request);
        }
    }}}finally{__CLR4_5_2ecpecplwye418y.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ecpecplwye418y.R.inc(18617);

        __CLR4_5_2ecpecplwye418y.R.inc(18618);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_2ecpecplwye418y.R.inc(18619);int type = buf.readUnsignedShort();
        __CLR4_5_2ecpecplwye418y.R.inc(18620);buf.readUnsignedShort(); // length

        __CLR4_5_2ecpecplwye418y.R.inc(18621);if ((((type == MSG_IDENT || type == MSG_IDENT_FULL)&&(__CLR4_5_2ecpecplwye418y.R.iget(18622)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18623)==0&false))) {{

            __CLR4_5_2ecpecplwye418y.R.inc(18624);buf.readUnsignedInt(); // id
            __CLR4_5_2ecpecplwye418y.R.inc(18625);int length = buf.readUnsignedShort();
            __CLR4_5_2ecpecplwye418y.R.inc(18626);buf.skipBytes(length);
            __CLR4_5_2ecpecplwye418y.R.inc(18627);length = buf.readUnsignedShort();
            __CLR4_5_2ecpecplwye418y.R.inc(18628);buf.skipBytes(length);
            __CLR4_5_2ecpecplwye418y.R.inc(18629);length = buf.readUnsignedShort();
            __CLR4_5_2ecpecplwye418y.R.inc(18630);String imei = buf.readBytes(length).toString(StandardCharsets.US_ASCII);
            __CLR4_5_2ecpecplwye418y.R.inc(18631);getDeviceSession(channel, remoteAddress, imei);

        } }else {__CLR4_5_2ecpecplwye418y.R.inc(18632);if ((((type == MSG_POINT || type == MSG_ALARM || type == MSG_LOGMSG)&&(__CLR4_5_2ecpecplwye418y.R.iget(18633)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18634)==0&false))) {{

            __CLR4_5_2ecpecplwye418y.R.inc(18635);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2ecpecplwye418y.R.inc(18636);if ((((deviceSession == null)&&(__CLR4_5_2ecpecplwye418y.R.iget(18637)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18638)==0&false))) {{
                __CLR4_5_2ecpecplwye418y.R.inc(18639);return null;
            }

            }__CLR4_5_2ecpecplwye418y.R.inc(18640);List<Position> positions = new LinkedList<>();

            __CLR4_5_2ecpecplwye418y.R.inc(18641);int recordCount = 1;
            __CLR4_5_2ecpecplwye418y.R.inc(18642);if ((((type == MSG_LOGMSG)&&(__CLR4_5_2ecpecplwye418y.R.iget(18643)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18644)==0&false))) {{
                __CLR4_5_2ecpecplwye418y.R.inc(18645);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_2ecpecplwye418y.R.inc(18646);for (int j = 0; (((j < recordCount)&&(__CLR4_5_2ecpecplwye418y.R.iget(18647)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18648)==0&false)); j++) {{
                __CLR4_5_2ecpecplwye418y.R.inc(18649);Position position = new Position();
                __CLR4_5_2ecpecplwye418y.R.inc(18650);position.setProtocol(getProtocolName());
                __CLR4_5_2ecpecplwye418y.R.inc(18651);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2ecpecplwye418y.R.inc(18652);if ((((type == MSG_LOGMSG)&&(__CLR4_5_2ecpecplwye418y.R.iget(18653)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18654)==0&false))) {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18655);position.set(Position.KEY_ARCHIVE, true);
                    __CLR4_5_2ecpecplwye418y.R.inc(18656);int subtype = buf.readUnsignedShort();
                    __CLR4_5_2ecpecplwye418y.R.inc(18657);if ((((subtype == MSG_ALARM)&&(__CLR4_5_2ecpecplwye418y.R.iget(18658)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18659)==0&false))) {{
                        __CLR4_5_2ecpecplwye418y.R.inc(18660);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_2ecpecplwye418y.R.inc(18661);if ((((buf.readUnsignedShort() > buf.readableBytes())&&(__CLR4_5_2ecpecplwye418y.R.iget(18662)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18663)==0&false))) {{
                        __CLR4_5_2ecpecplwye418y.R.inc(18664);lastIndex += 1;
                        __CLR4_5_2ecpecplwye418y.R.inc(18665);break; // workaround for device bug
                    }
                    }__CLR4_5_2ecpecplwye418y.R.inc(18666);lastIndex = buf.readUnsignedInt();
                    __CLR4_5_2ecpecplwye418y.R.inc(18667);position.set(Position.KEY_INDEX, lastIndex);
                } }else {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18668);newIndex = buf.readUnsignedInt();
                }

                }__CLR4_5_2ecpecplwye418y.R.inc(18669);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_2ecpecplwye418y.R.inc(18670);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_2ecpecplwye418y.R.inc(18671);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_2ecpecplwye418y.R.inc(18672);position.setSpeed(buf.readUnsignedInt() * 0.01);
                __CLR4_5_2ecpecplwye418y.R.inc(18673);position.setCourse(buf.readUnsignedShort() * 0.01);
                __CLR4_5_2ecpecplwye418y.R.inc(18674);position.setAltitude(buf.readUnsignedShort() * 0.01);

                __CLR4_5_2ecpecplwye418y.R.inc(18675);int satellites = buf.readUnsignedByte();
                __CLR4_5_2ecpecplwye418y.R.inc(18676);position.setValid(satellites >= 3);
                __CLR4_5_2ecpecplwye418y.R.inc(18677);position.set(Position.KEY_SATELLITES, satellites);

                __CLR4_5_2ecpecplwye418y.R.inc(18678);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                __CLR4_5_2ecpecplwye418y.R.inc(18679);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_2ecpecplwye418y.R.inc(18680);long extraFlags = buf.readLong();

                __CLR4_5_2ecpecplwye418y.R.inc(18681);if ((((BitUtil.check(extraFlags, 0))&&(__CLR4_5_2ecpecplwye418y.R.iget(18682)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18683)==0&false))) {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18684);int count = buf.readUnsignedShort();
                    __CLR4_5_2ecpecplwye418y.R.inc(18685);for (int i = 1; (((i <= count)&&(__CLR4_5_2ecpecplwye418y.R.iget(18686)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18687)==0&false)); i++) {{
                        __CLR4_5_2ecpecplwye418y.R.inc(18688);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                }}

                }__CLR4_5_2ecpecplwye418y.R.inc(18689);if ((((BitUtil.check(extraFlags, 1))&&(__CLR4_5_2ecpecplwye418y.R.iget(18690)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18691)==0&false))) {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18692);int size = buf.readUnsignedShort();
                    __CLR4_5_2ecpecplwye418y.R.inc(18693);position.set("can", buf.toString(buf.readerIndex(), size, StandardCharsets.US_ASCII));
                    __CLR4_5_2ecpecplwye418y.R.inc(18694);buf.skipBytes(size);
                }

                }__CLR4_5_2ecpecplwye418y.R.inc(18695);if ((((BitUtil.check(extraFlags, 2))&&(__CLR4_5_2ecpecplwye418y.R.iget(18696)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18697)==0&false))) {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18698);position.set("passenger",
                            ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedShort())));
                }

                }__CLR4_5_2ecpecplwye418y.R.inc(18699);if ((((type == MSG_ALARM)&&(__CLR4_5_2ecpecplwye418y.R.iget(18700)!=0|true))||(__CLR4_5_2ecpecplwye418y.R.iget(18701)==0&false))) {{
                    __CLR4_5_2ecpecplwye418y.R.inc(18702);position.set(Position.KEY_ALARM, true);
                    __CLR4_5_2ecpecplwye418y.R.inc(18703);byte[] response = {(byte) 0xC9, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
                    __CLR4_5_2ecpecplwye418y.R.inc(18704);channel.write(ChannelBuffers.wrappedBuffer(response));
                }

                }__CLR4_5_2ecpecplwye418y.R.inc(18705);buf.readUnsignedInt(); // crc

                __CLR4_5_2ecpecplwye418y.R.inc(18706);positions.add(position);
            }

            }__CLR4_5_2ecpecplwye418y.R.inc(18707);requestArchive(channel);

            __CLR4_5_2ecpecplwye418y.R.inc(18708);return positions;
        }

        }}__CLR4_5_2ecpecplwye418y.R.inc(18709);return null;
    }finally{__CLR4_5_2ecpecplwye418y.R.flushNeeded();}}

}
