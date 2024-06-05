/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class NoranProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25up5uplx1di89c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,7662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NoranProtocolDecoder(NoranProtocol protocol) {
        super(protocol);__CLR4_5_25up5uplx1di89c.R.inc(7586);try{__CLR4_5_25up5uplx1di89c.R.inc(7585);
    }finally{__CLR4_5_25up5uplx1di89c.R.flushNeeded();}}

    private static final DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

    private static final int MSG_UPLOAD_POSITION = 0x0008;
    private static final int MSG_CONTROL_RESPONSE = 0x8009;
    private static final int MSG_ALARM = 0x0003;
    private static final int MSG_SHAKE_HAND = 0x0000;
    private static final int MSG_SHAKE_HAND_RESPONSE = 0x8000;
    private static final int MSG_IMAGE_SIZE = 0x0200;
    private static final int MSG_IMAGE_PACKET = 0x0201;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_25up5uplx1di89c.R.inc(7587);
        
        __CLR4_5_25up5uplx1di89c.R.inc(7588);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_25up5uplx1di89c.R.inc(7589);buf.readUnsignedShort(); // length
        __CLR4_5_25up5uplx1di89c.R.inc(7590);int type = buf.readUnsignedShort();
        
        __CLR4_5_25up5uplx1di89c.R.inc(7591);if ((((type == MSG_SHAKE_HAND && channel != null)&&(__CLR4_5_25up5uplx1di89c.R.iget(7592)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7593)==0&false))) {{
            
            __CLR4_5_25up5uplx1di89c.R.inc(7594);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 13);
            __CLR4_5_25up5uplx1di89c.R.inc(7595);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n*KW", Charset.defaultCharset()));
            __CLR4_5_25up5uplx1di89c.R.inc(7596);response.writeByte(0);
            __CLR4_5_25up5uplx1di89c.R.inc(7597);response.writeShort(response.capacity());
            __CLR4_5_25up5uplx1di89c.R.inc(7598);response.writeShort(MSG_SHAKE_HAND_RESPONSE);
            __CLR4_5_25up5uplx1di89c.R.inc(7599);response.writeByte(1); // status
            __CLR4_5_25up5uplx1di89c.R.inc(7600);response.writeBytes(ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n", Charset.defaultCharset()));
            
            __CLR4_5_25up5uplx1di89c.R.inc(7601);channel.write(response, remoteAddress);
        }
        
        }else {__CLR4_5_25up5uplx1di89c.R.inc(7602);if ((((type == MSG_UPLOAD_POSITION ||
                 type == MSG_CONTROL_RESPONSE ||
                 type == MSG_ALARM)&&(__CLR4_5_25up5uplx1di89c.R.iget(7603)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7604)==0&false))) {{

            __CLR4_5_25up5uplx1di89c.R.inc(7605);boolean newFormat = false;
            /*if (((type == MSG_UPLOAD_POSITION || type == MSG_ALARM) && buf.readableBytes() == 30) ||
                ((type == MSG_CONTROL_RESPONSE) && buf.readableBytes() == 39)) {
                newFormat = false;
            }*/
            __CLR4_5_25up5uplx1di89c.R.inc(7606);if ((((((type == MSG_UPLOAD_POSITION || type == MSG_ALARM) && buf.readableBytes() == 48) ||
                ((type == MSG_CONTROL_RESPONSE) && buf.readableBytes() == 57))&&(__CLR4_5_25up5uplx1di89c.R.iget(7607)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7608)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7609);newFormat = true;
            }

            // Create new position
            }__CLR4_5_25up5uplx1di89c.R.inc(7610);Position position = new Position();
            __CLR4_5_25up5uplx1di89c.R.inc(7611);position.setProtocol(getProtocolName());
            
            __CLR4_5_25up5uplx1di89c.R.inc(7612);if ((((type == MSG_CONTROL_RESPONSE)&&(__CLR4_5_25up5uplx1di89c.R.iget(7613)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7614)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7615);buf.readUnsignedInt(); // GIS ip
                __CLR4_5_25up5uplx1di89c.R.inc(7616);buf.readUnsignedInt(); // GIS port
            }

            // Flags
            }__CLR4_5_25up5uplx1di89c.R.inc(7617);int flags = buf.readUnsignedByte();
            __CLR4_5_25up5uplx1di89c.R.inc(7618);position.setValid((flags & 0x01) != 0);

            // Alarm type
            __CLR4_5_25up5uplx1di89c.R.inc(7619);position.set(Event.KEY_ALARM, buf.readUnsignedByte());

            // Location
            __CLR4_5_25up5uplx1di89c.R.inc(7620);if ((((newFormat)&&(__CLR4_5_25up5uplx1di89c.R.iget(7621)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7622)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7623);position.setSpeed(buf.readUnsignedInt());
                __CLR4_5_25up5uplx1di89c.R.inc(7624);position.setCourse(buf.readFloat());
            } }else {{
                __CLR4_5_25up5uplx1di89c.R.inc(7625);position.setSpeed(buf.readUnsignedByte());
                __CLR4_5_25up5uplx1di89c.R.inc(7626);position.setCourse(buf.readUnsignedShort());
            }
            }__CLR4_5_25up5uplx1di89c.R.inc(7627);position.setLongitude(buf.readFloat());
            __CLR4_5_25up5uplx1di89c.R.inc(7628);position.setLatitude(buf.readFloat());

            // Time
            __CLR4_5_25up5uplx1di89c.R.inc(7629);if ((((!newFormat)&&(__CLR4_5_25up5uplx1di89c.R.iget(7630)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7631)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7632);long timeValue = buf.readUnsignedInt();
                __CLR4_5_25up5uplx1di89c.R.inc(7633);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_25up5uplx1di89c.R.inc(7634);time.clear();
                __CLR4_5_25up5uplx1di89c.R.inc(7635);time.set(Calendar.YEAR, 2000 + (int) (timeValue >> 26));
                __CLR4_5_25up5uplx1di89c.R.inc(7636);time.set(Calendar.MONTH, (int) (timeValue >> 22 & 0x0f) - 1);
                __CLR4_5_25up5uplx1di89c.R.inc(7637);time.set(Calendar.DAY_OF_MONTH, (int) (timeValue >> 17 & 0x1f));
                __CLR4_5_25up5uplx1di89c.R.inc(7638);time.set(Calendar.HOUR_OF_DAY, (int) (timeValue >> 12 & 0x1f));
                __CLR4_5_25up5uplx1di89c.R.inc(7639);time.set(Calendar.MINUTE, (int) (timeValue >> 6 & 0x3f));
                __CLR4_5_25up5uplx1di89c.R.inc(7640);time.set(Calendar.SECOND, (int) (timeValue & 0x3f));
                __CLR4_5_25up5uplx1di89c.R.inc(7641);position.setTime(time.getTime());
            }

            // Identification
            }__CLR4_5_25up5uplx1di89c.R.inc(7642);String id = buf.readBytes((((newFormat )&&(__CLR4_5_25up5uplx1di89c.R.iget(7643)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7644)==0&false))? 12 : 11).toString(Charset.defaultCharset()).replaceAll("[^\\p{Print}]", "");
            __CLR4_5_25up5uplx1di89c.R.inc(7645);if ((((!identify(id, channel, remoteAddress))&&(__CLR4_5_25up5uplx1di89c.R.iget(7646)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7647)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7648);return null;
            }
            }__CLR4_5_25up5uplx1di89c.R.inc(7649);position.setDeviceId(getDeviceId());

            // Time
            __CLR4_5_25up5uplx1di89c.R.inc(7650);if ((((newFormat)&&(__CLR4_5_25up5uplx1di89c.R.iget(7651)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7652)==0&false))) {{
                __CLR4_5_25up5uplx1di89c.R.inc(7653);position.setTime(dateFormat.parse(buf.readBytes(17).toString(Charset.defaultCharset())));
                __CLR4_5_25up5uplx1di89c.R.inc(7654);buf.readByte();
            }

            }__CLR4_5_25up5uplx1di89c.R.inc(7655);if ((((!newFormat)&&(__CLR4_5_25up5uplx1di89c.R.iget(7656)!=0|true))||(__CLR4_5_25up5uplx1di89c.R.iget(7657)==0&false))) {{

                // IO status
                __CLR4_5_25up5uplx1di89c.R.inc(7658);position.set(Event.PREFIX_IO + 1, buf.readUnsignedByte());

                // Fuel
                __CLR4_5_25up5uplx1di89c.R.inc(7659);position.set(Event.KEY_FUEL, buf.readUnsignedByte());
            }

            }__CLR4_5_25up5uplx1di89c.R.inc(7660);return position;
        }

        }}__CLR4_5_25up5uplx1di89c.R.inc(7661);return null;
    }finally{__CLR4_5_25up5uplx1di89c.R.flushNeeded();}}

}
