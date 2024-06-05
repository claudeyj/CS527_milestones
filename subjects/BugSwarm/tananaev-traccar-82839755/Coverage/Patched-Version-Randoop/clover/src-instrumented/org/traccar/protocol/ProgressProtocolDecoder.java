/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.net.SocketAddress;
import java.util.Calendar; 
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ProgressProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_26m96m9lx1e76fm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,8693,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ProgressProtocolDecoder(ProgressProtocol protocol) {
        super(protocol);__CLR4_5_26m96m9lx1e76fm.R.inc(8578);try{__CLR4_5_26m96m9lx1e76fm.R.inc(8577);
    }finally{__CLR4_5_26m96m9lx1e76fm.R.flushNeeded();}}

    private static final int MSG_NULL = 0;
    private static final int MSG_IDENT = 1;
    private static final int MSG_IDENT_FULL = 2;
    private static final int MSG_POINT = 10;
    private static final int MSG_LOG_SYNC = 100;
    private static final int MSG_LOGMSG = 101;
    private static final int MSG_TEXT = 102;
    private static final int MSG_ALARM = 200;
    private static final int MSG_ALARM_RECIEVED = 201;

    private static final String HEX_CHARS = "0123456789ABCDEF";

    private void requestArchive(Channel channel) {try{__CLR4_5_26m96m9lx1e76fm.R.inc(8579);
        __CLR4_5_26m96m9lx1e76fm.R.inc(8580);if ((((lastIndex == 0)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8581)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8582)==0&false))) {{
            __CLR4_5_26m96m9lx1e76fm.R.inc(8583);lastIndex = newIndex;
        } }else {__CLR4_5_26m96m9lx1e76fm.R.inc(8584);if ((((newIndex > lastIndex)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8585)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8586)==0&false))) {{
            __CLR4_5_26m96m9lx1e76fm.R.inc(8587);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 12);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8588);request.writeShort(MSG_LOG_SYNC);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8589);request.writeShort(4);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8590);request.writeInt((int) lastIndex);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8591);request.writeInt(0);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8592);channel.write(request);
        }
    }}}finally{__CLR4_5_26m96m9lx1e76fm.R.flushNeeded();}}

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {try{__CLR4_5_26m96m9lx1e76fm.R.inc(8593);

        __CLR4_5_26m96m9lx1e76fm.R.inc(8594);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_26m96m9lx1e76fm.R.inc(8595);int type = buf.readUnsignedShort();
        __CLR4_5_26m96m9lx1e76fm.R.inc(8596);buf.readUnsignedShort(); // length

        // Authentication
        __CLR4_5_26m96m9lx1e76fm.R.inc(8597);if ((((type == MSG_IDENT || type == MSG_IDENT_FULL)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8598)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8599)==0&false))) {{
            __CLR4_5_26m96m9lx1e76fm.R.inc(8600);long id = buf.readUnsignedInt();
            __CLR4_5_26m96m9lx1e76fm.R.inc(8601);int length = buf.readUnsignedShort();
            __CLR4_5_26m96m9lx1e76fm.R.inc(8602);buf.skipBytes(length);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8603);length = buf.readUnsignedShort();
            __CLR4_5_26m96m9lx1e76fm.R.inc(8604);buf.skipBytes(length);
            __CLR4_5_26m96m9lx1e76fm.R.inc(8605);length = buf.readUnsignedShort();
            __CLR4_5_26m96m9lx1e76fm.R.inc(8606);String imei = buf.readBytes(length).toString(Charset.defaultCharset());
            __CLR4_5_26m96m9lx1e76fm.R.inc(8607);identify(imei, channel);
        }

        // Position
        }else {__CLR4_5_26m96m9lx1e76fm.R.inc(8608);if ((((hasDeviceId() && (type == MSG_POINT || type == MSG_ALARM || type == MSG_LOGMSG))&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8609)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8610)==0&false))) {{
            __CLR4_5_26m96m9lx1e76fm.R.inc(8611);List<Position> positions = new LinkedList<>();

            __CLR4_5_26m96m9lx1e76fm.R.inc(8612);int recordCount = 1;
            __CLR4_5_26m96m9lx1e76fm.R.inc(8613);if ((((type == MSG_LOGMSG)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8614)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8615)==0&false))) {{
                __CLR4_5_26m96m9lx1e76fm.R.inc(8616);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_26m96m9lx1e76fm.R.inc(8617);for (int j = 0; (((j < recordCount)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8618)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8619)==0&false)); j++) {{
                __CLR4_5_26m96m9lx1e76fm.R.inc(8620);Position position = new Position();
                __CLR4_5_26m96m9lx1e76fm.R.inc(8621);position.setProtocol(getProtocolName());
                __CLR4_5_26m96m9lx1e76fm.R.inc(8622);position.setDeviceId(getDeviceId());

                // Message index
                __CLR4_5_26m96m9lx1e76fm.R.inc(8623);if ((((type == MSG_LOGMSG)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8624)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8625)==0&false))) {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8626);position.set(Event.KEY_ARCHIVE, true);
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8627);int subtype = buf.readUnsignedShort();
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8628);if ((((subtype == MSG_ALARM)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8629)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8630)==0&false))) {{
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8631);position.set(Event.KEY_ALARM, true);
                    }
                    }__CLR4_5_26m96m9lx1e76fm.R.inc(8632);if ((((buf.readUnsignedShort() > buf.readableBytes())&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8633)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8634)==0&false))) {{
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8635);lastIndex += 1;
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8636);break; // workaround for device bug
                    }
                    }__CLR4_5_26m96m9lx1e76fm.R.inc(8637);lastIndex = buf.readUnsignedInt();
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8638);position.set(Event.KEY_INDEX, lastIndex);
                } }else {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8639);newIndex = buf.readUnsignedInt();
                }

                // Time
                }__CLR4_5_26m96m9lx1e76fm.R.inc(8640);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_26m96m9lx1e76fm.R.inc(8641);time.clear();
                __CLR4_5_26m96m9lx1e76fm.R.inc(8642);time.setTimeInMillis(buf.readUnsignedInt() * 1000);
                __CLR4_5_26m96m9lx1e76fm.R.inc(8643);position.setTime(time.getTime());

                // Latitude
                __CLR4_5_26m96m9lx1e76fm.R.inc(8644);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Longitude
                __CLR4_5_26m96m9lx1e76fm.R.inc(8645);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Speed
                __CLR4_5_26m96m9lx1e76fm.R.inc(8646);position.setSpeed(buf.readUnsignedInt() / 100);

                // Course
                __CLR4_5_26m96m9lx1e76fm.R.inc(8647);position.setCourse(buf.readUnsignedShort() / 100);

                // Altitude
                __CLR4_5_26m96m9lx1e76fm.R.inc(8648);position.setAltitude(buf.readUnsignedShort() / 100);

                // Satellites
                __CLR4_5_26m96m9lx1e76fm.R.inc(8649);int satellitesNumber = buf.readUnsignedByte();
                __CLR4_5_26m96m9lx1e76fm.R.inc(8650);position.set(Event.KEY_SATELLITES, satellitesNumber);

                // Validity
                __CLR4_5_26m96m9lx1e76fm.R.inc(8651);position.setValid(satellitesNumber >= 3); // TODO: probably wrong

                // Cell signal
                __CLR4_5_26m96m9lx1e76fm.R.inc(8652);position.set(Event.KEY_GSM, buf.readUnsignedByte());

                // Odometer
                __CLR4_5_26m96m9lx1e76fm.R.inc(8653);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_26m96m9lx1e76fm.R.inc(8654);long extraFlags = buf.readLong();

                // Analog inputs
                __CLR4_5_26m96m9lx1e76fm.R.inc(8655);if (((((extraFlags & 0x1) == 0x1)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8656)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8657)==0&false))) {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8658);int count = buf.readUnsignedShort();
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8659);for (int i = 1; (((i <= count)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8660)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8661)==0&false)); i++) {{
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8662);position.set(Event.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                }}

                // CAN adapter
                }__CLR4_5_26m96m9lx1e76fm.R.inc(8663);if (((((extraFlags & 0x2) == 0x2)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8664)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8665)==0&false))) {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8666);int size = buf.readUnsignedShort();
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8667);position.set("can", buf.toString(buf.readerIndex(), size, Charset.defaultCharset()));
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8668);buf.skipBytes(size);
                }

                // Passenger sensor
                }__CLR4_5_26m96m9lx1e76fm.R.inc(8669);if (((((extraFlags & 0x4) == 0x4)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8670)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8671)==0&false))) {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8672);int size = buf.readUnsignedShort();

                    // Convert binary data to hex
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8673);StringBuilder hex = new StringBuilder();
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8674);for (int i = buf.readerIndex(); (((i < buf.readerIndex() + size)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8675)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8676)==0&false)); i++) {{
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8677);byte b = buf.getByte(i);
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8678);hex.append(HEX_CHARS.charAt((b & 0xf0) >> 4));
                        __CLR4_5_26m96m9lx1e76fm.R.inc(8679);hex.append(HEX_CHARS.charAt((b & 0x0F)));
                    }

                    }__CLR4_5_26m96m9lx1e76fm.R.inc(8680);position.set("passenger", hex.toString());

                    __CLR4_5_26m96m9lx1e76fm.R.inc(8681);buf.skipBytes(size);
                }

                // Send response for alarm message
                }__CLR4_5_26m96m9lx1e76fm.R.inc(8682);if ((((type == MSG_ALARM)&&(__CLR4_5_26m96m9lx1e76fm.R.iget(8683)!=0|true))||(__CLR4_5_26m96m9lx1e76fm.R.iget(8684)==0&false))) {{
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8685);byte[] response = {(byte)0xC9,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
                    __CLR4_5_26m96m9lx1e76fm.R.inc(8686);channel.write(ChannelBuffers.wrappedBuffer(response));

                    __CLR4_5_26m96m9lx1e76fm.R.inc(8687);position.set(Event.KEY_ALARM, true);
                }

                // Skip CRC
                }__CLR4_5_26m96m9lx1e76fm.R.inc(8688);buf.readUnsignedInt();

                __CLR4_5_26m96m9lx1e76fm.R.inc(8689);positions.add(position);
            }

            }__CLR4_5_26m96m9lx1e76fm.R.inc(8690);requestArchive(channel);

            __CLR4_5_26m96m9lx1e76fm.R.inc(8691);return positions;
        }

        }}__CLR4_5_26m96m9lx1e76fm.R.inc(8692);return null;
    }finally{__CLR4_5_26m96m9lx1e76fm.R.flushNeeded();}}

}
