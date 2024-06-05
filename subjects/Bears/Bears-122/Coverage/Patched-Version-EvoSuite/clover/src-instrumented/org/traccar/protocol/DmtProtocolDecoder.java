/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
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
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class DmtProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_286j86jlwye3zag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,10723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DmtProtocolDecoder(DmtProtocol protocol) {
        super(protocol);__CLR4_5_286j86jlwye3zag.R.inc(10604);try{__CLR4_5_286j86jlwye3zag.R.inc(10603);
    }finally{__CLR4_5_286j86jlwye3zag.R.flushNeeded();}}

    public static final int MSG_HELLO = 0x00;
    public static final int MSG_HELLO_RESPONSE = 0x01;
    public static final int MSG_DATA_RECORD = 0x04;
    public static final int MSG_COMMIT = 0x05;
    public static final int MSG_COMMIT_RESPONSE = 0x06;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_286j86jlwye3zag.R.inc(10605);

        __CLR4_5_286j86jlwye3zag.R.inc(10606);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_286j86jlwye3zag.R.inc(10607);buf.skipBytes(2); // header

        __CLR4_5_286j86jlwye3zag.R.inc(10608);int type = buf.readUnsignedByte();

        __CLR4_5_286j86jlwye3zag.R.inc(10609);buf.readUnsignedShort(); // length

        __CLR4_5_286j86jlwye3zag.R.inc(10610);if ((((type == MSG_HELLO)&&(__CLR4_5_286j86jlwye3zag.R.iget(10611)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10612)==0&false))) {{

            __CLR4_5_286j86jlwye3zag.R.inc(10613);buf.readUnsignedInt(); // device serial number

            __CLR4_5_286j86jlwye3zag.R.inc(10614);DeviceSession deviceSession = getDeviceSession(
                    channel, remoteAddress, buf.readBytes(15).toString(StandardCharsets.US_ASCII));

            __CLR4_5_286j86jlwye3zag.R.inc(10615);if ((((channel != null)&&(__CLR4_5_286j86jlwye3zag.R.iget(10616)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10617)==0&false))) {{
                __CLR4_5_286j86jlwye3zag.R.inc(10618);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
                __CLR4_5_286j86jlwye3zag.R.inc(10619);response.writeByte(0x02); __CLR4_5_286j86jlwye3zag.R.inc(10620);response.writeByte(0x55); // header
                __CLR4_5_286j86jlwye3zag.R.inc(10621);response.writeByte(MSG_HELLO_RESPONSE);
                __CLR4_5_286j86jlwye3zag.R.inc(10622);response.writeShort(4 + 4);
                __CLR4_5_286j86jlwye3zag.R.inc(10623);response.writeInt((int) (System.currentTimeMillis() / 1000));
                __CLR4_5_286j86jlwye3zag.R.inc(10624);response.writeInt((((deviceSession != null )&&(__CLR4_5_286j86jlwye3zag.R.iget(10625)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10626)==0&false))? 0 : 1); // flags
                __CLR4_5_286j86jlwye3zag.R.inc(10627);channel.write(response);
            }

        }} }else {__CLR4_5_286j86jlwye3zag.R.inc(10628);if ((((type == MSG_COMMIT)&&(__CLR4_5_286j86jlwye3zag.R.iget(10629)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10630)==0&false))) {{

            __CLR4_5_286j86jlwye3zag.R.inc(10631);if ((((channel != null)&&(__CLR4_5_286j86jlwye3zag.R.iget(10632)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10633)==0&false))) {{
                __CLR4_5_286j86jlwye3zag.R.inc(10634);ChannelBuffer response = ChannelBuffers.dynamicBuffer(ByteOrder.LITTLE_ENDIAN, 0);
                __CLR4_5_286j86jlwye3zag.R.inc(10635);response.writeByte(0x02); __CLR4_5_286j86jlwye3zag.R.inc(10636);response.writeByte(0x55); // header
                __CLR4_5_286j86jlwye3zag.R.inc(10637);response.writeByte(MSG_COMMIT_RESPONSE);
                __CLR4_5_286j86jlwye3zag.R.inc(10638);response.writeShort(1);
                __CLR4_5_286j86jlwye3zag.R.inc(10639);response.writeByte(1); // flags (success)
                __CLR4_5_286j86jlwye3zag.R.inc(10640);channel.write(response);
            }

        }} }else {__CLR4_5_286j86jlwye3zag.R.inc(10641);if ((((type == MSG_DATA_RECORD)&&(__CLR4_5_286j86jlwye3zag.R.iget(10642)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10643)==0&false))) {{

            __CLR4_5_286j86jlwye3zag.R.inc(10644);DeviceSession deviceSession = getDeviceSession(channel, remoteAddress);
            __CLR4_5_286j86jlwye3zag.R.inc(10645);if ((((deviceSession == null)&&(__CLR4_5_286j86jlwye3zag.R.iget(10646)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10647)==0&false))) {{
                __CLR4_5_286j86jlwye3zag.R.inc(10648);return null;
            }

            }__CLR4_5_286j86jlwye3zag.R.inc(10649);List<Position> positions = new LinkedList<>();

            __CLR4_5_286j86jlwye3zag.R.inc(10650);while ((((buf.readable())&&(__CLR4_5_286j86jlwye3zag.R.iget(10651)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10652)==0&false))) {{

                __CLR4_5_286j86jlwye3zag.R.inc(10653);int recordEnd = buf.readerIndex() + buf.readUnsignedShort();

                __CLR4_5_286j86jlwye3zag.R.inc(10654);Position position = new Position();
                __CLR4_5_286j86jlwye3zag.R.inc(10655);position.setProtocol(getProtocolName());
                __CLR4_5_286j86jlwye3zag.R.inc(10656);position.setDeviceId(deviceSession.getDeviceId());

                __CLR4_5_286j86jlwye3zag.R.inc(10657);position.set(Position.KEY_INDEX, buf.readUnsignedInt());

                __CLR4_5_286j86jlwye3zag.R.inc(10658);position.setDeviceTime(new Date(1356998400000L + buf.readUnsignedInt() * 1000)); // since 1 Jan 2013

                __CLR4_5_286j86jlwye3zag.R.inc(10659);position.set(Position.KEY_EVENT, buf.readUnsignedByte());

                __CLR4_5_286j86jlwye3zag.R.inc(10660);while ((((buf.readerIndex() < recordEnd)&&(__CLR4_5_286j86jlwye3zag.R.iget(10661)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10662)==0&false))) {{

                    __CLR4_5_286j86jlwye3zag.R.inc(10663);int fieldId = buf.readUnsignedByte();
                    __CLR4_5_286j86jlwye3zag.R.inc(10664);int fieldLength = buf.readUnsignedByte();
                    __CLR4_5_286j86jlwye3zag.R.inc(10665);int fieldEnd = buf.readerIndex() + ((((fieldLength == 255 )&&(__CLR4_5_286j86jlwye3zag.R.iget(10666)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10667)==0&false))? buf.readUnsignedShort() : fieldLength);

                    __CLR4_5_286j86jlwye3zag.R.inc(10668);if ((((fieldId == 0)&&(__CLR4_5_286j86jlwye3zag.R.iget(10669)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10670)==0&false))) {{

                        __CLR4_5_286j86jlwye3zag.R.inc(10671);position.setFixTime(new Date(1356998400000L + buf.readUnsignedInt() * 1000));
                        __CLR4_5_286j86jlwye3zag.R.inc(10672);position.setLatitude(buf.readInt() * 0.0000001);
                        __CLR4_5_286j86jlwye3zag.R.inc(10673);position.setLongitude(buf.readInt() * 0.0000001);
                        __CLR4_5_286j86jlwye3zag.R.inc(10674);position.setAltitude(buf.readShort());
                        __CLR4_5_286j86jlwye3zag.R.inc(10675);position.setSpeed(UnitsConverter.knotsFromCps(buf.readUnsignedShort()));

                        __CLR4_5_286j86jlwye3zag.R.inc(10676);buf.readUnsignedByte(); // speed accuracy

                        __CLR4_5_286j86jlwye3zag.R.inc(10677);position.setCourse(buf.readUnsignedByte() * 2);

                        __CLR4_5_286j86jlwye3zag.R.inc(10678);position.set(Position.KEY_PDOP, buf.readUnsignedByte() * 0.1);

                        __CLR4_5_286j86jlwye3zag.R.inc(10679);position.setAccuracy(buf.readUnsignedByte());
                        __CLR4_5_286j86jlwye3zag.R.inc(10680);position.setValid(buf.readUnsignedByte() != 0);

                    } }else {__CLR4_5_286j86jlwye3zag.R.inc(10681);if ((((fieldId == 2)&&(__CLR4_5_286j86jlwye3zag.R.iget(10682)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10683)==0&false))) {{

                        __CLR4_5_286j86jlwye3zag.R.inc(10684);int input = buf.readInt();
                        __CLR4_5_286j86jlwye3zag.R.inc(10685);int output = buf.readUnsignedShort();
                        __CLR4_5_286j86jlwye3zag.R.inc(10686);int status = buf.readUnsignedShort();

                        __CLR4_5_286j86jlwye3zag.R.inc(10687);position.set(Position.KEY_IGNITION, BitUtil.check(input, 0));

                        __CLR4_5_286j86jlwye3zag.R.inc(10688);position.set(Position.KEY_INPUT, input);
                        __CLR4_5_286j86jlwye3zag.R.inc(10689);position.set(Position.KEY_OUTPUT, output);
                        __CLR4_5_286j86jlwye3zag.R.inc(10690);position.set(Position.KEY_STATUS, status);

                    } }else {__CLR4_5_286j86jlwye3zag.R.inc(10691);if ((((fieldId == 6)&&(__CLR4_5_286j86jlwye3zag.R.iget(10692)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10693)==0&false))) {{

                        __CLR4_5_286j86jlwye3zag.R.inc(10694);while ((((buf.readerIndex() < fieldEnd)&&(__CLR4_5_286j86jlwye3zag.R.iget(10695)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10696)==0&false))) {{
                            boolean __CLB4_5_2_bool0=false;__CLR4_5_286j86jlwye3zag.R.inc(10697);switch (buf.readUnsignedByte()) {
                                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10698);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10699);position.set(Position.KEY_BATTERY, buf.readUnsignedShort() * 0.001);
                                    __CLR4_5_286j86jlwye3zag.R.inc(10700);break;
                                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10701);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10702);position.set(Position.KEY_POWER, buf.readUnsignedShort() * 0.01);
                                    __CLR4_5_286j86jlwye3zag.R.inc(10703);break;
                                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10704);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10705);position.set(Position.KEY_DEVICE_TEMP, buf.readShort() * 0.01);
                                    __CLR4_5_286j86jlwye3zag.R.inc(10706);break;
                                case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10707);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10708);position.set(Position.KEY_RSSI, buf.readUnsignedShort());
                                    __CLR4_5_286j86jlwye3zag.R.inc(10709);break;
                                case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10710);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10711);position.set("solarPower", buf.readUnsignedShort() * 0.001);
                                    __CLR4_5_286j86jlwye3zag.R.inc(10712);break;
                                default:if (!__CLB4_5_2_bool0) {__CLR4_5_286j86jlwye3zag.R.inc(10713);__CLB4_5_2_bool0=true;}
                                    __CLR4_5_286j86jlwye3zag.R.inc(10714);break;
                            }
                        }

                    }}

                    }}}__CLR4_5_286j86jlwye3zag.R.inc(10715);buf.readerIndex(fieldEnd);

                }

                }__CLR4_5_286j86jlwye3zag.R.inc(10716);if ((((position.getFixTime() == null)&&(__CLR4_5_286j86jlwye3zag.R.iget(10717)!=0|true))||(__CLR4_5_286j86jlwye3zag.R.iget(10718)==0&false))) {{
                    __CLR4_5_286j86jlwye3zag.R.inc(10719);getLastLocation(position, position.getDeviceTime());
                }

                }__CLR4_5_286j86jlwye3zag.R.inc(10720);positions.add(position);

            }

            }__CLR4_5_286j86jlwye3zag.R.inc(10721);return positions;

        }

        }}}__CLR4_5_286j86jlwye3zag.R.inc(10722);return null;
    }finally{__CLR4_5_286j86jlwye3zag.R.flushNeeded();}}

}
