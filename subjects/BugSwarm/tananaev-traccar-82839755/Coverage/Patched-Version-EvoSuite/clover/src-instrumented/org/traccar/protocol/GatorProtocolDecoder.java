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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class GatorProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23m93m9lx1e67no{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,4731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GatorProtocolDecoder(GatorProtocol protocol) {
        super(protocol);__CLR4_5_23m93m9lx1e67no.R.inc(4690);try{__CLR4_5_23m93m9lx1e67no.R.inc(4689);
    }finally{__CLR4_5_23m93m9lx1e67no.R.flushNeeded();}}

    private static final int PACKET_HEARTBEAT = 0x21;
    private static final int PACKET_POSITION_DATA = 0x80;
    private static final int PACKET_ROLLCALL_RESPONSE = 0x81;
    private static final int PACKET_ALARM_DATA = 0x82;
    private static final int PACKET_TERMINAL_STATUS = 0x83;
    private static final int PACKET_MESSAGE = 0x84;
    private static final int PACKET_TERMINAL_ANSWER = 0x85;
    private static final int PACKET_BLIND_AREA = 0x8E;
    private static final int PACKET_PICTURE_FRAME = 0x54;
    private static final int PACKET_CAMERA_RESPONSE = 0x56;
    private static final int PACKET_PICTURE_DATA = 0x57;
    
    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_23m93m9lx1e67no.R.inc(4691);
        
        __CLR4_5_23m93m9lx1e67no.R.inc(4692);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_23m93m9lx1e67no.R.inc(4693);buf.skipBytes(2); // header
        __CLR4_5_23m93m9lx1e67no.R.inc(4694);int type = buf.readUnsignedByte();
        __CLR4_5_23m93m9lx1e67no.R.inc(4695);buf.readUnsignedShort(); // length

        // Pseudo IP address
        __CLR4_5_23m93m9lx1e67no.R.inc(4696);String id = String.format("%02d%02d%02d%02d",
                buf.readUnsignedByte(), buf.readUnsignedByte(),
                buf.readUnsignedByte(), buf.readUnsignedByte());
        __CLR4_5_23m93m9lx1e67no.R.inc(4697);id = id.replaceFirst("^0+(?!$)", "");
        
        __CLR4_5_23m93m9lx1e67no.R.inc(4698);if ((((type == PACKET_POSITION_DATA ||
            type == PACKET_ROLLCALL_RESPONSE ||
            type == PACKET_ALARM_DATA ||
            type == PACKET_BLIND_AREA)&&(__CLR4_5_23m93m9lx1e67no.R.iget(4699)!=0|true))||(__CLR4_5_23m93m9lx1e67no.R.iget(4700)==0&false))) {{
            
            // Create new position
            __CLR4_5_23m93m9lx1e67no.R.inc(4701);Position position = new Position();
            __CLR4_5_23m93m9lx1e67no.R.inc(4702);position.setProtocol(getProtocolName());

            // Identification
            __CLR4_5_23m93m9lx1e67no.R.inc(4703);if ((((!identify(id, channel))&&(__CLR4_5_23m93m9lx1e67no.R.iget(4704)!=0|true))||(__CLR4_5_23m93m9lx1e67no.R.iget(4705)==0&false))) {{
                __CLR4_5_23m93m9lx1e67no.R.inc(4706);return null;
            }
            }__CLR4_5_23m93m9lx1e67no.R.inc(4707);position.setDeviceId(getDeviceId());

            // Date and time
            __CLR4_5_23m93m9lx1e67no.R.inc(4708);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_23m93m9lx1e67no.R.inc(4709);time.clear();
            __CLR4_5_23m93m9lx1e67no.R.inc(4710);time.set(Calendar.YEAR, 2000 + ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_23m93m9lx1e67no.R.inc(4711);time.set(Calendar.MONTH, ChannelBufferTools.readHexInteger(buf, 2) - 1);
            __CLR4_5_23m93m9lx1e67no.R.inc(4712);time.set(Calendar.DAY_OF_MONTH, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_23m93m9lx1e67no.R.inc(4713);time.set(Calendar.HOUR_OF_DAY, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_23m93m9lx1e67no.R.inc(4714);time.set(Calendar.MINUTE, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_23m93m9lx1e67no.R.inc(4715);time.set(Calendar.SECOND, ChannelBufferTools.readHexInteger(buf, 2));
            __CLR4_5_23m93m9lx1e67no.R.inc(4716);position.setTime(time.getTime());

            // Location
            __CLR4_5_23m93m9lx1e67no.R.inc(4717);position.setLatitude(ChannelBufferTools.readCoordinate(buf));
            __CLR4_5_23m93m9lx1e67no.R.inc(4718);position.setLongitude(ChannelBufferTools.readCoordinate(buf));
            __CLR4_5_23m93m9lx1e67no.R.inc(4719);position.setSpeed(UnitsConverter.knotsFromKph(ChannelBufferTools.readHexInteger(buf, 4)));
            __CLR4_5_23m93m9lx1e67no.R.inc(4720);position.setCourse(ChannelBufferTools.readHexInteger(buf, 4));

            // Flags
            __CLR4_5_23m93m9lx1e67no.R.inc(4721);int flags = buf.readUnsignedByte();
            __CLR4_5_23m93m9lx1e67no.R.inc(4722);position.setValid((flags & 0x80) != 0);
            __CLR4_5_23m93m9lx1e67no.R.inc(4723);position.set(Event.KEY_SATELLITES, flags & 0x0f);

            // Status
            __CLR4_5_23m93m9lx1e67no.R.inc(4724);position.set(Event.KEY_STATUS, buf.readUnsignedByte());

            // Key switch
            __CLR4_5_23m93m9lx1e67no.R.inc(4725);position.set("key", buf.readUnsignedByte());

            // Oil
            __CLR4_5_23m93m9lx1e67no.R.inc(4726);position.set("oil", buf.readUnsignedShort() / 10.0);

            // Power
            __CLR4_5_23m93m9lx1e67no.R.inc(4727);position.set(Event.KEY_POWER, buf.readUnsignedByte() + buf.readUnsignedByte() / 100.0);

            // Odometer
            __CLR4_5_23m93m9lx1e67no.R.inc(4728);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            __CLR4_5_23m93m9lx1e67no.R.inc(4729);return position;
        }

        }__CLR4_5_23m93m9lx1e67no.R.inc(4730);return null;
    }finally{__CLR4_5_23m93m9lx1e67no.R.flushNeeded();}}

}
