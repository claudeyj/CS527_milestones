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

public class SkypatrolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2et3et3lwydykar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,19330,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final long defaultMask;

    public SkypatrolProtocolDecoder(SkypatrolProtocol protocol) {
        super(protocol);__CLR4_5_2et3et3lwydykar.R.inc(19192);try{__CLR4_5_2et3et3lwydykar.R.inc(19191);
        __CLR4_5_2et3et3lwydykar.R.inc(19193);defaultMask = Context.getConfig().getInteger(getProtocolName() + ".mask");
    }finally{__CLR4_5_2et3et3lwydykar.R.flushNeeded();}}

    private static double convertCoordinate(long coordinate) {try{__CLR4_5_2et3et3lwydykar.R.inc(19194);
        __CLR4_5_2et3et3lwydykar.R.inc(19195);int sign = 1;
        __CLR4_5_2et3et3lwydykar.R.inc(19196);if ((((coordinate > 0x7fffffffL)&&(__CLR4_5_2et3et3lwydykar.R.iget(19197)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19198)==0&false))) {{
            __CLR4_5_2et3et3lwydykar.R.inc(19199);sign = -1;
            __CLR4_5_2et3et3lwydykar.R.inc(19200);coordinate = 0xffffffffL - coordinate;
        }

        }__CLR4_5_2et3et3lwydykar.R.inc(19201);long degrees = coordinate / 1000000;
        __CLR4_5_2et3et3lwydykar.R.inc(19202);double minutes = (coordinate % 1000000) / 10000.0;

        __CLR4_5_2et3et3lwydykar.R.inc(19203);return sign * (degrees + minutes / 60);
    }finally{__CLR4_5_2et3et3lwydykar.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2et3et3lwydykar.R.inc(19204);

        __CLR4_5_2et3et3lwydykar.R.inc(19205);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2et3et3lwydykar.R.inc(19206);int apiNumber = buf.readUnsignedShort();
        __CLR4_5_2et3et3lwydykar.R.inc(19207);int commandType = buf.readUnsignedByte();
        __CLR4_5_2et3et3lwydykar.R.inc(19208);int messageType = BitUtil.from(buf.readUnsignedByte(), 4);
        __CLR4_5_2et3et3lwydykar.R.inc(19209);long mask = defaultMask;
        __CLR4_5_2et3et3lwydykar.R.inc(19210);if ((((buf.readUnsignedByte() == 4)&&(__CLR4_5_2et3et3lwydykar.R.iget(19211)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19212)==0&false))) {{
            __CLR4_5_2et3et3lwydykar.R.inc(19213);mask = buf.readUnsignedInt();
        }

        // Binary position report
        }__CLR4_5_2et3et3lwydykar.R.inc(19214);if ((((apiNumber == 5 && commandType == 2 && messageType == 1 && BitUtil.check(mask, 0))&&(__CLR4_5_2et3et3lwydykar.R.iget(19215)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19216)==0&false))) {{

            __CLR4_5_2et3et3lwydykar.R.inc(19217);Position position = new Position();
            __CLR4_5_2et3et3lwydykar.R.inc(19218);position.setProtocol(getProtocolName());

            __CLR4_5_2et3et3lwydykar.R.inc(19219);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_2et3et3lwydykar.R.iget(19220)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19221)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19222);position.set(Position.KEY_STATUS, buf.readUnsignedInt());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19223);String id;
            __CLR4_5_2et3et3lwydykar.R.inc(19224);if ((((BitUtil.check(mask, 23))&&(__CLR4_5_2et3et3lwydykar.R.iget(19225)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19226)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19227);id = buf.toString(buf.readerIndex(), 8, StandardCharsets.US_ASCII).trim();
                __CLR4_5_2et3et3lwydykar.R.inc(19228);buf.skipBytes(8);
            } }else {__CLR4_5_2et3et3lwydykar.R.inc(19229);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_2et3et3lwydykar.R.iget(19230)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19231)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19232);id = buf.toString(buf.readerIndex(), 22, StandardCharsets.US_ASCII).trim();
                __CLR4_5_2et3et3lwydykar.R.inc(19233);buf.skipBytes(22);
            } }else {{
                __CLR4_5_2et3et3lwydykar.R.inc(19234);Log.warning("No device id field");
                __CLR4_5_2et3et3lwydykar.R.inc(19235);return null;
            }
            }}__CLR4_5_2et3et3lwydykar.R.inc(19236);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, id);
            __CLR4_5_2et3et3lwydykar.R.inc(19237);if ((((deviceSession == null)&&(__CLR4_5_2et3et3lwydykar.R.iget(19238)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19239)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19240);return null;
            }
            }__CLR4_5_2et3et3lwydykar.R.inc(19241);position.setDeviceId(deviceSession.getDeviceId());

            __CLR4_5_2et3et3lwydykar.R.inc(19242);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_2et3et3lwydykar.R.iget(19243)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19244)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19245);position.set(Position.PREFIX_IO + 1, buf.readUnsignedShort());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19246);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_2et3et3lwydykar.R.iget(19247)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19248)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19249);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19250);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_2et3et3lwydykar.R.iget(19251)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19252)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19253);position.set(Position.PREFIX_ADC + 2, buf.readUnsignedShort());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19254);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_2et3et3lwydykar.R.iget(19255)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19256)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19257);buf.readUnsignedByte(); // function category
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19258);DateBuilder dateBuilder = new DateBuilder();

            __CLR4_5_2et3et3lwydykar.R.inc(19259);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_2et3et3lwydykar.R.iget(19260)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19261)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19262);dateBuilder.setDateReverse(
                        buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19263);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_2et3et3lwydykar.R.iget(19264)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19265)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19266);position.setValid(buf.readUnsignedByte() == 1); // gps status
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19267);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_2et3et3lwydykar.R.iget(19268)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19269)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19270);position.setLatitude(convertCoordinate(buf.readUnsignedInt()));
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19271);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_2et3et3lwydykar.R.iget(19272)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19273)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19274);position.setLongitude(convertCoordinate(buf.readUnsignedInt()));
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19275);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_2et3et3lwydykar.R.iget(19276)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19277)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19278);position.setSpeed(buf.readUnsignedShort() / 10.0);
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19279);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_2et3et3lwydykar.R.iget(19280)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19281)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19282);position.setCourse(buf.readUnsignedShort() / 10.0);
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19283);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_2et3et3lwydykar.R.iget(19284)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19285)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19286);dateBuilder.setTime(
                        buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19287);position.setTime(dateBuilder.getDate());

            __CLR4_5_2et3et3lwydykar.R.inc(19288);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_2et3et3lwydykar.R.iget(19289)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19290)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19291);position.setAltitude(buf.readMedium());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19292);if ((((BitUtil.check(mask, 16))&&(__CLR4_5_2et3et3lwydykar.R.iget(19293)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19294)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19295);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19296);if ((((BitUtil.check(mask, 17))&&(__CLR4_5_2et3et3lwydykar.R.iget(19297)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19298)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19299);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19300);if ((((BitUtil.check(mask, 20))&&(__CLR4_5_2et3et3lwydykar.R.iget(19301)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19302)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19303);position.set(Position.KEY_ODOMETER_TRIP, buf.readUnsignedInt());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19304);if ((((BitUtil.check(mask, 21))&&(__CLR4_5_2et3et3lwydykar.R.iget(19305)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19306)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19307);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19308);if ((((BitUtil.check(mask, 22))&&(__CLR4_5_2et3et3lwydykar.R.iget(19309)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19310)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19311);buf.skipBytes(6); // time of message generation
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19312);if ((((BitUtil.check(mask, 24))&&(__CLR4_5_2et3et3lwydykar.R.iget(19313)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19314)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19315);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.001);
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19316);if ((((BitUtil.check(mask, 25))&&(__CLR4_5_2et3et3lwydykar.R.iget(19317)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19318)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19319);buf.skipBytes(18); // gps overspeed
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19320);if ((((BitUtil.check(mask, 26))&&(__CLR4_5_2et3et3lwydykar.R.iget(19321)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19322)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19323);buf.skipBytes(54); // cell information
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19324);if ((((BitUtil.check(mask, 28))&&(__CLR4_5_2et3et3lwydykar.R.iget(19325)!=0|true))||(__CLR4_5_2et3et3lwydykar.R.iget(19326)==0&false))) {{
                __CLR4_5_2et3et3lwydykar.R.inc(19327);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
            }

            }__CLR4_5_2et3et3lwydykar.R.inc(19328);return position;
        }

        }__CLR4_5_2et3et3lwydykar.R.inc(19329);return null;
    }finally{__CLR4_5_2et3et3lwydykar.R.flushNeeded();}}

}
