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

import java.util.ArrayList;
import java.util.Date;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.helper.ChannelBufferTools;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Event;
import org.traccar.model.Position;

@java.lang.SuppressWarnings({"fallthrough"}) public class AplicomProtocolDecoder extends BaseProtocolDecoder {public static class __CLR4_5_2213213lx1dh1yc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,2814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AplicomProtocolDecoder(AplicomProtocol protocol) {
        super(protocol);__CLR4_5_2213213lx1dh1yc.R.inc(2632);try{__CLR4_5_2213213lx1dh1yc.R.inc(2631);
    }finally{__CLR4_5_2213213lx1dh1yc.R.flushNeeded();}}

    private static final long IMEI_BASE_TC65_V20 = 0x1437207000000L;
    private static final long IMEI_BASE_TC65_V28 = 358244010000000L;
    private static final long IMEI_BASE_TC65I_V11 = 0x14143B4000000L;

    private static long imeiFromUnitId(long unitId) {try{__CLR4_5_2213213lx1dh1yc.R.inc(2633);
        __CLR4_5_2213213lx1dh1yc.R.inc(2634);if((((unitId == 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2635)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2636)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2637);return 0L;
        } }else {__CLR4_5_2213213lx1dh1yc.R.inc(2638);if((((unitId < 0x1000000)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2639)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2640)==0&false))) {{
            // Assume TC65i.
            __CLR4_5_2213213lx1dh1yc.R.inc(2641);long imei = IMEI_BASE_TC65I_V11 + unitId;
            __CLR4_5_2213213lx1dh1yc.R.inc(2642);if((((validateImei(imei))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2643)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2644)==0&false))) {{
                __CLR4_5_2213213lx1dh1yc.R.inc(2645);return imei;
            }
            
            // No? Maybe it's TC65 v2.8?
            }__CLR4_5_2213213lx1dh1yc.R.inc(2646);imei = IMEI_BASE_TC65_V28 + ((unitId + 0xA8180) & 0xFFFFFF);
            __CLR4_5_2213213lx1dh1yc.R.inc(2647);if((((validateImei(imei))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2648)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2649)==0&false))) {{
                __CLR4_5_2213213lx1dh1yc.R.inc(2650);return imei;
            }
            
            // Still no match? How about TC65 v2.0?
            }__CLR4_5_2213213lx1dh1yc.R.inc(2651);imei = IMEI_BASE_TC65_V20 + unitId;
            __CLR4_5_2213213lx1dh1yc.R.inc(2652);if((((validateImei(imei))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2653)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2654)==0&false))) {{
                __CLR4_5_2213213lx1dh1yc.R.inc(2655);return imei;
            }
        }} }else {{
            // Unit ID is full IMEI, just check it.
            __CLR4_5_2213213lx1dh1yc.R.inc(2656);if((((validateImei(unitId))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2657)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2658)==0&false))) {{
                __CLR4_5_2213213lx1dh1yc.R.inc(2659);return unitId;
            }
        }}
        
        }}__CLR4_5_2213213lx1dh1yc.R.inc(2660);return unitId;
    }finally{__CLR4_5_2213213lx1dh1yc.R.flushNeeded();}}
    
    private static boolean validateImei(long imei2) {try{__CLR4_5_2213213lx1dh1yc.R.inc(2661);

        __CLR4_5_2213213lx1dh1yc.R.inc(2662);int checksum = 0;
        __CLR4_5_2213213lx1dh1yc.R.inc(2663);long remain = imei2;

        // Iterate through all meaningful digits.
        __CLR4_5_2213213lx1dh1yc.R.inc(2664);for (int i = 0; (((remain != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2665)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2666)==0&false)); i++) {{
            // Extract the rightmost digit, that is, compute
            // imei modulo 10 (or remainder of imei / 10).
            __CLR4_5_2213213lx1dh1yc.R.inc(2667);int digit = (int) (remain % 10);

            // For each even-positioned digit, calculate the value
            // to be added to sum: Double the digit and then sum up
            // the digits of the result.
            // Example: 7 -> 2*7 = 14 -> 1 + 4 = 5
            __CLR4_5_2213213lx1dh1yc.R.inc(2668);if ((((0 != (i % 2))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2669)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2670)==0&false))) {{
                __CLR4_5_2213213lx1dh1yc.R.inc(2671);digit = digit * 2;
                __CLR4_5_2213213lx1dh1yc.R.inc(2672);if ((((digit >= 10)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2673)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2674)==0&false))) {{
                    __CLR4_5_2213213lx1dh1yc.R.inc(2675);digit = digit - 9;
                }
            }}
            }__CLR4_5_2213213lx1dh1yc.R.inc(2676);checksum = checksum + digit;

            // Remove the rightmost digit as it's already processed.
            __CLR4_5_2213213lx1dh1yc.R.inc(2677);remain = remain / 10;
        }

        // The IMEI is valid if the calculated checksum is dividable by 10.
        }__CLR4_5_2213213lx1dh1yc.R.inc(2678);return 0 == (checksum % 10);
    }finally{__CLR4_5_2213213lx1dh1yc.R.flushNeeded();}}
    
    private static final int DEFAULT_SELECTOR = 0x0002FC;

    private static final int EVENT_DATA = 119;

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_2213213lx1dh1yc.R.inc(2679);

        __CLR4_5_2213213lx1dh1yc.R.inc(2680);ChannelBuffer buf = (ChannelBuffer) msg;

        __CLR4_5_2213213lx1dh1yc.R.inc(2681);buf.readUnsignedByte(); // marker
        __CLR4_5_2213213lx1dh1yc.R.inc(2682);int version = buf.readUnsignedByte();
        __CLR4_5_2213213lx1dh1yc.R.inc(2683);if (((((version & 0x80) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2684)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2685)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2686);buf.skipBytes(4); // unit id high
        }

        }__CLR4_5_2213213lx1dh1yc.R.inc(2687);String imei = String.valueOf(imeiFromUnitId(buf.readUnsignedMedium()));

        __CLR4_5_2213213lx1dh1yc.R.inc(2688);buf.readUnsignedShort(); // length

        // Selector
        __CLR4_5_2213213lx1dh1yc.R.inc(2689);int selector = DEFAULT_SELECTOR; // default selector
        __CLR4_5_2213213lx1dh1yc.R.inc(2690);if (((((version & 0x40) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2691)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2692)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2693);selector = buf.readUnsignedMedium();
        }

        // Create new position
        }__CLR4_5_2213213lx1dh1yc.R.inc(2694);Position position = new Position();
        __CLR4_5_2213213lx1dh1yc.R.inc(2695);position.setProtocol(getProtocolName());
        __CLR4_5_2213213lx1dh1yc.R.inc(2696);if ((((!identify(imei, channel))&&(__CLR4_5_2213213lx1dh1yc.R.iget(2697)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2698)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2699);return null;
        }

        }__CLR4_5_2213213lx1dh1yc.R.inc(2700);position.setDeviceId(getDeviceId());

        // Event
        __CLR4_5_2213213lx1dh1yc.R.inc(2701);int event = buf.readUnsignedByte();
        __CLR4_5_2213213lx1dh1yc.R.inc(2702);position.set(Event.KEY_EVENT, event);
        __CLR4_5_2213213lx1dh1yc.R.inc(2703);buf.readUnsignedByte();

        // Validity
        __CLR4_5_2213213lx1dh1yc.R.inc(2704);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2705)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2706)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2707);position.setValid((buf.readUnsignedByte() & 0x40) != 0);
        } }else {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2708);return null; // no location data
        }

        // Time
        }__CLR4_5_2213213lx1dh1yc.R.inc(2709);if (((((selector & 0x0004) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2710)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2711)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2712);buf.skipBytes(4); // snapshot time
        }

        // Location
        }__CLR4_5_2213213lx1dh1yc.R.inc(2713);if (((((selector & 0x0008) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2714)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2715)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2716);position.setTime(new Date(buf.readUnsignedInt() * 1000));
            __CLR4_5_2213213lx1dh1yc.R.inc(2717);position.setLatitude(buf.readInt() / 1000000.0);
            __CLR4_5_2213213lx1dh1yc.R.inc(2718);position.setLongitude(buf.readInt() / 1000000.0);
            __CLR4_5_2213213lx1dh1yc.R.inc(2719);position.set(Event.KEY_SATELLITES, buf.readUnsignedByte());
        }

        // Speed and heading
        }__CLR4_5_2213213lx1dh1yc.R.inc(2720);if (((((selector & 0x0010) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2721)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2722)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2723);position.setSpeed(UnitsConverter.knotsFromKph(buf.readUnsignedByte()));
            __CLR4_5_2213213lx1dh1yc.R.inc(2724);buf.readUnsignedByte(); // maximum speed
            __CLR4_5_2213213lx1dh1yc.R.inc(2725);position.setCourse(buf.readUnsignedByte() * 2.0);
        }

        // Input
        }__CLR4_5_2213213lx1dh1yc.R.inc(2726);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2727)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2728)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2729);position.set(Event.KEY_INPUT, buf.readUnsignedByte());
        }
        
        // ADC
        }__CLR4_5_2213213lx1dh1yc.R.inc(2730);if (((((selector & 0x0020) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2731)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2732)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2733);position.set(Event.PREFIX_ADC + 1, buf.readUnsignedShort());
            __CLR4_5_2213213lx1dh1yc.R.inc(2734);position.set(Event.PREFIX_ADC + 2, buf.readUnsignedShort());
            __CLR4_5_2213213lx1dh1yc.R.inc(2735);position.set(Event.PREFIX_ADC + 3, buf.readUnsignedShort());
            __CLR4_5_2213213lx1dh1yc.R.inc(2736);position.set(Event.PREFIX_ADC + 4, buf.readUnsignedShort());
        }

        // Power
        }__CLR4_5_2213213lx1dh1yc.R.inc(2737);if (((((selector & 0x8000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2738)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2739)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2740);position.set(Event.KEY_POWER, buf.readUnsignedShort() / 1000.0);
            __CLR4_5_2213213lx1dh1yc.R.inc(2741);position.set(Event.KEY_BATTERY, buf.readUnsignedShort());
        }
        
        // Pulse rate 1
        }__CLR4_5_2213213lx1dh1yc.R.inc(2742);if (((((selector & 0x10000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2743)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2744)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2745);buf.readUnsignedShort();
            __CLR4_5_2213213lx1dh1yc.R.inc(2746);buf.readUnsignedInt();
        }
        
        // Pulse rate 2
        }__CLR4_5_2213213lx1dh1yc.R.inc(2747);if (((((selector & 0x20000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2748)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2749)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2750);buf.readUnsignedShort();
            __CLR4_5_2213213lx1dh1yc.R.inc(2751);buf.readUnsignedInt();
        }

        // Trip 1
        }__CLR4_5_2213213lx1dh1yc.R.inc(2752);if (((((selector & 0x0080) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2753)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2754)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2755);position.set("trip1", buf.readUnsignedInt());
        }

        // Trip 2
        }__CLR4_5_2213213lx1dh1yc.R.inc(2756);if (((((selector & 0x0100) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2757)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2758)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2759);position.set("trip2", buf.readUnsignedInt());
        }

        // Output
        }__CLR4_5_2213213lx1dh1yc.R.inc(2760);if (((((selector & 0x0040) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2761)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2762)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2763);position.set(Event.KEY_OUTPUT, buf.readUnsignedByte());
        }
        
        // Button
        }__CLR4_5_2213213lx1dh1yc.R.inc(2764);if (((((selector & 0x0200) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2765)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2766)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2767);buf.skipBytes(6);
        }
        
        // Keypad
        }__CLR4_5_2213213lx1dh1yc.R.inc(2768);if (((((selector & 0x0400) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2769)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2770)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2771);buf.readUnsignedByte();
        }
        
        // Altitude
        }__CLR4_5_2213213lx1dh1yc.R.inc(2772);if (((((selector & 0x0800) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2773)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2774)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2775);position.setAltitude(buf.readShort());
        }

        // Snapshot counter
        }__CLR4_5_2213213lx1dh1yc.R.inc(2776);if (((((selector & 0x2000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2777)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2778)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2779);buf.readUnsignedShort();
        }

        // State flags
        }__CLR4_5_2213213lx1dh1yc.R.inc(2780);if (((((selector & 0x4000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2781)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2782)==0&false))) {{
            __CLR4_5_2213213lx1dh1yc.R.inc(2783);buf.skipBytes(8);
        }

        // Event specific data
        }__CLR4_5_2213213lx1dh1yc.R.inc(2784);if (((((selector & 0x1000) != 0)&&(__CLR4_5_2213213lx1dh1yc.R.iget(2785)!=0|true))||(__CLR4_5_2213213lx1dh1yc.R.iget(2786)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2213213lx1dh1yc.R.inc(2787);switch (event) {
                case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2788);__CLB4_5_2_bool0=true;}
                case 40:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2789);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2790);buf.readUnsignedByte();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2791);break;
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2792);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2793);buf.readUnsignedMedium();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2794);break;
                case 31:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2795);__CLB4_5_2_bool0=true;}
                case 32:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2796);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2797);buf.readUnsignedShort();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2798);break;
                case 38:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2799);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2800);buf.skipBytes(4 * 9);
                    __CLR4_5_2213213lx1dh1yc.R.inc(2801);break;
                case 113:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2802);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2803);buf.readUnsignedInt();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2804);buf.readUnsignedByte();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2805);break;
                case 121:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2806);__CLB4_5_2_bool0=true;}
                case 142:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2807);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2808);buf.readLong();
                    __CLR4_5_2213213lx1dh1yc.R.inc(2809);break;
                case 130:if (!__CLB4_5_2_bool0) {__CLR4_5_2213213lx1dh1yc.R.inc(2810);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2213213lx1dh1yc.R.inc(2811);buf.readUnsignedInt(); // incorrect
                    __CLR4_5_2213213lx1dh1yc.R.inc(2812);break;
            }
        }

        }__CLR4_5_2213213lx1dh1yc.R.inc(2813);return position;
    }finally{__CLR4_5_2213213lx1dh1yc.R.flushNeeded();}}

}
