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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class YwtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28fo8folx1dp979{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,11008,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public YwtProtocolDecoder(YwtProtocol protocol) {
        super(protocol);__CLR4_5_28fo8folx1dp979.R.inc(10933);try{__CLR4_5_28fo8folx1dp979.R.inc(10932);
    }finally{__CLR4_5_28fo8folx1dp979.R.flushNeeded();}}

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
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_28fo8folx1dp979.R.inc(10934);

        __CLR4_5_28fo8folx1dp979.R.inc(10935);String sentence = (String) msg;

        // Synchronization
        __CLR4_5_28fo8folx1dp979.R.inc(10936);if ((((sentence.startsWith("%SN") && channel != null)&&(__CLR4_5_28fo8folx1dp979.R.iget(10937)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10938)==0&false))) {{
            __CLR4_5_28fo8folx1dp979.R.inc(10939);int start = sentence.indexOf(':');
            __CLR4_5_28fo8folx1dp979.R.inc(10940);int end = start;
            __CLR4_5_28fo8folx1dp979.R.inc(10941);for (int i = 0; (((i < 4)&&(__CLR4_5_28fo8folx1dp979.R.iget(10942)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10943)==0&false)); i++) {{
                __CLR4_5_28fo8folx1dp979.R.inc(10944);end = sentence.indexOf(',', end + 1);
            }
            }__CLR4_5_28fo8folx1dp979.R.inc(10945);if ((((end == -1)&&(__CLR4_5_28fo8folx1dp979.R.iget(10946)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10947)==0&false))) {{
                __CLR4_5_28fo8folx1dp979.R.inc(10948);end = sentence.length();
            }
            
            }__CLR4_5_28fo8folx1dp979.R.inc(10949);channel.write("%AT+SN=" + sentence.substring(start, end));
            __CLR4_5_28fo8folx1dp979.R.inc(10950);return null;
        }
        
        // Parse message
        }__CLR4_5_28fo8folx1dp979.R.inc(10951);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_28fo8folx1dp979.R.inc(10952);if ((((!parser.matches())&&(__CLR4_5_28fo8folx1dp979.R.iget(10953)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10954)==0&false))) {{
            __CLR4_5_28fo8folx1dp979.R.inc(10955);return null;
        }
        
        // Create new position
        }__CLR4_5_28fo8folx1dp979.R.inc(10956);Position position = new Position();
        __CLR4_5_28fo8folx1dp979.R.inc(10957);position.setProtocol(getProtocolName());
        __CLR4_5_28fo8folx1dp979.R.inc(10958);Integer index = 1;
        __CLR4_5_28fo8folx1dp979.R.inc(10959);String type = parser.group(index++);

        // Device
        __CLR4_5_28fo8folx1dp979.R.inc(10960);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_28fo8folx1dp979.R.iget(10961)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10962)==0&false))) {{
            __CLR4_5_28fo8folx1dp979.R.inc(10963);return null;
        }
        }__CLR4_5_28fo8folx1dp979.R.inc(10964);position.setDeviceId(getDeviceId());
        
        // Time
        __CLR4_5_28fo8folx1dp979.R.inc(10965);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_28fo8folx1dp979.R.inc(10966);time.clear();
        __CLR4_5_28fo8folx1dp979.R.inc(10967);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_28fo8folx1dp979.R.inc(10968);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_28fo8folx1dp979.R.inc(10969);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28fo8folx1dp979.R.inc(10970);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28fo8folx1dp979.R.inc(10971);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28fo8folx1dp979.R.inc(10972);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_28fo8folx1dp979.R.inc(10973);position.setTime(time.getTime());

        // Longitude
        __CLR4_5_28fo8folx1dp979.R.inc(10974);String hemisphere = parser.group(index++);
        __CLR4_5_28fo8folx1dp979.R.inc(10975);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28fo8folx1dp979.R.inc(10976);if ((((hemisphere.compareTo("W") == 0)&&(__CLR4_5_28fo8folx1dp979.R.iget(10977)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10978)==0&false))) {__CLR4_5_28fo8folx1dp979.R.inc(10979);longitude = -longitude;
        }__CLR4_5_28fo8folx1dp979.R.inc(10980);position.setLongitude(longitude);

        // Latitude
        __CLR4_5_28fo8folx1dp979.R.inc(10981);hemisphere = parser.group(index++);
        __CLR4_5_28fo8folx1dp979.R.inc(10982);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_28fo8folx1dp979.R.inc(10983);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_28fo8folx1dp979.R.iget(10984)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10985)==0&false))) {__CLR4_5_28fo8folx1dp979.R.inc(10986);latitude = -latitude;
        }__CLR4_5_28fo8folx1dp979.R.inc(10987);position.setLatitude(latitude);
        
        // Altitude
        __CLR4_5_28fo8folx1dp979.R.inc(10988);String altitude = parser.group(index++);
        __CLR4_5_28fo8folx1dp979.R.inc(10989);if ((((altitude != null)&&(__CLR4_5_28fo8folx1dp979.R.iget(10990)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(10991)==0&false))) {{
            __CLR4_5_28fo8folx1dp979.R.inc(10992);position.setAltitude(Double.valueOf(altitude));
        }

        // Speed
        }__CLR4_5_28fo8folx1dp979.R.inc(10993);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_28fo8folx1dp979.R.inc(10994);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // Satellites
        __CLR4_5_28fo8folx1dp979.R.inc(10995);int satellites = Integer.valueOf(parser.group(index++));
        __CLR4_5_28fo8folx1dp979.R.inc(10996);position.setValid(satellites >= 3);
        __CLR4_5_28fo8folx1dp979.R.inc(10997);position.set(Event.KEY_SATELLITES, satellites);
        
        // Report identifier
        __CLR4_5_28fo8folx1dp979.R.inc(10998);String reportId = parser.group(index++);
        
        // Status
        __CLR4_5_28fo8folx1dp979.R.inc(10999);position.set(Event.KEY_STATUS, parser.group(index++));

        // Send response
        __CLR4_5_28fo8folx1dp979.R.inc(11000);if ((((type.equals("KP") || type.equals("EP") || type.equals("EP"))&&(__CLR4_5_28fo8folx1dp979.R.iget(11001)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(11002)==0&false))) {{
            __CLR4_5_28fo8folx1dp979.R.inc(11003);if ((((channel != null)&&(__CLR4_5_28fo8folx1dp979.R.iget(11004)!=0|true))||(__CLR4_5_28fo8folx1dp979.R.iget(11005)==0&false))) {{
                __CLR4_5_28fo8folx1dp979.R.inc(11006);channel.write("%AT+" + type + "=" + reportId + "\r\n");
            }
        }}
        }__CLR4_5_28fo8folx1dp979.R.inc(11007);return position;
    }finally{__CLR4_5_28fo8folx1dp979.R.flushNeeded();}}

}
