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

public class MapQuestGeocoder extends JsonGeocoder {public static class __CLR4_5_23kc3kclwydwa74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,4659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MapQuestGeocoder(String url, String key, int cacheSize) {
        super(url + "?key=" + key + "&location=%f,%f", cacheSize);__CLR4_5_23kc3kclwydwa74.R.inc(4621);try{__CLR4_5_23kc3kclwydwa74.R.inc(4620);
    }finally{__CLR4_5_23kc3kclwydwa74.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_23kc3kclwydwa74.R.inc(4622);
        __CLR4_5_23kc3kclwydwa74.R.inc(4623);JsonArray result = json.getJsonArray("results");
        __CLR4_5_23kc3kclwydwa74.R.inc(4624);if ((((result != null)&&(__CLR4_5_23kc3kclwydwa74.R.iget(4625)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4626)==0&false))) {{
            __CLR4_5_23kc3kclwydwa74.R.inc(4627);JsonArray locations = result.getJsonObject(0).getJsonArray("locations");
            __CLR4_5_23kc3kclwydwa74.R.inc(4628);if ((((locations != null)&&(__CLR4_5_23kc3kclwydwa74.R.iget(4629)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4630)==0&false))) {{
                __CLR4_5_23kc3kclwydwa74.R.inc(4631);JsonObject location = locations.getJsonObject(0);

                __CLR4_5_23kc3kclwydwa74.R.inc(4632);Address address = new Address();

                __CLR4_5_23kc3kclwydwa74.R.inc(4633);if ((((location.containsKey("street"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4634)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4635)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4636);address.setStreet(location.getString("street"));
                }
                }__CLR4_5_23kc3kclwydwa74.R.inc(4637);if ((((location.containsKey("adminArea5"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4638)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4639)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4640);address.setSettlement(location.getString("adminArea5"));
                }
                }__CLR4_5_23kc3kclwydwa74.R.inc(4641);if ((((location.containsKey("adminArea4"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4642)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4643)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4644);address.setDistrict(location.getString("adminArea4"));
                }
                }__CLR4_5_23kc3kclwydwa74.R.inc(4645);if ((((location.containsKey("adminArea3"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4646)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4647)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4648);address.setState(location.getString("adminArea3"));
                }
                }__CLR4_5_23kc3kclwydwa74.R.inc(4649);if ((((location.containsKey("adminArea1"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4650)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4651)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4652);address.setCountry(location.getString("adminArea1").toUpperCase());
                }
                }__CLR4_5_23kc3kclwydwa74.R.inc(4653);if ((((location.containsKey("postalCode"))&&(__CLR4_5_23kc3kclwydwa74.R.iget(4654)!=0|true))||(__CLR4_5_23kc3kclwydwa74.R.iget(4655)==0&false))) {{
                    __CLR4_5_23kc3kclwydwa74.R.inc(4656);address.setPostcode(location.getString("postalCode"));
                }

                }__CLR4_5_23kc3kclwydwa74.R.inc(4657);return address;
            }
        }}
        }__CLR4_5_23kc3kclwydwa74.R.inc(4658);return null;
    }finally{__CLR4_5_23kc3kclwydwa74.R.flushNeeded();}}

}
