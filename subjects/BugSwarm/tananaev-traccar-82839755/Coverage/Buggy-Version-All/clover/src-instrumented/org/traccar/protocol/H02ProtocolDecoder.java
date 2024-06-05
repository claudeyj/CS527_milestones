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

import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.Calendar; 
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class H02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24iu4iulx1e4zkc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565471168L,8589935092L,5983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public H02ProtocolDecoder(H02Protocol protocol) {
        super(protocol);__CLR4_5_24iu4iulx1e4zkc.R.inc(5863);try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5862);
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}
    
    private static double readCoordinate(ChannelBuffer buf, boolean lon) {try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5864);
        
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5865);int degrees = ChannelBufferTools.readHexInteger(buf, 2);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5866);if ((((lon)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5867)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5868)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5869);degrees = degrees * 10 + (buf.getUnsignedByte(buf.readerIndex()) >> 4);
        }
        
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5870);double result = 0;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5871);if ((((lon)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5872)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5873)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5874);result = buf.readUnsignedByte() & 0x0f;
        }
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5875);result = result * 10 + ChannelBufferTools.readHexInteger(buf, (((lon )&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5876)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5877)==0&false))? 5 : 6) * 0.0001;
        
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5878);result /= 60;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5879);result += degrees;

        __CLR4_5_24iu4iulx1e4zkc.R.inc(5880);return result;
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}

    private void processStatus(Position position, long status) {try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5881);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5882);if ((((!BitUtil.check(status, 0) || !BitUtil.check(status, 1) || !BitUtil.check(status, 3) || !BitUtil.check(status, 4))&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5883)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5884)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5885);position.set(Event.KEY_ALARM, true);
        }
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5886);position.set(Event.KEY_IGNITION, !BitUtil.check(status, 10));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5887);position.set(Event.KEY_STATUS, status);
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}
    
    private Position decodeBinary(ChannelBuffer buf, Channel channel) {try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5888);
        
        // Create new position
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5889);Position position = new Position();
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5890);position.setProtocol(getProtocolName());
        
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5891);buf.readByte(); // marker

        // Identification
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5892);if ((((!identify(ChannelBufferTools.readHexString(buf, 10), channel))&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5893)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5894)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5895);return null;
        }
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5896);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5897);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5898);time.clear();
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5899);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5900);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5901);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5902);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5903);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5904);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5905);position.setTime(time.getTime());
        
        // Location
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5906);double latitude = readCoordinate(buf, false);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5907);position.set(Event.KEY_POWER, buf.readByte());
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5908);double longitude = readCoordinate(buf, true);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5909);int flags = buf.readUnsignedByte() & 0x0f;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5910);position.setValid((flags & 0x02) != 0);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5911);if (((((flags & 0x04) == 0)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5912)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5913)==0&false))) {__CLR4_5_24iu4iulx1e4zkc.R.inc(5914);latitude = -latitude;
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5915);if (((((flags & 0x08) == 0)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5916)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5917)==0&false))) {__CLR4_5_24iu4iulx1e4zkc.R.inc(5918);longitude = -longitude;
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5919);position.setLatitude(latitude);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5920);position.setLongitude(longitude);

        // Speed and course
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5921);position.setSpeed(ChannelBufferTools.readHexInteger(buf, 3));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5922);position.setCourse((buf.readUnsignedByte() & 0x0f) * 100.0 + ChannelBufferTools.readHexInteger(buf, 2));

        __CLR4_5_24iu4iulx1e4zkc.R.inc(5923);processStatus(position, buf.readUnsignedInt());
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5924);return position;
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}

    private static final Pattern pattern = Pattern.compile(
            "\\*..," +                          // Manufacturer
            "(\\d+)," +                         // IMEI
            "V\\d," +                           // Version?
            ".*" +
            "(\\d{2})(\\d{2})(\\d{2})," +       // Time (HHMMSS)
            "([AV])," +                         // Validity
            "-?(\\d+)-?(\\d{2}.\\d+)," +        // Latitude (DDMM.MMMM)
            "([NS])," +
            "-?(\\d+)-?(\\d{2}.\\d+)," +        // Longitude (DDMM.MMMM)
            "([EW])," +
            "(\\d+.?\\d*)," +                   // Speed
            "(\\d+.?\\d*)?," +                  // Course
            "(\\d{2})(\\d{2})(\\d{2})," +       // Date (DDMMYY)
            "(\\p{XDigit}{8})" +                // Status
            ".*");
    
    private Position decodeText(String sentence, Channel channel) {try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5925);

        // Parse message
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5926);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5927);if ((((!parser.matches())&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5928)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5929)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5930);return null;
        }

        // Create new position
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5931);Position position = new Position();
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5932);position.setProtocol(getProtocolName());

        __CLR4_5_24iu4iulx1e4zkc.R.inc(5933);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5934);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5935)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5936)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5937);return null;
        }
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5938);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5939);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5940);time.clear();
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5941);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5942);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5943);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5944);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5945);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5946);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5947);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5948)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5949)==0&false))) {__CLR4_5_24iu4iulx1e4zkc.R.inc(5950);latitude = -latitude;
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5951);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5952);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5953);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5954);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5955)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5956)==0&false))) {__CLR4_5_24iu4iulx1e4zkc.R.inc(5957);longitude = -longitude;
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5958);position.setLongitude(longitude);

        // Speed
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5959);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5960);String course = parser.group(index++);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5961);if ((((course != null)&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5962)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5963)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5964);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_24iu4iulx1e4zkc.R.inc(5965);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5966);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5967);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5968);position.setTime(time.getTime());

        __CLR4_5_24iu4iulx1e4zkc.R.inc(5969);processStatus(position, Long.parseLong(parser.group(index++), 16));
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5970);return position;
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24iu4iulx1e4zkc.R.inc(5971);
        
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5972);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_24iu4iulx1e4zkc.R.inc(5973);String marker = buf.toString(0, 1, Charset.defaultCharset());
        
        // TODO X mode?

        __CLR4_5_24iu4iulx1e4zkc.R.inc(5974);if ((((marker.equals("*"))&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5975)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5976)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5977);return decodeText(buf.toString(Charset.defaultCharset()), channel);
        } }else {__CLR4_5_24iu4iulx1e4zkc.R.inc(5978);if ((((marker.equals("$"))&&(__CLR4_5_24iu4iulx1e4zkc.R.iget(5979)!=0|true))||(__CLR4_5_24iu4iulx1e4zkc.R.iget(5980)==0&false))) {{
            __CLR4_5_24iu4iulx1e4zkc.R.inc(5981);return decodeBinary(buf, channel);
        }

        }}__CLR4_5_24iu4iulx1e4zkc.R.inc(5982);return null;
    }finally{__CLR4_5_24iu4iulx1e4zkc.R.flushNeeded();}}

}
