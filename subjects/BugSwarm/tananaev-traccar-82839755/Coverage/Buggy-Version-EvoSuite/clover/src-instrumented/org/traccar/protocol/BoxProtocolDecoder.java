/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class BoxProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22p72p7lx1e3639{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,3548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BoxProtocolDecoder(BoxProtocol protocol) {
        super(protocol);__CLR4_5_22p72p7lx1e3639.R.inc(3500);try{__CLR4_5_22p72p7lx1e3639.R.inc(3499);
    }finally{__CLR4_5_22p72p7lx1e3639.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "L," +
            "(\\d{2})(\\d{2})(\\d{2})" +  // Date
            "(\\d{2})(\\d{2})(\\d{2})," + // Time
            "G," +
            "(-?\\d+\\.\\d+)," +          // Latitude
            "(-?\\d+\\.\\d+)," +          // Longitude
            "(\\d+\\.?\\d*)," +           // Speed
            "(\\d+\\.?\\d*)," +           // Course
            "(\\d+\\.?\\d*)," +           // Distance
            "(\\d+)," +                   // Event
            "(\\d+)" +                    // Status
            ".*");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22p72p7lx1e3639.R.inc(3501);

        __CLR4_5_22p72p7lx1e3639.R.inc(3502);String sentence = (String) msg;
        
        __CLR4_5_22p72p7lx1e3639.R.inc(3503);if ((((sentence.startsWith("H,"))&&(__CLR4_5_22p72p7lx1e3639.R.iget(3504)!=0|true))||(__CLR4_5_22p72p7lx1e3639.R.iget(3505)==0&false))) {{
            
            __CLR4_5_22p72p7lx1e3639.R.inc(3506);int index = sentence.indexOf(',', 2) + 1;
            __CLR4_5_22p72p7lx1e3639.R.inc(3507);String id = sentence.substring(index, sentence.indexOf(',', index));
            __CLR4_5_22p72p7lx1e3639.R.inc(3508);identify(id, channel);
        }

        }else {__CLR4_5_22p72p7lx1e3639.R.inc(3509);if ((((sentence.startsWith("E,"))&&(__CLR4_5_22p72p7lx1e3639.R.iget(3510)!=0|true))||(__CLR4_5_22p72p7lx1e3639.R.iget(3511)==0&false))) {{

            __CLR4_5_22p72p7lx1e3639.R.inc(3512);if ((((channel != null)&&(__CLR4_5_22p72p7lx1e3639.R.iget(3513)!=0|true))||(__CLR4_5_22p72p7lx1e3639.R.iget(3514)==0&false))) {{
                __CLR4_5_22p72p7lx1e3639.R.inc(3515);channel.write("A," + sentence.substring(2) + "\r");
            }

        }}
        
        }else {__CLR4_5_22p72p7lx1e3639.R.inc(3516);if ((((sentence.startsWith("L,") && hasDeviceId())&&(__CLR4_5_22p72p7lx1e3639.R.iget(3517)!=0|true))||(__CLR4_5_22p72p7lx1e3639.R.iget(3518)==0&false))) {{

            // Parse message
            __CLR4_5_22p72p7lx1e3639.R.inc(3519);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_22p72p7lx1e3639.R.inc(3520);if ((((!parser.matches())&&(__CLR4_5_22p72p7lx1e3639.R.iget(3521)!=0|true))||(__CLR4_5_22p72p7lx1e3639.R.iget(3522)==0&false))) {{
                __CLR4_5_22p72p7lx1e3639.R.inc(3523);return null;
            }

            // Create new position
            }__CLR4_5_22p72p7lx1e3639.R.inc(3524);Position position = new Position();
            __CLR4_5_22p72p7lx1e3639.R.inc(3525);position.setDeviceId(getDeviceId());
            __CLR4_5_22p72p7lx1e3639.R.inc(3526);position.setProtocol(getProtocolName());

            __CLR4_5_22p72p7lx1e3639.R.inc(3527);Integer index = 1;

            // Time
            __CLR4_5_22p72p7lx1e3639.R.inc(3528);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_22p72p7lx1e3639.R.inc(3529);time.clear();
            __CLR4_5_22p72p7lx1e3639.R.inc(3530);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3531);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
            __CLR4_5_22p72p7lx1e3639.R.inc(3532);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3533);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3534);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3535);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3536);position.setTime(time.getTime());

            // Location
            __CLR4_5_22p72p7lx1e3639.R.inc(3537);position.setLatitude(Double.parseDouble(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3538);position.setLongitude(Double.parseDouble(parser.group(index++)));
            __CLR4_5_22p72p7lx1e3639.R.inc(3539);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(parser.group(index++))));
            __CLR4_5_22p72p7lx1e3639.R.inc(3540);position.setCourse(Double.parseDouble(parser.group(index++)));
            
            // Distance
            __CLR4_5_22p72p7lx1e3639.R.inc(3541);position.set(Event.KEY_ODOMETER, parser.group(index++));
            
            // Event
            __CLR4_5_22p72p7lx1e3639.R.inc(3542);position.set(Event.KEY_EVENT, parser.group(index++));
            
            // Status
            __CLR4_5_22p72p7lx1e3639.R.inc(3543);int status = Integer.parseInt(parser.group(index++));
            __CLR4_5_22p72p7lx1e3639.R.inc(3544);position.setValid((status & 0x04) == 0);
            __CLR4_5_22p72p7lx1e3639.R.inc(3545);position.set(Event.KEY_STATUS, status);
            __CLR4_5_22p72p7lx1e3639.R.inc(3546);return position;
        }
        
        }}}__CLR4_5_22p72p7lx1e3639.R.inc(3547);return null;
    }finally{__CLR4_5_22p72p7lx1e3639.R.flushNeeded();}}

}
