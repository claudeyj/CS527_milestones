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
package org.traccar.geofence;

import java.text.DecimalFormat;
import java.text.ParseException;

import org.traccar.helper.DistanceCalculator;

public class GeofenceCircle extends GeofenceGeometry {public static class __CLR4_5_23cv3cvlx1e1idf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565310562L,8589935092L,4400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double centerLatitude;
    private double centerLongitude;
    private double radius;

    public GeofenceCircle() {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4351);
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}

    public GeofenceCircle(String wkt) throws ParseException {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4352);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4353);fromWkt(wkt);
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}

    public GeofenceCircle(double latitude, double longitude, double radius) {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4354);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4355);this.centerLatitude = latitude;
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4356);this.centerLongitude = longitude;
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4357);this.radius = radius;
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4358);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4359);return DistanceCalculator.distance(centerLatitude, centerLongitude, latitude, longitude) <= radius;
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4360);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4361);String wkt = "";
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4362);wkt = "CIRCLE (";
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4363);wkt += String.valueOf(centerLatitude);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4364);wkt += " ";
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4365);wkt += String.valueOf(centerLongitude);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4366);wkt += ", ";
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4367);DecimalFormat format = new DecimalFormat("0.#");
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4368);wkt += format.format(radius);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4369);wkt += ")";
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4370);return wkt;
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23cv3cvlx1e1idf.R.inc(4371);
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4372);if ((((!wkt.startsWith("CIRCLE"))&&(__CLR4_5_23cv3cvlx1e1idf.R.iget(4373)!=0|true))||(__CLR4_5_23cv3cvlx1e1idf.R.iget(4374)==0&false))) {{
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4375);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23cv3cvlx1e1idf.R.inc(4376);String content = wkt.substring(wkt.indexOf("(") + 1, wkt.indexOf(")"));
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4377);if ((((content == null || content.equals(""))&&(__CLR4_5_23cv3cvlx1e1idf.R.iget(4378)!=0|true))||(__CLR4_5_23cv3cvlx1e1idf.R.iget(4379)==0&false))) {{
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4380);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23cv3cvlx1e1idf.R.inc(4381);String[] commaTokens = content.split(",");
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4382);if ((((commaTokens.length != 2)&&(__CLR4_5_23cv3cvlx1e1idf.R.iget(4383)!=0|true))||(__CLR4_5_23cv3cvlx1e1idf.R.iget(4384)==0&false))) {{
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4385);throw new ParseException("Not valid content", 0);
        }
        }__CLR4_5_23cv3cvlx1e1idf.R.inc(4386);String[] tokens = commaTokens[0].split("\\s");
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4387);if ((((tokens.length != 2)&&(__CLR4_5_23cv3cvlx1e1idf.R.iget(4388)!=0|true))||(__CLR4_5_23cv3cvlx1e1idf.R.iget(4389)==0&false))) {{
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4390);throw new ParseException("Too much or less coordinates", 0);
        }
        }__CLR4_5_23cv3cvlx1e1idf.R.inc(4391);try {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4392);centerLatitude = Double.parseDouble(tokens[0]);
        } catch (NumberFormatException e) {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4393);throw new ParseException(tokens[0] + " is not a double", 0);
        }
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4394);try {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4395);centerLongitude = Double.parseDouble(tokens[1]);
        } catch (NumberFormatException e) {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4396);throw new ParseException(tokens[1] + " is not a double", 0);
        }
        __CLR4_5_23cv3cvlx1e1idf.R.inc(4397);try {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4398);radius = Double.parseDouble(commaTokens[1]);
        } catch (NumberFormatException e) {
            __CLR4_5_23cv3cvlx1e1idf.R.inc(4399);throw new ParseException(commaTokens[1] + " is not a double", 0);
        }
    }finally{__CLR4_5_23cv3cvlx1e1idf.R.flushNeeded();}}
}
