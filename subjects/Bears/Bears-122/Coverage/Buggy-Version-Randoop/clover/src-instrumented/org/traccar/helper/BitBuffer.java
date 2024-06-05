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
package org.traccar.helper;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

public class BitBuffer {public static class __CLR4_5_23y43y4lwydygal{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,5174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ChannelBuffer buffer;

    private int writeByte;
    private int writeCount;

    private int readByte;
    private int readCount;

    public BitBuffer() {try{__CLR4_5_23y43y4lwydygal.R.inc(5116);
        __CLR4_5_23y43y4lwydygal.R.inc(5117);buffer = ChannelBuffers.dynamicBuffer();
    }finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

    public BitBuffer(ChannelBuffer buffer) {try{__CLR4_5_23y43y4lwydygal.R.inc(5118);
        __CLR4_5_23y43y4lwydygal.R.inc(5119);this.buffer = buffer;
    }finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

    public void writeEncoded(byte[] bytes) {try{__CLR4_5_23y43y4lwydygal.R.inc(5120);
        __CLR4_5_23y43y4lwydygal.R.inc(5121);for (byte b : bytes) {{
            __CLR4_5_23y43y4lwydygal.R.inc(5122);b -= 48;
            __CLR4_5_23y43y4lwydygal.R.inc(5123);if ((((b > 40)&&(__CLR4_5_23y43y4lwydygal.R.iget(5124)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5125)==0&false))) {{
                __CLR4_5_23y43y4lwydygal.R.inc(5126);b -= 8;
            }
            }__CLR4_5_23y43y4lwydygal.R.inc(5127);write(b);
        }
    }}finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

    public void write(int b) {try{__CLR4_5_23y43y4lwydygal.R.inc(5128);
        __CLR4_5_23y43y4lwydygal.R.inc(5129);if ((((writeCount == 0)&&(__CLR4_5_23y43y4lwydygal.R.iget(5130)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5131)==0&false))) {{
            __CLR4_5_23y43y4lwydygal.R.inc(5132);writeByte |= b;
            __CLR4_5_23y43y4lwydygal.R.inc(5133);writeCount = 6;
        } }else {{
            __CLR4_5_23y43y4lwydygal.R.inc(5134);int remaining = 8 - writeCount;
            __CLR4_5_23y43y4lwydygal.R.inc(5135);writeByte <<= remaining;
            __CLR4_5_23y43y4lwydygal.R.inc(5136);writeByte |= b >> (6 - remaining);
            __CLR4_5_23y43y4lwydygal.R.inc(5137);buffer.writeByte(writeByte);
            __CLR4_5_23y43y4lwydygal.R.inc(5138);writeByte = b & ((1 << (6 - remaining)) - 1);
            __CLR4_5_23y43y4lwydygal.R.inc(5139);writeCount = 6 - remaining;
        }
    }}finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

    public int readUnsigned(int length) {try{__CLR4_5_23y43y4lwydygal.R.inc(5140);
        __CLR4_5_23y43y4lwydygal.R.inc(5141);int result = 0;

        __CLR4_5_23y43y4lwydygal.R.inc(5142);while ((((length > 0)&&(__CLR4_5_23y43y4lwydygal.R.iget(5143)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5144)==0&false))) {{
            __CLR4_5_23y43y4lwydygal.R.inc(5145);if ((((readCount == 0)&&(__CLR4_5_23y43y4lwydygal.R.iget(5146)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5147)==0&false))) {{
                __CLR4_5_23y43y4lwydygal.R.inc(5148);readByte = buffer.readUnsignedByte();
                __CLR4_5_23y43y4lwydygal.R.inc(5149);readCount = 8;
            }
            }__CLR4_5_23y43y4lwydygal.R.inc(5150);if ((((readCount >= length)&&(__CLR4_5_23y43y4lwydygal.R.iget(5151)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5152)==0&false))) {{
                __CLR4_5_23y43y4lwydygal.R.inc(5153);result <<= length;
                __CLR4_5_23y43y4lwydygal.R.inc(5154);result |= readByte >> (readCount - length);
                __CLR4_5_23y43y4lwydygal.R.inc(5155);readByte &= (1 << (readCount - length)) - 1;
                __CLR4_5_23y43y4lwydygal.R.inc(5156);readCount -= length;
                __CLR4_5_23y43y4lwydygal.R.inc(5157);length = 0;
            } }else {{
                __CLR4_5_23y43y4lwydygal.R.inc(5158);result <<= readCount;
                __CLR4_5_23y43y4lwydygal.R.inc(5159);result |= readByte;
                __CLR4_5_23y43y4lwydygal.R.inc(5160);length -= readCount;
                __CLR4_5_23y43y4lwydygal.R.inc(5161);readByte = 0;
                __CLR4_5_23y43y4lwydygal.R.inc(5162);readCount = 0;
            }
        }}

        }__CLR4_5_23y43y4lwydygal.R.inc(5163);return result;
    }finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

    public int readSigned(int length) {try{__CLR4_5_23y43y4lwydygal.R.inc(5164);
        __CLR4_5_23y43y4lwydygal.R.inc(5165);int result = readUnsigned(length);
        __CLR4_5_23y43y4lwydygal.R.inc(5166);int signBit = 1 << (length - 1);
        __CLR4_5_23y43y4lwydygal.R.inc(5167);if (((((result & signBit) == 0)&&(__CLR4_5_23y43y4lwydygal.R.iget(5168)!=0|true))||(__CLR4_5_23y43y4lwydygal.R.iget(5169)==0&false))) {{
            __CLR4_5_23y43y4lwydygal.R.inc(5170);return result;
        } }else {{
            __CLR4_5_23y43y4lwydygal.R.inc(5171);result &= signBit - 1;
            __CLR4_5_23y43y4lwydygal.R.inc(5172);result += ~(signBit - 1);
            __CLR4_5_23y43y4lwydygal.R.inc(5173);return result;
        }
    }}finally{__CLR4_5_23y43y4lwydygal.R.flushNeeded();}}

}
