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

@java.lang.SuppressWarnings({"fallthrough"}) public class OigoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dtkdtklwye7gjt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,18074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OigoProtocolDecoder(OigoProtocol protocol) {
        super(protocol);__CLR4_5_2dtkdtklwye7gjt.R.inc(17913);try{__CLR4_5_2dtkdtklwye7gjt.R.inc(17912);
    }finally{__CLR4_5_2dtkdtklwye7gjt.R.flushNeeded();}}

    public static final int MSG_AR_LOCATION = 0x00;
    public static final int MSG_AR_REMOTE_START = 0x10;

    public static final int MSG_ACKNOWLEDGEMENT = 0xE0;

    private Position decodeArMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2dtkdtklwye7gjt.R.inc(17914);

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17915);buf.skipBytes(1); // header
        __CLR4_5_2dtkdtklwye7gjt.R.inc(17916);buf.readUnsignedShort(); // length

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17917);int type = buf.readUnsignedByte();

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17918);int tag = buf.readUnsignedByte();

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17919);DeviceSession deviceSession;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2dtkdtklwye7gjt.R.inc(17920);switch (BitUtil.to(tag, 3)) {
            case 0:if (!__CLB4_5_2_bool0) {__CLR4_5_2dtkdtklwye7gjt.R.inc(17921);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17922);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17923);deviceSession = getDeviceSession(channel, remoteAddress, imei);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17924);break;
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2dtkdtklwye7gjt.R.inc(17925);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17926);buf.skipBytes(1);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17927);String meid = buf.readBytes(14).toString(StandardCharsets.US_ASCII);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17928);deviceSession = getDeviceSession(channel, remoteAddress, meid);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17929);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2dtkdtklwye7gjt.R.inc(17930);__CLB4_5_2_bool0=true;}
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17931);deviceSession = getDeviceSession(channel, remoteAddress);
                __CLR4_5_2dtkdtklwye7gjt.R.inc(17932);break;
        }

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17933);if ((((deviceSession == null || type != MSG_AR_LOCATION)&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17934)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17935)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17936);return null;
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17937);Position position = new Position();
        __CLR4_5_2dtkdtklwye7gjt.R.inc(17938);position.setProtocol(getProtocolName());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(17939);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17940);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17941);int mask = buf.readInt();

        __CLR4_5_2dtkdtklwye7gjt.R.inc(17942);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17943)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17944)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17945);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17946);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17947)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17948)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17949);int date = buf.readUnsignedByte();
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17950);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(BitUtil.between(date, 4, 8) + 2010, BitUtil.to(date, 4), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17951);position.setTime(dateBuilder.getDate());
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17952);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17953)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17954)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17955);buf.skipBytes(5); // device time
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17956);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17957)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17958)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17959);position.setLatitude(buf.readUnsignedInt() * 0.000001 - 90);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17960);position.setLongitude(buf.readUnsignedInt() * 0.000001 - 180.0);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17961);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17962)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17963)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17964);int status = buf.readUnsignedByte();
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17965);position.setValid(BitUtil.between(status, 4, 8) != 0);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17966);position.set(Position.KEY_SATELLITES, BitUtil.to(status, 4));
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17967);position.set(Position.KEY_HDOP, buf.readUnsignedByte() * 0.1);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17968);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17969)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17970)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17971);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17972);if ((((BitUtil.check(mask, 6))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17973)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17974)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17975);position.setCourse(buf.readUnsignedShort());
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17976);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17977)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17978)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17979);position.setAltitude(buf.readShort());
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17980);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17981)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17982)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17983);position.set(Position.KEY_RSSI, buf.readUnsignedByte());
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17984);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17985)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17986)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17987);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17988);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17989)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17990)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17991);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17992);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17993)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17994)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17995);buf.skipBytes(2); // gpio
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(17996);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(17997)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(17998)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(17999);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt() * 1000);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18000);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18001)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18002)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18003);buf.skipBytes(6); // software version
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18004);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18005)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18006)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18007);buf.skipBytes(5); // hardware version
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18008);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18009)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18010)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18011);buf.readUnsignedShort(); // device config
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18012);return position;
    }finally{__CLR4_5_2dtkdtklwye7gjt.R.flushNeeded();}}

    private double convertCoordinate(long value) {try{__CLR4_5_2dtkdtklwye7gjt.R.inc(18013);
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18014);boolean negative = value < 0;
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18015);value = Math.abs(value);
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18016);double minutes = (value % 100000) * 0.001;
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18017);value /= 100000;
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18018);double degrees = value + minutes / 60;
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18019);return (((negative )&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18020)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18021)==0&false))? -degrees : degrees;
    }finally{__CLR4_5_2dtkdtklwye7gjt.R.flushNeeded();}}

    private Position decodeMgMessage(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2dtkdtklwye7gjt.R.inc(18022);

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18023);buf.readUnsignedByte(); // tag
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18024);int flags = buf.getUnsignedByte(buf.readerIndex());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18025);DeviceSession deviceSession;
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18026);if ((((BitUtil.check(flags, 6))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18027)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18028)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18029);buf.readUnsignedByte(); // flags
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18030);deviceSession = getDeviceSession(channel, remoteAddress);
        } }else {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18031);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18032);deviceSession = getDeviceSession(channel, remoteAddress, imei);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18033);if ((((deviceSession == null)&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18034)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18035)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18036);return null;
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18037);Position position = new Position();
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18038);position.setProtocol(getProtocolName());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18039);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18040);buf.skipBytes(8); // imsi

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18041);int date = buf.readUnsignedShort();

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18042);DateBuilder dateBuilder = new DateBuilder()
                .setDate(2010 + BitUtil.from(date, 12), BitUtil.between(date, 8, 12), BitUtil.to(date, 8))
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), 0);

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18043);position.setValid(true);
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18044);position.setLatitude(convertCoordinate(buf.readInt()));
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18045);position.setLongitude(convertCoordinate(buf.readInt()));

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18046);position.setAltitude(UnitsConverter.metersFromFeet(buf.readShort()));
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18047);position.setCourse(buf.readUnsignedShort());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18048);position.setSpeed(UnitsConverter.knotsFromMph(buf.readUnsignedByte()));

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18049);position.set(Position.KEY_POWER, buf.readUnsignedByte() * 0.1);
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18050);position.set(Position.PREFIX_IO + 1, buf.readUnsignedByte());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18051);dateBuilder.setSecond(buf.readUnsignedByte());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18052);position.setTime(dateBuilder.getDate());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18053);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18054);int index = buf.readUnsignedByte();

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18055);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18056);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_2dtkdtklwye7gjt.R.inc(18057);position.set(Position.KEY_ODOMETER, (long) (buf.readUnsignedInt() * 1609.34));

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18058);if ((((channel != null && BitUtil.check(flags, 7))&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18059)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18060)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18061);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18062);response.writeByte(MSG_ACKNOWLEDGEMENT);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18063);response.writeByte(index);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18064);response.writeByte(0x00);
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18065);channel.write(response, remoteAddress);
        }

        }__CLR4_5_2dtkdtklwye7gjt.R.inc(18066);return position;
    }finally{__CLR4_5_2dtkdtklwye7gjt.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dtkdtklwye7gjt.R.inc(18067);

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18068);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dtkdtklwye7gjt.R.inc(18069);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0x7e)&&(__CLR4_5_2dtkdtklwye7gjt.R.iget(18070)!=0|true))||(__CLR4_5_2dtkdtklwye7gjt.R.iget(18071)==0&false))) {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18072);return decodeArMessage(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dtkdtklwye7gjt.R.inc(18073);return decodeMgMessage(channel, remoteAddress, buf);
        }
    }}finally{__CLR4_5_2dtkdtklwye7gjt.R.flushNeeded();}}

}
