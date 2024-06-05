/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.util.Date;

public class CalAmpProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_27b17b1lwydyhz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,9604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CalAmpProtocolDecoder(CalAmpProtocol protocol) {
        super(protocol);__CLR4_5_27b17b1lwydyhz4.R.inc(9470);try{__CLR4_5_27b17b1lwydyhz4.R.inc(9469);
    }finally{__CLR4_5_27b17b1lwydyhz4.R.flushNeeded();}}

    public static final int MSG_NULL = 0;
    public static final int MSG_ACK = 1;
    public static final int MSG_EVENT_REPORT = 2;
    public static final int MSG_ID_REPORT = 3;
    public static final int MSG_USER_DATA = 4;
    public static final int MSG_APP_DATA = 5;
    public static final int MSG_CONFIG = 6;
    public static final int MSG_UNIT_REQUEST = 7;
    public static final int MSG_LOCATE_REPORT = 8;
    public static final int MSG_USER_DATA_ACC = 9;
    public static final int MSG_MINI_EVENT_REPORT = 10;
    public static final int MSG_MINI_USER_DATA = 11;

    public static final int SERVICE_UNACKNOWLEDGED = 0;
    public static final int SERVICE_ACKNOWLEDGED = 1;
    public static final int SERVICE_RESPONSE = 2;

    private void sendResponse(Channel channel, SocketAddress remoteAddress, int type, int index, int result) {try{__CLR4_5_27b17b1lwydyhz4.R.inc(9471);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9472);if ((((channel != null)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9473)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9474)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9475);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9476);response.writeByte(SERVICE_RESPONSE);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9477);response.writeByte(MSG_ACK);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9478);response.writeShort(index);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9479);response.writeByte(type);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9480);response.writeByte(result);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9481);response.writeByte(0);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9482);response.writeMedium(0);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9483);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_27b17b1lwydyhz4.R.flushNeeded();}}

    private Position decodePosition(DeviceSession deviceSession, int type, ChannelBuffer buf) {try{__CLR4_5_27b17b1lwydyhz4.R.inc(9484);

        __CLR4_5_27b17b1lwydyhz4.R.inc(9485);Position position = new Position();
        __CLR4_5_27b17b1lwydyhz4.R.inc(9486);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_27b17b1lwydyhz4.R.inc(9487);position.setProtocol(getProtocolName());

        __CLR4_5_27b17b1lwydyhz4.R.inc(9488);position.setTime(new Date(buf.readUnsignedInt() * 1000));
        __CLR4_5_27b17b1lwydyhz4.R.inc(9489);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9490)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9491)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9492);buf.readUnsignedInt(); // fix time
        }
        }__CLR4_5_27b17b1lwydyhz4.R.inc(9493);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9494);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9495);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9496)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9497)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9498);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9499);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedInt()));
        }
        }__CLR4_5_27b17b1lwydyhz4.R.inc(9500);position.setCourse(buf.readShort());
        __CLR4_5_27b17b1lwydyhz4.R.inc(9501);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9502)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9503)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9504);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9505);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9506)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9507)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9508);position.set(Position.KEY_SATELLITES, buf.getUnsignedByte(buf.readerIndex()) & 0xf);
            __CLR4_5_27b17b1lwydyhz4.R.inc(9509);position.setValid((buf.readUnsignedByte() & 0x20) == 0);
        } }else {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9510);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_27b17b1lwydyhz4.R.inc(9511);position.setValid((buf.readUnsignedByte() & 0x08) == 0);
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9512);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9513)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9514)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9515);position.set("carrier", buf.readUnsignedShort());
            __CLR4_5_27b17b1lwydyhz4.R.inc(9516);position.set(Position.KEY_RSSI, buf.readShort());
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9517);position.set("modem", buf.readUnsignedByte());

        __CLR4_5_27b17b1lwydyhz4.R.inc(9518);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9519)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9520)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9521);position.set(Position.KEY_HDOP, buf.readUnsignedByte());
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9522);int input = buf.readUnsignedByte();
        __CLR4_5_27b17b1lwydyhz4.R.inc(9523);position.set(Position.KEY_INPUT, input);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9524);position.set(Position.KEY_IGNITION, BitUtil.check(input, 0));

        __CLR4_5_27b17b1lwydyhz4.R.inc(9525);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9526)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9527)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9528);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9529);if ((((type == MSG_EVENT_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9530)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9531)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9532);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9533)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9534)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9535);buf.readUnsignedByte(); // event index
            }
            }__CLR4_5_27b17b1lwydyhz4.R.inc(9536);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9537);int accType = BitUtil.from(buf.getUnsignedByte(buf.readerIndex()), 6);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9538);int accCount = BitUtil.to(buf.readUnsignedByte(), 6);

        __CLR4_5_27b17b1lwydyhz4.R.inc(9539);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9540)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9541)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9542);position.set("append", buf.readUnsignedByte());
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9543);if ((((accType == 1)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9544)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9545)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9546);buf.readUnsignedInt(); // threshold
            __CLR4_5_27b17b1lwydyhz4.R.inc(9547);buf.readUnsignedInt(); // mask
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9548);for (int i = 0; (((i < accCount)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9549)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9550)==0&false)); i++) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9551);if ((((buf.readableBytes() >= 4)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9552)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9553)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9554);position.set("acc" + i, buf.readUnsignedInt());
            }
        }}

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9555);return position;
    }finally{__CLR4_5_27b17b1lwydyhz4.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_27b17b1lwydyhz4.R.inc(9556);

        __CLR4_5_27b17b1lwydyhz4.R.inc(9557);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_27b17b1lwydyhz4.R.inc(9558);if ((((BitUtil.check(buf.getByte(buf.readerIndex()), 7))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9559)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9560)==0&false))) {{

            __CLR4_5_27b17b1lwydyhz4.R.inc(9561);int content = buf.readUnsignedByte();

            __CLR4_5_27b17b1lwydyhz4.R.inc(9562);if ((((BitUtil.check(content, 0))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9563)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9564)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9565);String id = ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedByte()));
                __CLR4_5_27b17b1lwydyhz4.R.inc(9566);getDeviceSession(channel, remoteAddress, id);
            }

            }__CLR4_5_27b17b1lwydyhz4.R.inc(9567);if ((((BitUtil.check(content, 1))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9568)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9569)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9570);buf.skipBytes(buf.readUnsignedByte()); // identifier type
            }

            }__CLR4_5_27b17b1lwydyhz4.R.inc(9571);if ((((BitUtil.check(content, 2))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9572)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9573)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9574);buf.skipBytes(buf.readUnsignedByte()); // authentication
            }

            }__CLR4_5_27b17b1lwydyhz4.R.inc(9575);if ((((BitUtil.check(content, 3))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9576)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9577)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9578);buf.skipBytes(buf.readUnsignedByte()); // routing
            }

            }__CLR4_5_27b17b1lwydyhz4.R.inc(9579);if ((((BitUtil.check(content, 4))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9580)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9581)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9582);buf.skipBytes(buf.readUnsignedByte()); // forwarding
            }

            }__CLR4_5_27b17b1lwydyhz4.R.inc(9583);if ((((BitUtil.check(content, 5))&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9584)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9585)==0&false))) {{
                __CLR4_5_27b17b1lwydyhz4.R.inc(9586);buf.skipBytes(buf.readUnsignedByte()); // response redirection
            }

        }}

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9587);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_27b17b1lwydyhz4.R.inc(9588);if ((((deviceSession == null)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9589)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9590)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9591);return null;
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9592);int service = buf.readUnsignedByte();
        __CLR4_5_27b17b1lwydyhz4.R.inc(9593);int type = buf.readUnsignedByte();
        __CLR4_5_27b17b1lwydyhz4.R.inc(9594);int index = buf.readUnsignedShort();

        __CLR4_5_27b17b1lwydyhz4.R.inc(9595);if ((((service == SERVICE_ACKNOWLEDGED)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9596)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9597)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9598);sendResponse(channel, remoteAddress, type, index, 0);
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9599);if ((((type == MSG_EVENT_REPORT || type == MSG_LOCATE_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_27b17b1lwydyhz4.R.iget(9600)!=0|true))||(__CLR4_5_27b17b1lwydyhz4.R.iget(9601)==0&false))) {{
            __CLR4_5_27b17b1lwydyhz4.R.inc(9602);return decodePosition(deviceSession, type, buf);
        }

        }__CLR4_5_27b17b1lwydyhz4.R.inc(9603);return null;
    }finally{__CLR4_5_27b17b1lwydyhz4.R.flushNeeded();}}

}
