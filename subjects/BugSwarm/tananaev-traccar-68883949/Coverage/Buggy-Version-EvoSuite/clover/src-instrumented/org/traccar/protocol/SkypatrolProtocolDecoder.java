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

public class SkypatrolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26j56j5lx1dh4xa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,8608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SkypatrolProtocolDecoder(SkypatrolProtocol protocol) {
        super(protocol);__CLR4_5_26j56j5lx1dh4xa.R.inc(8466);try{__CLR4_5_26j56j5lx1dh4xa.R.inc(8465);
    }finally{__CLR4_5_26j56j5lx1dh4xa.R.flushNeeded();}}

    private static double convertCoordinate(long coordinate) {try{__CLR4_5_26j56j5lx1dh4xa.R.inc(8467);
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8468);int sign = 1;
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8469);if ((((coordinate > 0x7fffffffl)&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8470)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8471)==0&false))) {{
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8472);sign = -1;
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8473);coordinate = 0xffffffffl - coordinate;
        }

        }__CLR4_5_26j56j5lx1dh4xa.R.inc(8474);double degrees = coordinate / 1000000;
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8475);degrees += (coordinate % 1000000) / 600000.0;

        __CLR4_5_26j56j5lx1dh4xa.R.inc(8476);return sign * degrees;
    }finally{__CLR4_5_26j56j5lx1dh4xa.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26j56j5lx1dh4xa.R.inc(8477);

        __CLR4_5_26j56j5lx1dh4xa.R.inc(8478);ChannelBuffer buf = (ChannelBuffer) msg;

        // Read header
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8479);int apiNumber = buf.readUnsignedShort();
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8480);int commandType = buf.readUnsignedByte();
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8481);int messageType = buf.getUnsignedByte(buf.readerIndex()) >> 4;
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8482);boolean needAck = (buf.readUnsignedByte() & 0xf) == 1;
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8483);long mask = 0;
        __CLR4_5_26j56j5lx1dh4xa.R.inc(8484);if ((((buf.readUnsignedByte() == 4)&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8485)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8486)==0&false))) {{
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8487);mask = buf.readUnsignedInt();
        }

        // Binary position report
        }__CLR4_5_26j56j5lx1dh4xa.R.inc(8488);if ((((apiNumber == 5 &&
            commandType == 2 &&
            messageType == 1 &&
            BitUtil.check(mask, 0))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8489)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8490)==0&false))) {{

            // Create new position
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8491);Position position = new Position();
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8492);position.setProtocol(getProtocolName());

            // Status code
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8493);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8494)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8495)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8496);position.set(Event.KEY_STATUS, buf.readUnsignedInt());
            }

            // Device id
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8497);String id = null;
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8498);if ((((BitUtil.check(mask, 23))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8499)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8500)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8501);id = buf.toString(buf.readerIndex(), 8, Charset.defaultCharset()).trim();
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8502);buf.skipBytes(8);
            } }else {__CLR4_5_26j56j5lx1dh4xa.R.inc(8503);if ((((BitUtil.check(mask, 2))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8504)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8505)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8506);id = buf.toString(buf.readerIndex(), 22, Charset.defaultCharset()).trim();
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8507);buf.skipBytes(22);
            } }else {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8508);Log.warning("No device id field");
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8509);return null;
            }
            }}__CLR4_5_26j56j5lx1dh4xa.R.inc(8510);if ((((!identify(id, channel))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8511)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8512)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8513);return null;
            }
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8514);position.setDeviceId(getDeviceId());

            // IO data
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8515);if ((((BitUtil.check(mask, 3))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8516)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8517)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8518);buf.readUnsignedShort();
            }

            // ADC 1
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8519);if ((((BitUtil.check(mask, 4))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8520)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8521)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8522);buf.readUnsignedShort();
            }

            // ADC 2
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8523);if ((((BitUtil.check(mask, 5))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8524)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8525)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8526);buf.readUnsignedShort();
            }

            // Function category
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8527);if ((((BitUtil.check(mask, 7))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8528)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8529)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8530);buf.readUnsignedByte();
            }

            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8531);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8532);time.clear();

            // Date
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8533);if ((((BitUtil.check(mask, 8))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8534)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8535)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8536);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8537);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8538);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            }

            // GPS status
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8539);if ((((BitUtil.check(mask, 9))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8540)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8541)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8542);position.setValid(buf.readUnsignedByte() == 1);
            }

            // Latitude
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8543);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8544)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8545)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8546);position.setLatitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Longitude
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8547);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8548)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8549)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8550);position.setLongitude(convertCoordinate(buf.readUnsignedInt()));
            }

            // Speed
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8551);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8552)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8553)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8554);position.setSpeed(buf.readUnsignedShort() / 10.0);
            }

            // Course
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8555);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8556)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8557)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8558);position.setCourse(buf.readUnsignedShort() / 10.0);
            }

            // Time
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8559);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8560)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8561)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8562);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8563);time.set(Calendar.MINUTE, buf.readUnsignedByte());
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8564);time.set(Calendar.SECOND, buf.readUnsignedByte());
            }

            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8565);position.setTime(time.getTime());

            // Altitude
            __CLR4_5_26j56j5lx1dh4xa.R.inc(8566);if ((((BitUtil.check(mask, 15))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8567)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8568)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8569);position.setAltitude(buf.readMedium());
            }

            // Satellites
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8570);if ((((BitUtil.check(mask, 16))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8571)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8572)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8573);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
            }

            // Battery percentage
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8574);if ((((BitUtil.check(mask, 17))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8575)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8576)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8577);buf.readUnsignedShort();
            }

            // Trip odometer
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8578);if ((((BitUtil.check(mask, 20))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8579)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8580)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8581);position.set("trip", buf.readUnsignedInt());
            }

            // Odometer
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8582);if ((((BitUtil.check(mask, 21))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8583)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8584)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8585);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }

            // Time of message generation
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8586);if ((((BitUtil.check(mask, 22))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8587)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8588)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8589);buf.skipBytes(6);
            }

            // Battery level
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8590);if ((((BitUtil.check(mask, 24))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8591)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8592)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8593);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            }

            // GPS overspeed
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8594);if ((((BitUtil.check(mask, 25))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8595)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8596)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8597);buf.skipBytes(18);
            }

            // Cell information
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8598);if ((((BitUtil.check(mask, 26))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8599)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8600)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8601);buf.skipBytes(54);
            }

            // Sequence number
            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8602);if ((((BitUtil.check(mask, 28))&&(__CLR4_5_26j56j5lx1dh4xa.R.iget(8603)!=0|true))||(__CLR4_5_26j56j5lx1dh4xa.R.iget(8604)==0&false))) {{
                __CLR4_5_26j56j5lx1dh4xa.R.inc(8605);position.set(Event.KEY_INDEX, buf.readUnsignedShort());
            }

            }__CLR4_5_26j56j5lx1dh4xa.R.inc(8606);return position;
        }

        }__CLR4_5_26j56j5lx1dh4xa.R.inc(8607);return null;
    }finally{__CLR4_5_26j56j5lx1dh4xa.R.flushNeeded();}}

}
