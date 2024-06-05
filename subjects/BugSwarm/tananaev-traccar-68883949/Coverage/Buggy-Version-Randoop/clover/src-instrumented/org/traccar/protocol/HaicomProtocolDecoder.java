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

public class HaicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24ap4aplx1di7n6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,5621,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public HaicomProtocolDecoder(HaicomProtocol protocol) {
        super(protocol);__CLR4_5_24ap4aplx1di7n6.R.inc(5570);try{__CLR4_5_24ap4aplx1di7n6.R.inc(5569);
    }finally{__CLR4_5_24ap4aplx1di7n6.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$GPRS" +
            "(\\d+)," +                   // IMEI
            "([^,]+)," +                  // Version
            "(\\d{2})(\\d{2})(\\d{2})," + // Date
            "(\\d{2})(\\d{2})(\\d{2})," + // Time
            "(\\d)" +                     // Flags
            "(\\d{2})(\\d{5})" +          // Latitude (DDMMMMM)
            "(\\d{3})(\\d{5})," +         // Longitude (DDDMMMMM)
            "(\\d+)," +                   // Speed
            "(\\d+)," +                   // Course
            "(\\d+)," +                   // Status
            "(\\d+)?," +                  // GPRS counting value
            "(\\d+)?," +                  // GPS power saving counting value
            "(\\d+)," +                   // Switch status
            "(\\d+)" +                    // Relay status
            "(?:[LH]{2})?" +              // Power status
            "\\#V(\\d+).*");              // Battery

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24ap4aplx1di7n6.R.inc(5571);

        __CLR4_5_24ap4aplx1di7n6.R.inc(5572);String sentence = (String) msg;

        // Parse message
        __CLR4_5_24ap4aplx1di7n6.R.inc(5573);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_24ap4aplx1di7n6.R.inc(5574);if ((((!parser.matches())&&(__CLR4_5_24ap4aplx1di7n6.R.iget(5575)!=0|true))||(__CLR4_5_24ap4aplx1di7n6.R.iget(5576)==0&false))) {{
            __CLR4_5_24ap4aplx1di7n6.R.inc(5577);return null;
        }

        // Create new position
        }__CLR4_5_24ap4aplx1di7n6.R.inc(5578);Position position = new Position();
        __CLR4_5_24ap4aplx1di7n6.R.inc(5579);position.setProtocol(getProtocolName());

        __CLR4_5_24ap4aplx1di7n6.R.inc(5580);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_24ap4aplx1di7n6.R.inc(5581);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24ap4aplx1di7n6.R.iget(5582)!=0|true))||(__CLR4_5_24ap4aplx1di7n6.R.iget(5583)==0&false))) {{
            __CLR4_5_24ap4aplx1di7n6.R.inc(5584);return null;
        }
        }__CLR4_5_24ap4aplx1di7n6.R.inc(5585);position.setDeviceId(getDeviceId());

        // Firmware version
        __CLR4_5_24ap4aplx1di7n6.R.inc(5586);position.set(Event.KEY_VERSION, parser.group(index++));
        
        // Date
        __CLR4_5_24ap4aplx1di7n6.R.inc(5587);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5588);time.clear();
        __CLR4_5_24ap4aplx1di7n6.R.inc(5589);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5590);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24ap4aplx1di7n6.R.inc(5591);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5592);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5593);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5594);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5595);position.setTime(time.getTime());

        // Validity
        __CLR4_5_24ap4aplx1di7n6.R.inc(5596);int flags = Integer.valueOf(parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5597);position.setValid((flags & 0x1) != 0);

        // Latitude
        __CLR4_5_24ap4aplx1di7n6.R.inc(5598);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5599);latitude += Double.valueOf(parser.group(index++)) / 60000;
        __CLR4_5_24ap4aplx1di7n6.R.inc(5600);if (((((flags & 0x4) == 0)&&(__CLR4_5_24ap4aplx1di7n6.R.iget(5601)!=0|true))||(__CLR4_5_24ap4aplx1di7n6.R.iget(5602)==0&false))) {__CLR4_5_24ap4aplx1di7n6.R.inc(5603);latitude = -latitude;
        }__CLR4_5_24ap4aplx1di7n6.R.inc(5604);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_24ap4aplx1di7n6.R.inc(5605);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5606);longitude += Double.valueOf(parser.group(index++)) / 60000;
        __CLR4_5_24ap4aplx1di7n6.R.inc(5607);if (((((flags & 0x2) == 0)&&(__CLR4_5_24ap4aplx1di7n6.R.iget(5608)!=0|true))||(__CLR4_5_24ap4aplx1di7n6.R.iget(5609)==0&false))) {__CLR4_5_24ap4aplx1di7n6.R.inc(5610);longitude = -longitude;
        }__CLR4_5_24ap4aplx1di7n6.R.inc(5611);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24ap4aplx1di7n6.R.inc(5612);position.setSpeed(Double.valueOf(parser.group(index++)) / 10);

        // Course
        __CLR4_5_24ap4aplx1di7n6.R.inc(5613);position.setCourse(Double.valueOf(parser.group(index++)) / 10);
        
        // Additional data
        __CLR4_5_24ap4aplx1di7n6.R.inc(5614);position.set(Event.KEY_STATUS, parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5615);position.set(Event.KEY_GSM, parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5616);position.set(Event.KEY_GPS, parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5617);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5618);position.set(Event.KEY_OUTPUT, parser.group(index++));
        __CLR4_5_24ap4aplx1di7n6.R.inc(5619);position.set(Event.KEY_BATTERY, Double.valueOf(parser.group(index++)) / 10);

        __CLR4_5_24ap4aplx1di7n6.R.inc(5620);return position;
    }finally{__CLR4_5_24ap4aplx1di7n6.R.flushNeeded();}}

}
