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
package org.traccar.reports.model;

public class BaseReport {public static class __CLR4_5_2iwtiwtlwydwfcs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,24538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long deviceId;

    public long getDeviceId() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24509);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24510);return deviceId;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setDeviceId(long deviceId) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24511);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24512);this.deviceId = deviceId;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    private String deviceName;

    public String getDeviceName() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24513);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24514);return deviceName;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setDeviceName(String deviceName) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24515);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24516);this.deviceName = deviceName;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    private double distance;

    public double getDistance() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24517);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24518);return distance;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setDistance(double distance) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24519);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24520);this.distance = distance;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void addDistance(double distance) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24521);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24522);this.distance += distance;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    private double averageSpeed;

    public double getAverageSpeed() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24523);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24524);return averageSpeed;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setAverageSpeed(Double averageSpeed) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24525);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24526);this.averageSpeed = averageSpeed;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    private double maxSpeed;

    public double getMaxSpeed() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24527);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24528);return maxSpeed;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setMaxSpeed(double maxSpeed) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24529);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24530);if ((((maxSpeed > this.maxSpeed)&&(__CLR4_5_2iwtiwtlwydwfcs.R.iget(24531)!=0|true))||(__CLR4_5_2iwtiwtlwydwfcs.R.iget(24532)==0&false))) {{
            __CLR4_5_2iwtiwtlwydwfcs.R.inc(24533);this.maxSpeed = maxSpeed;
        }
    }}finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    private double spentFuel;

    public double getSpentFuel() {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24534);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24535);return spentFuel;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

    public void setSpentFuel(double spentFuel) {try{__CLR4_5_2iwtiwtlwydwfcs.R.inc(24536);
        __CLR4_5_2iwtiwtlwydwfcs.R.inc(24537);this.spentFuel = spentFuel;
    }finally{__CLR4_5_2iwtiwtlwydwfcs.R.flushNeeded();}}

}
