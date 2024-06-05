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

@java.lang.SuppressWarnings({"fallthrough"}) public class NoranProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dlcdlclwye66hb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,17711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NoranProtocolDecoder(NoranProtocol protocol) {
        super(protocol);__CLR4_5_2dlcdlclwye66hb.R.inc(17617);try{__CLR4_5_2dlcdlclwye66hb.R.inc(17616);
    }finally{__CLR4_5_2dlcdlclwye66hb.R.flushNeeded();}}

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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dlcdlclwye66hb.R.inc(17618);

        __CLR4_5_2dlcdlclwye66hb.R.inc(17619);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dlcdlclwye66hb.R.inc(17620);buf.readUnsignedShort(); // length
        __CLR4_5_2dlcdlclwye66hb.R.inc(17621);int type = buf.readUnsignedShort();

        __CLR4_5_2dlcdlclwye66hb.R.inc(17622);if ((((type == MSG_SHAKE_HAND && channel != null)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17623)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17624)==0&false))) {{

            __CLR4_5_2dlcdlclwye66hb.R.inc(17625);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 13);
            __CLR4_5_2dlcdlclwye66hb.R.inc(17626);response.writeBytes(
                    ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n*KW", StandardCharsets.US_ASCII));
            __CLR4_5_2dlcdlclwye66hb.R.inc(17627);response.writeByte(0);
            __CLR4_5_2dlcdlclwye66hb.R.inc(17628);response.writeShort(response.capacity());
            __CLR4_5_2dlcdlclwye66hb.R.inc(17629);response.writeShort(MSG_SHAKE_HAND_RESPONSE);
            __CLR4_5_2dlcdlclwye66hb.R.inc(17630);response.writeByte(1); // status
            __CLR4_5_2dlcdlclwye66hb.R.inc(17631);response.writeBytes(
                    ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n", StandardCharsets.US_ASCII));

            __CLR4_5_2dlcdlclwye66hb.R.inc(17632);channel.write(response, remoteAddress);

        } }else {__CLR4_5_2dlcdlclwye66hb.R.inc(17633);if ((((type == MSG_UPLOAD_POSITION || type == MSG_UPLOAD_POSITION_NEW
                || type == MSG_CONTROL_RESPONSE || type == MSG_ALARM)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17634)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17635)==0&false))) {{

            __CLR4_5_2dlcdlclwye66hb.R.inc(17636);boolean newFormat = false;
            __CLR4_5_2dlcdlclwye66hb.R.inc(17637);if ((((type == MSG_UPLOAD_POSITION && buf.readableBytes() == 48
                    || type == MSG_ALARM && buf.readableBytes() == 48
                    || type == MSG_CONTROL_RESPONSE && buf.readableBytes() == 57)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17638)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17639)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17640);newFormat = true;
            }

            }__CLR4_5_2dlcdlclwye66hb.R.inc(17641);Position position = new Position();
            __CLR4_5_2dlcdlclwye66hb.R.inc(17642);position.setProtocol(getProtocolName());

            __CLR4_5_2dlcdlclwye66hb.R.inc(17643);if ((((type == MSG_CONTROL_RESPONSE)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17644)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17645)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17646);buf.readUnsignedInt(); // GIS ip
                __CLR4_5_2dlcdlclwye66hb.R.inc(17647);buf.readUnsignedInt(); // GIS port
            }

            }__CLR4_5_2dlcdlclwye66hb.R.inc(17648);position.setValid(BitUtil.check(buf.readUnsignedByte(), 0));

            __CLR4_5_2dlcdlclwye66hb.R.inc(17649);short alarm = buf.readUnsignedByte();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2dlcdlclwye66hb.R.inc(17650);switch (alarm) {
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dlcdlclwye66hb.R.inc(17651);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17652);position.set(Position.KEY_ALARM, Position.ALARM_SOS);
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17653);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dlcdlclwye66hb.R.inc(17654);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17655);position.set(Position.KEY_ALARM, Position.ALARM_OVERSPEED);
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17656);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2dlcdlclwye66hb.R.inc(17657);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17658);position.set(Position.KEY_ALARM, Position.ALARM_GEOFENCE_EXIT);
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17659);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2dlcdlclwye66hb.R.inc(17660);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17661);position.set(Position.KEY_ALARM, Position.ALARM_POWER_OFF);
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17662);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dlcdlclwye66hb.R.inc(17663);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2dlcdlclwye66hb.R.inc(17664);break;
            }

            __CLR4_5_2dlcdlclwye66hb.R.inc(17665);if ((((newFormat)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17666)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17667)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17668);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedInt()));
                __CLR4_5_2dlcdlclwye66hb.R.inc(17669);position.setCourse(buf.readFloat());
            } }else {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17670);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                __CLR4_5_2dlcdlclwye66hb.R.inc(17671);position.setCourse(buf.readUnsignedShort());
            }
            }__CLR4_5_2dlcdlclwye66hb.R.inc(17672);position.setLongitude(buf.readFloat());
            __CLR4_5_2dlcdlclwye66hb.R.inc(17673);position.setLatitude(buf.readFloat());

            __CLR4_5_2dlcdlclwye66hb.R.inc(17674);if ((((!newFormat)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17675)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17676)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17677);long timeValue = buf.readUnsignedInt();
                __CLR4_5_2dlcdlclwye66hb.R.inc(17678);DateBuilder dateBuilder = new DateBuilder()
                        .setYear((int) BitUtil.from(timeValue, 26))
                        .setMonth((int) BitUtil.between(timeValue, 22, 26))
                        .setDay((int) BitUtil.between(timeValue, 17, 22))
                        .setHour((int) BitUtil.between(timeValue, 12, 17))
                        .setMinute((int) BitUtil.between(timeValue, 6, 12))
                        .setSecond((int) BitUtil.to(timeValue, 6));
                __CLR4_5_2dlcdlclwye66hb.R.inc(17679);position.setTime(dateBuilder.getDate());
            }

            }__CLR4_5_2dlcdlclwye66hb.R.inc(17680);ChannelBuffer rawId;
            __CLR4_5_2dlcdlclwye66hb.R.inc(17681);if ((((newFormat)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17682)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17683)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17684);rawId = buf.readBytes(12);
            } }else {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17685);rawId = buf.readBytes(11);
            }
            }__CLR4_5_2dlcdlclwye66hb.R.inc(17686);String id = rawId.toString(StandardCharsets.US_ASCII).replaceAll("[^\\p{Print}]", "");
            __CLR4_5_2dlcdlclwye66hb.R.inc(17687);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2dlcdlclwye66hb.R.inc(17688);if ((((deviceSession == null)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17689)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17690)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17691);return null;
            }
            }__CLR4_5_2dlcdlclwye66hb.R.inc(17692);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dlcdlclwye66hb.R.inc(17693);if ((((newFormat)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17694)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17695)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17696);DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
                __CLR4_5_2dlcdlclwye66hb.R.inc(17697);position.setTime(dateFormat.parse(buf.readBytes(17).toString(StandardCharsets.US_ASCII)));
                __CLR4_5_2dlcdlclwye66hb.R.inc(17698);buf.readByte();
            }

            }__CLR4_5_2dlcdlclwye66hb.R.inc(17699);if ((((!newFormat)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17700)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17701)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17702);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());
                __CLR4_5_2dlcdlclwye66hb.R.inc(17703);position.set(Position.KEY_FUEL_LEVEL, buf.readUnsignedByte());
            } }else {__CLR4_5_2dlcdlclwye66hb.R.inc(17704);if ((((type == MSG_UPLOAD_POSITION_NEW)&&(__CLR4_5_2dlcdlclwye66hb.R.iget(17705)!=0|true))||(__CLR4_5_2dlcdlclwye66hb.R.iget(17706)==0&false))) {{
                __CLR4_5_2dlcdlclwye66hb.R.inc(17707);position.set(Position.PREFIX_TEMP + 1, buf.readShort());
                __CLR4_5_2dlcdlclwye66hb.R.inc(17708);position.set(Position.KEY_ODOMETER, buf.readFloat());
            }

            }}__CLR4_5_2dlcdlclwye66hb.R.inc(17709);return position;
        }

        }}__CLR4_5_2dlcdlclwye66hb.R.inc(17710);return null;
    }finally{__CLR4_5_2dlcdlclwye66hb.R.flushNeeded();}}

}
