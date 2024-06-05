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

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.CRC32;

/**
 * CRC functions
 */
public class Crc {public static class __CLR4_5_2162162lx1dlmrz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,1574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int crc16CcittTableReverse[] = {
        0x0000, 0x1189, 0x2312, 0x329B, 0x4624, 0x57AD, 0x6536, 0x74BF,
        0x8C48, 0x9DC1, 0xAF5A, 0xBED3, 0xCA6C, 0xDBE5, 0xE97E, 0xF8F7,
        0x1081, 0x0108, 0x3393, 0x221A, 0x56A5, 0x472C, 0x75B7, 0x643E,
        0x9CC9, 0x8D40, 0xBFDB, 0xAE52, 0xDAED, 0xCB64, 0xF9FF, 0xE876,
        0x2102, 0x308B, 0x0210, 0x1399, 0x6726, 0x76AF, 0x4434, 0x55BD,
        0xAD4A, 0xBCC3, 0x8E58, 0x9FD1, 0xEB6E, 0xFAE7, 0xC87C, 0xD9F5,
        0x3183, 0x200A, 0x1291, 0x0318, 0x77A7, 0x662E, 0x54B5, 0x453C,
        0xBDCB, 0xAC42, 0x9ED9, 0x8F50, 0xFBEF, 0xEA66, 0xD8FD, 0xC974,
        0x4204, 0x538D, 0x6116, 0x709F, 0x0420, 0x15A9, 0x2732, 0x36BB,
        0xCE4C, 0xDFC5, 0xED5E, 0xFCD7, 0x8868, 0x99E1, 0xAB7A, 0xBAF3,
        0x5285, 0x430C, 0x7197, 0x601E, 0x14A1, 0x0528, 0x37B3, 0x263A,
        0xDECD, 0xCF44, 0xFDDF, 0xEC56, 0x98E9, 0x8960, 0xBBFB, 0xAA72,
        0x6306, 0x728F, 0x4014, 0x519D, 0x2522, 0x34AB, 0x0630, 0x17B9,
        0xEF4E, 0xFEC7, 0xCC5C, 0xDDD5, 0xA96A, 0xB8E3, 0x8A78, 0x9BF1,
        0x7387, 0x620E, 0x5095, 0x411C, 0x35A3, 0x242A, 0x16B1, 0x0738,
        0xFFCF, 0xEE46, 0xDCDD, 0xCD54, 0xB9EB, 0xA862, 0x9AF9, 0x8B70,
        0x8408, 0x9581, 0xA71A, 0xB693, 0xC22C, 0xD3A5, 0xE13E, 0xF0B7,
        0x0840, 0x19C9, 0x2B52, 0x3ADB, 0x4E64, 0x5FED, 0x6D76, 0x7CFF,
        0x9489, 0x8500, 0xB79B, 0xA612, 0xD2AD, 0xC324, 0xF1BF, 0xE036,
        0x18C1, 0x0948, 0x3BD3, 0x2A5A, 0x5EE5, 0x4F6C, 0x7DF7, 0x6C7E,
        0xA50A, 0xB483, 0x8618, 0x9791, 0xE32E, 0xF2A7, 0xC03C, 0xD1B5,
        0x2942, 0x38CB, 0x0A50, 0x1BD9, 0x6F66, 0x7EEF, 0x4C74, 0x5DFD,
        0xB58B, 0xA402, 0x9699, 0x8710, 0xF3AF, 0xE226, 0xD0BD, 0xC134,
        0x39C3, 0x284A, 0x1AD1, 0x0B58, 0x7FE7, 0x6E6E, 0x5CF5, 0x4D7C,
        0xC60C, 0xD785, 0xE51E, 0xF497, 0x8028, 0x91A1, 0xA33A, 0xB2B3,
        0x4A44, 0x5BCD, 0x6956, 0x78DF, 0x0C60, 0x1DE9, 0x2F72, 0x3EFB,
        0xD68D, 0xC704, 0xF59F, 0xE416, 0x90A9, 0x8120, 0xB3BB, 0xA232,
        0x5AC5, 0x4B4C, 0x79D7, 0x685E, 0x1CE1, 0x0D68, 0x3FF3, 0x2E7A,
        0xE70E, 0xF687, 0xC41C, 0xD595, 0xA12A, 0xB0A3, 0x8238, 0x93B1,
        0x6B46, 0x7ACF, 0x4854, 0x59DD, 0x2D62, 0x3CEB, 0x0E70, 0x1FF9,
        0xF78F, 0xE606, 0xD49D, 0xC514, 0xB1AB, 0xA022, 0x92B9, 0x8330,
        0x7BC7, 0x6A4E, 0x58D5, 0x495C, 0x3DE3, 0x2C6A, 0x1EF1, 0x0F78
    };

