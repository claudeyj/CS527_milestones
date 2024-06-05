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

public class SmokeyProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cz0cz0lx1dzbsc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,16896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SmokeyProtocolDecoder(SmokeyProtocol protocol) {
        super(protocol);__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16813);try{__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16812);
    }finally{__CLR4_5_2cz0cz0lx1dzbsc.R.flushNeeded();}}

    public static final int MSG_DATE_RECORD = 0;
    public static final int MSG_DATE_RECORD_ACK = 1;

    private static void sendResponse(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer id, int index, int report) {try{__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16814);

        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16815);if ((((channel != null)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16816)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16817)==0&false))) {{
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16818);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16819);response.writeBytes("SM".getBytes(StandardCharsets.US_ASCII));
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16820);response.writeByte(3); // protocol version
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16821);response.writeByte(MSG_DATE_RECORD_ACK);
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16822);response.writeBytes(id);
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16823);response.writeInt(Seconds.secondsBetween(
                    new DateTime(2000, 1, 1, 0, 0, DateTimeZone.UTC), new DateTime(DateTimeZone.UTC)).getSeconds());
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16824);response.writeByte(index);
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16825);response.writeByte(report - 0x200);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16826);short checksum = (short) 0xF5A0;
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16827);for (int i = 0; (((i < response.readableBytes())&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16828)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16829)==0&false)); i += 2) {{
                __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16830);checksum ^= ChannelBuffers.swapShort(response.getShort(i));
            }
            }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16831);response.writeShort(checksum);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16832);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_2cz0cz0lx1dzbsc.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16833);

        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16834);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16835);buf.skipBytes(2); // header
        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16836);buf.readUnsignedByte(); // protocol version

        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16837);int type = buf.readUnsignedByte();

        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16838);ChannelBuffer id = buf.readBytes(8);
        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16839);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, ChannelBuffers.hexDump(id));
        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16840);if ((((deviceSession == null)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16841)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16842)==0&false))) {{
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16843);return null;
        }

        }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16844);if ((((type == MSG_DATE_RECORD)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16845)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16846)==0&false))) {{

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16847);buf.readUnsignedShort(); // firmware version

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16848);Position position = new Position();
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16849);position.setProtocol(getProtocolName());
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16850);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16851);int status = buf.readUnsignedShort();
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16852);position.set(Position.KEY_STATUS, status);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16853);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(2000, 1, 1).addSeconds(buf.readUnsignedInt());

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16854);getLastLocation(position, dateBuilder.getDate());

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16855);int index = buf.readUnsignedByte();
            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16856);position.set(Position.KEY_INDEX, index);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16857);int report = buf.readUnsignedShort();

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16858);buf.readUnsignedShort(); // length

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16859);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16860);Network network = new Network();

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16861);if ((((report != 0x0203)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16862)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16863)==0&false))) {{

                __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16864);int count = 1;
                __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16865);if ((((report != 0x0200)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16866)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16867)==0&false))) {{
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16868);count = buf.readUnsignedByte();
                }

                }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16869);for (int i = 0; (((i < count)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16870)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16871)==0&false)); i++) {{
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16872);int mcc = buf.readUnsignedShort();
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16873);int mnc = buf.readUnsignedShort();
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16874);int lac = buf.readUnsignedShort();
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16875);int cid = buf.readUnsignedShort();
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16876);if ((((i == 0)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16877)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16878)==0&false))) {{
                        __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16879);buf.readByte(); // timing advance
                    }
                    }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16880);int rssi = buf.readByte();
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16881);network.addCellTower(CellTower.from(mcc, mnc, lac, cid, rssi));
                }

            }}

            }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16882);if ((((report == 0x0202 || report == 0x0203)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16883)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16884)==0&false))) {{

                __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16885);int count = buf.readUnsignedByte();

                __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16886);for (int i = 0; (((i < count)&&(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16887)!=0|true))||(__CLR4_5_2cz0cz0lx1dzbsc.R.iget(16888)==0&false)); i++) {{
                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16889);buf.readerIndex(buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) 0) + 1); // ssid

                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16890);String mac = String.format("%02x:%02x:%02x:%02x:%02x:%02x",
                            buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte(),
                            buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());

                    __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16891);network.addWifiAccessPoint(WifiAccessPoint.from(mac, buf.readByte()));
                }

            }}

            }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16892);position.setNetwork(network);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16893);sendResponse(channel, remoteAddress, id, index, report);

            __CLR4_5_2cz0cz0lx1dzbsc.R.inc(16894);return position;

        }

        }__CLR4_5_2cz0cz0lx1dzbsc.R.inc(16895);return null;
    }finally{__CLR4_5_2cz0cz0lx1dzbsc.R.flushNeeded();}}

}
