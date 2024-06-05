/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

public class Gps103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_240h40hlx1e67ww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,5329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps103ProtocolDecoder(Gps103Protocol protocol) {
        super(protocol);__CLR4_5_240h40hlx1e67ww.R.inc(5202);try{__CLR4_5_240h40hlx1e67ww.R.inc(5201);
    }finally{__CLR4_5_240h40hlx1e67ww.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "imei:" +
            "(\\d+)," +                         // IMEI
            "([^,]+)," +                        // Alarm
            "(\\d{2})/?(\\d{2})/?(\\d{2})\\s?" + // Local Date
            "(\\d{2}):?(\\d{2})(?:\\d{2})?," +  // Local Time
            "[^,]*," +
            "[FL]," +                           // F - full / L - low
            "(?:(\\d{2})(\\d{2})(\\d{2})\\.(\\d+)|" + // Time UTC (HHMMSS.SSS)
            "(?:\\d{1,5}\\.\\d+))," +
            "([AV])," +                         // Validity
            "(?:([NS]),)?" +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Latitude (DDMM.MMMM)
            "(?:([NS]),)?" +
            "(?:([EW]),)?" +
            "(\\d+)(\\d{2}\\.\\d+)," +          // Longitude (DDDMM.MMMM)
            "(?:([EW])?,)?" +
            "(\\d+\\.?\\d*)?,?" +               // Speed
            "(\\d+\\.?\\d*)?,?" +               // Course
            "(\\d+\\.?\\d*)?,?" +               // Altitude
            "([^,;]+)?,?" +
            "([^,;]+)?,?" +
            "([^,;]+)?,?" +
            "([^,;]+)?,?" +
            "([^,;]+)?,?" +
            ".*");

    private static final Pattern handshakePattern = Pattern.compile("##,imei:(\\d+),A");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_240h40hlx1e67ww.R.inc(5203);

        __CLR4_5_240h40hlx1e67ww.R.inc(5204);String sentence = (String) msg;

        // Send response #1
        __CLR4_5_240h40hlx1e67ww.R.inc(5205);if ((((sentence.contains("##"))&&(__CLR4_5_240h40hlx1e67ww.R.iget(5206)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5207)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5208);if ((((channel != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5209)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5210)==0&false))) {{
                __CLR4_5_240h40hlx1e67ww.R.inc(5211);channel.write("LOAD", remoteAddress);
                __CLR4_5_240h40hlx1e67ww.R.inc(5212);Matcher handshakeMatcher = handshakePattern.matcher(sentence);
                __CLR4_5_240h40hlx1e67ww.R.inc(5213);if ((((handshakeMatcher.matches())&&(__CLR4_5_240h40hlx1e67ww.R.iget(5214)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5215)==0&false))) {{
                    __CLR4_5_240h40hlx1e67ww.R.inc(5216);identify(handshakeMatcher.group(1), channel);
                }
            }}
            }__CLR4_5_240h40hlx1e67ww.R.inc(5217);return null;
        }

