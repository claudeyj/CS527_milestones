/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
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

import org.traccar.helper.Log;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class JsonReverseGeocoder implements ReverseGeocoder {public static class __CLR4_5_215d15dlx1e34rx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,1530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String url;

    private Map<Map.Entry<Double, Double>, String> cache;

    public JsonReverseGeocoder(String url, final int cacheSize) {try{__CLR4_5_215d15dlx1e34rx.R.inc(1489);
        __CLR4_5_215d15dlx1e34rx.R.inc(1490);this.url = url;
        __CLR4_5_215d15dlx1e34rx.R.inc(1491);if ((((cacheSize > 0)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1492)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1493)==0&false))) {{
            __CLR4_5_215d15dlx1e34rx.R.inc(1494);this.cache = new LinkedHashMap<Map.Entry<Double, Double>, String>() {
                protected boolean removeEldestEntry(Map.Entry eldest) {try{__CLR4_5_215d15dlx1e34rx.R.inc(1495);
                    __CLR4_5_215d15dlx1e34rx.R.inc(1496);return size() > cacheSize;
                }finally{__CLR4_5_215d15dlx1e34rx.R.flushNeeded();}}
            };
        }
    }}finally{__CLR4_5_215d15dlx1e34rx.R.flushNeeded();}}

    @Override
    public String getAddress(AddressFormat format, double latitude, double longitude) {try{__CLR4_5_215d15dlx1e34rx.R.inc(1497);

        __CLR4_5_215d15dlx1e34rx.R.inc(1498);if ((((cache != null)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1499)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1500)==0&false))) {{
            __CLR4_5_215d15dlx1e34rx.R.inc(1501);String cachedAddress = cache.get(new AbstractMap.SimpleImmutableEntry<>(latitude, longitude));
            __CLR4_5_215d15dlx1e34rx.R.inc(1502);if ((((cachedAddress != null)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1503)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1504)==0&false))) {{
                __CLR4_5_215d15dlx1e34rx.R.inc(1505);return cachedAddress;
            }
        }}

        }__CLR4_5_215d15dlx1e34rx.R.inc(1506);try {
            __CLR4_5_215d15dlx1e34rx.R.inc(1507);HttpURLConnection conn = (HttpURLConnection) new URL(String.format(url, latitude, longitude)).openConnection();
            __CLR4_5_215d15dlx1e34rx.R.inc(1508);conn.setRequestProperty("Connection", "close"); // don't keep-alive connections
            __CLR4_5_215d15dlx1e34rx.R.inc(1509);try {
                __CLR4_5_215d15dlx1e34rx.R.inc(1510);InputStreamReader streamReader = new InputStreamReader(conn.getInputStream());
                class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_215d15dlx1e34rx.R.inc(1511);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_215d15dlx1e34rx.R.inc(1512);}};JsonReader reader = Json.createReader(streamReader)) {
                    __CLR4_5_215d15dlx1e34rx.R.inc(1513);Address address = parseAddress(reader.readObject());
                    __CLR4_5_215d15dlx1e34rx.R.inc(1514);while ((((streamReader.read() > 0)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1515)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1516)==0&false))){__CLR4_5_215d15dlx1e34rx.R.inc(1517);; // make sure we reached the end
                    }__CLR4_5_215d15dlx1e34rx.R.inc(1518);if ((((address != null)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1519)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1520)==0&false))) {{
                        __CLR4_5_215d15dlx1e34rx.R.inc(1521);String formattedAddress = format.format(address);

                        __CLR4_5_215d15dlx1e34rx.R.inc(1522);if ((((cache != null)&&(__CLR4_5_215d15dlx1e34rx.R.iget(1523)!=0|true))||(__CLR4_5_215d15dlx1e34rx.R.iget(1524)==0&false))) {{
                            __CLR4_5_215d15dlx1e34rx.R.inc(1525);cache.put(new AbstractMap.SimpleImmutableEntry<>(latitude, longitude), formattedAddress);
                        }

                        }__CLR4_5_215d15dlx1e34rx.R.inc(1526);return formattedAddress;
                    }
                }}
            } finally {
                __CLR4_5_215d15dlx1e34rx.R.inc(1527);conn.disconnect();
            }
        } catch(Exception error) {
            __CLR4_5_215d15dlx1e34rx.R.inc(1528);Log.warning(error);
        }

        __CLR4_5_215d15dlx1e34rx.R.inc(1529);return null;
    }finally{__CLR4_5_215d15dlx1e34rx.R.flushNeeded();}}

    protected abstract Address parseAddress(JsonObject json);

}
