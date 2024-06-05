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

import java.net.SocketAddress;
import java.util.Date;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class EelinkProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_239g39glx1e7zaq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,4290,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public EelinkProtocolDecoder(EelinkProtocol protocol) {
        super(protocol);__CLR4_5_239g39glx1e7zaq.R.inc(4229);try{__CLR4_5_239g39glx1e7zaq.R.inc(4228);
    }finally{__CLR4_5_239g39glx1e7zaq.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_239g39glx1e7zaq.R.inc(4230);
        __CLR4_5_239g39glx1e7zaq.R.inc(4231);int b = buf.readUnsignedByte();
        __CLR4_5_239g39glx1e7zaq.R.inc(4232);StringBuilder imei = new StringBuilder();
        __CLR4_5_239g39glx1e7zaq.R.inc(4233);imei.append(b & 0x0F);
        __CLR4_5_239g39glx1e7zaq.R.inc(4234);for (int i = 0; (((i < 7)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4235)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4236)==0&false)); i++) {{
            __CLR4_5_239g39glx1e7zaq.R.inc(4237);b = buf.readUnsignedByte();
            __CLR4_5_239g39glx1e7zaq.R.inc(4238);imei.append((b & 0xF0) >> 4);
            __CLR4_5_239g39glx1e7zaq.R.inc(4239);imei.append(b & 0x0F);
        }
        }__CLR4_5_239g39glx1e7zaq.R.inc(4240);return imei.toString();
    }finally{__CLR4_5_239g39glx1e7zaq.R.flushNeeded();}}

    private static final int MSG_LOGIN = 0x01;
    private static final int MSG_GPS = 0x02;
    private static final int MSG_HEARTBEAT = 0x03;
    private static final int MSG_ALARM = 0x04;
    private static final int MSG_STATE = 0x05;
    private static final int MSG_SMS = 0x06;
    private static final int MSG_OBD = 0x07;
    private static final int MSG_INTERACTIVE = 0x80;
    private static final int MSG_DATA = 0x81;

    private void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_239g39glx1e7zaq.R.inc(4241);
        __CLR4_5_239g39glx1e7zaq.R.inc(4242);if ((((channel != null)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4243)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4244)==0&false))) {{
            __CLR4_5_239g39glx1e7zaq.R.inc(4245);ChannelBuffer response = ChannelBuffers.buffer(7);
            __CLR4_5_239g39glx1e7zaq.R.inc(4246);response.writeByte(0x67); __CLR4_5_239g39glx1e7zaq.R.inc(4247);response.writeByte(0x67); // header
            __CLR4_5_239g39glx1e7zaq.R.inc(4248);response.writeByte(type);
            __CLR4_5_239g39glx1e7zaq.R.inc(4249);response.writeShort(2); // length
            __CLR4_5_239g39glx1e7zaq.R.inc(4250);response.writeShort(index);
            __CLR4_5_239g39glx1e7zaq.R.inc(4251);channel.write(response);
        }
    }}finally{__CLR4_5_239g39glx1e7zaq.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_239g39glx1e7zaq.R.inc(4252);

        __CLR4_5_239g39glx1e7zaq.R.inc(4253);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_239g39glx1e7zaq.R.inc(4254);buf.skipBytes(2); // header
        __CLR4_5_239g39glx1e7zaq.R.inc(4255);int type = buf.readUnsignedByte();
        __CLR4_5_239g39glx1e7zaq.R.inc(4256);buf.readShort(); // length
        __CLR4_5_239g39glx1e7zaq.R.inc(4257);int index = buf.readUnsignedShort();
        
        __CLR4_5_239g39glx1e7zaq.R.inc(4258);if ((((type != MSG_GPS && type != MSG_DATA)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4259)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4260)==0&false))) {{
            __CLR4_5_239g39glx1e7zaq.R.inc(4261);sendResponse(channel, type, index);
        }
        
        }__CLR4_5_239g39glx1e7zaq.R.inc(4262);if ((((type == MSG_LOGIN)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4263)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4264)==0&false))) {{
            __CLR4_5_239g39glx1e7zaq.R.inc(4265);identify(ChannelBufferTools.readHexString(buf, 16).substring(1), channel);
        }
        
        }else {__CLR4_5_239g39glx1e7zaq.R.inc(4266);if ((((hasDeviceId() &&
                (type == MSG_GPS ||
                 type == MSG_ALARM ||
                 type == MSG_STATE ||
                 type == MSG_SMS))&&(__CLR4_5_239g39glx1e7zaq.R.iget(4267)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4268)==0&false))) {{
            
            // Create new position
            __CLR4_5_239g39glx1e7zaq.R.inc(4269);Position position = new Position();
            __CLR4_5_239g39glx1e7zaq.R.inc(4270);position.setDeviceId(getDeviceId());
            
            __CLR4_5_239g39glx1e7zaq.R.inc(4271);position.setProtocol(getProtocolName());
            __CLR4_5_239g39glx1e7zaq.R.inc(4272);position.set(Event.KEY_INDEX, index);
            
            // Location
            __CLR4_5_239g39glx1e7zaq.R.inc(4273);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_239g39glx1e7zaq.R.inc(4274);position.setLatitude(buf.readInt() / 1800000.0);
            __CLR4_5_239g39glx1e7zaq.R.inc(4275);position.setLongitude(buf.readInt() / 1800000.0);
            __CLR4_5_239g39glx1e7zaq.R.inc(4276);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_239g39glx1e7zaq.R.inc(4277);position.setCourse(buf.readUnsignedShort());
            
            // Cell
            __CLR4_5_239g39glx1e7zaq.R.inc(4278);position.set(Event.KEY_CELL, ChannelBufferTools.readHexString(buf, 18));
            
            // Validity
            __CLR4_5_239g39glx1e7zaq.R.inc(4279);position.setValid((buf.readUnsignedByte() & 0x01) != 0);
            
            __CLR4_5_239g39glx1e7zaq.R.inc(4280);if ((((type == MSG_ALARM)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4281)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4282)==0&false))) {{
                __CLR4_5_239g39glx1e7zaq.R.inc(4283);position.set(Event.KEY_ALARM, buf.readUnsignedByte());
            }
            
            }__CLR4_5_239g39glx1e7zaq.R.inc(4284);if ((((type == MSG_STATE)&&(__CLR4_5_239g39glx1e7zaq.R.iget(4285)!=0|true))||(__CLR4_5_239g39glx1e7zaq.R.iget(4286)==0&false))) {{
                __CLR4_5_239g39glx1e7zaq.R.inc(4287);position.set(Event.KEY_STATUS, buf.readUnsignedByte());
            }
            }__CLR4_5_239g39glx1e7zaq.R.inc(4288);return position;
        }

        /*
        if (type == MSG_HEARTBEAT) {
            if (channel != null) {
                byte[] response = {0x54, 0x68, 0x1A, 0x0D, 0x0A};
                channel.write(ChannelBuffers.wrappedBuffer(response));
            }
        }

        else if (type == MSG_DATA) {

            // Create new position
            Position position = new Position();
            ExtendedInfoFormatter extendedInfo = new ExtendedInfoFormatter("gt02");
            position.set(Event.KEY_INDEX, index);

            // Get device id
            try {
                position.setDeviceId(getDataManager().getDeviceByImei(imei).getId());
            } catch(Exception error) {
                Log.warning("Unknown device - " + imei);
            }

            // Date and time
            Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            time.clear();
            time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            time.set(Calendar.MINUTE, buf.readUnsignedByte());
            time.set(Calendar.SECOND, buf.readUnsignedByte());
            position.setTime(time.getTime());

            // Latitude
            double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Longitude
            double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Speed
            position.setSpeed(buf.readUnsignedByte());

            // Course
            position.setCourse(buf.readUnsignedShort());

            buf.skipBytes(3); // reserved

            // Flags
            long flags = buf.readUnsignedInt();
            position.setValid((flags & 0x1) == 0x1);
            if ((flags & 0x2) == 0) latitude = -latitude;
            if ((flags & 0x4) == 0) longitude = -longitude;

            position.setLatitude(latitude);
            position.setLongitude(longitude);
            return position;
        }*/

        }}__CLR4_5_239g39glx1e7zaq.R.inc(4289);return null;
    }finally{__CLR4_5_239g39glx1e7zaq.R.flushNeeded();}}

}