        // Send response #2
        }__CLR4_5_240h40hlx1e67ww.R.inc(5218);if ((((sentence.length() == 15 && Character.isDigit(sentence.charAt(0)))&&(__CLR4_5_240h40hlx1e67ww.R.iget(5219)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5220)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5221);if ((((channel != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5222)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5223)==0&false))) {{
                __CLR4_5_240h40hlx1e67ww.R.inc(5224);channel.write("ON", remoteAddress);
            }
            }__CLR4_5_240h40hlx1e67ww.R.inc(5225);return null;
        }

        // Parse message
        }__CLR4_5_240h40hlx1e67ww.R.inc(5226);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_240h40hlx1e67ww.R.inc(5227);if ((((!parser.matches())&&(__CLR4_5_240h40hlx1e67ww.R.iget(5228)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5229)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5230);return null;
        }

        // Create new position
        }__CLR4_5_240h40hlx1e67ww.R.inc(5231);Position position = new Position();
        __CLR4_5_240h40hlx1e67ww.R.inc(5232);position.setProtocol(getProtocolName());

        __CLR4_5_240h40hlx1e67ww.R.inc(5233);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_240h40hlx1e67ww.R.inc(5234);String imei = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5235);if ((((!identify(imei, channel, remoteAddress))&&(__CLR4_5_240h40hlx1e67ww.R.iget(5236)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5237)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5238);return null;
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5239);position.setDeviceId(getDeviceId());

        // Alarm message
        __CLR4_5_240h40hlx1e67ww.R.inc(5240);String alarm = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5241);position.set(Event.KEY_ALARM, alarm);
        __CLR4_5_240h40hlx1e67ww.R.inc(5242);if ((((channel != null && alarm.equals("help me"))&&(__CLR4_5_240h40hlx1e67ww.R.iget(5243)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5244)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5245);channel.write("**,imei:" + imei + ",E;", remoteAddress);
        }

        // Date
        }__CLR4_5_240h40hlx1e67ww.R.inc(5246);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_240h40hlx1e67ww.R.inc(5247);time.clear();
        __CLR4_5_240h40hlx1e67ww.R.inc(5248);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_240h40hlx1e67ww.R.inc(5249);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_240h40hlx1e67ww.R.inc(5250);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        
        __CLR4_5_240h40hlx1e67ww.R.inc(5251);int localHours = Integer.valueOf(parser.group(index++));
        __CLR4_5_240h40hlx1e67ww.R.inc(5252);int localMinutes = Integer.valueOf(parser.group(index++));
        
        __CLR4_5_240h40hlx1e67ww.R.inc(5253);String utcHours = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5254);String utcMinutes = parser.group(index++);

        // Time
        __CLR4_5_240h40hlx1e67ww.R.inc(5255);time.set(Calendar.HOUR_OF_DAY, localHours);
        __CLR4_5_240h40hlx1e67ww.R.inc(5256);time.set(Calendar.MINUTE, localMinutes);
        __CLR4_5_240h40hlx1e67ww.R.inc(5257);String seconds = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5258);if ((((seconds != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5259)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5260)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5261);time.set(Calendar.SECOND, Integer.valueOf(seconds));
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5262);String milliseconds = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5263);if ((((milliseconds != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5264)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5265)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5266);time.set(Calendar.MILLISECOND, Integer.valueOf(milliseconds));
        }
        
        // Timezone calculation
        }__CLR4_5_240h40hlx1e67ww.R.inc(5267);if ((((utcHours != null && utcMinutes != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5268)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5269)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5270);int deltaMinutes = (localHours - Integer.valueOf(utcHours)) * 60;
            __CLR4_5_240h40hlx1e67ww.R.inc(5271);deltaMinutes += localMinutes - Integer.valueOf(utcMinutes);
            __CLR4_5_240h40hlx1e67ww.R.inc(5272);if ((((deltaMinutes <= -12 * 60)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5273)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5274)==0&false))) {{
                __CLR4_5_240h40hlx1e67ww.R.inc(5275);deltaMinutes += 24 * 60;
            } }else {__CLR4_5_240h40hlx1e67ww.R.inc(5276);if ((((deltaMinutes > 12 * 60)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5277)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5278)==0&false))) {{
                __CLR4_5_240h40hlx1e67ww.R.inc(5279);deltaMinutes -= 24 * 60;
            }
            }}__CLR4_5_240h40hlx1e67ww.R.inc(5280);time.add(Calendar.MINUTE, -deltaMinutes);
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5281);position.setTime(time.getTime());

        // Validity
        __CLR4_5_240h40hlx1e67ww.R.inc(5282);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_240h40hlx1e67ww.R.inc(5283);String hemisphere = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5284);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_240h40hlx1e67ww.R.inc(5285);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_240h40hlx1e67ww.R.inc(5286);if ((((parser.group(index) != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5287)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5288)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5289);hemisphere = parser.group(index);
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5290);index++;
        __CLR4_5_240h40hlx1e67ww.R.inc(5291);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5292)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5293)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5294);latitude = -latitude;
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5295);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_240h40hlx1e67ww.R.inc(5296);hemisphere = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5297);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_240h40hlx1e67ww.R.inc(5298);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_240h40hlx1e67ww.R.inc(5299);if ((((parser.group(index) != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5300)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5301)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5302);hemisphere = parser.group(index);
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5303);index++;
        __CLR4_5_240h40hlx1e67ww.R.inc(5304);if ((((hemisphere != null && hemisphere.compareTo("W") == 0)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5305)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5306)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5307);longitude = -longitude;
        }
        }__CLR4_5_240h40hlx1e67ww.R.inc(5308);position.setLongitude(longitude);

        // Speed
        __CLR4_5_240h40hlx1e67ww.R.inc(5309);String speed = parser.group(index++);        
        __CLR4_5_240h40hlx1e67ww.R.inc(5310);if ((((speed != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5311)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5312)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5313);position.setSpeed(Double.valueOf(speed));
        }
        
        // Course
        }__CLR4_5_240h40hlx1e67ww.R.inc(5314);String course = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5315);if ((((course != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5316)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5317)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5318);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_240h40hlx1e67ww.R.inc(5319);String altitude = parser.group(index++);
        __CLR4_5_240h40hlx1e67ww.R.inc(5320);if ((((altitude != null)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5321)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5322)==0&false))) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5323);position.setAltitude(Double.valueOf(altitude));
        }

        // Additional data
        }__CLR4_5_240h40hlx1e67ww.R.inc(5324);for (int i = 1; (((i <= 5)&&(__CLR4_5_240h40hlx1e67ww.R.iget(5325)!=0|true))||(__CLR4_5_240h40hlx1e67ww.R.iget(5326)==0&false)); i++) {{
            __CLR4_5_240h40hlx1e67ww.R.inc(5327);position.set(Event.PREFIX_IO + 1, parser.group(index++));
        }

        }__CLR4_5_240h40hlx1e67ww.R.inc(5328);return position;
    }finally{__CLR4_5_240h40hlx1e67ww.R.flushNeeded();}}

}
