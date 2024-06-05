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

public class TripReport extends BaseReport {public static class __CLR4_5_2g8cg8clx1e0j3v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,21100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long startPositionId;
    public long getStartPositionId() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21036);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21037);return startPositionId;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setStartPositionId(long startPositionId) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21038);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21039);this.startPositionId = startPositionId;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private long endPositionId;
    public long getEndPositionId() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21040);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21041);return endPositionId;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setEndPositionId(long endPositionId) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21042);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21043);this.endPositionId = endPositionId;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private double startLat;
    public double getStartLat() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21044);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21045);return startLat;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setStartLat(double startLat) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21046);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21047);this.startLat = startLat;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private double startLon;
    public double getStartLon() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21048);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21049);return startLon;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setStartLon(double startLon) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21050);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21051);this.startLon = startLon;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private double endLat;
    public double getEndLat() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21052);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21053);return endLat;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setEndLat(double endLat) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21054);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21055);this.endLat = endLat;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private double endLon;
    public double getEndLon() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21056);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21057);return endLon;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setEndLon(double endLon) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21058);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21059);this.endLon = endLon;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private Date startTime;
    public Date getStartTime() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21060);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21061);if ((((startTime != null)&&(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21062)!=0|true))||(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21063)==0&false))) {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21064);return new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21065);return null;
        }
    }}finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setStartTime(Date startTime) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21066);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21067);if ((((startTime != null)&&(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21068)!=0|true))||(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21069)==0&false))) {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21070);this.startTime = new Date(startTime.getTime());
        } }else {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21071);this.startTime = null;
        }
    }}finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private String startAddress;
    public String getStartAddress() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21072);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21073);return startAddress;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setStartAddress(String address) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21074);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21075);this.startAddress = address;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private Date endTime;
    public Date getEndTime() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21076);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21077);if ((((endTime != null)&&(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21078)!=0|true))||(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21079)==0&false))) {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21080);return new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21081);return null;
        }
    }}finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setEndTime(Date endTime) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21082);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21083);if ((((endTime != null)&&(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21084)!=0|true))||(__CLR4_5_2g8cg8clx1e0j3v.R.iget(21085)==0&false))) {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21086);this.endTime = new Date(endTime.getTime());
        } }else {{
            __CLR4_5_2g8cg8clx1e0j3v.R.inc(21087);this.endTime = null;
        }
    }}finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private String endAddress;
    public String getEndAddress() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21088);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21089);return endAddress;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setEndAddress(String address) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21090);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21091);this.endAddress = address;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private long duration;
    public long getDuration() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21092);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21093);return duration;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setDuration(long duration) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21094);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21095);this.duration = duration;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

    private String spentFuel;
    public String getSpentFuel() {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21096);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21097);return spentFuel;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}
    public void setSpentFuel(String spentFuel) {try{__CLR4_5_2g8cg8clx1e0j3v.R.inc(21098);
        __CLR4_5_2g8cg8clx1e0j3v.R.inc(21099);this.spentFuel = spentFuel;
    }finally{__CLR4_5_2g8cg8clx1e0j3v.R.flushNeeded();}}

}
