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

public class Server implements Factory {public static class __CLR4_5_21pi1pilx1e42j7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565430774L,8589935092L,2260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Server create() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2214);
        __CLR4_5_21pi1pilx1e42j7.R.inc(2215);return new Server();
    }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private long id;
    public long getId() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2216); __CLR4_5_21pi1pilx1e42j7.R.inc(2217);return id; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setId(long id) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2218); __CLR4_5_21pi1pilx1e42j7.R.inc(2219);this.id = id; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    
    private boolean registration;
    public boolean getRegistration() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2220); __CLR4_5_21pi1pilx1e42j7.R.inc(2221);return registration; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setRegistration(boolean registration) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2222); __CLR4_5_21pi1pilx1e42j7.R.inc(2223);this.registration = registration; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String map;
    public String getMap() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2224); __CLR4_5_21pi1pilx1e42j7.R.inc(2225);return map; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setMap(String map) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2226); __CLR4_5_21pi1pilx1e42j7.R.inc(2227);this.map = map; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String bingKey;
    public String getBingKey() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2228); __CLR4_5_21pi1pilx1e42j7.R.inc(2229);return bingKey; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setBingKey(String bingKey) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2230); __CLR4_5_21pi1pilx1e42j7.R.inc(2231);this.bingKey = bingKey; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String mapUrl;
    public String getMapUrl() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2232); __CLR4_5_21pi1pilx1e42j7.R.inc(2233);return mapUrl; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setMapUrl(String mapUrl) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2234); __CLR4_5_21pi1pilx1e42j7.R.inc(2235);this.mapUrl = mapUrl; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String language;
    public String getLanguage() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2236); __CLR4_5_21pi1pilx1e42j7.R.inc(2237);return language; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setLanguage(String language) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2238); __CLR4_5_21pi1pilx1e42j7.R.inc(2239);this.language = language; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String distanceUnit;
    public String getDistanceUnit() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2240); __CLR4_5_21pi1pilx1e42j7.R.inc(2241);return distanceUnit; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setDistanceUnit(String distanceUnit) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2242); __CLR4_5_21pi1pilx1e42j7.R.inc(2243);this.distanceUnit = distanceUnit; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private String speedUnit;
    public String getSpeedUnit() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2244); __CLR4_5_21pi1pilx1e42j7.R.inc(2245);return speedUnit; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setSpeedUnit(String speedUnit) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2246); __CLR4_5_21pi1pilx1e42j7.R.inc(2247);this.speedUnit = speedUnit; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private double latitude;
    public double getLatitude() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2248); __CLR4_5_21pi1pilx1e42j7.R.inc(2249);return latitude; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setLatitude(double latitude) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2250); __CLR4_5_21pi1pilx1e42j7.R.inc(2251);this.latitude = latitude; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

    private double longitude;
    public double getLongitude() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2252); __CLR4_5_21pi1pilx1e42j7.R.inc(2253);return longitude; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setLongitude(double longitude) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2254); __CLR4_5_21pi1pilx1e42j7.R.inc(2255);this.longitude = longitude; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    
    private int zoom;
    public int getZoom() {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2256); __CLR4_5_21pi1pilx1e42j7.R.inc(2257);return zoom; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}
    public void setZoom(int zoom) {try{__CLR4_5_21pi1pilx1e42j7.R.inc(2258); __CLR4_5_21pi1pilx1e42j7.R.inc(2259);this.zoom = zoom; }finally{__CLR4_5_21pi1pilx1e42j7.R.flushNeeded();}}

}
