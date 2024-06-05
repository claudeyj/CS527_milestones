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
import org.traccar.DeviceSession;
import org.traccar.helper.BcdUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28zc8zclwye64i4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,11698,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GatorProtocolDecoder(GatorProtocol protocol) {
        super(protocol);__CLR4_5_28zc8zclwye64i4.R.inc(11641);try{__CLR4_5_28zc8zclwye64i4.R.inc(11640);
    }finally{__CLR4_5_28zc8zclwye64i4.R.flushNeeded();}}

    public static final int MSG_HEARTBEAT = 0x21;
    public static final int MSG_POSITION_DATA = 0x80;
    public static final int MSG_ROLLCALL_RESPONSE = 0x81;
    public static final int MSG_ALARM_DATA = 0x82;
    public static final int MSG_TERMINAL_STATUS = 0x83;
    public static final int MSG_MESSAGE = 0x84;
    public static final int MSG_TERMINAL_ANSWER = 0x85;
    public static final int MSG_BLIND_AREA = 0x8E;
    public static final int MSG_PICTURE_FRAME = 0x54;
    public static final int MSG_CAMERA_RESPONSE = 0x56;
    public static final int MSG_PICTURE_DATA = 0x57;

    public static String decodeId(int b1, int b2, int b3, int b4) {try{__CLR4_5_28zc8zclwye64i4.R.inc(11642);

        __CLR4_5_28zc8zclwye64i4.R.inc(11643);int d1 = 30 + ((b1 >> 7) << 3) + ((b2 >> 7) << 2) + ((b3 >> 7) << 1) + (b4 >> 7);
        __CLR4_5_28zc8zclwye64i4.R.inc(11644);int d2 = b1 & 0x7f;
        __CLR4_5_28zc8zclwye64i4.R.inc(11645);int d3 = b2 & 0x7f;
        __CLR4_5_28zc8zclwye64i4.R.inc(11646);int d4 = b3 & 0x7f;
        __CLR4_5_28zc8zclwye64i4.R.inc(11647);int d5 = b4 & 0x7f;

        __CLR4_5_28zc8zclwye64i4.R.inc(11648);return String.format("%02d%02d%02d%02d%02d", d1, d2, d3, d4, d5);
    }finally{__CLR4_5_28zc8zclwye64i4.R.flushNeeded();}}

    private void sendResponse(Channel channel, byte calibration) {try{__CLR4_5_28zc8zclwye64i4.R.inc(11649);
        __CLR4_5_28zc8zclwye64i4.R.inc(11650);if ((((channel != null)&&(__CLR4_5_28zc8zclwye64i4.R.iget(11651)!=0|true))||(__CLR4_5_28zc8zclwye64i4.R.iget(11652)==0&false))) {{
            __CLR4_5_28zc8zclwye64i4.R.inc(11653);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_28zc8zclwye64i4.R.inc(11654);response.writeByte(0x24); __CLR4_5_28zc8zclwye64i4.R.inc(11655);response.writeByte(0x24); // header
            __CLR4_5_28zc8zclwye64i4.R.inc(11656);response.writeByte(MSG_HEARTBEAT); // size
            __CLR4_5_28zc8zclwye64i4.R.inc(11657);response.writeShort(5);
            __CLR4_5_28zc8zclwye64i4.R.inc(11658);response.writeByte(calibration);
            __CLR4_5_28zc8zclwye64i4.R.inc(11659);response.writeByte(0); // main order
            __CLR4_5_28zc8zclwye64i4.R.inc(11660);response.writeByte(0); // slave order
            __CLR4_5_28zc8zclwye64i4.R.inc(11661);response.writeByte(1); // calibration
            __CLR4_5_28zc8zclwye64i4.R.inc(11662);response.writeByte(0x0D);
            __CLR4_5_28zc8zclwye64i4.R.inc(11663);channel.write(response);
        }
    }}finally{__CLR4_5_28zc8zclwye64i4.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28zc8zclwye64i4.R.inc(11664);

        __CLR4_5_28zc8zclwye64i4.R.inc(11665);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28zc8zclwye64i4.R.inc(11666);buf.skipBytes(2); // header
        __CLR4_5_28zc8zclwye64i4.R.inc(11667);int type = buf.readUnsignedByte();
        __CLR4_5_28zc8zclwye64i4.R.inc(11668);buf.readUnsignedShort(); // length

        __CLR4_5_28zc8zclwye64i4.R.inc(11669);String id = decodeId(
                buf.readUnsignedByte(), buf.readUnsignedByte(),
                buf.readUnsignedByte(), buf.readUnsignedByte());

        __CLR4_5_28zc8zclwye64i4.R.inc(11670);sendResponse(channel, buf.getByte(buf.writerIndex() - 2));

        __CLR4_5_28zc8zclwye64i4.R.inc(11671);if ((((type == MSG_POSITION_DATA || type == MSG_ROLLCALL_RESPONSE
                || type == MSG_ALARM_DATA || type == MSG_BLIND_AREA)&&(__CLR4_5_28zc8zclwye64i4.R.iget(11672)!=0|true))||(__CLR4_5_28zc8zclwye64i4.R.iget(11673)==0&false))) {{

            __CLR4_5_28zc8zclwye64i4.R.inc(11674);Position position = new Position();
            __CLR4_5_28zc8zclwye64i4.R.inc(11675);position.setProtocol(getProtocolName());

            __CLR4_5_28zc8zclwye64i4.R.inc(11676);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, "1" + id, id);
            __CLR4_5_28zc8zclwye64i4.R.inc(11677);if ((((deviceSession == null)&&(__CLR4_5_28zc8zclwye64i4.R.iget(11678)!=0|true))||(__CLR4_5_28zc8zclwye64i4.R.iget(11679)==0&false))) {{
                __CLR4_5_28zc8zclwye64i4.R.inc(11680);return null;
            }
            }__CLR4_5_28zc8zclwye64i4.R.inc(11681);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_28zc8zclwye64i4.R.inc(11682);DateBuilder dateBuilder = new DateBuilder()
                    .setYear(BcdUtil.readInteger(buf, 2))
                    .setMonth(BcdUtil.readInteger(buf, 2))
                    .setDay(BcdUtil.readInteger(buf, 2))
                    .setHour(BcdUtil.readInteger(buf, 2))
                    .setMinute(BcdUtil.readInteger(buf, 2))
                    .setSecond(BcdUtil.readInteger(buf, 2));
            __CLR4_5_28zc8zclwye64i4.R.inc(11683);position.setTime(dateBuilder.getDate());

            __CLR4_5_28zc8zclwye64i4.R.inc(11684);position.setLatitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_28zc8zclwye64i4.R.inc(11685);position.setLongitude(BcdUtil.readCoordinate(buf));
            __CLR4_5_28zc8zclwye64i4.R.inc(11686);position.setSpeed(UnitsConverter.knotsFromKph(BcdUtil.readInteger(buf, 4)));
            __CLR4_5_28zc8zclwye64i4.R.inc(11687);position.setCourse(BcdUtil.readInteger(buf, 4));

            __CLR4_5_28zc8zclwye64i4.R.inc(11688);int flags = buf.readUnsignedByte();
            __CLR4_5_28zc8zclwye64i4.R.inc(11689);position.setValid((flags & 0x80) != 0);
            __CLR4_5_28zc8zclwye64i4.R.inc(11690);position.set(Position.KEY_SATELLITES, flags & 0x0f);

            __CLR4_5_28zc8zclwye64i4.R.inc(11691);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
            __CLR4_5_28zc8zclwye64i4.R.inc(11692);position.set("key", buf.readUnsignedByte());
            __CLR4_5_28zc8zclwye64i4.R.inc(11693);position.set("oil", buf.readUnsignedShort() / 10.0);
            __CLR4_5_28zc8zclwye64i4.R.inc(11694);position.set(Position.KEY_POWER, buf.readUnsignedByte() + buf.readUnsignedByte() * 0.01);
            __CLR4_5_28zc8zclwye64i4.R.inc(11695);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());

            __CLR4_5_28zc8zclwye64i4.R.inc(11696);return position;
        }

        }__CLR4_5_28zc8zclwye64i4.R.inc(11697);return null;
    }finally{__CLR4_5_28zc8zclwye64i4.R.flushNeeded();}}

}
