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

public class MegastekProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24t04t0lx1doa0m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,6360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MegastekProtocolDecoder(MegastekProtocol protocol) {
        super(protocol);__CLR4_5_24t04t0lx1doa0m.R.inc(6229);try{__CLR4_5_24t04t0lx1doa0m.R.inc(6228);
    }finally{__CLR4_5_24t04t0lx1doa0m.R.flushNeeded();}}

    private static final Pattern patternGPRMC = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.\\d+," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d+)(\\d{2}\\.\\d+)," +     // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d+)(\\d{2}\\.\\d+)," +     // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)?," +            // Speed
            "(\\d+\\.\\d+)?," +            // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            "[^\\*]+\\*[0-9a-fA-F]{2}");   // Checksum

    private static final Pattern patternSimple = Pattern.compile(
            "[FL]," +                      // Flag
            "([^,]*)," +                   // Alarm
            "imei:(\\d+)," +               // IMEI
            "(\\d+/?\\d*)?," +             // Satellites
            "(\\d+\\.\\d+)?," +            // Altitude
            "Battery=(\\d+)%,," +          // Battery
            "(\\d)?," +                    // Charger
            "(\\d+)?," +                   // MCC
            "(\\d+)?," +                   // MNC
            "(\\p{XDigit}{4},\\p{XDigit}{4});" + // Location code
            ".+");                         // Checksum

    private static final Pattern patternAlternative = Pattern.compile(
            "(\\d+)," +                    // MCC
            "(\\d+)," +                    // MNC
            "(\\p{XDigit}{4},\\p{XDigit}{4})," + // Location code
            "(\\d+)," +                    // GSM signal
            "(\\d+)," +                    // Battery
            "(\\d+)," +                    // Flags
            "(\\d+)," +                    // Inputs
            "(?:(\\d+),)?" +               // Outputs
            "(\\d\\.?\\d*)," +             // ADC 1
            "(?:(\\d\\.\\d{2})," +         // ADC 2
            "(\\d\\.\\d{2}),)?" +          // ADC 3
            "([^;]+);" +                   // Alarm
            ".*");                         // Checksum

    private boolean parseGPRMC(String gprmc, Position position) {try{__CLR4_5_24t04t0lx1doa0m.R.inc(6230);
        
        // Parse message
        __CLR4_5_24t04t0lx1doa0m.R.inc(6231);Matcher parser = patternGPRMC.matcher(gprmc);
        __CLR4_5_24t04t0lx1doa0m.R.inc(6232);if ((((!parser.matches())&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6233)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6234)==0&false))) {{
            __CLR4_5_24t04t0lx1doa0m.R.inc(6235);return false;
        }

        }__CLR4_5_24t04t0lx1doa0m.R.inc(6236);int index = 1;

        // Time
        __CLR4_5_24t04t0lx1doa0m.R.inc(6237);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6238);time.clear();
        __CLR4_5_24t04t0lx1doa0m.R.inc(6239);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6240);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6241);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_24t04t0lx1doa0m.R.inc(6242);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_24t04t0lx1doa0m.R.inc(6243);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6244);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24t04t0lx1doa0m.R.inc(6245);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6246)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6247)==0&false))) {__CLR4_5_24t04t0lx1doa0m.R.inc(6248);latitude = -latitude;
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6249);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_24t04t0lx1doa0m.R.inc(6250);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6251);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24t04t0lx1doa0m.R.inc(6252);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6253)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6254)==0&false))) {__CLR4_5_24t04t0lx1doa0m.R.inc(6255);longitude = -longitude;
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6256);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24t04t0lx1doa0m.R.inc(6257);String speed = parser.group(index++);
        __CLR4_5_24t04t0lx1doa0m.R.inc(6258);if ((((speed != null)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6259)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6260)==0&false))) {{
            __CLR4_5_24t04t0lx1doa0m.R.inc(6261);position.setSpeed(Double.valueOf(speed));
        }

        // Course
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6262);String course = parser.group(index++);
        __CLR4_5_24t04t0lx1doa0m.R.inc(6263);if ((((course != null)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6264)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6265)==0&false))) {{
            __CLR4_5_24t04t0lx1doa0m.R.inc(6266);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6267);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6268);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24t04t0lx1doa0m.R.inc(6269);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24t04t0lx1doa0m.R.inc(6270);position.setTime(time.getTime());        

        __CLR4_5_24t04t0lx1doa0m.R.inc(6271);return true;
    }finally{__CLR4_5_24t04t0lx1doa0m.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24t04t0lx1doa0m.R.inc(6272);

        __CLR4_5_24t04t0lx1doa0m.R.inc(6273);String sentence = (String) msg;

        // Detect type
        __CLR4_5_24t04t0lx1doa0m.R.inc(6274);boolean simple = (sentence.charAt(3) == ',' || sentence.charAt(6) == ',');

        // Split message
        __CLR4_5_24t04t0lx1doa0m.R.inc(6275);String id;
        __CLR4_5_24t04t0lx1doa0m.R.inc(6276);String gprmc;
        __CLR4_5_24t04t0lx1doa0m.R.inc(6277);String status;
        __CLR4_5_24t04t0lx1doa0m.R.inc(6278);if ((((simple)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6279)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6280)==0&false))) {{

            __CLR4_5_24t04t0lx1doa0m.R.inc(6281);int beginIndex = sentence.indexOf(',') + 1;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6282);int endIndex = sentence.indexOf(',', beginIndex);
            __CLR4_5_24t04t0lx1doa0m.R.inc(6283);id = sentence.substring(beginIndex, endIndex);

            __CLR4_5_24t04t0lx1doa0m.R.inc(6284);beginIndex = endIndex + 1;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6285);endIndex = sentence.indexOf('*', beginIndex) + 3;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6286);gprmc = sentence.substring(beginIndex, endIndex);

            __CLR4_5_24t04t0lx1doa0m.R.inc(6287);beginIndex = endIndex + 1;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6288);status = sentence.substring(beginIndex);
        
        } }else {{

            __CLR4_5_24t04t0lx1doa0m.R.inc(6289);int beginIndex = 3;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6290);int endIndex = beginIndex + 16;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6291);id = sentence.substring(beginIndex, endIndex).trim();

            __CLR4_5_24t04t0lx1doa0m.R.inc(6292);beginIndex = endIndex + 2;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6293);endIndex = sentence.indexOf('*', beginIndex) + 3;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6294);gprmc = sentence.substring(beginIndex, endIndex);

            __CLR4_5_24t04t0lx1doa0m.R.inc(6295);beginIndex = endIndex + 1;
            __CLR4_5_24t04t0lx1doa0m.R.inc(6296);status = sentence.substring(beginIndex);
        
        }

        // Create new position
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6297);Position position = new Position();
        __CLR4_5_24t04t0lx1doa0m.R.inc(6298);position.setProtocol(getProtocolName());

        // Parse location data
        __CLR4_5_24t04t0lx1doa0m.R.inc(6299);if ((((!parseGPRMC(gprmc, position))&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6300)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6301)==0&false))) {{
            __CLR4_5_24t04t0lx1doa0m.R.inc(6302);return null;
        }
        
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6303);if ((((simple)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6304)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6305)==0&false))) {{

            // Parse status
            __CLR4_5_24t04t0lx1doa0m.R.inc(6306);Matcher parser = patternSimple.matcher(status);
            __CLR4_5_24t04t0lx1doa0m.R.inc(6307);if ((((!parser.matches())&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6308)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6309)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6310);return null;
            }
            
            }__CLR4_5_24t04t0lx1doa0m.R.inc(6311);int index = 1;

            // Alarm
            __CLR4_5_24t04t0lx1doa0m.R.inc(6312);position.set(Event.KEY_ALARM, parser.group(index++));

            // IMEI
            __CLR4_5_24t04t0lx1doa0m.R.inc(6313);if ((((!identify(parser.group(index++), channel, null, false))&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6314)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6315)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6316);if ((((!identify(id, channel))&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6317)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6318)==0&false))) {{
                    __CLR4_5_24t04t0lx1doa0m.R.inc(6319);return null;
                }
            }}
            }__CLR4_5_24t04t0lx1doa0m.R.inc(6320);position.setDeviceId(getDeviceId());

            // Satellites
            __CLR4_5_24t04t0lx1doa0m.R.inc(6321);position.set(Event.KEY_SATELLITES, parser.group(index++));

            // Altitude
            __CLR4_5_24t04t0lx1doa0m.R.inc(6322);String altitude = parser.group(index++);
            __CLR4_5_24t04t0lx1doa0m.R.inc(6323);if ((((altitude != null)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6324)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6325)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6326);position.setAltitude(Double.valueOf(altitude));
            }

            // Battery
            }__CLR4_5_24t04t0lx1doa0m.R.inc(6327);position.set(Event.KEY_POWER, Double.valueOf(parser.group(index++)));

            // Charger
            __CLR4_5_24t04t0lx1doa0m.R.inc(6328);String charger = parser.group(index++);
            __CLR4_5_24t04t0lx1doa0m.R.inc(6329);if ((((charger != null)&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6330)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6331)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6332);position.set(Event.KEY_CHARGE, Integer.valueOf(charger) == 1);
            }

            }__CLR4_5_24t04t0lx1doa0m.R.inc(6333);position.set(Event.KEY_MCC, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6334);position.set(Event.KEY_MNC, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6335);position.set(Event.KEY_LAC, parser.group(index++));
            
        } }else {{

            // Parse status
            __CLR4_5_24t04t0lx1doa0m.R.inc(6336);Matcher parser = patternAlternative.matcher(status);
            __CLR4_5_24t04t0lx1doa0m.R.inc(6337);if ((((!parser.matches())&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6338)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6339)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6340);return null;
            }
            
            }__CLR4_5_24t04t0lx1doa0m.R.inc(6341);int index = 1;

            __CLR4_5_24t04t0lx1doa0m.R.inc(6342);if ((((!identify(id, channel))&&(__CLR4_5_24t04t0lx1doa0m.R.iget(6343)!=0|true))||(__CLR4_5_24t04t0lx1doa0m.R.iget(6344)==0&false))) {{
                __CLR4_5_24t04t0lx1doa0m.R.inc(6345);return null;
            }
            }__CLR4_5_24t04t0lx1doa0m.R.inc(6346);position.setDeviceId(getDeviceId());

            __CLR4_5_24t04t0lx1doa0m.R.inc(6347);position.set(Event.KEY_MCC, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6348);position.set(Event.KEY_MNC, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6349);position.set(Event.KEY_LAC, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6350);position.set(Event.KEY_GSM, parser.group(index++));

            // Battery
            __CLR4_5_24t04t0lx1doa0m.R.inc(6351);position.set(Event.KEY_BATTERY, Double.valueOf(parser.group(index++)));
            
            __CLR4_5_24t04t0lx1doa0m.R.inc(6352);position.set(Event.KEY_FLAGS, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6353);position.set(Event.KEY_INPUT, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6354);position.set(Event.KEY_OUTPUT, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6355);position.set(Event.PREFIX_ADC + 1, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6356);position.set(Event.PREFIX_ADC + 2, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6357);position.set(Event.PREFIX_ADC + 3, parser.group(index++));
            __CLR4_5_24t04t0lx1doa0m.R.inc(6358);position.set(Event.KEY_ALARM, parser.group(index++));
            
        }
        }__CLR4_5_24t04t0lx1doa0m.R.inc(6359);return position;
    }finally{__CLR4_5_24t04t0lx1doa0m.R.flushNeeded();}}

}
