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

public class GeofenceCircle extends GeofenceGeometry {public static class __CLR4_5_23ou3oulwye3wnd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717384023382L,8589935092L,4831,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double centerLatitude;
    private double centerLongitude;
    private double radius;

    public GeofenceCircle() {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4782);
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}

    public GeofenceCircle(String wkt) throws ParseException {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4783);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4784);fromWkt(wkt);
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}

    public GeofenceCircle(double latitude, double longitude, double radius) {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4785);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4786);this.centerLatitude = latitude;
        __CLR4_5_23ou3oulwye3wnd.R.inc(4787);this.centerLongitude = longitude;
        __CLR4_5_23ou3oulwye3wnd.R.inc(4788);this.radius = radius;
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4789);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4790);return DistanceCalculator.distance(centerLatitude, centerLongitude, latitude, longitude) <= radius;
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4791);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4792);String wkt = "";
        __CLR4_5_23ou3oulwye3wnd.R.inc(4793);wkt = "CIRCLE (";
        __CLR4_5_23ou3oulwye3wnd.R.inc(4794);wkt += String.valueOf(centerLatitude);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4795);wkt += " ";
        __CLR4_5_23ou3oulwye3wnd.R.inc(4796);wkt += String.valueOf(centerLongitude);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4797);wkt += ", ";
        __CLR4_5_23ou3oulwye3wnd.R.inc(4798);DecimalFormat format = new DecimalFormat("0.#");
        __CLR4_5_23ou3oulwye3wnd.R.inc(4799);wkt += format.format(radius);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4800);wkt += ")";
        __CLR4_5_23ou3oulwye3wnd.R.inc(4801);return wkt;
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23ou3oulwye3wnd.R.inc(4802);
        __CLR4_5_23ou3oulwye3wnd.R.inc(4803);if ((((!wkt.startsWith("CIRCLE"))&&(__CLR4_5_23ou3oulwye3wnd.R.iget(4804)!=0|true))||(__CLR4_5_23ou3oulwye3wnd.R.iget(4805)==0&false))) {{
            __CLR4_5_23ou3oulwye3wnd.R.inc(4806);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23ou3oulwye3wnd.R.inc(4807);String content = wkt.substring(wkt.indexOf("(") + 1, wkt.indexOf(")"));
        __CLR4_5_23ou3oulwye3wnd.R.inc(4808);if ((((content == null || content.equals(""))&&(__CLR4_5_23ou3oulwye3wnd.R.iget(4809)!=0|true))||(__CLR4_5_23ou3oulwye3wnd.R.iget(4810)==0&false))) {{
            __CLR4_5_23ou3oulwye3wnd.R.inc(4811);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23ou3oulwye3wnd.R.inc(4812);String[] commaTokens = content.split(",");
        __CLR4_5_23ou3oulwye3wnd.R.inc(4813);if ((((commaTokens.length != 2)&&(__CLR4_5_23ou3oulwye3wnd.R.iget(4814)!=0|true))||(__CLR4_5_23ou3oulwye3wnd.R.iget(4815)==0&false))) {{
            __CLR4_5_23ou3oulwye3wnd.R.inc(4816);throw new ParseException("Not valid content", 0);
        }
        }__CLR4_5_23ou3oulwye3wnd.R.inc(4817);String[] tokens = commaTokens[0].split("\\s");
        __CLR4_5_23ou3oulwye3wnd.R.inc(4818);if ((((tokens.length != 2)&&(__CLR4_5_23ou3oulwye3wnd.R.iget(4819)!=0|true))||(__CLR4_5_23ou3oulwye3wnd.R.iget(4820)==0&false))) {{
            __CLR4_5_23ou3oulwye3wnd.R.inc(4821);throw new ParseException("Too much or less coordinates", 0);
        }
        }__CLR4_5_23ou3oulwye3wnd.R.inc(4822);try {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4823);centerLatitude = Double.parseDouble(tokens[0]);
        } catch (NumberFormatException e) {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4824);throw new ParseException(tokens[0] + " is not a double", 0);
        }
        __CLR4_5_23ou3oulwye3wnd.R.inc(4825);try {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4826);centerLongitude = Double.parseDouble(tokens[1]);
        } catch (NumberFormatException e) {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4827);throw new ParseException(tokens[1] + " is not a double", 0);
        }
        __CLR4_5_23ou3oulwye3wnd.R.inc(4828);try {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4829);radius = Double.parseDouble(commaTokens[1]);
        } catch (NumberFormatException e) {
            __CLR4_5_23ou3oulwye3wnd.R.inc(4830);throw new ParseException(commaTokens[1] + " is not a double", 0);
        }
    }finally{__CLR4_5_23ou3oulwye3wnd.R.flushNeeded();}}
}
