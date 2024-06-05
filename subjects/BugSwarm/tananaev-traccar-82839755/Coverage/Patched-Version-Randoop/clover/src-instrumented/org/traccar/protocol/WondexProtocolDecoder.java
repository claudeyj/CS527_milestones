/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

public class WondexProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28q48q4lx1e772w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,11349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public WondexProtocolDecoder(WondexProtocol protocol) {
        super(protocol);__CLR4_5_28q48q4lx1e772w.R.inc(11309);try{__CLR4_5_28q48q4lx1e772w.R.inc(11308);
    }finally{__CLR4_5_28q48q4lx1e772w.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "[^\\d]*" +                    // Header
            "(\\d+)," +                    // Device Identifier
            "(\\d{4})(\\d{2})(\\d{2})" +   // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "(-?\\d+\\.\\d+)," +           // Longitude
            "(-?\\d+\\.\\d+)," +           // Latitude
            "(\\d+)," +                    // Speed
            "(\\d+)," +                    // Course
            "(-?\\d+\\.?\\d*)," +          // Altitude
            "(\\d+)," +                    // Satellites
            "(\\d+),?" +                   // Event
            "(?:(\\d+\\.\\d+)V,)?" +       // Battery
            "(\\d+\\.\\d+)?,?" +           // Odometer
            "(\\d+)?,?" +                  // Input
            "(\\d+\\.\\d+)?,?" +           // ADC1
            "(\\d+\\.\\d+)?,?" +           // ADC2
            "(\\d+)?.*");                  // Output

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28q48q4lx1e772w.R.inc(11310);

        // Parse message
        __CLR4_5_28q48q4lx1e772w.R.inc(11311);Matcher parser = pattern.matcher((String) msg);
        __CLR4_5_28q48q4lx1e772w.R.inc(11312);if ((((!parser.matches())&&(__CLR4_5_28q48q4lx1e772w.R.iget(11313)!=0|true))||(__CLR4_5_28q48q4lx1e772w.R.iget(11314)==0&false))) {{
            __CLR4_5_28q48q4lx1e772w.R.inc(11315);return null;
        }

        // Create new position
        }__CLR4_5_28q48q4lx1e772w.R.inc(11316);Position position = new Position();
        __CLR4_5_28q48q4lx1e772w.R.inc(11317);position.setProtocol(getProtocolName());
        __CLR4_5_28q48q4lx1e772w.R.inc(11318);int index = 1;

        // Device identifier
        __CLR4_5_28q48q4lx1e772w.R.inc(11319);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_28q48q4lx1e772w.R.iget(11320)!=0|true))||(__CLR4_5_28q48q4lx1e772w.R.iget(11321)==0&false))) {{
            __CLR4_5_28q48q4lx1e772w.R.inc(11322);return null;
        }
        }__CLR4_5_28q48q4lx1e772w.R.inc(11323);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_28q48q4lx1e772w.R.inc(11324);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28q48q4lx1e772w.R.inc(11325);time.clear();
        __CLR4_5_28q48q4lx1e772w.R.inc(11326);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11327);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28q48q4lx1e772w.R.inc(11328);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11329);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11330);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11331);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11332);position.setTime(time.getTime());

        // Position data
        __CLR4_5_28q48q4lx1e772w.R.inc(11333);position.setLongitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11334);position.setLatitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11335);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(parser.group(index++))));
        __CLR4_5_28q48q4lx1e772w.R.inc(11336);position.setCourse(Double.valueOf(parser.group(index++)));
        __CLR4_5_28q48q4lx1e772w.R.inc(11337);position.setAltitude(Double.valueOf(parser.group(index++)));

        // Satellites
        __CLR4_5_28q48q4lx1e772w.R.inc(11338);int satellites = Integer.valueOf(parser.group(index++));
        __CLR4_5_28q48q4lx1e772w.R.inc(11339);position.setValid(satellites >= 3);
        __CLR4_5_28q48q4lx1e772w.R.inc(11340);position.set(Event.KEY_SATELLITES, satellites);
        
        // Event
        __CLR4_5_28q48q4lx1e772w.R.inc(11341);position.set(Event.KEY_EVENT, parser.group(index++));
        
        // Battery
        __CLR4_5_28q48q4lx1e772w.R.inc(11342);position.set(Event.KEY_BATTERY, parser.group(index++));
        
        // Odometer
        __CLR4_5_28q48q4lx1e772w.R.inc(11343);position.set(Event.KEY_ODOMETER, parser.group(index++));
        
        // Input
        __CLR4_5_28q48q4lx1e772w.R.inc(11344);position.set(Event.KEY_INPUT, parser.group(index++));
        
        // ADC
        __CLR4_5_28q48q4lx1e772w.R.inc(11345);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
        __CLR4_5_28q48q4lx1e772w.R.inc(11346);position.set(Event.PREFIX_ADC + 2, parser.group(index++));
        
        // Output
        __CLR4_5_28q48q4lx1e772w.R.inc(11347);position.set(Event.KEY_OUTPUT, parser.group(index++));
        __CLR4_5_28q48q4lx1e772w.R.inc(11348);return position;
    }finally{__CLR4_5_28q48q4lx1e772w.R.flushNeeded();}}

}