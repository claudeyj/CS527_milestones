/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2017 Anton Tananaev (anton@traccar.org)
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

@java.lang.SuppressWarnings({"fallthrough"}) public class KhdProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bwlbwllwye40p4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,15511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public KhdProtocolDecoder(KhdProtocol protocol) {
        super(protocol);__CLR4_5_2bwlbwllwye40p4.R.inc(15430);try{__CLR4_5_2bwlbwllwye40p4.R.inc(15429);
    }finally{__CLR4_5_2bwlbwllwye40p4.R.flushNeeded();}}

    private String readSerialNumber(ChannelBuffer buf) {try{__CLR4_5_2bwlbwllwye40p4.R.inc(15431);
        __CLR4_5_2bwlbwllwye40p4.R.inc(15432);int b1 = buf.readUnsignedByte();
        __CLR4_5_2bwlbwllwye40p4.R.inc(15433);int b2 = buf.readUnsignedByte();
        __CLR4_5_2bwlbwllwye40p4.R.inc(15434);if ((((b2 > 0x80)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15435)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15436)==0&false))) {{
            __CLR4_5_2bwlbwllwye40p4.R.inc(15437);b2 -= 0x80;
        }
        }__CLR4_5_2bwlbwllwye40p4.R.inc(15438);int b3 = buf.readUnsignedByte();
        __CLR4_5_2bwlbwllwye40p4.R.inc(15439);if ((((b3 > 0x80)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15440)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15441)==0&false))) {{
            __CLR4_5_2bwlbwllwye40p4.R.inc(15442);b3 -= 0x80;
        }
        }__CLR4_5_2bwlbwllwye40p4.R.inc(15443);int b4 = buf.readUnsignedByte();
        __CLR4_5_2bwlbwllwye40p4.R.inc(15444);String serialNumber = String.format("%02d%02d%02d%02d", b1, b2, b3, b4);
        __CLR4_5_2bwlbwllwye40p4.R.inc(15445);return String.valueOf(Long.parseLong(serialNumber));
    }finally{__CLR4_5_2bwlbwllwye40p4.R.flushNeeded();}}

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
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bwlbwllwye40p4.R.inc(15446);

        __CLR4_5_2bwlbwllwye40p4.R.inc(15447);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bwlbwllwye40p4.R.inc(15448);buf.skipBytes(2); // header
        __CLR4_5_2bwlbwllwye40p4.R.inc(15449);int type = buf.readUnsignedByte();
        __CLR4_5_2bwlbwllwye40p4.R.inc(15450);buf.readUnsignedShort(); // size

        __CLR4_5_2bwlbwllwye40p4.R.inc(15451);if ((((type == MSG_ON_DEMAND || type == MSG_POSITION_UPLOAD || type == MSG_POSITION_REUPLOAD
                || type == MSG_ALARM || type == MSG_REPLY || type == MSG_PERIPHERAL)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15452)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15453)==0&false))) {{

            __CLR4_5_2bwlbwllwye40p4.R.inc(15454);Position position = new Position();
            __CLR4_5_2bwlbwllwye40p4.R.inc(15455);position.setProtocol(getProtocolName());

            __CLR4_5_2bwlbwllwye40p4.R.inc(15456);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, readSerialNumber(buf));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15457);if ((((deviceSession == null)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15458)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15459)==0&false))) {{
                __CLR4_5_2bwlbwllwye40p4.R.inc(15460);return null;
            }
            }__CLR4_5_2bwlbwllwye40p4.R.inc(15461);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2bwlbwllwye40p4.R.inc(15462);DateBuilder dateBuilder = new DateBuilder()
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15463);position.setTime(dateBuilder.getDate());

            __CLR4_5_2bwlbwllwye40p4.R.inc(15464);position.setLatitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15465);position.setLongitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15466);position.setSpeed(UnitsConverter.knotsFromKph(BcdUtil.readInteger(buf, 4)));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15467);position.setCourse(BcdUtil.readInteger(buf, 4));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15468);position.setValid((buf.readUnsignedByte() & 0x80) != 0);

            __CLR4_5_2bwlbwllwye40p4.R.inc(15469);if ((((type != MSG_ALARM)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15470)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15471)==0&false))) {{

                __CLR4_5_2bwlbwllwye40p4.R.inc(15472);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());
                __CLR4_5_2bwlbwllwye40p4.R.inc(15473);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
                __CLR4_5_2bwlbwllwye40p4.R.inc(15474);position.set(Position.KEY_HDOP, buf.readUnsignedByte());
                __CLR4_5_2bwlbwllwye40p4.R.inc(15475);position.set(Position.KEY_VDOP, buf.readUnsignedByte());
                __CLR4_5_2bwlbwllwye40p4.R.inc(15476);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_2bwlbwllwye40p4.R.inc(15477);buf.skipBytes(5); // other location data

                __CLR4_5_2bwlbwllwye40p4.R.inc(15478);if ((((type == MSG_PERIPHERAL)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15479)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15480)==0&false))) {{

                    __CLR4_5_2bwlbwllwye40p4.R.inc(15481);buf.readUnsignedShort(); // data length

                    __CLR4_5_2bwlbwllwye40p4.R.inc(15482);int dataType = buf.readUnsignedByte();

                    __CLR4_5_2bwlbwllwye40p4.R.inc(15483);buf.readUnsignedByte(); // content length

                    boolean __CLB4_5_2_bool0=false;__CLR4_5_2bwlbwllwye40p4.R.inc(15484);switch (dataType) {
                        case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwlbwllwye40p4.R.inc(15485);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2bwlbwllwye40p4.R.inc(15486);position.set(Position.KEY_FUEL_LEVEL,
                                    buf.readUnsignedByte() * 100 + buf.readUnsignedByte());
                            __CLR4_5_2bwlbwllwye40p4.R.inc(15487);break;
                        case 0x02:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwlbwllwye40p4.R.inc(15488);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2bwlbwllwye40p4.R.inc(15489);position.set(Position.PREFIX_TEMP + 1,
                                    buf.readUnsignedByte() * 100 + buf.readUnsignedByte());
                            __CLR4_5_2bwlbwllwye40p4.R.inc(15490);break;
                        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2bwlbwllwye40p4.R.inc(15491);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2bwlbwllwye40p4.R.inc(15492);break;
                    }

                }

            }}

            }__CLR4_5_2bwlbwllwye40p4.R.inc(15493);return position;

        } }else {__CLR4_5_2bwlbwllwye40p4.R.inc(15494);if ((((type == MSG_LOGIN && channel != null)&&(__CLR4_5_2bwlbwllwye40p4.R.iget(15495)!=0|true))||(__CLR4_5_2bwlbwllwye40p4.R.iget(15496)==0&false))) {{

            __CLR4_5_2bwlbwllwye40p4.R.inc(15497);buf.skipBytes(4); // serial number
            __CLR4_5_2bwlbwllwye40p4.R.inc(15498);buf.readByte(); // reserved

            __CLR4_5_2bwlbwllwye40p4.R.inc(15499);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2bwlbwllwye40p4.R.inc(15500);response.writeByte(0x29); __CLR4_5_2bwlbwllwye40p4.R.inc(15501);response.writeByte(0x29); // header
            __CLR4_5_2bwlbwllwye40p4.R.inc(15502);response.writeByte(MSG_CONFIRMATION);
            __CLR4_5_2bwlbwllwye40p4.R.inc(15503);response.writeShort(5); // size
            __CLR4_5_2bwlbwllwye40p4.R.inc(15504);response.writeByte(buf.readUnsignedByte());
            __CLR4_5_2bwlbwllwye40p4.R.inc(15505);response.writeByte(type);
            __CLR4_5_2bwlbwllwye40p4.R.inc(15506);response.writeByte(0); // reserved
            __CLR4_5_2bwlbwllwye40p4.R.inc(15507);response.writeByte(Checksum.xor(response.toByteBuffer()));
            __CLR4_5_2bwlbwllwye40p4.R.inc(15508);response.writeByte(0x0D); // ending
            __CLR4_5_2bwlbwllwye40p4.R.inc(15509);channel.write(response);

        }

        }}__CLR4_5_2bwlbwllwye40p4.R.inc(15510);return null;
    }finally{__CLR4_5_2bwlbwllwye40p4.R.flushNeeded();}}

}
