/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
 *                Rohit
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

public class CarTrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22sb2sblx1dp6t9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,3676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CarTrackProtocolDecoder(CarTrackProtocol protocol) {
        super(protocol);__CLR4_5_22sb2sblx1dp6t9.R.inc(3612);try{__CLR4_5_22sb2sblx1dp6t9.R.inc(3611);
    }finally{__CLR4_5_22sb2sblx1dp6t9.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$\\$" +                                      // Header
            "(\\d+)\\?*" +                                  // Device ID
            "\\&A" +
            "(\\d{4})" +                                    // Command - 2
            "\\&B" +
            "(\\d{2})(\\d{2})(\\d{2})\\.(\\d{3})," +        // HHMMSS.DDD
            "([AV])," +                                     // STATUS : A= Valid, V = Invalid
            "(\\d{2})(\\d{2}\\.\\d{4})," +                  // Lat : XXMM.DDDDD
            "([NS])," +                                     // N/S
            "(\\d{3})(\\d{2}\\.\\d{4})," +                  // Long : YYYMM.DDDD
            "([EW])," +                                     // E/W
            "(\\d+.\\d*)?," +                               // Speed in Knots
            "(\\d+.\\d*)?," +                               // Heading
            "(\\d{2})(\\d{2})(\\d{2})" +                    // DDMMYY
            ".*" +
            "\\&C(.*)" +                                    // IO Port Data
            "\\&D(.*)" +                                    // Mile Meter Data
            "\\&E(.*)" +                                    // Alarm Data
            "(?:\\&Y)?(.*)");                               // AD Input Data

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22sb2sblx1dp6t9.R.inc(3613);

        __CLR4_5_22sb2sblx1dp6t9.R.inc(3614);String sentence = (String) msg;
        
        // Parse message
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3615);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3616);if ((((!parser.matches())&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3617)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3618)==0&false))) {{
            __CLR4_5_22sb2sblx1dp6t9.R.inc(3619);return null;
        }

        // Create new position
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3620);Position position = new Position();
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3621);position.setProtocol(getProtocolName());
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3622);Integer index = 1;

        // Get device by unique identifier
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3623);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3624)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3625)==0&false))) {{
            __CLR4_5_22sb2sblx1dp6t9.R.inc(3626);return null;
        }
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3627);position.setDeviceId(getDeviceId());

        // Command
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3628);position.set("command", parser.group(index++));

        // Time
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3629);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3630);time.clear();
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3631);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3632);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3633);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3634);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)));
        
        // Validity
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3635);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3636);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3637);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3638);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3639)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3640)==0&false))) {__CLR4_5_22sb2sblx1dp6t9.R.inc(3641);latitude = -latitude;
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3642);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3643);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3644);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3645);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3646)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3647)==0&false))) {__CLR4_5_22sb2sblx1dp6t9.R.inc(3648);longitude = -longitude;
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3649);position.setLongitude(longitude);

        // Speed
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3650);String speed = parser.group(index++);
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3651);if ((((speed != null)&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3652)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3653)==0&false))) {{
            __CLR4_5_22sb2sblx1dp6t9.R.inc(3654);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3655);String course = parser.group(index++);
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3656);if ((((course != null)&&(__CLR4_5_22sb2sblx1dp6t9.R.iget(3657)!=0|true))||(__CLR4_5_22sb2sblx1dp6t9.R.iget(3658)==0&false))) {{
            __CLR4_5_22sb2sblx1dp6t9.R.inc(3659);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_22sb2sblx1dp6t9.R.inc(3660);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3661);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3662);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3663);position.setTime(time.getTime());
        
        // State
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3664);position.set(Event.PREFIX_IO + 1, parser.group(index++));

        // Odometer
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3665);String odometer = parser.group(index++);
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3666);odometer = odometer.replace(":", "A");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3667);odometer = odometer.replace(";", "B");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3668);odometer = odometer.replace("<", "C");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3669);odometer = odometer.replace("=", "D");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3670);odometer = odometer.replace(">", "E");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3671);odometer = odometer.replace("?", "F");
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3672);position.set(Event.KEY_ODOMETER, Integer.parseInt(odometer, 16));

        __CLR4_5_22sb2sblx1dp6t9.R.inc(3673);position.set(Event.KEY_ALARM, parser.group(index++));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3674);position.set("ad", parser.group(index++));
        __CLR4_5_22sb2sblx1dp6t9.R.inc(3675);return position;
    }finally{__CLR4_5_22sb2sblx1dp6t9.R.flushNeeded();}}

}
