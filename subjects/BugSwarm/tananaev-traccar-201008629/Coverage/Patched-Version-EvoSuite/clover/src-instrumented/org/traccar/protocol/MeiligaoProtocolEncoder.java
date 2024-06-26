/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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
import org.traccar.BaseProtocolEncoder;
import org.traccar.helper.Checksum;
import org.traccar.helper.Log;
import org.traccar.model.Command;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

@java.lang.SuppressWarnings({"fallthrough"}) public class MeiligaoProtocolEncoder extends BaseProtocolEncoder {public static class __CLR4_5_2aujaujlx1dzbf9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,14098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final int MSG_TRACK_ON_DEMAND = 0x4101;
    public static final int MSG_TRACK_BY_INTERVAL = 0x4102;
    public static final int MSG_MOVEMENT_ALARM = 0x4106;
    public static final int MSG_OUTPUT_CONTROL = 0x4115;
    public static final int MSG_TIME_ZONE = 0x4132;
    public static final int MSG_REBOOT_GPS = 0x4902;

    private ChannelBuffer encodeContent(long deviceId, int type, ChannelBuffer content) {try{__CLR4_5_2aujaujlx1dzbf9.R.inc(14059);

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14060);ChannelBuffer buf = ChannelBuffers.dynamicBuffer();

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14061);buf.writeByte('@');
        __CLR4_5_2aujaujlx1dzbf9.R.inc(14062);buf.writeByte('@');

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14063);buf.writeShort(2 + 2 + 7 + 2 + content.readableBytes() + 2 + 2); // message length

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14064);buf.writeBytes(DatatypeConverter.parseHexBinary((getUniqueId(deviceId) + "FFFFFFFFFFFFFF").substring(0, 14)));

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14065);buf.writeShort(type);

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14066);buf.writeBytes(content);

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14067);buf.writeShort(Checksum.crc16(Checksum.CRC16_CCITT_FALSE, buf.toByteBuffer()));

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14068);buf.writeByte('\r');
        __CLR4_5_2aujaujlx1dzbf9.R.inc(14069);buf.writeByte('\n');

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14070);return buf;
    }finally{__CLR4_5_2aujaujlx1dzbf9.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2aujaujlx1dzbf9.R.inc(14071);

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14072);ChannelBuffer content = ChannelBuffers.dynamicBuffer();

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2aujaujlx1dzbf9.R.inc(14073);switch (command.getType()) {
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14074);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14075);return encodeContent(command.getDeviceId(), MSG_TRACK_ON_DEMAND, content);
            case Command.TYPE_POSITION_PERIODIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14076);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14077);content.writeShort(command.getInteger(Command.KEY_FREQUENCY) / 10);
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14078);return encodeContent(command.getDeviceId(), MSG_TRACK_BY_INTERVAL, content);
            case Command.TYPE_ENGINE_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14079);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14080);content.writeByte(0x01);
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14081);return encodeContent(command.getDeviceId(), MSG_OUTPUT_CONTROL, content);
            case Command.TYPE_ENGINE_RESUME:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14082);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14083);content.writeByte(0x00);
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14084);return encodeContent(command.getDeviceId(), MSG_OUTPUT_CONTROL, content);
            case Command.TYPE_ALARM_GEOFENCE:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14085);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14086);content.writeShort(command.getInteger(Command.KEY_RADIUS));
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14087);return encodeContent(command.getDeviceId(), MSG_MOVEMENT_ALARM, content);
            case Command.TYPE_SET_TIMEZONE:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14088);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14089);int offset = command.getInteger(Command.KEY_TIMEZONE) / 60;
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14090);content.writeBytes(String.valueOf(offset).getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14091);return encodeContent(command.getDeviceId(), MSG_TIME_ZONE, content);
            case Command.TYPE_REBOOT_DEVICE:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14092);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14093);return encodeContent(command.getDeviceId(), MSG_REBOOT_GPS, content);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2aujaujlx1dzbf9.R.inc(14094);__CLB4_5_2_bool0=true;}
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14095);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2aujaujlx1dzbf9.R.inc(14096);break;
        }

        __CLR4_5_2aujaujlx1dzbf9.R.inc(14097);return null;
    }finally{__CLR4_5_2aujaujlx1dzbf9.R.flushNeeded();}}

}
