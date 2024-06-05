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
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class AstraProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25ol5ollx1e1jpp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,7426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AstraProtocolDecoder(AstraProtocol protocol) {
        super(protocol);__CLR4_5_25ol5ollx1e1jpp.R.inc(7366);try{__CLR4_5_25ol5ollx1e1jpp.R.inc(7365);
    }finally{__CLR4_5_25ol5ollx1e1jpp.R.flushNeeded();}}

    public static final int MSG_HEARTBEAT = 0x1A;
    public static final int MSG_DATA = 0x10;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25ol5ollx1e1jpp.R.inc(7367);

        __CLR4_5_25ol5ollx1e1jpp.R.inc(7368);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25ol5ollx1e1jpp.R.inc(7369);if ((((channel != null)&&(__CLR4_5_25ol5ollx1e1jpp.R.iget(7370)!=0|true))||(__CLR4_5_25ol5ollx1e1jpp.R.iget(7371)==0&false))) {{
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7372);channel.write(ChannelBuffers.wrappedBuffer(new byte[] {0x06}), remoteAddress);
        }

        }__CLR4_5_25ol5ollx1e1jpp.R.inc(7373);buf.readUnsignedByte(); // protocol
        __CLR4_5_25ol5ollx1e1jpp.R.inc(7374);buf.readUnsignedShort(); // length

        __CLR4_5_25ol5ollx1e1jpp.R.inc(7375);String imei = String.format("%08d", buf.readUnsignedInt()) + String.format("%07d", buf.readUnsignedMedium());
        __CLR4_5_25ol5ollx1e1jpp.R.inc(7376);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_25ol5ollx1e1jpp.R.inc(7377);if ((((deviceSession == null)&&(__CLR4_5_25ol5ollx1e1jpp.R.iget(7378)!=0|true))||(__CLR4_5_25ol5ollx1e1jpp.R.iget(7379)==0&false))) {{
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7380);return null;
        }

        }__CLR4_5_25ol5ollx1e1jpp.R.inc(7381);List<Position> positions = new LinkedList<>();

        __CLR4_5_25ol5ollx1e1jpp.R.inc(7382);while ((((buf.readableBytes() > 2)&&(__CLR4_5_25ol5ollx1e1jpp.R.iget(7383)!=0|true))||(__CLR4_5_25ol5ollx1e1jpp.R.iget(7384)==0&false))) {{

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7385);Position position = new Position();
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7386);position.setProtocol(getProtocolName());
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7387);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7388);buf.readUnsignedByte(); // index

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7389);position.setValid(true);
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7390);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7391);position.setLongitude(buf.readInt() * 0.000001);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7392);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(1980, 1, 6).addMillis(buf.readUnsignedInt() * 1000L);
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7393);position.setTime(dateBuilder.getDate());

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7394);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte() * 2));
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7395);position.setCourse(buf.readUnsignedByte() * 2);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7396);int reason = buf.readUnsignedMedium();
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7397);position.set(Position.KEY_EVENT, reason);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7398);int status = buf.readUnsignedShort();
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7399);position.set(Position.KEY_STATUS, status);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7400);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7401);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedByte());
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7402);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7403);position.set(Position.KEY_POWER, buf.readUnsignedByte());

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7404);buf.readUnsignedByte(); // max journey speed
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7405);buf.skipBytes(6); // accelerometer
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7406);buf.readUnsignedShort(); // journey distance
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7407);buf.readUnsignedShort(); // journey idle time

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7408);position.setAltitude(buf.readUnsignedByte() * 20);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7409);int quality = buf.readUnsignedByte();
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7410);position.set(Position.KEY_SATELLITES, quality & 0xf);
            __CLR4_5_25ol5ollx1e1jpp.R.inc(7411);position.set(Position.KEY_RSSI, quality >> 4);

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7412);buf.readUnsignedByte(); // geofence events

            __CLR4_5_25ol5ollx1e1jpp.R.inc(7413);if ((((BitUtil.check(status, 8))&&(__CLR4_5_25ol5ollx1e1jpp.R.iget(7414)!=0|true))||(__CLR4_5_25ol5ollx1e1jpp.R.iget(7415)==0&false))) {{

                __CLR4_5_25ol5ollx1e1jpp.R.inc(7416);position.set(Position.KEY_RFID, buf.readBytes(7).toString(StandardCharsets.US_ASCII));
                __CLR4_5_25ol5ollx1e1jpp.R.inc(7417);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium() * 1000);

                __CLR4_5_25ol5ollx1e1jpp.R.inc(7418);buf.readUnsignedShort(); // engine time

            }

            }__CLR4_5_25ol5ollx1e1jpp.R.inc(7419);if ((((BitUtil.check(status, 6))&&(__CLR4_5_25ol5ollx1e1jpp.R.iget(7420)!=0|true))||(__CLR4_5_25ol5ollx1e1jpp.R.iget(7421)==0&false))) {{
                __CLR4_5_25ol5ollx1e1jpp.R.inc(7422);Log.warning("Extension data is not supported");
                __CLR4_5_25ol5ollx1e1jpp.R.inc(7423);return position;
            }

            }__CLR4_5_25ol5ollx1e1jpp.R.inc(7424);positions.add(position);

        }

        }__CLR4_5_25ol5ollx1e1jpp.R.inc(7425);return positions;
    }finally{__CLR4_5_25ol5ollx1e1jpp.R.flushNeeded();}}

}
