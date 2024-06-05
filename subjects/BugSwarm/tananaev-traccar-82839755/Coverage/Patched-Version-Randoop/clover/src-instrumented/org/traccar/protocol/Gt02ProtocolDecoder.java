/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gt02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24an4anlx1e75ie{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,5636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gt02ProtocolDecoder(Gt02Protocol protocol) {
        super(protocol);__CLR4_5_24an4anlx1e75ie.R.inc(5568);try{__CLR4_5_24an4anlx1e75ie.R.inc(5567);
    }finally{__CLR4_5_24an4anlx1e75ie.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_24an4anlx1e75ie.R.inc(5569);
        __CLR4_5_24an4anlx1e75ie.R.inc(5570);int b = buf.readUnsignedByte();
        __CLR4_5_24an4anlx1e75ie.R.inc(5571);StringBuilder imei = new StringBuilder();
        __CLR4_5_24an4anlx1e75ie.R.inc(5572);imei.append(b & 0x0F);
        __CLR4_5_24an4anlx1e75ie.R.inc(5573);for (int i = 0; (((i < 7)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5574)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5575)==0&false)); i++) {{
            __CLR4_5_24an4anlx1e75ie.R.inc(5576);b = buf.readUnsignedByte();
            __CLR4_5_24an4anlx1e75ie.R.inc(5577);imei.append((b & 0xF0) >> 4);
            __CLR4_5_24an4anlx1e75ie.R.inc(5578);imei.append(b & 0x0F);
        }
        }__CLR4_5_24an4anlx1e75ie.R.inc(5579);return imei.toString();
    }finally{__CLR4_5_24an4anlx1e75ie.R.flushNeeded();}}

    private static final int MSG_HEARTBEAT = 0x1A;
    private static final int MSG_DATA = 0x10;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24an4anlx1e75ie.R.inc(5580);

        __CLR4_5_24an4anlx1e75ie.R.inc(5581);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_24an4anlx1e75ie.R.inc(5582);buf.skipBytes(2); // header
        __CLR4_5_24an4anlx1e75ie.R.inc(5583);buf.readByte(); // size

        // Zero for location messages
        __CLR4_5_24an4anlx1e75ie.R.inc(5584);buf.readByte(); // voltage
        __CLR4_5_24an4anlx1e75ie.R.inc(5585);buf.readByte(); // gsm signal

        __CLR4_5_24an4anlx1e75ie.R.inc(5586);String imei = readImei(buf);
        __CLR4_5_24an4anlx1e75ie.R.inc(5587);long index = buf.readUnsignedShort();
        __CLR4_5_24an4anlx1e75ie.R.inc(5588);int type = buf.readUnsignedByte();

        __CLR4_5_24an4anlx1e75ie.R.inc(5589);if ((((type == MSG_HEARTBEAT)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5590)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5591)==0&false))) {{
            __CLR4_5_24an4anlx1e75ie.R.inc(5592);if ((((channel != null)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5593)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5594)==0&false))) {{
                __CLR4_5_24an4anlx1e75ie.R.inc(5595);byte[] response = {0x54, 0x68, 0x1A, 0x0D, 0x0A};
                __CLR4_5_24an4anlx1e75ie.R.inc(5596);channel.write(ChannelBuffers.wrappedBuffer(response));
            }
        }}

        }else {__CLR4_5_24an4anlx1e75ie.R.inc(5597);if ((((type == MSG_DATA)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5598)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5599)==0&false))) {{

            // Create new position
            __CLR4_5_24an4anlx1e75ie.R.inc(5600);Position position = new Position();
            __CLR4_5_24an4anlx1e75ie.R.inc(5601);position.setProtocol(getProtocolName());
            __CLR4_5_24an4anlx1e75ie.R.inc(5602);position.set(Event.KEY_INDEX, index);

            // Get device id
            __CLR4_5_24an4anlx1e75ie.R.inc(5603);if ((((!identify(imei, channel))&&(__CLR4_5_24an4anlx1e75ie.R.iget(5604)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5605)==0&false))) {{
                __CLR4_5_24an4anlx1e75ie.R.inc(5606);return null;
            }
            }__CLR4_5_24an4anlx1e75ie.R.inc(5607);position.setDeviceId(getDeviceId());

            // Date and time
            __CLR4_5_24an4anlx1e75ie.R.inc(5608);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_24an4anlx1e75ie.R.inc(5609);time.clear();
            __CLR4_5_24an4anlx1e75ie.R.inc(5610);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_24an4anlx1e75ie.R.inc(5611);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_24an4anlx1e75ie.R.inc(5612);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_24an4anlx1e75ie.R.inc(5613);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_24an4anlx1e75ie.R.inc(5614);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_24an4anlx1e75ie.R.inc(5615);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_24an4anlx1e75ie.R.inc(5616);position.setTime(time.getTime());

            // Latitude
            __CLR4_5_24an4anlx1e75ie.R.inc(5617);double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Longitude
            __CLR4_5_24an4anlx1e75ie.R.inc(5618);double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Speed
            __CLR4_5_24an4anlx1e75ie.R.inc(5619);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            // Course
            __CLR4_5_24an4anlx1e75ie.R.inc(5620);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_24an4anlx1e75ie.R.inc(5621);buf.skipBytes(3); // reserved

            // Flags
            __CLR4_5_24an4anlx1e75ie.R.inc(5622);long flags = buf.readUnsignedInt();
            __CLR4_5_24an4anlx1e75ie.R.inc(5623);position.setValid((flags & 0x1) == 0x1);
            __CLR4_5_24an4anlx1e75ie.R.inc(5624);if (((((flags & 0x2) == 0)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5625)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5626)==0&false))) {__CLR4_5_24an4anlx1e75ie.R.inc(5627);latitude = -latitude;
            }__CLR4_5_24an4anlx1e75ie.R.inc(5628);if (((((flags & 0x4) == 0)&&(__CLR4_5_24an4anlx1e75ie.R.iget(5629)!=0|true))||(__CLR4_5_24an4anlx1e75ie.R.iget(5630)==0&false))) {__CLR4_5_24an4anlx1e75ie.R.inc(5631);longitude = -longitude;

            }__CLR4_5_24an4anlx1e75ie.R.inc(5632);position.setLatitude(latitude);
            __CLR4_5_24an4anlx1e75ie.R.inc(5633);position.setLongitude(longitude);
            __CLR4_5_24an4anlx1e75ie.R.inc(5634);return position;
        }

        }}__CLR4_5_24an4anlx1e75ie.R.inc(5635);return null;
    }finally{__CLR4_5_24an4anlx1e75ie.R.flushNeeded();}}

}
