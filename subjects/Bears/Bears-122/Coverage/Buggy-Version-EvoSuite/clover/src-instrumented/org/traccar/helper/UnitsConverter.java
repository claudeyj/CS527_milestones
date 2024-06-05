/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
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

public final class UnitsConverter {public static class __CLR4_5_24mc4mclwydwb58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,6011,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final double KNOTS_TO_KPH_RATIO = 0.539957;
    private static final double KNOTS_TO_MPH_RATIO = 0.868976;
    private static final double KNOTS_TO_MPS_RATIO = 1.94384;
    private static final double KNOTS_TO_CPS_RATIO = 0.0194384449;
    private static final double METERS_TO_FEET_RATIO = 0.3048;
    private static final double METERS_TO_MILE_RATIO = 1609.34;

    private UnitsConverter() {try{__CLR4_5_24mc4mclwydwb58.R.inc(5988);
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double knotsFromKph(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5989); // km/h
        __CLR4_5_24mc4mclwydwb58.R.inc(5990);return value * KNOTS_TO_KPH_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double kphFromKnots(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5991);
        __CLR4_5_24mc4mclwydwb58.R.inc(5992);return value / KNOTS_TO_KPH_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double knotsFromMph(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5993);
        __CLR4_5_24mc4mclwydwb58.R.inc(5994);return value * KNOTS_TO_MPH_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double mphFromKnots(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5995);
        __CLR4_5_24mc4mclwydwb58.R.inc(5996);return value / KNOTS_TO_MPH_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double knotsFromMps(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5997); // m/s
        __CLR4_5_24mc4mclwydwb58.R.inc(5998);return value * KNOTS_TO_MPS_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double mpsFromKnots(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(5999);
        __CLR4_5_24mc4mclwydwb58.R.inc(6000);return value / KNOTS_TO_MPS_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double knotsFromCps(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(6001); // cm/s
        __CLR4_5_24mc4mclwydwb58.R.inc(6002);return value * KNOTS_TO_CPS_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double feetFromMeters(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(6003);
        __CLR4_5_24mc4mclwydwb58.R.inc(6004);return value / METERS_TO_FEET_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double metersFromFeet(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(6005);
        __CLR4_5_24mc4mclwydwb58.R.inc(6006);return value * METERS_TO_FEET_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double milesFromMeters(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(6007);
        __CLR4_5_24mc4mclwydwb58.R.inc(6008);return value / METERS_TO_MILE_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

    public static double metersFromMiles(double value) {try{__CLR4_5_24mc4mclwydwb58.R.inc(6009);
        __CLR4_5_24mc4mclwydwb58.R.inc(6010);return value * METERS_TO_MILE_RATIO;
    }finally{__CLR4_5_24mc4mclwydwb58.R.flushNeeded();}}

}
