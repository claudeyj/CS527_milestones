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

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Tlt2hProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_279t79tlx1dsnrm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,9491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tlt2hProtocolDecoder(Tlt2hProtocol protocol) {
        super(protocol);__CLR4_5_279t79tlx1dsnrm.R.inc(9426);try{__CLR4_5_279t79tlx1dsnrm.R.inc(9425);
    }finally{__CLR4_5_279t79tlx1dsnrm.R.flushNeeded();}}

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
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_279t79tlx1dsnrm.R.inc(9427);

        __CLR4_5_279t79tlx1dsnrm.R.inc(9428);String sentence = (String) msg;
        __CLR4_5_279t79tlx1dsnrm.R.inc(9429);sentence = sentence.trim();

        // Decode header
        __CLR4_5_279t79tlx1dsnrm.R.inc(9430);String header = sentence.substring(0, sentence.indexOf('\r'));
        __CLR4_5_279t79tlx1dsnrm.R.inc(9431);Matcher parser = patternHeader.matcher(header);
        __CLR4_5_279t79tlx1dsnrm.R.inc(9432);if ((((!parser.matches())&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9433)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9434)==0&false))) {{
            __CLR4_5_279t79tlx1dsnrm.R.inc(9435);return null;
        }

        // Get device identifier
        }__CLR4_5_279t79tlx1dsnrm.R.inc(9436);if ((((!identify(parser.group(1), channel))&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9437)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9438)==0&false))) {{
            __CLR4_5_279t79tlx1dsnrm.R.inc(9439);return null;
        }

        // Get status
        }__CLR4_5_279t79tlx1dsnrm.R.inc(9440);String status = parser.group(2);
        
        __CLR4_5_279t79tlx1dsnrm.R.inc(9441);String[] messages = sentence.substring(sentence.indexOf('\n') + 1).split("\r\n");
        __CLR4_5_279t79tlx1dsnrm.R.inc(9442);List<Position> positions = new LinkedList<Position>();
        
        __CLR4_5_279t79tlx1dsnrm.R.inc(9443);for (String message : messages) {{
            __CLR4_5_279t79tlx1dsnrm.R.inc(9444);parser = patternPosition.matcher(message);
            __CLR4_5_279t79tlx1dsnrm.R.inc(9445);if ((((parser.matches())&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9446)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9447)==0&false))) {{
                __CLR4_5_279t79tlx1dsnrm.R.inc(9448);Position position = new Position();
                __CLR4_5_279t79tlx1dsnrm.R.inc(9449);position.setProtocol(getProtocolName());
                __CLR4_5_279t79tlx1dsnrm.R.inc(9450);position.setDeviceId(getDeviceId());

                __CLR4_5_279t79tlx1dsnrm.R.inc(9451);Integer index = 1;
                
                // Cell
                __CLR4_5_279t79tlx1dsnrm.R.inc(9452);position.set(Event.KEY_CELL, parser.group(index++));

                // Time
                __CLR4_5_279t79tlx1dsnrm.R.inc(9453);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9454);time.clear();
                __CLR4_5_279t79tlx1dsnrm.R.inc(9455);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9456);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9457);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9458);index += 1; // Skip milliseconds

                // Validity
                __CLR4_5_279t79tlx1dsnrm.R.inc(9459);position.setValid(parser.group(index++).compareTo("A") == 0);

                // Latitude
                __CLR4_5_279t79tlx1dsnrm.R.inc(9460);Double latitude = Double.valueOf(parser.group(index++));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9461);latitude += Double.valueOf(parser.group(index++)) / 60;
                __CLR4_5_279t79tlx1dsnrm.R.inc(9462);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9463)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9464)==0&false))) {__CLR4_5_279t79tlx1dsnrm.R.inc(9465);latitude = -latitude;
                }__CLR4_5_279t79tlx1dsnrm.R.inc(9466);position.setLatitude(latitude);

                // Longitude
                __CLR4_5_279t79tlx1dsnrm.R.inc(9467);Double longitude = Double.valueOf(parser.group(index++));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9468);longitude += Double.valueOf(parser.group(index++)) / 60;
                __CLR4_5_279t79tlx1dsnrm.R.inc(9469);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9470)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9471)==0&false))) {__CLR4_5_279t79tlx1dsnrm.R.inc(9472);longitude = -longitude;
                }__CLR4_5_279t79tlx1dsnrm.R.inc(9473);position.setLongitude(longitude);

                // Speed
                __CLR4_5_279t79tlx1dsnrm.R.inc(9474);String speed = parser.group(index++);
                __CLR4_5_279t79tlx1dsnrm.R.inc(9475);if ((((speed != null)&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9476)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9477)==0&false))) {{
                    __CLR4_5_279t79tlx1dsnrm.R.inc(9478);position.setSpeed(Double.valueOf(speed));
                }

                // Course
                }__CLR4_5_279t79tlx1dsnrm.R.inc(9479);String course = parser.group(index++);
                __CLR4_5_279t79tlx1dsnrm.R.inc(9480);if ((((course != null)&&(__CLR4_5_279t79tlx1dsnrm.R.iget(9481)!=0|true))||(__CLR4_5_279t79tlx1dsnrm.R.iget(9482)==0&false))) {{
                    __CLR4_5_279t79tlx1dsnrm.R.inc(9483);position.setCourse(Double.valueOf(course));
                }

                // Date
                }__CLR4_5_279t79tlx1dsnrm.R.inc(9484);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9485);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
                __CLR4_5_279t79tlx1dsnrm.R.inc(9486);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
                __CLR4_5_279t79tlx1dsnrm.R.inc(9487);position.setTime(time.getTime());
                
                // Status
                __CLR4_5_279t79tlx1dsnrm.R.inc(9488);position.set(Event.KEY_STATUS, status);
                __CLR4_5_279t79tlx1dsnrm.R.inc(9489);positions.add(position);
            }
        }}

        }__CLR4_5_279t79tlx1dsnrm.R.inc(9490);return positions;
    }finally{__CLR4_5_279t79tlx1dsnrm.R.flushNeeded();}}

}
