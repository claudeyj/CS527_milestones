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

@java.lang.SuppressWarnings({"fallthrough"}) public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fs0fs0lwye41mt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,20697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean connectionless;
    private boolean extended;

    public void setExtended(boolean extended) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20448);
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20449);this.extended = extended;
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol, boolean connectionless) {
        super(protocol);__CLR4_5_2fs0fs0lwye41mt.R.inc(20451);try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20450);
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20452);this.connectionless = connectionless;
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20453);this.extended = Context.getConfig().getBoolean(getProtocolName() + ".extended");
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private DeviceSession parseIdentification(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20454);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20455);int length = buf.readUnsignedShort();
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20456);String imei = buf.toString(buf.readerIndex(), length, StandardCharsets.US_ASCII);
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20457);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20458);if ((((channel != null)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20459)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20460)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20461);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20462);if ((((deviceSession != null)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20463)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20464)==0&false))) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20465);response.writeByte(1);
            } }else {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20466);response.writeByte(0);
            }
            }__CLR4_5_2fs0fs0lwye41mt.R.inc(20467);channel.write(response);
        }
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20468);return deviceSession;
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    public static final int CODEC_GH3000 = 0x07;
    public static final int CODEC_FM4X00 = 0x08;
    public static final int CODEC_12 = 0x0C;

    private void decodeSerial(Position position, ChannelBuffer buf) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20469);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20470);getLastLocation(position, null);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20471);position.set(Position.KEY_TYPE, buf.readUnsignedByte());

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20472);position.set(Position.KEY_COMMAND, buf.readBytes(buf.readInt()).toString(StandardCharsets.US_ASCII));

    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private long readValue(ChannelBuffer buf, int length, boolean signed) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20473);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2fs0fs0lwye41mt.R.inc(20474);switch (length) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20475);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20476);return (((signed )&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20477)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20478)==0&false))? buf.readByte() : buf.readUnsignedByte();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20479);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20480);return (((signed )&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20481)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20482)==0&false))? buf.readShort() : buf.readUnsignedShort();
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20483);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20484);return (((signed )&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20485)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20486)==0&false))? buf.readInt() : buf.readUnsignedInt();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20487);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20488);return buf.readLong();
        }
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private void decodeParameter(Position position, int id, ChannelBuffer buf, int length) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20489);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2fs0fs0lwye41mt.R.inc(20490);switch (id) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20491);__CLB4_5_2_bool1=true;}
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20492);__CLB4_5_2_bool1=true;}
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20493);__CLB4_5_2_bool1=true;}
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20494);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20495);position.set("di" + id, readValue(buf, length, false));
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20496);break;
            case 9:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20497);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20498);position.set(Position.PREFIX_ADC + 1, readValue(buf, length, false));
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20499);break;
            case 66:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20500);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20501);position.set(Position.KEY_POWER, readValue(buf, length, false) * 0.001);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20502);break;
            case 67:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20503);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20504);position.set(Position.KEY_BATTERY, readValue(buf, length, false) * 0.001);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20505);break;
            case 70:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20506);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20507);position.set(Position.KEY_DEVICE_TEMP, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20508);break;
            case 72:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20509);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20510);position.set(Position.PREFIX_TEMP + 1, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20511);break;
            case 73:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20512);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20513);position.set(Position.PREFIX_TEMP + 2, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20514);break;
            case 74:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20515);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20516);position.set(Position.PREFIX_TEMP + 3, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20517);break;
            case 78:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20518);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20519);position.set(Position.KEY_DRIVER_UNIQUE_ID, String.valueOf(readValue(buf, length, false)));
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20520);break;
            case 182:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20521);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20522);position.set(Position.KEY_HDOP, readValue(buf, length, false) * 0.1);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20523);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs0fs0lwye41mt.R.inc(20524);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20525);position.set(Position.PREFIX_IO + id, readValue(buf, length, false));
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20526);break;
        }
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private void decodeLocation(Position position, ChannelBuffer buf, int codec) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20527);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20528);int globalMask = 0x0f;

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20529);if ((((codec == CODEC_GH3000)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20530)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20531)==0&false))) {{

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20532);long time = buf.readUnsignedInt() & 0x3fffffff;
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20533);time += 1167609600; // 2007-01-01 00:00:00

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20534);globalMask = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20535);if ((((BitUtil.check(globalMask, 0))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20536)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20537)==0&false))) {{

                __CLR4_5_2fs0fs0lwye41mt.R.inc(20538);position.setTime(new Date(time * 1000));

                __CLR4_5_2fs0fs0lwye41mt.R.inc(20539);int locationMask = buf.readUnsignedByte();

                __CLR4_5_2fs0fs0lwye41mt.R.inc(20540);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20541)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20542)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20543);position.setLatitude(buf.readFloat());
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20544);position.setLongitude(buf.readFloat());
                }

                }__CLR4_5_2fs0fs0lwye41mt.R.inc(20545);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20546)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20547)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20548);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2fs0fs0lwye41mt.R.inc(20549);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20550)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20551)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20552);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }

                }__CLR4_5_2fs0fs0lwye41mt.R.inc(20553);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20554)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20555)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20556);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }

                }__CLR4_5_2fs0fs0lwye41mt.R.inc(20557);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20558)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20559)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20560);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20561);position.set(Position.KEY_SATELLITES, satellites);
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20562);position.setValid(satellites >= 3);
                }

                }__CLR4_5_2fs0fs0lwye41mt.R.inc(20563);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20564)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20565)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20566);CellTower cellTower = CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort());

                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20567);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20568)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20569)==0&false))) {{
                        __CLR4_5_2fs0fs0lwye41mt.R.inc(20570);cellTower.setSignalStrength((int) buf.readUnsignedByte());
                    }

                    }__CLR4_5_2fs0fs0lwye41mt.R.inc(20571);position.setNetwork(new Network(cellTower));

                } }else {__CLR4_5_2fs0fs0lwye41mt.R.inc(20572);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20573)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20574)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20575);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                }

                }}__CLR4_5_2fs0fs0lwye41mt.R.inc(20576);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20577)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20578)==0&false))) {{
                    __CLR4_5_2fs0fs0lwye41mt.R.inc(20579);position.set(Position.KEY_OPERATOR, buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_2fs0fs0lwye41mt.R.inc(20580);getLastLocation(position, new Date(time * 1000));

            }

        }} }else {{

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20581);position.setTime(new Date(buf.readLong()));

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20582);position.set("priority", buf.readUnsignedByte());

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20583);position.setLongitude(buf.readInt() / 10000000.0);
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20584);position.setLatitude(buf.readInt() / 10000000.0);
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20585);position.setAltitude(buf.readShort());
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20586);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20587);int satellites = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20588);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20589);position.setValid(satellites != 0);

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20590);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20591);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20592);buf.readUnsignedByte(); // total IO data records

        }

        // Read 1 byte data
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20593);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20594)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20595)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20596);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20597);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20598)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20599)==0&false)); j++) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20600);decodeParameter(position, buf.readUnsignedByte(), buf, 1);
            }
        }}

        // Read 2 byte data
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20601);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20602)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20603)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20604);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20605);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20606)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20607)==0&false)); j++) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20608);decodeParameter(position, buf.readUnsignedByte(), buf, 2);
            }
        }}

        // Read 4 byte data
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20609);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20610)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20611)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20612);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20613);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20614)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20615)==0&false)); j++) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20616);decodeParameter(position, buf.readUnsignedByte(), buf, 4);
            }
        }}

        // Read 8 byte data
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20617);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20618)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20619)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20620);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20621);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20622)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20623)==0&false)); j++) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20624);decodeParameter(position, buf.readUnsignedByte(), buf, 8);
            }
        }}

        // Read 16 byte data
        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20625);if ((((extended)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20626)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20627)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20628);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20629);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20630)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20631)==0&false)); j++) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20632);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), ChannelBuffers.hexDump(buf.readBytes(16)));
            }
        }}

    }}finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private List<Position> parseData(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf, int locationPacketId, String... imei) {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20633);
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20634);List<Position> positions = new LinkedList<>();

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20635);if ((((!connectionless)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20636)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20637)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20638);buf.readUnsignedInt(); // data length
        }

        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20639);int codec = buf.readUnsignedByte();
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20640);int count = buf.readUnsignedByte();

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20641);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20642);if ((((deviceSession == null)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20643)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20644)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20645);return null;
        }

        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20646);for (int i = 0; (((i < count)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20647)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20648)==0&false)); i++) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20649);Position position = new Position();
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20650);position.setProtocol(getProtocolName());

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20651);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fs0fs0lwye41mt.R.inc(20652);if ((((codec == CODEC_12)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20653)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20654)==0&false))) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20655);decodeSerial(position, buf);
            } }else {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20656);decodeLocation(position, buf, codec);
            }

            }__CLR4_5_2fs0fs0lwye41mt.R.inc(20657);positions.add(position);
        }

        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20658);if ((((channel != null)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20659)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20660)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20661);if ((((connectionless)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20662)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20663)==0&false))) {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20664);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20665);response.writeShort(5);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20666);response.writeShort(0);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20667);response.writeByte(0x01);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20668);response.writeByte(locationPacketId);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20669);response.writeByte(count);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20670);channel.write(response, remoteAddress);
            } }else {{
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20671);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20672);response.writeInt(count);
                __CLR4_5_2fs0fs0lwye41mt.R.inc(20673);channel.write(response);
            }
        }}

        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20674);return positions;
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20675);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20676);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20677);if ((((connectionless)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20678)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20679)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20680);return decodeUdp(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20681);return decodeTcp(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private Object decodeTcp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20682);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20683);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_2fs0fs0lwye41mt.R.iget(20684)!=0|true))||(__CLR4_5_2fs0fs0lwye41mt.R.iget(20685)==0&false))) {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20686);parseIdentification(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20687);buf.skipBytes(4);
            __CLR4_5_2fs0fs0lwye41mt.R.inc(20688);return parseData(channel, remoteAddress, buf, 0);
        }

        }__CLR4_5_2fs0fs0lwye41mt.R.inc(20689);return null;
    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

    private Object decodeUdp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2fs0fs0lwye41mt.R.inc(20690);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20691);buf.readUnsignedShort(); // length
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20692);buf.readUnsignedShort(); // packet id
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20693);buf.readUnsignedByte(); // packet type
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20694);int locationPacketId = buf.readUnsignedByte();
        __CLR4_5_2fs0fs0lwye41mt.R.inc(20695);String imei = buf.readBytes(buf.readUnsignedShort()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2fs0fs0lwye41mt.R.inc(20696);return parseData(channel, remoteAddress, buf, locationPacketId, imei);

    }finally{__CLR4_5_2fs0fs0lwye41mt.R.flushNeeded();}}

}
