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
package org.traccar;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
import org.traccar.helper.Crc;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

public class WebDataHandler extends BaseDataHandler {public static class __CLR4_5_2j0j0lx1e33sa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0038\u0032\u0038\u0033\u0039\u0037\u0035\u0035\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565387536L,8589935092L,720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String url;

    public WebDataHandler(String url) {try{__CLR4_5_2j0j0lx1e33sa.R.inc(684);
        __CLR4_5_2j0j0lx1e33sa.R.inc(685);this.url = url;
    }finally{__CLR4_5_2j0j0lx1e33sa.R.flushNeeded();}}
    
    private static String formatSentence(Position position) {try{__CLR4_5_2j0j0lx1e33sa.R.inc(686);

        __CLR4_5_2j0j0lx1e33sa.R.inc(687);StringBuilder s = new StringBuilder("$GPRMC,");

        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_2j0j0lx1e33sa.R.inc(688);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_2j0j0lx1e33sa.R.inc(689);}};Formatter f = new Formatter(s, Locale.ENGLISH)) {

            __CLR4_5_2j0j0lx1e33sa.R.inc(690);Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
            __CLR4_5_2j0j0lx1e33sa.R.inc(691);calendar.setTimeInMillis(position.getFixTime().getTime());
            
            __CLR4_5_2j0j0lx1e33sa.R.inc(692);f.format("%1$tH%1$tM%1$tS.%1$tL,A,", calendar);
            
            __CLR4_5_2j0j0lx1e33sa.R.inc(693);double lat = position.getLatitude();
            __CLR4_5_2j0j0lx1e33sa.R.inc(694);double lon = position.getLongitude();
            __CLR4_5_2j0j0lx1e33sa.R.inc(695);f.format("%02d%07.4f,%c,", (int) Math.abs(lat), Math.abs(lat) % 1 * 60, (((lat < 0 )&&(__CLR4_5_2j0j0lx1e33sa.R.iget(696)!=0|true))||(__CLR4_5_2j0j0lx1e33sa.R.iget(697)==0&false))? 'S' : 'N');
            __CLR4_5_2j0j0lx1e33sa.R.inc(698);f.format("%03d%07.4f,%c,", (int) Math.abs(lon), Math.abs(lon) % 1 * 60, (((lon < 0 )&&(__CLR4_5_2j0j0lx1e33sa.R.iget(699)!=0|true))||(__CLR4_5_2j0j0lx1e33sa.R.iget(700)==0&false))? 'W' : 'E');
            
            __CLR4_5_2j0j0lx1e33sa.R.inc(701);f.format("%.2f,%.2f,", position.getSpeed(), position.getCourse());
            __CLR4_5_2j0j0lx1e33sa.R.inc(702);f.format("%1$td%1$tm%1$ty,,", calendar);
        }

        __CLR4_5_2j0j0lx1e33sa.R.inc(703);s.append(Crc.nmeaChecksum(s.toString()));

        __CLR4_5_2j0j0lx1e33sa.R.inc(704);return s.toString();
    }finally{__CLR4_5_2j0j0lx1e33sa.R.flushNeeded();}}

    private String calculateStatus(Position position) {try{__CLR4_5_2j0j0lx1e33sa.R.inc(705);
        __CLR4_5_2j0j0lx1e33sa.R.inc(706);if ((((position.getAttributes().containsKey(Event.KEY_ALARM))&&(__CLR4_5_2j0j0lx1e33sa.R.iget(707)!=0|true))||(__CLR4_5_2j0j0lx1e33sa.R.iget(708)==0&false))) {{
            __CLR4_5_2j0j0lx1e33sa.R.inc(709);return "0xF841"; // STATUS_PANIC_ON
        } }else {__CLR4_5_2j0j0lx1e33sa.R.inc(710);if ((((position.getSpeed() < 1.0)&&(__CLR4_5_2j0j0lx1e33sa.R.iget(711)!=0|true))||(__CLR4_5_2j0j0lx1e33sa.R.iget(712)==0&false))) {{
            __CLR4_5_2j0j0lx1e33sa.R.inc(713);return "0xF020"; // STATUS_LOCATION
        } }else {{
            __CLR4_5_2j0j0lx1e33sa.R.inc(714);return "0xF11C"; // STATUS_MOTION_MOVING
        }
    }}}finally{__CLR4_5_2j0j0lx1e33sa.R.flushNeeded();}}

    @Override
    protected Position handlePosition(Position position) {try{__CLR4_5_2j0j0lx1e33sa.R.inc(715);
        
        __CLR4_5_2j0j0lx1e33sa.R.inc(716);Device device = Context.getIdentityManager().getDeviceById(position.getDeviceId());
        
        __CLR4_5_2j0j0lx1e33sa.R.inc(717);String request = url
                .replace("{uniqueId}", device.getUniqueId())
                .replace("{deviceId}", String.valueOf(device.getId()))
                .replace("{fixTime}", String.valueOf(position.getFixTime().getTime()))
                .replace("{latitude}", String.valueOf(position.getLatitude()))
                .replace("{longitude}", String.valueOf(position.getLongitude()))
                .replace("{gprmc}", formatSentence(position))
                .replace("{statusCode}", calculateStatus(position));
        
        __CLR4_5_2j0j0lx1e33sa.R.inc(718);Context.getAsyncHttpClient().prepareGet(request).execute();

        __CLR4_5_2j0j0lx1e33sa.R.inc(719);return position;
    }finally{__CLR4_5_2j0j0lx1e33sa.R.flushNeeded();}}

}
