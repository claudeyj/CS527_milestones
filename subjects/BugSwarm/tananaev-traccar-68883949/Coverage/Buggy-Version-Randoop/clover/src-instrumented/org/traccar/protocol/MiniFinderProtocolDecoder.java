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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class MiniFinderProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_256x56xlx1di805{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,6770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MiniFinderProtocolDecoder(MiniFinderProtocol protocol) {
        super(protocol);__CLR4_5_256x56xlx1di805.R.inc(6730);try{__CLR4_5_256x56xlx1di805.R.inc(6729);
    }finally{__CLR4_5_256x56xlx1di805.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\!D," +
            "(\\d+)/(\\d+)/(\\d+)," +      // Date
            "(\\d+):(\\d+):(\\d+)," +      // Time
            "(-?\\d+\\.\\d+)," +           // Latitude
            "(-?\\d+\\.\\d+)," +           // Longitude
            "(\\d+\\.?\\d*)," +            // Speed
            "(\\d+\\.?\\d*)," +            // Course
            "(\\p{XDigit}+)," +            // Flags
            "(-?\\d+\\.\\d+)," +           // Altitude
            "(\\d+)," +                    // Battery
            "(\\d+)," +                    // Satellites in use
            "(\\d+)," +                    // Satellites in view
            "0");
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_256x56xlx1di805.R.inc(6731);

        __CLR4_5_256x56xlx1di805.R.inc(6732);String sentence = (String) msg;

        // Identification
        __CLR4_5_256x56xlx1di805.R.inc(6733);if ((((sentence.startsWith("!1"))&&(__CLR4_5_256x56xlx1di805.R.iget(6734)!=0|true))||(__CLR4_5_256x56xlx1di805.R.iget(6735)==0&false))) {{
            __CLR4_5_256x56xlx1di805.R.inc(6736);identify(sentence.substring(3, sentence.length()), channel);
        }

        // Location
        }else {__CLR4_5_256x56xlx1di805.R.inc(6737);if ((((sentence.startsWith("!D") && hasDeviceId())&&(__CLR4_5_256x56xlx1di805.R.iget(6738)!=0|true))||(__CLR4_5_256x56xlx1di805.R.iget(6739)==0&false))) {{

            // Parse message
            __CLR4_5_256x56xlx1di805.R.inc(6740);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_256x56xlx1di805.R.inc(6741);if ((((!parser.matches())&&(__CLR4_5_256x56xlx1di805.R.iget(6742)!=0|true))||(__CLR4_5_256x56xlx1di805.R.iget(6743)==0&false))) {{
                __CLR4_5_256x56xlx1di805.R.inc(6744);return null;
            }

            // Create new position
            }__CLR4_5_256x56xlx1di805.R.inc(6745);Position position = new Position();
            __CLR4_5_256x56xlx1di805.R.inc(6746);position.setProtocol(getProtocolName());
            __CLR4_5_256x56xlx1di805.R.inc(6747);position.setDeviceId(getDeviceId());

            __CLR4_5_256x56xlx1di805.R.inc(6748);Integer index = 1;

            // Time
            __CLR4_5_256x56xlx1di805.R.inc(6749);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_256x56xlx1di805.R.inc(6750);time.clear();
            __CLR4_5_256x56xlx1di805.R.inc(6751);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6752);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_256x56xlx1di805.R.inc(6753);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6754);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6755);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6756);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6757);position.setTime(time.getTime());

            // Location
            __CLR4_5_256x56xlx1di805.R.inc(6758);position.setLatitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6759);position.setLongitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6760);position.setSpeed(Double.valueOf(parser.group(index++)));
            __CLR4_5_256x56xlx1di805.R.inc(6761);position.setCourse(Double.valueOf(parser.group(index++)));
            
            // Flags
            __CLR4_5_256x56xlx1di805.R.inc(6762);String flags = parser.group(index++);
            __CLR4_5_256x56xlx1di805.R.inc(6763);position.set(Event.KEY_FLAGS, flags);
            __CLR4_5_256x56xlx1di805.R.inc(6764);position.setValid((Integer.parseInt(flags, 16) & 0x01) != 0);

            // Altitude
            __CLR4_5_256x56xlx1di805.R.inc(6765);position.setAltitude(Double.valueOf(parser.group(index++)));

            // Battery
            __CLR4_5_256x56xlx1di805.R.inc(6766);position.set(Event.KEY_BATTERY, parser.group(index++));

            // Satellites
            __CLR4_5_256x56xlx1di805.R.inc(6767);position.set(Event.KEY_SATELLITES, parser.group(index++));
            __CLR4_5_256x56xlx1di805.R.inc(6768);return position;
        }

        }}__CLR4_5_256x56xlx1di805.R.inc(6769);return null;
    }finally{__CLR4_5_256x56xlx1di805.R.flushNeeded();}}

}
