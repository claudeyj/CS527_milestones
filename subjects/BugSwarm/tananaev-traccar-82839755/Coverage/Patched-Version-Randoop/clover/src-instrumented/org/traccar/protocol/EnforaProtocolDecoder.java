/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class EnforaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23bd3bdlx1e74w9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,4370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EnforaProtocolDecoder(EnforaProtocol protocol) {
        super(protocol);__CLR4_5_23bd3bdlx1e74w9.R.inc(4298);try{__CLR4_5_23bd3bdlx1e74w9.R.inc(4297);
    }finally{__CLR4_5_23bd3bdlx1e74w9.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2}).(\\d+)," + // Time (HHMMSS.SS)
            "([AV])," +                  // Validity
            "(\\d{2})(\\d{2}.\\d+)," +   // Latitude (DDMM.MMMMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}.\\d+)," +   // Longitude (DDDMM.MMMMMM)
            "([EW])," +
            "(\\d+.\\d+)?," +            // Speed
            "(\\d+.\\d+)?," +            // Course
            "(\\d{2})(\\d{2})(\\d{2})," + // Date (DDMMYY)
            ".*[\r\n\u0000]*");

    public static final int IMEI_LENGTH = 15;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23bd3bdlx1e74w9.R.inc(4299);

        __CLR4_5_23bd3bdlx1e74w9.R.inc(4300);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find IMEI (Modem ID)
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4301);String imei = null;
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4302);for (int first = -1, i = 0; (((i < buf.readableBytes())&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4303)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4304)==0&false)); i++) {{
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4305);if ((((!Character.isDigit((char) buf.getByte(i)))&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4306)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4307)==0&false))) {{
                __CLR4_5_23bd3bdlx1e74w9.R.inc(4308);first = i + 1;
            }

            // Found digit string
            }__CLR4_5_23bd3bdlx1e74w9.R.inc(4309);if ((((i - first == IMEI_LENGTH - 1)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4310)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4311)==0&false))) {{
                __CLR4_5_23bd3bdlx1e74w9.R.inc(4312);imei = buf.toString(first, IMEI_LENGTH, Charset.defaultCharset());
                __CLR4_5_23bd3bdlx1e74w9.R.inc(4313);break;
            }
        }}

        // Write log
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4314);if ((((imei == null)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4315)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4316)==0&false))) {{
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4317);Log.warning("Enfora decoder failed to find IMEI");
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4318);return null;
        }

        // Find GPSMC string
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4319);Integer start = ChannelBufferTools.find(buf, 0, buf.readableBytes(), "GPRMC");
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4320);if ((((start == null)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4321)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4322)==0&false))) {{
            // Message does not contain GPS data
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4323);return null;
        }
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4324);String sentence = buf.toString(start, buf.readableBytes() - start, Charset.defaultCharset());

        // Parse message
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4325);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4326);if ((((!parser.matches())&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4327)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4328)==0&false))) {{
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4329);return null;
        }

        // Create new position
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4330);Position position = new Position();
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4331);position.setProtocol(getProtocolName());
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4332);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4333);if ((((!identify(imei, channel))&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4334)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4335)==0&false))) {{
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4336);return null;
        }
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4337);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4338);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4339);time.clear();
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4340);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4341);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4342);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4343);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)) * 10);

        // Validity
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4344);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4345);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4346);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4347);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4348)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4349)==0&false))) {__CLR4_5_23bd3bdlx1e74w9.R.inc(4350);latitude = -latitude;
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4351);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4352);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4353);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4354);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4355)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4356)==0&false))) {__CLR4_5_23bd3bdlx1e74w9.R.inc(4357);longitude = -longitude;
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4358);position.setLongitude(longitude);

        // Speed
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4359);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4360);String course = parser.group(index++);
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4361);if ((((course != null)&&(__CLR4_5_23bd3bdlx1e74w9.R.iget(4362)!=0|true))||(__CLR4_5_23bd3bdlx1e74w9.R.iget(4363)==0&false))) {{
            __CLR4_5_23bd3bdlx1e74w9.R.inc(4364);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_23bd3bdlx1e74w9.R.inc(4365);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4366);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4367);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4368);position.setTime(time.getTime());
        __CLR4_5_23bd3bdlx1e74w9.R.inc(4369);return position;
    }finally{__CLR4_5_23bd3bdlx1e74w9.R.flushNeeded();}}

}
