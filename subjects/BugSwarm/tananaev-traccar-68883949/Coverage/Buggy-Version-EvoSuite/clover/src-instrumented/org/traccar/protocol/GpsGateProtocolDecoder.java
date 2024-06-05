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
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.model.Position;

public class GpsGateProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23wq3wqlx1dh3s3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,5151,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GpsGateProtocolDecoder(GpsGateProtocol protocol) {
        super(protocol);__CLR4_5_23wq3wqlx1dh3s3.R.inc(5067);try{__CLR4_5_23wq3wqlx1dh3s3.R.inc(5066);
    }finally{__CLR4_5_23wq3wqlx1dh3s3.R.flushNeeded();}}

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

    private void send(Channel channel, String message) {try{__CLR4_5_23wq3wqlx1dh3s3.R.inc(5068);
        __CLR4_5_23wq3wqlx1dh3s3.R.inc(5069);if ((((channel != null)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5070)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5071)==0&false))) {{
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5072);channel.write(message + Crc.nmeaChecksum(message) + "\r\n");
        }
    }}finally{__CLR4_5_23wq3wqlx1dh3s3.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_23wq3wqlx1dh3s3.R.inc(5073);

        __CLR4_5_23wq3wqlx1dh3s3.R.inc(5074);String sentence = (String) msg;
        
        // Process login
        __CLR4_5_23wq3wqlx1dh3s3.R.inc(5075);if ((((sentence.startsWith("$FRLIN,"))&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5076)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5077)==0&false))) {{
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5078);int beginIndex = sentence.indexOf(',', 7);
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5079);if ((((beginIndex != -1)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5080)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5081)==0&false))) {{
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5082);beginIndex += 1;
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5083);int endIndex = sentence.indexOf(',', beginIndex);
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5084);if ((((endIndex != -1)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5085)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5086)==0&false))) {{
                    __CLR4_5_23wq3wqlx1dh3s3.R.inc(5087);String imei = sentence.substring(beginIndex, endIndex);
                    __CLR4_5_23wq3wqlx1dh3s3.R.inc(5088);if ((((identify(imei, channel))&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5089)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5090)==0&false))) {{
                        __CLR4_5_23wq3wqlx1dh3s3.R.inc(5091);if ((((channel != null)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5092)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5093)==0&false))) {{
                            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5094);send(channel, "$FRSES," + channel.getId());
                        }
                    }} }else {{
                        __CLR4_5_23wq3wqlx1dh3s3.R.inc(5095);send(channel, "$FRERR,AuthError,Unknown device");
                    }
                }} }else {{
                    __CLR4_5_23wq3wqlx1dh3s3.R.inc(5096);send(channel, "$FRERR,AuthError,Parse error");
                }
            }} }else {{
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5097);send(channel, "$FRERR,AuthError,Parse error");
            }
        }}

        // Protocol version check
        }else {__CLR4_5_23wq3wqlx1dh3s3.R.inc(5098);if ((((sentence.startsWith("$FRVER,"))&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5099)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5100)==0&false))) {{
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5101);send(channel, "$FRVER,1,0,GpsGate Server 1.0");
        }

        // Process data
        }else {__CLR4_5_23wq3wqlx1dh3s3.R.inc(5102);if ((((sentence.startsWith("$GPRMC,") && hasDeviceId())&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5103)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5104)==0&false))) {{

            // Parse message
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5105);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5106);if ((((!parser.matches())&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5107)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5108)==0&false))) {{
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5109);return null;
            }

            // Create new position
            }__CLR4_5_23wq3wqlx1dh3s3.R.inc(5110);Position position = new Position();
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5111);position.setProtocol(getProtocolName());
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5112);position.setDeviceId(getDeviceId());

            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5113);Integer index = 1;

            // Time
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5114);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5115);time.clear();
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5116);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5117);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5118);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5119);index += 1; // Skip milliseconds

            // Validity
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5120);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5121);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5122);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5123);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5124)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5125)==0&false))) {__CLR4_5_23wq3wqlx1dh3s3.R.inc(5126);latitude = -latitude;
            }__CLR4_5_23wq3wqlx1dh3s3.R.inc(5127);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5128);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5129);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5130);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5131)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5132)==0&false))) {__CLR4_5_23wq3wqlx1dh3s3.R.inc(5133);longitude = -longitude;
            }__CLR4_5_23wq3wqlx1dh3s3.R.inc(5134);position.setLongitude(longitude);

            // Speed
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5135);String speed = parser.group(index++);
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5136);if ((((speed != null)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5137)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5138)==0&false))) {{
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5139);position.setSpeed(Double.valueOf(speed));
            }

            // Course
            }__CLR4_5_23wq3wqlx1dh3s3.R.inc(5140);String course = parser.group(index++);
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5141);if ((((course != null)&&(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5142)!=0|true))||(__CLR4_5_23wq3wqlx1dh3s3.R.iget(5143)==0&false))) {{
                __CLR4_5_23wq3wqlx1dh3s3.R.inc(5144);position.setCourse(Double.valueOf(course));
            }

            // Date
            }__CLR4_5_23wq3wqlx1dh3s3.R.inc(5145);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5146);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5147);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5148);position.setTime(time.getTime());
            __CLR4_5_23wq3wqlx1dh3s3.R.inc(5149);return position;
        }

        }}}__CLR4_5_23wq3wqlx1dh3s3.R.inc(5150);return null;
    }finally{__CLR4_5_23wq3wqlx1dh3s3.R.flushNeeded();}}

}
