/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton@traccar.org)
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
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class NavisProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2bmdbmdlx1dzbj0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,15255,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String prefix;
    private long deviceUniqueId, serverId;

    public NavisProtocolDecoder(NavisProtocol protocol) {
        super(protocol);__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15062);try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15061);
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    public static final int F10 = 0x01;
    public static final int F20 = 0x02;
    public static final int F30 = 0x03;
    public static final int F40 = 0x04;
    public static final int F50 = 0x05;
    public static final int F51 = 0x15;
    public static final int F52 = 0x25;

    private static boolean isFormat(int type, int... types) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15063);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15064);for (int i : types) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15065);if ((((type == i)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15066)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15067)==0&false))) {{
                __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15068);return true;
            }
        }}
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15069);return false;
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private static final class ParseResult {
        private final long id;
        private final Position position;

        private ParseResult(long id, Position position) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15070);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15071);this.id = id;
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15072);this.position = position;
        }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

        public long getId() {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15073);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15074);return id;
        }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

        public Position getPosition() {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15075);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15076);return position;
        }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}
    }

    private ParseResult parsePosition(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15077);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15078);Position position = new Position();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15079);position.setProtocol(getProtocolName());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15080);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15081);int format;
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15082);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15083)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15084)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15085);format = buf.readUnsignedShort();
        } }else {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15086);format = buf.readUnsignedByte();
        }
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15087);position.set("format", format);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15088);long index = buf.readUnsignedInt();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15089);position.set(Position.KEY_INDEX, index);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15090);position.set(Position.KEY_EVENT, buf.readUnsignedShort());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15091);buf.skipBytes(6); // event time

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15092);short armedStatus = buf.readUnsignedByte();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15093);position.set(Position.KEY_ARMED, armedStatus & 0x7F);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15094);if ((((BitUtil.check(armedStatus, 7))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15095)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15096)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15097);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15098);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15099);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15100);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15101)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15102)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15103);position.set(Position.KEY_OUTPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15104);if ((((isFormat(format, F40, F50, F51, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15105)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15106)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15107);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15108);if ((((isFormat(format, F10, F20, F30, F40))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15109)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15110)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15111);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15112);if ((((isFormat(format, F50, F51, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15113)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15114)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15115);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15116);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15117);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15118);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15119)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15120)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15121);position.set(Position.PREFIX_TEMP + 1, buf.readShort());
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15122);if ((((isFormat(format, F10, F20, F50, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15123)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15124)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15125);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15126);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        // Impulse counters
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15127);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15128)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15129)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15130);buf.readUnsignedInt();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15131);buf.readUnsignedInt();
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15132);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15133)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15134)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15135);int locationStatus = buf.readUnsignedByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15136);position.setValid(BitUtil.check(locationStatus, 1));

            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15137);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte() + 1, buf.readUnsignedByte());
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15138);position.setTime(dateBuilder.getDate());

            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15139);position.setLatitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15140);position.setLongitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15141);position.setSpeed(UnitsConverter.knotsFromKph(buf.readFloat()));
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15142);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15143);position.set(Position.KEY_ODOMETER, buf.readFloat() * 1000);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15144);position.set(Position.KEY_DISTANCE, buf.readFloat());

            // Segment times
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15145);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15146);buf.readUnsignedShort();
        }

        // Other
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15147);if ((((isFormat(format, F51, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15148)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15149)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15150);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15151);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15152);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15153);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15154);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15155);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15156);buf.readUnsignedShort();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15157);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15158);buf.readUnsignedShort();
        }

        // Four temperature sensors
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15159);if ((((isFormat(format, F40, F52))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15160)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15161)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15162);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15163);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15164);buf.readByte();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15165);buf.readByte();
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15166);return new ParseResult(index, position);
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private Object processSingle(DeviceSession deviceSession, Channel channel, ChannelBuffer buf) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15167);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15168);ParseResult result = parsePosition(deviceSession, buf);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15169);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15170);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<T", StandardCharsets.US_ASCII));
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15171);response.writeInt((int) result.getId());
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15172);sendReply(channel, response);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15173);if ((((result.getPosition().getFixTime() == null)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15174)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15175)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15176);return null;
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15177);return result.getPosition();
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private Object processArray(DeviceSession deviceSession, Channel channel, ChannelBuffer buf) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15178);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15179);List<Position> positions = new LinkedList<>();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15180);int count = buf.readUnsignedByte();

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15181);for (int i = 0; (((i < count)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15182)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15183)==0&false)); i++) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15184);Position position = parsePosition(deviceSession, buf).getPosition();
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15185);if ((((position.getFixTime() != null)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15186)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15187)==0&false))) {{
                __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15188);positions.add(position);
            }
        }}

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15189);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15190);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<A", StandardCharsets.US_ASCII));
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15191);response.writeByte(count);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15192);sendReply(channel, response);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15193);if ((((positions.isEmpty())&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15194)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15195)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15196);return null;
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15197);return positions;
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private Object processHandshake(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15198);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15199);buf.readByte(); // semicolon symbol
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15200);if ((((getDeviceSession(channel, remoteAddress, buf.toString(StandardCharsets.US_ASCII)) != null)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15201)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15202)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15203);sendReply(channel, ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<S", StandardCharsets.US_ASCII));
        }
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15204);return null;
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private static short checksum(ChannelBuffer buf) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15205);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15206);short sum = 0;
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15207);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15208)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15209)==0&false)); i++) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15210);sum ^= buf.getUnsignedByte(i);
        }
        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15211);return sum;
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    private void sendReply(Channel channel, ChannelBuffer data) {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15212);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15213);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 16);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15214);header.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, prefix, StandardCharsets.US_ASCII));
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15215);header.writeInt((int) deviceUniqueId);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15216);header.writeInt((int) serverId);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15217);header.writeShort(data.readableBytes());
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15218);header.writeByte(checksum(data));
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15219);header.writeByte(checksum(header));

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15220);if ((((channel != null)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15221)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15222)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15223);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15224);

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15225);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15226);prefix = buf.toString(buf.readerIndex(), 4, StandardCharsets.US_ASCII);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15227);buf.skipBytes(prefix.length()); // prefix @NTC by default
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15228);serverId = buf.readUnsignedInt();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15229);deviceUniqueId = buf.readUnsignedInt();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15230);int length = buf.readUnsignedShort();
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15231);buf.skipBytes(2); // header and data XOR checksum

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15232);if ((((length == 0)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15233)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15234)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15235);return null; // keep alive message
        }

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15236);String type = buf.toString(buf.readerIndex(), 3, StandardCharsets.US_ASCII);
        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15237);buf.skipBytes(type.length());

        __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15238);if ((((type.equals("*>S"))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15239)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15240)==0&false))) {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15241);return processHandshake(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15242);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15243);if ((((deviceSession != null)&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15244)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15245)==0&false))) {{
                __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15246);if ((((type.equals("*>T"))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15247)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15248)==0&false))) {{
                    __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15249);return processSingle(deviceSession, channel, buf);
                } }else {__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15250);if ((((type.equals("*>A"))&&(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15251)!=0|true))||(__CLR4_5_2bmdbmdlx1dzbj0.R.iget(15252)==0&false))) {{
                    __CLR4_5_2bmdbmdlx1dzbj0.R.inc(15253);return processArray(deviceSession, channel, buf);
                }
            }}}
        }}

        }__CLR4_5_2bmdbmdlx1dzbj0.R.inc(15254);return null;
    }finally{__CLR4_5_2bmdbmdlx1dzbj0.R.flushNeeded();}}

}
