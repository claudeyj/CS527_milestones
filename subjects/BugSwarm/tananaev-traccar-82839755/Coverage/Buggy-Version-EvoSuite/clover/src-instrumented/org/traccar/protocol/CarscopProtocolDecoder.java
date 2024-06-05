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

public class CarscopProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22wo2wolx1e367d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,3822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CarscopProtocolDecoder(CarscopProtocol protocol) {
        super(protocol);__CLR4_5_22wo2wolx1e367d.R.inc(3769);try{__CLR4_5_22wo2wolx1e367d.R.inc(3768);
    }finally{__CLR4_5_22wo2wolx1e367d.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\*.*" +
            "(\\d{2})(\\d{2})(\\d{2})" + // Time (HHMMSS)
            "([AV])" +                   // Validity
            "(\\d{2})(\\d{2}\\.\\d{4})" + // Latitude (DDMM.MMMM)
            "([NS])" +
            "(\\d{3})(\\d{2}\\.\\d{4})" + // Longitude (DDDMM.MMMM)
            "([EW])" +
            "(\\d{3}\\.\\d)" +           // Speed
            "(\\d{2})(\\d{2})(\\d{2})" + // Date (YYMMDD)
            "(\\d{3}\\.\\d{2})" +        // Course
            "(\\d{8})" +                 // State
            "L(\\d{6})");                // Odometer

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22wo2wolx1e367d.R.inc(3770);

        __CLR4_5_22wo2wolx1e367d.R.inc(3771);String sentence = (String) msg;

        // Device identification
        __CLR4_5_22wo2wolx1e367d.R.inc(3772);int index = sentence.indexOf("UB05");
        __CLR4_5_22wo2wolx1e367d.R.inc(3773);if ((((index != -1)&&(__CLR4_5_22wo2wolx1e367d.R.iget(3774)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3775)==0&false))) {{
            __CLR4_5_22wo2wolx1e367d.R.inc(3776);String imei = sentence.substring(index + 4, index + 4 + 15);
            __CLR4_5_22wo2wolx1e367d.R.inc(3777);identify(imei, channel);
        }
        }__CLR4_5_22wo2wolx1e367d.R.inc(3778);if ((((!hasDeviceId())&&(__CLR4_5_22wo2wolx1e367d.R.iget(3779)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3780)==0&false))) {{
            __CLR4_5_22wo2wolx1e367d.R.inc(3781);return null;
        }

        // Parse message
        }__CLR4_5_22wo2wolx1e367d.R.inc(3782);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_22wo2wolx1e367d.R.inc(3783);if ((((!parser.matches())&&(__CLR4_5_22wo2wolx1e367d.R.iget(3784)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3785)==0&false))) {{
            __CLR4_5_22wo2wolx1e367d.R.inc(3786);return null;
        }

        // Create new position
        }__CLR4_5_22wo2wolx1e367d.R.inc(3787);Position position = new Position();
        __CLR4_5_22wo2wolx1e367d.R.inc(3788);position.setDeviceId(getDeviceId());
        __CLR4_5_22wo2wolx1e367d.R.inc(3789);position.setProtocol(getProtocolName());
        __CLR4_5_22wo2wolx1e367d.R.inc(3790);index = 1;

        // Time
        __CLR4_5_22wo2wolx1e367d.R.inc(3791);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_22wo2wolx1e367d.R.inc(3792);time.clear();
        __CLR4_5_22wo2wolx1e367d.R.inc(3793);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22wo2wolx1e367d.R.inc(3794);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22wo2wolx1e367d.R.inc(3795);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_22wo2wolx1e367d.R.inc(3796);position.setValid((((parser.group(index++).compareTo("A") == 0 )&&(__CLR4_5_22wo2wolx1e367d.R.iget(3797)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3798)==0&false))? true : false);

        // Latitude
        __CLR4_5_22wo2wolx1e367d.R.inc(3799);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_22wo2wolx1e367d.R.inc(3800);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_22wo2wolx1e367d.R.inc(3801);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_22wo2wolx1e367d.R.iget(3802)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3803)==0&false))) {__CLR4_5_22wo2wolx1e367d.R.inc(3804);latitude = -latitude;
        }__CLR4_5_22wo2wolx1e367d.R.inc(3805);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_22wo2wolx1e367d.R.inc(3806);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_22wo2wolx1e367d.R.inc(3807);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_22wo2wolx1e367d.R.inc(3808);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_22wo2wolx1e367d.R.iget(3809)!=0|true))||(__CLR4_5_22wo2wolx1e367d.R.iget(3810)==0&false))) {__CLR4_5_22wo2wolx1e367d.R.inc(3811);longitude = -longitude;
        }__CLR4_5_22wo2wolx1e367d.R.inc(3812);position.setLongitude(longitude);

        // Speed
        __CLR4_5_22wo2wolx1e367d.R.inc(3813);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Date
        __CLR4_5_22wo2wolx1e367d.R.inc(3814);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_22wo2wolx1e367d.R.inc(3815);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_22wo2wolx1e367d.R.inc(3816);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22wo2wolx1e367d.R.inc(3817);position.setTime(time.getTime());

        // Course
        __CLR4_5_22wo2wolx1e367d.R.inc(3818);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // State
        __CLR4_5_22wo2wolx1e367d.R.inc(3819);position.set(Event.KEY_STATUS, parser.group(index++));

        // Odometer
        __CLR4_5_22wo2wolx1e367d.R.inc(3820);position.set(Event.KEY_ODOMETER, Integer.valueOf(parser.group(index++)));
        __CLR4_5_22wo2wolx1e367d.R.inc(3821);return position;
    }finally{__CLR4_5_22wo2wolx1e367d.R.flushNeeded();}}

}
