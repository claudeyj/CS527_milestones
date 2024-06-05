/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.helper;

public final class DistanceCalculator {public static class __CLR4_5_2451451lwydygni{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,5388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DistanceCalculator() {try{__CLR4_5_2451451lwydygni.R.inc(5365);
    }finally{__CLR4_5_2451451lwydygni.R.flushNeeded();}}

    private static final double EQUATORIAL_EARTH_RADIUS = 6378.1370;
    private static final double DEG_TO_RAD = Math.PI / 180;

    public static double distance(double lat1, double lon1, double lat2, double lon2) {try{__CLR4_5_2451451lwydygni.R.inc(5366);
        __CLR4_5_2451451lwydygni.R.inc(5367);double dlong = (lon2 - lon1) * DEG_TO_RAD;
        __CLR4_5_2451451lwydygni.R.inc(5368);double dlat = (lat2 - lat1) * DEG_TO_RAD;
        __CLR4_5_2451451lwydygni.R.inc(5369);double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1 * DEG_TO_RAD) * Math.cos(lat2 * DEG_TO_RAD) * Math.pow(Math.sin(dlong / 2), 2);
        __CLR4_5_2451451lwydygni.R.inc(5370);double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        __CLR4_5_2451451lwydygni.R.inc(5371);double d = EQUATORIAL_EARTH_RADIUS * c;
        __CLR4_5_2451451lwydygni.R.inc(5372);return d * 1000;
    }finally{__CLR4_5_2451451lwydygni.R.flushNeeded();}}

    public static double distanceToLine(
            double pointLat, double pointLon, double lat1, double lon1, double lat2, double lon2) {try{__CLR4_5_2451451lwydygni.R.inc(5373);
        __CLR4_5_2451451lwydygni.R.inc(5374);double d0 = distance(pointLat, pointLon, lat1, lon1);
        __CLR4_5_2451451lwydygni.R.inc(5375);double d1 = distance(lat1, lon1, lat2, lon2);
        __CLR4_5_2451451lwydygni.R.inc(5376);double d2 = distance(lat2, lon2, pointLat, pointLon);
        __CLR4_5_2451451lwydygni.R.inc(5377);if ((((Math.pow(d0, 2) > Math.pow(d1, 2) + Math.pow(d2, 2))&&(__CLR4_5_2451451lwydygni.R.iget(5378)!=0|true))||(__CLR4_5_2451451lwydygni.R.iget(5379)==0&false))) {{
            __CLR4_5_2451451lwydygni.R.inc(5380);return d2;
        }
        }__CLR4_5_2451451lwydygni.R.inc(5381);if ((((Math.pow(d2, 2) > Math.pow(d1, 2) + Math.pow(d0, 2))&&(__CLR4_5_2451451lwydygni.R.iget(5382)!=0|true))||(__CLR4_5_2451451lwydygni.R.iget(5383)==0&false))) {{
            __CLR4_5_2451451lwydygni.R.inc(5384);return d0;
        }
        }__CLR4_5_2451451lwydygni.R.inc(5385);double halfP = (d0 + d1 + d2) * 0.5;
        __CLR4_5_2451451lwydygni.R.inc(5386);double area = Math.sqrt(halfP * (halfP - d0) * (halfP - d1) * (halfP - d2));
        __CLR4_5_2451451lwydygni.R.inc(5387);return 2 * area / d1;
    }finally{__CLR4_5_2451451lwydygni.R.flushNeeded();}}

}
