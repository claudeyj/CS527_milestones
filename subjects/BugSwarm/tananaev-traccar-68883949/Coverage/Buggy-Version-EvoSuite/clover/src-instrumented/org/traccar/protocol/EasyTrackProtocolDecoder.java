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
import org.traccar.model.Event;
import org.traccar.model.Position;

public class EasyTrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_232r32rlx1dh368{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,4036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EasyTrackProtocolDecoder(EasyTrackProtocol protocol) {
        super(protocol);__CLR4_5_232r32rlx1dh368.R.inc(3988);try{__CLR4_5_232r32rlx1dh368.R.inc(3987);
    }finally{__CLR4_5_232r32rlx1dh368.R.flushNeeded();}}

    static private Pattern pattern = Pattern.compile(
            "\\*..," +                          // Manufacturer
            "(\\d+)," +                         // IMEI
            "([^,]{2})," +                      // Command
            "([AV])," +                         // Validity
            "(\\p{XDigit}{2})" +                // Year
            "(\\p{XDigit}{2})" +                // Month
            "(\\p{XDigit}{2})," +               // Day
            "(\\p{XDigit}{2})" +                // Hours
            "(\\p{XDigit}{2})" +                // Minutes
            "(\\p{XDigit}{2})," +               // Seconds
            "(\\p{XDigit})" +
            "(\\p{XDigit}{7})," +               // Latitude
            "(\\p{XDigit})" +
            "(\\p{XDigit}{7})," +               // Longitude
            "(\\p{XDigit}{4})," +               // Speed
            "(\\p{XDigit}{4})," +               // Course
            "(\\p{XDigit}{8})," +               // Status
            "(\\p{XDigit}+)," +                 // Signal
            "(\\d+)," +                         // Power
            "(\\p{XDigit}{4})," +               // Oil
            "(\\p{XDigit}+),?" +                // Odometer
            "(\\d+)?" +                         // Altitude
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_232r32rlx1dh368.R.inc(3989);

        __CLR4_5_232r32rlx1dh368.R.inc(3990);String sentence = (String) msg;

        // Parse message
        __CLR4_5_232r32rlx1dh368.R.inc(3991);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_232r32rlx1dh368.R.inc(3992);if ((((!parser.matches())&&(__CLR4_5_232r32rlx1dh368.R.iget(3993)!=0|true))||(__CLR4_5_232r32rlx1dh368.R.iget(3994)==0&false))) {{
            __CLR4_5_232r32rlx1dh368.R.inc(3995);return null;
        }

        // Create new position
        }__CLR4_5_232r32rlx1dh368.R.inc(3996);Position position = new Position();
        __CLR4_5_232r32rlx1dh368.R.inc(3997);position.setProtocol(getProtocolName());

        __CLR4_5_232r32rlx1dh368.R.inc(3998);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_232r32rlx1dh368.R.inc(3999);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_232r32rlx1dh368.R.iget(4000)!=0|true))||(__CLR4_5_232r32rlx1dh368.R.iget(4001)==0&false))) {{
            __CLR4_5_232r32rlx1dh368.R.inc(4002);return null;
        }
        }__CLR4_5_232r32rlx1dh368.R.inc(4003);position.setDeviceId(getDeviceId());

        // Command
        __CLR4_5_232r32rlx1dh368.R.inc(4004);position.set("command", parser.group(index++));

        // Validity
        __CLR4_5_232r32rlx1dh368.R.inc(4005);position.setValid(parser.group(index++).compareTo("A") == 0);
        
        // Date
        __CLR4_5_232r32rlx1dh368.R.inc(4006);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_232r32rlx1dh368.R.inc(4007);time.clear();
        __CLR4_5_232r32rlx1dh368.R.inc(4008);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_232r32rlx1dh368.R.inc(4009);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++), 16) - 1);
        __CLR4_5_232r32rlx1dh368.R.inc(4010);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_232r32rlx1dh368.R.inc(4011);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_232r32rlx1dh368.R.inc(4012);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_232r32rlx1dh368.R.inc(4013);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_232r32rlx1dh368.R.inc(4014);position.setTime(time.getTime());

        // Location
        __CLR4_5_232r32rlx1dh368.R.inc(4015);int hemisphere = (((parser.group(index++).equals("8") )&&(__CLR4_5_232r32rlx1dh368.R.iget(4016)!=0|true))||(__CLR4_5_232r32rlx1dh368.R.iget(4017)==0&false))? -1 : 1;
        __CLR4_5_232r32rlx1dh368.R.inc(4018);position.setLatitude(
                hemisphere * Integer.parseInt(parser.group(index++), 16) / 600000.0);

        __CLR4_5_232r32rlx1dh368.R.inc(4019);hemisphere = (((parser.group(index++).equals("8") )&&(__CLR4_5_232r32rlx1dh368.R.iget(4020)!=0|true))||(__CLR4_5_232r32rlx1dh368.R.iget(4021)==0&false))? -1 : 1;
        __CLR4_5_232r32rlx1dh368.R.inc(4022);position.setLongitude(
                hemisphere * Integer.parseInt(parser.group(index++), 16) / 600000.0);
        
        __CLR4_5_232r32rlx1dh368.R.inc(4023);position.setSpeed(Integer.parseInt(parser.group(index++), 16) / 100.0);
        __CLR4_5_232r32rlx1dh368.R.inc(4024);position.setCourse(Integer.parseInt(parser.group(index++), 16) / 100.0);

        // Status
        __CLR4_5_232r32rlx1dh368.R.inc(4025);position.set(Event.KEY_STATUS, parser.group(index++));

        // Signal
        __CLR4_5_232r32rlx1dh368.R.inc(4026);position.set("signal", parser.group(index++));

        // Power
        __CLR4_5_232r32rlx1dh368.R.inc(4027);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

        // Oil
        __CLR4_5_232r32rlx1dh368.R.inc(4028);position.set("oil", Integer.parseInt(parser.group(index++), 16));

        // Odometer
        __CLR4_5_232r32rlx1dh368.R.inc(4029);position.set(Event.KEY_ODOMETER, Integer.parseInt(parser.group(index++), 16));
        
        // Altitude
        __CLR4_5_232r32rlx1dh368.R.inc(4030);String altitude = parser.group(index++);
        __CLR4_5_232r32rlx1dh368.R.inc(4031);if ((((altitude != null)&&(__CLR4_5_232r32rlx1dh368.R.iget(4032)!=0|true))||(__CLR4_5_232r32rlx1dh368.R.iget(4033)==0&false))) {{
            __CLR4_5_232r32rlx1dh368.R.inc(4034);position.setAltitude(Double.valueOf(altitude));
        }
        }__CLR4_5_232r32rlx1dh368.R.inc(4035);return position;
    }finally{__CLR4_5_232r32rlx1dh368.R.flushNeeded();}}

}
