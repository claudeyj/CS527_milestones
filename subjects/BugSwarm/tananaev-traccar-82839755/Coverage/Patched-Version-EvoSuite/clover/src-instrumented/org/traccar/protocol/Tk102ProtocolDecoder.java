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
import org.traccar.model.Position;

public class Tk102ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27ml7mllx1e695x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,9942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tk102ProtocolDecoder(Tk102Protocol protocol) {
        super(protocol);__CLR4_5_27ml7mllx1e695x.R.inc(9886);try{__CLR4_5_27ml7mllx1e695x.R.inc(9885);
    }finally{__CLR4_5_27ml7mllx1e695x.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\[.\\d{10}.\\(\\p{Upper}+" +
            "(\\d{2})(\\d{2})(\\d{2})" +   // Time (HHMMSS)
            "([AV])" +                     // Validity
            "(\\d{2})(\\d{2}\\.\\d{4})" +  // Latitude (DDMM.MMMM)
            "([NS])" +
            "(\\d{3})(\\d{2}\\.\\d{4})" +  // Longitude (DDDMM.MMMM)
            "([EW])" +
            "(\\d{3}\\.\\d{3})" +          // Speed
            "(\\d{2})(\\d{2})(\\d{2})" +   // Date (DDMMYY)
            "\\d+.*\\)\\]?");

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_27ml7mllx1e695x.R.inc(9887);

        __CLR4_5_27ml7mllx1e695x.R.inc(9888);String sentence = (String) msg;

        // Login
        __CLR4_5_27ml7mllx1e695x.R.inc(9889);if ((((sentence.startsWith("[!"))&&(__CLR4_5_27ml7mllx1e695x.R.iget(9890)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9891)==0&false))) {{
            __CLR4_5_27ml7mllx1e695x.R.inc(9892);if ((((!identify(sentence.substring(14, 14 + 15), channel))&&(__CLR4_5_27ml7mllx1e695x.R.iget(9893)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9894)==0&false))) {{
                __CLR4_5_27ml7mllx1e695x.R.inc(9895);return null;
            }

            }__CLR4_5_27ml7mllx1e695x.R.inc(9896);if ((((channel != null)&&(__CLR4_5_27ml7mllx1e695x.R.iget(9897)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9898)==0&false))) {{
                __CLR4_5_27ml7mllx1e695x.R.inc(9899);channel.write("[\u201d0000000001" + sentence.substring(13) + "]");
            }
        }}

        // Quit
        }else {__CLR4_5_27ml7mllx1e695x.R.inc(9900);if ((((sentence.startsWith("[#"))&&(__CLR4_5_27ml7mllx1e695x.R.iget(9901)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9902)==0&false))) {{
            // TODO: Send response
        }

        // Parse message
        }else {__CLR4_5_27ml7mllx1e695x.R.inc(9903);if ((((hasDeviceId())&&(__CLR4_5_27ml7mllx1e695x.R.iget(9904)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9905)==0&false))) {{

            // Parse message
            __CLR4_5_27ml7mllx1e695x.R.inc(9906);Matcher parser = pattern.matcher(sentence);
            __CLR4_5_27ml7mllx1e695x.R.inc(9907);if ((((!parser.matches())&&(__CLR4_5_27ml7mllx1e695x.R.iget(9908)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9909)==0&false))) {{
                __CLR4_5_27ml7mllx1e695x.R.inc(9910);return null;
            }

            // Create new position
            }__CLR4_5_27ml7mllx1e695x.R.inc(9911);Position position = new Position();
            __CLR4_5_27ml7mllx1e695x.R.inc(9912);position.setProtocol(getProtocolName());
            __CLR4_5_27ml7mllx1e695x.R.inc(9913);position.setDeviceId(getDeviceId());

            __CLR4_5_27ml7mllx1e695x.R.inc(9914);Integer index = 1;

            // Time
            __CLR4_5_27ml7mllx1e695x.R.inc(9915);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_27ml7mllx1e695x.R.inc(9916);time.clear();
            __CLR4_5_27ml7mllx1e695x.R.inc(9917);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27ml7mllx1e695x.R.inc(9918);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27ml7mllx1e695x.R.inc(9919);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

            // Validity
            __CLR4_5_27ml7mllx1e695x.R.inc(9920);position.setValid(parser.group(index++).compareTo("A") == 0);

            // Latitude
            __CLR4_5_27ml7mllx1e695x.R.inc(9921);Double latitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27ml7mllx1e695x.R.inc(9922);latitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27ml7mllx1e695x.R.inc(9923);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_27ml7mllx1e695x.R.iget(9924)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9925)==0&false))) {__CLR4_5_27ml7mllx1e695x.R.inc(9926);latitude = -latitude;
            }__CLR4_5_27ml7mllx1e695x.R.inc(9927);position.setLatitude(latitude);

            // Longitude
            __CLR4_5_27ml7mllx1e695x.R.inc(9928);Double longitude = Double.valueOf(parser.group(index++));
            __CLR4_5_27ml7mllx1e695x.R.inc(9929);longitude += Double.valueOf(parser.group(index++)) / 60;
            __CLR4_5_27ml7mllx1e695x.R.inc(9930);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_27ml7mllx1e695x.R.iget(9931)!=0|true))||(__CLR4_5_27ml7mllx1e695x.R.iget(9932)==0&false))) {__CLR4_5_27ml7mllx1e695x.R.inc(9933);longitude = -longitude;
            }__CLR4_5_27ml7mllx1e695x.R.inc(9934);position.setLongitude(longitude);

            // Speed
            __CLR4_5_27ml7mllx1e695x.R.inc(9935);position.setSpeed(Double.valueOf(parser.group(index++)));

            // Date
            __CLR4_5_27ml7mllx1e695x.R.inc(9936);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
            __CLR4_5_27ml7mllx1e695x.R.inc(9937);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
            __CLR4_5_27ml7mllx1e695x.R.inc(9938);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
            __CLR4_5_27ml7mllx1e695x.R.inc(9939);position.setTime(time.getTime());
            __CLR4_5_27ml7mllx1e695x.R.inc(9940);return position;
        }

        }}}__CLR4_5_27ml7mllx1e695x.R.inc(9941);return null;
    }finally{__CLR4_5_27ml7mllx1e695x.R.flushNeeded();}}

}
