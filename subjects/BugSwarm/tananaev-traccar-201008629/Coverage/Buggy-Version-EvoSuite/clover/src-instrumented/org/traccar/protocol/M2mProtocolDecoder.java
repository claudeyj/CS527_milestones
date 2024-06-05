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

public class M2mProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2ac9ac9lx1dve7o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,13471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public M2mProtocolDecoder(M2mProtocol protocol) {
        super(protocol);__CLR4_5_2ac9ac9lx1dve7o.R.inc(13402);try{__CLR4_5_2ac9ac9lx1dve7o.R.inc(13401);
    }finally{__CLR4_5_2ac9ac9lx1dve7o.R.flushNeeded();}}

    private boolean firstPacket = true;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2ac9ac9lx1dve7o.R.inc(13403);

        __CLR4_5_2ac9ac9lx1dve7o.R.inc(13404);ChannelBuffer buf = (ChannelBuffer) msg;

        // Remove offset
        __CLR4_5_2ac9ac9lx1dve7o.R.inc(13405);for (int i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13406)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13407)==0&false)); i++) {{
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13408);int b = buf.getByte(i);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13409);if ((((b != 0x0b)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13410)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13411)==0&false))) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13412);buf.setByte(i, b - 0x20);
            }
        }}

        }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13413);if ((((firstPacket)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13414)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13415)==0&false))) {{

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13416);firstPacket = false;

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13417);StringBuilder imei = new StringBuilder();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13418);for (int i = 0; (((i < 8)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13419)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13420)==0&false)); i++) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13421);int b = buf.readByte();
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13422);if ((((i != 0)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13423)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13424)==0&false))) {{
                    __CLR4_5_2ac9ac9lx1dve7o.R.inc(13425);imei.append(b / 10);
                }
                }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13426);imei.append(b % 10);
            }

            }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13427);getDeviceSession(channel, remoteAddress, imei.toString());

        } }else {{

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13428);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13429);if ((((deviceSession == null)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13430)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13431)==0&false))) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13432);return null;
            }

            }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13433);Position position = new Position();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13434);position.setProtocol(getProtocolName());
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13435);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13436);DateBuilder dateBuilder = new DateBuilder()
                    .setDay(buf.readUnsignedByte() & 0x3f)
                    .setMonth(buf.readUnsignedByte() & 0x3f)
                    .setYear(buf.readUnsignedByte())
                    .setHour(buf.readUnsignedByte() & 0x3f)
                    .setMinute(buf.readUnsignedByte() & 0x7f)
                    .setSecond(buf.readUnsignedByte() & 0x7f);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13437);position.setTime(dateBuilder.getDate());

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13438);int degrees = buf.readUnsignedByte();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13439);double latitude = buf.readUnsignedByte();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13440);latitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13441);latitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13442);latitude /= 60;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13443);latitude += degrees;

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13444);int b = buf.readUnsignedByte();

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13445);degrees = (b & 0x7f) * 100 + buf.readUnsignedByte();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13446);double longitude = buf.readUnsignedByte();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13447);longitude += buf.readUnsignedByte() / 100.0;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13448);longitude += buf.readUnsignedByte() / 10000.0;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13449);longitude /= 60;
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13450);longitude += degrees;

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13451);if (((((b & 0x80) != 0)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13452)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13453)==0&false))) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13454);longitude = -longitude;
            }
            }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13455);if (((((b & 0x40) != 0)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13456)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13457)==0&false))) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13458);latitude = -latitude;
            }

            }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13459);position.setValid(true);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13460);position.setLatitude(latitude);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13461);position.setLongitude(longitude);
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13462);position.setSpeed(buf.readUnsignedByte());

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13463);int satellites = buf.readUnsignedByte();
            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13464);if ((((satellites == 0)&&(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13465)!=0|true))||(__CLR4_5_2ac9ac9lx1dve7o.R.iget(13466)==0&false))) {{
                __CLR4_5_2ac9ac9lx1dve7o.R.inc(13467);return null; // cell information
            }
            }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13468);position.set(Position.KEY_SATELLITES, satellites);

            // decode other data

            __CLR4_5_2ac9ac9lx1dve7o.R.inc(13469);return position;

        }

        }__CLR4_5_2ac9ac9lx1dve7o.R.inc(13470);return null;
    }finally{__CLR4_5_2ac9ac9lx1dve7o.R.flushNeeded();}}

}
