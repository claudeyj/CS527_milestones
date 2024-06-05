/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.helper.Crc;
import org.traccar.model.Position;

public class LaipacProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24x64x6lx1e68d1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,6452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public LaipacProtocolDecoder(LaipacProtocol protocol) {
        super(protocol);__CLR4_5_24x64x6lx1e68d1.R.inc(6379);try{__CLR4_5_24x64x6lx1e68d1.R.inc(6378);
    }finally{__CLR4_5_24x64x6lx1e68d1.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\$AVRMC," +
            "([^,]+)," +                   // Identifier
            "(\\d{2})(\\d{2})(\\d{2})," +  // Time (HHMMSS)
            "([AVRavr])," +                // Validity
            "(\\d{2})(\\d{2}\\.\\d+)," +   // Latitude (DDMM.MMMM)
            "([NS])," +
            "(\\d{3})(\\d{2}\\.\\d+)," +   // Longitude (DDDMM.MMMM)
            "([EW])," +
            "(\\d+\\.\\d+)," +             // Speed
            "(\\d+\\.\\d+)," +             // Course
            "(\\d{2})(\\d{2})(\\d{2})," +  // Date (DDMMYY)
            "(.)," +                       // Type
            "[^\\*]+\\*" +
            "(\\p{XDigit}{2})");           // Checksum
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24x64x6lx1e68d1.R.inc(6380);

        __CLR4_5_24x64x6lx1e68d1.R.inc(6381);String sentence = (String) msg;

        // Heartbeat
        __CLR4_5_24x64x6lx1e68d1.R.inc(6382);if ((((sentence.startsWith("$ECHK") && channel != null)&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6383)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6384)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6385);channel.write(sentence + "\r\n");
            __CLR4_5_24x64x6lx1e68d1.R.inc(6386);return null;
        }
        
        // Parse message
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6387);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_24x64x6lx1e68d1.R.inc(6388);if ((((!parser.matches())&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6389)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6390)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6391);return null;
        }

        // Create new position
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6392);Position position = new Position();
        __CLR4_5_24x64x6lx1e68d1.R.inc(6393);position.setProtocol(getProtocolName());
        __CLR4_5_24x64x6lx1e68d1.R.inc(6394);Integer index = 1;

        // Identification
        __CLR4_5_24x64x6lx1e68d1.R.inc(6395);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6396)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6397)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6398);return null;
        }
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6399);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_24x64x6lx1e68d1.R.inc(6400);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6401);time.clear();
        __CLR4_5_24x64x6lx1e68d1.R.inc(6402);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6403);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6404);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_24x64x6lx1e68d1.R.inc(6405);String status = parser.group(index++);
        __CLR4_5_24x64x6lx1e68d1.R.inc(6406);position.setValid(status.compareToIgnoreCase("A") == 0);

        // Latitude
        __CLR4_5_24x64x6lx1e68d1.R.inc(6407);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6408);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24x64x6lx1e68d1.R.inc(6409);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6410)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6411)==0&false))) {__CLR4_5_24x64x6lx1e68d1.R.inc(6412);latitude = -latitude;
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6413);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_24x64x6lx1e68d1.R.inc(6414);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6415);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24x64x6lx1e68d1.R.inc(6416);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6417)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6418)==0&false))) {__CLR4_5_24x64x6lx1e68d1.R.inc(6419);longitude = -longitude;
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6420);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24x64x6lx1e68d1.R.inc(6421);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_24x64x6lx1e68d1.R.inc(6422);position.setCourse(Double.valueOf(parser.group(index++)));

        // Date
        __CLR4_5_24x64x6lx1e68d1.R.inc(6423);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6424);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24x64x6lx1e68d1.R.inc(6425);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24x64x6lx1e68d1.R.inc(6426);position.setTime(time.getTime());

        // Response
        __CLR4_5_24x64x6lx1e68d1.R.inc(6427);String type = parser.group(index++);
        __CLR4_5_24x64x6lx1e68d1.R.inc(6428);String checksum = parser.group(index++);
        __CLR4_5_24x64x6lx1e68d1.R.inc(6429);String response = null;

        __CLR4_5_24x64x6lx1e68d1.R.inc(6430);if ((((type.equals("0") && Character.isLowerCase(status.charAt(0)))&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6431)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6432)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6433);response = "$EAVACK,0," + checksum;
            __CLR4_5_24x64x6lx1e68d1.R.inc(6434);response += Crc.nmeaChecksum(response);
        } }else {__CLR4_5_24x64x6lx1e68d1.R.inc(6435);if ((((type.equals("S") || type.equals("T"))&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6436)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6437)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6438);response = "$AVCFG,00000000,t*21";
        } }else {__CLR4_5_24x64x6lx1e68d1.R.inc(6439);if ((((type.equals("3"))&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6440)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6441)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6442);response = "$AVCFG,00000000,d*31";
        } }else {__CLR4_5_24x64x6lx1e68d1.R.inc(6443);if ((((type.equals("X") || type.equals("4"))&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6444)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6445)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6446);response = "$AVCFG,00000000,x*2D";
        }
        
        }}}}__CLR4_5_24x64x6lx1e68d1.R.inc(6447);if ((((response != null && channel != null)&&(__CLR4_5_24x64x6lx1e68d1.R.iget(6448)!=0|true))||(__CLR4_5_24x64x6lx1e68d1.R.iget(6449)==0&false))) {{
            __CLR4_5_24x64x6lx1e68d1.R.inc(6450);channel.write(response + "\r\n");
        }
        }__CLR4_5_24x64x6lx1e68d1.R.inc(6451);return position;
    }finally{__CLR4_5_24x64x6lx1e68d1.R.flushNeeded();}}

}
