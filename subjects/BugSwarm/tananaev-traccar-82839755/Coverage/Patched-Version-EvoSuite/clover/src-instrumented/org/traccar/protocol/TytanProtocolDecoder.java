/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class TytanProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_287w87wlx1e69f8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,10782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TytanProtocolDecoder(TytanProtocol protocol) {
        super(protocol);__CLR4_5_287w87wlx1e69f8.R.inc(10653);try{__CLR4_5_287w87wlx1e69f8.R.inc(10652);
    }finally{__CLR4_5_287w87wlx1e69f8.R.flushNeeded();}}

    private static float readSwappedFloat(ChannelBuffer buf) {try{__CLR4_5_287w87wlx1e69f8.R.inc(10654);
        __CLR4_5_287w87wlx1e69f8.R.inc(10655);byte[] bytes = new byte[4];
        __CLR4_5_287w87wlx1e69f8.R.inc(10656);buf.readBytes(bytes);
        __CLR4_5_287w87wlx1e69f8.R.inc(10657);return ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, bytes).readFloat();
    }finally{__CLR4_5_287w87wlx1e69f8.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_287w87wlx1e69f8.R.inc(10658);

        __CLR4_5_287w87wlx1e69f8.R.inc(10659);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_287w87wlx1e69f8.R.inc(10660);buf.readUnsignedByte(); // protocol
        __CLR4_5_287w87wlx1e69f8.R.inc(10661);buf.readUnsignedShort(); // length
        __CLR4_5_287w87wlx1e69f8.R.inc(10662);int index = buf.readUnsignedByte() >> 3;
        
        __CLR4_5_287w87wlx1e69f8.R.inc(10663);if ((((channel != null)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10664)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10665)==0&false))) {{
            __CLR4_5_287w87wlx1e69f8.R.inc(10666);ChannelBuffer response = ChannelBuffers.copiedBuffer(
                    "^" + index, Charset.defaultCharset());
            __CLR4_5_287w87wlx1e69f8.R.inc(10667);channel.write(response, remoteAddress);
        }
        
        }__CLR4_5_287w87wlx1e69f8.R.inc(10668);String id = String.valueOf(buf.readUnsignedInt());
        __CLR4_5_287w87wlx1e69f8.R.inc(10669);if ((((!identify(id, channel, remoteAddress))&&(__CLR4_5_287w87wlx1e69f8.R.iget(10670)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10671)==0&false))) {{
            __CLR4_5_287w87wlx1e69f8.R.inc(10672);return null;
        }

        }__CLR4_5_287w87wlx1e69f8.R.inc(10673);List<Position> positions = new LinkedList<>();
        
        __CLR4_5_287w87wlx1e69f8.R.inc(10674);while ((((buf.readableBytes() > 2)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10675)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10676)==0&false))) {{
            
            __CLR4_5_287w87wlx1e69f8.R.inc(10677);Position position = new Position();
            __CLR4_5_287w87wlx1e69f8.R.inc(10678);position.setProtocol(getProtocolName());
            __CLR4_5_287w87wlx1e69f8.R.inc(10679);position.setDeviceId(getDeviceId());
            
            __CLR4_5_287w87wlx1e69f8.R.inc(10680);int end = buf.readerIndex() + buf.readUnsignedByte();
            
            __CLR4_5_287w87wlx1e69f8.R.inc(10681);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            
            __CLR4_5_287w87wlx1e69f8.R.inc(10682);int flags = buf.readUnsignedByte();
            __CLR4_5_287w87wlx1e69f8.R.inc(10683);position.set(Event.KEY_SATELLITES, BitUtil.range(flags, 2));
            __CLR4_5_287w87wlx1e69f8.R.inc(10684);position.setValid(BitUtil.range(flags, 0, 2) > 0);
            
            // Latitude
            __CLR4_5_287w87wlx1e69f8.R.inc(10685);double lat = buf.readUnsignedMedium();
            __CLR4_5_287w87wlx1e69f8.R.inc(10686);lat = lat * -180 / 16777216 + 90;
            __CLR4_5_287w87wlx1e69f8.R.inc(10687);position.setLatitude(lat);
            
            // Longitude
            __CLR4_5_287w87wlx1e69f8.R.inc(10688);double lon = buf.readUnsignedMedium();
            __CLR4_5_287w87wlx1e69f8.R.inc(10689);lon = lon * 360 / 16777216 - 180;
            __CLR4_5_287w87wlx1e69f8.R.inc(10690);position.setLongitude(lon);
            
            // Status
            __CLR4_5_287w87wlx1e69f8.R.inc(10691);flags = buf.readUnsignedByte();
            __CLR4_5_287w87wlx1e69f8.R.inc(10692);position.set(Event.KEY_IGNITION, BitUtil.check(flags, 0));
            __CLR4_5_287w87wlx1e69f8.R.inc(10693);position.set(Event.KEY_GSM, BitUtil.range(flags, 2, 3));
            __CLR4_5_287w87wlx1e69f8.R.inc(10694);position.setCourse((BitUtil.range(flags, 5) * 45 + 180) % 360);
            
            // Speed
            __CLR4_5_287w87wlx1e69f8.R.inc(10695);int speed = buf.readUnsignedByte();
            __CLR4_5_287w87wlx1e69f8.R.inc(10696);if ((((speed < 250)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10697)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10698)==0&false))) {{
                __CLR4_5_287w87wlx1e69f8.R.inc(10699);position.setSpeed(UnitsConverter.knotsFromKph(speed));
            }
            
            }__CLR4_5_287w87wlx1e69f8.R.inc(10700);while ((((buf.readerIndex() < end)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10701)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10702)==0&false))) {{

                __CLR4_5_287w87wlx1e69f8.R.inc(10703);int type = buf.readUnsignedByte();
                __CLR4_5_287w87wlx1e69f8.R.inc(10704);int length = buf.readUnsignedByte();
                __CLR4_5_287w87wlx1e69f8.R.inc(10705);if ((((length == 255)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10706)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10707)==0&false))) {{
                    __CLR4_5_287w87wlx1e69f8.R.inc(10708);length += buf.readUnsignedByte();
                }

                }boolean __CLB4_5_2_bool0=false;__CLR4_5_287w87wlx1e69f8.R.inc(10709);switch (type) {
                    case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10710);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10711);position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium() * 5);
                        __CLR4_5_287w87wlx1e69f8.R.inc(10712);break;
                    case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10713);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10714);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
                        __CLR4_5_287w87wlx1e69f8.R.inc(10715);break;
                    case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10716);__CLB4_5_2_bool0=true;}
                        {
                            __CLR4_5_287w87wlx1e69f8.R.inc(10717);int n = buf.readUnsignedByte() >> 4;
                            __CLR4_5_287w87wlx1e69f8.R.inc(10718);if ((((n < 2)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10719)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10720)==0&false))) {{
                                __CLR4_5_287w87wlx1e69f8.R.inc(10721);position.set(Event.PREFIX_ADC + n, readSwappedFloat(buf));
                            } }else {{
                                __CLR4_5_287w87wlx1e69f8.R.inc(10722);position.set("di" + (n - 2), readSwappedFloat(buf));
                            }
                        }}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10723);break;
                    case 7:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10724);__CLB4_5_2_bool0=true;}
                        {
                            __CLR4_5_287w87wlx1e69f8.R.inc(10725);int alarm = buf.readUnsignedByte();
                            __CLR4_5_287w87wlx1e69f8.R.inc(10726);buf.readUnsignedByte();
                            __CLR4_5_287w87wlx1e69f8.R.inc(10727);if ((((BitUtil.check(alarm, 5))&&(__CLR4_5_287w87wlx1e69f8.R.iget(10728)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10729)==0&false))) {{
                                __CLR4_5_287w87wlx1e69f8.R.inc(10730);position.set(Event.KEY_ALARM, BitUtil.range(alarm, 0, 4));
                            }
                        }}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10731);break;
                    case 8:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10732);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10733);position.set("antihijack", buf.readUnsignedByte());
                        __CLR4_5_287w87wlx1e69f8.R.inc(10734);break;
                    case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10735);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10736);position.set("authorized", ChannelBufferTools.readHexString(buf, 16));
                        __CLR4_5_287w87wlx1e69f8.R.inc(10737);break;
                    case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10738);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10739);position.set("unauthorized", ChannelBufferTools.readHexString(buf, 16));
                        __CLR4_5_287w87wlx1e69f8.R.inc(10740);break;
                    case 24:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10741);__CLB4_5_2_bool0=true;}
                        {
                            __CLR4_5_287w87wlx1e69f8.R.inc(10742);Set<Integer> temps = new LinkedHashSet<>();
                            __CLR4_5_287w87wlx1e69f8.R.inc(10743);int temp = buf.readUnsignedByte();
                            __CLR4_5_287w87wlx1e69f8.R.inc(10744);for (int i = 3; (((i >= 0)&&(__CLR4_5_287w87wlx1e69f8.R.iget(10745)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10746)==0&false)); i--) {{
                                __CLR4_5_287w87wlx1e69f8.R.inc(10747);int n = (temp >> (2 * i)) & 0x03;
                                __CLR4_5_287w87wlx1e69f8.R.inc(10748);if ((((!temps.contains(n))&&(__CLR4_5_287w87wlx1e69f8.R.iget(10749)!=0|true))||(__CLR4_5_287w87wlx1e69f8.R.iget(10750)==0&false))) {{
                                    __CLR4_5_287w87wlx1e69f8.R.inc(10751);temps.add(n);
                                }
                            }}
                            }__CLR4_5_287w87wlx1e69f8.R.inc(10752);for (int n : temps) {{
                                __CLR4_5_287w87wlx1e69f8.R.inc(10753);position.set(Event.PREFIX_TEMP + n, buf.readUnsignedByte());
                            }
                        }}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10754);break;
                    case 28:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10755);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10756);position.set("weight", buf.readUnsignedShort());
                        __CLR4_5_287w87wlx1e69f8.R.inc(10757);buf.readUnsignedByte();
                        __CLR4_5_287w87wlx1e69f8.R.inc(10758);break;
                    case 90:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10759);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10760);position.set(Event.KEY_POWER, readSwappedFloat(buf));
                        __CLR4_5_287w87wlx1e69f8.R.inc(10761);break;
                    case 101:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10762);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10763);position.set(Event.KEY_OBD_SPEED, buf.readUnsignedByte());
                        __CLR4_5_287w87wlx1e69f8.R.inc(10764);break;
                    case 102:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10765);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10766);position.set(Event.KEY_RPM, buf.readUnsignedByte() * 50);
                        __CLR4_5_287w87wlx1e69f8.R.inc(10767);break;
                    case 107:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10768);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10769);position.set(Event.KEY_FUEL, (buf.readUnsignedShort() & 0x3fff) * 0.5);
                        __CLR4_5_287w87wlx1e69f8.R.inc(10770);break;
                    case 108:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10771);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10772);position.set(Event.KEY_OBD_ODOMETER, buf.readUnsignedInt() * 5);
                        __CLR4_5_287w87wlx1e69f8.R.inc(10773);break;
                    case 150:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10774);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10775);position.set("door", buf.readUnsignedByte());
                        __CLR4_5_287w87wlx1e69f8.R.inc(10776);break;
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_287w87wlx1e69f8.R.inc(10777);__CLB4_5_2_bool0=true;}
                        __CLR4_5_287w87wlx1e69f8.R.inc(10778);buf.skipBytes(length);
                        __CLR4_5_287w87wlx1e69f8.R.inc(10779);break;
                }
            }

            }__CLR4_5_287w87wlx1e69f8.R.inc(10780);positions.add(position);
        }
        
        }__CLR4_5_287w87wlx1e69f8.R.inc(10781);return positions;
    }finally{__CLR4_5_287w87wlx1e69f8.R.flushNeeded();}}

}
