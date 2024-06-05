/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.List;

public class OrionProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c60c60lx1dvein{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,15823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OrionProtocolDecoder(OrionProtocol protocol) {
        super(protocol);__CLR4_5_2c60c60lx1dvein.R.inc(15769);try{__CLR4_5_2c60c60lx1dvein.R.inc(15768);
    }finally{__CLR4_5_2c60c60lx1dvein.R.flushNeeded();}}

    public static final int MSG_USERLOG = 0;
    public static final int MSG_SYSLOG = 3;

    private static void sendResponse(Channel channel, ChannelBuffer buf) {try{__CLR4_5_2c60c60lx1dvein.R.inc(15770);
        __CLR4_5_2c60c60lx1dvein.R.inc(15771);if ((((channel != null)&&(__CLR4_5_2c60c60lx1dvein.R.iget(15772)!=0|true))||(__CLR4_5_2c60c60lx1dvein.R.iget(15773)==0&false))) {{
            __CLR4_5_2c60c60lx1dvein.R.inc(15774);ChannelBuffer response = ChannelBuffers.directBuffer(4);
            __CLR4_5_2c60c60lx1dvein.R.inc(15775);response.writeByte('*');
            __CLR4_5_2c60c60lx1dvein.R.inc(15776);response.writeShort(buf.getUnsignedShort(buf.writerIndex() - 2));
            __CLR4_5_2c60c60lx1dvein.R.inc(15777);response.writeByte(buf.getUnsignedByte(buf.writerIndex() - 3));
            __CLR4_5_2c60c60lx1dvein.R.inc(15778);channel.write(response);
        }
    }}finally{__CLR4_5_2c60c60lx1dvein.R.flushNeeded();}}

    private static double convertCoordinate(int raw) {try{__CLR4_5_2c60c60lx1dvein.R.inc(15779);
        __CLR4_5_2c60c60lx1dvein.R.inc(15780);int degrees = raw / 1000000;
        __CLR4_5_2c60c60lx1dvein.R.inc(15781);double minutes = (raw % 1000000) / 10000.0;
        __CLR4_5_2c60c60lx1dvein.R.inc(15782);return degrees + minutes / 60;
    }finally{__CLR4_5_2c60c60lx1dvein.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c60c60lx1dvein.R.inc(15783);

        __CLR4_5_2c60c60lx1dvein.R.inc(15784);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2c60c60lx1dvein.R.inc(15785);buf.skipBytes(2); // header
        __CLR4_5_2c60c60lx1dvein.R.inc(15786);int type = buf.readUnsignedByte() & 0x0f;

        __CLR4_5_2c60c60lx1dvein.R.inc(15787);if ((((type == MSG_USERLOG)&&(__CLR4_5_2c60c60lx1dvein.R.iget(15788)!=0|true))||(__CLR4_5_2c60c60lx1dvein.R.iget(15789)==0&false))) {{

            __CLR4_5_2c60c60lx1dvein.R.inc(15790);int header = buf.readUnsignedByte();

            __CLR4_5_2c60c60lx1dvein.R.inc(15791);if (((((header & 0x40) != 0)&&(__CLR4_5_2c60c60lx1dvein.R.iget(15792)!=0|true))||(__CLR4_5_2c60c60lx1dvein.R.iget(15793)==0&false))) {{
                __CLR4_5_2c60c60lx1dvein.R.inc(15794);sendResponse(channel, buf);
            }

            }__CLR4_5_2c60c60lx1dvein.R.inc(15795);DeviceSession deviceSession = getDeviceSession(
                    channel, remoteAddress, String.valueOf(buf.readUnsignedInt()));
            __CLR4_5_2c60c60lx1dvein.R.inc(15796);if ((((deviceSession == null)&&(__CLR4_5_2c60c60lx1dvein.R.iget(15797)!=0|true))||(__CLR4_5_2c60c60lx1dvein.R.iget(15798)==0&false))) {{
                __CLR4_5_2c60c60lx1dvein.R.inc(15799);return null;
            }

            }__CLR4_5_2c60c60lx1dvein.R.inc(15800);List<Position> positions = new LinkedList<>();

            __CLR4_5_2c60c60lx1dvein.R.inc(15801);for (int i = 0; (((i < (header & 0x0f))&&(__CLR4_5_2c60c60lx1dvein.R.iget(15802)!=0|true))||(__CLR4_5_2c60c60lx1dvein.R.iget(15803)==0&false)); i++) {{

                __CLR4_5_2c60c60lx1dvein.R.inc(15804);Position position = new Position();
                __CLR4_5_2c60c60lx1dvein.R.inc(15805);position.setDeviceId(deviceSession.getDeviceId());
                __CLR4_5_2c60c60lx1dvein.R.inc(15806);position.setProtocol(getProtocolName());

                __CLR4_5_2c60c60lx1dvein.R.inc(15807);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
                __CLR4_5_2c60c60lx1dvein.R.inc(15808);buf.readUnsignedByte(); // length
                __CLR4_5_2c60c60lx1dvein.R.inc(15809);position.set(Position.KEY_FLAGS, buf.readUnsignedShort());

                __CLR4_5_2c60c60lx1dvein.R.inc(15810);position.setLatitude(convertCoordinate(buf.readInt()));
                __CLR4_5_2c60c60lx1dvein.R.inc(15811);position.setLongitude(convertCoordinate(buf.readInt()));
                __CLR4_5_2c60c60lx1dvein.R.inc(15812);position.setAltitude(buf.readShort() / 10.0);
                __CLR4_5_2c60c60lx1dvein.R.inc(15813);position.setCourse(buf.readUnsignedShort());
                __CLR4_5_2c60c60lx1dvein.R.inc(15814);position.setSpeed(buf.readUnsignedShort() * 0.0539957);

                __CLR4_5_2c60c60lx1dvein.R.inc(15815);DateBuilder dateBuilder = new DateBuilder()
                        .setDate(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                        .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
                __CLR4_5_2c60c60lx1dvein.R.inc(15816);position.setTime(dateBuilder.getDate());

                __CLR4_5_2c60c60lx1dvein.R.inc(15817);int satellites = buf.readUnsignedByte();
                __CLR4_5_2c60c60lx1dvein.R.inc(15818);position.setValid(satellites >= 3);
                __CLR4_5_2c60c60lx1dvein.R.inc(15819);position.set(Position.KEY_SATELLITES, satellites);

                __CLR4_5_2c60c60lx1dvein.R.inc(15820);positions.add(position);
            }

            }__CLR4_5_2c60c60lx1dvein.R.inc(15821);return positions;
        }

        }__CLR4_5_2c60c60lx1dvein.R.inc(15822);return null;
    }finally{__CLR4_5_2c60c60lx1dvein.R.flushNeeded();}}

}
