/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {public static class __CLR4_5_2czczlwydyd8h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,521,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Properties properties = new Properties();

    private boolean useEnvironmentVariables;

    void load(String file) throws IOException {try{__CLR4_5_2czczlwydyd8h.R.inc(467);
        __CLR4_5_2czczlwydyd8h.R.inc(468);Properties mainProperties = new Properties();
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2czczlwydyd8h.R.inc(469);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2czczlwydyd8h.R.inc(470);}};InputStream inputStream = new FileInputStream(file)) {
            __CLR4_5_2czczlwydyd8h.R.inc(471);mainProperties.loadFromXML(inputStream);
        }

        __CLR4_5_2czczlwydyd8h.R.inc(472);String defaultConfigFile = mainProperties.getProperty("config.default");
        __CLR4_5_2czczlwydyd8h.R.inc(473);if ((((defaultConfigFile != null)&&(__CLR4_5_2czczlwydyd8h.R.iget(474)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(475)==0&false))) {{
            class __CLR4_5_2$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2czczlwydyd8h.R.inc(476);try (__CLR4_5_2$AC1 __CLR$ACI1=new __CLR4_5_2$AC1(){{__CLR4_5_2czczlwydyd8h.R.inc(477);}};InputStream inputStream = new FileInputStream(defaultConfigFile)) {
                __CLR4_5_2czczlwydyd8h.R.inc(478);properties.loadFromXML(inputStream);
            }
        }

        }__CLR4_5_2czczlwydyd8h.R.inc(479);properties.putAll(mainProperties); // override defaults

        __CLR4_5_2czczlwydyd8h.R.inc(480);useEnvironmentVariables = Boolean.parseBoolean(System.getenv("CONFIG_USE_ENVIRONMENT_VARIABLES"))
                || Boolean.parseBoolean(properties.getProperty("config.useEnvironmentVariables"));
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public boolean hasKey(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(481);
        __CLR4_5_2czczlwydyd8h.R.inc(482);return useEnvironmentVariables && System.getenv().containsKey(getEnvironmentVariableName(key))
                || properties.containsKey(key);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public String getString(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(483);
        __CLR4_5_2czczlwydyd8h.R.inc(484);if ((((useEnvironmentVariables)&&(__CLR4_5_2czczlwydyd8h.R.iget(485)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(486)==0&false))) {{
            __CLR4_5_2czczlwydyd8h.R.inc(487);String value = System.getenv(getEnvironmentVariableName(key));
            __CLR4_5_2czczlwydyd8h.R.inc(488);if ((((value != null && !value.isEmpty())&&(__CLR4_5_2czczlwydyd8h.R.iget(489)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(490)==0&false))) {{
                __CLR4_5_2czczlwydyd8h.R.inc(491);return value;
            }
        }}
        }__CLR4_5_2czczlwydyd8h.R.inc(492);return properties.getProperty(key);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public String getString(String key, String defaultValue) {try{__CLR4_5_2czczlwydyd8h.R.inc(493);
        __CLR4_5_2czczlwydyd8h.R.inc(494);return (((hasKey(key) )&&(__CLR4_5_2czczlwydyd8h.R.iget(495)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(496)==0&false))? getString(key) : defaultValue;
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public boolean getBoolean(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(497);
        __CLR4_5_2czczlwydyd8h.R.inc(498);return Boolean.parseBoolean(getString(key));
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public int getInteger(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(499);
        __CLR4_5_2czczlwydyd8h.R.inc(500);return getInteger(key, 0);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public int getInteger(String key, int defaultValue) {try{__CLR4_5_2czczlwydyd8h.R.inc(501);
        __CLR4_5_2czczlwydyd8h.R.inc(502);return (((hasKey(key) )&&(__CLR4_5_2czczlwydyd8h.R.iget(503)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(504)==0&false))? Integer.parseInt(getString(key)) : defaultValue;
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public long getLong(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(505);
        __CLR4_5_2czczlwydyd8h.R.inc(506);return getLong(key, 0);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public long getLong(String key, long defaultValue) {try{__CLR4_5_2czczlwydyd8h.R.inc(507);
        __CLR4_5_2czczlwydyd8h.R.inc(508);return (((hasKey(key) )&&(__CLR4_5_2czczlwydyd8h.R.iget(509)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(510)==0&false))? Long.parseLong(getString(key)) : defaultValue;
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public double getDouble(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(511);
        __CLR4_5_2czczlwydyd8h.R.inc(512);return getDouble(key, 0.0);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public double getDouble(String key, double defaultValue) {try{__CLR4_5_2czczlwydyd8h.R.inc(513);
        __CLR4_5_2czczlwydyd8h.R.inc(514);return (((hasKey(key) )&&(__CLR4_5_2czczlwydyd8h.R.iget(515)!=0|true))||(__CLR4_5_2czczlwydyd8h.R.iget(516)==0&false))? Double.parseDouble(getString(key)) : defaultValue;
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public static String getEnvironmentVariableName(String key) {try{__CLR4_5_2czczlwydyd8h.R.inc(517);
        __CLR4_5_2czczlwydyd8h.R.inc(518);return key.replaceAll("\\.", "_").replaceAll("(\\p{Lu})", "_$1").toUpperCase();
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

    public void setString(String key, String value) {try{__CLR4_5_2czczlwydyd8h.R.inc(519);
        __CLR4_5_2czczlwydyd8h.R.inc(520);properties.put(key, value);
    }finally{__CLR4_5_2czczlwydyd8h.R.flushNeeded();}}

}
