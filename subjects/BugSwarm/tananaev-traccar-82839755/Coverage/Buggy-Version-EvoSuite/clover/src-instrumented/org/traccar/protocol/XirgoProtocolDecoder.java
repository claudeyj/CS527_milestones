/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class XirgoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28uo8uolx1e38kg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,11511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public XirgoProtocolDecoder(XirgoProtocol protocol) {
        super(protocol);__CLR4_5_28uo8uolx1e38kg.R.inc(11473);try{__CLR4_5_28uo8uolx1e38kg.R.inc(11472);
    }finally{__CLR4_5_28uo8uolx1e38kg.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$\\$" +
            "(\\d+)," +                         // IMEI
            "(\\d+)," +                         // Event
            "(\\d{4})/(\\d{2})/(\\d{2})," +     // Date
            "(\\d{2}):(\\d{2}):(\\d{2})," +     // Time
            "(-?\\d+\\.?\\d*)," +               // Latitude
            "(-?\\d+\\.?\\d*)," +               // Longitude
            "(-?\\d+\\.?\\d*)," +               // Altitude
            "(\\d+\\.?\\d*)," +                 // Speed
            "(\\d+\\.?\\d*)," +                 // Course
            "(\\d+)," +                         // Satellites
            "(\\d+\\.?\\d*)," +                 // HDOP
            "(\\d+\\.\\d+)," +                  // Battery
            "(\\d+)," +                         // GSM
            "(\\d+\\.?\\d*)," +                 // Odometer
            "(\\d+)," +                         // GPS
            ".*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28uo8uolx1e38kg.R.inc(11474);

        __CLR4_5_28uo8uolx1e38kg.R.inc(11475);String sentence = (String) msg;

        // Parse message
        __CLR4_5_28uo8uolx1e38kg.R.inc(11476);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_28uo8uolx1e38kg.R.inc(11477);if ((((!parser.matches())&&(__CLR4_5_28uo8uolx1e38kg.R.iget(11478)!=0|true))||(__CLR4_5_28uo8uolx1e38kg.R.iget(11479)==0&false))) {{
            __CLR4_5_28uo8uolx1e38kg.R.inc(11480);return null;
        }

        // Create new position
        }__CLR4_5_28uo8uolx1e38kg.R.inc(11481);Position position = new Position();
        __CLR4_5_28uo8uolx1e38kg.R.inc(11482);position.setProtocol(getProtocolName());

        __CLR4_5_28uo8uolx1e38kg.R.inc(11483);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_28uo8uolx1e38kg.R.inc(11484);if ((((!identify(parser.group(index++), channel, remoteAddress))&&(__CLR4_5_28uo8uolx1e38kg.R.iget(11485)!=0|true))||(__CLR4_5_28uo8uolx1e38kg.R.iget(11486)==0&false))) {{
            __CLR4_5_28uo8uolx1e38kg.R.inc(11487);return null;
        }
        }__CLR4_5_28uo8uolx1e38kg.R.inc(11488);position.setDeviceId(getDeviceId());

        __CLR4_5_28uo8uolx1e38kg.R.inc(11489);position.set(Event.KEY_EVENT, parser.group(index++));
        
        // Date
        __CLR4_5_28uo8uolx1e38kg.R.inc(11490);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11491);time.clear();
        __CLR4_5_28uo8uolx1e38kg.R.inc(11492);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11493);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28uo8uolx1e38kg.R.inc(11494);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11495);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11496);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11497);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11498);position.setTime(time.getTime());

        // Location
        __CLR4_5_28uo8uolx1e38kg.R.inc(11499);position.setLatitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11500);position.setLongitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11501);position.setAltitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11502);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(parser.group(index++))));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11503);position.setCourse(Double.valueOf(parser.group(index++)));

        // Additional data
        __CLR4_5_28uo8uolx1e38kg.R.inc(11504);position.set(Event.KEY_SATELLITES, parser.group(index++));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11505);position.set(Event.KEY_HDOP, parser.group(index++));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11506);position.set(Event.KEY_BATTERY, parser.group(index++));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11507);position.set(Event.KEY_GSM, parser.group(index++));
        __CLR4_5_28uo8uolx1e38kg.R.inc(11508);position.set(Event.KEY_ODOMETER, parser.group(index++));
        
        // Validity
        __CLR4_5_28uo8uolx1e38kg.R.inc(11509);position.setValid(Integer.valueOf(parser.group(index++)) == 1);

        __CLR4_5_28uo8uolx1e38kg.R.inc(11510);return position;
    }finally{__CLR4_5_28uo8uolx1e38kg.R.flushNeeded();}}

}
