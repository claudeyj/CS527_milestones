/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

public class Server implements Factory {public static class __CLR4_5_21ur1urlx1di5ib{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564407310L,8589935092L,2425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Server create() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2403);
        __CLR4_5_21ur1urlx1di5ib.R.inc(2404);return new Server();
    }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}

    private long id;
    public long getId() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2405); __CLR4_5_21ur1urlx1di5ib.R.inc(2406);return id; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    public void setId(long id) {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2407); __CLR4_5_21ur1urlx1di5ib.R.inc(2408);this.id = id; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    
    private boolean registration;
    public boolean getRegistration() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2409); __CLR4_5_21ur1urlx1di5ib.R.inc(2410);return registration; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    public void setRegistration(boolean registration) {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2411); __CLR4_5_21ur1urlx1di5ib.R.inc(2412);this.registration = registration; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    
    private double latitude;
    public double getLatitude() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2413); __CLR4_5_21ur1urlx1di5ib.R.inc(2414);return latitude; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    public void setLatitude(double latitude) {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2415); __CLR4_5_21ur1urlx1di5ib.R.inc(2416);this.latitude = latitude; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}

    private double longitude;
    public double getLongitude() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2417); __CLR4_5_21ur1urlx1di5ib.R.inc(2418);return longitude; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    public void setLongitude(double longitude) {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2419); __CLR4_5_21ur1urlx1di5ib.R.inc(2420);this.longitude = longitude; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    
    private int zoom;
    public int getZoom() {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2421); __CLR4_5_21ur1urlx1di5ib.R.inc(2422);return zoom; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}
    public void setZoom(int zoom) {try{__CLR4_5_21ur1urlx1di5ib.R.inc(2423); __CLR4_5_21ur1urlx1di5ib.R.inc(2424);this.zoom = zoom; }finally{__CLR4_5_21ur1urlx1di5ib.R.flushNeeded();}}

}
