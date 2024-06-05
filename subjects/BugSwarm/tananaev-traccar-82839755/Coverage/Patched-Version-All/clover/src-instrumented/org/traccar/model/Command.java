/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.traccar.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Command implements Factory {public static class __CLR4_5_21jx1jxlx1e7y6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565611854L,8589935092L,2040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Command create() {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2013);
        __CLR4_5_21jx1jxlx1e7y6b.R.inc(2014);return new Command();
    }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}

    private long deviceId;
    public long getDeviceId() {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2015); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2016);return deviceId; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void setDeviceId(long deviceId) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2017); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2018);this.deviceId = deviceId; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}

    private String type;
    public String getType() {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2019); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2020);return type; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void setType(String type) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2021); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2022);this.type = type; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}

    private Map<String, Object> attributes = new LinkedHashMap<>();
    public Map<String, Object> getAttributes() {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2023); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2024);return attributes; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void setAttributes(Map<String, Object> attributes) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2025); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2026);this.attributes = attributes; }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}

    public void set(String key, boolean value) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2027); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2028);attributes.put(key, value); }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void set(String key, int value) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2029); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2030);attributes.put(key, value); }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void set(String key, long value) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2031); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2032);attributes.put(key, value); }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void set(String key, double value) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2033); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2034);attributes.put(key, value); }finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    public void set(String key, String value) {try{__CLR4_5_21jx1jxlx1e7y6b.R.inc(2035); __CLR4_5_21jx1jxlx1e7y6b.R.inc(2036);if ((((value != null && !value.isEmpty())&&(__CLR4_5_21jx1jxlx1e7y6b.R.iget(2037)!=0|true))||(__CLR4_5_21jx1jxlx1e7y6b.R.iget(2038)==0&false))) {__CLR4_5_21jx1jxlx1e7y6b.R.inc(2039);attributes.put(key, value); }}finally{__CLR4_5_21jx1jxlx1e7y6b.R.flushNeeded();}}
    
    public static final String TYPE_POSITION_SINGLE = "positionSingle";
    public static final String TYPE_POSITION_PERIODIC = "positionPeriodic";
    public static final String TYPE_POSITION_STOP = "positionStop";
    public static final String TYPE_ENGINE_STOP = "engineStop";
    public static final String TYPE_ENGINE_RESUME = "engineResume";
    public static final String TYPE_ALARM_ARM = "alarmArm";
    public static final String TYPE_ALARM_DISARM = "alarmDisarm";

    public static final String KEY_UNIQUE_ID = "uniqueId";
    public static final String KEY_FREQUENCY = "frequency";
    public static final String KEY_DEVICE_PASSWORD = "devicePassword";
    
}
