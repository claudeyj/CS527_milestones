/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Vijay Kumar (vijaykumar@zilogic.com)
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

import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Log;
import org.traccar.helper.BitUtil;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class BlackKiteProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22lu2lulx1e361t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,3490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BlackKiteProtocolDecoder(BlackKiteProtocol protocol) {
        super(protocol);__CLR4_5_22lu2lulx1e361t.R.inc(3379);try{__CLR4_5_22lu2lulx1e361t.R.inc(3378);
    }finally{__CLR4_5_22lu2lulx1e361t.R.flushNeeded();}}

    private static final int TAG_IMEI = 0x03;
    private static final int TAG_DATE = 0x20;
    private static final int TAG_COORDINATES = 0x30;
    private static final int TAG_SPEED_COURSE = 0x33;
    private static final int TAG_ALTITUDE = 0x34;
    private static final int TAG_STATUS = 0x40;
    private static final int TAG_DIGITAL_OUTPUTS = 0x45;
    private static final int TAG_DIGITAL_INPUTS = 0x46;
    private static final int TAG_INPUT_VOLTAGE1 = 0x50;
    private static final int TAG_INPUT_VOLTAGE2 = 0x51;
    private static final int TAG_INPUT_VOLTAGE3 = 0x52;
    private static final int TAG_INPUT_VOLTAGE4 = 0x53;
    private static final int TAG_XT1 = 0x60;
    private static final int TAG_XT2 = 0x61;
    private static final int TAG_XT3 = 0x62;

    private void sendReply(Channel channel, int checksum) {try{__CLR4_5_22lu2lulx1e361t.R.inc(3380);
        __CLR4_5_22lu2lulx1e361t.R.inc(3381);ChannelBuffer reply = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 3);
        __CLR4_5_22lu2lulx1e361t.R.inc(3382);reply.writeByte(0x02);
        __CLR4_5_22lu2lulx1e361t.R.inc(3383);reply.writeShort((short) checksum);
        __CLR4_5_22lu2lulx1e361t.R.inc(3384);if ((((channel != null)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3385)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3386)==0&false))) {{
            __CLR4_5_22lu2lulx1e361t.R.inc(3387);channel.write(reply);
        }
    }}finally{__CLR4_5_22lu2lulx1e361t.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22lu2lulx1e361t.R.inc(3388);

        __CLR4_5_22lu2lulx1e361t.R.inc(3389);ChannelBuffer buf = (ChannelBuffer) msg;
        
        __CLR4_5_22lu2lulx1e361t.R.inc(3390);buf.readUnsignedByte(); // header
        __CLR4_5_22lu2lulx1e361t.R.inc(3391);int length = (buf.readUnsignedShort() & 0x7fff) + 3;
        
        __CLR4_5_22lu2lulx1e361t.R.inc(3392);List<Position> positions = new LinkedList<>();
        __CLR4_5_22lu2lulx1e361t.R.inc(3393);Set<Integer> tags = new HashSet<>();
        __CLR4_5_22lu2lulx1e361t.R.inc(3394);boolean hasLocation = false;
        __CLR4_5_22lu2lulx1e361t.R.inc(3395);Position position = new Position();
        __CLR4_5_22lu2lulx1e361t.R.inc(3396);position.setProtocol(getProtocolName());
        
        __CLR4_5_22lu2lulx1e361t.R.inc(3397);while ((((buf.readerIndex() < length)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3398)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3399)==0&false))) {{

            // Check if new message started
            __CLR4_5_22lu2lulx1e361t.R.inc(3400);int tag = buf.readUnsignedByte();
            __CLR4_5_22lu2lulx1e361t.R.inc(3401);if ((((tags.contains(tag))&&(__CLR4_5_22lu2lulx1e361t.R.iget(3402)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3403)==0&false))) {{
                __CLR4_5_22lu2lulx1e361t.R.inc(3404);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3405)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3406)==0&false))) {{
                    __CLR4_5_22lu2lulx1e361t.R.inc(3407);positions.add(position);
                }
                }__CLR4_5_22lu2lulx1e361t.R.inc(3408);tags.clear();
                __CLR4_5_22lu2lulx1e361t.R.inc(3409);hasLocation = false;
                __CLR4_5_22lu2lulx1e361t.R.inc(3410);position = new Position();
            }
            }__CLR4_5_22lu2lulx1e361t.R.inc(3411);tags.add(tag);
            
            boolean __CLB4_5_2_bool0=false;__CLR4_5_22lu2lulx1e361t.R.inc(3412);switch (tag) {

                case TAG_IMEI:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3413);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3414);String imei = buf.toString(buf.readerIndex(), 15, Charset.defaultCharset());
                    __CLR4_5_22lu2lulx1e361t.R.inc(3415);buf.skipBytes(imei.length());
                    __CLR4_5_22lu2lulx1e361t.R.inc(3416);identify(imei, channel);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3417);break;

                case TAG_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3418);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3419);position.setTime(new Date(buf.readUnsignedInt() * 1000));
                    __CLR4_5_22lu2lulx1e361t.R.inc(3420);break;
                    
                case TAG_COORDINATES:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3421);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3422);hasLocation = true;
                    __CLR4_5_22lu2lulx1e361t.R.inc(3423);position.setValid((buf.readUnsignedByte() & 0xf0) == 0x00);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3424);position.setLatitude(buf.readInt() / 1000000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3425);position.setLongitude(buf.readInt() / 1000000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3426);break;
                    
                case TAG_SPEED_COURSE:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3427);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3428);position.setSpeed(buf.readUnsignedShort() * 0.0539957);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3429);position.setCourse(buf.readUnsignedShort() * 0.1);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3430);break;
                    
                case TAG_ALTITUDE:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3431);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3432);position.setAltitude(buf.readShort());
                    __CLR4_5_22lu2lulx1e361t.R.inc(3433);break;
                                       
                case TAG_STATUS:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3434);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3435);int status = buf.readUnsignedShort();
                    __CLR4_5_22lu2lulx1e361t.R.inc(3436);position.set(Event.KEY_IGNITION, BitUtil.check(status, 9));
                    __CLR4_5_22lu2lulx1e361t.R.inc(3437);position.set(Event.KEY_ALARM, BitUtil.check(status, 15));
                    __CLR4_5_22lu2lulx1e361t.R.inc(3438);position.set(Event.KEY_POWER, BitUtil.check(status, 2));
                    __CLR4_5_22lu2lulx1e361t.R.inc(3439);break;
                    
                case TAG_DIGITAL_INPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3440);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3441);int input = buf.readUnsignedShort();
                    __CLR4_5_22lu2lulx1e361t.R.inc(3442);for (int i = 0; (((i < 16)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3443)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3444)==0&false)); i++)
                        {__CLR4_5_22lu2lulx1e361t.R.inc(3445);position.set(Event.PREFIX_IO + (i + 1), BitUtil.check(input, i));
                    }__CLR4_5_22lu2lulx1e361t.R.inc(3446);break;

                case TAG_DIGITAL_OUTPUTS:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3447);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3448);int output = buf.readUnsignedShort();
                    __CLR4_5_22lu2lulx1e361t.R.inc(3449);for (int i = 0; (((i < 16)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3450)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3451)==0&false)); i++)
                        {__CLR4_5_22lu2lulx1e361t.R.inc(3452);position.set(Event.PREFIX_IO + (i + 17), BitUtil.check(output, i));
                    }__CLR4_5_22lu2lulx1e361t.R.inc(3453);break;
                                        
                case TAG_INPUT_VOLTAGE1:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3454);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3455);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3456);break;
                    
                case TAG_INPUT_VOLTAGE2:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3457);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3458);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3459);break;
                                        
                case TAG_INPUT_VOLTAGE3:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3460);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3461);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3462);break;

                case TAG_INPUT_VOLTAGE4:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3463);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3464);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort() / 1000.0);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3465);break;

                case TAG_XT1:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3466);__CLB4_5_2_bool0=true;}
                case TAG_XT2:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3467);__CLB4_5_2_bool0=true;}
                case TAG_XT3:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3468);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3469);buf.skipBytes(16);
                    __CLR4_5_22lu2lulx1e361t.R.inc(3470);break;

                default:if (!__CLB4_5_2_bool0) {__CLR4_5_22lu2lulx1e361t.R.inc(3471);__CLB4_5_2_bool0=true;}
                    __CLR4_5_22lu2lulx1e361t.R.inc(3472);break;
                    
            }
        }

        }__CLR4_5_22lu2lulx1e361t.R.inc(3473);if ((((hasLocation && position.getFixTime() != null)&&(__CLR4_5_22lu2lulx1e361t.R.iget(3474)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3475)==0&false))) {{
            __CLR4_5_22lu2lulx1e361t.R.inc(3476);positions.add(position);
        }
        
        }__CLR4_5_22lu2lulx1e361t.R.inc(3477);if ((((!hasDeviceId())&&(__CLR4_5_22lu2lulx1e361t.R.iget(3478)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3479)==0&false))) {{
            __CLR4_5_22lu2lulx1e361t.R.inc(3480);Log.warning("Unknown device");
            __CLR4_5_22lu2lulx1e361t.R.inc(3481);return null;
        }

        }__CLR4_5_22lu2lulx1e361t.R.inc(3482);sendReply(channel, buf.readUnsignedShort());

        __CLR4_5_22lu2lulx1e361t.R.inc(3483);for (Position p : positions) {{
            __CLR4_5_22lu2lulx1e361t.R.inc(3484);p.setDeviceId(getDeviceId());
        }

        }__CLR4_5_22lu2lulx1e361t.R.inc(3485);if ((((positions.isEmpty())&&(__CLR4_5_22lu2lulx1e361t.R.iget(3486)!=0|true))||(__CLR4_5_22lu2lulx1e361t.R.iget(3487)==0&false))) {{
            __CLR4_5_22lu2lulx1e361t.R.inc(3488);return null;
        }

        }__CLR4_5_22lu2lulx1e361t.R.inc(3489);return positions;
    }finally{__CLR4_5_22lu2lulx1e361t.R.flushNeeded();}}

}
