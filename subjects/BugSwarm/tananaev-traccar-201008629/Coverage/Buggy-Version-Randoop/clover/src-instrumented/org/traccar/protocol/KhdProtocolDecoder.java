/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class KhdProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2a64a64lx1dwjuw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,13246,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public KhdProtocolDecoder(KhdProtocol protocol) {
        super(protocol);__CLR4_5_2a64a64lx1dwjuw.R.inc(13181);try{__CLR4_5_2a64a64lx1dwjuw.R.inc(13180);
    }finally{__CLR4_5_2a64a64lx1dwjuw.R.flushNeeded();}}

    private String readSerialNumber(ChannelBuffer buf) {try{__CLR4_5_2a64a64lx1dwjuw.R.inc(13182);
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13183);int b1 = buf.readUnsignedByte();
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13184);int b2 = buf.readUnsignedByte();
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13185);if ((((b2 > 0x80)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13186)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13187)==0&false))) {{
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13188);b2 -= 0x80;
        }
        }__CLR4_5_2a64a64lx1dwjuw.R.inc(13189);int b3 = buf.readUnsignedByte();
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13190);if ((((b3 > 0x80)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13191)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13192)==0&false))) {{
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13193);b3 -= 0x80;
        }
        }__CLR4_5_2a64a64lx1dwjuw.R.inc(13194);int b4 = buf.readUnsignedByte();
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13195);String serialNumber = String.format("%02d%02d%02d%02d", b1, b2, b3, b4);
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13196);return String.valueOf(Long.parseLong(serialNumber));
    }finally{__CLR4_5_2a64a64lx1dwjuw.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0xB1;
    public static final int MSG_CONFIRMATION = 0x21;
    public static final int MSG_ON_DEMAND = 0x81;
    public static final int MSG_POSITION_UPLOAD = 0x80;
    public static final int MSG_POSITION_REUPLOAD = 0x8E;
    public static final int MSG_ALARM = 0x82;
    public static final int MSG_REPLY = 0x85;
    public static final int MSG_PERIPHERAL = 0xA3;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2a64a64lx1dwjuw.R.inc(13197);

        __CLR4_5_2a64a64lx1dwjuw.R.inc(13198);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2a64a64lx1dwjuw.R.inc(13199);buf.skipBytes(2); // header
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13200);int type = buf.readUnsignedByte();
        __CLR4_5_2a64a64lx1dwjuw.R.inc(13201);buf.readUnsignedShort(); // size

        __CLR4_5_2a64a64lx1dwjuw.R.inc(13202);if ((((type == MSG_ON_DEMAND || type == MSG_POSITION_UPLOAD || type == MSG_POSITION_REUPLOAD
                || type == MSG_ALARM || type == MSG_REPLY || type == MSG_PERIPHERAL)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13203)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13204)==0&false))) {{

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13205);Position position = new Position();
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13206);position.setProtocol(getProtocolName());

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13207);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, readSerialNumber(buf));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13208);if ((((deviceSession == null)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13209)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13210)==0&false))) {{
                __CLR4_5_2a64a64lx1dwjuw.R.inc(13211);return null;
            }
            }__CLR4_5_2a64a64lx1dwjuw.R.inc(13212);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13213);DateBuilder dateBuilder = new DateBuilder()
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13214);position.setTime(dateBuilder.getDate());

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13215);position.setLatitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13216);position.setLongitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13217);position.setSpeed(UnitsConverter.knotsFromKph(BcdUtil.readInteger(buf, 4)));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13218);position.setCourse(BcdUtil.readInteger(buf, 4));

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13219);int flags = buf.readUnsignedByte();
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13220);position.setValid((flags & 0x80) != 0);

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13221);if ((((type == MSG_ALARM)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13222)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13223)==0&false))) {{

                __CLR4_5_2a64a64lx1dwjuw.R.inc(13224);buf.skipBytes(2);

            } }else {{

                __CLR4_5_2a64a64lx1dwjuw.R.inc(13225);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());

                __CLR4_5_2a64a64lx1dwjuw.R.inc(13226);buf.skipBytes(4); // status
                __CLR4_5_2a64a64lx1dwjuw.R.inc(13227);buf.skipBytes(8); // other

            }

            // parse extra data

            }__CLR4_5_2a64a64lx1dwjuw.R.inc(13228);return position;

        } }else {__CLR4_5_2a64a64lx1dwjuw.R.inc(13229);if ((((type == MSG_LOGIN && channel != null)&&(__CLR4_5_2a64a64lx1dwjuw.R.iget(13230)!=0|true))||(__CLR4_5_2a64a64lx1dwjuw.R.iget(13231)==0&false))) {{

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13232);buf.skipBytes(4); // serial number
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13233);buf.readByte(); // reserved

            __CLR4_5_2a64a64lx1dwjuw.R.inc(13234);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13235);response.writeByte(0x29); __CLR4_5_2a64a64lx1dwjuw.R.inc(13236);response.writeByte(0x29); // header
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13237);response.writeByte(MSG_CONFIRMATION);
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13238);response.writeShort(5); // size
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13239);response.writeByte(buf.readUnsignedByte());
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13240);response.writeByte(type);
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13241);response.writeByte(0); // reserved
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13242);response.writeByte(Checksum.xor(response.toByteBuffer()));
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13243);response.writeByte(0x0D); // ending
            __CLR4_5_2a64a64lx1dwjuw.R.inc(13244);channel.write(response);

        }

        }}__CLR4_5_2a64a64lx1dwjuw.R.inc(13245);return null;
    }finally{__CLR4_5_2a64a64lx1dwjuw.R.flushNeeded();}}

}
