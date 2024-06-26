/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton@traccar.org)
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
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class M2mProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2c35c35lwye666a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,15735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public M2mProtocolDecoder(M2mProtocol protocol) {
        super(protocol);__CLR4_5_2c35c35lwye666a.R.inc(15666);try{__CLR4_5_2c35c35lwye666a.R.inc(15665);
    }finally{__CLR4_5_2c35c35lwye666a.R.flushNeeded();}}

    private boolean firstPacket = true;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2c35c35lwye666a.R.inc(15667);

        __CLR4_5_2c35c35lwye666a.R.inc(15668);ChannelBuffer buf = (ChannelBuffer) msg;

        // Remove offset
        __CLR4_5_2c35c35lwye666a.R.inc(15669);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2c35c35lwye666a.R.iget(15670)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15671)==0&false)); i++) {{
            __CLR4_5_2c35c35lwye666a.R.inc(15672);int b = buf.getByte(i);
            __CLR4_5_2c35c35lwye666a.R.inc(15673);if ((((b != 0x0b)&&(__CLR4_5_2c35c35lwye666a.R.iget(15674)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15675)==0&false))) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15676);buf.setByte(i, b - 0x20);
            }
        }}

        }__CLR4_5_2c35c35lwye666a.R.inc(15677);if ((((firstPacket)&&(__CLR4_5_2c35c35lwye666a.R.iget(15678)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15679)==0&false))) {{

            __CLR4_5_2c35c35lwye666a.R.inc(15680);firstPacket = false;

            __CLR4_5_2c35c35lwye666a.R.inc(15681);StringBuilder imei = new StringBuilder();
            __CLR4_5_2c35c35lwye666a.R.inc(15682);for (int i = 0; (((i < 8)&&(__CLR4_5_2c35c35lwye666a.R.iget(15683)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15684)==0&false)); i++) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15685);int b = buf.readByte();
                __CLR4_5_2c35c35lwye666a.R.inc(15686);if ((((i != 0)&&(__CLR4_5_2c35c35lwye666a.R.iget(15687)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15688)==0&false))) {{
                    __CLR4_5_2c35c35lwye666a.R.inc(15689);imei.append(b / 10);
                }
                }__CLR4_5_2c35c35lwye666a.R.inc(15690);imei.append(b % 10);
            }

            }__CLR4_5_2c35c35lwye666a.R.inc(15691);getDeviceSession(channel, remoteAddress, imei.toString());

        } }else {{

            __CLR4_5_2c35c35lwye666a.R.inc(15692);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2c35c35lwye666a.R.inc(15693);if ((((deviceSession == null)&&(__CLR4_5_2c35c35lwye666a.R.iget(15694)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15695)==0&false))) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15696);return null;
            }

            }__CLR4_5_2c35c35lwye666a.R.inc(15697);Position position = new Position();
            __CLR4_5_2c35c35lwye666a.R.inc(15698);position.setProtocol(getProtocolName());
            __CLR4_5_2c35c35lwye666a.R.inc(15699);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2c35c35lwye666a.R.inc(15700);DateBuilder dateBuilder = new DateBuilder()
                    .setDay(buf.readUnsignedByte() & 0x3f)
                    .setMonth(buf.readUnsignedByte() & 0x3f)
                    .setYear(buf.readUnsignedByte())
                    .setHour(buf.readUnsignedByte() & 0x3f)
                    .setMinute(buf.readUnsignedByte() & 0x7f)
                    .setSecond(buf.readUnsignedByte() & 0x7f);
            __CLR4_5_2c35c35lwye666a.R.inc(15701);position.setTime(dateBuilder.getDate());

            __CLR4_5_2c35c35lwye666a.R.inc(15702);int degrees = buf.readUnsignedByte();
            __CLR4_5_2c35c35lwye666a.R.inc(15703);double latitude = buf.readUnsignedByte();
            __CLR4_5_2c35c35lwye666a.R.inc(15704);latitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_2c35c35lwye666a.R.inc(15705);latitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_2c35c35lwye666a.R.inc(15706);latitude /= 60;
            __CLR4_5_2c35c35lwye666a.R.inc(15707);latitude += degrees;

            __CLR4_5_2c35c35lwye666a.R.inc(15708);int b = buf.readUnsignedByte();

            __CLR4_5_2c35c35lwye666a.R.inc(15709);degrees = (b & 0x7f) * 100 + buf.readUnsignedByte();
            __CLR4_5_2c35c35lwye666a.R.inc(15710);double longitude = buf.readUnsignedByte();
            __CLR4_5_2c35c35lwye666a.R.inc(15711);longitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_2c35c35lwye666a.R.inc(15712);longitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_2c35c35lwye666a.R.inc(15713);longitude /= 60;
            __CLR4_5_2c35c35lwye666a.R.inc(15714);longitude += degrees;

            __CLR4_5_2c35c35lwye666a.R.inc(15715);if (((((b & 0x80) != 0)&&(__CLR4_5_2c35c35lwye666a.R.iget(15716)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15717)==0&false))) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15718);longitude = -longitude;
            }
            }__CLR4_5_2c35c35lwye666a.R.inc(15719);if (((((b & 0x40) != 0)&&(__CLR4_5_2c35c35lwye666a.R.iget(15720)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15721)==0&false))) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15722);latitude = -latitude;
            }

            }__CLR4_5_2c35c35lwye666a.R.inc(15723);position.setValid(true);
            __CLR4_5_2c35c35lwye666a.R.inc(15724);position.setLatitude(latitude);
            __CLR4_5_2c35c35lwye666a.R.inc(15725);position.setLongitude(longitude);
            __CLR4_5_2c35c35lwye666a.R.inc(15726);position.setSpeed(buf.readUnsignedByte());

            __CLR4_5_2c35c35lwye666a.R.inc(15727);int satellites = buf.readUnsignedByte();
            __CLR4_5_2c35c35lwye666a.R.inc(15728);if ((((satellites == 0)&&(__CLR4_5_2c35c35lwye666a.R.iget(15729)!=0|true))||(__CLR4_5_2c35c35lwye666a.R.iget(15730)==0&false))) {{
                __CLR4_5_2c35c35lwye666a.R.inc(15731);return null; // cell information
            }
            }__CLR4_5_2c35c35lwye666a.R.inc(15732);position.set(Position.KEY_SATELLITES, satellites);

            // decode other data

            __CLR4_5_2c35c35lwye666a.R.inc(15733);return position;

        }

        }__CLR4_5_2c35c35lwye666a.R.inc(15734);return null;
    }finally{__CLR4_5_2c35c35lwye666a.R.flushNeeded();}}

}
