/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Alex Wilson <alex@uq.edu.au>
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
import org.traccar.model.Position;

/**
 * Maxon Datamax GPS send protocol (NMEA + GPFID)
 * As seen in the MA100-1010 router
 *
 * It sends its identity after the GPRMC sentence, and with the type
 * GPFID.
 */
public class MaxonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24r04r0lx1dsn0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,6219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Position position = null;

    public MaxonProtocolDecoder(MaxonProtocol protocol) {
        super(protocol);__CLR4_5_24r04r0lx1dsn0h.R.inc(6157);try{__CLR4_5_24r04r0lx1dsn0h.R.inc(6156);
    }finally{__CLR4_5_24r04r0lx1dsn0h.R.flushNeeded();}}

    static private Pattern pattern = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.(\\d{2})," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d{5})," + // Latitude (DDMM.MMMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d{5})," + // Longitude (DDDMM.MMMMM)
            "([EW])," +
            "(\\d+\\.\\d{3})?," +          // Speed
            "(\\d+\\.\\d{2})?," +          // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");                         // Other (Checksumm)

    static private Pattern gpfidPattern = Pattern.compile("\\$GPFID,(\\d+)$");

    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24r04r0lx1dsn0h.R.inc(6158);

        __CLR4_5_24r04r0lx1dsn0h.R.inc(6159);String sentence = (String) msg;

        // Detect device ID
        // Parse message
        __CLR4_5_24r04r0lx1dsn0h.R.inc(6160);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6161)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6162)==0&false))) {{

            // Parse message
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6163);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6164);if ((((!parser.matches())&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6165)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6166)==0&false))) {{
                __CLR4_5_24r04r0lx1dsn0h.R.inc(6167);return null;
            }

            // Create new position
            }__CLR4_5_24r04r0lx1dsn0h.R.inc(6168);position = new Position();

            __CLR4_5_24r04r0lx1dsn0h.R.inc(6169);Integer index = 1;

            // Time
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6170);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6171);time.clear();
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6172);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6173);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6174);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6175);index += 1; // Skip milliseconds

            // Validity
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6176);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6177);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6178);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6179);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6180)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6181)==0&false))) {__CLR4_5_24r04r0lx1dsn0h.R.inc(6182);latitude = -latitude;
            }__CLR4_5_24r04r0lx1dsn0h.R.inc(6183);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6184);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6185);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6186);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6187)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6188)==0&false))) {__CLR4_5_24r04r0lx1dsn0h.R.inc(6189);longitude = -longitude;
            }__CLR4_5_24r04r0lx1dsn0h.R.inc(6190);position.setLongitude(longitude);

            // Speed
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6191);String speed = parser.group(index++);
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6192);if ((((speed != null)&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6193)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6194)==0&false))) {{
                __CLR4_5_24r04r0lx1dsn0h.R.inc(6195);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_24r04r0lx1dsn0h.R.inc(6196);String course = parser.group(index++);
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6197);if ((((course != null)&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6198)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6199)==0&false))) {{
                __CLR4_5_24r04r0lx1dsn0h.R.inc(6200);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_24r04r0lx1dsn0h.R.inc(6201);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6202);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6203);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6204);position.setTime(time.getTime());

        } }else {__CLR4_5_24r04r0lx1dsn0h.R.inc(6205);if ((((sentence.contains("$GPFID") && position != null)&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6206)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6207)==0&false))) {{
            __CLR4_5_24r04r0lx1dsn0h.R.inc(6208);Matcher parser = gpfidPattern.matcher(sentence);

            __CLR4_5_24r04r0lx1dsn0h.R.inc(6209);if ((((parser.matches())&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6210)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6211)==0&false))) {{
                __CLR4_5_24r04r0lx1dsn0h.R.inc(6212);if ((((!identify(parser.group(1), channel))&&(__CLR4_5_24r04r0lx1dsn0h.R.iget(6213)!=0|true))||(__CLR4_5_24r04r0lx1dsn0h.R.iget(6214)==0&false))) {{
                    __CLR4_5_24r04r0lx1dsn0h.R.inc(6215);return null;
                }
                }__CLR4_5_24r04r0lx1dsn0h.R.inc(6216);position.setDeviceId(getDeviceId());
                __CLR4_5_24r04r0lx1dsn0h.R.inc(6217);return position;
            }
        }}

        }}__CLR4_5_24r04r0lx1dsn0h.R.inc(6218);return null;
    }finally{__CLR4_5_24r04r0lx1dsn0h.R.flushNeeded();}}

}
