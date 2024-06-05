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

@java.lang.SuppressWarnings({"fallthrough"}) public class BlackKiteProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26cz6czlx1dxnke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,8356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BlackKiteProtocolDecoder(BlackKiteProtocol protocol) {
        super(protocol);__CLR4_5_26cz6czlx1dxnke.R.inc(8244);try{__CLR4_5_26cz6czlx1dxnke.R.inc(8243);
    }finally{__CLR4_5_26cz6czlx1dxnke.R.flushNeeded();}}

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

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_26cz6czlx1dxnke.R.inc(8245);
        __CLR4_5_26cz6czlx1dxnke.R.inc(8246);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_26cz6czlx1dxnke.R.inc(8247);reply.writeByte(0x02);
        __CLR4_5_26cz6czlx1dxnke.R.inc(8248);reply.writeShort((short) checksum);
        __CLR4_5_26cz6czlx1dxnke.R.inc(8249);if ((((channel != null)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8250)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8251)==0&false))) {{
            __CLR4_5_26cz6czlx1dxnke.R.inc(8252);channel.write(reply);
        }
    }}finally{__CLR4_5_26cz6czlx1dxnke.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26cz6czlx1dxnke.R.inc(8253);

        __CLR4_5_26cz6czlx1dxnke.R.inc(8254);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26cz6czlx1dxnke.R.inc(8255);buf.readUnsignedByte(); // header
        __CLR4_5_26cz6czlx1dxnke.R.inc(8256);int length = (buf.readUnsignedShort() & 0x7fff) + 3;

        __CLR4_5_26cz6czlx1dxnke.R.inc(8257);List<Position> positions = new LinkedList<>();
        __CLR4_5_26cz6czlx1dxnke.R.inc(8258);Set<Integer> tags = new HashSet<>();
        __CLR4_5_26cz6czlx1dxnke.R.inc(8259);boolean hasLocation = false;
        __CLR4_5_26cz6czlx1dxnke.R.inc(8260);Position position = new Position();
        __CLR4_5_26cz6czlx1dxnke.R.inc(8261);position.setProtocol(getProtocolName());

        __CLR4_5_26cz6czlx1dxnke.R.inc(8262);while ((((buf.readerIndex() < length)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8263)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8264)==0&false))) {{

            // Check if new message started
            __CLR4_5_26cz6czlx1dxnke.R.inc(8265);int tag = buf.readUnsignedByte();
            __CLR4_5_26cz6czlx1dxnke.R.inc(8266);if ((((tags.contains(tag))&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8267)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8268)==0&false))) {{
                __CLR4_5_26cz6czlx1dxnke.R.inc(8269);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8270)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8271)==0&false))) {{
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8272);positions.add(position);
                }
                }__CLR4_5_26cz6czlx1dxnke.R.inc(8273);tags.clear();
                __CLR4_5_26cz6czlx1dxnke.R.inc(8274);hasLocation = false;
                __CLR4_5_26cz6czlx1dxnke.R.inc(8275);position = new Position();
            }
            }__CLR4_5_26cz6czlx1dxnke.R.inc(8276);tags.add(tag);

            boolean __CLB4_5_2_bool0=false;__CLR4_5_26cz6czlx1dxnke.R.inc(8277);switch (tag) {

                case TAG_IMEI:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8278);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8279);getDeviceSession(channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8280);break;

                case TAG_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8281);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8282);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8283);break;

                case TAG_COORDINATES:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8284);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8285);hasLocation = true;
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8286);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8287);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8288);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8289);break;

                case TAG_SPEED_COURSE:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8290);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8291);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8292);position.setCourse(buf.readUnsignedShort() * 0.1);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8293);break;

                case TAG_ALTITUDE:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8294);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8295);position.setAltitude(buf.readShort());
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8296);break;

                case TAG_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8297);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8298);int status = buf.readUnsignedShort();
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8299);position.set(Position.KEY_IGNITION, BitUtil.check(status, 9));
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8300);if ((((BitUtil.check(status, 15))&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8301)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8302)==0&false))) {{
                        __CLR4_5_26cz6czlx1dxnke.R.inc(8303);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
                    }
                    }__CLR4_5_26cz6czlx1dxnke.R.inc(8304);position.set(Position.KEY_POWER, BitUtil.check(status, 2));
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8305);break;

                case TAG_DIGITAL_INPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8306);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8307);int input = buf.readUnsignedShort();
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8308);for (int i = 0; (((i < 16)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8309)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8310)==0&false)); i++) {{
                        __CLR4_5_26cz6czlx1dxnke.R.inc(8311);position.set(Position.PREFIX_IO + (i + 1), BitUtil.check(input, i));
                    }
                    }__CLR4_5_26cz6czlx1dxnke.R.inc(8312);break;

                case TAG_DIGITAL_OUTPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8313);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8314);int output = buf.readUnsignedShort();
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8315);for (int i = 0; (((i < 16)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8316)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8317)==0&false)); i++) {{
                        __CLR4_5_26cz6czlx1dxnke.R.inc(8318);position.set(Position.PREFIX_IO + (i + 17), BitUtil.check(output, i));
                    }
                    }__CLR4_5_26cz6czlx1dxnke.R.inc(8319);break;

                case TAG_INPUT_VOLTAGE1:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8320);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8321);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8322);break;

                case TAG_INPUT_VOLTAGE2:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8323);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8324);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8325);break;

                case TAG_INPUT_VOLTAGE3:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8326);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8327);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8328);break;

                case TAG_INPUT_VOLTAGE4:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8329);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8330);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8331);break;

                case TAG_XT1:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8332);__CLB4_5_2_bool0=true;}
                case TAG_XT2:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8333);__CLB4_5_2_bool0=true;}
                case TAG_XT3:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8334);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8335);buf.skipBytes(16);
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8336);break;

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_26cz6czlx1dxnke.R.inc(8337);__CLB4_5_2_bool0=true;}
                    __CLR4_5_26cz6czlx1dxnke.R.inc(8338);break;

            }
        }

        }__CLR4_5_26cz6czlx1dxnke.R.inc(8339);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8340)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8341)==0&false))) {{
            __CLR4_5_26cz6czlx1dxnke.R.inc(8342);positions.add(position);
        }

        }__CLR4_5_26cz6czlx1dxnke.R.inc(8343);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_26cz6czlx1dxnke.R.inc(8344);if ((((deviceSession == null)&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8345)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8346)==0&false))) {{
            __CLR4_5_26cz6czlx1dxnke.R.inc(8347);return null;
        }

        }__CLR4_5_26cz6czlx1dxnke.R.inc(8348);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_26cz6czlx1dxnke.R.inc(8349);for (Position p : positions) {{
            __CLR4_5_26cz6czlx1dxnke.R.inc(8350);p.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_26cz6czlx1dxnke.R.inc(8351);if ((((positions.isEmpty())&&(__CLR4_5_26cz6czlx1dxnke.R.iget(8352)!=0|true))||(__CLR4_5_26cz6czlx1dxnke.R.iget(8353)==0&false))) {{
            __CLR4_5_26cz6czlx1dxnke.R.inc(8354);return null;
        }

        }__CLR4_5_26cz6czlx1dxnke.R.inc(8355);return positions;
    }finally{__CLR4_5_26cz6czlx1dxnke.R.flushNeeded();}}

}
