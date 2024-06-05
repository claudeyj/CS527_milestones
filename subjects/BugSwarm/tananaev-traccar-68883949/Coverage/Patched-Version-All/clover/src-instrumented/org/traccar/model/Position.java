/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
package org.traccar.model;

import java.util.Date;

public class Position extends Event implements Factory {public static class __CLR4_5_21tr1trlx1dsl2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564894801L,8589935092L,2404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Position create() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2367);
        __CLR4_5_21tr1trlx1dsl2l.R.inc(2368);return new Position();
    }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private Date fixTime;
    public Date getFixTime() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2369); __CLR4_5_21tr1trlx1dsl2l.R.inc(2370);return fixTime; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setFixTime(Date fixTime) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2371); __CLR4_5_21tr1trlx1dsl2l.R.inc(2372);this.fixTime = fixTime; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    
    public void setTime(Date time) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2373);
        __CLR4_5_21tr1trlx1dsl2l.R.inc(2374);setDeviceTime(time);
        __CLR4_5_21tr1trlx1dsl2l.R.inc(2375);fixTime = time;
    }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private boolean valid;
    public boolean getValid() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2376); __CLR4_5_21tr1trlx1dsl2l.R.inc(2377);return valid; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setValid(boolean valid) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2378); __CLR4_5_21tr1trlx1dsl2l.R.inc(2379);this.valid = valid; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private double latitude;
    public double getLatitude() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2380); __CLR4_5_21tr1trlx1dsl2l.R.inc(2381);return latitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setLatitude(double latitude) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2382); __CLR4_5_21tr1trlx1dsl2l.R.inc(2383);this.latitude = latitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private double longitude;
    public double getLongitude() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2384); __CLR4_5_21tr1trlx1dsl2l.R.inc(2385);return longitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setLongitude(double longitude) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2386); __CLR4_5_21tr1trlx1dsl2l.R.inc(2387);this.longitude = longitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private double altitude;
    public double getAltitude() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2388); __CLR4_5_21tr1trlx1dsl2l.R.inc(2389);return altitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setAltitude(double altitude) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2390); __CLR4_5_21tr1trlx1dsl2l.R.inc(2391);this.altitude = altitude; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private double speed; // value in knots
    public double getSpeed() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2392); __CLR4_5_21tr1trlx1dsl2l.R.inc(2393);return speed; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setSpeed(double speed) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2394); __CLR4_5_21tr1trlx1dsl2l.R.inc(2395);this.speed = speed; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private double course;
    public double getCourse() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2396); __CLR4_5_21tr1trlx1dsl2l.R.inc(2397);return course; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setCourse(double course) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2398); __CLR4_5_21tr1trlx1dsl2l.R.inc(2399);this.course = course; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

    private String address;
    public String getAddress() {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2400); __CLR4_5_21tr1trlx1dsl2l.R.inc(2401);return address; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}
    public void setAddress(String address) {try{__CLR4_5_21tr1trlx1dsl2l.R.inc(2402); __CLR4_5_21tr1trlx1dsl2l.R.inc(2403);this.address = address; }finally{__CLR4_5_21tr1trlx1dsl2l.R.flushNeeded();}}

}
