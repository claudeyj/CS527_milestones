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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GpsMarkerProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_247r47rlx1e75hh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,5519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsMarkerProtocolDecoder(GpsMarkerProtocol protocol) {
        super(protocol);__CLR4_5_247r47rlx1e75hh.R.inc(5464);try{__CLR4_5_247r47rlx1e75hh.R.inc(5463);
    }finally{__CLR4_5_247r47rlx1e75hh.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$GM" +
            "\\d" +                             // Type
            "(?:\\p{XDigit}{2})?" +             // Index
            "(\\d{15})" +                       // IMEI
            "T(\\d{2})(\\d{2})(\\d{2})" +       // Date
            "(\\d{2})(\\d{2})(\\d{2})?" +       // Time
            "([NS])" +
            "(\\d{2})(\\d{2}\\d{4})" +          // Latitude
            "([EW])" +
            "(\\d{3})(\\d{2}\\d{4})" +          // Longitude
            "(\\d{3})" +                        // Speed
            "(\\d{3})" +                        // Course
            "(\\d)" +                           // Satellites
            "(\\d{2})" +                        // Battery
            "(\\d)" +                           // Input
            "(\\d)" +                           // Output
            "(\\d{3})" +                        // Temperature
            ".*");

    private static final Pattern handshakePattern = Pattern.compile("##,imei:(\\d+),A");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_247r47rlx1e75hh.R.inc(5465);

        __CLR4_5_247r47rlx1e75hh.R.inc(5466);String sentence = (String) msg;

        // Parse message
        __CLR4_5_247r47rlx1e75hh.R.inc(5467);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_247r47rlx1e75hh.R.inc(5468);if ((((!parser.matches())&&(__CLR4_5_247r47rlx1e75hh.R.iget(5469)!=0|true))||(__CLR4_5_247r47rlx1e75hh.R.iget(5470)==0&false))) {{
            __CLR4_5_247r47rlx1e75hh.R.inc(5471);return null;
        }

        // Create new position
        }__CLR4_5_247r47rlx1e75hh.R.inc(5472);Position position = new Position();
        __CLR4_5_247r47rlx1e75hh.R.inc(5473);position.setProtocol(getProtocolName());

        __CLR4_5_247r47rlx1e75hh.R.inc(5474);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_247r47rlx1e75hh.R.inc(5475);String imei = parser.group(index++);
        __CLR4_5_247r47rlx1e75hh.R.inc(5476);if ((((!identify(imei, channel, remoteAddress))&&(__CLR4_5_247r47rlx1e75hh.R.iget(5477)!=0|true))||(__CLR4_5_247r47rlx1e75hh.R.iget(5478)==0&false))) {{
            __CLR4_5_247r47rlx1e75hh.R.inc(5479);return null;
        }
        }__CLR4_5_247r47rlx1e75hh.R.inc(5480);position.setDeviceId(getDeviceId());

        // Date and Time
        __CLR4_5_247r47rlx1e75hh.R.inc(5481);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_247r47rlx1e75hh.R.inc(5482);time.clear();
        __CLR4_5_247r47rlx1e75hh.R.inc(5483);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247r47rlx1e75hh.R.inc(5484);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_247r47rlx1e75hh.R.inc(5485);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_247r47rlx1e75hh.R.inc(5486);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247r47rlx1e75hh.R.inc(5487);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247r47rlx1e75hh.R.inc(5488);String seconds = parser.group(index++);
        __CLR4_5_247r47rlx1e75hh.R.inc(5489);if ((((seconds != null)&&(__CLR4_5_247r47rlx1e75hh.R.iget(5490)!=0|true))||(__CLR4_5_247r47rlx1e75hh.R.iget(5491)==0&false))) {{
            __CLR4_5_247r47rlx1e75hh.R.inc(5492);time.set(Calendar.SECOND, Integer.valueOf(seconds));
        }
        }__CLR4_5_247r47rlx1e75hh.R.inc(5493);position.setTime(time.getTime());

        // Validity
        __CLR4_5_247r47rlx1e75hh.R.inc(5494);position.setValid(true);

        // Latitude
        __CLR4_5_247r47rlx1e75hh.R.inc(5495);String hemisphere = parser.group(index++);
        __CLR4_5_247r47rlx1e75hh.R.inc(5496);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5497);latitude += Double.valueOf(parser.group(index++)) / 600000;
        __CLR4_5_247r47rlx1e75hh.R.inc(5498);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_247r47rlx1e75hh.R.iget(5499)!=0|true))||(__CLR4_5_247r47rlx1e75hh.R.iget(5500)==0&false))) {{
            __CLR4_5_247r47rlx1e75hh.R.inc(5501);latitude = -latitude;
        }
        }__CLR4_5_247r47rlx1e75hh.R.inc(5502);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_247r47rlx1e75hh.R.inc(5503);hemisphere = parser.group(index++);
        __CLR4_5_247r47rlx1e75hh.R.inc(5504);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5505);longitude += Double.valueOf(parser.group(index++)) / 600000;
        __CLR4_5_247r47rlx1e75hh.R.inc(5506);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_247r47rlx1e75hh.R.iget(5507)!=0|true))||(__CLR4_5_247r47rlx1e75hh.R.iget(5508)==0&false))) {{
            __CLR4_5_247r47rlx1e75hh.R.inc(5509);longitude = -longitude;
        }
        }__CLR4_5_247r47rlx1e75hh.R.inc(5510);position.setLongitude(longitude);

        // Speed
        __CLR4_5_247r47rlx1e75hh.R.inc(5511);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_247r47rlx1e75hh.R.inc(5512);position.setCourse(Double.valueOf(parser.group(index++)));

        // Additional data
        __CLR4_5_247r47rlx1e75hh.R.inc(5513);position.set(Event.KEY_SATELLITES, parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5514);position.set(Event.KEY_BATTERY, parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5515);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5516);position.set(Event.KEY_OUTPUT, parser.group(index++));
        __CLR4_5_247r47rlx1e75hh.R.inc(5517);position.set(Event.PREFIX_TEMP + 1, parser.group(index++));

        __CLR4_5_247r47rlx1e75hh.R.inc(5518);return position;
    }finally{__CLR4_5_247r47rlx1e75hh.R.flushNeeded();}}

}
