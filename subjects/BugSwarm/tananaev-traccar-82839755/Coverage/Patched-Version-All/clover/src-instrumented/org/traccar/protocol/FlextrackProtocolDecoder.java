/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.PatternUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlextrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23ew3ewlx1e7zcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,4504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FlextrackProtocolDecoder(FlextrackProtocol protocol) {
        super(protocol);__CLR4_5_23ew3ewlx1e7zcq.R.inc(4425);try{__CLR4_5_23ew3ewlx1e7zcq.R.inc(4424);
    }finally{__CLR4_5_23ew3ewlx1e7zcq.R.flushNeeded();}}

    private static final Pattern patternLogon = Pattern.compile(
            "(-?\\d+)," +                  // Index
            "LOGON," +
            "(\\d+)," +                    // Node ID
            "(\\d+)");                     // ICCID

    private static final Pattern pattern = Pattern.compile(
            "(-?\\d+)," +                  // Index
            "UNITSTAT," +
            "(\\d{4})(\\d{2})(\\d{2})," +  // Date (YYYYMMDD)
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "\\d+," +                      // Node ID
            "([NS])(\\d+)\\.(\\d+\\.\\d+)," + // Longitude
            "([EW])(\\d+)\\.(\\d+\\.\\d+)," + // Latitude
            "(\\d+)," +                    // Speed
            "(\\d+)," +                    // Course
            "(\\d+)," +                    // Satellites
            "(\\d+)," +                    // Battery
            "(-?\\d+)," +                  // GSM
            "(\\p{XDigit}+)," +            // State
            "(\\d{3})" +                   // MCC
            "(\\d{2})," +                  // MNC
            "(-?\\d+)," +                  // Altitude
            "(\\d+)," +                    // HDOP
            "(\\p{XDigit}+)," +            // Cell
            "\\d+," +                      // GPS fix time
            "(\\d+)," +                    // LAC
            "(\\d+)");                     // Odometer

    private void sendAcknowledgement(Channel channel, String index) {try{__CLR4_5_23ew3ewlx1e7zcq.R.inc(4426);
        __CLR4_5_23ew3ewlx1e7zcq.R.inc(4427);if ((((channel != null)&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4428)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4429)==0&false))) {{
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4430);channel.write(index + ",ACK\r");
        }
    }}finally{__CLR4_5_23ew3ewlx1e7zcq.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23ew3ewlx1e7zcq.R.inc(4431);

        __CLR4_5_23ew3ewlx1e7zcq.R.inc(4432);String sentence = (String) msg;

        __CLR4_5_23ew3ewlx1e7zcq.R.inc(4433);if ((((sentence.contains("LOGON"))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4434)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4435)==0&false))) {{

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4436);Matcher parser = patternLogon.matcher(sentence);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4437);if ((((!parser.matches())&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4438)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4439)==0&false))) {{
                __CLR4_5_23ew3ewlx1e7zcq.R.inc(4440);return null;
            }

            }__CLR4_5_23ew3ewlx1e7zcq.R.inc(4441);int index = 1;

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4442);sendAcknowledgement(channel, parser.group(index++));

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4443);String id = parser.group(index++);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4444);String iccid = parser.group(index++);

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4445);if ((((!identify(iccid, channel, null, false))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4446)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4447)==0&false))) {{
                __CLR4_5_23ew3ewlx1e7zcq.R.inc(4448);if ((((!identify(id, channel))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4449)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4450)==0&false))) {{
                    __CLR4_5_23ew3ewlx1e7zcq.R.inc(4451);return null;
                }
            }}

        }} }else {__CLR4_5_23ew3ewlx1e7zcq.R.inc(4452);if ((((sentence.contains("UNITSTAT"))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4453)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4454)==0&false))) {{

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4455);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4456);if ((((!parser.matches())&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4457)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4458)==0&false))) {{
                __CLR4_5_23ew3ewlx1e7zcq.R.inc(4459);return null;
            }

            }__CLR4_5_23ew3ewlx1e7zcq.R.inc(4460);Position position = new Position();
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4461);position.setProtocol(getProtocolName());
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4462);int index = 1;

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4463);sendAcknowledgement(channel, parser.group(index++));

            // Time
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4464);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4465);time.clear();
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4466);time.set(Calendar.YEAR, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4467);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4468);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4469);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4470);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4471);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4472);position.setTime(time.getTime());

            // Latitude
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4473);String hemisphere = parser.group(index++);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4474);double lat = Integer.parseInt(parser.group(index++));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4475);lat += Double.parseDouble(parser.group(index++)) / 60;
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4476);if ((((hemisphere.equals("S"))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4477)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4478)==0&false))) {{
                __CLR4_5_23ew3ewlx1e7zcq.R.inc(4479);lat = -lat;
            }
            }__CLR4_5_23ew3ewlx1e7zcq.R.inc(4480);position.setLatitude(lat);

            // Longitude
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4481);hemisphere = parser.group(index++);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4482);double lon = Integer.parseInt(parser.group(index++));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4483);lon += Double.parseDouble(parser.group(index++)) / 60;
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4484);if ((((hemisphere.equals("W"))&&(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4485)!=0|true))||(__CLR4_5_23ew3ewlx1e7zcq.R.iget(4486)==0&false))) {{
                __CLR4_5_23ew3ewlx1e7zcq.R.inc(4487);lon = -lon;
            }
            }__CLR4_5_23ew3ewlx1e7zcq.R.inc(4488);position.setLongitude(lon);

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4489);position.setSpeed(UnitsConverter.knotsFromKph(Integer.parseInt(parser.group(index++))));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4490);position.setCourse(Integer.parseInt(parser.group(index++)));

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4491);position.set(Event.KEY_SATELLITES, Integer.parseInt(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4492);position.set(Event.KEY_BATTERY, Integer.parseInt(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4493);position.set(Event.KEY_GSM, Integer.parseInt(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4494);position.set(Event.KEY_STATUS, Integer.parseInt(parser.group(index++), 16));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4495);position.set(Event.KEY_MCC, Integer.parseInt(parser.group(index++)));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4496);position.set(Event.KEY_MNC, Integer.parseInt(parser.group(index++)));

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4497);position.setAltitude(Integer.parseInt(parser.group(index++)));

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4498);position.set(Event.KEY_HDOP, Integer.parseInt(parser.group(index++)) / 10.0);
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4499);position.set(Event.KEY_CELL, parser.group(index++));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4500);position.set(Event.KEY_LAC, parser.group(index++));
            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4501);position.set(Event.KEY_ODOMETER, Integer.parseInt(parser.group(index++)));

            __CLR4_5_23ew3ewlx1e7zcq.R.inc(4502);return position;
        }

        }}__CLR4_5_23ew3ewlx1e7zcq.R.inc(4503);return null;
    }finally{__CLR4_5_23ew3ewlx1e7zcq.R.flushNeeded();}}

}
