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

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class H02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_247b47blx1dh41u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,5561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public H02ProtocolDecoder(H02Protocol protocol) {
        super(protocol);__CLR4_5_247b47blx1dh41u.R.inc(5448);try{__CLR4_5_247b47blx1dh41u.R.inc(5447);
    }finally{__CLR4_5_247b47blx1dh41u.R.flushNeeded();}}
    
    private static double readCoordinate(ChannelBuffer buf, boolean lon) {try{__CLR4_5_247b47blx1dh41u.R.inc(5449);
        
        __CLR4_5_247b47blx1dh41u.R.inc(5450);int degrees = ChannelBufferTools.readHexInteger(buf, 2);
        __CLR4_5_247b47blx1dh41u.R.inc(5451);if ((((lon)&&(__CLR4_5_247b47blx1dh41u.R.iget(5452)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5453)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5454);degrees = degrees * 10 + (buf.getUnsignedByte(buf.readerIndex()) >> 4);
        }
        
        }__CLR4_5_247b47blx1dh41u.R.inc(5455);double result = 0;
        __CLR4_5_247b47blx1dh41u.R.inc(5456);if ((((lon)&&(__CLR4_5_247b47blx1dh41u.R.iget(5457)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5458)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5459);result = buf.readUnsignedByte() & 0x0f;
        }
        }__CLR4_5_247b47blx1dh41u.R.inc(5460);result = result * 10 + ChannelBufferTools.readHexInteger(buf, (((lon )&&(__CLR4_5_247b47blx1dh41u.R.iget(5461)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5462)==0&false))? 5 : 6) * 0.0001;
        
        __CLR4_5_247b47blx1dh41u.R.inc(5463);result /= 60;
        __CLR4_5_247b47blx1dh41u.R.inc(5464);result += degrees;

        __CLR4_5_247b47blx1dh41u.R.inc(5465);return result;
    }finally{__CLR4_5_247b47blx1dh41u.R.flushNeeded();}}
    
    private Position decodeBinary(ChannelBuffer buf, Channel channel) {try{__CLR4_5_247b47blx1dh41u.R.inc(5466);
        
        // Create new position
        __CLR4_5_247b47blx1dh41u.R.inc(5467);Position position = new Position();
        __CLR4_5_247b47blx1dh41u.R.inc(5468);position.setProtocol(getProtocolName());
        
        __CLR4_5_247b47blx1dh41u.R.inc(5469);buf.readByte(); // marker

        // Identification
        __CLR4_5_247b47blx1dh41u.R.inc(5470);if ((((!identify(ChannelBufferTools.readHexString(buf, 10), channel))&&(__CLR4_5_247b47blx1dh41u.R.iget(5471)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5472)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5473);return null;
        }
        }__CLR4_5_247b47blx1dh41u.R.inc(5474);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_247b47blx1dh41u.R.inc(5475);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_247b47blx1dh41u.R.inc(5476);time.clear();
        __CLR4_5_247b47blx1dh41u.R.inc(5477);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_247b47blx1dh41u.R.inc(5478);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_247b47blx1dh41u.R.inc(5479);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_247b47blx1dh41u.R.inc(5480);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_247b47blx1dh41u.R.inc(5481);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
        __CLR4_5_247b47blx1dh41u.R.inc(5482);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
        __CLR4_5_247b47blx1dh41u.R.inc(5483);position.setTime(time.getTime());
        
        // Location
        __CLR4_5_247b47blx1dh41u.R.inc(5484);double latitude = readCoordinate(buf, false);
        __CLR4_5_247b47blx1dh41u.R.inc(5485);int x = buf.readByte(); // reserved
        __CLR4_5_247b47blx1dh41u.R.inc(5486);double longitude = readCoordinate(buf, true);
        __CLR4_5_247b47blx1dh41u.R.inc(5487);int flags = buf.readUnsignedByte() & 0x0f;
        __CLR4_5_247b47blx1dh41u.R.inc(5488);position.setValid((flags & 0x02) != 0);
        __CLR4_5_247b47blx1dh41u.R.inc(5489);if (((((flags & 0x04) == 0)&&(__CLR4_5_247b47blx1dh41u.R.iget(5490)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5491)==0&false))) {__CLR4_5_247b47blx1dh41u.R.inc(5492);latitude = -latitude;
        }__CLR4_5_247b47blx1dh41u.R.inc(5493);if (((((flags & 0x08) == 0)&&(__CLR4_5_247b47blx1dh41u.R.iget(5494)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5495)==0&false))) {__CLR4_5_247b47blx1dh41u.R.inc(5496);longitude = -longitude;
        }__CLR4_5_247b47blx1dh41u.R.inc(5497);position.setLatitude(latitude);
        __CLR4_5_247b47blx1dh41u.R.inc(5498);position.setLongitude(longitude);

        // Speed and course
        __CLR4_5_247b47blx1dh41u.R.inc(5499);position.setSpeed(ChannelBufferTools.readHexInteger(buf, 3));
        __CLR4_5_247b47blx1dh41u.R.inc(5500);position.setCourse((buf.readUnsignedByte() & 0x0f) * 100.0 + ChannelBufferTools.readHexInteger(buf, 2));
        
        // Status
        __CLR4_5_247b47blx1dh41u.R.inc(5501);position.set(Event.KEY_STATUS, ChannelBufferTools.readHexString(buf, 8));
        __CLR4_5_247b47blx1dh41u.R.inc(5502);return position;
    }finally{__CLR4_5_247b47blx1dh41u.R.flushNeeded();}}

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
    
    private Position decodeText(String sentence, Channel channel) {try{__CLR4_5_247b47blx1dh41u.R.inc(5503);

        // Parse message
        __CLR4_5_247b47blx1dh41u.R.inc(5504);Matcher parser = pattern.matcher(sentence);
        __CLR4_5_247b47blx1dh41u.R.inc(5505);if ((((!parser.matches())&&(__CLR4_5_247b47blx1dh41u.R.iget(5506)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5507)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5508);return null;
        }

        // Create new position
        }__CLR4_5_247b47blx1dh41u.R.inc(5509);Position position = new Position();
        __CLR4_5_247b47blx1dh41u.R.inc(5510);position.setProtocol(getProtocolName());

        __CLR4_5_247b47blx1dh41u.R.inc(5511);Integer index = 1;

        // Get device by IMEI
        __CLR4_5_247b47blx1dh41u.R.inc(5512);if ((((!identify(parser.group(index++), channel))&&(__CLR4_5_247b47blx1dh41u.R.iget(5513)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5514)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5515);return null;
        }
        }__CLR4_5_247b47blx1dh41u.R.inc(5516);position.setDeviceId(getDeviceId());

        // Time
        __CLR4_5_247b47blx1dh41u.R.inc(5517);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_5_247b47blx1dh41u.R.inc(5518);time.clear();
        __CLR4_5_247b47blx1dh41u.R.inc(5519);time.set(Calendar.HOUR_OF_DAY, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247b47blx1dh41u.R.inc(5520);time.set(Calendar.MINUTE, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247b47blx1dh41u.R.inc(5521);time.set(Calendar.SECOND, Integer.valueOf(parser.group(index++)));

        // Validity
        __CLR4_5_247b47blx1dh41u.R.inc(5522);position.setValid(parser.group(index++).compareTo("A") == 0);

        // Latitude
        __CLR4_5_247b47blx1dh41u.R.inc(5523);Double latitude = Double.valueOf(parser.group(index++));
        __CLR4_5_247b47blx1dh41u.R.inc(5524);latitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_247b47blx1dh41u.R.inc(5525);if ((((parser.group(index++).compareTo("S") == 0)&&(__CLR4_5_247b47blx1dh41u.R.iget(5526)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5527)==0&false))) {__CLR4_5_247b47blx1dh41u.R.inc(5528);latitude = -latitude;
        }__CLR4_5_247b47blx1dh41u.R.inc(5529);position.setLatitude(latitude);

        // Longitude
        __CLR4_5_247b47blx1dh41u.R.inc(5530);Double longitude = Double.valueOf(parser.group(index++));
        __CLR4_5_247b47blx1dh41u.R.inc(5531);longitude += Double.valueOf(parser.group(index++)) / 60;
        __CLR4_5_247b47blx1dh41u.R.inc(5532);if ((((parser.group(index++).compareTo("W") == 0)&&(__CLR4_5_247b47blx1dh41u.R.iget(5533)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5534)==0&false))) {__CLR4_5_247b47blx1dh41u.R.inc(5535);longitude = -longitude;
        }__CLR4_5_247b47blx1dh41u.R.inc(5536);position.setLongitude(longitude);

        // Speed
        __CLR4_5_247b47blx1dh41u.R.inc(5537);position.setSpeed(Double.valueOf(parser.group(index++)));

        // Course
        __CLR4_5_247b47blx1dh41u.R.inc(5538);String course = parser.group(index++);
        __CLR4_5_247b47blx1dh41u.R.inc(5539);if ((((course != null)&&(__CLR4_5_247b47blx1dh41u.R.iget(5540)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5541)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5542);position.setCourse(Double.valueOf(course));
        }

        // Date
        }__CLR4_5_247b47blx1dh41u.R.inc(5543);time.set(Calendar.DAY_OF_MONTH, Integer.valueOf(parser.group(index++)));
        __CLR4_5_247b47blx1dh41u.R.inc(5544);time.set(Calendar.MONTH, Integer.valueOf(parser.group(index++)) - 1);
        __CLR4_5_247b47blx1dh41u.R.inc(5545);time.set(Calendar.YEAR, 2000 + Integer.valueOf(parser.group(index++)));
        __CLR4_5_247b47blx1dh41u.R.inc(5546);position.setTime(time.getTime());
        
        // Status
        __CLR4_5_247b47blx1dh41u.R.inc(5547);position.set(Event.KEY_STATUS, parser.group(index++));
        __CLR4_5_247b47blx1dh41u.R.inc(5548);return position;
    }finally{__CLR4_5_247b47blx1dh41u.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_247b47blx1dh41u.R.inc(5549);
        
        __CLR4_5_247b47blx1dh41u.R.inc(5550);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_247b47blx1dh41u.R.inc(5551);String marker = buf.toString(0, 1, Charset.defaultCharset());
        
        // TODO X mode?

        __CLR4_5_247b47blx1dh41u.R.inc(5552);if ((((marker.equals("*"))&&(__CLR4_5_247b47blx1dh41u.R.iget(5553)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5554)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5555);return decodeText(buf.toString(Charset.defaultCharset()), channel);
        } }else {__CLR4_5_247b47blx1dh41u.R.inc(5556);if ((((marker.equals("$"))&&(__CLR4_5_247b47blx1dh41u.R.iget(5557)!=0|true))||(__CLR4_5_247b47blx1dh41u.R.iget(5558)==0&false))) {{
            __CLR4_5_247b47blx1dh41u.R.inc(5559);return decodeBinary(buf, channel);
        }

        }}__CLR4_5_247b47blx1dh41u.R.inc(5560);return null;
    }finally{__CLR4_5_247b47blx1dh41u.R.flushNeeded();}}

}
