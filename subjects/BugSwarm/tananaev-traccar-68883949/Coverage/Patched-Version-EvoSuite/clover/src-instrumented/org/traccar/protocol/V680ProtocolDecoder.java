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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class V680ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27xu7xulx1doazr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,10367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public V680ProtocolDecoder(V680Protocol protocol) {
        super(protocol);__CLR4_5_27xu7xulx1doazr.R.inc(10291);try{__CLR4_5_27xu7xulx1doazr.R.inc(10290);
    }finally{__CLR4_5_27xu7xulx1doazr.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(?:#(\\d+)#" +                // IMEI
            "([^#]*)#)?" +                 // User
            "(\\d+)#" +                    // Fix
            "([^#]+)#" +                   // Password
            "([^#]+)#" +                   // Event
            "(\\d+)#" +                    // Packet number
            "([^#]+)?#?" +                 // GSM base station
            "(?:[^#]+#)?" +
            "(\\d+)?(\\d{2}\\.\\d+)," +    // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+)?(\\d{2}\\.\\d+)," +    // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+\\.\\d+)," +             // Speed
            "(\\d+\\.?\\d*)?#" +           // Course
            "(\\d{2})(\\d{2})(\\d{2})#" +  // Date (DDMMYY)
            "(\\d{2})(\\d{2})(\\d{2})" +   // Time (HHMMSS)
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_27xu7xulx1doazr.R.inc(10292);

        __CLR4_5_27xu7xulx1doazr.R.inc(10293);String sentence = (String) msg;
        __CLR4_5_27xu7xulx1doazr.R.inc(10294);sentence = sentence.trim();
       
        // Detect device ID
        __CLR4_5_27xu7xulx1doazr.R.inc(10295);if ((((sentence.length() == 16)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10296)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10297)==0&false))) {{
            __CLR4_5_27xu7xulx1doazr.R.inc(10298);String imei = sentence.substring(1, sentence.length());
            __CLR4_5_27xu7xulx1doazr.R.inc(10299);identify(imei, channel);
        } }else {{

            // Parse message
            __CLR4_5_27xu7xulx1doazr.R.inc(10300);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_27xu7xulx1doazr.R.inc(10301);if ((((!parser.matches())&&(__CLR4_5_27xu7xulx1doazr.R.iget(10302)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10303)==0&false))) {{
                __CLR4_5_27xu7xulx1doazr.R.inc(10304);return null;
            }

            // Create new position
            }__CLR4_5_27xu7xulx1doazr.R.inc(10305);Position position = new Position();
            __CLR4_5_27xu7xulx1doazr.R.inc(10306);position.setProtocol(getProtocolName());
            __CLR4_5_27xu7xulx1doazr.R.inc(10307);Integer index = 1;

            // Get device by IMEI
            __CLR4_5_27xu7xulx1doazr.R.inc(10308);String imei = parser.group(index++);
            __CLR4_5_27xu7xulx1doazr.R.inc(10309);if ((((imei != null)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10310)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10311)==0&false))) {{
                __CLR4_5_27xu7xulx1doazr.R.inc(10312);identify(imei, channel);
            }
            }__CLR4_5_27xu7xulx1doazr.R.inc(10313);if ((((!hasDeviceId())&&(__CLR4_5_27xu7xulx1doazr.R.iget(10314)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10315)==0&false))) {{
                __CLR4_5_27xu7xulx1doazr.R.inc(10316);return null;
            }
            }__CLR4_5_27xu7xulx1doazr.R.inc(10317);position.setDeviceId(getDeviceId());

            // User
            __CLR4_5_27xu7xulx1doazr.R.inc(10318);position.set("user", parser.group(index++));

            // Validity
            __CLR4_5_27xu7xulx1doazr.R.inc(10319);position.setValid(Integer.valueOf(parser.group(index++)) > 0);

            // Password
            __CLR4_5_27xu7xulx1doazr.R.inc(10320);position.set("password", parser.group(index++));

            // Event
            __CLR4_5_27xu7xulx1doazr.R.inc(10321);position.set(Event.KEY_EVENT, parser.group(index++));

            // Packet number
            __CLR4_5_27xu7xulx1doazr.R.inc(10322);position.set("packet", parser.group(index++));

            // GSM base station
            __CLR4_5_27xu7xulx1doazr.R.inc(10323);position.set(Event.KEY_GSM, parser.group(index++));

            // Longitude
            __CLR4_5_27xu7xulx1doazr.R.inc(10324);String lon = parser.group(index++);
            __CLR4_5_27xu7xulx1doazr.R.inc(10325);Double longitude = ((((lon != null) )&&(__CLR4_5_27xu7xulx1doazr.R.iget(10326)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10327)==0&false))? Double.valueOf(lon) : 0.0;
            __CLR4_5_27xu7xulx1doazr.R.inc(10328);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27xu7xulx1doazr.R.inc(10329);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10330)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10331)==0&false))) {__CLR4_5_27xu7xulx1doazr.R.inc(10332);longitude = -longitude;
            }__CLR4_5_27xu7xulx1doazr.R.inc(10333);position.setLongitude(longitude);

            // Latitude
            __CLR4_5_27xu7xulx1doazr.R.inc(10334);String lat = parser.group(index++);
            __CLR4_5_27xu7xulx1doazr.R.inc(10335);Double latitude = ((((lat != null) )&&(__CLR4_5_27xu7xulx1doazr.R.iget(10336)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10337)==0&false))? Double.valueOf(lat) : 0.0;
            __CLR4_5_27xu7xulx1doazr.R.inc(10338);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27xu7xulx1doazr.R.inc(10339);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10340)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10341)==0&false))) {__CLR4_5_27xu7xulx1doazr.R.inc(10342);latitude = -latitude;
            }__CLR4_5_27xu7xulx1doazr.R.inc(10343);position.setLatitude(latitude);

            // Speed and Course
            __CLR4_5_27xu7xulx1doazr.R.inc(10344);position.setSpeed(Double.valueOf(parser.group(index++)));
            __CLR4_5_27xu7xulx1doazr.R.inc(10345);String course = parser.group(index++);
            __CLR4_5_27xu7xulx1doazr.R.inc(10346);if ((((course != null)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10347)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10348)==0&false))) {{
                __CLR4_5_27xu7xulx1doazr.R.inc(10349);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_27xu7xulx1doazr.R.inc(10350);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27xu7xulx1doazr.R.inc(10351);time.clear();
            __CLR4_5_27xu7xulx1doazr.R.inc(10352);int day = Integer.valueOf(parser.group(index++));
            __CLR4_5_27xu7xulx1doazr.R.inc(10353);int month = Integer.valueOf(parser.group(index++));
            __CLR4_5_27xu7xulx1doazr.R.inc(10354);if ((((day == 0 && month == 0)&&(__CLR4_5_27xu7xulx1doazr.R.iget(10355)!=0|true))||(__CLR4_5_27xu7xulx1doazr.R.iget(10356)==0&false))) {{
                __CLR4_5_27xu7xulx1doazr.R.inc(10357);return null; // invalid date
            }
            }__CLR4_5_27xu7xulx1doazr.R.inc(10358);time.set(Calendar.DAY_OF_MONTH, day);
            __CLR4_5_27xu7xulx1doazr.R.inc(10359);time.set(Calendar.MONTH, month - 1);
            __CLR4_5_27xu7xulx1doazr.R.inc(10360);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));

            // Time
            __CLR4_5_27xu7xulx1doazr.R.inc(10361);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27xu7xulx1doazr.R.inc(10362);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27xu7xulx1doazr.R.inc(10363);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27xu7xulx1doazr.R.inc(10364);position.setTime(time.getTime());
            __CLR4_5_27xu7xulx1doazr.R.inc(10365);return position;
        }
        
        }__CLR4_5_27xu7xulx1doazr.R.inc(10366);return null;
    }finally{__CLR4_5_27xu7xulx1doazr.R.flushNeeded();}}

}
