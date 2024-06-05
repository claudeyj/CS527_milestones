/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class Gps056ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_29zf9zflwydyixq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,13012,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps056ProtocolDecoder(Gps056Protocol protocol) {
        super(protocol);__CLR4_5_29zf9zflwydyixq.R.inc(12940);try{__CLR4_5_29zf9zflwydyixq.R.inc(12939);
    }finally{__CLR4_5_29zf9zflwydyixq.R.flushNeeded();}}

    private static void sendResponse(Channel channel, String type, String imei, ChannelBuffer content) {try{__CLR4_5_29zf9zflwydyixq.R.inc(12941);
        __CLR4_5_29zf9zflwydyixq.R.inc(12942);if ((((channel != null)&&(__CLR4_5_29zf9zflwydyixq.R.iget(12943)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12944)==0&false))) {{
            __CLR4_5_29zf9zflwydyixq.R.inc(12945);ChannelBuffer response = ChannelBuffers.dynamicBuffer();
            __CLR4_5_29zf9zflwydyixq.R.inc(12946);String header = "*" + type + imei;
            __CLR4_5_29zf9zflwydyixq.R.inc(12947);response.writeBytes(header.getBytes(StandardCharsets.US_ASCII));
            __CLR4_5_29zf9zflwydyixq.R.inc(12948);if ((((content != null)&&(__CLR4_5_29zf9zflwydyixq.R.iget(12949)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12950)==0&false))) {{
                __CLR4_5_29zf9zflwydyixq.R.inc(12951);response.writeBytes(content);
            }
            }__CLR4_5_29zf9zflwydyixq.R.inc(12952);response.writeByte('#');
            __CLR4_5_29zf9zflwydyixq.R.inc(12953);channel.write(response);
        }
    }}finally{__CLR4_5_29zf9zflwydyixq.R.flushNeeded();}}

    private static double decodeCoordinate(ChannelBuffer buf) {try{__CLR4_5_29zf9zflwydyixq.R.inc(12954);
        __CLR4_5_29zf9zflwydyixq.R.inc(12955);double degrees = buf.getUnsignedShort(buf.readerIndex()) / 100;
        __CLR4_5_29zf9zflwydyixq.R.inc(12956);double minutes = buf.readUnsignedShort() % 100 + buf.readUnsignedShort() * 0.0001;
        __CLR4_5_29zf9zflwydyixq.R.inc(12957);degrees += minutes / 60;
        __CLR4_5_29zf9zflwydyixq.R.inc(12958);byte hemisphere = buf.readByte();
        __CLR4_5_29zf9zflwydyixq.R.inc(12959);if ((((hemisphere == 'S' || hemisphere == 'W')&&(__CLR4_5_29zf9zflwydyixq.R.iget(12960)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12961)==0&false))) {{
            __CLR4_5_29zf9zflwydyixq.R.inc(12962);degrees = -degrees;
        }
        }__CLR4_5_29zf9zflwydyixq.R.inc(12963);return degrees;
    }finally{__CLR4_5_29zf9zflwydyixq.R.flushNeeded();}}

    private static void decodeStatus(ChannelBuffer buf, Position position) {try{__CLR4_5_29zf9zflwydyixq.R.inc(12964);

        __CLR4_5_29zf9zflwydyixq.R.inc(12965);position.set(Position.KEY_INPUT, buf.readUnsignedByte());
        __CLR4_5_29zf9zflwydyixq.R.inc(12966);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());

        __CLR4_5_29zf9zflwydyixq.R.inc(12967);position.set(Position.PREFIX_ADC + 1, ChannelBuffers.swapShort(buf.readShort()) * 5.06); // mV

        __CLR4_5_29zf9zflwydyixq.R.inc(12968);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
        __CLR4_5_29zf9zflwydyixq.R.inc(12969);position.set(Position.KEY_RSSI, buf.readUnsignedByte());

    }finally{__CLR4_5_29zf9zflwydyixq.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_29zf9zflwydyixq.R.inc(12970);

        __CLR4_5_29zf9zflwydyixq.R.inc(12971);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_29zf9zflwydyixq.R.inc(12972);buf.skipBytes(2); // header
        __CLR4_5_29zf9zflwydyixq.R.inc(12973);buf.skipBytes(2); // length

        __CLR4_5_29zf9zflwydyixq.R.inc(12974);String type = buf.readBytes(7).toString(StandardCharsets.US_ASCII);
        __CLR4_5_29zf9zflwydyixq.R.inc(12975);String imei = buf.readBytes(15).toString(StandardCharsets.US_ASCII);

        __CLR4_5_29zf9zflwydyixq.R.inc(12976);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, imei);
        __CLR4_5_29zf9zflwydyixq.R.inc(12977);if ((((deviceSession == null)&&(__CLR4_5_29zf9zflwydyixq.R.iget(12978)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12979)==0&false))) {{
            __CLR4_5_29zf9zflwydyixq.R.inc(12980);return null;
        }

        }__CLR4_5_29zf9zflwydyixq.R.inc(12981);if ((((type.startsWith("LOGN"))&&(__CLR4_5_29zf9zflwydyixq.R.iget(12982)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12983)==0&false))) {{

            __CLR4_5_29zf9zflwydyixq.R.inc(12984);sendResponse(channel, "LGSA" + type.substring(4), imei,
                    ChannelBuffers.copiedBuffer("1", StandardCharsets.US_ASCII));

        } }else {__CLR4_5_29zf9zflwydyixq.R.inc(12985);if ((((type.startsWith("GPSL"))&&(__CLR4_5_29zf9zflwydyixq.R.iget(12986)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(12987)==0&false))) {{

            __CLR4_5_29zf9zflwydyixq.R.inc(12988);Position position = new Position();
            __CLR4_5_29zf9zflwydyixq.R.inc(12989);position.setProtocol(getProtocolName());
            __CLR4_5_29zf9zflwydyixq.R.inc(12990);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29zf9zflwydyixq.R.inc(12991);DateBuilder dateBuilder = new DateBuilder()
                    .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                    .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());

            __CLR4_5_29zf9zflwydyixq.R.inc(12992);position.setValid(true);
            __CLR4_5_29zf9zflwydyixq.R.inc(12993);position.setTime(dateBuilder.getDate());
            __CLR4_5_29zf9zflwydyixq.R.inc(12994);position.setLatitude(decodeCoordinate(buf));
            __CLR4_5_29zf9zflwydyixq.R.inc(12995);position.setLongitude(decodeCoordinate(buf));
            __CLR4_5_29zf9zflwydyixq.R.inc(12996);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_29zf9zflwydyixq.R.inc(12997);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_29zf9zflwydyixq.R.inc(12998);decodeStatus(buf, position);

            __CLR4_5_29zf9zflwydyixq.R.inc(12999);sendResponse(channel, "GPSA" + type.substring(4), imei, buf.readBytes(2));

            __CLR4_5_29zf9zflwydyixq.R.inc(13000);return position;

        } }else {__CLR4_5_29zf9zflwydyixq.R.inc(13001);if ((((type.startsWith("SYNC"))&&(__CLR4_5_29zf9zflwydyixq.R.iget(13002)!=0|true))||(__CLR4_5_29zf9zflwydyixq.R.iget(13003)==0&false))) {{

            __CLR4_5_29zf9zflwydyixq.R.inc(13004);Position position = new Position();
            __CLR4_5_29zf9zflwydyixq.R.inc(13005);position.setProtocol(getProtocolName());
            __CLR4_5_29zf9zflwydyixq.R.inc(13006);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_29zf9zflwydyixq.R.inc(13007);getLastLocation(position, null);

            __CLR4_5_29zf9zflwydyixq.R.inc(13008);decodeStatus(buf, position);

            __CLR4_5_29zf9zflwydyixq.R.inc(13009);sendResponse(channel, "SYSA" + type.substring(4), imei, null);

            __CLR4_5_29zf9zflwydyixq.R.inc(13010);return position;

        }

        }}}__CLR4_5_29zf9zflwydyixq.R.inc(13011);return null;
    }finally{__CLR4_5_29zf9zflwydyixq.R.flushNeeded();}}

}
