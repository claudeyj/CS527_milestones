/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

public class XexunProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28se8selx1e38jo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,11463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean full;

    public XexunProtocolDecoder(XexunProtocol protocol, boolean full) {
        super(protocol);__CLR4_5_28se8selx1e38jo.R.inc(11391);try{__CLR4_5_28se8selx1e38jo.R.inc(11390);
        __CLR4_5_28se8selx1e38jo.R.inc(11392);this.full = full;
    }finally{__CLR4_5_28se8selx1e38jo.R.flushNeeded();}}

    private static final Pattern patternBasic = Pattern.compile(
            "G[PN]RMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.(\\d+)," + // Time (HHMMSS.SSS)
            "([AV])," +                         // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "([EW])?," +
            "(\\d+\\.?\\d*)," +                 // Speed
            "(\\d+\\.?\\d*)?," +                // Course
            "(\\d{2})(\\d{2})(\\d{2})," +       // Date (DDMMYY)
            "[^\\*]*\\*..,"       +             // Checksum
            "([FL])," +                         // Signal
            "(?:([^,]*),)?" +                   // Alarm
            ".*imei:" +
            "(\\d+),");                         // IMEI

    private static final Pattern patternFull = Pattern.compile(
            "[\r\n]*" +
            "(\\d+)," +                         // Serial
            "([^,]+)?," +                       // Number
            patternBasic.pattern() +
            "(\\d+)," +                         // Satellites
            "(-?\\d+\\.\\d+)?," +               // Altitude
            "[FL]:(\\d+\\.\\d+)V" +             // Power
            ".*" +
            "[\r\n]*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28se8selx1e38jo.R.inc(11393);

        // Parse message
        __CLR4_5_28se8selx1e38jo.R.inc(11394);Pattern pattern = (((full )&&(__CLR4_5_28se8selx1e38jo.R.iget(11395)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11396)==0&false))? patternFull : patternBasic;
        __CLR4_5_28se8selx1e38jo.R.inc(11397);Matcher parser = pattern.matcher((String) msg);
        __CLR4_5_28se8selx1e38jo.R.inc(11398);if ((((!parser.matches())&&(__CLR4_5_28se8selx1e38jo.R.iget(11399)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11400)==0&false))) {{
            __CLR4_5_28se8selx1e38jo.R.inc(11401);return null;
        }

        // Create new position
        }__CLR4_5_28se8selx1e38jo.R.inc(11402);Position position = new Position();
        __CLR4_5_28se8selx1e38jo.R.inc(11403);position.setProtocol(getProtocolName());

        __CLR4_5_28se8selx1e38jo.R.inc(11404);Integer index = 1;

        __CLR4_5_28se8selx1e38jo.R.inc(11405);if ((((full)&&(__CLR4_5_28se8selx1e38jo.R.iget(11406)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11407)==0&false))) {{
            __CLR4_5_28se8selx1e38jo.R.inc(11408);position.set("serial", parser.group(index++));
            __CLR4_5_28se8selx1e38jo.R.inc(11409);position.set("number", parser.group(index++));
        }

        // Time
        }__CLR4_5_28se8selx1e38jo.R.inc(11410);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28se8selx1e38jo.R.inc(11411);time.clear();
        __CLR4_5_28se8selx1e38jo.R.inc(11412);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28se8selx1e38jo.R.inc(11413);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28se8selx1e38jo.R.inc(11414);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28se8selx1e38jo.R.inc(11415);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_28se8selx1e38jo.R.inc(11416);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_28se8selx1e38jo.R.inc(11417);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28se8selx1e38jo.R.inc(11418);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_28se8selx1e38jo.R.inc(11419);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_28se8selx1e38jo.R.iget(11420)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11421)==0&false))) {__CLR4_5_28se8selx1e38jo.R.inc(11422);latitude = -latitude;
        }__CLR4_5_28se8selx1e38jo.R.inc(11423);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_28se8selx1e38jo.R.inc(11424);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28se8selx1e38jo.R.inc(11425);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_28se8selx1e38jo.R.inc(11426);String hemisphere = parser.group(index++);
        __CLR4_5_28se8selx1e38jo.R.inc(11427);if ((((hemisphere != null)&&(__CLR4_5_28se8selx1e38jo.R.iget(11428)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11429)==0&false))) {{
            __CLR4_5_28se8selx1e38jo.R.inc(11430);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_28se8selx1e38jo.R.iget(11431)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11432)==0&false))) {__CLR4_5_28se8selx1e38jo.R.inc(11433);longitude = -longitude;
        }}
        }__CLR4_5_28se8selx1e38jo.R.inc(11434);position.setLongitude(longitude);

        // Speed
        __CLR4_5_28se8selx1e38jo.R.inc(11435);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_28se8selx1e38jo.R.inc(11436);String course = parser.group(index++);
        __CLR4_5_28se8selx1e38jo.R.inc(11437);if ((((course != null)&&(__CLR4_5_28se8selx1e38jo.R.iget(11438)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11439)==0&false))) {{
            __CLR4_5_28se8selx1e38jo.R.inc(11440);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_28se8selx1e38jo.R.inc(11441);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28se8selx1e38jo.R.inc(11442);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28se8selx1e38jo.R.inc(11443);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_28se8selx1e38jo.R.inc(11444);position.setTime(time.getTime());

        // Signal
        __CLR4_5_28se8selx1e38jo.R.inc(11445);position.set("signal", parser.group(index++));

        // Alarm
        __CLR4_5_28se8selx1e38jo.R.inc(11446);position.set(Event.KEY_ALARM, parser.group(index++));

        // Get device by IMEI
        __CLR4_5_28se8selx1e38jo.R.inc(11447);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_28se8selx1e38jo.R.iget(11448)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11449)==0&false))) {{
            __CLR4_5_28se8selx1e38jo.R.inc(11450);return null;
        }
        }__CLR4_5_28se8selx1e38jo.R.inc(11451);position.setDeviceId(getDeviceId());

        __CLR4_5_28se8selx1e38jo.R.inc(11452);if ((((full)&&(__CLR4_5_28se8selx1e38jo.R.iget(11453)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11454)==0&false))) {{

            // Satellites
            __CLR4_5_28se8selx1e38jo.R.inc(11455);position.set(Event.KEY_SATELLITES, parser.group(index++).replaceFirst ("^0*(?![\\.$])", ""));

            // Altitude
            __CLR4_5_28se8selx1e38jo.R.inc(11456);String altitude = parser.group(index++);
            __CLR4_5_28se8selx1e38jo.R.inc(11457);if ((((altitude != null)&&(__CLR4_5_28se8selx1e38jo.R.iget(11458)!=0|true))||(__CLR4_5_28se8selx1e38jo.R.iget(11459)==0&false))) {{
                __CLR4_5_28se8selx1e38jo.R.inc(11460);position.setAltitude(Double.valueOf(altitude));
            }

            // Power
            }__CLR4_5_28se8selx1e38jo.R.inc(11461);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));
        }

        }__CLR4_5_28se8selx1e38jo.R.inc(11462);return position;
    }finally{__CLR4_5_28se8selx1e38jo.R.flushNeeded();}}

}
