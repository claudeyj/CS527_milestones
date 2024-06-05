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

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class NavisProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25oz5ozlx1dp8c1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,7578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String prefix;
    private long deviceUniqueId, serverId;

    private static final Charset charset = Charset.defaultCharset();

    public NavisProtocolDecoder(NavisProtocol protocol) {
        super(protocol);__CLR4_5_25oz5ozlx1dp8c1.R.inc(7380);try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7379);
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    // Format types
    public static final int F10 = 0x01;
    public static final int F20 = 0x02;
    public static final int F30 = 0x03;
    public static final int F40 = 0x04;
    public static final int F50 = 0x05;
    public static final int F51 = 0x15;
    public static final int F52 = 0x25;

    private static boolean isFormat(int type, int... types) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7381);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7382);for (int i : types) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7383);if ((((type == i)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7384)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7385)==0&false))) {{
                __CLR4_5_25oz5ozlx1dp8c1.R.inc(7386);return true;
            }
        }}
        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7387);return false;
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}
    
    private class ParseResult {
        private final long id;
        private final Position position;

        public ParseResult(long id, Position position) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7388);
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7389);this.id = id;
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7390);this.position = position;
        }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

        public long getId() {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7391);
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7392);return id;
        }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

        public Position getPosition() {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7393);
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7394);return position;
        }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}
    }

    private ParseResult parsePosition(ChannelBuffer buf) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7395);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7396);Position position = new Position();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7397);position.setProtocol(getProtocolName());

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7398);position.setDeviceId(getDeviceId());

        // Format type
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7399);int format;
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7400);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7401)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7402)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7403);format = buf.readUnsignedShort();
        } }else {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7404);format = buf.readUnsignedByte();
        }
        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7405);position.set("format", format);

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7406);long index = buf.readUnsignedInt();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7407);position.set(Event.KEY_INDEX, index);

        // Event type
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7408);position.set(Event.KEY_EVENT, buf.readUnsignedShort());

        // Event time
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7409);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7410);time.clear();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7411);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7412);time.set(Calendar.MINUTE, buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7413);time.set(Calendar.SECOND, buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7414);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7415);time.set(Calendar.MONTH, buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7416);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7417);position.set("time", time.getTimeInMillis());

        // Alarm status
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7418);position.set(Event.KEY_ALARM, buf.readUnsignedByte());

        // Modules status
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7419);position.set(Event.KEY_STATUS, buf.readUnsignedByte());

        // GSM signal
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7420);position.set(Event.KEY_GSM, buf.readUnsignedByte());

        // Output
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7421);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7422)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7423)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7424);position.set(Event.KEY_OUTPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_25oz5ozlx1dp8c1.R.inc(7425);if ((((isFormat(format, F40, F50, F51, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7426)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7427)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7428);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
        }

        // Input
        }}__CLR4_5_25oz5ozlx1dp8c1.R.inc(7429);if ((((isFormat(format, F10, F20, F30, F40))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7430)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7431)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7432);position.set(Event.KEY_INPUT, buf.readUnsignedShort());
        } }else {__CLR4_5_25oz5ozlx1dp8c1.R.inc(7433);if ((((isFormat(format, F50, F51, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7434)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7435)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7436);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
        }

        }}__CLR4_5_25oz5ozlx1dp8c1.R.inc(7437);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);

        // Battery power
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7438);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());

        // Temperature
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7439);if ((((isFormat(format, F10, F20, F30))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7440)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7441)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7442);position.set(Event.PREFIX_TEMP + 1, buf.readShort());
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7443);if ((((isFormat(format, F10, F20, F50, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7444)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7445)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7446);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7447);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7448);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7449)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7450)==0&false))) {{
            // Impulse counters
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7451);buf.readUnsignedInt();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7452);buf.readUnsignedInt();
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7453);if ((((isFormat(format, F20, F50, F51, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7454)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7455)==0&false))) {{
            // Validity
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7456);int locationStatus = buf.readUnsignedByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7457);position.setValid((locationStatus & 0x02) == 0x02);

            // Location time
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7458);time.clear();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7459);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7460);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7461);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7462);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7463);time.set(Calendar.MONTH, buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7464);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7465);position.setTime(time.getTime());

            // Location data
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7466);position.setLatitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7467);position.setLongitude(buf.readFloat() / Math.PI * 180);
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7468);position.setSpeed(buf.readFloat());
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7469);position.setCourse(buf.readUnsignedShort());

            // Odometer
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7470);position.set(Event.KEY_ODOMETER, buf.readFloat());

            // Last segment
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7471);position.set("segment", buf.readFloat());

            // Segment times
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7472);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7473);buf.readUnsignedShort();
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7474);if ((((isFormat(format, F51, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7475)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7476)==0&false))) {{
            // Other stuff
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7477);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7478);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7479);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7480);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7481);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7482);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7483);buf.readUnsignedShort();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7484);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7485);buf.readUnsignedShort();
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7486);if ((((isFormat(format, F40, F52))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7487)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7488)==0&false))) {{
            // Four temperature sensors
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7489);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7490);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7491);buf.readByte();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7492);buf.readByte();
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7493);return new ParseResult(index, position);
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    private Object processSingle(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7494);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7495);ParseResult result = parsePosition(buf);

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7496);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7497);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<T", charset));
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7498);response.writeInt((int) result.getId());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7499);sendReply(channel, response);

        // No location data
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7500);if ((((result.getPosition().getFixTime() == null)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7501)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7502)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7503);return null;
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7504);return result.getPosition();
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    private Object processArray(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7505);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7506);List<Position> positions = new LinkedList<Position>();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7507);int count = buf.readUnsignedByte();

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7508);for (int i = 0; (((i < count)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7509)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7510)==0&false)); i++) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7511);Position position = parsePosition(buf).getPosition();
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7512);if ((((position.getFixTime() != null)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7513)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7514)==0&false))) {{
                __CLR4_5_25oz5ozlx1dp8c1.R.inc(7515);positions.add(position);
            }
        }}

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7516);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7517);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<A", charset));
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7518);response.writeByte(count);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7519);sendReply(channel, response);

        // No location data
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7520);if ((((positions.isEmpty())&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7521)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7522)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7523);return null;
        }

        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7524);return positions;
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    private Object processHandshake(Channel channel, ChannelBuffer buf) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7525);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7526);buf.readByte(); // semicolon symbol
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7527);if ((((identify(buf.toString(Charset.defaultCharset()), channel))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7528)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7529)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7530);sendReply(channel, ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "*<S", charset));
        }
        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7531);return null;
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    private static short checksum(ChannelBuffer buf) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7532);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7533);short sum = 0;
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7534);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7535)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7536)==0&false)); i++) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7537);sum ^= buf.getUnsignedByte(i);
        }
        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7538);return sum;
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    private void sendReply(Channel channel, ChannelBuffer data) {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7539);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7540);ChannelBuffer header = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 16);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7541);header.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, prefix, charset));
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7542);header.writeInt((int) deviceUniqueId);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7543);header.writeInt((int) serverId);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7544);header.writeShort(data.readableBytes());
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7545);header.writeByte(checksum(data));
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7546);header.writeByte(checksum(header));

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7547);if ((((channel != null)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7548)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7549)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7550);channel.write(ChannelBuffers.copiedBuffer(header, data));
        }
    }}finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_25oz5ozlx1dp8c1.R.inc(7551);

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7552);ChannelBuffer buf = (ChannelBuffer) msg;

        // Read header
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7553);prefix = buf.toString(buf.readerIndex(), 4, charset);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7554);buf.skipBytes(prefix.length()); // prefix @NTC by default
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7555);serverId = buf.readUnsignedInt();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7556);deviceUniqueId = buf.readUnsignedInt();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7557);int length = buf.readUnsignedShort();
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7558);buf.skipBytes(2); // header and data XOR checksum

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7559);if ((((length == 0)&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7560)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7561)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7562);return null; // keep alive message
        }

        // Read message type
        }__CLR4_5_25oz5ozlx1dp8c1.R.inc(7563);String type = buf.toString(buf.readerIndex(), 3, charset);
        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7564);buf.skipBytes(type.length());

        __CLR4_5_25oz5ozlx1dp8c1.R.inc(7565);if ((((type.equals("*>T"))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7566)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7567)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7568);return processSingle(channel, buf);
        } }else {__CLR4_5_25oz5ozlx1dp8c1.R.inc(7569);if ((((type.equals("*>A"))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7570)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7571)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7572);return processArray(channel, buf);
        } }else {__CLR4_5_25oz5ozlx1dp8c1.R.inc(7573);if ((((type.equals("*>S"))&&(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7574)!=0|true))||(__CLR4_5_25oz5ozlx1dp8c1.R.iget(7575)==0&false))) {{
            __CLR4_5_25oz5ozlx1dp8c1.R.inc(7576);return processHandshake(channel, buf);
        }

        }}}__CLR4_5_25oz5ozlx1dp8c1.R.inc(7577);return null;
    }finally{__CLR4_5_25oz5ozlx1dp8c1.R.flushNeeded();}}

}
