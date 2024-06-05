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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class ObdDongleProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2by9by9lx1e1lk6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,15555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public ObdDongleProtocolDecoder(ObdDongleProtocol protocol) {
        super(protocol);__CLR4_5_2by9by9lx1e1lk6.R.inc(15490);try{__CLR4_5_2by9by9lx1e1lk6.R.inc(15489);
    }finally{__CLR4_5_2by9by9lx1e1lk6.R.flushNeeded();}}

    public static final int MSG_TYPE_CONNECT = 0x01;
    public static final int MSG_TYPE_CONNACK = 0x02;
    public static final int MSG_TYPE_PUBLISH = 0x03;
    public static final int MSG_TYPE_PUBACK = 0x04;
    public static final int MSG_TYPE_PINGREQ = 0x0C;
    public static final int MSG_TYPE_PINGRESP = 0x0D;
    public static final int MSG_TYPE_DISCONNECT = 0x0E;

    private static void sendResponse(Channel channel, int type, int index, String imei, ChannelBuffer content) {try{__CLR4_5_2by9by9lx1e1lk6.R.inc(15491);
        __CLR4_5_2by9by9lx1e1lk6.R.inc(15492);if ((((channel != null)&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15493)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15494)==0&false))) {{
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15495);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15496);response.writeShort(0x5555); // header
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15497);response.writeShort(index);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15498);response.writeBytes(imei.getBytes(StandardCharsets.US_ASCII));
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15499);response.writeByte(type);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15500);response.writeShort(content.readableBytes());
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15501);response.writeBytes(content);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15502);response.writeByte(0); // checksum
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15503);response.writeShort(0xAAAA);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15504);channel.write(response);
        }
    }}finally{__CLR4_5_2by9by9lx1e1lk6.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2by9by9lx1e1lk6.R.inc(15505);

        __CLR4_5_2by9by9lx1e1lk6.R.inc(15506);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2by9by9lx1e1lk6.R.inc(15507);buf.skipBytes(2); // header
        __CLR4_5_2by9by9lx1e1lk6.R.inc(15508);int index = buf.readUnsignedShort();

        __CLR4_5_2by9by9lx1e1lk6.R.inc(15509);String imei = buf.readBytes(15).toString(StandardCharsets.US_ASCII);
        __CLR4_5_2by9by9lx1e1lk6.R.inc(15510);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_2by9by9lx1e1lk6.R.inc(15511);if ((((deviceSession == null)&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15512)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15513)==0&false))) {{
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15514);return null;
        }

        }__CLR4_5_2by9by9lx1e1lk6.R.inc(15515);int type = buf.readUnsignedByte();

        __CLR4_5_2by9by9lx1e1lk6.R.inc(15516);buf.readUnsignedShort(); // data length

        __CLR4_5_2by9by9lx1e1lk6.R.inc(15517);if ((((type == MSG_TYPE_CONNECT)&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15518)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15519)==0&false))) {{

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15520);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15521);response.writeByte(1);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15522);response.writeShort(0);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15523);response.writeInt(0);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15524);sendResponse(channel, MSG_TYPE_CONNACK, index, imei, response);

        } }else {__CLR4_5_2by9by9lx1e1lk6.R.inc(15525);if ((((type == MSG_TYPE_PUBLISH)&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15526)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15527)==0&false))) {{

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15528);int typeMajor = buf.readUnsignedByte();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15529);int typeMinor = buf.readUnsignedByte();

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15530);buf.readUnsignedByte(); // event id

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15531);Position position = new Position();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15532);position.setProtocol(getProtocolName());
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15533);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15534);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15535);int flags = buf.readUnsignedByte();

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15536);position.setValid(!BitUtil.check(flags, 6));

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15537);position.set(Position.KEY_SATELLITES, BitUtil.to(flags, 4));

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15538);double longitude = ((BitUtil.to(buf.readUnsignedShort(), 1) << 24) + buf.readUnsignedMedium()) * 0.00001;
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15539);position.setLongitude((((BitUtil.check(flags, 5) )&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15540)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15541)==0&false))? longitude : -longitude);

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15542);double latitude = buf.readUnsignedMedium() * 0.00001;
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15543);position.setLatitude((((BitUtil.check(flags, 4) )&&(__CLR4_5_2by9by9lx1e1lk6.R.iget(15544)!=0|true))||(__CLR4_5_2by9by9lx1e1lk6.R.iget(15545)==0&false))? latitude : -latitude);

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15546);int speedCourse = buf.readUnsignedMedium();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15547);position.setSpeed(UnitsConverter.knotsFromMph(BitUtil.from(speedCourse, 10) * 0.1));
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15548);position.setCourse(BitUtil.to(speedCourse, 10));

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15549);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15550);response.writeByte(typeMajor);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15551);response.writeByte(typeMinor);
            __CLR4_5_2by9by9lx1e1lk6.R.inc(15552);sendResponse(channel, MSG_TYPE_PUBACK, index, imei, response);

            __CLR4_5_2by9by9lx1e1lk6.R.inc(15553);return position;

        }

        }}__CLR4_5_2by9by9lx1e1lk6.R.inc(15554);return null;
    }finally{__CLR4_5_2by9by9lx1e1lk6.R.flushNeeded();}}

}
