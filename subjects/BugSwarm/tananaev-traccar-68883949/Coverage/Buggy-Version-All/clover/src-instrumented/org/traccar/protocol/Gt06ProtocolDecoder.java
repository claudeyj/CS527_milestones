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

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;

public class Gt06ProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_242h42hlx1dlotr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,5414,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean forceTimeZone = false;
    private final TimeZone timeZone = TimeZone.getTimeZone("UTC");

    public Gt06ProtocolDecoder(Gt06Protocol protocol) {
        super(protocol);__CLR4_5_242h42hlx1dlotr.R.inc(5274);try{__CLR4_5_242h42hlx1dlotr.R.inc(5273);

        __CLR4_5_242h42hlx1dlotr.R.inc(5275);Properties properties = Context.getProps();
        __CLR4_5_242h42hlx1dlotr.R.inc(5276);if ((((properties != null && properties.containsKey(protocol + ".timezone"))&&(__CLR4_5_242h42hlx1dlotr.R.iget(5277)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5278)==0&false))) {{
            __CLR4_5_242h42hlx1dlotr.R.inc(5279);forceTimeZone = true;
            __CLR4_5_242h42hlx1dlotr.R.inc(5280);timeZone.setRawOffset(Integer.valueOf(properties.getProperty(protocol + ".timezone")) * 1000);
        }
    }}finally{__CLR4_5_242h42hlx1dlotr.R.flushNeeded();}}

    private String readImei(ChannelBuffer buf) {try{__CLR4_5_242h42hlx1dlotr.R.inc(5281);
        __CLR4_5_242h42hlx1dlotr.R.inc(5282);int b = buf.readUnsignedByte();
        __CLR4_5_242h42hlx1dlotr.R.inc(5283);StringBuilder imei = new StringBuilder();
        __CLR4_5_242h42hlx1dlotr.R.inc(5284);imei.append(b & 0x0F);
        __CLR4_5_242h42hlx1dlotr.R.inc(5285);for (int i = 0; (((i < 7)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5286)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5287)==0&false)); i++) {{
            __CLR4_5_242h42hlx1dlotr.R.inc(5288);b = buf.readUnsignedByte();
            __CLR4_5_242h42hlx1dlotr.R.inc(5289);imei.append((b & 0xF0) >> 4);
            __CLR4_5_242h42hlx1dlotr.R.inc(5290);imei.append(b & 0x0F);
        }
        }__CLR4_5_242h42hlx1dlotr.R.inc(5291);return imei.toString();
    }finally{__CLR4_5_242h42hlx1dlotr.R.flushNeeded();}}

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

    private static void sendResponse(Channel channel, int type, int index) {try{__CLR4_5_242h42hlx1dlotr.R.inc(5292);
        __CLR4_5_242h42hlx1dlotr.R.inc(5293);if ((((channel != null)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5294)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5295)==0&false))) {{
            __CLR4_5_242h42hlx1dlotr.R.inc(5296);ChannelBuffer response = ChannelBuffers.directBuffer(10);
            __CLR4_5_242h42hlx1dlotr.R.inc(5297);response.writeByte(0x78); __CLR4_5_242h42hlx1dlotr.R.inc(5298);response.writeByte(0x78); // header
            __CLR4_5_242h42hlx1dlotr.R.inc(5299);response.writeByte(0x05); // size
            __CLR4_5_242h42hlx1dlotr.R.inc(5300);response.writeByte(type);
            __CLR4_5_242h42hlx1dlotr.R.inc(5301);response.writeShort(index);
            __CLR4_5_242h42hlx1dlotr.R.inc(5302);response.writeShort(Crc.crc16Ccitt(response.toByteBuffer(2, 4)));
            __CLR4_5_242h42hlx1dlotr.R.inc(5303);response.writeByte(0x0D); __CLR4_5_242h42hlx1dlotr.R.inc(5304);response.writeByte(0x0A); // ending
            __CLR4_5_242h42hlx1dlotr.R.inc(5305);channel.write(response);
        }
    }}finally{__CLR4_5_242h42hlx1dlotr.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_242h42hlx1dlotr.R.inc(5306);

        __CLR4_5_242h42hlx1dlotr.R.inc(5307);ChannelBuffer buf = (ChannelBuffer) msg;

        // Check header
        __CLR4_5_242h42hlx1dlotr.R.inc(5308);if ((((buf.readByte() != 0x78 || buf.readByte() != 0x78)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5309)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5310)==0&false))) {{
            __CLR4_5_242h42hlx1dlotr.R.inc(5311);return null;
        }
        
        }__CLR4_5_242h42hlx1dlotr.R.inc(5312);int length = buf.readUnsignedByte(); // size
        __CLR4_5_242h42hlx1dlotr.R.inc(5313);int dataLength = length - 5;

        __CLR4_5_242h42hlx1dlotr.R.inc(5314);int type = buf.readUnsignedByte();
        
        __CLR4_5_242h42hlx1dlotr.R.inc(5315);if ((((type == MSG_LOGIN)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5316)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5317)==0&false))) {{

            __CLR4_5_242h42hlx1dlotr.R.inc(5318);String imei = readImei(buf);
            __CLR4_5_242h42hlx1dlotr.R.inc(5319);buf.readUnsignedShort(); // type

            // Timezone offset
            __CLR4_5_242h42hlx1dlotr.R.inc(5320);if ((((dataLength > 10)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5321)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5322)==0&false))) {{
                __CLR4_5_242h42hlx1dlotr.R.inc(5323);int extensionBits = buf.readUnsignedShort();
                __CLR4_5_242h42hlx1dlotr.R.inc(5324);int hours = (extensionBits >> 4) / 100;
                __CLR4_5_242h42hlx1dlotr.R.inc(5325);int minutes = (extensionBits >> 4) % 100;
                __CLR4_5_242h42hlx1dlotr.R.inc(5326);int offset = (hours * 60 + minutes) * 60;
                __CLR4_5_242h42hlx1dlotr.R.inc(5327);if (((((extensionBits & 0x8) != 0)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5328)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5329)==0&false))) {{
                    __CLR4_5_242h42hlx1dlotr.R.inc(5330);offset = -offset;
                }
                }__CLR4_5_242h42hlx1dlotr.R.inc(5331);if ((((!forceTimeZone)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5332)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5333)==0&false))) {{
                    __CLR4_5_242h42hlx1dlotr.R.inc(5334);timeZone.setRawOffset(offset);
                }
            }}

            }__CLR4_5_242h42hlx1dlotr.R.inc(5335);if ((((identify(imei, channel))&&(__CLR4_5_242h42hlx1dlotr.R.iget(5336)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5337)==0&false))) {{
                __CLR4_5_242h42hlx1dlotr.R.inc(5338);buf.skipBytes(buf.readableBytes() - 6);
                __CLR4_5_242h42hlx1dlotr.R.inc(5339);sendResponse(channel, type, buf.readUnsignedShort());
            }

        }} }else {__CLR4_5_242h42hlx1dlotr.R.inc(5340);if ((((hasDeviceId() && (
                type == MSG_GPS ||
                type == MSG_GPS_LBS_1 ||
                type == MSG_GPS_LBS_2 ||
                type == MSG_GPS_LBS_STATUS_1 ||
                type == MSG_GPS_LBS_STATUS_2 ||
                type == MSG_GPS_LBS_STATUS_3 ||
                type == MSG_GPS_PHONE ||
                type == MSG_GPS_LBS_EXTEND))&&(__CLR4_5_242h42hlx1dlotr.R.iget(5341)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5342)==0&false))) {{

            // Create new position
            __CLR4_5_242h42hlx1dlotr.R.inc(5343);Position position = new Position();
            __CLR4_5_242h42hlx1dlotr.R.inc(5344);position.setDeviceId(getDeviceId());
            __CLR4_5_242h42hlx1dlotr.R.inc(5345);position.setProtocol(getProtocolName());

            // Date and time
            __CLR4_5_242h42hlx1dlotr.R.inc(5346);Calendar time = Calendar.getInstance(timeZone);
            __CLR4_5_242h42hlx1dlotr.R.inc(5347);time.clear();
            __CLR4_5_242h42hlx1dlotr.R.inc(5348);time.set(Calendar.YEAR, 2000 + buf.readUnsignedByte());
            __CLR4_5_242h42hlx1dlotr.R.inc(5349);time.set(Calendar.MONTH, buf.readUnsignedByte() - 1);
            __CLR4_5_242h42hlx1dlotr.R.inc(5350);time.set(Calendar.DAY_OF_MONTH, buf.readUnsignedByte());
            __CLR4_5_242h42hlx1dlotr.R.inc(5351);time.set(Calendar.HOUR_OF_DAY, buf.readUnsignedByte());
            __CLR4_5_242h42hlx1dlotr.R.inc(5352);time.set(Calendar.MINUTE, buf.readUnsignedByte());
            __CLR4_5_242h42hlx1dlotr.R.inc(5353);time.set(Calendar.SECOND, buf.readUnsignedByte());
            __CLR4_5_242h42hlx1dlotr.R.inc(5354);position.setTime(time.getTime());

            // GPS length and Satellites count
            __CLR4_5_242h42hlx1dlotr.R.inc(5355);int gpsLength = buf.readUnsignedByte();
            __CLR4_5_242h42hlx1dlotr.R.inc(5356);position.set(Event.KEY_SATELLITES, gpsLength & 0xf);
            __CLR4_5_242h42hlx1dlotr.R.inc(5357);gpsLength >>= 4;

            // Latitude
            __CLR4_5_242h42hlx1dlotr.R.inc(5358);double latitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Longitude
            __CLR4_5_242h42hlx1dlotr.R.inc(5359);double longitude = buf.readUnsignedInt() / (60.0 * 30000.0);

            // Speed
            __CLR4_5_242h42hlx1dlotr.R.inc(5360);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));

            // Course and flags
            __CLR4_5_242h42hlx1dlotr.R.inc(5361);int union = buf.readUnsignedShort();
            __CLR4_5_242h42hlx1dlotr.R.inc(5362);position.setCourse(union & 0x03FF);
            __CLR4_5_242h42hlx1dlotr.R.inc(5363);position.setValid((union & 0x1000) != 0);
            __CLR4_5_242h42hlx1dlotr.R.inc(5364);if (((((union & 0x0400) == 0)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5365)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5366)==0&false))) {__CLR4_5_242h42hlx1dlotr.R.inc(5367);latitude = -latitude;
            }__CLR4_5_242h42hlx1dlotr.R.inc(5368);if (((((union & 0x0800) != 0)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5369)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5370)==0&false))) {__CLR4_5_242h42hlx1dlotr.R.inc(5371);longitude = -longitude;

            }__CLR4_5_242h42hlx1dlotr.R.inc(5372);position.setLatitude(latitude);
            __CLR4_5_242h42hlx1dlotr.R.inc(5373);position.setLongitude(longitude);
            
            __CLR4_5_242h42hlx1dlotr.R.inc(5374);if (((((union & 0x4000) != 0)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5375)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5376)==0&false))) {{
                __CLR4_5_242h42hlx1dlotr.R.inc(5377);position.set("acc", (union & 0x8000) != 0);
            }

            }__CLR4_5_242h42hlx1dlotr.R.inc(5378);buf.skipBytes(gpsLength - 12); // skip reserved

            __CLR4_5_242h42hlx1dlotr.R.inc(5379);if ((((type == MSG_GPS_LBS_1 || type == MSG_GPS_LBS_2 ||
                type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5380)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5381)==0&false))) {{

                __CLR4_5_242h42hlx1dlotr.R.inc(5382);int lbsLength = 0;
                __CLR4_5_242h42hlx1dlotr.R.inc(5383);if ((((type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5384)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5385)==0&false))) {{
                    __CLR4_5_242h42hlx1dlotr.R.inc(5386);lbsLength = buf.readUnsignedByte();
                }

                // Cell information
                }__CLR4_5_242h42hlx1dlotr.R.inc(5387);position.set(Event.KEY_MCC, buf.readUnsignedShort());
                __CLR4_5_242h42hlx1dlotr.R.inc(5388);position.set(Event.KEY_MNC, buf.readUnsignedByte());
                __CLR4_5_242h42hlx1dlotr.R.inc(5389);position.set(Event.KEY_LAC, buf.readUnsignedShort());
                __CLR4_5_242h42hlx1dlotr.R.inc(5390);position.set(Event.KEY_CELL, buf.readUnsignedShort() << 8 + buf.readUnsignedByte());
                __CLR4_5_242h42hlx1dlotr.R.inc(5391);buf.skipBytes(lbsLength - 9);

                // Status
                __CLR4_5_242h42hlx1dlotr.R.inc(5392);if ((((type == MSG_GPS_LBS_STATUS_1 || type == MSG_GPS_LBS_STATUS_2 || type == MSG_GPS_LBS_STATUS_3)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5393)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5394)==0&false))) {{

                    __CLR4_5_242h42hlx1dlotr.R.inc(5395);position.set(Event.KEY_ALARM, true);

                    __CLR4_5_242h42hlx1dlotr.R.inc(5396);int flags = buf.readUnsignedByte();

                    __CLR4_5_242h42hlx1dlotr.R.inc(5397);position.set("acc", (flags & 0x2) != 0);
                    // TODO parse other flags

                    // Voltage
                    __CLR4_5_242h42hlx1dlotr.R.inc(5398);position.set(Event.KEY_POWER, buf.readUnsignedByte());

                    // GSM signal
                    __CLR4_5_242h42hlx1dlotr.R.inc(5399);position.set(Event.KEY_GSM, buf.readUnsignedByte());
                }
            }}

            // Index
            }__CLR4_5_242h42hlx1dlotr.R.inc(5400);if ((((buf.readableBytes() > 6)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5401)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5402)==0&false))) {{
                __CLR4_5_242h42hlx1dlotr.R.inc(5403);buf.skipBytes(buf.readableBytes() - 6);
            }
            }__CLR4_5_242h42hlx1dlotr.R.inc(5404);int index = buf.readUnsignedShort();
            __CLR4_5_242h42hlx1dlotr.R.inc(5405);position.set(Event.KEY_INDEX, index);
            __CLR4_5_242h42hlx1dlotr.R.inc(5406);sendResponse(channel, type, index);
            __CLR4_5_242h42hlx1dlotr.R.inc(5407);return position;
        }
        
        }else {{
            __CLR4_5_242h42hlx1dlotr.R.inc(5408);buf.skipBytes(dataLength);
            __CLR4_5_242h42hlx1dlotr.R.inc(5409);if ((((type != MSG_COMMAND_0 && type != MSG_COMMAND_1 && type != MSG_COMMAND_2)&&(__CLR4_5_242h42hlx1dlotr.R.iget(5410)!=0|true))||(__CLR4_5_242h42hlx1dlotr.R.iget(5411)==0&false))) {{
                __CLR4_5_242h42hlx1dlotr.R.inc(5412);sendResponse(channel, type, buf.readUnsignedShort());
            }
        }}

        }}__CLR4_5_242h42hlx1dlotr.R.inc(5413);return null;
    }finally{__CLR4_5_242h42hlx1dlotr.R.flushNeeded();}}

}
