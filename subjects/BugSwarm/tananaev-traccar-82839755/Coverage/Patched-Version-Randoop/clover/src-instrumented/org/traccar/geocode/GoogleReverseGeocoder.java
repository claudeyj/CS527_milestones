/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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
package org.traccar.geocode;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonString;

@java.lang.SuppressWarnings({"fallthrough"}) public class GoogleReverseGeocoder extends JsonReverseGeocoder {public static class __CLR4_5_2147147lx1e737x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565572342L,8589935092L,1489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GoogleReverseGeocoder() {
        this(0);__CLR4_5_2147147lx1e737x.R.inc(1448);try{__CLR4_5_2147147lx1e737x.R.inc(1447);
    }finally{__CLR4_5_2147147lx1e737x.R.flushNeeded();}}

    public GoogleReverseGeocoder(int cacheSize) {
        super("http://maps.googleapis.com/maps/api/geocode/json?latlng=%f,%f", cacheSize);__CLR4_5_2147147lx1e737x.R.inc(1450);try{__CLR4_5_2147147lx1e737x.R.inc(1449);
    }finally{__CLR4_5_2147147lx1e737x.R.flushNeeded();}}

    @Override
    protected Address parseAddress(JsonObject json) {try{__CLR4_5_2147147lx1e737x.R.inc(1451);
        __CLR4_5_2147147lx1e737x.R.inc(1452);JsonArray results = json.getJsonArray("results");

        __CLR4_5_2147147lx1e737x.R.inc(1453);if ((((!results.isEmpty())&&(__CLR4_5_2147147lx1e737x.R.iget(1454)!=0|true))||(__CLR4_5_2147147lx1e737x.R.iget(1455)==0&false))) {{
            __CLR4_5_2147147lx1e737x.R.inc(1456);Address address = new Address();

            __CLR4_5_2147147lx1e737x.R.inc(1457);JsonObject result = (JsonObject) results.get(0);
            __CLR4_5_2147147lx1e737x.R.inc(1458);JsonArray components = result.getJsonArray("address_components");

            __CLR4_5_2147147lx1e737x.R.inc(1459);for (JsonObject component : components.getValuesAs(JsonObject.class)) {{

                __CLR4_5_2147147lx1e737x.R.inc(1460);String value = component.getString("short_name");

                __CLR4_5_2147147lx1e737x.R.inc(1461);for (JsonString type : component.getJsonArray("types").getValuesAs(JsonString.class)) {{
                    
                    boolean __CLB4_5_2_bool0=false;__CLR4_5_2147147lx1e737x.R.inc(1462);switch (type.getString()) {
                        case "street_number":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1463);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1464);address.setHouse(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1465);break;
                        case "route":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1466);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1467);address.setStreet(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1468);break;
                        case "locality":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1469);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1470);address.setSettlement(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1471);break;
                        case "administrative_area_level_2":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1472);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1473);address.setDistrict(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1474);break;
                        case "administrative_area_level_1":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1475);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1476);address.setState(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1477);break;
                        case "country":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1478);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1479);address.setCountry(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1480);break;
                        case "postal_code":if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1481);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1482);address.setPostcode(value);
                            __CLR4_5_2147147lx1e737x.R.inc(1483);break;
                        default:if (!__CLB4_5_2_bool0) {__CLR4_5_2147147lx1e737x.R.inc(1484);__CLB4_5_2_bool0=true;}
                            __CLR4_5_2147147lx1e737x.R.inc(1485);continue;
                    }
                    
                    __CLR4_5_2147147lx1e737x.R.inc(1486);break;
                }
            }}

            }__CLR4_5_2147147lx1e737x.R.inc(1487);return address;
        }

        }__CLR4_5_2147147lx1e737x.R.inc(1488);return null;
    }finally{__CLR4_5_2147147lx1e737x.R.flushNeeded();}}

}
