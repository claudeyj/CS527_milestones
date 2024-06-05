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
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class EnforaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2368368lx1dh399{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,4185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EnforaProtocolDecoder(EnforaProtocol protocol) {
        super(protocol);__CLR4_5_2368368lx1dh399.R.inc(4113);try{__CLR4_5_2368368lx1dh399.R.inc(4112);
    }finally{__CLR4_5_2368368lx1dh399.R.flushNeeded();}}

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
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2368368lx1dh399.R.inc(4114);

        __CLR4_5_2368368lx1dh399.R.inc(4115);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find IMEI (Modem ID)
        __CLR4_5_2368368lx1dh399.R.inc(4116);String imei = null;
        __CLR4_5_2368368lx1dh399.R.inc(4117);for (int first = -1, i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2368368lx1dh399.R.iget(4118)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4119)==0&false)); i++) {{
            __CLR4_5_2368368lx1dh399.R.inc(4120);if ((((!Character.isDigit((char) buf.getByte(i)))&&(__CLR4_5_2368368lx1dh399.R.iget(4121)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4122)==0&false))) {{
                __CLR4_5_2368368lx1dh399.R.inc(4123);first = i + 1;
            }

            // Found digit string
            }__CLR4_5_2368368lx1dh399.R.inc(4124);if ((((i - first == IMEI_LENGTH - 1)&&(__CLR4_5_2368368lx1dh399.R.iget(4125)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4126)==0&false))) {{
                __CLR4_5_2368368lx1dh399.R.inc(4127);imei = buf.toString(first, IMEI_LENGTH, Charset.defaultCharset());
                __CLR4_5_2368368lx1dh399.R.inc(4128);break;
            }
        }}

        // Write log
        }__CLR4_5_2368368lx1dh399.R.inc(4129);if ((((imei == null)&&(__CLR4_5_2368368lx1dh399.R.iget(4130)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4131)==0&false))) {{
            __CLR4_5_2368368lx1dh399.R.inc(4132);Log.warning("Enfora decoder failed to find IMEI");
            __CLR4_5_2368368lx1dh399.R.inc(4133);return null;
        }

        // Find GPSMC string
        }__CLR4_5_2368368lx1dh399.R.inc(4134);Integer start = ChannelBufferTools.find(buf, 0, buf.readableBytes(), "GPRMC");
        __CLR4_5_2368368lx1dh399.R.inc(4135);if ((((start == null)&&(__CLR4_5_2368368lx1dh399.R.iget(4136)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4137)==0&false))) {{
            // Message does not contain GPS data
            __CLR4_5_2368368lx1dh399.R.inc(4138);return null;
        }
        }__CLR4_5_2368368lx1dh399.R.inc(4139);String sentence = buf.toString(start, buf.readableBytes() - start, Charset.defaultCharset());

        // Parse message
        __CLR4_5_2368368lx1dh399.R.inc(4140);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_2368368lx1dh399.R.inc(4141);if ((((!parser.matches())&&(__CLR4_5_2368368lx1dh399.R.iget(4142)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4143)==0&false))) {{
            __CLR4_5_2368368lx1dh399.R.inc(4144);return null;
        }

        // Create new position
        }__CLR4_5_2368368lx1dh399.R.inc(4145);Position position = new Position();
        __CLR4_5_2368368lx1dh399.R.inc(4146);position.setProtocol(getProtocolName());
        __CLR4_5_2368368lx1dh399.R.inc(4147);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_2368368lx1dh399.R.inc(4148);if ((((!identify(imei, channel))&&(__CLR4_5_2368368lx1dh399.R.iget(4149)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4150)==0&false))) {{
            __CLR4_5_2368368lx1dh399.R.inc(4151);return null;
        }
        }__CLR4_5_2368368lx1dh399.R.inc(4152);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_2368368lx1dh399.R.inc(4153);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2368368lx1dh399.R.inc(4154);time.clear();
        __CLR4_5_2368368lx1dh399.R.inc(4155);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2368368lx1dh399.R.inc(4156);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2368368lx1dh399.R.inc(4157);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2368368lx1dh399.R.inc(4158);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)) * 10);

        // Validity
        __CLR4_5_2368368lx1dh399.R.inc(4159);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_2368368lx1dh399.R.inc(4160);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2368368lx1dh399.R.inc(4161);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2368368lx1dh399.R.inc(4162);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2368368lx1dh399.R.iget(4163)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4164)==0&false))) {__CLR4_5_2368368lx1dh399.R.inc(4165);latitude = -latitude;
        }__CLR4_5_2368368lx1dh399.R.inc(4166);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2368368lx1dh399.R.inc(4167);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2368368lx1dh399.R.inc(4168);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2368368lx1dh399.R.inc(4169);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2368368lx1dh399.R.iget(4170)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4171)==0&false))) {__CLR4_5_2368368lx1dh399.R.inc(4172);longitude = -longitude;
        }__CLR4_5_2368368lx1dh399.R.inc(4173);position.setLongitude(longitude);

        // Speed
        __CLR4_5_2368368lx1dh399.R.inc(4174);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_2368368lx1dh399.R.inc(4175);String course = parser.group(index++);
        __CLR4_5_2368368lx1dh399.R.inc(4176);if ((((course != null)&&(__CLR4_5_2368368lx1dh399.R.iget(4177)!=0|true))||(__CLR4_5_2368368lx1dh399.R.iget(4178)==0&false))) {{
            __CLR4_5_2368368lx1dh399.R.inc(4179);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_2368368lx1dh399.R.inc(4180);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2368368lx1dh399.R.inc(4181);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2368368lx1dh399.R.inc(4182);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2368368lx1dh399.R.inc(4183);position.setTime(time.getTime());
        __CLR4_5_2368368lx1dh399.R.inc(4184);return position;
    }finally{__CLR4_5_2368368lx1dh399.R.flushNeeded();}}

}
