/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2017 Anton Tananaev (anton@traccar.org)
 * Copyright 2017 Andrey Kunitsyn (andrey@traccar.org)
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

public class StopReport extends BaseReport  {public static class __CLR4_5_2ixxixxlwye422g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,24599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long positionId;

    public long getPositionId() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24549);
        __CLR4_5_2ixxixxlwye422g.R.inc(24550);return positionId;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setPositionId(long positionId) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24551);
        __CLR4_5_2ixxixxlwye422g.R.inc(24552);this.positionId = positionId;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private double latitude;

    public double getLatitude() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24553);
        __CLR4_5_2ixxixxlwye422g.R.inc(24554);return latitude;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setLatitude(double latitude) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24555);
        __CLR4_5_2ixxixxlwye422g.R.inc(24556);this.latitude = latitude;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private double longitude;

    public double getLongitude() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24557);
        __CLR4_5_2ixxixxlwye422g.R.inc(24558);return longitude;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setLongitude(double longitude) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24559);
        __CLR4_5_2ixxixxlwye422g.R.inc(24560);this.longitude = longitude;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private Date startTime;

    public Date getStartTime() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24561);
        __CLR4_5_2ixxixxlwye422g.R.inc(24562);if ((((startTime != null)&&(__CLR4_5_2ixxixxlwye422g.R.iget(24563)!=0|true))||(__CLR4_5_2ixxixxlwye422g.R.iget(24564)==0&false))) {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24565);return new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24566);return null;
        }
    }}finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setStartTime(Date startTime) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24567);
        __CLR4_5_2ixxixxlwye422g.R.inc(24568);if ((((startTime != null)&&(__CLR4_5_2ixxixxlwye422g.R.iget(24569)!=0|true))||(__CLR4_5_2ixxixxlwye422g.R.iget(24570)==0&false))) {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24571);this.startTime = new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24572);this.startTime = null;
        }
    }}finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private Date endTime;

    public Date getEndTime() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24573);
        __CLR4_5_2ixxixxlwye422g.R.inc(24574);if ((((endTime != null)&&(__CLR4_5_2ixxixxlwye422g.R.iget(24575)!=0|true))||(__CLR4_5_2ixxixxlwye422g.R.iget(24576)==0&false))) {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24577);return new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24578);return null;
        }
    }}finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setEndTime(Date endTime) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24579);
        __CLR4_5_2ixxixxlwye422g.R.inc(24580);if ((((endTime != null)&&(__CLR4_5_2ixxixxlwye422g.R.iget(24581)!=0|true))||(__CLR4_5_2ixxixxlwye422g.R.iget(24582)==0&false))) {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24583);this.endTime = new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2ixxixxlwye422g.R.inc(24584);this.endTime = null;
        }
    }}finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private String address;

    public String getAddress() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24585);
        __CLR4_5_2ixxixxlwye422g.R.inc(24586);return address;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setAddress(String address) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24587);
        __CLR4_5_2ixxixxlwye422g.R.inc(24588);this.address = address;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private long duration;

    public long getDuration() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24589);
        __CLR4_5_2ixxixxlwye422g.R.inc(24590);return duration;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24591);
        __CLR4_5_2ixxixxlwye422g.R.inc(24592);this.duration = duration;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    private long engineHours; // milliseconds

    public long getEngineHours() {try{__CLR4_5_2ixxixxlwye422g.R.inc(24593);
        __CLR4_5_2ixxixxlwye422g.R.inc(24594);return engineHours;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void setEngineHours(long engineHours) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24595);
        __CLR4_5_2ixxixxlwye422g.R.inc(24596);this.engineHours = engineHours;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}

    public void addEngineHours(long engineHours) {try{__CLR4_5_2ixxixxlwye422g.R.inc(24597);
        __CLR4_5_2ixxixxlwye422g.R.inc(24598);this.engineHours += engineHours;
    }finally{__CLR4_5_2ixxixxlwye422g.R.flushNeeded();}}
}
