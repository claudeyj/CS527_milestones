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

public class Stl060ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26nr6nrlx1dlptx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,8696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Stl060ProtocolDecoder(Stl060Protocol protocol) {
        super(protocol);__CLR4_5_26nr6nrlx1dlptx.R.inc(8632);try{__CLR4_5_26nr6nrlx1dlptx.R.inc(8631);
    }finally{__CLR4_5_26nr6nrlx1dlptx.R.flushNeeded();}}

    //$1,357804047969310,D001,AP29AW0963,01/01/13,13:24:47,1723.9582N,07834.0945E
    //,00100,010,0,0,0,0,
    //0,0008478660,1450,40,34,0,0,0,A
    private static final Pattern pattern = Pattern.compile(
            ".*\\$1," +
            "(\\d+)," +                         // IMEI
            "D001," +                           // Type
            "[^,]*," +                          // Vehicle
            "(\\d{2})/(\\d{2})/(\\d{2})," +     // Date
            "(\\d{2}):(\\d{2}):(\\d{2})," +     // Time
            "(\\d{2})(\\d{2})\\.?(\\d+)([NS])," + // Latitude
            "(\\d{3})(\\d{2})\\.?(\\d+)([EW])," + // Longitude
            "(\\d+\\.?\\d*)," +                 // Speed
            "(\\d+\\.?\\d*)," +                 // Course

            "(?:(\\d+)," +                      // Odometer
            "(\\d+)," +                         // Ignition
            "(\\d+)," +                         // DI1
            "(\\d+)," +                         // DI2
            "(\\d+),|" +                        // Fuel

            "([01])," +                         // Charging
            "([01])," +                         // Ignition
            "0,0," +                            // Reserved
            "(\\d+)," +                         // DI
            "([^,]+)," +                        // RFID
            "(\\d+)," +                         // Odometer
            "(\\d+)," +                         // Temperature
            "(\\d+)," +                         // Fuel
            "([01])," +                         // Accelerometer
            "([01])," +                         // DO1
            "([01]),)" +                        // DO2

            "([AV])" +                          // Validity
            ".*");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26nr6nrlx1dlptx.R.inc(8633);

        __CLR4_5_26nr6nrlx1dlptx.R.inc(8634);String sentence = (String) msg;

        // Parse message
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8635);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8636);if ((((!parser.matches())&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8637)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8638)==0&false))) {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8639);return null;
        }

        // Create new position
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8640);Position position = new Position();
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8641);position.setProtocol(getProtocolName());

        __CLR4_5_26nr6nrlx1dlptx.R.inc(8642);Integer index = 1;

        // Device identification
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8643);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8644)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8645)==0&false))) {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8646);return null;
        }
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8647);position.setDeviceId(getDeviceId());
        
        // Date
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8648);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8649);time.clear();
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8650);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8651);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8652);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));

        // Time
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8653);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8654);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8655);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8656);position.setTime(time.getTime());

        // Latitude
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8657);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8658);latitude += Double.valueOf(parser.group(index++) + parser.group(index++)) / 600000;
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8659);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8660)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8661)==0&false))) {__CLR4_5_26nr6nrlx1dlptx.R.inc(8662);latitude = -latitude;
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8663);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8664);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8665);longitude += Double.valueOf(parser.group(index++) + parser.group(index++)) / 600000;
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8666);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8667)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8668)==0&false))) {__CLR4_5_26nr6nrlx1dlptx.R.inc(8669);longitude = -longitude;
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8670);position.setLongitude(longitude);

        // Speed
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8671);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8672);position.setCourse(Double.valueOf(parser.group(index++)));

        // Old format
        __CLR4_5_26nr6nrlx1dlptx.R.inc(8673);if ((((parser.group(index) != null)&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8674)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8675)==0&false))) {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8676);position.set(Event.KEY_ODOMETER, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8677);position.set(Event.KEY_IGNITION, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8678);position.set(Event.KEY_INPUT, Integer.valueOf(parser.group(index++)) + Integer.valueOf(parser.group(index++)) << 1);
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8679);position.set(Event.KEY_FUEL, Integer.valueOf(parser.group(index++)));
        } }else {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8680);index += 5;
        }

        // New format
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8681);if ((((parser.group(index) != null)&&(__CLR4_5_26nr6nrlx1dlptx.R.iget(8682)!=0|true))||(__CLR4_5_26nr6nrlx1dlptx.R.iget(8683)==0&false))) {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8684);position.set(Event.KEY_CHARGE, Integer.valueOf(parser.group(index++)) == 1);
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8685);position.set(Event.KEY_IGNITION, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8686);position.set(Event.KEY_INPUT, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8687);position.set(Event.KEY_RFID, parser.group(index++));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8688);position.set(Event.KEY_ODOMETER, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8689);position.set(Event.PREFIX_TEMP + 1, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8690);position.set(Event.KEY_FUEL, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8691);position.set("accel", Integer.valueOf(parser.group(index++)) == 1);
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8692);position.set(Event.KEY_OUTPUT, Integer.valueOf(parser.group(index++)) + Integer.valueOf(parser.group(index++)) << 1);
        } }else {{
            __CLR4_5_26nr6nrlx1dlptx.R.inc(8693);index += 10;
        }

        // Validity
        }__CLR4_5_26nr6nrlx1dlptx.R.inc(8694);position.setValid(parser.group(index++).compareTo("A") == 0);

        __CLR4_5_26nr6nrlx1dlptx.R.inc(8695);return position;
    }finally{__CLR4_5_26nr6nrlx1dlptx.R.flushNeeded();}}

}
