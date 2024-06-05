/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.ObdDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@java.lang.SuppressWarnings({"fallthrough"}) public class UlbotechProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ey7ey7lx1dxq9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,19590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long timeZone;

    public UlbotechProtocolDecoder(UlbotechProtocol protocol) {
        super(protocol);__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19376);try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19375);
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19377);timeZone = Context.getConfig().getInteger(getProtocolName() + ".timezone", 0);
    }finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    private static final short DATA_GPS = 0x01;
    private static final short DATA_LBS = 0x02;
    private static final short DATA_STATUS = 0x03;
    private static final short DATA_ODOMETER = 0x04;
    private static final short DATA_ADC = 0x05;
    private static final short DATA_GEOFENCE = 0x06;
    private static final short DATA_OBD2 = 0x07;
    private static final short DATA_FUEL = 0x08;
    private static final short DATA_OBD2_ALARM = 0x09;
    private static final short DATA_HARSH_DRIVER = 0x0A;
    private static final short DATA_CANBUS = 0x0B;
    private static final short DATA_J1708 = 0x0C;
    private static final short DATA_VIN = 0x0D;
    private static final short DATA_RFID = 0x0E;
    private static final short DATA_EVENT = 0x10;

    private void decodeObd(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19378);

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19379);int end = buf.readerIndex() + length;

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19380);while ((((buf.readerIndex() < end)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19381)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19382)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19383);int parameterLength = buf.getUnsignedByte(buf.readerIndex()) >> 4;
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19384);int mode = buf.readUnsignedByte() & 0x0F;
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19385);position.add(ObdDecoder.decode(mode, ChannelBuffers.hexDump(buf.readBytes(parameterLength - 1))));
        }
    }}finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    private void decodeJ1708(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19386);

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19387);int end = buf.readerIndex() + length;

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19388);while ((((buf.readerIndex() < end)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19389)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19390)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19391);int mark = buf.readUnsignedByte();
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19392);int len = BitUtil.between(mark, 0, 6);
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19393);int type = BitUtil.between(mark, 6, 8);
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19394);int id = buf.readUnsignedByte();
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19395);if ((((type == 3)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19396)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19397)==0&false))) {{
                __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19398);id += 256;
            }
            }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19399);String value = ChannelBuffers.hexDump(buf.readBytes(len - 1));
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19400);if ((((type == 2 || type == 3)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19401)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19402)==0&false))) {{
                __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19403);position.set("pid" + id, value);
            }
        }}
    }}finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    private void decodeDriverBehavior(Position position, ChannelBuffer buf) {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19404);

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19405);int value = buf.readUnsignedByte();

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19406);if ((((BitUtil.check(value, 0))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19407)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19408)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19409);position.set("rapidAcceleration", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19410);if ((((BitUtil.check(value, 1))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19411)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19412)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19413);position.set("roughBraking", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19414);if ((((BitUtil.check(value, 2))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19415)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19416)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19417);position.set("harshCourse", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19418);if ((((BitUtil.check(value, 3))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19419)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19420)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19421);position.set("noWarmUp", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19422);if ((((BitUtil.check(value, 4))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19423)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19424)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19425);position.set("longIdle", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19426);if ((((BitUtil.check(value, 5))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19427)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19428)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19429);position.set("fatigueDriving", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19430);if ((((BitUtil.check(value, 6))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19431)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19432)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19433);position.set("roughTerrain", true);
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19434);if ((((BitUtil.check(value, 7))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19435)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19436)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19437);position.set("highRpm", true);
        }
    }}finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    private String decodeAlarm(int alarm) {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19438);
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19439);if ((((BitUtil.check(alarm, 0))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19440)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19441)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19442);return Position.ALARM_POWER_OFF;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19443);if ((((BitUtil.check(alarm, 1))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19444)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19445)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19446);return Position.ALARM_MOVEMENT;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19447);if ((((BitUtil.check(alarm, 2))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19448)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19449)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19450);return Position.ALARM_OVERSPEED;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19451);if ((((BitUtil.check(alarm, 4))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19452)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19453)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19454);return Position.ALARM_GEOFENCE;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19455);if ((((BitUtil.check(alarm, 10))&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19456)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19457)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19458);return Position.ALARM_SOS;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19459);return null;
    }finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    private void decodeAdc(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19460);
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19461);for (int i = 0; (((i < length / 2)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19462)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19463)==0&false)); i++) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19464);int value = buf.readUnsignedShort();
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19465);int id = BitUtil.from(value, 12);
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19466);value = BitUtil.to(value, 12);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19467);switch (id) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19468);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19469);position.set(Position.KEY_POWER, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19470);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19471);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19472);position.set(Position.PREFIX_TEMP + 1, value * (125 + 55) / 4096.0 - 55);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19473);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19474);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19475);position.set(Position.KEY_BATTERY, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19476);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19477);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19478);position.set(Position.PREFIX_ADC + 1, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19479);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19480);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19481);position.set(Position.PREFIX_IO + id, value);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19482);break;
            }
        }
    }}finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19483);

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19484);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19485);if ((((buf.readUnsignedByte() != 0xF8)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19486)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19487)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19488);return null;
        }

        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19489);buf.readUnsignedByte(); // version
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19490);buf.readUnsignedByte(); // type

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19491);Position position = new Position();
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19492);position.setProtocol(getProtocolName());

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19493);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19494);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19495);if ((((deviceSession == null)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19496)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19497)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19498);return null;
        }
        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19499);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19500);long seconds = buf.readUnsignedInt() & 0x7fffffffL;
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19501);seconds += 946684800L; // 2000-01-01 00:00
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19502);seconds -= timeZone;
        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19503);Date time = new Date(seconds * 1000);

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19504);boolean hasLocation = false;

        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19505);while ((((buf.readableBytes() > 3)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19506)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19507)==0&false))) {{

            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19508);int type = buf.readUnsignedByte();
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19509);int length = (((type == DATA_CANBUS )&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19510)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19511)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();

            boolean __CLB4_5_2_bool1=false;__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19512);switch (type) {

                case DATA_GPS:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19513);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19514);hasLocation = true;
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19515);position.setValid(true);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19516);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19517);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19518);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19519);position.setCourse(buf.readUnsignedShort());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19520);position.set(Position.KEY_HDOP, buf.readUnsignedShort());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19521);break;

                case DATA_LBS:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19522);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19523);if ((((length == 11)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19524)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19525)==0&false))) {{
                        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19526);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedShort(),
                                buf.readUnsignedShort(), buf.readUnsignedInt(), -buf.readUnsignedByte())));
                    } }else {{
                        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19527);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedShort(),
                                buf.readUnsignedShort(), buf.readUnsignedShort(), -buf.readUnsignedByte())));
                    }
                    }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19528);if ((((length > 9 && length != 11)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19529)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19530)==0&false))) {{
                        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19531);buf.skipBytes(length - 9);
                    }
                    }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19532);break;

                case DATA_STATUS:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19533);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19534);int status = buf.readUnsignedShort();
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19535);position.set(Position.KEY_IGNITION, BitUtil.check(status, 9));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19536);position.set(Position.KEY_STATUS, status);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19537);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedShort()));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19538);break;

                case DATA_ODOMETER:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19539);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19540);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19541);break;

                case DATA_ADC:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19542);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19543);decodeAdc(position, buf, length);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19544);break;

                case DATA_GEOFENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19545);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19546);position.set("geofenceIn", buf.readUnsignedInt());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19547);position.set("geofenceAlarm", buf.readUnsignedInt());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19548);break;

                case DATA_OBD2:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19549);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19550);decodeObd(position, buf, length);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19551);break;

                case DATA_FUEL:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19552);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19553);position.set("fuelConsumption", buf.readUnsignedInt() / 10000.0);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19554);break;

                case DATA_OBD2_ALARM:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19555);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19556);decodeObd(position, buf, length);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19557);break;

                case DATA_HARSH_DRIVER:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19558);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19559);decodeDriverBehavior(position, buf);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19560);break;

                case DATA_CANBUS:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19561);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19562);position.set("can", ChannelBuffers.hexDump(buf.readBytes(length)));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19563);break;

                case DATA_J1708:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19564);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19565);decodeJ1708(position, buf, length);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19566);break;

                case DATA_VIN:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19567);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19568);position.set(Position.KEY_VIN, buf.readBytes(length).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19569);break;

                case DATA_RFID:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19570);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19571);position.set(Position.KEY_RFID, buf.readBytes(length - 1).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19572);position.set("authorized", buf.readUnsignedByte() != 0);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19573);break;

                case DATA_EVENT:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19574);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19575);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19576);if ((((length > 1)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19577)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19578)==0&false))) {{
                        __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19579);position.set("eventMask", buf.readUnsignedInt());
                    }
                    }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19580);break;

                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19581);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19582);buf.skipBytes(length);
                    __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19583);break;
            }
        }

        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19584);if ((((!hasLocation)&&(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19585)!=0|true))||(__CLR4_5_2ey7ey7lx1dxq9p.R.iget(19586)==0&false))) {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19587);getLastLocation(position, time);
        } }else {{
            __CLR4_5_2ey7ey7lx1dxq9p.R.inc(19588);position.setTime(time);
        }

        }__CLR4_5_2ey7ey7lx1dxq9p.R.inc(19589);return position;
    }finally{__CLR4_5_2ey7ey7lx1dxq9p.R.flushNeeded();}}

}
