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
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class CalAmpProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_22qq2qqlx1e3645{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,3686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CalAmpProtocolDecoder(CalAmpProtocol protocol) {
        super(protocol);__CLR4_5_22qq2qqlx1e3645.R.inc(3555);try{__CLR4_5_22qq2qqlx1e3645.R.inc(3554);
    }finally{__CLR4_5_22qq2qqlx1e3645.R.flushNeeded();}}

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

    private void sendResponse(Channel channel, SocketAddress remoteAddress, int type, int index, int result) {try{__CLR4_5_22qq2qqlx1e3645.R.inc(3556);
        __CLR4_5_22qq2qqlx1e3645.R.inc(3557);if ((((channel != null)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3558)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3559)==0&false))) {{
            __CLR4_5_22qq2qqlx1e3645.R.inc(3560);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3561);response.writeByte(SERVICE_RESPONSE);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3562);response.writeByte(MSG_ACK);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3563);response.writeShort(index);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3564);response.writeByte(type);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3565);response.writeByte(result);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3566);response.writeByte(0);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3567);response.writeMedium(0);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3568);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_22qq2qqlx1e3645.R.flushNeeded();}}

    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_22qq2qqlx1e3645.R.inc(3569);

        __CLR4_5_22qq2qqlx1e3645.R.inc(3570);ChannelBuffer buf = (ChannelBuffer) msg;

        // Check options header
        __CLR4_5_22qq2qqlx1e3645.R.inc(3571);if (((((buf.getByte(buf.readerIndex()) & 0x80) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3572)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3573)==0&false))) {{

            __CLR4_5_22qq2qqlx1e3645.R.inc(3574);int content = buf.readUnsignedByte();

            // Identifier
            __CLR4_5_22qq2qqlx1e3645.R.inc(3575);if (((((content & 0x01) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3576)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3577)==0&false))) {{

                // Read identifier
                __CLR4_5_22qq2qqlx1e3645.R.inc(3578);int length = buf.readUnsignedByte();
                __CLR4_5_22qq2qqlx1e3645.R.inc(3579);long id = 0;
                __CLR4_5_22qq2qqlx1e3645.R.inc(3580);for (int i = 0; (((i < length)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3581)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3582)==0&false)); i++) {{
                    __CLR4_5_22qq2qqlx1e3645.R.inc(3583);int b = buf.readUnsignedByte();
                    __CLR4_5_22qq2qqlx1e3645.R.inc(3584);id = id * 10 + (b >> 4);
                    __CLR4_5_22qq2qqlx1e3645.R.inc(3585);if (((((b & 0xf) != 0xf)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3586)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3587)==0&false))) {{
                        __CLR4_5_22qq2qqlx1e3645.R.inc(3588);id = id * 10 + (b & 0xf);
                    }
                }}

                }__CLR4_5_22qq2qqlx1e3645.R.inc(3589);identify(String.valueOf(id), channel, remoteAddress);
            }

            // Identifier type
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3590);if (((((content & 0x02) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3591)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3592)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3593);buf.skipBytes(buf.readUnsignedByte());
            }

            // Authentication
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3594);if (((((content & 0x04) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3595)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3596)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3597);buf.skipBytes(buf.readUnsignedByte());
            }

            // Routing
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3598);if (((((content & 0x08) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3599)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3600)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3601);buf.skipBytes(buf.readUnsignedByte());
            }

            // Forwarding
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3602);if (((((content & 0x10) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3603)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3604)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3605);buf.skipBytes(buf.readUnsignedByte());
            }

            // Responce redirection
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3606);if (((((content & 0x20) != 0)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3607)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3608)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3609);buf.skipBytes(buf.readUnsignedByte());
            }

        }}

        // Unidentified device
        }__CLR4_5_22qq2qqlx1e3645.R.inc(3610);if ((((!hasDeviceId())&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3611)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3612)==0&false))) {{
            __CLR4_5_22qq2qqlx1e3645.R.inc(3613);return null;
        }

        }__CLR4_5_22qq2qqlx1e3645.R.inc(3614);int service = buf.readUnsignedByte();
        __CLR4_5_22qq2qqlx1e3645.R.inc(3615);int type = buf.readUnsignedByte();
        __CLR4_5_22qq2qqlx1e3645.R.inc(3616);int index = buf.readUnsignedShort();

        // Send acknowledgement
        __CLR4_5_22qq2qqlx1e3645.R.inc(3617);if ((((service == SERVICE_ACKNOWLEDGED)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3618)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3619)==0&false))) {{
            __CLR4_5_22qq2qqlx1e3645.R.inc(3620);sendResponse(channel, remoteAddress, type, index, 0);
        }

        }__CLR4_5_22qq2qqlx1e3645.R.inc(3621);if ((((type == MSG_EVENT_REPORT ||
            type == MSG_LOCATE_REPORT ||
            type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3622)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3623)==0&false))) {{

            // Create new position
            __CLR4_5_22qq2qqlx1e3645.R.inc(3624);Position position = new Position();
            __CLR4_5_22qq2qqlx1e3645.R.inc(3625);position.setDeviceId(getDeviceId());
            __CLR4_5_22qq2qqlx1e3645.R.inc(3626);position.setProtocol(getProtocolName());

            // Location data
            __CLR4_5_22qq2qqlx1e3645.R.inc(3627);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_22qq2qqlx1e3645.R.inc(3628);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3629)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3630)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3631);buf.readUnsignedInt(); // fix time
            }
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3632);position.setLatitude(buf.readInt() * 0.0000001);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3633);position.setLongitude(buf.readInt() * 0.0000001);
            __CLR4_5_22qq2qqlx1e3645.R.inc(3634);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3635)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3636)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3637);position.setAltitude(buf.readInt() * 0.01);
                __CLR4_5_22qq2qqlx1e3645.R.inc(3638);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedInt()));
            }
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3639);position.setCourse(buf.readShort());
            __CLR4_5_22qq2qqlx1e3645.R.inc(3640);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3641)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3642)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3643);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            }

            // Fix status
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3644);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3645)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3646)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3647);position.set(Event.KEY_SATELLITES, buf.getUnsignedByte(buf.readerIndex()) & 0xf);
                __CLR4_5_22qq2qqlx1e3645.R.inc(3648);position.setValid((buf.readUnsignedByte() & 0x20) == 0);
            } }else {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3649);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                __CLR4_5_22qq2qqlx1e3645.R.inc(3650);position.setValid((buf.readUnsignedByte() & 0x08) == 0);
            }

            }__CLR4_5_22qq2qqlx1e3645.R.inc(3651);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3652)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3653)==0&false))) {{

                // Carrier
                __CLR4_5_22qq2qqlx1e3645.R.inc(3654);position.set("carrier", buf.readUnsignedShort());

                // Cell signal
                __CLR4_5_22qq2qqlx1e3645.R.inc(3655);position.set(Event.KEY_GSM, buf.readShort());

            }

            // Modem state
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3656);position.set("modem", buf.readUnsignedByte());

            // HDOP
            __CLR4_5_22qq2qqlx1e3645.R.inc(3657);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3658)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3659)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3660);position.set(Event.KEY_HDOP, buf.readUnsignedByte());
            }

            // Inputs
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3661);position.set(Event.KEY_INPUT, buf.readUnsignedByte());

            // Unit status
            __CLR4_5_22qq2qqlx1e3645.R.inc(3662);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3663)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3664)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3665);position.set(Event.KEY_STATUS, buf.readUnsignedByte());
            }

            // Event code and status
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3666);if ((((type == MSG_EVENT_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3667)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3668)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3669);buf.readUnsignedByte();
                __CLR4_5_22qq2qqlx1e3645.R.inc(3670);position.set(Event.KEY_EVENT, buf.readUnsignedByte());
            }

            // Accumulators
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3671);int accCount = buf.readUnsignedByte();
            __CLR4_5_22qq2qqlx1e3645.R.inc(3672);int accType = accCount >> 6;
            __CLR4_5_22qq2qqlx1e3645.R.inc(3673);accCount &= 0x3f;
            
            __CLR4_5_22qq2qqlx1e3645.R.inc(3674);buf.readUnsignedByte(); // reserved

            __CLR4_5_22qq2qqlx1e3645.R.inc(3675);if ((((accType == 1)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3676)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3677)==0&false))) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3678);buf.readUnsignedInt(); // threshold
                __CLR4_5_22qq2qqlx1e3645.R.inc(3679);buf.readUnsignedInt(); // mask
            }

            }__CLR4_5_22qq2qqlx1e3645.R.inc(3680);for (int i = 0; (((i < accCount)&&(__CLR4_5_22qq2qqlx1e3645.R.iget(3681)!=0|true))||(__CLR4_5_22qq2qqlx1e3645.R.iget(3682)==0&false)); i++) {{
                __CLR4_5_22qq2qqlx1e3645.R.inc(3683);position.set("acc" + i, buf.readUnsignedInt());
            }
            }__CLR4_5_22qq2qqlx1e3645.R.inc(3684);return position;

        }

        }__CLR4_5_22qq2qqlx1e3645.R.inc(3685);return null;
    }finally{__CLR4_5_22qq2qqlx1e3645.R.flushNeeded();}}

}
