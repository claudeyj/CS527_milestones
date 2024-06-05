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

import java.net.SocketAddress;
import java.util.Date;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CalAmpProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22o42o4lx1dp6qy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564735264L,8589935092L,3603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CalAmpProtocolDecoder(CalAmpProtocol protocol) {
        super(protocol);__CLR4_5_22o42o4lx1dp6qy.R.inc(3461);try{__CLR4_5_22o42o4lx1dp6qy.R.inc(3460);
    }finally{__CLR4_5_22o42o4lx1dp6qy.R.flushNeeded();}}

    private static final int MSG_NULL = 0;
    private static final int MSG_ACK = 1;
    private static final int MSG_EVENT_REPORT = 2;
    private static final int MSG_ID_REPORT = 3;
    private static final int MSG_USER_DATA = 4;
    private static final int MSG_APP_DATA = 5;
    private static final int MSG_CONFIG = 6;
    private static final int MSG_UNIT_REQUEST = 7;
    private static final int MSG_LOCATE_REPORT = 8;
    private static final int MSG_USER_DATA_ACC = 9;
    private static final int MSG_MINI_EVENT_REPORT = 10;
    private static final int MSG_MINI_USER_DATA = 11;

    private static final int SERVICE_UNACKNOWLEDGED = 0;
    private static final int SERVICE_ACKNOWLEDGED = 1;
    private static final int SERVICE_RESPONSE = 2;

    @Override
    public void handleUpstream(
            ChannelHandlerContext ctx, ChannelEvent evt)
            throws Exception {try{__CLR4_5_22o42o4lx1dp6qy.R.inc(3462);

        __CLR4_5_22o42o4lx1dp6qy.R.inc(3463);if ((((!(evt instanceof MessageEvent))&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3464)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3465)==0&false))) {{
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3466);ctx.sendUpstream(evt);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3467);return;
        }

        }__CLR4_5_22o42o4lx1dp6qy.R.inc(3468);MessageEvent e = (MessageEvent) evt;
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3469);Object decodedMessage = decode(ctx, e.getChannel(), e.getMessage(), e.getRemoteAddress());
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3470);if ((((decodedMessage != null)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3471)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3472)==0&false))) {{
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3473);Channels.fireMessageReceived(ctx, decodedMessage, e.getRemoteAddress());
        }
    }}finally{__CLR4_5_22o42o4lx1dp6qy.R.flushNeeded();}}

    private void sendResponse(Channel channel, SocketAddress remoteAddress, int type, int index, int result) {try{__CLR4_5_22o42o4lx1dp6qy.R.inc(3474);
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3475);if ((((channel != null)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3476)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3477)==0&false))) {{
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3478);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3479);response.writeByte(SERVICE_RESPONSE);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3480);response.writeByte(MSG_ACK);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3481);response.writeShort(index);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3482);response.writeByte(type);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3483);response.writeByte(result);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3484);response.writeByte(0);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3485);response.writeMedium(0);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3486);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_22o42o4lx1dp6qy.R.flushNeeded();}}

    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg, SocketAddress remoteAddress)
            throws Exception {try{__CLR4_5_22o42o4lx1dp6qy.R.inc(3487);

        __CLR4_5_22o42o4lx1dp6qy.R.inc(3488);ChannelBuffer buf = (ChannelBuffer) msg;

        // Check options header
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3489);if (((((buf.getByte(buf.readerIndex()) & 0x80) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3490)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3491)==0&false))) {{

            __CLR4_5_22o42o4lx1dp6qy.R.inc(3492);int content = buf.readUnsignedByte();

            // Identifier
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3493);if (((((content & 0x01) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3494)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3495)==0&false))) {{

                // Read identifier
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3496);int length = buf.readUnsignedByte();
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3497);long id = 0;
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3498);for (int i = 0; (((i < length)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3499)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3500)==0&false)); i++) {{
                    __CLR4_5_22o42o4lx1dp6qy.R.inc(3501);int b = buf.readUnsignedByte();
                    __CLR4_5_22o42o4lx1dp6qy.R.inc(3502);id = id * 10 + (b >> 4);
                    __CLR4_5_22o42o4lx1dp6qy.R.inc(3503);if (((((b & 0xf) != 0xf)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3504)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3505)==0&false))) {{
                        __CLR4_5_22o42o4lx1dp6qy.R.inc(3506);id = id * 10 + (b & 0xf);
                    }
                }}

                }__CLR4_5_22o42o4lx1dp6qy.R.inc(3507);identify(String.valueOf(id), channel, remoteAddress);
            }

            // Identifier type
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3508);if (((((content & 0x02) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3509)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3510)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3511);buf.skipBytes(buf.readUnsignedByte());
            }

            // Authentication
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3512);if (((((content & 0x04) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3513)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3514)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3515);buf.skipBytes(buf.readUnsignedByte());
            }

            // Routing
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3516);if (((((content & 0x08) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3517)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3518)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3519);buf.skipBytes(buf.readUnsignedByte());
            }

            // Forwarding
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3520);if (((((content & 0x10) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3521)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3522)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3523);buf.skipBytes(buf.readUnsignedByte());
            }

            // Responce redirection
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3524);if (((((content & 0x20) != 0)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3525)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3526)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3527);buf.skipBytes(buf.readUnsignedByte());
            }

        }}

        // Unidentified device
        }__CLR4_5_22o42o4lx1dp6qy.R.inc(3528);if ((((!hasDeviceId())&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3529)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3530)==0&false))) {{
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3531);return null;
        }

        }__CLR4_5_22o42o4lx1dp6qy.R.inc(3532);int service = buf.readUnsignedByte();
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3533);int type = buf.readUnsignedByte();
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3534);int index = buf.readUnsignedShort();

        // Send acknowledgement
        __CLR4_5_22o42o4lx1dp6qy.R.inc(3535);if ((((service == SERVICE_ACKNOWLEDGED)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3536)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3537)==0&false))) {{
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3538);sendResponse(channel, remoteAddress, type, index, 0);
        }

        }__CLR4_5_22o42o4lx1dp6qy.R.inc(3539);if ((((type == MSG_EVENT_REPORT ||
            type == MSG_LOCATE_REPORT ||
            type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3540)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3541)==0&false))) {{

            // Create new position
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3542);Position position = new Position();
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3543);position.setDeviceId(getDeviceId());
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3544);position.setProtocol(getProtocolName());

            // Location data
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3545);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3546);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3547)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3548)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3549);buf.readUnsignedInt(); // fix time
            }
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3550);position.setLatitude(buf.readInt() * 0.0000001);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3551);position.setLongitude(buf.readInt() * 0.0000001);
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3552);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3553)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3554)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3555);position.setAltitude(buf.readInt() * 0.01);
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3556);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedInt()));
            }
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3557);position.setCourse(buf.readShort());
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3558);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3559)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3560)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3561);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            }

            // Fix status
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3562);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3563)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3564)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3565);position.set(Event.KEY_SATELLITES, buf.getUnsignedByte(buf.readerIndex()) & 0xf);
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3566);position.setValid((buf.readUnsignedByte() & 0x20) == 0);
            } }else {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3567);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3568);position.setValid((buf.readUnsignedByte() & 0x08) == 0);
            }

            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3569);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3570)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3571)==0&false))) {{

                // Carrier
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3572);position.set("carrier", buf.readUnsignedShort());

                // Cell signal
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3573);position.set(Event.KEY_GSM, buf.readShort());

            }

            // Modem state
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3574);position.set("modem", buf.readUnsignedByte());

            // HDOP
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3575);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3576)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3577)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3578);position.set(Event.KEY_HDOP, buf.readUnsignedByte());
            }

            // Inputs
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3579);position.set(Event.KEY_INPUT, buf.readUnsignedByte());

            // Unit status
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3580);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3581)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3582)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3583);position.set(Event.KEY_STATUS, buf.readUnsignedByte());
            }

            // Event code and status
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3584);if ((((type == MSG_EVENT_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3585)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3586)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3587);position.set(Event.KEY_EVENT, buf.readUnsignedByte() + " - " + buf.readUnsignedByte());
            }

            // Accumulators
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3588);int accCount = buf.readUnsignedByte();
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3589);int accType = accCount >> 6;
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3590);accCount &= 0x3f;
            
            __CLR4_5_22o42o4lx1dp6qy.R.inc(3591);buf.readUnsignedByte(); // reserved

            __CLR4_5_22o42o4lx1dp6qy.R.inc(3592);if ((((accType == 1)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3593)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3594)==0&false))) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3595);buf.readUnsignedInt(); // threshold
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3596);buf.readUnsignedInt(); // mask
            }

            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3597);for (int i = 0; (((i < accCount)&&(__CLR4_5_22o42o4lx1dp6qy.R.iget(3598)!=0|true))||(__CLR4_5_22o42o4lx1dp6qy.R.iget(3599)==0&false)); i++) {{
                __CLR4_5_22o42o4lx1dp6qy.R.inc(3600);position.set("acc" + i, buf.readUnsignedInt());
            }
            }__CLR4_5_22o42o4lx1dp6qy.R.inc(3601);return position;

        }

        }__CLR4_5_22o42o4lx1dp6qy.R.inc(3602);return null;
    }finally{__CLR4_5_22o42o4lx1dp6qy.R.flushNeeded();}}

}
