/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.socket.DatagramChannel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dn9dn9lx1e1lx2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,17913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol) {
        super(protocol);__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17686);try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17685);
    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private DeviceSession parseIdentification(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17687);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17688);int length = buf.readUnsignedShort();
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17689);String imei = buf.toString(buf.readerIndex(), length, StandardCharsets.US_ASCII);
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17690);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17691);if ((((channel != null)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17692)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17693)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17694);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17695);if ((((deviceSession != null)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17696)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17697)==0&false))) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17698);response.writeByte(1);
            } }else {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17699);response.writeByte(0);
            }
            }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17700);channel.write(response);
        }
        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17701);return deviceSession;
    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    public static final int CODEC_GH3000 = 0x07;
    public static final int CODEC_FM4X00 = 0x08;
    public static final int CODEC_12 = 0x0C;

    private void decodeSerial(Position position, ChannelBuffer buf) {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17702);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17703);getLastLocation(position, null);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17704);position.set(Position.KEY_TYPE, buf.readUnsignedByte());

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17705);position.set("command", buf.readBytes(buf.readInt()).toString(StandardCharsets.US_ASCII));

    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private void decodeParameter(Position position, int id, ChannelBuffer buf, int length) {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17706);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17707);switch (id) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17708);__CLB4_5_2_bool0=true;}
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17709);__CLB4_5_2_bool0=true;}
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17710);__CLB4_5_2_bool0=true;}
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17711);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17712);position.set("di" + id, buf.readUnsignedByte());
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17713);break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17714);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17715);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17716);break;
            case 66:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17717);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17718);position.set(Position.KEY_POWER, buf.readUnsignedShort() + "mV");
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17719);break;
            case 67:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17720);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17721);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() + "mV");
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17722);break;
            case 70:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17723);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17724);position.set("pcbTemp", ((((length == 4 )&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17725)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17726)==0&false))? buf.readInt() : buf.readShort()) * 0.1);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17727);break;
            case 72:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17728);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17729);position.set(Position.PREFIX_TEMP + 1, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17730);break;
            case 73:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17731);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17732);position.set(Position.PREFIX_TEMP + 2, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17733);break;
            case 74:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17734);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17735);position.set(Position.PREFIX_TEMP + 3, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17736);break;
            case 78:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17737);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17738);position.set(Position.KEY_RFID, buf.readLong());
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17739);break;
            case 182:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17740);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17741);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17742);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17743);__CLB4_5_2_bool0=true;}
                boolean __CLB4_5_2_bool1=false;__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17744);switch (length) {
                    case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17745);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17746);position.set(Position.PREFIX_IO + id, buf.readUnsignedByte());
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17747);break;
                    case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17748);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17749);position.set(Position.PREFIX_IO + id, buf.readUnsignedShort());
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17750);break;
                    case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17751);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17752);position.set(Position.PREFIX_IO + id, buf.readUnsignedInt());
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17753);break;
                    case 8:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17754);__CLB4_5_2_bool1=true;}
                    default:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17755);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17756);position.set(Position.PREFIX_IO + id, buf.readLong());
                        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17757);break;
                }
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17758);break;
        }
    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private void decodeLocation(Position position, ChannelBuffer buf, int codec) {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17759);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17760);int globalMask = 0x0f;

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17761);if ((((codec == CODEC_GH3000)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17762)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17763)==0&false))) {{

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17764);long time = buf.readUnsignedInt() & 0x3fffffff;
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17765);time += 1167609600; // 2007-01-01 00:00:00

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17766);globalMask = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17767);if ((((BitUtil.check(globalMask, 0))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17768)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17769)==0&false))) {{

                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17770);position.setTime(new Date(time * 1000));

                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17771);int locationMask = buf.readUnsignedByte();

                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17772);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17773)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17774)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17775);position.setLatitude(buf.readFloat());
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17776);position.setLongitude(buf.readFloat());
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17777);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17778)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17779)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17780);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17781);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17782)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17783)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17784);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17785);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17786)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17787)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17788);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17789);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17790)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17791)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17792);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17793);position.set(Position.KEY_SATELLITES, satellites);
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17794);position.setValid(satellites >= 3);
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17795);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17796)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17797)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17798);position.setNetwork(new Network(
                            CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17799);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17800)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17801)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17802);buf.readUnsignedByte(); // rssi
                }

                }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17803);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17804)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17805)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17806);position.set("operator", buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17807);getLastLocation(position, new Date(time * 1000));

            }

        }} }else {{

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17808);position.setTime(new Date(buf.readLong()));

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17809);position.set("priority", buf.readUnsignedByte());

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17810);position.setLongitude(buf.readInt() / 10000000.0);
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17811);position.setLatitude(buf.readInt() / 10000000.0);
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17812);position.setAltitude(buf.readShort());
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17813);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17814);int satellites = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17815);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17816);position.setValid(satellites != 0);

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17817);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17818);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17819);buf.readUnsignedByte(); // total IO data records

        }

        // Read 1 byte data
        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17820);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17821)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17822)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17823);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17824);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17825)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17826)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17827);decodeParameter(position, buf.readUnsignedByte(), buf, 1);
            }
        }}

        // Read 2 byte data
        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17828);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17829)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17830)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17831);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17832);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17833)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17834)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17835);decodeParameter(position, buf.readUnsignedByte(), buf, 2);
            }
        }}

        // Read 4 byte data
        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17836);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17837)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17838)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17839);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17840);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17841)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17842)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17843);decodeParameter(position, buf.readUnsignedByte(), buf, 4);
            }
        }}

        // Read 8 byte data
        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17844);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17845)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17846)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17847);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17848);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17849)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17850)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17851);decodeParameter(position, buf.readUnsignedByte(), buf, 8);
            }
        }}

    }}finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private List<Position> parseData(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf, int packetId, String... imei) {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17852);
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17853);List<Position> positions = new LinkedList<>();

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17854);if ((((!(channel instanceof DatagramChannel))&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17855)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17856)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17857);buf.readUnsignedInt(); // data length
        }

        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17858);int codec = buf.readUnsignedByte();
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17859);int count = buf.readUnsignedByte();

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17860);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17861);if ((((deviceSession == null)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17862)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17863)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17864);return null;
        }

        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17865);for (int i = 0; (((i < count)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17866)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17867)==0&false)); i++) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17868);Position position = new Position();
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17869);position.setProtocol(getProtocolName());

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17870);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17871);if ((((codec == CODEC_12)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17872)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17873)==0&false))) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17874);decodeSerial(position, buf);
            } }else {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17875);decodeLocation(position, buf, codec);
            }

            }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17876);positions.add(position);
        }

        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17877);if ((((channel != null)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17878)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17879)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17880);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17881)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17882)==0&false))) {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17883);ChannelBuffer response = ChannelBuffers.directBuffer(5);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17884);response.writeShort(3);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17885);response.writeShort(packetId);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17886);response.writeByte(0x02);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17887);channel.write(response, remoteAddress);
            } }else {{
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17888);ChannelBuffer response = ChannelBuffers.directBuffer(4);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17889);response.writeInt(count);
                __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17890);channel.write(response);
            }
        }}

        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17891);return positions;
    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17892);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17893);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17894);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17895)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17896)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17897);return decodeUdp(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17898);return decodeTcp(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private Object decodeTcp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17899);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17900);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17901)!=0|true))||(__CLR4_5_2dn9dn9lx1e1lx2.R.iget(17902)==0&false))) {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17903);parseIdentification(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17904);buf.skipBytes(4);
            __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17905);return parseData(channel, remoteAddress, buf, 0);
        }

        }__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17906);return null;
    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

    private Object decodeUdp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2dn9dn9lx1e1lx2.R.inc(17907);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17908);buf.skipBytes(2);
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17909);int packetId = buf.readUnsignedShort();
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17910);buf.skipBytes(2);
        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17911);String imei = buf.readBytes(buf.readUnsignedShort()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2dn9dn9lx1e1lx2.R.inc(17912);return parseData(channel, remoteAddress, buf, packetId, imei);

    }finally{__CLR4_5_2dn9dn9lx1e1lx2.R.flushNeeded();}}

}
