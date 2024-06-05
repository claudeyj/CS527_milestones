/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.Log;
import org.traccar.model.Command;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

@java.lang.SuppressWarnings({"fallthrough"}) public class NoranProtocolEncoder extends BaseProtocolEncoder {public static class __CLR4_5_2buobuolx1e1ljf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,15389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ChannelBuffer encodeContent(String content) {try{__CLR4_5_2buobuolx1e1ljf.R.inc(15360);

        __CLR4_5_2buobuolx1e1ljf.R.inc(15361);ChannelBuffer buf = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, 12 + 56);

        __CLR4_5_2buobuolx1e1ljf.R.inc(15362);buf.writeBytes(
                ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n*KW", StandardCharsets.US_ASCII));
        __CLR4_5_2buobuolx1e1ljf.R.inc(15363);buf.writeByte(0);
        __CLR4_5_2buobuolx1e1ljf.R.inc(15364);buf.writeShort(buf.capacity());
        __CLR4_5_2buobuolx1e1ljf.R.inc(15365);buf.writeShort(NoranProtocolDecoder.MSG_CONTROL);
        __CLR4_5_2buobuolx1e1ljf.R.inc(15366);buf.writeInt(0); // gis ip
        __CLR4_5_2buobuolx1e1ljf.R.inc(15367);buf.writeShort(0); // gis port
        __CLR4_5_2buobuolx1e1ljf.R.inc(15368);buf.writeBytes(content.getBytes(StandardCharsets.US_ASCII));
        __CLR4_5_2buobuolx1e1ljf.R.inc(15369);buf.writerIndex(buf.writerIndex() + 50 - content.length());
        __CLR4_5_2buobuolx1e1ljf.R.inc(15370);buf.writeBytes(
                ChannelBuffers.copiedBuffer(ByteOrder.LITTLE_ENDIAN, "\r\n", StandardCharsets.US_ASCII));

        __CLR4_5_2buobuolx1e1ljf.R.inc(15371);return buf;
    }finally{__CLR4_5_2buobuolx1e1ljf.R.flushNeeded();}}

    @Override
    protected Object encodeCommand(Command command) {try{__CLR4_5_2buobuolx1e1ljf.R.inc(15372);

        boolean __CLB4_5_2_bool0=false;__CLR4_5_2buobuolx1e1ljf.R.inc(15373);switch (command.getType()) {
            case Command.TYPE_POSITION_SINGLE:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15374);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15375);return encodeContent("*KW,000,000,000000#");
            case Command.TYPE_POSITION_PERIODIC:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15376);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15377);int interval = command.getInteger(Command.KEY_FREQUENCY);
                __CLR4_5_2buobuolx1e1ljf.R.inc(15378);return encodeContent("*KW,000,002,000000," + interval + "#");
            case Command.TYPE_POSITION_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15379);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15380);return encodeContent("*KW,000,002,000000,0#");
            case Command.TYPE_ENGINE_STOP:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15381);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15382);return encodeContent("*KW,000,007,000000,0#");
            case Command.TYPE_ENGINE_RESUME:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15383);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15384);return encodeContent("*KW,000,007,000000,1#");
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2buobuolx1e1ljf.R.inc(15385);__CLB4_5_2_bool0=true;}
                __CLR4_5_2buobuolx1e1ljf.R.inc(15386);Log.warning(new UnsupportedOperationException(command.getType()));
                __CLR4_5_2buobuolx1e1ljf.R.inc(15387);break;
        }

        __CLR4_5_2buobuolx1e1ljf.R.inc(15388);return null;
    }finally{__CLR4_5_2buobuolx1e1ljf.R.flushNeeded();}}

}
