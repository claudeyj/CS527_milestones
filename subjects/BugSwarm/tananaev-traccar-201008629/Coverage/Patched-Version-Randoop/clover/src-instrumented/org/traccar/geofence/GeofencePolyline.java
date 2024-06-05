/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2016 Anton Tananaev (anton@traccar.org)
 * Copyright 2016 Andrey Kunitsyn (andrey@traccar.org)
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

import java.text.ParseException;
import java.util.ArrayList;

import org.traccar.helper.DistanceCalculator;

public class GeofencePolyline extends GeofenceGeometry {public static class __CLR4_5_23hh3hhlx1e0er1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0074\u0061\u006e\u0061\u006e\u0061\u0065\u0076\u002d\u0074\u0072\u0061\u0063\u0063\u0061\u0072\u002d\u0032\u0030\u0031\u0030\u0030\u0038\u0036\u0032\u0039\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717565259035L,8589935092L,4575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Coordinate> coordinates;
    private double distance;

    public GeofencePolyline() {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4517);
    }finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

    public GeofencePolyline(String wkt, double distance) throws ParseException {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4518);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4519);fromWkt(wkt);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4520);this.distance = distance;
    }finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4521);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4522);for (int i = 1; (((i < coordinates.size())&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4523)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4524)==0&false)); i++) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4525);if ((((DistanceCalculator.distanceToLine(
                    latitude, longitude, coordinates.get(i - 1).getLat(), coordinates.get(i - 1).getLon(),
                    coordinates.get(i).getLat(), coordinates.get(i).getLon()) <= distance)&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4526)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4527)==0&false))) {{
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4528);return true;
            }
        }}
        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4529);return false;
    }finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4530);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4531);StringBuilder buf = new StringBuilder();
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4532);buf.append("LINESTRING (");
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4533);for (Coordinate coordinate : coordinates) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4534);buf.append(String.valueOf(coordinate.getLat()));
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4535);buf.append(" ");
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4536);buf.append(String.valueOf(coordinate.getLon()));
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4537);buf.append(", ");
        }
        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4538);return buf.substring(0, buf.length() - 2) + ")";
    }finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4539);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4540);if ((((coordinates == null)&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4541)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4542)==0&false))) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4543);coordinates = new ArrayList<>();
        } }else {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4544);coordinates.clear();
        }

        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4545);if ((((!wkt.startsWith("LINESTRING"))&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4546)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4547)==0&false))) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4548);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4549);String content = wkt.substring(wkt.indexOf("(") + 1, wkt.indexOf(")"));
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4550);if ((((content.isEmpty())&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4551)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4552)==0&false))) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4553);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4554);String[] commaTokens = content.split(",");
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4555);if ((((commaTokens.length < 2)&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4556)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4557)==0&false))) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4558);throw new ParseException("Not valid content", 0);
        }

        }__CLR4_5_23hh3hhlx1e0er1.R.inc(4559);for (String commaToken : commaTokens) {{
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4560);String[] tokens = commaToken.trim().split("\\s");
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4561);if ((((tokens.length != 2)&&(__CLR4_5_23hh3hhlx1e0er1.R.iget(4562)!=0|true))||(__CLR4_5_23hh3hhlx1e0er1.R.iget(4563)==0&false))) {{
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4564);throw new ParseException("Here must be two coordinates: " + commaToken, 0);
            }
            }__CLR4_5_23hh3hhlx1e0er1.R.inc(4565);Coordinate coordinate = new Coordinate();
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4566);try {
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4567);coordinate.setLat(Double.parseDouble(tokens[0]));
            } catch (NumberFormatException e) {
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4568);throw new ParseException(tokens[0] + " is not a double", 0);
            }
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4569);try {
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4570);coordinate.setLon(Double.parseDouble(tokens[1]));
            } catch (NumberFormatException e) {
                __CLR4_5_23hh3hhlx1e0er1.R.inc(4571);throw new ParseException(tokens[1] + " is not a double", 0);
            }
            __CLR4_5_23hh3hhlx1e0er1.R.inc(4572);coordinates.add(coordinate);
        }

    }}finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

    public void setDistance(double distance) {try{__CLR4_5_23hh3hhlx1e0er1.R.inc(4573);
        __CLR4_5_23hh3hhlx1e0er1.R.inc(4574);this.distance = distance;
    }finally{__CLR4_5_23hh3hhlx1e0er1.R.flushNeeded();}}

}
