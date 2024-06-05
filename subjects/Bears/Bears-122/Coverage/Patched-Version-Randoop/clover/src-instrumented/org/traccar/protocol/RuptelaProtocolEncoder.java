/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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

import java.nio.charset.StandardCharsets;

@java.lang.SuppressWarnings({"fallthrough"}) public class RuptelaProtocolEncoder extends BaseProtocolEncoder {public static class __CLR4_5_2epyepylwye66rf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,19114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ChannelBuffer encodeContent(int type, ChannelBuffer content) {try{__CLR4_5_2epyepylwye66rf.R.inc(19078);

        __CLR4_5_2epyepylwye66rf.R.inc(19079);ChannelBuffer buf = ChannelBuffers.dynamicBuffer();

        __CLR4_5_2epyepylwye66rf.R.inc(19080);buf.writeShort(1 + content.readableBytes());
        __CLR4_5_2epyepylwye66rf.R.inc(19081);buf.writeByte(100 + type);
        __CLR4_5_2epyepylwye66rf.R.inc(19082);buf.writeBytes(content);
        __CLR4_5_2epyepylwye66rf.R.inc(19083);buf.writeShort(Checksum.crc16(Checksum.CRC16_KERMIT, buf.toByteBuffer(2, buf.writerIndex() - 2)));

        __CLR4_5_2epyepylwye66rf.R.inc(19084);return buf;
    }finally{__CLR4_5_2epyepylwye66rf.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2epyepylwye66rf.R.inc(19085);

        __CLR4_5_2epyepylwye66rf.R.inc(19086);ChannelBuffer content = ChannelBuffers.dynamicBuffer();

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2epyepylwye66rf.R.inc(19087);switch (command.getType()) {
            case Command.TYPE_CUSTOM:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19088);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19089);content.writeBytes(command.getString(Command.KEY_DATA).getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2epyepylwye66rf.R.inc(19090);return encodeContent(RuptelaProtocolDecoder.MSG_SMS_VIA_GPRS, content);
            case Command.TYPE_CONFIGURATION:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19091);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19092);content.writeBytes((command.getString(Command.KEY_DATA) + "\r\n").getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2epyepylwye66rf.R.inc(19093);return encodeContent(RuptelaProtocolDecoder.MSG_DEVICE_CONFIGURATION, content);
            case Command.TYPE_GET_VERSION:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19094);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19095);return encodeContent(RuptelaProtocolDecoder.MSG_DEVICE_VERSION, content);
            case Command.TYPE_FIRMWARE_UPDATE:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19096);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19097);content.writeBytes("|FU_STRT*\r\n".getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2epyepylwye66rf.R.inc(19098);return encodeContent(RuptelaProtocolDecoder.MSG_FIRMWARE_UPDATE, content);
            case Command.TYPE_OUTPUT_CONTROL:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19099);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19100);content.writeInt(command.getInteger(Command.KEY_INDEX));
                __CLR4_5_2epyepylwye66rf.R.inc(19101);content.writeInt(Integer.parseInt(command.getString(Command.KEY_DATA)));
                __CLR4_5_2epyepylwye66rf.R.inc(19102);return encodeContent(RuptelaProtocolDecoder.MSG_SET_IO, content);
            case Command.TYPE_SET_CONNECTION:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19103);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19104);String c = command.getString(Command.KEY_SERVER) + "," + command.getInteger(Command.KEY_PORT) + ",TCP";
                __CLR4_5_2epyepylwye66rf.R.inc(19105);content.writeBytes(c.getBytes(StandardCharsets.US_ASCII));
                __CLR4_5_2epyepylwye66rf.R.inc(19106);return encodeContent(RuptelaProtocolDecoder.MSG_SET_CONNECTION, content);
            case Command.TYPE_SET_ODOMETER:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19107);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19108);content.writeInt(Integer.parseInt(command.getString(Command.KEY_DATA)));
                __CLR4_5_2epyepylwye66rf.R.inc(19109);return encodeContent(RuptelaProtocolDecoder.MSG_SET_ODOMETER, content);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2epyepylwye66rf.R.inc(19110);__CLB4_5_2_bool0=true;}
                __CLR4_5_2epyepylwye66rf.R.inc(19111);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2epyepylwye66rf.R.inc(19112);break;
        }

        __CLR4_5_2epyepylwye66rf.R.inc(19113);return null;
    }finally{__CLR4_5_2epyepylwye66rf.R.flushNeeded();}}

}
