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

@java.lang.SuppressWarnings({"fallthrough"}) public class Mta6ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cygcyglwye66dj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,17012,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean simple;

    public Mta6ProtocolDecoder(Protocol protocol, boolean simple) {
        super(protocol);__CLR4_5_2cygcyglwye66dj.R.inc(16793);try{__CLR4_5_2cygcyglwye66dj.R.inc(16792);
        __CLR4_5_2cygcyglwye66dj.R.inc(16794);this.simple = simple;
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    private void sendContinue(Channel channel) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16795);
        __CLR4_5_2cygcyglwye66dj.R.inc(16796);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE);
        __CLR4_5_2cygcyglwye66dj.R.inc(16797);channel.write(response);
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    private void sendResponse(Channel channel, short packetId, short packetCount) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16798);
        __CLR4_5_2cygcyglwye66dj.R.inc(16799);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.OK);

        __CLR4_5_2cygcyglwye66dj.R.inc(16800);ChannelBuffer begin = ChannelBuffers.copiedBuffer("#ACK#", StandardCharsets.US_ASCII);
        __CLR4_5_2cygcyglwye66dj.R.inc(16801);ChannelBuffer end = ChannelBuffers.directBuffer(3);
        __CLR4_5_2cygcyglwye66dj.R.inc(16802);end.writeByte(packetId);
        __CLR4_5_2cygcyglwye66dj.R.inc(16803);end.writeByte(packetCount);
        __CLR4_5_2cygcyglwye66dj.R.inc(16804);end.writeByte(0);

        __CLR4_5_2cygcyglwye66dj.R.inc(16805);response.setContent(ChannelBuffers.wrappedBuffer(begin, end));
        __CLR4_5_2cygcyglwye66dj.R.inc(16806);channel.write(response);
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    private static class FloatReader {

        private int previousFloat;

        public float readFloat(ChannelBuffer buf) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16807);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2cygcyglwye66dj.R.inc(16808);switch (buf.getUnsignedByte(buf.readerIndex()) >> 6) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2cygcyglwye66dj.R.inc(16809);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2cygcyglwye66dj.R.inc(16810);previousFloat = buf.readInt() << 2;
                    __CLR4_5_2cygcyglwye66dj.R.inc(16811);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2cygcyglwye66dj.R.inc(16812);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2cygcyglwye66dj.R.inc(16813);previousFloat = (previousFloat & 0xffffff00) + ((buf.readUnsignedByte() & 0x3f) << 2);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16814);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2cygcyglwye66dj.R.inc(16815);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2cygcyglwye66dj.R.inc(16816);previousFloat = (previousFloat & 0xffff0000) + ((buf.readUnsignedShort() & 0x3fff) << 2);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16817);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2cygcyglwye66dj.R.inc(16818);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2cygcyglwye66dj.R.inc(16819);previousFloat = (previousFloat & 0xff000000) + ((buf.readUnsignedMedium() & 0x3fffff) << 2);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16820);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2cygcyglwye66dj.R.inc(16821);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2cygcyglwye66dj.R.inc(16822);Log.warning(new IllegalArgumentException());
                    __CLR4_5_2cygcyglwye66dj.R.inc(16823);break;
            }
            __CLR4_5_2cygcyglwye66dj.R.inc(16824);return Float.intBitsToFloat(previousFloat);
        }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    }

    private static class TimeReader extends FloatReader {

        private long weekNumber;

        public Date readTime(ChannelBuffer buf) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16825);
            __CLR4_5_2cygcyglwye66dj.R.inc(16826);long weekTime = (long) (readFloat(buf) * 1000);
            __CLR4_5_2cygcyglwye66dj.R.inc(16827);if ((((weekNumber == 0)&&(__CLR4_5_2cygcyglwye66dj.R.iget(16828)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16829)==0&false))) {{
                __CLR4_5_2cygcyglwye66dj.R.inc(16830);weekNumber = buf.readUnsignedShort();
            }

            }__CLR4_5_2cygcyglwye66dj.R.inc(16831);DateBuilder dateBuilder = new DateBuilder().setDate(1980, 1, 6);
            __CLR4_5_2cygcyglwye66dj.R.inc(16832);dateBuilder.addMillis(weekNumber * 7 * 24 * 60 * 60 * 1000 + weekTime);

            __CLR4_5_2cygcyglwye66dj.R.inc(16833);return dateBuilder.getDate();
        }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    }

    private List<Position> parseFormatA(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16834);
        __CLR4_5_2cygcyglwye66dj.R.inc(16835);List<Position> positions = new LinkedList<>();

        __CLR4_5_2cygcyglwye66dj.R.inc(16836);FloatReader latitudeReader = new FloatReader();
        __CLR4_5_2cygcyglwye66dj.R.inc(16837);FloatReader longitudeReader = new FloatReader();
        __CLR4_5_2cygcyglwye66dj.R.inc(16838);TimeReader timeReader = new TimeReader();

        __CLR4_5_2cygcyglwye66dj.R.inc(16839);try {
            __CLR4_5_2cygcyglwye66dj.R.inc(16840);while ((((buf.readable())&&(__CLR4_5_2cygcyglwye66dj.R.iget(16841)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16842)==0&false))) {{
                __CLR4_5_2cygcyglwye66dj.R.inc(16843);Position position = new Position();
                __CLR4_5_2cygcyglwye66dj.R.inc(16844);position.setProtocol(getProtocolName());
                __CLR4_5_2cygcyglwye66dj.R.inc(16845);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_2cygcyglwye66dj.R.inc(16846);short flags = buf.readUnsignedByte();

                __CLR4_5_2cygcyglwye66dj.R.inc(16847);short event = buf.readUnsignedByte();
                __CLR4_5_2cygcyglwye66dj.R.inc(16848);if ((((BitUtil.check(event, 7))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16849)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16850)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16851);if ((((BitUtil.check(event, 6))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16852)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16853)==0&false))) {{
                        __CLR4_5_2cygcyglwye66dj.R.inc(16854);buf.skipBytes(8);
                    } }else {{
                        __CLR4_5_2cygcyglwye66dj.R.inc(16855);while ((((BitUtil.check(event, 7))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16856)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16857)==0&false))) {{
                            __CLR4_5_2cygcyglwye66dj.R.inc(16858);event = buf.readUnsignedByte();
                        }
                    }}
                }}

                }__CLR4_5_2cygcyglwye66dj.R.inc(16859);position.setLatitude(latitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_2cygcyglwye66dj.R.inc(16860);position.setLongitude(longitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_2cygcyglwye66dj.R.inc(16861);position.setTime(timeReader.readTime(buf));

                __CLR4_5_2cygcyglwye66dj.R.inc(16862);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16863)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16864)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16865);buf.readUnsignedByte(); // status
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16866);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16867)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16868)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16869);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16870);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16871)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16872)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16873);position.setSpeed(buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16874);position.setCourse(buf.readUnsignedByte());
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16875);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16876)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16877)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16878);position.set(Position.KEY_ODOMETER, buf.readUnsignedShort() * 1000);
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16879);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16880)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16881)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16882);position.set(Position.KEY_FUEL_CONSUMPTION + "Accumulator1", buf.readUnsignedInt());
                    __CLR4_5_2cygcyglwye66dj.R.inc(16883);position.set(Position.KEY_FUEL_CONSUMPTION + "Accumulator2", buf.readUnsignedInt());
                    __CLR4_5_2cygcyglwye66dj.R.inc(16884);position.set("hours1", buf.readUnsignedShort());
                    __CLR4_5_2cygcyglwye66dj.R.inc(16885);position.set("hours2", buf.readUnsignedShort());
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16886);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16887)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16888)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16889);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16890);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16891);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16892);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort() & 0x03ff);
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16893);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16894)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16895)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16896);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
                    __CLR4_5_2cygcyglwye66dj.R.inc(16897);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
                    __CLR4_5_2cygcyglwye66dj.R.inc(16898);position.set(Position.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16899);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
                }

                }__CLR4_5_2cygcyglwye66dj.R.inc(16900);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16901)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16902)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16903);position.set(Position.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16904);position.set(Position.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16905);position.set(Position.KEY_DEVICE_TEMP, buf.readByte());

                    __CLR4_5_2cygcyglwye66dj.R.inc(16906);position.set(Position.KEY_RSSI, (buf.getUnsignedByte(buf.readerIndex()) >> 4) & 0x07);

                    __CLR4_5_2cygcyglwye66dj.R.inc(16907);int satellites = buf.readUnsignedByte() & 0x0f;
                    __CLR4_5_2cygcyglwye66dj.R.inc(16908);position.setValid(satellites >= 3);
                    __CLR4_5_2cygcyglwye66dj.R.inc(16909);position.set(Position.KEY_SATELLITES, satellites);
                }
                }__CLR4_5_2cygcyglwye66dj.R.inc(16910);positions.add(position);
            }
        }} catch (IndexOutOfBoundsException error) {
            __CLR4_5_2cygcyglwye66dj.R.inc(16911);Log.warning(error);
        }

        __CLR4_5_2cygcyglwye66dj.R.inc(16912);return positions;
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    private Position parseFormatA1(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2cygcyglwye66dj.R.inc(16913);
        __CLR4_5_2cygcyglwye66dj.R.inc(16914);Position position = new Position();
        __CLR4_5_2cygcyglwye66dj.R.inc(16915);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_2cygcyglwye66dj.R.inc(16916);position.setProtocol(getProtocolName());

        __CLR4_5_2cygcyglwye66dj.R.inc(16917);short flags = buf.readUnsignedByte();

        // Skip events
        __CLR4_5_2cygcyglwye66dj.R.inc(16918);short event = buf.readUnsignedByte();
        __CLR4_5_2cygcyglwye66dj.R.inc(16919);if ((((BitUtil.check(event, 7))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16920)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16921)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16922);if ((((BitUtil.check(event, 6))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16923)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16924)==0&false))) {{
                __CLR4_5_2cygcyglwye66dj.R.inc(16925);buf.skipBytes(8);
            } }else {{
                __CLR4_5_2cygcyglwye66dj.R.inc(16926);while ((((BitUtil.check(event, 7))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16927)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16928)==0&false))) {{
                    __CLR4_5_2cygcyglwye66dj.R.inc(16929);event = buf.readUnsignedByte();
                }
            }}
        }}

        }__CLR4_5_2cygcyglwye66dj.R.inc(16930);position.setLatitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_2cygcyglwye66dj.R.inc(16931);position.setLongitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_2cygcyglwye66dj.R.inc(16932);position.setTime(new TimeReader().readTime(buf));

        __CLR4_5_2cygcyglwye66dj.R.inc(16933);position.set(Position.KEY_STATUS, buf.readUnsignedByte());

        __CLR4_5_2cygcyglwye66dj.R.inc(16934);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16935)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16936)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16937);position.setAltitude(buf.readUnsignedShort());
            __CLR4_5_2cygcyglwye66dj.R.inc(16938);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_2cygcyglwye66dj.R.inc(16939);position.setCourse(buf.readByte());
            __CLR4_5_2cygcyglwye66dj.R.inc(16940);position.set(Position.KEY_ODOMETER, new FloatReader().readFloat(buf));
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(16941);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16942)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16943)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16944);position.set(Position.KEY_FUEL_CONSUMPTION, new FloatReader().readFloat(buf));
            __CLR4_5_2cygcyglwye66dj.R.inc(16945);position.set(Position.KEY_HOURS, new FloatReader().readFloat(buf));
            __CLR4_5_2cygcyglwye66dj.R.inc(16946);position.set("tank", buf.readUnsignedByte() * 0.4);
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(16947);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16948)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16949)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16950);position.set("engine", buf.readUnsignedShort() * 0.125);
            __CLR4_5_2cygcyglwye66dj.R.inc(16951);position.set("pedals", buf.readUnsignedByte());
            __CLR4_5_2cygcyglwye66dj.R.inc(16952);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
            __CLR4_5_2cygcyglwye66dj.R.inc(16953);position.set(Position.KEY_ODOMETER_SERVICE, buf.readUnsignedShort());
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(16954);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16955)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16956)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16957);position.set(Position.KEY_FUEL_LEVEL, buf.readUnsignedShort());
            __CLR4_5_2cygcyglwye66dj.R.inc(16958);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_2cygcyglwye66dj.R.inc(16959);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_2cygcyglwye66dj.R.inc(16960);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(16961);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16962)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16963)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16964);position.set(Position.PREFIX_TEMP + 1, buf.readByte());
            __CLR4_5_2cygcyglwye66dj.R.inc(16965);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
            __CLR4_5_2cygcyglwye66dj.R.inc(16966);position.set(Position.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
            __CLR4_5_2cygcyglwye66dj.R.inc(16967);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(16968);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_2cygcyglwye66dj.R.iget(16969)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16970)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16971);position.set(Position.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
            __CLR4_5_2cygcyglwye66dj.R.inc(16972);position.set(Position.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
            __CLR4_5_2cygcyglwye66dj.R.inc(16973);position.set(Position.KEY_DEVICE_TEMP, buf.readByte());

            __CLR4_5_2cygcyglwye66dj.R.inc(16974);position.set(Position.KEY_RSSI, buf.getUnsignedByte(buf.readerIndex()) >> 5);

            __CLR4_5_2cygcyglwye66dj.R.inc(16975);int satellites = buf.readUnsignedByte() & 0x1f;
            __CLR4_5_2cygcyglwye66dj.R.inc(16976);position.setValid(satellites >= 3);
            __CLR4_5_2cygcyglwye66dj.R.inc(16977);position.set(Position.KEY_SATELLITES, satellites);
        }

        // other data

        }__CLR4_5_2cygcyglwye66dj.R.inc(16978);return position;
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cygcyglwye66dj.R.inc(16979);

        __CLR4_5_2cygcyglwye66dj.R.inc(16980);HttpRequest request = (HttpRequest) msg;
        __CLR4_5_2cygcyglwye66dj.R.inc(16981);ChannelBuffer buf = request.getContent();

        __CLR4_5_2cygcyglwye66dj.R.inc(16982);buf.skipBytes("id=".length());
        __CLR4_5_2cygcyglwye66dj.R.inc(16983);int index = buf.indexOf(buf.readerIndex(), buf.writerIndex(), (byte) '&');
        __CLR4_5_2cygcyglwye66dj.R.inc(16984);String uniqueId = buf.toString(buf.readerIndex(), index - buf.readerIndex(), StandardCharsets.US_ASCII);
        __CLR4_5_2cygcyglwye66dj.R.inc(16985);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, uniqueId);
        __CLR4_5_2cygcyglwye66dj.R.inc(16986);if ((((deviceSession == null)&&(__CLR4_5_2cygcyglwye66dj.R.iget(16987)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(16988)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(16989);return null;
        }
        }__CLR4_5_2cygcyglwye66dj.R.inc(16990);buf.skipBytes(uniqueId.length());
        __CLR4_5_2cygcyglwye66dj.R.inc(16991);buf.skipBytes("&bin=".length());

        __CLR4_5_2cygcyglwye66dj.R.inc(16992);short packetId = buf.readUnsignedByte();
        __CLR4_5_2cygcyglwye66dj.R.inc(16993);short offset = buf.readUnsignedByte(); // dataOffset
        __CLR4_5_2cygcyglwye66dj.R.inc(16994);short packetCount = buf.readUnsignedByte();
        __CLR4_5_2cygcyglwye66dj.R.inc(16995);buf.readUnsignedByte(); // reserved
        __CLR4_5_2cygcyglwye66dj.R.inc(16996);buf.readUnsignedByte(); // timezone
        __CLR4_5_2cygcyglwye66dj.R.inc(16997);buf.skipBytes(offset - 5);

        __CLR4_5_2cygcyglwye66dj.R.inc(16998);if ((((channel != null)&&(__CLR4_5_2cygcyglwye66dj.R.iget(16999)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(17000)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(17001);sendContinue(channel);
            __CLR4_5_2cygcyglwye66dj.R.inc(17002);sendResponse(channel, packetId, packetCount);
        }

        }__CLR4_5_2cygcyglwye66dj.R.inc(17003);if ((((packetId == 0x31 || packetId == 0x32 || packetId == 0x36)&&(__CLR4_5_2cygcyglwye66dj.R.iget(17004)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(17005)==0&false))) {{
            __CLR4_5_2cygcyglwye66dj.R.inc(17006);if ((((simple)&&(__CLR4_5_2cygcyglwye66dj.R.iget(17007)!=0|true))||(__CLR4_5_2cygcyglwye66dj.R.iget(17008)==0&false))) {{
                __CLR4_5_2cygcyglwye66dj.R.inc(17009);return parseFormatA1(deviceSession, buf);
            } }else {{
                __CLR4_5_2cygcyglwye66dj.R.inc(17010);return parseFormatA(deviceSession, buf);
            }
        }} //else if (0x34 0x38 0x4F 0x59)

        }__CLR4_5_2cygcyglwye66dj.R.inc(17011);return null;
    }finally{__CLR4_5_2cygcyglwye66dj.R.flushNeeded();}}

}
