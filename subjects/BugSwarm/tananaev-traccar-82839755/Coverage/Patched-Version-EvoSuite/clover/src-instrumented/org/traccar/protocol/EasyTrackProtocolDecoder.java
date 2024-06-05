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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class EasyTrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_237w37wlx1e67h0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,4221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EasyTrackProtocolDecoder(EasyTrackProtocol protocol) {
        super(protocol);__CLR4_5_237w37wlx1e67h0.R.inc(4173);try{__CLR4_5_237w37wlx1e67h0.R.inc(4172);
    }finally{__CLR4_5_237w37wlx1e67h0.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
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
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_237w37wlx1e67h0.R.inc(4174);

        __CLR4_5_237w37wlx1e67h0.R.inc(4175);String sentence = (String) msg;

        // Parse message
        __CLR4_5_237w37wlx1e67h0.R.inc(4176);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_237w37wlx1e67h0.R.inc(4177);if ((((!parser.matches())&&(__CLR4_5_237w37wlx1e67h0.R.iget(4178)!=0|true))||(__CLR4_5_237w37wlx1e67h0.R.iget(4179)==0&false))) {{
            __CLR4_5_237w37wlx1e67h0.R.inc(4180);return null;
        }

        // Create new position
        }__CLR4_5_237w37wlx1e67h0.R.inc(4181);Position position = new Position();
        __CLR4_5_237w37wlx1e67h0.R.inc(4182);position.setProtocol(getProtocolName());

        __CLR4_5_237w37wlx1e67h0.R.inc(4183);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_237w37wlx1e67h0.R.inc(4184);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_237w37wlx1e67h0.R.iget(4185)!=0|true))||(__CLR4_5_237w37wlx1e67h0.R.iget(4186)==0&false))) {{
            __CLR4_5_237w37wlx1e67h0.R.inc(4187);return null;
        }
        }__CLR4_5_237w37wlx1e67h0.R.inc(4188);position.setDeviceId(getDeviceId());

        // Command
        __CLR4_5_237w37wlx1e67h0.R.inc(4189);position.set("command", parser.group(index++));

        // Validity
        __CLR4_5_237w37wlx1e67h0.R.inc(4190);position.setValid(parser.group(index++).compareTo("A") == 0);
        
        // Date
        __CLR4_5_237w37wlx1e67h0.R.inc(4191);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_237w37wlx1e67h0.R.inc(4192);time.clear();
        __CLR4_5_237w37wlx1e67h0.R.inc(4193);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_237w37wlx1e67h0.R.inc(4194);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++), 16) - 1);
        __CLR4_5_237w37wlx1e67h0.R.inc(4195);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_237w37wlx1e67h0.R.inc(4196);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_237w37wlx1e67h0.R.inc(4197);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_237w37wlx1e67h0.R.inc(4198);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++), 16));
        __CLR4_5_237w37wlx1e67h0.R.inc(4199);position.setTime(time.getTime());

        // Location
        __CLR4_5_237w37wlx1e67h0.R.inc(4200);int hemisphere = (((parser.group(index++).equals("8") )&&(__CLR4_5_237w37wlx1e67h0.R.iget(4201)!=0|true))||(__CLR4_5_237w37wlx1e67h0.R.iget(4202)==0&false))? -1 : 1;
        __CLR4_5_237w37wlx1e67h0.R.inc(4203);position.setLatitude(
                hemisphere * Integer.parseInt(parser.group(index++), 16) / 600000.0);

        __CLR4_5_237w37wlx1e67h0.R.inc(4204);hemisphere = (((parser.group(index++).equals("8") )&&(__CLR4_5_237w37wlx1e67h0.R.iget(4205)!=0|true))||(__CLR4_5_237w37wlx1e67h0.R.iget(4206)==0&false))? -1 : 1;
        __CLR4_5_237w37wlx1e67h0.R.inc(4207);position.setLongitude(
                hemisphere * Integer.parseInt(parser.group(index++), 16) / 600000.0);
        
        __CLR4_5_237w37wlx1e67h0.R.inc(4208);position.setSpeed(Integer.parseInt(parser.group(index++), 16) / 100.0);
        __CLR4_5_237w37wlx1e67h0.R.inc(4209);position.setCourse(Integer.parseInt(parser.group(index++), 16) / 100.0);

        // Status
        __CLR4_5_237w37wlx1e67h0.R.inc(4210);position.set(Event.KEY_STATUS, parser.group(index++));

        // Signal
        __CLR4_5_237w37wlx1e67h0.R.inc(4211);position.set("signal", parser.group(index++));

        // Power
        __CLR4_5_237w37wlx1e67h0.R.inc(4212);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

        // Oil
        __CLR4_5_237w37wlx1e67h0.R.inc(4213);position.set("oil", Integer.parseInt(parser.group(index++), 16));

        // Odometer
        __CLR4_5_237w37wlx1e67h0.R.inc(4214);position.set(Event.KEY_ODOMETER, Integer.parseInt(parser.group(index++), 16));
        
        // Altitude
        __CLR4_5_237w37wlx1e67h0.R.inc(4215);String altitude = parser.group(index++);
        __CLR4_5_237w37wlx1e67h0.R.inc(4216);if ((((altitude != null)&&(__CLR4_5_237w37wlx1e67h0.R.iget(4217)!=0|true))||(__CLR4_5_237w37wlx1e67h0.R.iget(4218)==0&false))) {{
            __CLR4_5_237w37wlx1e67h0.R.inc(4219);position.setAltitude(Double.valueOf(altitude));
        }
        }__CLR4_5_237w37wlx1e67h0.R.inc(4220);return position;
    }finally{__CLR4_5_237w37wlx1e67h0.R.flushNeeded();}}

}
