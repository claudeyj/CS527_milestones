/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class At2000ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_25rl5rllx1dwhua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565074552L,8589935092L,7557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int BLOCK_LENGTH = 16;

    public At2000ProtocolDecoder(At2000Protocol protocol) {
        super(protocol);__CLR4_5_25rl5rllx1dwhua.R.inc(7474);try{__CLR4_5_25rl5rllx1dwhua.R.inc(7473);
    }finally{__CLR4_5_25rl5rllx1dwhua.R.flushNeeded();}}

    public static final int MSG_ACKNOWLEDGEMENT = 0x00;
    public static final int MSG_DEVICE_ID = 0x01;
    public static final int MSG_TRACK_REQUEST = 0x88;
    public static final int MSG_TRACK_RESPONSE = 0x89;
    public static final int MSG_SESSION_END = 0x0c;

    private Cipher cipher;

    private static void sendRequest(Channel channel) {try{__CLR4_5_25rl5rllx1dwhua.R.inc(7475);
        __CLR4_5_25rl5rllx1dwhua.R.inc(7476);if ((((channel != null)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7477)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7478)==0&false))) {{
            __CLR4_5_25rl5rllx1dwhua.R.inc(7479);ChannelBuffer response = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, BLOCK_LENGTH);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7480);response.writeByte(MSG_TRACK_REQUEST);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7481);response.writeMedium(ChannelBuffers.swapMedium(0));
            __CLR4_5_25rl5rllx1dwhua.R.inc(7482);response.writerIndex(BLOCK_LENGTH);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7483);channel.write(response);
        }
    }}finally{__CLR4_5_25rl5rllx1dwhua.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_25rl5rllx1dwhua.R.inc(7484);

        __CLR4_5_25rl5rllx1dwhua.R.inc(7485);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_25rl5rllx1dwhua.R.inc(7486);if ((((buf.getUnsignedByte(buf.readerIndex()) == 0x01)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7487)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7488)==0&false))) {{
            __CLR4_5_25rl5rllx1dwhua.R.inc(7489);buf.readUnsignedByte(); // codec id
        }

        }__CLR4_5_25rl5rllx1dwhua.R.inc(7490);int type = buf.readUnsignedByte();
        __CLR4_5_25rl5rllx1dwhua.R.inc(7491);buf.readUnsignedMedium(); // length
        __CLR4_5_25rl5rllx1dwhua.R.inc(7492);buf.skipBytes(BLOCK_LENGTH - 1 - 3);

        __CLR4_5_25rl5rllx1dwhua.R.inc(7493);if ((((type == MSG_DEVICE_ID)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7494)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7495)==0&false))) {{

            __CLR4_5_25rl5rllx1dwhua.R.inc(7496);String imei = buf.readBytes(15).toString(StandardCharsets.US_ASCII);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7497);if ((((getDeviceSession(channel, remoteAddress, imei) != null)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7498)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7499)==0&false))) {{

                __CLR4_5_25rl5rllx1dwhua.R.inc(7500);byte[] iv = new byte[BLOCK_LENGTH];
                __CLR4_5_25rl5rllx1dwhua.R.inc(7501);buf.readBytes(iv);
                __CLR4_5_25rl5rllx1dwhua.R.inc(7502);IvParameterSpec ivSpec = new IvParameterSpec(iv);

                __CLR4_5_25rl5rllx1dwhua.R.inc(7503);SecretKeySpec keySpec = new SecretKeySpec(
                        DatatypeConverter.parseHexBinary("000102030405060708090a0b0c0d0e0f"), "AES");

                __CLR4_5_25rl5rllx1dwhua.R.inc(7504);cipher = Cipher.getInstance("AES/CBC/NoPadding");
                __CLR4_5_25rl5rllx1dwhua.R.inc(7505);cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

                __CLR4_5_25rl5rllx1dwhua.R.inc(7506);byte[] data = new byte[BLOCK_LENGTH];
                __CLR4_5_25rl5rllx1dwhua.R.inc(7507);buf.readBytes(data);
                __CLR4_5_25rl5rllx1dwhua.R.inc(7508);cipher.update(data);

            }

        }} }else {__CLR4_5_25rl5rllx1dwhua.R.inc(7509);if ((((type == MSG_TRACK_RESPONSE)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7510)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7511)==0&false))) {{

            __CLR4_5_25rl5rllx1dwhua.R.inc(7512);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7513);if ((((deviceSession == null)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7514)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7515)==0&false))) {{
                __CLR4_5_25rl5rllx1dwhua.R.inc(7516);return null;
            }

            }__CLR4_5_25rl5rllx1dwhua.R.inc(7517);byte[] data = new byte[buf.capacity() - BLOCK_LENGTH];
            __CLR4_5_25rl5rllx1dwhua.R.inc(7518);buf.readBytes(data);
            __CLR4_5_25rl5rllx1dwhua.R.inc(7519);buf = ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, cipher.update(data));

            __CLR4_5_25rl5rllx1dwhua.R.inc(7520);List<Position> positions = new LinkedList<>();

            __CLR4_5_25rl5rllx1dwhua.R.inc(7521);while ((((buf.readableBytes() >= 63)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7522)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7523)==0&false))) {{

                __CLR4_5_25rl5rllx1dwhua.R.inc(7524);Position position = new Position();
                __CLR4_5_25rl5rllx1dwhua.R.inc(7525);position.setProtocol(getProtocolName());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7526);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_25rl5rllx1dwhua.R.inc(7527);buf.readUnsignedShort(); // index
                __CLR4_5_25rl5rllx1dwhua.R.inc(7528);buf.readUnsignedShort(); // reserved

                __CLR4_5_25rl5rllx1dwhua.R.inc(7529);position.setValid(true);

                __CLR4_5_25rl5rllx1dwhua.R.inc(7530);position.setTime(new Date(buf.readLong() * 1000));

                __CLR4_5_25rl5rllx1dwhua.R.inc(7531);position.setLatitude(buf.readFloat());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7532);position.setLongitude(buf.readFloat());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7533);position.setAltitude(buf.readFloat());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7534);position.setSpeed(UnitsConverter.knotsFromKph(buf.readFloat()));
                __CLR4_5_25rl5rllx1dwhua.R.inc(7535);position.setCourse(buf.readFloat());

                __CLR4_5_25rl5rllx1dwhua.R.inc(7536);buf.readUnsignedInt(); // geozone event
                __CLR4_5_25rl5rllx1dwhua.R.inc(7537);buf.readUnsignedInt(); // io events
                __CLR4_5_25rl5rllx1dwhua.R.inc(7538);buf.readUnsignedInt(); // geozone value
                __CLR4_5_25rl5rllx1dwhua.R.inc(7539);buf.readUnsignedInt(); // io values
                __CLR4_5_25rl5rllx1dwhua.R.inc(7540);buf.readUnsignedShort(); // operator

                __CLR4_5_25rl5rllx1dwhua.R.inc(7541);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7542);position.set(Position.PREFIX_ADC + 1, buf.readUnsignedShort());

                __CLR4_5_25rl5rllx1dwhua.R.inc(7543);position.set(Position.KEY_POWER, buf.readUnsignedShort() + "mV");

                __CLR4_5_25rl5rllx1dwhua.R.inc(7544);buf.readUnsignedShort(); // cid
                __CLR4_5_25rl5rllx1dwhua.R.inc(7545);buf.readUnsignedByte(); // rssi
                __CLR4_5_25rl5rllx1dwhua.R.inc(7546);buf.readUnsignedByte(); // current profile

                __CLR4_5_25rl5rllx1dwhua.R.inc(7547);position.set(Position.KEY_BATTERY, buf.readUnsignedByte());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7548);position.set(Position.PREFIX_TEMP + 1, buf.readUnsignedByte());
                __CLR4_5_25rl5rllx1dwhua.R.inc(7549);position.set(Position.KEY_SATELLITES, buf.readUnsignedByte());

                __CLR4_5_25rl5rllx1dwhua.R.inc(7550);positions.add(position);

            }

            }__CLR4_5_25rl5rllx1dwhua.R.inc(7551);return positions;

        }

        }}__CLR4_5_25rl5rllx1dwhua.R.inc(7552);if ((((type == MSG_DEVICE_ID)&&(__CLR4_5_25rl5rllx1dwhua.R.iget(7553)!=0|true))||(__CLR4_5_25rl5rllx1dwhua.R.iget(7554)==0&false))) {{
            __CLR4_5_25rl5rllx1dwhua.R.inc(7555);sendRequest(channel);
        }

        }__CLR4_5_25rl5rllx1dwhua.R.inc(7556);return null;
    }finally{__CLR4_5_25rl5rllx1dwhua.R.flushNeeded();}}

}
