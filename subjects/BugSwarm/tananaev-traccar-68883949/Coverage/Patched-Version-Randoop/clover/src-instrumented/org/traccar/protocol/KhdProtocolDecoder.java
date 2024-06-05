/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class KhdProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24ip4iplx1dp7vj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,5929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public KhdProtocolDecoder(KhdProtocol protocol) {
        super(protocol);__CLR4_5_24ip4iplx1dp7vj.R.inc(5858);try{__CLR4_5_24ip4iplx1dp7vj.R.inc(5857);
    }finally{__CLR4_5_24ip4iplx1dp7vj.R.flushNeeded();}}

    private String readSerialNumber(ChannelBuffer buf) {try{__CLR4_5_24ip4iplx1dp7vj.R.inc(5859);
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5860);int b1 = buf.readUnsignedByte();
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5861);int b2 = buf.readUnsignedByte(); __CLR4_5_24ip4iplx1dp7vj.R.inc(5862);if ((((b2 > 0x80)&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5863)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5864)==0&false))) {__CLR4_5_24ip4iplx1dp7vj.R.inc(5865);b2 -= 0x80;
        }__CLR4_5_24ip4iplx1dp7vj.R.inc(5866);int b3 = buf.readUnsignedByte(); __CLR4_5_24ip4iplx1dp7vj.R.inc(5867);if ((((b3 > 0x80)&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5868)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5869)==0&false))) {__CLR4_5_24ip4iplx1dp7vj.R.inc(5870);b3 -= 0x80;
        }__CLR4_5_24ip4iplx1dp7vj.R.inc(5871);int b4 = buf.readUnsignedByte();
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5872);String serialNumber = String.format("%02d%02d%02d%02d", b1, b2, b3, b4);
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5873);return String.valueOf(Long.valueOf(serialNumber));
    }finally{__CLR4_5_24ip4iplx1dp7vj.R.flushNeeded();}}

    private static final int MSG_LOGIN = 0xB1;
    private static final int MSG_CONFIRMATION = 0x21;
    private static final int MSG_ON_DEMAND = 0x81;
    private static final int MSG_POSITION_UPLOAD = 0x80;
    private static final int MSG_POSITION_REUPLOAD = 0x8E;
    private static final int MSG_ALARM = 0x82;
    private static final int MSG_REPLY = 0x85;
    private static final int MSG_PERIPHERAL = 0xA3;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_24ip4iplx1dp7vj.R.inc(5874);

        __CLR4_5_24ip4iplx1dp7vj.R.inc(5875);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_24ip4iplx1dp7vj.R.inc(5876);buf.skipBytes(2); // header
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5877);int type = buf.readUnsignedByte();
        __CLR4_5_24ip4iplx1dp7vj.R.inc(5878);buf.readUnsignedShort(); // size

        __CLR4_5_24ip4iplx1dp7vj.R.inc(5879);if ((((type == MSG_ON_DEMAND ||
            type == MSG_POSITION_UPLOAD ||
            type == MSG_POSITION_REUPLOAD ||
            type == MSG_ALARM ||
            type == MSG_REPLY ||
            type == MSG_PERIPHERAL)&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5880)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5881)==0&false))) {{

            // Create new position
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5882);Position position = new Position();
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5883);position.setProtocol(getProtocolName());

            // Device identification
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5884);if ((((!identify(readSerialNumber(buf), channel))&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5885)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5886)==0&false))) {{
                __CLR4_5_24ip4iplx1dp7vj.R.inc(5887);return null;
            }
            }__CLR4_5_24ip4iplx1dp7vj.R.inc(5888);position.setDeviceId(getDeviceId());

            // Date and time
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5889);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5890);time.clear();
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5891);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5892);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5893);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5894);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5895);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5896);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5897);position.setTime(time.getTime());

            // Location
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5898);position.setLatitude(ChannelBufferTools.readCoordinate(buf));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5899);position.setLongitude(ChannelBufferTools.readCoordinate(buf));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5900);position.setSpeed(UnitsConverter.knotsFromKph(ChannelBufferTools.readHexInteger(buf, 4)));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5901);position.setCourse(ChannelBufferTools.readHexInteger(buf, 4));

            // Flags
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5902);int flags = buf.readUnsignedByte();
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5903);position.setValid((flags & 0x80) != 0);
            
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5904);if ((((type == MSG_ALARM)&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5905)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5906)==0&false))) {{
                
                __CLR4_5_24ip4iplx1dp7vj.R.inc(5907);buf.skipBytes(2);

            } }else {{

                // Odometer
                __CLR4_5_24ip4iplx1dp7vj.R.inc(5908);position.set(Event.KEY_ODOMETER, buf.readUnsignedMedium());
            
                // Status
                __CLR4_5_24ip4iplx1dp7vj.R.inc(5909);buf.skipBytes(4);
                
                // Other
                __CLR4_5_24ip4iplx1dp7vj.R.inc(5910);buf.skipBytes(8);

            }
            
            // TODO: parse extra data
            }__CLR4_5_24ip4iplx1dp7vj.R.inc(5911);return position;
        }

        }else {__CLR4_5_24ip4iplx1dp7vj.R.inc(5912);if ((((type == MSG_LOGIN && channel != null)&&(__CLR4_5_24ip4iplx1dp7vj.R.iget(5913)!=0|true))||(__CLR4_5_24ip4iplx1dp7vj.R.iget(5914)==0&false))) {{
            
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5915);buf.skipBytes(4); // serial number
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5916);buf.readByte(); // reserved
            
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5917);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5918);response.writeByte(0x29); __CLR4_5_24ip4iplx1dp7vj.R.inc(5919);response.writeByte(0x29); // header
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5920);response.writeByte(MSG_CONFIRMATION);
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5921);response.writeShort(5); // size
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5922);response.writeByte(buf.readUnsignedByte());
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5923);response.writeByte(type);
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5924);response.writeByte(0); // reserved
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5925);response.writeByte(Crc.xorChecksum(response.toByteBuffer(0, 8)));
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5926);response.writeByte(0x0D); // ending
            __CLR4_5_24ip4iplx1dp7vj.R.inc(5927);channel.write(response);

        }
        
        }}__CLR4_5_24ip4iplx1dp7vj.R.inc(5928);return null;
    }finally{__CLR4_5_24ip4iplx1dp7vj.R.flushNeeded();}}

}
