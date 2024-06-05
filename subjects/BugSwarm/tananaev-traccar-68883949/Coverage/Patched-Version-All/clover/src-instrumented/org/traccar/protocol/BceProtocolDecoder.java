/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class BceProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22jk2jklx1dslrw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,3404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BceProtocolDecoder(BceProtocol protocol) {
        super(protocol);__CLR4_5_22jk2jklx1dslrw.R.inc(3297);try{__CLR4_5_22jk2jklx1dslrw.R.inc(3296);
    }finally{__CLR4_5_22jk2jklx1dslrw.R.flushNeeded();}}

    private static final int DATA_TYPE = 7;

    private static final int MSG_ASYNC_STACK = 0xA5;
    private static final int MSG_STACK_COFIRM = 0x19;
    private static final int MSG_TIME_TRIGGERED = 0xA0;
    private static final int MSG_OUTPUT_CONTROL = 0x41;
    private static final int MSG_OUTPUT_CONTROL_ACK = 0xC1;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_22jk2jklx1dslrw.R.inc(3298);

        __CLR4_5_22jk2jklx1dslrw.R.inc(3299);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_22jk2jklx1dslrw.R.inc(3300);String imei = String.format("%015d", buf.readLong());
        __CLR4_5_22jk2jklx1dslrw.R.inc(3301);if ((((!identify(imei, channel))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3302)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3303)==0&false))) {{
            __CLR4_5_22jk2jklx1dslrw.R.inc(3304);return null;
        }

        }__CLR4_5_22jk2jklx1dslrw.R.inc(3305);List<Position> positions = new LinkedList<Position>();

        __CLR4_5_22jk2jklx1dslrw.R.inc(3306);while ((((buf.readableBytes() > 1)&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3307)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3308)==0&false))) {{

            __CLR4_5_22jk2jklx1dslrw.R.inc(3309);int dataEnd = buf.readUnsignedShort() + buf.readerIndex();
            __CLR4_5_22jk2jklx1dslrw.R.inc(3310);int type = buf.readUnsignedByte();
            __CLR4_5_22jk2jklx1dslrw.R.inc(3311);int confirmKey = buf.readUnsignedByte() & 0x7F;

            __CLR4_5_22jk2jklx1dslrw.R.inc(3312);while ((((buf.readerIndex() < dataEnd)&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3313)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3314)==0&false))) {{

                __CLR4_5_22jk2jklx1dslrw.R.inc(3315);Position position = new Position();
                __CLR4_5_22jk2jklx1dslrw.R.inc(3316);position.setProtocol(getProtocolName());
                __CLR4_5_22jk2jklx1dslrw.R.inc(3317);position.setDeviceId(getDeviceId());

                __CLR4_5_22jk2jklx1dslrw.R.inc(3318);int structEnd = buf.readUnsignedByte() + buf.readerIndex();

                __CLR4_5_22jk2jklx1dslrw.R.inc(3319);long time = buf.readUnsignedInt();
                __CLR4_5_22jk2jklx1dslrw.R.inc(3320);if (((((time & 0x0f) == DATA_TYPE)&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3321)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3322)==0&false))) {{

                    __CLR4_5_22jk2jklx1dslrw.R.inc(3323);time = time >> 4 << 1;
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3324);time += 0x47798280; // 01/01/2008
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3325);position.setTime(new Date(time * 1000));

                    // Read masks
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3326);int mask;
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3327);List<Integer> masks = new LinkedList<Integer>();
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3328);do {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3329);mask = buf.readUnsignedShort();
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3330);masks.add(mask);
                    } }while ((((BitUtil.check(mask, 15))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3331)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3332)==0&false)));

                    __CLR4_5_22jk2jklx1dslrw.R.inc(3333);mask = masks.get(0);

                    __CLR4_5_22jk2jklx1dslrw.R.inc(3334);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3335)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3336)==0&false))) {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3337);position.setValid(true);
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3338);position.setLongitude(buf.readFloat());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3339);position.setLatitude(buf.readFloat());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3340);position.setSpeed(buf.readUnsignedByte());

                        __CLR4_5_22jk2jklx1dslrw.R.inc(3341);int gps = buf.readUnsignedByte();
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3342);position.set(Event.KEY_SATELLITES, gps & 0xf);
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3343);position.set(Event.KEY_HDOP, gps >> 4);

                        __CLR4_5_22jk2jklx1dslrw.R.inc(3344);position.setCourse(buf.readUnsignedByte());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3345);position.setAltitude(buf.readUnsignedShort());

                        __CLR4_5_22jk2jklx1dslrw.R.inc(3346);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
                    }

                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3347);if ((((BitUtil.check(mask, 1))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3348)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3349)==0&false))) {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3350);position.set(Event.KEY_INPUT, buf.readUnsignedShort());
                    }

                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3351);for (int i = 1; (((i <= 8)&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3352)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3353)==0&false)); i++) {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3354);if ((((BitUtil.check(mask, i + 1))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3355)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3356)==0&false))) {{
                            __CLR4_5_22jk2jklx1dslrw.R.inc(3357);position.set(Event.PREFIX_ADC + i, buf.readUnsignedShort());
                        }
                    }}

                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3358);if ((((BitUtil.check(mask, 10))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3359)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3360)==0&false))) {__CLR4_5_22jk2jklx1dslrw.R.inc(3361);buf.skipBytes(4);
                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3362);if ((((BitUtil.check(mask, 11))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3363)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3364)==0&false))) {__CLR4_5_22jk2jklx1dslrw.R.inc(3365);buf.skipBytes(4);
                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3366);if ((((BitUtil.check(mask, 12))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3367)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3368)==0&false))) {__CLR4_5_22jk2jklx1dslrw.R.inc(3369);buf.skipBytes(2);
                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3370);if ((((BitUtil.check(mask, 13))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3371)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3372)==0&false))) {__CLR4_5_22jk2jklx1dslrw.R.inc(3373);buf.skipBytes(2);

                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3374);if ((((BitUtil.check(mask, 14))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3375)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3376)==0&false))) {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3377);position.set(Event.KEY_MCC, buf.readUnsignedShort());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3378);position.set(Event.KEY_MNC, buf.readUnsignedByte());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3379);position.set(Event.KEY_LAC, buf.readUnsignedShort());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3380);position.set(Event.KEY_CELL, buf.readUnsignedShort());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3381);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3382);buf.readUnsignedByte();
                    }

                    }__CLR4_5_22jk2jklx1dslrw.R.inc(3383);if ((((BitUtil.check(mask, 0))&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3384)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3385)==0&false))) {{
                        __CLR4_5_22jk2jklx1dslrw.R.inc(3386);positions.add(position);
                    }
                }}

                }__CLR4_5_22jk2jklx1dslrw.R.inc(3387);buf.readerIndex(structEnd);
            }

            // Send response
            }__CLR4_5_22jk2jklx1dslrw.R.inc(3388);if ((((type == MSG_ASYNC_STACK && channel != null)&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3389)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3390)==0&false))) {{
                __CLR4_5_22jk2jklx1dslrw.R.inc(3391);ChannelBuffer response = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, 8 + 2 + 2 + 1);
                __CLR4_5_22jk2jklx1dslrw.R.inc(3392);response.writeLong(Long.valueOf(imei));
                __CLR4_5_22jk2jklx1dslrw.R.inc(3393);response.writeShort(2);
                __CLR4_5_22jk2jklx1dslrw.R.inc(3394);response.writeByte(MSG_STACK_COFIRM);
                __CLR4_5_22jk2jklx1dslrw.R.inc(3395);response.writeByte(confirmKey);

                __CLR4_5_22jk2jklx1dslrw.R.inc(3396);int checksum = 0;
                __CLR4_5_22jk2jklx1dslrw.R.inc(3397);for (int i = 0; (((i < response.writerIndex())&&(__CLR4_5_22jk2jklx1dslrw.R.iget(3398)!=0|true))||(__CLR4_5_22jk2jklx1dslrw.R.iget(3399)==0&false)); i++) {{
                    __CLR4_5_22jk2jklx1dslrw.R.inc(3400);checksum += response.getUnsignedByte(i);
                }
                }__CLR4_5_22jk2jklx1dslrw.R.inc(3401);response.writeByte(checksum);

                __CLR4_5_22jk2jklx1dslrw.R.inc(3402);channel.write(response);
            }
        }}

        }__CLR4_5_22jk2jklx1dslrw.R.inc(3403);return positions;
    }finally{__CLR4_5_22jk2jklx1dslrw.R.flushNeeded();}}

}
