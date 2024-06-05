/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.*;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class GalileoProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_23bm3bmlx1do9c5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564691234L,8589935092L,4413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GalileoProtocolDecoder(GalileoProtocol protocol) {
        super(protocol);__CLR4_5_23bm3bmlx1do9c5.R.inc(4307);try{__CLR4_5_23bm3bmlx1do9c5.R.inc(4306);
    }finally{__CLR4_5_23bm3bmlx1do9c5.R.flushNeeded();}}

    private static final int TAG_IMEI = 0x03;
    private static final int TAG_DATE = 0x20;
    private static final int TAG_COORDINATES = 0x30;
    private static final int TAG_SPEED_COURSE = 0x33;
    private static final int TAG_ALTITUDE = 0x34;
    private static final int TAG_STATUS = 0x40;
    private static final int TAG_POWER = 0x41;
    private static final int TAG_BATTERY = 0x42;
    private static final int TAG_ODOMETER = 0xd4;
    private static final int TAG_REFRIGERATOR = 0x5b;
    private static final int TAG_PRESSURE = 0x5c;
    
    private static final Map<Integer, Integer> tagLengthMap = new HashMap<Integer, Integer>();
    
    static {try{__CLR4_5_23bm3bmlx1do9c5.R.inc(4308);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4309);int[] l1 = {0x01,0x02,0x35,0x43,0xc4,0xc5,0xc6,0xc7,0xc8,0xc9,0xca,0xcb,0xcc,0xcd,0xce,0xcf,0xd0,0xd1,0xd2,0xd5,0x88,0x8a,0x8b,0x8c,0xa0,0xaf,0xa1,0xa2,0xa3,0xa4,0xa5,0xa6,0xa7,0xa8,0xa9,0xaa,0xab,0xac,0xad,0xae};
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4310);int[] l2 = {0x04,0x10,0x34,0x40,0x41,0x42,0x45,0x46,0x50,0x51,0x52,0x53,0x54,0x55,0x56,0x57,0x58,0x59,0x60,0x61,0x62,0x70,0x71,0x72,0x73,0x74,0x75,0x76,0x77,0xb0,0xb1,0xb2,0xb3,0xb4,0xb5,0xb6,0xb7,0xb8,0xb9,0xd6,0xd7,0xd8,0xd9,0xda};
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4311);int[] l3 = {0x63,0x64,0x6f,0x5d,0x65,0x66,0x67,0x68,0x69,0x6a,0x6b,0x6c,0x6d,0x6e};
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4312);int[] l4 = {0x20,0x33,0x44,0x90,0xc0,0xc1,0xc2,0xc3,0xd3,0xd4,0xdb,0xdc,0xdd,0xde,0xdf,0xf0,0xf9,0x5a,0x47,0xf1,0xf2,0xf3,0xf4,0xf5,0xf6,0xf7,0xf8};
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4313);for (int i : l1) {{ __CLR4_5_23bm3bmlx1do9c5.R.inc(4314);tagLengthMap.put(i, 1); }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4315);for (int i : l2) {{ __CLR4_5_23bm3bmlx1do9c5.R.inc(4316);tagLengthMap.put(i, 2); }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4317);for (int i : l3) {{ __CLR4_5_23bm3bmlx1do9c5.R.inc(4318);tagLengthMap.put(i, 3); }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4319);for (int i : l4) {{ __CLR4_5_23bm3bmlx1do9c5.R.inc(4320);tagLengthMap.put(i, 4); }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4321);tagLengthMap.put(TAG_COORDINATES, 9);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4322);tagLengthMap.put(TAG_IMEI, 15);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4323);tagLengthMap.put(TAG_REFRIGERATOR, 7); // variable length
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4324);tagLengthMap.put(TAG_PRESSURE, 68);
    }finally{__CLR4_5_23bm3bmlx1do9c5.R.flushNeeded();}}

    private static int getTagLength(int tag) {try{__CLR4_5_23bm3bmlx1do9c5.R.inc(4325);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4326);return tagLengthMap.get(tag);
    }finally{__CLR4_5_23bm3bmlx1do9c5.R.flushNeeded();}}

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_23bm3bmlx1do9c5.R.inc(4327);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4328);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4329);reply.writeByte(0x02);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4330);reply.writeShort((short) checksum);
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4331);if ((((channel != null)&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4332)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4333)==0&false))) {{
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4334);channel.write(reply);
        }
    }}finally{__CLR4_5_23bm3bmlx1do9c5.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_23bm3bmlx1do9c5.R.inc(4335);

        __CLR4_5_23bm3bmlx1do9c5.R.inc(4336);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4337);buf.readUnsignedByte(); // header
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4338);int length = (buf.readUnsignedShort() & 0x7fff) + 3;
        
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4339);List<Position> positions = new LinkedList<Position>();
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4340);Set<Integer> tags = new HashSet<Integer>();
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4341);boolean hasLocation = false;
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4342);Position position = new Position();
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4343);position.setProtocol(getProtocolName());
        
        __CLR4_5_23bm3bmlx1do9c5.R.inc(4344);while ((((buf.readerIndex() < length)&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4345)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4346)==0&false))) {{

            // Check if new message started
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4347);int tag = buf.readUnsignedByte();
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4348);if ((((tags.contains(tag))&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4349)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4350)==0&false))) {{
                __CLR4_5_23bm3bmlx1do9c5.R.inc(4351);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4352)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4353)==0&false))) {{
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4354);positions.add(position);
                }
                }__CLR4_5_23bm3bmlx1do9c5.R.inc(4355);tags.clear();
                __CLR4_5_23bm3bmlx1do9c5.R.inc(4356);hasLocation = false;
                __CLR4_5_23bm3bmlx1do9c5.R.inc(4357);position = new Position();
            }
            }__CLR4_5_23bm3bmlx1do9c5.R.inc(4358);tags.add(tag);
            
            boolean __CLB4_5_2_bool0=false;__CLR4_5_23bm3bmlx1do9c5.R.inc(4359);switch (tag) {

                case TAG_IMEI:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4360);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4361);String imei = buf.toString(buf.readerIndex(), 15, Charset.defaultCharset());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4362);buf.skipBytes(imei.length());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4363);identify(imei, channel);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4364);break;

                case TAG_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4365);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4366);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4367);break;
                    
                case TAG_COORDINATES:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4368);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4369);hasLocation = true;
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4370);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4371);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4372);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4373);break;
                    
                case TAG_SPEED_COURSE:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4374);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4375);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4376);position.setCourse(buf.readUnsignedShort() * 0.1);
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4377);break;
                    
                case TAG_ALTITUDE:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4378);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4379);position.setAltitude(buf.readShort());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4380);break;
                    
                case TAG_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4381);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4382);position.set(Event.KEY_STATUS, buf.readUnsignedShort());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4383);break;
                    
                case TAG_POWER:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4384);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4385);position.set(Event.KEY_POWER, buf.readUnsignedShort());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4386);break;
                    
                case TAG_BATTERY:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4387);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4388);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4389);break;
                    
                case TAG_ODOMETER:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4390);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4391);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4392);break;
                    
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_23bm3bmlx1do9c5.R.inc(4393);__CLB4_5_2_bool0=true;}
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4394);buf.skipBytes(getTagLength(tag));
                    __CLR4_5_23bm3bmlx1do9c5.R.inc(4395);break;
                    
            }
        }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4396);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4397)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4398)==0&false))) {{
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4399);positions.add(position);
        }
        
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4400);if ((((!hasDeviceId())&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4401)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4402)==0&false))) {{
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4403);Log.warning("Unknown device");
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4404);return null;
        }

        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4405);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_23bm3bmlx1do9c5.R.inc(4406);for (Position p : positions) {{
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4407);p.setDeviceId(getDeviceId());
        }

        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4408);if ((((positions.isEmpty())&&(__CLR4_5_23bm3bmlx1do9c5.R.iget(4409)!=0|true))||(__CLR4_5_23bm3bmlx1do9c5.R.iget(4410)==0&false))) {{
            __CLR4_5_23bm3bmlx1do9c5.R.inc(4411);return null;
        }
        }__CLR4_5_23bm3bmlx1do9c5.R.inc(4412);return positions;
    }finally{__CLR4_5_23bm3bmlx1do9c5.R.flushNeeded();}}

}
