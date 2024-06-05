/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.Context;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gl200ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23p63p6lx1e67p2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,4873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gl200ProtocolDecoder(Gl200Protocol protocol) {
        super(protocol);__CLR4_5_23p63p6lx1e67p2.R.inc(4795);try{__CLR4_5_23p63p6lx1e67p2.R.inc(4794);
    }finally{__CLR4_5_23p63p6lx1e67p2.R.flushNeeded();}}

    private static final Pattern heartbeatPattern = Pattern.compile(
            "\\+ACK:GTHBD," +
            "([0-9A-Z]{2}\\p{XDigit}{4})," +
            ".*," +
            "(\\p{XDigit}{4})\\$?");

    private static final Pattern pattern = Pattern.compile(
            "(?:(?:\\+(?:RESP|BUFF):)|" +
            "(?:\\x00?\\x04,\\p{XDigit}{4},[01],))" +
            "GT...," +
            "(?:[0-9A-Z]{2}\\p{XDigit}{4})?," + // Protocol version
            "([^,]+)," +                        // IMEI

            "(?:[0-9A-Z]{17}," +                // VIN
            "[^,]{0,20}," +                     // Device name
            "[01]," +                           // Report type
            "\\p{XDigit}{1,8}," +               // Report mask
            "[0-9A-Z]{17}," +                   // VIN
            "[01]," +                           // ODB connect
            "\\d{1,5}," +                       // ODB voltage
            "\\p{XDigit}{8}," +                 // Support PIDs
            "(\\d{1,5})," +                     // Engine RPM
            "(\\d{1,3})," +                     // Speed
            "(-?\\d{1,3})," +                   // Coolant temp
            "(\\d+\\.?\\d*|Inf|NaN)?," +        // Fuel consumption
            "(\\d{1,5})," +                     // DTCs cleared distance
            "\\d{1,5}," +
            "([01])," +                         // ODB connect
            "(\\d{1,3})," +                     // Number of DTCs
            "(\\p{XDigit}*)," +                 // DTCs
            "(\\d{1,3})," +                     // Throttle
            "\\d{1,3}," +                       // Engine load
            "(\\d{1,3})?,"+                     // Fuel level
            "(\\d+)|.*)," +                     // Odometer

            "(\\d*)," +                         // GPS accuracy
            "(\\d+.\\d)?," +                    // Speed
            "(\\d+)?," +                        // Course
            "(-?\\d+\\.\\d)?," +                // Altitude
            "(-?\\d+\\.\\d+)," +                // Longitude
            "(-?\\d+\\.\\d+)," +                // Latitude
            "(\\d{4})(\\d{2})(\\d{2})" +        // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time (HHMMSS)
            "(\\d{4})?," +                      // MCC
            "(\\d{4})?," +                      // MNC
            "(\\p{XDigit}{4}|\\p{XDigit}{8})?," + // LAC
            "(\\p{XDigit}{4})?," +              // Cell
            "(?:(\\d+\\.\\d)?," +               // Odometer
            "(\\d{1,3})?,)?" +                  // Battery
            ".*," +
            "(\\p{XDigit}{4})\\$?");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23p63p6lx1e67p2.R.inc(4796);

        __CLR4_5_23p63p6lx1e67p2.R.inc(4797);String sentence = (String) msg;

        // Handle heartbeat
        __CLR4_5_23p63p6lx1e67p2.R.inc(4798);Matcher parser = heartbeatPattern.matcher(sentence);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4799);if ((((parser.matches())&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4800)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4801)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4802);if ((((channel != null)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4803)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4804)==0&false))) {{
                __CLR4_5_23p63p6lx1e67p2.R.inc(4805);channel.write("+SACK:GTHBD," + parser.group(1) + "," + parser.group(2) + "$", remoteAddress);
            }
            }__CLR4_5_23p63p6lx1e67p2.R.inc(4806);return null;
        }

        // Parse message
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4807);parser = pattern.matcher(sentence);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4808);if ((((!parser.matches())&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4809)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4810)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4811);return null;
        }

        // Create new position
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4812);Position position = new Position();
        __CLR4_5_23p63p6lx1e67p2.R.inc(4813);position.setProtocol(getProtocolName());

        __CLR4_5_23p63p6lx1e67p2.R.inc(4814);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_23p63p6lx1e67p2.R.inc(4815);if ((((!identify(parser.group(index++), channel, remoteAddress))&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4816)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4817)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4818);return null;
        }
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4819);position.setDeviceId(getDeviceId());

        // OBD
        __CLR4_5_23p63p6lx1e67p2.R.inc(4820);position.set(Event.KEY_RPM, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4821);position.set(Event.KEY_OBD_SPEED, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4822);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4823);position.set("fuel-consumption", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4824);position.set("dtcs-cleared-distance", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4825);position.set("odb-connect", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4826);position.set("dtcs-number", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4827);position.set("dtcs-codes", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4828);position.set("throttle-position", parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4829);position.set(Event.KEY_FUEL, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4830);position.set(Event.KEY_OBD_ODOMETER, parser.group(index++));

        // Validity
        __CLR4_5_23p63p6lx1e67p2.R.inc(4831);position.setValid(Integer.valueOf(parser.group(index++)) < 20);

        // Speed
        __CLR4_5_23p63p6lx1e67p2.R.inc(4832);String speed = parser.group(index++);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4833);if ((((speed != null)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4834)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4835)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4836);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(speed)));
        }

        // Course
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4837);String course = parser.group(index++);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4838);if ((((speed != null)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4839)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4840)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4841);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4842);String altitude = parser.group(index++);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4843);if ((((altitude != null)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4844)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4845)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4846);position.setAltitude(Double.valueOf(altitude));
        }

        // Coordinates
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4847);position.setLongitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4848);position.setLatitude(Double.valueOf(parser.group(index++)));

        // Date
        __CLR4_5_23p63p6lx1e67p2.R.inc(4849);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4850);time.clear();
        __CLR4_5_23p63p6lx1e67p2.R.inc(4851);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4852);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4853);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));

        // Time
        __CLR4_5_23p63p6lx1e67p2.R.inc(4854);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4855);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4856);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4857);position.setTime(time.getTime());

        // Cell information
        __CLR4_5_23p63p6lx1e67p2.R.inc(4858);position.set(Event.KEY_MCC, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4859);position.set(Event.KEY_MNC, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4860);position.set(Event.KEY_LAC, parser.group(index++));
        __CLR4_5_23p63p6lx1e67p2.R.inc(4861);position.set(Event.KEY_CELL, parser.group(index++));

        // Other
        __CLR4_5_23p63p6lx1e67p2.R.inc(4862);String odometer = parser.group(index++);
        __CLR4_5_23p63p6lx1e67p2.R.inc(4863);if ((((odometer != null && Double.valueOf(odometer) != 0)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4864)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4865)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4866);position.set(Event.KEY_ODOMETER, odometer);
        }
        }__CLR4_5_23p63p6lx1e67p2.R.inc(4867);position.set(Event.KEY_BATTERY, parser.group(index++));

        __CLR4_5_23p63p6lx1e67p2.R.inc(4868);if ((((Context.getConfig().getBoolean(getProtocolName() + ".ack") && channel != null)&&(__CLR4_5_23p63p6lx1e67p2.R.iget(4869)!=0|true))||(__CLR4_5_23p63p6lx1e67p2.R.iget(4870)==0&false))) {{
            __CLR4_5_23p63p6lx1e67p2.R.inc(4871);channel.write("+SACK:" + parser.group(index++) + "$", remoteAddress);
        }

        }__CLR4_5_23p63p6lx1e67p2.R.inc(4872);return position;
    }finally{__CLR4_5_23p63p6lx1e67p2.R.flushNeeded();}}

}
