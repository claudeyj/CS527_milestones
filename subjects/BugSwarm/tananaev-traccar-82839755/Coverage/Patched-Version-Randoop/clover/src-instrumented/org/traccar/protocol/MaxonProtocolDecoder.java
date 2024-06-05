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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

/**
 * Maxon Datamax GPS send protocol (NMEA + GPFID)
 * As seen in the MA100-1010 router
 *
 * It sends its identity after the GPRMC sentence, and with the type
 * GPFID.
 */
public class MaxonProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2538538lx1e75ub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,6659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Position position = null;

    public MaxonProtocolDecoder(MaxonProtocol protocol) {
        super(protocol);__CLR4_5_2538538lx1e75ub.R.inc(6597);try{__CLR4_5_2538538lx1e75ub.R.inc(6596);
    }finally{__CLR4_5_2538538lx1e75ub.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
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

    private static final Pattern gpfidPattern = Pattern.compile("\\$GPFID,(\\d+)$");

    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_2538538lx1e75ub.R.inc(6598);

        __CLR4_5_2538538lx1e75ub.R.inc(6599);String sentence = (String) msg;

        // Detect device ID
        // Parse message
        __CLR4_5_2538538lx1e75ub.R.inc(6600);if ((((sentence.contains("$GPRMC"))&&(__CLR4_5_2538538lx1e75ub.R.iget(6601)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6602)==0&false))) {{

            // Parse message
            __CLR4_5_2538538lx1e75ub.R.inc(6603);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_2538538lx1e75ub.R.inc(6604);if ((((!parser.matches())&&(__CLR4_5_2538538lx1e75ub.R.iget(6605)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6606)==0&false))) {{
                __CLR4_5_2538538lx1e75ub.R.inc(6607);return null;
            }

            // Create new position
            }__CLR4_5_2538538lx1e75ub.R.inc(6608);position = new Position();

            __CLR4_5_2538538lx1e75ub.R.inc(6609);Integer index = 1;

            // Time
            __CLR4_5_2538538lx1e75ub.R.inc(6610);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2538538lx1e75ub.R.inc(6611);time.clear();
            __CLR4_5_2538538lx1e75ub.R.inc(6612);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2538538lx1e75ub.R.inc(6613);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2538538lx1e75ub.R.inc(6614);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2538538lx1e75ub.R.inc(6615);index += 1; // Skip milliseconds

            // Validity
            __CLR4_5_2538538lx1e75ub.R.inc(6616);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_2538538lx1e75ub.R.inc(6617);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2538538lx1e75ub.R.inc(6618);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2538538lx1e75ub.R.inc(6619);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2538538lx1e75ub.R.iget(6620)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6621)==0&false))) {__CLR4_5_2538538lx1e75ub.R.inc(6622);latitude = -latitude;
            }__CLR4_5_2538538lx1e75ub.R.inc(6623);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_2538538lx1e75ub.R.inc(6624);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2538538lx1e75ub.R.inc(6625);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2538538lx1e75ub.R.inc(6626);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2538538lx1e75ub.R.iget(6627)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6628)==0&false))) {__CLR4_5_2538538lx1e75ub.R.inc(6629);longitude = -longitude;
            }__CLR4_5_2538538lx1e75ub.R.inc(6630);position.setLongitude(longitude);

            // Speed
            __CLR4_5_2538538lx1e75ub.R.inc(6631);String speed = parser.group(index++);
            __CLR4_5_2538538lx1e75ub.R.inc(6632);if ((((speed != null)&&(__CLR4_5_2538538lx1e75ub.R.iget(6633)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6634)==0&false))) {{
                __CLR4_5_2538538lx1e75ub.R.inc(6635);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_2538538lx1e75ub.R.inc(6636);String course = parser.group(index++);
            __CLR4_5_2538538lx1e75ub.R.inc(6637);if ((((course != null)&&(__CLR4_5_2538538lx1e75ub.R.iget(6638)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6639)==0&false))) {{
                __CLR4_5_2538538lx1e75ub.R.inc(6640);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_2538538lx1e75ub.R.inc(6641);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2538538lx1e75ub.R.inc(6642);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_2538538lx1e75ub.R.inc(6643);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_2538538lx1e75ub.R.inc(6644);position.setTime(time.getTime());

        } }else {__CLR4_5_2538538lx1e75ub.R.inc(6645);if ((((sentence.contains("$GPFID") && position != null)&&(__CLR4_5_2538538lx1e75ub.R.iget(6646)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6647)==0&false))) {{
            __CLR4_5_2538538lx1e75ub.R.inc(6648);Matcher parser = gpfidPattern.matcher(sentence);

            __CLR4_5_2538538lx1e75ub.R.inc(6649);if ((((parser.matches())&&(__CLR4_5_2538538lx1e75ub.R.iget(6650)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6651)==0&false))) {{
                __CLR4_5_2538538lx1e75ub.R.inc(6652);if ((((!identify(parser.group(1), channel))&&(__CLR4_5_2538538lx1e75ub.R.iget(6653)!=0|true))||(__CLR4_5_2538538lx1e75ub.R.iget(6654)==0&false))) {{
                    __CLR4_5_2538538lx1e75ub.R.inc(6655);return null;
                }
                }__CLR4_5_2538538lx1e75ub.R.inc(6656);position.setDeviceId(getDeviceId());
                __CLR4_5_2538538lx1e75ub.R.inc(6657);return position;
            }
        }}

        }}__CLR4_5_2538538lx1e75ub.R.inc(6658);return null;
    }finally{__CLR4_5_2538538lx1e75ub.R.flushNeeded();}}

}
