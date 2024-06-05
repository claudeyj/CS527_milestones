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

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class T55ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26qz6qzlx1di8hu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,8936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public T55ProtocolDecoder(T55Protocol protocol) {
        super(protocol);__CLR4_5_26qz6qzlx1di8hu.R.inc(8748);try{__CLR4_5_26qz6qzlx1di8hu.R.inc(8747);
    }finally{__CLR4_5_26qz6qzlx1di8hu.R.flushNeeded();}}

    private static final Pattern patternGPRMC = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.?\\d*)?," +           // Speed
            "(\\d+\\.?\\d*)?," +           // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");

    private static final Pattern patternGPGGA = Pattern.compile(
            "\\$GPGGA," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?\\d*," + // Time
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude
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
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26qz6qzlx1di8hu.R.inc(8749);

        __CLR4_5_26qz6qzlx1di8hu.R.inc(8750);String sentence = (String) msg;
        
        __CLR4_5_26qz6qzlx1di8hu.R.inc(8751);if ((((!sentence.startsWith("$") && sentence.contains("$"))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8752)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8753)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8754);int index = sentence.indexOf("$");
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8755);String id = sentence.substring(0, index);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8756);if ((((id.endsWith(","))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8757)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8758)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8759);id = id.substring(0, id.length() - 1);
            }
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8760);identify(id, channel);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8761);sentence = sentence.substring(index);
        }

        // Identification
        }__CLR4_5_26qz6qzlx1di8hu.R.inc(8762);if ((((sentence.startsWith("$PGID"))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8763)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8764)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8765);identify(sentence.substring(6, sentence.length() - 3), channel);
        }

        // Identification
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8766);if ((((sentence.startsWith("$PCPTI"))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8767)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8768)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8769);identify(sentence.substring(7, sentence.indexOf(",", 7)), channel);
        }

        // Identification
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8770);if ((((sentence.startsWith("IMEI"))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8771)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8772)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8773);identify(sentence.substring(5, sentence.length()), channel);
        }

        // Identification
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8774);if ((((sentence.startsWith("$GPFID"))&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8775)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8776)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8777);identify(sentence.substring(6, sentence.length()), channel);
        }

        // Identification
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8778);if ((((Character.isDigit(sentence.charAt(0)) & sentence.length() == 15)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8779)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8780)==0&false))) {{
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8781);identify(sentence, channel);
        }

        // Location
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8782);if ((((sentence.startsWith("$GPRMC") && hasDeviceId())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8783)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8784)==0&false))) {{

            // Send response
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8785);if ((((channel != null)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8786)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8787)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8788);channel.write("OK1\r\n");
            }

            // Parse message
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8789);Matcher parser = patternGPRMC.matcher(sentence);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8790);if ((((!parser.matches())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8791)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8792)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8793);return null;
            }

            // Create new position
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8794);Position position = new Position();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8795);position.setProtocol(getProtocolName());
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8796);position.setDeviceId(getDeviceId());

            __CLR4_5_26qz6qzlx1di8hu.R.inc(8797);Integer index = 1;

            // Time
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8798);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8799);time.clear();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8800);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8801);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8802);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

            // Validity
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8803);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8804);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8805);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8806);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8807)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8808)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8809);latitude = -latitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8810);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8811);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8812);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8813);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8814)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8815)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8816);longitude = -longitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8817);position.setLongitude(longitude);

            // Speed
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8818);String speed = parser.group(index++);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8819);if ((((speed != null)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8820)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8821)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8822);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8823);String course = parser.group(index++);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8824);if ((((course != null)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8825)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8826)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8827);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8828);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8829);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8830);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8831);position.setTime(time.getTime());
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8832);return position;
        }

        // Location
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8833);if ((((sentence.startsWith("$GPGGA") && hasDeviceId())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8834)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8835)==0&false))) {{

            // Parse message
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8836);Matcher parser = patternGPGGA.matcher(sentence);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8837);if ((((!parser.matches())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8838)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8839)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8840);return null;
            }

            // Create new position
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8841);Position position = new Position();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8842);position.setProtocol(getProtocolName());
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8843);position.setDeviceId(getDeviceId());

            __CLR4_5_26qz6qzlx1di8hu.R.inc(8844);Integer index = 1;

            // Time
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8845);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8846);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8847);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8848);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8849);time.set(Calendar.MILLISECOND, 0);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8850);position.setTime(time.getTime());

            // Validity
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8851);position.setValid(true);

            // Latitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8852);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8853);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8854);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8855)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8856)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8857);latitude = -latitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8858);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8859);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8860);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8861);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8862)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8863)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8864);longitude = -longitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8865);position.setLongitude(longitude);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8866);return position;
        }

        // Location
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8867);if ((((sentence.startsWith("$GPRMA") && hasDeviceId())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8868)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8869)==0&false))) {{

            // Parse message
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8870);Matcher parser = patternGPRMA.matcher(sentence);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8871);if ((((!parser.matches())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8872)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8873)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8874);return null;
            }

            // Create new position
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8875);Position position = new Position();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8876);position.setProtocol(getProtocolName());
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8877);position.setDeviceId(getDeviceId());

            __CLR4_5_26qz6qzlx1di8hu.R.inc(8878);Integer index = 1;

            // Time
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8879);position.setTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());

            // Validity
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8880);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8881);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8882);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8883);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8884)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8885)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8886);latitude = -latitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8887);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8888);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8889);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8890);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8891)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8892)==0&false))) {__CLR4_5_26qz6qzlx1di8hu.R.inc(8893);longitude = -longitude;
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8894);position.setLongitude(longitude);

            // Speed
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8895);String speed = parser.group(index++);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8896);if ((((speed != null)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8897)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8898)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8899);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8900);String course = parser.group(index++);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8901);if ((((course != null)&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8902)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8903)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8904);position.setCourse(Double.valueOf(course));
            }
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8905);return position;
        }

        // Location
        }else {__CLR4_5_26qz6qzlx1di8hu.R.inc(8906);if ((((sentence.startsWith("$TRCCR") && hasDeviceId())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8907)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8908)==0&false))) {{

            // Parse message
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8909);Matcher parser = patternTRCCR.matcher(sentence);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8910);if ((((!parser.matches())&&(__CLR4_5_26qz6qzlx1di8hu.R.iget(8911)!=0|true))||(__CLR4_5_26qz6qzlx1di8hu.R.iget(8912)==0&false))) {{
                __CLR4_5_26qz6qzlx1di8hu.R.inc(8913);return null;
            }

            // Create new position
            }__CLR4_5_26qz6qzlx1di8hu.R.inc(8914);Position position = new Position();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8915);position.setProtocol(getProtocolName());
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8916);position.setDeviceId(getDeviceId());

            __CLR4_5_26qz6qzlx1di8hu.R.inc(8917);Integer index = 1;

            // Time
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8918);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8919);time.clear();
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8920);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8921);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8922);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8923);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8924);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8925);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8926);position.setTime(time.getTime());

            // Validity
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8927);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Location
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8928);position.setLatitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8929);position.setLongitude(Double.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8930);position.setSpeed(Double.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8931);position.setCourse(Double.valueOf(parser.group(index++)));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8932);position.setAltitude(Double.valueOf(parser.group(index++)));

            // Battery
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8933);position.set(Event.KEY_BATTERY, parser.group(index++));
            __CLR4_5_26qz6qzlx1di8hu.R.inc(8934);return position;
        }

        }}}}}}}}}__CLR4_5_26qz6qzlx1di8hu.R.inc(8935);return null;
    }finally{__CLR4_5_26qz6qzlx1di8hu.R.flushNeeded();}}

}
