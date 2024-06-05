/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton@traccar.org)
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

public class OrionFrameDecoder extends FrameDecoder {public static class __CLR4_5_2c4rc4rlx1dzbke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,15759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx,
            Channel channel,
            ChannelBuffer buf) throws Exception {try{__CLR4_5_2c4rc4rlx1dzbke.R.inc(15723);

        __CLR4_5_2c4rc4rlx1dzbke.R.inc(15724);int length = 6;

        __CLR4_5_2c4rc4rlx1dzbke.R.inc(15725);if ((((buf.readableBytes() >= length)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15726)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15727)==0&false))) {{

            __CLR4_5_2c4rc4rlx1dzbke.R.inc(15728);int type = buf.getUnsignedByte(buf.readerIndex() + 2) & 0x0f;

            __CLR4_5_2c4rc4rlx1dzbke.R.inc(15729);if ((((type == OrionProtocolDecoder.MSG_USERLOG && buf.readableBytes() >= length + 5)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15730)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15731)==0&false))) {{

                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15732);int index = buf.readerIndex() + 3;
                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15733);int count = buf.getUnsignedByte(index) & 0x0f;
                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15734);index += 5;
                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15735);length += 5;

                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15736);for (int i = 0; (((i < count)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15737)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15738)==0&false)); i++) {{
                    __CLR4_5_2c4rc4rlx1dzbke.R.inc(15739);if ((((buf.readableBytes() < length)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15740)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15741)==0&false))) {{
                        __CLR4_5_2c4rc4rlx1dzbke.R.inc(15742);return null;
                    }
                    }__CLR4_5_2c4rc4rlx1dzbke.R.inc(15743);int logLength = buf.getUnsignedByte(index + 1);
                    __CLR4_5_2c4rc4rlx1dzbke.R.inc(15744);index += logLength;
                    __CLR4_5_2c4rc4rlx1dzbke.R.inc(15745);length += logLength;
                }

                }__CLR4_5_2c4rc4rlx1dzbke.R.inc(15746);if ((((buf.readableBytes() >= length)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15747)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15748)==0&false))) {{
                    __CLR4_5_2c4rc4rlx1dzbke.R.inc(15749);return buf.readBytes(length);
                }

            }} }else {__CLR4_5_2c4rc4rlx1dzbke.R.inc(15750);if ((((type == OrionProtocolDecoder.MSG_SYSLOG && buf.readableBytes() >= length + 12)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15751)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15752)==0&false))) {{

                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15753);length += buf.getUnsignedShort(buf.readerIndex() + 8);
                __CLR4_5_2c4rc4rlx1dzbke.R.inc(15754);if ((((buf.readableBytes() >= length)&&(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15755)!=0|true))||(__CLR4_5_2c4rc4rlx1dzbke.R.iget(15756)==0&false))) {{
                    __CLR4_5_2c4rc4rlx1dzbke.R.inc(15757);return buf.readBytes(length);
                }

            }}
        }}}

        }__CLR4_5_2c4rc4rlx1dzbke.R.inc(15758);return null;
    }finally{__CLR4_5_2c4rc4rlx1dzbke.R.flushNeeded();}}

}
