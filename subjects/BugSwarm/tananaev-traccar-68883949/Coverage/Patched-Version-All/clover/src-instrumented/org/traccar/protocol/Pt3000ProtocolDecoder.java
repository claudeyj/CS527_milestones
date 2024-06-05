/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

public class Pt3000ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2690690lx1dsnjn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,8152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Pt3000ProtocolDecoder(Pt3000Protocol protocol) {
        super(protocol);__CLR4_5_2690690lx1dsnjn.R.inc(8101);try{__CLR4_5_2690690lx1dsnjn.R.inc(8100);
    }finally{__CLR4_5_2690690lx1dsnjn.R.flushNeeded();}}

    static private Pattern pattern = Pattern.compile(
            "\\%(\\d+)," +                 // IMEI
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
            throws Exception {try{__CLR4_5_2690690lx1dsnjn.R.inc(8102);

        __CLR4_5_2690690lx1dsnjn.R.inc(8103);String sentence = (String) msg;

        // Parse message
        __CLR4_5_2690690lx1dsnjn.R.inc(8104);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_2690690lx1dsnjn.R.inc(8105);if ((((!parser.matches())&&(__CLR4_5_2690690lx1dsnjn.R.iget(8106)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8107)==0&false))) {{
            __CLR4_5_2690690lx1dsnjn.R.inc(8108);return null;
        }

        // Create new position
        }__CLR4_5_2690690lx1dsnjn.R.inc(8109);Position position = new Position();
        __CLR4_5_2690690lx1dsnjn.R.inc(8110);position.setProtocol(getProtocolName());

        __CLR4_5_2690690lx1dsnjn.R.inc(8111);Integer index = 1;

        // Identifier
        __CLR4_5_2690690lx1dsnjn.R.inc(8112);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_2690690lx1dsnjn.R.iget(8113)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8114)==0&false))) {{
            __CLR4_5_2690690lx1dsnjn.R.inc(8115);return null;
        }
        }__CLR4_5_2690690lx1dsnjn.R.inc(8116);position.setDeviceId(getDeviceId());
        
        // Time
        __CLR4_5_2690690lx1dsnjn.R.inc(8117);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_2690690lx1dsnjn.R.inc(8118);time.clear();
        __CLR4_5_2690690lx1dsnjn.R.inc(8119);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2690690lx1dsnjn.R.inc(8120);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2690690lx1dsnjn.R.inc(8121);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_2690690lx1dsnjn.R.inc(8122);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_2690690lx1dsnjn.R.inc(8123);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2690690lx1dsnjn.R.inc(8124);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2690690lx1dsnjn.R.inc(8125);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2690690lx1dsnjn.R.iget(8126)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8127)==0&false))) {__CLR4_5_2690690lx1dsnjn.R.inc(8128);latitude = -latitude;
        }__CLR4_5_2690690lx1dsnjn.R.inc(8129);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_2690690lx1dsnjn.R.inc(8130);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_2690690lx1dsnjn.R.inc(8131);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_2690690lx1dsnjn.R.inc(8132);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2690690lx1dsnjn.R.iget(8133)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8134)==0&false))) {__CLR4_5_2690690lx1dsnjn.R.inc(8135);longitude = -longitude;
        }__CLR4_5_2690690lx1dsnjn.R.inc(8136);position.setLongitude(longitude);

        // Speed
        __CLR4_5_2690690lx1dsnjn.R.inc(8137);String speed = parser.group(index++);
        __CLR4_5_2690690lx1dsnjn.R.inc(8138);if ((((speed != null)&&(__CLR4_5_2690690lx1dsnjn.R.iget(8139)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8140)==0&false))) {{
            __CLR4_5_2690690lx1dsnjn.R.inc(8141);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_2690690lx1dsnjn.R.inc(8142);String course = parser.group(index++);
        __CLR4_5_2690690lx1dsnjn.R.inc(8143);if ((((course != null)&&(__CLR4_5_2690690lx1dsnjn.R.iget(8144)!=0|true))||(__CLR4_5_2690690lx1dsnjn.R.iget(8145)==0&false))) {{
            __CLR4_5_2690690lx1dsnjn.R.inc(8146);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_2690690lx1dsnjn.R.inc(8147);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_2690690lx1dsnjn.R.inc(8148);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_2690690lx1dsnjn.R.inc(8149);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_2690690lx1dsnjn.R.inc(8150);position.setTime(time.getTime());
        __CLR4_5_2690690lx1dsnjn.R.inc(8151);return position;
    }finally{__CLR4_5_2690690lx1dsnjn.R.flushNeeded();}}

}
