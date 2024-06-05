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

public class NavisProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2dfpdfplwydwe9r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,17607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String prefix;
    private long deviceUniqueId, serverId;

    public NavisProtocolDecoder(NavisProtocol protocol) {
        super(protocol);__CLR4_5_2dfpdfplwydwe9r.R.inc(17414);try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17413);
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    public static final int F10 = 0x01;
    public static final int F20 = 0x02;
    public static final int F30 = 0x03;
    public static final int F40 = 0x04;
    public static final int F50 = 0x05;
    public static final int F51 = 0x15;
    public static final int F52 = 0x25;

    private static boolean isFormat(int type, int... types) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17415);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17416);for (int i : types) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17417);if ((((type == i)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17418)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17419)==0&false))) {{
                __CLR4_5_2dfpdfplwydwe9r.R.inc(17420);return true;
            }
        }}
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17421);return false;
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private static final class ParseResult {
        private final long id;
        private final Position position;

        private ParseResult(long id, Position position) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17422);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17423);this.id = id;
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17424);this.position = position;
        }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

        public long getId() {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17425);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17426);return id;
        }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

        public Position getPosition() {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17427);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17428);return position;
        }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}
    }

    private ParseResult parsePosition(DeviceSession deviceSession, ChannelBuffer buf) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17429);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17430);Position position = new Position();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17431);position.setProtocol(getProtocolName());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17432);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17433);int format;
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17434);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17435)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17436)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17437);format = buf.readUnsignedShort();
        } }else {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17438);format = buf.readUnsignedByte();
        }
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17439);position.set("format", format);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17440);long index = buf.readUnsignedInt();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17441);position.set(Position.KEY_INDEX, index);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17442);position.set(Position.KEY_EVENT, buf.readUnsignedShort());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17443);buf.skipBytes(6); // event time

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17444);short armedStatus = buf.readUnsignedByte();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17445);position.set(Position.KEY_ARMED, armedStatus & 0x7F);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17446);if ((((BitUtil.check(armedStatus, 7))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17447)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17448)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17449);position.set(Position.KEY_ALARM, Position.ALARM_GENERAL);
        }
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17450);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17451);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17452);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17453)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17454)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17455);position.set(Position.KEY_OUTPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_2dfpdfplwydwe9r.R.inc(17456);if ((((isFormat(format, F40, F50, F51, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17457)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17458)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17459);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_2dfpdfplwydwe9r.R.inc(17460);if ((((isFormat(format, F10, F20, F30, F40))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17461)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17462)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17463);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_2dfpdfplwydwe9r.R.inc(17464);if ((((isFormat(format, F50, F51, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17465)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17466)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17467);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_2dfpdfplwydwe9r.R.inc(17468);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17469);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17470);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17471)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17472)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17473);position.set(Position.PREFIX_TEMP + 1, buf.readShort());
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17474);if ((((isFormat(format, F10, F20, F50, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17475)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17476)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17477);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17478);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        // Impulse counters
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17479);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17480)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17481)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17482);buf.readUnsignedInt();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17483);buf.readUnsignedInt();
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17484);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17485)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17486)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17487);int locationStatus = buf.readUnsignedByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17488);position.setValid(BitUtil.check(locationStatus, 1));

            __CLR4_5_2dfpdfplwydwe9r.R.inc(17489);DateBuilder dateBuilder = new DateBuilder()
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte() + 1, buf.readUnsignedByte());
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17490);position.setTime(dateBuilder.getDate());

            __CLR4_5_2dfpdfplwydwe9r.R.inc(17491);position.setLatitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17492);position.setLongitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17493);position.setSpeed(UnitsConverter.knotsFromKph(buf.readFloat()));
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17494);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_2dfpdfplwydwe9r.R.inc(17495);position.set(Position.KEY_ODOMETER, buf.readFloat() * 1000);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17496);position.set(Position.KEY_DISTANCE, buf.readFloat());

            // Segment times
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17497);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17498);buf.readUnsignedShort();
        }

        // Other
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17499);if ((((isFormat(format, F51, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17500)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17501)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17502);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17503);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17504);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17505);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17506);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17507);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17508);buf.readUnsignedShort();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17509);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17510);buf.readUnsignedShort();
        }

        // Four temperature sensors
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17511);if ((((isFormat(format, F40, F52))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17512)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17513)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17514);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17515);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17516);buf.readByte();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17517);buf.readByte();
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17518);return new ParseResult(index, position);
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private Object processSingle(DeviceSession deviceSession, Channel channel, ChannelBuffer buf) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17519);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17520);ParseResult result = parsePosition(deviceSession, buf);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17521);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17522);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<T", StandardCharsets.US_ASCII));
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17523);response.writeInt((int) result.getId());
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17524);sendReply(channel, response);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17525);if ((((result.getPosition().getFixTime() == null)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17526)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17527)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17528);return null;
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17529);return result.getPosition();
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private Object processArray(DeviceSession deviceSession, Channel channel, ChannelBuffer buf) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17530);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17531);List<Position> positions = new LinkedList<>();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17532);int count = buf.readUnsignedByte();

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17533);for (int i = 0; (((i < count)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17534)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17535)==0&false)); i++) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17536);Position position = parsePosition(deviceSession, buf).getPosition();
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17537);if ((((position.getFixTime() != null)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17538)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17539)==0&false))) {{
                __CLR4_5_2dfpdfplwydwe9r.R.inc(17540);positions.add(position);
            }
        }}

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17541);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17542);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<A", StandardCharsets.US_ASCII));
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17543);response.writeByte(count);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17544);sendReply(channel, response);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17545);if ((((positions.isEmpty())&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17546)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17547)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17548);return null;
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17549);return positions;
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private Object processHandshake(Channel channel, SocketAddress remoteAddress, ChannelBuffer buf) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17550);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17551);buf.readByte(); // semicolon symbol
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17552);if ((((getDeviceSession(channel, remoteAddress, buf.toString(StandardCharsets.US_ASCII)) != null)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17553)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17554)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17555);sendReply(channel, ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<S", StandardCharsets.US_ASCII));
        }
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17556);return null;
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private static short checksum(ChannelBuffer buf) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17557);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17558);short sum = 0;
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17559);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17560)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17561)==0&false)); i++) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17562);sum ^= buf.getUnsignedByte(i);
        }
        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17563);return sum;
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    private void sendReply(Channel channel, ChannelBuffer data) {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17564);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17565);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 16);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17566);header.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, prefix, StandardCharsets.US_ASCII));
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17567);header.writeInt((int) deviceUniqueId);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17568);header.writeInt((int) serverId);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17569);header.writeShort(data.readableBytes());
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17570);header.writeByte(checksum(data));
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17571);header.writeByte(checksum(header));

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17572);if ((((channel != null)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17573)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17574)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17575);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2dfpdfplwydwe9r.R.inc(17576);

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17577);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17578);prefix = buf.toString(buf.readerIndex(), 4, StandardCharsets.US_ASCII);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17579);buf.skipBytes(prefix.length()); // prefix @NTC by default
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17580);serverId = buf.readUnsignedInt();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17581);deviceUniqueId = buf.readUnsignedInt();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17582);int length = buf.readUnsignedShort();
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17583);buf.skipBytes(2); // header and data XOR checksum

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17584);if ((((length == 0)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17585)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17586)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17587);return null; // keep alive message
        }

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17588);String type = buf.toString(buf.readerIndex(), 3, StandardCharsets.US_ASCII);
        __CLR4_5_2dfpdfplwydwe9r.R.inc(17589);buf.skipBytes(type.length());

        __CLR4_5_2dfpdfplwydwe9r.R.inc(17590);if ((((type.equals("*>S"))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17591)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17592)==0&false))) {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17593);return processHandshake(channel, remoteAddress, buf);
        } }else {{
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17594);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2dfpdfplwydwe9r.R.inc(17595);if ((((deviceSession != null)&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17596)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17597)==0&false))) {{
                __CLR4_5_2dfpdfplwydwe9r.R.inc(17598);if ((((type.equals("*>T"))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17599)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17600)==0&false))) {{
                    __CLR4_5_2dfpdfplwydwe9r.R.inc(17601);return processSingle(deviceSession, channel, buf);
                } }else {__CLR4_5_2dfpdfplwydwe9r.R.inc(17602);if ((((type.equals("*>A"))&&(__CLR4_5_2dfpdfplwydwe9r.R.iget(17603)!=0|true))||(__CLR4_5_2dfpdfplwydwe9r.R.iget(17604)==0&false))) {{
                    __CLR4_5_2dfpdfplwydwe9r.R.inc(17605);return processArray(deviceSession, channel, buf);
                }
            }}}
        }}

        }__CLR4_5_2dfpdfplwydwe9r.R.inc(17606);return null;
    }finally{__CLR4_5_2dfpdfplwydwe9r.R.flushNeeded();}}

}
