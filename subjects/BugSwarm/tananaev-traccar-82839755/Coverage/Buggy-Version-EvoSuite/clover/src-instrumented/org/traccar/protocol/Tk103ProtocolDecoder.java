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
import org.traccar.Context;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Tk103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27ok7oklx1e382d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,10043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk103ProtocolDecoder(Tk103Protocol protocol) {
        super(protocol);__CLR4_5_27ok7oklx1e382d.R.inc(9957);try{__CLR4_5_27ok7oklx1e382d.R.inc(9956);
    }finally{__CLR4_5_27ok7oklx1e382d.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "(\\d+)(,)?" +                 // Device ID
            ".{4},?" +                     // Command
            "\\d*" +                       // IMEI (?)
            "(\\d{2})(\\d{2})(\\d{2}),?" + // Date (YYMMDD)
            "([AV]),?" +                   // Validity
            "(\\d{2})(\\d{2}\\.\\d+)" +    // Latitude (DDMM.MMMM)
            "([NS]),?" +
            "(\\d{3})(\\d{2}\\.\\d+)" +    // Longitude (DDDMM.MMMM)
            "([EW]),?" +
            "(\\d+\\.\\d)(?:\\d*,)?" +     // Speed
            "(\\d{2})(\\d{2})(\\d{2}),?" + // Time (HHMMSS)
            "(\\d+\\.?\\d{1,2}),?" +       // Course
            "(?:([01]{8})|([0-9a-fA-F]{8}))?,?" + // State
            "(?:L([0-9a-fA-F]+))?.*\\)?"); // Odometer

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27ok7oklx1e382d.R.inc(9958);

        __CLR4_5_27ok7oklx1e382d.R.inc(9959);String sentence = (String) msg;

        // Find message start
        __CLR4_5_27ok7oklx1e382d.R.inc(9960);int beginIndex = sentence.indexOf('(');
        __CLR4_5_27ok7oklx1e382d.R.inc(9961);if ((((beginIndex != -1)&&(__CLR4_5_27ok7oklx1e382d.R.iget(9962)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9963)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(9964);sentence = sentence.substring(beginIndex + 1);
        }
        
        // Send response
        }__CLR4_5_27ok7oklx1e382d.R.inc(9965);if ((((channel != null)&&(__CLR4_5_27ok7oklx1e382d.R.iget(9966)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9967)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(9968);String id = sentence.substring(0, 12);
            __CLR4_5_27ok7oklx1e382d.R.inc(9969);String type = sentence.substring(12, 16);
            __CLR4_5_27ok7oklx1e382d.R.inc(9970);if ((((type.equals("BP00"))&&(__CLR4_5_27ok7oklx1e382d.R.iget(9971)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9972)==0&false))) {{
                __CLR4_5_27ok7oklx1e382d.R.inc(9973);String content = sentence.substring(sentence.length() - 3);
                __CLR4_5_27ok7oklx1e382d.R.inc(9974);channel.write("(" + id + "AP01" + content + ")");
            } }else {__CLR4_5_27ok7oklx1e382d.R.inc(9975);if ((((type.equals("BP05"))&&(__CLR4_5_27ok7oklx1e382d.R.iget(9976)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9977)==0&false))) {{
                __CLR4_5_27ok7oklx1e382d.R.inc(9978);channel.write("(" + id + "AP05)");
            }
        }}}

        // Parse message
        }__CLR4_5_27ok7oklx1e382d.R.inc(9979);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_27ok7oklx1e382d.R.inc(9980);if ((((!parser.matches())&&(__CLR4_5_27ok7oklx1e382d.R.iget(9981)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9982)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(9983);return null;
        }

        // Create new position
        }__CLR4_5_27ok7oklx1e382d.R.inc(9984);Position position = new Position();
        __CLR4_5_27ok7oklx1e382d.R.inc(9985);position.setProtocol(getProtocolName());
        __CLR4_5_27ok7oklx1e382d.R.inc(9986);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_27ok7oklx1e382d.R.inc(9987);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_27ok7oklx1e382d.R.iget(9988)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9989)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(9990);return null;
        }
        }__CLR4_5_27ok7oklx1e382d.R.inc(9991);position.setDeviceId(getDeviceId());

        // Date
        __CLR4_5_27ok7oklx1e382d.R.inc(9992);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_27ok7oklx1e382d.R.inc(9993);time.clear();
        __CLR4_5_27ok7oklx1e382d.R.inc(9994);if ((((parser.group(index++) == null)&&(__CLR4_5_27ok7oklx1e382d.R.iget(9995)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(9996)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(9997);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++)));
            __CLR4_5_27ok7oklx1e382d.R.inc(9998);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
            __CLR4_5_27ok7oklx1e382d.R.inc(9999);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
        } }else {{
            __CLR4_5_27ok7oklx1e382d.R.inc(10000);time.set(Calendar.DAY_OF_MONTH, Integer.parseInt(parser.group(index++)));
            __CLR4_5_27ok7oklx1e382d.R.inc(10001);time.set(Calendar.MONTH, Integer.parseInt(parser.group(index++)) - 1);
            __CLR4_5_27ok7oklx1e382d.R.inc(10002);time.set(Calendar.YEAR, 2000 + Integer.parseInt(parser.group(index++)));
        }

        // Validity
        }__CLR4_5_27ok7oklx1e382d.R.inc(10003);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_27ok7oklx1e382d.R.inc(10004);Double latitude = Double.parseDouble(parser.group(index++));
        __CLR4_5_27ok7oklx1e382d.R.inc(10005);latitude += Double.parseDouble(parser.group(index++)) / 60;
        __CLR4_5_27ok7oklx1e382d.R.inc(10006);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27ok7oklx1e382d.R.iget(10007)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(10008)==0&false))) {__CLR4_5_27ok7oklx1e382d.R.inc(10009);latitude = -latitude;
        }__CLR4_5_27ok7oklx1e382d.R.inc(10010);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_27ok7oklx1e382d.R.inc(10011);Double longitude = Double.parseDouble(parser.group(index++));
        __CLR4_5_27ok7oklx1e382d.R.inc(10012);longitude += Double.parseDouble(parser.group(index++)) / 60;
        __CLR4_5_27ok7oklx1e382d.R.inc(10013);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27ok7oklx1e382d.R.iget(10014)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(10015)==0&false))) {__CLR4_5_27ok7oklx1e382d.R.inc(10016);longitude = -longitude;
        }__CLR4_5_27ok7oklx1e382d.R.inc(10017);position.setLongitude(longitude);

        // Speed
        __CLR4_5_27ok7oklx1e382d.R.inc(10018);if ((((Context.getConfig().getBoolean(getProtocolName() + ".mph"))&&(__CLR4_5_27ok7oklx1e382d.R.iget(10019)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(10020)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(10021);position.setSpeed(UnitsConverter.knotsFromMph(Double.parseDouble(parser.group(index++))));
        } }else {{
            __CLR4_5_27ok7oklx1e382d.R.inc(10022);position.setSpeed(UnitsConverter.knotsFromKph(Double.parseDouble(parser.group(index++))));
        }

        // Time
        }__CLR4_5_27ok7oklx1e382d.R.inc(10023);time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parser.group(index++)));
        __CLR4_5_27ok7oklx1e382d.R.inc(10024);time.set(Calendar.MINUTE, Integer.parseInt(parser.group(index++)));
        __CLR4_5_27ok7oklx1e382d.R.inc(10025);time.set(Calendar.SECOND, Integer.parseInt(parser.group(index++)));
        __CLR4_5_27ok7oklx1e382d.R.inc(10026);position.setTime(time.getTime());

        // Course
        __CLR4_5_27ok7oklx1e382d.R.inc(10027);position.setCourse(Double.parseDouble(parser.group(index++)));
        
        // State
        __CLR4_5_27ok7oklx1e382d.R.inc(10028);String status = parser.group(index++); // binary status
        __CLR4_5_27ok7oklx1e382d.R.inc(10029);if ((((status != null)&&(__CLR4_5_27ok7oklx1e382d.R.iget(10030)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(10031)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(10032);position.set(Event.KEY_STATUS, status);

            __CLR4_5_27ok7oklx1e382d.R.inc(10033);int value = Integer.parseInt(status, 2);
            __CLR4_5_27ok7oklx1e382d.R.inc(10034);position.set(Event.KEY_CHARGE, !BitUtil.check(value, 0));
            __CLR4_5_27ok7oklx1e382d.R.inc(10035);position.set(Event.KEY_IGNITION, BitUtil.check(value, 1));
        }
        }__CLR4_5_27ok7oklx1e382d.R.inc(10036);position.set(Event.KEY_STATUS, parser.group(index++)); // hex status

        // Odometer
        __CLR4_5_27ok7oklx1e382d.R.inc(10037);String odometer = parser.group(index++);
        __CLR4_5_27ok7oklx1e382d.R.inc(10038);if ((((odometer != null)&&(__CLR4_5_27ok7oklx1e382d.R.iget(10039)!=0|true))||(__CLR4_5_27ok7oklx1e382d.R.iget(10040)==0&false))) {{
            __CLR4_5_27ok7oklx1e382d.R.inc(10041);position.set(Event.KEY_ODOMETER, Long.parseLong(odometer, 16));
        }
        }__CLR4_5_27ok7oklx1e382d.R.inc(10042);return position;
    }finally{__CLR4_5_27ok7oklx1e382d.R.flushNeeded();}}

}
