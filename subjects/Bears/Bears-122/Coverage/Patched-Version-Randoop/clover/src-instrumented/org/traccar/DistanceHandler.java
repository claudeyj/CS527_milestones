/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Amila Silva
 * Copyright 2016 - 2017 Anton Tananaev (anton@traccar.org)
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
import org.traccar.model.Position;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DistanceHandler extends BaseDataHandler {public static class __CLR4_5_2kfkflwye5yq1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384122565L,8589935092L,777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean filter;
    private final int coordinatesMinError;
    private final int coordinatesMaxError;

    public DistanceHandler(boolean filter, int coordinatesMinError, int coordinatesMaxError) {try{__CLR4_5_2kfkflwye5yq1.R.inc(735);
        __CLR4_5_2kfkflwye5yq1.R.inc(736);this.filter = filter;
        __CLR4_5_2kfkflwye5yq1.R.inc(737);this.coordinatesMinError = coordinatesMinError;
        __CLR4_5_2kfkflwye5yq1.R.inc(738);this.coordinatesMaxError = coordinatesMaxError;
    }finally{__CLR4_5_2kfkflwye5yq1.R.flushNeeded();}}

    private Position getLastPosition(long deviceId) {try{__CLR4_5_2kfkflwye5yq1.R.inc(739);
        __CLR4_5_2kfkflwye5yq1.R.inc(740);if ((((Context.getIdentityManager() != null)&&(__CLR4_5_2kfkflwye5yq1.R.iget(741)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(742)==0&false))) {{
            __CLR4_5_2kfkflwye5yq1.R.inc(743);return Context.getIdentityManager().getLastPosition(deviceId);
        }
        }__CLR4_5_2kfkflwye5yq1.R.inc(744);return null;
    }finally{__CLR4_5_2kfkflwye5yq1.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2kfkflwye5yq1.R.inc(745);

        __CLR4_5_2kfkflwye5yq1.R.inc(746);double distance = 0.0;
        __CLR4_5_2kfkflwye5yq1.R.inc(747);if ((((position.getAttributes().containsKey(Position.KEY_DISTANCE))&&(__CLR4_5_2kfkflwye5yq1.R.iget(748)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(749)==0&false))) {{
            __CLR4_5_2kfkflwye5yq1.R.inc(750);distance = position.getDouble(Position.KEY_DISTANCE);
        }
        }__CLR4_5_2kfkflwye5yq1.R.inc(751);double totalDistance = 0.0;

        __CLR4_5_2kfkflwye5yq1.R.inc(752);Position last = getLastPosition(position.getDeviceId());
        __CLR4_5_2kfkflwye5yq1.R.inc(753);if ((((last != null)&&(__CLR4_5_2kfkflwye5yq1.R.iget(754)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(755)==0&false))) {{
            __CLR4_5_2kfkflwye5yq1.R.inc(756);totalDistance = last.getDouble(Position.KEY_TOTAL_DISTANCE);
            __CLR4_5_2kfkflwye5yq1.R.inc(757);if ((((!position.getAttributes().containsKey(Position.KEY_DISTANCE))&&(__CLR4_5_2kfkflwye5yq1.R.iget(758)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(759)==0&false))) {{
                __CLR4_5_2kfkflwye5yq1.R.inc(760);distance = DistanceCalculator.distance(
                        position.getLatitude(), position.getLongitude(),
                        last.getLatitude(), last.getLongitude());
                __CLR4_5_2kfkflwye5yq1.R.inc(761);distance = BigDecimal.valueOf(distance).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            }
            }__CLR4_5_2kfkflwye5yq1.R.inc(762);if ((((filter && last.getValid() && last.getLatitude() != 0 && last.getLongitude() != 0)&&(__CLR4_5_2kfkflwye5yq1.R.iget(763)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(764)==0&false))) {{
                __CLR4_5_2kfkflwye5yq1.R.inc(765);boolean satisfiesMin = coordinatesMinError == 0 || distance > coordinatesMinError;
                __CLR4_5_2kfkflwye5yq1.R.inc(766);boolean satisfiesMax = coordinatesMaxError == 0
                        || distance < coordinatesMaxError || position.getValid();
                __CLR4_5_2kfkflwye5yq1.R.inc(767);if ((((!satisfiesMin || !satisfiesMax)&&(__CLR4_5_2kfkflwye5yq1.R.iget(768)!=0|true))||(__CLR4_5_2kfkflwye5yq1.R.iget(769)==0&false))) {{
                    __CLR4_5_2kfkflwye5yq1.R.inc(770);position.setLatitude(last.getLatitude());
                    __CLR4_5_2kfkflwye5yq1.R.inc(771);position.setLongitude(last.getLongitude());
                    __CLR4_5_2kfkflwye5yq1.R.inc(772);distance = 0;
                }
            }}
        }}
        }__CLR4_5_2kfkflwye5yq1.R.inc(773);position.set(Position.KEY_DISTANCE, distance);
        __CLR4_5_2kfkflwye5yq1.R.inc(774);totalDistance = BigDecimal.valueOf(totalDistance + distance).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        __CLR4_5_2kfkflwye5yq1.R.inc(775);position.set(Position.KEY_TOTAL_DISTANCE, totalDistance);

        __CLR4_5_2kfkflwye5yq1.R.inc(776);return position;
    }finally{__CLR4_5_2kfkflwye5yq1.R.flushNeeded();}}

}
