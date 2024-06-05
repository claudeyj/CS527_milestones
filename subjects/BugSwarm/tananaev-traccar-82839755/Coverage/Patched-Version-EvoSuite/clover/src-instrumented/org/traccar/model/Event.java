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

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Event {public static class __CLR4_5_21l41l4lx1e66ag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565528895L,8589935092L,2093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long id;
    public long getId() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2056); __CLR4_5_21l41l4lx1e66ag.R.inc(2057);return id; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setId(long id) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2058); __CLR4_5_21l41l4lx1e66ag.R.inc(2059);this.id = id; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    private String protocol;
    public String getProtocol() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2060); __CLR4_5_21l41l4lx1e66ag.R.inc(2061);return protocol; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setProtocol(String protocol) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2062); __CLR4_5_21l41l4lx1e66ag.R.inc(2063);this.protocol = protocol; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    private long deviceId;
    public long getDeviceId() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2064); __CLR4_5_21l41l4lx1e66ag.R.inc(2065);return deviceId; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setDeviceId(long deviceId) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2066); __CLR4_5_21l41l4lx1e66ag.R.inc(2067);this.deviceId = deviceId; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    private Date serverTime;
    public Date getServerTime() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2068); __CLR4_5_21l41l4lx1e66ag.R.inc(2069);return serverTime; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setServerTime(Date serverTime) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2070); __CLR4_5_21l41l4lx1e66ag.R.inc(2071);this.serverTime = serverTime; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    private Date deviceTime;
    public Date getDeviceTime() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2072); __CLR4_5_21l41l4lx1e66ag.R.inc(2073);return deviceTime; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setDeviceTime(Date deviceTime) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2074); __CLR4_5_21l41l4lx1e66ag.R.inc(2075);this.deviceTime = deviceTime; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    private Map<String, Object> attributes = new LinkedHashMap<>();
    public Map<String, Object> getAttributes() {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2076); __CLR4_5_21l41l4lx1e66ag.R.inc(2077);return attributes; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void setAttributes(Map<String, Object> attributes) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2078); __CLR4_5_21l41l4lx1e66ag.R.inc(2079);this.attributes = attributes; }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    public void set(String key, boolean value) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2080); __CLR4_5_21l41l4lx1e66ag.R.inc(2081);attributes.put(key, value); }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void set(String key, int value) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2082); __CLR4_5_21l41l4lx1e66ag.R.inc(2083);attributes.put(key, value); }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void set(String key, long value) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2084); __CLR4_5_21l41l4lx1e66ag.R.inc(2085);attributes.put(key, value); }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void set(String key, double value) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2086); __CLR4_5_21l41l4lx1e66ag.R.inc(2087);attributes.put(key, value); }finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}
    public void set(String key, String value) {try{__CLR4_5_21l41l4lx1e66ag.R.inc(2088); __CLR4_5_21l41l4lx1e66ag.R.inc(2089);if ((((value != null && !value.isEmpty())&&(__CLR4_5_21l41l4lx1e66ag.R.iget(2090)!=0|true))||(__CLR4_5_21l41l4lx1e66ag.R.iget(2091)==0&false))) {__CLR4_5_21l41l4lx1e66ag.R.inc(2092);attributes.put(key, value); }}finally{__CLR4_5_21l41l4lx1e66ag.R.flushNeeded();}}

    // Words separated by dashes (word-second-third)
    public static final String KEY_INDEX = "index";
    public static final String KEY_HDOP = "hdop";
    public static final String KEY_SATELLITES = "sat";
    public static final String KEY_GSM = "gsm";
    public static final String KEY_GPS = "gps";
    public static final String KEY_EVENT = "event";
    public static final String KEY_ALARM = "alarm";
    public static final String KEY_STATUS = "status";
    public static final String KEY_ODOMETER = "odometer";
    public static final String KEY_INPUT = "input";
    public static final String KEY_OUTPUT = "output";
    public static final String KEY_POWER = "power";
    public static final String KEY_BATTERY = "battery";
    public static final String KEY_MCC = "mcc";
    public static final String KEY_MNC = "mnc";
    public static final String KEY_LAC = "lac";
    public static final String KEY_CELL = "cell";
    public static final String KEY_FUEL = "fuel";
    public static final String KEY_RFID = "rfid";
    public static final String KEY_VERSION = "version";
    public static final String KEY_TYPE = "type";
    public static final String KEY_IGNITION = "ignition";
    public static final String KEY_FLAGS = "flags";
    public static final String KEY_CHARGE = "charge";
    public static final String KEY_IP = "ip";
    public static final String KEY_ARCHIVE = "archive";
    public static final String KEY_DISTANCE = "distance";
    public static final String KEY_DOOR = "door";
    public static final String KEY_RPM = "rpm";

    public static final String KEY_OBD_SPEED = "obd-speed";
    public static final String KEY_OBD_ODOMETER = "obd-odometer";

    // Starts with 1 not 0
    public static final String PREFIX_TEMP = "temp";
    public static final String PREFIX_ADC = "adc";
    public static final String PREFIX_IO = "io";
    public static final String PREFIX_COUNT = "count";

}
