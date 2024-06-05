/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ApelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24zp4zplx1dxn0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,6597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ApelProtocolDecoder(ApelProtocol protocol) {
        super(protocol);__CLR4_5_24zp4zplx1dxn0u.R.inc(6470);try{__CLR4_5_24zp4zplx1dxn0u.R.inc(6469);
    }finally{__CLR4_5_24zp4zplx1dxn0u.R.flushNeeded();}}

    public static final short MSG_NULL = 0;
    public static final short MSG_REQUEST_TRACKER_ID = 10;
    public static final short MSG_TRACKER_ID = 11;
    public static final short MSG_TRACKER_ID_EXT = 12;
    public static final short MSG_DISCONNECT = 20;
    public static final short MSG_REQUEST_PASSWORD = 30;
    public static final short MSG_PASSWORD = 31;
    public static final short MSG_REQUEST_STATE_FULL_INFO = 90;
    public static final short MSG_STATE_FULL_INFO_T104 = 92;
    public static final short MSG_REQUEST_CURRENT_GPS_DATA = 100;
    public static final short MSG_CURRENT_GPS_DATA = 101;
    public static final short MSG_REQUEST_SENSORS_STATE = 110;
    public static final short MSG_SENSORS_STATE = 111;
    public static final short MSG_SENSORS_STATE_T100 = 112;
    public static final short MSG_SENSORS_STATE_T100_4 = 113;
    public static final short MSG_REQUEST_LAST_LOG_INDEX = 120;
    public static final short MSG_LAST_LOG_INDEX = 121;
    public static final short MSG_REQUEST_LOG_RECORDS = 130;
    public static final short MSG_LOG_RECORDS = 131;
    public static final short MSG_EVENT = 141;
    public static final short MSG_TEXT = 150;
    public static final short MSG_ACK_ALARM = 160;
    public static final short MSG_SET_TRACKER_MODE = 170;
    public static final short MSG_GPRS_COMMAND = 180;

    private void sendSimpleMessage(Channel channel, short type) {try{__CLR4_5_24zp4zplx1dxn0u.R.inc(6471);
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6472);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6473);request.writeShort(type);
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6474);request.writeShort(0);
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6475);request.writeInt(Checksum.crc32(request.toByteBuffer(0, 4)));
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6476);channel.write(request);
    }finally{__CLR4_5_24zp4zplx1dxn0u.R.flushNeeded();}}

    private void requestArchive(Channel channel) {try{__CLR4_5_24zp4zplx1dxn0u.R.inc(6477);
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6478);if ((((lastIndex == 0)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6479)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6480)==0&false))) {{
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6481);lastIndex = newIndex;
        } }else {__CLR4_5_24zp4zplx1dxn0u.R.inc(6482);if ((((newIndex > lastIndex)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6483)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6484)==0&false))) {{
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6485);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 14);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6486);request.writeShort(MSG_REQUEST_LOG_RECORDS);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6487);request.writeShort(6);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6488);request.writeInt((int) lastIndex);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6489);request.writeShort(512);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6490);request.writeInt(Checksum.crc32(request.toByteBuffer(0, 10)));
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6491);channel.write(request);
        }
    }}}finally{__CLR4_5_24zp4zplx1dxn0u.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_24zp4zplx1dxn0u.R.inc(6492);

        __CLR4_5_24zp4zplx1dxn0u.R.inc(6493);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6494);int type = buf.readUnsignedShort();
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6495);boolean alarm = (type & 0x8000) != 0;
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6496);type = type & 0x7FFF;
        __CLR4_5_24zp4zplx1dxn0u.R.inc(6497);buf.readUnsignedShort(); // length

        __CLR4_5_24zp4zplx1dxn0u.R.inc(6498);if ((((alarm)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6499)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6500)==0&false))) {{
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6501);sendSimpleMessage(channel, MSG_ACK_ALARM);
        }

        }__CLR4_5_24zp4zplx1dxn0u.R.inc(6502);if ((((type == MSG_TRACKER_ID)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6503)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6504)==0&false))) {{
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6505);return null; // unsupported authentication type
        }

        }__CLR4_5_24zp4zplx1dxn0u.R.inc(6506);if ((((type == MSG_TRACKER_ID_EXT)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6507)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6508)==0&false))) {{

            __CLR4_5_24zp4zplx1dxn0u.R.inc(6509);buf.readUnsignedInt(); // id
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6510);int length = buf.readUnsignedShort();
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6511);buf.skipBytes(length);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6512);length = buf.readUnsignedShort();
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6513);getDeviceSession(channel, remoteAddress, buf.readBytes(length).toString(StandardCharsets.US_ASCII));

        } }else {__CLR4_5_24zp4zplx1dxn0u.R.inc(6514);if ((((type == MSG_LAST_LOG_INDEX)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6515)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6516)==0&false))) {{

            __CLR4_5_24zp4zplx1dxn0u.R.inc(6517);long index = buf.readUnsignedInt();
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6518);if ((((index > 0)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6519)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6520)==0&false))) {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6521);newIndex = index;
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6522);requestArchive(channel);
            }

        }} }else {__CLR4_5_24zp4zplx1dxn0u.R.inc(6523);if ((((type == MSG_CURRENT_GPS_DATA || type == MSG_STATE_FULL_INFO_T104 || type == MSG_LOG_RECORDS)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6524)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6525)==0&false))) {{

            __CLR4_5_24zp4zplx1dxn0u.R.inc(6526);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6527);if ((((deviceSession == null)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6528)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6529)==0&false))) {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6530);return null;
            }

            }__CLR4_5_24zp4zplx1dxn0u.R.inc(6531);List<Position> positions = new LinkedList<>();

            __CLR4_5_24zp4zplx1dxn0u.R.inc(6532);int recordCount = 1;
            __CLR4_5_24zp4zplx1dxn0u.R.inc(6533);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6534)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6535)==0&false))) {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6536);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_24zp4zplx1dxn0u.R.inc(6537);for (int j = 0; (((j < recordCount)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6538)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6539)==0&false)); j++) {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6540);Position position = new Position();
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6541);position.setProtocol(getProtocolName());
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6542);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_24zp4zplx1dxn0u.R.inc(6543);int subtype = type;
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6544);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6545)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6546)==0&false))) {{
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6547);position.set(Position.KEY_ARCHIVE, true);
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6548);lastIndex = buf.readUnsignedInt() + 1;
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6549);position.set(Position.KEY_INDEX, lastIndex);

                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6550);subtype = buf.readUnsignedShort();
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6551);if ((((subtype != MSG_CURRENT_GPS_DATA && subtype != MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6552)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6553)==0&false))) {{
                        __CLR4_5_24zp4zplx1dxn0u.R.inc(6554);buf.skipBytes(buf.readUnsignedShort());
                        __CLR4_5_24zp4zplx1dxn0u.R.inc(6555);continue;
                    }
                    }__CLR4_5_24zp4zplx1dxn0u.R.inc(6556);buf.readUnsignedShort(); // length
                }

                }__CLR4_5_24zp4zplx1dxn0u.R.inc(6557);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6558);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6559);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                __CLR4_5_24zp4zplx1dxn0u.R.inc(6560);if ((((subtype == MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6561)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6562)==0&false))) {{
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6563);int speed = buf.readUnsignedByte();
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6564);position.setValid(speed != 255);
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6565);position.setSpeed(UnitsConverter.knotsFromKph(speed));
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6566);position.set(Position.KEY_HDOP, buf.readByte());
                } }else {{
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6567);int speed = buf.readShort();
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6568);position.setValid(speed != -1);
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6569);position.setSpeed(UnitsConverter.knotsFromKph(speed * 0.01));
                }

                }__CLR4_5_24zp4zplx1dxn0u.R.inc(6570);position.setCourse(buf.readShort() * 0.01);
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6571);position.setAltitude(buf.readShort());

                __CLR4_5_24zp4zplx1dxn0u.R.inc(6572);if ((((subtype == MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6573)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6574)==0&false))) {{

                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6575);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6576);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6577);position.set(Position.KEY_EVENT, buf.readUnsignedShort());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6578);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6579);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6580);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());

                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6581);for (int i = 1; (((i <= 8)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6582)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6583)==0&false)); i++) {{
                        __CLR4_5_24zp4zplx1dxn0u.R.inc(6584);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                    }

                    }__CLR4_5_24zp4zplx1dxn0u.R.inc(6585);position.set(Position.PREFIX_COUNT + 1, buf.readUnsignedInt());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6586);position.set(Position.PREFIX_COUNT + 2, buf.readUnsignedInt());
                    __CLR4_5_24zp4zplx1dxn0u.R.inc(6587);position.set(Position.PREFIX_COUNT + 3, buf.readUnsignedInt());
                }

                }__CLR4_5_24zp4zplx1dxn0u.R.inc(6588);positions.add(position);
            }

            }__CLR4_5_24zp4zplx1dxn0u.R.inc(6589);buf.readUnsignedInt(); // crc

            __CLR4_5_24zp4zplx1dxn0u.R.inc(6590);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_24zp4zplx1dxn0u.R.iget(6591)!=0|true))||(__CLR4_5_24zp4zplx1dxn0u.R.iget(6592)==0&false))) {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6593);requestArchive(channel);
            } }else {{
                __CLR4_5_24zp4zplx1dxn0u.R.inc(6594);sendSimpleMessage(channel, MSG_REQUEST_LAST_LOG_INDEX);
            }

            }__CLR4_5_24zp4zplx1dxn0u.R.inc(6595);return positions;
        }

        }}}__CLR4_5_24zp4zplx1dxn0u.R.inc(6596);return null;
    }finally{__CLR4_5_24zp4zplx1dxn0u.R.flushNeeded();}}

}
