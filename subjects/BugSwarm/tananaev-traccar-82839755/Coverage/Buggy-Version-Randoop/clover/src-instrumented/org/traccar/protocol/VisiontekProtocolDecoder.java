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

public class VisiontekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28jp8jplx1e45jx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,11137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public VisiontekProtocolDecoder(VisiontekProtocol protocol) {
        super(protocol);__CLR4_5_28jp8jplx1e45jx.R.inc(11078);try{__CLR4_5_28jp8jplx1e45jx.R.inc(11077);
    }finally{__CLR4_5_28jp8jplx1e45jx.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$1," +
            "([^,]+)," +                        // Identifier
            "(?:(\\d+),)?" +                    // IMEI
            "(\\d{2}),(\\d{2}),(\\d{2})," +     // Date
            "(\\d{2}),(\\d{2}),(\\d{2})," +     // Time
            "(\\d{2})(\\d{2}\\.?\\d{4})([NS])," + // Latitude
            "(\\d{3})(\\d{2}\\.?\\d{4})([EW])," + // Longitude
            "(\\d+\\.?\\d+)," +                 // Speed
            "(\\d+)," +                         // Course
            "(?:(\\d+)," +                      // Altitude
            "(\\d+),)?" +                       // Satellites
            "(\\d+)," +                         // Odometer
            "(?:(\\d)," +                       // Ignition
            "(\\d)," +                          // Input 1
            "(\\d)," +                          // Input 2
            "(\\d)," +                          // Immobilizer
            "(\\d)," +                          // External Battery Status
            "(\\d+),)?" +                       // GSM
            "([AV]),?" +                        // Validity
            "(\\d+)?" +                         // RFID
            ".*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28jp8jplx1e45jx.R.inc(11079);

        __CLR4_5_28jp8jplx1e45jx.R.inc(11080);String sentence = (String) msg;

        // Parse message
        __CLR4_5_28jp8jplx1e45jx.R.inc(11081);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_28jp8jplx1e45jx.R.inc(11082);if ((((!parser.matches())&&(__CLR4_5_28jp8jplx1e45jx.R.iget(11083)!=0|true))||(__CLR4_5_28jp8jplx1e45jx.R.iget(11084)==0&false))) {{
            __CLR4_5_28jp8jplx1e45jx.R.inc(11085);return null;
        }

        // Create new position
        }__CLR4_5_28jp8jplx1e45jx.R.inc(11086);Position position = new Position();
        __CLR4_5_28jp8jplx1e45jx.R.inc(11087);position.setProtocol(getProtocolName());

        __CLR4_5_28jp8jplx1e45jx.R.inc(11088);Integer index = 1;

        // Device identification
        __CLR4_5_28jp8jplx1e45jx.R.inc(11089);String id = parser.group(index++);
        __CLR4_5_28jp8jplx1e45jx.R.inc(11090);String imei = parser.group(index++);
        __CLR4_5_28jp8jplx1e45jx.R.inc(11091);if ((((!identify(id, channel, null, false) && !identify(imei, channel))&&(__CLR4_5_28jp8jplx1e45jx.R.iget(11092)!=0|true))||(__CLR4_5_28jp8jplx1e45jx.R.iget(11093)==0&false))) {{
            __CLR4_5_28jp8jplx1e45jx.R.inc(11094);return null;
        }
        }__CLR4_5_28jp8jplx1e45jx.R.inc(11095);position.setDeviceId(getDeviceId());

        // Date
        __CLR4_5_28jp8jplx1e45jx.R.inc(11096);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11097);time.clear();
        __CLR4_5_28jp8jplx1e45jx.R.inc(11098);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11099);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28jp8jplx1e45jx.R.inc(11100);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11101);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11102);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11103);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11104);position.setTime(time.getTime());

        // Latitude
        __CLR4_5_28jp8jplx1e45jx.R.inc(11105);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11106);latitude += Double.valueOf(parser.group(index++).replace(".", "")) / 600000;
        __CLR4_5_28jp8jplx1e45jx.R.inc(11107);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_28jp8jplx1e45jx.R.iget(11108)!=0|true))||(__CLR4_5_28jp8jplx1e45jx.R.iget(11109)==0&false))) {__CLR4_5_28jp8jplx1e45jx.R.inc(11110);latitude = -latitude;
        }__CLR4_5_28jp8jplx1e45jx.R.inc(11111);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_28jp8jplx1e45jx.R.inc(11112);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11113);longitude += Double.valueOf(parser.group(index++).replace(".", "")) / 600000;
        __CLR4_5_28jp8jplx1e45jx.R.inc(11114);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_28jp8jplx1e45jx.R.iget(11115)!=0|true))||(__CLR4_5_28jp8jplx1e45jx.R.iget(11116)==0&false))) {__CLR4_5_28jp8jplx1e45jx.R.inc(11117);longitude = -longitude;
        }__CLR4_5_28jp8jplx1e45jx.R.inc(11118);position.setLongitude(longitude);

        // Speed
        __CLR4_5_28jp8jplx1e45jx.R.inc(11119);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(
                parser.group(index++).replace(".", "")) / 10));

        // Course
        __CLR4_5_28jp8jplx1e45jx.R.inc(11120);position.setCourse(Double.valueOf(parser.group(index++)));

        // Altitude
        __CLR4_5_28jp8jplx1e45jx.R.inc(11121);String altitude = parser.group(index++);
        __CLR4_5_28jp8jplx1e45jx.R.inc(11122);if ((((altitude != null)&&(__CLR4_5_28jp8jplx1e45jx.R.iget(11123)!=0|true))||(__CLR4_5_28jp8jplx1e45jx.R.iget(11124)==0&false))) {{
            __CLR4_5_28jp8jplx1e45jx.R.inc(11125);position.setAltitude(Double.valueOf(altitude));
        }

        // Additional data
        }__CLR4_5_28jp8jplx1e45jx.R.inc(11126);position.set(Event.KEY_SATELLITES, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11127);position.set(Event.KEY_ODOMETER, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11128);position.set(Event.KEY_IGNITION, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11129);position.set(Event.PREFIX_IO + 1, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11130);position.set(Event.PREFIX_IO + 2, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11131);position.set("immobilizer", parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11132);position.set(Event.KEY_POWER, parser.group(index++));
        __CLR4_5_28jp8jplx1e45jx.R.inc(11133);position.set(Event.KEY_GSM, parser.group(index++));

        // Validity
        __CLR4_5_28jp8jplx1e45jx.R.inc(11134);position.setValid(parser.group(index++).compareTo("A") == 0);

        // RFID
        __CLR4_5_28jp8jplx1e45jx.R.inc(11135);position.set(Event.KEY_RFID, parser.group(index++));

        __CLR4_5_28jp8jplx1e45jx.R.inc(11136);return position;
    }finally{__CLR4_5_28jp8jplx1e45jx.R.flushNeeded();}}

}
