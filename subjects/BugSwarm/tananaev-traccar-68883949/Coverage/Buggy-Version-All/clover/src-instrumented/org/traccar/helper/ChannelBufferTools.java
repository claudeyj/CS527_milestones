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

import java.util.Formatter;
import org.jboss.netty.buffer.ChannelBuffer;
import org.traccar.protocol.IntellitracFrameDecoder;

/**
 * ChannelBuffer helper methods
 */
public class ChannelBufferTools {public static class __CLR4_5_213u13ulx1dlmpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,1514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Find string in network buffer
     */
    public static Integer find(
            ChannelBuffer buf,
            Integer start,
            Integer finish,
            String subString) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1434);

        __CLR4_5_213u13ulx1dlmpb.R.inc(1435);int index = start;
        __CLR4_5_213u13ulx1dlmpb.R.inc(1436);boolean match;

        __CLR4_5_213u13ulx1dlmpb.R.inc(1437);for (; (((index < finish)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1438)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1439)==0&false)); index++) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1440);match = true;

            __CLR4_5_213u13ulx1dlmpb.R.inc(1441);for (int i = 0; (((i < subString.length())&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1442)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1443)==0&false)); i++) {{
                __CLR4_5_213u13ulx1dlmpb.R.inc(1444);char c = (char) buf.getByte(index + i);
                __CLR4_5_213u13ulx1dlmpb.R.inc(1445);if ((((c != subString.charAt(i))&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1446)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1447)==0&false))) {{
                    __CLR4_5_213u13ulx1dlmpb.R.inc(1448);match = false;
                    __CLR4_5_213u13ulx1dlmpb.R.inc(1449);break;
                }
            }}

            }__CLR4_5_213u13ulx1dlmpb.R.inc(1450);if ((((match)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1451)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1452)==0&false))) {{
                __CLR4_5_213u13ulx1dlmpb.R.inc(1453);return index;
            }
        }}

        }__CLR4_5_213u13ulx1dlmpb.R.inc(1454);return null;
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}
    
    /**
     * Convert hex to integer (length in hex digits)
     */
    public static int readHexInteger(ChannelBuffer buf, int length) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1455);
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1456);int result = 0;
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1457);for (int i = 0; (((i < length / 2)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1458)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1459)==0&false)); i++) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1460);int b = buf.readUnsignedByte();
            __CLR4_5_213u13ulx1dlmpb.R.inc(1461);result *= 10;
            __CLR4_5_213u13ulx1dlmpb.R.inc(1462);result += b >>> 4;
            __CLR4_5_213u13ulx1dlmpb.R.inc(1463);result *= 10;
            __CLR4_5_213u13ulx1dlmpb.R.inc(1464);result += b & 0x0f;
        }
        
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1465);if ((((length % 2 == 1)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1466)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1467)==0&false))) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1468);int b = buf.getUnsignedByte(buf.readerIndex());
            __CLR4_5_213u13ulx1dlmpb.R.inc(1469);result *= 10;
            __CLR4_5_213u13ulx1dlmpb.R.inc(1470);result += b >>> 4;
        }
        
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1471);return result;
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}

    /**
     * Return hex string
     */
    public static String readHexString(ChannelBuffer buf, int length) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1472);
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1473);StringBuilder result = new StringBuilder();
        __CLR4_5_213u13ulx1dlmpb.R.inc(1474);Formatter formatter = new Formatter(result);
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1475);for (int i = 0; (((i < length / 2)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1476)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1477)==0&false)); i++) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1478);formatter.format("%02x", buf.readByte());
        }
        
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1479);if ((((length % 2 == 1)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1480)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1481)==0&false))) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1482);int b = buf.getUnsignedByte(buf.readerIndex());
            __CLR4_5_213u13ulx1dlmpb.R.inc(1483);formatter.format("%01x", b >>> 4);
        }
        
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1484);return result.toString();
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}
    
    /**
     * Read BCD coded coordinate (first byte has sign bit)
     */
    public static double readCoordinate(ChannelBuffer buf) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1485);
        __CLR4_5_213u13ulx1dlmpb.R.inc(1486);int b1 = buf.readUnsignedByte();
        __CLR4_5_213u13ulx1dlmpb.R.inc(1487);int b2 = buf.readUnsignedByte();
        __CLR4_5_213u13ulx1dlmpb.R.inc(1488);int b3 = buf.readUnsignedByte();
        __CLR4_5_213u13ulx1dlmpb.R.inc(1489);int b4 = buf.readUnsignedByte();
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1490);double value = (b2 & 0xf) * 10 + (b3 >> 4);
        __CLR4_5_213u13ulx1dlmpb.R.inc(1491);value += (((b3 & 0xf) * 10 + (b4 >> 4)) * 10 + (b4 & 0xf)) / 1000.0;
        __CLR4_5_213u13ulx1dlmpb.R.inc(1492);value /= 60;
        __CLR4_5_213u13ulx1dlmpb.R.inc(1493);value += ((b1 >> 4 & 0x7) * 10 + (b1 & 0xf)) * 10 + (b2 >> 4);
        
        __CLR4_5_213u13ulx1dlmpb.R.inc(1494);if (((((b1 & 0x80) != 0)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1495)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1496)==0&false))) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1497);value = -value;
        }
        
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1498);return value;
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}


    /**
     * Convert integer array to byte array
     */
    public static byte[] convertArray(int[] in) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1499);
        __CLR4_5_213u13ulx1dlmpb.R.inc(1500);byte[] out = new byte[in.length];
        __CLR4_5_213u13ulx1dlmpb.R.inc(1501);for (int i = 0; (((i < in.length)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1502)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1503)==0&false)); i++) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1504);out[i] = (byte) in[i];
        }
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1505);return out;
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}

    /**
     * Convert hex string to byte array
     */
    public static byte[] convertHexString(String in) {try{__CLR4_5_213u13ulx1dlmpb.R.inc(1506);
        __CLR4_5_213u13ulx1dlmpb.R.inc(1507);int count = in.length() / 2;
        __CLR4_5_213u13ulx1dlmpb.R.inc(1508);byte[] out = new byte[count];
        __CLR4_5_213u13ulx1dlmpb.R.inc(1509);for (int i = 0; (((i < count)&&(__CLR4_5_213u13ulx1dlmpb.R.iget(1510)!=0|true))||(__CLR4_5_213u13ulx1dlmpb.R.iget(1511)==0&false)); i++) {{
            __CLR4_5_213u13ulx1dlmpb.R.inc(1512);out[i] = Integer.valueOf(in.substring(i * 2, (i + 1) * 2), 16).byteValue();
        }
        }__CLR4_5_213u13ulx1dlmpb.R.inc(1513);return out;
    }finally{__CLR4_5_213u13ulx1dlmpb.R.flushNeeded();}}

}
