/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@java.lang.SuppressWarnings({"fallthrough"}) public class NoranProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bs1bs1lx1e0hwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,15360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NoranProtocolDecoder(NoranProtocol protocol) {
        super(protocol);__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15266);try{__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15265);
    }finally{__CLR4_5_2bs1bs1lx1e0hwm.R.flushNeeded();}}

    public static final int MSG_UPLOAD_POSITION = 0x0008;
    public static final int MSG_UPLOAD_POSITION_NEW = 0x0032;
    public static final int MSG_CONTROL = 0x0002;
    public static final int MSG_CONTROL_RESPONSE = 0x8009;
    public static final int MSG_ALARM = 0x0003;
    public static final int MSG_SHAKE_HAND = 0x0000;
    public static final int MSG_SHAKE_HAND_RESPONSE = 0x8000;
    public static final int MSG_IMAGE_SIZE = 0x0200;
    public static final int MSG_IMAGE_PACKET = 0x0201;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15267);

        __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15268);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15269);buf.readUnsignedShort(); // length
        __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15270);int type = buf.readUnsignedShort();

        __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15271);if ((((type == MSG_SHAKE_HAND && channel != null)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15272)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15273)==0&false))) {{

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15274);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 13);
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15275);response.writeBytes(
                    ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n*KW", StandardCharsets.US_ASCII));
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15276);response.writeByte(0);
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15277);response.writeShort(response.capacity());
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15278);response.writeShort(MSG_SHAKE_HAND_RESPONSE);
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15279);response.writeByte(1); // status
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15280);response.writeBytes(
                    ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n", StandardCharsets.US_ASCII));

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15281);channel.write(response, remoteAddress);

        } }else {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15282);if ((((type == MSG_UPLOAD_POSITION || type == MSG_UPLOAD_POSITION_NEW
                || type == MSG_CONTROL_RESPONSE || type == MSG_ALARM)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15283)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15284)==0&false))) {{

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15285);boolean newFormat = false;
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15286);if ((((type == MSG_UPLOAD_POSITION && buf.readableBytes() == 48
                    || type == MSG_ALARM && buf.readableBytes() == 48
                    || type == MSG_CONTROL_RESPONSE && buf.readableBytes() == 57)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15287)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15288)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15289);newFormat = true;
            }

            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15290);Position position = new Position();
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15291);position.setProtocol(getProtocolName());

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15292);if ((((type == MSG_CONTROL_RESPONSE)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15293)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15294)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15295);buf.readUnsignedInt(); // GIS ip
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15296);buf.readUnsignedInt(); // GIS port
            }

            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15297);position.setValid(BitUtil.check(buf.readUnsignedByte(), 0));

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15298);short alarm = buf.readUnsignedByte();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15299);switch (alarm) {
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15300);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15301);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15302);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15303);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15304);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15305);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15306);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15307);position.set(Position.KEY_ALARM, Position.ALARM_GEOFENCE_EXIT);
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15308);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15309);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15310);position.set(Position.KEY_ALARM, Position.ALARM_POWER_OFF);
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15311);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15312);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15313);break;
            }

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15314);if ((((newFormat)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15315)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15316)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15317);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedInt()));
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15318);position.setCourse(buf.readFloat());
            } }else {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15319);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15320);position.setCourse(buf.readUnsignedShort());
            }
            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15321);position.setLongitude(buf.readFloat());
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15322);position.setLatitude(buf.readFloat());

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15323);if ((((!newFormat)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15324)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15325)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15326);long timeValue = buf.readUnsignedInt();
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15327);DateBuilder dateBuilder = new DateBuilder()
                        .setYear((int) BitUtil.from(timeValue, 26))
                        .setMonth((int) BitUtil.between(timeValue, 22, 26))
                        .setDay((int) BitUtil.between(timeValue, 17, 22))
                        .setHour((int) BitUtil.between(timeValue, 12, 17))
                        .setMinute((int) BitUtil.between(timeValue, 6, 12))
                        .setSecond((int) BitUtil.to(timeValue, 6));
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15328);position.setTime(dateBuilder.getDate());
            }

            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15329);ChannelBuffer rawId;
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15330);if ((((newFormat)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15331)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15332)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15333);rawId = buf.readBytes(12);
            } }else {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15334);rawId = buf.readBytes(11);
            }
            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15335);String id = rawId.toString(StandardCharsets.US_ASCII).replaceAll("[^\\p{Print}]", "");
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15336);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15337);if ((((deviceSession == null)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15338)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15339)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15340);return null;
            }
            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15341);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15342);if ((((newFormat)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15343)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15344)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15345);DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15346);position.setTime(dateFormat.parse(buf.readBytes(17).toString(StandardCharsets.US_ASCII)));
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15347);buf.readByte();
            }

            }__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15348);if ((((!newFormat)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15349)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15350)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15351);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15352);position.set(Position.KEY_FUEL, buf.readUnsignedByte());
            } }else {__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15353);if ((((type == MSG_UPLOAD_POSITION_NEW)&&(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15354)!=0|true))||(__CLR4_5_2bs1bs1lx1e0hwm.R.iget(15355)==0&false))) {{
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15356);position.set(Position.PREFIX_TEMP + 1, buf.readShort());
                __CLR4_5_2bs1bs1lx1e0hwm.R.inc(15357);position.set(Position.KEY_ODOMETER, buf.readFloat());
            }

            }}__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15358);return position;
        }

        }}__CLR4_5_2bs1bs1lx1e0hwm.R.inc(15359);return null;
    }finally{__CLR4_5_2bs1bs1lx1e0hwm.R.flushNeeded();}}

}
