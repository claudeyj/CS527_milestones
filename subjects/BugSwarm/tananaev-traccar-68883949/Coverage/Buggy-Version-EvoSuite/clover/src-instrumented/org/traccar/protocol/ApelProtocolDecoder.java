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
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.Crc;
import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class ApelProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_21wq1wqlx1dh1t3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,2601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long lastIndex;
    private long newIndex;

    public ApelProtocolDecoder(ApelProtocol protocol) {
        super(protocol);__CLR4_5_21wq1wqlx1dh1t3.R.inc(2475);try{__CLR4_5_21wq1wqlx1dh1t3.R.inc(2474);
    }finally{__CLR4_5_21wq1wqlx1dh1t3.R.flushNeeded();}}

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

    private void sendSimpleMessage(Channel channel, short type) {try{__CLR4_5_21wq1wqlx1dh1t3.R.inc(2476);
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2477);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 8);
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2478);request.writeShort(type);
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2479);request.writeShort(0);
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2480);request.writeInt(Crc.crc32(request.toByteBuffer(0, 4)));
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2481);channel.write(request);
    }finally{__CLR4_5_21wq1wqlx1dh1t3.R.flushNeeded();}}

    private void requestArchive(Channel channel) {try{__CLR4_5_21wq1wqlx1dh1t3.R.inc(2482);
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2483);if ((((lastIndex == 0)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2484)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2485)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2486);lastIndex = newIndex;
        } }else {__CLR4_5_21wq1wqlx1dh1t3.R.inc(2487);if ((((newIndex > lastIndex)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2488)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2489)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2490);ChannelBuffer request = ChannelBuffers.directBuffer(ByteOrder.LITTLE_ENDIAN, 14);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2491);request.writeShort(MSG_TYPE_REQUEST_LOG_RECORDS);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2492);request.writeShort(6);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2493);request.writeInt((int) lastIndex);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2494);request.writeShort(512);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2495);request.writeInt(Crc.crc32(request.toByteBuffer(0, 10)));
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2496);channel.write(request);
        }
    }}}finally{__CLR4_5_21wq1wqlx1dh1t3.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_21wq1wqlx1dh1t3.R.inc(2497);

        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2498);ChannelBuffer buf = (ChannelBuffer) msg;
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2499);int type = buf.readUnsignedShort();
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2500);boolean alarm = (type & 0x8000) != 0;
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2501);type = type & 0x7FFF;
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2502);buf.readUnsignedShort(); // length
        
        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2503);if ((((alarm)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2504)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2505)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2506);sendSimpleMessage(channel, MSG_TYPE_ACK_ALARM);
        }
        
        }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2507);if ((((type == MSG_TYPE_TRACKER_ID)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2508)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2509)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2510);Log.warning("Unsupported authentication type");
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2511);return null;
        }

        }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2512);if ((((type == MSG_TYPE_TRACKER_ID_EXT)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2513)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2514)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2515);long id = buf.readUnsignedInt();
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2516);int length = buf.readUnsignedShort();
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2517);buf.skipBytes(length);
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2518);length = buf.readUnsignedShort();
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2519);identify(buf.readBytes(length).toString(Charset.defaultCharset()), channel);
        }
        
        }else {__CLR4_5_21wq1wqlx1dh1t3.R.inc(2520);if ((((type == MSG_TYPE_LAST_LOG_INDEX)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2521)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2522)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2523);long index = buf.readUnsignedInt();
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2524);if ((((index > 0)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2525)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2526)==0&false))) {{
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2527);newIndex = index;
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2528);requestArchive(channel);
            }
        }}

        // Position
        }else {__CLR4_5_21wq1wqlx1dh1t3.R.inc(2529);if ((((hasDeviceId() && (type == MSG_TYPE_CURRENT_GPS_DATA || type == MSG_TYPE_STATE_FULL_INFO_T104 || type == MSG_TYPE_LOG_RECORDS))&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2530)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2531)==0&false))) {{
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2532);List<Position> positions = new LinkedList<Position>();

            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2533);int recordCount = 1;
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2534);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2535)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2536)==0&false))) {{
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2537);recordCount = buf.readUnsignedShort();
            }

            }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2538);for (int j = 0; (((j < recordCount)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2539)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2540)==0&false)); j++) {{
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2541);Position position = new Position();
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2542);position.setProtocol(getProtocolName());
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2543);position.setDeviceId(getDeviceId());

                // Message index
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2544);int subtype = type;
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2545);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2546)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2547)==0&false))) {{
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2548);position.set("archive", true);
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2549);lastIndex = buf.readUnsignedInt() + 1;
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2550);position.set(Event.KEY_INDEX, lastIndex);

                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2551);subtype = buf.readUnsignedShort();
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2552);if ((((subtype != MSG_TYPE_CURRENT_GPS_DATA && subtype != MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2553)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2554)==0&false))) {{
                        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2555);buf.skipBytes(buf.readUnsignedShort());
                        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2556);continue;
                    }
                    }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2557);buf.readUnsignedShort(); // length
                }

                // Time
                }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2558);Calendar time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2559);time.clear();
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2560);time.setTimeInMillis(buf.readUnsignedInt() * 1000);
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2561);position.setTime(time.getTime());

                // Latitude
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2562);position.setLatitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Longitude
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2563);position.setLongitude(buf.readInt() * 180.0 / 0x7FFFFFFF);

                // Speed and Validity
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2564);if ((((subtype == MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2565)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2566)==0&false))) {{
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2567);int speed = buf.readUnsignedByte();
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2568);position.setValid(speed != 255);
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2569);position.setSpeed(UnitsConverter.knotsFromKph(speed));
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2570);position.set(Event.KEY_HDOP, buf.readByte());
                } }else {{
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2571);int speed = buf.readShort();
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2572);position.setValid(speed != -1);
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2573);position.setSpeed(UnitsConverter.knotsFromKph(speed / 100.0));
                }

                // Course
                }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2574);position.setCourse(buf.readShort() / 100.0);

                // Altitude
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2575);position.setAltitude(buf.readShort());

                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2576);if ((((subtype == MSG_TYPE_STATE_FULL_INFO_T104)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2577)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2578)==0&false))) {{

                    // Satellites
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2579);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
                    
                    // Cell signal
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2580);position.set(Event.KEY_GSM, buf.readUnsignedByte());

                    // Event type
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2581);position.set(Event.KEY_EVENT, buf.readUnsignedShort());

                    // Odometer
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2582);position.set(Event.KEY_ODOMETER, buf.readUnsignedInt());

                    // Input/Output
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2583);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2584);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
                    
                    // Analog sensors
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2585);for (int i = 1; (((i <= 8)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2586)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2587)==0&false)); i++) {{
                        __CLR4_5_21wq1wqlx1dh1t3.R.inc(2588);position.set(Event.PREFIX_ADC + i, buf.readUnsignedShort());
                    }
                    
                    // Counters
                    }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2589);position.set(Event.PREFIX_COUNT + 1, buf.readUnsignedInt());
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2590);position.set(Event.PREFIX_COUNT + 2, buf.readUnsignedInt());
                    __CLR4_5_21wq1wqlx1dh1t3.R.inc(2591);position.set(Event.PREFIX_COUNT + 3, buf.readUnsignedInt());
                }

                }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2592);positions.add(position);
            }

            // Skip CRC
            }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2593);buf.readUnsignedInt();
            
            __CLR4_5_21wq1wqlx1dh1t3.R.inc(2594);if ((((type == MSG_TYPE_LOG_RECORDS)&&(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2595)!=0|true))||(__CLR4_5_21wq1wqlx1dh1t3.R.iget(2596)==0&false))) {{
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2597);requestArchive(channel);
            } }else {{
                __CLR4_5_21wq1wqlx1dh1t3.R.inc(2598);sendSimpleMessage(channel, MSG_TYPE_REQUEST_LAST_LOG_INDEX);
            }

            }__CLR4_5_21wq1wqlx1dh1t3.R.inc(2599);return positions;
        }

        }}}__CLR4_5_21wq1wqlx1dh1t3.R.inc(2600);return null;
    }finally{__CLR4_5_21wq1wqlx1dh1t3.R.flushNeeded();}}

}
