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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class IntellitracProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24cv4cvlx1do9vz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,5697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IntellitracProtocolDecoder(IntellitracProtocol protocol) {
        super(protocol);__CLR4_5_24cv4cvlx1do9vz.R.inc(5648);try{__CLR4_5_24cv4cvlx1do9vz.R.inc(5647);
    }finally{__CLR4_5_24cv4cvlx1do9vz.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(?:.+,)?(\\d+)," +            // Device Identifier
            "(\\d{4})(\\d{2})(\\d{2})" +   // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "(-?\\d+\\.\\d+)," +           // Longitude
            "(-?\\d+\\.\\d+)," +           // Latitude
            "(\\d+\\.?\\d*)," +            // Speed
            "(\\d+\\.?\\d*)," +            // Course
            "(-?\\d+\\.?\\d*)," +          // Altitude
            "(\\d+)," +                    // Satellites
            "(\\d+)," +                    // Report Identifier
            "(\\d+)," +                    // Input
            "(\\d+),?" +                   // Output
            "(\\d+\\.\\d+)?,?" +           // ADC1
            "(\\d+\\.\\d+)?,?" +           // ADC2
            "(?:\\d{14},\\d+," +
            "(\\d+)," +                    // VSS
            "(\\d+)," +                    // RPM
            "(-?\\d+)," +                  // Coolant
            "(\\d+)," +                    // Fuel
            "(\\d+)," +                    // Fuel Consumption
            "(-?\\d+)," +                  // Fuel Temperature
            "(\\d+)," +                    // Charger Pressure
            "(\\d+)," +                    // TPL
            "(\\d+)," +                    // Axle Weight
            "(\\d+))?" +                   // Odometer
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24cv4cvlx1do9vz.R.inc(5649);

        __CLR4_5_24cv4cvlx1do9vz.R.inc(5650);String sentence = (String) msg;
        
        // Parse message
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5651);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5652);if ((((!parser.matches())&&(__CLR4_5_24cv4cvlx1do9vz.R.iget(5653)!=0|true))||(__CLR4_5_24cv4cvlx1do9vz.R.iget(5654)==0&false))) {{
            __CLR4_5_24cv4cvlx1do9vz.R.inc(5655);return null;
        }

        // Create new position
        }__CLR4_5_24cv4cvlx1do9vz.R.inc(5656);Position position = new Position();
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5657);position.setProtocol(getProtocolName());
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5658);Integer index = 1;

        // Detect device
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5659);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24cv4cvlx1do9vz.R.iget(5660)!=0|true))||(__CLR4_5_24cv4cvlx1do9vz.R.iget(5661)==0&false))) {{
            __CLR4_5_24cv4cvlx1do9vz.R.inc(5662);return null;
        }
        }__CLR4_5_24cv4cvlx1do9vz.R.inc(5663);position.setDeviceId(getDeviceId());
        
        // Date and time
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5664);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5665);time.clear();
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5666);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5667);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5668);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5669);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5670);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5671);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5672);position.setTime(time.getTime());
        
        // Location data
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5673);position.setLongitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5674);position.setLatitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5675);position.setSpeed(Double.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5676);position.setCourse(Double.valueOf(parser.group(index++)));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5677);position.setAltitude(Double.valueOf(parser.group(index++)));
        
        // Satellites
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5678);int satellites = Integer.valueOf(parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5679);position.setValid(satellites >= 3);
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5680);position.set(Event.KEY_SATELLITES, satellites);
        
        // Report identifier
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5681);position.set(Event.KEY_INDEX, Long.valueOf(parser.group(index++)));

        // Input
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5682);position.set(Event.KEY_INPUT, parser.group(index++));

        // Output
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5683);position.set(Event.KEY_OUTPUT, parser.group(index++));

        // ADC
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5684);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5685);position.set(Event.PREFIX_ADC + 2, parser.group(index++));

        // J1939 data
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5686);position.set("vss", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5687);position.set("rpm", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5688);position.set("coolant", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5689);position.set(Event.KEY_FUEL, parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5690);position.set("consumption", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5691);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5692);position.set(Event.KEY_CHARGE, parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5693);position.set("tpl", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5694);position.set("axle", parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5695);position.set(Event.KEY_ODOMETER, parser.group(index++));
        __CLR4_5_24cv4cvlx1do9vz.R.inc(5696);return position;
    }finally{__CLR4_5_24cv4cvlx1do9vz.R.flushNeeded();}}

}
