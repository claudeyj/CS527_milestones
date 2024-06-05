/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Stefaan Van Dooren (stefaan.vandooren@gmail.com)
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

import javax.json.JsonArray;
import javax.json.JsonObject;

public class BingMapsGeocoder extends JsonGeocoder {public static class __CLR4_5_23e23e2lwydzjnt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,4432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public BingMapsGeocoder(String url, String key, int cacheSize) {
        super(url + "/Locations/%f,%f?key=" + key + "&include=ciso2", cacheSize);__CLR4_5_23e23e2lwydzjnt.R.inc(4395);try{__CLR4_5_23e23e2lwydzjnt.R.inc(4394);
    }finally{__CLR4_5_23e23e2lwydzjnt.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_23e23e2lwydzjnt.R.inc(4396);
        __CLR4_5_23e23e2lwydzjnt.R.inc(4397);JsonArray result = json.getJsonArray("resourceSets");
        __CLR4_5_23e23e2lwydzjnt.R.inc(4398);if ((((result != null)&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4399)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4400)==0&false))) {{
            __CLR4_5_23e23e2lwydzjnt.R.inc(4401);JsonObject location =
                    result.getJsonObject(0).getJsonArray("resources").getJsonObject(0).getJsonObject("address");
            __CLR4_5_23e23e2lwydzjnt.R.inc(4402);if ((((location != null)&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4403)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4404)==0&false))) {{
                __CLR4_5_23e23e2lwydzjnt.R.inc(4405);Address address = new Address();
                __CLR4_5_23e23e2lwydzjnt.R.inc(4406);if ((((location.containsKey("addressLine"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4407)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4408)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4409);address.setStreet(location.getString("addressLine"));
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4410);if ((((location.containsKey("locality"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4411)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4412)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4413);address.setSettlement(location.getString("locality"));
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4414);if ((((location.containsKey("adminDistrict2"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4415)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4416)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4417);address.setDistrict(location.getString("adminDistrict2"));
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4418);if ((((location.containsKey("adminDistrict"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4419)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4420)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4421);address.setState(location.getString("adminDistrict"));
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4422);if ((((location.containsKey("countryRegionIso2"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4423)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4424)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4425);address.setCountry(location.getString("countryRegionIso2").toUpperCase());
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4426);if ((((location.containsKey("postalCode"))&&(__CLR4_5_23e23e2lwydzjnt.R.iget(4427)!=0|true))||(__CLR4_5_23e23e2lwydzjnt.R.iget(4428)==0&false))) {{
                    __CLR4_5_23e23e2lwydzjnt.R.inc(4429);address.setPostcode(location.getString("postalCode"));
                }
                }__CLR4_5_23e23e2lwydzjnt.R.inc(4430);return address;
            }
        }}
        }__CLR4_5_23e23e2lwydzjnt.R.inc(4431);return null;
    }finally{__CLR4_5_23e23e2lwydzjnt.R.flushNeeded();}}

}
