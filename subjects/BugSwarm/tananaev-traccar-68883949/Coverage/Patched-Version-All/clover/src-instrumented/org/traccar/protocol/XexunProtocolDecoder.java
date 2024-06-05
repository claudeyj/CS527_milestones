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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class XexunProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_288w88wlx1dso2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,10761,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean full;

    public XexunProtocolDecoder(XexunProtocol protocol, boolean full) {
        super(protocol);__CLR4_5_288w88wlx1dso2s.R.inc(10689);try{__CLR4_5_288w88wlx1dso2s.R.inc(10688);
        __CLR4_5_288w88wlx1dso2s.R.inc(10690);this.full = full;
    }finally{__CLR4_5_288w88wlx1dso2s.R.flushNeeded();}}

    static private Pattern patternBasic = Pattern.compile(
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

    static private Pattern patternFull = Pattern.compile(
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
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_288w88wlx1dso2s.R.inc(10691);

        // Parse message
        __CLR4_5_288w88wlx1dso2s.R.inc(10692);Pattern pattern = (((full )&&(__CLR4_5_288w88wlx1dso2s.R.iget(10693)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10694)==0&false))? patternFull : patternBasic;
        __CLR4_5_288w88wlx1dso2s.R.inc(10695);Matcher parser = pattern.matcher((String) msg);
        __CLR4_5_288w88wlx1dso2s.R.inc(10696);if ((((!parser.matches())&&(__CLR4_5_288w88wlx1dso2s.R.iget(10697)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10698)==0&false))) {{
            __CLR4_5_288w88wlx1dso2s.R.inc(10699);return null;
        }

        // Create new position
        }__CLR4_5_288w88wlx1dso2s.R.inc(10700);Position position = new Position();
        __CLR4_5_288w88wlx1dso2s.R.inc(10701);position.setProtocol(getProtocolName());

        __CLR4_5_288w88wlx1dso2s.R.inc(10702);Integer index = 1;

        __CLR4_5_288w88wlx1dso2s.R.inc(10703);if ((((full)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10704)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10705)==0&false))) {{
            __CLR4_5_288w88wlx1dso2s.R.inc(10706);position.set("serial", parser.group(index++));
            __CLR4_5_288w88wlx1dso2s.R.inc(10707);position.set("number", parser.group(index++));
        }

        // Time
        }__CLR4_5_288w88wlx1dso2s.R.inc(10708);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_288w88wlx1dso2s.R.inc(10709);time.clear();
        __CLR4_5_288w88wlx1dso2s.R.inc(10710);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_288w88wlx1dso2s.R.inc(10711);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_288w88wlx1dso2s.R.inc(10712);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_288w88wlx1dso2s.R.inc(10713);time.set(Calendar.MILLISECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_288w88wlx1dso2s.R.inc(10714);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_288w88wlx1dso2s.R.inc(10715);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_288w88wlx1dso2s.R.inc(10716);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_288w88wlx1dso2s.R.inc(10717);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10718)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10719)==0&false))) {__CLR4_5_288w88wlx1dso2s.R.inc(10720);latitude = -latitude;
        }__CLR4_5_288w88wlx1dso2s.R.inc(10721);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_288w88wlx1dso2s.R.inc(10722);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_288w88wlx1dso2s.R.inc(10723);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_288w88wlx1dso2s.R.inc(10724);String hemisphere = parser.group(index++);
        __CLR4_5_288w88wlx1dso2s.R.inc(10725);if ((((hemisphere != null)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10726)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10727)==0&false))) {{
            __CLR4_5_288w88wlx1dso2s.R.inc(10728);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10729)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10730)==0&false))) {__CLR4_5_288w88wlx1dso2s.R.inc(10731);longitude = -longitude;
        }}
        }__CLR4_5_288w88wlx1dso2s.R.inc(10732);position.setLongitude(longitude);

        // Speed
        __CLR4_5_288w88wlx1dso2s.R.inc(10733);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_288w88wlx1dso2s.R.inc(10734);String course = parser.group(index++);
        __CLR4_5_288w88wlx1dso2s.R.inc(10735);if ((((course != null)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10736)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10737)==0&false))) {{
            __CLR4_5_288w88wlx1dso2s.R.inc(10738);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_288w88wlx1dso2s.R.inc(10739);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_288w88wlx1dso2s.R.inc(10740);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_288w88wlx1dso2s.R.inc(10741);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_288w88wlx1dso2s.R.inc(10742);position.setTime(time.getTime());

        // Signal
        __CLR4_5_288w88wlx1dso2s.R.inc(10743);position.set("signal", parser.group(index++));

        // Alarm
        __CLR4_5_288w88wlx1dso2s.R.inc(10744);position.set(Event.KEY_ALARM, parser.group(index++));

        // Get device by IMEI
        __CLR4_5_288w88wlx1dso2s.R.inc(10745);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_288w88wlx1dso2s.R.iget(10746)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10747)==0&false))) {{
            __CLR4_5_288w88wlx1dso2s.R.inc(10748);return null;
        }
        }__CLR4_5_288w88wlx1dso2s.R.inc(10749);position.setDeviceId(getDeviceId());

        __CLR4_5_288w88wlx1dso2s.R.inc(10750);if ((((full)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10751)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10752)==0&false))) {{

            // Satellites
            __CLR4_5_288w88wlx1dso2s.R.inc(10753);position.set(Event.KEY_SATELLITES, parser.group(index++).replaceFirst ("^0*(?![\\.$])", ""));

            // Altitude
            __CLR4_5_288w88wlx1dso2s.R.inc(10754);String altitude = parser.group(index++);
            __CLR4_5_288w88wlx1dso2s.R.inc(10755);if ((((altitude != null)&&(__CLR4_5_288w88wlx1dso2s.R.iget(10756)!=0|true))||(__CLR4_5_288w88wlx1dso2s.R.iget(10757)==0&false))) {{
                __CLR4_5_288w88wlx1dso2s.R.inc(10758);position.setAltitude(Double.valueOf(altitude));
            }

            // Power
            }__CLR4_5_288w88wlx1dso2s.R.inc(10759);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));
        }

        }__CLR4_5_288w88wlx1dso2s.R.inc(10760);return position;
    }finally{__CLR4_5_288w88wlx1dso2s.R.flushNeeded();}}

}
