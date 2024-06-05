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

public class HuaShengProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29m09m0lx1dzb22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,12535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public HuaShengProtocolDecoder(HuaShengProtocol protocol) {
        super(protocol);__CLR4_5_29m09m0lx1dzb22.R.inc(12457);try{__CLR4_5_29m09m0lx1dzb22.R.inc(12456);
    }finally{__CLR4_5_29m09m0lx1dzb22.R.flushNeeded();}}

    public static final int MSG_POSITION = 0xAA00;
    public static final int MSG_POSITION_RSP = 0xFF01;
    public static final int MSG_LOGIN = 0xAA02;
    public static final int MSG_LOGIN_RSP = 0xFF03;

    private static void sendResponse(Channel channel, int type, int index, ChannelBuffer content) {try{__CLR4_5_29m09m0lx1dzb22.R.inc(12458);
        __CLR4_5_29m09m0lx1dzb22.R.inc(12459);if ((((channel != null)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12460)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12461)==0&false))) {{
            __CLR4_5_29m09m0lx1dzb22.R.inc(12462);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_29m09m0lx1dzb22.R.inc(12463);response.writeByte(0xC0);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12464);response.writeShort(0x0100);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12465);response.writeShort(12 + content.readableBytes());
            __CLR4_5_29m09m0lx1dzb22.R.inc(12466);response.writeShort(type);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12467);response.writeShort(0);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12468);response.writeInt(index);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12469);response.writeBytes(content);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12470);response.writeByte(0xC0);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12471);channel.write(response);
        }
    }}finally{__CLR4_5_29m09m0lx1dzb22.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29m09m0lx1dzb22.R.inc(12472);

        __CLR4_5_29m09m0lx1dzb22.R.inc(12473);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_29m09m0lx1dzb22.R.inc(12474);buf.skipBytes(1); // start marker
        __CLR4_5_29m09m0lx1dzb22.R.inc(12475);buf.readUnsignedByte(); // flag
        __CLR4_5_29m09m0lx1dzb22.R.inc(12476);buf.readUnsignedByte(); // reserved
        __CLR4_5_29m09m0lx1dzb22.R.inc(12477);buf.readUnsignedShort(); // length

        __CLR4_5_29m09m0lx1dzb22.R.inc(12478);int type = buf.readUnsignedShort();

        __CLR4_5_29m09m0lx1dzb22.R.inc(12479);buf.readUnsignedShort(); // checksum
        __CLR4_5_29m09m0lx1dzb22.R.inc(12480);int index = buf.readInt();

        __CLR4_5_29m09m0lx1dzb22.R.inc(12481);if ((((type == MSG_LOGIN)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12482)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12483)==0&false))) {{

            __CLR4_5_29m09m0lx1dzb22.R.inc(12484);while ((((buf.readableBytes() > 4)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12485)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12486)==0&false))) {{
                __CLR4_5_29m09m0lx1dzb22.R.inc(12487);int subtype = buf.readUnsignedShort();
                __CLR4_5_29m09m0lx1dzb22.R.inc(12488);int length = buf.readUnsignedShort() - 4;
                __CLR4_5_29m09m0lx1dzb22.R.inc(12489);if ((((subtype == 0x0003)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12490)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12491)==0&false))) {{
                    __CLR4_5_29m09m0lx1dzb22.R.inc(12492);String imei = buf.readBytes(length).toString(StandardCharsets.US_ASCII);
                    __CLR4_5_29m09m0lx1dzb22.R.inc(12493);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
                    __CLR4_5_29m09m0lx1dzb22.R.inc(12494);if ((((deviceSession != null && channel != null)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12495)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12496)==0&false))) {{
                        __CLR4_5_29m09m0lx1dzb22.R.inc(12497);ChannelBuffer content = ChannelBuffers.dynamicBuffer();
                        __CLR4_5_29m09m0lx1dzb22.R.inc(12498);content.writeByte(0); // success
                        __CLR4_5_29m09m0lx1dzb22.R.inc(12499);sendResponse(channel, MSG_LOGIN_RSP, index, content);
                    }
                }} }else {{
                    __CLR4_5_29m09m0lx1dzb22.R.inc(12500);buf.skipBytes(length);
                }
            }}

        }} }else {__CLR4_5_29m09m0lx1dzb22.R.inc(12501);if ((((type == MSG_POSITION)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12502)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12503)==0&false))) {{

            __CLR4_5_29m09m0lx1dzb22.R.inc(12504);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12505);if ((((deviceSession == null)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12506)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12507)==0&false))) {{
                __CLR4_5_29m09m0lx1dzb22.R.inc(12508);return null;
            }

            }__CLR4_5_29m09m0lx1dzb22.R.inc(12509);Position position = new Position();
            __CLR4_5_29m09m0lx1dzb22.R.inc(12510);position.setProtocol(getProtocolName());
            __CLR4_5_29m09m0lx1dzb22.R.inc(12511);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29m09m0lx1dzb22.R.inc(12512);int status = buf.readUnsignedShort();

            __CLR4_5_29m09m0lx1dzb22.R.inc(12513);position.setValid(BitUtil.check(status, 15));

            __CLR4_5_29m09m0lx1dzb22.R.inc(12514);position.set(Position.KEY_STATUS, status);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12515);position.set(Position.KEY_IGNITION, BitUtil.check(status, 14));
            __CLR4_5_29m09m0lx1dzb22.R.inc(12516);position.set(Position.KEY_EVENT, buf.readUnsignedShort());

            __CLR4_5_29m09m0lx1dzb22.R.inc(12517);String time = buf.readBytes(12).toString(StandardCharsets.US_ASCII);

            __CLR4_5_29m09m0lx1dzb22.R.inc(12518);DateBuilder dateBuilder = new DateBuilder()
                    .setYear(Integer.parseInt(time.substring(0, 2)))
                    .setMonth(Integer.parseInt(time.substring(2, 4)))
                    .setDay(Integer.parseInt(time.substring(4, 6)))
                    .setHour(Integer.parseInt(time.substring(6, 8)))
                    .setMinute(Integer.parseInt(time.substring(8, 10)))
                    .setSecond(Integer.parseInt(time.substring(10, 12)));
            __CLR4_5_29m09m0lx1dzb22.R.inc(12519);position.setTime(dateBuilder.getDate());

            __CLR4_5_29m09m0lx1dzb22.R.inc(12520);position.setLongitude(buf.readInt() * 0.00001);
            __CLR4_5_29m09m0lx1dzb22.R.inc(12521);position.setLatitude(buf.readInt() * 0.00001);

            __CLR4_5_29m09m0lx1dzb22.R.inc(12522);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));
            __CLR4_5_29m09m0lx1dzb22.R.inc(12523);position.setCourse(buf.readUnsignedShort());
            __CLR4_5_29m09m0lx1dzb22.R.inc(12524);position.setAltitude(buf.readUnsignedShort());

            __CLR4_5_29m09m0lx1dzb22.R.inc(12525);position.set(Position.KEY_ODOMETER, buf.readUnsignedShort() * 1000);

            __CLR4_5_29m09m0lx1dzb22.R.inc(12526);while ((((buf.readableBytes() > 4)&&(__CLR4_5_29m09m0lx1dzb22.R.iget(12527)!=0|true))||(__CLR4_5_29m09m0lx1dzb22.R.iget(12528)==0&false))) {{
                __CLR4_5_29m09m0lx1dzb22.R.inc(12529);buf.readUnsignedShort(); // subtype
                __CLR4_5_29m09m0lx1dzb22.R.inc(12530);int length = buf.readUnsignedShort() - 4;
                __CLR4_5_29m09m0lx1dzb22.R.inc(12531);buf.skipBytes(length);
            }

            }__CLR4_5_29m09m0lx1dzb22.R.inc(12532);sendResponse(channel, MSG_POSITION_RSP, index, ChannelBuffers.dynamicBuffer());

            __CLR4_5_29m09m0lx1dzb22.R.inc(12533);return position;

        }

        }}__CLR4_5_29m09m0lx1dzb22.R.inc(12534);return null;
    }finally{__CLR4_5_29m09m0lx1dzb22.R.flushNeeded();}}

}
