/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2017 Anton Tananaev (anton@traccar.org)
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

import org.traccar.helper.Log;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

public class FilterHandler extends BaseDataHandler {public static class __CLR4_5_2mvmvlwydw7v4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean filterInvalid;
    private boolean filterZero;
    private boolean filterDuplicate;
    private long filterFuture;
    private boolean filterApproximate;
    private boolean filterStatic;
    private int filterDistance;
    private int filterMaxSpeed;
    private long filterLimit;

    public void setFilterInvalid(boolean filterInvalid) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(823);
        __CLR4_5_2mvmvlwydw7v4.R.inc(824);this.filterInvalid = filterInvalid;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterZero(boolean filterZero) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(825);
        __CLR4_5_2mvmvlwydw7v4.R.inc(826);this.filterZero = filterZero;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterDuplicate(boolean filterDuplicate) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(827);
        __CLR4_5_2mvmvlwydw7v4.R.inc(828);this.filterDuplicate = filterDuplicate;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterFuture(long filterFuture) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(829);
        __CLR4_5_2mvmvlwydw7v4.R.inc(830);this.filterFuture = filterFuture;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterApproximate(boolean filterApproximate) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(831);
        __CLR4_5_2mvmvlwydw7v4.R.inc(832);this.filterApproximate = filterApproximate;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterStatic(boolean filterStatic) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(833);
        __CLR4_5_2mvmvlwydw7v4.R.inc(834);this.filterStatic = filterStatic;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterDistance(int filterDistance) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(835);
        __CLR4_5_2mvmvlwydw7v4.R.inc(836);this.filterDistance = filterDistance;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterMaxSpeed(int filterMaxSpeed) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(837);
        __CLR4_5_2mvmvlwydw7v4.R.inc(838);this.filterMaxSpeed = filterMaxSpeed;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public void setFilterLimit(long filterLimit) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(839);
        __CLR4_5_2mvmvlwydw7v4.R.inc(840);this.filterLimit = filterLimit;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    public FilterHandler() {try{__CLR4_5_2mvmvlwydw7v4.R.inc(841);
        __CLR4_5_2mvmvlwydw7v4.R.inc(842);Config config = Context.getConfig();
        __CLR4_5_2mvmvlwydw7v4.R.inc(843);if ((((config != null)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(844)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(845)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(846);filterInvalid = config.getBoolean("filter.invalid");
            __CLR4_5_2mvmvlwydw7v4.R.inc(847);filterZero = config.getBoolean("filter.zero");
            __CLR4_5_2mvmvlwydw7v4.R.inc(848);filterDuplicate = config.getBoolean("filter.duplicate");
            __CLR4_5_2mvmvlwydw7v4.R.inc(849);filterFuture = config.getLong("filter.future") * 1000;
            __CLR4_5_2mvmvlwydw7v4.R.inc(850);filterApproximate = config.getBoolean("filter.approximate");
            __CLR4_5_2mvmvlwydw7v4.R.inc(851);filterStatic = config.getBoolean("filter.static");
            __CLR4_5_2mvmvlwydw7v4.R.inc(852);filterDistance = config.getInteger("filter.distance");
            __CLR4_5_2mvmvlwydw7v4.R.inc(853);filterMaxSpeed = config.getInteger("filter.maxSpeed");
            __CLR4_5_2mvmvlwydw7v4.R.inc(854);filterLimit = config.getLong("filter.limit") * 1000;
        }
    }}finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterInvalid(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(855);
        __CLR4_5_2mvmvlwydw7v4.R.inc(856);return filterInvalid && (!position.getValid()
           || position.getLatitude() > 90 || position.getLongitude() > 180
           || position.getLatitude() < -90 || position.getLongitude() < -180);
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterZero(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(857);
        __CLR4_5_2mvmvlwydw7v4.R.inc(858);return filterZero && position.getLatitude() == 0.0 && position.getLongitude() == 0.0;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterDuplicate(Position position, Position last) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(859);
        __CLR4_5_2mvmvlwydw7v4.R.inc(860);if ((((filterDuplicate && last != null && position.getFixTime().equals(last.getFixTime()))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(861)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(862)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(863);for (String key : position.getAttributes().keySet()) {{
                __CLR4_5_2mvmvlwydw7v4.R.inc(864);if ((((!last.getAttributes().containsKey(key))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(865)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(866)==0&false))) {{
                    __CLR4_5_2mvmvlwydw7v4.R.inc(867);return false;
                }
            }}
            }__CLR4_5_2mvmvlwydw7v4.R.inc(868);return true;
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(869);return false;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterFuture(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(870);
        __CLR4_5_2mvmvlwydw7v4.R.inc(871);return filterFuture != 0 && position.getFixTime().getTime() > System.currentTimeMillis() + filterFuture;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterApproximate(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(872);
        __CLR4_5_2mvmvlwydw7v4.R.inc(873);return filterApproximate && position.getBoolean(Position.KEY_APPROXIMATE);
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterStatic(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(874);
        __CLR4_5_2mvmvlwydw7v4.R.inc(875);return filterStatic && position.getSpeed() == 0.0;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterDistance(Position position, Position last) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(876);
        __CLR4_5_2mvmvlwydw7v4.R.inc(877);if ((((filterDistance != 0 && last != null)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(878)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(879)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(880);return position.getDouble(Position.KEY_DISTANCE) < filterDistance;
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(881);return false;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterMaxSpeed(Position position, Position last) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(882);
        __CLR4_5_2mvmvlwydw7v4.R.inc(883);if ((((filterMaxSpeed != 0 && last != null)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(884)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(885)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(886);double distance = position.getDouble(Position.KEY_DISTANCE);
            __CLR4_5_2mvmvlwydw7v4.R.inc(887);long time = position.getFixTime().getTime() - last.getFixTime().getTime();
            __CLR4_5_2mvmvlwydw7v4.R.inc(888);return UnitsConverter.knotsFromMps(distance / (time / 1000)) > filterMaxSpeed;
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(889);return false;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filterLimit(Position position, Position last) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(890);
        __CLR4_5_2mvmvlwydw7v4.R.inc(891);if ((((filterLimit != 0)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(892)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(893)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(894);if ((((last != null)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(895)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(896)==0&false))) {{
                __CLR4_5_2mvmvlwydw7v4.R.inc(897);return (position.getFixTime().getTime() - last.getFixTime().getTime()) > filterLimit;
            } }else {{
                __CLR4_5_2mvmvlwydw7v4.R.inc(898);return false;
            }
        }} }else {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(899);return false;
        }
    }}finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    private boolean filter(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(900);

        __CLR4_5_2mvmvlwydw7v4.R.inc(901);StringBuilder filterType = new StringBuilder();

        __CLR4_5_2mvmvlwydw7v4.R.inc(902);Position last = null;
        __CLR4_5_2mvmvlwydw7v4.R.inc(903);if ((((Context.getIdentityManager() != null)&&(__CLR4_5_2mvmvlwydw7v4.R.iget(904)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(905)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(906);last = Context.getIdentityManager().getLastPosition(position.getDeviceId());
        }

        }__CLR4_5_2mvmvlwydw7v4.R.inc(907);if ((((filterInvalid(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(908)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(909)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(910);filterType.append("Invalid ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(911);if ((((filterZero(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(912)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(913)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(914);filterType.append("Zero ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(915);if ((((filterDuplicate(position, last))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(916)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(917)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(918);filterType.append("Duplicate ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(919);if ((((filterFuture(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(920)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(921)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(922);filterType.append("Future ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(923);if ((((filterApproximate(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(924)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(925)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(926);filterType.append("Approximate ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(927);if ((((filterStatic(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(928)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(929)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(930);filterType.append("Static ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(931);if ((((filterDistance(position, last))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(932)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(933)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(934);filterType.append("Distance ");
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(935);if ((((filterMaxSpeed(position, last))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(936)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(937)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(938);filterType.append("MaxSpeed ");
        }

        }__CLR4_5_2mvmvlwydw7v4.R.inc(939);if ((((filterType.length() > 0 && !filterLimit(position, last))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(940)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(941)==0&false))) {{

            __CLR4_5_2mvmvlwydw7v4.R.inc(942);StringBuilder message = new StringBuilder();
            __CLR4_5_2mvmvlwydw7v4.R.inc(943);message.append("Position filtered by ");
            __CLR4_5_2mvmvlwydw7v4.R.inc(944);message.append(filterType.toString());
            __CLR4_5_2mvmvlwydw7v4.R.inc(945);message.append("filters from device: ");
            __CLR4_5_2mvmvlwydw7v4.R.inc(946);message.append(Context.getIdentityManager().getById(position.getDeviceId()).getUniqueId());
            __CLR4_5_2mvmvlwydw7v4.R.inc(947);message.append(" with id: ");
            __CLR4_5_2mvmvlwydw7v4.R.inc(948);message.append(position.getDeviceId());

            __CLR4_5_2mvmvlwydw7v4.R.inc(949);Log.info(message.toString());
            __CLR4_5_2mvmvlwydw7v4.R.inc(950);return true;
        }

        }__CLR4_5_2mvmvlwydw7v4.R.inc(951);return false;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2mvmvlwydw7v4.R.inc(952);
        __CLR4_5_2mvmvlwydw7v4.R.inc(953);if ((((filter(position))&&(__CLR4_5_2mvmvlwydw7v4.R.iget(954)!=0|true))||(__CLR4_5_2mvmvlwydw7v4.R.iget(955)==0&false))) {{
            __CLR4_5_2mvmvlwydw7v4.R.inc(956);return null;
        }
        }__CLR4_5_2mvmvlwydw7v4.R.inc(957);return position;
    }finally{__CLR4_5_2mvmvlwydw7v4.R.flushNeeded();}}

}
