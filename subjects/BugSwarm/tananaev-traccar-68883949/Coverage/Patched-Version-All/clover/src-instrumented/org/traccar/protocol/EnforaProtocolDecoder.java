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

public class EnforaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2369369lx1dsm8k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,4186,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EnforaProtocolDecoder(EnforaProtocol protocol) {
        super(protocol);__CLR4_5_2369369lx1dsm8k.R.inc(4114);try{__CLR4_5_2369369lx1dsm8k.R.inc(4113);
    }finally{__CLR4_5_2369369lx1dsm8k.R.flushNeeded();}}

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
            throws Exception {try{__CLR4_5_2369369lx1dsm8k.R.inc(4115);

        __CLR4_5_2369369lx1dsm8k.R.inc(4116);ChannelBuffer buf = (ChannelBuffer) msg;

        // Find IMEI (Modem ID)
        __CLR4_5_2369369lx1dsm8k.R.inc(4117);String imei = null;
        __CLR4_5_2369369lx1dsm8k.R.inc(4118);for (int first = -1, i = 0; (((i < buf.readableBytes())&&(__CLR4_5_2369369lx1dsm8k.R.iget(4119)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4120)==0&false)); i++) {{
            __CLR4_5_2369369lx1dsm8k.R.inc(4121);if ((((!Character.isDigit((char) buf.getByte(i)))&&(__CLR4_5_2369369lx1dsm8k.R.iget(4122)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4123)==0&false))) {{
                __CLR4_5_2369369lx1dsm8k.R.inc(4124);first = i + 1;
            }

            // Found digit string
            }__CLR4_5_2369369lx1dsm8k.R.inc(4125);if ((((i - first == IMEI_LENGTH - 1)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4126)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4127)==0&false))) {{
                __CLR4_5_2369369lx1dsm8k.R.inc(4128);imei = buf.toString(first, IMEI_LENGTH, Charset.defaultCharset());
                __CLR4_5_2369369lx1dsm8k.R.inc(4129);break;
            }
        }}

        // Write log
        }__CLR4_5_2369369lx1dsm8k.R.inc(4130);if ((((imei == null)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4131)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4132)==0&false))) {{
            __CLR4_5_2369369lx1dsm8k.R.inc(4133);Log.warning("Enfora decoder failed to find IMEI");
            __CLR4_5_2369369lx1dsm8k.R.inc(4134);return null;
        }

        // Find GPSMC string
        }__CLR4_5_2369369lx1dsm8k.R.inc(4135);Integer start = ChannelBufferTools.find(buf, 0, buf.readableBytes(), "GPRMC");
        __CLR4_5_2369369lx1dsm8k.R.inc(4136);if ((((start == null)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4137)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4138)==0&false))) {{
            // Message does not contain GPS data
            __CLR4_5_2369369lx1dsm8k.R.inc(4139);return null;
        }
        }__CLR4_5_2369369lx1dsm8k.R.inc(4140);String sentence = buf.toString(start, buf.readableBytes() - start, Charset.defaultCharset());

        // Parse message
        __CLR4_5_2369369lx1dsm8k.R.inc(4141);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_2369369lx1dsm8k.R.inc(4142);if ((((!parser.matches())&&(__CLR4_5_2369369lx1dsm8k.R.iget(4143)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4144)==0&false))) {{
            __CLR4_5_2369369lx1dsm8k.R.inc(4145);return null;
        }

        // Create new position
        }__CLR4_5_2369369lx1dsm8k.R.inc(4146);Position position = new Position();
        __CLR4_5_2369369lx1dsm8k.R.inc(4147);position.setProtocol(getProtocolName());
        __CLR4_5_2369369lx1dsm8k.R.inc(4148);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_2369369lx1dsm8k.R.inc(4149);if ((((!identify(imei, channel))&&(__CLR4_5_2369369lx1dsm8k.R.iget(4150)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4151)==0&false))) {{
            __CLR4_5_2369369lx1dsm8k.R.inc(4152);return null;
        }
        }__CLR4_5_2369369lx1dsm8k.R.inc(4153);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_2369369lx1dsm8k.R.inc(4154);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2369369lx1dsm8k.R.inc(4155);time.clear();
        __CLR4_5_2369369lx1dsm8k.R.inc(4156);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2369369lx1dsm8k.R.inc(4157);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2369369lx1dsm8k.R.inc(4158);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2369369lx1dsm8k.R.inc(4159);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)) * 10);

        // Validity
        __CLR4_5_2369369lx1dsm8k.R.inc(4160);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_2369369lx1dsm8k.R.inc(4161);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2369369lx1dsm8k.R.inc(4162);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2369369lx1dsm8k.R.inc(4163);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4164)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4165)==0&false))) {__CLR4_5_2369369lx1dsm8k.R.inc(4166);latitude = -latitude;
        }__CLR4_5_2369369lx1dsm8k.R.inc(4167);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2369369lx1dsm8k.R.inc(4168);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2369369lx1dsm8k.R.inc(4169);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2369369lx1dsm8k.R.inc(4170);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4171)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4172)==0&false))) {__CLR4_5_2369369lx1dsm8k.R.inc(4173);longitude = -longitude;
        }__CLR4_5_2369369lx1dsm8k.R.inc(4174);position.setLongitude(longitude);

        // Speed
        __CLR4_5_2369369lx1dsm8k.R.inc(4175);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_2369369lx1dsm8k.R.inc(4176);String course = parser.group(index++);
        __CLR4_5_2369369lx1dsm8k.R.inc(4177);if ((((course != null)&&(__CLR4_5_2369369lx1dsm8k.R.iget(4178)!=0|true))||(__CLR4_5_2369369lx1dsm8k.R.iget(4179)==0&false))) {{
            __CLR4_5_2369369lx1dsm8k.R.inc(4180);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_2369369lx1dsm8k.R.inc(4181);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2369369lx1dsm8k.R.inc(4182);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2369369lx1dsm8k.R.inc(4183);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2369369lx1dsm8k.R.inc(4184);position.setTime(time.getTime());
        __CLR4_5_2369369lx1dsm8k.R.inc(4185);return position;
    }finally{__CLR4_5_2369369lx1dsm8k.R.flushNeeded();}}

}
