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

public class GeofencePolyline extends GeofenceGeometry {public static class __CLR4_5_23tg3tglwydwadx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006a\u0075\u006e\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0054\u0041\u002f\u0043\u0053\u0035\u0032\u0037\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u005f\u0061\u006e\u0073\u0077\u0065\u0072\u002f\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0033\u002f\u0042\u0065\u0061\u0072\u0073\u002d\u0031\u0032\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717383668021L,8589935092L,5006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Coordinate> coordinates;
    private double distance;

    public GeofencePolyline() {try{__CLR4_5_23tg3tglwydwadx.R.inc(4948);
    }finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

    public GeofencePolyline(String wkt, double distance) throws ParseException {try{__CLR4_5_23tg3tglwydwadx.R.inc(4949);
        __CLR4_5_23tg3tglwydwadx.R.inc(4950);fromWkt(wkt);
        __CLR4_5_23tg3tglwydwadx.R.inc(4951);this.distance = distance;
    }finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

    @Override
    public boolean containsPoint(double latitude, double longitude) {try{__CLR4_5_23tg3tglwydwadx.R.inc(4952);
        __CLR4_5_23tg3tglwydwadx.R.inc(4953);for (int i = 1; (((i < coordinates.size())&&(__CLR4_5_23tg3tglwydwadx.R.iget(4954)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4955)==0&false)); i++) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4956);if ((((DistanceCalculator.distanceToLine(
                    latitude, longitude, coordinates.get(i - 1).getLat(), coordinates.get(i - 1).getLon(),
                    coordinates.get(i).getLat(), coordinates.get(i).getLon()) <= distance)&&(__CLR4_5_23tg3tglwydwadx.R.iget(4957)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4958)==0&false))) {{
                __CLR4_5_23tg3tglwydwadx.R.inc(4959);return true;
            }
        }}
        }__CLR4_5_23tg3tglwydwadx.R.inc(4960);return false;
    }finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

    @Override
    public String toWkt() {try{__CLR4_5_23tg3tglwydwadx.R.inc(4961);
        __CLR4_5_23tg3tglwydwadx.R.inc(4962);StringBuilder buf = new StringBuilder();
        __CLR4_5_23tg3tglwydwadx.R.inc(4963);buf.append("LINESTRING (");
        __CLR4_5_23tg3tglwydwadx.R.inc(4964);for (Coordinate coordinate : coordinates) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4965);buf.append(String.valueOf(coordinate.getLat()));
            __CLR4_5_23tg3tglwydwadx.R.inc(4966);buf.append(" ");
            __CLR4_5_23tg3tglwydwadx.R.inc(4967);buf.append(String.valueOf(coordinate.getLon()));
            __CLR4_5_23tg3tglwydwadx.R.inc(4968);buf.append(", ");
        }
        }__CLR4_5_23tg3tglwydwadx.R.inc(4969);return buf.substring(0, buf.length() - 2) + ")";
    }finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

    @Override
    public void fromWkt(String wkt) throws ParseException {try{__CLR4_5_23tg3tglwydwadx.R.inc(4970);
        __CLR4_5_23tg3tglwydwadx.R.inc(4971);if ((((coordinates == null)&&(__CLR4_5_23tg3tglwydwadx.R.iget(4972)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4973)==0&false))) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4974);coordinates = new ArrayList<>();
        } }else {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4975);coordinates.clear();
        }

        }__CLR4_5_23tg3tglwydwadx.R.inc(4976);if ((((!wkt.startsWith("LINESTRING"))&&(__CLR4_5_23tg3tglwydwadx.R.iget(4977)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4978)==0&false))) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4979);throw new ParseException("Mismatch geometry type", 0);
        }
        }__CLR4_5_23tg3tglwydwadx.R.inc(4980);String content = wkt.substring(wkt.indexOf("(") + 1, wkt.indexOf(")"));
        __CLR4_5_23tg3tglwydwadx.R.inc(4981);if ((((content.isEmpty())&&(__CLR4_5_23tg3tglwydwadx.R.iget(4982)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4983)==0&false))) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4984);throw new ParseException("No content", 0);
        }
        }__CLR4_5_23tg3tglwydwadx.R.inc(4985);String[] commaTokens = content.split(",");
        __CLR4_5_23tg3tglwydwadx.R.inc(4986);if ((((commaTokens.length < 2)&&(__CLR4_5_23tg3tglwydwadx.R.iget(4987)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4988)==0&false))) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4989);throw new ParseException("Not valid content", 0);
        }

        }__CLR4_5_23tg3tglwydwadx.R.inc(4990);for (String commaToken : commaTokens) {{
            __CLR4_5_23tg3tglwydwadx.R.inc(4991);String[] tokens = commaToken.trim().split("\\s");
            __CLR4_5_23tg3tglwydwadx.R.inc(4992);if ((((tokens.length != 2)&&(__CLR4_5_23tg3tglwydwadx.R.iget(4993)!=0|true))||(__CLR4_5_23tg3tglwydwadx.R.iget(4994)==0&false))) {{
                __CLR4_5_23tg3tglwydwadx.R.inc(4995);throw new ParseException("Here must be two coordinates: " + commaToken, 0);
            }
            }__CLR4_5_23tg3tglwydwadx.R.inc(4996);Coordinate coordinate = new Coordinate();
            __CLR4_5_23tg3tglwydwadx.R.inc(4997);try {
                __CLR4_5_23tg3tglwydwadx.R.inc(4998);coordinate.setLat(Double.parseDouble(tokens[0]));
            } catch (NumberFormatException e) {
                __CLR4_5_23tg3tglwydwadx.R.inc(4999);throw new ParseException(tokens[0] + " is not a double", 0);
            }
            __CLR4_5_23tg3tglwydwadx.R.inc(5000);try {
                __CLR4_5_23tg3tglwydwadx.R.inc(5001);coordinate.setLon(Double.parseDouble(tokens[1]));
            } catch (NumberFormatException e) {
                __CLR4_5_23tg3tglwydwadx.R.inc(5002);throw new ParseException(tokens[1] + " is not a double", 0);
            }
            __CLR4_5_23tg3tglwydwadx.R.inc(5003);coordinates.add(coordinate);
        }

    }}finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

    public void setDistance(double distance) {try{__CLR4_5_23tg3tglwydwadx.R.inc(5004);
        __CLR4_5_23tg3tglwydwadx.R.inc(5005);this.distance = distance;
    }finally{__CLR4_5_23tg3tglwydwadx.R.flushNeeded();}}

}
