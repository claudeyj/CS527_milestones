/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class TaipProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26wm6wmlx1dsnp9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,9046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    boolean sendResponse;

    public TaipProtocolDecoder(TaipProtocol protocol, boolean sendResponse) {
        super(protocol);__CLR4_5_26wm6wmlx1dsnp9.R.inc(8951);try{__CLR4_5_26wm6wmlx1dsnp9.R.inc(8950);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8952);this.sendResponse = sendResponse;
    }finally{__CLR4_5_26wm6wmlx1dsnp9.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(?:R[EP]V" +                  // Type
            "(?:\\d{2}" +                  // Event index
            "(\\d{4})" +                   // Week
            "(\\d))?" +                    // Day
            "(\\d{5})|" +                  // Seconds
            "RGP" +                        // Type
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date
            "(\\d{2})(\\d{2})(\\d{2}))" +  // Time
            "([\\+\\-]\\d{2})(\\d{5})" +   // Latitude
            "([\\+\\-]\\d{3})(\\d{5})" +   // Longitude
            "(\\d{3})" +                   // Speed
            "(\\d{3})" +                   // Course
            "(\\d)" +                      // Fix mode
            ".*\r?\n?");

    private Date getTime(long week, long day, long seconds) {try{__CLR4_5_26wm6wmlx1dsnp9.R.inc(8953);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8954);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8955);time.clear();
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8956);time.set(Calendar.YEAR, 1980);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8957);time.set(Calendar.MONTH, 0);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8958);time.set(Calendar.DAY_OF_MONTH, 6);

        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8959);long millis = time.getTimeInMillis();
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8960);millis += ((week * 7 + day) * 24 * 60 * 60 + seconds) * 1000;

        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8961);return new Date(millis);
    }finally{__CLR4_5_26wm6wmlx1dsnp9.R.flushNeeded();}}
    
    private Date getTime(long seconds) {try{__CLR4_5_26wm6wmlx1dsnp9.R.inc(8962);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8963);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8964);time.set(Calendar.HOUR_OF_DAY, 0);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8965);time.set(Calendar.MINUTE, 0);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8966);time.set(Calendar.SECOND, 0);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8967);time.set(Calendar.MILLISECOND, 0);
        
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8968);long millis = time.getTimeInMillis() + seconds * 1000;
        
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8969);long diff = new Date().getTime() - millis;
        
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8970);if ((((diff > 12 * 60 * 60 * 1000)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8971)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8972)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8973);millis += 24 * 60 * 60 * 1000;
        } }else {__CLR4_5_26wm6wmlx1dsnp9.R.inc(8974);if ((((diff < -12 * 60 * 60 * 1000)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8975)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8976)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8977);millis -= 24 * 60 * 60 * 1000;
        }

        }}__CLR4_5_26wm6wmlx1dsnp9.R.inc(8978);return new Date(millis);
    }finally{__CLR4_5_26wm6wmlx1dsnp9.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_26wm6wmlx1dsnp9.R.inc(8979);

        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8980);String sentence = (String) msg;
        
        // Find message start
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8981);int beginIndex = sentence.indexOf('>');
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8982);if ((((beginIndex != -1)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8983)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8984)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8985);sentence = sentence.substring(beginIndex + 1);
        }

        // Find device ID
        }__CLR4_5_26wm6wmlx1dsnp9.R.inc(8986);beginIndex = sentence.indexOf(";ID=");
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(8987);if ((((beginIndex != -1)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8988)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8989)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8990);beginIndex += 4;
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8991);int endIndex = sentence.indexOf(';', beginIndex);
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8992);if ((((endIndex == -1)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8993)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8994)==0&false))) {{
                __CLR4_5_26wm6wmlx1dsnp9.R.inc(8995);endIndex = sentence.length();
            }

            // Find device in database
            }__CLR4_5_26wm6wmlx1dsnp9.R.inc(8996);String id = sentence.substring(beginIndex, endIndex);
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(8997);if ((((!identify(id, channel))&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8998)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(8999)==0&false))) {{
                __CLR4_5_26wm6wmlx1dsnp9.R.inc(9000);return null;
            }

            // Send response
            }__CLR4_5_26wm6wmlx1dsnp9.R.inc(9001);if ((((sendResponse && channel != null)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9002)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9003)==0&false))) {{
                __CLR4_5_26wm6wmlx1dsnp9.R.inc(9004);channel.write(id);
            }
        }} }else {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9005);return null;
        }

        // Parse message
        }__CLR4_5_26wm6wmlx1dsnp9.R.inc(9006);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9007);if ((((!parser.matches())&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9008)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9009)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9010);return null;
        }

        // Create new position
        }__CLR4_5_26wm6wmlx1dsnp9.R.inc(9011);Position position = new Position();
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9012);position.setProtocol(getProtocolName());
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9013);position.setDeviceId(getDeviceId());

        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9014);Integer index = 1;
        
        // Time
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9015);String week = parser.group(index++);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9016);String day = parser.group(index++);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9017);String seconds = parser.group(index++);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9018);if ((((seconds != null)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9019)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9020)==0&false))) {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9021);if ((((week != null && day != null)&&(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9022)!=0|true))||(__CLR4_5_26wm6wmlx1dsnp9.R.iget(9023)==0&false))) {{
                __CLR4_5_26wm6wmlx1dsnp9.R.inc(9024);position.setTime(getTime(Integer.valueOf(week), Integer.valueOf(day), Integer.valueOf(seconds)));
            } }else {{
                __CLR4_5_26wm6wmlx1dsnp9.R.inc(9025);position.setTime(getTime(Integer.valueOf(seconds)));
            }
            }__CLR4_5_26wm6wmlx1dsnp9.R.inc(9026);index += 6;
        } }else {{
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9027);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9028);time.clear();
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9029);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9030);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9031);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9032);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9033);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9034);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_26wm6wmlx1dsnp9.R.inc(9035);position.setTime(time.getTime());
        }

        // Latitude
        }__CLR4_5_26wm6wmlx1dsnp9.R.inc(9036);String latitude = parser.group(index) + '.' + parser.group(index + 1);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9037);index += 2;
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9038);position.setLatitude(Double.valueOf(latitude));

        // Latitude
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9039);String longitude = parser.group(index) + '.' + parser.group(index + 1);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9040);index += 2;
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9041);position.setLongitude(Double.valueOf(longitude));
        
        // Speed and Course
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9042);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(parser.group(index++))));
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9043);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // Validity
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9044);position.setValid(Integer.valueOf(parser.group(index++)) != 0);
        __CLR4_5_26wm6wmlx1dsnp9.R.inc(9045);return position;
    }finally{__CLR4_5_26wm6wmlx1dsnp9.R.flushNeeded();}}

}
