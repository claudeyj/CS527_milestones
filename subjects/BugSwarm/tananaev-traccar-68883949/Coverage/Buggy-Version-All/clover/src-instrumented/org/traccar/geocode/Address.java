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
package org.traccar.geocode;

public class Address {public static class __CLR4_5_2yayalx1dlmdn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564571051L,8589935092L,1262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String postcode;
    public String getPostcode() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1234); __CLR4_5_2yayalx1dlmdn.R.inc(1235);return postcode; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setPostcode(String postcode) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1236); __CLR4_5_2yayalx1dlmdn.R.inc(1237);this.postcode = postcode; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String country;
    public String getCountry() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1238); __CLR4_5_2yayalx1dlmdn.R.inc(1239);return country; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setCountry(String country) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1240); __CLR4_5_2yayalx1dlmdn.R.inc(1241);this.country = country; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String state;
    public String getState() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1242); __CLR4_5_2yayalx1dlmdn.R.inc(1243);return state; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setState(String state) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1244); __CLR4_5_2yayalx1dlmdn.R.inc(1245);this.state = state; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String district;
    public String getDistrict() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1246); __CLR4_5_2yayalx1dlmdn.R.inc(1247);return district; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setDistrict(String district) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1248); __CLR4_5_2yayalx1dlmdn.R.inc(1249);this.district = district; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String settlement;
    public String getSettlement() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1250); __CLR4_5_2yayalx1dlmdn.R.inc(1251);return settlement; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setSettlement(String settlement) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1252); __CLR4_5_2yayalx1dlmdn.R.inc(1253);this.settlement = settlement; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String street;
    public String getStreet() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1254); __CLR4_5_2yayalx1dlmdn.R.inc(1255);return street; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setStreet(String street) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1256); __CLR4_5_2yayalx1dlmdn.R.inc(1257);this.street = street; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

    private String house;
    public String getHouse() {try{__CLR4_5_2yayalx1dlmdn.R.inc(1258); __CLR4_5_2yayalx1dlmdn.R.inc(1259);return house; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}
    public void setHouse(String house) {try{__CLR4_5_2yayalx1dlmdn.R.inc(1260); __CLR4_5_2yayalx1dlmdn.R.inc(1261);this.house = house; }finally{__CLR4_5_2yayalx1dlmdn.R.flushNeeded();}}

}
