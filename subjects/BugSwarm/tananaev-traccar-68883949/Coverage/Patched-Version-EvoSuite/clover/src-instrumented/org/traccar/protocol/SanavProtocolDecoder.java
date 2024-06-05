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

public class SanavProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26hn6hnlx1doamd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,8460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SanavProtocolDecoder(SanavProtocol protocol) {
        super(protocol);__CLR4_5_26hn6hnlx1doamd.R.inc(8412);try{__CLR4_5_26hn6hnlx1doamd.R.inc(8411);
    }finally{__CLR4_5_26hn6hnlx1doamd.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            ".*imei[:=]" +
            "(\\d+)" +                          // IMEI
            "&?rmc[:=]\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2}).(\\d+)," + // Time (HHMMSS.SSS)
            "([AV])," +                         // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)," +                  // Speed
            "(\\d+\\.\\d+)?," +                 // Course
            "(\\d{2})(\\d{2})(\\d{2})," +       // Date (DDMMYY)
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26hn6hnlx1doamd.R.inc(8413);

        // Parse message
        __CLR4_5_26hn6hnlx1doamd.R.inc(8414);String sentence = (String) msg;
        __CLR4_5_26hn6hnlx1doamd.R.inc(8415);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_26hn6hnlx1doamd.R.inc(8416);if ((((!parser.matches())&&(__CLR4_5_26hn6hnlx1doamd.R.iget(8417)!=0|true))||(__CLR4_5_26hn6hnlx1doamd.R.iget(8418)==0&false))) {{
            __CLR4_5_26hn6hnlx1doamd.R.inc(8419);return null;
        }

        // Create new position
        }__CLR4_5_26hn6hnlx1doamd.R.inc(8420);Position position = new Position();
        __CLR4_5_26hn6hnlx1doamd.R.inc(8421);position.setProtocol(getProtocolName());
        __CLR4_5_26hn6hnlx1doamd.R.inc(8422);Integer index = 1;

        // Identification
        __CLR4_5_26hn6hnlx1doamd.R.inc(8423);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_26hn6hnlx1doamd.R.iget(8424)!=0|true))||(__CLR4_5_26hn6hnlx1doamd.R.iget(8425)==0&false))) {{
            __CLR4_5_26hn6hnlx1doamd.R.inc(8426);return null;
        }
        }__CLR4_5_26hn6hnlx1doamd.R.inc(8427);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_26hn6hnlx1doamd.R.inc(8428);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8429);time.clear();
        __CLR4_5_26hn6hnlx1doamd.R.inc(8430);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8431);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8432);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8433);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_26hn6hnlx1doamd.R.inc(8434);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_26hn6hnlx1doamd.R.inc(8435);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8436);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26hn6hnlx1doamd.R.inc(8437);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26hn6hnlx1doamd.R.iget(8438)!=0|true))||(__CLR4_5_26hn6hnlx1doamd.R.iget(8439)==0&false))) {__CLR4_5_26hn6hnlx1doamd.R.inc(8440);latitude = -latitude;
        }__CLR4_5_26hn6hnlx1doamd.R.inc(8441);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_26hn6hnlx1doamd.R.inc(8442);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8443);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_26hn6hnlx1doamd.R.inc(8444);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26hn6hnlx1doamd.R.iget(8445)!=0|true))||(__CLR4_5_26hn6hnlx1doamd.R.iget(8446)==0&false))) {__CLR4_5_26hn6hnlx1doamd.R.inc(8447);longitude = -longitude;
        }__CLR4_5_26hn6hnlx1doamd.R.inc(8448);position.setLongitude(longitude);

        // Speed
        __CLR4_5_26hn6hnlx1doamd.R.inc(8449);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_26hn6hnlx1doamd.R.inc(8450);String course = parser.group(index++);
        __CLR4_5_26hn6hnlx1doamd.R.inc(8451);if ((((course != null)&&(__CLR4_5_26hn6hnlx1doamd.R.iget(8452)!=0|true))||(__CLR4_5_26hn6hnlx1doamd.R.iget(8453)==0&false))) {{
            __CLR4_5_26hn6hnlx1doamd.R.inc(8454);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_26hn6hnlx1doamd.R.inc(8455);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8456);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_26hn6hnlx1doamd.R.inc(8457);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_26hn6hnlx1doamd.R.inc(8458);position.setTime(time.getTime());
        __CLR4_5_26hn6hnlx1doamd.R.inc(8459);return position;
    }finally{__CLR4_5_26hn6hnlx1doamd.R.flushNeeded();}}

}
