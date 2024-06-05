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

import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class TaipProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27dt7dtlx1e50e8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,9665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final boolean sendResponse;

    public TaipProtocolDecoder(TaipProtocol protocol, boolean sendResponse) {
        super(protocol);__CLR4_5_27dt7dtlx1e50e8.R.inc(9570);try{__CLR4_5_27dt7dtlx1e50e8.R.inc(9569);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9571);this.sendResponse = sendResponse;
    }finally{__CLR4_5_27dt7dtlx1e50e8.R.flushNeeded();}}

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

    private Date getTime(long week, long day, long seconds) {try{__CLR4_5_27dt7dtlx1e50e8.R.inc(9572);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9573);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9574);time.clear();
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9575);time.set(Calendar.YEAR, 1980);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9576);time.set(Calendar.MONTH, 0);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9577);time.set(Calendar.DAY_OF_MONTH, 6);

        __CLR4_5_27dt7dtlx1e50e8.R.inc(9578);long millis = time.getTimeInMillis();
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9579);millis += ((week * 7 + day) * 24 * 60 * 60 + seconds) * 1000;

        __CLR4_5_27dt7dtlx1e50e8.R.inc(9580);return new Date(millis);
    }finally{__CLR4_5_27dt7dtlx1e50e8.R.flushNeeded();}}
    
    private Date getTime(long seconds) {try{__CLR4_5_27dt7dtlx1e50e8.R.inc(9581);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9582);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9583);time.set(Calendar.HOUR_OF_DAY, 0);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9584);time.set(Calendar.MINUTE, 0);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9585);time.set(Calendar.SECOND, 0);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9586);time.set(Calendar.MILLISECOND, 0);
        
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9587);long millis = time.getTimeInMillis() + seconds * 1000;
        
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9588);long diff = new Date().getTime() - millis;
        
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9589);if ((((diff > 12 * 60 * 60 * 1000)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9590)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9591)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9592);millis += 24 * 60 * 60 * 1000;
        } }else {__CLR4_5_27dt7dtlx1e50e8.R.inc(9593);if ((((diff < -12 * 60 * 60 * 1000)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9594)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9595)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9596);millis -= 24 * 60 * 60 * 1000;
        }

        }}__CLR4_5_27dt7dtlx1e50e8.R.inc(9597);return new Date(millis);
    }finally{__CLR4_5_27dt7dtlx1e50e8.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27dt7dtlx1e50e8.R.inc(9598);

        __CLR4_5_27dt7dtlx1e50e8.R.inc(9599);String sentence = (String) msg;
        
        // Find message start
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9600);int beginIndex = sentence.indexOf('>');
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9601);if ((((beginIndex != -1)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9602)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9603)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9604);sentence = sentence.substring(beginIndex + 1);
        }

        // Find device ID
        }__CLR4_5_27dt7dtlx1e50e8.R.inc(9605);beginIndex = sentence.indexOf(";ID=");
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9606);if ((((beginIndex != -1)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9607)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9608)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9609);beginIndex += 4;
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9610);int endIndex = sentence.indexOf(';', beginIndex);
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9611);if ((((endIndex == -1)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9612)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9613)==0&false))) {{
                __CLR4_5_27dt7dtlx1e50e8.R.inc(9614);endIndex = sentence.length();
            }

            // Find device in database
            }__CLR4_5_27dt7dtlx1e50e8.R.inc(9615);String id = sentence.substring(beginIndex, endIndex);
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9616);if ((((!identify(id, channel))&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9617)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9618)==0&false))) {{
                __CLR4_5_27dt7dtlx1e50e8.R.inc(9619);return null;
            }

            // Send response
            }__CLR4_5_27dt7dtlx1e50e8.R.inc(9620);if ((((sendResponse && channel != null)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9621)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9622)==0&false))) {{
                __CLR4_5_27dt7dtlx1e50e8.R.inc(9623);channel.write(id);
            }
        }} }else {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9624);return null;
        }

        // Parse message
        }__CLR4_5_27dt7dtlx1e50e8.R.inc(9625);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9626);if ((((!parser.matches())&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9627)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9628)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9629);return null;
        }

        // Create new position
        }__CLR4_5_27dt7dtlx1e50e8.R.inc(9630);Position position = new Position();
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9631);position.setProtocol(getProtocolName());
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9632);position.setDeviceId(getDeviceId());

        __CLR4_5_27dt7dtlx1e50e8.R.inc(9633);Integer index = 1;
        
        // Time
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9634);String week = parser.group(index++);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9635);String day = parser.group(index++);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9636);String seconds = parser.group(index++);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9637);if ((((seconds != null)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9638)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9639)==0&false))) {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9640);if ((((week != null && day != null)&&(__CLR4_5_27dt7dtlx1e50e8.R.iget(9641)!=0|true))||(__CLR4_5_27dt7dtlx1e50e8.R.iget(9642)==0&false))) {{
                __CLR4_5_27dt7dtlx1e50e8.R.inc(9643);position.setTime(getTime(Integer.valueOf(week), Integer.valueOf(day), Integer.valueOf(seconds)));
            } }else {{
                __CLR4_5_27dt7dtlx1e50e8.R.inc(9644);position.setTime(getTime(Integer.valueOf(seconds)));
            }
            }__CLR4_5_27dt7dtlx1e50e8.R.inc(9645);index += 6;
        } }else {{
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9646);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9647);time.clear();
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9648);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9649);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9650);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9651);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9652);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9653);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27dt7dtlx1e50e8.R.inc(9654);position.setTime(time.getTime());
        }

        // Latitude
        }__CLR4_5_27dt7dtlx1e50e8.R.inc(9655);String latitude = parser.group(index) + '.' + parser.group(index + 1);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9656);index += 2;
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9657);position.setLatitude(Double.valueOf(latitude));

        // Latitude
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9658);String longitude = parser.group(index) + '.' + parser.group(index + 1);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9659);index += 2;
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9660);position.setLongitude(Double.valueOf(longitude));
        
        // Speed and Course
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9661);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(parser.group(index++))));
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9662);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // Validity
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9663);position.setValid(Integer.valueOf(parser.group(index++)) != 0);
        __CLR4_5_27dt7dtlx1e50e8.R.inc(9664);return position;
    }finally{__CLR4_5_27dt7dtlx1e50e8.R.flushNeeded();}}

}
