/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
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
package org.traccar;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.traccar.helper.Checksum;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.Position;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

public class WebDataHandler extends BaseDataHandler {public static class __CLR4_5_2114114lwydw8jp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,1391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String url;

    public WebDataHandler(String url) {try{__CLR4_5_2114114lwydw8jp.R.inc(1336);
        __CLR4_5_2114114lwydw8jp.R.inc(1337);this.url = url;
    }finally{__CLR4_5_2114114lwydw8jp.R.flushNeeded();}}

    private static String formatSentence(Position position) {try{__CLR4_5_2114114lwydw8jp.R.inc(1338);

        __CLR4_5_2114114lwydw8jp.R.inc(1339);StringBuilder s = new StringBuilder("$GPRMC,");

        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2114114lwydw8jp.R.inc(1340);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2114114lwydw8jp.R.inc(1341);}};Formatter f = new Formatter(s, Locale.ENGLISH)) {

            __CLR4_5_2114114lwydw8jp.R.inc(1342);Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
            __CLR4_5_2114114lwydw8jp.R.inc(1343);calendar.setTimeInMillis(position.getFixTime().getTime());

            __CLR4_5_2114114lwydw8jp.R.inc(1344);f.format("%1$tH%1$tM%1$tS.%1$tL,A,", calendar);

            __CLR4_5_2114114lwydw8jp.R.inc(1345);double lat = position.getLatitude();
            __CLR4_5_2114114lwydw8jp.R.inc(1346);double lon = position.getLongitude();

            __CLR4_5_2114114lwydw8jp.R.inc(1347);f.format("%02d%07.4f,%c,", (int) Math.abs(lat), Math.abs(lat) % 1 * 60, (((lat < 0 )&&(__CLR4_5_2114114lwydw8jp.R.iget(1348)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1349)==0&false))? 'S' : 'N');
            __CLR4_5_2114114lwydw8jp.R.inc(1350);f.format("%03d%07.4f,%c,", (int) Math.abs(lon), Math.abs(lon) % 1 * 60, (((lon < 0 )&&(__CLR4_5_2114114lwydw8jp.R.iget(1351)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1352)==0&false))? 'W' : 'E');

            __CLR4_5_2114114lwydw8jp.R.inc(1353);f.format("%.2f,%.2f,", position.getSpeed(), position.getCourse());
            __CLR4_5_2114114lwydw8jp.R.inc(1354);f.format("%1$td%1$tm%1$ty,,", calendar);
        }

        __CLR4_5_2114114lwydw8jp.R.inc(1355);s.append(Checksum.nmea(s.toString()));

        __CLR4_5_2114114lwydw8jp.R.inc(1356);return s.toString();
    }finally{__CLR4_5_2114114lwydw8jp.R.flushNeeded();}}

    private String calculateStatus(Position position) {try{__CLR4_5_2114114lwydw8jp.R.inc(1357);
        __CLR4_5_2114114lwydw8jp.R.inc(1358);if ((((position.getAttributes().containsKey(Position.KEY_ALARM))&&(__CLR4_5_2114114lwydw8jp.R.iget(1359)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1360)==0&false))) {{
            __CLR4_5_2114114lwydw8jp.R.inc(1361);return "0xF841"; // STATUS_PANIC_ON
        } }else {__CLR4_5_2114114lwydw8jp.R.inc(1362);if ((((position.getSpeed() < 1.0)&&(__CLR4_5_2114114lwydw8jp.R.iget(1363)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1364)==0&false))) {{
            __CLR4_5_2114114lwydw8jp.R.inc(1365);return "0xF020"; // STATUS_LOCATION
        } }else {{
            __CLR4_5_2114114lwydw8jp.R.inc(1366);return "0xF11C"; // STATUS_MOTION_MOVING
        }
    }}}finally{__CLR4_5_2114114lwydw8jp.R.flushNeeded();}}

    public String formatRequest(Position position) {try{__CLR4_5_2114114lwydw8jp.R.inc(1367);

        __CLR4_5_2114114lwydw8jp.R.inc(1368);Device device = Context.getIdentityManager().getById(position.getDeviceId());

        __CLR4_5_2114114lwydw8jp.R.inc(1369);String request = url
                .replace("{name}", device.getName())
                .replace("{uniqueId}", device.getUniqueId())
                .replace("{deviceId}", String.valueOf(position.getDeviceId()))
                .replace("{protocol}", String.valueOf(position.getProtocol()))
                .replace("{deviceTime}", String.valueOf(position.getDeviceTime().getTime()))
                .replace("{fixTime}", String.valueOf(position.getFixTime().getTime()))
                .replace("{valid}", String.valueOf(position.getValid()))
                .replace("{latitude}", String.valueOf(position.getLatitude()))
                .replace("{longitude}", String.valueOf(position.getLongitude()))
                .replace("{altitude}", String.valueOf(position.getAltitude()))
                .replace("{speed}", String.valueOf(position.getSpeed()))
                .replace("{course}", String.valueOf(position.getCourse()))
                .replace("{statusCode}", calculateStatus(position));

        __CLR4_5_2114114lwydw8jp.R.inc(1370);if ((((position.getAddress() != null)&&(__CLR4_5_2114114lwydw8jp.R.iget(1371)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1372)==0&false))) {{
            __CLR4_5_2114114lwydw8jp.R.inc(1373);try {
                __CLR4_5_2114114lwydw8jp.R.inc(1374);request = request.replace(
                        "{address}", URLEncoder.encode(position.getAddress(), StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException error) {
                __CLR4_5_2114114lwydw8jp.R.inc(1375);Log.warning(error);
            }
        }

        }__CLR4_5_2114114lwydw8jp.R.inc(1376);if ((((request.contains("{attributes}"))&&(__CLR4_5_2114114lwydw8jp.R.iget(1377)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1378)==0&false))) {{
            __CLR4_5_2114114lwydw8jp.R.inc(1379);try {
                __CLR4_5_2114114lwydw8jp.R.inc(1380);String attributes = Context.getObjectMapper().writeValueAsString(position.getAttributes());
                __CLR4_5_2114114lwydw8jp.R.inc(1381);request = request.replace(
                        "{attributes}", URLEncoder.encode(attributes, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException | JsonProcessingException error) {
                __CLR4_5_2114114lwydw8jp.R.inc(1382);Log.warning(error);
            }
        }

        }__CLR4_5_2114114lwydw8jp.R.inc(1383);if ((((request.contains("{gprmc}"))&&(__CLR4_5_2114114lwydw8jp.R.iget(1384)!=0|true))||(__CLR4_5_2114114lwydw8jp.R.iget(1385)==0&false))) {{
            __CLR4_5_2114114lwydw8jp.R.inc(1386);request = request.replace("{gprmc}", formatSentence(position));
        }

        }__CLR4_5_2114114lwydw8jp.R.inc(1387);return request;
    }finally{__CLR4_5_2114114lwydw8jp.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2114114lwydw8jp.R.inc(1388);

        __CLR4_5_2114114lwydw8jp.R.inc(1389);Context.getAsyncHttpClient().prepareGet(formatRequest(position)).execute();

        __CLR4_5_2114114lwydw8jp.R.inc(1390);return position;
    }finally{__CLR4_5_2114114lwydw8jp.R.flushNeeded();}}

}
