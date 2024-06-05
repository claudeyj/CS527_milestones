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
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import java.nio.ByteOrder;

public class At2000FrameDecoder extends FrameDecoder {public static class __CLR4_5_25qa5qalx1e1jqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,7464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int BLOCK_LENGTH = 16;
    private static final int ACK_LENGTH = 496;

    private boolean firstPacket = true;

    private ChannelBuffer currentBuffer;
    private int acknowledgedBytes;

    private void sendResponse(Channel channel) {try{__CLR4_5_25qa5qalx1e1jqh.R.inc(7426);
        __CLR4_5_25qa5qalx1e1jqh.R.inc(7427);if ((((channel != null)&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7428)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7429)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7430);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 2 * BLOCK_LENGTH);
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7431);response.writeByte(At2000ProtocolDecoder.MSG_ACKNOWLEDGEMENT);
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7432);response.writeMedium(ChannelBuffers.swapMedium(1));
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7433);response.writeByte(0x00); // success
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7434);response.writerIndex(2 * BLOCK_LENGTH);
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7435);channel.write(response);
        }
    }}finally{__CLR4_5_25qa5qalx1e1jqh.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {try{__CLR4_5_25qa5qalx1e1jqh.R.inc(7436);

        __CLR4_5_25qa5qalx1e1jqh.R.inc(7437);if ((((buf.readableBytes() < 5)&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7438)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7439)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7440);return null;
        }

        }__CLR4_5_25qa5qalx1e1jqh.R.inc(7441);int length;
        __CLR4_5_25qa5qalx1e1jqh.R.inc(7442);if ((((firstPacket)&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7443)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7444)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7445);firstPacket = false;
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7446);length = buf.getUnsignedMedium(buf.readerIndex() + 2);
        } }else {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7447);length = buf.getUnsignedMedium(buf.readerIndex() + 1);
        }

        }__CLR4_5_25qa5qalx1e1jqh.R.inc(7448);length += BLOCK_LENGTH;
        __CLR4_5_25qa5qalx1e1jqh.R.inc(7449);if ((((length % BLOCK_LENGTH != 0)&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7450)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7451)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7452);length = (length / BLOCK_LENGTH + 1) * BLOCK_LENGTH;
        }

        }__CLR4_5_25qa5qalx1e1jqh.R.inc(7453);if (((((buf.readableBytes() >= length || buf.readableBytes() % ACK_LENGTH == 0)
                && (buf != currentBuffer || buf.readableBytes() > acknowledgedBytes))&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7454)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7455)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7456);sendResponse(channel);
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7457);currentBuffer = buf;
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7458);acknowledgedBytes = buf.readableBytes();
        }

        }__CLR4_5_25qa5qalx1e1jqh.R.inc(7459);if ((((buf.readableBytes() >= length)&&(__CLR4_5_25qa5qalx1e1jqh.R.iget(7460)!=0|true))||(__CLR4_5_25qa5qalx1e1jqh.R.iget(7461)==0&false))) {{
            __CLR4_5_25qa5qalx1e1jqh.R.inc(7462);return buf.readBytes(length);
        }

        }__CLR4_5_25qa5qalx1e1jqh.R.inc(7463);return null;
    }finally{__CLR4_5_25qa5qalx1e1jqh.R.flushNeeded();}}

}