    private static final int crc16CcittTable[] = {
        0x0000, 0x1021, 0x2042, 0x3063, 0x4084, 0x50A5, 0x60C6, 0x70E7,
        0x8108, 0x9129, 0xA14A, 0xB16B, 0xC18C, 0xD1AD, 0xE1CE, 0xF1EF,
        0x1231, 0x0210, 0x3273, 0x2252, 0x52B5, 0x4294, 0x72F7, 0x62D6,
        0x9339, 0x8318, 0xB37B, 0xA35A, 0xD3BD, 0xC39C, 0xF3FF, 0xE3DE,
        0x2462, 0x3443, 0x0420, 0x1401, 0x64E6, 0x74C7, 0x44A4, 0x5485,
        0xA56A, 0xB54B, 0x8528, 0x9509, 0xE5EE, 0xF5CF, 0xC5AC, 0xD58D,
        0x3653, 0x2672, 0x1611, 0x0630, 0x76D7, 0x66F6, 0x5695, 0x46B4,
        0xB75B, 0xA77A, 0x9719, 0x8738, 0xF7DF, 0xE7FE, 0xD79D, 0xC7BC,
        0x48C4, 0x58E5, 0x6886, 0x78A7, 0x0840, 0x1861, 0x2802, 0x3823,
        0xC9CC, 0xD9ED, 0xE98E, 0xF9AF, 0x8948, 0x9969, 0xA90A, 0xB92B,
        0x5AF5, 0x4AD4, 0x7AB7, 0x6A96, 0x1A71, 0x0A50, 0x3A33, 0x2A12,
        0xDBFD, 0xCBDC, 0xFBBF, 0xEB9E, 0x9B79, 0x8B58, 0xBB3B, 0xAB1A,
        0x6CA6, 0x7C87, 0x4CE4, 0x5CC5, 0x2C22, 0x3C03, 0x0C60, 0x1C41,
        0xEDAE, 0xFD8F, 0xCDEC, 0xDDCD, 0xAD2A, 0xBD0B, 0x8D68, 0x9D49,
        0x7E97, 0x6EB6, 0x5ED5, 0x4EF4, 0x3E13, 0x2E32, 0x1E51, 0x0E70,
        0xFF9F, 0xEFBE, 0xDFDD, 0xCFFC, 0xBF1B, 0xAF3A, 0x9F59, 0x8F78,
        0x9188, 0x81A9, 0xB1CA, 0xA1EB, 0xD10C, 0xC12D, 0xF14E, 0xE16F,
        0x1080, 0x00A1, 0x30C2, 0x20E3, 0x5004, 0x4025, 0x7046, 0x6067,
        0x83B9, 0x9398, 0xA3FB, 0xB3DA, 0xC33D, 0xD31C, 0xE37F, 0xF35E,
        0x02B1, 0x1290, 0x22F3, 0x32D2, 0x4235, 0x5214, 0x6277, 0x7256,
        0xB5EA, 0xA5CB, 0x95A8, 0x8589, 0xF56E, 0xE54F, 0xD52C, 0xC50D,
        0x34E2, 0x24C3, 0x14A0, 0x0481, 0x7466, 0x6447, 0x5424, 0x4405,
        0xA7DB, 0xB7FA, 0x8799, 0x97B8, 0xE75F, 0xF77E, 0xC71D, 0xD73C,
        0x26D3, 0x36F2, 0x0691, 0x16B0, 0x6657, 0x7676, 0x4615, 0x5634,
        0xD94C, 0xC96D, 0xF90E, 0xE92F, 0x99C8, 0x89E9, 0xB98A, 0xA9AB,
        0x5844, 0x4865, 0x7806, 0x6827, 0x18C0, 0x08E1, 0x3882, 0x28A3,
        0xCB7D, 0xDB5C, 0xEB3F, 0xFB1E, 0x8BF9, 0x9BD8, 0xABBB, 0xBB9A,
        0x4A75, 0x5A54, 0x6A37, 0x7A16, 0x0AF1, 0x1AD0, 0x2AB3, 0x3A92,
        0xFD2E, 0xED0F, 0xDD6C, 0xCD4D, 0xBDAA, 0xAD8B, 0x9DE8, 0x8DC9,
        0x7C26, 0x6C07, 0x5C64, 0x4C45, 0x3CA2, 0x2C83, 0x1CE0, 0x0CC1,
        0xEF1F, 0xFF3E, 0xCF5D, 0xDF7C, 0xAF9B, 0xBFBA, 0x8FD9, 0x9FF8,
        0x6E17, 0x7E36, 0x4E55, 0x5E74, 0x2E93, 0x3EB2, 0x0ED1, 0x1EF0
    };

    private static final int crc16CcittStart = 0xFFFF;
    private static final int crc16CcittXorout = 0xFFFF;

