/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@java.lang.SuppressWarnings({"fallthrough"}) public class GalileoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_28s68s6lwye3zhb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,11605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GalileoProtocolDecoder(GalileoProtocol protocol) {
        super(protocol);__CLR4_5_28s68s6lwye3zhb.R.inc(11383);try{__CLR4_5_28s68s6lwye3zhb.R.inc(11382);
    }finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

    private static final Map<Integer, Integer> TAG_LENGTH_MAP = new HashMap<>();

    static {try{__CLR4_5_28s68s6lwye3zhb.R.inc(11384);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11385);int[] l1 = {
            0x01, 0x02, 0x35, 0x43, 0xc4, 0xc5, 0xc6, 0xc7,
            0xc8, 0xc9, 0xca, 0xcb, 0xcc, 0xcd, 0xce, 0xcf,
            0xd0, 0xd1, 0xd2, 0xd5, 0x88, 0x8a, 0x8b, 0x8c,
            0xa0, 0xaf, 0xa1, 0xa2, 0xa3, 0xa4, 0xa5, 0xa6,
            0xa7, 0xa8, 0xa9, 0xaa, 0xab, 0xac, 0xad, 0xae
        };
        __CLR4_5_28s68s6lwye3zhb.R.inc(11386);int[] l2 = {
            0x04, 0x10, 0x34, 0x40, 0x41, 0x42, 0x45, 0x46,
            0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x60, 0x61,
            0x62, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76,
            0x77, 0xb0, 0xb1, 0xb2, 0xb3, 0xb4, 0xb5, 0xb6,
            0xb7, 0xb8, 0xb9, 0xd6, 0xd7, 0xd8, 0xd9, 0xda
        };
        __CLR4_5_28s68s6lwye3zhb.R.inc(11387);int[] l3 = {
            0x63, 0x64, 0x6f, 0x5d, 0x65, 0x66, 0x67, 0x68,
            0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6e
        };
        __CLR4_5_28s68s6lwye3zhb.R.inc(11388);int[] l4 = {
            0x20, 0x33, 0x44, 0x90, 0xc0, 0xc2, 0xc3, 0xd3,
            0xd4, 0xdb, 0xdc, 0xdd, 0xde, 0xdf, 0xf0, 0xf9,
            0x5a, 0x47, 0xf1, 0xf2, 0xf3, 0xf4, 0xf5, 0xf6,
            0xf7, 0xf8, 0xe2, 0xe9
        };
        __CLR4_5_28s68s6lwye3zhb.R.inc(11389);for (int i : l1) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11390);TAG_LENGTH_MAP.put(i, 1);
        }
        }__CLR4_5_28s68s6lwye3zhb.R.inc(11391);for (int i : l2) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11392);TAG_LENGTH_MAP.put(i, 2);
        }
        }__CLR4_5_28s68s6lwye3zhb.R.inc(11393);for (int i : l3) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11394);TAG_LENGTH_MAP.put(i, 3);
        }
        }__CLR4_5_28s68s6lwye3zhb.R.inc(11395);for (int i : l4) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11396);TAG_LENGTH_MAP.put(i, 4);
        }
        }__CLR4_5_28s68s6lwye3zhb.R.inc(11397);TAG_LENGTH_MAP.put(0x5b, 7); // variable length
        __CLR4_5_28s68s6lwye3zhb.R.inc(11398);TAG_LENGTH_MAP.put(0x5c, 68);
    }finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

    private static int getTagLength(int tag) {try{__CLR4_5_28s68s6lwye3zhb.R.inc(11399);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11400);Integer length = TAG_LENGTH_MAP.get(tag);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11401);if ((((length == null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11402)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11403)==0&false))) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11404);throw new IllegalArgumentException("Unknown tag: " + tag);
        }
        }__CLR4_5_28s68s6lwye3zhb.R.inc(11405);return length;
    }finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_28s68s6lwye3zhb.R.inc(11406);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11407);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11408);reply.writeByte(0x02);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11409);reply.writeShort((short) checksum);
        __CLR4_5_28s68s6lwye3zhb.R.inc(11410);if ((((channel != null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11411)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11412)==0&false))) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11413);channel.write(reply);
        }
    }}finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

    private void decodeTag(Position position, ChannelBuffer buf, int tag) {try{__CLR4_5_28s68s6lwye3zhb.R.inc(11414);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_28s68s6lwye3zhb.R.inc(11415);switch (tag) {
            case 0x01:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11416);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11417);position.set(Position.KEY_VERSION_HW, buf.readUnsignedByte());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11418);break;
            case 0x02:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11419);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11420);position.set(Position.KEY_VERSION_FW, buf.readUnsignedByte());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11421);break;
            case 0x04:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11422);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11423);position.set("deviceId", buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11424);break;
            case 0x10:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11425);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11426);position.set(Position.KEY_INDEX, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11427);break;
            case 0x20:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11428);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11429);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                __CLR4_5_28s68s6lwye3zhb.R.inc(11430);break;
            case 0x33:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11431);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11432);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11433);position.setCourse(buf.readUnsignedShort() * 0.1);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11434);break;
            case 0x34:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11435);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11436);position.setAltitude(buf.readShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11437);break;
            case 0x40:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11438);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11439);position.set(Position.KEY_STATUS, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11440);break;
            case 0x41:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11441);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11442);position.set(Position.KEY_POWER, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11443);break;
            case 0x42:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11444);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11445);position.set(Position.KEY_BATTERY, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11446);break;
            case 0x43:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11447);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11448);position.set(Position.KEY_DEVICE_TEMP, buf.readByte());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11449);break;
            case 0x44:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11450);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11451);position.set(Position.KEY_ACCELERATION, buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11452);break;
            case 0x45:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11453);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11454);position.set(Position.KEY_OUTPUT, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11455);break;
            case 0x46:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11456);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11457);position.set(Position.KEY_INPUT, buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11458);break;
            case 0x50:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11459);__CLB4_5_2_bool0=true;}
            case 0x51:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11460);__CLB4_5_2_bool0=true;}
            case 0x52:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11461);__CLB4_5_2_bool0=true;}
            case 0x53:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11462);__CLB4_5_2_bool0=true;}
            case 0x54:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11463);__CLB4_5_2_bool0=true;}
            case 0x55:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11464);__CLB4_5_2_bool0=true;}
            case 0x56:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11465);__CLB4_5_2_bool0=true;}
            case 0x57:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11466);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11467);position.set(Position.PREFIX_ADC + (tag - 0x50), buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11468);break;
            case 0x58:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11469);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11470);position.set("rs2320", buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11471);break;
            case 0x59:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11472);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11473);position.set("rs2321", buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11474);break;
            case 0xc0:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11475);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11476);position.set("fuelTotal", buf.readUnsignedInt() * 0.5);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11477);break;
            case 0xc1:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11478);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11479);position.set(Position.KEY_FUEL_LEVEL, buf.readUnsignedByte() * 0.4);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11480);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedByte() - 40);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11481);position.set(Position.KEY_RPM, buf.readUnsignedShort() * 0.125);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11482);break;
            case 0xc2:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11483);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11484);position.set("canB0", buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11485);break;
            case 0xc3:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11486);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11487);position.set("canB1", buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11488);break;
            case 0xc4:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11489);__CLB4_5_2_bool0=true;}
            case 0xc5:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11490);__CLB4_5_2_bool0=true;}
            case 0xc6:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11491);__CLB4_5_2_bool0=true;}
            case 0xc7:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11492);__CLB4_5_2_bool0=true;}
            case 0xc8:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11493);__CLB4_5_2_bool0=true;}
            case 0xc9:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11494);__CLB4_5_2_bool0=true;}
            case 0xca:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11495);__CLB4_5_2_bool0=true;}
            case 0xcb:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11496);__CLB4_5_2_bool0=true;}
            case 0xcc:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11497);__CLB4_5_2_bool0=true;}
            case 0xcd:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11498);__CLB4_5_2_bool0=true;}
            case 0xce:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11499);__CLB4_5_2_bool0=true;}
            case 0xcf:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11500);__CLB4_5_2_bool0=true;}
            case 0xd0:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11501);__CLB4_5_2_bool0=true;}
            case 0xd1:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11502);__CLB4_5_2_bool0=true;}
            case 0xd2:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11503);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11504);position.set("can8Bit" + (tag - 0xc4), buf.readUnsignedByte());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11505);break;
            case 0xd6:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11506);__CLB4_5_2_bool0=true;}
            case 0xd7:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11507);__CLB4_5_2_bool0=true;}
            case 0xd8:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11508);__CLB4_5_2_bool0=true;}
            case 0xd9:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11509);__CLB4_5_2_bool0=true;}
            case 0xda:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11510);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11511);position.set("can16Bit" + (tag - 0xd6), buf.readUnsignedShort());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11512);break;
            case 0xdb:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11513);__CLB4_5_2_bool0=true;}
            case 0xdc:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11514);__CLB4_5_2_bool0=true;}
            case 0xdd:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11515);__CLB4_5_2_bool0=true;}
            case 0xde:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11516);__CLB4_5_2_bool0=true;}
            case 0xdf:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11517);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11518);position.set("can32Bit" + (tag - 0xdb), buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11519);break;
            case 0xd4:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11520);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11521);position.set(Position.KEY_ODOMETER, buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11522);break;
            case 0xe0:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11523);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11524);position.set(Position.KEY_INDEX, buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11525);break;
            case 0xe1:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11526);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11527);position.set(Position.KEY_RESULT,
                        buf.readBytes(buf.readUnsignedByte()).toString(StandardCharsets.US_ASCII));
                __CLR4_5_28s68s6lwye3zhb.R.inc(11528);break;
            case 0xe2:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11529);__CLB4_5_2_bool0=true;}
            case 0xe3:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11530);__CLB4_5_2_bool0=true;}
            case 0xe4:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11531);__CLB4_5_2_bool0=true;}
            case 0xe5:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11532);__CLB4_5_2_bool0=true;}
            case 0xe6:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11533);__CLB4_5_2_bool0=true;}
            case 0xe7:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11534);__CLB4_5_2_bool0=true;}
            case 0xe8:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11535);__CLB4_5_2_bool0=true;}
            case 0xe9:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11536);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11537);position.set("userData" + (tag - 0xe2), buf.readUnsignedInt());
                __CLR4_5_28s68s6lwye3zhb.R.inc(11538);break;
            case 0xea:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11539);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11540);position.set("userDataArray", ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedByte())));
                __CLR4_5_28s68s6lwye3zhb.R.inc(11541);break;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_28s68s6lwye3zhb.R.inc(11542);__CLB4_5_2_bool0=true;}
                __CLR4_5_28s68s6lwye3zhb.R.inc(11543);buf.skipBytes(getTagLength(tag));
                __CLR4_5_28s68s6lwye3zhb.R.inc(11544);break;
        }
    }finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_28s68s6lwye3zhb.R.inc(11545);

        __CLR4_5_28s68s6lwye3zhb.R.inc(11546);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_28s68s6lwye3zhb.R.inc(11547);buf.readUnsignedByte(); // header
        __CLR4_5_28s68s6lwye3zhb.R.inc(11548);int length = (buf.readUnsignedShort() & 0x7fff) + 3;

        __CLR4_5_28s68s6lwye3zhb.R.inc(11549);List<Position> positions = new LinkedList<>();
        __CLR4_5_28s68s6lwye3zhb.R.inc(11550);Set<Integer> tags = new HashSet<>();
        __CLR4_5_28s68s6lwye3zhb.R.inc(11551);boolean hasLocation = false;

        __CLR4_5_28s68s6lwye3zhb.R.inc(11552);DeviceSession deviceSession = null;
        __CLR4_5_28s68s6lwye3zhb.R.inc(11553);Position position = new Position();

        __CLR4_5_28s68s6lwye3zhb.R.inc(11554);while ((((buf.readerIndex() < length)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11555)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11556)==0&false))) {{

            // Check if new message started
            __CLR4_5_28s68s6lwye3zhb.R.inc(11557);int tag = buf.readUnsignedByte();
            __CLR4_5_28s68s6lwye3zhb.R.inc(11558);if ((((tags.contains(tag))&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11559)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11560)==0&false))) {{
                __CLR4_5_28s68s6lwye3zhb.R.inc(11561);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11562)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11563)==0&false))) {{
                    __CLR4_5_28s68s6lwye3zhb.R.inc(11564);positions.add(position);
                }
                }__CLR4_5_28s68s6lwye3zhb.R.inc(11565);tags.clear();
                __CLR4_5_28s68s6lwye3zhb.R.inc(11566);hasLocation = false;
                __CLR4_5_28s68s6lwye3zhb.R.inc(11567);position = new Position();
            }
            }__CLR4_5_28s68s6lwye3zhb.R.inc(11568);tags.add(tag);

            __CLR4_5_28s68s6lwye3zhb.R.inc(11569);if ((((tag == 0x03)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11570)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11571)==0&false))) {{
                __CLR4_5_28s68s6lwye3zhb.R.inc(11572);deviceSession = getDeviceSession(
                        channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));
            } }else {__CLR4_5_28s68s6lwye3zhb.R.inc(11573);if ((((tag == 0x30)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11574)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11575)==0&false))) {{
                __CLR4_5_28s68s6lwye3zhb.R.inc(11576);hasLocation = true;
                __CLR4_5_28s68s6lwye3zhb.R.inc(11577);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11578);position.setLatitude(buf.readInt() / 1000000.0);
                __CLR4_5_28s68s6lwye3zhb.R.inc(11579);position.setLongitude(buf.readInt() / 1000000.0);
            } }else {{
                __CLR4_5_28s68s6lwye3zhb.R.inc(11580);decodeTag(position, buf, tag);
            }

        }}}

        }__CLR4_5_28s68s6lwye3zhb.R.inc(11581);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11582)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11583)==0&false))) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11584);positions.add(position);
        } }else {__CLR4_5_28s68s6lwye3zhb.R.inc(11585);if ((((position.getAttributes().containsKey(Position.KEY_RESULT))&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11586)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11587)==0&false))) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11588);getLastLocation(position, null);
            __CLR4_5_28s68s6lwye3zhb.R.inc(11589);positions.add(position);
        }

        }}__CLR4_5_28s68s6lwye3zhb.R.inc(11590);if ((((deviceSession == null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11591)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11592)==0&false))) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11593);deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_28s68s6lwye3zhb.R.inc(11594);if ((((deviceSession == null)&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11595)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11596)==0&false))) {{
                __CLR4_5_28s68s6lwye3zhb.R.inc(11597);return null;
            }
        }}

        }__CLR4_5_28s68s6lwye3zhb.R.inc(11598);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_28s68s6lwye3zhb.R.inc(11599);for (Position p : positions) {{
            __CLR4_5_28s68s6lwye3zhb.R.inc(11600);p.setProtocol(getProtocolName());
            __CLR4_5_28s68s6lwye3zhb.R.inc(11601);p.setDeviceId(deviceSession.getDeviceId());
        }

        }__CLR4_5_28s68s6lwye3zhb.R.inc(11602);return (((positions.isEmpty() )&&(__CLR4_5_28s68s6lwye3zhb.R.iget(11603)!=0|true))||(__CLR4_5_28s68s6lwye3zhb.R.iget(11604)==0&false))? null : positions;
    }finally{__CLR4_5_28s68s6lwye3zhb.R.flushNeeded();}}

}
