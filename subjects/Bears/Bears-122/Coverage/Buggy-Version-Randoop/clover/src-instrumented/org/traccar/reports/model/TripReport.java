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

import java.util.Date;

public class TripReport extends BaseReport {public static class __CLR4_5_2iziizilwydyl06{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,24674,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long startPositionId;

    public long getStartPositionId() {try{__CLR4_5_2iziizilwydyl06.R.inc(24606);
        __CLR4_5_2iziizilwydyl06.R.inc(24607);return startPositionId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setStartPositionId(long startPositionId) {try{__CLR4_5_2iziizilwydyl06.R.inc(24608);
        __CLR4_5_2iziizilwydyl06.R.inc(24609);this.startPositionId = startPositionId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private long endPositionId;

    public long getEndPositionId() {try{__CLR4_5_2iziizilwydyl06.R.inc(24610);
        __CLR4_5_2iziizilwydyl06.R.inc(24611);return endPositionId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setEndPositionId(long endPositionId) {try{__CLR4_5_2iziizilwydyl06.R.inc(24612);
        __CLR4_5_2iziizilwydyl06.R.inc(24613);this.endPositionId = endPositionId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private double startLat;

    public double getStartLat() {try{__CLR4_5_2iziizilwydyl06.R.inc(24614);
        __CLR4_5_2iziizilwydyl06.R.inc(24615);return startLat;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setStartLat(double startLat) {try{__CLR4_5_2iziizilwydyl06.R.inc(24616);
        __CLR4_5_2iziizilwydyl06.R.inc(24617);this.startLat = startLat;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private double startLon;

    public double getStartLon() {try{__CLR4_5_2iziizilwydyl06.R.inc(24618);
        __CLR4_5_2iziizilwydyl06.R.inc(24619);return startLon;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setStartLon(double startLon) {try{__CLR4_5_2iziizilwydyl06.R.inc(24620);
        __CLR4_5_2iziizilwydyl06.R.inc(24621);this.startLon = startLon;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private double endLat;

    public double getEndLat() {try{__CLR4_5_2iziizilwydyl06.R.inc(24622);
        __CLR4_5_2iziizilwydyl06.R.inc(24623);return endLat;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setEndLat(double endLat) {try{__CLR4_5_2iziizilwydyl06.R.inc(24624);
        __CLR4_5_2iziizilwydyl06.R.inc(24625);this.endLat = endLat;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private double endLon;

    public double getEndLon() {try{__CLR4_5_2iziizilwydyl06.R.inc(24626);
        __CLR4_5_2iziizilwydyl06.R.inc(24627);return endLon;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setEndLon(double endLon) {try{__CLR4_5_2iziizilwydyl06.R.inc(24628);
        __CLR4_5_2iziizilwydyl06.R.inc(24629);this.endLon = endLon;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private Date startTime;

    public Date getStartTime() {try{__CLR4_5_2iziizilwydyl06.R.inc(24630);
        __CLR4_5_2iziizilwydyl06.R.inc(24631);if ((((startTime != null)&&(__CLR4_5_2iziizilwydyl06.R.iget(24632)!=0|true))||(__CLR4_5_2iziizilwydyl06.R.iget(24633)==0&false))) {{
            __CLR4_5_2iziizilwydyl06.R.inc(24634);return new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2iziizilwydyl06.R.inc(24635);return null;
        }
    }}finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setStartTime(Date startTime) {try{__CLR4_5_2iziizilwydyl06.R.inc(24636);
        __CLR4_5_2iziizilwydyl06.R.inc(24637);if ((((startTime != null)&&(__CLR4_5_2iziizilwydyl06.R.iget(24638)!=0|true))||(__CLR4_5_2iziizilwydyl06.R.iget(24639)==0&false))) {{
            __CLR4_5_2iziizilwydyl06.R.inc(24640);this.startTime = new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2iziizilwydyl06.R.inc(24641);this.startTime = null;
        }
    }}finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private String startAddress;

    public String getStartAddress() {try{__CLR4_5_2iziizilwydyl06.R.inc(24642);
        __CLR4_5_2iziizilwydyl06.R.inc(24643);return startAddress;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setStartAddress(String address) {try{__CLR4_5_2iziizilwydyl06.R.inc(24644);
        __CLR4_5_2iziizilwydyl06.R.inc(24645);this.startAddress = address;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private Date endTime;

    public Date getEndTime() {try{__CLR4_5_2iziizilwydyl06.R.inc(24646);
        __CLR4_5_2iziizilwydyl06.R.inc(24647);if ((((endTime != null)&&(__CLR4_5_2iziizilwydyl06.R.iget(24648)!=0|true))||(__CLR4_5_2iziizilwydyl06.R.iget(24649)==0&false))) {{
            __CLR4_5_2iziizilwydyl06.R.inc(24650);return new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2iziizilwydyl06.R.inc(24651);return null;
        }
    }}finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setEndTime(Date endTime) {try{__CLR4_5_2iziizilwydyl06.R.inc(24652);
        __CLR4_5_2iziizilwydyl06.R.inc(24653);if ((((endTime != null)&&(__CLR4_5_2iziizilwydyl06.R.iget(24654)!=0|true))||(__CLR4_5_2iziizilwydyl06.R.iget(24655)==0&false))) {{
            __CLR4_5_2iziizilwydyl06.R.inc(24656);this.endTime = new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2iziizilwydyl06.R.inc(24657);this.endTime = null;
        }
    }}finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private String endAddress;

    public String getEndAddress() {try{__CLR4_5_2iziizilwydyl06.R.inc(24658);
        __CLR4_5_2iziizilwydyl06.R.inc(24659);return endAddress;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setEndAddress(String address) {try{__CLR4_5_2iziizilwydyl06.R.inc(24660);
        __CLR4_5_2iziizilwydyl06.R.inc(24661);this.endAddress = address;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private long duration;

    public long getDuration() {try{__CLR4_5_2iziizilwydyl06.R.inc(24662);
        __CLR4_5_2iziizilwydyl06.R.inc(24663);return duration;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_2iziizilwydyl06.R.inc(24664);
        __CLR4_5_2iziizilwydyl06.R.inc(24665);this.duration = duration;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private String driverUniqueId;

    public String getDriverUniqueId() {try{__CLR4_5_2iziizilwydyl06.R.inc(24666);
        __CLR4_5_2iziizilwydyl06.R.inc(24667);return driverUniqueId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setDriverUniqueId(String driverUniqueId) {try{__CLR4_5_2iziizilwydyl06.R.inc(24668);
        __CLR4_5_2iziizilwydyl06.R.inc(24669);this.driverUniqueId = driverUniqueId;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    private String driverName;

    public String getDriverName() {try{__CLR4_5_2iziizilwydyl06.R.inc(24670);
        __CLR4_5_2iziizilwydyl06.R.inc(24671);return driverName;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}

    public void setDriverName(String driverName) {try{__CLR4_5_2iziizilwydyl06.R.inc(24672);
        __CLR4_5_2iziizilwydyl06.R.inc(24673);this.driverName = driverName;
    }finally{__CLR4_5_2iziizilwydyl06.R.flushNeeded();}}
}
