/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
import org.traccar.helper.Crc;
import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ApelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_21sv1svlx1e73uu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,2462,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ApelProtocolDecoder(ApelProtocol protocol) {
        super(protocol);__CLR4_5_21sv1svlx1e73uu.R.inc(2336);try{__CLR4_5_21sv1svlx1e73uu.R.inc(2335);
    }finally{__CLR4_5_21sv1svlx1e73uu.R.flushNeeded();}}

    /*
     * Message types
     */
    private static final short MSG_TYPE_NULL = 0;
    private static final short MSG_TYPE_REQUEST_TRACKER_ID = 10;
    private static final short MSG_TYPE_TRACKER_ID = 11;
    private static final short MSG_TYPE_TRACKER_ID_EXT = 12;
    private static final short MSG_TYPE_DISCONNECT = 20;
    private static final short MSG_TYPE_REQUEST_PASSWORD = 30;
    private static final short MSG_TYPE_PASSWORD = 31;
    private static final short MSG_TYPE_REQUEST_STATE_FULL_INFO = 90;
    private static final short MSG_TYPE_STATE_FULL_INFO_T104 = 92;
    private static final short MSG_TYPE_REQUEST_CURRENT_GPS_DATA = 100;
    private static final short MSG_TYPE_CURRENT_GPS_DATA = 101;
    private static final short MSG_TYPE_REQUEST_SENSORS_STATE = 110;
    private static final short MSG_TYPE_SENSORS_STATE = 111;
    private static final short MSG_TYPE_SENSORS_STATE_T100 = 112;
    private static final short MSG_TYPE_SENSORS_STATE_T100_4 = 113;
    private static final short MSG_TYPE_REQUEST_LAST_LOG_INDEX = 120;
    private static final short MSG_TYPE_LAST_LOG_INDEX = 121;
    private static final short MSG_TYPE_REQUEST_LOG_RECORDS = 130;
    private static final short MSG_TYPE_LOG_RECORDS = 131;
    private static final short MSG_TYPE_EVENT = 141;
    private static final short MSG_TYPE_TEXT = 150;
    private static final short MSG_TYPE_ACK_ALARM = 160;
    private static final short MSG_TYPE_SET_TRACKER_MODE = 170;
    private static final short MSG_TYPE_GPRS_COMMAND = 180;

    private static final String HEX_CHARS = "0123456789ABCDEF";

    private void sendSimpleMessage(Channel channel, short type) {try{__CLR4_5_21sv1svlx1e73uu.R.inc(2337);
        __CLR4_5_21sv1svlx1e73uu.R.inc(2338);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_21sv1svlx1e73uu.R.inc(2339);request.writeShort(type);
        __CLR4_5_21sv1svlx1e73uu.R.inc(2340);request.writeShort(0);
        __CLR4_5_21sv1svlx1e73uu.R.inc(2341);request.writeInt(Crc.crc32(request.toByteBuffer(0, 4)));
        __CLR4_5_21sv1svlx1e73uu.R.inc(2342);channel.write(request);
    }finally{__CLR4_5_21sv1svlx1e73uu.R.flushNeeded();}}

    private void requestArchive(Channel channel) {try{__CLR4_5_21sv1svlx1e73uu.R.inc(2343);
        __CLR4_5_21sv1svlx1e73uu.R.inc(2344);if ((((lastIndex == 0)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2345)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2346)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2347);lastIndex = newIndex;
        } }else {__CLR4_5_21sv1svlx1e73uu.R.inc(2348);if ((((newIndex > lastIndex)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2349)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2350)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2351);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 14);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2352);request.writeShort(MSG_TYPE_REQUEST_LOG_RECORDS);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2353);request.writeShort(6);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2354);request.writeInt((int) lastIndex);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2355);request.writeShort(512);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2356);request.writeInt(Crc.crc32(request.toByteBuffer(0, 10)));
            __CLR4_5_21sv1svlx1e73uu.R.inc(2357);channel.write(request);
        }
    }}}finally{__CLR4_5_21sv1svlx1e73uu.R.flushNeeded();}}

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_21sv1svlx1e73uu.R.inc(2358);

        __CLR4_5_21sv1svlx1e73uu.R.inc(2359);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_21sv1svlx1e73uu.R.inc(2360);int type = buf.readUnsignedShort();
        __CLR4_5_21sv1svlx1e73uu.R.inc(2361);boolean alarm = (type & 0x8000) != 0;
        __CLR4_5_21sv1svlx1e73uu.R.inc(2362);type = type & 0x7FFF;
        __CLR4_5_21sv1svlx1e73uu.R.inc(2363);buf.readUnsignedShort(); // length
        
        __CLR4_5_21sv1svlx1e73uu.R.inc(2364);if ((((alarm)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2365)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2366)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2367);sendSimpleMessage(channel, MSG_TYPE_ACK_ALARM);
        }
        
        }__CLR4_5_21sv1svlx1e73uu.R.inc(2368);if ((((type == MSG_TYPE_TRACKER_ID)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2369)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2370)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2371);Log.warning("Unsupported authentication type");
            __CLR4_5_21sv1svlx1e73uu.R.inc(2372);return null;
        }

        }__CLR4_5_21sv1svlx1e73uu.R.inc(2373);if ((((type == MSG_TYPE_TRACKER_ID_EXT)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2374)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2375)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2376);long id = buf.readUnsignedInt();
            __CLR4_5_21sv1svlx1e73uu.R.inc(2377);int length = buf.readUnsignedShort();
            __CLR4_5_21sv1svlx1e73uu.R.inc(2378);buf.skipBytes(length);
            __CLR4_5_21sv1svlx1e73uu.R.inc(2379);length = buf.readUnsignedShort();
            __CLR4_5_21sv1svlx1e73uu.R.inc(2380);identify(buf.readBytes(length).toString(Charset.defaultCharset()), channel);
        }
        
        }else {__CLR4_5_21sv1svlx1e73uu.R.inc(2381);if ((((type == MSG_TYPE_LAST_LOG_INDEX)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2382)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2383)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2384);long index = buf.readUnsignedInt();
            __CLR4_5_21sv1svlx1e73uu.R.inc(2385);if ((((index > 0)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2386)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2387)==0&false))) {{
                __CLR4_5_21sv1svlx1e73uu.R.inc(2388);newIndex = index;
                __CLR4_5_21sv1svlx1e73uu.R.inc(2389);requestArchive(channel);
            }
        }}

        // Position
        }else {__CLR4_5_21sv1svlx1e73uu.R.inc(2390);if ((((hasDeviceId() && (type == MSG_TYPE_CURRENT_GPS_DATA || type == MSG_TYPE_STATE_FULL_INFO_T104 || type == MSG_TYPE_LOG_RECORDS))&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2391)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2392)==0&false))) {{
            __CLR4_5_21sv1svlx1e73uu.R.inc(2393);List<Position> positions = new LinkedList<>();

            __CLR4_5_21sv1svlx1e73uu.R.inc(2394);int recordCount = 1;
            __CLR4_5_21sv1svlx1e73uu.R.inc(2395);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2396)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2397)==0&false))) {{
                __CLR4_5_21sv1svlx1e73uu.R.inc(2398);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_21sv1svlx1e73uu.R.inc(2399);for (int j = 0; (((j < recordCount)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2400)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2401)==0&false)); j++) {{
                __CLR4_5_21sv1svlx1e73uu.R.inc(2402);Position position = new Position();
                __CLR4_5_21sv1svlx1e73uu.R.inc(2403);position.setProtocol(getProtocolName());
                __CLR4_5_21sv1svlx1e73uu.R.inc(2404);position.setDeviceId(getDeviceId());

                // Message index
                __CLR4_5_21sv1svlx1e73uu.R.inc(2405);int subtype = type;
                __CLR4_5_21sv1svlx1e73uu.R.inc(2406);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2407)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2408)==0&false))) {{
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2409);position.set(Event.KEY_ARCHIVE, true);
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2410);lastIndex = buf.readUnsignedInt() + 1;
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2411);position.set(Event.KEY_INDEX, lastIndex);

                    __CLR4_5_21sv1svlx1e73uu.R.inc(2412);subtype = buf.readUnsignedShort();
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2413);if ((((subtype != MSG_TYPE_CURRENT_GPS_DATA && subtype != MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2414)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2415)==0&false))) {{
                        __CLR4_5_21sv1svlx1e73uu.R.inc(2416);buf.skipBytes(buf.readUnsignedShort());
                        __CLR4_5_21sv1svlx1e73uu.R.inc(2417);continue;
                    }
                    }__CLR4_5_21sv1svlx1e73uu.R.inc(2418);buf.readUnsignedShort(); // length
                }

                // Time
                }__CLR4_5_21sv1svlx1e73uu.R.inc(2419);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_21sv1svlx1e73uu.R.inc(2420);time.clear();
                __CLR4_5_21sv1svlx1e73uu.R.inc(2421);time.setTimeInMillis(buf.readUnsignedInt() * 1000);
                __CLR4_5_21sv1svlx1e73uu.R.inc(2422);position.setTime(time.getTime());

                // Latitude
                __CLR4_5_21sv1svlx1e73uu.R.inc(2423);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Longitude
                __CLR4_5_21sv1svlx1e73uu.R.inc(2424);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Speed and Validity
                __CLR4_5_21sv1svlx1e73uu.R.inc(2425);if ((((subtype == MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2426)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2427)==0&false))) {{
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2428);int speed = buf.readUnsignedByte();
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2429);position.setValid(speed != 255);
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2430);position.setSpeed(UnitsConverter.knotsFromKph(speed));
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2431);position.set(Event.KEY_HDOP, buf.readByte());
                } }else {{
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2432);int speed = buf.readShort();
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2433);position.setValid(speed != -1);
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2434);position.setSpeed(UnitsConverter.knotsFromKph(speed / 100.0));
                }

                // Course
                }__CLR4_5_21sv1svlx1e73uu.R.inc(2435);position.setCourse(buf.readShort() / 100.0);

                // Altitude
                __CLR4_5_21sv1svlx1e73uu.R.inc(2436);position.setAltitude(buf.readShort());

                __CLR4_5_21sv1svlx1e73uu.R.inc(2437);if ((((subtype == MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2438)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2439)==0&false))) {{

                    // Satellites
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2440);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                    
                    // Cell signal
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2441);position.set(Event.KEY_GSM, buf.readUnsignedByte());

                    // Event type
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2442);position.set(Event.KEY_EVENT, buf.readUnsignedShort());

                    // Odometer
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2443);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

                    // Input/Output
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2444);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2445);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
                    
                    // Analog sensors
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2446);for (int i = 1; (((i <= 8)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2447)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2448)==0&false)); i++) {{
                        __CLR4_5_21sv1svlx1e73uu.R.inc(2449);position.set(Event.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                    
                    // Counters
                    }__CLR4_5_21sv1svlx1e73uu.R.inc(2450);position.set(Event.PREFIX_COUNT + 1, buf.readUnsignedInt());
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2451);position.set(Event.PREFIX_COUNT + 2, buf.readUnsignedInt());
                    __CLR4_5_21sv1svlx1e73uu.R.inc(2452);position.set(Event.PREFIX_COUNT + 3, buf.readUnsignedInt());
                }

                }__CLR4_5_21sv1svlx1e73uu.R.inc(2453);positions.add(position);
            }

            // Skip CRC
            }__CLR4_5_21sv1svlx1e73uu.R.inc(2454);buf.readUnsignedInt();
            
            __CLR4_5_21sv1svlx1e73uu.R.inc(2455);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21sv1svlx1e73uu.R.iget(2456)!=0|true))||(__CLR4_5_21sv1svlx1e73uu.R.iget(2457)==0&false))) {{
                __CLR4_5_21sv1svlx1e73uu.R.inc(2458);requestArchive(channel);
            } }else {{
                __CLR4_5_21sv1svlx1e73uu.R.inc(2459);sendSimpleMessage(channel, MSG_TYPE_REQUEST_LAST_LOG_INDEX);
            }

            }__CLR4_5_21sv1svlx1e73uu.R.inc(2460);return positions;
        }

        }}}__CLR4_5_21sv1svlx1e73uu.R.inc(2461);return null;
    }finally{__CLR4_5_21sv1svlx1e73uu.R.flushNeeded();}}

}
