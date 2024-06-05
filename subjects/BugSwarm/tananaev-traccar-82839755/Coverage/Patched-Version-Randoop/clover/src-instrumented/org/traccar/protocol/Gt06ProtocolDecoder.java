/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.Calendar;
import java.util.TimeZone;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class Gt06ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_24d94d9lx1e75kn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,5808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean forceTimeZone = false;
    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    public Gt06ProtocolDecoder(Gt06Protocol protocol) {
        super(protocol);__CLR4_5_24d94d9lx1e75kn.R.inc(5662);try{__CLR4_5_24d94d9lx1e75kn.R.inc(5661);
        
        __CLR4_5_24d94d9lx1e75kn.R.inc(5663);if ((((Context.getConfig().hasKey(getProtocolName() + ".timezone"))&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5664)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5665)==0&false))) {{
            __CLR4_5_24d94d9lx1e75kn.R.inc(5666);forceTimeZone = true;
            __CLR4_5_24d94d9lx1e75kn.R.inc(5667);timeZone.setRawOffset(Context.getConfig().getInteger(getProtocolName() + ".timezone") * 1000);
        }
    }}finally{__CLR4_5_24d94d9lx1e75kn.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_24d94d9lx1e75kn.R.inc(5668);
        __CLR4_5_24d94d9lx1e75kn.R.inc(5669);int b = buf.readUnsignedByte();
        __CLR4_5_24d94d9lx1e75kn.R.inc(5670);StringBuilder imei = new StringBuilder();
        __CLR4_5_24d94d9lx1e75kn.R.inc(5671);imei.append(b & 0x0F);
        __CLR4_5_24d94d9lx1e75kn.R.inc(5672);for (int i = 0; (((i < 7)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5673)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5674)==0&false)); i++) {{
            __CLR4_5_24d94d9lx1e75kn.R.inc(5675);b = buf.readUnsignedByte();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5676);imei.append((b & 0xF0) >> 4);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5677);imei.append(b & 0x0F);
        }
        }__CLR4_5_24d94d9lx1e75kn.R.inc(5678);return imei.toString();
    }finally{__CLR4_5_24d94d9lx1e75kn.R.flushNeeded();}}

    private static final int MSG_LOGIN = 0x01;
    private static final int MSG_GPS = 0x10;
    private static final int MSG_LBS = 0x11;
    private static final int MSG_GPS_LBS_1 = 0x12;
    private static final int MSG_GPS_LBS_2 = 0x22;
    private static final int MSG_STATUS = 0x13;
    private static final int MSG_SATELLITE = 0x14;
    private static final int MSG_STRING = 0x15;
    private static final int MSG_GPS_LBS_STATUS_1 = 0x16;
    private static final int MSG_GPS_LBS_STATUS_2 = 0x26;
    private static final int MSG_GPS_LBS_STATUS_3 = 0x27;
    private static final int MSG_LBS_PHONE = 0x17;
    private static final int MSG_LBS_EXTEND = 0x18;
    private static final int MSG_LBS_STATUS = 0x19;
    private static final int MSG_GPS_PHONE = 0x1A;
    private static final int MSG_GPS_LBS_EXTEND = 0x1E;
    private static final int MSG_COMMAND_0 = 0x80;
    private static final int MSG_COMMAND_1 = 0x81;
    private static final int MSG_COMMAND_2 = 0x82;

    private static void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_24d94d9lx1e75kn.R.inc(5679);
        __CLR4_5_24d94d9lx1e75kn.R.inc(5680);if ((((channel != null)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5681)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5682)==0&false))) {{
            __CLR4_5_24d94d9lx1e75kn.R.inc(5683);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5684);response.writeByte(0x78); __CLR4_5_24d94d9lx1e75kn.R.inc(5685);response.writeByte(0x78); // header
            __CLR4_5_24d94d9lx1e75kn.R.inc(5686);response.writeByte(0x05); // size
            __CLR4_5_24d94d9lx1e75kn.R.inc(5687);response.writeByte(type);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5688);response.writeShort(index);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5689);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(2, 4)));
            __CLR4_5_24d94d9lx1e75kn.R.inc(5690);response.writeByte(0x0D); __CLR4_5_24d94d9lx1e75kn.R.inc(5691);response.writeByte(0x0A); // ending
            __CLR4_5_24d94d9lx1e75kn.R.inc(5692);channel.write(response);
        }
    }}finally{__CLR4_5_24d94d9lx1e75kn.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_24d94d9lx1e75kn.R.inc(5693);

        __CLR4_5_24d94d9lx1e75kn.R.inc(5694);ChannelBuffer buf = (ChannelBuffer) msg;

        // Check header
        __CLR4_5_24d94d9lx1e75kn.R.inc(5695);if ((((buf.readByte() != 0x78 || buf.readByte() != 0x78)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5696)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5697)==0&false))) {{
            __CLR4_5_24d94d9lx1e75kn.R.inc(5698);return null;
        }
        
        }__CLR4_5_24d94d9lx1e75kn.R.inc(5699);int length = buf.readUnsignedByte(); // size
        __CLR4_5_24d94d9lx1e75kn.R.inc(5700);int dataLength = length - 5;

        __CLR4_5_24d94d9lx1e75kn.R.inc(5701);int type = buf.readUnsignedByte();
        
        __CLR4_5_24d94d9lx1e75kn.R.inc(5702);if ((((type == MSG_LOGIN)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5703)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5704)==0&false))) {{

            __CLR4_5_24d94d9lx1e75kn.R.inc(5705);String imei = readImei(buf);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5706);buf.readUnsignedShort(); // type

            // Timezone offset
            __CLR4_5_24d94d9lx1e75kn.R.inc(5707);if ((((dataLength > 10)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5708)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5709)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5710);int extensionBits = buf.readUnsignedShort();
                __CLR4_5_24d94d9lx1e75kn.R.inc(5711);int hours = (extensionBits >> 4) / 100;
                __CLR4_5_24d94d9lx1e75kn.R.inc(5712);int minutes = (extensionBits >> 4) % 100;
                __CLR4_5_24d94d9lx1e75kn.R.inc(5713);int offset = (hours * 60 + minutes) * 60;
                __CLR4_5_24d94d9lx1e75kn.R.inc(5714);if (((((extensionBits & 0x8) != 0)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5715)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5716)==0&false))) {{
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5717);offset = -offset;
                }
                }__CLR4_5_24d94d9lx1e75kn.R.inc(5718);if ((((!forceTimeZone)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5719)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5720)==0&false))) {{
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5721);timeZone.setRawOffset(offset);
                }
            }}

            }__CLR4_5_24d94d9lx1e75kn.R.inc(5722);if ((((identify(imei, channel))&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5723)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5724)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5725);buf.skipBytes(buf.readableBytes() - 6);
                __CLR4_5_24d94d9lx1e75kn.R.inc(5726);sendResponse(channel, type, buf.readUnsignedShort());
            }

        }} }else {__CLR4_5_24d94d9lx1e75kn.R.inc(5727);if ((((hasDeviceId() && (
                type == MSG_GPS ||
                type == MSG_GPS_LBS_1 ||
                type == MSG_GPS_LBS_2 ||
                type == MSG_GPS_LBS_STATUS_1 ||
                type == MSG_GPS_LBS_STATUS_2 ||
                type == MSG_GPS_LBS_STATUS_3 ||
                type == MSG_GPS_PHONE ||
                type == MSG_GPS_LBS_EXTEND))&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5728)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5729)==0&false))) {{

            // Create new position
            __CLR4_5_24d94d9lx1e75kn.R.inc(5730);Position position = new Position();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5731);position.setDeviceId(getDeviceId());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5732);position.setProtocol(getProtocolName());

            // Date and time
            __CLR4_5_24d94d9lx1e75kn.R.inc(5733);Calendar time = Calendar.getInstance(timeZone);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5734);time.clear();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5735);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5736);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5737);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5738);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5739);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5740);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_24d94d9lx1e75kn.R.inc(5741);position.setTime(time.getTime());

            // GPS length and Satellites count
            __CLR4_5_24d94d9lx1e75kn.R.inc(5742);int gpsLength = buf.readUnsignedByte();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5743);position.set(Event.KEY_SATELLITES, gpsLength & 0b0000_1111);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5744);gpsLength >>= 4;

            // Latitude
            __CLR4_5_24d94d9lx1e75kn.R.inc(5745);double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Longitude
            __CLR4_5_24d94d9lx1e75kn.R.inc(5746);double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Speed
            __CLR4_5_24d94d9lx1e75kn.R.inc(5747);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            // Course and flags
            __CLR4_5_24d94d9lx1e75kn.R.inc(5748);int union = buf.readUnsignedShort();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5749);position.setCourse(union & 0b0000_0011_1111_1111);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5750);position.setValid((union & 0b0001_0000_0000_0000) != 0);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5751);if (((((union & 0b0000_0100_0000_0000) == 0)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5752)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5753)==0&false))) {__CLR4_5_24d94d9lx1e75kn.R.inc(5754);latitude = -latitude;
            }__CLR4_5_24d94d9lx1e75kn.R.inc(5755);if (((((union & 0b0000_1000_0000_0000) != 0)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5756)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5757)==0&false))) {__CLR4_5_24d94d9lx1e75kn.R.inc(5758);longitude = -longitude;

            }__CLR4_5_24d94d9lx1e75kn.R.inc(5759);position.setLatitude(latitude);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5760);position.setLongitude(longitude);
            
            __CLR4_5_24d94d9lx1e75kn.R.inc(5761);if (((((union & 0b0100_0000_0000_0000) != 0)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5762)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5763)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5764);position.set(Event.KEY_IGNITION, (union & 0b1000_0000_0000_0000) != 0);
            }

            }__CLR4_5_24d94d9lx1e75kn.R.inc(5765);buf.skipBytes(gpsLength - 12); // skip reserved

            __CLR4_5_24d94d9lx1e75kn.R.inc(5766);if ((((type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2 ||
                type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5767)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5768)==0&false))) {{

                __CLR4_5_24d94d9lx1e75kn.R.inc(5769);int lbsLength = 0;
                __CLR4_5_24d94d9lx1e75kn.R.inc(5770);if ((((type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5771)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5772)==0&false))) {{
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5773);lbsLength = buf.readUnsignedByte();
                }

                // Cell information
                }__CLR4_5_24d94d9lx1e75kn.R.inc(5774);position.set(Event.KEY_MCC, buf.readUnsignedShort());
                __CLR4_5_24d94d9lx1e75kn.R.inc(5775);position.set(Event.KEY_MNC, buf.readUnsignedByte());
                __CLR4_5_24d94d9lx1e75kn.R.inc(5776);position.set(Event.KEY_LAC, buf.readUnsignedShort());
                __CLR4_5_24d94d9lx1e75kn.R.inc(5777);position.set(Event.KEY_CELL, buf.readUnsignedShort() << 8 + buf.readUnsignedByte());
                __CLR4_5_24d94d9lx1e75kn.R.inc(5778);if ((((lbsLength > 0)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5779)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5780)==0&false))) {{
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5781);buf.skipBytes(lbsLength - 9);
                }

                // Status
                }__CLR4_5_24d94d9lx1e75kn.R.inc(5782);if ((((type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5783)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5784)==0&false))) {{

                    __CLR4_5_24d94d9lx1e75kn.R.inc(5785);position.set(Event.KEY_ALARM, true);

                    __CLR4_5_24d94d9lx1e75kn.R.inc(5786);int flags = buf.readUnsignedByte();

                    __CLR4_5_24d94d9lx1e75kn.R.inc(5787);position.set(Event.KEY_IGNITION, (flags & 0x2) != 0);
                    // TODO parse other flags

                    // Voltage
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5788);position.set(Event.KEY_POWER, buf.readUnsignedByte());

                    // GSM signal
                    __CLR4_5_24d94d9lx1e75kn.R.inc(5789);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                }
            }}
            
            }__CLR4_5_24d94d9lx1e75kn.R.inc(5790);if ((((type == MSG_GPS_LBS_1 && buf.readableBytes() == 4 + 6)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5791)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5792)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5793);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());
            }

            // Index
            }__CLR4_5_24d94d9lx1e75kn.R.inc(5794);if ((((buf.readableBytes() > 6)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5795)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5796)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5797);buf.skipBytes(buf.readableBytes() - 6);
            }
            }__CLR4_5_24d94d9lx1e75kn.R.inc(5798);int index = buf.readUnsignedShort();
            __CLR4_5_24d94d9lx1e75kn.R.inc(5799);position.set(Event.KEY_INDEX, index);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5800);sendResponse(channel, type, index);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5801);return position;
        }
        
        }else {{
            __CLR4_5_24d94d9lx1e75kn.R.inc(5802);buf.skipBytes(dataLength);
            __CLR4_5_24d94d9lx1e75kn.R.inc(5803);if ((((type != MSG_COMMAND_0 && type != MSG_COMMAND_1 && type != MSG_COMMAND_2)&&(__CLR4_5_24d94d9lx1e75kn.R.iget(5804)!=0|true))||(__CLR4_5_24d94d9lx1e75kn.R.iget(5805)==0&false))) {{
                __CLR4_5_24d94d9lx1e75kn.R.inc(5806);sendResponse(channel, type, buf.readUnsignedShort());
            }
        }}

        }}__CLR4_5_24d94d9lx1e75kn.R.inc(5807);return null;
    }finally{__CLR4_5_24d94d9lx1e75kn.R.flushNeeded();}}

}
