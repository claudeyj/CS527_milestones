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

import java.util.Calendar;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gt02ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23zb3zblx1do9mv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,5228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Gt02ProtocolDecoder(Gt02Protocol protocol) {
        super(protocol);__CLR4_5_23zb3zblx1do9mv.R.inc(5160);try{__CLR4_5_23zb3zblx1do9mv.R.inc(5159);
    }finally{__CLR4_5_23zb3zblx1do9mv.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_23zb3zblx1do9mv.R.inc(5161);
        __CLR4_5_23zb3zblx1do9mv.R.inc(5162);int b = buf.readUnsignedByte();
        __CLR4_5_23zb3zblx1do9mv.R.inc(5163);StringBuilder imei = new StringBuilder();
        __CLR4_5_23zb3zblx1do9mv.R.inc(5164);imei.append(b & 0x0F);
        __CLR4_5_23zb3zblx1do9mv.R.inc(5165);for (int i = 0; (((i < 7)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5166)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5167)==0&false)); i++) {{
            __CLR4_5_23zb3zblx1do9mv.R.inc(5168);b = buf.readUnsignedByte();
            __CLR4_5_23zb3zblx1do9mv.R.inc(5169);imei.append((b & 0xF0) >> 4);
            __CLR4_5_23zb3zblx1do9mv.R.inc(5170);imei.append(b & 0x0F);
        }
        }__CLR4_5_23zb3zblx1do9mv.R.inc(5171);return imei.toString();
    }finally{__CLR4_5_23zb3zblx1do9mv.R.flushNeeded();}}

    private static final int MSG_HEARTBEAT = 0x1A;
    private static final int MSG_DATA = 0x10;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_23zb3zblx1do9mv.R.inc(5172);

        __CLR4_5_23zb3zblx1do9mv.R.inc(5173);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_23zb3zblx1do9mv.R.inc(5174);buf.skipBytes(2); // header
        __CLR4_5_23zb3zblx1do9mv.R.inc(5175);buf.readByte(); // size

        // Zero for location messages
        __CLR4_5_23zb3zblx1do9mv.R.inc(5176);buf.readByte(); // voltage
        __CLR4_5_23zb3zblx1do9mv.R.inc(5177);buf.readByte(); // gsm signal

        __CLR4_5_23zb3zblx1do9mv.R.inc(5178);String imei = readImei(buf);
        __CLR4_5_23zb3zblx1do9mv.R.inc(5179);long index = buf.readUnsignedShort();
        __CLR4_5_23zb3zblx1do9mv.R.inc(5180);int type = buf.readUnsignedByte();

        __CLR4_5_23zb3zblx1do9mv.R.inc(5181);if ((((type == MSG_HEARTBEAT)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5182)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5183)==0&false))) {{
            __CLR4_5_23zb3zblx1do9mv.R.inc(5184);if ((((channel != null)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5185)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5186)==0&false))) {{
                __CLR4_5_23zb3zblx1do9mv.R.inc(5187);byte[] response = {0x54, 0x68, 0x1A, 0x0D, 0x0A};
                __CLR4_5_23zb3zblx1do9mv.R.inc(5188);channel.write(ChannelBuffers.wrappedBuffer(response));
            }
        }}

        }else {__CLR4_5_23zb3zblx1do9mv.R.inc(5189);if ((((type == MSG_DATA)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5190)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5191)==0&false))) {{

            // Create new position
            __CLR4_5_23zb3zblx1do9mv.R.inc(5192);Position position = new Position();
            __CLR4_5_23zb3zblx1do9mv.R.inc(5193);position.setProtocol(getProtocolName());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5194);position.set(Event.KEY_INDEX, index);

            // Get device id
            __CLR4_5_23zb3zblx1do9mv.R.inc(5195);if ((((!identify(imei, channel))&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5196)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5197)==0&false))) {{
                __CLR4_5_23zb3zblx1do9mv.R.inc(5198);return null;
            }
            }__CLR4_5_23zb3zblx1do9mv.R.inc(5199);position.setDeviceId(getDeviceId());

            // Date and time
            __CLR4_5_23zb3zblx1do9mv.R.inc(5200);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            __CLR4_5_23zb3zblx1do9mv.R.inc(5201);time.clear();
            __CLR4_5_23zb3zblx1do9mv.R.inc(5202);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5203);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_23zb3zblx1do9mv.R.inc(5204);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5205);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5206);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5207);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_23zb3zblx1do9mv.R.inc(5208);position.setTime(time.getTime());

            // Latitude
            __CLR4_5_23zb3zblx1do9mv.R.inc(5209);double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Longitude
            __CLR4_5_23zb3zblx1do9mv.R.inc(5210);double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Speed
            __CLR4_5_23zb3zblx1do9mv.R.inc(5211);position.setSpeed(buf.readUnsignedByte());

            // Course
            __CLR4_5_23zb3zblx1do9mv.R.inc(5212);position.setCourse(buf.readUnsignedShort());

            __CLR4_5_23zb3zblx1do9mv.R.inc(5213);buf.skipBytes(3); // reserved

            // Flags
            __CLR4_5_23zb3zblx1do9mv.R.inc(5214);long flags = buf.readUnsignedInt();
            __CLR4_5_23zb3zblx1do9mv.R.inc(5215);position.setValid((flags & 0x1) == 0x1);
            __CLR4_5_23zb3zblx1do9mv.R.inc(5216);if (((((flags & 0x2) == 0)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5217)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5218)==0&false))) {__CLR4_5_23zb3zblx1do9mv.R.inc(5219);latitude = -latitude;
            }__CLR4_5_23zb3zblx1do9mv.R.inc(5220);if (((((flags & 0x4) == 0)&&(__CLR4_5_23zb3zblx1do9mv.R.iget(5221)!=0|true))||(__CLR4_5_23zb3zblx1do9mv.R.iget(5222)==0&false))) {__CLR4_5_23zb3zblx1do9mv.R.inc(5223);longitude = -longitude;

            }__CLR4_5_23zb3zblx1do9mv.R.inc(5224);position.setLatitude(latitude);
            __CLR4_5_23zb3zblx1do9mv.R.inc(5225);position.setLongitude(longitude);
            __CLR4_5_23zb3zblx1do9mv.R.inc(5226);return position;
        }

        }}__CLR4_5_23zb3zblx1do9mv.R.inc(5227);return null;
    }finally{__CLR4_5_23zb3zblx1do9mv.R.flushNeeded();}}

}
