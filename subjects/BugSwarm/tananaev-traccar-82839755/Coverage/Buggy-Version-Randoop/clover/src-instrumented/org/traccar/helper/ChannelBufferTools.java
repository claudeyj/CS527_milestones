/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.util.Formatter;

public class ChannelBufferTools {public static class __CLR4_5_21ad1adlx1e427f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,1757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static Integer find(ChannelBuffer buf, int start, String subString) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1669);
        __CLR4_5_21ad1adlx1e427f.R.inc(1670);return find(buf, start, buf.readerIndex() + buf.readableBytes(), subString);
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}

    /**
     * Find string in network buffer
     */
    public static Integer find(
            ChannelBuffer buf,
            Integer start,
            Integer finish,
            String subString) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1671);

        __CLR4_5_21ad1adlx1e427f.R.inc(1672);int index = start;
        __CLR4_5_21ad1adlx1e427f.R.inc(1673);boolean match;

        __CLR4_5_21ad1adlx1e427f.R.inc(1674);for (; (((index < finish)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1675)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1676)==0&false)); index++) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1677);match = true;

            __CLR4_5_21ad1adlx1e427f.R.inc(1678);for (int i = 0; (((i < subString.length())&&(__CLR4_5_21ad1adlx1e427f.R.iget(1679)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1680)==0&false)); i++) {{
                __CLR4_5_21ad1adlx1e427f.R.inc(1681);char c = (char) buf.getByte(index + i);
                __CLR4_5_21ad1adlx1e427f.R.inc(1682);if ((((c != subString.charAt(i))&&(__CLR4_5_21ad1adlx1e427f.R.iget(1683)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1684)==0&false))) {{
                    __CLR4_5_21ad1adlx1e427f.R.inc(1685);match = false;
                    __CLR4_5_21ad1adlx1e427f.R.inc(1686);break;
                }
            }}

            }__CLR4_5_21ad1adlx1e427f.R.inc(1687);if ((((match)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1688)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1689)==0&false))) {{
                __CLR4_5_21ad1adlx1e427f.R.inc(1690);return index;
            }
        }}

        }__CLR4_5_21ad1adlx1e427f.R.inc(1691);return null;
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}
    
    /**
     * Convert hex to integer (length in hex digits)
     */
    public static int readHexInteger(ChannelBuffer buf, int length) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1692);
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1693);int result = 0;
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1694);for (int i = 0; (((i < length / 2)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1695)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1696)==0&false)); i++) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1697);int b = buf.readUnsignedByte();
            __CLR4_5_21ad1adlx1e427f.R.inc(1698);result *= 10;
            __CLR4_5_21ad1adlx1e427f.R.inc(1699);result += b >>> 4;
            __CLR4_5_21ad1adlx1e427f.R.inc(1700);result *= 10;
            __CLR4_5_21ad1adlx1e427f.R.inc(1701);result += b & 0x0f;
        }
        
        }__CLR4_5_21ad1adlx1e427f.R.inc(1702);if ((((length % 2 == 1)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1703)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1704)==0&false))) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1705);int b = buf.getUnsignedByte(buf.readerIndex());
            __CLR4_5_21ad1adlx1e427f.R.inc(1706);result *= 10;
            __CLR4_5_21ad1adlx1e427f.R.inc(1707);result += b >>> 4;
        }
        
        }__CLR4_5_21ad1adlx1e427f.R.inc(1708);return result;
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}

    /**
     * Return hex string
     */
    public static String readHexString(ChannelBuffer buf, int length) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1709);
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1710);StringBuilder result = new StringBuilder();
        __CLR4_5_21ad1adlx1e427f.R.inc(1711);Formatter formatter = new Formatter(result);
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1712);for (int i = 0; (((i < length / 2)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1713)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1714)==0&false)); i++) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1715);formatter.format("%02x", buf.readByte());
        }
        
        }__CLR4_5_21ad1adlx1e427f.R.inc(1716);if ((((length % 2 == 1)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1717)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1718)==0&false))) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1719);int b = buf.getUnsignedByte(buf.readerIndex());
            __CLR4_5_21ad1adlx1e427f.R.inc(1720);formatter.format("%01x", b >>> 4);
        }
        
        }__CLR4_5_21ad1adlx1e427f.R.inc(1721);return result.toString();
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}
    
    /**
     * Read BCD coded coordinate (first byte has sign bit)
     */
    public static double readCoordinate(ChannelBuffer buf) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1722);
        __CLR4_5_21ad1adlx1e427f.R.inc(1723);int b1 = buf.readUnsignedByte();
        __CLR4_5_21ad1adlx1e427f.R.inc(1724);int b2 = buf.readUnsignedByte();
        __CLR4_5_21ad1adlx1e427f.R.inc(1725);int b3 = buf.readUnsignedByte();
        __CLR4_5_21ad1adlx1e427f.R.inc(1726);int b4 = buf.readUnsignedByte();
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1727);double value = (b2 & 0xf) * 10 + (b3 >> 4);
        __CLR4_5_21ad1adlx1e427f.R.inc(1728);value += (((b3 & 0xf) * 10 + (b4 >> 4)) * 10 + (b4 & 0xf)) / 1000.0;
        __CLR4_5_21ad1adlx1e427f.R.inc(1729);value /= 60;
        __CLR4_5_21ad1adlx1e427f.R.inc(1730);value += ((b1 >> 4 & 0x7) * 10 + (b1 & 0xf)) * 10 + (b2 >> 4);
        
        __CLR4_5_21ad1adlx1e427f.R.inc(1731);if (((((b1 & 0x80) != 0)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1732)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1733)==0&false))) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1734);value = -value;
        }
        
        }__CLR4_5_21ad1adlx1e427f.R.inc(1735);return value;
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}


    /**
     * Convert integer array to byte array
     */
    public static byte[] convertArray(int[] in) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1736);
        __CLR4_5_21ad1adlx1e427f.R.inc(1737);byte[] out = new byte[in.length];
        __CLR4_5_21ad1adlx1e427f.R.inc(1738);for (int i = 0; (((i < in.length)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1739)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1740)==0&false)); i++) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1741);out[i] = (byte) in[i];
        }
        }__CLR4_5_21ad1adlx1e427f.R.inc(1742);return out;
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}

    /**
     * Convert hex string to byte array
     */
    public static byte[] convertHexString(String in) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1743);
        __CLR4_5_21ad1adlx1e427f.R.inc(1744);int count = in.length() / 2;
        __CLR4_5_21ad1adlx1e427f.R.inc(1745);byte[] out = new byte[count];
        __CLR4_5_21ad1adlx1e427f.R.inc(1746);for (int i = 0; (((i < count)&&(__CLR4_5_21ad1adlx1e427f.R.iget(1747)!=0|true))||(__CLR4_5_21ad1adlx1e427f.R.iget(1748)==0&false)); i++) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1749);out[i] = Integer.valueOf(in.substring(i * 2, (i + 1) * 2), 16).byteValue();
        }
        }__CLR4_5_21ad1adlx1e427f.R.inc(1750);return out;
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}

    /**
     * Convert byte array to hex string
     */
    public static String convertByteArray(byte[] in) {try{__CLR4_5_21ad1adlx1e427f.R.inc(1751);
        __CLR4_5_21ad1adlx1e427f.R.inc(1752);StringBuilder out = new StringBuilder();
        __CLR4_5_21ad1adlx1e427f.R.inc(1753);Formatter formatter = new Formatter(out);
        __CLR4_5_21ad1adlx1e427f.R.inc(1754);for (byte b : in) {{
            __CLR4_5_21ad1adlx1e427f.R.inc(1755);formatter.format("%02x", b);
        }
        }__CLR4_5_21ad1adlx1e427f.R.inc(1756);return out.toString();
    }finally{__CLR4_5_21ad1adlx1e427f.R.flushNeeded();}}

}
