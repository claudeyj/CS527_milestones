/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2015 Vijay Kumar (vijaykumar@zilogic.com)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@java.lang.SuppressWarnings({"fallthrough"}) public class BlackKiteProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2768768lwye7dsw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,9409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BlackKiteProtocolDecoder(BlackKiteProtocol protocol) {
        super(protocol);__CLR4_5_2768768lwye7dsw.R.inc(9297);try{__CLR4_5_2768768lwye7dsw.R.inc(9296);
    }finally{__CLR4_5_2768768lwye7dsw.R.flushNeeded();}}

    private static final int TAG_IMEI = 0x03;
    private static final int TAG_DATE = 0x20;
    private static final int TAG_COORDINATES = 0x30;
    private static final int TAG_SPEED_COURSE = 0x33;
    private static final int TAG_ALTITUDE = 0x34;
    private static final int TAG_STATUS = 0x40;
    private static final int TAG_DIGITAL_OUTPUTS = 0x45;
    private static final int TAG_DIGITAL_INPUTS = 0x46;
    private static final int TAG_INPUT_VOLTAGE1 = 0x50;
    private static final int TAG_INPUT_VOLTAGE2 = 0x51;
    private static final int TAG_INPUT_VOLTAGE3 = 0x52;
    private static final int TAG_INPUT_VOLTAGE4 = 0x53;
    private static final int TAG_XT1 = 0x60;
    private static final int TAG_XT2 = 0x61;
    private static final int TAG_XT3 = 0x62;

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_2768768lwye7dsw.R.inc(9298);
        __CLR4_5_2768768lwye7dsw.R.inc(9299);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_2768768lwye7dsw.R.inc(9300);reply.writeByte(0x02);
        __CLR4_5_2768768lwye7dsw.R.inc(9301);reply.writeShort((short) checksum);
        __CLR4_5_2768768lwye7dsw.R.inc(9302);if ((((channel != null)&&(__CLR4_5_2768768lwye7dsw.R.iget(9303)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9304)==0&false))) {{
            __CLR4_5_2768768lwye7dsw.R.inc(9305);channel.write(reply);
        }
    }}finally{__CLR4_5_2768768lwye7dsw.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2768768lwye7dsw.R.inc(9306);

        __CLR4_5_2768768lwye7dsw.R.inc(9307);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2768768lwye7dsw.R.inc(9308);buf.readUnsignedByte(); // header
        __CLR4_5_2768768lwye7dsw.R.inc(9309);int length = (buf.readUnsignedShort() & 0x7fff) + 3;

        __CLR4_5_2768768lwye7dsw.R.inc(9310);List<Position> positions = new LinkedList<>();
        __CLR4_5_2768768lwye7dsw.R.inc(9311);Set<Integer> tags = new HashSet<>();
        __CLR4_5_2768768lwye7dsw.R.inc(9312);boolean hasLocation = false;
        __CLR4_5_2768768lwye7dsw.R.inc(9313);Position position = new Position();
        __CLR4_5_2768768lwye7dsw.R.inc(9314);position.setProtocol(getProtocolName());

        __CLR4_5_2768768lwye7dsw.R.inc(9315);while ((((buf.readerIndex() < length)&&(__CLR4_5_2768768lwye7dsw.R.iget(9316)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9317)==0&false))) {{

            // Check if new message started
            __CLR4_5_2768768lwye7dsw.R.inc(9318);int tag = buf.readUnsignedByte();
            __CLR4_5_2768768lwye7dsw.R.inc(9319);if ((((tags.contains(tag))&&(__CLR4_5_2768768lwye7dsw.R.iget(9320)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9321)==0&false))) {{
                __CLR4_5_2768768lwye7dsw.R.inc(9322);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_2768768lwye7dsw.R.iget(9323)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9324)==0&false))) {{
                    __CLR4_5_2768768lwye7dsw.R.inc(9325);positions.add(position);
                }
                }__CLR4_5_2768768lwye7dsw.R.inc(9326);tags.clear();
                __CLR4_5_2768768lwye7dsw.R.inc(9327);hasLocation = false;
                __CLR4_5_2768768lwye7dsw.R.inc(9328);position = new Position();
            }
            }__CLR4_5_2768768lwye7dsw.R.inc(9329);tags.add(tag);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_2768768lwye7dsw.R.inc(9330);switch (tag) {

                case TAG_IMEI:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9331);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9332);getDeviceSession(channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2768768lwye7dsw.R.inc(9333);break;

                case TAG_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9334);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9335);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_2768768lwye7dsw.R.inc(9336);break;

                case TAG_COORDINATES:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9337);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9338);hasLocation = true;
                    __CLR4_5_2768768lwye7dsw.R.inc(9339);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                    __CLR4_5_2768768lwye7dsw.R.inc(9340);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9341);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9342);break;

                case TAG_SPEED_COURSE:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9343);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9344);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                    __CLR4_5_2768768lwye7dsw.R.inc(9345);position.setCourse(buf.readUnsignedShort() * 0.1);
                    __CLR4_5_2768768lwye7dsw.R.inc(9346);break;

                case TAG_ALTITUDE:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9347);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9348);position.setAltitude(buf.readShort());
                    __CLR4_5_2768768lwye7dsw.R.inc(9349);break;

                case TAG_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9350);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9351);int status = buf.readUnsignedShort();
                    __CLR4_5_2768768lwye7dsw.R.inc(9352);position.set(Position.KEY_IGNITION, BitUtil.check(status, 9));
                    __CLR4_5_2768768lwye7dsw.R.inc(9353);if ((((BitUtil.check(status, 15))&&(__CLR4_5_2768768lwye7dsw.R.iget(9354)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9355)==0&false))) {{
                        __CLR4_5_2768768lwye7dsw.R.inc(9356);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_2768768lwye7dsw.R.inc(9357);position.set(Position.KEY_CHARGE, BitUtil.check(status, 2));
                    __CLR4_5_2768768lwye7dsw.R.inc(9358);break;

                case TAG_DIGITAL_INPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9359);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9360);int input = buf.readUnsignedShort();
                    __CLR4_5_2768768lwye7dsw.R.inc(9361);for (int i = 0; (((i < 16)&&(__CLR4_5_2768768lwye7dsw.R.iget(9362)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9363)==0&false)); i++) {{
                        __CLR4_5_2768768lwye7dsw.R.inc(9364);position.set(Position.PREFIX_IO + (i + 1), BitUtil.check(input, i));
                    }
                    }__CLR4_5_2768768lwye7dsw.R.inc(9365);break;

                case TAG_DIGITAL_OUTPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9366);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9367);int output = buf.readUnsignedShort();
                    __CLR4_5_2768768lwye7dsw.R.inc(9368);for (int i = 0; (((i < 16)&&(__CLR4_5_2768768lwye7dsw.R.iget(9369)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9370)==0&false)); i++) {{
                        __CLR4_5_2768768lwye7dsw.R.inc(9371);position.set(Position.PREFIX_IO + (i + 17), BitUtil.check(output, i));
                    }
                    }__CLR4_5_2768768lwye7dsw.R.inc(9372);break;

                case TAG_INPUT_VOLTAGE1:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9373);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9374);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9375);break;

                case TAG_INPUT_VOLTAGE2:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9376);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9377);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9378);break;

                case TAG_INPUT_VOLTAGE3:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9379);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9380);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9381);break;

                case TAG_INPUT_VOLTAGE4:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9382);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9383);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_2768768lwye7dsw.R.inc(9384);break;

                case TAG_XT1:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9385);__CLB4_5_2_bool0=true;}
                case TAG_XT2:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9386);__CLB4_5_2_bool0=true;}
                case TAG_XT3:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9387);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9388);buf.skipBytes(16);
                    __CLR4_5_2768768lwye7dsw.R.inc(9389);break;

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2768768lwye7dsw.R.inc(9390);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2768768lwye7dsw.R.inc(9391);break;

            }
        }

        }__CLR4_5_2768768lwye7dsw.R.inc(9392);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_2768768lwye7dsw.R.iget(9393)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9394)==0&false))) {{
            __CLR4_5_2768768lwye7dsw.R.inc(9395);positions.add(position);
        }

        }__CLR4_5_2768768lwye7dsw.R.inc(9396);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_2768768lwye7dsw.R.inc(9397);if ((((deviceSession == null)&&(__CLR4_5_2768768lwye7dsw.R.iget(9398)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9399)==0&false))) {{
            __CLR4_5_2768768lwye7dsw.R.inc(9400);return null;
        }

        }__CLR4_5_2768768lwye7dsw.R.inc(9401);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_2768768lwye7dsw.R.inc(9402);for (Position p : positions) {{
            __CLR4_5_2768768lwye7dsw.R.inc(9403);p.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_2768768lwye7dsw.R.inc(9404);if ((((positions.isEmpty())&&(__CLR4_5_2768768lwye7dsw.R.iget(9405)!=0|true))||(__CLR4_5_2768768lwye7dsw.R.iget(9406)==0&false))) {{
            __CLR4_5_2768768lwye7dsw.R.inc(9407);return null;
        }

        }__CLR4_5_2768768lwye7dsw.R.inc(9408);return positions;
    }finally{__CLR4_5_2768768lwye7dsw.R.flushNeeded();}}

}
