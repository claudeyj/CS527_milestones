/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Calendar; 
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class NavisProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_265k65klx1e80hz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,8170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String prefix;
    private long deviceUniqueId, serverId;

    private static final Charset charset = Charset.defaultCharset();

    public NavisProtocolDecoder(NavisProtocol protocol) {
        super(protocol);__CLR4_5_265k65klx1e80hz.R.inc(7977);try{__CLR4_5_265k65klx1e80hz.R.inc(7976);
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    // Format types
    public static final int F10 = 0x01;
    public static final int F20 = 0x02;
    public static final int F30 = 0x03;
    public static final int F40 = 0x04;
    public static final int F50 = 0x05;
    public static final int F51 = 0x15;
    public static final int F52 = 0x25;

    private static boolean isFormat(int type, int... types) {try{__CLR4_5_265k65klx1e80hz.R.inc(7978);
        __CLR4_5_265k65klx1e80hz.R.inc(7979);for (int i : types) {{
            __CLR4_5_265k65klx1e80hz.R.inc(7980);if ((((type == i)&&(__CLR4_5_265k65klx1e80hz.R.iget(7981)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(7982)==0&false))) {{
                __CLR4_5_265k65klx1e80hz.R.inc(7983);return true;
            }
        }}
        }__CLR4_5_265k65klx1e80hz.R.inc(7984);return false;
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}
    
    private class ParseResult {
        private final long id;
        private final Position position;

        public ParseResult(long id, Position position) {try{__CLR4_5_265k65klx1e80hz.R.inc(7985);
            __CLR4_5_265k65klx1e80hz.R.inc(7986);this.id = id;
            __CLR4_5_265k65klx1e80hz.R.inc(7987);this.position = position;
        }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

        public long getId() {try{__CLR4_5_265k65klx1e80hz.R.inc(7988);
            __CLR4_5_265k65klx1e80hz.R.inc(7989);return id;
        }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

        public Position getPosition() {try{__CLR4_5_265k65klx1e80hz.R.inc(7990);
            __CLR4_5_265k65klx1e80hz.R.inc(7991);return position;
        }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}
    }

    private ParseResult parsePosition(ChannelBuffer buf) {try{__CLR4_5_265k65klx1e80hz.R.inc(7992);
        __CLR4_5_265k65klx1e80hz.R.inc(7993);Position position = new Position();
        __CLR4_5_265k65klx1e80hz.R.inc(7994);position.setProtocol(getProtocolName());

        __CLR4_5_265k65klx1e80hz.R.inc(7995);position.setDeviceId(getDeviceId());

        // Format type
        __CLR4_5_265k65klx1e80hz.R.inc(7996);int format;
        __CLR4_5_265k65klx1e80hz.R.inc(7997);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_265k65klx1e80hz.R.iget(7998)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(7999)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8000);format = buf.readUnsignedShort();
        } }else {{
            __CLR4_5_265k65klx1e80hz.R.inc(8001);format = buf.readUnsignedByte();
        }
        }__CLR4_5_265k65klx1e80hz.R.inc(8002);position.set("format", format);

        __CLR4_5_265k65klx1e80hz.R.inc(8003);long index = buf.readUnsignedInt();
        __CLR4_5_265k65klx1e80hz.R.inc(8004);position.set(Event.KEY_INDEX, index);

        // Event type
        __CLR4_5_265k65klx1e80hz.R.inc(8005);position.set(Event.KEY_EVENT, buf.readUnsignedShort());

        // Event time
        __CLR4_5_265k65klx1e80hz.R.inc(8006);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_265k65klx1e80hz.R.inc(8007);time.clear();
        __CLR4_5_265k65klx1e80hz.R.inc(8008);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8009);time.set(Calendar.MINUTE, buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8010);time.set(Calendar.SECOND, buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8011);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8012);time.set(Calendar.MONTH, buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8013);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
        __CLR4_5_265k65klx1e80hz.R.inc(8014);position.set("time", time.getTimeInMillis());

        // Alarm status
        __CLR4_5_265k65klx1e80hz.R.inc(8015);position.set(Event.KEY_ALARM, buf.readUnsignedByte());

        // Modules status
        __CLR4_5_265k65klx1e80hz.R.inc(8016);position.set(Event.KEY_STATUS, buf.readUnsignedByte());

        // GSM signal
        __CLR4_5_265k65klx1e80hz.R.inc(8017);position.set(Event.KEY_GSM, buf.readUnsignedByte());

        // Output
        __CLR4_5_265k65klx1e80hz.R.inc(8018);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_265k65klx1e80hz.R.iget(8019)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8020)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8021);position.set(Event.KEY_OUTPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_265k65klx1e80hz.R.inc(8022);if ((((isFormat(format, F40, F50, F51, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8023)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8024)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8025);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
        }

        // Input
        }}__CLR4_5_265k65klx1e80hz.R.inc(8026);if ((((isFormat(format, F10, F20, F30, F40))&&(__CLR4_5_265k65klx1e80hz.R.iget(8027)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8028)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8029);position.set(Event.KEY_INPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_265k65klx1e80hz.R.inc(8030);if ((((isFormat(format, F50, F51, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8031)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8032)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8033);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_265k65klx1e80hz.R.inc(8034);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);

        // Battery power
        __CLR4_5_265k65klx1e80hz.R.inc(8035);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());

        // Temperature
        __CLR4_5_265k65klx1e80hz.R.inc(8036);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_265k65klx1e80hz.R.iget(8037)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8038)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8039);position.set(Event.PREFIX_TEMP + 1, buf.readShort());
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8040);if ((((isFormat(format, F10, F20, F50, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8041)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8042)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8043);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_265k65klx1e80hz.R.inc(8044);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8045);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8046)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8047)==0&false))) {{
            // Impulse counters
            __CLR4_5_265k65klx1e80hz.R.inc(8048);buf.readUnsignedInt();
            __CLR4_5_265k65klx1e80hz.R.inc(8049);buf.readUnsignedInt();
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8050);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8051)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8052)==0&false))) {{
            // Validity
            __CLR4_5_265k65klx1e80hz.R.inc(8053);int locationStatus = buf.readUnsignedByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8054);position.setValid((locationStatus & 0x02) == 0x02);

            // Location time
            __CLR4_5_265k65klx1e80hz.R.inc(8055);time.clear();
            __CLR4_5_265k65klx1e80hz.R.inc(8056);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8057);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8058);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8059);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8060);time.set(Calendar.MONTH, buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8061);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_265k65klx1e80hz.R.inc(8062);position.setTime(time.getTime());

            // Location data
            __CLR4_5_265k65klx1e80hz.R.inc(8063);position.setLatitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_265k65klx1e80hz.R.inc(8064);position.setLongitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_265k65klx1e80hz.R.inc(8065);position.setSpeed(buf.readFloat());
            __CLR4_5_265k65klx1e80hz.R.inc(8066);position.setCourse(buf.readUnsignedShort());

            // Odometer
            __CLR4_5_265k65klx1e80hz.R.inc(8067);position.set(Event.KEY_ODOMETER, buf.readFloat());

            // Last segment
            __CLR4_5_265k65klx1e80hz.R.inc(8068);position.set("segment", buf.readFloat());

            // Segment times
            __CLR4_5_265k65klx1e80hz.R.inc(8069);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8070);buf.readUnsignedShort();
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8071);if ((((isFormat(format, F51, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8072)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8073)==0&false))) {{
            // Other stuff
            __CLR4_5_265k65klx1e80hz.R.inc(8074);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8075);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8076);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8077);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8078);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8079);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8080);buf.readUnsignedShort();
            __CLR4_5_265k65klx1e80hz.R.inc(8081);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8082);buf.readUnsignedShort();
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8083);if ((((isFormat(format, F40, F52))&&(__CLR4_5_265k65klx1e80hz.R.iget(8084)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8085)==0&false))) {{
            // Four temperature sensors
            __CLR4_5_265k65klx1e80hz.R.inc(8086);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8087);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8088);buf.readByte();
            __CLR4_5_265k65klx1e80hz.R.inc(8089);buf.readByte();
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8090);return new ParseResult(index, position);
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    private Object processSingle(Channel channel, ChannelBuffer buf) {try{__CLR4_5_265k65klx1e80hz.R.inc(8091);
        __CLR4_5_265k65klx1e80hz.R.inc(8092);ParseResult result = parsePosition(buf);

        __CLR4_5_265k65klx1e80hz.R.inc(8093);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_265k65klx1e80hz.R.inc(8094);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<T", charset));
        __CLR4_5_265k65klx1e80hz.R.inc(8095);response.writeInt((int) result.getId());
        __CLR4_5_265k65klx1e80hz.R.inc(8096);sendReply(channel, response);

        // No location data
        __CLR4_5_265k65klx1e80hz.R.inc(8097);if ((((result.getPosition().getFixTime() == null)&&(__CLR4_5_265k65klx1e80hz.R.iget(8098)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8099)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8100);return null;
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8101);return result.getPosition();
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    private Object processArray(Channel channel, ChannelBuffer buf) {try{__CLR4_5_265k65klx1e80hz.R.inc(8102);
        __CLR4_5_265k65klx1e80hz.R.inc(8103);List<Position> positions = new LinkedList<>();
        __CLR4_5_265k65klx1e80hz.R.inc(8104);int count = buf.readUnsignedByte();

        __CLR4_5_265k65klx1e80hz.R.inc(8105);for (int i = 0; (((i < count)&&(__CLR4_5_265k65klx1e80hz.R.iget(8106)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8107)==0&false)); i++) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8108);Position position = parsePosition(buf).getPosition();
            __CLR4_5_265k65klx1e80hz.R.inc(8109);if ((((position.getFixTime() != null)&&(__CLR4_5_265k65klx1e80hz.R.iget(8110)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8111)==0&false))) {{
                __CLR4_5_265k65klx1e80hz.R.inc(8112);positions.add(position);
            }
        }}

        }__CLR4_5_265k65klx1e80hz.R.inc(8113);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_265k65klx1e80hz.R.inc(8114);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<A", charset));
        __CLR4_5_265k65klx1e80hz.R.inc(8115);response.writeByte(count);
        __CLR4_5_265k65klx1e80hz.R.inc(8116);sendReply(channel, response);

        // No location data
        __CLR4_5_265k65klx1e80hz.R.inc(8117);if ((((positions.isEmpty())&&(__CLR4_5_265k65klx1e80hz.R.iget(8118)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8119)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8120);return null;
        }

        }__CLR4_5_265k65klx1e80hz.R.inc(8121);return positions;
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    private Object processHandshake(Channel channel, ChannelBuffer buf) {try{__CLR4_5_265k65klx1e80hz.R.inc(8122);
        __CLR4_5_265k65klx1e80hz.R.inc(8123);buf.readByte(); // semicolon symbol
        __CLR4_5_265k65klx1e80hz.R.inc(8124);if ((((identify(buf.toString(Charset.defaultCharset()), channel))&&(__CLR4_5_265k65klx1e80hz.R.iget(8125)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8126)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8127);sendReply(channel, ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<S", charset));
        }
        }__CLR4_5_265k65klx1e80hz.R.inc(8128);return null;
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    private static short checksum(ChannelBuffer buf) {try{__CLR4_5_265k65klx1e80hz.R.inc(8129);
        __CLR4_5_265k65klx1e80hz.R.inc(8130);short sum = 0;
        __CLR4_5_265k65klx1e80hz.R.inc(8131);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_265k65klx1e80hz.R.iget(8132)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8133)==0&false)); i++) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8134);sum ^= buf.getUnsignedByte(i);
        }
        }__CLR4_5_265k65klx1e80hz.R.inc(8135);return sum;
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    private void sendReply(Channel channel, ChannelBuffer data) {try{__CLR4_5_265k65klx1e80hz.R.inc(8136);
        __CLR4_5_265k65klx1e80hz.R.inc(8137);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 16);
        __CLR4_5_265k65klx1e80hz.R.inc(8138);header.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, prefix, charset));
        __CLR4_5_265k65klx1e80hz.R.inc(8139);header.writeInt((int) deviceUniqueId);
        __CLR4_5_265k65klx1e80hz.R.inc(8140);header.writeInt((int) serverId);
        __CLR4_5_265k65klx1e80hz.R.inc(8141);header.writeShort(data.readableBytes());
        __CLR4_5_265k65klx1e80hz.R.inc(8142);header.writeByte(checksum(data));
        __CLR4_5_265k65klx1e80hz.R.inc(8143);header.writeByte(checksum(header));

        __CLR4_5_265k65klx1e80hz.R.inc(8144);if ((((channel != null)&&(__CLR4_5_265k65klx1e80hz.R.iget(8145)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8146)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8147);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_265k65klx1e80hz.R.inc(8148);

        __CLR4_5_265k65klx1e80hz.R.inc(8149);ChannelBuffer buf = (ChannelBuffer) msg;

        // Read header
        __CLR4_5_265k65klx1e80hz.R.inc(8150);prefix = buf.toString(buf.readerIndex(), 4, charset);
        __CLR4_5_265k65klx1e80hz.R.inc(8151);buf.skipBytes(prefix.length()); // prefix @NTC by default
        __CLR4_5_265k65klx1e80hz.R.inc(8152);serverId = buf.readUnsignedInt();
        __CLR4_5_265k65klx1e80hz.R.inc(8153);deviceUniqueId = buf.readUnsignedInt();
        __CLR4_5_265k65klx1e80hz.R.inc(8154);int length = buf.readUnsignedShort();
        __CLR4_5_265k65klx1e80hz.R.inc(8155);buf.skipBytes(2); // header and data XOR checksum

        __CLR4_5_265k65klx1e80hz.R.inc(8156);if ((((length == 0)&&(__CLR4_5_265k65klx1e80hz.R.iget(8157)!=0|true))||(__CLR4_5_265k65klx1e80hz.R.iget(8158)==0&false))) {{
            __CLR4_5_265k65klx1e80hz.R.inc(8159);return null; // keep alive message
        }

        // Read message type
        }__CLR4_5_265k65klx1e80hz.R.inc(8160);String type = buf.toString(buf.readerIndex(), 3, charset);
        __CLR4_5_265k65klx1e80hz.R.inc(8161);buf.skipBytes(type.length());
        
        boolean __CLB4_5_2_bool0=false;__CLR4_5_265k65klx1e80hz.R.inc(8162);switch (type) {
            case "*>T":if (!__CLB4_5_2_bool0) {__CLR4_5_265k65klx1e80hz.R.inc(8163);__CLB4_5_2_bool0=true;}
                __CLR4_5_265k65klx1e80hz.R.inc(8164);return processSingle(channel, buf);
            case "*>A":if (!__CLB4_5_2_bool0) {__CLR4_5_265k65klx1e80hz.R.inc(8165);__CLB4_5_2_bool0=true;}
                __CLR4_5_265k65klx1e80hz.R.inc(8166);return processArray(channel, buf);
            case "*>S":if (!__CLB4_5_2_bool0) {__CLR4_5_265k65klx1e80hz.R.inc(8167);__CLB4_5_2_bool0=true;}
                __CLR4_5_265k65klx1e80hz.R.inc(8168);return processHandshake(channel, buf);
        }

        __CLR4_5_265k65klx1e80hz.R.inc(8169);return null;
    }finally{__CLR4_5_265k65klx1e80hz.R.flushNeeded();}}

}
