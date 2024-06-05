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
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Tlt2hProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27r87r8lx1e50h2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,10118,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tlt2hProtocolDecoder(Tlt2hProtocol protocol) {
        super(protocol);__CLR4_5_27r87r8lx1e50h2.R.inc(10053);try{__CLR4_5_27r87r8lx1e50h2.R.inc(10052);
    }finally{__CLR4_5_27r87r8lx1e50h2.R.flushNeeded();}}

    private static final Pattern patternHeader = Pattern.compile(
            "#(\\d+)#" +                   // IMEI
            "[^#]+#" +
            "\\d+#" +
            "([^#]+)#" +                   // Status
            "\\d+");                       // Number of records

    private static final Pattern patternPosition = Pattern.compile(
            "#([0-9a-f]+)?" +              // Cell info
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.(\\d+)," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +     // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +     // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)?," +            // Speed
            "(\\d+\\.\\d+)?," +            // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");                         // Other (Checksumm)

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27r87r8lx1e50h2.R.inc(10054);

        __CLR4_5_27r87r8lx1e50h2.R.inc(10055);String sentence = (String) msg;
        __CLR4_5_27r87r8lx1e50h2.R.inc(10056);sentence = sentence.trim();

        // Decode header
        __CLR4_5_27r87r8lx1e50h2.R.inc(10057);String header = sentence.substring(0, sentence.indexOf('\r'));
        __CLR4_5_27r87r8lx1e50h2.R.inc(10058);Matcher parser = patternHeader.matcher(header);
        __CLR4_5_27r87r8lx1e50h2.R.inc(10059);if ((((!parser.matches())&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10060)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10061)==0&false))) {{
            __CLR4_5_27r87r8lx1e50h2.R.inc(10062);return null;
        }

        // Get device identifier
        }__CLR4_5_27r87r8lx1e50h2.R.inc(10063);if ((((!identify(parser.group(1), channel))&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10064)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10065)==0&false))) {{
            __CLR4_5_27r87r8lx1e50h2.R.inc(10066);return null;
        }

        // Get status
        }__CLR4_5_27r87r8lx1e50h2.R.inc(10067);String status = parser.group(2);
        
        __CLR4_5_27r87r8lx1e50h2.R.inc(10068);String[] messages = sentence.substring(sentence.indexOf('\n') + 1).split("\r\n");
        __CLR4_5_27r87r8lx1e50h2.R.inc(10069);List<Position> positions = new LinkedList<>();
        
        __CLR4_5_27r87r8lx1e50h2.R.inc(10070);for (String message : messages) {{
            __CLR4_5_27r87r8lx1e50h2.R.inc(10071);parser = patternPosition.matcher(message);
            __CLR4_5_27r87r8lx1e50h2.R.inc(10072);if ((((parser.matches())&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10073)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10074)==0&false))) {{
                __CLR4_5_27r87r8lx1e50h2.R.inc(10075);Position position = new Position();
                __CLR4_5_27r87r8lx1e50h2.R.inc(10076);position.setProtocol(getProtocolName());
                __CLR4_5_27r87r8lx1e50h2.R.inc(10077);position.setDeviceId(getDeviceId());

                __CLR4_5_27r87r8lx1e50h2.R.inc(10078);Integer index = 1;
                
                // Cell
                __CLR4_5_27r87r8lx1e50h2.R.inc(10079);position.set(Event.KEY_CELL, parser.group(index++));

                // Time
                __CLR4_5_27r87r8lx1e50h2.R.inc(10080);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10081);time.clear();
                __CLR4_5_27r87r8lx1e50h2.R.inc(10082);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10083);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10084);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10085);index += 1; // Skip milliseconds

                // Validity
                __CLR4_5_27r87r8lx1e50h2.R.inc(10086);position.setValid(parser.group(index++).compareTo("A") == 0);

                // Latitude
                __CLR4_5_27r87r8lx1e50h2.R.inc(10087);Double latitude = Double.valueOf(parser.group(index++));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10088);latitude += Double.valueOf(parser.group(index++)) / 60;
                __CLR4_5_27r87r8lx1e50h2.R.inc(10089);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10090)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10091)==0&false))) {__CLR4_5_27r87r8lx1e50h2.R.inc(10092);latitude = -latitude;
                }__CLR4_5_27r87r8lx1e50h2.R.inc(10093);position.setLatitude(latitude);

                // Longitude
                __CLR4_5_27r87r8lx1e50h2.R.inc(10094);Double longitude = Double.valueOf(parser.group(index++));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10095);longitude += Double.valueOf(parser.group(index++)) / 60;
                __CLR4_5_27r87r8lx1e50h2.R.inc(10096);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10097)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10098)==0&false))) {__CLR4_5_27r87r8lx1e50h2.R.inc(10099);longitude = -longitude;
                }__CLR4_5_27r87r8lx1e50h2.R.inc(10100);position.setLongitude(longitude);

                // Speed
                __CLR4_5_27r87r8lx1e50h2.R.inc(10101);String speed = parser.group(index++);
                __CLR4_5_27r87r8lx1e50h2.R.inc(10102);if ((((speed != null)&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10103)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10104)==0&false))) {{
                    __CLR4_5_27r87r8lx1e50h2.R.inc(10105);position.setSpeed(Double.valueOf(speed));
                }

                // Course
                }__CLR4_5_27r87r8lx1e50h2.R.inc(10106);String course = parser.group(index++);
                __CLR4_5_27r87r8lx1e50h2.R.inc(10107);if ((((course != null)&&(__CLR4_5_27r87r8lx1e50h2.R.iget(10108)!=0|true))||(__CLR4_5_27r87r8lx1e50h2.R.iget(10109)==0&false))) {{
                    __CLR4_5_27r87r8lx1e50h2.R.inc(10110);position.setCourse(Double.valueOf(course));
                }

                // Date
                }__CLR4_5_27r87r8lx1e50h2.R.inc(10111);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10112);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_27r87r8lx1e50h2.R.inc(10113);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
                __CLR4_5_27r87r8lx1e50h2.R.inc(10114);position.setTime(time.getTime());
                
                // Status
                __CLR4_5_27r87r8lx1e50h2.R.inc(10115);position.set(Event.KEY_STATUS, status);
                __CLR4_5_27r87r8lx1e50h2.R.inc(10116);positions.add(position);
            }
        }}

        }__CLR4_5_27r87r8lx1e50h2.R.inc(10117);return positions;
    }finally{__CLR4_5_27r87r8lx1e50h2.R.flushNeeded();}}

}
