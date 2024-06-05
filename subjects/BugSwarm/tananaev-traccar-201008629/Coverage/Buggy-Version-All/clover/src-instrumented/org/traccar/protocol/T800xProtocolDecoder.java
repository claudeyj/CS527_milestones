/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BcdUtil;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;

@java.lang.SuppressWarnings({"fallthrough"}) public class T800xProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ddiddilx1dxpra{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,17434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T800xProtocolDecoder(T800xProtocol protocol) {
        super(protocol);__CLR4_5_2ddiddilx1dxpra.R.inc(17335);try{__CLR4_5_2ddiddilx1dxpra.R.inc(17334);
    }finally{__CLR4_5_2ddiddilx1dxpra.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x01;
    public static final int MSG_GPS = 0x02;
    public static final int MSG_HEARTBEAT = 0x03;
    public static final int MSG_ALARM = 0x04;
    public static final int MSG_COMMAND = 0x81;

    private static float readSwappedFloat(ChannelBuffer buf) {try{__CLR4_5_2ddiddilx1dxpra.R.inc(17336);
        __CLR4_5_2ddiddilx1dxpra.R.inc(17337);byte[] bytes = new byte[4];
        __CLR4_5_2ddiddilx1dxpra.R.inc(17338);buf.readBytes(bytes);
        __CLR4_5_2ddiddilx1dxpra.R.inc(17339);return ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, bytes).readFloat();
    }finally{__CLR4_5_2ddiddilx1dxpra.R.flushNeeded();}}

    private void sendResponse(Channel channel, int type, ChannelBuffer imei) {try{__CLR4_5_2ddiddilx1dxpra.R.inc(17340);
        __CLR4_5_2ddiddilx1dxpra.R.inc(17341);if ((((channel != null)&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17342)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17343)==0&false))) {{
            __CLR4_5_2ddiddilx1dxpra.R.inc(17344);ChannelBuffer response = ChannelBuffers.directBuffer(15);
            __CLR4_5_2ddiddilx1dxpra.R.inc(17345);response.writeByte(0x23);
            __CLR4_5_2ddiddilx1dxpra.R.inc(17346);response.writeByte(0x23); // header
            __CLR4_5_2ddiddilx1dxpra.R.inc(17347);response.writeByte(type);
            __CLR4_5_2ddiddilx1dxpra.R.inc(17348);response.writeShort(response.capacity()); // length
            __CLR4_5_2ddiddilx1dxpra.R.inc(17349);response.writeShort(0x0001); // index
            __CLR4_5_2ddiddilx1dxpra.R.inc(17350);response.writeBytes(imei);
            __CLR4_5_2ddiddilx1dxpra.R.inc(17351);channel.write(response);
        }
    }}finally{__CLR4_5_2ddiddilx1dxpra.R.flushNeeded();}}

    private String decodeAlarm(short value) {try{__CLR4_5_2ddiddilx1dxpra.R.inc(17352);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ddiddilx1dxpra.R.inc(17353);switch (value) {
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17354);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17355);return Position.ALARM_SOS;
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17356);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17357);return Position.ALARM_OVERSPEED;
            case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17358);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17359);return Position.ALARM_GEOFENCE_ENTER;
            case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17360);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17361);return Position.ALARM_GEOFENCE_EXIT;
            case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17362);__CLB4_5_2_bool0=true;}
            case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17363);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17364);return Position.ALARM_VIBRATION;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ddiddilx1dxpra.R.inc(17365);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ddiddilx1dxpra.R.inc(17366);break;
        }
        __CLR4_5_2ddiddilx1dxpra.R.inc(17367);return null;
    }finally{__CLR4_5_2ddiddilx1dxpra.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ddiddilx1dxpra.R.inc(17368);

        __CLR4_5_2ddiddilx1dxpra.R.inc(17369);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2ddiddilx1dxpra.R.inc(17370);buf.skipBytes(2);
        __CLR4_5_2ddiddilx1dxpra.R.inc(17371);int type = buf.readUnsignedByte();
        __CLR4_5_2ddiddilx1dxpra.R.inc(17372);buf.readUnsignedShort(); // length
        __CLR4_5_2ddiddilx1dxpra.R.inc(17373);int index = buf.readUnsignedShort();
        __CLR4_5_2ddiddilx1dxpra.R.inc(17374);ChannelBuffer imei = buf.readBytes(8);

        __CLR4_5_2ddiddilx1dxpra.R.inc(17375);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, ChannelBuffers.hexDump(imei).substring(1));
        __CLR4_5_2ddiddilx1dxpra.R.inc(17376);if ((((deviceSession == null)&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17377)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17378)==0&false))) {{
            __CLR4_5_2ddiddilx1dxpra.R.inc(17379);return null;
        }

        }__CLR4_5_2ddiddilx1dxpra.R.inc(17380);if ((((type == MSG_LOGIN || type == MSG_ALARM || type == MSG_HEARTBEAT)&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17381)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17382)==0&false))) {{
            __CLR4_5_2ddiddilx1dxpra.R.inc(17383);sendResponse(channel, type, imei);
        }

        }__CLR4_5_2ddiddilx1dxpra.R.inc(17384);if ((((type == MSG_GPS || type == MSG_ALARM)&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17385)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17386)==0&false))) {{

            __CLR4_5_2ddiddilx1dxpra.R.inc(17387);Position position = new Position();
            __CLR4_5_2ddiddilx1dxpra.R.inc(17388);position.setProtocol(getProtocolName());
            __CLR4_5_2ddiddilx1dxpra.R.inc(17389);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2ddiddilx1dxpra.R.inc(17390);position.set(Position.KEY_INDEX, index);

            __CLR4_5_2ddiddilx1dxpra.R.inc(17391);buf.readUnsignedShort(); // acc on interval
            __CLR4_5_2ddiddilx1dxpra.R.inc(17392);buf.readUnsignedShort(); // acc off interval
            __CLR4_5_2ddiddilx1dxpra.R.inc(17393);buf.readUnsignedByte(); // angle compensation
            __CLR4_5_2ddiddilx1dxpra.R.inc(17394);buf.readUnsignedShort(); // distance compensation
            __CLR4_5_2ddiddilx1dxpra.R.inc(17395);buf.readUnsignedShort(); // speed alarm

            __CLR4_5_2ddiddilx1dxpra.R.inc(17396);int locationStatus = buf.readUnsignedByte();

            __CLR4_5_2ddiddilx1dxpra.R.inc(17397);buf.readUnsignedByte(); // gsensor manager status
            __CLR4_5_2ddiddilx1dxpra.R.inc(17398);buf.readUnsignedByte(); // other flags
            __CLR4_5_2ddiddilx1dxpra.R.inc(17399);buf.readUnsignedByte(); // heartbeat
            __CLR4_5_2ddiddilx1dxpra.R.inc(17400);buf.readUnsignedByte(); // relay status
            __CLR4_5_2ddiddilx1dxpra.R.inc(17401);buf.readUnsignedShort(); // drag alarm setting

            __CLR4_5_2ddiddilx1dxpra.R.inc(17402);int io = buf.readUnsignedShort();
            __CLR4_5_2ddiddilx1dxpra.R.inc(17403);position.set(Position.KEY_IGNITION, BitUtil.check(io, 14));
            __CLR4_5_2ddiddilx1dxpra.R.inc(17404);position.set("ac", BitUtil.check(io, 13));

            __CLR4_5_2ddiddilx1dxpra.R.inc(17405);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2ddiddilx1dxpra.R.inc(17406);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());

            __CLR4_5_2ddiddilx1dxpra.R.inc(17407);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedByte()));

            __CLR4_5_2ddiddilx1dxpra.R.inc(17408);buf.readUnsignedByte(); // reserved

            __CLR4_5_2ddiddilx1dxpra.R.inc(17409);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_2ddiddilx1dxpra.R.inc(17410);int battery = BcdUtil.readInteger(buf, 2);
            __CLR4_5_2ddiddilx1dxpra.R.inc(17411);if ((((battery == 0)&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17412)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17413)==0&false))) {{
                __CLR4_5_2ddiddilx1dxpra.R.inc(17414);battery = 100;
            }
            }__CLR4_5_2ddiddilx1dxpra.R.inc(17415);position.set(Position.KEY_BATTERY, battery);

            __CLR4_5_2ddiddilx1dxpra.R.inc(17416);DateBuilder dateBuilder = new DateBuilder()
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));

            __CLR4_5_2ddiddilx1dxpra.R.inc(17417);if ((((BitUtil.check(locationStatus, 6))&&(__CLR4_5_2ddiddilx1dxpra.R.iget(17418)!=0|true))||(__CLR4_5_2ddiddilx1dxpra.R.iget(17419)==0&false))) {{

                __CLR4_5_2ddiddilx1dxpra.R.inc(17420);position.setValid(!BitUtil.check(locationStatus, 7));
                __CLR4_5_2ddiddilx1dxpra.R.inc(17421);position.setTime(dateBuilder.getDate());
                __CLR4_5_2ddiddilx1dxpra.R.inc(17422);position.setAltitude(readSwappedFloat(buf));
                __CLR4_5_2ddiddilx1dxpra.R.inc(17423);position.setLongitude(readSwappedFloat(buf));
                __CLR4_5_2ddiddilx1dxpra.R.inc(17424);position.setLatitude(readSwappedFloat(buf));
                __CLR4_5_2ddiddilx1dxpra.R.inc(17425);position.setSpeed(UnitsConverter.knotsFromKph(
                        BcdUtil.readInteger(buf, 4) * 0.1));
                __CLR4_5_2ddiddilx1dxpra.R.inc(17426);position.setCourse(buf.readUnsignedShort());

            } }else {{

                __CLR4_5_2ddiddilx1dxpra.R.inc(17427);getLastLocation(position, dateBuilder.getDate());

                __CLR4_5_2ddiddilx1dxpra.R.inc(17428);byte[] array = new byte[16];
                __CLR4_5_2ddiddilx1dxpra.R.inc(17429);buf.readBytes(array);
                __CLR4_5_2ddiddilx1dxpra.R.inc(17430);ChannelBuffer swapped = ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, array);

                __CLR4_5_2ddiddilx1dxpra.R.inc(17431);position.setNetwork(new Network(CellTower.from(
                        swapped.readUnsignedShort(), swapped.readUnsignedShort(),
                        swapped.readUnsignedShort(), swapped.readUnsignedShort())));

                // two more cell towers

            }

            }__CLR4_5_2ddiddilx1dxpra.R.inc(17432);return position;

        }

        }__CLR4_5_2ddiddilx1dxpra.R.inc(17433);return null;
    }finally{__CLR4_5_2ddiddilx1dxpra.R.flushNeeded();}}

}
