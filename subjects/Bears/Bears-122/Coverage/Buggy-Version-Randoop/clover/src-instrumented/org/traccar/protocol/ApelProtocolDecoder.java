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

public class ApelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25ny5nylwydyh9a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,7470,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ApelProtocolDecoder(ApelProtocol protocol) {
        super(protocol);__CLR4_5_25ny5nylwydyh9a.R.inc(7343);try{__CLR4_5_25ny5nylwydyh9a.R.inc(7342);
    }finally{__CLR4_5_25ny5nylwydyh9a.R.flushNeeded();}}

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

    private void sendSimpleMessage(Channel channel, short type) {try{__CLR4_5_25ny5nylwydyh9a.R.inc(7344);
        __CLR4_5_25ny5nylwydyh9a.R.inc(7345);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_25ny5nylwydyh9a.R.inc(7346);request.writeShort(type);
        __CLR4_5_25ny5nylwydyh9a.R.inc(7347);request.writeShort(0);
        __CLR4_5_25ny5nylwydyh9a.R.inc(7348);request.writeInt(Checksum.crc32(request.toByteBuffer(0, 4)));
        __CLR4_5_25ny5nylwydyh9a.R.inc(7349);channel.write(request);
    }finally{__CLR4_5_25ny5nylwydyh9a.R.flushNeeded();}}

    private void requestArchive(Channel channel) {try{__CLR4_5_25ny5nylwydyh9a.R.inc(7350);
        __CLR4_5_25ny5nylwydyh9a.R.inc(7351);if ((((lastIndex == 0)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7352)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7353)==0&false))) {{
            __CLR4_5_25ny5nylwydyh9a.R.inc(7354);lastIndex = newIndex;
        } }else {__CLR4_5_25ny5nylwydyh9a.R.inc(7355);if ((((newIndex > lastIndex)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7356)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7357)==0&false))) {{
            __CLR4_5_25ny5nylwydyh9a.R.inc(7358);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 14);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7359);request.writeShort(MSG_REQUEST_LOG_RECORDS);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7360);request.writeShort(6);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7361);request.writeInt((int) lastIndex);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7362);request.writeShort(512);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7363);request.writeInt(Checksum.crc32(request.toByteBuffer(0, 10)));
            __CLR4_5_25ny5nylwydyh9a.R.inc(7364);channel.write(request);
        }
    }}}finally{__CLR4_5_25ny5nylwydyh9a.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25ny5nylwydyh9a.R.inc(7365);

        __CLR4_5_25ny5nylwydyh9a.R.inc(7366);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_25ny5nylwydyh9a.R.inc(7367);int type = buf.readUnsignedShort();
        __CLR4_5_25ny5nylwydyh9a.R.inc(7368);boolean alarm = (type & 0x8000) != 0;
        __CLR4_5_25ny5nylwydyh9a.R.inc(7369);type = type & 0x7FFF;
        __CLR4_5_25ny5nylwydyh9a.R.inc(7370);buf.readUnsignedShort(); // length

        __CLR4_5_25ny5nylwydyh9a.R.inc(7371);if ((((alarm)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7372)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7373)==0&false))) {{
            __CLR4_5_25ny5nylwydyh9a.R.inc(7374);sendSimpleMessage(channel, MSG_ACK_ALARM);
        }

        }__CLR4_5_25ny5nylwydyh9a.R.inc(7375);if ((((type == MSG_TRACKER_ID)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7376)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7377)==0&false))) {{
            __CLR4_5_25ny5nylwydyh9a.R.inc(7378);return null; // unsupported authentication type
        }

        }__CLR4_5_25ny5nylwydyh9a.R.inc(7379);if ((((type == MSG_TRACKER_ID_EXT)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7380)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7381)==0&false))) {{

            __CLR4_5_25ny5nylwydyh9a.R.inc(7382);buf.readUnsignedInt(); // id
            __CLR4_5_25ny5nylwydyh9a.R.inc(7383);int length = buf.readUnsignedShort();
            __CLR4_5_25ny5nylwydyh9a.R.inc(7384);buf.skipBytes(length);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7385);length = buf.readUnsignedShort();
            __CLR4_5_25ny5nylwydyh9a.R.inc(7386);getDeviceSession(channel, remoteAddress, buf.readBytes(length).toString(StandardCharsets.US_ASCII));

        } }else {__CLR4_5_25ny5nylwydyh9a.R.inc(7387);if ((((type == MSG_LAST_LOG_INDEX)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7388)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7389)==0&false))) {{

            __CLR4_5_25ny5nylwydyh9a.R.inc(7390);long index = buf.readUnsignedInt();
            __CLR4_5_25ny5nylwydyh9a.R.inc(7391);if ((((index > 0)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7392)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7393)==0&false))) {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7394);newIndex = index;
                __CLR4_5_25ny5nylwydyh9a.R.inc(7395);requestArchive(channel);
            }

        }} }else {__CLR4_5_25ny5nylwydyh9a.R.inc(7396);if ((((type == MSG_CURRENT_GPS_DATA || type == MSG_STATE_FULL_INFO_T104 || type == MSG_LOG_RECORDS)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7397)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7398)==0&false))) {{

            __CLR4_5_25ny5nylwydyh9a.R.inc(7399);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_25ny5nylwydyh9a.R.inc(7400);if ((((deviceSession == null)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7401)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7402)==0&false))) {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7403);return null;
            }

            }__CLR4_5_25ny5nylwydyh9a.R.inc(7404);List<Position> positions = new LinkedList<>();

            __CLR4_5_25ny5nylwydyh9a.R.inc(7405);int recordCount = 1;
            __CLR4_5_25ny5nylwydyh9a.R.inc(7406);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7407)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7408)==0&false))) {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7409);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_25ny5nylwydyh9a.R.inc(7410);for (int j = 0; (((j < recordCount)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7411)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7412)==0&false)); j++) {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7413);Position position = new Position();
                __CLR4_5_25ny5nylwydyh9a.R.inc(7414);position.setProtocol(getProtocolName());
                __CLR4_5_25ny5nylwydyh9a.R.inc(7415);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_25ny5nylwydyh9a.R.inc(7416);int subtype = type;
                __CLR4_5_25ny5nylwydyh9a.R.inc(7417);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7418)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7419)==0&false))) {{
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7420);position.set(Position.KEY_ARCHIVE, true);
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7421);lastIndex = buf.readUnsignedInt() + 1;
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7422);position.set(Position.KEY_INDEX, lastIndex);

                    __CLR4_5_25ny5nylwydyh9a.R.inc(7423);subtype = buf.readUnsignedShort();
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7424);if ((((subtype != MSG_CURRENT_GPS_DATA && subtype != MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7425)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7426)==0&false))) {{
                        __CLR4_5_25ny5nylwydyh9a.R.inc(7427);buf.skipBytes(buf.readUnsignedShort());
                        __CLR4_5_25ny5nylwydyh9a.R.inc(7428);continue;
                    }
                    }__CLR4_5_25ny5nylwydyh9a.R.inc(7429);buf.readUnsignedShort(); // length
                }

                }__CLR4_5_25ny5nylwydyh9a.R.inc(7430);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_25ny5nylwydyh9a.R.inc(7431);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);
                __CLR4_5_25ny5nylwydyh9a.R.inc(7432);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                __CLR4_5_25ny5nylwydyh9a.R.inc(7433);if ((((subtype == MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7434)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7435)==0&false))) {{
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7436);int speed = buf.readUnsignedByte();
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7437);position.setValid(speed != 255);
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7438);position.setSpeed(UnitsConverter.knotsFromKph(speed));
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7439);position.set(Position.KEY_HDOP, buf.readByte());
                } }else {{
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7440);int speed = buf.readShort();
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7441);position.setValid(speed != -1);
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7442);position.setSpeed(UnitsConverter.knotsFromKph(speed * 0.01));
                }

                }__CLR4_5_25ny5nylwydyh9a.R.inc(7443);position.setCourse(buf.readShort() * 0.01);
                __CLR4_5_25ny5nylwydyh9a.R.inc(7444);position.setAltitude(buf.readShort());

                __CLR4_5_25ny5nylwydyh9a.R.inc(7445);if ((((subtype == MSG_STATE_FULL_INFO_T104)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7446)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7447)==0&false))) {{

                    __CLR4_5_25ny5nylwydyh9a.R.inc(7448);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7449);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7450);position.set(Position.KEY_EVENT, buf.readUnsignedShort());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7451);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7452);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7453);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());

                    __CLR4_5_25ny5nylwydyh9a.R.inc(7454);for (int i = 1; (((i <= 8)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7455)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7456)==0&false)); i++) {{
                        __CLR4_5_25ny5nylwydyh9a.R.inc(7457);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
                    }

                    }__CLR4_5_25ny5nylwydyh9a.R.inc(7458);position.set(Position.PREFIX_COUNT + 1, buf.readUnsignedInt());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7459);position.set(Position.PREFIX_COUNT + 2, buf.readUnsignedInt());
                    __CLR4_5_25ny5nylwydyh9a.R.inc(7460);position.set(Position.PREFIX_COUNT + 3, buf.readUnsignedInt());
                }

                }__CLR4_5_25ny5nylwydyh9a.R.inc(7461);positions.add(position);
            }

            }__CLR4_5_25ny5nylwydyh9a.R.inc(7462);buf.readUnsignedInt(); // crc

            __CLR4_5_25ny5nylwydyh9a.R.inc(7463);if ((((type == MSG_LOG_RECORDS)&&(__CLR4_5_25ny5nylwydyh9a.R.iget(7464)!=0|true))||(__CLR4_5_25ny5nylwydyh9a.R.iget(7465)==0&false))) {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7466);requestArchive(channel);
            } }else {{
                __CLR4_5_25ny5nylwydyh9a.R.inc(7467);sendSimpleMessage(channel, MSG_REQUEST_LAST_LOG_INDEX);
            }

            }__CLR4_5_25ny5nylwydyh9a.R.inc(7468);return positions;
        }

        }}}__CLR4_5_25ny5nylwydyh9a.R.inc(7469);return null;
    }finally{__CLR4_5_25ny5nylwydyh9a.R.flushNeeded();}}

}
