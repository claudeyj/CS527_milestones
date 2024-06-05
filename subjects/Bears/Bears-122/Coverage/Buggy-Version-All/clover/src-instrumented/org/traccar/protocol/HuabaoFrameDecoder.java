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
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

public class HuabaoFrameDecoder extends FrameDecoder {public static class __CLR4_5_2behbehlwydzojt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,14806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, ChannelBuffer buf) throws Exception {try{__CLR4_5_2behbehlwydzojt.R.inc(14777);

        __CLR4_5_2behbehlwydzojt.R.inc(14778);if ((((buf.readableBytes() < 2)&&(__CLR4_5_2behbehlwydzojt.R.iget(14779)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14780)==0&false))) {{
            __CLR4_5_2behbehlwydzojt.R.inc(14781);return null;
        }

        }__CLR4_5_2behbehlwydzojt.R.inc(14782);int index = buf.indexOf(buf.readerIndex() + 1, buf.writerIndex(), (byte) 0x7e);
        __CLR4_5_2behbehlwydzojt.R.inc(14783);if ((((index != -1)&&(__CLR4_5_2behbehlwydzojt.R.iget(14784)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14785)==0&false))) {{
            __CLR4_5_2behbehlwydzojt.R.inc(14786);ChannelBuffer result = ChannelBuffers.buffer(index + 1 - buf.readerIndex());

            __CLR4_5_2behbehlwydzojt.R.inc(14787);while ((((buf.readerIndex() <= index)&&(__CLR4_5_2behbehlwydzojt.R.iget(14788)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14789)==0&false))) {{
                __CLR4_5_2behbehlwydzojt.R.inc(14790);int b = buf.readUnsignedByte();
                __CLR4_5_2behbehlwydzojt.R.inc(14791);if ((((b == 0x7d)&&(__CLR4_5_2behbehlwydzojt.R.iget(14792)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14793)==0&false))) {{
                    __CLR4_5_2behbehlwydzojt.R.inc(14794);int ext = buf.readUnsignedByte();
                    __CLR4_5_2behbehlwydzojt.R.inc(14795);if ((((ext == 0x01)&&(__CLR4_5_2behbehlwydzojt.R.iget(14796)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14797)==0&false))) {{
                        __CLR4_5_2behbehlwydzojt.R.inc(14798);result.writeByte(0x7d);
                    } }else {__CLR4_5_2behbehlwydzojt.R.inc(14799);if ((((ext == 0x02)&&(__CLR4_5_2behbehlwydzojt.R.iget(14800)!=0|true))||(__CLR4_5_2behbehlwydzojt.R.iget(14801)==0&false))) {{
                        __CLR4_5_2behbehlwydzojt.R.inc(14802);result.writeByte(0x7e);
                    }
                }}} }else {{
                    __CLR4_5_2behbehlwydzojt.R.inc(14803);result.writeByte(b);
                }
            }}

            }__CLR4_5_2behbehlwydzojt.R.inc(14804);return result;
        }

        }__CLR4_5_2behbehlwydzojt.R.inc(14805);return null;
    }finally{__CLR4_5_2behbehlwydzojt.R.flushNeeded();}}

}
