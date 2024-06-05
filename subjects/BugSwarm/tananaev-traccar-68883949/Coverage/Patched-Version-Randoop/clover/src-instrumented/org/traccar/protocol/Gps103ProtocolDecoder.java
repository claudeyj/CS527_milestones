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
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gps103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23sx3sxlx1dp7ke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,5058,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gps103ProtocolDecoder(Gps103Protocol protocol) {
        super(protocol);__CLR4_5_23sx3sxlx1dp7ke.R.inc(4930);try{__CLR4_5_23sx3sxlx1dp7ke.R.inc(4929);
    }finally{__CLR4_5_23sx3sxlx1dp7ke.R.flushNeeded();}}

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
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23sx3sxlx1dp7ke.R.inc(4931);

        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4932);String sentence = (String) msg;

        // Send response #1
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4933);if ((((sentence.contains("##"))&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4934)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4935)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4936);if ((((channel != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4937)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4938)==0&false))) {{
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(4939);channel.write("LOAD", remoteAddress);
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(4940);Matcher handshakeMatcher = handshakePattern.matcher(sentence);
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(4941);if ((((handshakeMatcher.matches())&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4942)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4943)==0&false))) {{
                    __CLR4_5_23sx3sxlx1dp7ke.R.inc(4944);identify(handshakeMatcher.group(1), channel);
                }
            }}
            }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4945);return null;
        }

        // Send response #2
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4946);if ((((sentence.length() == 15 && Character.isDigit(sentence.charAt(0)))&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4947)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4948)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4949);if ((((channel != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4950)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4951)==0&false))) {{
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(4952);channel.write("ON", remoteAddress);
            }
            }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4953);return null;
        }

        // Parse message
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4954);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4955);if ((((!parser.matches())&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4956)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4957)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4958);return null;
        }

        // Create new position
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4959);Position position = new Position();
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4960);position.setProtocol(getProtocolName());

        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4961);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4962);String imei = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4963);if ((((!identify(imei, channel, remoteAddress))&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4964)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4965)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4966);return null;
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4967);position.setDeviceId(getDeviceId());

        // Alarm message
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4968);String alarm = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4969);position.set(Event.KEY_ALARM, alarm);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4970);if ((((channel != null && alarm.equals("help me"))&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4971)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4972)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4973);channel.write("**,imei:" + imei + ",E;", remoteAddress);
        }

        // Date
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4974);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4975);time.clear();
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4976);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4977);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4978);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4979);int localHours = Integer.valueOf(parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4980);int localMinutes = Integer.valueOf(parser.group(index++));
        
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4981);String utcHours = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4982);String utcMinutes = parser.group(index++);

        // Time
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4983);time.set(Calendar.HOUR_OF_DAY, localHours);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4984);time.set(Calendar.MINUTE, localMinutes);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4985);String seconds = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4986);if ((((seconds != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4987)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4988)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4989);time.set(Calendar.SECOND, Integer.valueOf(seconds));
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4990);String milliseconds = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(4991);if ((((milliseconds != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4992)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4993)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4994);time.set(Calendar.MILLISECOND, Integer.valueOf(milliseconds));
        }
        
        // Timezone calculation
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(4995);if ((((utcHours != null && utcMinutes != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4996)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(4997)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4998);int deltaMinutes = (localHours - Integer.valueOf(utcHours)) * 60;
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(4999);deltaMinutes += localMinutes - Integer.valueOf(utcMinutes);
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5000);if ((((deltaMinutes <= -12 * 60)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5001)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5002)==0&false))) {{
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(5003);deltaMinutes += 24 * 60;
            } }else {__CLR4_5_23sx3sxlx1dp7ke.R.inc(5004);if ((((deltaMinutes > 12 * 60)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5005)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5006)==0&false))) {{
                __CLR4_5_23sx3sxlx1dp7ke.R.inc(5007);deltaMinutes -= 24 * 60;
            }
            }}__CLR4_5_23sx3sxlx1dp7ke.R.inc(5008);time.add(Calendar.MINUTE, -deltaMinutes);
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5009);position.setTime(time.getTime());

        // Validity
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5010);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5011);String hemisphere = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5012);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5013);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5014);if ((((parser.group(index) != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5015)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5016)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5017);hemisphere = parser.group(index);
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5018);index++;
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5019);if ((((hemisphere.compareTo("S") == 0)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5020)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5021)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5022);latitude = -latitude;
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5023);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5024);hemisphere = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5025);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5026);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5027);if ((((parser.group(index) != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5028)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5029)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5030);hemisphere = parser.group(index);
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5031);index++;
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5032);if ((((hemisphere != null && hemisphere.compareTo("W") == 0)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5033)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5034)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5035);longitude = -longitude;
        }
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5036);position.setLongitude(longitude);

        // Speed
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5037);String speed = parser.group(index++);        
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5038);if ((((speed != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5039)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5040)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5041);position.setSpeed(Double.valueOf(speed));
        }
        
        // Course
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5042);String course = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5043);if ((((course != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5044)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5045)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5046);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5047);String altitude = parser.group(index++);
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5048);if ((((altitude != null)&&(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5049)!=0|true))||(__CLR4_5_23sx3sxlx1dp7ke.R.iget(5050)==0&false))) {{
            __CLR4_5_23sx3sxlx1dp7ke.R.inc(5051);position.setAltitude(Double.valueOf(altitude));
        }

        // Additional data
        }__CLR4_5_23sx3sxlx1dp7ke.R.inc(5052);position.set(Event.PREFIX_IO + 1, parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5053);position.set(Event.PREFIX_IO + 2, parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5054);position.set(Event.PREFIX_IO + 3, parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5055);position.set(Event.PREFIX_IO + 4, parser.group(index++));
        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5056);position.set(Event.PREFIX_IO + 5, parser.group(index++));

        __CLR4_5_23sx3sxlx1dp7ke.R.inc(5057);return position;
    }finally{__CLR4_5_23sx3sxlx1dp7ke.R.flushNeeded();}}

}
