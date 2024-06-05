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
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

public class BceFrameDecoder extends FrameDecoder {public static class __CLR4_5_2726726lwydwc5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,9173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int HANDSHAKE_LENGTH = 7; // "#BCE#\r\n"

    private boolean header = true;

    private static byte checksum(ChannelBuffer buf, int end) {try{__CLR4_5_2726726lwydwc5w.R.inc(9150);
        __CLR4_5_2726726lwydwc5w.R.inc(9151);byte result = 0;
        __CLR4_5_2726726lwydwc5w.R.inc(9152);for (int i = 0; (((i < end)&&(__CLR4_5_2726726lwydwc5w.R.iget(9153)!=0|true))||(__CLR4_5_2726726lwydwc5w.R.iget(9154)==0&false)); i++) {{
            __CLR4_5_2726726lwydwc5w.R.inc(9155);result += buf.getByte(buf.readerIndex() + i);
        }
        }__CLR4_5_2726726lwydwc5w.R.inc(9156);return result;
    }finally{__CLR4_5_2726726lwydwc5w.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx,
            Channel channel,
            ChannelBuffer buf) throws Exception {try{__CLR4_5_2726726lwydwc5w.R.inc(9157);

        __CLR4_5_2726726lwydwc5w.R.inc(9158);if ((((header && buf.readableBytes() >= HANDSHAKE_LENGTH)&&(__CLR4_5_2726726lwydwc5w.R.iget(9159)!=0|true))||(__CLR4_5_2726726lwydwc5w.R.iget(9160)==0&false))) {{
            __CLR4_5_2726726lwydwc5w.R.inc(9161);buf.skipBytes(HANDSHAKE_LENGTH);
            __CLR4_5_2726726lwydwc5w.R.inc(9162);header = false;
        }

        }__CLR4_5_2726726lwydwc5w.R.inc(9163);int end = 8; // IMEI

        __CLR4_5_2726726lwydwc5w.R.inc(9164);while ((((buf.readableBytes() >= end + 2 + 1 + 1 + 1)&&(__CLR4_5_2726726lwydwc5w.R.iget(9165)!=0|true))||(__CLR4_5_2726726lwydwc5w.R.iget(9166)==0&false))) {{
            __CLR4_5_2726726lwydwc5w.R.inc(9167);end += buf.getUnsignedShort(buf.readerIndex() + end) + 2;

            __CLR4_5_2726726lwydwc5w.R.inc(9168);if ((((buf.readableBytes() > end && checksum(buf, end) == buf.getByte(buf.readerIndex() + end))&&(__CLR4_5_2726726lwydwc5w.R.iget(9169)!=0|true))||(__CLR4_5_2726726lwydwc5w.R.iget(9170)==0&false))) {{
                __CLR4_5_2726726lwydwc5w.R.inc(9171);return buf.readBytes(end + 1);
            }
        }}

        }__CLR4_5_2726726lwydwc5w.R.inc(9172);return null;
    }finally{__CLR4_5_2726726lwydwc5w.R.flushNeeded();}}

}
