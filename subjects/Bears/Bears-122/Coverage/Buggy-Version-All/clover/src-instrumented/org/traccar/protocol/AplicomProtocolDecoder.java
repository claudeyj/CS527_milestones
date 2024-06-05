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

@java.lang.SuppressWarnings({"fallthrough"}) public class AplicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25sg5sglwydzlmw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,8067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AplicomProtocolDecoder(AplicomProtocol protocol) {
        super(protocol);__CLR4_5_25sg5sglwydzlmw.R.inc(7505);try{__CLR4_5_25sg5sglwydzlmw.R.inc(7504);
    }finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private static final long IMEI_BASE_TC65_V20 = 0x1437207000000L;
    private static final long IMEI_BASE_TC65_V28 = 358244010000000L;
    private static final long IMEI_BASE_TC65I_V11 = 0x14143B4000000L;

    private static boolean validateImei(long imei) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7506);
        __CLR4_5_25sg5sglwydzlmw.R.inc(7507);return Checksum.luhn(imei / 10) == imei % 10;
    }finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private static long imeiFromUnitId(long unitId) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7508);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7509);if ((((unitId == 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7510)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7511)==0&false))) {{

            __CLR4_5_25sg5sglwydzlmw.R.inc(7512);return 0;

        } }else {{

            // Try TC65i
            __CLR4_5_25sg5sglwydzlmw.R.inc(7513);long imei = IMEI_BASE_TC65I_V11 + unitId;
            __CLR4_5_25sg5sglwydzlmw.R.inc(7514);if ((((validateImei(imei))&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7515)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7516)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7517);return imei;
            }

            // Try TC65 v2.8
            }__CLR4_5_25sg5sglwydzlmw.R.inc(7518);imei = IMEI_BASE_TC65_V28 + ((unitId + 0xA8180) & 0xFFFFFF);
            __CLR4_5_25sg5sglwydzlmw.R.inc(7519);if ((((validateImei(imei))&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7520)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7521)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7522);return imei;
            }

            // Try TC65 v2.0
            }__CLR4_5_25sg5sglwydzlmw.R.inc(7523);imei = IMEI_BASE_TC65_V20 + unitId;
            __CLR4_5_25sg5sglwydzlmw.R.inc(7524);if ((((validateImei(imei))&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7525)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7526)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7527);return imei;
            }

        }}

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7528);return unitId;
    }finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private static final int DEFAULT_SELECTOR_D = 0x0002fC;
    private static final int DEFAULT_SELECTOR_E = 0x007ffc;
    private static final int DEFAULT_SELECTOR_F = 0x0007fd;

    private static final int EVENT_DATA = 119;

    private void decodeEventData(Position position, ChannelBuffer buf, int event) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7529);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_25sg5sglwydzlmw.R.inc(7530);switch (event) {
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7531);__CLB4_5_2_bool0=true;}
            case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7532);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7533);buf.readUnsignedByte();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7534);break;
            case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7535);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7536);buf.readUnsignedMedium();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7537);break;
            case 31:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7538);__CLB4_5_2_bool0=true;}
            case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7539);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7540);buf.readUnsignedShort();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7541);break;
            case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7542);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7543);buf.skipBytes(4 * 9);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7544);break;
            case 113:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7545);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7546);buf.readUnsignedInt();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7547);buf.readUnsignedByte();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7548);break;
            case 121:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7549);__CLB4_5_2_bool0=true;}
            case 142:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7550);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7551);buf.readLong();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7552);break;
            case 130:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7553);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7554);buf.readUnsignedInt(); // incorrect
                __CLR4_5_25sg5sglwydzlmw.R.inc(7555);break;
            case 188:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7556);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7557);decodeEB(position, buf);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7558);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_25sg5sglwydzlmw.R.inc(7559);__CLB4_5_2_bool0=true;}
                __CLR4_5_25sg5sglwydzlmw.R.inc(7560);break;
        }
    }finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeCanData(ChannelBuffer buf, Position position) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7561);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7562);buf.readUnsignedMedium(); // packet identifier
        __CLR4_5_25sg5sglwydzlmw.R.inc(7563);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7564);int count = buf.readUnsignedByte();
        __CLR4_5_25sg5sglwydzlmw.R.inc(7565);buf.readUnsignedByte(); // batch count
        __CLR4_5_25sg5sglwydzlmw.R.inc(7566);buf.readUnsignedShort(); // selector bit
        __CLR4_5_25sg5sglwydzlmw.R.inc(7567);buf.readUnsignedInt(); // timestamp

        __CLR4_5_25sg5sglwydzlmw.R.inc(7568);buf.skipBytes(8);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7569);ArrayList<ChannelBuffer> values = new ArrayList<>(count);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7570);for (int i = 0; (((i < count)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7571)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7572)==0&false)); i++) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7573);values.add(buf.readBytes(8));
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7574);for (int i = 0; (((i < count)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7575)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7576)==0&false)); i++) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7577);ChannelBuffer value = values.get(i);
            boolean __CLB4_5_2_bool1=false;__CLR4_5_25sg5sglwydzlmw.R.inc(7578);switch (buf.readInt()) {
                case 0x20D:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7579);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7580);position.set(Position.KEY_RPM, ChannelBuffers.swapShort(value.readShort()));
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7581);position.set("dieselTemperature", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7582);position.set("batteryVoltage", ChannelBuffers.swapShort(value.readShort()) * 0.01);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7583);position.set("supplyAirTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7584);break;
                case 0x30D:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7585);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7586);position.set("activeAlarm", ChannelBuffers.hexDump(value));
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7587);break;
                case 0x40C:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7588);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7589);position.set("airTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7590);position.set("airTempDep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7591);break;
                case 0x40D:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7592);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7593);position.set("coldUnitState", ChannelBuffers.hexDump(value));
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7594);break;
                case 0x50C:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7595);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7596);position.set("defrostTempDep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7597);position.set("defrostTempDep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7598);break;
                case 0x50D:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7599);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7600);position.set("condenserPressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7601);position.set("suctionPressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7602);break;
                case 0x58C:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7603);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7604);value.readByte();
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7605);value.readShort(); // index
                    boolean __CLB4_5_2_bool2=false;__CLR4_5_25sg5sglwydzlmw.R.inc(7606);switch (value.readByte()) {
                        case 0x01:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7607);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7608);position.set("setpointZone1", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7609);break;
                        case 0x02:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7610);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7611);position.set("setpointZone2", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7612);break;
                        case 0x05:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7613);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7614);position.set("unitType", ChannelBuffers.swapInt(value.readInt()));
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7615);break;
                        case 0x13:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7616);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7617);position.set("dieselHours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7618);break;
                        case 0x14:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7619);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7620);position.set("electricHours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7621);break;
                        case 0x17:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7622);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7623);position.set("serviceIndicator", ChannelBuffers.swapInt(value.readInt()));
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7624);break;
                        case 0x18:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7625);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7626);position.set("softwareVersion", ChannelBuffers.swapInt(value.readInt()) * 0.01);
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7627);break;
                        default:if (!__CLB4_5_2_bool2) {__CLR4_5_25sg5sglwydzlmw.R.inc(7628);__CLB4_5_2_bool2=true;}
                            __CLR4_5_25sg5sglwydzlmw.R.inc(7629);break;
                    }
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7630);break;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_25sg5sglwydzlmw.R.inc(7631);__CLB4_5_2_bool1=true;}
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7632);Log.warning(new UnsupportedOperationException());
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7633);break;
            }
        }
    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeD(Position position, ChannelBuffer buf, int selector, int event) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7634);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7635);if (((((selector & 0x0008) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7636)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7637)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7638);position.setValid((buf.readUnsignedByte() & 0x40) != 0);
        } }else {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7639);getLastLocation(position, null);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7640);if (((((selector & 0x0004) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7641)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7642)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7643);buf.skipBytes(4); // snapshot time
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7644);if (((((selector & 0x0008) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7645)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7646)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7647);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_25sg5sglwydzlmw.R.inc(7648);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_25sg5sglwydzlmw.R.inc(7649);position.setLongitude(buf.readInt() / 1000000.0);
            __CLR4_5_25sg5sglwydzlmw.R.inc(7650);position.set(Position.KEY_SATELLITES_VISIBLE, buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7651);if (((((selector & 0x0010) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7652)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7653)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7654);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_25sg5sglwydzlmw.R.inc(7655);position.set("maximumSpeed", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7656);position.setCourse(buf.readUnsignedByte() * 2.0);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7657);if (((((selector & 0x0040) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7658)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7659)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7660);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7661);if (((((selector & 0x0020) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7662)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7663)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7664);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7665);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7666);position.set(Position.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7667);position.set(Position.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7668);if (((((selector & 0x8000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7669)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7670)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7671);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
            __CLR4_5_25sg5sglwydzlmw.R.inc(7672);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        }

        // Pulse rate 1
        }__CLR4_5_25sg5sglwydzlmw.R.inc(7673);if (((((selector & 0x10000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7674)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7675)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7676);buf.readUnsignedShort();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7677);buf.readUnsignedInt();
        }

        // Pulse rate 2
        }__CLR4_5_25sg5sglwydzlmw.R.inc(7678);if (((((selector & 0x20000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7679)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7680)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7681);buf.readUnsignedShort();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7682);buf.readUnsignedInt();
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7683);if (((((selector & 0x0080) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7684)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7685)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7686);position.set("trip1", buf.readUnsignedInt());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7687);if (((((selector & 0x0100) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7688)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7689)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7690);position.set("trip2", buf.readUnsignedInt());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7691);if (((((selector & 0x0040) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7692)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7693)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7694);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7695);if (((((selector & 0x0200) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7696)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7697)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7698);position.set(Position.KEY_DRIVER_UNIQUE_ID,
                    String.valueOf(((long) buf.readUnsignedShort()) << 32) + buf.readUnsignedInt());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7699);if (((((selector & 0x0400) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7700)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7701)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7702);buf.readUnsignedByte(); // Keypad
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7703);if (((((selector & 0x0800) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7704)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7705)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7706);position.setAltitude(buf.readShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7707);if (((((selector & 0x2000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7708)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7709)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7710);buf.readUnsignedShort(); // snapshot counter
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7711);if (((((selector & 0x4000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7712)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7713)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7714);buf.skipBytes(8); // state flags
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7715);if (((((selector & 0x80000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7716)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7717)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7718);buf.skipBytes(11); // cell info
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7719);if (((((selector & 0x1000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7720)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7721)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7722);decodeEventData(position, buf, event);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7723);if ((((Context.getConfig().getBoolean(getProtocolName() + ".can")
                && buf.readable() && (selector & 0x1000) != 0 && event == EVENT_DATA)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7724)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7725)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7726);decodeCanData(buf, position);
        }
    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeE(Position position, ChannelBuffer buf, int selector) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7727);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7728);if (((((selector & 0x0008) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7729)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7730)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7731);position.set("tachographEvent", buf.readUnsignedShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7732);if (((((selector & 0x0004) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7733)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7734)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7735);getLastLocation(position, new Date(buf.readUnsignedInt() * 1000));
        } }else {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7736);getLastLocation(position, null);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7737);if (((((selector & 0x0010) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7738)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7739)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7740);String time = buf.readUnsignedByte() + "s " + buf.readUnsignedByte() + "m " + buf.readUnsignedByte() + "h "
                    + buf.readUnsignedByte() + "M " + buf.readUnsignedByte() + "D " + buf.readUnsignedByte() + "Y "
                    + buf.readByte() + "m " + buf.readByte() + "h";
            __CLR4_5_25sg5sglwydzlmw.R.inc(7741);position.set("tachographTime", time);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7742);position.set("workState", buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7743);position.set("driver1State", buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7744);position.set("driver2State", buf.readUnsignedByte());

        __CLR4_5_25sg5sglwydzlmw.R.inc(7745);if (((((selector & 0x0020) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7746)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7747)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7748);position.set("tachographStatus", buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7749);if (((((selector & 0x0040) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7750)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7751)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7752);position.set(Position.KEY_OBD_SPEED, buf.readUnsignedShort() / 256.0);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7753);if (((((selector & 0x0080) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7754)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7755)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7756);position.set(Position.KEY_OBD_ODOMETER, buf.readUnsignedInt() * 5);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7757);if (((((selector & 0x0100) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7758)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7759)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7760);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt() * 5);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7761);if (((((selector & 0x8000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7762)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7763)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7764);position.set("kFactor", buf.readUnsignedShort() * 0.001 + " pulses/m");
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7765);if (((((selector & 0x0200) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7766)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7767)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7768);position.set(Position.KEY_RPM, buf.readUnsignedShort() * 0.125);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7769);if (((((selector & 0x0400) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7770)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7771)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7772);position.set("extraInfo", buf.readUnsignedShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7773);if (((((selector & 0x0800) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7774)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7775)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7776);position.set(Position.KEY_VIN, buf.readBytes(18).toString(StandardCharsets.US_ASCII).trim());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7777);if (((((selector & 0x2000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7778)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7779)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7780);buf.readUnsignedByte(); // card 1 type
            __CLR4_5_25sg5sglwydzlmw.R.inc(7781);buf.readUnsignedByte(); // card 1 country code
            __CLR4_5_25sg5sglwydzlmw.R.inc(7782);String card = buf.readBytes(20).toString(StandardCharsets.US_ASCII).trim();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7783);if ((((!card.isEmpty())&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7784)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7785)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7786);position.set("card1", card);
            }
        }}

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7787);if (((((selector & 0x4000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7788)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7789)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7790);buf.readUnsignedByte(); // card 2 type
            __CLR4_5_25sg5sglwydzlmw.R.inc(7791);buf.readUnsignedByte(); // card 2 country code
            __CLR4_5_25sg5sglwydzlmw.R.inc(7792);String card = buf.readBytes(20).toString(StandardCharsets.US_ASCII).trim();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7793);if ((((!card.isEmpty())&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7794)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7795)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7796);position.set("card2", card);
            }
        }}

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7797);if (((((selector & 0x10000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7798)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7799)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7800);int count = buf.readUnsignedByte();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7801);for (int i = 1; (((i <= count)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7802)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7803)==0&false)); i++) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7804);position.set("driver" + i, buf.readBytes(22).toString(StandardCharsets.US_ASCII).trim());
                __CLR4_5_25sg5sglwydzlmw.R.inc(7805);position.set("driverTime" + i, buf.readUnsignedInt());
            }
        }}
    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeH(Position position, ChannelBuffer buf, int selector) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7806);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7807);if (((((selector & 0x0004) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7808)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7809)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7810);getLastLocation(position, new Date(buf.readUnsignedInt() * 1000));
        } }else {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7811);getLastLocation(position, null);
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7812);if (((((selector & 0x0040) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7813)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7814)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7815);buf.readUnsignedInt(); // reset time
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7816);if (((((selector & 0x2000) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7817)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7818)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7819);buf.readUnsignedShort(); // snapshot counter
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7820);int index = 1;
        __CLR4_5_25sg5sglwydzlmw.R.inc(7821);while ((((buf.readableBytes() > 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7822)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7823)==0&false))) {{

            __CLR4_5_25sg5sglwydzlmw.R.inc(7824);position.set("h" + index + "Index", buf.readUnsignedByte());

            __CLR4_5_25sg5sglwydzlmw.R.inc(7825);buf.readUnsignedShort(); // length

            __CLR4_5_25sg5sglwydzlmw.R.inc(7826);int n = buf.readUnsignedByte();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7827);int m = buf.readUnsignedByte();

            __CLR4_5_25sg5sglwydzlmw.R.inc(7828);position.set("h" + index + "XLength", n);
            __CLR4_5_25sg5sglwydzlmw.R.inc(7829);position.set("h" + index + "YLength", m);

            __CLR4_5_25sg5sglwydzlmw.R.inc(7830);if (((((selector & 0x0008) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7831)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7832)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7833);position.set("h" + index + "XType", buf.readUnsignedByte());
                __CLR4_5_25sg5sglwydzlmw.R.inc(7834);position.set("h" + index + "YType", buf.readUnsignedByte());
                __CLR4_5_25sg5sglwydzlmw.R.inc(7835);position.set("h" + index + "Parameters", buf.readUnsignedByte());
            }

            }__CLR4_5_25sg5sglwydzlmw.R.inc(7836);boolean percentageFormat = (selector & 0x0020) != 0;

            __CLR4_5_25sg5sglwydzlmw.R.inc(7837);StringBuilder data = new StringBuilder();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7838);for (int i = 0; (((i < n * m)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7839)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7840)==0&false)); i++) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7841);if ((((percentageFormat)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7842)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7843)==0&false))) {{
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7844);data.append(buf.readUnsignedByte() * 0.5).append("%").append(" ");
                } }else {{
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7845);data.append(buf.readUnsignedShort()).append(" ");
                }
            }}

            }__CLR4_5_25sg5sglwydzlmw.R.inc(7846);position.set("h" + index + "Data", data.toString().trim());

            __CLR4_5_25sg5sglwydzlmw.R.inc(7847);position.set("h" + index + "Total", buf.readUnsignedInt());

            __CLR4_5_25sg5sglwydzlmw.R.inc(7848);if (((((selector & 0x0010) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7849)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7850)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7851);int k = buf.readUnsignedByte();

                __CLR4_5_25sg5sglwydzlmw.R.inc(7852);data = new StringBuilder();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7853);for (int i = 1; (((i < n)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7854)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7855)==0&false)); i++) {{
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7856);if ((((k == 1)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7857)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7858)==0&false))) {{
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7859);data.append(buf.readByte()).append(" ");
                    } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7860);if ((((k == 2)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7861)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7862)==0&false))) {{
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7863);data.append(buf.readShort()).append(" ");
                    }
                }}}
                }__CLR4_5_25sg5sglwydzlmw.R.inc(7864);position.set("h" + index + "XLimits", data.toString().trim());

                __CLR4_5_25sg5sglwydzlmw.R.inc(7865);data = new StringBuilder();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7866);for (int i = 1; (((i < m)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7867)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7868)==0&false)); i++) {{
                    __CLR4_5_25sg5sglwydzlmw.R.inc(7869);if ((((k == 1)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7870)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7871)==0&false))) {{
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7872);data.append(buf.readByte()).append(" ");
                    } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7873);if ((((k == 2)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7874)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7875)==0&false))) {{
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7876);data.append(buf.readShort()).append(" ");
                    }
                }}}
                }__CLR4_5_25sg5sglwydzlmw.R.inc(7877);position.set("h" + index + "YLimits", data.toString().trim());
            }

            }__CLR4_5_25sg5sglwydzlmw.R.inc(7878);index += 1;
        }
    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeEB(Position position, ChannelBuffer buf) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7879);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7880);if ((((buf.readByte() != (byte) 'E' || buf.readByte() != (byte) 'B')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7881)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7882)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7883);return;
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7884);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7885);position.set(Position.KEY_EVENT, buf.readUnsignedShort());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7886);position.set("dataValidity", buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7887);position.set("towed", buf.readUnsignedByte());
        __CLR4_5_25sg5sglwydzlmw.R.inc(7888);buf.readUnsignedShort(); // length

        __CLR4_5_25sg5sglwydzlmw.R.inc(7889);while ((((buf.readableBytes() > 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7890)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7891)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7892);position.set("towedPosition", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7893);int type = buf.readUnsignedByte();
            __CLR4_5_25sg5sglwydzlmw.R.inc(7894);int length = buf.readUnsignedByte();

            __CLR4_5_25sg5sglwydzlmw.R.inc(7895);if ((((type == 0x01)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7896)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7897)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7898);position.set("brakeFlags", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7899);if ((((type == 0x02)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7900)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7901)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7902);position.set("wheelSpeed", buf.readUnsignedShort() / 256.0);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7903);position.set("wheelSpeedDifference", buf.readUnsignedShort() / 256.0 - 125.0);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7904);position.set("lateralAcceleration", buf.readUnsignedByte() / 10.0 - 12.5);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7905);position.set("vehicleSpeed", buf.readUnsignedShort() / 256.0);
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7906);if ((((type == 0x03)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7907)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7908)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7909);position.set("axleLoadSum", buf.readUnsignedShort() * 2);
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7910);if ((((type == 0x04)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7911)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7912)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7913);position.set("tyrePressure", buf.readUnsignedByte() * 10);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7914);position.set("pneumaticPressure", buf.readUnsignedByte() * 5);
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7915);if ((((type == 0x05)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7916)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7917)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7918);position.set("brakeLining", buf.readUnsignedByte() * 0.4);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7919);position.set("brakeTemperature", buf.readUnsignedByte() * 10);
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7920);if ((((type == 0x06)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7921)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7922)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7923);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 5);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7924);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt() * 5);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7925);position.set(Position.KEY_ODOMETER_SERVICE, (buf.readUnsignedInt() - 2105540607) * 5);
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7926);if ((((type == 0x0A)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7927)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7928)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7929);ChannelBuffer brakeData = buf.readBytes(length);
                __CLR4_5_25sg5sglwydzlmw.R.inc(7930);position.set("absStatusCounter", brakeData.readUnsignedShort());
                __CLR4_5_25sg5sglwydzlmw.R.inc(7931);position.set("atvbStatusCounter", brakeData.readUnsignedShort());
                __CLR4_5_25sg5sglwydzlmw.R.inc(7932);position.set("vdcActiveCounter", brakeData.readUnsignedShort());
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7933);if ((((type == 0x0B)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7934)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7935)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7936);position.set("brakeMinMaxData", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7937);if ((((type == 0x0C)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7938)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7939)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7940);position.set("missingPgn", ChannelBuffers.hexDump(buf.readBytes(length)));
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7941);if ((((type == 0x0D)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7942)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7943)==0&false))) {{
                boolean __CLB4_5_2_bool3=false;__CLR4_5_25sg5sglwydzlmw.R.inc(7944);switch (buf.readUnsignedByte()) {
                    case 1:if (!__CLB4_5_2_bool3) {__CLR4_5_25sg5sglwydzlmw.R.inc(7945);__CLB4_5_2_bool3=true;}
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7946);position.set("brakeManufacturer", "Wabco");
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7947);break;
                    case 2:if (!__CLB4_5_2_bool3) {__CLR4_5_25sg5sglwydzlmw.R.inc(7948);__CLB4_5_2_bool3=true;}
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7949);position.set("brakeManufacturer", "Knorr");
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7950);break;
                    case 3:if (!__CLB4_5_2_bool3) {__CLR4_5_25sg5sglwydzlmw.R.inc(7951);__CLB4_5_2_bool3=true;}
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7952);position.set("brakeManufacturer", "Haldex");
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7953);break;
                    default:if (!__CLB4_5_2_bool3) {__CLR4_5_25sg5sglwydzlmw.R.inc(7954);__CLB4_5_2_bool3=true;}
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7955);position.set("brakeManufacturer", "Unknown");
                        __CLR4_5_25sg5sglwydzlmw.R.inc(7956);break;
                }
                __CLR4_5_25sg5sglwydzlmw.R.inc(7957);buf.readUnsignedByte();
                __CLR4_5_25sg5sglwydzlmw.R.inc(7958);position.set(Position.KEY_VIN, buf.readBytes(17).toString(StandardCharsets.US_ASCII));
                __CLR4_5_25sg5sglwydzlmw.R.inc(7959);position.set("towedDetectionStatus", buf.readUnsignedByte());
            } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(7960);if ((((type == 0x0E)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7961)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7962)==0&false))) {{
                __CLR4_5_25sg5sglwydzlmw.R.inc(7963);buf.skipBytes(length);
            }
        }}}}}}}}}}}}
    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    private void decodeF(Position position, ChannelBuffer buf, int selector) {try{__CLR4_5_25sg5sglwydzlmw.R.inc(7964);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7965);getLastLocation(position, null);

        __CLR4_5_25sg5sglwydzlmw.R.inc(7966);if (((((selector & 0x0004) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7967)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7968)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7969);buf.skipBytes(4); // snapshot time
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7970);buf.readUnsignedByte(); // data validity

        __CLR4_5_25sg5sglwydzlmw.R.inc(7971);if (((((selector & 0x0008) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7972)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7973)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7974);position.set(Position.KEY_RPM, buf.readUnsignedShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7975);position.set("rpmMax", buf.readUnsignedShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7976);position.set("rpmMin", buf.readUnsignedShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7977);if (((((selector & 0x0010) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7978)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7979)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7980);position.set("engineTemp", buf.readShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7981);position.set("engineTempMax", buf.readShort());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7982);position.set("engineTempMin", buf.readShort());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7983);if (((((selector & 0x0020) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7984)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7985)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7986);position.set(Position.KEY_HOURS, buf.readUnsignedInt());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7987);position.set("serviceDistance", buf.readInt());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7988);position.set("driverActivity", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7989);position.set(Position.KEY_THROTTLE, buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(7990);position.set(Position.KEY_FUEL_LEVEL, buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7991);if (((((selector & 0x0040) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7992)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7993)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7994);position.set("totalFuelUsed", buf.readUnsignedInt());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7995);if (((((selector & 0x0080) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(7996)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(7997)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(7998);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(7999);if (((((selector & 0x0100) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8000)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8001)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8002);position.set(Position.KEY_OBD_SPEED, buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8003);position.set("speedMax", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8004);position.set("speedMin", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8005);position.set("hardBreaking", buf.readUnsignedByte());
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(8006);if (((((selector & 0x0200) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8007)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8008)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8009);position.set("tachographSpeed", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8010);position.set("driver1State", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8011);position.set("driver2State", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8012);position.set("tachographStatus", buf.readUnsignedByte());
            __CLR4_5_25sg5sglwydzlmw.R.inc(8013);position.set("overspeedCount", buf.readUnsignedByte());
        }

    }}finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25sg5sglwydzlmw.R.inc(8014);

        __CLR4_5_25sg5sglwydzlmw.R.inc(8015);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25sg5sglwydzlmw.R.inc(8016);char protocol = (char) buf.readByte();
        __CLR4_5_25sg5sglwydzlmw.R.inc(8017);int version = buf.readUnsignedByte();

        __CLR4_5_25sg5sglwydzlmw.R.inc(8018);String imei;
        __CLR4_5_25sg5sglwydzlmw.R.inc(8019);if (((((version & 0x80) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8020)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8021)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8022);imei = String.valueOf((buf.readUnsignedInt() << (3 * 8)) | buf.readUnsignedMedium());
        } }else {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8023);imei = String.valueOf(imeiFromUnitId(buf.readUnsignedMedium()));
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(8024);buf.readUnsignedShort(); // length

        __CLR4_5_25sg5sglwydzlmw.R.inc(8025);int selector = DEFAULT_SELECTOR_D;
        __CLR4_5_25sg5sglwydzlmw.R.inc(8026);if ((((protocol == 'E')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8027)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8028)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8029);selector = DEFAULT_SELECTOR_E;
        } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(8030);if ((((protocol == 'F')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8031)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8032)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8033);selector = DEFAULT_SELECTOR_F;
        }
        }}__CLR4_5_25sg5sglwydzlmw.R.inc(8034);if (((((version & 0x40) != 0)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8035)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8036)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8037);selector = buf.readUnsignedMedium();
        }

        }__CLR4_5_25sg5sglwydzlmw.R.inc(8038);Position position = new Position();
        __CLR4_5_25sg5sglwydzlmw.R.inc(8039);position.setProtocol(getProtocolName());
        __CLR4_5_25sg5sglwydzlmw.R.inc(8040);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_25sg5sglwydzlmw.R.inc(8041);if ((((deviceSession == null)&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8042)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8043)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8044);return null;
        }
        }__CLR4_5_25sg5sglwydzlmw.R.inc(8045);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_25sg5sglwydzlmw.R.inc(8046);int event = buf.readUnsignedByte();
        __CLR4_5_25sg5sglwydzlmw.R.inc(8047);position.set(Position.KEY_EVENT, event);
        __CLR4_5_25sg5sglwydzlmw.R.inc(8048);position.set("eventInfo", buf.readUnsignedByte());

        __CLR4_5_25sg5sglwydzlmw.R.inc(8049);if ((((protocol == 'D')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8050)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8051)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8052);decodeD(position, buf, selector, event);
        } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(8053);if ((((protocol == 'E')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8054)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8055)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8056);decodeE(position, buf, selector);
        } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(8057);if ((((protocol == 'H')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8058)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8059)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8060);decodeH(position, buf, selector);
        } }else {__CLR4_5_25sg5sglwydzlmw.R.inc(8061);if ((((protocol == 'F')&&(__CLR4_5_25sg5sglwydzlmw.R.iget(8062)!=0|true))||(__CLR4_5_25sg5sglwydzlmw.R.iget(8063)==0&false))) {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8064);decodeF(position, buf, selector);
        } }else {{
            __CLR4_5_25sg5sglwydzlmw.R.inc(8065);return null;
        }

        }}}}__CLR4_5_25sg5sglwydzlmw.R.inc(8066);return position;
    }finally{__CLR4_5_25sg5sglwydzlmw.R.flushNeeded();}}

}
