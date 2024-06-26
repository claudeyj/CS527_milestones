/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton@traccar.org)
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
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;

@java.lang.SuppressWarnings({"fallthrough"}) public final class Checksum {public static class __CLR4_5_23nc3nclx1dxmhn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,4813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Checksum() {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4728);
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    private static final int[] CRC16_CCITT_TABLE_REVERSE = {
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

    private static final int[] CRC16_CCITT_TABLE = {
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

    private static final int[] CRC16_IBM_TABLE = {
        0x0000, 0xc0c1, 0xc181, 0x0140, 0xc301, 0x03c0, 0x0280, 0xc241,
        0xc601, 0x06c0, 0x0780, 0xc741, 0x0500, 0xc5c1, 0xc481, 0x0440,
        0xcc01, 0x0cc0, 0x0d80, 0xcd41, 0x0f00, 0xcfc1, 0xce81, 0x0e40,
        0x0a00, 0xcac1, 0xcb81, 0x0b40, 0xc901, 0x09c0, 0x0880, 0xc841,
        0xd801, 0x18c0, 0x1980, 0xd941, 0x1b00, 0xdbc1, 0xda81, 0x1a40,
        0x1e00, 0xdec1, 0xdf81, 0x1f40, 0xdd01, 0x1dc0, 0x1c80, 0xdc41,
        0x1400, 0xd4c1, 0xd581, 0x1540, 0xd701, 0x17c0, 0x1680, 0xd641,
        0xd201, 0x12c0, 0x1380, 0xd341, 0x1100, 0xd1c1, 0xd081, 0x1040,
        0xf001, 0x30c0, 0x3180, 0xf141, 0x3300, 0xf3c1, 0xf281, 0x3240,
        0x3600, 0xf6c1, 0xf781, 0x3740, 0xf501, 0x35c0, 0x3480, 0xf441,
        0x3c00, 0xfcc1, 0xfd81, 0x3d40, 0xff01, 0x3fc0, 0x3e80, 0xfe41,
        0xfa01, 0x3ac0, 0x3b80, 0xfb41, 0x3900, 0xf9c1, 0xf881, 0x3840,
        0x2800, 0xe8c1, 0xe981, 0x2940, 0xeb01, 0x2bc0, 0x2a80, 0xea41,
        0xee01, 0x2ec0, 0x2f80, 0xef41, 0x2d00, 0xedc1, 0xec81, 0x2c40,
        0xe401, 0x24c0, 0x2580, 0xe541, 0x2700, 0xe7c1, 0xe681, 0x2640,
        0x2200, 0xe2c1, 0xe381, 0x2340, 0xe101, 0x21c0, 0x2080, 0xe041,
        0xa001, 0x60c0, 0x6180, 0xa141, 0x6300, 0xa3c1, 0xa281, 0x6240,
        0x6600, 0xa6c1, 0xa781, 0x6740, 0xa501, 0x65c0, 0x6480, 0xa441,
        0x6c00, 0xacc1, 0xad81, 0x6d40, 0xaf01, 0x6fc0, 0x6e80, 0xae41,
        0xaa01, 0x6ac0, 0x6b80, 0xab41, 0x6900, 0xa9c1, 0xa881, 0x6840,
        0x7800, 0xb8c1, 0xb981, 0x7940, 0xbb01, 0x7bc0, 0x7a80, 0xba41,
        0xbe01, 0x7ec0, 0x7f80, 0xbf41, 0x7d00, 0xbdc1, 0xbc81, 0x7c40,
        0xb401, 0x74c0, 0x7580, 0xb541, 0x7700, 0xb7c1, 0xb681, 0x7640,
        0x7200, 0xb2c1, 0xb381, 0x7340, 0xb101, 0x71c0, 0x7080, 0xb041,
        0x5000, 0x90c1, 0x9181, 0x5140, 0x9301, 0x53c0, 0x5280, 0x9241,
        0x9601, 0x56c0, 0x5780, 0x9741, 0x5500, 0x95c1, 0x9481, 0x5440,
        0x9c01, 0x5cc0, 0x5d80, 0x9d41, 0x5f00, 0x9fc1, 0x9e81, 0x5e40,
        0x5a00, 0x9ac1, 0x9b81, 0x5b40, 0x9901, 0x59c0, 0x5880, 0x9841,
        0x8801, 0x48c0, 0x4980, 0x8941, 0x4b00, 0x8bc1, 0x8a81, 0x4a40,
        0x4e00, 0x8ec1, 0x8f81, 0x4f40, 0x8d01, 0x4dc0, 0x4c80, 0x8c41,
        0x4400, 0x84c1, 0x8581, 0x4540, 0x8701, 0x47c0, 0x4680, 0x8641,
        0x8201, 0x42c0, 0x4380, 0x8341, 0x4100, 0x81c1, 0x8081, 0x4040,
    };

    // More info: http://reveng.sourceforge.net/crc-catalogue/16.htm
    public static final String CRC16_IBM = "IBM";
    public static final String CRC16_X25 = "X-25";
    public static final String CRC16_CCITT_FALSE = "CCITT-FALSE";
    public static final String CRC16_KERMIT = "KERMIT";
    public static final String CRC16_XMODEM = "XMODEM";
    public static final String CRC16_AUG_CCITT = "AUG-CCITT";
    public static final String CRC16_GENIBUS = "GENIBUS";
    public static final String CRC16_MCRF4XX = "MCRF4XX";

    private static int crc16Unreflected(ByteBuffer buf, int crcIn, int[] table) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4729);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4730);int crc16 = crcIn;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4731);while ((((buf.hasRemaining())&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4732)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4733)==0&false))) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4734);crc16 = table[((crc16 >> 8) ^ buf.get()) & 0xff] ^ (crc16 << 8);
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4735);return crc16 & 0xFFFF;
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    private static int crc16Reflected(ByteBuffer buf, int crcIn, int[] table) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4736);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4737);int crc16 = crcIn;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4738);while ((((buf.hasRemaining())&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4739)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4740)==0&false))) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4741);crc16 = table[(crc16 ^ buf.get()) & 0xff] ^ (crc16 >> 8);
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4742);return crc16 & 0xFFFF;
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static int crc16(String type, ByteBuffer buf) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4743);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_23nc3nclx1dxmhn.R.inc(4744);switch (type) {
            case CRC16_IBM:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4745);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4746);return crc16Reflected(buf, 0, CRC16_IBM_TABLE);
            case CRC16_X25:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4747);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4748);return crc16Reflected(buf, 0xFFFF, CRC16_CCITT_TABLE_REVERSE) ^ 0xFFFF;
            case CRC16_CCITT_FALSE:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4749);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4750);return crc16Unreflected(buf, 0xFFFF, CRC16_CCITT_TABLE);
            case CRC16_KERMIT:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4751);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4752);return crc16Reflected(buf, 0, CRC16_CCITT_TABLE_REVERSE);
            case CRC16_XMODEM:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4753);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4754);return crc16Unreflected(buf, 0, CRC16_CCITT_TABLE);
            case CRC16_AUG_CCITT:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4755);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4756);return crc16Unreflected(buf, 0x1d0f, CRC16_CCITT_TABLE);
            case CRC16_GENIBUS:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4757);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4758);return crc16Unreflected(buf, 0xFFFF, CRC16_CCITT_TABLE) ^ 0xFFFF;
            case CRC16_MCRF4XX:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4759);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4760);return crc16Reflected(buf, 0xFFFF, CRC16_CCITT_TABLE_REVERSE);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_23nc3nclx1dxmhn.R.inc(4761);__CLB4_5_2_bool0=true;}
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4762);throw new UnsupportedOperationException(type);
        }
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static int crc32(ByteBuffer buf) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4763);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4764);CRC32 checksum = new CRC32();
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4765);while ((((buf.hasRemaining())&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4766)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4767)==0&false))) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4768);checksum.update(buf.get());
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4769);return (int) checksum.getValue();
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static int xor(ByteBuffer buf) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4770);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4771);int checksum = 0;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4772);while ((((buf.hasRemaining())&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4773)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4774)==0&false))) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4775);checksum ^= buf.get();
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4776);return checksum;
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static int xor(String string) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4777);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4778);byte checksum = 0;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4779);for (byte b : string.getBytes(StandardCharsets.US_ASCII)) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4780);checksum ^= b;
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4781);return checksum;
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static String nmea(String msg) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4782);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4783);int checksum = 0;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4784);byte[] bytes = msg.getBytes(StandardCharsets.US_ASCII);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4785);for (int i = 1; (((i < bytes.length)&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4786)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4787)==0&false)); i++) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4788);checksum ^= bytes[i];
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4789);return String.format("*%02x", checksum).toUpperCase();
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static String sum(String msg) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4790);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4791);byte checksum = 0;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4792);for (byte b : msg.getBytes(StandardCharsets.US_ASCII)) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4793);checksum += b;
        }
        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4794);return String.format("%02X", checksum).toUpperCase();
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

    public static long luhn(long imei) {try{__CLR4_5_23nc3nclx1dxmhn.R.inc(4795);
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4796);long checksum = 0;
        __CLR4_5_23nc3nclx1dxmhn.R.inc(4797);long remain = imei;

        __CLR4_5_23nc3nclx1dxmhn.R.inc(4798);for (int i = 0; (((remain != 0)&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4799)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4800)==0&false)); i++) {{
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4801);long digit = remain % 10;

            __CLR4_5_23nc3nclx1dxmhn.R.inc(4802);if ((((i % 2 == 0)&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4803)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4804)==0&false))) {{
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4805);digit *= 2;
                __CLR4_5_23nc3nclx1dxmhn.R.inc(4806);if ((((digit >= 10)&&(__CLR4_5_23nc3nclx1dxmhn.R.iget(4807)!=0|true))||(__CLR4_5_23nc3nclx1dxmhn.R.iget(4808)==0&false))) {{
                    __CLR4_5_23nc3nclx1dxmhn.R.inc(4809);digit = 1 + (digit % 10);
                }
            }}

            }__CLR4_5_23nc3nclx1dxmhn.R.inc(4810);checksum += digit;
            __CLR4_5_23nc3nclx1dxmhn.R.inc(4811);remain /= 10;
        }

        }__CLR4_5_23nc3nclx1dxmhn.R.inc(4812);return (10 - (checksum % 10)) % 10;
    }finally{__CLR4_5_23nc3nclx1dxmhn.R.flushNeeded();}}

}
