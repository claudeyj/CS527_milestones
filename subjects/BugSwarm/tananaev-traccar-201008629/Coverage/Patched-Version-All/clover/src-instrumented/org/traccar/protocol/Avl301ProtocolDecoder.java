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
import org.traccar.helper.DateBuilder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class Avl301ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_266j66jlx1e1jvg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,8096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Avl301ProtocolDecoder(Avl301Protocol protocol) {
        super(protocol);__CLR4_5_266j66jlx1e1jvg.R.inc(8012);try{__CLR4_5_266j66jlx1e1jvg.R.inc(8011);
    }finally{__CLR4_5_266j66jlx1e1jvg.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_266j66jlx1e1jvg.R.inc(8013);
        __CLR4_5_266j66jlx1e1jvg.R.inc(8014);int b = buf.readUnsignedByte();
        __CLR4_5_266j66jlx1e1jvg.R.inc(8015);StringBuilder imei = new StringBuilder();
        __CLR4_5_266j66jlx1e1jvg.R.inc(8016);imei.append(b & 0x0F);
        __CLR4_5_266j66jlx1e1jvg.R.inc(8017);for (int i = 0; (((i < 7)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8018)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8019)==0&false)); i++) {{
            __CLR4_5_266j66jlx1e1jvg.R.inc(8020);b = buf.readUnsignedByte();
            __CLR4_5_266j66jlx1e1jvg.R.inc(8021);imei.append((b & 0xF0) >> 4);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8022);imei.append(b & 0x0F);
        }
        }__CLR4_5_266j66jlx1e1jvg.R.inc(8023);return imei.toString();
    }finally{__CLR4_5_266j66jlx1e1jvg.R.flushNeeded();}}

    public static final int MSG_LOGIN = 'L';
    public static final int MSG_STATUS = 'H';
    public static final int MSG_GPS_LBS_STATUS = '$';

    private void sendResponse(Channel channel, int type) {try{__CLR4_5_266j66jlx1e1jvg.R.inc(8024);
        __CLR4_5_266j66jlx1e1jvg.R.inc(8025);if ((((channel != null)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8026)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8027)==0&false))) {{
            __CLR4_5_266j66jlx1e1jvg.R.inc(8028);ChannelBuffer response = ChannelBuffers.directBuffer(5);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8029);response.writeByte('$');
            __CLR4_5_266j66jlx1e1jvg.R.inc(8030);response.writeByte(type);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8031);response.writeByte('#');
            __CLR4_5_266j66jlx1e1jvg.R.inc(8032);response.writeByte('\r'); __CLR4_5_266j66jlx1e1jvg.R.inc(8033);response.writeByte('\n');
            __CLR4_5_266j66jlx1e1jvg.R.inc(8034);channel.write(response);
        }
    }}finally{__CLR4_5_266j66jlx1e1jvg.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_266j66jlx1e1jvg.R.inc(8035);

        __CLR4_5_266j66jlx1e1jvg.R.inc(8036);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_266j66jlx1e1jvg.R.inc(8037);buf.skipBytes(1); // header
        __CLR4_5_266j66jlx1e1jvg.R.inc(8038);int type = buf.readUnsignedByte();
        __CLR4_5_266j66jlx1e1jvg.R.inc(8039);buf.readUnsignedByte(); // length

        __CLR4_5_266j66jlx1e1jvg.R.inc(8040);if ((((type == MSG_LOGIN)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8041)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8042)==0&false))) {{

            __CLR4_5_266j66jlx1e1jvg.R.inc(8043);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, readImei(buf));
            __CLR4_5_266j66jlx1e1jvg.R.inc(8044);if ((((deviceSession == null)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8045)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8046)==0&false))) {{
                __CLR4_5_266j66jlx1e1jvg.R.inc(8047);sendResponse(channel, type);
            }

        }} }else {__CLR4_5_266j66jlx1e1jvg.R.inc(8048);if ((((type == MSG_STATUS)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8049)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8050)==0&false))) {{

            __CLR4_5_266j66jlx1e1jvg.R.inc(8051);sendResponse(channel, type);

        } }else {__CLR4_5_266j66jlx1e1jvg.R.inc(8052);if ((((type == MSG_GPS_LBS_STATUS)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8053)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8054)==0&false))) {{

            __CLR4_5_266j66jlx1e1jvg.R.inc(8055);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8056);if ((((deviceSession == null)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8057)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8058)==0&false))) {{
                __CLR4_5_266j66jlx1e1jvg.R.inc(8059);return null;
            }

            }__CLR4_5_266j66jlx1e1jvg.R.inc(8060);Position position = new Position();
            __CLR4_5_266j66jlx1e1jvg.R.inc(8061);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_266j66jlx1e1jvg.R.inc(8062);position.setProtocol(getProtocolName());

            __CLR4_5_266j66jlx1e1jvg.R.inc(8063);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            __CLR4_5_266j66jlx1e1jvg.R.inc(8064);position.setTime(dateBuilder.getDate());

            __CLR4_5_266j66jlx1e1jvg.R.inc(8065);int gpsLength = buf.readUnsignedByte(); // gps len and sat
            __CLR4_5_266j66jlx1e1jvg.R.inc(8066);position.set(Position.KEY_SATELLITES, gpsLength & 0xf);

            __CLR4_5_266j66jlx1e1jvg.R.inc(8067);buf.readUnsignedByte(); // satellites

            __CLR4_5_266j66jlx1e1jvg.R.inc(8068);double latitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_266j66jlx1e1jvg.R.inc(8069);double longitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_266j66jlx1e1jvg.R.inc(8070);position.setSpeed(buf.readUnsignedByte());

            __CLR4_5_266j66jlx1e1jvg.R.inc(8071);int union = buf.readUnsignedShort(); // course and flags
            __CLR4_5_266j66jlx1e1jvg.R.inc(8072);position.setCourse(union & 0x03FF);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8073);position.setValid((union & 0x1000) != 0);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8074);if (((((union & 0x0400) != 0)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8075)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8076)==0&false))) {{
                __CLR4_5_266j66jlx1e1jvg.R.inc(8077);latitude = -latitude;
            }
            }__CLR4_5_266j66jlx1e1jvg.R.inc(8078);if (((((union & 0x0800) != 0)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8079)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8080)==0&false))) {{
                __CLR4_5_266j66jlx1e1jvg.R.inc(8081);longitude = -longitude;
            }

            }__CLR4_5_266j66jlx1e1jvg.R.inc(8082);position.setLatitude(latitude);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8083);position.setLongitude(longitude);

            __CLR4_5_266j66jlx1e1jvg.R.inc(8084);if (((((union & 0x4000) != 0)&&(__CLR4_5_266j66jlx1e1jvg.R.iget(8085)!=0|true))||(__CLR4_5_266j66jlx1e1jvg.R.iget(8086)==0&false))) {{
                __CLR4_5_266j66jlx1e1jvg.R.inc(8087);position.set("acc", (union & 0x8000) != 0);
            }

            }__CLR4_5_266j66jlx1e1jvg.R.inc(8088);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedMedium())));

            __CLR4_5_266j66jlx1e1jvg.R.inc(8089);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            __CLR4_5_266j66jlx1e1jvg.R.inc(8090);int flags = buf.readUnsignedByte();
            __CLR4_5_266j66jlx1e1jvg.R.inc(8091);position.set("acc", (flags & 0x2) != 0);

            // parse other flags

            __CLR4_5_266j66jlx1e1jvg.R.inc(8092);position.set(Position.KEY_POWER, buf.readUnsignedByte());
            __CLR4_5_266j66jlx1e1jvg.R.inc(8093);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

            __CLR4_5_266j66jlx1e1jvg.R.inc(8094);return position;
        }

        }}}__CLR4_5_266j66jlx1e1jvg.R.inc(8095);return null;
    }finally{__CLR4_5_266j66jlx1e1jvg.R.flushNeeded();}}

}
