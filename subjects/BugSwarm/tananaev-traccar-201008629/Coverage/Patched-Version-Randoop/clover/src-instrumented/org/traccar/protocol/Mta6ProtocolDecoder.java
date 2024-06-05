/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Log;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class Mta6ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2b54b54lx1e0hru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,14660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean simple;

    public Mta6ProtocolDecoder(Protocol protocol, boolean simple) {
        super(protocol);__CLR4_5_2b54b54lx1e0hru.R.inc(14441);try{__CLR4_5_2b54b54lx1e0hru.R.inc(14440);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14442);this.simple = simple;
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    private void sendContinue(Channel channel) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14443);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14444);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14445);channel.write(response);
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    private void sendResponse(Channel channel, short packetId, short packetCount) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14446);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14447);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.OK);

        __CLR4_5_2b54b54lx1e0hru.R.inc(14448);ChannelBuffer begin = ChannelBuffers.copiedBuffer("#ACK#", StandardCharsets.US_ASCII);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14449);ChannelBuffer end = ChannelBuffers.directBuffer(3);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14450);end.writeByte(packetId);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14451);end.writeByte(packetCount);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14452);end.writeByte(0);

        __CLR4_5_2b54b54lx1e0hru.R.inc(14453);response.setContent(ChannelBuffers.wrappedBuffer(begin, end));
        __CLR4_5_2b54b54lx1e0hru.R.inc(14454);channel.write(response);
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    private static class FloatReader {

        private int previousFloat;

        public float readFloat(ChannelBuffer buf) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14455);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2b54b54lx1e0hru.R.inc(14456);switch (buf.getUnsignedByte(buf.readerIndex()) >> 6) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2b54b54lx1e0hru.R.inc(14457);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14458);previousFloat = buf.readInt() << 2;
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14459);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2b54b54lx1e0hru.R.inc(14460);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14461);previousFloat = (previousFloat & 0xffffff00) + ((buf.readUnsignedByte() & 0x3f) << 2);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14462);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2b54b54lx1e0hru.R.inc(14463);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14464);previousFloat = (previousFloat & 0xffff0000) + ((buf.readUnsignedShort() & 0x3fff) << 2);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14465);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2b54b54lx1e0hru.R.inc(14466);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14467);previousFloat = (previousFloat & 0xff000000) + ((buf.readUnsignedMedium() & 0x3fffff) << 2);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14468);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2b54b54lx1e0hru.R.inc(14469);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14470);Log.warning(new IllegalArgumentException());
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14471);break;
            }
            __CLR4_5_2b54b54lx1e0hru.R.inc(14472);return Float.intBitsToFloat(previousFloat);
        }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    }

    private static class TimeReader extends FloatReader {

        private long weekNumber;

        public Date readTime(ChannelBuffer buf) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14473);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14474);long weekTime = (long) (readFloat(buf) * 1000);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14475);if ((((weekNumber == 0)&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14476)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14477)==0&false))) {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14478);weekNumber = buf.readUnsignedShort();
            }

            }__CLR4_5_2b54b54lx1e0hru.R.inc(14479);DateBuilder dateBuilder = new DateBuilder().setDate(1980, 1, 6);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14480);dateBuilder.addMillis(weekNumber * 7 * 24 * 60 * 60 * 1000 + weekTime);

            __CLR4_5_2b54b54lx1e0hru.R.inc(14481);return dateBuilder.getDate();
        }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    }

    private List<Position> parseFormatA(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14482);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14483);List<Position> positions = new LinkedList<>();

        __CLR4_5_2b54b54lx1e0hru.R.inc(14484);FloatReader latitudeReader = new FloatReader();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14485);FloatReader longitudeReader = new FloatReader();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14486);TimeReader timeReader = new TimeReader();

        __CLR4_5_2b54b54lx1e0hru.R.inc(14487);try {
            __CLR4_5_2b54b54lx1e0hru.R.inc(14488);while ((((buf.readable())&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14489)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14490)==0&false))) {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14491);Position position = new Position();
                __CLR4_5_2b54b54lx1e0hru.R.inc(14492);position.setProtocol(getProtocolName());
                __CLR4_5_2b54b54lx1e0hru.R.inc(14493);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2b54b54lx1e0hru.R.inc(14494);short flags = buf.readUnsignedByte();

                __CLR4_5_2b54b54lx1e0hru.R.inc(14495);short event = buf.readUnsignedByte();
                __CLR4_5_2b54b54lx1e0hru.R.inc(14496);if ((((BitUtil.check(event, 7))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14497)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14498)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14499);if ((((BitUtil.check(event, 6))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14500)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14501)==0&false))) {{
                        __CLR4_5_2b54b54lx1e0hru.R.inc(14502);buf.skipBytes(8);
                    } }else {{
                        __CLR4_5_2b54b54lx1e0hru.R.inc(14503);while ((((BitUtil.check(event, 7))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14504)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14505)==0&false))) {{
                            __CLR4_5_2b54b54lx1e0hru.R.inc(14506);event = buf.readUnsignedByte();
                        }
                    }}
                }}

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14507);position.setLatitude(latitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_2b54b54lx1e0hru.R.inc(14508);position.setLongitude(longitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_2b54b54lx1e0hru.R.inc(14509);position.setTime(timeReader.readTime(buf));

                __CLR4_5_2b54b54lx1e0hru.R.inc(14510);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14511)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14512)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14513);buf.readUnsignedByte(); // status
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14514);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14515)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14516)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14517);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14518);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14519)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14520)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14521);position.setSpeed(buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14522);position.setCourse(buf.readUnsignedByte());
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14523);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14524)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14525)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14526);position.set(Position.KEY_ODOMETER, buf.readUnsignedShort() * 1000);
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14527);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14528)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14529)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14530);position.set(Position.KEY_FUEL_CONSUMPTION + "Accumulator1", buf.readUnsignedInt());
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14531);position.set(Position.KEY_FUEL_CONSUMPTION + "Accumulator2", buf.readUnsignedInt());
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14532);position.set("hours1", buf.readUnsignedShort());
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14533);position.set("hours2", buf.readUnsignedShort());
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14534);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14535)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14536)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14537);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14538);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14539);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14540);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort() & 0x03ff);
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14541);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14542)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14543)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14544);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14545);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14546);position.set(Position.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14547);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
                }

                }__CLR4_5_2b54b54lx1e0hru.R.inc(14548);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14549)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14550)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14551);position.set(Position.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14552);position.set(Position.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14553);buf.readByte(); // microcontroller temperature

                    __CLR4_5_2b54b54lx1e0hru.R.inc(14554);position.set(Position.KEY_RSSI, (buf.getUnsignedByte(buf.readerIndex()) >> 4) & 0x07);

                    __CLR4_5_2b54b54lx1e0hru.R.inc(14555);int satellites = buf.readUnsignedByte() & 0x0f;
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14556);position.setValid(satellites >= 3);
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14557);position.set(Position.KEY_SATELLITES, satellites);
                }
                }__CLR4_5_2b54b54lx1e0hru.R.inc(14558);positions.add(position);
            }
        }} catch (IndexOutOfBoundsException error) {
            __CLR4_5_2b54b54lx1e0hru.R.inc(14559);Log.warning(error);
        }

        __CLR4_5_2b54b54lx1e0hru.R.inc(14560);return positions;
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    private Position parseFormatA1(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14561);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14562);Position position = new Position();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14563);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2b54b54lx1e0hru.R.inc(14564);position.setProtocol(getProtocolName());

        __CLR4_5_2b54b54lx1e0hru.R.inc(14565);short flags = buf.readUnsignedByte();

        // Skip events
        __CLR4_5_2b54b54lx1e0hru.R.inc(14566);short event = buf.readUnsignedByte();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14567);if ((((BitUtil.check(event, 7))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14568)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14569)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14570);if ((((BitUtil.check(event, 6))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14571)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14572)==0&false))) {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14573);buf.skipBytes(8);
            } }else {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14574);while ((((BitUtil.check(event, 7))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14575)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14576)==0&false))) {{
                    __CLR4_5_2b54b54lx1e0hru.R.inc(14577);event = buf.readUnsignedByte();
                }
            }}
        }}

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14578);position.setLatitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14579);position.setLongitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14580);position.setTime(new TimeReader().readTime(buf));

        __CLR4_5_2b54b54lx1e0hru.R.inc(14581);buf.readUnsignedByte(); // status

        __CLR4_5_2b54b54lx1e0hru.R.inc(14582);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14583)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14584)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14585);position.setAltitude(buf.readUnsignedShort());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14586);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14587);position.setCourse(buf.readByte());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14588);position.set(Position.KEY_ODOMETER, new FloatReader().readFloat(buf));
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14589);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14590)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14591)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14592);position.set(Position.KEY_FUEL_CONSUMPTION, new FloatReader().readFloat(buf));
            __CLR4_5_2b54b54lx1e0hru.R.inc(14593);position.set("hours", new FloatReader().readFloat(buf));
            __CLR4_5_2b54b54lx1e0hru.R.inc(14594);position.set("tank", buf.readUnsignedByte() * 0.4);
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14595);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14596)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14597)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14598);position.set("engine", buf.readUnsignedShort() * 0.125);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14599);position.set("pedals", buf.readUnsignedByte());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14600);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14601);buf.readUnsignedShort(); // service odometer
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14602);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14603)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14604)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14605);position.set(Position.KEY_FUEL, buf.readUnsignedShort());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14606);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14607);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14608);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14609);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14610)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14611)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14612);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
            __CLR4_5_2b54b54lx1e0hru.R.inc(14613);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
            __CLR4_5_2b54b54lx1e0hru.R.inc(14614);position.set(Position.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14615);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14616);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14617)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14618)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14619);position.set(Position.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14620);position.set(Position.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14621);buf.readByte(); // microcontroller temperature

            __CLR4_5_2b54b54lx1e0hru.R.inc(14622);position.set(Position.KEY_RSSI, buf.getUnsignedByte(buf.readerIndex()) >> 5);

            __CLR4_5_2b54b54lx1e0hru.R.inc(14623);int satellites = buf.readUnsignedByte() & 0x1f;
            __CLR4_5_2b54b54lx1e0hru.R.inc(14624);position.setValid(satellites >= 3);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14625);position.set(Position.KEY_SATELLITES, satellites);
        }

        // other data

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14626);return position;
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2b54b54lx1e0hru.R.inc(14627);

        __CLR4_5_2b54b54lx1e0hru.R.inc(14628);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2b54b54lx1e0hru.R.inc(14629);ChannelBuffer buf = request.getContent();

        __CLR4_5_2b54b54lx1e0hru.R.inc(14630);buf.skipBytes("id=".length());
        __CLR4_5_2b54b54lx1e0hru.R.inc(14631);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
        __CLR4_5_2b54b54lx1e0hru.R.inc(14632);String uniqueId = buf.toString(buf.readerIndex(), index - buf.readerIndex(), StandardCharsets.US_ASCII);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14633);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, uniqueId);
        __CLR4_5_2b54b54lx1e0hru.R.inc(14634);if ((((deviceSession == null)&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14635)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14636)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14637);return null;
        }
        }__CLR4_5_2b54b54lx1e0hru.R.inc(14638);buf.skipBytes(uniqueId.length());
        __CLR4_5_2b54b54lx1e0hru.R.inc(14639);buf.skipBytes("&bin=".length());

        __CLR4_5_2b54b54lx1e0hru.R.inc(14640);short packetId = buf.readUnsignedByte();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14641);short offset = buf.readUnsignedByte(); // dataOffset
        __CLR4_5_2b54b54lx1e0hru.R.inc(14642);short packetCount = buf.readUnsignedByte();
        __CLR4_5_2b54b54lx1e0hru.R.inc(14643);buf.readUnsignedByte(); // reserved
        __CLR4_5_2b54b54lx1e0hru.R.inc(14644);buf.readUnsignedByte(); // timezone
        __CLR4_5_2b54b54lx1e0hru.R.inc(14645);buf.skipBytes(offset - 5);

        __CLR4_5_2b54b54lx1e0hru.R.inc(14646);if ((((channel != null)&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14647)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14648)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14649);sendContinue(channel);
            __CLR4_5_2b54b54lx1e0hru.R.inc(14650);sendResponse(channel, packetId, packetCount);
        }

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14651);if ((((packetId == 0x31 || packetId == 0x32 || packetId == 0x36)&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14652)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14653)==0&false))) {{
            __CLR4_5_2b54b54lx1e0hru.R.inc(14654);if ((((simple)&&(__CLR4_5_2b54b54lx1e0hru.R.iget(14655)!=0|true))||(__CLR4_5_2b54b54lx1e0hru.R.iget(14656)==0&false))) {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14657);return parseFormatA1(deviceSession, buf);
            } }else {{
                __CLR4_5_2b54b54lx1e0hru.R.inc(14658);return parseFormatA(deviceSession, buf);
            }
        }} //else if (0x34 0x38 0x4F 0x59)

        }__CLR4_5_2b54b54lx1e0hru.R.inc(14659);return null;
    }finally{__CLR4_5_2b54b54lx1e0hru.R.flushNeeded();}}

}
