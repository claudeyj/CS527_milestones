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

@java.lang.SuppressWarnings({"fallthrough"}) public class TeltonikaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fs1fs1lwydwev3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,20698,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean connectionless;
    private boolean extended;

    public void setExtended(boolean extended) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20449);
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20450);this.extended = extended;
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    public TeltonikaProtocolDecoder(TeltonikaProtocol protocol, boolean connectionless) {
        super(protocol);__CLR4_5_2fs1fs1lwydwev3.R.inc(20452);try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20451);
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20453);this.connectionless = connectionless;
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20454);this.extended = Context.getConfig().getBoolean(getProtocolName() + ".extended");
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private DeviceSession parseIdentification(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20455);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20456);int length = buf.readUnsignedShort();
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20457);String imei = buf.toString(buf.readerIndex(), length, StandardCharsets.US_ASCII);
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20458);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20459);if ((((channel != null)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20460)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20461)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20462);ChannelBuffer response = ChannelBuffers.directBuffer(1);
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20463);if ((((deviceSession != null)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20464)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20465)==0&false))) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20466);response.writeByte(1);
            } }else {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20467);response.writeByte(0);
            }
            }__CLR4_5_2fs1fs1lwydwev3.R.inc(20468);channel.write(response);
        }
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20469);return deviceSession;
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    public static final int CODEC_GH3000 = 0x07;
    public static final int CODEC_FM4X00 = 0x08;
    public static final int CODEC_12 = 0x0C;

    private void decodeSerial(Position position, ChannelBuffer buf) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20470);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20471);getLastLocation(position, null);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20472);position.set(Position.KEY_TYPE, buf.readUnsignedByte());

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20473);position.set(Position.KEY_COMMAND, buf.readBytes(buf.readInt()).toString(StandardCharsets.US_ASCII));

    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private long readValue(ChannelBuffer buf, int length, boolean signed) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20474);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2fs1fs1lwydwev3.R.inc(20475);switch (length) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20476);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20477);return (((signed )&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20478)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20479)==0&false))? buf.readByte() : buf.readUnsignedByte();
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20480);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20481);return (((signed )&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20482)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20483)==0&false))? buf.readShort() : buf.readUnsignedShort();
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20484);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20485);return (((signed )&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20486)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20487)==0&false))? buf.readInt() : buf.readUnsignedInt();
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20488);__CLB4_5_2_bool0=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20489);return buf.readLong();
        }
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private void decodeParameter(Position position, int id, ChannelBuffer buf, int length) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20490);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_2fs1fs1lwydwev3.R.inc(20491);switch (id) {
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20492);__CLB4_5_2_bool1=true;}
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20493);__CLB4_5_2_bool1=true;}
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20494);__CLB4_5_2_bool1=true;}
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20495);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20496);position.set("di" + id, readValue(buf, length, false));
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20497);break;
            case 9:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20498);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20499);position.set(Position.PREFIX_ADC + 1, readValue(buf, length, false));
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20500);break;
            case 66:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20501);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20502);position.set(Position.KEY_POWER, readValue(buf, length, false) * 0.001);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20503);break;
            case 67:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20504);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20505);position.set(Position.KEY_BATTERY, readValue(buf, length, false) * 0.001);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20506);break;
            case 70:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20507);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20508);position.set(Position.KEY_DEVICE_TEMP, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20509);break;
            case 72:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20510);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20511);position.set(Position.PREFIX_TEMP + 1, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20512);break;
            case 73:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20513);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20514);position.set(Position.PREFIX_TEMP + 2, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20515);break;
            case 74:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20516);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20517);position.set(Position.PREFIX_TEMP + 3, readValue(buf, length, true) * 0.1);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20518);break;
            case 78:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20519);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20520);position.set(Position.KEY_DRIVER_UNIQUE_ID, String.valueOf(readValue(buf, length, false)));
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20521);break;
            case 182:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20522);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20523);position.set(Position.KEY_HDOP, readValue(buf, length, false) * 0.1);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20524);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2fs1fs1lwydwev3.R.inc(20525);__CLB4_5_2_bool1=true;}
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20526);position.set(Position.PREFIX_IO + id, readValue(buf, length, false));
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20527);break;
        }
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private void decodeLocation(Position position, ChannelBuffer buf, int codec) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20528);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20529);int globalMask = 0x0f;

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20530);if ((((codec == CODEC_GH3000)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20531)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20532)==0&false))) {{

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20533);long time = buf.readUnsignedInt() & 0x3fffffff;
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20534);time += 1167609600; // 2007-01-01 00:00:00

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20535);globalMask = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20536);if ((((BitUtil.check(globalMask, 0))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20537)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20538)==0&false))) {{

                __CLR4_5_2fs1fs1lwydwev3.R.inc(20539);position.setTime(new Date(time * 1000));

                __CLR4_5_2fs1fs1lwydwev3.R.inc(20540);int locationMask = buf.readUnsignedByte();

                __CLR4_5_2fs1fs1lwydwev3.R.inc(20541);if ((((BitUtil.check(locationMask, 0))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20542)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20543)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20544);position.setLatitude(buf.readFloat());
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20545);position.setLongitude(buf.readFloat());
                }

                }__CLR4_5_2fs1fs1lwydwev3.R.inc(20546);if ((((BitUtil.check(locationMask, 1))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20547)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20548)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20549);position.setAltitude(buf.readUnsignedShort());
                }

                }__CLR4_5_2fs1fs1lwydwev3.R.inc(20550);if ((((BitUtil.check(locationMask, 2))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20551)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20552)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20553);position.setCourse(buf.readUnsignedByte() * 360.0 / 256);
                }

                }__CLR4_5_2fs1fs1lwydwev3.R.inc(20554);if ((((BitUtil.check(locationMask, 3))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20555)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20556)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20557);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
                }

                }__CLR4_5_2fs1fs1lwydwev3.R.inc(20558);if ((((BitUtil.check(locationMask, 4))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20559)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20560)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20561);int satellites = buf.readUnsignedByte();
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20562);position.set(Position.KEY_SATELLITES, satellites);
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20563);position.setValid(satellites >= 3);
                }

                }__CLR4_5_2fs1fs1lwydwev3.R.inc(20564);if ((((BitUtil.check(locationMask, 5))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20565)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20566)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20567);CellTower cellTower = CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort());

                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20568);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20569)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20570)==0&false))) {{
                        __CLR4_5_2fs1fs1lwydwev3.R.inc(20571);cellTower.setSignalStrength((int) buf.readUnsignedByte());
                    }

                    }__CLR4_5_2fs1fs1lwydwev3.R.inc(20572);position.setNetwork(new Network(cellTower));

                } }else {__CLR4_5_2fs1fs1lwydwev3.R.inc(20573);if ((((BitUtil.check(locationMask, 6))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20574)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20575)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20576);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
                }

                }}__CLR4_5_2fs1fs1lwydwev3.R.inc(20577);if ((((BitUtil.check(locationMask, 7))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20578)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20579)==0&false))) {{
                    __CLR4_5_2fs1fs1lwydwev3.R.inc(20580);position.set(Position.KEY_OPERATOR, buf.readUnsignedInt());
                }

            }} }else {{

                __CLR4_5_2fs1fs1lwydwev3.R.inc(20581);getLastLocation(position, new Date(time * 1000));

            }

        }} }else {{

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20582);position.setTime(new Date(buf.readLong()));

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20583);position.set("priority", buf.readUnsignedByte());

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20584);position.setLongitude(buf.readInt() / 10000000.0);
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20585);position.setLatitude(buf.readInt() / 10000000.0);
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20586);position.setAltitude(buf.readShort());
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20587);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20588);int satellites = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20589);position.set(Position.KEY_SATELLITES, satellites);

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20590);position.setValid(satellites != 0);

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20591);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20592);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20593);buf.readUnsignedByte(); // total IO data records

        }

        // Read 1 byte data
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20594);if ((((BitUtil.check(globalMask, 1))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20595)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20596)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20597);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20598);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20599)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20600)==0&false)); j++) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20601);decodeParameter(position, buf.readUnsignedByte(), buf, 1);
            }
        }}

        // Read 2 byte data
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20602);if ((((BitUtil.check(globalMask, 2))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20603)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20604)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20605);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20606);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20607)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20608)==0&false)); j++) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20609);decodeParameter(position, buf.readUnsignedByte(), buf, 2);
            }
        }}

        // Read 4 byte data
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20610);if ((((BitUtil.check(globalMask, 3))&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20611)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20612)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20613);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20614);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20615)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20616)==0&false)); j++) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20617);decodeParameter(position, buf.readUnsignedByte(), buf, 4);
            }
        }}

        // Read 8 byte data
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20618);if ((((codec == CODEC_FM4X00)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20619)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20620)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20621);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20622);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20623)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20624)==0&false)); j++) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20625);decodeParameter(position, buf.readUnsignedByte(), buf, 8);
            }
        }}

        // Read 16 byte data
        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20626);if ((((extended)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20627)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20628)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20629);int cnt = buf.readUnsignedByte();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20630);for (int j = 0; (((j < cnt)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20631)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20632)==0&false)); j++) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20633);position.set(Position.PREFIX_IO + buf.readUnsignedByte(), ChannelBuffers.hexDump(buf.readBytes(16)));
            }
        }}

    }}finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private List<Position> parseData(
            Channel channel, SocketAddress remoteAddress, ChannelBuffer buf, int locationPacketId, String... imei) {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20634);
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20635);List<Position> positions = new LinkedList<>();

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20636);if ((((!connectionless)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20637)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20638)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20639);buf.readUnsignedInt(); // data length
        }

        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20640);int codec = buf.readUnsignedByte();
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20641);int count = buf.readUnsignedByte();

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20642);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20643);if ((((deviceSession == null)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20644)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20645)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20646);return null;
        }

        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20647);for (int i = 0; (((i < count)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20648)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20649)==0&false)); i++) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20650);Position position = new Position();
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20651);position.setProtocol(getProtocolName());

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20652);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fs1fs1lwydwev3.R.inc(20653);if ((((codec == CODEC_12)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20654)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20655)==0&false))) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20656);decodeSerial(position, buf);
            } }else {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20657);decodeLocation(position, buf, codec);
            }

            }__CLR4_5_2fs1fs1lwydwev3.R.inc(20658);positions.add(position);
        }

        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20659);if ((((channel != null)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20660)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20661)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20662);if ((((connectionless)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20663)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20664)==0&false))) {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20665);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20666);response.writeShort(5);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20667);response.writeShort(0);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20668);response.writeByte(0x01);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20669);response.writeByte(locationPacketId);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20670);response.writeByte(count);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20671);channel.write(response, remoteAddress);
            } }else {{
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20672);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20673);response.writeInt(count);
                __CLR4_5_2fs1fs1lwydwev3.R.inc(20674);channel.write(response);
            }
        }}

        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20675);return positions;
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20676);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20677);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20678);if ((((connectionless)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20679)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20680)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20681);return decodeUdp(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20682);return decodeTcp(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private Object decodeTcp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20683);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20684);if ((((buf.getUnsignedShort(0) > 0)&&(__CLR4_5_2fs1fs1lwydwev3.R.iget(20685)!=0|true))||(__CLR4_5_2fs1fs1lwydwev3.R.iget(20686)==0&false))) {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20687);parseIdentification(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20688);buf.skipBytes(4);
            __CLR4_5_2fs1fs1lwydwev3.R.inc(20689);return parseData(channel, remoteAddress, buf, 0);
        }

        }__CLR4_5_2fs1fs1lwydwev3.R.inc(20690);return null;
    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

    private Object decodeUdp(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) throws Exception {try{__CLR4_5_2fs1fs1lwydwev3.R.inc(20691);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20692);buf.readUnsignedShort(); // length
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20693);buf.readUnsignedShort(); // packet id
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20694);buf.readUnsignedByte(); // packet type
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20695);int locationPacketId = buf.readUnsignedByte();
        __CLR4_5_2fs1fs1lwydwev3.R.inc(20696);String imei = buf.readBytes(buf.readUnsignedShort()).toString(StandardCharsets.US_ASCII);

        __CLR4_5_2fs1fs1lwydwev3.R.inc(20697);return parseData(channel, remoteAddress, buf, locationPacketId, imei);

    }finally{__CLR4_5_2fs1fs1lwydwev3.R.flushNeeded();}}

}
