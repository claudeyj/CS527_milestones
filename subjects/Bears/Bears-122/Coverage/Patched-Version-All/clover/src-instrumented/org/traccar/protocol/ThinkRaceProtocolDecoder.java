/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class ThinkRaceProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2fzqfzqlwye7h3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384181338L,8589935092L,20787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public ThinkRaceProtocolDecoder(ThinkRaceProtocol protocol) {
        super(protocol);__CLR4_5_2fzqfzqlwye7h3q.R.inc(20727);try{__CLR4_5_2fzqfzqlwye7h3q.R.inc(20726);
    }finally{__CLR4_5_2fzqfzqlwye7h3q.R.flushNeeded();}}

    public static final int MSG_LOGIN = 0x80;
    public static final int MSG_GPS = 0x90;

    private static double convertCoordinate(long raw, boolean negative) {try{__CLR4_5_2fzqfzqlwye7h3q.R.inc(20728);
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20729);long degrees = raw / 1000000;
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20730);double minutes = (raw % 1000000) * 0.0001;
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20731);double result = degrees + minutes / 60;
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20732);if ((((negative)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20733)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20734)==0&false))) {{
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20735);result = -result;
        }
        }__CLR4_5_2fzqfzqlwye7h3q.R.inc(20736);return result;
    }finally{__CLR4_5_2fzqfzqlwye7h3q.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2fzqfzqlwye7h3q.R.inc(20737);

        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20738);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20739);buf.skipBytes(2); // header
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20740);ChannelBuffer id = buf.readBytes(12);
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20741);buf.readUnsignedByte(); // separator
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20742);int type = buf.readUnsignedByte();
        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20743);buf.readUnsignedShort(); // length

        __CLR4_5_2fzqfzqlwye7h3q.R.inc(20744);if ((((type == MSG_LOGIN)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20745)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20746)==0&false))) {{

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20747);int command = buf.readUnsignedByte(); // 0x00 - heartbeat

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20748);if ((((command == 0x01)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20749)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20750)==0&false))) {{
                __CLR4_5_2fzqfzqlwye7h3q.R.inc(20751);String imei = buf.toString(buf.readerIndex(), 15, StandardCharsets.US_ASCII);
                __CLR4_5_2fzqfzqlwye7h3q.R.inc(20752);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
                __CLR4_5_2fzqfzqlwye7h3q.R.inc(20753);if ((((deviceSession != null && channel != null)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20754)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20755)==0&false))) {{
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20756);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20757);response.writeByte(0x48); __CLR4_5_2fzqfzqlwye7h3q.R.inc(20758);response.writeByte(0x52); // header
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20759);response.writeBytes(id);
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20760);response.writeByte(0x2c); // separator
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20761);response.writeByte(type);
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20762);response.writeShort(0x0002); // length
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20763);response.writeShort(0x8000);
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20764);response.writeShort(0x0000); // checksum
                    __CLR4_5_2fzqfzqlwye7h3q.R.inc(20765);channel.write(response);
                }
            }}

        }} }else {__CLR4_5_2fzqfzqlwye7h3q.R.inc(20766);if ((((type == MSG_GPS)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20767)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20768)==0&false))) {{

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20769);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20770);if ((((deviceSession == null)&&(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20771)!=0|true))||(__CLR4_5_2fzqfzqlwye7h3q.R.iget(20772)==0&false))) {{
                __CLR4_5_2fzqfzqlwye7h3q.R.inc(20773);return null;
            }

            }__CLR4_5_2fzqfzqlwye7h3q.R.inc(20774);Position position = new Position();
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20775);position.setProtocol(getProtocolName());
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20776);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20777);position.setTime(new Date(buf.readUnsignedInt() * 1000));

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20778);int flags = buf.readUnsignedByte();

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20779);position.setValid(true);
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20780);position.setLatitude(convertCoordinate(buf.readUnsignedInt(), !BitUtil.check(flags, 0)));
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20781);position.setLongitude(convertCoordinate(buf.readUnsignedInt(), !BitUtil.check(flags, 1)));

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20782);position.setSpeed(buf.readUnsignedByte());
            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20783);position.setCourse(buf.readUnsignedByte());

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20784);position.setNetwork(new Network(
                    CellTower.fromLacCid(buf.readUnsignedShort(), buf.readUnsignedShort())));

            __CLR4_5_2fzqfzqlwye7h3q.R.inc(20785);return position;

        }

        }}__CLR4_5_2fzqfzqlwye7h3q.R.inc(20786);return null;
    }finally{__CLR4_5_2fzqfzqlwye7h3q.R.flushNeeded();}}

}
