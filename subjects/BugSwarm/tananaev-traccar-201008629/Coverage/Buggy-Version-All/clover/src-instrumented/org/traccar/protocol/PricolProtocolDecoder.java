/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.helper.DateBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class PricolProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2cfncfnlx1dxphw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,16161,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PricolProtocolDecoder(PricolProtocol protocol) {
        super(protocol);__CLR4_5_2cfncfnlx1dxphw.R.inc(16116);try{__CLR4_5_2cfncfnlx1dxphw.R.inc(16115);
    }finally{__CLR4_5_2cfncfnlx1dxphw.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_2cfncfnlx1dxphw.R.inc(16117);

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16118);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16119);buf.readUnsignedByte(); // header

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16120);DeviceSession deviceSession = getDeviceSession(
                channel, remoteAddress, buf.readBytes(7).toString(StandardCharsets.US_ASCII));
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16121);if ((((deviceSession == null)&&(__CLR4_5_2cfncfnlx1dxphw.R.iget(16122)!=0|true))||(__CLR4_5_2cfncfnlx1dxphw.R.iget(16123)==0&false))) {{
            __CLR4_5_2cfncfnlx1dxphw.R.inc(16124);return null;
        }

        }__CLR4_5_2cfncfnlx1dxphw.R.inc(16125);Position position = new Position();
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16126);position.setProtocol(getProtocolName());
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16127);position.setDeviceId(deviceSession.getDeviceId());

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16128);buf.readUnsignedByte(); // event type
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16129);buf.readUnsignedByte(); // packet version
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16130);buf.readUnsignedByte(); // device status
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16131);buf.readUnsignedByte(); // gsm status
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16132);buf.readUnsignedByte(); // gps status

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16133);position.setTime(new DateBuilder()
                .setDateReverse(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte())
                .setTime(buf.readUnsignedByte(), buf.readUnsignedByte(), buf.readUnsignedByte()).getDate());

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16134);position.setValid(true);

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16135);double lat = buf.getUnsignedShort(buf.readerIndex()) / 100;
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16136);lat += (buf.readUnsignedShort() % 100 * 10000 + buf.readUnsignedShort()) / 600000.0;
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16137);position.setLatitude((((buf.readUnsignedByte() == 'S' )&&(__CLR4_5_2cfncfnlx1dxphw.R.iget(16138)!=0|true))||(__CLR4_5_2cfncfnlx1dxphw.R.iget(16139)==0&false))? -lat : lat);

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16140);double lon = buf.getUnsignedMedium(buf.readerIndex()) / 100;
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16141);lon += (buf.readUnsignedMedium() % 100 * 10000 + buf.readUnsignedShort()) / 600000.0;
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16142);position.setLongitude((((buf.readUnsignedByte() == 'W' )&&(__CLR4_5_2cfncfnlx1dxphw.R.iget(16143)!=0|true))||(__CLR4_5_2cfncfnlx1dxphw.R.iget(16144)==0&false))? -lon : lon);

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16145);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16146);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16147);position.set(Position.KEY_OUTPUT, buf.readUnsignedByte());

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16148);buf.readUnsignedByte(); // analog alerts
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16149);buf.readUnsignedShort(); // custom alert types

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16150);for (int i = 1; (((i <= 5)&&(__CLR4_5_2cfncfnlx1dxphw.R.iget(16151)!=0|true))||(__CLR4_5_2cfncfnlx1dxphw.R.iget(16152)==0&false)); i++) {{
            __CLR4_5_2cfncfnlx1dxphw.R.inc(16153);position.set(Position.PREFIX_ADC + i, buf.readUnsignedShort());
        }

        }__CLR4_5_2cfncfnlx1dxphw.R.inc(16154);position.set(Position.KEY_ODOMETER, buf.readUnsignedMedium());
        __CLR4_5_2cfncfnlx1dxphw.R.inc(16155);position.set(Position.KEY_RPM, buf.readUnsignedShort());

        __CLR4_5_2cfncfnlx1dxphw.R.inc(16156);if ((((channel != null)&&(__CLR4_5_2cfncfnlx1dxphw.R.iget(16157)!=0|true))||(__CLR4_5_2cfncfnlx1dxphw.R.iget(16158)==0&false))) {{
            __CLR4_5_2cfncfnlx1dxphw.R.inc(16159);channel.write(ChannelBuffers.copiedBuffer("ACK", StandardCharsets.US_ASCII));
        }

        }__CLR4_5_2cfncfnlx1dxphw.R.inc(16160);return position;
    }finally{__CLR4_5_2cfncfnlx1dxphw.R.flushNeeded();}}

}
