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
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
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

@java.lang.SuppressWarnings({"fallthrough"}) public class Mta6ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25ow5owlx1e44nd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,7595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final boolean simple;

    public Mta6ProtocolDecoder(Protocol protocol, boolean simple) {
        super(protocol);__CLR4_5_25ow5owlx1e44nd.R.inc(7377);try{__CLR4_5_25ow5owlx1e44nd.R.inc(7376);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7378);this.simple = simple;
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}

    private void sendContinue(Channel channel) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7379);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7380);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7381);channel.write(response);
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}
    
    private void sendResponse(Channel channel, short packetId, short packetCount) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7382);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7383);HttpResponse response = new DefaultHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.OK);

        __CLR4_5_25ow5owlx1e44nd.R.inc(7384);ChannelBuffer begin = ChannelBuffers.copiedBuffer("#ACK#", Charset.defaultCharset());
        __CLR4_5_25ow5owlx1e44nd.R.inc(7385);ChannelBuffer end = ChannelBuffers.directBuffer(3);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7386);end.writeByte(packetId);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7387);end.writeByte(packetCount);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7388);end.writeByte(0);
        
        __CLR4_5_25ow5owlx1e44nd.R.inc(7389);response.setContent(ChannelBuffers.wrappedBuffer(begin, end));
        __CLR4_5_25ow5owlx1e44nd.R.inc(7390);channel.write(response);
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}
    
    private static class FloatReader {
        
        private int previousFloat;
        
        public float readFloat(ChannelBuffer buf) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7391);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_25ow5owlx1e44nd.R.inc(7392);switch (buf.getUnsignedByte(buf.readerIndex()) >> 6)
            {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_25ow5owlx1e44nd.R.inc(7393);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7394);previousFloat = buf.readInt() << 2;
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7395);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_25ow5owlx1e44nd.R.inc(7396);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7397);previousFloat = (previousFloat & 0xffffff00) + ((buf.readUnsignedByte() & 0x3f) << 2);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7398);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_25ow5owlx1e44nd.R.inc(7399);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7400);previousFloat = (previousFloat & 0xffff0000) + ((buf.readUnsignedShort() & 0x3fff) << 2);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7401);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_25ow5owlx1e44nd.R.inc(7402);__CLB4_5_2_bool0=true;}
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7403);previousFloat = (previousFloat & 0xff000000) + ((buf.readUnsignedMedium() & 0x3fffff) << 2);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7404);break;
            }
            __CLR4_5_25ow5owlx1e44nd.R.inc(7405);return Float.intBitsToFloat(previousFloat);
        }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}
        
    }
    
    private static class TimeReader extends FloatReader {
        
        private long weekNumber;
        
        public Date readTime(ChannelBuffer buf) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7406);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7407);long weekTime = (long) (readFloat(buf) * 1000);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7408);if ((((weekNumber == 0)&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7409)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7410)==0&false))) {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7411);weekNumber = buf.readUnsignedShort();
            }

            }__CLR4_5_25ow5owlx1e44nd.R.inc(7412);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_25ow5owlx1e44nd.R.inc(7413);time.clear();
            __CLR4_5_25ow5owlx1e44nd.R.inc(7414);time.set(Calendar.YEAR, 1980);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7415);time.set(Calendar.MONTH, 0);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7416);time.set(Calendar.DAY_OF_MONTH, 6);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7417);long offset = time.getTimeInMillis();

            __CLR4_5_25ow5owlx1e44nd.R.inc(7418);return new Date(offset + weekNumber * 7 * 24 * 60 * 60 * 1000 + weekTime);
        }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}
        
    }

    private List<Position> parseFormatA(ChannelBuffer buf) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7419);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7420);List<Position> positions = new LinkedList<>();
        
        __CLR4_5_25ow5owlx1e44nd.R.inc(7421);FloatReader latitudeReader = new FloatReader();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7422);FloatReader longitudeReader = new FloatReader();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7423);TimeReader timeReader = new TimeReader();
        
        __CLR4_5_25ow5owlx1e44nd.R.inc(7424);try {
            __CLR4_5_25ow5owlx1e44nd.R.inc(7425);while ((((buf.readable())&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7426)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7427)==0&false))) {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7428);Position position = new Position();
                __CLR4_5_25ow5owlx1e44nd.R.inc(7429);position.setDeviceId(getDeviceId());
                __CLR4_5_25ow5owlx1e44nd.R.inc(7430);position.setProtocol(getProtocolName());

                __CLR4_5_25ow5owlx1e44nd.R.inc(7431);short flags = buf.readUnsignedByte();

                // Skip events
                __CLR4_5_25ow5owlx1e44nd.R.inc(7432);short event = buf.readUnsignedByte();
                __CLR4_5_25ow5owlx1e44nd.R.inc(7433);if ((((BitUtil.check(event, 7))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7434)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7435)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7436);if ((((BitUtil.check(event, 6))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7437)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7438)==0&false))) {{
                        __CLR4_5_25ow5owlx1e44nd.R.inc(7439);buf.skipBytes(8);
                    } }else {{
                        __CLR4_5_25ow5owlx1e44nd.R.inc(7440);while ((((BitUtil.check(event, 7))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7441)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7442)==0&false))) {{
                            __CLR4_5_25ow5owlx1e44nd.R.inc(7443);event = buf.readUnsignedByte();
                        }
                    }}
                }}

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7444);position.setLatitude(latitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_25ow5owlx1e44nd.R.inc(7445);position.setLongitude(longitudeReader.readFloat(buf) / Math.PI * 180);
                __CLR4_5_25ow5owlx1e44nd.R.inc(7446);position.setTime(timeReader.readTime(buf));

                __CLR4_5_25ow5owlx1e44nd.R.inc(7447);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7448)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7449)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7450);buf.readUnsignedByte(); // status
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7451);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7452)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7453)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7454);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7455);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7456)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7457)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7458);position.setSpeed(buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7459);position.setCourse(buf.readUnsignedByte());
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7460);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7461)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7462)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7463);position.set(Event.KEY_ODOMETER, buf.readUnsignedShort());
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7464);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7465)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7466)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7467);position.set(Event.KEY_FUEL, buf.readUnsignedInt() + "|" + buf.readUnsignedInt());
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7468);position.set("hours1", buf.readUnsignedShort());
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7469);position.set("hours2", buf.readUnsignedShort());
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7470);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7471)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7472)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7473);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7474);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7475);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7476);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort() & 0x03ff);
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7477);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7478)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7479)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7480);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7481);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7482);position.set(Event.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7483);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
                }

                }__CLR4_5_25ow5owlx1e44nd.R.inc(7484);if ((((BitUtil.check(flags, 7))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7485)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7486)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7487);position.set(Event.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7488);position.set(Event.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7489);buf.readByte(); // microcontroller temperature

                    __CLR4_5_25ow5owlx1e44nd.R.inc(7490);position.set(Event.KEY_GSM, (buf.getUnsignedByte(buf.readerIndex()) >> 4) & 0x07);

                    __CLR4_5_25ow5owlx1e44nd.R.inc(7491);int satellites = buf.readUnsignedByte() & 0x0f;
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7492);position.setValid(satellites >= 3);
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7493);position.set(Event.KEY_SATELLITES, satellites);
                }
                }__CLR4_5_25ow5owlx1e44nd.R.inc(7494);positions.add(position);
            }
        }} catch (IndexOutOfBoundsException error) {
        }
        
        __CLR4_5_25ow5owlx1e44nd.R.inc(7495);return positions;
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}

    private Position parseFormatA1(ChannelBuffer buf) {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7496);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7497);Position position = new Position();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7498);position.setDeviceId(getDeviceId());
        __CLR4_5_25ow5owlx1e44nd.R.inc(7499);position.setProtocol(getProtocolName());

        __CLR4_5_25ow5owlx1e44nd.R.inc(7500);short flags = buf.readUnsignedByte();

        // Skip events
        __CLR4_5_25ow5owlx1e44nd.R.inc(7501);short event = buf.readUnsignedByte();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7502);if ((((BitUtil.check(event, 7))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7503)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7504)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7505);if ((((BitUtil.check(event, 6))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7506)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7507)==0&false))) {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7508);buf.skipBytes(8);
            } }else {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7509);while ((((BitUtil.check(event, 7))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7510)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7511)==0&false))) {{
                    __CLR4_5_25ow5owlx1e44nd.R.inc(7512);event = buf.readUnsignedByte();
                }
            }}
        }}

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7513);position.setLatitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7514);position.setLongitude(new FloatReader().readFloat(buf) / Math.PI * 180);
        __CLR4_5_25ow5owlx1e44nd.R.inc(7515);position.setTime(new TimeReader().readTime(buf));

        __CLR4_5_25ow5owlx1e44nd.R.inc(7516);buf.readUnsignedByte(); // status

        __CLR4_5_25ow5owlx1e44nd.R.inc(7517);if ((((BitUtil.check(flags, 0))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7518)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7519)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7520);position.setAltitude(buf.readUnsignedShort());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7521);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7522);position.setCourse(buf.readByte());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7523);position.set(Event.KEY_ODOMETER, new FloatReader().readFloat(buf));
        }

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7524);if ((((BitUtil.check(flags, 1))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7525)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7526)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7527);new FloatReader().readFloat(buf); // fuel consumtion
            __CLR4_5_25ow5owlx1e44nd.R.inc(7528);position.set("hours", new FloatReader().readFloat(buf));
            __CLR4_5_25ow5owlx1e44nd.R.inc(7529);position.set("tank", buf.readUnsignedByte() * 0.4);
        }

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7530);if ((((BitUtil.check(flags, 2))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7531)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7532)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7533);position.set("engine", buf.readUnsignedShort() * 0.125);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7534);position.set("pedals", buf.readUnsignedByte());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7535);position.set(Event.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7536);buf.readUnsignedShort(); // service odometer
        }

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7537);if ((((BitUtil.check(flags, 3))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7538)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7539)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7540);position.set(Event.KEY_FUEL, buf.readUnsignedShort());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7541);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7542);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7543);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7544);if ((((BitUtil.check(flags, 4))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7545)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7546)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7547);position.set(Event.PREFIX_TEMP + 1, buf.readByte());
            __CLR4_5_25ow5owlx1e44nd.R.inc(7548);buf.getUnsignedByte(buf.readerIndex()); // control (>> 4)
            __CLR4_5_25ow5owlx1e44nd.R.inc(7549);position.set(Event.KEY_INPUT, buf.readUnsignedShort() & 0x0fff);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7550);buf.readUnsignedShort(); // old sensor state (& 0x0fff)
        }

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7551);if ((((BitUtil.check(flags, 5))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7552)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7553)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7554);position.set(Event.KEY_BATTERY, buf.getUnsignedByte(buf.readerIndex()) >> 2);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7555);position.set(Event.KEY_POWER, buf.readUnsignedShort() & 0x03ff);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7556);buf.readByte(); // microcontroller temperature

            __CLR4_5_25ow5owlx1e44nd.R.inc(7557);position.set(Event.KEY_GSM, buf.getUnsignedByte(buf.readerIndex()) >> 5);

            __CLR4_5_25ow5owlx1e44nd.R.inc(7558);int satellites = buf.readUnsignedByte() & 0x1f;
            __CLR4_5_25ow5owlx1e44nd.R.inc(7559);position.setValid(satellites >= 3);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7560);position.set(Event.KEY_SATELLITES, satellites);
        }
        
        // TODO: process other data

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7561);return position;
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_25ow5owlx1e44nd.R.inc(7562);
        
        __CLR4_5_25ow5owlx1e44nd.R.inc(7563);HttpRequest request = (HttpRequest) msg;

        __CLR4_5_25ow5owlx1e44nd.R.inc(7564);ChannelBuffer buf = request.getContent();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7565);int length = buf.readableBytes();

        // Read identifier
        __CLR4_5_25ow5owlx1e44nd.R.inc(7566);buf.skipBytes("id=".length());
        __CLR4_5_25ow5owlx1e44nd.R.inc(7567);int index = ChannelBufferTools.find(buf, buf.readerIndex(), length, "&");
        __CLR4_5_25ow5owlx1e44nd.R.inc(7568);String uniqueId = buf.toString(buf.readerIndex(), index - buf.readerIndex(), Charset.defaultCharset());
        __CLR4_5_25ow5owlx1e44nd.R.inc(7569);if ((((!identify(uniqueId, channel))&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7570)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7571)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7572);return null;
        }
        }__CLR4_5_25ow5owlx1e44nd.R.inc(7573);buf.skipBytes(uniqueId.length());
        __CLR4_5_25ow5owlx1e44nd.R.inc(7574);buf.skipBytes("&bin=".length());
        
        // Read header
        __CLR4_5_25ow5owlx1e44nd.R.inc(7575);short packetId = buf.readUnsignedByte();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7576);short offset = buf.readUnsignedByte(); // dataOffset
        __CLR4_5_25ow5owlx1e44nd.R.inc(7577);short packetCount = buf.readUnsignedByte();
        __CLR4_5_25ow5owlx1e44nd.R.inc(7578);buf.readUnsignedByte(); // reserved
        __CLR4_5_25ow5owlx1e44nd.R.inc(7579);short parameters = buf.readUnsignedByte(); // TODO: handle timezone
        __CLR4_5_25ow5owlx1e44nd.R.inc(7580);buf.skipBytes(offset - 5);
        
        // Send response
        __CLR4_5_25ow5owlx1e44nd.R.inc(7581);if ((((channel != null)&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7582)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7583)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7584);sendContinue(channel);
            __CLR4_5_25ow5owlx1e44nd.R.inc(7585);sendResponse(channel, packetId, packetCount);
        }
        
        // Parse data
        }__CLR4_5_25ow5owlx1e44nd.R.inc(7586);if ((((packetId == 0x31 || packetId == 0x32 || packetId == 0x36)&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7587)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7588)==0&false))) {{
            __CLR4_5_25ow5owlx1e44nd.R.inc(7589);if ((((simple)&&(__CLR4_5_25ow5owlx1e44nd.R.iget(7590)!=0|true))||(__CLR4_5_25ow5owlx1e44nd.R.iget(7591)==0&false))) {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7592);return parseFormatA1(buf);
            } }else {{
                __CLR4_5_25ow5owlx1e44nd.R.inc(7593);return parseFormatA(buf);
            }
        }} //else if (0x34 0x38 0x4F 0x59)

        }__CLR4_5_25ow5owlx1e44nd.R.inc(7594);return null;
    }finally{__CLR4_5_25ow5owlx1e44nd.R.flushNeeded();}}

}
