/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.Protocol;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class Mta6ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_258b58blx1doaa3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,6998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private boolean simple;

    public Mta6ProtocolDecoder(Protocol protocol, boolean simple) {
        super(protocol);__CLR4_5_258b58blx1doaa3.R.inc(6780);try{__CLR4_5_258b58blx1doaa3.R.inc(6779);
        __CLR4_5_258b58blx1doaa3.R.inc(6781);this.simple = simple;
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}

    private void sendContinue(Channel channel) {try{__CLR4_5_258b58blx1doaa3.R.inc(6782);
        __CLR4_5_258b58blx1doaa3.R.inc(6783);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE);
        __CLR4_5_258b58blx1doaa3.R.inc(6784);channel.write(response);
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}
    
    private void sendResponse(Channel channel, short packetId, short packetCount) {try{__CLR4_5_258b58blx1doaa3.R.inc(6785);
        __CLR4_5_258b58blx1doaa3.R.inc(6786);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.OK);

        __CLR4_5_258b58blx1doaa3.R.inc(6787);ChannelBuffer begin = ChannelBuffers.copiedBuffer("#ACK#", Charset.defaultCharset());
        __CLR4_5_258b58blx1doaa3.R.inc(6788);ChannelBuffer end = ChannelBuffers.directBuffer(3);
        __CLR4_5_258b58blx1doaa3.R.inc(6789);end.writeByte(packetId);
        __CLR4_5_258b58blx1doaa3.R.inc(6790);end.writeByte(packetCount);
        __CLR4_5_258b58blx1doaa3.R.inc(6791);end.writeByte(0);
        
        __CLR4_5_258b58blx1doaa3.R.inc(6792);response.setContent(ChannelBuffers.wrappedBuffer(begin, end));
        __CLR4_5_258b58blx1doaa3.R.inc(6793);channel.write(response);
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}
    
    private static class FloatReader {
        
        private int previousFloat;
        
        public float readFloat(ChannelBuffer buf) {try{__CLR4_5_258b58blx1doaa3.R.inc(6794);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_258b58blx1doaa3.R.inc(6795);switch (buf.getUnsignedByte(buf.readerIndex()) >> 6)
            {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_258b58blx1doaa3.R.inc(6796);__CLB4_5_2_bool0=true;}
                    __CLR4_5_258b58blx1doaa3.R.inc(6797);previousFloat = buf.readInt() << 2;
                    __CLR4_5_258b58blx1doaa3.R.inc(6798);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_258b58blx1doaa3.R.inc(6799);__CLB4_5_2_bool0=true;}
                    __CLR4_5_258b58blx1doaa3.R.inc(6800);previousFloat = (previousFloat & 0xffffff00) + ((buf.readUnsignedByte() & 0x3f) << 2);
                    __CLR4_5_258b58blx1doaa3.R.inc(6801);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_258b58blx1doaa3.R.inc(6802);__CLB4_5_2_bool0=true;}
                    __CLR4_5_258b58blx1doaa3.R.inc(6803);previousFloat = (previousFloat & 0xffff0000) + ((buf.readUnsignedShort() & 0x3fff) << 2);
                    __CLR4_5_258b58blx1doaa3.R.inc(6804);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_258b58blx1doaa3.R.inc(6805);__CLB4_5_2_bool0=true;}
                    __CLR4_5_258b58blx1doaa3.R.inc(6806);previousFloat = (previousFloat & 0xff000000) + ((buf.readUnsignedMedium() & 0x3fffff) << 2);
                    __CLR4_5_258b58blx1doaa3.R.inc(6807);break;
            }
            __CLR4_5_258b58blx1doaa3.R.inc(6808);return Float.intBitsToFloat(previousFloat);
        }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}
        
    }
    
    private static class TimeReader extends FloatReader {
        
        private long weekNumber;
        
        public Date readTime(ChannelBuffer buf) {try{__CLR4_5_258b58blx1doaa3.R.inc(6809);
            __CLR4_5_258b58blx1doaa3.R.inc(6810);long weekTime = (long) (readFloat(buf) * 1000);
            __CLR4_5_258b58blx1doaa3.R.inc(6811);if ((((weekNumber == 0)&&(__CLR4_5_258b58blx1doaa3.R.iget(6812)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6813)==0&false))) {{
                __CLR4_5_258b58blx1doaa3.R.inc(6814);weekNumber = buf.readUnsignedShort();
            }

            }__CLR4_5_258b58blx1doaa3.R.inc(6815);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_258b58blx1doaa3.R.inc(6816);time.clear();
            __CLR4_5_258b58blx1doaa3.R.inc(6817);time.set(Calendar.YEAR, 1980);
            __CLR4_5_258b58blx1doaa3.R.inc(6818);time.set(Calendar.MONTH, 0);
            __CLR4_5_258b58blx1doaa3.R.inc(6819);time.set(Calendar.DAY_OF_MONTH, 6);
            __CLR4_5_258b58blx1doaa3.R.inc(6820);long offset = time.getTimeInMillis();

            __CLR4_5_258b58blx1doaa3.R.inc(6821);return new Date(offset + weekNumber * 7 * 24 * 60 * 60 * 1000 + weekTime);
        }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}
        
    }

    private List<Position> parseFormatA(ChannelBuffer buf) {try{__CLR4_5_258b58blx1doaa3.R.inc(6822);
        __CLR4_5_258b58blx1doaa3.R.inc(6823);List<Position> positions = new LinkedList<Position>();
        
        __CLR4_5_258b58blx1doaa3.R.inc(6824);FloatReader latitudeReader = new FloatReader();
        __CLR4_5_258b58blx1doaa3.R.inc(6825);FloatReader longitudeReader = new FloatReader();
        __CLR4_5_258b58blx1doaa3.R.inc(6826);TimeReader timeReader = new TimeReader();
        
        __CLR4_5_258b58blx1doaa3.R.inc(6827);try {
            __CLR4_5_258b58blx1doaa3.R.inc(6828);while ((((buf.readable())&&(__CLR4_5_258b58blx1doaa3.R.iget(6829)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6830)==0&false))) {{
                __CLR4_5_258b58blx1doaa3.R.inc(6831);Position position = new Position();
                __CLR4_5_258b58blx1doaa3.R.inc(6832);position.setDeviceId(getDeviceId());
                __CLR4_5_258b58blx1doaa3.R.inc(6833);position.setProtocol(getProtocolName());

                __CLR4_5_258b58blx1doaa3.R.inc(6834);short flags = buf.readUnsignedByte();

                // Skip events
                __CLR4_5_258b58blx1doaa3.R.inc(6835);short event = buf.readUnsignedByte();
                __CLR4_5_258b58blx1doaa3.R.inc(6836);if ((((BitUtil.check(event, 7))&&(__CLR4_5_258b58blx1doaa3.R.iget(6837)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6838)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6839);if ((((BitUtil.check(event, 6))&&(__CLR4_5_258b58blx1doaa3.R.iget(6840)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6841)==0&false))) {{
                        __CLR4_5_258b58blx1doaa3.R.inc(6842);buf.skipBytes(8);
                    } }else {{
                        __CLR4_5_258b58blx1doaa3.R.inc(6843);while ((((BitUtil.check(event, 7))&&(__CLR4_5_258b58blx1doaa3.R.iget(6844)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6845)==0&false))) {{
                            __CLR4_5_258b58blx1doaa3.R.inc(6846);event = buf.readUnsignedByte();
                        }
                    }}
                }}

                }__CLR4_5_258b58blx1doaa3.R.inc(6847);position.setLatitude(latitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_258b58blx1doaa3.R.inc(6848);position.setLongitude(longitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_258b58blx1doaa3.R.inc(6849);position.setTime(timeReader.readTime(buf));

                __CLR4_5_258b58blx1doaa3.R.inc(6850);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_258b58blx1doaa3.R.iget(6851)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6852)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6853);buf.readUnsignedByte(); // status
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6854);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_258b58blx1doaa3.R.iget(6855)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6856)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6857);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6858);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_258b58blx1doaa3.R.iget(6859)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6860)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6861);position.setSpeed(buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6862);position.setCourse(buf.readUnsignedByte());
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6863);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_258b58blx1doaa3.R.iget(6864)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6865)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6866);position.set(Event.KEY_ODOMETER, buf.readUnsignedShort());
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6867);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_258b58blx1doaa3.R.iget(6868)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6869)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6870);position.set(Event.KEY_FUEL, buf.readUnsignedInt() + "|" + buf.readUnsignedInt());
                    __CLR4_5_258b58blx1doaa3.R.inc(6871);position.set("hours1", buf.readUnsignedShort());
                    __CLR4_5_258b58blx1doaa3.R.inc(6872);position.set("hours2", buf.readUnsignedShort());
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6873);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_258b58blx1doaa3.R.iget(6874)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6875)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6876);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6877);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6878);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6879);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort() & 0x03ff);
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6880);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_258b58blx1doaa3.R.iget(6881)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6882)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6883);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
                    __CLR4_5_258b58blx1doaa3.R.inc(6884);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
                    __CLR4_5_258b58blx1doaa3.R.inc(6885);position.set(Event.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6886);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
                }

                }__CLR4_5_258b58blx1doaa3.R.inc(6887);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_258b58blx1doaa3.R.iget(6888)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6889)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6890);position.set(Event.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
                    __CLR4_5_258b58blx1doaa3.R.inc(6891);position.set(Event.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_258b58blx1doaa3.R.inc(6892);buf.readByte(); // microcontroller temperature

                    __CLR4_5_258b58blx1doaa3.R.inc(6893);position.set(Event.KEY_GSM, (buf.getUnsignedByte(buf.readerIndex()) >> 4) & 0x07);

                    __CLR4_5_258b58blx1doaa3.R.inc(6894);int satellites = buf.readUnsignedByte() & 0x0f;
                    __CLR4_5_258b58blx1doaa3.R.inc(6895);position.setValid(satellites >= 3);
                    __CLR4_5_258b58blx1doaa3.R.inc(6896);position.set(Event.KEY_SATELLITES, satellites);
                }
                }__CLR4_5_258b58blx1doaa3.R.inc(6897);positions.add(position);
            }
        }} catch (IndexOutOfBoundsException error) {
        }
        
        __CLR4_5_258b58blx1doaa3.R.inc(6898);return positions;
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}

    private Position parseFormatA1(ChannelBuffer buf) {try{__CLR4_5_258b58blx1doaa3.R.inc(6899);
        __CLR4_5_258b58blx1doaa3.R.inc(6900);Position position = new Position();
        __CLR4_5_258b58blx1doaa3.R.inc(6901);position.setDeviceId(getDeviceId());
        __CLR4_5_258b58blx1doaa3.R.inc(6902);position.setProtocol(getProtocolName());

        __CLR4_5_258b58blx1doaa3.R.inc(6903);short flags = buf.readUnsignedByte();

        // Skip events
        __CLR4_5_258b58blx1doaa3.R.inc(6904);short event = buf.readUnsignedByte();
        __CLR4_5_258b58blx1doaa3.R.inc(6905);if ((((BitUtil.check(event, 7))&&(__CLR4_5_258b58blx1doaa3.R.iget(6906)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6907)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6908);if ((((BitUtil.check(event, 6))&&(__CLR4_5_258b58blx1doaa3.R.iget(6909)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6910)==0&false))) {{
                __CLR4_5_258b58blx1doaa3.R.inc(6911);buf.skipBytes(8);
            } }else {{
                __CLR4_5_258b58blx1doaa3.R.inc(6912);while ((((BitUtil.check(event, 7))&&(__CLR4_5_258b58blx1doaa3.R.iget(6913)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6914)==0&false))) {{
                    __CLR4_5_258b58blx1doaa3.R.inc(6915);event = buf.readUnsignedByte();
                }
            }}
        }}

        }__CLR4_5_258b58blx1doaa3.R.inc(6916);position.setLatitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_258b58blx1doaa3.R.inc(6917);position.setLongitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_258b58blx1doaa3.R.inc(6918);position.setTime(new TimeReader().readTime(buf));

        __CLR4_5_258b58blx1doaa3.R.inc(6919);buf.readUnsignedByte(); // status

        __CLR4_5_258b58blx1doaa3.R.inc(6920);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_258b58blx1doaa3.R.iget(6921)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6922)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6923);position.setAltitude(buf.readUnsignedShort());
            __CLR4_5_258b58blx1doaa3.R.inc(6924);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_258b58blx1doaa3.R.inc(6925);position.setCourse(buf.readByte());
            __CLR4_5_258b58blx1doaa3.R.inc(6926);position.set(Event.KEY_ODOMETER, new FloatReader().readFloat(buf));
        }

        }__CLR4_5_258b58blx1doaa3.R.inc(6927);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_258b58blx1doaa3.R.iget(6928)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6929)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6930);new FloatReader().readFloat(buf); // fuel consumtion
            __CLR4_5_258b58blx1doaa3.R.inc(6931);position.set("hours", new FloatReader().readFloat(buf));
            __CLR4_5_258b58blx1doaa3.R.inc(6932);position.set("tank", buf.readUnsignedByte() * 0.4);
        }

        }__CLR4_5_258b58blx1doaa3.R.inc(6933);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_258b58blx1doaa3.R.iget(6934)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6935)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6936);position.set("engine", buf.readUnsignedShort() * 0.125);
            __CLR4_5_258b58blx1doaa3.R.inc(6937);position.set("pedals", buf.readUnsignedByte());
            __CLR4_5_258b58blx1doaa3.R.inc(6938);position.set(Event.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
            __CLR4_5_258b58blx1doaa3.R.inc(6939);buf.readUnsignedShort(); // service odometer
        }

        }__CLR4_5_258b58blx1doaa3.R.inc(6940);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_258b58blx1doaa3.R.iget(6941)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6942)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6943);position.set(Event.KEY_FUEL, buf.readUnsignedShort());
            __CLR4_5_258b58blx1doaa3.R.inc(6944);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_258b58blx1doaa3.R.inc(6945);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_258b58blx1doaa3.R.inc(6946);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_258b58blx1doaa3.R.inc(6947);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_258b58blx1doaa3.R.iget(6948)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6949)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6950);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
            __CLR4_5_258b58blx1doaa3.R.inc(6951);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
            __CLR4_5_258b58blx1doaa3.R.inc(6952);position.set(Event.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
            __CLR4_5_258b58blx1doaa3.R.inc(6953);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
        }

        }__CLR4_5_258b58blx1doaa3.R.inc(6954);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_258b58blx1doaa3.R.iget(6955)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6956)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6957);position.set(Event.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
            __CLR4_5_258b58blx1doaa3.R.inc(6958);position.set(Event.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
            __CLR4_5_258b58blx1doaa3.R.inc(6959);buf.readByte(); // microcontroller temperature

            __CLR4_5_258b58blx1doaa3.R.inc(6960);position.set(Event.KEY_GSM, buf.getUnsignedByte(buf.readerIndex()) >> 5);

            __CLR4_5_258b58blx1doaa3.R.inc(6961);int satellites = buf.readUnsignedByte() & 0x1f;
            __CLR4_5_258b58blx1doaa3.R.inc(6962);position.setValid(satellites >= 3);
            __CLR4_5_258b58blx1doaa3.R.inc(6963);position.set(Event.KEY_SATELLITES, satellites);
        }
        
        // TODO: process other data

        }__CLR4_5_258b58blx1doaa3.R.inc(6964);return position;
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_258b58blx1doaa3.R.inc(6965);
        
        __CLR4_5_258b58blx1doaa3.R.inc(6966);HttpRequest request = (HttpRequest) msg;

        __CLR4_5_258b58blx1doaa3.R.inc(6967);ChannelBuffer buf = request.getContent();
        __CLR4_5_258b58blx1doaa3.R.inc(6968);int length = buf.readableBytes();

        // Read identifier
        __CLR4_5_258b58blx1doaa3.R.inc(6969);buf.skipBytes("id=".length());
        __CLR4_5_258b58blx1doaa3.R.inc(6970);int index = ChannelBufferTools.find(buf, buf.readerIndex(), length, "&");
        __CLR4_5_258b58blx1doaa3.R.inc(6971);String uniqueId = buf.toString(buf.readerIndex(), index - buf.readerIndex(), Charset.defaultCharset());
        __CLR4_5_258b58blx1doaa3.R.inc(6972);if ((((!identify(uniqueId, channel))&&(__CLR4_5_258b58blx1doaa3.R.iget(6973)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6974)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6975);return null;
        }
        }__CLR4_5_258b58blx1doaa3.R.inc(6976);buf.skipBytes(uniqueId.length());
        __CLR4_5_258b58blx1doaa3.R.inc(6977);buf.skipBytes("&bin=".length());
        
        // Read header
        __CLR4_5_258b58blx1doaa3.R.inc(6978);short packetId = buf.readUnsignedByte();
        __CLR4_5_258b58blx1doaa3.R.inc(6979);short offset = buf.readUnsignedByte(); // dataOffset
        __CLR4_5_258b58blx1doaa3.R.inc(6980);short packetCount = buf.readUnsignedByte();
        __CLR4_5_258b58blx1doaa3.R.inc(6981);buf.readUnsignedByte(); // reserved
        __CLR4_5_258b58blx1doaa3.R.inc(6982);short parameters = buf.readUnsignedByte(); // TODO: handle timezone
        __CLR4_5_258b58blx1doaa3.R.inc(6983);buf.skipBytes(offset - 5);
        
        // Send response
        __CLR4_5_258b58blx1doaa3.R.inc(6984);if ((((channel != null)&&(__CLR4_5_258b58blx1doaa3.R.iget(6985)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6986)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6987);sendContinue(channel);
            __CLR4_5_258b58blx1doaa3.R.inc(6988);sendResponse(channel, packetId, packetCount);
        }
        
        // Parse data
        }__CLR4_5_258b58blx1doaa3.R.inc(6989);if ((((packetId == 0x31 || packetId == 0x32 || packetId == 0x36)&&(__CLR4_5_258b58blx1doaa3.R.iget(6990)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6991)==0&false))) {{
            __CLR4_5_258b58blx1doaa3.R.inc(6992);if ((((simple)&&(__CLR4_5_258b58blx1doaa3.R.iget(6993)!=0|true))||(__CLR4_5_258b58blx1doaa3.R.iget(6994)==0&false))) {{
                __CLR4_5_258b58blx1doaa3.R.inc(6995);return parseFormatA1(buf);
            } }else {{
                __CLR4_5_258b58blx1doaa3.R.inc(6996);return parseFormatA(buf);
            }
        }} //else if (0x34 0x38 0x4F 0x59)

        }__CLR4_5_258b58blx1doaa3.R.inc(6997);return null;
    }finally{__CLR4_5_258b58blx1doaa3.R.flushNeeded();}}

}
