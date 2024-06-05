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
import org.traccar.helper.Checksum;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.ObdDecoder;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

@java.lang.SuppressWarnings({"fallthrough"}) public class UlbotechProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2h8ch8clwye67a1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,22583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long timeZone;

    public UlbotechProtocolDecoder(UlbotechProtocol protocol) {
        super(protocol);__CLR4_5_2h8ch8clwye67a1.R.inc(22333);try{__CLR4_5_2h8ch8clwye67a1.R.inc(22332);
        __CLR4_5_2h8ch8clwye67a1.R.inc(22334);timeZone = Context.getConfig().getInteger(getProtocolName() + ".timezone", 0);
    }finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

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

    private void decodeObd(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22335);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22336);int end = buf.readerIndex() + length;

        __CLR4_5_2h8ch8clwye67a1.R.inc(22337);while ((((buf.readerIndex() < end)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22338)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22339)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22340);int parameterLength = buf.getUnsignedByte(buf.readerIndex()) >> 4;
            __CLR4_5_2h8ch8clwye67a1.R.inc(22341);int mode = buf.readUnsignedByte() & 0x0F;
            __CLR4_5_2h8ch8clwye67a1.R.inc(22342);position.add(ObdDecoder.decode(mode, ChannelBuffers.hexDump(buf.readBytes(parameterLength - 1))));
        }
    }}finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private void decodeJ1708(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22343);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22344);int end = buf.readerIndex() + length;

        __CLR4_5_2h8ch8clwye67a1.R.inc(22345);while ((((buf.readerIndex() < end)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22346)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22347)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22348);int mark = buf.readUnsignedByte();
            __CLR4_5_2h8ch8clwye67a1.R.inc(22349);int len = BitUtil.between(mark, 0, 6);
            __CLR4_5_2h8ch8clwye67a1.R.inc(22350);int type = BitUtil.between(mark, 6, 8);
            __CLR4_5_2h8ch8clwye67a1.R.inc(22351);int id = buf.readUnsignedByte();
            __CLR4_5_2h8ch8clwye67a1.R.inc(22352);if ((((type == 3)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22353)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22354)==0&false))) {{
                __CLR4_5_2h8ch8clwye67a1.R.inc(22355);id += 256;
            }
            }__CLR4_5_2h8ch8clwye67a1.R.inc(22356);String value = ChannelBuffers.hexDump(buf.readBytes(len - 1));
            __CLR4_5_2h8ch8clwye67a1.R.inc(22357);if ((((type == 2 || type == 3)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22358)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22359)==0&false))) {{
                __CLR4_5_2h8ch8clwye67a1.R.inc(22360);position.set("pid" + id, value);
            }
        }}
    }}finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private void decodeDriverBehavior(Position position, ChannelBuffer buf) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22361);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22362);int value = buf.readUnsignedByte();

        __CLR4_5_2h8ch8clwye67a1.R.inc(22363);if ((((BitUtil.check(value, 0))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22364)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22365)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22366);position.set("rapidAcceleration", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22367);if ((((BitUtil.check(value, 1))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22368)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22369)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22370);position.set("roughBraking", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22371);if ((((BitUtil.check(value, 2))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22372)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22373)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22374);position.set("harshCourse", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22375);if ((((BitUtil.check(value, 3))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22376)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22377)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22378);position.set("noWarmUp", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22379);if ((((BitUtil.check(value, 4))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22380)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22381)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22382);position.set("longIdle", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22383);if ((((BitUtil.check(value, 5))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22384)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22385)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22386);position.set("fatigueDriving", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22387);if ((((BitUtil.check(value, 6))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22388)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22389)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22390);position.set("roughTerrain", true);
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22391);if ((((BitUtil.check(value, 7))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22392)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22393)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22394);position.set("highRpm", true);
        }
    }}finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private String decodeAlarm(int alarm) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22395);
        __CLR4_5_2h8ch8clwye67a1.R.inc(22396);if ((((BitUtil.check(alarm, 0))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22397)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22398)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22399);return Position.ALARM_POWER_OFF;
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22400);if ((((BitUtil.check(alarm, 1))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22401)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22402)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22403);return Position.ALARM_MOVEMENT;
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22404);if ((((BitUtil.check(alarm, 2))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22405)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22406)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22407);return Position.ALARM_OVERSPEED;
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22408);if ((((BitUtil.check(alarm, 4))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22409)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22410)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22411);return Position.ALARM_GEOFENCE;
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22412);if ((((BitUtil.check(alarm, 10))&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22413)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22414)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22415);return Position.ALARM_SOS;
        }
        }__CLR4_5_2h8ch8clwye67a1.R.inc(22416);return null;
    }finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private void decodeAdc(Position position, ChannelBuffer buf, int length) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22417);
        __CLR4_5_2h8ch8clwye67a1.R.inc(22418);for (int i = 0; (((i < length / 2)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22419)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22420)==0&false)); i++) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22421);int value = buf.readUnsignedShort();
            __CLR4_5_2h8ch8clwye67a1.R.inc(22422);int id = BitUtil.from(value, 12);
            __CLR4_5_2h8ch8clwye67a1.R.inc(22423);value = BitUtil.to(value, 12);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2h8ch8clwye67a1.R.inc(22424);switch (id) {
                case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2h8ch8clwye67a1.R.inc(22425);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22426);position.set(Position.KEY_POWER, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22427);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2h8ch8clwye67a1.R.inc(22428);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22429);position.set(Position.PREFIX_TEMP + 1, value * (125 + 55) / 4096.0 - 55);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22430);break;
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2h8ch8clwye67a1.R.inc(22431);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22432);position.set(Position.KEY_BATTERY, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22433);break;
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2h8ch8clwye67a1.R.inc(22434);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22435);position.set(Position.PREFIX_ADC + 1, value * (100 + 10) / 4096.0 - 10);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22436);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2h8ch8clwye67a1.R.inc(22437);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22438);position.set(Position.PREFIX_IO + id, value);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22439);break;
            }
        }
    }}finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private static final Pattern PATTERN = new PatternBuilder()
            .text("*TS")
            .number("dd,")                       // protocol version
            .number("(d{15}),")                  // device id
            .number("(dd)(dd)(dd)")              // time
            .number("(dd)(dd)(dd),")             // date
            .expression("([^#]+)")               // command
            .text("#")
            .compile();

    private Object decodeText(Channel channel, SocketAddress remoteAddress, String sentence) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22440);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22441);Parser parser = new Parser(PATTERN, sentence);
        __CLR4_5_2h8ch8clwye67a1.R.inc(22442);if ((((!parser.matches())&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22443)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22444)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22445);return null;
        }

        }__CLR4_5_2h8ch8clwye67a1.R.inc(22446);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, parser.next());
        __CLR4_5_2h8ch8clwye67a1.R.inc(22447);if ((((deviceSession == null)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22448)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22449)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22450);return null;
        }

        }__CLR4_5_2h8ch8clwye67a1.R.inc(22451);Position position = new Position();
        __CLR4_5_2h8ch8clwye67a1.R.inc(22452);position.setProtocol(getProtocolName());
        __CLR4_5_2h8ch8clwye67a1.R.inc(22453);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2h8ch8clwye67a1.R.inc(22454);DateBuilder dateBuilder = new DateBuilder()
                .setTime(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0))
                .setDateReverse(parser.nextInt(0), parser.nextInt(0), parser.nextInt(0));

        __CLR4_5_2h8ch8clwye67a1.R.inc(22455);getLastLocation(position, dateBuilder.getDate());

        __CLR4_5_2h8ch8clwye67a1.R.inc(22456);position.set(Position.KEY_RESULT, parser.next());

        __CLR4_5_2h8ch8clwye67a1.R.inc(22457);return position;
    }finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    private Object decodeBinary(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22458);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22459);buf.readUnsignedByte(); // header
        __CLR4_5_2h8ch8clwye67a1.R.inc(22460);buf.readUnsignedByte(); // version
        __CLR4_5_2h8ch8clwye67a1.R.inc(22461);buf.readUnsignedByte(); // type

        __CLR4_5_2h8ch8clwye67a1.R.inc(22462);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22463);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2h8ch8clwye67a1.R.inc(22464);if ((((deviceSession == null)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22465)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22466)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22467);return null;
        }

        }__CLR4_5_2h8ch8clwye67a1.R.inc(22468);Position position = new Position();
        __CLR4_5_2h8ch8clwye67a1.R.inc(22469);position.setProtocol(getProtocolName());
        __CLR4_5_2h8ch8clwye67a1.R.inc(22470);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2h8ch8clwye67a1.R.inc(22471);long seconds = buf.readUnsignedInt() & 0x7fffffffL;
        __CLR4_5_2h8ch8clwye67a1.R.inc(22472);seconds += 946684800L; // 2000-01-01 00:00
        __CLR4_5_2h8ch8clwye67a1.R.inc(22473);seconds -= timeZone;
        __CLR4_5_2h8ch8clwye67a1.R.inc(22474);Date time = new Date(seconds * 1000);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22475);boolean hasLocation = false;

        __CLR4_5_2h8ch8clwye67a1.R.inc(22476);while ((((buf.readableBytes() > 3)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22477)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22478)==0&false))) {{

            __CLR4_5_2h8ch8clwye67a1.R.inc(22479);int type = buf.readUnsignedByte();
            __CLR4_5_2h8ch8clwye67a1.R.inc(22480);int length = (((type == DATA_CANBUS )&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22481)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22482)==0&false))? buf.readUnsignedShort() : buf.readUnsignedByte();

            boolean __CLB4_5_2_bool1=false;__CLR4_5_2h8ch8clwye67a1.R.inc(22483);switch (type) {

                case DATA_GPS:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22484);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22485);hasLocation = true;
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22486);position.setValid(true);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22487);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22488);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22489);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22490);position.setCourse(buf.readUnsignedShort());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22491);position.set(Position.KEY_HDOP, buf.readUnsignedShort());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22492);break;

                case DATA_LBS:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22493);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22494);if ((((length == 11)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22495)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22496)==0&false))) {{
                        __CLR4_5_2h8ch8clwye67a1.R.inc(22497);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedShort(),
                                buf.readUnsignedShort(), buf.readUnsignedInt(), -buf.readUnsignedByte())));
                    } }else {{
                        __CLR4_5_2h8ch8clwye67a1.R.inc(22498);position.setNetwork(new Network(CellTower.from(
                                buf.readUnsignedShort(), buf.readUnsignedShort(),
                                buf.readUnsignedShort(), buf.readUnsignedShort(), -buf.readUnsignedByte())));
                    }
                    }__CLR4_5_2h8ch8clwye67a1.R.inc(22499);if ((((length > 9 && length != 11)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22500)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22501)==0&false))) {{
                        __CLR4_5_2h8ch8clwye67a1.R.inc(22502);buf.skipBytes(length - 9);
                    }
                    }__CLR4_5_2h8ch8clwye67a1.R.inc(22503);break;

                case DATA_STATUS:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22504);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22505);int status = buf.readUnsignedShort();
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22506);position.set(Position.KEY_IGNITION, BitUtil.check(status, 9));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22507);position.set(Position.KEY_STATUS, status);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22508);position.set(Position.KEY_ALARM, decodeAlarm(buf.readUnsignedShort()));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22509);break;

                case DATA_ODOMETER:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22510);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22511);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22512);break;

                case DATA_ADC:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22513);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22514);decodeAdc(position, buf, length);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22515);break;

                case DATA_GEOFENCE:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22516);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22517);position.set("geofenceIn", buf.readUnsignedInt());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22518);position.set("geofenceAlarm", buf.readUnsignedInt());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22519);break;

                case DATA_OBD2:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22520);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22521);decodeObd(position, buf, length);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22522);break;

                case DATA_FUEL:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22523);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22524);position.set(Position.KEY_FUEL_CONSUMPTION, buf.readUnsignedInt() / 10000.0);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22525);break;

                case DATA_OBD2_ALARM:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22526);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22527);decodeObd(position, buf, length);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22528);break;

                case DATA_HARSH_DRIVER:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22529);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22530);decodeDriverBehavior(position, buf);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22531);break;

                case DATA_CANBUS:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22532);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22533);position.set("can", ChannelBuffers.hexDump(buf.readBytes(length)));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22534);break;

                case DATA_J1708:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22535);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22536);decodeJ1708(position, buf, length);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22537);break;

                case DATA_VIN:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22538);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22539);position.set(Position.KEY_VIN, buf.readBytes(length).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22540);break;

                case DATA_RFID:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22541);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22542);position.set(Position.KEY_DRIVER_UNIQUE_ID,
                            buf.readBytes(length - 1).toString(StandardCharsets.US_ASCII));
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22543);position.set("authorized", buf.readUnsignedByte() != 0);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22544);break;

                case DATA_EVENT:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22545);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22546);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22547);if ((((length > 1)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22548)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22549)==0&false))) {{
                        __CLR4_5_2h8ch8clwye67a1.R.inc(22550);position.set("eventMask", buf.readUnsignedInt());
                    }
                    }__CLR4_5_2h8ch8clwye67a1.R.inc(22551);break;

                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2h8ch8clwye67a1.R.inc(22552);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22553);buf.skipBytes(length);
                    __CLR4_5_2h8ch8clwye67a1.R.inc(22554);break;
            }
        }

        }__CLR4_5_2h8ch8clwye67a1.R.inc(22555);if ((((!hasLocation)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22556)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22557)==0&false))) {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22558);getLastLocation(position, time);
        } }else {{
            __CLR4_5_2h8ch8clwye67a1.R.inc(22559);position.setTime(time);
        }

        }__CLR4_5_2h8ch8clwye67a1.R.inc(22560);return position;
    }finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2h8ch8clwye67a1.R.inc(22561);

        __CLR4_5_2h8ch8clwye67a1.R.inc(22562);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2h8ch8clwye67a1.R.inc(22563);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0xF8)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22564)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22565)==0&false))) {{

            __CLR4_5_2h8ch8clwye67a1.R.inc(22566);if ((((channel != null)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22567)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22568)==0&false))) {{
                __CLR4_5_2h8ch8clwye67a1.R.inc(22569);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                __CLR4_5_2h8ch8clwye67a1.R.inc(22570);response.writeByte(0xF8);
                __CLR4_5_2h8ch8clwye67a1.R.inc(22571);response.writeByte(DATA_GPS);
                __CLR4_5_2h8ch8clwye67a1.R.inc(22572);response.writeByte(0xFE);
                __CLR4_5_2h8ch8clwye67a1.R.inc(22573);response.writeShort(buf.getShort(response.writerIndex() - 1 - 2));
                __CLR4_5_2h8ch8clwye67a1.R.inc(22574);response.writeShort(Checksum.crc16(Checksum.CRC16_XMODEM, response.toByteBuffer(1, 4)));
                __CLR4_5_2h8ch8clwye67a1.R.inc(22575);response.writeByte(0xF8);
                __CLR4_5_2h8ch8clwye67a1.R.inc(22576);channel.write(response);
            }

            }__CLR4_5_2h8ch8clwye67a1.R.inc(22577);return decodeBinary(channel, remoteAddress, buf);
        } }else {{

            __CLR4_5_2h8ch8clwye67a1.R.inc(22578);if ((((channel != null)&&(__CLR4_5_2h8ch8clwye67a1.R.iget(22579)!=0|true))||(__CLR4_5_2h8ch8clwye67a1.R.iget(22580)==0&false))) {{
                __CLR4_5_2h8ch8clwye67a1.R.inc(22581);channel.write(ChannelBuffers.copiedBuffer(String.format("*TS01,ACK:%04X#",
                        Checksum.crc16(Checksum.CRC16_XMODEM, buf.toByteBuffer(1, buf.writerIndex() - 2))),
                        StandardCharsets.US_ASCII));
            }

            }__CLR4_5_2h8ch8clwye67a1.R.inc(22582);return decodeText(channel, remoteAddress, buf.toString(StandardCharsets.US_ASCII));
        }
    }}finally{__CLR4_5_2h8ch8clwye67a1.R.flushNeeded();}}

}
