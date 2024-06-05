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

public class Avl301ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26zt6ztlwye3yr1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,9150,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Avl301ProtocolDecoder(Avl301Protocol protocol) {
        super(protocol);__CLR4_5_26zt6ztlwye3yr1.R.inc(9066);try{__CLR4_5_26zt6ztlwye3yr1.R.inc(9065);
    }finally{__CLR4_5_26zt6ztlwye3yr1.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_26zt6ztlwye3yr1.R.inc(9067);
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9068);int b = buf.readUnsignedByte();
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9069);StringBuilder imei = new StringBuilder();
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9070);imei.append(b & 0x0F);
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9071);for (int i = 0; (((i < 7)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9072)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9073)==0&false)); i++) {{
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9074);b = buf.readUnsignedByte();
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9075);imei.append((b & 0xF0) >> 4);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9076);imei.append(b & 0x0F);
        }
        }__CLR4_5_26zt6ztlwye3yr1.R.inc(9077);return imei.toString();
    }finally{__CLR4_5_26zt6ztlwye3yr1.R.flushNeeded();}}

    public static final int MSG_LOGIN = 'L';
    public static final int MSG_STATUS = 'H';
    public static final int MSG_GPS_LBS_STATUS = '$';

    private void sendResponse(Channel channel, int type) {try{__CLR4_5_26zt6ztlwye3yr1.R.inc(9078);
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9079);if ((((channel != null)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9080)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9081)==0&false))) {{
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9082);ChannelBuffer response = ChannelBuffers.directBuffer(5);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9083);response.writeByte('$');
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9084);response.writeByte(type);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9085);response.writeByte('#');
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9086);response.writeByte('\r'); __CLR4_5_26zt6ztlwye3yr1.R.inc(9087);response.writeByte('\n');
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9088);channel.write(response);
        }
    }}finally{__CLR4_5_26zt6ztlwye3yr1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26zt6ztlwye3yr1.R.inc(9089);

        __CLR4_5_26zt6ztlwye3yr1.R.inc(9090);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26zt6ztlwye3yr1.R.inc(9091);buf.skipBytes(1); // header
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9092);int type = buf.readUnsignedByte();
        __CLR4_5_26zt6ztlwye3yr1.R.inc(9093);buf.readUnsignedByte(); // length

        __CLR4_5_26zt6ztlwye3yr1.R.inc(9094);if ((((type == MSG_LOGIN)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9095)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9096)==0&false))) {{

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9097);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, readImei(buf));
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9098);if ((((deviceSession == null)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9099)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9100)==0&false))) {{
                __CLR4_5_26zt6ztlwye3yr1.R.inc(9101);sendResponse(channel, type);
            }

        }} }else {__CLR4_5_26zt6ztlwye3yr1.R.inc(9102);if ((((type == MSG_STATUS)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9103)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9104)==0&false))) {{

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9105);sendResponse(channel, type);

        } }else {__CLR4_5_26zt6ztlwye3yr1.R.inc(9106);if ((((type == MSG_GPS_LBS_STATUS)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9107)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9108)==0&false))) {{

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9109);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9110);if ((((deviceSession == null)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9111)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9112)==0&false))) {{
                __CLR4_5_26zt6ztlwye3yr1.R.inc(9113);return null;
            }

            }__CLR4_5_26zt6ztlwye3yr1.R.inc(9114);Position position = new Position();
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9115);position.setDeviceId(deviceSession.getDeviceId());
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9116);position.setProtocol(getProtocolName());

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9117);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9118);position.setTime(dateBuilder.getDate());

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9119);int gpsLength = buf.readUnsignedByte(); // gps len and sat
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9120);position.set(Position.KEY_SATELLITES, gpsLength & 0xf);

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9121);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedByte()); // satellites

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9122);double latitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9123);double longitude = buf.readUnsignedInt() / 600000.0;
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9124);position.setSpeed(buf.readUnsignedByte());

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9125);int union = buf.readUnsignedShort(); // course and flags
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9126);position.setCourse(union & 0x03FF);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9127);position.setValid((union & 0x1000) != 0);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9128);if (((((union & 0x0400) != 0)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9129)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9130)==0&false))) {{
                __CLR4_5_26zt6ztlwye3yr1.R.inc(9131);latitude = -latitude;
            }
            }__CLR4_5_26zt6ztlwye3yr1.R.inc(9132);if (((((union & 0x0800) != 0)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9133)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9134)==0&false))) {{
                __CLR4_5_26zt6ztlwye3yr1.R.inc(9135);longitude = -longitude;
            }

            }__CLR4_5_26zt6ztlwye3yr1.R.inc(9136);position.setLatitude(latitude);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9137);position.setLongitude(longitude);

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9138);if (((((union & 0x4000) != 0)&&(__CLR4_5_26zt6ztlwye3yr1.R.iget(9139)!=0|true))||(__CLR4_5_26zt6ztlwye3yr1.R.iget(9140)==0&false))) {{
                __CLR4_5_26zt6ztlwye3yr1.R.inc(9141);position.set("acc", (union & 0x8000) != 0);
            }

            }__CLR4_5_26zt6ztlwye3yr1.R.inc(9142);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedMedium())));

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9143);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9144);int flags = buf.readUnsignedByte();
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9145);position.set("acc", (flags & 0x2) != 0);

            // parse other flags

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9146);position.set(Position.KEY_POWER, buf.readUnsignedByte());
            __CLR4_5_26zt6ztlwye3yr1.R.inc(9147);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

            __CLR4_5_26zt6ztlwye3yr1.R.inc(9148);return position;
        }

        }}}__CLR4_5_26zt6ztlwye3yr1.R.inc(9149);return null;
    }finally{__CLR4_5_26zt6ztlwye3yr1.R.flushNeeded();}}

}
