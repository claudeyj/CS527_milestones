/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.model.Position;

public class Tr20ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27zk7zklx1e50iy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,10407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tr20ProtocolDecoder(Tr20Protocol protocol) {
        super(protocol);__CLR4_5_27zk7zklx1e50iy.R.inc(10353);try{__CLR4_5_27zk7zklx1e50iy.R.inc(10352);
    }finally{__CLR4_5_27zk7zklx1e50iy.R.flushNeeded();}}

    private static final Pattern patternPing = Pattern.compile(
            "%%[^,]+,(\\d+)");

    private static final Pattern patternData = Pattern.compile(
            "%%" +
            "([^,]+)," +                   // Id
            "([AL])," +                    // Validity
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([NS])" +
            "(\\d{2})(\\d{2}\\.\\d+)" +    // Latitude (DDMM.MMMM)
            "([EW])" +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "(\\d+)," +                    // Speed
            "(\\d+)," +                    // Course
            ".*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27zk7zklx1e50iy.R.inc(10354);

        __CLR4_5_27zk7zklx1e50iy.R.inc(10355);String sentence = (String) msg;

        // Keep alive message
        __CLR4_5_27zk7zklx1e50iy.R.inc(10356);Matcher parser = patternPing.matcher(sentence);
        __CLR4_5_27zk7zklx1e50iy.R.inc(10357);if ((((parser.matches())&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10358)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10359)==0&false))) {{

            // Send response
            __CLR4_5_27zk7zklx1e50iy.R.inc(10360);if ((((channel != null)&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10361)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10362)==0&false))) {{
                __CLR4_5_27zk7zklx1e50iy.R.inc(10363);channel.write("&&" + parser.group(1) + "\r\n");
            }
        }} }else {{

            // Data message parse
            __CLR4_5_27zk7zklx1e50iy.R.inc(10364);parser = patternData.matcher(sentence);

            // Unknown message
            __CLR4_5_27zk7zklx1e50iy.R.inc(10365);if ((((!parser.matches())&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10366)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10367)==0&false))) {{
                __CLR4_5_27zk7zklx1e50iy.R.inc(10368);return null;
            }

            // Create new position
            }__CLR4_5_27zk7zklx1e50iy.R.inc(10369);Position position = new Position();
            __CLR4_5_27zk7zklx1e50iy.R.inc(10370);position.setProtocol(getProtocolName());

            __CLR4_5_27zk7zklx1e50iy.R.inc(10371);Integer index = 1;

            // Get device by id
            __CLR4_5_27zk7zklx1e50iy.R.inc(10372);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10373)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10374)==0&false))) {{
                __CLR4_5_27zk7zklx1e50iy.R.inc(10375);return null;
            }
            }__CLR4_5_27zk7zklx1e50iy.R.inc(10376);position.setDeviceId(getDeviceId());

            // Validity
            __CLR4_5_27zk7zklx1e50iy.R.inc(10377);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Time
            __CLR4_5_27zk7zklx1e50iy.R.inc(10378);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10379);time.clear();
            __CLR4_5_27zk7zklx1e50iy.R.inc(10380);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++)));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10381);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
            __CLR4_5_27zk7zklx1e50iy.R.inc(10382);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10383);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++)));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10384);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++)));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10385);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++)));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10386);position.setTime(time.getTime());

            // Latitude
            __CLR4_5_27zk7zklx1e50iy.R.inc(10387);int hemisphere = 1;
            __CLR4_5_27zk7zklx1e50iy.R.inc(10388);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10389)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10390)==0&false))) {__CLR4_5_27zk7zklx1e50iy.R.inc(10391);hemisphere = -1;
            }__CLR4_5_27zk7zklx1e50iy.R.inc(10392);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10393);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27zk7zklx1e50iy.R.inc(10394);position.setLatitude(latitude * hemisphere);

            // Longitude
            __CLR4_5_27zk7zklx1e50iy.R.inc(10395);hemisphere = 1;
            __CLR4_5_27zk7zklx1e50iy.R.inc(10396);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27zk7zklx1e50iy.R.iget(10397)!=0|true))||(__CLR4_5_27zk7zklx1e50iy.R.iget(10398)==0&false))) {__CLR4_5_27zk7zklx1e50iy.R.inc(10399);hemisphere = -1;
            }__CLR4_5_27zk7zklx1e50iy.R.inc(10400);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27zk7zklx1e50iy.R.inc(10401);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27zk7zklx1e50iy.R.inc(10402);position.setLongitude(longitude * hemisphere);

            // Speed
            __CLR4_5_27zk7zklx1e50iy.R.inc(10403);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(parser.group(index++))));

            // Course
            __CLR4_5_27zk7zklx1e50iy.R.inc(10404);position.setCourse(Double.valueOf(parser.group(index++)));

            __CLR4_5_27zk7zklx1e50iy.R.inc(10405);return position;
        }

        }__CLR4_5_27zk7zklx1e50iy.R.inc(10406);return null;
    }finally{__CLR4_5_27zk7zklx1e50iy.R.flushNeeded();}}

}
