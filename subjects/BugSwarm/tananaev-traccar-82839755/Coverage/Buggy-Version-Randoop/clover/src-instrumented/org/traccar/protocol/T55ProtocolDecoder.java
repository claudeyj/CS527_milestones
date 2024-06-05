/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

public class T55ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2787787lx1e4574{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,9556,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T55ProtocolDecoder(T55Protocol protocol) {
        super(protocol);__CLR4_5_2787787lx1e4574.R.inc(9368);try{__CLR4_5_2787787lx1e4574.R.inc(9367);
    }finally{__CLR4_5_2787787lx1e4574.R.flushNeeded();}}

    private static final Pattern patternGPRMC = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{2,3})(\\d{2}\\.\\d+)," + // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +           // Speed
            "(\\d+\\.?\\d*)?," +           // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");

    private static final Pattern patternGPGGA = Pattern.compile(
            "\\$GPGGA," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time
            "(\\d+)(\\d{2}\\.\\d+)," +     // Latitude
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +     // Longitude
            "([EW])," +
            ".+");

    private static final Pattern patternGPRMA = Pattern.compile(
            "\\$GPRMA," +
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude
            "([EW]),,," +
            "(\\d+\\.?\\d*)?," +           // Speed
            "(\\d+\\.?\\d*)?," +           // Course
            ".+");
    
    private static final Pattern patternTRCCR = Pattern.compile(
            "\\$TRCCR," +
            "(\\d{4})(\\d{2})(\\d{2})" +   // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(-?\\d+\\.\\d+)," +           // Latitude
            "(-?\\d+\\.\\d+)," +           // Longitude
            "(\\d+\\.\\d+)," +             // Speed
            "(\\d+\\.\\d+)," +             // Course
            "(-?\\d+\\.\\d+)," +           // Altitude
            "(\\d+\\.?\\d*)," +            // Battery
            ".+");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_2787787lx1e4574.R.inc(9369);

        __CLR4_5_2787787lx1e4574.R.inc(9370);String sentence = (String) msg;
        
        __CLR4_5_2787787lx1e4574.R.inc(9371);if ((((!sentence.startsWith("$") && sentence.contains("$"))&&(__CLR4_5_2787787lx1e4574.R.iget(9372)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9373)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9374);int index = sentence.indexOf("$");
            __CLR4_5_2787787lx1e4574.R.inc(9375);String id = sentence.substring(0, index);
            __CLR4_5_2787787lx1e4574.R.inc(9376);if ((((id.endsWith(","))&&(__CLR4_5_2787787lx1e4574.R.iget(9377)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9378)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9379);id = id.substring(0, id.length() - 1);
            }
            }__CLR4_5_2787787lx1e4574.R.inc(9380);identify(id, channel);
            __CLR4_5_2787787lx1e4574.R.inc(9381);sentence = sentence.substring(index);
        }

        // Identification
        }__CLR4_5_2787787lx1e4574.R.inc(9382);if ((((sentence.startsWith("$PGID"))&&(__CLR4_5_2787787lx1e4574.R.iget(9383)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9384)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9385);identify(sentence.substring(6, sentence.length() - 3), channel);
        }

        // Identification
        }else {__CLR4_5_2787787lx1e4574.R.inc(9386);if ((((sentence.startsWith("$PCPTI"))&&(__CLR4_5_2787787lx1e4574.R.iget(9387)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9388)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9389);identify(sentence.substring(7, sentence.indexOf(",", 7)), channel);
        }

        // Identification
        }else {__CLR4_5_2787787lx1e4574.R.inc(9390);if ((((sentence.startsWith("IMEI"))&&(__CLR4_5_2787787lx1e4574.R.iget(9391)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9392)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9393);identify(sentence.substring(5, sentence.length()), channel);
        }

        // Identification
        }else {__CLR4_5_2787787lx1e4574.R.inc(9394);if ((((sentence.startsWith("$GPFID"))&&(__CLR4_5_2787787lx1e4574.R.iget(9395)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9396)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9397);identify(sentence.substring(6, sentence.length()), channel);
        }

        // Identification
        }else {__CLR4_5_2787787lx1e4574.R.inc(9398);if ((((Character.isDigit(sentence.charAt(0)) & sentence.length() == 15)&&(__CLR4_5_2787787lx1e4574.R.iget(9399)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9400)==0&false))) {{
            __CLR4_5_2787787lx1e4574.R.inc(9401);identify(sentence, channel);
        }

        // Location
        }else {__CLR4_5_2787787lx1e4574.R.inc(9402);if ((((sentence.startsWith("$GPRMC") && hasDeviceId())&&(__CLR4_5_2787787lx1e4574.R.iget(9403)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9404)==0&false))) {{

            // Send response
            __CLR4_5_2787787lx1e4574.R.inc(9405);if ((((channel != null)&&(__CLR4_5_2787787lx1e4574.R.iget(9406)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9407)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9408);channel.write("OK1\r\n");
            }

            // Parse message
            }__CLR4_5_2787787lx1e4574.R.inc(9409);Matcher parser = patternGPRMC.matcher(sentence);
            __CLR4_5_2787787lx1e4574.R.inc(9410);if ((((!parser.matches())&&(__CLR4_5_2787787lx1e4574.R.iget(9411)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9412)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9413);return null;
            }

            // Create new position
            }__CLR4_5_2787787lx1e4574.R.inc(9414);Position position = new Position();
            __CLR4_5_2787787lx1e4574.R.inc(9415);position.setProtocol(getProtocolName());
            __CLR4_5_2787787lx1e4574.R.inc(9416);position.setDeviceId(getDeviceId());

            __CLR4_5_2787787lx1e4574.R.inc(9417);Integer index = 1;

            // Time
            __CLR4_5_2787787lx1e4574.R.inc(9418);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2787787lx1e4574.R.inc(9419);time.clear();
            __CLR4_5_2787787lx1e4574.R.inc(9420);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9421);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9422);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

            // Validity
            __CLR4_5_2787787lx1e4574.R.inc(9423);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_2787787lx1e4574.R.inc(9424);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9425);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9426);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9427)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9428)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9429);latitude = -latitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9430);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_2787787lx1e4574.R.inc(9431);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9432);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9433);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9434)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9435)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9436);longitude = -longitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9437);position.setLongitude(longitude);

            // Speed
            __CLR4_5_2787787lx1e4574.R.inc(9438);String speed = parser.group(index++);
            __CLR4_5_2787787lx1e4574.R.inc(9439);if ((((speed != null)&&(__CLR4_5_2787787lx1e4574.R.iget(9440)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9441)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9442);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_2787787lx1e4574.R.inc(9443);String course = parser.group(index++);
            __CLR4_5_2787787lx1e4574.R.inc(9444);if ((((course != null)&&(__CLR4_5_2787787lx1e4574.R.iget(9445)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9446)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9447);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_2787787lx1e4574.R.inc(9448);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9449);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_2787787lx1e4574.R.inc(9450);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9451);position.setTime(time.getTime());
            __CLR4_5_2787787lx1e4574.R.inc(9452);return position;
        }

        // Location
        }else {__CLR4_5_2787787lx1e4574.R.inc(9453);if ((((sentence.startsWith("$GPGGA") && hasDeviceId())&&(__CLR4_5_2787787lx1e4574.R.iget(9454)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9455)==0&false))) {{

            // Parse message
            __CLR4_5_2787787lx1e4574.R.inc(9456);Matcher parser = patternGPGGA.matcher(sentence);
            __CLR4_5_2787787lx1e4574.R.inc(9457);if ((((!parser.matches())&&(__CLR4_5_2787787lx1e4574.R.iget(9458)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9459)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9460);return null;
            }

            // Create new position
            }__CLR4_5_2787787lx1e4574.R.inc(9461);Position position = new Position();
            __CLR4_5_2787787lx1e4574.R.inc(9462);position.setProtocol(getProtocolName());
            __CLR4_5_2787787lx1e4574.R.inc(9463);position.setDeviceId(getDeviceId());

            __CLR4_5_2787787lx1e4574.R.inc(9464);Integer index = 1;

            // Time
            __CLR4_5_2787787lx1e4574.R.inc(9465);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2787787lx1e4574.R.inc(9466);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9467);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9468);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9469);time.set(Calendar.MILLISECOND, 0);
            __CLR4_5_2787787lx1e4574.R.inc(9470);position.setTime(time.getTime());

            // Validity
            __CLR4_5_2787787lx1e4574.R.inc(9471);position.setValid(true);

            // Latitude
            __CLR4_5_2787787lx1e4574.R.inc(9472);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9473);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9474);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9475)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9476)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9477);latitude = -latitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9478);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_2787787lx1e4574.R.inc(9479);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9480);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9481);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9482)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9483)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9484);longitude = -longitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9485);position.setLongitude(longitude);
            __CLR4_5_2787787lx1e4574.R.inc(9486);return position;
        }

        // Location
        }else {__CLR4_5_2787787lx1e4574.R.inc(9487);if ((((sentence.startsWith("$GPRMA") && hasDeviceId())&&(__CLR4_5_2787787lx1e4574.R.iget(9488)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9489)==0&false))) {{

            // Parse message
            __CLR4_5_2787787lx1e4574.R.inc(9490);Matcher parser = patternGPRMA.matcher(sentence);
            __CLR4_5_2787787lx1e4574.R.inc(9491);if ((((!parser.matches())&&(__CLR4_5_2787787lx1e4574.R.iget(9492)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9493)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9494);return null;
            }

            // Create new position
            }__CLR4_5_2787787lx1e4574.R.inc(9495);Position position = new Position();
            __CLR4_5_2787787lx1e4574.R.inc(9496);position.setProtocol(getProtocolName());
            __CLR4_5_2787787lx1e4574.R.inc(9497);position.setDeviceId(getDeviceId());

            __CLR4_5_2787787lx1e4574.R.inc(9498);Integer index = 1;

            // Time
            __CLR4_5_2787787lx1e4574.R.inc(9499);position.setTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());

            // Validity
            __CLR4_5_2787787lx1e4574.R.inc(9500);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_2787787lx1e4574.R.inc(9501);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9502);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9503);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9504)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9505)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9506);latitude = -latitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9507);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_2787787lx1e4574.R.inc(9508);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9509);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2787787lx1e4574.R.inc(9510);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2787787lx1e4574.R.iget(9511)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9512)==0&false))) {__CLR4_5_2787787lx1e4574.R.inc(9513);longitude = -longitude;
            }__CLR4_5_2787787lx1e4574.R.inc(9514);position.setLongitude(longitude);

            // Speed
            __CLR4_5_2787787lx1e4574.R.inc(9515);String speed = parser.group(index++);
            __CLR4_5_2787787lx1e4574.R.inc(9516);if ((((speed != null)&&(__CLR4_5_2787787lx1e4574.R.iget(9517)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9518)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9519);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_2787787lx1e4574.R.inc(9520);String course = parser.group(index++);
            __CLR4_5_2787787lx1e4574.R.inc(9521);if ((((course != null)&&(__CLR4_5_2787787lx1e4574.R.iget(9522)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9523)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9524);position.setCourse(Double.valueOf(course));
            }
            }__CLR4_5_2787787lx1e4574.R.inc(9525);return position;
        }

        // Location
        }else {__CLR4_5_2787787lx1e4574.R.inc(9526);if ((((sentence.startsWith("$TRCCR") && hasDeviceId())&&(__CLR4_5_2787787lx1e4574.R.iget(9527)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9528)==0&false))) {{

            // Parse message
            __CLR4_5_2787787lx1e4574.R.inc(9529);Matcher parser = patternTRCCR.matcher(sentence);
            __CLR4_5_2787787lx1e4574.R.inc(9530);if ((((!parser.matches())&&(__CLR4_5_2787787lx1e4574.R.iget(9531)!=0|true))||(__CLR4_5_2787787lx1e4574.R.iget(9532)==0&false))) {{
                __CLR4_5_2787787lx1e4574.R.inc(9533);return null;
            }

            // Create new position
            }__CLR4_5_2787787lx1e4574.R.inc(9534);Position position = new Position();
            __CLR4_5_2787787lx1e4574.R.inc(9535);position.setProtocol(getProtocolName());
            __CLR4_5_2787787lx1e4574.R.inc(9536);position.setDeviceId(getDeviceId());

            __CLR4_5_2787787lx1e4574.R.inc(9537);Integer index = 1;

            // Time
            __CLR4_5_2787787lx1e4574.R.inc(9538);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2787787lx1e4574.R.inc(9539);time.clear();
            __CLR4_5_2787787lx1e4574.R.inc(9540);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9541);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_2787787lx1e4574.R.inc(9542);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9543);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9544);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9545);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9546);position.setTime(time.getTime());

            // Validity
            __CLR4_5_2787787lx1e4574.R.inc(9547);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Location
            __CLR4_5_2787787lx1e4574.R.inc(9548);position.setLatitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9549);position.setLongitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9550);position.setSpeed(Double.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9551);position.setCourse(Double.valueOf(parser.group(index++)));
            __CLR4_5_2787787lx1e4574.R.inc(9552);position.setAltitude(Double.valueOf(parser.group(index++)));

            // Battery
            __CLR4_5_2787787lx1e4574.R.inc(9553);position.set(Event.KEY_BATTERY, parser.group(index++));
            __CLR4_5_2787787lx1e4574.R.inc(9554);return position;
        }

        }}}}}}}}}__CLR4_5_2787787lx1e4574.R.inc(9555);return null;
    }finally{__CLR4_5_2787787lx1e4574.R.flushNeeded();}}

}
