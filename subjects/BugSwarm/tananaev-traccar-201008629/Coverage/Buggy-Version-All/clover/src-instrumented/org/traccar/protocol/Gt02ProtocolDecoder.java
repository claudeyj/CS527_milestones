/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

public class Gt02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_290f90flx1dxoj6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,11738,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gt02ProtocolDecoder(Gt02Protocol protocol) {
        super(protocol);__CLR4_5_290f90flx1dxoj6.R.inc(11680);try{__CLR4_5_290f90flx1dxoj6.R.inc(11679);
    }finally{__CLR4_5_290f90flx1dxoj6.R.flushNeeded();}}

    public static final int MSG_DATA = 0x10;
    public static final int MSG_HEARTBEAT = 0x1A;
    public static final int MSG_RESPONSE = 0x1C;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_290f90flx1dxoj6.R.inc(11681);

        __CLR4_5_290f90flx1dxoj6.R.inc(11682);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_290f90flx1dxoj6.R.inc(11683);buf.skipBytes(2); // header
        __CLR4_5_290f90flx1dxoj6.R.inc(11684);buf.readByte(); // size

        __CLR4_5_290f90flx1dxoj6.R.inc(11685);Position position = new Position();
        __CLR4_5_290f90flx1dxoj6.R.inc(11686);position.setProtocol(getProtocolName());

        // Zero for location messages
        __CLR4_5_290f90flx1dxoj6.R.inc(11687);int power = buf.readUnsignedByte();
        __CLR4_5_290f90flx1dxoj6.R.inc(11688);int gsm = buf.readUnsignedByte();

        __CLR4_5_290f90flx1dxoj6.R.inc(11689);String imei = ChannelBuffers.hexDump(buf.readBytes(8)).substring(1);
        __CLR4_5_290f90flx1dxoj6.R.inc(11690);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_290f90flx1dxoj6.R.inc(11691);if ((((deviceSession == null)&&(__CLR4_5_290f90flx1dxoj6.R.iget(11692)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11693)==0&false))) {{
            __CLR4_5_290f90flx1dxoj6.R.inc(11694);return null;
        }
        }__CLR4_5_290f90flx1dxoj6.R.inc(11695);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_290f90flx1dxoj6.R.inc(11696);position.set(Position.KEY_INDEX, buf.readUnsignedShort());

        __CLR4_5_290f90flx1dxoj6.R.inc(11697);int type = buf.readUnsignedByte();

        __CLR4_5_290f90flx1dxoj6.R.inc(11698);if ((((type == MSG_HEARTBEAT)&&(__CLR4_5_290f90flx1dxoj6.R.iget(11699)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11700)==0&false))) {{

            __CLR4_5_290f90flx1dxoj6.R.inc(11701);getLastLocation(position, null);

            __CLR4_5_290f90flx1dxoj6.R.inc(11702);position.set(Position.KEY_POWER, power);
            __CLR4_5_290f90flx1dxoj6.R.inc(11703);position.set(Position.KEY_RSSI, gsm);

            __CLR4_5_290f90flx1dxoj6.R.inc(11704);if ((((channel != null)&&(__CLR4_5_290f90flx1dxoj6.R.iget(11705)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11706)==0&false))) {{
                __CLR4_5_290f90flx1dxoj6.R.inc(11707);byte[] response = {0x54, 0x68, 0x1A, 0x0D, 0x0A};
                __CLR4_5_290f90flx1dxoj6.R.inc(11708);channel.write(ChannelBuffers.wrappedBuffer(response));
            }

        }} }else {__CLR4_5_290f90flx1dxoj6.R.inc(11709);if ((((type == MSG_DATA)&&(__CLR4_5_290f90flx1dxoj6.R.iget(11710)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11711)==0&false))) {{

            __CLR4_5_290f90flx1dxoj6.R.inc(11712);DateBuilder dateBuilder = new DateBuilder()
                    .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            __CLR4_5_290f90flx1dxoj6.R.inc(11713);position.setTime(dateBuilder.getDate());

            __CLR4_5_290f90flx1dxoj6.R.inc(11714);double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);
            __CLR4_5_290f90flx1dxoj6.R.inc(11715);double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            __CLR4_5_290f90flx1dxoj6.R.inc(11716);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_290f90flx1dxoj6.R.inc(11717);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_290f90flx1dxoj6.R.inc(11718);buf.skipBytes(3); // reserved

            __CLR4_5_290f90flx1dxoj6.R.inc(11719);long flags = buf.readUnsignedInt();
            __CLR4_5_290f90flx1dxoj6.R.inc(11720);position.setValid(BitUtil.check(flags, 0));
            __CLR4_5_290f90flx1dxoj6.R.inc(11721);if ((((!BitUtil.check(flags, 1))&&(__CLR4_5_290f90flx1dxoj6.R.iget(11722)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11723)==0&false))) {{
                __CLR4_5_290f90flx1dxoj6.R.inc(11724);latitude = -latitude;
            }
            }__CLR4_5_290f90flx1dxoj6.R.inc(11725);if ((((!BitUtil.check(flags, 2))&&(__CLR4_5_290f90flx1dxoj6.R.iget(11726)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11727)==0&false))) {{
                __CLR4_5_290f90flx1dxoj6.R.inc(11728);longitude = -longitude;
            }

            }__CLR4_5_290f90flx1dxoj6.R.inc(11729);position.setLatitude(latitude);
            __CLR4_5_290f90flx1dxoj6.R.inc(11730);position.setLongitude(longitude);

        } }else {__CLR4_5_290f90flx1dxoj6.R.inc(11731);if ((((type == MSG_RESPONSE)&&(__CLR4_5_290f90flx1dxoj6.R.iget(11732)!=0|true))||(__CLR4_5_290f90flx1dxoj6.R.iget(11733)==0&false))) {{

            __CLR4_5_290f90flx1dxoj6.R.inc(11734);getLastLocation(position, null);

            __CLR4_5_290f90flx1dxoj6.R.inc(11735);position.set(Position.KEY_RESULT,
                    buf.readBytes(buf.readUnsignedByte()).toString(StandardCharsets.US_ASCII));

        } }else {{

            __CLR4_5_290f90flx1dxoj6.R.inc(11736);return null;

        }

        }}}__CLR4_5_290f90flx1dxoj6.R.inc(11737);return position;
    }finally{__CLR4_5_290f90flx1dxoj6.R.flushNeeded();}}

}
