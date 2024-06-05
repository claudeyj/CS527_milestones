/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
package org.traccar.model;

import java.text.ParseException;

import org.traccar.Context;
import org.traccar.database.QueryIgnore;
import org.traccar.geofence.GeofenceCircle;
import org.traccar.geofence.GeofenceGeometry;
import org.traccar.geofence.GeofencePolygon;
import org.traccar.geofence.GeofencePolyline;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Geofence extends ExtendedModel {public static class __CLR4_5_24v14v1lwye3y04{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,6335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE_GEOFENCE_CILCLE = "geofenceCircle";
    public static final String TYPE_GEOFENCE_POLYGON = "geofencePolygon";
    public static final String TYPE_GEOFENCE_POLYLINE = "geofencePolyline";

    private String name;

    public String getName() {try{__CLR4_5_24v14v1lwye3y04.R.inc(6301);
        __CLR4_5_24v14v1lwye3y04.R.inc(6302);return name;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_24v14v1lwye3y04.R.inc(6303);
        __CLR4_5_24v14v1lwye3y04.R.inc(6304);this.name = name;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    private String description;

    public String getDescription() {try{__CLR4_5_24v14v1lwye3y04.R.inc(6305);
        __CLR4_5_24v14v1lwye3y04.R.inc(6306);return description;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_5_24v14v1lwye3y04.R.inc(6307);
        __CLR4_5_24v14v1lwye3y04.R.inc(6308);this.description = description;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    private String area;

    public String getArea() {try{__CLR4_5_24v14v1lwye3y04.R.inc(6309);
        __CLR4_5_24v14v1lwye3y04.R.inc(6310);return area;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    public void setArea(String area) throws ParseException {try{__CLR4_5_24v14v1lwye3y04.R.inc(6311);

        __CLR4_5_24v14v1lwye3y04.R.inc(6312);if ((((area.startsWith("CIRCLE"))&&(__CLR4_5_24v14v1lwye3y04.R.iget(6313)!=0|true))||(__CLR4_5_24v14v1lwye3y04.R.iget(6314)==0&false))) {{
            __CLR4_5_24v14v1lwye3y04.R.inc(6315);geometry = new GeofenceCircle(area);
        } }else {__CLR4_5_24v14v1lwye3y04.R.inc(6316);if ((((area.startsWith("POLYGON"))&&(__CLR4_5_24v14v1lwye3y04.R.iget(6317)!=0|true))||(__CLR4_5_24v14v1lwye3y04.R.iget(6318)==0&false))) {{
            __CLR4_5_24v14v1lwye3y04.R.inc(6319);geometry = new GeofencePolygon(area);
        } }else {__CLR4_5_24v14v1lwye3y04.R.inc(6320);if ((((area.startsWith("LINESTRING"))&&(__CLR4_5_24v14v1lwye3y04.R.iget(6321)!=0|true))||(__CLR4_5_24v14v1lwye3y04.R.iget(6322)==0&false))) {{
            __CLR4_5_24v14v1lwye3y04.R.inc(6323);geometry = new GeofencePolyline(area, Context.getConfig().getDouble("geofence.polylineDistance", 25));
        } }else {{
            __CLR4_5_24v14v1lwye3y04.R.inc(6324);throw new ParseException("Unknown geometry type", 0);
        }

        }}}__CLR4_5_24v14v1lwye3y04.R.inc(6325);this.area = area;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    private GeofenceGeometry geometry;

    @QueryIgnore
    @JsonIgnore
    public GeofenceGeometry getGeometry() {try{__CLR4_5_24v14v1lwye3y04.R.inc(6326);
        __CLR4_5_24v14v1lwye3y04.R.inc(6327);return geometry;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    @QueryIgnore
    @JsonIgnore
    public void setGeometry(GeofenceGeometry geometry) {try{__CLR4_5_24v14v1lwye3y04.R.inc(6328);
        __CLR4_5_24v14v1lwye3y04.R.inc(6329);area = geometry.toWkt();
        __CLR4_5_24v14v1lwye3y04.R.inc(6330);this.geometry = geometry;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    private long calendarId;

    public long getCalendarId() {try{__CLR4_5_24v14v1lwye3y04.R.inc(6331);
        __CLR4_5_24v14v1lwye3y04.R.inc(6332);return calendarId;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}

    public void setCalendarId(long calendarId) {try{__CLR4_5_24v14v1lwye3y04.R.inc(6333);
        __CLR4_5_24v14v1lwye3y04.R.inc(6334);this.calendarId = calendarId;
    }finally{__CLR4_5_24v14v1lwye3y04.R.flushNeeded();}}
}
