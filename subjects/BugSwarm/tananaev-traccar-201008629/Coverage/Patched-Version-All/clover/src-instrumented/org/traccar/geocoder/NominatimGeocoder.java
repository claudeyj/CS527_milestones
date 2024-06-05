/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton@traccar.org)
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

public class NominatimGeocoder extends JsonGeocoder {public static class __CLR4_5_239r39rlx1e1ic3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,4297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NominatimGeocoder() {
        this("http://nominatim.openstreetmap.org/reverse", 0);__CLR4_5_239r39rlx1e1ic3.R.inc(4240);try{__CLR4_5_239r39rlx1e1ic3.R.inc(4239);
    }finally{__CLR4_5_239r39rlx1e1ic3.R.flushNeeded();}}

    public NominatimGeocoder(String url, int cacheSize) {
        super(url + "?format=json&lat=%f&lon=%f&zoom=18&addressdetails=1", cacheSize);__CLR4_5_239r39rlx1e1ic3.R.inc(4242);try{__CLR4_5_239r39rlx1e1ic3.R.inc(4241);
    }finally{__CLR4_5_239r39rlx1e1ic3.R.flushNeeded();}}

    public NominatimGeocoder(String url, String key, int cacheSize) {
        super(url + "?format=json&lat=%f&lon=%f&zoom=18&addressdetails=1&key=" + key, cacheSize);__CLR4_5_239r39rlx1e1ic3.R.inc(4244);try{__CLR4_5_239r39rlx1e1ic3.R.inc(4243);
    }finally{__CLR4_5_239r39rlx1e1ic3.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_239r39rlx1e1ic3.R.inc(4245);
        __CLR4_5_239r39rlx1e1ic3.R.inc(4246);JsonObject result = json.getJsonObject("address");

        __CLR4_5_239r39rlx1e1ic3.R.inc(4247);if ((((result != null)&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4248)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4249)==0&false))) {{
            __CLR4_5_239r39rlx1e1ic3.R.inc(4250);Address address = new Address();

            __CLR4_5_239r39rlx1e1ic3.R.inc(4251);if ((((result.containsKey("house_number"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4252)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4253)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4254);address.setHouse(result.getString("house_number"));
            }
            }__CLR4_5_239r39rlx1e1ic3.R.inc(4255);if ((((result.containsKey("road"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4256)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4257)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4258);address.setStreet(result.getString("road"));
            }
            }__CLR4_5_239r39rlx1e1ic3.R.inc(4259);if ((((result.containsKey("suburb"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4260)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4261)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4262);address.setSuburb(result.getString("suburb"));
            }

            }__CLR4_5_239r39rlx1e1ic3.R.inc(4263);if ((((result.containsKey("village"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4264)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4265)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4266);address.setSettlement(result.getString("village"));
            } }else {__CLR4_5_239r39rlx1e1ic3.R.inc(4267);if ((((result.containsKey("town"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4268)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4269)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4270);address.setSettlement(result.getString("town"));
            } }else {__CLR4_5_239r39rlx1e1ic3.R.inc(4271);if ((((result.containsKey("city"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4272)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4273)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4274);address.setSettlement(result.getString("city"));
            }

            }}}__CLR4_5_239r39rlx1e1ic3.R.inc(4275);if ((((result.containsKey("state_district"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4276)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4277)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4278);address.setDistrict(result.getString("state_district"));
            } }else {__CLR4_5_239r39rlx1e1ic3.R.inc(4279);if ((((result.containsKey("region"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4280)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4281)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4282);address.setDistrict(result.getString("region"));
            }

            }}__CLR4_5_239r39rlx1e1ic3.R.inc(4283);if ((((result.containsKey("state"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4284)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4285)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4286);address.setState(result.getString("state"));
            }
            }__CLR4_5_239r39rlx1e1ic3.R.inc(4287);if ((((result.containsKey("country_code"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4288)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4289)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4290);address.setCountry(result.getString("country_code").toUpperCase());
            }
            }__CLR4_5_239r39rlx1e1ic3.R.inc(4291);if ((((result.containsKey("postcode"))&&(__CLR4_5_239r39rlx1e1ic3.R.iget(4292)!=0|true))||(__CLR4_5_239r39rlx1e1ic3.R.iget(4293)==0&false))) {{
                __CLR4_5_239r39rlx1e1ic3.R.inc(4294);address.setPostcode(result.getString("postcode"));
            }

            }__CLR4_5_239r39rlx1e1ic3.R.inc(4295);return address;
        }

        }__CLR4_5_239r39rlx1e1ic3.R.inc(4296);return null;
    }finally{__CLR4_5_239r39rlx1e1ic3.R.flushNeeded();}}

}
