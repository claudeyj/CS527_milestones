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
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.model.Position;

public class GpsGateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2456456lx1e7zo6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,5455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsGateProtocolDecoder(GpsGateProtocol protocol) {
        super(protocol);__CLR4_5_2456456lx1e7zo6.R.inc(5371);try{__CLR4_5_2456456lx1e7zo6.R.inc(5370);
    }finally{__CLR4_5_2456456lx1e7zo6.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$GPRMC," +
            "(\\d{2})(\\d{2})(\\d{2})\\.?(\\d+)?," + // Time (HHMMSS.SSS)
            "([AV])," +                    // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)?," +            // Speed
            "(\\d+\\.\\d+)?," +            // Course
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            ".+");                         // Other (Checksumm)

    private void send(Channel channel, String message) {try{__CLR4_5_2456456lx1e7zo6.R.inc(5372);
        __CLR4_5_2456456lx1e7zo6.R.inc(5373);if ((((channel != null)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5374)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5375)==0&false))) {{
            __CLR4_5_2456456lx1e7zo6.R.inc(5376);channel.write(message + Crc.nmeaChecksum(message) + "\r\n");
        }
    }}finally{__CLR4_5_2456456lx1e7zo6.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_2456456lx1e7zo6.R.inc(5377);

        __CLR4_5_2456456lx1e7zo6.R.inc(5378);String sentence = (String) msg;
        
        // Process login
        __CLR4_5_2456456lx1e7zo6.R.inc(5379);if ((((sentence.startsWith("$FRLIN,"))&&(__CLR4_5_2456456lx1e7zo6.R.iget(5380)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5381)==0&false))) {{
            __CLR4_5_2456456lx1e7zo6.R.inc(5382);int beginIndex = sentence.indexOf(',', 7);
            __CLR4_5_2456456lx1e7zo6.R.inc(5383);if ((((beginIndex != -1)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5384)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5385)==0&false))) {{
                __CLR4_5_2456456lx1e7zo6.R.inc(5386);beginIndex += 1;
                __CLR4_5_2456456lx1e7zo6.R.inc(5387);int endIndex = sentence.indexOf(',', beginIndex);
                __CLR4_5_2456456lx1e7zo6.R.inc(5388);if ((((endIndex != -1)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5389)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5390)==0&false))) {{
                    __CLR4_5_2456456lx1e7zo6.R.inc(5391);String imei = sentence.substring(beginIndex, endIndex);
                    __CLR4_5_2456456lx1e7zo6.R.inc(5392);if ((((identify(imei, channel))&&(__CLR4_5_2456456lx1e7zo6.R.iget(5393)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5394)==0&false))) {{
                        __CLR4_5_2456456lx1e7zo6.R.inc(5395);if ((((channel != null)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5396)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5397)==0&false))) {{
                            __CLR4_5_2456456lx1e7zo6.R.inc(5398);send(channel, "$FRSES," + channel.getId());
                        }
                    }} }else {{
                        __CLR4_5_2456456lx1e7zo6.R.inc(5399);send(channel, "$FRERR,AuthError,Unknown device");
                    }
                }} }else {{
                    __CLR4_5_2456456lx1e7zo6.R.inc(5400);send(channel, "$FRERR,AuthError,Parse error");
                }
            }} }else {{
                __CLR4_5_2456456lx1e7zo6.R.inc(5401);send(channel, "$FRERR,AuthError,Parse error");
            }
        }}

        // Protocol version check
        }else {__CLR4_5_2456456lx1e7zo6.R.inc(5402);if ((((sentence.startsWith("$FRVER,"))&&(__CLR4_5_2456456lx1e7zo6.R.iget(5403)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5404)==0&false))) {{
            __CLR4_5_2456456lx1e7zo6.R.inc(5405);send(channel, "$FRVER,1,0,GpsGate Server 1.0");
        }

        // Process data
        }else {__CLR4_5_2456456lx1e7zo6.R.inc(5406);if ((((sentence.startsWith("$GPRMC,") && hasDeviceId())&&(__CLR4_5_2456456lx1e7zo6.R.iget(5407)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5408)==0&false))) {{

            // Parse message
            __CLR4_5_2456456lx1e7zo6.R.inc(5409);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_2456456lx1e7zo6.R.inc(5410);if ((((!parser.matches())&&(__CLR4_5_2456456lx1e7zo6.R.iget(5411)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5412)==0&false))) {{
                __CLR4_5_2456456lx1e7zo6.R.inc(5413);return null;
            }

            // Create new position
            }__CLR4_5_2456456lx1e7zo6.R.inc(5414);Position position = new Position();
            __CLR4_5_2456456lx1e7zo6.R.inc(5415);position.setProtocol(getProtocolName());
            __CLR4_5_2456456lx1e7zo6.R.inc(5416);position.setDeviceId(getDeviceId());

            __CLR4_5_2456456lx1e7zo6.R.inc(5417);Integer index = 1;

            // Time
            __CLR4_5_2456456lx1e7zo6.R.inc(5418);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_2456456lx1e7zo6.R.inc(5419);time.clear();
            __CLR4_5_2456456lx1e7zo6.R.inc(5420);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2456456lx1e7zo6.R.inc(5421);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2456456lx1e7zo6.R.inc(5422);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2456456lx1e7zo6.R.inc(5423);index += 1; // Skip milliseconds

            // Validity
            __CLR4_5_2456456lx1e7zo6.R.inc(5424);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_2456456lx1e7zo6.R.inc(5425);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2456456lx1e7zo6.R.inc(5426);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2456456lx1e7zo6.R.inc(5427);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5428)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5429)==0&false))) {__CLR4_5_2456456lx1e7zo6.R.inc(5430);latitude = -latitude;
            }__CLR4_5_2456456lx1e7zo6.R.inc(5431);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_2456456lx1e7zo6.R.inc(5432);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_2456456lx1e7zo6.R.inc(5433);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_2456456lx1e7zo6.R.inc(5434);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5435)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5436)==0&false))) {__CLR4_5_2456456lx1e7zo6.R.inc(5437);longitude = -longitude;
            }__CLR4_5_2456456lx1e7zo6.R.inc(5438);position.setLongitude(longitude);

            // Speed
            __CLR4_5_2456456lx1e7zo6.R.inc(5439);String speed = parser.group(index++);
            __CLR4_5_2456456lx1e7zo6.R.inc(5440);if ((((speed != null)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5441)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5442)==0&false))) {{
                __CLR4_5_2456456lx1e7zo6.R.inc(5443);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_2456456lx1e7zo6.R.inc(5444);String course = parser.group(index++);
            __CLR4_5_2456456lx1e7zo6.R.inc(5445);if ((((course != null)&&(__CLR4_5_2456456lx1e7zo6.R.iget(5446)!=0|true))||(__CLR4_5_2456456lx1e7zo6.R.iget(5447)==0&false))) {{
                __CLR4_5_2456456lx1e7zo6.R.inc(5448);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_2456456lx1e7zo6.R.inc(5449);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_2456456lx1e7zo6.R.inc(5450);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_2456456lx1e7zo6.R.inc(5451);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_2456456lx1e7zo6.R.inc(5452);position.setTime(time.getTime());
            __CLR4_5_2456456lx1e7zo6.R.inc(5453);return position;
        }

        }}}__CLR4_5_2456456lx1e7zo6.R.inc(5454);return null;
    }finally{__CLR4_5_2456456lx1e7zo6.R.flushNeeded();}}

}
