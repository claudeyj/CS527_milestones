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
import java.nio.charset.Charset;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class AtrackProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_227z27zlx1dsliq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,2951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AtrackProtocolDecoder(AtrackProtocol protocol) {
        super(protocol);__CLR4_5_227z27zlx1dsliq.R.inc(2880);try{__CLR4_5_227z27zlx1dsliq.R.inc(2879);
    }finally{__CLR4_5_227z27zlx1dsliq.R.flushNeeded();}}

    private static final int MIN_DATA_LENGTH = 40;

    private static void sendResponse(Channel channel, SocketAddress remoteAddress, long rawId, int index) {try{__CLR4_5_227z27zlx1dsliq.R.inc(2881);
        __CLR4_5_227z27zlx1dsliq.R.inc(2882);if ((((channel != null)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2883)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2884)==0&false))) {{
            __CLR4_5_227z27zlx1dsliq.R.inc(2885);ChannelBuffer response = ChannelBuffers.directBuffer(12);
            __CLR4_5_227z27zlx1dsliq.R.inc(2886);response.writeShort(0xfe02);
            __CLR4_5_227z27zlx1dsliq.R.inc(2887);response.writeLong(rawId);
            __CLR4_5_227z27zlx1dsliq.R.inc(2888);response.writeShort(index);
            __CLR4_5_227z27zlx1dsliq.R.inc(2889);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_227z27zlx1dsliq.R.flushNeeded();}}
    
    private static String readString(ChannelBuffer buf) {try{__CLR4_5_227z27zlx1dsliq.R.inc(2890);
        
        __CLR4_5_227z27zlx1dsliq.R.inc(2891);String result = null;
        __CLR4_5_227z27zlx1dsliq.R.inc(2892);int length = 0;
        __CLR4_5_227z27zlx1dsliq.R.inc(2893);while ((((buf.getByte(buf.readerIndex() + length) != 0)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2894)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2895)==0&false))) {{
            __CLR4_5_227z27zlx1dsliq.R.inc(2896);length += 1;
        }
        }__CLR4_5_227z27zlx1dsliq.R.inc(2897);if ((((length != 0)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2898)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2899)==0&false))) {{
            __CLR4_5_227z27zlx1dsliq.R.inc(2900);result = buf.toString(buf.readerIndex(), length, Charset.defaultCharset());
            __CLR4_5_227z27zlx1dsliq.R.inc(2901);buf.skipBytes(length);
        }
        }__CLR4_5_227z27zlx1dsliq.R.inc(2902);buf.readByte();
        
        __CLR4_5_227z27zlx1dsliq.R.inc(2903);return result;
    }finally{__CLR4_5_227z27zlx1dsliq.R.flushNeeded();}}
    
    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_227z27zlx1dsliq.R.inc(2904);

        __CLR4_5_227z27zlx1dsliq.R.inc(2905);ChannelBuffer buf = (ChannelBuffer) msg;

        // Keep alive message
        __CLR4_5_227z27zlx1dsliq.R.inc(2906);if ((((buf.getUnsignedShort(buf.readerIndex()) == 0xfe02)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2907)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2908)==0&false))) {{
            __CLR4_5_227z27zlx1dsliq.R.inc(2909);if ((((channel != null)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2910)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2911)==0&false))) {{
                __CLR4_5_227z27zlx1dsliq.R.inc(2912);channel.write(buf, remoteAddress);
            }
            }__CLR4_5_227z27zlx1dsliq.R.inc(2913);return null;
        }
        
        }__CLR4_5_227z27zlx1dsliq.R.inc(2914);buf.skipBytes(2); // prefix
        __CLR4_5_227z27zlx1dsliq.R.inc(2915);buf.readUnsignedShort(); // checksum
        __CLR4_5_227z27zlx1dsliq.R.inc(2916);buf.readUnsignedShort(); // length
        __CLR4_5_227z27zlx1dsliq.R.inc(2917);int index = buf.readUnsignedShort();

        // Get device id
        __CLR4_5_227z27zlx1dsliq.R.inc(2918);long id = buf.readLong();
        __CLR4_5_227z27zlx1dsliq.R.inc(2919);if ((((!identify(String.valueOf(id), channel, remoteAddress))&&(__CLR4_5_227z27zlx1dsliq.R.iget(2920)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2921)==0&false))) {{
            __CLR4_5_227z27zlx1dsliq.R.inc(2922);return null;
        }

        // Send acknowledgement
        }__CLR4_5_227z27zlx1dsliq.R.inc(2923);sendResponse(channel, remoteAddress, id, index);

        __CLR4_5_227z27zlx1dsliq.R.inc(2924);List<Position> positions = new LinkedList<Position>();

        __CLR4_5_227z27zlx1dsliq.R.inc(2925);while ((((buf.readableBytes() >= MIN_DATA_LENGTH)&&(__CLR4_5_227z27zlx1dsliq.R.iget(2926)!=0|true))||(__CLR4_5_227z27zlx1dsliq.R.iget(2927)==0&false))) {{

            // Create new position
            __CLR4_5_227z27zlx1dsliq.R.inc(2928);Position position = new Position();
            __CLR4_5_227z27zlx1dsliq.R.inc(2929);position.setDeviceId(getDeviceId());
            __CLR4_5_227z27zlx1dsliq.R.inc(2930);position.setProtocol(getProtocolName());

            // Date and time
            __CLR4_5_227z27zlx1dsliq.R.inc(2931);position.setTime(new Date(buf.readUnsignedInt() * 1000)); // gps time
            __CLR4_5_227z27zlx1dsliq.R.inc(2932);buf.readUnsignedInt(); // rtc time
            __CLR4_5_227z27zlx1dsliq.R.inc(2933);buf.readUnsignedInt(); // send time

            // Coordinates
            __CLR4_5_227z27zlx1dsliq.R.inc(2934);position.setValid(true);
            __CLR4_5_227z27zlx1dsliq.R.inc(2935);position.setLongitude(buf.readInt() * 0.000001);
            __CLR4_5_227z27zlx1dsliq.R.inc(2936);position.setLatitude(buf.readInt() * 0.000001);

            // Course
            __CLR4_5_227z27zlx1dsliq.R.inc(2937);position.setCourse(buf.readUnsignedShort());

            // Report type
            __CLR4_5_227z27zlx1dsliq.R.inc(2938);position.set(Event.KEY_TYPE, buf.readUnsignedByte());

            // Odometer
            __CLR4_5_227z27zlx1dsliq.R.inc(2939);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt() * 0.1);

            // Accuracy
            __CLR4_5_227z27zlx1dsliq.R.inc(2940);position.set(Event.KEY_HDOP, buf.readUnsignedShort() * 0.1);

            // Input
            __CLR4_5_227z27zlx1dsliq.R.inc(2941);position.set(Event.KEY_INPUT, buf.readUnsignedByte());

            // Speed
            __CLR4_5_227z27zlx1dsliq.R.inc(2942);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedShort()));

            // Output
            __CLR4_5_227z27zlx1dsliq.R.inc(2943);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());

            // ADC
            __CLR4_5_227z27zlx1dsliq.R.inc(2944);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort() * 0.001);

            // Driver
            __CLR4_5_227z27zlx1dsliq.R.inc(2945);position.set("driver", readString(buf));

            // Temperature
            __CLR4_5_227z27zlx1dsliq.R.inc(2946);position.set(Event.PREFIX_TEMP + 1, buf.readShort() * 0.1);
            __CLR4_5_227z27zlx1dsliq.R.inc(2947);position.set(Event.PREFIX_TEMP + 2, buf.readShort() * 0.1);

            // Text Message
            __CLR4_5_227z27zlx1dsliq.R.inc(2948);position.set("message", readString(buf));

            // With AT$FORM Command you can extend atrack protocol.
            // For example adding AT$FORM %FC /Fuel used you can add the line in this position:
            // position.set("fuelused", buf.readUnsignedInt() * 0.1);
            __CLR4_5_227z27zlx1dsliq.R.inc(2949);positions.add(position);
        }

        }__CLR4_5_227z27zlx1dsliq.R.inc(2950);return positions;
    }finally{__CLR4_5_227z27zlx1dsliq.R.flushNeeded();}}

}
