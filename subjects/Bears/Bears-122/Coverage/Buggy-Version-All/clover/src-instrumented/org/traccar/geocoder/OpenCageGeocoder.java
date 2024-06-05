/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Stefaan Van Dooren (stefaan.vandooren@gmail.com)
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

import javax.json.JsonArray;
import javax.json.JsonObject;

public class OpenCageGeocoder extends JsonGeocoder {public static class __CLR4_5_23nc3nclwydzjr5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383820041L,8589935092L,4782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OpenCageGeocoder(String url, String key, int cacheSize) {
        super(url + "/json?q=%f,%f&key=" + key, cacheSize);__CLR4_5_23nc3nclwydzjr5.R.inc(4729);try{__CLR4_5_23nc3nclwydzjr5.R.inc(4728);
    }finally{__CLR4_5_23nc3nclwydzjr5.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_23nc3nclwydzjr5.R.inc(4730);
        __CLR4_5_23nc3nclwydzjr5.R.inc(4731);JsonArray result = json.getJsonArray("results");
        __CLR4_5_23nc3nclwydzjr5.R.inc(4732);if ((((result != null)&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4733)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4734)==0&false))) {{
            __CLR4_5_23nc3nclwydzjr5.R.inc(4735);JsonObject location = result.getJsonObject(0).getJsonObject("components");
            __CLR4_5_23nc3nclwydzjr5.R.inc(4736);if ((((location != null)&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4737)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4738)==0&false))) {{
                __CLR4_5_23nc3nclwydzjr5.R.inc(4739);Address address = new Address();

                __CLR4_5_23nc3nclwydzjr5.R.inc(4740);if ((((location.containsKey("building"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4741)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4742)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4743);address.setHouse(location.getString("building"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4744);if ((((location.containsKey("house_number"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4745)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4746)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4747);address.setHouse(location.getString("house_number"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4748);if ((((location.containsKey("road"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4749)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4750)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4751);address.setStreet(location.getString("road"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4752);if ((((location.containsKey("suburb"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4753)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4754)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4755);address.setSuburb(location.getString("suburb"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4756);if ((((location.containsKey("city"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4757)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4758)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4759);address.setSettlement(location.getString("city"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4760);if ((((location.containsKey("city_district"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4761)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4762)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4763);address.setSettlement(location.getString("city_district"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4764);if ((((location.containsKey("county"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4765)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4766)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4767);address.setDistrict(location.getString("county"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4768);if ((((location.containsKey("state"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4769)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4770)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4771);address.setState(location.getString("state"));
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4772);if ((((location.containsKey("country_code"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4773)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4774)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4775);address.setCountry(location.getString("country_code").toUpperCase());
                }
                }__CLR4_5_23nc3nclwydzjr5.R.inc(4776);if ((((location.containsKey("postcode"))&&(__CLR4_5_23nc3nclwydzjr5.R.iget(4777)!=0|true))||(__CLR4_5_23nc3nclwydzjr5.R.iget(4778)==0&false))) {{
                    __CLR4_5_23nc3nclwydzjr5.R.inc(4779);address.setPostcode(location.getString("postcode"));
                }

                }__CLR4_5_23nc3nclwydzjr5.R.inc(4780);return address;
            }
        }}
        }__CLR4_5_23nc3nclwydzjr5.R.inc(4781);return null;
    }finally{__CLR4_5_23nc3nclwydzjr5.R.flushNeeded();}}

}
