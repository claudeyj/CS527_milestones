/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

public class AquilaProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_223z23zlx1e66p1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,2780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AquilaProtocolDecoder(AquilaProtocol protocol) {
        super(protocol);__CLR4_5_223z23zlx1e66p1.R.inc(2736);try{__CLR4_5_223z23zlx1e66p1.R.inc(2735);
    }finally{__CLR4_5_223z23zlx1e66p1.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$\\$" +
            "[^,]+," +                          // Client
            "(\\d+)," +                         // Device serial number
            "(\\d+)," +                         // Event
            "(-?\\d+\\.\\d+)," +                // Latitude
            "(-?\\d+\\.\\d+)," +                // Longitude
            "(\\d{2})(\\d{2})(\\d{2})" +        // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time (HHMMSS)
            "([AV])," +                         // Validity
            "(\\d+)," +                         // GSM
            "(\\d+)," +                         // Speed
            "(\\d+)," +                         // Distance
            "\\d+," +                           // Driver code
            "(\\d+)," +                         // Fuel
            "([01])," +                         // IO 1
            "[01]," +                           // Case open switch
            "[01]," +                           // Over speed start
            "[01]," +                           // Over speed end
            "(?:\\d+,){3}" +                    // Reserved
            "([01])," +                         // Power status
            "([01])," +                         // IO 2
            "\\d+," +                           // Reserved
            "([01])," +                         // Ignition
            "[01]," +                           // Ignition off event
            "(?:\\d+,){7}" +                    // Reserved
            "[01]," +                           // Corner packet
            "(?:\\d+,){8}" +                    // Reserved
            "([01])," +                         // Course bit 0
            "([01])," +                         // Course bit 1
            "([01])," +                         // Course bit 2
            "([01])," +                         // Course bit 3
            "\\*(\\p{XDigit}{2})");             // Checksum

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_223z23zlx1e66p1.R.inc(2737);

        __CLR4_5_223z23zlx1e66p1.R.inc(2738);String sentence = (String) msg;

        __CLR4_5_223z23zlx1e66p1.R.inc(2739);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_223z23zlx1e66p1.R.inc(2740);if ((((!parser.matches())&&(__CLR4_5_223z23zlx1e66p1.R.iget(2741)!=0|true))||(__CLR4_5_223z23zlx1e66p1.R.iget(2742)==0&false))) {{
            __CLR4_5_223z23zlx1e66p1.R.inc(2743);return null;
        }

        }__CLR4_5_223z23zlx1e66p1.R.inc(2744);Position position = new Position();
        __CLR4_5_223z23zlx1e66p1.R.inc(2745);position.setProtocol(getProtocolName());

        __CLR4_5_223z23zlx1e66p1.R.inc(2746);Integer index = 1;

        __CLR4_5_223z23zlx1e66p1.R.inc(2747);String id = parser.group(index++);
        __CLR4_5_223z23zlx1e66p1.R.inc(2748);if ((((!identify(id, channel))&&(__CLR4_5_223z23zlx1e66p1.R.iget(2749)!=0|true))||(__CLR4_5_223z23zlx1e66p1.R.iget(2750)==0&false))) {{
            __CLR4_5_223z23zlx1e66p1.R.inc(2751);return null;
        }
        }__CLR4_5_223z23zlx1e66p1.R.inc(2752);position.setDeviceId(getDeviceId());

        __CLR4_5_223z23zlx1e66p1.R.inc(2753);position.set(Event.KEY_EVENT, Integer.parseInt(parser.group(index++)));

        __CLR4_5_223z23zlx1e66p1.R.inc(2754);position.setLatitude(Double.parseDouble(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2755);position.setLongitude(Double.parseDouble(parser.group(index++)));

        __CLR4_5_223z23zlx1e66p1.R.inc(2756);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_223z23zlx1e66p1.R.inc(2757);time.clear();
        __CLR4_5_223z23zlx1e66p1.R.inc(2758);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2759);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
        __CLR4_5_223z23zlx1e66p1.R.inc(2760);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2761);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2762);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2763);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++)));
        __CLR4_5_223z23zlx1e66p1.R.inc(2764);position.setTime(time.getTime());

        __CLR4_5_223z23zlx1e66p1.R.inc(2765);position.setValid(parser.group(index++).equals("A"));

        __CLR4_5_223z23zlx1e66p1.R.inc(2766);position.set(Event.KEY_GSM, Integer.parseInt(parser.group(index++)));

        __CLR4_5_223z23zlx1e66p1.R.inc(2767);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(parser.group(index++))));

        __CLR4_5_223z23zlx1e66p1.R.inc(2768);position.set(Event.KEY_ODOMETER, parser.group(index++));
        __CLR4_5_223z23zlx1e66p1.R.inc(2769);position.set(Event.KEY_FUEL, parser.group(index++));
        __CLR4_5_223z23zlx1e66p1.R.inc(2770);position.set(Event.PREFIX_IO + 1, parser.group(index++));
        __CLR4_5_223z23zlx1e66p1.R.inc(2771);position.set(Event.KEY_CHARGE, parser.group(index++));
        __CLR4_5_223z23zlx1e66p1.R.inc(2772);position.set(Event.PREFIX_IO + 2, parser.group(index++));

        __CLR4_5_223z23zlx1e66p1.R.inc(2773);position.set(Event.KEY_IGNITION, parser.group(index++).equals("1"));

        __CLR4_5_223z23zlx1e66p1.R.inc(2774);int course =
                (Integer.parseInt(parser.group(index++)) << 3) +
                (Integer.parseInt(parser.group(index++)) << 2) +
                (Integer.parseInt(parser.group(index++)) << 1) +
                (Integer.parseInt(parser.group(index++)));

        __CLR4_5_223z23zlx1e66p1.R.inc(2775);if ((((course > 0 && course <= 8)&&(__CLR4_5_223z23zlx1e66p1.R.iget(2776)!=0|true))||(__CLR4_5_223z23zlx1e66p1.R.iget(2777)==0&false))) {{
            __CLR4_5_223z23zlx1e66p1.R.inc(2778);position.setCourse((course - 1) * 45);
        }

        }__CLR4_5_223z23zlx1e66p1.R.inc(2779);return position;
    }finally{__CLR4_5_223z23zlx1e66p1.R.flushNeeded();}}

}
