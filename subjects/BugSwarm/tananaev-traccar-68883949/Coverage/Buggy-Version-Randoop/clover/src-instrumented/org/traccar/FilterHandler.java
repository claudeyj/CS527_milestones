/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 Anton Tananaev (anton.tananaev@gmail.com)
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
package org.traccar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;
import org.traccar.helper.DistanceCalculator;
import org.traccar.helper.Log;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class FilterHandler extends OneToOneDecoder {public static class __CLR4_5_27n7nlx1di39b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean filterInvalid;
    private boolean filterZero;
    private boolean filterDuplicate;
    private int filterDistance;
    private long filterLimit;
    
    private final Map<Long, Position> lastPositions = new HashMap<Long, Position>();

    public FilterHandler(
            boolean filterInvalid,
            boolean filterZero,
            boolean filterDuplicate,
            int filterDistance,
            long filterLimit) {try{__CLR4_5_27n7nlx1di39b.R.inc(275);

        __CLR4_5_27n7nlx1di39b.R.inc(276);this.filterInvalid = filterInvalid;
        __CLR4_5_27n7nlx1di39b.R.inc(277);this.filterZero = filterZero;
        __CLR4_5_27n7nlx1di39b.R.inc(278);this.filterDuplicate = filterDuplicate;
        __CLR4_5_27n7nlx1di39b.R.inc(279);this.filterDistance = filterDistance;
        __CLR4_5_27n7nlx1di39b.R.inc(280);this.filterLimit = filterLimit;
    }finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    public FilterHandler() {try{__CLR4_5_27n7nlx1di39b.R.inc(281);
        __CLR4_5_27n7nlx1di39b.R.inc(282);Properties properties = Context.getProps();

        __CLR4_5_27n7nlx1di39b.R.inc(283);String value = properties.getProperty("filter.invalid");
        __CLR4_5_27n7nlx1di39b.R.inc(284);if ((((value != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(285)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(286)==0&false))) {__CLR4_5_27n7nlx1di39b.R.inc(287);filterInvalid = Boolean.valueOf(value);

        }__CLR4_5_27n7nlx1di39b.R.inc(288);value = properties.getProperty("filter.zero");
        __CLR4_5_27n7nlx1di39b.R.inc(289);if ((((value != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(290)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(291)==0&false))) {__CLR4_5_27n7nlx1di39b.R.inc(292);filterZero = Boolean.valueOf(value);

        }__CLR4_5_27n7nlx1di39b.R.inc(293);value = properties.getProperty("filter.duplicate");
        __CLR4_5_27n7nlx1di39b.R.inc(294);if ((((value != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(295)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(296)==0&false))) {__CLR4_5_27n7nlx1di39b.R.inc(297);filterDuplicate = Boolean.valueOf(value);

        }__CLR4_5_27n7nlx1di39b.R.inc(298);value = properties.getProperty("filter.distance");
        __CLR4_5_27n7nlx1di39b.R.inc(299);if ((((value != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(300)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(301)==0&false))) {__CLR4_5_27n7nlx1di39b.R.inc(302);filterDistance = Integer.valueOf(value);

        }__CLR4_5_27n7nlx1di39b.R.inc(303);value = properties.getProperty("filter.limit");
        __CLR4_5_27n7nlx1di39b.R.inc(304);if ((((value != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(305)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(306)==0&false))) {__CLR4_5_27n7nlx1di39b.R.inc(307);filterLimit = Long.valueOf(value) * 1000;
    }}finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filterInvalid(Position position) {try{__CLR4_5_27n7nlx1di39b.R.inc(308);
        __CLR4_5_27n7nlx1di39b.R.inc(309);return filterInvalid && !position.getValid();
    }finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filterZero(Position position) {try{__CLR4_5_27n7nlx1di39b.R.inc(310);
        __CLR4_5_27n7nlx1di39b.R.inc(311);return filterZero &&
                (position.getLatitude() == 0.0) &&
                (position.getLongitude() == 0.0);
    }finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filterDuplicate(Position position) {try{__CLR4_5_27n7nlx1di39b.R.inc(312);
        __CLR4_5_27n7nlx1di39b.R.inc(313);if ((((filterDuplicate)&&(__CLR4_5_27n7nlx1di39b.R.iget(314)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(315)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(316);Position last = lastPositions.get(position.getDeviceId());
            __CLR4_5_27n7nlx1di39b.R.inc(317);if ((((last != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(318)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(319)==0&false))) {{
                __CLR4_5_27n7nlx1di39b.R.inc(320);return position.getFixTime().equals(last.getFixTime());
            } }else {{
                __CLR4_5_27n7nlx1di39b.R.inc(321);return false;
            }
        }} }else {{
            __CLR4_5_27n7nlx1di39b.R.inc(322);return false;
        }
    }}finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filterDistance(Position position) {try{__CLR4_5_27n7nlx1di39b.R.inc(323);
        __CLR4_5_27n7nlx1di39b.R.inc(324);if ((((filterDistance != 0)&&(__CLR4_5_27n7nlx1di39b.R.iget(325)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(326)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(327);Position last = lastPositions.get(position.getDeviceId());
            __CLR4_5_27n7nlx1di39b.R.inc(328);if ((((last != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(329)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(330)==0&false))) {{
                __CLR4_5_27n7nlx1di39b.R.inc(331);double distance = DistanceCalculator.distance(
                        position.getLatitude(), position.getLongitude(),
                        last.getLatitude(), last.getLongitude());
                __CLR4_5_27n7nlx1di39b.R.inc(332);return distance < filterDistance;
            } }else {{
                __CLR4_5_27n7nlx1di39b.R.inc(333);return false;
            }
        }} }else {{
            __CLR4_5_27n7nlx1di39b.R.inc(334);return false;
        }
    }}finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filterLimit(Position position) {try{__CLR4_5_27n7nlx1di39b.R.inc(335);
        __CLR4_5_27n7nlx1di39b.R.inc(336);if ((((filterLimit != 0)&&(__CLR4_5_27n7nlx1di39b.R.iget(337)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(338)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(339);Position last = lastPositions.get(position.getDeviceId());
            __CLR4_5_27n7nlx1di39b.R.inc(340);if ((((last != null)&&(__CLR4_5_27n7nlx1di39b.R.iget(341)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(342)==0&false))) {{
                __CLR4_5_27n7nlx1di39b.R.inc(343);return (position.getFixTime().getTime() - last.getFixTime().getTime()) > filterLimit;
            } }else {{
                __CLR4_5_27n7nlx1di39b.R.inc(344);return false;
            }
        }} }else {{
            __CLR4_5_27n7nlx1di39b.R.inc(345);return false;
        }
    }}finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}
    
    private boolean filter(Position p) {try{__CLR4_5_27n7nlx1di39b.R.inc(346);
        
        __CLR4_5_27n7nlx1di39b.R.inc(347);boolean result =
                filterInvalid(p) ||
                filterZero(p) ||
                filterDuplicate(p) ||
                filterDistance(p);
        
        __CLR4_5_27n7nlx1di39b.R.inc(348);if ((((filterLimit(p))&&(__CLR4_5_27n7nlx1di39b.R.iget(349)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(350)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(351);result = false;
        }
        
        }__CLR4_5_27n7nlx1di39b.R.inc(352);if ((((!result)&&(__CLR4_5_27n7nlx1di39b.R.iget(353)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(354)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(355);lastPositions.put(p.getDeviceId(), p);
        } }else {{
            __CLR4_5_27n7nlx1di39b.R.inc(356);StringBuilder s = new StringBuilder();
            __CLR4_5_27n7nlx1di39b.R.inc(357);Log.info("Position filtered from " + p.getDeviceId());
        }

        }__CLR4_5_27n7nlx1di39b.R.inc(358);return result;
    }finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}

    @Override
    protected Object decode(
            ChannelHandlerContext ctx, Channel channel, Object msg)
            throws Exception {try{__CLR4_5_27n7nlx1di39b.R.inc(359);
        
        __CLR4_5_27n7nlx1di39b.R.inc(360);if ((((msg instanceof Position)&&(__CLR4_5_27n7nlx1di39b.R.iget(361)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(362)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(363);if ((((filter((Position) msg))&&(__CLR4_5_27n7nlx1di39b.R.iget(364)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(365)==0&false))) {{
                __CLR4_5_27n7nlx1di39b.R.inc(366);return null;
            }
        }} }else {__CLR4_5_27n7nlx1di39b.R.inc(367);if ((((msg instanceof List)&&(__CLR4_5_27n7nlx1di39b.R.iget(368)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(369)==0&false))) {{
            __CLR4_5_27n7nlx1di39b.R.inc(370);Iterator<Position> i = ((List<Position>) msg).iterator();
            __CLR4_5_27n7nlx1di39b.R.inc(371);while ((((i.hasNext())&&(__CLR4_5_27n7nlx1di39b.R.iget(372)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(373)==0&false))) {{
               __CLR4_5_27n7nlx1di39b.R.inc(374);if ((((filter(i.next()))&&(__CLR4_5_27n7nlx1di39b.R.iget(375)!=0|true))||(__CLR4_5_27n7nlx1di39b.R.iget(376)==0&false))) {{
                   __CLR4_5_27n7nlx1di39b.R.inc(377);i.remove();
               }
            }}
        }}

        }}__CLR4_5_27n7nlx1di39b.R.inc(378);return msg;
    }finally{__CLR4_5_27n7nlx1di39b.R.flushNeeded();}}

}