    private static int crc16Unreflected(ByteBuffer buf, int crc_in, int[] table) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1514);
        __CLR4_5_2162162lx1dlmrz.R.inc(1515);int crc16 = crc_in;
        
        __CLR4_5_2162162lx1dlmrz.R.inc(1516);for (int i = 0; (((i < buf.remaining())&&(__CLR4_5_2162162lx1dlmrz.R.iget(1517)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1518)==0&false)); i++) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1519);crc16 = table[((crc16 >> 8) ^ buf.get(i)) & 0xff] ^ (crc16 << 8);
        }

        }__CLR4_5_2162162lx1dlmrz.R.inc(1520);return crc16 & 0xFFFF;
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    private static int crc16Reflected(ByteBuffer buf, int crc_in, int[] table) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1521);
        __CLR4_5_2162162lx1dlmrz.R.inc(1522);int crc16 = crc_in;
        
        __CLR4_5_2162162lx1dlmrz.R.inc(1523);for (int i = 0; (((i < buf.remaining())&&(__CLR4_5_2162162lx1dlmrz.R.iget(1524)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1525)==0&false)); i++) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1526);crc16 = table[(crc16 ^ buf.get(i)) & 0xff] ^ (crc16 >> 8);
        }

        }__CLR4_5_2162162lx1dlmrz.R.inc(1527);return crc16 & 0xFFFF;
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static int crc16Ccitt(ByteBuffer buf) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1528);
        __CLR4_5_2162162lx1dlmrz.R.inc(1529);return crc16Reflected(buf, crc16CcittStart, crc16CcittTableReverse) ^ crc16CcittXorout;
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static int crc16X25Ccitt(ByteBuffer buf) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1530);
        __CLR4_5_2162162lx1dlmrz.R.inc(1531);return crc16Unreflected(buf, crc16CcittStart, crc16CcittTable);
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static int crc16CcittSeed(ByteBuffer buf, int seed) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1532);
        __CLR4_5_2162162lx1dlmrz.R.inc(1533);return crc16Reflected(buf, seed, crc16CcittTableReverse) ^ crc16CcittXorout;
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static int crc32(ByteBuffer buf) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1534);
        __CLR4_5_2162162lx1dlmrz.R.inc(1535);CRC32 checksum = new CRC32();
        __CLR4_5_2162162lx1dlmrz.R.inc(1536);for (int i = 0; (((i < buf.remaining())&&(__CLR4_5_2162162lx1dlmrz.R.iget(1537)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1538)==0&false)); i++) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1539);checksum.update(buf.get(i));
        }
        }__CLR4_5_2162162lx1dlmrz.R.inc(1540);return (int) checksum.getValue();
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static int xorChecksum(ByteBuffer buf) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1541);
        __CLR4_5_2162162lx1dlmrz.R.inc(1542);int checksum = 0;
        __CLR4_5_2162162lx1dlmrz.R.inc(1543);for (int i = 0; (((i < buf.remaining())&&(__CLR4_5_2162162lx1dlmrz.R.iget(1544)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1545)==0&false)); i++) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1546);checksum ^= buf.get(i);
        }
        }__CLR4_5_2162162lx1dlmrz.R.inc(1547);return checksum;
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}
    
    public static String nmeaChecksum(String msg) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1548);
        __CLR4_5_2162162lx1dlmrz.R.inc(1549);int checksum = 0;
        __CLR4_5_2162162lx1dlmrz.R.inc(1550);byte bytes[] = msg.getBytes(Charset.defaultCharset());
        __CLR4_5_2162162lx1dlmrz.R.inc(1551);for (int i = 1; (((i < msg.length())&&(__CLR4_5_2162162lx1dlmrz.R.iget(1552)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1553)==0&false)); i++) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1554);checksum ^= bytes[i];
        }
        }__CLR4_5_2162162lx1dlmrz.R.inc(1555);return String.format("*%02x", checksum).toUpperCase();
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}

    public static String luhnChecksum(String s) {try{__CLR4_5_2162162lx1dlmrz.R.inc(1556);
        __CLR4_5_2162162lx1dlmrz.R.inc(1557);int sum = 0;
        __CLR4_5_2162162lx1dlmrz.R.inc(1558);boolean evenPosition = true;
        __CLR4_5_2162162lx1dlmrz.R.inc(1559);for (int i = s.length() - 1; (((i >= 0)&&(__CLR4_5_2162162lx1dlmrz.R.iget(1560)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1561)==0&false)); i--) {{
            __CLR4_5_2162162lx1dlmrz.R.inc(1562);int n = Integer.parseInt(s.substring(i, i + 1));
            __CLR4_5_2162162lx1dlmrz.R.inc(1563);if ((((evenPosition)&&(__CLR4_5_2162162lx1dlmrz.R.iget(1564)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1565)==0&false))) {{
                __CLR4_5_2162162lx1dlmrz.R.inc(1566);n *= 2;
                __CLR4_5_2162162lx1dlmrz.R.inc(1567);if ((((n > 9)&&(__CLR4_5_2162162lx1dlmrz.R.iget(1568)!=0|true))||(__CLR4_5_2162162lx1dlmrz.R.iget(1569)==0&false))) {{
                    __CLR4_5_2162162lx1dlmrz.R.inc(1570);n = (n % 10) + 1;
                }
            }}
            }__CLR4_5_2162162lx1dlmrz.R.inc(1571);sum += n;
            __CLR4_5_2162162lx1dlmrz.R.inc(1572);evenPosition = !evenPosition;
        }
        }__CLR4_5_2162162lx1dlmrz.R.inc(1573);return String.valueOf(10 - sum % 10);
    }finally{__CLR4_5_2162162lx1dlmrz.R.flushNeeded();}}    
    
}
