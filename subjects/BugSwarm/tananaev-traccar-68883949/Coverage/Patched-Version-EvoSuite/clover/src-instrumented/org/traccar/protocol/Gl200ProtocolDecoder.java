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
import org.traccar.Context;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gl200ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23ho3holx1do9dy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,4592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gl200ProtocolDecoder(Gl200Protocol protocol) {
        super(protocol);__CLR4_5_23ho3holx1do9dy.R.inc(4525);try{__CLR4_5_23ho3holx1do9dy.R.inc(4524);
    }finally{__CLR4_5_23ho3holx1do9dy.R.flushNeeded();}}

    private static final Pattern heartbeatPattern = Pattern.compile(
            "\\+ACK\\:GTHBD," +
            "([0-9A-Z]{2}\\p{XDigit}{4})," +
            ".*," +
            "(\\p{XDigit}{4})\\$?");

    private static final Pattern pattern = Pattern.compile(
            "(?:(?:\\+(?:RESP|BUFF):)|" +
            "(?:\\x00?\\x04,\\p{XDigit}{4},[01],))" +
            "GT...," +
            "(?:[0-9A-Z]{2}\\p{XDigit}{4})?," + // Protocol version
            "([^,]+),.*," +                     // IMEI
            "(\\d*)," +                         // GPS accuracy
            "(\\d+.\\d)?," +                    // Speed
            "(\\d+)?," +                        // Course
            "(-?\\d+\\.\\d)?," +                // Altitude
            "(-?\\d+\\.\\d+)," +                // Longitude
            "(-?\\d+\\.\\d+)," +                // Latitude
            "(\\d{4})(\\d{2})(\\d{2})" +        // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time (HHMMSS)
            "(\\d{4})?," +                      // MCC
            "(\\d{4})?," +                      // MNC
            "(\\p{XDigit}{4}|\\p{XDigit}{8})?," + // LAC
            "(\\p{XDigit}{4})?," +              // Cell
            "(?:(\\d+\\.\\d)?," +               // Odometer
            "(\\d{1,3})?,)?" +                  // Battery
            ".*," +
            "(\\p{XDigit}{4})\\$?");

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23ho3holx1do9dy.R.inc(4526);

        __CLR4_5_23ho3holx1do9dy.R.inc(4527);String sentence = (String) msg;

        // Handle heartbeat
        __CLR4_5_23ho3holx1do9dy.R.inc(4528);Matcher parser = heartbeatPattern.matcher(sentence);
        __CLR4_5_23ho3holx1do9dy.R.inc(4529);if ((((parser.matches())&&(__CLR4_5_23ho3holx1do9dy.R.iget(4530)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4531)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4532);if ((((channel != null)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4533)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4534)==0&false))) {{
                __CLR4_5_23ho3holx1do9dy.R.inc(4535);channel.write("+SACK:GTHBD," + parser.group(1) + "," + parser.group(2) + "$", remoteAddress);
            }
            }__CLR4_5_23ho3holx1do9dy.R.inc(4536);return null;
        }

        // Parse message
        }__CLR4_5_23ho3holx1do9dy.R.inc(4537);parser = pattern.matcher(sentence);
        __CLR4_5_23ho3holx1do9dy.R.inc(4538);if ((((!parser.matches())&&(__CLR4_5_23ho3holx1do9dy.R.iget(4539)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4540)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4541);return null;
        }

        // Create new position
        }__CLR4_5_23ho3holx1do9dy.R.inc(4542);Position position = new Position();
        __CLR4_5_23ho3holx1do9dy.R.inc(4543);position.setProtocol(getProtocolName());

        __CLR4_5_23ho3holx1do9dy.R.inc(4544);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_23ho3holx1do9dy.R.inc(4545);if ((((!identify(parser.group(index++), channel, remoteAddress))&&(__CLR4_5_23ho3holx1do9dy.R.iget(4546)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4547)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4548);return null;
        }
        }__CLR4_5_23ho3holx1do9dy.R.inc(4549);position.setDeviceId(getDeviceId());

        // Validity
        __CLR4_5_23ho3holx1do9dy.R.inc(4550);position.setValid(Integer.valueOf(parser.group(index++)) < 20);

        // Speed
        __CLR4_5_23ho3holx1do9dy.R.inc(4551);String speed = parser.group(index++);
        __CLR4_5_23ho3holx1do9dy.R.inc(4552);if ((((speed != null)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4553)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4554)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4555);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(speed)));
        }

        // Course
        }__CLR4_5_23ho3holx1do9dy.R.inc(4556);String course = parser.group(index++);
        __CLR4_5_23ho3holx1do9dy.R.inc(4557);if ((((speed != null)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4558)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4559)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4560);position.setCourse(Double.valueOf(course));
        }

        // Altitude
        }__CLR4_5_23ho3holx1do9dy.R.inc(4561);String altitude = parser.group(index++);
        __CLR4_5_23ho3holx1do9dy.R.inc(4562);if ((((speed != null)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4563)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4564)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4565);position.setAltitude(Double.valueOf(altitude));
        }

        // Coordinates
        }__CLR4_5_23ho3holx1do9dy.R.inc(4566);position.setLongitude(Double.valueOf(parser.group(index++)));
        __CLR4_5_23ho3holx1do9dy.R.inc(4567);position.setLatitude(Double.valueOf(parser.group(index++)));

        // Date
        __CLR4_5_23ho3holx1do9dy.R.inc(4568);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_23ho3holx1do9dy.R.inc(4569);time.clear();
        __CLR4_5_23ho3holx1do9dy.R.inc(4570);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23ho3holx1do9dy.R.inc(4571);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_23ho3holx1do9dy.R.inc(4572);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));

        // Time
        __CLR4_5_23ho3holx1do9dy.R.inc(4573);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23ho3holx1do9dy.R.inc(4574);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23ho3holx1do9dy.R.inc(4575);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_23ho3holx1do9dy.R.inc(4576);position.setTime(time.getTime());

        // Cell information
        __CLR4_5_23ho3holx1do9dy.R.inc(4577);position.set(Event.KEY_MCC, parser.group(index++));
        __CLR4_5_23ho3holx1do9dy.R.inc(4578);position.set(Event.KEY_MNC, parser.group(index++));
        __CLR4_5_23ho3holx1do9dy.R.inc(4579);position.set(Event.KEY_LAC, parser.group(index++));
        __CLR4_5_23ho3holx1do9dy.R.inc(4580);position.set(Event.KEY_CELL, parser.group(index++));

        // Other
        __CLR4_5_23ho3holx1do9dy.R.inc(4581);String odometer = parser.group(index++);
        __CLR4_5_23ho3holx1do9dy.R.inc(4582);if ((((odometer != null && Double.valueOf(odometer) != 0)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4583)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4584)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4585);position.set(Event.KEY_ODOMETER, odometer);
        }
        }__CLR4_5_23ho3holx1do9dy.R.inc(4586);position.set(Event.KEY_BATTERY, parser.group(index++));

        __CLR4_5_23ho3holx1do9dy.R.inc(4587);if ((((Boolean.valueOf(Context.getProps().getProperty(getProtocolName() + ".ack")) && channel != null)&&(__CLR4_5_23ho3holx1do9dy.R.iget(4588)!=0|true))||(__CLR4_5_23ho3holx1do9dy.R.iget(4589)==0&false))) {{
            __CLR4_5_23ho3holx1do9dy.R.inc(4590);channel.write("+SACK:" + parser.group(index++) + "$", remoteAddress);
        }

        }__CLR4_5_23ho3holx1do9dy.R.inc(4591);return position;
    }finally{__CLR4_5_23ho3holx1do9dy.R.flushNeeded();}}

}
