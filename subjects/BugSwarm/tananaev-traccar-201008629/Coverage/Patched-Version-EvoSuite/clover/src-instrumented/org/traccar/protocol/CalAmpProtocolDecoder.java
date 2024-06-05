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

public class CalAmpProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26ht6htlx1dz9sg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565203863L,8589935092L,8550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public CalAmpProtocolDecoder(CalAmpProtocol protocol) {
        super(protocol);__CLR4_5_26ht6htlx1dz9sg.R.inc(8418);try{__CLR4_5_26ht6htlx1dz9sg.R.inc(8417);
    }finally{__CLR4_5_26ht6htlx1dz9sg.R.flushNeeded();}}

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

    private void sendResponse(Channel channel, SocketAddress remoteAddress, int type, int index, int result) {try{__CLR4_5_26ht6htlx1dz9sg.R.inc(8419);
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8420);if ((((channel != null)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8421)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8422)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8423);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8424);response.writeByte(SERVICE_RESPONSE);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8425);response.writeByte(MSG_ACK);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8426);response.writeShort(index);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8427);response.writeByte(type);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8428);response.writeByte(result);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8429);response.writeByte(0);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8430);response.writeMedium(0);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8431);channel.write(response, remoteAddress);
        }
    }}finally{__CLR4_5_26ht6htlx1dz9sg.R.flushNeeded();}}

    private Position decodePosition(DeviceSession deviceSession, int type, ChannelBuffer buf) {try{__CLR4_5_26ht6htlx1dz9sg.R.inc(8432);

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8433);Position position = new Position();
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8434);position.setDeviceId(deviceSession.getDeviceId());
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8435);position.setProtocol(getProtocolName());

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8436);position.setTime(new Date(buf.readUnsignedInt() * 1000));
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8437);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8438)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8439)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8440);buf.readUnsignedInt(); // fix time
        }
        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8441);position.setLatitude(buf.readInt() * 0.0000001);
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8442);position.setLongitude(buf.readInt() * 0.0000001);
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8443);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8444)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8445)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8446);position.setAltitude(buf.readInt() * 0.01);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8447);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedInt()));
        }
        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8448);position.setCourse(buf.readShort());
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8449);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8450)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8451)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8452);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8453);if ((((type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8454)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8455)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8456);position.set(Position.KEY_SATELLITES, buf.getUnsignedByte(buf.readerIndex()) & 0xf);
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8457);position.setValid((buf.readUnsignedByte() & 0x20) == 0);
        } }else {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8458);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8459);position.setValid((buf.readUnsignedByte() & 0x08) == 0);
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8460);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8461)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8462)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8463);position.set("carrier", buf.readUnsignedShort());
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8464);position.set(Position.KEY_RSSI, buf.readShort());
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8465);position.set("modem", buf.readUnsignedByte());

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8466);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8467)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8468)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8469);position.set(Position.KEY_HDOP, buf.readUnsignedByte());
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8470);position.set(Position.KEY_INPUT, buf.readUnsignedByte());

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8471);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8472)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8473)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8474);position.set(Position.KEY_STATUS, buf.readUnsignedByte());
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8475);if ((((type == MSG_EVENT_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8476)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8477)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8478);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8479)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8480)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8481);buf.readUnsignedByte(); // event index
            }
            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8482);position.set(Position.KEY_EVENT, buf.readUnsignedByte());
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8483);int accType = BitUtil.from(buf.getUnsignedByte(buf.readerIndex()), 6);
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8484);int accCount = BitUtil.to(buf.readUnsignedByte(), 6);

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8485);if ((((type != MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8486)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8487)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8488);position.set("append", buf.readUnsignedByte());
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8489);if ((((accType == 1)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8490)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8491)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8492);buf.readUnsignedInt(); // threshold
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8493);buf.readUnsignedInt(); // mask
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8494);for (int i = 0; (((i < accCount)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8495)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8496)==0&false)); i++) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8497);if ((((buf.readableBytes() >= 4)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8498)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8499)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8500);position.set("acc" + i, buf.readUnsignedInt());
            }
        }}

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8501);return position;
    }finally{__CLR4_5_26ht6htlx1dz9sg.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26ht6htlx1dz9sg.R.inc(8502);

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8503);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8504);if ((((BitUtil.check(buf.getByte(buf.readerIndex()), 7))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8505)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8506)==0&false))) {{

            __CLR4_5_26ht6htlx1dz9sg.R.inc(8507);int content = buf.readUnsignedByte();

            __CLR4_5_26ht6htlx1dz9sg.R.inc(8508);if ((((BitUtil.check(content, 0))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8509)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8510)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8511);String id = ChannelBuffers.hexDump(buf.readBytes(buf.readUnsignedByte()));
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8512);getDeviceSession(channel, remoteAddress, id);
            }

            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8513);if ((((BitUtil.check(content, 1))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8514)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8515)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8516);buf.skipBytes(buf.readUnsignedByte()); // identifier type
            }

            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8517);if ((((BitUtil.check(content, 2))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8518)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8519)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8520);buf.skipBytes(buf.readUnsignedByte()); // authentication
            }

            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8521);if ((((BitUtil.check(content, 3))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8522)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8523)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8524);buf.skipBytes(buf.readUnsignedByte()); // routing
            }

            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8525);if ((((BitUtil.check(content, 4))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8526)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8527)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8528);buf.skipBytes(buf.readUnsignedByte()); // forwarding
            }

            }__CLR4_5_26ht6htlx1dz9sg.R.inc(8529);if ((((BitUtil.check(content, 5))&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8530)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8531)==0&false))) {{
                __CLR4_5_26ht6htlx1dz9sg.R.inc(8532);buf.skipBytes(buf.readUnsignedByte()); // response redirection
            }

        }}

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8533);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8534);if ((((deviceSession == null)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8535)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8536)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8537);return null;
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8538);int service = buf.readUnsignedByte();
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8539);int type = buf.readUnsignedByte();
        __CLR4_5_26ht6htlx1dz9sg.R.inc(8540);int index = buf.readUnsignedShort();

        __CLR4_5_26ht6htlx1dz9sg.R.inc(8541);if ((((service == SERVICE_ACKNOWLEDGED)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8542)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8543)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8544);sendResponse(channel, remoteAddress, type, index, 0);
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8545);if ((((type == MSG_EVENT_REPORT || type == MSG_LOCATE_REPORT || type == MSG_MINI_EVENT_REPORT)&&(__CLR4_5_26ht6htlx1dz9sg.R.iget(8546)!=0|true))||(__CLR4_5_26ht6htlx1dz9sg.R.iget(8547)==0&false))) {{
            __CLR4_5_26ht6htlx1dz9sg.R.inc(8548);return decodePosition(deviceSession, type, buf);
        }

        }__CLR4_5_26ht6htlx1dz9sg.R.inc(8549);return null;
    }finally{__CLR4_5_26ht6htlx1dz9sg.R.flushNeeded();}}

}
