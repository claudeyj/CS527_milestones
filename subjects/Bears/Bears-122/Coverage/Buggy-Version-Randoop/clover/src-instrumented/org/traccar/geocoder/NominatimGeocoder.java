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

public class NominatimGeocoder extends JsonGeocoder {public static class __CLR4_5_23lf3lflwydyfsx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383768373L,8589935092L,4728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static String formatUrl(String url, String key, String language) {try{__CLR4_5_23lf3lflwydyfsx.R.inc(4659);
        __CLR4_5_23lf3lflwydyfsx.R.inc(4660);if ((((url == null)&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4661)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4662)==0&false))) {{
            __CLR4_5_23lf3lflwydyfsx.R.inc(4663);url = "http://nominatim.openstreetmap.org/reverse";
        }
        }__CLR4_5_23lf3lflwydyfsx.R.inc(4664);url += "?format=json&lat=%f&lon=%f&zoom=18&addressdetails=1";
        __CLR4_5_23lf3lflwydyfsx.R.inc(4665);if ((((key != null)&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4666)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4667)==0&false))) {{
            __CLR4_5_23lf3lflwydyfsx.R.inc(4668);url += "&key=" + key;
        }
        }__CLR4_5_23lf3lflwydyfsx.R.inc(4669);if ((((language != null)&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4670)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4671)==0&false))) {{
            __CLR4_5_23lf3lflwydyfsx.R.inc(4672);url += "&accept-language=" + language;
        }
        }__CLR4_5_23lf3lflwydyfsx.R.inc(4673);return url;
    }finally{__CLR4_5_23lf3lflwydyfsx.R.flushNeeded();}}

    public NominatimGeocoder(String url, String key, String language, int cacheSize) {
        super(formatUrl(url, key, language), cacheSize);__CLR4_5_23lf3lflwydyfsx.R.inc(4675);try{__CLR4_5_23lf3lflwydyfsx.R.inc(4674);
    }finally{__CLR4_5_23lf3lflwydyfsx.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_23lf3lflwydyfsx.R.inc(4676);
        __CLR4_5_23lf3lflwydyfsx.R.inc(4677);JsonObject result = json.getJsonObject("address");

        __CLR4_5_23lf3lflwydyfsx.R.inc(4678);if ((((result != null)&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4679)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4680)==0&false))) {{
            __CLR4_5_23lf3lflwydyfsx.R.inc(4681);Address address = new Address();

            __CLR4_5_23lf3lflwydyfsx.R.inc(4682);if ((((result.containsKey("house_number"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4683)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4684)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4685);address.setHouse(result.getString("house_number"));
            }
            }__CLR4_5_23lf3lflwydyfsx.R.inc(4686);if ((((result.containsKey("road"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4687)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4688)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4689);address.setStreet(result.getString("road"));
            }
            }__CLR4_5_23lf3lflwydyfsx.R.inc(4690);if ((((result.containsKey("suburb"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4691)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4692)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4693);address.setSuburb(result.getString("suburb"));
            }

            }__CLR4_5_23lf3lflwydyfsx.R.inc(4694);if ((((result.containsKey("village"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4695)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4696)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4697);address.setSettlement(result.getString("village"));
            } }else {__CLR4_5_23lf3lflwydyfsx.R.inc(4698);if ((((result.containsKey("town"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4699)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4700)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4701);address.setSettlement(result.getString("town"));
            } }else {__CLR4_5_23lf3lflwydyfsx.R.inc(4702);if ((((result.containsKey("city"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4703)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4704)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4705);address.setSettlement(result.getString("city"));
            }

            }}}__CLR4_5_23lf3lflwydyfsx.R.inc(4706);if ((((result.containsKey("state_district"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4707)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4708)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4709);address.setDistrict(result.getString("state_district"));
            } }else {__CLR4_5_23lf3lflwydyfsx.R.inc(4710);if ((((result.containsKey("region"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4711)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4712)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4713);address.setDistrict(result.getString("region"));
            }

            }}__CLR4_5_23lf3lflwydyfsx.R.inc(4714);if ((((result.containsKey("state"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4715)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4716)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4717);address.setState(result.getString("state"));
            }
            }__CLR4_5_23lf3lflwydyfsx.R.inc(4718);if ((((result.containsKey("country_code"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4719)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4720)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4721);address.setCountry(result.getString("country_code").toUpperCase());
            }
            }__CLR4_5_23lf3lflwydyfsx.R.inc(4722);if ((((result.containsKey("postcode"))&&(__CLR4_5_23lf3lflwydyfsx.R.iget(4723)!=0|true))||(__CLR4_5_23lf3lflwydyfsx.R.iget(4724)==0&false))) {{
                __CLR4_5_23lf3lflwydyfsx.R.inc(4725);address.setPostcode(result.getString("postcode"));
            }

            }__CLR4_5_23lf3lflwydyfsx.R.inc(4726);return address;
        }

        }__CLR4_5_23lf3lflwydyfsx.R.inc(4727);return null;
    }finally{__CLR4_5_23lf3lflwydyfsx.R.flushNeeded();}}

}
