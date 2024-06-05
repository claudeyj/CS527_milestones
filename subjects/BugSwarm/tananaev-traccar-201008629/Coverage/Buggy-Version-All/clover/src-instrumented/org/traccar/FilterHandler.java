/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2016 Anton Tananaev (anton@traccar.org)
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

public class FilterHandler extends BaseDataHandler {public static class __CLR4_5_2ljljlx1dxjk6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565128394L,8589935092L,904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean filterInvalid;
    private boolean filterZero;
    private boolean filterDuplicate;
    private boolean filterApproximate;
    private boolean filterStatic;
    private int filterDistance;
    private long filterLimit;
    private long filterFuture;

    public void setFilterInvalid(boolean filterInvalid) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(775);
        __CLR4_5_2ljljlx1dxjk6.R.inc(776);this.filterInvalid = filterInvalid;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterZero(boolean filterZero) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(777);
        __CLR4_5_2ljljlx1dxjk6.R.inc(778);this.filterZero = filterZero;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterDuplicate(boolean filterDuplicate) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(779);
        __CLR4_5_2ljljlx1dxjk6.R.inc(780);this.filterDuplicate = filterDuplicate;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterApproximate(boolean filterApproximate) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(781);
        __CLR4_5_2ljljlx1dxjk6.R.inc(782);this.filterApproximate = filterApproximate;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterStatic(boolean filterStatic) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(783);
        __CLR4_5_2ljljlx1dxjk6.R.inc(784);this.filterStatic = filterStatic;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterDistance(int filterDistance) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(785);
        __CLR4_5_2ljljlx1dxjk6.R.inc(786);this.filterDistance = filterDistance;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterLimit(long filterLimit) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(787);
        __CLR4_5_2ljljlx1dxjk6.R.inc(788);this.filterLimit = filterLimit;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public void setFilterFuture(long filterFuture) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(789);
        __CLR4_5_2ljljlx1dxjk6.R.inc(790);this.filterFuture = filterFuture;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    public FilterHandler() {try{__CLR4_5_2ljljlx1dxjk6.R.inc(791);
        __CLR4_5_2ljljlx1dxjk6.R.inc(792);Config config = Context.getConfig();
        __CLR4_5_2ljljlx1dxjk6.R.inc(793);if ((((config != null)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(794)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(795)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(796);filterInvalid = config.getBoolean("filter.invalid");
            __CLR4_5_2ljljlx1dxjk6.R.inc(797);filterZero = config.getBoolean("filter.zero");
            __CLR4_5_2ljljlx1dxjk6.R.inc(798);filterDuplicate = config.getBoolean("filter.duplicate");
            __CLR4_5_2ljljlx1dxjk6.R.inc(799);filterApproximate = config.getBoolean("filter.approximate");
            __CLR4_5_2ljljlx1dxjk6.R.inc(800);filterStatic = config.getBoolean("filter.static");
            __CLR4_5_2ljljlx1dxjk6.R.inc(801);filterDistance = config.getInteger("filter.distance");
            __CLR4_5_2ljljlx1dxjk6.R.inc(802);filterLimit = config.getLong("filter.limit") * 1000;
            __CLR4_5_2ljljlx1dxjk6.R.inc(803);filterFuture = config.getLong("filter.future") * 1000;
        }
    }}finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private Position getLastPosition(long deviceId) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(804);
        __CLR4_5_2ljljlx1dxjk6.R.inc(805);if ((((Context.getIdentityManager() != null)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(806)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(807)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(808);return Context.getIdentityManager().getLastPosition(deviceId);
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(809);return null;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterInvalid(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(810);
        __CLR4_5_2ljljlx1dxjk6.R.inc(811);return filterInvalid && !position.getValid();
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterZero(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(812);
        __CLR4_5_2ljljlx1dxjk6.R.inc(813);return filterZero && position.getLatitude() == 0.0 && position.getLongitude() == 0.0;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterDuplicate(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(814);
        __CLR4_5_2ljljlx1dxjk6.R.inc(815);if ((((filterDuplicate)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(816)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(817)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(818);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ljljlx1dxjk6.R.inc(819);if ((((last != null)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(820)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(821)==0&false))) {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(822);return position.getFixTime().equals(last.getFixTime());
            } }else {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(823);return false;
            }
        }} }else {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(824);return false;
        }
    }}finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterFuture(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(825);
        __CLR4_5_2ljljlx1dxjk6.R.inc(826);return filterFuture != 0 && position.getFixTime().getTime() > System.currentTimeMillis() + filterFuture;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterApproximate(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(827);
        __CLR4_5_2ljljlx1dxjk6.R.inc(828);Boolean approximate = position.getBoolean(Position.KEY_APPROXIMATE);
        __CLR4_5_2ljljlx1dxjk6.R.inc(829);return filterApproximate && approximate != null && approximate;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterStatic(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(830);
        __CLR4_5_2ljljlx1dxjk6.R.inc(831);return filterStatic && position.getSpeed() == 0.0;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterDistance(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(832);
        __CLR4_5_2ljljlx1dxjk6.R.inc(833);if ((((filterDistance != 0)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(834)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(835)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(836);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ljljlx1dxjk6.R.inc(837);if ((((last != null)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(838)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(839)==0&false))) {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(840);double distance = DistanceCalculator.distance(
                        position.getLatitude(), position.getLongitude(),
                        last.getLatitude(), last.getLongitude());
                __CLR4_5_2ljljlx1dxjk6.R.inc(841);return distance < filterDistance;
            } }else {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(842);return false;
            }
        }} }else {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(843);return false;
        }
    }}finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filterLimit(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(844);
        __CLR4_5_2ljljlx1dxjk6.R.inc(845);if ((((filterLimit != 0)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(846)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(847)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(848);Position last = getLastPosition(position.getDeviceId());
            __CLR4_5_2ljljlx1dxjk6.R.inc(849);if ((((last != null)&&(__CLR4_5_2ljljlx1dxjk6.R.iget(850)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(851)==0&false))) {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(852);return (position.getFixTime().getTime() - last.getFixTime().getTime()) > filterLimit;
            } }else {{
                __CLR4_5_2ljljlx1dxjk6.R.inc(853);return false;
            }
        }} }else {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(854);return false;
        }
    }}finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    private boolean filter(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(855);

        __CLR4_5_2ljljlx1dxjk6.R.inc(856);StringBuilder filterType = new StringBuilder();

        __CLR4_5_2ljljlx1dxjk6.R.inc(857);if ((((filterInvalid(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(858)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(859)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(860);filterType.append("Invalid ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(861);if ((((filterZero(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(862)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(863)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(864);filterType.append("Zero ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(865);if ((((filterDuplicate(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(866)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(867)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(868);filterType.append("Duplicate ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(869);if ((((filterFuture(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(870)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(871)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(872);filterType.append("Future ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(873);if ((((filterApproximate(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(874)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(875)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(876);filterType.append("Approximate ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(877);if ((((filterStatic(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(878)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(879)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(880);filterType.append("Static ");
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(881);if ((((filterDistance(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(882)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(883)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(884);filterType.append("Distance ");
        }

        }__CLR4_5_2ljljlx1dxjk6.R.inc(885);if ((((filterType.length() > 0 && !filterLimit(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(886)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(887)==0&false))) {{

            __CLR4_5_2ljljlx1dxjk6.R.inc(888);StringBuilder message = new StringBuilder();
            __CLR4_5_2ljljlx1dxjk6.R.inc(889);message.append("Position filtered by ");
            __CLR4_5_2ljljlx1dxjk6.R.inc(890);message.append(filterType.toString());
            __CLR4_5_2ljljlx1dxjk6.R.inc(891);message.append("filters from device: ");
            __CLR4_5_2ljljlx1dxjk6.R.inc(892);message.append(Context.getIdentityManager().getDeviceById(position.getDeviceId()).getUniqueId());
            __CLR4_5_2ljljlx1dxjk6.R.inc(893);message.append(" with id: ");
            __CLR4_5_2ljljlx1dxjk6.R.inc(894);message.append(position.getDeviceId());

            __CLR4_5_2ljljlx1dxjk6.R.inc(895);Log.info(message.toString());
            __CLR4_5_2ljljlx1dxjk6.R.inc(896);return true;
        }

        }__CLR4_5_2ljljlx1dxjk6.R.inc(897);return false;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2ljljlx1dxjk6.R.inc(898);
        __CLR4_5_2ljljlx1dxjk6.R.inc(899);if ((((filter(position))&&(__CLR4_5_2ljljlx1dxjk6.R.iget(900)!=0|true))||(__CLR4_5_2ljljlx1dxjk6.R.iget(901)==0&false))) {{
            __CLR4_5_2ljljlx1dxjk6.R.inc(902);return null;
        }
        }__CLR4_5_2ljljlx1dxjk6.R.inc(903);return position;
    }finally{__CLR4_5_2ljljlx1dxjk6.R.flushNeeded();}}

}
