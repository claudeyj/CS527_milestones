/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2014 - 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.traccar.helper.Log;
import org.w3c.dom.Document;

public class NominatimReverseGeocoder extends JsonReverseGeocoder {public static class __CLR4_5_212c12clx1dh0ms{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0036\u0038\u0038\u0038\u0033\u0039\u0034\u0039\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717564355125L,8589935092L,1424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NominatimReverseGeocoder() {
        this("http://nominatim.openstreetmap.org/reverse");__CLR4_5_212c12clx1dh0ms.R.inc(1381);try{__CLR4_5_212c12clx1dh0ms.R.inc(1380);
    }finally{__CLR4_5_212c12clx1dh0ms.R.flushNeeded();}}
    
    public NominatimReverseGeocoder(String url) {
        super(url + "?format=json&lat=%f&lon=%f&zoom=18&addressdetails=1");__CLR4_5_212c12clx1dh0ms.R.inc(1383);try{__CLR4_5_212c12clx1dh0ms.R.inc(1382);
    }finally{__CLR4_5_212c12clx1dh0ms.R.flushNeeded();}}

    @Override
    protected Address parseAddress(JsonObject json) {try{__CLR4_5_212c12clx1dh0ms.R.inc(1384);
        __CLR4_5_212c12clx1dh0ms.R.inc(1385);JsonObject result = json.getJsonObject("address");

        __CLR4_5_212c12clx1dh0ms.R.inc(1386);if ((((result != null)&&(__CLR4_5_212c12clx1dh0ms.R.iget(1387)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1388)==0&false))) {{
            __CLR4_5_212c12clx1dh0ms.R.inc(1389);Address address = new Address();

            __CLR4_5_212c12clx1dh0ms.R.inc(1390);if ((((result.containsKey("house_number"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1391)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1392)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1393);address.setHouse(result.getString("house_number"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1394);if ((((result.containsKey("road"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1395)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1396)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1397);address.setStreet(result.getString("road"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1398);if ((((result.containsKey("village"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1399)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1400)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1401);address.setSettlement(result.getString("village"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1402);if ((((result.containsKey("city"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1403)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1404)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1405);address.setSettlement(result.getString("city"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1406);if ((((result.containsKey("state_district"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1407)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1408)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1409);address.setDistrict(result.getString("state_district"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1410);if ((((result.containsKey("state"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1411)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1412)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1413);address.setState(result.getString("state"));
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1414);if ((((result.containsKey("country_code"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1415)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1416)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1417);address.setCountry(result.getString("country_code").toUpperCase());
            }
            }__CLR4_5_212c12clx1dh0ms.R.inc(1418);if ((((result.containsKey("postcode"))&&(__CLR4_5_212c12clx1dh0ms.R.iget(1419)!=0|true))||(__CLR4_5_212c12clx1dh0ms.R.iget(1420)==0&false))) {{
                __CLR4_5_212c12clx1dh0ms.R.inc(1421);address.setPostcode(result.getString("postcode"));
            }

            }__CLR4_5_212c12clx1dh0ms.R.inc(1422);return address;
        }

        }__CLR4_5_212c12clx1dh0ms.R.inc(1423);return null;
    }finally{__CLR4_5_212c12clx1dh0ms.R.flushNeeded();}}

}
