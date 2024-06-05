/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Seconds;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class SmokeyProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ex4ex4lwydwem5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,19420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SmokeyProtocolDecoder(SmokeyProtocol protocol) {
        super(protocol);__CLR4_5_2ex4ex4lwydwem5.R.inc(19337);try{__CLR4_5_2ex4ex4lwydwem5.R.inc(19336);
    }finally{__CLR4_5_2ex4ex4lwydwem5.R.flushNeeded();}}

    public static final int MSG_DATE_RECORD = 0;
    public static final int MSG_DATE_RECORD_ACK = 1;

    private static void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int index, int report) {try{__CLR4_5_2ex4ex4lwydwem5.R.inc(19338);

        __CLR4_5_2ex4ex4lwydwem5.R.inc(19339);if ((((channel != null)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19340)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19341)==0&false))) {{
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19342);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19343);response.writeBytes("SM".getBytes(StandardCharsets.US_ASCII));
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19344);response.writeByte(3); // protocol version
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19345);response.writeByte(MSG_DATE_RECORD_ACK);
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19346);response.writeBytes(id);
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19347);response.writeInt(Seconds.secondsBetween(
                    new DateTime(2000, 1, 1, 0, 0, DateTimeZone.UTC), new DateTime(DateTimeZone.UTC)).getSeconds());
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19348);response.writeByte(index);
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19349);response.writeByte(report - 0x200);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19350);short checksum = (short) 0xF5A0;
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19351);for (int i = 0; (((i < response.readableBytes())&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19352)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19353)==0&false)); i += 2) {{
                __CLR4_5_2ex4ex4lwydwem5.R.inc(19354);checksum ^= ChannelBuffers.swapShort(response.getShort(i));
            }
            }__CLR4_5_2ex4ex4lwydwem5.R.inc(19355);response.writeShort(checksum);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19356);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_2ex4ex4lwydwem5.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ex4ex4lwydwem5.R.inc(19357);

        __CLR4_5_2ex4ex4lwydwem5.R.inc(19358);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2ex4ex4lwydwem5.R.inc(19359);buf.skipBytes(2); // header
        __CLR4_5_2ex4ex4lwydwem5.R.inc(19360);buf.readUnsignedByte(); // protocol version

        __CLR4_5_2ex4ex4lwydwem5.R.inc(19361);int type = buf.readUnsignedByte();

        __CLR4_5_2ex4ex4lwydwem5.R.inc(19362);ChannelBuffer id = buf.readBytes(8);
        __CLR4_5_2ex4ex4lwydwem5.R.inc(19363);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, ChannelBuffers.hexDump(id));
        __CLR4_5_2ex4ex4lwydwem5.R.inc(19364);if ((((deviceSession == null)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19365)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19366)==0&false))) {{
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19367);return null;
        }

        }__CLR4_5_2ex4ex4lwydwem5.R.inc(19368);if ((((type == MSG_DATE_RECORD)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19369)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19370)==0&false))) {{

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19371);Position position = new Position();
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19372);position.setProtocol(getProtocolName());
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19373);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19374);position.set(Position.KEY_VERSION_FW, buf.readUnsignedShort());

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19375);int status = buf.readUnsignedShort();
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19376);position.set(Position.KEY_STATUS, status);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19377);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(2000, 1, 1).addSeconds(buf.readUnsignedInt());

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19378);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19379);int index = buf.readUnsignedByte();
            __CLR4_5_2ex4ex4lwydwem5.R.inc(19380);position.set(Position.KEY_INDEX, index);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19381);int report = buf.readUnsignedShort();

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19382);buf.readUnsignedShort(); // length

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19383);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19384);Network network = new Network();

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19385);if ((((report != 0x0203)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19386)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19387)==0&false))) {{

                __CLR4_5_2ex4ex4lwydwem5.R.inc(19388);int count = 1;
                __CLR4_5_2ex4ex4lwydwem5.R.inc(19389);if ((((report != 0x0200)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19390)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19391)==0&false))) {{
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19392);count = buf.readUnsignedByte();
                }

                }__CLR4_5_2ex4ex4lwydwem5.R.inc(19393);for (int i = 0; (((i < count)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19394)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19395)==0&false)); i++) {{
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19396);int mcc = buf.readUnsignedShort();
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19397);int mnc = buf.readUnsignedShort();
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19398);int lac = buf.readUnsignedShort();
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19399);int cid = buf.readUnsignedShort();
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19400);if ((((i == 0)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19401)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19402)==0&false))) {{
                        __CLR4_5_2ex4ex4lwydwem5.R.inc(19403);buf.readByte(); // timing advance
                    }
                    }__CLR4_5_2ex4ex4lwydwem5.R.inc(19404);int rssi = buf.readByte();
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19405);network.addCellTower(CellTower.from(mcc, mnc, lac, cid, rssi));
                }

            }}

            }__CLR4_5_2ex4ex4lwydwem5.R.inc(19406);if ((((report == 0x0202 || report == 0x0203)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19407)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19408)==0&false))) {{

                __CLR4_5_2ex4ex4lwydwem5.R.inc(19409);int count = buf.readUnsignedByte();

                __CLR4_5_2ex4ex4lwydwem5.R.inc(19410);for (int i = 0; (((i < count)&&(__CLR4_5_2ex4ex4lwydwem5.R.iget(19411)!=0|true))||(__CLR4_5_2ex4ex4lwydwem5.R.iget(19412)==0&false)); i++) {{
                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19413);buf.readerIndex(buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) 0) + 1); // ssid

                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19414);String mac = String.format("%02x:%02x:%02x:%02x:%02x:%02x",
                            buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte(),
                            buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());

                    __CLR4_5_2ex4ex4lwydwem5.R.inc(19415);network.addWifiAccessPoint(WifiAccessPoint.from(mac, buf.readByte()));
                }

            }}

            }__CLR4_5_2ex4ex4lwydwem5.R.inc(19416);position.setNetwork(network);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19417);sendResponse(channel, remoteAddress, id, index, report);

            __CLR4_5_2ex4ex4lwydwem5.R.inc(19418);return position;

        }

        }__CLR4_5_2ex4ex4lwydwem5.R.inc(19419);return null;
    }finally{__CLR4_5_2ex4ex4lwydwem5.R.flushNeeded();}}

}
