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
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Tr900ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27ju7julx1doatj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,9838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tr900ProtocolDecoder(Tr900Protocol protocol) {
        super(protocol);__CLR4_5_27ju7julx1doatj.R.inc(9787);try{__CLR4_5_27ju7julx1doatj.R.inc(9786);
    }finally{__CLR4_5_27ju7julx1doatj.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            ">(\\d+)," +                   // ID
            "\\d+," +                      // Period
            "(\\d)," +                     // Fix
            "(\\d{2})(\\d{2})(\\d{2})," +  // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([EW])" +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([NS])" +
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "[^,]*," +                     // Command
            "(\\d+\\.?\\d*)," +            // Speed
            "(\\d+\\.?\\d*)," +            // Course
            "(\\d+)," +                    // GSM
            "(\\d+)," +                    // Event
            "(\\d+)-" +                    // ADC
            "(\\d+)," +                    // Battery
            "\\d+," +                      // Impulses
            "(\\d+)," +                    // Input
            "(\\d+)" +                     // Status
            ".*(?:\r\n)?");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27ju7julx1doatj.R.inc(9788);

        __CLR4_5_27ju7julx1doatj.R.inc(9789);String sentence = (String) msg;

        // Parse message
        __CLR4_5_27ju7julx1doatj.R.inc(9790);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_27ju7julx1doatj.R.inc(9791);if ((((!parser.matches())&&(__CLR4_5_27ju7julx1doatj.R.iget(9792)!=0|true))||(__CLR4_5_27ju7julx1doatj.R.iget(9793)==0&false))) {{
            __CLR4_5_27ju7julx1doatj.R.inc(9794);return null;
        }

        // Create new position
        }__CLR4_5_27ju7julx1doatj.R.inc(9795);Position position = new Position();
        __CLR4_5_27ju7julx1doatj.R.inc(9796);position.setProtocol(getProtocolName());
        __CLR4_5_27ju7julx1doatj.R.inc(9797);Integer index = 1;

        // Identification
        __CLR4_5_27ju7julx1doatj.R.inc(9798);if ((((!identify(parser.group(index++), channel, remoteAddress))&&(__CLR4_5_27ju7julx1doatj.R.iget(9799)!=0|true))||(__CLR4_5_27ju7julx1doatj.R.iget(9800)==0&false))) {{
            __CLR4_5_27ju7julx1doatj.R.inc(9801);return null;
        }
        }__CLR4_5_27ju7julx1doatj.R.inc(9802);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_27ju7julx1doatj.R.inc(9803);position.setValid(parser.group(index++).compareTo("1") == 0);

        // Time
        __CLR4_5_27ju7julx1doatj.R.inc(9804);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_27ju7julx1doatj.R.inc(9805);time.clear();
        __CLR4_5_27ju7julx1doatj.R.inc(9806);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9807);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_27ju7julx1doatj.R.inc(9808);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9809);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9810);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9811);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9812);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_27ju7julx1doatj.R.inc(9813);String hemisphere = parser.group(index++);
        __CLR4_5_27ju7julx1doatj.R.inc(9814);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_27ju7julx1doatj.R.inc(9815);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_27ju7julx1doatj.R.inc(9816);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_27ju7julx1doatj.R.iget(9817)!=0|true))||(__CLR4_5_27ju7julx1doatj.R.iget(9818)==0&false))) {__CLR4_5_27ju7julx1doatj.R.inc(9819);longitude = -longitude;
        }__CLR4_5_27ju7julx1doatj.R.inc(9820);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_27ju7julx1doatj.R.inc(9821);hemisphere = parser.group(index++);
        __CLR4_5_27ju7julx1doatj.R.inc(9822);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_27ju7julx1doatj.R.inc(9823);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_27ju7julx1doatj.R.inc(9824);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_27ju7julx1doatj.R.iget(9825)!=0|true))||(__CLR4_5_27ju7julx1doatj.R.iget(9826)==0&false))) {__CLR4_5_27ju7julx1doatj.R.inc(9827);latitude = -latitude;
        }__CLR4_5_27ju7julx1doatj.R.inc(9828);position.setLatitude(latitude);

        // Speed
        __CLR4_5_27ju7julx1doatj.R.inc(9829);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_27ju7julx1doatj.R.inc(9830);position.setCourse(Double.valueOf(parser.group(index++)));

        // Other
        __CLR4_5_27ju7julx1doatj.R.inc(9831);position.set(Event.KEY_GSM, parser.group(index++));
        __CLR4_5_27ju7julx1doatj.R.inc(9832);position.set(Event.KEY_EVENT, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9833);position.set(Event.PREFIX_ADC + 1, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9834);position.set(Event.KEY_BATTERY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_27ju7julx1doatj.R.inc(9835);position.set(Event.KEY_INPUT, parser.group(index++));
        __CLR4_5_27ju7julx1doatj.R.inc(9836);position.set(Event.KEY_STATUS, parser.group(index++));
        __CLR4_5_27ju7julx1doatj.R.inc(9837);return position;
    }finally{__CLR4_5_27ju7julx1doatj.R.flushNeeded();}}

}
