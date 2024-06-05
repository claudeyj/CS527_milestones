/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

@java.lang.SuppressWarnings({"fallthrough"}) public class OigoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c09c09lx1dzbka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,15723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OigoProtocolDecoder(OigoProtocol protocol) {
        super(protocol);__CLR4_5_2c09c09lx1dzbka.R.inc(15562);try{__CLR4_5_2c09c09lx1dzbka.R.inc(15561);
    }finally{__CLR4_5_2c09c09lx1dzbka.R.flushNeeded();}}

    public static final int MSG_AR_LOCATION = 0x00;
    public static final int MSG_AR_REMOTE_START = 0x10;

    public static final int MSG_ACKNOWLEDGEMENT = 0xE0;

    private Position decodeArMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2c09c09lx1dzbka.R.inc(15563);

        __CLR4_5_2c09c09lx1dzbka.R.inc(15564);buf.skipBytes(1); // header
        __CLR4_5_2c09c09lx1dzbka.R.inc(15565);buf.readUnsignedShort(); // length

        __CLR4_5_2c09c09lx1dzbka.R.inc(15566);int type = buf.readUnsignedByte();

        __CLR4_5_2c09c09lx1dzbka.R.inc(15567);int tag = buf.readUnsignedByte();

        __CLR4_5_2c09c09lx1dzbka.R.inc(15568);DeviceSession deviceSession;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2c09c09lx1dzbka.R.inc(15569);switch (BitUtil.to(tag, 3)) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2c09c09lx1dzbka.R.inc(15570);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c09c09lx1dzbka.R.inc(15571);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15572);deviceSession = getDeviceSession(channel, remoteAddress, imei);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15573);break;
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2c09c09lx1dzbka.R.inc(15574);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c09c09lx1dzbka.R.inc(15575);buf.skipBytes(1);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15576);String meid = buf.readBytes(14).toString(StandardCharsets.US_ASCII);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15577);deviceSession = getDeviceSession(channel, remoteAddress, meid);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15578);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c09c09lx1dzbka.R.inc(15579);__CLB4_5_2_bool0=true;}
                __CLR4_5_2c09c09lx1dzbka.R.inc(15580);deviceSession = getDeviceSession(channel, remoteAddress);
                __CLR4_5_2c09c09lx1dzbka.R.inc(15581);break;
        }

        __CLR4_5_2c09c09lx1dzbka.R.inc(15582);if ((((deviceSession == null || type != MSG_AR_LOCATION)&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15583)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15584)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15585);return null;
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15586);Position position = new Position();
        __CLR4_5_2c09c09lx1dzbka.R.inc(15587);position.setProtocol(getProtocolName());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15588);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15589);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15590);int mask = buf.readInt();

        __CLR4_5_2c09c09lx1dzbka.R.inc(15591);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15592)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15593)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15594);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15595);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15596)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15597)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15598);int date = buf.readUnsignedByte();
            __CLR4_5_2c09c09lx1dzbka.R.inc(15599);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(BitUtil.between(date, 4, 8) + 2010, BitUtil.to(date, 4), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            __CLR4_5_2c09c09lx1dzbka.R.inc(15600);position.setTime(dateBuilder.getDate());
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15601);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15602)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15603)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15604);buf.skipBytes(5); // device time
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15605);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15606)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15607)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15608);position.setLatitude(buf.readUnsignedInt() * 0.000001 - 90);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15609);position.setLongitude(buf.readUnsignedInt() * 0.000001 - 180.0);
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15610);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15611)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15612)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15613);int status = buf.readUnsignedByte();
            __CLR4_5_2c09c09lx1dzbka.R.inc(15614);position.setValid(BitUtil.between(status, 4, 8) != 0);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15615);position.set(Position.KEY_SATELLITES, BitUtil.to(status, 4));
            __CLR4_5_2c09c09lx1dzbka.R.inc(15616);position.set(Position.KEY_HDOP, buf.readUnsignedByte() * 0.1);
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15617);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15618)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15619)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15620);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15621);if ((((BitUtil.check(mask, 6))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15622)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15623)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15624);position.setCourse(buf.readUnsignedShort());
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15625);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15626)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15627)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15628);position.setAltitude(buf.readShort());
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15629);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15630)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15631)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15632);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15633);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15634)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15635)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15636);position.set(Position.KEY_POWER, buf.readUnsignedShort() + "mV");
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15637);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15638)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15639)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15640);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() + "mV");
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15641);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15642)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15643)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15644);buf.skipBytes(2); // gpio
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15645);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15646)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15647)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15648);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15649);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15650)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15651)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15652);buf.skipBytes(6); // software version
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15653);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15654)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15655)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15656);buf.skipBytes(5); // hardware version
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15657);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15658)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15659)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15660);buf.readUnsignedShort(); // device config
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15661);return position;
    }finally{__CLR4_5_2c09c09lx1dzbka.R.flushNeeded();}}

    private double convertCoordinate(long value) {try{__CLR4_5_2c09c09lx1dzbka.R.inc(15662);
        __CLR4_5_2c09c09lx1dzbka.R.inc(15663);boolean negative = value < 0;
        __CLR4_5_2c09c09lx1dzbka.R.inc(15664);value = Math.abs(value);
        __CLR4_5_2c09c09lx1dzbka.R.inc(15665);double minutes = (value % 100000) * 0.001;
        __CLR4_5_2c09c09lx1dzbka.R.inc(15666);value /= 100000;
        __CLR4_5_2c09c09lx1dzbka.R.inc(15667);double degrees = value + minutes / 60;
        __CLR4_5_2c09c09lx1dzbka.R.inc(15668);return (((negative )&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15669)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15670)==0&false))? -degrees : degrees;
    }finally{__CLR4_5_2c09c09lx1dzbka.R.flushNeeded();}}

    private Position decodeMgMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2c09c09lx1dzbka.R.inc(15671);

        __CLR4_5_2c09c09lx1dzbka.R.inc(15672);buf.readUnsignedByte(); // tag
        __CLR4_5_2c09c09lx1dzbka.R.inc(15673);int flags = buf.getUnsignedByte(buf.readerIndex());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15674);DeviceSession deviceSession;
        __CLR4_5_2c09c09lx1dzbka.R.inc(15675);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15676)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15677)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15678);buf.readUnsignedByte(); // flags
            __CLR4_5_2c09c09lx1dzbka.R.inc(15679);deviceSession = getDeviceSession(channel, remoteAddress);
        } }else {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15680);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15681);deviceSession = getDeviceSession(channel, remoteAddress, imei);
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15682);if ((((deviceSession == null)&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15683)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15684)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15685);return null;
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15686);Position position = new Position();
        __CLR4_5_2c09c09lx1dzbka.R.inc(15687);position.setProtocol(getProtocolName());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15688);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15689);buf.skipBytes(8); // imsi

        __CLR4_5_2c09c09lx1dzbka.R.inc(15690);int date = buf.readUnsignedShort();

        __CLR4_5_2c09c09lx1dzbka.R.inc(15691);DateBuilder dateBuilder = new DateBuilder()
                .setDate(2010 + BitUtil.from(date, 12), BitUtil.between(date, 8, 12), BitUtil.to(date, 8))
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), 0);

        __CLR4_5_2c09c09lx1dzbka.R.inc(15692);position.setValid(true);
        __CLR4_5_2c09c09lx1dzbka.R.inc(15693);position.setLatitude(convertCoordinate(buf.readInt()));
        __CLR4_5_2c09c09lx1dzbka.R.inc(15694);position.setLongitude(convertCoordinate(buf.readInt()));

        __CLR4_5_2c09c09lx1dzbka.R.inc(15695);position.setAltitude(UnitsConverter.metersFromFeet(buf.readShort()));
        __CLR4_5_2c09c09lx1dzbka.R.inc(15696);position.setCourse(buf.readUnsignedShort());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15697);position.setSpeed(UnitsConverter.knotsFromMph(buf.readUnsignedByte()));

        __CLR4_5_2c09c09lx1dzbka.R.inc(15698);position.set(Position.KEY_POWER, buf.readUnsignedByte() * 100 + "mV");
        __CLR4_5_2c09c09lx1dzbka.R.inc(15699);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15700);dateBuilder.setSecond(buf.readUnsignedByte());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15701);position.setTime(dateBuilder.getDate());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15702);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

        __CLR4_5_2c09c09lx1dzbka.R.inc(15703);int index = buf.readUnsignedByte();

        __CLR4_5_2c09c09lx1dzbka.R.inc(15704);position.set(Position.KEY_VERSION, buf.readUnsignedByte());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15705);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2c09c09lx1dzbka.R.inc(15706);position.set(Position.KEY_ODOMETER, (long) (buf.readUnsignedInt() * 1609.34));

        __CLR4_5_2c09c09lx1dzbka.R.inc(15707);if ((((channel != null && BitUtil.check(flags, 7))&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15708)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15709)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15710);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2c09c09lx1dzbka.R.inc(15711);response.writeByte(MSG_ACKNOWLEDGEMENT);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15712);response.writeByte(index);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15713);response.writeByte(0x00);
            __CLR4_5_2c09c09lx1dzbka.R.inc(15714);channel.write(response, remoteAddress);
        }

        }__CLR4_5_2c09c09lx1dzbka.R.inc(15715);return position;
    }finally{__CLR4_5_2c09c09lx1dzbka.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c09c09lx1dzbka.R.inc(15716);

        __CLR4_5_2c09c09lx1dzbka.R.inc(15717);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2c09c09lx1dzbka.R.inc(15718);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0x7e)&&(__CLR4_5_2c09c09lx1dzbka.R.iget(15719)!=0|true))||(__CLR4_5_2c09c09lx1dzbka.R.iget(15720)==0&false))) {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15721);return decodeArMessage(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2c09c09lx1dzbka.R.inc(15722);return decodeMgMessage(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2c09c09lx1dzbka.R.flushNeeded();}}

}
