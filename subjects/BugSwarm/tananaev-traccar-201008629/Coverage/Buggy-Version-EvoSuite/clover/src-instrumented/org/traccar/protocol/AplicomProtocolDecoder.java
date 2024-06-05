/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.Checksum;
import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

@java.lang.SuppressWarnings({"fallthrough"}) public class AplicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2543543lx1dvcb4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,7103,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AplicomProtocolDecoder(AplicomProtocol protocol) {
        super(protocol);__CLR4_5_2543543lx1dvcb4.R.inc(6628);try{__CLR4_5_2543543lx1dvcb4.R.inc(6627);
    }finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private static final long IMEI_BASE_TC65_V20 = 0x1437207000000L;
    private static final long IMEI_BASE_TC65_V28 = 358244010000000L;
    private static final long IMEI_BASE_TC65I_V11 = 0x14143B4000000L;

    private static boolean validateImei(long imei) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6629);
        __CLR4_5_2543543lx1dvcb4.R.inc(6630);return Checksum.luhn(imei / 10) == imei % 10;
    }finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private static long imeiFromUnitId(long unitId) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6631);

        __CLR4_5_2543543lx1dvcb4.R.inc(6632);if ((((unitId == 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6633)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6634)==0&false))) {{

            __CLR4_5_2543543lx1dvcb4.R.inc(6635);return 0;

        } }else {{

            // Try TC65i
            __CLR4_5_2543543lx1dvcb4.R.inc(6636);long imei = IMEI_BASE_TC65I_V11 + unitId;
            __CLR4_5_2543543lx1dvcb4.R.inc(6637);if ((((validateImei(imei))&&(__CLR4_5_2543543lx1dvcb4.R.iget(6638)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6639)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6640);return imei;
            }

            // Try TC65 v2.8
            }__CLR4_5_2543543lx1dvcb4.R.inc(6641);imei = IMEI_BASE_TC65_V28 + ((unitId + 0xA8180) & 0xFFFFFF);
            __CLR4_5_2543543lx1dvcb4.R.inc(6642);if ((((validateImei(imei))&&(__CLR4_5_2543543lx1dvcb4.R.iget(6643)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6644)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6645);return imei;
            }

            // Try TC65 v2.0
            }__CLR4_5_2543543lx1dvcb4.R.inc(6646);imei = IMEI_BASE_TC65_V20 + unitId;
            __CLR4_5_2543543lx1dvcb4.R.inc(6647);if ((((validateImei(imei))&&(__CLR4_5_2543543lx1dvcb4.R.iget(6648)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6649)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6650);return imei;
            }

        }}

        }__CLR4_5_2543543lx1dvcb4.R.inc(6651);return unitId;
    }finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private static final int DEFAULT_SELECTOR_D = 0x0002fC;
    private static final int DEFAULT_SELECTOR_E = 0x007ffc;

    private static final int EVENT_DATA = 119;

    private void decodeEventData(Position position, ChannelBuffer buf, int event) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6652);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2543543lx1dvcb4.R.inc(6653);switch (event) {
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6654);__CLB4_5_2_bool0=true;}
            case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6655);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6656);buf.readUnsignedByte();
                __CLR4_5_2543543lx1dvcb4.R.inc(6657);break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6658);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6659);buf.readUnsignedMedium();
                __CLR4_5_2543543lx1dvcb4.R.inc(6660);break;
            case 31:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6661);__CLB4_5_2_bool0=true;}
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6662);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6663);buf.readUnsignedShort();
                __CLR4_5_2543543lx1dvcb4.R.inc(6664);break;
            case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6665);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6666);buf.skipBytes(4 * 9);
                __CLR4_5_2543543lx1dvcb4.R.inc(6667);break;
            case 113:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6668);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6669);buf.readUnsignedInt();
                __CLR4_5_2543543lx1dvcb4.R.inc(6670);buf.readUnsignedByte();
                __CLR4_5_2543543lx1dvcb4.R.inc(6671);break;
            case 121:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6672);__CLB4_5_2_bool0=true;}
            case 142:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6673);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6674);buf.readLong();
                __CLR4_5_2543543lx1dvcb4.R.inc(6675);break;
            case 130:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6676);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6677);buf.readUnsignedInt(); // incorrect
                __CLR4_5_2543543lx1dvcb4.R.inc(6678);break;
            case 188:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6679);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6680);decodeEB(position, buf);
                __CLR4_5_2543543lx1dvcb4.R.inc(6681);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2543543lx1dvcb4.R.inc(6682);__CLB4_5_2_bool0=true;}
                __CLR4_5_2543543lx1dvcb4.R.inc(6683);break;
        }
    }finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private void decodeCanData(ChannelBuffer buf, Position position) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6684);

        __CLR4_5_2543543lx1dvcb4.R.inc(6685);buf.readUnsignedMedium(); // packet identifier
        __CLR4_5_2543543lx1dvcb4.R.inc(6686);buf.readUnsignedByte(); // version
        __CLR4_5_2543543lx1dvcb4.R.inc(6687);int count = buf.readUnsignedByte();
        __CLR4_5_2543543lx1dvcb4.R.inc(6688);buf.readUnsignedByte(); // batch count
        __CLR4_5_2543543lx1dvcb4.R.inc(6689);buf.readUnsignedShort(); // selector bit
        __CLR4_5_2543543lx1dvcb4.R.inc(6690);buf.readUnsignedInt(); // timestamp

        __CLR4_5_2543543lx1dvcb4.R.inc(6691);buf.skipBytes(8);

        __CLR4_5_2543543lx1dvcb4.R.inc(6692);ArrayList<ChannelBuffer> values = new ArrayList<>(count);

        __CLR4_5_2543543lx1dvcb4.R.inc(6693);for (int i = 0; (((i < count)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6694)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6695)==0&false)); i++) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6696);values.add(buf.readBytes(8));
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6697);for (int i = 0; (((i < count)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6698)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6699)==0&false)); i++) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6700);ChannelBuffer value = values.get(i);
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2543543lx1dvcb4.R.inc(6701);switch (buf.readInt()) {
                case 0x20D:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6702);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6703);position.set(Position.KEY_RPM, ChannelBuffers.swapShort(value.readShort()));
                    __CLR4_5_2543543lx1dvcb4.R.inc(6704);position.set("dieselTemperature", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6705);position.set("batteryVoltage", ChannelBuffers.swapShort(value.readShort()) * 0.01);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6706);position.set("supplyAirTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6707);break;
                case 0x30D:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6708);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6709);position.set("activeAlarm", ChannelBuffers.hexDump(value));
                    __CLR4_5_2543543lx1dvcb4.R.inc(6710);break;
                case 0x40C:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6711);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6712);position.set("airTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6713);position.set("airTempDep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6714);break;
                case 0x40D:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6715);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6716);position.set("coldUnitState", ChannelBuffers.hexDump(value));
                    __CLR4_5_2543543lx1dvcb4.R.inc(6717);break;
                case 0x50C:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6718);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6719);position.set("defrostTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6720);position.set("defrostTempDep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6721);break;
                case 0x50D:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6722);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6723);position.set("condenserPressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6724);position.set("suctionPressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_2543543lx1dvcb4.R.inc(6725);break;
                case 0x58C:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6726);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6727);value.readByte();
                    __CLR4_5_2543543lx1dvcb4.R.inc(6728);value.readShort(); // index
                    boolean __CLB4_5_2_bool2=false;__CLR4_5_2543543lx1dvcb4.R.inc(6729);switch (value.readByte()) {
                        case 0x01:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6730);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6731);position.set("setpointZone1", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                            __CLR4_5_2543543lx1dvcb4.R.inc(6732);break;
                        case 0x02:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6733);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6734);position.set("setpointZone2", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                            __CLR4_5_2543543lx1dvcb4.R.inc(6735);break;
                        case 0x05:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6736);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6737);position.set("unitType", ChannelBuffers.swapInt(value.readInt()));
                            __CLR4_5_2543543lx1dvcb4.R.inc(6738);break;
                        case 0x13:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6739);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6740);position.set("dieselHours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                            __CLR4_5_2543543lx1dvcb4.R.inc(6741);break;
                        case 0x14:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6742);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6743);position.set("electricHours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                            __CLR4_5_2543543lx1dvcb4.R.inc(6744);break;
                        case 0x17:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6745);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6746);position.set("serviceIndicator", ChannelBuffers.swapInt(value.readInt()));
                            __CLR4_5_2543543lx1dvcb4.R.inc(6747);break;
                        case 0x18:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6748);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6749);position.set("softwareVersion", ChannelBuffers.swapInt(value.readInt()) * 0.01);
                            __CLR4_5_2543543lx1dvcb4.R.inc(6750);break;
                        default:if (!__CLB4_5_2_bool2) {__CLR4_5_2543543lx1dvcb4.R.inc(6751);__CLB4_5_2_bool2=true;}
                            __CLR4_5_2543543lx1dvcb4.R.inc(6752);break;
                    }
                    __CLR4_5_2543543lx1dvcb4.R.inc(6753);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2543543lx1dvcb4.R.inc(6754);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2543543lx1dvcb4.R.inc(6755);Log.warning(new UnsupportedOperationException());
                    __CLR4_5_2543543lx1dvcb4.R.inc(6756);break;
            }
        }
    }}finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private void decodeD(Position position, ChannelBuffer buf, int selector, int event) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6757);

        __CLR4_5_2543543lx1dvcb4.R.inc(6758);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6759)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6760)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6761);position.setValid((buf.readUnsignedByte() & 0x40) != 0);
        } }else {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6762);getLastLocation(position, null);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6763);if (((((selector & 0x0004) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6764)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6765)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6766);buf.skipBytes(4); // snapshot time
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6767);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6768)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6769)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6770);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_2543543lx1dvcb4.R.inc(6771);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_2543543lx1dvcb4.R.inc(6772);position.setLongitude(buf.readInt() / 1000000.0);
            __CLR4_5_2543543lx1dvcb4.R.inc(6773);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6774);if (((((selector & 0x0010) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6775)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6776)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6777);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_2543543lx1dvcb4.R.inc(6778);buf.readUnsignedByte(); // maximum speed
            __CLR4_5_2543543lx1dvcb4.R.inc(6779);position.setCourse(buf.readUnsignedByte() * 2.0);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6780);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6781)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6782)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6783);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6784);if (((((selector & 0x0020) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6785)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6786)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6787);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2543543lx1dvcb4.R.inc(6788);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_2543543lx1dvcb4.R.inc(6789);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_2543543lx1dvcb4.R.inc(6790);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6791);if (((((selector & 0x8000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6792)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6793)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6794);position.set(Position.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            __CLR4_5_2543543lx1dvcb4.R.inc(6795);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
        }

        // Pulse rate 1
        }__CLR4_5_2543543lx1dvcb4.R.inc(6796);if (((((selector & 0x10000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6797)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6798)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6799);buf.readUnsignedShort();
            __CLR4_5_2543543lx1dvcb4.R.inc(6800);buf.readUnsignedInt();
        }

        // Pulse rate 2
        }__CLR4_5_2543543lx1dvcb4.R.inc(6801);if (((((selector & 0x20000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6802)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6803)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6804);buf.readUnsignedShort();
            __CLR4_5_2543543lx1dvcb4.R.inc(6805);buf.readUnsignedInt();
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6806);if (((((selector & 0x0080) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6807)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6808)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6809);position.set("trip1", buf.readUnsignedInt());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6810);if (((((selector & 0x0100) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6811)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6812)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6813);position.set("trip2", buf.readUnsignedInt());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6814);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6815)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6816)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6817);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6818);if (((((selector & 0x0200) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6819)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6820)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6821);position.set(Position.KEY_RFID, (((long) buf.readUnsignedShort()) << 32) + buf.readUnsignedInt());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6822);if (((((selector & 0x0400) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6823)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6824)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6825);buf.readUnsignedByte(); // Keypad
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6826);if (((((selector & 0x0800) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6827)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6828)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6829);position.setAltitude(buf.readShort());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6830);if (((((selector & 0x2000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6831)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6832)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6833);buf.readUnsignedShort(); // snapshot counter
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6834);if (((((selector & 0x4000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6835)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6836)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6837);buf.skipBytes(8); // state flags
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6838);if (((((selector & 0x80000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6839)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6840)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6841);buf.skipBytes(11); // cell info
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6842);if (((((selector & 0x1000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6843)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6844)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6845);decodeEventData(position, buf, event);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6846);if ((((Context.getConfig().getBoolean(getProtocolName() + ".can")
                && buf.readable() && (selector & 0x1000) != 0 && event == EVENT_DATA)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6847)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6848)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6849);decodeCanData(buf, position);
        }
    }}finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private void decodeE(Position position, ChannelBuffer buf, int selector) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6850);

        __CLR4_5_2543543lx1dvcb4.R.inc(6851);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6852)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6853)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6854);position.set("tachographEvent", buf.readUnsignedShort());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6855);if (((((selector & 0x0004) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6856)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6857)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6858);getLastLocation(position, new Date(buf.readUnsignedInt() * 1000));
        } }else {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6859);getLastLocation(position, null);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6860);if (((((selector & 0x0010) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6861)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6862)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6863);String time = buf.readUnsignedByte() + "s " + buf.readUnsignedByte() + "m " + buf.readUnsignedByte() + "h "
                    + buf.readUnsignedByte() + "M " + buf.readUnsignedByte() + "D " + buf.readUnsignedByte() + "Y "
                    + buf.readByte() + "m " + buf.readByte() + "h";
            __CLR4_5_2543543lx1dvcb4.R.inc(6864);position.set("tachographTime", time);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6865);position.set("workState", buf.readUnsignedByte());
        __CLR4_5_2543543lx1dvcb4.R.inc(6866);position.set("driver1State", buf.readUnsignedByte());
        __CLR4_5_2543543lx1dvcb4.R.inc(6867);position.set("driver2State", buf.readUnsignedByte());

        __CLR4_5_2543543lx1dvcb4.R.inc(6868);if (((((selector & 0x0020) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6869)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6870)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6871);position.set("tachographStatus", buf.readUnsignedByte());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6872);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6873)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6874)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6875);position.set(Position.KEY_OBD_SPEED, buf.readUnsignedShort() / 256.0);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6876);if (((((selector & 0x0080) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6877)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6878)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6879);position.set(Position.KEY_OBD_ODOMETER, buf.readUnsignedInt() * 5);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6880);if (((((selector & 0x0100) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6881)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6882)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6883);position.set(Position.KEY_TRIP_ODOMETER, buf.readUnsignedInt() * 5);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6884);if (((((selector & 0x8000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6885)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6886)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6887);position.set("kFactor", buf.readUnsignedShort() * 0.001 + " pulses/m");
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6888);if (((((selector & 0x0200) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6889)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6890)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6891);position.set(Position.KEY_RPM, buf.readUnsignedShort() * 0.125);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6892);if (((((selector & 0x0400) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6893)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6894)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6895);position.set("extraInfo", buf.readUnsignedShort());
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6896);if (((((selector & 0x0800) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6897)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6898)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6899);position.set(Position.KEY_VIN, buf.readBytes(18).toString(StandardCharsets.US_ASCII).trim());
        }
    }}finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private void decodeH(Position position, ChannelBuffer buf, int selector) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6900);

        __CLR4_5_2543543lx1dvcb4.R.inc(6901);if (((((selector & 0x0004) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6902)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6903)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6904);getLastLocation(position, new Date(buf.readUnsignedInt() * 1000));
        } }else {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6905);getLastLocation(position, null);
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6906);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6907)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6908)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6909);buf.readUnsignedInt(); // reset time
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6910);if (((((selector & 0x2000) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6911)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6912)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6913);buf.readUnsignedShort(); // snapshot counter
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6914);int index = 1;
        __CLR4_5_2543543lx1dvcb4.R.inc(6915);while ((((buf.readableBytes() > 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6916)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6917)==0&false))) {{

            __CLR4_5_2543543lx1dvcb4.R.inc(6918);position.set("h" + index + "Index", buf.readUnsignedByte());

            __CLR4_5_2543543lx1dvcb4.R.inc(6919);buf.readUnsignedShort(); // length

            __CLR4_5_2543543lx1dvcb4.R.inc(6920);int n = buf.readUnsignedByte();
            __CLR4_5_2543543lx1dvcb4.R.inc(6921);int m = buf.readUnsignedByte();

            __CLR4_5_2543543lx1dvcb4.R.inc(6922);position.set("h" + index + "XLength", n);
            __CLR4_5_2543543lx1dvcb4.R.inc(6923);position.set("h" + index + "YLength", m);

            __CLR4_5_2543543lx1dvcb4.R.inc(6924);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6925)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6926)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6927);position.set("h" + index + "XType", buf.readUnsignedByte());
                __CLR4_5_2543543lx1dvcb4.R.inc(6928);position.set("h" + index + "YType", buf.readUnsignedByte());
                __CLR4_5_2543543lx1dvcb4.R.inc(6929);position.set("h" + index + "Parameters", buf.readUnsignedByte());
            }

            }__CLR4_5_2543543lx1dvcb4.R.inc(6930);boolean percentageFormat = (selector & 0x0020) != 0;

            __CLR4_5_2543543lx1dvcb4.R.inc(6931);StringBuilder data = new StringBuilder();
            __CLR4_5_2543543lx1dvcb4.R.inc(6932);for (int i = 0; (((i < n * m)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6933)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6934)==0&false)); i++) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6935);if ((((percentageFormat)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6936)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6937)==0&false))) {{
                    __CLR4_5_2543543lx1dvcb4.R.inc(6938);data.append(buf.readUnsignedByte() * 0.5).append("%").append(" ");
                } }else {{
                    __CLR4_5_2543543lx1dvcb4.R.inc(6939);data.append(buf.readUnsignedShort()).append(" ");
                }
            }}

            }__CLR4_5_2543543lx1dvcb4.R.inc(6940);position.set("h" + index + "Data", data.toString().trim());

            __CLR4_5_2543543lx1dvcb4.R.inc(6941);position.set("h" + index + "Total", buf.readUnsignedInt());

            __CLR4_5_2543543lx1dvcb4.R.inc(6942);if (((((selector & 0x0010) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6943)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6944)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6945);int k = buf.readUnsignedByte();

                __CLR4_5_2543543lx1dvcb4.R.inc(6946);data = new StringBuilder();
                __CLR4_5_2543543lx1dvcb4.R.inc(6947);for (int i = 1; (((i < n)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6948)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6949)==0&false)); i++) {{
                    __CLR4_5_2543543lx1dvcb4.R.inc(6950);if ((((k == 1)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6951)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6952)==0&false))) {{
                        __CLR4_5_2543543lx1dvcb4.R.inc(6953);data.append(buf.readByte()).append(" ");
                    } }else {__CLR4_5_2543543lx1dvcb4.R.inc(6954);if ((((k == 2)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6955)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6956)==0&false))) {{
                        __CLR4_5_2543543lx1dvcb4.R.inc(6957);data.append(buf.readShort()).append(" ");
                    }
                }}}
                }__CLR4_5_2543543lx1dvcb4.R.inc(6958);position.set("h" + index + "XLimits", data.toString().trim());

                __CLR4_5_2543543lx1dvcb4.R.inc(6959);data = new StringBuilder();
                __CLR4_5_2543543lx1dvcb4.R.inc(6960);for (int i = 1; (((i < m)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6961)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6962)==0&false)); i++) {{
                    __CLR4_5_2543543lx1dvcb4.R.inc(6963);if ((((k == 1)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6964)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6965)==0&false))) {{
                        __CLR4_5_2543543lx1dvcb4.R.inc(6966);data.append(buf.readByte()).append(" ");
                    } }else {__CLR4_5_2543543lx1dvcb4.R.inc(6967);if ((((k == 2)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6968)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6969)==0&false))) {{
                        __CLR4_5_2543543lx1dvcb4.R.inc(6970);data.append(buf.readShort()).append(" ");
                    }
                }}}
                }__CLR4_5_2543543lx1dvcb4.R.inc(6971);position.set("h" + index + "YLimits", data.toString().trim());
            }

            }__CLR4_5_2543543lx1dvcb4.R.inc(6972);index += 1;
        }
    }}finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    private void decodeEB(Position position, ChannelBuffer buf) {try{__CLR4_5_2543543lx1dvcb4.R.inc(6973);

        __CLR4_5_2543543lx1dvcb4.R.inc(6974);if ((((buf.readByte() != (byte) 'E' || buf.readByte() != (byte) 'B')&&(__CLR4_5_2543543lx1dvcb4.R.iget(6975)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6976)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6977);return;
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(6978);buf.readUnsignedByte(); // version
        __CLR4_5_2543543lx1dvcb4.R.inc(6979);buf.readUnsignedShort(); // event
        __CLR4_5_2543543lx1dvcb4.R.inc(6980);buf.readUnsignedByte(); // data validity
        __CLR4_5_2543543lx1dvcb4.R.inc(6981);buf.readUnsignedByte(); // towed
        __CLR4_5_2543543lx1dvcb4.R.inc(6982);buf.readUnsignedShort(); // length

        __CLR4_5_2543543lx1dvcb4.R.inc(6983);while ((((buf.readableBytes() > 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6984)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6985)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(6986);buf.readUnsignedByte(); // towed position
            __CLR4_5_2543543lx1dvcb4.R.inc(6987);int type = buf.readUnsignedByte();
            __CLR4_5_2543543lx1dvcb4.R.inc(6988);int length = buf.readUnsignedByte();

            __CLR4_5_2543543lx1dvcb4.R.inc(6989);if ((((type == 0x01)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6990)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6991)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6992);position.set("brakeFlags", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(6993);if ((((type == 0x02)&&(__CLR4_5_2543543lx1dvcb4.R.iget(6994)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(6995)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(6996);position.set("wheelSpeed", buf.readUnsignedShort() / 256.0);
                __CLR4_5_2543543lx1dvcb4.R.inc(6997);position.set("wheelSpeedDifference", buf.readUnsignedShort() / 256.0 - 125.0);
                __CLR4_5_2543543lx1dvcb4.R.inc(6998);position.set("lateralAcceleration", buf.readUnsignedByte() / 10.0 - 12.5);
                __CLR4_5_2543543lx1dvcb4.R.inc(6999);position.set("vehicleSpeed", buf.readUnsignedShort() / 256.0);
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7000);if ((((type == 0x03)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7001)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7002)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7003);position.set("axleLoadSum", buf.readUnsignedShort() * 2);
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7004);if ((((type == 0x04)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7005)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7006)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7007);position.set("tyrePressure", buf.readUnsignedByte() * 10);
                __CLR4_5_2543543lx1dvcb4.R.inc(7008);position.set("pneumaticPressure", buf.readUnsignedByte() * 5);
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7009);if ((((type == 0x05)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7010)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7011)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7012);position.set("brakeLining", buf.readUnsignedByte() * 0.4);
                __CLR4_5_2543543lx1dvcb4.R.inc(7013);position.set("brakeTemperature", buf.readUnsignedByte() * 10);
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7014);if ((((type == 0x06)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7015)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7016)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7017);position.set("totalDistance", buf.readUnsignedInt() * 5);
                __CLR4_5_2543543lx1dvcb4.R.inc(7018);position.set("tripDistance", buf.readUnsignedInt() * 5);
                __CLR4_5_2543543lx1dvcb4.R.inc(7019);position.set("serviceDistance", (buf.readUnsignedInt() - 2105540607) * 5);
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7020);if ((((type == 0x0A)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7021)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7022)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7023);ChannelBuffer brakeData = buf.readBytes(length);
                __CLR4_5_2543543lx1dvcb4.R.inc(7024);position.set("absStatusCounter", brakeData.readUnsignedShort());
                __CLR4_5_2543543lx1dvcb4.R.inc(7025);position.set("atvbStatusCounter", brakeData.readUnsignedShort());
                __CLR4_5_2543543lx1dvcb4.R.inc(7026);position.set("vdcActiveCounter", brakeData.readUnsignedShort());
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7027);if ((((type == 0x0B)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7028)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7029)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7030);position.set("brakeMinMaxData", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7031);if ((((type == 0x0C)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7032)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7033)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7034);position.set("missingPgn", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7035);if ((((type == 0x0D)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7036)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7037)==0&false))) {{
                boolean __CLB4_5_2_bool3=false;__CLR4_5_2543543lx1dvcb4.R.inc(7038);switch (buf.readUnsignedByte()) {
                    case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_2543543lx1dvcb4.R.inc(7039);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2543543lx1dvcb4.R.inc(7040);position.set("brakeManufacturer", "Wabco");
                        __CLR4_5_2543543lx1dvcb4.R.inc(7041);break;
                    case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_2543543lx1dvcb4.R.inc(7042);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2543543lx1dvcb4.R.inc(7043);position.set("brakeManufacturer", "Knorr");
                        __CLR4_5_2543543lx1dvcb4.R.inc(7044);break;
                    case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_2543543lx1dvcb4.R.inc(7045);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2543543lx1dvcb4.R.inc(7046);position.set("brakeManufacturer", "Haldex");
                        __CLR4_5_2543543lx1dvcb4.R.inc(7047);break;
                    default:if (!__CLB4_5_2_bool3) {__CLR4_5_2543543lx1dvcb4.R.inc(7048);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2543543lx1dvcb4.R.inc(7049);position.set("brakeManufacturer", "Unknown");
                        __CLR4_5_2543543lx1dvcb4.R.inc(7050);break;
                }
                __CLR4_5_2543543lx1dvcb4.R.inc(7051);buf.readUnsignedByte();
                __CLR4_5_2543543lx1dvcb4.R.inc(7052);buf.readBytes(17); // vin
                __CLR4_5_2543543lx1dvcb4.R.inc(7053);position.set("towedDetectionStatus", buf.readUnsignedByte());
            } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7054);if ((((type == 0x0E)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7055)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7056)==0&false))) {{
                __CLR4_5_2543543lx1dvcb4.R.inc(7057);buf.skipBytes(length);
            }
        }}}}}}}}}}}}
    }}finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2543543lx1dvcb4.R.inc(7058);

        __CLR4_5_2543543lx1dvcb4.R.inc(7059);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2543543lx1dvcb4.R.inc(7060);char protocol = (char) buf.readByte();
        __CLR4_5_2543543lx1dvcb4.R.inc(7061);int version = buf.readUnsignedByte();

        __CLR4_5_2543543lx1dvcb4.R.inc(7062);String imei;
        __CLR4_5_2543543lx1dvcb4.R.inc(7063);if (((((version & 0x80) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7064)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7065)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7066);imei = String.valueOf((buf.readUnsignedInt() << (3 * 8)) | buf.readUnsignedMedium());
        } }else {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7067);imei = String.valueOf(imeiFromUnitId(buf.readUnsignedMedium()));
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(7068);buf.readUnsignedShort(); // length

        __CLR4_5_2543543lx1dvcb4.R.inc(7069);int selector = DEFAULT_SELECTOR_D;
        __CLR4_5_2543543lx1dvcb4.R.inc(7070);if ((((protocol == 'E')&&(__CLR4_5_2543543lx1dvcb4.R.iget(7071)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7072)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7073);selector = DEFAULT_SELECTOR_E;
        }
        }__CLR4_5_2543543lx1dvcb4.R.inc(7074);if (((((version & 0x40) != 0)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7075)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7076)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7077);selector = buf.readUnsignedMedium();
        }

        }__CLR4_5_2543543lx1dvcb4.R.inc(7078);Position position = new Position();
        __CLR4_5_2543543lx1dvcb4.R.inc(7079);position.setProtocol(getProtocolName());
        __CLR4_5_2543543lx1dvcb4.R.inc(7080);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2543543lx1dvcb4.R.inc(7081);if ((((deviceSession == null)&&(__CLR4_5_2543543lx1dvcb4.R.iget(7082)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7083)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7084);return null;
        }
        }__CLR4_5_2543543lx1dvcb4.R.inc(7085);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2543543lx1dvcb4.R.inc(7086);int event = buf.readUnsignedByte();
        __CLR4_5_2543543lx1dvcb4.R.inc(7087);position.set(Position.KEY_EVENT, event);
        __CLR4_5_2543543lx1dvcb4.R.inc(7088);position.set("eventInfo", buf.readUnsignedByte());

        __CLR4_5_2543543lx1dvcb4.R.inc(7089);if ((((protocol == 'D')&&(__CLR4_5_2543543lx1dvcb4.R.iget(7090)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7091)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7092);decodeD(position, buf, selector, event);
        } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7093);if ((((protocol == 'E')&&(__CLR4_5_2543543lx1dvcb4.R.iget(7094)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7095)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7096);decodeE(position, buf, selector);
        } }else {__CLR4_5_2543543lx1dvcb4.R.inc(7097);if ((((protocol == 'H')&&(__CLR4_5_2543543lx1dvcb4.R.iget(7098)!=0|true))||(__CLR4_5_2543543lx1dvcb4.R.iget(7099)==0&false))) {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7100);decodeH(position, buf, selector);
        } }else {{
            __CLR4_5_2543543lx1dvcb4.R.inc(7101);return null;
        }

        }}}__CLR4_5_2543543lx1dvcb4.R.inc(7102);return position;
    }finally{__CLR4_5_2543543lx1dvcb4.R.flushNeeded();}}

}
