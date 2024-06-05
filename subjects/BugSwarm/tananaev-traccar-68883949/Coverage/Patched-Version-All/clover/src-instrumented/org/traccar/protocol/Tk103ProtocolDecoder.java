/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.Context;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Tk103ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_277d77dlx1dsnr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,9416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk103ProtocolDecoder(Tk103Protocol protocol) {
        super(protocol);__CLR4_5_277d77dlx1dsnr9.R.inc(9338);try{__CLR4_5_277d77dlx1dsnr9.R.inc(9337);
    }finally{__CLR4_5_277d77dlx1dsnr9.R.flushNeeded();}}

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
            "(\\d+\\.?\\d+),?" +           // Course
            "([0-9a-fA-F]{8})?,?" +        // State
            "(?:L([0-9a-fA-F]+))?\\)?");   // Odometer

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_277d77dlx1dsnr9.R.inc(9339);

        __CLR4_5_277d77dlx1dsnr9.R.inc(9340);String sentence = (String) msg;

        // Find message start
        __CLR4_5_277d77dlx1dsnr9.R.inc(9341);int beginIndex = sentence.indexOf('(');
        __CLR4_5_277d77dlx1dsnr9.R.inc(9342);if ((((beginIndex != -1)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9343)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9344)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9345);sentence = sentence.substring(beginIndex + 1);
        }
        
        // Send response
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9346);if ((((channel != null)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9347)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9348)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9349);String id = sentence.substring(0, 12);
            __CLR4_5_277d77dlx1dsnr9.R.inc(9350);String type = sentence.substring(12, 16);
            __CLR4_5_277d77dlx1dsnr9.R.inc(9351);if ((((type.equals("BP00"))&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9352)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9353)==0&false))) {{
                __CLR4_5_277d77dlx1dsnr9.R.inc(9354);String content = sentence.substring(sentence.length() - 3);
                __CLR4_5_277d77dlx1dsnr9.R.inc(9355);channel.write("(" + id + "AP01" + content + ")");
            } }else {__CLR4_5_277d77dlx1dsnr9.R.inc(9356);if ((((type.equals("BP05"))&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9357)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9358)==0&false))) {{
                __CLR4_5_277d77dlx1dsnr9.R.inc(9359);channel.write("(" + id + "AP05)");
            }
        }}}

        // Parse message
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9360);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_277d77dlx1dsnr9.R.inc(9361);if ((((!parser.matches())&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9362)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9363)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9364);return null;
        }

        // Create new position
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9365);Position position = new Position();
        __CLR4_5_277d77dlx1dsnr9.R.inc(9366);position.setProtocol(getProtocolName());
        __CLR4_5_277d77dlx1dsnr9.R.inc(9367);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_277d77dlx1dsnr9.R.inc(9368);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9369)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9370)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9371);return null;
        }
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9372);position.setDeviceId(getDeviceId());

        // Date
        __CLR4_5_277d77dlx1dsnr9.R.inc(9373);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9374);time.clear();
        __CLR4_5_277d77dlx1dsnr9.R.inc(9375);if ((((parser.group(index++) == null)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9376)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9377)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9378);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_277d77dlx1dsnr9.R.inc(9379);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_277d77dlx1dsnr9.R.inc(9380);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        } }else {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9381);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_277d77dlx1dsnr9.R.inc(9382);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_277d77dlx1dsnr9.R.inc(9383);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        }

        // Validity
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9384);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_277d77dlx1dsnr9.R.inc(9385);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9386);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_277d77dlx1dsnr9.R.inc(9387);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9388)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9389)==0&false))) {__CLR4_5_277d77dlx1dsnr9.R.inc(9390);latitude = -latitude;
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9391);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_277d77dlx1dsnr9.R.inc(9392);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9393);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_277d77dlx1dsnr9.R.inc(9394);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9395)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9396)==0&false))) {__CLR4_5_277d77dlx1dsnr9.R.inc(9397);longitude = -longitude;
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9398);position.setLongitude(longitude);

        // Speed
        __CLR4_5_277d77dlx1dsnr9.R.inc(9399);if ((((Boolean.valueOf(Context.getProps().getProperty(getProtocolName() + ".mph")))&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9400)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9401)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9402);position.setSpeed(UnitsConverter.knotsFromMph(Double.valueOf(parser.group(index++))));
        } }else {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9403);position.setSpeed(UnitsConverter.knotsFromKph(Double.valueOf(parser.group(index++))));
        }

        // Time
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9404);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9405);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9406);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));
        __CLR4_5_277d77dlx1dsnr9.R.inc(9407);position.setTime(time.getTime());

        // Course
        __CLR4_5_277d77dlx1dsnr9.R.inc(9408);position.setCourse(Double.valueOf(parser.group(index++)));
        
        // State
        __CLR4_5_277d77dlx1dsnr9.R.inc(9409);position.set(Event.KEY_STATUS, parser.group(index++));

        // Odometer
        __CLR4_5_277d77dlx1dsnr9.R.inc(9410);String odometer = parser.group(index++);
        __CLR4_5_277d77dlx1dsnr9.R.inc(9411);if ((((odometer != null)&&(__CLR4_5_277d77dlx1dsnr9.R.iget(9412)!=0|true))||(__CLR4_5_277d77dlx1dsnr9.R.iget(9413)==0&false))) {{
            __CLR4_5_277d77dlx1dsnr9.R.inc(9414);position.set(Event.KEY_ODOMETER, Long.parseLong(odometer, 16));
        }
        }__CLR4_5_277d77dlx1dsnr9.R.inc(9415);return position;
    }finally{__CLR4_5_277d77dlx1dsnr9.R.flushNeeded();}}

}
