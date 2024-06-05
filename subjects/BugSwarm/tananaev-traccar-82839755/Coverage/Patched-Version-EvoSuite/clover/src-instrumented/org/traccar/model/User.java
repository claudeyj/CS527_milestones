/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2013 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import org.traccar.helper.Hashing;
import org.traccar.web.JsonIgnore;

public class User implements Factory {public static class __CLR4_5_21qs1qslx1e66fb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,2326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public User create() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2260);
        __CLR4_5_21qs1qslx1e66fb.R.inc(2261);return new User();
    }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private long id;
    public long getId() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2262); __CLR4_5_21qs1qslx1e66fb.R.inc(2263);return id; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setId(long id) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2264); __CLR4_5_21qs1qslx1e66fb.R.inc(2265);this.id = id; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    
    private String name;
    public String getName() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2266); __CLR4_5_21qs1qslx1e66fb.R.inc(2267);return name; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setName(String name) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2268); __CLR4_5_21qs1qslx1e66fb.R.inc(2269);this.name = name; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    
    private String email;
    public String getEmail() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2270); __CLR4_5_21qs1qslx1e66fb.R.inc(2271);return email; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setEmail(String email) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2272); __CLR4_5_21qs1qslx1e66fb.R.inc(2273);this.email = email; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private boolean readonly;
    
    private boolean admin;
    public boolean getAdmin() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2274); __CLR4_5_21qs1qslx1e66fb.R.inc(2275);return admin; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setAdmin(boolean admin) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2276); __CLR4_5_21qs1qslx1e66fb.R.inc(2277);this.admin = admin; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    
    private String map;
    public String getMap() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2278); __CLR4_5_21qs1qslx1e66fb.R.inc(2279);return map; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setMap(String map) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2280); __CLR4_5_21qs1qslx1e66fb.R.inc(2281);this.map = map; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String language;
    public String getLanguage() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2282); __CLR4_5_21qs1qslx1e66fb.R.inc(2283);return language; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setLanguage(String language) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2284); __CLR4_5_21qs1qslx1e66fb.R.inc(2285);this.language = language; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String distanceUnit;
    public String getDistanceUnit() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2286); __CLR4_5_21qs1qslx1e66fb.R.inc(2287);return distanceUnit; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setDistanceUnit(String distanceUnit) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2288); __CLR4_5_21qs1qslx1e66fb.R.inc(2289);this.distanceUnit = distanceUnit; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String speedUnit;
    public String getSpeedUnit() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2290); __CLR4_5_21qs1qslx1e66fb.R.inc(2291);return speedUnit; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setSpeedUnit(String speedUnit) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2292); __CLR4_5_21qs1qslx1e66fb.R.inc(2293);this.speedUnit = speedUnit; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private double latitude;
    public double getLatitude() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2294); __CLR4_5_21qs1qslx1e66fb.R.inc(2295);return latitude; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setLatitude(double latitude) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2296); __CLR4_5_21qs1qslx1e66fb.R.inc(2297);this.latitude = latitude; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private double longitude;
    public double getLongitude() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2298); __CLR4_5_21qs1qslx1e66fb.R.inc(2299);return longitude; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setLongitude(double longitude) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2300); __CLR4_5_21qs1qslx1e66fb.R.inc(2301);this.longitude = longitude; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private int zoom;
    public int getZoom() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2302); __CLR4_5_21qs1qslx1e66fb.R.inc(2303);return zoom; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setZoom(int zoom) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2304); __CLR4_5_21qs1qslx1e66fb.R.inc(2305);this.zoom = zoom; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String password;
    public String getPassword() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2306); __CLR4_5_21qs1qslx1e66fb.R.inc(2307);return password; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setPassword(String password) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2308);
        __CLR4_5_21qs1qslx1e66fb.R.inc(2309);this.password = password;
        __CLR4_5_21qs1qslx1e66fb.R.inc(2310);if ((((password != null && !password.isEmpty())&&(__CLR4_5_21qs1qslx1e66fb.R.iget(2311)!=0|true))||(__CLR4_5_21qs1qslx1e66fb.R.iget(2312)==0&false))) {{
            __CLR4_5_21qs1qslx1e66fb.R.inc(2313);Hashing.HashingResult hashingResult = Hashing.createHash(password);
            __CLR4_5_21qs1qslx1e66fb.R.inc(2314);hashedPassword = hashingResult.hash;
            __CLR4_5_21qs1qslx1e66fb.R.inc(2315);salt = hashingResult.salt;
        }
    }}finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String hashedPassword;
    @JsonIgnore
    public String getHashedPassword() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2316); __CLR4_5_21qs1qslx1e66fb.R.inc(2317);return hashedPassword; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setHashedPassword(String hashedPassword) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2318); __CLR4_5_21qs1qslx1e66fb.R.inc(2319);this.hashedPassword = hashedPassword; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    private String salt;
    @JsonIgnore
    public String getSalt() {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2320); __CLR4_5_21qs1qslx1e66fb.R.inc(2321);return salt; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}
    public void setSalt(String salt) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2322); __CLR4_5_21qs1qslx1e66fb.R.inc(2323);this.salt = salt; }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

    public boolean isPasswordValid(String password) {try{__CLR4_5_21qs1qslx1e66fb.R.inc(2324);
        __CLR4_5_21qs1qslx1e66fb.R.inc(2325);return Hashing.validatePassword(password, hashedPassword, salt);
    }finally{__CLR4_5_21qs1qslx1e66fb.R.flushNeeded();}}

}
