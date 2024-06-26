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

public class At2000FrameDecoder extends FrameDecoder {public static class __CLR4_5_26ha6halwye639g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,8436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int BLOCK_LENGTH = 16;
    private static final int ACK_LENGTH = 496;

    private boolean firstPacket = true;

    private ChannelBuffer currentBuffer;
    private int acknowledgedBytes;

    private void sendResponse(Channel channel) {try{__CLR4_5_26ha6halwye639g.R.inc(8398);
        __CLR4_5_26ha6halwye639g.R.inc(8399);if ((((channel != null)&&(__CLR4_5_26ha6halwye639g.R.iget(8400)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8401)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8402);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 2 * BLOCK_LENGTH);
            __CLR4_5_26ha6halwye639g.R.inc(8403);response.writeByte(At2000ProtocolDecoder.MSG_ACKNOWLEDGEMENT);
            __CLR4_5_26ha6halwye639g.R.inc(8404);response.writeMedium(ChannelBuffers.swapMedium(1));
            __CLR4_5_26ha6halwye639g.R.inc(8405);response.writeByte(0x00); // success
            __CLR4_5_26ha6halwye639g.R.inc(8406);response.writerIndex(2 * BLOCK_LENGTH);
            __CLR4_5_26ha6halwye639g.R.inc(8407);channel.write(response);
        }
    }}finally{__CLR4_5_26ha6halwye639g.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {try{__CLR4_5_26ha6halwye639g.R.inc(8408);

        __CLR4_5_26ha6halwye639g.R.inc(8409);if ((((buf.readableBytes() < 5)&&(__CLR4_5_26ha6halwye639g.R.iget(8410)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8411)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8412);return null;
        }

        }__CLR4_5_26ha6halwye639g.R.inc(8413);int length;
        __CLR4_5_26ha6halwye639g.R.inc(8414);if ((((firstPacket)&&(__CLR4_5_26ha6halwye639g.R.iget(8415)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8416)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8417);firstPacket = false;
            __CLR4_5_26ha6halwye639g.R.inc(8418);length = buf.getUnsignedMedium(buf.readerIndex() + 2);
        } }else {{
            __CLR4_5_26ha6halwye639g.R.inc(8419);length = buf.getUnsignedMedium(buf.readerIndex() + 1);
        }

        }__CLR4_5_26ha6halwye639g.R.inc(8420);length += BLOCK_LENGTH;
        __CLR4_5_26ha6halwye639g.R.inc(8421);if ((((length % BLOCK_LENGTH != 0)&&(__CLR4_5_26ha6halwye639g.R.iget(8422)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8423)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8424);length = (length / BLOCK_LENGTH + 1) * BLOCK_LENGTH;
        }

        }__CLR4_5_26ha6halwye639g.R.inc(8425);if (((((buf.readableBytes() >= length || buf.readableBytes() % ACK_LENGTH == 0)
                && (buf != currentBuffer || buf.readableBytes() > acknowledgedBytes))&&(__CLR4_5_26ha6halwye639g.R.iget(8426)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8427)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8428);sendResponse(channel);
            __CLR4_5_26ha6halwye639g.R.inc(8429);currentBuffer = buf;
            __CLR4_5_26ha6halwye639g.R.inc(8430);acknowledgedBytes = buf.readableBytes();
        }

        }__CLR4_5_26ha6halwye639g.R.inc(8431);if ((((buf.readableBytes() >= length)&&(__CLR4_5_26ha6halwye639g.R.iget(8432)!=0|true))||(__CLR4_5_26ha6halwye639g.R.iget(8433)==0&false))) {{
            __CLR4_5_26ha6halwye639g.R.inc(8434);return buf.readBytes(length);
        }

        }__CLR4_5_26ha6halwye639g.R.inc(8435);return null;
    }finally{__CLR4_5_26ha6halwye639g.R.flushNeeded();}}

}
