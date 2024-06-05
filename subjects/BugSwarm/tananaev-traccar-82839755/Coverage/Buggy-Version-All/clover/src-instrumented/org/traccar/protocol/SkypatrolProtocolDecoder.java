/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2013 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.nio.charset.Charset;
import java.util.Calendar; 
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class SkypatrolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26zw6zwlx1e50bw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,9212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final long defaultMask;

    public SkypatrolProtocolDecoder(SkypatrolProtocol protocol) {
        super(protocol);__CLR4_5_26zw6zwlx1e50bw.R.inc(9069);try{__CLR4_5_26zw6zwlx1e50bw.R.inc(9068);
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9070);defaultMask = Context.getConfig().getInteger(getProtocolName() + ".mask");
    }finally{__CLR4_5_26zw6zwlx1e50bw.R.flushNeeded();}}

    private static double convertCoordinate(long coordinate) {try{__CLR4_5_26zw6zwlx1e50bw.R.inc(9071);
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9072);int sign = 1;
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9073);if ((((coordinate > 0x7fffffffl)&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9074)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9075)==0&false))) {{
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9076);sign = -1;
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9077);coordinate = 0xffffffffl - coordinate;
        }

        }__CLR4_5_26zw6zwlx1e50bw.R.inc(9078);double degrees = coordinate / 1000000;
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9079);degrees += (coordinate % 1000000) / 600000.0;

        __CLR4_5_26zw6zwlx1e50bw.R.inc(9080);return sign * degrees;
    }finally{__CLR4_5_26zw6zwlx1e50bw.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_26zw6zwlx1e50bw.R.inc(9081);

        __CLR4_5_26zw6zwlx1e50bw.R.inc(9082);ChannelBuffer buf = (ChannelBuffer) msg;

        // Read header
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9083);int apiNumber = buf.readUnsignedShort();
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9084);int commandType = buf.readUnsignedByte();
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9085);int messageType = buf.getUnsignedByte(buf.readerIndex()) >> 4;
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9086);boolean needAck = (buf.readUnsignedByte() & 0xf) == 1;
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9087);long mask = defaultMask;
        __CLR4_5_26zw6zwlx1e50bw.R.inc(9088);if ((((buf.readUnsignedByte() == 4)&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9089)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9090)==0&false))) {{
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9091);mask = buf.readUnsignedInt();
        }

        // Binary position report
        }__CLR4_5_26zw6zwlx1e50bw.R.inc(9092);if ((((apiNumber == 5 &&
            commandType == 2 &&
            messageType == 1 &&
            BitUtil.check(mask, 0))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9093)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9094)==0&false))) {{

            // Create new position
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9095);Position position = new Position();
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9096);position.setProtocol(getProtocolName());

            // Status code
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9097);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9098)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9099)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9100);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            }

            // Device id
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9101);String id = null;
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9102);if ((((BitUtil.check(mask, 23))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9103)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9104)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9105);id = buf.toString(buf.readerIndex(), 8, Charset.defaultCharset()).trim();
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9106);buf.skipBytes(8);
            } }else {__CLR4_5_26zw6zwlx1e50bw.R.inc(9107);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9108)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9109)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9110);id = buf.toString(buf.readerIndex(), 22, Charset.defaultCharset()).trim();
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9111);buf.skipBytes(22);
            } }else {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9112);Log.warning("No device id field");
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9113);return null;
            }
            }}__CLR4_5_26zw6zwlx1e50bw.R.inc(9114);if ((((!identify(id, channel))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9115)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9116)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9117);return null;
            }
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9118);position.setDeviceId(getDeviceId());

            // IO data
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9119);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9120)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9121)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9122);buf.readUnsignedShort();
            }

            // ADC 1
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9123);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9124)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9125)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9126);buf.readUnsignedShort();
            }

            // ADC 2
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9127);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9128)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9129)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9130);buf.readUnsignedShort();
            }

            // Function category
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9131);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9132)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9133)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9134);buf.readUnsignedByte();
            }

            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9135);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9136);time.clear();

            // Date
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9137);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9138)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9139)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9140);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9141);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9142);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            }

            // GPS status
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9143);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9144)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9145)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9146);position.setValid(buf.readUnsignedByte() == 1);
            }

            // Latitude
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9147);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9148)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9149)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9150);position.setLatitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Longitude
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9151);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9152)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9153)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9154);position.setLongitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Speed
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9155);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9156)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9157)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9158);position.setSpeed(buf.readUnsignedShort() / 10.0);
            }

            // Course
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9159);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9160)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9161)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9162);position.setCourse(buf.readUnsignedShort() / 10.0);
            }

            // Time
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9163);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9164)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9165)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9166);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9167);time.set(Calendar.MINUTE, buf.readUnsignedByte());
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9168);time.set(Calendar.SECOND, buf.readUnsignedByte());
            }

            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9169);position.setTime(time.getTime());

            // Altitude
            __CLR4_5_26zw6zwlx1e50bw.R.inc(9170);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9171)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9172)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9173);position.setAltitude(buf.readMedium());
            }

            // Satellites
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9174);if ((((BitUtil.check(mask, 16))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9175)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9176)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9177);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
            }

            // Battery percentage
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9178);if ((((BitUtil.check(mask, 17))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9179)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9180)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9181);buf.readUnsignedShort();
            }

            // Trip odometer
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9182);if ((((BitUtil.check(mask, 20))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9183)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9184)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9185);position.set("trip", buf.readUnsignedInt());
            }

            // Odometer
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9186);if ((((BitUtil.check(mask, 21))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9187)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9188)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9189);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }

            // Time of message generation
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9190);if ((((BitUtil.check(mask, 22))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9191)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9192)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9193);buf.skipBytes(6);
            }

            // Battery level
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9194);if ((((BitUtil.check(mask, 24))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9195)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9196)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9197);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            }

            // GPS overspeed
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9198);if ((((BitUtil.check(mask, 25))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9199)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9200)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9201);buf.skipBytes(18);
            }

            // Cell information
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9202);if ((((BitUtil.check(mask, 26))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9203)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9204)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9205);buf.skipBytes(54);
            }

            // Sequence number
            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9206);if ((((BitUtil.check(mask, 28))&&(__CLR4_5_26zw6zwlx1e50bw.R.iget(9207)!=0|true))||(__CLR4_5_26zw6zwlx1e50bw.R.iget(9208)==0&false))) {{
                __CLR4_5_26zw6zwlx1e50bw.R.inc(9209);position.set(Event.KEY_INDEX, buf.readUnsignedShort());
            }

            }__CLR4_5_26zw6zwlx1e50bw.R.inc(9210);return position;
        }

        }__CLR4_5_26zw6zwlx1e50bw.R.inc(9211);return null;
    }finally{__CLR4_5_26zw6zwlx1e50bw.R.flushNeeded();}}

}
