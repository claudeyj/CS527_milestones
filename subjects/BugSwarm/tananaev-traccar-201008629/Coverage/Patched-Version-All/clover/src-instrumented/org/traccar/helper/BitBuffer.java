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
package org.traccar.helper;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

public class BitBuffer {public static class __CLR4_5_23lf3lflx1e1iq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,4713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();

    private int writeByte;
    private int writeCount;

    private int readByte;
    private int readCount;

    public void writeEncoded(byte[] bytes) {try{__CLR4_5_23lf3lflx1e1iq7.R.inc(4659);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4660);for (byte b : bytes) {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4661);b -= 48;
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4662);if ((((b > 40)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4663)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4664)==0&false))) {{
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4665);b -= 8;
            }
            }__CLR4_5_23lf3lflx1e1iq7.R.inc(4666);write(b);
        }
    }}finally{__CLR4_5_23lf3lflx1e1iq7.R.flushNeeded();}}

    public void write(int b) {try{__CLR4_5_23lf3lflx1e1iq7.R.inc(4667);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4668);if ((((writeCount == 0)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4669)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4670)==0&false))) {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4671);writeByte |= b;
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4672);writeCount = 6;
        } }else {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4673);int remaining = 8 - writeCount;
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4674);writeByte <<= remaining;
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4675);writeByte |= b >> (6 - remaining);
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4676);buffer.writeByte(writeByte);
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4677);writeByte = b & ((1 << (6 - remaining)) - 1);
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4678);writeCount = 6 - remaining;
        }
    }}finally{__CLR4_5_23lf3lflx1e1iq7.R.flushNeeded();}}

    public int readUnsigned(int length) {try{__CLR4_5_23lf3lflx1e1iq7.R.inc(4679);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4680);int result = 0;

        __CLR4_5_23lf3lflx1e1iq7.R.inc(4681);while ((((length > 0)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4682)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4683)==0&false))) {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4684);if ((((readCount == 0)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4685)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4686)==0&false))) {{
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4687);readByte = buffer.readUnsignedByte();
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4688);readCount = 8;
            }
            }__CLR4_5_23lf3lflx1e1iq7.R.inc(4689);if ((((readCount >= length)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4690)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4691)==0&false))) {{
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4692);result <<= length;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4693);result |= readByte >> (readCount - length);
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4694);readByte &= (1 << (readCount - length)) - 1;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4695);readCount -= length;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4696);length = 0;
            } }else {{
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4697);result <<= readCount;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4698);result |= readByte;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4699);length -= readCount;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4700);readByte = 0;
                __CLR4_5_23lf3lflx1e1iq7.R.inc(4701);readCount = 0;
            }
        }}

        }__CLR4_5_23lf3lflx1e1iq7.R.inc(4702);return result;
    }finally{__CLR4_5_23lf3lflx1e1iq7.R.flushNeeded();}}

    public int readSigned(int length) {try{__CLR4_5_23lf3lflx1e1iq7.R.inc(4703);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4704);int result = readUnsigned(length);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4705);int signBit = 1 << (length - 1);
        __CLR4_5_23lf3lflx1e1iq7.R.inc(4706);if (((((result & signBit) == 0)&&(__CLR4_5_23lf3lflx1e1iq7.R.iget(4707)!=0|true))||(__CLR4_5_23lf3lflx1e1iq7.R.iget(4708)==0&false))) {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4709);return result;
        } }else {{
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4710);result &= signBit - 1;
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4711);result += ~(signBit - 1);
            __CLR4_5_23lf3lflx1e1iq7.R.inc(4712);return result;
        }
    }}finally{__CLR4_5_23lf3lflx1e1iq7.R.flushNeeded();}}

}
