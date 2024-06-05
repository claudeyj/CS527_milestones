/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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
package org.traccar.reports;

import org.traccar.Context;
import org.traccar.helper.Log;
import org.traccar.model.Position;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

@java.lang.SuppressWarnings({"fallthrough"}) public final class ReportUtils {public static class __CLR4_5_2fysfyslx1dvfl3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565021503L,8589935092L,20750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ReportUtils() {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20692);
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static String getDistanceUnit(long userId) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20693);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20694);String unit = Context.getPermissionsManager().getUser(userId).getDistanceUnit();
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20695);if ((((unit == null)&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20696)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20697)==0&false))) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20698);unit  = Context.getPermissionsManager().getServer().getDistanceUnit();
        }
        }__CLR4_5_2fysfyslx1dvfl3.R.inc(20699);return (((unit != null )&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20700)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20701)==0&false))? unit : "km";
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static String getSpeedUnit(long userId) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20702);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20703);String unit = Context.getPermissionsManager().getUser(userId).getSpeedUnit();
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20704);if ((((unit == null)&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20705)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20706)==0&false))) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20707);unit  = Context.getPermissionsManager().getServer().getSpeedUnit();
        }
        }__CLR4_5_2fysfyslx1dvfl3.R.inc(20708);return (((unit != null )&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20709)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20710)==0&false))? unit : "kn";
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static Collection<Long> getDeviceList(Collection<Long> deviceIds, Collection<Long> groupIds) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20711);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20712);Collection<Long> result = new ArrayList<>();
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20713);result.addAll(deviceIds);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20714);for (long groupId : groupIds) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20715);result.addAll(Context.getPermissionsManager().getGroupDevices(groupId));
        }
        }__CLR4_5_2fysfyslx1dvfl3.R.inc(20716);return result;
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static double calculateDistance(Position firstPosition, Position lastPosition) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20717);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20718);return calculateDistance(firstPosition, lastPosition, true);
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static double calculateDistance(Position firstPosition, Position lastPosition, boolean useOdometer) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20719);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20720);double distance = 0.0;
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20721);double firstOdometer = 0.0;
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20722);double lastOdometer = 0.0;
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20723);firstOdometer = firstPosition.getDouble(Position.KEY_ODOMETER);
        __CLR4_5_2fysfyslx1dvfl3.R.inc(20724);lastOdometer = lastPosition.getDouble(Position.KEY_ODOMETER);

        __CLR4_5_2fysfyslx1dvfl3.R.inc(20725);if ((((useOdometer && (firstOdometer != 0.0 || lastOdometer != 0.0))&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20726)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20727)==0&false))) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20728);distance = lastOdometer - firstOdometer;
        } }else {__CLR4_5_2fysfyslx1dvfl3.R.inc(20729);if ((((firstPosition.getAttributes().containsKey(Position.KEY_TOTAL_DISTANCE)
                && lastPosition.getAttributes().containsKey(Position.KEY_TOTAL_DISTANCE))&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20730)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20731)==0&false))) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20732);distance = lastPosition.getDouble(Position.KEY_TOTAL_DISTANCE)
                    - firstPosition.getDouble(Position.KEY_TOTAL_DISTANCE);
        }
        }}__CLR4_5_2fysfyslx1dvfl3.R.inc(20733);return distance;
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

    public static String calculateFuel(Position firstPosition, Position lastPosition) {try{__CLR4_5_2fysfyslx1dvfl3.R.inc(20734);

        __CLR4_5_2fysfyslx1dvfl3.R.inc(20735);if ((((firstPosition.getAttributes().get(Position.KEY_FUEL) != null
                && lastPosition.getAttributes().get(Position.KEY_FUEL) != null)&&(__CLR4_5_2fysfyslx1dvfl3.R.iget(20736)!=0|true))||(__CLR4_5_2fysfyslx1dvfl3.R.iget(20737)==0&false))) {{
            __CLR4_5_2fysfyslx1dvfl3.R.inc(20738);try {
                boolean __CLB4_5_2_bool0=false;__CLR4_5_2fysfyslx1dvfl3.R.inc(20739);switch (firstPosition.getProtocol()) {
                    case "meitrack":if (!__CLB4_5_2_bool0) {__CLR4_5_2fysfyslx1dvfl3.R.inc(20740);__CLB4_5_2_bool0=true;}
                    case "galileo":if (!__CLB4_5_2_bool0) {__CLR4_5_2fysfyslx1dvfl3.R.inc(20741);__CLB4_5_2_bool0=true;}
                    case "noran":if (!__CLB4_5_2_bool0) {__CLR4_5_2fysfyslx1dvfl3.R.inc(20742);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2fysfyslx1dvfl3.R.inc(20743);BigDecimal v = new BigDecimal(firstPosition.getAttributes().get(Position.KEY_FUEL).toString());
                        __CLR4_5_2fysfyslx1dvfl3.R.inc(20744);v = v.subtract(new BigDecimal(lastPosition.getAttributes().get(Position.KEY_FUEL).toString()));
                        __CLR4_5_2fysfyslx1dvfl3.R.inc(20745);return v.setScale(2, RoundingMode.HALF_EVEN).toString() + " %";
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_2fysfyslx1dvfl3.R.inc(20746);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2fysfyslx1dvfl3.R.inc(20747);break;
                }
            } catch (Exception error) {
                __CLR4_5_2fysfyslx1dvfl3.R.inc(20748);Log.warning(error);
            }
        }
        }__CLR4_5_2fysfyslx1dvfl3.R.inc(20749);return "-";
    }finally{__CLR4_5_2fysfyslx1dvfl3.R.flushNeeded();}}

}
