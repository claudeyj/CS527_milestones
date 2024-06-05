/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
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

public final class BcdUtil {public static class __CLR4_5_23x83x8lwye3x63{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,5116,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private BcdUtil() {try{__CLR4_5_23x83x8lwye3x63.R.inc(5084);
    }finally{__CLR4_5_23x83x8lwye3x63.R.flushNeeded();}}

    public static int readInteger(ChannelBuffer buf, int digits) {try{__CLR4_5_23x83x8lwye3x63.R.inc(5085);
        __CLR4_5_23x83x8lwye3x63.R.inc(5086);int result = 0;

        __CLR4_5_23x83x8lwye3x63.R.inc(5087);for (int i = 0; (((i < digits / 2)&&(__CLR4_5_23x83x8lwye3x63.R.iget(5088)!=0|true))||(__CLR4_5_23x83x8lwye3x63.R.iget(5089)==0&false)); i++) {{
            __CLR4_5_23x83x8lwye3x63.R.inc(5090);int b = buf.readUnsignedByte();
            __CLR4_5_23x83x8lwye3x63.R.inc(5091);result *= 10;
            __CLR4_5_23x83x8lwye3x63.R.inc(5092);result += b >>> 4;
            __CLR4_5_23x83x8lwye3x63.R.inc(5093);result *= 10;
            __CLR4_5_23x83x8lwye3x63.R.inc(5094);result += b & 0x0f;
        }

        }__CLR4_5_23x83x8lwye3x63.R.inc(5095);if ((((digits % 2 != 0)&&(__CLR4_5_23x83x8lwye3x63.R.iget(5096)!=0|true))||(__CLR4_5_23x83x8lwye3x63.R.iget(5097)==0&false))) {{
            __CLR4_5_23x83x8lwye3x63.R.inc(5098);int b = buf.getUnsignedByte(buf.readerIndex());
            __CLR4_5_23x83x8lwye3x63.R.inc(5099);result *= 10;
            __CLR4_5_23x83x8lwye3x63.R.inc(5100);result += b >>> 4;
        }

        }__CLR4_5_23x83x8lwye3x63.R.inc(5101);return result;
    }finally{__CLR4_5_23x83x8lwye3x63.R.flushNeeded();}}

    public static double readCoordinate(ChannelBuffer buf) {try{__CLR4_5_23x83x8lwye3x63.R.inc(5102);
        __CLR4_5_23x83x8lwye3x63.R.inc(5103);int b1 = buf.readUnsignedByte();
        __CLR4_5_23x83x8lwye3x63.R.inc(5104);int b2 = buf.readUnsignedByte();
        __CLR4_5_23x83x8lwye3x63.R.inc(5105);int b3 = buf.readUnsignedByte();
        __CLR4_5_23x83x8lwye3x63.R.inc(5106);int b4 = buf.readUnsignedByte();

        __CLR4_5_23x83x8lwye3x63.R.inc(5107);double value = (b2 & 0xf) * 10 + (b3 >> 4);
        __CLR4_5_23x83x8lwye3x63.R.inc(5108);value += (((b3 & 0xf) * 10 + (b4 >> 4)) * 10 + (b4 & 0xf)) / 1000.0;
        __CLR4_5_23x83x8lwye3x63.R.inc(5109);value /= 60;
        __CLR4_5_23x83x8lwye3x63.R.inc(5110);value += ((b1 >> 4 & 0x7) * 10 + (b1 & 0xf)) * 10 + (b2 >> 4);

        __CLR4_5_23x83x8lwye3x63.R.inc(5111);if (((((b1 & 0x80) != 0)&&(__CLR4_5_23x83x8lwye3x63.R.iget(5112)!=0|true))||(__CLR4_5_23x83x8lwye3x63.R.iget(5113)==0&false))) {{
            __CLR4_5_23x83x8lwye3x63.R.inc(5114);value = -value;
        }

        }__CLR4_5_23x83x8lwye3x63.R.inc(5115);return value;
    }finally{__CLR4_5_23x83x8lwye3x63.R.flushNeeded();}}

}
