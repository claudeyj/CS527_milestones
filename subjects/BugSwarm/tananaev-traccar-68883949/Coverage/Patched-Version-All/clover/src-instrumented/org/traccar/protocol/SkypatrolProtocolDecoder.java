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

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class SkypatrolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26j66j6lx1dsnmh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,8609,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SkypatrolProtocolDecoder(SkypatrolProtocol protocol) {
        super(protocol);__CLR4_5_26j66j6lx1dsnmh.R.inc(8467);try{__CLR4_5_26j66j6lx1dsnmh.R.inc(8466);
    }finally{__CLR4_5_26j66j6lx1dsnmh.R.flushNeeded();}}

    private static double convertCoordinate(long coordinate) {try{__CLR4_5_26j66j6lx1dsnmh.R.inc(8468);
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8469);int sign = 1;
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8470);if ((((coordinate > 0x7fffffffl)&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8471)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8472)==0&false))) {{
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8473);sign = -1;
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8474);coordinate = 0xffffffffl - coordinate;
        }

        }__CLR4_5_26j66j6lx1dsnmh.R.inc(8475);double degrees = coordinate / 1000000;
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8476);degrees += (coordinate % 1000000) / 600000.0;

        __CLR4_5_26j66j6lx1dsnmh.R.inc(8477);return sign * degrees;
    }finally{__CLR4_5_26j66j6lx1dsnmh.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26j66j6lx1dsnmh.R.inc(8478);

        __CLR4_5_26j66j6lx1dsnmh.R.inc(8479);ChannelBuffer buf = (ChannelBuffer) msg;

        // Read header
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8480);int apiNumber = buf.readUnsignedShort();
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8481);int commandType = buf.readUnsignedByte();
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8482);int messageType = buf.getUnsignedByte(buf.readerIndex()) >> 4;
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8483);boolean needAck = (buf.readUnsignedByte() & 0xf) == 1;
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8484);long mask = 0;
        __CLR4_5_26j66j6lx1dsnmh.R.inc(8485);if ((((buf.readUnsignedByte() == 4)&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8486)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8487)==0&false))) {{
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8488);mask = buf.readUnsignedInt();
        }

        // Binary position report
        }__CLR4_5_26j66j6lx1dsnmh.R.inc(8489);if ((((apiNumber == 5 &&
            commandType == 2 &&
            messageType == 1 &&
            BitUtil.check(mask, 0))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8490)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8491)==0&false))) {{

            // Create new position
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8492);Position position = new Position();
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8493);position.setProtocol(getProtocolName());

            // Status code
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8494);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8495)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8496)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8497);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            }

            // Device id
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8498);String id = null;
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8499);if ((((BitUtil.check(mask, 23))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8500)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8501)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8502);id = buf.toString(buf.readerIndex(), 8, Charset.defaultCharset()).trim();
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8503);buf.skipBytes(8);
            } }else {__CLR4_5_26j66j6lx1dsnmh.R.inc(8504);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8505)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8506)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8507);id = buf.toString(buf.readerIndex(), 22, Charset.defaultCharset()).trim();
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8508);buf.skipBytes(22);
            } }else {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8509);Log.warning("No device id field");
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8510);return null;
            }
            }}__CLR4_5_26j66j6lx1dsnmh.R.inc(8511);if ((((!identify(id, channel))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8512)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8513)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8514);return null;
            }
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8515);position.setDeviceId(getDeviceId());

            // IO data
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8516);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8517)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8518)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8519);buf.readUnsignedShort();
            }

            // ADC 1
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8520);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8521)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8522)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8523);buf.readUnsignedShort();
            }

            // ADC 2
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8524);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8525)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8526)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8527);buf.readUnsignedShort();
            }

            // Function category
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8528);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8529)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8530)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8531);buf.readUnsignedByte();
            }

            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8532);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8533);time.clear();

            // Date
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8534);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8535)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8536)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8537);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8538);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8539);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            }

            // GPS status
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8540);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8541)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8542)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8543);position.setValid(buf.readUnsignedByte() == 1);
            }

            // Latitude
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8544);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8545)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8546)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8547);position.setLatitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Longitude
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8548);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8549)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8550)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8551);position.setLongitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Speed
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8552);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8553)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8554)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8555);position.setSpeed(buf.readUnsignedShort() / 10.0);
            }

            // Course
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8556);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8557)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8558)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8559);position.setCourse(buf.readUnsignedShort() / 10.0);
            }

            // Time
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8560);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8561)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8562)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8563);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8564);time.set(Calendar.MINUTE, buf.readUnsignedByte());
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8565);time.set(Calendar.SECOND, buf.readUnsignedByte());
            }

            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8566);position.setTime(time.getTime());

            // Altitude
            __CLR4_5_26j66j6lx1dsnmh.R.inc(8567);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8568)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8569)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8570);position.setAltitude(buf.readMedium());
            }

            // Satellites
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8571);if ((((BitUtil.check(mask, 16))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8572)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8573)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8574);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
            }

            // Battery percentage
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8575);if ((((BitUtil.check(mask, 17))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8576)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8577)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8578);buf.readUnsignedShort();
            }

            // Trip odometer
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8579);if ((((BitUtil.check(mask, 20))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8580)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8581)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8582);position.set("trip", buf.readUnsignedInt());
            }

            // Odometer
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8583);if ((((BitUtil.check(mask, 21))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8584)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8585)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8586);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }

            // Time of message generation
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8587);if ((((BitUtil.check(mask, 22))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8588)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8589)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8590);buf.skipBytes(6);
            }

            // Battery level
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8591);if ((((BitUtil.check(mask, 24))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8592)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8593)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8594);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            }

            // GPS overspeed
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8595);if ((((BitUtil.check(mask, 25))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8596)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8597)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8598);buf.skipBytes(18);
            }

            // Cell information
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8599);if ((((BitUtil.check(mask, 26))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8600)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8601)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8602);buf.skipBytes(54);
            }

            // Sequence number
            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8603);if ((((BitUtil.check(mask, 28))&&(__CLR4_5_26j66j6lx1dsnmh.R.iget(8604)!=0|true))||(__CLR4_5_26j66j6lx1dsnmh.R.iget(8605)==0&false))) {{
                __CLR4_5_26j66j6lx1dsnmh.R.inc(8606);position.set(Event.KEY_INDEX, buf.readUnsignedShort());
            }

            }__CLR4_5_26j66j6lx1dsnmh.R.inc(8607);return position;
        }

        }__CLR4_5_26j66j6lx1dsnmh.R.inc(8608);return null;
    }finally{__CLR4_5_26j66j6lx1dsnmh.R.flushNeeded();}}

}
