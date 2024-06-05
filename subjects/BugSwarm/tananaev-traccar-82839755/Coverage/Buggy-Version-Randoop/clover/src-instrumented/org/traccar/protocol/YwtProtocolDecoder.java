/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

public class YwtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28x98x9lx1e45pe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,11641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public YwtProtocolDecoder(YwtProtocol protocol) {
        super(protocol);__CLR4_5_28x98x9lx1e45pe.R.inc(11566);try{__CLR4_5_28x98x9lx1e45pe.R.inc(11565);
    }finally{__CLR4_5_28x98x9lx1e45pe.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "%(..)," +                     // Type
            "(\\d+):" +                    // Unit identifier
            "\\d+," +                      // Subtype
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (YYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([EW])" +
            "(\\d{3}\\.\\d{6})," +         // Longitude (DDDMM.MMMM)
            "([NS])" +
            "(\\d{2}\\.\\d{6})," +         // Latitude (DDMM.MMMM)
            "(\\d+)?," +                   // Altitude
            "(\\d+)," +                    // Speed
            "(\\d+)," +                    // Course
            "(\\d+)," +                    // Satellite
            "([^,]+)," +                   // Report identifier
            "([0-9a-fA-F\\-]+)" +          // Status
            ".*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_28x98x9lx1e45pe.R.inc(11567);

        __CLR4_5_28x98x9lx1e45pe.R.inc(11568);String sentence = (String) msg;

        // Synchronization
        __CLR4_5_28x98x9lx1e45pe.R.inc(11569);if ((((sentence.startsWith("%SN") && channel != null)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11570)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11571)==0&false))) {{
            __CLR4_5_28x98x9lx1e45pe.R.inc(11572);int start = sentence.indexOf(':');
            __CLR4_5_28x98x9lx1e45pe.R.inc(11573);int end = start;
            __CLR4_5_28x98x9lx1e45pe.R.inc(11574);for (int i = 0; (((i < 4)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11575)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11576)==0&false)); i++) {{
                __CLR4_5_28x98x9lx1e45pe.R.inc(11577);end = sentence.indexOf(',', end + 1);
            }
            }__CLR4_5_28x98x9lx1e45pe.R.inc(11578);if ((((end == -1)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11579)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11580)==0&false))) {{
                __CLR4_5_28x98x9lx1e45pe.R.inc(11581);end = sentence.length();
            }
            
            }__CLR4_5_28x98x9lx1e45pe.R.inc(11582);channel.write("%AT+SN=" + sentence.substring(start, end));
            __CLR4_5_28x98x9lx1e45pe.R.inc(11583);return null;
        }
        
        // Parse message
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11584);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11585);if ((((!parser.matches())&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11586)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11587)==0&false))) {{
            __CLR4_5_28x98x9lx1e45pe.R.inc(11588);return null;
        }
        
        // Create new position
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11589);Position position = new Position();
        __CLR4_5_28x98x9lx1e45pe.R.inc(11590);position.setProtocol(getProtocolName());
        __CLR4_5_28x98x9lx1e45pe.R.inc(11591);Integer index = 1;
        __CLR4_5_28x98x9lx1e45pe.R.inc(11592);String type = parser.group(index++);

        // Device
        __CLR4_5_28x98x9lx1e45pe.R.inc(11593);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11594)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11595)==0&false))) {{
            __CLR4_5_28x98x9lx1e45pe.R.inc(11596);return null;
        }
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11597);position.setDeviceId(getDeviceId());
        
        // Time
        __CLR4_5_28x98x9lx1e45pe.R.inc(11598);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11599);time.clear();
        __CLR4_5_28x98x9lx1e45pe.R.inc(11600);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11601);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11602);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11603);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11604);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11605);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11606);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_28x98x9lx1e45pe.R.inc(11607);String hemisphere = parser.group(index++);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11608);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11609);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11610)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11611)==0&false))) {__CLR4_5_28x98x9lx1e45pe.R.inc(11612);longitude = -longitude;
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11613);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_28x98x9lx1e45pe.R.inc(11614);hemisphere = parser.group(index++);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11615);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11616);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11617)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11618)==0&false))) {__CLR4_5_28x98x9lx1e45pe.R.inc(11619);latitude = -latitude;
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11620);position.setLatitude(latitude);
        
        // Altitude
        __CLR4_5_28x98x9lx1e45pe.R.inc(11621);String altitude = parser.group(index++);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11622);if ((((altitude != null)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11623)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11624)==0&false))) {{
            __CLR4_5_28x98x9lx1e45pe.R.inc(11625);position.setAltitude(Double.valueOf(altitude));
        }

        // Speed
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11626);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_28x98x9lx1e45pe.R.inc(11627);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // Satellites
        __CLR4_5_28x98x9lx1e45pe.R.inc(11628);int satellites = Integer.valueOf(parser.group(index++));
        __CLR4_5_28x98x9lx1e45pe.R.inc(11629);position.setValid(satellites >= 3);
        __CLR4_5_28x98x9lx1e45pe.R.inc(11630);position.set(Event.KEY_SATELLITES, satellites);
        
        // Report identifier
        __CLR4_5_28x98x9lx1e45pe.R.inc(11631);String reportId = parser.group(index++);
        
        // Status
        __CLR4_5_28x98x9lx1e45pe.R.inc(11632);position.set(Event.KEY_STATUS, parser.group(index++));

        // Send response
        __CLR4_5_28x98x9lx1e45pe.R.inc(11633);if ((((type.equals("KP") || type.equals("EP") || type.equals("EP"))&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11634)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11635)==0&false))) {{
            __CLR4_5_28x98x9lx1e45pe.R.inc(11636);if ((((channel != null)&&(__CLR4_5_28x98x9lx1e45pe.R.iget(11637)!=0|true))||(__CLR4_5_28x98x9lx1e45pe.R.iget(11638)==0&false))) {{
                __CLR4_5_28x98x9lx1e45pe.R.inc(11639);channel.write("%AT+" + type + "=" + reportId + "\r\n");
            }
        }}
        }__CLR4_5_28x98x9lx1e45pe.R.inc(11640);return position;
    }finally{__CLR4_5_28x98x9lx1e45pe.R.flushNeeded();}}

}
