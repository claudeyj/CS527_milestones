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

@java.lang.SuppressWarnings({"fallthrough"}) public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dn9dn9lx1dxpsx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,17917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol) {
        super(protocol);__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17686);try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17685);
    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private DeviceSession parseIdentification(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17687);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17688);int length = buf.readUnsignedShort();
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17689);String imei = buf.toString(buf.readerIndex(), length, StandardCharsets.US_ASCII);
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17690);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17691);if ((((channel != null)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17692)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17693)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17694);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17695);if ((((deviceSession != null)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17696)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17697)==0&false))) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17698);response.writeByte(1);
            } }else {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17699);response.writeByte(0);
            }
            }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17700);channel.write(response);
        }
        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17701);return deviceSession;
    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    public static final int CODEC_GH3000 = 0x07;
    public static final int CODEC_FM4X00 = 0x08;
    public static final int CODEC_12 = 0x0C;

    private void decodeSerial(Position position, ChannelBuffer buf) {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17702);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17703);getLastLocation(position, null);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17704);position.set(Position.KEY_TYPE, buf.readUnsignedByte());

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17705);position.set("command", buf.readBytes(buf.readInt()).toString(StandardCharsets.US_ASCII));

    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private void decodeParameter(Position position, int id, ChannelBuffer buf, int length) {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17706);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17707);switch (id) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17708);__CLB4_5_2_bool0=true;}
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17709);__CLB4_5_2_bool0=true;}
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17710);__CLB4_5_2_bool0=true;}
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17711);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17712);position.set("di" + id, buf.readUnsignedByte());
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17713);break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17714);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17715);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17716);break;
            case 21:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17717);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17718);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17719);break;
            case 22:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17720);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17721);position.set("profile", buf.readUnsignedByte());
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17722);break;
            case 66:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17723);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17724);position.set(Position.KEY_POWER, buf.readUnsignedShort() + "mV");
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17725);break;
            case 67:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17726);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17727);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() + "mV");
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17728);break;
            case 70:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17729);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17730);position.set("pcbTemp", buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17731);break;
            case 72:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17732);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17733);position.set(Position.PREFIX_TEMP + 1, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17734);break;
            case 73:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17735);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17736);position.set(Position.PREFIX_TEMP + 2, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17737);break;
            case 74:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17738);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17739);position.set(Position.PREFIX_TEMP + 3, buf.readInt() * 0.1);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17740);break;
            case 78:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17741);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17742);position.set(Position.KEY_RFID, buf.readLong());
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17743);break;
            case 182:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17744);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17745);position.set(Position.KEY_HDOP, buf.readUnsignedShort() * 0.1);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17746);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17747);__CLB4_5_2_bool0=true;}
                boolean __CLB4_5_2_bool1=false;__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17748);switch (length) {
                    case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17749);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17750);position.set(Position.PREFIX_IO + id, buf.readUnsignedByte());
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17751);break;
                    case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17752);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17753);position.set(Position.PREFIX_IO + id, buf.readUnsignedShort());
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17754);break;
                    case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17755);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17756);position.set(Position.PREFIX_IO + id, buf.readUnsignedInt());
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17757);break;
                    case 8:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17758);__CLB4_5_2_bool1=true;}
                    default:if (!__CLB4_5_2_bool1) {__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17759);__CLB4_5_2_bool1=true;}
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17760);position.set(Position.PREFIX_IO + id, buf.readLong());
                        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17761);break;
                }
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17762);break;
        }
    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private void decodeLocation(Position position, ChannelBuffer buf, int codec) {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17763);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17764);int globalMask = 0x0f;

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17765);if ((((codec == CODEC_GH3000)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17766)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17767)==0&false))) {{

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17768);long time = buf.readUnsignedInt() & 0x3fffffff;
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17769);time += 1167609600; // 2007-01-01 00:00:00

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17770);globalMask = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17771);if ((((BitUtil.check(globalMask, 0))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17772)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17773)==0&false))) {{

                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17774);position.setTime(new Date(time * 1000));

                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17775);int locationMask = buf.readUnsignedByte();

                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17776);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17777)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17778)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17779);position.setLatitude(buf.readFloat());
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17780);position.setLongitude(buf.readFloat());
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17781);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17782)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17783)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17784);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17785);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17786)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17787)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17788);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17789);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17790)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17791)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17792);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17793);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17794)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17795)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17796);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17797);position.set(Position.KEY_SATELLITES, satellites);
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17798);position.setValid(satellites >= 3);
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17799);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17800)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17801)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17802);position.setNetwork(new Network(
                            CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17803);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17804)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17805)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17806);buf.readUnsignedByte(); // rssi
                }

                }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17807);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17808)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17809)==0&false))) {{
                    __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17810);position.set("operator", buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17811);getLastLocation(position, new Date(time * 1000));

            }

        }} }else {{

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17812);position.setTime(new Date(buf.readLong()));

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17813);position.set("priority", buf.readUnsignedByte());

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17814);position.setLongitude(buf.readInt() / 10000000.0);
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17815);position.setLatitude(buf.readInt() / 10000000.0);
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17816);position.setAltitude(buf.readShort());
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17817);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17818);int satellites = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17819);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17820);position.setValid(satellites != 0);

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17821);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17822);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17823);buf.readUnsignedByte(); // total IO data records

        }

        // Read 1 byte data
        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17824);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17825)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17826)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17827);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17828);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17829)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17830)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17831);decodeParameter(position, buf.readUnsignedByte(), buf, 1);
            }
        }}

        // Read 2 byte data
        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17832);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17833)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17834)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17835);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17836);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17837)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17838)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17839);decodeParameter(position, buf.readUnsignedByte(), buf, 2);
            }
        }}

        // Read 4 byte data
        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17840);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17841)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17842)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17843);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17844);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17845)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17846)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17847);decodeParameter(position, buf.readUnsignedByte(), buf, 4);
            }
        }}

        // Read 8 byte data
        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17848);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17849)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17850)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17851);int cnt = buf.readUnsignedByte();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17852);for (int j = 0; (((j < cnt)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17853)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17854)==0&false)); j++) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17855);decodeParameter(position, buf.readUnsignedByte(), buf, 8);
            }
        }}

    }}finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private List<Position> parseData(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf, int packetId, String... imei) {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17856);
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17857);List<Position> positions = new LinkedList<>();

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17858);if ((((!(channel instanceof DatagramChannel))&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17859)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17860)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17861);buf.readUnsignedInt(); // data length
        }

        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17862);int codec = buf.readUnsignedByte();
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17863);int count = buf.readUnsignedByte();

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17864);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17865);if ((((deviceSession == null)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17866)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17867)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17868);return null;
        }

        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17869);for (int i = 0; (((i < count)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17870)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17871)==0&false)); i++) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17872);Position position = new Position();
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17873);position.setProtocol(getProtocolName());

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17874);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17875);if ((((codec == CODEC_12)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17876)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17877)==0&false))) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17878);decodeSerial(position, buf);
            } }else {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17879);decodeLocation(position, buf, codec);
            }

            }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17880);positions.add(position);
        }

        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17881);if ((((channel != null)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17882)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17883)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17884);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17885)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17886)==0&false))) {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17887);ChannelBuffer response = ChannelBuffers.directBuffer(5);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17888);response.writeShort(3);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17889);response.writeShort(packetId);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17890);response.writeByte(0x02);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17891);channel.write(response, remoteAddress);
            } }else {{
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17892);ChannelBuffer response = ChannelBuffers.directBuffer(4);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17893);response.writeInt(count);
                __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17894);channel.write(response);
            }
        }}

        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17895);return positions;
    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17896);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17897);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17898);if ((((channel instanceof DatagramChannel)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17899)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17900)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17901);return decodeUdp(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17902);return decodeTcp(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private Object decodeTcp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17903);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17904);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17905)!=0|true))||(__CLR4_5_2dn9dn9lx1dxpsx.R.iget(17906)==0&false))) {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17907);parseIdentification(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17908);buf.skipBytes(4);
            __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17909);return parseData(channel, remoteAddress, buf, 0);
        }

        }__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17910);return null;
    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

    private Object decodeUdp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2dn9dn9lx1dxpsx.R.inc(17911);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17912);buf.skipBytes(2);
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17913);int packetId = buf.readUnsignedShort();
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17914);buf.skipBytes(2);
        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17915);String imei = buf.readBytes(buf.readUnsignedShort()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2dn9dn9lx1dxpsx.R.inc(17916);return parseData(channel, remoteAddress, buf, packetId, imei);

    }finally{__CLR4_5_2dn9dn9lx1dxpsx.R.flushNeeded();}}

}
