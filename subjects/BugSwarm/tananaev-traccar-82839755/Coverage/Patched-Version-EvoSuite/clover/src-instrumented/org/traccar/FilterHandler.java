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

import org.traccar.helper.DistanceCalculator;
import org.traccar.helper.Log;
import org.traccar.model.Position;

public class FilterHandler extends BaseDataHandler {public static class __CLR4_5_2ahahlx1e64k1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean filterInvalid;
    private final boolean filterZero;
    private final boolean filterDuplicate;
    private final int filterDistance;
    private final long filterLimit;
    
    public FilterHandler(
            boolean filterInvalid,
            boolean filterZero,
            boolean filterDuplicate,
            int filterDistance,
            long filterLimit) {try{__CLR4_5_2ahahlx1e64k1.R.inc(377);

        __CLR4_5_2ahahlx1e64k1.R.inc(378);this.filterInvalid = filterInvalid;
        __CLR4_5_2ahahlx1e64k1.R.inc(379);this.filterZero = filterZero;
        __CLR4_5_2ahahlx1e64k1.R.inc(380);this.filterDuplicate = filterDuplicate;
        __CLR4_5_2ahahlx1e64k1.R.inc(381);this.filterDistance = filterDistance;
        __CLR4_5_2ahahlx1e64k1.R.inc(382);this.filterLimit = filterLimit;
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    public FilterHandler() {try{__CLR4_5_2ahahlx1e64k1.R.inc(383);
        __CLR4_5_2ahahlx1e64k1.R.inc(384);Config config = Context.getConfig();

        __CLR4_5_2ahahlx1e64k1.R.inc(385);filterInvalid = config.getBoolean("filter.invalid");
        __CLR4_5_2ahahlx1e64k1.R.inc(386);filterZero = config.getBoolean("filter.zero");
        __CLR4_5_2ahahlx1e64k1.R.inc(387);filterDuplicate = config.getBoolean("filter.duplicate");
        __CLR4_5_2ahahlx1e64k1.R.inc(388);filterDistance = config.getInteger("filter.distance");
        __CLR4_5_2ahahlx1e64k1.R.inc(389);filterLimit = config.getLong("filter.limit") * 1000;
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private Position getLastPosition(long deviceId) {try{__CLR4_5_2ahahlx1e64k1.R.inc(390);
        __CLR4_5_2ahahlx1e64k1.R.inc(391);if ((((Context.getConnectionManager() != null)&&(__CLR4_5_2ahahlx1e64k1.R.iget(392)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(393)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(394);return Context.getConnectionManager().getLastPosition(deviceId);
        }
        }__CLR4_5_2ahahlx1e64k1.R.inc(395);return null;
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filterInvalid(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(396);
        __CLR4_5_2ahahlx1e64k1.R.inc(397);return filterInvalid && !position.getValid();
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filterZero(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(398);
        __CLR4_5_2ahahlx1e64k1.R.inc(399);return filterZero &&
                (position.getLatitude() == 0.0) &&
                (position.getLongitude() == 0.0);
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filterDuplicate(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(400);
        __CLR4_5_2ahahlx1e64k1.R.inc(401);if ((((filterDuplicate)&&(__CLR4_5_2ahahlx1e64k1.R.iget(402)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(403)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(404);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ahahlx1e64k1.R.inc(405);if ((((last != null)&&(__CLR4_5_2ahahlx1e64k1.R.iget(406)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(407)==0&false))) {{
                __CLR4_5_2ahahlx1e64k1.R.inc(408);return position.getFixTime().equals(last.getFixTime());
            } }else {{
                __CLR4_5_2ahahlx1e64k1.R.inc(409);return false;
            }
        }} }else {{
            __CLR4_5_2ahahlx1e64k1.R.inc(410);return false;
        }
    }}finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filterDistance(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(411);
        __CLR4_5_2ahahlx1e64k1.R.inc(412);if ((((filterDistance != 0)&&(__CLR4_5_2ahahlx1e64k1.R.iget(413)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(414)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(415);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ahahlx1e64k1.R.inc(416);if ((((last != null)&&(__CLR4_5_2ahahlx1e64k1.R.iget(417)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(418)==0&false))) {{
                __CLR4_5_2ahahlx1e64k1.R.inc(419);double distance = DistanceCalculator.distance(
                        position.getLatitude(), position.getLongitude(),
                        last.getLatitude(), last.getLongitude());
                __CLR4_5_2ahahlx1e64k1.R.inc(420);return distance < filterDistance;
            } }else {{
                __CLR4_5_2ahahlx1e64k1.R.inc(421);return false;
            }
        }} }else {{
            __CLR4_5_2ahahlx1e64k1.R.inc(422);return false;
        }
    }}finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filterLimit(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(423);
        __CLR4_5_2ahahlx1e64k1.R.inc(424);if ((((filterLimit != 0)&&(__CLR4_5_2ahahlx1e64k1.R.iget(425)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(426)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(427);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ahahlx1e64k1.R.inc(428);if ((((last != null)&&(__CLR4_5_2ahahlx1e64k1.R.iget(429)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(430)==0&false))) {{
                __CLR4_5_2ahahlx1e64k1.R.inc(431);return (position.getFixTime().getTime() - last.getFixTime().getTime()) > filterLimit;
            } }else {{
                __CLR4_5_2ahahlx1e64k1.R.inc(432);return false;
            }
        }} }else {{
            __CLR4_5_2ahahlx1e64k1.R.inc(433);return false;
        }
    }}finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}
    
    private boolean filter(Position p) {try{__CLR4_5_2ahahlx1e64k1.R.inc(434);
        
        __CLR4_5_2ahahlx1e64k1.R.inc(435);boolean result =
                filterInvalid(p) ||
                filterZero(p) ||
                filterDuplicate(p) ||
                filterDistance(p);
        
        __CLR4_5_2ahahlx1e64k1.R.inc(436);if ((((filterLimit(p))&&(__CLR4_5_2ahahlx1e64k1.R.iget(437)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(438)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(439);result = false;
        }
        
        }__CLR4_5_2ahahlx1e64k1.R.inc(440);if ((((result)&&(__CLR4_5_2ahahlx1e64k1.R.iget(441)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(442)==0&false))) {{
            __CLR4_5_2ahahlx1e64k1.R.inc(443);Log.info("Position filtered from " + p.getDeviceId());
        }

        }__CLR4_5_2ahahlx1e64k1.R.inc(444);return result;
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2ahahlx1e64k1.R.inc(445);
        __CLR4_5_2ahahlx1e64k1.R.inc(446);return (((filter(position) )&&(__CLR4_5_2ahahlx1e64k1.R.iget(447)!=0|true))||(__CLR4_5_2ahahlx1e64k1.R.iget(448)==0&false))? null : position;
    }finally{__CLR4_5_2ahahlx1e64k1.R.flushNeeded();}}

}
