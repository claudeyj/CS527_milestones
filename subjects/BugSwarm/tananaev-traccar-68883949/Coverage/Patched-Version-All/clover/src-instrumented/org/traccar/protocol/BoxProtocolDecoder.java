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

public class BoxProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22ms2mslx1dslsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,3454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BoxProtocolDecoder(BoxProtocol protocol) {
        super(protocol);__CLR4_5_22ms2mslx1dslsk.R.inc(3413);try{__CLR4_5_22ms2mslx1dslsk.R.inc(3412);
    }finally{__CLR4_5_22ms2mslx1dslsk.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "L," +
            "(\\d{2})(\\d{2})(\\d{2})" +  // Date
            "(\\d{2})(\\d{2})(\\d{2})," + // Time
            "G," +
            "(-?\\d+\\.\\d+)," +          // Latitude
            "(-?\\d+\\.\\d+)," +          // Longitude
            "(\\d+\\.?\\d*)," +           // Speed
            "(\\d+\\.?\\d*)," +           // Course
            "(\\d+)," +                   // Distance
            "(\\d+)," +                   // Event
            "(\\d+)" +                    // Status
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22ms2mslx1dslsk.R.inc(3414);

        __CLR4_5_22ms2mslx1dslsk.R.inc(3415);String sentence = (String) msg;
        
        __CLR4_5_22ms2mslx1dslsk.R.inc(3416);if ((((sentence.startsWith("H,"))&&(__CLR4_5_22ms2mslx1dslsk.R.iget(3417)!=0|true))||(__CLR4_5_22ms2mslx1dslsk.R.iget(3418)==0&false))) {{
            
            __CLR4_5_22ms2mslx1dslsk.R.inc(3419);int index = sentence.indexOf(',', 2) + 1;
            __CLR4_5_22ms2mslx1dslsk.R.inc(3420);String id = sentence.substring(index, sentence.indexOf(',', index));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3421);identify(id, channel);
        }
        
        }else {__CLR4_5_22ms2mslx1dslsk.R.inc(3422);if ((((sentence.startsWith("L,"))&&(__CLR4_5_22ms2mslx1dslsk.R.iget(3423)!=0|true))||(__CLR4_5_22ms2mslx1dslsk.R.iget(3424)==0&false))) {{

            // Parse message
            __CLR4_5_22ms2mslx1dslsk.R.inc(3425);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_22ms2mslx1dslsk.R.inc(3426);if ((((!parser.matches())&&(__CLR4_5_22ms2mslx1dslsk.R.iget(3427)!=0|true))||(__CLR4_5_22ms2mslx1dslsk.R.iget(3428)==0&false))) {{
                __CLR4_5_22ms2mslx1dslsk.R.inc(3429);return null;
            }

            // Create new position
            }__CLR4_5_22ms2mslx1dslsk.R.inc(3430);Position position = new Position();
            __CLR4_5_22ms2mslx1dslsk.R.inc(3431);position.setDeviceId(getDeviceId());
            __CLR4_5_22ms2mslx1dslsk.R.inc(3432);position.setProtocol(getProtocolName());

            __CLR4_5_22ms2mslx1dslsk.R.inc(3433);Integer index = 1;

            // Time
            __CLR4_5_22ms2mslx1dslsk.R.inc(3434);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3435);time.clear();
            __CLR4_5_22ms2mslx1dslsk.R.inc(3436);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3437);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_22ms2mslx1dslsk.R.inc(3438);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3439);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3440);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3441);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3442);position.setTime(time.getTime());

            // Location
            __CLR4_5_22ms2mslx1dslsk.R.inc(3443);position.setLatitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3444);position.setLongitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3445);position.setSpeed(Double.valueOf(parser.group(index++)));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3446);position.setCourse(Double.valueOf(parser.group(index++)));
            
            // Distance
            __CLR4_5_22ms2mslx1dslsk.R.inc(3447);position.set(Event.KEY_ODOMETER, parser.group(index++));
            
            // Event
            __CLR4_5_22ms2mslx1dslsk.R.inc(3448);position.set(Event.KEY_EVENT, parser.group(index++));
            
            // Status
            __CLR4_5_22ms2mslx1dslsk.R.inc(3449);int status = Integer.valueOf(parser.group(index++));
            __CLR4_5_22ms2mslx1dslsk.R.inc(3450);position.setValid((status & 0x04) == 0);
            __CLR4_5_22ms2mslx1dslsk.R.inc(3451);position.set(Event.KEY_STATUS, status);
            __CLR4_5_22ms2mslx1dslsk.R.inc(3452);return position;
        }
        
        }}__CLR4_5_22ms2mslx1dslsk.R.inc(3453);return null;
    }finally{__CLR4_5_22ms2mslx1dslsk.R.flushNeeded();}}

}
