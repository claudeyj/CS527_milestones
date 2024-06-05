/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class RitiProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26dp6dplx1dsnkv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,8332,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RitiProtocolDecoder(RitiProtocol protocol) {
        super(protocol);__CLR4_5_26dp6dplx1dsnkv.R.inc(8270);try{__CLR4_5_26dp6dplx1dsnkv.R.inc(8269);
    }finally{__CLR4_5_26dp6dplx1dsnkv.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +           // Speed
            "(\\d+\\.?\\d*)?," +           // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26dp6dplx1dsnkv.R.inc(8271);

        __CLR4_5_26dp6dplx1dsnkv.R.inc(8272);ChannelBuffer buf = (ChannelBuffer) msg;

        // Create new position
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8273);Position position = new Position();
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8274);position.setProtocol(getProtocolName());

        __CLR4_5_26dp6dplx1dsnkv.R.inc(8275);buf.skipBytes(2); // header

        // Get device id
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8276);if ((((!identify(String.valueOf(buf.readUnsignedShort()), channel))&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8277)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8278)==0&false))) {{
            __CLR4_5_26dp6dplx1dsnkv.R.inc(8279);return null;
        }
        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8280);position.setDeviceId(getDeviceId());

        __CLR4_5_26dp6dplx1dsnkv.R.inc(8281);position.set("mode", buf.readUnsignedByte());
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8282);position.set("command", buf.readUnsignedByte());
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8283);position.set(Event.KEY_POWER, buf.readUnsignedShort());
        
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8284);buf.skipBytes(5);
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8285);buf.readUnsignedShort();
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8286);buf.readUnsignedShort();
        
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8287);position.set("distance", buf.readUnsignedInt());
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8288);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
        
        // Parse GPRMC
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8289);Integer end = ChannelBufferTools.find(buf, buf.readerIndex(), buf.readerIndex() + 80, "*");
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8290);String gprmc = buf.toString(
                buf.readerIndex(), end - buf.readerIndex(), Charset.defaultCharset());
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8291);Matcher parser = pattern.matcher(gprmc);
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8292);if ((((!parser.matches())&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8293)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8294)==0&false))) {{
            __CLR4_5_26dp6dplx1dsnkv.R.inc(8295);return null;
        }

        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8296);Integer index = 1;

        // Time
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8297);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8298);time.clear();
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8299);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8300);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8301);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8302);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8303);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8304);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8305);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8306)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8307)==0&false))) {__CLR4_5_26dp6dplx1dsnkv.R.inc(8308);latitude = -latitude;
        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8309);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8310);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8311);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8312);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8313)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8314)==0&false))) {__CLR4_5_26dp6dplx1dsnkv.R.inc(8315);longitude = -longitude;
        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8316);position.setLongitude(longitude);

        // Speed
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8317);String speed = parser.group(index++);
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8318);if ((((speed != null)&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8319)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8320)==0&false))) {{
            __CLR4_5_26dp6dplx1dsnkv.R.inc(8321);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8322);String course = parser.group(index++);
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8323);if ((((course != null)&&(__CLR4_5_26dp6dplx1dsnkv.R.iget(8324)!=0|true))||(__CLR4_5_26dp6dplx1dsnkv.R.iget(8325)==0&false))) {{
            __CLR4_5_26dp6dplx1dsnkv.R.inc(8326);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_26dp6dplx1dsnkv.R.inc(8327);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8328);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8329);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8330);position.setTime(time.getTime());
        __CLR4_5_26dp6dplx1dsnkv.R.inc(8331);return position;
    }finally{__CLR4_5_26dp6dplx1dsnkv.R.flushNeeded();}}

}
