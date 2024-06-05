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

public class AstraProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26fl6fllwydzlzj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,8398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AstraProtocolDecoder(AstraProtocol protocol) {
        super(protocol);__CLR4_5_26fl6fllwydzlzj.R.inc(8338);try{__CLR4_5_26fl6fllwydzlzj.R.inc(8337);
    }finally{__CLR4_5_26fl6fllwydzlzj.R.flushNeeded();}}

    public static final int MSG_HEARTBEAT = 0x1A;
    public static final int MSG_DATA = 0x10;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26fl6fllwydzlzj.R.inc(8339);

        __CLR4_5_26fl6fllwydzlzj.R.inc(8340);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26fl6fllwydzlzj.R.inc(8341);if ((((channel != null)&&(__CLR4_5_26fl6fllwydzlzj.R.iget(8342)!=0|true))||(__CLR4_5_26fl6fllwydzlzj.R.iget(8343)==0&false))) {{
            __CLR4_5_26fl6fllwydzlzj.R.inc(8344);channel.write(ChannelBuffers.wrappedBuffer(new byte[] {0x06}), remoteAddress);
        }

        }__CLR4_5_26fl6fllwydzlzj.R.inc(8345);buf.readUnsignedByte(); // protocol
        __CLR4_5_26fl6fllwydzlzj.R.inc(8346);buf.readUnsignedShort(); // length

        __CLR4_5_26fl6fllwydzlzj.R.inc(8347);String imei = String.format("%08d", buf.readUnsignedInt()) + String.format("%07d", buf.readUnsignedMedium());
        __CLR4_5_26fl6fllwydzlzj.R.inc(8348);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_26fl6fllwydzlzj.R.inc(8349);if ((((deviceSession == null)&&(__CLR4_5_26fl6fllwydzlzj.R.iget(8350)!=0|true))||(__CLR4_5_26fl6fllwydzlzj.R.iget(8351)==0&false))) {{
            __CLR4_5_26fl6fllwydzlzj.R.inc(8352);return null;
        }

        }__CLR4_5_26fl6fllwydzlzj.R.inc(8353);List<Position> positions = new LinkedList<>();

        __CLR4_5_26fl6fllwydzlzj.R.inc(8354);while ((((buf.readableBytes() > 2)&&(__CLR4_5_26fl6fllwydzlzj.R.iget(8355)!=0|true))||(__CLR4_5_26fl6fllwydzlzj.R.iget(8356)==0&false))) {{

            __CLR4_5_26fl6fllwydzlzj.R.inc(8357);Position position = new Position();
            __CLR4_5_26fl6fllwydzlzj.R.inc(8358);position.setProtocol(getProtocolName());
            __CLR4_5_26fl6fllwydzlzj.R.inc(8359);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_26fl6fllwydzlzj.R.inc(8360);buf.readUnsignedByte(); // index

            __CLR4_5_26fl6fllwydzlzj.R.inc(8361);position.setValid(true);
            __CLR4_5_26fl6fllwydzlzj.R.inc(8362);position.setLatitude(buf.readInt() * 0.000001);
            __CLR4_5_26fl6fllwydzlzj.R.inc(8363);position.setLongitude(buf.readInt() * 0.000001);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8364);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(1980, 1, 6).addMillis(buf.readUnsignedInt() * 1000L);
            __CLR4_5_26fl6fllwydzlzj.R.inc(8365);position.setTime(dateBuilder.getDate());

            __CLR4_5_26fl6fllwydzlzj.R.inc(8366);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte() * 2));
            __CLR4_5_26fl6fllwydzlzj.R.inc(8367);position.setCourse(buf.readUnsignedByte() * 2);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8368);int reason = buf.readUnsignedMedium();
            __CLR4_5_26fl6fllwydzlzj.R.inc(8369);position.set(Position.KEY_EVENT, reason);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8370);int status = buf.readUnsignedShort();
            __CLR4_5_26fl6fllwydzlzj.R.inc(8371);position.set(Position.KEY_STATUS, status);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8372);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());
            __CLR4_5_26fl6fllwydzlzj.R.inc(8373);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedByte());
            __CLR4_5_26fl6fllwydzlzj.R.inc(8374);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
            __CLR4_5_26fl6fllwydzlzj.R.inc(8375);position.set(Position.KEY_POWER, buf.readUnsignedByte());

            __CLR4_5_26fl6fllwydzlzj.R.inc(8376);buf.readUnsignedByte(); // max journey speed
            __CLR4_5_26fl6fllwydzlzj.R.inc(8377);buf.skipBytes(6); // accelerometer
            __CLR4_5_26fl6fllwydzlzj.R.inc(8378);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedShort());
            __CLR4_5_26fl6fllwydzlzj.R.inc(8379);buf.readUnsignedShort(); // journey idle time

            __CLR4_5_26fl6fllwydzlzj.R.inc(8380);position.setAltitude(buf.readUnsignedByte() * 20);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8381);int quality = buf.readUnsignedByte();
            __CLR4_5_26fl6fllwydzlzj.R.inc(8382);position.set(Position.KEY_SATELLITES, quality & 0xf);
            __CLR4_5_26fl6fllwydzlzj.R.inc(8383);position.set(Position.KEY_RSSI, quality >> 4);

            __CLR4_5_26fl6fllwydzlzj.R.inc(8384);buf.readUnsignedByte(); // geofence events

            __CLR4_5_26fl6fllwydzlzj.R.inc(8385);if ((((BitUtil.check(status, 8))&&(__CLR4_5_26fl6fllwydzlzj.R.iget(8386)!=0|true))||(__CLR4_5_26fl6fllwydzlzj.R.iget(8387)==0&false))) {{
                __CLR4_5_26fl6fllwydzlzj.R.inc(8388);position.set(Position.KEY_DRIVER_UNIQUE_ID, buf.readBytes(7).toString(StandardCharsets.US_ASCII));
                __CLR4_5_26fl6fllwydzlzj.R.inc(8389);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium() * 1000);
                __CLR4_5_26fl6fllwydzlzj.R.inc(8390);position.set(Position.KEY_HOURS, buf.readUnsignedShort());
            }

            }__CLR4_5_26fl6fllwydzlzj.R.inc(8391);if ((((BitUtil.check(status, 6))&&(__CLR4_5_26fl6fllwydzlzj.R.iget(8392)!=0|true))||(__CLR4_5_26fl6fllwydzlzj.R.iget(8393)==0&false))) {{
                __CLR4_5_26fl6fllwydzlzj.R.inc(8394);Log.warning("Extension data is not supported");
                __CLR4_5_26fl6fllwydzlzj.R.inc(8395);return position;
            }

            }__CLR4_5_26fl6fllwydzlzj.R.inc(8396);positions.add(position);

        }

        }__CLR4_5_26fl6fllwydzlzj.R.inc(8397);return positions;
    }finally{__CLR4_5_26fl6fllwydzlzj.R.flushNeeded();}}

}
