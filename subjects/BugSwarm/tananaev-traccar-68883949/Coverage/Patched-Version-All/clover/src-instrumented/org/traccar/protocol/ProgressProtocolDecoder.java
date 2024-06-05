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
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ProgressProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_265j65jlx1dsnih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,8091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ProgressProtocolDecoder(ProgressProtocol protocol) {
        super(protocol);__CLR4_5_265j65jlx1dsnih.R.inc(7976);try{__CLR4_5_265j65jlx1dsnih.R.inc(7975);
    }finally{__CLR4_5_265j65jlx1dsnih.R.flushNeeded();}}

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

    private void requestArchive(Channel channel) {try{__CLR4_5_265j65jlx1dsnih.R.inc(7977);
        __CLR4_5_265j65jlx1dsnih.R.inc(7978);if ((((lastIndex == 0)&&(__CLR4_5_265j65jlx1dsnih.R.iget(7979)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(7980)==0&false))) {{
            __CLR4_5_265j65jlx1dsnih.R.inc(7981);lastIndex = newIndex;
        } }else {__CLR4_5_265j65jlx1dsnih.R.inc(7982);if ((((newIndex > lastIndex)&&(__CLR4_5_265j65jlx1dsnih.R.iget(7983)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(7984)==0&false))) {{
            __CLR4_5_265j65jlx1dsnih.R.inc(7985);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 12);
            __CLR4_5_265j65jlx1dsnih.R.inc(7986);request.writeShort(MSG_LOG_SYNC);
            __CLR4_5_265j65jlx1dsnih.R.inc(7987);request.writeShort(4);
            __CLR4_5_265j65jlx1dsnih.R.inc(7988);request.writeInt((int) lastIndex);
            __CLR4_5_265j65jlx1dsnih.R.inc(7989);request.writeInt(0);
            __CLR4_5_265j65jlx1dsnih.R.inc(7990);channel.write(request);
        }
    }}}finally{__CLR4_5_265j65jlx1dsnih.R.flushNeeded();}}

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {try{__CLR4_5_265j65jlx1dsnih.R.inc(7991);

        __CLR4_5_265j65jlx1dsnih.R.inc(7992);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_265j65jlx1dsnih.R.inc(7993);int type = buf.readUnsignedShort();
        __CLR4_5_265j65jlx1dsnih.R.inc(7994);buf.readUnsignedShort(); // length

        // Authentication
        __CLR4_5_265j65jlx1dsnih.R.inc(7995);if ((((type == MSG_IDENT || type == MSG_IDENT_FULL)&&(__CLR4_5_265j65jlx1dsnih.R.iget(7996)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(7997)==0&false))) {{
            __CLR4_5_265j65jlx1dsnih.R.inc(7998);long id = buf.readUnsignedInt();
            __CLR4_5_265j65jlx1dsnih.R.inc(7999);int length = buf.readUnsignedShort();
            __CLR4_5_265j65jlx1dsnih.R.inc(8000);buf.skipBytes(length);
            __CLR4_5_265j65jlx1dsnih.R.inc(8001);length = buf.readUnsignedShort();
            __CLR4_5_265j65jlx1dsnih.R.inc(8002);buf.skipBytes(length);
            __CLR4_5_265j65jlx1dsnih.R.inc(8003);length = buf.readUnsignedShort();
            __CLR4_5_265j65jlx1dsnih.R.inc(8004);String imei = buf.readBytes(length).toString(Charset.defaultCharset());
            __CLR4_5_265j65jlx1dsnih.R.inc(8005);identify(imei, channel);
        }

        // Position
        }else {__CLR4_5_265j65jlx1dsnih.R.inc(8006);if ((((hasDeviceId() && (type == MSG_POINT || type == MSG_ALARM || type == MSG_LOGMSG))&&(__CLR4_5_265j65jlx1dsnih.R.iget(8007)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8008)==0&false))) {{
            __CLR4_5_265j65jlx1dsnih.R.inc(8009);List<Position> positions = new LinkedList<Position>();

            __CLR4_5_265j65jlx1dsnih.R.inc(8010);int recordCount = 1;
            __CLR4_5_265j65jlx1dsnih.R.inc(8011);if ((((type == MSG_LOGMSG)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8012)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8013)==0&false))) {{
                __CLR4_5_265j65jlx1dsnih.R.inc(8014);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_265j65jlx1dsnih.R.inc(8015);for (int j = 0; (((j < recordCount)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8016)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8017)==0&false)); j++) {{
                __CLR4_5_265j65jlx1dsnih.R.inc(8018);Position position = new Position();
                __CLR4_5_265j65jlx1dsnih.R.inc(8019);position.setProtocol(getProtocolName());
                __CLR4_5_265j65jlx1dsnih.R.inc(8020);position.setDeviceId(getDeviceId());

                // Message index
                __CLR4_5_265j65jlx1dsnih.R.inc(8021);if ((((type == MSG_LOGMSG)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8022)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8023)==0&false))) {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8024);position.set("archive", true);
                    __CLR4_5_265j65jlx1dsnih.R.inc(8025);int subtype = buf.readUnsignedShort();
                    __CLR4_5_265j65jlx1dsnih.R.inc(8026);if ((((subtype == MSG_ALARM)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8027)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8028)==0&false))) {{
                        __CLR4_5_265j65jlx1dsnih.R.inc(8029);position.set(Event.KEY_ALARM, true);
                    }
                    }__CLR4_5_265j65jlx1dsnih.R.inc(8030);if ((((buf.readUnsignedShort() > buf.readableBytes())&&(__CLR4_5_265j65jlx1dsnih.R.iget(8031)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8032)==0&false))) {{
                        __CLR4_5_265j65jlx1dsnih.R.inc(8033);lastIndex += 1;
                        __CLR4_5_265j65jlx1dsnih.R.inc(8034);break; // workaround for device bug
                    }
                    }__CLR4_5_265j65jlx1dsnih.R.inc(8035);lastIndex = buf.readUnsignedInt();
                    __CLR4_5_265j65jlx1dsnih.R.inc(8036);position.set(Event.KEY_INDEX, lastIndex);
                } }else {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8037);newIndex = buf.readUnsignedInt();
                }

                // Time
                }__CLR4_5_265j65jlx1dsnih.R.inc(8038);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_265j65jlx1dsnih.R.inc(8039);time.clear();
                __CLR4_5_265j65jlx1dsnih.R.inc(8040);time.setTimeInMillis(buf.readUnsignedInt() * 1000);
                __CLR4_5_265j65jlx1dsnih.R.inc(8041);position.setTime(time.getTime());

                // Latitude
                __CLR4_5_265j65jlx1dsnih.R.inc(8042);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Longitude
                __CLR4_5_265j65jlx1dsnih.R.inc(8043);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Speed
                __CLR4_5_265j65jlx1dsnih.R.inc(8044);position.setSpeed(buf.readUnsignedInt() / 100);

                // Course
                __CLR4_5_265j65jlx1dsnih.R.inc(8045);position.setCourse(buf.readUnsignedShort() / 100);

                // Altitude
                __CLR4_5_265j65jlx1dsnih.R.inc(8046);position.setAltitude(buf.readUnsignedShort() / 100);

                // Satellites
                __CLR4_5_265j65jlx1dsnih.R.inc(8047);int satellitesNumber = buf.readUnsignedByte();
                __CLR4_5_265j65jlx1dsnih.R.inc(8048);position.set(Event.KEY_SATELLITES, satellitesNumber);

                // Validity
                __CLR4_5_265j65jlx1dsnih.R.inc(8049);position.setValid(satellitesNumber >= 3); // TODO: probably wrong

                // Cell signal
                __CLR4_5_265j65jlx1dsnih.R.inc(8050);position.set(Event.KEY_GSM, buf.readUnsignedByte());

                // Odometer
                __CLR4_5_265j65jlx1dsnih.R.inc(8051);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

                __CLR4_5_265j65jlx1dsnih.R.inc(8052);long extraFlags = buf.readLong();

                // Analog inputs
                __CLR4_5_265j65jlx1dsnih.R.inc(8053);if (((((extraFlags & 0x1) == 0x1)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8054)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8055)==0&false))) {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8056);int count = buf.readUnsignedShort();
                    __CLR4_5_265j65jlx1dsnih.R.inc(8057);for (int i = 1; (((i <= count)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8058)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8059)==0&false)); i++) {{
                        __CLR4_5_265j65jlx1dsnih.R.inc(8060);position.set(Event.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                }}

                // CAN adapter
                }__CLR4_5_265j65jlx1dsnih.R.inc(8061);if (((((extraFlags & 0x2) == 0x2)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8062)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8063)==0&false))) {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8064);int size = buf.readUnsignedShort();
                    __CLR4_5_265j65jlx1dsnih.R.inc(8065);position.set("can", buf.toString(buf.readerIndex(), size, Charset.defaultCharset()));
                    __CLR4_5_265j65jlx1dsnih.R.inc(8066);buf.skipBytes(size);
                }

                // Passenger sensor
                }__CLR4_5_265j65jlx1dsnih.R.inc(8067);if (((((extraFlags & 0x4) == 0x4)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8068)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8069)==0&false))) {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8070);int size = buf.readUnsignedShort();

                    // Convert binary data to hex
                    __CLR4_5_265j65jlx1dsnih.R.inc(8071);StringBuilder hex = new StringBuilder();
                    __CLR4_5_265j65jlx1dsnih.R.inc(8072);for (int i = buf.readerIndex(); (((i < buf.readerIndex() + size)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8073)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8074)==0&false)); i++) {{
                        __CLR4_5_265j65jlx1dsnih.R.inc(8075);byte b = buf.getByte(i);
                        __CLR4_5_265j65jlx1dsnih.R.inc(8076);hex.append(HEX_CHARS.charAt((b & 0xf0) >> 4));
                        __CLR4_5_265j65jlx1dsnih.R.inc(8077);hex.append(HEX_CHARS.charAt((b & 0x0F)));
                    }

                    }__CLR4_5_265j65jlx1dsnih.R.inc(8078);position.set("passenger", hex.toString());

                    __CLR4_5_265j65jlx1dsnih.R.inc(8079);buf.skipBytes(size);
                }

                // Send response for alarm message
                }__CLR4_5_265j65jlx1dsnih.R.inc(8080);if ((((type == MSG_ALARM)&&(__CLR4_5_265j65jlx1dsnih.R.iget(8081)!=0|true))||(__CLR4_5_265j65jlx1dsnih.R.iget(8082)==0&false))) {{
                    __CLR4_5_265j65jlx1dsnih.R.inc(8083);byte[] response = {(byte)0xC9,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
                    __CLR4_5_265j65jlx1dsnih.R.inc(8084);channel.write(ChannelBuffers.wrappedBuffer(response));

                    __CLR4_5_265j65jlx1dsnih.R.inc(8085);position.set(Event.KEY_ALARM, true);
                }

                // Skip CRC
                }__CLR4_5_265j65jlx1dsnih.R.inc(8086);buf.readUnsignedInt();

                __CLR4_5_265j65jlx1dsnih.R.inc(8087);positions.add(position);
            }

            }__CLR4_5_265j65jlx1dsnih.R.inc(8088);requestArchive(channel);

            __CLR4_5_265j65jlx1dsnih.R.inc(8089);return positions;
        }

        }}__CLR4_5_265j65jlx1dsnih.R.inc(8090);return null;
    }finally{__CLR4_5_265j65jlx1dsnih.R.flushNeeded();}}

}
