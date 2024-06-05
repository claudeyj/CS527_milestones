/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2013 Anton Tananaev (anton@traccar.org)
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
import org.traccar.Context;
import org.traccar.DeviceSession;
import org.traccar.helper.BitUtil;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.Log;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class SkypatrolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cuzcuzlx1e0i52{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,16806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long defaultMask;

    public SkypatrolProtocolDecoder(SkypatrolProtocol protocol) {
        super(protocol);__CLR4_5_2cuzcuzlx1e0i52.R.inc(16668);try{__CLR4_5_2cuzcuzlx1e0i52.R.inc(16667);
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16669);defaultMask = Context.getConfig().getInteger(getProtocolName() + ".mask");
    }finally{__CLR4_5_2cuzcuzlx1e0i52.R.flushNeeded();}}

    private static double convertCoordinate(long coordinate) {try{__CLR4_5_2cuzcuzlx1e0i52.R.inc(16670);
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16671);int sign = 1;
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16672);if ((((coordinate > 0x7fffffffL)&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16673)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16674)==0&false))) {{
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16675);sign = -1;
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16676);coordinate = 0xffffffffL - coordinate;
        }

        }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16677);long degrees = coordinate / 1000000;
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16678);double minutes = (coordinate % 1000000) / 10000.0;

        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16679);return sign * (degrees + minutes / 60);
    }finally{__CLR4_5_2cuzcuzlx1e0i52.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cuzcuzlx1e0i52.R.inc(16680);

        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16681);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16682);int apiNumber = buf.readUnsignedShort();
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16683);int commandType = buf.readUnsignedByte();
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16684);int messageType = BitUtil.from(buf.readUnsignedByte(), 4);
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16685);long mask = defaultMask;
        __CLR4_5_2cuzcuzlx1e0i52.R.inc(16686);if ((((buf.readUnsignedByte() == 4)&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16687)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16688)==0&false))) {{
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16689);mask = buf.readUnsignedInt();
        }

        // Binary position report
        }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16690);if ((((apiNumber == 5 && commandType == 2 && messageType == 1 && BitUtil.check(mask, 0))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16691)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16692)==0&false))) {{

            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16693);Position position = new Position();
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16694);position.setProtocol(getProtocolName());

            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16695);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16696)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16697)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16698);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16699);String id;
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16700);if ((((BitUtil.check(mask, 23))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16701)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16702)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16703);id = buf.toString(buf.readerIndex(), 8, StandardCharsets.US_ASCII).trim();
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16704);buf.skipBytes(8);
            } }else {__CLR4_5_2cuzcuzlx1e0i52.R.inc(16705);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16706)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16707)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16708);id = buf.toString(buf.readerIndex(), 22, StandardCharsets.US_ASCII).trim();
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16709);buf.skipBytes(22);
            } }else {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16710);Log.warning("No device id field");
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16711);return null;
            }
            }}__CLR4_5_2cuzcuzlx1e0i52.R.inc(16712);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16713);if ((((deviceSession == null)&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16714)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16715)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16716);return null;
            }
            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16717);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16718);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16719)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16720)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16721);buf.readUnsignedShort(); // io data
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16722);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16723)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16724)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16725);buf.readUnsignedShort(); // adc 1
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16726);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16727)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16728)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16729);buf.readUnsignedShort(); // adc 2
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16730);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16731)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16732)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16733);buf.readUnsignedByte(); // function category
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16734);DateBuilder dateBuilder = new DateBuilder();

            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16735);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16736)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16737)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16738);dateBuilder.setDateReverse(
                        buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16739);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16740)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16741)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16742);position.setValid(buf.readUnsignedByte() == 1); // gps status
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16743);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16744)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16745)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16746);position.setLatitude(convertCoordinate(buf.readUnsignedInt()));
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16747);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16748)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16749)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16750);position.setLongitude(convertCoordinate(buf.readUnsignedInt()));
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16751);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16752)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16753)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16754);position.setSpeed(buf.readUnsignedShort() / 10.0);
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16755);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16756)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16757)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16758);position.setCourse(buf.readUnsignedShort() / 10.0);
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16759);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16760)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16761)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16762);dateBuilder.setTime(
                        buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16763);position.setTime(dateBuilder.getDate());

            __CLR4_5_2cuzcuzlx1e0i52.R.inc(16764);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16765)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16766)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16767);position.setAltitude(buf.readMedium());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16768);if ((((BitUtil.check(mask, 16))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16769)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16770)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16771);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16772);if ((((BitUtil.check(mask, 17))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16773)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16774)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16775);buf.readUnsignedShort(); // battery percentage
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16776);if ((((BitUtil.check(mask, 20))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16777)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16778)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16779);position.set("trip", buf.readUnsignedInt());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16780);if ((((BitUtil.check(mask, 21))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16781)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16782)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16783);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16784);if ((((BitUtil.check(mask, 22))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16785)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16786)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16787);buf.skipBytes(6); // time of message generation
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16788);if ((((BitUtil.check(mask, 24))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16789)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16790)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16791);position.set(Position.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16792);if ((((BitUtil.check(mask, 25))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16793)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16794)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16795);buf.skipBytes(18); // gps overspeed
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16796);if ((((BitUtil.check(mask, 26))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16797)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16798)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16799);buf.skipBytes(54); // cell information
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16800);if ((((BitUtil.check(mask, 28))&&(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16801)!=0|true))||(__CLR4_5_2cuzcuzlx1e0i52.R.iget(16802)==0&false))) {{
                __CLR4_5_2cuzcuzlx1e0i52.R.inc(16803);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
            }

            }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16804);return position;
        }

        }__CLR4_5_2cuzcuzlx1e0i52.R.inc(16805);return null;
    }finally{__CLR4_5_2cuzcuzlx1e0i52.R.flushNeeded();}}

}
