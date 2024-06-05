/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar.geocoder;

import javax.json.JsonObject;

public class GeocodeFarmGeocoder extends JsonGeocoder {public static class __CLR4_5_234z34zlx1e0egk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,4095,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String URL = "https://www.geocode.farm/v3/json/reverse/";

    public GeocodeFarmGeocoder(int cacheSize) {
        super(URL + "?lat=%f&lon=%f&country=us&lang=en&count=1", cacheSize);__CLR4_5_234z34zlx1e0egk.R.inc(4068);try{__CLR4_5_234z34zlx1e0egk.R.inc(4067);
    }finally{__CLR4_5_234z34zlx1e0egk.R.flushNeeded();}}

    public GeocodeFarmGeocoder(String key, int cacheSize) {
        super(URL + "?lat=%f&lon=%f&country=us&lang=en&count=1&key=" + key, cacheSize);__CLR4_5_234z34zlx1e0egk.R.inc(4070);try{__CLR4_5_234z34zlx1e0egk.R.inc(4069);
    }finally{__CLR4_5_234z34zlx1e0egk.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_234z34zlx1e0egk.R.inc(4071);
        __CLR4_5_234z34zlx1e0egk.R.inc(4072);Address address = new Address();

        __CLR4_5_234z34zlx1e0egk.R.inc(4073);JsonObject result = json
                .getJsonObject("geocoding_results")
                .getJsonArray("RESULTS")
                .getJsonObject(0)
                .getJsonObject("ADDRESS");

        __CLR4_5_234z34zlx1e0egk.R.inc(4074);if ((((result.containsKey("street_number"))&&(__CLR4_5_234z34zlx1e0egk.R.iget(4075)!=0|true))||(__CLR4_5_234z34zlx1e0egk.R.iget(4076)==0&false))) {{
            __CLR4_5_234z34zlx1e0egk.R.inc(4077);address.setStreet(result.getString("street_number"));
        }
        }__CLR4_5_234z34zlx1e0egk.R.inc(4078);if ((((result.containsKey("street_name"))&&(__CLR4_5_234z34zlx1e0egk.R.iget(4079)!=0|true))||(__CLR4_5_234z34zlx1e0egk.R.iget(4080)==0&false))) {{
            __CLR4_5_234z34zlx1e0egk.R.inc(4081);address.setStreet(result.getString("street_name"));
        }
        }__CLR4_5_234z34zlx1e0egk.R.inc(4082);if ((((result.containsKey("locality"))&&(__CLR4_5_234z34zlx1e0egk.R.iget(4083)!=0|true))||(__CLR4_5_234z34zlx1e0egk.R.iget(4084)==0&false))) {{
            __CLR4_5_234z34zlx1e0egk.R.inc(4085);address.setSettlement(result.getString("locality"));
        }
        }__CLR4_5_234z34zlx1e0egk.R.inc(4086);if ((((result.containsKey("admin_1"))&&(__CLR4_5_234z34zlx1e0egk.R.iget(4087)!=0|true))||(__CLR4_5_234z34zlx1e0egk.R.iget(4088)==0&false))) {{
            __CLR4_5_234z34zlx1e0egk.R.inc(4089);address.setState(result.getString("admin_1"));
        }
        }__CLR4_5_234z34zlx1e0egk.R.inc(4090);if ((((result.containsKey("country"))&&(__CLR4_5_234z34zlx1e0egk.R.iget(4091)!=0|true))||(__CLR4_5_234z34zlx1e0egk.R.iget(4092)==0&false))) {{
            __CLR4_5_234z34zlx1e0egk.R.inc(4093);address.setCountry(result.getString("country"));
        }

        }__CLR4_5_234z34zlx1e0egk.R.inc(4094);return address;
    }finally{__CLR4_5_234z34zlx1e0egk.R.flushNeeded();}}

}
