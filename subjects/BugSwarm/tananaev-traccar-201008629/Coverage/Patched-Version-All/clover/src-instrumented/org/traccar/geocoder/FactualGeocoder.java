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

import javax.json.JsonObject;

public class FactualGeocoder extends JsonGeocoder {public static class __CLR4_5_233x33xlx1e1i9i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,4067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public FactualGeocoder(String url, String key, int cacheSize) {
        super(url + "?latitude=%f&longitude=%f&KEY=" + key, cacheSize);__CLR4_5_233x33xlx1e1i9i.R.inc(4030);try{__CLR4_5_233x33xlx1e1i9i.R.inc(4029);
    }finally{__CLR4_5_233x33xlx1e1i9i.R.flushNeeded();}}

    @Override
    public Address parseAddress(JsonObject json) {try{__CLR4_5_233x33xlx1e1i9i.R.inc(4031);
        __CLR4_5_233x33xlx1e1i9i.R.inc(4032);JsonObject result = json.getJsonObject("response").getJsonObject("data");
        __CLR4_5_233x33xlx1e1i9i.R.inc(4033);if ((((result != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4034)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4035)==0&false))) {{
                __CLR4_5_233x33xlx1e1i9i.R.inc(4036);Address address = new Address();
                __CLR4_5_233x33xlx1e1i9i.R.inc(4037);if ((((result.getJsonObject("street_number") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4038)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4039)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4040);address.setHouse(result.getJsonObject("street_number").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4041);if ((((result.getJsonObject("street_name") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4042)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4043)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4044);address.setStreet(result.getJsonObject("street_name").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4045);if ((((result.getJsonObject("locality") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4046)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4047)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4048);address.setSettlement(result.getJsonObject("locality").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4049);if ((((result.getJsonObject("county") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4050)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4051)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4052);address.setDistrict(result.getJsonObject("county").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4053);if ((((result.getJsonObject("region") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4054)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4055)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4056);address.setState(result.getJsonObject("region").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4057);if ((((result.getJsonObject("country") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4058)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4059)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4060);address.setCountry(result.getJsonObject("country").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4061);if ((((result.getJsonObject("postcode") != null)&&(__CLR4_5_233x33xlx1e1i9i.R.iget(4062)!=0|true))||(__CLR4_5_233x33xlx1e1i9i.R.iget(4063)==0&false))) {{
                    __CLR4_5_233x33xlx1e1i9i.R.inc(4064);address.setPostcode(result.getJsonObject("postcode").getString("name"));
                }
                }__CLR4_5_233x33xlx1e1i9i.R.inc(4065);return address;
        }
        }__CLR4_5_233x33xlx1e1i9i.R.inc(4066);return null;
    }finally{__CLR4_5_233x33xlx1e1i9i.R.flushNeeded();}}

}
