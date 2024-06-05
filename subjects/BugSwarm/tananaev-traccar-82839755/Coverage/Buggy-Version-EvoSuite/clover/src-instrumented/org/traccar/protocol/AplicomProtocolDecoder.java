/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
import java.util.ArrayList;
import java.util.Date;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.Crc;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class AplicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_21x81x8lx1e35k8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,2727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AplicomProtocolDecoder(AplicomProtocol protocol) {
        super(protocol);__CLR4_5_21x81x8lx1e35k8.R.inc(2493);try{__CLR4_5_21x81x8lx1e35k8.R.inc(2492);
    }finally{__CLR4_5_21x81x8lx1e35k8.R.flushNeeded();}}

    private static final long IMEI_BASE_TC65_V20 = 0x1437207000000L;
    private static final long IMEI_BASE_TC65_V28 = 358244010000000L;
    private static final long IMEI_BASE_TC65I_V11 = 0x14143B4000000L;

    private static boolean validateImei(long imei) {try{__CLR4_5_21x81x8lx1e35k8.R.inc(2494);
        __CLR4_5_21x81x8lx1e35k8.R.inc(2495);return Crc.luhnChecksum(imei / 10) == imei % 10;
    }finally{__CLR4_5_21x81x8lx1e35k8.R.flushNeeded();}}

    private static long imeiFromUnitId(long unitId) {try{__CLR4_5_21x81x8lx1e35k8.R.inc(2496);

        __CLR4_5_21x81x8lx1e35k8.R.inc(2497);if ((((unitId == 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2498)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2499)==0&false))) {{

            __CLR4_5_21x81x8lx1e35k8.R.inc(2500);return 0;

        } }else {{

            // Try TC65i
            __CLR4_5_21x81x8lx1e35k8.R.inc(2501);long imei = IMEI_BASE_TC65I_V11 + unitId;
            __CLR4_5_21x81x8lx1e35k8.R.inc(2502);if ((((validateImei(imei))&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2503)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2504)==0&false))) {{
                __CLR4_5_21x81x8lx1e35k8.R.inc(2505);return imei;
            }
            
            // Try TC65 v2.8
            }__CLR4_5_21x81x8lx1e35k8.R.inc(2506);imei = IMEI_BASE_TC65_V28 + ((unitId + 0xA8180) & 0xFFFFFF);
            __CLR4_5_21x81x8lx1e35k8.R.inc(2507);if ((((validateImei(imei))&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2508)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2509)==0&false))) {{
                __CLR4_5_21x81x8lx1e35k8.R.inc(2510);return imei;
            }
            
            // Try TC65 v2.0
            }__CLR4_5_21x81x8lx1e35k8.R.inc(2511);imei = IMEI_BASE_TC65_V20 + unitId;
            __CLR4_5_21x81x8lx1e35k8.R.inc(2512);if ((((validateImei(imei))&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2513)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2514)==0&false))) {{
                __CLR4_5_21x81x8lx1e35k8.R.inc(2515);return imei;
            }

        }}
        
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2516);return unitId;
    }finally{__CLR4_5_21x81x8lx1e35k8.R.flushNeeded();}}

    private static final int DEFAULT_SELECTOR = 0x0002FC;

    private static final int EVENT_DATA = 119;

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg)
            throws Exception {try{__CLR4_5_21x81x8lx1e35k8.R.inc(2517);

        __CLR4_5_21x81x8lx1e35k8.R.inc(2518);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_21x81x8lx1e35k8.R.inc(2519);buf.readUnsignedByte(); // marker
        __CLR4_5_21x81x8lx1e35k8.R.inc(2520);int version = buf.readUnsignedByte();

        __CLR4_5_21x81x8lx1e35k8.R.inc(2521);String imei;
        __CLR4_5_21x81x8lx1e35k8.R.inc(2522);if (((((version & 0x80) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2523)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2524)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2525);imei = String.valueOf((buf.readUnsignedInt() << (3 * 8)) | buf.readUnsignedMedium());
        } }else {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2526);imei = String.valueOf(imeiFromUnitId(buf.readUnsignedMedium()));
        }

        }__CLR4_5_21x81x8lx1e35k8.R.inc(2527);buf.readUnsignedShort(); // length

        // Selector
        __CLR4_5_21x81x8lx1e35k8.R.inc(2528);int selector = DEFAULT_SELECTOR; // default selector
        __CLR4_5_21x81x8lx1e35k8.R.inc(2529);if (((((version & 0x40) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2530)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2531)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2532);selector = buf.readUnsignedMedium();
        }

        // Create new position
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2533);Position position = new Position();
        __CLR4_5_21x81x8lx1e35k8.R.inc(2534);position.setProtocol(getProtocolName());
        __CLR4_5_21x81x8lx1e35k8.R.inc(2535);if ((((!identify(imei, channel))&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2536)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2537)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2538);return null;
        }

        }__CLR4_5_21x81x8lx1e35k8.R.inc(2539);position.setDeviceId(getDeviceId());

        // Event
        __CLR4_5_21x81x8lx1e35k8.R.inc(2540);int event = buf.readUnsignedByte();
        __CLR4_5_21x81x8lx1e35k8.R.inc(2541);position.set(Event.KEY_EVENT, event);
        __CLR4_5_21x81x8lx1e35k8.R.inc(2542);buf.readUnsignedByte();

        // Validity
        __CLR4_5_21x81x8lx1e35k8.R.inc(2543);if (((((selector & 0x0008) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2544)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2545)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2546);position.setValid((buf.readUnsignedByte() & 0x40) != 0);
        } }else {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2547);return null; // no location data
        }

        // Time
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2548);if (((((selector & 0x0004) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2549)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2550)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2551);buf.skipBytes(4); // snapshot time
        }

        // Location
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2552);if (((((selector & 0x0008) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2553)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2554)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2555);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_21x81x8lx1e35k8.R.inc(2556);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_21x81x8lx1e35k8.R.inc(2557);position.setLongitude(buf.readInt() / 1000000.0);
            __CLR4_5_21x81x8lx1e35k8.R.inc(2558);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
        }

        // Speed and heading
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2559);if (((((selector & 0x0010) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2560)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2561)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2562);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_21x81x8lx1e35k8.R.inc(2563);buf.readUnsignedByte(); // maximum speed
            __CLR4_5_21x81x8lx1e35k8.R.inc(2564);position.setCourse(buf.readUnsignedByte() * 2.0);
        }

        // Input
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2565);if (((((selector & 0x0040) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2566)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2567)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2568);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
        }
        
        // ADC
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2569);if (((((selector & 0x0020) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2570)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2571)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2572);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_21x81x8lx1e35k8.R.inc(2573);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_21x81x8lx1e35k8.R.inc(2574);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_21x81x8lx1e35k8.R.inc(2575);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        // Power
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2576);if (((((selector & 0x8000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2577)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2578)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2579);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            __CLR4_5_21x81x8lx1e35k8.R.inc(2580);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
        }
        
        // Pulse rate 1
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2581);if (((((selector & 0x10000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2582)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2583)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2584);buf.readUnsignedShort();
            __CLR4_5_21x81x8lx1e35k8.R.inc(2585);buf.readUnsignedInt();
        }
        
        // Pulse rate 2
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2586);if (((((selector & 0x20000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2587)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2588)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2589);buf.readUnsignedShort();
            __CLR4_5_21x81x8lx1e35k8.R.inc(2590);buf.readUnsignedInt();
        }

        // Trip 1
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2591);if (((((selector & 0x0080) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2592)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2593)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2594);position.set("trip1", buf.readUnsignedInt());
        }

        // Trip 2
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2595);if (((((selector & 0x0100) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2596)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2597)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2598);position.set("trip2", buf.readUnsignedInt());
        }

        // Output
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2599);if (((((selector & 0x0040) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2600)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2601)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2602);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
        }
        
        // Button
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2603);if (((((selector & 0x0200) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2604)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2605)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2606);buf.skipBytes(6);
        }
        
        // Keypad
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2607);if (((((selector & 0x0400) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2608)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2609)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2610);buf.readUnsignedByte();
        }
        
        // Altitude
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2611);if (((((selector & 0x0800) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2612)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2613)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2614);position.setAltitude(buf.readShort());
        }

        // Snapshot counter
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2615);if (((((selector & 0x2000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2616)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2617)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2618);buf.readUnsignedShort();
        }

        // State flags
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2619);if (((((selector & 0x4000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2620)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2621)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2622);buf.skipBytes(8);
        }

        // Cell info
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2623);if (((((selector & 0x80000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2624)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2625)==0&false))) {{
            __CLR4_5_21x81x8lx1e35k8.R.inc(2626);buf.skipBytes(11);
        }

        // Event specific data
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2627);if (((((selector & 0x1000) != 0)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2628)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2629)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_21x81x8lx1e35k8.R.inc(2630);switch (event) {
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2631);__CLB4_5_2_bool0=true;}
                case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2632);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2633);buf.readUnsignedByte();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2634);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2635);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2636);buf.readUnsignedMedium();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2637);break;
                case 31:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2638);__CLB4_5_2_bool0=true;}
                case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2639);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2640);buf.readUnsignedShort();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2641);break;
                case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2642);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2643);buf.skipBytes(4 * 9);
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2644);break;
                case 113:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2645);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2646);buf.readUnsignedInt();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2647);buf.readUnsignedByte();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2648);break;
                case 121:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2649);__CLB4_5_2_bool0=true;}
                case 142:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2650);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2651);buf.readLong();
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2652);break;
                case 130:if (!__CLB4_5_2_bool0) {__CLR4_5_21x81x8lx1e35k8.R.inc(2653);__CLB4_5_2_bool0=true;}
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2654);buf.readUnsignedInt(); // incorrect
                    __CLR4_5_21x81x8lx1e35k8.R.inc(2655);break;
            }
        }

        }__CLR4_5_21x81x8lx1e35k8.R.inc(2656);if ((((Context.getConfig().getBoolean(getProtocolName() + ".can") &&
                buf.readable() && (selector & 0x1000) != 0 && event == EVENT_DATA)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2657)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2658)==0&false))) {{

            __CLR4_5_21x81x8lx1e35k8.R.inc(2659);buf.readUnsignedMedium(); // packet identifier
            __CLR4_5_21x81x8lx1e35k8.R.inc(2660);buf.readUnsignedByte(); // version
            __CLR4_5_21x81x8lx1e35k8.R.inc(2661);int count = buf.readUnsignedByte();
            __CLR4_5_21x81x8lx1e35k8.R.inc(2662);buf.readUnsignedByte(); // batch count
            __CLR4_5_21x81x8lx1e35k8.R.inc(2663);buf.readUnsignedShort(); // selector bit
            __CLR4_5_21x81x8lx1e35k8.R.inc(2664);buf.readUnsignedInt(); // timestamp

            __CLR4_5_21x81x8lx1e35k8.R.inc(2665);buf.skipBytes(8);

            __CLR4_5_21x81x8lx1e35k8.R.inc(2666);ArrayList<ChannelBuffer> values = new ArrayList<>(count);

            __CLR4_5_21x81x8lx1e35k8.R.inc(2667);for (int i = 0; (((i < count)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2668)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2669)==0&false)); i++) {{
                __CLR4_5_21x81x8lx1e35k8.R.inc(2670);values.add(buf.readBytes(8));
            }

            }__CLR4_5_21x81x8lx1e35k8.R.inc(2671);for (int i = 0; (((i < count)&&(__CLR4_5_21x81x8lx1e35k8.R.iget(2672)!=0|true))||(__CLR4_5_21x81x8lx1e35k8.R.iget(2673)==0&false)); i++) {{
                __CLR4_5_21x81x8lx1e35k8.R.inc(2674);ChannelBuffer value = values.get(i);
                boolean __CLB4_5_2_bool1=false;__CLR4_5_21x81x8lx1e35k8.R.inc(2675);switch (buf.readInt()) {
                    case 0x20D:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2676);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2677);position.set(Event.KEY_RPM, ChannelBuffers.swapShort(value.readShort()));
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2678);position.set("diesel-temperature", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2679);position.set("battery-voltage", ChannelBuffers.swapShort(value.readShort()) * 0.01);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2680);position.set("supply-air-temp-dep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2681);break;
                    case 0x30D:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2682);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2683);position.set("active-alarm", ChannelBufferTools.readHexString(value, 16));
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2684);break;
                    case 0x40C:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2685);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2686);position.set("air-temp-dep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2687);position.set("air-temp-dep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2688);break;
                    case 0x40D:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2689);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2690);position.set("cold-unit-state", ChannelBufferTools.readHexString(value, 16));
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2691);break;
                    case 0x50C:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2692);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2693);position.set("defrost-temp-dep1", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2694);position.set("defrost-temp-dep2", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2695);break;
                    case 0x50D:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2696);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2697);position.set("condenser-pressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2698);position.set("suction-pressure", ChannelBuffers.swapShort(value.readShort()) * 0.1);
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2699);break;
                    case 0x58C:if (!__CLB4_5_2_bool1) {__CLR4_5_21x81x8lx1e35k8.R.inc(2700);__CLB4_5_2_bool1=true;}
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2701);value.readByte();
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2702);value.readShort(); // index
                        boolean __CLB4_5_2_bool2=false;__CLR4_5_21x81x8lx1e35k8.R.inc(2703);switch (value.readByte()) {
                            case 0x01:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2704);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2705);position.set("setpoint-zone1", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2706);break;
                            case 0x02:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2707);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2708);position.set("setpoint-zone2", ChannelBuffers.swapInt(value.readInt()) * 0.1);
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2709);break;
                            case 0x05:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2710);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2711);position.set("unit-type", ChannelBuffers.swapInt(value.readInt()));
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2712);break;
                            case 0x13:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2713);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2714);position.set("diesel-hours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2715);break;
                            case 0x14:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2716);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2717);position.set("electric-hours", ChannelBuffers.swapInt(value.readInt()) / 60 / 60);
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2718);break;
                            case 0x17:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2719);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2720);position.set("service-indicator", ChannelBuffers.swapInt(value.readInt()));
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2721);break;
                            case 0x18:if (!__CLB4_5_2_bool2) {__CLR4_5_21x81x8lx1e35k8.R.inc(2722);__CLB4_5_2_bool2=true;}
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2723);position.set("software-version", ChannelBuffers.swapInt(value.readInt()) * 0.01);
                                __CLR4_5_21x81x8lx1e35k8.R.inc(2724);break;
                        }
                        __CLR4_5_21x81x8lx1e35k8.R.inc(2725);break;
                }
            }
        }}        
        
        }__CLR4_5_21x81x8lx1e35k8.R.inc(2726);return position;
    }finally{__CLR4_5_21x81x8lx1e35k8.R.flushNeeded();}}

}
